import com.google.gson.Gson;

import java.nio.file.Files;
import static java.nio.file.Files.readAllBytes;
import java.io.IOException;

import java.util.Scanner;

import static java.nio.file.Paths.get;

public class Actions {
    private Matrica matrica;
    private int n;
    public void fillMatrica() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите кол-во столбцов/строк - ");
        this.n = scanner.nextInt();
        this.matrica = new Matrica(n, n, "Lil Peep", 21, "male");
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
    public static void main(String[] args) throws IOException {
        Matrica matrica = new Matrica(3, 3, "Lil Peep", 21, "male");
        Gson gson = new Gson();
        String json = gson.toJson(matrica);
        Files.write(get("./matrica.json"), json.getBytes());
        String newJson = new String(readAllBytes(get("matrica.json")));
        Matrica newMatrica = gson.fromJson(newJson, Matrica.class);
        System.out.println("Эквивалентны ли JSON? - " + newMatrica.equals(matrica));
    }
}