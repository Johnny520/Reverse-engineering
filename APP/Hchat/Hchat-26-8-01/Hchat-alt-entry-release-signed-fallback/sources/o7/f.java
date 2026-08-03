package o7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends o7.e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j7.d f9571m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l7.c f9572n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d7.b f9573o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s7.e f9574p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o7.b f9575q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o7.b f9576r;

    public f() {
            r7 = this;
            r0 = 6
            r7.<init>(r0)
            j7.d r0 = new j7.d
            r0.<init>()
            r7.f9571m = r0
            l7.c r1 = new l7.c
            r2 = 1
            r1.<init>(r2)
            r7.f9572n = r1
            d7.b r2 = new d7.b
            r3 = 3
            r4 = 0
            r2.<init>(r4, r3)
            r7.f9573o = r2
            s7.e r3 = new s7.e
            r3.<init>(r4)
            r7.f9574p = r3
            o7.b r5 = new o7.b
            r5.<init>(r4)
            r7.f9575q = r5
            o7.b r6 = new o7.b
            r6.<init>(r4)
            r7.f9576r = r6
            r4 = 0
            r7.P(r4, r0)
            r0 = 1
            r7.P(r0, r1)
            r0 = 2
            r7.P(r0, r2)
            r0 = 3
            r7.P(r0, r3)
            r0 = 4
            r7.P(r0, r5)
            r0 = 5
            r7.P(r0, r6)
            return
    }

    @Override // k7.c, k7.a
    public final void B(q7.b r9) {
            r8 = this;
        L0:
            r9.getClass()
            p7.b r0 = p7.b.T(r9)
            if (r0 != 0) goto Lb
            goto L1b6
        Lb:
            int r1 = r9.f10666k
            int r0 = r0.Q()
            r2 = 14
            r3 = 0
            java.lang.Class<o7.j> r4 = o7.j.class
            r5 = 0
            j7.d r6 = r8.f9571m
            if (r0 != r2) goto La9
            p7.g r0 = new p7.g
            r0.<init>()
            int r2 = r9.available()
            int r7 = r0.p()
            if (r2 < r7) goto L9f
            int r2 = r9.f10666k
            r0.G(r9)
            r9.g(r2)
            r7.c r0 = r0.f10286r
            byte[] r0 = r0.f11553k
            r0 = r0[r5]
            o7.j r2 = r6.k0(r0)
            if (r2 == 0) goto L3f
            goto L98
        L3f:
            k7.a r2 = r6.P()
            o7.j r2 = (o7.j) r2
            l7.j r5 = r2.f9585l
            p7.a r6 = r5.f7869m
            p7.g r6 = (p7.g) r6
            r7.c r6 = r6.f10286r
            r6.P(r0)
            k7.a r4 = r5.u(r4)
            o7.j r4 = (o7.j) r4
            if (r4 == 0) goto L5a
            j7.e r3 = r4.f9586m
        L5a:
            r3.f6773m = r0
            z7.c r3 = r3.f9563k
            java.util.Iterator r3 = r3.iterator()
        L62:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L78
            java.lang.Object r4 = r3.next()
            l7.m r4 = (l7.m) r4
            p7.a r4 = r4.f7869m
            p7.k r4 = (p7.k) r4
            r7.c r4 = r4.f10298r
            r4.P(r0)
            goto L62
        L78:
            j7.e r3 = r2.f9586m
            r3.f6773m = r0
            z7.c r3 = r3.f9563k
            java.util.Iterator r3 = r3.iterator()
        L82:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L98
            java.lang.Object r4 = r3.next()
            l7.m r4 = (l7.m) r4
            p7.a r4 = r4.f7869m
            p7.k r4 = (p7.k) r4
            r7.c r4 = r4.f10298r
            r4.P(r0)
            goto L82
        L98:
            l7.j r0 = r2.f9585l
            r0.G(r9)
            goto L1b0
        L9f:
            java.lang.String r0 = "Too few bytes to read spec header, available = "
            int r9 = r9.available()
            j8.o.u(r9, r0)
            return
        La9:
            r2 = 13
            if (r0 != r2) goto L124
            p7.k r0 = p7.k.U(r9)
            r7.c r0 = r0.f10298r
            byte[] r0 = r0.f11553k
            r0 = r0[r5]
            o7.j r2 = r6.k0(r0)
            if (r2 == 0) goto Lbe
            goto L117
        Lbe:
            k7.a r2 = r6.P()
            o7.j r2 = (o7.j) r2
            l7.j r5 = r2.f9585l
            p7.a r6 = r5.f7869m
            p7.g r6 = (p7.g) r6
            r7.c r6 = r6.f10286r
            r6.P(r0)
            k7.a r4 = r5.u(r4)
            o7.j r4 = (o7.j) r4
            if (r4 == 0) goto Ld9
            j7.e r3 = r4.f9586m
        Ld9:
            r3.f6773m = r0
            z7.c r3 = r3.f9563k
            java.util.Iterator r3 = r3.iterator()
        Le1:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lf7
            java.lang.Object r4 = r3.next()
            l7.m r4 = (l7.m) r4
            p7.a r4 = r4.f7869m
            p7.k r4 = (p7.k) r4
            r7.c r4 = r4.f10298r
            r4.P(r0)
            goto Le1
        Lf7:
            j7.e r3 = r2.f9586m
            r3.f6773m = r0
            z7.c r3 = r3.f9563k
            java.util.Iterator r3 = r3.iterator()
        L101:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L117
            java.lang.Object r4 = r3.next()
            l7.m r4 = (l7.m) r4
            p7.a r4 = r4.f7869m
            p7.k r4 = (p7.k) r4
            r7.c r4 = r4.f10298r
            r4.P(r0)
            goto L101
        L117:
            j7.e r0 = r2.f9586m
            k7.a r0 = r0.P()
            l7.m r0 = (l7.m) r0
            r0.G(r9)
            goto L1b0
        L124:
            r2 = 15
            if (r0 != r2) goto L167
            l7.c r0 = new l7.c
            r2 = 1
            r0.<init>(r2)
            r0.G(r9)
            l7.c r2 = r8.f9572n
            r2.getClass()
            o7.b r0 = r0.f7873p
            j7.a r0 = (j7.a) r0
            r0.getClass()
            java.util.Iterator r0 = r0.j0(r5)
        L141:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L1b0
            java.lang.Object r3 = r0.next()
            v7.g r3 = (v7.g) r3
            o7.b r4 = r2.f7873p
            j7.a r4 = (j7.a) r4
            if (r3 != 0) goto L154
            goto L141
        L154:
            r4.M(r3)
            p7.a r3 = r2.f7869m
            p7.c r3 = (p7.c) r3
            r7.f r3 = r3.f10273r
            z7.c r4 = r4.f9563k
            int r4 = r4.size()
            r3.k(r4)
            goto L141
        L167:
            r2 = 16
            if (r0 != r2) goto L17d
            s7.e r0 = r8.f9574p
            r0.getClass()
            l7.c r2 = new l7.c
            r3 = 2
            r2.<init>(r3)
            r0.M(r2)
            r2.G(r9)
            goto L1b0
        L17d:
            r2 = 17
            if (r0 != r2) goto L190
            l7.c r0 = new l7.c
            r2 = 0
            r0.<init>(r2)
            o7.b r2 = r8.f9575q
            r2.M(r0)
            r0.G(r9)
            goto L1b0
        L190:
            r2 = 18
            if (r0 != r2) goto L1a2
            l7.k r0 = new l7.k
            r0.<init>()
            r0.G(r9)
            d7.b r2 = r8.f9573o
            r2.M(r0)
            goto L1b0
        L1a2:
            l7.j r0 = new l7.j
            r2 = 1
            r0.<init>(r2)
            r0.G(r9)
            o7.b r2 = r8.f9576r
            r2.M(r0)
        L1b0:
            int r0 = r9.f10666k
            if (r1 == r0) goto L1b6
            goto L0
        L1b6:
            return
    }
}
