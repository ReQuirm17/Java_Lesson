package com.company;

public class NewCalculation extends Calculation { //extends = การ inheritance Behavior, attribute ต่างๆมา[เอา Method ต่างๆใน Calculation(+,-) ไปสืบทอดไว้ใน Newcalculation]
    public double multiplication(double x, double y)
    {
        return x * y;
    }
    public double division(double x, double y)
    {
        return x/y;
    }
}
