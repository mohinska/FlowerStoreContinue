package flowerstore.FlowerStoreContinue.delivery;

import flowerstore.FlowerStoreContinue.flower.Flower;
import flowerstore.FlowerStoreContinue.flower.FlowerColor;
import flowerstore.FlowerStoreContinue.flower.FlowerType;
import flowerstore.FlowerStoreContinue.flower.Item;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/delivery")
public class DeliveryController {

    @GetMapping
    public String deliver(
            @RequestParam String strategy,
            @RequestParam String items) {

        List<Item> dummyItems = List.of(
                new Flower(10, FlowerColor.RED, 70, FlowerType.ROSE));

        Delivery deliveryStrategy;
        if (strategy.equalsIgnoreCase("dhl")) {
            deliveryStrategy = new DHLDeliveryStrategy();
        } else if (strategy.equalsIgnoreCase("post")) {
            deliveryStrategy = new PostDeliveryStrategy();
        } else {
            return "Error: Unknown delivery strategy.";
        }

        return deliveryStrategy.deliver(dummyItems);
    }
}