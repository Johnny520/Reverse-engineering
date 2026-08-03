package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w1 implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19855g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f19856h;

    public /* synthetic */ w1(i0.a1 r1, int r2) {
            r0 = this;
            r0.f19855g = r2
            r0.f19856h = r1
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r12, java.lang.Object r13) {
            r11 = this;
            int r0 = r11.f19855g
            switch(r0) {
                case 0: goto L7f8;
                case 1: goto L7cd;
                case 2: goto L789;
                case 3: goto L73f;
                case 4: goto L6f3;
                case 5: goto L6a7;
                case 6: goto L65d;
                case 7: goto L614;
                case 8: goto L5ca;
                case 9: goto L547;
                case 10: goto L51c;
                case 11: goto L4cc;
                case 12: goto L496;
                case 13: goto L452;
                case 14: goto L408;
                case 15: goto L3be;
                case 16: goto L393;
                case 17: goto L34e;
                case 18: goto L304;
                case 19: goto L2c0;
                case 20: goto L295;
                case 21: goto L21d;
                case 22: goto L1d3;
                case 23: goto L18a;
                case 24: goto L15f;
                case 25: goto L11b;
                case 26: goto Lca;
                case 27: goto L7a;
                case 28: goto L30;
                default: goto L5;
            }
        L5:
            i0.h0 r12 = (i0.h0) r12
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r0 = r13 & 3
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L16
            r0 = r3
            goto L17
        L16:
            r0 = r2
        L17:
            r13 = r13 & r3
            boolean r13 = r12.S(r13, r0)
            if (r13 == 0) goto L2a
            i0.a1 r13 = r11.f19856h
            java.lang.Object r13 = r13.getValue()
            java.lang.String r13 = (java.lang.String) r13
            wb.ho.s0(r13, r12, r2)
            goto L2d
        L2a:
            r12.V()
        L2d:
            sf.n r12 = sf.n.f12433a
            return r12
        L30:
            r5 = r12
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r12 = r13.intValue()
            r13 = r12 & 3
            r0 = 2
            r1 = 1
            if (r13 == r0) goto L41
            r13 = r1
            goto L42
        L41:
            r13 = 0
        L42:
            r12 = r12 & r1
            boolean r12 = r5.S(r12, r13)
            if (r12 == 0) goto L74
            i0.a1 r12 = r11.f19856h
            java.lang.Object r13 = r12.getValue()
            r2 = r13
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r13 = r5.P()
            i0.e r0 = i0.l.f5952a
            if (r13 != r0) goto L64
            wb.bi r13 = new wb.bi
            r0 = 20
            r13.<init>(r12, r0)
            r5.k0(r13)
        L64:
            r4 = r13
            fg.l r4 = (fg.l) r4
            r6 = 24630(0x6036, float:3.4514E-41)
            r7 = 8
            java.lang.String r0 = "搜索监听群"
            java.lang.String r1 = "群名称 / 群聊备注 / 群号"
            r3 = 0
            wb.ho.C1(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L77
        L74:
            r5.V()
        L77:
            sf.n r12 = sf.n.f12433a
            return r12
        L7a:
            r5 = r12
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r12 = r13.intValue()
            r13 = r12 & 3
            r0 = 2
            r1 = 1
            if (r13 == r0) goto L8b
            r13 = r1
            goto L8c
        L8b:
            r13 = 0
        L8c:
            r12 = r12 & r1
            boolean r12 = r5.S(r12, r13)
            if (r12 == 0) goto Lc4
            i0.a1 r12 = r11.f19856h
            java.lang.Object r13 = r12.getValue()
            r2 = r13
            java.lang.String r2 = (java.lang.String) r2
            boolean r13 = r5.f(r12)
            java.lang.Object r0 = r5.P()
            if (r13 != 0) goto Laa
            i0.e r13 = i0.l.f5952a
            if (r0 != r13) goto Lb4
        Laa:
            wb.tg r0 = new wb.tg
            r13 = 21
            r0.<init>(r12, r13)
            r5.k0(r0)
        Lb4:
            r4 = r0
            fg.l r4 = (fg.l) r4
            r6 = 54
            r7 = 8
            java.lang.String r0 = "搜索"
            java.lang.String r1 = "昵称 / 群聊备注 / wxid"
            r3 = 0
            wb.ho.C1(r0, r1, r2, r3, r4, r5, r6, r7)
            goto Lc7
        Lc4:
            r5.V()
        Lc7:
            sf.n r12 = sf.n.f12433a
            return r12
        Lca:
            r6 = r12
            i0.h0 r6 = (i0.h0) r6
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r12 = r13.intValue()
            r13 = r12 & 3
            r0 = 2
            r1 = 1
            if (r13 == r0) goto Ldb
            r13 = r1
            goto Ldc
        Ldb:
            r13 = 0
        Ldc:
            r12 = r12 & r1
            boolean r12 = r6.S(r12, r13)
            if (r12 == 0) goto L115
            i0.a1 r12 = r11.f19856h
            java.lang.Object r13 = r12.getValue()
            r2 = r13
            java.lang.String r2 = (java.lang.String) r2
            java.util.List r3 = wb.ho.f16647o
            boolean r13 = r6.f(r12)
            java.lang.Object r0 = r6.P()
            if (r13 != 0) goto Lfc
            i0.e r13 = i0.l.f5952a
            if (r0 != r13) goto L106
        Lfc:
            wb.fg r0 = new wb.fg
            r13 = 17
            r0.<init>(r12, r13)
            r6.k0(r0)
        L106:
            r5 = r0
            fg.l r5 = (fg.l) r5
            r7 = 24630(0x6036, float:3.4514E-41)
            r8 = 0
            java.lang.String r0 = "改名提醒文本"
            java.lang.String r1 = "多个模板用 || 分隔随机选择"
            r4 = 3
            wb.ho.i4(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            goto L118
        L115:
            r6.V()
        L118:
            sf.n r12 = sf.n.f12433a
            return r12
        L11b:
            r3 = r12
            i0.h0 r3 = (i0.h0) r3
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r12 = r13.intValue()
            r13 = r12 & 3
            r0 = 2
            r1 = 1
            if (r13 == r0) goto L12c
            r13 = r1
            goto L12d
        L12c:
            r13 = 0
        L12d:
            r12 = r12 & r1
            boolean r12 = r3.S(r12, r13)
            if (r12 == 0) goto L159
            i0.a1 r12 = r11.f19856h
            java.lang.Object r13 = r12.getValue()
            r0 = r13
            wb.i2 r0 = (wb.i2) r0
            java.lang.Object r13 = r3.P()
            i0.e r1 = i0.l.f5952a
            if (r13 != r1) goto L14e
            wb.ih r13 = new wb.ih
            r1 = 7
            r13.<init>(r12, r1)
            r3.k0(r13)
        L14e:
            r1 = r13
            fg.l r1 = (fg.l) r1
            r4 = 48
            r5 = 4
            r2 = 0
            wb.ho.e0(r0, r1, r2, r3, r4, r5)
            goto L15c
        L159:
            r3.V()
        L15c:
            sf.n r12 = sf.n.f12433a
            return r12
        L15f:
            i0.h0 r12 = (i0.h0) r12
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r0 = r13 & 3
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L170
            r0 = r3
            goto L171
        L170:
            r0 = r2
        L171:
            r13 = r13 & r3
            boolean r13 = r12.S(r13, r0)
            if (r13 == 0) goto L184
            i0.a1 r13 = r11.f19856h
            java.lang.Object r13 = r13.getValue()
            java.lang.String r13 = (java.lang.String) r13
            wb.ho.s0(r13, r12, r2)
            goto L187
        L184:
            r12.V()
        L187:
            sf.n r12 = sf.n.f12433a
            return r12
        L18a:
            r5 = r12
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r12 = r13.intValue()
            r13 = r12 & 3
            r0 = 2
            r1 = 1
            if (r13 == r0) goto L19b
            r13 = r1
            goto L19c
        L19b:
            r13 = 0
        L19c:
            r12 = r12 & r1
            boolean r12 = r5.S(r12, r13)
            if (r12 == 0) goto L1cd
            i0.a1 r12 = r11.f19856h
            java.lang.Object r13 = r12.getValue()
            r2 = r13
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r13 = r5.P()
            i0.e r0 = i0.l.f5952a
            if (r13 != r0) goto L1bd
            wb.gi r13 = new wb.gi
            r0 = 7
            r13.<init>(r12, r0)
            r5.k0(r13)
        L1bd:
            r4 = r13
            fg.l r4 = (fg.l) r4
            r6 = 24630(0x6036, float:3.4514E-41)
            r7 = 8
            java.lang.String r0 = "搜索监听群"
            java.lang.String r1 = "群名称 / 群聊备注 / 群号"
            r3 = 0
            wb.ho.C1(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L1d0
        L1cd:
            r5.V()
        L1d0:
            sf.n r12 = sf.n.f12433a
            return r12
        L1d3:
            r5 = r12
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r12 = r13.intValue()
            r13 = r12 & 3
            r0 = 2
            r1 = 1
            if (r13 == r0) goto L1e4
            r13 = r1
            goto L1e5
        L1e4:
            r13 = 0
        L1e5:
            r12 = r12 & r1
            boolean r12 = r5.S(r12, r13)
            if (r12 == 0) goto L217
            i0.a1 r12 = r11.f19856h
            java.lang.Object r13 = r12.getValue()
            r2 = r13
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r13 = r5.P()
            i0.e r0 = i0.l.f5952a
            if (r13 != r0) goto L207
            wb.fg r13 = new wb.fg
            r0 = 20
            r13.<init>(r12, r0)
            r5.k0(r13)
        L207:
            r4 = r13
            fg.l r4 = (fg.l) r4
            r6 = 24630(0x6036, float:3.4514E-41)
            r7 = 8
            java.lang.String r0 = "搜索监听群"
            java.lang.String r1 = "群名称 / 群聊备注 / 群号"
            r3 = 0
            wb.ho.C1(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L21a
        L217:
            r5.V()
        L21a:
            sf.n r12 = sf.n.f12433a
            return r12
        L21d:
            r3 = r12
            i0.h0 r3 = (i0.h0) r3
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r12 = r13.intValue()
            r13 = r12 & 3
            r0 = 2
            r6 = 1
            r7 = 0
            if (r13 == r0) goto L22f
            r13 = r6
            goto L230
        L22f:
            r13 = r7
        L230:
            r12 = r12 & r6
            boolean r12 = r3.S(r12, r13)
            if (r12 == 0) goto L28f
            i0.a1 r12 = r11.f19856h
            java.lang.Object r12 = r12.getValue()
            rb.m r12 = (rb.m) r12
            java.util.List r12 = r12.f11936h
            r13 = 12
            java.util.List r12 = tf.m.M1(r13, r12)
            og.g r13 = new og.g
            r13.<init>(r12)
            java.util.Iterator r12 = r13.iterator()
            r13 = r7
        L251:
            r0 = r12
            tf.z r0 = (tf.z) r0
            java.lang.Object r0 = r0.f13173h
            java.util.ListIterator r0 = (java.util.ListIterator) r0
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L292
            java.lang.Object r0 = r0.previous()
            int r8 = r13 + 1
            if (r13 < 0) goto L28a
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            if (r13 <= 0) goto L279
            r13 = -1029250068(0xffffffffc2a6e3ec, float:-83.44516)
            r3.a0(r13)
            r13 = 0
            wb.ho.D1(r13, r3, r7, r6)
        L275:
            r3.p(r7)
            goto L280
        L279:
            r13 = -1841967580(0xffffffff9235ce24, float:-5.7367617E-28)
            r3.a0(r13)
            goto L275
        L280:
            r4 = 6
            r5 = 4
            java.lang.String r0 = "记录"
            r2 = 0
            wb.ho.B1(r0, r1, r2, r3, r4, r5)
            r13 = r8
            goto L251
        L28a:
            a.a.Q0()
            r12 = 0
            throw r12
        L28f:
            r3.V()
        L292:
            sf.n r12 = sf.n.f12433a
            return r12
        L295:
            i0.h0 r12 = (i0.h0) r12
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r0 = r13 & 3
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L2a6
            r0 = r3
            goto L2a7
        L2a6:
            r0 = r2
        L2a7:
            r13 = r13 & r3
            boolean r13 = r12.S(r13, r0)
            if (r13 == 0) goto L2ba
            i0.a1 r13 = r11.f19856h
            java.lang.Object r13 = r13.getValue()
            java.lang.String r13 = (java.lang.String) r13
            wb.ho.s0(r13, r12, r2)
            goto L2bd
        L2ba:
            r12.V()
        L2bd:
            sf.n r12 = sf.n.f12433a
            return r12
        L2c0:
            r3 = r12
            i0.h0 r3 = (i0.h0) r3
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r12 = r13.intValue()
            r13 = r12 & 3
            r0 = 2
            r1 = 1
            if (r13 == r0) goto L2d1
            r13 = r1
            goto L2d2
        L2d1:
            r13 = 0
        L2d2:
            r12 = r12 & r1
            boolean r12 = r3.S(r12, r13)
            if (r12 == 0) goto L2fe
            i0.a1 r12 = r11.f19856h
            java.lang.Object r13 = r12.getValue()
            r0 = r13
            wb.i2 r0 = (wb.i2) r0
            java.lang.Object r13 = r3.P()
            i0.e r1 = i0.l.f5952a
            if (r13 != r1) goto L2f3
            wb.oh r13 = new wb.oh
            r1 = 5
            r13.<init>(r12, r1)
            r3.k0(r13)
        L2f3:
            r1 = r13
            fg.l r1 = (fg.l) r1
            r4 = 432(0x1b0, float:6.05E-43)
            r5 = 0
            r2 = 0
            wb.ho.e0(r0, r1, r2, r3, r4, r5)
            goto L301
        L2fe:
            r3.V()
        L301:
            sf.n r12 = sf.n.f12433a
            return r12
        L304:
            r5 = r12
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r12 = r13.intValue()
            r13 = r12 & 3
            r0 = 2
            r1 = 1
            if (r13 == r0) goto L315
            r13 = r1
            goto L316
        L315:
            r13 = 0
        L316:
            r12 = r12 & r1
            boolean r12 = r5.S(r12, r13)
            if (r12 == 0) goto L348
            i0.a1 r12 = r11.f19856h
            java.lang.Object r13 = r12.getValue()
            r2 = r13
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r13 = r5.P()
            i0.e r0 = i0.l.f5952a
            if (r13 != r0) goto L338
            wb.bi r13 = new wb.bi
            r0 = 19
            r13.<init>(r12, r0)
            r5.k0(r13)
        L338:
            r4 = r13
            fg.l r4 = (fg.l) r4
            r6 = 24630(0x6036, float:3.4514E-41)
            r7 = 8
            java.lang.String r0 = "关键词"
            java.lang.String r1 = "按标签名筛选"
            r3 = 0
            wb.ho.C1(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L34b
        L348:
            r5.V()
        L34b:
            sf.n r12 = sf.n.f12433a
            return r12
        L34e:
            r3 = r12
            i0.h0 r3 = (i0.h0) r3
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r12 = r13.intValue()
            r13 = r12 & 3
            r0 = 2
            r1 = 1
            if (r13 == r0) goto L35f
            r13 = r1
            goto L360
        L35f:
            r13 = 0
        L360:
            r12 = r12 & r1
            boolean r12 = r3.S(r12, r13)
            if (r12 == 0) goto L38d
            i0.a1 r12 = r11.f19856h
            java.lang.Object r13 = r12.getValue()
            r0 = r13
            wb.i2 r0 = (wb.i2) r0
            java.lang.Object r13 = r3.P()
            i0.e r1 = i0.l.f5952a
            if (r13 != r1) goto L382
            wb.oh r13 = new wb.oh
            r1 = 28
            r13.<init>(r12, r1)
            r3.k0(r13)
        L382:
            r1 = r13
            fg.l r1 = (fg.l) r1
            r4 = 432(0x1b0, float:6.05E-43)
            r5 = 0
            r2 = 0
            wb.ho.e0(r0, r1, r2, r3, r4, r5)
            goto L390
        L38d:
            r3.V()
        L390:
            sf.n r12 = sf.n.f12433a
            return r12
        L393:
            i0.h0 r12 = (i0.h0) r12
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r0 = r13 & 3
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L3a4
            r0 = r3
            goto L3a5
        L3a4:
            r0 = r2
        L3a5:
            r13 = r13 & r3
            boolean r13 = r12.S(r13, r0)
            if (r13 == 0) goto L3b8
            i0.a1 r13 = r11.f19856h
            java.lang.Object r13 = r13.getValue()
            java.lang.String r13 = (java.lang.String) r13
            wb.ho.s0(r13, r12, r2)
            goto L3bb
        L3b8:
            r12.V()
        L3bb:
            sf.n r12 = sf.n.f12433a
            return r12
        L3be:
            r5 = r12
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r12 = r13.intValue()
            r13 = r12 & 3
            r0 = 2
            r1 = 1
            if (r13 == r0) goto L3cf
            r13 = r1
            goto L3d0
        L3cf:
            r13 = 0
        L3d0:
            r12 = r12 & r1
            boolean r12 = r5.S(r12, r13)
            if (r12 == 0) goto L402
            i0.a1 r12 = r11.f19856h
            java.lang.Object r13 = r12.getValue()
            r2 = r13
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r13 = r5.P()
            i0.e r0 = i0.l.f5952a
            if (r13 != r0) goto L3f2
            wb.oh r13 = new wb.oh
            r0 = 26
            r13.<init>(r12, r0)
            r5.k0(r13)
        L3f2:
            r4 = r13
            fg.l r4 = (fg.l) r4
            r6 = 24630(0x6036, float:3.4514E-41)
            r7 = 8
            java.lang.String r0 = "搜索名单"
            java.lang.String r1 = "昵称 / wxid / 群号 / 模板名"
            r3 = 0
            wb.ho.C1(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L405
        L402:
            r5.V()
        L405:
            sf.n r12 = sf.n.f12433a
            return r12
        L408:
            r5 = r12
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r12 = r13.intValue()
            r13 = r12 & 3
            r0 = 2
            r1 = 1
            if (r13 == r0) goto L419
            r13 = r1
            goto L41a
        L419:
            r13 = 0
        L41a:
            r12 = r12 & r1
            boolean r12 = r5.S(r12, r13)
            if (r12 == 0) goto L44c
            i0.a1 r12 = r11.f19856h
            java.lang.Object r13 = r12.getValue()
            r2 = r13
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r13 = r5.P()
            i0.e r0 = i0.l.f5952a
            if (r13 != r0) goto L43c
            wb.oh r13 = new wb.oh
            r0 = 9
            r13.<init>(r12, r0)
            r5.k0(r13)
        L43c:
            r4 = r13
            fg.l r4 = (fg.l) r4
            r6 = 24630(0x6036, float:3.4514E-41)
            r7 = 8
            java.lang.String r0 = "搜索聊天"
            java.lang.String r1 = "昵称 / wxid / 群号 / 模板名"
            r3 = 0
            wb.ho.C1(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L44f
        L44c:
            r5.V()
        L44f:
            sf.n r12 = sf.n.f12433a
            return r12
        L452:
            r3 = r12
            i0.h0 r3 = (i0.h0) r3
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r12 = r13.intValue()
            r13 = r12 & 3
            r0 = 2
            r1 = 1
            if (r13 == r0) goto L463
            r13 = r1
            goto L464
        L463:
            r13 = 0
        L464:
            r12 = r12 & r1
            boolean r12 = r3.S(r12, r13)
            if (r12 == 0) goto L490
            i0.a1 r12 = r11.f19856h
            java.lang.Object r13 = r12.getValue()
            r0 = r13
            wb.i2 r0 = (wb.i2) r0
            java.lang.Object r13 = r3.P()
            i0.e r1 = i0.l.f5952a
            if (r13 != r1) goto L485
            wb.tg r13 = new wb.tg
            r1 = 3
            r13.<init>(r12, r1)
            r3.k0(r13)
        L485:
            r1 = r13
            fg.l r1 = (fg.l) r1
            r4 = 48
            r5 = 4
            r2 = 0
            wb.ho.e0(r0, r1, r2, r3, r4, r5)
            goto L493
        L490:
            r3.V()
        L493:
            sf.n r12 = sf.n.f12433a
            return r12
        L496:
            i0.h0 r12 = (i0.h0) r12
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r0 = r13 & 3
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L4a7
            r0 = r3
            goto L4a8
        L4a7:
            r0 = r2
        L4a8:
            r13 = r13 & r3
            boolean r13 = r12.S(r13, r0)
            if (r13 == 0) goto L4c6
            i0.a1 r13 = r11.f19856h
            java.lang.Object r13 = r13.getValue()
            java.lang.String r13 = (java.lang.String) r13
            boolean r13 = og.m.t0(r13)
            if (r13 == 0) goto L4c0
            java.lang.String r13 = "没有可选收藏"
            goto L4c2
        L4c0:
            java.lang.String r13 = "没有匹配收藏"
        L4c2:
            wb.ho.s0(r13, r12, r2)
            goto L4c9
        L4c6:
            r12.V()
        L4c9:
            sf.n r12 = sf.n.f12433a
            return r12
        L4cc:
            r6 = r12
            i0.h0 r6 = (i0.h0) r6
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r12 = r13.intValue()
            r13 = r12 & 3
            r0 = 2
            r1 = 1
            if (r13 == r0) goto L4dd
            r13 = r1
            goto L4de
        L4dd:
            r13 = 0
        L4de:
            r12 = r12 & r1
            boolean r12 = r6.S(r12, r13)
            if (r12 == 0) goto L516
            i0.a1 r12 = r11.f19856h
            java.lang.Object r13 = r12.getValue()
            r2 = r13
            java.lang.String r2 = (java.lang.String) r2
            java.util.List r3 = wb.ho.f16647o
            boolean r13 = r6.f(r12)
            java.lang.Object r0 = r6.P()
            if (r13 != 0) goto L4fe
            i0.e r13 = i0.l.f5952a
            if (r0 != r13) goto L507
        L4fe:
            wb.tg r0 = new wb.tg
            r13 = 4
            r0.<init>(r12, r13)
            r6.k0(r0)
        L507:
            r5 = r0
            fg.l r5 = (fg.l) r5
            r7 = 24630(0x6036, float:3.4514E-41)
            r8 = 0
            java.lang.String r0 = "改名提醒文本"
            java.lang.String r1 = "本群专属；多个模板用 || 分隔随机选择"
            r4 = 3
            wb.ho.i4(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            goto L519
        L516:
            r6.V()
        L519:
            sf.n r12 = sf.n.f12433a
            return r12
        L51c:
            i0.h0 r12 = (i0.h0) r12
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r0 = r13 & 3
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L52d
            r0 = r3
            goto L52e
        L52d:
            r0 = r2
        L52e:
            r13 = r13 & r3
            boolean r13 = r12.S(r13, r0)
            if (r13 == 0) goto L541
            i0.a1 r13 = r11.f19856h
            java.lang.Object r13 = r13.getValue()
            java.lang.String r13 = (java.lang.String) r13
            wb.ho.s0(r13, r12, r2)
            goto L544
        L541:
            r12.V()
        L544:
            sf.n r12 = sf.n.f12433a
            return r12
        L547:
            r5 = r12
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r12 = r13.intValue()
            r13 = r12 & 3
            r0 = 2
            r8 = 0
            r9 = 1
            if (r13 == r0) goto L559
            r13 = r9
            goto L55a
        L559:
            r13 = r8
        L55a:
            r12 = r12 & r9
            boolean r12 = r5.S(r12, r13)
            if (r12 == 0) goto L5c4
            i0.a1 r12 = r11.f19856h
            java.lang.Object r13 = r12.getValue()
            ua.i r13 = (ua.i) r13
            java.lang.String r2 = r13.f13624b
            boolean r13 = r5.f(r12)
            java.lang.Object r0 = r5.P()
            i0.e r10 = i0.l.f5952a
            if (r13 != 0) goto L579
            if (r0 != r10) goto L583
        L579:
            wb.gi r0 = new wb.gi
            r13 = 12
            r0.<init>(r12, r13)
            r5.k0(r0)
        L583:
            r4 = r0
            fg.l r4 = (fg.l) r4
            r6 = 54
            r7 = 8
            java.lang.String r0 = "模板名称"
            java.lang.String r1 = "用于默认规则和聊天绑定"
            r3 = 0
            wb.ho.C1(r0, r1, r2, r3, r4, r5, r6, r7)
            r13 = 0
            wb.ho.D1(r13, r5, r8, r9)
            java.lang.Object r13 = r12.getValue()
            ua.i r13 = (ua.i) r13
            boolean r0 = r13.f13625c
            boolean r13 = r5.f(r12)
            java.lang.Object r1 = r5.P()
            if (r13 != 0) goto L5aa
            if (r1 != r10) goto L5b4
        L5aa:
            wb.gi r1 = new wb.gi
            r13 = 13
            r1.<init>(r12, r13)
            r5.k0(r1)
        L5b4:
            r4 = r1
            fg.l r4 = (fg.l) r4
            r6 = 432(0x1b0, float:6.05E-43)
            r7 = 8
            java.lang.String r1 = "启用模板"
            java.lang.String r2 = "关闭后使用该模板的聊天不会自动收款"
            r3 = 0
            wb.ho.P3(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L5c7
        L5c4:
            r5.V()
        L5c7:
            sf.n r12 = sf.n.f12433a
            return r12
        L5ca:
            r5 = r12
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r12 = r13.intValue()
            r13 = r12 & 3
            r0 = 2
            r1 = 1
            if (r13 == r0) goto L5db
            r13 = r1
            goto L5dc
        L5db:
            r13 = 0
        L5dc:
            r12 = r12 & r1
            boolean r12 = r5.S(r12, r13)
            if (r12 == 0) goto L60e
            i0.a1 r12 = r11.f19856h
            java.lang.Object r13 = r12.getValue()
            r2 = r13
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r13 = r5.P()
            i0.e r0 = i0.l.f5952a
            if (r13 != r0) goto L5fe
            wb.ih r13 = new wb.ih
            r0 = 22
            r13.<init>(r12, r0)
            r5.k0(r13)
        L5fe:
            r4 = r13
            fg.l r4 = (fg.l) r4
            r6 = 24630(0x6036, float:3.4514E-41)
            r7 = 8
            java.lang.String r0 = "搜索聊天"
            java.lang.String r1 = "昵称 / ID / 模板名"
            r3 = 0
            wb.ho.C1(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L611
        L60e:
            r5.V()
        L611:
            sf.n r12 = sf.n.f12433a
            return r12
        L614:
            r5 = r12
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r12 = r13.intValue()
            r13 = r12 & 3
            r0 = 2
            r1 = 1
            if (r13 == r0) goto L625
            r13 = r1
            goto L626
        L625:
            r13 = 0
        L626:
            r12 = r12 & r1
            boolean r12 = r5.S(r12, r13)
            if (r12 == 0) goto L657
            i0.a1 r12 = r11.f19856h
            java.lang.Object r13 = r12.getValue()
            r2 = r13
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r13 = r5.P()
            i0.e r0 = i0.l.f5952a
            if (r13 != r0) goto L647
            wb.fg r13 = new wb.fg
            r0 = 4
            r13.<init>(r12, r0)
            r5.k0(r13)
        L647:
            r4 = r13
            fg.l r4 = (fg.l) r4
            r6 = 24630(0x6036, float:3.4514E-41)
            r7 = 8
            java.lang.String r0 = "时间变量格式"
            java.lang.String r1 = "用于 {time}，例如 yyyy-MM-dd HH:mm:ss"
            r3 = 0
            wb.ho.C1(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L65a
        L657:
            r5.V()
        L65a:
            sf.n r12 = sf.n.f12433a
            return r12
        L65d:
            r5 = r12
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r12 = r13.intValue()
            r13 = r12 & 3
            r0 = 2
            r1 = 1
            if (r13 == r0) goto L66e
            r13 = r1
            goto L66f
        L66e:
            r13 = 0
        L66f:
            r12 = r12 & r1
            boolean r12 = r5.S(r12, r13)
            if (r12 == 0) goto L6a1
            i0.a1 r12 = r11.f19856h
            java.lang.Object r13 = r12.getValue()
            r2 = r13
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r13 = r5.P()
            i0.e r0 = i0.l.f5952a
            if (r13 != r0) goto L691
            wb.zd r13 = new wb.zd
            r0 = 27
            r13.<init>(r12, r0)
            r5.k0(r13)
        L691:
            r4 = r13
            fg.l r4 = (fg.l) r4
            r6 = 24630(0x6036, float:3.4514E-41)
            r7 = 8
            java.lang.String r0 = "时间变量格式"
            java.lang.String r1 = "用于 {time}，例如 yyyy-MM-dd HH:mm:ss"
            r3 = 0
            wb.ho.C1(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L6a4
        L6a1:
            r5.V()
        L6a4:
            sf.n r12 = sf.n.f12433a
            return r12
        L6a7:
            r6 = r12
            i0.h0 r6 = (i0.h0) r6
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r12 = r13.intValue()
            r13 = r12 & 3
            r0 = 2
            r1 = 1
            if (r13 == r0) goto L6b8
            r13 = r1
            goto L6b9
        L6b8:
            r13 = 0
        L6b9:
            r12 = r12 & r1
            boolean r12 = r6.S(r12, r13)
            if (r12 == 0) goto L6ed
            i0.a1 r12 = r11.f19856h
            java.lang.Object r13 = r12.getValue()
            r2 = r13
            java.lang.String r2 = (java.lang.String) r2
            java.util.List r3 = wb.ho.f16647o
            java.lang.Object r13 = r6.P()
            i0.e r0 = i0.l.f5952a
            if (r13 != r0) goto L6dd
            wb.mf r13 = new wb.mf
            r0 = 25
            r13.<init>(r12, r0)
            r6.k0(r13)
        L6dd:
            r5 = r13
            fg.l r5 = (fg.l) r5
            r7 = 221238(0x36036, float:3.1002E-40)
            r8 = 0
            java.lang.String r0 = "改名提醒文本"
            java.lang.String r1 = "多个模板用 || 分隔随机选择"
            r4 = 3
            wb.ho.i4(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            goto L6f0
        L6ed:
            r6.V()
        L6f0:
            sf.n r12 = sf.n.f12433a
            return r12
        L6f3:
            r5 = r12
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r12 = r13.intValue()
            r13 = r12 & 3
            r0 = 2
            r1 = 1
            if (r13 == r0) goto L704
            r13 = r1
            goto L705
        L704:
            r13 = 0
        L705:
            r12 = r12 & r1
            boolean r12 = r5.S(r12, r13)
            if (r12 == 0) goto L739
            i0.a1 r12 = r11.f19856h
            java.lang.Object r13 = r12.getValue()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r0 = r13.booleanValue()
            java.lang.Object r13 = r5.P()
            i0.e r1 = i0.l.f5952a
            if (r13 != r1) goto L729
            wb.zd r13 = new wb.zd
            r1 = 1
            r13.<init>(r12, r1)
            r5.k0(r13)
        L729:
            r4 = r13
            fg.l r4 = (fg.l) r4
            r6 = 25008(0x61b0, float:3.5044E-41)
            r7 = 8
            java.lang.String r1 = "朋友圈底部详情"
            java.lang.String r2 = "在朋友圈底部显示自定义时间和详情"
            r3 = 0
            wb.ho.P3(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L73c
        L739:
            r5.V()
        L73c:
            sf.n r12 = sf.n.f12433a
            return r12
        L73f:
            r5 = r12
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r12 = r13.intValue()
            r13 = r12 & 3
            r0 = 2
            r1 = 1
            if (r13 == r0) goto L750
            r13 = r1
            goto L751
        L750:
            r13 = 0
        L751:
            r12 = r12 & r1
            boolean r12 = r5.S(r12, r13)
            if (r12 == 0) goto L783
            i0.a1 r12 = r11.f19856h
            java.lang.Object r13 = r12.getValue()
            r2 = r13
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r13 = r5.P()
            i0.e r0 = i0.l.f5952a
            if (r13 != r0) goto L773
            b0.l r13 = new b0.l
            r0 = 18
            r13.<init>(r12, r0)
            r5.k0(r13)
        L773:
            r4 = r13
            fg.l r4 = (fg.l) r4
            r6 = 24630(0x6036, float:3.4514E-41)
            r7 = 8
            java.lang.String r0 = "搜索"
            java.lang.String r1 = "分组名称 / 所属路径"
            r3 = 0
            wb.ho.C1(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L786
        L783:
            r5.V()
        L786:
            sf.n r12 = sf.n.f12433a
            return r12
        L789:
            i0.h0 r12 = (i0.h0) r12
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r0 = r13 & 3
            r1 = 2
            r2 = 1
            if (r0 == r1) goto L799
            r0 = r2
            goto L79a
        L799:
            r0 = 0
        L79a:
            r13 = r13 & r2
            boolean r13 = r12.S(r13, r0)
            if (r13 == 0) goto L7c7
            i0.a1 r13 = r11.f19856h
            boolean r0 = r12.f(r13)
            java.lang.Object r1 = r12.P()
            if (r0 != 0) goto L7b1
            i0.e r0 = i0.l.f5952a
            if (r1 != r0) goto L7bb
        L7b1:
            b0.j r1 = new b0.j
            r0 = 18
            r1.<init>(r13, r0)
            r12.k0(r1)
        L7bb:
            fg.a r1 = (fg.a) r1
            r13 = 54
            java.lang.String r0 = "删除分组"
            java.lang.String r2 = "子分组移到上一级，直属会话移到上级分组或微信首页"
            wb.ho.b(r0, r2, r1, r12, r13)
            goto L7ca
        L7c7:
            r12.V()
        L7ca:
            sf.n r12 = sf.n.f12433a
            return r12
        L7cd:
            i0.h0 r12 = (i0.h0) r12
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            r0 = r13 & 3
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L7de
            r0 = r3
            goto L7df
        L7de:
            r0 = r2
        L7df:
            r13 = r13 & r3
            boolean r13 = r12.S(r13, r0)
            if (r13 == 0) goto L7f2
            i0.a1 r13 = r11.f19856h
            java.lang.Object r13 = r13.getValue()
            java.lang.String r13 = (java.lang.String) r13
            wb.ho.s0(r13, r12, r2)
            goto L7f5
        L7f2:
            r12.V()
        L7f5:
            sf.n r12 = sf.n.f12433a
            return r12
        L7f8:
            r5 = r12
            i0.h0 r5 = (i0.h0) r5
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r12 = r13.intValue()
            r13 = r12 & 3
            r0 = 2
            r1 = 1
            if (r13 == r0) goto L809
            r13 = r1
            goto L80a
        L809:
            r13 = 0
        L80a:
            r12 = r12 & r1
            boolean r12 = r5.S(r12, r13)
            if (r12 == 0) goto L842
            i0.a1 r12 = r11.f19856h
            java.lang.Object r13 = r12.getValue()
            r2 = r13
            java.lang.String r2 = (java.lang.String) r2
            boolean r13 = r5.f(r12)
            java.lang.Object r0 = r5.P()
            if (r13 != 0) goto L828
            i0.e r13 = i0.l.f5952a
            if (r0 != r13) goto L832
        L828:
            b0.l r0 = new b0.l
            r13 = 17
            r0.<init>(r12, r13)
            r5.k0(r0)
        L832:
            r4 = r0
            fg.l r4 = (fg.l) r4
            r6 = 54
            r7 = 8
            java.lang.String r0 = "搜索"
            java.lang.String r1 = "会话名称 / 备注 / wxid"
            r3 = 0
            wb.ho.C1(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L845
        L842:
            r5.V()
        L845:
            sf.n r12 = sf.n.f12433a
            return r12
    }
}
