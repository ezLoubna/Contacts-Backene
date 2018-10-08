package org.sid;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.sid.dao.ContactsRepository;
import org.sid.entities.Contacts;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContactsApplication 
       //implements CommandLineRunner
       {
    
	@Autowired
	private ContactsRepository contactRepository ;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ContactsApplication.class, args);
	}

	
	/*public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//Définir une forme simple de date 
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		
		contactRepository.save(new Contacts("Ez-zaouy", "Loubna", df.parse("15/08/1996"), "loubnaezzaouy@gmail.com",6666666 , "loubna.jpeg"));
		contactRepository.save(new Contacts("Ez-zaouy", "Aya", df.parse("15/08/1996"), "loubnaezzaouy@gmail.com",6666666 , "loubna.jpeg"));
		contactRepository.save(new Contacts("Ez-zaouy", "Hind", df.parse("15/08/1996"), "loubnaezzaouy@gmail.com",6666666 , "loubna.jpeg"));
		contactRepository.save(new Contacts("Ez-zaouy", "Hamza", df.parse("15/08/1996"), "loubnaezzaouy@gmail.com",6666666 , "loubna.jpeg"));
		
		contactRepository.findAll().forEach(c-> {
			System.out.println(c.getNom());
		});
		*/
		
	}
	

