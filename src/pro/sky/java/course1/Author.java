package pro.sky.java.course1;

import java.util.Objects;

public class Author {
    private final String authorName;
    private final String authorSurname;

    public Author(String authorName, String authorSurname) {
            this.authorName = authorName;
            this.authorSurname = authorSurname;
        if (this.authorName.isEmpty() || this.authorSurname.isEmpty()) {
                System.out.println("Книга не может создаваться без автора!");
                System.exit(0);
            }
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public String toString() {
        return this.authorName + " " + this.authorSurname;
    }

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author Author = (Author) other;
        return getAuthorSurname().equals(Author.getAuthorSurname());
    }

    public int hashCode() {
        return Objects.hash(getAuthorSurname());
    }

}
