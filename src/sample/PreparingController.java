package sample;

import java.io.IOException;
import java.net.URL;
import java.util.*;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class PreparingController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label mainThemeLabel;

    @FXML
    private Label secondThemeLabel;

    @FXML
    private Label themeLabel;

    @FXML
    private Button forwardToSubjectsButton;

    @FXML
    private Button addGroupButton;

    @FXML
    private TextField addGroupField;

    @FXML
    private Button backToGroupButton;

    @FXML
    private Button forwardToTeachersButton;

    @FXML
    private Button addSubjectButton;

    @FXML
    private TextField addSubjectField;

    @FXML
    private Button forwardToConnectButton;

    @FXML
    private Button backToSubjectsButton;

    @FXML
    private Button addTeacherButton;

    @FXML
    private TextField addTeacherField;

    @FXML
    private Label connectionLabel1;

    @FXML
    private Label connectionLabel2;

    @FXML
    private Label connectionLabel3;

    @FXML
    private ComboBox<String> subjectBox;

    @FXML
    private ComboBox<String> teacherBox;

    @FXML
    private TextField addAuditoriumField;

    @FXML
    private Button backToTeachersButton;

    @FXML
    private Button forwardToResultsButton;

    @FXML
    private Button connectButton;

    @FXML
    private Pane popupPane1;

    @FXML
    private Label popupLabel1;

    @FXML
    private Pane popupPane2;

    @FXML
    private Label popupLabel2;

    private ObservableList<String> subjects = FXCollections.observableArrayList();
    private ObservableList<String> teachers = FXCollections.observableArrayList();
    private List<String> groups = new ArrayList<>();
    private Timer timer;

    @FXML
    void initialize() {

        timer = new Timer();
        subjectBox.setItems(subjects);
        teacherBox.setItems(teachers);

        Connector.setLimitationOnField(addAuditoriumField, 14);
        Connector.setLimitationOnField(addGroupField, 10);
        Connector.setLimitationOnField(addSubjectField, 20);
        Connector.setLimitationOnField(addTeacherField, 20);
        Connector.setOnlyUpperCaseInField(addGroupField);
        Connector.setOnlyDigitsInField(addAuditoriumField);

        sendByEnter(subjects, addSubjectField, "Предмет", "Такий предмет вже існує!");
        sendByEnter(teachers, addTeacherField, "Викладача", "Такий викладач вже існує!");
        sendByEnter(groups, addGroupField, "Групу", "Така група вже існує!");
        sendByEnter(subjectBox, teacherBox, addAuditoriumField);

        forwardToSubjectsButton.setOnAction(event -> {
            mainThemeLabel.setText("Ввід предметів для складання розкладу");
            secondThemeLabel.setText("Додайте предмети, які буде містити розклад");
            hide(forwardToSubjectsButton, addGroupButton, addGroupField);
            show(themeLabel, "Введіть назву предмету:", backToGroupButton, forwardToTeachersButton, addSubjectButton, addSubjectField);
            addGroupField.clear();
        });

        forwardToTeachersButton.setOnAction(event -> {
            mainThemeLabel.setText("Ввід викладачів для складання розкладу");
            secondThemeLabel.setText("Додайте будь-ласка викладачів");
            hide(backToGroupButton, forwardToTeachersButton, addSubjectButton, addSubjectField);
            show(themeLabel, "Введіть прізвище та ініціали викладача:", backToSubjectsButton, forwardToConnectButton, addTeacherButton, addTeacherField);
            addSubjectField.clear();
        });

        forwardToConnectButton.setOnAction(event -> {
            mainThemeLabel.setText("Зв'язування навчальних предметів, викладачів і аудиторій");
            secondThemeLabel.setText("Зв'яжіть предмети, викладачів і аудиторії, в яких можуть проводитись дані заняття");
            hide(backToSubjectsButton, forwardToConnectButton, addTeacherButton, addTeacherField, themeLabel);
            show(connectionLabel2, "Виберіть викладача:", connectionLabel1, connectionLabel3, backToTeachersButton, forwardToResultsButton, connectButton, subjectBox, teacherBox, addAuditoriumField);
            addTeacherField.clear();
        });

        backToGroupButton.setOnAction(event -> {
            mainThemeLabel.setText("Ввід груп для складання розкладу");
            secondThemeLabel.setText("Додайте групи, для яких буде складено розклад");
            hide(backToGroupButton, forwardToTeachersButton, addSubjectButton, addSubjectField);
            show(themeLabel, "Напишіть назву групи:", forwardToSubjectsButton, addGroupButton, addGroupField);
            addSubjectField.clear();
        });

        backToSubjectsButton.setOnAction(event -> {
            mainThemeLabel.setText("Ввід предметів для складання розкладу");
            secondThemeLabel.setText("Додайте предмети, які буде містити розклад");
            hide(backToSubjectsButton, forwardToConnectButton, addTeacherButton, addTeacherField);
            show(themeLabel, "Введіть назву предмету:", backToGroupButton, forwardToTeachersButton, addSubjectButton, addSubjectField);
            addTeacherField.clear();
        });

        backToTeachersButton.setOnAction(event -> {
            mainThemeLabel.setText("Ввід викладачів для складання розкладу");
            secondThemeLabel.setText("Додайте будь-ласка викладачів");
            hide(backToTeachersButton, forwardToResultsButton, connectButton, addAuditoriumField, subjectBox, teacherBox, connectionLabel1, connectionLabel2, connectionLabel3);
            show(themeLabel, "Введіть прізвище та ініціали викладача:", backToSubjectsButton, forwardToConnectButton, addTeacherButton, addTeacherField);
            addAuditoriumField.clear();
            subjectBox.setValue(subjectBox.getPromptText());
            teacherBox.setValue(teacherBox.getPromptText());
        });

        addSubjectButton.setOnAction(event -> addToList(subjects, addSubjectField, "Предмет", "Такий предмет вже існує!"));

        addTeacherButton.setOnAction(event -> addToList(teachers, addTeacherField, "Викладача", "Такий викладач вже існує!"));

        addGroupButton.setOnAction(event -> addToList(groups, addGroupField, "Групу", "Така група вже існує!"));

        forwardToResultsButton.setOnAction(event -> {
            timer.cancel();
            Connector.setGroups(groups);
            forwardToResultsButton.getScene().getWindow().hide();
            try{
                openNextForm();
            }catch (IOException e){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText("Виникла помилка!");
                alert.setContentText(e.toString());
                alert.show();
            }
        });

        connectButton.setOnAction(event -> connectData(subjectBox, teacherBox, addAuditoriumField));
    }


    private void show(Label label, String text, Control... controls){
        label.setText(text);
        label.setVisible(true);
        for (Control e : controls)
            e.setVisible(true);
    }

    private void hide(Control... controls){
        for (Control e : controls)
            e.setVisible(false);
    }

    private boolean hasValue(List<String> list, String value){
        boolean hasValue = false;

        if (list.size() > 0) {
            for (String e : list)
                if (e.equals(value)) {
                    hasValue = true;
                    break;
                }
        }
        return hasValue;
    }

    private boolean hasValue(String subject, String teacher){
        boolean isTheSame = false;

        if (Connector.getFullPreparedInformationList().size() > 0) {
            for (FullPreparedInformation e : Connector.getFullPreparedInformationList())
                if (e.getSubject().equals(subject) && e.getTeacher().equals(teacher)) {
                    isTheSame = true;
                    break;
                }
        }
        return isTheSame;
    }

    private boolean hasAllValues(String subject, String teacher, List<String> auditoriums){
        boolean hasAllValues = false;
        int counter = 0;

        if (Connector.getFullPreparedInformationList().size() > 0)
            for (FullPreparedInformation e : Connector.getFullPreparedInformationList())
                if (e.getSubject().equals(subject) && e.getTeacher().equals(teacher))
                    for (int i = 0; i < auditoriums.size(); i++)
                        if (e.getAuditoriums().contains(auditoriums.get(i))) {
                            auditoriums.set(i, "");
                            counter++;
                        }

        if (auditoriums.size() == counter)
            hasAllValues = true;

        return hasAllValues;
    }

    private boolean hasAllValues(String subject, String teacher, String auditorium){
        boolean hasAllValues = false;

        if (Connector.getFullPreparedInformationList().size() > 0)
            for (FullPreparedInformation e : Connector.getFullPreparedInformationList())
                if (e.getSubject().equals(subject) && e.getTeacher().equals(teacher)&& hasValue(e.getAuditoriums(), auditorium)) {
                    hasAllValues = true;
                    break;
                }
        return hasAllValues;
    }

    private void addToList(List<String> list, TextField field, String yesText, String noText){
        MyTimerTask myTimerTask = new MyTimerTask(popupPane1);
        String value = field.getText().trim();
        if (!value.isEmpty()) {
            if (!hasValue(list, value)) {
                list.add(value);
                popupLabel1.setText(yesText + " " + "\"" + value + "\"" + " успішно додано!");
            } else
                popupLabel1.setText(noText);
        }
        else popupLabel1.setText("Ви не ввели нічого!");

        popupPane1.setVisible(true);
        timer.schedule(myTimerTask, 1700);
        field.clear();
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }

    private void openNextForm() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("fxml/main.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Дипломна робота Пасальського С. А., 1-КТ-15");
        stage.setScene(new Scene(root, 800, 500));
        stage.setResizable(false);
        stage.show();
    }

    private void connectData(ComboBox<String> comboBox1, ComboBox<String> comboBox2, TextField textField) {
        MyTimerTask myTimerTask = new MyTimerTask(popupPane2);
        String subject = comboBox1.getValue();
        String teacher = comboBox2.getValue();
        List<String> auditoriums;
        String auditorium;

        try {
            if (textField.getText().contains(",")) {
                auditoriums = Arrays.asList(textField.getText().trim().split(","));
                if (subject.isEmpty() || teacher.isEmpty() || auditoriums.size() <= 0 || subject.equals("Предмет") || teacher.equals("Викладач"))
                    popupLabel2.setText("Ви не ввели дані!");
                else {
                    if (!hasAllValues(subject, teacher, auditoriums)) {
                        if (!hasValue(subject, teacher)) {
                            Connector.addFullPreparedInformation(subject, teacher, auditoriums);
                            popupLabel2.setText("Предмет \"" + subject + "\", викладач \"" + teacher + "\" та аудиторії \"" + auditoriums.get(0) + "\"... успішно зв'язані!");
                        } else
                            for (FullPreparedInformation e : Connector.getFullPreparedInformationList())
                                if (e.getTeacher().equals(teacher) && e.getSubject().equals(subject)) {
                                    e.addAuditoriums(auditoriums);
                                    popupLabel2.setText("Предмет \"" + subject + "\", викладач \"" + teacher + "\" та аудиторії \"" + auditoriums.get(0) + "\"... успішно зв'язані!");
                                }
                        } else popupLabel2.setText("Такий зв'язок вже існує!");
                    }
                } else {
                auditorium = textField.getText().trim();
                if (subject.isEmpty() || subject.equals("Предмет") || teacher.isEmpty() || auditorium.isEmpty() || teacher.equals("Викладач"))
                    popupLabel2.setText("Ви не ввели дані!");
                else {
                    if (!hasAllValues(subject, teacher, auditorium)) {
                        if (!hasValue(subject, teacher)) {
                            Connector.addFullPreparedInformation(subject, teacher, auditorium);
                            popupLabel2.setText("Предмет \"" + subject + "\", викладач \"" + teacher + "\" та аудиторія \"" + auditorium + "\" успішно зв'язані!");
                        } else {
                            for (FullPreparedInformation e : Connector.getFullPreparedInformationList())
                                if (e.getTeacher().equals(teacher) && e.getSubject().equals(subject)) {
                                    e.addAuditorium(auditorium);
                                    popupLabel2.setText("Предмет \"" + subject + "\", викладач \"" + teacher + "\" та аудиторія \"" + auditorium + "\" успішно зв'язані!");
                                }
                        }
                    } else popupLabel2.setText("Такий зв'язок вже існує!");
                }
            }
        }catch(NullPointerException e){
            popupLabel2.setText("Ви не ввели дані!");
        }finally{
            popupPane2.setVisible(true);
            textField.clear();
            comboBox1.setValue(comboBox1.getPromptText());
            comboBox2.setValue(comboBox2.getPromptText());
            timer.schedule(myTimerTask, 1700);
        }
    }

    private void sendByEnter(List<String> list, TextField textField, String yesText, String noText){
        textField.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode() == KeyCode.ENTER)
                  addToList(list, textField, yesText,noText);
            }
        });
    }

    private void sendByEnter(ComboBox<String> comboBox1, ComboBox<String> comboBox2, TextField textField){
        textField.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode() == KeyCode.ENTER)
                    connectData(comboBox1, comboBox2, textField);
            }
        });
    }

}