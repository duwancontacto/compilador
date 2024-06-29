package ve.edu.unet;

import ve.edu.unet.nodosAST.tipoDecl;

public class RegistroSimbolo {
	private String identificador;
	private int NumLinea;
	private int DireccionMemoria;
	private tipoDecl tipo;
	
	public RegistroSimbolo(String identificador, int numLinea,
			int direccionMemoria, tipoDecl tipo) {
		super();
		this.identificador = identificador;
		NumLinea = numLinea;
		DireccionMemoria = direccionMemoria;
		this.tipo = tipo;
	}

	public String getIdentificador() {
		return identificador;
	}

	public int getNumLinea() {
		return NumLinea;
	}

	public int getDireccionMemoria() {
		return DireccionMemoria;
	}

	public tipoDecl getTipo() {return tipo; }

	public void setDireccionMemoria(int direccionMemoria) {
		DireccionMemoria = direccionMemoria;
	}
}
