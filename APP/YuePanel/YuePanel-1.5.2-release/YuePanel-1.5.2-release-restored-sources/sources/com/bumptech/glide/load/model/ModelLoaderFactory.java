package com.bumptech.glide.load.model;

import Yue.InterfaceC6391;

/* JADX INFO: loaded from: classes.dex */
public interface ModelLoaderFactory<T, Y> {
    @InterfaceC6391
    ModelLoader<T, Y> build(@InterfaceC6391 MultiModelLoaderFactory multiModelLoaderFactory);

    void teardown();
}
