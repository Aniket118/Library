import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LibraryTest {

    @org.junit.jupiter.api.Test
    void addBook() {
        Library lib = Library.getInstance();

        lib.addBook(new Book());

        System.out.print(lib.toString());

        // If book is added or not
        assertEquals(lib.toString(), "\n\nTitle: null\nAuthor: null\nISBN: 0\nPrice: 0.0\n");
    }

    @org.junit.jupiter.api.Test
    void getInstance() {
        //The class is singelton or not.
        for(Constructor c: Library.class.getDeclaredConstructors()){
            assertEquals(Modifier.isPrivate(c.getModifiers()), true);
        }

        Library lib = Library.getInstance();

        // Assert
        assertEquals(lib.getClass(), Library.class);
    }
}