package com.bobbbaich.fb.bot.cache.api;

public interface CacheService<T> {
    void remove(T event);

    void add(T event);
}
