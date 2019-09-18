package com.poraan.Learn.Spring.repository;

import com.poraan.Learn.Spring.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {



}
