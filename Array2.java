import java.util.Arrays;

/**
 * Created by Chavidula on 11/02/2017.
 */
public class Array2 {
    public static void main(String[] args) {
        int[] a = {3, 5, 6, 8, 4};
        String b = Arrays.toString(a);
        System.out.println(b);

        int c[]=new int [5];
        for(int i=0;i<a.length;i++)
            c[i] = a[(a.length-1) - i];
            String d = Arrays.toString(c);

            System.out.println(d);


    }
}
