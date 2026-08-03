package w;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends yf.i implements fg.q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14444h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ m.q1 f14445i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ long f14446j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ qg.t f14447k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f14448l;

    public e1(qg.t r1, i0.a1 r2, wf.c r3) {
            r0 = this;
            r0.f14447k = r1
            r0.f14448l = r2
            r1 = 3
            r0.<init>(r1, r3)
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r5, java.lang.Object r6, java.lang.Object r7) {
            r4 = this;
            m.q1 r5 = (m.q1) r5
            e1.b r6 = (e1.b) r6
            long r0 = r6.f2294a
            wf.c r7 = (wf.c) r7
            w.e1 r6 = new w.e1
            qg.t r2 = r4.f14447k
            i0.a1 r3 = r4.f14448l
            r6.<init>(r2, r3, r7)
            r6.f14445i = r5
            r6.f14446j = r0
            sf.n r5 = sf.n.f12433a
            java.lang.Object r5 = r6.invokeSuspend(r5)
            return r5
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.f14444h
            r1 = 3
            i0.a1 r2 = r8.f14448l
            qg.t r3 = r8.f14447k
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L18
            if (r0 != r5) goto L11
            f8.i.I0(r9)
            goto L32
        L11:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r9)
            r9 = 0
            return r9
        L18:
            f8.i.I0(r9)
            m.q1 r9 = r8.f14445i
            long r6 = r8.f14446j
            m.e2 r0 = new m.e2
            r0.<init>(r2, r6, r4)
            qg.v.q(r3, r4, r0, r1)
            r8.f14444h = r5
            java.lang.Object r9 = r9.T(r8)
            xf.a r0 = xf.a.f21579g
            if (r9 != r0) goto L32
            return r0
        L32:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            w.d1 r0 = new w.d1
            r0.<init>(r2, r4, r9)
            qg.v.q(r3, r4, r0, r1)
            sf.n r9 = sf.n.f12433a
            return r9
    }
}
