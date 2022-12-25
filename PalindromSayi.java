package Giris;

public class PalindromSayi {
    //palindrom sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
    static boolean isPalindrom(int number){
        int temp = number; //numberla karşılaştıracağımız için number bozulmasın diye temp'e eşitledik.
        int reverseNumber = 0;
        int lastNumber;
        while(temp != 0){
            //System.out.println("----------------------");
            // System.out.println("Sayi => " + temp);
            lastNumber = temp % 10; //son sayıyı bulduk.
            // System.out.println("Son Basamak => " + lastNumber);
            reverseNumber = (reverseNumber * 10) + lastNumber;
            // System.out.println("Yeni sayı => " + reverseNumber);
            temp /= 10;
        }
        if (number == reverseNumber){
            return true;
        }else{
            return true;
        }
    }
    public static void main(String[] args) {
        System.out.println(isPalindrom(8753642));
    }
}
