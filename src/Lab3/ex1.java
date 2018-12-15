package Lab3;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {


        String name;
        Scanner sc = new Scanner(System.in);

        System.out.print("คุณชื่ออะไร?:");
        name = sc.nextLine();

        System.out.println("สวัสดี"+name);
        //age
        System.out.print("คุณอายุเท่าไหร่?:");
        int age = sc.nextInt();
        System.out.println("ฉันอายุ"+age+"ปี.");
        if (age < 30)
            System.out.println("ฉันอายุน้อย");
        else
            System.out.println("คุณอายุน้อย");



    }//main
}//class
