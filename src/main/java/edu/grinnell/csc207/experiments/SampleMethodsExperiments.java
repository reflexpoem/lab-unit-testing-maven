package edu.grinnell.csc207.experiments;

import java.io.PrintWriter;

import edu.grinnell.csc207.util.SampleMethods;

/**
 * A place to put experiments with our SampleMethods class.
 */
public class SampleMethodsExperiments {
  /**
   * Run some experiments.
   *
   * @param args
   *   Command-line arguments (ignored).
   */
  public static void main(String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true);
    removeAsExperiments(pen);  
    pen.close();
  } // main()

  /**
   * Experiments with `removeAs`.
   *
   * @param pen
   *   Where to print the output from the experiments.
   */
  public static void removeAsExperiments(PrintWriter pen) {
    removeAsExperiment(pen, "");
    removeAsExperiment(pen, "hello");
    removeAsExperiment(pen, "a");
    removeAsExperiment(pen, "aaaa");
    removeAsExperiment(pen, "pain");
    removeAsExperiment(pen, "alphabet");
    removeAsExperiment(pen, "aBaaCDaaaEFGaaaaHIJKaaaaLMNaaaOPaaQa");
    removeAsExperiment(pen, "aaabbbaaa");
  } // removeAsExperiments

  /**
   * A single experiment with <code>removeAs</code>.
   *
   * @param pen
   *   Where to print output from the experiments.
   * @param str
   *   A string to use as a parameter to <code>removeAs</code>.
   */
  public static void removeAsExperiment(PrintWriter pen, String str) {
    pen.print("removeAs(\"" + str + "\") = ");
    pen.flush();
    String tmp = SampleMethods.removeAs(str);
    pen.println("\"" + tmp + "\"");
  } // removeAsExperiment(PrintWriter, String)
} // class SampleMethodsExperiment
