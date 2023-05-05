package com.student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.Entity.Admin;

@Repository
public interface AdminRep extends JpaRepository<Admin, Long> {

	Admin save(Admin admin);

	Admin findByName(String name);
}
