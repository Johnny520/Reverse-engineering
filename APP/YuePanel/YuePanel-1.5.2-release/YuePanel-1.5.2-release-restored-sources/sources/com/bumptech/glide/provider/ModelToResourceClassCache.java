package com.bumptech.glide.provider;

import Yue.C3394;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import com.bumptech.glide.util.MultiClassKey;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class ModelToResourceClassCache {
    private final AtomicReference<MultiClassKey> resourceClassKeyRef = new AtomicReference<>();
    private final C3394<MultiClassKey, List<Class<?>>> registeredResourceClassCache = new C3394<>();

    public void clear() {
        synchronized (this.registeredResourceClassCache) {
            this.registeredResourceClassCache.clear();
        }
    }

    @InterfaceC6490
    public List<Class<?>> get(@InterfaceC6391 Class<?> cls, @InterfaceC6391 Class<?> cls2, @InterfaceC6391 Class<?> cls3) {
        List<Class<?>> list;
        MultiClassKey andSet = this.resourceClassKeyRef.getAndSet(null);
        if (andSet == null) {
            andSet = new MultiClassKey(cls, cls2, cls3);
        } else {
            andSet.set(cls, cls2, cls3);
        }
        synchronized (this.registeredResourceClassCache) {
            list = this.registeredResourceClassCache.get(andSet);
        }
        this.resourceClassKeyRef.set(andSet);
        return list;
    }

    public void put(@InterfaceC6391 Class<?> cls, @InterfaceC6391 Class<?> cls2, @InterfaceC6391 Class<?> cls3, @InterfaceC6391 List<Class<?>> list) {
        synchronized (this.registeredResourceClassCache) {
            this.registeredResourceClassCache.put(new MultiClassKey(cls, cls2, cls3), list);
        }
    }
}
