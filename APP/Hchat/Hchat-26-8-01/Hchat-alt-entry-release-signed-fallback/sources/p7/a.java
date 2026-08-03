package p7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class a extends o7.d implements q7.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r7.a f10268m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r7.a f10269n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final r7.f f10270o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public l7.j f10271p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final r7.c f10272q;

    public a(short r6) {
            r5 = this;
            r0 = 3
            r5.<init>(r0)
            r7.a r0 = new r7.a
            r0.<init>(r6)
            r5.f10268m = r0
            r7.a r6 = new r7.a
            r1 = 1
            r2 = 0
            r6.<init>(r1, r2)
            r5.f10269n = r6
            r7.f r1 = new r7.f
            r1.<init>(r2)
            r5.f10270o = r1
            r7.c r3 = new r7.c
            r4 = 0
            r3.<init>(r2, r4)
            r5.f10272q = r3
            r5.P(r0)
            r5.P(r6)
            r5.P(r1)
            r0.f7391j = r5
            r6.f7391j = r5
            r1.f7391j = r5
            return
    }

    @Override // k7.c, k7.a
    public void B(q7.b r3) {
            r2 = this;
            int r0 = r3.f10666k
            super.B(r3)
            int r1 = r3.f10666k
            int r1 = r1 - r0
            r7.a r0 = r2.f10269n
            int r0 = r0.f11551o
            int r0 = r0 - r1
            r7.c r1 = r2.f10272q
            r2.R(r1, r0)
            byte[] r0 = r1.f11553k
            int r0 = r0.length
            if (r0 <= 0) goto L1a
            r1.G(r3)
        L1a:
            return
    }

    @Override // o7.d, k7.c
    public final void N() {
            r0 = this;
            return
    }

    @Override // k7.c
    public final void O() {
            r0 = this;
            return
    }

    public final int Q() {
            r7 = this;
            r7.a r0 = r7.f10268m
            int r0 = r0.f11551o
            short r0 = (short) r0
            r1 = 18
            int[] r1 = t3.c.c(r1)
            int r2 = r1.length
            r3 = 0
            r4 = r3
        Le:
            if (r4 >= r2) goto L1c
            r5 = r1[r4]
            short r6 = j8.b.c(r5)
            if (r6 != r0) goto L19
            return r5
        L19:
            int r4 = r4 + 1
            goto Le
        L1c:
            return r3
    }

    public void R(r7.c r2, int r3) {
            r1 = this;
            if (r3 != 0) goto L3
            return
        L3:
            k7.a r0 = r2.f7389h
            if (r0 != 0) goto La
            r1.P(r2)
        La:
            r2.Q(r3)
            return
    }

    public void S(int r1) {
            r0 = this;
            return
    }

    @Override // q7.a
    public final void m(k7.a r3) {
            r2 = this;
            r7.a r0 = r2.f10268m
            if (r3 != r0) goto L7
            int r3 = r0.f11551o
            return
        L7:
            r7.a r0 = r2.f10269n
            if (r3 != r0) goto L11
            int r3 = r0.f11551o
            r2.S(r3)
            return
        L11:
            r7.f r1 = r2.f10270o
            if (r3 != r1) goto L25
            int r3 = r0.f11551o
            int r0 = r1.f11560n
            l7.j r1 = r2.f10271p
            if (r1 == 0) goto L25
            r7.b r1 = r1.f7883p
            r7.c r1 = (r7.c) r1
            int r0 = r0 - r3
            r1.Q(r0)
        L25:
            return
    }

    public java.lang.String toString() {
            r7 = this;
            r7.a r0 = r7.f10268m
            int r0 = r0.f11551o
            short r0 = (short) r0
            r1 = 18
            int[] r1 = t3.c.c(r1)
            int r2 = r1.length
            r3 = 0
            r4 = r3
        Le:
            if (r4 >= r2) goto L1d
            r5 = r1[r4]
            short r6 = j8.b.c(r5)
            if (r6 != r0) goto L1a
            r3 = r5
            goto L1d
        L1a:
            int r4 = r4 + 1
            goto Le
        L1d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r3 == 0) goto L2c
            java.lang.String r0 = j8.b.b(r3)
            r1.append(r0)
            goto L38
        L2c:
            java.lang.String r2 = "Unknown type="
            r1.append(r2)
            java.lang.String r0 = y7.a.o(r0)
            r1.append(r0)
        L38:
            java.lang.String r0 = "{ValueHeader="
            r1.append(r0)
            r7.a r0 = r7.f10269n
            int r0 = r0.f11551o
            r1.append(r0)
            java.lang.String r0 = ", Chunk="
            r1.append(r0)
            r7.f r0 = r7.f10270o
            int r0 = r0.f11560n
            java.lang.String r2 = "}"
            java.lang.String r0 = j8.b.j(r1, r0, r2)
            return r0
    }
}
