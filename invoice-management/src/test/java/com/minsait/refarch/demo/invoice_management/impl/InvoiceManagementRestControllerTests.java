package com.minsait.refarch.demo.invoice_management.impl;

import com.minsait.refarch.demo.invoice.model.services.InvoiceCreationService;
import com.minsait.refarch.demo.invoice_management.api.InvoiceData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by rjuarezm on 12/06/2017.
 */
@RunWith(SpringRunner.class)
@WebMvcTest( InvoiceManagementRestController.class )
public class InvoiceManagementRestControllerTests {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private ApplicationContext applicationContext;

    @MockBean
    private InvoiceCreationService invoiceCreationService;


    @Test
    public void generateIdShouldReturnNewId() throws Exception {

        this.mvc.perform( get("/generateid" )
                .accept( MediaType.APPLICATION_JSON ) )
                .andExpect( status().isOk());
    }
}
