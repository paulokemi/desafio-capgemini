public class Piramide {
    public static void main(String[] args) {
        int n = 6;
        int i, j;
        // loop para lidar com o numero de linhas
        for (i = 0; i < n; i++) {
            // manipular os espaços em branco
            for (j = 2 * (n - i); j >= 0; j--) {
                // printar os espaços
                System.out.print(" ");
            }
            //  manipular o numero de colunas
            for (j = 0; j <= i; j++) {
                // printing stars
                System.out.print("* ");
            }
            // pular linha
            System.out.println();
        }
    }
}
