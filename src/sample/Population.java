package sample;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class Population implements Comparable<Population> {

    private double resultOfPopulation;
    private Map<String, Class[][]> schedule = new LinkedHashMap<>(Connector.getGroups().size());

    public Population(){
        fillSchedule();
        evaluateResultOfPopulation();
    }

    private void fillSchedule(){
        for (String group : Connector.getGroups())
            schedule.put(group, randomizeArray(group));
    }

    private Class[][] randomizeArray(String group){
        Random random = new Random();
        int randomI;
        int randomJ;
        Class[][] array = new Class[5][];

        setArrayLengths(array);

        for (FullPreparedInformation f : Connector.getFullPreparedInformationList())
            if (f.getGroup().equals(group))
                for (int k = f.getPairsPerWeek(); k > 0; k--) {
                    randomI = random.nextInt(array.length);
                    randomJ = random.nextInt(Connector.getPairsPerDay()[randomI]);
                    while (!array[randomI][randomJ].getSubject().equals("-")) {
                        randomI = random.nextInt(array.length);
                        randomJ = random.nextInt(Connector.getPairsPerDay()[randomI]);
                    }
                    array[randomI][randomJ].setParameters(f.getSubject(), f.getTeacher(), f.getAuditoriums().get(new Random().nextInt(f.getAuditoriums().size())));
                }
        return array;
    }

    private void evaluateResultOfPopulation(){
        resultOfPopulation = 100;
        int weight = getWeight();

        for (String key : schedule.keySet()){
            Class[][] array = schedule.get(key);
            for (Class[][] c : schedule.values())
                for (int i = 0; i < array.length; i++)
                    for (int j = 0; j < array[i].length; j++){
                        if (!Arrays.equals(array, c)) {
                            if (array[i][j].equals(c[i][j]))
                                resultOfPopulation -= 100.00 / weight;
                            else {
                                if (array[i][j].getSubject().equals(c[i][j].getSubject()))
                                    resultOfPopulation -= 100.00 / (weight * 3);
                                if (array[i][j].getTeacher().equals(c[i][j].getTeacher()))
                                    resultOfPopulation -= 100.00 / (weight * 3);
                                if (array[i][j].getAuditorium().equals(c[i][j].getAuditorium()))
                                    resultOfPopulation -= 100.00 / (weight * 3);
                            }
                        }
                    }
        }
    }

    private void setArrayLengths(Class[][] array){
        array[0] = new Class[Connector.getPairsPerDay()[0]];
        array[1] = new Class[Connector.getPairsPerDay()[1]];
        array[2] = new Class[Connector.getPairsPerDay()[2]];
        array[3] = new Class[Connector.getPairsPerDay()[3]];
        array[4] = new Class[Connector.getPairsPerDay()[4]];
        clearArray(array);
    }

    private void clearArray(Class[][] array){
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array[i].length; j++)
                array[i][j] = new Class("-", "-", "-");
    }

    Map<String, Class[][]> getSchedule() {
        return schedule;
    }

    private int getWeight() {
        int weight = 0;

        for (String key : schedule.keySet()) {
            for (int i = 0; i < schedule.get(key).length; i++)
                    weight += schedule.get(key)[i].length;
            break;
        }
        return weight * schedule.size();
    }

    public double getResultOfPopulation() {
        return resultOfPopulation;
    }

    @Override
    public int compareTo(Population o) {
        return Double.compare(this.getResultOfPopulation(), o.getResultOfPopulation());
    }

}
