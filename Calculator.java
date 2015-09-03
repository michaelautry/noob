import java.io.IOException;
import java.util.Scanner;

/**
 * Michael Autry's Calculator Code
 * For UMUC CMIS 141 6381 - Professor: David Brownell
 * Copyright 2015
 */
 
public class Calculator 
{	
    public static void main(String[] args) throws IOException
     { 
	int i1, i2;
	String operation;
	Scanner scannerObject = new Scanner(System.in);
	
	System.out.println("Please enter your first integer.");
	i1 = scannerObject. nextInt();
	
	System.out.println("Please enter your second integer.");
	i2 = scannerObject. nextInt();
	
	Scanner op = new Scanner(System.in);
        System.out.println("Please enter your operation ( +, -, /, %, *, >>, <<, &, |).");
        operation = op.next();
		
		switch (operation)  {
        case "+":
            System.out.println("The result of "+ i1 + " + " + i2 + " is " + (i1 + i2) + ".");
			break;
			
        case "-":
            System.out.println("The result of "+ i1 + " - " + i2 + " is " + (i1 - i2) + ".");
            break;

        case "/":
            System.out.println("The result of "+ i1 + " / " + i2 + " is " + (i1 / i2) + ".");
            break;
			
        case "%":
            System.out.println("The result of "+ i1 + " % " + i2 + " is " + (i1 % i2) + ".");
			break;
		
        case "*":
            System.out.println("The result of "+ i1 + " * " + i2 + " is " + (i1 * i2) + ".");
			break;
			
        case ">>":
            System.out.println("The result of "+ i1 + " >> " + i2 + " is " + (i1 >> i2) + ".");
			break;
			
        case "<<":
            System.out.println("The result of "+ i1 + " << " + i2 + " is " + (i1 << i2) + ".");
			break;
				
        case "&":
            System.out.println("The result of "+ i1 + " & " + i2 + " is " + (i1 & i2) + ".");
			break;
			
        case "|":
            System.out.println("The result of "+ i1 + " | " + i2 + " is " + (i1 | i2) + ".");
			break;
			
		default:
			System.out.print("Please try again.");
			break;
		
		}
	
	}
	// Thanks for the challenge!
}
