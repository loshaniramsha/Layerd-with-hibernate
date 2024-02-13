package org.example.bo.impl;

import org.example.bo.custom.StudentBO;
import org.example.dao.DAOFactory;
import org.example.dao.custom.StudentDAO;
import org.example.dto.StudentDto;
import org.example.entity.Student;

public class StudentBOimpl implements StudentBO {

    StudentDAO studentDAO= (StudentDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOType.STUDENT);

    @Override
    public boolean saveStudnt(StudentDto dto) throws Exception {
        return studentDAO.save(new Student(dto.getId(),dto.getName(),dto.getAddress()));
    }

    @Override
    public boolean updateStudnt(StudentDto dto) throws Exception {
        return studentDAO.update(new Student(dto.getId(),dto.getName(),dto.getAddress()));
    }

    @Override
    public boolean deleteStudnt(String id) throws Exception {
        return studentDAO.delete(id);
    }
}
