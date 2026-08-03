package com.bumptech.glide.util;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import com.bumptech.glide.ListPreloader;

/* JADX INFO: loaded from: classes.dex */
public class FixedPreloadSizeProvider<T> implements ListPreloader.PreloadSizeProvider<T> {
    private final int[] size;

    public FixedPreloadSizeProvider(int i, int i2) {
        this.size = new int[]{i, i2};
    }

    @Override // com.bumptech.glide.ListPreloader.PreloadSizeProvider
    @InterfaceC6490
    public int[] getPreloadSize(@InterfaceC6391 T t, int i, int i2) {
        return this.size;
    }
}
