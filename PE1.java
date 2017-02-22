/**
 * Created by Chavidula on 11/02/2017.
 */
public class PE1 {
    public static void main(String[] args) {
        int a = 1000 / 3;
        int b = 1000 / 5;
        int sum = 0;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;

        int k,i,j ;

        for(i=0;i<=a;i++){
            sum1=sum1+(i*3);
        }

        for( j=0;j<=(b-1);j++){
            sum2=sum2+(j*5);
        }

        sum=sum1+sum2;

        for(k=1;k<67;k++){
            sum3=sum3+(k*3*5);
        }


        sum4=sum-sum3;

        System.out.println(sum4);
    }
}
