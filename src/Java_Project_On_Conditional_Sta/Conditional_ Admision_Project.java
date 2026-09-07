package Java\_Project\_On\_Conditional\_Sta;

import java.util.Scanner;

public class First\_Project {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Age :");

		int age = sc.nextInt();

		if(age >= 18 && age <= 25)

		{

			System.out.println("You Ara Eligible For Admission ...");

			System.out.println("Enter Your Marks :");

			int marks = sc.nextInt();

			if(marks > 90)

			{

				System.out.println("Enter Your Cast ...");

				String cast = sc.next();

				if (cast.equals("Open"))

				{

			//		System.out.println("You Need to pay 50 K");

					System.out.println("Enter Your Adhar Card Number :");

					String Adhar = sc.next();

					if(Adhar.length() == 12)

					{

						System.out.println("Adhar Card Number is Valid ...  ");

						System.out.println("You Need To Pay the 2 lakh Ruprrs ");

						System.out.println("How You Want To Pay 2 lakh Rupees :");

						System.out.println("1.UPI");

						System.out.println("2.CASH");

						int choice = sc.nextInt();

						if(choice == 1)

						{

							System.out.println("UPI Payment Is Success...");

							System.out.println("Thank You Your Admission is Success ");

						}

						else if (choice == 2)

						{

							System.out.println("Please Contact With Admin Department  and submit the Cash.");

							System.out.println("Admission is in Progress..");

						}

						else

						{

							System.out.println("Please Enter the Valid Choice...");

						}

					}

					else

					{

						System.out.println("Adhar Card Number is Not Valid ... Admission is Failed ");

					}

				}

				else if(cast.equals("Obc"))

				{

					System.out.println("Enter Your Adhar Card Number :");

					String Adhar = sc.next();

					if(Adhar.length() == 12)

					{

						System.out.println("Adhar Card Number is Valid ...  ");

						System.out.println("You Need To Pay the 1 lakh Ruprrs ");

						System.out.println("How You Want To Pay 1 lakh Rupees :");

						System.out.println("1.UPI");

						System.out.println("2.CASH");

						int choice = sc.nextInt();

						if(choice == 1)

						{

							System.out.println("UPI Payment Is Success...");

							System.out.println("Thank You Your Admission is Success ");

						}

						else if (choice == 2)

						{

							System.out.println("Please Contact With Admin Department  and submit the Cash.");

							System.out.println("Admission is in Progress..");

						}

						else

						{

							System.out.println("Please Enter the Valid Choice...");

						}

					}

					else

					{

						System.out.println("Adhar Card Number is Not Valid ... Admission is Failed ");

					}

				}

				else if(cast.equals("Sc"))

				{

					System.out.println("Enter Your Adhar Card Number :");

					String Adhar = sc.next();

					if(Adhar.length() == 12)

					{

						System.out.println("Adhar Card Number is Valid ...  ");

						System.out.println("You Need To Pay the 50k Ruprrs ");

						System.out.println("How You Want To Pay 50k Rupees :");

						System.out.println("1.UPI");

						System.out.println("2.CASH");

						int choice = sc.nextInt();

						if(choice == 1)

						{

							System.out.println("UPI Payment Is Success...");

							System.out.println("Thank You Your Admission is Success ");

						}

						else if (choice == 2)

						{

							System.out.println("Please Contact With Admin Department  and submit the Cash.");

							System.out.println("Admission is in Progress..");

						}

						else

						{

							System.out.println("Please Enter the Valid Choice...");

						}

					}

					else

					{

						System.out.println("Adhar Card Number is Not Valid ... Admission is Failed ");

					}

				}

				else if(cast.equals("Nt"))

				{

					System.out.println("Enter Your Adhar Card Number :");

					String Adhar = sc.next();

					if(Adhar.length() == 12)

					{

						System.out.println("Adhar Card Number is Valid ...  ");

						System.out.println("You Need To Pay the 25k Ruprrs ");

						System.out.println("How You Want To Pay 25k Rupees :");

						System.out.println("1.UPI");

						System.out.println("2.CASH");

						int choice = sc.nextInt();

						if(choice == 1)

						{

							System.out.println("UPI Payment Is Success...");

							System.out.println("Thank You Your Admission is Success ");

						}

						else if (choice == 2)

						{

							System.out.println("Please Contact With Admin Department  and submit the Cash.");

							System.out.println("Admission is in Progress..");

						}

						else

						{

							System.out.println("Please Enter the Valid Choice...");

						}

					}

					else

					{

						System.out.println("Adhar Card Number is Not Valid ... Admission is Failed ");

					}

				}

				else 

				{

					System.out.println("No Need To pay .... Admission Success...");

				}

			}

			else if(marks > 70)

			{

				System.out.println("Enter Your Cast ...");

				String cast = sc.next();

				if (cast.equals("Open"))

				{

					System.out.println("Enter Your Adhar Card Number :");

					String Adhar = sc.next();

					if(Adhar.length() == 12)

					{

						System.out.println("Adhar Card Number is Valid ...  ");

						System.out.println("You Need To Pay the 2 lakh Ruprrs ");

						System.out.println("How You Want To Pay 2 lakh Rupees :");

						System.out.println("1.UPI");

						System.out.println("2.CASH");

						int choice = sc.nextInt();

						if(choice == 1)

						{

							System.out.println("UPI Payment Is Success...");

							System.out.println("Thank You Your Admission is Success ");

						}

						else if (choice == 2)

						{

							System.out.println("Please Contact With Admin Department  and submit the Cash.");

							System.out.println("Admission is in Progress..");

						}

						else

						{

							System.out.println("Please Enter the Valid Choice...");

						}

					}

					else

					{

						System.out.println("Adhar Card Number is Not Valid ... Admission is Failed ");

					}

				}

				else if(cast.equals("Obc"))

				{

					System.out.println("Enter Your Adhar Card Number :");

					String Adhar = sc.next();

					if(Adhar.length() == 12)

					{

						System.out.println("Adhar Card Number is Valid ...  ");

						System.out.println("You Need To Pay the 1 lakh Ruprrs ");

						System.out.println("How You Want To Pay 1 lakh Rupees :");

						System.out.println("1.UPI");

						System.out.println("2.CASH");

						int choice = sc.nextInt();

						if(choice == 1)

						{

							System.out.println("UPI Payment Is Success...");

							System.out.println("Thank You Your Admission is Success ");

						}

						else if (choice == 2)

						{

							System.out.println("Please Contact With Admin Department  and submit the Cash.");

							System.out.println("Admission is in Progress..");

						}

						else

						{

							System.out.println("Please Enter the Valid Choice...");

						}

					}

					else

					{

						System.out.println("Adhar Card Number is Not Valid ... Admission is Failed ");

					}

				}

				else if(cast.equals("Sc"))

				{

					System.out.println("Enter Your Adhar Card Number :");

					String Adhar = sc.next();

					if(Adhar.length() == 12)

					{

						System.out.println("Adhar Card Number is Valid ... ");

						System.out.println("You Need To Pay the 50k Ruprrs ");

						System.out.println("How You Want To Pay 50k Rupees :");

						System.out.println("1.UPI");

						System.out.println("2.CASH");

						int choice = sc.nextInt();

						if(choice == 1)

						{

							System.out.println("UPI Payment Is Success...");

							System.out.println("Thank You Your Admission is Success ");

						}

						else if (choice == 2)

						{

							System.out.println("Please Contact With Admin Department  and submit the Cash.");

							System.out.println("Admission is in Progress..");

						}

						else

						{

							System.out.println("Please Enter the Valid Choice...");

						}

					}

					else

					{

						System.out.println("Adhar Card Number is Not Valid ... Admission is Failed ");

					}

				}

				else if(cast.equals("Nt"))

				{

					System.out.println("Enter Your Adhar Card Number :");

					String Adhar = sc.next();

					if(Adhar.length() == 12)

					{

						System.out.println("Adhar Card Number is Valid ... ");

						System.out.println("You Need To Pay the 25k Ruprrs ");

						System.out.println("How You Want To Pay 25k Rupees :");

						System.out.println("1.UPI");

						System.out.println("2.CASH");

						int choice = sc.nextInt();

						if(choice == 1)

						{

							System.out.println("UPI Payment Is Success...");

							System.out.println("Thank You Your Admission is Success ");

						}

						else if (choice == 2)

						{

							System.out.println("Please Contact With Admin Department  and submit the Cash.");

							System.out.println("Admission is in Progress..");

						}

						else

						{

							System.out.println("Please Enter the Valid Choice...");

						}

					}

					else

					{

						System.out.println("Adhar Card Number is Not Valid ... Admission is Failed ");

					}

				}

				else 

				{

					System.out.println("No Need To pay .... Admission Success...");

				}

			}

			else if(marks > 50)

			{

				System.out.println("Enter Your Cast ...");

				String cast = sc.next();

				if (cast.equals("Open"))

				{

					System.out.println("Enter Your Adhar Card Number :");

					String Adhar = sc.next();

					if(Adhar.length() == 12)

					{

						System.out.println("Adhar Card Number is Valid ...  ");

						System.out.println("You Need To Pay the 2 lakh Ruprrs ");

						System.out.println("How You Want To Pay 2 lakh Rupees :");

						System.out.println("1.UPI");

						System.out.println("2.CASH");

						int choice = sc.nextInt();

						if(choice == 1)

						{

							System.out.println("UPI Payment Is Success...");

							System.out.println("Thank You Your Admission is Success ");

						}

						else if (choice == 2)

						{

							System.out.println("Please Contact With Admin Department  and submit the Cash.");

							System.out.println("Admission is in Progress..");

						}

						else

						{

							System.out.println("Please Enter the Valid Choice...");

						}

					}

					else

					{

						System.out.println("Adhar Card Number is Not Valid ... Admission is Failed ");

					}

				}

				else if(cast.equals("Obc"))

				{

					System.out.println("Enter Your Adhar Card Number :");

					String Adhar = sc.next();

					if(Adhar.length() == 12)

					{

						System.out.println("Adhar Card Number is Valid ...  ");

						System.out.println("You Need To Pay the 1 lakh Ruprrs ");

						System.out.println("How You Want To Pay 1 lakh Rupees :");

						System.out.println("1.UPI");

						System.out.println("2.CASH");

						int choice = sc.nextInt();

						if(choice == 1)

						{

							System.out.println("UPI Payment Is Success...");

							System.out.println("Thank You Your Admission is Success ");

						}

						else if (choice == 2)

						{

							System.out.println("Please Contact With Admin Department  and submit the Cash.");

							System.out.println("Admission is in Progress..");

						}

						else

						{

							System.out.println("Please Enter the Valid Choice...");

						}

					}

					else

					{

						System.out.println("Adhar Card Number is Not Valid ... Admission is Failed ");

					}

				}

				else if(cast.equals("Sc"))

				{

					System.out.println("Enter Your Adhar Card Number :");

					String Adhar = sc.next();

					if(Adhar.length() == 12)

					{

						System.out.println("Adhar Card Number is Valid ... ");

						System.out.println("You Need To Pay the 50k Ruprrs ");

						System.out.println("How You Want To Pay 50k Rupees :");

						System.out.println("1.UPI");

						System.out.println("2.CASH");

						int choice = sc.nextInt();

						if(choice == 1)

						{

							System.out.println("UPI Payment Is Success...");

							System.out.println("Thank You Your Admission is Success ");

						}

						else if (choice == 2)

						{

							System.out.println("Please Contact With Admin Department  and submit the Cash.");

							System.out.println("Admission is in Progress..");

						}

						else

						{

							System.out.println("Please Enter the Valid Choice...");

						}

					}

					else

					{

						System.out.println("Adhar Card Number is Not Valid ... Admission is Failed ");

					}

				}

				else if(cast.equals("Nt"))

				{

					System.out.println("Enter Your Adhar Card Number :");

					String Adhar = sc.next();

					if(Adhar.length() == 12)

					{

						System.out.println("Adhar Card Number is Valid ... ");

						System.out.println("You Need To Pay the 25k Ruprrs ");

						System.out.println("How You Want To Pay 25k Rupees :");

						System.out.println("1.UPI");

						System.out.println("2.CASH");

						int choice = sc.nextInt();

						if(choice == 1)

						{

							System.out.println("UPI Payment Is Success...");

							System.out.println("Thank You Your Admission is Success ");

						}

						else if (choice == 2)

						{

							System.out.println("Please Contact With Admin Department  and submit the Cash.");

							System.out.println("Admission is in Progress..");

						}

						else

						{

							System.out.println("Please Enter the Valid Choice...");

						}

					}

					else

					{

						System.out.println("Adhar Card Number is Not Valid ... Admission is Failed ");

					}

				}

				else 

				{

					System.out.println("No Need To pay .... Admission Success...");

				}

			}

			else if(marks > 30)

			{

				System.out.println("Enter Your Cast ...");

				String cast = sc.next();

				if (cast.equals("Open"))

				{

					System.out.println("Enter Your Adhar Card Number :");

					String Adhar = sc.next();

					if(Adhar.length() == 12)

					{

						System.out.println("Adhar Card Number is Valid ...  ");

						System.out.println("You Need To Pay the 2 lakh Ruprrs ");

						System.out.println("How You Want To Pay 2 lakh Rupees :");

						System.out.println("1.UPI");

						System.out.println("2.CASH");

						int choice = sc.nextInt();

						if(choice == 1)

						{

							System.out.println("UPI Payment Is Success...");

							System.out.println("Thank You Your Admission is Success ");

						}

						else if (choice == 2)

						{

							System.out.println("Please Contact With Admin Department  and submit the Cash.");

							System.out.println("Admission is in Progress..");

						}

						else

						{

							System.out.println("Please Enter the Valid Choice...");

						}

					}

					else

					{

						System.out.println("Adhar Card Number is Not Valid ... Admission is Failed ");

					}

				}

				else if(cast.equals("Obc"))

				{

					System.out.println("Enter Your Adhar Card Number :");

					String Adhar = sc.next();

					if(Adhar.length() == 12)

					{

						System.out.println("Adhar Card Number is Valid ...  ");

						System.out.println("You Need To Pay the 1 lakh Ruprrs ");

						System.out.println("How You Want To Pay 1 lakh Rupees :");

						System.out.println("1.UPI");

						System.out.println("2.CASH");

						int choice = sc.nextInt();

						if(choice == 1)

						{

							System.out.println("UPI Payment Is Success...");

							System.out.println("Thank You Your Admission is Success ");

						}

						else if (choice == 2)

						{

							System.out.println("Please Contact With Admin Department  and submit the Cash.");

							System.out.println("Admission is in Progress..");

						}

						else

						{

							System.out.println("Please Enter the Valid Choice...");

						}

					}

					else

					{

						System.out.println("Adhar Card Number is Not Valid ... Admission is Failed ");

					}

				}

				else if(cast.equals("Sc"))

				{

					System.out.println("Enter Your Adhar Card Number :");

					String Adhar = sc.next();

					if(Adhar.length() == 12)

					{

						System.out.println("Adhar Card Number is Valid ...= ");

						System.out.println("You Need To Pay the 50k Ruprrs ");

						System.out.println("How You Want To Pay 50k Rupees :");

						System.out.println("1.UPI");

						System.out.println("2.CASH");

						int choice = sc.nextInt();

						if(choice == 1)

						{

							System.out.println("UPI Payment Is Success...");

							System.out.println("Thank You Your Admission is Success ");

						}

						else if (choice == 2)

						{

							System.out.println("Please Contact With Admin Department  and submit the Cash.");

							System.out.println("Admission is in Progress..");

						}

						else

						{

							System.out.println("Please Enter the Valid Choice...");

						}

					}

					else

					{

						System.out.println("Adhar Card Number is Not Valid ... Admission is Failed ");

					}

				}

				else if(cast.equals("Nt"))

				{

					System.out.println("Enter Your Adhar Card Number :");

					String Adhar = sc.next();

					if(Adhar.length() == 12)

					{

						System.out.println("Adhar Card Number is Valid ...  ");

						System.out.println("You Need To Pay the 25k Ruprrs ");

						System.out.println("How You Want To Pay 25k Rupees :");

						System.out.println("1.UPI");

						System.out.println("2.CASH");

						int choice = sc.nextInt();

						if(choice == 1)

						{

							System.out.println("UPI Payment Is Success...");

							System.out.println("Thank You Your Admission is Success ");

						}

						else if (choice == 2)

						{

							System.out.println("Please Contact With Admin Department  and submit the Cash.");

							System.out.println("Admission is in Progress..");

						}

						else

						{

							System.out.println("Please Enter the Valid Choice...");

						}

					}

					else

					{

						System.out.println("Adhar Card Number is Not Valid ... Admission is Failed ");

					}

				}

				else 

				{

					System.out.println("No Need To pay .... Admission Success...");

				}

			}

			else

			{

				System.out.println("Marks Are Very Low Not Eligible For Admission..❌❌❌");

			}

		}

		else

		{

			System.out.println("You are Not Eligible Fot Admission...");

		}

	}

}
