public class PowerOf2 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java PowerOf2 <N>");
        } else {
            try {
                int n = Integer.parseInt(args[0]);
                printPowersOf2(n);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please provide a valid integer value for N.");
            }
        }
    }

    public static void printPowersOf2(int n) {
        if (n >= 0 && n < 31) {
            int i = 0;
            int powerOf2 = 1;
            while (i <= n) {
                System.out.println("2^" + i + " = " + powerOf2);
                i++;
                powerOf2 *= 2;
            }
        } else {
            System.out.println("Input out of range. Please provide a value between 0 and 30.");
        }
    }
}
