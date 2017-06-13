package com.minsait.refarch.demo.invoice.model.repositories;

import com.minsait.refarch.demo.invoice.model.domain.Invoice;
import com.minsait.refarch.demo.invoice.model.domain.InvoiceId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


/**
 * Created by rjuarezm on 12/06/2017.
 *
 */
public interface InvoiceRepository extends JpaRepository< Invoice, Long > {


    @Query( "from Invoice where invoiceId = :invoiceId" )
    Invoice getByInvoiceId( @Param( "invoiceId" ) InvoiceId invoiceId );

}
