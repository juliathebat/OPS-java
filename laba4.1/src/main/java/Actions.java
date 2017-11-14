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
        return this.matrica.getMatrica().stream()
                .min((list1, list2) ->
                        list1.stream().min(Integer::compareTo).get()
                                .compareTo(list2.stream().min(Integer::compareTo).get()))
                .get().stream().min(Integer::compareTo).get();
    }
    public int getMax() {
        return this.matrica.getMatrica().stream()
                .max((list1, list2) ->
                        list1.stream().max(Integer::compareTo).get()
                                .compareTo(list2.stream().max(Integer::compareTo).get()))
                .get().stream().max(Integer::compareTo).get();
    }
    public static void main(String[] args) {
        Actions action = new Actions();
        action.fillMatrica();
        System.out.println("Минимальный элемент - " + action.getMin());
        System.out.println("Максимальный элемент - " + action.getMax());
    }
}