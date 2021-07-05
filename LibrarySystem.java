package com.company;

class Library{
    String [] books;
    int no_of_books;
    Library(){
        this.books = new String[50];
        this.no_of_books = 0;
    }
    void AddBook(String book){
        this.books [no_of_books] = book;
        System.out.println(book+" Has been added");
        no_of_books++;
    }
    void AvailabeBooks(){
        System.out.println("Available books are: ");
        for (String b : this.books){
            if (b==null ){
                continue;
            }
            else {
                System.out.println("* " + b);
            }
        }
    }
    void IssueBook(String book){
        for (int i =0;i<this.books.length;i++){
            if (this.books[i] .equals(book)){
                System.out.println(book+"  The book has been issued");
                this.books[i] = null;
                return;
            }
        }
    }
}
public class LibrarySystem {
    public static void main(String[] args) {
        Library lib = new Library();
        lib.AddBook("Rich Dad Poor Dad");
        lib.AddBook("Black Hat Python");
        lib.AddBook("Social Engineering");
        lib.AddBook("Gray Hat Python");
        lib.AddBook("Algorithms");
        lib.IssueBook("Black Hat Python");
        lib.AvailabeBooks();

    }
}
