package com.summer.digest.dao;

import com.summer.digest.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookDao extends CrudRepository<Book,Long> {
}
