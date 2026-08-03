package com.bumptech.glide.request.target;

import Yue.InterfaceC6391;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class ImageViewTargetFactory {
    @InterfaceC6391
    public <Z> ViewTarget<ImageView, Z> buildTarget(@InterfaceC6391 ImageView imageView, @InterfaceC6391 Class<Z> cls) {
        if (Bitmap.class.equals(cls)) {
            return new BitmapImageViewTarget(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new DrawableImageViewTarget(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
