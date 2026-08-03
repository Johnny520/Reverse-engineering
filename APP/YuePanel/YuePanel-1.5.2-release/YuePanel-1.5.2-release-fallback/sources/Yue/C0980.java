package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0980 extends Yue.AbstractC6398 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final java.lang.String f2802 = "android:clipBounds:clip";

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final java.lang.String f2803 = "android:clipBounds:bounds";

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final java.lang.String[] f2804 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final android.graphics.Rect f2805 = null;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۤ۠$ۥ, reason: contains not printable characters */
    public static class C0981 extends android.animation.AnimatorListenerAdapter implements Yue.AbstractC6398.InterfaceC6408 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.graphics.Rect f2806;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final android.graphics.Rect f2807;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final android.view.View f2808;

        public C0981(android.view.View r1, android.graphics.Rect r2, android.graphics.Rect r3) {
                r0 = this;
                r0.<init>()
                r0.f2808 = r1
                r0.f2806 = r2
                r0.f2807 = r3
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
        public void onAnimationEnd(android.animation.Animator r1, boolean r2) {
                r0 = this;
                if (r2 != 0) goto La
                android.view.View r1 = r0.f2808
                android.graphics.Rect r2 = r0.f2807
                r1.setClipBounds(r2)
                goto L11
            La:
                android.view.View r1 = r0.f2808
                android.graphics.Rect r2 = r0.f2806
                r1.setClipBounds(r2)
            L11:
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
                android.view.View r3 = r2.f2808
                android.graphics.Rect r3 = r3.getClipBounds()
                if (r3 != 0) goto La
                android.graphics.Rect r3 = Yue.C0980.f2805
            La:
                android.view.View r0 = r2.f2808
                int r1 = Yue.C5102.C5103.f18360
                r0.setTag(r1, r3)
                android.view.View r3 = r2.f2808
                android.graphics.Rect r0 = r2.f2807
                r3.setClipBounds(r0)
                return
        }

        @Override // Yue.AbstractC6398.InterfaceC6408
        public void onTransitionResume(@Yue.InterfaceC4410 Yue.AbstractC6398 r3) {
                r2 = this;
                android.view.View r3 = r2.f2808
                int r0 = Yue.C5102.C5103.f18360
                java.lang.Object r3 = r3.getTag(r0)
                android.graphics.Rect r3 = (android.graphics.Rect) r3
                android.view.View r0 = r2.f2808
                r0.setClipBounds(r3)
                android.view.View r3 = r2.f2808
                int r0 = Yue.C5102.C5103.f18360
                r1 = 0
                r3.setTag(r0, r1)
                return
        }

        @Override // Yue.AbstractC6398.InterfaceC6408
        public void onTransitionStart(@Yue.InterfaceC4410 Yue.AbstractC6398 r1) {
                r0 = this;
                return
        }
    }

    static {
            java.lang.String r0 = "android:clipBounds:clip"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            Yue.C0980.f2804 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            Yue.C0980.f2805 = r0
            return
    }

    public C0980() {
            r0 = this;
            r0.<init>()
            return
    }

    public C0980(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4410 android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // Yue.AbstractC6398
    public void captureEndValues(@Yue.InterfaceC4410 Yue.C6447 r2) {
            r1 = this;
            r0 = 0
            r1.m5487(r2, r0)
            return
    }

    @Override // Yue.AbstractC6398
    public void captureStartValues(@Yue.InterfaceC4410 Yue.C6447 r2) {
            r1 = this;
            r0 = 1
            r1.m5487(r2, r0)
            return
    }

    @Override // Yue.AbstractC6398
    @Yue.InterfaceC4544
    public android.animation.Animator createAnimator(@Yue.InterfaceC4410 android.view.ViewGroup r6, @Yue.InterfaceC4544 Yue.C6447 r7, @Yue.InterfaceC4544 Yue.C6447 r8) {
            r5 = this;
            r6 = 0
            if (r7 == 0) goto L76
            if (r8 == 0) goto L76
            java.util.Map<java.lang.String, java.lang.Object> r0 = r7.f22708
            java.lang.String r1 = "android:clipBounds:clip"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L76
            java.util.Map<java.lang.String, java.lang.Object> r0 = r8.f22708
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L18
            goto L76
        L18:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r7.f22708
            java.lang.Object r0 = r0.get(r1)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            java.util.Map<java.lang.String, java.lang.Object> r2 = r8.f22708
            java.lang.Object r1 = r2.get(r1)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            if (r0 != 0) goto L2d
            if (r1 != 0) goto L2d
            return r6
        L2d:
            java.lang.String r2 = "android:clipBounds:bounds"
            if (r0 != 0) goto L3a
            java.util.Map<java.lang.String, java.lang.Object> r7 = r7.f22708
            java.lang.Object r7 = r7.get(r2)
            android.graphics.Rect r7 = (android.graphics.Rect) r7
            goto L3b
        L3a:
            r7 = r0
        L3b:
            if (r1 != 0) goto L46
            java.util.Map<java.lang.String, java.lang.Object> r3 = r8.f22708
            java.lang.Object r2 = r3.get(r2)
            android.graphics.Rect r2 = (android.graphics.Rect) r2
            goto L47
        L46:
            r2 = r1
        L47:
            boolean r3 = r7.equals(r2)
            if (r3 == 0) goto L4e
            return r6
        L4e:
            android.view.View r6 = r8.f22709
            r6.setClipBounds(r0)
            Yue.ۥۡۦۡۤ r6 = new Yue.ۥۡۦۡۤ
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r6.<init>(r3)
            android.view.View r3 = r8.f22709
            android.util.Property<android.view.View, android.graphics.Rect> r4 = Yue.C6930.f24180
            android.graphics.Rect[] r7 = new android.graphics.Rect[]{r7, r2}
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofObject(r3, r4, r6, r7)
            android.view.View r7 = r8.f22709
            Yue.ۥۣ۟ۤ۠$ۥ r8 = new Yue.ۥۣ۟ۤ۠$ۥ
            r8.<init>(r7, r0, r1)
            r6.addListener(r8)
            r5.addListener(r8)
        L76:
            return r6
    }

    @Override // Yue.AbstractC6398
    @Yue.InterfaceC4410
    public java.lang.String[] getTransitionProperties() {
            r1 = this;
            java.lang.String[] r0 = Yue.C0980.f2804
            return r0
    }

    @Override // Yue.AbstractC6398
    public boolean isSeekingSupported() {
            r1 = this;
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final void m5487(Yue.C6447 r4, boolean r5) {
            r3 = this;
            android.view.View r0 = r4.f22709
            int r1 = r0.getVisibility()
            r2 = 8
            if (r1 != r2) goto Lb
            return
        Lb:
            r1 = 0
            if (r5 == 0) goto L17
            int r5 = Yue.C5102.C5103.f18360
            java.lang.Object r5 = r0.getTag(r5)
            android.graphics.Rect r5 = (android.graphics.Rect) r5
            goto L18
        L17:
            r5 = r1
        L18:
            if (r5 != 0) goto L1e
            android.graphics.Rect r5 = r0.getClipBounds()
        L1e:
            android.graphics.Rect r2 = Yue.C0980.f2805
            if (r5 != r2) goto L23
            goto L24
        L23:
            r1 = r5
        L24:
            java.util.Map<java.lang.String, java.lang.Object> r5 = r4.f22708
            java.lang.String r2 = "android:clipBounds:clip"
            r5.put(r2, r1)
            if (r1 != 0) goto L42
            android.graphics.Rect r5 = new android.graphics.Rect
            int r1 = r0.getWidth()
            int r0 = r0.getHeight()
            r2 = 0
            r5.<init>(r2, r2, r1, r0)
            java.util.Map<java.lang.String, java.lang.Object> r4 = r4.f22708
            java.lang.String r0 = "android:clipBounds:bounds"
            r4.put(r0, r5)
        L42:
            return
    }
}
