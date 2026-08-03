package com.bumptech.glide.load.engine.bitmap_recycle;

import Yue.InterfaceC6391;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public interface BitmapPool {
    void clearMemory();

    @InterfaceC6391
    Bitmap get(int i, int i2, Bitmap.Config config);

    @InterfaceC6391
    Bitmap getDirty(int i, int i2, Bitmap.Config config);

    long getMaxSize();

    void put(Bitmap bitmap);

    void setSizeMultiplier(float f);

    void trimMemory(int i);
}
