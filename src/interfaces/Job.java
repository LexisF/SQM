package interfaces;

public interface Job {
	
	void setTitle(String t);
	void setSalary(double s);
	void setCompany(String c);
	
	
	String getTitle();
	double getSalary();
	String getCompany();
	
	
	boolean equals(Job p);

}
