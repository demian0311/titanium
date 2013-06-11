package com.neidetcher.titanium

import org.junit.Test
import org.junit.Assert._

class TiTest {
    
    @Test
    def test() {
        println("hello world")
        
        val ti = new Ti()
        
        val result = ti("foo"){
            ServiceResponseGood(1 + 5)
        }
        
        assertEquals(ServiceResponseGood(6), result)
        assertFalse(result.failed)
        
    }

}