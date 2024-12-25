import java.util.Scanner;
class AscendingSorter extends Thread {
    private int[] numbers;
    public AscendingSorter(int[] numbers) {
        this.numbers = numbers;
    }
    public void run() {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i+1; j < numbers.length ; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];  // Corrected swap logic
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println("Ascending Order: ");
        for (int num:numbers) {
            System.out.println(num + " ");
        }
        System.out.println();
    }
}
class DescendingSorter extends Thread {
    private int[] numbers;
    public DescendingSorter(int[] numbers) {
        this.numbers = numbers;
    }
    public void run() {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i+1; j < numbers.length ; j++) {
                if (numbers[i] < numbers[j ]) {
                    int temp = numbers[i];  // Corrected swap logic
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println("Descending Order: ");
        for (int num : numbers) {
            System.out.println(num + " ");
        }
        System.out.println();
    }
}
public class multithreding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        // Clone the array to avoid thread interference
        AscendingSorter ascendingSorter = new AscendingSorter(numbers.clone());
        DescendingSorter descendingSorter = new DescendingSorter(numbers.clone());

        ascendingSorter.start();
        try {
            ascendingSorter.join();
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
        descendingSorter.start();
        try {
            descendingSorter.join();
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
    }
}