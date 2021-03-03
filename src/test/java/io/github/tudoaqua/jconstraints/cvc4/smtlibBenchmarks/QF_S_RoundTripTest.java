/*
 * Copyright 2017-2021 The jConstraints-cvc4 Authors
 * SPDX-License-Identifier: Apache-2.0
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.tudoaqua.jconstraints.cvc4.smtlibBenchmarks;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

import gov.nasa.jpf.constraints.api.ConstraintSolver;
import gov.nasa.jpf.constraints.api.Expression;
import gov.nasa.jpf.constraints.api.Valuation;
import gov.nasa.jpf.constraints.smtlibUtility.SMTProblem;
import gov.nasa.jpf.constraints.smtlibUtility.parser.SMTLIBParserException;
import io.github.tudoaqua.jconstraints.cvc4.CVC4Solver;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import org.testng.annotations.Test;

public class QF_S_RoundTripTest {

  @Test
  public void joacoExample1Test()
      throws SMTLIBParserException, IOException, URISyntaxException {
    SMTProblem problem = LoadingUtil.loadProblemFromResources("4002_DoSubjectSearch_VxA0.smt2");
    CVC4Solver cvc4 = new CVC4Solver(new HashMap<>());
    Valuation model = new Valuation();
    Expression<Boolean> expr = problem.getAllAssertionsAsConjunction();
    ConstraintSolver.Result jRes = cvc4.solve(expr, model);
    assertEquals(jRes, ConstraintSolver.Result.SAT);
    assertTrue(expr.evaluateSMT(model));
  }

  @Test
  public void jdartExample1Test()
      throws SMTLIBParserException, IOException, URISyntaxException {
    SMTProblem problem = LoadingUtil
        .loadProblemFromResources("jbmc-regression_StringMiscellaneous03_Main_10.smt2");
    CVC4Solver cvc4 = new CVC4Solver(new HashMap<>());
    Valuation model = new Valuation();
    Expression<Boolean> expr = problem.getAllAssertionsAsConjunction();
    System.out.print(expr);
    ConstraintSolver.Result jRes = cvc4.solve(expr, model);
    assertEquals(ConstraintSolver.Result.UNSAT, jRes);
  }

  @Test
  public void appscanExample1Test()
      throws SMTLIBParserException, IOException, URISyntaxException {
    SMTProblem problem = LoadingUtil.loadProblemFromResources("appscan/4_t07.smt2");
    CVC4Solver cvc4 = new CVC4Solver(new HashMap<>());
    Valuation model = new Valuation();
    Expression<Boolean> expr = problem.getAllAssertionsAsConjunction();
    System.out.print(expr);
    ConstraintSolver.Result jRes = cvc4.solve(expr, model);
    assertEquals(jRes, ConstraintSolver.Result.SAT);
    assertTrue(expr.evaluate(model));
  }

  @Test
  public void appscanExample2Test()
      throws SMTLIBParserException, IOException, URISyntaxException {
    SMTProblem problem = LoadingUtil
        .loadProblemFromResources("appscan/5_t06.smt2");
    CVC4Solver cvc4 = new CVC4Solver(new HashMap<>());
    Valuation model = new Valuation();
    Expression<Boolean> expr = problem.getAllAssertionsAsConjunction();
    System.out.print(expr);
    ConstraintSolver.Result jRes = cvc4.solve(expr, model);
    assertEquals(ConstraintSolver.Result.SAT, jRes);
    assertTrue(expr.evaluate(model));
  }

  @Test
  public void appscanExample3Test()
      throws SMTLIBParserException, IOException, URISyntaxException {
    SMTProblem problem = LoadingUtil
        .loadProblemFromResources("appscan/6_t01.smt2");
    CVC4Solver cvc4 = new CVC4Solver(new HashMap<>());
    Valuation model = new Valuation();
    Expression<Boolean> expr = problem.getAllAssertionsAsConjunction();
    System.out.print(expr);
    ConstraintSolver.Result jRes = cvc4.solve(expr, model);
    assertEquals(ConstraintSolver.Result.SAT, jRes);
    assertTrue(expr.evaluate(model));
  }

  @Test
  public void appscanExample4Test()
      throws SMTLIBParserException, IOException, URISyntaxException {
    SMTProblem problem = LoadingUtil
        .loadProblemFromResources("appscan/7_t03.smt2");
    CVC4Solver cvc4 = new CVC4Solver(new HashMap<>());
    Valuation model = new Valuation();
    Expression<Boolean> expr = problem.getAllAssertionsAsConjunction();
    System.out.print(expr);
    ConstraintSolver.Result jRes = cvc4.solve(expr, model);
    assertEquals(ConstraintSolver.Result.SAT, jRes);
    assertTrue(expr.evaluate(model));
  }

  @Test
  public void appscanExample5Test()
      throws SMTLIBParserException, IOException, URISyntaxException {
    SMTProblem problem = LoadingUtil
        .loadProblemFromResources("appscan/8_t02.smt2");
    CVC4Solver cvc4 = new CVC4Solver(new HashMap<>());
    Valuation model = new Valuation();
    Expression<Boolean> expr = problem.getAllAssertionsAsConjunction();
    System.out.print(expr);
    ConstraintSolver.Result jRes = cvc4.solve(expr, model);
    assertEquals(ConstraintSolver.Result.SAT, jRes);
    assertTrue(expr.evaluate(model));
  }

  @Test
  public void appscanExample6Test()
      throws SMTLIBParserException, IOException, URISyntaxException {
    SMTProblem problem = LoadingUtil
        .loadProblemFromResources("appscan/9_t05.smt2");
    CVC4Solver cvc4 = new CVC4Solver(new HashMap<>());
    Valuation model = new Valuation();
    Expression<Boolean> expr = problem.getAllAssertionsAsConjunction();
    System.out.print(expr);
    ConstraintSolver.Result jRes = cvc4.solve(expr, model);
    assertEquals(ConstraintSolver.Result.SAT, jRes);
    assertTrue(expr.evaluate(model));
  }

  @Test
  public void appscanExample7Test()
      throws SMTLIBParserException, IOException, URISyntaxException {
    SMTProblem problem = LoadingUtil
        .loadProblemFromResources("appscan/10_t04.smt2");
    CVC4Solver cvc4 = new CVC4Solver(new HashMap<>());
    Valuation model = new Valuation();
    Expression<Boolean> expr = problem.getAllAssertionsAsConjunction();
    System.out.print(expr);
    ConstraintSolver.Result jRes = cvc4.solve(expr, model);
    assertEquals(ConstraintSolver.Result.SAT, jRes);
    assertTrue(expr.evaluate(model));
  }

  @Test
  public void appscanExample8Test()
      throws SMTLIBParserException, IOException, URISyntaxException {
    SMTProblem problem = LoadingUtil
        .loadProblemFromResources("appscan/11_t08.smt2");
    CVC4Solver cvc4 = new CVC4Solver(new HashMap<>());
    Valuation model = new Valuation();
    Expression<Boolean> expr = problem.getAllAssertionsAsConjunction();
    System.out.print(expr);
    ConstraintSolver.Result jRes = cvc4.solve(expr, model);
    assertEquals(ConstraintSolver.Result.SAT, jRes);
    assertTrue(expr.evaluate(model));
  }


  // FIXME: Recheck these tests after the new CVC4 java api is released.
  // Monitor progress in: https://github.com/CVC4/CVC4/issues/5018
  @Test(enabled = false)
  public void banditfuzzExample1Test()
      throws SMTLIBParserException, IOException, URISyntaxException {
    SMTProblem problem = LoadingUtil
        .loadProblemFromResources("3594_1566478915.3770756852528010125309455_1.smt");
    CVC4Solver cvc4 = new CVC4Solver(new HashMap<>());
    Valuation model = new Valuation();
    Expression<Boolean> expr = problem.getAllAssertionsAsConjunction();
    System.out.print(expr);
    ConstraintSolver.Result jRes = cvc4.solve(expr, model);
    assertEquals(ConstraintSolver.Result.SAT, jRes);
    assertTrue(expr.evaluateSMT(model));
  }

  @Test(enabled = false)
  public void banditfuzzExample2Test()
      throws SMTLIBParserException, IOException, URISyntaxException {
    SMTProblem problem = LoadingUtil
        .loadProblemFromResources("3575_1565554544.3963776322835254933674150_1.smt");
    CVC4Solver cvc4 = new CVC4Solver(new HashMap<>());
    Valuation model = new Valuation();
    Expression<Boolean> expr = problem.getAllAssertionsAsConjunction();
    System.out.print(expr);
    ConstraintSolver.Result jRes = cvc4.solve(expr, model);
    assertEquals(ConstraintSolver.Result.UNSAT, jRes);
  }

  @Test(enabled = false)
  public void banditfuzzExample3Test()
      throws SMTLIBParserException, IOException, URISyntaxException {
    SMTProblem problem = LoadingUtil
        .loadProblemFromResources("3605_1565559107.29890633704988511910132405_1.smt");
    CVC4Solver cvc4 = new CVC4Solver(new HashMap<>());
    Valuation model = new Valuation();
    Expression<Boolean> expr = problem.getAllAssertionsAsConjunction();
    System.out.print(expr);
    ConstraintSolver.Result jRes = cvc4.solve(expr, model);
    assertEquals(ConstraintSolver.Result.UNSAT, jRes);
  }
}
