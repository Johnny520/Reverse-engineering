package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۥۣ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6953 extends Yue.AbstractC6398 {
    public static final int MODE_IN = 1;
    public static final int MODE_OUT = 2;
    private static final java.lang.String PROPNAME_PARENT = "android:visibility:parent";
    private static final java.lang.String PROPNAME_SCREEN_LOCATION = "android:visibility:screenLocation";
    static final java.lang.String PROPNAME_VISIBILITY = "android:visibility:visibility";
    private static final java.lang.String[] sTransitionProperties = null;
    private int mMode;

    /* JADX INFO: renamed from: Yue.ۥۢۥۣ۟$ۥ, reason: contains not printable characters */
    public static class C6954 extends android.animation.AnimatorListenerAdapter implements Yue.AbstractC6398.InterfaceC6408 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.view.View f24219;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final int f24220;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final android.view.ViewGroup f24221;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final boolean f24222;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean f24223;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean f24224;

        public C6954(android.view.View r2, int r3, boolean r4) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f24224 = r0
                r1.f24219 = r2
                r1.f24220 = r3
                android.view.ViewParent r2 = r2.getParent()
                android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                r1.f24221 = r2
                r1.f24222 = r4
                r2 = 1
                r1.m26891(r2)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r1) {
                r0 = this;
                r1 = 1
                r0.f24224 = r1
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r1) {
                r0 = this;
                r0.m26890()
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@Yue.InterfaceC4410 android.animation.Animator r1, boolean r2) {
                r0 = this;
                if (r2 != 0) goto L5
                r0.m26890()
            L5:
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator r1) {
                r0 = this;
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r1) {
                r0 = this;
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@Yue.InterfaceC4410 android.animation.Animator r1, boolean r2) {
                r0 = this;
                if (r2 == 0) goto Lf
                android.view.View r1 = r0.f24219
                r2 = 0
                Yue.C6930.m26820(r1, r2)
                android.view.ViewGroup r1 = r0.f24221
                if (r1 == 0) goto Lf
                r1.invalidate()
            Lf:
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
                r1.removeListener(r0)
                return
        }

        @Override // Yue.AbstractC6398.InterfaceC6408
        public void onTransitionPause(@Yue.InterfaceC4410 Yue.AbstractC6398 r2) {
                r1 = this;
                r2 = 0
                r1.m26891(r2)
                boolean r2 = r1.f24224
                if (r2 != 0) goto Lf
                android.view.View r2 = r1.f24219
                int r0 = r1.f24220
                Yue.C6930.m26820(r2, r0)
            Lf:
                return
        }

        @Override // Yue.AbstractC6398.InterfaceC6408
        public void onTransitionResume(@Yue.InterfaceC4410 Yue.AbstractC6398 r2) {
                r1 = this;
                r2 = 1
                r1.m26891(r2)
                boolean r2 = r1.f24224
                if (r2 != 0) goto Le
                android.view.View r2 = r1.f24219
                r0 = 0
                Yue.C6930.m26820(r2, r0)
            Le:
                return
        }

        @Override // Yue.AbstractC6398.InterfaceC6408
        public void onTransitionStart(@Yue.InterfaceC4410 Yue.AbstractC6398 r1) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final void m26890() {
                r2 = this;
                boolean r0 = r2.f24224
                if (r0 != 0) goto L12
                android.view.View r0 = r2.f24219
                int r1 = r2.f24220
                Yue.C6930.m26820(r0, r1)
                android.view.ViewGroup r0 = r2.f24221
                if (r0 == 0) goto L12
                r0.invalidate()
            L12:
                r0 = 0
                r2.m26891(r0)
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final void m26891(boolean r2) {
                r1 = this;
                boolean r0 = r1.f24222
                if (r0 == 0) goto L11
                boolean r0 = r1.f24223
                if (r0 == r2) goto L11
                android.view.ViewGroup r0 = r1.f24221
                if (r0 == 0) goto L11
                r1.f24223 = r2
                Yue.C6844.m26532(r0, r2)
            L11:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۣ۟$ۥ۟, reason: contains not printable characters */
    @android.annotation.SuppressLint({"UniqueConstants"})
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InterfaceC6955 {
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۣ۟$ۥ۟۟, reason: contains not printable characters */
    public class C6956 extends android.animation.AnimatorListenerAdapter implements Yue.AbstractC6398.InterfaceC6408 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.view.ViewGroup f24225;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final android.view.View f24226;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final android.view.View f24227;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean f24228;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC6953 f24229;

        public C6956(Yue.AbstractC6953 r1, android.view.ViewGroup r2, android.view.View r3, android.view.View r4) {
                r0 = this;
                r0.f24229 = r1
                r0.<init>()
                r1 = 1
                r0.f24228 = r1
                r0.f24225 = r2
                r0.f24226 = r3
                r0.f24227 = r4
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r1) {
                r0 = this;
                r0.m26892()
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@Yue.InterfaceC4410 android.animation.Animator r1, boolean r2) {
                r0 = this;
                if (r2 != 0) goto L5
                r0.m26892()
            L5:
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(android.animation.Animator r2) {
                r1 = this;
                android.view.ViewGroup r2 = r1.f24225
                android.view.ViewGroupOverlay r2 = r2.getOverlay()
                android.view.View r0 = r1.f24226
                r2.remove(r0)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(android.animation.Animator r2) {
                r1 = this;
                android.view.View r2 = r1.f24226
                android.view.ViewParent r2 = r2.getParent()
                if (r2 != 0) goto L14
                android.view.ViewGroup r2 = r1.f24225
                android.view.ViewGroupOverlay r2 = r2.getOverlay()
                android.view.View r0 = r1.f24226
                r2.add(r0)
                goto L19
            L14:
                Yue.ۥۢۥۣ۟ r2 = r1.f24229
                r2.cancel()
            L19:
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@Yue.InterfaceC4410 android.animation.Animator r2, boolean r3) {
                r1 = this;
                if (r3 == 0) goto L19
                android.view.View r2 = r1.f24227
                int r3 = Yue.C5102.C5103.f18359
                android.view.View r0 = r1.f24226
                r2.setTag(r3, r0)
                android.view.ViewGroup r2 = r1.f24225
                android.view.ViewGroupOverlay r2 = r2.getOverlay()
                android.view.View r3 = r1.f24226
                r2.add(r3)
                r2 = 1
                r1.f24228 = r2
            L19:
                return
        }

        @Override // Yue.AbstractC6398.InterfaceC6408
        public void onTransitionCancel(@Yue.InterfaceC4410 Yue.AbstractC6398 r1) {
                r0 = this;
                boolean r1 = r0.f24228
                if (r1 == 0) goto L7
                r0.m26892()
            L7:
                return
        }

        @Override // Yue.AbstractC6398.InterfaceC6408
        public void onTransitionEnd(@Yue.InterfaceC4410 Yue.AbstractC6398 r1) {
                r0 = this;
                r1.removeListener(r0)
                return
        }

        @Override // Yue.AbstractC6398.InterfaceC6408
        public void onTransitionPause(@Yue.InterfaceC4410 Yue.AbstractC6398 r1) {
                r0 = this;
                return
        }

        @Override // Yue.AbstractC6398.InterfaceC6408
        public void onTransitionResume(@Yue.InterfaceC4410 Yue.AbstractC6398 r1) {
                r0 = this;
                return
        }

        @Override // Yue.AbstractC6398.InterfaceC6408
        public void onTransitionStart(@Yue.InterfaceC4410 Yue.AbstractC6398 r1) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final void m26892() {
                r3 = this;
                android.view.View r0 = r3.f24227
                int r1 = Yue.C5102.C5103.f18359
                r2 = 0
                r0.setTag(r1, r2)
                android.view.ViewGroup r0 = r3.f24225
                android.view.ViewGroupOverlay r0 = r0.getOverlay()
                android.view.View r1 = r3.f24226
                r0.remove(r1)
                r0 = 0
                r3.f24228 = r0
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۥۣ۟$ۥ۟۟۟, reason: contains not printable characters */
    public static class C6957 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public boolean f24230;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public boolean f24231;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f24232;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f24233;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public android.view.ViewGroup f24234;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public android.view.ViewGroup f24235;

        public C6957() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            java.lang.String r0 = "android:visibility:visibility"
            java.lang.String r1 = "android:visibility:parent"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            Yue.AbstractC6953.sTransitionProperties = r0
            return
    }

    public AbstractC6953() {
            r1 = this;
            r1.<init>()
            r0 = 3
            r1.mMode = r0
            return
    }

    public AbstractC6953(@Yue.InterfaceC4410 android.content.Context r3, @Yue.InterfaceC4410 android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            r0 = 3
            r2.mMode = r0
            int[] r0 = Yue.C6019.f21790
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r0)
            android.content.res.XmlResourceParser r4 = (android.content.res.XmlResourceParser) r4
            java.lang.String r0 = "transitionVisibilityMode"
            r1 = 0
            int r4 = Yue.C6478.m23898(r3, r4, r0, r1, r1)
            r3.recycle()
            if (r4 == 0) goto L1d
            r2.setMode(r4)
        L1d:
            return
    }

    private void captureValues(Yue.C6447 r4) {
            r3 = this;
            android.view.View r0 = r4.f22709
            int r0 = r0.getVisibility()
            java.util.Map<java.lang.String, java.lang.Object> r1 = r4.f22708
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "android:visibility:visibility"
            r1.put(r2, r0)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r4.f22708
            android.view.View r1 = r4.f22709
            android.view.ViewParent r1 = r1.getParent()
            java.lang.String r2 = "android:visibility:parent"
            r0.put(r2, r1)
            r0 = 2
            int[] r0 = new int[r0]
            android.view.View r1 = r4.f22709
            r1.getLocationOnScreen(r0)
            java.util.Map<java.lang.String, java.lang.Object> r4 = r4.f22708
            java.lang.String r1 = "android:visibility:screenLocation"
            r4.put(r1, r0)
            return
    }

    @Override // Yue.AbstractC6398
    public void captureEndValues(@Yue.InterfaceC4410 Yue.C6447 r1) {
            r0 = this;
            r0.captureValues(r1)
            return
    }

    @Override // Yue.AbstractC6398
    public void captureStartValues(@Yue.InterfaceC4410 Yue.C6447 r1) {
            r0 = this;
            r0.captureValues(r1)
            return
    }

    @Override // Yue.AbstractC6398
    @Yue.InterfaceC4544
    public android.animation.Animator createAnimator(@Yue.InterfaceC4410 android.view.ViewGroup r9, @Yue.InterfaceC4544 Yue.C6447 r10, @Yue.InterfaceC4544 Yue.C6447 r11) {
            r8 = this;
            Yue.ۥۢۥۣ۟$ۥ۟۟۟ r0 = r8.m26889(r10, r11)
            boolean r1 = r0.f24230
            if (r1 == 0) goto L2e
            android.view.ViewGroup r1 = r0.f24234
            if (r1 != 0) goto L10
            android.view.ViewGroup r1 = r0.f24235
            if (r1 == 0) goto L2e
        L10:
            boolean r1 = r0.f24231
            if (r1 == 0) goto L21
            int r5 = r0.f24232
            int r7 = r0.f24233
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r11
            android.animation.Animator r9 = r2.onAppear(r3, r4, r5, r6, r7)
            return r9
        L21:
            int r3 = r0.f24232
            int r5 = r0.f24233
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r11
            android.animation.Animator r9 = r0.onDisappear(r1, r2, r3, r4, r5)
            return r9
        L2e:
            r9 = 0
            return r9
    }

    public int getMode() {
            r1 = this;
            int r0 = r1.mMode
            return r0
    }

    @Override // Yue.AbstractC6398
    @Yue.InterfaceC4544
    public java.lang.String[] getTransitionProperties() {
            r1 = this;
            java.lang.String[] r0 = Yue.AbstractC6953.sTransitionProperties
            return r0
    }

    @Override // Yue.AbstractC6398
    public boolean isTransitionRequired(@Yue.InterfaceC4544 Yue.C6447 r5, @Yue.InterfaceC4544 Yue.C6447 r6) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L6
            if (r6 != 0) goto L6
            return r0
        L6:
            if (r5 == 0) goto L1b
            if (r6 == 0) goto L1b
            java.util.Map<java.lang.String, java.lang.Object> r1 = r6.f22708
            java.lang.String r2 = "android:visibility:visibility"
            boolean r1 = r1.containsKey(r2)
            java.util.Map<java.lang.String, java.lang.Object> r3 = r5.f22708
            boolean r2 = r3.containsKey(r2)
            if (r1 == r2) goto L1b
            return r0
        L1b:
            Yue.ۥۢۥۣ۟$ۥ۟۟۟ r5 = r4.m26889(r5, r6)
            boolean r6 = r5.f24230
            if (r6 == 0) goto L2c
            int r6 = r5.f24232
            if (r6 == 0) goto L2b
            int r5 = r5.f24233
            if (r5 != 0) goto L2c
        L2b:
            r0 = 1
        L2c:
            return r0
    }

    public boolean isVisible(@Yue.InterfaceC4544 Yue.C6447 r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r4.f22708
            java.lang.String r2 = "android:visibility:visibility"
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.util.Map<java.lang.String, java.lang.Object> r4 = r4.f22708
            java.lang.String r2 = "android:visibility:parent"
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            if (r1 != 0) goto L21
            if (r4 == 0) goto L21
            r0 = 1
        L21:
            return r0
    }

    @Yue.InterfaceC4544
    public android.animation.Animator onAppear(@Yue.InterfaceC4410 android.view.ViewGroup r3, @Yue.InterfaceC4544 Yue.C6447 r4, int r5, @Yue.InterfaceC4544 Yue.C6447 r6, int r7) {
            r2 = this;
            int r5 = r2.mMode
            r7 = 1
            r5 = r5 & r7
            r0 = 0
            if (r5 != r7) goto L2d
            if (r6 != 0) goto La
            goto L2d
        La:
            if (r4 != 0) goto L26
            android.view.View r5 = r6.f22709
            android.view.ViewParent r5 = r5.getParent()
            android.view.View r5 = (android.view.View) r5
            r7 = 0
            Yue.ۥۢۢۡۤ r1 = r2.getMatchedTransitionValues(r5, r7)
            Yue.ۥۢۢۡۤ r5 = r2.getTransitionValues(r5, r7)
            Yue.ۥۢۥۣ۟$ۥ۟۟۟ r5 = r2.m26889(r1, r5)
            boolean r5 = r5.f24230
            if (r5 == 0) goto L26
            return r0
        L26:
            android.view.View r5 = r6.f22709
            android.animation.Animator r3 = r2.onAppear(r3, r5, r4, r6)
            return r3
        L2d:
            return r0
    }

    @Yue.InterfaceC4544
    public android.animation.Animator onAppear(@Yue.InterfaceC4410 android.view.ViewGroup r1, @Yue.InterfaceC4410 android.view.View r2, @Yue.InterfaceC4544 Yue.C6447 r3, @Yue.InterfaceC4544 Yue.C6447 r4) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Yue.InterfaceC4544
    public android.animation.Animator onDisappear(@Yue.InterfaceC4410 android.view.ViewGroup r11, @Yue.InterfaceC4544 Yue.C6447 r12, int r13, @Yue.InterfaceC4544 Yue.C6447 r14, int r15) {
            r10 = this;
            int r13 = r10.mMode
            r0 = 2
            r13 = r13 & r0
            r1 = 0
            if (r13 == r0) goto L8
            return r1
        L8:
            if (r12 != 0) goto Lb
            return r1
        Lb:
            android.view.View r13 = r12.f22709
            if (r14 == 0) goto L12
            android.view.View r2 = r14.f22709
            goto L13
        L12:
            r2 = r1
        L13:
            int r3 = Yue.C5102.C5103.f18359
            java.lang.Object r3 = r13.getTag(r3)
            android.view.View r3 = (android.view.View) r3
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L23
            r2 = r1
            r6 = r5
            goto L88
        L23:
            if (r2 == 0) goto L3a
            android.view.ViewParent r3 = r2.getParent()
            if (r3 != 0) goto L2c
            goto L3a
        L2c:
            r3 = 4
            if (r15 != r3) goto L30
            goto L32
        L30:
            if (r13 != r2) goto L36
        L32:
            r3 = r2
            r6 = r4
            r2 = r1
            goto L3e
        L36:
            r2 = r1
            r3 = r2
            r6 = r5
            goto L3e
        L3a:
            if (r2 == 0) goto L36
            r3 = r1
            r6 = r4
        L3e:
            if (r6 == 0) goto L69
            android.view.ViewParent r6 = r13.getParent()
            if (r6 != 0) goto L47
            goto L85
        L47:
            android.view.ViewParent r6 = r13.getParent()
            boolean r6 = r6 instanceof android.view.View
            if (r6 == 0) goto L69
            android.view.ViewParent r6 = r13.getParent()
            android.view.View r6 = (android.view.View) r6
            Yue.ۥۢۢۡۤ r7 = r10.getTransitionValues(r6, r5)
            Yue.ۥۢۢۡۤ r8 = r10.getMatchedTransitionValues(r6, r5)
            Yue.ۥۢۥۣ۟$ۥ۟۟۟ r7 = r10.m26889(r7, r8)
            boolean r7 = r7.f24230
            if (r7 != 0) goto L6e
            android.view.View r2 = Yue.C6444.m23741(r11, r13, r6)
        L69:
            r6 = r4
            r9 = r3
            r3 = r2
            r2 = r9
            goto L88
        L6e:
            int r7 = r6.getId()
            android.view.ViewParent r6 = r6.getParent()
            if (r6 != 0) goto L69
            r6 = -1
            if (r7 == r6) goto L69
            android.view.View r6 = r11.findViewById(r7)
            if (r6 == 0) goto L69
            boolean r6 = r10.mCanRemoveViews
            if (r6 == 0) goto L69
        L85:
            r2 = r3
            r6 = r4
            r3 = r13
        L88:
            if (r3 == 0) goto Le4
            if (r6 != 0) goto Lbc
            java.util.Map<java.lang.String, java.lang.Object> r15 = r12.f22708
            java.lang.String r1 = "android:visibility:screenLocation"
            java.lang.Object r15 = r15.get(r1)
            int[] r15 = (int[]) r15
            r1 = r15[r4]
            r15 = r15[r5]
            int[] r0 = new int[r0]
            r11.getLocationOnScreen(r0)
            r2 = r0[r4]
            int r1 = r1 - r2
            int r2 = r3.getLeft()
            int r1 = r1 - r2
            r3.offsetLeftAndRight(r1)
            r0 = r0[r5]
            int r15 = r15 - r0
            int r0 = r3.getTop()
            int r15 = r15 - r0
            r3.offsetTopAndBottom(r15)
            android.view.ViewGroupOverlay r15 = r11.getOverlay()
            r15.add(r3)
        Lbc:
            android.animation.Animator r12 = r10.onDisappear(r11, r3, r12, r14)
            if (r6 != 0) goto Le3
            if (r12 != 0) goto Lcc
            android.view.ViewGroupOverlay r11 = r11.getOverlay()
            r11.remove(r3)
            goto Le3
        Lcc:
            int r14 = Yue.C5102.C5103.f18359
            r13.setTag(r14, r3)
            Yue.ۥۢۥۣ۟$ۥ۟۟ r14 = new Yue.ۥۢۥۣ۟$ۥ۟۟
            r14.<init>(r10, r11, r3, r13)
            r12.addListener(r14)
            r12.addPauseListener(r14)
            Yue.ۥۢۢ۟ۧ r11 = r10.getRootTransition()
            r11.addListener(r14)
        Le3:
            return r12
        Le4:
            if (r2 == 0) goto L107
            int r13 = r2.getVisibility()
            Yue.C6930.m26820(r2, r4)
            android.animation.Animator r11 = r10.onDisappear(r11, r2, r12, r14)
            if (r11 == 0) goto L103
            Yue.ۥۢۥۣ۟$ۥ r12 = new Yue.ۥۢۥۣ۟$ۥ
            r12.<init>(r2, r15, r5)
            r11.addListener(r12)
            Yue.ۥۢۢ۟ۧ r13 = r10.getRootTransition()
            r13.addListener(r12)
            goto L106
        L103:
            Yue.C6930.m26820(r2, r13)
        L106:
            return r11
        L107:
            return r1
    }

    @Yue.InterfaceC4544
    public android.animation.Animator onDisappear(@Yue.InterfaceC4410 android.view.ViewGroup r1, @Yue.InterfaceC4410 android.view.View r2, @Yue.InterfaceC4544 Yue.C6447 r3, @Yue.InterfaceC4544 Yue.C6447 r4) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void setMode(int r2) {
            r1 = this;
            r0 = r2 & (-4)
            if (r0 != 0) goto L7
            r1.mMode = r2
            return
        L7:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Only MODE_IN and MODE_OUT flags are allowed"
            r2.<init>(r0)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final Yue.AbstractC6953.C6957 m26889(Yue.C6447 r8, Yue.C6447 r9) {
            r7 = this;
            Yue.ۥۢۥۣ۟$ۥ۟۟۟ r0 = new Yue.ۥۢۥۣ۟$ۥ۟۟۟
            r0.<init>()
            r1 = 0
            r0.f24230 = r1
            r0.f24231 = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f22708
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f22708
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.f24232 = r6
            java.util.Map<java.lang.String, java.lang.Object> r6 = r8.f22708
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f24234 = r6
            goto L37
        L33:
            r0.f24232 = r3
            r0.f24234 = r2
        L37:
            if (r9 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r6 = r9.f22708
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r2 = r9.f22708
            java.lang.Object r2 = r2.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f24233 = r2
            java.util.Map<java.lang.String, java.lang.Object> r2 = r9.f22708
            java.lang.Object r2 = r2.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f24235 = r2
            goto L5e
        L5a:
            r0.f24233 = r3
            r0.f24235 = r2
        L5e:
            r2 = 1
            if (r8 == 0) goto L92
            if (r9 == 0) goto L92
            int r8 = r0.f24232
            int r9 = r0.f24233
            if (r8 != r9) goto L70
            android.view.ViewGroup r3 = r0.f24234
            android.view.ViewGroup r4 = r0.f24235
            if (r3 != r4) goto L70
            return r0
        L70:
            if (r8 == r9) goto L80
            if (r8 != 0) goto L79
            r0.f24231 = r1
            r0.f24230 = r2
            goto La7
        L79:
            if (r9 != 0) goto La7
            r0.f24231 = r2
            r0.f24230 = r2
            goto La7
        L80:
            android.view.ViewGroup r8 = r0.f24235
            if (r8 != 0) goto L89
            r0.f24231 = r1
            r0.f24230 = r2
            goto La7
        L89:
            android.view.ViewGroup r8 = r0.f24234
            if (r8 != 0) goto La7
            r0.f24231 = r2
            r0.f24230 = r2
            goto La7
        L92:
            if (r8 != 0) goto L9d
            int r8 = r0.f24233
            if (r8 != 0) goto L9d
            r0.f24231 = r2
            r0.f24230 = r2
            goto La7
        L9d:
            if (r9 != 0) goto La7
            int r8 = r0.f24232
            if (r8 != 0) goto La7
            r0.f24231 = r1
            r0.f24230 = r2
        La7:
            return r0
    }
}
