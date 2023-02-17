package org.example;

import java.util.Scanner;

public class Entry {

    private String entry;
    private String title;

    public String getTitle() {
        return title;
    }

    public String getEntry() {
        return entry;
    }

    public Entry() {
        this.title = createTitle();
        this.entry = createEntry();
    }
    public String createEntry(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите запись: ");
        String entry = in.nextLine();
        return entry;
    }
    public String createTitle(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите заголовок: ");
        String title = in.nextLine();
        return title;
    }

    @Override
    public String toString() {
        return String.format("Ваша запись гласит: %s\n%s\n", this.title, this.entry);
    }
}
