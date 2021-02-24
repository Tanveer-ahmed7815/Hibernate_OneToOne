package com.testyantra.HibernateOneOnOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.testyantra.employeedto.LaptopInfo;
import com.testyantra.employeedto.StudentInfo;

public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("StudentsDB");
        
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        
        
//        Principal prin = new Principal();
//        prin.setPrincipalId(101);
//        prin.setPrincipalName("Kanchana");
//        
//        School school = new School();
//        school.setSchoolCode(123);
//        school.setSchoolName("East Point");
//        school.setPrincipal(prin);
//        
//        em.persist(prin);
//        em.persist(school);
//        
        
        StudentInfo student = new StudentInfo();
        LaptopInfo laptop = new LaptopInfo();
        laptop.setLaptopId(113);
        laptop.setLaptopName("Lenovo");
        
        student.setStudentId(137);
        student.setStudentName("Srk");
        student.setLaptopInfo(laptop);
        //student = em.getReference(StudentInfo.class, 137);
    	student = em.find(StudentInfo.class, 135);
    	System.out.println(student);
        //em.remove(student);
        
//        
//        em.persist(lap);
        //em.persist(stud);
        
//        EmployeeInfo emp = new EmployeeInfo();
//        emp.setEmployeeId
        
//        EmployeeInfo info = new EmployeeInfo();
//        EmployeeOtherInfo other = new EmployeeOtherInfo();
//        other.setEmployeeOtherId(333);
//        other.setAadhaarCard("555731");
//        other.setPanCard(("dhs2424"));
//        
//        info.setEmployeeId(105);
//        info.setEmployeeName("taha");
//        info.setMobileNumber(124546490);
//        info.setEmployeeOtherInfo(other);
//        
//       
//        
//        em.persist(other);
//        em.persist(info);
        em.getTransaction().commit();
       
        em.close();
        
        emf.close();
    }
}
