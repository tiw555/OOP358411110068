package Lab3;
import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        Scanner aa = new Scanner(System.in);
        System.out.print("คุณชื่ออะไร?:");
        name = sc.nextLine();

        System.out.println("สวัสดี" + name);
        //age
        System.out.print("คุณอายุเท่าไหร่?:");
        int age = aa.nextInt();
        System.out.println("ฉันอายุ" + age + "ปี.");
        if (age < 30)
            System.out.println("ฉันอายุน้อย");
        else
            System.out.println("คุณอายุน้อย");

        System.out.print("คุณเพศอะไร?:");
        String sex = sc.nextLine ();
        System.out.println("เพศ"+sex+" ");

        System.out.print("คุณอยู่ที่ไหน?:");
        String add = sc.nextLine ();
        System.out.println("ฉันอยู่ที่"+add+ " ");

        System.out.print("คุณใช้เบอร์อะไร?:");
        String phen = sc.nextLine ();
        System.out.println("เบอร์"+phen+ " ");





    }//main


        }//class
