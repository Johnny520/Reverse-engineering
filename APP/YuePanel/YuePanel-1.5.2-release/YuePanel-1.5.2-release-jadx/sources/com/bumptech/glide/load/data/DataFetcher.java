package com.bumptech.glide.load.data;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;

/* JADX INFO: loaded from: classes.dex */
public interface DataFetcher<T> {

    public interface DataCallback<T> {
        void onDataReady(@InterfaceC6490 T t);

        void onLoadFailed(@InterfaceC6391 Exception exc);
    }

    void cancel();

    void cleanup();

    @InterfaceC6391
    Class<T> getDataClass();

    @InterfaceC6391
    DataSource getDataSource();

    void loadData(@InterfaceC6391 Priority priority, @InterfaceC6391 DataCallback<? super T> dataCallback);
}
