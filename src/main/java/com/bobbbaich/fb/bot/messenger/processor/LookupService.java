package com.bobbbaich.fb.bot.messenger.processor;

import com.github.messenger4j.webhook.Event;

public interface LookupService {
    EventProcessor getService(Event event);
}