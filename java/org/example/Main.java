package org.example;

public class Main {
    public static void main(String[] args) {
        Book my_book = new Book();
        Answer work = new Answer(my_book);
        work.run();
    }
}