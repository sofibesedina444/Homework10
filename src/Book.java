public class Book {
    private final String bookName;
    private final Author authorName;
    private int publishingYear;

    public Book(String bookName, Author authorName, int publishingYear) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publishingYear = publishingYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthorName() {
        return this.authorName;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString () {
        String enter = "\n";
        return "Книга: " + bookName + enter + "Автор: " + authorName + enter + "Год издания: " + publishingYear;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book two = (Book) other;
        return bookName.equals(two.bookName);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(bookName);
    }
}
