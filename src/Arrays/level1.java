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

    public static int smallest(int[]arr){
        int small = Integer.MAX_VALUE;

        for (int i = 0; i<arr.length; i++){
            if (arr[i]<small){
                small = arr[i];
            }
        }
        return small;
    }

    public static int count(int[]arr){
        int count = 0;
        for (int i = 0; i<arr.length; i++){
            count+=arr[i];
        }
        return count;
    }

    public static void countOddEven(int[]arr){
        int odd = 0, Even = 0;

        for (int i = 0; i<arr.length; i++){
            if (arr[i]%2==0){
                Even++;
            }else{
                odd++;
            }
        }
        System.out.println("Odd :"+odd);
        System.out.println("Even :"+Even);
    }

    public static int[] reverseArray(int[]arr){
        int[]reversed  = new int[arr.length];
        int index = 0;
        for (int i = arr.length-1; i>=0; i--){
            reversed[index++] = arr[i];
        }
    }
    public static void main(String[] args) {
        int[]arr = {2,3,1,6,4};
        System.out.println(largest(arr));
        System.out.println(smallest(arr));
        System.out.println(count(arr));
        countOddEven(arr);

    }
}
