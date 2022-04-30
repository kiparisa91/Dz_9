package pro.sky.java.course1;

public class Main {


    public static void main(String[] args) {
	// write your code here
        Author authorOne = new Author("Лев", "Толстой");
        Book bookOne = new Book("Война и мир", authorOne, 1960);
        Author authorTwo = new Author("Федор", "Достоевский");
        Book bookTwo = new Book("Братья Карамазовы", authorTwo, 1965);
        System.out.println(bookOne.getBookName() + ", " + bookOne.getAuthor().getAuthorName() + " " + bookOne.getAuthor().getAuthorSurname() + ", " + bookOne.getPublishingYear());
        System.out.println(bookTwo.getBookName() + ", " + bookTwo.getAuthor().getAuthorName() + " " + bookTwo.getAuthor().getAuthorSurname() + ", " + bookTwo.getPublishingYear());
        bookTwo.setPublishingYear(1990);
        System.out.println("Новый год издания: " + bookTwo.getBookName() + ", " + bookTwo.getAuthor().getAuthorName() + " " + bookTwo.getAuthor().getAuthorSurname() + ", " + bookTwo.getPublishingYear());
        System.out.println("-------------------------------------------------------------");
        System.out.println(bookOne);
        System.out.println(bookTwo);
        System.out.println(authorOne.equals(authorTwo));
        System.out.println(bookOne.equals(bookTwo));
        System.out.println(bookOne.getBookName().hashCode());
        System.out.println(bookTwo.getBookName().hashCode());
        System.out.println(authorOne.getAuthorSurname().hashCode());
        System.out.println(authorTwo.getAuthorSurname().hashCode());

    }
}
