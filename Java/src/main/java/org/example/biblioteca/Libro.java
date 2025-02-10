package org.example.biblioteca;

/**
 * Este Objeto consta de la informacion de los libros los cuales son prestados a los Usuarios.
 * @author Nacho Gamallo
 * @version 1.0
 */
public class Libro {

    private boolean available = true;
    private String title;
    private String author;
    private int publicationYear;
    
    public Libro(){}
    public Libro(String title, String author, int publicationYear){
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public boolean getAvailable() {
        return this.available;
    }

    public void setAvailable(boolean available){this.available = available;}

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear(){return this.publicationYear;}

    public void setPublicationYear(int publicationYear){this.publicationYear = publicationYear;}

    public void lendBook(){this.available = false;}
    public void returnBook(){this.available = true;}

    public void getInfo(){
        System.out.println("Titulo: " + getTitle() + ", Autor: " + getAuthor()+ ", Año de publicación: " + getPublicationYear());
    }
}