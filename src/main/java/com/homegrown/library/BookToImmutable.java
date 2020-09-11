package com.homegrown.library;

import org.immutables.value.Value;

@Value.Immutable
public abstract class BookToImmutable {

    public abstract String title();
    public abstract String subTitle();
    public abstract Boolean read();

}
