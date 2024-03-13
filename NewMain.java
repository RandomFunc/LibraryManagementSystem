package librarymanagement;
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);
        
        // Display menu options to the user
        System.out.println("Menu:"
                + "\n1. Add Books."
                + "\n2. Add Users."
                + "\n3. Borrow Book."
                + "\n4. Return Book."
                + "\n5. Display Books."
                + "\n6. Search Books By ID."
                + "\n7. Search Books By Title/Author.");
        
        try {
            // Read user's choice from the menu
            int select = input.nextInt();
            input.nextLine(); // Consume newline character
            
            // Check if the user's choice is within the valid range
            if (select >= 1 && select <= 7) {
                // Perform actions based on the user's choice
                switch (select) {
                    // Add a book
                    case 1:
                        System.out.println("Enter Book Title:");
                        String titl = input.nextLine();
                        System.out.println("Enter Book Author:");
                        String auth = input.nextLine();
                        System.out.println("Enter Book ID:");
                        String id = input.nextLine();
                        System.out.println("Enter Book Genre:");
                        String gen = input.nextLine();
                        Library.addBook(titl, auth, id, gen);
                        System.out.println("\nBook Added Successfully!!!\n");
                        break;
                    // Add a user
                    case 2:
                        System.out.println("Enter Name:");
                        String unam = input.nextLine();
                        System.out.println("Enter ID:");
                        String uid = input.nextLine();
                        System.out.println("Enter Contact Number:");
                        String cnum = input.nextLine();
                        System.out.println("Enter Email:");
                        String emal = input.nextLine();
                        Library.addUser(uid, unam, emal, cnum);
                        break;
                    // Borrow a book
                    case 3:
                        System.out.println("Enter BookID:");
                        String str = input.nextLine();
                        System.out.println("Enter UserID:");
                        String str1 = input.nextLine();
                        Library.checkOut(str, str1);
                        break;
                    // Return a book
                    case 4:
                        System.out.println("Enter BookID:");
                        String str2 = input.nextLine();
                        System.out.println("Enter UserID:");
                        String str3 = input.nextLine();
                        Library.returnBook(str2, str3);
                        break;
                    // Display all books
                    case 5:
                        System.out.println("These Books are currently present in the library:");
                        Library.displayBooks();
                        break;
                    // Search for a book by ID
                    case 6:
                        System.out.println("Enter BookID:");
                        String str5 = input.nextLine();
                        Library.searchBookID(str5);
                        break;
                    // Search for a book by title or author
                    default:
                        System.out.println("Enter Book Title/Author:");
                        String str6 = input.nextLine();
                        Library.searchBookID(str6);
                }
            } else {
                System.out.println("Give Input within the limit.");
            }
        } catch (Exception e) {
            // Handle exceptions
            System.out.println("Error: " + e.getMessage());
        }
    }
}
