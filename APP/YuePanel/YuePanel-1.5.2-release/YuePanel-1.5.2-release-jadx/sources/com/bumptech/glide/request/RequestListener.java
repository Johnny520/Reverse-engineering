package com.bumptech.glide.request;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.target.Target;

/* JADX INFO: loaded from: classes.dex */
public interface RequestListener<R> {
    boolean onLoadFailed(@InterfaceC6490 GlideException glideException, @InterfaceC6490 Object obj, @InterfaceC6391 Target<R> target, boolean z);

    boolean onResourceReady(@InterfaceC6391 R r, @InterfaceC6391 Object obj, Target<R> target, @InterfaceC6391 DataSource dataSource, boolean z);
}
