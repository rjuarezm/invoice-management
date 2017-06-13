package com.minsait.refarch.demo.invoice_management.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by rjuarezm on 12/06/2017.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceData {


    private String invoiceId;

    private Double totalAmount;


}
