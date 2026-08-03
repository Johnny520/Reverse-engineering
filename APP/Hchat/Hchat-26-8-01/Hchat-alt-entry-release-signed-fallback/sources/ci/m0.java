package ci;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1753h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1754i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ float f1755j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1756k;

    public m0(ci.n0 r2, float r3, wf.c r4) {
            r1 = this;
            r0 = 0
            r1.f1753h = r0
            r1.f1756k = r2
            r1.f1755j = r3
            r2 = 2
            r1.<init>(r2, r4)
            return
    }

    public m0(e2.c r2, wf.c r3) {
            r1 = this;
            r0 = 1
            r1.f1753h = r0
            r1.f1756k = r2
            r2 = 2
            r1.<init>(r2, r3)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r3, wf.c r4) {
            r2 = this;
            int r0 = r2.f1753h
            switch(r0) {
                case 0: goto L17;
                default: goto L5;
            }
        L5:
            ci.m0 r0 = new ci.m0
            java.lang.Object r1 = r2.f1756k
            e2.c r1 = (e2.c) r1
            r0.<init>(r1, r4)
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            r0.f1755j = r3
            return r0
        L17:
            ci.m0 r3 = new ci.m0
            java.lang.Object r0 = r2.f1756k
            ci.n0 r0 = (ci.n0) r0
            float r1 = r2.f1755j
            r3.<init>(r0, r1, r4)
            return r3
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f1753h
            switch(r0) {
                case 0: goto L1e;
                default: goto L5;
            }
        L5:
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            wf.c r3 = (wf.c) r3
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            wf.c r2 = r1.create(r2, r3)
            ci.m0 r2 = (ci.m0) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
        L1e:
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            wf.c r2 = r1.create(r2, r3)
            ci.m0 r2 = (ci.m0) r2
            sf.n r3 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r3)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.f1753h
            switch(r0) {
                case 0: goto L7d;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r9.f1756k
            e2.c r0 = (e2.c) r0
            int r1 = r9.f1754i
            r2 = 1
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            if (r1 == 0) goto L20
            if (r1 != r2) goto L19
            f8.i.I0(r10)
            goto L65
        L19:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r10)
            r10 = 0
            goto L75
        L20:
            f8.i.I0(r10)
            float r10 = r9.f1755j
            f2.q r1 = r0.f2320a
            f2.m r1 = r1.f3213d
            f2.x r5 = f2.l.f3182e
            f.k0 r1 = r1.f3204g
            java.lang.Object r1 = r1.g(r5)
            if (r1 != 0) goto L34
            r1 = 0
        L34:
            fg.p r1 = (fg.p) r1
            if (r1 == 0) goto L76
            f2.q r0 = r0.f2320a
            f2.m r0 = r0.f3213d
            f2.x r5 = f2.u.f3244v
            java.lang.Object r0 = r0.d(r5)
            f2.j r0 = (f2.j) r0
            r0 = 0
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r5 = (long) r0
            int r10 = java.lang.Float.floatToRawIntBits(r10)
            long r7 = (long) r10
            r10 = 32
            long r5 = r5 << r10
            long r7 = r7 & r3
            long r5 = r5 | r7
            e1.b r10 = new e1.b
            r10.<init>(r5)
            r9.f1754i = r2
            java.lang.Object r10 = r1.invoke(r10, r9)
            xf.a r0 = xf.a.f21579g
            if (r10 != r0) goto L65
        L63:
            r10 = r0
            goto L75
        L65:
            e1.b r10 = (e1.b) r10
            long r0 = r10.f2294a
            long r0 = r0 & r3
            int r10 = (int) r0
            float r10 = java.lang.Float.intBitsToFloat(r10)
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r10)
            goto L63
        L75:
            return r10
        L76:
            java.lang.String r10 = "Required value was null."
            af.d r10 = wb.en.a(r10)
            throw r10
        L7d:
            java.lang.Object r0 = r9.f1756k
            ci.n0 r0 = (ci.n0) r0
            int r1 = r9.f1754i
            r2 = 1
            if (r1 == 0) goto L93
            if (r1 != r2) goto L8c
            f8.i.I0(r10)
            goto Lb4
        L8c:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r10)
            r10 = 0
            goto Lb6
        L93:
            f8.i.I0(r10)
            r10 = r0
            i.c r0 = r10.f1762w
            float r1 = r9.f1755j
            r3 = r1
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r3)
            i.r0 r10 = r10.f1761v
            r9.f1754i = r2
            r3 = 0
            r5 = 12
            r4 = r9
            r2 = r10
            java.lang.Object r10 = i.c.c(r0, r1, r2, r3, r4, r5)
            xf.a r0 = xf.a.f21579g
            if (r10 != r0) goto Lb4
            r10 = r0
            goto Lb6
        Lb4:
            sf.n r10 = sf.n.f12433a
        Lb6:
            return r10
    }
}
