package kelime;

import java.util.Random;
import java.util.Scanner;

public class kelime_olusturma {

	public static void main(String[] args) {
		char[] harfdizisi = new char[30];
		int index = 0;
		for (char i = 'A'; i <= 'Z'; i++) {
			harfdizisi[index] = i;
			index++;

		}
		for (int i = 0; i < 25; i++) {
			System.out.print(harfdizisi[i] + " ");
		}
		System.out.println(harfdizisi[25]);

		Scanner scn = new Scanner(System.in);
		System.out.println("girilecek kelime sayýsýný giriniz:");
		int kelimesayisi = scn.nextInt();

		System.out.println("girilecek harf sayýsýný giriniz:");
		int harfsayisi = scn.nextInt();
		System.out.println("kelimesayisi =" + kelimesayisi + " " + "harfsayisi =" + harfsayisi);

		String[] tutulacakkelime = new String[kelimesayisi];
		for (int i = 0; i<kelimesayisi; i++) {
				String kelime="";
			for (int j = 0; j <harfsayisi ; j++) {
				Random rnd=new Random();
				int a=rnd.nextInt(25);
				kelime +=harfdizisi[a];
			}
		tutulacakkelime[i]=kelime;
		System.out.println(kelime);
		}
		
	}
}
