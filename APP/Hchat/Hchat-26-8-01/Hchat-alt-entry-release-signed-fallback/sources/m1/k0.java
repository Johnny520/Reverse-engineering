package m1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends m1.i0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f8628g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.List f8629h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f8630i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f1.s f8631j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f8632k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f1.s f8633l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f8634m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f8635n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f8636o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f8637p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float f8638q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f8639r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f8640s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f8641t;

    public k0(java.lang.String r1, java.util.List r2, int r3, f1.s r4, float r5, f1.s r6, float r7, float r8, int r9, int r10, float r11, float r12, float r13, float r14) {
            r0 = this;
            r0.<init>()
            r0.f8628g = r1
            r0.f8629h = r2
            r0.f8630i = r3
            r0.f8631j = r4
            r0.f8632k = r5
            r0.f8633l = r6
            r0.f8634m = r7
            r0.f8635n = r8
            r0.f8636o = r9
            r0.f8637p = r10
            r0.f8638q = r11
            r0.f8639r = r12
            r0.f8640s = r13
            r0.f8641t = r14
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L8a
            java.lang.Class<m1.k0> r2 = m1.k0.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L11
            goto L8a
        L11:
            m1.k0 r5 = (m1.k0) r5
            java.lang.String r2 = r4.f8628g
            java.lang.String r3 = r5.f8628g
            boolean r2 = gg.l.a(r2, r3)
            if (r2 != 0) goto L1e
            return r1
        L1e:
            f1.s r2 = r4.f8631j
            f1.s r3 = r5.f8631j
            boolean r2 = gg.l.a(r2, r3)
            if (r2 != 0) goto L29
            return r1
        L29:
            float r2 = r4.f8632k
            float r3 = r5.f8632k
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L8a
            f1.s r2 = r4.f8633l
            f1.s r3 = r5.f8633l
            boolean r2 = gg.l.a(r2, r3)
            if (r2 != 0) goto L3c
            return r1
        L3c:
            float r2 = r4.f8634m
            float r3 = r5.f8634m
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L8a
            float r2 = r4.f8635n
            float r3 = r5.f8635n
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L8a
            int r2 = r4.f8636o
            int r3 = r5.f8636o
            if (r2 != r3) goto L8a
            int r2 = r4.f8637p
            int r3 = r5.f8637p
            if (r2 != r3) goto L8a
            float r2 = r4.f8638q
            float r3 = r5.f8638q
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L8a
            float r2 = r4.f8639r
            float r3 = r5.f8639r
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L8a
            float r2 = r4.f8640s
            float r3 = r5.f8640s
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L8a
            float r2 = r4.f8641t
            float r3 = r5.f8641t
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L8a
            int r2 = r4.f8630i
            int r3 = r5.f8630i
            if (r2 != r3) goto L8a
            java.util.List r2 = r4.f8629h
            java.util.List r5 = r5.f8629h
            boolean r5 = gg.l.a(r2, r5)
            if (r5 != 0) goto L89
            return r1
        L89:
            return r0
        L8a:
            return r1
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f8628g
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.util.List r2 = r4.f8629h
            int r0 = j8.b.e(r2, r0, r1)
            r2 = 0
            f1.s r3 = r4.f8631j
            if (r3 == 0) goto L19
            int r3 = r3.hashCode()
            goto L1a
        L19:
            r3 = r2
        L1a:
            int r0 = r0 + r3
            int r0 = r0 * r1
            float r3 = r4.f8632k
            int r0 = eh.a.d(r3, r0, r1)
            f1.s r3 = r4.f8633l
            if (r3 == 0) goto L2a
            int r2 = r3.hashCode()
        L2a:
            int r0 = r0 + r2
            int r0 = r0 * r1
            float r2 = r4.f8634m
            int r0 = eh.a.d(r2, r0, r1)
            float r2 = r4.f8635n
            int r0 = eh.a.d(r2, r0, r1)
            int r2 = r4.f8636o
            int r0 = eh.a.e(r2, r0, r1)
            int r2 = r4.f8637p
            int r0 = eh.a.e(r2, r0, r1)
            float r2 = r4.f8638q
            int r0 = eh.a.d(r2, r0, r1)
            float r2 = r4.f8639r
            int r0 = eh.a.d(r2, r0, r1)
            float r2 = r4.f8640s
            int r0 = eh.a.d(r2, r0, r1)
            float r2 = r4.f8641t
            int r0 = eh.a.d(r2, r0, r1)
            int r1 = r4.f8630i
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }
}
