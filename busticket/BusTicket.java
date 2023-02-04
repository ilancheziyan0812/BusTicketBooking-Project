package com.busticket;

public interface BusTicket
{
  void ticketBooking(int ticket);
  void cancelTicket(int ticket);
  String viewTicket();
  String errorMessage();
}
