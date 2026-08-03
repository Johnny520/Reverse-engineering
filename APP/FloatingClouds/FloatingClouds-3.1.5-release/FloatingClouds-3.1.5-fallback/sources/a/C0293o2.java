package a;

/* JADX INFO: renamed from: a.o2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0293o2 implements top.mmjz.floatingclouds.plugin.IPlugin {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f615a;
    public volatile java.lang.Object b;
    public final java.util.LinkedHashSet c;
    public final java.util.HashMap<android.widget.TextView, java.lang.Float> d;
    public final android.os.Handler e;
    public volatile java.lang.Runnable f;
    public volatile int g;
    public volatile long h;

    /* JADX INFO: renamed from: a.o2$a */
    public static final class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.C0293o2 f616a;

        public a(a.C0293o2 r1) {
                r0 = this;
                r0.<init>()
                r0.f616a = r1
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r5 = this;
                a.o2 r0 = r5.f616a
                java.lang.Runnable r0 = r0.f
                if (r5 == r0) goto L7
                return
            L7:
                a.x8 r0 = a.C0460x8.f762a
                boolean r0 = a.C0460x8.a()
                r1 = 5000(0x1388, double:2.4703E-320)
                if (r0 == 0) goto L19
                a.o2 r0 = r5.f616a
                android.os.Handler r0 = r0.e
                r0.postDelayed(r5, r1)
                return
            L19:
                a.o2 r0 = r5.f616a
                int r0 = r0.g
                a.o2 r3 = r5.f616a
                r4 = 1
                int r0 = r0 + r4
                r3.g = r0
                a.o2 r0 = r5.f616a
                int r0 = r0.g
                r3 = 60
                if (r0 > r3) goto L2d
                r1 = 1000(0x3e8, double:4.94E-321)
            L2d:
                a.o2 r0 = r5.f616a
                r0.getClass()
                boolean r0 = a.C0293o2.e()
                if (r0 == 0) goto L9b
                a.o2 r0 = r5.f616a
                boolean r0 = r0.f615a
                if (r0 != 0) goto L3f
                goto L9b
            L3f:
                a.o2 r0 = r5.f616a
                r0.l()
                a.o2 r0 = r5.f616a
                java.util.LinkedHashSet r0 = r0.c
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L8e
                a.o2 r0 = r5.f616a
                r0.k()
                a.o2 r0 = r5.f616a
                r0.j()
                a.o2 r0 = r5.f616a
                int r0 = r0.g
                if (r0 > r3) goto L61
                java.lang.String r0 = "fast"
                goto L63
            L61:
                java.lang.String r0 = "slow"
            L63:
                a.o2 r1 = r5.f616a
                int r1 = r1.g
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "BoldBottomTab: DB checker: all read, bold reset (after "
                r2.<init>(r3)
                r2.append(r1)
                java.lang.String r1 = " checks, "
                r2.append(r1)
                r2.append(r0)
                java.lang.String r0 = ")"
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                java.lang.Object[] r0 = new java.lang.Object[]{r0}
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)
                a.C0453x1.b(r0)
                return
            L8e:
                a.o2 r0 = r5.f616a
                r0.k()
                a.o2 r0 = r5.f616a
                android.os.Handler r0 = r0.e
                r0.postDelayed(r5, r1)
                return
            L9b:
                a.o2 r0 = r5.f616a
                r0.j()
                return
        }
    }

    public C0293o2() {
            r2 = this;
            r2.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r2.c = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.d = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.e = r0
            return
    }

    public static void b(android.view.ViewGroup r4, java.util.ArrayList r5) {
            int r0 = r4.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L1f
            android.view.View r2 = r4.getChildAt(r1)
            boolean r3 = r2 instanceof android.widget.TextView
            if (r3 == 0) goto L13
            r5.add(r2)
            goto L1c
        L13:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1c
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            b(r2, r5)
        L1c:
            int r1 = r1 + 1
            goto L5
        L1f:
            return
    }

    public static java.util.ArrayList c(java.lang.Object r8) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.lang.Class r2 = r8.getClass()     // Catch: java.lang.Throwable -> L6e
        Le:
            if (r2 == 0) goto L75
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            boolean r3 = r2.equals(r3)     // Catch: java.lang.Throwable -> L6e
            if (r3 != 0) goto L75
            java.lang.reflect.Field[] r3 = r2.getDeclaredFields()     // Catch: java.lang.Throwable -> L6e
            a.G1 r3 = a.C0435w1.I(r3)     // Catch: java.lang.Throwable -> L6e
        L20:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L6e
            if (r4 == 0) goto L70
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L6e
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4     // Catch: java.lang.Throwable -> L6e
            int r5 = r4.getModifiers()     // Catch: java.lang.Throwable -> L6e
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)     // Catch: java.lang.Throwable -> L6e
            if (r5 != 0) goto L20
            r5 = 1
            r4.setAccessible(r5)     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r4 = r4.get(r8)     // Catch: java.lang.Throwable -> L3f
            goto L44
        L3f:
            r4 = move-exception
            a.wd$a r4 = a.C0465xd.a(r4)     // Catch: java.lang.Throwable -> L6e
        L44:
            boolean r5 = r4 instanceof a.C0447wd.a     // Catch: java.lang.Throwable -> L6e
            if (r5 == 0) goto L49
            r4 = 0
        L49:
            if (r4 != 0) goto L4c
            goto L20
        L4c:
            boolean r5 = r4 instanceof android.view.View     // Catch: java.lang.Throwable -> L6e
            if (r5 != 0) goto L20
            java.lang.Class r5 = r4.getClass()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r6 = "android."
            r7 = 0
            boolean r6 = a.Ae.H(r5, r6, r7)     // Catch: java.lang.Throwable -> L6e
            if (r6 != 0) goto L20
            java.lang.String r6 = "java."
            boolean r5 = a.Ae.H(r5, r6, r7)     // Catch: java.lang.Throwable -> L6e
            if (r5 == 0) goto L6a
            goto L20
        L6a:
            d(r4, r0, r1)     // Catch: java.lang.Throwable -> L6e
            goto L20
        L6e:
            r8 = move-exception
            goto L87
        L70:
            java.lang.Class r2 = r2.getSuperclass()     // Catch: java.lang.Throwable -> L6e
            goto Le
        L75:
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6e
            if (r1 == 0) goto L84
            boolean r1 = r8 instanceof android.view.ViewGroup     // Catch: java.lang.Throwable -> L6e
            if (r1 == 0) goto L84
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8     // Catch: java.lang.Throwable -> L6e
            b(r8, r0)     // Catch: java.lang.Throwable -> L6e
        L84:
            a.Wf r8 = a.Wf.f330a     // Catch: java.lang.Throwable -> L6e
            goto L8a
        L87:
            a.C0465xd.a(r8)
        L8a:
            return r0
    }

    public static void d(java.lang.Object r4, java.util.ArrayList r5, java.util.HashSet r6) {
            java.lang.Class r0 = r4.getClass()     // Catch: java.lang.Throwable -> L58
        L4:
            if (r0 == 0) goto L55
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r0.equals(r1)     // Catch: java.lang.Throwable -> L58
            if (r1 != 0) goto L55
            java.lang.reflect.Field[] r1 = r0.getDeclaredFields()     // Catch: java.lang.Throwable -> L58
            a.G1 r1 = a.C0435w1.I(r1)     // Catch: java.lang.Throwable -> L58
        L16:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L58
            if (r2 == 0) goto L50
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L58
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2     // Catch: java.lang.Throwable -> L58
            int r3 = r2.getModifiers()     // Catch: java.lang.Throwable -> L58
            boolean r3 = java.lang.reflect.Modifier.isStatic(r3)     // Catch: java.lang.Throwable -> L58
            if (r3 != 0) goto L16
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.Throwable -> L58
            java.lang.Object r2 = r2.get(r4)     // Catch: java.lang.Throwable -> L35
            goto L3a
        L35:
            r2 = move-exception
            a.wd$a r2 = a.C0465xd.a(r2)     // Catch: java.lang.Throwable -> L58
        L3a:
            boolean r3 = r2 instanceof a.C0447wd.a     // Catch: java.lang.Throwable -> L58
            if (r3 == 0) goto L3f
            r2 = 0
        L3f:
            if (r2 != 0) goto L42
            goto L16
        L42:
            boolean r3 = r2 instanceof android.widget.TextView     // Catch: java.lang.Throwable -> L58
            if (r3 == 0) goto L16
            boolean r3 = r6.add(r2)     // Catch: java.lang.Throwable -> L58
            if (r3 == 0) goto L16
            r5.add(r2)     // Catch: java.lang.Throwable -> L58
            goto L16
        L50:
            java.lang.Class r0 = r0.getSuperclass()     // Catch: java.lang.Throwable -> L58
            goto L4
        L55:
            a.Wf r4 = a.Wf.f330a     // Catch: java.lang.Throwable -> L58
            goto L5c
        L58:
            r4 = move-exception
            a.C0465xd.a(r4)
        L5c:
            return
    }

    public static boolean e() {
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            boolean r0 = a.K3.a.l()
            if (r0 == 0) goto L15
            a.jc r0 = a.K3.a.i()
            boolean r0 = r0.F
            if (r0 == 0) goto L15
            r0 = 1
            return r0
        L15:
            r0 = 0
            return r0
    }

    public final void a(java.lang.Object r5, int r6, int r7) {
            r4 = this;
            java.util.ArrayList r0 = c(r5)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L7e
            float r5 = (float) r6
            r6 = 1025758986(0x3d23d70a, float:0.04)
            float r6 = r6 * r5
            r7 = 1120403456(0x42c80000, float:100.0)
            float r6 = r6 / r7
            r7 = 994352038(0x3b449ba6, float:0.003)
            float r5 = r5 * r7
            r7 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 + r7
            java.util.Iterator r7 = r0.iterator()
        L1d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L95
            java.lang.Object r0 = r7.next()
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.util.HashMap<android.widget.TextView, java.lang.Float> r1 = r4.d
            boolean r2 = r1.containsKey(r0)     // Catch: java.lang.Throwable -> L3d
            if (r2 != 0) goto L3f
            float r2 = r0.getTextSize()     // Catch: java.lang.Throwable -> L3d
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch: java.lang.Throwable -> L3d
            r1.put(r0, r2)     // Catch: java.lang.Throwable -> L3d
            goto L3f
        L3d:
            r0 = move-exception
            goto L7a
        L3f:
            android.text.TextPaint r2 = r0.getPaint()     // Catch: java.lang.Throwable -> L3d
            android.graphics.Paint$Style r3 = android.graphics.Paint.Style.FILL_AND_STROKE     // Catch: java.lang.Throwable -> L3d
            r2.setStyle(r3)     // Catch: java.lang.Throwable -> L3d
            android.text.TextPaint r2 = r0.getPaint()     // Catch: java.lang.Throwable -> L3d
            float r3 = r0.getTextSize()     // Catch: java.lang.Throwable -> L3d
            float r3 = r3 * r6
            r2.setStrokeWidth(r3)     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L3d
            java.lang.Float r1 = (java.lang.Float) r1     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L61
            float r1 = r1.floatValue()     // Catch: java.lang.Throwable -> L3d
            goto L65
        L61:
            float r1 = r0.getTextSize()     // Catch: java.lang.Throwable -> L3d
        L65:
            float r1 = r1 * r5
            android.content.res.Resources r2 = r0.getResources()     // Catch: java.lang.Throwable -> L3d
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()     // Catch: java.lang.Throwable -> L3d
            float r2 = r2.scaledDensity     // Catch: java.lang.Throwable -> L3d
            float r1 = r1 / r2
            r0.setTextSize(r1)     // Catch: java.lang.Throwable -> L3d
            r0.invalidate()     // Catch: java.lang.Throwable -> L3d
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L3d
            goto L1d
        L7a:
            a.C0465xd.a(r0)
            goto L1d
        L7e:
            if (r7 <= 0) goto L95
            boolean r0 = r5 instanceof android.view.View
            if (r0 == 0) goto L88
            r0 = r5
            android.view.View r0 = (android.view.View) r0
            goto L89
        L88:
            r0 = 0
        L89:
            if (r0 == 0) goto L95
            a.n2 r1 = new a.n2
            r1.<init>(r4, r5, r6, r7)
            r5 = 500(0x1f4, double:2.47E-321)
            r0.postDelayed(r1, r5)
        L95:
            return
    }

    public final void f(java.lang.String r7) {
            r6 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r6.h
            long r2 = r0 - r2
            r4 = 30000(0x7530, double:1.4822E-319)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto Lf
            return
        Lf:
            r6.h = r0
            java.lang.String r0 = "BoldBottomTab: syncFromDb skip: "
            java.lang.String r7 = a.C0487z.k(r0, r7)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            a.C0282n9.B(r7)
            return
    }

    public final void g() {
            r5 = this;
            r0 = 1
            a.K3$a r1 = a.K3.f148a
            r1.getClass()
            a.jc r1 = a.K3.a.i()
            int r1 = r1.G
            r2 = 0
            r3 = 100
            int r1 = a.Oc.C(r1, r2, r3)
            if (r1 > 0) goto L16
            goto L3d
        L16:
            r5.f615a = r0
            java.lang.Object r2 = r5.b
            if (r2 != 0) goto L1d
            goto L3d
        L1d:
            boolean r3 = r2 instanceof android.view.View     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L27
            r3 = r2
            android.view.View r3 = (android.view.View) r3     // Catch: java.lang.Throwable -> L25
            goto L28
        L25:
            r0 = move-exception
            goto L3a
        L27:
            r3 = 0
        L28:
            if (r3 == 0) goto L33
            a.k0 r4 = new a.k0     // Catch: java.lang.Throwable -> L25
            r4.<init>(r5, r2, r1, r0)     // Catch: java.lang.Throwable -> L25
            r3.post(r4)     // Catch: java.lang.Throwable -> L25
            return
        L33:
            r0 = 3
            r5.a(r2, r1, r0)     // Catch: java.lang.Throwable -> L25
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L25
            return
        L3a:
            a.C0465xd.a(r0)
        L3d:
            return
    }

    public final void h() {
            r4 = this;
            boolean r0 = e()
            if (r0 == 0) goto L43
            boolean r0 = r4.f615a
            if (r0 != 0) goto Lb
            goto L43
        Lb:
            r4.l()
            java.util.LinkedHashSet r0 = r4.c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L2b
            r4.k()
            r4.j()
            java.lang.String r0 = "BoldBottomTab: read-report recheck: all read, bold reset"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r1 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            a.C0453x1.b(r0)
            return
        L2b:
            r4.k()
            r4.j()
            r0 = 0
            r4.g = r0
            a.u5 r0 = new a.u5
            r1 = 2
            r0.<init>(r4, r1)
            r4.f = r0
            android.os.Handler r1 = r4.e
            r2 = 400(0x190, double:1.976E-321)
            r1.postDelayed(r0, r2)
        L43:
            return
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(a.J8 r11) {
            r10 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            java.lang.String r3 = "F025"
            java.lang.String r4 = "com.tencent.mm.ui.LauncherUI"
            java.lang.String r5 = "session"
            a.C0193i9.e(r11, r5)
            java.lang.String r5 = "com.tencent.mm.ui.LauncherUIBottomTabView"
            java.lang.ClassLoader r6 = r11.f136a
            java.lang.Class r5 = a.A1.b(r6, r5)
            if (r5 != 0) goto L24
            java.lang.String r11 = "BoldBottomTab: LauncherUIBottomTabView not found"
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r1)
            a.C0453x1.e(r11)
            return
        L24:
            java.lang.reflect.Constructor[] r5 = r5.getDeclaredConstructors()     // Catch: java.lang.Throwable -> L48
            a.G1 r5 = a.C0435w1.I(r5)     // Catch: java.lang.Throwable -> L48
        L2c:
            boolean r7 = r5.hasNext()     // Catch: java.lang.Throwable -> L48
            if (r7 == 0) goto L4a
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L48
            java.lang.reflect.Constructor r7 = (java.lang.reflect.Constructor) r7     // Catch: java.lang.Throwable -> L48
            r7.setAccessible(r1)     // Catch: java.lang.Throwable -> L48
            io.github.libxposed.api.XposedInterface$HookBuilder r7 = r11.f(r7)     // Catch: java.lang.Throwable -> L48
            a.m2 r8 = new a.m2     // Catch: java.lang.Throwable -> L48
            r8.<init>(r2, r10)     // Catch: java.lang.Throwable -> L48
            r7.intercept(r8)     // Catch: java.lang.Throwable -> L48
            goto L2c
        L48:
            r5 = move-exception
            goto L4d
        L4a:
            a.Wf r5 = a.Wf.f330a     // Catch: java.lang.Throwable -> L48
            goto L50
        L4d:
            a.C0465xd.a(r5)
        L50:
            a.j2 r5 = new a.j2
            r5.<init>(r2, r10)
            a.C0086ca.b(r5)
            java.lang.String r5 = "onResume"
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L84
            a.k2 r7 = new a.k2     // Catch: java.lang.Throwable -> L84
            r7.<init>(r10, r1)     // Catch: java.lang.Throwable -> L84
            a.J8.a(r11, r4, r5, r2, r7)     // Catch: java.lang.Throwable -> L84
            java.lang.String r2 = "onCreate"
            java.lang.Class<android.os.Bundle> r5 = android.os.Bundle.class
            java.lang.Class[] r5 = new java.lang.Class[]{r5}     // Catch: java.lang.Throwable -> L84
            a.k2 r7 = new a.k2     // Catch: java.lang.Throwable -> L84
            r7.<init>(r10, r0)     // Catch: java.lang.Throwable -> L84
            a.J8.a(r11, r4, r2, r5, r7)     // Catch: java.lang.Throwable -> L84
            java.lang.String r2 = "BoldBottomTab: hooked LauncherUI.onResume + onCreate"
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L84
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r1)     // Catch: java.lang.Throwable -> L84
            a.C0453x1.b(r2)     // Catch: java.lang.Throwable -> L84
            a.Wf r2 = a.Wf.f330a     // Catch: java.lang.Throwable -> L84
            goto L89
        L84:
            r2 = move-exception
            a.wd$a r2 = a.C0465xd.a(r2)
        L89:
            java.lang.Throwable r2 = a.C0447wd.a(r2)
            if (r2 == 0) goto La4
            java.lang.String r2 = r2.getMessage()
            java.lang.String r4 = "BoldBottomTab: hookLauncherResume fail: "
            java.lang.String r2 = a.C0487z.k(r4, r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r1)
            a.C0453x1.a(r2)
        La4:
            java.lang.String r2 = "."
            a.Pc r4 = a.Pc.f211a     // Catch: java.lang.Throwable -> Lc3
            r4.getClass()     // Catch: java.lang.Throwable -> Lc3
            java.util.List r4 = a.Pc.a(r6)     // Catch: java.lang.Throwable -> Lc3
            boolean r5 = r4.isEmpty()     // Catch: java.lang.Throwable -> Lc3
            if (r5 == 0) goto Lc6
            java.lang.String r5 = "BoldBottomTab: read-report locator empty, polling-only mode"
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> Lc3
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r1)     // Catch: java.lang.Throwable -> Lc3
            a.C0453x1.b(r5)     // Catch: java.lang.Throwable -> Lc3
            goto Lc6
        Lc3:
            r11 = move-exception
            goto L14b
        Lc6:
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> Lc3
        Lca:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> Lc3
            if (r5 == 0) goto L133
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> Lc3
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch: java.lang.Throwable -> Lc3
            a.k2 r6 = new a.k2     // Catch: java.lang.Throwable -> Lc3
            r7 = 3
            r6.<init>(r10, r7)     // Catch: java.lang.Throwable -> Lc3
            a.J8.h(r11, r3, r5, r6)     // Catch: java.lang.Throwable -> Lc3
            java.util.concurrent.ConcurrentHashMap<java.lang.String, a.F8> r6 = a.E8.f71a     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r6 = "readReport"
            java.lang.Class r7 = r5.getDeclaringClass()     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r7 = r7.getName()     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r8 = r5.getName()     // Catch: java.lang.Throwable -> Lc3
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc3
            r9.<init>()     // Catch: java.lang.Throwable -> Lc3
            r9.append(r7)     // Catch: java.lang.Throwable -> Lc3
            r9.append(r2)     // Catch: java.lang.Throwable -> Lc3
            r9.append(r8)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r7 = r9.toString()     // Catch: java.lang.Throwable -> Lc3
            a.E8.b(r3, r6, r7)     // Catch: java.lang.Throwable -> Lc3
            java.lang.Class r6 = r5.getDeclaringClass()     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> Lc3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc3
            r7.<init>()     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r8 = "BoldBottomTab: hooked read-report trigger "
            r7.append(r8)     // Catch: java.lang.Throwable -> Lc3
            r7.append(r6)     // Catch: java.lang.Throwable -> Lc3
            r7.append(r2)     // Catch: java.lang.Throwable -> Lc3
            r7.append(r5)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r5 = r7.toString()     // Catch: java.lang.Throwable -> Lc3
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> Lc3
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r1)     // Catch: java.lang.Throwable -> Lc3
            a.C0453x1.b(r5)     // Catch: java.lang.Throwable -> Lc3
            goto Lca
        L133:
            java.lang.Thread r2 = new java.lang.Thread     // Catch: java.lang.Throwable -> Lc3
            a.P0 r3 = new a.P0     // Catch: java.lang.Throwable -> Lc3
            r3.<init>(r10, r0, r11)     // Catch: java.lang.Throwable -> Lc3
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r11 = "ReadReportStorageHook"
            r2.setName(r11)     // Catch: java.lang.Throwable -> Lc3
            r2.setDaemon(r1)     // Catch: java.lang.Throwable -> Lc3
            r2.start()     // Catch: java.lang.Throwable -> Lc3
            a.Wf r11 = a.Wf.f330a     // Catch: java.lang.Throwable -> Lc3
            goto L14f
        L14b:
            a.wd$a r11 = a.C0465xd.a(r11)
        L14f:
            java.lang.Throwable r11 = a.C0447wd.a(r11)
            if (r11 == 0) goto L16a
            java.lang.String r11 = r11.getMessage()
            java.lang.String r0 = "BoldBottomTab: hookReadReport fail: "
            java.lang.String r11 = a.C0487z.k(r0, r11)
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r1)
            a.C0453x1.a(r11)
        L16a:
            java.lang.String r11 = "BoldBottomTab: handleHook DONE (event-bus mode)"
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r1)
            a.C0453x1.b(r11)
            return
    }

    public final void i() {
            r4 = this;
            r4.j()
            r0 = 0
            r4.g = r0
            a.o2$a r0 = new a.o2$a
            r0.<init>(r4)
            r4.f = r0
            android.os.Handler r1 = r4.e
            r2 = 1000(0x3e8, double:4.94E-321)
            r1.postDelayed(r0, r2)
            return
    }

    public final void j() {
            r2 = this;
            java.lang.Runnable r0 = r2.f
            if (r0 == 0) goto L9
            android.os.Handler r1 = r2.e
            r1.removeCallbacks(r0)
        L9:
            r0 = 0
            r2.f = r0
            return
    }

    public final void k() {
            r4 = this;
            java.util.LinkedHashSet r0 = r4.c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L10
            boolean r0 = e()
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            boolean r1 = r4.f615a
            if (r0 != r1) goto L16
            goto L36
        L16:
            r4.f615a = r0
            if (r0 == 0) goto L1e
            r4.g()
            return
        L1e:
            java.lang.Object r0 = r4.b
            if (r0 == 0) goto L36
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L2a
            r1 = r0
            android.view.View r1 = (android.view.View) r1
            goto L2b
        L2a:
            r1 = 0
        L2b:
            if (r1 == 0) goto L36
            a.P0 r2 = new a.P0
            r3 = 1
            r2.<init>(r4, r3, r0)
            r1.post(r2)
        L36:
            return
    }

    public final void l() {
            r9 = this;
            a.K3$a r0 = a.K3.f148a     // Catch: java.lang.Throwable -> L15
            r0.getClass()     // Catch: java.lang.Throwable -> L15
            java.util.ArrayList r0 = a.K3.a.f()     // Catch: java.lang.Throwable -> L15
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L18
            java.util.LinkedHashSet r0 = r9.c     // Catch: java.lang.Throwable -> L15
            r0.clear()     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r0 = move-exception
            goto L16b
        L18:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L15
            r2 = 10
            int r2 = a.C0312p3.g0(r0, r2)     // Catch: java.lang.Throwable -> L15
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L15
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L15
        L27:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L3b
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L15
            top.mmjz.floatingclouds.bean.MaskItemBean r2 = (top.mmjz.floatingclouds.bean.MaskItemBean) r2     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = r2.getMaskId()     // Catch: java.lang.Throwable -> L15
            r1.add(r2)     // Catch: java.lang.Throwable -> L15
            goto L27
        L3b:
            java.util.Set r0 = a.C0383t3.A0(r1)     // Catch: java.lang.Throwable -> L15
            java.util.concurrent.ConcurrentHashMap<java.lang.String, a.G4> r1 = a.xh.f764a     // Catch: java.lang.Throwable -> L15
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = "<get-entries>(...)"
            a.C0193i9.d(r1, r2)     // Catch: java.lang.Throwable -> L15
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L15
        L4e:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L15
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L71
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L15
            r5 = r2
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> L15
            java.lang.Object r5 = r5.getKey()     // Catch: java.lang.Throwable -> L15
            java.lang.String r6 = "<get-key>(...)"
            a.C0193i9.d(r5, r6)     // Catch: java.lang.Throwable -> L15
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch: java.lang.Throwable -> L15
            java.lang.String r6 = "EnMicroMsg"
            boolean r5 = a.Be.I(r5, r6, r3)     // Catch: java.lang.Throwable -> L15
            if (r5 == 0) goto L4e
            goto L72
        L71:
            r2 = r4
        L72:
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L80
            java.lang.Object r1 = r2.getValue()     // Catch: java.lang.Throwable -> L15
            a.G4 r1 = (a.G4) r1     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L80
            java.lang.Object r4 = r1.f96a     // Catch: java.lang.Throwable -> L15
        L80:
            java.lang.String r1 = ")"
            if (r4 != 0) goto La2
            java.util.concurrent.ConcurrentHashMap<java.lang.String, a.G4> r0 = a.xh.f764a     // Catch: java.lang.Throwable -> L15
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L15
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15
            r2.<init>()     // Catch: java.lang.Throwable -> L15
            java.lang.String r3 = "EnMicroMsg not in Store (size="
            r2.append(r3)     // Catch: java.lang.Throwable -> L15
            r2.append(r0)     // Catch: java.lang.Throwable -> L15
            r2.append(r1)     // Catch: java.lang.Throwable -> L15
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L15
            r9.f(r0)     // Catch: java.lang.Throwable -> L15
            return
        La2:
            java.lang.String r2 = ","
            a.g2 r5 = new a.g2     // Catch: java.lang.Throwable -> L15
            r6 = 2
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L15
            r6 = 30
            java.lang.String r2 = a.C0383t3.p0(r0, r2, r5, r6)     // Catch: java.lang.Throwable -> L15
            java.util.concurrent.ConcurrentHashMap<java.lang.String, a.G4> r5 = a.xh.f764a     // Catch: java.lang.Throwable -> L15
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15
            r5.<init>()     // Catch: java.lang.Throwable -> L15
            java.lang.String r6 = "SELECT username, unReadCount FROM rconversation WHERE username IN ("
            r5.append(r6)     // Catch: java.lang.Throwable -> L15
            r5.append(r2)     // Catch: java.lang.Throwable -> L15
            r5.append(r1)     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L15
            java.lang.String[] r5 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L15
            java.lang.Object[] r0 = r0.toArray(r5)     // Catch: java.lang.Throwable -> L15
            android.database.Cursor r0 = a.xh.a.a(r4, r2, r0)     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto Ld8
            java.lang.String r0 = "rawQuery returned null"
            r9.f(r0)     // Catch: java.lang.Throwable -> L15
            return
        Ld8:
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L15
            r2.<init>()     // Catch: java.lang.Throwable -> L15
            java.lang.String r4 = "username"
            int r4 = r0.getColumnIndex(r4)     // Catch: java.lang.Throwable -> L10a
            int r5 = r0.getColumnCount()     // Catch: java.lang.Throwable -> L10a
            r6 = r3
        Le8:
            if (r6 >= r5) goto L10c
            java.lang.String r7 = r0.getColumnName(r6)     // Catch: java.lang.Throwable -> L10a
            java.lang.String r8 = "getColumnName(...)"
            a.C0193i9.d(r7, r8)     // Catch: java.lang.Throwable -> L10a
            java.util.Locale r8 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L10a
            java.lang.String r7 = r7.toLowerCase(r8)     // Catch: java.lang.Throwable -> L10a
            java.lang.String r8 = "toLowerCase(...)"
            a.C0193i9.d(r7, r8)     // Catch: java.lang.Throwable -> L10a
            java.lang.String r8 = "unread"
            boolean r7 = a.Be.I(r7, r8, r3)     // Catch: java.lang.Throwable -> L10a
            if (r7 == 0) goto L107
            goto L10d
        L107:
            int r6 = r6 + 1
            goto Le8
        L10a:
            r1 = move-exception
            goto L165
        L10c:
            r6 = -1
        L10d:
            if (r4 < 0) goto L142
            if (r6 >= 0) goto L112
            goto L142
        L112:
            boolean r1 = r0.moveToNext()     // Catch: java.lang.Throwable -> L10a
            if (r1 == 0) goto L129
            java.lang.String r1 = r0.getString(r4)     // Catch: java.lang.Throwable -> L10a
            if (r1 != 0) goto L11f
            goto L112
        L11f:
            int r3 = r0.getInt(r6)     // Catch: java.lang.Throwable -> L10a
            if (r3 <= 0) goto L112
            r2.add(r1)     // Catch: java.lang.Throwable -> L10a
            goto L112
        L129:
            a.Wf r1 = a.Wf.f330a     // Catch: java.lang.Throwable -> L10a
            r0.close()     // Catch: java.lang.Throwable -> L15
            r0 = 0
            r9.h = r0     // Catch: java.lang.Throwable -> L15
            java.util.LinkedHashSet r0 = r9.c     // Catch: java.lang.Throwable -> L15
            r0.clear()     // Catch: java.lang.Throwable -> L15
            java.util.LinkedHashSet r0 = r9.c     // Catch: java.lang.Throwable -> L15
            boolean r0 = r0.addAll(r2)     // Catch: java.lang.Throwable -> L15
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L15
            goto L16f
        L142:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10a
            r2.<init>()     // Catch: java.lang.Throwable -> L10a
            java.lang.String r3 = "column not found (user="
            r2.append(r3)     // Catch: java.lang.Throwable -> L10a
            r2.append(r4)     // Catch: java.lang.Throwable -> L10a
            java.lang.String r3 = " unread="
            r2.append(r3)     // Catch: java.lang.Throwable -> L10a
            r2.append(r6)     // Catch: java.lang.Throwable -> L10a
            r2.append(r1)     // Catch: java.lang.Throwable -> L10a
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L10a
            r9.f(r1)     // Catch: java.lang.Throwable -> L10a
            r0.close()     // Catch: java.lang.Throwable -> L15
            return
        L165:
            throw r1     // Catch: java.lang.Throwable -> L166
        L166:
            r2 = move-exception
            a.C0435w1.e(r0, r1)     // Catch: java.lang.Throwable -> L15
            throw r2     // Catch: java.lang.Throwable -> L15
        L16b:
            a.wd$a r0 = a.C0465xd.a(r0)
        L16f:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L180
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L17d
            java.lang.String r0 = "unknown"
        L17d:
            r9.f(r0)
        L180:
            return
    }
}
