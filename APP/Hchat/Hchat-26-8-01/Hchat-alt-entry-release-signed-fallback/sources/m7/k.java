package m7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends o7.e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m7.v f8751m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m7.t f8752n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d7.b f8753o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m7.l f8754p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d7.b f8755q;

    public k() {
            r7 = this;
            r0 = 5
            r7.<init>(r0)
            d7.b r0 = new d7.b
            r1 = 1
            r2 = 0
            r0.<init>(r2, r1)
            m7.v r1 = new m7.v
            r1.<init>(r0)
            r7.f8751m = r1
            m7.l r3 = new m7.l
            r3.<init>()
            m7.t r4 = new m7.t
            r4.<init>(r3)
            r7.f8752n = r4
            d7.b r5 = new d7.b
            r6 = 2
            r5.<init>(r2, r6)
            r7.f8753o = r5
            r7.f8754p = r3
            r7.f8755q = r0
            r2 = 0
            r7.P(r2, r1)
            r1 = 1
            r7.P(r1, r4)
            r1 = 2
            r7.P(r1, r5)
            r1 = 3
            r7.P(r1, r3)
            r1 = 4
            r7.P(r1, r0)
            return
    }

    @Override // k7.c, k7.a
    public final void B(q7.b r14) {
            r13 = this;
            z7.c r0 = new z7.c
            r1 = 0
            r0.<init>(r1)
            r2 = r1
        L7:
            boolean r3 = r14.b()
            if (r3 == 0) goto L157
            p7.b r3 = p7.b.T(r14)
            java.lang.Class<m7.j> r4 = m7.j.class
            r5 = 0
            r6 = 1
            r7 = 9
            r8 = 5
            r9 = 8
            r10 = 7
            r11 = 6
            if (r1 != 0) goto La4
            int r12 = r3.Q()
            if (r12 != r10) goto L29
            m7.t r5 = r13.f8752n
            r1 = r6
            goto L14f
        L29:
            if (r12 == r9) goto L9e
            if (r12 != r8) goto L55
            m7.v r3 = r13.f8751m
            r3.getClass()
            m7.m r4 = new m7.m
            r4.<init>()
            m7.u r5 = new m7.u
            r5.<init>(r4)
            m7.m r6 = r5.f8774s
            if (r6 != r4) goto L4f
            r4.f8756q = r5
            r3.M(r5)
            d7.b r3 = r3.f8775n
            r3.M(r4)
            r0.add(r6)
            goto L14f
        L4f:
            java.lang.String r14 = "Invalid start namespace: "
            g1.d.f(r5, r14)
            return
        L55:
            if (r12 != r11) goto L75
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L69
            int r3 = r0.size()
            int r3 = r3 - r6
            java.lang.Object r3 = r0.remove(r3)
            r5 = r3
            m7.m r5 = (m7.m) r5
        L69:
            if (r5 != 0) goto L14f
            l7.j r5 = new l7.j
            r1 = 1
            r5.<init>(r1)
            r1 = r6
            r2 = r1
            goto L14f
        L75:
            if (r12 != r7) goto L98
            k7.a r3 = r13.v(r4)
            m7.j r3 = (m7.j) r3
            m7.i r3 = r3.S()
            r3.getClass()
            m7.x r5 = new m7.x
            m7.w r4 = new m7.w
            r4.<init>()
            r6 = 0
            r5.<init>(r4, r6)
            d7.b r3 = r3.R()
            r3.M(r5)
            goto L14f
        L98:
            java.lang.String r14 = "Unexpected chunk: "
            j8.o.j(r3, r14)
            return
        L9e:
            java.lang.String r14 = "END element detected before START: "
            j8.o.j(r3, r14)
            return
        La4:
            if (r2 != 0) goto L131
            int r3 = r3.Q()
            if (r3 != r9) goto Lb1
            m7.l r5 = r13.f8754p
            r2 = r6
            goto L14f
        Lb1:
            if (r3 != r11) goto Lcf
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto Lc5
            int r3 = r0.size()
            int r3 = r3 - r6
            java.lang.Object r3 = r0.remove(r3)
            r5 = r3
            m7.m r5 = (m7.m) r5
        Lc5:
            if (r5 != 0) goto L14f
            l7.j r5 = new l7.j
            r3 = 1
            r5.<init>(r3)
            goto L14f
        Lcf:
            if (r3 == r10) goto L116
            if (r3 != r8) goto Ld4
            goto L116
        Ld4:
            if (r3 != r7) goto Lf2
            k7.a r3 = r13.v(r4)
            m7.j r3 = (m7.j) r3
            r3.getClass()
            m7.x r5 = new m7.x
            m7.w r4 = new m7.w
            r4.<init>()
            r6 = 0
            r5.<init>(r4, r6)
            d7.b r3 = r3.R()
            r3.M(r5)
            goto L14f
        Lf2:
            r5 = 4
            if (r3 != r5) goto L10b
            k7.a r3 = r13.v(r4)
            m7.j r3 = (m7.j) r3
            r3.getClass()
            m7.f r5 = new m7.f
            r5.<init>()
            d7.b r3 = r3.R()
            r3.M(r5)
            goto L14f
        L10b:
            k7.a r3 = r13.v(r4)
            m7.j r3 = (m7.j) r3
            m7.x r5 = r3.T(r6)
            goto L14f
        L116:
            k7.a r3 = r13.v(r4)
            m7.j r3 = (m7.j) r3
            r3.getClass()
            m7.j r5 = new m7.j
            m7.k r4 = new m7.k
            r4.<init>()
            r5.<init>(r4)
            d7.b r3 = r3.R()
            r3.M(r5)
            goto L14f
        L131:
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L14f
            int r3 = r3.Q()
            if (r3 != r11) goto L14f
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L14f
            int r3 = r0.size()
            int r3 = r3 - r6
            java.lang.Object r3 = r0.remove(r3)
            r5 = r3
            m7.m r5 = (m7.m) r5
        L14f:
            if (r5 != 0) goto L152
            goto L157
        L152:
            r5.G(r14)
            goto L7
        L157:
            return
    }
}
