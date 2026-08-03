package ci;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public qg.e1 f1706h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public n.n f1707i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f1708j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f1709k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f1710l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m.q1 f1711m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f1712n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ n.k f1713o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ci.l0 f1714p;

    public g(m.q1 r1, long r2, n.k r4, ci.l0 r5, wf.c r6) {
            r0 = this;
            r0.f1711m = r1
            r0.f1712n = r2
            r0.f1713o = r4
            r0.f1714p = r5
            r1 = 2
            r0.<init>(r1, r6)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r8, wf.c r9) {
            r7 = this;
            ci.g r0 = new ci.g
            n.k r4 = r7.f1713o
            ci.l0 r5 = r7.f1714p
            m.q1 r1 = r7.f1711m
            long r2 = r7.f1712n
            r6 = r9
            r0.<init>(r1, r2, r4, r5, r6)
            r0.f1710l = r8
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            qg.t r1 = (qg.t) r1
            wf.c r2 = (wf.c) r2
            wf.c r1 = r0.create(r1, r2)
            ci.g r1 = (ci.g) r1
            sf.n r2 = sf.n.f12433a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            r17 = this;
            r0 = r17
            java.lang.Object r1 = r0.f1710l
            qg.t r1 = (qg.t) r1
            int r2 = r0.f1709k
            ci.l0 r4 = r0.f1714p
            r10 = 5
            r11 = 4
            r12 = 3
            r13 = 2
            r14 = 1
            n.k r15 = r0.f1713o
            r3 = 0
            xf.a r5 = xf.a.f21579g
            if (r2 == 0) goto L4c
            if (r2 == r14) goto L42
            if (r2 == r13) goto L3a
            if (r2 == r12) goto L2e
            if (r2 == r11) goto L28
            if (r2 != r10) goto L21
            goto L28
        L21:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r1)
            r1 = 0
            return r1
        L28:
            f8.i.I0(r18)
            r2 = r3
            goto Le1
        L2e:
            boolean r1 = r0.f1708j
            n.n r2 = r0.f1707i
            f8.i.I0(r18)
            r10 = r5
            r5 = r2
            r2 = r3
            goto Lad
        L3a:
            boolean r1 = r0.f1708j
            f8.i.I0(r18)
            r2 = r3
            r10 = r5
            goto L90
        L42:
            qg.e1 r1 = r0.f1706h
            f8.i.I0(r18)
            r2 = r3
            r10 = r5
            r3 = r18
            goto L74
        L4c:
            f8.i.I0(r18)
            r2 = r3
            c0.i r3 = new c0.i
            r8 = 0
            r9 = 1
            r7 = r5
            long r5 = r0.f1712n
            r16 = r7
            n.k r7 = r0.f1713o
            r10 = r16
            r3.<init>(r4, r5, r7, r8, r9)
            qg.e1 r1 = qg.v.q(r1, r2, r3, r12)
            r0.f1710l = r2
            r0.f1706h = r1
            r0.f1709k = r14
            m.q1 r3 = r0.f1711m
            java.lang.Object r3 = r3.T(r0)
            if (r3 != r10) goto L74
            goto Le0
        L74:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            boolean r5 = r1.b()
            if (r5 == 0) goto Lbe
            r0.f1710l = r2
            r0.f1706h = r2
            r0.f1708j = r3
            r0.f1709k = r13
            java.lang.Object r1 = qg.v.d(r1, r0)
            if (r1 != r10) goto L8f
            goto Le0
        L8f:
            r1 = r3
        L90:
            if (r1 == 0) goto Le1
            n.m r3 = new n.m
            r3.<init>()
            n.n r5 = new n.n
            r5.<init>(r3)
            r0.f1710l = r2
            r0.f1706h = r2
            r0.f1707i = r5
            r0.f1708j = r1
            r0.f1709k = r12
            java.lang.Object r3 = r15.a(r3, r0)
            if (r3 != r10) goto Lad
            goto Le0
        Lad:
            r0.f1710l = r2
            r0.f1706h = r2
            r0.f1707i = r2
            r0.f1708j = r1
            r0.f1709k = r11
            java.lang.Object r1 = r15.a(r5, r0)
            if (r1 != r10) goto Le1
            goto Le0
        Lbe:
            n.m r1 = r4.B
            if (r1 == 0) goto Le1
            if (r3 == 0) goto Lca
            n.n r5 = new n.n
            r5.<init>(r1)
            goto Lcf
        Lca:
            n.l r5 = new n.l
            r5.<init>(r1)
        Lcf:
            r0.f1710l = r2
            r0.f1706h = r2
            r0.f1707i = r2
            r0.f1708j = r3
            r1 = 5
            r0.f1709k = r1
            java.lang.Object r1 = r15.a(r5, r0)
            if (r1 != r10) goto Le1
        Le0:
            return r10
        Le1:
            r4.B = r2
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
