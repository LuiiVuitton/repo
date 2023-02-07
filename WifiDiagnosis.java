/*
 * Class: CMSC203 
 * Instructor: Grigoriy A. Grinberg
 * Description: Build an application that will step through some possible problems to 
 * restore internet connectivity.  
 * Assume that your computer uses wi-fi to connect to a router 
 * which connects to an Internet Service Provider (ISP) which connects to the Internet. 
 * Due: 02/06/2023
 * Platform/compiler: MacOS
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Luis E. Ventura Perez
*/

import java.util.Scanner;

public class WifiDiagnosis {

	public static void main(String[] args) {
		
		// print the header
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.\n");

		Scanner sc = new Scanner(System.in);

		//1 reboot the computer
		System.out.println("\nReboot the computer and try to connect");//comment output
		System.out.print("\nDid that fix the problem? (yes or no): ");//Ask if the problem was fixed
		String choice = sc.nextLine().trim();
		while(!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no"))
		{
		System.out.println("\nInvalid answer; try again\n");//comment output
		System.out.print("\nDid that fix the problem? (yes or no): ");//Ask if the problem was fixed
		choice = sc.nextLine().trim();
		}
		if(choice.equalsIgnoreCase("yes"))//If yes message
		{
		System.out.println("\nDone");//comment output
		System.out.println("\nProgrammer: Luis E. Ventura Perez");//Programmer name
		return;
		}

		//2 reboot the router
		System.out.println("\nReboot the router and try to connect");//comment output
		System.out.print("\nDid that fix the problem? (yes or no): ");//Ask if the problem was fixed
		choice = sc.nextLine().trim();
		while(!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no"))
		{
		System.out.println("\nInvalid answer; try again\n");//comment output
		System.out.print("\nDid that fix the problem? (yes or no): ");//Ask if the problem was fixed
		choice = sc.nextLine().trim();
		}
		if(choice.equalsIgnoreCase("yes"))
		{
			System.out.println("\nDone");//comment output
			System.out.println("\nProgrammer: Luis E. Ventura Perez");//Programmer name
		return;
		}

		//3 plugging in the cable to the router
		System.out.println("\nMake sure the cables connecting the router are firmly plugged in and power is getting to the router");//comment output
		System.out.print("\nDid that fix the problem? (yes or no): ");//Ask if the problem was fixed
		choice = sc.nextLine().trim();
		while(!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no"))
		{
		System.out.println("\nInvalid answer; try again\n");//comment output
		System.out.print("\nDid that fix the problem? (yes or no): ");//Ask if the problem was fixed
		choice = sc.nextLine().trim();
		}
		if(choice.equalsIgnoreCase("yes"))
		{
			System.out.println("\nDone");//comment output
			System.out.println("\nProgrammer: Luis E. Ventura Perez");//Programmer name
		return;
		}

		//4 move computer next to router
		System.out.println("\nMove the computer closer to the router and try to connect");//comment output
		System.out.print("\nDid that fix the problem? (yes or no): ");//Ask if the problem was fixed
		choice = sc.nextLine().trim();
		while(!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no"))
		{
		System.out.println("\nInvalid answer; try again\n");//comment output
		System.out.print("\nDid that fix the problem? (yes or no): ");//Ask if the problem was fixed
		choice = sc.nextLine().trim();
		}
		if(choice.equalsIgnoreCase("yes"))
		{
			System.out.println("\nDone");//comment output
			System.out.println("\nProgrammer: Luis E. Ventura Perez");//Programmer name		return;
		}

		// 5 contact ISP
		System.out.println("\nContact your ISP");
		
		System.out.println("\nDone");//comment output
		System.out.println("\nProgrammer: Luis E. Ventura Perez");//Programmer name
		
		}
		
	}
