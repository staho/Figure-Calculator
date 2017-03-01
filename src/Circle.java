/**
 * Created by staho on 01.03.2017.
 */
public class Circle extends Figure{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    double calculatePerimeter(){
        return 2*Math.PI*radius;
    }

    @Override
    double calculateArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void print(){
        System.out.println("Circle with radius: " + radius);
        printInfo();
    }
}
