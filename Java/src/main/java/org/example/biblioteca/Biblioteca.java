package org.example.biblioteca;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Libro> stock;
    private ArrayList<Usuario> registeredUsers;

    public Biblioteca(){
        this.stock = new ArrayList<>();
        this.registeredUsers = new ArrayList<>();
    }

    public ArrayList<Libro> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Libro> stock) {
        this.stock = stock;
    }

    public ArrayList<Usuario> getRegisteredUsers() {
        return registeredUsers;
    }

    public void setRegisteredUsers(ArrayList<Usuario> registeredUsers) {
        this.registeredUsers = registeredUsers;
    }

    public void addBook(Libro book){stock.add(book);}

    public void addUser(Usuario user){registeredUsers.add(user);}

    public void printBook(Libro book){
        if (searchBook(book)){
            book.getInfo();
        }else {
            System.out.println("El libro no esta registrado...");
        }
    }

    public void catalog(){
        System.out.println("Catalogo: ");
        for (Libro lib : stock){
            System.out.print(lib + "  ");
        }
    }

    public boolean searchBook(Libro book){
        return stock.contains(book);
    }
}
