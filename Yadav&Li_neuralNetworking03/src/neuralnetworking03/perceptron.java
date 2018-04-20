/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neuralnetworking03;

/**
 * project03
 * Date: 4/20/2018
 * Took refrence from wikipedia 
 *Aadit Yadav  and Jing Li
 * @author S522553 and s521864
 */
public class perceptron 
{
    public static final int[][][] andData ={{{0,0},{0}},{{0,1},{0}},{{1,0},{0}},{{1,1},{1}}};
    public static final double LearningRate=0.05;
    public static final double [] Initial_weight ={Math.random(),Math.random()};
    public double CalWeightedSum(int[]data,double[] weights){
        double weightedsum =0;
        for (int x=0; x<data.length;x++)weightedsum +=data[x]*weights[x];
    return weightedsum;
}
    public int activationFunction(double weightSum)
    {
        int results=0;
        if (weightSum > 1) results = 1;
        return results;
    }
    public double [] adjustWeight(int[]data, double[]weights,double error)
    {
        double [] adjustWeight = new double[weights.length];
        for (int x=0; x < weights.length;x++)adjustWeight[x]=LearningRate * error * data[x] +weights[x];
        return adjustWeight;
    }
}
