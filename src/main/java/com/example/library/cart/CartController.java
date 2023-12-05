package com.example.library.cart;

import com.example.library.books.entity.Book;
import com.example.library.user.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequiredArgsConstructor
@RequestMapping("/cart")
public class CartController {

    private final CartService cartService;


    @GetMapping()
    public ModelAndView getCartBooks(Model model, Authentication authentication) {
        User principal = (User) authentication.getPrincipal();
        List<Book> books = cartService.getBooks(principal.getId());
        model.addAttribute("CartBooks", books);
        return new ModelAndView("cart", "model", model);
    }
}
