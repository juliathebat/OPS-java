public class Matrica {
    private int[][] matrica;
    private int kolvoStrok;
    private int kolVoSt;

    public Matrica(int m, int n){
        this.kolvoStrok = m;
        this.kolVoSt = n;
        this.matrica = new int[kolvoStrok][kolVoSt];
    }

    public int getElement(int m, int n) { //геттер
        if (((m > kolvoStrok) && (n > kolVoSt)) && ((m < 0) && (n < 0))) {
            return 1;
        } else return this.matrica[m][n];
    }

    public void setElement(int m, int n, int elem) { //сеттер
        if (!(((m > kolvoStrok) && (n > kolVoSt)) && ((m < 0) && (n < 0)))) {
            this.matrica[m][n] = elem;
        }
    }

}
