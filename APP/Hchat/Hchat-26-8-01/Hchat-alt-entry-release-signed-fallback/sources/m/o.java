package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public gg.r f8288h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i.l f8289i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8290j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f8291k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m.p f8292l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m.k2 f8293m;

    public o(float r1, m.p r2, m.k2 r3, wf.c r4) {
            r0 = this;
            r0.f8291k = r1
            r0.f8292l = r2
            r0.f8293m = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r4, wf.c r5) {
            r3 = this;
            m.o r4 = new m.o
            m.p r0 = r3.f8292l
            m.k2 r1 = r3.f8293m
            float r2 = r3.f8291k
            r4.<init>(r2, r0, r1, r5)
            return r4
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            qg.t r1 = (qg.t) r1
            wf.c r2 = (wf.c) r2
            wf.c r1 = r0.create(r1, r2)
            m.o r1 = (m.o) r1
            sf.n r2 = sf.n.f12433a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.f8290j
            r1 = 1
            if (r0 == 0) goto L16
            if (r0 != r1) goto Lf
            i.l r0 = r8.f8289i
            gg.r r1 = r8.f8288h
            f8.i.I0(r9)     // Catch: java.util.concurrent.CancellationException -> L57
            goto L69
        Lf:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r9)
            r9 = 0
            return r9
        L16:
            f8.i.I0(r9)
            float r9 = r8.f8291k
            float r0 = java.lang.Math.abs(r9)
            r2 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L6b
            gg.r r5 = new gg.r
            r5.<init>()
            r5.f4561g = r9
            gg.r r3 = new gg.r
            r3.<init>()
            r0 = 0
            r2 = 28
            i.l r0 = i.d.b(r0, r9, r2)
            m.p r6 = r8.f8292l     // Catch: java.util.concurrent.CancellationException -> L56
            i.u r9 = r6.f8318a     // Catch: java.util.concurrent.CancellationException -> L56
            m.k2 r4 = r8.f8293m     // Catch: java.util.concurrent.CancellationException -> L56
            c9.k r2 = new c9.k     // Catch: java.util.concurrent.CancellationException -> L56
            r7 = 8
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.util.concurrent.CancellationException -> L56
            r8.f8288h = r5     // Catch: java.util.concurrent.CancellationException -> L56
            r8.f8289i = r0     // Catch: java.util.concurrent.CancellationException -> L56
            r8.f8290j = r1     // Catch: java.util.concurrent.CancellationException -> L56
            java.lang.Object r9 = i.d.f(r0, r9, r2, r8)     // Catch: java.util.concurrent.CancellationException -> L56
            xf.a r0 = xf.a.f21579g
            if (r9 != r0) goto L54
            return r0
        L54:
            r1 = r5
            goto L69
        L56:
            r1 = r5
        L57:
            i.m1 r9 = r0.f5718g
            fg.l r9 = r9.f5731b
            i.q r0 = r0.f5720i
            java.lang.Object r9 = r9.invoke(r0)
            java.lang.Number r9 = (java.lang.Number) r9
            float r9 = r9.floatValue()
            r1.f4561g = r9
        L69:
            float r9 = r1.f4561g
        L6b:
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r9)
            return r0
    }
}
