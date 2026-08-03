package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t0 implements fg.p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1366g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1367h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1368i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1369j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1370k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1371l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1372m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f1373n;

    public /* synthetic */ t0(c9.j1 r2, android.app.Activity r3, c9.o2 r4, fg.a r5, fg.a r6, fg.a r7, int r8) {
            r1 = this;
            r0 = 0
            r1.f1366g = r0
            r1.<init>()
            r1.f1368i = r2
            r1.f1369j = r3
            r1.f1370k = r4
            r1.f1371l = r5
            r1.f1372m = r6
            r1.f1373n = r7
            r1.f1367h = r8
            return
    }

    public /* synthetic */ t0(java.lang.Object r1, int r2, fg.p r3, fg.l r4, fg.l r5, i0.a1 r6, i0.a1 r7, int r8) {
            r0 = this;
            r0.f1366g = r8
            r0.f1368i = r1
            r0.f1367h = r2
            r0.f1369j = r3
            r0.f1370k = r4
            r0.f1371l = r5
            r0.f1372m = r6
            r0.f1373n = r7
            r0.<init>()
            return
    }

    public /* synthetic */ t0(na.h r2, fg.l r3, int r4, java.util.List r5, fg.l r6, fg.l r7, fg.l r8) {
            r1 = this;
            r0 = 4
            r1.f1366g = r0
            r1.<init>()
            r1.f1368i = r2
            r1.f1369j = r3
            r1.f1367h = r4
            r1.f1370k = r5
            r1.f1371l = r6
            r1.f1372m = r7
            r1.f1373n = r8
            return
    }

    public /* synthetic */ t0(s0.d r2, java.lang.Object r3, java.lang.Boolean r4, java.lang.Object r5, java.lang.Object r6, java.lang.Object r7, int r8) {
            r1 = this;
            r0 = 1
            r1.f1366g = r0
            r1.<init>()
            r1.f1368i = r2
            r1.f1369j = r3
            r1.f1370k = r4
            r1.f1371l = r5
            r1.f1372m = r6
            r1.f1373n = r7
            r1.f1367h = r8
            return
    }

    @Override // fg.p
    public final java.lang.Object invoke(java.lang.Object r19, java.lang.Object r20) {
            r18 = this;
            r0 = r18
            int r1 = r0.f1366g
            switch(r1) {
                case 0: goto L3ba;
                case 1: goto L38f;
                case 2: goto L268;
                case 3: goto L141;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r0.f1368i
            na.h r1 = (na.h) r1
            java.lang.Object r2 = r0.f1369j
            fg.l r2 = (fg.l) r2
            java.lang.Object r3 = r0.f1370k
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r4 = r0.f1371l
            fg.l r4 = (fg.l) r4
            java.lang.Object r5 = r0.f1372m
            fg.l r5 = (fg.l) r5
            java.lang.Object r6 = r0.f1373n
            fg.l r6 = (fg.l) r6
            r12 = r19
            i0.h0 r12 = (i0.h0) r12
            r7 = r20
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r8 = r7 & 3
            r9 = 2
            r10 = 1
            r11 = 0
            if (r8 == r9) goto L34
            r8 = r10
            goto L35
        L34:
            r8 = r11
        L35:
            r7 = r7 & r10
            boolean r7 = r12.S(r7, r8)
            if (r7 == 0) goto L13b
            int r7 = r1.f9139b
            java.lang.String r8 = wb.ho.I6(r7)
            java.lang.String r9 = r1.f9140c
            boolean r13 = wb.ho.K6(r7)
            if (r13 != 0) goto L5a
            r13 = 8
            if (r7 != r13) goto L4f
            goto L5a
        L4f:
            java.lang.String r7 = wb.ho.G6(r9, r7, r11)
            java.lang.String r9 = "已选择："
            java.lang.String r7 = og.m.A0(r7, r9)
            goto L78
        L5a:
            java.lang.CharSequence r7 = og.m.R0(r9)
            java.lang.String r7 = r7.toString()
            r9 = 10
            r13 = 32
            java.lang.String r7 = og.t.b0(r7, r9, r13)
            boolean r9 = og.m.t0(r7)
            if (r9 == 0) goto L72
            java.lang.String r7 = "未填写内容"
        L72:
            r9 = 24
            java.lang.String r7 = og.m.P0(r9, r7)
        L78:
            long r13 = r1.f9141d
            r15 = 0
            int r9 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r9 >= 0) goto L81
            r13 = r15
        L81:
            int r9 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r9 <= 0) goto L99
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r15 = "延迟 "
            r9.<init>(r15)
            r9.append(r13)
            java.lang.String r13 = "ms"
            r9.append(r13)
            java.lang.String r9 = r9.toString()
            goto L9b
        L99:
            java.lang.String r9 = "无延迟"
        L9b:
            boolean r1 = r1.f9142e
            if (r1 == 0) goto La2
            java.lang.String r1 = "随机追加"
            goto La4
        La2:
            java.lang.String r1 = "固定"
        La4:
            java.lang.String r13 = " · "
            java.lang.String r1 = bc.e.v(r7, r13, r9, r13, r1)
            boolean r7 = r12.f(r2)
            int r9 = r0.f1367h
            boolean r13 = r12.d(r9)
            r7 = r7 | r13
            java.lang.Object r13 = r12.P()
            i0.e r14 = i0.l.f5952a
            if (r7 != 0) goto Lbf
            if (r13 != r14) goto Lc8
        Lbf:
            wb.wg r13 = new wb.wg
            r7 = 2
            r13.<init>(r9, r7, r2)
            r12.k0(r13)
        Lc8:
            fg.a r13 = (fg.a) r13
            wb.ho.x3(r8, r1, r13, r12, r11)
            r1 = 0
            wb.ho.D1(r1, r12, r11, r10)
            if (r9 <= 0) goto Ld5
            r7 = r10
            goto Ld6
        Ld5:
            r7 = r11
        Ld6:
            int r1 = a.a.b0(r3)
            if (r9 >= r1) goto Lde
            r8 = r10
            goto Ldf
        Lde:
            r8 = r11
        Ldf:
            boolean r1 = r12.f(r4)
            boolean r2 = r12.d(r9)
            r1 = r1 | r2
            java.lang.Object r2 = r12.P()
            if (r1 != 0) goto Lf0
            if (r2 != r14) goto Lf9
        Lf0:
            wb.wg r2 = new wb.wg
            r1 = 3
            r2.<init>(r9, r1, r4)
            r12.k0(r2)
        Lf9:
            fg.a r2 = (fg.a) r2
            boolean r1 = r12.f(r5)
            boolean r3 = r12.d(r9)
            r1 = r1 | r3
            java.lang.Object r3 = r12.P()
            if (r1 != 0) goto L10c
            if (r3 != r14) goto L115
        L10c:
            wb.wg r3 = new wb.wg
            r1 = 4
            r3.<init>(r9, r1, r5)
            r12.k0(r3)
        L115:
            r10 = r3
            fg.a r10 = (fg.a) r10
            boolean r1 = r12.f(r6)
            boolean r3 = r12.d(r9)
            r1 = r1 | r3
            java.lang.Object r3 = r12.P()
            if (r1 != 0) goto L129
            if (r3 != r14) goto L132
        L129:
            wb.wg r3 = new wb.wg
            r1 = 5
            r3.<init>(r9, r1, r6)
            r12.k0(r3)
        L132:
            r11 = r3
            fg.a r11 = (fg.a) r11
            r13 = 0
            r9 = r2
            wb.ho.a3(r7, r8, r9, r10, r11, r12, r13)
            goto L13e
        L13b:
            r12.V()
        L13e:
            sf.n r1 = sf.n.f12433a
            return r1
        L141:
            java.lang.Object r1 = r0.f1368i
            v8.a r1 = (v8.a) r1
            java.lang.Object r2 = r0.f1369j
            fg.p r2 = (fg.p) r2
            java.lang.Object r3 = r0.f1370k
            fg.l r3 = (fg.l) r3
            java.lang.Object r4 = r0.f1371l
            fg.l r4 = (fg.l) r4
            java.lang.Object r5 = r0.f1372m
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r6 = r0.f1373n
            i0.a1 r6 = (i0.a1) r6
            r12 = r19
            i0.h0 r12 = (i0.h0) r12
            r7 = r20
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r8 = r7 & 3
            r9 = 2
            r15 = 1
            r10 = 0
            if (r8 == r9) goto L16e
            r8 = r15
            goto L16f
        L16e:
            r8 = r10
        L16f:
            r7 = r7 & r15
            boolean r7 = r12.S(r7, r8)
            if (r7 == 0) goto L262
            java.lang.Object r5 = r5.getValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            java.lang.String r7 = "未命名规则"
            i0.e r8 = i0.l.f5952a
            if (r5 == 0) goto L1cd
            r2 = -1838171772(0xffffffff926fb984, float:-7.564377E-28)
            r12.a0(r2)
            java.lang.String r2 = r1.f14202b
            boolean r3 = og.m.t0(r2)
            if (r3 == 0) goto L195
            goto L196
        L195:
            r7 = r2
        L196:
            java.lang.String r2 = wb.ho.G4(r1)
            wb.bp r3 = new wb.bp
            int r4 = r0.f1367h
            r3.<init>(r7, r4, r2)
            java.lang.Object r2 = r6.getValue()
            java.util.Set r2 = (java.util.Set) r2
            java.lang.String r4 = r1.f14201a
            boolean r2 = r2.contains(r4)
            boolean r4 = r12.h(r1)
            java.lang.Object r5 = r12.P()
            if (r4 != 0) goto L1b9
            if (r5 != r8) goto L1c3
        L1b9:
            sh.v1 r5 = new sh.v1
            r4 = 25
            r5.<init>(r1, r4, r6)
            r12.k0(r5)
        L1c3:
            fg.a r5 = (fg.a) r5
            wb.ho.x2(r3, r2, r5, r12, r10)
            r12.p(r10)
            goto L265
        L1cd:
            r5 = -1837634170(0xffffffff9277ed86, float:-7.823223E-28)
            r12.a0(r5)
            r5 = r7
            boolean r7 = r1.f14203c
            java.lang.String r6 = r1.f14202b
            boolean r9 = og.m.t0(r6)
            if (r9 == 0) goto L1df
            goto L1e0
        L1df:
            r5 = r6
        L1e0:
            java.lang.String r9 = wb.ho.G4(r1)
            boolean r6 = r12.f(r2)
            boolean r11 = r12.h(r1)
            r6 = r6 | r11
            java.lang.Object r11 = r12.P()
            if (r6 != 0) goto L1f5
            if (r11 != r8) goto L1ff
        L1f5:
            wb.l7 r11 = new wb.l7
            r6 = 10
            r11.<init>(r2, r6, r1)
            r12.k0(r11)
        L1ff:
            fg.l r11 = (fg.l) r11
            r13 = 0
            r14 = 8
            r2 = r10
            r10 = 0
            r17 = r5
            r5 = r2
            r2 = r8
            r8 = r17
            wb.ho.P3(r7, r8, r9, r10, r11, r12, r13, r14)
            r6 = 0
            wb.ho.D1(r6, r12, r5, r15)
            boolean r7 = r12.f(r3)
            boolean r8 = r12.h(r1)
            r7 = r7 | r8
            java.lang.Object r8 = r12.P()
            if (r7 != 0) goto L224
            if (r8 != r2) goto L22d
        L224:
            wb.ea r8 = new wb.ea
            r7 = 2
            r8.<init>(r3, r1, r7)
            r12.k0(r8)
        L22d:
            fg.a r8 = (fg.a) r8
            java.lang.String r3 = "编辑"
            java.lang.String r7 = "修改监听会话、转发会话和消息类型"
            r9 = 54
            wb.ho.b(r3, r7, r8, r12, r9)
            wb.ho.D1(r6, r12, r5, r15)
            boolean r3 = r12.f(r4)
            boolean r6 = r12.h(r1)
            r3 = r3 | r6
            java.lang.Object r6 = r12.P()
            if (r3 != 0) goto L24c
            if (r6 != r2) goto L255
        L24c:
            wb.ea r6 = new wb.ea
            r2 = 3
            r6.<init>(r4, r1, r2)
            r12.k0(r6)
        L255:
            fg.a r6 = (fg.a) r6
            java.lang.String r1 = "删除"
            java.lang.String r2 = "移除此规则"
            wb.ho.b(r1, r2, r6, r12, r9)
            r12.p(r5)
            goto L265
        L262:
            r12.V()
        L265:
            sf.n r1 = sf.n.f12433a
            return r1
        L268:
            java.lang.Object r1 = r0.f1368i
            x8.b r1 = (x8.b) r1
            java.lang.Object r2 = r0.f1369j
            fg.p r2 = (fg.p) r2
            java.lang.Object r3 = r0.f1370k
            fg.l r3 = (fg.l) r3
            java.lang.Object r4 = r0.f1371l
            fg.l r4 = (fg.l) r4
            java.lang.Object r5 = r0.f1372m
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r6 = r0.f1373n
            i0.a1 r6 = (i0.a1) r6
            r12 = r19
            i0.h0 r12 = (i0.h0) r12
            r7 = r20
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r8 = r7 & 3
            r9 = 2
            r15 = 1
            r10 = 0
            if (r8 == r9) goto L295
            r8 = r15
            goto L296
        L295:
            r8 = r10
        L296:
            r7 = r7 & r15
            boolean r7 = r12.S(r7, r8)
            if (r7 == 0) goto L389
            java.lang.Object r5 = r5.getValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            java.lang.String r7 = "未命名规则"
            i0.e r8 = i0.l.f5952a
            if (r5 == 0) goto L2f4
            r2 = 235475588(0xe091284, float:1.6895469E-30)
            r12.a0(r2)
            java.lang.String r2 = r1.f21232b
            boolean r3 = og.m.t0(r2)
            if (r3 == 0) goto L2bc
            goto L2bd
        L2bc:
            r7 = r2
        L2bd:
            java.lang.String r2 = wb.ho.k5(r1)
            wb.bp r3 = new wb.bp
            int r4 = r0.f1367h
            r3.<init>(r7, r4, r2)
            java.lang.Object r2 = r6.getValue()
            java.util.Set r2 = (java.util.Set) r2
            java.lang.String r4 = r1.f21231a
            boolean r2 = r2.contains(r4)
            boolean r4 = r12.h(r1)
            java.lang.Object r5 = r12.P()
            if (r4 != 0) goto L2e0
            if (r5 != r8) goto L2ea
        L2e0:
            sh.v1 r5 = new sh.v1
            r4 = 27
            r5.<init>(r1, r4, r6)
            r12.k0(r5)
        L2ea:
            fg.a r5 = (fg.a) r5
            wb.ho.x2(r3, r2, r5, r12, r10)
            r12.p(r10)
            goto L38c
        L2f4:
            r5 = 236351059(0xe166e53, float:1.8542047E-30)
            r12.a0(r5)
            r5 = r7
            boolean r7 = r1.f21233c
            java.lang.String r6 = r1.f21232b
            boolean r9 = og.m.t0(r6)
            if (r9 == 0) goto L306
            goto L307
        L306:
            r5 = r6
        L307:
            java.lang.String r9 = wb.ho.k5(r1)
            boolean r6 = r12.f(r2)
            boolean r11 = r12.h(r1)
            r6 = r6 | r11
            java.lang.Object r11 = r12.P()
            if (r6 != 0) goto L31c
            if (r11 != r8) goto L326
        L31c:
            wb.l7 r11 = new wb.l7
            r6 = 12
            r11.<init>(r2, r6, r1)
            r12.k0(r11)
        L326:
            fg.l r11 = (fg.l) r11
            r13 = 0
            r14 = 8
            r2 = r10
            r10 = 0
            r17 = r5
            r5 = r2
            r2 = r8
            r8 = r17
            wb.ho.P3(r7, r8, r9, r10, r11, r12, r13, r14)
            r6 = 0
            wb.ho.D1(r6, r12, r5, r15)
            boolean r7 = r12.f(r3)
            boolean r8 = r12.h(r1)
            r7 = r7 | r8
            java.lang.Object r8 = r12.P()
            if (r7 != 0) goto L34b
            if (r8 != r2) goto L354
        L34b:
            wb.ii r8 = new wb.ii
            r7 = 0
            r8.<init>(r7, r3, r1)
            r12.k0(r8)
        L354:
            fg.a r8 = (fg.a) r8
            java.lang.String r3 = "编辑"
            java.lang.String r7 = "修改触发条件和回复步骤"
            r9 = 54
            wb.ho.b(r3, r7, r8, r12, r9)
            wb.ho.D1(r6, r12, r5, r15)
            boolean r3 = r12.f(r4)
            boolean r6 = r12.h(r1)
            r3 = r3 | r6
            java.lang.Object r6 = r12.P()
            if (r3 != 0) goto L373
            if (r6 != r2) goto L37c
        L373:
            wb.ii r6 = new wb.ii
            r2 = 1
            r6.<init>(r2, r4, r1)
            r12.k0(r6)
        L37c:
            fg.a r6 = (fg.a) r6
            java.lang.String r1 = "删除"
            java.lang.String r2 = "移除此规则"
            wb.ho.b(r1, r2, r6, r12, r9)
            r12.p(r5)
            goto L38c
        L389:
            r12.V()
        L38c:
            sf.n r1 = sf.n.f12433a
            return r1
        L38f:
            java.lang.Object r1 = r0.f1368i
            r2 = r1
            s0.d r2 = (s0.d) r2
            java.lang.Object r1 = r0.f1370k
            r4 = r1
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r8 = r19
            i0.h0 r8 = (i0.h0) r8
            r1 = r20
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r1 = r0.f1367h
            int r1 = i0.r.C(r1)
            r9 = r1 | 1
            java.lang.Object r3 = r0.f1369j
            java.lang.Object r5 = r0.f1371l
            java.lang.Object r6 = r0.f1372m
            java.lang.Object r7 = r0.f1373n
            r2.h(r3, r4, r5, r6, r7, r8, r9)
        L3b7:
            sf.n r1 = sf.n.f12433a
            return r1
        L3ba:
            java.lang.Object r1 = r0.f1368i
            r2 = r1
            c9.j1 r2 = (c9.j1) r2
            java.lang.Object r1 = r0.f1369j
            r3 = r1
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.Object r1 = r0.f1370k
            r4 = r1
            c9.o2 r4 = (c9.o2) r4
            java.lang.Object r1 = r0.f1371l
            r5 = r1
            fg.a r5 = (fg.a) r5
            java.lang.Object r1 = r0.f1372m
            r6 = r1
            fg.a r6 = (fg.a) r6
            java.lang.Object r1 = r0.f1373n
            r7 = r1
            fg.a r7 = (fg.a) r7
            r8 = r19
            i0.h0 r8 = (i0.h0) r8
            r1 = r20
            java.lang.Integer r1 = (java.lang.Integer) r1
            r1.getClass()
            int r1 = r0.f1367h
            r1 = r1 | 1
            int r9 = i0.r.C(r1)
            r2.l(r3, r4, r5, r6, r7, r8, r9)
            goto L3b7
    }
}
