package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ic0 extends defpackage.mc0 {
    public static java.lang.reflect.Field e;
    public static boolean f;
    public static java.lang.reflect.Constructor g;
    public static boolean h;
    public android.view.WindowInsets c;
    public defpackage.ep d;

    public ic0() {
            r1 = this;
            r1.<init>()
            android.view.WindowInsets r0 = i()
            r1.c = r0
            return
    }

    public ic0(defpackage.wc0 r1) {
            r0 = this;
            r0.<init>(r1)
            android.view.WindowInsets r1 = r1.f()
            r0.c = r1
            return
    }

    private static android.view.WindowInsets i() {
            boolean r0 = defpackage.ic0.f
            r1 = 1
            java.lang.Class<android.view.WindowInsets> r2 = android.view.WindowInsets.class
            java.lang.String r3 = "WindowInsetsCompat"
            if (r0 != 0) goto L1a
            java.lang.String r0 = "CONSUMED"
            java.lang.reflect.Field r0 = r2.getDeclaredField(r0)     // Catch: java.lang.ReflectiveOperationException -> L12
            defpackage.ic0.e = r0     // Catch: java.lang.ReflectiveOperationException -> L12
            goto L18
        L12:
            r0 = move-exception
            java.lang.String r4 = "Could not retrieve WindowInsets.CONSUMED field"
            android.util.Log.i(r3, r4, r0)
        L18:
            defpackage.ic0.f = r1
        L1a:
            java.lang.reflect.Field r0 = defpackage.ic0.e
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
            boolean r0 = defpackage.ic0.h
            if (r0 != 0) goto L4c
            java.lang.Class<android.graphics.Rect> r0 = android.graphics.Rect.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch: java.lang.ReflectiveOperationException -> L44
            java.lang.reflect.Constructor r0 = r2.getConstructor(r0)     // Catch: java.lang.ReflectiveOperationException -> L44
            defpackage.ic0.g = r0     // Catch: java.lang.ReflectiveOperationException -> L44
            goto L4a
        L44:
            r0 = move-exception
            java.lang.String r2 = "Could not retrieve WindowInsets(Rect) constructor"
            android.util.Log.i(r3, r2, r0)
        L4a:
            defpackage.ic0.h = r1
        L4c:
            java.lang.reflect.Constructor r0 = defpackage.ic0.g
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

    @Override // defpackage.mc0
    public defpackage.wc0 b() {
            r3 = this;
            r3.a()
            android.view.WindowInsets r0 = r3.c
            r1 = 0
            wc0 r0 = defpackage.wc0.g(r1, r0)
            ep[] r1 = r3.b
            tc0 r2 = r0.a
            r2.o(r1)
            ep r1 = r3.d
            r2.q(r1)
            return r0
    }

    @Override // defpackage.mc0
    public void e(defpackage.ep r1) {
            r0 = this;
            r0.d = r1
            return
    }

    @Override // defpackage.mc0
    public void g(defpackage.ep r5) {
            r4 = this;
            android.view.WindowInsets r0 = r4.c
            if (r0 == 0) goto L12
            int r1 = r5.a
            int r2 = r5.b
            int r3 = r5.c
            int r5 = r5.d
            android.view.WindowInsets r5 = r0.replaceSystemWindowInsets(r1, r2, r3, r5)
            r4.c = r5
        L12:
            return
    }
}
