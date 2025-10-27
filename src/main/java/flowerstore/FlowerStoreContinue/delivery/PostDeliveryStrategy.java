package flowerstore.FlowerStoreContinue.delivery;

import java.util.List;

import flowerstore.FlowerStoreContinue.flower.Item;

public class PostDeliveryStrategy implements Delivery {
    @Override
    public String deliver(List<Item> items) {
        return "Delivering items by Post. Total items: " + items.size();
    }
}