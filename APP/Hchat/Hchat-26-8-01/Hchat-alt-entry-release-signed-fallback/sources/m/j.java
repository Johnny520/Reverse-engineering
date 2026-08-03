package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8210h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f8211i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m.k f8212j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ m.g3 f8213k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m.f f8214l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f8215m;

    public j(m.k r1, m.g3 r2, m.f r3, long r4, wf.c r6) {
            r0 = this;
            r0.f8212j = r1
            r0.f8213k = r2
            r0.f8214l = r3
            r0.f8215m = r4
            r1 = 2
            r0.<init>(r1, r6)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r8, wf.c r9) {
            r7 = this;
            m.j r0 = new m.j
            m.f r3 = r7.f8214l
            long r4 = r7.f8215m
            m.k r1 = r7.f8212j
            m.g3 r2 = r7.f8213k
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r6)
            r0.f8211i = r8
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            qg.t r1 = (qg.t) r1
            wf.c r2 = (wf.c) r2
            wf.c r1 = r0.create(r1, r2)
            m.j r1 = (m.j) r1
            sf.n r2 = sf.n.f12433a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            r13 = this;
            m.k r2 = r13.f8212j
            m.c r8 = r2.f8237y
            int r0 = r13.f8210h
            r9 = 1
            r10 = 0
            r11 = 0
            if (r0 == 0) goto L1f
            if (r0 != r9) goto L18
            f8.i.I0(r14)     // Catch: java.lang.Throwable -> L11 java.util.concurrent.CancellationException -> L14
            goto L4b
        L11:
            r0 = move-exception
            r14 = r0
            goto L59
        L14:
            r0 = move-exception
            r14 = r0
            r11 = r14
            goto L58
        L18:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r14)
            r14 = 0
            return r14
        L1f:
            f8.i.I0(r14)
            java.lang.Object r14 = r13.f8211i
            qg.t r14 = (qg.t) r14
            wf.g r14 = r14.n()
            qg.r0 r6 = qg.v.k(r14)
            r2.B = r9     // Catch: java.lang.Throwable -> L11 java.util.concurrent.CancellationException -> L14
            m.o2 r14 = r2.f8234v     // Catch: java.lang.Throwable -> L11 java.util.concurrent.CancellationException -> L14
            k.d1 r12 = k.d1.f6939g     // Catch: java.lang.Throwable -> L11 java.util.concurrent.CancellationException -> L14
            h0.a1 r0 = new h0.a1     // Catch: java.lang.Throwable -> L11 java.util.concurrent.CancellationException -> L14
            m.g3 r1 = r13.f8213k     // Catch: java.lang.Throwable -> L11 java.util.concurrent.CancellationException -> L14
            m.f r3 = r13.f8214l     // Catch: java.lang.Throwable -> L11 java.util.concurrent.CancellationException -> L14
            long r4 = r13.f8215m     // Catch: java.lang.Throwable -> L11 java.util.concurrent.CancellationException -> L14
            r7 = 0
            r0.<init>(r1, r2, r3, r4, r6, r7)     // Catch: java.lang.Throwable -> L11 java.util.concurrent.CancellationException -> L14
            r13.f8210h = r9     // Catch: java.lang.Throwable -> L11 java.util.concurrent.CancellationException -> L14
            java.lang.Object r14 = r14.f(r12, r0, r13)     // Catch: java.lang.Throwable -> L11 java.util.concurrent.CancellationException -> L14
            xf.a r0 = xf.a.f21579g
            if (r14 != r0) goto L4b
            return r0
        L4b:
            r8.b()     // Catch: java.lang.Throwable -> L11 java.util.concurrent.CancellationException -> L14
            r2.B = r10
            r8.a(r11)
            r2.f8238z = r10
            sf.n r14 = sf.n.f12433a
            return r14
        L58:
            throw r11     // Catch: java.lang.Throwable -> L11
        L59:
            r2.B = r10
            r8.a(r11)
            r2.f8238z = r10
            throw r14
    }
}
