package com.minsait.refarch.demo.invoice_management.api;

import java.time.LocalDateTime;

/**
 * Created by rjuarezm on 12/06/2017.
 */
public interface InvoiceManagementApi {


    String generateId();

    InvoiceData createInvoice(String id, Double totalAmount, String userId);

    void freezeInvoice(String invoiceId);

    void deleteInvoice(String invoiceId);

    void movePeriod( LocalDateTime originalStart,
                     LocalDateTime originalEnd, LocalDateTime newStart, LocalDateTime newEnd );
}
