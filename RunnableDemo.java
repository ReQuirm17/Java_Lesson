package com.company;

import java.util.logging.Level;
import java.util.logging.Logger;

public class RunnableDemo implements Runnable{

    private String threadname;
    private Thread t;
    @Override
    public void run() {
        System.out.println("Running"+threadname);
        for (int i =4; i > 0;i--){
            System.out.println("Thread:"+threadname+","+ i);
            try {
                Thread.sleep(50);
            }catch (InterruptedException ex){
                Logger.getLogger(RunnableDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    RunnableDemo(String name){
        threadname = name;
        System.out.println("creating :"+threadname);
    }
    public void start()
    {
        System.out.println("Starting:"+threadname);
        if(t == null)
        {
            t = new Thread(this, threadname);
            t.start();
        }
    }

}
