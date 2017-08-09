//class containing activation function
static class Activation
{
    static int function(int val)
    {
        //activation function
        return val;
    }
}

class Neuron
{
    int output, sum=0;

    Input bias = new Input();   //set bias

    //bias as argument
    Neuron(Input input)
    {
        bias = Input;
    }

    void calc(Input i1, Input i2)
    {
        sum += i1.val*i1.weight + i2.val*i2.weight;
        sum += bias.val*bias.weight;

        output = Activation.function(sum);
    }
}

class Input
{
    int val, weight;

    Input(int x, int y)
    {
        val = x;
        weight = y;
    }
}

public class NeuralNet
{
    public static void main(String args[])
    {
        //our input
        Input i1 = new Input(1, 1);
        Input i2 = new Input(0, 1);
        Input bias = new Input(1, -1.5);

        //create neuron with the given bias
        Neuron neuron = new Neuron(bias);

        //calculate the output
        neuron.calc(i1, i2);

        System.out.println("Result = " + neuron.output);
    }
}