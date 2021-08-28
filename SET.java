// Set and Get Argument--Parameter
package com.company;

public class SET {

    public static void main(String[] args) {
        Human human1 = new Human();
        //human1.Hello();
        human1.setName("Sirapop"); // set Argument เเล้วเเสดงผลตาม Method ที่ตั้ง
        human1.setLastname("Chullapamorn");
        human1.setAge(17);
        System.out.println(human1.getName());
        System.out.println(human1.getLastname());
        System.out.println(human1.getAge());
        System.out.println(human1.getName() + " " + human1.getLastname() + " " + "Age" + human1.getAge());


        Human human2 = new Human();


    }

}
