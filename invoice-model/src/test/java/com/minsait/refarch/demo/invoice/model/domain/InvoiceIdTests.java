package com.minsait.refarch.demo.invoice.model.domain;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Created by rjuarezm on 12/06/2017.
 */
public class InvoiceIdTests {


    @Rule
    public ExpectedException thrown = ExpectedException.none();


    @Test
    public void createWhenIdIsNullShouldThrowException() throws Exception {

        this.thrown.expect( IllegalArgumentException.class );

        new InvoiceId( null );
    }

    // ...
}
