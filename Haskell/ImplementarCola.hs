module ImplementarCola where

-- Se importa el modulo InterfaceCola.
import InterfaceCola

-- Instanciacion de cada función de cola.
instance Cola [] where

  encolar x [] = [x]
  encolar x (y:ys) = (y:ys) ++ [x]

  desencolar [] = error "Desencolar sobre lista vacia."
  desencolar (x:xs) = xs

  esVacia [] = True
  esVacia (x:xs) = False

  vaciar [] = error "Vaciar sobre lista vacia."
  vaciar (x:xs) = []

-- compilar de la forma > :l ImplementarCola.hs InterfaceCola.hs
