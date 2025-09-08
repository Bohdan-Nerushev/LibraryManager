import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Erstellen von Büchern mit verschiedenen Konstruktoren
        // Creating books using different constructors
        // Створюємо книги за допомогою різних конструкторів
        Book book1 = new Book("Der Prozess", "Franz Kafka", 1925);
        Book book2 = new Book("Faust", "Johann Wolfgang von Goethe", 1808);
        Book book3 = new Book("Die Verwandlung", "Franz Kafka", 1915);

        // Verwenden von Settermethoden zum Ändern von Buchdetails
        // Using setter methods to modify book details
        // Використовуємо сеттери для зміни даних книги
        book2.setBookTitle("Faust (Teil I)");
        book2.setBookAuthor("Goethe");
        book2.setBookYear(1832);

        // Anzeigen von Buchinformationen mit toString()
        // Displaying book info using toString()
        // Виводимо інформацію про книги через toString()
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        // Gesamtanzahl der erstellten Bücher abrufen
        // Retrieve total number of created books
        // Отримуємо загальну кількість створених книг
        System.out.println("Total Books: " + Book.getCountBook());

        // Bibliothek mit Konstruktor erstellen (mit einem Buch)
        // Create library using constructor (with one book)
        // Створюємо бібліотеку з одним конструктором
        Library library = new Library(book1);

        // Bücher zur Bibliothek hinzufügen
        // Add books to the library
        // Додаємо книги до бібліотеки
        library.addBook(book2);
        library.addBook("Also sprach Zarathustra", "Friedrich Nietzsche", 1883);
        library.addBook(book3);

        // Alle Bücher anzeigen
        // Show all books
        // Показати всі книги
        System.out.println("\nAlle Bücher in der Bibliothek:");
        library.printBooks();

        // Nach Autor suchen
        // Search by author
        // Пошук за автором
        ArrayList<Book> byAuthor = library.findByAuthor("Franz Kafka");
        System.out.println("\nBooks by Franz Kafka: " + byAuthor);

        // Nach Titel suchen
        // Search by title
        // Пошук за назвою
        ArrayList<Book> byTitle = library.findByTitle("Faust (Teil I)");
        System.out.println("\nBooks with title 'Faust (Teil I)': " + byTitle);

        // Nach Jahr suchen
        // Search by year
        // Пошук за роком
        ArrayList<Book> byYear = library.findByYear(1925);
        System.out.println("\nBooks from year 1925: " + byYear);

        // Gesamtanzahl der Bibliotheken
        // Total number of libraries
        // Загальна кількість бібліотек
        System.out.println("\nTotal Libraries: " + Library.getCountBook());

        // Verwendung von toString() für Bibliothek
        // Using toString() for library
        // Використання toString() для бібліотеки
        System.out.println("\nLibrary overview: " + library.toString());
    }
}
