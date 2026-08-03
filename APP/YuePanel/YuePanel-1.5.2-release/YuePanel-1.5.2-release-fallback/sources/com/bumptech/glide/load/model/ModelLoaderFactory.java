package com.bumptech.glide.load.model;

/* JADX INFO: loaded from: classes.dex */
public interface ModelLoaderFactory<T, Y> {
    @Yue.InterfaceC4410
    com.bumptech.glide.load.model.ModelLoader<T, Y> build(@Yue.InterfaceC4410 com.bumptech.glide.load.model.MultiModelLoaderFactory r1);

    void teardown();
}
