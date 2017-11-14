import java.util.Scanner;
public class Actions {
    private Matrica matrica;
    private int n;
    public void fillMatrica() {
        this.n = 3;
        this.matrica = new Matrica(this.n, this.n);
        int elem = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrica.setElement(i, j, elem);
                ++elem;
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