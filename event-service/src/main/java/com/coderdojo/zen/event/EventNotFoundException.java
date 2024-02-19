package com.coderdojo.zen.event;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Javadoc
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class EventNotFoundException extends RuntimeException {

    /**
     * Sole constructor. (For invocation by subclass
     * constructors, typically implicit.)
     */
    EventNotFoundException() { /* Default Constructor */ }
}
