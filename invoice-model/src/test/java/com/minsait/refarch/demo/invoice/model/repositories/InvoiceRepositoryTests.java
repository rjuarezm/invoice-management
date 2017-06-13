package com.minsait.refarch.demo.invoice.model.repositories;

import com.minsait.refarch.demo.invoice.model.domain.Invoice;
import com.minsait.refarch.demo.invoice.model.domain.InvoiceId;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by rjuarezm on 12/06/2017.
 */
@RunWith(SpringRunner.class)
@DataJpaTest
public class InvoiceRepositoryTests {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Test
    public void getByInvoiceIdShouldReturnInvoice() throws Exception {

        InvoiceId invoiceId = new InvoiceId( "x4723#rollout" );

        this.entityManager.persistAndFlush( new Invoice( invoiceId) );

        Invoice invoice = this.invoiceRepository.getByInvoiceId(  invoiceId );

        assertThat( invoice.getInvoiceId() ).isEqualTo( invoiceId );
    }

}
