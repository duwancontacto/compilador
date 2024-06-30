package ve.edu.unet.nodosAST;

public class NodoAsignacion extends NodoBase {
	private String identificador;
	private NodoBase expresion;
	private NodoBase index = null;
	
	public NodoAsignacion(String identificador, NodoBase expresion) {
		super();
		this.identificador = identificador;
		this.expresion = expresion;
	}

	public NodoAsignacion(String identificador, NodoBase expresion, NodoBase index) {
		super();
		this.identificador = identificador;
		this.expresion = expresion;
		this.index = index;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public NodoBase getExpresion() {
		return expresion;
	}

	public void setExpresion(NodoBase expresion) {
		this.expresion = expresion;
	}
	
	public NodoBase getIndex() {
		return index;
	}

	public void setIndex(NodoBase index) {
		this.index = index;
	}
	
}
