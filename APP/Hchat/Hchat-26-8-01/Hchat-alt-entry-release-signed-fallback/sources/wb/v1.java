package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v1 implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19591g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wb.s0 f19592h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19593i;

    public /* synthetic */ v1(wb.s0 r1, i0.a1 r2, int r3) {
            r0 = this;
            r0.f19591g = r3
            r0.f19592h = r1
            r0.f19593i = r2
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r7, java.lang.Object r8, java.lang.Object r9) {
            r6 = this;
            int r0 = r6.f19591g
            r.d r7 = (r.d) r7
            switch(r0) {
                case 0: goto L9b;
                case 1: goto L42;
                default: goto L7;
            }
        L7:
            i0.h0 r8 = (i0.h0) r8
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r7.getClass()
            r7 = r9 & 17
            r0 = 16
            r1 = 1
            if (r7 == r0) goto L1b
            r7 = r1
            goto L1c
        L1b:
            r7 = 0
        L1c:
            r9 = r9 & r1
            boolean r7 = r8.S(r9, r7)
            if (r7 == 0) goto L3c
            b0.q r7 = new b0.q
            r9 = 27
            wb.s0 r0 = r6.f19592h
            i0.a1 r2 = r6.f19593i
            r7.<init>(r0, r9, r2)
            r9 = 1327069086(0x4f19779e, float:2.5747533E9)
            s0.d r7 = s0.i.e(r9, r7, r8)
            r9 = 48
            r0 = 0
            wb.ho.C3(r0, r7, r8, r9, r1)
            goto L3f
        L3c:
            r8.V()
        L3f:
            sf.n r7 = sf.n.f12433a
            return r7
        L42:
            r4 = r8
            i0.h0 r4 = (i0.h0) r4
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r8 = r9.intValue()
            r7.getClass()
            r7 = r8 & 17
            r9 = 16
            r0 = 1
            if (r7 == r9) goto L57
            r7 = r0
            goto L58
        L57:
            r7 = 0
        L58:
            r8 = r8 & r0
            boolean r7 = r4.S(r8, r7)
            if (r7 == 0) goto L95
            i0.a1 r7 = r6.f19593i
            java.lang.Object r8 = r7.getValue()
            java.util.Set r8 = (java.util.Set) r8
            wb.s0 r0 = r6.f19592h
            java.lang.String r9 = r0.f18970a
            boolean r1 = r8.contains(r9)
            boolean r8 = r4.f(r7)
            boolean r9 = r4.h(r0)
            r8 = r8 | r9
            java.lang.Object r9 = r4.P()
            if (r8 != 0) goto L82
            i0.e r8 = i0.l.f5952a
            if (r9 != r8) goto L8b
        L82:
            wb.x1 r9 = new wb.x1
            r8 = 1
            r9.<init>(r0, r7, r8)
            r4.k0(r9)
        L8b:
            r3 = r9
            fg.a r3 = (fg.a) r3
            r5 = 384(0x180, float:5.38E-43)
            r2 = 1
            wb.ho.a0(r0, r1, r2, r3, r4, r5)
            goto L98
        L95:
            r4.V()
        L98:
            sf.n r7 = sf.n.f12433a
            return r7
        L9b:
            r4 = r8
            i0.h0 r4 = (i0.h0) r4
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r8 = r9.intValue()
            r7.getClass()
            r7 = r8 & 17
            r9 = 16
            r0 = 1
            if (r7 == r9) goto Lb0
            r7 = r0
            goto Lb1
        Lb0:
            r7 = 0
        Lb1:
            r8 = r8 & r0
            boolean r7 = r4.S(r8, r7)
            if (r7 == 0) goto Lee
            i0.a1 r7 = r6.f19593i
            java.lang.Object r8 = r7.getValue()
            java.util.Set r8 = (java.util.Set) r8
            wb.s0 r0 = r6.f19592h
            java.lang.String r9 = r0.f18970a
            boolean r1 = r8.contains(r9)
            boolean r8 = r4.f(r7)
            boolean r9 = r4.h(r0)
            r8 = r8 | r9
            java.lang.Object r9 = r4.P()
            if (r8 != 0) goto Ldb
            i0.e r8 = i0.l.f5952a
            if (r9 != r8) goto Le4
        Ldb:
            wb.x1 r9 = new wb.x1
            r8 = 0
            r9.<init>(r0, r7, r8)
            r4.k0(r9)
        Le4:
            r3 = r9
            fg.a r3 = (fg.a) r3
            r5 = 384(0x180, float:5.38E-43)
            r2 = 1
            wb.ho.a0(r0, r1, r2, r3, r4, r5)
            goto Lf1
        Lee:
            r4.V()
        Lf1:
            sf.n r7 = sf.n.f12433a
            return r7
    }
}
