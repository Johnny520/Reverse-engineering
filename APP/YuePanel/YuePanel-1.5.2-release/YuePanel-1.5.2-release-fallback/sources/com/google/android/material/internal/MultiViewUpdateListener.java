package com.google.android.material.internal;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
public class MultiViewUpdateListener implements android.animation.ValueAnimator.AnimatorUpdateListener {
    private final com.google.android.material.internal.MultiViewUpdateListener.Listener listener;
    private final android.view.View[] views;

    public interface Listener {
        void onAnimationUpdate(@Yue.InterfaceC4410 android.animation.ValueAnimator r1, @Yue.InterfaceC4410 android.view.View r2);
    }

    @android.annotation.SuppressLint({"LambdaLast"})
    public MultiViewUpdateListener(@Yue.InterfaceC4410 com.google.android.material.internal.MultiViewUpdateListener.Listener r1, @Yue.InterfaceC4410 java.util.Collection<android.view.View> r2) {
            r0 = this;
            r0.<init>()
            r0.listener = r1
            r1 = 0
            android.view.View[] r1 = new android.view.View[r1]
            java.lang.Object[] r1 = r2.toArray(r1)
            android.view.View[] r1 = (android.view.View[]) r1
            r0.views = r1
            return
    }

    @android.annotation.SuppressLint({"LambdaLast"})
    public MultiViewUpdateListener(@Yue.InterfaceC4410 com.google.android.material.internal.MultiViewUpdateListener.Listener r1, @Yue.InterfaceC4410 android.view.View... r2) {
            r0 = this;
            r0.<init>()
            r0.listener = r1
            r0.views = r2
            return
    }

    @Yue.InterfaceC4410
    public static com.google.android.material.internal.MultiViewUpdateListener alphaListener(@Yue.InterfaceC4410 java.util.Collection<android.view.View> r2) {
            com.google.android.material.internal.MultiViewUpdateListener r0 = new com.google.android.material.internal.MultiViewUpdateListener
            com.google.android.material.internal.ۥ۟۟۟ r1 = new com.google.android.material.internal.ۥ۟۟۟
            r1.<init>()
            r0.<init>(r1, r2)
            return r0
    }

    @Yue.InterfaceC4410
    public static com.google.android.material.internal.MultiViewUpdateListener alphaListener(@Yue.InterfaceC4410 android.view.View... r2) {
            com.google.android.material.internal.MultiViewUpdateListener r0 = new com.google.android.material.internal.MultiViewUpdateListener
            com.google.android.material.internal.ۥ۟۟۟ r1 = new com.google.android.material.internal.ۥ۟۟۟
            r1.<init>()
            r0.<init>(r1, r2)
            return r0
    }

    @Yue.InterfaceC4410
    public static com.google.android.material.internal.MultiViewUpdateListener scaleListener(@Yue.InterfaceC4410 java.util.Collection<android.view.View> r2) {
            com.google.android.material.internal.MultiViewUpdateListener r0 = new com.google.android.material.internal.MultiViewUpdateListener
            com.google.android.material.internal.ۥ۟ r1 = new com.google.android.material.internal.ۥ۟
            r1.<init>()
            r0.<init>(r1, r2)
            return r0
    }

    @Yue.InterfaceC4410
    public static com.google.android.material.internal.MultiViewUpdateListener scaleListener(@Yue.InterfaceC4410 android.view.View... r2) {
            com.google.android.material.internal.MultiViewUpdateListener r0 = new com.google.android.material.internal.MultiViewUpdateListener
            com.google.android.material.internal.ۥ۟ r1 = new com.google.android.material.internal.ۥ۟
            r1.<init>()
            r0.<init>(r1, r2)
            return r0
    }

    private static void setAlpha(@Yue.InterfaceC4410 android.animation.ValueAnimator r0, @Yue.InterfaceC4410 android.view.View r1) {
            java.lang.Object r0 = r0.getAnimatedValue()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r1.setAlpha(r0)
            return
    }

