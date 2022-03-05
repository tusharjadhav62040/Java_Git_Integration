package pack1;

import java.util.Scanner;

public class FirstCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z, y, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1");
		z = sc.nextInt();
		System.out.println("Enter Number 2 ");
		y = sc.nextInt();
		System.out.println("Before Swapping\nz = "+z+"\ny = "+y);
		temp = z;   
		z = y;
		y = temp;
		System.out.println("After Swapping\nz = "+z+"\ny = "+y);

	}

}
