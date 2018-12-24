package Lab6;

import java.util.StringTokenizer;

public class ex3 {
    public static void main(String[] args) {
        String myMsg = "I am Tiw";
        StringBuffer strBuf = new StringBuffer(myMsg);

        System.out.println(strBuf);
        System.out.println(strBuf.reverse());
        strBuf.append(" Happy New Year,2019");
        System.out.println(strBuf);
        //StringTokenizer
        StringTokenizer token = new StringTokenizer(strBuf.toString());

        System.out.println(token);
        System.out.println(token.countTokens());

        while (token.hasMoreElements()){
            System.out.println(token.nextToken());
        }

    }
}//class
