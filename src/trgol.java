import java.util.Scanner;

public class trgol {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {2, 3, 4, 0};
        int arr2[] = {1, 1, 1, 1};
        char[] cha = {'m', 'o', 'm'};

        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//            System.out.print("\t");
        }
//        int x = 2;
//        System.out.println(check(arr,x));
//        System.out.println(check(arr2,x));
//
//        System.out.println(maxNum(arr));
//
//        System.out.println(sameNum(arr,2));

//        System.out.println(sort(arr));

        System.out.println(Palindrome(cha));
    }
    public static boolean check(int[] arr, int x ) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return true;
            }
        }
        return false;
    }//2
    public static int maxNum(int[] arr) {
int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
                if (arr[i]>max){
                    max= arr[i];
                }
            }
        return max;
    }//3
    public static int sameNum(int[] arr, int num){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                count++;
            }

        }
        return count;

    }//4
    public static boolean sort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }

        }
        return true;

    } //5

    public static boolean Palindrome(char[] cha) {
        int j = cha.length-1;
        for (int i = 0; i < cha.length; i++) {
                if (cha[i] != cha[j]) {
                    return false;
                }
                j--;
            }
        return true;
    }
    }
