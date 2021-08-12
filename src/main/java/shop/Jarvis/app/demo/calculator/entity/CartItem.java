package shop.Jarvis.app.demo.calculator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "cartItems")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItem {
    private Item item;
    private int quantity;
}
