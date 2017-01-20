package carpool;

public class EmployeeService {

	public String shareCab(Employee emp){
		if (emp.phone == null){
			return "Mandatory Input Data was missing.";
		} else {
			return "Posting was successful.";
		}
	}
}
