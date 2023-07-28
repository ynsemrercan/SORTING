import java.util.Scanner;
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dimension;

        System.out.println("Dizinin Boyutunu Giriniz : ");
        dimension = input.nextInt();

        int[] list = new int[dimension];

        System.out.println("Dizinin Elemanlarını Giriniz : ");


        int i = 0;
        while (i < dimension) {
            System.out.println("Dizinin " + i + ". elemanı ?:");
            list[i] = input.nextInt();
            i++;
        }
        Arrays.sort(list);

        System.out.println("Sıralanmış sayılar (büyükten küçüğe):");
        for (int j = dimension - 1; j >= 0; j--) {
            System.out.println(list[j]);
        }

    }
}