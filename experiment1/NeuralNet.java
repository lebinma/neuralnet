//class containing activation function
class Activation
{
    static float function(float val)
    {
        //activation function
        return val;
    }
}

class Neuron
{
    float output, sum=0;

    Input bias = new Input(1, -1.5f);   //set bias

    void calc(Input i1, Input i2)
    {
        sum += i1.val*i1.weight + i2.val*i2.weight;
        sum += bias.val*bias.weight;

        output = Activation.function(sum);
    }
}

class Input
{
    float val, weight;

    Input(float x, float y)
    {
        val = x;
        weight = y;
    }
}

public class NeuralNet
{
    public static void main(String args[])
    {
        float threshold = 0.5f;

        //our input
        Input i1 = new Input(1, 1);
        Input i2 = new Input(1, 1);

        //create neuron with the given bias
        Neuron neuron = new Neuron();

        //calculate the output
        neuron.calc(i1, i2);

        if (neuron.output >= threshold)
            System.out.println("Accepted.");
        else
            System.out.println("Rejected.");
    }
}