package a;

/* JADX INFO: loaded from: classes.dex */
public final class mh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.mh.e f581a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a.C0047a9 f582a;
        public final a.C0047a9 b;

        public a(a.C0047a9 r1, a.C0047a9 r2) {
                r0 = this;
                r0.<init>()
                r0.f582a = r1
                r0.b = r2
                return
        }

        public final java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Bounds{lower="
                r0.<init>(r1)
                a.a9 r1 = r2.f582a
                r0.append(r1)
                java.lang.String r1 = " upper="
                r0.append(r1)
                a.a9 r1 = r2.b
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public android.view.WindowInsets f583a;

        public abstract a.nh a(a.nh r1, java.util.List<a.mh> r2);
    }

    public static class c extends a.mh.e {
        public static final android.view.animation.PathInterpolator e = null;
        public static final a.C0243l6 f = null;
        public static final android.view.animation.DecelerateInterpolator g = null;

        public static class a implements android.view.View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a.C0066b9 f584a;
            public a.nh b;

            /* JADX INFO: renamed from: a.mh$c$a$a, reason: collision with other inner class name */
            public class C0003a implements android.animation.ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ a.mh f585a;
                public final /* synthetic */ a.nh b;
                public final /* synthetic */ a.nh c;
                public final /* synthetic */ int d;
                public final /* synthetic */ android.view.View e;

                public C0003a(a.mh r1, a.nh r2, a.nh r3, int r4, android.view.View r5) {
                        r0 = this;
                        r0.<init>()
                        r0.f585a = r1
                        r0.b = r2
                        r0.c = r3
                        r0.d = r4
                        r0.e = r5
                        return
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(android.animation.ValueAnimator r19) {
                        r18 = this;
                        r0 = r18
                        float r2 = r19.getAnimatedFraction()
                        a.mh r3 = r0.f585a
                        a.mh$e r4 = r3.f581a
                        r4.d(r2)
                        a.mh$e r2 = r3.f581a
                        float r2 = r2.b()
                        android.view.animation.PathInterpolator r4 = a.mh.c.e
                        int r4 = android.os.Build.VERSION.SDK_INT
                        a.nh r5 = r0.b
                        r6 = 30
                        if (r4 < r6) goto L23
                        a.nh$d r4 = new a.nh$d
                        r4.<init>(r5)
                        goto L32
                    L23:
                        r6 = 29
                        if (r4 < r6) goto L2d
                        a.nh$c r4 = new a.nh$c
                        r4.<init>(r5)
                        goto L32
                    L2d:
                        a.nh$b r4 = new a.nh$b
                        r4.<init>(r5)
                    L32:
                        r6 = 1
                    L33:
                        r7 = 256(0x100, float:3.59E-43)
                        if (r6 > r7) goto L93
                        int r7 = r0.d
                        r7 = r7 & r6
                        a.nh$k r8 = r5.f603a
                        if (r7 != 0) goto L49
                        a.a9 r7 = r8.f(r6)
                        r4.c(r6, r7)
                        r19 = r2
                        r15 = 1
                        goto L8f
                    L49:
                        a.a9 r7 = r8.f(r6)
                        a.nh r8 = r0.c
                        a.nh$k r8 = r8.f603a
                        a.a9 r8 = r8.f(r6)
                        int r9 = r7.f399a
                        int r10 = r8.f399a
                        int r9 = r9 - r10
                        float r9 = (float) r9
                        r10 = 1065353216(0x3f800000, float:1.0)
                        float r10 = r10 - r2
                        float r9 = r9 * r10
                        double r11 = (double) r9
                        r13 = 4602678819172646912(0x3fe0000000000000, double:0.5)
                        double r11 = r11 + r13
                        int r9 = (int) r11
                        int r11 = r7.b
                        int r12 = r8.b
                        int r11 = r11 - r12
                        float r11 = (float) r11
                        float r11 = r11 * r10
                        double r11 = (double) r11
                        double r11 = r11 + r13
                        int r11 = (int) r11
                        int r12 = r7.c
                        int r15 = r8.c
                        int r12 = r12 - r15
                        float r12 = (float) r12
                        float r12 = r12 * r10
                        r19 = r2
                        r15 = 1
                        double r1 = (double) r12
                        double r1 = r1 + r13
                        int r1 = (int) r1
                        int r2 = r7.d
                        int r8 = r8.d
                        int r2 = r2 - r8
                        float r2 = (float) r2
                        float r2 = r2 * r10
                        r16 = r13
                        double r13 = (double) r2
                        double r13 = r13 + r16
                        int r2 = (int) r13
                        a.a9 r1 = a.nh.e(r7, r9, r11, r1, r2)
                        r4.c(r6, r1)
                    L8f:
                        int r6 = r6 << r15
                        r2 = r19
                        goto L33
                    L93:
                        a.nh r1 = r4.b()
                        java.util.List r2 = java.util.Collections.singletonList(r3)
                        android.view.View r3 = r0.e
                        a.mh.c.g(r3, r1, r2)
                        return
                }
            }

            public class b extends android.animation.AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ a.mh f586a;
                public final /* synthetic */ android.view.View b;

                public b(a.mh r1, android.view.View r2) {
                        r0 = this;
                        r0.f586a = r1
                        r0.b = r2
                        r0.<init>()
                        return
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(android.animation.Animator r3) {
                        r2 = this;
                        a.mh r3 = r2.f586a
                        a.mh$e r0 = r3.f581a
                        r1 = 1065353216(0x3f800000, float:1.0)
                        r0.d(r1)
                        android.view.View r0 = r2.b
                        a.mh.c.e(r3, r0)
                        return
                }
            }

            /* JADX INFO: renamed from: a.mh$c$a$c, reason: collision with other inner class name */
            public class RunnableC0004c implements java.lang.Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ android.view.View f587a;
                public final /* synthetic */ a.mh b;
                public final /* synthetic */ a.mh.a c;
                public final /* synthetic */ android.animation.ValueAnimator d;

                public RunnableC0004c(android.view.View r1, a.mh r2, a.mh.a r3, android.animation.ValueAnimator r4) {
                        r0 = this;
                        r0.<init>()
                        r0.f587a = r1
                        r0.b = r2
                        r0.c = r3
                        r0.d = r4
                        return
                }

                @Override // java.lang.Runnable
                public final void run() {
                        r3 = this;
                        a.mh r0 = r3.b
                        a.mh$a r1 = r3.c
                        android.view.View r2 = r3.f587a
                        a.mh.c.h(r2, r0, r1)
                        android.animation.ValueAnimator r0 = r3.d
                        r0.start()
                        return
                }
            }

            public a(android.view.View r2, a.C0066b9 r3) {
                    r1 = this;
                    r1.<init>()
                    r1.f584a = r3
                    java.util.WeakHashMap<android.view.View, a.Jg> r3 = a.C0414ug.f721a
                    a.nh r2 = a.C0414ug.e.a(r2)
                    if (r2 == 0) goto L2d
                    int r3 = android.os.Build.VERSION.SDK_INT
                    r0 = 30
                    if (r3 < r0) goto L19
                    a.nh$d r3 = new a.nh$d
                    r3.<init>(r2)
                    goto L28
                L19:
                    r0 = 29
                    if (r3 < r0) goto L23
                    a.nh$c r3 = new a.nh$c
                    r3.<init>(r2)
                    goto L28
                L23:
                    a.nh$b r3 = new a.nh$b
                    r3.<init>(r2)
                L28:
                    a.nh r2 = r3.b()
                    goto L2e
                L2d:
                    r2 = 0
                L2e:
                    r1.b = r2
                    return
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public final android.view.WindowInsets onApplyWindowInsets(android.view.View r20, android.view.WindowInsets r21) {
                    r19 = this;
                    r0 = r19
                    r6 = r20
                    r7 = r21
                    r1 = 8
                    r2 = 1
                    boolean r3 = r6.isLaidOut()
                    if (r3 != 0) goto L1a
                    a.nh r1 = a.nh.g(r20, r21)
                    r0.b = r1
                    android.view.WindowInsets r1 = a.mh.c.i(r20, r21)
                    return r1
                L1a:
                    a.nh r3 = a.nh.g(r20, r21)
                    a.nh r4 = r0.b
                    if (r4 != 0) goto L2a
                    java.util.WeakHashMap<android.view.View, a.Jg> r4 = a.C0414ug.f721a
                    a.nh r4 = a.C0414ug.e.a(r6)
                    r0.b = r4
                L2a:
                    a.nh r4 = r0.b
                    if (r4 != 0) goto L35
                    r0.b = r3
                    android.view.WindowInsets r1 = a.mh.c.i(r20, r21)
                    return r1
                L35:
                    a.mh$b r4 = a.mh.c.j(r6)
                    if (r4 == 0) goto L48
                    android.view.WindowInsets r4 = r4.f583a
                    boolean r4 = java.util.Objects.equals(r4, r7)
                    if (r4 == 0) goto L48
                    android.view.WindowInsets r1 = a.mh.c.i(r20, r21)
                    return r1
                L48:
                    a.nh r4 = r0.b
                    r8 = r2
                    r9 = 0
                L4c:
                    a.nh$k r10 = r3.f603a
                    r11 = 256(0x100, float:3.59E-43)
                    if (r8 > r11) goto L65
                    a.a9 r10 = r10.f(r8)
                    a.nh$k r11 = r4.f603a
                    a.a9 r11 = r11.f(r8)
                    boolean r10 = r10.equals(r11)
                    if (r10 != 0) goto L63
                    r9 = r9 | r8
                L63:
                    int r8 = r8 << r2
                    goto L4c
                L65:
                    if (r9 != 0) goto L6c
                    android.view.WindowInsets r1 = a.mh.c.i(r20, r21)
                    return r1
                L6c:
                    a.nh r4 = r0.b
                    r2 = r9 & 8
                    if (r2 == 0) goto L88
                    a.a9 r2 = r10.f(r1)
                    int r2 = r2.d
                    a.nh$k r8 = r4.f603a
                    a.a9 r1 = r8.f(r1)
                    int r1 = r1.d
                    if (r2 <= r1) goto L85
                    android.view.animation.PathInterpolator r1 = a.mh.c.e
                    goto L8a
                L85:
                    a.l6 r1 = a.mh.c.f
                    goto L8a
                L88:
                    android.view.animation.DecelerateInterpolator r1 = a.mh.c.g
                L8a:
                    a.mh r2 = new a.mh
                    r11 = 160(0xa0, double:7.9E-322)
                    r2.<init>(r9, r1, r11)
                    a.mh$e r1 = r2.f581a
                    r8 = 0
                    r1.d(r8)
                    r1 = 2
                    float[] r1 = new float[r1]
                    r1 = {x0128: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
                    android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
                    a.mh$e r8 = r2.f581a
                    long r11 = r8.a()
                    android.animation.ValueAnimator r8 = r1.setDuration(r11)
                    a.a9 r1 = r10.f(r9)
                    a.nh$k r10 = r4.f603a
                    a.a9 r10 = r10.f(r9)
                    int r11 = r1.f399a
                    int r12 = r10.f399a
                    int r11 = java.lang.Math.min(r11, r12)
                    int r12 = r1.b
                    int r13 = r10.b
                    int r14 = java.lang.Math.min(r12, r13)
                    int r15 = r1.c
                    int r5 = r10.c
                    r16 = r3
                    int r3 = java.lang.Math.min(r15, r5)
                    r17 = r4
                    int r4 = r1.d
                    r18 = r9
                    int r9 = r10.d
                    int r0 = java.lang.Math.min(r4, r9)
                    a.a9 r0 = a.C0047a9.b(r11, r14, r3, r0)
                    int r1 = r1.f399a
                    int r3 = r10.f399a
                    int r1 = java.lang.Math.max(r1, r3)
                    int r3 = java.lang.Math.max(r12, r13)
                    int r5 = java.lang.Math.max(r15, r5)
                    int r4 = java.lang.Math.max(r4, r9)
                    a.a9 r1 = a.C0047a9.b(r1, r3, r5, r4)
                    a.mh$a r9 = new a.mh$a
                    r9.<init>(r0, r1)
                    r0 = 0
                    a.mh.c.f(r6, r2, r7, r0)
                    a.mh$c$a$a r1 = new a.mh$c$a$a
                    r3 = r16
                    r4 = r17
                    r5 = r18
                    r1.<init>(r2, r3, r4, r5, r6)
                    r8.addUpdateListener(r1)
                    a.mh$c$a$b r0 = new a.mh$c$a$b
                    r0.<init>(r2, r6)
                    r8.addListener(r0)
                    a.mh$c$a$c r0 = new a.mh$c$a$c
                    r0.<init>(r6, r2, r9, r8)
                    a.ViewTreeObserverOnPreDrawListenerC0178hc.a(r6, r0)
                    r0 = r19
                    r0.b = r3
                    android.view.WindowInsets r1 = a.mh.c.i(r20, r21)
                    return r1
            }
        }

        static {
                android.view.animation.PathInterpolator r0 = new android.view.animation.PathInterpolator
                r1 = 1065353216(0x3f800000, float:1.0)
                r2 = 0
                r3 = 1066192077(0x3f8ccccd, float:1.1)
                r0.<init>(r2, r3, r2, r1)
                a.mh.c.e = r0
                a.l6 r0 = new a.l6
                r0.<init>()
                a.mh.c.f = r0
                android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
                r0.<init>()
                a.mh.c.g = r0
                return
        }

        public static void e(a.mh r2, android.view.View r3) {
                a.mh$b r0 = j(r3)
                if (r0 == 0) goto Lf
                a.b9 r0 = (a.C0066b9) r0
                android.view.View r2 = r0.b
                r3 = 0
                r2.setTranslationY(r3)
                return
            Lf:
                boolean r0 = r3 instanceof android.view.ViewGroup
                if (r0 == 0) goto L26
                android.view.ViewGroup r3 = (android.view.ViewGroup) r3
                r0 = 0
            L16:
                int r1 = r3.getChildCount()
                if (r0 >= r1) goto L26
                android.view.View r1 = r3.getChildAt(r0)
                e(r2, r1)
                int r0 = r0 + 1
                goto L16
            L26:
                return
        }

        public static void f(android.view.View r2, a.mh r3, android.view.WindowInsets r4, boolean r5) {
                a.mh$b r0 = j(r2)
                if (r0 == 0) goto L18
                r0.f583a = r4
                if (r5 != 0) goto L18
                a.b9 r0 = (a.C0066b9) r0
                android.view.View r5 = r0.b
                int[] r1 = r0.e
                r5.getLocationOnScreen(r1)
                r5 = 1
                r1 = r1[r5]
                r0.c = r1
            L18:
                boolean r0 = r2 instanceof android.view.ViewGroup
                if (r0 == 0) goto L2f
                android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                r0 = 0
            L1f:
                int r1 = r2.getChildCount()
                if (r0 >= r1) goto L2f
                android.view.View r1 = r2.getChildAt(r0)
                f(r1, r3, r4, r5)
                int r0 = r0 + 1
                goto L1f
            L2f:
                return
        }

        public static void g(android.view.View r2, a.nh r3, java.util.List<a.mh> r4) {
                a.mh$b r0 = j(r2)
                if (r0 == 0) goto La
                r0.a(r3, r4)
                return
            La:
                boolean r0 = r2 instanceof android.view.ViewGroup
                if (r0 == 0) goto L21
                android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                r0 = 0
            L11:
                int r1 = r2.getChildCount()
                if (r0 >= r1) goto L21
                android.view.View r1 = r2.getChildAt(r0)
                g(r1, r3, r4)
                int r0 = r0 + 1
                goto L11
            L21:
                return
        }

        public static void h(android.view.View r2, a.mh r3, a.mh.a r4) {
                a.mh$b r0 = j(r2)
                if (r0 == 0) goto L1c
                a.b9 r0 = (a.C0066b9) r0
                android.view.View r2 = r0.b
                int[] r3 = r0.e
                r2.getLocationOnScreen(r3)
                r4 = 1
                r3 = r3[r4]
                int r4 = r0.c
                int r4 = r4 - r3
                r0.d = r4
                float r3 = (float) r4
                r2.setTranslationY(r3)
                return
            L1c:
                boolean r0 = r2 instanceof android.view.ViewGroup
                if (r0 == 0) goto L33
                android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                r0 = 0
            L23:
                int r1 = r2.getChildCount()
                if (r0 >= r1) goto L33
                android.view.View r1 = r2.getChildAt(r0)
                h(r1, r3, r4)
                int r0 = r0 + 1
                goto L23
            L33:
                return
        }

        public static android.view.WindowInsets i(android.view.View r1, android.view.WindowInsets r2) {
                int r0 = androidx.core.R.id.tag_on_apply_window_listener
                java.lang.Object r0 = r1.getTag(r0)
                if (r0 == 0) goto L9
                return r2
            L9:
                android.view.WindowInsets r1 = r1.onApplyWindowInsets(r2)
                return r1
        }

        public static a.mh.b j(android.view.View r1) {
                int r0 = androidx.core.R.id.tag_window_insets_animation_callback
                java.lang.Object r1 = r1.getTag(r0)
                boolean r0 = r1 instanceof a.mh.c.a
                if (r0 == 0) goto Lf
                a.mh$c$a r1 = (a.mh.c.a) r1
                a.b9 r1 = r1.f584a
                return r1
            Lf:
                r1 = 0
                return r1
        }
    }

    public static class d extends a.mh.e {
        public final android.view.WindowInsetsAnimation e;

        public static class a extends android.view.WindowInsetsAnimation$Callback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a.C0066b9 f588a;
            public java.util.List<a.mh> b;
            public java.util.ArrayList<a.mh> c;
            public final java.util.HashMap<android.view.WindowInsetsAnimation, a.mh> d;

            public a(a.C0066b9 r2) {
                    r1 = this;
                    r0 = 0
                    r1.<init>(r0)
                    java.util.HashMap r0 = new java.util.HashMap
                    r0.<init>()
                    r1.d = r0
                    r1.f588a = r2
                    return
            }

            public final a.mh a(android.view.WindowInsetsAnimation r6) {
                    r5 = this;
                    java.util.HashMap<android.view.WindowInsetsAnimation, a.mh> r0 = r5.d
                    java.lang.Object r0 = r0.get(r6)
                    a.mh r0 = (a.mh) r0
                    if (r0 != 0) goto L25
                    a.mh r0 = new a.mh
                    r1 = 0
                    r2 = 0
                    r3 = 0
                    r0.<init>(r1, r2, r3)
                    int r1 = android.os.Build.VERSION.SDK_INT
                    r2 = 30
                    if (r1 < r2) goto L20
                    a.mh$d r1 = new a.mh$d
                    r1.<init>(r6)
                    r0.f581a = r1
                L20:
                    java.util.HashMap<android.view.WindowInsetsAnimation, a.mh> r1 = r5.d
                    r1.put(r6, r0)
                L25:
                    return r0
            }

            public final void onEnd(android.view.WindowInsetsAnimation r3) {
                    r2 = this;
                    a.b9 r0 = r2.f588a
                    r2.a(r3)
                    android.view.View r0 = r0.b
                    r1 = 0
                    r0.setTranslationY(r1)
                    java.util.HashMap<android.view.WindowInsetsAnimation, a.mh> r0 = r2.d
                    r0.remove(r3)
                    return
            }

            public final void onPrepare(android.view.WindowInsetsAnimation r3) {
                    r2 = this;
                    a.b9 r0 = r2.f588a
                    r2.a(r3)
                    android.view.View r3 = r0.b
                    int[] r1 = r0.e
                    r3.getLocationOnScreen(r1)
                    r3 = 1
                    r3 = r1[r3]
                    r0.c = r3
                    return
            }

            public final android.view.WindowInsets onProgress(android.view.WindowInsets r5, java.util.List<android.view.WindowInsetsAnimation> r6) {
                    r4 = this;
                    java.util.ArrayList<a.mh> r0 = r4.c
                    if (r0 != 0) goto L16
                    java.util.ArrayList r0 = new java.util.ArrayList
                    int r1 = r6.size()
                    r0.<init>(r1)
                    r4.c = r0
                    java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                    r4.b = r0
                    goto L19
                L16:
                    r0.clear()
                L19:
                    int r0 = r6.size()
                    int r0 = r0 + (-1)
                L1f:
                    if (r0 < 0) goto L3e
                    java.lang.Object r1 = r6.get(r0)
                    android.view.WindowInsetsAnimation r1 = a.F.j(r1)
                    a.mh r2 = r4.a(r1)
                    float r1 = a.F.s(r1)
                    a.mh$e r3 = r2.f581a
                    r3.d(r1)
                    java.util.ArrayList<a.mh> r1 = r4.c
                    r1.add(r2)
                    int r0 = r0 + (-1)
                    goto L1f
                L3e:
                    a.b9 r6 = r4.f588a
                    r0 = 0
                    a.nh r5 = a.nh.g(r0, r5)
                    java.util.List<a.mh> r0 = r4.b
                    r6.a(r5, r0)
                    android.view.WindowInsets r5 = r5.f()
                    return r5
            }

            public final android.view.WindowInsetsAnimation.Bounds onStart(android.view.WindowInsetsAnimation r5, android.view.WindowInsetsAnimation.Bounds r6) {
                    r4 = this;
                    a.b9 r0 = r4.f588a
                    r4.a(r5)
                    android.graphics.Insets r5 = a.F.u(r6)
                    a.a9 r5 = a.C0047a9.c(r5)
                    android.graphics.Insets r6 = a.F.f(r6)
                    a.a9 r6 = a.C0047a9.c(r6)
                    android.view.View r1 = r0.b
                    int[] r2 = r0.e
                    r1.getLocationOnScreen(r2)
                    r3 = 1
                    r2 = r2[r3]
                    int r3 = r0.c
                    int r3 = r3 - r2
                    r0.d = r3
                    float r0 = (float) r3
                    r1.setTranslationY(r0)
                    a.F.m()
                    android.graphics.Insets r5 = r5.d()
                    android.graphics.Insets r6 = r6.d()
                    android.view.WindowInsetsAnimation$Bounds r5 = a.F.h(r5, r6)
                    return r5
            }
        }

        public d(android.view.WindowInsetsAnimation r5) {
                r4 = this;
                r0 = 0
                r1 = 0
                r3 = 0
                r4.<init>(r3, r0, r1)
                r4.e = r5
                return
        }

        @Override // a.mh.e
        public final long a() {
                r2 = this;
                android.view.WindowInsetsAnimation r0 = r2.e
                long r0 = a.F.d(r0)
                return r0
        }

        @Override // a.mh.e
        public final float b() {
                r1 = this;
                android.view.WindowInsetsAnimation r0 = r1.e
                float r0 = a.F.a(r0)
                return r0
        }

        @Override // a.mh.e
        public final int c() {
                r1 = this;
                android.view.WindowInsetsAnimation r0 = r1.e
                int r0 = a.F.c(r0)
                return r0
        }

        @Override // a.mh.e
        public final void d(float r2) {
                r1 = this;
                android.view.WindowInsetsAnimation r0 = r1.e
                a.F.q(r0, r2)
                return
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f589a;
        public float b;
        public final android.view.animation.Interpolator c;
        public final long d;

        public e(int r1, android.view.animation.Interpolator r2, long r3) {
                r0 = this;
                r0.<init>()
                r0.f589a = r1
                r0.c = r2
                r0.d = r3
                return
        }

        public long a() {
                r2 = this;
                long r0 = r2.d
                return r0
        }

        public float b() {
                r2 = this;
                android.view.animation.Interpolator r0 = r2.c
                if (r0 == 0) goto Lb
                float r1 = r2.b
                float r0 = r0.getInterpolation(r1)
                return r0
            Lb:
                float r0 = r2.b
                return r0
        }

        public int c() {
                r1 = this;
                int r0 = r1.f589a
                return r0
        }

        public void d(float r1) {
                r0 = this;
                r0.b = r1
                return
        }
    }

    public mh(int r3, android.view.animation.Interpolator r4, long r5) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L15
            a.mh$d r0 = new a.mh$d
            android.view.WindowInsetsAnimation r3 = a.F.i(r3, r4, r5)
            r0.<init>(r3)
            r2.f581a = r0
            return
        L15:
            a.mh$c r0 = new a.mh$c
            r0.<init>(r3, r4, r5)
            r2.f581a = r0
            return
    }
}
