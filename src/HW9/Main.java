package HW9;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        var author1 =  new Author("Лев", "Толстой");
        var author2 = new Author("Федор", "Достоевский");
        var author3 = new Author("Михаил", "Булгаков");

        var book1 = new Book("Война и мир", author1, 1867);
        var book2 = new Book("Белые ночи", author2, 1848);
        var book3 = new Book("Мастер и Маргарита", author3, 1967);




        System.out.println(author1);
        System.out.println(book1);



    }



    }

