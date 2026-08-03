package com.bumptech.glide;

/* JADX INFO: loaded from: classes.dex */
public final class GenericTransitionOptions<TranscodeType> extends com.bumptech.glide.TransitionOptions<com.bumptech.glide.GenericTransitionOptions<TranscodeType>, TranscodeType> {
    public GenericTransitionOptions() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4410
    public static <TranscodeType> com.bumptech.glide.GenericTransitionOptions<TranscodeType> with(int r1) {
            com.bumptech.glide.GenericTransitionOptions r0 = new com.bumptech.glide.GenericTransitionOptions
            r0.<init>()
            com.bumptech.glide.TransitionOptions r1 = r0.transition(r1)
            com.bumptech.glide.GenericTransitionOptions r1 = (com.bumptech.glide.GenericTransitionOptions) r1
            return r1
    }

    @Yue.InterfaceC4410
    public static <TranscodeType> com.bumptech.glide.GenericTransitionOptions<TranscodeType> with(@Yue.InterfaceC4410 com.bumptech.glide.request.transition.TransitionFactory<? super TranscodeType> r1) {
            com.bumptech.glide.GenericTransitionOptions r0 = new com.bumptech.glide.GenericTransitionOptions
            r0.<init>()
            com.bumptech.glide.TransitionOptions r1 = r0.transition(r1)
            com.bumptech.glide.GenericTransitionOptions r1 = (com.bumptech.glide.GenericTransitionOptions) r1
            return r1
    }

    @Yue.InterfaceC4410
    public static <TranscodeType> com.bumptech.glide.GenericTransitionOptions<TranscodeType> with(@Yue.InterfaceC4410 com.bumptech.glide.request.transition.ViewPropertyTransition.Animator r1) {
            com.bumptech.glide.GenericTransitionOptions r0 = new com.bumptech.glide.GenericTransitionOptions
            r0.<init>()
            com.bumptech.glide.TransitionOptions r1 = r0.transition(r1)
            com.bumptech.glide.GenericTransitionOptions r1 = (com.bumptech.glide.GenericTransitionOptions) r1
            return r1
    }

    @Yue.InterfaceC4410
    public static <TranscodeType> com.bumptech.glide.GenericTransitionOptions<TranscodeType> withNoTransition() {
            com.bumptech.glide.GenericTransitionOptions r0 = new com.bumptech.glide.GenericTransitionOptions
            r0.<init>()
            com.bumptech.glide.TransitionOptions r0 = r0.dontTransition()
            com.bumptech.glide.GenericTransitionOptions r0 = (com.bumptech.glide.GenericTransitionOptions) r0
            return r0
    }

    @Override // com.bumptech.glide.TransitionOptions
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.bumptech.glide.GenericTransitionOptions
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
