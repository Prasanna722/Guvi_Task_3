public class Library {
    private Book[] books;
    private int count;

    public Library() {
        books = new Book[5];  // You can increase this size if needed
        count = 0;
    }

    // Add book
    public void addBook(Book book) {
        if (count < books.length) {
            books[count++] = book;
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    // Remove book by ID
    public void removeBook(int bookID) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (books[i].getBookID() == bookID) {
                for (int j = i; j < count - 1; j++) {
                    books[j] = books[j + 1];
                }
                books[--count] = null;
                found = true;
                System.out.println("Book with ID " + bookID + " removed.");
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found.");
        }
    }

    // Search book by ID
    public void searchBook(int bookID) {
        for (int i = 0; i < count; i++) {
            if (books[i].getBookID() == bookID) {
                books[i].display();
                return;
            }
        }
        System.out.println("Book not found.");
    }

    // Display all books
    public void displayBooks() {
        if (count == 0) {
            System.out.println("No books in the library.");
            return;
        }
        for (int i = 0; i < count; i++) {
            books[i].display();
        }
    }
}
