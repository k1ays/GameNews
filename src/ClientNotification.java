public class ClientNotification implements NotificationStrategy {

    @Override
    public void notify(String message, String playerName) {
        System.out.println("Client Notification received to " + playerName + ": " + message);
    }
}
