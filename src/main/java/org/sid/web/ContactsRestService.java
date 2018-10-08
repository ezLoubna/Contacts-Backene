package org.sid.web;

import java.util.List;


import org.sid.dao.ContactsRepository;
import org.sid.entities.Contacts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//cross site scripting faille 
@CrossOrigin("*")
public class ContactsRestService {
	@Autowired
	private ContactsRepository contactsRepository;
	
	@RequestMapping(value = "/contacts",method=RequestMethod.GET)
	public List<Contacts> getContacts() {
		return contactsRepository.findAll();	
	}
	
	
	
	@RequestMapping(value = "/contacts",method=RequestMethod.POST)
	public Contacts saveContact(@RequestBody Contacts c) {
		return contactsRepository.save(c);	
	}
	
	@RequestMapping(value = "/contacts/{id}",method=RequestMethod.DELETE)
	public boolean deleteContact(@PathVariable Long id ) {
		contactsRepository.deleteById(id);
		return true;
	}
	
	@RequestMapping(value = "/contacts/{id}",method=RequestMethod.PUT)
	public Contacts updateContact(@PathVariable Long id, Contacts c) {
		
		c.setId(id);
		return contactsRepository.save(c);	
	}
	
	@RequestMapping(value = "/ChercherContacts",method=RequestMethod.GET)
	public Page<Contacts> Chercher(
			@RequestParam(name="mc",defaultValue="") String mc,
			@RequestParam(name="page",defaultValue="0") int page,
			@RequestParam(name="size",defaultValue="5") int size
			) {
		     return contactsRepository.chercher("%"+mc+"%", new PageRequest(page,size));
		  }
	
	
	
	

}
