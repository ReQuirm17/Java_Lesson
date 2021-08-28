package com.company;

public class Company {
    public static String name = ""; //การระบุ static คือการสามารถเรียกใช้งานในระดับ class (บรรทัดทีี่ 21 ใน main)

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}
