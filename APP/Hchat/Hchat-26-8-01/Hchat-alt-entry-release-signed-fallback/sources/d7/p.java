package d7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends d7.j implements q7.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r7.f f2065n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final o7.g f2066o;

    public p() {
            r2 = this;
            r0 = 2
            r1 = 1
            r2.<init>(r0, r1)
            r7.f r0 = new r7.f
            r1 = 0
            r0.<init>(r1)
            r2.f2065n = r0
            o7.g r1 = new o7.g
            r1.<init>()
            r2.f2066o = r1
            r2.P(r0)
            r2.P(r1)
            r0.f7391j = r2
            return
    }

    public final d7.o S() {
            r4 = this;
            r7.f r0 = r4.f2065n
            int r0 = r0.f11560n
            r1 = 0
        L5:
            r2 = 7
            if (r1 >= r2) goto L14
            d7.o[] r2 = d7.o.f2061p
            r2 = r2[r1]
            int r3 = r2.f2063h
            if (r0 != r3) goto L11
            return r2
        L11:
            int r1 = r1 + 1
            goto L5
        L14:
            d7.o r1 = new d7.o
            r2 = 0
            r3 = 99
            r1.<init>(r2, r0, r3)
            return r1
    }

    @Override // q7.a
    public final void m(k7.a r4) {
            r3 = this;
            r7.f r0 = r3.f2065n
            if (r4 != r0) goto L59
            d7.o r4 = r3.S()
            d7.o r0 = d7.o.f2055j
            if (r4 != r0) goto L1c
            g7.a r4 = new g7.a
            r4.<init>(r0)
            d7.e r0 = new d7.e
            r1 = 0
            r2 = 1
            r0.<init>(r2, r1)
            r4.P(r0)
            goto L54
        L1c:
            d7.o r0 = d7.o.f2056k
            if (r4 != r0) goto L26
            f7.a r4 = new f7.a
            r4.<init>(r0)
            goto L54
        L26:
            d7.o r0 = d7.o.f2057l
            if (r4 != r0) goto L30
            f7.a r4 = new f7.a
            r4.<init>(r0)
            goto L54
        L30:
            d7.o r0 = d7.o.f2058m
            if (r4 != r0) goto L3a
            f7.a r4 = new f7.a
            r4.<init>(r0)
            goto L54
        L3a:
            d7.o r0 = d7.o.f2059n
            if (r4 != r0) goto L44
            f7.a r4 = new f7.a
            r4.<init>(r0)
            goto L54
        L44:
            d7.o r0 = d7.o.f2060o
            if (r4 != r0) goto L4e
            d7.r r4 = new d7.r
            r4.<init>()
            goto L54
        L4e:
            d7.r r0 = new d7.r
            r0.<init>(r4)
            r4 = r0
        L54:
            o7.g r0 = r3.f2066o
            r0.P(r4)
        L59:
            return
    }

    @Override // d7.j
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            d7.o r1 = r2.S()
            r0.append(r1)
            java.lang.String r1 = ", scheme: "
            r0.append(r1)
            o7.g r1 = r2.f2066o
            k7.a r1 = r1.f9577k
            d7.q r1 = (d7.q) r1
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
