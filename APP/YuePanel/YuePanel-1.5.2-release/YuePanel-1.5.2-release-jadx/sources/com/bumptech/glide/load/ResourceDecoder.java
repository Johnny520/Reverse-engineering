package com.bumptech.glide.load;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import com.bumptech.glide.load.engine.Resource;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public interface ResourceDecoder<T, Z> {
    @InterfaceC6490
    Resource<Z> decode(@InterfaceC6391 T t, int i, int i2, @InterfaceC6391 Options options) throws IOException;

    boolean handles(@InterfaceC6391 T t, @InterfaceC6391 Options options) throws IOException;
}
