public class Main {
    public static void main(String[] args) throws InterruptedException {
        Box box = new Box();

        Thread thread1 = new Thread(box::turnOnToggle,"пользователь");
        thread1.start();
        Thread thread2 = new Thread(box::turnOffToggle, "игрушка");
        thread2.start();
        thread1.join();
        box.setInterrupt(true);




    }
}
