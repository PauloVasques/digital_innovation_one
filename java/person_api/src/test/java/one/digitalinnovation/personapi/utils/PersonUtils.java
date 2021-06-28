package one.digitalinnovation.personapi.utils;

import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.entity.Person;

import java.time.LocalDate;

public class PersonUtils {

    private static final String FIRST_NAME = "Paulo";
    private static final String LAST_NAME = "Vasques";
    private static final String CPF = "305.294.105-84";
    private static final long ID = 1L;
    public static final LocalDate BIRTH_DATE = LocalDate.of(1990, 05, 10);

    public static PersonDTO createFakeDTO(){
        return PersonDTO.builder()
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF)
                .birthDate("10-05-1990")
                .build();
    }

    public static Person createFakeEntity(){
        return Person.builder()
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF)
                .birthDate(BIRTH_DATE)
                .build();
    }
}
