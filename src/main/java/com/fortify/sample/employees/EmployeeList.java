package com.fortify.sample.employees;

import java.util.ArrayList;
import java.util.List;


public class EmployeeList {
    private static final List<Employee> employeeList = new ArrayList();
    
    private EmployeeList(){
    }
    
    static{
		/*
        employeeList.add(new Employee("John","Smith","12-12-1980","Manager","Sales","john.smith@abc.com"));
        employeeList.add(new Employee("Laura","Adams","02-11-1979","Manager","IT","laura.adams@abc.com"));
        employeeList.add(new Employee("Peter","Williams","22-10-1966","Coordinator","HR","peter.williams@abc.com"));
        employeeList.add(new Employee("Joana","Sanders","11-11-1976","Manager","Marketing","joana.sanders@abc.com"));
        employeeList.add(new Employee("John","Drake","18-08-1988","Coordinator","Finance","john.drake@abc.com"));
        employeeList.add(new Employee("Samuel","Williams","22-03-1985","Coordinator","Finance","samuel.williams@abc.com"));
		*/
		
		employeeList.add(new Employee("Stacie","Balharry","19-12-1984","Design Engineer","Research and Development","sbalharry0@mozilla.org"));
		employeeList.add(new Employee("Jayme","Mirfield","24-12-1989","Senior Developer","Services","jmirfield1@mtv.com"));
		employeeList.add(new Employee("Lyda","Gerrie","06-11-1998","Environmental Tech","Human Resources","lgerrie2@jugem.jp"));
		employeeList.add(new Employee("Kellen","Petchey","20-03-1982","Nuclear Power Engineer","Business Development","kpetchey3@yale.edu"));
		employeeList.add(new Employee("Hynda","McWilliams","18-06-1975","Librarian","Research and Development","hmcwilliams4@vk.com"));
		employeeList.add(new Employee("Roselle","Giampietro","09-10-1993","Speech Pathologist","Engineering","rgiampietro5@fema.gov"));
    }
    
    public static List <Employee> getInstance(){
        return employeeList;
    }
}
