//Ejemplo 1.
public class Caja <T> {
    
    private T contenido;

    public Caja(T contenido){
        this.contenido = contenido;

    }

    public T getContenido() {
        return contenido;
    }

    public void setContenido(T contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString(){
            return "Contenido de la caja: " + contenido;

    }
    
}
