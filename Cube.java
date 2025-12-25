public class Cube
{
    int length, breadth, height;

    // Method to calculate volume
    int getVolume()
    {
        return (length * breadth * height);
    }

    // Default constructor
    Cube()
    {
        length = breadth = height = 2;
        System.out.println("Initialized with default constructor");
    }

    // Parameterized constructor with 2 parameters
    Cube(int l, int b)
    {
        length = l;
        breadth = b;
        height = 2;
        System.out.println("Initialized with parameterized constructor having 2 parameters");
    }

    // Parameterized constructor with 3 parameters
    Cube(int l, int b, int h)
    {
        length = l;
        breadth = b;
        height = h;
        System.out.println("Initialized with parameterized constructor having 3 parameters");
    }

    public static void main(String args[])
    {
        // Object using default constructor
        Cube cubeObj1 = new Cube();
        System.out.println("Volume of cube 1 is: " + cubeObj1.getVolume());

        // Object using 2-parameter constructor
        Cube cubeObj2 = new Cube(10, 20);
        System.out.println("Volume of cube 2 is: " + cubeObj2.getVolume());

        // Object using 3-parameter constructor
        Cube cubeObj3 = new Cube(10, 20, 30);
        System.out.println("Volume of cube 3 is: " + cubeObj3.getVolume());
    }
}
