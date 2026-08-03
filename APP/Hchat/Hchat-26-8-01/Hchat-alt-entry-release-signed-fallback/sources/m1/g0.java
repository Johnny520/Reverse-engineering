package m1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends m1.i0 implements java.lang.Iterable, hg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f8577g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f8578h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f8579i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f8580j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f8581k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f8582l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f8583m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f8584n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.util.List f8585o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final java.util.List f8586p;

    public g0(java.lang.String r1, float r2, float r3, float r4, float r5, float r6, float r7, float r8, java.util.List r9, java.util.ArrayList r10) {
            r0 = this;
            r0.<init>()
            r0.f8577g = r1
            r0.f8578h = r2
            r0.f8579i = r3
            r0.f8580j = r4
            r0.f8581k = r5
            r0.f8582l = r6
            r0.f8583m = r7
            r0.f8584n = r8
            r0.f8585o = r9
            r0.f8586p = r10
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L68
            boolean r2 = r5 instanceof m1.g0
            if (r2 != 0) goto Lc
            goto L68
        Lc:
            m1.g0 r5 = (m1.g0) r5
            java.lang.String r2 = r5.f8577g
            java.lang.String r3 = r4.f8577g
            boolean r2 = gg.l.a(r3, r2)
            if (r2 != 0) goto L19
            return r1
        L19:
            float r2 = r4.f8578h
            float r3 = r5.f8578h
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L68
            float r2 = r4.f8579i
            float r3 = r5.f8579i
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L68
            float r2 = r4.f8580j
            float r3 = r5.f8580j
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L68
            float r2 = r4.f8581k
            float r3 = r5.f8581k
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L68
            float r2 = r4.f8582l
            float r3 = r5.f8582l
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L68
            float r2 = r4.f8583m
            float r3 = r5.f8583m
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L68
            float r2 = r4.f8584n
            float r3 = r5.f8584n
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L68
            java.util.List r2 = r4.f8585o
            java.util.List r3 = r5.f8585o
            boolean r2 = gg.l.a(r2, r3)
            if (r2 != 0) goto L5c
            return r1
        L5c:
            java.util.List r2 = r4.f8586p
            java.util.List r5 = r5.f8586p
            boolean r5 = gg.l.a(r2, r5)
            if (r5 != 0) goto L67
            return r1
        L67:
            return r0
        L68:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f8577g
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.f8578h
            int r0 = eh.a.d(r2, r0, r1)
            float r2 = r3.f8579i
            int r0 = eh.a.d(r2, r0, r1)
            float r2 = r3.f8580j
            int r0 = eh.a.d(r2, r0, r1)
            float r2 = r3.f8581k
            int r0 = eh.a.d(r2, r0, r1)
            float r2 = r3.f8582l
            int r0 = eh.a.d(r2, r0, r1)
            float r2 = r3.f8583m
            int r0 = eh.a.d(r2, r0, r1)
            float r2 = r3.f8584n
            int r0 = eh.a.d(r2, r0, r1)
            java.util.List r2 = r3.f8585o
            int r0 = j8.b.e(r2, r0, r1)
            java.util.List r1 = r3.f8586p
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r1 = this;
            m1.f0 r0 = new m1.f0
            r0.<init>(r1)
            return r0
    }
}
