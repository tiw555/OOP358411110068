package Lab8;

public class GraphicObjectApp {
    public static void main (String[] args){

        Rectangle rec = new Rectangle(10.0,5.0);
        rec.setColor("สีดำ");
        rec.draw();
        rec.findArea();
        System.out.println(rec.findArea());
        System.out.println(rec.getColor());
        System.out.println(rec.getWidth());
        System.out.println(rec.getHigh());

       circle cir = new circle(50.0);
               cir.setColor("สีดำ");
       System.out.println("The area of my circle is: "+cir.findArea());









    }//main
}//class
