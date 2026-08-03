package com.bumptech.glide.load.resource.transcode;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.bytes.BytesResource;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.util.ByteBufferUtil;

/* JADX INFO: loaded from: classes.dex */
public class GifDrawableBytesTranscoder implements ResourceTranscoder<GifDrawable, byte[]> {
    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    @InterfaceC6490
    public Resource<byte[]> transcode(@InterfaceC6391 Resource<GifDrawable> resource, @InterfaceC6391 Options options) {
        return new BytesResource(ByteBufferUtil.toBytes(resource.get().getBuffer()));
    }
}
