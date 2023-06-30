package com.demospring.SpringbootmysqlEx.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demospring.SpringbootmysqlEx.Entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long>
{

}
