package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ib implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16784g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f16785h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f16786i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fg.a f16787j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16788k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16789l;

    public /* synthetic */ ib(android.content.SharedPreferences r1, android.content.Context r2, fg.a r3, i0.a1 r4, i0.a1 r5, int r6) {
            r0 = this;
            r0.f16784g = r6
            r0.f16785h = r1
            r0.f16786i = r2
            r0.f16787j = r3
            r0.f16788k = r4
            r0.f16789l = r5
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r10, java.lang.Object r11, java.lang.Object r12) {
            r9 = this;
            int r0 = r9.f16784g
            th.a r10 = (th.a) r10
            r6 = r11
            i0.h0 r6 = (i0.h0) r6
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r11 = r12.intValue()
            switch(r0) {
                case 0: goto L62;
                default: goto L10;
            }
        L10:
            r10.getClass()
            r10 = r11 & 17
            r12 = 16
            r0 = 1
            if (r10 == r12) goto L1c
            r10 = r0
            goto L1d
        L1c:
            r10 = 0
        L1d:
            r11 = r11 & r0
            boolean r10 = r6.S(r11, r10)
            if (r10 == 0) goto L5c
            android.content.SharedPreferences r3 = r9.f16785h
            boolean r10 = r6.h(r3)
            android.content.Context r2 = r9.f16786i
            boolean r11 = r6.h(r2)
            r10 = r10 | r11
            java.lang.Object r11 = r6.P()
            if (r10 != 0) goto L3b
            i0.e r10 = i0.l.f5952a
            if (r11 != r10) goto L49
        L3b:
            wb.xb r0 = new wb.xb
            r1 = 3
            i0.a1 r4 = r9.f16788k
            i0.a1 r5 = r9.f16789l
            r0.<init>(r1, r2, r3, r4, r5)
            r6.k0(r0)
            r11 = r0
        L49:
            r1 = r11
            fg.a r1 = (fg.a) r1
            r7 = 390(0x186, float:5.47E-43)
            r8 = 48
            java.lang.String r0 = "保存设置"
            java.lang.String r2 = "返回"
            fg.a r3 = r9.f16787j
            r4 = 0
            r5 = 0
            wb.ho.M(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            goto L5f
        L5c:
            r6.V()
        L5f:
            sf.n r10 = sf.n.f12433a
            return r10
        L62:
            r10.getClass()
            r10 = r11 & 17
            r12 = 16
            r0 = 1
            if (r10 == r12) goto L6e
            r10 = r0
            goto L6f
        L6e:
            r10 = 0
        L6f:
            r11 = r11 & r0
            boolean r10 = r6.S(r11, r10)
            if (r10 == 0) goto Lae
            android.content.SharedPreferences r3 = r9.f16785h
            boolean r10 = r6.h(r3)
            android.content.Context r2 = r9.f16786i
            boolean r11 = r6.h(r2)
            r10 = r10 | r11
            java.lang.Object r11 = r6.P()
            if (r10 != 0) goto L8d
            i0.e r10 = i0.l.f5952a
            if (r11 != r10) goto L9b
        L8d:
            wb.xb r0 = new wb.xb
            r1 = 2
            i0.a1 r4 = r9.f16788k
            i0.a1 r5 = r9.f16789l
            r0.<init>(r1, r2, r3, r4, r5)
            r6.k0(r0)
            r11 = r0
        L9b:
            r1 = r11
            fg.a r1 = (fg.a) r1
            r7 = 390(0x186, float:5.47E-43)
            r8 = 48
            java.lang.String r0 = "保存设置"
            java.lang.String r2 = "返回"
            fg.a r3 = r9.f16787j
            r4 = 0
            r5 = 0
            wb.ho.M(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            goto Lb1
        Lae:
            r6.V()
        Lb1:
            sf.n r10 = sf.n.f12433a
            return r10
    }
}
