import java.io.*;

class Area
{
    // Area of Circle
    public static double circleArea(double r)
    {
        return Math.PI * r * r;
    }

    // Area of Square
    public static double squareArea(double side)
    {
        return side * side;
    }

    // Area of Rectangle
    public static double rectArea(double height, double width)
    {
        return height * width;
    }

    // Area of Triangle
    public static double triArea(double base, double height)
    {
        return 0.5 * base * height;
    }

    // Read line from keyboard
    public static String readLine()
    {
        String input = "";
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            input = in.readLine();
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e);
        }
        return input;
    }

    public static void main(String args[])
    {
        // Circle
        System.out.println("Enter the radius:");
        double radius = Double.parseDouble(readLine());
        System.out.println("Area of Circle = " + circleArea(radius));

        // Square
        System.out.println("Enter the side:");
        double side = Double.parseDouble(readLine());
        System.out.println("Area of Square = " + squareArea(side));

        // Rectangle
        System.out.println("Enter the width:");
        double width = Double.parseDouble(readLine());

        System.out.println("Enter the height:");
        double height = Double.parseDouble(readLine());

        System.out.println("Area of Rectangle = " + rectArea(height, width));

        // Triangle
        System.out.println("Enter the base:");
        double base = Double.parseDouble(readLine());

        System.out.println("Enter the height:");
        double tHeight = Double.parseDouble(readLine());

        System.out.println("Area of Triangle = " + triArea(base, tHeight));
    }
}
