import scala.util.Random
import common.{parallel, task}


package object Matrices {
  val random = new Random()
  type Matriz = Vector[Vector[Int]]

  def matrizAlAzar(long: Int, vals: Int): Matriz = {
    // Crea una matriz de enteros cuadrada de long x long,
    // con valores aleatorios entre 0 y vals
    val v = Vector.fill(long, long)(random.nextInt(vals))
    v
  }

  def transpuesta(m: Matriz): Matriz = {
    val l = m.length
    Vector.tabulate(l, l)((i, j) => m(j)(i))
  }

  def prodPunto(v1: Vector[Int], v2: Vector[Int]): Int = {
    (v1 zip v2).map { case (i, j) => i * j }.sum
  }

  //    // Ejercicio 1.1.1
  def multMatriz(m1: Matriz, m2: Matriz): Matriz = {
    val n = m1.length
    val mT = transpuesta(m2)
    Vector.tabulate(n, n) { (i, j) => prodPunto(m1(i), mT(j))
    }
  }
  //
  // Ejercicio 1.1.2
  def multMatrizPar(m1: Matriz, m2: Matriz): Matriz = {
    val n = m1.length
    val mT = task(transpuesta(m2))
    Vector.tabulate(n, n) { (i, j) => prodPunto(m1(i), mT.join()(j))}
  }
  // task para tareas independientes o parallel si quiero dividir un trabajo
  //    // Ejercicio 1.2.1
  //    def subMatriz(m: Matriz, i: Int, j: Int, l: Int): Matriz = {
  //      // Dada m, matriz cuadrada de NxN, 1<=i, j<=N, i+n<=N, j+n<=N,
  //      // devuelve la submatriz de nxn correspondiente a m[i..i+(n−1), j..j+(n−1)]
  //    }
  //
  //    // Ejercicio 1.2.2
  //    def sumMatriz(m1: Matriz, m2: Matriz): Matriz = {
  //      // recibe m1 y m2 matrices cuadradas del mismo tamaño, potencia de 2
  //      // y devuelve la suma de las 2 matrices
  //    }
  //
  //    // Ejercicio 1.2.3
  //    def multMatrizRec(m1: Matriz, m2: Matriz): Matriz = {
  //      // recibe m1 y m2 matrices cuadradas del mismo tamaño, potencia de 2
  //      // y devuelve la multiplicación de las 2 matrices
  //    }
  //
  //    // Ejercicio 1.2.4
  //    def multMatrizRecPar(m1: Matriz, m2: Matriz): Matriz = {
  //      // recibe m1 y m2 matrices cuadradas del mismo tamaño, potencia de 2
  //      // y devuelve la multiplicación de las 2 matrices, en paralelo
  //    }
  //
  //    // Ejercicio 1.3.1
  //    def restaMatriz(m1: Matriz, m2: Matriz): Matriz = {
  //      // recibe m1 y m2 matrices cuadradas del mismo tamaño, potencia de 2
  //      // y devuelve la resta de las 2 matrices
  //    }
  //
  //    // Ejercicio 1.3.2
  //    def multStrassen(m1: Matriz, m2: Matriz): Matriz = {
  //      // recibe m1 y m2 matrices cuadradas del mismo tamaño, potencia de 2
  //      // y devuelve la multiplicación de las 2 matrices usando el algoritmo de Strassen
  //    }
  //
  //    // Ejercicio 1.3.3
  //    def multStrassenPar(m1: Matriz, m2: Matriz): Matriz = {
  //      // recibe m1 y m2 matrices cuadradas del mismo tamaño, potencia de 2
  //      // y devuelve la multiplicación en paralelo de las 2 matrices usando el algoritmo de Strassen
  //    }
}
