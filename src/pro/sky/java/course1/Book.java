package pro.sky.java.course1;

import java.util.Objects;

public class Book {
    private final String bookName;
    private int publishingYear;
    private final Author author;

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

    public String toString() {
        return this.bookName + " " + this.author + " " + this.publishingYear;
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book Book = (Book) other;
        return getBookName().equals(Book.getBookName());
    }

    public int hashCode() {
        return Objects.hash(getBookName());
    }

}
