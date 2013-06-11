package com.neidetcher.titanium

// TODO: this needs to be a monad also
sealed trait ServiceResponse[A]{
    def failed: Boolean
    def map: A
}

case class ServiceResponseGood[A](inner: A) extends ServiceResponse[A] {
    def failed = false
    
    def map: A = {
        inner
    }
}

class Ti {
    def apply[A](f: => ServiceResponse[A]) = {
      val returnVal = f
      f
    }
    
    def apply[A](name: String)(f: => ServiceResponse[A]) = {
        println("name: " + name)
      val returnVal = f
      f
    }
}