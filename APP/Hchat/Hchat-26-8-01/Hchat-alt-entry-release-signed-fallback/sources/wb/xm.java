package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xm implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f20224g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f20225h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f20226i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ fg.l f20227j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ fg.a f20228k;

    public /* synthetic */ xm(fg.l r2, i0.a1 r3, android.content.Context r4, fg.a r5) {
            r1 = this;
            r0 = 0
            r1.f20224g = r0
            r1.<init>()
            r1.f20227j = r2
            r1.f20225h = r3
            r1.f20226i = r4
            r1.f20228k = r5
            return
    }

    public /* synthetic */ xm(i0.a1 r2, android.content.Context r3, fg.l r4, fg.a r5) {
            r1 = this;
            r0 = 1
            r1.f20224g = r0
            r1.<init>()
            r1.f20225h = r2
            r1.f20226i = r3
            r1.f20227j = r4
            r1.f20228k = r5
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r10, java.lang.Object r11, java.lang.Object r12) {
            r9 = this;
            int r0 = r9.f20224g
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
            i0.a1 r10 = r9.f20225h
            boolean r11 = r6.f(r10)
            android.content.Context r12 = r9.f20226i
            boolean r0 = r6.h(r12)
            r11 = r11 | r0
            fg.l r0 = r9.f20227j
            boolean r1 = r6.f(r0)
            r11 = r11 | r1
            java.lang.Object r1 = r6.P()
            if (r11 != 0) goto L42
            i0.e r11 = i0.l.f5952a
            if (r1 != r11) goto L4a
        L42:
            wb.ba r1 = new wb.ba
            r1.<init>(r12, r0, r10)
            r6.k0(r1)
        L4a:
            fg.a r1 = (fg.a) r1
            r7 = 390(0x186, float:5.47E-43)
            r8 = 48
            java.lang.String r0 = "使用所选模型"
            java.lang.String r2 = "返回"
            fg.a r3 = r9.f20228k
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
            fg.l r10 = r9.f20227j
            boolean r11 = r6.f(r10)
            i0.a1 r12 = r9.f20225h
            boolean r0 = r6.f(r12)
            r11 = r11 | r0
            android.content.Context r0 = r9.f20226i
            boolean r1 = r6.h(r0)
            r11 = r11 | r1
            java.lang.Object r1 = r6.P()
            if (r11 != 0) goto L94
            i0.e r11 = i0.l.f5952a
            if (r1 != r11) goto L9c
        L94:
            wb.ba r1 = new wb.ba
            r1.<init>(r10, r0, r12)
            r6.k0(r1)
        L9c:
            fg.a r1 = (fg.a) r1
            r7 = 390(0x186, float:5.47E-43)
            r8 = 48
            java.lang.String r0 = "保存模板"
            java.lang.String r2 = "返回"
            fg.a r3 = r9.f20228k
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
