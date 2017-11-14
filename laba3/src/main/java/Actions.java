import java.util.Scanner;
public class Actions {
    private Matrica matrica;
    private int n;
    public void fillMatrica() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во столбцов/строк - ");
        this.n = scanner.nextInt();
        this.matrica = new Matrica(n, n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Введите элемент " + i + "," + j + " - ");
                int element = scanner.nextInt();
                matrica.setElement(i, j, element);
            }
        }
    }
    public int getMin() {
        int min = matrica.getElement(0,0);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrica.getElement(i, j) < min) {
                    min = matrica.getElement(i, j);
                }
            }
        }
        return min;
    }
    public int getMax() {
        int max = matrica.getElement(0,0);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrica.getElement(i, j) > max) {
                    max = matrica.getElement(i, j);
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Actions action = new Actions();
        action.fillMatrica();
        System.out.println("Минимальный элемент - " + action.getMin());
        System.out.println("Максимальный элемент - " + action.getMax());
    }
}