    private static void setScale(@Yue.InterfaceC4410 android.animation.ValueAnimator r1, @Yue.InterfaceC4410 android.view.View r2) {
            java.lang.Object r1 = r1.getAnimatedValue()
            java.lang.Float r1 = (java.lang.Float) r1
            float r0 = r1.floatValue()
            r2.setScaleX(r0)
            float r1 = r1.floatValue()
            r2.setScaleY(r1)
            return
    }

    private static void setTranslationX(@Yue.InterfaceC4410 android.animation.ValueAnimator r0, @Yue.InterfaceC4410 android.view.View r1) {
            java.lang.Object r0 = r0.getAnimatedValue()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r1.setTranslationX(r0)
            return
    }

    private static void setTranslationY(@Yue.InterfaceC4410 android.animation.ValueAnimator r0, @Yue.InterfaceC4410 android.view.View r1) {
            java.lang.Object r0 = r0.getAnimatedValue()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r1.setTranslationY(r0)
            return
    }

    @Yue.InterfaceC4410
    public static com.google.android.material.internal.MultiViewUpdateListener translationXListener(@Yue.InterfaceC4410 java.util.Collection<android.view.View> r2) {
            com.google.android.material.internal.MultiViewUpdateListener r0 = new com.google.android.material.internal.MultiViewUpdateListener
            com.google.android.material.internal.ۥ r1 = new com.google.android.material.internal.ۥ
            r1.<init>()
            r0.<init>(r1, r2)
            return r0
    }

    @Yue.InterfaceC4410
    public static com.google.android.material.internal.MultiViewUpdateListener translationXListener(@Yue.InterfaceC4410 android.view.View... r2) {
            com.google.android.material.internal.MultiViewUpdateListener r0 = new com.google.android.material.internal.MultiViewUpdateListener
            com.google.android.material.internal.ۥ r1 = new com.google.android.material.internal.ۥ
            r1.<init>()
            r0.<init>(r1, r2)
            return r0
    }

    @Yue.InterfaceC4410
    public static com.google.android.material.internal.MultiViewUpdateListener translationYListener(@Yue.InterfaceC4410 java.util.Collection<android.view.View> r2) {
            com.google.android.material.internal.MultiViewUpdateListener r0 = new com.google.android.material.internal.MultiViewUpdateListener
            com.google.android.material.internal.ۥ۟۟ r1 = new com.google.android.material.internal.ۥ۟۟
            r1.<init>()
            r0.<init>(r1, r2)
            return r0
    }

    @Yue.InterfaceC4410
    public static com.google.android.material.internal.MultiViewUpdateListener translationYListener(@Yue.InterfaceC4410 android.view.View... r2) {
            com.google.android.material.internal.MultiViewUpdateListener r0 = new com.google.android.material.internal.MultiViewUpdateListener
            com.google.android.material.internal.ۥ۟۟ r1 = new com.google.android.material.internal.ۥ۟۟
            r1.<init>()
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m30582(android.animation.ValueAnimator r0, android.view.View r1) {
            setScale(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static /* synthetic */ void m30583(android.animation.ValueAnimator r0, android.view.View r1) {
            setTranslationY(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m30584(android.animation.ValueAnimator r0, android.view.View r1) {
            setAlpha(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m30585(android.animation.ValueAnimator r0, android.view.View r1) {
            setTranslationX(r0, r1)
            return
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(@Yue.InterfaceC4410 android.animation.ValueAnimator r6) {
            r5 = this;
            android.view.View[] r0 = r5.views
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto L10
            r3 = r0[r2]
            com.google.android.material.internal.MultiViewUpdateListener$Listener r4 = r5.listener
            r4.onAnimationUpdate(r6, r3)
            int r2 = r2 + 1
            goto L4
        L10:
            return
    }
}
