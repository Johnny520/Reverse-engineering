package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8132h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f8133i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f8134j;

    public e2(long r2, wf.c r4) {
            r1 = this;
            r0 = 0
            r1.f8132h = r0
            r1.f8133i = r2
            r2 = 2
            r1.<init>(r2, r4)
            return
    }

    public e2(i0.a1 r2, long r3, wf.c r5) {
            r1 = this;
            r0 = 1
            r1.f8132h = r0
            r1.f8134j = r2
            r1.f8133i = r3
            r2 = 2
            r1.<init>(r2, r5)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r4, wf.c r5) {
            r3 = this;
            int r0 = r3.f8132h
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            m.e2 r4 = new m.e2
            java.lang.Object r0 = r3.f8134j
            i0.a1 r0 = (i0.a1) r0
            long r1 = r3.f8133i
            r4.<init>(r0, r1, r5)
            return r4
        L11:
            m.e2 r0 = new m.e2
            long r1 = r3.f8133i
            r0.<init>(r1, r5)
            r0.f8134j = r4
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.f8132h
            switch(r0) {
                case 0: goto L15;
                default: goto L5;
            }
        L5:
            qg.t r2 = (qg.t) r2
            wf.c r3 = (wf.c) r3
            wf.c r2 = r1.create(r2, r3)
            m.e2 r2 = (m.e2) r2
            sf.n r3 = sf.n.f12433a
            r2.invokeSuspend(r3)
            return r3
        L15:
            m.m2 r2 = (m.m2) r2
            wf.c r3 = (wf.c) r3
            wf.c r2 = r1.create(r2, r3)
            m.e2 r2 = (m.e2) r2
            sf.n r3 = sf.n.f12433a
            r2.invokeSuspend(r3)
            return r3
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f8132h
            switch(r0) {
                case 0: goto L23;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r4.f8134j
            i0.a1 r0 = (i0.a1) r0
            f8.i.I0(r5)
            java.lang.Object r5 = r0.getValue()
            n.m r5 = (n.m) r5
            if (r5 == 0) goto L18
            r5 = 0
            r0.setValue(r5)
        L18:
            n.m r5 = new n.m
            r5.<init>()
            r0.setValue(r5)
            sf.n r5 = sf.n.f12433a
            return r5
        L23:
            f8.i.I0(r5)
            java.lang.Object r5 = r4.f8134j
            m.m2 r5 = (m.m2) r5
            m.o2 r5 = r5.f8273a
            m.u1 r0 = r5.f8315k
            long r1 = r4.f8133i
            r3 = 1
            r5.c(r0, r1, r3)
            sf.n r5 = sf.n.f12433a
            return r5
    }
}
