public class Main {
    public static void main(String[] args) {
    int[] arr = {47,84,75,21,14,14,79};
    bubbleSort(arr);
    System.out.println("Median "+ median(arr));
    System.out.println("Highest Value "+ highestValue(arr));
    System.out.println("Mode is " + mode(arr));



    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i : arr){
            System.out.println(i);
        }
    }

    public static double median(int[] arr){
        int num = arr.length;

        if(num % 2 == 0){
            return (arr[num/2] + arr[num/2 -1] ) /2.0;
        } else {
            return arr[num/2];
        }
    }

    public static int highestValue(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int mode(int[] arr){
        int maxVal = 0;
        int count = 0;
        int macCount = 0;

        for (int i = 0; i < arr.length; i++){
            count = 0;

            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
                if (count > macCount){
                    macCount = count;
                    maxVal = arr[i];
                }
            }
        }
        return maxVal;
    }






}