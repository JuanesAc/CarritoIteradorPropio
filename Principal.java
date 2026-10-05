public class Principal {
    public static void main(String[] args) {
        CarritoCompras<Producto> carrito = new CarritoCompras<>();

        carrito.agregarElemento(new Producto("Teclado Mecánico", 85.50));
        carrito.agregarElemento(new Producto("Ratón Inalámbrico", 45.00));
        carrito.agregarElemento(new Producto("Monitor 27''", 299.99));

        Iterador<Producto> iterador = carrito.crearIterador();

        double total = 0;
        while (iterador.tieneSiguiente()) {
            Producto producto = iterador.siguiente();
            System.out.println(producto.toString());
            total += producto.getPrecio();
        }

        System.out.println("Total: $" + total);
    }
}