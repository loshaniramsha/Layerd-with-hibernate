package org.example.bo.custom;

import org.example.bo.SuperBo;
import org.example.dto.StudentDto;

public interface StudentBO extends SuperBo {
    boolean saveStudnt(StudentDto dto) throws Exception;
    boolean updateStudnt(StudentDto dto) throws Exception;
    boolean deleteStudnt(String id) throws Exception;
}
