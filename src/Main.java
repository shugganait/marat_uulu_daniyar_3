import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] Num = {1.3, 7.0, -4.02, -7.1, 43.6, -9.5, 6.2, 5.8, 2.4, -38.2, -23.8, 24.6, 51.4, -12.3, 14.2};
        double resultOfNum = 0.0;
        for (double num: Num) {
            if (num < 0) {
                continue;
            }
            resultOfNum += num;
        }
        System.out.println(resultOfNum);
        //Доп д/з

        System.out.println("_____________________________________________________________");

        boolean sorting = true;
        double change;
        while (sorting) {
            sorting = false;
            for (int i = 0; i < Num.length - 1; i++) {
                if (Num[i] > Num[i + 1]) {
                    change = Num[i];
                    Num[i] = Num[i + 1];
                    Num[i + 1] = change;
                    sorting = true;
                }
            }
        }
        System.out.println(Arrays.toString(Num));
        //я подсмотрел в гугле, как вы говорили Сэнсей, лучший навык программиста это гуглить.
    }
}