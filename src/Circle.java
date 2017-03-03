/**
 * Created by staho on 01.03.2017.
 */
public class Circle extends Figure{
    //fields
    private double radius;

    //setters and getters
    private double getRadius() {
        return radius;
    }

    private void setRadius(double radius) {
        this.radius = radius;
    }

    //constructors
    public Circle(double radius){
        setRadius(radius);
    }


    //overrided methods
    @Override
    double calculatePerimeter(){
        return 2*Math.PI*getRadius();
    }

    @Override
    double calculateArea(){
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public void print(){
        System.out.println("Circle with radius: " + getRadius());
        printInfo();
    }
}
