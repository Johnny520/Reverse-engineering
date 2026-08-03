package com.bumptech.glide.request.target;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class BitmapThumbnailImageViewTarget extends ThumbnailImageViewTarget<Bitmap> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BitmapThumbnailImageViewTarget(ImageView imageView) {
        super(imageView);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Deprecated
    public BitmapThumbnailImageViewTarget(ImageView imageView, boolean z) {
        super(imageView, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: getDrawable(Ljava/lang/Object;)Landroid/graphics/drawable/Drawable; */
    @Override // com.bumptech.glide.request.target.ThumbnailImageViewTarget
    public Drawable getDrawable(Bitmap bitmap) {
        return new BitmapDrawable(((ImageView) this.view).getResources(), bitmap);
    }
}
