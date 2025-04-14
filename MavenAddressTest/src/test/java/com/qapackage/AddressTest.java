package com.qapackage;
import org.junit.jupiter.api.BeforeEach; 
import org.junit.jupiter.api.Test; 
import org.mockito.Mockito; 
import static org.junit.jupiter.api.Assertions.*; 
 
import java.util.List; 
 
 
public class AddressTest { 
 
    private IUserAccountDb mockDb; 
    private Address address; 
 
    @BeforeEach 
    public  void setUp() { 
          mockDb = Mockito.mock(IUserAccountDb.class); 
      } 
 
    @Test 
    void testIsValidPostCode() { 
        assertTrue(Utils.isValidUKPostCode("AB1 2CD")); 
        assertFalse(Utils.isValidUKPostCode("123 456")); 
    } 
 
    @Test 
    void testValidCity() { 
        Mockito.when(mockDb.getCityNames()).thenReturn(List.of("SomeCity", "OtherCity")); 
        address = new Address("123", "Main St", "AB1 2CD", "SomeCity", mockDb); 
        assertTrue(address.isValidCity("SomeCity")); 
        assertFalse(address.isValidCity("InvalidCity")); 
    } 
} 