package it.r27.libreria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import it.r27.libreria.model.Book;
import it.r27.libreria.repository.BookRepository;

@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepo;

    @GetMapping
    public String index(Model model) {
        List<Book> result = bookRepo.findAll();
        model.addAttribute("list", result);
        return "books/index";
    }

}
