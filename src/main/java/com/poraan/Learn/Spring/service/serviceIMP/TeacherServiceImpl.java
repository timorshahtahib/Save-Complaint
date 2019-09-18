package com.poraan.Learn.Spring.service.serviceIMP;


import com.poraan.Learn.Spring.model.Teacher;
import com.poraan.Learn.Spring.repository.TeacherRepository;
import com.poraan.Learn.Spring.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    TeacherRepository teacherRepository;


    @Override
    public void saveTeacher(Teacher student) {

        teacherRepository.save(student);


    }

    @Override
    public Object findAll() {
        return teacherRepository.findAll();
    }

    @Override
    public Teacher findStudentById(Long id) {
        return teacherRepository.getOne(id);
    }

    @Override
    public void deleteStudentById(Long id) {

        teacherRepository.deleteById(id);

    }
}
