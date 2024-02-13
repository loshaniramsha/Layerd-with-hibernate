package org.example.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import org.example.bo.BOFactory;
import org.example.bo.custom.StudentBO;
import org.example.dto.StudentDto;

public class StudentFormController {

    StudentBO studentBO = (StudentBO) BOFactory.getBoFactory().getBO(BOFactory.BOType.STUDENT);
    public AnchorPane root;
    public TextField textId;
    public TextField textName;
    public TextField textAddress;

    public void btnSaveOnAction(ActionEvent actionEvent) throws Exception {
        String id = textId.getText();
        String name = textName.getText();
        String address = textAddress.getText();
        StudentDto studentDto = new StudentDto(id, name, address);
        boolean isSaved = studentBO.saveStudnt(studentDto);
        if (isSaved){
            new Alert(Alert.AlertType.CONFIRMATION, "Saved").show();
            clearField();
        }

    }

    private void clearField() {
        textId.clear();
        textName.clear();
        textAddress.clear();
    }

    public void btnDeleteOnAction(ActionEvent actionEvent) throws Exception {
        String id = textId.getText();
        if (studentBO.deleteStudnt(id)) {
            new Alert(Alert.AlertType.CONFIRMATION, "Deleted").show();
            clearField();
        }
    }

    public void btnUpdateOnAction(ActionEvent actionEvent) {
        String id = textId.getText();
        String name = textName.getText();
        String address = textAddress.getText();
        StudentDto studentDto = new StudentDto(id, name, address);
        try {
            boolean isUpdated = studentBO.updateStudnt(studentDto);
            if (isUpdated) {
                new Alert(Alert.AlertType.CONFIRMATION, "Updated").show();
                clearField();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
