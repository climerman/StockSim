package objects;

import java.io.Serializable;

/**
 * Created by Marko on 18.12.2014.
 */
public class Stock implements Serializable {

    String name;
    int amount;
    double price;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return this.amount;
    }
}
