package librarymanagement;

public class Book {
    String bookId;
    String title;
    String author;
    String genre;
    boolean availStat;
    Book(String bId, String titl, String auth, String gen, boolean avail){
        bookId = bId;
        title = titl;
        author = auth;
        genre = gen;
        availStat = avail;
    }
    Book(){
    
    }
}
