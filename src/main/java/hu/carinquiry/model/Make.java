package hu.carinquiry.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Make {
	@Id
	@GeneratedValue
	private int makeId;
	private String name;
	
	public Make() {}
	
	public Make(int makeId, String name) {
		this.makeId = makeId;
		this.name = name;
	}
	public int getMakeId() {
		return makeId;
	}
	public void setMakeId(int makeId) {
		this.makeId = makeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Make [makeId=" + makeId + ", name=" + name + "]";
	}
	
	
}
