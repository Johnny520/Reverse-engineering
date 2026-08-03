package com.bumptech.glide.request.target;

/* JADX INFO: loaded from: classes.dex */
public class BitmapThumbnailImageViewTarget extends com.bumptech.glide.request.target.ThumbnailImageViewTarget<android.graphics.Bitmap> {
    public BitmapThumbnailImageViewTarget(android.widget.ImageView r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @java.lang.Deprecated
    public BitmapThumbnailImageViewTarget(android.widget.ImageView r1, boolean r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    /* JADX INFO: renamed from: getDrawable, reason: avoid collision after fix types in other method */
    public android.graphics.drawable.Drawable getDrawable2(android.graphics.Bitmap r3) {
            r2 = this;
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            T extends android.view.View r1 = r2.view
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            android.content.res.Resources r1 = r1.getResources()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // com.bumptech.glide.request.target.ThumbnailImageViewTarget
    public /* bridge */ /* synthetic */ android.graphics.drawable.Drawable getDrawable(android.graphics.Bitmap r1) {
            r0 = this;
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            android.graphics.drawable.Drawable r1 = r0.getDrawable2(r1)
            return r1
    }
}
