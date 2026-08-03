package androidx.fragment.app;

/* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7613 {

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟۠$ۥ, reason: contains not printable characters */
    public static class C7614 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.view.animation.Animation f29295;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final android.animation.Animator f29296;

        public C7614(android.animation.Animator r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f29295 = r0
                r1.f29296 = r2
                if (r2 == 0) goto Lb
                return
            Lb:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "Animator cannot be null"
                r2.<init>(r0)
                throw r2
        }

        public C7614(android.view.animation.Animation r2) {
                r1 = this;
                r1.<init>()
                r1.f29295 = r2
                r0 = 0
                r1.f29296 = r0
                if (r2 == 0) goto Lb
                return
            Lb:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "Animation cannot be null"
                r2.<init>(r0)
                throw r2
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟۠$ۥ۟, reason: contains not printable characters */
    public static class RunnableC7615 extends android.view.animation.AnimationSet implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final android.view.ViewGroup f29297;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final android.view.View f29298;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public boolean f29299;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public boolean f29300;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public boolean f29301;

        public RunnableC7615(@Yue.InterfaceC4410 android.view.animation.Animation r2, @Yue.InterfaceC4410 android.view.ViewGroup r3, @Yue.InterfaceC4410 android.view.View r4) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r0 = 1
                r1.f29301 = r0
                r1.f29297 = r3
                r1.f29298 = r4
                r1.addAnimation(r2)
                r3.post(r1)
                return
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long r3, @Yue.InterfaceC4410 android.view.animation.Transformation r5) {
                r2 = this;
                r0 = 1
                r2.f29301 = r0
                boolean r1 = r2.f29299
                if (r1 == 0) goto Lb
                boolean r3 = r2.f29300
                r3 = r3 ^ r0
                return r3
            Lb:
                boolean r3 = super.getTransformation(r3, r5)
                if (r3 != 0) goto L18
                r2.f29299 = r0
                android.view.ViewGroup r3 = r2.f29297
                Yue.ViewTreeObserverOnPreDrawListenerC4630.m18451(r3, r2)
            L18:
                return r0
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long r3, @Yue.InterfaceC4410 android.view.animation.Transformation r5, float r6) {
                r2 = this;
                r0 = 1
                r2.f29301 = r0
                boolean r1 = r2.f29299
                if (r1 == 0) goto Lb
                boolean r3 = r2.f29300
                r3 = r3 ^ r0
                return r3
            Lb:
                boolean r3 = super.getTransformation(r3, r5, r6)
                if (r3 != 0) goto L18
                r2.f29299 = r0
                android.view.ViewGroup r3 = r2.f29297
                Yue.ViewTreeObserverOnPreDrawListenerC4630.m18451(r3, r2)
            L18:
                return r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                boolean r0 = r2.f29299
                if (r0 != 0) goto L11
                boolean r0 = r2.f29301
                if (r0 == 0) goto L11
                r0 = 0
                r2.f29301 = r0
                android.view.ViewGroup r0 = r2.f29297
                r0.post(r2)
                goto L1b
            L11:
                android.view.ViewGroup r0 = r2.f29297
                android.view.View r1 = r2.f29298
                r0.endViewTransition(r1)
                r0 = 1
                r2.f29300 = r0
            L1b:
                return
        }
    }

    public C7613() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC0353
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static int m29337(androidx.fragment.app.Fragment r0, boolean r1, boolean r2) {
            if (r2 == 0) goto Le
            if (r1 == 0) goto L9
            int r0 = r0.getPopEnterAnim()
            return r0
        L9:
            int r0 = r0.getPopExitAnim()
            return r0
        Le:
            if (r1 == 0) goto L15
            int r0 = r0.getEnterAnim()
            return r0
        L15:
            int r0 = r0.getExitAnim()
            return r0
    }

    @android.annotation.SuppressLint({"ResourceType"})
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static androidx.fragment.app.C7613.C7614 m29338(@Yue.InterfaceC4410 android.content.Context r4, @Yue.InterfaceC4410 androidx.fragment.app.Fragment r5, boolean r6, boolean r7) {
            int r0 = r5.getNextTransition()
            int r7 = m29337(r5, r6, r7)
            r1 = 0
            r5.setAnimations(r1, r1, r1, r1)
            android.view.ViewGroup r1 = r5.mContainer
            r2 = 0
            if (r1 == 0) goto L20
            int r3 = Yue.C5040.C5043.f16386
            java.lang.Object r1 = r1.getTag(r3)
            if (r1 == 0) goto L20
            android.view.ViewGroup r1 = r5.mContainer
            int r3 = Yue.C5040.C5043.f16386
            r1.setTag(r3, r2)
        L20:
            android.view.ViewGroup r1 = r5.mContainer
            if (r1 == 0) goto L2b
            android.animation.LayoutTransition r1 = r1.getLayoutTransition()
            if (r1 == 0) goto L2b
            return r2
        L2b:
            android.view.animation.Animation r1 = r5.onCreateAnimation(r0, r6, r7)
            if (r1 == 0) goto L37
            androidx.fragment.app.ۥ۟۟۟۠$ۥ r4 = new androidx.fragment.app.ۥ۟۟۟۠$ۥ
            r4.<init>(r1)
            return r4
        L37:
            android.animation.Animator r5 = r5.onCreateAnimator(r0, r6, r7)
            if (r5 == 0) goto L43
            androidx.fragment.app.ۥ۟۟۟۠$ۥ r4 = new androidx.fragment.app.ۥ۟۟۟۠$ۥ
            r4.<init>(r5)
            return r4
        L43:
            if (r7 != 0) goto L4b
            if (r0 == 0) goto L4b
            int r7 = m29340(r4, r0, r6)
        L4b:
            if (r7 == 0) goto L87
            android.content.res.Resources r5 = r4.getResources()
            java.lang.String r5 = r5.getResourceTypeName(r7)
            java.lang.String r6 = "anim"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L6b
            android.view.animation.Animation r6 = android.view.animation.AnimationUtils.loadAnimation(r4, r7)     // Catch: android.content.res.Resources.NotFoundException -> L69 java.lang.RuntimeException -> L6b
            if (r6 == 0) goto L87
            androidx.fragment.app.ۥ۟۟۟۠$ۥ r0 = new androidx.fragment.app.ۥ۟۟۟۠$ۥ     // Catch: android.content.res.Resources.NotFoundException -> L69 java.lang.RuntimeException -> L6b
            r0.<init>(r6)     // Catch: android.content.res.Resources.NotFoundException -> L69 java.lang.RuntimeException -> L6b
            return r0
        L69:
            r4 = move-exception
            throw r4
        L6b:
            android.animation.Animator r6 = android.animation.AnimatorInflater.loadAnimator(r4, r7)     // Catch: java.lang.RuntimeException -> L77
            if (r6 == 0) goto L87
            androidx.fragment.app.ۥ۟۟۟۠$ۥ r0 = new androidx.fragment.app.ۥ۟۟۟۠$ۥ     // Catch: java.lang.RuntimeException -> L77
            r0.<init>(r6)     // Catch: java.lang.RuntimeException -> L77
            return r0
        L77:
            r6 = move-exception
            if (r5 != 0) goto L86
            android.view.animation.Animation r4 = android.view.animation.AnimationUtils.loadAnimation(r4, r7)
            if (r4 == 0) goto L87
            androidx.fragment.app.ۥ۟۟۟۠$ۥ r5 = new androidx.fragment.app.ۥ۟۟۟۠$ۥ
            r5.<init>(r4)
            return r5
        L86:
            throw r6
        L87:
            return r2
    }

    @Yue.InterfaceC0353
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static int m29339(@Yue.InterfaceC4410 android.content.Context r1, int r2) {
            r0 = 16973825(0x1030001, float:2.4060903E-38)
            int[] r2 = new int[]{r2}
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r0, r2)
            r2 = 0
            r0 = -1
            int r2 = r1.getResourceId(r2, r0)
            r1.recycle()
            return r2
    }

    @Yue.InterfaceC0353
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static int m29340(@Yue.InterfaceC4410 android.content.Context r1, int r2, boolean r3) {
            r0 = 4097(0x1001, float:5.741E-42)
            if (r2 == r0) goto L4a
            r0 = 8194(0x2002, float:1.1482E-41)
            if (r2 == r0) goto L42
            r0 = 8197(0x2005, float:1.1486E-41)
            if (r2 == r0) goto L30
            r0 = 4099(0x1003, float:5.744E-42)
            if (r2 == r0) goto L28
            r0 = 4100(0x1004, float:5.745E-42)
            if (r2 == r0) goto L16
            r1 = -1
            goto L51
        L16:
            if (r3 == 0) goto L20
            r2 = 16842936(0x10100b8, float:2.3694074E-38)
            int r1 = m29339(r1, r2)
            goto L51
        L20:
            r2 = 16842937(0x10100b9, float:2.3694076E-38)
            int r1 = m29339(r1, r2)
            goto L51
        L28:
            if (r3 == 0) goto L2d
            int r1 = Yue.C5040.C5042.f16380
            goto L51
        L2d:
            int r1 = Yue.C5040.C5042.f16381
            goto L51
        L30:
            if (r3 == 0) goto L3a
            r2 = 16842938(0x10100ba, float:2.369408E-38)
            int r1 = m29339(r1, r2)
            goto L51
        L3a:
            r2 = 16842939(0x10100bb, float:2.3694082E-38)
            int r1 = m29339(r1, r2)
            goto L51
        L42:
            if (r3 == 0) goto L47
            int r1 = Yue.C5040.C5042.f16378
            goto L51
        L47:
            int r1 = Yue.C5040.C5042.f16379
            goto L51
        L4a:
            if (r3 == 0) goto L4f
            int r1 = Yue.C5040.C5042.f16382
            goto L51
        L4f:
            int r1 = Yue.C5040.C5042.f16383
        L51:
            return r1
    }
}
