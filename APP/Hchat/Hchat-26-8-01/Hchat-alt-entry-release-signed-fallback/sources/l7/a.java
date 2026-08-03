package l7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends o7.d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p7.a f7869m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public r7.a f7870n;

    public a(p7.a r2, int r3) {
            r1 = this;
            o7.g r0 = new o7.g
            r0.<init>()
            r1.<init>(r2, r0, r3)
            return
    }

    public a(p7.a r2, o7.g r3, int r4) {
            r1 = this;
            if (r3 != 0) goto L4
            r0 = 2
            goto L5
        L4:
            r0 = 3
        L5:
            int r4 = r4 + r0
            r1.<init>(r4)
            r1.f7869m = r2
            r1.P(r2)
            if (r3 == 0) goto L13
            r1.P(r3)
        L13:
            return
    }

    @Override // k7.c, k7.a
    public void B(q7.b r3) {
            r2 = this;
            r3.getClass()
            p7.b r0 = p7.b.T(r3)
            r2.Q(r0)
            r7.f r1 = r0.f10270o
            int r1 = r1.f11560n
            q7.b r1 = r3.a(r1)
            r2.T(r1)
            r7.f r0 = r0.f10270o
            int r0 = r0.f11560n
            r3.c(r0)
            r1.close()
            r2.R()
            return
    }

    @Override // o7.d, k7.c
    public final void N() {
            r4 = this;
            r7.a r0 = r4.f7870n
            r1 = 0
            if (r0 != 0) goto L10
            r7.a r0 = new r7.a
            r2 = 0
            r0.<init>(r2, r1)
            r4.P(r0)
            r4.f7870n = r0
        L10:
            r0.O(r1)
            r0.M(r1, r1)
            int r1 = r4.p()
            r0.N(r1)
            p7.a r0 = r4.f7869m
            int r1 = r0.p()
            short r1 = (short) r1
            r7.a r2 = r0.f10269n
            r3 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r3
            r2.k(r1)
            k7.a r1 = r0.f7389h
            if (r1 != 0) goto L32
            goto L3b
        L32:
            int r1 = r1.p()
            r7.f r0 = r0.f10270o
            r0.k(r1)
        L3b:
            r4.S()
            return
    }

    public void Q(p7.b r3) {
            r2 = this;
            int r0 = r3.Q()
            if (r0 == 0) goto La
            r1 = 1
            if (r0 == r1) goto La
            return
        La:
            java.lang.String r0 = "Invalid chunk: "
            j8.o.j(r3, r0)
            return
    }

    public void R() {
            r0 = this;
            return
    }

    public abstract void S();

    public final void T(q7.b r4) {
            r3 = this;
            r7.a r0 = r3.f7870n
            r1 = 0
            if (r0 != 0) goto L10
            r7.a r0 = new r7.a
            r2 = 0
            r0.<init>(r2, r1)
            r3.P(r0)
            r3.f7870n = r0
        L10:
            r0.O(r1)
            super.B(r4)
            int r1 = r4.f10666k
            r0.N(r1)
            int r1 = r0.p()
            int r2 = r4.available()
            if (r1 == 0) goto L2c
            if (r2 < r1) goto L2c
            byte[] r0 = r0.f11553k
            r4.e(r0, r1)
        L2c:
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            p7.a r1 = r2.f7869m
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
