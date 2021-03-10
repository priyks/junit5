package assertion.assertnotnull;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

import model.Book;
import service.BookService;
/**
 *This class checks whether the BookService book list contains given book title then it
 * returns book otherwise returns null
 * assertNotNull have the following 3 overloaded methods
 * assertNotNull evaluates actualBook is not null if its null then it fails 
 * @author priyankaku
 *
 */

public class AssertNotNullDemo {

	@Test
	public void assertNotNullWithNoMessage() {
		BookService bookService = new BookService();
		Book headFirst = new Book(1, "Head First Core Java", "wort");
		Book springpro = new Book(2, "Spring Pro", "lunina");
		bookService.addBook(headFirst);
		bookService.addBook(springpro);
		Book actualBook=bookService.getBookByName("Spring Pro");
		//System.out.println(actualBook);
		assertNotNull(actualBook);
	}
	
	@Test
	public void assertNotNullWithMessage() {
		BookService bookService = new BookService();
		Book headFirst = new Book(1, "Head First Core Java", "wort");
		Book springpro = new Book(2, "Spring Pro", "lunina");
		bookService.addBook(headFirst);
		bookService.addBook(springpro);
		Book actualBook=bookService.getBookByName("Head First Core Java");
		//System.out.println(actualBook);
		assertNotNull(actualBook,"book is null");
	}
	/**
	 * it evaluate if actualBook is Not null then test passes otherwise it will fails with supplier evaluates lazily
	 */
	@Test
	public void assertNotNullWithMessageSupplier() {
		BookService bookService = new BookService();
		Book headFirst = new Book(1, "Head First Core Java", "wort");
		Book springpro = new Book(2, "Spring Pro", "lunina");
		bookService.addBook(headFirst);
		bookService.addBook(springpro);
		Book actualBook=bookService.getBookByName("Spring Pro");
		//System.out.println(actualBook);
		assertNotNull(actualBook,()->"book is null");
	}
	
}
