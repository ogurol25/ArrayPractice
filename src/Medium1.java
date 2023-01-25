/***
 * Goal: Determine and print the median of array "a"
 * Rating: MEDIUM
 */

public class Medium1 {

    public int[] a;
    public int median;

    public static void main(String[] args) {
        Medium1 practice = new Medium1();
    }

    public Medium1() {

        a = new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random()*100);
        }

        /***
         * Your code goes here
         */

        System.out.println("The median is " + median);

    }

}