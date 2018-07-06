package com.summer.digest;

import com.summer.digest.dao.AuthorDao;
import com.summer.digest.dao.BookDao;
import com.summer.digest.entity.Author;
import com.summer.digest.entity.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import javax.annotation.Resource;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DigestApplicationTests {

    @Resource
    AuthorDao authorDao;

    @Resource
    BookDao bookDao;

    @Test
    public void contextLoads() {

    Author author = authorDao.findById(1);
    Book book = new Book();
    book.setAuthor(author);
    book.setLookCount(0);
    book.setBookName("云边有个小卖部");
    book.setContent("现在的问题是，在页面保存一个product时，传进来的dic是id值，" +
            "是不能直接转换成dic的所以只能在product里增加一个冗余字段dicid，" +
            "但是这样的话spring data jpa会自动在数据表里新增一个字段，但是");
    bookDao.save(book);
    }

}
