package com.bridgelabz;
import java.util.Scanner;
public class VowelOrConsonants {
    public static void main(String[ ] arg)
    {
        int i=0;
        //Create an object of scanner class
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character : ");
        char ch=sc.next( ).charAt(0);
        //character ch=sc.nextChar();
        switch(ch)
        {
            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' :i++;
        }
        if(i==1)
            System.out.println("Entered character "+ch+" is  Vowel");
        else
        if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
            System.out.println("Entered character "+ch+" is Consonent"); // input character other then above mentioned
        else
            System.out.println("Not an alphabet"); // input number or symbol
    }
}
