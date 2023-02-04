package com.busticket;

import java.util.Scanner;

public class TicketMainclass 
{

	public static int validateInput(String input)
	{
		int res = 0;
		if(Character.isDigit(input.charAt(0)))
		{
			res = Integer.parseInt(input);
		}
		else {
			try {
				throw new InvalidInputException("Enter the Valid Input");
			}catch(InvalidInputException e)
			{
				System.out.println(e.getMessage());
			}
		}
		return res;
	}
	public static void main(String[] args)
	{
		int ticket;
		Scanner sc = new Scanner (System.in);
		BusTicket b1 = new BusticketImpl(50);
		while(true)
		{
			System.out.println("1:TicketBooking\n2:CancelTicket\n3:ViewTicket\n4:Exit");
			System.out.println("Enter your choice");

			String input = sc.nextLine();

			int choice = validateInput(input);
			switch(choice)
			{
			case 1:
			{
				System.out.println("Enter your no of ticket  ");
				ticket = sc.nextInt();
				b1.ticketBooking(ticket);
				break;
			}
			case 2:
			{
				System.out.println("Enter no of Ticket Cancel");
				ticket = sc.nextInt();
				b1.cancelTicket(ticket);
				break;
			}
			case 3:
			{
				System.out.println(b1.viewTicket()); 
				break;
			}
			case 4:
			{
				System.out.println("Thk u");
				System.exit(0);
			}
			default:
			{
				System.out.println(b1.errorMessage()); 
			}

			}
		
	}

	// enter String value throw exception

}
}
