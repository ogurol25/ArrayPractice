/***
 * Goal: Determine whether array "a" contains a certain value "b"
 * The output of your program should be a print statement, either:
 * "The array does not contain value ___" OR
 * "The array contains value ___"
 * (and have it print the value, not underscores)
 * Rating: MILD
 */

public class Mild3 {

    public int[] a;
    public int b;
    public boolean t = false;
    public static void main(String[] args) {
        Mild3 practice = new Mild3();
    }

    public Mild3() {

        a = new int[50];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int)(Math.random()*100);
        }

        b = 45;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == 45 ){

                System.out.println("the array contains value " + b);
                t = true;
            }

        }

        if(t == false){
            System.out.println("the array does not contain value " + b);
        }

        /***
         * Your code goes here
         */

    }

}