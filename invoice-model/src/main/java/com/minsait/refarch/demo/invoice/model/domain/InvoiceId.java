package com.minsait.refarch.demo.invoice.model.domain;


import lombok.AllArgsConstructor;
import org.springframework.util.Assert;


/**
 * Represents invoice numbers.
 *
 */
public class InvoiceId {


    private final String id;


    public InvoiceId( String id ) {

        Assert.hasText( id, "id must not be null nor the empty string");

        this.id = id;
    }

}
