package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8148h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8149i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m.h2 f8150j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ long f8151k;

    public /* synthetic */ f2(m.h2 r1, long r2, wf.c r4, int r5) {
            r0 = this;
            r0.f8148h = r5
            r0.f8150j = r1
            r0.f8151k = r2
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    public f2(m.h2 r2, wf.c r3) {
            r1 = this;
            r0 = 3
            r1.f8148h = r0
            r1.f8150j = r2
            r2 = 2
            r1.<init>(r2, r3)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r9, wf.c r10) {
            r8 = this;
            int r0 = r8.f8148h
            switch(r0) {
                case 0: goto L2b;
                case 1: goto L1f;
                case 2: goto L13;
                default: goto L5;
            }
        L5:
            m.f2 r0 = new m.f2
            m.h2 r1 = r8.f8150j
            r0.<init>(r1, r10)
            e1.b r9 = (e1.b) r9
            long r9 = r9.f2294a
            r0.f8151k = r9
            return r0
        L13:
            m.f2 r1 = new m.f2
            long r3 = r8.f8151k
            r6 = 2
            m.h2 r2 = r8.f8150j
            r5 = r10
            r1.<init>(r2, r3, r5, r6)
            return r1
        L1f:
            r6 = r10
            m.f2 r2 = new m.f2
            long r4 = r8.f8151k
            r7 = 1
            m.h2 r3 = r8.f8150j
            r2.<init>(r3, r4, r6, r7)
            return r2
        L2b:
            r6 = r10
            m.f2 r2 = new m.f2
            long r4 = r8.f8151k
            r7 = 0
            m.h2 r3 = r8.f8150j
            r2.<init>(r3, r4, r6, r7)
            return r2
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.f8148h
            switch(r0) {
                case 0: goto L3d;
                case 1: goto L2c;
                case 2: goto L1b;
                default: goto L5;
            }
        L5:
            e1.b r4 = (e1.b) r4
            long r0 = r4.f2294a
            wf.c r5 = (wf.c) r5
            m.f2 r4 = new m.f2
            m.h2 r2 = r3.f8150j
            r4.<init>(r2, r5)
            r4.f8151k = r0
            sf.n r5 = sf.n.f12433a
            java.lang.Object r4 = r4.invokeSuspend(r5)
            return r4
        L1b:
            qg.t r4 = (qg.t) r4
            wf.c r5 = (wf.c) r5
            wf.c r4 = r3.create(r4, r5)
            m.f2 r4 = (m.f2) r4
            sf.n r5 = sf.n.f12433a
            java.lang.Object r4 = r4.invokeSuspend(r5)
            return r4
        L2c:
            qg.t r4 = (qg.t) r4
            wf.c r5 = (wf.c) r5
            wf.c r4 = r3.create(r4, r5)
            m.f2 r4 = (m.f2) r4
            sf.n r5 = sf.n.f12433a
            java.lang.Object r4 = r4.invokeSuspend(r5)
            return r4
        L3d:
            qg.t r4 = (qg.t) r4
            wf.c r5 = (wf.c) r5
            wf.c r4 = r3.create(r4, r5)
            m.f2 r4 = (m.f2) r4
            sf.n r5 = sf.n.f12433a
            java.lang.Object r4 = r4.invokeSuspend(r5)
            return r4
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.f8148h
            switch(r0) {
                case 0: goto L81;
                case 1: goto L56;
                case 2: goto L2c;
                default: goto L5;
            }
        L5:
            int r0 = r5.f8149i
            r1 = 1
            if (r0 == 0) goto L17
            if (r0 != r1) goto L10
            f8.i.I0(r6)
            goto L2b
        L10:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r6)
            r6 = 0
            goto L2b
        L17:
            f8.i.I0(r6)
            long r2 = r5.f8151k
            m.h2 r6 = r5.f8150j
            m.o2 r6 = r6.T
            r5.f8149i = r1
            java.lang.Object r6 = m.a2.a(r6, r2, r5)
            xf.a r0 = xf.a.f21579g
            if (r6 != r0) goto L2b
            r6 = r0
        L2b:
            return r6
        L2c:
            int r0 = r5.f8149i
            r1 = 1
            if (r0 == 0) goto L3e
            if (r0 != r1) goto L37
            f8.i.I0(r6)
            goto L53
        L37:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r6)
            r6 = 0
            goto L55
        L3e:
            f8.i.I0(r6)
            m.h2 r6 = r5.f8150j
            m.o2 r6 = r6.T
            long r2 = r5.f8151k
            r5.f8149i = r1
            java.lang.Object r6 = r6.b(r2, r1, r5)
            xf.a r0 = xf.a.f21579g
            if (r6 != r0) goto L53
            r6 = r0
            goto L55
        L53:
            sf.n r6 = sf.n.f12433a
        L55:
            return r6
        L56:
            int r0 = r5.f8149i
            r1 = 1
            if (r0 == 0) goto L68
            if (r0 != r1) goto L61
            f8.i.I0(r6)
            goto L7e
        L61:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r6)
            r6 = 0
            goto L80
        L68:
            f8.i.I0(r6)
            m.h2 r6 = r5.f8150j
            m.o2 r6 = r6.T
            long r2 = r5.f8151k
            r5.f8149i = r1
            r0 = 0
            java.lang.Object r6 = r6.b(r2, r0, r5)
            xf.a r0 = xf.a.f21579g
            if (r6 != r0) goto L7e
            r6 = r0
            goto L80
        L7e:
            sf.n r6 = sf.n.f12433a
        L80:
            return r6
        L81:
            int r0 = r5.f8149i
            r1 = 1
            if (r0 == 0) goto L93
            if (r0 != r1) goto L8c
            f8.i.I0(r6)
            goto Lb0
        L8c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r6)
            r6 = 0
            goto Lb2
        L93:
            f8.i.I0(r6)
            m.h2 r6 = r5.f8150j
            m.o2 r6 = r6.T
            m.e2 r0 = new m.e2
            long r2 = r5.f8151k
            r4 = 0
            r0.<init>(r2, r4)
            r5.f8149i = r1
            k.d1 r1 = k.d1.f6940h
            java.lang.Object r6 = r6.f(r1, r0, r5)
            xf.a r0 = xf.a.f21579g
            if (r6 != r0) goto Lb0
            r6 = r0
            goto Lb2
        Lb0:
            sf.n r6 = sf.n.f12433a
        Lb2:
            return r6
    }
}
