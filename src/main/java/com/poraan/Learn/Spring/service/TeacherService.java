package com.poraan.Learn.Spring.service;

import com.poraan.Learn.Spring.model.Teacher;

public interface TeacherService {
    void saveTeacher(Teacher teacher);

    Object findAll();

    Teacher findStudentById(Long id);

    void deleteStudentById(Long id);
}
