import java.util.Scanner;
public class Actions {
    private int[][] matrica;
    private int n;
    public void fillMatrica() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во столбцов/строк - ");
        this.n = scanner.nextInt();
        this.matrica = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Введите элемент " + i + "," + j + " - ");
                matrica[i][j] = scanner.nextInt();
            }
        }
    }
    public int getMin() {
        int min = this.matrica[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (this.matrica[i][j] < min) {
                    min = this.matrica[i][j];
                }
            }
        }
        return min;
    }
    public int getMax() {
        int max = this.matrica[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (this.matrica[i][j] > max) {
                    max = this.matrica[i][j];
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