package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sc implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19050g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f19051h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.SharedPreferences f19052i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19053j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19054k;

    public /* synthetic */ sc(int r1, android.content.Context r2, android.content.SharedPreferences r3, i0.a1 r4, i0.a1 r5) {
            r0 = this;
            r0.f19050g = r1
            r0.f19051h = r2
            r0.f19052i = r3
            r0.f19053j = r4
            r0.f19054k = r5
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r13, java.lang.Object r14) {
            r12 = this;
            int r0 = r12.f19050g
            switch(r0) {
                case 0: goto L29;
                default: goto L5;
            }
        L5:
            java.lang.Double r13 = (java.lang.Double) r13
            double r3 = r13.doubleValue()
            java.lang.Double r14 = (java.lang.Double) r14
            double r5 = r14.doubleValue()
            android.content.SharedPreferences r0 = r12.f19052i
            i0.a1 r1 = r12.f19053j
            i0.a1 r2 = r12.f19054k
            wb.ho.v0(r0, r1, r2, r3, r5)
            java.lang.String r13 = "已保存虚拟定位"
            r14 = 0
            android.content.Context r0 = r12.f19051h
            android.widget.Toast r13 = android.widget.Toast.makeText(r0, r13, r14)
            r13.show()
            sf.n r13 = sf.n.f12433a
            return r13
        L29:
            r5 = r13
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r13 = r14.intValue()
            r14 = r13 & 3
            r0 = 2
            r7 = 1
            r8 = 0
            if (r14 == r0) goto L3b
            r14 = r7
            goto L3c
        L3b:
            r14 = r8
        L3c:
            r13 = r13 & r7
            boolean r13 = r5.S(r13, r14)
            if (r13 == 0) goto L125
            i0.a1 r13 = r12.f19053j
            java.lang.Object r14 = r13.getValue()
            r1 = r14
            java.lang.String r1 = (java.lang.String) r1
            android.content.Context r14 = r12.f19051h
            boolean r0 = r5.h(r14)
            android.content.SharedPreferences r9 = r12.f19052i
            boolean r2 = r5.h(r9)
            r0 = r0 | r2
            java.lang.Object r2 = r5.P()
            i0.e r10 = i0.l.f5952a
            if (r0 != 0) goto L63
            if (r2 != r10) goto L6c
        L63:
            wb.bg r2 = new wb.bg
            r0 = 0
            r2.<init>(r9, r14, r13, r0)
            r5.k0(r2)
        L6c:
            r3 = r2
            fg.a r3 = (fg.a) r3
            java.lang.Object r0 = r13.getValue()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = og.m.t0(r0)
            r11 = 0
            if (r0 == 0) goto L87
            r13 = -1218492592(0xffffffffb75f4750, float:-1.33084395E-5)
            r5.a0(r13)
            r5.p(r8)
            r4 = r11
            goto Lad
        L87:
            r0 = -1218470271(0xffffffffb75f9e81, float:-1.332874E-5)
            r5.a0(r0)
            boolean r0 = r5.h(r9)
            boolean r2 = r5.h(r14)
            r0 = r0 | r2
            java.lang.Object r2 = r5.P()
            if (r0 != 0) goto L9e
            if (r2 != r10) goto La7
        L9e:
            wb.bg r2 = new wb.bg
            r0 = 1
            r2.<init>(r9, r14, r13, r0)
            r5.k0(r2)
        La7:
            fg.a r2 = (fg.a) r2
            r5.p(r8)
            r4 = r2
        Lad:
            r6 = 390(0x186, float:5.47E-43)
            java.lang.String r0 = "浅色模式图标"
            java.lang.String r2 = "未选择时使用内置快捷菜单图标"
            wb.ho.Q0(r0, r1, r2, r3, r4, r5, r6)
            r13 = 0
            wb.ho.D1(r13, r5, r8, r7)
            i0.a1 r13 = r12.f19054k
            java.lang.Object r0 = r13.getValue()
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = r5.h(r14)
            boolean r2 = r5.h(r9)
            r0 = r0 | r2
            java.lang.Object r2 = r5.P()
            if (r0 != 0) goto Ld4
            if (r2 != r10) goto Ldd
        Ld4:
            wb.bg r2 = new wb.bg
            r0 = 2
            r2.<init>(r9, r14, r13, r0)
            r5.k0(r2)
        Ldd:
            r3 = r2
            fg.a r3 = (fg.a) r3
            java.lang.Object r0 = r13.getValue()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = og.m.t0(r0)
            if (r0 == 0) goto Lf7
            r13 = -1217215888(0xffffffffb772c270, float:-1.4469595E-5)
            r5.a0(r13)
        Lf2:
            r5.p(r8)
            r4 = r11
            goto L11b
        Lf7:
            r0 = -1217193164(0xffffffffb7731b34, float:-1.4490262E-5)
            r5.a0(r0)
            boolean r0 = r5.h(r9)
            boolean r2 = r5.h(r14)
            r0 = r0 | r2
            java.lang.Object r2 = r5.P()
            if (r0 != 0) goto L10e
            if (r2 != r10) goto L117
        L10e:
            wb.bg r2 = new wb.bg
            r0 = 3
            r2.<init>(r9, r14, r13, r0)
            r5.k0(r2)
        L117:
            r11 = r2
            fg.a r11 = (fg.a) r11
            goto Lf2
        L11b:
            r6 = 390(0x186, float:5.47E-43)
            java.lang.String r0 = "深色模式图标"
            java.lang.String r2 = "未选择时沿用浅色模式图标"
            wb.ho.Q0(r0, r1, r2, r3, r4, r5, r6)
            goto L128
        L125:
            r5.V()
        L128:
            sf.n r13 = sf.n.f12433a
            return r13
    }
}
