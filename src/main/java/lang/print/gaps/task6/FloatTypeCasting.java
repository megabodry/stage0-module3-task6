package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        int temp = (int) numberToBeRounded;
        if ((numberToBeRounded - temp) >= 0.5) temp++;
        System.out.println(temp);
    }
}
