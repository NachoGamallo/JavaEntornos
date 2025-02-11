package org.example.biblioteca;

import java.util.ArrayList;

/**
 * Esta clase se encarga de dar de alta a los usuarios que tendremos registrados
 * tanto aqui como en la biblioteca. Tendremos una lista con los libros que cada usuario ha tomado.
 * @author Nacho Gamallo
 * @since 0.1 APK
 * @version 1.0 APK
 * @see Libro
 */
public class Usuario {

    private String name;
    private int idUser;
    private ArrayList <Libro> borrowed_books;

    /**
     * Constructor por defecto al no ingresar ningun parametro pero llamar a la clase.
     */
    public Usuario(){}

    /**
     * Constructor al ingresar datos, creamos y le damos forma al objeto.
     * @param name Nombre del Usuario
     * @param idUser Id que identifica al usuario, no puede conincidir con ninguno de los que ya tengamos presentes.
     */
    public Usuario(String name, int idUser){
        this.name = name;
        this.idUser = idUser;
        borrowed_books = new ArrayList<>();
    }

    /**
     * Getter del idUser
     * @return Nos deuvleve el idUser del Usuario
     */
    public int GetIdUser(){return idUser;}

    /**
     * Setter de idUser
     * @param idUser Parametro que queremos remplazar por el idUser actual.
     */
    public void SetIdUser(int idUser){this.idUser = idUser;}

    /**
     * Getter del Name
     * @return Nos deuvleve el Name del Usuario
     */
    public String GetName() {
        return name;
    }

    /**
     * Setter de Name
     * @param name Parametro que queremos remplazar por el name actual.
     */
    public void SetName(String name) {
        this.name = name;
    }

    /**
     * Getter del Lista de libros
     * @return Nos deuvleve la lista de libros del usuario
     */
    public ArrayList<Libro> GetBorrowed_books() {return borrowed_books;}

    /**
     * Setter de Lista de libros.
     * @param borrowed_books Lista  que queremos remplazar por la actual.
     */
    public void SetBorrowed_books(ArrayList<Libro> borrowed_books) {
        this.borrowed_books = borrowed_books;
    }

    /**
     * Añadimos un libro a la lista de libros del Usuario.
     * @param book Objeto libro el cual queremos agregar a la lista de libros.
     */
    public void AddBook (Libro book){
        borrowed_books.add(book);
    }

    /**
     * Borramos un libro ya existente de la lista de libros del usuario.
     * @param book Objeto libro el cual queremos borrar de la lista.
     */
    public void DeleteBook (Libro book){
        borrowed_books.remove(book);
    }

    /**
     * Metodo para imprimir con un formato especifico la lista de libros que contiene el Usuario.
     */
    public void BorrowedBooksList(){

        System.out.println("Libros Prestados: ");
        for (Libro lib : borrowed_books){
            System.out.print(lib + "  ");
        }
    }
}
