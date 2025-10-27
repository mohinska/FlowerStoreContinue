package flowerstore.flowerstorecontinue.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import flowerstore.flowerstorecontinue.flower.Flower;
import flowerstore.flowerstorecontinue.flower.FlowerColor;
import flowerstore.flowerstorecontinue.flower.FlowerType;

import java.util.List;

@RestController
@RequestMapping("/api/flowers")
public class FlowerController {

    @GetMapping
    public List<Flower> getFlowers() {
        return List.of(
                new Flower(15.5, FlowerColor.RED, 70, FlowerType.ROSE),
                new Flower(10.0, FlowerColor.BLUE, 50, FlowerType.TULIP));
    }
}