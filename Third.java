class First {

    // Zero-argument constructor
    First() {
        System.out.println("Called zero argument constructor of First");
    }

    // Single-argument constructor
    First(int a) {
        System.out.println("Called single argument constructor of First");
    }

    void eat() {
        System.out.println("Method eat() of First class");
    }
}

class Second extends First {

    // Zero-argument constructor
    Second() {
        System.out.println("Called zero argument constructor of Second");
    }

    // Single-argument constructor
    Second(int a) {
        super(a);
        System.out.println("Called single argument constructor of Second");
    }
}

class Third extends Second {

    // Zero-argument constructor
    Third() {
        System.out.println("Called zero argument constructor of Third");
    }

    // Single-argument constructor
    Third(int a) {
        super(a);
        System.out.println("Called single argument constructor of Third");
    }

    public static void main(String[] args) {

        // Object using zero-argument constructor
        Third t1 = new Third();

        // Object using single-argument constructor
        Third t2 = new Third(100);
    }
}
