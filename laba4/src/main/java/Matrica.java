import java.util.ArrayList;

public class Matrica {
    private ArrayList<ArrayList<Integer>> matrica;
    private int kolvoStrok;
    private int kolVoSt;

    public Matrica(int m, int n){
        this.kolvoStrok = m;
        this.kolVoSt = n;
        ArrayList<ArrayList<Integer>> vneshn = new ArrayList<>();
        for (int i = 0; i < this.kolvoStrok; i++) {
            ArrayList<Integer> vnutr = new ArrayList<>();
            for (int j = 0; j < this.kolVoSt; j++) {
                vnutr.add(0);
            }
            vneshn.add(vnutr);
        }
        this.matrica = vneshn;
    }

    public int getElement(int m, int n) { //геттер
        if (((m > kolvoStrok) && (n > kolVoSt)) && ((m < 0) && (n < 0))) {
            return 1;
        } else return this.matrica.get(m).get(n);
    }

    public void setElement(int m, int n, int elem) { //сеттер
        if (!(((m > kolvoStrok) && (n > kolVoSt)) && ((m < 0) && (n < 0)))) {
            this.matrica.get(m).set(n, elem);
        }
    }

}
