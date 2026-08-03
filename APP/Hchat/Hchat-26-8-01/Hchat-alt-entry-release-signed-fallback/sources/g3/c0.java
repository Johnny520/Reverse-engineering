package g3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends g3.g0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static java.lang.reflect.Field f4188e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f4189f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static java.lang.reflect.Constructor f4190g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f4191h = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public android.view.WindowInsets f4192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b3.a f4193d;

    public c0() {
            r1 = this;
            r1.<init>()
            android.view.WindowInsets r0 = i()
            r1.f4192c = r0
            return
    }

    public c0(g3.r0 r1) {
            r0 = this;
            r0.<init>(r1)
            android.view.WindowInsets r1 = r1.b()
            r0.f4192c = r1
            return
    }

    private static android.view.WindowInsets i() {
            boolean r0 = g3.c0.f4189f
            r1 = 1
            java.lang.Class<android.view.WindowInsets> r2 = android.view.WindowInsets.class
            java.lang.String r3 = "WindowInsetsCompat"
            if (r0 != 0) goto L1a
            java.lang.String r0 = "CONSUMED"
            java.lang.reflect.Field r0 = r2.getDeclaredField(r0)     // Catch: java.lang.ReflectiveOperationException -> L12
            g3.c0.f4188e = r0     // Catch: java.lang.ReflectiveOperationException -> L12
            goto L18
        L12:
            r0 = move-exception
            java.lang.String r4 = "Could not retrieve WindowInsets.CONSUMED field"
            android.util.Log.i(r3, r4, r0)
        L18:
            g3.c0.f4189f = r1
        L1a:
            java.lang.reflect.Field r0 = g3.c0.f4188e
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
            boolean r0 = g3.c0.f4191h
            if (r0 != 0) goto L4c
            java.lang.Class<android.graphics.Rect> r0 = android.graphics.Rect.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch: java.lang.ReflectiveOperationException -> L44
            java.lang.reflect.Constructor r0 = r2.getConstructor(r0)     // Catch: java.lang.ReflectiveOperationException -> L44
            g3.c0.f4190g = r0     // Catch: java.lang.ReflectiveOperationException -> L44
            goto L4a
        L44:
            r0 = move-exception
            java.lang.String r2 = "Could not retrieve WindowInsets(Rect) constructor"
            android.util.Log.i(r3, r2, r0)
        L4a:
            g3.c0.f4191h = r1
        L4c:
            java.lang.reflect.Constructor r0 = g3.c0.f4190g
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

    @Override // g3.g0
    public g3.r0 b() {
            r3 = this;
            r3.a()
            android.view.WindowInsets r0 = r3.f4192c
            r1 = 0
            g3.r0 r0 = g3.r0.c(r0, r1)
            b3.a[] r1 = r3.f4202b
            g3.n0 r2 = r0.f4230a
            r2.r(r1)
            b3.a r1 = r3.f4193d
            r2.u(r1)
            return r0
    }

    @Override // g3.g0
    public void e(b3.a r1) {
            r0 = this;
            r0.f4193d = r1
            return
    }

    @Override // g3.g0
    public void g(b3.a r5) {
            r4 = this;
            android.view.WindowInsets r0 = r4.f4192c
            if (r0 == 0) goto L12
            int r1 = r5.f445a
            int r2 = r5.f446b
            int r3 = r5.f447c
            int r5 = r5.f448d
            android.view.WindowInsets r5 = r0.replaceSystemWindowInsets(r1, r2, r3, r5)
            r4.f4192c = r5
        L12:
            return
    }
}
