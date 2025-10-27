package flowerstore.flowerstorecontinue.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Flower implements Item {

  @Getter
  private double sepalLength;

  private FlowerColor color;

  @Getter
  private double price;

  @Getter
  private FlowerType flowerType;

  public String getColor() {
    return color.toString();
  }

  @Override
  public String getDescription() {
    return flowerType + " flower with " + color + " color.";
  }
}