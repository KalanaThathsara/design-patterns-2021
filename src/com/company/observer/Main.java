package com.company.observer;

public class Main {

    public  static  void  main(String[] args) throws InterruptedException {

        //publisher -> Subject
        //subscriber -> Observer
        //types of observer -> NewsReader, FoodWrapper

        Observer observer1 = new Type1Observer(); //reading news
        Observer observer2 = new Type1Observer(); // reading news
        Observer observer3 = new Type2Observer(); //wrap foods

        Subject subject = new Subject();
        subject.subscribe(observer1);
        subject.subscribe(observer2);
        subject.subscribe(observer3);

        subject.notifyObservers("Curfew will be imposed today!");

        Thread.sleep(10000); //wait for 10 seconds
        System.out.println("==================================================");

        subject.notifyObservers("Reserved: Curfew will not be imposed today!");

        Thread.sleep(5000); //wait for 5 seconds

        subject.unsubscribe(observer2);

        Thread.sleep(5000);
        System.out.println("==================================================");

        subject.notifyObservers("Fuel prices gone up!");

        //can create a folder in your machine called news
        //whenever you have new news you can create a new text file and add the news to it and copy the text file into news folder
        //our subject class keep wtching the news folder -> and whenever new news is available, it can call the notifyObservers method with the news content
        //then you can delete the news file
        //keep watching for more news

        //create a small gui
        //create a form to enter the name and email address of user
        //and submit -> you can add him to the observer list

    }
}
