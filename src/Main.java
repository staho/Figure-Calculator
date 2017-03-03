/**
 * Created by staho on 01.03.2017.
 */
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Figure myFigure;
    public static void main(String args[]) throws BadDataInputException{
        Scanner scanner = new Scanner(System.in);
        boolean areWeStillRunning = true;
        while(areWeStillRunning){

            System.out.println("Which of the figures do you want to create?");
            System.out.println("1 - Square");
            System.out.println("2 - Triangle");
            System.out.println("3 - Circle");
            System.out.println("4 - Exit");

            switch(scanner.nextInt()){
                case 1:
                    System.out.println("Please enter length of square side");
                    double sideLength = scanner.nextDouble();
                    if(sideLength > 0)
                        myFigure = new Square(sideLength);
                    else throw new BadDataInputException("Length of a square side MUST be greater than zero!");
                    break;

                case 2:
                    double [] sides = new double[3];
                    System.out.println("Please enter first length of triangle side: ");
                    sides[0] = scanner.nextDouble();
                    System.out.println("Second side: ");
                    sides[1] = scanner.nextDouble();
                    System.out.println("Third side: ");
                    sides[2] = scanner.nextDouble();
                    if(sides[0] < 0 && sides[1] < 0 && sides[2] < 0)
                        throw new BadDataInputException("All lengths of triangle sides HAVE TO be greater than zero!");

                    Arrays.sort(sides);
                    if(sides[2] < (sides[1] + sides[0]))
                        myFigure = new Triangle(sides[0], sides[1], sides[2]);
                    else
                        throw new BadDataInputException("Longest of triangle sides HAVE TO be smaller than sum of two other sides");
                    break;

                case 3:
                    System.out.println("Please input radius of circle");
                    double r = scanner.nextDouble();
                    if(r > 0)
                        myFigure = new Circle(r);
                    else throw new BadDataInputException("Radius of a circle HAVE TO be greater than zero!");
                    break;

                case 4:
                    areWeStillRunning = false;
                    break;

                default:
                    throw new BadDataInputException("There is no such option!");

            }
            if(areWeStillRunning)
                 myFigure.printInfo();
        }

    }
}
