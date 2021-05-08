package hu.carinquiry.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import hu.carinquiry.dao.MakeRepository;
import hu.carinquiry.model.Car;
import hu.carinquiry.model.Make;

@Service
public class CarService {
	
	@Autowired
	private MakeRepository makeRepository;

	public Iterable<Make> findCarByMaked() {
		// TODO Auto-generated method stub
		return makeRepository.findAll();
	}

}
