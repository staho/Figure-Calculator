/**
 * Created by staho on 01.03.2017.
 */
public abstract class Figure implements Print{
    abstract double calculateArea();
    abstract double calculatePerimeter();

    protected void printInfo(){
        System.out.println("Perimeter of the figure: " + calculatePerimeter());
        System.out.println("Area of the figure: " + calculateArea());
    }

}
