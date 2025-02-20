package com.library.Service;

import java.util.List;
import com.library.model.Book;

public interface BookService {
    
    // Create a new book
    Book saveBook(Book book);

    // Get a book by ID
    Book getBookById(Long id);

    // Get all books
    List<Book> getAllBooks();

    // Update a book
    Book updateBook(Long id, Book book);

    // Delete a book
    void deleteBook(Long id);
    
    
    public List<Book> searchByTitleOrArticle(String searchTerm);
}
