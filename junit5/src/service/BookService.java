package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Book;

public class BookService {

	private List<Book> books=new ArrayList<Book>();
	/**
	 * Adds book in books List
	 * @param book
	 */
	public void addBook(Book book) {
		books.add(book);
	}
	/**
	 * @return bookList
	 */
	public List<Book> getList(){
		return Collections.unmodifiableList(books);
	}
	/**
	 * this method takes 
	 * @param bookId and compares that bookId in bookList if found 
	 * @return Book
	 * otherwise 
	 * @return null
	 */
	public Book getBookByName(String bookName) {
		
		for(Book book:books) {
			String value=book.getTitle();
			if(value.equals(bookName)) {
				return book;	
			}
		}
		return null;
		
	}
	
}
