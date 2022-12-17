package Arrays;
import java.util.*;
import java.util.Collection.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
//        System.out.println(getMax(a));
//        System.out.println(getMin(a));
//        System.out.println(getSum(a));
//        System.out.println(linear_search(b, 3));
//        reverseArray(b);
//        swap_alternate(b);
//        System.out.println(find_unique(c));
//        System.out.println(find_duplicate(e))
//        System.out.println(find_intersection_version_2(A, B));
//        System.out.println(find_pair_sum(arr, 5));
        int[] A = {1,1,0,0,0,0,1,0};
        sort_01(A);
        for (int i : A){
            System.out.println(i);
        }
    }

    public static int getMax(int [] arr){
        int max = Integer.MIN_VALUE;
        for (int i=0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i=0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static int getSum(int[] arr){
        int sum = 0;
        for (int i=0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static int linear_search(int[] arr, int key){
        for (int i=0; i < arr.length; i++){
            if (arr[i] == key){
                return i;
            }
        }

        return -1;
    }

    public static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }

    public static void swap_alternate(int[] arr){

        for (int i=0; i < arr.length; i +=2){
            if (i+1 <= arr.length-1){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

    }

    public static int find_unique(int[] arr){
        int unique = arr[0];
        for (int i=1; i < arr.length; i++){
            unique ^= arr[i];
        }

        return unique;
    }

    public static int find_duplicate(int[] arr){
        int ans = 0;
        for (int i=0; i < arr.length; i++){
            ans ^= arr[i];
        }

        for (int j=1; j < arr.length; j++){
            ans ^= j;
        }

        return ans;
    }

    public static ArrayList<Integer> find_intersection(int[] A, int[] B){
        int index = 0, ans=0;
        ArrayList<Integer> resultant = new ArrayList<>();
        for (int i=0; i < A.length; i++){
            ans = A[i] ^ B[index];
            if (ans == 0){
                resultant.add(A[i]);
                index++;
            }
        }

        return resultant;
    }

    public static ArrayList<Integer> find_intersection_version_2(int[] A, int[] B){
        int i=0, j=0;
        ArrayList<Integer> resultant = new ArrayList<>();
        while (i < A.length && j < B.length){
            if (A[i] == B[j]){
                resultant.add(A[i]);
                i++;
                j++;
            }else if (A[i] < B[j]){
                i++;
            }else{
                i++;
            }
        }
        return resultant;
    }

    public static ArrayList<ArrayList<Integer>> find_pair_sum(int[] arr, int sum){
        ArrayList<ArrayList<Integer>> pairSum = new ArrayList<>(arr.length);

        for (int i=0; i < arr.length-1; i++){
            int index = arr[i];
            for (int j=i+1; j < arr.length; j++){
                if (j < arr.length){
                    if ((index + arr[j]) == sum){
                        pairSum.add(new ArrayList<Integer>(2));
                        pairSum.get(i).add(Math.min(index, arr[j]));
                        pairSum.get(i).add(Math.max(index, arr[j]));
                    }
                }
            }
        }

        return pairSum;
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sort_01(int[] arr){
        int i = 0;
        int j = arr.length-1;

        while (i < j){
            if (arr[i] == 0 && arr[j] == 1){
                i++;
                j--;
            }else if (arr[i] != 0 && arr[j] != 1){
                swap(arr, i, j);
                i++;
                j--;
            }else if (arr[i] == 0 && arr[j] == 0){
                i++;
            }else if (arr[i] == 1 && arr[j] == 1){
                j--;
            }
        }
    }



}
