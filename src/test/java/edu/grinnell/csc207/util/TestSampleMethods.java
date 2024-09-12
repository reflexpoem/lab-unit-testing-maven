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
    fail("Not yet implemented");
  } // test2()

  @Test
  public void testc2f(){
    assertEquals(32, SampleMethods.c2f(0));
    assertEquals(212, SampleMethods.c2f(100));
  }

  @Test
  public void testsum(){
    int [] values = {1,2,3};
    assertEquals(6, SampleMethods.sum(values));
  }

  @Test
  public void testExtremes() {
    int tmp = Integer.MAX_VALUE - 10;
    int[] values = { tmp, tmp, -tmp, -tmp };
    assertEquals(0, SampleMethods.sum(values), "extreme values");
 } // testExtremes

 @Test
 public void testExp(){
  int num1 = 2;

  for(int j = 0; j < 10; j++){
    num1 = num1 + 1;
    int expect = 1;
    for(int i = 0; i < 10; i++){
      assertEquals(expect, SampleMethods.expt(num1, i));
      expect = expect * num1;
    }
  }

  
  
 }
 @Test
 public void testremovebs(){
  assertEquals("a", SampleMethods.removeBs("ba"));
}
} // class TestSampleMethods
