package kata;

import java.util.Scanner;

public class Maskify {
	   public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("enter account number");
        String name=s.next();
        char a[]=new char[name.length()];
        for(int i=0;i<name.length();i++){
            a[i]=name.charAt(i);
        }
        for(int i=0;i<name.length()-4;i++){
            a[i]='*';
        }

        System.out.println("your account number");
        for(int i=0;i<name.length();i++){
            System.out.print(a[i]);
        }
    }
	}


