package shop.Jarvis.app.demo.calculator.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "carts")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    @Id
    private long userId;
    private String username;
    private String name;
    private String email;
    private String password;
    private Date regDate;

    @Override
    public String toString() {
        return "회원명세{" +
                "아이디='" + userId + '\'' +
                ", 이름='" + name + '\'' +
                ", 이메일='" + email + '\'' +
                ", 비밀번호='" + password + '\'' +
                '}';
    }
}

