import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class CGPACalculation {
	
	  public static void main(String[] args) throws FileNotFoundException {
	        Scanner input = new Scanner(System.in);
	        
	        System.out.println("Welcome to java project-Student Result Calculation System\n");
	        System.out.println("-------Please Enter Your Username and Password-------");
	        
	        String username,password ;
	        
	        int i, num;
	        float Mid,Final;
	        float Result;
	        
	        System.out.print("\nEnter UserName : ");
	        username = input.nextLine();
	        
	        System.out.print("Enter Password : ");
	        password = input.nextLine();
	        
	        
	       if(username.equals("admin") && (password.equals("admin"))){
	           System.out.println("\nWelcome"); 
	       }else{
	           System.out.println("\nUsername and Password do not match\n");
			  
	           stop	();	  
	        }
	       
	            try (Formatter formatter = new Formatter("C://StudentInfo.txt")) {
	                System.out.print("\nHow many students : ");
	                num = input.nextInt();
	                for ( i = 1; i <= num; i++) {
	                    System.out.println("\nEnter Student's Information\n  ");
	                    System.out.print("Student ID: ");
	                    String ID = input.next();
	                    System.out.print("Student Name: ");
	                    String Name = input.next();
	                    System.out.print("Mid Marks: ");
	                    Mid = input.nextFloat();
	                    System.out.print("Final Marks: ");
	                    Final = input.nextFloat();
	                    
	                    Result=((Mid*40)/100) + (( Final*60)/100);
	                     
	                    
	                    Formatter format = formatter.format("%s\t %s\t %.2f\t %.2f\t %.2f\t \r\n",ID,Name,Mid,Final,Result);
	                    
	                  
	        if(90<=Result)
	        {
	            System.out.println("Total Marks:"+Result + "\nLetter Grade : A+\nGrade Points : 4.00 ");  
	        }
	        else if(Result>=85 && Result<90)
	        {
	            System.out.println("Total Marks: "+Result +"\tLetter Grade : A\tGrade Points : 3.75");
	        } 
	        else if(Result>=80 && Result<85)
	        {
	            System.out.println("Total Marks: "+Result +"\tLetter Grade : B+\tGrade Points : 3.50");
	        }
	         else if(Result>=75 && Result<80)
	        {
	            System.out.println("Total Marks: "+Result +"\tLetter Grade : B\tGrade Points : 3.25");
	        }
	          else if(Result>=70 && Result<75)
	        {
	            System.out.println("Total Marks: "+Result +"\tLetter Grade : C+\tGrade Points : 3.00 :");
	        }
	           else if(Result>=65 && Result<70)
	        {
	            System.out.println("Total Marks: "+Result +"\tLetter Grade : C\tGrade Points : 2.75");
	        }
	            else if(Result>=60 && Result<65)
	        {
	            System.out.println("Total Marks: "+Result +"\tLetter Grade : D+\tGrade Points : 2.50");
	        }
	            else if(Result>=50 && Result<60)
	        {
	            System.out.println("Total Marks: "+Result +"\tLetter Grade : D\tGrade Points : 2.25");
	        }
	        else
	        {
	            System.out.println("Total Marks: "+Result +"\tLetter Grade : F\tGrade Points : 0.00");
	        }
	        
	       }
	      }
	     }
		 
	    private static void stop() {
	        throw new UnsupportedOperationException("Your Username and Password do not match"); 
	    }
	}

