package fibonacci;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
	    int num;
	    int i;
        boolean wrong = false;
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        
        for(i = 2; i <= num/2; ++i)
        {
            if(num % i == 0)
            {
                wrong = true;
                break;
            }
        }

        if (!wrong)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }

	}

