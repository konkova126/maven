package Dao;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter
@ToString(includeFieldNames=true)
public class Book {
    private String shop;
    private int number;
    private String name;
    private String author;
    private int page;
    private String genre;
    private int amount;
    private String house;
    private int weight;
    private int curculation;
    private int year;
    private float price;
}

