package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uf implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19467h;

    public /* synthetic */ uf(i0.a1 r1, int r2) {
            r0 = this;
            r0.f19466g = r2
            r0.f19467h = r1
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r11, java.lang.Object r12, java.lang.Object r13) {
            r10 = this;
            int r0 = r10.f19466g
            r.d r11 = (r.d) r11
            switch(r0) {
                case 0: goto L180;
                case 1: goto L148;
                case 2: goto L10f;
                case 3: goto Ld7;
                case 4: goto L9f;
                case 5: goto L40;
                default: goto L7;
            }
        L7:
            i0.h0 r12 = (i0.h0) r12
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r11.getClass()
            r11 = r13 & 17
            r0 = 16
            r1 = 1
            if (r11 == r0) goto L1b
            r11 = r1
            goto L1c
        L1b:
            r11 = 0
        L1c:
            r13 = r13 & r1
            boolean r11 = r12.S(r13, r11)
            if (r11 == 0) goto L3a
            wb.nh r11 = new wb.nh
            r13 = 16
            i0.a1 r0 = r10.f19467h
            r11.<init>(r0, r13)
            r13 = -1382099825(0xffffffffad9ed48f, float:-1.8056915E-11)
            s0.d r11 = s0.i.e(r13, r11, r12)
            r13 = 48
            r0 = 0
            wb.ho.C3(r0, r11, r12, r13, r1)
            goto L3d
        L3a:
            r12.V()
        L3d:
            sf.n r11 = sf.n.f12433a
            return r11
        L40:
            r7 = r12
            i0.h0 r7 = (i0.h0) r7
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r12 = r13.intValue()
            r11.getClass()
            r11 = r12 & 17
            r13 = 16
            r0 = 1
            if (r11 == r13) goto L55
            r11 = r0
            goto L56
        L55:
            r11 = 0
        L56:
            r12 = r12 & r0
            boolean r11 = r7.S(r12, r11)
            if (r11 == 0) goto L99
            i0.a1 r11 = r10.f19467h
            java.lang.Object r12 = r11.getValue()
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            r12 = 12
            float r12 = (float) r12
            r13 = 0
            r1 = 2
            y0.l r2 = y0.l.f21818a
            y0.o r2 = p.d.n(r2, r12, r13, r1)
            boolean r12 = r7.f(r11)
            java.lang.Object r13 = r7.P()
            if (r12 != 0) goto L7f
            i0.e r12 = i0.l.f5952a
            if (r13 != r12) goto L89
        L7f:
            wb.gj r13 = new wb.gj
            r12 = 28
            r13.<init>(r11, r12)
            r7.k0(r13)
        L89:
            r6 = r13
            fg.l r6 = (fg.l) r6
            r8 = 432(0x1b0, float:6.05E-43)
            r9 = 56
            java.lang.String r1 = "搜索插件、作者或目录名"
            r3 = 0
            r4 = 0
            r5 = 0
            wb.ho.u3(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L9c
        L99:
            r7.V()
        L9c:
            sf.n r11 = sf.n.f12433a
            return r11
        L9f:
            i0.h0 r12 = (i0.h0) r12
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r11.getClass()
            r11 = r13 & 17
            r0 = 16
            r1 = 1
            if (r11 == r0) goto Lb3
            r11 = r1
            goto Lb4
        Lb3:
            r11 = 0
        Lb4:
            r13 = r13 & r1
            boolean r11 = r12.S(r13, r11)
            if (r11 == 0) goto Ld1
            wb.nh r11 = new wb.nh
            r13 = 0
            i0.a1 r0 = r10.f19467h
            r11.<init>(r0, r13)
            r13 = -2141590406(0xffffffff8059ec7a, float:-8.258191E-39)
            s0.d r11 = s0.i.e(r13, r11, r12)
            r13 = 48
            r0 = 0
            wb.ho.C3(r0, r11, r12, r13, r1)
            goto Ld4
        Ld1:
            r12.V()
        Ld4:
            sf.n r11 = sf.n.f12433a
            return r11
        Ld7:
            i0.h0 r12 = (i0.h0) r12
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r11.getClass()
            r11 = r13 & 17
            r0 = 16
            r1 = 1
            if (r11 == r0) goto Leb
            r11 = r1
            goto Lec
        Leb:
            r11 = 0
        Lec:
            r13 = r13 & r1
            boolean r11 = r12.S(r13, r11)
            if (r11 == 0) goto L109
            wb.nh r11 = new wb.nh
            r13 = 1
            i0.a1 r0 = r10.f19467h
            r11.<init>(r0, r13)
            r13 = -611821160(0xffffffffdb885998, float:-7.675821E16)
            s0.d r11 = s0.i.e(r13, r11, r12)
            r13 = 48
            r0 = 0
            wb.ho.C3(r0, r11, r12, r13, r1)
            goto L10c
        L109:
            r12.V()
        L10c:
            sf.n r11 = sf.n.f12433a
            return r11
        L10f:
            i0.h0 r12 = (i0.h0) r12
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r11.getClass()
            r11 = r13 & 17
            r0 = 16
            r1 = 1
            if (r11 == r0) goto L123
            r11 = r1
            goto L124
        L123:
            r11 = 0
        L124:
            r13 = r13 & r1
            boolean r11 = r12.S(r13, r11)
            if (r11 == 0) goto L142
            wb.w1 r11 = new wb.w1
            r13 = 29
            i0.a1 r0 = r10.f19467h
            r11.<init>(r0, r13)
            r13 = 1011815391(0x3c4f13df, float:0.012639015)
            s0.d r11 = s0.i.e(r13, r11, r12)
            r13 = 48
            r0 = 0
            wb.ho.C3(r0, r11, r12, r13, r1)
            goto L145
        L142:
            r12.V()
        L145:
            sf.n r11 = sf.n.f12433a
            return r11
        L148:
            i0.h0 r12 = (i0.h0) r12
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r11.getClass()
            r11 = r13 & 17
            r0 = 16
            r1 = 1
            if (r11 == r0) goto L15c
            r11 = r1
            goto L15d
        L15c:
            r11 = 0
        L15d:
            r13 = r13 & r1
            boolean r11 = r12.S(r13, r11)
            if (r11 == 0) goto L17a
            wb.nh r11 = new wb.nh
            r13 = 2
            i0.a1 r0 = r10.f19467h
            r11.<init>(r0, r13)
            r13 = -2091493667(0xffffffff835656dd, float:-6.298866E-37)
            s0.d r11 = s0.i.e(r13, r11, r12)
            r13 = 48
            r0 = 0
            wb.ho.C3(r0, r11, r12, r13, r1)
            goto L17d
        L17a:
            r12.V()
        L17d:
            sf.n r11 = sf.n.f12433a
            return r11
        L180:
            i0.h0 r12 = (i0.h0) r12
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r11.getClass()
            r11 = r13 & 17
            r0 = 16
            r1 = 0
            r2 = 1
            if (r11 == r0) goto L195
            r11 = r2
            goto L196
        L195:
            r11 = r1
        L196:
            r13 = r13 & r2
            boolean r11 = r12.S(r13, r11)
            if (r11 == 0) goto L1bf
            r11 = 8
            float r6 = (float) r11
            r7 = 7
            y0.l r2 = y0.l.f21818a
            r3 = 0
            r4 = 0
            r5 = 0
            y0.o r11 = p.d.p(r2, r3, r4, r5, r6, r7)
            wb.nh r13 = new wb.nh
            r0 = 3
            i0.a1 r2 = r10.f19467h
            r13.<init>(r2, r0)
            r0 = 121249122(0x73a1d62, float:1.400172E-34)
            s0.d r13 = s0.i.e(r0, r13, r12)
            r0 = 54
            wb.ho.C3(r11, r13, r12, r0, r1)
            goto L1c2
        L1bf:
            r12.V()
        L1c2:
            sf.n r11 = sf.n.f12433a
            return r11
    }
}
