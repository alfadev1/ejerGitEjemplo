
package ejergitejemplo;

/**
 *
 * @author omi
 */
public class Producto {
    private int codigo;
    private String descripcion;

    public Producto(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
