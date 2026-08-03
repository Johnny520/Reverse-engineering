package com.bumptech.glide.request.transition;

/* JADX INFO: loaded from: classes.dex */
public class BitmapTransitionFactory extends com.bumptech.glide.request.transition.BitmapContainerTransitionFactory<android.graphics.Bitmap> {
    public BitmapTransitionFactory(@Yue.InterfaceC4410 com.bumptech.glide.request.transition.TransitionFactory<android.graphics.drawable.Drawable> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: getBitmap, reason: avoid collision after fix types in other method */
    public android.graphics.Bitmap getBitmap2(@Yue.InterfaceC4410 android.graphics.Bitmap r1) {
            r0 = this;
            return r1
    }

    @Override // com.bumptech.glide.request.transition.BitmapContainerTransitionFactory
    @Yue.InterfaceC4410
    public /* bridge */ /* synthetic */ android.graphics.Bitmap getBitmap(@Yue.InterfaceC4410 android.graphics.Bitmap r1) {
            r0 = this;
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            android.graphics.Bitmap r1 = r0.getBitmap2(r1)
            return r1
    }
}
