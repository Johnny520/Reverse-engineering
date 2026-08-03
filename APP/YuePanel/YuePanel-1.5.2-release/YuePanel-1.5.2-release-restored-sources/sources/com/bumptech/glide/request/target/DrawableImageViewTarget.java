package com.bumptech.glide.request.target;

import Yue.InterfaceC6490;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class DrawableImageViewTarget extends ImageViewTarget<Drawable> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DrawableImageViewTarget(ImageView imageView) {
        super(imageView);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Deprecated
    public DrawableImageViewTarget(ImageView imageView, boolean z) {
        super(imageView, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setResource(Ljava/lang/Object;)V */
    @Override // com.bumptech.glide.request.target.ImageViewTarget
    public void setResource(@InterfaceC6490 Drawable drawable) {
        ((ImageView) this.view).setImageDrawable(drawable);
    }
}
