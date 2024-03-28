package sit707_tasks;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Ahsan Habib
 */
public class DateUtilTest {
	
	private static final String YOUR_NAME = "Vishal Kumar";
    private static final String YOUR_ID = "222342946";
	
	@Test
	public void testStudentIdentity() {
		String studentId = YOUR_ID;
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = YOUR_NAME;
		Assert.assertNotNull("Student name is null", studentName);
	}

	@Test
	public void testMaxJanuary31ShouldIncrementToFebruary1() {
		// January max boundary area: max+1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldIncrementToFebruary1 > " + date);
        date.increment();
        System.out.println(date);
        Assert.assertEquals(2, date.getMonth());
        Assert.assertEquals(1, date.getDay());
	}
	
	@Test
	public void testMaxJanuary31ShouldDecrementToJanuary30() {
		// January max boundary area: max-1
		DateUtil date = new DateUtil(31, 1, 2024);
        System.out.println("january31ShouldDecrementToJanuary30 > " + date);
        date.decrement();
        System.out.println(date);
        Assert.assertEquals(30, date.getDay());
        Assert.assertEquals(1, date.getMonth());
	}
	
	@Test
	public void testNominalJanuary() {
		int rand_day_1_to_31 = 1 + new Random().nextInt(31);
        DateUtil date = new DateUtil(rand_day_1_to_31, 1, 2024);
        System.out.println("testJanuaryNominal > " + date);
        date.increment();
        System.out.println(date);
	}
	@Test
	public void testMinJanuary1ShouldIncrementToJanuary2() {
		// January min boundary area: min+1
		DateUtil date = new DateUtil(1, 1, 2024);
		System.out.println("January1ShouldIncrementToJanuary2 > " + date);
		date.increment();
		System.out.println(date);
		Assert.assertEquals(2, date.getDay());
	}

