package ve.edu.unet.nodosAST;

public class NodoLeer extends NodoBase {
	private String id;
	private NodoBase index;

	public NodoLeer(String identificador) {
		super();
		this.id = identificador;
	}

	public NodoLeer(String identificador, NodoBase index) {
		super();
		this.id = identificador;
		this.index = index;
	}

	public NodoLeer() {
		super();
		id="";
	}

	public String getIdentificador() {
		return id;
	}

	public void setExpresion(String identificador) {
		this.id = identificador;
	}

	public NodoBase getIndex() {
		return index;
	}

	public void setIndex(NodoBase index) {
		this.index = index;
	}
}
