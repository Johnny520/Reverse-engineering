package r4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends r4.u0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f11402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.TreeMap f11403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f11404h;

    public g(r4.p r2, int r3) {
            r1 = this;
            r1.f11402f = r3
            switch(r3) {
                case 1: goto L1a;
                default: goto L5;
            }
        L5:
            java.lang.String r3 = "call_site_ids"
            r0 = 4
            r1.<init>(r3, r2, r0)
            java.util.TreeMap r2 = new java.util.TreeMap
            r2.<init>()
            r1.f11403g = r2
            java.util.TreeMap r2 = new java.util.TreeMap
            r2.<init>()
            r1.f11404h = r2
            return
        L1a:
            java.lang.String r3 = "class_defs"
            r0 = 4
            r1.<init>(r3, r2, r0)
            java.util.TreeMap r2 = new java.util.TreeMap
            r2.<init>()
            r1.f11403g = r2
            r2 = 0
            r1.f11404h = r2
            return
    }

    @Override // r4.o0
    public final java.util.Collection c() {
            r1 = this;
            int r0 = r1.f11402f
            switch(r0) {
                case 0: goto L13;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r1.f11404h
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto Lc
            goto L12
        Lc:
            java.util.TreeMap r0 = r1.f11403g
            java.util.Collection r0 = r0.values()
        L12:
            return r0
        L13:
            java.util.TreeMap r0 = r1.f11403g
            java.util.Collection r0 = r0.values()
            return r0
    }

    @Override // r4.u0
    public final void k() {
            r5 = this;
            int r0 = r5.f11402f
            switch(r0) {
                case 0: goto L2f;
                default: goto L5;
            }
        L5:
            java.util.TreeMap r0 = r5.f11403g
            int r1 = r0.size()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            r5.f11404h = r2
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
        L1b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2e
            java.lang.Object r3 = r0.next()
            w4.c r3 = (w4.c) r3
            int r4 = r1 - r2
            int r2 = r5.l(r2, r4, r3)
            goto L1b
        L2e:
            return
        L2f:
            java.util.TreeMap r0 = r5.f11403g
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L3a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4d
            java.lang.Object r2 = r0.next()
            r4.f r2 = (r4.f) r2
            int r3 = r1 + 1
            r2.g(r1)
            r1 = r3
            goto L3a
        L4d:
            return
    }

    public int l(int r5, int r6, w4.c r7) {
            r4 = this;
            java.util.TreeMap r0 = r4.f11403g
            java.lang.Object r0 = r0.get(r7)
            r4.k r0 = (r4.k) r0
            if (r0 == 0) goto L4b
            int r1 = r0.f11516g
            if (r1 < 0) goto Lf
            goto L4b
        Lf:
            if (r6 < 0) goto L45
            int r6 = r6 + (-1)
            v4.d0 r7 = r0.f11426j
            if (r7 == 0) goto L1d
            w4.c r7 = r7.f14088g
            int r5 = r4.l(r5, r6, r7)
        L1d:
            r4.t0 r7 = r0.f11427k
            if (r7 != 0) goto L24
            w4.b r7 = w4.b.f14847i
            goto L26
        L24:
            w4.e r7 = r7.f11509k
        L26:
            int r1 = r7.size()
            r2 = 0
        L2b:
            if (r2 >= r1) goto L38
            w4.c r3 = r7.getType(r2)
            int r5 = r4.l(r5, r6, r3)
            int r2 = r2 + 1
            goto L2b
        L38:
            r0.g(r5)
            java.lang.Object r6 = r4.f11404h
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r6.add(r0)
            int r5 = r5 + 1
            return r5
        L45:
            java.lang.String r5 = "class circularity with "
            okio.a.o(r7, r5)
            r5 = 0
        L4b:
            return r5
    }
}
