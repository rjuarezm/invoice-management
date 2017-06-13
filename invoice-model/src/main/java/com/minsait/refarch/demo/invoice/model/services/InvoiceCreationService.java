package com.minsait.refarch.demo.invoice.model.services;

import com.minsait.refarch.demo.invoice.model.domain.Invoice;
import com.minsait.refarch.demo.invoice.model.domain.InvoicePeriod;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.LocalDateTime;


/**
 * Created by rjuarezm on 12/06/2017.
 *
 */
@Service
@Transactional
public class InvoiceCreationService {


    public void recalculateTotal( Invoice invoice, Double... discounts ) {

        // ...
    }


    public Invoice createInvoiceForPeriod( InvoicePeriod invoicePeriod, Double total, String user ) {

        // ...

        return null;
    }


    public InvoicePeriod calculatePeriod( Invoice invoice, LocalDateTime from, LocalDateTime to ) {

        // ...

        return null;
    }

    // ...

}
