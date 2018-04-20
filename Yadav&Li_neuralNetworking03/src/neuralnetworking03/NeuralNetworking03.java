/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neuralnetworking03;

/**
 * 
 * NOTE: WHILE GIVING OUTPUT IT PROVIDES OUTPUT RAMDOMLY.
 * SO IF YOU GET ONE READING PLEASE CLICK THE RUN BUTTON TWICE TO GET MULTIPAL READING.Thank You
 * A very simple program of Neural Networking Perceptron
 * Date: 4/20/2018
 * Took refrence from wikipedia 
 * Aadit Yadav  and Jing Li
 * @author S522553 and s521864
 */
public class NeuralNetworking03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [][][]data =perceptron.andData;
        double[]weights =perceptron.Initial_weight;
        NeuralNetworking03 driver= new NeuralNetworking03();
        perceptron per = new perceptron();
        int eventNumber =0;
        boolean errorFlag = true;
        double error =0;
        double[] adjustWeight= null;
        while(errorFlag)
        {
            driver.printHeading(eventNumber++);//trainig the neural network
            errorFlag = false;
            error =0;
            for (int x=0; x< data.length; x++){
                double weightedsum = per.CalWeightedSum(data[x][0],weights);
                int result = per.activationFunction(weightedsum);
                error = data [x][1][0]-result;
                if(error !=0)errorFlag =true;
                adjustWeight = per.adjustWeight(data[x][0],weights, error);
                driver.printVector(data[x], weights, result, error, weightedsum, adjustWeight);
                weights=adjustWeight;
            }
                
    } 
    }
    public void printHeading (int eventNumber)
    {
        System.out.println("\n--------------------------------------Event#"+eventNumber+"--------------------------------------");
        System.out.println(" w1  |   w2   |   x1   |   x2   |  Target Results  |  error  |  Weighted Sum  |   adjw1   |   Adjw2  ");
         
    }
    public void printVector(int [][]data, double[]weights,int result ,double error, double weightedsum,double[]adjustWeight){
        System.out.println(" "+String.format("%.2f",weights[0])+"|   "+String.format("%.2f",weights[1])+" |    "+data[0][0]+"   |  "+data[0][1]+"    |  "
                + data[1][0]+"      |    "+result+"   |    "+error+"    |    "+String.format("%.2f",weightedsum)+"  |  "+String.format("%2f",adjustWeight[0])+
                "    |    "+String.format("%2f",adjustWeight[1]));
    }
    }
    

