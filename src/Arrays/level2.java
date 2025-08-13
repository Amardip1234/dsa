package Arrays;

public class level2 {
    public static void printArray(int[]arr){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

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

    public static void reverse(int[]arr,int st, int end){
        while (st<end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }
    public static void rotateArray(int[]arr, int k){
        int st = 0,end = arr.length-1;  // [2,3,1,5,7]
        reverse(arr,arr.length-k,end);// [5,7,2,3,1]
        reverse(arr,st,arr.length-k-1);
        reverse(arr,st,end);

    }
    public static void main(String[] args) {
        int[]arr = {2,3,1,6,4,5};
        System.out.println(secondLargest(arr));
        printArray(arr);
        rotateArray(arr,2);
//        reverse(arr,0,arr.length-1);
        printArray(arr);
    }
}
