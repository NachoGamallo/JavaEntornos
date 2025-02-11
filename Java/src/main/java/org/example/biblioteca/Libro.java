package org.example.biblioteca;

/**
 * Este Objeto consta de la informacion de los libros los cuales son prestados a los Usuarios.
 * @author Nacho Gamallo
 * @since 0.1 APK
 * @version 1.0 APK
 */
public class Libro {

    private boolean available;
    private String title;
    private String author;
    private int publicationYear;

    /**
     * Constructor sin insercion de datos, con todos los valores a null o 0.
     */
    public Libro(){}

    /**
     * Contructor de Libro, con los parametros sin estar a null,
     * cada objeto tiene ciertos atributos que se indican por el usuario, y
     * cada nuevo objeto se creara por defecto como activo.
     * @param title Identifica al libro por su nombre, puede repetirse en distintos libros.
     * @param author Autor que ha hecho el libro, no es unico, puede tener mas de 1 libro.
     * @param publicationYear Año de publicacion del libro en cuestion.
     */
    public Libro(String title, String author, int publicationYear){
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
        this.available = true;
    }

    /**
     * Este metodo se encarga de asignar un nuevo valor booleano a avaliable
     * @deprecated Este metodo ha sido remplazado por los dos metodos (lendBook y removeBook)
     * @param available Parametro que se le pasara al metodo para remplazar avaliable
     */
    public void setAvailable(boolean available){
        this.available = available;
    }

    /**
     * Funcion para obtener si un libro esta disponible o no.
     * @return resultado que nos devuelve el objeto, de este atributo.
     */
    public boolean getAvailable() {
        return this.available;
    }

    /**
     * Funcion para obtener el titulo de un objeto Libro.
     * @return Nos devuelve el titulo del objeto en concreto.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Metodo para asignar un valor al titulo de un objeto Libro.
     * @param title Parametro que se le pasara al objeto para modificar el valor titulo.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Funcion para obtener el autor de un objeto tipo Libro
     * @return Nos devuelve el autor del objeto en concreto.
     */
    public String getAuthor() {
        return this.author;
    }

    /**
     * Metodo para asignar un valor author de un objeto tipo Libro.
     * @param author Parametro que se le pasara al objeto para modificar el valor author.
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Funcion para obtener el PublicationYear de un objeto tipo Libro
     * @return Nos devuelve el PublicationYear del objeto en concreto.
     */
    public int getPublicationYear(){
        return this.publicationYear;
    }

    /**
     * Metodo para asignar un valor PublicationYear de un objeto tipo Libro.
     * @param publicationYear Parametro que se le pasara al objeto para modificar el valor PublicationYear.
     */
    public void setPublicationYear(int publicationYear){
        this.publicationYear = publicationYear;
    }

    /**
     * Metodo para indicar que un objeto tipo Libro no esta disponible.
     */
    public void lendBook(){
        this.available = false;
    }

    /**
     * Metodo para indicar que un objeto tipo Libro esta disponible.
     */
    public void returnBook(){
        this.available = true;
    }

    /**
     * Metodo que nos dara toda la informacion de un objeto Libro con un formato en especifico.
     */
    public void getInfo(){
        System.out.println("Titulo: " + getTitle() + ", Autor: " + getAuthor()+ ", Año de publicación: " + getPublicationYear());
    }
}