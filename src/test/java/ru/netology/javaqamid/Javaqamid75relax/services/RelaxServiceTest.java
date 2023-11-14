package ru.netology.javaqamid.Javaqamid75relax.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.javaqamid.Javaqamid75relax.services.RelaxService;

public class RelaxServiceTest {

    @Test
    public void relaxOne() {
        RelaxService service = new RelaxService();

        int expected = 2;

        int actual = service.calculate(100_000, 60_000, 150_000);

        //System.out.println("1. " + count);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void relaxTwo() {
        RelaxService service = new RelaxService();

        int expected = 3;

        int actual = service.calculate(10_000, 3000, 20_000);


        Assertions.assertEquals(expected, actual);
    }
}
