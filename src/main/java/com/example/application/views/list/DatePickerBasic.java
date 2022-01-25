package com.example.application.views.list;


import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import javax.annotation.security.PermitAll;

@Route(value = "date-picker-basic",layout = MainLayout.class)
@PageTitle("Datacośtam | Vaadin CRM")
@PermitAll
public class DatePickerBasic extends Div {

    public DatePickerBasic() {
        // tag::snippet[]
        DatePicker datePicker = new DatePicker("Start date");
        add(datePicker);
        // end::snippet[]
    }
}
