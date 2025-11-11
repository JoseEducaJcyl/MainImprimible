//Clase Libro que implementa la interface Imprimible
//Con los atributos titulo y autor
public class Libro implements Imprimible{
    private String titulo;
    private String autor;

    //Declaramos un constructor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    //Declaramos los setters y getters (para pruebas)
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    //Metodo de la interface sobreescrito
    @Override
    public void imprimir() {
        System.out.println("Libro: "+titulo+" - Autor: "+autor);
    }
}
