package com.inovati.tests;

import java.util.HashMap;
import java.util.List;


import com.inovati.db.DaoAbstract;
import com.inovati.domains.Student;

public class StudentTest {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student();
		stu.setName("D2");
		stu.setLastname("De Dulce");
		stu.setRating(6.666);
		
		stu.save();
		
		List<Student> studentList = (List<Student>) DaoAbstract.executeQuery("select s from Student s", new HashMap<String,String>());
		
		for(Student s : studentList){
			System.out.print("Student_id " + s.getId() + " ");
			System.out.print("Name " + s.getName() + " ");
			System.out.print("Lastname " + s.getLastname() + " ");
			System.out.println("Rating : " + s.getRating());
		}

	}

}
