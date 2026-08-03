package k5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k5.u f7202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7204c;

    public f0(k5.u r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f7202a = r1
            r0.f7203b = r2
            r0.f7204c = r3
            return
    }

    public final int a() {
            r2 = this;
            k5.u r0 = r2.f7202a
            androidx.lifecycle.x r0 = r0.f7264b
            int r1 = r2.f7203b
            int r1 = r1 + 4
            int r0 = r0.P(r1)
            return r0
    }

    public final java.util.List b() {
            r13 = this;
            k5.u r0 = r13.f7202a
            androidx.lifecycle.x r3 = r0.f7264b
            int r1 = r13.f7203b
            int r1 = r1 + 6
            int r1 = r3.P(r1)
            int r2 = r13.f7204c
            int r1 = r1 + r2
            a5.a r2 = new a5.a
            r4 = 5
            r2.<init>(r1, r4, r3)
            int r5 = r2.m()
            if (r5 <= 0) goto L25
            k5.d0 r1 = new k5.d0
            int r4 = r2.f56h
            r6 = 0
            r2 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L25:
            int r5 = r5 * (-1)
            int r11 = r5 + 1
            k5.e0 r7 = new k5.e0
            androidx.lifecycle.x r9 = r0.f7264b
            int r10 = r2.f56h
            r12 = r11
            r8 = r13
            r7.<init>(r8, r9, r10, r11, r12)
            return r7
    }

    public final int c() {
            r2 = this;
            k5.u r0 = r2.f7202a
            androidx.lifecycle.x r0 = r0.f7264b
            int r1 = r2.f7203b
            int r0 = r0.N(r1)
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof k5.f0
            if (r0 == 0) goto L2a
            k5.f0 r3 = (k5.f0) r3
            int r0 = r2.c()
            int r1 = r3.c()
            if (r0 != r1) goto L2a
            int r0 = r2.a()
            int r1 = r3.a()
            if (r0 != r1) goto L2a
            java.util.List r0 = r2.b()
            java.util.List r3 = r3.b()
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L2a
            r3 = 1
            return r3
        L2a:
            r3 = 0
            return r3
    }
}
