//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BmiService index = new BmiService();

        float height = 1.71f;
        int weight = 72;

        int bmi = index.calculate(weight, height);

        System.out.println("Индекс массы тела: " + bmi );
    }
}