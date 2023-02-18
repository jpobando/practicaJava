package practica;

public class equis {
    public static void main(String[] args) {
        int n = 11;
        int k = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                if(( i == j) || ( j == (n-k))) {
                    System.out.print("X");
                } else {
                    System.out.print("_");
                }
            }
            System.out.print("\n");
            k++;
        }
    }
}
