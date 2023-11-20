package staticExample;

public class Main {
    public static void main(String[] args) {
        Human vivek = new Human("Vivek", 21, 4000, false);
        Human jay = new Human("Jay", 22, 80000, true);
        Human Yash = new Human("Yash", 20, 600000, true);

        System.out.println(Human.population);
    }

    void greeting() {
        System.out.println("He");
    }
}
