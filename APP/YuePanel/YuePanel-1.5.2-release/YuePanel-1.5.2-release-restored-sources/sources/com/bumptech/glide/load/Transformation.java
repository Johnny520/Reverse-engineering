package com.bumptech.glide.load;

import Yue.InterfaceC6391;
import android.content.Context;
import com.bumptech.glide.load.engine.Resource;

/* JADX INFO: loaded from: classes.dex */
public interface Transformation<T> extends Key {
    @InterfaceC6391
    Resource<T> transform(@InterfaceC6391 Context context, @InterfaceC6391 Resource<T> resource, int i, int i2);
}
