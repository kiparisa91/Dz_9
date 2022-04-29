package pro.sky.java.course1;

public class Main {


    public static void main(String[] args) {
	// write your code here
        Author authorOne = new Author("Лев", "Толстой");
        Book bookOne = new Book("Война и мир", 1960);
        Author authorTwo = new Author("Федор", "Достоевский");
        Book bookTwo = new Book("Братья Карамазовы", 1965);
        System.out.println(authorOne.getAuthorName() + " " + authorOne.getAuthorSurname() + " " + bookOne.getBookName() + " " + bookOne.getPublishingYear());
        System.out.println(authorTwo.getAuthorName() + " " + authorTwo.getAuthorSurname() + " " + bookTwo.getBookName() + " " + bookTwo.getPublishingYear());
        bookTwo.setPublishingYear(1990);
        System.out.println("Новый год издания: " + authorTwo.getAuthorName() + " " + authorTwo.getAuthorSurname() + " " +bookTwo.getBookName() + " " + bookTwo.getPublishingYear());

    }
}
