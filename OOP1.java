//Method and Class
public class OOP1 {
    public static void main(String[] args){ // public = อนุญาติให้ class อื่นๆเรียกใช้การทำงานได้(เรียกใช้ข้าม class), void = การกำหนดการทำงานที่ทำครั้งเดียวละจบเลย

        Car car1 = new Car(); // Class Car(Blueprint) , car = variable โดยมี Properties เเละ Behavior ตาม Class
        car1.start(); // เรียกใช้ Method start() [ข้าม class]
        System.out.println("---------------------------------------------------------");
        int b = ac(); //Assign b variable ให้ผูกค่ากับ Method ac()

        System.out.println(helloworld()); // เเสดงข้อมูลจากMethod helloworld()
        System.out.println(ac()); // เเสดงข้อมูลจากMethod ac()
        System.out.println(b); // เเสดงข้อมูลผ่านตัวเเปร b(ที่ผูกการทำงานไว้กับ Method ac() )

    }
//การ return ค่าต้องใส่ประเภทข้อมูลตามค่าที่จะ returnn
    private static String helloworld() // Method helloworld
    {
        return "Hello World"; // คืนค่ากลับให้ main
    }
    private static int ac() // Method ac
    {
        int a = 10;
        int c = 5;
        return a+c;
    }

}
