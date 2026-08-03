package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g2 extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8166h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m.h2 f8167i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f8168j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f8169k;

    public g2(m.h2 r1, float r2, float r3, wf.c r4) {
            r0 = this;
            r0.f8167i = r1
            r0.f8168j = r2
            r0.f8169k = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r4, wf.c r5) {
            r3 = this;
            m.g2 r4 = new m.g2
            float r0 = r3.f8168j
            float r1 = r3.f8169k
            m.h2 r2 = r3.f8167i
            r4.<init>(r2, r0, r1, r5)
            return r4
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            qg.t r1 = (qg.t) r1
            wf.c r2 = (wf.c) r2
            wf.c r1 = r0.create(r1, r2)
            m.g2 r1 = (m.g2) r1
            sf.n r2 = sf.n.f12433a
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.f8166h
            r1 = 1
            if (r0 == 0) goto L12
            if (r0 != r1) goto Lb
            f8.i.I0(r9)
            goto L3c
        Lb:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r9)
            r9 = 0
            return r9
        L12:
            f8.i.I0(r9)
            m.h2 r9 = r8.f8167i
            m.o2 r9 = r9.T
            float r0 = r8.f8168j
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r2 = (long) r0
            float r0 = r8.f8169k
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r4 = (long) r0
            r0 = 32
            long r2 = r2 << r0
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            long r2 = r2 | r4
            r8.f8166h = r1
            java.lang.Object r9 = m.a2.a(r9, r2, r8)
            xf.a r0 = xf.a.f21579g
            if (r9 != r0) goto L3c
            return r0
        L3c:
            sf.n r9 = sf.n.f12433a
            return r9
    }
}
