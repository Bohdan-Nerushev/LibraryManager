
import java.util.ArrayList;


public class Library {
    private ArrayList<Book> books;
    static int countLibrary = 0;

    Library() {
        this.books = new ArrayList<>();
        countLibrary++;
    }

    Library(Book book) {
        this.books = new ArrayList<>();
        this.books.add(book);
        countLibrary++;
    }

    Library(String title, String author, int year) {
        this.books = new ArrayList<>();
        Book book = new Book(title, author, year);
        this.books.add(book);
        countLibrary++;
    }

    public void addBook(String title, String author, int year) {
        Book book = new Book(title, author, year);
        this.books.add(book);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void printBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public  Book findByAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                return book;
            }
        }
        return null;
    }

    public  Book findByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public Book findByYear(int year) {
        for (Book book: books) {
            if (book.getYear() == year) {
                return book;
            }
        }
        return null;
    }

}
