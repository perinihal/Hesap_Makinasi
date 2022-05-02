package Hesap_Makinasi;

import java.util.Scanner;

public class HesapMakinasi {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("***** Hosgeldiniz *****");

        System.out.print("Lutfen birinci sayiyi giriniz : ");
        int sayi1= scan.nextInt();

        System.out.print("Lutfen ikinci sayiyi giriniz : ");
        int sayi2= scan.nextInt();

        System.out.println(" ***** ISLEMİNİZİ SECİNİZ ***** ");
        System.out.println(" 1. TOPLAMA ");
        System.out.println(" 2. CIKARMA ");
        System.out.println(" 3. CARPMA ");
        System.out.println(" 4. BOLME ");

        System.out.print("Lutfen seciminizi yapiniz : ");
        int secim = scan.nextInt();

        if(secim==1) {
            System.out.println("Toplama isleminin sonucu : " + (sayi1+sayi2));

        } else if(secim==2) {
            System.out.println("Cıkarma isleminin sonucu : " + (sayi1-sayi2));

        } else if (secim==3) {
            System.out.println("Carpma isleminin sonucu : " + (sayi1*sayi2));

        }else if (secim==4) {
            System.out.println("Bolme isleminin sonucu : " + (sayi1/sayi2));

        } else
            System.out.println(" Hatali secim yaptiniz... ");





    }
}
