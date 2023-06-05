package com.ttknpdev.crud.springbootjdbccrudposgresql.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private Long bookId;
    private String bookName;
    private LocalDate bookMFD;
    private Float bookPrice;
    private Integer bookSale;
    private String[] bookReviews;

}
