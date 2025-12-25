public class Factorial {
    public static void main(String args[]) {
        if (args.length == 0) {
            System.out.println("No command line arguments");
            return;
        }

        int[] arr = new int[args.length]; // use args.length instead of 10

        // Convert command-line arguments to integers
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }

        // Calculate factorial for each number
        for (int i = 0; i < args.length; i++) {
            int fact = 1;
            int num = arr[i];
            while (num > 0) {
                fact = fact * num;
                num--;
            }
            System.out.println("Factorial of " + arr[i] + " is " + fact);
        }
    }
}
