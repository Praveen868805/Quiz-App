package codegnan;

import java.util.Scanner;

public class Options {
	static int life_line_count=1;
	Scanner sc=new Scanner(System.in);
	boolean optionsforquestion1(Participant p)
	{
		System.out.println("1.james gosling \n"+
				           "2.Dennis \n"+"3.Steve\n"+"4.E.P Code\n"
				           		+ "5.life line\n"+"6.Quit");
		System.out.println("Select the corrrect answer");
		int num=sc.nextInt();
		if(num==1)
		{
			return true;
		}
		else if(num==5)
		{
			if(life_line_count!=0)
			{
				System.out.println("Please select the life line :");
				System.out.println("1.Audiance poll");
				int choice=sc.nextInt();
				if(choice==1)
					life_line_count--;
				{
					System.out.println("1.james gosling--->75% \n"+
				           "2.Dennis--->10% \n"+"3.Steve--->10%\n"+"4.E.P Code--->5%\n"
				           		);
					 num =sc.nextInt();
					 if(num==1)
					 {
						 return true;
					 }
					 else
					 {
						 return false;
					 }
				}
			}
			else
			{
				System.out.println("You have no life line .\n"+
			                        "Please selct An Options");
				System.out.println("1.james gosling \n"+
				           "2.Dennis \n"+"3.Steve\n"+"4.E.P Code\n"
				           		+"5.Quit");
				num=sc.nextInt();
				if(num==1)
				{
					return true;
				}
				else if(num==6)
				{
					System.out.println("Thank You For participantion");
					System.out.println("you won Rs."+p.getAmount());
					System.exit(0);
				}
				
			}
		}
		else if(num==6)
		{
			System.out.println("Thank You For participantion");
			System.out.println("you won Rs."+p.getAmount());
			System.exit(0);
		}
		
			
		return false;
		
	}
	boolean optionsforquestion2(Participant p)
	{
		System.out.println("1.Virat\n"+
				           "2.Gill \n"+"3.Sanju\n"+"4.Rohit\n"+
				             "5.life line\n"+"6.quit\n");
		System.out.println("Slect the corrrect answer");
		int num=sc.nextInt();
		if(num==4)
		{
			return true;
		}
		else if(num==5)
		{
			if(life_line_count!=0)
			{
				System.out.println("Please select the life line :");
				System.out.println("1.Audiance poll");
				int choice=sc.nextInt();
				if(choice==1)
					life_line_count--;
				{
					System.out.println("1.Virat--->25% \n"+
				           "2.Gill--->10% \n"+"3.Snaju--->10%\n"+"4.Rohit--->55%\n"
				           		);
					 num =sc.nextInt();
					 if(num==4)
					 {
						 return true;
					 }
					 else
					 {
						 return false;
					 }
				}
			}
			else
			{
				System.out.println("You have no life line .\n"+
			                        "Please selct An Options");
				System.out.println("1.Virat\n"+
				           "2.Gill \n"+"3.Sanju\n"+"4.Rohit\n"+"5.Quit\n");
				num=sc.nextInt();
				if(num==4)
				{
					return true;
				}
				else if(num==5)
				{
					System.out.println("Thank You For participantion");
					System.out.println("you won Rs."+p.getAmount());
					System.exit(0);
				}
				
			}
		}
		else if(num==6)
		{
			System.out.println("Thank You For participantion");
			System.out.println("you won Rs."+p.getAmount());
			System.exit(0);
		}
		
			
		return false;
		
	}
	boolean optionsforquestion3(Participant p)
	{
		System.out.println("1.Klasan\n"+
				           "2.pat cummins \n"+"3.Steve\n"+"4.E.P Code\n"+"5.lifr line\n"+
				             "6.Quit\n");
		System.out.println("Slect the corrrect answer");
		int num=sc.nextInt();
		if(num==2)
		{
			return true;
		}
		else if(num==5)
		{
			if(life_line_count!=0)
			{
				System.out.println("Please select the life line :");
				System.out.println("1.Audiance poll");
				int choice=sc.nextInt();
				if(choice==1)
					life_line_count--;
				{
					System.out.println("1.klasan--->20% \n"+
				           "2.pat cummins--->60% \n"+"3.Markram--->10%\n"+"4.Bhuvi--->5%\n"
				           		);
					 num =sc.nextInt();
					 if(num==2)
					 {
						 return true;
					 }
					 else
					 {
						 return false;
					 }
				}
			}
			else
			{
				System.out.println("You have no life line .\n"+
			                        "Please selct An Options");
				System.out.println("1.klasan \n"+
				           "2.pat cummins \n"+"3.Markram%\n"+"4.Bhuvi"+"5.Quit\n");
				num=sc.nextInt();
				if(num==2)
				{
					return true;
				}
				else if(num==5)
				{
					System.out.println("Thank You For participantion");
					System.out.println("you won Rs."+p.getAmount());
					System.exit(0);
				}
				
			}
		}
		else if(num==6)
		{
			System.out.println("Thank You For participantion");
			System.out.println("you won Rs."+p.getAmount());
			System.exit(0);
		}
		
			
		return false;
		
	}
	boolean optionsforquestion4(Participant p)
	{
		System.out.println("1.1900\n"+
				           "2.1912 \n"+"3.1967\n"+"4.1789\n"+"5.life line\n"
				           +"6.Quit\n");
		System.out.println("Slect the corrrect answer");
		int num=sc.nextInt();
		if(num==2)
		{
			return true;
		}
		else if(num==5)
		{
			if(life_line_count!=0)
			{
				System.out.println("Please select the life line :");
				System.out.println("1.Audiance poll");
				int choice=sc.nextInt();
				if(choice==1)
					life_line_count--;
				{
					System.out.println("1.1900--->10%\n"+
					           "2.1912--->65% \n"+"3.1967--->10%\n"+"4.1789--->20%\n"
					          );
					 num =sc.nextInt();
					 if(num==2)
					 {
						 return true;
					 }
					 else
					 {
						 return false;
					 }
				}
			}
			else
			{
				System.out.println("You have no life line .\n"+
			                        "Please selct An Options");
				System.out.println("1.1900\n"+
				           "2.1912 \n"+"3.1967\n"+"4.1789\n"
				           +"5.Quit\n");
				num=sc.nextInt();
				if(num==2)
				{
					return true;
				}
				else if(num==5)
				{
					System.out.println("Thank You For participantion");
					System.out.println("you won Rs."+p.getAmount());
					System.exit(0);
				}
				
			}
		}
		else if(num==6)
		{
			System.out.println("Thank You For participantion");
			System.out.println("you won Rs."+p.getAmount());
			System.exit(0);
		}
		
			
		return false;
		
	}
	boolean optionsforquestion5(Participant p)
	{
		System.out.println("1.kaveri\n"+
				           "2.ganga \n"+"3. Nile River\n"+"4.godhavari\n"
				             +"5.life line\n"+"6.Quit\n");
		System.out.println("Slect the corrrect answer");
		int num=sc.nextInt();
		if(num==3)
		{
			return true;
		}
		else if(num==5)
		{
			if(life_line_count!=0)
			{
				System.out.println("Please select the life line :");
				System.out.println("1.Audiance poll");
				int choice=sc.nextInt();
				if(choice==1)
					life_line_count--;
				{
					System.out.println("1.kaveri--->10%\n"+
					           "2.ganga--->10% \n"+"3. Nile River--->70%\n"+
							     "4.godhavari--->10% \n"
					            );
					 num =sc.nextInt();
					 if(num==3)
					 {
						 return true;
					 }
					 else
					 {
						 return false;
					 }
				}
			}
			else
			{
				System.out.println("You have no life line .\n"+
			                        "Please selct An Options");
				System.out.println("1.kaveri\n"+
				           "2.ganga \n"+"3. Nile River\n"+"4.godhavari\n"
				             +"5.Quit\n");
				num=sc.nextInt();
				if(num==3)
				{
					return true;
				}
				else if(num==5)
				{
					System.out.println("Thank You For participantion");
					System.out.println("you won Rs."+p.getAmount());
					System.exit(0);
				}
				
			}
		}
		else if(num==6)
		{
			System.out.println("Thank You For participantion");
			System.out.println("you won Rs."+p.getAmount());
			System.exit(0);
		}
		
			
		return false;
		
	}
	boolean optionsforquestion6(Participant p)
	{
		System.out.println("1.Fe\n"+
				           "2.He \n"+"3.HCL\n"+"4.OX\n"+
				            "5.life line\n"+"6.Quit\n");
		System.out.println("Slect the corrrect answer");
		int num=sc.nextInt();
		if(num==1)
		{
			return true;
		}
		else if(num==5)
		{
			if(life_line_count!=0)
			{
				System.out.println("Please select the life line :");
				System.out.println("1.Audiance poll");
				int choice=sc.nextInt();
				if(choice==1)
					life_line_count--;
				{
					System.out.println("1.Fe--->70%\n"+
					           "2.He--->10%\n"+"3.HCL--->10%\n"+"4.OX--->10%\n");
					 num =sc.nextInt();
					 if(num==1)
					 {
						 return true;
					 }
					 else
					 {
						 return false;
					 }
				}
			}
			else
			{
				System.out.println("You have no life line .\n"+
			                        "Please selct An Options");
				System.out.println("1.Fe\n"+
				           "2.He \n"+"3.HCL\n"+"4.OX\n"+
				            "5.Quit\n");
				num=sc.nextInt();
				if(num==1)
				{
					return true;
				}
				else if(num==5)
				{
					System.out.println("Thank You For participantion");
					System.out.println("you won Rs."+p.getAmount());
					System.exit(0);
				}
				
			}
		}
		else if(num==6)
		{
			System.out.println("Thank You For participantion");
			System.out.println("you won Rs."+p.getAmount());
			System.exit(0);
		}
		
			
		return false;
		
	}

