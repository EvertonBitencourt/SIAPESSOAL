package br.com.siapessoal.service;

import org.springframework.stereotype.Service;

import br.com.siapessoal.domain.User;
import br.com.siapessoal.repository.UserRepository;

@Service
public class UserService {
	
	private final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public Iterable<User> listAll() {
		return userRepository.findAll();
	}
	
	
}
