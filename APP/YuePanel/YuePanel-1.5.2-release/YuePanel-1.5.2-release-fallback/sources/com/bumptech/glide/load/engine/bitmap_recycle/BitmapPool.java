package com.bumptech.glide.load.engine.bitmap_recycle;

/* JADX INFO: loaded from: classes.dex */
public interface BitmapPool {
    void clearMemory();

    @Yue.InterfaceC4410
    android.graphics.Bitmap get(int r1, int r2, android.graphics.Bitmap.Config r3);

    @Yue.InterfaceC4410
    android.graphics.Bitmap getDirty(int r1, int r2, android.graphics.Bitmap.Config r3);

    long getMaxSize();

    void put(android.graphics.Bitmap r1);

    void setSizeMultiplier(float r1);

    void trimMemory(int r1);
}
