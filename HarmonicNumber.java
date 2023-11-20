public class HarmonicNumber {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
       
        int N = scanner.nextInt();

        
        if (N <= 0) {
            System.out.println("N should be greater than 0.");
            return;
        }

        double harmonicValue = 0.0;
        for (int i = 1; i <= N; i++) {
            harmonicValue += 1.0 / i;
        }

     
        System.out.printf("The %dth Harmonic Value is: %.5f\n", N, harmonicValue);
    }
}
