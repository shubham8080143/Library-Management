//package com.library.Controller;
//
//
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.library.Repository.BookRepository;
//import com.library.model.Book;
//
//@RestController
//@RequestMapping("/admin")
//public class AdminController {
//
//    @Autowired
//    private BookRepository bookRepository;
//
//    @PostMapping("/books")
//    public Book addBook(@RequestBody Book book) {
//        return bookRepository.save(book);
//    }
//    
//    @GetMapping("/books/getAll")
//    public List<Book> getAllBooks() {
//        return bookRepository.findAll();
//    }
//    
//
//    @PutMapping("/books/{id}")
//    public Book updateBook(@PathVariable Long id, @RequestBody Book bookDetails) {
//        Book book = bookRepository.findById(id).orElseThrow();
//        book.setTitle(bookDetails.getTitle());
//        book.setAuthor(bookDetails.getAuthor());
//        book.setIsbn(bookDetails.getIsbn());
//        book.setCategory(bookDetails.getCategory());
//        book.setAvailable(bookDetails.isAvailable());
//        return bookRepository.save(book);
//    }
//
//    @DeleteMapping("/books/{id}")
//    public String deleteBook(@PathVariable Long id) {
//        bookRepository.deleteById(id);
//        return "Book deleted";
//    }
//}
