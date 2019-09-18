package com.poraan.Learn.Spring.repository;


import com.poraan.Learn.Spring.model.Comita;
import com.poraan.Learn.Spring.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository <Department, Long> {
}
