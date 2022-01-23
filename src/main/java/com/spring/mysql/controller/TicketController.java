package com.spring.mysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mysql.dao.TicketDao;
import com.spring.mysql.model.Ticket;

@RestController
@RequestMapping("/ticket")
public class TicketController {

	@Autowired
	private TicketDao ticketDao;
	
	@PostMapping("/bookTicket")
	public String bookTicket(@RequestBody List<Ticket> ticket) {
		ticketDao.saveAll(ticket);
		return "Total number of Booked tickets " + ticket.size();
	}
	
	@GetMapping("/getTickets")
	public Iterable<Ticket> getTickets(){
		return ticketDao.findAll();
	}
}
