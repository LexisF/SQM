package implementation;

import interfaces.Job;

public class JobImpl implements Job {
	
	private String title;
	private int salary;
	private String company;

	public JobImpl(String t, int s, String c) {
		this.title =  t;
		this.salary = s;
		this.company = c;
		
	}

	@Override
	public double getSalary() {
		return this.salary;
	}

	@Override
	public String getTitle() {
		return this.title;
	}
	
	@Override
	public String getCompany() {
		
		return this.company;
	}
	
	@Override
	public void setSalary(double s) {
		if(s>0)	{	
			this.salary = (int)s;
			}

	}

	@Override
	public void setTitle(String t) {
		
		if(!t.isEmpty()) {
			this.title = t;
		}

	}


	@Override
	public void setCompany(String c) {
		if(!c.isEmpty()) {
			this.company = c;
			}

	}

	@Override
	public boolean equals(Job p) {
		if(this==p) {
			return true;
		}
		return false;
	}

}
