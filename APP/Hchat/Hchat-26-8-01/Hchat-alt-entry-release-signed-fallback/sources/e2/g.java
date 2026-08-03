package e2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f2333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object f2334c;

    public g(int r1, ci.m0 r2) {
            r0 = this;
            r0.<init>()
            r0.f2332a = r1
            r0.f2334c = r2
            return
    }

    public g(j2.k r1) {
            r0 = this;
            r0.<init>()
            r0.f2334c = r1
            r1 = -1
            r0.f2332a = r1
            return
    }

    public float a(int r6, boolean r7, boolean r8, boolean r9) {
            r5 = this;
            java.lang.Object r0 = r5.f2334c
            j2.k r0 = (j2.k) r0
            r1 = 1
            r2 = 0
            if (r7 == 0) goto L1d
            android.text.Layout r3 = r0.f6700f
            int r3 = j2.g.d(r3, r6, r7)
            android.text.Layout r4 = r0.f6700f
            int r4 = r4.getLineStart(r3)
            int r3 = r0.f(r3)
            if (r6 == r4) goto L1f
            if (r6 != r3) goto L1d
            goto L1f
        L1d:
            r3 = r2
            goto L20
        L1f:
            r3 = r1
        L20:
            int r4 = r6 * 4
            if (r9 == 0) goto L28
            if (r3 == 0) goto L2d
            r1 = r2
            goto L2d
        L28:
            if (r3 == 0) goto L2c
            r1 = 2
            goto L2d
        L2c:
            r1 = 3
        L2d:
            int r4 = r4 + r1
            int r1 = r5.f2332a
            if (r1 != r4) goto L35
            float r6 = r5.f2333b
            return r6
        L35:
            if (r9 == 0) goto L3c
            float r6 = r0.h(r6, r7)
            goto L40
        L3c:
            float r6 = r0.i(r6, r7)
        L40:
            if (r8 == 0) goto L46
            r5.f2332a = r4
            r5.f2333b = r6
        L46:
            return r6
    }

    public java.lang.Object b(float r5, yf.c r6) {
            r4 = this;
            boolean r0 = r6 instanceof e2.f
            if (r0 == 0) goto L13
            r0 = r6
            e2.f r0 = (e2.f) r0
            int r1 = r0.f2331i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2331i = r1
            goto L18
        L13:
            e2.f r0 = new e2.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f2329g
            int r1 = r0.f2331i
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            f8.i.I0(r6)
            goto L43
        L25:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r5)
            r5 = 0
            return r5
        L2c:
            f8.i.I0(r6)
            java.lang.Object r6 = r4.f2334c
            ci.m0 r6 = (ci.m0) r6
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r5)
            r0.f2331i = r2
            java.lang.Object r6 = r6.invoke(r1, r0)
            xf.a r5 = xf.a.f21579g
            if (r6 != r5) goto L43
            return r5
        L43:
            java.lang.Number r6 = (java.lang.Number) r6
            float r5 = r6.floatValue()
            float r6 = r4.f2333b
            float r6 = r6 + r5
            r4.f2333b = r6
            sf.n r5 = sf.n.f12433a
            return r5
    }
}
