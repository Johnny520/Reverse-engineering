package p4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements java.lang.Comparable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f10215g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f10216h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u4.o f10217i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v4.d0 f10218j;

    public n(int r2, int r3, u4.o r4) {
            r1 = this;
            r1.<init>()
            if (r2 < 0) goto L34
            if (r3 == 0) goto L2d
            u4.k r0 = r4.f13402i     // Catch: java.lang.NullPointerException -> L26
            if (r0 == 0) goto L1e
            r1.f10215g = r2
            r1.f10216h = r3
            r1.f10217i = r4
            w4.d r2 = r4.f13401h
            w4.c r2 = r2.getType()
            v4.d0 r2 = v4.d0.l(r2)
            r1.f10218j = r2
            return
        L1e:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException     // Catch: java.lang.NullPointerException -> L26
            java.lang.String r3 = "spec.getLocalItem() == null"
            r2.<init>(r3)     // Catch: java.lang.NullPointerException -> L26
            throw r2     // Catch: java.lang.NullPointerException -> L26
        L26:
            java.lang.String r2 = "spec == null"
            bsh.j.c(r2)
            r2 = 0
            throw r2
        L2d:
            java.lang.String r2 = "disposition == null"
            bsh.j.c(r2)
            r2 = 0
            throw r2
        L34:
            java.lang.String r2 = "address < 0"
            j8.o.t(r2)
            r2 = 0
            throw r2
    }

    public final int a(p4.n r5) {
            r4 = this;
            int r0 = r5.f10215g
            int r1 = r4.f10215g
            if (r1 >= r0) goto L7
            goto L1d
        L7:
            r2 = 1
            if (r1 <= r0) goto Lb
            goto L1c
        Lb:
            int r0 = r4.f10216h
            r1 = 0
            if (r0 != r2) goto L12
            r0 = r2
            goto L13
        L12:
            r0 = r1
        L13:
            int r3 = r5.f10216h
            if (r3 != r2) goto L18
            r1 = r2
        L18:
            if (r0 == r1) goto L1f
            if (r0 == 0) goto L1d
        L1c:
            return r2
        L1d:
            r5 = -1
            return r5
        L1f:
            u4.o r0 = r4.f10217i
            u4.o r5 = r5.f10217i
            int r5 = r0.d(r5)
            return r5
    }

    public final v4.c0 b() {
            r1 = this;
            u4.o r0 = r1.f10217i
            u4.k r0 = r0.f13402i
            v4.c0 r0 = r0.f13394h
            return r0
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            p4.n r1 = (p4.n) r1
            int r1 = r0.a(r1)
            return r1
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p4.n
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            p4.n r3 = (p4.n) r3
            int r3 = r2.a(r3)
            if (r3 != 0) goto L10
            r3 = 1
            return r3
        L10:
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r3.f10215g
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            int r2 = r3.f10216h
            switch(r2) {
                case 1: goto L2a;
                case 2: goto L27;
                case 3: goto L24;
                case 4: goto L21;
                case 5: goto L1e;
                case 6: goto L1b;
                default: goto L18;
            }
        L18:
            java.lang.String r2 = "null"
            goto L2c
        L1b:
            java.lang.String r2 = "END_CLOBBERED_BY_NEXT"
            goto L2c
        L1e:
            java.lang.String r2 = "END_CLOBBERED_BY_PREV"
            goto L2c
        L21:
            java.lang.String r2 = "END_MOVED"
            goto L2c
        L24:
            java.lang.String r2 = "END_REPLACED"
            goto L2c
        L27:
            java.lang.String r2 = "END_SIMPLY"
            goto L2c
        L2a:
            java.lang.String r2 = "START"
        L2c:
            r0.append(r2)
            r0.append(r1)
            u4.o r1 = r3.f10217i
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
