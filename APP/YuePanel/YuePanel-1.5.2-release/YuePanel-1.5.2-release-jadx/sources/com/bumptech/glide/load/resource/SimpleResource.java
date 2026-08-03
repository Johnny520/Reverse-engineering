package com.bumptech.glide.load.resource;

import Yue.InterfaceC6391;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public class SimpleResource<T> implements Resource<T> {
    protected final T data;

    public SimpleResource(@InterfaceC6391 T t) {
        this.data = (T) Preconditions.checkNotNull(t);
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @InterfaceC6391
    public final T get() {
        return this.data;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @InterfaceC6391
    public Class<T> getResourceClass() {
        return (Class<T>) this.data.getClass();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final int getSize() {
        return 1;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public void recycle() {
    }
}
