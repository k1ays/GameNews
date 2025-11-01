public class PhoneNotification implements NotificationStrategy {

    @Override
    public void notify(String message, String playerName) {
        System.out.println("Phone Notification received to " + playerName + " " + message);
    }
}
