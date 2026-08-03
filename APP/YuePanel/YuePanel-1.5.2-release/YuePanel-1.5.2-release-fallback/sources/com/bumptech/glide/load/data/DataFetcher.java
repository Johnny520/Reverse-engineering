package com.bumptech.glide.load.data;

/* JADX INFO: loaded from: classes.dex */
public interface DataFetcher<T> {

    public interface DataCallback<T> {
        void onDataReady(@Yue.InterfaceC4544 T r1);

        void onLoadFailed(@Yue.InterfaceC4410 java.lang.Exception r1);
    }

    void cancel();

    void cleanup();

    @Yue.InterfaceC4410
    java.lang.Class<T> getDataClass();

    @Yue.InterfaceC4410
    com.bumptech.glide.load.DataSource getDataSource();

    void loadData(@Yue.InterfaceC4410 com.bumptech.glide.Priority r1, @Yue.InterfaceC4410 com.bumptech.glide.load.data.DataFetcher.DataCallback<? super T> r2);
}
