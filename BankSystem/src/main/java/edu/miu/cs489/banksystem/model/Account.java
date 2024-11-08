package edu.miu.cs489.banksystem.model;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection= "accounts")
@Getter
@Setter
public class Account {
    @Id
    private ObjectId accountId;
    @Field("account_number")
    @NotNull(message = "Not null- no empty - no whitespace(s)")
    @Indexed(unique=true, direction = IndexDirection.ASCENDING)
    private Integer accountNumber;
    @Field("account_type")
    private String accountType;
    @Field("account_name")
    private String accountName;

    public Account(Integer accountNumber, String accountType) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", accountType='" + accountType + '\'' +
                ", accountName='" + accountName + '\'' +
                '}';
    }
}