	boolean optionsforquestion7(Participant p)
	{
		System.out.println("1.H2Au\n"+
		           "2.Gu\n"+"3.H2O\n"+"4.AU\n"+"5.life line\n"+"6.Quit\n");;
		System.out.println("Slect the corrrect answer");
		int num=sc.nextInt();
		if(num==3)
		{
			return true;
		}
		else if(num==5)
		{
			if(life_line_count!=0)
			{
				System.out.println("Please select the life line :");
				System.out.println("1.Audiance poll");
				int choice=sc.nextInt();
				if(choice==1)
					life_line_count--;
				{
					System.out.println("1.H2O3--->10%\n"+
					           "2.H2O--->85% \n"+"3.--->3%\n"+"4.OX--->2%\n"
					            );
					 num =sc.nextInt();
					 if(num==2)
					 {
						 return true;
					 }
					 else
					 {
						 return false;
					 }
				}
			}
			else
			{
				System.out.println("You have no life line .\n"+
			                        "Please selct An Options");
				System.out.println("1.Fe\n"+
				           "2.He \n"+"3.HCL\n"+"4.OX\n"+
				            "5.Quit\n");
				num=sc.nextInt();
				if(num==1)
				{
					return true;
				}
				else if(num==5)
				{
					System.out.println("Thank You For participantion");
					System.out.println("you won Rs."+p.getAmount());
					System.exit(0);
				}
				
			}
		}
		else if(num==6)
		{
			System.out.println("Thank You For participantion");
			System.out.println("you won Rs."+p.getAmount());
			System.exit(0);
		}
		
			
		return false;
		
	}
	boolean optionsforquestion8(Participant p)
	{
		System.out.println("1.H2Au\n"+
				           "2.Gu\n"+"3.Au\n"+"4.AU\n"+"5.life line\n"+"6.Quit\n");
		System.out.println("Slect the corrrect answer");
		int num=sc.nextInt();
		if(num==3)
		{
			return true;
		}
		else if(num==5)
		{
			if(life_line_count!=0)
			{
				System.out.println("Please select the life line :");
				System.out.println("1.Audiance poll");
				int choice=sc.nextInt();
				if(choice==1)
					life_line_count--;
				{
					System.out.println("1.H2Au--->10%\n"+
					           "2.Gu--->15%\n"+"3.Au--->55%\n"+"4.AU--->5%\n");
					 num =sc.nextInt();
					 if(num==3)
					 {
						 return true;
					 }
					 else
					 {
						 return false;
					 }
				}
			}
			else
			{
				System.out.println("You have no life line .\n"+
			                        "Please selct An Options");
				System.out.println("1.H2Au\n"+
				           "2.Gu\n"+"3.Au\n"+"4.AU\n"+"5.Quit\n");
				num=sc.nextInt();
				if(num==3)
				{
					return true;
				}
				else if(num==5)
				{
					System.out.println("Thank You For participantion");
					System.out.println("you won Rs."+p.getAmount());
					System.exit(0);
				}
				
			}
		}
		else if(num==6)
		{
			System.out.println("Thank You For participantion");
			System.out.println("you won Rs."+p.getAmount());
			System.exit(0);
		}
		
			
		return false;
		
	}
	boolean optionsforquestion9(Participant p)
	{
		System.out.println("1.Atlantic Ocean\n"+
				           "2.Arctic Ocean\n"+"3.Indian Ocean\n"+"4.Pacific Ocean\n"
				            +"5.life line\n"+"6.Quit\n");
		System.out.println("Slect the corrrect answer");
		int num=sc.nextInt();
		if(num==4)
		{
			return true;
		}
		else if(num==5)
		{
			if(life_line_count!=0)
			{
				System.out.println("Please select the life line :");
				System.out.println("1.Audiance poll");
				int choice=sc.nextInt();
				if(choice==1)
					life_line_count--;
				{
					System.out.println("1.Atlantic Ocean--->4%\n"+
					           "2.Arctic Ocean--->20%\n"+"3.Indian Ocean--->16%\n"+"4.Pacific Ocean--->60%\n"
					            );
					 num =sc.nextInt();
					 if(num==4)
					 {
						 return true;
					 }
					 else
					 {
						 return false;
					 }
				}
			}
			else
			{
				System.out.println("You have no life line .\n"+
			                        "Please selct An Options");
				System.out.println("1.Atlantic Ocean\n"+
				           "2.Arctic Ocean\n"+"3.Indian Ocean\n"+"4.Pacific Ocean\n"
				            +"5.Quit\n");
				num=sc.nextInt();
				if(num==3)
				{
					return true;
				}
				else if(num==5)
				{
					System.out.println("Thank You For participantion");
					System.out.println("you won Rs."+p.getAmount());
					System.exit(0);
				}
				
			}
		}
		else if(num==6)
		{
			System.out.println("Thank You For participantion");
			System.out.println("you won Rs."+p.getAmount());
			System.exit(0);
		}
		
			
		return false;
		
	}
	boolean optionsforquestion10(Participant p)
	{
		System.out.println("1.Jupiter\n"+
				           "2.Mars\n"+"3.Venus\n"+"4.Saturn\n"+"5.life line\n"+"6.Quit");
		System.out.println("Slect the corrrect answer");
		int num=sc.nextInt();
		if(num==2)
		{
			return true;
		}
		else if(num==5)
		{
			if(life_line_count!=0)
			{
				System.out.println("Please select the life line :");
				System.out.println("1.Audiance poll");
				int choice=sc.nextInt();
				if(choice==1)
					life_line_count--;
				{
					System.out.println("1.Jupiter--->10%\n"+
					           "2.Mars--->70%\n"+"3.Venus--->10%\n"+"4.Saturn--->10%\n");
					   
					 num =sc.nextInt();
					 if(num==2)
					 {
						 return true;
					 }
					 else
					 {
						 return false;
					 }
				}
			}
			else
			{
				System.out.println("You have no life line .\n"+
			                        "Please selct An Options");
				System.out.println("1.Jupiter\n"+
				           "2.Mars\n"+"3.Venus\n"+"4.Saturn\n"+"5.Quit\n");
				num=sc.nextInt();
				if(num==3)
				{
					return true;
				}
				else if(num==5)
				{
					System.out.println("Thank You For participantion");
					System.out.println("you won Rs."+p.getAmount());
					System.exit(0);
				}
				
			}
		}
		else if(num==6)
		{
			System.out.println("Thank You For participantion");
			System.out.println("you won Rs."+p.getAmount());
			System.exit(0);
		}
		
			
		return false;
		
	}
}