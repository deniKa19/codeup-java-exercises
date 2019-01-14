package shapes;


public class Circle {
        private double radius;
        private static int numberOfCircles = 0;

        public Circle(double radius) {
            this.radius = radius;
            numberOfCircles++;
    }

    public double getArea() {
        /*double pi = 3.14;
        double area = pi * (radius* 2);
        return area;*/
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        /*double pi = 3.14;
        double circumference = 2 * pi * radius;*/
        return 2 * Math.PI * radius;
    }
    public double getDiameter() {
            return 2 * radius;
    }

    public double getRadius() {
            return radius;
    }
}
