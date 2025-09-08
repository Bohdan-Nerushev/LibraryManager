import java.util.ArrayList;
import java.util.stream.Collectors;

public class Library {
    // Eine Liste von Büchern, die in der Bibliothek gespeichert sind
    // A list of books stored in the library
    // Список книг, що зберігаються у бібліотеці
    private ArrayList<Book> books;

    // Zähler für die Anzahl der Bibliotheken
    // Counter for the number of libraries
    // Лічильник кількості створених бібліотек
    static int countLibrary = 0;

    // Konstruktor ohne Parameter: erstellt eine leere Bibliothek
    // Constructor without parameters: creates an empty library
    // Конструктор без параметрів: створює порожню бібліотеку
    Library() {
        this.books = new ArrayList<>();
        countLibrary++;
    }

    // Konstruktor mit einem Buch als Parameter
    // Constructor with one book as parameter
    // Конструктор, що приймає одну книгу
    Library(Book book) {
        this.books = new ArrayList<>();
        this.books.add(book);
        countLibrary++;
    }

    // Konstruktor mit Buchtiteldaten (Titel, Autor, Jahr)
    // Constructor with book details (title, author, year)
    // Конструктор, що приймає дані книги (назва, автор, рік)
    Library(String title, String author, int year) {
        this.books = new ArrayList<>();
        Book book = new Book(title, author, year);
        this.books.add(book);
        countLibrary++;
    }

    // Methode zum Hinzufügen eines bestehenden Buchobjekts
    // Method to add an existing Book object
    // Метод для додавання існуючого об’єкта книги
    public void addBook(Book book) {
        this.books.add(book);
    }

    // Methode zum Erstellen und Hinzufügen eines neuen Buches aus Daten
    // Method to create and add a new book from given data
    // Метод для створення та додавання нової книги з даних
    public void addBook(String title, String author, int year) {
        Book book = new Book(title, author, year);
        this.books.add(book);
    }

    // Gibt die gesamte Liste der Bücher zurück
    // Returns the entire list of books
    // Повертає весь список книг
    public ArrayList<Book> showBooks() {
        return books;
    }

    // Gibt alle Bücher der Bibliothek auf der Konsole aus
    // Prints all books of the library to the console
    // Виводить усі книги бібліотеки на консоль
    public void printBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Sucht nach Büchern anhand des Autors
    // Searches for books by author
    // Шукає книги за автором
    public ArrayList<Book> findByAuthor(String author) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                result.add(book);
            }
        }
        return result;
    }

    // Sucht nach Büchern anhand des Titels
    // Searches for books by title
    // Шукає книги за назвою
    public ArrayList<Book> findByTitle(String title) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                result.add(book);
            }
        }
        return result;
    }

    // Sucht nach Büchern anhand des Erscheinungsjahres
    // Searches for books by year of publication
    // Шукає книги за роком видання
    public ArrayList<Book> findByYear(int year) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getYear() == year) {
                result.add(book);
            }
        }
        return result;
    }

    // Gibt die Anzahl der Bibliotheken zurück
    // Returns the number of libraries created
    // Повертає кількість створених бібліотек
    public static int getCountBook() {
        return countLibrary;
    }

    // Wandelt die Bibliothek in eine Zeichenkette um (zeigt alle Bücher)
    // Converts the library to a string (shows all books)
    // Перетворює бібліотеку на рядок (показує всі книги)
    @Override
    public String toString() {
        return "Library: [" +
                books.stream()
                        .map(Book::toString)
                        .collect(Collectors.joining(", ")) +
                "]";
    }
}

