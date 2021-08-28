package com.company;

public class Main {

    public static void main(String[] args) {
	    RunnableDemo run1 = new RunnableDemo("Thread one");
	    run1.start();
        RunnableDemo run2 = new RunnableDemo("Thread two");
        run2.start();
        RunnableDemo run3 = new RunnableDemo("Thread three");
        run3.start();
        RunnableDemo run4 = new RunnableDemo("Thread four");
        run4.start();
    }
}
