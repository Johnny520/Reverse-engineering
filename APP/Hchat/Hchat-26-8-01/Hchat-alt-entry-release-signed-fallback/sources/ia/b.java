package ia;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f6553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f6554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f6555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.String f6556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6557e;

    public b(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, long r5) {
            r0 = this;
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r0.<init>()
            r0.f6553a = r1
            r0.f6554b = r2
            r0.f6555c = r3
            r0.f6556d = r4
            r0.f6557e = r5
            return
    }

    public static ia.b a(ia.b r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, long r6, int r8) {
            r0 = r3
            java.lang.String r3 = r2.f6553a
            r1 = r8 & 2
            if (r1 == 0) goto L9
            java.lang.String r0 = r2.f6554b
        L9:
            r1 = r8 & 4
            if (r1 == 0) goto Lf
            java.lang.String r4 = r2.f6555c
        Lf:
            r1 = r8 & 8
            if (r1 == 0) goto L15
            java.lang.String r5 = r2.f6556d
        L15:
            r8 = r8 & 16
            if (r8 == 0) goto L1b
            long r6 = r2.f6557e
        L1b:
            r7 = r6
            r2.getClass()
            r0.getClass()
            r4.getClass()
            r5.getClass()
            ia.b r2 = new ia.b
            r6 = r5
            r5 = r4
            r4 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L40
        L3:
            boolean r0 = r5 instanceof ia.b
            if (r0 != 0) goto L8
            goto L3e
        L8:
            ia.b r5 = (ia.b) r5
            java.lang.String r0 = r4.f6553a
            java.lang.String r1 = r5.f6553a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L3e
        L15:
            java.lang.String r0 = r4.f6554b
            java.lang.String r1 = r5.f6554b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L20
            goto L3e
        L20:
            java.lang.String r0 = r4.f6555c
            java.lang.String r1 = r5.f6555c
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L2b
            goto L3e
        L2b:
            java.lang.String r0 = r4.f6556d
            java.lang.String r1 = r5.f6556d
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L36
            goto L3e
        L36:
            long r0 = r4.f6557e
            long r2 = r5.f6557e
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L40
        L3e:
            r5 = 0
            return r5
        L40:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f6553a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f6554b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f6555c
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f6556d
            int r0 = eh.a.g(r0, r1, r2)
            long r1 = r3.f6557e
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", authorWxId="
            java.lang.String r1 = ", authorDisplayName="
            java.lang.String r2 = "FakeSnsComment(id="
            java.lang.String r3 = r5.f6553a
            java.lang.String r4 = r5.f6554b
            java.lang.StringBuilder r0 = bc.e.p(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", content="
            java.lang.String r2 = ", createTimeMillis="
            java.lang.String r3 = r5.f6555c
            java.lang.String r4 = r5.f6556d
            j8.b.t(r0, r3, r1, r4, r2)
            java.lang.String r1 = ")"
            long r2 = r5.f6557e
            java.lang.String r0 = eh.a.p(r0, r2, r1)
            return r0
    }
}
