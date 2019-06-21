package com.halo.service;

import com.halo.entity.Book;
import com.halo.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    // 查询全部
    public List<Book> getAllBooks() {
        return bookDao.selectAll();
    }

    // 查询单个
    public Book getById(Integer id) {
        return bookDao.getById(id);
    }

}
