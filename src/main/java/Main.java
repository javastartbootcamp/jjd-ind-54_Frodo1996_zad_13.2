import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.run(new Scanner(System.in));
    }

    public void run(Scanner scanner) {
        List<Integer> numbers = new ArrayList<>();
        addNumbersToList(scanner, numbers);
        readReversedList(numbers);
        sumNumbersFromList(numbers);
        printHighestNumber(numbers);
        printLowestNumber(numbers);
    }

    private void printHighestNumber(List<Integer> numbers) {
        int highestNumber = 0;
        for (Integer number : numbers) {
            if (number > highestNumber) {
                highestNumber = number;
            }
        }
        System.out.println("Największa liczba w liście to " + highestNumber);
    }

    private void printLowestNumber(List<Integer> numbers) {
        int lowestNumber = Integer.MAX_VALUE;
        for (Integer number : numbers) {
            if (number < lowestNumber) {
                lowestNumber = number;
            }
        }
        System.out.println("Najmniejsza liczba w liście to " + lowestNumber);
    }

    private static void addNumbersToList(Scanner scanner, List<Integer> numbers) {
        int option;
        System.out.println("Podaj liczby dodatnie, które zostaną zapisane w liście cyfr:");
        do {
            option = scanner.nextInt();
            if (option > 0) {
                numbers.add(option);
            }
        } while (option > 0);
    }

    private static void sumNumbersFromList(List<Integer> numbers) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (Integer number : numbers) {
            sb.append(number);
            sb.append(" + ");
            sum += number;
        }
        sb.replace(sb.length() - 2, sb.length() - 1, "=");
        System.out.print(sb);
        System.out.println(sum);
    }

    private static void readReversedList(List<Integer> numbers) {
        StringBuilder sb = new StringBuilder();
        for (int i = numbers.size(); i > 0; i--) {
            sb.append(numbers.get(i - 1)).append(", ");
        }
        sb.replace(sb.length() - 2, sb.length() - 1, "");
        System.out.println(sb);
    }
}