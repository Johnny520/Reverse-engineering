package com.bumptech.glide.request.target;

import Yue.InterfaceC6490;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public abstract class ThumbnailImageViewTarget<T> extends ImageViewTarget<T> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ThumbnailImageViewTarget(ImageView imageView) {
        super(imageView);
    }

    public abstract Drawable getDrawable(T t);

    @Override // com.bumptech.glide.request.target.ImageViewTarget
    public void setResource(@InterfaceC6490 T t) {
        ViewGroup.LayoutParams layoutParams = ((ImageView) this.view).getLayoutParams();
        Drawable drawable = getDrawable(t);
        if (layoutParams != null && layoutParams.width > 0 && layoutParams.height > 0) {
            drawable = new FixedSizeDrawable(drawable, layoutParams.width, layoutParams.height);
        }
        ((ImageView) this.view).setImageDrawable(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Deprecated
    public ThumbnailImageViewTarget(ImageView imageView, boolean z) {
        super(imageView, z);
    }
}
