package shop.Jarvis.app.demo.calculator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "items")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    @Id private long itemId;
    private String itemName;
    private int price;
    private String description;
    private Date regDate;

    @Override
    public String toString() {
        return "아이템 명시{" +
                "아이템 번호 :" + itemId +
                ", 품명 :'" + itemName + '\'' +
                ", 상세 :'" + description + '\'' +
                ", 가격 :" + price +
                ", 등록일 :" + regDate +
                '}';
    }
}
