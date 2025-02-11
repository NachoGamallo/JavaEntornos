package org.example.biblioteca;

import java.util.ArrayList;

/**
 * Este objeto (Biblioteca), se encarga de guardar tanto los libros que
 * estan en la biblioteca como los usuarios registrados en easta. Lo guarda todo en listas.
 * @author Nacho Gamallo
 * @since 0.1 APK
 * @version 1.0 APK
 * @see Libro
 * @see Usuario
 */
public class Biblioteca {

    private ArrayList<Libro> stock;
    private ArrayList<Usuario> registeredUsers;

    /**
     * En el constructor lo unico que vamos a hacer es generar las dos listas vacias por defecto.
     */
    public Biblioteca(){
        this.stock = new ArrayList<>();
        this.registeredUsers = new ArrayList<>();
    }

    /**
     * Funcion que sirve para devolver una lista tipo Libro.
     * @deprecated Esta funcion esta obsoleta, remplazada por el metodo Catalog
     * @return Nos devuelve el ArrayList tipo Libro.
     */
    public ArrayList<Libro> getStock() {
        return stock;
    }

    /**
     * Metodo para asignar una lista de libros a nuestro atributo.
     * @param stock Parametro tipo ArrayList(Libro) que se nos pasa para darle el valor a nuestro atributo.
     */
    public void setStock(ArrayList<Libro> stock) {
        this.stock = stock;
    }

    /**
     * Funcion que sirve para devolver una lista tipo Usuario.
     * @return Nos devuelve el ArrayList tipo Usuario.
     */
    public ArrayList<Usuario> getRegisteredUsers() {
        return registeredUsers;
    }

    /**
     * Metodo para asignar una lista de Usuarios a nuestro atributo.
     * @param registeredUsers Parametro tipo ArrayList(Usuario) que se nos pasa para darle
     *                        el valor a nuestro atributo.
     */
    public void setRegisteredUsers(ArrayList<Usuario> registeredUsers) {
        this.registeredUsers = registeredUsers;
    }

    /**
     * Este metodo sirve para añadir un objeto tipo Libro a nuestra lista de libros.
     * @param book Objeto tipo Libro que se le pasara al metodo para que lo añada a la Lista.
     */
    public void addBook(Libro book){
        stock.add(book);
    }

    /**
     * Este metodo sirve para añadir un objeto tipo Usuario a nuestra Lista de usuarios
     * @param user Objeto tipo Usuario que se le pasara al metodo para añadirlo a la Lista.
     */
    public void addUser(Usuario user){registeredUsers.add(user);}

    /**
     * Este metodo lo que va a hacer es llamar al metodo searchBook, si nos deuvelve
     * true imprime la informacion de nuestro Objeto tipo Libro, por lo contrario nos
     * indicara que el Libro que buscamos no se encuentra en nuestra lista.
     * @param book Objeto tipo Libro el cual queremos imprimir por pantalla.
     */
    public void printBook(Libro book){
        if (searchBook(book)){
            book.getInfo();
        }else {
            System.out.println("El libro no esta registrado...");
        }
    }

    /**
     * Este metodo se encargara de imprimirnos el catalogo de libros que tiene biblioteca.
     * Es decir todos los objetos tipo Libro que tengamos en la lista de Libros.
     */
    public void catalog(){
        System.out.println("Catalogo: ");
        for (Libro lib : stock){
            System.out.print(lib + "  ");
        }
    }

    /**
     * Esta funcion booleana verifica si en nuestra lista de Libros existe un Objeto en concreto.
     * @param book Objeto libro que queremos buscar.
     * @return Nos devuelve el resultado de la busqueda del objeto, con formato (true/false).
     */
    public boolean searchBook(Libro book){
        return stock.contains(book);
    }
}
