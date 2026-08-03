package com.bumptech.glide.request;

/* JADX INFO: loaded from: classes.dex */
public interface RequestListener<R> {
    boolean onLoadFailed(@Yue.InterfaceC4544 com.bumptech.glide.load.engine.GlideException r1, @Yue.InterfaceC4544 java.lang.Object r2, @Yue.InterfaceC4410 com.bumptech.glide.request.target.Target<R> r3, boolean r4);

    boolean onResourceReady(@Yue.InterfaceC4410 R r1, @Yue.InterfaceC4410 java.lang.Object r2, com.bumptech.glide.request.target.Target<R> r3, @Yue.InterfaceC4410 com.bumptech.glide.load.DataSource r4, boolean r5);
}
