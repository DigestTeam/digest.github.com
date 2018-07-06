package com.summer.digest.dao;

import com.summer.digest.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AuthorDao extends JpaRepository<Author,Long> {

    public Author findById(Integer i);

}
