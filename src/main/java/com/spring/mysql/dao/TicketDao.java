/**
 * 
 */
package com.spring.mysql.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.mysql.model.Ticket;

public interface TicketDao extends CrudRepository<Ticket, Integer>{

}
