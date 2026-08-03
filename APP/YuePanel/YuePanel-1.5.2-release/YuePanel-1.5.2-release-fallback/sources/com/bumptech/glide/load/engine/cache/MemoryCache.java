package com.bumptech.glide.load.engine.cache;

/* JADX INFO: loaded from: classes.dex */
public interface MemoryCache {

    public interface ResourceRemovedListener {
        void onResourceRemoved(@Yue.InterfaceC4410 com.bumptech.glide.load.engine.Resource<?> r1);
    }

    void clearMemory();

    long getCurrentSize();

    long getMaxSize();

    @Yue.InterfaceC4544
    com.bumptech.glide.load.engine.Resource<?> put(@Yue.InterfaceC4410 com.bumptech.glide.load.Key r1, @Yue.InterfaceC4544 com.bumptech.glide.load.engine.Resource<?> r2);

    @Yue.InterfaceC4544
    com.bumptech.glide.load.engine.Resource<?> remove(@Yue.InterfaceC4410 com.bumptech.glide.load.Key r1);

    void setResourceRemovedListener(@Yue.InterfaceC4410 com.bumptech.glide.load.engine.cache.MemoryCache.ResourceRemovedListener r1);

    void setSizeMultiplier(float r1);

    void trimMemory(int r1);
}
