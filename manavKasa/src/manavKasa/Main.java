package manavKasa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double armut,elma,domates,muz,patlican;
		double tutar=0;
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Armut Ka� Kilo: ");
		armut=input.nextDouble();
		System.out.print("Elma Ka� Kilo: ");
		elma=input.nextDouble();
		System.out.print("Domates Ka� Kilo: ");
		domates=input.nextDouble();
		System.out.print("Muz Ka� Kilo: ");
		muz=input.nextDouble();
		System.out.print("Patl�can Ka� Kilo: ");
		patlican=input.nextDouble();
		
		tutar=(armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlican*5);
		System.out.println("Toplam Tutar: "+tutar+" TL");
	}

}
