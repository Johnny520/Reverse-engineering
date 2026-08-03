package com.bumptech.glide.load.data;

import Yue.InterfaceC6391;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public interface DataRewinder<T> {

    public interface Factory<T> {
        @InterfaceC6391
        DataRewinder<T> build(@InterfaceC6391 T t);

        @InterfaceC6391
        Class<T> getDataClass();
    }

    void cleanup();

    @InterfaceC6391
    T rewindAndGet() throws IOException;
}
