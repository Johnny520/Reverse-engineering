package rg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f11963a = 0;
    private static volatile android.view.Choreographer choreographer;

    static {
            rg.e r0 = new rg.e     // Catch: java.lang.Throwable -> Le
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> Le
            android.os.Handler r1 = b(r1)     // Catch: java.lang.Throwable -> Le
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Le
            goto L15
        Le:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L15:
            boolean r1 = r0 instanceof sf.f
            if (r1 == 0) goto L1b
            r0 = 0
        L1b:
            rg.e r0 = (rg.e) r0
            return
    }

    public static final void a(qg.g r3) {
            android.view.Choreographer r0 = rg.g.choreographer
            if (r0 != 0) goto Ld
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r0.getClass()
            rg.g.choreographer = r0
        Ld:
            n2.x r1 = new n2.x
            r2 = 1
            r1.<init>(r3, r2)
            r0.postFrameCallback(r1)
            return
    }

    public static final android.os.Handler b(android.os.Looper r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r2 = 0
            java.lang.Class<android.os.Looper> r3 = android.os.Looper.class
            java.lang.Class<android.os.Handler> r4 = android.os.Handler.class
            if (r0 < r1) goto L23
            java.lang.String r0 = "createAsync"
            java.lang.Class[] r1 = new java.lang.Class[]{r3}
            java.lang.reflect.Method r0 = r4.getDeclaredMethod(r0, r1)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.Object r5 = r0.invoke(r2, r5)
            r5.getClass()
            android.os.Handler r5 = (android.os.Handler) r5
            return r5
        L23:
            r0 = 3
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L44
            r1 = 0
            r0[r1] = r3     // Catch: java.lang.NoSuchMethodException -> L44
            java.lang.Class<android.os.Handler$Callback> r1 = android.os.Handler.Callback.class
            r3 = 1
            r0[r3] = r1     // Catch: java.lang.NoSuchMethodException -> L44
            java.lang.Class r1 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L44
            r3 = 2
            r0[r3] = r1     // Catch: java.lang.NoSuchMethodException -> L44
            java.lang.reflect.Constructor r0 = r4.getDeclaredConstructor(r0)     // Catch: java.lang.NoSuchMethodException -> L44
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r2, r1}
            java.lang.Object r5 = r0.newInstance(r5)
            android.os.Handler r5 = (android.os.Handler) r5
            return r5
        L44:
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r5)
            return r0
    }

    public static final java.lang.Object c(ci.j r4) {
            android.view.Choreographer r0 = rg.g.choreographer
            r1 = 1
            if (r0 == 0) goto L1e
            qg.g r2 = new qg.g
            wf.c r4 = fb.v0.x(r4)
            r2.<init>(r1, r4)
            r2.p()
            n2.x r4 = new n2.x
            r4.<init>(r2, r1)
            r0.postFrameCallback(r4)
            java.lang.Object r4 = r2.o()
            return r4
        L1e:
            qg.g r0 = new qg.g
            wf.c r4 = fb.v0.x(r4)
            r0.<init>(r1, r4)
            r0.p()
            android.os.Looper r4 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r4 != r1) goto L38
            a(r0)
            goto L47
        L38:
            xg.e r4 = qg.c0.f11038a
            rg.e r4 = vg.m.f14353a
            wf.g r1 = r0.f11050k
            rg.f r2 = new rg.f
            r3 = 0
            r2.<init>(r0, r3)
            r4.w(r1, r2)
        L47:
            java.lang.Object r4 = r0.o()
            return r4
    }
}
