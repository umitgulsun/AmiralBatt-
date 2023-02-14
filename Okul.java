package okul;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Okul
{
    String okulAd;
    public int maxOgrenciSayisi;
    public List<String> ogrenciIsimListesi=new ArrayList<>();


    public Okul(String okulAd, int maxOgrenciSayisi)
    {
        this.okulAd = okulAd;
        this.maxOgrenciSayisi = maxOgrenciSayisi;
    }

    public void ogrenciSecimi() throws InterruptedException
    {
        Scanner scan = new Scanner(System.in);

        boolean isTrue = true;
        String adSoyad="";
        String ad="";
        String soyad ="";
        int yas=0;
        while (isTrue)
        {
            if(maxOgrenciSayisi!=0)
            {
                System.out.println("Öğrenci Adını giriniz..");
                ad = scan.next();
                System.out.println("Öğrenci Soyadını giriniz..");
                soyad = scan.next();
                System.out.println("Öğrenci yaşını giriniz..");
                yas = scan.nextInt();
            }
            Ogrenci ogrenci = new Ogrenci(ad, soyad, yas);

            adSoyad = (ad + " " + soyad);

            if (maxOgrenciSayisi > 0)
            {

                if (ogrenci.getYas() < 15)
                {
                    ogrenciIsimListesi.add(adSoyad);
                    maxOgrenciSayisi--;
                    System.out.println("Yeni kaydolan öğrenciler listesi : " + ogrenciIsimListesi + "\nKalan kontenjan sayısı =" + maxOgrenciSayisi);
                    Thread.sleep(2000);
                }
                else
                {
                    System.out.println("Ogrenci yas 15 ten kucuk olmalı...\nLütfen baska öğrenci giriniz..");
                    Thread.sleep(2000);
                }
            }
            else
            {
                System.out.println("Kontenjan doldu");
                System.out.println(okulAd + "'na kaydolan öğrencilerinlistesi\n" + ogrenciIsimListesi);
                isTrue = false;
            }

        }
    }
}
