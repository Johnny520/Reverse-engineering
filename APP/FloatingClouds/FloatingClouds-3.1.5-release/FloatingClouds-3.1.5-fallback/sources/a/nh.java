package a;

/* JADX INFO: loaded from: classes.dex */
public final class nh {
    public static final a.nh b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.nh.k f603a;

    @android.annotation.SuppressLint({"SoonBlockedPrivateApi"})
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final java.lang.reflect.Field f604a = null;
        public static final java.lang.reflect.Field b = null;
        public static final java.lang.reflect.Field c = null;
        public static final boolean d = false;

        static {
                java.lang.Class<android.view.View> r0 = android.view.View.class
                java.lang.String r1 = "mAttachInfo"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.ReflectiveOperationException -> L2d
                a.nh.a.f604a = r0     // Catch: java.lang.ReflectiveOperationException -> L2d
                r1 = 1
                r0.setAccessible(r1)     // Catch: java.lang.ReflectiveOperationException -> L2d
                java.lang.String r0 = "android.view.View$AttachInfo"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ReflectiveOperationException -> L2d
                java.lang.String r2 = "mStableInsets"
                java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch: java.lang.ReflectiveOperationException -> L2d
                a.nh.a.b = r2     // Catch: java.lang.ReflectiveOperationException -> L2d
                r2.setAccessible(r1)     // Catch: java.lang.ReflectiveOperationException -> L2d
                java.lang.String r2 = "mContentInsets"
                java.lang.reflect.Field r0 = r0.getDeclaredField(r2)     // Catch: java.lang.ReflectiveOperationException -> L2d
                a.nh.a.c = r0     // Catch: java.lang.ReflectiveOperationException -> L2d
                r0.setAccessible(r1)     // Catch: java.lang.ReflectiveOperationException -> L2d
                a.nh.a.d = r1     // Catch: java.lang.ReflectiveOperationException -> L2d
                return
            L2d:
                r0 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Failed to get visible insets from AttachInfo "
                r1.<init>(r2)
                java.lang.String r2 = r0.getMessage()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "WindowInsetsCompat"
                android.util.Log.w(r2, r1, r0)
                return
        }
    }

    public static class b extends a.nh.e {
        public static java.lang.reflect.Field e = null;
        public static boolean f = false;
        public static java.lang.reflect.Constructor<android.view.WindowInsets> g = null;
        public static boolean h = false;
        public android.view.WindowInsets c;
        public a.C0047a9 d;

        public b() {
                r1 = this;
                r1.<init>()
                android.view.WindowInsets r0 = i()
                r1.c = r0
                return
        }

        public b(a.nh r1) {
                r0 = this;
                r0.<init>(r1)
                android.view.WindowInsets r1 = r1.f()
                r0.c = r1
                return
        }

        private static android.view.WindowInsets i() {
                boolean r0 = a.nh.b.f
                r1 = 1
                java.lang.Class<android.view.WindowInsets> r2 = android.view.WindowInsets.class
                java.lang.String r3 = "WindowInsetsCompat"
                if (r0 != 0) goto L1a
                java.lang.String r0 = "CONSUMED"
                java.lang.reflect.Field r0 = r2.getDeclaredField(r0)     // Catch: java.lang.ReflectiveOperationException -> L12
                a.nh.b.e = r0     // Catch: java.lang.ReflectiveOperationException -> L12
                goto L18
            L12:
                r0 = move-exception
                java.lang.String r4 = "Could not retrieve WindowInsets.CONSUMED field"
                android.util.Log.i(r3, r4, r0)
            L18:
                a.nh.b.f = r1
            L1a:
                java.lang.reflect.Field r0 = a.nh.b.e
                r4 = 0
                if (r0 == 0) goto L33
                java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.ReflectiveOperationException -> L2d
                android.view.WindowInsets r0 = (android.view.WindowInsets) r0     // Catch: java.lang.ReflectiveOperationException -> L2d
                if (r0 == 0) goto L33
                android.view.WindowInsets r5 = new android.view.WindowInsets     // Catch: java.lang.ReflectiveOperationException -> L2d
                r5.<init>(r0)     // Catch: java.lang.ReflectiveOperationException -> L2d
                return r5
            L2d:
                r0 = move-exception
                java.lang.String r5 = "Could not get value from WindowInsets.CONSUMED field"
                android.util.Log.i(r3, r5, r0)
            L33:
                boolean r0 = a.nh.b.h
                if (r0 != 0) goto L4c
                java.lang.Class<android.graphics.Rect> r0 = android.graphics.Rect.class
                java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch: java.lang.ReflectiveOperationException -> L44
                java.lang.reflect.Constructor r0 = r2.getConstructor(r0)     // Catch: java.lang.ReflectiveOperationException -> L44
                a.nh.b.g = r0     // Catch: java.lang.ReflectiveOperationException -> L44
                goto L4a
            L44:
                r0 = move-exception
                java.lang.String r2 = "Could not retrieve WindowInsets(Rect) constructor"
                android.util.Log.i(r3, r2, r0)
            L4a:
                a.nh.b.h = r1
            L4c:
                java.lang.reflect.Constructor<android.view.WindowInsets> r0 = a.nh.b.g
                if (r0 == 0) goto L66
                android.graphics.Rect r1 = new android.graphics.Rect     // Catch: java.lang.ReflectiveOperationException -> L60
                r1.<init>()     // Catch: java.lang.ReflectiveOperationException -> L60
                java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.ReflectiveOperationException -> L60
                java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.ReflectiveOperationException -> L60
                android.view.WindowInsets r0 = (android.view.WindowInsets) r0     // Catch: java.lang.ReflectiveOperationException -> L60
                return r0
            L60:
                r0 = move-exception
                java.lang.String r1 = "Could not invoke WindowInsets(Rect) constructor"
                android.util.Log.i(r3, r1, r0)
            L66:
                return r4
        }

        @Override // a.nh.e
        public a.nh b() {
                r3 = this;
                r3.a()
                android.view.WindowInsets r0 = r3.c
                r1 = 0
                a.nh r0 = a.nh.g(r1, r0)
                a.a9[] r1 = r3.b
                a.nh$k r2 = r0.f603a
                r2.o(r1)
                a.a9 r1 = r3.d
                r2.q(r1)
                return r0
        }

        @Override // a.nh.e
        public void e(a.C0047a9 r1) {
                r0 = this;
                r0.d = r1
                return
        }

        @Override // a.nh.e
        public void g(a.C0047a9 r5) {
                r4 = this;
                android.view.WindowInsets r0 = r4.c
                if (r0 == 0) goto L12
                int r1 = r5.f399a
                int r2 = r5.c
                int r3 = r5.d
                int r5 = r5.b
                android.view.WindowInsets r5 = r0.replaceSystemWindowInsets(r1, r5, r2, r3)
                r4.c = r5
            L12:
                return
        }
    }

    public static class c extends a.nh.e {
        public final android.view.WindowInsets.Builder c;

        public c() {
                r1 = this;
                r1.<init>()
                android.view.WindowInsets$Builder r0 = a.E.f()
                r1.c = r0
                return
        }

        public c(a.nh r1) {
                r0 = this;
                r0.<init>(r1)
                android.view.WindowInsets r1 = r1.f()
                if (r1 == 0) goto Le
                android.view.WindowInsets$Builder r1 = a.oh.b(r1)
                goto L12
            Le:
                android.view.WindowInsets$Builder r1 = a.E.f()
            L12:
                r0.c = r1
                return
        }

        @Override // a.nh.e
        public a.nh b() {
                r3 = this;
                r3.a()
                android.view.WindowInsets$Builder r0 = r3.c
                android.view.WindowInsets r0 = a.E.g(r0)
                r1 = 0
                a.nh r0 = a.nh.g(r1, r0)
                a.a9[] r1 = r3.b
                a.nh$k r2 = r0.f603a
                r2.o(r1)
                return r0
        }

        @Override // a.nh.e
        public void d(a.C0047a9 r2) {
                r1 = this;
                android.view.WindowInsets$Builder r0 = r1.c
                android.graphics.Insets r2 = r2.d()
                a.E.C(r0, r2)
                return
        }

        @Override // a.nh.e
        public void e(a.C0047a9 r2) {
                r1 = this;
                android.view.WindowInsets$Builder r0 = r1.c
                android.graphics.Insets r2 = r2.d()
                a.E.u(r0, r2)
                return
        }

        @Override // a.nh.e
        public void f(a.C0047a9 r2) {
                r1 = this;
                android.view.WindowInsets$Builder r0 = r1.c
                android.graphics.Insets r2 = r2.d()
                a.E.z(r0, r2)
                return
        }

        @Override // a.nh.e
        public void g(a.C0047a9 r2) {
                r1 = this;
                android.view.WindowInsets$Builder r0 = r1.c
                android.graphics.Insets r2 = r2.d()
                a.E.n(r0, r2)
                return
        }

        @Override // a.nh.e
        public void h(a.C0047a9 r2) {
                r1 = this;
                android.view.WindowInsets$Builder r0 = r1.c
                android.graphics.Insets r2 = r2.d()
                a.E.D(r0, r2)
                return
        }
    }

    public static class d extends a.nh.c {
        public d() {
                r0 = this;
                r0.<init>()
                return
        }

        public d(a.nh r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // a.nh.e
        public void c(int r2, a.C0047a9 r3) {
                r1 = this;
                android.view.WindowInsets$Builder r0 = r1.c
                int r2 = a.nh.m.a(r2)
                android.graphics.Insets r3 = r3.d()
                a.F.p(r0, r2, r3)
                return
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a.nh f605a;
        public a.C0047a9[] b;

        public e() {
                r1 = this;
                a.nh r0 = new a.nh
                r0.<init>()
                r1.<init>(r0)
                return
        }

        public e(a.nh r1) {
                r0 = this;
                r0.<init>()
                r0.f605a = r1
                return
        }

        public final void a() {
                r5 = this;
                a.a9[] r0 = r5.b
                if (r0 == 0) goto L51
                r1 = 0
                r1 = r0[r1]
                r2 = 1
                r0 = r0[r2]
                a.nh r3 = r5.f605a
                if (r0 != 0) goto L15
                a.nh$k r0 = r3.f603a
                r4 = 2
                a.a9 r0 = r0.f(r4)
            L15:
                if (r1 != 0) goto L1d
                a.nh$k r1 = r3.f603a
                a.a9 r1 = r1.f(r2)
            L1d:
                a.a9 r0 = a.C0047a9.a(r1, r0)
                r5.g(r0)
                a.a9[] r0 = r5.b
                r1 = 16
                int r1 = a.nh.l.a(r1)
                r0 = r0[r1]
                if (r0 == 0) goto L33
                r5.f(r0)
            L33:
                a.a9[] r0 = r5.b
                r1 = 32
                int r1 = a.nh.l.a(r1)
                r0 = r0[r1]
                if (r0 == 0) goto L42
                r5.d(r0)
            L42:
                a.a9[] r0 = r5.b
                r1 = 64
                int r1 = a.nh.l.a(r1)
                r0 = r0[r1]
                if (r0 == 0) goto L51
                r5.h(r0)
            L51:
                return
        }

        public a.nh b() {
                r0 = this;
                r0 = 0
                throw r0
        }

        public void c(int r4, a.C0047a9 r5) {
                r3 = this;
                a.a9[] r0 = r3.b
                if (r0 != 0) goto La
                r0 = 9
                a.a9[] r0 = new a.C0047a9[r0]
                r3.b = r0
            La:
                r0 = 1
            Lb:
                r1 = 256(0x100, float:3.59E-43)
                if (r0 > r1) goto L1f
                r1 = r4 & r0
                if (r1 != 0) goto L14
                goto L1c
            L14:
                a.a9[] r1 = r3.b
                int r2 = a.nh.l.a(r0)
                r1[r2] = r5
            L1c:
                int r0 = r0 << 1
                goto Lb
            L1f:
                return
        }

        public void d(a.C0047a9 r1) {
                r0 = this;
                return
        }

        public void e(a.C0047a9 r1) {
                r0 = this;
                r0 = 0
                throw r0
        }

        public void f(a.C0047a9 r1) {
                r0 = this;
                return
        }

        public void g(a.C0047a9 r1) {
                r0 = this;
                r0 = 0
                throw r0
        }

        public void h(a.C0047a9 r1) {
                r0 = this;
                return
        }
    }

    public static class f extends a.nh.k {
        public static boolean h = false;
        public static java.lang.reflect.Method i;
        public static java.lang.Class<?> j;
        public static java.lang.reflect.Field k;
        public static java.lang.reflect.Field l;
        public final android.view.WindowInsets c;
        public a.C0047a9[] d;
        public a.C0047a9 e;
        public a.nh f;
        public a.C0047a9 g;

        public f(a.nh r1, android.view.WindowInsets r2) {
                r0 = this;
                r0.<init>(r1)
                r1 = 0
                r0.e = r1
                r0.c = r2
                return
        }

        @android.annotation.SuppressLint({"WrongConstant"})
        private a.C0047a9 r(int r4, boolean r5) {
                r3 = this;
                a.a9 r0 = a.C0047a9.e
                r1 = 1
            L3:
                r2 = 256(0x100, float:3.59E-43)
                if (r1 > r2) goto L17
                r2 = r4 & r1
                if (r2 != 0) goto Lc
                goto L14
            Lc:
                a.a9 r2 = r3.s(r1, r5)
                a.a9 r0 = a.C0047a9.a(r0, r2)
            L14:
                int r1 = r1 << 1
                goto L3
            L17:
                return r0
        }

        private a.C0047a9 t() {
                r1 = this;
                a.nh r0 = r1.f
                if (r0 == 0) goto Lb
                a.nh$k r0 = r0.f603a
                a.a9 r0 = r0.h()
                return r0
            Lb:
                a.a9 r0 = a.C0047a9.e
                return r0
        }

        private a.C0047a9 u(android.view.View r6) {
                r5 = this;
                java.lang.String r0 = "WindowInsetsCompat"
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 30
                if (r1 >= r2) goto L63
                boolean r1 = a.nh.f.h
                if (r1 != 0) goto Lf
                v()
            Lf:
                java.lang.reflect.Method r1 = a.nh.f.i
                r2 = 0
                if (r1 == 0) goto L62
                java.lang.Class<?> r3 = a.nh.f.j
                if (r3 == 0) goto L62
                java.lang.reflect.Field r3 = a.nh.f.k
                if (r3 != 0) goto L1d
                goto L62
            L1d:
                java.lang.Object r6 = r1.invoke(r6, r2)     // Catch: java.lang.ReflectiveOperationException -> L2e
                if (r6 != 0) goto L30
                java.lang.String r6 = "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden"
                java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch: java.lang.ReflectiveOperationException -> L2e
                r1.<init>()     // Catch: java.lang.ReflectiveOperationException -> L2e
                android.util.Log.w(r0, r6, r1)     // Catch: java.lang.ReflectiveOperationException -> L2e
                return r2
            L2e:
                r6 = move-exception
                goto L4d
            L30:
                java.lang.reflect.Field r1 = a.nh.f.l     // Catch: java.lang.ReflectiveOperationException -> L2e
                java.lang.Object r6 = r1.get(r6)     // Catch: java.lang.ReflectiveOperationException -> L2e
                java.lang.reflect.Field r1 = a.nh.f.k     // Catch: java.lang.ReflectiveOperationException -> L2e
                java.lang.Object r6 = r1.get(r6)     // Catch: java.lang.ReflectiveOperationException -> L2e
                android.graphics.Rect r6 = (android.graphics.Rect) r6     // Catch: java.lang.ReflectiveOperationException -> L2e
                if (r6 == 0) goto L62
                int r1 = r6.left     // Catch: java.lang.ReflectiveOperationException -> L2e
                int r3 = r6.top     // Catch: java.lang.ReflectiveOperationException -> L2e
                int r4 = r6.right     // Catch: java.lang.ReflectiveOperationException -> L2e
                int r6 = r6.bottom     // Catch: java.lang.ReflectiveOperationException -> L2e
                a.a9 r6 = a.C0047a9.b(r1, r3, r4, r6)     // Catch: java.lang.ReflectiveOperationException -> L2e
                return r6
            L4d:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r3 = "Failed to get visible insets. (Reflection error). "
                r1.<init>(r3)
                java.lang.String r3 = r6.getMessage()
                r1.append(r3)
                java.lang.String r1 = r1.toString()
                android.util.Log.e(r0, r1, r6)
            L62:
                return r2
            L63:
                java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead."
                r6.<init>(r0)
                throw r6
        }

        @android.annotation.SuppressLint({"PrivateApi"})
        private static void v() {
                r0 = 1
                java.lang.Class<android.view.View> r1 = android.view.View.class
                java.lang.String r2 = "getViewRootImpl"
                r3 = 0
                java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.ReflectiveOperationException -> L35
                a.nh.f.i = r1     // Catch: java.lang.ReflectiveOperationException -> L35
                java.lang.String r1 = "android.view.View$AttachInfo"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ReflectiveOperationException -> L35
                a.nh.f.j = r1     // Catch: java.lang.ReflectiveOperationException -> L35
                java.lang.String r2 = "mVisibleInsets"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.ReflectiveOperationException -> L35
                a.nh.f.k = r1     // Catch: java.lang.ReflectiveOperationException -> L35
                java.lang.String r1 = "android.view.ViewRootImpl"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ReflectiveOperationException -> L35
                java.lang.String r2 = "mAttachInfo"
                java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.ReflectiveOperationException -> L35
                a.nh.f.l = r1     // Catch: java.lang.ReflectiveOperationException -> L35
                java.lang.reflect.Field r1 = a.nh.f.k     // Catch: java.lang.ReflectiveOperationException -> L35
                r1.setAccessible(r0)     // Catch: java.lang.ReflectiveOperationException -> L35
                java.lang.reflect.Field r1 = a.nh.f.l     // Catch: java.lang.ReflectiveOperationException -> L35
                r1.setAccessible(r0)     // Catch: java.lang.ReflectiveOperationException -> L35
                goto L4d
            L35:
                r1 = move-exception
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "Failed to get visible insets. (Reflection error). "
                r2.<init>(r3)
                java.lang.String r3 = r1.getMessage()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "WindowInsetsCompat"
                android.util.Log.e(r3, r2, r1)
            L4d:
                a.nh.f.h = r0
                return
        }

        @Override // a.nh.k
        public void d(android.view.View r1) {
                r0 = this;
                a.a9 r1 = r0.u(r1)
                if (r1 != 0) goto L8
                a.a9 r1 = a.C0047a9.e
            L8:
                r0.w(r1)
                return
        }

        @Override // a.nh.k
        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = super.equals(r2)
                if (r0 != 0) goto L8
                r2 = 0
                return r2
            L8:
                a.nh$f r2 = (a.nh.f) r2
                a.a9 r0 = r1.g
                a.a9 r2 = r2.g
                boolean r2 = java.util.Objects.equals(r0, r2)
                return r2
        }

        @Override // a.nh.k
        public a.C0047a9 f(int r2) {
                r1 = this;
                r0 = 0
                a.a9 r2 = r1.r(r2, r0)
                return r2
        }

        @Override // a.nh.k
        public final a.C0047a9 j() {
                r4 = this;
                a.a9 r0 = r4.e
                if (r0 != 0) goto L1c
                android.view.WindowInsets r0 = r4.c
                int r1 = r0.getSystemWindowInsetLeft()
                int r2 = r0.getSystemWindowInsetTop()
                int r3 = r0.getSystemWindowInsetRight()
                int r0 = r0.getSystemWindowInsetBottom()
                a.a9 r0 = a.C0047a9.b(r1, r2, r3, r0)
                r4.e = r0
            L1c:
                a.a9 r0 = r4.e
                return r0
        }

        @Override // a.nh.k
        public a.nh l(int r4, int r5, int r6, int r7) {
                r3 = this;
                r0 = 0
                android.view.WindowInsets r1 = r3.c
                a.nh r0 = a.nh.g(r0, r1)
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 30
                if (r1 < r2) goto L13
                a.nh$d r1 = new a.nh$d
                r1.<init>(r0)
                goto L22
            L13:
                r2 = 29
                if (r1 < r2) goto L1d
                a.nh$c r1 = new a.nh$c
                r1.<init>(r0)
                goto L22
            L1d:
                a.nh$b r1 = new a.nh$b
                r1.<init>(r0)
            L22:
                a.a9 r0 = r3.j()
                a.a9 r0 = a.nh.e(r0, r4, r5, r6, r7)
                r1.g(r0)
                a.a9 r0 = r3.h()
                a.a9 r4 = a.nh.e(r0, r4, r5, r6, r7)
                r1.e(r4)
                a.nh r4 = r1.b()
                return r4
        }

        @Override // a.nh.k
        public boolean n() {
                r1 = this;
                android.view.WindowInsets r0 = r1.c
                boolean r0 = r0.isRound()
                return r0
        }

        @Override // a.nh.k
        public void o(a.C0047a9[] r1) {
                r0 = this;
                r0.d = r1
                return
        }

        @Override // a.nh.k
        public void p(a.nh r1) {
                r0 = this;
                r0.f = r1
                return
        }

        public a.C0047a9 s(int r5, boolean r6) {
                r4 = this;
                r0 = 1
                r1 = 0
                if (r5 == r0) goto Ld7
                r0 = 2
                r2 = 0
                if (r5 == r0) goto L8f
                r6 = 8
                a.a9 r0 = a.C0047a9.e
                if (r5 == r6) goto L57
                r6 = 16
                if (r5 == r6) goto L52
                r6 = 32
                if (r5 == r6) goto L4d
                r6 = 64
                if (r5 == r6) goto L48
                r6 = 128(0x80, float:1.8E-43)
                if (r5 == r6) goto L1f
                return r0
            L1f:
                a.nh r5 = r4.f
                if (r5 == 0) goto L2a
                a.nh$k r5 = r5.f603a
                a.m5 r5 = r5.e()
                goto L2e
            L2a:
                a.m5 r5 = r4.e()
            L2e:
                if (r5 == 0) goto L47
                android.view.DisplayCutout r5 = r5.f572a
                int r6 = a.C0260m5.a.d(r5)
                int r0 = a.C0260m5.a.f(r5)
                int r1 = a.C0260m5.a.e(r5)
                int r5 = a.C0260m5.a.c(r5)
                a.a9 r5 = a.C0047a9.b(r6, r0, r1, r5)
                return r5
            L47:
                return r0
            L48:
                a.a9 r5 = r4.k()
                return r5
            L4d:
                a.a9 r5 = r4.g()
                return r5
            L52:
                a.a9 r5 = r4.i()
                return r5
            L57:
                a.a9[] r5 = r4.d
                if (r5 == 0) goto L61
                int r6 = a.nh.l.a(r6)
                r2 = r5[r6]
            L61:
                if (r2 == 0) goto L64
                return r2
            L64:
                a.a9 r5 = r4.j()
                a.a9 r6 = r4.t()
                int r5 = r5.d
                int r2 = r6.d
                if (r5 <= r2) goto L77
                a.a9 r5 = a.C0047a9.b(r1, r1, r1, r5)
                return r5
            L77:
                a.a9 r5 = r4.g
                if (r5 == 0) goto L8e
                boolean r5 = r5.equals(r0)
                if (r5 != 0) goto L8e
                a.a9 r5 = r4.g
                int r5 = r5.d
                int r6 = r6.d
                if (r5 <= r6) goto L8e
                a.a9 r5 = a.C0047a9.b(r1, r1, r1, r5)
                return r5
            L8e:
                return r0
            L8f:
                if (r6 == 0) goto Lb6
                a.a9 r5 = r4.t()
                a.a9 r6 = r4.h()
                int r0 = r5.f399a
                int r2 = r6.f399a
                int r0 = java.lang.Math.max(r0, r2)
                int r2 = r5.c
                int r3 = r6.c
                int r2 = java.lang.Math.max(r2, r3)
                int r5 = r5.d
                int r6 = r6.d
                int r5 = java.lang.Math.max(r5, r6)
                a.a9 r5 = a.C0047a9.b(r0, r1, r2, r5)
                return r5
            Lb6:
                a.a9 r5 = r4.j()
                a.nh r6 = r4.f
                if (r6 == 0) goto Lc4
                a.nh$k r6 = r6.f603a
                a.a9 r2 = r6.h()
            Lc4:
                int r6 = r5.d
                if (r2 == 0) goto Lce
                int r0 = r2.d
                int r6 = java.lang.Math.min(r6, r0)
            Lce:
                int r0 = r5.f399a
                int r5 = r5.c
                a.a9 r5 = a.C0047a9.b(r0, r1, r5, r6)
                return r5
            Ld7:
                if (r6 == 0) goto Lee
                a.a9 r5 = r4.t()
                int r5 = r5.b
                a.a9 r6 = r4.j()
                int r6 = r6.b
                int r5 = java.lang.Math.max(r5, r6)
                a.a9 r5 = a.C0047a9.b(r1, r5, r1, r1)
                return r5
            Lee:
                a.a9 r5 = r4.j()
                int r5 = r5.b
                a.a9 r5 = a.C0047a9.b(r1, r5, r1, r1)
                return r5
        }

        public void w(a.C0047a9 r1) {
                r0 = this;
                r0.g = r1
                return
        }
    }

    public static class g extends a.nh.f {
        public a.C0047a9 m;

        public g(a.nh r1, android.view.WindowInsets r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.m = r1
                return
        }

        @Override // a.nh.k
        public a.nh b() {
                r2 = this;
                android.view.WindowInsets r0 = r2.c
                android.view.WindowInsets r0 = r0.consumeStableInsets()
                r1 = 0
                a.nh r0 = a.nh.g(r1, r0)
                return r0
        }

        @Override // a.nh.k
        public a.nh c() {
                r2 = this;
                android.view.WindowInsets r0 = r2.c
                android.view.WindowInsets r0 = r0.consumeSystemWindowInsets()
                r1 = 0
                a.nh r0 = a.nh.g(r1, r0)
                return r0
        }

        @Override // a.nh.k
        public final a.C0047a9 h() {
                r4 = this;
                a.a9 r0 = r4.m
                if (r0 != 0) goto L1c
                android.view.WindowInsets r0 = r4.c
                int r1 = r0.getStableInsetLeft()
                int r2 = r0.getStableInsetTop()
                int r3 = r0.getStableInsetRight()
                int r0 = r0.getStableInsetBottom()
                a.a9 r0 = a.C0047a9.b(r1, r2, r3, r0)
                r4.m = r0
            L1c:
                a.a9 r0 = r4.m
                return r0
        }

        @Override // a.nh.k
        public boolean m() {
                r1 = this;
                android.view.WindowInsets r0 = r1.c
                boolean r0 = r0.isConsumed()
                return r0
        }

        @Override // a.nh.k
        public void q(a.C0047a9 r1) {
                r0 = this;
                r0.m = r1
                return
        }
    }

    public static class h extends a.nh.g {
        public h(a.nh r1, android.view.WindowInsets r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // a.nh.k
        public a.nh a() {
                r2 = this;
                android.view.WindowInsets r0 = r2.c
                android.view.WindowInsets r0 = r0.consumeDisplayCutout()
                r1 = 0
                a.nh r0 = a.nh.g(r1, r0)
                return r0
        }

        @Override // a.nh.k
        public a.C0260m5 e() {
                r2 = this;
                android.view.WindowInsets r0 = r2.c
                android.view.DisplayCutout r0 = r0.getDisplayCutout()
                if (r0 != 0) goto La
                r0 = 0
                return r0
            La:
                a.m5 r1 = new a.m5
                r1.<init>(r0)
                return r1
        }

        @Override // a.nh.f, a.nh.k
        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof a.nh.h
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                a.nh$h r5 = (a.nh.h) r5
                android.view.WindowInsets r1 = r5.c
                android.view.WindowInsets r3 = r4.c
                boolean r1 = java.util.Objects.equals(r3, r1)
                if (r1 == 0) goto L21
                a.a9 r1 = r4.g
                a.a9 r5 = r5.g
                boolean r5 = java.util.Objects.equals(r1, r5)
                if (r5 == 0) goto L21
                return r0
            L21:
                return r2
        }

        @Override // a.nh.k
        public int hashCode() {
                r1 = this;
                android.view.WindowInsets r0 = r1.c
                int r0 = r0.hashCode()
                return r0
        }
    }

    public static class i extends a.nh.h {
        public a.C0047a9 n;
        public a.C0047a9 o;
        public a.C0047a9 p;

        public i(a.nh r1, android.view.WindowInsets r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.n = r1
                r0.o = r1
                r0.p = r1
                return
        }

        @Override // a.nh.k
        public a.C0047a9 g() {
                r1 = this;
                a.a9 r0 = r1.o
                if (r0 != 0) goto L10
                android.view.WindowInsets r0 = r1.c
                android.graphics.Insets r0 = a.oh.d(r0)
                a.a9 r0 = a.C0047a9.c(r0)
                r1.o = r0
            L10:
                a.a9 r0 = r1.o
                return r0
        }

        @Override // a.nh.k
        public a.C0047a9 i() {
                r1 = this;
                a.a9 r0 = r1.n
                if (r0 != 0) goto L10
                android.view.WindowInsets r0 = r1.c
                android.graphics.Insets r0 = a.oh.e(r0)
                a.a9 r0 = a.C0047a9.c(r0)
                r1.n = r0
            L10:
                a.a9 r0 = r1.n
                return r0
        }

        @Override // a.nh.k
        public a.C0047a9 k() {
                r1 = this;
                a.a9 r0 = r1.p
                if (r0 != 0) goto L10
                android.view.WindowInsets r0 = r1.c
                android.graphics.Insets r0 = a.oh.a(r0)
                a.a9 r0 = a.C0047a9.c(r0)
                r1.p = r0
            L10:
                a.a9 r0 = r1.p
                return r0
        }

        @Override // a.nh.f, a.nh.k
        public a.nh l(int r2, int r3, int r4, int r5) {
                r1 = this;
                android.view.WindowInsets r0 = r1.c
                android.view.WindowInsets r2 = a.oh.c(r0, r2, r3, r4, r5)
                r3 = 0
                a.nh r2 = a.nh.g(r3, r2)
                return r2
        }

        @Override // a.nh.g, a.nh.k
        public void q(a.C0047a9 r1) {
                r0 = this;
                return
        }
    }

    public static class j extends a.nh.i {
        public static final a.nh q = null;

        static {
                android.view.WindowInsets r0 = a.F.g()
                r1 = 0
                a.nh r0 = a.nh.g(r1, r0)
                a.nh.j.q = r0
                return
        }

        public j(a.nh r1, android.view.WindowInsets r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // a.nh.f, a.nh.k
        public final void d(android.view.View r1) {
                r0 = this;
                return
        }

        @Override // a.nh.f, a.nh.k
        public a.C0047a9 f(int r2) {
                r1 = this;
                android.view.WindowInsets r0 = r1.c
                int r2 = a.nh.m.a(r2)
                android.graphics.Insets r2 = a.F.e(r0, r2)
                a.a9 r2 = a.C0047a9.c(r2)
                return r2
        }
    }

    public static class k {
        public static final a.nh b = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a.nh f606a;

        static {
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 30
                if (r0 < r1) goto Lc
                a.nh$d r0 = new a.nh$d
                r0.<init>()
                goto L1b
            Lc:
                r1 = 29
                if (r0 < r1) goto L16
                a.nh$c r0 = new a.nh$c
                r0.<init>()
                goto L1b
            L16:
                a.nh$b r0 = new a.nh$b
                r0.<init>()
            L1b:
                a.nh r0 = r0.b()
                a.nh$k r0 = r0.f603a
                a.nh r0 = r0.a()
                a.nh$k r0 = r0.f603a
                a.nh r0 = r0.b()
                a.nh$k r0 = r0.f603a
                a.nh r0 = r0.c()
                a.nh.k.b = r0
                return
        }

        public k(a.nh r1) {
                r0 = this;
                r0.<init>()
                r0.f606a = r1
                return
        }

        public a.nh a() {
                r1 = this;
                a.nh r0 = r1.f606a
                return r0
        }

        public a.nh b() {
                r1 = this;
                a.nh r0 = r1.f606a
                return r0
        }

        public a.nh c() {
                r1 = this;
                a.nh r0 = r1.f606a
                return r0
        }

        public void d(android.view.View r1) {
                r0 = this;
                return
        }

        public a.C0260m5 e() {
                r1 = this;
                r0 = 0
                return r0
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof a.nh.k
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                a.nh$k r5 = (a.nh.k) r5
                boolean r1 = r4.n()
                boolean r3 = r5.n()
                if (r1 != r3) goto L4b
                boolean r1 = r4.m()
                boolean r3 = r5.m()
                if (r1 != r3) goto L4b
                a.a9 r1 = r4.j()
                a.a9 r3 = r5.j()
                boolean r1 = java.util.Objects.equals(r1, r3)
                if (r1 == 0) goto L4b
                a.a9 r1 = r4.h()
                a.a9 r3 = r5.h()
                boolean r1 = java.util.Objects.equals(r1, r3)
                if (r1 == 0) goto L4b
                a.m5 r1 = r4.e()
                a.m5 r5 = r5.e()
                boolean r5 = java.util.Objects.equals(r1, r5)
                if (r5 == 0) goto L4b
                return r0
            L4b:
                return r2
        }

        public a.C0047a9 f(int r1) {
                r0 = this;
                a.a9 r1 = a.C0047a9.e
                return r1
        }

        public a.C0047a9 g() {
                r1 = this;
                a.a9 r0 = r1.j()
                return r0
        }

        public a.C0047a9 h() {
                r1 = this;
                a.a9 r0 = a.C0047a9.e
                return r0
        }

        public int hashCode() {
                r5 = this;
                boolean r0 = r5.n()
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                boolean r1 = r5.m()
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                a.a9 r2 = r5.j()
                a.a9 r3 = r5.h()
                a.m5 r4 = r5.e()
                java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2, r3, r4}
                int r0 = java.util.Objects.hash(r0)
                return r0
        }

        public a.C0047a9 i() {
                r1 = this;
                a.a9 r0 = r1.j()
                return r0
        }

        public a.C0047a9 j() {
                r1 = this;
                a.a9 r0 = a.C0047a9.e
                return r0
        }

        public a.C0047a9 k() {
                r1 = this;
                a.a9 r0 = r1.j()
                return r0
        }

        public a.nh l(int r1, int r2, int r3, int r4) {
                r0 = this;
                a.nh r1 = a.nh.k.b
                return r1
        }

        public boolean m() {
                r1 = this;
                r0 = 0
                return r0
        }

        public boolean n() {
                r1 = this;
                r0 = 0
                return r0
        }

        public void o(a.C0047a9[] r1) {
                r0 = this;
                return
        }

        public void p(a.nh r1) {
                r0 = this;
                return
        }

        public void q(a.C0047a9 r1) {
                r0 = this;
                return
        }
    }

    public static final class l {
        public static int a(int r3) {
                r0 = 1
                if (r3 == r0) goto L39
                r1 = 2
                if (r3 == r1) goto L38
                r0 = 4
                if (r3 == r0) goto L37
                r1 = 8
                if (r3 == r1) goto L35
                r2 = 16
                if (r3 == r2) goto L34
                r0 = 32
                if (r3 == r0) goto L32
                r0 = 64
                if (r3 == r0) goto L30
                r0 = 128(0x80, float:1.8E-43)
                if (r3 == r0) goto L2e
                r0 = 256(0x100, float:3.59E-43)
                if (r3 != r0) goto L22
                return r1
            L22:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "type needs to be >= FIRST and <= LAST, type="
                java.lang.String r3 = a.C0487z.e(r1, r3)
                r0.<init>(r3)
                throw r0
            L2e:
                r3 = 7
                return r3
            L30:
                r3 = 6
                return r3
            L32:
                r3 = 5
                return r3
            L34:
                return r0
            L35:
                r3 = 3
                return r3
            L37:
                return r1
            L38:
                return r0
            L39:
                r3 = 0
                return r3
        }
    }

    public static final class m {
        public static int a(int r4) {
                r0 = 0
                r1 = 1
                r2 = r1
            L3:
                r3 = 256(0x100, float:3.59E-43)
                if (r2 > r3) goto L54
                r3 = r4 & r2
                if (r3 == 0) goto L51
                if (r2 == r1) goto L4c
                r3 = 2
                if (r2 == r3) goto L47
                r3 = 4
                if (r2 == r3) goto L42
                r3 = 8
                if (r2 == r3) goto L3d
                r3 = 16
                if (r2 == r3) goto L38
                r3 = 32
                if (r2 == r3) goto L33
                r3 = 64
                if (r2 == r3) goto L2e
                r3 = 128(0x80, float:1.8E-43)
                if (r2 == r3) goto L28
                goto L51
            L28:
                int r3 = a.F.C()
            L2c:
                r0 = r0 | r3
                goto L51
            L2e:
                int r3 = a.F.B()
                goto L2c
            L33:
                int r3 = a.F.A()
                goto L2c
            L38:
                int r3 = a.F.z()
                goto L2c
            L3d:
                int r3 = a.F.y()
                goto L2c
            L42:
                int r3 = a.F.x()
                goto L2c
            L47:
                int r3 = a.F.t()
                goto L2c
            L4c:
                int r3 = a.F.b()
                goto L2c
            L51:
                int r2 = r2 << 1
                goto L3
            L54:
                return r0
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            a.nh r0 = a.nh.j.q
            a.nh.b = r0
            return
        Lb:
            a.nh r0 = a.nh.k.b
            a.nh.b = r0
            return
    }

    public nh() {
            r1 = this;
            r1.<init>()
            a.nh$k r0 = new a.nh$k
            r0.<init>(r1)
            r1.f603a = r0
            return
    }

    public nh(android.view.WindowInsets r3) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L11
            a.nh$j r0 = new a.nh$j
            r0.<init>(r2, r3)
            r2.f603a = r0
            return
        L11:
            r1 = 29
            if (r0 < r1) goto L1d
            a.nh$i r0 = new a.nh$i
            r0.<init>(r2, r3)
            r2.f603a = r0
            return
        L1d:
            a.nh$h r0 = new a.nh$h
            r0.<init>(r2, r3)
            r2.f603a = r0
            return
    }

    public static a.C0047a9 e(a.C0047a9 r5, int r6, int r7, int r8, int r9) {
            int r0 = r5.f399a
            int r0 = r0 - r6
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            int r2 = r5.b
            int r2 = r2 - r7
            int r2 = java.lang.Math.max(r1, r2)
            int r3 = r5.c
            int r3 = r3 - r8
            int r3 = java.lang.Math.max(r1, r3)
            int r4 = r5.d
            int r4 = r4 - r9
            int r1 = java.lang.Math.max(r1, r4)
            if (r0 != r6) goto L26
            if (r2 != r7) goto L26
            if (r3 != r8) goto L26
            if (r1 != r9) goto L26
            return r5
        L26:
            a.a9 r5 = a.C0047a9.b(r0, r2, r3, r1)
            return r5
    }

    public static a.nh g(android.view.View r2, android.view.WindowInsets r3) {
            a.nh r0 = new a.nh
            r3.getClass()
            r0.<init>(r3)
            if (r2 == 0) goto L22
            boolean r3 = r2.isAttachedToWindow()
            if (r3 == 0) goto L22
            java.util.WeakHashMap<android.view.View, a.Jg> r3 = a.C0414ug.f721a
            a.nh r3 = a.C0414ug.e.a(r2)
            a.nh$k r1 = r0.f603a
            r1.p(r3)
            android.view.View r2 = r2.getRootView()
            r1.d(r2)
        L22:
            return r0
    }

    @java.lang.Deprecated
    public final int a() {
            r1 = this;
            a.nh$k r0 = r1.f603a
            a.a9 r0 = r0.j()
            int r0 = r0.d
            return r0
    }

    @java.lang.Deprecated
    public final int b() {
            r1 = this;
            a.nh$k r0 = r1.f603a
            a.a9 r0 = r0.j()
            int r0 = r0.f399a
            return r0
    }

    @java.lang.Deprecated
    public final int c() {
            r1 = this;
            a.nh$k r0 = r1.f603a
            a.a9 r0 = r0.j()
            int r0 = r0.c
            return r0
    }

    @java.lang.Deprecated
    public final int d() {
            r1 = this;
            a.nh$k r0 = r1.f603a
            a.a9 r0 = r0.j()
            int r0 = r0.b
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof a.nh
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            a.nh r2 = (a.nh) r2
            a.nh$k r2 = r2.f603a
            a.nh$k r0 = r1.f603a
            boolean r2 = java.util.Objects.equals(r0, r2)
            return r2
    }

    public final android.view.WindowInsets f() {
            r2 = this;
            a.nh$k r0 = r2.f603a
            boolean r1 = r0 instanceof a.nh.f
            if (r1 == 0) goto Lb
            a.nh$f r0 = (a.nh.f) r0
            android.view.WindowInsets r0 = r0.c
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public final int hashCode() {
            r1 = this;
            a.nh$k r0 = r1.f603a
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.hashCode()
            return r0
    }
}
