package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۦۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C2328 extends Yue.AbstractC6953 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final java.lang.String f7583 = "android:fade:transitionAlpha";

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final java.lang.String f7584 = "Fade";

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final int f7585 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final int f7586 = 2;

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۦۡ$ۥ, reason: contains not printable characters */
    public static class C2329 extends android.animation.AnimatorListenerAdapter implements Yue.AbstractC6398.InterfaceC6408 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.view.View f7587;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public boolean f7588;

        public C2329(android.view.View r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f7588 = r0
                r1.f7587 = r2
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r2) {
                r1 = this;
                android.view.View r2 = r1.f7587
                r0 = 1065353216(0x3f800000, float:1.0)
                Yue.C6930.m26819(r2, r0)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                r0 = 0
                r1.onAnimationEnd(r2, r0)
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@Yue.InterfaceC4410 android.animation.Animator r3, boolean r4) {
                r2 = this;
                boolean r3 = r2.f7588
                if (r3 == 0) goto Lb
                android.view.View r3 = r2.f7587
                r0 = 0
                r1 = 0
                r3.setLayerType(r0, r1)
            Lb:
                if (r4 != 0) goto L19
                android.view.View r3 = r2.f7587
                r4 = 1065353216(0x3f800000, float:1.0)
                Yue.C6930.m26819(r3, r4)
                android.view.View r3 = r2.f7587
                Yue.C6930.m26814(r3)
            L19:
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r3) {
                r2 = this;
                android.view.View r3 = r2.f7587
                boolean r3 = r3.hasOverlappingRendering()
                if (r3 == 0) goto L1a
                android.view.View r3 = r2.f7587
                int r3 = r3.getLayerType()
                if (r3 != 0) goto L1a
                r3 = 1
                r2.f7588 = r3
                android.view.View r3 = r2.f7587
                r0 = 2
                r1 = 0
                r3.setLayerType(r0, r1)
            L1a:
                return
        }

        @Override // Yue.AbstractC6398.InterfaceC6408
        public void onTransitionCancel(@Yue.InterfaceC4410 Yue.AbstractC6398 r1) {
                r0 = this;
                return
        }

        @Override // Yue.AbstractC6398.InterfaceC6408
        public void onTransitionEnd(@Yue.InterfaceC4410 Yue.AbstractC6398 r1) {
                r0 = this;
                return
        }

        @Override // Yue.AbstractC6398.InterfaceC6408
        public void onTransitionPause(@Yue.InterfaceC4410 Yue.AbstractC6398 r3) {
                r2 = this;
                android.view.View r3 = r2.f7587
                int r3 = r3.getVisibility()
                if (r3 != 0) goto Lf
                android.view.View r3 = r2.f7587
                float r3 = Yue.C6930.m26815(r3)
                goto L10
            Lf:
                r3 = 0
            L10:
                android.view.View r0 = r2.f7587
                int r1 = Yue.C5102.C5103.f18364
                java.lang.Float r3 = java.lang.Float.valueOf(r3)
                r0.setTag(r1, r3)
                return
        }

        @Override // Yue.AbstractC6398.InterfaceC6408
        public void onTransitionResume(@Yue.InterfaceC4410 Yue.AbstractC6398 r3) {
                r2 = this;
                android.view.View r3 = r2.f7587
                int r0 = Yue.C5102.C5103.f18364
                r1 = 0
                r3.setTag(r0, r1)
                return
        }

        @Override // Yue.AbstractC6398.InterfaceC6408
        public void onTransitionStart(@Yue.InterfaceC4410 Yue.AbstractC6398 r1) {
                r0 = this;
                return
        }

        @Override // Yue.AbstractC6398.InterfaceC6408
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void mo10702(@Yue.InterfaceC4410 Yue.AbstractC6398 r1, boolean r2) {
                r0 = this;
                return
        }
    }

    public C2328() {
            r0 = this;
            r0.<init>()
            return
    }

    public C2328(int r1) {
            r0 = this;
            r0.<init>()
            r0.setMode(r1)
            return
    }

    public C2328(@Yue.InterfaceC4410 android.content.Context r4, @Yue.InterfaceC4410 android.util.AttributeSet r5) {
            r3 = this;
            r3.<init>(r4, r5)
            int[] r0 = Yue.C6019.f21791
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r0)
            android.content.res.XmlResourceParser r5 = (android.content.res.XmlResourceParser) r5
            r0 = 0
            int r1 = r3.getMode()
            java.lang.String r2 = "fadingMode"
            int r5 = Yue.C6478.m23898(r4, r5, r2, r0, r1)
            r3.setMode(r5)
            r4.recycle()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static float m10700(Yue.C6447 r1, float r2) {
            if (r1 == 0) goto L12
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f22708
            java.lang.String r0 = "android:fade:transitionAlpha"
            java.lang.Object r1 = r1.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L12
            float r2 = r1.floatValue()
        L12:
            return r2
    }

    @Override // Yue.AbstractC6953, Yue.AbstractC6398
    public void captureStartValues(@Yue.InterfaceC4410 Yue.C6447 r3) {
            r2 = this;
            super.captureStartValues(r3)
            android.view.View r0 = r3.f22709
            int r1 = Yue.C5102.C5103.f18364
            java.lang.Object r0 = r0.getTag(r1)
            java.lang.Float r0 = (java.lang.Float) r0
            if (r0 != 0) goto L27
            android.view.View r0 = r3.f22709
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L22
            android.view.View r0 = r3.f22709
            float r0 = Yue.C6930.m26815(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            goto L27
        L22:
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L27:
            java.util.Map<java.lang.String, java.lang.Object> r3 = r3.f22708
            java.lang.String r1 = "android:fade:transitionAlpha"
            r3.put(r1, r0)
            return
    }

    @Override // Yue.AbstractC6398
    public boolean isSeekingSupported() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // Yue.AbstractC6953
    @Yue.InterfaceC4544
    public android.animation.Animator onAppear(@Yue.InterfaceC4410 android.view.ViewGroup r1, @Yue.InterfaceC4410 android.view.View r2, @Yue.InterfaceC4544 Yue.C6447 r3, @Yue.InterfaceC4544 Yue.C6447 r4) {
            r0 = this;
            Yue.C6930.m26816(r2)
            r1 = 0
            float r1 = m10700(r3, r1)
            r3 = 1065353216(0x3f800000, float:1.0)
            android.animation.Animator r1 = r0.m10701(r2, r1, r3)
            return r1
    }

    @Override // Yue.AbstractC6953
    @Yue.InterfaceC4544
    public android.animation.Animator onDisappear(@Yue.InterfaceC4410 android.view.ViewGroup r2, @Yue.InterfaceC4410 android.view.View r3, @Yue.InterfaceC4544 Yue.C6447 r4, @Yue.InterfaceC4544 Yue.C6447 r5) {
            r1 = this;
            Yue.C6930.m26816(r3)
            r2 = 1065353216(0x3f800000, float:1.0)
            float r4 = m10700(r4, r2)
            r0 = 0
            android.animation.Animator r4 = r1.m10701(r3, r4, r0)
            if (r4 != 0) goto L17
            float r2 = m10700(r5, r2)
            Yue.C6930.m26819(r3, r2)
        L17:
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final android.animation.Animator m10701(android.view.View r3, float r4, float r5) {
            r2 = this;
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 != 0) goto L6
            r3 = 0
            return r3
        L6:
            Yue.C6930.m26819(r3, r4)
            android.util.Property<android.view.View, java.lang.Float> r4 = Yue.C6930.f24179
            r0 = 1
            float[] r0 = new float[r0]
            r1 = 0
            r0[r1] = r5
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r3, r4, r0)
            Yue.ۥ۠ۡۦۡ$ۥ r5 = new Yue.ۥ۠ۡۦۡ$ۥ
            r5.<init>(r3)
            r4.addListener(r5)
            Yue.ۥۢۢ۟ۧ r3 = r2.getRootTransition()
            r3.addListener(r5)
            return r4
    }
}
