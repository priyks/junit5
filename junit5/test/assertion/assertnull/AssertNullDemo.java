package assertion.assertnull;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

import model.Book;
import service.BookService;
/**
 * @author priyankaku
 * This class checks whether the BookService book list contains given book title then it
 * returns book otherwise returns null
 * assertNull have the following 3 overloaded methods
 *
 */
public class AssertNullDemo {

	@Test
	public void assertNullWithNoMessage() {
		BookService bookService = new BookService();
		Book headFirst = new Book(1, "Head First Core Java", "wort");
		Book springpro = new Book(2, "Spring Pro", "lunina");
		bookService.addBook(headFirst);
		bookService.addBook(springpro);
		Book actualBook=bookService.getBookByName("Pro");
		//System.out.println(actualBook);
		assertNull(actualBook);
	}
	
	@Test
	public void assertNullWithMessage() {
		BookService bookService = new BookService();
		Book headFirst = new Book(1, "Head First Core Java", "wort");
		Book springpro = new Book(2, "Spring Pro", "lunina");
		bookService.addBook(headFirst);
		bookService.addBook(springpro);
		Book actualBook=bookService.getBookByName("Pro");
		//System.out.println(actualBook);
		assertNull(actualBook,"book is not null");
	}
	
	@Test
	public void assertNullWithMessageSupplier() {
		BookService bookService = new BookService();
		Book headFirst = new Book(1, "Head First Core Java", "wort");
		Book springpro = new Book(2, "Spring Pro", "lunina");
		bookService.addBook(headFirst);
		bookService.addBook(springpro);
		Book actualBook=bookService.getBookByName("Pro");
		//System.out.println(actualBook);
		assertNull(actualBook,()->"book is not null");
	}
	
	

}
