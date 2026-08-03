package com.bumptech.glide.request.target;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class BitmapImageViewTarget extends ImageViewTarget<Bitmap> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BitmapImageViewTarget(ImageView imageView) {
        super(imageView);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Deprecated
    public BitmapImageViewTarget(ImageView imageView, boolean z) {
        super(imageView, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: setResource(Ljava/lang/Object;)V */
    @Override // com.bumptech.glide.request.target.ImageViewTarget
    public void setResource(Bitmap bitmap) {
        ((ImageView) this.view).setImageBitmap(bitmap);
    }
}
