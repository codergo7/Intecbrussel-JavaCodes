package be.intecbrussel.excercises;

public class Excercise17_09 {
    public static void main(String[] args) {

        int counter =0;

        for(int i=2; i<=1000;i++){
            boolean isPrime = true;

            for(int k = 2; k<i;k++){
                if( i%k==0){
                    isPrime=false;
                    break;
                }
            }

            if (isPrime){
                System.out.println(i);
                counter++;
            }
        }
        System.out.println("Number of prime numbers between 0 and 1000: " + counter);

    }
}
