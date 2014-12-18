package engine;

import objects.Player;
import objects.Stock;

import java.io.*;
import java.util.LinkedList;

/**
 * Created by Marko on 18.12.2014.
 */
public class SaveSys {

    final static String STOCKSAVE = "C:\\Users\\Marko\\Documents\\StockSim/savedata/";
    final static String PLAYERSAVE = "C:\\Users\\Marko\\Documents\\StockSim/savedata/player/";
    public static LinkedList<Stock> stocklist = new LinkedList<Stock>();


    public static void saveStockList() {
        String path = (STOCKSAVE + "stocklist.sav");

        try {
            System.out.println("[Sys] Stocklist save in progress..");
            FileOutputStream fout = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(stocklist);
            oos.close();
            System.out.println("[Sys] Stocklist save completed successfully!");
        } catch (Exception e) {
            System.out.println("[Sys] Stocklist save unsuccessful! \n");
            e.printStackTrace();
        }
    }

    public static void loadStockList() {
        String path = (STOCKSAVE + "stocklist.sav");

        try {
            System.out.println("[Sys] Stocklist load in progress..");
            FileInputStream fin = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fin);
            stocklist = (LinkedList<Stock>)ois.readObject();
            ois.close();
            System.out.println("[Sys] Stocklist save completed successfully!");
        } catch (Exception e) {
            System.out.println("[Sys] Stocklist load unsuccessful! \n");
            e.printStackTrace();
        }
    }

    public static void savePlayer(Player player) {
        String path = (PLAYERSAVE + player.getName() + ".sav");

        try {
            System.out.println("[Sys] Player save in progress..");
            FileOutputStream fout = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(player);
            oos.close();
            System.out.println("[Sys] Player save successful!");
        } catch (Exception e) {
            System.out.println("[Sys] Player save unsuccessful! \n");
            e.printStackTrace();
        }
    }

    public static Player loadPlayer(String name) {
        Player player;
        String path = (PLAYERSAVE + name + ".sav");

        try {
            System.out.println("[Sys] Player load in progress..");
            FileInputStream fin = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fin);
            player = (Player) ois.readObject();
            ois.close();
            System.out.println("[Sys] Player load successful!");
            return player;
        } catch (Exception e) {
            System.out.println("[Sys] Player load unsuccessful!");
            e.printStackTrace();
            return null;
        }
    }
}
