package com.zimbra.qa.unittest.prov.ldap;

import static org.junit.Assert.assertNotNull;

import org.junit.*;

import com.zimbra.cs.account.GlobalGrant;
import com.zimbra.cs.account.Provisioning;

public class TestLdapProvGlobalGrant extends LdapTest {

private static Provisioning prov;
    
    @BeforeClass
    public static void init() throws Exception {
        prov = new LdapProvTestUtil().getProv();
    }
    
    @Test
    public void getGlobalGrant() throws Exception {
        GlobalGrant globalGrant = prov.getGlobalGrant();
        assertNotNull(globalGrant);
    }
}
