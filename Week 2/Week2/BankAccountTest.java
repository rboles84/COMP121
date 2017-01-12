import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BankAccountTest.
 *
 * @author  Rob Boles
 * @version 1/11/17
 */
public class BankAccountTest {
    /**
     * Default constructor for test class BankAccountTest.
     */
    public BankAccountTest() {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown() {
    }
    
     /**
     * Tests the default constructor
     */
    @Test
    public void BankAccountTest() {
        BankAccount myAcct = new BankAccount(); 
        assertEquals(0, myAcct.getBalance(), .01);   
    }  
    
    /**
     * Tests the explicit constructor
     */
    @Test
    public void BankAccountTest2() {
        BankAccount myAcct = new BankAccount(100.00); 
        assertEquals(100.00, myAcct.getBalance(), .01);
    }
    
    /**
     * Tests the deposit method
     */
    @Test
    public void testDeposit() {
        BankAccount myAcct = new BankAccount();
        myAcct.deposit(25.00);
        assertEquals(25.00, myAcct.getBalance(), .01);
    }
    
    /**
     * Tests the withdraw method
     */
    @Test
    public void testWithdraw() {
        BankAccount myAcct = new BankAccount();
        myAcct.withdraw(10.00);
        assertEquals(15.00, myAcct.getBalance(), .01);
    }
    
    //Testing the getBalance() method with its own specific test case 
    //is redundant because the method is tested in each test case.
        
}
