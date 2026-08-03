package w0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends yf.h implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long[] f14769g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14770h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14771i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f14772j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f14773k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w0.j f14774l;

    public i(w0.j r1, wf.c r2) {
            r0 = this;
            r0.f14774l = r1
            r0.<init>(r2)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r3, wf.c r4) {
            r2 = this;
            w0.i r0 = new w0.i
            w0.j r1 = r2.f14774l
            r0.<init>(r1, r4)
            r0.f14773k = r3
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            ng.l r1 = (ng.l) r1
            wf.c r2 = (wf.c) r2
            wf.c r1 = r0.create(r1, r2)
            w0.i r1 = (w0.i) r1
            sf.n r2 = sf.n.f12433a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            r22 = this;
            r0 = r22
            w0.j r1 = r0.f14774l
            long r2 = r1.f14776g
            long r4 = r1.f14778i
            long r6 = r1.f14777h
            int r8 = r0.f14772j
            r9 = 0
            r12 = 3
            r13 = 2
            r14 = 64
            r16 = 0
            r18 = 1
            r10 = 1
            xf.a r11 = xf.a.f21579g
            if (r8 == 0) goto L4c
            if (r8 == r10) goto L3d
            if (r8 == r13) goto L33
            if (r8 != r12) goto L2c
            int r1 = r0.f14770h
            java.lang.Object r6 = r0.f14773k
            ng.l r6 = (ng.l) r6
            f8.i.I0(r23)
            r7 = r12
            goto Lbe
        L2c:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r1)
            r1 = 0
            return r1
        L33:
            int r1 = r0.f14770h
            java.lang.Object r8 = r0.f14773k
            ng.l r8 = (ng.l) r8
            f8.i.I0(r23)
            goto L94
        L3d:
            int r1 = r0.f14771i
            int r8 = r0.f14770h
            long[] r15 = r0.f14769g
            java.lang.Object r12 = r0.f14773k
            ng.l r12 = (ng.l) r12
            f8.i.I0(r23)
            int r8 = r8 + r10
            goto L5a
        L4c:
            f8.i.I0(r23)
            java.lang.Object r8 = r0.f14773k
            r12 = r8
            ng.l r12 = (ng.l) r12
            long[] r15 = r1.f14779j
            if (r15 == 0) goto L71
            int r1 = r15.length
            r8 = 0
        L5a:
            if (r8 >= r1) goto L71
            r2 = r15[r8]
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r2)
            r0.f14773k = r12
            r0.f14769g = r15
            r0.f14770h = r8
            r0.f14771i = r1
            r0.f14772j = r10
            r12.a(r4, r0)
            return r11
        L71:
            int r1 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r1 == 0) goto L97
            r8 = r12
            r1 = 0
        L77:
            if (r1 >= r14) goto L96
            long r20 = r18 << r1
            long r20 = r6 & r20
            int r12 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r12 == 0) goto L94
            long r2 = (long) r1
            long r4 = r4 + r2
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r4)
            r0.f14773k = r8
            r0.f14769g = r9
            r0.f14770h = r1
            r0.f14772j = r13
            r8.a(r2, r0)
            return r11
        L94:
            int r1 = r1 + r10
            goto L77
        L96:
            r12 = r8
        L97:
            int r1 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r1 == 0) goto Lc1
            r6 = r12
            r15 = 0
        L9d:
            if (r15 >= r14) goto Lc1
            long r7 = r18 << r15
            long r7 = r7 & r2
            int r1 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r1 == 0) goto Lbc
            long r1 = (long) r15
            long r4 = r4 + r1
            long r1 = (long) r14
            long r4 = r4 + r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r4)
            r0.f14773k = r6
            r0.f14769g = r9
            r0.f14770h = r15
            r7 = 3
            r0.f14772j = r7
            r6.a(r1, r0)
            return r11
        Lbc:
            r7 = 3
            r1 = r15
        Lbe:
            int r15 = r1 + 1
            goto L9d
        Lc1:
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
