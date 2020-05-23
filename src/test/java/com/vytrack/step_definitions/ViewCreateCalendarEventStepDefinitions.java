package com.vytrack.step_definitions;

import com.vytrack.pages.activities.CalendarEventsPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class ViewCreateCalendarEventStepDefinitions {

    @Then("View Per Page menu should have following options")
    public void view_Per_Page_menu_should_have_following_options(List<String> dataTable) {
        CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
        System.out.println("Expected value " + dataTable);
        Assert.assertEquals(dataTable,calendarEventsPage.getViewPerPageOptions() );
    }


}
