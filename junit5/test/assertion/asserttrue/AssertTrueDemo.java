package assertion.asserttrue;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import model.Book;
import service.BookService;

public class AssertTrueDemo {

	@Test
	void assertTrueWithNoMessage() {
		BookService bookService = new BookService();
		List<Book> bookList = bookService.getList();
		assertTrue(bookList.isEmpty());
	}
	
	@Test
	void assertTrueWithMessage() {
		BookService bookService = new BookService();
		Book book=new Book(1,"Head First Java","worts");
		//bookService.addBook(book);
		List<Book> bookList = bookService.getList();
		assertTrue(bookList.isEmpty(),"Book list is empty ..");
	}
	
	@Test
	void assertTrueWithSupplierMessage() {
		
		BookService bookService = new BookService();
		Book book=new Book(1,"Head First Java","worts");
		//bookService.addBook(book);
		List<Book> bookList = bookService.getList();
		assertTrue(bookList.isEmpty(),()->"Book list is empty ..");
	}
	
	@Test
	void assertTrueWithBooleanSupplierAndNoMessage() {
		BookService bookService = new BookService();
		List<Book> bookList = bookService.getList();
		assertTrue(()->bookList.isEmpty());
	}
	
	@Test
	void assertTrueWithBooleanSupplierMessage() {
		BookService bookService = new BookService();
		Book book=new Book(1,"Head First Java","worts");
		//bookService.addBook(book);
		List<Book> bookList = bookService.getList();
		assertTrue(()->bookList.isEmpty(),"Book list is empty ..");
	}
	
	@Test
	void assertTrueWithBooleanSupplierAndMessageSupplier() {
		BookService bookService = new BookService();
		Book book=new Book(1,"Head First Java","worts");
		//bookService.addBook(book);
		List<Book> bookList = bookService.getList();
		assertTrue(()->bookList.isEmpty(),()->"Book list is empty ..");
	}

}
