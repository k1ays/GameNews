public class Game implements GameNews {

    public String GameUpdates;

    public Game (String GameUpdates) {
        this.GameUpdates = GameUpdates;
    }

    @Override
    public void sendNews() {
        System.out.println("sending game updates" +  GameUpdates);
    }

}
