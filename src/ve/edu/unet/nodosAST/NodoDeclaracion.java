package ve.edu.unet.nodosAST;

public class NodoDeclaracion extends NodoBase{
    private tipoDecl tipo;
    private String id;

    public NodoDeclaracion(tipoDecl tipo, String id){
        super();
        this.tipo = tipo;
        this.id = id;
    }

    public NodoDeclaracion() {
        this.tipo = null;
        this.id = null;
    }

    public tipoDecl getTipo() {
        return tipo;
    }

    public String getId() {
        return id;
    }

    public void setTipo(tipoDecl tipo) {
        this.tipo = tipo;
    }

    public void setId(String id) {
        this.id = id;
    }
}
