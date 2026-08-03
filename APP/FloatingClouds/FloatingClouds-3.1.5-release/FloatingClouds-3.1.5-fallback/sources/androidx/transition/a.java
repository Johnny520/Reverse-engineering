package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
public final class a extends androidx.transition.e {
    public static final java.lang.String[] C = null;
    public static final androidx.transition.a.C0025a D = null;
    public static final androidx.transition.a.b E = null;
    public static final androidx.transition.a.c F = null;
    public static final androidx.transition.a.d G = null;
    public static final androidx.transition.a.e H = null;

    /* JADX INFO: renamed from: androidx.transition.a$a, reason: collision with other inner class name */
    public class C0025a extends android.util.Property<androidx.transition.a.g, android.graphics.PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ android.graphics.PointF get(androidx.transition.a.g r1) {
                r0 = this;
                androidx.transition.a$g r1 = (androidx.transition.a.g) r1
                r1 = 0
                return r1
        }

        @Override // android.util.Property
        public final void set(androidx.transition.a.g r5, android.graphics.PointF r6) {
                r4 = this;
                androidx.transition.a$g r5 = (androidx.transition.a.g) r5
                android.graphics.PointF r6 = (android.graphics.PointF) r6
                r5.getClass()
                float r0 = r6.x
                int r0 = java.lang.Math.round(r0)
                r5.f1022a = r0
                float r6 = r6.y
                int r6 = java.lang.Math.round(r6)
                r5.b = r6
                int r0 = r5.f
                int r0 = r0 + 1
                r5.f = r0
                int r1 = r5.g
                if (r0 != r1) goto L31
                int r0 = r5.f1022a
                int r1 = r5.c
                int r2 = r5.d
                android.view.View r3 = r5.e
                a.Qg.a(r3, r0, r6, r1, r2)
                r6 = 0
                r5.f = r6
                r5.g = r6
            L31:
                return
        }
    }

    public class b extends android.util.Property<androidx.transition.a.g, android.graphics.PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ android.graphics.PointF get(androidx.transition.a.g r1) {
                r0 = this;
                androidx.transition.a$g r1 = (androidx.transition.a.g) r1
                r1 = 0
                return r1
        }

        @Override // android.util.Property
        public final void set(androidx.transition.a.g r5, android.graphics.PointF r6) {
                r4 = this;
                androidx.transition.a$g r5 = (androidx.transition.a.g) r5
                android.graphics.PointF r6 = (android.graphics.PointF) r6
                r5.getClass()
                float r0 = r6.x
                int r0 = java.lang.Math.round(r0)
                r5.c = r0
                float r6 = r6.y
                int r6 = java.lang.Math.round(r6)
                r5.d = r6
                int r0 = r5.g
                int r0 = r0 + 1
                r5.g = r0
                int r1 = r5.f
                if (r1 != r0) goto L31
                int r0 = r5.f1022a
                int r1 = r5.b
                int r2 = r5.c
                android.view.View r3 = r5.e
                a.Qg.a(r3, r0, r1, r2, r6)
                r6 = 0
                r5.f = r6
                r5.g = r6
            L31:
                return
        }
    }

    public class c extends android.util.Property<android.view.View, android.graphics.PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ android.graphics.PointF get(android.view.View r1) {
                r0 = this;
                android.view.View r1 = (android.view.View) r1
                r1 = 0
                return r1
        }

        @Override // android.util.Property
        public final void set(android.view.View r4, android.graphics.PointF r5) {
                r3 = this;
                android.view.View r4 = (android.view.View) r4
                android.graphics.PointF r5 = (android.graphics.PointF) r5
                int r0 = r4.getLeft()
                int r1 = r4.getTop()
                float r2 = r5.x
                int r2 = java.lang.Math.round(r2)
                float r5 = r5.y
                int r5 = java.lang.Math.round(r5)
                a.Qg.a(r4, r0, r1, r2, r5)
                return
        }
    }

    public class d extends android.util.Property<android.view.View, android.graphics.PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ android.graphics.PointF get(android.view.View r1) {
                r0 = this;
                android.view.View r1 = (android.view.View) r1
                r1 = 0
                return r1
        }

        @Override // android.util.Property
        public final void set(android.view.View r4, android.graphics.PointF r5) {
                r3 = this;
                android.view.View r4 = (android.view.View) r4
                android.graphics.PointF r5 = (android.graphics.PointF) r5
                float r0 = r5.x
                int r0 = java.lang.Math.round(r0)
                float r5 = r5.y
                int r5 = java.lang.Math.round(r5)
                int r1 = r4.getRight()
                int r2 = r4.getBottom()
                a.Qg.a(r4, r0, r5, r1, r2)
                return
        }
    }

    public class e extends android.util.Property<android.view.View, android.graphics.PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ android.graphics.PointF get(android.view.View r1) {
                r0 = this;
                android.view.View r1 = (android.view.View) r1
                r1 = 0
                return r1
        }

        @Override // android.util.Property
        public final void set(android.view.View r4, android.graphics.PointF r5) {
                r3 = this;
                android.view.View r4 = (android.view.View) r4
                android.graphics.PointF r5 = (android.graphics.PointF) r5
                float r0 = r5.x
                int r0 = java.lang.Math.round(r0)
                float r5 = r5.y
                int r5 = java.lang.Math.round(r5)
                int r1 = r4.getWidth()
                int r1 = r1 + r0
                int r2 = r4.getHeight()
                int r2 = r2 + r5
                a.Qg.a(r4, r0, r5, r1, r2)
                return
        }
    }

    public static class f extends androidx.transition.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1021a;
        public final android.view.ViewGroup b;

        public f(android.view.ViewGroup r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.f1021a = r0
                r1.b = r2
                return
        }

        @Override // androidx.transition.f, androidx.transition.e.f
        public final void c() {
                r2 = this;
                android.view.ViewGroup r0 = r2.b
                r1 = 0
                a.Ag.a(r0, r1)
                return
        }

        @Override // androidx.transition.f, androidx.transition.e.f
        public final void e(androidx.transition.e r2) {
                r1 = this;
                android.view.ViewGroup r2 = r1.b
                r0 = 0
                a.Ag.a(r2, r0)
                r2 = 1
                r1.f1021a = r2
                return
        }

        @Override // androidx.transition.f, androidx.transition.e.f
        public final void f(androidx.transition.e r3) {
                r2 = this;
                boolean r0 = r2.f1021a
                if (r0 != 0) goto La
                android.view.ViewGroup r0 = r2.b
                r1 = 0
                a.Ag.a(r0, r1)
            La:
                r3.y(r2)
                return
        }

        @Override // androidx.transition.f, androidx.transition.e.f
        public final void g() {
                r2 = this;
                android.view.ViewGroup r0 = r2.b
                r1 = 1
                a.Ag.a(r0, r1)
                return
        }
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1022a;
        public int b;
        public int c;
        public int d;
        public final android.view.View e;
        public int f;
        public int g;

        public g(android.view.View r1) {
                r0 = this;
                r0.<init>()
                r0.e = r1
                return
        }
    }

    static {
            java.lang.String r0 = "android:changeBounds:clip"
            java.lang.String r1 = "android:changeBounds:parent"
            java.lang.String r2 = "android:changeBounds:bounds"
            java.lang.String r3 = "android:changeBounds:windowX"
            java.lang.String r4 = "android:changeBounds:windowY"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1, r3, r4}
            androidx.transition.a.C = r0
            androidx.transition.a$a r0 = new androidx.transition.a$a
            java.lang.Class<android.graphics.PointF> r1 = android.graphics.PointF.class
            java.lang.String r2 = "topLeft"
            r0.<init>(r1, r2)
            androidx.transition.a.D = r0
            androidx.transition.a$b r0 = new androidx.transition.a$b
            java.lang.String r3 = "bottomRight"
            r0.<init>(r1, r3)
            androidx.transition.a.E = r0
            androidx.transition.a$c r0 = new androidx.transition.a$c
            r0.<init>(r1, r3)
            androidx.transition.a.F = r0
            androidx.transition.a$d r0 = new androidx.transition.a$d
            r0.<init>(r1, r2)
            androidx.transition.a.G = r0
            androidx.transition.a$e r0 = new androidx.transition.a$e
            java.lang.String r2 = "position"
            r0.<init>(r1, r2)
            androidx.transition.a.H = r0
            return
    }

    public static void K(a.Ff r6) {
            android.view.View r0 = r6.b
            boolean r1 = r0.isLaidOut()
            if (r1 != 0) goto L16
            int r1 = r0.getWidth()
            if (r1 != 0) goto L16
            int r1 = r0.getHeight()
            if (r1 == 0) goto L15
            goto L16
        L15:
            return
        L16:
            java.util.HashMap r1 = r6.f91a
            android.graphics.Rect r2 = new android.graphics.Rect
            int r3 = r0.getLeft()
            int r4 = r0.getTop()
            int r5 = r0.getRight()
            int r0 = r0.getBottom()
            r2.<init>(r3, r4, r5, r0)
            java.lang.String r0 = "android:changeBounds:bounds"
            r1.put(r0, r2)
            android.view.View r6 = r6.b
            android.view.ViewParent r6 = r6.getParent()
            java.lang.String r0 = "android:changeBounds:parent"
            r1.put(r0, r6)
            return
    }

    @Override // androidx.transition.e
    public final void d(a.Ff r1) {
            r0 = this;
            K(r1)
            return
    }

    @Override // androidx.transition.e
    public final void g(a.Ff r1) {
            r0 = this;
            K(r1)
            return
    }

    @Override // androidx.transition.e
    public final android.animation.Animator k(android.widget.FrameLayout r19, a.Ff r20, a.Ff r21) {
            r18 = this;
            r1 = r20
            r2 = r21
            if (r1 == 0) goto L8
            if (r2 != 0) goto Lc
        L8:
            r1 = r18
            goto L12d
        Lc:
            java.util.HashMap r1 = r1.f91a
            java.util.HashMap r6 = r2.f91a
            java.lang.String r7 = "android:changeBounds:parent"
            java.lang.Object r8 = r1.get(r7)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            java.lang.Object r7 = r6.get(r7)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            if (r8 == 0) goto L8
            if (r7 != 0) goto L23
            goto L8
        L23:
            java.lang.String r7 = "android:changeBounds:bounds"
            java.lang.Object r8 = r1.get(r7)
            android.graphics.Rect r8 = (android.graphics.Rect) r8
            java.lang.Object r7 = r6.get(r7)
            android.graphics.Rect r7 = (android.graphics.Rect) r7
            int r9 = r8.left
            int r10 = r7.left
            int r11 = r8.top
            int r12 = r7.top
            int r13 = r8.right
            int r14 = r7.right
            int r8 = r8.bottom
            int r7 = r7.bottom
            int r15 = r13 - r9
            r19 = 0
            int r4 = r8 - r11
            r16 = 1
            int r5 = r14 - r10
            int r3 = r7 - r12
            java.lang.String r0 = "android:changeBounds:clip"
            java.lang.Object r1 = r1.get(r0)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            java.lang.Object r0 = r6.get(r0)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            if (r15 == 0) goto L5f
            if (r4 != 0) goto L63
        L5f:
            if (r5 == 0) goto L74
            if (r3 == 0) goto L74
        L63:
            if (r9 != r10) goto L6b
            if (r11 == r12) goto L68
            goto L6b
        L68:
            r6 = r19
            goto L6d
        L6b:
            r6 = r16
        L6d:
            if (r13 != r14) goto L71
            if (r8 == r7) goto L76
        L71:
            int r6 = r6 + 1
            goto L76
        L74:
            r6 = r19
        L76:
            if (r1 == 0) goto L7e
            boolean r17 = r1.equals(r0)
            if (r17 == 0) goto L82
        L7e:
            if (r1 != 0) goto L84
            if (r0 == 0) goto L84
        L82:
            int r6 = r6 + 1
        L84:
            if (r6 <= 0) goto L8
            android.view.View r0 = r2.b
            a.Qg.a(r0, r9, r11, r13, r8)
            r1 = 2
            if (r6 != r1) goto Le5
            if (r15 != r5) goto La5
            if (r4 != r3) goto La5
            r1 = r18
            androidx.transition.e$a r2 = r1.v
            float r3 = (float) r9
            float r4 = (float) r11
            float r5 = (float) r10
            float r6 = (float) r12
            android.graphics.Path r2 = r2.g(r3, r4, r5, r6)
            androidx.transition.a$e r3 = androidx.transition.a.H
            android.animation.ObjectAnimator r2 = a.Sb.a(r0, r3, r2)
            goto L10d
        La5:
            r1 = r18
            androidx.transition.a$g r2 = new androidx.transition.a$g
            r2.<init>(r0)
            androidx.transition.e$a r3 = r1.v
            float r4 = (float) r9
            float r5 = (float) r11
            float r6 = (float) r10
            float r9 = (float) r12
            android.graphics.Path r3 = r3.g(r4, r5, r6, r9)
            androidx.transition.a$a r4 = androidx.transition.a.D
            android.animation.ObjectAnimator r3 = a.Sb.a(r2, r4, r3)
            androidx.transition.e$a r4 = r1.v
            float r5 = (float) r13
            float r6 = (float) r8
            float r8 = (float) r14
            float r7 = (float) r7
            android.graphics.Path r4 = r4.g(r5, r6, r8, r7)
            androidx.transition.a$b r5 = androidx.transition.a.E
            android.animation.ObjectAnimator r4 = a.Sb.a(r2, r5, r4)
            android.animation.AnimatorSet r5 = new android.animation.AnimatorSet
            r5.<init>()
            r6 = 2
            android.animation.Animator[] r6 = new android.animation.Animator[r6]
            r6[r19] = r3
            r6[r16] = r4
            r5.playTogether(r6)
            androidx.transition.b r3 = new androidx.transition.b
            r3.<init>(r2)
            r5.addListener(r3)
            r2 = r5
            goto L10d
        Le5:
            r1 = r18
            if (r9 != r10) goto Lfd
            if (r11 == r12) goto Lec
            goto Lfd
        Lec:
            androidx.transition.e$a r2 = r1.v
            float r3 = (float) r13
            float r4 = (float) r8
            float r5 = (float) r14
            float r6 = (float) r7
            android.graphics.Path r2 = r2.g(r3, r4, r5, r6)
            androidx.transition.a$c r3 = androidx.transition.a.F
            android.animation.ObjectAnimator r2 = a.Sb.a(r0, r3, r2)
            goto L10d
        Lfd:
            androidx.transition.e$a r2 = r1.v
            float r3 = (float) r9
            float r4 = (float) r11
            float r5 = (float) r10
            float r6 = (float) r12
            android.graphics.Path r2 = r2.g(r3, r4, r5, r6)
            androidx.transition.a$d r3 = androidx.transition.a.G
            android.animation.ObjectAnimator r2 = a.Sb.a(r0, r3, r2)
        L10d:
            android.view.ViewParent r3 = r0.getParent()
            boolean r3 = r3 instanceof android.view.ViewGroup
            if (r3 == 0) goto L12c
            android.view.ViewParent r0 = r0.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r3 = r16
            a.Ag.a(r0, r3)
            androidx.transition.e r3 = r1.o()
            androidx.transition.a$f r4 = new androidx.transition.a$f
            r4.<init>(r0)
            r3.a(r4)
        L12c:
            return r2
        L12d:
            r0 = 0
            return r0
    }

    @Override // androidx.transition.e
    public final java.lang.String[] q() {
            r1 = this;
            java.lang.String[] r0 = androidx.transition.a.C
            return r0
    }
}
