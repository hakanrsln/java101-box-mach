public class Match {
    Fighter f1;
    Fighter f2;
    int maxWeight;
    int minWeight;

    Match(Fighter f1, Fighter f2, int maxWeight, int minWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    public void run() {
        if (isCheck()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("=======YENI ROUND=======");

                double sans = Math.random();

                if (sans < 0.5) {
                    System.out.println("İlk vuran boksör: Boksör 1");
                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin()) {
                        break;
                    }
                } else {
                    System.out.println("İlk vuran boksör: Boksör 2");
                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()) {
                        break;
                    }
                }


                System.out.println(this.f1.name + " Saglik: " + this.f1.health);
                System.out.println(this.f2.name + " Saglik: " + this.f2.health);


            }
        } else {
            System.out.println("Sporcularin sikletleri uyusmuyor.");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " kazandi!");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " kazandi!");
            return true;
        }
        return false;
    }

}
