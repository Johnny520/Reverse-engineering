package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends x1.x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0.g1 f7118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0.h1 f7119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k.o1 f7120c;

    public z0(h0.g1 r1, h0.h1 r2, k.o1 r3) {
            r0 = this;
            r0.<init>()
            r0.f7118a = r1
            r0.f7119b = r2
            r0.f7120c = r3
            return
    }

    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            if (r0 != r1) goto L4
            r1 = 1
            return r1
        L4:
            r1 = 0
            return r1
    }

    @Override // x1.x0
    public final y0.n f() {
            r4 = this;
            k.b1 r0 = new k.b1
            h0.g1 r1 = r4.f7118a
            h0.h1 r2 = r4.f7119b
            k.o1 r3 = r4.f7120c
            r0.<init>(r1, r2, r3)
            return r0
    }

    @Override // x1.x0
    public final void g(y0.n r9) {
            r8 = this;
            k.b1 r9 = (k.b1) r9
            r9.getClass()
            k.o1 r0 = r9.f6916w
            android.view.View r1 = r9.f6917x
            u2.c r2 = r9.f6918y
            h0.g1 r3 = r8.f7118a
            r9.f6914u = r3
            h0.h1 r3 = r8.f7119b
            r9.f6915v = r3
            k.o1 r3 = r8.f7120c
            r9.f6916w = r3
            android.view.View r4 = x1.k.y(r9)
            x1.f0 r5 = x1.k.w(r9)
            u2.c r5 = r5.E
            k.n1 r6 = r9.f6919z
            if (r6 == 0) goto L5d
            f2.x r6 = k.c1.f6929a
            r6 = 2143289344(0x7fc00000, float:NaN)
            boolean r7 = java.lang.Float.isNaN(r6)
            if (r7 == 0) goto L36
            boolean r7 = java.lang.Float.isNaN(r6)
            if (r7 == 0) goto L36
            goto L3c
        L36:
            boolean r7 = r3.a()
            if (r7 == 0) goto L5a
        L3c:
            boolean r7 = u2.f.b(r6, r6)
            if (r7 == 0) goto L5a
            boolean r6 = u2.f.b(r6, r6)
            if (r6 == 0) goto L5a
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L5a
            boolean r0 = r4.equals(r1)
            if (r0 == 0) goto L5a
            boolean r0 = gg.l.a(r5, r2)
            if (r0 != 0) goto L5d
        L5a:
            r9.l1()
        L5d:
            r9.m1()
            return
    }

    public final int hashCode() {
            r6 = this;
            h0.g1 r0 = r6.f7118a
            int r0 = r0.hashCode()
            int r0 = r0 * 961
            r1 = 2143289344(0x7fc00000, float:NaN)
            r2 = 31
            int r0 = eh.a.d(r1, r0, r2)
            r3 = 1
            int r0 = eh.a.h(r0, r2, r3)
            r4 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r0 = eh.a.f(r0, r2, r4)
            int r0 = eh.a.d(r1, r0, r2)
            int r0 = eh.a.d(r1, r0, r2)
            int r0 = eh.a.h(r0, r2, r3)
            h0.h1 r1 = r6.f7119b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * r2
            k.o1 r0 = r6.f7120c
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }
}