	@Test
	public void testMinJanuary1ShouldDecrementToDecember31() {
		// January min boundary area: min-1
		DateUtil date = new DateUtil(1, 1, 2024);
		System.out.println("January1ShouldDecrementToDecember31 > " + date);
		date.decrement();
		System.out.println(date);
		Assert.assertEquals(31, date.getDay());
		Assert.assertEquals(12, date.getMonth());
		Assert.assertEquals(2023, date.getYear());
	}
	@Test
	public void testMaxFebruary28ShouldIncrementToFebruary29() {
	    // February 28th, 2024 (non-leap year)
	    DateUtil date = new DateUtil(28, 2, 2024);
	    System.out.println("February28ShouldIncrementToFebruary29 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testMaxFebruary28ShouldDecrementToFebruary27() {
	    // February 28th, 2024 (non-leap year)
	    DateUtil date = new DateUtil(28, 2, 2024);
	    System.out.println("February28ShouldDecrementToFebruary27 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(27, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testMaxFebruary29ShouldIncrementToMarch1() {
	    // February 29th, 2024 (leap year)
	    DateUtil date = new DateUtil(29, 2, 2024);
	    System.out.println("February29ShouldIncrementToMarch1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(3, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testMinFebruary1ShouldDecrementToJanuary31() {
	    // February 1st, 2024
	    DateUtil date = new DateUtil(1, 2, 2024);
	    System.out.println("February1ShouldDecrementToJanuary31 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(31, date.getDay());
	    Assert.assertEquals(1, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testNominalFebruary() {
	    int rand_day_1_to_29 = 1 + new Random().nextInt(29); // Adjusted for leap year
	    DateUtil date = new DateUtil(rand_day_1_to_29, 2, 2024);
	    System.out.println("testFebruaryNominal > " + date);
	    date.increment();
	    System.out.println(date);
	}
	
	@Test
	public void testMaxMarch31ShouldIncrementToApril1() {
	    // March 31st, 2024
	    DateUtil date = new DateUtil(31, 3, 2024);
	    System.out.println("March31ShouldIncrementToApril1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(4, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testMaxMarch31ShouldDecrementToMarch30() {
	    // March 31st, 2024
	    DateUtil date = new DateUtil(31, 3, 2024);
	    System.out.println("March31ShouldDecrementToMarch30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(3, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testNominalMarch() {
	    int rand_day_1_to_31 = 1 + new Random().nextInt(31);
	    DateUtil date = new DateUtil(rand_day_1_to_31, 3, 2024);
	    System.out.println("testMarchNominal > " + date);
	    date.increment();
	    System.out.println(date);
	}
	
	@Test
	public void testMaxApril30ShouldIncrementToMay1() {
	    // April 30th, 2024
	    DateUtil date = new DateUtil(30, 4, 2024);
	    System.out.println("April30ShouldIncrementToMay1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(5, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testMaxApril30ShouldDecrementToApril29() {
	    // April 30th, 2024
	    DateUtil date = new DateUtil(30, 4, 2024);
	    System.out.println("April30ShouldDecrementToApril29 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(4, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testNominalApril() {
	    int rand_day_1_to_30 = 1 + new Random().nextInt(30);
	    DateUtil date = new DateUtil(rand_day_1_to_30, 4, 2024);
	    System.out.println("testAprilNominal > " + date);
	    date.increment();
	    System.out.println(date);
	}
	
	@Test
	public void testMaxMay31ShouldIncrementToJune1() {
	    // May 31st, 2024
	    DateUtil date = new DateUtil(31, 5, 2024);
	    System.out.println("May31ShouldIncrementToJune1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testMaxMay31ShouldDecrementToMay30() {
	    // May 31st, 2024
	    DateUtil date = new DateUtil(31, 5, 2024);
	    System.out.println("May31ShouldDecrementToMay30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(5, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testNominalMay() {
	    int rand_day_1_to_31 = 1 + new Random().nextInt(31);
	    DateUtil date = new DateUtil(rand_day_1_to_31, 5, 2024);
	    System.out.println("testMayNominal > " + date);
	    date.increment();
	    System.out.println(date);
	}
	
	@Test
	public void testMaxJune30ShouldIncrementToJuly1() {
	    // June 30th, 2024
	    DateUtil date = new DateUtil(30, 6, 2024);
	    System.out.println("June30ShouldIncrementToJuly1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(7, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testMaxJune30ShouldDecrementToJune29() {
	    // June 30th, 2024
	    DateUtil date = new DateUtil(30, 6, 2024);
	    System.out.println("June30ShouldDecrementToJune29 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(6, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testNominalJune() {
	    int rand_day_1_to_30 = 1 + new Random().nextInt(30);
	    DateUtil date = new DateUtil(rand_day_1_to_30, 6, 2024);
	    System.out.println("testJuneNominal > " + date);
	    date.increment();
	    System.out.println(date);
	}
	
	@Test
	public void testMaxJuly31ShouldIncrementToAugust1() {
	    // July 31st, 2024
	    DateUtil date = new DateUtil(31, 7, 2024);
	    System.out.println("July31ShouldIncrementToAugust1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(8, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testMaxJuly31ShouldDecrementToJuly30() {
	    // July 31st, 2024
	    DateUtil date = new DateUtil(31, 7, 2024);
	    System.out.println("July31ShouldDecrementToJuly30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(7, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testNominalJuly() {
	    int rand_day_1_to_31 = 1 + new Random().nextInt(31);
	    DateUtil date = new DateUtil(rand_day_1_to_31, 7, 2024);
	    System.out.println("testJulyNominal > " + date);
	    date.increment();
	    System.out.println(date);
	}
	
	@Test
	public void testMaxAugust31ShouldIncrementToSeptember1() {
	    // August 31st, 2024
	    DateUtil date = new DateUtil(31, 8, 2024);
	    System.out.println("August31ShouldIncrementToSeptember1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(9, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testMaxAugust31ShouldDecrementToAugust30() {
	    // August 31st, 2024
	    DateUtil date = new DateUtil(31, 8, 2024);
	    System.out.println("August31ShouldDecrementToAugust30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(8, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testNominalAugust() {
	    int rand_day_1_to_31 = 1 + new Random().nextInt(31);
	    DateUtil date = new DateUtil(rand_day_1_to_31, 8, 2024);
	    System.out.println("testAugustNominal > " + date);
	    date.increment();
	    System.out.println(date);
	}
	
	@Test
	public void testMaxSeptember30ShouldIncrementToOctober1() {
	    // September 30th, 2024
	    DateUtil date = new DateUtil(30, 9, 2024);
	    System.out.println("September30ShouldIncrementToOctober1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(10, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testMaxSeptember30ShouldDecrementToSeptember29() {
	    // September 30th, 2024
	    DateUtil date = new DateUtil(30, 9, 2024);
	    System.out.println("September30ShouldDecrementToSeptember29 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(9, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void testMaxOctober31ShouldIncrementToNovember1() {
	    // October 31st, 2024
	    DateUtil date = new DateUtil(31, 10, 2024);
	    System.out.println("October31ShouldIncrementToNovember1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(11, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testMaxOctober31ShouldDecrementToOctober30() {
	    // October 31st, 2024
	    DateUtil date = new DateUtil(31, 10, 2024);
	    System.out.println("October31ShouldDecrementToOctober30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(10, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void testMaxNovember30ShouldIncrementToDecember1() {
	    // November 30th, 2024
	    DateUtil date = new DateUtil(30, 11, 2024);
	    System.out.println("November30ShouldIncrementToDecember1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(12, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testMaxNovember30ShouldDecrementToNovember29() {
	    // November 30th, 2024
	    DateUtil date = new DateUtil(30, 11, 2024);
	    System.out.println("November30ShouldDecrementToNovember29 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(11, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testMaxDecember31ShouldIncrementToJanuary1() {
	    // December 31st, 2024
	    DateUtil date = new DateUtil(31, 12, 2024);
	    System.out.println("December31ShouldIncrementToJanuary1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(1, date.getMonth());
	    Assert.assertEquals(2025, date.getYear());
	}

	@Test
	public void testMaxDecember31ShouldDecrementToDecember30() {
	    // December 31st, 2024
	    DateUtil date = new DateUtil(31, 12, 2024);
	    System.out.println("December31ShouldDecrementToDecember30 > " + date);
	    date.decrement();
	    System.out.println(date);
	    Assert.assertEquals(30, date.getDay());
	    Assert.assertEquals(12, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}
	
	@Test
	public void testLeapYearFeb28ShouldIncrementToFeb29() {
	    // February 28th, 2024 (leap year)
	    DateUtil date = new DateUtil(28, 2, 2024);
	    System.out.println("LeapYearFeb28ShouldIncrementToFeb29 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(29, date.getDay());
	    Assert.assertEquals(2, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}

	@Test
	public void testLeapYearFeb29ShouldIncrementToMarch1() {
	    // February 29th, 2024 (leap year)
	    DateUtil date = new DateUtil(29, 2, 2024);
	    System.out.println("LeapYearFeb29ShouldIncrementToMarch1 > " + date);
	    date.increment();
	    System.out.println(date);
	    Assert.assertEquals(1, date.getDay());
	    Assert.assertEquals(3, date.getMonth());
	    Assert.assertEquals(2024, date.getYear());
	}

}
