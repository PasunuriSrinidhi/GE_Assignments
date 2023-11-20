public class CoinFlip {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
      
        int numFlips = scanner.nextInt();

 
        if (numFlips <= 0) {
            System.out.println("Please enter a positive integer for the number of flips.");
            return;
        }

        int headsCount = 0;
        int tailsCount = 0;

       
        for (int i = 0; i < numFlips; i++) {
         
            if (Math.random() < 0.5) {
                tailsCount++;
            } else {
                headsCount++;
            }
        }

       
        double percentageHeads = (headsCount * 100.0) / numFlips;
        double percentageTails = (tailsCount * 100.0) / numFlips;

        System.out.println(percentageHeads);
        System.out.println(percentageTails);
    }
}
