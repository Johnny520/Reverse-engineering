package r7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends r7.f implements java.lang.Comparable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final okio.a f11571q = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public java.lang.Object f11572o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public r7.o f11573p;

    static {
            okio.a r0 = new okio.a
            r1 = 12
            r0.<init>(r1)
            r7.n.f11571q = r0
            return
    }

    public final r7.o N() {
            r2 = this;
            r7.o r0 = r2.f11573p
            if (r0 == 0) goto La
            k7.a r1 = r0.f7389h
            if (r1 != 0) goto L9
            goto La
        L9:
            return r0
        La:
            r0 = 0
            return r0
    }

    public final boolean O() {
            r4 = this;
            java.lang.Object r0 = r4.f11572o
            r1 = 1
            if (r0 != 0) goto L7
            r0 = r1
            goto L17
        L7:
            java.lang.Class r2 = r0.getClass()
            java.lang.Class<y7.b> r3 = y7.b.class
            if (r2 != r3) goto L16
            y7.b r0 = (y7.b) r0
            boolean r0 = r0.isEmpty()
            goto L17
        L16:
            r0 = 0
        L17:
            r0 = r0 ^ r1
            return r0
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r5) {
            r4 = this;
            r7.n r5 = (r7.n) r5
            if (r5 != 0) goto L6
            r5 = -1
            return r5
        L6:
            r0 = 0
            if (r5 != r4) goto La
            goto L31
        La:
            r7.o r1 = r4.N()
            r7.o r5 = r5.N()
            r2 = 1
            if (r1 != 0) goto L17
            r3 = r2
            goto L18
        L17:
            r3 = r0
        L18:
            if (r5 != 0) goto L1b
            goto L1c
        L1b:
            r2 = r0
        L1c:
            int r2 = y7.a.d(r3, r2)
            if (r2 == 0) goto L23
            return r2
        L23:
            if (r1 == 0) goto L31
            if (r5 != 0) goto L28
            goto L31
        L28:
            int r0 = r1.f7388g
            int r5 = r5.f7388g
            int r5 = y7.a.b(r0, r5)
            return r5
        L31:
            return r0
    }

    @Override // r7.f
    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "USED-BY="
            r0.<init>(r1)
            java.lang.Object r1 = r4.f11572o
            int r1 = y7.a.j(r1)
            r0.append(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            r7.o r1 = r4.N()
            r2 = 0
            if (r1 != 0) goto L1d
            goto L2d
        L1d:
            java.lang.String r3 = r1.f11578m
            if (r3 != 0) goto L22
            goto L2d
        L22:
            r7.u r1 = r1.f11583q
            if (r1 != 0) goto L28
            r2 = r3
            goto L2d
        L28:
            r2 = 0
            java.lang.String r2 = r1.Q(r3, r2)
        L2d:
            if (r2 == 0) goto L33
            r0.append(r2)
            goto L38
        L33:
            int r1 = r4.f7388g
            r0.append(r1)
        L38:
            r1 = 58
            r0.append(r1)
            int r1 = r4.f11560n
            r2 = 8
            java.lang.String r1 = y7.a.k(r1, r2)
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
