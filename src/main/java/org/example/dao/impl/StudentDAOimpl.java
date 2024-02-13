package org.example.dao.impl;

import org.example.config.FactoryConfiguration;
import org.example.dao.custom.StudentDAO;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentDAOimpl implements StudentDAO {
    @Override
    public boolean save(Student dto) throws Exception {
        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction= session.beginTransaction();

        Student student= new Student(dto.getId(),dto.getName(),dto.getAddress());
        session.persist(student);

        transaction.commit();
        session.close();
        return true;
//        boolean isSaved= SQLUtil.execute("INSERT INTO studentdetails VALUES(?,?,?)",dto.getId(),dto.getName(),dto.getAddress());
//        return isSaved;

    }

    @Override
    public boolean delete(String id) throws Exception {
        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction= session.beginTransaction();

       Student student=new Student();
        session.delete(student);
        transaction.commit();
        session.close();
        return true;
//        boolean isDeleted= SQLUtil.execute("DELETE FROM studentdetails WHERE id=?",id);
//        return isDeleted;
    }

    @Override
    public boolean update(Student dto) throws Exception {
       Session session= FactoryConfiguration.getInstance().getSession();
       Transaction transaction= session.beginTransaction();

       Student student= new Student(dto.getId(), dto.getName(), dto.getAddress());
       session.update(student);

       transaction.commit();
       session.close();

       return true;
//        boolean isUpdated= SQLUtil.execute("UPDATE studentdetails SET name=?,address=? WHERE id=?",dto.getName(),dto.getAddress(),dto.getId());
//        return isUpdated;
    }
}
