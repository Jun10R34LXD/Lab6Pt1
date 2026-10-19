
/**
 * Represents a triangle with a name, a base, and a height. Proviedes the area of the triangle.
 *
 * @author Luis Castillo
 * @version V1.0
 * @since 10/18/2026
 */
import java.util.Scanner;
public class Triangle
{
    private String name;
    private double base;
    private double height;
    
    public Triangle(){
        name = "unknown";
        base = 0.0;
        height = 0.0;
    }
    
    public Triangle(String inName, double inBase, double inHeight) {
        name = inName;
        base = inBase;
        height = inHeight;
    }
    
    public void writeOutput() {
        System.out.println("Triangle name is: " + name);
        System.out.println("Triangle base is: " + base);
        System.out.println("Triangle height is: " + height);
        System.out.printf("Triangle area is: %.1f%n", getArea());
    }
    
    public void readInput(){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("What is the triangle's name: ");
        name = keyboard.nextLine();
        
        System.out.print("What is the triangle's base: ");
        base = keyboard.nextDouble();
        
        System.out.print("what is the triangle's height: ");
        height = keyboard.nextDouble();
        
        
    }
    
    public void setName(String newName){
        name = newName;
    }
    
    public void setBase(double newBase){
        base = newBase;
    }
    
    public void setHeight(double newHeight){
        height = newHeight;
    }
    
    private double getArea() {
        return 0.5 * base * height;
    }
}