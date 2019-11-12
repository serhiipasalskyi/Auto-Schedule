package sample;

import java.util.Arrays;

public class Generation {

    private double resultOfGeneration;
    private Population[] populations = new Population[5];

    public Generation(){
        fillPopulations();
        evaluateResultOfGeneration();
        Arrays.sort(populations);
    }

    private void fillPopulations(){
        for (int i = 0; i < populations.length; i++)
            populations[i] = new Population();
    }

    void evaluateResultOfGeneration(){
        resultOfGeneration = 0;
        for (int i = 0; i < populations.length; i++)
            resultOfGeneration += populations[i].getResultOfPopulation();
        resultOfGeneration /= populations.length;

    }

    public double getResultOfGeneration() {
        return resultOfGeneration;
    }

    Population[] getPopulations() {
        return populations;
    }

}
