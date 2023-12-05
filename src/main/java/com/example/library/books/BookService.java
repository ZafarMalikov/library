package com.example.library.books;

import com.example.library.books.entity.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public List<Book> getALl() {
        return bookRepository.findAll();
    }

    public Optional<Book> findById(UUID id) {
        return bookRepository.findById(id);
    }

    public Book findByName(String name) {
        return bookRepository.findByName(name).get();
    }
}
