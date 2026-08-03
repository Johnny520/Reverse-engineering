package com.bumptech.glide.load.resource.transcode;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;

/* JADX INFO: loaded from: classes.dex */
public interface ResourceTranscoder<Z, R> {
    @InterfaceC6490
    Resource<R> transcode(@InterfaceC6391 Resource<Z> resource, @InterfaceC6391 Options options);
}
