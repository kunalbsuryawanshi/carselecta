package org.program.service;

import org.program.repository.EmailDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailDataService {

	@Autowired
	private EmailDataRepository emailDataRepository;
	
}
