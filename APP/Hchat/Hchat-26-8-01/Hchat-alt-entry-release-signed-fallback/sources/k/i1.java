package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p.z0 f7000b;

    public i1() {
            r4 = this;
            r0 = 4284900966(0xff666666, double:2.117022363E-314)
            long r0 = f1.c0.d(r0)
            r2 = 3
            r3 = 0
            p.z0 r2 = p.d.a(r2, r3)
            r4.<init>()
            r4.f6999a = r0
            r4.f7000b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L30
        L3:
            if (r5 == 0) goto La
            java.lang.Class r0 = r5.getClass()
            goto Lb
        La:
            r0 = 0
        Lb:
            java.lang.Class<k.i1> r1 = k.i1.class
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L14
            goto L2e
        L14:
            r5.getClass()
            k.i1 r5 = (k.i1) r5
            long r0 = r4.f6999a
            long r2 = r5.f6999a
            boolean r0 = f1.w.c(r0, r2)
            if (r0 != 0) goto L24
            goto L2e
        L24:
            p.z0 r0 = r4.f7000b
            p.z0 r5 = r5.f7000b
            boolean r5 = gg.l.a(r0, r5)
            if (r5 != 0) goto L30
        L2e:
            r5 = 0
            return r5
        L30:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r2 = this;
            int r0 = f1.w.f3132h
            long r0 = r2.f6999a
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            p.z0 r1 = r2.f7000b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "OverscrollConfiguration(glowColor="
            r0.<init>(r1)
            long r1 = r3.f6999a
            java.lang.String r1 = f1.w.i(r1)
            r0.append(r1)
            java.lang.String r1 = ", drawPadding="
            r0.append(r1)
            p.z0 r1 = r3.f7000b
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
