package hu.carinquiry.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hu.carinquiry.dao.MakeRepository;
import hu.carinquiry.model.Make;

@Service
public class CarService {
	
	@Autowired
	private MakeRepository makeRepository;

	public Iterable<Make> findCarByMaked() {
		return makeRepository.findAll();
	}

}
