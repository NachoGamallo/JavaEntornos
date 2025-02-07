package org.example.biblioteca;

import java.util.ArrayList;
public class Usuario {

    private String name;
    private int idUser;
    private ArrayList <Libro> borrowed_books;

    public Usuario(){}
    public Usuario(String name, int idUser){
        this.name = name;
        this.idUser = idUser;
        borrowed_books = new ArrayList<>();
    }

    public int GetIdUser(){return idUser;}

    public void SetIdUser(int idUser){this.idUser = idUser;}

    public String GetName() {
        return name;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public ArrayList<Libro> GetBorrowed_books() {return borrowed_books;}

    public void SetBorrowed_books(ArrayList<Libro> borrowed_books) {
        this.borrowed_books = borrowed_books;
    }

    public void AddBook (Libro book){
        borrowed_books.add(book);
    }

    public void DeleteBook (Libro book){
        borrowed_books.remove(book);
    }

    public void BorrowedBooksList(){

        System.out.println("Libros Prestados: ");
        for (Libro lib : borrowed_books){
            System.out.print(lib + "  ");
        }
    }
}
