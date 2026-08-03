package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qu implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18735g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18736h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ wb.lv f18737i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18738j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.util.List f18739k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f18740l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ fg.l f18741m;

    public /* synthetic */ qu(java.lang.String r1, wb.lv r2, java.lang.String r3, java.util.List r4, android.app.Activity r5, fg.l r6, int r7) {
            r0 = this;
            r0.f18735g = r7
            r0.f18736h = r1
            r0.f18737i = r2
            r0.f18738j = r3
            r0.f18739k = r4
            r0.f18740l = r5
            r0.f18741m = r6
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
            r8 = this;
            int r0 = r8.f18735g
            switch(r0) {
                case 0: goto L63;
                default: goto L5;
            }
        L5:
            r4 = r9
            fg.a r4 = (fg.a) r4
            i0.h0 r10 = (i0.h0) r10
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r9 = r11.intValue()
            r4.getClass()
            r11 = r9 & 6
            if (r11 != 0) goto L21
            boolean r11 = r10.h(r4)
            if (r11 == 0) goto L1f
            r11 = 4
            goto L20
        L1f:
            r11 = 2
        L20:
            r9 = r9 | r11
        L21:
            r11 = r9 & 19
            r0 = 18
            if (r11 == r0) goto L29
            r11 = 1
            goto L2a
        L29:
            r11 = 0
        L2a:
            r0 = r9 & 1
            boolean r11 = r10.S(r0, r11)
            if (r11 == 0) goto L5c
            wb.y2 r11 = wb.y2.f20291p
            wb.ou r1 = new wb.ou
            r7 = 0
            java.lang.String r2 = r8.f18738j
            java.util.List r3 = r8.f18739k
            android.app.Activity r5 = r8.f18740l
            fg.l r6 = r8.f18741m
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0 = 141518573(0x86f66ed, float:7.2042435E-34)
            s0.d r5 = s0.i.e(r0, r1, r10)
            int r9 = r9 << 9
            r9 = r9 & 7168(0x1c00, float:1.0045E-41)
            r0 = 221190(0x36006, float:3.09953E-40)
            r7 = r9 | r0
            java.lang.String r2 = r8.f18736h
            wb.lv r3 = r8.f18737i
            r6 = r10
            r1 = r11
            r1.J(r2, r3, r4, r5, r6, r7)
            goto L60
        L5c:
            r6 = r10
            r6.V()
        L60:
            sf.n r9 = sf.n.f12433a
            return r9
        L63:
            r3 = r9
            fg.a r3 = (fg.a) r3
            i0.h0 r10 = (i0.h0) r10
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r9 = r11.intValue()
            r3.getClass()
            r11 = r9 & 6
            if (r11 != 0) goto L7f
            boolean r11 = r10.h(r3)
            if (r11 == 0) goto L7d
            r11 = 4
            goto L7e
        L7d:
            r11 = 2
        L7e:
            r9 = r9 | r11
        L7f:
            r11 = r9 & 19
            r0 = 18
            if (r11 == r0) goto L87
            r11 = 1
            goto L88
        L87:
            r11 = 0
        L88:
            r0 = r9 & 1
            boolean r11 = r10.S(r0, r11)
            if (r11 == 0) goto Lba
            wb.y2 r11 = wb.y2.f20291p
            wb.ou r0 = new wb.ou
            r6 = 1
            java.lang.String r1 = r8.f18738j
            java.util.List r2 = r8.f18739k
            android.app.Activity r4 = r8.f18740l
            fg.l r5 = r8.f18741m
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r1 = -91761621(0xfffffffffa87d42b, float:-3.5263168E35)
            s0.d r4 = s0.i.e(r1, r0, r10)
            int r9 = r9 << 9
            r9 = r9 & 7168(0x1c00, float:1.0045E-41)
            r0 = 221190(0x36006, float:3.09953E-40)
            r6 = r9 | r0
            java.lang.String r1 = r8.f18736h
            wb.lv r2 = r8.f18737i
            r5 = r10
            r0 = r11
            r0.J(r1, r2, r3, r4, r5, r6)
            goto Lbe
        Lba:
            r5 = r10
            r5.V()
        Lbe:
            sf.n r9 = sf.n.f12433a
            return r9
    }
}
