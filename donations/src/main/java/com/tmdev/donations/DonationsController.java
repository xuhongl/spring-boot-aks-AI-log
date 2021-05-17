package com.tmdev.donations;

import com.microsoft.applicationinsights.TelemetryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DonationsController {

    @Autowired
    private TelemetryClient telemetryClient;

    @PostMapping("/login")
    public void login() {

        telemetryClient.trackEvent("DonationsLogin");

        // Performs the sequence of business and security logics for login
    }

    @PostMapping("/donate")
    public void donate(@RequestBody DonateRequest donateRequest) {

        telemetryClient.trackMetric("Donation", donateRequest.getAmount());

        // Performs the sequence of business logic for donation
    }

}
