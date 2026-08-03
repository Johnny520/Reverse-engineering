package sh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 extends yf.i implements fg.p {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f12946h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f12947i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i.c f12948j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i.c f12949k;

    public z1(boolean r1, i.c r2, i.c r3, wf.c r4) {
            r0 = this;
            r0.f12947i = r1
            r0.f12948j = r2
            r0.f12949k = r3
            r1 = 2
            r0.<init>(r1, r4)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r5, wf.c r6) {
            r4 = this;
            sh.z1 r0 = new sh.z1
            i.c r1 = r4.f12948j
            i.c r2 = r4.f12949k
            boolean r3 = r4.f12947i
            r0.<init>(r3, r1, r2, r6)
            r0.f12946h = r5
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            qg.t r1 = (qg.t) r1
            wf.c r2 = (wf.c) r2
            wf.c r1 = r0.create(r1, r2)
            sh.z1 r1 = (sh.z1) r1
            sf.n r2 = sf.n.f12433a
            r1.invokeSuspend(r2)
            return r2
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            r11 = this;
            java.lang.Object r0 = r11.f12946h
            qg.t r0 = (qg.t) r0
            f8.i.I0(r12)
            r12 = 4
            r1 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            r3 = 3
            i.c r4 = r11.f12949k
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            boolean r7 = r11.f12947i
            i.c r8 = r11.f12948j
            if (r7 == 0) goto L37
            r7 = 1050253722(0x3e99999a, float:0.3)
            double r9 = (double) r7
            double r1 = r1 / r9
            double r1 = r1 * r1
            float r1 = (float) r1
            i.r0 r12 = i.d.o(r5, r1, r6, r12)
            sh.y1 r1 = new sh.y1
            r2 = 0
            r1.<init>(r8, r12, r6, r2)
            qg.v.q(r0, r6, r1, r3)
            sh.y1 r1 = new sh.y1
            r2 = 1
            r1.<init>(r4, r12, r6, r2)
            qg.v.q(r0, r6, r1, r3)
            goto L54
        L37:
            r7 = 1041865114(0x3e19999a, float:0.15)
            double r9 = (double) r7
            double r1 = r1 / r9
            double r1 = r1 * r1
            float r1 = (float) r1
            i.r0 r12 = i.d.o(r5, r1, r6, r12)
            sh.y1 r1 = new sh.y1
            r2 = 2
            r1.<init>(r8, r12, r6, r2)
            qg.v.q(r0, r6, r1, r3)
            sh.y1 r1 = new sh.y1
            r2 = 3
            r1.<init>(r4, r12, r6, r2)
            qg.v.q(r0, r6, r1, r3)
        L54:
            sf.n r12 = sf.n.f12433a
            return r12
    }
}
