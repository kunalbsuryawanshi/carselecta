package org.program.repository;

import org.program.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	public User findByEmail(String email);
}
