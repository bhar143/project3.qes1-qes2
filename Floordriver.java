package project3qes1;

import java.util.LinkedList;
import java.util.Scanner;

public class Floordriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FloorBuliding fb = new FloorBuliding();
		//Create linked list to floor size.
		LinkedList<Integer>Is_original = new LinkedList<>();
		
		System.out.println("Enter the total number of floors in building");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			System.out.println("Enter the floor size given on day" + (i+1));
			 Is_original.add(sc.nextInt());
		}
		fb.FloorBuliding(Is_original);
		sc.close();

	}

}
