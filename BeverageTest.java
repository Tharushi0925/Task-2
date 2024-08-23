import java.util.Scanner;

public class BeverageTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want extras for tea? (yes/no)");
        String teaExtras = scanner.nextLine();
        boolean teaWantsExtras = teaExtras.equalsIgnoreCase("yes");

        System.out.println("Do you want extras for coffee? (yes/no)");
        String coffeeExtras = scanner.nextLine();
        boolean coffeeWantsExtras = coffeeExtras.equalsIgnoreCase("yes");

        Tea tea = new Tea();
        tea.setWantsExtras(teaWantsExtras);
        tea.finalTemplateMethod();

        Coffee coffee = new Coffee();
        coffee.setWantsExtras(coffeeWantsExtras);
        coffee.finalTemplateMethod();
    }
}