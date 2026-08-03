package com.bumptech.glide.load.resource.transcode;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
import com.bumptech.glide.load.resource.gif.GifDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class DrawableBytesTranscoder implements ResourceTranscoder<Drawable, byte[]> {
    private final ResourceTranscoder<Bitmap, byte[]> bitmapBytesTranscoder;
    private final BitmapPool bitmapPool;
    private final ResourceTranscoder<GifDrawable, byte[]> gifDrawableBytesTranscoder;

    public DrawableBytesTranscoder(@InterfaceC6391 BitmapPool bitmapPool, @InterfaceC6391 ResourceTranscoder<Bitmap, byte[]> resourceTranscoder, @InterfaceC6391 ResourceTranscoder<GifDrawable, byte[]> resourceTranscoder2) {
        this.bitmapPool = bitmapPool;
        this.bitmapBytesTranscoder = resourceTranscoder;
        this.gifDrawableBytesTranscoder = resourceTranscoder2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.bumptech.glide.load.engine.Resource<android.graphics.drawable.Drawable> */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6391
    private static Resource<GifDrawable> toGifDrawableResource(@InterfaceC6391 Resource<Drawable> resource) {
        return resource;
    }

    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    @InterfaceC6490
    public Resource<byte[]> transcode(@InterfaceC6391 Resource<Drawable> resource, @InterfaceC6391 Options options) {
        Drawable drawable = resource.get();
        if (drawable instanceof BitmapDrawable) {
            return this.bitmapBytesTranscoder.transcode(BitmapResource.obtain(((BitmapDrawable) drawable).getBitmap(), this.bitmapPool), options);
        }
        if (drawable instanceof GifDrawable) {
            return this.gifDrawableBytesTranscoder.transcode(toGifDrawableResource(resource), options);
        }
        return null;
    }
}
