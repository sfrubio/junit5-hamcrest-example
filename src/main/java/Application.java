public class Application {
    public static void main(String[] args) {
        Refrigerator refrigerator = new Refrigerator();
        System.out.println(refrigerator.whatDoIHaveOnFirstRow());
        System.out.println(refrigerator.whatDoIHaveOnRow(2));
        System.out.println(refrigerator.doIHaveAn("cheese"));
        System.out.println(refrigerator.howManyRowsDoItHas());
    }
}
