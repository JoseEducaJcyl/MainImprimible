// Clase Main con el metodo main para ejecutar el codigo
public class MainImprimible {
    public static void main(String[] args) {
        // Se crean dos objetos que implementan la interfaz Imprimible:
        // un Libro y una CuentaBancaria
        Imprimible libro = new Libro("1984","George Orwell");
        Imprimible cuenta = new CuentaBancaria("Juan Perez",1500.7);


        // Se llama al metodo imprimir() de cada objeto
        libro.imprimir();
        cuenta.imprimir();
    }
}
