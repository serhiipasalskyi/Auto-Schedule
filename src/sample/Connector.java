package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.scene.input.KeyEvent;

import java.util.ArrayList;
import java.util.List;

public class Connector {

    private static List<String> groups = new ArrayList<>();
    private static int[] pairsPerDay = new int[5];
    private static List<FullPreparedInformation> fullPreparedInformationList = new ArrayList<>();

    public static void setGroups(List<String> groups) {
        Connector.groups.addAll(groups);
    }

    public static List<String> getGroups() {
        return groups;
    }

    public static void addFullPreparedInformation(String subject, String teacher, String auditorium){
        fullPreparedInformationList.add(new FullPreparedInformation(subject, teacher, auditorium));
    }

    public static void addFullPreparedInformation(String subject, String teacher, List<String> auditoriums){
        fullPreparedInformationList.add(new FullPreparedInformation(subject, teacher, auditoriums));
    }

    public static int[] getPairsPerDay() {
        return pairsPerDay;
    }

    public static void setPairsPerDay(int... pairsPerDay) {
        Connector.pairsPerDay = pairsPerDay;
    }

    public static void setLimitationOnField(TextField textField, int maxLength){
        textField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(final ObservableValue<? extends String> ov, final String oldValue, final String newValue) {
                if (textField.getText().length() > maxLength) {
                    String s = textField.getText().substring(0, maxLength);
                    textField.setText(s);
                }
            }
        });
    }

    public static void setOnlyDigitsInField(TextField textField) {
        textField.setOnKeyTyped(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent ke) {
                char c = ke.getCharacter().charAt(0);
                if (c != ',' && c < '0' || c > '9')
                    ke.consume();
            }
        });
    }

    public static void setOnlyUpperCaseInField(TextField textField) {
        textField.setTextFormatter(new TextFormatter<>((change) -> {
            change.setText(change.getText().toUpperCase());
            return change;
        }));
    }

    public static List<FullPreparedInformation> getFullPreparedInformationList() {
        return fullPreparedInformationList;
    }

    public static void addPreparedInformation(FullPreparedInformation fullPreparedInformation){
        fullPreparedInformationList.add(fullPreparedInformation);
    }

    public static int maxPairPerDay(){
        int max = Integer.MIN_VALUE;

        for (int i : pairsPerDay)
            if (i > max)
                max = i;

        return max;
    }

    public static int minPairPerDay(){
        int min = Integer.MAX_VALUE;

        for (int i : pairsPerDay)
            if (i < min)
                min = i;

        return min;
    }
}
