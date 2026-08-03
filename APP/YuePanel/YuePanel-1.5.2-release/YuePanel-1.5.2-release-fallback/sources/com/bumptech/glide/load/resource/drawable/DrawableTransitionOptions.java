package com.bumptech.glide.load.resource.drawable;

/* JADX INFO: loaded from: classes.dex */
public final class DrawableTransitionOptions extends com.bumptech.glide.TransitionOptions<com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions, android.graphics.drawable.Drawable> {
    public DrawableTransitionOptions() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4410
    public static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions with(@Yue.InterfaceC4410 com.bumptech.glide.request.transition.TransitionFactory<android.graphics.drawable.Drawable> r1) {
            com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions r0 = new com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
            r0.<init>()
            com.bumptech.glide.TransitionOptions r1 = r0.transition(r1)
            com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions r1 = (com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions) r1
            return r1
    }

    @Yue.InterfaceC4410
    public static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions withCrossFade() {
            com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions r0 = new com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
            r0.<init>()
            com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions r0 = r0.crossFade()
            return r0
    }

    @Yue.InterfaceC4410
    public static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions withCrossFade(int r1) {
            com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions r0 = new com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
            r0.<init>()
            com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions r1 = r0.crossFade(r1)
            return r1
    }

    @Yue.InterfaceC4410
    public static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions withCrossFade(@Yue.InterfaceC4410 com.bumptech.glide.request.transition.DrawableCrossFadeFactory.Builder r1) {
            com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions r0 = new com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
            r0.<init>()
            com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions r1 = r0.crossFade(r1)
            return r1
    }

    @Yue.InterfaceC4410
    public static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions withCrossFade(@Yue.InterfaceC4410 com.bumptech.glide.request.transition.DrawableCrossFadeFactory r1) {
            com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions r0 = new com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
            r0.<init>()
            com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions r1 = r0.crossFade(r1)
            return r1
    }

    @Yue.InterfaceC4410
    public com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions crossFade() {
            r1 = this;
            com.bumptech.glide.request.transition.DrawableCrossFadeFactory$Builder r0 = new com.bumptech.glide.request.transition.DrawableCrossFadeFactory$Builder
            r0.<init>()
            com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions r0 = r1.crossFade(r0)
            return r0
    }

    @Yue.InterfaceC4410
    public com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions crossFade(int r2) {
            r1 = this;
            com.bumptech.glide.request.transition.DrawableCrossFadeFactory$Builder r0 = new com.bumptech.glide.request.transition.DrawableCrossFadeFactory$Builder
            r0.<init>(r2)
            com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions r2 = r1.crossFade(r0)
            return r2
    }

    @Yue.InterfaceC4410
    public com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions crossFade(@Yue.InterfaceC4410 com.bumptech.glide.request.transition.DrawableCrossFadeFactory.Builder r1) {
            r0 = this;
            com.bumptech.glide.request.transition.DrawableCrossFadeFactory r1 = r1.build()
            com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions r1 = r0.crossFade(r1)
            return r1
    }

    @Yue.InterfaceC4410
    public com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions crossFade(@Yue.InterfaceC4410 com.bumptech.glide.request.transition.DrawableCrossFadeFactory r1) {
            r0 = this;
            com.bumptech.glide.TransitionOptions r1 = r0.transition(r1)
            com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions r1 = (com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions) r1
            return r1
    }

    @Override // com.bumptech.glide.TransitionOptions
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
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
}
