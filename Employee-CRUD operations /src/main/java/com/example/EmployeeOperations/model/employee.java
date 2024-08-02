package com.example.EmployeeOperations.model;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "employee")
@NoArgsConstructor
@AllArgsConstructor

public class employee {
	
	@Id
	private long id;
	@Column( name = "name")
	public String name;
	@Column( name = "desgination")
	public String desgination;
	@Column( name = "email")
	public String email;
	
	public employee(Long id, String name, String desgination, String email) {
		this.id = id;
		this.name = name;
		this.desgination = desgination;
		this.email = email;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setFirst_Name(String name) {
		this.name = name;
	}
	
	public String getDesgination() {
		return desgination;
	}
	
	public void setDesgination(String desgination) {
		this.desgination = desgination;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail_Id(String email) {
		this.email = email;
	}
	
	//to overcome no default constructor error on entity
	public employee() {}
	

}




