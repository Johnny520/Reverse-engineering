package sh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends yf.h implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12516g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f12517h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.l2 f12518i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ lg.a f12519j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f12520k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f12521l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f12522m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f12523n;

    public b1(i0.l2 r1, lg.a r2, boolean r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, wf.c r7) {
            r0 = this;
            r0.f12518i = r1
            r0.f12519j = r2
            r0.f12520k = r3
            r0.f12521l = r4
            r0.f12522m = r5
            r0.f12523n = r6
            r0.<init>(r7)
            return
    }

    @Override // yf.a
    public final wf.c create(java.lang.Object r9, wf.c r10) {
            r8 = this;
            sh.b1 r0 = new sh.b1
            i0.a1 r5 = r8.f12522m
            i0.a1 r6 = r8.f12523n
            i0.l2 r1 = r8.f12518i
            lg.a r2 = r8.f12519j
            boolean r3 = r8.f12520k
            i0.a1 r4 = r8.f12521l
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0.f12517h = r9
            return r0
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            s1.k0 r1 = (s1.k0) r1
            wf.c r2 = (wf.c) r2
            wf.c r1 = r0.create(r1, r2)
            sh.b1 r1 = (sh.b1) r1
            sf.n r2 = sf.n.f12433a
            r1.invokeSuspend(r2)
            xf.a r1 = xf.a.f21579g
            return r1
    }

    @Override // yf.a
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            r11 = this;
            lg.a r0 = r11.f12519j
            float r1 = r0.f8040a
            java.lang.Object r2 = r11.f12517h
            s1.k0 r2 = (s1.k0) r2
            int r3 = r11.f12516g
            r4 = 1
            if (r3 == 0) goto L1a
            if (r3 != r4) goto L13
            f8.i.I0(r12)
            goto L2c
        L13:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r12)
            r12 = 0
            return r12
        L1a:
            f8.i.I0(r12)
        L1d:
            r11.f12517h = r2
            r11.f12516g = r4
            s1.l r12 = s1.l.f12275h
            java.lang.Object r12 = r2.e(r12, r11)
            xf.a r3 = xf.a.f21579g
            if (r12 != r3) goto L2c
            return r3
        L2c:
            s1.k r12 = (s1.k) r12
            java.lang.Object r3 = r12.f12262a
            java.lang.Object r3 = tf.m.B1(r3)
            s1.t r3 = (s1.t) r3
            int r12 = r12.f12267f
            r5 = 5
            i0.a1 r6 = r11.f12521l
            if (r12 != r5) goto L3f
            goto Lbd
        L3f:
            r5 = 2
            if (r12 != r5) goto L44
            goto Lbd
        L44:
            int r12 = r3.f12299i
            if (r12 != r5) goto Lbd
            i.r0 r12 = sh.f1.f12580a
            i0.a1 r12 = r11.f12522m
            java.lang.Object r12 = r12.getValue()
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            float r12 = (float) r12
            r5 = 1073741824(0x40000000, float:2.0)
            float r12 = r12 / r5
            i0.a1 r7 = r11.f12523n
            java.lang.Object r7 = r7.getValue()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            float r7 = (float) r7
            float r5 = r5 * r12
            float r7 = r7 - r5
            r5 = 0
            int r8 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r8 >= 0) goto L6f
            r7 = r5
        L6f:
            r5 = 1060655596(0x3f3851ec, float:0.72)
            float r5 = r5 * r12
            r8 = 1056964608(0x3f000000, float:0.5)
            float r8 = r8 * r12
            float r8 = r8 + r5
            long r9 = r3.f12293c
            i0.l2 r3 = r11.f12518i
            java.lang.Object r3 = r3.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            float r3 = r3 - r1
            float r5 = r0.f8041b
            float r5 = r5 - r1
            float r3 = r3 / r5
            boolean r5 = r11.f12520k
            if (r5 == 0) goto L92
            r5 = 1065353216(0x3f800000, float:1.0)
            float r3 = r5 - r3
        L92:
            float r3 = r3 * r7
            float r3 = r3 + r12
            r12 = 32
            long r9 = r9 >> r12
            int r12 = (int) r9
            float r12 = java.lang.Float.intBitsToFloat(r12)
            float r12 = r12 - r3
            float r12 = java.lang.Math.abs(r12)
            int r12 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r12 > 0) goto La7
            r12 = r4
            goto La8
        La7:
            r12 = 0
        La8:
            java.lang.Object r3 = r6.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == r12) goto L1d
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            r6.setValue(r12)
            goto L1d
        Lbd:
            i.r0 r12 = sh.f1.f12580a
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            r6.setValue(r12)
            goto L1d
    }
}
