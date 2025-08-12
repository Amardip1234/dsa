package Arrays;

public class level2 {

    public static int largest(int[]arr){
        int large = arr[0];

        for (int i = 0; i<arr.length; i++){
            if (arr[i]>large){
                large = arr[i];
            }
        }

        return large;
    }

    public static int secondLargest(int[]arr){
        int largest = largest(arr);
        int slargest = arr[0];
        for (int i = 0; i<arr.length; i++){
            if (arr[i]<largest && arr[i]>=slargest){
                slargest = arr[i];
            }
        }
        return slargest;
    }
    public static void main(String[] args) {
        int[]arr = {2,3,1,6,4,5};
        System.out.println(secondLargest(arr));
    }
}
