package d7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l extends o7.e implements k7.d, java.lang.Iterable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r7.b f2049m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o7.b f2050n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final o7.g f2051o;

    public l(boolean r4) {
            r3 = this;
            r0 = 3
            r3.<init>(r0)
            r0 = 0
            if (r4 == 0) goto Ld
            r7.h r4 = new r7.h
            r4.<init>(r0)
            goto L12
        Ld:
            r7.f r4 = new r7.f
            r4.<init>(r0)
        L12:
            r3.f2049m = r4
            o7.b r1 = new o7.b
            r2 = 0
            r1.<init>(r2)
            r3.f2050n = r1
            o7.g r2 = new o7.g
            r2.<init>()
            r3.f2051o = r2
            r3.P(r0, r4)
            r4 = 1
            r3.P(r4, r1)
            r4 = 2
            r3.P(r4, r2)
            return
    }

    @Override // k7.c, k7.a
    public final void B(q7.b r8) {
            r7 = this;
            boolean r0 = r8.b()
            if (r0 != 0) goto L7
            goto L1d
        L7:
            r7.b r0 = r7.f2049m
            r0.G(r8)
            boolean r1 = r0 instanceof r7.h
            if (r1 == 0) goto L15
            r7.h r0 = (r7.h) r0
            long r0 = r0.f11562n
            goto L1a
        L15:
            r7.f r0 = (r7.f) r0
            int r0 = r0.f11560n
            long r0 = (long) r0
        L1a:
            int r0 = (int) r0
            if (r0 > 0) goto L1e
        L1d:
            return
        L1e:
            q7.b r1 = r8.a(r0)
            o7.g r2 = r7.f2051o
            int r3 = r2.p()
            int r3 = r3 + 4
        L2a:
            int r4 = r1.available()
            if (r4 <= r3) goto L42
            int r4 = r1.f10666k
            k7.a r5 = r7.n()
            o7.b r6 = r7.f2050n
            r6.M(r5)
            r5.G(r1)
            int r5 = r1.f10666k
            if (r4 != r5) goto L2a
        L42:
            r2.G(r1)
            r8.c(r0)
            return
    }

    @Override // o7.e, k7.c
    public void N() {
            r4 = this;
            int r0 = r4.p()
            r7.b r1 = r4.f2049m
            int r2 = r1.p()
            int r0 = r0 - r2
            long r2 = (long) r0
            boolean r0 = r1 instanceof r7.h
            if (r0 == 0) goto L16
            r7.h r1 = (r7.h) r1
            r1.N(r2)
            return
        L16:
            r7.f r1 = (r7.f) r1
            int r0 = (int) r2
            r1.k(r0)
            return
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r1 = this;
            o7.b r0 = r1.f2050n
            z7.c r0 = r0.f9563k
            java.util.Iterator r0 = r0.iterator()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "size="
            r0.<init>(r1)
            r7.b r1 = r2.f2049m
            r0.append(r1)
            java.lang.String r1 = ", count="
            r0.append(r1)
            o7.b r1 = r2.f2050n
            z7.c r1 = r1.f9563k
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
