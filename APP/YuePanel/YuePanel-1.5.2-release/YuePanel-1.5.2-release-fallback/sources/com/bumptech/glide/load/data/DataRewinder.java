package com.bumptech.glide.load.data;

/* JADX INFO: loaded from: classes.dex */
public interface DataRewinder<T> {

    public interface Factory<T> {
        @Yue.InterfaceC4410
        com.bumptech.glide.load.data.DataRewinder<T> build(@Yue.InterfaceC4410 T r1);

        @Yue.InterfaceC4410
        java.lang.Class<T> getDataClass();
    }

    void cleanup();

    @Yue.InterfaceC4410
    T rewindAndGet() throws java.io.IOException;
}
