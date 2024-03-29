package payroll;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

// JPA annotation to make this object ready for storage in a JPA-based data store
@Entity
class Employee {

	@Id
	@GeneratedValue
	private Long id;
	// private String name;
	private String firstName;
	private String lastName;

	private String role;

	// a custom constructor is created when we need to create a new instance, but
	// don’t yet have an id.
	Employee() {
	}

	Employee(String firstName, String lastName, String role) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
	}

//	Employee(String name, String role) {
//		this.name = name;
//		this.role = role;
//	}

	public Long getId() {
		return this.id;
	}

	public String getName() {
		// return this.name;
		return this.firstName + " " + this.lastName;
	}

	public String getRole() {
		return this.role;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		// this.name = name;
		String[] parts = name.split(" ");
		this.firstName = parts[0];
		this.lastName = parts[1];
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public boolean equals(Object o) {

		if (this == o)
			return true;
		if (!(o instanceof Employee))
			return false;
		Employee employee = (Employee) o;
//		return Objects.equals(this.id, employee.id) && Objects.equals(this.name, employee.name)
//				&& Objects.equals(this.role, employee.role);
		return Objects.equals(this.id, employee.id) && Objects.equals(this.firstName, employee.firstName)
				&& Objects.equals(this.lastName, employee.lastName) && Objects.equals(this.role, employee.role);

	}

	@Override
	public int hashCode() {
//		return Objects.hash(this.id, this.name, this.role);
		return Objects.hash(this.id, this.firstName, this.lastName, this.role);
	}

	@Override
	public String toString() {
		//return "Employee{" + "id=" + this.id + ", name='" + this.name + '\'' + ", role='" + this.role + '\'' + '}';
		return "Employee{" + "id=" + this.id + ", firstName='" + this.firstName + '\'' + ", lastName='" + this.lastName
		        + '\'' + ", role='" + this.role + '\'' + '}';

	}

}