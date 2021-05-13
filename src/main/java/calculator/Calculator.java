package calculator;

public class Calculator {
    public int add(int value1, int value2) {
        return value1 + value2;
    }

    public int apply(int value1, int value2, char op) {
        if (op == '/')
        {
            return div(value1, value2);
        }
        else
            return power(value1, value2);
    }

    private int div(int value1, int value2) {
        return value1/value2;
    }

    private int power(int value1, int value2)
    {
        if (value2 == 0)
            return 1;
        int ret = 1;
        for (int i = 0; i < value2; i++)
            ret = ret * value1;
        return ret;
    }
}
