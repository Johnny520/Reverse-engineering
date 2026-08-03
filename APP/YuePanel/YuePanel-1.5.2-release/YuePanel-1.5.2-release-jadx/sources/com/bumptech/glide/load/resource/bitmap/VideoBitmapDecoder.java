package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class VideoBitmapDecoder extends VideoDecoder<ParcelFileDescriptor> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public VideoBitmapDecoder(Context context) {
        this(Glide.get(context).getBitmapPool());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public VideoBitmapDecoder(BitmapPool bitmapPool) {
        super(bitmapPool, new VideoDecoder.ParcelFileDescriptorInitializer());
    }
}
