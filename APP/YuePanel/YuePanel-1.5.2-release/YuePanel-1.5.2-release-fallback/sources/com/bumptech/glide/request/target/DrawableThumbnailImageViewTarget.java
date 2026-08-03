package com.bumptech.glide.request.target;

/* JADX INFO: loaded from: classes.dex */
public class DrawableThumbnailImageViewTarget extends com.bumptech.glide.request.target.ThumbnailImageViewTarget<android.graphics.drawable.Drawable> {
    public DrawableThumbnailImageViewTarget(android.widget.ImageView r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @java.lang.Deprecated
    public DrawableThumbnailImageViewTarget(android.widget.ImageView r1, boolean r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    /* JADX INFO: renamed from: getDrawable, reason: avoid collision after fix types in other method */
    public android.graphics.drawable.Drawable getDrawable2(android.graphics.drawable.Drawable r1) {
            r0 = this;
            return r1
    }

    @Override // com.bumptech.glide.request.target.ThumbnailImageViewTarget
    public /* bridge */ /* synthetic */ android.graphics.drawable.Drawable getDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            android.graphics.drawable.Drawable r1 = r0.getDrawable2(r1)
            return r1
    }
}
