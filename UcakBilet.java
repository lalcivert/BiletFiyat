package day01;
import java.util.Scanner;
public class UcakBilet {
    public static void main(String[] args) {
        int yas,mesafe,yolculukTipi;
        double fiyat,indTutar;

        Scanner input=new Scanner(System.in);

        System.out.println("Mesafeyi KM tipinden giriniz: ");
        mesafe=input.nextInt();
        if(mesafe<0){
            System.out.println("Hatalı veri girdiniz!");
        }

        System.out.println("Yaşınızı giriniz: ");
        yas=input.nextInt();
        if(yas<0){
            System.out.println("Hatalı veri girdiniz!");
        }

        System.out.println("Yolculuk tipinizi giriniz:(1=> Tek yön 2=> Gidiş dönüş) ");
        yolculukTipi=input.nextInt();

        fiyat=mesafe*0.10;

        if(yolculukTipi==2){

            if(yas<12){
                indTutar=fiyat*(0.50);
                fiyat=fiyat-indTutar;
            }else if(yas>=12 && yas<24){
                indTutar=fiyat*(0.10);
                fiyat=fiyat-indTutar;
            }else if(yas>65){
               indTutar=fiyat*(0.30);
               fiyat=fiyat-indTutar;
            }
            indTutar=fiyat*(0.20);
            fiyat=(fiyat-indTutar)*2;
        }

        System.out.println("Toplam tutar: "+fiyat);
    }
}
