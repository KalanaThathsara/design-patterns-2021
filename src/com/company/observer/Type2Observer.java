package com.company.observer;

//reading the news
public class Type2Observer implements  Observer{
    @Override
    public void notifyObserver(String news) {
        System.out.println("Wrap the foods using news: " + news);

    }
}
