package com.bumptech.glide.load.resource.bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class BitmapTransitionOptions extends com.bumptech.glide.TransitionOptions<com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions, android.graphics.Bitmap> {
    public BitmapTransitionOptions() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4410
    public static com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions with(@Yue.InterfaceC4410 com.bumptech.glide.request.transition.TransitionFactory<android.graphics.Bitmap> r1) {
            com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions r0 = new com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions
            r0.<init>()
            com.bumptech.glide.TransitionOptions r1 = r0.transition(r1)
            com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions r1 = (com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions) r1
            return r1
    }

    @Yue.InterfaceC4410
    public static com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions withCrossFade() {
            com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions r0 = new com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions
            r0.<init>()
            com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions r0 = r0.crossFade()
            return r0
    }

    @Yue.InterfaceC4410
    public static com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions withCrossFade(int r1) {
            com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions r0 = new com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions
            r0.<init>()
            com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions r1 = r0.crossFade(r1)
            return r1
    }

    @Yue.InterfaceC4410
    public static com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions withCrossFade(@Yue.InterfaceC4410 com.bumptech.glide.request.transition.DrawableCrossFadeFactory.Builder r1) {
            com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions r0 = new com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions
            r0.<init>()
            com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions r1 = r0.crossFade(r1)
            return r1
    }

    @Yue.InterfaceC4410
    public static com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions withCrossFade(@Yue.InterfaceC4410 com.bumptech.glide.request.transition.DrawableCrossFadeFactory r1) {
            com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions r0 = new com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions
            r0.<init>()
            com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions r1 = r0.crossFade(r1)
            return r1
    }

    @Yue.InterfaceC4410
    public static com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions withWrapped(@Yue.InterfaceC4410 com.bumptech.glide.request.transition.TransitionFactory<android.graphics.drawable.Drawable> r1) {
            com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions r0 = new com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions
            r0.<init>()
            com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions r1 = r0.transitionUsing(r1)
            return r1
    }

    @Yue.InterfaceC4410
    public com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions crossFade() {
            r1 = this;
            com.bumptech.glide.request.transition.DrawableCrossFadeFactory$Builder r0 = new com.bumptech.glide.request.transition.DrawableCrossFadeFactory$Builder
            r0.<init>()
            com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions r0 = r1.crossFade(r0)
            return r0
    }

    @Yue.InterfaceC4410
    public com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions crossFade(int r2) {
            r1 = this;
            com.bumptech.glide.request.transition.DrawableCrossFadeFactory$Builder r0 = new com.bumptech.glide.request.transition.DrawableCrossFadeFactory$Builder
            r0.<init>(r2)
            com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions r2 = r1.crossFade(r0)
            return r2
    }

    @Yue.InterfaceC4410
    public com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions crossFade(@Yue.InterfaceC4410 com.bumptech.glide.request.transition.DrawableCrossFadeFactory.Builder r1) {
            r0 = this;
            com.bumptech.glide.request.transition.DrawableCrossFadeFactory r1 = r1.build()
            com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions r1 = r0.transitionUsing(r1)
            return r1
    }

    @Yue.InterfaceC4410
    public com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions crossFade(@Yue.InterfaceC4410 com.bumptech.glide.request.transition.DrawableCrossFadeFactory r1) {
            r0 = this;
            com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions r1 = r0.transitionUsing(r1)
            return r1
    }

    @Override // com.bumptech.glide.TransitionOptions
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions
            if (r0 == 0) goto Lc
            boolean r2 = super.equals(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    @Override // com.bumptech.glide.TransitionOptions
    public int hashCode() {
            r1 = this;
            int r0 = super.hashCode()
            return r0
    }

    @Yue.InterfaceC4410
    public com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions transitionUsing(@Yue.InterfaceC4410 com.bumptech.glide.request.transition.TransitionFactory<android.graphics.drawable.Drawable> r2) {
            r1 = this;
            com.bumptech.glide.request.transition.BitmapTransitionFactory r0 = new com.bumptech.glide.request.transition.BitmapTransitionFactory
            r0.<init>(r2)
            com.bumptech.glide.TransitionOptions r2 = r1.transition(r0)
            com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions r2 = (com.bumptech.glide.load.resource.bitmap.BitmapTransitionOptions) r2
            return r2
    }
}
