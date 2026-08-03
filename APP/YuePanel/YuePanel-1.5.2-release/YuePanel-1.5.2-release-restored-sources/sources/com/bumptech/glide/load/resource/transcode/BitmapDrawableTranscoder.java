package com.bumptech.glide.load.resource.transcode;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.LazyBitmapDrawableResource;
import com.bumptech.glide.util.Preconditions;

/* JADX INFO: loaded from: classes.dex */
public class BitmapDrawableTranscoder implements ResourceTranscoder<Bitmap, BitmapDrawable> {
    private final Resources resources;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BitmapDrawableTranscoder(@InterfaceC6391 Context context) {
        this(context.getResources());
    }

    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    @InterfaceC6490
    public Resource<BitmapDrawable> transcode(@InterfaceC6391 Resource<Bitmap> resource, @InterfaceC6391 Options options) {
        return LazyBitmapDrawableResource.obtain(this.resources, resource);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Deprecated
    public BitmapDrawableTranscoder(@InterfaceC6391 Resources resources, BitmapPool bitmapPool) {
        this(resources);
    }

    public BitmapDrawableTranscoder(@InterfaceC6391 Resources resources) {
        this.resources = (Resources) Preconditions.checkNotNull(resources);
    }
}
