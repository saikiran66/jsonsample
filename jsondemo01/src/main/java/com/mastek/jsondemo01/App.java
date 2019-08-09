package com.mastek.jsondemo01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mastek.jsondemo01.model.Department;
import com.mastek.jsondemo01.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) 
    {
       try {
           ObjectMapper mapper= new ObjectMapper();
//           InputStream inputstream=new FileInputStream(new File("D:\\Duplicate_Eclipse\\jsondemo01\\src\\main\\java\\Employee.json"));
           InputStream inputStream= App.class.getClassLoader().getResourceAsStream("Employee.json"); 
           TypeReference<List<Employee>> typeReference=new TypeReference<List<Employee>>() { };   
           List<Employee> employees = mapper.readValue(inputStream, typeReference);
           for(Employee e: employees){
        	   System.out.println("name is " + e.getEmpname() + "\t\tid is " + e.getEmpid() + "\t\tsalary is " + e.getSalary() + "\tdepartment is " + e.getDepartment().getDeptname());
           }
           Employee emp=new Employee();
           emp.setEmpid(3);
           emp.setEmpname("naresh");
           emp.setSalary(50000.00);
           emp.setDepartment(new Department(103,"AI")); 
           mapper.writeValue( new File("D:\\Duplicate_Eclipse\\jsondemo01\\src\\main\\java\\EmployeeOut.json") , emp);
           inputStream.close();
       } catch (FileNotFoundException e) {
	
		e.printStackTrace();
	} catch (JsonParseException e){
		e.printStackTrace();
	}catch (JsonMappingException e) {
		e.printStackTrace();
	}catch (IOException e){
		e.printStackTrace();
	}
	   
    }
}
  