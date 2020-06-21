import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import sample.model.Cart;
import sample.entity.Item;

public class TestModel {

  @Test
  public void addItemToCartShouldIncrementItsSize() {
    Cart cart = new Cart();

    assertTrue(cart.isEmpty());

    Item itemToAdd = new Item();

    cart.addItem(itemToAdd, true);

    assertEquals(cart.getNumberOfItems(), 1);
  }
}
