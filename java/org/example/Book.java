package org.example;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private ArrayList<Entry> book;

    public Book() {
        ArrayList<Entry> book = new ArrayList<>();
        this.book = book;
    }

    public ArrayList getBook() {
        return book;
    }
    public ArrayList<String> add(Entry entry){
        ArrayList<String> book = getBook();
        book.add(String.valueOf(entry));
        return book;
    }
    public ArrayList<String> delete(Integer index){
        ArrayList<String> book = getBook();
        book.remove(index-1);
        return book;
    }
    public ArrayList<Entry> refactor(Integer index){
        ArrayList<Entry> book = getBook();
        Entry ans = new Entry();
        book.set(index-1, ans);
        return book;
    }
    public Entry get(String title) {
        ArrayList<Entry> book = getBook();
        Entry current = null;
        for (Entry entry : book) {
            if (entry.getTitle().equals(title)) {
                System.out.println(entry);
                current = entry;
            }
        }
        return current;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void readEntry(Integer index){
        List<Book> book = getBook();
        System.out.println(book.get(index-1));
    }
}
