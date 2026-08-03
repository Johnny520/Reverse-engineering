package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ui implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f19481h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f19482i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fg.l f19483j;

    public /* synthetic */ ui(java.util.List r2, fg.l r3, java.lang.String r4) {
            r1 = this;
            r0 = 3
            r1.f19480g = r0
            r1.<init>()
            r1.f19481h = r2
            r1.f19483j = r3
            r1.f19482i = r4
            return
    }

    public /* synthetic */ ui(java.util.List r2, java.lang.String r3, fg.l r4) {
            r1 = this;
            r0 = 2
            r1.f19480g = r0
            r1.<init>()
            r1.f19481h = r2
            r1.f19482i = r3
            r1.f19483j = r4
            return
    }

    public /* synthetic */ ui(java.util.List r1, java.lang.String r2, fg.l r3, int r4, int r5) {
            r0 = this;
            r0.f19480g = r5
            r0.f19481h = r1
            r0.f19482i = r2
            r0.f19483j = r3
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r14, java.lang.Object r15) {
            r13 = this;
            int r0 = r13.f19480g
            switch(r0) {
                case 0: goto L121;
                case 1: goto L109;
                case 2: goto L6b;
                default: goto L5;
            }
        L5:
            r10 = r14
            i0.h0 r10 = (i0.h0) r10
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r14 = r15.intValue()
            r15 = r14 & 3
            r0 = 2
            r1 = 1
            if (r15 == r0) goto L16
            r15 = r1
            goto L17
        L16:
            r15 = 0
        L17:
            r14 = r14 & r1
            boolean r14 = r10.S(r14, r15)
            if (r14 == 0) goto L65
            y0.l r14 = y0.l.f21818a
            r15 = 1065353216(0x3f800000, float:1.0)
            y0.o r14 = p.h1.d(r14, r15)
            r15 = 360(0x168, float:5.04E-43)
            float r15 = (float) r15
            r0 = 0
            y0.o r1 = p.h1.g(r14, r0, r15, r1)
            java.util.List r14 = r13.f19481h
            boolean r15 = r10.h(r14)
            fg.l r0 = r13.f19483j
            boolean r2 = r10.f(r0)
            r15 = r15 | r2
            java.lang.String r2 = r13.f19482i
            boolean r3 = r10.f(r2)
            r15 = r15 | r3
            java.lang.Object r3 = r10.P()
            if (r15 != 0) goto L4c
            i0.e r15 = i0.l.f5952a
            if (r3 != r15) goto L54
        L4c:
            c9.y0 r3 = new c9.y0
            r3.<init>(r14, r0, r2)
            r10.k0(r3)
        L54:
            r9 = r3
            fg.l r9 = (fg.l) r9
            r11 = 6
            r12 = 510(0x1fe, float:7.15E-43)
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            a.a.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L68
        L65:
            r10.V()
        L68:
            sf.n r14 = sf.n.f12433a
            return r14
        L6b:
            i0.h0 r14 = (i0.h0) r14
            java.lang.Integer r15 = (java.lang.Integer) r15
            int r15 = r15.intValue()
            r0 = r15 & 3
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L7c
            r0 = r2
            goto L7d
        L7c:
            r0 = r3
        L7d:
            r15 = r15 & r2
            boolean r15 = r14.S(r15, r0)
            if (r15 == 0) goto L103
            java.util.List r15 = r13.f19481h
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L9b
            r15 = -1315814217(0xffffffffb19244b7, float:-4.256971E-9)
            r14.a0(r15)
            java.lang.String r15 = r13.f19482i
            wb.ho.s0(r15, r14, r3)
            r14.p(r3)
            goto L106
        L9b:
            r0 = -1315755658(0xffffffffb1932976, float:-4.2829766E-9)
            r14.a0(r0)
            java.util.Iterator r0 = r15.iterator()
            r1 = r3
        La6:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto Lff
            java.lang.Object r4 = r0.next()
            int r5 = r1 + 1
            if (r1 < 0) goto Lfa
            vb.a r4 = (vb.a) r4
            fg.l r6 = r13.f19483j
            boolean r7 = r14.f(r6)
            boolean r8 = r14.h(r4)
            r7 = r7 | r8
            java.lang.Object r8 = r14.P()
            if (r7 != 0) goto Lcb
            i0.e r7 = i0.l.f5952a
            if (r8 != r7) goto Ld5
        Lcb:
            sh.v1 r8 = new sh.v1
            r7 = 11
            r8.<init>(r6, r7, r4)
            r14.k0(r8)
        Ld5:
            fg.a r8 = (fg.a) r8
            wb.ho.I0(r4, r8, r14, r3)
            int r4 = r15.size()
            int r4 = r4 - r2
            if (r1 >= r4) goto Lef
            r1 = -36125428(0xfffffffffdd8c50c, float:-3.6017047E37)
            r14.a0(r1)
            r1 = 0
            wb.ho.D1(r1, r14, r3, r2)
            r14.p(r3)
            goto Lf8
        Lef:
            r1 = -36073534(0xfffffffffdd98fc2, float:-3.6148614E37)
            r14.a0(r1)
            r14.p(r3)
        Lf8:
            r1 = r5
            goto La6
        Lfa:
            a.a.Q0()
            r14 = 0
            throw r14
        Lff:
            r14.p(r3)
            goto L106
        L103:
            r14.V()
        L106:
            sf.n r14 = sf.n.f12433a
            return r14
        L109:
            i0.h0 r14 = (i0.h0) r14
            java.lang.Integer r15 = (java.lang.Integer) r15
            r15.getClass()
            r15 = 1
            int r15 = i0.r.C(r15)
            java.util.List r0 = r13.f19481h
            java.lang.String r1 = r13.f19482i
            fg.l r2 = r13.f19483j
            wb.ho.Z(r0, r1, r2, r14, r15)
        L11e:
            sf.n r14 = sf.n.f12433a
            return r14
        L121:
            i0.h0 r14 = (i0.h0) r14
            java.lang.Integer r15 = (java.lang.Integer) r15
            r15.getClass()
            r15 = 1
            int r15 = i0.r.C(r15)
            java.util.List r0 = r13.f19481h
            java.lang.String r1 = r13.f19482i
            fg.l r2 = r13.f19483j
            wb.ho.Z(r0, r1, r2, r14, r15)
            goto L11e
    }
}
