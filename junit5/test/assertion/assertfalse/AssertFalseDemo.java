package assertion.assertfalse;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import model.Book;
import service.BookService;
/**
 * This class checks whether BookService books list is empty using assertFalse
 * if assertFalse method evaluates true then test method fails otherwise pass 
 * it has 6 overloaded methods as follows
 * @author priyankaku
 *
 */
public class AssertFalseDemo {
	
	@Test
	void assertFalseWithNoMessage() {
		BookService bookService = new BookService();
		Book book=new Book(1,"Head First Java","worts");
		bookService.addBook(book);
		List<Book> bookList = bookService.getList();
		assertFalse(bookList.isEmpty());
	}
	
	@Test
	void assertFalseWithMessage() {
		BookService bookService = new BookService();
		Book book=new Book(1,"Head First Java","worts");
		bookService.addBook(book);
		List<Book> bookList = bookService.getList();
		assertFalse(bookList.isEmpty(),"Book list is empty ..");
	}
	
	@Test
	void assertFalseWithSupplierMessage() {
		
		BookService bookService = new BookService();
		Book book=new Book(1,"Head First Java","worts");
		bookService.addBook(book);
		List<Book> bookList = bookService.getList();
		assertFalse(bookList.isEmpty(),()->"Book list is empty ..");
	}
	
	@Test
	void assertFalseWithBooleanSupplierAndNoMessage() {
		BookService bookService = new BookService();
		Book book=new Book(1,"Head First Java","worts");
		bookService.addBook(book);
		List<Book> bookList = bookService.getList();
		assertFalse(()->bookList.isEmpty());
	}
	
	@Test
	void assertFalseWithBooleanSupplierMessage() {
		BookService bookService = new BookService();
		Book book=new Book(1,"Head First Java","worts");
		bookService.addBook(book);
		List<Book> bookList = bookService.getList();
		assertFalse(()->bookList.isEmpty(),"Book list is empty ..");
	}
	
	@Test
	void assertFalseWithBooleanSupplierAndMessageSupplier() {
		BookService bookService = new BookService();
		Book book=new Book(1,"Head First Java","worts");
		bookService.addBook(book);
		List<Book> bookList = bookService.getList();
		assertFalse(()->bookList.isEmpty(),()->"Book list is empty ..");
	}

}
