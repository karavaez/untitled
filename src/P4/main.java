package P4;

public class main {
    public static void main(String[] args) {
        int[] mas = new int[50];
        for (int i = 0; i < mas.length; i++){
            mas[i] = (int)(Math.random()*100-50);
        }
        for (int item : mas){
            System.out.print(item + " ");
        }
        int positiv = 0;
        int negativ = 0;
        int zero = 0;
        int sumPos = 0;
        int sumNeg =0;
        int sum = 0;

        for (int item : mas){
            if (item>0){
                positiv++;
                sumPos += item;
            }
            else if (item<0) {
                   negativ++;
                   sumNeg += item;
            }else {
                zero++;
            }
            sum += item;



        }
        System.out.println("Подробнее:");
        System.out.println("Положительных:" +positiv);
        System.out.println("Отрицательных:" +negativ);
        System.out.println("Нулевых:" +zero);
        System.out.println("Сумма положительных:" +sumPos);
        System.out.println("Сумма отрицательных:" +sumNeg);
        System.out.println("Сумма всех:" +sum);
        System.out.println("Среднее по массиву: "  +(double)sum/50);
    }
}
