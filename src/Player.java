public class Player {
    public String name;

    private NotificationStrategy strategy;

    public Player(String name, NotificationStrategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }

    public void update(String news) {
        strategy.notify(name, news);
    }

    public void setNotificationStrategy(NotificationStrategy strategy) {
        System.out.println(name + " switched to a new notification method!");
        this.strategy = strategy;
    }
    public Player(String name) {
        this.name = name;
    }


}
