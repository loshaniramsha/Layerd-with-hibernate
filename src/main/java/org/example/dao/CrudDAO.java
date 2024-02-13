package org.example.dao;

public interface CrudDAO <T> extends SuperDAO {
    boolean save(T dto) throws Exception;
    boolean delete(String id) throws Exception;
    boolean update(T dto) throws Exception;

}
