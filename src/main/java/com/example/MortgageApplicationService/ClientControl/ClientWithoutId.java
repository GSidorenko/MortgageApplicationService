package com.example.MortgageApplicationService.ClientControl;

import com.example.MortgageApplicationService.Client.Client;
import com.example.MortgageApplicationService.Client.Gender;
import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;


@Data
public class ClientWithoutId {

    private String firstName;
    private String secondName;
    private String lastName;
    private String passport;
    private LocalDate birthDate;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private BigDecimal salary;
    private BigDecimal creditAmount;
    private int durationInMonths;

    public ClientWithoutId(String firstName, String secondName, String lastName,
                           String passport, LocalDate birthDate, Gender gender,
                           BigDecimal salary, BigDecimal creditAmount, int durationInMonths)
    {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.passport = passport;
        this.birthDate = birthDate;
        this.gender = gender;
        this.salary = salary;
        this.creditAmount = creditAmount;
        this.durationInMonths = durationInMonths;
    }

    public Client getClient(ClientWithoutId client){
        return new Client(generateId(), firstName, secondName, lastName,
                passport, birthDate, gender, salary, creditAmount, durationInMonths);
    }

    private String generateId(){
        return UUID.randomUUID().toString();
    }
}

