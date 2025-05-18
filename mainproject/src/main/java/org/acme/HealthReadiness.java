package org.acme;

import jakarta.inject.Singleton;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;

@Readiness
@Singleton
public class HealthReadiness implements HealthCheck {

    @Override
    public HealthCheckResponse call() {
            return HealthCheckResponse.up("readiness check");
    }
}
