import java.util.Scanner;

public class Circles {

    public static double distanceToCenter(double x, double y) {
        return Math.sqrt(x * x + y * y);
    }


    public static double circleArea(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double searchIntersection(double pizzaArea,double pizzaRadius, double distanceToCenter){
        double neededArea = 0;
        double radius = distanceToCenter;
        double[] radiuses = new double[2];
        double iArea = 0;
        while(iArea != (pizzaArea / 3.0)){
            iArea = areaOfIntersection(pizzaRadius, radius, distanceToCenter);
            radius /= 2.0;
        }
        return 0.0;
    }

    public static double areaOfIntersection(double radius1, double radius2, double distance){
        double r = radius1;
        double R = radius2;
        if(R < r){
            // swap
            r = radius2;
            R = radius1;
        }
        double part1 = r*r*Math.acos((distance * distance + r*r - R*R)/(2* distance *r));
        double part2 = R*R*Math.acos((distance * distance + R*R - r*r)/(2* distance *R));
        double part3 = 0.5*Math.sqrt((-distance +r+R)*(distance +r-R)*(distance -r+R)*(distance +r+R));

        return part1 + part2 - part3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pizzaRadius = scanner.nextDouble();
        double x = scanner.nextDouble(),
                y = scanner.nextDouble();

        double pizzaArea = circleArea(pizzaRadius);


    }

}
