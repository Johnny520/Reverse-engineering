package w;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f14683g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f14684h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f14685i;

    public /* synthetic */ v(h0.d1 r1, boolean r2, int r3) {
            r0 = this;
            r3 = 0
            r0.f14683g = r3
            r0.<init>()
            r0.f14685i = r1
            r0.f14684h = r2
            return
    }

    public /* synthetic */ v(boolean r1, java.lang.Object r2, int r3) {
            r0 = this;
            r0.f14683g = r3
            r0.f14684h = r1
            r0.f14685i = r2
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r11, java.lang.Object r12) {
            r10 = this;
            int r0 = r10.f14683g
            switch(r0) {
                case 0: goto L16c;
                case 1: goto L132;
                case 2: goto Ld3;
                case 3: goto L5f;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r10.f14685i
            i0.a1 r0 = (i0.a1) r0
            r6 = r11
            i0.h0 r6 = (i0.h0) r6
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r11 = r12.intValue()
            r12 = r11 & 3
            r1 = 2
            r2 = 1
            if (r12 == r1) goto L1a
            r12 = r2
            goto L1b
        L1a:
            r12 = 0
        L1b:
            r11 = r11 & r2
            boolean r11 = r6.S(r11, r12)
            if (r11 == 0) goto L59
            boolean r11 = r10.f14684h
            if (r11 == 0) goto L2a
            java.lang.String r11 = "标签名称"
        L28:
            r2 = r11
            goto L2d
        L2a:
            java.lang.String r11 = "昵称 / 群聊备注 / wxid"
            goto L28
        L2d:
            java.lang.Object r11 = r0.getValue()
            r3 = r11
            java.lang.String r3 = (java.lang.String) r3
            boolean r11 = r6.f(r0)
            java.lang.Object r12 = r6.P()
            if (r11 != 0) goto L42
            i0.e r11 = i0.l.f5952a
            if (r12 != r11) goto L4c
        L42:
            wb.aj r12 = new wb.aj
            r11 = 16
            r12.<init>(r0, r11)
            r6.k0(r12)
        L4c:
            r5 = r12
            fg.l r5 = (fg.l) r5
            r7 = 6
            r8 = 8
            java.lang.String r1 = "搜索"
            r4 = 0
            wb.ho.C1(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L5c
        L59:
            r6.V()
        L5c:
            sf.n r11 = sf.n.f12433a
            return r11
        L5f:
            java.lang.Object r0 = r10.f14685i
            e9.c r0 = (e9.c) r0
            r4 = r11
            i0.h0 r4 = (i0.h0) r4
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r11 = r12.intValue()
            r12 = r11 & 3
            r1 = 2
            r7 = 1
            r8 = 0
            if (r12 == r1) goto L75
            r12 = r7
            goto L76
        L75:
            r12 = r8
        L76:
            r11 = r11 & r7
            boolean r11 = r4.S(r11, r12)
            if (r11 == 0) goto Lcd
            boolean r11 = r10.f14684h
            if (r11 == 0) goto La5
            r11 = 1602680635(0x5f86f73b, float:1.9450614E19)
            r4.a0(r11)
            boolean r11 = r0.f2394e
            if (r11 == 0) goto L8f
            java.lang.String r11 = "未单独配置的公众号"
        L8d:
            r2 = r11
            goto L99
        L8f:
            boolean r11 = r0.f2393d
            if (r11 == 0) goto L96
            java.lang.String r11 = "未单独配置的群聊"
            goto L8d
        L96:
            java.lang.String r11 = "未单独配置的私聊"
            goto L8d
        L99:
            r5 = 6
            r6 = 4
            java.lang.String r1 = "类型"
            r3 = 0
            wb.ho.B1(r1, r2, r3, r4, r5, r6)
            r4.p(r8)
            goto Ld0
        La5:
            r11 = 1603042839(0x5f8c7e17, float:2.0247109E19)
            r4.a0(r11)
            java.lang.String r11 = r0.f2392c
            boolean r12 = og.m.t0(r11)
            if (r12 == 0) goto Lb5
            java.lang.String r11 = r0.f2391b
        Lb5:
            r2 = r11
            r5 = 6
            r6 = 4
            java.lang.String r1 = "名称"
            r3 = 0
            wb.ho.B1(r1, r2, r3, r4, r5, r6)
            r11 = 0
            wb.ho.D1(r11, r4, r8, r7)
            java.lang.String r2 = r0.f2391b
            java.lang.String r1 = "ID"
            wb.ho.B1(r1, r2, r3, r4, r5, r6)
            r4.p(r8)
            goto Ld0
        Lcd:
            r4.V()
        Ld0:
            sf.n r11 = sf.n.f12433a
            return r11
        Ld3:
            java.lang.Object r0 = r10.f14685i
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            r4 = r11
            i0.h0 r4 = (i0.h0) r4
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r11 = r12.intValue()
            r12 = r11 & 3
            r0 = 2
            r1 = 1
            r9 = 0
            if (r12 == r0) goto Lea
            r12 = r1
            goto Leb
        Lea:
            r12 = r9
        Leb:
            r11 = r11 & r1
            boolean r11 = r4.S(r11, r12)
            if (r11 == 0) goto L12c
            boolean r11 = r10.f14684h
            if (r11 == 0) goto Lf9
            java.lang.String r11 = "处理中"
            goto Lfb
        Lf9:
            java.lang.String r11 = "待开始"
        Lfb:
            r7 = 6
            r8 = 4
            java.lang.String r3 = "当前状态"
            r5 = 0
            r6 = r4
            r4 = r11
            wb.ho.B1(r3, r4, r5, r6, r7, r8)
            r4 = r6
            boolean r11 = og.m.t0(r2)
            if (r11 != 0) goto L122
            r11 = 1657012517(0x62c40125, float:1.8078222E21)
            r4.a0(r11)
            r11 = 0
            wb.ho.D1(r11, r4, r9, r1)
            r5 = 6
            r6 = 4
            java.lang.String r1 = "最近结果"
            r3 = 0
            wb.ho.B1(r1, r2, r3, r4, r5, r6)
            r4.p(r9)
            goto L12f
        L122:
            r11 = 1657122071(0x62c5ad17, float:1.8232405E21)
            r4.a0(r11)
            r4.p(r9)
            goto L12f
        L12c:
            r4.V()
        L12f:
            sf.n r11 = sf.n.f12433a
            return r11
        L132:
            java.lang.Object r0 = r10.f14685i
            r5 = r0
            fg.l r5 = (fg.l) r5
            r6 = r11
            i0.h0 r6 = (i0.h0) r6
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r11 = r12.intValue()
            r12 = r11 & 3
            r0 = 2
            r1 = 1
            if (r12 == r0) goto L148
            r12 = r1
            goto L149
        L148:
            r12 = 0
        L149:
            r11 = r11 & r1
            boolean r11 = r6.S(r11, r12)
            if (r11 == 0) goto L166
            boolean r1 = r10.f14684h
            if (r1 == 0) goto L158
            java.lang.String r11 = "已归拢会话从微信首页隐藏"
        L156:
            r3 = r11
            goto L15b
        L158:
            java.lang.String r11 = "分组配置保留，会话恢复在微信首页显示"
            goto L156
        L15b:
            r7 = 48
            r8 = 8
            java.lang.String r2 = "聊天分组"
            r4 = 0
            wb.ho.P3(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L169
        L166:
            r6.V()
        L169:
            sf.n r11 = sf.n.f12433a
            return r11
        L16c:
            java.lang.Object r0 = r10.f14685i
            h0.d1 r0 = (h0.d1) r0
            i0.h0 r11 = (i0.h0) r11
            java.lang.Integer r12 = (java.lang.Integer) r12
            r12.getClass()
            r12 = 1
            int r12 = i0.r.C(r12)
            boolean r1 = r10.f14684h
            w.s.i(r0, r1, r11, r12)
            sf.n r11 = sf.n.f12433a
            return r11
    }
}
