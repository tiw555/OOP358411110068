package Lab4;
import java.util.Scanner;
import java.util.Scanner;

public class Quiz2_Operators {
    public static void main(String[] args) {
        int w, h;
        Scanner sc = new Scanner(System.in);
        System.out.print("จำนวนที่1: ");
        w = sc.nextInt();
        System.out.print("จำนวนที่2:");
        h = sc.nextInt();

        int t = summation(w, h);
        System.out.println("บวก = " + t);
        int r = sub(w,h);
        System.out.println("ลบ = "+r);
        int o = mult(w,h);
        System.out.println("คูณ = "+o);
        int m = divt(w,h);
        System.out.println("หาร = "+m);
    }

    private static int divt(int w, int h) {
        return w/h;
    }


    private static int mult(int w, int h) {
        return w*h;
    }

    private static int sub(int w, int h) {
        return w-h;
    }

    private static int summation(int w, int h) {
        return w+h;

    }//main






}//class


