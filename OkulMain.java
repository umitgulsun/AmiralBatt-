package okul;

import java.util.List;
import java.util.Scanner;

public class OkulMain
{
    public static void main(String[] args) throws InterruptedException
    {
        //  1- fieldları ad, soyad, yas olan bir Ogrenci sınıfı tanımlayınız.
        //  2- Ogrenci sınıfına ad, soyad  ve yas dan oluşan bir consructor tanımlayınız.
        //  3- Bütün fieldlar için encapsulation uygulayınız.
        //  4- Bir okul isimli sınıf tanımlayınız, fieldları okulAd, maxOgrenciSayisi,
        //     ArrayList cinsinden Öğrencileri olsun.
        //  5- main metodunun olduğu OkulMain isimli bir sınıf oluşturunuz.
        //  6- bir okul nesnesi oluşturup, bu okula max öğrenci miktarına ulaşana kadar öğrenci
        //     ekleyiniz.Fakat oluşturacağınız öğrencilerin yaşı 15 i geçmemeli.
        //     bu yaşı geçen bir öğrenci eklenmek istenir ise yerine başka öğrenci isteyiniz.

        Okul okul1=new Okul("Kolej A",2);
        okul1.ogrenciSecimi();
        Okul okul2=new Okul("Kolej B",3);
        okul2.ogrenciSecimi();
        System.out.println(okul2.okulAd+"-----"+okul2.ogrenciIsimListesi);
        System.out.println(okul1.okulAd+"-----"+okul1.ogrenciIsimListesi);

    }
}
