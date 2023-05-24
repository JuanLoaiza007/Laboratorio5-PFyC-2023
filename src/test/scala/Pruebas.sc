import Matrices._
import Benchmark._

val m1= matrizAlAzar(2, 2)
val m2= matrizAlAzar(2, 2)
multMatriz(m1,m2)
multMatrizPar (m1,m2)

multMatrizRec (m1,m2)
multMatrizRecPar (m1,m2)
multStrassen (m1,m2)
multStrassenPar(m1,m2)

for {
  i <- 1 to 10
  m1 = matrizAlAzar(math.pow(2, i).toInt, 2)
  m2 = matrizAlAzar(math.pow(2, i).toInt, 2)
} yield (compararAlgoritmos(multMatrizRec, multMatrizRecPar)(m1, m2), math.pow(2, i).toInt)
