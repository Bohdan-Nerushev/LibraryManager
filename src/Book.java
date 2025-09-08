public class Book {

    // Titel und Autor des Buches
    // Title and author of the book
    // Назва та автор книги
    private String title, author;

    // Erscheinungsjahr des Buches
    // Year of publication of the book
    // Рік видання книги
    private int year;

    // Zähler für die Gesamtzahl erstellter Bücher
    // Counter for the total number of created books
    // Лічильник для підрахунку кількості створених книг
    static int countBook = 0;

    // Standardkonstruktor: erstellt ein leeres Buch und erhöht den Zähler
    // Default constructor: creates an empty book and increments the counter
    // Конструктор за замовчуванням: створює порожню книгу та збільшує лічильник
    Book() {
        countBook++;
    }

    // Konstruktor mit Parametern (Titel, Autor, Jahr)
    // Constructor with parameters (title, author, year)
    // Конструктор з параметрами (назва, автор, рік)
    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        countBook++;
    }

    // Interne Methode: Überprüfung der Gültigkeit einer Zeichenkette
    // Internal method: checks if a string is valid
    // Внутрішній метод: перевіряє правильність рядка
    private void isValidString(String string) {
        int lenString = string.length();
        if (string == null || string.isEmpty() || string.length() > 200) {
            throw new IllegalArgumentException("Ungültige Zeichenfolgenlänge (Erlaubt: 1 – 200)");
        }
    }

    // Interne Methode: Überprüfung, ob das Jahr gültig ist
    // Internal method: checks if the year is valid
    // Внутрішній метод: перевіряє, чи рік є допустимим
    private void isValidInt(int number) {
        if (number < 1900 || number > 2025) {
            throw new IllegalArgumentException("Ungültiger Jahrwert (Erlaubt: 1900 – 2025)");
        }
    }

    // Setzt alle Buchdaten (Titel, Autor, Jahr) auf einmal
    // Sets all book data (title, author, year) at once
    // Встановлює всі дані книги (назву, автора, рік) одразу
    public void setBook(String title, String author, int year) {
        isValidString(author);
        isValidString(title);
        isValidInt(year);

        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Setzt nur den Titel des Buches
    // Sets only the title of the book
    // Встановлює лише назву книги
    public void setBookTitle(String title) {
        isValidString(title);
        this.title = title;
    }

    // Setzt nur den Autor des Buches
    // Sets only the author of the book
    // Встановлює лише автора книги
    public void setBookAuthor(String author) {
        isValidString(author);
        this.author = author;
    }

    // Setzt nur das Erscheinungsjahr des Buches
    // Sets only the year of publication of the book
    // Встановлює лише рік видання книги
    public void setBookYear(int year) {
        isValidInt(year);
        this.year = year;
    }

    // Gibt die Gesamtzahl erstellter Bücher zurück
    // Returns the total number of created books
    // Повертає загальну кількість створених книг
    public static int getCountBook() {
        return countBook;
    }

    // Getter für den Autor
    // Getter for the author
    // Геттер для автора
    public String getAuthor() {
        return author;
    }

    // Getter für den Titel
    // Getter for the title
    // Геттер для назви
    public String getTitle() {
        return title;
    }

    // Getter für das Erscheinungsjahr
    // Getter for the year of publication
    // Геттер для року видання
    public int getYear() {
        return year;
    }

    // Darstellung des Buches als Text
    // Representation of the book as text
    // Текстове представлення книги
    @Override
    public String toString() {
        return "Book(Title: [" + title + "], Author: [" + author + "], Year: [" + year + "])";
    }
}

