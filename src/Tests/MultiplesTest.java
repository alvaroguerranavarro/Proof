package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import proof.Multiples;

class MultiplesTest {

	@Test
	public void testMultiplesThree() {
		int number [] = {3, 6, 9,12,18,21};
		String result [] = Multiples.multiplesThreeFive(number);
		String expected [] = {"Fizz","Fizz","Fizz","Fizz","Fizz","Fizz"};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void testMultiplesFive() {
		int number [] = {5, 10, 20,25,35,40};
		String result [] = Multiples.multiplesThreeFive(number);
		String expected [] = {"Buzz","Buzz","Buzz","Buzz","Buzz","Buzz"};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void testMultiplesThreeFive() {
		int number [] = {15, 30, 45,60,75,90};
		String result [] = Multiples.multiplesThreeFive(number);
		String expected [] = {"FizzBuzz","FizzBuzz","FizzBuzz","FizzBuzz","FizzBuzz","FizzBuzz"};
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void testMultiplesNone() {
		int number [] = {1, 2, 7,11,16,19};
		String result [] = Multiples.multiplesThreeFive(number);
		String expected [] = {"1","2","7","11","16","19"};
		assertArrayEquals(expected, result);
	}

}
