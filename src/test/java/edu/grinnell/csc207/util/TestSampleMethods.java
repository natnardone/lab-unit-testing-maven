package edu.grinnell.csc207.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * Tests of the sample methods.
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */
public class TestSampleMethods {
  /**
   * A test that should succeed.
   */
  @Test
  void sampleSuccesfulTest() {
    assertEquals(2, 2);
  } // sampleSuccessfulTest()

  /**
   * A test that should fail.
   */
  
  void sampleFailingTest() {
    assertEquals(2, 3);
  } // sampleFailingTest()

  
  public void test2() {
    assertEquals(10, 3*5, "stupid test");
  } // test2()


  @Test 

  public void c2fTest1(){
    assertEquals(32, SampleMethods.c2f(0), "0 celcius to fahrenheit");

  }

 @Test
  public void c2fTest2(){
    assertEquals(212, SampleMethods.c2f(100), "100 celcius to fahrenheit");

  }

  @Test
  public void c2fTest3(){
    assertEquals(-4, SampleMethods.c2f(-20), "-20 celcius to fahrenheit");

  }

  @Test
  public void sumTest1() {
    int[] values = { 1, 2, 3 };
    assertEquals(6, SampleMethods.sum(values), "1 2 3");
  }

  @Test
  public void sumTest2() {
    int[] values = { -1, -2, -3 };
    assertEquals(-6, SampleMethods.sum(values), "-1 -2 -3");
  }

  @Test
  public void sumTest3() {
    int[] values = { -1, 2, -3 };
    assertEquals(-2, SampleMethods.sum(values), "-1 2 -3");
  }

  @Test
  public void testExtremes() {
    int tmp = Integer.MAX_VALUE - 10;
    int[] values = { tmp, tmp, -tmp, -tmp };
    assertEquals(0, SampleMethods.sum(values), "extreme values");
 } // testExtremes

  public void exptTest1(){
    int x = 1;
    int y;
    for (int i = 0; i < 50; i++){
      for (y = -50; y < 50; y++){
        assertEquals(x, SampleMethods.expt(y,i), "2^i");
      }
      x *= y;
    }
  }

  /**
   * Check that removeAs works as expected.
   */
  @Test
  public void testRemoveAs() {
    assertEquals("", 
                 SampleMethods.removeAs(""),
                 "empty string");
    assertEquals("hello", 
                 SampleMethods.removeAs("hello"),
                 "no as");
    assertEquals("", 
                 SampleMethods.removeAs("a"),
                 "eliminate one a");
    assertEquals("", 
                 SampleMethods.removeAs("aaaa"),
                 "eliminate many as");
    assertEquals("pin", 
                 SampleMethods.removeAs("pain"),
                 "eliminate one a, short string");
    assertEquals("lphbet", 
                 SampleMethods.removeAs("alphabet"),
                 "eliminate many as, medium string");
    assertEquals("BCDEFGHIJKLMNOPQ",
                 SampleMethods.removeAs("aBaaCDaaaEFGaaaaHIJKaaaaLMNaaaOPaaQa"),
                 "eliminate many as, silly string");
    assertEquals("bbb",
                 SampleMethods.removeAs("aaabbbaaa"),
                 "eliminate prefix and suffix as");
  } // testRemoveAs

} // class TestSampleMethods
