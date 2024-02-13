package org.example.bo;

import org.example.bo.impl.StudentBOimpl;

public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory() {

    }

    public static BOFactory getBoFactory() {
        return (boFactory == null) ? boFactory = new BOFactory() : boFactory;
    }

    public enum BOType {
        STUDENT
    }
public SuperBo getBO(BOType boType){
    switch (boType){
        case STUDENT:
            return new StudentBOimpl();
        default:
            return null;
    }
}
}
