//Field = data in class
package com.company;

public class Human {
    private String name = ""; // Encap
    private String lastname = "";
    private int Age = 17;

    public String getName() //obj.ตัวอื่น get(ส่งคำขอ) จะ getอะไรต้องตั้งชื่อให้สอดคล้อง
    {
        return name; // คืนค่าตัวเเปร name ให้การเรียกใช้ใน main บรรทัดที่ 11
    }
    public void setName(String name) // set parameter ให้กับ SET บรรทัดที่ 8
    {
        this.name = name; // กำหนด Scope ภายใต้ Method ให้ใช้งานเเค่ใน scope ของ Method [set code]
    }
    public String getLastname()
    {
        return lastname; // คืนค่าตัวเปร lastname ให้การเรียกใช้ใน main บรรทัดที่ 12
    }
    public void setLastname(String lastname) // set parameter ให้กับบรรทัดที่ 9
    {
        this.lastname = lastname;
    }
    public int getAge()
    {
        return Age; // คืนค่าตัวเปร Age ให้การเรียกใช้ใน main บรรทัดที่ 13
    }
    public void setAge(Integer age) //set parameter ให้กับบรรทัดที่ 10
    {
        this.Age = age;
    }

    public void Hello()
    {
        System.out.println("Hello"+" "+name);
    }
}
