package com.minsait.refarch.demo.invoice_management.impl;

import com.minsait.refarch.demo.invoice.model.services.InvoiceCreationService;
import com.minsait.refarch.demo.invoice_management.api.InvoiceData;
import com.minsait.refarch.demo.invoice_management.api.InvoiceManagementApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * Created by rjuarezm on 12/06/2017.
 */
@RestController
public class InvoiceManagementRestController implements InvoiceManagementApi {


    private InvoiceCreationService invoiceCreationService;


    @Autowired
    public InvoiceManagementRestController(InvoiceCreationService invoiceCreationService) {

        this.invoiceCreationService = invoiceCreationService;
    }


    @Override
    public String generateId() {

        return null;
    }


    @Override
    public InvoiceData createInvoice(String id, Double totalAmount, String userId) {

        return null;
    }


    @Override
    public void freezeInvoice(String invoiceId) {

    }


    @Override
    public void deleteInvoice(String invoiceId) {

    }


    @Override
    public void movePeriod(LocalDateTime originalStart, LocalDateTime originalEnd, LocalDateTime newStart, LocalDateTime newEnd) {

    }
}
