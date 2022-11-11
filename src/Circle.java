public class Circle {
    private static double radius;

    public Circle(double radius)
    {this.radius = radius;    }
    public static double getRadius() {
            return radius;    }
    public static void setRadius(double radius)
    {        Circle.radius = radius;    }
    public void area()
    {        System.out.println(Math.PI * (radius * radius));    }
    public void circumference(){
        System.out.println(Math.PI*2*radius);    }
}

