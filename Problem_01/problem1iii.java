
public class problem1iii {
    
    public static void main(String[] args){
        //testing
        int[] arr= {1, 3, 6, 7, 12};

        System.out.println(minGap(arr, 5));
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
