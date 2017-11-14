enum Sex { male, female }

public class Avtor {
    private String name;
    private int age;
    private Sex sex;

    public Avtor(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        if (sex.equals("male")) {
            this.sex = Sex.male;
        } else if (sex.equals("female")) {
            this.sex = Sex.female;
        }
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public Sex getSex() {
        return this.sex;
    }
}
