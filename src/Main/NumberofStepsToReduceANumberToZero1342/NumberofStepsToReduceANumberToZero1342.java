package Main.NumberofStepsToReduceANumberToZero1342;

public class NumberofStepsToReduceANumberToZero1342 {
    public int numberOfSteps(int num) {
        int counter = 0;
        while (num != 0) {
            if (num % 2 == 0)
                num /= 2;
            else
                num -= 1;

            counter++;
        }
        return counter;
    }
}
