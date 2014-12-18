package engine;

import objects.Player;

/**
 * Created by Marko on 18.12.2014.
 */
public class NewPlayer {
    public static void createPlayer(String name) {
        Player player = new Player();
        player.setName(name);
        player.setWallet(10000.);
        SaveSys.savePlayer(player);
    }
}
