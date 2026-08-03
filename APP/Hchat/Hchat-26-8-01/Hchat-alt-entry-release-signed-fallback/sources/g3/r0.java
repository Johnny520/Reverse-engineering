package g3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final g3.r0 f4229b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g3.n0 f4230a;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            g3.r0 r0 = g3.m0.f4224s
            g3.r0.f4229b = r0
            return
        Lb:
            r1 = 30
            if (r0 < r1) goto L14
            g3.r0 r0 = g3.l0.f4223r
            g3.r0.f4229b = r0
            return
        L14:
            g3.r0 r0 = g3.n0.f4225b
            g3.r0.f4229b = r0
            return
    }

    public r0(android.view.WindowInsets r3) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L11
            g3.m0 r0 = new g3.m0
            r0.<init>(r2, r3)
            r2.f4230a = r0
            return
        L11:
            r1 = 30
            if (r0 < r1) goto L1d
            g3.l0 r0 = new g3.l0
            r0.<init>(r2, r3)
            r2.f4230a = r0
            return
        L1d:
            r1 = 29
            if (r0 < r1) goto L29
            g3.k0 r0 = new g3.k0
            r0.<init>(r2, r3)
            r2.f4230a = r0
            return
        L29:
            r1 = 28
            if (r0 < r1) goto L35
            g3.j0 r0 = new g3.j0
            r0.<init>(r2, r3)
            r2.f4230a = r0
            return
        L35:
            g3.i0 r0 = new g3.i0
            r0.<init>(r2, r3)
            r2.f4230a = r0
            return
    }

    public r0(g3.r0 r3) {
            r2 = this;
            r2.<init>()
            if (r3 == 0) goto L7e
            g3.n0 r3 = r3.f4230a
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L1c
            boolean r1 = r3 instanceof g3.m0
            if (r1 == 0) goto L1c
            g3.m0 r0 = new g3.m0
            r1 = r3
            g3.m0 r1 = (g3.m0) r1
            r0.<init>(r2, r1)
            r2.f4230a = r0
            goto L7a
        L1c:
            r1 = 30
            if (r0 < r1) goto L2f
            boolean r1 = r3 instanceof g3.l0
            if (r1 == 0) goto L2f
            g3.l0 r0 = new g3.l0
            r1 = r3
            g3.l0 r1 = (g3.l0) r1
            r0.<init>(r2, r1)
            r2.f4230a = r0
            goto L7a
        L2f:
            r1 = 29
            if (r0 < r1) goto L42
            boolean r1 = r3 instanceof g3.k0
            if (r1 == 0) goto L42
            g3.k0 r0 = new g3.k0
            r1 = r3
            g3.k0 r1 = (g3.k0) r1
            r0.<init>(r2, r1)
            r2.f4230a = r0
            goto L7a
        L42:
            r1 = 28
            if (r0 < r1) goto L55
            boolean r0 = r3 instanceof g3.j0
            if (r0 == 0) goto L55
            g3.j0 r0 = new g3.j0
            r1 = r3
            g3.j0 r1 = (g3.j0) r1
            r0.<init>(r2, r1)
            r2.f4230a = r0
            goto L7a
        L55:
            boolean r0 = r3 instanceof g3.i0
            if (r0 == 0) goto L64
            g3.i0 r0 = new g3.i0
            r1 = r3
            g3.i0 r1 = (g3.i0) r1
            r0.<init>(r2, r1)
            r2.f4230a = r0
            goto L7a
        L64:
            boolean r0 = r3 instanceof g3.h0
            if (r0 == 0) goto L73
            g3.h0 r0 = new g3.h0
            r1 = r3
            g3.h0 r1 = (g3.h0) r1
            r0.<init>(r2, r1)
            r2.f4230a = r0
            goto L7a
        L73:
            g3.n0 r0 = new g3.n0
            r0.<init>(r2)
            r2.f4230a = r0
        L7a:
            r3.e(r2)
            return
        L7e:
            g3.n0 r3 = new g3.n0
            r3.<init>(r2)
            r2.f4230a = r3
            return
    }

    public static b3.a a(b3.a r5, int r6, int r7, int r8, int r9) {
            int r0 = r5.f445a
            int r0 = r0 - r6
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            int r2 = r5.f446b
            int r2 = r2 - r7
            int r2 = java.lang.Math.max(r1, r2)
            int r3 = r5.f447c
            int r3 = r3 - r8
            int r3 = java.lang.Math.max(r1, r3)
            int r4 = r5.f448d
            int r4 = r4 - r9
            int r1 = java.lang.Math.max(r1, r4)
            if (r0 != r6) goto L26
            if (r2 != r7) goto L26
            if (r3 != r8) goto L26
            if (r1 != r9) goto L26
            return r5
        L26:
            b3.a r5 = b3.a.b(r0, r2, r3, r1)
            return r5
    }

    public static g3.r0 c(android.view.WindowInsets r2, android.view.View r3) {
            g3.r0 r0 = new g3.r0
            r2.getClass()
            r0.<init>(r2)
            if (r3 == 0) goto L29
            boolean r2 = r3.isAttachedToWindow()
            if (r2 == 0) goto L29
            int r2 = g3.q.f4227a
            g3.r0 r2 = g3.n.a(r3)
            g3.n0 r1 = r0.f4230a
            r1.t(r2)
            android.view.View r2 = r3.getRootView()
            r1.d(r2)
            int r2 = r3.getWindowSystemUiVisibility()
            r1.v(r2)
        L29:
            return r0
    }

    public final android.view.WindowInsets b() {
            r2 = this;
            g3.n0 r0 = r2.f4230a
            boolean r1 = r0 instanceof g3.h0
            if (r1 == 0) goto Lb
            g3.h0 r0 = (g3.h0) r0
            android.view.WindowInsets r0 = r0.f4208c
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof g3.r0
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            g3.r0 r2 = (g3.r0) r2
            g3.n0 r0 = r1.f4230a
            g3.n0 r2 = r2.f4230a
            boolean r2 = java.util.Objects.equals(r0, r2)
            return r2
    }

    public final int hashCode() {
            r1 = this;
            g3.n0 r0 = r1.f4230a
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.hashCode()
            return r0
    }
}
