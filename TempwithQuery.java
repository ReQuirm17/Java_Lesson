package com.company;

public class TempwithQuery {
    static int quantity = 10;
    static double price = 100;

    public static void main(String[] args)
    {
        System.out.println(calculateTotal());
    }
    private static double calculateTotal()
    {
        if (basePrice() > 1000)
        {
            return basePrice() * 0.90;
        }
        else
        {
            return basePrice() * 0.95;
        }
    }
    private static double basePrice() ///
    {
        return quantity * price;
    }
}
