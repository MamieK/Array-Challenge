
public class ChallengeNo1 {
    public static void main(String[] args) {

        int[] numbers = new int[]{22, 30, 19, 26, 20, 60, 16};

        int sum = 0;
        for(int i=0; i < numbers.length ; i++)
            sum = sum + numbers[i];

        double average = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average);
    }
}