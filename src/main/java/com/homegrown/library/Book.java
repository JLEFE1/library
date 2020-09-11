package com.homegrown.library;

public class Book {

    public static Book from(String title, String subTitle, Boolean read){
        return new Book(title, subTitle, read);
    }

    public final String title;
    public final String subTitle;
    public final Boolean read;

    private Book(String title, String subTitle, Boolean read){
        this.title = title;
        this.subTitle = subTitle;
        this.read = read;
    }
}
