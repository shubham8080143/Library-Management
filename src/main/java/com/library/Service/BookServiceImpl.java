package com.library.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.library.Repository.BookRepository;
import com.library.model.Book;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    // Constructor-based Dependency Injection
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book getBookById(Long id) {
        Optional<Book> book = bookRepository.findById(id);
        return book.orElse(null); // Return book if found, else return null
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book updateBook(Long id, Book updatedBook) {
        Optional<Book> existingBook = bookRepository.findById(id);
        if (existingBook.isPresent()) {
            Book book = existingBook.get();
            book.setTitle(updatedBook.getTitle());
            book.setAuthor(updatedBook.getAuthor());
            book.setCategory(updatedBook.getCategory());
            book.setIsbn(updatedBook.getIsbn());
            book.setAvailable(updatedBook.isAvailable());
            return bookRepository.save(book);
        }
        return null; // Return null if book not found
    }

    @Override
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

	@Override
	public List<Book> searchByTitleOrArticle(String searchTerm) {
		// TODO Auto-generated method stub
		 return bookRepository.searchByTitleAuthorOrCategory(searchTerm);
	}
}
