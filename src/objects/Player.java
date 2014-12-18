package objects;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Marko on 18.12.2014.
 */
public class Player implements Serializable {

    String name;
    double wallet;
    ArrayList<String> stocklist = new ArrayList<String>();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public double getWallet() {
        return this.wallet;
    }

    public void addStock(Stock stock) {
        stocklist.add(stock.getName());
    }

}
