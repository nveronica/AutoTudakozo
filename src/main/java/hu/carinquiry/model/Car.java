package hu.carinquiry.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {
	@Id
	private int carId;
	
	
	public Car() {}


	public Car(int carId) {
		this.carId = carId;
	}


	public int getCarId() {
		return carId;
	}


	public void setCarId(int carId) {
		this.carId = carId;
	}


	@Override
	public String toString() {
		return "Car [carId=" + carId + "]";
	}
	
	
	
}
