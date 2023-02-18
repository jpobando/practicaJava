package practica;

public class higherValue {
    public static void main(String[] args) {

        int[] myArray = {13, 2, 4, 35, 1};
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < myArray.length; i++) {
            if ( myArray[i] >= max ) {
                max = myArray[i];
            }
        }
        System.out.println(max);

    }
}
