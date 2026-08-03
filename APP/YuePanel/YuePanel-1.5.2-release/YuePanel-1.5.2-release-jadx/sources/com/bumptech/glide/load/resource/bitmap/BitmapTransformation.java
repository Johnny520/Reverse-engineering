package com.bumptech.glide.load.resource.bitmap;

import Yue.InterfaceC6391;
import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Util;

/* JADX INFO: loaded from: classes.dex */
public abstract class BitmapTransformation implements Transformation<Bitmap> {
    public abstract Bitmap transform(@InterfaceC6391 BitmapPool bitmapPool, @InterfaceC6391 Bitmap bitmap, int i, int i2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.load.Transformation
    @InterfaceC6391
    public final Resource<Bitmap> transform(@InterfaceC6391 Context context, @InterfaceC6391 Resource<Bitmap> resource, int i, int i2) {
        if (!Util.isValidDimensions(i, i2)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        BitmapPool bitmapPool = Glide.get(context).getBitmapPool();
        Bitmap bitmap = resource.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap bitmapTransform = transform(bitmapPool, bitmap, i, i2);
        return bitmap.equals(bitmapTransform) ? resource : BitmapResource.obtain(bitmapTransform, bitmapPool);
    }
}
