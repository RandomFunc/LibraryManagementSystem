package librarymanagement;

import java.util.ArrayList;
public class User {
    String userId;
    String name;
    String contNumber;
    String emailAddr;
    ArrayList<Book> borrowedBooks = new ArrayList<Book>();
}
