package org.example.dao.impl;

import org.example.dao.SQLUtil;
import org.example.dao.custom.StudentDAO;
import org.example.entity.Student;

public class StudentDAOimpl implements StudentDAO {
    @Override
    public boolean save(Student dto) throws Exception {
        boolean isSaved= SQLUtil.execute("INSERT INTO studentdetails VALUES(?,?,?)",dto.getId(),dto.getName(),dto.getAddress());
        return isSaved;
    }

    @Override
    public boolean delete(String id) throws Exception {
        boolean isDeleted= SQLUtil.execute("DELETE FROM studentdetails WHERE id=?",id);
        return isDeleted;
    }

    @Override
    public boolean update(Student dto) throws Exception {
        boolean isUpdated= SQLUtil.execute("UPDATE studentdetails SET name=?,address=? WHERE id=?",dto.getName(),dto.getAddress(),dto.getId());
        return isUpdated;
    }
}
