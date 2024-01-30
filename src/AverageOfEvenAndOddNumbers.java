import java.util.Scanner;

public class AverageOfEvenAndOddNumbers {

    public static double computeAverageOfEvenNumbers(int number, int count){
        double average = 0.0;

        average = number / count;

        return average;
    }

    public static double computeAverageOfOddNumbers(int number, int count){
        double average = 0.0;

        average = number / count;

        return average;
    }

    public static void main(String[] args) {
        int number = 0;
        double averageOfEvenNumbers = 0.0;
        double averageOfOddNumbers = 0.0;
        String answer = "yes";
        int countEven = 0;
        int countOdd = 0;
        int sumOfEven = 0;
        int sumOfOdd = 0;

        Scanner scanner = new Scanner(System.in);

        while(answer.equalsIgnoreCase("yes")){
            System.out.println("Please enter a number");
            number = scanner.nextInt();
            if(number % 2 == 0) {
                countEven += 1;
                sumOfEven = sumOfEven + number;
            }
            else if(number % 2 != 0) {
                countOdd += 1;
                sumOfOdd = sumOfOdd + number;
            }
            System.out.println("Would you like to enter a new number? " +
                    "or you will see the average of odd and even" +
                    " numbers you have entered.");
            answer = scanner.next();
        }

        if(countEven >= 1)
          averageOfEvenNumbers = computeAverageOfEvenNumbers(sumOfEven, countEven);
        if(countOdd >= 1)
            averageOfOddNumbers = computeAverageOfOddNumbers(sumOfOdd, countOdd);

        System.out.println("average of odd: " + averageOfOddNumbers);
        System.out.println("average of even: " + averageOfEvenNumbers);
    }
}
