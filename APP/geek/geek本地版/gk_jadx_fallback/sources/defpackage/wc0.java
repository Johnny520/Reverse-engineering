package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wc0 {
    public static final defpackage.wc0 b = null;
    public final defpackage.tc0 a;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            wc0 r0 = defpackage.sc0.q
            defpackage.wc0.b = r0
            return
        Lb:
            wc0 r0 = defpackage.tc0.b
            defpackage.wc0.b = r0
            return
    }

    public wc0() {
            r1 = this;
            r1.<init>()
            tc0 r0 = new tc0
            r0.<init>(r1)
            r1.a = r0
            return
    }

    public wc0(android.view.WindowInsets r3) {
            r2 = this;
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L11
            sc0 r0 = new sc0
            r0.<init>(r2, r3)
            r2.a = r0
            return
        L11:
            r1 = 29
            if (r0 < r1) goto L1d
            rc0 r0 = new rc0
            r0.<init>(r2, r3)
            r2.a = r0
            return
        L1d:
            r1 = 28
            if (r0 < r1) goto L29
            qc0 r0 = new qc0
            r0.<init>(r2, r3)
            r2.a = r0
            return
        L29:
            oc0 r0 = new oc0
            r0.<init>(r2, r3)
            r2.a = r0
            return
    }

    public static defpackage.ep e(defpackage.ep r5, int r6, int r7, int r8, int r9) {
            int r0 = r5.a
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
            ep r5 = defpackage.ep.b(r0, r2, r3, r1)
            return r5
    }

    public static defpackage.wc0 g(android.view.View r2, android.view.WindowInsets r3) {
            wc0 r0 = new wc0
            r3.getClass()
            r0.<init>(r3)
            if (r2 == 0) goto L22
            java.util.WeakHashMap r3 = defpackage.ja0.a
            boolean r3 = defpackage.v90.b(r2)
            if (r3 == 0) goto L22
            wc0 r3 = defpackage.z90.a(r2)
            tc0 r1 = r0.a
            r1.p(r3)
            android.view.View r2 = r2.getRootView()
            r1.d(r2)
        L22:
            return r0
    }

    public final int a() {
            r1 = this;
            tc0 r0 = r1.a
            ep r0 = r0.j()
            int r0 = r0.d
            return r0
    }

    public final int b() {
            r1 = this;
            tc0 r0 = r1.a
            ep r0 = r0.j()
            int r0 = r0.a
            return r0
    }

    public final int c() {
            r1 = this;
            tc0 r0 = r1.a
            ep r0 = r0.j()
            int r0 = r0.c
            return r0
    }

    public final int d() {
            r1 = this;
            tc0 r0 = r1.a
            ep r0 = r0.j()
            int r0 = r0.b
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof defpackage.wc0
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            wc0 r2 = (defpackage.wc0) r2
            tc0 r0 = r1.a
            tc0 r2 = r2.a
            boolean r2 = defpackage.pw.a(r0, r2)
            return r2
    }

    public final android.view.WindowInsets f() {
            r2 = this;
            tc0 r0 = r2.a
            boolean r1 = r0 instanceof defpackage.nc0
            if (r1 == 0) goto Lb
            nc0 r0 = (defpackage.nc0) r0
            android.view.WindowInsets r0 = r0.c
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public final int hashCode() {
            r1 = this;
            tc0 r0 = r1.a
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.hashCode()
            return r0
    }
}
