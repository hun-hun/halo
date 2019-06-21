package com.halo.dao;

import com.halo.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public interface BookDao {

    int insert(Book record);

    List<Book> selectAll();

    Book getById(@Param(value = "id") Integer id);
}
