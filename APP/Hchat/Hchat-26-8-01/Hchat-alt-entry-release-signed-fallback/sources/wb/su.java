package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class su implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19143g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f19144h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f19145i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f19146j;

    public /* synthetic */ su(android.app.Activity r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r0 = 0
            r1.f19143g = r0
            r1.<init>()
            r1.f19146j = r2
            r1.f19144h = r3
            r1.f19145i = r4
            return
    }

    public /* synthetic */ su(java.lang.String r2, wb.lv r3, java.lang.String r4) {
            r1 = this;
            r0 = 1
            r1.f19143g = r0
            r1.<init>()
            r1.f19144h = r2
            r1.f19146j = r3
            r1.f19145i = r4
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
            r8 = this;
            int r0 = r8.f19143g
            switch(r0) {
                case 0: goto L5e;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r8.f19146j
            r3 = r0
            wb.lv r3 = (wb.lv) r3
            r4 = r9
            fg.a r4 = (fg.a) r4
            r6 = r10
            i0.h0 r6 = (i0.h0) r6
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r9 = r11.intValue()
            r4.getClass()
            r10 = r9 & 6
            if (r10 != 0) goto L27
            boolean r10 = r6.h(r4)
            if (r10 == 0) goto L25
            r10 = 4
            goto L26
        L25:
            r10 = 2
        L26:
            r9 = r9 | r10
        L27:
            r10 = r9 & 19
            r11 = 18
            if (r10 == r11) goto L2f
            r10 = 1
            goto L30
        L2f:
            r10 = 0
        L30:
            r11 = r9 & 1
            boolean r10 = r6.S(r11, r10)
            if (r10 == 0) goto L58
            wb.y2 r1 = wb.y2.f20291p
            wb.rf r10 = new wb.rf
            r11 = 1
            java.lang.String r0 = r8.f19145i
            r10.<init>(r0, r4, r11)
            r11 = -1516152565(0xffffffffa5a1590b, float:-2.7989386E-16)
            s0.d r5 = s0.i.e(r11, r10, r6)
            int r9 = r9 << 9
            r9 = r9 & 7168(0x1c00, float:1.0045E-41)
            r10 = 221190(0x36006, float:3.09953E-40)
            r7 = r9 | r10
            java.lang.String r2 = r8.f19144h
            r1.J(r2, r3, r4, r5, r6, r7)
            goto L5b
        L58:
            r6.V()
        L5b:
            sf.n r9 = sf.n.f12433a
            return r9
        L5e:
            java.lang.Object r0 = r8.f19146j
            android.app.Activity r0 = (android.app.Activity) r0
            r4 = r9
            fg.a r4 = (fg.a) r4
            r6 = r10
            i0.h0 r6 = (i0.h0) r6
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r9 = r11.intValue()
            r4.getClass()
            r10 = r9 & 6
            if (r10 != 0) goto L7f
            boolean r10 = r6.h(r4)
            if (r10 == 0) goto L7d
            r10 = 4
            goto L7e
        L7d:
            r10 = 2
        L7e:
            r9 = r9 | r10
        L7f:
            r10 = r9 & 19
            r11 = 18
            if (r10 == r11) goto L87
            r10 = 1
            goto L88
        L87:
            r10 = 0
        L88:
            r11 = r9 & 1
            boolean r10 = r6.S(r11, r10)
            if (r10 == 0) goto Lda
            boolean r10 = r6.h(r0)
            java.lang.String r2 = "检测到微信异常"
            boolean r11 = r6.f(r2)
            r10 = r10 | r11
            java.lang.String r11 = r8.f19144h
            boolean r1 = r6.f(r11)
            r10 = r10 | r1
            java.lang.Object r1 = r6.P()
            if (r10 != 0) goto Lac
            i0.e r10 = i0.l.f5952a
            if (r1 != r10) goto Lb6
        Lac:
            wb.xi r1 = new wb.xi
            r10 = 20
            r1.<init>(r0, r10, r11)
            r6.k0(r1)
        Lb6:
            fg.a r1 = (fg.a) r1
            r10 = r1
            wb.y2 r1 = wb.y2.f20291p
            wb.rj r11 = new wb.rj
            r0 = 23
            java.lang.String r3 = r8.f19145i
            r11.<init>(r10, r3, r4, r0)
            r10 = -990295983(0xffffffffc4f94851, float:-1994.2599)
            s0.d r5 = s0.i.e(r10, r11, r6)
            int r9 = r9 << 9
            r9 = r9 & 7168(0x1c00, float:1.0045E-41)
            r10 = 221574(0x36186, float:3.10491E-40)
            r7 = r9 | r10
            wb.lv r3 = wb.lv.f17582i
            r1.J(r2, r3, r4, r5, r6, r7)
            goto Ldd
        Lda:
            r6.V()
        Ldd:
            sf.n r9 = sf.n.f12433a
            return r9
    }
}
