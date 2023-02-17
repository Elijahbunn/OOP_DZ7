package org.example;

import java.util.Scanner;

public class Answer{
    private Book book;
    public Answer(Book book) {
        this.book = book;
    }
    public String createAnswer(String messege) {
        Scanner in = new Scanner(System.in);
        System.out.println(messege);
        String ans = in.next().toLowerCase();
        return ans;
    }
    public void run(){
        while (true){
            String answer = createAnswer("Прочитать все записи - 1\nПрочитать определенную запись - 2" +
                    "\nДобавить запись - 3\nУдалить запись - 4\nРедактировать запись - 5\nВаш ответ:");
            System.out.println("Ваш выбор: " + answer);
            if (answer.equals("1")){
                System.out.println(book.getBook());
            } else if (answer.equals("2")) {
                String answer2 = createAnswer("Вариант поиска записи:\nпо номеру записи - 1\nпо заголовку - 2");
                if (answer2.equals("1")) {
                    Integer number = Integer.parseInt(createAnswer("Введите номер записи: "));
                    book.readEntry(number);
                } else if (answer2.equals("2")) {
                    String title = createAnswer("Введите заголовок записи");
                    System.out.println(book.get(title));
                }
            } else if (answer.equals("3")) {
                Entry entry = new Entry();
                book.add(entry);
            }else if(answer.equals("4")){
                Integer number = Integer.parseInt(createAnswer("Введите номер записи, котору хотите удалить: "));
                book.delete(number);
            } else if (answer.equals("5")) {
                Integer number = Integer.parseInt(createAnswer("Введите номер записи, котору хотите редактировать: "));
                book.refactor(number);
            }
        }
    }
}