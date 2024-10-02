public class problem1i {
    public static void main(String[] args) {
        int arr[] = { 2,0,1,8 };
        System.out.println(arrToNum(arr));
        //testing
    }
    //Write a function to convert array to number. (10pts) 
    //Suppose we have loaded an array with the digits of an integer, where the highest power is kept in position 0, 
    //next highest in position 1, and so on.  
    //The ones position is always at position array.Length - 1: 
    //int[] digits = { 2, 0, 1, 8 }; 
    public static int arrToNum(int arr[]) {
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            num += arr[i] * Math.pow(10, arr.length-i-1);
        }
        return num;
    }
}
