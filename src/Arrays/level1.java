package Arrays;

public class level1 {
    public static int largest(int[]arr){
        int large = arr[0];

        for (int i = 0; i<arr.length; i++){
            if (arr[i]>large){
                large = arr[i];
            }
        }

        return large;
    }
    public static void main(String[] args) {
        int[]arr = {2,3,1,6,4};
        System.out.println(largest(arr));
    }
}
