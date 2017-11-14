import java.util.ArrayList;
import java.util.Objects;

public class Matrica {
    private Avtor avtor;
    private ArrayList<ArrayList<Integer>> matrica;
    private int kolvoStrok;
    private int kolVoSt;

    public Matrica(int m, int n, String name, int age, String sex){
        this.kolvoStrok = m;
        this.kolVoSt = n;
        this.avtor = new Avtor(name, age, sex);
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

    public ArrayList<ArrayList<Integer>> getMatrica() {
        return this.matrica;
    }

    @Override
    public boolean equals(Object var1) {
        if (var1 instanceof Matrica) {
            Boolean matricaIsEqual = true;
            for (int i = 0; i < this.matrica.size(); i++) {
                for (int j = 0; j < this.matrica.size(); j++) {
                    if (this.matrica.get(i).get(j) != ((Matrica) var1).matrica.get(i).get(j)) {
                        matricaIsEqual = false;
                    }
                }
            }
            return (this.kolVoSt == ((Matrica) var1).kolVoSt) &&
                    matricaIsEqual &&
                    (this.avtor.getAge() == ((Matrica) var1).avtor.getAge()) &&
                    (this.avtor.getSex() == ((Matrica) var1).avtor.getSex()) &&
                    (Objects.equals(this.avtor.getName(), ((Matrica) var1).avtor.getName())) &&
                    (this.kolvoStrok == ((Matrica) var1).kolvoStrok);
        } else return false;
    }

}
