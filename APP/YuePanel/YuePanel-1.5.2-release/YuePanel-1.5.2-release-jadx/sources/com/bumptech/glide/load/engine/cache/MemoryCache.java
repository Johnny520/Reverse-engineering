package com.bumptech.glide.load.engine.cache;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.Resource;

/* JADX INFO: loaded from: classes.dex */
public interface MemoryCache {

    public interface ResourceRemovedListener {
        void onResourceRemoved(@InterfaceC6391 Resource<?> resource);
    }

    void clearMemory();

    long getCurrentSize();

    long getMaxSize();

    @InterfaceC6490
    Resource<?> put(@InterfaceC6391 Key key, @InterfaceC6490 Resource<?> resource);

    @InterfaceC6490
    Resource<?> remove(@InterfaceC6391 Key key);

    void setResourceRemovedListener(@InterfaceC6391 ResourceRemovedListener resourceRemovedListener);

    void setSizeMultiplier(float f);

    void trimMemory(int i);
}
