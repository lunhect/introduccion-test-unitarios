package es.fpsumma.dam1.utils;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumberUtilsTest {
@Test
public void divisionOK() {

int resultado = NumberUtils.divison(2, 2);
assertEquals(1, resultado);



}


@Test
public void segundadivOK() {

int resultado = NumberUtils.divison(5, 8);
assertEquals(1, resultado);



}


   
}