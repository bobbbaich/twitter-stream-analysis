package com.bobbbaich.fb.bot.messenger.processor.delegate;

import com.bobbbaich.fb.bot.messenger.processor.api.EventProcessor;
import com.github.messenger4j.webhook.Event;

public interface ProcessorLookup {
    EventProcessor getProcessor(Event event);
}