package y2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends gg.m implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f22239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ y2.x f22240h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f22241i;

    public /* synthetic */ l(y2.x r1, i0.a1 r2, int r3) {
            r0 = this;
            r0.f22239g = r3
            r0.f22240h = r1
            r0.f22241i = r2
            r1 = 2
            r0.<init>(r1)
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r10, java.lang.Object r11) {
            r9 = this;
            int r0 = r9.f22239g
            sf.n r1 = sf.n.f12433a
            i0.a1 r2 = r9.f22241i
            y2.x r3 = r9.f22240h
            r4 = 2
            r5 = 0
            r6 = 1
            switch(r0) {
                case 0: goto L42;
                default: goto Le;
            }
        Le:
            i0.h0 r10 = (i0.h0) r10
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            r0 = r11 & 3
            if (r0 == r4) goto L1c
            r0 = r6
            goto L1d
        L1c:
            r0 = r5
        L1d:
            r11 = r11 & r6
            boolean r11 = r10.S(r11, r0)
            if (r11 == 0) goto L3e
            i0.u r11 = y2.m.f22243b
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            i0.q1 r11 = r11.a(r0)
            y2.l r0 = new y2.l
            r0.<init>(r3, r2, r5)
            r2 = 1022273628(0x3ceea85c, float:0.029133014)
            s0.d r0 = s0.i.e(r2, r0, r10)
            r2 = 56
            i0.r.a(r11, r0, r10, r2)
            goto L41
        L3e:
            r10.V()
        L41:
            return r1
        L42:
            i0.h0 r10 = (i0.h0) r10
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            r0 = r11 & 3
            if (r0 == r4) goto L50
            r0 = r6
            goto L51
        L50:
            r0 = r5
        L51:
            r11 = r11 & r6
            boolean r11 = r10.S(r11, r0)
            if (r11 == 0) goto Lf5
            java.lang.Object r11 = r10.P()
            i0.e r0 = i0.l.f5952a
            if (r11 != r0) goto L65
            y2.c r11 = y2.c.f22197k
            r10.k0(r11)
        L65:
            fg.l r11 = (fg.l) r11
            y0.l r4 = y0.l.f21818a
            y0.o r11 = f2.o.a(r4, r11)
            boolean r4 = r10.h(r3)
            java.lang.Object r7 = r10.P()
            if (r4 != 0) goto L79
            if (r7 != r0) goto L81
        L79:
            y2.j r7 = new y2.j
            r7.<init>(r3, r6)
            r10.k0(r7)
        L81:
            fg.l r7 = (fg.l) r7
            y0.o r11 = v1.w.n(r11, r7)
            boolean r3 = r3.getCanCalculatePosition()
            if (r3 == 0) goto L90
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L91
        L90:
            r3 = 0
        L91:
            y0.o r11 = c1.h.a(r11, r3)
            i0.u r3 = y2.m.f22242a
            java.lang.Object r2 = r2.getValue()
            fg.p r2 = (fg.p) r2
            java.lang.Object r3 = r10.P()
            if (r3 != r0) goto La8
            y2.e r3 = y2.e.f22216c
            r10.k0(r3)
        La8:
            v1.n0 r3 = (v1.n0) r3
            long r7 = r10.T
            int r0 = java.lang.Long.hashCode(r7)
            s0.h r4 = r10.l()
            y0.o r11 = y0.a.c(r10, r11)
            x1.f r7 = x1.g.f20914f
            r7.getClass()
            x1.y r7 = x1.f.f20883b
            r10.d0()
            boolean r8 = r10.S
            if (r8 == 0) goto Lca
            r10.k(r7)
            goto Lcd
        Lca:
            r10.n0()
        Lcd:
            x1.e r7 = x1.f.f20886e
            i0.r.A(r7, r10, r3)
            x1.e r3 = x1.f.f20885d
            i0.r.A(r3, r10, r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            x1.e r3 = x1.f.f20887f
            i0.r.A(r3, r10, r0)
            x1.d r0 = x1.f.f20888g
            i0.r.w(r0, r10)
            x1.e r0 = x1.f.f20884c
            i0.r.A(r0, r10, r11)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)
            r2.invoke(r10, r11)
            r10.p(r6)
            goto Lf8
        Lf5:
            r10.V()
        Lf8:
            return r1
    }
}
