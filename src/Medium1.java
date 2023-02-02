import java.util.Arrays;

/***
 * Goal: Determine and print the median of array "a"
 * Rating: MEDIUM
 */

public class Medium1 {

    public int[] a;
    public int median;
    public boolean even = false;

    public static void main(String[] args) {
        Medium1 practice = new Medium1();
    }

    public Medium1() {

        a = new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }

        /***
         * Your code goes here
         */
        // hint 1: arrays.sort(a)
        // hint 2: google java modulus

        Arrays.sort(a);
            if (a.length % 2 > 0) {
                even = true;
            }

            if (a.length - 1 % 2 == 0) {
                even = false;
                median = a[a.length / 2];
            }






            System.out.println("The median is " + median);

        }

    }

