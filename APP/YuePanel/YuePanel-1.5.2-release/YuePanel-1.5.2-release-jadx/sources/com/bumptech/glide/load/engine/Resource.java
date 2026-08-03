package com.bumptech.glide.load.engine;

import Yue.InterfaceC6391;

/* JADX INFO: loaded from: classes.dex */
public interface Resource<Z> {
    @InterfaceC6391
    Z get();

    @InterfaceC6391
    Class<Z> getResourceClass();

    int getSize();

    void recycle();
}
