package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class DrawableThumbnailImageViewTarget extends ThumbnailImageViewTarget<Drawable> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public DrawableThumbnailImageViewTarget(ImageView imageView) {
        super(imageView);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: getDrawable(Ljava/lang/Object;)Landroid/graphics/drawable/Drawable; */
    @Override // com.bumptech.glide.request.target.ThumbnailImageViewTarget
    public Drawable getDrawable(Drawable drawable) {
        return drawable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Deprecated
    public DrawableThumbnailImageViewTarget(ImageView imageView, boolean z) {
        super(imageView, z);
    }
}
