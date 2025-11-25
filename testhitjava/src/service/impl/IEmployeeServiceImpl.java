package service.impl;

import model.Employee;
import service.IEmployeeService;

import java.util.ArrayList;
import java.util.List;

public class IEmployeeServiceImpl implements IEmployeeService {
    public List<Employee> dSEmployees = new ArrayList<>();


    public List<Employee> getAllEmployees(){
        return dSEmployees;
    }

    public Employee getEmployeeById(String id){
        for(Employee e : dSEmployees){
            if(e.getId().equalsIgnoreCase(id)){
                return e;
            }
        }
        return null;
    }

    public List<Employee> getEmployeeByName(String name){
        List<Employee> employer = new ArrayList<>();
        for(Employee e : dSEmployees){
            if(e.getName().equalsIgnoreCase(name)){
                employer.add(e);
            }
        }
        return employer;
    }
}
