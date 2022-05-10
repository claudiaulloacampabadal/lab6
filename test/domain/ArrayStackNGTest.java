/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package domain;

import com.sun.istack.internal.logging.Logger;
import java.util.logging.Level;
import static org.testng.Assert.*;

/**
 *
 * @author Usuario
 */
public class ArrayStackNGTest {

    public ArrayStackNGTest() {

    }

    public void testSomeMethod() throws StackException {

        try {
            ArrayStack s = new ArrayStack(5);
            s.push(10);
            s.push(3);
            s.push(40);

            System.out.println(s.toString());
            System.out.println(s.toString());
            System.out.println(s.toString());

        } catch (StackException ex) {
            //Logger.getLogger(ArrayStackNGTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
