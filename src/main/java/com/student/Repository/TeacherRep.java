package com.student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.Entity.Teacher;

@Repository
public interface TeacherRep extends JpaRepository<Teacher, Long> {

}
