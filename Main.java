public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("A", 20, 115, 70, 30);
        Fighter f2 = new Fighter("B", 15, 125, 80, 80 );

        Match match = new Match(f1, f2, 80, 70);
        match.run();
    }
}
