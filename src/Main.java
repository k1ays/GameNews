public class Main {
    public static void main(String[] args) {

        // Create News Agency
        NewsAgency agency = new NewsAgency();

        // Create Subscribers with different delivery strategies
        Player alice = new Player("Alice", new PhoneNotification());
        Player bob = new Player("Bob", new ClientNotification());

        // Register subscribers
        agency.addSubscriber(alice);
        agency.addSubscriber(bob);

        // Publish some news
        agency.publishNews("New policy updates from the government!");
        agency.publishNews("The local team wins the championship!");

        // Game updates (can also trigger notification)
        Game gameNews = new Game("New DLC released!");
        gameNews.sendNews();
        agency.publishNews("New game article: " + gameNews);

        // Change notification strategy at runtime
        bob.setNotificationStrategy(new ClientNotification());
        agency.publishNews("Breaking: Major weather alert in your area!");
    }
}