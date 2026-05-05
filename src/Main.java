public class Main {
    public static void main(String[] args) {
        GameObject obj1 = new GameObject("player", 10, 20);
        GameObject obj2 = new GameObject("enemy", 5, 15);
        GameObject obj3 = new GameObject("item", 8, 8);

        obj1.update();
        obj2.update();
        obj3.update();
    }
}