package com.bumptech.glide.load.engine;

/* JADX INFO: loaded from: classes.dex */
public interface Resource<Z> {
    @Yue.InterfaceC4410
    Z get();

    @Yue.InterfaceC4410
    java.lang.Class<Z> getResourceClass();

    int getSize();

    void recycle();
}
