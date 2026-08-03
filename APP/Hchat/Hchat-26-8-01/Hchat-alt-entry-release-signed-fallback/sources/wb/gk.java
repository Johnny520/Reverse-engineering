package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gk implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f16406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f16407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16408i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e9.s f16409j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i0.a1 f16410k;

    public /* synthetic */ gk(android.content.Context r1, i0.a1 r2, e9.s r3, i0.a1 r4, int r5) {
            r0 = this;
            r0.f16406g = r5
            r0.f16407h = r1
            r0.f16408i = r2
            r0.f16409j = r3
            r0.f16410k = r4
            r0.<init>()
            return
    }

    public /* synthetic */ gk(android.content.Context r2, i0.a1 r3, i0.a1 r4, e9.s r5) {
            r1 = this;
            r0 = 2
            r1.f16406g = r0
            r1.<init>()
            r1.f16407h = r2
            r1.f16408i = r3
            r1.f16410k = r4
            r1.f16409j = r5
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r78) {
            r77 = this;
            r0 = r77
            int r1 = r0.f16406g
            sf.n r2 = sf.n.f12433a
            r3 = 0
            r4 = 1
            e9.s r5 = r0.f16409j
            i0.a1 r6 = r0.f16410k
            i0.a1 r7 = r0.f16408i
            android.content.Context r8 = r0.f16407h
            switch(r1) {
                case 0: goto L179;
                case 1: goto L131;
                default: goto L13;
            }
        L13:
            r1 = r78
            java.util.List r1 = (java.util.List) r1
            wb.m2 r9 = wb.m2.f17592c
            r1.getClass()
            boolean r10 = r1.isEmpty()
            if (r10 == 0) goto L30
            java.lang.String r1 = "未选择会话"
            android.widget.Toast r1 = android.widget.Toast.makeText(r8, r1, r3)
            r1.show()
            r7.setValue(r9)
            goto L130
        L30:
            java.lang.Object r10 = r6.getValue()
            java.util.List r10 = (java.util.List) r10
            int r11 = tf.n.e1(r10)
            int r11 = tf.y.a0(r11)
            r12 = 16
            if (r11 >= r12) goto L43
            r11 = r12
        L43:
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>(r11)
            java.util.Iterator r10 = r10.iterator()
        L4c:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L5f
            java.lang.Object r11 = r10.next()
            r13 = r11
            e9.c r13 = (e9.c) r13
            java.lang.String r13 = r13.f2391b
            r12.put(r13, r11)
            goto L4c
        L5f:
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>(r12)
            java.util.Iterator r1 = r1.iterator()
            r11 = r3
            r12 = r11
        L6a:
            boolean r13 = r1.hasNext()
            if (r13 == 0) goto Lf0
            java.lang.Object r13 = r1.next()
            wb.s0 r13 = (wb.s0) r13
            java.lang.String r14 = r13.f18970a
            java.lang.Object r15 = r10.get(r14)
            r16 = r15
            e9.c r16 = (e9.c) r16
            if (r16 != 0) goto Lad
            int r11 = r11 + 1
            java.lang.String r15 = r13.f18970a
            java.lang.String r3 = r13.f18971b
            boolean r16 = og.m.t0(r3)
            if (r16 == 0) goto L91
            r18 = r14
            goto L93
        L91:
            r18 = r3
        L93:
            boolean r3 = r13.f18972c
            boolean r13 = r13.f18976g
            r16 = r15
            e9.c r15 = new e9.c
            r21 = 8388576(0x7fffe0, float:1.1754899E-38)
            r17 = r16
            r19 = r3
            r20 = r13
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r3 = r16
            r10.put(r3, r15)
            goto Led
        Lad:
            int r12 = r12 + 1
            java.lang.String r3 = r13.f18971b
            boolean r15 = r13.f18972c
            boolean r13 = r13.f18976g
            r39 = 0
            r40 = 8388579(0x7fffe3, float:1.1754903E-38)
            r17 = 0
            r18 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r19 = r3
            r21 = r13
            r20 = r15
            e9.c r3 = e9.c.a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r10.put(r14, r3)
        Led:
            r3 = 0
            goto L6a
        Lf0:
            java.util.Collection r1 = r10.values()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            wb.e2 r3 = new wb.e2
            r10 = 4
            r3.<init>(r10)
            wb.kn r10 = new wb.kn
            r10.<init>(r3, r4)
            java.util.List r1 = tf.m.K1(r1, r10)
            wb.ho.m0(r5, r6, r1)
            java.lang.String r1 = "已添加 "
            java.lang.String r3 = " 个会话"
            if (r11 <= 0) goto L118
            if (r12 <= 0) goto L118
            java.lang.String r4 = " 个会话，更新 "
            java.lang.String r1 = eh.a.k(r11, r12, r1, r4, r3)
        L116:
            r3 = 0
            goto L126
        L118:
            if (r11 <= 0) goto L11f
            java.lang.String r1 = eh.a.m(r11, r1, r3)
            goto L116
        L11f:
            java.lang.String r1 = "已更新 "
            java.lang.String r1 = eh.a.m(r12, r1, r3)
            goto L116
        L126:
            android.widget.Toast r1 = android.widget.Toast.makeText(r8, r1, r3)
            r1.show()
            r7.setValue(r9)
        L130:
            return r2
        L131:
            r1 = r78
            e9.c r1 = (e9.c) r1
            r1.getClass()
            java.lang.Object r3 = r7.getValue()
            java.util.List r3 = (java.util.List) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            int r9 = tf.n.e1(r3)
            r4.<init>(r9)
            java.util.Iterator r3 = r3.iterator()
        L14b:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L166
            java.lang.Object r9 = r3.next()
            e9.c r9 = (e9.c) r9
            java.lang.String r10 = r9.f2391b
            java.lang.String r11 = r1.f2391b
            boolean r10 = gg.l.a(r10, r11)
            if (r10 == 0) goto L162
            r9 = r1
        L162:
            r4.add(r9)
            goto L14b
        L166:
            wb.ho.m0(r5, r7, r4)
            java.lang.String r1 = "规则已保存"
            r3 = 0
            android.widget.Toast r1 = android.widget.Toast.makeText(r8, r1, r3)
            r1.show()
            wb.m2 r1 = wb.m2.f17592c
            r6.setValue(r1)
            return r2
        L179:
            r1 = r78
            wb.k2 r1 = (wb.k2) r1
            r1.getClass()
            boolean r3 = r1.f17184y
            boolean r9 = r1.f17180u
            boolean r10 = r1.f17178s
            boolean r11 = r1.f17176q
            boolean r12 = r1.f17174o
            boolean r13 = r1.f17172m
            boolean r14 = r1.f17170k
            boolean r15 = r1.f17168i
            r16 = r4
            boolean r4 = r1.f17166g
            boolean r0 = r1.f17164e
            r17 = r0
            boolean r0 = r1.f17162c
            r18 = r0
            boolean r0 = r1.f17160a
            if (r0 != 0) goto L1c5
            if (r18 != 0) goto L1c5
            if (r17 != 0) goto L1c5
            if (r4 != 0) goto L1c5
            if (r15 != 0) goto L1c5
            if (r14 != 0) goto L1c5
            if (r13 != 0) goto L1c5
            if (r12 != 0) goto L1c5
            if (r11 != 0) goto L1c5
            if (r10 != 0) goto L1c5
            if (r9 != 0) goto L1c5
            if (r3 == 0) goto L1b7
            goto L1c5
        L1b7:
            java.lang.String r0 = "请选择要应用的配置"
            r3 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r8, r0, r3)
            r0.show()
            r21 = r2
            goto L4ed
        L1c5:
            java.lang.Object r19 = r7.getValue()
            java.util.List r19 = (java.util.List) r19
            r20 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r21 = r2
            int r2 = tf.n.e1(r19)
            r0.<init>(r2)
            java.util.Iterator r2 = r19.iterator()
        L1dc:
            boolean r19 = r2.hasNext()
            if (r19 == 0) goto L4db
            java.lang.Object r19 = r2.next()
            r41 = r19
            e9.c r41 = (e9.c) r41
            r41.getClass()
            r78 = r2
            if (r20 == 0) goto L228
            boolean r2 = r1.f17161b
            r64 = 0
            r65 = 8388575(0x7fffdf, float:1.1754897E-38)
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r57 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r63 = 0
            r47 = r2
            e9.c r41 = e9.c.a(r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65)
        L228:
            r42 = r41
            if (r18 == 0) goto L263
            boolean r2 = r1.f17163d
            r49 = r2 ^ 1
            r65 = 0
            r66 = 8388543(0x7fffbf, float:1.1754852E-38)
            r43 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r57 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r63 = 0
            r64 = 0
            e9.c r42 = e9.c.a(r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66)
        L263:
            r43 = r42
            if (r17 == 0) goto L29e
            boolean r2 = r1.f17165f
            r66 = 0
            r67 = 8388479(0x7fff7f, float:1.1754763E-38)
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r57 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r63 = 0
            r64 = 0
            r65 = 0
            r51 = r2
            e9.c r43 = e9.c.a(r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67)
        L29e:
            r44 = r43
            if (r4 == 0) goto L2d9
            boolean r2 = r1.f17167h
            r67 = 0
            r68 = 8388351(0x7ffeff, float:1.1754583E-38)
            r45 = 0
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r57 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r63 = 0
            r64 = 0
            r65 = 0
            r66 = 0
            r53 = r2
            e9.c r44 = e9.c.a(r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68)
        L2d9:
            r45 = r44
            if (r15 == 0) goto L314
            boolean r2 = r1.f17169j
            r68 = 0
            r69 = 8388095(0x7ffdff, float:1.1754225E-38)
            r46 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r56 = 0
            r57 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r63 = 0
            r64 = 0
            r65 = 0
            r66 = 0
            r67 = 0
            r55 = r2
            e9.c r45 = e9.c.a(r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69)
        L314:
            r46 = r45
            if (r14 == 0) goto L34f
            boolean r2 = r1.f17171l
            r69 = 0
            r70 = 8387583(0x7ffbff, float:1.1753507E-38)
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r63 = 0
            r64 = 0
            r65 = 0
            r66 = 0
            r67 = 0
            r68 = 0
            r57 = r2
            e9.c r46 = e9.c.a(r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70)
        L34f:
            r47 = r46
            if (r13 == 0) goto L38a
            boolean r2 = r1.f17173n
            r70 = 0
            r71 = 8386559(0x7ff7ff, float:1.1752072E-38)
            r48 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r57 = 0
            r58 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r63 = 0
            r64 = 0
            r65 = 0
            r66 = 0
            r67 = 0
            r68 = 0
            r69 = 0
            r59 = r2
            e9.c r47 = e9.c.a(r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71)
        L38a:
            r48 = r47
            if (r12 == 0) goto L3c5
            boolean r2 = r1.f17175p
            r71 = 0
            r72 = 8384511(0x7fefff, float:1.1749202E-38)
            r49 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r57 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            r62 = 0
            r63 = 0
            r64 = 0
            r65 = 0
            r66 = 0
            r67 = 0
            r68 = 0
            r69 = 0
            r70 = 0
            r61 = r2
            e9.c r48 = e9.c.a(r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72)
        L3c5:
            r49 = r48
            if (r11 == 0) goto L400
            boolean r2 = r1.f17177r
            r72 = 0
            r73 = 8380415(0x7fdfff, float:1.1743463E-38)
            r50 = 0
            r51 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r57 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r64 = 0
            r65 = 0
            r66 = 0
            r67 = 0
            r68 = 0
            r69 = 0
            r70 = 0
            r71 = 0
            r63 = r2
            e9.c r49 = e9.c.a(r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73)
        L400:
            r50 = r49
            if (r10 == 0) goto L43b
            boolean r2 = r1.f17179t
            r73 = 0
            r74 = 8372223(0x7fbfff, float:1.1731983E-38)
            r51 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r57 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r63 = 0
            r64 = 0
            r66 = 0
            r67 = 0
            r68 = 0
            r69 = 0
            r70 = 0
            r71 = 0
            r72 = 0
            r65 = r2
            e9.c r50 = e9.c.a(r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74)
        L43b:
            r51 = r50
            if (r9 == 0) goto L489
            boolean r2 = r1.f17181v
            java.util.Set r19 = e9.s.f2475b
            r67 = r2
            java.lang.String r2 = r1.f17182w
            r19 = r3
            java.lang.String r3 = "23:00:00"
            java.lang.String r68 = e9.r.e(r2, r3)
            java.lang.String r2 = r1.f17183x
            java.lang.String r3 = "07:00:00"
            java.lang.String r69 = e9.r.e(r2, r3)
            r74 = 0
            r75 = 8159231(0x7c7fff, float:1.1433518E-38)
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r57 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r63 = 0
            r64 = 0
            r65 = 0
            r66 = 0
            r70 = 0
            r71 = 0
            r72 = 0
            r73 = 0
            e9.c r51 = e9.c.a(r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75)
        L486:
            r2 = r51
            goto L48c
        L489:
            r19 = r3
            goto L486
        L48c:
            if (r19 == 0) goto L4ce
            boolean r3 = r2.f2393d
            if (r3 == 0) goto L4ce
            boolean r3 = r1.f17185z
            r52 = r2
            boolean r2 = r1.A
            r75 = 0
            r76 = 6815743(0x67ffff, float:9.55089E-39)
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r57 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r63 = 0
            r64 = 0
            r65 = 0
            r66 = 0
            r67 = 0
            r68 = 0
            r69 = 0
            r70 = 0
            r71 = 0
            r74 = 0
            r73 = r2
            r72 = r3
            e9.c r2 = e9.c.a(r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76)
            goto L4d2
        L4ce:
            r52 = r2
            r2 = r52
        L4d2:
            r0.add(r2)
            r2 = r78
            r3 = r19
            goto L1dc
        L4db:
            wb.ho.m0(r5, r7, r0)
            java.lang.String r0 = "批量配置已应用"
            r3 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r8, r0, r3)
            r0.show()
            wb.m2 r0 = wb.m2.f17592c
            r6.setValue(r0)
        L4ed:
            return r21
    }
}
