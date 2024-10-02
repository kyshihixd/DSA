import java.util.Arrays;
import java.util.Scanner;

public class prob1i {
    public static void main(String[] args) {
        int arr[] = { 2, 5, 7, 8, 8 };
        System.out.println(median());

    }

    public static int arrToNum(int arr[]) {
        int num = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            num += arr[i] * Math.pow(10, i);
        }
        return num;
    }

    public static double median() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int arr_size = 0;
        
        arr_size = sc.nextInt();
    

        int[] arr = new int[arr_size];

        System.out.println(
                "Enter the elements: ");
        for (int i = 0; i < arr_size; i++) {
            
            arr[i] = sc.nextInt();
            
        }

        Arrays.sort(arr);
        if (arr.length % 2 != 0)
            return (double) arr[arr.length / 2];

        return (double) ((arr[(arr.length - 1) / 2] + arr[arr.length / 2]) / 2.0);

    }

    public static int minGap(int[] arr, int i) {
        if (i < 2) {
            return 0;
        }

        int min = Math.abs(arr[1] - arr[0]);
        for (int x = 2; x < arr.length; x++) {
            int temp = Math.abs(arr[x] - arr[x - 1]);
            if (min > temp) {
                min = temp;
            }
        }
        return min;
    }
}
