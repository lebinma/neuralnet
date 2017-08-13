class Support
{
    static double sigmoid(double a)
    {
        return 1/(1 + Math.exp(-a));
    }

    static double derivative(double a)
    {
        return a*(1-a);
    }
}

class Input
{
    double a, b, c;

    Input(double x, double y, double z)
    {
        a = x;
        b = y;
        c = z;
    }
}

class Neuron
{
    double w1, w2, w3; //weights

    Neuron(double a, double b, double c)
    {
        w1 = a;
        w2 = b;
        w3 = c;
    }

    //return output
    double test(Input input)
    {
        double sum = input.a*w1 + input.b*w2 + input.c*w3;
        return Support.sigmoid(sum);
    }

    void train(Input input[], double out[])
    {
        double output, result, sum, error;

        System.out.println("Weights before training = ");
        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);

       for (int i=0; i<10000; i++)
       {
            for (int j=0; j<input.length; j++)
            {
                sum = input[j].a*w1 + input[j].b*w2 + input[j].c*w3;
                result = Support.sigmoid(sum);
                error = (double) out[j] - result;

                w1 += error * input[j].a * Support.derivative(result);
                w2 += error * input[j].b * Support.derivative(result);
                w3 += error * input[j].c * Support.derivative(result);
            }
       }

        System.out.println("\nWeights after training = ");
        System.out.println(w1);
        System.out.println(w2);
        System.out.println(w3);
    }
}

public class NeuralNet
{
    public static void main(String args[])
    {
        //initialize Neuron with random weights
        Neuron neuron = new Neuron(0, 0, 0);

        Input trainData[] = new Input[4];
        Input testData = new Input(1, 0, 0);

        trainData[0] = new Input(0, 0, 1);
        trainData[1] = new Input(1, 1, 1);
        trainData[2] = new Input(1, 0, 1);
        trainData[3] = new Input(0, 0, 1);

        double out[] = {0, 1, 0, 0};

        neuron.train(trainData, out);
        double result = neuron.test(testData);

        System.out.println("\nResult = " + result);
    }
}