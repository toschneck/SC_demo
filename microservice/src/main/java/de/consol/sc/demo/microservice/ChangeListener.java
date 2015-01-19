package de.consol.sc.demo.microservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.context.environment.EnvironmentChangeEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author tschneck
 *         Date: 09.12.14
 */
@Component
public class ChangeListener implements ApplicationListener<EnvironmentChangeEvent> {
    Logger LOGGER = LoggerFactory.getLogger(ChangeListener.class);

    /**
     * will be called if the microservice get the REST call {@code localhost:8899/refresh} over GET.
     *
     * @param environmentChangeEvent event with the changed property keys
     */
    @Override
    public void onApplicationEvent(EnvironmentChangeEvent environmentChangeEvent) {
        environmentChangeEvent.getKeys().stream().forEach(s -> LOGGER.warn(">>> PROPERTY-CHANGED '{}'", s));
    }
}
