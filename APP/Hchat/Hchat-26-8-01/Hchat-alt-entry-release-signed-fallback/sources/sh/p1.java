package sh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 extends yf.i implements fg.q {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f12767h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n1.a f12768i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.f1 f12769j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f12770k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f12771l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f12772m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ n.k f12773n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i0.f1 f12774o;

    public p1(boolean r1, n1.a r2, i0.f1 r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, n.k r7, i0.f1 r8, wf.c r9) {
            r0 = this;
            r0.f12767h = r1
            r0.f12768i = r2
            r0.f12769j = r3
            r0.f12770k = r4
            r0.f12771l = r5
            r0.f12772m = r6
            r0.f12773n = r7
            r0.f12774o = r8
            r1 = 3
            r0.<init>(r1, r9)
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r11, java.lang.Object r12, java.lang.Object r13) {
            r10 = this;
            qg.t r11 = (qg.t) r11
            java.lang.Number r12 = (java.lang.Number) r12
            r12.floatValue()
            r9 = r13
            wf.c r9 = (wf.c) r9
            sh.p1 r0 = new sh.p1
            n.k r7 = r10.f12773n
            i0.f1 r8 = r10.f12774o
            boolean r1 = r10.f12767h
            n1.a r2 = r10.f12768i
            i0.f1 r3 = r10.f12769j
            i0.a1 r4 = r10.f12770k
            i0.a1 r5 = r10.f12771l
            i0.a1 r6 = r10.f12772m
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            sf.n r11 = sf.n.f12433a
            r0.invokeSuspend(r11)
            return r11
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            r4 = this;
            f8.i.I0(r5)
            i0.f1 r5 = r4.f12769j
            float r0 = r5.g()
            float r0 = java.lang.Math.abs(r0)
            r1 = 1093140480(0x41280000, float:10.5)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            boolean r1 = r4.f12767h
            if (r0 <= 0) goto L28
            i0.a1 r0 = r4.f12770k
            java.lang.Object r0 = r0.getValue()
            fg.l r0 = (fg.l) r0
            if (r0 == 0) goto L28
            r2 = r1 ^ 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r0.invoke(r2)
        L28:
            i0.a1 r0 = r4.f12771l
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L85
            float r0 = r5.g()
            float r0 = java.lang.Math.abs(r0)
            r2 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L85
            n1.a r0 = r4.f12768i
            if (r1 == 0) goto L52
            float r2 = r5.g()
            r3 = -1053818880(0xffffffffc1300000, float:-11.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L5e
        L52:
            if (r1 != 0) goto L66
            float r2 = r5.g()
            r3 = 1092616192(0x41200000, float:10.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto L66
        L5e:
            r1 = 22
            n1.c r0 = (n1.c) r0
            r0.a(r1)
            goto L85
        L66:
            if (r1 == 0) goto L72
            float r2 = r5.g()
            r3 = -1054867456(0xffffffffc1200000, float:-10.0)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L7e
        L72:
            if (r1 != 0) goto L85
            float r1 = r5.g()
            r2 = 1093664768(0x41300000, float:11.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L85
        L7e:
            r1 = 21
            n1.c r0 = (n1.c) r0
            r0.a(r1)
        L85:
            i0.a1 r0 = r4.f12772m
            java.lang.Object r0 = r0.getValue()
            n.b r0 = (n.b) r0
            if (r0 == 0) goto L99
            n.c r1 = new n.c
            r1.<init>(r0)
            n.k r0 = r4.f12773n
            r0.b(r1)
        L99:
            r0 = 0
            r5.h(r0)
            i0.f1 r5 = r4.f12774o
            r5.h(r0)
            sf.n r5 = sf.n.f12433a
            return r5
    }
}
