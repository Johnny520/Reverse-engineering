package com.bumptech.glide.request.target;

/* JADX INFO: loaded from: classes.dex */
public class DrawableImageViewTarget extends com.bumptech.glide.request.target.ImageViewTarget<android.graphics.drawable.Drawable> {
    public DrawableImageViewTarget(android.widget.ImageView r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @java.lang.Deprecated
    public DrawableImageViewTarget(android.widget.ImageView r1, boolean r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    /* JADX INFO: renamed from: setResource, reason: avoid collision after fix types in other method */
    public void setResource2(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r2) {
            r1 = this;
            T extends android.view.View r0 = r1.view
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setImageDrawable(r2)
            return
    }

    @Override // com.bumptech.glide.request.target.ImageViewTarget
    public /* bridge */ /* synthetic */ void setResource(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r1) {
            r0 = this;
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            r0.setResource2(r1)
            return
    }
}
