package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤ۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0982 extends Yue.AbstractC6398 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final java.lang.String f2809 = "android:changeImageTransform:matrix";

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final java.lang.String f2810 = "android:changeImageTransform:bounds";

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final java.lang.String[] f2811 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final android.animation.TypeEvaluator<android.graphics.Matrix> f2812 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final android.util.Property<android.widget.ImageView, android.graphics.Matrix> f2813 = null;

    /* JADX INFO: renamed from: Yue.ۥ۟ۤ۠ۤ$ۥ, reason: contains not printable characters */
    public class C0983 implements android.animation.TypeEvaluator<android.graphics.Matrix> {
        public C0983() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.animation.TypeEvaluator
        public /* bridge */ /* synthetic */ android.graphics.Matrix evaluate(float r1, android.graphics.Matrix r2, android.graphics.Matrix r3) {
                r0 = this;
                android.graphics.Matrix r2 = (android.graphics.Matrix) r2
                android.graphics.Matrix r3 = (android.graphics.Matrix) r3
                android.graphics.Matrix r1 = r0.m5494(r1, r2, r3)
                return r1
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public android.graphics.Matrix m5494(float r1, android.graphics.Matrix r2, android.graphics.Matrix r3) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۤ۠ۤ$ۥ۟, reason: contains not printable characters */
    public class C0984 extends android.util.Property<android.widget.ImageView, android.graphics.Matrix> {
        public C0984(java.lang.Class r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ android.graphics.Matrix get(android.widget.ImageView r1) {
                r0 = this;
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                android.graphics.Matrix r1 = r0.m5495(r1)
                return r1
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ void set(android.widget.ImageView r1, android.graphics.Matrix r2) {
                r0 = this;
                android.widget.ImageView r1 = (android.widget.ImageView) r1
                android.graphics.Matrix r2 = (android.graphics.Matrix) r2
                r0.m5496(r1, r2)
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public android.graphics.Matrix m5495(android.widget.ImageView r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public void m5496(android.widget.ImageView r1, android.graphics.Matrix r2) {
                r0 = this;
                Yue.C3232.m13652(r1, r2)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۤ۠ۤ$ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ class C0985 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final /* synthetic */ int[] f2814 = null;

        static {
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Yue.C0982.C0985.f2814 = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = Yue.C0982.C0985.f2814     // Catch: java.lang.NoSuchFieldError -> L1d
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۤ۠ۤ$ۥ۟۟۟, reason: contains not printable characters */
    public static class C0986 extends android.animation.AnimatorListenerAdapter implements Yue.AbstractC6398.InterfaceC6408 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.widget.ImageView f2815;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final android.graphics.Matrix f2816;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final android.graphics.Matrix f2817;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean f2818;

        public C0986(android.widget.ImageView r2, android.graphics.Matrix r3, android.graphics.Matrix r4) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.f2818 = r0
                r1.f2815 = r2
                r1.f2816 = r3
                r1.f2817 = r4
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r1) {
                r0 = this;
                r1 = 0
                r0.f2818 = r1
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@Yue.InterfaceC4410 android.animation.Animator r1, boolean r2) {
                r0 = this;
                r0.f2818 = r2
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(android.animation.Animator r1) {
                r0 = this;
                android.animation.ObjectAnimator r1 = (android.animation.ObjectAnimator) r1
                java.lang.Object r1 = r1.getAnimatedValue()
                android.graphics.Matrix r1 = (android.graphics.Matrix) r1
                r0.m5498(r1)
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(android.animation.Animator r1) {
                r0 = this;
                r0.m5497()
                return
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r1) {
                r0 = this;
                r1 = 0
                r0.f2818 = r1
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@Yue.InterfaceC4410 android.animation.Animator r1, boolean r2) {
                r0 = this;
                r1 = 0
                r0.f2818 = r1
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
        public void onTransitionPause(@Yue.InterfaceC4410 Yue.AbstractC6398 r1) {
                r0 = this;
                boolean r1 = r0.f2818
                if (r1 == 0) goto L9
                android.graphics.Matrix r1 = r0.f2816
                r0.m5498(r1)
            L9:
                return
        }

        @Override // Yue.AbstractC6398.InterfaceC6408
        public void onTransitionResume(@Yue.InterfaceC4410 Yue.AbstractC6398 r1) {
                r0 = this;
                r0.m5497()
                return
        }

        @Override // Yue.AbstractC6398.InterfaceC6408
        public void onTransitionStart(@Yue.InterfaceC4410 Yue.AbstractC6398 r1) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final void m5497() {
                r3 = this;
                android.widget.ImageView r0 = r3.f2815
                int r1 = Yue.C5102.C5103.f18362
                java.lang.Object r0 = r0.getTag(r1)
                android.graphics.Matrix r0 = (android.graphics.Matrix) r0
                if (r0 == 0) goto L19
                android.widget.ImageView r1 = r3.f2815
                Yue.C3232.m13652(r1, r0)
                android.widget.ImageView r0 = r3.f2815
                int r1 = Yue.C5102.C5103.f18362
                r2 = 0
                r0.setTag(r1, r2)
            L19:
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final void m5498(android.graphics.Matrix r3) {
                r2 = this;
                android.widget.ImageView r0 = r2.f2815
                int r1 = Yue.C5102.C5103.f18362
                r0.setTag(r1, r3)
                android.widget.ImageView r3 = r2.f2815
                android.graphics.Matrix r0 = r2.f2817
                Yue.C3232.m13652(r3, r0)
                return
        }
    }

    static {
            java.lang.String r0 = "android:changeImageTransform:matrix"
            java.lang.String r1 = "android:changeImageTransform:bounds"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            Yue.C0982.f2811 = r0
            Yue.ۥ۟ۤ۠ۤ$ۥ r0 = new Yue.ۥ۟ۤ۠ۤ$ۥ
            r0.<init>()
            Yue.C0982.f2812 = r0
            Yue.ۥ۟ۤ۠ۤ$ۥ۟ r0 = new Yue.ۥ۟ۤ۠ۤ$ۥ۟
            java.lang.Class<android.graphics.Matrix> r1 = android.graphics.Matrix.class
            java.lang.String r2 = "animatedTransform"
            r0.<init>(r1, r2)
            Yue.C0982.f2813 = r0
            return
    }

    public C0982() {
            r0 = this;
            r0.<init>()
            return
    }

    public C0982(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4410 android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    private void m5488(Yue.C6447 r7, boolean r8) {
            r6 = this;
            android.view.View r0 = r7.f22709
            boolean r1 = r0 instanceof android.widget.ImageView
            if (r1 == 0) goto L4a
            int r1 = r0.getVisibility()
            if (r1 == 0) goto Ld
            goto L4a
        Ld:
            r1 = r0
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            android.graphics.drawable.Drawable r2 = r1.getDrawable()
            if (r2 != 0) goto L17
            return
        L17:
            java.util.Map<java.lang.String, java.lang.Object> r7 = r7.f22708
            int r2 = r0.getLeft()
            int r3 = r0.getTop()
            int r4 = r0.getRight()
            int r0 = r0.getBottom()
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r2, r3, r4, r0)
            java.lang.String r0 = "android:changeImageTransform:bounds"
            r7.put(r0, r5)
            if (r8 == 0) goto L3e
            int r8 = Yue.C5102.C5103.f18362
            java.lang.Object r8 = r1.getTag(r8)
            android.graphics.Matrix r8 = (android.graphics.Matrix) r8
            goto L3f
        L3e:
            r8 = 0
        L3f:
            if (r8 != 0) goto L45
            android.graphics.Matrix r8 = m5490(r1)
        L45:
            java.lang.String r0 = "android:changeImageTransform:matrix"
            r7.put(r0, r8)
        L4a:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static android.graphics.Matrix m5489(android.widget.ImageView r5) {
            android.graphics.drawable.Drawable r0 = r5.getDrawable()
            int r1 = r0.getIntrinsicWidth()
            int r2 = r5.getWidth()
            float r2 = (float) r2
            float r1 = (float) r1
            float r3 = r2 / r1
            int r0 = r0.getIntrinsicHeight()
            int r5 = r5.getHeight()
            float r5 = (float) r5
            float r0 = (float) r0
            float r4 = r5 / r0
            float r3 = java.lang.Math.max(r3, r4)
            float r1 = r1 * r3
            float r0 = r0 * r3
            float r2 = r2 - r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r1
            int r2 = java.lang.Math.round(r2)
            float r5 = r5 - r0
            float r5 = r5 / r1
            int r5 = java.lang.Math.round(r5)
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r0.postScale(r3, r3)
            float r1 = (float) r2
            float r5 = (float) r5
            r0.postTranslate(r1, r5)
            return r0
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static android.graphics.Matrix m5490(@Yue.InterfaceC4410 android.widget.ImageView r2) {
            android.graphics.drawable.Drawable r0 = r2.getDrawable()
            int r1 = r0.getIntrinsicWidth()
            if (r1 <= 0) goto L36
            int r0 = r0.getIntrinsicHeight()
            if (r0 <= 0) goto L36
            int[] r0 = Yue.C0982.C0985.f2814
            android.widget.ImageView$ScaleType r1 = r2.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L31
            r1 = 2
            if (r0 == r1) goto L2c
            android.graphics.Matrix r0 = new android.graphics.Matrix
            android.graphics.Matrix r2 = r2.getImageMatrix()
            r0.<init>(r2)
            return r0
        L2c:
            android.graphics.Matrix r2 = m5489(r2)
            return r2
        L31:
            android.graphics.Matrix r2 = m5491(r2)
            return r2
        L36:
            android.graphics.Matrix r0 = new android.graphics.Matrix
            android.graphics.Matrix r2 = r2.getImageMatrix()
            r0.<init>(r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static android.graphics.Matrix m5491(android.widget.ImageView r4) {
            android.graphics.drawable.Drawable r0 = r4.getDrawable()
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            int r2 = r4.getWidth()
            float r2 = (float) r2
            int r3 = r0.getIntrinsicWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            int r4 = r4.getHeight()
            float r4 = (float) r4
            int r0 = r0.getIntrinsicHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            r1.postScale(r2, r4)
            return r1
    }

    @Override // Yue.AbstractC6398
    public void captureEndValues(@Yue.InterfaceC4410 Yue.C6447 r2) {
            r1 = this;
            r0 = 0
            r1.m5488(r2, r0)
            return
    }

    @Override // Yue.AbstractC6398
    public void captureStartValues(@Yue.InterfaceC4410 Yue.C6447 r2) {
            r1 = this;
            r0 = 1
            r1.m5488(r2, r0)
            return
    }

    @Override // Yue.AbstractC6398
    @Yue.InterfaceC4544
    public android.animation.Animator createAnimator(@Yue.InterfaceC4410 android.view.ViewGroup r5, @Yue.InterfaceC4544 Yue.C6447 r6, @Yue.InterfaceC4544 Yue.C6447 r7) {
            r4 = this;
            r5 = 0
            if (r6 == 0) goto L82
            if (r7 != 0) goto L7
            goto L82
        L7:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r6.f22708
            java.lang.String r1 = "android:changeImageTransform:bounds"
            java.lang.Object r0 = r0.get(r1)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            java.util.Map<java.lang.String, java.lang.Object> r2 = r7.f22708
            java.lang.Object r1 = r2.get(r1)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            if (r0 == 0) goto L82
            if (r1 != 0) goto L1e
            goto L82
        L1e:
            java.util.Map<java.lang.String, java.lang.Object> r6 = r6.f22708
            java.lang.String r2 = "android:changeImageTransform:matrix"
            java.lang.Object r6 = r6.get(r2)
            android.graphics.Matrix r6 = (android.graphics.Matrix) r6
            java.util.Map<java.lang.String, java.lang.Object> r3 = r7.f22708
            java.lang.Object r2 = r3.get(r2)
            android.graphics.Matrix r2 = (android.graphics.Matrix) r2
            if (r6 != 0) goto L34
            if (r2 == 0) goto L3c
        L34:
            if (r6 == 0) goto L3e
            boolean r3 = r6.equals(r2)
            if (r3 == 0) goto L3e
        L3c:
            r3 = 1
            goto L3f
        L3e:
            r3 = 0
        L3f:
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L48
            if (r3 == 0) goto L48
            return r5
        L48:
            android.view.View r5 = r7.f22709
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            android.graphics.drawable.Drawable r7 = r5.getDrawable()
            int r0 = r7.getIntrinsicWidth()
            int r7 = r7.getIntrinsicHeight()
            if (r0 <= 0) goto L7d
            if (r7 > 0) goto L5d
            goto L7d
        L5d:
            if (r6 != 0) goto L61
            android.graphics.Matrix r6 = Yue.C4097.f12509
        L61:
            if (r2 != 0) goto L65
            android.graphics.Matrix r2 = Yue.C4097.f12509
        L65:
            android.util.Property<android.widget.ImageView, android.graphics.Matrix> r7 = Yue.C0982.f2813
            r7.set(r5, r6)
            android.animation.ObjectAnimator r7 = r4.m5492(r5, r6, r2)
            Yue.ۥ۟ۤ۠ۤ$ۥ۟۟۟ r0 = new Yue.ۥ۟ۤ۠ۤ$ۥ۟۟۟
            r0.<init>(r5, r6, r2)
            r7.addListener(r0)
            r7.addPauseListener(r0)
            r4.addListener(r0)
            goto L81
        L7d:
            android.animation.ObjectAnimator r7 = r4.m5493(r5)
        L81:
            return r7
        L82:
            return r5
    }

    @Override // Yue.AbstractC6398
    @Yue.InterfaceC4410
    public java.lang.String[] getTransitionProperties() {
            r1 = this;
            java.lang.String[] r0 = Yue.C0982.f2811
            return r0
    }

    @Override // Yue.AbstractC6398
    public boolean isSeekingSupported() {
            r1 = this;
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final android.animation.ObjectAnimator m5492(android.widget.ImageView r3, android.graphics.Matrix r4, android.graphics.Matrix r5) {
            r2 = this;
            android.util.Property<android.widget.ImageView, android.graphics.Matrix> r0 = Yue.C0982.f2813
            Yue.ۥۣۢۢۡ$ۥ۟ r1 = new Yue.ۥۣۢۢۡ$ۥ۟
            r1.<init>()
            android.graphics.Matrix[] r4 = new android.graphics.Matrix[]{r4, r5}
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofObject(r3, r0, r1, r4)
            return r3
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final android.animation.ObjectAnimator m5493(@Yue.InterfaceC4410 android.widget.ImageView r4) {
            r3 = this;
            android.util.Property<android.widget.ImageView, android.graphics.Matrix> r0 = Yue.C0982.f2813
            android.animation.TypeEvaluator<android.graphics.Matrix> r1 = Yue.C0982.f2812
            android.graphics.Matrix r2 = Yue.C4097.f12509
            android.graphics.Matrix[] r2 = new android.graphics.Matrix[]{r2, r2}
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofObject(r4, r0, r1, r2)
            return r4
    }
}
