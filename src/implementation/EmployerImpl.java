package implementation;

import java.util.ArrayList;
import java.util.List;

import interfaces.Employer;
import interfaces.Person;

public class EmployerImpl implements Employer {
	private String name;
	private List<Person> employees;

	public EmployerImpl(String n) {
		this.name=n;
		employees = new ArrayList<Person>();
	}

	@Override
	public void hire(Person p, String title, double salary) {
		
		employees.add(p);
		

	}

	@Override
	public List<Person> getEmployees() {
		
		return employees;
	}

	@Override
	public int getEmployeeCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean fire(Person p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmployed(Person p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Person getHighestPaid() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person getLowestPaid() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getStaffCost() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getCountOf(String title) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Person> getAll(String title) {
		// TODO Auto-generated method stub
		return null;
	}

}
