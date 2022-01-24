/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package struts2.test.dao;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import struts2.test.beans.Product;
import struts2.test.beans.User;

/**
 *
 * @author Ankit Kundu
 */
public class AdminTest {
    
    public AdminTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of registerUser method, of class Admin.
     */
    @Test
    public void testRegisterUser() throws Exception {
        System.out.println("registerUser");
        String userName = "Ankit";
        String password = "123ankit45";
        String firstName = "Ankit";
        String lastName = "Kundu";
        String email = "xyz@gmail.com";
        String phoneNumber = "8756484221";
        Admin instance = new Admin();
        int expResult = 0;
        int result = instance.registerUser(userName, password, firstName, lastName, email, phoneNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of report method, of class Admin.
     **/
    /*public void testReport() throws Exception {
        System.out.println("report");
        Admin instance = new Admin();
        List expResult = null;
        List result = instance.report();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of fetchUserDetails method, of class Admin.
     */
    
   /* public void testFetchUserDetails() throws Exception {
        System.out.println("fetchUserDetails");
        String userName = "";
        Admin instance = new Admin();
        User expResult = null;
        User result = instance.fetchUserDetails(userName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of updateUserDetails method, of class Admin.
     */
    
    /*public void testUpdateUserDetails() throws Exception {
        System.out.println("updateUserDetails");
        String userName = "";
        String password = "";
        String firstName = "";
        String lastName = "";
        String email = "";
        String phoneNumber = "";
        Admin instance = new Admin();
        int expResult = 0;
        int result = instance.updateUserDetails(userName, password, firstName, lastName, email, phoneNumber);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUserDetails method, of class Admin.
     */
    
    /*public void testDeleteUserDetails() throws Exception {
        System.out.println("deleteUserDetails");
        String userName = "";
        Admin instance = new Admin();
        int expResult = 0;
        int result = instance.deleteUserDetails(userName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of registerProduct method, of class Admin.
     */
    /*@Test
    public void testRegisterProduct() throws Exception {
        System.out.println("registerProduct");
        int productId = 0;
        String productName = "";
        String productMake = "";
        double price = 0.0;
        int availability = 0;
        Admin instance = new Admin();
        int expResult = 0;
        int result = instance.registerProduct(productId, productName, productMake, price, availability);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of reportProduct method, of class Admin.
     */
    
    /*public void testReportProduct() throws Exception {
        System.out.println("reportProduct");
        Admin instance = new Admin();
        List expResult = null;
        List result = instance.reportProduct();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of fetchProductDetails method, of class Admin.
     */
    /*@Test
    public void testFetchProductDetails() throws Exception {
        System.out.println("fetchProductDetails");
        int productId = 0;
        Admin instance = new Admin();
        Product expResult = null;
        Product result = instance.fetchProductDetails(productId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of updateProductDetails method, of class Admin.
     */
   /* @Test
    public void testUpdateProductDetails() throws Exception {
        System.out.println("updateProductDetails");
        int productId = 0;
        String productName = "";
        String productMake = "";
        double price = 0.0;
        int availability = 0;
        Admin instance = new Admin();
        int expResult = 0;
        int result = instance.updateProductDetails(productId, productName, productMake, price, availability);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of deleteProductDetails method, of class Admin.
     */
   /* @Test
    public void testDeleteProductDetails() throws Exception {
        System.out.println("deleteProductDetails");
        int productId = 0;
        Admin instance = new Admin();
        int expResult = 0;
        int result = instance.deleteProductDetails(productId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    
}
