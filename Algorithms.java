import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Algorithms {
    private static File f;

    public static void main(String[] args) throws FileNotFoundException {
        f = new File("Numbers.txt");
        int odds = odds();
        int evens = evens();
        int doubleDigits = doubleDigits();
        int fiveHundred = fiveHundred();
        int greatest = greatest();
        int small = small();
        int sum = sum();
        int average = average();
        System.out.println("Odds: " + odds);
        System.out.println("Evens: " + evens);
        System.out.println("Double Digits: " + doubleDigits);
        System.out.println("Numbers greater than 500: " + fiveHundred);
        System.out.println("The greatest number is: " + greatest);
        System.out.println("The smallest number is: " + small);
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);
    }

    public static int odds() throws FileNotFoundException {
        Scanner s = new Scanner(f);
        int odds = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 != 0)
                odds++;
        }
        s.close();
        return odds;
    }

    public static int evens() throws FileNotFoundException {
        Scanner s = new Scanner(f);
        int evens = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 == 0)
                evens++;
        }
        s.close();
        return evens;
    }
    
    public static int doubleDigits() throws FileNotFoundException {
        Scanner s = new Scanner(f);
        int doubleDigits = 0;
        while (s.hasNext()) {
            int num = s.nextInt();
            if (num >= 10 && num <= 99) doubleDigits++;
        }
        s.close();
        return doubleDigits;
    }

    public static int fiveHundred() throws FileNotFoundException {
        Scanner s = new Scanner(f);
        int fiveHundred = 0;
        while (s.hasNext()){
            if (s.nextInt()>500)
                fiveHundred++;
        }
        s.close();
        return fiveHundred;
    }
    public static int greatest() throws FileNotFoundException {
        Scanner s = new Scanner(f);
        int greatest = 0;
        while (s.hasNext()){
            if (s.nextInt()>greatest)
            greatest = s.nextInt();
        }
        s.close();
        return greatest;
    }
    public static int small() throws FileNotFoundException {
        Scanner s = new Scanner(f);
        int small = 0;
        while (s.hasNext()){
            if (s.nextInt()<small)
            small = s.nextInt();
        }
        s.close();
        return small;
    }
    public static int sum() throws FileNotFoundException {
        Scanner s = new Scanner(f);
        int sum = 0;
        while (s.hasNext()){
            sum = s.nextInt() + sum;
        }
        s.close();
        return sum;
    }
    public static int average() throws FileNotFoundException {
        Scanner s = new Scanner(f);
        int average = 0;
        int newSum = 0;
        int count =0;
        while (s.hasNext()){
            newSum = newSum + s.nextInt();
            count ++;
        }
        average = newSum/count;
        s.close();
        return average;
    }
}
