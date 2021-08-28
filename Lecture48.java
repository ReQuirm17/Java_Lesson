//input เพื่อเช็คว่ามีของชิ้นนี้ใน Arrayไหม(กำหนดค่าไว้ใน Array)
package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class Lecture48 {
    public static void main(String[] args){
        String [] customerProducts = new String[5];
        Scanner scn = new Scanner(System.in);
        customerProducts[0] = scn.nextLine();
        customerProducts[1] = scn.nextLine();
        customerProducts[2] = scn.nextLine();
        customerProducts[3] = scn.nextLine();
        customerProducts[4] = scn.nextLine();
        foundProduct(customerProducts);
    }
    private static void foundProduct(String[] customerProducts){
        List products = Arrays.asList(new String[]{"Apple", "Hamburger", "Fish"});
        for (int i =0; i < customerProducts.length; i++){
            if (products.contains(customerProducts[i])) //ใช้ในการเช็คว่าข้อมูลที่ input มาตรงกับ List ตัวไหน
            {
                System.out.println("Found "+customerProducts[i]);
            }
        }
    }

}
