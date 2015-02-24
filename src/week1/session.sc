package week1

object session {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  1 + 2                                           //> res0: Int(3) = 3
  def abs(x: Double): Double = if (x < 0) -x else x
                                                  //> abs: (x: Double)Double
  abs(1.0)                                        //> res1: Double = 1.0
  abs(-1.0 * 2)                                   //> res2: Double = 2.0

  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)           //> sqrtIter: (guess: Double, x: Double)Double

  def isGoodEnough(guess: Double, x: Double) =
    abs(guess * guess - x) / x < 0.001            //> isGoodEnough: (guess: Double, x: Double)Boolean

  def improve(guess: Double, x: Double) =
    (guess + x / guess) / 2                       //> improve: (guess: Double, x: Double)Double

  def sqrt(x: Double) = sqrtIter(1.0, x)          //> sqrt: (x: Double)Double

  sqrt(2)                                         //> res3: Double = 1.4142156862745097

  sqrt(4)                                         //> res4: Double = 2.000609756097561

  sqrt(1e-6)                                      //> res5: Double = 0.0010000001533016628

  sqrt(1e6)                                       //> res6: Double = 1000.0001533016629
 
  sqrt(1)                                         //> res7: Double = 1.0
}