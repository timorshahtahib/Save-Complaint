package com.poraan.Learn.Spring.service.serviceIMP;



import com.poraan.Learn.Spring.model.Comita;
import com.poraan.Learn.Spring.model.Department;
import com.poraan.Learn.Spring.repository.DepartmentRepository;
import com.poraan.Learn.Spring.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public void saveDepartment(Department student) {
        departmentRepository.save(student);
    }

    @Override
    public Object findAll() {
        return departmentRepository.findAll();
    }

    @Override
    public Department findDepartmentById(Long id) {
        return departmentRepository.getOne(id);
    }

    @Override
    public void deleteDepartmentById(Long id) {
        departmentRepository.deleteById(id);
    }
}
