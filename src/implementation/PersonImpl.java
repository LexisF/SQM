package implementation;

import interfaces.Job;
import interfaces.Person;

public class PersonImpl implements Person {
	private String name;
	private int age;
	private Job job;

	public PersonImpl(String n, int a) {
		this.name = n;
		this.age = a;

	}

	public PersonImpl(Job j) {
		this.job = j;

	}

	@Override
	public String getName() {
		return this.name;

	}

	@Override
	public int getAge() {

		return this.age;
	}

	@Override
	public Job getJob() {
		return this.job;
	}

	@Override
	public void setJob(Job j) {

		this.job = j;
	}

	@Override
	public void setAge(int a) {
		if (a >= 0) {
			this.age = a;
		}
	}

	@Override
	public void setName(String n) {
		if (n != null && !n.isEmpty()) {
			this.name = n;
		}
	}

	@Override
	public boolean equals(Person p) {
		if (this == p) {
			return true;
		}
		return false;
	}

	@Override
	public boolean olderThan(Person p) {
		if (this.getAge() > p.getAge()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean youngerThan(Person p) {
		if (this.getAge() < p.getAge()) {
			return true;
		}

		return false;
	}

	@Override
	public boolean isAdult() {
		if (this.age >= 18) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean isColleague(Person p) {

		if (this.job.getCompany().equals(p.getJob().getCompany())) {
			return true;
		}
		return false;

	}

}
