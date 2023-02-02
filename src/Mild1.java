/***
 * Goal: Determine and print the sum of array "a"
 * Method 1: no loop
 * Method 2: for loop
 * Method 3: for each loop
 * Rating: MILD
 */

public class Mild1 {

    public int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        Mild1 practice = new Mild1();
    }

    public Mild1() {

        int sum = 0;

        /***
         * Your code goes here
         */
//        sum = a[0]+a[2]+a[3]+a[4]+a[5]+a[6]+a[7]+a[8]+a[9];
//        sum = sum + a[0];
//        sum = sum + a[1];
//        sum = sum + a[2];
//        sum = sum + a[3];
//        sum = sum + a[4];
//        sum = sum + a[5];
//        sum = sum + a[6];
//        for (int i = 0; i < a.length; i++){
////            System.out.println(a[i]);
//            sum = sum + a[i];


//        }
        for (int element : a){
            sum = sum + element;
        }


        System.out.println("The sum is " + sum);

    }

}