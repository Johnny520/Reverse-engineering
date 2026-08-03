package x2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f21113h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f21114i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x2.h f21115j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f21116k;

    public e(boolean r1, x2.h r2, long r3, wf.c r5) {
            r0 = this;
            r0.f21114i = r1
            r0.f21115j = r2
            r0.f21116k = r3
            r1 = 2
            r0.<init>(r1, r5)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r7, wf.c r8) {
            r6 = this;
            x2.e r0 = new x2.e
            x2.h r2 = r6.f21115j
            long r3 = r6.f21116k
            boolean r1 = r6.f21114i
            r5 = r8
            r0.<init>(r1, r2, r3, r5)
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            qg.t r1 = (qg.t) r1
            wf.c r2 = (wf.c) r2
            wf.c r1 = r0.create(r1, r2)
            x2.e r1 = (x2.e) r1
            sf.n r2 = sf.n.f12433a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.f21113h
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L15
            if (r0 != r1) goto Le
            f8.i.I0(r10)
            goto L4b
        Le:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r10)
            r10 = 0
            return r10
        L15:
            f8.i.I0(r10)
            r8 = r9
            goto L36
        L1a:
            f8.i.I0(r10)
            x2.h r10 = r9.f21115j
            r1.d r3 = r10.f21123g
            xf.a r10 = xf.a.f21579g
            boolean r0 = r9.f21114i
            if (r0 != 0) goto L3c
            r9.f21113h = r2
            r4 = 0
            long r6 = r9.f21116k
            r8 = r9
            java.lang.Object r0 = r3.a(r4, r6, r8)
            if (r0 != r10) goto L35
            goto L49
        L35:
            r10 = r0
        L36:
            u2.q r10 = (u2.q) r10
            r10.getClass()
            goto L50
        L3c:
            r8 = r9
            r8.f21113h = r1
            long r4 = r8.f21116k
            r6 = 0
            java.lang.Object r0 = r3.a(r4, r6, r8)
            if (r0 != r10) goto L4a
        L49:
            return r10
        L4a:
            r10 = r0
        L4b:
            u2.q r10 = (u2.q) r10
            r10.getClass()
        L50:
            sf.n r10 = sf.n.f12433a
            return r10
    }
}
