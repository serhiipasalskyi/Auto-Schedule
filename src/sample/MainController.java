package sample;

import java.net.URL;
import java.util.*;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.AnchorPane;

public class MainController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private SplitPane splitPane;

    @FXML
    private TabPane tabPane;

    @FXML
    private Tab tab1;

    @FXML
    private TableView<Week> table1;

    @FXML
    private TableColumn<Week, String> pairNumberColumn1;

    @FXML
    private TableColumn<Week, String> mondayColumn1;

    @FXML
    private TableColumn<Week, String> tuesdayColumn1;

    @FXML
    private TableColumn<Week, String> wednesdayColumn1;

    @FXML
    private TableColumn<Week, String> thursdayColumn1;

    @FXML
    private TableColumn<Week, String> fridayColumn1;

    @FXML
    private Tab tab2;

    @FXML
    private TableView<Week> table2;

    @FXML
    private TableColumn<Week, String> pairNumberColumn2;

    @FXML
    private TableColumn<Week, String> mondayColumn2;

    @FXML
    private TableColumn<Week, String> tuesdayColumn2;

    @FXML
    private TableColumn<Week, String> wednesdayColumn2;

    @FXML
    private TableColumn<Week, String> thursdayColumn2;

    @FXML
    private TableColumn<Week, String> fridayColumn2;

    @FXML
    private Tab tab3;

    @FXML
    private TableView<Week> table3;

    @FXML
    private TableColumn<Week, String> pairNumberColumn3;

    @FXML
    private TableColumn<Week, String> mondayColumn3;

    @FXML
    private TableColumn<Week, String> tuesdayColumn3;

    @FXML
    private TableColumn<Week, String> wednesdayColumn3;

    @FXML
    private TableColumn<Week, String> thursdayColumn3;

    @FXML
    private TableColumn<Week, String> fridayColumn3;

    @FXML
    private Tab tab4;

    @FXML
    private TableView<Week> table4;

    @FXML
    private TableColumn<Week, String> pairNumberColumn4;

    @FXML
    private TableColumn<Week, String> mondayColumn4;

    @FXML
    private TableColumn<Week, String> tuesdayColumn4;

    @FXML
    private TableColumn<Week, String> wednesdayColumn4;

    @FXML
    private TableColumn<Week, String> thursdayColumn4;

    @FXML
    private TableColumn<Week, String> fridayColumn4;

    @FXML
    private Tab tab5;

    @FXML
    private TableView<Week> table5;

    @FXML
    private TableColumn<Week, String> pairNumberColumn5;

    @FXML
    private TableColumn<Week, String> mondayColumn5;

    @FXML
    private TableColumn<Week, String> tuesdayColumn5;

    @FXML
    private TableColumn<Week, String> wednesdayColumn5;

    @FXML
    private TableColumn<Week, String> thursdayColumn5;

    @FXML
    private TableColumn<Week, String> fridayColumn5;

    @FXML
    private Tab tab6;

    @FXML
    private TableView<Week> table6;

    @FXML
    private TableColumn<Week, String> pairNumberColumn6;

    @FXML
    private TableColumn<Week, String> mondayColumn6;

    @FXML
    private TableColumn<Week, String> tuesdayColumn6;

    @FXML
    private TableColumn<Week, String> wednesdayColumn6;

    @FXML
    private TableColumn<Week, String> thursdayColumn6;

    @FXML
    private TableColumn<Week, String> fridayColumn6;

    @FXML
    private Tab tab7;

    @FXML
    private TableView<Week> table7;

    @FXML
    private TableColumn<Week, String> pairNumberColumn7;

    @FXML
    private TableColumn<Week, String> mondayColumn7;

    @FXML
    private TableColumn<Week, String> tuesdayColumn7;

    @FXML
    private TableColumn<Week, String> wednesdayColumn7;

    @FXML
    private TableColumn<Week, String> thursdayColumn7;

    @FXML
    private TableColumn<Week, String> fridayColumn7;

    @FXML
    private Tab tab8;

    @FXML
    private TableView<Week> table8;

    @FXML
    private TableColumn<Week, String> pairNumberColumn8;

    @FXML
    private TableColumn<Week, String> mondayColumn8;

    @FXML
    private TableColumn<Week, String> tuesdayColumn8;

    @FXML
    private TableColumn<Week, String> wednesdayColumn8;

    @FXML
    private TableColumn<Week, String> thursdayColumn8;

    @FXML
    private TableColumn<Week, String> fridayColumn8;

    @FXML
    private Tab tab9;

    @FXML
    private TableView<Week> table9;

    @FXML
    private TableColumn<Week, String> pairNumberColumn9;

    @FXML
    private TableColumn<Week, String> mondayColumn9;

    @FXML
    private TableColumn<Week, String> tuesdayColumn9;

    @FXML
    private TableColumn<Week, String> wednesdayColumn9;

    @FXML
    private TableColumn<Week, String> thursdayColumn9;

    @FXML
    private TableColumn<Week, String> fridayColumn9;

    @FXML
    private Tab tab10;

    @FXML
    private TableView<Week> table10;

    @FXML
    private TableColumn<Week, String> pairNumberColumn10;

    @FXML
    private TableColumn<Week, String> mondayColumn10;

    @FXML
    private TableColumn<Week, String> tuesdayColumn10;

    @FXML
    private TableColumn<Week, String> wednesdayColumn10;

    @FXML
    private TableColumn<Week, String> thursdayColumn10;

    @FXML
    private TableColumn<Week, String> fridayColumn10;

    @FXML
    private Tab tab11;

    @FXML
    private TableView<Week> table11;

    @FXML
    private TableColumn<Week, String> pairNumberColumn11;

    @FXML
    private TableColumn<Week, String> mondayColumn11;

    @FXML
    private TableColumn<Week, String> tuesdayColumn11;

    @FXML
    private TableColumn<Week, String> wednesdayColumn11;

    @FXML
    private TableColumn<Week, String> thursdayColumn11;

    @FXML
    private TableColumn<Week, String> fridayColumn11;

    @FXML
    private Tab tab12;

    @FXML
    private TableView<Week> table12;

    @FXML
    private TableColumn<Week, String> pairNumberColumn12;

    @FXML
    private TableColumn<Week, String> mondayColumn12;

    @FXML
    private TableColumn<Week, String> tuesdayColumn12;

    @FXML
    private TableColumn<Week, String> wednesdayColumn12;

    @FXML
    private TableColumn<Week, String> thursdayColumn12;

    @FXML
    private TableColumn<Week, String> fridayColumn12;

    @FXML
    private Tab tab13;

    @FXML
    private TableView<Week> table13;

    @FXML
    private TableColumn<Week, String> pairNumberColumn13;

    @FXML
    private TableColumn<Week, String> mondayColumn13;

    @FXML
    private TableColumn<Week, String> tuesdayColumn13;

    @FXML
    private TableColumn<Week, String> wednesdayColumn13;

    @FXML
    private TableColumn<Week, String> thursdayColumn13;

    @FXML
    private TableColumn<Week, String> fridayColumn13;

    @FXML
    private Tab tab14;

    @FXML
    private TableView<Week> table14;

    @FXML
    private TableColumn<Week, String> pairNumberColumn14;

    @FXML
    private TableColumn<Week, String> mondayColumn14;

    @FXML
    private TableColumn<Week, String> tuesdayColumn14;

    @FXML
    private TableColumn<Week, String> wednesdayColumn14;

    @FXML
    private TableColumn<Week, String> thursdayColumn14;

    @FXML
    private TableColumn<Week, String> fridayColumn14;

    @FXML
    private Tab tab15;

    @FXML
    private TableView<Week> table15;

    @FXML
    private TableColumn<Week, String> pairNumberColumn15;

    @FXML
    private TableColumn<Week, String> mondayColumn15;

    @FXML
    private TableColumn<Week, String> tuesdayColumn15;

    @FXML
    private TableColumn<Week, String> wednesdayColumn15;

    @FXML
    private TableColumn<Week, String> thursdayColumn15;

    @FXML
    private TableColumn<Week, String> fridayColumn15;

    @FXML
    private TextField mondayField;

    @FXML
    private TextField tuesdayField;

    @FXML
    private TextField wednesdayField;

    @FXML
    private TextField thursdayField;

    @FXML
    private TextField fridayField;

    @FXML
    private Button resultButton;

    @FXML
    private Button setDefaultButton;

    @FXML
    private TableView<DataForTable> preparingTable;

    @FXML
    private TableColumn<DataForTable, String> subjectColumn;

    @FXML
    private TableColumn<DataForTable, String> teacherColumn;

    @FXML
    private TableColumn<DataForTable, List<String>> auditoriumColumn;

    @FXML
    private TableColumn<DataForTable, String> groupColumn;

    @FXML
    private TableColumn<DataForTable, String> amountOfPairsColumn;

    @FXML
    private Label themeLabel;

    @FXML
    private AnchorPane loadingPane;

    private List<Tab> tabs = new ArrayList<>();
    private ObservableList<DataForTable> list = FXCollections.observableArrayList();
    private Map<TableView, TableColumn[]> tablesMap = new LinkedHashMap<>();
    private List<ObservableList<Week>> groups = new ArrayList<>();

    @FXML
    void initialize() {

        fillList();
        preparingTable.setEditable(true);
        fillTabs();
        fillTablesMap();
        setTabsNames();
        fillPreparingTable();
        setPermissionForTableColumn();

        Connector.setLimitationOnField(mondayField, 1);
        Connector.setLimitationOnField(tuesdayField, 1);
        Connector.setLimitationOnField(wednesdayField, 1);
        Connector.setLimitationOnField(thursdayField, 1);
        Connector.setLimitationOnField(fridayField, 1);
        Connector.setOnlyDigitsInField(mondayField);
        Connector.setOnlyDigitsInField(tuesdayField);
        Connector.setOnlyDigitsInField(wednesdayField);
        Connector.setOnlyDigitsInField(thursdayField);
        Connector.setOnlyDigitsInField(fridayField);

        setDefaultButton.setOnAction(event -> {
            mondayField.setText("4");
            tuesdayField.setText("4");
            wednesdayField.setText("3");
            thursdayField.setText("4");
            fridayField.setText("3");
        });

        resultButton.setOnAction(event -> {
            getDataFromPreparingTable();
            Connector.setPairsPerDay(Integer.parseInt(mondayField.getText()), Integer.parseInt(tuesdayField.getText()),
                    Integer.parseInt(wednesdayField.getText()), Integer.parseInt(thursdayField.getText()), Integer.parseInt(fridayField.getText()));

            Generation[] generations = new Generation[2];
            generations[0] = new Generation();
            GeneticAlgorithm.crossing(generations);
            splitPane.setVisible(false);
            loadingPane.setVisible(true);
            themeLabel.setText("Формування розкладу:");

            if (generations[0].getPopulations()[0].getResultOfPopulation() < 100 && generations[0].getPopulations()[1].getResultOfPopulation() < 100 && generations[0].getPopulations()[2].getResultOfPopulation() < 100
                    && generations[0].getPopulations()[3].getResultOfPopulation() < 100 && generations[0].getPopulations()[4].getResultOfPopulation() < 100){
                while (generations[0].getPopulations()[0].getResultOfPopulation() < 100 && generations[0].getPopulations()[1].getResultOfPopulation() < 100 && generations[0].getPopulations()[2].getResultOfPopulation() < 100
                        && generations[0].getPopulations()[3].getResultOfPopulation() < 100 && generations[0].getPopulations()[4].getResultOfPopulation() < 100){
                    if (generations[0].getResultOfGeneration() < generations[1].getResultOfGeneration()){
                        generations[0] = generations[1];
                        generations[1] = null;
                        GeneticAlgorithm.crossing(generations);
                    }
                    else
                        GeneticAlgorithm.mutation(generations);
                }
            }
            else {
                if (generations[0].getPopulations()[0].getResultOfPopulation() == 100)
                    fillResultTableList(generations[0].getPopulations()[0].getSchedule());
                else if (generations[0].getPopulations()[1].getResultOfPopulation() == 100)
                    fillResultTableList(generations[0].getPopulations()[1].getSchedule());
                else if (generations[0].getPopulations()[2].getResultOfPopulation() == 100)
                    fillResultTableList(generations[0].getPopulations()[2].getSchedule());
                else if (generations[0].getPopulations()[3].getResultOfPopulation() == 100)
                    fillResultTableList(generations[0].getPopulations()[3].getSchedule());
                else if (generations[0].getPopulations()[4].getResultOfPopulation() == 100)
                    fillResultTableList(generations[0].getPopulations()[4].getSchedule());
            }

            printResultTables(tablesMap, groups, tabs);
            themeLabel.setText("Сформований розклад навчальних занять для " + Connector.getGroups().size() + "-х груп:");
            loadingPane.setVisible(false);
            tabPane.setVisible(true);
        });

    }

    private void fillTabs(){
        tabs.add(tab1);
        tabs.add(tab2);
        tabs.add(tab3);
        tabs.add(tab4);
        tabs.add(tab5);
        tabs.add(tab6);
        tabs.add(tab7);
        tabs.add(tab8);
        tabs.add(tab9);
        tabs.add(tab10);
        tabs.add(tab11);
        tabs.add(tab12);
        tabs.add(tab13);
        tabs.add(tab14);
        tabs.add(tab15);

    }

    private void setTabsNames(){
        for (int i = 0; i < Connector.getGroups().size(); i++){
            tabs.get(i).setText(Connector.getGroups().get(i));
            tabs.get(i).setDisable(false);
        }
    }

    private void fillPreparingTable() {
        subjectColumn.setCellValueFactory(new PropertyValueFactory<>("subject"));
        teacherColumn.setCellValueFactory(new PropertyValueFactory<>("teacher"));
        auditoriumColumn.setCellValueFactory(new PropertyValueFactory<>("auditoriums"));
        groupColumn.setCellValueFactory(new PropertyValueFactory<>("group"));
        amountOfPairsColumn.setCellValueFactory(new PropertyValueFactory<>("pairsPerWeek"));
        preparingTable.setItems(list);
    }

    private void fillList(){
        for (FullPreparedInformation e : Connector.getFullPreparedInformationList())
                for (int i = 0; i < Connector.getGroups().size(); i++)
                    list.add(new DataForTable(e.getSubject(), e.getTeacher(), e.getAuditoriums(), Connector.getGroups().get(i)));
    }

    private void setPermissionForTableColumn(){
        amountOfPairsColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        amountOfPairsColumn.setOnEditCommit(
                new EventHandler<TableColumn.CellEditEvent<DataForTable, String>>() {
                    @Override
                    public void handle(TableColumn.CellEditEvent<DataForTable, String> t) {
                        (t.getTableView().getItems().get(t.getTablePosition().getRow())).setPairsPerWeek(t.getNewValue());
                    }
                }
        );
    }

    private void getDataFromPreparingTable(){
        Connector.getFullPreparedInformationList().clear();
        for (DataForTable e : list){
            Connector.addPreparedInformation(new FullPreparedInformation(e.getSubject(), e.getTeacher(), e.getAuditoriums(),e.getGroup(), Integer.parseInt(e.getPairsPerWeek())));
        }
    }

    private void fillResultTableList(Map<String, Class[][]> schedule){
        int g = -1;

        for (String key : schedule.keySet()) {
            groups.add(FXCollections.observableArrayList());
            g++;
            Class[][] array = schedule.get(key);
            for (int i = 0; i < Connector.maxPairPerDay(); i++) {
                if (i < Connector.minPairPerDay())
                    groups.get(g).add(new Week(i + 1, array[0][i].toString(), array[1][i].toString(), array[2][i].toString(), array[3][i].toString(), array[4][i].toString()));
                else {
                    if (i < Connector.getPairsPerDay()[0])
                        groups.get(g).add(new Week(i + 1, array[0][i].toString(), "", "", "", ""));
                    if (i < Connector.getPairsPerDay()[1]) {
                        if (groups.get(g).size() > i) groups.get(g).get(i).setTuesday(array[1][i].toString());
                        else groups.get(g).add(new Week(i + 1, "", array[1][i].toString(), "", "", ""));
                    }
                    if (i < Connector.getPairsPerDay()[2]) {
                        if (groups.get(g).size() > i) groups.get(g).get(i).setWednesday(array[2][i].toString());
                        else groups.get(g).add(new Week(i + 1, "", "", array[2][i].toString(), "", ""));
                    }
                    if (i < Connector.getPairsPerDay()[3]) {
                        if (groups.get(g).size() > i) groups.get(g).get(i).setThursday(array[3][i].toString());
                        else groups.get(g).add(new Week(i + 1, "", "", "", array[3][i].toString(), ""));
                    }
                    if (i < Connector.getPairsPerDay()[4]) {
                        if (groups.get(g).size() > i) groups.get(g).get(i).setFriday(array[4][i].toString());
                        else groups.get(g).add(new Week(i + 1, "", "", "", "", array[4][i].toString()));
                    }
                }
            }
        }
    }

    private void printResultTables(Map<TableView, TableColumn[]> tableMap, List<ObservableList<Week>> groups, List<Tab> tabs){
            for (int i = 0; i < Connector.getGroups().size(); i++)
                for (TableView tableView : tableMap.keySet()) {
                    if (tabs.get(i).getId().substring(3).equals(tableView.getId().substring(5))) {
                        tablesMap.get(tableView)[0].setCellValueFactory(new PropertyValueFactory<>("pairNumber"));
                        tablesMap.get(tableView)[1].setCellValueFactory(new PropertyValueFactory<>("monday"));
                        tablesMap.get(tableView)[2].setCellValueFactory(new PropertyValueFactory<>("tuesday"));
                        tablesMap.get(tableView)[3].setCellValueFactory(new PropertyValueFactory<>("wednesday"));
                        tablesMap.get(tableView)[4].setCellValueFactory(new PropertyValueFactory<>("thursday"));
                        tablesMap.get(tableView)[5].setCellValueFactory(new PropertyValueFactory<>("friday"));
                        tableView.setItems(groups.get(i));
                    }
                }
    }

    private void addTableToMap(TableView tableView, TableColumn t1, TableColumn t2, TableColumn t3, TableColumn t4, TableColumn t5, TableColumn t6){
        TableColumn[] columns = {t1, t2, t3, t4, t5, t6};
        tablesMap.put(tableView, columns);
    }

    private void fillTablesMap(){
        addTableToMap(table1, pairNumberColumn1, mondayColumn1, tuesdayColumn1, wednesdayColumn1, thursdayColumn1, fridayColumn1);
        addTableToMap(table2, pairNumberColumn2, mondayColumn2, tuesdayColumn2, wednesdayColumn2, thursdayColumn2, fridayColumn2);
        addTableToMap(table3, pairNumberColumn3, mondayColumn3, tuesdayColumn3, wednesdayColumn3, thursdayColumn3, fridayColumn3);
        addTableToMap(table4, pairNumberColumn4, mondayColumn4, tuesdayColumn4, wednesdayColumn4, thursdayColumn4, fridayColumn4);
        addTableToMap(table5, pairNumberColumn5, mondayColumn5, tuesdayColumn5, wednesdayColumn5, thursdayColumn5, fridayColumn5);
        addTableToMap(table6, pairNumberColumn6, mondayColumn6, tuesdayColumn6, wednesdayColumn6, thursdayColumn6, fridayColumn6);
        addTableToMap(table7, pairNumberColumn7, mondayColumn7, tuesdayColumn7, wednesdayColumn7, thursdayColumn7, fridayColumn7);
        addTableToMap(table8, pairNumberColumn8, mondayColumn8, tuesdayColumn8, wednesdayColumn8, thursdayColumn8, fridayColumn8);
        addTableToMap(table9, pairNumberColumn9, mondayColumn9, tuesdayColumn9, wednesdayColumn9, thursdayColumn9, fridayColumn9);
        addTableToMap(table10, pairNumberColumn10, mondayColumn10, tuesdayColumn10, wednesdayColumn10, thursdayColumn10, fridayColumn10);
        addTableToMap(table11, pairNumberColumn11, mondayColumn11, tuesdayColumn11, wednesdayColumn11, thursdayColumn11, fridayColumn11);
        addTableToMap(table12, pairNumberColumn12, mondayColumn12, tuesdayColumn12, wednesdayColumn12, thursdayColumn12, fridayColumn12);
        addTableToMap(table13, pairNumberColumn13, mondayColumn13, tuesdayColumn13, wednesdayColumn13, thursdayColumn13, fridayColumn13);
        addTableToMap(table14, pairNumberColumn14, mondayColumn14, tuesdayColumn14, wednesdayColumn14, thursdayColumn14, fridayColumn14);
        addTableToMap(table15, pairNumberColumn15, mondayColumn15, tuesdayColumn15, wednesdayColumn15, thursdayColumn15, fridayColumn15);
    }

}
