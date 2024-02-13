package org.example.dao;

import org.example.dao.custom.StudentDAO;
import org.example.dao.impl.StudentDAOimpl;

public class DAOFactory {
        private static DAOFactory daoFactory;

        private DAOFactory() {
        }

        public static DAOFactory getDaoFactory() {
            return (daoFactory == null) ? daoFactory = new DAOFactory() : daoFactory;
        }

        public enum DAOType {
            STUDENT
        }
        public SuperDAO getDAO(DAOType daoType) {
            switch (daoType) {
                case STUDENT:
                    return new StudentDAOimpl();
                default:
                    return null;
            }
        }
}
