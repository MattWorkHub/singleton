public class Main {
    public static void main(String[] args) {
        User user1 = User.getSingleton();
        User user2 = User.getSingleton();
        user1.print();
        user2.setName("Gianni");
        user2.setAge("22");
        user2.print();

    }
}