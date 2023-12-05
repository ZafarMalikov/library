package com.example.library.books.entity;

import com.example.library.cart.entity.Cart;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "book")
public class Book {
    @Id
    private UUID id;
    private String name;
    private String author;
    private String publisher;
    private Integer size;
    private LocalDate date;
    private String price;
    private String photoPath;


    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Cart> carts = new ArrayList<>();


}
