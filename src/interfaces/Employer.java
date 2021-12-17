package interfaces;
import java.util.List;

public interface Employer {

	void hire(Person p, String title, double salary);
	boolean fire(Person p);
	boolean isEmployed(Person p);
	
	List<Person> getEmployees();
	int getEmployeeCount();
	String getName();
	Person getHighestPaid();
	Person getLowestPaid();
	double getStaffCost();
	int getCountOf(String title);
	List<Person> getAll(String title);
}
