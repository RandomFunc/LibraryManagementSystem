package librarymanagement;

import java.util.ArrayList;
public class Library {
    public static ArrayList<Book> books = new ArrayList<Book>();
    public static ArrayList<User> users = new ArrayList<User>();
    //int addedBooks = 0;
    //int addedUsers = 0;
    public static void addUser(String uid, String nam, String eaddr, String cnum){
        users.get(users.size()).userId = uid;
        users.get(users.size()).contNumber = cnum;
        users.get(users.size()).name = nam;
        users.get(users.size()).emailAddr = eaddr;
    }
    public static void addBook(String btitl, String bauth, String bid, String bgen){
        books.get(books.size()).author = bauth;
        books.get(books.size()).bookId = bid;
        books.get(books.size()).title = btitl;
        books.get(books.size()).genre = bgen;
        books.get(books.size()).availStat = true;
    }
    public static void checkOut(String bid,String uid){
        
        int i;
        for(i = 0;i<books.size();i++){
            if(bid.equals(books.get(i).bookId)){
                books.get(i).availStat = false;
            }
        } 
        int u;
        for(u = 0;u<users.size();u++){
            if(uid.equals(users.get(u).userId)){
                users.get(u).borrowedBooks.set(users.get(u).borrowedBooks.size(),books.get(i));
            }
        }
    }
    public static void returnBook(String bid,String uid){
        int i;
        for(i = 0;i<books.size();i++){
            if(bid.equals(books.get(i).bookId)){
                books.get(i).availStat = true;
            }
        } 
        int u;
        for(u = 0;u<users.size();u++){
            if(uid.equals(users.get(u).userId)){
                int o;
                for(o = 0;o<users.get(u).borrowedBooks.size();o++){
                    if(bid.equals(users.get(u).borrowedBooks.get(o).bookId)){
                        users.get(u).borrowedBooks.remove(o);
                    }
                }
            }
        }
    }
    public static void displayBooks(){
        int p;
        for(p = 0;p<books.size();p++){
            disBook(books.get(p));
        }
    }
    public static void disBook(Book bk){
        System.out.print(bk.title + "  ");
        System.out.print(bk.author + "  ");
        System.out.print(bk.bookId + "  ");
        System.out.print(bk.genre + "  ");
        System.out.println(bk.availStat + "  ");
    }
    public static void searchBookID(String bid){
        int i;
        for(i = 0;i<books.size();i++){
            if(bid.equals(books.get(i).bookId)){
                disBook(books.get(i));
            }
        } 
    }
    public static void searchBookTA(String ta){
        int i;
        for(i = 0;i<books.size();i++){
            if(ta.equals(books.get(i).author) || ta.equals(books.get(i).title)){
                disBook(books.get(i));
            }
        } 
    }
}
