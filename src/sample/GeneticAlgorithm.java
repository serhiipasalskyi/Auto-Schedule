package sample;

import java.util.Arrays;
import java.util.Random;

public class GeneticAlgorithm {

    private static Random random = new Random();

    public static void crossing(Generation[] generations){
        Generation temporaryGeneration = generations[0];
        Population father = temporaryGeneration.getPopulations()[temporaryGeneration.getPopulations().length - 1];
        Population mother = temporaryGeneration.getPopulations()[temporaryGeneration.getPopulations().length - 2];
        Population replaycement = temporaryGeneration.getPopulations()[0];
        
        for (String key : replaycement.getSchedule().keySet()){
            int separatorI = random.nextInt(Connector.getPairsPerDay().length);
            int separatorJ = random.nextInt(Connector.getPairsPerDay()[separatorI]);
            Class[][] array = replaycement.getSchedule().get(key);
            
            for (int i = 0; i < Connector.getPairsPerDay().length; i++)
                for (int j = 0; j < Connector.getPairsPerDay()[i]; j++)
                    if (i <= separatorI && j <= separatorJ)
                        for (String k1 : father.getSchedule().keySet())
                            for (String k2 : mother.getSchedule().keySet()) {
                                if (!Arrays.equals(father.getSchedule().get(k1), mother.getSchedule().get(k2)))
                                    array[i][j] = father.getSchedule().get(key)[i][j];
                            }
                    else {
                        for (String k1 : father.getSchedule().keySet())
                            for (String k2 : mother.getSchedule().keySet()) {
                                if (!Arrays.equals(father.getSchedule().get(k1), mother.getSchedule().get(k2)))
                                    array[i][j] = mother.getSchedule().get(key)[i][j];
                    }
                }
            replaycement.getSchedule().replace(key, array);
        }

        temporaryGeneration.getPopulations()[0] = replaycement;
        generations[1] = temporaryGeneration;
        Arrays.sort(generations[1].getPopulations());
        generations[1].evaluateResultOfGeneration();
    }

    public static void mutation(Generation[] generations){
        Generation temporaryGeneration = generations[1];
        int i = -1;

        for(Population population : temporaryGeneration.getPopulations()) {
            i++;
            for (String key : population.getSchedule().keySet()) {
                int randomI1 = random.nextInt(Connector.getPairsPerDay().length);
                int randomJ1 = random.nextInt(Connector.getPairsPerDay()[randomI1]);
                int randomI2 = random.nextInt(Connector.getPairsPerDay().length);
                int randomJ2 = random.nextInt(Connector.getPairsPerDay()[randomI2]);

                while (randomI1 == randomI2 && randomJ1 == randomJ2) {
                    randomI2 = random.nextInt(Connector.getPairsPerDay().length);
                    randomJ2 = random.nextInt(Connector.getPairsPerDay()[randomI2]);
                }

                Class[][] array = population.getSchedule().get(key);
                Class temporaryClass = array[randomI1][randomJ1];
                array[randomI1][randomJ1].setParameters(array[randomI2][randomJ2].getSubject(), array[randomI2][randomJ2].getTeacher(), array[randomI2][randomJ2].getAuditorium());
                array[randomI2][randomJ2].setParameters(temporaryClass.getSubject(), temporaryClass.getTeacher(), temporaryClass.getAuditorium());
                population.getSchedule().replace(key, array);
            }

            temporaryGeneration.getPopulations()[i] = population;
        }
        generations[1] = temporaryGeneration;
        Arrays.sort(generations[1].getPopulations());
        generations[1].evaluateResultOfGeneration();
    }




}
