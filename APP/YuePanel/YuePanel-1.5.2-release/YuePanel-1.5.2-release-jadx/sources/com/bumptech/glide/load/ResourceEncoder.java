package com.bumptech.glide.load;

import Yue.InterfaceC6391;
import com.bumptech.glide.load.engine.Resource;

/* JADX INFO: loaded from: classes.dex */
public interface ResourceEncoder<T> extends Encoder<Resource<T>> {
    @InterfaceC6391
    EncodeStrategy getEncodeStrategy(@InterfaceC6391 Options options);
}
