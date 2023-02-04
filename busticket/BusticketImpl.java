package com.busticket;

public  class BusticketImpl implements BusTicket
{
    static int availablebalance;// using out and inner block 
    
    BusticketImpl(int availablebalance)
    {
    	this.availablebalance =  availablebalance;
    }
    
    public  void ticketBooking(int ticket)
    {
    	if(availablebalance >= ticket)
    	{
    		availablebalance	= availablebalance - ticket;
    		System.out.println("Your ticket booked sucessfully");
    	}
    	else
    	{
    		try
    		{
    			throw new InsufficientTicketException ("Insufficient ticket");
    		}
    		catch(InsufficientTicketException e)
    		{
    			System.out.println(e.getMessage());
    		}
    	}
    }
    public  void cancelTicket(int ticket)
    {
    	availablebalance	= availablebalance+ticket;
    	System.out.println("Your Ticket is Cancelled");
    }
    public String viewTicket()
    {
    	return  ("Available Ticket "+availablebalance);
    }
    public String errorMessage()
    {
    	return ("invalid choice");
    }

	

	
}
