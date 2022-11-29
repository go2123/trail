package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {
	private void empName() {
		System.out.println("GOWDHAM");
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.empName();
		
		Project p = new Project();
		p.projectName();
		
		Client c = new Client();
		c.clientName();
		
		Company y = new Company();
		y.companyNmae();
	}
}
