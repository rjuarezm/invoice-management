package com.minsait.refarch.demo.invoice.model.domain;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by rjuarezm on 12/06/2017.
 */
@RunWith( SpringRunner.class )
@DataJpaTest
public class InvoiceTests {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Autowired
    private TestEntityManager entityManager;


    @Test
    public void saveShouldPersistData() throws Exception {

        InvoiceId invoiceId = new InvoiceId( "x4723#rollout" );

        Invoice user = this.entityManager.persistFlushFind( new Invoice( invoiceId ) );

        assertThat( user.getInvoiceId() ).isEqualTo( invoiceId );
    }

    // ...

}
