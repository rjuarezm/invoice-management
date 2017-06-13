package com.minsait.refarch.demo.invoice.model.services;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by rjuarezm on 12/06/2017.
 */
public class InvoiceCreationServiceTests {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Autowired
    private InvoiceCreationService invoiceCreationService;

    @Test
    public void recalculateTotalWhenInvoiceIsNullShouldThrowException() throws Exception {

        this.thrown.expect( IllegalArgumentException.class );

        this.invoiceCreationService.recalculateTotal( null );
    }

}
