package com.halo.web;

import com.halo.service.BookService;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    public static Gson gson = new Gson();

    @Autowired
    private BookService bookService;

    @RequestMapping("/getBook/{id}")
    public String bookInfo(@PathVariable("id") Integer id) {
        return gson.toJson(bookService.getById(id));
    }
}
