public class Main {
    public static void main(String[] args) {
        Box box = new Box();

        new Thread(box::turnOffToggle, "игрушка").start();
        new Thread(box::turnOnToggle, "пользователь").start();














    }
}
