package practica;

public class Histograma {
    public static void main(String[] args) {
        int[] myArray = {1,2,1,3,3,1,2,1,5,1};

        int[] frecuencias = new int[5];

        for (int i = 0; i < myArray.length; i++) {
            frecuencias[myArray[i]-1]++;
        }


        for (int i = 0; i < frecuencias.length; i++) {
            System.out.print(i + 1 + ": ");
            for (int j = 0; j < frecuencias[i]; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
