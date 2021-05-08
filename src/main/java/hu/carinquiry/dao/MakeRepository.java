package hu.carinquiry.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hu.carinquiry.model.Make;
@Repository
public interface MakeRepository extends CrudRepository<Make, Integer>{
	public List<Make>findAllMake = new ArrayList<>();


	@Query("SELECT * FROM MAKE")
 	public default List<Make> findAllMake(){
		return findAllMake;
	}
}
