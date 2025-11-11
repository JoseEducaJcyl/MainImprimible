//Clase CuentaBancaria que implementa la interface Imprimible
//Con los atributos titular y saldo
public class CuentaBancaria implements Imprimible{
    private String titular;
    private double saldo;

    //Declaramos los constructores
    public CuentaBancaria(String titutal, double saldo) {
        this.titular = titutal;
        this.saldo = saldo;
    }

    //Metodo de la interface sobreescrito
    @Override
    public void imprimir() {
        System.out.println("Titular: "+titular+" - Saldo: "+saldo);
    }
}
