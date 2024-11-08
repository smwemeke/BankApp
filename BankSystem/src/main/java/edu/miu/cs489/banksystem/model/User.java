package edu.miu.cs489.banksystem.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "users")
@Setter
@Getter
public class User {
    @Id
    private ObjectId userId;
    @Field("user_name")
    @Indexed(unique = true)
    @Size(min = 5, max = 10, message = "username must be between 5 and 10")
    @NotBlank(message ="Not allowed: Null - Empty - Whitespace")
    private String username;
    @Field("user_password")
    private String password;
    @DBRef(lazy = false)  // storing particula document reference
    private List<Account> accounts;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
