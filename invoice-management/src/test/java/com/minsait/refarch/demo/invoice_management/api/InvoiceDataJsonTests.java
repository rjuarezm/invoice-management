package com.minsait.refarch.demo.invoice_management.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by rjuarezm on 12/06/2017.
 */
@RunWith( SpringRunner.class )
@JsonTest
public class InvoiceDataJsonTests {


    @Autowired
    private JacksonTester< InvoiceData > json;


    @Test
    public void serializeJson() throws Exception {

        InvoiceData invoiceData = new InvoiceData("1234", 1.0 );

        assertThat( this.json.write( invoiceData) ).isEqualTo( "invoicedata.json" );
    }


    @Test
    public void deserializeJson() throws Exception {
        String content = "{\"invoiceId\":\"1234\", \"totalAmount\":\"1.0\"}";

        assertThat( this.json.parse(content)).isEqualTo(new InvoiceData("1234", 1.0 ));
    }

}
