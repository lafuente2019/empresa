package entities;

public class Employee {
	
	private String name;
	protected Integer hours;
	protected Double valueHour;
	
	public Employee() {
		
	}

	public Employee(String name, Integer hours, Double valueHour) {
		super();
		this.name = name;
		this.hours = hours;
		this.valueHour = valueHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValueHour() {
		return valueHour;
	}

	public void setValueHour(Double valueHour) {
		this.valueHour = valueHour;
	}
    public Double  payment() {
    	return hours * valueHour;
    }
}
