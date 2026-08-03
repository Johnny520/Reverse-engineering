package sh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends yf.i implements fg.q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ long f12549h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f12550i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fg.l f12551j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ sh.u0 f12552k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f12553l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0.f1 f12554m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i0.g1 f12555n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i0.g1 f12556o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f12557p;

    public d1(boolean r1, fg.l r2, sh.u0 r3, i0.a1 r4, i0.f1 r5, i0.g1 r6, i0.g1 r7, i0.a1 r8, wf.c r9) {
            r0 = this;
            r0.f12550i = r1
            r0.f12551j = r2
            r0.f12552k = r3
            r0.f12553l = r4
            r0.f12554m = r5
            r0.f12555n = r6
            r0.f12556o = r7
            r0.f12557p = r8
            r1 = 3
            r0.<init>(r1, r9)
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r11, java.lang.Object r12, java.lang.Object r13) {
            r10 = this;
            qg.t r11 = (qg.t) r11
            e1.b r12 = (e1.b) r12
            long r11 = r12.f2294a
            r9 = r13
            wf.c r9 = (wf.c) r9
            sh.d1 r0 = new sh.d1
            i0.g1 r7 = r10.f12556o
            i0.a1 r8 = r10.f12557p
            boolean r1 = r10.f12550i
            fg.l r2 = r10.f12551j
            sh.u0 r3 = r10.f12552k
            i0.a1 r4 = r10.f12553l
            i0.f1 r5 = r10.f12554m
            i0.g1 r6 = r10.f12555n
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0.f12549h = r11
            sf.n r11 = sf.n.f12433a
            r0.invokeSuspend(r11)
            return r11
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            r3 = this;
            long r0 = r3.f12549h
            f8.i.I0(r4)
            i.r0 r4 = sh.f1.f12580a
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            i0.a1 r2 = r3.f12553l
            r2.setValue(r4)
            r4 = 32
            long r0 = r0 >> r4
            int r4 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r4)
            i0.f1 r1 = r3.f12554m
            r1.h(r0)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            i0.g1 r0 = r3.f12555n
            int r0 = r0.g()
            i0.g1 r1 = r3.f12556o
            int r1 = r1.g()
            float r4 = sh.f1.c(r4, r0, r1)
            boolean r0 = r3.f12550i
            if (r0 == 0) goto L37
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = r0 - r4
        L37:
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r4)
            fg.l r4 = r3.f12551j
            java.lang.Object r4 = r4.invoke(r0)
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            i0.a1 r0 = r3.f12557p
            java.lang.Object r0 = r0.getValue()
            fg.l r0 = (fg.l) r0
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r4)
            r0.invoke(r1)
            sh.u0 r0 = r3.f12552k
            r1 = 0
            r0.f12845a = r1
            r0.f12846b = r4
            r0.f12847c = r1
            sf.n r4 = sf.n.f12433a
            return r4
    }
}
