package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p9 implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f18421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ fg.a f18422h;

    public /* synthetic */ p9(int r1, int r2, fg.a r3) {
            r0 = this;
            r0.f18421g = r2
            r0.f18422h = r3
            r0.<init>()
            return
    }

    public /* synthetic */ p9(fg.a r1, int r2) {
            r0 = this;
            r0.f18421g = r2
            r0.f18422h = r1
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r9, java.lang.Object r10) {
            r8 = this;
            int r0 = r8.f18421g
            switch(r0) {
                case 0: goto L3d4;
                case 1: goto L391;
                case 2: goto L34e;
                case 3: goto L30a;
                case 4: goto L2c6;
                case 5: goto L29c;
                case 6: goto L258;
                case 7: goto L214;
                case 8: goto L1d1;
                case 9: goto L1a7;
                case 10: goto L17d;
                case 11: goto L139;
                case 12: goto Lf5;
                case 13: goto Lcb;
                case 14: goto L19;
                default: goto L5;
            }
        L5:
            i0.h0 r9 = (i0.h0) r9
            java.lang.Integer r10 = (java.lang.Integer) r10
            r10.getClass()
            r10 = 7
            int r10 = i0.r.C(r10)
            fg.a r0 = r8.f18422h
            wb.ho.k0(r0, r9, r10)
        L16:
            sf.n r9 = sf.n.f12433a
            return r9
        L19:
            r4 = r9
            i0.h0 r4 = (i0.h0) r4
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r9 = r10.intValue()
            r10 = r9 & 3
            r0 = 2
            r6 = 1
            r7 = 0
            if (r10 == r0) goto L2b
            r10 = r6
            goto L2c
        L2b:
            r10 = r7
        L2c:
            r9 = r9 & r6
            boolean r9 = r4.S(r9, r10)
            if (r9 == 0) goto Lc5
            fg.a r9 = r8.f18422h
            if (r9 != 0) goto L42
            r9 = -1080253013(0xffffffffbf9ca5ab, float:-1.2238058)
            r4.a0(r9)
            r4.p(r7)
            goto Lc8
        L42:
            r10 = -1080253012(0xffffffffbf9ca5ac, float:-1.2238059)
            r4.a0(r10)
            r10 = 40
            float r10 = (float) r10
            y0.l r0 = y0.l.f21818a
            y0.o r10 = p.h1.j(r0, r10)
            y0.o r9 = wb.ho.O6(r10, r9)
            y0.g r10 = y0.b.f21796k
            v1.n0 r10 = p.o.d(r10, r7)
            long r1 = r4.T
            int r1 = java.lang.Long.hashCode(r1)
            s0.h r2 = r4.l()
            y0.o r9 = y0.a.c(r4, r9)
            x1.f r3 = x1.g.f20914f
            r3.getClass()
            x1.y r3 = x1.f.f20883b
            r4.d0()
            boolean r5 = r4.S
            if (r5 == 0) goto L7b
            r4.k(r3)
            goto L7e
        L7b:
            r4.n0()
        L7e:
            x1.e r3 = x1.f.f20886e
            i0.r.A(r3, r4, r10)
            x1.e r10 = x1.f.f20885d
            i0.r.A(r10, r4, r2)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            x1.e r1 = x1.f.f20887f
            i0.r.A(r1, r4, r10)
            x1.d r10 = x1.f.f20888g
            i0.r.w(r10, r4)
            x1.e r10 = x1.f.f20884c
            i0.r.A(r10, r4, r9)
            r9 = r0
            m1.f r0 = wb.ap.f15060a
            i0.m2 r10 = bi.d.f892a
            java.lang.Object r10 = r4.j(r10)
            bi.b r10 = (bi.b) r10
            long r1 = r10.g()
            f1.n r3 = new f1.n
            r10 = 5
            r3.<init>(r1, r10)
            r10 = 24
            float r10 = (float) r10
            y0.o r2 = p.h1.j(r9, r10)
            java.lang.String r1 = "返回"
            r5 = 438(0x1b6, float:6.14E-43)
            k.n.c(r0, r1, r2, r3, r4, r5)
            r4.p(r6)
            r4.p(r7)
            goto Lc8
        Lc5:
            r4.V()
        Lc8:
            sf.n r9 = sf.n.f12433a
            return r9
        Lcb:
            i0.h0 r9 = (i0.h0) r9
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r0 = r10 & 3
            r1 = 2
            r2 = 1
            if (r0 == r1) goto Ldb
            r0 = r2
            goto Ldc
        Ldb:
            r0 = 0
        Ldc:
            r10 = r10 & r2
            boolean r10 = r9.S(r10, r0)
            if (r10 == 0) goto Lef
            java.lang.String r10 = "添加一条按顺序发送的回复"
            r0 = 54
            java.lang.String r1 = "新增回复"
            fg.a r2 = r8.f18422h
            wb.ho.b(r1, r10, r2, r9, r0)
            goto Lf2
        Lef:
            r9.V()
        Lf2:
            sf.n r9 = sf.n.f12433a
            return r9
        Lf5:
            i0.h0 r9 = (i0.h0) r9
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r0 = r10 & 3
            r1 = 2
            r2 = 1
            if (r0 == r1) goto L105
            r0 = r2
            goto L106
        L105:
            r0 = 0
        L106:
            r10 = r10 & r2
            boolean r10 = r9.S(r10, r0)
            if (r10 == 0) goto L133
            fg.a r10 = r8.f18422h
            boolean r0 = r9.f(r10)
            java.lang.Object r1 = r9.P()
            if (r0 != 0) goto L11d
            i0.e r0 = i0.l.f5952a
            if (r1 != r0) goto L127
        L11d:
            wb.kc r1 = new wb.kc
            r0 = 23
            r1.<init>(r10, r0)
            r9.k0(r1)
        L127:
            fg.a r1 = (fg.a) r1
            r10 = 54
            java.lang.String r0 = "删除当前群"
            java.lang.String r2 = "移除监听、模板绑定和本群专属设置"
            wb.ho.b(r0, r2, r1, r9, r10)
            goto L136
        L133:
            r9.V()
        L136:
            sf.n r9 = sf.n.f12433a
            return r9
        L139:
            i0.h0 r9 = (i0.h0) r9
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r0 = r10 & 3
            r1 = 2
            r2 = 1
            if (r0 == r1) goto L149
            r0 = r2
            goto L14a
        L149:
            r0 = 0
        L14a:
            r10 = r10 & r2
            boolean r10 = r9.S(r10, r0)
            if (r10 == 0) goto L177
            fg.a r10 = r8.f18422h
            boolean r0 = r9.f(r10)
            java.lang.Object r1 = r9.P()
            if (r0 != 0) goto L161
            i0.e r0 = i0.l.f5952a
            if (r1 != r0) goto L16b
        L161:
            wb.kc r1 = new wb.kc
            r0 = 22
            r1.<init>(r10, r0)
            r9.k0(r1)
        L16b:
            fg.a r1 = (fg.a) r1
            r10 = 54
            java.lang.String r0 = "删除模板"
            java.lang.String r2 = "删除后绑定关系也会移除"
            wb.ho.b(r0, r2, r1, r9, r10)
            goto L17a
        L177:
            r9.V()
        L17a:
            sf.n r9 = sf.n.f12433a
            return r9
        L17d:
            i0.h0 r9 = (i0.h0) r9
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r0 = r10 & 3
            r1 = 2
            r2 = 1
            if (r0 == r1) goto L18d
            r0 = r2
            goto L18e
        L18d:
            r0 = 0
        L18e:
            r10 = r10 & r2
            boolean r10 = r9.S(r10, r0)
            if (r10 == 0) goto L1a1
            java.lang.String r10 = "删除后相关聊天恢复默认规则"
            r0 = 54
            java.lang.String r1 = "删除模板"
            fg.a r2 = r8.f18422h
            wb.ho.b(r1, r10, r2, r9, r0)
            goto L1a4
        L1a1:
            r9.V()
        L1a4:
            sf.n r9 = sf.n.f12433a
            return r9
        L1a7:
            i0.h0 r9 = (i0.h0) r9
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r0 = r10 & 3
            r1 = 2
            r2 = 1
            if (r0 == r1) goto L1b7
            r0 = r2
            goto L1b8
        L1b7:
            r0 = 0
        L1b8:
            r10 = r10 & r2
            boolean r10 = r9.S(r10, r0)
            if (r10 == 0) goto L1cb
            java.lang.String r10 = "删除后不会移除原功能中已经保存的群聊"
            r0 = 54
            java.lang.String r1 = "删除标签"
            fg.a r2 = r8.f18422h
            wb.ho.b(r1, r10, r2, r9, r0)
            goto L1ce
        L1cb:
            r9.V()
        L1ce:
            sf.n r9 = sf.n.f12433a
            return r9
        L1d1:
            i0.h0 r9 = (i0.h0) r9
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r0 = r10 & 3
            r1 = 2
            r2 = 1
            if (r0 == r1) goto L1e1
            r0 = r2
            goto L1e2
        L1e1:
            r0 = 0
        L1e2:
            r10 = r10 & r2
            boolean r10 = r9.S(r10, r0)
            if (r10 == 0) goto L20e
            fg.a r10 = r8.f18422h
            boolean r0 = r9.f(r10)
            java.lang.Object r1 = r9.P()
            if (r0 != 0) goto L1f9
            i0.e r0 = i0.l.f5952a
            if (r1 != r0) goto L202
        L1f9:
            wb.kc r1 = new wb.kc
            r0 = 4
            r1.<init>(r10, r0)
            r9.k0(r1)
        L202:
            fg.a r1 = (fg.a) r1
            r10 = 54
            java.lang.String r0 = "删除规则"
            java.lang.String r2 = "移除该会话自定义通知配置"
            wb.ho.b(r0, r2, r1, r9, r10)
            goto L211
        L20e:
            r9.V()
        L211:
            sf.n r9 = sf.n.f12433a
            return r9
        L214:
            i0.h0 r9 = (i0.h0) r9
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r0 = r10 & 3
            r1 = 2
            r2 = 1
            if (r0 == r1) goto L224
            r0 = r2
            goto L225
        L224:
            r0 = 0
        L225:
            r10 = r10 & r2
            boolean r10 = r9.S(r10, r0)
            if (r10 == 0) goto L252
            fg.a r10 = r8.f18422h
            boolean r0 = r9.f(r10)
            java.lang.Object r1 = r9.P()
            if (r0 != 0) goto L23c
            i0.e r0 = i0.l.f5952a
            if (r1 != r0) goto L246
        L23c:
            wb.kc r1 = new wb.kc
            r0 = 9
            r1.<init>(r10, r0)
            r9.k0(r1)
        L246:
            fg.a r1 = (fg.a) r1
            r10 = 54
            java.lang.String r0 = "清空所有关键词"
            java.lang.String r2 = "移除全部关键词"
            wb.ho.b(r0, r2, r1, r9, r10)
            goto L255
        L252:
            r9.V()
        L255:
            sf.n r9 = sf.n.f12433a
            return r9
        L258:
            i0.h0 r9 = (i0.h0) r9
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r0 = r10 & 3
            r1 = 2
            r2 = 1
            if (r0 == r1) goto L268
            r0 = r2
            goto L269
        L268:
            r0 = 0
        L269:
            r10 = r10 & r2
            boolean r10 = r9.S(r10, r0)
            if (r10 == 0) goto L296
            fg.a r10 = r8.f18422h
            boolean r0 = r9.f(r10)
            java.lang.Object r1 = r9.P()
            if (r0 != 0) goto L280
            i0.e r0 = i0.l.f5952a
            if (r1 != r0) goto L28a
        L280:
            wb.kc r1 = new wb.kc
            r0 = 15
            r1.<init>(r10, r0)
            r9.k0(r1)
        L28a:
            fg.a r1 = (fg.a) r1
            r10 = 54
            java.lang.String r0 = "自定义群发"
            java.lang.String r2 = "编辑内容并选择模块或微信原生通道"
            wb.ho.b(r0, r2, r1, r9, r10)
            goto L299
        L296:
            r9.V()
        L299:
            sf.n r9 = sf.n.f12433a
            return r9
        L29c:
            i0.h0 r9 = (i0.h0) r9
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r0 = r10 & 3
            r1 = 2
            r2 = 1
            if (r0 == r1) goto L2ac
            r0 = r2
            goto L2ad
        L2ac:
            r0 = 0
        L2ad:
            r10 = r10 & r2
            boolean r10 = r9.S(r10, r0)
            if (r10 == 0) goto L2c0
            java.lang.String r10 = "移除后恢复默认规则"
            r0 = 54
            java.lang.String r1 = "移除适用聊天"
            fg.a r2 = r8.f18422h
            wb.ho.b(r1, r10, r2, r9, r0)
            goto L2c3
        L2c0:
            r9.V()
        L2c3:
            sf.n r9 = sf.n.f12433a
            return r9
        L2c6:
            i0.h0 r9 = (i0.h0) r9
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r0 = r10 & 3
            r1 = 2
            r2 = 1
            if (r0 == r1) goto L2d6
            r0 = r2
            goto L2d7
        L2d6:
            r0 = 0
        L2d7:
            r10 = r10 & r2
            boolean r10 = r9.S(r10, r0)
            if (r10 == 0) goto L304
            fg.a r10 = r8.f18422h
            boolean r0 = r9.f(r10)
            java.lang.Object r1 = r9.P()
            if (r0 != 0) goto L2ee
            i0.e r0 = i0.l.f5952a
            if (r1 != r0) goto L2f8
        L2ee:
            wb.kc r1 = new wb.kc
            r0 = 10
            r1.<init>(r10, r0)
            r9.k0(r1)
        L2f8:
            fg.a r1 = (fg.a) r1
            r10 = 54
            java.lang.String r0 = "删除关键词"
            java.lang.String r2 = "移除该关键词"
            wb.ho.b(r0, r2, r1, r9, r10)
            goto L307
        L304:
            r9.V()
        L307:
            sf.n r9 = sf.n.f12433a
            return r9
        L30a:
            i0.h0 r9 = (i0.h0) r9
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r0 = r10 & 3
            r1 = 2
            r2 = 1
            if (r0 == r1) goto L31a
            r0 = r2
            goto L31b
        L31a:
            r0 = 0
        L31b:
            r10 = r10 & r2
            boolean r10 = r9.S(r10, r0)
            if (r10 == 0) goto L348
            fg.a r10 = r8.f18422h
            boolean r0 = r9.f(r10)
            java.lang.Object r1 = r9.P()
            if (r0 != 0) goto L332
            i0.e r0 = i0.l.f5952a
            if (r1 != r0) goto L33c
        L332:
            wb.kc r1 = new wb.kc
            r0 = 13
            r1.<init>(r10, r0)
            r9.k0(r1)
        L33c:
            fg.a r1 = (fg.a) r1
            r10 = 54
            java.lang.String r0 = "删除模板"
            java.lang.String r2 = "删除后同时解除所有群绑定"
            wb.ho.b(r0, r2, r1, r9, r10)
            goto L34b
        L348:
            r9.V()
        L34b:
            sf.n r9 = sf.n.f12433a
            return r9
        L34e:
            i0.h0 r9 = (i0.h0) r9
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r0 = r10 & 3
            r1 = 2
            r2 = 1
            if (r0 == r1) goto L35e
            r0 = r2
            goto L35f
        L35e:
            r0 = 0
        L35f:
            r10 = r10 & r2
            boolean r10 = r9.S(r10, r0)
            if (r10 == 0) goto L38b
            fg.a r10 = r8.f18422h
            boolean r0 = r9.f(r10)
            java.lang.Object r1 = r9.P()
            if (r0 != 0) goto L376
            i0.e r0 = i0.l.f5952a
            if (r1 != r0) goto L37f
        L376:
            wb.kc r1 = new wb.kc
            r0 = 0
            r1.<init>(r10, r0)
            r9.k0(r1)
        L37f:
            fg.a r1 = (fg.a) r1
            r10 = 54
            java.lang.String r0 = "在线插件"
            java.lang.String r2 = "浏览、安装或上传社区脚本插件"
            wb.ho.b(r0, r2, r1, r9, r10)
            goto L38e
        L38b:
            r9.V()
        L38e:
            sf.n r9 = sf.n.f12433a
            return r9
        L391:
            i0.h0 r9 = (i0.h0) r9
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r0 = r10 & 3
            r1 = 2
            r2 = 1
            if (r0 == r1) goto L3a1
            r0 = r2
            goto L3a2
        L3a1:
            r0 = 0
        L3a2:
            r10 = r10 & r2
            boolean r10 = r9.S(r10, r0)
            if (r10 == 0) goto L3ce
            fg.a r10 = r8.f18422h
            boolean r0 = r9.f(r10)
            java.lang.Object r1 = r9.P()
            if (r0 != 0) goto L3b9
            i0.e r0 = i0.l.f5952a
            if (r1 != r0) goto L3c2
        L3b9:
            wb.kc r1 = new wb.kc
            r0 = 1
            r1.<init>(r10, r0)
            r9.k0(r1)
        L3c2:
            fg.a r1 = (fg.a) r1
            r10 = 54
            java.lang.String r0 = "插件 Agent"
            java.lang.String r2 = "按需求生成或修改脚本插件"
            wb.ho.b(r0, r2, r1, r9, r10)
            goto L3d1
        L3ce:
            r9.V()
        L3d1:
            sf.n r9 = sf.n.f12433a
            return r9
        L3d4:
            i0.h0 r9 = (i0.h0) r9
            java.lang.Integer r10 = (java.lang.Integer) r10
            r10.getClass()
            r10 = 1
            int r10 = i0.r.C(r10)
            fg.a r0 = r8.f18422h
            wb.ho.F3(r0, r9, r10)
            goto L16
    }
}
