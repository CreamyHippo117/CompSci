package Day5;
public class RectangleTester {
    public static void main(String[] args) {
        
        Rectangle rect1 = new Rectangle(5,10);
        Rectangle rect2 = new Rectangle(5,10);
    

    System.out.println("Length: " + rect1.getLength());
    System.out.println("Width: " + rect1.getWidth());
     System.out.println("Area: " + rect1.calculateArea());
     System.out.println("Perimeter: " + rect1.calculatePerimeter());
     System.out.println("Diagonal: : " + rect1.calculateDiagonal());

    System.out.println(rect1.toString());
    System.out.println(rect1.equals(rect2));
    }
}
