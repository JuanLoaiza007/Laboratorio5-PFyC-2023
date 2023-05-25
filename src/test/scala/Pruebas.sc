import Matrices._
import Benchmark._

//
// Pruebas con multMatriz y multMatrizPar
//
for {
  i <- 1 to 10
  m1 = matrizAlAzar(math.pow(2, i).toInt, 2)
  m2 = matrizAlAzar(math.pow(2, i).toInt, 2)
} yield println((compararAlgoritmos(multMatriz, multMatrizPar)(m1, m2), math.pow(2, i).toInt))

for {
  i <- 1 to 10
  m1 = matrizAlAzar(math.pow(2, i).toInt, 2)
  m2 = matrizAlAzar(math.pow(2, i).toInt, 2)
} yield println((compararAlgoritmos(multMatriz, multMatrizPar)(m1, m2), math.pow(2, i).toInt))

for {
  i <- 1 to 10
  m1 = matrizAlAzar(math.pow(2, i).toInt, 2)
  m2 = matrizAlAzar(math.pow(2, i).toInt, 2)
} yield println((compararAlgoritmos(multMatriz, multMatrizPar)(m1, m2), math.pow(2, i).toInt))

for {
  i <- 1 to  10
  m1 = matrizAlAzar(math.pow(2, i).toInt, 2)
  m2 = matrizAlAzar(math.pow(2, i).toInt, 2)
} yield println((compararAlgoritmos(multMatriz, multMatrizPar)(m1, m2), math.pow(2, i).toInt))

for {
  i <- 1 to 10
  m1 = matrizAlAzar(math.pow(2, i).toInt, 2)
  m2 = matrizAlAzar(math.pow(2, i).toInt, 2)
} yield println((compararAlgoritmos(multMatriz, multMatrizPar)(m1, m2), math.pow(2, i).toInt))

//
// Pruebas con multMatrizRec y multMatrizRecPar
//
for {
  i <- 1 to 9
  m1 = matrizAlAzar(math.pow(2, i).toInt, 2)
  m2 = matrizAlAzar(math.pow(2, i).toInt, 2)
} yield println((compararAlgoritmos(multMatrizRec, multMatrizRecPar)(m1, m2), math.pow(2, i).toInt))

for {
  i <- 1 to 9
  m1 = matrizAlAzar(math.pow(2, i).toInt, 2)
  m2 = matrizAlAzar(math.pow(2, i).toInt, 2)
} yield println((compararAlgoritmos(multMatrizRec, multMatrizRecPar)(m1, m2), math.pow(2, i).toInt))

for {
  i <- 1 to 9
  m1 = matrizAlAzar(math.pow(2, i).toInt, 2)
  m2 = matrizAlAzar(math.pow(2, i).toInt, 2)
} yield println((compararAlgoritmos(multMatrizRec, multMatrizRecPar)(m1, m2), math.pow(2, i).toInt))

for {
  i <- 1 to 9
  m1 = matrizAlAzar(math.pow(2, i).toInt, 2)
  m2 = matrizAlAzar(math.pow(2, i).toInt, 2)
} yield println((compararAlgoritmos(multMatrizRec, multMatrizRecPar)(m1, m2), math.pow(2, i).toInt))

for {
  i <- 1 to 9
  m1 = matrizAlAzar(math.pow(2, i).toInt, 2)
  m2 = matrizAlAzar(math.pow(2, i).toInt, 2)
} yield println((compararAlgoritmos(multMatrizRec, multMatrizRecPar)(m1, m2), math.pow(2, i).toInt))

//
// Pruebas con multStrassen y multStrassenPar
//
for {
  i <- 1 to 9
  m1 = matrizAlAzar(math.pow(2, i).toInt, 2)
  m2 = matrizAlAzar(math.pow(2, i).toInt, 2)
} yield println((compararAlgoritmos(multStrassen, multStrassenPar)(m1, m2), math.pow(2, i).toInt))

for {
  i <- 1 to 9
  m1 = matrizAlAzar(math.pow(2, i).toInt, 2)
  m2 = matrizAlAzar(math.pow(2, i).toInt, 2)
} yield println((compararAlgoritmos(multStrassen, multStrassenPar)(m1, m2), math.pow(2, i).toInt))

for {
  i <- 1 to 9
  m1 = matrizAlAzar(math.pow(2, i).toInt, 2)
  m2 = matrizAlAzar(math.pow(2, i).toInt, 2)
} yield println((compararAlgoritmos(multStrassen, multStrassenPar)(m1, m2), math.pow(2, i).toInt))

for {
  i <- 1 to 9
  m1 = matrizAlAzar(math.pow(2, i).toInt, 2)
  m2 = matrizAlAzar(math.pow(2, i).toInt, 2)
} yield println((compararAlgoritmos(multStrassen, multStrassenPar)(m1, m2), math.pow(2, i).toInt))

for {
  i <- 1 to 9
  m1 = matrizAlAzar(math.pow(2, i).toInt, 2)
  m2 = matrizAlAzar(math.pow(2, i).toInt, 2)
} yield println((compararAlgoritmos(multStrassen, multStrassenPar)(m1, m2), math.pow(2, i).toInt))