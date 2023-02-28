package payroll;

public class OrderNotFoundException extends RuntimeException {

	public OrderNotFoundException(Long id) {
		// TODO Auto-generated constructor stub
		super("Could not find employee " + id);
	}

}
