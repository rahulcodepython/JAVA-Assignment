import java.util.HashSet;
import java.util.Objects;

// Book class with title and author fields
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Override equals to compare books based on title and author
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Book book = (Book) obj;
        return title.equals(book.title) && author.equals(book.author);
    }

    // Override hashCode to ensure consistency with equals
    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }

    // Override toString to display book details
    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "'}";
    }
}

// Main class to demonstrate HashSet with Book objects
public class Main {
    public static void main(String[] args) {
        // Creating a HashSet to store unique Book objects
        HashSet<Book> books = new HashSet<>();

        // Adding Book objects to the HashSet
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald"));
        books.add(new Book("1984", "George Orwell"));
        books.add(new Book("To Kill a Mockingbird", "Harper Lee"));
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald")); // Duplicate
        books.add(new Book("Moby Dick", "Herman Melville"));
        books.add(new Book("1984", "George Orwell")); // Duplicate

        // Printing unique books in the HashSet
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
