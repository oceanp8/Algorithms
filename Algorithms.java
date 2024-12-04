import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

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
        double average = average();
        ArrayList<Integer> mode = mode();
        System.out.println("Odds: " + odds);
        System.out.println("Evens: " + evens);
        System.out.println("Double Digits: " + doubleDigits);
        System.out.println("Numbers greater than 500: " + fiveHundred);
        System.out.println("The greatest number is: " + greatest);
        System.out.println("The smallest number is: " + small);
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + average);
        System.out.println("The mode is: " + mode);
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
        int small = 1000;
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
    public static double average() throws FileNotFoundException {
        Scanner s = new Scanner(f);
        double average = 0;
        double newSum = 0;
        double count =0;
        while (s.hasNext()){
            newSum = newSum + s.nextInt();
            count ++;
        }
        average = newSum/count;
        s.close();
        return average;
    }

    public static ArrayList<Integer> mode() throws FileNotFoundException {
        Scanner s = new Scanner(f);
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> frequencies = new ArrayList<>();
        ArrayList<Integer> mode = new ArrayList<>();
        int maxFrequency = 0;
    
        // Read numbers from the file
        while (s.hasNextInt()) {
            int num = s.nextInt();
            if (numbers.contains(num)) {
                int index = numbers.indexOf(num);
                frequencies.set(index, frequencies.get(index) + 1);
            } else {
                numbers.add(num);
                frequencies.add(1);
            }
        }
    
        for (int freq: frequencies) {
            if (freq > maxFrequency) {
                maxFrequency = freq;
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            if (frequencies.get(i) == maxFrequency) {
                mode.add(numbers.get(i));
            }
        }
        s.close();
        return mode;
    }
}
    