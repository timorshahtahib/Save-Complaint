package com.poraan.Learn.Spring.service;


import com.poraan.Learn.Spring.model.Comita;
import com.poraan.Learn.Spring.model.Department;

public interface DepartmentService {
    void saveDepartment(Department comita);

    Object findAll();

    Department findDepartmentById(Long id);

    void deleteDepartmentById(Long id);
}
