package com.example.MortgageApplicationService.Client;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "Client")
public class Client {

    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "SECOND_NAME")
    private String secondName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "PASSPORT")
    private String passport;

    @Column(name = "BIRTH_DATE")
    private LocalDate birthDate;

    @Column(name = "GENDER")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "SALARY")
    private BigDecimal salary;

    @Column(name = "CREDIT_AMOUNT")
    private BigDecimal creditAmount;

    @Column(name = "DURATION_IN_MONTHS")
    private int durationInMonths;

    @Column(name = "STATUS")
    @Enumerated(EnumType.STRING)
    private MortgageStatus status;

    @Column(name = "MONTHLY_PAYMENT")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private double monthlyPayment;

    public Client() {
    }

    public Client(String id, String firstName, String secondName, String lastName,
                  String passport, LocalDate birthDate, Gender gender,
                  BigDecimal salary, BigDecimal creditAmount, int durationInMonths,
                  MortgageStatus status) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.passport = passport;
        this.birthDate = birthDate;
        this.gender = gender;
        this.salary = salary;
        this.creditAmount = creditAmount;
        this.durationInMonths = durationInMonths;
        this.status = status;
    }

    public Client(String id, String firstName, String secondName, String lastName,
                  String passport, LocalDate birthDate, Gender gender,
                  BigDecimal salary, BigDecimal creditAmount, int durationInMonths) {
        this.id = id;
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

    public Client(String firstName, String secondName, String lastName,
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

    public MortgageStatus getStatus(){
        if(this.status != null){
            return status;
        }
        else {
            return MortgageStatus.PROCESSING;
        }
    }

    public boolean cellNotEmpty() {
        return this.firstName != null &&
                this.secondName != null &&
                this.lastName != null &&
                this.passport != null &&
                this.birthDate != null &&
                this.gender != null;
    }

    public boolean cellNotZero() {
        return this.salary.compareTo(BigDecimal.ZERO) != 0 &&
                this.creditAmount.compareTo(BigDecimal.ZERO) != 0 &&
                this.durationInMonths != 0;
    }
}

