package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z1 implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f20513g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f20514h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fg.l f20515i;

    public /* synthetic */ z1(java.util.List r1, fg.l r2, int r3) {
            r0 = this;
            r3 = 4
            r0.f20513g = r3
            r0.<init>()
            r0.f20514h = r1
            r0.f20515i = r2
            return
    }

    public /* synthetic */ z1(java.util.List r1, fg.l r2, int r3, byte r4) {
            r0 = this;
            r0.f20513g = r3
            r0.f20514h = r1
            r0.f20515i = r2
            r0.<init>()
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r12, java.lang.Object r13) {
            r11 = this;
            int r0 = r11.f20513g
            i0.h0 r12 = (i0.h0) r12
            java.lang.Integer r13 = (java.lang.Integer) r13
            switch(r0) {
                case 0: goto L220;
                case 1: goto L1a5;
                case 2: goto Lfe;
                case 3: goto L62;
                case 4: goto L50;
                default: goto L9;
            }
        L9:
            int r13 = r13.intValue()
            r0 = r13 & 3
            r1 = 2
            r2 = 1
            if (r0 == r1) goto L15
            r0 = r2
            goto L16
        L15:
            r0 = 0
        L16:
            r13 = r13 & r2
            boolean r13 = r12.S(r13, r0)
            if (r13 == 0) goto L4a
            java.util.List r13 = r11.f20514h
            boolean r0 = r12.h(r13)
            fg.l r1 = r11.f20515i
            boolean r2 = r12.f(r1)
            r0 = r0 | r2
            java.lang.Object r2 = r12.P()
            if (r0 != 0) goto L34
            i0.e r0 = i0.l.f5952a
            if (r2 != r0) goto L3e
        L34:
            wb.xi r2 = new wb.xi
            r0 = 17
            r2.<init>(r13, r1, r0)
            r12.k0(r2)
        L3e:
            fg.a r2 = (fg.a) r2
            r13 = 54
            java.lang.String r0 = "添加 MCP"
            java.lang.String r1 = "可同时启用多个远程 MCP 服务器"
            wb.ho.b(r0, r1, r2, r12, r13)
            goto L4d
        L4a:
            r12.V()
        L4d:
            sf.n r12 = sf.n.f12433a
            return r12
        L50:
            r13.getClass()
            r13 = 1
            int r13 = i0.r.C(r13)
            java.util.List r0 = r11.f20514h
            fg.l r1 = r11.f20515i
            wb.ho.G2(r0, r1, r12, r13)
            sf.n r12 = sf.n.f12433a
            return r12
        L62:
            int r13 = r13.intValue()
            r0 = r13 & 3
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L6f
            r0 = r2
            goto L70
        L6f:
            r0 = r3
        L70:
            r13 = r13 & r2
            boolean r13 = r12.S(r13, r0)
            if (r13 == 0) goto Lf8
            java.util.List r13 = r11.f20514h
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L8f
            r13 = -1874154283(0xffffffff904aacd5, float:-3.997062E-29)
            r12.a0(r13)
            java.lang.String r13 = "没有匹配插件"
            r0 = 6
            wb.ho.s0(r13, r12, r0)
            r12.p(r3)
            goto Lfb
        L8f:
            r0 = -1874096778(0xffffffff904b8d76, float:-4.0143668E-29)
            r12.a0(r0)
            java.util.Iterator r0 = r13.iterator()
            r1 = r3
        L9a:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto Lf4
            java.lang.Object r4 = r0.next()
            int r5 = r1 + 1
            if (r1 < 0) goto Lef
            eb.c0 r4 = (eb.c0) r4
            fg.l r6 = r11.f20515i
            boolean r7 = r12.f(r6)
            boolean r8 = r12.h(r4)
            r7 = r7 | r8
            java.lang.Object r8 = r12.P()
            if (r7 != 0) goto Lbf
            i0.e r7 = i0.l.f5952a
            if (r8 != r7) goto Lc8
        Lbf:
            wb.q9 r8 = new wb.q9
            r7 = 0
            r8.<init>(r6, r4, r7)
            r12.k0(r8)
        Lc8:
            fg.a r8 = (fg.a) r8
            r6 = 8
            wb.ho.H2(r4, r8, r12, r6)
            int r4 = r13.size()
            int r4 = r4 - r2
            if (r1 >= r4) goto Le4
            r1 = 848063917(0x328c6dad, float:1.634802E-8)
            r12.a0(r1)
            r1 = 0
            wb.ho.D1(r1, r12, r3, r2)
            r12.p(r3)
            goto Led
        Le4:
            r1 = 848115811(0x328d3863, float:1.6440202E-8)
            r12.a0(r1)
            r12.p(r3)
        Led:
            r1 = r5
            goto L9a
        Lef:
            a.a.Q0()
            r12 = 0
            throw r12
        Lf4:
            r12.p(r3)
            goto Lfb
        Lf8:
            r12.V()
        Lfb:
            sf.n r12 = sf.n.f12433a
            return r12
        Lfe:
            int r13 = r13.intValue()
            r0 = r13 & 3
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L10b
            r0 = r2
            goto L10c
        L10b:
            r0 = r3
        L10c:
            r13 = r13 & r2
            boolean r13 = r12.S(r13, r0)
            if (r13 == 0) goto L19f
            java.util.List r13 = r11.f20514h
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L12c
            r13 = -102094501(0xfffffffff9ea295b, float:-1.5197953E35)
            r12.a0(r13)
            java.lang.String r13 = "暂无群聊标签"
            r0 = 6
            wb.ho.s0(r13, r12, r0)
            r12.p(r3)
            goto L1a2
        L12c:
            r0 = -102010553(0xfffffffff9eb7147, float:-1.5281091E35)
            r12.a0(r0)
            java.util.Iterator r0 = r13.iterator()
            r1 = r3
        L137:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L19b
            java.lang.Object r4 = r0.next()
            int r5 = r1 + 1
            if (r1 < 0) goto L196
            n9.a r4 = (n9.a) r4
            java.lang.String r6 = r4.f9070b
            java.util.Set r7 = r4.f9071c
            int r7 = r7.size()
            java.lang.String r8 = " 个群聊"
            java.lang.String r7 = p.a.i(r7, r8)
            fg.l r8 = r11.f20515i
            boolean r9 = r12.f(r8)
            boolean r10 = r12.h(r4)
            r9 = r9 | r10
            java.lang.Object r10 = r12.P()
            if (r9 != 0) goto L16a
            i0.e r9 = i0.l.f5952a
            if (r10 != r9) goto L173
        L16a:
            wb.jh r10 = new wb.jh
            r9 = 1
            r10.<init>(r8, r4, r9)
            r12.k0(r10)
        L173:
            fg.a r10 = (fg.a) r10
            wb.ho.x3(r6, r7, r10, r12, r3)
            int r4 = r13.size()
            int r4 = r4 - r2
            if (r1 >= r4) goto L18d
            r1 = 1758687824(0x68d37250, float:7.988224E24)
            r12.a0(r1)
            r1 = 0
            wb.ho.D1(r1, r12, r3, r2)
        L189:
            r12.p(r3)
            goto L194
        L18d:
            r1 = -1315238848(0xffffffffb19b0c40, float:-4.5124864E-9)
            r12.a0(r1)
            goto L189
        L194:
            r1 = r5
            goto L137
        L196:
            a.a.Q0()
            r12 = 0
            throw r12
        L19b:
            r12.p(r3)
            goto L1a2
        L19f:
            r12.V()
        L1a2:
            sf.n r12 = sf.n.f12433a
            return r12
        L1a5:
            int r13 = r13.intValue()
            r0 = r13 & 3
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L1b2
            r0 = r2
            goto L1b3
        L1b2:
            r0 = r3
        L1b3:
            r13 = r13 & r2
            boolean r13 = r12.S(r13, r0)
            if (r13 == 0) goto L21a
            java.util.List r13 = r11.f20514h
            java.util.Iterator r0 = r13.iterator()
            r1 = r3
        L1c1:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L21d
            java.lang.Object r4 = r0.next()
            int r5 = r1 + 1
            if (r1 < 0) goto L215
            wb.c3 r4 = (wb.c3) r4
            fg.l r6 = r11.f20515i
            boolean r7 = r12.f(r6)
            boolean r8 = r12.h(r4)
            r7 = r7 | r8
            java.lang.Object r8 = r12.P()
            if (r7 != 0) goto L1e6
            i0.e r7 = i0.l.f5952a
            if (r8 != r7) goto L1f0
        L1e6:
            sh.v1 r8 = new sh.v1
            r7 = 14
            r8.<init>(r6, r7, r4)
            r12.k0(r8)
        L1f0:
            fg.a r8 = (fg.a) r8
            wb.ho.F0(r4, r8, r12, r3)
            int r4 = r13.size()
            int r4 = r4 - r2
            if (r1 >= r4) goto L20a
            r1 = -1948652417(0xffffffff8bd9ec7f, float:-8.39412E-32)
            r12.a0(r1)
            r1 = 0
            wb.ho.D1(r1, r12, r3, r2)
            r12.p(r3)
            goto L213
        L20a:
            r1 = -1948600523(0xffffffff8bdab735, float:-8.4246205E-32)
            r12.a0(r1)
            r12.p(r3)
        L213:
            r1 = r5
            goto L1c1
        L215:
            a.a.Q0()
            r12 = 0
            throw r12
        L21a:
            r12.V()
        L21d:
            sf.n r12 = sf.n.f12433a
            return r12
        L220:
            int r13 = r13.intValue()
            r0 = r13 & 3
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L22d
            r0 = r2
            goto L22e
        L22d:
            r0 = r3
        L22e:
            r13 = r13 & r2
            boolean r13 = r12.S(r13, r0)
            if (r13 == 0) goto L2c5
            java.util.List r13 = r11.f20514h
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L24e
            r13 = -1936885700(0xffffffff8c8d783c, float:-2.1796853E-31)
            r12.a0(r13)
            java.lang.String r13 = "没有其它可用分组"
            r0 = 6
            wb.ho.s0(r13, r12, r0)
            r12.p(r3)
            goto L2c8
        L24e:
            r0 = -1936798869(0xffffffff8c8ecb6b, float:-2.2000992E-31)
            r12.a0(r0)
            java.util.Iterator r0 = r13.iterator()
            r1 = r3
        L259:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L2c1
            java.lang.Object r4 = r0.next()
            int r5 = r1 + 1
            if (r1 < 0) goto L2bc
            wb.g2 r4 = (wb.g2) r4
            java.lang.String r6 = "  "
            int r7 = r4.f16298b
            java.lang.String r6 = og.t.Z(r7, r6)
            c9.a r7 = r4.f16297a
            java.lang.String r7 = r7.f1082b
            java.lang.String r6 = bc.e.i(r6, r7)
            java.lang.String r7 = r4.f16299c
            fg.l r8 = r11.f20515i
            boolean r9 = r12.f(r8)
            boolean r10 = r12.h(r4)
            r9 = r9 | r10
            java.lang.Object r10 = r12.P()
            if (r9 != 0) goto L290
            i0.e r9 = i0.l.f5952a
            if (r10 != r9) goto L299
        L290:
            wb.b2 r10 = new wb.b2
            r9 = 1
            r10.<init>(r8, r4, r9)
            r12.k0(r10)
        L299:
            fg.a r10 = (fg.a) r10
            wb.ho.x3(r6, r7, r10, r12, r3)
            int r4 = r13.size()
            int r4 = r4 - r2
            if (r1 >= r4) goto L2b3
            r1 = 1834762129(0x6d5c3f91, float:4.2602218E27)
            r12.a0(r1)
            r1 = 0
            wb.ho.D1(r1, r12, r3, r2)
        L2af:
            r12.p(r3)
            goto L2ba
        L2b3:
            r1 = 1043064607(0x3e2be71f, float:0.16787384)
            r12.a0(r1)
            goto L2af
        L2ba:
            r1 = r5
            goto L259
        L2bc:
            a.a.Q0()
            r12 = 0
            throw r12
        L2c1:
            r12.p(r3)
            goto L2c8
        L2c5:
            r12.V()
        L2c8:
            sf.n r12 = sf.n.f12433a
            return r12
    }
}
