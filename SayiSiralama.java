import java.util.Scanner;
public class SayiSiralama {
    public static void main(String[] args) {

        //Değişkenlerin tanımlanması işlemi.

        int a,b,c;

        //Sayıların girilme işlemi.

        Scanner input=new Scanner(System.in);

        System.out.print("1.Sayıyı giriniz: ");
        a=input.nextInt();

        System.out.print("2.Sayıyı giriniz: ");
        b=input.nextInt();

        System.out.print("3.Sayıyı giriniz: ");
        c=input.nextInt();

        //Sayıların karşılaştırılma işlemi.

        if((a>b) && (a>c))
            if(b>c)
            {
                System.out.println("a>b>c");
            }
        else
            {
                System.out.println("a>c>b");
            }
        else if((b>a) && (b>c))
            if(a>c)
            {
                System.out.println("b>a>c");
            }
        else
            {
                System.out.println("b>c>a");
            }
        else
            if(a>b)
            {
                System.out.println("c>a>b");
            }
            else
            {
                System.out.println("c>b>a");
            }
    }
}