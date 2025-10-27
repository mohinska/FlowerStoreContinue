package flowerstore.FlowerStoreContinue.delivery;

import java.util.List;

import flowerstore.FlowerStoreContinue.flower.Item;

public interface Delivery {
    String deliver(List<Item> items);
}