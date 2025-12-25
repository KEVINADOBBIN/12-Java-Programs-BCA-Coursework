public class ThisDemo {

    int i, j;

    // No-argument constructor
    ThisDemo() {
        this(100);
    }

    // One-argument constructor
    ThisDemo(int a) {
        this(a, 200);
    }

    // Two-argument constructor
    ThisDemo(int i, int j) {
        this.i = i;
        this.j = j;
    }

    // Display method
    void display() {
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }

    public static void main(String[] args) {
        ThisDemo obj = new ThisDemo();
        obj.display();
    }
}
