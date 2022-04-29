package pro.sky.java.course1;

public class Book {
    private final String bookName;
    private int publishingYear;
    Author author;

    public Book(String bookName, Author author, int publishingYear) {
            this.bookName = bookName;
            this.publishingYear = publishingYear;
            this.author = author;
    }

    public String getBookName() {
            return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }


}
