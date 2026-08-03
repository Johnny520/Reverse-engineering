package com.bumptech.glide.load.resource.transcode;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;

/* JADX INFO: loaded from: classes.dex */
public class UnitTranscoder<Z> implements ResourceTranscoder<Z, Z> {
    private static final UnitTranscoder<?> UNIT_TRANSCODER = new UnitTranscoder<>();

    public static <Z> ResourceTranscoder<Z, Z> get() {
        return UNIT_TRANSCODER;
    }

    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    @InterfaceC6490
    public Resource<Z> transcode(@InterfaceC6391 Resource<Z> resource, @InterfaceC6391 Options options) {
        return resource;
    }
}
