public class Book {

    private  String title, author;
    private int year;
    static int countBook = 0;


    Book(){
        countBook++;
    }


    Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
        countBook++;
    }


    private  void isValidString(String string) {
        int lenString = string.length();
        if (string == null || string.isEmpty() || string.length() > 200) {
            throw new IllegalArgumentException("Ungültige Zeichenfolgenlänge (Erlaubt: 1 – 200)");
        }


    }
    private  void isValidInt(int number) {
        if (number < 1900 || number > 2025) {
            throw new IllegalArgumentException("Ungültiger Jahrwert (Erlaubt: 1900 – 2025)");
        }
    }


    public void setBook(String title, String author, int year){
        isValidString(author);
        isValidString(title);
        isValidInt(year);

        this.title = title;
        this.author = author;
        this.year = year;
    }


    public void setBookTitle(String title){
        isValidString(title);
        this.title = title;
    }

    public void setBookAuthor(String author){
        isValidString(author);
        this.author = author;
    }

    public void setBookYear(int year){
        isValidInt(year);
        this.year = year;
    }


    public static int getCountBook() { return countBook; }

    public String getAuthor() { return author; }
    public String getTitle() { return title; }
    public int getYear() { return  year; }


    @Override
    public String  toString(){
        return "Book(Title: [" + title + "], Author: [" + author + "], Year: [" + year + "])";
    }

}
