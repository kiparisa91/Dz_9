package pro.sky.java.course1;

public class Author {
    private final String authorName;
    private final String authorSurname;

    public Author(String authorName, String authorSurname) {
            this.authorName = authorName;
            this.authorSurname = authorSurname;
            if (this.authorName.length() == 0 || this.authorSurname.length() == 0) {
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

}
