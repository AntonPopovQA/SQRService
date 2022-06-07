package org.example.SQRServicemvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/SQR.csv")
    public void testSQRService(int expected, int underLimit, int overLimit) {
        SQRService service = new SQRService();

        int actual = service.calcSqrt(underLimit, overLimit);

        Assertions.assertEquals(expected, actual);
    }

}
