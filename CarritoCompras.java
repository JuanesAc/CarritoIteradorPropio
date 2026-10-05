import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class CarritoCompras<T> implements Agregado<T> {
    private List<T> elementos = new ArrayList<>();

    public void agregarElemento(T elemento) {
        elementos.add(elemento);
    }

    public void eliminarElemento(T elemento) {
        elementos.remove(elemento);
    }

    public int getTamanio() {
        return elementos.size();
    }

    @Override
    public Iterador<T> crearIterador() {
        return new IteradorCarrito();
    }

    private class IteradorCarrito implements Iterador<T> {
        private int posicion = 0;

        @Override
        public boolean tieneSiguiente() {
            return posicion < elementos.size();
        }

        @Override
        public T siguiente() {
            if (!tieneSiguiente()) {
                throw new NoSuchElementException();
            }
            return elementos.get(posicion++);
        }
    }
}