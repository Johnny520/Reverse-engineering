package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends yf.i implements fg.l {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i.l f5580h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public gg.q f5581i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5582j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i.c f5583k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f5584l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i.z0 f5585m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f5586n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ fg.l f5587o;

    public a(i.c r1, java.lang.Object r2, i.z0 r3, long r4, fg.l r6, wf.c r7) {
            r0 = this;
            r0.f5583k = r1
            r0.f5584l = r2
            r0.f5585m = r3
            r0.f5586n = r4
            r0.f5587o = r6
            r1 = 1
            r0.<init>(r1, r7)
            return
    }

    @Override // yf.a
    public final wf.c create(wf.c r9) {
            r8 = this;
            i.a r0 = new i.a
            long r4 = r8.f5586n
            fg.l r6 = r8.f5587o
            i.c r1 = r8.f5583k
            java.lang.Object r2 = r8.f5584l
            i.z0 r3 = r8.f5585m
            r7 = r9
            r0.<init>(r1, r2, r3, r4, r6, r7)
            return r0
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r2) {
            r1 = this;
            wf.c r2 = (wf.c) r2
            wf.c r2 = r1.create(r2)
            i.a r2 = (i.a) r2
            sf.n r0 = sf.n.f12433a
            java.lang.Object r2 = r2.invokeSuspend(r0)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            r14 = this;
            i.z0 r1 = r14.f5585m
            int r0 = r14.f5582j
            r2 = 1
            i.c r4 = r14.f5583k
            if (r0 == 0) goto L21
            if (r0 != r2) goto L1a
            gg.q r0 = r14.f5581i
            i.l r1 = r14.f5580h
            f8.i.I0(r15)     // Catch: java.util.concurrent.CancellationException -> L15
            r15 = r4
            goto L83
        L15:
            r0 = move-exception
            r15 = r0
        L17:
            r15 = r4
            goto L9a
        L1a:
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r15)
            r15 = 0
            return r15
        L21:
            f8.i.I0(r15)
            i.l r15 = r4.f5604c     // Catch: java.util.concurrent.CancellationException -> L97
            i.m1 r0 = r4.f5602a     // Catch: java.util.concurrent.CancellationException -> L97
            fg.l r0 = r0.f5730a     // Catch: java.util.concurrent.CancellationException -> L97
            java.lang.Object r3 = r14.f5584l     // Catch: java.util.concurrent.CancellationException -> L97
            java.lang.Object r0 = r0.invoke(r3)     // Catch: java.util.concurrent.CancellationException -> L97
            i.q r0 = (i.q) r0     // Catch: java.util.concurrent.CancellationException -> L97
            r15.f5720i = r0     // Catch: java.util.concurrent.CancellationException -> L97
            java.lang.Object r15 = r1.f5840c     // Catch: java.util.concurrent.CancellationException -> L97
            i0.j1 r0 = r4.f5606e     // Catch: java.util.concurrent.CancellationException -> L97
            r0.setValue(r15)     // Catch: java.util.concurrent.CancellationException -> L97
            i0.j1 r15 = r4.f5605d     // Catch: java.util.concurrent.CancellationException -> L97
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.util.concurrent.CancellationException -> L97
            r15.setValue(r0)     // Catch: java.util.concurrent.CancellationException -> L97
            i.l r15 = r4.f5604c     // Catch: java.util.concurrent.CancellationException -> L97
            i0.j1 r0 = r15.f5719h     // Catch: java.util.concurrent.CancellationException -> L97
            java.lang.Object r7 = r0.getValue()     // Catch: java.util.concurrent.CancellationException -> L97
            i.q r0 = r15.f5720i     // Catch: java.util.concurrent.CancellationException -> L97
            i.q r8 = i.d.i(r0)     // Catch: java.util.concurrent.CancellationException -> L97
            long r9 = r15.f5721j     // Catch: java.util.concurrent.CancellationException -> L97
            boolean r13 = r15.f5723l     // Catch: java.util.concurrent.CancellationException -> L97
            i.l r5 = new i.l     // Catch: java.util.concurrent.CancellationException -> L97
            i.m1 r6 = r15.f5718g     // Catch: java.util.concurrent.CancellationException -> L97
            r11 = -9223372036854775808
            r5.<init>(r6, r7, r8, r9, r11, r13)     // Catch: java.util.concurrent.CancellationException -> L97
            gg.q r7 = new gg.q     // Catch: java.util.concurrent.CancellationException -> L97
            r7.<init>()     // Catch: java.util.concurrent.CancellationException -> L97
            long r9 = r14.f5586n     // Catch: java.util.concurrent.CancellationException -> L97
            fg.l r6 = r14.f5587o     // Catch: java.util.concurrent.CancellationException -> L97
            c9.k r3 = new c9.k     // Catch: java.util.concurrent.CancellationException -> L97
            r8 = 5
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.util.concurrent.CancellationException -> L97
            r15 = r4
            r14.f5580h = r5     // Catch: java.util.concurrent.CancellationException -> L8a
            r14.f5581i = r7     // Catch: java.util.concurrent.CancellationException -> L8a
            r14.f5582j = r2     // Catch: java.util.concurrent.CancellationException -> L8a
            r4 = r3
            r0 = r5
            r2 = r9
            r5 = r14
            java.lang.Object r1 = i.d.d(r0, r1, r2, r4, r5)     // Catch: java.util.concurrent.CancellationException -> L8a
            r5 = r0
            xf.a r0 = xf.a.f21579g
            if (r1 != r0) goto L81
            return r0
        L81:
            r1 = r5
            r0 = r7
        L83:
            boolean r0 = r0.f4560g     // Catch: java.util.concurrent.CancellationException -> L8a
            if (r0 == 0) goto L8c
            i.h r0 = i.h.f5679g     // Catch: java.util.concurrent.CancellationException -> L8a
            goto L8e
        L8a:
            r0 = move-exception
            goto L9a
        L8c:
            i.h r0 = i.h.f5680h     // Catch: java.util.concurrent.CancellationException -> L8a
        L8e:
            i.c.b(r15)     // Catch: java.util.concurrent.CancellationException -> L8a
            i.i r2 = new i.i     // Catch: java.util.concurrent.CancellationException -> L8a
            r2.<init>(r1, r0)     // Catch: java.util.concurrent.CancellationException -> L8a
            return r2
        L97:
            r0 = move-exception
            goto L17
        L9a:
            i.c.b(r15)
            throw r0
    }
}
