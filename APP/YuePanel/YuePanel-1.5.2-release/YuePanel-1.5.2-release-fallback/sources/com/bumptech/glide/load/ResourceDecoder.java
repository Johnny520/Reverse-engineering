package com.bumptech.glide.load;

/* JADX INFO: loaded from: classes.dex */
public interface ResourceDecoder<T, Z> {
    @Yue.InterfaceC4544
    com.bumptech.glide.load.engine.Resource<Z> decode(@Yue.InterfaceC4410 T r1, int r2, int r3, @Yue.InterfaceC4410 com.bumptech.glide.load.Options r4) throws java.io.IOException;

    boolean handles(@Yue.InterfaceC4410 T r1, @Yue.InterfaceC4410 com.bumptech.glide.load.Options r2) throws java.io.IOException;
}
