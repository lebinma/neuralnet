class Support
{
    static double sigmoid(double a)
    {
        return Math.exp(a);
    }
}

class Input
{
    int a, b, c;

    Input(int x, int y, int z)
    {
        a = x;
        b = y;
        c = z;
    }
}

class Neuron
{
    float w1, w2, w3; //weights

    Neuron(float a, float b, float c)
    {
        w1 = a;
        w2 = b;
        w3 = c;
    }

    //return output
    float test(Input input)
    {
        output = (float) 
    }

    void train(Input input[], int out[])
    {
        //train
    }
}

public class NeuralNetwork
{
    public static void main(String args[])
    {
        //initialize Neuron with random weights
        Neuron neuron = new Neuron(0.5f, 0f, -0.2f);

        Input trainData[];
        Input testData = new Input(1, 0, 0);

        trainData[0] = new Input(0, 0, 1);
        trainData[1] = new Input(1, 1, 1);
        trainData[2] = new Input(1, 0, 1);
        trainData[2] = new Input(0, 0, 1);

        int out[] = {0, 1, 1, 0};

        neuron.train(testData, out);
        float result = neuron.test(testData);

        System.out.println("\nResult = " + result);
    }
}