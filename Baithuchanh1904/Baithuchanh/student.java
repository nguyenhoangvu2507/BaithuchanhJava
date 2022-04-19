package baithuchanh;

public class Student extends Person {
    private double math, physics, chemistry, average;

    public Student() {
    }
    public Student(int id, String name, int age, double math, double physics, double chemistry) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        average = (math + physics + chemistry) / 3;
    }
    public double getAverage() {
        return average;
    }

    public double getMath() {
        return math;

}