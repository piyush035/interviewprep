package interviewbit.level1.math;

public class BinaryRepresentation {
    public static void main(String[] args) {
        System.out.println("Result ::" + new BinaryRepresentation().findDigitsInBinary(7));
    }

    public String findDigitsInBinary(int A) {
        StringBuilder sb = new StringBuilder();
        if (A == 0) {
            return "0";
        }
        while (A > 0) {
            int rem = A % 2;
            sb.append(rem);
            A = A / 2;
        }
        return sb.reverse().toString();
    }
}
