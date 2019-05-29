package edu.iis.mto.bdd.trains.cucumber.steps;

import org.joda.time.LocalTime;

import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.pl.Gdy;
import cucumber.api.java.pl.I;
import cucumber.api.java.pl.Wtedy;
import cucumber.api.java.pl.Zakładając;

public class EstimatedArrivingTime {

    @Zakładając("^że chcę się przedostać z \"(.*)\" do \"(.*)\"$")
    public void givenTravelFromTo(String departue, String destination) {
        throw new PendingException();
    }

    @I("o \"(.*)\" na linii \"(.*)\" $")
    public void givenNextTrain(@Transform(JodaLocalTimeConverter.class) LocalTime startTime, String line) {
        throw new PendingException();
    }

    @Gdy("^zapytam o godzinę przyjazdu $")
    public void whenIWantToKnowEstimatedArrivalTime() {
        throw new PendingException();
    }

    @Wtedy("^powinienem uzyskać następujący czas przyjazdu o:$")
    public void shouldBeInformedAbout(@Transform(JodaLocalTimeConverter.class) LocalTime endTime) {
        throw new PendingException();
    }
}
