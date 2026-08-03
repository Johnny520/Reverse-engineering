package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class se implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f19071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f19072h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fg.p f19073i;

    public /* synthetic */ se(java.util.List r1, fg.p r2, int r3) {
            r0 = this;
            r3 = 4
            r0.f19071g = r3
            r0.<init>()
            r0.f19072h = r1
            r0.f19073i = r2
            return
    }

    public /* synthetic */ se(java.util.List r1, fg.p r2, int r3, byte r4) {
            r0 = this;
            r0.f19071g = r3
            r0.f19072h = r1
            r0.f19073i = r2
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r12, java.lang.Object r13) {
            r11 = this;
            int r0 = r11.f19071g
            i0.h0 r12 = (i0.h0) r12
            java.lang.Integer r13 = (java.lang.Integer) r13
            switch(r0) {
                case 0: goto L218;
                case 1: goto L167;
                case 2: goto Lb6;
                case 3: goto L1b;
                default: goto L9;
            }
        L9:
            r13.getClass()
            r13 = 1
            int r13 = i0.r.C(r13)
            java.util.List r0 = r11.f19072h
            fg.p r1 = r11.f19073i
            wb.ho.J0(r0, r1, r12, r13)
            sf.n r12 = sf.n.f12433a
            return r12
        L1b:
            int r13 = r13.intValue()
            r0 = r13 & 3
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L28
            r0 = r2
            goto L29
        L28:
            r0 = r3
        L29:
            r13 = r13 & r2
            boolean r13 = r12.S(r13, r0)
            if (r13 == 0) goto Lb0
            java.util.List r13 = r11.f19072h
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L48
            r13 = -1701987459(0xffffffff9a8dbb7d, float:-5.8619137E-23)
            r12.a0(r13)
            java.lang.String r13 = "没有匹配功能"
            r0 = 6
            wb.ho.s0(r13, r12, r0)
            r12.p(r3)
            goto Lb3
        L48:
            r0 = -1701929148(0xffffffff9a8e9f44, float:-5.898713E-23)
            r12.a0(r0)
            java.util.Iterator r0 = r13.iterator()
            r1 = r3
        L53:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto Lac
            java.lang.Object r4 = r0.next()
            int r5 = r1 + 1
            if (r1 < 0) goto La7
            wb.d3 r4 = (wb.d3) r4
            fg.p r6 = r11.f19073i
            boolean r7 = r12.f(r6)
            boolean r8 = r12.h(r4)
            r7 = r7 | r8
            java.lang.Object r8 = r12.P()
            if (r7 != 0) goto L78
            i0.e r7 = i0.l.f5952a
            if (r8 != r7) goto L82
        L78:
            sh.v1 r8 = new sh.v1
            r7 = 10
            r8.<init>(r6, r7, r4)
            r12.k0(r8)
        L82:
            fg.a r8 = (fg.a) r8
            wb.ho.K0(r4, r8, r12, r3)
            int r4 = r13.size()
            int r4 = r4 - r2
            if (r1 >= r4) goto L9c
            r1 = -920588766(0xffffffffc920ee22, float:-659170.1)
            r12.a0(r1)
            r1 = 0
            wb.ho.D1(r1, r12, r3, r2)
            r12.p(r3)
            goto La5
        L9c:
            r1 = -920536872(0xffffffffc921b8d8, float:-662413.5)
            r12.a0(r1)
            r12.p(r3)
        La5:
            r1 = r5
            goto L53
        La7:
            a.a.Q0()
            r12 = 0
            throw r12
        Lac:
            r12.p(r3)
            goto Lb3
        Lb0:
            r12.V()
        Lb3:
            sf.n r12 = sf.n.f12433a
            return r12
        Lb6:
            int r13 = r13.intValue()
            r0 = r13 & 3
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto Lc3
            r0 = r2
            goto Lc4
        Lc3:
            r0 = r3
        Lc4:
            r13 = r13 & r2
            boolean r13 = r12.S(r13, r0)
            if (r13 == 0) goto L161
            java.util.List r13 = r11.f19072h
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto Le4
            r13 = 993951823(0x3b3e804f, float:0.0029068177)
            r12.a0(r13)
            java.lang.String r13 = "暂无模板。新增后可设为默认规则或分配给指定聊天。"
            r0 = 6
            wb.ho.s0(r13, r12, r0)
            r12.p(r3)
            goto L164
        Le4:
            r0 = 994052976(0x3b400b70, float:0.0029303692)
            r12.a0(r0)
            java.util.Iterator r0 = r13.iterator()
            r1 = r3
        Lef:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L15d
            java.lang.Object r4 = r0.next()
            int r5 = r1 + 1
            if (r1 < 0) goto L158
            ua.i r4 = (ua.i) r4
            java.lang.String r6 = r4.f13624b
            boolean r7 = og.m.t0(r6)
            if (r7 == 0) goto L10d
            java.lang.String r6 = "模板 "
            java.lang.String r6 = eh.a.l(r5, r6)
        L10d:
            java.lang.String r7 = wb.ho.w5(r4)
            fg.p r8 = r11.f19073i
            boolean r9 = r12.f(r8)
            boolean r10 = r12.d(r1)
            r9 = r9 | r10
            boolean r10 = r12.h(r4)
            r9 = r9 | r10
            java.lang.Object r10 = r12.P()
            if (r9 != 0) goto L12b
            i0.e r9 = i0.l.f5952a
            if (r10 != r9) goto L135
        L12b:
            hb.e0 r10 = new hb.e0
            r9 = 10
            r10.<init>(r8, r1, r4, r9)
            r12.k0(r10)
        L135:
            fg.a r10 = (fg.a) r10
            wb.ho.x3(r6, r7, r10, r12, r3)
            int r4 = r13.size()
            int r4 = r4 - r2
            if (r1 >= r4) goto L14f
            r1 = 1546756498(0x5c31a192, float:1.9999488E17)
            r12.a0(r1)
            r1 = 0
            wb.ho.D1(r1, r12, r3, r2)
        L14b:
            r12.p(r3)
            goto L156
        L14f:
            r1 = 704824638(0x2a02c53e, float:1.1614752E-13)
            r12.a0(r1)
            goto L14b
        L156:
            r1 = r5
            goto Lef
        L158:
            a.a.Q0()
            r12 = 0
            throw r12
        L15d:
            r12.p(r3)
            goto L164
        L161:
            r12.V()
        L164:
            sf.n r12 = sf.n.f12433a
            return r12
        L167:
            int r13 = r13.intValue()
            r0 = r13 & 3
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L174
            r0 = r2
            goto L175
        L174:
            r0 = r3
        L175:
            r13 = r13 & r2
            boolean r13 = r12.S(r13, r0)
            if (r13 == 0) goto L212
            java.util.List r13 = r11.f19072h
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L195
            r13 = -1611702761(0xffffffff9fef5e17, float:-1.01376096E-19)
            r12.a0(r13)
            java.lang.String r13 = "暂无模板。模板只配置抢包策略，适用聊天在“适用聊天”里分配。"
            r0 = 6
            wb.ho.s0(r13, r12, r0)
            r12.p(r3)
            goto L215
        L195:
            r0 = -1611593672(0xffffffff9ff10838, float:-1.0208107E-19)
            r12.a0(r0)
            java.util.Iterator r0 = r13.iterator()
            r1 = r3
        L1a0:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L20e
            java.lang.Object r4 = r0.next()
            int r5 = r1 + 1
            if (r1 < 0) goto L209
            na.j r4 = (na.j) r4
            java.lang.String r6 = r4.f9151b
            boolean r7 = og.m.t0(r6)
            if (r7 == 0) goto L1be
            java.lang.String r6 = "模板 "
            java.lang.String r6 = eh.a.l(r5, r6)
        L1be:
            java.lang.String r7 = wb.ho.u5(r4)
            fg.p r8 = r11.f19073i
            boolean r9 = r12.f(r8)
            boolean r10 = r12.d(r1)
            r9 = r9 | r10
            boolean r10 = r12.h(r4)
            r9 = r9 | r10
            java.lang.Object r10 = r12.P()
            if (r9 != 0) goto L1dc
            i0.e r9 = i0.l.f5952a
            if (r10 != r9) goto L1e6
        L1dc:
            hb.e0 r10 = new hb.e0
            r9 = 8
            r10.<init>(r8, r1, r4, r9)
            r12.k0(r10)
        L1e6:
            fg.a r10 = (fg.a) r10
            wb.ho.x3(r6, r7, r10, r12, r3)
            int r4 = r13.size()
            int r4 = r4 - r2
            if (r1 >= r4) goto L200
            r1 = -1095597990(0xffffffffbeb2805a, float:-0.3486355)
            r12.a0(r1)
            r1 = 0
            wb.ho.D1(r1, r12, r3, r2)
        L1fc:
            r12.p(r3)
            goto L207
        L200:
            r1 = 396214134(0x179dbf76, float:1.0194219E-24)
            r12.a0(r1)
            goto L1fc
        L207:
            r1 = r5
            goto L1a0
        L209:
            a.a.Q0()
            r12 = 0
            throw r12
        L20e:
            r12.p(r3)
            goto L215
        L212:
            r12.V()
        L215:
            sf.n r12 = sf.n.f12433a
            return r12
        L218:
            int r13 = r13.intValue()
            r0 = r13 & 3
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L225
            r0 = r2
            goto L226
        L225:
            r0 = r3
        L226:
            r13 = r13 & r2
            boolean r13 = r12.S(r13, r0)
            if (r13 == 0) goto L2c2
            java.util.List r13 = r11.f19072h
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L246
            r13 = 1189114016(0x46e070a0, float:28728.312)
            r12.a0(r13)
            java.lang.String r13 = "暂无模板。模板只配置消息类型和关键词，名单在“名单管理”里分配模板。"
            r0 = 6
            wb.ho.s0(r13, r12, r0)
            r12.p(r3)
            goto L2c5
        L246:
            r0 = 1189227042(0x46e22a22, float:28949.066)
            r12.a0(r0)
            java.util.Iterator r0 = r13.iterator()
            r1 = r3
        L251:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L2be
            java.lang.Object r4 = r0.next()
            int r5 = r1 + 1
            if (r1 < 0) goto L2b9
            aa.h r4 = (aa.h) r4
            java.lang.String r6 = r4.f133b
            boolean r7 = og.m.t0(r6)
            if (r7 == 0) goto L26f
            java.lang.String r6 = "模板 "
            java.lang.String r6 = eh.a.l(r5, r6)
        L26f:
            java.lang.String r7 = wb.ho.r5(r4)
            fg.p r8 = r11.f19073i
            boolean r9 = r12.f(r8)
            boolean r10 = r12.d(r1)
            r9 = r9 | r10
            boolean r10 = r12.h(r4)
            r9 = r9 | r10
            java.lang.Object r10 = r12.P()
            if (r9 != 0) goto L28d
            i0.e r9 = i0.l.f5952a
            if (r10 != r9) goto L296
        L28d:
            hb.e0 r10 = new hb.e0
            r9 = 7
            r10.<init>(r8, r1, r4, r9)
            r12.k0(r10)
        L296:
            fg.a r10 = (fg.a) r10
            wb.ho.x3(r6, r7, r10, r12, r3)
            int r4 = r13.size()
            int r4 = r4 - r2
            if (r1 >= r4) goto L2b0
            r1 = -451338058(0xffffffffe51920b6, float:-4.5195343E22)
            r12.a0(r1)
            r1 = 0
            wb.ho.D1(r1, r12, r3, r2)
        L2ac:
            r12.p(r3)
            goto L2b7
        L2b0:
            r1 = -1106564454(0xffffffffbe0b2a9a, float:-0.1359047)
            r12.a0(r1)
            goto L2ac
        L2b7:
            r1 = r5
            goto L251
        L2b9:
            a.a.Q0()
            r12 = 0
            throw r12
        L2be:
            r12.p(r3)
            goto L2c5
        L2c2:
            r12.V()
        L2c5:
            sf.n r12 = sf.n.f12433a
            return r12
    }
}
