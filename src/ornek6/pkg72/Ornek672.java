
package ornek6.pkg72;

import java.util.Scanner;

public class Ornek672 {

   
    public static void main(String[] args) {
       
         
    Scanner input = new Scanner(System.in);
    
   int t;
   
    int bs  = (int) (Math.random()*98)+1;
    int s =0;
    
    do{
        System.out.print("Tahminimiz: ");
        t = input.nextInt();
    
    s+=1;
    
    if(t > bs){
        System.out.println("daha kucuk sayi giriniz");
    }
   if ( t<bs){
        System.out.println("daha buyuk sayi giriniz");
    }
        System.out.println("");
   
    }
    while(t !=bs);
    System.out.println(s+"tahminde buldunuz...");
    
    }
    
}
