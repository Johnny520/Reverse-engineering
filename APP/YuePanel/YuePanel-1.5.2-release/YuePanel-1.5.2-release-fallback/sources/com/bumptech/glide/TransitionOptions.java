package com.bumptech.glide;

import com.bumptech.glide.TransitionOptions;

/* JADX INFO: loaded from: classes.dex */
public abstract class TransitionOptions<CHILD extends com.bumptech.glide.TransitionOptions<CHILD, TranscodeType>, TranscodeType> implements java.lang.Cloneable {
    private com.bumptech.glide.request.transition.TransitionFactory<? super TranscodeType> transitionFactory;

    public TransitionOptions() {
            r1 = this;
            r1.<init>()
            com.bumptech.glide.request.transition.TransitionFactory r0 = com.bumptech.glide.request.transition.NoTransition.getFactory()
            r1.transitionFactory = r0
            return
    }

    private CHILD self() {
            r0 = this;
            return r0
    }

    public final CHILD clone() {
            r2 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L7
            com.bumptech.glide.TransitionOptions r0 = (com.bumptech.glide.TransitionOptions) r0     // Catch: java.lang.CloneNotSupportedException -> L7
            return r0
        L7:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m30399clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            com.bumptech.glide.TransitionOptions r0 = r1.clone()
            return r0
    }

    @Yue.InterfaceC4410
    public final CHILD dontTransition() {
            r1 = this;
            com.bumptech.glide.request.transition.TransitionFactory r0 = com.bumptech.glide.request.transition.NoTransition.getFactory()
            com.bumptech.glide.TransitionOptions r0 = r1.transition(r0)
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.bumptech.glide.TransitionOptions
            if (r0 == 0) goto Lf
            com.bumptech.glide.TransitionOptions r2 = (com.bumptech.glide.TransitionOptions) r2
            com.bumptech.glide.request.transition.TransitionFactory<? super TranscodeType> r0 = r1.transitionFactory
            com.bumptech.glide.request.transition.TransitionFactory<? super TranscodeType> r2 = r2.transitionFactory
            boolean r2 = com.bumptech.glide.util.Util.bothNullOrEqual(r0, r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public final com.bumptech.glide.request.transition.TransitionFactory<? super TranscodeType> getTransitionFactory() {
            r1 = this;
            com.bumptech.glide.request.transition.TransitionFactory<? super TranscodeType> r0 = r1.transitionFactory
            return r0
    }

    public int hashCode() {
            r1 = this;
            com.bumptech.glide.request.transition.TransitionFactory<? super TranscodeType> r0 = r1.transitionFactory
            if (r0 == 0) goto L9
            int r0 = r0.hashCode()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Yue.InterfaceC4410
    public final CHILD transition(int r2) {
            r1 = this;
            com.bumptech.glide.request.transition.ViewAnimationFactory r0 = new com.bumptech.glide.request.transition.ViewAnimationFactory
            r0.<init>(r2)
            com.bumptech.glide.TransitionOptions r2 = r1.transition(r0)
            return r2
    }

    @Yue.InterfaceC4410
    public final CHILD transition(@Yue.InterfaceC4410 com.bumptech.glide.request.transition.TransitionFactory<? super TranscodeType> r1) {
            r0 = this;
            java.lang.Object r1 = com.bumptech.glide.util.Preconditions.checkNotNull(r1)
            com.bumptech.glide.request.transition.TransitionFactory r1 = (com.bumptech.glide.request.transition.TransitionFactory) r1
            r0.transitionFactory = r1
            com.bumptech.glide.TransitionOptions r1 = r0.self()
            return r1
    }

    @Yue.InterfaceC4410
    public final CHILD transition(@Yue.InterfaceC4410 com.bumptech.glide.request.transition.ViewPropertyTransition.Animator r2) {
            r1 = this;
            com.bumptech.glide.request.transition.ViewPropertyAnimationFactory r0 = new com.bumptech.glide.request.transition.ViewPropertyAnimationFactory
            r0.<init>(r2)
            com.bumptech.glide.TransitionOptions r2 = r1.transition(r0)
            return r2
    }
}
