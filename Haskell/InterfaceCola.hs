module InterfaceCola where

-- Definición de la clase cola con el perfil de cada función.
class Cola c where
  
-- agrega un elemento al final de la lista.
  encolar :: a -> c a -> c a
  
-- suprime el primer elemento de la lista.
  desencolar :: c a -> c a

-- dice si una lista esta vacia.
  esVacia :: c a -> Bool
  
-- vacia la lista.
  vaciar :: c a -> c a


