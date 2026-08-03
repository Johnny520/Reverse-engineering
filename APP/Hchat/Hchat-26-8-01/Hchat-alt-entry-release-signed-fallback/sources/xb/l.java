package xb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f21515g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xb.o f21516h;

    public /* synthetic */ l(xb.o r1, int r2) {
            r0 = this;
            r0.f21515g = r2
            r0.f21516h = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r20) {
            r19 = this;
            r0 = r19
            int r1 = r0.f21515g
            switch(r1) {
                case 0: goto L3b;
                case 1: goto L20;
                default: goto L7;
            }
        L7:
            r1 = r20
            s1.t r1 = (s1.t) r1
            r1.getClass()
            xb.o r1 = r0.f21516h
            qg.t r2 = r1.f21523a
            xb.n r3 = new xb.n
            r4 = 1
            r5 = 0
            r3.<init>(r1, r5, r4)
            r1 = 3
            qg.v.q(r2, r5, r3, r1)
        L1d:
            sf.n r1 = sf.n.f12433a
            return r1
        L20:
            r1 = r20
            s1.t r1 = (s1.t) r1
            r1.getClass()
            long r1 = r1.f12293c
            xb.o r3 = r0.f21516h
            r3.f21529g = r1
            qg.t r1 = r3.f21523a
            xb.n r2 = new xb.n
            r4 = 0
            r5 = 0
            r2.<init>(r3, r5, r4)
            r3 = 3
            qg.v.q(r1, r5, r2, r3)
            goto L1d
        L3b:
            r2 = r20
            x1.h0 r2 = (x1.h0) r2
            r2.getClass()
            h1.b r1 = r2.f20932g
            xb.o r10 = r0.f21516h
            i.c r3 = r10.f21527e
            java.lang.Object r3 = r3.d()
            java.lang.Number r3 = (java.lang.Number) r3
            float r11 = r3.floatValue()
            r12 = 0
            int r3 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r3 <= 0) goto L11b
            long r13 = f1.w.f3127c
            r3 = 1031127695(0x3d75c28f, float:0.06)
            float r3 = r3 * r11
            long r3 = f1.w.b(r13, r3)
            r8 = 12
            r9 = 62
            r5 = 0
            r7 = 0
            h1.d.Z(r2, r3, r5, r7, r8, r9)
            android.graphics.RuntimeShader r3 = r10.f21530h
            android.graphics.RuntimeShader r3 = ai.a.e(r3)
            sh.j r4 = r10.f21524b
            long r5 = r1.a()
            e1.e r7 = new e1.e
            r7.<init>(r5)
            i.c r5 = r10.f21528f
            java.lang.Object r5 = r5.d()
            java.lang.Object r4 = r4.invoke(r7, r5)
            e1.b r4 = (e1.b) r4
            long r4 = r4.f2294a
            long r6 = r1.a()
            r8 = 32
            long r6 = r6 >> r8
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            long r15 = r1.a()
            r17 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r20 = r8
            long r8 = r15 & r17
            int r7 = (int) r8
            float r7 = java.lang.Float.intBitsToFloat(r7)
            xb.k.d(r3, r6, r7)
            r6 = 1039516303(0x3df5c28f, float:0.12)
            float r11 = r11 * r6
            long r6 = f1.w.b(r13, r11)
            int r6 = f1.c0.w(r6)
            xb.k.e(r3, r6)
            long r6 = r1.a()
            float r6 = e1.e.b(r6)
            r7 = 1067030938(0x3f99999a, float:1.2)
            float r6 = r6 * r7
            xb.k.c(r3, r6)
            long r6 = r4 >> r20
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            long r7 = r1.a()
            long r7 = r7 >> r20
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            int r8 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r8 >= 0) goto Le0
            r6 = r12
        Le0:
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 <= 0) goto Le5
            goto Le6
        Le5:
            r7 = r6
        Le6:
            long r4 = r4 & r17
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            long r5 = r1.a()
            long r5 = r5 & r17
            int r1 = (int) r5
            float r1 = java.lang.Float.intBitsToFloat(r1)
            int r5 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r5 >= 0) goto Lfd
            goto Lfe
        Lfd:
            r12 = r4
        Lfe:
            int r4 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r4 <= 0) goto L103
            goto L104
        L103:
            r1 = r12
        L104:
            xb.k.f(r3, r7, r1)
            android.graphics.RuntimeShader r1 = r10.f21530h
            f1.t r3 = new f1.t
            r3.<init>(r1)
            r10 = 12
            r11 = 62
            r4 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            h1.d.V0(r2, r3, r4, r6, r8, r9, r10, r11)
        L11b:
            r2.e()
            goto L1d
    }
}
