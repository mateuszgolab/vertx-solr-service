package com.englishtown.vertx.solr.streams.impl;

import com.englishtown.vertx.solr.streams.WriteJsonStream;
import org.vertx.java.core.Handler;

/**
 * Abstract default implementation of {@link com.englishtown.vertx.solr.streams.WriteJsonStream}
 */
public abstract class AbstractWriteJsonStream<T extends AbstractWriteJsonStream> implements WriteJsonStream<T> {

    protected Handler<Throwable> exceptionHandler;
    protected Handler<Void> drainHandler;

    protected AbstractWriteJsonStream() {
    }

    @Override
    public T drainHandler(Handler<Void> drainHandler) {
        this.drainHandler = drainHandler;
        return (T) this;
    }

    @Override
    public T exceptionHandler(Handler<Throwable> exceptionHandler) {
        this.exceptionHandler = exceptionHandler;
        return (T) this;
    }

    public abstract T handleEnd();

}
