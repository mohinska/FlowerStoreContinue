package flowerstore.flowerstorecontinue.delivery;

import java.util.List;

import flowerstore.flowerstorecontinue.flower.Item;

public interface Delivery {
    String deliver(List<Item> items);
}