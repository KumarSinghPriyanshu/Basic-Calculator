import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		double number1,number2;
		
        char operator;
        
        Scanner scan=new Scanner(System.in);
        System.out.println("CHOOSE YOUR OPERATOR +,-,*,/,%");
      
        operator=scan.next().charAt(0);
        System.out.println("ENTER YOUR FIRST NUMBER");
        number1=scan.nextDouble();
        
        System.out.println("ENTER YOUR SECOND NUMBER");

        number2=scan.nextDouble();
        
        switch(operator)
        {
        case '+':
        	 System.out.println(number1+number2);
        	 break;
        	 
        case '-':
       	 System.out.println(number1-number2);
       	 break;
       	 
        case '*':
       	 System.out.println(number1*number2);
       	 break;
       	 
        case '/':
       	 System.out.println(number1/number2);
       	 break;
       	 
        case '%':
       	 System.out.println(number1%number2);
       	 break;
        }
        
	}

}
