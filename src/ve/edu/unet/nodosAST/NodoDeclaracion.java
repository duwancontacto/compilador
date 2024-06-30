package ve.edu.unet.nodosAST;

public class NodoDeclaracion extends NodoBase{
    private tipoDecl tipo;
    private String id;
    private int size = 0;

    public NodoDeclaracion(tipoDecl tipo, String id){
        super();
        this.tipo = tipo;
        this.id = id;
        this.size = 0;
    }

    public NodoDeclaracion(tipoDecl tipo, String id, int size){
        super();
        this.tipo = tipo;
        this.id = id;
        this.size = size;
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
