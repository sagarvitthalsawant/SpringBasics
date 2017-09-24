package com.example.service;

import com.example.dao.BookDAO;
import com.example.domain.Book;
import com.example.utility.BookUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookDAO bookDAO;
    @Autowired
    private BookUtility utility;


    public String largestAreaBookName() {
        int lgarea = 0;
        String bookName = "";
        for (int i=0;i < 2;i++) {
            Book book = bookDAO.getBook(i);
            int area = utility.calculateArea(book.getLength(), book.getWidth());
            if (lgarea < area) {
                lgarea = area;
                bookName = book.getBookName();
            }

        }
        return bookName;
    }
}
