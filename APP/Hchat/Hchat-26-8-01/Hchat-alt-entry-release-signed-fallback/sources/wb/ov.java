package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ov implements fg.r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f18198g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18199h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fg.l f18200i;

    public ov(java.util.List r1, java.lang.String r2, fg.l r3) {
            r0 = this;
            r0.<init>()
            r0.f18198g = r1
            r0.f18199h = r2
            r0.f18200i = r3
            return
    }

    @Override // fg.r
    public final java.lang.Object c(java.lang.Object r29, java.lang.Object r30, java.lang.Object r31, java.lang.Object r32) {
            r28 = this;
            r0 = r28
            r1 = r29
            r.d r1 = (r.d) r1
            r2 = r30
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = r31
            i0.h0 r3 = (i0.h0) r3
            r4 = r32
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r5 = r4 & 6
            r6 = 2
            if (r5 != 0) goto L2a
            boolean r1 = r3.f(r1)
            if (r1 == 0) goto L27
            r1 = 4
            goto L28
        L27:
            r1 = r6
        L28:
            r1 = r1 | r4
            goto L2b
        L2a:
            r1 = r4
        L2b:
            r4 = r4 & 48
            if (r4 != 0) goto L3b
            boolean r4 = r3.d(r2)
            if (r4 == 0) goto L38
            r4 = 32
            goto L3a
        L38:
            r4 = 16
        L3a:
            r1 = r1 | r4
        L3b:
            r4 = r1 & 147(0x93, float:2.06E-43)
            r5 = 146(0x92, float:2.05E-43)
            r7 = 1
            r8 = 0
            if (r4 == r5) goto L45
            r4 = r7
            goto L46
        L45:
            r4 = r8
        L46:
            r1 = r1 & r7
            boolean r1 = r3.S(r1, r4)
            if (r1 == 0) goto L19b
            java.util.List r1 = r0.f18198g
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            r2 = 1928632006(0x72f496c6, float:9.689167E30)
            r3.a0(r2)
            java.lang.String r2 = r0.f18199h
            boolean r2 = gg.l.a(r1, r2)
            r4 = 34
            float r4 = (float) r4
            y0.l r5 = y0.l.f21818a
            y0.o r4 = p.h1.e(r5, r4)
            r5 = 12
            float r5 = (float) r5
            v.d r9 = v.e.a(r5)
            y0.o r4 = c1.h.b(r4, r9)
            if (r2 == 0) goto L8d
            r9 = 1928865590(0x72f82736, float:9.83036E30)
            r3.a0(r9)
            i0.m2 r9 = bi.d.f892a
            java.lang.Object r9 = r3.j(r9)
            bi.b r9 = (bi.b) r9
            long r9 = r9.j()
            r3.p(r8)
            goto La9
        L8d:
            r9 = 1928965472(0x72f9ad60, float:9.890735E30)
            r3.a0(r9)
            i0.m2 r9 = bi.d.f892a
            java.lang.Object r9 = r3.j(r9)
            bi.b r9 = (bi.b) r9
            long r9 = r9.g()
            r11 = 1031127695(0x3d75c28f, float:0.06)
            long r9 = f1.w.b(r9, r11)
            r3.p(r8)
        La9:
            f1.m0 r11 = f1.c0.f3038b
            y0.o r12 = k.n.g(r4, r9, r11)
            fg.l r4 = r0.f18200i
            boolean r9 = r3.f(r4)
            boolean r10 = r3.f(r1)
            r9 = r9 | r10
            java.lang.Object r10 = r3.P()
            if (r9 != 0) goto Lc4
            i0.e r9 = i0.l.f5952a
            if (r10 != r9) goto Lcc
        Lc4:
            wb.mv r10 = new wb.mv
            r10.<init>(r4, r1)
            r3.k0(r10)
        Lcc:
            r16 = r10
            fg.a r16 = (fg.a) r16
            r17 = 15
            r13 = 0
            r14 = 0
            r15 = 0
            y0.o r4 = k.n.j(r12, r13, r14, r15, r16, r17)
            r9 = 0
            y0.o r4 = p.d.n(r4, r5, r9, r6)
            y0.g r5 = y0.b.f21796k
            v1.n0 r5 = p.o.d(r5, r8)
            long r9 = r3.T
            int r6 = java.lang.Long.hashCode(r9)
            s0.h r9 = r3.l()
            y0.o r4 = y0.a.c(r3, r4)
            x1.f r10 = x1.g.f20914f
            r10.getClass()
            x1.y r10 = x1.f.f20883b
            r3.d0()
            boolean r11 = r3.S
            if (r11 == 0) goto L104
            r3.k(r10)
            goto L107
        L104:
            r3.n0()
        L107:
            x1.e r10 = x1.f.f20886e
            i0.r.A(r10, r3, r5)
            x1.e r5 = x1.f.f20885d
            i0.r.A(r5, r3, r9)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            x1.e r6 = x1.f.f20887f
            i0.r.A(r6, r3, r5)
            x1.d r5 = x1.f.f20888g
            i0.r.w(r5, r3)
            x1.e r5 = x1.f.f20884c
            i0.r.A(r5, r3, r4)
            if (r2 == 0) goto L133
            r4 = -398460115(0xffffffffe83ffb2d, float:-3.6264215E24)
            r3.a0(r4)
            r3.p(r8)
            long r4 = f1.w.f3127c
        L131:
            r5 = r4
            goto L149
        L133:
            r4 = -398459009(0xffffffffe83fff7f, float:-3.6267403E24)
            r3.a0(r4)
            i0.m2 r4 = bi.d.f892a
            java.lang.Object r4 = r3.j(r4)
            bi.b r4 = (bi.b) r4
            long r4 = r4.h()
            r3.p(r8)
            goto L131
        L149:
            r4 = 13
            long r9 = x6.d.D(r4)
            if (r2 == 0) goto L154
            m2.k r2 = m2.k.f8698j
            goto L156
        L154:
            m2.k r2 = m2.k.f8697i
        L156:
            r24 = 0
            r25 = 262058(0x3ffaa, float:3.67221E-40)
            r4 = 0
            r11 = r8
            r26 = r9
            r9 = r7
            r7 = r26
            r10 = 0
            r13 = r11
            r11 = 0
            r14 = r13
            r13 = 0
            r16 = r14
            r14 = 0
            r17 = r16
            r16 = 0
            r18 = r17
            r17 = 0
            r19 = r18
            r18 = 0
            r20 = r19
            r19 = 0
            r21 = r20
            r20 = 0
            r22 = r21
            r21 = 0
            r23 = 24576(0x6000, float:3.4438E-41)
            r26 = r3
            r3 = r1
            r1 = r9
            r9 = r2
            r2 = r22
            r22 = r26
            sh.s.n(r3, r4, r5, r7, r9, r10, r11, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r3 = r22
            r3.p(r1)
            r3.p(r2)
            goto L19e
        L19b:
            r3.V()
        L19e:
            sf.n r1 = sf.n.f12433a
            return r1
    }
}
