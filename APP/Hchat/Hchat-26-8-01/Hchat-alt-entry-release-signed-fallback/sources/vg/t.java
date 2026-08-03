package vg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f14360g;

    public /* synthetic */ t(int r1) {
            r0 = this;
            r0.f14360g = r1
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r26, java.lang.Object r27) {
            r25 = this;
            r0 = r25
            int r1 = r0.f14360g
            switch(r1) {
                case 0: goto L4e7;
                case 1: goto L4c2;
                case 2: goto L494;
                case 3: goto L46b;
                case 4: goto L442;
                case 5: goto L419;
                case 6: goto L3f0;
                case 7: goto L3c7;
                case 8: goto L35e;
                case 9: goto L335;
                case 10: goto L30c;
                case 11: goto L2e3;
                case 12: goto L2ba;
                case 13: goto L291;
                case 14: goto L268;
                case 15: goto L23f;
                case 16: goto L216;
                case 17: goto L1ed;
                case 18: goto L1c4;
                case 19: goto L19b;
                case 20: goto L172;
                case 21: goto L149;
                case 22: goto L120;
                case 23: goto Lf7;
                case 24: goto Ld4;
                case 25: goto Lab;
                case 26: goto L82;
                case 27: goto L59;
                case 28: goto L30;
                default: goto L7;
            }
        L7:
            r1 = r26
            i0.h0 r1 = (i0.h0) r1
            r2 = r27
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            r4 = 2
            r5 = 1
            if (r3 == r4) goto L1b
            r3 = r5
            goto L1c
        L1b:
            r3 = 0
        L1c:
            r2 = r2 & r5
            boolean r2 = r1.S(r2, r3)
            if (r2 == 0) goto L2a
            java.lang.String r2 = "暂无规则"
            r3 = 6
            wb.ho.s0(r2, r1, r3)
            goto L2d
        L2a:
            r1.V()
        L2d:
            sf.n r1 = sf.n.f12433a
            return r1
        L30:
            r1 = r26
            i0.h0 r1 = (i0.h0) r1
            r2 = r27
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            r4 = 2
            r5 = 1
            if (r3 == r4) goto L44
            r3 = r5
            goto L45
        L44:
            r3 = 0
        L45:
            r2 = r2 & r5
            boolean r2 = r1.S(r2, r3)
            if (r2 == 0) goto L53
            java.lang.String r2 = "暂无规则"
            r3 = 6
            wb.ho.s0(r2, r1, r3)
            goto L56
        L53:
            r1.V()
        L56:
            sf.n r1 = sf.n.f12433a
            return r1
        L59:
            r1 = r26
            i0.h0 r1 = (i0.h0) r1
            r2 = r27
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            r4 = 2
            r5 = 1
            if (r3 == r4) goto L6d
            r3 = r5
            goto L6e
        L6d:
            r3 = 0
        L6e:
            r2 = r2 & r5
            boolean r2 = r1.S(r2, r3)
            if (r2 == 0) goto L7c
            java.lang.String r2 = "只会修改已勾选“应用”的项目，未勾选的设置保持原样。群聊专属的 @ 规则只影响群聊规则。"
            r3 = 6
            wb.ho.s0(r2, r1, r3)
            goto L7f
        L7c:
            r1.V()
        L7f:
            sf.n r1 = sf.n.f12433a
            return r1
        L82:
            r1 = r26
            i0.h0 r1 = (i0.h0) r1
            r2 = r27
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            r4 = 2
            r5 = 1
            if (r3 == r4) goto L96
            r3 = r5
            goto L97
        L96:
            r3 = 0
        L97:
            r2 = r2 & r5
            boolean r2 = r1.S(r2, r3)
            if (r2 == 0) goto La5
            java.lang.String r2 = "没有匹配结果"
            r3 = 6
            wb.ho.s0(r2, r1, r3)
            goto La8
        La5:
            r1.V()
        La8:
            sf.n r1 = sf.n.f12433a
            return r1
        Lab:
            r1 = r26
            i0.h0 r1 = (i0.h0) r1
            r2 = r27
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            r4 = 2
            r5 = 1
            if (r3 == r4) goto Lbf
            r3 = r5
            goto Lc0
        Lbf:
            r3 = 0
        Lc0:
            r2 = r2 & r5
            boolean r2 = r1.S(r2, r3)
            if (r2 == 0) goto Lce
            java.lang.String r2 = "暂无回复步骤。添加后会按列表顺序依次发送。"
            r3 = 6
            wb.ho.s0(r2, r1, r3)
            goto Ld1
        Lce:
            r1.V()
        Ld1:
            sf.n r1 = sf.n.f12433a
            return r1
        Ld4:
            r1 = r26
            i0.h0 r1 = (i0.h0) r1
            r2 = r27
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            r4 = 2
            r5 = 1
            if (r3 == r4) goto Le8
            r3 = r5
            goto Le9
        Le8:
            r3 = 0
        Le9:
            r2 = r2 & r5
            boolean r2 = r1.S(r2, r3)
            if (r2 == 0) goto Lf1
            goto Lf4
        Lf1:
            r1.V()
        Lf4:
            sf.n r1 = sf.n.f12433a
            return r1
        Lf7:
            r1 = r26
            i0.h0 r1 = (i0.h0) r1
            r2 = r27
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            r4 = 2
            r5 = 1
            if (r3 == r4) goto L10b
            r3 = r5
            goto L10c
        L10b:
            r3 = 0
        L10c:
            r2 = r2 & r5
            boolean r2 = r1.S(r2, r3)
            if (r2 == 0) goto L11a
            java.lang.String r2 = "这个模块暂时没有可配置项"
            r3 = 6
            wb.ho.s0(r2, r1, r3)
            goto L11d
        L11a:
            r1.V()
        L11d:
            sf.n r1 = sf.n.f12433a
            return r1
        L120:
            r1 = r26
            i0.h0 r1 = (i0.h0) r1
            r2 = r27
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            r4 = 2
            r5 = 1
            if (r3 == r4) goto L134
            r3 = r5
            goto L135
        L134:
            r3 = 0
        L135:
            r2 = r2 & r5
            boolean r2 = r1.S(r2, r3)
            if (r2 == 0) goto L143
            java.lang.String r2 = "没有匹配结果"
            r3 = 6
            wb.ho.s0(r2, r1, r3)
            goto L146
        L143:
            r1.V()
        L146:
            sf.n r1 = sf.n.f12433a
            return r1
        L149:
            r1 = r26
            i0.h0 r1 = (i0.h0) r1
            r2 = r27
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            r4 = 2
            r5 = 1
            if (r3 == r4) goto L15d
            r3 = r5
            goto L15e
        L15d:
            r3 = 0
        L15e:
            r2 = r2 & r5
            boolean r2 = r1.S(r2, r3)
            if (r2 == 0) goto L16c
            java.lang.String r2 = "暂无会话规则，点击底部“添加会话”。"
            r3 = 6
            wb.ho.s0(r2, r1, r3)
            goto L16f
        L16c:
            r1.V()
        L16f:
            sf.n r1 = sf.n.f12433a
            return r1
        L172:
            r1 = r26
            i0.h0 r1 = (i0.h0) r1
            r2 = r27
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            r4 = 2
            r5 = 1
            if (r3 == r4) goto L186
            r3 = r5
            goto L187
        L186:
            r3 = 0
        L187:
            r2 = r2 & r5
            boolean r2 = r1.S(r2, r3)
            if (r2 == 0) goto L195
            java.lang.String r2 = "正在载入群成员..."
            r3 = 6
            wb.ho.s0(r2, r1, r3)
            goto L198
        L195:
            r1.V()
        L198:
            sf.n r1 = sf.n.f12433a
            return r1
        L19b:
            r1 = r26
            i0.h0 r1 = (i0.h0) r1
            r2 = r27
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            r4 = 2
            r5 = 1
            if (r3 == r4) goto L1af
            r3 = r5
            goto L1b0
        L1af:
            r3 = 0
        L1b0:
            r2 = r2 & r5
            boolean r2 = r1.S(r2, r3)
            if (r2 == 0) goto L1be
            java.lang.String r2 = "正在载入群聊..."
            r3 = 6
            wb.ho.s0(r2, r1, r3)
            goto L1c1
        L1be:
            r1.V()
        L1c1:
            sf.n r1 = sf.n.f12433a
            return r1
        L1c4:
            r1 = r26
            i0.h0 r1 = (i0.h0) r1
            r2 = r27
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            r4 = 2
            r5 = 1
            if (r3 == r4) goto L1d8
            r3 = r5
            goto L1d9
        L1d8:
            r3 = 0
        L1d9:
            r2 = r2 & r5
            boolean r2 = r1.S(r2, r3)
            if (r2 == 0) goto L1e7
            java.lang.String r2 = "正在后台加载更多收藏..."
            r3 = 6
            wb.ho.s0(r2, r1, r3)
            goto L1ea
        L1e7:
            r1.V()
        L1ea:
            sf.n r1 = sf.n.f12433a
            return r1
        L1ed:
            r1 = r26
            i0.h0 r1 = (i0.h0) r1
            r2 = r27
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            r4 = 2
            r5 = 1
            if (r3 == r4) goto L201
            r3 = r5
            goto L202
        L201:
            r3 = 0
        L202:
            r2 = r2 & r5
            boolean r2 = r1.S(r2, r3)
            if (r2 == 0) goto L210
            java.lang.String r2 = "正在后台查找收藏..."
            r3 = 6
            wb.ho.s0(r2, r1, r3)
            goto L213
        L210:
            r1.V()
        L213:
            sf.n r1 = sf.n.f12433a
            return r1
        L216:
            r1 = r26
            i0.h0 r1 = (i0.h0) r1
            r2 = r27
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            r4 = 2
            r5 = 1
            if (r3 == r4) goto L22a
            r3 = r5
            goto L22b
        L22a:
            r3 = 0
        L22b:
            r2 = r2 & r5
            boolean r2 = r1.S(r2, r3)
            if (r2 == 0) goto L239
            java.lang.String r2 = "正在载入收藏..."
            r3 = 6
            wb.ho.s0(r2, r1, r3)
            goto L23c
        L239:
            r1.V()
        L23c:
            sf.n r1 = sf.n.f12433a
            return r1
        L23f:
            r1 = r26
            i0.h0 r1 = (i0.h0) r1
            r2 = r27
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            r4 = 2
            r5 = 1
            if (r3 == r4) goto L253
            r3 = r5
            goto L254
        L253:
            r3 = 0
        L254:
            r2 = r2 & r5
            boolean r2 = r1.S(r2, r3)
            if (r2 == 0) goto L262
            java.lang.String r2 = "没有匹配结果"
            r3 = 6
            wb.ho.s0(r2, r1, r3)
            goto L265
        L262:
            r1.V()
        L265:
            sf.n r1 = sf.n.f12433a
            return r1
        L268:
            r1 = r26
            i0.h0 r1 = (i0.h0) r1
            r2 = r27
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            r4 = 2
            r5 = 1
            if (r3 == r4) goto L27c
            r3 = r5
            goto L27d
        L27c:
            r3 = 0
        L27d:
            r2 = r2 & r5
            boolean r2 = r1.S(r2, r3)
            if (r2 == 0) goto L28b
            java.lang.String r2 = "正在载入列表..."
            r3 = 6
            wb.ho.s0(r2, r1, r3)
            goto L28e
        L28b:
            r1.V()
        L28e:
            sf.n r1 = sf.n.f12433a
            return r1
        L291:
            r1 = r26
            i0.h0 r1 = (i0.h0) r1
            r2 = r27
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            r4 = 2
            r5 = 1
            if (r3 == r4) goto L2a5
            r3 = r5
            goto L2a6
        L2a5:
            r3 = 0
        L2a6:
            r2 = r2 & r5
            boolean r2 = r1.S(r2, r3)
            if (r2 == 0) goto L2b4
            java.lang.String r2 = "没有匹配结果"
            r3 = 6
            wb.ho.s0(r2, r1, r3)
            goto L2b7
        L2b4:
            r1.V()
        L2b7:
            sf.n r1 = sf.n.f12433a
            return r1
        L2ba:
            r1 = r26
            i0.h0 r1 = (i0.h0) r1
            r2 = r27
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            r4 = 2
            r5 = 1
            if (r3 == r4) goto L2ce
            r3 = r5
            goto L2cf
        L2ce:
            r3 = 0
        L2cf:
            r2 = r2 & r5
            boolean r2 = r1.S(r2, r3)
            if (r2 == 0) goto L2dd
            java.lang.String r2 = "没有匹配标签"
            r3 = 6
            wb.ho.s0(r2, r1, r3)
            goto L2e0
        L2dd:
            r1.V()
        L2e0:
            sf.n r1 = sf.n.f12433a
            return r1
        L2e3:
            r1 = r26
            i0.h0 r1 = (i0.h0) r1
            r2 = r27
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            r4 = 2
            r5 = 1
            if (r3 == r4) goto L2f7
            r3 = r5
            goto L2f8
        L2f7:
            r3 = 0
        L2f8:
            r2 = r2 & r5
            boolean r2 = r1.S(r2, r3)
            if (r2 == 0) goto L306
            java.lang.String r2 = "正在载入列表..."
            r3 = 6
            wb.ho.s0(r2, r1, r3)
            goto L309
        L306:
            r1.V()
        L309:
            sf.n r1 = sf.n.f12433a
            return r1
        L30c:
            r1 = r26
            i0.h0 r1 = (i0.h0) r1
            r2 = r27
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            r4 = 2
            r5 = 1
            if (r3 == r4) goto L320
            r3 = r5
            goto L321
        L320:
            r3 = 0
        L321:
            r2 = r2 & r5
            boolean r2 = r1.S(r2, r3)
            if (r2 == 0) goto L32f
            java.lang.String r2 = "暂无模型列表，先点击“拉取模型列表”。"
            r3 = 6
            wb.ho.s0(r2, r1, r3)
            goto L332
        L32f:
            r1.V()
        L332:
            sf.n r1 = sf.n.f12433a
            return r1
        L335:
            r1 = r26
            i0.h0 r1 = (i0.h0) r1
            r2 = r27
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            r4 = 2
            r5 = 1
            if (r3 == r4) goto L349
            r3 = r5
            goto L34a
        L349:
            r3 = 0
        L34a:
            r2 = r2 & r5
            boolean r2 = r1.S(r2, r3)
            if (r2 == 0) goto L358
            java.lang.String r2 = "正在加载在线插件..."
            r3 = 6
            wb.ho.s0(r2, r1, r3)
            goto L35b
        L358:
            r1.V()
        L35b:
            sf.n r1 = sf.n.f12433a
            return r1
        L35e:
            r1 = r26
            i0.h0 r1 = (i0.h0) r1
            r2 = r27
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            r4 = 2
            r5 = 1
            if (r3 == r4) goto L372
            r3 = r5
            goto L373
        L372:
            r3 = 0
        L373:
            r2 = r2 & r5
            boolean r2 = r1.S(r2, r3)
            if (r2 == 0) goto L3bf
            i0.m2 r2 = bi.d.f892a
            java.lang.Object r2 = r1.j(r2)
            bi.b r2 = (bi.b) r2
            long r4 = r2.h()
            r2 = 13
            long r6 = x6.d.D(r2)
            y0.l r2 = y0.l.f21818a
            r3 = 1065353216(0x3f800000, float:1.0)
            y0.o r2 = p.h1.d(r2, r3)
            r3 = 16
            float r3 = (float) r3
            r8 = 14
            float r8 = (float) r8
            y0.o r3 = p.d.m(r2, r3, r8)
            r23 = 0
            r24 = 262120(0x3ffe8, float:3.67308E-40)
            java.lang.String r2 = "社区插件由用户上传，安装前请核对作者、说明和文件内容。下载后的插件默认禁用。"
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 24630(0x6036, float:3.4514E-41)
            r21 = r1
            sh.s.n(r2, r3, r4, r6, r8, r9, r10, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L3c4
        L3bf:
            r21 = r1
            r21.V()
        L3c4:
            sf.n r1 = sf.n.f12433a
            return r1
        L3c7:
            r1 = r26
            i0.h0 r1 = (i0.h0) r1
            r2 = r27
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            r4 = 2
            r5 = 1
            if (r3 == r4) goto L3db
            r3 = r5
            goto L3dc
        L3db:
            r3 = 0
        L3dc:
            r2 = r2 & r5
            boolean r2 = r1.S(r2, r3)
            if (r2 == 0) goto L3ea
            java.lang.String r2 = "还没有定时任务，点击底部“新增任务”。"
            r3 = 6
            wb.ho.s0(r2, r1, r3)
            goto L3ed
        L3ea:
            r1.V()
        L3ed:
            sf.n r1 = sf.n.f12433a
            return r1
        L3f0:
            r1 = r26
            i0.h0 r1 = (i0.h0) r1
            r2 = r27
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            r4 = 2
            r5 = 1
            if (r3 == r4) goto L404
            r3 = r5
            goto L405
        L404:
            r3 = 0
        L405:
            r2 = r2 & r5
            boolean r2 = r1.S(r2, r3)
            if (r2 == 0) goto L413
            java.lang.String r2 = "没有匹配结果"
            r3 = 6
            wb.ho.s0(r2, r1, r3)
            goto L416
        L413:
            r1.V()
        L416:
            sf.n r1 = sf.n.f12433a
            return r1
        L419:
            r1 = r26
            i0.h0 r1 = (i0.h0) r1
            r2 = r27
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            r4 = 2
            r5 = 1
            if (r3 == r4) goto L42d
            r3 = r5
            goto L42e
        L42d:
            r3 = 0
        L42e:
            r2 = r2 & r5
            boolean r2 = r1.S(r2, r3)
            if (r2 == 0) goto L43c
            java.lang.String r2 = "正在载入监听群..."
            r3 = 6
            wb.ho.s0(r2, r1, r3)
            goto L43f
        L43c:
            r1.V()
        L43f:
            sf.n r1 = sf.n.f12433a
            return r1
        L442:
            r1 = r26
            i0.h0 r1 = (i0.h0) r1
            r2 = r27
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            r4 = 2
            r5 = 1
            if (r3 == r4) goto L456
            r3 = r5
            goto L457
        L456:
            r3 = 0
        L457:
            r2 = r2 & r5
            boolean r2 = r1.S(r2, r3)
            if (r2 == 0) goto L465
            java.lang.String r2 = "没有匹配的会话"
            r3 = 6
            wb.ho.s0(r2, r1, r3)
            goto L468
        L465:
            r1.V()
        L468:
            sf.n r1 = sf.n.f12433a
            return r1
        L46b:
            r1 = r26
            i0.h0 r1 = (i0.h0) r1
            r2 = r27
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r2 & 3
            r4 = 2
            r5 = 1
            if (r3 == r4) goto L47f
            r3 = r5
            goto L480
        L47f:
            r3 = 0
        L480:
            r2 = r2 & r5
            boolean r2 = r1.S(r2, r3)
            if (r2 == 0) goto L48e
            java.lang.String r2 = "正在载入会话..."
            r3 = 6
            wb.ho.s0(r2, r1, r3)
            goto L491
        L48e:
            r1.V()
        L491:
            sf.n r1 = sf.n.f12433a
            return r1
        L494:
            r1 = r26
            v0.b r1 = (v0.b) r1
            r1 = r27
            w.j1 r1 = (w.j1) r1
            i0.f1 r2 = r1.f14510a
            float r2 = r2.g()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            i0.j1 r1 = r1.f14515f
            java.lang.Object r1 = r1.getValue()
            m.p1 r1 = (m.p1) r1
            m.p1 r3 = m.p1.f8324g
            if (r1 != r3) goto L4b4
            r1 = 1
            goto L4b5
        L4b4:
            r1 = 0
        L4b5:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1}
            java.util.List r1 = a.a.y0(r1)
            return r1
        L4c2:
            r1 = r26
            vg.v r1 = (vg.v) r1
            r2 = r27
            wf.e r2 = (wf.e) r2
            boolean r3 = r2 instanceof i0.o2
            if (r3 == 0) goto L4e6
            i0.o2 r2 = (i0.o2) r2
            wf.g r3 = r1.f14363a
            r3 = 0
            android.os.Trace.beginSection(r3)
            java.lang.Object[] r3 = r1.f14364b
            int r4 = r1.f14366d
            sf.n r5 = sf.n.f12433a
            r3[r4] = r5
            i0.o2[] r3 = r1.f14365c
            int r5 = r4 + 1
            r1.f14366d = r5
            r3[r4] = r2
        L4e6:
            return r1
        L4e7:
            r1 = r26
            i0.o2 r1 = (i0.o2) r1
            r1 = r27
            wf.e r1 = (wf.e) r1
            boolean r2 = r1 instanceof i0.o2
            if (r2 == 0) goto L4f6
            i0.o2 r1 = (i0.o2) r1
            goto L4f7
        L4f6:
            r1 = 0
        L4f7:
            return r1
    }
}
