public class Application {
    public static void main(String[] args) {
        Refrigerator refrigerator = new Refrigerator();
        System.out.println("What do I have on first row?: " + refrigerator.whatDoIHaveOnFirstRow());
        System.out.println("What do I have on 2nd row? " + refrigerator.whatDoIHaveOnRow(2));
        System.out.println("Do I have a cheese? " + (refrigerator.doIHaveAn("cheese") ? "yes" : "no"));
        System.out.println("How many rows do it has?: " + refrigerator.howManyRowsDoItHas());
    }
}
