package com.student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.Entity.Admin;
import com.student.Entity.Student;

@Repository
public interface StudentRep extends JpaRepository<Student,Long > {

	

}
