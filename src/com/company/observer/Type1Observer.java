package com.company.observer;

//reading the news
public class Type1Observer implements  Observer{

    //accept the email address as a constructor parameter

    private String email;
    @Override
    public void notifyObserver(String news) {
//System.out.println("Reading the news: " + news);
        //send an actual email to the observer

    }
}
