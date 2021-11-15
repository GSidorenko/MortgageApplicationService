package com.example.MortgageApplicationService.Client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, String>
{
    Client findByFirstNameAndSecondNameAndLastNameAndPassport(String firstName, String secondName,
                                                              String lastName, String passport);
}
