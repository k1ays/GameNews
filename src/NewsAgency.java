import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private List<Player> subscribers = new ArrayList<>();

    public void addSubscriber(Player s) {
        subscribers.add(s);
    }

    public void removeSubscriber(Player s) {
        subscribers.remove(s);
    }

    public void publishNews(String article) {
        System.out.println("\n📰 Breaking News: " + article);
        notifySubscribers(article);
    }

    private void notifySubscribers(String article) {
        for (Player s : subscribers) {
            s.update(article);
        }
    }
}
