package jdbc;
import java.sql.*;
import java.util.Scanner;

public class Arm {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Mahiti c=new Mahiti();
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
				
		System.out.println(" ***ಠ_ಠWelcome Future ATM ***(❁´◡`❁) ");
		System.out.println(" ^_^plese enter 1 to enter in your account @_@|| ಠ_ಠ Enter 2 to create a new account╰(*°▽°*)╯");
		int a=sc.nextInt();
		if(a==1) {
			c.enteraccount();
		}
		else if(a==2) {
			c.createuser();
		}
		else {
			System.out.println("hey budyy you do rong ");
		}

	}

}
