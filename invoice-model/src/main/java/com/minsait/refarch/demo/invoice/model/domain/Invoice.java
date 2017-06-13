package com.minsait.refarch.demo.invoice.model.domain;


import com.minsait.refarch.common_jpa.AbstractEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

/**
 * Created by rjuarezm on 12/06/2017.
 */
@Data
@Entity
public class Invoice extends AbstractEntity {


    private Double totalAmount;

    private InvoiceId invoiceId;

    private InvoicePeriod invoicePeriod;


    public Invoice(InvoiceId invoiceId) {

        this.invoiceId = invoiceId;
    }
}
