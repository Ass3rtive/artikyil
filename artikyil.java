import java.util.Scanner;
public class artikyil {
    public static void main(String[] args) {

        int tarih,tarih1,tarih2,tarih3;
        Scanner input = new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        tarih = input.nextInt();

        if(tarih % 4 == 0 && tarih % 100!=0 || tarih % 400==0){
            System.out.print("Artık YIl");
        }else{
            System.out.print("Artık YIl Değildir");
        }
        /**
         * @author Erdem AYDEMİR.
         */





    }
}
