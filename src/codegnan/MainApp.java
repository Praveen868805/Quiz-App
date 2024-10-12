package codegnan;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Quiz App");
		System.out.println("Please Enter your details:");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your name");
		String name=sc.nextLine();
		System.out.println("Enter Your Email");
		String Email=sc.next();
		System.out.println("Enter Your phone number");
		long phone=sc.nextLong();
		System.out.println("Enter Your city");
		String city=sc.next();
		System.out.println("Enter Your state");
		String state=sc.next();
		System.out.println("Enter Your country");
		String country=sc.next();
		Participant p=new Participant(name,Email,phone,city,state,country);
		System.out.println("Welcome to Quiz APP"+p.getName());
		System.out.println("Guidelines for the game:");
		System.out.println(Guidelines.guideline1+"\n"+Guidelines.guideline2+"\n"+Guidelines.guideline3+"\n");
		System.out.println("Do you wish to start the Quiz(true/flase)?");
		boolean acceptance=sc.nextBoolean();
		if(acceptance==true)
		{
			Options op=new Options();
			System.out.println("Here is your frist Question");
			System.out.println(Questions.question1);
			boolean res1=op.optionsforquestion1(p);
			if(res1==true)
			{
				p.setAmount(1000);
				System.out.println("correct answer ,you won rs:"+p.getAmount());
				System.out.println("*********************************************************");
				System.out.println("Here is your second Question");
				System.out.println(Questions.question2);
				
			}
			else
			{
				System.out.println("sorry your answer is incorrec , you won rs:"+p.getAmount());
				System.out.println("*********************************************************");
				System.out.println("Here is your second Question");
			}
			boolean res2=op.optionsforquestion2(p);
			if(res1==true)
			{
				p.setAmount(2000);
				System.out.println("correct answer ,you won rs:"+p.getAmount());
				System.out.println("*********************************************************");
				System.out.println("Here is your Third Question");
				System.out.println(Questions.question3);
				
			}
			else
			{
				System.out.println("sorry your answer is incorrec , you won rs:"+p.getAmount());
				System.out.println("*********************************************************");
				System.out.println("Here is your thrid Question");
			}
			boolean res3=op.optionsforquestion3(p);
			if(res3==true)
			{
				p.setAmount(3000);
				System.out.println("correct answer ,you won rs:"+p.getAmount());
				System.out.println("*********************************************************");
				System.out.println("Here is your fourth Question");
				System.out.println(Questions.question4);
				
			}
			else
			{
				System.out.println("sorry your answer is incorrec , you won rs:"+p.getAmount());
				System.out.println("*********************************************************");
				System.out.println("Here is your fourth Question");
			}
			boolean res4=op.optionsforquestion4(p);
			if(res4==true)
			{
				p.setAmount(4000);
				System.out.println("correct answer ,you won rs:"+p.getAmount());
				System.out.println("*********************************************************");
				System.out.println("Here is your fivth Question");
				System.out.println(Questions.question5);
				
			}
			else
			{
				System.out.println("sorry your answer is incorrec , you won rs:"+p.getAmount());
				System.out.println("Here is your fivth Question");
			}
			boolean res5=op.optionsforquestion5(p);
			if(res5==true)
			{
				p.setAmount(5000);
				System.out.println("correct answer ,you won rs:"+p.getAmount());
				System.out.println("*********************************************************");
				System.out.println("Here is your Sixth Question");
				System.out.println(Questions.question6);
				
			}
			else
			{
				System.out.println("sorry your answer is incorrec , you won rs:"+p.getAmount());
				System.out.println("Here is your sixth Question");
			}
			boolean res6=op.optionsforquestion6(p);
			if(res6==true)
			{
				p.setAmount(6000);
				System.out.println("correct answer ,you won rs:"+p.getAmount());
				System.out.println("Here is your seventh Question");
				System.out.println("*********************************************************");
				System.out.println(Questions.question7);
				
			}
			else
			{
				System.out.println("sorry your answer is incorrec , you won rs:"+p.getAmount());
				System.out.println("Here is your Seventh Question");
			}
			boolean res7=op.optionsforquestion7(p);
			if(res7==true)
			{
				p.setAmount(7000);
				System.out.println("correct answer ,you won rs:"+p.getAmount());
				System.out.println("*********************************************************");
				System.out.println("Here is your eighth Question");
				System.out.println(Questions.question8);
				
			}
			else
			{
				System.out.println("sorry your answer is incorrec , you won rs:"+p.getAmount());
				System.out.println("*********************************************************");
				System.out.println("Here is your eigth Question");
			}
			boolean res8=op.optionsforquestion8(p);
			if(res8==true)
			{
				p.setAmount(8000);
				System.out.println("correct answer ,you won rs:"+p.getAmount());
				System.out.println("*********************************************************");
				System.out.println("Here is your ninth Question");
				System.out.println(Questions.question9);
			}
			else
			{
				System.out.println("sorry your answer is incorrec , you won rs:"+p.getAmount());
				System.out.println("*********************************************************");
				System.out.println("Here is your ninth Question");
			}
		
		boolean res9=op.optionsforquestion9(p);
		if(res9==true)
		{
			p.setAmount(9000);
			System.out.println("correct answer ,you won rs:"+p.getAmount());
			System.out.println("*********************************************************");
			System.out.println("Here is your Tenth Question");
			System.out.println(Questions.question10);
		}
		else
		{
			System.out.println("sorry your answer is incorrec , you won rs:"+p.getAmount());
			System.out.println("*********************************************************");
			System.out.println("Here is your tenth Question");
		}
		boolean res10=op.optionsforquestion10(p);
		if(res10==true)
		{
			p.setAmount(10000);
			System.out.println("correct answer ,you won rs:"+p.getAmount());
			
		}
		else
		{
			System.out.println("sorry your answer is incorrec , you won rs:"+p.getAmount());
		}
		}
		{
			System.out.println("Thanks for your interest");
		}
	}
}

