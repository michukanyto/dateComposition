package dateComposition;

public class Date {
	private int year;
	private int month;
	private int day;
	
	
	public Date() {
		this (0,0,0);
	}
	
	public Date(int year) {
		this (year,0,0);
	}
	
	public Date(int year,int month) {
		this (year,month,0);
	}
	
	
	public Date(int year,int month,int day) {
		setYear(year);
		setMonth(month);
		setDay(day);
		System.out.printf("The date from constructor is %s\n", this);
		
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public String toString() {
		return String.format("%d/%d/%d",year,month,day);
	}

}
