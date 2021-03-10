package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Book;

public class BookService {

	private List<Book> books=new ArrayList<Book>();
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public List<Book> getList(){
		return Collections.unmodifiableList(books);
	}
	
}
