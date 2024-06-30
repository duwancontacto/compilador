package ve.edu.unet;

import ve.edu.unet.nodosAST.*;

import java.util.*;




public class TablaSimbolos {
	private HashMap<String, RegistroSimbolo> tabla;
	private int direccion;  //Contador de las localidades de memoria asignadas a la tabla
	
	public TablaSimbolos() {
		super();
		tabla = new HashMap<String, RegistroSimbolo>();
		direccion=0;
	}

	public void cargarTabla(NodoBase raiz){
		while (raiz != null) {
	    /* Hago el recorrido recursivo */
	    if (raiz instanceof  NodoIf){
	    	cargarTabla(((NodoIf)raiz).getParteThen());
	    	if(((NodoIf)raiz).getParteElse()!=null){
	    		cargarTabla(((NodoIf)raiz).getParteElse());
	    	}
	    }
	    else if (raiz instanceof NodoRepeat){
	    	cargarTabla(((NodoRepeat)raiz).getCuerpo());
	    }
		else if (raiz instanceof NodoFor){
			cargarTabla(((NodoFor)raiz).getCuerpo());
		}
		else if(raiz instanceof NodoDeclaracion){
			NodoDeclaracion nodo = (NodoDeclaracion)raiz;
			if (nodo.getSize() == 0)
				InsertarSimbolo(nodo.getId(), -1, nodo.getTipo());
			else
				InsertarSimbolo(nodo.getId(), -1, nodo.getTipo(), nodo.getSize());
		}

	    raiz = raiz.getHermanoDerecha();
	  }
	}
	
	//true es nuevo no existe se insertara, false ya existe NO se vuelve a insertar
	public boolean InsertarSimbolo(String identificador, int numLinea, tipoDecl tipo){
		RegistroSimbolo simbolo;
		if(tabla.containsKey(identificador)){
			return false;
		}else{
			simbolo= new RegistroSimbolo(identificador,numLinea,direccion++, tipo);
			tabla.put(identificador,simbolo);
			return true;
		}
	}

	//agregar vectores a tabla de simbolos
	public boolean InsertarSimbolo(String identificador, int numLinea, tipoDecl tipo, int size){
		RegistroSimbolo simbolo;
		if(tabla.containsKey(identificador)){
			return false;
		}else{
			simbolo= new RegistroSimbolo(identificador,numLinea,direccion, tipo);
			direccion += size;
			tabla.put(identificador,simbolo);
			return true;
		}
	}
	
	public RegistroSimbolo BuscarSimbolo(String identificador){
		RegistroSimbolo simbolo=(RegistroSimbolo)tabla.get(identificador);
		return simbolo;
	}
	
	public void ImprimirClaves(){
		System.out.println("*** Tabla de Simbolos ***");
		for( Iterator <String>it = tabla.keySet().iterator(); it.hasNext();) { 
            String s = (String)it.next();
	    System.out.println("Consegui Key: "+s+" con direccion: " + BuscarSimbolo(s).getDireccionMemoria());
		}
	}

	public int getDireccion(String Clave){
		return BuscarSimbolo(Clave).getDireccionMemoria();
	}
	
	/*
	 * TODO:
	 * 1. Crear lista con las lineas de codigo donde la variable es usada.
	 * */
}
