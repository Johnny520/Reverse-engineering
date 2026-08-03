package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class y2 implements wb.kv {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final wb.y2 f20283h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final wb.y2 f20284i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final wb.y2 f20285j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final wb.y2 f20286k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final wb.y2 f20287l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final wb.y2 f20288m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final wb.y2 f20289n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final wb.y2 f20290o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final wb.y2 f20291p = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f20292g;

    static {
            wb.y2 r0 = new wb.y2
            r1 = 0
            r0.<init>(r1)
            wb.y2.f20283h = r0
            wb.y2 r0 = new wb.y2
            r1 = 1
            r0.<init>(r1)
            wb.y2.f20284i = r0
            wb.y2 r0 = new wb.y2
            r1 = 2
            r0.<init>(r1)
            wb.y2.f20285j = r0
            wb.y2 r0 = new wb.y2
            r1 = 3
            r0.<init>(r1)
            wb.y2.f20286k = r0
            wb.y2 r0 = new wb.y2
            r1 = 4
            r0.<init>(r1)
            wb.y2.f20287l = r0
            wb.y2 r0 = new wb.y2
            r1 = 5
            r0.<init>(r1)
            wb.y2.f20288m = r0
            wb.y2 r0 = new wb.y2
            r1 = 6
            r0.<init>(r1)
            wb.y2.f20289n = r0
            wb.y2 r0 = new wb.y2
            r1 = 7
            r0.<init>(r1)
            wb.y2.f20290o = r0
            wb.y2 r0 = new wb.y2
            r1 = 8
            r0.<init>(r1)
            wb.y2.f20291p = r0
            return
    }

    public /* synthetic */ y2(int r1) {
            r0 = this;
            r0.f20292g = r1
            r0.<init>()
            return
    }

    public static final void A0(android.content.Context r25, i0.j1 r26, i0.a1 r27, i0.j1 r28, i0.a1 r29, i0.j1 r30, i0.j1 r31, i0.j1 r32, i0.j1 r33, i0.j1 r34, i0.j1 r35, i0.j1 r36, i0.a1 r37, i0.a1 r38, i0.a1 r39, i0.a1 r40, i0.a1 r41, i0.a1 r42, i0.a1 r43, i0.a1 r44, i0.a1 r45, i0.a1 r46, i0.a1 r47, i0.a1 r48, i0.a1 r49, i0.a1 r50, i0.a1 r51, i0.a1 r52, i0.a1 r53, i0.a1 r54, i0.a1 r55, i0.a1 r56, i0.a1 r57, java.lang.String r58, wb.yt r59, i0.a1 r60) {
            r1 = r25
            java.lang.Object r0 = r26.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lf6
            boolean r0 = J0(r27)
            if (r0 != 0) goto Lf6
            java.lang.Object r0 = r28.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L22
            goto Lf6
        L22:
            boolean r0 = w1(r29, r30, r31, r32, r33, r34, r35, r36)
            if (r0 == 0) goto L2a
            goto Lf6
        L2a:
            java.lang.Object r0 = r37.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Object r2 = r38.getValue()
            java.util.List r2 = (java.util.List) r2
            int r2 = r2.size()
            r3 = 0
            int r0 = r9.e0.r(r0, r3, r2)
            java.lang.Object r2 = r38.getValue()
            java.util.List r2 = (java.util.List) r2
            java.util.List r2 = tf.m.q1(r0, r2)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L5d
            java.lang.String r0 = "没有需要压缩的新上下文"
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r3)
            r0.show()
            return
        L5d:
            fb.v r6 = B0(r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            java.lang.Object r0 = r49.getValue()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r4 = r50.getValue()
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r51.getValue()
            fb.y r4 = (fb.y) r4
            java.lang.Object r7 = r52.getValue()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r38.getValue()
            java.util.List r8 = (java.util.List) r8
            int r15 = r8.size()
            java.util.UUID r8 = java.util.UUID.randomUUID()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "compact:"
            r9.<init>(r10)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            fb.b r8 = new fb.b
            r8.<init>()
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            r11 = r27
            r11.setValue(r10)
            long r12 = java.lang.System.currentTimeMillis()
            r10 = r53
            L0(r10, r12)
            r12 = r54
            r12.setValue(r9)
            r13 = -1
            r14 = r55
            T0(r14, r13)
            r13 = r56
            r13.setValue(r8)
            r26 = r0
            java.lang.String r0 = "正在压缩上下文"
            android.widget.Toast r0 = android.widget.Toast.makeText(r1, r0, r3)
            r0.show()
            java.lang.Thread r0 = new java.lang.Thread
            r3 = r0
            wb.zs r0 = new wb.zs
            r16 = r12
            r12 = r10
            r10 = r16
            r16 = r14
            r14 = r13
            r13 = r16
            r20 = r37
            r19 = r38
            r16 = r49
            r18 = r50
            r17 = r57
            r21 = r58
            r22 = r59
            r23 = r60
            r24 = r3
            r3 = r26
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.String r1 = "Hchat-Script-Agent-Compact"
            r3 = r24
            r3.<init>(r0, r1)
            r3.start()
        Lf6:
            return
    }

    public static void A1(i0.a1 r2, i0.a1 r3, i0.a1 r4, java.lang.String r5, java.lang.Long r6, java.lang.Long r7, int r8) {
            r0 = r8 & 16
            r1 = 0
            if (r0 == 0) goto L6
            r6 = r1
        L6:
            r8 = r8 & 32
            if (r8 == 0) goto Lb
            r7 = r1
        Lb:
            java.lang.Object r8 = r2.getValue()
            gb.o r8 = (gb.o) r8
            if (r8 == 0) goto L20
            java.lang.String r0 = r8.f4449a
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L21
            gb.o r8 = B1(r6, r7, r8)
            goto L21
        L20:
            r8 = r1
        L21:
            r2.setValue(r8)
            java.lang.Object r2 = r3.getValue()
            gb.o r2 = (gb.o) r2
            if (r2 == 0) goto L39
            java.lang.String r8 = r2.f4449a
            boolean r8 = r8.equals(r5)
            if (r8 == 0) goto L38
            gb.o r2 = B1(r6, r7, r2)
        L38:
            r1 = r2
        L39:
            r3.setValue(r1)
            java.lang.Object r2 = r4.getValue()
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            int r8 = tf.n.e1(r2)
            r3.<init>(r8)
            java.util.Iterator r2 = r2.iterator()
        L4f:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L6b
            java.lang.Object r8 = r2.next()
            gb.o r8 = (gb.o) r8
            java.lang.String r0 = r8.f4449a
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L67
            gb.o r8 = B1(r6, r7, r8)
        L67:
            r3.add(r8)
            goto L4f
        L6b:
            r4.setValue(r3)
            return
    }

    public static final fb.v B0(i0.a1 r12, i0.a1 r13, i0.a1 r14, i0.a1 r15, i0.a1 r16, i0.a1 r17, i0.a1 r18, i0.a1 r19, i0.a1 r20, i0.a1 r21) {
            fb.v r0 = new fb.v
            java.lang.Object r12 = r12.getValue()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r1 = r13.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = ""
            java.lang.String r1 = fb.w.p(r12, r1, r2)
            java.lang.Object r12 = r14.getValue()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.CharSequence r12 = og.m.R0(r12)
            java.lang.String r3 = r12.toString()
            java.lang.Object r12 = r15.getValue()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.CharSequence r12 = og.m.R0(r12)
            java.lang.String r4 = r12.toString()
            java.lang.Object r12 = r16.getValue()
            r5 = r12
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r12 = r17.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r6 = r12.booleanValue()
            java.lang.Object r12 = r18.getValue()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Integer r12 = og.t.f0(r12)
            if (r12 == 0) goto L5c
            int r12 = r12.intValue()
            r14 = 2000(0x7d0, float:2.803E-42)
            r15 = 1000000(0xf4240, float:1.401298E-39)
            int r12 = r9.e0.r(r12, r14, r15)
        L5a:
            r7 = r12
            goto L5f
        L5c:
            r12 = 24000(0x5dc0, float:3.3631E-41)
            goto L5a
        L5f:
            java.lang.Object r12 = r19.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r8 = r12.booleanValue()
            java.lang.Object r12 = r20.getValue()
            r9 = r12
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r12 = r21.getValue()
            r10 = r12
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r12 = r13.getValue()
            r11 = r12
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r2 = ""
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
    }

    public static final gb.o B1(java.lang.Long r10, java.lang.Long r11, gb.o r12) {
            if (r10 == 0) goto L8
            long r0 = r10.longValue()
        L6:
            r5 = r0
            goto Lb
        L8:
            long r0 = r12.f4457i
            goto L6
        Lb:
            if (r11 == 0) goto L13
            long r10 = r11.longValue()
        L11:
            r7 = r10
            goto L16
        L13:
            long r10 = r12.f4458j
            goto L11
        L16:
            r9 = 3327(0xcff, float:4.662E-42)
            r3 = 0
            r2 = r12
            gb.o r10 = gb.o.a(r2, r3, r5, r7, r9)
            return r10
    }

    public static fb.d1 C0(wb.yt r2) {
            long r0 = java.lang.System.currentTimeMillis()
            fb.d1 r2 = r2.M(r0)
            return r2
    }

    public static final void D0(int r13, android.content.Context r14, i0.a1 r15, i0.a1 r16, i0.a1 r17, i0.a1 r18, i0.a1 r19, i0.j1 r20, java.lang.String r21, java.lang.String r22, wb.yt r23) {
            java.lang.Object r0 = r20.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Ld
            return
        Ld:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r9 = r20
            r9.setValue(r0)
            java.lang.String r0 = "正在删除插件: "
            r10 = r22
            java.lang.String r7 = r0.concat(r10)
            r6 = r13
            r3 = r14
            r1 = r15
            r5 = r16
            r2 = r21
            r4 = r23
            p1(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Thread r0 = new java.lang.Thread
            wb.nr r1 = new wb.nr
            r2 = r13
            r7 = r15
            r8 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r11 = r21
            r12 = r23
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            java.lang.String r13 = "Hchat-Script-Agent-Delete"
            r0.<init>(r1, r13)
            r0.start()
            return
    }

    public static final void E0(android.content.Context r6, java.util.List r7) {
            dg.n r0 = new dg.n
            r1 = 6
            r0.<init>(r7, r1)
            wb.sr r7 = new wb.sr
            r2 = 5
            r7.<init>(r2)
            dg.j r2 = new dg.j
            ng.q r3 = ng.q.f9453n
            r2.<init>(r0, r7, r3)
            wb.sr r7 = new wb.sr
            r7.<init>(r1)
            ng.t r7 = ng.m.W(r2, r7)
            wb.sr r0 = new wb.sr
            r1 = 7
            r0.<init>(r1)
            ng.i r1 = new ng.i
            r2 = 1
            r1.<init>(r7, r2, r0)
            ng.c r7 = ng.m.S(r1)
            java.util.Iterator r7 = r7.iterator()
        L30:
            r0 = r7
            tf.b r0 = (tf.b) r0
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L99
            java.lang.Object r0 = r0.next()
            java.lang.String r0 = (java.lang.String) r0
            r6.getClass()
            r0.getClass()
            char[] r1 = new char[r2]
            r3 = 58
            r4 = 0
            r1[r4] = r3
            r3 = 2
            java.util.List r0 = og.m.F0(r0, r1, r3)
            int r1 = r0.size()
            if (r1 == r3) goto L58
            goto L30
        L58:
            java.lang.Object r1 = r0.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r9.e0.j0(r1)
            java.lang.Object r3 = r0.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = r9.e0.j0(r3)
            java.lang.Object r4 = r0.get(r4)
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L30
            java.lang.Object r0 = r0.get(r2)
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L81
            goto L30
        L81:
            java.io.File r0 = new java.io.File
            java.io.File r4 = new java.io.File
            java.io.File r5 = r9.e0.i0(r6)
            r4.<init>(r5, r1)
            java.lang.String r1 = ".txt"
            java.lang.String r1 = r3.concat(r1)
            r0.<init>(r4, r1)
            r0.delete()
            goto L30
        L99:
            return
    }

    public static final void E1(android.content.Context r13, gb.o r14, i0.a1 r15, i0.a1 r16, i0.a1 r17, i0.a1 r18, i0.a1 r19, i0.a1 r20, i0.a1 r21, qg.t r22) {
            java.lang.Object r0 = r15.getValue()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L9
            return
        L9:
            java.lang.String r0 = r14.f4449a
            r15.setValue(r0)
            java.lang.String r0 = ""
            r7 = r16
            r7.setValue(r0)
            wb.bq r1 = new wb.bq
            r12 = 0
            r3 = r13
            r2 = r14
            r4 = r15
            r5 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            r6 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13 = 3
            r14 = 0
            qg.v.q(r6, r14, r1, r13)
            return
    }

    public static final void F0(android.content.Context r3, fb.c1 r4) {
            if (r4 == 0) goto L17
            fb.j2 r4 = r4.f3453e
            if (r4 == 0) goto L17
            java.lang.Thread r0 = new java.lang.Thread
            rb.g r1 = new rb.g
            r2 = 17
            r1.<init>(r3, r2, r4)
            java.lang.String r3 = "Hchat-Script-Agent-Workspace-Discard"
            r0.<init>(r1, r3)
            r0.start()
        L17:
            return
    }

    public static wb.y4 F1(i2.d r30, java.lang.String r31, long r32, wb.y4 r34) {
            r1 = r30
            r0 = r31
            java.lang.StringBuilder r7 = r1.f6259g
            r8 = 0
            r5 = r34
            r9 = r8
        La:
            int r2 = r0.length()
            if (r9 >= r2) goto L8c
            java.lang.String r2 = "**"
            boolean r2 = og.t.c0(r0, r2, r9, r8)
            if (r2 == 0) goto L25
            boolean r2 = r5.f20294a
            r2 = r2 ^ 1
            wb.y4 r3 = new wb.y4
            r3.<init>(r2)
            int r9 = r9 + 2
            r5 = r3
            goto L88
        L25:
            char r2 = r0.charAt(r9)
            r3 = 96
            if (r2 != r3) goto L77
            int r2 = r9 + 1
            r4 = 4
            int r3 = og.m.q0(r0, r3, r2, r4)
            if (r3 <= r9) goto L6f
            i2.f0 r10 = new i2.f0
            r28 = 0
            r29 = 65502(0xffde, float:9.1788E-41)
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            m2.m r18 = m2.p.f8705b
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r11 = r32
            r10.<init>(r11, r13, r15, r16, r17, r18, r19, r20, r22, r23, r24, r25, r27, r28, r29)
            int r4 = r1.d(r10)
            java.lang.String r2 = r0.substring(r2, r3)     // Catch: java.lang.Throwable -> L6a
            r7.append(r2)     // Catch: java.lang.Throwable -> L6a
            r1.c(r4)
            int r2 = r3 + 1
            goto L87
        L6a:
            r0 = move-exception
            r1.c(r4)
            throw r0
        L6f:
            char r3 = r0.charAt(r9)
            r7.append(r3)
            goto L87
        L77:
            char r2 = r0.charAt(r9)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r6 = 0
            r3 = r32
            G1(r1, r2, r3, r5, r6)
            int r2 = r9 + 1
        L87:
            r9 = r2
        L88:
            r1 = r30
            goto La
        L8c:
            return r5
    }

    public static final fb.y G0(java.util.List r4) {
            og.g r0 = new og.g
            r0.<init>(r4)
            java.util.Iterator r4 = r0.iterator()
        L9:
            r0 = r4
            tf.z r0 = (tf.z) r0
            java.lang.Object r0 = r0.f13173h
            java.util.ListIterator r0 = (java.util.ListIterator) r0
            boolean r1 = r0.hasPrevious()
            r2 = 0
            if (r1 == 0) goto L2d
            java.lang.Object r0 = r0.previous()
            r1 = r0
            fb.c r1 = (fb.c) r1
            fb.y r3 = r1.f3445o
            if (r3 != 0) goto L29
            boolean r1 = r1.f3446p
            if (r1 == 0) goto L27
            goto L29
        L27:
            r1 = 0
            goto L2a
        L29:
            r1 = 1
        L2a:
            if (r1 == 0) goto L9
            goto L2e
        L2d:
            r0 = r2
        L2e:
            fb.c r0 = (fb.c) r0
            if (r0 == 0) goto L35
            fb.y r4 = r0.f3445o
            return r4
        L35:
            return r2
    }

    public static void G1(i2.d r22, java.lang.String r23, long r24, wb.y4 r26, boolean r27) {
            r1 = r22
            i2.f0 r2 = new i2.f0
            if (r27 == 0) goto L9
            r3 = r24
            goto Lb
        L9:
            long r3 = f1.w.f3131g
        Lb:
            if (r27 == 0) goto L11
            m2.k r0 = m2.k.f8698j
        Lf:
            r7 = r0
            goto L1c
        L11:
            r0 = r26
            boolean r0 = r0.f20294a
            if (r0 == 0) goto L1a
            m2.k r0 = m2.k.f8699k
            goto Lf
        L1a:
            r0 = 0
            goto Lf
        L1c:
            r20 = 0
            r21 = 65530(0xfffa, float:9.1827E-41)
            r5 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r2.<init>(r3, r5, r7, r8, r9, r10, r11, r12, r14, r15, r16, r17, r19, r20, r21)
            int r2 = r1.d(r2)
            java.lang.StringBuilder r0 = r1.f6259g     // Catch: java.lang.Throwable -> L43
            r3 = r23
            r0.append(r3)     // Catch: java.lang.Throwable -> L43
            r1.c(r2)
            return
        L43:
            r0 = move-exception
            r1.c(r2)
            throw r0
    }

    public static final boolean H(i0.a1 r0) {
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public static final java.lang.String H0(fb.v r1) {
            boolean r0 = fb.w.l(r1)
            if (r0 == 0) goto L9
            java.lang.String r1 = ""
            return r1
        L9:
            java.lang.String r1 = r1.f3833k
            java.lang.String r0 = "custom_url"
            boolean r1 = gg.l.a(r1, r0)
            if (r1 == 0) goto L16
            java.lang.String r1 = "请填写完整的 HTTP(S) 请求链接"
            return r1
        L16:
            java.lang.String r1 = "API 地址无效"
            return r1
    }

    public static sf.e H1(java.lang.String r5) {
            java.lang.String r5 = a7.a.j(r5)
            int r0 = r5.length()
            java.lang.String r1 = ""
            if (r0 != 0) goto L12
            sf.e r5 = new sf.e
            r5.<init>(r1, r1)
            return r5
        L12:
            r0 = 1
            char[] r2 = new char[r0]
            r3 = 44
            r4 = 0
            r2[r4] = r3
            r3 = 6
            java.util.List r5 = og.m.F0(r5, r2, r3)
            r2 = 2
            java.util.List r5 = tf.m.L1(r2, r5)
            int r2 = r5.size()
            if (r2 <= 0) goto L2f
            java.lang.Object r2 = r5.get(r4)
            goto L30
        L2f:
            r2 = r1
        L30:
            int r3 = r5.size()
            if (r0 >= r3) goto L3a
            java.lang.Object r1 = r5.get(r0)
        L3a:
            sf.e r5 = new sf.e
            r5.<init>(r2, r1)
            return r5
    }

    public static final boolean I0(i0.a1 r0, i0.a1 r1, i0.a1 r2, i0.a1 r3) {
            java.lang.Object r0 = r0.getValue()
            wb.au r0 = (wb.au) r0
            if (r0 != 0) goto L23
            java.lang.Object r0 = r1.getValue()
            wb.st r0 = (wb.st) r0
            if (r0 != 0) goto L23
            java.lang.Object r0 = r2.getValue()
            wb.tt r0 = (wb.tt) r0
            if (r0 != 0) goto L23
            java.lang.Object r0 = r3.getValue()
            wb.qt r0 = (wb.qt) r0
            if (r0 == 0) goto L21
            goto L23
        L21:
            r0 = 0
            return r0
        L23:
            r0 = 1
            return r0
    }

    public static java.lang.String I1(java.lang.String r1, java.lang.String r2) {
            java.lang.String r1 = a7.a.i(r1)
            java.lang.String r2 = a7.a.i(r2)
            int r0 = r1.length()
            if (r0 != 0) goto L11
            java.lang.String r1 = ""
            return r1
        L11:
            int r0 = r2.length()
            if (r0 != 0) goto L18
            goto L1e
        L18:
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L1f
        L1e:
            return r1
        L1f:
            java.lang.String r0 = ","
            java.lang.String r1 = wb.en.h(r1, r0, r2)
            return r1
    }

    public static final boolean J0(i0.a1 r0) {
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public static java.lang.String J1(int r2) {
            int r2 = r2 / 1000
            if (r2 >= 0) goto L5
            r2 = 0
        L5:
            int r0 = r2 / 60
            int r2 = r2 % 60
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r0, r2}
            r0 = 2
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r0)
            java.lang.String r0 = "%d:%02d"
            java.lang.String r2 = java.lang.String.format(r1, r0, r2)
            return r2
    }

    public static final long K0(i0.j1 r2) {
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            long r0 = r2.longValue()
            return r0
    }

    public static wb.lv K1(java.lang.String r1) {
            if (r1 == 0) goto L13
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L13
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = j8.b.l(r0, r1, r0)
            goto L14
        L13:
            r1 = 0
        L14:
            if (r1 == 0) goto L6c
            int r0 = r1.hashCode()
            switch(r0) {
                case -1364013995: goto L60;
                case -1364013605: goto L57;
                case -1074341483: goto L4e;
                case 115029: goto L42;
                case 645359: goto L39;
                case 658791: goto L30;
                case 752264: goto L27;
                case 1247026: goto L1e;
                default: goto L1d;
            }
        L1d:
            goto L6c
        L1e:
            java.lang.String r0 = "顶部"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L4b
            goto L6c
        L27:
            java.lang.String r0 = "居中"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L69
            goto L6c
        L30:
            java.lang.String r0 = "中间"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L69
            goto L6c
        L39:
            java.lang.String r0 = "上方"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L4b
            goto L6c
        L42:
            java.lang.String r0 = "top"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L4b
            goto L6c
        L4b:
            wb.lv r1 = wb.lv.f17581h
            return r1
        L4e:
            java.lang.String r0 = "middle"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L69
            goto L6c
        L57:
            java.lang.String r0 = "centre"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L69
            goto L6c
        L60:
            java.lang.String r0 = "center"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L69
            goto L6c
        L69:
            wb.lv r1 = wb.lv.f17582i
            return r1
        L6c:
            wb.lv r1 = wb.lv.f17583j
            return r1
    }

    public static final void L0(i0.a1 r0, long r1) {
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.setValue(r1)
            return
    }

    public static final boolean M0(i0.a1 r0) {
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public static boolean M1(fb.q1 r2) {
            java.lang.String r0 = r2.f3723c
            java.lang.String r1 = "写入插件文件"
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L5b
            java.lang.String r0 = r2.f3723c
            java.lang.String r1 = "修改插件文件"
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L15
            goto L5b
        L15:
            java.lang.String r0 = r2.f3722b
            java.lang.String r1 = "workspace"
            boolean r0 = gg.l.a(r0, r1)
            r1 = 0
            if (r0 != 0) goto L21
            goto L5a
        L21:
            java.lang.String r2 = r2.f3733m
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = j8.b.l(r0, r2, r0)
            java.lang.String r0 = "write_file"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L5b
            java.lang.String r0 = "apply_patch"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L5b
            java.lang.String r0 = ".write_file"
            boolean r0 = og.t.W(r2, r0, r1)
            if (r0 != 0) goto L5b
            java.lang.String r0 = ".apply_patch"
            boolean r0 = og.t.W(r2, r0, r1)
            if (r0 != 0) goto L5b
            java.lang.String r0 = "_write_file"
            boolean r0 = og.t.W(r2, r0, r1)
            if (r0 != 0) goto L5b
            java.lang.String r0 = "_apply_patch"
            boolean r2 = og.t.W(r2, r0, r1)
            if (r2 == 0) goto L5a
            goto L5b
        L5a:
            return r1
        L5b:
            r2 = 1
            return r2
    }

    public static final boolean N0(i0.j1 r0) {
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public static java.lang.String N1(java.lang.String r1, java.lang.String r2) {
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            boolean r0 = og.m.t0(r2)
            if (r0 == 0) goto Lf
            return r1
        Lf:
            return r2
    }

    public static final void O0(i0.a1 r0, boolean r1) {
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.setValue(r1)
            return
    }

    public static java.lang.String O1(java.lang.String r2) {
            java.lang.String r0 = "\\s+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r0.getClass()
            java.lang.String r1 = " "
            java.util.regex.Matcher r2 = r0.matcher(r2)
            java.lang.String r2 = r2.replaceAll(r1)
            r2.getClass()
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public static final java.lang.Integer P(i0.a1 r4, java.util.List r5) {
            java.lang.Object r0 = r4.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            r4.setValue(r1)
            if (r0 == 0) goto L35
            java.util.Iterator r4 = r5.iterator()
            r5 = 0
            r2 = r5
        L12:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r4.next()
            fb.c r3 = (fb.c) r3
            java.lang.String r3 = r3.f3433c
            boolean r3 = gg.l.a(r3, r0)
            if (r3 == 0) goto L27
            goto L2b
        L27:
            int r2 = r2 + 1
            goto L12
        L2a:
            r2 = -1
        L2b:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            if (r2 < 0) goto L32
            r5 = 1
        L32:
            if (r5 == 0) goto L35
            return r4
        L35:
            return r1
    }

    public static final boolean P0(i0.j1 r0) {
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public static wb.kv P1(android.app.Activity r13, fg.a r14, s0.d r15) {
            android.view.Window r0 = r13.getWindow()
            r1 = 0
            if (r0 == 0) goto Lc
            android.view.View r0 = r0.getDecorView()
            goto Ld
        Lc:
            r0 = r1
        Ld:
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 == 0) goto L14
            r1 = r0
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
        L14:
            r8 = r1
            if (r8 == 0) goto Lb7
            c9.a1 r1 = new c9.a1
            r0 = 5
            r1.<init>(r0)
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 0
            r3.<init>(r0)
            android.widget.FrameLayout r6 = new android.widget.FrameLayout
            r6.<init>(r13)
            r6.setBackgroundColor(r0)
            r11 = 1
            r6.setClickable(r11)
            r6.setFocusable(r11)
            r6.setFocusableInTouchMode(r11)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r12 = -1
            r0.<init>(r12, r12)
            r6.setLayoutParams(r0)
            x6.d.H(r8, r1, r1, r1, r1)
            x6.d.H(r6, r1, r1, r1, r1)
            boolean r0 = r1.f1100l
            if (r0 != 0) goto L51
            p4.t r0 = r1.f1097i
            android.os.Bundle r2 = android.os.Bundle.EMPTY
            r0.F(r2)
            r1.f1100l = r11
        L51:
            androidx.lifecycle.s r0 = r1.f1096h
            java.lang.String r2 = "setCurrentState"
            r0.c(r2)
            androidx.lifecycle.l r4 = androidx.lifecycle.l.f291i
            r0.e(r4)
            r0.c(r2)
            androidx.lifecycle.l r4 = androidx.lifecycle.l.f292j
            r0.e(r4)
            r0.c(r2)
            androidx.lifecycle.l r2 = androidx.lifecycle.l.f293k
            r0.e(r2)
            gg.u r5 = new gg.u
            r5.<init>()
            wb.n7 r2 = new wb.n7
            r10 = 5
            r4 = r13
            r9 = r14
            r7 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r4 = r2
            r2 = r13
            r13 = r3
            r14 = r5
            y1.c1 r7 = new y1.c1
            r7.<init>(r2)
            x6.d.H(r7, r1, r1, r1, r1)
            y1.r1 r0 = y1.r1.f22061h
            r7.setViewCompositionStrategy(r0)
            c9.q0 r0 = new c9.q0
            r5 = 29
            r3 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            s0.d r15 = new s0.d
            r1 = -2121931934(0xffffffff8185e362, float:-4.918276E-38)
            r15.<init>(r1, r0, r11)
            r7.setContent(r15)
            r14.f4564g = r7
            android.widget.FrameLayout$LayoutParams r14 = new android.widget.FrameLayout$LayoutParams
            r14.<init>(r12, r12)
            r6.addView(r7, r14)
            r8.addView(r6)
            r6.requestFocus()
            p4.t r14 = new p4.t
            r15 = 15
            r14.<init>(r4, r15, r13)
            return r14
        Lb7:
            wb.y2 r13 = wb.y2.f20290o
            return r13
    }

    public static final void Q(i0.a1 r0, boolean r1) {
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.setValue(r1)
            return
    }

    public static final boolean Q0(i0.j1 r0) {
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public static wb.kv Q1(android.app.Activity r8, java.lang.String r9, java.lang.String r10, java.util.List r11, fg.l r12, fg.a r13, wb.lv r14) {
            r8.getClass()
            r9.getClass()
            r10.getClass()
            r11.getClass()
            wb.qu r0 = new wb.qu
            r7 = 1
            r5 = r8
            r1 = r9
            r3 = r10
            r4 = r11
            r6 = r12
            r2 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            s0.d r8 = new s0.d
            r9 = 1020194076(0x3cceed1c, float:0.025259547)
            r10 = 1
            r8.<init>(r9, r0, r10)
            wb.kv r8 = P1(r5, r13, r8)
            return r8
    }

    public static final boolean R0(i0.j1 r0) {
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public static /* synthetic */ wb.kv R1(android.app.Activity r7, java.lang.String r8, java.lang.String r9, java.util.List r10, fg.l r11, fg.a r12) {
            wb.lv r6 = wb.lv.f17583j
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            wb.kv r7 = Q1(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static final void S0(i0.a1 r0, boolean r1) {
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.setValue(r1)
            return
    }

    public static wb.kv S1(android.app.Activity r9, java.lang.String r10, java.lang.String r11, fg.l r12, fg.a r13, wb.lv r14) {
            r9.getClass()
            java.util.concurrent.atomic.AtomicBoolean r4 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 0
            r4.<init>(r0)
            wb.zh r8 = new wb.zh
            r0 = 13
            r8.<init>(r4, r12, r13, r0)
            wb.e1 r0 = new wb.e1
            r7 = 15
            r5 = r9
            r1 = r10
            r3 = r11
            r6 = r12
            r2 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            s0.d r9 = new s0.d
            r10 = 380283272(0x16aaa988, float:2.757197E-25)
            r11 = 1
            r9.<init>(r10, r0, r11)
            wb.kv r9 = P1(r5, r8, r9)
            return r9
    }

    public static final void T0(i0.a1 r0, int r1) {
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.setValue(r1)
            return
    }

    public static /* synthetic */ void T1(android.app.Activity r6, java.lang.String r7, java.lang.String r8, fg.l r9, fg.a r10) {
            wb.lv r5 = wb.lv.f17583j
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            S1(r0, r1, r2, r3, r4, r5)
            return
    }

    public static final int U0(i0.a1 r0) {
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            return r0
    }

    public static void U1(android.app.Activity r15, java.util.List r16, fg.l r17, fg.a r18, java.lang.String r19, java.lang.String r20, boolean r21, c9.v r22, java.util.Set r23, boolean r24, int r25) {
            r0 = r25
            r1 = r0 & 16
            if (r1 == 0) goto La
            java.lang.String r1 = "选择转发对象"
            r3 = r1
            goto Lc
        La:
            r3 = r19
        Lc:
            r1 = r0 & 32
            if (r1 == 0) goto L14
            java.lang.String r1 = "发送"
            r9 = r1
            goto L16
        L14:
            r9 = r20
        L16:
            r1 = r0 & 64
            r14 = 1
            if (r1 == 0) goto L1d
            r7 = r14
            goto L1f
        L1d:
            r7 = r21
        L1f:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L26
            r1 = 0
            r11 = r1
            goto L28
        L26:
            r11 = r22
        L28:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L30
            tf.v r1 = tf.v.f13169g
            r5 = r1
            goto L32
        L30:
            r5 = r23
        L32:
            r1 = r0 & 512(0x200, float:7.17E-43)
            r2 = 0
            if (r1 == 0) goto L39
            r10 = r2
            goto L3a
        L39:
            r10 = r14
        L3a:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L40
            r6 = r2
            goto L42
        L40:
            r6 = r24
        L42:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L48
            r8 = r2
            goto L49
        L48:
            r8 = r14
        L49:
            r15.getClass()
            r16.getClass()
            r5.getClass()
            wb.wu r2 = new wb.wu
            r12 = r15
            r4 = r16
            r13 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            s0.d r0 = new s0.d
            r1 = -1823380114(0xffffffff93516d6e, float:-2.6433462E-27)
            r0.<init>(r1, r2, r14)
            r1 = r18
            P1(r15, r1, r0)
            return
    }

    public static final int V0(i0.a1 r0) {
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            return r0
    }

    public static void V1(android.app.Activity r6, java.lang.String r7, long r8, fg.l r10, fg.a r11) {
            r6.getClass()
            wb.bd r0 = new wb.bd
            r3 = r6
            r5 = r7
            r1 = r8
            r4 = r10
            r0.<init>(r1, r3, r4, r5)
            s0.d r6 = new s0.d
            r7 = -1324852663(0xffffffffb1085a49, float:-1.9841926E-9)
            r8 = 1
            r6.<init>(r7, r0, r8)
            P1(r3, r11, r6)
            return
    }

    public static final wb.yt W0(i0.a1 r0) {
            java.lang.Object r0 = r0.getValue()
            wb.yt r0 = (wb.yt) r0
            return r0
    }

    public static void W1(android.app.Activity r8, java.lang.String r9, java.lang.String r10, java.util.List r11, fg.l r12, fg.a r13) {
            r8.getClass()
            r9.getClass()
            r10.getClass()
            r11.getClass()
            wb.qu r0 = new wb.qu
            r7 = 0
            wb.lv r2 = wb.lv.f17583j
            r5 = r8
            r1 = r9
            r3 = r10
            r4 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            s0.d r8 = new s0.d
            r9 = 1246407386(0x4a4aaada, float:3320502.5)
            r10 = 1
            r8.<init>(r9, r0, r10)
            P1(r5, r13, r8)
            return
    }

    public static final void X0(i0.a1 r0, int r1) {
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.setValue(r1)
            return
    }

    public static wb.kv X1(android.app.Activity r2, fg.a r3, java.lang.String r4, java.lang.String r5) {
            r2.getClass()
            c9.i0 r0 = new c9.i0
            r1 = 4
            r0.<init>(r1, r4, r5)
            s0.d r4 = new s0.d
            r5 = 1667636580(0x63661d64, float:4.244869E21)
            r1 = 1
            r4.<init>(r5, r0, r1)
            wb.kv r2 = P1(r2, r3, r4)
            return r2
    }

    public static final java.util.ArrayList Y(i0.a1 r4, fb.d1 r5, int r6) {
            java.lang.Object r4 = r4.getValue()
            java.util.List r4 = (java.util.List) r4
            java.util.ArrayList r4 = tf.m.R1(r4)
            java.util.Iterator r0 = r4.iterator()
            r1 = 0
        Lf:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r0.next()
            fb.d1 r2 = (fb.d1) r2
            java.lang.String r2 = r2.f3483a
            java.lang.String r3 = r5.f3483a
            boolean r2 = gg.l.a(r2, r3)
            if (r2 == 0) goto L26
            goto L2a
        L26:
            int r1 = r1 + 1
            goto Lf
        L29:
            r1 = -1
        L2a:
            int r6 = r6 + r1
            if (r1 < 0) goto L58
            int r5 = r4.size()
            if (r1 >= r5) goto L58
            if (r6 < 0) goto L58
            int r5 = r4.size()
            if (r6 >= r5) goto L58
            java.lang.Object r5 = r4.get(r1)
            fb.d1 r5 = (fb.d1) r5
            boolean r5 = r5.f3494l
            java.lang.Object r0 = r4.get(r6)
            fb.d1 r0 = (fb.d1) r0
            boolean r0 = r0.f3494l
            if (r5 == r0) goto L4e
            goto L58
        L4e:
            java.lang.Object r5 = r4.remove(r1)
            fb.d1 r5 = (fb.d1) r5
            r4.add(r6, r5)
            return r4
        L58:
            r4 = 0
            return r4
    }

    public static final java.lang.String Y0(i0.j1 r0) {
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public static wb.kv Y1(android.app.Activity r9, java.lang.String r10, java.lang.String r11, java.util.ArrayList r12, java.util.Set r13, boolean r14, fg.l r15, fg.a r16, wb.lv r17) {
            r9.getClass()
            r13.getClass()
            wb.h1 r0 = new wb.h1
            r7 = r9
            r1 = r10
            r5 = r11
            r3 = r12
            r4 = r13
            r6 = r14
            r8 = r15
            r2 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            s0.d r10 = new s0.d
            r11 = 1178636513(0x464090e1, float:12324.22)
            r12 = 1
            r10.<init>(r11, r0, r12)
            r11 = r16
            wb.kv r9 = P1(r9, r11, r10)
            return r9
    }

    public static final java.util.List Z0(i0.j1 r0) {
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    public static /* synthetic */ void Z1(android.app.Activity r9, java.lang.String r10, java.lang.String r11, java.util.ArrayList r12, java.util.Set r13, fg.l r14, fg.a r15, int r16) {
            r0 = r16 & 16
            if (r0 == 0) goto L6
            tf.v r13 = tf.v.f13169g
        L6:
            r4 = r13
            r13 = r16 & 32
            if (r13 == 0) goto Le
            r13 = 0
        Lc:
            r5 = r13
            goto L10
        Le:
            r13 = 1
            goto Lc
        L10:
            wb.lv r8 = wb.lv.f17583j
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r6 = r14
            r7 = r15
            Y1(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static final fb.a1 a1(i0.j1 r0) {
            java.lang.Object r0 = r0.getValue()
            fb.a1 r0 = (fb.a1) r0
            return r0
    }

    public static void a2(android.app.Activity r7, java.lang.String r8, int r9, int r10, java.lang.Integer r11, fg.l r12, fg.a r13) {
            r7.getClass()
            wb.xu r0 = new wb.xu
            r5 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            s0.d r7 = new s0.d
            r8 = -1725555612(0xffffffff99261c64, float:-8.587732E-24)
            r9 = 1
            r7.<init>(r8, r0, r9)
            P1(r5, r13, r7)
            return
    }

    public static final boolean b1(i0.j1 r0) {
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public static wb.kv b2(android.app.Activity r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, int r15, boolean r16, fg.l r17, fg.a r18, wb.lv r19) {
            r10.getClass()
            r12.getClass()
            r13.getClass()
            r14.getClass()
            wb.av r0 = new wb.av
            r8 = r10
            r1 = r11
            r5 = r12
            r4 = r13
            r6 = r14
            r3 = r15
            r7 = r16
            r9 = r17
            r2 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            s0.d r11 = new s0.d
            r12 = 370231782(0x161149e6, float:1.1736325E-25)
            r13 = 1
            r11.<init>(r12, r0, r13)
            r12 = r18
            wb.kv r10 = P1(r10, r12, r11)
            return r10
    }

    public static final java.lang.String c1(i0.j1 r0) {
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public static /* synthetic */ void c2(android.app.Activity r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7, boolean r8, fg.l r9, fg.a r10, int r11) {
            r0 = r11 & 8
            java.lang.String r1 = ""
            if (r0 == 0) goto L7
            r5 = r1
        L7:
            r0 = r11 & 16
            if (r0 == 0) goto Lc
            r6 = r1
        Lc:
            r11 = r11 & 64
            if (r11 == 0) goto L11
            r8 = 0
        L11:
            wb.lv r11 = wb.lv.f17583j
            b2(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public static final java.lang.String d1(i0.a1 r0) {
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public static final java.lang.String e1(i0.a1 r0) {
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public static final void f0(qg.t r9, i0.a1 r10, i0.a1 r11, fb.v r12, i0.a1 r13, i0.a1 r14) {
            java.lang.Object r0 = r10.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Ld
            return
        Ld:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r10.setValue(r0)
            java.lang.String r0 = ""
            r11.setValue(r0)
            f0.b r1 = new f0.b
            r7 = 0
            r8 = 9
            r3 = r10
            r6 = r11
            r2 = r12
            r4 = r13
            r5 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r10 = 3
            r11 = 0
            qg.v.q(r9, r11, r1, r10)
            return
    }

    public static final java.lang.String f1(i0.a1 r0) {
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public static final java.lang.String g1(i0.a1 r0) {
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public static final boolean h1(i0.a1 r0) {
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public static final long i1(i0.j1 r2) {
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            long r0 = r2.longValue()
            return r0
    }

    public static final boolean j1(i0.j1 r0) {
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public static final void k1(i0.j1 r7, i0.a1 r8, java.lang.String r9, android.content.Context r10, wb.yt r11, i0.j1 r12, i0.a1 r13, i0.a1 r14, i0.a1 r15, i0.a1 r16, i0.a1 r17, i0.a1 r18, i0.a1 r19, boolean r20) {
            if (r20 == 0) goto L2c
            java.lang.Object r7 = r7.getValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L29
            java.lang.Object r7 = r8.getValue()
            r0 = r7
            fb.c1 r0 = (fb.c1) r0
            if (r0 == 0) goto L25
            long r4 = java.lang.System.currentTimeMillis()
            r6 = 95
            r1 = 0
            r2 = 0
            r3 = 0
            fb.c1 r7 = fb.c1.a(r0, r1, r2, r3, r4, r6)
            goto L26
        L25:
            r7 = 0
        L26:
            r8.setValue(r7)
        L29:
            q1(r9, r10, r11, r12, r13)
        L2c:
            wb.yt r7 = wb.vt.b()
            r14.setValue(r7)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r15.setValue(r7)
            r8 = r16
            r8.setValue(r7)
            r8 = r17
            r8.setValue(r7)
            r8 = r18
            r8.setValue(r7)
            r8 = r19
            r8.setValue(r7)
            return
    }

    public static final void l1(i0.j1 r7, i0.a1 r8, java.lang.String r9, android.content.Context r10, wb.yt r11, i0.j1 r12, i0.a1 r13, i0.a1 r14, i0.a1 r15, i0.a1 r16, i0.a1 r17, i0.a1 r18, i0.a1 r19, fb.d1 r20, boolean r21) {
            if (r21 == 0) goto L2c
            java.lang.Object r7 = r7.getValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L29
            java.lang.Object r7 = r8.getValue()
            r0 = r7
            fb.c1 r0 = (fb.c1) r0
            if (r0 == 0) goto L25
            long r4 = java.lang.System.currentTimeMillis()
            r6 = 95
            r1 = 0
            r2 = 0
            r3 = 0
            fb.c1 r7 = fb.c1.a(r0, r1, r2, r3, r4, r6)
            goto L26
        L25:
            r7 = 0
        L26:
            r8.setValue(r7)
        L29:
            q1(r9, r10, r11, r12, r13)
        L2c:
            wb.yt r7 = wb.vt.d(r20)
            r14.setValue(r7)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r15.setValue(r7)
            r8 = r16
            r8.setValue(r7)
            r8 = r17
            r8.setValue(r7)
            r8 = r18
            r8.setValue(r7)
            r8 = r19
            r8.setValue(r7)
            return
    }

    public static final void m1(android.content.Context r7, java.lang.String r8, i0.a1 r9, i0.a1 r10, i0.a1 r11, i0.a1 r12, i0.a1 r13, fb.d1 r14) {
            fb.g1 r0 = fb.g1.f3523a
            fb.g1.n(r7, r14)
            long r0 = r14.f3496n
            boolean r7 = r14.f3495m
            boolean r2 = r14.f3494l
            java.lang.String r3 = r14.f3484b
            java.util.concurrent.ConcurrentHashMap r4 = wb.vt.f19843a
            java.lang.String r14 = r14.f3483a
            java.lang.Object r4 = r4.get(r14)
            wb.yt r4 = (wb.yt) r4
            if (r4 == 0) goto L39
            i0.j1 r5 = r4.f20474b
            r5.setValue(r3)
            i0.j1 r5 = r4.f20484l
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            r5.setValue(r6)
            i0.j1 r5 = r4.f20485m
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r7)
            r5.setValue(r6)
            i0.j1 r4 = r4.f20486n
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            r4.setValue(r5)
        L39:
            boolean r8 = gg.l.a(r14, r8)
            if (r8 == 0) goto L57
            r9.setValue(r3)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            r10.setValue(r8)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r11.setValue(r7)
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            r12.setValue(r7)
        L57:
            int r7 = U0(r13)
            int r7 = r7 + 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r13.setValue(r7)
            return
    }

    public static final void n1(java.util.concurrent.atomic.AtomicBoolean r2, java.lang.String r3, i0.a1 r4, android.content.Context r5, wb.yt r6, i0.a1 r7) {
            r0 = 0
            r1 = 1
            boolean r2 = r2.compareAndSet(r0, r1)
            if (r2 != 0) goto L9
            goto L1e
        L9:
            fb.g1 r2 = fb.g1.f3523a
            java.lang.Object r2 = r4.getValue()
            java.util.List r2 = (java.util.List) r2
            boolean r2 = fb.g1.h(r2)
            q1(r3, r5, r6, r4, r7)
            if (r2 == 0) goto L1e
            java.util.concurrent.ConcurrentHashMap r2 = wb.vt.f19843a
            wb.vt.f19844b = r3
        L1e:
            return
    }

    public static final void o1(wb.yt r10, android.content.Context r11, java.util.List r12, java.util.List r13, java.lang.String r14, fg.l r15) {
            i0.j1 r0 = r10.f20476d
            java.lang.Object r0 = r0.getValue()
            r5 = r0
            java.util.List r5 = (java.util.List) r5
            i0.j1 r0 = r10.A
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.setValue(r1)
            java.lang.Thread r0 = new java.lang.Thread
            ca.j r1 = new ca.j
            r9 = 6
            r4 = r10
            r3 = r11
            r2 = r12
            r8 = r13
            r7 = r14
            r6 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r10 = "Hchat-Agent-History-Change"
            r0.<init>(r1, r10)
            r0.start()
            return
    }

    public static final void p1(i0.a1 r20, java.lang.String r21, android.content.Context r22, wb.yt r23, i0.a1 r24, int r25, java.lang.String r26) {
            r0 = r20
            r1 = r25
            java.lang.Object r2 = r0.getValue()
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r2 = tf.m.w1(r1, r2)
            r3 = r2
            fb.c r3 = (fb.c) r3
            if (r3 == 0) goto L4d
            java.lang.Object r2 = r0.getValue()
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r2 = tf.m.R1(r2)
            java.lang.String r4 = r3.f3437g
            r5 = r26
            java.lang.String r9 = N1(r4, r5)
            r17 = 0
            r19 = 253887(0x3dfbf, float:3.55771E-40)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            java.lang.String r13 = "complete"
            r14 = 0
            r15 = 0
            r16 = 0
            fb.c r3 = fb.c.a(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19)
            r2.set(r1, r3)
            r0.setValue(r2)
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            q1(r1, r2, r3, r0, r4)
        L4d:
            return
    }

    public static final void q1(java.lang.String r1, android.content.Context r2, wb.yt r3, i0.a1 r4, i0.a1 r5) {
            fb.g1 r0 = fb.g1.f3523a
            java.lang.Object r4 = r4.getValue()
            java.util.List r4 = (java.util.List) r4
            boolean r4 = fb.g1.h(r4)
            if (r4 != 0) goto L34
            java.util.concurrent.ConcurrentHashMap r3 = wb.vt.f19843a
            r1.getClass()
            java.util.concurrent.ConcurrentHashMap r3 = wb.vt.f19843a
            r3.remove(r1)
            java.lang.String r3 = wb.vt.f19844b
            boolean r3 = gg.l.a(r3, r1)
            if (r3 == 0) goto L23
            r3 = 0
            wb.vt.f19844b = r3
        L23:
            java.lang.Thread r3 = new java.lang.Thread
            eb.w r4 = new eb.w
            r5 = 6
            r4.<init>(r2, r1, r5)
            java.lang.String r1 = "Hchat-Agent-Empty-Session-Delete"
            r3.<init>(r4, r1)
            r3.start()
            return
        L34:
            r1.getClass()
            java.util.concurrent.ConcurrentHashMap$KeySetView r4 = fb.g1.f3530h
            java.lang.String r1 = fb.g1.m(r1)
            r4.remove(r1)
            fb.d1 r1 = wb.yt.N(r3)
            fb.g1.o(r2, r1)
            int r1 = U0(r5)
            int r1 = r1 + 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5.setValue(r1)
            return
    }

    public static final void r1(android.content.Context r18, i0.a1 r19, i0.j1 r20, i0.a1 r21, i0.a1 r22, i0.a1 r23, i0.a1 r24, i0.a1 r25, i0.a1 r26, i0.a1 r27, i0.a1 r28, i0.a1 r29, i0.a1 r30, i0.a1 r31, i0.a1 r32, fb.t0 r33) {
            r0 = r18
            r1 = r33
            java.lang.String r2 = r1.f3783a
            java.lang.Object r3 = r19.getValue()
            java.lang.String r3 = (java.lang.String) r3
            boolean r2 = gg.l.a(r2, r3)
            if (r2 == 0) goto L13
            return
        L13:
            java.lang.Object r2 = r20.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            fb.v r3 = B0(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            fb.w.w(r0, r3)
            java.lang.String r1 = r1.f3783a
            r1.getClass()
            java.lang.String r3 = "Hchat_script_plugin_config"
            android.content.SharedPreferences r3 = ub.b.c(r0, r3)
            java.util.List r4 = fb.w.i(r3)
            java.util.Iterator r5 = r4.iterator()
        L37:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L4d
            java.lang.Object r6 = r5.next()
            r7 = r6
            fb.t0 r7 = (fb.t0) r7
            java.lang.String r7 = r7.f3783a
            boolean r7 = gg.l.a(r7, r1)
            if (r7 == 0) goto L37
            goto L4e
        L4d:
            r6 = 0
        L4e:
            fb.t0 r6 = (fb.t0) r6
            if (r6 == 0) goto L92
            java.lang.String r1 = r6.f3783a
            fb.w.y(r3, r4, r1)
            fb.t0 r17 = fb.w.n(r0)
            r5 = r19
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r12 = r26
            r16 = r27
            r13 = r28
            r14 = r29
            r15 = r30
            r6 = r31
            x0(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r1 = r32.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            r3 = 1
            r4 = r32
            p.a.u(r1, r3, r4)
            if (r2 == 0) goto L87
            java.lang.String r1 = "已切换配置，将用于下一次请求"
            goto L89
        L87:
            java.lang.String r1 = "已切换配置"
        L89:
            r2 = 0
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
            return
        L92:
            java.lang.String r0 = "配置不存在"
            j8.o.t(r0)
            return
    }

    public static final void s(i0.a1 r0, i0.a1 r1, i0.a1 r2, i0.a1 r3, int r4) {
            java.lang.Object r0 = r0.getValue()
            android.media.MediaPlayer r0 = (android.media.MediaPlayer) r0
            if (r0 == 0) goto L45
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L45
            java.lang.Object r1 = r2.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 > 0) goto L21
            goto L45
        L21:
            java.lang.Object r1 = r3.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r1 = r1 + r4
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r4 = 0
            int r1 = r9.e0.r(r1, r4, r2)
            r0.seekTo(r1)     // Catch: java.lang.Throwable -> L45
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L45
            r3.setValue(r0)     // Catch: java.lang.Throwable -> L45
        L45:
            return
    }

    public static final boolean s1(android.content.Context r48, java.lang.String r49, i0.a1 r50, i0.a1 r51, i0.a1 r52, i0.a1 r53, i0.a1 r54, i0.j1 r55, i0.a1 r56, i0.j1 r57, i0.a1 r58, i0.j1 r59, i0.a1 r60, i0.j1 r61, i0.a1 r62, i0.j1 r63, i0.a1 r64, i0.a1 r65, i0.a1 r66, i0.a1 r67, i0.a1 r68, i0.a1 r69, i0.a1 r70, i0.a1 r71, i0.a1 r72, i0.a1 r73, i0.a1 r74, i0.a1 r75, i0.a1 r76, i0.a1 r77, wb.yt r78, i0.a1 r79, i0.a1 r80, i0.a1 r81, i0.a1 r82, i0.a1 r83, i0.a1 r84, i0.a1 r85, i0.a1 r86, i0.a1 r87, i0.a1 r88, i0.a1 r89, i0.a1 r90, i0.a1 r91, wb.wt r92, i0.a1 r93, java.lang.String r94, java.util.List r95, fb.a1 r96, boolean r97, fb.c1 r98) {
            r4 = r48
            r11 = r49
            r0 = r74
            r1 = r75
            r6 = r98
            boolean r2 = w1(r53, r54, r55, r56, r57, r58, r59, r60)
            r3 = 0
            if (r2 == 0) goto L13
            goto L349
        L13:
            java.lang.Object r2 = r61.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L349
            boolean r2 = J0(r62)
            if (r2 != 0) goto L349
            java.lang.Object r2 = r63.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L33
            goto L349
        L33:
            java.lang.CharSequence r2 = og.m.R0(r94)
            java.lang.String r2 = r2.toString()
            boolean r5 = og.m.t0(r2)
            if (r5 == 0) goto L51
            boolean r5 = r95.isEmpty()
            if (r5 == 0) goto L51
            java.lang.String r0 = "请输入消息"
            android.widget.Toast r0 = android.widget.Toast.makeText(r4, r0, r3)
            r0.show()
            return r3
        L51:
            fb.v r7 = B0(r64, r65, r66, r67, r68, r69, r70, r71, r72, r73)
            java.lang.String r5 = r7.f3823a
            boolean r5 = og.m.t0(r5)
            if (r5 != 0) goto L33b
            java.lang.String r5 = r7.f3826d
            boolean r5 = og.m.t0(r5)
            if (r5 == 0) goto L67
            goto L33b
        L67:
            java.lang.String r5 = H0(r7)
            boolean r8 = og.m.t0(r5)
            r9 = 0
            if (r8 != 0) goto L73
            goto L74
        L73:
            r5 = r9
        L74:
            if (r5 == 0) goto L83
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.setValue(r1)
            android.widget.Toast r0 = android.widget.Toast.makeText(r4, r5, r3)
            r0.show()
            return r3
        L83:
            java.util.List r5 = r7.f3827e
            r8 = 1
            if (r5 == 0) goto L8f
            boolean r10 = r5.isEmpty()
            if (r10 == 0) goto L8f
            goto Lbf
        L8f:
            java.util.Iterator r5 = r5.iterator()
        L93:
            boolean r10 = r5.hasNext()
            if (r10 == 0) goto Lbf
            java.lang.Object r10 = r5.next()
            fb.r0 r10 = (fb.r0) r10
            boolean r12 = r10.f3746c
            if (r12 == 0) goto Lad
            java.lang.String r10 = r10.f3747d
            boolean r10 = og.m.t0(r10)
            if (r10 == 0) goto Lad
            r10 = r8
            goto Lae
        Lad:
            r10 = r3
        Lae:
            if (r10 == 0) goto L93
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.setValue(r1)
            java.lang.String r0 = "请填写已启用 MCP 的 Endpoint"
            android.widget.Toast r0 = android.widget.Toast.makeText(r4, r0, r3)
            r0.show()
            return r3
        Lbf:
            fb.w.w(r4, r7)
            long r23 = java.lang.System.currentTimeMillis()
            if (r6 == 0) goto L13a
            java.lang.Object r0 = r1.getValue()
            java.util.List r0 = (java.util.List) r0
            int r5 = r0.size()
            java.util.ListIterator r0 = r0.listIterator(r5)
        Ld6:
            boolean r5 = r0.hasPrevious()
            java.lang.String r10 = "user"
            if (r5 == 0) goto Lfd
            java.lang.Object r5 = r0.previous()
            r12 = r5
            fb.c r12 = (fb.c) r12
            java.lang.String r13 = r12.f3431a
            boolean r13 = gg.l.a(r13, r10)
            if (r13 == 0) goto Lf9
            java.lang.String r12 = r12.f3433c
            java.lang.String r13 = r6.f3450b
            boolean r12 = gg.l.a(r12, r13)
            if (r12 == 0) goto Lf9
            r12 = r8
            goto Lfa
        Lf9:
            r12 = r3
        Lfa:
            if (r12 == 0) goto Ld6
            goto Lfe
        Lfd:
            r5 = r9
        Lfe:
            fb.c r5 = (fb.c) r5
            if (r5 == 0) goto L103
            goto L13b
        L103:
            java.lang.Object r0 = r1.getValue()
            java.util.List r0 = (java.util.List) r0
            int r5 = r0.size()
            java.util.ListIterator r0 = r0.listIterator(r5)
        L111:
            boolean r5 = r0.hasPrevious()
            if (r5 == 0) goto L136
            java.lang.Object r5 = r0.previous()
            r12 = r5
            fb.c r12 = (fb.c) r12
            java.lang.String r13 = r12.f3431a
            boolean r13 = gg.l.a(r13, r10)
            if (r13 == 0) goto L132
            java.lang.String r12 = r12.f3434d
            java.lang.String r13 = r6.f3449a
            boolean r12 = gg.l.a(r12, r13)
            if (r12 == 0) goto L132
            r12 = r8
            goto L133
        L132:
            r12 = r3
        L133:
            if (r12 == 0) goto L111
            goto L137
        L136:
            r5 = r9
        L137:
            fb.c r5 = (fb.c) r5
            goto L13b
        L13a:
            r5 = r9
        L13b:
            if (r6 == 0) goto L149
            if (r5 != 0) goto L149
            java.lang.String r0 = "原任务记录已不存在，无法继续"
            android.widget.Toast r0 = android.widget.Toast.makeText(r4, r0, r8)
            r0.show()
            return r3
        L149:
            if (r6 == 0) goto L15c
            java.lang.String r0 = r6.f3449a
            if (r0 == 0) goto L15c
            boolean r10 = og.m.t0(r0)
            if (r10 != 0) goto L156
            goto L157
        L156:
            r0 = r9
        L157:
            if (r0 == 0) goto L15c
        L159:
            r16 = r0
            goto L168
        L15c:
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r0.getClass()
            goto L159
        L168:
            if (r5 == 0) goto L170
            java.lang.String r0 = r5.f3433c
            if (r0 == 0) goto L170
        L16e:
            r14 = r0
            goto L17c
        L170:
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r0.getClass()
            goto L16e
        L17c:
            if (r5 == 0) goto L185
            java.lang.Object r0 = r1.getValue()
            java.util.List r0 = (java.util.List) r0
            goto L1ba
        L185:
            java.lang.Object r0 = r1.getValue()
            java.util.List r0 = (java.util.List) r0
            boolean r10 = og.m.t0(r2)
            if (r10 == 0) goto L193
            java.lang.String r2 = "请分析附件内容"
        L193:
            fb.c r12 = new fb.c
            java.lang.String r13 = "user"
            r17 = 0
            java.lang.String r18 = "user"
            r19 = 0
            r20 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r31 = 123856(0x1e3d0, float:1.73559E-40)
            r29 = r23
            r21 = r95
            r22 = r96
            r15 = r14
            r14 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r25, r26, r27, r28, r29, r31)
            r14 = r15
            java.util.ArrayList r0 = tf.m.G1(r0, r12)
        L1ba:
            java.lang.Object r2 = r1.getValue()
            java.util.List r2 = (java.util.List) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L1d2
            fb.g1 r2 = fb.g1.f3523a
            java.lang.String r2 = fb.g1.q(r2, r0)
            r10 = r76
            r10.setValue(r2)
            goto L1d4
        L1d2:
            r10 = r76
        L1d4:
            int r2 = r0.size()
            fb.c r12 = new fb.c
            r29 = 0
            r31 = 249732(0x3cf84, float:3.49949E-40)
            java.lang.String r13 = "assistant"
            r15 = r14
            java.lang.String r14 = ""
            r32 = r15
            r15 = 0
            java.lang.String r18 = "assistant"
            java.lang.String r19 = "正在连接模型"
            r20 = 0
            r21 = 0
            r22 = 0
            java.lang.String r25 = "streaming"
            r26 = 0
            r27 = 0
            r28 = 0
            r17 = r32
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r25, r26, r27, r28, r29, r31)
            r14 = r17
            java.util.ArrayList r12 = tf.m.G1(r0, r12)
            r1.setValue(r12)
            if (r6 != 0) goto L212
            java.lang.Object r12 = r77.getValue()
            fb.c1 r12 = (fb.c1) r12
            F0(r4, r12)
        L212:
            if (r6 == 0) goto L22c
            r12 = 1
            r13 = 92
            r64 = r6
            r67 = r12
            r70 = r13
            r66 = r14
            r65 = r16
            r68 = r23
            fb.c1 r6 = fb.c1.a(r64, r65, r66, r67, r68, r70)
            r13 = r65
        L229:
            r12 = r77
            goto L240
        L22c:
            fb.c1 r12 = new fb.c1
            r17 = 0
            r22 = 60
            r15 = 0
            r13 = r16
            r16 = 0
            r20 = r23
            r18 = r23
            r12.<init>(r13, r14, r15, r16, r17, r18, r20, r22)
            r6 = r12
            goto L229
        L240:
            r12.setValue(r6)
            java.lang.String r6 = ""
            if (r97 == 0) goto L258
            r15 = r50
            r15.setValue(r6)
            tf.t r15 = tf.t.f13167g
            r8 = r51
            r8.setValue(r15)
            r8 = r52
            r8.setValue(r9)
        L258:
            r8 = r78
            r15 = r79
            q1(r11, r4, r8, r1, r15)
            java.lang.Object r16 = r80.getValue()
            java.lang.String r16 = (java.lang.String) r16
            java.lang.Object r17 = r81.getValue()
            java.lang.String r17 = (java.lang.String) r17
            java.lang.Object r18 = r82.getValue()
            java.lang.Number r18 = (java.lang.Number) r18
            int r9 = r18.intValue()
            r18 = r0
            int r0 = r18.size()
            int r0 = r9.e0.r(r9, r3, r0)
            java.lang.Object r3 = r83.getValue()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = gg.l.a(r3, r11)
            java.lang.Object r9 = r84.getValue()
            fb.y r9 = (fb.y) r9
            if (r3 == 0) goto L292
            goto L293
        L292:
            r9 = 0
        L293:
            java.lang.Object r19 = r85.getValue()
            java.lang.String r19 = (java.lang.String) r19
            if (r3 == 0) goto L29c
            goto L29e
        L29c:
            r19 = 0
        L29e:
            if (r19 != 0) goto L2a1
            goto L2a3
        L2a1:
            r6 = r19
        L2a3:
            fb.b r10 = new fb.b
            r10.<init>()
            java.util.concurrent.atomic.AtomicInteger r3 = new java.util.concurrent.atomic.AtomicInteger
            r3.<init>(r2)
            r50 = r0
            r0 = r86
            r0.setValue(r13)
            r0 = r87
            T0(r0, r2)
            r2 = r88
            r2.setValue(r10)
            java.lang.Long r0 = java.lang.Long.valueOf(r23)
            r1 = r89
            r1.setValue(r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1 = r90
            r1.setValue(r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1 = r61
            r1.setValue(r0)
            java.lang.Thread r0 = new java.lang.Thread
            r19 = r0
            wb.et r0 = new wb.et
            r40 = r55
            r41 = r56
            r44 = r57
            r45 = r58
            r42 = r59
            r43 = r60
            r38 = r63
            r35 = r72
            r25 = r75
            r34 = r76
            r24 = r80
            r23 = r81
            r26 = r82
            r33 = r84
            r39 = r85
            r27 = r87
            r30 = r89
            r28 = r90
            r22 = r93
            r29 = r1
            r31 = r2
            r20 = r3
            r36 = r8
            r21 = r12
            r12 = r13
            r32 = r14
            r37 = r15
            r1 = r16
            r3 = r17
            r8 = r18
            r46 = r19
            r47 = 1
            r2 = r50
            r17 = r53
            r18 = r54
            r15 = r62
            r14 = r86
            r16 = r91
            r19 = r92
            r13 = r5
            r5 = r9
            r9 = r6
            r6 = r98
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            java.lang.String r1 = "Hchat-Script-Agent-Chat"
            r2 = r46
            r2.<init>(r0, r1)
            r2.start()
            return r47
        L33b:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.setValue(r1)
            java.lang.String r0 = "请先完成 Agent 配置"
            android.widget.Toast r0 = android.widget.Toast.makeText(r4, r0, r3)
            r0.show()
        L349:
            return r3
    }

    public static boolean t1(android.content.Context r53, java.lang.String r54, i0.a1 r55, i0.a1 r56, i0.a1 r57, i0.a1 r58, i0.a1 r59, i0.j1 r60, i0.a1 r61, i0.j1 r62, i0.a1 r63, i0.j1 r64, i0.a1 r65, i0.j1 r66, i0.a1 r67, i0.j1 r68, i0.a1 r69, i0.a1 r70, i0.a1 r71, i0.a1 r72, i0.a1 r73, i0.a1 r74, i0.a1 r75, i0.a1 r76, i0.a1 r77, i0.a1 r78, i0.a1 r79, i0.a1 r80, i0.a1 r81, i0.a1 r82, wb.yt r83, i0.a1 r84, i0.a1 r85, i0.a1 r86, i0.a1 r87, i0.a1 r88, i0.a1 r89, i0.a1 r90, i0.a1 r91, i0.a1 r92, i0.a1 r93, i0.a1 r94, i0.a1 r95, i0.a1 r96, wb.wt r97, i0.a1 r98, java.lang.String r99, java.util.List r100, fb.a1 r101, int r102) {
            r0 = r102
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto Lf
            java.lang.Object r1 = r55.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r48 = r1
            goto L11
        Lf:
            r48 = r99
        L11:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L20
            java.lang.Object r1 = r56.getValue()
            java.util.List r1 = (java.util.List) r1
            r49 = r1
            goto L22
        L20:
            r49 = r100
        L22:
            r1 = 65536(0x10000, float:9.1835E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L30
            java.lang.Object r1 = r57.getValue()
            fb.a1 r1 = (fb.a1) r1
            r50 = r1
            goto L32
        L30:
            r50 = r101
        L32:
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L3b
            r0 = 1
        L38:
            r51 = r0
            goto L3d
        L3b:
            r0 = 0
            goto L38
        L3d:
            r52 = 0
            r2 = r53
            r3 = r54
            r4 = r55
            r5 = r56
            r6 = r57
            r7 = r58
            r8 = r59
            r9 = r60
            r10 = r61
            r11 = r62
            r12 = r63
            r13 = r64
            r14 = r65
            r15 = r66
            r16 = r67
            r17 = r68
            r18 = r69
            r19 = r70
            r20 = r71
            r21 = r72
            r22 = r73
            r23 = r74
            r24 = r75
            r25 = r76
            r26 = r77
            r27 = r78
            r28 = r79
            r29 = r80
            r30 = r81
            r31 = r82
            r32 = r83
            r33 = r84
            r34 = r85
            r35 = r86
            r36 = r87
            r37 = r88
            r38 = r89
            r39 = r90
            r40 = r91
            r41 = r92
            r42 = r93
            r43 = r94
            r44 = r95
            r45 = r96
            r46 = r97
            r47 = r98
            boolean r0 = s1(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52)
            return r0
    }

    public static final java.util.ArrayList u1(java.util.List r5, java.lang.String r6, fb.c r7, int r8) {
            java.util.List r5 = tf.m.q1(r8, r5)
            java.util.ArrayList r5 = fb.w.o(r6, r5)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r5 = r5.iterator()
        L11:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L4d
            java.lang.Object r0 = r5.next()
            r1 = r0
            fb.c r1 = (fb.c) r1
            if (r7 == 0) goto L46
            java.lang.String r2 = r1.f3431a
            java.lang.String r3 = r1.f3444n
            java.lang.String r4 = "assistant"
            boolean r2 = gg.l.a(r2, r4)
            if (r2 == 0) goto L46
            java.lang.String r1 = r1.f3434d
            boolean r1 = gg.l.a(r1, r6)
            if (r1 == 0) goto L46
            java.lang.String r1 = "error"
            boolean r1 = gg.l.a(r3, r1)
            if (r1 != 0) goto L44
            java.lang.String r1 = "interrupted"
            boolean r1 = gg.l.a(r3, r1)
            if (r1 == 0) goto L46
        L44:
            r1 = 1
            goto L47
        L46:
            r1 = 0
        L47:
            if (r1 != 0) goto L11
            r8.add(r0)
            goto L11
        L4d:
            if (r7 == 0) goto L7a
            boolean r5 = r8.isEmpty()
            if (r5 == 0) goto L56
            goto L71
        L56:
            java.util.Iterator r5 = r8.iterator()
        L5a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L71
            java.lang.Object r6 = r5.next()
            fb.c r6 = (fb.c) r6
            java.lang.String r6 = r6.f3433c
            java.lang.String r0 = r7.f3433c
            boolean r6 = gg.l.a(r6, r0)
            if (r6 == 0) goto L5a
            goto L7a
        L71:
            java.util.List r5 = a.a.x0(r7)
            java.util.ArrayList r5 = tf.m.F1(r5, r8)
            return r5
        L7a:
            return r8
    }

    public static final void v0(i0.a1 r22, java.lang.String r23, android.content.Context r24, wb.yt r25, i0.a1 r26, int r27, java.lang.String r28, java.lang.String r29, fb.y r30, boolean r31) {
            r0 = r22
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            r2 = r27
            java.lang.Object r1 = tf.m.w1(r2, r1)
            fb.c r1 = (fb.c) r1
            if (r1 == 0) goto L51
            long r13 = java.lang.System.currentTimeMillis()
            java.lang.Object r2 = r0.getValue()
            java.util.List r2 = (java.util.List) r2
            java.lang.String r6 = r1.f3434d
            java.lang.String r7 = r1.f3433c
            r1 = r2
            fb.c r2 = new fb.c
            r18 = 0
            r21 = 69508(0x10f84, float:9.7401E-41)
            java.lang.String r3 = "assistant"
            r5 = 0
            java.lang.String r8 = "workspace_status"
            r10 = 0
            r11 = 0
            r12 = 0
            java.lang.String r15 = "complete"
            r19 = r13
            r4 = r28
            r9 = r29
            r16 = r30
            r17 = r31
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r21)
            java.util.ArrayList r1 = tf.m.G1(r1, r2)
            r0.setValue(r1)
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            q1(r1, r2, r3, r0, r4)
        L51:
            return
    }

    public static final void v1(android.content.Context r11, i0.a1 r12, i0.a1 r13, i0.a1 r14, i0.a1 r15, i0.a1 r16, i0.a1 r17, i0.a1 r18, i0.a1 r19, i0.a1 r20, i0.a1 r21, i0.a1 r22, java.lang.String r23) {
            r10 = r23
            r12.setValue(r10)
            r8 = r12
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r9 = r21
            fb.v r0 = B0(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r9 = 0
            r10 = 1791(0x6ff, float:2.51E-42)
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r7 = r23
            fb.v r0 = fb.v.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            fb.w.w(r11, r0)
            int r0 = V0(r22)
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = r22
            r1.setValue(r0)
            return
    }

    public static wb.y4 w(android.content.Context r23, java.lang.String r24, wb.y4 r25, java.lang.String r26, long r27, i0.h0 r29, int r30, int r31) {
            r9 = r29
            r0 = 8
            r1 = r31 & 8
            if (r1 == 0) goto Lb
            java.lang.String r1 = "•"
            goto Ld
        Lb:
            r1 = r26
        Ld:
            y0.l r2 = y0.l.f21818a
            r8 = 1065353216(0x3f800000, float:1.0)
            y0.o r3 = p.h1.d(r2, r8)
            r4 = 2
            float r4 = (float) r4
            r5 = 0
            r10 = 1
            y0.o r3 = p.d.n(r3, r5, r4, r10)
            p.c r4 = p.j.f9924a
            y0.f r5 = y0.b.f21801p
            r6 = 0
            p.e1 r4 = p.d1.a(r4, r5, r9, r6)
            long r5 = r9.T
            int r5 = java.lang.Long.hashCode(r5)
            s0.h r6 = r9.l()
            y0.o r3 = y0.a.c(r9, r3)
            x1.f r7 = x1.g.f20914f
            r7.getClass()
            x1.y r7 = x1.f.f20883b
            x1.f2 r11 = r9.f5894a
            r9.d0()
            boolean r11 = r9.S
            if (r11 == 0) goto L48
            r9.k(r7)
            goto L4b
        L48:
            r9.n0()
        L4b:
            x1.e r7 = x1.f.f20886e
            i0.r.A(r7, r9, r4)
            x1.e r4 = x1.f.f20885d
            i0.r.A(r4, r9, r6)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            x1.e r5 = x1.f.f20887f
            i0.r.A(r5, r9, r4)
            x1.d r4 = x1.f.f20888g
            i0.r.w(r4, r9)
            x1.e r4 = x1.f.f20884c
            i0.r.A(r4, r9, r3)
            i0.m2 r3 = bi.d.f892a
            java.lang.Object r3 = r9.j(r3)
            bi.b r3 = (bi.b) r3
            long r11 = r3.h()
            float r5 = (float) r0
            r6 = 0
            r7 = 11
            r3 = 0
            r4 = 0
            y0.o r0 = p.d.p(r2, r3, r4, r5, r6, r7)
            int r2 = r30 >> 9
            r2 = r2 & 14
            r2 = r2 | 48
            r3 = 57344(0xe000, float:8.0356E-41)
            r3 = r30 & r3
            r20 = r2 | r3
            r21 = 0
            r22 = 262120(0x3ffe8, float:3.67308E-40)
            r6 = 0
            r7 = 0
            r2 = r8
            r8 = 0
            r3 = r10
            r10 = 0
            r4 = r2
            r5 = r3
            r2 = r11
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r4 = r1
            r1 = r0
            r0 = r4
            r4 = r27
            r19 = r29
            sh.s.n(r0, r1, r2, r4, r6, r7, r8, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r2 = 1065353216(0x3f800000, float:1.0)
            double r0 = (double) r2
            r3 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto Lb9
            goto Lbe
        Lb9:
            java.lang.String r0 = "invalid weight; must be greater than zero"
            q.a.a(r0)
        Lbe:
            p.q0 r3 = new p.q0
            r12 = 1
            r3.<init>(r2, r12)
            r0 = r30
            r1 = r0 & 14
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r2
            r2 = r0 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            r2 = r0 & 896(0x380, float:1.256E-42)
            r1 = r1 | r2
            int r0 = r0 << 3
            r2 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r2
            r10 = r1 | r0
            r11 = 80
            r4 = 0
            r8 = 0
            r0 = r23
            r1 = r24
            r2 = r25
            r6 = r27
            r9 = r29
            wb.y4 r0 = x(r0, r1, r2, r3, r4, r6, r8, r9, r10, r11)
            r9.p(r12)
            return r0
    }

    public static /* synthetic */ void w0(i0.a1 r11, java.lang.String r12, android.content.Context r13, wb.yt r14, i0.a1 r15, int r16, java.lang.String r17, int r18) {
            r0 = r18
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto La
            java.lang.String r0 = ""
        L8:
            r8 = r0
            goto Ld
        La:
            java.lang.String r0 = "提交失败，暂存变更已保留，可直接重试"
            goto L8
        Ld:
            r10 = 0
            r9 = 0
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            v0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static final boolean w1(i0.a1 r1, i0.a1 r2, i0.j1 r3, i0.a1 r4, i0.j1 r5, i0.a1 r6, i0.j1 r7, i0.a1 r8) {
            java.lang.Object r1 = r1.getValue()
            wb.au r1 = (wb.au) r1
            r0 = 1
            if (r1 == 0) goto Ld
            S0(r2, r0)
            return r0
        Ld:
            java.lang.Object r1 = r3.getValue()
            wb.st r1 = (wb.st) r1
            if (r1 == 0) goto L19
            O0(r4, r0)
            return r0
        L19:
            java.lang.Object r1 = r5.getValue()
            wb.tt r1 = (wb.tt) r1
            if (r1 == 0) goto L27
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r6.setValue(r1)
            return r0
        L27:
            java.lang.Object r1 = r7.getValue()
            wb.qt r1 = (wb.qt) r1
            if (r1 == 0) goto L35
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r8.setValue(r1)
            return r0
        L35:
            r1 = 0
            return r1
    }

    public static wb.y4 x(android.content.Context r21, java.lang.String r22, wb.y4 r23, y0.o r24, long r25, long r27, m2.k r29, i0.h0 r30, int r31, int r32) {
            r0 = r21
            r1 = r22
            r8 = r30
            r2 = r32 & 16
            if (r2 == 0) goto L18
            i0.m2 r2 = bi.d.f892a
            java.lang.Object r2 = r8.j(r2)
            bi.b r2 = (bi.b) r2
            long r2 = r2.g()
            r10 = r2
            goto L1a
        L18:
            r10 = r25
        L1a:
            r2 = r32 & 64
            if (r2 == 0) goto L21
            r2 = 0
            r14 = r2
            goto L23
        L21:
            r14 = r29
        L23:
            i0.m2 r2 = bi.d.f892a
            java.lang.Object r2 = r8.j(r2)
            bi.b r2 = (bi.b) r2
            long r2 = r2.j()
            r4 = r23
            boolean r5 = r4.f20294a
            r6 = r31 & 112(0x70, float:1.57E-43)
            r6 = r6 ^ 48
            r9 = 1
            r12 = 32
            if (r6 <= r12) goto L42
            boolean r6 = r8.f(r1)
            if (r6 != 0) goto L46
        L42:
            r6 = r31 & 48
            if (r6 != r12) goto L48
        L46:
            r6 = r9
            goto L49
        L48:
            r6 = 0
        L49:
            boolean r12 = r8.e(r2)
            r6 = r6 | r12
            boolean r5 = r8.g(r5)
            r5 = r5 | r6
            java.lang.Object r6 = r8.P()
            i0.e r12 = i0.l.f5952a
            if (r5 != 0) goto L5d
            if (r6 != r12) goto L125
        L5d:
            i2.d r15 = new i2.d
            r15.<init>()
            og.k r5 = wb.ho.f16633a
            ng.c r5 = og.k.c(r5, r1)
            f.i0 r6 = new f.i0
            r6.<init>(r5)
            r5 = 0
        L6e:
            boolean r13 = r6.hasNext()
            if (r13 == 0) goto L10b
            java.lang.Object r13 = r6.next()
            og.f r13 = (og.f) r13
            og.i r13 = (og.i) r13
            lg.d r7 = r13.b()
            int r7 = r7.f8042g
            if (r7 <= r5) goto L92
            lg.d r7 = r13.b()
            int r7 = r7.f8042g
            java.lang.String r5 = r1.substring(r5, r7)
            wb.y4 r4 = F1(r15, r5, r2, r4)
        L92:
            r19 = r4
            java.util.List r4 = r13.a()
            og.g r4 = (og.g) r4
            java.lang.Object r4 = r4.get(r9)
            r16 = r4
            java.lang.String r16 = (java.lang.String) r16
            java.util.List r4 = r13.a()
            og.g r4 = (og.g) r4
            r5 = 2
            java.lang.Object r4 = r4.get(r5)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.CharSequence r4 = og.m.R0(r4)
            java.lang.String r4 = r4.toString()
            boolean r5 = og.m.t0(r16)
            java.lang.StringBuilder r7 = r15.f6259g
            if (r5 != 0) goto Lef
            boolean r5 = og.m.t0(r4)
            if (r5 != 0) goto Lef
            i2.c r5 = new i2.c
            r26 = r9
            i2.h0 r9 = new i2.h0
            r9.<init>(r4)
            int r4 = r7.length()
            r7 = 4
            r17 = r2
            r2 = 0
            r5.<init>(r9, r4, r2, r7)
            java.util.ArrayList r3 = r15.f6260h
            r3.add(r5)
            java.util.ArrayList r4 = r15.f6261i
            r4.add(r5)
            r3.size()
            r20 = 1
            G1(r15, r16, r17, r19, r20)
            r15.b()
            goto Lfb
        Lef:
            r17 = r2
            r26 = r9
            r2 = 0
            java.lang.String r3 = r13.c()
            r7.append(r3)
        Lfb:
            lg.d r3 = r13.b()
            int r3 = r3.f8043h
            int r5 = r3 + 1
            r9 = r26
            r2 = r17
            r4 = r19
            goto L6e
        L10b:
            int r6 = r1.length()
            if (r5 >= r6) goto L119
            java.lang.String r1 = r1.substring(r5)
            wb.y4 r4 = F1(r15, r1, r2, r4)
        L119:
            i2.g r1 = r15.e()
            wb.x4 r6 = new wb.x4
            r6.<init>(r1, r4)
            r8.k0(r6)
        L125:
            r1 = r6
            wb.x4 r1 = (wb.x4) r1
            i2.g r2 = r1.f20080a
            i2.n0 r9 = new i2.n0
            r18 = 0
            r20 = 16777208(0xfffff8, float:2.3509876E-38)
            r15 = 0
            r17 = 0
            r3 = r12
            r12 = r27
            r9.<init>(r10, r12, r14, r15, r17, r18, r20)
            boolean r4 = r8.f(r1)
            boolean r5 = r8.h(r0)
            r4 = r4 | r5
            java.lang.Object r5 = r8.P()
            if (r4 != 0) goto L14c
            if (r5 != r3) goto L156
        L14c:
            m.b r5 = new m.b
            r3 = 28
            r5.<init>(r1, r3, r0)
            r8.k0(r5)
        L156:
            r7 = r5
            fg.l r7 = (fg.l) r7
            int r0 = r31 >> 6
            r0 = r0 & 112(0x70, float:1.57E-43)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r10 = r9
            r9 = r0
            r0 = r2
            r2 = r10
            r10 = r1
            r1 = r24
            w.s.c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            wb.y4 r0 = r10.f20081b
            return r0
    }

    public static final void x0(i0.a1 r1, i0.a1 r2, i0.a1 r3, i0.a1 r4, i0.a1 r5, i0.a1 r6, i0.a1 r7, i0.a1 r8, i0.a1 r9, i0.a1 r10, i0.a1 r11, i0.a1 r12, fb.t0 r13) {
            java.lang.String r0 = r13.f3783a
            r1.setValue(r0)
            java.lang.String r1 = r13.f3784b
            r2.setValue(r1)
            fb.v r1 = r13.f3785c
            java.lang.String r2 = r1.f3823a
            r3.setValue(r2)
            java.lang.String r2 = r1.f3833k
            r4.setValue(r2)
            java.lang.String r2 = r1.f3825c
            r5.setValue(r2)
            java.lang.String r2 = r1.f3826d
            r6.setValue(r2)
            java.util.List r2 = r1.f3827e
            r7.setValue(r2)
            boolean r2 = r1.f3828f
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r8.setValue(r2)
            boolean r2 = r1.f3830h
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r9.setValue(r2)
            java.lang.String r2 = r1.f3831i
            r10.setValue(r2)
            java.lang.String r2 = r1.f3832j
            r11.setValue(r2)
            int r1 = r1.f3829g
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r12.setValue(r1)
            return
    }

    public static final void x1(int r14, android.content.Context r15, fb.y r16, i0.a1 r17, i0.a1 r18, i0.a1 r19, i0.a1 r20, i0.a1 r21, i0.j1 r22, java.lang.String r23, wb.yt r24, boolean r25) {
            java.lang.Object r0 = r22.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Ld
            return
        Ld:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r10 = r22
            r10.setValue(r0)
            if (r25 == 0) goto L24
            java.lang.String r0 = "正在创建插件"
        L18:
            r6 = r14
            r3 = r15
            r1 = r17
            r5 = r18
            r2 = r23
            r4 = r24
            r7 = r0
            goto L27
        L24:
            java.lang.String r0 = "正在写入插件修改"
            goto L18
        L27:
            p1(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Thread r0 = new java.lang.Thread
            wb.mr r1 = new wb.mr
            r2 = r14
            r3 = r15
            r4 = r16
            r8 = r17
            r9 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r11 = r23
            r12 = r24
            r13 = r25
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r14 = "Hchat-Script-Agent-Write"
            r0.<init>(r1, r14)
            r0.start()
            return
    }

    public static final void y0(int r18, android.content.Context r19, fb.i2 r20, i0.a1 r21, i0.a1 r22, i0.a1 r23, i0.a1 r24, i0.a1 r25, i0.a1 r26, i0.j1 r27, i0.j1 r28, java.lang.String r29, wb.yt r30) {
            r3 = r20
            java.lang.Object r0 = r27.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lf
            return
        Lf:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r10 = r27
            r10.setValue(r0)
            boolean r0 = r3.f3569l
            if (r0 == 0) goto L31
            java.lang.String r0 = r3.f3558a
            java.lang.String r1 = "正在删除插件: "
            java.lang.String r0 = r1.concat(r0)
        L22:
            r16 = r18
            r13 = r19
            r11 = r21
            r15 = r22
            r12 = r29
            r14 = r30
            r17 = r0
            goto L34
        L31:
            java.lang.String r0 = "正在提交插件工作区变更"
            goto L22
        L34:
            p1(r11, r12, r13, r14, r15, r16, r17)
            java.lang.Thread r14 = new java.lang.Thread
            wb.dt r0 = new wb.dt
            r1 = r18
            r2 = r19
            r7 = r21
            r8 = r22
            r4 = r23
            r5 = r24
            r6 = r25
            r9 = r26
            r11 = r28
            r12 = r29
            r13 = r30
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.String r1 = "Hchat-Script-Agent-Workspace-Apply"
            r14.<init>(r0, r1)
            r14.start()
            return
    }

    public static final void z0(android.content.Context r26, wb.wt r27, i0.a1 r28, i0.a1 r29, i0.j1 r30, i0.j1 r31, i0.a1 r32, i0.j1 r33, i0.a1 r34, i0.a1 r35, i0.a1 r36, i0.j1 r37, i0.j1 r38, i0.a1 r39, i0.a1 r40, i0.a1 r41) {
            java.lang.Object r0 = r28.getValue()
            fb.b r0 = (fb.b) r0
            if (r0 == 0) goto L22a
            java.lang.Object r1 = r29.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r30.getValue()
            wb.au r2 = (wb.au) r2
            if (r2 == 0) goto L1b
            fb.u2 r3 = fb.u2.f3819g
            r2.a(r3)
        L1b:
            r2 = 0
            r3 = r30
            r3.setValue(r2)
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r4 = r31
            r4.setValue(r3)
            java.util.concurrent.atomic.AtomicBoolean r3 = r0.f3400a
            r4 = 1
            r3.set(r4)
            java.util.Set r0 = r0.f3401b
            r0.getClass()
            r3 = r0
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.List r3 = tf.m.P1(r3)
            java.util.Iterator r3 = r3.iterator()
        L3e:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L4e
            java.lang.Object r5 = r3.next()
            okhttp3.Call r5 = (okhttp3.Call) r5
            r5.cancel()
            goto L3e
        L4e:
            r0.clear()
            java.lang.Object r0 = r32.getValue()
            r5 = r0
            fb.c1 r5 = (fb.c1) r5
            if (r5 == 0) goto L6a
            long r9 = java.lang.System.currentTimeMillis()
            r11 = 95
            r6 = 0
            r7 = 0
            r8 = 0
            fb.c1 r0 = fb.c1.a(r5, r6, r7, r8, r9, r11)
        L67:
            r3 = r32
            goto L6c
        L6a:
            r0 = r2
            goto L67
        L6c:
            r3.setValue(r0)
            java.lang.Object r0 = r33.getValue()
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            java.lang.Object r3 = r34.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r3 < 0) goto L9a
            if (r3 >= r0) goto L9a
            java.lang.Object r0 = r34.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.util.Set r0 = ac.p.N(r0)
            goto Le1
        L9a:
            java.lang.Object r0 = r33.getValue()
            java.util.List r0 = (java.util.List) r0
            lg.d r0 = a.a.X(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        Lad:
            r5 = r0
            lg.c r5 = (lg.c) r5
            boolean r6 = r5.f8047i
            if (r6 == 0) goto Ldd
            java.lang.Object r5 = r5.next()
            r6 = r5
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.lang.Object r7 = r33.getValue()
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r6 = r7.get(r6)
            fb.c r6 = (fb.c) r6
            java.lang.String r6 = r6.f3434d
            java.lang.Object r7 = r29.getValue()
            java.lang.String r7 = (java.lang.String) r7
            boolean r6 = gg.l.a(r6, r7)
            if (r6 == 0) goto Lad
            r3.add(r5)
            goto Lad
        Ldd:
            java.util.Set r0 = tf.m.U1(r3)
        Le1:
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L1ed
            long r19 = java.lang.System.currentTimeMillis()
            java.lang.Object r3 = r33.getValue()
            java.util.List r3 = (java.util.List) r3
            java.util.ArrayList r3 = tf.m.R1(r3)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        Lfe:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L1b2
            java.lang.Object r5 = r0.next()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.lang.Object r6 = r3.get(r5)
            fb.c r6 = (fb.c) r6
            java.lang.String r7 = r6.f3437g
            java.lang.String r8 = "已中断"
            java.lang.String r21 = N1(r7, r8)
            java.util.List r7 = r6.f3440j
            java.util.ArrayList r8 = new java.util.ArrayList
            int r9 = tf.n.e1(r7)
            r8.<init>(r9)
            java.util.Iterator r22 = r7.iterator()
        L12b:
            boolean r7 = r22.hasNext()
            if (r7 == 0) goto L188
            java.lang.Object r7 = r22.next()
            fb.q1 r7 = (fb.q1) r7
            java.lang.String r9 = r7.f3727g
            java.lang.String r10 = "running"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L153
            java.lang.String r9 = r7.f3727g
            java.lang.String r10 = "queued"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L14c
            goto L153
        L14c:
            r2 = r5
            r4 = r8
            r11 = r19
            r19 = r6
            goto L17c
        L153:
            r17 = 0
            r18 = 523455(0x7fcbf, float:7.33517E-40)
            r9 = r6
            r6 = 0
            r10 = r5
            r5 = r7
            r7 = 0
            r14 = r8
            java.lang.String r8 = "interrupted"
            r12 = r9
            r11 = r10
            r9 = 0
            java.lang.String r13 = "已中断"
            r15 = r14
            r14 = 0
            r16 = r15
            r15 = 0
            r23 = r16
            r16 = 0
            r2 = r11
            r4 = r23
            r24 = r19
            r19 = r12
            r11 = r24
            fb.q1 r7 = fb.q1.a(r5, r6, r7, r8, r9, r11, r13, r14, r15, r16, r17, r18)
        L17c:
            r4.add(r7)
            r5 = r2
            r8 = r4
            r6 = r19
            r2 = 0
            r4 = 1
            r19 = r11
            goto L12b
        L188:
            r2 = r5
            r4 = r8
            r11 = r19
            r19 = r6
            r18 = 0
            r5 = r19
            r19 = r11
            r11 = r21
            r21 = 122303(0x1ddbf, float:1.71383E-40)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            java.lang.String r15 = "interrupted"
            r16 = 0
            r17 = 0
            r14 = r4
            fb.c r4 = fb.c.a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21)
            r3.set(r2, r4)
            r2 = 0
            r4 = 1
            goto Lfe
        L1b2:
            r2 = r33
            r2.setValue(r3)
            java.lang.Object r0 = r2.getValue()
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r3 = r35.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            int r2 = r2.size()
            r4 = 0
            int r2 = r9.e0.r(r3, r4, r2)
            java.util.List r0 = tf.m.q1(r2, r0)
            java.util.ArrayList r0 = fb.w.o(r1, r0)
            r1 = r26
            java.lang.String r0 = r9.e0.f0(r1, r0)
            r1 = r36
            r1.setValue(r0)
            r1 = 1
        L1ea:
            r0 = r27
            goto L1ef
        L1ed:
            r1 = r4
            goto L1ea
        L1ef:
            r0.b(r1)
            r0 = r28
            r1 = 0
            r0.setValue(r1)
            java.lang.String r0 = ""
            r1 = r29
            r1.setValue(r0)
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = r34
            r1.setValue(r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1 = r37
            r1.setValue(r0)
            r1 = r38
            r1.setValue(r0)
            r1 = 0
            r3 = r39
            L0(r3, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = r40
            r2.setValue(r1)
            r1 = r41
            r1.setValue(r0)
        L22a:
            return
    }

    public static final void z1(qg.t r12, i0.a1 r13, i0.a1 r14, android.content.Context r15, i0.a1 r16, i0.a1 r17, i0.a1 r18, i0.a1 r19, gb.o r20, boolean r21) {
            java.lang.Object r0 = r13.getValue()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L9
            return
        L9:
            r3 = r20
            java.lang.String r0 = r3.f4449a
            r13.setValue(r0)
            java.lang.String r0 = ""
            r14.setValue(r0)
            wb.zp r1 = new wb.zp
            r11 = 0
            r10 = r13
            r9 = r14
            r2 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r4 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13 = 3
            r14 = 0
            qg.v.q(r12, r14, r1, r13)
            return
    }

    public void A(java.lang.String r33, java.lang.String r34, boolean r35, fg.a r36, i0.h0 r37, int r38) {
            r32 = this;
            r4 = r35
            r9 = r37
            r0 = -1832462974(0xffffffff92c6d582, float:-1.254819E-27)
            r9.b0(r0)
            r2 = r33
            boolean r0 = r9.f(r2)
            if (r0 == 0) goto L14
            r0 = 4
            goto L15
        L14:
            r0 = 2
        L15:
            r0 = r38 | r0
            r3 = r34
            boolean r5 = r9.f(r3)
            if (r5 == 0) goto L22
            r5 = 32
            goto L24
        L22:
            r5 = 16
        L24:
            r0 = r0 | r5
            boolean r5 = r9.g(r4)
            if (r5 == 0) goto L2e
            r5 = 256(0x100, float:3.59E-43)
            goto L30
        L2e:
            r5 = 128(0x80, float:1.8E-43)
        L30:
            r0 = r0 | r5
            r14 = r36
            boolean r5 = r9.h(r14)
            if (r5 == 0) goto L3c
            r5 = 2048(0x800, float:2.87E-42)
            goto L3e
        L3c:
            r5 = 1024(0x400, float:1.435E-42)
        L3e:
            r0 = r0 | r5
            r5 = r0 & 1171(0x493, float:1.641E-42)
            r6 = 1170(0x492, float:1.64E-42)
            if (r5 == r6) goto L47
            r5 = 1
            goto L48
        L47:
            r5 = 0
        L48:
            r6 = r0 & 1
            boolean r5 = r9.S(r6, r5)
            if (r5 == 0) goto L1cc
            y0.l r5 = y0.l.f21818a
            r6 = 1065353216(0x3f800000, float:1.0)
            y0.o r10 = p.h1.d(r5, r6)
            r11 = 12
            float r12 = (float) r11
            v.d r13 = v.e.a(r12)
            y0.o r10 = c1.h.b(r10, r13)
            r13 = 0
            r15 = 15
            r16 = r11
            r11 = 0
            r17 = r12
            r12 = 0
            r28 = r16
            r1 = r17
            y0.o r10 = k.n.j(r10, r11, r12, r13, r14, r15)
            y0.o r1 = p.d.m(r10, r1, r1)
            y0.f r10 = y0.b.f21802q
            p.c r11 = p.j.f9924a
            r12 = 48
            p.e1 r10 = p.d1.a(r11, r10, r9, r12)
            long r11 = r9.T
            int r11 = java.lang.Long.hashCode(r11)
            s0.h r12 = r9.l()
            y0.o r1 = y0.a.c(r9, r1)
            x1.f r13 = x1.g.f20914f
            r13.getClass()
            x1.y r13 = x1.f.f20883b
            r9.d0()
            boolean r14 = r9.S
            if (r14 == 0) goto La2
            r9.k(r13)
            goto La5
        La2:
            r9.n0()
        La5:
            x1.e r14 = x1.f.f20886e
            i0.r.A(r14, r9, r10)
            x1.e r10 = x1.f.f20885d
            i0.r.A(r10, r9, r12)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            x1.e r12 = x1.f.f20887f
            i0.r.A(r12, r9, r11)
            x1.d r11 = x1.f.f20888g
            i0.r.w(r11, r9)
            x1.e r15 = x1.f.f20884c
            i0.r.A(r15, r9, r1)
            double r7 = (double) r6
            r17 = 0
            int r7 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r7 <= 0) goto Lca
            goto Lcf
        Lca:
            java.lang.String r7 = "invalid weight; must be greater than zero"
            q.a.a(r7)
        Lcf:
            p.q0 r7 = new p.q0
            r8 = 1
            r7.<init>(r6, r8)
            p.e r6 = p.j.f9926c
            y0.e r1 = y0.b.f21804s
            r8 = 0
            p.t r1 = p.s.a(r6, r1, r9, r8)
            long r2 = r9.T
            int r2 = java.lang.Long.hashCode(r2)
            s0.h r3 = r9.l()
            y0.o r6 = y0.a.c(r9, r7)
            r9.d0()
            boolean r7 = r9.S
            if (r7 == 0) goto Lf7
            r9.k(r13)
            goto Lfa
        Lf7:
            r9.n0()
        Lfa:
            i0.r.A(r14, r9, r1)
            i0.r.A(r10, r9, r3)
            j8.b.p(r2, r9, r12, r9, r11)
            i0.r.A(r15, r9, r6)
            i0.m2 r1 = bi.d.f892a
            java.lang.Object r2 = r9.j(r1)
            bi.b r2 = (bi.b) r2
            long r2 = r2.g()
            r6 = 15
            long r6 = x6.d.D(r6)
            m2.k r11 = m2.k.f8698j
            r10 = r0 & 14
            r12 = 1597440(0x186000, float:2.23849E-39)
            r25 = r10 | r12
            r26 = 0
            r27 = 262058(0x3ffaa, float:3.67221E-40)
            r9 = r6
            r6 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r7 = 1
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = r37
            r29 = r5
            r5 = r33
            r30 = r2
            r3 = r7
            r2 = r8
            r7 = r30
            sh.s.n(r5, r6, r7, r9, r11, r12, r13, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r5 = r24
            boolean r6 = og.m.t0(r34)
            if (r6 != 0) goto L1a2
            r6 = 750322653(0x2cb903dd, float:5.258445E-12)
            r5.a0(r6)
            java.lang.Object r1 = r5.j(r1)
            bi.b r1 = (bi.b) r1
            long r7 = r1.h()
            long r15 = x6.d.D(r28)
            r1 = 2
            float r11 = (float) r1
            r13 = 0
            r14 = 13
            r10 = 0
            r12 = 0
            r9 = r29
            y0.o r6 = p.d.p(r9, r10, r11, r12, r13, r14)
            r1 = r9
            int r0 = r0 >> 3
            r0 = r0 & 14
            r0 = r0 | 24624(0x6030, float:3.4506E-41)
            r26 = 0
            r27 = 262120(0x3ffe8, float:3.67308E-40)
            r11 = 0
            r12 = 0
            r13 = 0
            r9 = r15
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = r0
            r24 = r5
            r5 = r34
            sh.s.n(r5, r6, r7, r9, r11, r12, r13, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r9 = r24
            r9.p(r2)
            goto L1ae
        L1a2:
            r9 = r5
            r1 = r29
            r0 = 750583642(0x2cbcff5a, float:5.371631E-12)
            r9.a0(r0)
            r9.p(r2)
        L1ae:
            r9.p(r3)
            r0 = 22
            float r0 = (float) r0
            y0.o r6 = p.h1.j(r1, r0)
            if (r4 == 0) goto L1be
            h2.a r0 = h2.a.f5048g
        L1bc:
            r5 = r0
            goto L1c1
        L1be:
            h2.a r0 = h2.a.f5049h
            goto L1bc
        L1c1:
            r8 = 0
            r10 = 432(0x1b0, float:6.05E-43)
            r7 = 0
            sh.s.d(r5, r6, r7, r8, r9, r10)
            r9.p(r3)
            goto L1cf
        L1cc:
            r9.V()
        L1cf:
            i0.r1 r7 = r9.t()
            if (r7 == 0) goto L1e6
            wb.ug r0 = new wb.ug
            r1 = r32
            r2 = r33
            r3 = r34
            r5 = r36
            r6 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f6035d = r0
        L1e6:
            return
    }

    public void B(gb.c r35, boolean r36, boolean r37, boolean r38, fg.a r39, i0.h0 r40, int r41) {
            r34 = this;
            r2 = r35
            r3 = r36
            r4 = r37
            r5 = r38
            r15 = r40
            r0 = -1304437097(0xffffffffb23fde97, float:-1.1168274E-8)
            r15.b0(r0)
            boolean r0 = r15.f(r2)
            if (r0 == 0) goto L18
            r0 = 4
            goto L19
        L18:
            r0 = 2
        L19:
            r0 = r41 | r0
            boolean r6 = r15.g(r3)
            if (r6 == 0) goto L24
            r6 = 32
            goto L26
        L24:
            r6 = 16
        L26:
            r0 = r0 | r6
            boolean r6 = r15.g(r4)
            if (r6 == 0) goto L30
            r6 = 256(0x100, float:3.59E-43)
            goto L32
        L30:
            r6 = 128(0x80, float:1.8E-43)
        L32:
            r0 = r0 | r6
            boolean r6 = r15.g(r5)
            if (r6 == 0) goto L3c
            r6 = 2048(0x800, float:2.87E-42)
            goto L3e
        L3c:
            r6 = 1024(0x400, float:1.435E-42)
        L3e:
            r0 = r0 | r6
            r6 = r39
            boolean r7 = r15.h(r6)
            if (r7 == 0) goto L4a
            r7 = 16384(0x4000, float:2.2959E-41)
            goto L4c
        L4a:
            r7 = 8192(0x2000, float:1.148E-41)
        L4c:
            r0 = r0 | r7
            r7 = r0 & 9363(0x2493, float:1.312E-41)
            r8 = 9362(0x2492, float:1.3119E-41)
            r9 = 0
            r10 = 1
            if (r7 == r8) goto L57
            r7 = r10
            goto L58
        L57:
            r7 = r9
        L58:
            r8 = r0 & 1
            boolean r7 = r15.S(r8, r7)
            if (r7 == 0) goto L246
            y0.l r7 = y0.l.f21818a
            r8 = 1065353216(0x3f800000, float:1.0)
            y0.o r11 = p.h1.d(r7, r8)
            r12 = 9
            float r13 = (float) r12
            r14 = 0
            y0.o r11 = p.d.n(r11, r14, r13, r10)
            p.e r13 = p.j.f9926c
            y0.e r14 = y0.b.f21804s
            p.t r12 = p.s.a(r13, r14, r15, r9)
            long r1 = r15.T
            int r1 = java.lang.Long.hashCode(r1)
            s0.h r2 = r15.l()
            y0.o r11 = y0.a.c(r15, r11)
            x1.f r17 = x1.g.f20914f
            r17.getClass()
            x1.y r9 = x1.f.f20883b
            r15.d0()
            boolean r10 = r15.S
            if (r10 == 0) goto L98
            r15.k(r9)
            goto L9b
        L98:
            r15.n0()
        L9b:
            x1.e r10 = x1.f.f20886e
            i0.r.A(r10, r15, r12)
            x1.e r12 = x1.f.f20885d
            i0.r.A(r12, r15, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            x1.e r2 = x1.f.f20887f
            i0.r.A(r2, r15, r1)
            x1.d r1 = x1.f.f20888g
            i0.r.w(r1, r15)
            r29 = r0
            x1.e r0 = x1.f.f20884c
            i0.r.A(r0, r15, r11)
            y0.o r11 = p.h1.d(r7, r8)
            y0.f r8 = y0.b.f21802q
            p.c r3 = p.j.f9924a
            r4 = 48
            p.e1 r3 = p.d1.a(r3, r8, r15, r4)
            long r4 = r15.T
            int r4 = java.lang.Long.hashCode(r4)
            s0.h r5 = r15.l()
            y0.o r8 = y0.a.c(r15, r11)
            r15.d0()
            boolean r11 = r15.S
            if (r11 == 0) goto Le1
            r15.k(r9)
            goto Le4
        Le1:
            r15.n0()
        Le4:
            i0.r.A(r10, r15, r3)
            i0.r.A(r12, r15, r5)
            j8.b.p(r4, r15, r2, r15, r1)
            i0.r.A(r0, r15, r8)
            r3 = 1065353216(0x3f800000, float:1.0)
            double r4 = (double) r3
            r19 = 0
            int r4 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r4 <= 0) goto Lfa
            goto Lff
        Lfa:
            java.lang.String r4 = "invalid weight; must be greater than zero"
            q.a.a(r4)
        Lff:
            p.q0 r4 = new p.q0
            r5 = 1
            r4.<init>(r3, r5)
            r8 = 0
            p.t r11 = p.s.a(r13, r14, r15, r8)
            long r13 = r15.T
            int r13 = java.lang.Long.hashCode(r13)
            s0.h r14 = r15.l()
            y0.o r4 = y0.a.c(r15, r4)
            r15.d0()
            boolean r3 = r15.S
            if (r3 == 0) goto L123
            r15.k(r9)
            goto L126
        L123:
            r15.n0()
        L126:
            i0.r.A(r10, r15, r11)
            i0.r.A(r12, r15, r14)
            j8.b.p(r13, r15, r2, r15, r1)
            i0.r.A(r0, r15, r4)
            r2 = r35
            java.lang.String r0 = r2.f4412c
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto L13e
            java.lang.String r0 = "微信用户"
        L13e:
            i0.m2 r1 = bi.d.f892a
            java.lang.Object r3 = r15.j(r1)
            bi.b r3 = (bi.b) r3
            long r3 = r3.g()
            r9 = 13
            long r10 = x6.d.D(r9)
            m2.k r12 = m2.k.f8698j
            r27 = 24960(0x6180, float:3.4976E-41)
            r28 = 241578(0x3afaa, float:3.38523E-40)
            r9 = r7
            r7 = 0
            r13 = 0
            r14 = 0
            r17 = 9
            r16 = 0
            r20 = r17
            r17 = 0
            r21 = 1065353216(0x3f800000, float:1.0)
            r19 = 2
            r22 = r20
            r20 = 0
            r23 = r21
            r21 = 1
            r24 = r22
            r22 = 0
            r25 = r23
            r23 = 0
            r26 = r24
            r24 = 0
            r30 = r26
            r26 = 1597440(0x186000, float:2.23849E-39)
            r6 = r0
            r0 = r8
            r31 = r25
            r25 = r40
            r32 = r3
            r4 = r9
            r8 = r32
            r3 = r31
            sh.s.n(r6, r7, r8, r10, r12, r13, r14, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r15 = r25
            java.lang.String r6 = r2.f4414e
            java.lang.String r6 = wb.ho.A4(r6)
            java.lang.Object r7 = r15.j(r1)
            bi.b r7 = (bi.b) r7
            long r8 = r7.h()
            r7 = 11
            long r10 = x6.d.D(r7)
            r27 = 0
            r28 = 262122(0x3ffea, float:3.67311E-40)
            r7 = 0
            r12 = 0
            r14 = 0
            r19 = 0
            r21 = 0
            r26 = 24576(0x6000, float:3.4438E-41)
            sh.s.n(r6, r7, r8, r10, r12, r13, r14, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r15 = r25
            r15.p(r5)
            if (r36 == 0) goto L1ee
            r6 = 87927863(0x53dac37, float:8.918368E-36)
            r15.a0(r6)
            if (r37 == 0) goto L1cd
            java.lang.String r6 = "正在删除"
            goto L1cf
        L1cd:
            java.lang.String r6 = "删除"
        L1cf:
            if (r38 == 0) goto L1d5
            if (r37 != 0) goto L1d5
            r9 = r5
            goto L1d6
        L1d5:
            r9 = r0
        L1d6:
            sh.q1 r13 = sh.c.a(r15)
            int r7 = r29 >> 9
            r16 = r7 & 112(0x70, float:1.57E-43)
            r17 = 1908(0x774, float:2.674E-42)
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r7 = r39
            sh.s.o(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r15.p(r0)
            goto L1f7
        L1ee:
            r6 = 88198865(0x541ced1, float:9.1128026E-36)
            r15.a0(r6)
            r15.p(r0)
        L1f7:
            r15.p(r5)
            java.lang.String r6 = r2.f4413d
            java.lang.Object r0 = r15.j(r1)
            bi.b r0 = (bi.b) r0
            long r8 = r0.g()
            r0 = 14
            long r10 = x6.d.D(r0)
            y0.o r16 = p.h1.d(r4, r3)
            r0 = 4
            float r0 = (float) r0
            r20 = 0
            r21 = 13
            r17 = 0
            r19 = 0
            r18 = r0
            y0.o r7 = p.d.p(r16, r17, r18, r19, r20, r21)
            r27 = 0
            r28 = 262120(0x3ffe8, float:3.67308E-40)
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 24624(0x6030, float:3.4506E-41)
            r25 = r40
            sh.s.n(r6, r7, r8, r10, r12, r13, r14, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r15 = r25
            r15.p(r5)
            goto L249
        L246:
            r15.V()
        L249:
            i0.r1 r8 = r15.t()
            if (r8 == 0) goto L262
            wb.ip r0 = new wb.ip
            r1 = r34
            r3 = r36
            r4 = r37
            r5 = r38
            r6 = r39
            r7 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.f6035d = r0
        L262:
            return
    }

    public void C(gb.o r44, gb.o r45, boolean r46, java.lang.String r47, java.util.List r48, boolean r49, java.lang.String r50, java.lang.String r51, boolean r52, boolean r53, boolean r54, boolean r55, java.lang.String r56, boolean r57, boolean r58, java.util.List r59, boolean r60, java.lang.String r61, java.lang.String r62, java.lang.String r63, java.lang.String r64, boolean r65, java.lang.String r66, fg.a r67, fg.a r68, fg.l r69, fg.l r70, fg.a r71, fg.l r72, fg.a r73, fg.l r74, fg.a r75, fg.a r76, i0.h0 r77, int r78) {
            r43 = this;
            r2 = r44
            r0 = r74
            r1 = r75
            r3 = r77
            java.lang.String r4 = r2.f4449a
            r5 = 850281242(0x32ae431a, float:2.028678E-8)
            r3.b0(r5)
            boolean r5 = r3.h(r2)
            if (r5 == 0) goto L18
            r5 = 4
            goto L19
        L18:
            r5 = 2
        L19:
            r5 = r78 | r5
            r8 = r45
            boolean r9 = r3.h(r8)
            if (r9 == 0) goto L26
            r9 = 32
            goto L28
        L26:
            r9 = 16
        L28:
            r5 = r5 | r9
            r9 = r46
            boolean r12 = r3.g(r9)
            if (r12 == 0) goto L34
            r12 = 256(0x100, float:3.59E-43)
            goto L36
        L34:
            r12 = 128(0x80, float:1.8E-43)
        L36:
            r5 = r5 | r12
            r12 = r47
            boolean r15 = r3.f(r12)
            r16 = 1024(0x400, float:1.435E-42)
            r17 = 2048(0x800, float:2.87E-42)
            if (r15 == 0) goto L46
            r15 = r17
            goto L48
        L46:
            r15 = r16
        L48:
            r5 = r5 | r15
            r15 = r48
            boolean r18 = r3.f(r15)
            r19 = 8192(0x2000, float:1.148E-41)
            r20 = 16384(0x4000, float:2.2959E-41)
            if (r18 == 0) goto L58
            r18 = r20
            goto L5a
        L58:
            r18 = r19
        L5a:
            r5 = r5 | r18
            r6 = r49
            boolean r21 = r3.g(r6)
            r22 = 65536(0x10000, float:9.1835E-41)
            r23 = 131072(0x20000, float:1.83671E-40)
            if (r21 == 0) goto L6b
            r21 = r23
            goto L6d
        L6b:
            r21 = r22
        L6d:
            r5 = r5 | r21
            r7 = r50
            boolean r24 = r3.f(r7)
            r25 = 524288(0x80000, float:7.34684E-40)
            r26 = 1048576(0x100000, float:1.469368E-39)
            if (r24 == 0) goto L7e
            r24 = r26
            goto L80
        L7e:
            r24 = r25
        L80:
            r5 = r5 | r24
            r10 = r51
            boolean r27 = r3.f(r10)
            r28 = 4194304(0x400000, float:5.877472E-39)
            r29 = 8388608(0x800000, float:1.1754944E-38)
            if (r27 == 0) goto L91
            r27 = r29
            goto L93
        L91:
            r27 = r28
        L93:
            r5 = r5 | r27
            r11 = r52
            boolean r30 = r3.g(r11)
            r31 = 33554432(0x2000000, float:9.403955E-38)
            r32 = 67108864(0x4000000, float:1.5046328E-36)
            if (r30 == 0) goto La4
            r30 = r32
            goto La6
        La4:
            r30 = r31
        La6:
            r5 = r5 | r30
            r13 = r53
            boolean r33 = r3.g(r13)
            r34 = 268435456(0x10000000, float:2.524355E-29)
            r35 = 536870912(0x20000000, float:1.0842022E-19)
            if (r33 == 0) goto Lb7
            r33 = r35
            goto Lb9
        Lb7:
            r33 = r34
        Lb9:
            r5 = r5 | r33
            r14 = r54
            boolean r36 = r3.g(r14)
            if (r36 == 0) goto Lca
            r37 = 4
        Lc5:
            r36 = r5
            r5 = r55
            goto Lcd
        Lca:
            r37 = 2
            goto Lc5
        Lcd:
            boolean r38 = r3.g(r5)
            if (r38 == 0) goto Ld6
            r38 = 32
            goto Ld8
        Ld6:
            r38 = 16
        Ld8:
            r37 = r37 | r38
            r5 = r56
            boolean r38 = r3.f(r5)
            if (r38 == 0) goto Le5
            r38 = 256(0x100, float:3.59E-43)
            goto Le7
        Le5:
            r38 = 128(0x80, float:1.8E-43)
        Le7:
            r37 = r37 | r38
            r5 = r57
            boolean r38 = r3.g(r5)
            if (r38 == 0) goto Lf3
            r16 = r17
        Lf3:
            r16 = r37 | r16
            r5 = r58
            boolean r17 = r3.g(r5)
            if (r17 == 0) goto Lff
            r19 = r20
        Lff:
            r16 = r16 | r19
            r5 = r59
            boolean r17 = r3.f(r5)
            if (r17 == 0) goto L10c
            r17 = r23
            goto L10e
        L10c:
            r17 = r22
        L10e:
            r16 = r16 | r17
            r5 = r60
            boolean r17 = r3.g(r5)
            if (r17 == 0) goto L11b
            r17 = r26
            goto L11d
        L11b:
            r17 = r25
        L11d:
            r16 = r16 | r17
            r5 = r61
            boolean r17 = r3.f(r5)
            if (r17 == 0) goto L12a
            r17 = r29
            goto L12c
        L12a:
            r17 = r28
        L12c:
            r16 = r16 | r17
            r5 = r62
            boolean r17 = r3.f(r5)
            if (r17 == 0) goto L138
            r31 = r32
        L138:
            r16 = r16 | r31
            r5 = r63
            boolean r17 = r3.f(r5)
            if (r17 == 0) goto L145
            r17 = r35
            goto L147
        L145:
            r17 = r34
        L147:
            r16 = r16 | r17
            r5 = r64
            boolean r17 = r3.f(r5)
            if (r17 == 0) goto L154
            r17 = 4
            goto L156
        L154:
            r17 = 2
        L156:
            r19 = 100690944(0x6006c00, float:2.415347E-35)
            r17 = r19 | r17
            r5 = r65
            boolean r19 = r3.g(r5)
            if (r19 == 0) goto L166
            r19 = 32
            goto L168
        L166:
            r19 = 16
        L168:
            r17 = r17 | r19
            r5 = r66
            boolean r19 = r3.f(r5)
            if (r19 == 0) goto L175
            r30 = 256(0x100, float:3.59E-43)
            goto L177
        L175:
            r30 = 128(0x80, float:1.8E-43)
        L177:
            r17 = r17 | r30
            r5 = r69
            boolean r19 = r3.h(r5)
            if (r19 == 0) goto L183
            r22 = r23
        L183:
            r17 = r17 | r22
            r5 = r70
            boolean r19 = r3.h(r5)
            if (r19 == 0) goto L18f
            r25 = r26
        L18f:
            r17 = r17 | r25
            r5 = r71
            boolean r19 = r3.h(r5)
            if (r19 == 0) goto L19b
            r28 = r29
        L19b:
            r17 = r17 | r28
            r5 = r73
            boolean r19 = r3.h(r5)
            if (r19 == 0) goto L1a7
            r34 = r35
        L1a7:
            r17 = r17 | r34
            boolean r19 = r3.h(r0)
            if (r19 == 0) goto L1b2
            r18 = 4
            goto L1b4
        L1b2:
            r18 = 2
        L1b4:
            r19 = 3456(0xd80, float:4.843E-42)
            r18 = r19 | r18
            boolean r19 = r3.h(r1)
            if (r19 == 0) goto L1c1
            r24 = 32
            goto L1c3
        L1c1:
            r24 = 16
        L1c3:
            r0 = r18 | r24
            r18 = 306783379(0x12492493, float:6.34695E-28)
            r1 = r36 & r18
            r5 = 306783378(0x12492492, float:6.3469493E-28)
            r19 = 1
            r6 = 0
            if (r1 != r5) goto L1e3
            r1 = r16 & r18
            if (r1 != r5) goto L1e3
            r1 = r17 & r18
            if (r1 != r5) goto L1e3
            r0 = r0 & 147(0x93, float:2.06E-43)
            r1 = 146(0x92, float:2.05E-43)
            if (r0 == r1) goto L1e1
            goto L1e3
        L1e1:
            r0 = r6
            goto L1e5
        L1e3:
            r0 = r19
        L1e5:
            r1 = r36 & 1
            boolean r0 = r3.S(r1, r0)
            if (r0 == 0) goto L372
            i0.m2 r0 = y1.i0.f21966b
            java.lang.Object r0 = r3.j(r0)
            r29 = r0
            android.content.Context r29 = (android.content.Context) r29
            boolean r0 = r3.f(r4)
            java.lang.Object r1 = r3.P()
            i0.e r5 = i0.l.f5952a
            if (r0 != 0) goto L205
            if (r1 != r5) goto L20e
        L205:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            i0.j1 r1 = i0.r.u(r0)
            r3.k0(r1)
        L20e:
            r32 = r1
            i0.a1 r32 = (i0.a1) r32
            boolean r0 = r3.f(r4)
            java.lang.Object r1 = r3.P()
            if (r0 != 0) goto L21e
            if (r1 != r5) goto L226
        L21e:
            r0 = 0
            i0.j1 r1 = i0.r.u(r0)
            r3.k0(r1)
        L226:
            r19 = r1
            i0.a1 r19 = (i0.a1) r19
            java.lang.String r0 = r2.f4451c
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto L234
            java.lang.String r0 = "插件详情"
        L234:
            r35 = r0
            wb.fp r0 = new wb.fp
            r21 = r49
            r31 = r55
            r28 = r56
            r3 = r57
            r4 = r58
            r6 = r60
            r24 = r67
            r18 = r68
            r34 = r69
            r25 = r70
            r16 = r72
            r17 = r73
            r30 = r76
            r39 = r5
            r22 = r7
            r1 = r8
            r26 = r9
            r23 = r10
            r33 = r11
            r27 = r12
            r20 = r15
            r5 = r59
            r7 = r61
            r8 = r62
            r9 = r63
            r10 = r64
            r11 = r65
            r12 = r66
            r15 = r71
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r1 = -1463763653(0xffffffffa8c0bd3b, float:-2.1398348E-14)
            r3 = r77
            s0.d r15 = s0.i.e(r1, r0, r3)
            r17 = 100663302(0x6000006, float:2.4074142E-35)
            r18 = 3072(0xc00, float:4.305E-42)
            r0 = 0
            r2 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r9 = r76
            r16 = r77
            r1 = r35
            oh.h.d(r0, r1, r2, r4, r6, r8, r9, r10, r12, r14, r15, r16, r17, r18)
            r3 = r16
            java.lang.Object r0 = r32.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L300
            r0 = -979154188(0xffffffffc5a34af4, float:-5225.369)
            r3.a0(r0)
            r1 = r32
            boolean r0 = r3.f(r1)
            java.lang.Object r2 = r3.P()
            if (r0 != 0) goto L2bd
            r0 = r39
            if (r2 != r0) goto L2c9
            goto L2bf
        L2bd:
            r0 = r39
        L2bf:
            wb.gl r2 = new wb.gl
            r4 = 25
            r2.<init>(r1, r4)
            r3.k0(r2)
        L2c9:
            r9 = r2
            fg.a r9 = (fg.a) r9
            wb.rj r2 = new wb.rj
            r4 = 7
            r5 = r44
            r6 = r75
            r2.<init>(r5, r1, r6, r4)
            r1 = 24067008(0x16f3bc0, float:4.3940236E-38)
            s0.d r15 = s0.i.e(r1, r2, r3)
            r17 = 390(0x186, float:5.47E-43)
            r18 = 3072(0xc00, float:4.305E-42)
            r39 = r0
            r0 = 0
            java.lang.String r1 = "删除线上插件"
            r2 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r16 = r77
            r41 = r39
            oh.h.d(r0, r1, r2, r4, r6, r8, r9, r10, r12, r14, r15, r16, r17, r18)
            r3 = r16
            r0 = 0
            r3.p(r0)
            goto L30c
        L300:
            r41 = r39
            r0 = 0
            r1 = -977751128(0xffffffffc5b8b3a8, float:-5910.457)
            r3.a0(r1)
            r3.p(r0)
        L30c:
            java.lang.Object r1 = r19.getValue()
            gb.c r1 = (gb.c) r1
            if (r1 != 0) goto L31e
            r1 = -977679984(0xffffffffc5b9c990, float:-5945.1953)
            r3.a0(r1)
            r3.p(r0)
            goto L375
        L31e:
            r2 = -977679983(0xffffffffc5b9c991, float:-5945.196)
            r3.a0(r2)
            r2 = r19
            boolean r4 = r3.f(r2)
            java.lang.Object r5 = r3.P()
            if (r4 != 0) goto L334
            r4 = r41
            if (r5 != r4) goto L33e
        L334:
            wb.gl r5 = new wb.gl
            r4 = 27
            r5.<init>(r2, r4)
            r3.k0(r5)
        L33e:
            r9 = r5
            fg.a r9 = (fg.a) r9
            wb.rj r4 = new wb.rj
            r5 = 9
            r6 = r74
            r4.<init>(r2, r6, r1, r5)
            r1 = 1994234032(0x76dd98b0, float:2.2472548E33)
            s0.d r15 = s0.i.e(r1, r4, r3)
            r17 = 390(0x186, float:5.47E-43)
            r18 = 3072(0xc00, float:4.305E-42)
            r40 = r0
            r0 = 0
            java.lang.String r1 = "删除评论"
            r2 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r16 = r77
            oh.h.d(r0, r1, r2, r4, r6, r8, r9, r10, r12, r14, r15, r16, r17, r18)
            r3 = r16
            r0 = 0
            r3.p(r0)
            goto L375
        L372:
            r3.V()
        L375:
            i0.r1 r0 = r3.t()
            if (r0 == 0) goto L3cd
            r1 = r0
            wb.fp r0 = new wb.fp
            r2 = r44
            r3 = r45
            r4 = r46
            r5 = r47
            r6 = r48
            r7 = r49
            r8 = r50
            r9 = r51
            r10 = r52
            r11 = r53
            r12 = r54
            r13 = r55
            r14 = r56
            r15 = r57
            r16 = r58
            r17 = r59
            r18 = r60
            r19 = r61
            r20 = r62
            r21 = r63
            r22 = r64
            r23 = r65
            r24 = r66
            r25 = r67
            r26 = r68
            r27 = r69
            r28 = r70
            r29 = r71
            r30 = r72
            r31 = r73
            r32 = r74
            r33 = r75
            r34 = r76
            r35 = r78
            r42 = r1
            r1 = r43
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r1 = r42
            r1.f6035d = r0
        L3cd:
            return
    }

    public void C1(java.lang.String r28, fg.l r29, i0.h0 r30, int r31) {
            r27 = this;
            r0 = r28
            r14 = r30
            r1 = -1610331783(0xffffffffa0044979, float:-1.1205145E-19)
            r14.b0(r1)
            boolean r1 = r14.f(r0)
            if (r1 == 0) goto L12
            r1 = 4
            goto L13
        L12:
            r1 = 2
        L13:
            r1 = r31 | r1
            r3 = r29
            boolean r2 = r14.h(r3)
            if (r2 == 0) goto L20
            r2 = 32
            goto L22
        L20:
            r2 = 16
        L22:
            r1 = r1 | r2
            r2 = r1 & 19
            r4 = 18
            if (r2 == r4) goto L2b
            r2 = 1
            goto L2c
        L2b:
            r2 = 0
        L2c:
            r4 = r1 & 1
            boolean r2 = r14.S(r4, r2)
            if (r2 == 0) goto Lb9
            i2.n0 r15 = new i2.n0
            i0.m2 r2 = bi.d.f892a
            java.lang.Object r4 = r14.j(r2)
            bi.b r4 = (bi.b) r4
            long r16 = r4.g()
            r4 = 14
            long r18 = x6.d.D(r4)
            r24 = 0
            r26 = 16777212(0xfffffc, float:2.3509881E-38)
            r20 = 0
            r21 = 0
            r23 = 0
            r15.<init>(r16, r18, r20, r21, r23, r24, r26)
            f1.t0 r12 = new f1.t0
            java.lang.Object r4 = r14.j(r2)
            bi.b r4 = (bi.b) r4
            long r4 = r4.j()
            r12.<init>(r4)
            y0.l r4 = y0.l.f21818a
            r5 = 1065353216(0x3f800000, float:1.0)
            y0.o r4 = p.h1.d(r4, r5)
            r5 = 12
            float r5 = (float) r5
            v.d r6 = v.e.a(r5)
            y0.o r4 = c1.h.b(r4, r6)
            java.lang.Object r2 = r14.j(r2)
            bi.b r2 = (bi.b) r2
            long r6 = r2.k()
            f1.m0 r2 = f1.c0.f3038b
            y0.o r2 = k.n.g(r4, r6, r2)
            r4 = 10
            float r4 = (float) r4
            y0.o r2 = p.d.m(r2, r5, r4)
            sh.d r4 = new sh.d
            r5 = 8
            r4.<init>(r0, r5)
            r5 = -1095613156(0xffffffffbeb2451c, float:-0.3481835)
            s0.d r13 = s0.i.e(r5, r4, r14)
            r4 = r1 & 14
            r5 = 100663296(0x6000000, float:2.4074124E-35)
            r4 = r4 | r5
            r1 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 | r4
            r16 = 196608(0x30000, float:2.75506E-40)
            r17 = 16088(0x3ed8, float:2.2544E-41)
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r4 = r15
            r15 = r1
            r1 = r29
            w.i.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto Lbc
        Lb9:
            r30.V()
        Lbc:
            i0.r1 r6 = r30.t()
            if (r6 == 0) goto Ld3
            wb.rj r0 = new wb.rj
            r5 = 26
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r31
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f6035d = r0
        Ld3:
            return
    }

    public void D(java.lang.String r33, java.lang.String r34, i0.h0 r35, int r36) {
            r32 = this;
            r0 = r35
            r1 = 152954284(0x91de5ac, float:1.9006179E-33)
            r0.b0(r1)
            r1 = r34
            boolean r2 = r0.f(r1)
            r3 = 16
            if (r2 == 0) goto L15
            r2 = 32
            goto L16
        L15:
            r2 = r3
        L16:
            r23 = r36 | r2
            r2 = r23 & 19
            r4 = 18
            r5 = 1
            if (r2 == r4) goto L21
            r2 = r5
            goto L22
        L21:
            r2 = 0
        L22:
            r4 = r23 & 1
            boolean r2 = r0.S(r4, r2)
            if (r2 == 0) goto L13a
            y0.l r2 = y0.l.f21818a
            r4 = 1065353216(0x3f800000, float:1.0)
            y0.o r2 = p.h1.d(r2, r4)
            r6 = 4
            float r6 = (float) r6
            r7 = 0
            y0.o r2 = p.d.n(r2, r7, r6, r5)
            p.f r6 = p.j.f9929f
            y0.f r7 = y0.b.f21801p
            r8 = 54
            p.e1 r6 = p.d1.a(r6, r7, r0, r8)
            long r7 = r0.T
            int r7 = java.lang.Long.hashCode(r7)
            s0.h r8 = r0.l()
            y0.o r2 = y0.a.c(r0, r2)
            x1.f r9 = x1.g.f20914f
            r9.getClass()
            x1.y r9 = x1.f.f20883b
            r0.d0()
            boolean r10 = r0.S
            if (r10 == 0) goto L63
            r0.k(r9)
            goto L66
        L63:
            r0.n0()
        L66:
            x1.e r9 = x1.f.f20886e
            i0.r.A(r9, r0, r6)
            x1.e r6 = x1.f.f20885d
            i0.r.A(r6, r0, r8)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            x1.e r7 = x1.f.f20887f
            i0.r.A(r7, r0, r6)
            x1.d r6 = x1.f.f20888g
            i0.r.w(r6, r0)
            x1.e r6 = x1.f.f20884c
            i0.r.A(r6, r0, r2)
            i0.m2 r2 = bi.d.f892a
            java.lang.Object r6 = r0.j(r2)
            bi.b r6 = (bi.b) r6
            long r6 = r6.h()
            r24 = 13
            r8 = r4
            r9 = r5
            long r4 = x6.d.D(r24)
            r21 = 0
            r22 = 262122(0x3ffea, float:3.67311E-40)
            r1 = 0
            r10 = r3
            r30 = r6
            r7 = r2
            r2 = r30
            r6 = 0
            r11 = r7
            r7 = 0
            r12 = r8
            r13 = r9
            r8 = 0
            r14 = r10
            r10 = 0
            r15 = r11
            r16 = r12
            r11 = 0
            r17 = r13
            r13 = 0
            r18 = r14
            r14 = 0
            r19 = r15
            r15 = 0
            r20 = r16
            r16 = 0
            r25 = r17
            r17 = 0
            r26 = r18
            r18 = 0
            r27 = r20
            r20 = 24582(0x6006, float:3.4447E-41)
            r28 = r19
            r19 = r0
            r0 = r33
            sh.s.n(r0, r1, r2, r4, r6, r7, r8, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r0 = r19
            r11 = r28
            java.lang.Object r1 = r0.j(r11)
            bi.b r1 = (bi.b) r1
            long r2 = r1.g()
            long r4 = x6.d.D(r24)
            r12 = 1065353216(0x3f800000, float:1.0)
            double r6 = (double) r12
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 <= 0) goto Lef
            goto Lf4
        Lef:
            java.lang.String r1 = "invalid weight; must be greater than zero"
            q.a.a(r1)
        Lf4:
            p.q0 r6 = new p.q0
            r1 = 1
            r6.<init>(r12, r1)
            r14 = 16
            float r7 = (float) r14
            r10 = 0
            r11 = 14
            r8 = 0
            r9 = 0
            y0.o r6 = p.d.p(r6, r7, r8, r9, r10, r11)
            t2.k r10 = new t2.k
            r7 = 6
            r10.<init>(r7)
            int r7 = r23 >> 3
            r7 = r7 & 14
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
            r21 = 0
            r22 = 261096(0x3fbe8, float:3.65873E-40)
            r13 = r1
            r1 = r6
            r6 = 0
            r20 = r7
            r7 = 0
            r8 = 0
            r11 = 0
            r29 = r13
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = r0
            r0 = r34
            sh.s.n(r0, r1, r2, r4, r6, r7, r8, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r0 = r19
            r13 = 1
            r0.p(r13)
            goto L13d
        L13a:
            r0.V()
        L13d:
            i0.r1 r0 = r0.t()
            if (r0 == 0) goto L154
            wb.rj r2 = new wb.rj
            r7 = 8
            r3 = r32
            r4 = r33
            r5 = r34
            r6 = r36
            r2.<init>(r3, r4, r5, r6, r7)
            r0.f6035d = r2
        L154:
            return
    }

    public void D1(android.content.Context r13, java.lang.String r14, y0.o r15, long r16, long r18, i0.h0 r20, int r21) {
            r12 = this;
            r9 = r20
            r13.getClass()
            r14.getClass()
            r0 = 346585058(0x14a877e2, float:1.701095E-26)
            r9.b0(r0)
            boolean r0 = r9.h(r13)
            if (r0 == 0) goto L16
            r0 = 4
            goto L17
        L16:
            r0 = 2
        L17:
            r0 = r21 | r0
            boolean r1 = r9.f(r14)
            if (r1 == 0) goto L22
            r1 = 32
            goto L24
        L22:
            r1 = 16
        L24:
            r0 = r0 | r1
            r6 = r16
            boolean r1 = r9.e(r6)
            if (r1 == 0) goto L30
            r1 = 2048(0x800, float:2.87E-42)
            goto L32
        L30:
            r1 = 1024(0x400, float:1.435E-42)
        L32:
            r0 = r0 | r1
            r1 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 | r1
            r1 = 599187(0x92493, float:8.3964E-40)
            r1 = r1 & r0
            r2 = 599186(0x92492, float:8.39638E-40)
            r3 = 0
            if (r1 == r2) goto L42
            r1 = 1
            goto L43
        L42:
            r1 = r3
        L43:
            r2 = r0 & 1
            boolean r1 = r9.S(r2, r1)
            if (r1 == 0) goto L7f
            r9.X()
            r1 = r21 & 1
            if (r1 == 0) goto L5c
            boolean r1 = r9.B()
            if (r1 == 0) goto L59
            goto L5c
        L59:
            r9.V()
        L5c:
            r9.q()
            wb.y4 r2 = new wb.y4
            r2.<init>(r3)
            r1 = r0 & 126(0x7e, float:1.77E-43)
            int r0 = r0 << 3
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r3 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r3
            r0 = r0 | r1
            r1 = 14352384(0xdb0000, float:2.0111974E-38)
            r10 = r0 | r1
            r11 = 0
            r8 = 0
            r0 = r13
            r1 = r14
            r3 = r15
            r4 = r6
            r6 = r18
            x(r0, r1, r2, r3, r4, r6, r8, r9, r10, r11)
            goto L82
        L7f:
            r20.V()
        L82:
            i0.r1 r0 = r20.t()
            if (r0 == 0) goto L99
            wb.v4 r1 = new wb.v4
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r8 = r18
            r10 = r21
            r1.<init>(r2, r3, r4, r5, r6, r8, r10)
            r0.f6035d = r1
        L99:
            return
    }

    public void E(gb.o r31, fg.a r32, i0.h0 r33, int r34) {
            r30 = this;
            r2 = r31
            r3 = r32
            r0 = r33
            r1 = 13707328(0xd12840, float:1.9208058E-38)
            r0.b0(r1)
            boolean r1 = r0.h(r2)
            if (r1 == 0) goto L14
            r1 = 4
            goto L15
        L14:
            r1 = 2
        L15:
            r1 = r34 | r1
            boolean r4 = r0.h(r3)
            r5 = 16
            if (r4 == 0) goto L22
            r4 = 32
            goto L23
        L22:
            r4 = r5
        L23:
            r1 = r1 | r4
            r4 = r1 & 19
            r6 = 18
            r7 = 0
            r8 = 1
            if (r4 == r6) goto L2e
            r4 = r8
            goto L2f
        L2e:
            r4 = r7
        L2f:
            r1 = r1 & r8
            boolean r1 = r0.S(r1, r4)
            if (r1 == 0) goto L243
            java.lang.Object r1 = r0.P()
            i0.e r4 = i0.l.f5952a
            if (r1 != r4) goto L47
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            i0.j1 r1 = i0.r.u(r1)
            r0.k0(r1)
        L47:
            i0.a1 r1 = (i0.a1) r1
            java.lang.Object r6 = r1.getValue()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            long r9 = wb.ho.L6(r6, r0)
            y0.l r6 = y0.l.f21818a
            r11 = 1065353216(0x3f800000, float:1.0)
            y0.o r12 = p.h1.d(r6, r11)
            r13 = 12
            float r14 = (float) r13
            v.d r14 = v.e.a(r14)
            y0.o r12 = c1.h.b(r12, r14)
            f1.m0 r14 = f1.c0.f3038b
            y0.o r9 = k.n.g(r12, r9, r14)
            java.lang.Object r10 = r0.P()
            if (r10 != r4) goto L7f
            wb.lp r10 = new wb.lp
            r4 = 0
            r10.<init>(r1, r4)
            r0.k0(r10)
        L7f:
            fg.l r10 = (fg.l) r10
            y0.o r1 = wb.ho.N6(r9, r3, r10)
            float r4 = (float) r5
            r5 = 14
            float r5 = (float) r5
            y0.o r1 = p.d.m(r1, r4, r5)
            y0.f r4 = y0.b.f21802q
            p.c r5 = p.j.f9924a
            r9 = 48
            p.e1 r4 = p.d1.a(r5, r4, r0, r9)
            long r9 = r0.T
            int r5 = java.lang.Long.hashCode(r9)
            s0.h r9 = r0.l()
            y0.o r1 = y0.a.c(r0, r1)
            x1.f r10 = x1.g.f20914f
            r10.getClass()
            x1.y r10 = x1.f.f20883b
            r0.d0()
            boolean r12 = r0.S
            if (r12 == 0) goto Lb7
            r0.k(r10)
            goto Lba
        Lb7:
            r0.n0()
        Lba:
            x1.e r12 = x1.f.f20886e
            i0.r.A(r12, r0, r4)
            x1.e r4 = x1.f.f20885d
            i0.r.A(r4, r0, r9)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            x1.e r9 = x1.f.f20887f
            i0.r.A(r9, r0, r5)
            x1.d r5 = x1.f.f20888g
            i0.r.w(r5, r0)
            x1.e r14 = x1.f.f20884c
            i0.r.A(r14, r0, r1)
            r15 = r14
            double r13 = (double) r11
            r16 = 0
            int r13 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r13 <= 0) goto Le0
            goto Le5
        Le0:
            java.lang.String r13 = "invalid weight; must be greater than zero"
            q.a.a(r13)
        Le5:
            p.q0 r13 = new p.q0
            r13.<init>(r11, r8)
            p.e r11 = p.j.f9926c
            y0.e r14 = y0.b.f21804s
            p.t r7 = p.s.a(r11, r14, r0, r7)
            long r1 = r0.T
            int r1 = java.lang.Long.hashCode(r1)
            s0.h r2 = r0.l()
            y0.o r13 = y0.a.c(r0, r13)
            r0.d0()
            boolean r14 = r0.S
            if (r14 == 0) goto L10b
            r0.k(r10)
            goto L10e
        L10b:
            r0.n0()
        L10e:
            i0.r.A(r12, r0, r7)
            i0.r.A(r4, r0, r2)
            j8.b.p(r1, r0, r9, r0, r5)
            i0.r.A(r15, r0, r13)
            r2 = r31
            java.lang.String r1 = r2.f4451c
            boolean r4 = og.m.t0(r1)
            if (r4 == 0) goto L126
            java.lang.String r1 = r2.f4449a
        L126:
            r4 = r1
            i0.m2 r1 = bi.d.f892a
            java.lang.Object r5 = r0.j(r1)
            bi.b r5 = (bi.b) r5
            long r9 = r5.g()
            r5 = r6
            r6 = r9
            m2.k r10 = m2.k.f8698j
            r25 = 24960(0x6180, float:3.4976E-41)
            r26 = 241594(0x3afba, float:3.38545E-40)
            r9 = r5
            r5 = 0
            r12 = r8
            r13 = r9
            r8 = 0
            r14 = 12
            r11 = 0
            r15 = r12
            r16 = r13
            r12 = 0
            r17 = r14
            r14 = 0
            r18 = r15
            r19 = r16
            r15 = 0
            r20 = r17
            r17 = 2
            r21 = r18
            r18 = 0
            r22 = r19
            r19 = 1
            r23 = r20
            r20 = 0
            r24 = r21
            r21 = 0
            r27 = r22
            r22 = 0
            r28 = r24
            r24 = 1572864(0x180000, float:2.204052E-39)
            r29 = r23
            r23 = r0
            r0 = r28
            r28 = r27
            r27 = r29
            sh.s.n(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r4 = r23
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "作者: "
            r5.<init>(r6)
            java.lang.String r6 = r2.f4452d
            boolean r7 = og.m.t0(r6)
            java.lang.String r8 = "未知"
            if (r7 == 0) goto L190
            r6 = r8
        L190:
            r5.append(r6)
            java.lang.String r6 = " | 版本: "
            r5.append(r6)
            java.lang.String r6 = r2.f4453e
            boolean r7 = og.m.t0(r6)
            if (r7 == 0) goto L1a1
            goto L1a2
        L1a1:
            r8 = r6
        L1a2:
            r5.append(r8)
            java.lang.String r6 = " | 下载: "
            r5.append(r6)
            long r6 = r2.f4456h
            r5.append(r6)
            java.lang.String r6 = "\n点赞: "
            r5.append(r6)
            long r6 = r2.f4457i
            r5.append(r6)
            java.lang.String r6 = " | 评论: "
            r5.append(r6)
            long r6 = r2.f4458j
            r5.append(r6)
            java.lang.String r6 = "\n更新: "
            r5.append(r6)
            java.lang.String r6 = r2.f4455g
            java.lang.String r6 = wb.ho.A4(r6)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object r6 = r4.j(r1)
            bi.b r6 = (bi.b) r6
            long r6 = r6.h()
            long r8 = x6.d.D(r27)
            r25 = 24960(0x6180, float:3.4976E-41)
            r26 = 241642(0x3afea, float:3.38613E-40)
            r4 = r5
            r5 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r17 = 2
            r18 = 0
            r19 = 3
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 24576(0x6000, float:3.4438E-41)
            r23 = r33
            sh.s.n(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r4 = r23
            r4.p(r0)
            java.lang.Object r1 = r4.j(r1)
            bi.b r1 = (bi.b) r1
            long r6 = r1.h()
            r1 = 22
            long r8 = x6.d.D(r1)
            r1 = 8
            float r12 = (float) r1
            r15 = 0
            r16 = 14
            r13 = 0
            r14 = 0
            r11 = r28
            y0.o r5 = p.d.p(r11, r12, r13, r14, r15, r16)
            r25 = 0
            r26 = 262120(0x3ffe8, float:3.67308E-40)
            java.lang.String r4 = "›"
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r19 = 0
            r24 = 24630(0x6036, float:3.4514E-41)
            sh.s.n(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r4 = r23
            r4.p(r0)
            goto L247
        L243:
            r4 = r0
            r4.V()
        L247:
            i0.r1 r6 = r4.t()
            if (r6 == 0) goto L25a
            wb.rj r0 = new wb.rj
            r5 = 10
            r1 = r30
            r4 = r34
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f6035d = r0
        L25a:
            return
    }

    public void F(long r45, long r47, boolean r49, boolean r50, java.util.List r51, boolean r52, java.lang.String r53, java.lang.String r54, java.lang.String r55, java.lang.String r56, boolean r57, java.lang.String r58, boolean r59, fg.a r60, fg.l r61, fg.a r62, fg.a r63, fg.l r64, i0.h0 r65, int r66) {
            r44 = this;
            r2 = r45
            r4 = r47
            r6 = r49
            r7 = r50
            r9 = r52
            r10 = r53
            r11 = r54
            r12 = r56
            r0 = r57
            r1 = r58
            r8 = r59
            r13 = r64
            r14 = r65
            r15 = 1043071115(0x3e2c008b, float:0.16797082)
            r14.b0(r15)
            boolean r15 = r14.e(r2)
            r16 = 2
            if (r15 == 0) goto L2a
            r3 = 4
            goto L2c
        L2a:
            r3 = r16
        L2c:
            r3 = r66 | r3
            boolean r15 = r14.e(r4)
            r17 = 32
            if (r15 == 0) goto L39
            r15 = r17
            goto L3b
        L39:
            r15 = 16
        L3b:
            r3 = r3 | r15
            boolean r15 = r14.g(r6)
            r18 = 128(0x80, float:1.8E-43)
            r19 = 256(0x100, float:3.59E-43)
            if (r15 == 0) goto L49
            r15 = r19
            goto L4b
        L49:
            r15 = r18
        L4b:
            r3 = r3 | r15
            boolean r15 = r14.g(r7)
            r20 = 1024(0x400, float:1.435E-42)
            r21 = 2048(0x800, float:2.87E-42)
            if (r15 == 0) goto L59
            r15 = r21
            goto L5b
        L59:
            r15 = r20
        L5b:
            r3 = r3 | r15
            r15 = r51
            boolean r22 = r14.f(r15)
            r23 = 8192(0x2000, float:1.148E-41)
            r24 = 16384(0x4000, float:2.2959E-41)
            if (r22 == 0) goto L6b
            r22 = r24
            goto L6d
        L6b:
            r22 = r23
        L6d:
            r3 = r3 | r22
            boolean r22 = r14.g(r9)
            r25 = 65536(0x10000, float:9.1835E-41)
            r26 = 131072(0x20000, float:1.83671E-40)
            if (r22 == 0) goto L7c
            r22 = r26
            goto L7e
        L7c:
            r22 = r25
        L7e:
            r3 = r3 | r22
            boolean r22 = r14.f(r10)
            r27 = 524288(0x80000, float:7.34684E-40)
            r28 = 1048576(0x100000, float:1.469368E-39)
            if (r22 == 0) goto L8d
            r22 = r28
            goto L8f
        L8d:
            r22 = r27
        L8f:
            r3 = r3 | r22
            boolean r22 = r14.f(r11)
            r29 = 4194304(0x400000, float:5.877472E-39)
            if (r22 == 0) goto L9c
            r22 = 8388608(0x800000, float:1.1754944E-38)
            goto L9e
        L9c:
            r22 = r29
        L9e:
            r3 = r3 | r22
            r2 = r55
            boolean r22 = r14.f(r2)
            if (r22 == 0) goto Lab
            r22 = 67108864(0x4000000, float:1.5046328E-36)
            goto Lad
        Lab:
            r22 = 33554432(0x2000000, float:9.403955E-38)
        Lad:
            r3 = r3 | r22
            boolean r22 = r14.f(r12)
            if (r22 == 0) goto Lb8
            r22 = 536870912(0x20000000, float:1.0842022E-19)
            goto Lba
        Lb8:
            r22 = 268435456(0x10000000, float:2.524355E-29)
        Lba:
            r3 = r3 | r22
            boolean r22 = r14.g(r0)
            if (r22 == 0) goto Lc4
            r16 = 4
        Lc4:
            r22 = 100663296(0x6000000, float:2.4074124E-35)
            r16 = r22 | r16
            boolean r22 = r14.f(r1)
            if (r22 == 0) goto Lcf
            goto Ld1
        Lcf:
            r17 = 16
        Ld1:
            r16 = r16 | r17
            boolean r17 = r14.g(r8)
            if (r17 == 0) goto Ldb
            r18 = r19
        Ldb:
            r16 = r16 | r18
            r0 = r60
            boolean r17 = r14.h(r0)
            if (r17 == 0) goto Le7
            r20 = r21
        Le7:
            r16 = r16 | r20
            r0 = r61
            boolean r17 = r14.h(r0)
            if (r17 == 0) goto Lf3
            r23 = r24
        Lf3:
            r16 = r16 | r23
            r0 = r62
            boolean r17 = r14.h(r0)
            if (r17 == 0) goto Lff
            r25 = r26
        Lff:
            r16 = r16 | r25
            r0 = r63
            boolean r17 = r14.h(r0)
            if (r17 == 0) goto L10b
            r27 = r28
        L10b:
            r16 = r16 | r27
            boolean r17 = r14.h(r13)
            if (r17 == 0) goto L115
            r29 = 8388608(0x800000, float:1.1754944E-38)
        L115:
            r38 = r16 | r29
            r16 = 306783379(0x12492493, float:6.34695E-28)
            r0 = r3 & r16
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            r39 = r3
            if (r0 != r2) goto L130
            r0 = 4793491(0x492493, float:6.717112E-39)
            r0 = r38 & r0
            r2 = 4793490(0x492492, float:6.71711E-39)
            if (r0 == r2) goto L12e
            goto L130
        L12e:
            r0 = 0
            goto L131
        L130:
            r0 = 1
        L131:
            r2 = r39 & 1
            boolean r0 = r14.S(r2, r0)
            if (r0 == 0) goto L626
            bi.b r0 = g4.a.r(r14)
            long r16 = r0.h()
            r0 = 12
            long r18 = x6.d.D(r0)
            r2 = 16
            float r2 = (float) r2
            r24 = 0
            r25 = 13
            y0.l r26 = y0.l.f21818a
            r21 = 0
            r23 = 0
            r22 = r2
            r20 = r26
            y0.o r2 = p.d.p(r20, r21, r22, r23, r24, r25)
            r40 = r0
            r0 = r20
            r35 = 0
            r36 = 262120(0x3ffe8, float:3.67308E-40)
            java.lang.String r14 = "互动"
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r34 = 24630(0x6036, float:3.4514E-41)
            r33 = r65
            r15 = r2
            sh.s.n(r14, r15, r16, r18, r20, r21, r22, r24, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r14 = r33
            r2 = 1065353216(0x3f800000, float:1.0)
            y0.o r15 = p.h1.d(r0, r2)
            r3 = 4
            float r3 = (float) r3
            r19 = 0
            r20 = 13
            r16 = 0
            r18 = 0
            r17 = r3
            y0.o r3 = p.d.p(r15, r16, r17, r18, r19, r20)
            r37 = r17
            r15 = 10
            float r15 = (float) r15
            p.h r2 = p.j.g(r15)
            r41 = r0
            y0.f r0 = y0.b.f21802q
            r6 = 54
            p.e1 r2 = p.d1.a(r2, r0, r14, r6)
            long r6 = r14.T
            int r6 = java.lang.Long.hashCode(r6)
            s0.h r7 = r14.l()
            y0.o r3 = y0.a.c(r14, r3)
            x1.f r16 = x1.g.f20914f
            r16.getClass()
            r16 = r6
            x1.y r6 = x1.f.f20883b
            r14.d0()
            boolean r8 = r14.S
            if (r8 == 0) goto L1d2
            r14.k(r6)
            goto L1d5
        L1d2:
            r14.n0()
        L1d5:
            x1.e r8 = x1.f.f20886e
            i0.r.A(r8, r14, r2)
            x1.e r2 = x1.f.f20885d
            i0.r.A(r2, r14, r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r16)
            x1.e r9 = x1.f.f20887f
            i0.r.A(r9, r14, r7)
            x1.d r7 = x1.f.f20888g
            i0.r.w(r7, r14)
            x1.e r1 = x1.f.f20884c
            i0.r.A(r1, r14, r3)
            if (r50 == 0) goto L1f7
            java.lang.String r3 = "正在处理"
            goto L1fe
        L1f7:
            if (r49 == 0) goto L1fc
            java.lang.String r3 = "取消点赞"
            goto L1fe
        L1fc:
            java.lang.String r3 = "点赞"
        L1fe:
            if (r59 == 0) goto L20f
            boolean r16 = og.m.t0(r11)
            if (r16 != 0) goto L20f
            if (r50 != 0) goto L20f
            r17 = 1
        L20a:
            r16 = r3
            r3 = 1065353216(0x3f800000, float:1.0)
            goto L212
        L20f:
            r17 = 0
            goto L20a
        L212:
            double r13 = (double) r3
            r26 = 0
            int r13 = (r13 > r26 ? 1 : (r13 == r26 ? 0 : -1))
            java.lang.String r28 = "invalid weight; must be greater than zero"
            if (r13 <= 0) goto L21c
            goto L21f
        L21c:
            q.a.a(r28)
        L21f:
            p.q0 r13 = new p.q0
            r14 = 1
            r13.<init>(r3, r14)
            sh.q1 r21 = sh.c.a(r65)
            int r3 = r38 >> 6
            r24 = r3 & 112(0x70, float:1.57E-43)
            r25 = 1904(0x770, float:2.668E-42)
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = r65
            r3 = r15
            r14 = r16
            r15 = r60
            r16 = r13
            sh.s.o(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r14 = r45
            r13.append(r14)
            r42 = r3
            java.lang.String r3 = " 个赞 · "
            r13.append(r3)
            r13.append(r4)
            java.lang.String r3 = " 条评论"
            r13.append(r3)
            java.lang.String r3 = r13.toString()
            bi.b r13 = g4.a.r(r65)
            long r16 = r13.h()
            r13 = 13
            long r18 = x6.d.D(r13)
            r13 = 1065353216(0x3f800000, float:1.0)
            double r14 = (double) r13
            int r14 = (r14 > r26 ? 1 : (r14 == r26 ? 0 : -1))
            if (r14 <= 0) goto L276
            goto L279
        L276:
            q.a.a(r28)
        L279:
            p.q0 r15 = new p.q0
            r14 = 1
            r15.<init>(r13, r14)
            t2.k r13 = new t2.k
            r14 = 6
            r13.<init>(r14)
            r35 = 0
            r36 = 261096(0x3fbe8, float:3.65873E-40)
            r20 = 0
            r21 = 0
            r22 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r34 = 24576(0x6000, float:3.4438E-41)
            r24 = r14
            r14 = r3
            r3 = r24
            r33 = r65
            r24 = r13
            sh.s.n(r14, r15, r16, r18, r20, r21, r22, r24, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r14 = r33
            r13 = 1
            r14.p(r13)
            bi.b r13 = g4.a.r(r14)
            long r16 = r13.h()
            long r18 = x6.d.D(r40)
            r30 = 0
            r31 = 13
            r27 = 0
            r29 = 0
            r26 = r41
            r28 = r42
            y0.o r15 = p.d.p(r26, r27, r28, r29, r30, r31)
            r3 = r26
            r13 = r28
            r36 = 262120(0x3ffe8, float:3.67308E-40)
            java.lang.String r14 = "发表评论"
            r24 = 0
            r25 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r34 = 24630(0x6036, float:3.4514E-41)
            sh.s.n(r14, r15, r16, r18, r20, r21, r22, r24, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r14 = r33
            if (r59 == 0) goto L2f8
            boolean r15 = og.m.t0(r11)
            if (r15 != 0) goto L2f8
            if (r57 != 0) goto L2f8
            r15 = 1
            goto L2f9
        L2f8:
            r15 = 0
        L2f9:
            i2.n0 r16 = new i2.n0
            bi.b r17 = g4.a.r(r14)
            long r17 = r17.g()
            r35 = 14
            long r19 = x6.d.D(r35)
            r25 = 0
            r27 = 16777212(0xfffffc, float:2.3509881E-38)
            r21 = 0
            r22 = 0
            r24 = 0
            r16.<init>(r17, r19, r21, r22, r24, r25, r27)
            r17 = r15
            f1.t0 r15 = new f1.t0
            bi.b r18 = g4.a.r(r14)
            long r4 = r18.j()
            r15.<init>(r4)
            r4 = 1065353216(0x3f800000, float:1.0)
            y0.o r18 = p.h1.d(r3, r4)
            r4 = 5
            float r4 = (float) r4
            r22 = 0
            r23 = 13
            r19 = 0
            r21 = 0
            r20 = r4
            y0.o r4 = p.d.p(r18, r19, r20, r21, r22, r23)
            r5 = 8
            float r5 = (float) r5
            v.d r5 = v.e.a(r5)
            y0.o r4 = c1.h.b(r4, r5)
            bi.b r5 = g4.a.r(r14)
            r30 = r9
            long r9 = r5.k()
            f1.m0 r5 = f1.c0.f3038b
            y0.o r4 = k.n.g(r4, r9, r5)
            r5 = r40
            float r9 = (float) r5
            y0.o r4 = p.d.m(r4, r9, r13)
            c9.i0 r5 = new c9.i0
            r9 = 3
            r5.<init>(r9, r12, r11)
            r9 = 1709315502(0x65e215ae, float:1.3345684E23)
            s0.d r25 = s0.i.e(r9, r5, r14)
            int r5 = r39 >> 27
            r5 = r5 & 14
            r9 = 805306368(0x30000000, float:4.656613E-10)
            r5 = r5 | r9
            int r9 = r38 >> 9
            r9 = r9 & 112(0x70, float:1.57E-43)
            r27 = r5 | r9
            r28 = 196614(0x30006, float:2.75515E-40)
            r29 = 14800(0x39d0, float:2.0739E-41)
            r24 = r15
            r15 = r17
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 4
            r21 = 2
            r22 = 0
            r23 = 0
            r42 = r13
            r26 = r14
            r13 = r61
            r14 = r4
            r4 = r64
            w.i.a(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r14 = r26
            r13 = 1065353216(0x3f800000, float:1.0)
            y0.o r16 = p.h1.d(r3, r13)
            r20 = 0
            r21 = 13
            r17 = 0
            r19 = 0
            r18 = r37
            y0.o r5 = p.d.p(r16, r17, r18, r19, r20, r21)
            p.f r9 = p.j.f9929f
            r10 = 54
            p.e1 r0 = p.d1.a(r9, r0, r14, r10)
            long r9 = r14.T
            int r9 = java.lang.Long.hashCode(r9)
            s0.h r10 = r14.l()
            y0.o r5 = y0.a.c(r14, r5)
            r14.d0()
            boolean r12 = r14.S
            if (r12 == 0) goto L3d2
            r14.k(r6)
            goto L3d5
        L3d2:
            r14.n0()
        L3d5:
            i0.r.A(r8, r14, r0)
            i0.r.A(r2, r14, r10)
            r0 = r30
            j8.b.p(r9, r14, r0, r14, r7)
            i0.r.A(r1, r14, r5)
            int r0 = r56.length()
            java.lang.String r1 = "/1000"
            java.lang.String r12 = p.a.i(r0, r1)
            bi.b r0 = g4.a.r(r14)
            long r0 = r0.h()
            r40 = 12
            long r16 = x6.d.D(r40)
            r33 = 0
            r34 = 262122(0x3ffea, float:3.67311E-40)
            r13 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r32 = 24576(0x6000, float:3.4438E-41)
            r31 = r14
            r14 = r0
            sh.s.n(r12, r13, r14, r16, r18, r19, r20, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            if (r57 == 0) goto L425
            java.lang.String r0 = "正在发表"
        L423:
            r12 = r0
            goto L428
        L425:
            java.lang.String r0 = "发表"
            goto L423
        L428:
            if (r59 == 0) goto L43a
            boolean r0 = og.m.t0(r11)
            if (r0 != 0) goto L43a
            boolean r0 = og.m.t0(r56)
            if (r0 != 0) goto L43a
            if (r57 != 0) goto L43a
            r15 = 1
            goto L43b
        L43a:
            r15 = 0
        L43b:
            sh.q1 r19 = sh.c.a(r65)
            int r0 = r38 >> 12
            r22 = r0 & 112(0x70, float:1.57E-43)
            r23 = 1908(0x774, float:2.674E-42)
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r13 = r62
            r21 = r65
            sh.s.o(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r14 = r21
            r13 = 1
            r14.p(r13)
            boolean r0 = og.m.t0(r55)
            if (r0 != 0) goto L4be
            r0 = 46841915(0x2cac03b, float:2.9791567E-37)
            r14.a0(r0)
            r0 = 4292423717(0xffd93025, double:2.120739096E-314)
            long r0 = f1.c0.d(r0)
            r40 = 12
            long r5 = x6.d.D(r40)
            r13 = 1065353216(0x3f800000, float:1.0)
            y0.o r16 = p.h1.d(r3, r13)
            r20 = 0
            r21 = 13
            r17 = 0
            r19 = 0
            r18 = r37
            y0.o r13 = p.d.p(r16, r17, r18, r19, r20, r21)
            int r2 = r39 >> 24
            r2 = r2 & 14
            r2 = r2 | 25008(0x61b0, float:3.5044E-41)
            r33 = 0
            r34 = 262120(0x3ffe8, float:3.67308E-40)
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r12 = r55
            r32 = r2
            r16 = r5
            r31 = r14
            r14 = r0
            sh.s.n(r12, r13, r14, r16, r18, r19, r20, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r14 = r31
            r0 = 0
            r14.p(r0)
            goto L4c8
        L4be:
            r0 = 0
            r1 = 47028535(0x2cd9937, float:3.0209984E-37)
            r14.a0(r1)
            r14.p(r0)
        L4c8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "评论 ("
            r0.<init>(r1)
            r1 = r47
            r0.append(r1)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r12 = r0.toString()
            bi.b r0 = g4.a.r(r14)
            long r5 = r0.h()
            r40 = 12
            long r16 = x6.d.D(r40)
            r30 = 0
            r31 = 13
            r27 = 0
            r29 = 0
            r26 = r3
            r28 = r42
            y0.o r13 = p.d.p(r26, r27, r28, r29, r30, r31)
            r0 = r26
            r33 = 0
            r34 = 262120(0x3ffe8, float:3.67308E-40)
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r32 = 24624(0x6030, float:3.4506E-41)
            r31 = r14
            r14 = r5
            sh.s.n(r12, r13, r14, r16, r18, r19, r20, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r14 = r31
            if (r52 == 0) goto L53a
            r0 = 1664092449(0x63300921, float:3.2472848E21)
            r14.a0(r0)
            java.lang.String r0 = "正在加载评论..."
            r3 = 6
            wb.ho.s0(r0, r14, r3)
            r0 = 0
            r14.p(r0)
            r10 = r53
        L536:
            r8 = r58
            goto L62c
        L53a:
            boolean r3 = og.m.t0(r53)
            if (r3 != 0) goto L57d
            r3 = 47326755(0x2d22623, float:3.0878616E-37)
            r14.a0(r3)
            int r3 = r39 >> 18
            r3 = r3 & 14
            r10 = r53
            wb.ho.s0(r10, r14, r3)
            r13 = 1065353216(0x3f800000, float:1.0)
            y0.o r0 = p.h1.d(r0, r13)
            sh.q1 r19 = sh.c.a(r14)
            int r3 = r38 >> 15
            r3 = r3 & 112(0x70, float:1.57E-43)
            r3 = r3 | 390(0x186, float:5.47E-43)
            r23 = 1912(0x778, float:2.679E-42)
            java.lang.String r12 = "重试"
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r13 = r63
            r22 = r3
            r21 = r14
            r14 = r0
            sh.s.o(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r14 = r21
            r0 = 0
            r14.p(r0)
            goto L536
        L57d:
            r10 = r53
            r0 = 0
            boolean r3 = r51.isEmpty()
            if (r3 == 0) goto L596
            r3 = 1664104220(0x6330371c, float:3.250598E21)
            r14.a0(r3)
            java.lang.String r3 = "暂无评论"
            r5 = 6
            wb.ho.s0(r3, r14, r5)
            r14.p(r0)
            goto L536
        L596:
            r0 = 47678791(0x2d78547, float:3.1667908E-37)
            r14.a0(r0)
            java.util.Iterator r0 = r51.iterator()
            r3 = 0
        L5a1:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L61f
            java.lang.Object r5 = r0.next()
            int r6 = r3 + 1
            if (r3 < 0) goto L61a
            r13 = r5
            gb.c r13 = (gb.c) r13
            boolean r5 = r13.f4415f
            java.lang.String r7 = r13.f4410a
            r8 = r58
            boolean r15 = gg.l.a(r8, r7)
            if (r59 == 0) goto L5c3
            if (r8 != 0) goto L5c3
            r16 = 1
            goto L5c5
        L5c3:
            r16 = 0
        L5c5:
            r7 = 29360128(0x1c00000, float:7.052966E-38)
            r7 = r38 & r7
            r9 = 8388608(0x800000, float:1.1754944E-38)
            if (r7 != r9) goto L5cf
            r7 = 1
            goto L5d0
        L5cf:
            r7 = 0
        L5d0:
            boolean r12 = r14.h(r13)
            r7 = r7 | r12
            java.lang.Object r12 = r14.P()
            if (r7 != 0) goto L5df
            i0.e r7 = i0.l.f5952a
            if (r12 != r7) goto L5e9
        L5df:
            wb.xi r12 = new wb.xi
            r7 = 9
            r12.<init>(r4, r7, r13)
            r14.k0(r12)
        L5e9:
            r17 = r12
            fg.a r17 = (fg.a) r17
            r19 = 196608(0x30000, float:2.75506E-40)
            wb.y2 r12 = wb.y2.f20288m
            r18 = r14
            r14 = r5
            r12.B(r13, r14, r15, r16, r17, r18, r19)
            r14 = r18
            int r5 = r51.size()
            r13 = 1
            int r5 = r5 - r13
            if (r3 == r5) goto L610
            r3 = 800502145(0x2fb6b181, float:3.323173E-10)
            r14.a0(r3)
            r3 = 0
            r5 = 0
            wb.ho.D1(r3, r14, r5, r13)
        L60c:
            r14.p(r5)
            goto L618
        L610:
            r5 = 0
            r3 = -954223825(0xffffffffc71fb32f, float:-40883.184)
            r14.a0(r3)
            goto L60c
        L618:
            r3 = r6
            goto L5a1
        L61a:
            a.a.Q0()
            r0 = 0
            throw r0
        L61f:
            r8 = r58
            r5 = 0
            r14.p(r5)
            goto L62c
        L626:
            r8 = r1
            r1 = r4
            r4 = r13
            r14.V()
        L62c:
            i0.r1 r0 = r14.t()
            if (r0 == 0) goto L660
            r3 = r0
            wb.hp r0 = new wb.hp
            r6 = r49
            r7 = r50
            r9 = r52
            r12 = r55
            r13 = r56
            r14 = r57
            r16 = r59
            r17 = r60
            r18 = r61
            r19 = r62
            r20 = r63
            r22 = r66
            r43 = r3
            r21 = r4
            r15 = r8
            r8 = r51
            r4 = r1
            r1 = r44
            r2 = r45
            r0.<init>(r1, r2, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r3 = r43
            r3.f6035d = r0
        L660:
            return
    }

    public void G(android.content.Context r27, fg.l r28, i0.h0 r29, int r30) {
            r26 = this;
            r3 = r27
            r10 = r29
            r0 = -2106313699(0xffffffff8274341d, float:-1.7941245E-37)
            r10.b0(r0)
            boolean r0 = r10.h(r3)
            if (r0 == 0) goto L12
            r0 = 4
            goto L13
        L12:
            r0 = 2
        L13:
            r0 = r30 | r0
            r1 = r0 & 19
            r2 = 18
            r11 = 1
            r12 = 0
            if (r1 == r2) goto L1f
            r1 = r11
            goto L20
        L1f:
            r1 = r12
        L20:
            r0 = r0 & r11
            boolean r0 = r10.S(r0, r1)
            if (r0 == 0) goto L25a
            java.lang.Object r0 = r10.P()
            i0.e r13 = i0.l.f5952a
            if (r0 != r13) goto L36
            qg.t r0 = i0.r.n(r10)
            r10.k0(r0)
        L36:
            r16 = r0
            qg.t r16 = (qg.t) r16
            java.lang.Object r0 = r10.P()
            if (r0 != r13) goto L49
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            i0.j1 r0 = i0.r.u(r0)
            r10.k0(r0)
        L49:
            r1 = r0
            i0.a1 r1 = (i0.a1) r1
            java.lang.Object r0 = r10.P()
            if (r0 != r13) goto L5b
            java.lang.String r0 = ""
            i0.j1 r0 = i0.r.u(r0)
            r10.k0(r0)
        L5b:
            r2 = r0
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r0 = r10.P()
            if (r0 != r13) goto L6d
            tf.t r0 = tf.t.f13167g
            i0.j1 r0 = i0.r.u(r0)
            r10.k0(r0)
        L6d:
            r4 = r0
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object[] r0 = new java.lang.Object[r12]
            java.lang.Object r5 = r10.P()
            if (r5 != r13) goto L81
            wb.pp r5 = new wb.pp
            r6 = 0
            r5.<init>(r6)
            r10.k0(r5)
        L81:
            fg.a r5 = (fg.a) r5
            r6 = 48
            java.lang.Object r0 = v0.k.c(r0, r5, r10, r6)
            r14 = r0
            i0.a1 r14 = (i0.a1) r14
            java.lang.Object r0 = r10.P()
            if (r0 != r13) goto L9b
            tf.v r0 = tf.v.f13169g
            i0.j1 r0 = i0.r.u(r0)
            r10.k0(r0)
        L9b:
            r6 = r0
            i0.a1 r6 = (i0.a1) r6
            java.lang.Object r0 = r10.P()
            tf.u r5 = tf.u.f13168g
            if (r0 != r13) goto Lad
            i0.j1 r0 = i0.r.u(r5)
            r10.k0(r0)
        Lad:
            i0.a1 r0 = (i0.a1) r0
            java.lang.Object r7 = r10.P()
            if (r7 != r13) goto Lbc
            i0.j1 r7 = i0.r.u(r5)
            r10.k0(r7)
        Lbc:
            i0.a1 r7 = (i0.a1) r7
            java.lang.Object r8 = r10.P()
            if (r8 != r13) goto Lcb
            i0.j1 r8 = i0.r.u(r5)
            r10.k0(r8)
        Lcb:
            i0.a1 r8 = (i0.a1) r8
            java.lang.Object r9 = r10.P()
            if (r9 != r13) goto Lda
            i0.j1 r9 = i0.r.u(r5)
            r10.k0(r9)
        Lda:
            r15 = r9
            i0.a1 r15 = (i0.a1) r15
            java.lang.Object r5 = r10.P()
            if (r5 != r13) goto Lec
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            i0.j1 r5 = i0.r.u(r5)
            r10.k0(r5)
        Lec:
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r9 = r10.P()
            if (r9 != r13) goto Lfd
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            i0.j1 r9 = i0.r.u(r9)
            r10.k0(r9)
        Lfd:
            r17 = r9
            i0.a1 r17 = (i0.a1) r17
            java.lang.Object r9 = r10.P()
            if (r9 != r13) goto L112
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
            i0.j1 r9 = i0.r.u(r9)
            r10.k0(r9)
        L112:
            r18 = r9
            i0.a1 r18 = (i0.a1) r18
            java.lang.Object r9 = r18.getValue()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            boolean r19 = r10.h(r3)
            java.lang.Object r11 = r10.P()
            if (r19 != 0) goto L130
            if (r11 != r13) goto L132
        L130:
            r11 = r0
            goto L13a
        L132:
            r12 = r5
            r5 = r0
            r0 = r11
            r11 = r12
            r12 = r9
            r21 = r17
            goto L156
        L13a:
            k.g1 r0 = new k.g1
            r19 = r9
            r9 = 0
            r12 = r11
            r11 = r5
            r5 = r12
            r12 = r8
            r8 = r6
            r6 = r7
            r7 = r12
            r21 = r17
            r12 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r25 = r7
            r7 = r6
            r6 = r8
            r8 = r25
            r10.k0(r0)
        L156:
            fg.p r0 = (fg.p) r0
            i0.r.f(r0, r10, r12)
            java.lang.Object r0 = r14.getValue()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r0 = j8.b.l(r3, r0, r3)
            java.lang.Object r3 = r4.getValue()
            java.util.List r3 = (java.util.List) r3
            r9 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r3.iterator()
        L17f:
            boolean r12 = r3.hasNext()
            if (r12 == 0) goto L1cf
            java.lang.Object r12 = r3.next()
            r19 = r1
            r1 = r12
            eb.c0 r1 = (eb.c0) r1
            int r22 = r0.length()
            if (r22 != 0) goto L19c
            r22 = r3
            r23 = r4
            r24 = r5
            r5 = 0
            goto L1c0
        L19c:
            r22 = r3
            java.lang.String r3 = r1.f2506a
            r23 = r4
            java.util.Locale r4 = java.util.Locale.US
            r24 = r5
            r5 = 0
            boolean r3 = bc.e.u(r4, r3, r4, r0, r5)
            if (r3 != 0) goto L1c0
            java.lang.String r3 = r1.f2507b
            boolean r3 = bc.e.t(r3, r4, r0, r5)
            if (r3 != 0) goto L1c0
            java.lang.String r1 = r1.f2510e
            boolean r1 = bc.e.t(r1, r4, r0, r5)
            if (r1 == 0) goto L1be
            goto L1c0
        L1be:
            r1 = r5
            goto L1c1
        L1c0:
            r1 = 1
        L1c1:
            if (r1 == 0) goto L1c6
            r2.add(r12)
        L1c6:
            r1 = r19
            r3 = r22
            r4 = r23
            r5 = r24
            goto L17f
        L1cf:
            r19 = r1
            r23 = r4
            r24 = r5
            r5 = 0
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L203
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L1e3
            goto L202
        L1e3:
            java.util.Iterator r0 = r2.iterator()
        L1e7:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L202
            java.lang.Object r1 = r0.next()
            eb.c0 r1 = (eb.c0) r1
            java.lang.Object r3 = r6.getValue()
            java.util.Set r3 = (java.util.Set) r3
            java.lang.String r1 = r1.f2506a
            boolean r1 = r3.contains(r1)
            if (r1 != 0) goto L1e7
            goto L203
        L202:
            r5 = 1
        L203:
            java.lang.Object r0 = r10.P()
            if (r0 != r13) goto L217
            wb.jb r0 = new wb.jb
            r1 = 1
            r3 = r28
            r4 = r21
            r0.<init>(r3, r11, r4, r1)
            r10.k0(r0)
            goto L21b
        L217:
            r3 = r28
            r4 = r21
        L21b:
            r20 = r0
            fg.a r20 = (fg.a) r20
            wb.qp r0 = new wb.qp
            r17 = r4
            r12 = r7
            r13 = r8
            r4 = r11
            r1 = r14
            r14 = r15
            r10 = r18
            r8 = r19
            r7 = r23
            r11 = r24
            r15 = r3
            r3 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = -1034375204(0xffffffffc258afdc, float:-54.171738)
            r10 = r29
            s0.d r15 = s0.i.e(r1, r0, r10)
            r17 = 390(0x186, float:5.47E-43)
            r18 = 3072(0xc00, float:4.305E-42)
            r0 = 0
            java.lang.String r1 = "上传本地插件"
            r2 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r16 = r29
            r9 = r20
            oh.h.d(r0, r1, r2, r4, r6, r8, r9, r10, r12, r14, r15, r16, r17, r18)
            goto L25d
        L25a:
            r29.V()
        L25d:
            i0.r1 r6 = r29.t()
            if (r6 == 0) goto L274
            wb.rj r0 = new wb.rj
            r5 = 12
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r30
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f6035d = r0
        L274:
            return
    }

    public void I(eb.c0 r63, boolean r64, java.lang.String r65, java.lang.String r66, java.util.List r67, wb.tp r68, boolean r69, fg.l r70, fg.l r71, fg.l r72, fg.a r73, fg.a r74, i0.h0 r75, int r76) {
            r62 = this;
            r2 = r63
            r3 = r64
            r4 = r66
            r0 = r68
            r1 = r70
            r13 = r75
            java.lang.String r5 = r2.f2506a
            r6 = -48367758(0xfffffffffd1df772, float:-1.312335E37)
            r13.b0(r6)
            boolean r6 = r13.h(r2)
            if (r6 == 0) goto L1c
            r6 = 4
            goto L1d
        L1c:
            r6 = 2
        L1d:
            r6 = r76 | r6
            boolean r9 = r13.g(r3)
            r10 = 16
            if (r9 == 0) goto L2a
            r9 = 32
            goto L2b
        L2a:
            r9 = r10
        L2b:
            r6 = r6 | r9
            r9 = r65
            boolean r12 = r13.f(r9)
            if (r12 == 0) goto L37
            r12 = 256(0x100, float:3.59E-43)
            goto L39
        L37:
            r12 = 128(0x80, float:1.8E-43)
        L39:
            r6 = r6 | r12
            boolean r12 = r13.f(r4)
            if (r12 == 0) goto L43
            r12 = 2048(0x800, float:2.87E-42)
            goto L45
        L43:
            r12 = 1024(0x400, float:1.435E-42)
        L45:
            r6 = r6 | r12
            r12 = r67
            boolean r14 = r13.f(r12)
            if (r14 == 0) goto L51
            r14 = 16384(0x4000, float:2.2959E-41)
            goto L53
        L51:
            r14 = 8192(0x2000, float:1.148E-41)
        L53:
            r6 = r6 | r14
            boolean r14 = r13.f(r0)
            if (r14 == 0) goto L5d
            r14 = 131072(0x20000, float:1.83671E-40)
            goto L5f
        L5d:
            r14 = 65536(0x10000, float:9.1835E-41)
        L5f:
            r6 = r6 | r14
            r15 = r69
            boolean r14 = r13.g(r15)
            if (r14 == 0) goto L6b
            r14 = 1048576(0x100000, float:1.469368E-39)
            goto L6d
        L6b:
            r14 = 524288(0x80000, float:7.34684E-40)
        L6d:
            r6 = r6 | r14
            boolean r14 = r13.h(r1)
            if (r14 == 0) goto L77
            r14 = 8388608(0x800000, float:1.1754944E-38)
            goto L79
        L77:
            r14 = 4194304(0x400000, float:5.877472E-39)
        L79:
            r6 = r6 | r14
            r14 = r71
            boolean r16 = r13.h(r14)
            if (r16 == 0) goto L85
            r16 = 67108864(0x4000000, float:1.5046328E-36)
            goto L87
        L85:
            r16 = 33554432(0x2000000, float:9.403955E-38)
        L87:
            r6 = r6 | r16
            r16 = r6
            r6 = r72
            boolean r17 = r13.h(r6)
            if (r17 == 0) goto L96
            r17 = 536870912(0x20000000, float:1.0842022E-19)
            goto L98
        L96:
            r17 = 268435456(0x10000000, float:2.524355E-29)
        L98:
            r28 = r16 | r17
            r6 = r73
            boolean r16 = r13.h(r6)
            if (r16 == 0) goto La5
            r16 = 4
            goto La7
        La5:
            r16 = 2
        La7:
            r17 = 384(0x180, float:5.38E-43)
            r16 = r17 | r16
            r6 = r74
            boolean r17 = r13.h(r6)
            if (r17 == 0) goto Lb5
            r10 = 32
        Lb5:
            r29 = r16 | r10
            r10 = 306783379(0x12492493, float:6.34695E-28)
            r10 = r28 & r10
            r8 = 306783378(0x12492492, float:6.3469493E-28)
            r6 = 0
            r9 = 1
            if (r10 != r8) goto Lcc
            r8 = r29 & 19
            r10 = 18
            if (r8 == r10) goto Lca
            goto Lcc
        Lca:
            r8 = r6
            goto Lcd
        Lcc:
            r8 = r9
        Lcd:
            r10 = r28 & 1
            boolean r8 = r13.S(r10, r8)
            if (r8 == 0) goto L707
            y0.l r8 = y0.l.f21818a
            r10 = 1065353216(0x3f800000, float:1.0)
            y0.o r11 = p.h1.d(r8, r10)
            r7 = 8
            float r7 = (float) r7
            r10 = 0
            y0.o r10 = p.d.n(r11, r10, r7, r9)
            p.e r11 = p.j.f9926c
            y0.e r12 = y0.b.f21804s
            p.t r9 = p.s.a(r11, r12, r13, r6)
            r25 = r7
            long r6 = r13.T
            int r6 = java.lang.Long.hashCode(r6)
            s0.h r7 = r13.l()
            y0.o r10 = y0.a.c(r13, r10)
            x1.f r18 = x1.g.f20914f
            r18.getClass()
            r18 = r6
            x1.y r6 = x1.f.f20883b
            r13.d0()
            r26 = r5
            boolean r5 = r13.S
            if (r5 == 0) goto L113
            r13.k(r6)
            goto L116
        L113:
            r13.n0()
        L116:
            x1.e r5 = x1.f.f20886e
            i0.r.A(r5, r13, r9)
            x1.e r9 = x1.f.f20885d
            i0.r.A(r9, r13, r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r18)
            x1.e r0 = x1.f.f20887f
            i0.r.A(r0, r13, r7)
            x1.d r7 = x1.f.f20888g
            i0.r.w(r7, r13)
            x1.e r4 = x1.f.f20884c
            i0.r.A(r4, r13, r10)
            r10 = 1065353216(0x3f800000, float:1.0)
            y0.o r14 = p.h1.d(r8, r10)
            r10 = 29360128(0x1c00000, float:7.052966E-38)
            r10 = r28 & r10
            r27 = r8
            r8 = 8388608(0x800000, float:1.1754944E-38)
            if (r10 != r8) goto L145
            r8 = 1
            goto L146
        L145:
            r8 = 0
        L146:
            r10 = r28 & 112(0x70, float:1.57E-43)
            r17 = r8
            r8 = 32
            if (r10 != r8) goto L150
            r8 = 1
            goto L151
        L150:
            r8 = 0
        L151:
            r8 = r17 | r8
            java.lang.Object r10 = r13.P()
            r16 = r8
            i0.e r8 = i0.l.f5952a
            if (r16 != 0) goto L163
            if (r10 != r8) goto L160
            goto L163
        L160:
            r30 = r8
            goto L16e
        L163:
            u.c r10 = new u.c
            r30 = r8
            r8 = 2
            r10.<init>(r8, r1, r3)
            r13.k0(r10)
        L16e:
            r18 = r10
            fg.a r18 = (fg.a) r18
            r19 = 14
            r16 = 0
            r17 = 0
            y0.o r8 = k.n.j(r14, r15, r16, r17, r18, r19)
            r10 = 4
            float r14 = (float) r10
            r15 = 6
            float r10 = (float) r15
            y0.o r8 = p.d.m(r8, r14, r10)
            r16 = r10
            y0.f r10 = y0.b.f21802q
            r17 = r14
            p.c r14 = p.j.f9924a
            r15 = 48
            p.e1 r1 = p.d1.a(r14, r10, r13, r15)
            r19 = r14
            long r14 = r13.T
            int r14 = java.lang.Long.hashCode(r14)
            s0.h r15 = r13.l()
            y0.o r8 = y0.a.c(r13, r8)
            r13.d0()
            r32 = r10
            boolean r10 = r13.S
            if (r10 == 0) goto L1af
            r13.k(r6)
            goto L1b2
        L1af:
            r13.n0()
        L1b2:
            i0.r.A(r5, r13, r1)
            i0.r.A(r9, r13, r15)
            j8.b.p(r14, r13, r0, r13, r7)
            i0.r.A(r4, r13, r8)
            r10 = 1065353216(0x3f800000, float:1.0)
            double r14 = (double) r10
            r33 = 0
            int r1 = (r14 > r33 ? 1 : (r14 == r33 ? 0 : -1))
            java.lang.String r35 = "invalid weight; must be greater than zero"
            if (r1 <= 0) goto L1ca
            goto L1cd
        L1ca:
            q.a.a(r35)
        L1cd:
            p.q0 r1 = new p.q0
            r8 = 1
            r1.<init>(r10, r8)
            r14 = 0
            p.t r15 = p.s.a(r11, r12, r13, r14)
            r22 = r11
            long r10 = r13.T
            int r10 = java.lang.Long.hashCode(r10)
            s0.h r11 = r13.l()
            y0.o r1 = y0.a.c(r13, r1)
            r13.d0()
            boolean r8 = r13.S
            if (r8 == 0) goto L1f3
            r13.k(r6)
            goto L1f6
        L1f3:
            r13.n0()
        L1f6:
            i0.r.A(r5, r13, r15)
            i0.r.A(r9, r13, r11)
            j8.b.p(r10, r13, r0, r13, r7)
            i0.r.A(r4, r13, r1)
            java.lang.String r1 = r2.f2507b
            boolean r8 = og.m.t0(r1)
            if (r8 == 0) goto L20c
            r1 = r26
        L20c:
            bi.b r8 = g4.a.r(r13)
            long r10 = r8.g()
            r60 = r10
            r10 = r7
            r7 = r60
            m2.k r11 = m2.k.f8698j
            r15 = r26
            r26 = 24960(0x6180, float:3.4976E-41)
            r36 = r27
            r27 = 241594(0x3afba, float:3.38545E-40)
            r37 = r6
            r6 = 0
            r38 = r9
            r39 = r10
            r9 = 0
            r40 = r12
            r12 = 0
            r41 = r14
            r13 = 0
            r42 = r15
            r15 = 0
            r44 = r16
            r43 = r17
            r16 = 0
            r45 = 6
            r18 = 2
            r46 = r19
            r19 = 0
            r47 = 2
            r20 = 1
            r48 = 4
            r21 = 0
            r49 = r22
            r22 = 0
            r50 = 1065353216(0x3f800000, float:1.0)
            r23 = 0
            r51 = r25
            r25 = 1572864(0x180000, float:2.204052E-39)
            r24 = r75
            r54 = r5
            r58 = r30
            r55 = r38
            r56 = r39
            r53 = r40
            r57 = r46
            r52 = r49
            r31 = 48
            r30 = r0
            r5 = r1
            r1 = r42
            r0 = 1
            sh.s.n(r5, r6, r7, r9, r11, r12, r13, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            java.lang.String r5 = " · "
            java.lang.StringBuilder r1 = bc.e.n(r1, r5)
            java.lang.String r6 = r2.f2510e
            boolean r7 = og.m.t0(r6)
            if (r7 == 0) goto L284
            java.lang.String r6 = "未知作者"
        L284:
            r1.append(r6)
            r1.append(r5)
            java.lang.String r5 = r2.f2511f
            boolean r6 = og.m.t0(r5)
            if (r6 == 0) goto L294
            java.lang.String r5 = "未知版本"
        L294:
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            bi.b r1 = g4.a.r(r75)
            long r7 = r1.h()
            r1 = 12
            long r9 = x6.d.D(r1)
            r26 = 24960(0x6180, float:3.4976E-41)
            r27 = 241642(0x3afea, float:3.38613E-40)
            r6 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r18 = 2
            r19 = 0
            r20 = 1
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 24576(0x6000, float:3.4438E-41)
            r24 = r75
            sh.s.n(r5, r6, r7, r9, r11, r12, r13, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r5 = r24
            r5.p(r0)
            int r6 = r28 >> 3
            r38 = 14
            r6 = r6 & 14
            r6 = r6 | 48
            wb.ho.B3(r3, r0, r5, r6)
            r5.p(r0)
            if (r3 == 0) goto L646
            r6 = -923967991(0xffffffffc8ed5e09, float:-486128.28)
            r5.a0(r6)
            bi.b r6 = g4.a.r(r5)
            long r7 = r6.h()
            long r9 = x6.d.D(r1)
            r16 = 0
            r17 = 12
            r15 = 0
            r14 = r43
            r12 = r36
            r13 = r43
            y0.o r6 = p.d.p(r12, r13, r14, r15, r16, r17)
            r26 = 0
            r27 = 262120(0x3ffe8, float:3.67308E-40)
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 24630(0x6036, float:3.4514E-41)
            java.lang.String r5 = "在线名称"
            r24 = r75
            r0 = r36
            sh.s.n(r5, r6, r7, r9, r11, r12, r13, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            i2.n0 r5 = new i2.n0
            bi.b r6 = g4.a.r(r75)
            long r6 = r6.g()
            long r8 = x6.d.D(r38)
            r14 = 0
            r16 = 16777212(0xfffffc, float:2.3509881E-38)
            r10 = 0
            r11 = 0
            r13 = 0
            r5.<init>(r6, r8, r10, r11, r13, r14, r16)
            f1.t0 r6 = new f1.t0
            bi.b r7 = g4.a.r(r75)
            long r7 = r7.j()
            r6.<init>(r7)
            r10 = 1065353216(0x3f800000, float:1.0)
            y0.o r11 = p.h1.d(r0, r10)
            r7 = 5
            float r13 = (float) r7
            r15 = 0
            r16 = 13
            r12 = 0
            r14 = 0
            y0.o r7 = p.d.p(r11, r12, r13, r14, r15, r16)
            r36 = r13
            r8 = 10
            float r8 = (float) r8
            v.d r9 = v.e.a(r8)
            y0.o r7 = c1.h.b(r7, r9)
            bi.b r9 = g4.a.r(r75)
            long r9 = r9.k()
            f1.m0 r11 = f1.c0.f3038b
            y0.o r7 = k.n.g(r7, r9, r11)
            float r9 = (float) r1
            y0.o r7 = p.d.m(r7, r9, r8)
            int r10 = r28 >> 6
            r10 = r10 & 14
            r12 = 100663296(0x6000000, float:2.4074124E-35)
            r10 = r10 | r12
            int r12 = r28 >> 21
            r12 = r12 & 112(0x70, float:1.57E-43)
            r10 = r10 | r12
            int r12 = r28 >> 9
            r13 = r12 & 7168(0x1c00, float:1.0045E-41)
            r20 = r10 | r13
            r22 = 48848(0xbed0, float:6.845E-41)
            r10 = 0
            r14 = r11
            r11 = 0
            r15 = r12
            r12 = 1
            r16 = r13
            r13 = 0
            r17 = r14
            r14 = 0
            r18 = r15
            r15 = 0
            r19 = r16
            r16 = 0
            r23 = r18
            r18 = 0
            r27 = r0
            r41 = r1
            r40 = r8
            r1 = r9
            r0 = r17
            r46 = r19
            r42 = r23
            r8 = r69
            r19 = r75
            r9 = r5
            r17 = r6
            r5 = r65
            r6 = r71
            w.i.a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            bi.b r5 = g4.a.r(r75)
            long r7 = r5.h()
            long r9 = x6.d.D(r41)
            r16 = 0
            r17 = 12
            r15 = 0
            r12 = r27
            r13 = r43
            r14 = r51
            y0.o r6 = p.d.p(r12, r13, r14, r15, r16, r17)
            r27 = 262120(0x3ffe8, float:3.67308E-40)
            r5 = r12
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = r5
            java.lang.String r5 = "更新说明"
            r2 = r24
            r24 = r75
            sh.s.n(r5, r6, r7, r9, r11, r12, r13, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r5 = r24
            i2.n0 r6 = new i2.n0
            bi.b r7 = g4.a.r(r5)
            long r7 = r7.g()
            long r9 = x6.d.D(r38)
            r15 = 0
            r17 = 16777212(0xfffffc, float:2.3509881E-38)
            r12 = 0
            r14 = 0
            r6.<init>(r7, r9, r11, r12, r14, r15, r17)
            f1.t0 r7 = new f1.t0
            bi.b r8 = g4.a.r(r5)
            long r8 = r8.j()
            r7.<init>(r8)
            r10 = 1065353216(0x3f800000, float:1.0)
            y0.o r12 = p.h1.d(r2, r10)
            r16 = 0
            r17 = 13
            r13 = 0
            r15 = 0
            r14 = r36
            y0.o r8 = p.d.p(r12, r13, r14, r15, r16, r17)
            v.d r9 = v.e.a(r40)
            y0.o r8 = c1.h.b(r8, r9)
            bi.b r9 = g4.a.r(r5)
            long r9 = r9.k()
            y0.o r0 = k.n.g(r8, r9, r0)
            r8 = r40
            y0.o r0 = p.d.m(r0, r1, r8)
            sh.d r1 = new sh.d
            r8 = 5
            r9 = r66
            r1.<init>(r9, r8)
            r8 = 335899063(0x140569b7, float:6.7356326E-27)
            s0.d r17 = s0.i.e(r8, r1, r5)
            r1 = r42 & 14
            r8 = 805306368(0x30000000, float:4.656613E-10)
            r1 = r1 | r8
            int r8 = r28 >> 24
            r8 = r8 & 112(0x70, float:1.57E-43)
            r1 = r1 | r8
            r19 = r1 | r46
            r20 = 196614(0x30006, float:2.75515E-40)
            r21 = 14800(0x39d0, float:2.0739E-41)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 3
            r13 = 2
            r14 = 0
            r15 = 0
            r18 = r5
            r8 = r6
            r16 = r7
            r7 = r69
            r5 = r72
            r6 = r0
            r0 = r4
            r4 = r66
            w.i.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r13 = r18
            r10 = 1065353216(0x3f800000, float:1.0)
            y0.o r22 = p.h1.d(r2, r10)
            r26 = 0
            r27 = 13
            r23 = 0
            r25 = 0
            r24 = r51
            y0.o r1 = p.d.p(r22, r23, r24, r25, r26, r27)
            r6 = r31
            r4 = r32
            r5 = r57
            p.e1 r4 = p.d1.a(r5, r4, r13, r6)
            long r5 = r13.T
            int r5 = java.lang.Long.hashCode(r5)
            s0.h r6 = r13.l()
            y0.o r1 = y0.a.c(r13, r1)
            r13.d0()
            boolean r7 = r13.S
            if (r7 == 0) goto L4c2
            r7 = r37
            r13.k(r7)
        L4bf:
            r8 = r54
            goto L4c8
        L4c2:
            r7 = r37
            r13.n0()
            goto L4bf
        L4c8:
            i0.r.A(r8, r13, r4)
            r4 = r55
            i0.r.A(r4, r13, r6)
            r6 = r30
            r10 = r56
            j8.b.p(r5, r13, r6, r13, r10)
            i0.r.A(r0, r13, r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            double r11 = (double) r1
            int r5 = (r11 > r33 ? 1 : (r11 == r33 ? 0 : -1))
            if (r5 <= 0) goto L4e2
            goto L4e5
        L4e2:
            q.a.a(r35)
        L4e5:
            p.q0 r5 = new p.q0
            r9 = 1
            r5.<init>(r1, r9)
            r1 = r52
            r9 = r53
            r11 = 0
            p.t r1 = p.s.a(r1, r9, r13, r11)
            long r14 = r13.T
            int r9 = java.lang.Long.hashCode(r14)
            s0.h r12 = r13.l()
            y0.o r5 = y0.a.c(r13, r5)
            r13.d0()
            boolean r14 = r13.S
            if (r14 == 0) goto L50d
            r13.k(r7)
            goto L510
        L50d:
            r13.n0()
        L510:
            i0.r.A(r8, r13, r1)
            i0.r.A(r4, r13, r12)
            j8.b.p(r9, r13, r6, r13, r10)
            i0.r.A(r0, r13, r5)
            boolean r0 = r67.isEmpty()
            if (r0 == 0) goto L525
            java.lang.String r0 = ""
            goto L531
        L525:
            int r0 = r67.size()
            java.lang.String r1 = " ("
            java.lang.String r4 = ")"
            java.lang.String r0 = eh.a.m(r0, r1, r4)
        L531:
            java.lang.String r1 = "附加文件"
            java.lang.String r4 = r1.concat(r0)
            bi.b r0 = g4.a.r(r13)
            long r6 = r0.h()
            long r8 = x6.d.D(r41)
            r25 = 0
            r26 = 262122(0x3ffea, float:3.67311E-40)
            r5 = 0
            r10 = 0
            r24 = r11
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r59 = r24
            r24 = 24576(0x6000, float:3.4438E-41)
            r23 = r75
            r0 = r59
            sh.s.n(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r5 = r23
            boolean r1 = r67.isEmpty()
            if (r1 != 0) goto L5dd
            r1 = -434957109(0xffffffffe61314cb, float:-1.7364286E23)
            r5.a0(r1)
            java.lang.Object r1 = r5.P()
            r4 = r58
            if (r1 != r4) goto L589
            wb.jk r1 = new wb.jk
            r4 = 29
            r1.<init>(r4)
            r5.k0(r1)
        L589:
            r16 = r1
            fg.l r16 = (fg.l) r16
            r17 = 30
            java.lang.String r13 = "、"
            r14 = 0
            r15 = 0
            r12 = r67
            java.lang.String r4 = tf.m.A1(r12, r13, r14, r15, r16, r17)
            bi.b r1 = g4.a.r(r5)
            long r6 = r1.h()
            long r8 = x6.d.D(r41)
            r1 = 2
            float r14 = (float) r1
            r16 = 0
            r17 = 13
            r13 = 0
            r15 = 0
            r12 = r2
            y0.o r2 = p.d.p(r12, r13, r14, r15, r16, r17)
            r25 = 24960(0x6180, float:3.4976E-41)
            r26 = 241640(0x3afe8, float:3.3861E-40)
            r10 = 0
            r11 = 0
            r36 = r12
            r12 = 0
            r14 = 0
            r15 = 0
            r17 = 2
            r18 = 0
            r19 = 2
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 24624(0x6030, float:3.4506E-41)
            r23 = r5
            r5 = r2
            r2 = r36
            sh.s.n(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r13 = r23
            r13.p(r0)
        L5db:
            r8 = 1
            goto L5e9
        L5dd:
            r13 = r5
            r1 = 2
            r4 = -434541275(0xffffffffe6196d25, float:-1.8113386E23)
            r13.a0(r4)
            r13.p(r0)
            goto L5db
        L5e9:
            r13.p(r8)
            sh.q1 r11 = sh.c.a(r13)
            int r4 = r29 << 3
            r4 = r4 & 112(0x70, float:1.57E-43)
            r4 = r4 | 6
            r14 = r4 | r46
            r15 = 1908(0x774, float:2.674E-42)
            java.lang.String r4 = "选择"
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r7 = r69
            r5 = r73
            sh.s.o(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r4 = r67.isEmpty()
            if (r4 != 0) goto L634
            r4 = 130672547(0x7c9e7a3, float:3.0379262E-34)
            r13.a0(r4)
            sh.q1 r11 = sh.c.a(r13)
            r4 = r29 & 112(0x70, float:1.57E-43)
            r4 = r4 | 6
            r14 = r4 | r46
            r15 = 1908(0x774, float:2.674E-42)
            java.lang.String r4 = "清空"
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r7 = r69
            r5 = r74
            sh.s.o(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r5 = r13
            r5.p(r0)
        L632:
            r8 = 1
            goto L63f
        L634:
            r5 = r13
            r4 = 130941627(0x7ce02bb, float:3.099704E-34)
            r5.a0(r4)
            r5.p(r0)
            goto L632
        L63f:
            r5.p(r8)
            r5.p(r0)
            goto L655
        L646:
            r41 = r1
            r2 = r36
            r0 = 0
            r1 = 2
            r4 = -920199910(0xffffffffc926dd1a, float:-683473.6)
            r5.a0(r4)
            r5.p(r0)
        L655:
            if (r68 == 0) goto L6f8
            r4 = -920151984(0xffffffffc9279850, float:-686469.0)
            r5.a0(r4)
            r4 = r68
            wb.sp r6 = r4.f19314a
            int r6 = r6.ordinal()
            if (r6 == r1) goto L6a5
            r1 = 3
            if (r6 == r1) goto L693
            r10 = 4
            if (r6 == r10) goto L680
            r1 = 108875615(0x67d4f5f, float:4.7642324E-35)
            r5.a0(r1)
            bi.b r1 = g4.a.r(r5)
            long r6 = r1.h()
            r5.p(r0)
        L67e:
            r1 = r4
            goto L6b7
        L680:
            r1 = 108873529(0x67d4739, float:4.7636337E-35)
            r5.a0(r1)
            r5.p(r0)
            r6 = 4292423717(0xffd93025, double:2.120739096E-314)
            long r6 = f1.c0.d(r6)
            goto L67e
        L693:
            r1 = 108871167(0x67d3dff, float:4.762956E-35)
            r5.a0(r1)
            bi.b r1 = g4.a.r(r5)
            long r6 = r1.h()
            r5.p(r0)
            goto L67e
        L6a5:
            r1 = 108868303(0x67d32cf, float:4.762134E-35)
            r5.a0(r1)
            bi.b r1 = g4.a.r(r5)
            long r6 = r1.j()
            r5.p(r0)
            goto L67e
        L6b7:
            java.lang.String r4 = r1.f19315b
            long r8 = x6.d.D(r41)
            r10 = 1065353216(0x3f800000, float:1.0)
            y0.o r13 = p.h1.d(r2, r10)
            r17 = 0
            r18 = 12
            r16 = 0
            r14 = r43
            r15 = r44
            y0.o r2 = p.d.p(r13, r14, r15, r16, r17, r18)
            r25 = 0
            r26 = 262120(0x3ffe8, float:3.67308E-40)
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 24624(0x6030, float:3.4506E-41)
            r23 = r5
            r5 = r2
            sh.s.n(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r13 = r23
            r13.p(r0)
        L6f6:
            r8 = 1
            goto L703
        L6f8:
            r13 = r5
            r1 = -919558086(0xffffffffc930a83a, float:-723587.6)
            r13.a0(r1)
            r13.p(r0)
            goto L6f6
        L703:
            r13.p(r8)
            goto L70a
        L707:
            r13.V()
        L70a:
            i0.r1 r15 = r13.t()
            if (r15 == 0) goto L731
            wb.mp r0 = new wb.mp
            r1 = r62
            r2 = r63
            r4 = r65
            r5 = r66
            r6 = r67
            r7 = r68
            r8 = r69
            r9 = r70
            r10 = r71
            r11 = r72
            r12 = r73
            r13 = r74
            r14 = r76
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r15.f6035d = r0
        L731:
            return
    }

    public void J(java.lang.String r28, wb.lv r29, fg.a r30, s0.d r31, i0.h0 r32, int r33) {
            r27 = this;
            r4 = r30
            r5 = r31
            r0 = r32
            r1 = r33
            r2 = -322384703(0xffffffffecc8ccc1, float:-1.9420167E27)
            r0.b0(r2)
            r2 = r1 & 6
            r7 = 1
            r8 = 2
            if (r2 != 0) goto L1f
            boolean r2 = r0.g(r7)
            if (r2 == 0) goto L1c
            r2 = 4
            goto L1d
        L1c:
            r2 = r8
        L1d:
            r2 = r2 | r1
            goto L20
        L1f:
            r2 = r1
        L20:
            r3 = r1 & 48
            if (r3 != 0) goto L33
            r3 = r28
            boolean r6 = r0.f(r3)
            if (r6 == 0) goto L2f
            r6 = 32
            goto L31
        L2f:
            r6 = 16
        L31:
            r2 = r2 | r6
            goto L35
        L33:
            r3 = r28
        L35:
            r6 = r1 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L49
            int r6 = r29.ordinal()
            boolean r6 = r0.d(r6)
            if (r6 == 0) goto L46
            r6 = 256(0x100, float:3.59E-43)
            goto L48
        L46:
            r6 = 128(0x80, float:1.8E-43)
        L48:
            r2 = r2 | r6
        L49:
            r6 = r1 & 3072(0xc00, float:4.305E-42)
            r10 = 2048(0x800, float:2.87E-42)
            if (r6 != 0) goto L5a
            boolean r6 = r0.h(r4)
            if (r6 == 0) goto L57
            r6 = r10
            goto L59
        L57:
            r6 = 1024(0x400, float:1.435E-42)
        L59:
            r2 = r2 | r6
        L5a:
            r6 = r1 & 24576(0x6000, float:3.4438E-41)
            if (r6 != 0) goto L6a
            boolean r6 = r0.h(r5)
            if (r6 == 0) goto L67
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L69
        L67:
            r6 = 8192(0x2000, float:1.148E-41)
        L69:
            r2 = r2 | r6
        L6a:
            r11 = r2
            r2 = r11 & 9363(0x2493, float:1.312E-41)
            r6 = 9362(0x2492, float:1.3119E-41)
            r12 = 0
            if (r2 == r6) goto L74
            r2 = r7
            goto L75
        L74:
            r2 = r12
        L75:
            r6 = r11 & 1
            boolean r2 = r0.S(r6, r2)
            if (r2 == 0) goto L2de
            wb.lv r2 = wb.lv.f17583j
            r13 = 3
            r6 = r29
            if (r6 != r2) goto Ld8
            r2 = -615567416(0xffffffffdb4f2fc8, float:-5.8317856E16)
            r0.a0(r2)
            r2 = r11 & 14
            int r7 = r11 << 3
            r7 = r7 & 896(0x380, float:1.256E-42)
            r2 = r2 | r7
            int r7 = r11 << 15
            r8 = 234881024(0xe000000, float:1.5777218E-30)
            r7 = r7 & r8
            r17 = r2 | r7
            int r2 = r11 >> 3
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r0 = 0
            r18 = r2
            r2 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r9 = r12
            r12 = 0
            r14 = 0
            r1 = r28
            r9 = r30
            r15 = r31
            r16 = r32
            oh.h.d(r0, r1, r2, r4, r6, r8, r9, r10, r12, r14, r15, r16, r17, r18)
            r0 = r16
            r12 = 0
            r0.p(r12)
            i0.r1 r8 = r0.t()
            if (r8 == 0) goto L2f9
            wb.ru r0 = new wb.ru
            r7 = 0
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            r5 = r31
            r6 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
        Ld5:
            r8.f6035d = r0
            return
        Ld8:
            r1 = -615358879(0xffffffffdb525e61, float:-5.9213516E16)
            r0.a0(r1)
            r0.p(r12)
            s3.e r0 = a.a.I0(r32)
            r14 = r11 & 7168(0x1c00, float:1.0045E-41)
            r5 = r14 | 48
            r6 = 4
            r1 = 1
            r2 = 0
            r3 = r30
            r4 = r32
            x6.d.d(r0, r1, r2, r3, r4, r5, r6)
            r0 = r3
            int r1 = r29.ordinal()
            if (r1 == 0) goto L108
            if (r1 == r7) goto L105
            if (r1 != r8) goto L101
            y0.g r1 = y0.b.f21799n
            goto L10a
        L101:
            okio.a.k()
            return
        L105:
            y0.g r1 = y0.b.f21796k
            goto L10a
        L108:
            y0.g r1 = y0.b.f21793h
        L10a:
            i0.u r2 = y1.i0.f21965a
            java.lang.Object r2 = r4.j(r2)
            android.content.res.Configuration r2 = (android.content.res.Configuration) r2
            int r2 = r2.screenHeightDp
            float r2 = (float) r2
            r3 = 1061997773(0x3f4ccccd, float:0.8)
            float r2 = r2 * r3
            u2.f r3 = new u2.f
            r3.<init>(r2)
            r2 = 240(0xf0, float:3.36E-43)
            float r2 = (float) r2
            u2.f r5 = new u2.f
            r5.<init>(r2)
            int r2 = r3.compareTo(r5)
            if (r2 >= 0) goto L12d
            r3 = r5
        L12d:
            p.a0 r2 = p.h1.f9915c
            i0.m2 r5 = bi.d.f892a
            java.lang.Object r6 = r4.j(r5)
            bi.b r6 = (bi.b) r6
            long r7 = r6.o()
            f1.m0 r6 = f1.c0.f3038b
            y0.o r2 = k.n.g(r2, r7, r6)
            o9.e r7 = p.d.f9875d
            y0.o r2 = p.d.t(r2, r7)
            o9.e r7 = p.d.f9877f
            y0.o r2 = p.d.t(r2, r7)
            o9.e r7 = p.d.f9876e
            y0.o r2 = p.d.t(r2, r7)
            if (r14 != r10) goto L157
            r7 = 1
            goto L158
        L157:
            r7 = r12
        L158:
            java.lang.Object r8 = r4.P()
            i0.e r10 = i0.l.f5952a
            if (r7 != 0) goto L162
            if (r8 != r10) goto L16b
        L162:
            c0.g r8 = new c0.g
            r7 = 7
            r8.<init>(r0, r7)
            r4.k0(r8)
        L16b:
            androidx.compose.ui.input.pointer.PointerInputEventHandler r8 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) r8
            y0.o r2 = s1.h0.a(r2, r0, r8)
            r7 = 12
            float r8 = (float) r7
            y0.o r2 = p.d.l(r2, r8)
            y0.g r14 = y0.b.f21792g
            v1.n0 r14 = p.o.d(r14, r12)
            r20 = r8
            long r7 = r4.T
            int r7 = java.lang.Long.hashCode(r7)
            s0.h r8 = r4.l()
            y0.o r2 = y0.a.c(r4, r2)
            x1.f r16 = x1.g.f20914f
            r16.getClass()
            x1.y r15 = x1.f.f20883b
            r4.d0()
            boolean r13 = r4.S
            if (r13 == 0) goto L1a0
            r4.k(r15)
            goto L1a3
        L1a0:
            r4.n0()
        L1a3:
            x1.e r13 = x1.f.f20886e
            i0.r.A(r13, r4, r14)
            x1.e r14 = x1.f.f20885d
            i0.r.A(r14, r4, r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            x1.e r8 = x1.f.f20887f
            i0.r.A(r8, r4, r7)
            x1.d r7 = x1.f.f20888g
            i0.r.w(r7, r4)
            x1.e r12 = x1.f.f20884c
            i0.r.A(r12, r4, r2)
            y0.l r2 = y0.l.f21818a
            y0.o r1 = p.r.a(r2, r1)
            r9 = 420(0x1a4, float:5.89E-43)
            float r9 = (float) r9
            y0.o r1 = p.h1.o(r1, r9)
            r9 = 1065353216(0x3f800000, float:1.0)
            y0.o r1 = p.h1.d(r1, r9)
            r9 = 0
            float r3 = r3.f13344g
            r0 = 1
            y0.o r1 = p.h1.g(r1, r9, r3, r0)
            java.lang.Object r3 = r4.P()
            if (r3 != r10) goto L1e6
            wb.pv r3 = wb.pv.f18549a
            r4.k0(r3)
        L1e6:
            androidx.compose.ui.input.pointer.PointerInputEventHandler r3 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) r3
            sf.n r9 = sf.n.f12433a
            y0.o r1 = s1.h0.a(r1, r9, r3)
            r3 = 32
            float r3 = (float) r3
            v.d r3 = v.e.a(r3)
            y0.o r1 = c1.h.b(r1, r3)
            java.lang.Object r3 = r4.j(r5)
            bi.b r3 = (bi.b) r3
            long r9 = r3.a()
            y0.o r1 = k.n.g(r1, r9, r6)
            r3 = 24
            float r3 = (float) r3
            y0.o r1 = p.d.l(r1, r3)
            p.e r3 = p.j.f9926c
            y0.e r6 = y0.b.f21804s
            r9 = 0
            p.t r3 = p.s.a(r3, r6, r4, r9)
            long r9 = r4.T
            int r6 = java.lang.Long.hashCode(r9)
            s0.h r9 = r4.l()
            y0.o r1 = y0.a.c(r4, r1)
            r4.d0()
            boolean r10 = r4.S
            if (r10 == 0) goto L230
            r4.k(r15)
            goto L233
        L230:
            r4.n0()
        L233:
            i0.r.A(r13, r4, r3)
            i0.r.A(r14, r4, r9)
            j8.b.p(r6, r4, r8, r4, r7)
            i0.r.A(r12, r4, r1)
            boolean r1 = og.m.t0(r28)
            if (r1 != 0) goto L2ba
            r1 = 503801932(0x1e07684c, float:7.1684086E-21)
            r4.a0(r1)
            java.lang.Object r1 = r4.j(r5)
            bi.b r1 = (bi.b) r1
            long r5 = r1.d()
            r1 = 20
            long r7 = x6.d.D(r1)
            r9 = r5
            m2.k r6 = m2.k.f8698j
            r1 = 1065353216(0x3f800000, float:1.0)
            y0.o r16 = p.h1.d(r2, r1)
            r19 = 0
            r21 = 7
            r17 = 0
            r18 = 0
            y0.o r1 = p.d.p(r16, r17, r18, r19, r20, r21)
            r2 = r9
            t2.k r10 = new t2.k
            r5 = 3
            r10.<init>(r5)
            int r5 = r11 >> 3
            r5 = r5 & 14
            r9 = 1597488(0x186030, float:2.238557E-39)
            r20 = r5 | r9
            r21 = 0
            r5 = 12
            r22 = 261032(0x3fba8, float:3.65784E-40)
            r25 = r7
            r8 = r5
            r4 = r25
            r7 = 0
            r12 = r8
            r8 = 0
            r13 = r11
            r14 = r12
            r11 = 0
            r15 = r13
            r13 = 0
            r16 = r14
            r14 = 0
            r17 = r15
            r15 = 0
            r18 = r16
            r16 = 0
            r19 = r17
            r17 = 0
            r23 = r18
            r18 = 0
            r0 = r28
            r24 = r23
            r23 = r19
            r19 = r32
            sh.s.n(r0, r1, r2, r4, r6, r7, r8, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r0 = r19
            r9 = 0
            r0.p(r9)
            goto L2c9
        L2ba:
            r0 = r4
            r23 = r11
            r9 = 0
            r24 = 12
            r1 = 504174397(0x1e0d173d, float:7.4692834E-21)
            r0.a0(r1)
            r0.p(r9)
        L2c9:
            int r1 = r23 >> 12
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r5 = r31
            r5.invoke(r0, r1)
            r15 = 1
            r0.p(r15)
            r0.p(r15)
            goto L2e1
        L2de:
            r0.V()
        L2e1:
            i0.r1 r8 = r0.t()
            if (r8 == 0) goto L2f9
            wb.ru r0 = new wb.ru
            r7 = 1
            r1 = r27
            r2 = r28
            r3 = r29
            r4 = r30
            r6 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto Ld5
        L2f9:
            return
    }

    public void K(java.lang.String r24, boolean r25, fg.a r26, i0.h0 r27, int r28) {
            r23 = this;
            r1 = r25
            r6 = r27
            r0 = 109445172(0x6860034, float:5.0405496E-35)
            r6.b0(r0)
            boolean r0 = r6.g(r1)
            if (r0 == 0) goto L13
            r0 = 32
            goto L15
        L13:
            r0 = 16
        L15:
            r0 = r28 | r0
            r4 = r26
            boolean r2 = r6.h(r4)
            if (r2 == 0) goto L22
            r2 = 256(0x100, float:3.59E-43)
            goto L24
        L22:
            r2 = 128(0x80, float:1.8E-43)
        L24:
            r0 = r0 | r2
            r2 = r0 & 147(0x93, float:2.06E-43)
            r3 = 146(0x92, float:2.05E-43)
            r7 = 1
            r8 = 0
            if (r2 == r3) goto L2f
            r2 = r7
            goto L30
        L2f:
            r2 = r8
        L30:
            r0 = r0 & r7
            boolean r0 = r6.S(r0, r2)
            if (r0 == 0) goto L143
            r0 = 6
            float r10 = (float) r0
            r13 = 0
            r14 = 14
            y0.l r9 = y0.l.f21818a
            r11 = 0
            r12 = 0
            y0.o r0 = p.d.p(r9, r10, r11, r12, r13, r14)
            r2 = 34
            float r2 = (float) r2
            r3 = 28
            float r3 = (float) r3
            y0.o r0 = p.h1.k(r0, r2, r3)
            r2 = 8
            float r2 = (float) r2
            v.d r2 = v.e.a(r2)
            y0.o r0 = c1.h.b(r0, r2)
            if (r1 == 0) goto L78
            r2 = 601298634(0x23d716ca, float:2.3319998E-17)
            r6.a0(r2)
            i0.m2 r2 = bi.d.f892a
            java.lang.Object r2 = r6.j(r2)
            bi.b r2 = (bi.b) r2
            long r2 = r2.g()
            r5 = 1034147594(0x3da3d70a, float:0.08)
            long r2 = f1.w.b(r2, r5)
            r6.p(r8)
            goto L94
        L78:
            r2 = 601403786(0x23d8b18a, float:2.3493958E-17)
            r6.a0(r2)
            i0.m2 r2 = bi.d.f892a
            java.lang.Object r2 = r6.j(r2)
            bi.b r2 = (bi.b) r2
            long r2 = r2.g()
            r5 = 1025758986(0x3d23d70a, float:0.04)
            long r2 = f1.w.b(r2, r5)
            r6.p(r8)
        L94:
            f1.m0 r5 = f1.c0.f3038b
            y0.o r0 = k.n.g(r0, r2, r5)
            r3 = 0
            r5 = 14
            r2 = 0
            y0.o r0 = k.n.j(r0, r1, r2, r3, r4, r5)
            y0.g r1 = y0.b.f21796k
            v1.n0 r1 = p.o.d(r1, r8)
            long r2 = r6.T
            int r2 = java.lang.Long.hashCode(r2)
            s0.h r3 = r6.l()
            y0.o r0 = y0.a.c(r6, r0)
            x1.f r4 = x1.g.f20914f
            r4.getClass()
            x1.y r4 = x1.f.f20883b
            r6.d0()
            boolean r5 = r6.S
            if (r5 == 0) goto Lc8
            r6.k(r4)
            goto Lcb
        Lc8:
            r6.n0()
        Lcb:
            x1.e r4 = x1.f.f20886e
            i0.r.A(r4, r6, r1)
            x1.e r1 = x1.f.f20885d
            i0.r.A(r1, r6, r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            x1.e r2 = x1.f.f20887f
            i0.r.A(r2, r6, r1)
            x1.d r1 = x1.f.f20888g
            i0.r.w(r1, r6)
            x1.e r1 = x1.f.f20884c
            i0.r.A(r1, r6, r0)
            if (r25 == 0) goto L101
            r0 = 1051639907(0x3eaec063, float:0.34131154)
            r6.a0(r0)
            i0.m2 r0 = bi.d.f892a
            java.lang.Object r0 = r6.j(r0)
            bi.b r0 = (bi.b) r0
            long r0 = r0.g()
        Lfc:
            r6.p(r8)
            r2 = r0
            goto L114
        L101:
            r0 = 1051641137(0x3eaec531, float:0.3413482)
            r6.a0(r0)
            i0.m2 r0 = bi.d.f892a
            java.lang.Object r0 = r6.j(r0)
            bi.b r0 = (bi.b) r0
            long r0 = r0.h()
            goto Lfc
        L114:
            r0 = 12
            long r4 = x6.d.D(r0)
            m2.k r6 = m2.k.f8698j
            r21 = 0
            r22 = 262058(0x3ffaa, float:3.67221E-40)
            r1 = 0
            r0 = r7
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 1597446(0x186006, float:2.238499E-39)
            r0 = r24
            r19 = r27
            sh.s.n(r0, r1, r2, r4, r6, r7, r8, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r6 = r19
            r0 = 1
            r6.p(r0)
            goto L146
        L143:
            r6.V()
        L146:
            i0.r1 r7 = r6.t()
            if (r7 == 0) goto L15e
            sh.j r0 = new sh.j
            r6 = 7
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f6035d = r0
        L15e:
            return
    }

    public void L(float r22, boolean r23, fg.l r24, i0.h0 r25, int r26) {
            r21 = this;
            r2 = r22
            r3 = r23
            r4 = r24
            r0 = r25
            r1 = 2071200817(0x7b740431, float:1.26700545E36)
            r0.b0(r1)
            boolean r1 = r0.c(r2)
            r5 = 2
            r6 = 4
            if (r1 == 0) goto L18
            r1 = r6
            goto L19
        L18:
            r1 = r5
        L19:
            r1 = r26 | r1
            boolean r7 = r0.g(r3)
            r8 = 32
            if (r7 == 0) goto L25
            r7 = r8
            goto L27
        L25:
            r7 = 16
        L27:
            r1 = r1 | r7
            boolean r7 = r0.h(r4)
            r9 = 256(0x100, float:3.59E-43)
            if (r7 == 0) goto L32
            r7 = r9
            goto L34
        L32:
            r7 = 128(0x80, float:1.8E-43)
        L34:
            r1 = r1 | r7
            r7 = r1 & 147(0x93, float:2.06E-43)
            r10 = 146(0x92, float:2.05E-43)
            r11 = 1
            r12 = 0
            if (r7 == r10) goto L3f
            r7 = r11
            goto L40
        L3f:
            r7 = r12
        L40:
            r10 = r1 & 1
            boolean r7 = r0.S(r10, r7)
            if (r7 == 0) goto L158
            y0.l r7 = y0.l.f21818a
            r10 = 1065353216(0x3f800000, float:1.0)
            y0.o r13 = p.h1.d(r7, r10)
            r14 = 28
            float r14 = (float) r14
            y0.o r15 = p.h1.e(r13, r14)
            r13 = 12
            float r13 = (float) r13
            r19 = 0
            r20 = 13
            r16 = 0
            r18 = 0
            r17 = r13
            y0.o r13 = p.d.p(r15, r16, r17, r18, r19, r20)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r3)
            r15 = r1 & 112(0x70, float:1.57E-43)
            if (r15 != r8) goto L72
            r8 = r11
            goto L73
        L72:
            r8 = r12
        L73:
            r1 = r1 & 896(0x380, float:1.256E-42)
            if (r1 != r9) goto L79
            r1 = r11
            goto L7a
        L79:
            r1 = r12
        L7a:
            r1 = r1 | r8
            java.lang.Object r8 = r0.P()
            if (r1 != 0) goto L85
            i0.e r1 = i0.l.f5952a
            if (r8 != r1) goto L8e
        L85:
            wb.bu r8 = new wb.bu
            r1 = 1
            r8.<init>(r1, r4, r3)
            r0.k0(r8)
        L8e:
            androidx.compose.ui.input.pointer.PointerInputEventHandler r8 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) r8
            y0.o r1 = s1.h0.a(r13, r14, r8)
            y0.g r8 = y0.b.f21795j
            v1.n0 r8 = p.o.d(r8, r12)
            long r13 = r0.T
            int r9 = java.lang.Long.hashCode(r13)
            s0.h r13 = r0.l()
            y0.o r1 = y0.a.c(r0, r1)
            x1.f r14 = x1.g.f20914f
            r14.getClass()
            x1.y r14 = x1.f.f20883b
            r0.d0()
            boolean r15 = r0.S
            if (r15 == 0) goto Lba
            r0.k(r14)
            goto Lbd
        Lba:
            r0.n0()
        Lbd:
            x1.e r14 = x1.f.f20886e
            i0.r.A(r14, r0, r8)
            x1.e r8 = x1.f.f20885d
            i0.r.A(r8, r0, r13)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            x1.e r9 = x1.f.f20887f
            i0.r.A(r9, r0, r8)
            x1.d r8 = x1.f.f20888g
            i0.r.w(r8, r0)
            x1.e r8 = x1.f.f20884c
            i0.r.A(r8, r0, r1)
            y0.o r1 = p.h1.d(r7, r10)
            float r6 = (float) r6
            y0.o r1 = p.h1.e(r1, r6)
            float r5 = (float) r5
            v.d r8 = v.e.a(r5)
            y0.o r1 = c1.h.b(r1, r8)
            i0.m2 r8 = bi.d.f892a
            java.lang.Object r9 = r0.j(r8)
            bi.b r9 = (bi.b) r9
            long r13 = r9.g()
            r9 = 1039516303(0x3df5c28f, float:0.12)
            long r13 = f1.w.b(r13, r9)
            f1.m0 r9 = f1.c0.f3038b
            y0.o r1 = k.n.g(r1, r13, r9)
            p.o.a(r1, r0, r12)
            r1 = 0
            float r1 = r9.e0.q(r2, r1, r10)
            y0.o r1 = p.h1.d(r7, r1)
            y0.o r1 = p.h1.e(r1, r6)
            v.d r5 = v.e.a(r5)
            y0.o r1 = c1.h.b(r1, r5)
            if (r3 == 0) goto L133
            r5 = -305779391(0xffffffffedc62d41, float:-7.6665926E27)
            r0.a0(r5)
            java.lang.Object r5 = r0.j(r8)
            bi.b r5 = (bi.b) r5
            long r5 = r5.j()
            r0.p(r12)
            goto L14d
        L133:
            r5 = -305687445(0xffffffffedc7946b, float:-7.720868E27)
            r0.a0(r5)
            java.lang.Object r5 = r0.j(r8)
            bi.b r5 = (bi.b) r5
            long r5 = r5.g()
            r7 = 1043878380(0x3e3851ec, float:0.18)
            long r5 = f1.w.b(r5, r7)
            r0.p(r12)
        L14d:
            y0.o r1 = k.n.g(r1, r5, r9)
            p.o.a(r1, r0, r12)
            r0.p(r11)
            goto L15b
        L158:
            r0.V()
        L15b:
            i0.r1 r6 = r0.t()
            if (r6 == 0) goto L16c
            wb.ev r0 = new wb.ev
            r1 = r21
            r5 = r26
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f6035d = r0
        L16c:
            return
    }

    public void L1(android.content.Context r14, vb.a r15, fg.a r16, i0.h0 r17, int r18) {
            r13 = this;
            r9 = r17
            r10 = r18
            r15.getClass()
            r16.getClass()
            r0 = -1841291209(0xffffffff92402037, float:-6.0624225E-28)
            r9.b0(r0)
            r0 = r10 & 6
            if (r0 != 0) goto L1f
            boolean r0 = r9.h(r14)
            if (r0 == 0) goto L1c
            r0 = 4
            goto L1d
        L1c:
            r0 = 2
        L1d:
            r0 = r0 | r10
            goto L20
        L1f:
            r0 = r10
        L20:
            r3 = r10 & 48
            if (r3 != 0) goto L39
            r3 = r10 & 64
            if (r3 != 0) goto L2d
            boolean r3 = r9.f(r15)
            goto L31
        L2d:
            boolean r3 = r9.h(r15)
        L31:
            if (r3 == 0) goto L36
            r3 = 32
            goto L38
        L36:
            r3 = 16
        L38:
            r0 = r0 | r3
        L39:
            r3 = r10 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L4c
            r3 = r16
            boolean r4 = r9.h(r3)
            if (r4 == 0) goto L48
            r4 = 256(0x100, float:3.59E-43)
            goto L4a
        L48:
            r4 = 128(0x80, float:1.8E-43)
        L4a:
            r0 = r0 | r4
            goto L4e
        L4c:
            r3 = r16
        L4e:
            r4 = r0 & 147(0x93, float:2.06E-43)
            r5 = 146(0x92, float:2.05E-43)
            r6 = 1
            if (r4 == r5) goto L57
            r4 = r6
            goto L58
        L57:
            r4 = 0
        L58:
            r0 = r0 & r6
            boolean r0 = r9.S(r0, r4)
            if (r0 == 0) goto Lfa
            java.lang.Object r0 = r9.P()
            i0.e r4 = i0.l.f5952a
            if (r0 != r4) goto L70
            java.lang.String r0 = "Hchat_moments_auto_comment_config"
            android.content.SharedPreferences r0 = ub.b.c(r14, r0)
            r9.k0(r0)
        L70:
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.lang.Object r5 = r9.P()
            if (r5 != r4) goto L81
            wb.mo r5 = wb.mo.f17734a
            i0.j1 r5 = i0.r.u(r5)
            r9.k0(r5)
        L81:
            r7 = r5
            i0.a1 r7 = (i0.a1) r7
            java.lang.Object r5 = r9.P()
            java.lang.String r6 = ""
            if (r5 != r4) goto La0
            java.lang.String r5 = "comment_whitelist"
            java.lang.String r5 = r0.getString(r5, r6)
            if (r5 != 0) goto L95
            r5 = r6
        L95:
            java.util.Set r5 = wb.ho.y6(r5)
            i0.j1 r5 = i0.r.u(r5)
            r9.k0(r5)
        La0:
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r8 = r9.P()
            if (r8 != r4) goto Lbd
            java.lang.String r8 = "comment_blacklist"
            java.lang.String r8 = r0.getString(r8, r6)
            if (r8 != 0) goto Lb1
            goto Lb2
        Lb1:
            r6 = r8
        Lb2:
            java.util.Set r6 = wb.ho.y6(r6)
            i0.j1 r8 = i0.r.u(r6)
            r9.k0(r8)
        Lbd:
            r6 = r8
            i0.a1 r6 = (i0.a1) r6
            java.lang.Object r8 = r7.getValue()
            r11 = r8
            wb.no r11 = (wb.no) r11
            java.lang.Object r8 = r9.P()
            if (r8 != r4) goto Ld7
            wb.jk r8 = new wb.jk
            r4 = 25
            r8.<init>(r4)
            r9.k0(r8)
        Ld7:
            r12 = r8
            fg.l r12 = (fg.l) r12
            r2 = r0
            wb.vj r0 = new wb.vj
            r8 = 1
            r4 = r14
            r1 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = -185439848(0xfffffffff4f26998, float:-1.5364716E32)
            s0.d r5 = s0.i.e(r1, r0, r9)
            r7 = 200064(0x30d80, float:2.8035E-40)
            r8 = 18
            r1 = 0
            java.lang.String r2 = "MomentsAutoCommentRoute"
            r4 = 0
            r6 = r9
            r0 = r11
            r3 = r12
            wb.ho.E3(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            goto Lfd
        Lfa:
            r17.V()
        Lfd:
            i0.r1 r7 = r17.t()
            if (r7 == 0) goto L112
            s0.c r0 = new s0.c
            r6 = 10
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f6035d = r0
        L112:
            return
    }

    public void M(java.lang.String r34, fg.l r35, y0.o r36, i0.h0 r37, int r38) {
            r33 = this;
            r3 = r35
            r4 = r36
            r1 = r37
            r5 = r38
            r0 = -1097712649(0xffffffffbe923bf7, float:-0.28561375)
            r1.b0(r0)
            r0 = r5 & 6
            r2 = 2
            r6 = r34
            if (r0 != 0) goto L20
            boolean r0 = r1.f(r6)
            if (r0 == 0) goto L1d
            r0 = 4
            goto L1e
        L1d:
            r0 = r2
        L1e:
            r0 = r0 | r5
            goto L21
        L20:
            r0 = r5
        L21:
            r7 = r5 & 48
            if (r7 != 0) goto L31
            boolean r7 = r1.h(r3)
            if (r7 == 0) goto L2e
            r7 = 32
            goto L30
        L2e:
            r7 = 16
        L30:
            r0 = r0 | r7
        L31:
            r7 = r5 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L41
            boolean r7 = r1.f(r4)
            if (r7 == 0) goto L3e
            r7 = 256(0x100, float:3.59E-43)
            goto L40
        L3e:
            r7 = 128(0x80, float:1.8E-43)
        L40:
            r0 = r0 | r7
        L41:
            r7 = r5 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L55
            r7 = r33
            boolean r9 = r1.f(r7)
            if (r9 == 0) goto L50
            r9 = 2048(0x800, float:2.87E-42)
            goto L52
        L50:
            r9 = 1024(0x400, float:1.435E-42)
        L52:
            r0 = r0 | r9
        L53:
            r9 = r0
            goto L58
        L55:
            r7 = r33
            goto L53
        L58:
            r0 = r9 & 1171(0x493, float:1.641E-42)
            r10 = 1170(0x492, float:1.64E-42)
            r11 = 0
            if (r0 == r10) goto L61
            r0 = 1
            goto L62
        L61:
            r0 = r11
        L62:
            r10 = r9 & 1
            boolean r0 = r1.S(r10, r0)
            if (r0 == 0) goto L37c
            java.lang.String r0 = a7.a.i(r6)
            int r10 = r0.length()
            r13 = 3
            r14 = 1065353216(0x3f800000, float:1.0)
            r15 = 0
            if (r10 != 0) goto L80
            wb.e5 r0 = new wb.e5
            r0.<init>(r15, r14, r14)
            r17 = 1
            goto Lae
        L80:
            float[] r10 = new float[r13]     // Catch: java.lang.Throwable -> L99
            int r0 = android.graphics.Color.parseColor(r0)     // Catch: java.lang.Throwable -> L99
            android.graphics.Color.colorToHSV(r0, r10)     // Catch: java.lang.Throwable -> L99
            wb.e5 r0 = new wb.e5     // Catch: java.lang.Throwable -> L99
            r13 = r10[r11]     // Catch: java.lang.Throwable -> L99
            r17 = 1
            r12 = r10[r17]     // Catch: java.lang.Throwable -> L97
            r10 = r10[r2]     // Catch: java.lang.Throwable -> L97
            r0.<init>(r13, r12, r10)     // Catch: java.lang.Throwable -> L97
            goto La2
        L97:
            r0 = move-exception
            goto L9c
        L99:
            r0 = move-exception
            r17 = 1
        L9c:
            sf.f r10 = new sf.f
            r10.<init>(r0)
            r0 = r10
        La2:
            wb.e5 r10 = new wb.e5
            r10.<init>(r15, r14, r14)
            boolean r12 = r0 instanceof sf.f
            if (r12 == 0) goto Lac
            r0 = r10
        Lac:
            wb.e5 r0 = (wb.e5) r0
        Lae:
            i0.m2 r10 = bi.d.f892a
            java.lang.Object r10 = r1.j(r10)
            bi.b r10 = (bi.b) r10
            long r12 = r10.g()
            i0.m2 r10 = y1.h1.f21946h
            java.lang.Object r10 = r1.j(r10)
            u2.c r10 = (u2.c) r10
            r15 = 204(0xcc, float:2.86E-43)
            float r15 = (float) r15
            r11 = 36
            float r11 = (float) r11
            boolean r19 = r1.f(r10)
            java.lang.Object r8 = r1.P()
            i0.e r14 = i0.l.f5952a
            if (r19 != 0) goto Ld6
            if (r8 != r14) goto Le1
        Ld6:
            int r8 = r10.G0(r15)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r1.k0(r8)
        Le1:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            boolean r19 = r1.f(r10)
            java.lang.Object r2 = r1.P()
            if (r19 != 0) goto Lf3
            if (r2 != r14) goto Lfe
        Lf3:
            int r2 = r10.G0(r11)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.k0(r2)
        Lfe:
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            float r10 = r0.f15831a
            boolean r19 = r1.c(r10)
            boolean r22 = r1.d(r8)
            r19 = r19 | r22
            java.lang.Object r5 = r1.P()
            if (r19 != 0) goto L118
            if (r5 != r14) goto L14c
        L118:
            r5 = 2
            if (r8 >= r5) goto L11d
            r5 = 2
            goto L11e
        L11d:
            r5 = r8
        L11e:
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r25 = android.graphics.Bitmap.createBitmap(r5, r5, r6)
            r25.getClass()
            int r6 = r5 * r5
            int[] r6 = new int[r6]
            r26 = r6
            r6 = 0
            r19 = 0
        L130:
            if (r6 < r5) goto L321
            r29 = 0
            r30 = 0
            r27 = 0
            r31 = r5
            r32 = r5
            r28 = r5
            r25.setPixels(r26, r27, r28, r29, r30, r31, r32)
            r5 = r25
            f1.g r6 = new f1.g
            r6.<init>(r5)
            r1.k0(r6)
            r5 = r6
        L14c:
            f1.g r5 = (f1.g) r5
            boolean r6 = r1.d(r8)
            boolean r19 = r1.d(r2)
            r6 = r6 | r19
            r19 = r6
            java.lang.Object r6 = r1.P()
            if (r19 != 0) goto L162
            if (r6 != r14) goto L197
        L162:
            r6 = 2
            if (r2 >= r6) goto L166
            r2 = r6
        L166:
            if (r8 >= r6) goto L169
            r8 = 2
        L169:
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r25 = android.graphics.Bitmap.createBitmap(r2, r8, r6)
            r25.getClass()
            int r6 = r2 * r8
            int[] r6 = new int[r6]
            r28 = r2
            r2 = 0
            r19 = 0
        L17b:
            if (r2 < r8) goto L2cf
            r29 = 0
            r30 = 0
            r27 = 0
            r31 = r28
            r26 = r6
            r32 = r8
            r25.setPixels(r26, r27, r28, r29, r30, r31, r32)
            r6 = r25
            f1.g r2 = new f1.g
            r2.<init>(r6)
            r1.k0(r2)
            r6 = r2
        L197:
            f1.g r6 = (f1.g) r6
            r2 = 1065353216(0x3f800000, float:1.0)
            y0.o r2 = p.h1.d(r4, r2)
            p.f r8 = p.j.f9928e
            y0.f r4 = y0.b.f21802q
            r7 = 54
            p.e1 r4 = p.d1.a(r8, r4, r1, r7)
            long r7 = r1.T
            int r7 = java.lang.Long.hashCode(r7)
            s0.h r8 = r1.l()
            y0.o r2 = y0.a.c(r1, r2)
            x1.f r16 = x1.g.f20914f
            r16.getClass()
            r16 = r7
            x1.y r7 = x1.f.f20883b
            r1.d0()
            r22 = r9
            boolean r9 = r1.S
            if (r9 == 0) goto L1cd
            r1.k(r7)
            goto L1d0
        L1cd:
            r1.n0()
        L1d0:
            x1.e r7 = x1.f.f20886e
            i0.r.A(r7, r1, r4)
            x1.e r4 = x1.f.f20885d
            i0.r.A(r4, r1, r8)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r16)
            x1.e r7 = x1.f.f20887f
            i0.r.A(r7, r1, r4)
            x1.d r4 = x1.f.f20888g
            i0.r.w(r4, r1)
            x1.e r4 = x1.f.f20884c
            i0.r.A(r4, r1, r2)
            y0.l r2 = y0.l.f21818a
            y0.o r4 = p.h1.j(r2, r15)
            java.lang.Float r7 = java.lang.Float.valueOf(r10)
            r8 = r22 & 112(0x70, float:1.57E-43)
            r9 = 32
            if (r8 != r9) goto L200
            r9 = r17
            goto L201
        L200:
            r9 = 0
        L201:
            boolean r10 = r1.f(r0)
            r9 = r9 | r10
            java.lang.Object r10 = r1.P()
            if (r9 != 0) goto L20e
            if (r10 != r14) goto L217
        L20e:
            wb.g5 r10 = new wb.g5
            r9 = 0
            r10.<init>(r3, r0, r9)
            r1.k0(r10)
        L217:
            androidx.compose.ui.input.pointer.PointerInputEventHandler r10 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) r10
            y0.o r4 = s1.h0.a(r4, r7, r10)
            boolean r7 = r1.h(r5)
            boolean r9 = r1.f(r0)
            r7 = r7 | r9
            boolean r9 = r1.e(r12)
            r7 = r7 | r9
            java.lang.Object r9 = r1.P()
            if (r7 != 0) goto L233
            if (r9 != r14) goto L245
        L233:
            wb.a5 r18 = new wb.a5
            r23 = 0
            r20 = r0
            r19 = r5
            r21 = r12
            r18.<init>(r19, r20, r21, r23)
            r9 = r18
            r1.k0(r9)
        L245:
            fg.l r9 = (fg.l) r9
            r5 = 0
            k.n.a(r4, r9, r1, r5)
            r4 = 12
            float r4 = (float) r4
            r29 = 0
            r30 = 14
            r27 = 0
            r28 = 0
            r25 = r2
            r26 = r4
            y0.o r2 = p.d.p(r25, r26, r27, r28, r29, r30)
            y0.o r2 = p.h1.k(r2, r11, r15)
            v.d r4 = v.e.a(r26)
            y0.o r2 = c1.h.b(r2, r4)
            float r4 = r0.f15832b
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            float r5 = r0.f15833c
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r9 = 32
            if (r8 != r9) goto L27d
            r7 = r17
            goto L27e
        L27d:
            r7 = 0
        L27e:
            boolean r8 = r1.f(r0)
            r7 = r7 | r8
            java.lang.Object r8 = r1.P()
            if (r7 != 0) goto L28b
            if (r8 != r14) goto L295
        L28b:
            wb.g5 r8 = new wb.g5
            r7 = r17
            r8.<init>(r3, r0, r7)
            r1.k0(r8)
        L295:
            androidx.compose.ui.input.pointer.PointerInputEventHandler r8 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) r8
            y0.o r2 = s1.h0.b(r2, r4, r5, r8)
            boolean r4 = r1.h(r6)
            boolean r5 = r1.f(r0)
            r4 = r4 | r5
            boolean r5 = r1.e(r12)
            r4 = r4 | r5
            java.lang.Object r5 = r1.P()
            if (r4 != 0) goto L2b1
            if (r5 != r14) goto L2c3
        L2b1:
            wb.a5 r18 = new wb.a5
            r23 = 1
            r20 = r0
            r19 = r6
            r21 = r12
            r18.<init>(r19, r20, r21, r23)
            r5 = r18
            r1.k0(r5)
        L2c3:
            fg.l r5 = (fg.l) r5
            r9 = 0
            k.n.a(r2, r5, r1, r9)
            r7 = 1
            r1.p(r7)
            goto L37f
        L2cf:
            r4 = r5
            r26 = r6
            r32 = r8
            r22 = r9
            r6 = r25
            r7 = r28
            r9 = 32
            float r5 = (float) r2
            int r8 = r32 + (-1)
            float r8 = (float) r8
            float r5 = r5 / r8
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            float r5 = r9.e0.q(r5, r9, r8)
            r9 = 1135869952(0x43b40000, float:360.0)
            float r5 = r5 * r9
            r20 = r8
            r9 = 3
            float[] r8 = new float[r9]
            r24 = 0
            r8[r24] = r5
            r17 = 1
            r8[r17] = r20
            r21 = 2
            r8[r21] = r20
            int r5 = android.graphics.Color.HSVToColor(r8)
            r9 = 0
        L301:
            if (r9 >= r7) goto L30c
            int r8 = r19 + 1
            r26[r19] = r5
            int r9 = r9 + 1
            r19 = r8
            goto L301
        L30c:
            int r2 = r2 + 1
            r5 = r4
            r25 = r6
            r28 = r7
            r9 = r22
            r6 = r26
            r8 = r32
            r17 = 1
            r7 = r33
            r4 = r36
            goto L17b
        L321:
            r22 = r9
            r23 = r26
            r9 = r5
            r5 = r25
            float r4 = (float) r6
            int r7 = r9 + (-1)
            float r7 = (float) r7
            float r4 = r4 / r7
            r1 = 1065353216(0x3f800000, float:1.0)
            float r4 = r1 - r4
            r20 = r2
            r2 = 0
            float r4 = r9.e0.q(r4, r2, r1)
            r1 = 0
        L339:
            if (r1 < r9) goto L350
            int r6 = r6 + 1
            r7 = r33
            r4 = r36
            r1 = r37
            r25 = r5
            r5 = r9
            r2 = r20
            r9 = r22
            r26 = r23
            r17 = 1
            goto L130
        L350:
            r25 = r0
            float r0 = (float) r1
            float r0 = r0 / r7
            r26 = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r9.e0.q(r0, r2, r1)
            int r18 = r19 + 1
            r1 = 3
            float[] r2 = new float[r1]
            r24 = 0
            r2[r24] = r10
            r17 = 1
            r2[r17] = r0
            r21 = 2
            r2[r21] = r4
            int r0 = android.graphics.Color.HSVToColor(r2)
            r23[r19] = r0
            int r0 = r26 + 1
            r1 = r0
            r19 = r18
            r0 = r25
            r2 = 0
            goto L339
        L37c:
            r37.V()
        L37f:
            i0.r1 r7 = r37.t()
            if (r7 == 0) goto L395
            s0.c r0 = new s0.c
            r6 = 3
            r1 = r33
            r2 = r34
            r4 = r36
            r5 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f6035d = r0
        L395:
            return
    }

    public void N(boolean r9, java.lang.String r10, fg.l r11, i0.h0 r12, int r13) {
            r8 = this;
            r0 = 1318365662(0x4e94a9de, float:1.2470802E9)
            r12.b0(r0)
            boolean r1 = r12.g(r9)
            if (r1 == 0) goto Le
            r1 = 4
            goto Lf
        Le:
            r1 = 2
        Lf:
            r1 = r1 | r13
            boolean r2 = r12.h(r11)
            if (r2 == 0) goto L19
            r2 = 256(0x100, float:3.59E-43)
            goto L1b
        L19:
            r2 = 128(0x80, float:1.8E-43)
        L1b:
            r1 = r1 | r2
            r2 = r1 & 147(0x93, float:2.06E-43)
            r3 = 146(0x92, float:2.05E-43)
            if (r2 == r3) goto L24
            r2 = 1
            goto L25
        L24:
            r2 = 0
        L25:
            r3 = r1 & 1
            boolean r2 = r12.S(r3, r2)
            if (r2 == 0) goto L46
            r2 = r1 & 14
            r2 = r2 | 432(0x1b0, float:6.05E-43)
            r3 = 57344(0xe000, float:8.0356E-41)
            int r1 = r1 << 6
            r1 = r1 & r3
            r6 = r2 | r1
            r7 = 8
            java.lang.String r1 = "始终允许"
            r3 = 0
            r0 = r9
            r2 = r10
            r4 = r11
            r5 = r12
            wb.ho.P3(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L49
        L46:
            r12.V()
        L49:
            i0.r1 r0 = r12.t()
            if (r0 == 0) goto L5c
            sh.j r1 = new sh.j
            r3 = 6
            r4 = r8
            r7 = r9
            r5 = r10
            r6 = r11
            r2 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.f6035d = r1
        L5c:
            return
    }

    public void O(java.lang.String r77, java.util.List r78, java.lang.String r79, java.util.List r80, fb.a1 r81, java.util.List r82, boolean r83, java.lang.String r84, java.lang.String r85, boolean r86, boolean r87, boolean r88, boolean r89, long r90, java.lang.String r92, boolean r93, java.lang.String r94, fg.l r95, fg.a r96, fg.a r97, fg.a r98, fg.a r99, fg.l r100, fg.a r101, fg.l r102, fg.l r103, fg.l r104, fg.l r105, fg.a r106, fg.a r107, fg.a r108, fg.a r109, fg.a r110, fg.a r111, fg.a r112, fg.l r113, fg.l r114, fg.l r115, fg.l r116, fg.l r117, fg.l r118, fg.l r119, fg.a r120, i0.h0 r121, int r122) {
            r76 = this;
            r2 = r78
            r8 = r110
            r9 = r112
            r10 = r113
            r11 = r114
            r14 = r116
            r12 = r118
            r13 = r119
            r7 = r121
            r0 = 688804430(0x290e524e, float:3.1601722E-14)
            r7.b0(r0)
            r0 = r77
            boolean r1 = r7.f(r0)
            if (r1 == 0) goto L22
            r1 = 4
            goto L23
        L22:
            r1 = 2
        L23:
            r1 = r122 | r1
            boolean r5 = r7.f(r2)
            if (r5 == 0) goto L2e
            r5 = 32
            goto L30
        L2e:
            r5 = 16
        L30:
            r1 = r1 | r5
            r5 = r79
            boolean r16 = r7.f(r5)
            r17 = 128(0x80, float:1.8E-43)
            if (r16 == 0) goto L3e
            r16 = 256(0x100, float:3.59E-43)
            goto L40
        L3e:
            r16 = r17
        L40:
            r1 = r1 | r16
            r6 = r80
            boolean r16 = r7.f(r6)
            r19 = 1024(0x400, float:1.435E-42)
            r20 = 2048(0x800, float:2.87E-42)
            if (r16 == 0) goto L51
            r16 = r20
            goto L53
        L51:
            r16 = r19
        L53:
            r1 = r1 | r16
            r6 = r81
            boolean r16 = r7.f(r6)
            r21 = 8192(0x2000, float:1.148E-41)
            r22 = 16384(0x4000, float:2.2959E-41)
            if (r16 == 0) goto L64
            r16 = r22
            goto L66
        L64:
            r16 = r21
        L66:
            r1 = r1 | r16
            r6 = r82
            boolean r16 = r7.f(r6)
            r23 = 65536(0x10000, float:9.1835E-41)
            if (r16 == 0) goto L75
            r16 = 131072(0x20000, float:1.83671E-40)
            goto L77
        L75:
            r16 = r23
        L77:
            r1 = r1 | r16
            r6 = r83
            boolean r16 = r7.g(r6)
            r25 = 524288(0x80000, float:7.34684E-40)
            if (r16 == 0) goto L86
            r16 = 1048576(0x100000, float:1.469368E-39)
            goto L88
        L86:
            r16 = r25
        L88:
            r1 = r1 | r16
            r6 = r84
            boolean r16 = r7.f(r6)
            r27 = 4194304(0x400000, float:5.877472E-39)
            r28 = 8388608(0x800000, float:1.1754944E-38)
            if (r16 == 0) goto L99
            r16 = r28
            goto L9b
        L99:
            r16 = r27
        L9b:
            r1 = r1 | r16
            r6 = r85
            boolean r16 = r7.f(r6)
            r29 = 33554432(0x2000000, float:9.403955E-38)
            if (r16 == 0) goto Laa
            r16 = 67108864(0x4000000, float:1.5046328E-36)
            goto Lac
        Laa:
            r16 = r29
        Lac:
            r1 = r1 | r16
            r6 = r86
            boolean r16 = r7.g(r6)
            r32 = 268435456(0x10000000, float:2.524355E-29)
            if (r16 == 0) goto Lbb
            r16 = 536870912(0x20000000, float:1.0842022E-19)
            goto Lbd
        Lbb:
            r16 = r32
        Lbd:
            r1 = r1 | r16
            r6 = r87
            boolean r16 = r7.g(r6)
            if (r16 == 0) goto Lcc
            r16 = 4
        Lc9:
            r6 = r88
            goto Lcf
        Lcc:
            r16 = 2
            goto Lc9
        Lcf:
            boolean r34 = r7.g(r6)
            if (r34 == 0) goto Ld8
            r34 = 32
            goto Lda
        Ld8:
            r34 = 16
        Lda:
            r16 = r16 | r34
            r6 = r89
            boolean r34 = r7.g(r6)
            if (r34 == 0) goto Le7
            r34 = 256(0x100, float:3.59E-43)
            goto Le9
        Le7:
            r34 = r17
        Le9:
            r16 = r16 | r34
            r4 = r90
            boolean r35 = r7.e(r4)
            if (r35 == 0) goto Lf6
            r35 = r20
            goto Lf8
        Lf6:
            r35 = r19
        Lf8:
            r16 = r16 | r35
            r6 = r92
            boolean r35 = r7.f(r6)
            if (r35 == 0) goto L105
            r35 = r22
            goto L107
        L105:
            r35 = r21
        L107:
            r16 = r16 | r35
            r6 = r93
            boolean r35 = r7.g(r6)
            if (r35 == 0) goto L114
            r35 = 131072(0x20000, float:1.83671E-40)
            goto L116
        L114:
            r35 = r23
        L116:
            r16 = r16 | r35
            r6 = r94
            boolean r35 = r7.f(r6)
            if (r35 == 0) goto L123
            r35 = 1048576(0x100000, float:1.469368E-39)
            goto L125
        L123:
            r35 = r25
        L125:
            r16 = r16 | r35
            r6 = r95
            boolean r35 = r7.h(r6)
            if (r35 == 0) goto L132
            r35 = r28
            goto L134
        L132:
            r35 = r27
        L134:
            r16 = r16 | r35
            r6 = r96
            boolean r35 = r7.h(r6)
            if (r35 == 0) goto L141
            r35 = 67108864(0x4000000, float:1.5046328E-36)
            goto L143
        L141:
            r35 = r29
        L143:
            r16 = r16 | r35
            r6 = r97
            boolean r35 = r7.h(r6)
            if (r35 == 0) goto L150
            r35 = 536870912(0x20000000, float:1.0842022E-19)
            goto L152
        L150:
            r35 = r32
        L152:
            r6 = r16 | r35
            r35 = r6
            r6 = r98
            boolean r16 = r7.h(r6)
            if (r16 == 0) goto L161
            r16 = 4
            goto L163
        L161:
            r16 = 2
        L163:
            r36 = 905969664(0x36000000, float:1.9073486E-6)
            r16 = r36 | r16
            r6 = r99
            boolean r36 = r7.h(r6)
            if (r36 == 0) goto L172
            r36 = 32
            goto L174
        L172:
            r36 = 16
        L174:
            r16 = r16 | r36
            r6 = r100
            boolean r36 = r7.h(r6)
            if (r36 == 0) goto L181
            r36 = 256(0x100, float:3.59E-43)
            goto L183
        L181:
            r36 = r17
        L183:
            r16 = r16 | r36
            r6 = r101
            boolean r36 = r7.h(r6)
            if (r36 == 0) goto L18f
            r19 = r20
        L18f:
            r16 = r16 | r19
            r6 = r102
            boolean r19 = r7.h(r6)
            if (r19 == 0) goto L19c
            r19 = r22
            goto L19e
        L19c:
            r19 = r21
        L19e:
            r16 = r16 | r19
            r6 = r103
            boolean r19 = r7.h(r6)
            if (r19 == 0) goto L1ab
            r19 = 131072(0x20000, float:1.83671E-40)
            goto L1ad
        L1ab:
            r19 = r23
        L1ad:
            r16 = r16 | r19
            r6 = r104
            boolean r19 = r7.h(r6)
            if (r19 == 0) goto L1ba
            r19 = 1048576(0x100000, float:1.469368E-39)
            goto L1bc
        L1ba:
            r19 = r25
        L1bc:
            r16 = r16 | r19
            r6 = r105
            boolean r19 = r7.h(r6)
            if (r19 == 0) goto L1c9
            r19 = r28
            goto L1cb
        L1c9:
            r19 = r27
        L1cb:
            r16 = r16 | r19
            r6 = r109
            boolean r19 = r7.h(r6)
            if (r19 == 0) goto L1d8
            r19 = 32
            goto L1da
        L1d8:
            r19 = 16
        L1da:
            r20 = 3078(0xc06, float:4.313E-42)
            r19 = r20 | r19
            boolean r20 = r7.h(r8)
            if (r20 == 0) goto L1e7
            r20 = 256(0x100, float:3.59E-43)
            goto L1e9
        L1e7:
            r20 = r17
        L1e9:
            r19 = r19 | r20
            boolean r20 = r7.h(r9)
            if (r20 == 0) goto L1f3
            r21 = r22
        L1f3:
            r19 = r19 | r21
            boolean r20 = r7.h(r10)
            if (r20 == 0) goto L1fd
            r23 = 131072(0x20000, float:1.83671E-40)
        L1fd:
            r19 = r19 | r23
            boolean r20 = r7.h(r11)
            if (r20 == 0) goto L207
            r25 = 1048576(0x100000, float:1.469368E-39)
        L207:
            r19 = r19 | r25
            r6 = r115
            boolean r20 = r7.h(r6)
            if (r20 == 0) goto L213
            r27 = r28
        L213:
            r19 = r19 | r27
            boolean r20 = r7.h(r14)
            if (r20 == 0) goto L21d
            r29 = 67108864(0x4000000, float:1.5046328E-36)
        L21d:
            r19 = r19 | r29
            r3 = r117
            boolean r21 = r7.h(r3)
            if (r21 == 0) goto L229
            r32 = 536870912(0x20000000, float:1.0842022E-19)
        L229:
            r19 = r19 | r32
            boolean r21 = r7.h(r12)
            if (r21 == 0) goto L234
            r21 = 4
            goto L236
        L234:
            r21 = 2
        L236:
            r22 = 3072(0xc00, float:4.305E-42)
            r21 = r22 | r21
            boolean r22 = r7.h(r13)
            if (r22 == 0) goto L243
            r18 = 32
            goto L245
        L243:
            r18 = 16
        L245:
            r18 = r21 | r18
            r6 = r120
            boolean r21 = r7.h(r6)
            if (r21 == 0) goto L251
            r17 = 256(0x100, float:3.59E-43)
        L251:
            r6 = r18 | r17
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r15 = r1 & r17
            r0 = 306783378(0x12492492, float:6.3469493E-28)
            if (r15 != r0) goto L272
            r15 = r35 & r17
            if (r15 != r0) goto L272
            r15 = r16 & r17
            if (r15 != r0) goto L272
            r15 = r19 & r17
            if (r15 != r0) goto L272
            r0 = r6 & 1171(0x493, float:1.641E-42)
            r15 = 1170(0x492, float:1.64E-42)
            if (r0 == r15) goto L270
            goto L272
        L270:
            r0 = 0
            goto L273
        L272:
            r0 = 1
        L273:
            r15 = r1 & 1
            boolean r0 = r7.S(r15, r0)
            if (r0 == 0) goto La9d
            i0.m2 r0 = y1.i0.f21966b
            java.lang.Object r0 = r7.j(r0)
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r15 = r7.P()
            r42 = r6
            i0.e r6 = i0.l.f5952a
            if (r15 != r6) goto L294
            qg.t r15 = i0.r.n(r7)
            r7.k0(r15)
        L294:
            r43 = r15
            qg.t r43 = (qg.t) r43
            r.z r15 = r.b0.a(r7)
            sh.x r44 = sh.s.i(r7)
            java.util.WeakHashMap r16 = p.s1.f9986v
            p.s1 r8 = p.c.e(r7)
            p.b r8 = r8.f9989c
            i0.j1 r8 = r8.f9865d
            java.lang.Object r8 = r8.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r9 = r8.booleanValue()
            r16 = r1
            java.lang.Object r1 = r7.P()
            r46 = 0
            if (r1 != r6) goto L2c5
            i0.j1 r1 = i0.r.u(r46)
            r7.k0(r1)
        L2c5:
            i0.a1 r1 = (i0.a1) r1
            java.lang.Object r3 = r7.P()
            if (r3 != r6) goto L2d4
            i0.j1 r3 = i0.r.u(r46)
            r7.k0(r3)
        L2d4:
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r4 = r7.P()
            if (r4 != r6) goto L2e5
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            i0.j1 r4 = i0.r.u(r4)
            r7.k0(r4)
        L2e5:
            r47 = r4
            i0.a1 r47 = (i0.a1) r47
            java.lang.Object r4 = r7.P()
            if (r4 != r6) goto L2f8
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            i0.j1 r4 = i0.r.u(r4)
            r7.k0(r4)
        L2f8:
            r5 = r4
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r4 = r7.P()
            if (r4 != r6) goto L30d
            r4 = -1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            i0.j1 r4 = i0.r.u(r4)
            r7.k0(r4)
        L30d:
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r17 = r1.getValue()
            r48 = r4
            r4 = r17
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L344
            java.util.Iterator r17 = r2.iterator()
        L31f:
            boolean r21 = r17.hasNext()
            if (r21 == 0) goto L33b
            java.lang.Object r21 = r17.next()
            r49 = r5
            r5 = r21
            fb.c r5 = (fb.c) r5
            java.lang.String r5 = r5.f3433c
            boolean r5 = gg.l.a(r5, r4)
            if (r5 == 0) goto L338
            goto L33f
        L338:
            r5 = r49
            goto L31f
        L33b:
            r49 = r5
            r21 = r46
        L33f:
            fb.c r21 = (fb.c) r21
            r4 = r21
            goto L348
        L344:
            r49 = r5
            r4 = r46
        L348:
            java.lang.Object r5 = r3.getValue()
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L379
            java.util.Iterator r17 = r2.iterator()
        L354:
            boolean r21 = r17.hasNext()
            if (r21 == 0) goto L370
            java.lang.Object r21 = r17.next()
            r50 = r8
            r8 = r21
            fb.c r8 = (fb.c) r8
            java.lang.String r8 = r8.f3433c
            boolean r8 = gg.l.a(r8, r5)
            if (r8 == 0) goto L36d
            goto L374
        L36d:
            r8 = r50
            goto L354
        L370:
            r50 = r8
            r21 = r46
        L374:
            fb.c r21 = (fb.c) r21
            r5 = r21
            goto L37d
        L379:
            r50 = r8
            r5 = r46
        L37d:
            r8 = r16 & 112(0x70, float:1.57E-43)
            r51 = r9
            r9 = 32
            if (r8 == r9) goto L388
            r16 = 0
            goto L38a
        L388:
            r16 = 1
        L38a:
            java.lang.Object r9 = r7.P()
            r52 = r5
            java.lang.String r5 = "streaming"
            if (r16 != 0) goto L39f
            if (r9 != r6) goto L397
            goto L39f
        L397:
            r53 = r3
            r21 = r5
            r38 = r15
            goto L609
        L39f:
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.util.Iterator r16 = r2.iterator()
            r17 = 0
        L3aa:
            boolean r21 = r16.hasNext()
            r53 = r3
            java.lang.String r3 = "tool"
            if (r21 == 0) goto L3e4
            java.lang.Object r21 = r16.next()
            int r22 = r17 + 1
            if (r17 < 0) goto L3e0
            r13 = r21
            fb.c r13 = (fb.c) r13
            java.lang.String r12 = r13.f3431a
            java.lang.String r13 = r13.f3434d
            boolean r3 = gg.l.a(r12, r3)
            if (r3 == 0) goto L3d7
            boolean r3 = og.m.t0(r13)
            if (r3 != 0) goto L3d7
            java.lang.Integer r3 = java.lang.Integer.valueOf(r17)
            r9.putIfAbsent(r13, r3)
        L3d7:
            r12 = r118
            r13 = r119
            r17 = r22
            r3 = r53
            goto L3aa
        L3e0:
            a.a.Q0()
            throw r46
        L3e4:
            dg.n r12 = new dg.n
            r13 = 6
            r12.<init>(r2, r13)
            wb.sr r13 = new wb.sr
            r38 = r15
            r15 = 12
            r13.<init>(r15)
            ng.i r15 = new ng.i
            r10 = 1
            r15.<init>(r12, r10, r13)
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            ng.h r12 = new ng.h
            r12.<init>(r15)
        L403:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L431
            java.lang.Object r13 = r12.next()
            r15 = r13
            fb.c r15 = (fb.c) r15
            java.lang.String r15 = r15.f3434d
            java.lang.Object r16 = r10.get(r15)
            if (r16 != 0) goto L425
            r17 = r12
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r10.put(r15, r12)
            r16 = r12
            goto L427
        L425:
            r17 = r12
        L427:
            r12 = r16
            java.util.List r12 = (java.util.List) r12
            r12.add(r13)
            r12 = r17
            goto L403
        L431:
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            int r13 = r10.size()
            int r13 = tf.y.a0(r13)
            r12.<init>(r13)
            java.util.Set r10 = r10.entrySet()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L448:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L4ba
            java.lang.Object r13 = r10.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r15 = r13.getKey()
            java.lang.Object r13 = r13.getValue()
            java.util.List r13 = (java.util.List) r13
            r16 = r10
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r13 = r13.iterator()
        L469:
            boolean r17 = r13.hasNext()
            if (r17 == 0) goto L481
            java.lang.Object r17 = r13.next()
            r21 = r13
            r13 = r17
            fb.c r13 = (fb.c) r13
            java.util.List r13 = r13.f3440j
            tf.r.h1(r10, r13)
            r13 = r21
            goto L469
        L481:
            java.util.HashSet r13 = new java.util.HashSet
            r13.<init>()
            r17 = r10
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r17 = r17.iterator()
        L491:
            boolean r21 = r17.hasNext()
            if (r21 == 0) goto L4b0
            java.lang.Object r14 = r17.next()
            r21 = r5
            r5 = r14
            fb.q1 r5 = (fb.q1) r5
            java.lang.String r5 = r5.f3721a
            boolean r5 = r13.add(r5)
            if (r5 == 0) goto L4ab
            r10.add(r14)
        L4ab:
            r14 = r116
            r5 = r21
            goto L491
        L4b0:
            r21 = r5
            r12.put(r15, r10)
            r14 = r116
            r10 = r16
            goto L448
        L4ba:
            r21 = r5
            uf.c r5 = a.a.E()
            java.util.Iterator r10 = r2.iterator()
            r13 = 0
        L4c5:
            boolean r14 = r10.hasNext()
            if (r14 == 0) goto L602
            java.lang.Object r14 = r10.next()
            int r15 = r13 + 1
            if (r13 < 0) goto L5fe
            fb.c r14 = (fb.c) r14
            r16 = r10
            java.lang.String r10 = r14.f3431a
            r17 = r15
            java.lang.String r15 = r14.f3434d
            boolean r10 = gg.l.a(r10, r3)
            if (r10 == 0) goto L4e9
            boolean r10 = og.m.t0(r15)
            if (r10 == 0) goto L4ef
        L4e9:
            r22 = r3
            r23 = r9
            goto L5ea
        L4ef:
            java.lang.Object r10 = r9.get(r15)
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 != 0) goto L4f8
            goto L4fe
        L4f8:
            int r10 = r10.intValue()
            if (r10 == r13) goto L504
        L4fe:
            r22 = r3
            r23 = r9
            goto L5f2
        L504:
            java.lang.Object r10 = r12.get(r15)
            java.util.List r10 = (java.util.List) r10
            if (r10 != 0) goto L50e
            tf.t r10 = tf.t.f13167g
        L50e:
            r63 = r10
            boolean r10 = r63.isEmpty()
            if (r10 == 0) goto L51c
        L516:
            r22 = r3
            r23 = r9
            r3 = 0
            goto L54b
        L51c:
            java.util.Iterator r10 = r63.iterator()
        L520:
            boolean r15 = r10.hasNext()
            if (r15 == 0) goto L516
            java.lang.Object r15 = r10.next()
            fb.q1 r15 = (fb.q1) r15
            r22 = r3
            java.lang.String r3 = r15.f3727g
            r23 = r9
            java.lang.String r9 = "queued"
            boolean r3 = r3.equals(r9)
            if (r3 != 0) goto L54a
            java.lang.String r3 = r15.f3727g
            java.lang.String r9 = "running"
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto L545
            goto L54a
        L545:
            r3 = r22
            r9 = r23
            goto L520
        L54a:
            r3 = 1
        L54b:
            boolean r9 = r63.isEmpty()
            java.lang.String r10 = "interrupted"
            if (r9 == 0) goto L555
        L553:
            r9 = 0
            goto L56e
        L555:
            java.util.Iterator r9 = r63.iterator()
        L559:
            boolean r15 = r9.hasNext()
            if (r15 == 0) goto L553
            java.lang.Object r15 = r9.next()
            fb.q1 r15 = (fb.q1) r15
            java.lang.String r15 = r15.f3727g
            boolean r15 = r15.equals(r10)
            if (r15 == 0) goto L559
            r9 = 1
        L56e:
            if (r3 == 0) goto L573
            r64 = r21
            goto L57b
        L573:
            if (r9 == 0) goto L578
        L575:
            r64 = r10
            goto L57b
        L578:
            java.lang.String r10 = "complete"
            goto L575
        L57b:
            java.util.Iterator r3 = r63.iterator()
            boolean r9 = r3.hasNext()
            if (r9 != 0) goto L588
            r9 = r46
            goto L5b6
        L588:
            java.lang.Object r9 = r3.next()
            fb.q1 r9 = (fb.q1) r9
            long r9 = r9.f3729i
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
        L594:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L5b6
            java.lang.Object r10 = r3.next()
            fb.q1 r10 = (fb.q1) r10
            r15 = r3
            long r2 = r10.f3729i
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            int r3 = r9.compareTo(r2)
            if (r3 >= 0) goto L5b2
            r9 = r2
            r3 = r15
            r2 = r78
            goto L594
        L5b2:
            r2 = r78
            r3 = r15
            goto L594
        L5b6:
            if (r9 == 0) goto L5bf
            long r2 = r9.longValue()
        L5bc:
            r68 = r2
            goto L5c2
        L5bf:
            long r2 = r14.f3448r
            goto L5bc
        L5c2:
            r70 = 122367(0x1ddff, float:1.71473E-40)
            r55 = 0
            r56 = 0
            r57 = 0
            r58 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r65 = 0
            r66 = 0
            r67 = 0
            r54 = r14
            fb.c r2 = fb.c.a(r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r70)
            wb.ut r3 = new wb.ut
            r3.<init>(r13, r2)
            r5.add(r3)
            goto L5f2
        L5ea:
            wb.ut r2 = new wb.ut
            r2.<init>(r13, r14)
            r5.add(r2)
        L5f2:
            r2 = r78
            r10 = r16
            r13 = r17
            r3 = r22
            r9 = r23
            goto L4c5
        L5fe:
            a.a.Q0()
            throw r46
        L602:
            uf.c r9 = a.a.t(r5)
            r7.k0(r9)
        L609:
            r3 = r9
            java.util.List r3 = (java.util.List) r3
            boolean r2 = r7.h(r0)
            java.lang.Object r5 = r7.P()
            if (r2 != 0) goto L618
            if (r5 != r6) goto L621
        L618:
            fb.f1 r5 = new fb.f1
            r2 = 4
            r5.<init>(r0, r2)
            r7.k0(r5)
        L621:
            fg.l r5 = (fg.l) r5
            i0.r.c(r0, r5, r7)
            if (r4 == 0) goto L824
            java.lang.String r2 = r4.f3431a
            r5 = -1177662672(0xffffffffb9ce4b30, float:-3.93474E-4)
            r7.a0(r5)
            java.lang.Object r5 = r7.P()
            if (r5 != r6) goto L640
            wb.jp r5 = new wb.jp
            r10 = 26
            r5.<init>(r1, r10)
            r7.k0(r5)
        L640:
            r17 = r5
            fg.a r17 = (fg.a) r17
            boolean r5 = r7.h(r0)
            boolean r10 = r7.h(r4)
            r5 = r5 | r10
            java.lang.Object r10 = r7.P()
            if (r5 != 0) goto L655
            if (r10 != r6) goto L65e
        L655:
            wb.xs r10 = new wb.xs
            r5 = 0
            r10.<init>(r0, r4, r1, r5)
            r7.k0(r10)
        L65e:
            fg.a r10 = (fg.a) r10
            boolean r5 = r7.h(r0)
            boolean r12 = r7.h(r4)
            r5 = r5 | r12
            java.lang.Object r12 = r7.P()
            if (r5 != 0) goto L671
            if (r12 != r6) goto L67a
        L671:
            wb.xs r12 = new wb.xs
            r5 = 1
            r12.<init>(r0, r4, r1, r5)
            r7.k0(r12)
        L67a:
            fg.a r12 = (fg.a) r12
            r0 = 32
            if (r8 == r0) goto L682
            r0 = 0
            goto L683
        L682:
            r0 = 1
        L683:
            r5 = 3670016(0x380000, float:5.142788E-39)
            r5 = r19 & r5
            r13 = 1048576(0x100000, float:1.469368E-39)
            if (r5 != r13) goto L68d
            r5 = 1
            goto L68e
        L68d:
            r5 = 0
        L68e:
            r0 = r0 | r5
            java.lang.Object r5 = r7.P()
            if (r0 != 0) goto L69b
            if (r5 != r6) goto L698
            goto L69b
        L698:
            r0 = r78
            goto L6a6
        L69b:
            wb.ys r5 = new wb.ys
            r0 = r78
            r13 = 0
            r5.<init>(r11, r1, r0, r13)
            r7.k0(r5)
        L6a6:
            fg.a r5 = (fg.a) r5
            java.lang.String r13 = "assistant"
            boolean r13 = gg.l.a(r2, r13)
            if (r13 == 0) goto L6f3
            java.lang.String r13 = r4.f3444n
            r14 = r21
            boolean r13 = gg.l.a(r13, r14)
            if (r13 != 0) goto L6f3
            r13 = -1176740701(0xffffffffb9dc5ca3, float:-4.203069E-4)
            r7.a0(r13)
            r13 = 32
            if (r8 == r13) goto L6c6
            r13 = 0
            goto L6c7
        L6c6:
            r13 = 1
        L6c7:
            r14 = 234881024(0xe000000, float:1.5777218E-30)
            r14 = r19 & r14
            r15 = 67108864(0x4000000, float:1.5046328E-36)
            if (r14 != r15) goto L6d1
            r14 = 1
            goto L6d2
        L6d1:
            r14 = 0
        L6d2:
            r13 = r13 | r14
            java.lang.Object r14 = r7.P()
            if (r13 != 0) goto L6df
            if (r14 != r6) goto L6dc
            goto L6df
        L6dc:
            r13 = r116
            goto L6ea
        L6df:
            wb.ys r14 = new wb.ys
            r13 = r116
            r15 = 1
            r14.<init>(r13, r1, r0, r15)
            r7.k0(r14)
        L6ea:
            fg.a r14 = (fg.a) r14
            r15 = 0
            r7.p(r15)
            r21 = r14
            goto L701
        L6f3:
            r13 = r116
            r15 = 0
            r14 = -1176563536(0xffffffffb9df10b0, float:-4.2546308E-4)
            r7.a0(r14)
            r7.p(r15)
            r21 = r46
        L701:
            java.lang.String r14 = "user"
            boolean r2 = gg.l.a(r2, r14)
            if (r2 == 0) goto L742
            r2 = -1176458105(0xffffffffb9e0ac87, float:-4.2853152E-4)
            r7.a0(r2)
            r2 = 32
            if (r8 == r2) goto L715
            r2 = 0
            goto L716
        L715:
            r2 = 1
        L716:
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r19 & r14
            r15 = 131072(0x20000, float:1.83671E-40)
            if (r14 != r15) goto L720
            r14 = 1
            goto L721
        L720:
            r14 = 0
        L721:
            r2 = r2 | r14
            java.lang.Object r14 = r7.P()
            if (r2 != 0) goto L72e
            if (r14 != r6) goto L72b
            goto L72e
        L72b:
            r2 = r113
            goto L739
        L72e:
            wb.ys r14 = new wb.ys
            r2 = r113
            r15 = 2
            r14.<init>(r2, r1, r0, r15)
            r7.k0(r14)
        L739:
            fg.a r14 = (fg.a) r14
            r15 = 0
            r7.p(r15)
            r22 = r14
            goto L750
        L742:
            r2 = r113
            r15 = 0
            r14 = -1176284784(0xffffffffb9e35190, float:-4.3357583E-4)
            r7.a0(r14)
            r7.p(r15)
            r22 = r46
        L750:
            boolean r14 = r7.h(r3)
            r15 = r38
            boolean r16 = r7.f(r15)
            r14 = r14 | r16
            r16 = 1879048192(0x70000000, float:1.5845633E29)
            r9 = r19 & r16
            r40 = r1
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            if (r9 != r1) goto L768
            r1 = 1
            goto L769
        L768:
            r1 = 0
        L769:
            r1 = r1 | r14
            java.lang.Object r9 = r7.P()
            if (r1 != 0) goto L778
            if (r9 != r6) goto L773
            goto L778
        L773:
            r1 = r3
            r3 = r15
            r14 = r40
            goto L790
        L778:
            c9.n0 r36 = new c9.n0
            r41 = 25
            r39 = r117
            r37 = r3
            r38 = r15
            r36.<init>(r37, r38, r39, r40, r41)
            r9 = r36
            r1 = r37
            r3 = r38
            r14 = r40
            r7.k0(r9)
        L790:
            r23 = r9
            fg.a r23 = (fg.a) r23
            r9 = 32
            if (r8 == r9) goto L79a
            r9 = 0
            goto L79b
        L79a:
            r9 = 1
        L79b:
            r15 = r42 & 14
            r2 = 4
            if (r15 != r2) goto L7a2
            r2 = 1
            goto L7a3
        L7a2:
            r2 = 0
        L7a3:
            r2 = r2 | r9
            java.lang.Object r9 = r7.P()
            if (r2 != 0) goto L7b1
            if (r9 != r6) goto L7ad
            goto L7b1
        L7ad:
            r2 = r118
            r15 = 3
            goto L7bc
        L7b1:
            wb.ys r9 = new wb.ys
            r2 = r118
            r15 = 3
            r9.<init>(r2, r14, r0, r15)
            r7.k0(r9)
        L7bc:
            r24 = r9
            fg.a r24 = (fg.a) r24
            r9 = 32
            if (r8 == r9) goto L7c7
            r16 = 0
            goto L7c9
        L7c7:
            r16 = 1
        L7c9:
            r15 = r42 & 112(0x70, float:1.57E-43)
            if (r15 != r9) goto L7cf
            r15 = 1
            goto L7d0
        L7cf:
            r15 = 0
        L7d0:
            r15 = r16 | r15
            java.lang.Object r9 = r7.P()
            if (r15 != 0) goto L7de
            if (r9 != r6) goto L7db
            goto L7de
        L7db:
            r15 = r119
            goto L7e9
        L7de:
            wb.ys r9 = new wb.ys
            r15 = r119
            r2 = 4
            r9.<init>(r15, r14, r0, r2)
            r7.k0(r9)
        L7e9:
            r25 = r9
            fg.a r25 = (fg.a) r25
            java.lang.Object r2 = r7.P()
            if (r2 != r6) goto L800
            wb.pk r2 = new wb.pk
            r9 = 9
            r0 = r53
            r2.<init>(r9, r14, r0)
            r7.k0(r2)
            goto L802
        L800:
            r0 = r53
        L802:
            r26 = r2
            fg.a r26 = (fg.a) r26
            r28 = 48
            r29 = 54
            r9 = 32
            r31 = 3
            r15 = r76
            r16 = r4
            r20 = r5
            r27 = r7
            r18 = r10
            r19 = r12
            r15.d0(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r10 = r27
            r15 = 0
            r10.p(r15)
            goto L83b
        L824:
            r13 = r116
            r14 = r1
            r1 = r3
            r10 = r7
            r3 = r38
            r0 = r53
            r9 = 32
            r15 = 0
            r31 = 3
            r2 = -1175383180(0xffffffffb9f11374, float:-4.5981596E-4)
            r10.a0(r2)
            r10.p(r15)
        L83b:
            if (r52 == 0) goto L863
            r2 = -1175348925(0xffffffffb9f19943, float:-4.608129E-4)
            r10.a0(r2)
            java.lang.Object r2 = r10.P()
            if (r2 != r6) goto L853
            wb.jp r2 = new wb.jp
            r4 = 25
            r2.<init>(r0, r4)
            r10.k0(r2)
        L853:
            fg.a r2 = (fg.a) r2
            r0 = 432(0x1b0, float:6.05E-43)
            r12 = r76
            r4 = r52
            r12.c0(r4, r2, r10, r0)
            r15 = 0
            r10.p(r15)
            goto L86f
        L863:
            r15 = 0
            r12 = r76
            r0 = -1175209580(0xffffffffb9f3b994, float:-4.6486838E-4)
            r10.a0(r0)
            r10.p(r15)
        L86f:
            int r0 = r1.size()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            boolean r0 = r10.h(r1)
            if (r8 == r9) goto L87f
            r2 = r15
            goto L880
        L87f:
            r2 = 1
        L880:
            r0 = r0 | r2
            boolean r2 = r10.f(r3)
            r0 = r0 | r2
            java.lang.Object r2 = r10.P()
            if (r0 != 0) goto L896
            if (r2 != r6) goto L88f
            goto L896
        L88f:
            r71 = r6
            r15 = r35
            r5 = r49
            goto L8ab
        L896:
            wb.jt r0 = new wb.jt
            r2 = r6
            r6 = 0
            r71 = r2
            r15 = r35
            r4 = r48
            r5 = r49
            r2 = r78
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r10.k0(r0)
            r2 = r0
        L8ab:
            fg.p r2 = (fg.p) r2
            i0.r.f(r2, r10, r7)
            java.lang.Object r0 = tf.m.C1(r78)
            fb.c r0 = (fb.c) r0
            if (r0 == 0) goto L8bb
            java.lang.String r0 = r0.f3432b
            goto L8bd
        L8bb:
            r0 = r46
        L8bd:
            java.lang.Object r2 = tf.m.C1(r78)
            fb.c r2 = (fb.c) r2
            if (r2 == 0) goto L8c8
            java.lang.String r2 = r2.f3438h
            goto L8ca
        L8c8:
            r2 = r46
        L8ca:
            java.lang.Object r4 = tf.m.C1(r78)
            fb.c r4 = (fb.c) r4
            if (r4 == 0) goto L8df
            java.util.List r4 = r4.f3440j
            if (r4 == 0) goto L8df
            int r4 = r4.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L8e1
        L8df:
            r4 = r46
        L8e1:
            java.lang.Object r6 = tf.m.C1(r78)
            fb.c r6 = (fb.c) r6
            if (r6 == 0) goto L8ec
            java.lang.String r6 = r6.f3437g
            goto L8ee
        L8ec:
            r6 = r46
        L8ee:
            java.lang.Object[] r7 = new java.lang.Object[]{r0, r2, r4, r6}
            if (r8 == r9) goto L8f6
            r0 = 0
            goto L8f7
        L8f6:
            r0 = 1
        L8f7:
            boolean r2 = r10.f(r3)
            r0 = r0 | r2
            boolean r2 = r10.h(r1)
            r0 = r0 | r2
            java.lang.Object r2 = r10.P()
            if (r0 != 0) goto L910
            r0 = r71
            if (r2 != r0) goto L90d
            r2 = r0
            goto L912
        L90d:
            r72 = r0
            goto L92b
        L910:
            r2 = r71
        L912:
            ci.e r0 = new ci.e
            r49 = r5
            r5 = 0
            r6 = 10
            r72 = r2
            r2 = r3
            r4 = r49
            r3 = r1
            r1 = r78
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r1 = r3
            r5 = r4
            r3 = r2
            r10.k0(r0)
            r2 = r0
        L92b:
            fg.p r2 = (fg.p) r2
            i0.r.i(r7, r2, r10)
            boolean r0 = r78.isEmpty()
            r32 = 1
            r0 = r0 ^ 1
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r10.f(r3)
            if (r8 == r9) goto L944
            r2 = 0
            goto L946
        L944:
            r2 = r32
        L946:
            r0 = r0 | r2
            java.lang.Object r2 = r10.P()
            if (r0 != 0) goto L95a
            r0 = r72
            if (r2 != r0) goto L953
            r2 = r0
            goto L95c
        L953:
            r74 = r0
            r73 = r1
            r18 = r47
            goto L979
        L95a:
            r2 = r72
        L95c:
            ci.e r0 = new ci.e
            r49 = r5
            r5 = 0
            r6 = 11
            r73 = r1
            r74 = r2
            r1 = r3
            r4 = r47
            r3 = r49
            r2 = r78
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r5 = r3
            r18 = r4
            r3 = r1
            r10.k0(r0)
            r2 = r0
        L979:
            fg.p r2 = (fg.p) r2
            i0.r.g(r3, r7, r2, r10)
            r1 = r51
            boolean r0 = r10.g(r1)
            if (r8 == r9) goto L988
            r2 = 0
            goto L98a
        L988:
            r2 = r32
        L98a:
            r0 = r0 | r2
            boolean r2 = r10.f(r3)
            r0 = r0 | r2
            r4 = r73
            boolean r2 = r10.h(r4)
            r0 = r0 | r2
            java.lang.Object r2 = r10.P()
            r7 = r74
            if (r0 != 0) goto L9a4
            if (r2 != r7) goto L9a2
            goto L9a4
        L9a2:
            r1 = r4
            goto L9b1
        L9a4:
            wb.kt r0 = new wb.kt
            r6 = 0
            r2 = r78
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r1 = r4
            r10.k0(r0)
            r2 = r0
        L9b1:
            fg.p r2 = (fg.p) r2
            r0 = r50
            i0.r.f(r2, r10, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r89)
            r2 = r15 & 896(0x380, float:1.256E-42)
            r4 = 256(0x100, float:3.59E-43)
            if (r2 != r4) goto L9c5
            r2 = r32
            goto L9c6
        L9c5:
            r2 = 0
        L9c6:
            r4 = r15 & 112(0x70, float:1.57E-43)
            if (r4 != r9) goto L9cd
            r4 = r32
            goto L9ce
        L9cd:
            r4 = 0
        L9ce:
            r2 = r2 | r4
            if (r8 == r9) goto L9d3
            r8 = 0
            goto L9d5
        L9d3:
            r8 = r32
        L9d5:
            r2 = r2 | r8
            boolean r4 = r10.f(r3)
            r2 = r2 | r4
            boolean r4 = r10.h(r1)
            r2 = r2 | r4
            java.lang.Object r4 = r10.P()
            if (r2 != 0) goto L9e8
            if (r4 != r7) goto L9ea
        L9e8:
            r2 = r0
            goto L9ec
        L9ea:
            r8 = r0
            goto La03
        L9ec:
            wb.lt r0 = new wb.lt
            r7 = 0
            r8 = r2
            r4 = r3
            r6 = r5
            r3 = r78
            r2 = r88
            r5 = r1
            r1 = r89
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r3 = r4
            r1 = r5
            r5 = r6
            r10.k0(r0)
            r4 = r0
        La03:
            fg.p r4 = (fg.p) r4
            i0.r.f(r4, r10, r8)
            boolean r0 = og.m.t0(r77)
            if (r0 == 0) goto La13
            java.lang.String r0 = "插件 Agent"
            r45 = r0
            goto La15
        La13:
            r45 = r77
        La15:
            c9.h0 r0 = new c9.h0
            r2 = 29
            r8 = r110
            r4 = r111
            r9 = r112
            r0.<init>(r8, r4, r9, r2)
            r2 = -2077195984(0xffffffff84308130, float:-2.074802E-36)
            s0.d r46 = s0.i.e(r2, r0, r10)
            wb.vs r0 = new wb.vs
            r20 = r79
            r21 = r80
            r22 = r81
            r23 = r82
            r24 = r83
            r25 = r84
            r26 = r85
            r11 = r86
            r27 = r87
            r12 = r88
            r15 = r89
            r8 = r90
            r10 = r92
            r7 = r93
            r28 = r95
            r29 = r96
            r30 = r97
            r32 = r99
            r33 = r100
            r34 = r101
            r35 = r102
            r36 = r103
            r37 = r104
            r38 = r105
            r39 = r106
            r40 = r107
            r41 = r108
            r2 = r109
            r6 = r1
            r4 = r3
            r19 = r5
            r17 = r14
            r16 = r43
            r3 = r44
            r5 = r78
            r1 = r94
            r14 = r13
            r43 = r31
            r31 = r98
            r13 = r115
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r2 = r3
            r1 = -1190692237(0xffffffffb9077a73, float:-1.2920219E-4)
            r7 = r121
            s0.d r6 = s0.i.e(r1, r0, r7)
            int r0 = r42 << 3
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r1 = 1597488(0x186030, float:2.238557E-39)
            r8 = r0 | r1
            r9 = 32
            java.lang.String r1 = ""
            r5 = 0
            r3 = r120
            r0 = r45
            r4 = r46
            wb.ho.B2(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto Laa0
        La9d:
            r121.V()
        Laa0:
            i0.r1 r0 = r121.t()
            if (r0 == 0) goto Lb0c
            r1 = r0
            wb.ws r0 = new wb.ws
            r2 = r77
            r3 = r78
            r4 = r79
            r5 = r80
            r6 = r81
            r7 = r82
            r8 = r83
            r9 = r84
            r10 = r85
            r11 = r86
            r12 = r87
            r13 = r88
            r14 = r89
            r15 = r90
            r17 = r92
            r18 = r93
            r19 = r94
            r20 = r95
            r21 = r96
            r22 = r97
            r23 = r98
            r24 = r99
            r25 = r100
            r26 = r101
            r27 = r102
            r28 = r103
            r29 = r104
            r30 = r105
            r31 = r106
            r32 = r107
            r33 = r108
            r34 = r109
            r35 = r110
            r36 = r111
            r37 = r112
            r38 = r113
            r39 = r114
            r40 = r115
            r41 = r116
            r42 = r117
            r43 = r118
            r44 = r119
            r45 = r120
            r46 = r122
            r75 = r1
            r1 = r76
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            r1 = r75
            r1.f6035d = r0
        Lb0c:
            return
    }

    public void R(java.lang.String r63, java.util.List r64, fb.a1 r65, java.util.List r66, boolean r67, java.lang.String r68, java.lang.String r69, boolean r70, boolean r71, fg.l r72, fg.a r73, fg.a r74, fg.a r75, fg.a r76, fg.l r77, fg.a r78, fg.l r79, fg.l r80, fg.l r81, fg.l r82, fg.a r83, fg.a r84, fg.a r85, i0.h0 r86, int r87) {
            r62 = this;
            r0 = r63
            r2 = r65
            r9 = r70
            r10 = r71
            r11 = r73
            r12 = r74
            r13 = r76
            r14 = r77
            r4 = r86
            r1 = -369056577(0xffffffffea00a4bf, float:-3.8880124E25)
            r4.b0(r1)
            boolean r1 = r4.f(r0)
            if (r1 == 0) goto L20
            r1 = 4
            goto L21
        L20:
            r1 = 2
        L21:
            r1 = r87 | r1
            r5 = r64
            boolean r6 = r4.f(r5)
            if (r6 == 0) goto L2e
            r6 = 32
            goto L30
        L2e:
            r6 = 16
        L30:
            r1 = r1 | r6
            boolean r6 = r4.f(r2)
            r16 = 128(0x80, float:1.8E-43)
            r17 = 256(0x100, float:3.59E-43)
            if (r6 == 0) goto L3e
            r6 = r17
            goto L40
        L3e:
            r6 = r16
        L40:
            r1 = r1 | r6
            r6 = r66
            boolean r18 = r4.f(r6)
            r19 = 1024(0x400, float:1.435E-42)
            r20 = 2048(0x800, float:2.87E-42)
            if (r18 == 0) goto L50
            r18 = r20
            goto L52
        L50:
            r18 = r19
        L52:
            r1 = r1 | r18
            r15 = r67
            boolean r21 = r4.g(r15)
            r22 = 8192(0x2000, float:1.148E-41)
            if (r21 == 0) goto L61
            r21 = 16384(0x4000, float:2.2959E-41)
            goto L63
        L61:
            r21 = r22
        L63:
            r1 = r1 | r21
            r3 = r68
            boolean r24 = r4.f(r3)
            r25 = 65536(0x10000, float:9.1835E-41)
            r26 = 131072(0x20000, float:1.83671E-40)
            if (r24 == 0) goto L74
            r24 = r26
            goto L76
        L74:
            r24 = r25
        L76:
            r1 = r1 | r24
            r3 = r69
            boolean r24 = r4.f(r3)
            r27 = 524288(0x80000, float:7.34684E-40)
            r28 = 1048576(0x100000, float:1.469368E-39)
            if (r24 == 0) goto L87
            r24 = r28
            goto L89
        L87:
            r24 = r27
        L89:
            r1 = r1 | r24
            boolean r24 = r4.g(r9)
            r29 = 4194304(0x400000, float:5.877472E-39)
            r30 = 8388608(0x800000, float:1.1754944E-38)
            if (r24 == 0) goto L98
            r24 = r30
            goto L9a
        L98:
            r24 = r29
        L9a:
            r1 = r1 | r24
            boolean r24 = r4.g(r10)
            r31 = 33554432(0x2000000, float:9.403955E-38)
            if (r24 == 0) goto La7
            r24 = 67108864(0x4000000, float:1.5046328E-36)
            goto La9
        La7:
            r24 = r31
        La9:
            r1 = r1 | r24
            r9 = r72
            boolean r24 = r4.h(r9)
            r32 = 536870912(0x20000000, float:1.0842022E-19)
            if (r24 == 0) goto Lb8
            r24 = r32
            goto Lba
        Lb8:
            r24 = 268435456(0x10000000, float:2.524355E-29)
        Lba:
            r38 = r1 | r24
            boolean r1 = r4.h(r11)
            if (r1 == 0) goto Lc4
            r1 = 4
            goto Lc5
        Lc4:
            r1 = 2
        Lc5:
            boolean r24 = r4.h(r12)
            if (r24 == 0) goto Lce
            r24 = 32
            goto Ld0
        Lce:
            r24 = 16
        Ld0:
            r1 = r1 | r24
            r9 = r75
            boolean r24 = r4.h(r9)
            if (r24 == 0) goto Ldd
            r24 = r17
            goto Ldf
        Ldd:
            r24 = r16
        Ldf:
            r1 = r1 | r24
            boolean r24 = r4.h(r13)
            if (r24 == 0) goto Le9
            r19 = r20
        Le9:
            r1 = r1 | r19
            boolean r19 = r4.h(r14)
            if (r19 == 0) goto Lf3
            r22 = 16384(0x4000, float:2.2959E-41)
        Lf3:
            r1 = r1 | r22
            r7 = r78
            boolean r20 = r4.h(r7)
            if (r20 == 0) goto Lff
            r25 = r26
        Lff:
            r1 = r1 | r25
            r3 = r79
            boolean r20 = r4.h(r3)
            if (r20 == 0) goto L10b
            r27 = r28
        L10b:
            r1 = r1 | r27
            r3 = r80
            boolean r20 = r4.h(r3)
            if (r20 == 0) goto L117
            r29 = r30
        L117:
            r1 = r1 | r29
            r3 = r81
            boolean r20 = r4.h(r3)
            if (r20 == 0) goto L123
            r31 = 67108864(0x4000000, float:1.5046328E-36)
        L123:
            r1 = r1 | r31
            r3 = r82
            boolean r20 = r4.h(r3)
            if (r20 == 0) goto L12e
            goto L130
        L12e:
            r32 = 268435456(0x10000000, float:2.524355E-29)
        L130:
            r39 = r1 | r32
            r1 = r83
            boolean r20 = r4.h(r1)
            if (r20 == 0) goto L13d
            r20 = 4
            goto L13f
        L13d:
            r20 = 2
        L13f:
            r22 = 3072(0xc00, float:4.305E-42)
            r20 = r22 | r20
            r3 = r84
            boolean r22 = r4.h(r3)
            if (r22 == 0) goto L14e
            r19 = 32
            goto L150
        L14e:
            r19 = 16
        L150:
            r19 = r20 | r19
            r3 = r85
            boolean r20 = r4.h(r3)
            if (r20 == 0) goto L15c
            r16 = r17
        L15c:
            r3 = r19 | r16
            r16 = 306783379(0x12492493, float:6.34695E-28)
            r8 = r38 & r16
            r1 = 306783378(0x12492492, float:6.3469493E-28)
            if (r8 != r1) goto L17b
            r1 = 306783379(0x12492493, float:6.34695E-28)
            r1 = r39 & r1
            r8 = 306783378(0x12492492, float:6.3469493E-28)
            if (r1 != r8) goto L17b
            r1 = r3 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r1 == r8) goto L179
            goto L17b
        L179:
            r1 = 0
            goto L17c
        L17b:
            r1 = 1
        L17c:
            r8 = r38 & 1
            boolean r1 = r4.S(r8, r1)
            if (r1 == 0) goto L807
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto L194
            boolean r1 = r5.isEmpty()
            if (r1 != 0) goto L191
            goto L194
        L191:
            r40 = 0
            goto L196
        L194:
            r40 = 1
        L196:
            if (r70 == 0) goto L19d
            if (r40 == 0) goto L19d
            r41 = 1
            goto L19f
        L19d:
            r41 = 0
        L19f:
            i0.m2 r1 = bi.d.f892a
            java.lang.Object r8 = r4.j(r1)
            bi.b r8 = (bi.b) r8
            long r11 = r8.j()
            r42 = r11
            long r11 = f1.w.f3127c
            y0.l r8 = y0.l.f21818a
            r9 = 1065353216(0x3f800000, float:1.0)
            y0.o r10 = p.h1.d(r8, r9)
            java.lang.Object r16 = r4.j(r1)
            bi.b r16 = (bi.b) r16
            r19 = r10
            long r9 = r16.a()
            r16 = r1
            r1 = 1064682127(0x3f75c28f, float:0.96)
            long r9 = f1.w.b(r9, r1)
            f1.m0 r1 = f1.c0.f3038b
            r2 = r19
            y0.o r2 = k.n.g(r2, r9, r1)
            p.e r9 = p.j.f9926c
            y0.e r10 = y0.b.f21804s
            r19 = r1
            r1 = 0
            p.t r9 = p.s.a(r9, r10, r4, r1)
            long r5 = r4.T
            int r1 = java.lang.Long.hashCode(r5)
            s0.h r5 = r4.l()
            y0.o r2 = y0.a.c(r4, r2)
            x1.f r6 = x1.g.f20914f
            r6.getClass()
            x1.y r10 = x1.f.f20883b
            r4.d0()
            boolean r6 = r4.S
            if (r6 == 0) goto L1ff
            r4.k(r10)
            goto L202
        L1ff:
            r4.n0()
        L202:
            x1.e r6 = x1.f.f20886e
            i0.r.A(r6, r4, r9)
            x1.e r9 = x1.f.f20885d
            i0.r.A(r9, r4, r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            x1.e r5 = x1.f.f20887f
            i0.r.A(r5, r4, r1)
            x1.d r1 = x1.f.f20888g
            i0.r.w(r1, r4)
            r20 = r3
            x1.e r3 = x1.f.f20884c
            i0.r.A(r3, r4, r2)
            if (r65 != 0) goto L23b
            r2 = -1658794776(0xffffffff9d20cce8, float:-2.1281758E-21)
            r4.a0(r2)
            r2 = 0
            r4.p(r2)
            r13 = r1
            r14 = r3
            r0 = r5
            r45 = r11
            r25 = r16
            r47 = r19
            r24 = r20
            r12 = r6
            r11 = r8
            goto L285
        L23b:
            r2 = -1658794775(0xffffffff9d20cce9, float:-2.128176E-21)
            r4.a0(r2)
            r2 = 10
            float r2 = (float) r2
            r22 = r1
            r1 = 8
            float r1 = (float) r1
            r28 = 0
            r29 = 8
            r27 = r2
            r26 = r1
            r25 = r2
            r24 = r8
            y0.o r1 = p.d.p(r24, r25, r26, r27, r28, r29)
            int r2 = r39 >> 6
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r8 = 25008(0x61b0, float:3.5044E-41)
            r2 = r2 | r8
            r8 = 0
            r4 = r1
            wb.y2 r1 = wb.y2.f20289n
            r25 = r3
            r3 = 1
            r0 = r5
            r5 = r7
            r45 = r11
            r47 = r19
            r13 = r22
            r11 = r24
            r14 = r25
            r7 = r2
            r12 = r6
            r25 = r16
            r24 = r20
            r2 = r65
            r6 = r86
            r1.m0(r2, r3, r4, r5, r6, r7, r8)
            r4 = r6
            r1 = 0
            r4.p(r1)
        L285:
            int r1 = r38 >> 9
            r2 = r1 & 14
            r3 = 1572864(0x180000, float:2.204052E-39)
            r2 = r2 | r3
            r1 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            int r2 = r39 >> 12
            r3 = r2 & 896(0x380, float:1.256E-42)
            r1 = r1 | r3
            r3 = r2 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r3
            r48 = 57344(0xe000, float:8.0356E-41)
            r3 = r2 & r48
            r1 = r1 | r3
            r3 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r3
            r23 = r1 | r2
            wb.y2 r1 = wb.y2.f20289n
            r16 = r66
            r18 = r79
            r19 = r80
            r20 = r81
            r21 = r82
            r22 = r4
            r17 = r15
            r15 = r1
            r1 = 4
            r15.i0(r16, r17, r18, r19, r20, r21, r22, r23)
            r2 = 1065353216(0x3f800000, float:1.0)
            y0.o r16 = p.h1.d(r11, r2)
            r2 = 10
            float r2 = (float) r2
            r3 = 8
            float r3 = (float) r3
            r20 = 0
            r21 = 8
            r19 = r2
            r17 = r2
            r18 = r3
            y0.o r2 = p.d.p(r16, r17, r18, r19, r20, r21)
            r27 = r18
            r3 = 6
            float r5 = (float) r3
            p.h r6 = p.j.g(r5)
            y0.f r7 = y0.b.f21801p
            p.e1 r6 = p.d1.a(r6, r7, r4, r3)
            r8 = r2
            long r1 = r4.T
            int r1 = java.lang.Long.hashCode(r1)
            s0.h r2 = r4.l()
            y0.o r8 = y0.a.c(r4, r8)
            r4.d0()
            boolean r3 = r4.S
            if (r3 == 0) goto L2f9
            r4.k(r10)
            goto L2fc
        L2f9:
            r4.n0()
        L2fc:
            i0.r.A(r12, r4, r6)
            i0.r.A(r9, r4, r2)
            j8.b.p(r1, r4, r0, r4, r13)
            i0.r.A(r14, r4, r8)
            boolean r1 = og.m.t0(r68)
            if (r1 == 0) goto L314
            java.lang.String r3 = "默认配置"
            r6 = r3
        L311:
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L317
        L314:
            r6 = r68
            goto L311
        L317:
            double r3 = (double) r2
            r49 = 0
            int r1 = (r3 > r49 ? 1 : (r3 == r49 ? 0 : -1))
            java.lang.String r51 = "invalid weight; must be greater than zero"
            if (r1 <= 0) goto L322
        L320:
            r1 = r7
            goto L326
        L322:
            q.a.a(r51)
            goto L320
        L326:
            p.q0 r7 = new p.q0
            r3 = 1
            r7.<init>(r2, r3)
            int r2 = r38 >> 15
            r2 = r2 & 896(0x380, float:1.256E-42)
            r3 = 196614(0x30006, float:2.75515E-40)
            r19 = r2 | r3
            int r2 = r24 << 12
            r2 = r2 & r48
            r2 = r19 | r2
            r3 = r5
            java.lang.String r5 = "配置"
            r4 = r15
            r15 = r1
            r1 = r4
            r8 = r70
            r4 = r86
            r52 = r3
            r23 = r14
            r16 = r17
            r14 = 6
            r3 = r83
            r1.j0(r2, r3, r4, r5, r6, r7, r8)
            boolean r2 = og.m.t0(r69)
            if (r2 == 0) goto L35d
            java.lang.String r3 = "未设置"
            r6 = r3
        L35a:
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L360
        L35d:
            r6 = r69
            goto L35a
        L360:
            double r3 = (double) r2
            int r3 = (r3 > r49 ? 1 : (r3 == r49 ? 0 : -1))
            if (r3 <= 0) goto L366
            goto L369
        L366:
            q.a.a(r51)
        L369:
            p.q0 r7 = new p.q0
            r3 = 1
            r7.<init>(r2, r3)
            r2 = 9
            int r3 = r24 << 9
            r3 = r3 & r48
            r3 = r19 | r3
            java.lang.String r5 = "模型"
            r8 = r70
            r4 = r86
            r2 = r3
            r3 = r84
            r1.j0(r2, r3, r4, r5, r6, r7, r8)
            r7 = r4
            m1.f r8 = wb.ap.f15067h
            r1 = r25
            java.lang.Object r2 = r7.j(r1)
            bi.b r2 = (bi.b) r2
            long r2 = r2.h()
            f1.n r4 = new f1.n
            r5 = 5
            r4.<init>(r2, r5)
            r2 = 28
            float r2 = (float) r2
            y0.o r2 = p.h1.j(r11, r2)
            v.d r3 = v.e.a(r52)
            y0.o r2 = c1.h.b(r2, r3)
            java.lang.Object r1 = r7.j(r1)
            bi.b r1 = (bi.b) r1
            long r5 = r1.k()
            r1 = r47
            y0.o r2 = k.n.g(r2, r5, r1)
            r5 = r4
            r4 = 0
            r6 = 14
            r17 = 5
            r3 = 0
            r7 = r1
            r1 = r2
            r18 = r8
            r8 = r17
            r2 = r70
            r17 = r5
            r5 = r85
            y0.o r1 = k.n.j(r1, r2, r3, r4, r5, r6)
            r2 = r52
            y0.o r3 = p.d.l(r1, r2)
            r25 = r2
            java.lang.String r2 = "快捷选项"
            r6 = 54
            r5 = r86
            r4 = r17
            r1 = r18
            r52 = r25
            k.n.c(r1, r2, r3, r4, r5, r6)
            r4 = r5
            r3 = 1
            r4.p(r3)
            boolean r1 = r64.isEmpty()
            r5 = 48
            r6 = 12
            if (r1 != 0) goto L59b
            r1 = -1656842426(0xffffffff9d3e9746, float:-2.5224497E-21)
            r4.a0(r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            y0.o r8 = p.h1.d(r11, r1)
            k.w1 r1 = k.n.q(r4)
            r2 = 0
            y0.o r17 = k.n.r(r8, r1, r2, r3)
            float r1 = (float) r6
            r21 = 0
            r22 = 8
            r20 = r1
            r18 = r1
            r19 = r27
            y0.o r1 = p.d.p(r17, r18, r19, r20, r21, r22)
            r8 = r19
            p.h r2 = p.j.g(r52)
            p.e1 r2 = p.d1.a(r2, r15, r4, r14)
            long r14 = r4.T
            int r3 = java.lang.Long.hashCode(r14)
            s0.h r14 = r4.l()
            y0.o r1 = y0.a.c(r4, r1)
            r4.d0()
            boolean r15 = r4.S
            if (r15 == 0) goto L43b
            r4.k(r10)
            goto L43e
        L43b:
            r4.n0()
        L43e:
            i0.r.A(r12, r4, r2)
            i0.r.A(r9, r4, r14)
            j8.b.p(r3, r4, r0, r4, r13)
            r14 = r23
            i0.r.A(r14, r4, r1)
            r0 = 485974592(0x1cf76240, float:1.6370486E-21)
            r4.a0(r0)
            java.util.Iterator r0 = r64.iterator()
        L456:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L584
            java.lang.Object r1 = r0.next()
            fb.a r1 = (fb.a) r1
            v.d r2 = v.e.a(r52)
            y0.o r2 = c1.h.b(r11, r2)
            i0.m2 r3 = bi.d.f892a
            java.lang.Object r9 = r4.j(r3)
            bi.b r9 = (bi.b) r9
            long r9 = r9.k()
            y0.o r2 = k.n.g(r2, r9, r7)
            r9 = 4
            float r10 = (float) r9
            r12 = r52
            y0.o r2 = p.d.o(r2, r8, r12, r10, r12)
            y0.f r13 = y0.b.f21802q
            p.c r14 = p.j.f9924a
            p.e1 r13 = p.d1.a(r14, r13, r4, r5)
            long r14 = r4.T
            int r14 = java.lang.Long.hashCode(r14)
            s0.h r15 = r4.l()
            y0.o r2 = y0.a.c(r4, r2)
            x1.f r17 = x1.g.f20914f
            r17.getClass()
            x1.y r5 = x1.f.f20883b
            r4.d0()
            r53 = r6
            boolean r6 = r4.S
            if (r6 == 0) goto L4ac
            r4.k(r5)
            goto L4af
        L4ac:
            r4.n0()
        L4af:
            x1.e r5 = x1.f.f20886e
            i0.r.A(r5, r4, r13)
            x1.e r5 = x1.f.f20885d
            i0.r.A(r5, r4, r15)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r14)
            x1.e r6 = x1.f.f20887f
            i0.r.A(r6, r4, r5)
            x1.d r5 = x1.f.f20888g
            i0.r.w(r5, r4)
            x1.e r5 = x1.f.f20884c
            i0.r.A(r5, r4, r2)
            java.lang.String r15 = r1.f3386a
            java.lang.Object r2 = r4.j(r3)
            bi.b r2 = (bi.b) r2
            long r17 = r2.g()
            long r19 = x6.d.D(r53)
            r2 = 180(0xb4, float:2.52E-43)
            float r2 = (float) r2
            r5 = 11
            r6 = 0
            y0.o r2 = p.h1.m(r11, r6, r2, r5)
            r36 = 24960(0x6180, float:3.4976E-41)
            r37 = 241640(0x3afe8, float:3.3861E-40)
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r28 = 2
            r29 = 0
            r30 = 1
            r31 = 0
            r32 = 0
            r33 = 0
            r35 = 24624(0x6030, float:3.4506E-41)
            r34 = r4
            r13 = r16
            r16 = r2
            sh.s.n(r15, r16, r17, r19, r21, r22, r23, r25, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            m1.f r2 = wb.ap.f15064e
            java.lang.Object r3 = r4.j(r3)
            bi.b r3 = (bi.b) r3
            long r14 = r3.h()
            f1.n r3 = new f1.n
            r5 = 5
            r3.<init>(r14, r5)
            r28 = 0
            r29 = 14
            r26 = 0
            r27 = 0
            r25 = r10
            r24 = r11
            y0.o r5 = p.d.p(r24, r25, r26, r27, r28, r29)
            r10 = 18
            float r10 = (float) r10
            y0.o r5 = p.h1.j(r5, r10)
            r10 = r39 & r48
            r14 = 16384(0x4000, float:2.2959E-41)
            if (r10 != r14) goto L53d
            r10 = 1
            goto L53e
        L53d:
            r10 = 0
        L53e:
            boolean r15 = r4.h(r1)
            r10 = r10 | r15
            java.lang.Object r15 = r4.P()
            if (r10 != 0) goto L551
            i0.e r10 = i0.l.f5952a
            if (r15 != r10) goto L54e
            goto L551
        L54e:
            r9 = r77
            goto L55d
        L551:
            wb.xi r15 = new wb.xi
            r10 = 12
            r9 = r77
            r15.<init>(r9, r10, r1)
            r4.k0(r15)
        L55d:
            fg.a r15 = (fg.a) r15
            y0.o r1 = wb.ho.O6(r5, r15)
            r4 = r3
            r3 = r1
            r1 = r2
            java.lang.String r2 = "移除附件"
            r54 = r6
            r6 = 54
            r5 = r86
            r14 = r53
            r10 = r54
            r15 = 48
            k.n.c(r1, r2, r3, r4, r5, r6)
            r4 = r5
            r3 = 1
            r4.p(r3)
            r52 = r12
            r16 = r13
            r6 = r14
            r5 = r15
            goto L456
        L584:
            r9 = r77
            r15 = r5
            r14 = r6
            r13 = r16
            r12 = r52
            r1 = 0
            r3 = 1
            r10 = 0
            r4.p(r1)
            r4.p(r3)
            r4.p(r1)
        L598:
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L5b1
        L59b:
            r9 = r77
            r15 = r5
            r14 = r6
            r13 = r16
            r8 = r27
            r12 = r52
            r1 = 0
            r10 = 0
            r0 = -1655298099(0xffffffff9d5627cd, float:-2.834324E-21)
            r4.a0(r0)
            r4.p(r1)
            goto L598
        L5b1:
            y0.o r0 = p.h1.d(r11, r2)
            y0.o r0 = p.d.o(r0, r13, r13, r13, r13)
            v.d r2 = v.e.a(r13)
            y0.o r0 = c1.h.b(r0, r2)
            i0.m2 r13 = bi.d.f892a
            java.lang.Object r2 = r4.j(r13)
            bi.b r2 = (bi.b) r2
            long r2 = r2.k()
            y0.o r0 = k.n.g(r0, r2, r7)
            r2 = 9
            float r2 = (float) r2
            float r3 = (float) r14
            y0.o r0 = p.d.o(r0, r8, r2, r3, r2)
            y0.f r2 = y0.b.f21803r
            p.c r3 = p.j.f9924a
            p.e1 r2 = p.d1.a(r3, r2, r4, r15)
            long r5 = r4.T
            int r3 = java.lang.Long.hashCode(r5)
            s0.h r5 = r4.l()
            y0.o r0 = y0.a.c(r4, r0)
            x1.f r6 = x1.g.f20914f
            r6.getClass()
            x1.y r6 = x1.f.f20883b
            r4.d0()
            boolean r14 = r4.S
            if (r14 == 0) goto L601
            r4.k(r6)
            goto L604
        L601:
            r4.n0()
        L604:
            x1.e r6 = x1.f.f20886e
            i0.r.A(r6, r4, r2)
            x1.e r2 = x1.f.f20885d
            i0.r.A(r2, r4, r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            x1.e r3 = x1.f.f20887f
            i0.r.A(r3, r4, r2)
            x1.d r2 = x1.f.f20888g
            i0.r.w(r2, r4)
            x1.e r2 = x1.f.f20884c
            i0.r.A(r2, r4, r0)
            r44 = r1
            m1.f r1 = wb.ap.f15061b
            java.lang.Object r0 = r4.j(r13)
            bi.b r0 = (bi.b) r0
            long r2 = r0.h()
            f1.n r4 = new f1.n
            r0 = 5
            r4.<init>(r2, r0)
            r3 = 1
            float r2 = (float) r3
            r29 = 3
            r25 = 0
            r26 = 0
            r28 = r2
            r27 = r8
            r24 = r11
            y0.o r2 = p.d.p(r24, r25, r26, r27, r28, r29)
            r3 = 24
            float r3 = (float) r3
            y0.o r2 = p.h1.j(r2, r3)
            r15 = r76
            y0.o r3 = wb.ho.O6(r2, r15)
            java.lang.String r2 = "添加附件"
            r6 = 54
            r5 = r86
            k.n.c(r1, r2, r3, r4, r5, r6)
            r4 = r5
            i2.n0 r25 = new i2.n0
            java.lang.Object r1 = r4.j(r13)
            bi.b r1 = (bi.b) r1
            long r26 = r1.g()
            r19 = 14
            long r28 = x6.d.D(r19)
            r34 = 0
            r36 = 16777212(0xfffffc, float:2.3509881E-38)
            r30 = 0
            r31 = 0
            r33 = 0
            r25.<init>(r26, r28, r30, r31, r33, r34, r36)
            r2 = 1065353216(0x3f800000, float:1.0)
            double r5 = (double) r2
            int r1 = (r5 > r49 ? 1 : (r5 == r49 ? 0 : -1))
            if (r1 <= 0) goto L686
            goto L689
        L686:
            q.a.a(r51)
        L689:
            p.q0 r1 = new p.q0
            r3 = 1
            r1.<init>(r2, r3)
            y0.f r2 = y0.b.f21801p
            p.p1 r5 = new p.p1
            r5.<init>(r2)
            y0.o r1 = r1.d(r5)
            r2 = 34
            float r2 = (float) r2
            r5 = 2
            y0.o r1 = p.h1.g(r1, r2, r10, r5)
            sh.d r5 = new sh.d
            r6 = 6
            r8 = r63
            r5.<init>(r8, r6)
            r6 = -29316403(0xfffffffffe40aacd, float:-6.4024656E37)
            s0.d r13 = s0.i.e(r6, r5, r4)
            r5 = r38 & 14
            r6 = 805306368(0x30000000, float:4.656613E-10)
            r5 = r5 | r6
            int r6 = r38 >> 24
            r6 = r6 & 112(0x70, float:1.57E-43)
            r5 = r5 | r6
            int r6 = r38 >> 12
            r6 = r6 & 7168(0x1c00, float:1.0045E-41)
            r5 = r5 | r6
            r16 = 196614(0x30006, float:2.75515E-40)
            r17 = 31184(0x79d0, float:4.3698E-41)
            r15 = r5
            r5 = 0
            r6 = 0
            r47 = r7
            r7 = 0
            r8 = 4
            r9 = 1
            r10 = 0
            r11 = 0
            r52 = r12
            r12 = 0
            r0 = r63
            r3 = r70
            r59 = r2
            r14 = r4
            r4 = r25
            r55 = r42
            r57 = r45
            r60 = r47
            r25 = r52
            r2 = r1
            r1 = r72
            w.i.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r6 = r71
            r4 = r14
            if (r6 == 0) goto L749
            r0 = 332599167(0x13d30f7f, float:5.327917E-27)
            r4.a0(r0)
            m1.f r0 = wb.ap.f15072m
            r1 = 4292423717(0xffd93025, double:2.120739096E-314)
            long r1 = f1.c0.d(r1)
            f1.n r3 = new f1.n
            r8 = 5
            r3.<init>(r1, r8)
            r28 = 0
            r29 = 14
            r26 = 0
            r27 = 0
            y0.o r1 = p.d.p(r24, r25, r26, r27, r28, r29)
            r2 = 30
            float r2 = (float) r2
            y0.o r1 = p.h1.j(r1, r2)
            r2 = 15
            float r2 = (float) r2
            v.d r2 = v.e.a(r2)
            y0.o r1 = c1.h.b(r1, r2)
            long r9 = f1.w.f3127c
            r7 = r60
            y0.o r9 = k.n.g(r1, r9, r7)
            r12 = 0
            r14 = 15
            r10 = 0
            r11 = 0
            r13 = r75
            y0.o r1 = k.n.j(r9, r10, r11, r12, r13, r14)
            r2 = 7
            float r2 = (float) r2
            y0.o r2 = p.d.l(r1, r2)
            java.lang.String r1 = "停止生成"
            r5 = 1572918(0x180036, float:2.204128E-39)
            k.n.c(r0, r1, r2, r3, r4, r5)
            r9 = 0
            r4.p(r9)
            goto L756
        L749:
            r7 = r60
            r8 = 5
            r9 = 0
            r0 = 333061842(0x13da1ed2, float:5.5061328E-27)
            r4.a0(r0)
            r4.p(r9)
        L756:
            if (r6 == 0) goto L76b
            if (r40 == 0) goto L75b
            goto L76b
        L75b:
            r0 = 333783026(0x13e51ff2, float:5.7839228E-27)
            r4.a0(r0)
            r4.p(r9)
            r7 = r73
            r8 = r74
        L768:
            r3 = 1
            goto L800
        L76b:
            r0 = 333140644(0x13db52a4, float:5.5364862E-27)
            r4.a0(r0)
            if (r6 == 0) goto L776
            m1.f r0 = wb.ap.f15062c
            goto L778
        L776:
            m1.f r0 = wb.ap.f15071l
        L778:
            if (r6 == 0) goto L77d
            java.lang.String r1 = "加入待发送队列"
            goto L77f
        L77d:
            java.lang.String r1 = "发送"
        L77f:
            f1.n r3 = new f1.n
            r10 = r57
            r3.<init>(r10, r8)
            r28 = 0
            r29 = 14
            r26 = 0
            r27 = 0
            y0.o r2 = p.d.p(r24, r25, r26, r27, r28, r29)
            r5 = r59
            y0.o r2 = p.h1.j(r2, r5)
            r5 = 17
            float r5 = (float) r5
            v.d r5 = v.e.a(r5)
            y0.o r2 = c1.h.b(r2, r5)
            r10 = r55
            y0.o r11 = k.n.g(r2, r10, r7)
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r38 & r2
            r5 = 67108864(0x4000000, float:1.5046328E-36)
            if (r2 != r5) goto L7b3
            r2 = 1
            goto L7b4
        L7b3:
            r2 = r9
        L7b4:
            r5 = r39 & 112(0x70, float:1.57E-43)
            r7 = 32
            if (r5 != r7) goto L7bc
            r5 = 1
            goto L7bd
        L7bc:
            r5 = r9
        L7bd:
            r2 = r2 | r5
            r5 = r39 & 14
            r7 = 4
            if (r5 != r7) goto L7c5
            r5 = 1
            goto L7c6
        L7c5:
            r5 = r9
        L7c6:
            r2 = r2 | r5
            java.lang.Object r5 = r4.P()
            if (r2 != 0) goto L7d7
            i0.e r2 = i0.l.f5952a
            if (r5 != r2) goto L7d2
            goto L7d7
        L7d2:
            r7 = r73
            r8 = r74
            goto L7e3
        L7d7:
            u9.f r5 = new u9.f
            r7 = r73
            r8 = r74
            r5.<init>(r6, r8, r7)
            r4.k0(r5)
        L7e3:
            r15 = r5
            fg.a r15 = (fg.a) r15
            r16 = 14
            r13 = 0
            r14 = 0
            r12 = r41
            y0.o r2 = k.n.j(r11, r12, r13, r14, r15, r16)
            r5 = 7
            float r5 = (float) r5
            y0.o r2 = p.d.l(r2, r5)
            r5 = 1572864(0x180000, float:2.204052E-39)
            k.n.c(r0, r1, r2, r3, r4, r5)
            r4.p(r9)
            goto L768
        L800:
            r4.p(r3)
            r4.p(r3)
            goto L80e
        L807:
            r6 = r71
            r7 = r11
            r8 = r12
            r4.V()
        L80e:
            i0.r1 r0 = r4.t()
            if (r0 == 0) goto L84f
            r1 = r0
            wb.ur r0 = new wb.ur
            r2 = r63
            r3 = r64
            r4 = r65
            r5 = r66
            r9 = r70
            r11 = r72
            r14 = r75
            r15 = r76
            r16 = r77
            r17 = r78
            r18 = r79
            r19 = r80
            r20 = r81
            r21 = r82
            r22 = r83
            r23 = r84
            r24 = r85
            r25 = r87
            r61 = r1
            r10 = r6
            r12 = r7
            r13 = r8
            r1 = r62
            r6 = r67
            r7 = r68
            r8 = r69
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r1 = r61
            r1.f6035d = r0
        L84f:
            return
    }

    public void S(java.util.List r36, java.lang.String r37, java.lang.String r38, boolean r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.util.List r44, boolean r45, java.lang.String r46, java.lang.String r47, fg.l r48, fg.l r49, fg.l r50, fg.l r51, fg.l r52, fg.l r53, fg.l r54, fg.l r55, fg.l r56, fg.l r57, fg.l r58, fg.a r59, fg.a r60, fg.a r61, fg.a r62, fg.a r63, fg.a r64, i0.h0 r65, int r66) {
            r35 = this;
            r4 = r38
            r6 = r40
            r7 = r41
            r9 = r43
            r0 = r59
            r1 = r63
            r2 = r65
            r3 = -179316750(0xfffffffff54fd7f2, float:-2.6347298E32)
            r2.b0(r3)
            r5 = r36
            boolean r3 = r2.f(r5)
            if (r3 == 0) goto L1e
            r3 = 4
            goto L1f
        L1e:
            r3 = 2
        L1f:
            r3 = r66 | r3
            r11 = r37
            boolean r12 = r2.f(r11)
            if (r12 == 0) goto L2c
            r12 = 32
            goto L2e
        L2c:
            r12 = 16
        L2e:
            r3 = r3 | r12
            boolean r12 = r2.f(r4)
            if (r12 == 0) goto L38
            r12 = 256(0x100, float:3.59E-43)
            goto L3a
        L38:
            r12 = 128(0x80, float:1.8E-43)
        L3a:
            r3 = r3 | r12
            r12 = r39
            boolean r17 = r2.g(r12)
            r18 = 1024(0x400, float:1.435E-42)
            r19 = 2048(0x800, float:2.87E-42)
            if (r17 == 0) goto L4a
            r17 = r19
            goto L4c
        L4a:
            r17 = r18
        L4c:
            r3 = r3 | r17
            boolean r17 = r2.f(r6)
            r20 = 8192(0x2000, float:1.148E-41)
            if (r17 == 0) goto L59
            r17 = 16384(0x4000, float:2.2959E-41)
            goto L5b
        L59:
            r17 = r20
        L5b:
            r3 = r3 | r17
            boolean r17 = r2.f(r7)
            if (r17 == 0) goto L66
            r17 = 131072(0x20000, float:1.83671E-40)
            goto L68
        L66:
            r17 = 65536(0x10000, float:9.1835E-41)
        L68:
            r3 = r3 | r17
            r12 = r42
            boolean r17 = r2.f(r12)
            r23 = 524288(0x80000, float:7.34684E-40)
            r24 = 1048576(0x100000, float:1.469368E-39)
            if (r17 == 0) goto L79
            r17 = r24
            goto L7b
        L79:
            r17 = r23
        L7b:
            r3 = r3 | r17
            boolean r17 = r2.f(r9)
            r25 = 4194304(0x400000, float:5.877472E-39)
            if (r17 == 0) goto L88
            r17 = 8388608(0x800000, float:1.1754944E-38)
            goto L8a
        L88:
            r17 = r25
        L8a:
            r3 = r3 | r17
            r12 = r44
            boolean r17 = r2.f(r12)
            if (r17 == 0) goto L97
            r17 = 67108864(0x4000000, float:1.5046328E-36)
            goto L99
        L97:
            r17 = 33554432(0x2000000, float:9.403955E-38)
        L99:
            r3 = r3 | r17
            r12 = r45
            boolean r17 = r2.g(r12)
            if (r17 == 0) goto La6
            r17 = 536870912(0x20000000, float:1.0842022E-19)
            goto La8
        La6:
            r17 = 268435456(0x10000000, float:2.524355E-29)
        La8:
            r3 = r3 | r17
            r12 = r46
            boolean r17 = r2.f(r12)
            if (r17 == 0) goto Lb5
            r17 = 4
            goto Lb7
        Lb5:
            r17 = 2
        Lb7:
            r27 = 920350080(0x36db6d80, float:6.539456E-6)
            r17 = r27 | r17
            r12 = r47
            boolean r27 = r2.f(r12)
            if (r27 == 0) goto Lc7
            r27 = 32
            goto Lc9
        Lc7:
            r27 = 16
        Lc9:
            r17 = r17 | r27
            r12 = r56
            boolean r27 = r2.h(r12)
            if (r27 == 0) goto Ld6
            r16 = 4
            goto Ld8
        Ld6:
            r16 = 2
        Ld8:
            r21 = 906166272(0x36030000, float:1.9520521E-6)
            r16 = r21 | r16
            r15 = r57
            boolean r27 = r2.h(r15)
            if (r27 == 0) goto Le7
            r22 = 32
            goto Le9
        Le7:
            r22 = 16
        Le9:
            r16 = r16 | r22
            r14 = r58
            boolean r26 = r2.h(r14)
            if (r26 == 0) goto Lf6
            r21 = 256(0x100, float:3.59E-43)
            goto Lf8
        Lf6:
            r21 = 128(0x80, float:1.8E-43)
        Lf8:
            r16 = r16 | r21
            boolean r21 = r2.h(r0)
            if (r21 == 0) goto L102
            r18 = r19
        L102:
            r16 = r16 | r18
            r12 = r60
            boolean r18 = r2.h(r12)
            if (r18 == 0) goto L10e
            r20 = 16384(0x4000, float:2.2959E-41)
        L10e:
            r16 = r16 | r20
            r12 = r62
            boolean r18 = r2.h(r12)
            if (r18 == 0) goto L11a
            r23 = r24
        L11a:
            r16 = r16 | r23
            boolean r18 = r2.h(r1)
            if (r18 == 0) goto L124
            r25 = 8388608(0x800000, float:1.1754944E-38)
        L124:
            r16 = r16 | r25
            r18 = 306783379(0x12492493, float:6.34695E-28)
            r13 = r3 & r18
            r10 = 306783378(0x12492492, float:6.3469493E-28)
            if (r13 != r10) goto L141
            r13 = r17 & r18
            if (r13 != r10) goto L141
            r10 = 38347923(0x2492493, float:1.4777644E-37)
            r10 = r16 & r10
            r13 = 38347922(0x2492492, float:1.4777643E-37)
            if (r10 == r13) goto L13f
            goto L141
        L13f:
            r10 = 0
            goto L142
        L141:
            r10 = 1
        L142:
            r13 = r3 & 1
            boolean r10 = r2.S(r13, r10)
            if (r10 == 0) goto L349
            java.lang.Object r10 = r2.P()
            java.lang.String r13 = ""
            i0.e r12 = i0.l.f5952a
            if (r10 != r12) goto L15b
            i0.j1 r10 = i0.r.u(r13)
            r2.k0(r10)
        L15b:
            i0.a1 r10 = (i0.a1) r10
            java.lang.Object r17 = r10.getValue()
            r8 = r17
            java.lang.String r8 = (java.lang.String) r8
            r5 = r3 & 896(0x380, float:1.256E-42)
            r17 = r3
            r3 = 256(0x100, float:3.59E-43)
            if (r5 != r3) goto L16f
            r3 = 1
            goto L170
        L16f:
            r3 = 0
        L170:
            boolean r5 = r2.f(r8)
            r3 = r3 | r5
            java.lang.Object r5 = r2.P()
            java.lang.String r8 = "rename"
            if (r3 != 0) goto L17f
            if (r5 != r12) goto L193
        L17f:
            java.lang.Object r3 = r10.getValue()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = gg.l.a(r3, r8)
            if (r3 == 0) goto L18c
            r13 = r4
        L18c:
            i0.j1 r5 = i0.r.u(r13)
            r2.k0(r5)
        L193:
            r3 = r5
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r5 = r2.P()
            if (r5 != r12) goto L1a5
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            i0.j1 r5 = i0.r.u(r5)
            r2.k0(r5)
        L1a5:
            i0.a1 r5 = (i0.a1) r5
            r13 = 57344(0xe000, float:8.0356E-41)
            r13 = r17 & r13
            r28 = r3
            r3 = 16384(0x4000, float:2.2959E-41)
            if (r13 != r3) goto L1b4
            r3 = 1
            goto L1b5
        L1b4:
            r3 = 0
        L1b5:
            r13 = 458752(0x70000, float:6.42848E-40)
            r13 = r17 & r13
            r20 = r3
            r3 = 131072(0x20000, float:1.83671E-40)
            if (r13 != r3) goto L1c1
            r3 = 1
            goto L1c2
        L1c1:
            r3 = 0
        L1c2:
            r3 = r20 | r3
            r13 = 29360128(0x1c00000, float:7.052966E-38)
            r13 = r17 & r13
            r17 = r3
            r3 = 8388608(0x800000, float:1.1754944E-38)
            if (r13 != r3) goto L1d0
            r3 = 1
            goto L1d1
        L1d0:
            r3 = 0
        L1d1:
            r3 = r17 | r3
            java.lang.Object r13 = r2.P()
            if (r3 != 0) goto L1db
            if (r13 != r12) goto L1e3
        L1db:
            r3 = 1
            java.lang.String r13 = fb.w.v(r6, r7, r9, r3)
            r2.k0(r13)
        L1e3:
            r3 = r13
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r13 = r10.getValue()
            java.lang.String r13 = (java.lang.String) r13
            boolean r13 = og.m.t0(r13)
            if (r13 != 0) goto L272
            r13 = 915621474(0x36934662, float:4.389135E-6)
            r2.a0(r13)
            java.lang.Object r13 = r10.getValue()
            java.lang.String r13 = (java.lang.String) r13
            boolean r8 = gg.l.a(r13, r8)
            if (r8 == 0) goto L207
            java.lang.String r8 = "重命名配置"
            goto L209
        L207:
            java.lang.String r8 = "新建配置"
        L209:
            java.lang.Object r13 = r2.P()
            if (r13 != r12) goto L21b
            wb.ht r13 = new wb.ht
            r33 = r3
            r3 = 0
            r13.<init>(r10, r3)
            r2.k0(r13)
            goto L21d
        L21b:
            r33 = r3
        L21d:
            r19 = r13
            fg.a r19 = (fg.a) r19
            c9.q0 r27 = new c9.q0
            r32 = 24
            r31 = r10
            r29 = r14
            r30 = r15
            r27.<init>(r28, r29, r30, r31, r32)
            r10 = r27
            r3 = r28
            r29 = r31
            r13 = 735370252(0x2bd4dc0c, float:1.5124581E-12)
            s0.d r25 = s0.i.e(r13, r10, r2)
            r27 = 100663302(0x6000006, float:2.4074142E-35)
            r28 = 3072(0xc00, float:4.305E-42)
            r10 = 0
            r14 = r12
            r12 = 0
            r17 = r14
            r14 = 0
            r20 = r17
            r18 = 0
            r16 = 0
            r21 = r18
            r18 = 0
            r23 = r20
            r22 = r21
            r20 = 0
            r24 = r22
            r26 = r23
            r22 = 0
            r30 = r24
            r24 = 0
            r11 = r8
            r8 = r26
            r26 = r2
            r2 = r30
            oh.h.d(r10, r11, r12, r14, r16, r18, r19, r20, r22, r24, r25, r26, r27, r28)
            r10 = r26
            r10.p(r2)
            goto L284
        L272:
            r33 = r3
            r29 = r10
            r8 = r12
            r3 = r28
            r10 = r2
            r2 = 0
            r11 = 917387792(0x36ae3a10, float:5.1923635E-6)
            r10.a0(r11)
            r10.p(r2)
        L284:
            java.lang.Object r11 = r5.getValue()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L2d6
            r11 = 917459247(0x36af512f, float:5.2248574E-6)
            r10.a0(r11)
            java.lang.Object r11 = r10.P()
            if (r11 != r8) goto L2a5
            wb.jp r11 = new wb.jp
            r8 = 6
            r11.<init>(r5, r8)
            r10.k0(r11)
        L2a5:
            r19 = r11
            fg.a r19 = (fg.a) r19
            wb.rj r8 = new wb.rj
            r8.<init>(r4, r0, r5)
            r11 = -592338877(0xffffffffdcb1a043, float:-3.9997824E17)
            s0.d r25 = s0.i.e(r11, r8, r10)
            r27 = 100663686(0x6000186, float:2.4075244E-35)
            r28 = 3072(0xc00, float:4.305E-42)
            r10 = 0
            java.lang.String r11 = "删除配置"
            r12 = 0
            r14 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = r65
            oh.h.d(r10, r11, r12, r14, r16, r18, r19, r20, r22, r24, r25, r26, r27, r28)
            r8 = r26
            r8.p(r2)
            goto L2e0
        L2d6:
            r8 = r10
            r10 = 918813296(0x36c3fa70, float:5.8406076E-6)
            r8.a0(r10)
            r8.p(r2)
        L2e0:
            r.z r2 = r.b0.a(r8)
            sh.x r10 = sh.s.i(r8)
            wb.g1 r11 = new wb.g1
            r12 = 15
            r13 = r64
            r11.<init>(r1, r13, r12)
            r12 = 1086265075(0x40bf16f3, float:5.9715514)
            s0.d r31 = s0.i.e(r12, r11, r8)
            wb.zr r0 = new wb.zr
            r8 = r39
            r15 = r42
            r27 = r44
            r22 = r45
            r24 = r46
            r20 = r47
            r13 = r48
            r11 = r49
            r16 = r50
            r18 = r51
            r28 = r52
            r23 = r53
            r25 = r54
            r21 = r55
            r19 = r61
            r26 = r62
            r30 = r5
            r12 = r6
            r17 = r9
            r1 = r10
            r14 = r33
            r5 = r36
            r6 = r37
            r9 = r60
            r10 = r7
            r7 = r56
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r2 = -2137575443(0xffffffff80972fed, float:-1.3884352E-38)
            r7 = r65
            s0.d r6 = s0.i.e(r2, r0, r7)
            r8 = 1769526(0x1b0036, float:2.479634E-39)
            r9 = 24
            java.lang.String r0 = "Agent 配置"
            r2 = r1
            java.lang.String r1 = "Agent 配置"
            r3 = 0
            r4 = 0
            r5 = r31
            wb.ho.B2(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L34c
        L349:
            r65.V()
        L34c:
            i0.r1 r0 = r65.t()
            if (r0 == 0) goto L39c
            r1 = r0
            wb.bs r0 = new wb.bs
            r2 = r36
            r3 = r37
            r4 = r38
            r5 = r39
            r6 = r40
            r7 = r41
            r8 = r42
            r9 = r43
            r10 = r44
            r11 = r45
            r12 = r46
            r13 = r47
            r14 = r48
            r15 = r49
            r16 = r50
            r17 = r51
            r18 = r52
            r19 = r53
            r20 = r54
            r21 = r55
            r22 = r56
            r23 = r57
            r24 = r58
            r25 = r59
            r26 = r60
            r27 = r61
            r28 = r62
            r29 = r63
            r30 = r64
            r31 = r66
            r34 = r1
            r1 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r1 = r34
            r1.f6035d = r0
        L39c:
            return
    }

    public void T(java.lang.String r49, i0.h0 r50, int r51) {
            r48 = this;
            r0 = r49
            r1 = r50
            r2 = -1890868476(0xffffffff8f4ba304, float:-1.00400684E-29)
            r1.b0(r2)
            r2 = r51 & 6
            r3 = 2
            if (r2 != 0) goto L1b
            boolean r2 = r1.f(r0)
            if (r2 == 0) goto L17
            r2 = 4
            goto L18
        L17:
            r2 = r3
        L18:
            r2 = r51 | r2
            goto L1d
        L1b:
            r2 = r51
        L1d:
            r4 = r2 & 3
            r5 = 1
            if (r4 == r3) goto L24
            r3 = r5
            goto L25
        L24:
            r3 = 0
        L25:
            r2 = r2 & r5
            boolean r2 = r1.S(r2, r3)
            if (r2 == 0) goto L2ec
            boolean r2 = k.n.p(r1)
            if (r2 == 0) goto L3c
            r3 = 4286506887(0xff7ee787, double:2.1178157935E-314)
        L37:
            long r3 = f1.c0.d(r3)
            goto L42
        L3c:
            r3 = 4279329577(0xff116329, double:2.114269731E-314)
            goto L37
        L42:
            if (r2 == 0) goto L4e
            r7 = 4279384096(0xff123820, double:2.114296667E-314)
        L49:
            long r7 = f1.c0.d(r7)
            goto L54
        L4e:
            r7 = 4293328876(0xffe6ffec, double:2.121186304E-314)
            goto L49
        L54:
            if (r2 == 0) goto L60
            r9 = 4294943128(0xffffa198, double:2.1219838504E-314)
        L5b:
            long r9 = f1.c0.d(r9)
            goto L66
        L60:
            r9 = 4291764782(0xffcf222e, double:2.120413539E-314)
            goto L5b
        L66:
            if (r2 == 0) goto L72
            r11 = 4282194976(0xff3d1c20, double:2.1156854264E-314)
        L6d:
            long r11 = f1.c0.d(r11)
            goto L78
        L72:
            r11 = 4294962153(0xffffebe9, double:2.12199325E-314)
            goto L6d
        L78:
            if (r2 == 0) goto L84
            r13 = 4286169343(0xff79c0ff, double:2.1176490246E-314)
        L7f:
            long r13 = f1.c0.d(r13)
            goto L8a
        L84:
            r13 = 4278807002(0xff0969da, double:2.114011545E-314)
            goto L7f
        L8a:
            if (r2 == 0) goto L98
            r15 = 4279642690(0xff162a42, double:2.1144244296E-314)
        L91:
            long r15 = f1.c0.d(r15)
            r24 = r15
            goto L9e
        L98:
            r15 = 4292736255(0xffddf4ff, double:2.1208935103E-314)
            goto L91
        L9e:
            i0.m2 r2 = bi.d.f892a
            java.lang.Object r15 = r1.j(r2)
            bi.b r15 = (bi.b) r15
            r17 = r7
            long r6 = r15.g()
            java.lang.Object r8 = r1.j(r2)
            bi.b r8 = (bi.b) r8
            r19 = r6
            long r5 = r8.h()
            y0.l r7 = y0.l.f21818a
            r8 = 1065353216(0x3f800000, float:1.0)
            y0.o r15 = p.h1.d(r7, r8)
            r8 = 6
            float r8 = (float) r8
            r0 = 0
            r23 = r7
            r7 = 1
            y0.o r15 = p.d.n(r15, r0, r8, r7)
            r0 = 8
            float r0 = (float) r0
            v.d r0 = v.e.a(r0)
            y0.o r0 = c1.h.b(r15, r0)
            java.lang.Object r2 = r1.j(r2)
            bi.b r2 = (bi.b) r2
            r15 = r8
            long r7 = r2.n()
            f1.m0 r2 = f1.c0.f3038b
            y0.o r0 = k.n.g(r0, r7, r2)
            k.w1 r7 = k.n.q(r1)
            r16 = r15
            r8 = 1
            r15 = 0
            y0.o r0 = k.n.r(r0, r7, r15, r8)
            r7 = r16
            r15 = 0
            y0.o r0 = p.d.n(r0, r15, r7, r8)
            p.e r7 = p.j.f9926c
            y0.e r8 = y0.b.f21804s
            r15 = 0
            p.t r7 = p.s.a(r7, r8, r1, r15)
            r26 = r11
            long r11 = r1.T
            int r8 = java.lang.Long.hashCode(r11)
            s0.h r11 = r1.l()
            y0.o r0 = y0.a.c(r1, r0)
            x1.f r12 = x1.g.f20914f
            r12.getClass()
            x1.y r12 = x1.f.f20883b
            r1.d0()
            boolean r15 = r1.S
            if (r15 == 0) goto L124
            r1.k(r12)
            goto L127
        L124:
            r1.n0()
        L127:
            x1.e r12 = x1.f.f20886e
            i0.r.A(r12, r1, r7)
            x1.e r7 = x1.f.f20885d
            i0.r.A(r7, r1, r11)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            x1.e r8 = x1.f.f20887f
            i0.r.A(r8, r1, r7)
            x1.d r7 = x1.f.f20888g
            i0.r.w(r7, r1)
            x1.e r7 = x1.f.f20884c
            i0.r.A(r7, r1, r0)
            r0 = -1293341731(0xffffffffb2e92bdd, float:-2.7144717E-8)
            r1.a0(r0)
            java.util.List r0 = og.m.x0(r49)
            java.util.Iterator r0 = r0.iterator()
        L152:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L2e3
            java.lang.Object r7 = r0.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r8 = "diff --git "
            r15 = 0
            boolean r8 = og.t.d0(r7, r8, r15)
            if (r8 != 0) goto L1ba
            java.lang.String r8 = "--- "
            boolean r8 = og.t.d0(r7, r8, r15)
            if (r8 != 0) goto L1ba
            java.lang.String r8 = "+++ "
            boolean r8 = og.t.d0(r7, r8, r15)
            if (r8 != 0) goto L1ba
            java.lang.String r8 = "index "
            boolean r8 = og.t.d0(r7, r8, r15)
            if (r8 != 0) goto L1ba
            java.lang.String r8 = "new file mode "
            boolean r8 = og.t.d0(r7, r8, r15)
            if (r8 != 0) goto L1ba
            java.lang.String r8 = "deleted file mode "
            boolean r8 = og.t.d0(r7, r8, r15)
            if (r8 != 0) goto L1ba
            java.lang.String r8 = "similarity index "
            boolean r8 = og.t.d0(r7, r8, r15)
            if (r8 != 0) goto L1ba
            java.lang.String r8 = "rename from "
            boolean r8 = og.t.d0(r7, r8, r15)
            if (r8 != 0) goto L1ba
            java.lang.String r8 = "rename to "
            boolean r8 = og.t.d0(r7, r8, r15)
            if (r8 != 0) goto L1ba
            java.lang.String r8 = "Binary files "
            boolean r8 = og.t.d0(r7, r8, r15)
            if (r8 != 0) goto L1ba
            java.lang.String r8 = "Only in "
            boolean r8 = og.t.d0(r7, r8, r15)
            if (r8 == 0) goto L1b8
            goto L1ba
        L1b8:
            r8 = 0
            goto L1bb
        L1ba:
            r8 = 1
        L1bb:
            java.lang.String r11 = "@@"
            r15 = 0
            boolean r11 = og.t.d0(r7, r11, r15)
            if (r11 == 0) goto L1dc
            f1.w r8 = new f1.w
            r8.<init>(r13)
            f1.w r11 = new f1.w
            r28 = r13
            r12 = r24
            r11.<init>(r12)
            sf.e r14 = new sf.e
            r14.<init>(r8, r11)
        L1d7:
            r24 = r0
            r15 = 0
            goto L248
        L1dc:
            r28 = r13
            r12 = r24
            if (r8 == 0) goto L1f4
            f1.w r8 = new f1.w
            r8.<init>(r5)
            long r14 = f1.w.f3130f
            f1.w r11 = new f1.w
            r11.<init>(r14)
            sf.e r14 = new sf.e
            r14.<init>(r8, r11)
            goto L1d7
        L1f4:
            java.lang.String r8 = "+"
            r15 = 0
            boolean r8 = og.t.d0(r7, r8, r15)
            if (r8 == 0) goto L211
            f1.w r8 = new f1.w
            r8.<init>(r3)
            f1.w r11 = new f1.w
            r24 = r0
            r0 = r17
            r11.<init>(r0)
            sf.e r14 = new sf.e
            r14.<init>(r8, r11)
            goto L248
        L211:
            r24 = r0
            r0 = r17
            java.lang.String r8 = "-"
            boolean r8 = og.t.d0(r7, r8, r15)
            if (r8 == 0) goto L231
            f1.w r8 = new f1.w
            r8.<init>(r9)
            f1.w r11 = new f1.w
            r17 = r0
            r0 = r26
            r11.<init>(r0)
            sf.e r14 = new sf.e
            r14.<init>(r8, r11)
            goto L248
        L231:
            r17 = r0
            r0 = r26
            f1.w r8 = new f1.w
            r0 = r19
            r8.<init>(r0)
            long r0 = f1.w.f3130f
            f1.w r11 = new f1.w
            r11.<init>(r0)
            sf.e r14 = new sf.e
            r14.<init>(r8, r11)
        L248:
            java.lang.Object r0 = r14.f12418g
            f1.w r0 = (f1.w) r0
            long r0 = r0.f3133a
            java.lang.Object r8 = r14.f12419h
            f1.w r8 = (f1.w) r8
            r30 = r0
            long r0 = r8.f3133a
            int r8 = r7.length()
            if (r8 != 0) goto L25e
            java.lang.String r7 = " "
        L25e:
            r8 = 12
            long r32 = x6.d.D(r8)
            r11 = r23
            r8 = 1065353216(0x3f800000, float:1.0)
            y0.o r14 = p.h1.d(r11, r8)
            y0.o r0 = k.n.g(r14, r0, r2)
            r1 = 10
            float r1 = (float) r1
            r14 = 1
            float r8 = (float) r14
            y0.o r0 = p.d.m(r0, r1, r8)
            r8 = 1065353216(0x3f800000, float:1.0)
            r22 = 27648(0x6c00, float:3.8743E-41)
            r23 = 237416(0x39f68, float:3.3269E-40)
            r1 = r7
            r7 = 0
            r16 = r8
            m2.m r8 = m2.p.f8705b
            r34 = r9
            r9 = 0
            r21 = r11
            r11 = 0
            r36 = r12
            r12 = 0
            r25 = r14
            r14 = 0
            r38 = r15
            r15 = 0
            r39 = r16
            r16 = 1
            r40 = r17
            r17 = 0
            r18 = 0
            r42 = r19
            r19 = 0
            r20 = r21
            r21 = 24576(0x6000, float:3.4438E-41)
            r44 = r26
            r25 = r3
            r3 = r30
            r29 = r28
            r27 = r44
            r44 = r20
            r20 = r50
            r45 = r2
            r2 = r0
            r0 = r38
            r38 = r44
            r46 = r32
            r33 = r45
            r31 = r5
            r5 = r46
            sh.s.n(r1, r2, r3, r5, r7, r8, r9, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r1 = r20
            r0 = r24
            r3 = r25
            r26 = r27
            r13 = r29
            r5 = r31
            r2 = r33
            r9 = r34
            r24 = r36
            r23 = r38
            r17 = r40
            r19 = r42
            goto L152
        L2e3:
            r0 = 0
            r1.p(r0)
            r15 = 1
            r1.p(r15)
            goto L2ef
        L2ec:
            r1.V()
        L2ef:
            i0.r1 r0 = r1.t()
            if (r0 == 0) goto L305
            i.b1 r1 = new i.b1
            r2 = 11
            r3 = r48
            r4 = r49
            r5 = r51
            r1.<init>(r3, r4, r5, r2)
            r0.f6035d = r1
            return
        L305:
            r3 = r48
            return
    }

    public void U(java.lang.String r29, java.lang.String r30, i0.h0 r31, int r32) {
            r28 = this;
            r2 = r29
            r3 = r30
            r7 = r31
            r0 = 1380225010(0x52448ff2, float:2.1105715E11)
            r7.b0(r0)
            boolean r0 = r7.f(r2)
            if (r0 == 0) goto L14
            r0 = 4
            goto L15
        L14:
            r0 = 2
        L15:
            r0 = r32 | r0
            boolean r4 = r7.f(r3)
            if (r4 == 0) goto L20
            r4 = 32
            goto L22
        L20:
            r4 = 16
        L22:
            r0 = r0 | r4
            r4 = r0 & 19
            r10 = 18
            r11 = 0
            r12 = 1
            if (r4 == r10) goto L2d
            r4 = r12
            goto L2e
        L2d:
            r4 = r11
        L2e:
            r0 = r0 & r12
            boolean r0 = r7.S(r0, r4)
            if (r0 == 0) goto L224
            java.lang.String r0 = "diff"
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}
            java.lang.Object r4 = r7.P()
            i0.e r13 = i0.l.f5952a
            if (r4 != r13) goto L4c
            wb.pp r4 = new wb.pp
            r5 = 2
            r4.<init>(r5)
            r7.k0(r4)
        L4c:
            fg.a r4 = (fg.a) r4
            r14 = 48
            java.lang.Object r0 = v0.k.c(r0, r4, r7, r14)
            i0.a1 r0 = (i0.a1) r0
            java.lang.Object r4 = r0.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L65
            r4 = 1119092736(0x42b40000, float:90.0)
            goto L66
        L65:
            r4 = 0
        L66:
            r5 = 250(0xfa, float:3.5E-43)
            r6 = 6
            r8 = 0
            i.l1 r5 = i.d.p(r5, r6, r8)
            r9 = r8
            r8 = 3120(0xc30, float:4.372E-42)
            r16 = r9
            r9 = 20
            r17 = r6
            java.lang.String r6 = "agentDiffArrow"
            r1 = r17
            i0.l2 r4 = i.f.a(r4, r5, r6, r7, r8, r9)
            y0.l r5 = y0.l.f21818a
            r6 = 1065353216(0x3f800000, float:1.0)
            y0.o r16 = p.h1.d(r5, r6)
            float r8 = (float) r1
            r20 = 0
            r21 = 13
            r17 = 0
            r19 = 0
            r18 = r8
            y0.o r8 = p.d.p(r16, r17, r18, r19, r20, r21)
            r9 = r18
            y0.o r8 = h.d0.a(r8)
            p.e r1 = p.j.f9926c
            y0.e r10 = y0.b.f21804s
            p.t r1 = p.s.a(r1, r10, r7, r11)
            long r10 = r7.T
            int r10 = java.lang.Long.hashCode(r10)
            s0.h r11 = r7.l()
            y0.o r8 = y0.a.c(r7, r8)
            x1.f r17 = x1.g.f20914f
            r17.getClass()
            x1.y r14 = x1.f.f20883b
            r7.d0()
            boolean r12 = r7.S
            if (r12 == 0) goto Lc4
            r7.k(r14)
            goto Lc7
        Lc4:
            r7.n0()
        Lc7:
            x1.e r12 = x1.f.f20886e
            i0.r.A(r12, r7, r1)
            x1.e r1 = x1.f.f20885d
            i0.r.A(r1, r7, r11)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            x1.e r11 = x1.f.f20887f
            i0.r.A(r11, r7, r10)
            x1.d r10 = x1.f.f20888g
            i0.r.w(r10, r7)
            x1.e r15 = x1.f.f20884c
            i0.r.A(r15, r7, r8)
            y0.o r6 = p.h1.d(r5, r6)
            v.d r8 = v.e.a(r9)
            y0.o r6 = c1.h.b(r6, r8)
            boolean r8 = r7.f(r0)
            java.lang.Object r2 = r7.P()
            if (r8 != 0) goto Lfc
            if (r2 != r13) goto L106
        Lfc:
            wb.jp r2 = new wb.jp
            r8 = 11
            r2.<init>(r0, r8)
            r7.k0(r2)
        L106:
            fg.a r2 = (fg.a) r2
            y0.o r2 = wb.ho.O6(r6, r2)
            r6 = 0
            r8 = 1
            y0.o r2 = p.d.n(r2, r6, r9, r8)
            y0.f r6 = y0.b.f21802q
            p.c r9 = p.j.f9924a
            r8 = 48
            p.e1 r6 = p.d1.a(r9, r6, r7, r8)
            long r8 = r7.T
            int r8 = java.lang.Long.hashCode(r8)
            s0.h r9 = r7.l()
            y0.o r2 = y0.a.c(r7, r2)
            r7.d0()
            r27 = r0
            boolean r0 = r7.S
            if (r0 == 0) goto L137
            r7.k(r14)
            goto L13a
        L137:
            r7.n0()
        L13a:
            i0.r.A(r12, r7, r6)
            i0.r.A(r1, r7, r9)
            j8.b.p(r8, r7, r11, r7, r10)
            i0.r.A(r15, r7, r2)
            m1.f r0 = wb.ap.f15081v
            java.lang.Object r1 = r27.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L157
            java.lang.String r1 = "收起代码变更"
            goto L159
        L157:
            java.lang.String r1 = "展开代码变更"
        L159:
            i0.m2 r2 = bi.d.f892a
            java.lang.Object r6 = r7.j(r2)
            bi.b r6 = (bi.b) r6
            long r8 = r6.h()
            f1.n r6 = new f1.n
            r10 = 5
            r6.<init>(r8, r10)
            r8 = 18
            float r8 = (float) r8
            y0.o r8 = p.h1.j(r5, r8)
            boolean r9 = r7.f(r4)
            java.lang.Object r10 = r7.P()
            if (r9 != 0) goto L17e
            if (r10 != r13) goto L188
        L17e:
            sh.y0 r10 = new sh.y0
            r9 = 12
            r10.<init>(r4, r9)
            r7.k0(r10)
        L188:
            fg.l r10 = (fg.l) r10
            y0.o r4 = f1.c0.m(r8, r10)
            r9 = 6
            r16 = r5
            r8 = r7
            r22 = 1
            r5 = r1
            r7 = r6
            r6 = r4
            r4 = r0
            k.n.c(r4, r5, r6, r7, r8, r9)
            r7 = r8
            java.lang.Object r0 = r7.j(r2)
            bi.b r0 = (bi.b) r0
            long r0 = r0.h()
            r2 = 13
            long r8 = x6.d.D(r2)
            m2.k r10 = m2.k.f8698j
            r2 = 7
            float r2 = (float) r2
            r20 = 0
            r21 = 14
            r18 = 0
            r19 = 0
            r17 = r2
            y0.o r5 = p.d.p(r16, r17, r18, r19, r20, r21)
            r25 = 0
            r26 = 262056(0x3ffa8, float:3.67219E-40)
            java.lang.String r4 = "代码变更"
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r2 = r22
            r22 = 0
            r24 = 1597494(0x186036, float:2.238566E-39)
            r23 = r7
            r6 = r0
            sh.s.n(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r7 = r23
            r7.p(r2)
            java.lang.Object r0 = r27.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r4 = r0.booleanValue()
            r0 = 180(0xb4, float:2.52E-43)
            r1 = 6
            r9 = 0
            i.l1 r0 = i.d.p(r0, r1, r9)
            r5 = 2
            h.r0 r6 = h.m0.a(r0, r5)
            r0 = 140(0x8c, float:1.96E-43)
            i.l1 r0 = i.d.p(r0, r1, r9)
            h.s0 r0 = h.m0.b(r0, r5)
            sh.d r1 = new sh.d
            r5 = 7
            r1.<init>(r3, r5)
            r5 = -1325570204(0xffffffffb0fd6764, float:-1.8437558E-9)
            s0.d r9 = s0.i.e(r5, r1, r7)
            r11 = 1600518(0x186c06, float:2.242803E-39)
            r5 = 0
            r8 = 0
            r10 = r7
            r7 = r0
            h.a0.b(r4, r5, r6, r7, r8, r9, r10, r11)
            r7 = r10
            r7.p(r2)
            goto L227
        L224:
            r7.V()
        L227:
            i0.r1 r6 = r7.t()
            if (r6 == 0) goto L23c
            wb.rj r0 = new wb.rj
            r5 = 18
            r1 = r28
            r2 = r29
            r4 = r32
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f6035d = r0
        L23c:
            return
    }

    public void V(java.lang.String r30, i0.h0 r31, int r32) {
            r29 = this;
            r0 = r30
            r1 = r31
            r2 = -1069973652(0xffffffffc0397f6c, float:-2.8984022)
            r1.b0(r2)
            boolean r2 = r1.f(r0)
            r3 = 2
            r4 = 4
            if (r2 == 0) goto L14
            r2 = r4
            goto L15
        L14:
            r2 = r3
        L15:
            r24 = r32 | r2
            r2 = r24 & 3
            r5 = 0
            r6 = 1
            if (r2 == r3) goto L1f
            r2 = r6
            goto L20
        L1f:
            r2 = r5
        L20:
            r3 = r24 & 1
            boolean r2 = r1.S(r3, r2)
            if (r2 == 0) goto L113
            r2 = 1065353216(0x3f800000, float:1.0)
            y0.l r3 = y0.l.f21818a
            y0.o r2 = p.h1.d(r3, r2)
            r7 = 16
            float r7 = (float) r7
            r8 = 12
            float r9 = (float) r8
            y0.o r2 = p.d.m(r2, r7, r9)
            p.e r7 = p.j.f9926c
            y0.e r9 = y0.b.f21804s
            p.t r5 = p.s.a(r7, r9, r1, r5)
            long r9 = r1.T
            int r7 = java.lang.Long.hashCode(r9)
            s0.h r9 = r1.l()
            y0.o r2 = y0.a.c(r1, r2)
            x1.f r10 = x1.g.f20914f
            r10.getClass()
            x1.y r10 = x1.f.f20883b
            r1.d0()
            boolean r11 = r1.S
            if (r11 == 0) goto L62
            r1.k(r10)
            goto L65
        L62:
            r1.n0()
        L65:
            x1.e r10 = x1.f.f20886e
            i0.r.A(r10, r1, r5)
            x1.e r5 = x1.f.f20885d
            i0.r.A(r5, r1, r9)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            x1.e r7 = x1.f.f20887f
            i0.r.A(r7, r1, r5)
            x1.d r5 = x1.f.f20888g
            i0.r.w(r5, r1)
            x1.e r5 = x1.f.f20884c
            i0.r.A(r5, r1, r2)
            i0.m2 r2 = bi.d.f892a
            java.lang.Object r5 = r1.j(r2)
            bi.b r5 = (bi.b) r5
            long r9 = r5.g()
            m2.k r7 = m2.k.f8698j
            r22 = 0
            r23 = 262074(0x3ffba, float:3.67244E-40)
            java.lang.String r1 = "实际请求地址"
            r5 = r2
            r2 = 0
            r11 = r5
            r12 = r6
            r5 = 0
            r13 = r8
            r8 = 0
            r15 = r3
            r14 = r4
            r3 = r9
            r9 = 0
            r16 = r11
            r11 = 0
            r18 = r12
            r17 = r13
            r12 = 0
            r19 = r14
            r14 = 0
            r20 = r15
            r15 = 0
            r21 = r16
            r16 = 0
            r25 = r17
            r17 = 0
            r26 = r18
            r18 = 0
            r27 = r19
            r19 = 0
            r28 = r21
            r21 = 1572870(0x180006, float:2.20406E-39)
            r26 = r20
            r0 = r28
            r20 = r31
            sh.s.n(r1, r2, r3, r5, r7, r8, r9, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r1 = r20
            java.lang.Object r0 = r1.j(r0)
            bi.b r0 = (bi.b) r0
            long r2 = r0.h()
            long r4 = x6.d.D(r25)
            r14 = 4
            float r9 = (float) r14
            r11 = 0
            r12 = 13
            r8 = 0
            r10 = 0
            r7 = r26
            y0.o r0 = p.d.p(r7, r8, r9, r10, r11, r12)
            r6 = r24 & 14
            r6 = r6 | 24624(0x6030, float:3.4506E-41)
            r21 = 0
            r22 = 262120(0x3ffe8, float:3.67308E-40)
            r20 = r6
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r17 = 0
            r19 = r1
            r1 = r0
            r0 = r30
            sh.s.n(r0, r1, r2, r4, r6, r7, r8, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r1 = r19
            r12 = 1
            r1.p(r12)
            goto L116
        L113:
            r1.V()
        L116:
            i0.r1 r1 = r1.t()
            if (r1 == 0) goto L12a
            wb.zi r2 = new wb.zi
            r3 = 8
            r4 = r29
            r5 = r32
            r2.<init>(r4, r0, r5, r3)
            r1.f6035d = r2
            return
        L12a:
            r4 = r29
            return
    }

    public void W(int r34, int r35, fg.a r36, i0.h0 r37, java.lang.String r38, m1.f r39, boolean r40, boolean r41) {
            r33 = this;
            r7 = r34
            r4 = r37
            r0 = -1395211409(0xffffffffacd6c36f, float:-6.1039433E-12)
            r4.b0(r0)
            r0 = r7 & 6
            if (r0 != 0) goto L1b
            r0 = r39
            boolean r1 = r4.f(r0)
            if (r1 == 0) goto L18
            r1 = 4
            goto L19
        L18:
            r1 = 2
        L19:
            r1 = r1 | r7
            goto L1e
        L1b:
            r0 = r39
            r1 = r7
        L1e:
            r2 = r7 & 48
            if (r2 != 0) goto L2e
            boolean r2 = r37.f(r38)
            if (r2 == 0) goto L2b
            r2 = 32
            goto L2d
        L2b:
            r2 = 16
        L2d:
            r1 = r1 | r2
        L2e:
            r2 = r35 & 4
            if (r2 == 0) goto L37
            r1 = r1 | 384(0x180, float:5.38E-43)
        L34:
            r3 = r40
            goto L49
        L37:
            r3 = r7 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L34
            r3 = r40
            boolean r5 = r4.g(r3)
            if (r5 == 0) goto L46
            r5 = 256(0x100, float:3.59E-43)
            goto L48
        L46:
            r5 = 128(0x80, float:1.8E-43)
        L48:
            r1 = r1 | r5
        L49:
            r5 = r35 & 8
            if (r5 == 0) goto L54
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            r6 = r41
        L51:
            r12 = r36
            goto L63
        L54:
            r6 = r41
            boolean r8 = r4.g(r6)
            if (r8 == 0) goto L5f
            r8 = 2048(0x800, float:2.87E-42)
            goto L61
        L5f:
            r8 = 1024(0x400, float:1.435E-42)
        L61:
            r1 = r1 | r8
            goto L51
        L63:
            boolean r8 = r4.h(r12)
            if (r8 == 0) goto L6c
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L6e
        L6c:
            r8 = 8192(0x2000, float:1.148E-41)
        L6e:
            r14 = r1 | r8
            r1 = r14 & 9363(0x2493, float:1.312E-41)
            r8 = 9362(0x2492, float:1.3119E-41)
            r15 = 1
            r9 = 0
            if (r1 == r8) goto L7a
            r1 = r15
            goto L7b
        L7a:
            r1 = r9
        L7b:
            r8 = r14 & 1
            boolean r1 = r4.S(r8, r1)
            if (r1 == 0) goto L1e9
            if (r2 == 0) goto L88
            r31 = r9
            goto L8a
        L88:
            r31 = r3
        L8a:
            if (r5 == 0) goto L8d
            r6 = r15
        L8d:
            r1 = 4292423717(0xffd93025, double:2.120739096E-314)
            if (r6 != 0) goto Lb1
            r3 = -768359102(0xffffffffd233c542, float:-1.9302715E11)
            r4.a0(r3)
            i0.m2 r3 = bi.d.f892a
            java.lang.Object r3 = r4.j(r3)
            bi.b r3 = (bi.b) r3
            long r10 = r3.h()
            r3 = 1055286886(0x3ee66666, float:0.45)
            long r10 = f1.w.b(r10, r3)
            r4.p(r9)
            goto Ld6
        Lb1:
            if (r31 == 0) goto Lc1
            r3 = -768357728(0xffffffffd233caa0, float:-1.9304966E11)
            r4.a0(r3)
            r4.p(r9)
            long r10 = f1.c0.d(r1)
            goto Ld6
        Lc1:
            r3 = -768355912(0xffffffffd233d1b8, float:-1.9307941E11)
            r4.a0(r3)
            i0.m2 r3 = bi.d.f892a
            java.lang.Object r3 = r4.j(r3)
            bi.b r3 = (bi.b) r3
            long r10 = r3.g()
            r4.p(r9)
        Ld6:
            r3 = 1065353216(0x3f800000, float:1.0)
            y0.l r5 = y0.l.f21818a
            y0.o r3 = p.h1.d(r5, r3)
            r8 = 3
            float r13 = (float) r8
            r40 = r1
            r1 = 0
            y0.o r1 = p.d.n(r3, r1, r13, r15)
            r2 = 8
            float r2 = (float) r2
            v.d r2 = v.e.a(r2)
            y0.o r1 = c1.h.b(r1, r2)
            if (r31 == 0) goto L109
            r2 = -768349086(0xffffffffd233ec62, float:-1.9319125E11)
            r4.a0(r2)
            r4.p(r9)
            long r2 = f1.c0.d(r40)
            r9 = 1034147594(0x3da3d70a, float:0.08)
            long r2 = f1.w.b(r2, r9)
            goto L11e
        L109:
            r2 = -768347041(0xffffffffd233f45f, float:-1.9322475E11)
            r4.a0(r2)
            i0.m2 r2 = bi.d.f892a
            java.lang.Object r2 = r4.j(r2)
            bi.b r2 = (bi.b) r2
            long r2 = r2.k()
            r4.p(r9)
        L11e:
            f1.m0 r9 = f1.c0.f3038b
            y0.o r1 = k.n.g(r1, r2, r9)
            r2 = r10
            r11 = 0
            r13 = 14
            r10 = 0
            r9 = r6
            r6 = r8
            r8 = r1
            r1 = r2
            y0.o r3 = k.n.j(r8, r9, r10, r11, r12, r13)
            r32 = r9
            r8 = 18
            float r8 = (float) r8
            r9 = 14
            float r10 = (float) r9
            y0.o r3 = p.d.m(r3, r8, r10)
            y0.f r10 = y0.b.f21802q
            p.c r11 = p.j.f9924a
            r12 = 48
            p.e1 r10 = p.d1.a(r11, r10, r4, r12)
            long r11 = r4.T
            int r11 = java.lang.Long.hashCode(r11)
            s0.h r12 = r4.l()
            y0.o r3 = y0.a.c(r4, r3)
            x1.f r13 = x1.g.f20914f
            r13.getClass()
            x1.y r13 = x1.f.f20883b
            r4.d0()
            r40 = r6
            boolean r6 = r4.S
            if (r6 == 0) goto L169
            r4.k(r13)
            goto L16c
        L169:
            r4.n0()
        L16c:
            x1.e r6 = x1.f.f20886e
            i0.r.A(r6, r4, r10)
            x1.e r6 = x1.f.f20885d
            i0.r.A(r6, r4, r12)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            x1.e r10 = x1.f.f20887f
            i0.r.A(r10, r4, r6)
            x1.d r6 = x1.f.f20888g
            i0.r.w(r6, r4)
            x1.e r6 = x1.f.f20884c
            i0.r.A(r6, r4, r3)
            f1.n r3 = new f1.n
            r6 = 5
            r3.<init>(r1, r6)
            r6 = 22
            float r6 = (float) r6
            y0.o r6 = p.h1.j(r5, r6)
            r10 = r14 & 14
            r10 = r10 | 432(0x1b0, float:6.05E-43)
            r11 = r1
            r1 = 0
            r16 = r5
            r2 = r6
            r5 = r10
            r10 = r11
            k.n.c(r0, r1, r2, r3, r4, r5)
            r0 = 15
            long r12 = x6.d.D(r0)
            r20 = 0
            r21 = 14
            r18 = 0
            r19 = 0
            r17 = r8
            y0.o r0 = p.d.p(r16, r17, r18, r19, r20, r21)
            int r1 = r14 >> 3
            r1 = r1 & r9
            r1 = r1 | 24624(0x6030, float:3.4506E-41)
            r29 = 0
            r30 = 262120(0x3ffe8, float:3.67308E-40)
            r14 = 0
            r2 = r15
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = r37
            r8 = r38
            r9 = r0
            r28 = r1
            sh.s.n(r8, r9, r10, r12, r14, r15, r16, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r4 = r27
            r4.p(r2)
            r5 = r32
            goto L1ef
        L1e9:
            r4.V()
            r31 = r3
            r5 = r6
        L1ef:
            i0.r1 r9 = r4.t()
            if (r9 == 0) goto L208
            wb.wr r0 = new wb.wr
            r1 = r33
            r8 = r35
            r6 = r36
            r3 = r38
            r2 = r39
            r4 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f6035d = r0
        L208:
            return
    }

    public void X(java.util.List r54, java.lang.String r55, java.util.LinkedHashSet r56, fg.a r57, fg.l r58, fg.p r59, fg.l r60, fg.p r61, fg.p r62, fg.l r63, fg.a r64, i0.h0 r65, int r66) {
            r53 = this;
            r2 = r54
            r11 = r63
            r6 = r65
            r0 = 255849099(0xf3ff28b, float:9.463739E-30)
            r6.b0(r0)
            boolean r0 = r6.f(r2)
            r1 = 2
            if (r0 == 0) goto L15
            r0 = 4
            goto L16
        L15:
            r0 = r1
        L16:
            r0 = r66 | r0
            r8 = r55
            boolean r3 = r6.f(r8)
            if (r3 == 0) goto L23
            r3 = 32
            goto L25
        L23:
            r3 = 16
        L25:
            r0 = r0 | r3
            r10 = r56
            boolean r3 = r6.f(r10)
            if (r3 == 0) goto L31
            r3 = 256(0x100, float:3.59E-43)
            goto L33
        L31:
            r3 = 128(0x80, float:1.8E-43)
        L33:
            r0 = r0 | r3
            r13 = r57
            boolean r3 = r6.h(r13)
            if (r3 == 0) goto L3f
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L41
        L3f:
            r3 = 8192(0x2000, float:1.148E-41)
        L41:
            r0 = r0 | r3
            r14 = r58
            boolean r3 = r6.h(r14)
            if (r3 == 0) goto L4d
            r3 = 131072(0x20000, float:1.83671E-40)
            goto L4f
        L4d:
            r3 = 65536(0x10000, float:9.1835E-41)
        L4f:
            r0 = r0 | r3
            r3 = r59
            boolean r4 = r6.h(r3)
            if (r4 == 0) goto L5b
            r4 = 1048576(0x100000, float:1.469368E-39)
            goto L5d
        L5b:
            r4 = 524288(0x80000, float:7.34684E-40)
        L5d:
            r0 = r0 | r4
            r4 = r60
            boolean r5 = r6.h(r4)
            if (r5 == 0) goto L69
            r5 = 8388608(0x800000, float:1.1754944E-38)
            goto L6b
        L69:
            r5 = 4194304(0x400000, float:5.877472E-39)
        L6b:
            r0 = r0 | r5
            r5 = r61
            boolean r16 = r6.h(r5)
            if (r16 == 0) goto L77
            r16 = 67108864(0x4000000, float:1.5046328E-36)
            goto L79
        L77:
            r16 = 33554432(0x2000000, float:9.403955E-38)
        L79:
            r0 = r0 | r16
            r9 = r62
            boolean r16 = r6.h(r9)
            if (r16 == 0) goto L86
            r16 = 536870912(0x20000000, float:1.0842022E-19)
            goto L88
        L86:
            r16 = 268435456(0x10000000, float:2.524355E-29)
        L88:
            r0 = r0 | r16
            boolean r16 = r6.h(r11)
            if (r16 == 0) goto L91
            r1 = 4
        L91:
            r16 = 432(0x1b0, float:6.05E-43)
            r1 = r16 | r1
            r16 = 306783379(0x12492493, float:6.34695E-28)
            r12 = r0 & r16
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            r14 = 18
            if (r12 != r15) goto La8
            r1 = r1 & 19
            if (r1 == r14) goto La6
            goto La8
        La6:
            r1 = 0
            goto La9
        La8:
            r1 = 1
        La9:
            r12 = r0 & 1
            boolean r1 = r6.S(r12, r1)
            if (r1 == 0) goto L795
            i0.m2 r1 = y1.i0.f21966b
            java.lang.Object r1 = r6.j(r1)
            r12 = r1
            android.content.Context r12 = (android.content.Context) r12
            boolean r1 = r6.f(r12)
            java.lang.Object r15 = r6.P()
            i0.e r14 = i0.l.f5952a
            if (r1 != 0) goto Lc8
            if (r15 != r14) goto Ld1
        Lc8:
            java.lang.String r1 = "Hchat_miuix_ui"
            android.content.SharedPreferences r15 = ub.b.c(r12, r1)
            r6.k0(r15)
        Ld1:
            android.content.SharedPreferences r15 = (android.content.SharedPreferences) r15
            java.lang.Object r1 = r6.P()
            r17 = 0
            if (r1 != r14) goto Le2
            i0.j1 r1 = i0.r.u(r17)
            r6.k0(r1)
        Le2:
            r20 = r1
            i0.a1 r20 = (i0.a1) r20
            java.lang.Object r1 = r6.P()
            if (r1 != r14) goto Lf3
            i0.j1 r1 = i0.r.u(r17)
            r6.k0(r1)
        Lf3:
            i0.a1 r1 = (i0.a1) r1
            java.lang.Object r7 = r6.P()
            if (r7 != r14) goto L102
            i0.j1 r7 = i0.r.u(r17)
            r6.k0(r7)
        L102:
            i0.a1 r7 = (i0.a1) r7
            java.lang.Object r4 = r6.P()
            if (r4 != r14) goto L111
            i0.j1 r4 = i0.r.u(r17)
            r6.k0(r4)
        L111:
            r19 = r4
            i0.a1 r19 = (i0.a1) r19
            java.lang.Object r4 = r6.P()
            if (r4 != r14) goto L124
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            i0.j1 r4 = i0.r.u(r4)
            r6.k0(r4)
        L124:
            r35 = r4
            i0.a1 r35 = (i0.a1) r35
            java.lang.Object r4 = r6.P()
            if (r4 != r14) goto L135
            i0.j1 r4 = i0.r.u(r2)
            r6.k0(r4)
        L135:
            r26 = r4
            i0.a1 r26 = (i0.a1) r26
            java.lang.Object r4 = r6.P()
            if (r4 != r14) goto L149
            java.lang.String r4 = "agent_history_gesture_hint"
            r21 = r0
            r0 = 1
            i0.j1 r4 = wb.en.e(r15, r4, r0, r6)
            goto L14c
        L149:
            r21 = r0
            r0 = 1
        L14c:
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r0 = r6.P()
            if (r0 != r14) goto L15d
            java.lang.String r0 = ""
            i0.j1 r0 = i0.r.u(r0)
            r6.k0(r0)
        L15d:
            r25 = r0
            i0.a1 r25 = (i0.a1) r25
            java.lang.Object r0 = r20.getValue()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L196
            java.lang.Object r27 = r26.getValue()
            java.util.List r27 = (java.util.List) r27
            java.util.Iterator r27 = r27.iterator()
        L173:
            boolean r28 = r27.hasNext()
            if (r28 == 0) goto L18f
            java.lang.Object r28 = r27.next()
            r29 = r1
            r1 = r28
            fb.d1 r1 = (fb.d1) r1
            java.lang.String r1 = r1.f3483a
            boolean r1 = gg.l.a(r1, r0)
            if (r1 == 0) goto L18c
            goto L193
        L18c:
            r1 = r29
            goto L173
        L18f:
            r29 = r1
            r28 = r17
        L193:
            fb.d1 r28 = (fb.d1) r28
            goto L19a
        L196:
            r29 = r1
            r28 = r17
        L19a:
            java.lang.Object r0 = r29.getValue()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L1cd
            java.lang.Object r1 = r26.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r1 = r1.iterator()
        L1ac:
            boolean r27 = r1.hasNext()
            if (r27 == 0) goto L1c8
            java.lang.Object r27 = r1.next()
            r30 = r1
            r1 = r27
            fb.d1 r1 = (fb.d1) r1
            java.lang.String r1 = r1.f3483a
            boolean r1 = gg.l.a(r1, r0)
            if (r1 == 0) goto L1c5
            goto L1ca
        L1c5:
            r1 = r30
            goto L1ac
        L1c8:
            r27 = r17
        L1ca:
            fb.d1 r27 = (fb.d1) r27
            goto L1cf
        L1cd:
            r27 = r17
        L1cf:
            java.lang.Object r0 = r7.getValue()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L202
            java.lang.Object r1 = r26.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.Iterator r1 = r1.iterator()
        L1e1:
            boolean r30 = r1.hasNext()
            if (r30 == 0) goto L1fd
            java.lang.Object r30 = r1.next()
            r31 = r1
            r1 = r30
            fb.d1 r1 = (fb.d1) r1
            java.lang.String r1 = r1.f3483a
            boolean r1 = gg.l.a(r1, r0)
            if (r1 == 0) goto L1fa
            goto L1ff
        L1fa:
            r1 = r31
            goto L1e1
        L1fd:
            r30 = r17
        L1ff:
            fb.d1 r30 = (fb.d1) r30
            goto L204
        L202:
            r30 = r17
        L204:
            r0 = r21 & 14
            r1 = 4
            if (r0 == r1) goto L20b
            r0 = 0
            goto L20c
        L20b:
            r0 = 1
        L20c:
            java.lang.Object r1 = r6.P()
            if (r0 != 0) goto L228
            if (r1 != r14) goto L215
            goto L228
        L215:
            r0 = r1
            r1 = r2
            r38 = r4
            r42 = r19
            r37 = r20
            r36 = r21
            r3 = r26
            r39 = r28
            r8 = r29
            r40 = r30
            goto L246
        L228:
            wb.d2 r0 = new wb.d2
            r5 = 2
            r1 = r2
            r38 = r4
            r4 = r17
            r2 = r19
            r37 = r20
            r36 = r21
            r3 = r26
            r39 = r28
            r8 = r29
            r40 = r30
            r0.<init>(r1, r2, r3, r4, r5)
            r42 = r2
            r6.k0(r0)
        L246:
            fg.p r0 = (fg.p) r0
            i0.r.f(r0, r6, r1)
            if (r27 == 0) goto L2be
            r0 = -1564249087(0xffffffffa2c37401, float:-5.297768E-18)
            r6.a0(r0)
            java.lang.Object r0 = r6.P()
            if (r0 != r14) goto L262
            wb.jp r0 = new wb.jp
            r2 = 7
            r0.<init>(r8, r2)
            r6.k0(r0)
        L262:
            fg.a r0 = (fg.a) r0
            c9.q0 r16 = new c9.q0
            r21 = 25
            r18 = r59
            r20 = r8
            r17 = r25
            r19 = r27
            r16.<init>(r17, r18, r19, r20, r21)
            r4 = r16
            r2 = r17
            r5 = -1646301391(0xffffffff9ddf6f31, float:-5.9142578E-21)
            s0.d r27 = s0.i.e(r5, r4, r6)
            r29 = 100663686(0x6000186, float:2.4075244E-35)
            r30 = 3072(0xc00, float:4.305E-42)
            r17 = r12
            r12 = 0
            java.lang.String r13 = "编辑标题"
            r5 = r14
            r4 = r15
            r14 = 0
            r18 = r17
            r16 = 0
            r20 = r18
            r18 = 0
            r21 = r20
            r20 = 0
            r25 = 131072(0x20000, float:1.83671E-40)
            r26 = 256(0x100, float:3.59E-43)
            r22 = 0
            r31 = r25
            r28 = 18
            r24 = 0
            r32 = r26
            r26 = 0
            r1 = r21
            r21 = r0
            r0 = r28
            r28 = r6
            r6 = r1
            r1 = r5
            r5 = r31
            oh.h.d(r12, r13, r14, r16, r18, r20, r21, r22, r24, r26, r27, r28, r29, r30)
            r12 = r28
            r13 = 0
            r12.p(r13)
            goto L2d3
        L2be:
            r0 = r12
            r12 = r6
            r6 = r0
            r1 = r14
            r4 = r15
            r2 = r25
            r0 = 18
            r5 = 131072(0x20000, float:1.83671E-40)
            r13 = 0
            r14 = -1562751849(0xffffffffa2da4c97, float:-5.917011E-18)
            r12.a0(r14)
            r12.p(r13)
        L2d3:
            r14 = 8
            r15 = r40
            if (r15 == 0) goto L32f
            r5 = -1562675589(0xffffffffa2db767b, float:-5.9485515E-18)
            r12.a0(r5)
            java.lang.Object r5 = r12.P()
            if (r5 != r1) goto L2ed
            wb.jp r5 = new wb.jp
            r5.<init>(r7, r14)
            r12.k0(r5)
        L2ed:
            r21 = r5
            fg.a r21 = (fg.a) r21
            wb.rj r5 = new wb.rj
            r13 = 17
            r5.<init>(r15, r11, r7, r13)
            r13 = 853428762(0x32de4a1a, float:2.5877899E-8)
            s0.d r27 = s0.i.e(r13, r5, r12)
            r29 = 100663686(0x6000186, float:2.4075244E-35)
            r30 = 3072(0xc00, float:4.305E-42)
            r12 = 0
            java.lang.String r13 = "删除对话"
            r5 = r14
            r14 = 0
            r18 = 0
            r16 = 0
            r20 = r18
            r18 = 0
            r22 = r20
            r20 = 0
            r24 = r22
            r22 = 0
            r26 = r24
            r24 = 0
            r28 = r26
            r26 = 0
            r5 = r28
            r28 = r65
            oh.h.d(r12, r13, r14, r16, r18, r20, r21, r22, r24, r26, r27, r28, r29, r30)
            r12 = r28
            r12.p(r5)
            goto L339
        L32f:
            r5 = r13
            r13 = -1561295593(0xffffffffa2f08517, float:-6.5193045E-18)
            r12.a0(r13)
            r12.p(r5)
        L339:
            r14 = r39
            if (r14 == 0) goto L41e
            boolean r15 = r14.f3494l
            r0 = -1561156465(0xffffffffa2f2a48f, float:-6.5768465E-18)
            r12.a0(r0)
            java.lang.Object r0 = r3.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
            r16 = r5
        L351:
            boolean r17 = r0.hasNext()
            if (r17 == 0) goto L370
            java.lang.Object r17 = r0.next()
            r5 = r17
            fb.d1 r5 = (fb.d1) r5
            java.lang.String r5 = r5.f3483a
            java.lang.String r13 = r14.f3483a
            boolean r5 = gg.l.a(r5, r13)
            if (r5 == 0) goto L36c
        L369:
            r0 = r16
            goto L373
        L36c:
            int r16 = r16 + 1
            r5 = 0
            goto L351
        L370:
            r16 = -1
            goto L369
        L373:
            if (r0 <= 0) goto L38a
            java.lang.Object r5 = r3.getValue()
            java.util.List r5 = (java.util.List) r5
            int r13 = r0 + (-1)
            java.lang.Object r5 = r5.get(r13)
            fb.d1 r5 = (fb.d1) r5
            boolean r5 = r5.f3494l
            if (r5 != r15) goto L38a
            r18 = 1
            goto L38c
        L38a:
            r18 = 0
        L38c:
            if (r0 < 0) goto L3b1
            java.lang.Object r5 = r3.getValue()
            java.util.List r5 = (java.util.List) r5
            int r5 = a.a.b0(r5)
            if (r0 >= r5) goto L3b1
            java.lang.Object r5 = r3.getValue()
            java.util.List r5 = (java.util.List) r5
            r41 = 1
            int r0 = r0 + 1
            java.lang.Object r0 = r5.get(r0)
            fb.d1 r0 = (fb.d1) r0
            boolean r0 = r0.f3494l
            if (r0 != r15) goto L3b3
            r20 = r41
            goto L3b5
        L3b1:
            r41 = 1
        L3b3:
            r20 = 0
        L3b5:
            java.lang.Object r0 = r12.P()
            if (r0 != r1) goto L3c8
            wb.jp r0 = new wb.jp
            r5 = r37
            r13 = 12
            r0.<init>(r5, r13)
            r12.k0(r0)
            goto L3cc
        L3c8:
            r5 = r37
            r13 = 12
        L3cc:
            fg.a r0 = (fg.a) r0
            wb.cs r16 = new wb.cs
            r19 = r60
            r21 = r61
            r23 = r2
            r26 = r3
            r25 = r5
            r27 = r7
            r24 = r8
            r22 = r9
            r17 = r14
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r2 = r16
            r43 = r23
            r37 = r25
            r9 = r26
            r3 = 1446917433(0x563e3539, float:5.228395E13)
            s0.d r27 = s0.i.e(r3, r2, r12)
            r29 = 100663686(0x6000186, float:2.4075244E-35)
            r30 = 3072(0xc00, float:4.305E-42)
            r12 = 0
            r28 = r13
            java.lang.String r13 = "对话历史"
            r14 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r21 = r0
            r0 = r41
            r41 = r28
            r28 = r65
            oh.h.d(r12, r13, r14, r16, r18, r20, r21, r22, r24, r26, r27, r28, r29, r30)
            r12 = r28
            r5 = 0
            r12.p(r5)
            goto L42d
        L41e:
            r43 = r2
            r9 = r3
            r0 = 1
            r41 = 12
            r2 = -1557827561(0xffffffffa3257017, float:-8.968404E-18)
            r12.a0(r2)
            r12.p(r5)
        L42d:
            p.a0 r2 = p.h1.f9915c
            y0.g r3 = y0.b.f21792g
            v1.n0 r3 = p.o.d(r3, r5)
            long r13 = r12.T
            int r5 = java.lang.Long.hashCode(r13)
            s0.h r13 = r12.l()
            y0.o r14 = y0.a.c(r12, r2)
            x1.f r15 = x1.g.f20914f
            r15.getClass()
            x1.y r15 = x1.f.f20883b
            r12.d0()
            boolean r0 = r12.S
            if (r0 == 0) goto L455
            r12.k(r15)
            goto L458
        L455:
            r12.n0()
        L458:
            x1.e r0 = x1.f.f20886e
            i0.r.A(r0, r12, r3)
            x1.e r3 = x1.f.f20885d
            i0.r.A(r3, r12, r13)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            x1.e r13 = x1.f.f20887f
            i0.r.A(r13, r12, r5)
            x1.d r5 = x1.f.f20888g
            i0.r.w(r5, r12)
            r45 = r7
            x1.e r7 = x1.f.f20884c
            i0.r.A(r7, r12, r14)
            r46 = r8
            r47 = r9
            long r8 = f1.w.f3126b
            r14 = 1049582633(0x3e8f5c29, float:0.28)
            long r8 = f1.w.b(r8, r14)
            f1.m0 r14 = f1.c0.f3038b
            y0.o r8 = k.n.g(r2, r8, r14)
            r9 = r64
            y0.o r8 = wb.ho.O6(r8, r9)
            r48 = r2
            r2 = 0
            p.o.a(r8, r12, r2)
            r2 = 1062668861(0x3f570a3d, float:0.84)
            y0.l r8 = y0.l.f21818a
            y0.o r2 = p.h1.d(r8, r2)
            p.a0 r9 = p.h1.f9914b
            y0.o r2 = r2.d(r9)
            i0.m2 r9 = bi.d.f892a
            java.lang.Object r16 = r12.j(r9)
            bi.b r16 = (bi.b) r16
            long r10 = r16.a()
            y0.o r16 = k.n.g(r2, r10, r14)
            java.util.WeakHashMap r2 = p.s1.f9986v
            p.s1 r2 = p.c.e(r12)
            p.b r2 = r2.f9992f
            p.j0 r2 = p.d.d(r2, r12)
            float r18 = r2.c()
            r20 = 0
            r21 = 13
            r17 = 0
            r19 = 0
            y0.o r2 = p.d.p(r16, r17, r18, r19, r20, r21)
            p.e r10 = p.j.f9926c
            y0.e r11 = y0.b.f21804s
            r14 = 0
            p.t r10 = p.s.a(r10, r11, r12, r14)
            r11 = r15
            long r14 = r12.T
            int r14 = java.lang.Long.hashCode(r14)
            s0.h r15 = r12.l()
            y0.o r2 = y0.a.c(r12, r2)
            r12.d0()
            r17 = r11
            boolean r11 = r12.S
            if (r11 == 0) goto L4f8
            r11 = r17
            r12.k(r11)
            goto L4fd
        L4f8:
            r11 = r17
            r12.n0()
        L4fd:
            i0.r.A(r0, r12, r10)
            i0.r.A(r3, r12, r15)
            j8.b.p(r14, r12, r13, r12, r5)
            i0.r.A(r7, r12, r2)
            r2 = 1065353216(0x3f800000, float:1.0)
            y0.o r10 = p.h1.d(r8, r2)
            r14 = 18
            float r14 = (float) r14
            r15 = 14
            float r15 = (float) r15
            y0.o r10 = p.d.m(r10, r14, r15)
            y0.f r2 = y0.b.f21802q
            r49 = r6
            p.c r6 = p.j.f9924a
            r50 = r1
            r1 = 48
            r17 = r14
            p.e1 r14 = p.d1.a(r6, r2, r12, r1)
            r51 = r2
            long r1 = r12.T
            int r1 = java.lang.Long.hashCode(r1)
            s0.h r2 = r12.l()
            y0.o r10 = y0.a.c(r12, r10)
            r12.d0()
            r18 = r15
            boolean r15 = r12.S
            if (r15 == 0) goto L546
            r12.k(r11)
            goto L549
        L546:
            r12.n0()
        L549:
            i0.r.A(r0, r12, r14)
            i0.r.A(r3, r12, r2)
            j8.b.p(r1, r12, r13, r12, r5)
            i0.r.A(r7, r12, r10)
            java.lang.Object r1 = r12.j(r9)
            bi.b r1 = (bi.b) r1
            long r14 = r1.g()
            r1 = 22
            long r1 = x6.d.D(r1)
            r10 = r18
            m2.k r18 = m2.k.f8698j
            r19 = r1
            r21 = r10
            r2 = r11
            r1 = 1065353216(0x3f800000, float:1.0)
            double r10 = (double) r1
            r22 = 0
            int r10 = (r10 > r22 ? 1 : (r10 == r22 ? 0 : -1))
            if (r10 <= 0) goto L579
        L577:
            r10 = r13
            goto L57f
        L579:
            java.lang.String r10 = "invalid weight; must be greater than zero"
            q.a.a(r10)
            goto L577
        L57f:
            p.q0 r13 = new p.q0
            r11 = 1
            r13.<init>(r1, r11)
            r33 = 0
            r34 = 262056(0x3ffa8, float:3.67219E-40)
            java.lang.String r12 = "对话历史"
            r1 = r17
            r16 = r19
            r20 = 0
            r19 = 0
            r22 = r20
            r11 = r21
            r20 = 0
            r24 = r22
            r22 = 0
            r26 = r24
            r23 = 0
            r25 = 0
            r28 = r26
            r26 = 0
            r27 = 0
            r29 = r28
            r28 = 0
            r30 = r29
            r29 = 0
            r31 = r30
            r30 = 0
            r32 = 1597446(0x186006, float:2.238499E-39)
            r52 = r11
            r11 = r2
            r2 = r52
            r52 = r31
            r31 = r65
            sh.s.n(r12, r13, r14, r16, r18, r19, r20, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            sh.q1 r19 = sh.c.a(r65)
            r22 = 54
            r23 = 1916(0x77c, float:2.685E-42)
            java.lang.String r12 = "关闭"
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r13 = r64
            r21 = r65
            sh.s.o(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r12 = r21
            r13 = 1
            r12.p(r13)
            r14 = 1065353216(0x3f800000, float:1.0)
            y0.o r15 = p.h1.d(r8, r14)
            r14 = 4
            float r14 = (float) r14
            y0.o r14 = p.d.m(r15, r2, r14)
            sh.q1 r19 = sh.c.a(r12)
            int r2 = r36 >> 9
            r2 = r2 & 112(0x70, float:1.57E-43)
            r2 = r2 | 3462(0xd86, float:4.851E-42)
            r23 = 1904(0x770, float:2.668E-42)
            java.lang.String r12 = "+  新建对话"
            r15 = 1
            r22 = r2
            r44 = r13
            r13 = r57
            sh.s.o(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r12 = r21
            java.lang.Object r2 = r38.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L6fe
            r2 = 2006845605(0x779e08a5, float:6.410611E33)
            r12.a0(r2)
            r14 = 1065353216(0x3f800000, float:1.0)
            y0.o r2 = p.h1.d(r8, r14)
            boolean r13 = r12.h(r4)
            java.lang.Object r14 = r12.P()
            r15 = 9
            if (r13 != 0) goto L638
            r13 = r50
            if (r14 != r13) goto L635
            goto L63a
        L635:
            r50 = r13
            goto L646
        L638:
            r13 = r50
        L63a:
            wb.od r14 = new wb.od
            r50 = r13
            r13 = r38
            r14.<init>(r4, r13, r15)
            r12.k0(r14)
        L646:
            fg.a r14 = (fg.a) r14
            y0.o r2 = wb.ho.O6(r2, r14)
            r4 = 10
            float r4 = (float) r4
            y0.o r2 = p.d.m(r2, r1, r4)
            r4 = r51
            r13 = 48
            p.e1 r4 = p.d1.a(r6, r4, r12, r13)
            long r13 = r12.T
            int r6 = java.lang.Long.hashCode(r13)
            s0.h r13 = r12.l()
            y0.o r2 = y0.a.c(r12, r2)
            r12.d0()
            boolean r14 = r12.S
            if (r14 == 0) goto L674
            r12.k(r11)
            goto L677
        L674:
            r12.n0()
        L677:
            i0.r.A(r0, r12, r4)
            i0.r.A(r3, r12, r13)
            j8.b.p(r6, r12, r10, r12, r5)
            i0.r.A(r7, r12, r2)
            m1.f r0 = wb.ap.A
            java.lang.Object r2 = r12.j(r9)
            bi.b r2 = (bi.b) r2
            long r2 = r2.h()
            f1.n r4 = new f1.n
            r5 = 5
            r4.<init>(r2, r5)
            y0.o r2 = p.h1.j(r8, r1)
            r1 = 0
            r5 = 438(0x1b6, float:6.14E-43)
            r3 = r4
            r4 = r12
            r6 = r36
            r11 = r50
            r39 = r52
            r7 = 131072(0x20000, float:1.83671E-40)
            r10 = 8
            k.n.c(r0, r1, r2, r3, r4, r5)
            java.lang.Object r0 = r12.j(r9)
            bi.b r0 = (bi.b) r0
            long r0 = r0.h()
            long r2 = x6.d.D(r41)
            float r4 = (float) r15
            r20 = 0
            r21 = 14
            r18 = 0
            r19 = 0
            r17 = r4
            r16 = r8
            y0.o r13 = p.d.p(r16, r17, r18, r19, r20, r21)
            r33 = 0
            r34 = 262120(0x3ffe8, float:3.67308E-40)
            java.lang.String r12 = "左右滑动可编辑或删除（点击不再显示）"
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r32 = 24630(0x6036, float:3.4514E-41)
            r31 = r65
            r14 = r0
            r16 = r2
            r5 = r39
            r0 = r44
            sh.s.n(r12, r13, r14, r16, r18, r19, r20, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            r4 = r31
            r4.p(r0)
            r4.p(r5)
            goto L714
        L6fe:
            r4 = r12
            r6 = r36
            r0 = r44
            r11 = r50
            r5 = r52
            r7 = 131072(0x20000, float:1.83671E-40)
            r10 = 8
            r1 = 2007904627(0x77ae3173, float:7.066114E33)
            r4.a0(r1)
            r4.p(r5)
        L714:
            r1 = 0
            wb.ho.D1(r1, r4, r5, r0)
            float r1 = (float) r10
            p.z0 r1 = p.d.a(r0, r1)
            r2 = r6 & 112(0x70, float:1.57E-43)
            r3 = 32
            if (r2 != r3) goto L725
            r2 = r0
            goto L726
        L725:
            r2 = r5
        L726:
            r3 = r6 & 896(0x380, float:1.256E-42)
            r8 = 256(0x100, float:3.59E-43)
            if (r3 == r8) goto L72e
            r3 = r5
            goto L72f
        L72e:
            r3 = r0
        L72f:
            r2 = r2 | r3
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r6
            if (r3 != r7) goto L737
            r3 = r0
            goto L738
        L737:
            r3 = r5
        L738:
            r2 = r2 | r3
            r3 = r49
            boolean r7 = r4.h(r3)
            r2 = r2 | r7
            r7 = 29360128(0x1c00000, float:7.052966E-38)
            r6 = r6 & r7
            r7 = 8388608(0x800000, float:1.1754944E-38)
            if (r6 != r7) goto L748
            r5 = r0
        L748:
            r2 = r2 | r5
            java.lang.Object r5 = r4.P()
            if (r2 != 0) goto L751
            if (r5 != r11) goto L772
        L751:
            wb.qb r12 = new wb.qb
            r14 = r55
            r15 = r56
            r16 = r58
            r18 = r60
            r17 = r3
            r24 = r35
            r20 = r37
            r19 = r42
            r21 = r43
            r23 = r45
            r22 = r46
            r13 = r47
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r4.k0(r12)
            r5 = r12
        L772:
            r20 = r5
            fg.l r20 = (fg.l) r20
            r22 = 390(0x186, float:5.47E-43)
            r23 = 506(0x1fa, float:7.09E-43)
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r14 = r1
            r21 = r4
            r12 = r48
            a.a.b(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r12 = r21
            r12.p(r0)
            r12.p(r0)
            goto L799
        L795:
            r12 = r6
            r12.V()
        L799:
            i0.r1 r14 = r12.t()
            if (r14 == 0) goto L7c0
            c9.s0 r0 = new c9.s0
            r1 = r53
            r2 = r54
            r3 = r55
            r4 = r56
            r5 = r57
            r6 = r58
            r7 = r59
            r8 = r60
            r9 = r61
            r10 = r62
            r11 = r63
            r12 = r64
            r13 = r66
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.f6035d = r0
        L7c0:
            return
    }

    public void Z(y0.o r49, fb.d1 r50, boolean r51, boolean r52, fg.a r53, fg.a r54, fg.a r55, fg.a r56, fg.l r57, fg.l r58, i0.h0 r59, int r60) {
            r48 = this;
            r2 = r49
            r3 = r50
            r4 = r51
            r5 = r52
            r6 = r53
            r7 = r54
            r8 = r55
            r9 = r56
            r10 = r57
            r15 = r59
            java.lang.String r0 = r3.f3484b
            java.lang.String r1 = r3.f3483a
            r11 = 0
            java.lang.Float r12 = java.lang.Float.valueOf(r11)
            r13 = 114399893(0x6d19a95, float:7.88442E-35)
            r15.b0(r13)
            boolean r13 = r15.f(r2)
            r14 = 4
            if (r13 == 0) goto L2c
            r13 = r14
            goto L2d
        L2c:
            r13 = 2
        L2d:
            r13 = r60 | r13
            boolean r17 = r15.f(r3)
            if (r17 == 0) goto L38
            r17 = 32
            goto L3a
        L38:
            r17 = 16
        L3a:
            r13 = r13 | r17
            boolean r17 = r15.g(r4)
            if (r17 == 0) goto L45
            r17 = 256(0x100, float:3.59E-43)
            goto L47
        L45:
            r17 = 128(0x80, float:1.8E-43)
        L47:
            r13 = r13 | r17
            boolean r17 = r15.g(r5)
            if (r17 == 0) goto L52
            r17 = 2048(0x800, float:2.87E-42)
            goto L54
        L52:
            r17 = 1024(0x400, float:1.435E-42)
        L54:
            r13 = r13 | r17
            r11 = 1
            boolean r18 = r15.g(r11)
            if (r18 == 0) goto L60
            r18 = 16384(0x4000, float:2.2959E-41)
            goto L62
        L60:
            r18 = 8192(0x2000, float:1.148E-41)
        L62:
            r13 = r13 | r18
            boolean r18 = r15.h(r6)
            if (r18 == 0) goto L6d
            r18 = 131072(0x20000, float:1.83671E-40)
            goto L6f
        L6d:
            r18 = 65536(0x10000, float:9.1835E-41)
        L6f:
            r13 = r13 | r18
            boolean r18 = r15.h(r7)
            if (r18 == 0) goto L7a
            r18 = 1048576(0x100000, float:1.469368E-39)
            goto L7c
        L7a:
            r18 = 524288(0x80000, float:7.34684E-40)
        L7c:
            r13 = r13 | r18
            boolean r18 = r15.h(r8)
            if (r18 == 0) goto L87
            r18 = 8388608(0x800000, float:1.1754944E-38)
            goto L89
        L87:
            r18 = 4194304(0x400000, float:5.877472E-39)
        L89:
            r13 = r13 | r18
            boolean r18 = r15.h(r9)
            if (r18 == 0) goto L94
            r18 = 67108864(0x4000000, float:1.5046328E-36)
            goto L96
        L94:
            r18 = 33554432(0x2000000, float:9.403955E-38)
        L96:
            r13 = r13 | r18
            boolean r18 = r15.h(r10)
            if (r18 == 0) goto La1
            r18 = 536870912(0x20000000, float:1.0842022E-19)
            goto La3
        La1:
            r18 = 268435456(0x10000000, float:2.524355E-29)
        La3:
            r34 = r13 | r18
            r13 = r58
            boolean r18 = r15.h(r13)
            if (r18 == 0) goto Lae
            goto Laf
        Lae:
            r14 = 2
        Laf:
            r4 = 48
            r14 = r14 | r4
            r18 = 306783379(0x12492493, float:6.34695E-28)
            r11 = r34 & r18
            r4 = 306783378(0x12492492, float:6.3469493E-28)
            r18 = 3
            if (r11 != r4) goto Lc6
            r4 = r14 & 3
            r11 = 2
            if (r4 == r11) goto Lc4
            goto Lc6
        Lc4:
            r4 = 0
            goto Lc7
        Lc6:
            r4 = 1
        Lc7:
            r11 = r34 & 1
            boolean r4 = r15.S(r11, r4)
            if (r4 == 0) goto L802
            i0.m2 r4 = y1.h1.f21946h
            java.lang.Object r4 = r15.j(r4)
            u2.c r4 = (u2.c) r4
            r11 = 82
            float r11 = (float) r11
            float r14 = r4.x0(r11)
            boolean r17 = r15.f(r1)
            java.lang.Object r5 = r15.P()
            r35 = r0
            i0.e r0 = i0.l.f5952a
            if (r17 != 0) goto Lee
            if (r5 != r0) goto Lf5
        Lee:
            i0.j1 r5 = i0.r.u(r12)
            r15.k0(r5)
        Lf5:
            i0.a1 r5 = (i0.a1) r5
            boolean r17 = r15.f(r1)
            r20 = r11
            java.lang.Object r11 = r15.P()
            if (r17 != 0) goto L105
            if (r11 != r0) goto L10c
        L105:
            i0.j1 r11 = i0.r.u(r12)
            r15.k0(r11)
        L10c:
            r25 = r11
            i0.a1 r25 = (i0.a1) r25
            boolean r11 = r15.f(r1)
            r17 = r11
            java.lang.Object r11 = r15.P()
            if (r17 != 0) goto L11e
            if (r11 != r0) goto L125
        L11e:
            i0.j1 r11 = i0.r.u(r12)
            r15.k0(r11)
        L125:
            r21 = r11
            i0.a1 r21 = (i0.a1) r21
            boolean r11 = r15.f(r1)
            java.lang.Object r12 = r15.P()
            if (r11 != 0) goto L135
            if (r12 != r0) goto L13e
        L135:
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            i0.j1 r12 = i0.r.u(r11)
            r15.k0(r12)
        L13e:
            r22 = r12
            i0.a1 r22 = (i0.a1) r22
            i0.a1 r26 = i0.r.y(r10, r15)
            i0.a1 r23 = i0.r.y(r58, r59)
            java.lang.Object r11 = r21.getValue()
            java.lang.Number r11 = (java.lang.Number) r11
            float r11 = r11.floatValue()
            java.lang.Object r12 = r22.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L162
            r12 = 0
            goto L164
        L162:
            r12 = 170(0xaa, float:2.38E-43)
        L164:
            r15 = 6
            r10 = 0
            i.l1 r12 = i.d.p(r12, r15, r10)
            r17 = r15
            r15 = 3072(0xc00, float:4.305E-42)
            r24 = 0
            r16 = 20
            java.lang.String r13 = "AgentHistoryDragOffset"
            r38 = r14
            r3 = r17
            r37 = r20
            r40 = r21
            r24 = r22
            r42 = r23
            r39 = r25
            r41 = r26
            r14 = r59
            i0.l2 r22 = i.f.a(r11, r12, r13, r14, r15, r16)
            java.lang.Object r11 = r24.getValue()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            r12 = 1065353216(0x3f800000, float:1.0)
            if (r11 == 0) goto L19c
            r11 = 1065479045(0x3f81eb85, float:1.015)
            goto L19d
        L19c:
            r11 = r12
        L19d:
            r13 = 120(0x78, float:1.68E-43)
            i.l1 r13 = i.d.p(r13, r3, r10)
            r15 = 3120(0xc30, float:4.372E-42)
            r16 = 20
            r14 = r12
            r12 = r13
            java.lang.String r13 = "AgentHistoryDragScale"
            r3 = r14
            r10 = r22
            r14 = r59
            i0.l2 r11 = i.f.a(r11, r12, r13, r14, r15, r16)
            r15 = r14
            java.lang.Object r12 = r24.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L1c3
            r12 = r3
            goto L1c4
        L1c3:
            r12 = 0
        L1c4:
            y0.r r13 = new y0.r
            r13.<init>(r12)
            y0.o r12 = r2.d(r13)
            boolean r13 = r15.f(r10)
            boolean r14 = r15.f(r11)
            r13 = r13 | r14
            r14 = r24
            boolean r16 = r15.f(r14)
            r13 = r13 | r16
            boolean r16 = r15.f(r4)
            r13 = r13 | r16
            java.lang.Object r3 = r15.P()
            if (r13 != 0) goto L1ef
            if (r3 != r0) goto L1ed
            goto L1ef
        L1ed:
            r10 = r14
            goto L205
        L1ef:
            c9.k r20 = new c9.k
            r25 = 27
            r21 = r4
            r22 = r10
            r23 = r11
            r24 = r14
            r20.<init>(r21, r22, r23, r24, r25)
            r3 = r20
            r10 = r24
            r15.k0(r3)
        L205:
            fg.l r3 = (fg.l) r3
            y0.o r3 = f1.c0.m(r12, r3)
            r14 = 1065353216(0x3f800000, float:1.0)
            y0.o r3 = p.h1.d(r3, r14)
            r11 = 12
            float r12 = (float) r11
            r13 = r18
            float r13 = (float) r13
            y0.o r3 = p.d.m(r3, r12, r13)
            r14 = 8
            float r14 = (float) r14
            v.d r11 = v.e.a(r14)
            y0.o r3 = c1.h.b(r3, r11)
            y0.g r11 = y0.b.f21792g
            r2 = 0
            v1.n0 r11 = p.o.d(r11, r2)
            r2 = r12
            r17 = r13
            long r12 = r15.T
            int r12 = java.lang.Long.hashCode(r12)
            s0.h r13 = r15.l()
            y0.o r3 = y0.a.c(r15, r3)
            x1.f r18 = x1.g.f20914f
            r18.getClass()
            r18 = r12
            x1.y r12 = x1.f.f20883b
            r15.d0()
            r19 = r2
            boolean r2 = r15.S
            if (r2 == 0) goto L254
            r15.k(r12)
            goto L257
        L254:
            r15.n0()
        L257:
            x1.e r2 = x1.f.f20886e
            i0.r.A(r2, r15, r11)
            x1.e r11 = x1.f.f20885d
            i0.r.A(r11, r15, r13)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r18)
            r43 = r10
            x1.e r10 = x1.f.f20887f
            i0.r.A(r10, r15, r13)
            x1.d r13 = x1.f.f20888g
            i0.r.w(r13, r15)
            x1.e r6 = x1.f.f20884c
            i0.r.A(r6, r15, r3)
            java.lang.Object r3 = r5.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            r18 = r3
            r3 = 0
            int r18 = (r18 > r3 ? 1 : (r18 == r3 ? 0 : -1))
            r24 = r3
            f1.m0 r3 = f1.c0.f3038b
            if (r18 != 0) goto L2a5
            r7 = 1310102963(0x4e1695b3, float:6.315983E8)
            r15.a0(r7)
            r7 = 0
            r15.p(r7)
            r44 = r4
            r8 = r11
            r7 = r12
            r9 = r13
            r37 = r14
            r45 = r17
            r4 = r19
            r11 = 1
            r46 = 12
            goto L3ed
        L2a5:
            r7 = 1309314943(0x4e0a8f7f, float:5.81165E8)
            r15.a0(r7)
            y0.o r7 = p.r.b()
            java.lang.Object r18 = r5.getValue()
            java.lang.Number r18 = (java.lang.Number) r18
            float r18 = r18.floatValue()
            int r18 = (r18 > r24 ? 1 : (r18 == r24 ? 0 : -1))
            if (r18 <= 0) goto L2c7
            y0.g r18 = y0.b.f21795j
        L2bf:
            r44 = r4
            r20 = r14
            r14 = r18
            r4 = 0
            goto L2ca
        L2c7:
            y0.g r18 = y0.b.f21797l
            goto L2bf
        L2ca:
            v1.n0 r14 = p.o.d(r14, r4)
            long r8 = r15.T
            int r4 = java.lang.Long.hashCode(r8)
            s0.h r8 = r15.l()
            y0.o r7 = y0.a.c(r15, r7)
            r15.d0()
            boolean r9 = r15.S
            if (r9 == 0) goto L2e7
            r15.k(r12)
            goto L2ea
        L2e7:
            r15.n0()
        L2ea:
            i0.r.A(r2, r15, r14)
            i0.r.A(r11, r15, r8)
            j8.b.p(r4, r15, r10, r15, r13)
            i0.r.A(r6, r15, r7)
            p.a0 r4 = p.h1.f9914b
            r9 = r24
            r7 = r37
            r8 = 14
            y0.o r4 = p.h1.m(r4, r7, r9, r8)
            java.lang.Object r7 = r5.getValue()
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 <= 0) goto L32e
            r7 = -1848628127(0xffffffff91d02c61, float:-3.2843964E-28)
            r15.a0(r7)
            i0.m2 r7 = bi.d.f892a
            java.lang.Object r7 = r15.j(r7)
            bi.b r7 = (bi.b) r7
            long r7 = r7.j()
            r9 = 1063339950(0x3f6147ae, float:0.88)
            long r7 = f1.w.b(r7, r9)
            r9 = 0
            r15.p(r9)
            goto L341
        L32e:
            r9 = 0
            r7 = -1848626433(0xffffffff91d032ff, float:-3.2848042E-28)
            r15.a0(r7)
            r15.p(r9)
            r7 = 4292423717(0xffd93025, double:2.120739096E-314)
            long r7 = f1.c0.d(r7)
        L341:
            y0.o r4 = k.n.g(r4, r7, r3)
            y0.g r7 = y0.b.f21796k
            v1.n0 r7 = p.o.d(r7, r9)
            long r8 = r15.T
            int r8 = java.lang.Long.hashCode(r8)
            s0.h r9 = r15.l()
            y0.o r4 = y0.a.c(r15, r4)
            r15.d0()
            boolean r14 = r15.S
            if (r14 == 0) goto L364
            r15.k(r12)
            goto L367
        L364:
            r15.n0()
        L367:
            i0.r.A(r2, r15, r7)
            i0.r.A(r11, r15, r9)
            j8.b.p(r8, r15, r10, r15, r13)
            i0.r.A(r6, r15, r4)
            java.lang.Object r4 = r5.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            r24 = 0
            int r4 = (r4 > r24 ? 1 : (r4 == r24 ? 0 : -1))
            if (r4 <= 0) goto L387
            java.lang.String r4 = "编辑"
        L385:
            r7 = r13
            goto L38a
        L387:
            java.lang.String r4 = "删除"
            goto L385
        L38a:
            long r13 = f1.w.f3127c
            r8 = 13
            long r8 = x6.d.D(r8)
            r32 = 0
            r33 = 262122(0x3ffea, float:3.67311E-40)
            r18 = r12
            r12 = 0
            r21 = r17
            r17 = 0
            r22 = r18
            r18 = 0
            r23 = r19
            r24 = r20
            r19 = 0
            r25 = r21
            r21 = 0
            r27 = r22
            r26 = r23
            r22 = 0
            r28 = r24
            r24 = 0
            r29 = r25
            r25 = 0
            r30 = r26
            r26 = 0
            r31 = r27
            r27 = 0
            r37 = r28
            r28 = 0
            r45 = r29
            r29 = 0
            r46 = r31
            r31 = 24960(0x6180, float:3.4976E-41)
            r47 = r11
            r11 = r4
            r4 = r30
            r30 = r15
            r15 = r8
            r8 = r47
            r9 = r7
            r7 = r46
            r46 = 12
            sh.s.n(r11, r12, r13, r15, r17, r18, r19, r21, r22, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r15 = r30
            r11 = 1
            r15.p(r11)
            r15.p(r11)
            r12 = 0
            r15.p(r12)
        L3ed:
            y0.l r12 = y0.l.f21818a
            r14 = 1065353216(0x3f800000, float:1.0)
            y0.o r13 = p.h1.d(r12, r14)
            r14 = r39
            boolean r16 = r15.f(r14)
            java.lang.Object r11 = r15.P()
            if (r16 != 0) goto L407
            if (r11 != r0) goto L404
            goto L407
        L404:
            r30 = r4
            goto L412
        L407:
            wb.lp r11 = new wb.lp
            r30 = r4
            r4 = 3
            r11.<init>(r14, r4)
            r15.k0(r11)
        L412:
            fg.l r11 = (fg.l) r11
            y0.o r4 = v1.w.n(r13, r11)
            boolean r11 = r15.f(r5)
            java.lang.Object r13 = r15.P()
            if (r11 != 0) goto L424
            if (r13 != r0) goto L42d
        L424:
            wb.lp r13 = new wb.lp
            r11 = 4
            r13.<init>(r5, r11)
            r15.k0(r13)
        L42d:
            fg.l r13 = (fg.l) r13
            y0.o r4 = f1.c0.m(r4, r13)
            i0.m2 r11 = bi.d.f892a
            java.lang.Object r13 = r15.j(r11)
            bi.b r13 = (bi.b) r13
            r39 = r14
            long r13 = r13.a()
            y0.o r4 = k.n.g(r4, r13, r3)
            if (r51 == 0) goto L465
            r13 = 1289198466(0x4cd79b82, float:1.130404E8)
            r15.a0(r13)
            java.lang.Object r13 = r15.j(r11)
            bi.b r13 = (bi.b) r13
            long r13 = r13.j()
            r16 = r12
            r12 = 1040522936(0x3e051eb8, float:0.13)
            long r12 = f1.w.b(r13, r12)
            r14 = 0
            r15.p(r14)
            goto L473
        L465:
            r16 = r12
            r14 = 0
            r12 = 1289200090(0x4cd7a1da, float:1.1305339E8)
            r15.a0(r12)
            r15.p(r14)
            long r12 = f1.w.f3130f
        L473:
            y0.o r3 = k.n.g(r4, r12, r3)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r12 = 57344(0xe000, float:8.0356E-41)
            r12 = r34 & r12
            r13 = 16384(0x4000, float:2.2959E-41)
            if (r12 != r13) goto L484
            r13 = 1
            goto L485
        L484:
            r13 = 0
        L485:
            boolean r14 = r15.f(r5)
            r13 = r13 | r14
            r14 = r38
            boolean r17 = r15.c(r14)
            r13 = r13 | r17
            r17 = 29360128(0x1c00000, float:7.052966E-38)
            r18 = r13
            r13 = r34 & r17
            r17 = r11
            r11 = 8388608(0x800000, float:1.1754944E-38)
            if (r13 != r11) goto L4a0
            r11 = 1
            goto L4a1
        L4a0:
            r11 = 0
        L4a1:
            r11 = r18 | r11
            r13 = 234881024(0xe000000, float:1.5777218E-30)
            r13 = r34 & r13
            r18 = r11
            r11 = 67108864(0x4000000, float:1.5046328E-36)
            if (r13 != r11) goto L4af
            r11 = 1
            goto L4b0
        L4af:
            r11 = 0
        L4b0:
            r11 = r18 | r11
            java.lang.Object r13 = r15.P()
            if (r11 != 0) goto L4c2
            if (r13 != r0) goto L4bb
            goto L4c2
        L4bb:
            r11 = r55
            r18 = r6
            r6 = r56
            goto L4d0
        L4c2:
            wb.nt r13 = new wb.nt
            r11 = r55
            r18 = r6
            r6 = r56
            r13.<init>(r14, r11, r6, r5)
            r15.k0(r13)
        L4d0:
            androidx.compose.ui.input.pointer.PointerInputEventHandler r13 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) r13
            y0.o r3 = s1.h0.b(r3, r1, r4, r13)
            r13 = 16384(0x4000, float:2.2959E-41)
            if (r12 != r13) goto L4de
            r5 = 1
        L4db:
            r13 = r44
            goto L4e0
        L4de:
            r5 = 0
            goto L4db
        L4e0:
            boolean r14 = r15.f(r13)
            r5 = r5 | r14
            r14 = 3670016(0x380000, float:5.142788E-39)
            r14 = r34 & r14
            r20 = r5
            r5 = 1048576(0x100000, float:1.469368E-39)
            if (r14 != r5) goto L4f1
            r5 = 1
            goto L4f2
        L4f1:
            r5 = 0
        L4f2:
            r5 = r20 | r5
            r14 = 458752(0x70000, float:6.42848E-40)
            r14 = r34 & r14
            r20 = r5
            r5 = 131072(0x20000, float:1.83671E-40)
            if (r14 != r5) goto L500
            r5 = 1
            goto L501
        L500:
            r5 = 0
        L501:
            r5 = r20 | r5
            java.lang.Object r14 = r15.P()
            if (r5 != 0) goto L511
            if (r14 != r0) goto L50c
            goto L511
        L50c:
            r6 = r53
            r11 = r54
            goto L51e
        L511:
            w.f1 r14 = new w.f1
            r5 = 1
            r6 = r53
            r11 = r54
            r14.<init>(r13, r11, r6, r5)
            r15.k0(r14)
        L51e:
            androidx.compose.ui.input.pointer.PointerInputEventHandler r14 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) r14
            y0.o r3 = s1.h0.b(r3, r1, r4, r14)
            r5 = 14
            float r14 = (float) r5
            r5 = 11
            float r5 = (float) r5
            y0.o r3 = p.d.m(r3, r14, r5)
            y0.f r5 = y0.b.f21802q
            p.c r14 = p.j.f9924a
            r6 = 48
            p.e1 r5 = p.d1.a(r14, r5, r15, r6)
            r21 = r13
            long r13 = r15.T
            int r6 = java.lang.Long.hashCode(r13)
            s0.h r13 = r15.l()
            y0.o r3 = y0.a.c(r15, r3)
            r15.d0()
            boolean r14 = r15.S
            if (r14 == 0) goto L553
            r15.k(r7)
            goto L556
        L553:
            r15.n0()
        L556:
            i0.r.A(r2, r15, r5)
            i0.r.A(r8, r15, r13)
            j8.b.p(r6, r15, r10, r15, r9)
            r5 = r18
            i0.r.A(r5, r15, r3)
            m1.f r11 = wb.ap.f15085z
            r3 = r17
            java.lang.Object r6 = r15.j(r3)
            bi.b r6 = (bi.b) r6
            long r13 = r6.h()
            f1.n r6 = new f1.n
            r3 = 5
            r6.<init>(r13, r3)
            r13 = 22
            float r13 = (float) r13
            r14 = r16
            y0.o r13 = p.h1.j(r14, r13)
            java.lang.Object r16 = r39.getValue()
            java.lang.Number r16 = (java.lang.Number) r16
            float r16 = r16.floatValue()
            java.lang.Float r3 = java.lang.Float.valueOf(r16)
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r4, r3}
            r3 = 16384(0x4000, float:2.2959E-41)
            if (r12 != r3) goto L59b
            r3 = 1
        L598:
            r4 = r40
            goto L59d
        L59b:
            r3 = 0
            goto L598
        L59d:
            boolean r12 = r15.f(r4)
            r3 = r3 | r12
            r12 = r43
            boolean r16 = r15.f(r12)
            r3 = r3 | r16
            r16 = r1
            r1 = r42
            boolean r18 = r15.f(r1)
            r3 = r3 | r18
            r1 = r39
            boolean r18 = r15.f(r1)
            r3 = r3 | r18
            r1 = r21
            boolean r18 = r15.f(r1)
            r3 = r3 | r18
            r1 = r41
            boolean r18 = r15.f(r1)
            r3 = r3 | r18
            java.lang.Object r1 = r15.P()
            if (r3 != 0) goto L5d4
            if (r1 != r0) goto L5ea
        L5d4:
            wb.ot r20 = new wb.ot
            r22 = r12
            r24 = r21
            r25 = r39
            r26 = r41
            r23 = r42
            r21 = r4
            r20.<init>(r21, r22, r23, r24, r25, r26)
            r1 = r20
            r15.k0(r1)
        L5ea:
            r26 = r1
            androidx.compose.ui.input.pointer.PointerInputEventHandler r26 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) r26
            s1.g0 r22 = new s1.g0
            r24 = 0
            r27 = 3
            r23 = 0
            r25 = r16
            r22.<init>(r23, r24, r25, r26, r27)
            r0 = r22
            y0.o r13 = r13.d(r0)
            java.lang.String r12 = "长按拖动排序"
            r16 = 54
            r0 = r14
            r3 = r17
            r1 = 1
            r14 = r6
            k.n.c(r11, r12, r13, r14, r15, r16)
            r4 = r15
            r14 = 1065353216(0x3f800000, float:1.0)
            double r11 = (double) r14
            r15 = 0
            int r6 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r6 <= 0) goto L618
            goto L61d
        L618:
            java.lang.String r6 = "invalid weight; must be greater than zero"
            q.a.a(r6)
        L61d:
            p.q0 r12 = new p.q0
            r12.<init>(r14, r1)
            r16 = 0
            r17 = 14
            r14 = 0
            r15 = 0
            r13 = r30
            y0.o r6 = p.d.p(r12, r13, r14, r15, r16, r17)
            p.e r11 = p.j.f9926c
            y0.e r12 = y0.b.f21804s
            r14 = 0
            p.t r11 = p.s.a(r11, r12, r4, r14)
            long r12 = r4.T
            int r12 = java.lang.Long.hashCode(r12)
            s0.h r13 = r4.l()
            y0.o r6 = y0.a.c(r4, r6)
            r4.d0()
            boolean r14 = r4.S
            if (r14 == 0) goto L650
            r4.k(r7)
            goto L653
        L650:
            r4.n0()
        L653:
            i0.r.A(r2, r4, r11)
            i0.r.A(r8, r4, r13)
            j8.b.p(r12, r4, r10, r4, r9)
            i0.r.A(r5, r4, r6)
            boolean r2 = og.m.t0(r35)
            if (r2 == 0) goto L669
            java.lang.String r2 = "新对话"
            r11 = r2
            goto L66b
        L669:
            r11 = r35
        L66b:
            java.lang.Object r2 = r4.j(r3)
            bi.b r2 = (bi.b) r2
            long r13 = r2.g()
            r36 = 14
            long r15 = x6.d.D(r36)
            r32 = 24960(0x6180, float:3.4976E-41)
            r33 = 241642(0x3afea, float:3.38613E-40)
            r12 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r24 = 2
            r25 = 0
            r26 = 1
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 24576(0x6000, float:3.4438E-41)
            r30 = r4
            sh.s.n(r11, r12, r13, r15, r17, r18, r19, r21, r22, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r3 = r50
            java.util.List r2 = r3.f3487e
            int r5 = r2.size()
            java.util.ListIterator r2 = r2.listIterator(r5)
        L6aa:
            boolean r5 = r2.hasPrevious()
            if (r5 == 0) goto L6c2
            java.lang.Object r5 = r2.previous()
            r6 = r5
            fb.c r6 = (fb.c) r6
            java.lang.String r6 = r6.f3431a
            java.lang.String r7 = "user"
            boolean r6 = gg.l.a(r6, r7)
            if (r6 == 0) goto L6aa
            goto L6c3
        L6c2:
            r5 = 0
        L6c3:
            fb.c r5 = (fb.c) r5
            if (r5 == 0) goto L6ca
            java.lang.String r10 = r5.f3432b
            goto L6cb
        L6ca:
            r10 = 0
        L6cb:
            if (r10 != 0) goto L6cf
            java.lang.String r10 = ""
        L6cf:
            r11 = r10
            boolean r2 = og.m.t0(r11)
            if (r2 != 0) goto L72b
            r2 = r35
            boolean r2 = r11.equals(r2)
            if (r2 != 0) goto L72b
            r2 = -931989969(0xffffffffc872f62f, float:-248792.73)
            r4.a0(r2)
            i0.m2 r2 = bi.d.f892a
            java.lang.Object r2 = r4.j(r2)
            bi.b r2 = (bi.b) r2
            long r5 = r2.h()
            long r7 = x6.d.D(r46)
            r18 = 0
            r19 = 13
            r15 = 0
            r17 = 0
            r14 = r0
            r16 = r45
            y0.o r12 = p.d.p(r14, r15, r16, r17, r18, r19)
            r32 = 24960(0x6180, float:3.4976E-41)
            r33 = 241640(0x3afe8, float:3.3861E-40)
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r24 = 2
            r25 = 0
            r26 = 1
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 24624(0x6030, float:3.4506E-41)
            r30 = r4
            r13 = r5
            r15 = r7
            sh.s.n(r11, r12, r13, r15, r17, r18, r19, r21, r22, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r14 = 0
            r4.p(r14)
            goto L735
        L72b:
            r14 = 0
            r2 = -931635763(0xffffffffc8785dcd, float:-254327.2)
            r4.a0(r2)
            r4.p(r14)
        L735:
            r4.p(r1)
            boolean r2 = r3.f3494l
            r5 = 17
            if (r2 == 0) goto L77a
            r2 = -293300127(0xffffffffee849861, float:-2.0518118E28)
            r4.a0(r2)
            m1.f r11 = wb.ap.f15082w
            i0.m2 r2 = bi.d.f892a
            java.lang.Object r2 = r4.j(r2)
            bi.b r2 = (bi.b) r2
            long r6 = r2.j()
            f1.n r2 = new f1.n
            r8 = 5
            r2.<init>(r6, r8)
            r6 = 6
            float r14 = (float) r6
            r17 = 0
            r18 = 14
            r15 = 0
            r16 = 0
            r13 = r0
            y0.o r0 = p.d.p(r13, r14, r15, r16, r17, r18)
            r6 = r13
            float r7 = (float) r5
            y0.o r13 = p.h1.j(r0, r7)
            java.lang.String r12 = "已置顶"
            r16 = 438(0x1b6, float:6.14E-43)
            r14 = r2
            r15 = r4
            k.n.c(r11, r12, r13, r14, r15, r16)
            r14 = 0
            r4.p(r14)
            goto L785
        L77a:
            r6 = r0
            r14 = 0
            r0 = -293019081(0xffffffffee88e237, float:-2.118172E28)
            r4.a0(r0)
            r4.p(r14)
        L785:
            boolean r0 = r3.f3495m
            if (r0 == 0) goto L7c4
            r0 = -292959344(0xffffffffee89cb90, float:-2.132277E28)
            r4.a0(r0)
            m1.f r11 = wb.ap.f15083x
            i0.m2 r0 = bi.d.f892a
            java.lang.Object r0 = r4.j(r0)
            bi.b r0 = (bi.b) r0
            long r7 = r0.h()
            f1.n r0 = new f1.n
            r2 = 5
            r0.<init>(r7, r2)
            r2 = 6
            float r14 = (float) r2
            r17 = 0
            r18 = 14
            r15 = 0
            r16 = 0
            r13 = r6
            y0.o r2 = p.d.p(r13, r14, r15, r16, r17, r18)
            float r5 = (float) r5
            y0.o r13 = p.h1.j(r2, r5)
            java.lang.String r12 = "已锁定"
            r16 = 438(0x1b6, float:6.14E-43)
            r14 = r0
            r15 = r4
            k.n.c(r11, r12, r13, r14, r15, r16)
            r14 = 0
            r4.p(r14)
            goto L7ce
        L7c4:
            r14 = 0
            r0 = -292661961(0xffffffffee8e5537, float:-2.2024945E28)
            r4.a0(r0)
            r4.p(r14)
        L7ce:
            if (r52 == 0) goto L7f1
            r0 = -292633224(0xffffffffee8ec578, float:-2.2092798E28)
            r4.a0(r0)
            r19 = 0
            r20 = 14
            r17 = 0
            r18 = 0
            r15 = r6
            r16 = r37
            y0.o r0 = p.d.p(r15, r16, r17, r18, r19, r20)
            r2 = 54
            wb.y2 r5 = wb.y2.f20289n
            r5.t0(r0, r4, r2)
            r14 = 0
            r4.p(r14)
            goto L7fb
        L7f1:
            r14 = 0
            r0 = -292541929(0xffffffffee902a17, float:-2.2308362E28)
            r4.a0(r0)
            r4.p(r14)
        L7fb:
            r4.p(r1)
            r4.p(r1)
            goto L806
        L802:
            r4 = r15
            r4.V()
        L806:
            i0.r1 r13 = r4.t()
            if (r13 == 0) goto L829
            wb.cs r0 = new wb.cs
            r1 = r48
            r2 = r49
            r4 = r51
            r5 = r52
            r6 = r53
            r7 = r54
            r8 = r55
            r9 = r56
            r10 = r57
            r11 = r58
            r12 = r60
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.f6035d = r0
        L829:
            return
    }

    @Override // wb.kv
    public boolean a() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void a0(m1.f r29, java.lang.String r30, fg.a r31, i0.h0 r32, int r33) {
            r28 = this;
            r4 = r31
            r9 = r32
            r0 = 649088682(0x26b04eaa, float:1.2233775E-15)
            r9.b0(r0)
            boolean r0 = r9.h(r4)
            if (r0 == 0) goto L13
            r0 = 256(0x100, float:3.59E-43)
            goto L15
        L13:
            r0 = 128(0x80, float:1.8E-43)
        L15:
            r0 = r33 | r0
            r1 = r0 & 147(0x93, float:2.06E-43)
            r2 = 146(0x92, float:2.05E-43)
            r3 = 1
            if (r1 == r2) goto L20
            r1 = r3
            goto L21
        L20:
            r1 = 0
        L21:
            r0 = r0 & r3
            boolean r0 = r9.S(r0, r1)
            if (r0 == 0) goto Lf5
            r0 = 1065353216(0x3f800000, float:1.0)
            y0.l r1 = y0.l.f21818a
            y0.o r0 = p.h1.d(r1, r0)
            r2 = 6
            float r2 = (float) r2
            v.d r2 = v.e.a(r2)
            y0.o r0 = c1.h.b(r0, r2)
            y0.o r0 = wb.ho.O6(r0, r4)
            r2 = 12
            float r2 = (float) r2
            y0.o r0 = p.d.m(r0, r2, r2)
            y0.f r2 = y0.b.f21802q
            p.c r5 = p.j.f9924a
            r6 = 48
            p.e1 r2 = p.d1.a(r5, r2, r9, r6)
            long r5 = r9.T
            int r5 = java.lang.Long.hashCode(r5)
            s0.h r6 = r9.l()
            y0.o r0 = y0.a.c(r9, r0)
            x1.f r7 = x1.g.f20914f
            r7.getClass()
            x1.y r7 = x1.f.f20883b
            r9.d0()
            boolean r8 = r9.S
            if (r8 == 0) goto L6f
            r9.k(r7)
            goto L72
        L6f:
            r9.n0()
        L72:
            x1.e r7 = x1.f.f20886e
            i0.r.A(r7, r9, r2)
            x1.e r2 = x1.f.f20885d
            i0.r.A(r2, r9, r6)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            x1.e r5 = x1.f.f20887f
            i0.r.A(r5, r9, r2)
            x1.d r2 = x1.f.f20888g
            i0.r.w(r2, r9)
            x1.e r2 = x1.f.f20884c
            i0.r.A(r2, r9, r0)
            i0.m2 r0 = bi.d.f892a
            java.lang.Object r2 = r9.j(r0)
            bi.b r2 = (bi.b) r2
            long r5 = r2.h()
            f1.n r8 = new f1.n
            r2 = 5
            r8.<init>(r5, r2)
            r2 = 22
            float r2 = (float) r2
            y0.o r7 = p.h1.j(r1, r2)
            r6 = 0
            r10 = 438(0x1b6, float:6.14E-43)
            r5 = r29
            k.n.c(r5, r6, r7, r8, r9, r10)
            r2 = r9
            java.lang.Object r0 = r2.j(r0)
            bi.b r0 = (bi.b) r0
            long r11 = r0.g()
            r0 = 14
            long r13 = x6.d.D(r0)
            float r6 = (float) r0
            r9 = 0
            r10 = 14
            r7 = 0
            r8 = 0
            r5 = r1
            y0.o r6 = p.d.p(r5, r6, r7, r8, r9, r10)
            r26 = 0
            r27 = 262120(0x3ffe8, float:3.67308E-40)
            r7 = r11
            r11 = 0
            r12 = 0
            r9 = r13
            r13 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 24630(0x6036, float:3.4514E-41)
            r5 = r30
            r24 = r2
            sh.s.n(r5, r6, r7, r9, r11, r12, r13, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r9 = r24
            r9.p(r3)
            goto Lf8
        Lf5:
            r9.V()
        Lf8:
            i0.r1 r7 = r9.t()
            if (r7 == 0) goto L10e
            wb.rr r0 = new wb.rr
            r6 = 0
            r1 = r28
            r2 = r29
            r3 = r30
            r5 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f6035d = r0
        L10e:
            return
    }

    public void b(i0.h0 r24, int r25) {
            r23 = this;
            r0 = r24
            r1 = -1537297143(0xffffffffa45eb509, float:-4.829192E-17)
            r0.b0(r1)
            r1 = r25 & 1
            if (r1 == 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            boolean r1 = r0.S(r1, r2)
            if (r1 == 0) goto L75
            i0.m2 r1 = bi.d.f892a
            java.lang.Object r2 = r0.j(r1)
            bi.b r2 = (bi.b) r2
            long r2 = r2.j()
            r4 = 11
            long r4 = x6.d.D(r4)
            m2.k r6 = m2.k.f8698j
            r7 = 999(0x3e7, float:1.4E-42)
            float r7 = (float) r7
            v.d r7 = v.e.a(r7)
            y0.l r8 = y0.l.f21818a
            y0.o r7 = c1.h.b(r8, r7)
            java.lang.Object r1 = r0.j(r1)
            bi.b r1 = (bi.b) r1
            long r8 = r1.j()
            r1 = 1039516303(0x3df5c28f, float:0.12)
            long r8 = f1.w.b(r8, r1)
            f1.m0 r1 = f1.c0.f3038b
            y0.o r1 = k.n.g(r7, r8, r1)
            r7 = 8
            float r7 = (float) r7
            r8 = 2
            float r8 = (float) r8
            y0.o r1 = p.d.m(r1, r7, r8)
            r21 = 0
            r22 = 262056(0x3ffa8, float:3.67219E-40)
            java.lang.String r0 = "单击"
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 1597446(0x186006, float:2.238499E-39)
            r19 = r24
            sh.s.n(r0, r1, r2, r4, r6, r7, r8, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L78
        L75:
            r24.V()
        L78:
            i0.r1 r0 = r24.t()
            if (r0 == 0) goto L8c
            b0.t r1 = new b0.t
            r2 = 26
            r3 = r23
            r4 = r25
            r1.<init>(r4, r2, r3)
            r0.f6035d = r1
            return
        L8c:
            r3 = r23
            return
    }

    public void b0(fb.c r82, boolean r83, long r84, java.lang.String r86, boolean r87, fg.a r88, fg.a r89, fg.a r90, i0.h0 r91, int r92) {
            r81 = this;
            r2 = r82
            r3 = r83
            r4 = r84
            r7 = r87
            r8 = r88
            r9 = r89
            r10 = r90
            r0 = r91
            y0.e r1 = y0.b.f21804s
            r6 = 1501340943(0x597ca50f, float:4.4445736E15)
            r0.b0(r6)
            boolean r6 = r0.f(r2)
            if (r6 == 0) goto L20
            r6 = 4
            goto L21
        L20:
            r6 = 2
        L21:
            r6 = r92 | r6
            boolean r13 = r0.g(r3)
            r14 = 16
            if (r13 == 0) goto L2e
            r13 = 32
            goto L2f
        L2e:
            r13 = r14
        L2f:
            r6 = r6 | r13
            boolean r13 = r0.e(r4)
            if (r13 == 0) goto L39
            r13 = 256(0x100, float:3.59E-43)
            goto L3b
        L39:
            r13 = 128(0x80, float:1.8E-43)
        L3b:
            r6 = r6 | r13
            r13 = r86
            boolean r15 = r0.f(r13)
            if (r15 == 0) goto L47
            r15 = 2048(0x800, float:2.87E-42)
            goto L49
        L47:
            r15 = 1024(0x400, float:1.435E-42)
        L49:
            r6 = r6 | r15
            boolean r15 = r0.g(r7)
            if (r15 == 0) goto L53
            r15 = 16384(0x4000, float:2.2959E-41)
            goto L55
        L53:
            r15 = 8192(0x2000, float:1.148E-41)
        L55:
            r6 = r6 | r15
            boolean r15 = r0.h(r8)
            if (r15 == 0) goto L5f
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L61
        L5f:
            r15 = 65536(0x10000, float:9.1835E-41)
        L61:
            r6 = r6 | r15
            boolean r15 = r0.h(r9)
            if (r15 == 0) goto L6b
            r15 = 1048576(0x100000, float:1.469368E-39)
            goto L6d
        L6b:
            r15 = 524288(0x80000, float:7.34684E-40)
        L6d:
            r6 = r6 | r15
            boolean r15 = r0.h(r10)
            if (r15 == 0) goto L77
            r15 = 8388608(0x800000, float:1.1754944E-38)
            goto L79
        L77:
            r15 = 4194304(0x400000, float:5.877472E-39)
        L79:
            r23 = r6 | r15
            r6 = 38347923(0x2492493, float:1.4777644E-37)
            r6 = r23 & r6
            r15 = 38347922(0x2492492, float:1.4777643E-37)
            if (r6 == r15) goto L87
            r6 = 1
            goto L88
        L87:
            r6 = 0
        L88:
            r15 = r23 & 1
            boolean r6 = r0.S(r15, r6)
            if (r6 == 0) goto L84c
            java.lang.String r6 = r2.f3436f
            java.lang.String r15 = r2.f3439i
            long r9 = r2.f3443m
            java.util.List r7 = r2.f3440j
            r17 = r7
            java.lang.String r7 = r2.f3432b
            r18 = r7
            java.lang.String r7 = r2.f3444n
            r19 = r9
            java.lang.String r9 = r2.f3431a
            java.lang.String r10 = "assistant_tool_call"
            boolean r6 = gg.l.a(r6, r10)
            if (r6 == 0) goto Lce
            boolean r6 = og.m.t0(r18)
            if (r6 == 0) goto Lce
            i0.r1 r14 = r0.t()
            if (r14 == 0) goto L872
            wb.es r0 = new wb.es
            r12 = 0
            r1 = r81
            r7 = r87
            r8 = r88
            r9 = r89
            r10 = r90
            r11 = r92
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11, r12)
            r14.f6035d = r0
            return
        Lce:
            i0.m2 r3 = y1.i0.f21966b
            java.lang.Object r3 = r0.j(r3)
            r6 = r3
            android.content.Context r6 = (android.content.Context) r6
            java.lang.String r3 = "assistant"
            boolean r3 = gg.l.a(r9, r3)
            java.lang.String r10 = "streaming"
            if (r3 == 0) goto Lf0
            boolean r3 = gg.l.a(r7, r10)
            if (r3 == 0) goto Lf0
            boolean r3 = og.m.t0(r18)
            if (r3 == 0) goto Lf0
            r24 = 1
            goto Lf2
        Lf0:
            r24 = 0
        Lf2:
            if (r24 == 0) goto L125
            if (r83 != 0) goto L125
            java.lang.String r3 = r2.f3438h
            boolean r3 = og.m.t0(r3)
            if (r3 == 0) goto L125
            boolean r3 = r17.isEmpty()
            if (r3 == 0) goto L125
            i0.r1 r13 = r0.t()
            if (r13 == 0) goto L872
            wb.es r0 = new wb.es
            r12 = 1
            r1 = r81
            r3 = r83
            r4 = r84
            r6 = r86
            r7 = r87
            r8 = r88
            r9 = r89
            r10 = r90
            r11 = r92
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11, r12)
            r13.f6035d = r0
            return
        L125:
            r3 = r88
            r13 = r2
            r2 = r87
            java.lang.String r4 = r13.f3433c
            int r4 = r4.hashCode()
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
            wb.bu r11 = new wb.bu
            r12 = 0
            r11.<init>(r12, r3, r2)
            y0.l r12 = y0.l.f21818a
            y0.o r4 = s1.h0.b(r12, r4, r5, r11)
            java.lang.String r5 = "user"
            boolean r5 = gg.l.a(r9, r5)
            r11 = 1065353216(0x3f800000, float:1.0)
            r25 = r9
            i0.e r9 = i0.l.f5952a
            r26 = r7
            r7 = 18
            r32 = 12
            wb.y2 r33 = wb.y2.f20289n
            r34 = r9
            r27 = r10
            if (r5 == 0) goto L353
            r5 = -1340489931(0xffffffffb019bf35, float:-5.59328E-10)
            r0.a0(r5)
            y0.o r5 = p.h1.d(r12, r11)
            float r6 = (float) r14
            r11 = 6
            float r14 = (float) r11
            y0.o r5 = p.d.m(r5, r6, r14)
            p.c r6 = p.j.f9925b
            y0.f r15 = y0.b.f21801p
            p.e1 r6 = p.d1.a(r6, r15, r0, r11)
            long r10 = r0.T
            int r10 = java.lang.Long.hashCode(r10)
            s0.h r11 = r0.l()
            y0.o r5 = y0.a.c(r0, r5)
            x1.f r15 = x1.g.f20914f
            r15.getClass()
            x1.y r15 = x1.f.f20883b
            r0.d0()
            boolean r8 = r0.S
            if (r8 == 0) goto L198
            r0.k(r15)
            goto L19b
        L198:
            r0.n0()
        L19b:
            x1.e r8 = x1.f.f20886e
            i0.r.A(r8, r0, r6)
            x1.e r6 = x1.f.f20885d
            i0.r.A(r6, r0, r11)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            x1.e r11 = x1.f.f20887f
            i0.r.A(r11, r0, r10)
            x1.d r10 = x1.f.f20888g
            i0.r.w(r10, r0)
            x1.e r9 = x1.f.f20884c
            i0.r.A(r9, r0, r5)
            float r5 = (float) r7
            v.d r5 = v.e.a(r5)
            y0.o r4 = c1.h.b(r4, r5)
            i0.m2 r5 = bi.d.f892a
            java.lang.Object r7 = r0.j(r5)
            bi.b r7 = (bi.b) r7
            long r2 = r7.j()
            r7 = 1041194025(0x3e0f5c29, float:0.14)
            long r2 = f1.w.b(r2, r7)
            f1.m0 r7 = f1.c0.f3038b
            y0.o r2 = k.n.g(r4, r2, r7)
            r3 = 14
            float r4 = (float) r3
            r3 = 10
            float r3 = (float) r3
            y0.o r2 = p.d.m(r2, r4, r3)
            y0.g r3 = y0.b.f21792g
            r4 = 0
            v1.n0 r3 = p.o.d(r3, r4)
            r7 = r5
            long r4 = r0.T
            int r4 = java.lang.Long.hashCode(r4)
            s0.h r5 = r0.l()
            y0.o r2 = y0.a.c(r0, r2)
            r0.d0()
            r17 = r7
            boolean r7 = r0.S
            if (r7 == 0) goto L207
            r0.k(r15)
            goto L20a
        L207:
            r0.n0()
        L20a:
            i0.r.A(r8, r0, r3)
            i0.r.A(r6, r0, r5)
            j8.b.p(r4, r0, r11, r0, r10)
            i0.r.A(r9, r0, r2)
            p.e r2 = p.j.f9926c
            r4 = 0
            p.t r1 = p.s.a(r2, r1, r0, r4)
            long r2 = r0.T
            int r2 = java.lang.Long.hashCode(r2)
            s0.h r3 = r0.l()
            y0.o r4 = y0.a.c(r0, r12)
            r0.d0()
            boolean r5 = r0.S
            if (r5 == 0) goto L236
            r0.k(r15)
            goto L239
        L236:
            r0.n0()
        L239:
            i0.r.A(r8, r0, r1)
            i0.r.A(r6, r0, r3)
            j8.b.p(r2, r0, r11, r0, r10)
            i0.r.A(r9, r0, r4)
            fb.a1 r1 = r13.f3442l
            if (r1 != 0) goto L259
            r1 = -2106576606(0xffffffff82703122, float:-1.7646516E-37)
            r0.a0(r1)
            r4 = 0
            r0.p(r4)
            r9 = r0
            r25 = r12
            r8 = r17
            goto L285
        L259:
            r2 = -2106576605(0xffffffff82703123, float:-1.7646517E-37)
            r0.a0(r2)
            r8 = 8
            float r2 = (float) r8
            r30 = 7
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = r2
            r25 = r12
            y0.o r3 = p.d.p(r25, r26, r27, r28, r29, r30)
            r6 = 25008(0x61b0, float:3.5044E-41)
            r7 = 8
            r2 = 3
            r4 = 0
            r5 = r0
            r8 = r17
            r0 = r33
            r0.m0(r1, r2, r3, r4, r5, r6, r7)
            r9 = r5
            r4 = 0
            r9.p(r4)
        L285:
            java.lang.String r0 = r13.f3432b
            java.lang.Object r1 = r9.j(r8)
            bi.b r1 = (bi.b) r1
            long r2 = r1.g()
            r31 = r4
            r35 = 14
            long r4 = x6.d.D(r35)
            r21 = 0
            r22 = 262122(0x3ffea, float:3.67311E-40)
            r1 = 0
            r6 = 0
            r7 = 0
            r17 = r8
            r8 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r27 = r14
            r14 = 0
            r15 = 0
            r18 = 1
            r16 = 0
            r19 = r17
            r17 = 0
            r20 = r18
            r18 = 0
            r23 = r20
            r20 = 24576(0x6000, float:3.4438E-41)
            r36 = r19
            r37 = r34
            r19 = r91
            sh.s.n(r0, r1, r2, r4, r6, r7, r8, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r0 = r82
            r9 = r19
            java.util.List r1 = r0.f3441k
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L33a
            r1 = -2106094431(0xffffffff82778ca1, float:-1.8187053E-37)
            r9.a0(r1)
            java.util.List r2 = r0.f3441k
            java.lang.Object r1 = r9.P()
            r10 = r37
            if (r1 != r10) goto L2eb
            wb.sr r1 = new wb.sr
            r3 = 3
            r1.<init>(r3)
            r9.k0(r1)
        L2eb:
            r6 = r1
            fg.l r6 = (fg.l) r6
            r7 = 30
            java.lang.String r3 = "\n"
            r4 = 0
            r5 = 0
            java.lang.String r1 = tf.m.A1(r2, r3, r4, r5, r6, r7)
            r7 = r36
            java.lang.Object r2 = r9.j(r7)
            bi.b r2 = (bi.b) r2
            long r2 = r2.h()
            long r4 = x6.d.D(r32)
            r29 = 0
            r30 = 13
            r26 = 0
            r28 = 0
            y0.o r6 = p.d.p(r25, r26, r27, r28, r29, r30)
            r21 = 0
            r22 = 262120(0x3ffe8, float:3.67308E-40)
            r0 = r1
            r1 = r6
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 24624(0x6030, float:3.4506E-41)
            r19 = r91
            sh.s.n(r0, r1, r2, r4, r6, r7, r8, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r9 = r19
            r12 = 0
            r9.p(r12)
        L338:
            r13 = 1
            goto L345
        L33a:
            r12 = 0
            r0 = -2105760282(0xffffffff827ca5e6, float:-1.8561647E-37)
            r9.a0(r0)
            r9.p(r12)
            goto L338
        L345:
            r9.p(r13)
            r9.p(r13)
            r9.p(r13)
            r9.p(r12)
            goto L850
        L353:
            r9 = r0
            r2 = r12
            r0 = r33
            r10 = r34
            r8 = 8
            r12 = 0
            r13 = 1
            r35 = 14
            r3 = -1338969784(0xffffffffb030f148, float:-6.437131E-10)
            r9.a0(r3)
            y0.o r3 = p.h1.d(r2, r11)
            y0.o r3 = r3.d(r4)
            float r4 = (float) r14
            r5 = 10
            float r5 = (float) r5
            y0.o r3 = p.d.m(r3, r4, r5)
            p.e r4 = p.j.f9926c
            p.t r1 = p.s.a(r4, r1, r9, r12)
            long r4 = r9.T
            int r4 = java.lang.Long.hashCode(r4)
            s0.h r5 = r9.l()
            y0.o r3 = y0.a.c(r9, r3)
            x1.f r14 = x1.g.f20914f
            r14.getClass()
            x1.y r14 = x1.f.f20883b
            r9.d0()
            boolean r7 = r9.S
            if (r7 == 0) goto L39b
            r9.k(r14)
            goto L39e
        L39b:
            r9.n0()
        L39e:
            x1.e r7 = x1.f.f20886e
            i0.r.A(r7, r9, r1)
            x1.e r1 = x1.f.f20885d
            i0.r.A(r1, r9, r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            x1.e r5 = x1.f.f20887f
            i0.r.A(r5, r9, r4)
            x1.d r4 = x1.f.f20888g
            i0.r.w(r4, r9)
            r28 = r7
            x1.e r7 = x1.f.f20884c
            i0.r.A(r7, r9, r3)
            r3 = 384(0x180, float:5.38E-43)
            r29 = r7
            java.lang.String r7 = "tool"
            if (r24 == 0) goto L43d
            r8 = 1729379241(0x67143ba9, float:7.000108E23)
            r9.a0(r8)
            if (r83 == 0) goto L402
            r8 = 1729412442(0x6714bd5a, float:7.0240316E23)
            r9.a0(r8)
            java.lang.Long r8 = java.lang.Long.valueOf(r84)
            r33 = 0
            int r31 = (r84 > r33 ? 1 : (r84 == r33 ? 0 : -1))
            if (r31 <= 0) goto L3de
            goto L3df
        L3de:
            r8 = 0
        L3df:
            if (r8 == 0) goto L3e6
            long r33 = r8.longValue()
            goto L3e8
        L3e6:
            r33 = r19
        L3e8:
            int r8 = r23 >> 6
            r8 = r8 & 112(0x70, float:1.57E-43)
            r8 = r8 | r3
            r3 = r86
            r40 = r4
            r4 = r9
            r31 = r25
            r25 = r2
            r9 = r5
            r5 = r8
            r8 = r1
            r1 = r33
            r0.s0(r1, r3, r4, r5)
            r4.p(r12)
            goto L414
        L402:
            r8 = r1
            r40 = r4
            r4 = r9
            r31 = r25
            r25 = r2
            r9 = r5
            r1 = 1729638277(0x67182f85, float:7.186763E23)
            r4.a0(r1)
            r4.p(r12)
        L414:
            r4.p(r12)
            r66 = r0
            r58 = r6
            r67 = r7
            r61 = r8
            r62 = r9
            r64 = r10
            r0 = r12
            r59 = r14
            r53 = r15
            r49 = r17
            r50 = r18
            r54 = r19
            r56 = r26
            r65 = r27
            r60 = r28
            r63 = r29
            r57 = r31
            r48 = 18
            r9 = r4
            goto L4f7
        L43d:
            r8 = r1
            r40 = r4
            r4 = r9
            r1 = r25
            r25 = r2
            r9 = r5
            boolean r2 = gg.l.a(r1, r7)
            if (r2 == 0) goto L4ca
            r2 = 1729693302(0x67190676, float:7.2264126E23)
            r4.a0(r2)
            i0.m2 r2 = bi.d.f892a
            java.lang.Object r2 = r4.j(r2)
            bi.b r2 = (bi.b) r2
            long r2 = r2.j()
            long r4 = x6.d.D(r32)
            r31 = r6
            m2.k r6 = m2.k.f8698j
            r33 = 2
            r21 = 0
            r34 = 4
            r22 = 262058(0x3ffaa, float:3.67221E-40)
            r36 = r0
            java.lang.String r0 = "工具调用"
            r37 = r1
            r1 = 0
            r38 = r7
            r7 = 0
            r39 = r8
            r41 = r9
            r8 = 0
            r42 = r10
            r10 = 0
            r43 = r11
            r44 = r12
            r11 = 0
            r45 = r13
            r13 = 0
            r46 = r14
            r14 = 0
            r47 = r15
            r15 = 0
            r48 = 18
            r16 = 0
            r49 = r17
            r17 = 0
            r50 = r18
            r18 = 0
            r51 = r19
            r20 = 1597446(0x186006, float:2.238499E-39)
            r19 = r91
            r56 = r26
            r65 = r27
            r60 = r28
            r63 = r29
            r58 = r31
            r66 = r36
            r57 = r37
            r67 = r38
            r61 = r39
            r62 = r41
            r64 = r42
            r59 = r46
            r53 = r47
            r54 = r51
            sh.s.n(r0, r1, r2, r4, r6, r7, r8, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r9 = r19
            r0 = 0
            r9.p(r0)
            goto L4f7
        L4ca:
            r66 = r0
            r57 = r1
            r58 = r6
            r67 = r7
            r61 = r8
            r62 = r9
            r64 = r10
            r0 = r12
            r59 = r14
            r53 = r15
            r49 = r17
            r50 = r18
            r54 = r19
            r56 = r26
            r65 = r27
            r60 = r28
            r63 = r29
            r48 = 18
            r9 = r4
            r1 = 1729922981(0x671c87a5, float:7.391914E23)
            r9.a0(r1)
            r9.p(r0)
        L4f7:
            r1 = r23 & 14
            r2 = 48
            r1 = r1 | r2
            r3 = r82
            r4 = r66
            r4.n0(r3, r9, r1)
            r4.q0(r3, r9, r1)
            r1 = r57
            r5 = r67
            boolean r6 = gg.l.a(r1, r5)
            java.lang.String r7 = "interrupted"
            if (r6 != 0) goto L5bc
            boolean r6 = og.m.t0(r50)
            if (r6 == 0) goto L5bc
            if (r24 != 0) goto L5bc
            r6 = 1730142833(0x671fe271, float:7.550334E23)
            r9.a0(r6)
            r6 = r56
            boolean r8 = gg.l.a(r6, r7)
            if (r8 == 0) goto L52b
            java.lang.String r8 = "已中断，尚未收到回复"
            goto L52d
        L52b:
            java.lang.String r8 = "本轮没有返回可显示内容"
        L52d:
            i0.m2 r10 = bi.d.f892a
            java.lang.Object r10 = r9.j(r10)
            bi.b r10 = (bi.b) r10
            long r10 = r10.g()
            r36 = r4
            r67 = r5
            long r4 = x6.d.D(r35)
            boolean r12 = r49.isEmpty()
            if (r12 != 0) goto L54e
            r12 = 8
            float r13 = (float) r12
            r27 = r13
            r13 = 4
            goto L554
        L54e:
            r12 = 8
            r13 = 4
            float r14 = (float) r13
            r27 = r14
        L554:
            r29 = 0
            r30 = 13
            r26 = 0
            r28 = 0
            y0.o r14 = p.d.p(r25, r26, r27, r28, r29, r30)
            r21 = 0
            r22 = 262120(0x3ffe8, float:3.67308E-40)
            r56 = r6
            r6 = 0
            r15 = r7
            r7 = 0
            r31 = r0
            r0 = r8
            r8 = 0
            r79 = r10
            r11 = r2
            r2 = r79
            r10 = 0
            r16 = r11
            r69 = r12
            r11 = 0
            r68 = r13
            r13 = 0
            r37 = r1
            r1 = r14
            r14 = 0
            r17 = r15
            r15 = 0
            r18 = r16
            r16 = 0
            r19 = r17
            r17 = 0
            r20 = r18
            r18 = 0
            r24 = r20
            r20 = 24576(0x6000, float:3.4438E-41)
            r72 = r19
            r73 = r36
            r71 = r37
            r70 = r56
            r74 = r67
            r19 = r91
            sh.s.n(r0, r1, r2, r4, r6, r7, r8, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r9 = r19
            r0 = 0
            r9.p(r0)
            r11 = r82
            r10 = r0
            r78 = r25
            r6 = r70
            r76 = r71
            r15 = r72
            r77 = r74
            r12 = 8
            r13 = 4
            goto L6b6
        L5bc:
            r73 = r4
            r72 = r7
            r70 = r56
            r2 = r5
            boolean r3 = gg.l.a(r1, r2)
            if (r3 != 0) goto L69e
            r3 = 1730612359(0x67270c87, float:7.888663E23)
            r9.a0(r3)
            r4 = r65
            r3 = r70
            boolean r4 = gg.l.a(r3, r4)
            if (r4 == 0) goto L63f
            r4 = 1730660750(0x6727c98e, float:7.923532E23)
            r9.a0(r4)
            r4 = r82
            r31 = r0
            java.lang.String r0 = r4.f3432b
            i0.m2 r5 = bi.d.f892a
            java.lang.Object r5 = r9.j(r5)
            bi.b r5 = (bi.b) r5
            long r5 = r5.g()
            r67 = r2
            r56 = r3
            r2 = r5
            long r4 = x6.d.D(r35)
            r6 = 4
            float r7 = (float) r6
            r29 = 0
            r30 = 13
            r26 = 0
            r28 = 0
            r27 = r7
            y0.o r7 = p.d.p(r25, r26, r27, r28, r29, r30)
            r21 = 0
            r22 = 262120(0x3ffe8, float:3.67308E-40)
            r68 = r6
            r6 = 0
            r37 = r1
            r1 = r7
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 24624(0x6030, float:3.4506E-41)
            r19 = r91
            r78 = r25
            r76 = r37
            r75 = r56
            r77 = r67
            sh.s.n(r0, r1, r2, r4, r6, r7, r8, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r9 = r19
            r10 = 0
            r9.p(r10)
            r11 = r82
            r12 = 8
            r13 = 4
            goto L696
        L63f:
            r10 = r0
            r76 = r1
            r77 = r2
            r75 = r3
            r78 = r25
            r0 = 1730944431(0x672c1daf, float:8.127946E23)
            r9.a0(r0)
            r11 = r82
            java.lang.String r2 = r11.f3432b
            boolean r0 = r49.isEmpty()
            if (r0 != 0) goto L65d
            r12 = 8
            float r0 = (float) r12
            r13 = 4
            goto L661
        L65d:
            r12 = 8
            r13 = 4
            float r0 = (float) r13
        L661:
            r1 = 0
            r3 = 13
            p.z0 r3 = p.d.b(r0, r1, r3)
            long r4 = x6.d.D(r35)
            r1 = r58
            boolean r0 = r9.h(r1)
            java.lang.Object r6 = r9.P()
            if (r0 != 0) goto L67c
            r0 = r64
            if (r6 != r0) goto L685
        L67c:
            fb.f1 r6 = new fb.f1
            r0 = 3
            r6.<init>(r1, r0)
            r9.k0(r6)
        L685:
            fg.l r6 = (fg.l) r6
            r8 = 199680(0x30c00, float:2.79811E-40)
            r9 = 0
            wb.y2 r0 = wb.y2.f20284i
            r7 = r91
            r0.i(r1, r2, r3, r4, r6, r7, r8, r9)
            r9 = r7
            r9.p(r10)
        L696:
            r9.p(r10)
        L699:
            r15 = r72
            r6 = r75
            goto L6b6
        L69e:
            r11 = r82
            r10 = r0
            r76 = r1
            r77 = r2
            r78 = r25
            r75 = r70
            r12 = 8
            r13 = 4
            r0 = 1731656005(0x6736f945, float:8.640689E23)
            r9.a0(r0)
            r9.p(r10)
            goto L699
        L6b6:
            boolean r0 = gg.l.a(r6, r15)
            if (r0 != 0) goto L6d6
            java.lang.String r0 = "error"
            boolean r0 = gg.l.a(r6, r0)
            if (r0 == 0) goto L6c5
            goto L6d6
        L6c5:
            r0 = 1733219397(0x674ed445, float:9.767232E23)
            r9.a0(r0)
            r9.p(r10)
            r14 = r10
            r7 = 1
        L6d0:
            r1 = r76
            r5 = r77
            goto L80d
        L6d6:
            r0 = 1731780780(0x6738e0ac, float:8.730599E23)
            r9.a0(r0)
            r2 = r78
            r0 = 1065353216(0x3f800000, float:1.0)
            y0.o r16 = p.h1.d(r2, r0)
            float r1 = (float) r13
            r20 = 0
            r21 = 13
            r17 = 0
            r19 = 0
            r18 = r1
            y0.o r1 = p.d.p(r16, r17, r18, r19, r20, r21)
            y0.f r2 = y0.b.f21802q
            p.c r3 = p.j.f9924a
            r4 = 48
            p.e1 r2 = p.d1.a(r3, r2, r9, r4)
            long r3 = r9.T
            int r3 = java.lang.Long.hashCode(r3)
            s0.h r4 = r9.l()
            y0.o r1 = y0.a.c(r9, r1)
            r9.d0()
            boolean r5 = r9.S
            if (r5 == 0) goto L71a
            r5 = r59
            r9.k(r5)
        L717:
            r5 = r60
            goto L71e
        L71a:
            r9.n0()
            goto L717
        L71e:
            i0.r.A(r5, r9, r2)
            r8 = r61
            i0.r.A(r8, r9, r4)
            r4 = r40
            r2 = r62
            j8.b.p(r3, r9, r2, r9, r4)
            r2 = r63
            i0.r.A(r2, r9, r1)
            boolean r1 = gg.l.a(r6, r15)
            if (r1 == 0) goto L73b
            java.lang.String r1 = "已中断"
            goto L73d
        L73b:
            java.lang.String r1 = "请求失败"
        L73d:
            i0.m2 r2 = bi.d.f892a
            java.lang.Object r2 = r9.j(r2)
            bi.b r2 = (bi.b) r2
            long r2 = r2.h()
            long r4 = x6.d.D(r32)
            double r6 = (double) r0
            r13 = 0
            int r6 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r6 <= 0) goto L756
        L754:
            r6 = r1
            goto L75c
        L756:
            java.lang.String r6 = "invalid weight; must be greater than zero"
            q.a.a(r6)
            goto L754
        L75c:
            p.q0 r1 = new p.q0
            r7 = 1
            r1.<init>(r0, r7)
            r21 = 0
            r22 = 262120(0x3ffe8, float:3.67308E-40)
            r0 = r6
            r6 = 0
            r20 = r7
            r7 = 0
            r8 = 0
            r31 = r10
            r10 = 0
            r69 = r12
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r38 = r20
            r20 = 24576(0x6000, float:3.4438E-41)
            r19 = r91
            sh.s.n(r0, r1, r2, r4, r6, r7, r8, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r9 = r19
            r12 = 102432774(0x61b0006, float:2.9152277E-35)
            r13 = 30
            if (r89 == 0) goto L7c0
            r0 = -1331408622(0xffffffffb0a45112, float:-1.1955612E-9)
            r9.a0(r0)
            r14 = 0
            float r5 = (float) r14
            float r6 = (float) r13
            r15 = 8
            float r0 = (float) r15
            r1 = 2
            float r2 = (float) r1
            p.z0 r8 = new p.z0
            r8.<init>(r0, r2, r0, r2)
            sh.q1 r7 = sh.c.a(r9)
            int r0 = r23 >> 15
            r0 = r0 & 112(0x70, float:1.57E-43)
            r10 = r0 | r12
            r11 = 1564(0x61c, float:2.192E-42)
            java.lang.String r0 = "继续任务"
            r2 = 0
            r3 = 0
            r4 = 0
            r16 = r12
            r12 = r1
            r1 = r89
            sh.s.o(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r9.p(r14)
            goto L7cf
        L7c0:
            r16 = r12
            r12 = 2
            r14 = 0
            r15 = 8
            r0 = -1331008164(0xffffffffb0aa6d5c, float:-1.240021E-9)
            r9.a0(r0)
            r9.p(r14)
        L7cf:
            if (r90 == 0) goto L7fb
            r0 = -1330928587(0xffffffffb0aba435, float:-1.2488558E-9)
            r9.a0(r0)
            float r5 = (float) r14
            float r6 = (float) r13
            float r0 = (float) r15
            float r1 = (float) r12
            p.z0 r8 = new p.z0
            r8.<init>(r0, r1, r0, r1)
            sh.q1 r7 = sh.c.a(r9)
            int r0 = r23 >> 18
            r0 = r0 & 112(0x70, float:1.57E-43)
            r10 = r0 | r16
            r11 = 1564(0x61c, float:2.192E-42)
            java.lang.String r0 = "重新开始"
            r2 = 0
            r3 = 0
            r4 = 0
            r1 = r90
            sh.s.o(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r9.p(r14)
        L7f9:
            r7 = 1
            goto L805
        L7fb:
            r0 = -1330531012(0xffffffffb0b1b53c, float:-1.2929955E-9)
            r9.a0(r0)
            r9.p(r14)
            goto L7f9
        L805:
            r9.p(r7)
            r9.p(r14)
            goto L6d0
        L80d:
            boolean r0 = gg.l.a(r1, r5)
            if (r0 != 0) goto L83c
            boolean r0 = og.m.t0(r53)
            if (r0 != 0) goto L83c
            r0 = 1733292061(0x674ff01d, float:9.819592E23)
            r9.a0(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "message:"
            r0.<init>(r1)
            r1 = r54
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r53
            r4 = r73
            r2 = 384(0x180, float:5.38E-43)
            r4.U(r0, r1, r9, r2)
            r9.p(r14)
            goto L845
        L83c:
            r0 = 1733392005(0x67517685, float:9.891609E23)
            r9.a0(r0)
            r9.p(r14)
        L845:
            r9.p(r7)
            r9.p(r14)
            goto L850
        L84c:
            r9 = r0
            r9.V()
        L850:
            i0.r1 r13 = r9.t()
            if (r13 == 0) goto L872
            wb.es r0 = new wb.es
            r12 = 2
            r1 = r81
            r2 = r82
            r3 = r83
            r4 = r84
            r6 = r86
            r7 = r87
            r8 = r88
            r9 = r89
            r10 = r90
            r11 = r92
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11, r12)
            r13.f6035d = r0
        L872:
            return
    }

    public void c(int r41, int r42, fg.l r43, i0.h0 r44, java.lang.String r45) {
            r40 = this;
            r4 = r44
            r0 = -107108605(0xfffffffff99da703, float:-1.0232225E35)
            r4.b0(r0)
            r0 = r41 & 6
            r1 = 4
            if (r0 != 0) goto L19
            boolean r0 = r44.f(r45)
            if (r0 == 0) goto L15
            r0 = r1
            goto L16
        L15:
            r0 = 2
        L16:
            r0 = r41 | r0
            goto L1b
        L19:
            r0 = r41
        L1b:
            r2 = r42 & 2
            if (r2 == 0) goto L26
            r0 = r0 | 48
        L21:
            r5 = r43
        L23:
            r23 = r0
            goto L39
        L26:
            r5 = r41 & 48
            if (r5 != 0) goto L21
            r5 = r43
            boolean r6 = r4.h(r5)
            if (r6 == 0) goto L35
            r6 = 32
            goto L37
        L35:
            r6 = 16
        L37:
            r0 = r0 | r6
            goto L23
        L39:
            r0 = r23 & 19
            r6 = 18
            r7 = 0
            r8 = 1
            if (r0 == r6) goto L43
            r0 = r8
            goto L44
        L43:
            r0 = r7
        L44:
            r6 = r23 & 1
            boolean r0 = r4.S(r6, r0)
            if (r0 == 0) goto L259
            if (r2 == 0) goto L50
            r0 = 0
            goto L51
        L50:
            r0 = r5
        L51:
            y0.l r2 = y0.l.f21818a
            r5 = 1065353216(0x3f800000, float:1.0)
            y0.o r6 = p.h1.d(r2, r5)
            r9 = 6
            float r9 = (float) r9
            r10 = 0
            y0.o r6 = p.d.n(r6, r10, r9, r8)
            r10 = 8
            float r10 = (float) r10
            v.d r11 = v.e.a(r10)
            y0.o r6 = c1.h.b(r6, r11)
            i0.m2 r11 = bi.d.f892a
            java.lang.Object r12 = r4.j(r11)
            bi.b r12 = (bi.b) r12
            long r12 = r12.n()
            f1.m0 r14 = f1.c0.f3038b
            y0.o r6 = k.n.g(r6, r12, r14)
            p.e r12 = p.j.f9926c
            y0.e r13 = y0.b.f21804s
            p.t r12 = p.s.a(r12, r13, r4, r7)
            long r13 = r4.T
            int r13 = java.lang.Long.hashCode(r13)
            s0.h r14 = r4.l()
            y0.o r6 = y0.a.c(r4, r6)
            x1.f r15 = x1.g.f20914f
            r15.getClass()
            x1.y r15 = x1.f.f20883b
            r4.d0()
            boolean r3 = r4.S
            if (r3 == 0) goto La5
            r4.k(r15)
            goto La8
        La5:
            r4.n0()
        La8:
            x1.e r3 = x1.f.f20886e
            i0.r.A(r3, r4, r12)
            x1.e r12 = x1.f.f20885d
            i0.r.A(r12, r4, r14)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            x1.e r14 = x1.f.f20887f
            i0.r.A(r14, r4, r13)
            x1.d r13 = x1.f.f20888g
            i0.r.w(r13, r4)
            x1.e r7 = x1.f.f20884c
            i0.r.A(r7, r4, r6)
            r6 = 10
            if (r0 == 0) goto L1ff
            r8 = 8600098(0x833a22, float:1.2051304E-38)
            r4.a0(r8)
            y0.o r24 = p.h1.d(r2, r5)
            float r8 = (float) r6
            float r6 = (float) r1
            r28 = 0
            r29 = 8
            r27 = r6
            r26 = r6
            r25 = r8
            y0.o r6 = p.d.p(r24, r25, r26, r27, r28, r29)
            y0.f r8 = y0.b.f21802q
            p.c r1 = p.j.f9924a
            r5 = 48
            p.e1 r1 = p.d1.a(r1, r8, r4, r5)
            r5 = r9
            long r8 = r4.T
            int r8 = java.lang.Long.hashCode(r8)
            s0.h r9 = r4.l()
            y0.o r6 = y0.a.c(r4, r6)
            r4.d0()
            r21 = r0
            boolean r0 = r4.S
            if (r0 == 0) goto L109
            r4.k(r15)
            goto L10c
        L109:
            r4.n0()
        L10c:
            i0.r.A(r3, r4, r1)
            i0.r.A(r12, r4, r9)
            j8.b.p(r8, r4, r14, r4, r13)
            i0.r.A(r7, r4, r6)
            java.lang.Object r0 = r4.j(r11)
            bi.b r0 = (bi.b) r0
            long r0 = r0.h()
            r3 = 11
            long r6 = x6.d.D(r3)
            r3 = 1065353216(0x3f800000, float:1.0)
            double r8 = (double) r3
            r12 = 0
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 <= 0) goto L133
        L131:
            r8 = r0
            goto L139
        L133:
            java.lang.String r8 = "invalid weight; must be greater than zero"
            q.a.a(r8)
            goto L131
        L139:
            p.q0 r1 = new p.q0
            r0 = 1
            r1.<init>(r3, r0)
            r3 = r21
            r21 = 0
            r22 = 262120(0x3ffe8, float:3.67308E-40)
            r18 = r0
            java.lang.String r0 = "代码"
            r38 = r6
            r7 = r5
            r4 = r38
            r6 = 0
            r12 = r7
            r7 = 0
            r14 = r2
            r13 = r3
            r2 = r8
            r8 = 0
            r15 = r10
            r10 = 0
            r24 = r11
            r20 = r12
            r11 = 0
            r25 = r13
            r13 = 0
            r27 = r14
            r14 = 0
            r28 = r15
            r15 = 0
            r29 = 32
            r16 = 0
            r30 = 0
            r17 = 0
            r31 = r18
            r18 = 0
            r32 = r20
            r20 = 24582(0x6006, float:3.4447E-41)
            r19 = r44
            r36 = r24
            r33 = r25
            r37 = r27
            r35 = r28
            r34 = r32
            sh.s.n(r0, r1, r2, r4, r6, r7, r8, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r4 = r19
            m1.f r0 = wb.ap.f15074o
            r6 = r36
            java.lang.Object r1 = r4.j(r6)
            bi.b r1 = (bi.b) r1
            long r1 = r1.h()
            f1.n r3 = new f1.n
            r5 = 5
            r3.<init>(r1, r5)
            r1 = 26
            float r1 = (float) r1
            r14 = r37
            y0.o r1 = p.h1.j(r14, r1)
            v.d r2 = v.e.a(r26)
            y0.o r7 = c1.h.b(r1, r2)
            r1 = r23 & 112(0x70, float:1.57E-43)
            r2 = 32
            if (r1 != r2) goto L1b6
            r1 = 1
            goto L1b7
        L1b6:
            r1 = 0
        L1b7:
            r2 = r23 & 14
            r5 = 4
            if (r2 != r5) goto L1be
            r2 = 1
            goto L1bf
        L1be:
            r2 = 0
        L1bf:
            r1 = r1 | r2
            java.lang.Object r2 = r4.P()
            if (r1 != 0) goto L1d0
            i0.e r1 = i0.l.f5952a
            if (r2 != r1) goto L1cb
            goto L1d0
        L1cb:
            r13 = r45
            r15 = r33
            goto L1dd
        L1d0:
            wb.u4 r2 = new wb.u4
            r1 = 0
            r13 = r45
            r15 = r33
            r2.<init>(r1, r15, r13)
            r4.k0(r2)
        L1dd:
            r11 = r2
            fg.a r11 = (fg.a) r11
            r12 = 15
            r8 = 0
            r9 = 0
            r10 = 0
            y0.o r1 = k.n.j(r7, r8, r9, r10, r11, r12)
            r12 = r34
            y0.o r2 = p.d.l(r1, r12)
            java.lang.String r1 = "复制代码"
            r5 = 54
            k.n.c(r0, r1, r2, r3, r4, r5)
            r0 = 1
            r4.p(r0)
            r1 = 0
            r4.p(r1)
            goto L211
        L1ff:
            r13 = r45
            r15 = r0
            r14 = r2
            r0 = r8
            r35 = r10
            r6 = r11
            r1 = 0
            r2 = 9437129(0x8fffc9, float:1.3224234E-38)
            r4.a0(r2)
            r4.p(r1)
        L211:
            java.lang.Object r1 = r4.j(r6)
            bi.b r1 = (bi.b) r1
            long r2 = r1.g()
            r1 = 12
            long r5 = x6.d.D(r1)
            r1 = 10
            float r1 = (float) r1
            r7 = r35
            y0.o r1 = p.d.m(r14, r1, r7)
            r7 = r23 & 14
            r7 = r7 | 24624(0x6030, float:3.4506E-41)
            r21 = 0
            r22 = 261992(0x3ff68, float:3.67129E-40)
            r4 = r5
            r6 = 0
            r20 = r7
            m2.m r7 = m2.p.f8705b
            r8 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r33 = r15
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = r44
            r0 = r45
            sh.s.n(r0, r1, r2, r4, r6, r7, r8, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r4 = r19
            r0 = 1
            r4.p(r0)
            r18 = r33
            goto L25e
        L259:
            r4.V()
            r18 = r5
        L25e:
            i0.r1 r0 = r4.t()
            if (r0 == 0) goto L275
            s.i0 r15 = new s.i0
            r21 = 1
            r16 = r40
            r19 = r41
            r20 = r42
            r17 = r45
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r0.f6035d = r15
        L275:
            return
    }

    public void c0(fb.c r23, fg.a r24, i0.h0 r25, int r26) {
            r22 = this;
            r2 = r23
            r12 = r24
            r0 = r25
            r1 = 1339031397(0x4fcfff65, float:6.9792425E9)
            r0.b0(r1)
            r1 = r26 & 6
            if (r1 != 0) goto L25
            r1 = r26 & 8
            if (r1 != 0) goto L19
            boolean r1 = r0.f(r2)
            goto L1d
        L19:
            boolean r1 = r0.h(r2)
        L1d:
            if (r1 == 0) goto L21
            r1 = 4
            goto L22
        L21:
            r1 = 2
        L22:
            r1 = r26 | r1
            goto L27
        L25:
            r1 = r26
        L27:
            r3 = r26 & 48
            if (r3 != 0) goto L37
            boolean r3 = r0.h(r12)
            if (r3 == 0) goto L34
            r3 = 32
            goto L36
        L34:
            r3 = 16
        L36:
            r1 = r1 | r3
        L37:
            r3 = r1 & 19
            r4 = 18
            if (r3 == r4) goto L3f
            r3 = 1
            goto L40
        L3f:
            r3 = 0
        L40:
            r4 = r1 & 1
            boolean r3 = r0.S(r4, r3)
            if (r3 == 0) goto Lb2
            java.lang.String r3 = r2.f3444n
            int r4 = r3.hashCode()
            r5 = -1947652542(0xffffffff8be92e42, float:-8.9817936E-32)
            if (r4 == r5) goto L76
            r5 = -315615134(0xffffffffed301862, float:-3.4061774E27)
            if (r4 == r5) goto L6a
            r5 = 96784904(0x5c4d208, float:1.8508905E-35)
            if (r4 == r5) goto L5e
            goto L7e
        L5e:
            java.lang.String r4 = "error"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L67
            goto L7e
        L67:
            java.lang.String r3 = "请求失败"
            goto L83
        L6a:
            java.lang.String r4 = "streaming"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L73
            goto L7e
        L73:
            java.lang.String r3 = "生成中"
            goto L83
        L76:
            java.lang.String r4 = "interrupted"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L81
        L7e:
            java.lang.String r3 = "已完成"
            goto L83
        L81:
            java.lang.String r3 = "已中断"
        L83:
            wb.rj r4 = new wb.rj
            r5 = 21
            r4.<init>(r2, r3, r12, r5)
            r3 = -1165375580(0xffffffffba89c7a4, float:-0.0010511768)
            s0.d r18 = s0.i.e(r3, r4, r0)
            int r1 = r1 << 21
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r1 = r1 & r3
            r1 = r1 | 390(0x186, float:5.47E-43)
            r21 = 3072(0xc00, float:4.305E-42)
            r3 = 0
            java.lang.String r4 = "消息信息"
            r5 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r17 = 0
            r19 = r0
            r20 = r1
            oh.h.d(r3, r4, r5, r7, r9, r11, r12, r13, r15, r17, r18, r19, r20, r21)
            goto Lb5
        Lb2:
            r25.V()
        Lb5:
            i0.r1 r6 = r25.t()
            if (r6 == 0) goto Lca
            b0.r r0 = new b0.r
            r5 = 16
            r1 = r22
            r3 = r24
            r4 = r26
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f6035d = r0
        Lca:
            return
    }

    @Override // wb.kv
    public void close() {
            r0 = this;
            return
    }

    public void d(int r28, fg.a r29, i0.h0 r30, java.lang.String r31, java.lang.String r32, y0.o r33, boolean r34) {
            r27 = this;
            r0 = r30
            r1 = r32
            r2 = r33
            r3 = r34
            r4 = 1446208944(0x563365b0, float:4.931233E13)
            r0.b0(r4)
            boolean r4 = r0.f(r1)
            if (r4 == 0) goto L17
            r4 = 32
            goto L19
        L17:
            r4 = 16
        L19:
            r4 = r28 | r4
            boolean r5 = r0.g(r3)
            if (r5 == 0) goto L24
            r5 = 256(0x100, float:3.59E-43)
            goto L26
        L24:
            r5 = 128(0x80, float:1.8E-43)
        L26:
            r4 = r4 | r5
            boolean r5 = r0.f(r2)
            if (r5 == 0) goto L30
            r5 = 16384(0x4000, float:2.2959E-41)
            goto L32
        L30:
            r5 = 8192(0x2000, float:1.148E-41)
        L32:
            r4 = r4 | r5
            r5 = r4 & 9363(0x2493, float:1.312E-41)
            r6 = 9362(0x2492, float:1.3119E-41)
            r7 = 0
            r8 = 1
            if (r5 == r6) goto L3d
            r5 = r8
            goto L3e
        L3d:
            r5 = r7
        L3e:
            r6 = r4 & 1
            boolean r5 = r0.S(r6, r5)
            if (r5 == 0) goto L1c5
            if (r3 == 0) goto L5e
            r5 = -1762601481(0xffffffff96f0d5f7, float:-3.8909122E-25)
            r0.a0(r5)
            i0.m2 r5 = bi.d.f892a
            java.lang.Object r5 = r0.j(r5)
            bi.b r5 = (bi.b) r5
            long r5 = r5.j()
        L5a:
            r0.p(r7)
            goto L78
        L5e:
            r5 = -1762600061(0xffffffff96f0db83, float:-3.8912623E-25)
            r0.a0(r5)
            i0.m2 r5 = bi.d.f892a
            java.lang.Object r5 = r0.j(r5)
            bi.b r5 = (bi.b) r5
            long r5 = r5.i()
            r9 = 1055286886(0x3ee66666, float:0.45)
            long r5 = f1.w.b(r5, r9)
            goto L5a
        L78:
            r9 = 8
            float r9 = (float) r9
            v.d r10 = v.e.a(r9)
            y0.o r10 = c1.h.b(r2, r10)
            float r11 = (float) r8
            v.d r12 = v.e.a(r9)
            f1.t0 r13 = new f1.t0
            r13.<init>(r5)
            k.t r5 = new k.t
            r5.<init>(r11, r13, r12)
            y0.o r14 = r10.d(r5)
            r17 = 0
            r19 = 15
            r15 = 0
            r16 = 0
            r18 = r29
            y0.o r5 = k.n.j(r14, r15, r16, r17, r18, r19)
            r6 = 10
            float r6 = (float) r6
            y0.o r5 = p.d.m(r5, r6, r9)
            y0.f r6 = y0.b.f21802q
            p.h r9 = p.j.g(r9)
            r10 = 54
            p.e1 r6 = p.d1.a(r9, r6, r0, r10)
            long r9 = r0.T
            int r9 = java.lang.Long.hashCode(r9)
            s0.h r10 = r0.l()
            y0.o r5 = y0.a.c(r0, r5)
            x1.f r11 = x1.g.f20914f
            r11.getClass()
            x1.y r11 = x1.f.f20883b
            r0.d0()
            boolean r12 = r0.S
            if (r12 == 0) goto Ld6
            r0.k(r11)
            goto Ld9
        Ld6:
            r0.n0()
        Ld9:
            x1.e r12 = x1.f.f20886e
            i0.r.A(r12, r0, r6)
            x1.e r6 = x1.f.f20885d
            i0.r.A(r6, r0, r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            x1.e r10 = x1.f.f20887f
            i0.r.A(r10, r0, r9)
            x1.d r9 = x1.f.f20888g
            i0.r.w(r9, r0)
            x1.e r13 = x1.f.f20884c
            i0.r.A(r13, r0, r5)
            int r4 = r4 >> 3
            r4 = r4 & 14
            r4 = r4 | 48
            wb.y2 r5 = wb.y2.f20285j
            r5.e(r1, r0, r4)
            p.e r4 = p.j.f9926c
            y0.e r5 = y0.b.f21804s
            p.t r4 = p.s.a(r4, r5, r0, r7)
            long r14 = r0.T
            int r5 = java.lang.Long.hashCode(r14)
            s0.h r7 = r0.l()
            y0.l r14 = y0.l.f21818a
            y0.o r14 = y0.a.c(r0, r14)
            r0.d0()
            boolean r15 = r0.S
            if (r15 == 0) goto L124
            r0.k(r11)
            goto L127
        L124:
            r0.n0()
        L127:
            i0.r.A(r12, r0, r4)
            i0.r.A(r6, r0, r7)
            j8.b.p(r5, r0, r10, r0, r9)
            i0.r.A(r13, r0, r14)
            i0.m2 r4 = bi.d.f892a
            java.lang.Object r5 = r0.j(r4)
            bi.b r5 = (bi.b) r5
            long r5 = r5.g()
            r7 = 12
            long r9 = x6.d.D(r7)
            r21 = 0
            r22 = 262122(0x3ffea, float:3.67311E-40)
            r1 = 0
            r2 = r5
            r6 = 0
            r7 = 0
            r25 = r9
            r10 = r4
            r4 = r25
            r11 = r8
            r8 = 0
            r12 = r10
            r10 = 0
            r14 = r11
            r13 = r12
            r11 = 0
            r15 = r13
            r13 = 0
            r16 = r14
            r14 = 0
            r17 = r15
            r15 = 0
            r18 = r16
            r16 = 0
            r19 = r17
            r17 = 0
            r20 = r18
            r18 = 0
            r23 = r20
            r20 = 24582(0x6006, float:3.4447E-41)
            r24 = r19
            r19 = r0
            r0 = r31
            sh.s.n(r0, r1, r2, r4, r6, r7, r8, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r0 = r19
            int r1 = r32.length()
            if (r1 != 0) goto L18a
            java.lang.String r1 = "未设置"
        L187:
            r10 = r24
            goto L18d
        L18a:
            r1 = r32
            goto L187
        L18d:
            java.lang.Object r2 = r0.j(r10)
            bi.b r2 = (bi.b) r2
            long r2 = r2.h()
            r4 = 11
            long r4 = x6.d.D(r4)
            r21 = 0
            r22 = 262122(0x3ffea, float:3.67311E-40)
            r0 = r1
            r1 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 24576(0x6000, float:3.4438E-41)
            r19 = r30
            sh.s.n(r0, r1, r2, r4, r6, r7, r8, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r0 = r19
            r11 = 1
            r0.p(r11)
            r0.p(r11)
            goto L1c8
        L1c5:
            r0.V()
        L1c8:
            i0.r1 r8 = r0.t()
            if (r8 == 0) goto L1e3
            wb.z4 r0 = new wb.z4
            r5 = r27
            r1 = r28
            r2 = r29
            r3 = r31
            r4 = r32
            r6 = r33
            r7 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.f6035d = r0
        L1e3:
            return
    }

    public void d0(fb.c r20, fg.a r21, fg.a r22, fg.a r23, fg.a r24, fg.a r25, fg.a r26, fg.a r27, fg.a r28, fg.a r29, fg.a r30, i0.h0 r31, int r32, int r33) {
            r19 = this;
            r0 = r31
            r1 = -648313368(0xffffffffd95b85e8, float:-3.8618907E15)
            r0.b0(r1)
            r4 = r20
            boolean r1 = r0.f(r4)
            r2 = 4
            r3 = 2
            if (r1 == 0) goto L14
            r1 = r2
            goto L15
        L14:
            r1 = r3
        L15:
            r1 = r32 | r1
            r6 = r22
            boolean r5 = r0.h(r6)
            if (r5 == 0) goto L22
            r5 = 256(0x100, float:3.59E-43)
            goto L24
        L22:
            r5 = 128(0x80, float:1.8E-43)
        L24:
            r1 = r1 | r5
            r7 = r23
            boolean r5 = r0.h(r7)
            if (r5 == 0) goto L30
            r5 = 2048(0x800, float:2.87E-42)
            goto L32
        L30:
            r5 = 1024(0x400, float:1.435E-42)
        L32:
            r1 = r1 | r5
            r5 = r24
            boolean r8 = r0.h(r5)
            if (r8 == 0) goto L3e
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L40
        L3e:
            r8 = 8192(0x2000, float:1.148E-41)
        L40:
            r1 = r1 | r8
            r9 = r25
            boolean r8 = r0.h(r9)
            if (r8 == 0) goto L4c
            r8 = 131072(0x20000, float:1.83671E-40)
            goto L4e
        L4c:
            r8 = 65536(0x10000, float:9.1835E-41)
        L4e:
            r1 = r1 | r8
            r10 = r26
            boolean r8 = r0.h(r10)
            if (r8 == 0) goto L5a
            r8 = 1048576(0x100000, float:1.469368E-39)
            goto L5c
        L5a:
            r8 = 524288(0x80000, float:7.34684E-40)
        L5c:
            r1 = r1 | r8
            r8 = r27
            boolean r11 = r0.h(r8)
            if (r11 == 0) goto L68
            r11 = 8388608(0x800000, float:1.1754944E-38)
            goto L6a
        L68:
            r11 = 4194304(0x400000, float:5.877472E-39)
        L6a:
            r1 = r1 | r11
            r12 = r28
            boolean r11 = r0.h(r12)
            if (r11 == 0) goto L76
            r11 = 67108864(0x4000000, float:1.5046328E-36)
            goto L78
        L76:
            r11 = 33554432(0x2000000, float:9.403955E-38)
        L78:
            r1 = r1 | r11
            r13 = r29
            boolean r11 = r0.h(r13)
            if (r11 == 0) goto L84
            r11 = 536870912(0x20000000, float:1.0842022E-19)
            goto L86
        L84:
            r11 = 268435456(0x10000000, float:2.524355E-29)
        L86:
            r1 = r1 | r11
            r11 = r33 & 6
            if (r11 != 0) goto L98
            r11 = r30
            boolean r14 = r0.h(r11)
            if (r14 == 0) goto L94
            goto L95
        L94:
            r2 = r3
        L95:
            r2 = r33 | r2
            goto L9c
        L98:
            r11 = r30
            r2 = r33
        L9c:
            r14 = 306783379(0x12492493, float:6.34695E-28)
            r14 = r14 & r1
            r15 = 306783378(0x12492492, float:6.3469493E-28)
            r16 = 1
            if (r14 != r15) goto Lae
            r2 = r2 & 3
            if (r2 == r3) goto Lac
            goto Lae
        Lac:
            r2 = 0
            goto Lb0
        Lae:
            r2 = r16
        Lb0:
            r1 = r1 & 1
            boolean r1 = r0.S(r1, r2)
            if (r1 == 0) goto Le7
            c9.e0 r2 = new c9.e0
            r3 = r6
            r6 = r9
            r9 = r12
            r12 = r4
            r4 = r7
            r7 = r10
            r10 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = 1582317735(0x5e5040a7, float:3.7515444E18)
            s0.d r15 = s0.i.e(r1, r2, r0)
            r17 = 100663686(0x6000186, float:2.4075244E-35)
            r18 = 3072(0xc00, float:4.305E-42)
            r0 = 0
            java.lang.String r1 = "消息操作"
            r2 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r9 = r21
            r16 = r31
            oh.h.d(r0, r1, r2, r4, r6, r8, r9, r10, r12, r14, r15, r16, r17, r18)
            goto Lea
        Le7:
            r31.V()
        Lea:
            i0.r1 r0 = r31.t()
            if (r0 == 0) goto L113
            wb.uj r2 = new wb.uj
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = r28
            r13 = r29
            r14 = r30
            r15 = r32
            r16 = r33
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0.f6035d = r2
        L113:
            return
    }

    public void e(java.lang.String r28, i0.h0 r29, int r30) {
            r27 = this;
            r1 = r27
            r2 = r28
            r3 = r29
            r0 = 1556665149(0x5cc8d33d, float:4.5221803E17)
            r3.b0(r0)
            r0 = r30 & 6
            if (r0 != 0) goto L1c
            boolean r0 = r3.f(r2)
            if (r0 == 0) goto L18
            r0 = 4
            goto L19
        L18:
            r0 = 2
        L19:
            r0 = r30 | r0
            goto L1e
        L1c:
            r0 = r30
        L1e:
            r4 = r30 & 48
            if (r4 != 0) goto L2e
            boolean r4 = r3.f(r1)
            if (r4 == 0) goto L2b
            r4 = 32
            goto L2d
        L2b:
            r4 = 16
        L2d:
            r0 = r0 | r4
        L2e:
            r4 = r0 & 19
            r5 = 18
            r6 = 1
            r7 = 0
            if (r4 == r5) goto L38
            r4 = r6
            goto L39
        L38:
            r4 = r7
        L39:
            r0 = r0 & r6
            boolean r0 = r3.S(r0, r4)
            if (r0 == 0) goto L180
            java.lang.String r0 = a7.a.i(r2)
            int r4 = r0.length()
            r5 = 0
            if (r4 != 0) goto L4c
            goto L6a
        L4c:
            int r0 = android.graphics.Color.parseColor(r0)     // Catch: java.lang.Throwable -> L5a
            long r8 = f1.c0.c(r0)     // Catch: java.lang.Throwable -> L5a
            f1.w r0 = new f1.w     // Catch: java.lang.Throwable -> L5a
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L5a
            goto L61
        L5a:
            r0 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r0)
            r0 = r4
        L61:
            boolean r4 = r0 instanceof sf.f
            if (r4 == 0) goto L67
            goto L68
        L67:
            r5 = r0
        L68:
            f1.w r5 = (f1.w) r5
        L6a:
            if (r5 != 0) goto L82
            r0 = 1306592715(0x4de105cb, float:4.7190666E8)
            r3.a0(r0)
            i0.m2 r0 = bi.d.f892a
            java.lang.Object r0 = r3.j(r0)
            bi.b r0 = (bi.b) r0
            long r4 = r0.n()
            r3.p(r7)
            goto L8d
        L82:
            r0 = 1306591072(0x4de0ff60, float:4.7185408E8)
            r3.a0(r0)
            r3.p(r7)
            long r4 = r5.f3133a
        L8d:
            r0 = 24
            float r0 = (float) r0
            y0.l r8 = y0.l.f21818a
            y0.o r0 = p.h1.j(r8, r0)
            r8 = 12
            float r9 = (float) r8
            v.d r10 = v.e.a(r9)
            y0.o r0 = c1.h.b(r0, r10)
            f1.m0 r10 = f1.c0.f3038b
            y0.o r0 = k.n.g(r0, r4, r10)
            float r4 = (float) r6
            i0.m2 r5 = bi.d.f892a
            java.lang.Object r10 = r3.j(r5)
            bi.b r10 = (bi.b) r10
            long r10 = r10.i()
            r12 = 1056964608(0x3f000000, float:0.5)
            long r10 = f1.w.b(r10, r12)
            v.d r9 = v.e.a(r9)
            f1.t0 r12 = new f1.t0
            r12.<init>(r10)
            k.t r10 = new k.t
            r10.<init>(r4, r12, r9)
            y0.o r0 = r0.d(r10)
            y0.g r4 = y0.b.f21796k
            v1.n0 r4 = p.o.d(r4, r7)
            long r9 = r3.T
            int r9 = java.lang.Long.hashCode(r9)
            s0.h r10 = r3.l()
            y0.o r0 = y0.a.c(r3, r0)
            x1.f r11 = x1.g.f20914f
            r11.getClass()
            x1.y r11 = x1.f.f20883b
            r3.d0()
            boolean r12 = r3.S
            if (r12 == 0) goto Lf2
            r3.k(r11)
            goto Lf5
        Lf2:
            r3.n0()
        Lf5:
            x1.e r11 = x1.f.f20886e
            i0.r.A(r11, r3, r4)
            x1.e r4 = x1.f.f20885d
            i0.r.A(r4, r3, r10)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            x1.e r9 = x1.f.f20887f
            i0.r.A(r9, r3, r4)
            x1.d r4 = x1.f.f20888g
            i0.r.w(r4, r3)
            x1.e r4 = x1.f.f20884c
            i0.r.A(r4, r3, r0)
            int r0 = r2.length()
            if (r0 != 0) goto L171
            r0 = -734969967(0xffffffffd4313f91, float:-3.0451027E12)
            r3.a0(r0)
            java.lang.Object r0 = r3.j(r5)
            bi.b r0 = (bi.b) r0
            long r4 = r0.h()
            long r8 = x6.d.D(r8)
            r24 = 0
            r25 = 262122(0x3ffea, float:3.67311E-40)
            java.lang.String r3 = "-"
            r10 = r6
            r5 = r4
            r4 = 0
            r11 = r7
            r7 = r8
            r9 = 0
            r12 = r10
            r10 = 0
            r14 = r11
            r13 = r12
            r11 = 0
            r15 = r13
            r13 = 0
            r17 = r14
            r16 = r15
            r14 = 0
            r18 = r16
            r16 = 0
            r19 = r17
            r17 = 0
            r20 = r18
            r18 = 0
            r21 = r19
            r19 = 0
            r22 = r20
            r20 = 0
            r23 = r21
            r21 = 0
            r26 = r23
            r23 = 24582(0x6006, float:3.4447E-41)
            r22 = r29
            r1 = r26
            sh.s.n(r3, r4, r5, r7, r9, r10, r11, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r3 = r22
            r3.p(r1)
        L16f:
            r12 = 1
            goto L17c
        L171:
            r1 = r7
            r0 = -734852725(0xffffffffd433098b, float:-3.075837E12)
            r3.a0(r0)
            r3.p(r1)
            goto L16f
        L17c:
            r3.p(r12)
            goto L183
        L180:
            r3.V()
        L183:
            i0.r1 r0 = r3.t()
            if (r0 == 0) goto L196
            i.b1 r1 = new i.b1
            r3 = 5
            r4 = r27
            r5 = r30
            r1.<init>(r4, r2, r5, r3)
            r0.f6035d = r1
            goto L198
        L196:
            r4 = r27
        L198:
            return
    }

    public void e0(fb.v r25, java.lang.String r26, fg.l r27, fg.a r28, i0.h0 r29, int r30) {
            r24 = this;
            r2 = r25
            r12 = r27
            r13 = r29
            java.lang.String r8 = r2.f3823a
            r0 = 793491989(0x2f4bba15, float:1.8528852E-10)
            r13.b0(r0)
            boolean r0 = r13.h(r2)
            if (r0 == 0) goto L16
            r0 = 4
            goto L17
        L16:
            r0 = 2
        L17:
            r0 = r30 | r0
            r9 = r26
            boolean r3 = r13.f(r9)
            r4 = 32
            if (r3 == 0) goto L25
            r3 = r4
            goto L27
        L25:
            r3 = 16
        L27:
            r0 = r0 | r3
            boolean r3 = r13.h(r12)
            if (r3 == 0) goto L31
            r3 = 256(0x100, float:3.59E-43)
            goto L33
        L31:
            r3 = 128(0x80, float:1.8E-43)
        L33:
            r0 = r0 | r3
            r3 = r0 & 1171(0x493, float:1.641E-42)
            r5 = 1170(0x492, float:1.64E-42)
            if (r3 == r5) goto L3c
            r3 = 1
            goto L3d
        L3c:
            r3 = 0
        L3d:
            r5 = r0 & 1
            boolean r3 = r13.S(r5, r3)
            if (r3 == 0) goto L1d5
            i0.m2 r3 = y1.i0.f21966b
            java.lang.Object r3 = r13.j(r3)
            r10 = r3
            android.content.Context r10 = (android.content.Context) r10
            java.lang.Object r3 = r13.P()
            i0.e r5 = i0.l.f5952a
            if (r3 != r5) goto L5d
            qg.t r3 = i0.r.n(r13)
            r13.k0(r3)
        L5d:
            qg.t r3 = (qg.t) r3
            r.z r11 = r.b0.a(r13)
            sh.x r14 = sh.s.i(r13)
            java.lang.String r15 = r2.f3825c
            boolean r16 = r13.f(r8)
            boolean r17 = r13.f(r15)
            r16 = r16 | r17
            java.lang.Object r6 = r13.P()
            if (r16 != 0) goto L7b
            if (r6 != r5) goto L84
        L7b:
            tf.t r6 = tf.t.f13167g
            i0.j1 r6 = i0.r.u(r6)
            r13.k0(r6)
        L84:
            i0.a1 r6 = (i0.a1) r6
            r1 = r0 & 112(0x70, float:1.57E-43)
            if (r1 != r4) goto L8c
            r1 = 1
            goto L8d
        L8c:
            r1 = 0
        L8d:
            java.lang.Object r4 = r13.P()
            if (r1 != 0) goto L95
            if (r4 != r5) goto L9c
        L95:
            i0.j1 r4 = i0.r.u(r9)
            r13.k0(r4)
        L9c:
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r1 = r13.P()
            java.lang.String r18 = ""
            if (r1 != r5) goto Lad
            i0.j1 r1 = i0.r.u(r18)
            r13.k0(r1)
        Lad:
            r19 = r1
            i0.a1 r19 = (i0.a1) r19
            java.lang.Object r1 = r13.P()
            if (r1 != r5) goto Lc0
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            i0.j1 r1 = i0.r.u(r1)
            r13.k0(r1)
        Lc0:
            i0.a1 r1 = (i0.a1) r1
            java.lang.Object r7 = r13.P()
            if (r7 != r5) goto Lcf
            i0.j1 r7 = i0.r.u(r18)
            r13.k0(r7)
        Lcf:
            i0.a1 r7 = (i0.a1) r7
            java.lang.Object r18 = r6.getValue()
            r20 = r0
            r0 = r18
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r18 = r19.getValue()
            r21 = r1
            r1 = r18
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = r13.f(r0)
            boolean r1 = r13.f(r1)
            r0 = r0 | r1
            java.lang.Object r1 = r13.P()
            if (r0 != 0) goto Lfd
            if (r1 != r5) goto Lf7
            goto Lfd
        Lf7:
            r22 = r7
            r23 = r11
            r11 = 1
            goto L154
        Lfd:
            java.lang.Object r0 = r19.getValue()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto L11e
            java.lang.Object r0 = r6.getValue()
            java.util.List r0 = (java.util.List) r0
            r1 = r0
        L118:
            r22 = r7
            r23 = r11
            r11 = 1
            goto L151
        L11e:
            java.lang.Object r1 = r6.getValue()
            java.util.List r1 = (java.util.List) r1
            r18 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r18 = r18.iterator()
        L12f:
            boolean r22 = r18.hasNext()
            if (r22 == 0) goto L118
            r22 = r7
            java.lang.Object r7 = r18.next()
            r9 = r7
            java.lang.String r9 = (java.lang.String) r9
            r23 = r11
            r11 = 1
            boolean r9 = og.m.h0(r9, r0, r11)
            if (r9 == 0) goto L14a
            r1.add(r7)
        L14a:
            r9 = r26
            r7 = r22
            r11 = r23
            goto L12f
        L151:
            r13.k0(r1)
        L154:
            r9 = r1
            java.util.List r9 = (java.util.List) r9
            boolean r0 = r13.h(r3)
            r1 = r20 & 14
            r7 = 4
            if (r1 == r7) goto L168
            boolean r1 = r13.h(r2)
            if (r1 == 0) goto L167
            goto L168
        L167:
            r11 = 0
        L168:
            r0 = r0 | r11
            boolean r1 = r13.f(r6)
            r0 = r0 | r1
            boolean r1 = r13.f(r4)
            r0 = r0 | r1
            java.lang.Object r1 = r13.P()
            if (r0 != 0) goto L183
            if (r1 != r5) goto L17c
            goto L183
        L17c:
            r0 = r1
            r1 = r3
            r3 = r6
            r2 = r21
            r6 = r4
            goto L195
        L183:
            wb.pt r0 = new wb.pt
            r7 = 0
            r1 = r3
            r5 = r6
            r3 = r22
            r6 = r4
            r4 = r2
            r2 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r3 = r5
            r13.k0(r0)
        L195:
            fg.p r0 = (fg.p) r0
            i0.r.g(r8, r15, r0, r13)
            wb.xm r0 = new wb.xm
            r15 = r28
            r0.<init>(r6, r10, r12, r15)
            r4 = 1705130390(0x65a23996, float:9.5760705E22)
            s0.d r16 = s0.i.e(r4, r0, r13)
            wb.x7 r0 = new wb.x7
            r5 = r25
            r8 = r26
            r4 = r1
            r7 = r9
            r1 = r14
            r11 = r19
            r10 = r22
            r9 = r2
            r2 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r2 = 286805904(0x11184f90, float:1.2015203E-28)
            s0.d r6 = s0.i.e(r2, r0, r13)
            r8 = 1769526(0x1b0036, float:2.479634E-39)
            r9 = 24
            java.lang.String r0 = "模型选择"
            r2 = r1
            java.lang.String r1 = "模型选择"
            r3 = 0
            r4 = 0
            r7 = r13
            r5 = r16
            wb.ho.B2(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L1da
        L1d5:
            r15 = r28
            r29.V()
        L1da:
            i0.r1 r8 = r29.t()
            if (r8 == 0) goto L1f3
            b0.z r0 = new b0.z
            r7 = 24
            r1 = r24
            r2 = r25
            r3 = r26
            r6 = r30
            r4 = r12
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.f6035d = r0
        L1f3:
            return
    }

    public void f(wb.jv r28, i0.h0 r29, int r30) {
            r27 = this;
            r0 = r28
            r5 = r29
            java.lang.String r1 = r0.f17144e
            java.lang.String r2 = r0.f17143d
            java.lang.String r3 = r0.f17140a
            r4 = 607903102(0x243bdd7e, float:4.0736772E-17)
            r5.b0(r4)
            r4 = r30 & 6
            r6 = 4
            r7 = 2
            if (r4 != 0) goto L2b
            r4 = r30 & 8
            if (r4 != 0) goto L1f
            boolean r4 = r5.f(r0)
            goto L23
        L1f:
            boolean r4 = r5.h(r0)
        L23:
            if (r4 == 0) goto L27
            r4 = r6
            goto L28
        L27:
            r4 = r7
        L28:
            r4 = r30 | r4
            goto L2d
        L2b:
            r4 = r30
        L2d:
            r8 = r4 & 3
            r9 = 1
            r10 = 0
            if (r8 == r7) goto L35
            r7 = r9
            goto L36
        L35:
            r7 = r10
        L36:
            r8 = r4 & 1
            boolean r7 = r5.S(r8, r7)
            if (r7 == 0) goto L203
            i0.m2 r7 = y1.i0.f21966b
            java.lang.Object r7 = r5.j(r7)
            android.content.Context r7 = (android.content.Context) r7
            boolean r8 = r0.f17142c
            boolean r11 = r5.f(r3)
            boolean r12 = r5.f(r2)
            r11 = r11 | r12
            boolean r12 = r5.f(r1)
            r11 = r11 | r12
            java.lang.Object r12 = r5.P()
            i0.e r13 = i0.l.f5952a
            r14 = 0
            if (r11 != 0) goto L61
            if (r12 != r13) goto L68
        L61:
            i0.j1 r12 = i0.r.u(r14)
            r5.k0(r12)
        L68:
            i0.a1 r12 = (i0.a1) r12
            boolean r11 = r5.f(r12)
            r15 = r4 & 14
            if (r15 == r6) goto L7f
            r4 = r4 & 8
            if (r4 == 0) goto L7d
            boolean r4 = r5.h(r0)
            if (r4 == 0) goto L7d
            goto L7f
        L7d:
            r4 = r10
            goto L80
        L7f:
            r4 = r9
        L80:
            r4 = r4 | r11
            java.lang.Object r6 = r5.P()
            if (r4 != 0) goto L89
            if (r6 != r13) goto L93
        L89:
            c0.m r6 = new c0.m
            r4 = 22
            r6.<init>(r0, r12, r14, r4)
            r5.k0(r6)
        L93:
            fg.p r6 = (fg.p) r6
            i0.r.h(r3, r2, r1, r6, r5)
            java.lang.Object r1 = r12.getValue()
            f1.g r1 = (f1.g) r1
            if (r1 != 0) goto Lb8
            if (r8 == 0) goto Lb8
            r2 = -1835295730(0xffffffff929b9c0e, float:-9.820346E-28)
            r5.a0(r2)
            i0.m2 r2 = bi.d.f892a
            java.lang.Object r2 = r5.j(r2)
            bi.b r2 = (bi.b) r2
            long r2 = r2.j()
            r5.p(r10)
            goto Lcd
        Lb8:
            r2 = -1835235931(0xffffffff929c85a5, float:-9.87793E-28)
            r5.a0(r2)
            i0.m2 r2 = bi.d.f892a
            java.lang.Object r2 = r5.j(r2)
            bi.b r2 = (bi.b) r2
            long r2 = r2.k()
            r5.p(r10)
        Lcd:
            if (r1 != 0) goto Ldd
            if (r8 == 0) goto Ldd
            r4 = -1835107839(0xffffffff929e7a01, float:-1.0001278E-27)
            r5.a0(r4)
            r5.p(r10)
            long r11 = f1.w.f3127c
            goto Lf2
        Ldd:
            r4 = -1835066237(0xffffffff929f1c83, float:-1.0041339E-27)
            r5.a0(r4)
            i0.m2 r4 = bi.d.f892a
            java.lang.Object r4 = r5.j(r4)
            bi.b r4 = (bi.b) r4
            long r11 = r4.f()
            r5.p(r10)
        Lf2:
            r7.getClass()
            java.lang.String r4 = "Hchat_round_avatar_config"
            android.content.SharedPreferences r6 = ub.b.c(r7, r4)
            java.lang.String r13 = "round_avatar_enable"
            boolean r6 = r6.getBoolean(r13, r10)
            if (r6 == 0) goto L127
            android.content.SharedPreferences r4 = ub.b.c(r7, r4)
            java.lang.String r6 = "round_avatar_radius_factor"
            r7 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4.getFloat(r6, r7)
            r6 = 1036831949(0x3dcccccd, float:0.1)
            float r4 = r9.e0.q(r4, r6, r7)
            r6 = 1120403456(0x42c80000, float:100.0)
            float r4 = r4 * r6
            int r4 = ig.a.X(r4)
            float r4 = (float) r4
            float r4 = r4 / r6
            r6 = 1109917696(0x42280000, float:42.0)
            float r4 = r4 * r6
            v.d r4 = v.e.a(r4)
            goto L12e
        L127:
            r4 = 12
            float r4 = (float) r4
            v.d r4 = v.e.a(r4)
        L12e:
            r6 = 42
            float r6 = (float) r6
            y0.l r7 = y0.l.f21818a
            y0.o r6 = p.h1.j(r7, r6)
            y0.o r4 = c1.h.b(r6, r4)
            f1.m0 r6 = f1.c0.f3038b
            y0.o r2 = k.n.g(r4, r2, r6)
            y0.g r3 = y0.b.f21796k
            v1.n0 r3 = p.o.d(r3, r10)
            long r6 = r5.T
            int r4 = java.lang.Long.hashCode(r6)
            s0.h r6 = r5.l()
            y0.o r2 = y0.a.c(r5, r2)
            x1.f r7 = x1.g.f20914f
            r7.getClass()
            x1.y r7 = x1.f.f20883b
            r5.d0()
            boolean r13 = r5.S
            if (r13 == 0) goto L167
            r5.k(r7)
            goto L16a
        L167:
            r5.n0()
        L16a:
            x1.e r7 = x1.f.f20886e
            i0.r.A(r7, r5, r3)
            x1.e r3 = x1.f.f20885d
            i0.r.A(r3, r5, r6)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            x1.e r4 = x1.f.f20887f
            i0.r.A(r4, r5, r3)
            x1.d r3 = x1.f.f20888g
            i0.r.w(r3, r5)
            x1.e r3 = x1.f.f20884c
            i0.r.A(r3, r5, r2)
            if (r1 == 0) goto L1a0
            r2 = -1261944003(0xffffffffb4c8433d, float:-3.7301825E-7)
            r5.a0(r2)
            p.a0 r3 = p.h1.f9915c
            r6 = 432(0x1b0, float:6.05E-43)
            r7 = 248(0xf8, float:3.48E-43)
            r2 = 0
            r4 = 0
            k.n.d(r1, r2, r3, r4, r5, r6, r7)
            r5.p(r10)
            r12 = r9
            goto L1ff
        L1a0:
            r1 = -1261745045(0xffffffffb4cb4c6b, float:-3.7867298E-7)
            r5.a0(r1)
            if (r8 == 0) goto L1ab
            java.lang.String r1 = "群"
            goto L1be
        L1ab:
            java.lang.String r1 = r0.f17141b
            java.lang.String r1 = og.m.P0(r9, r1)
            int r2 = r1.length()
            if (r2 != 0) goto L1b9
            r2 = r9
            goto L1ba
        L1b9:
            r2 = r10
        L1ba:
            if (r2 == 0) goto L1be
            java.lang.String r1 = "友"
        L1be:
            m2.k r7 = m2.k.f8700l
            r22 = 0
            r23 = 262074(0x3ffba, float:3.67244E-40)
            r2 = 0
            r5 = 0
            r8 = 0
            r3 = r9
            r4 = r10
            r9 = 0
            r13 = r4
            r25 = r11
            r12 = r3
            r3 = r25
            r11 = 0
            r14 = r12
            r15 = r13
            r12 = 0
            r16 = r14
            r14 = 0
            r17 = r15
            r15 = 0
            r18 = r16
            r16 = 0
            r19 = r17
            r17 = 0
            r20 = r18
            r18 = 0
            r21 = r19
            r19 = 0
            r24 = r21
            r21 = 1572864(0x180000, float:2.204052E-39)
            r20 = r29
            r0 = r24
            sh.s.n(r1, r2, r3, r5, r7, r8, r9, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r5 = r20
            r5.p(r0)
            r12 = 1
        L1ff:
            r5.p(r12)
            goto L206
        L203:
            r5.V()
        L206:
            i0.r1 r0 = r5.t()
            if (r0 == 0) goto L21c
            i.b1 r1 = new i.b1
            r2 = 12
            r3 = r27
            r4 = r28
            r5 = r30
            r1.<init>(r3, r4, r5, r2)
            r0.f6035d = r1
            return
        L21c:
            r3 = r27
            return
    }

    public void g(java.util.List r34, wb.iv r35, fg.l r36, i0.h0 r37, int r38) {
            r33 = this;
            r4 = r36
            r0 = r37
            r1 = -1062727945(0xffffffffc0a80ef7, float:-5.251827)
            r0.b0(r1)
            r2 = r34
            boolean r1 = r0.f(r2)
            if (r1 == 0) goto L14
            r1 = 4
            goto L15
        L14:
            r1 = 2
        L15:
            r1 = r38 | r1
            int r3 = r35.ordinal()
            boolean r3 = r0.d(r3)
            if (r3 == 0) goto L24
            r3 = 32
            goto L26
        L24:
            r3 = 16
        L26:
            r1 = r1 | r3
            boolean r3 = r0.h(r4)
            r5 = 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L31
            r3 = r5
            goto L33
        L31:
            r3 = 128(0x80, float:1.8E-43)
        L33:
            r1 = r1 | r3
            r3 = r1 & 147(0x93, float:2.06E-43)
            r6 = 146(0x92, float:2.05E-43)
            r7 = 1
            r8 = 0
            if (r3 == r6) goto L3e
            r3 = r7
            goto L3f
        L3e:
            r3 = r8
        L3f:
            r6 = r1 & 1
            boolean r3 = r0.S(r6, r3)
            if (r3 == 0) goto L22e
            y0.l r3 = y0.l.f21818a
            r6 = 1065353216(0x3f800000, float:1.0)
            y0.o r9 = p.h1.d(r3, r6)
            r3 = 8
            float r13 = (float) r3
            r14 = 7
            r10 = 0
            r11 = 0
            r12 = 0
            y0.o r3 = p.d.p(r9, r10, r11, r12, r13, r14)
            p.h r9 = p.j.g(r13)
            y0.f r10 = y0.b.f21801p
            r11 = 6
            p.e1 r9 = p.d1.a(r9, r10, r0, r11)
            long r10 = r0.T
            int r10 = java.lang.Long.hashCode(r10)
            s0.h r11 = r0.l()
            y0.o r3 = y0.a.c(r0, r3)
            x1.f r12 = x1.g.f20914f
            r12.getClass()
            x1.y r12 = x1.f.f20883b
            r0.d0()
            boolean r13 = r0.S
            if (r13 == 0) goto L85
            r0.k(r12)
            goto L88
        L85:
            r0.n0()
        L88:
            x1.e r12 = x1.f.f20886e
            i0.r.A(r12, r0, r9)
            x1.e r9 = x1.f.f20885d
            i0.r.A(r9, r0, r11)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            x1.e r10 = x1.f.f20887f
            i0.r.A(r10, r0, r9)
            x1.d r9 = x1.f.f20888g
            i0.r.w(r9, r0)
            x1.e r9 = x1.f.f20884c
            i0.r.A(r9, r0, r3)
            r3 = 654302092(0x26ffdb8c, float:1.7753688E-15)
            r0.a0(r3)
            java.util.Iterator r3 = r2.iterator()
        Laf:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L224
            java.lang.Object r9 = r3.next()
            wb.iv r9 = (wb.iv) r9
            r10 = r35
            if (r9 != r10) goto Lc1
            r11 = r7
            goto Lc2
        Lc1:
            r11 = r8
        Lc2:
            double r12 = (double) r6
            r14 = 0
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 <= 0) goto Lca
            goto Lcf
        Lca:
            java.lang.String r12 = "invalid weight; must be greater than zero"
            q.a.a(r12)
        Lcf:
            p.q0 r12 = new p.q0
            r12.<init>(r6, r7)
            r13 = 36
            float r13 = (float) r13
            y0.o r12 = p.h1.e(r12, r13)
            r13 = 12
            float r13 = (float) r13
            v.d r13 = v.e.a(r13)
            y0.o r12 = c1.h.b(r12, r13)
            if (r11 == 0) goto Lfe
            r13 = -1838811864(0xffffffff9265f528, float:-7.2561837E-28)
            r0.a0(r13)
            i0.m2 r13 = bi.d.f892a
            java.lang.Object r13 = r0.j(r13)
            bi.b r13 = (bi.b) r13
            long r13 = r13.j()
            r0.p(r8)
            goto L11a
        Lfe:
            r13 = -1838711982(0xffffffff92677b52, float:-7.304275E-28)
            r0.a0(r13)
            i0.m2 r13 = bi.d.f892a
            java.lang.Object r13 = r0.j(r13)
            bi.b r13 = (bi.b) r13
            long r13 = r13.g()
            r15 = 1031127695(0x3d75c28f, float:0.06)
            long r13 = f1.w.b(r13, r15)
            r0.p(r8)
        L11a:
            f1.m0 r15 = f1.c0.f3038b
            y0.o r16 = k.n.g(r12, r13, r15)
            r12 = r1 & 896(0x380, float:1.256E-42)
            if (r12 != r5) goto L126
            r12 = r7
            goto L127
        L126:
            r12 = r8
        L127:
            int r13 = r9.ordinal()
            boolean r13 = r0.d(r13)
            r12 = r12 | r13
            java.lang.Object r13 = r0.P()
            if (r12 != 0) goto L13a
            i0.e r12 = i0.l.f5952a
            if (r13 != r12) goto L144
        L13a:
            wb.xi r13 = new wb.xi
            r12 = 23
            r13.<init>(r4, r12, r9)
            r0.k0(r13)
        L144:
            r20 = r13
            fg.a r20 = (fg.a) r20
            r21 = 15
            r17 = 0
            r18 = 0
            r19 = 0
            y0.o r12 = k.n.j(r16, r17, r18, r19, r20, r21)
            y0.g r13 = y0.b.f21796k
            v1.n0 r13 = p.o.d(r13, r8)
            long r14 = r0.T
            int r14 = java.lang.Long.hashCode(r14)
            s0.h r15 = r0.l()
            y0.o r12 = y0.a.c(r0, r12)
            x1.f r16 = x1.g.f20914f
            r16.getClass()
            x1.y r5 = x1.f.f20883b
            r0.d0()
            boolean r6 = r0.S
            if (r6 == 0) goto L17a
            r0.k(r5)
            goto L17d
        L17a:
            r0.n0()
        L17d:
            x1.e r5 = x1.f.f20886e
            i0.r.A(r5, r0, r13)
            x1.e r5 = x1.f.f20885d
            i0.r.A(r5, r0, r15)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r14)
            x1.e r6 = x1.f.f20887f
            i0.r.A(r6, r0, r5)
            x1.d r5 = x1.f.f20888g
            i0.r.w(r5, r0)
            x1.e r5 = x1.f.f20884c
            i0.r.A(r5, r0, r12)
            java.lang.String r5 = r9.f16938g
            if (r11 == 0) goto L1aa
            r6 = 430024871(0x19a1a8a7, float:1.6715128E-23)
            r0.a0(r6)
            r0.p(r8)
            long r12 = f1.w.f3127c
            goto L1bf
        L1aa:
            r6 = 430025977(0x19a1acf9, float:1.6716873E-23)
            r0.a0(r6)
            i0.m2 r6 = bi.d.f892a
            java.lang.Object r6 = r0.j(r6)
            bi.b r6 = (bi.b) r6
            long r12 = r6.h()
            r0.p(r8)
        L1bf:
            r6 = 14
            long r14 = x6.d.D(r6)
            if (r11 == 0) goto L1cb
            m2.k r6 = m2.k.f8698j
        L1c9:
            r11 = r6
            goto L1ce
        L1cb:
            m2.k r6 = m2.k.f8697i
            goto L1c9
        L1ce:
            r26 = 0
            r27 = 262058(0x3ffaa, float:3.67221E-40)
            r6 = 0
            r9 = r7
            r31 = r12
            r13 = r8
            r7 = r31
            r12 = 0
            r31 = r14
            r15 = r9
            r9 = r31
            r18 = r13
            r13 = 0
            r19 = r15
            r15 = 0
            r20 = 1065353216(0x3f800000, float:1.0)
            r21 = 256(0x100, float:3.59E-43)
            r16 = 0
            r22 = r18
            r18 = 0
            r23 = r19
            r19 = 0
            r24 = r20
            r20 = 0
            r25 = r21
            r21 = 0
            r28 = r22
            r22 = 0
            r29 = r23
            r23 = 0
            r30 = r25
            r25 = 24576(0x6000, float:3.4438E-41)
            r24 = r0
            r0 = r29
            r29 = r1
            r1 = r28
            sh.s.n(r5, r6, r7, r9, r11, r12, r13, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r5 = r24
            r5.p(r0)
            r7 = r0
            r8 = r1
            r0 = r5
            r1 = r29
            r5 = r30
            r6 = 1065353216(0x3f800000, float:1.0)
            goto Laf
        L224:
            r5 = r0
            r0 = r7
            r1 = r8
            r5.p(r1)
            r5.p(r0)
            goto L232
        L22e:
            r5 = r0
            r5.V()
        L232:
            i0.r1 r7 = r5.t()
            if (r7 == 0) goto L246
            wb.uu r0 = new wb.uu
            r6 = 1
            r1 = r33
            r3 = r35
            r5 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f6035d = r0
        L246:
            return
    }

    public void g0(java.lang.String r34, fg.a r35, i0.h0 r36, int r37) {
            r33 = this;
            r3 = r35
            r8 = r36
            r0 = -356480878(0xffffffffeac08892, float:-1.1637935E26)
            r8.b0(r0)
            r2 = r34
            boolean r0 = r8.f(r2)
            if (r0 == 0) goto L14
            r0 = 4
            goto L15
        L14:
            r0 = 2
        L15:
            r0 = r37 | r0
            boolean r1 = r8.h(r3)
            r4 = 16
            if (r1 == 0) goto L22
            r1 = 32
            goto L23
        L22:
            r1 = r4
        L23:
            r0 = r0 | r1
            r1 = r0 & 19
            r5 = 18
            if (r1 == r5) goto L2c
            r1 = 1
            goto L2d
        L2c:
            r1 = 0
        L2d:
            r5 = r0 & 1
            boolean r1 = r8.S(r5, r1)
            if (r1 == 0) goto L1e0
            y0.l r12 = y0.l.f21818a
            r1 = 1065353216(0x3f800000, float:1.0)
            y0.o r5 = p.h1.d(r12, r1)
            i0.m2 r13 = bi.d.f892a
            java.lang.Object r6 = r8.j(r13)
            bi.b r6 = (bi.b) r6
            long r6 = r6.n()
            f1.m0 r9 = f1.c0.f3038b
            y0.o r5 = k.n.g(r5, r6, r9)
            y0.o r5 = wb.ho.O6(r5, r3)
            float r4 = (float) r4
            r6 = 10
            float r14 = (float) r6
            y0.o r4 = p.d.m(r5, r4, r14)
            y0.f r5 = y0.b.f21802q
            p.c r6 = p.j.f9924a
            r7 = 48
            p.e1 r5 = p.d1.a(r6, r5, r8, r7)
            long r6 = r8.T
            int r6 = java.lang.Long.hashCode(r6)
            s0.h r7 = r8.l()
            y0.o r4 = y0.a.c(r8, r4)
            x1.f r9 = x1.g.f20914f
            r9.getClass()
            x1.y r15 = x1.f.f20883b
            r8.d0()
            boolean r9 = r8.S
            if (r9 == 0) goto L85
            r8.k(r15)
            goto L88
        L85:
            r8.n0()
        L88:
            x1.e r9 = x1.f.f20886e
            i0.r.A(r9, r8, r5)
            x1.e r5 = x1.f.f20885d
            i0.r.A(r5, r8, r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            x1.e r7 = x1.f.f20887f
            i0.r.A(r7, r8, r6)
            x1.d r6 = x1.f.f20888g
            i0.r.w(r6, r8)
            x1.e r10 = x1.f.f20884c
            i0.r.A(r10, r8, r4)
            m1.f r4 = wb.ap.f15066g
            java.lang.Object r16 = r8.j(r13)
            bi.b r16 = (bi.b) r16
            long r1 = r16.j()
            r16 = r7
            f1.n r7 = new f1.n
            r11 = 5
            r7.<init>(r1, r11)
            r1 = 20
            float r1 = (float) r1
            y0.o r1 = p.h1.j(r12, r1)
            r2 = r5
            r5 = 0
            r11 = r9
            r9 = 438(0x1b6, float:6.14E-43)
            r27 = r6
            r6 = r1
            r1 = r16
            k.n.c(r4, r5, r6, r7, r8, r9)
            r16 = 0
            r17 = 14
            r4 = r13
            r13 = r14
            r14 = 0
            r5 = r15
            r15 = 0
            y0.o r6 = p.d.p(r12, r13, r14, r15, r16, r17)
            r29 = r12
            r28 = r13
            r7 = 1065353216(0x3f800000, float:1.0)
            double r12 = (double) r7
            r14 = 0
            int r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r9 <= 0) goto Le8
            goto Led
        Le8:
            java.lang.String r9 = "invalid weight; must be greater than zero"
            q.a.a(r9)
        Led:
            p.q0 r9 = new p.q0
            r12 = 1
            r9.<init>(r7, r12)
            y0.o r6 = r6.d(r9)
            p.e r7 = p.j.f9926c
            y0.e r9 = y0.b.f21804s
            r13 = 0
            p.t r7 = p.s.a(r7, r9, r8, r13)
            long r13 = r8.T
            int r9 = java.lang.Long.hashCode(r13)
            s0.h r13 = r8.l()
            y0.o r6 = y0.a.c(r8, r6)
            r8.d0()
            boolean r14 = r8.S
            if (r14 == 0) goto L119
            r8.k(r5)
            goto L11c
        L119:
            r8.n0()
        L11c:
            i0.r.A(r11, r8, r7)
            i0.r.A(r2, r8, r13)
            r2 = r27
            j8.b.p(r9, r8, r1, r8, r2)
            i0.r.A(r10, r8, r6)
            java.lang.Object r1 = r8.j(r4)
            bi.b r1 = (bi.b) r1
            long r6 = r1.g()
            r1 = 13
            long r1 = x6.d.D(r1)
            m2.k r10 = m2.k.f8698j
            r25 = 0
            r26 = 262058(0x3ffaa, float:3.67221E-40)
            r5 = r4
            java.lang.String r4 = "待确认的插件修改"
            r9 = r5
            r5 = 0
            r11 = 0
            r20 = r12
            r12 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = r20
            r20 = 0
            r22 = r21
            r21 = 0
            r23 = r22
            r22 = 0
            r24 = 1597446(0x186006, float:2.238499E-39)
            r30 = r23
            r23 = r8
            r31 = r1
            r1 = r9
            r8 = r31
            r2 = r30
            sh.s.n(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r27 = r10
            r8 = r23
            java.lang.Object r4 = r8.j(r1)
            bi.b r4 = (bi.b) r4
            long r6 = r4.h()
            r4 = 11
            long r4 = x6.d.D(r4)
            r0 = r0 & 14
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
            r25 = 24960(0x6180, float:3.4976E-41)
            r26 = 241642(0x3afea, float:3.38613E-40)
            r8 = r4
            r5 = 0
            r10 = 0
            r17 = 2
            r19 = 1
            r4 = r34
            r23 = r36
            r24 = r0
            sh.s.n(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r8 = r23
            r8.p(r2)
            java.lang.Object r0 = r8.j(r1)
            bi.b r0 = (bi.b) r0
            long r6 = r0.j()
            r0 = 12
            long r0 = x6.d.D(r0)
            r16 = 0
            r17 = 14
            r14 = 0
            r15 = 0
            r13 = r28
            r12 = r29
            y0.o r5 = p.d.p(r12, r13, r14, r15, r16, r17)
            r25 = 0
            r26 = 262056(0x3ffa8, float:3.67219E-40)
            java.lang.String r4 = "查看 Diff"
            r12 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r19 = 0
            r24 = 1597494(0x186036, float:2.238566E-39)
            r10 = r27
            r8 = r0
            sh.s.n(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r8 = r23
            r8.p(r2)
            goto L1e3
        L1e0:
            r8.V()
        L1e3:
            i0.r1 r6 = r8.t()
            if (r6 == 0) goto L1f8
            wb.rj r0 = new wb.rj
            r5 = 15
            r1 = r33
            r2 = r34
            r4 = r37
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f6035d = r0
        L1f8:
            return
    }

    public void h(wb.jv r31, boolean r32, fg.a r33, i0.h0 r34, int r35) {
            r30 = this;
            r4 = r31
            r6 = r32
            r11 = r34
            r1 = r35
            r0 = -794704573(0xffffffffd0a1c543, float:-2.1712476E10)
            r11.b0(r0)
            r0 = r1 & 6
            if (r0 != 0) goto L26
            r0 = r1 & 8
            if (r0 != 0) goto L1b
            boolean r0 = r11.f(r4)
            goto L1f
        L1b:
            boolean r0 = r11.h(r4)
        L1f:
            if (r0 == 0) goto L23
            r0 = 4
            goto L24
        L23:
            r0 = 2
        L24:
            r0 = r0 | r1
            goto L27
        L26:
            r0 = r1
        L27:
            r2 = r1 & 48
            if (r2 != 0) goto L37
            boolean r2 = r11.g(r6)
            if (r2 == 0) goto L34
            r2 = 32
            goto L36
        L34:
            r2 = 16
        L36:
            r0 = r0 | r2
        L37:
            r2 = r1 & 384(0x180, float:5.38E-43)
            r5 = r33
            if (r2 != 0) goto L49
            boolean r2 = r11.h(r5)
            if (r2 == 0) goto L46
            r2 = 256(0x100, float:3.59E-43)
            goto L48
        L46:
            r2 = 128(0x80, float:1.8E-43)
        L48:
            r0 = r0 | r2
        L49:
            r2 = r0 & 147(0x93, float:2.06E-43)
            r3 = 146(0x92, float:2.05E-43)
            if (r2 == r3) goto L51
            r2 = 1
            goto L52
        L51:
            r2 = 0
        L52:
            r3 = r0 & 1
            boolean r2 = r11.S(r3, r2)
            if (r2 == 0) goto L1dc
            y0.l r2 = y0.l.f21818a
            r3 = 1065353216(0x3f800000, float:1.0)
            y0.o r9 = p.h1.d(r2, r3)
            r10 = 12
            float r12 = (float) r10
            v.d r12 = v.e.a(r12)
            y0.o r12 = c1.h.b(r9, r12)
            r15 = 0
            r17 = 15
            r13 = 0
            r14 = 0
            r16 = r5
            y0.o r5 = k.n.j(r12, r13, r14, r15, r16, r17)
            r9 = 10
            float r13 = (float) r9
            r9 = 11
            float r9 = (float) r9
            y0.o r5 = p.d.m(r5, r13, r9)
            y0.f r9 = y0.b.f21802q
            p.c r12 = p.j.f9924a
            r14 = 48
            p.e1 r9 = p.d1.a(r12, r9, r11, r14)
            r12 = r14
            long r14 = r11.T
            int r14 = java.lang.Long.hashCode(r14)
            s0.h r15 = r11.l()
            y0.o r5 = y0.a.c(r11, r5)
            x1.f r16 = x1.g.f20914f
            r16.getClass()
            x1.y r10 = x1.f.f20883b
            r11.d0()
            r16 = r12
            boolean r12 = r11.S
            if (r12 == 0) goto Laf
            r11.k(r10)
            goto Lb2
        Laf:
            r11.n0()
        Lb2:
            x1.e r12 = x1.f.f20886e
            i0.r.A(r12, r11, r9)
            x1.e r9 = x1.f.f20885d
            i0.r.A(r9, r11, r15)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            x1.e r15 = x1.f.f20887f
            i0.r.A(r15, r11, r14)
            x1.d r14 = x1.f.f20888g
            i0.r.w(r14, r11)
            x1.e r7 = x1.f.f20884c
            i0.r.A(r7, r11, r5)
            r0 = r0 & 14
            r0 = r0 | 48
            wb.y2 r5 = wb.y2.f20291p
            r5.f(r4, r11, r0)
            r5 = r9
            double r8 = (double) r3
            r16 = 0
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r8 <= 0) goto Le2
            r8 = 1
            goto Le3
        Le2:
            r8 = 0
        Le3:
            if (r8 != 0) goto Lea
            java.lang.String r8 = "invalid weight; must be greater than zero"
            q.a.a(r8)
        Lea:
            r8 = r12
            p.q0 r12 = new p.q0
            r0 = 1
            r12.<init>(r3, r0)
            r16 = 0
            r17 = 14
            r3 = r14
            r14 = 0
            r9 = r15
            r15 = 0
            y0.o r12 = p.d.p(r12, r13, r14, r15, r16, r17)
            p.e r13 = p.j.f9926c
            y0.e r14 = y0.b.f21804s
            r15 = 0
            p.t r13 = p.s.a(r13, r14, r11, r15)
            long r14 = r11.T
            int r14 = java.lang.Long.hashCode(r14)
            s0.h r15 = r11.l()
            y0.o r12 = y0.a.c(r11, r12)
            r11.d0()
            boolean r0 = r11.S
            if (r0 == 0) goto L11f
            r11.k(r10)
            goto L122
        L11f:
            r11.n0()
        L122:
            i0.r.A(r8, r11, r13)
            i0.r.A(r5, r11, r15)
            j8.b.p(r14, r11, r9, r11, r3)
            i0.r.A(r7, r11, r12)
            java.lang.String r7 = r4.f17141b
            i0.m2 r0 = bi.d.f892a
            java.lang.Object r3 = r11.j(r0)
            bi.b r3 = (bi.b) r3
            long r9 = r3.g()
            m2.k r13 = m2.k.f8698j
            r3 = 15
            long r14 = x6.d.D(r3)
            r28 = 0
            r29 = 262058(0x3ffaa, float:3.67221E-40)
            r8 = 0
            r11 = r14
            r14 = 0
            r3 = 1
            r15 = 0
            r17 = 0
            r5 = 12
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 1597440(0x186000, float:2.23849E-39)
            r26 = r34
            sh.s.n(r7, r8, r9, r11, r13, r14, r15, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r11 = r26
            java.util.List r7 = r4.f17145f
            boolean r7 = r7.isEmpty()
            java.lang.String r8 = r4.f17140a
            if (r7 == 0) goto L177
        L175:
            r7 = r8
            goto L18c
        L177:
            java.util.List r12 = r4.f17145f
            r16 = 0
            r17 = 62
            java.lang.String r13 = " / "
            r14 = 0
            r15 = 0
            java.lang.String r7 = tf.m.A1(r12, r13, r14, r15, r16, r17)
            java.lang.String r9 = " · "
            java.lang.String r8 = wb.en.h(r8, r9, r7)
            goto L175
        L18c:
            java.lang.Object r0 = r11.j(r0)
            bi.b r0 = (bi.b) r0
            long r9 = r0.h()
            long r12 = x6.d.D(r5)
            r28 = 0
            r29 = 262122(0x3ffea, float:3.67311E-40)
            r8 = 0
            r11 = r12
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 24576(0x6000, float:3.4438E-41)
            r26 = r34
            sh.s.n(r7, r8, r9, r11, r13, r14, r15, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r11 = r26
            r11.p(r3)
            r0 = 22
            float r0 = (float) r0
            y0.o r8 = p.h1.j(r2, r0)
            if (r6 == 0) goto L1ce
            h2.a r0 = h2.a.f5048g
        L1cc:
            r7 = r0
            goto L1d1
        L1ce:
            h2.a r0 = h2.a.f5049h
            goto L1cc
        L1d1:
            r10 = 0
            r12 = 432(0x1b0, float:6.05E-43)
            r9 = 0
            sh.s.d(r7, r8, r9, r10, r11, r12)
            r11.p(r3)
            goto L1df
        L1dc:
            r11.V()
        L1df:
            i0.r1 r7 = r11.t()
            if (r7 == 0) goto L1f1
            bi.j r0 = new bi.j
            r2 = 2
            r3 = r30
            r5 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f6035d = r0
        L1f1:
            return
    }

    public void h0(m1.f r12, java.lang.String r13, fg.a r14, i0.h0 r15, int r16) {
            r11 = this;
            r0 = -2046197183(0xffffffff86098241, float:-2.5862532E-35)
            r15.b0(r0)
            boolean r0 = r15.h(r14)
            if (r0 == 0) goto Lf
            r0 = 256(0x100, float:3.59E-43)
            goto L11
        Lf:
            r0 = 128(0x80, float:1.8E-43)
        L11:
            r0 = r16 | r0
            r1 = r0 & 147(0x93, float:2.06E-43)
            r2 = 146(0x92, float:2.05E-43)
            r3 = 1
            if (r1 == r2) goto L1c
            r1 = r3
            goto L1d
        L1c:
            r1 = 0
        L1d:
            r0 = r0 & r3
            boolean r0 = r15.S(r0, r1)
            if (r0 == 0) goto L6a
            i0.m2 r0 = bi.d.f892a
            java.lang.Object r0 = r15.j(r0)
            bi.b r0 = (bi.b) r0
            long r0 = r0.h()
            f1.n r3 = new f1.n
            r2 = 5
            r3.<init>(r0, r2)
            r0 = 4
            float r6 = (float) r0
            r9 = 0
            r10 = 14
            y0.l r5 = y0.l.f21818a
            r7 = 0
            r8 = 0
            y0.o r0 = p.d.p(r5, r6, r7, r8, r9, r10)
            r1 = 26
            float r1 = (float) r1
            y0.o r0 = p.h1.j(r0, r1)
            v.d r1 = v.e.a(r6)
            y0.o r5 = c1.h.b(r0, r1)
            r8 = 0
            r10 = 15
            r6 = 0
            r7 = 0
            r9 = r14
            y0.o r0 = k.n.j(r5, r6, r7, r8, r9, r10)
            float r1 = (float) r2
            y0.o r2 = p.d.l(r0, r1)
            r5 = 54
            r0 = r12
            r1 = r13
            r4 = r15
            k.n.c(r0, r1, r2, r3, r4, r5)
            goto L6d
        L6a:
            r15.V()
        L6d:
            i0.r1 r0 = r15.t()
            if (r0 == 0) goto L81
            wb.rr r4 = new wb.rr
            r10 = 1
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r16
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.f6035d = r4
        L81:
            return
    }

    public void i(android.content.Context r40, java.lang.String r41, p.x0 r42, long r43, fg.l r45, i0.h0 r46, int r47, int r48) {
            r39 = this;
            r3 = r41
            r13 = r46
            r0 = r47
            r40.getClass()
            r3.getClass()
            r1 = -436192193(0xffffffffe6003c3f, float:-1.5139356E23)
            r13.b0(r1)
            r2 = r40
            boolean r1 = r13.h(r2)
            if (r1 == 0) goto L1c
            r1 = 4
            goto L1d
        L1c:
            r1 = 2
        L1d:
            r1 = r1 | r0
            boolean r4 = r13.f(r3)
            r5 = 16
            if (r4 == 0) goto L29
            r4 = 32
            goto L2a
        L29:
            r4 = r5
        L2a:
            r1 = r1 | r4
            r4 = r48 & 4
            if (r4 == 0) goto L34
            r1 = r1 | 384(0x180, float:5.38E-43)
        L31:
            r6 = r42
            goto L46
        L34:
            r6 = r0 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L31
            r6 = r42
            boolean r7 = r13.f(r6)
            if (r7 == 0) goto L43
            r7 = 256(0x100, float:3.59E-43)
            goto L45
        L43:
            r7 = 128(0x80, float:1.8E-43)
        L45:
            r1 = r1 | r7
        L46:
            r7 = r48 & 8
            if (r7 == 0) goto L4f
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L4c:
            r8 = r43
            goto L61
        L4f:
            r8 = r0 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L4c
            r8 = r43
            boolean r14 = r13.e(r8)
            if (r14 == 0) goto L5e
            r14 = 2048(0x800, float:2.87E-42)
            goto L60
        L5e:
            r14 = 1024(0x400, float:1.435E-42)
        L60:
            r1 = r1 | r14
        L61:
            r14 = r48 & 16
            if (r14 == 0) goto L6a
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
            r15 = r45
            goto L79
        L6a:
            r15 = r45
            boolean r16 = r13.h(r15)
            if (r16 == 0) goto L75
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L77
        L75:
            r16 = 8192(0x2000, float:1.148E-41)
        L77:
            r1 = r1 | r16
        L79:
            r12 = r1 & 9363(0x2493, float:1.312E-41)
            r11 = 9362(0x2492, float:1.3119E-41)
            r10 = 0
            if (r12 == r11) goto L82
            r11 = 1
            goto L83
        L82:
            r11 = r10
        L83:
            r12 = r1 & 1
            boolean r11 = r13.S(r12, r11)
            if (r11 == 0) goto L531
            if (r4 == 0) goto L96
            float r4 = (float) r5
            r5 = 14
            float r5 = (float) r5
            p.z0 r6 = new p.z0
            r6.<init>(r4, r5, r4, r5)
        L96:
            r11 = r6
            r4 = 13
            if (r7 == 0) goto La2
            long r5 = x6.d.D(r4)
            r19 = r5
            goto La4
        La2:
            r19 = r8
        La4:
            if (r14 == 0) goto La9
            r5 = 0
            r7 = r5
            goto Lab
        La9:
            r7 = r45
        Lab:
            java.lang.String r5 = "\r\n"
            java.lang.String r6 = "\n"
            java.lang.String r5 = og.t.a0(r3, r5, r6, r10)
            r12 = 10
            java.lang.String r4 = r5.replace(r4, r12)
            r4.getClass()
            java.util.List r4 = og.m.x0(r4)
            wb.y4 r5 = new wb.y4
            r5.<init>(r10)
            java.util.ArrayList r21 = new java.util.ArrayList
            r21.<init>()
            y0.l r14 = y0.l.f21818a
            r6 = 1065353216(0x3f800000, float:1.0)
            y0.o r8 = p.h1.d(r14, r6)
            y0.o r8 = p.d.k(r8, r11)
            p.e r9 = p.j.f9926c
            y0.e r6 = y0.b.f21804s
            p.t r6 = p.s.a(r9, r6, r13, r10)
            r29 = r11
            long r10 = r13.T
            int r9 = java.lang.Long.hashCode(r10)
            s0.h r10 = r13.l()
            y0.o r8 = y0.a.c(r13, r8)
            x1.f r11 = x1.g.f20914f
            r11.getClass()
            x1.y r11 = x1.f.f20883b
            r13.d0()
            boolean r12 = r13.S
            if (r12 == 0) goto L100
            r13.k(r11)
            goto L103
        L100:
            r13.n0()
        L103:
            x1.e r11 = x1.f.f20886e
            i0.r.A(r11, r13, r6)
            x1.e r6 = x1.f.f20885d
            i0.r.A(r6, r13, r10)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            x1.e r9 = x1.f.f20887f
            i0.r.A(r9, r13, r6)
            x1.d r6 = x1.f.f20888g
            i0.r.w(r6, r13)
            x1.e r6 = x1.f.f20884c
            i0.r.A(r6, r13, r8)
            r6 = -1599520628(0xffffffffa0a9408c, float:-2.8672427E-19)
            r13.a0(r6)
            java.util.Iterator r30 = r4.iterator()
            r31 = 0
        L12c:
            r10 = r5
            boolean r4 = r30.hasNext()
            r5 = r4
            wb.y2 r4 = wb.y2.f20284i
            if (r5 == 0) goto L4e5
            java.lang.Object r5 = r30.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.CharSequence r6 = og.m.T0(r5)
            java.lang.String r6 = r6.toString()
            java.lang.CharSequence r8 = og.m.V0(r6)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "```"
            r11 = 0
            boolean r8 = og.t.d0(r8, r9, r11)
            if (r8 == 0) goto L1b7
            r5 = 1547900650(0x5c4316ea, float:2.1965126E17)
            r13.a0(r5)
            if (r31 == 0) goto L18c
            r5 = 1547929728(0x5c438880, float:2.2015082E17)
            r13.a0(r5)
            r25 = 0
            r26 = 62
            java.lang.String r22 = "\n"
            r23 = 0
            r24 = 0
            java.lang.String r9 = tf.m.A1(r21, r22, r23, r24, r25, r26)
            r11 = r21
            int r5 = r1 >> 9
            r5 = r5 & 112(0x70, float:1.57E-43)
            r5 = r5 | 384(0x180, float:5.38E-43)
            r6 = 0
            r8 = r13
            r12 = 1065353216(0x3f800000, float:1.0)
            r4.c(r5, r6, r7, r8, r9)
            r32 = r7
            r11.clear()
            r4 = 0
            r13.p(r4)
            r28 = r4
            goto L1a1
        L18c:
            r32 = r7
            r11 = r21
            r4 = 0
            r12 = 1065353216(0x3f800000, float:1.0)
            r5 = 1548101065(0x5c4625c9, float:2.2309436E17)
            r13.a0(r5)
            r13.p(r4)
            r11.clear()
            r28 = 1
        L1a1:
            r13.p(r4)
            r18 = r1
            r7 = r4
            r5 = r10
            r21 = r11
            r2 = r14
            r10 = r19
            r31 = r28
        L1af:
            r0 = 2
            r1 = 1
        L1b1:
            r17 = 4
            r33 = 32
            goto L4d8
        L1b7:
            r32 = r7
            r11 = r21
            r4 = 0
            r12 = 1065353216(0x3f800000, float:1.0)
            r7 = 1548237961(0x5c483c89, float:2.2544622E17)
            r13.a0(r7)
            r13.p(r4)
            if (r31 == 0) goto L1d8
            r11.add(r5)
            r18 = r1
            r5 = r10
            r21 = r11
            r2 = r14
            r10 = r19
            r0 = 2
            r1 = 1
            r7 = 0
            goto L1b1
        L1d8:
            r4 = r1 & 14
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            r5 = r1 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 | r5
            java.lang.CharSequence r5 = og.m.R0(r6)
            java.lang.String r5 = r5.toString()
            boolean r7 = og.m.t0(r5)
            r8 = 8
            r9 = 6
            if (r7 == 0) goto L210
            r4 = 1398520200(0x535bb988, float:9.4371054E11)
            r13.a0(r4)
            float r4 = (float) r8
            y0.o r4 = p.h1.e(r14, r4)
            p.o.a(r4, r13, r9)
            r4 = 0
            r13.p(r4)
            r18 = r1
            r7 = r4
        L205:
            r21 = r11
            r0 = r12
            r2 = r14
            r8 = r19
            r1 = 1
            r17 = 4
            goto L3fb
        L210:
            java.lang.String r7 = "-{3,}|_{3,}|\\*{3,}"
            java.util.regex.Pattern r7 = java.util.regex.Pattern.compile(r7)
            r7.getClass()
            java.util.regex.Matcher r7 = r7.matcher(r5)
            boolean r7 = r7.matches()
            f1.m0 r9 = f1.c0.f3038b
            r15 = 0
            if (r7 == 0) goto L255
            r4 = 1398670488(0x535e0498, float:9.535598E11)
            r13.a0(r4)
            y0.o r4 = p.h1.d(r14, r12)
            float r5 = (float) r8
            r6 = 1
            y0.o r4 = p.d.n(r4, r15, r5, r6)
            float r5 = (float) r6
            y0.o r4 = p.h1.e(r4, r5)
            i0.m2 r5 = bi.d.f892a
            java.lang.Object r5 = r13.j(r5)
            bi.b r5 = (bi.b) r5
            long r5 = r5.i()
            y0.o r4 = k.n.g(r4, r5, r9)
            r7 = 0
            p.o.a(r4, r13, r7)
            r13.p(r7)
            r18 = r1
            goto L205
        L255:
            r7 = 0
            java.lang.String r12 = "#"
            boolean r12 = og.t.d0(r5, r12, r7)
            r7 = 3
            if (r12 == 0) goto L315
            r6 = 1398978287(0x5362b6ef, float:9.737317E11)
            r13.a0(r6)
            int r6 = r5.length()
            r9 = 0
        L26a:
            if (r9 >= r6) goto L27d
            char r12 = r5.charAt(r9)
            r15 = 35
            if (r12 != r15) goto L277
            int r9 = r9 + 1
            goto L26a
        L277:
            r12 = 0
            java.lang.String r6 = r5.substring(r12, r9)
            goto L27f
        L27d:
            r12 = 0
            r6 = r5
        L27f:
            int r6 = r6.length()
            r9 = 1
            r15 = 6
            int r6 = r9.e0.r(r6, r9, r15)
            java.lang.String r5 = og.m.j0(r6, r5)
            java.lang.CharSequence r5 = og.m.R0(r5)
            java.lang.String r5 = r5.toString()
            r9 = 2
            if (r6 > r9) goto L29f
            r9 = 10
            float r8 = (float) r9
        L29b:
            r24 = r8
            r8 = 4
            goto L2a3
        L29f:
            r9 = 10
            float r8 = (float) r8
            goto L29b
        L2a3:
            float r15 = (float) r8
            r27 = 5
            r23 = 0
            r25 = 0
            r22 = r14
            r26 = r15
            y0.o r14 = p.d.p(r22, r23, r24, r25, r26, r27)
            i0.m2 r15 = bi.d.f892a
            java.lang.Object r15 = r13.j(r15)
            bi.b r15 = (bi.b) r15
            long r23 = r15.g()
            r15 = 1
            if (r6 == r15) goto L2dd
            r8 = 2
            if (r6 == r8) goto L2d6
            if (r6 == r7) goto L2cf
            r6 = 15
            long r6 = x6.d.D(r6)
        L2cc:
            r28 = r12
            goto L2e5
        L2cf:
            r6 = 17
            long r6 = x6.d.D(r6)
            goto L2cc
        L2d6:
            r6 = 19
            long r6 = x6.d.D(r6)
            goto L2cc
        L2dd:
            r8 = 2
            r6 = 22
            long r6 = x6.d.D(r6)
            goto L2cc
        L2e5:
            m2.k r12 = m2.k.f8699k
            r4 = r4 & 14
            r18 = 14155776(0xd80000, float:1.9836467E-38)
            r4 = r4 | r18
            r21 = r15
            r15 = 0
            r21 = r11
            r8 = r23
            r0 = r28
            r35 = r4
            r4 = r2
            r2 = r22
            r36 = r14
            r14 = r35
            r37 = r6
            r6 = r10
            r10 = r37
            r7 = r36
            wb.y4 r10 = x(r4, r5, r6, r7, r8, r10, r12, r13, r14, r15)
            r13.p(r0)
            r7 = r0
            r18 = r1
            r5 = r10
            r10 = r19
            goto L1af
        L315:
            r21 = r11
            r2 = r14
            r0 = 0
            java.lang.String r11 = ">"
            boolean r12 = og.t.d0(r5, r11, r0)
            r16 = 458752(0x70000, float:6.42848E-40)
            if (r12 == 0) goto L402
            r6 = 1399696743(0x536dad67, float:1.02081646E12)
            r13.a0(r6)
            r12 = 1065353216(0x3f800000, float:1.0)
            y0.o r6 = p.h1.d(r2, r12)
            r44 = 12582912(0xc00000, float:1.7632415E-38)
            r12 = 4
            float r14 = (float) r12
            r12 = 1
            y0.o r6 = p.d.n(r6, r15, r14, r12)
            p.c r14 = p.j.f9924a
            y0.f r15 = y0.b.f21801p
            p.e1 r14 = p.d1.a(r14, r15, r13, r0)
            r18 = r1
            long r0 = r13.T
            int r0 = java.lang.Long.hashCode(r0)
            s0.h r1 = r13.l()
            y0.o r6 = y0.a.c(r13, r6)
            x1.f r15 = x1.g.f20914f
            r15.getClass()
            x1.y r15 = x1.f.f20883b
            r13.d0()
            boolean r12 = r13.S
            if (r12 == 0) goto L362
            r13.k(r15)
            goto L365
        L362:
            r13.n0()
        L365:
            x1.e r12 = x1.f.f20886e
            i0.r.A(r12, r13, r14)
            x1.e r12 = x1.f.f20885d
            i0.r.A(r12, r13, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            x1.e r1 = x1.f.f20887f
            i0.r.A(r1, r13, r0)
            x1.d r0 = x1.f.f20888g
            i0.r.w(r0, r13)
            x1.e r0 = x1.f.f20884c
            i0.r.A(r0, r13, r6)
            float r0 = (float) r8
            r26 = 0
            r27 = 11
            r23 = 0
            r24 = 0
            r25 = r0
            r22 = r2
            y0.o r0 = p.d.p(r22, r23, r24, r25, r26, r27)
            float r1 = (float) r7
            r6 = 20
            float r6 = (float) r6
            y0.o r0 = p.h1.k(r0, r1, r6)
            i0.m2 r1 = bi.d.f892a
            java.lang.Object r6 = r13.j(r1)
            bi.b r6 = (bi.b) r6
            long r6 = r6.j()
            y0.o r0 = k.n.g(r0, r6, r9)
            r7 = 0
            p.o.a(r0, r13, r7)
            java.lang.String r0 = og.m.A0(r5, r11)
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r5 = r0.toString()
            java.lang.Object r0 = r13.j(r1)
            bi.b r0 = (bi.b) r0
            long r8 = r0.h()
            r0 = 1065353216(0x3f800000, float:1.0)
            double r6 = (double) r0
            r11 = 0
            int r1 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r1 <= 0) goto L3cf
            goto L3d4
        L3cf:
            java.lang.String r1 = "invalid weight; must be greater than zero"
            q.a.a(r1)
        L3d4:
            p.q0 r7 = new p.q0
            r6 = 1
            r7.<init>(r0, r6)
            r1 = r4 & 14
            r1 = r1 | r44
            int r4 = r4 << 6
            r4 = r4 & r16
            r14 = r1 | r4
            r15 = 64
            r12 = 0
            r4 = r40
            r1 = r6
            r6 = r10
            r10 = r19
            r17 = 4
            x(r4, r5, r6, r7, r8, r10, r12, r13, r14, r15)
            r8 = r10
            r10 = r6
            r13.p(r1)
            r7 = 0
            r13.p(r7)
        L3fb:
            r5 = r10
            r0 = 2
            r33 = 32
            r10 = r8
            goto L4d8
        L402:
            r7 = r0
            r18 = r1
            r8 = r19
            r44 = 12582912(0xc00000, float:1.7632415E-38)
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r17 = 4
            java.lang.String r11 = "- "
            boolean r11 = og.t.d0(r5, r11, r7)
            r12 = 196608(0x30000, float:2.75506E-40)
            r14 = 57344(0xe000, float:8.0356E-41)
            if (r11 != 0) goto L42b
            java.lang.String r11 = "* "
            boolean r11 = og.t.d0(r5, r11, r7)
            if (r11 != 0) goto L42b
            java.lang.String r11 = "+ "
            boolean r11 = og.t.d0(r5, r11, r7)
            if (r11 == 0) goto L431
        L42b:
            r6 = r10
            r0 = 2
            r33 = 32
            goto L4af
        L431:
            java.lang.String r7 = "^\\d+[.)]\\s+.*"
            java.util.regex.Pattern r7 = java.util.regex.Pattern.compile(r7)
            r7.getClass()
            java.util.regex.Matcher r7 = r7.matcher(r5)
            boolean r7 = r7.matches()
            if (r7 == 0) goto L47e
            r6 = 1400686697(0x537cc869, float:1.0856941E12)
            r13.a0(r6)
            r15 = 32
            java.lang.String r6 = og.m.M0(r5, r15)
            java.lang.CharSequence r6 = og.m.R0(r6)
            java.lang.String r7 = r6.toString()
            java.lang.String r5 = og.m.A0(r5, r7)
            java.lang.CharSequence r5 = og.m.R0(r5)
            java.lang.String r5 = r5.toString()
            r6 = r4 & 910(0x38e, float:1.275E-42)
            int r4 = r4 << 3
            r4 = r4 & r14
            r4 = r4 | r6
            r11 = r4 | r12
            r12 = 0
            r4 = r40
            r6 = r10
            r10 = r13
            wb.y4 r5 = w(r4, r5, r6, r7, r8, r10, r11, r12)
            r7 = 0
            r13.p(r7)
            r10 = r8
            r33 = r15
            r0 = 2
            goto L4d8
        L47e:
            r33 = 32
            r5 = 1400897931(0x5380018b, float:1.0995634E12)
            r13.a0(r5)
            r5 = 2
            float r7 = (float) r5
            y0.o r7 = p.d.n(r2, r15, r7, r1)
            r11 = r4 & 14
            r11 = r11 | 3072(0xc00, float:4.305E-42)
            int r4 = r4 << 6
            r4 = r4 & r16
            r4 = r4 | r11
            r14 = r4 | r44
            r15 = 80
            r34 = r5
            r5 = r6
            r6 = r10
            r10 = r8
            r8 = 0
            r12 = 0
            r4 = r40
            r0 = r34
            wb.y4 r5 = x(r4, r5, r6, r7, r8, r10, r12, r13, r14, r15)
            r8 = r10
            r7 = 0
            r13.p(r7)
            goto L4d8
        L4af:
            r7 = 1400520816(0x537a4070, float:1.0748229E12)
            r13.a0(r7)
            java.lang.String r5 = og.m.j0(r0, r5)
            java.lang.CharSequence r5 = og.m.R0(r5)
            java.lang.String r5 = r5.toString()
            r7 = r4 & 910(0x38e, float:1.275E-42)
            int r4 = r4 << 3
            r4 = r4 & r14
            r4 = r4 | r7
            r11 = r4 | r12
            r12 = 8
            r7 = 0
            r4 = r40
            r10 = r13
            wb.y4 r5 = w(r4, r5, r6, r7, r8, r10, r11, r12)
            r7 = 0
            r10 = r8
            r13.p(r7)
        L4d8:
            r0 = r47
            r14 = r2
            r19 = r10
            r1 = r18
            r7 = r32
            r2 = r40
            goto L12c
        L4e5:
            r18 = r1
            r32 = r7
            r10 = r19
            r1 = 1
            r7 = 0
            r13.p(r7)
            if (r31 == 0) goto L51e
            boolean r0 = r21.isEmpty()
            if (r0 != 0) goto L51e
            r0 = 1955201422(0x748a018e, float:8.747174E31)
            r13.a0(r0)
            r25 = 0
            r26 = 62
            java.lang.String r22 = "\n"
            r23 = 0
            r24 = 0
            java.lang.String r9 = tf.m.A1(r21, r22, r23, r24, r25, r26)
            int r0 = r18 >> 9
            r0 = r0 & 112(0x70, float:1.57E-43)
            r5 = r0 | 384(0x180, float:5.38E-43)
            r6 = 0
            r8 = r13
            r7 = r32
            r4.c(r5, r6, r7, r8, r9)
            r4 = 0
            r13.p(r4)
            goto L52a
        L51e:
            r7 = r32
            r4 = 0
            r0 = 1955273497(0x748b1b19, float:8.816881E31)
            r13.a0(r0)
            r13.p(r4)
        L52a:
            r13.p(r1)
            r5 = r10
            r4 = r29
            goto L538
        L531:
            r13.V()
            r7 = r45
            r4 = r6
            r5 = r8
        L538:
            i0.r1 r10 = r13.t()
            if (r10 == 0) goto L54d
            wb.w4 r0 = new wb.w4
            r1 = r39
            r2 = r40
            r8 = r47
            r9 = r48
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9)
            r10.f6035d = r0
        L54d:
            return
    }

    public void i0(java.util.List r38, boolean r39, fg.l r40, fg.l r41, fg.l r42, fg.l r43, i0.h0 r44, int r45) {
            r37 = this;
            r2 = r38
            r3 = r39
            r4 = r40
            r9 = r44
            r8 = r45
            r0 = 1499874984(0x596646a8, float:4.0510583E15)
            r9.b0(r0)
            r0 = r8 & 6
            if (r0 != 0) goto L28
            r0 = r8 & 8
            if (r0 != 0) goto L1d
            boolean r0 = r9.f(r2)
            goto L21
        L1d:
            boolean r0 = r9.h(r2)
        L21:
            if (r0 == 0) goto L25
            r0 = 4
            goto L26
        L25:
            r0 = 2
        L26:
            r0 = r0 | r8
            goto L29
        L28:
            r0 = r8
        L29:
            r5 = r8 & 48
            if (r5 != 0) goto L39
            boolean r5 = r9.g(r3)
            if (r5 == 0) goto L36
            r5 = 32
            goto L38
        L36:
            r5 = 16
        L38:
            r0 = r0 | r5
        L39:
            r5 = r8 & 384(0x180, float:5.38E-43)
            r7 = 256(0x100, float:3.59E-43)
            if (r5 != 0) goto L4a
            boolean r5 = r9.h(r4)
            if (r5 == 0) goto L47
            r5 = r7
            goto L49
        L47:
            r5 = 128(0x80, float:1.8E-43)
        L49:
            r0 = r0 | r5
        L4a:
            r5 = r8 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L5d
            r5 = r41
            boolean r11 = r9.h(r5)
            if (r11 == 0) goto L59
            r11 = 2048(0x800, float:2.87E-42)
            goto L5b
        L59:
            r11 = 1024(0x400, float:1.435E-42)
        L5b:
            r0 = r0 | r11
            goto L5f
        L5d:
            r5 = r41
        L5f:
            r11 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L72
            r11 = r42
            boolean r13 = r9.h(r11)
            if (r13 == 0) goto L6e
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L70
        L6e:
            r13 = 8192(0x2000, float:1.148E-41)
        L70:
            r0 = r0 | r13
            goto L74
        L72:
            r11 = r42
        L74:
            r13 = 196608(0x30000, float:2.75506E-40)
            r13 = r13 & r8
            if (r13 != 0) goto L88
            r13 = r43
            boolean r15 = r9.h(r13)
            if (r15 == 0) goto L84
            r15 = 131072(0x20000, float:1.83671E-40)
            goto L86
        L84:
            r15 = 65536(0x10000, float:9.1835E-41)
        L86:
            r0 = r0 | r15
            goto L8a
        L88:
            r13 = r43
        L8a:
            r15 = 74899(0x12493, float:1.04956E-40)
            r15 = r15 & r0
            r1 = 74898(0x12492, float:1.04954E-40)
            r8 = 0
            if (r15 == r1) goto L96
            r1 = 1
            goto L97
        L96:
            r1 = r8
        L97:
            r15 = r0 & 1
            boolean r1 = r9.S(r15, r1)
            if (r1 == 0) goto L2ed
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto Lba
            i0.r1 r10 = r9.t()
            if (r10 == 0) goto L30e
            wb.ds r0 = new wb.ds
            r9 = 0
            r1 = r37
            r8 = r45
            r6 = r11
            r7 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
        Lb7:
            r10.f6035d = r0
            return
        Lba:
            r1 = r3
            r2 = r4
            y0.l r3 = y0.l.f21818a
            r4 = 1065353216(0x3f800000, float:1.0)
            y0.o r18 = p.h1.d(r3, r4)
            r5 = 10
            float r5 = (float) r5
            r11 = 8
            float r11 = (float) r11
            r22 = 0
            r23 = 8
            r21 = r5
            r19 = r5
            r20 = r11
            y0.o r5 = p.d.p(r18, r19, r20, r21, r22, r23)
            r11 = r19
            r13 = 6
            float r13 = (float) r13
            v.d r13 = v.e.a(r13)
            y0.o r5 = c1.h.b(r5, r13)
            i0.m2 r13 = bi.d.f892a
            java.lang.Object r15 = r9.j(r13)
            bi.b r15 = (bi.b) r15
            long r14 = r15.k()
            f1.m0 r12 = f1.c0.f3038b
            y0.o r5 = k.n.g(r5, r14, r12)
            p.e r12 = p.j.f9926c
            y0.e r14 = y0.b.f21804s
            p.t r12 = p.s.a(r12, r14, r9, r8)
            long r14 = r9.T
            int r14 = java.lang.Long.hashCode(r14)
            s0.h r15 = r9.l()
            y0.o r5 = y0.a.c(r9, r5)
            x1.f r20 = x1.g.f20914f
            r20.getClass()
            x1.y r8 = x1.f.f20883b
            r9.d0()
            boolean r10 = r9.S
            if (r10 == 0) goto L11e
            r9.k(r8)
            goto L121
        L11e:
            r9.n0()
        L121:
            x1.e r10 = x1.f.f20886e
            i0.r.A(r10, r9, r12)
            x1.e r12 = x1.f.f20885d
            i0.r.A(r12, r9, r15)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            x1.e r15 = x1.f.f20887f
            i0.r.A(r15, r9, r14)
            x1.d r14 = x1.f.f20888g
            i0.r.w(r14, r9)
            x1.e r6 = x1.f.f20884c
            i0.r.A(r6, r9, r5)
            y0.o r23 = p.h1.d(r3, r4)
            r5 = r0 & 896(0x380, float:1.256E-42)
            if (r5 != r7) goto L148
            r5 = 1
            goto L149
        L148:
            r5 = 0
        L149:
            r7 = r0 & 112(0x70, float:1.57E-43)
            r4 = 32
            if (r7 != r4) goto L151
            r4 = 1
            goto L152
        L151:
            r4 = 0
        L152:
            r4 = r4 | r5
            java.lang.Object r5 = r9.P()
            i0.e r7 = i0.l.f5952a
            if (r4 != 0) goto L15d
            if (r5 != r7) goto L166
        L15d:
            u.c r5 = new u.c
            r4 = 3
            r5.<init>(r4, r2, r1)
            r9.k0(r5)
        L166:
            r27 = r5
            fg.a r27 = (fg.a) r27
            r28 = 15
            r24 = 0
            r25 = 0
            r26 = 0
            y0.o r4 = k.n.j(r23, r24, r25, r26, r27, r28)
            r5 = 7
            float r5 = (float) r5
            y0.o r4 = p.d.m(r4, r11, r5)
            y0.f r5 = y0.b.f21802q
            p.c r11 = p.j.f9924a
            r22 = r0
            r0 = 48
            p.e1 r0 = p.d1.a(r11, r5, r9, r0)
            long r1 = r9.T
            int r1 = java.lang.Long.hashCode(r1)
            s0.h r2 = r9.l()
            y0.o r4 = y0.a.c(r9, r4)
            r9.d0()
            boolean r5 = r9.S
            if (r5 == 0) goto L1a1
            r9.k(r8)
            goto L1a4
        L1a1:
            r9.n0()
        L1a4:
            i0.r.A(r10, r9, r0)
            i0.r.A(r12, r9, r2)
            j8.b.p(r1, r9, r15, r9, r14)
            i0.r.A(r6, r9, r4)
            int r0 = r38.size()
            java.lang.String r1 = "待发送 "
            java.lang.String r0 = eh.a.l(r0, r1)
            java.lang.Object r1 = r9.j(r13)
            bi.b r1 = (bi.b) r1
            long r1 = r1.g()
            r4 = 12
            long r4 = x6.d.D(r4)
            m2.k r6 = m2.k.f8698j
            r8 = 1065353216(0x3f800000, float:1.0)
            double r10 = (double) r8
            r14 = 0
            int r8 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r8 <= 0) goto L1d7
            r8 = 1
            goto L1d8
        L1d7:
            r8 = 0
        L1d8:
            if (r8 != 0) goto L1df
            java.lang.String r8 = "invalid weight; must be greater than zero"
            q.a.a(r8)
        L1df:
            r8 = r3
            r2 = r1
            p.q0 r1 = new p.q0
            r10 = 1065353216(0x3f800000, float:1.0)
            r11 = 1
            r1.<init>(r10, r11)
            r21 = 0
            r12 = r22
            r22 = 262056(0x3ffa8, float:3.67219E-40)
            r14 = r7
            r7 = 0
            r15 = r8
            r8 = 0
            r29 = r10
            r10 = 0
            r24 = r11
            r23 = r12
            r11 = 0
            r25 = r13
            r13 = 0
            r26 = r14
            r14 = 0
            r27 = r15
            r15 = 0
            r28 = 4
            r16 = 0
            r30 = 2048(0x800, float:2.87E-42)
            r17 = 0
            r31 = 131072(0x20000, float:1.83671E-40)
            r18 = 0
            r32 = 0
            r20 = 1597440(0x186000, float:2.23849E-39)
            r19 = r44
            r33 = r23
            r34 = r25
            r35 = r26
            r36 = r27
            sh.s.n(r0, r1, r2, r4, r6, r7, r8, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r9 = r19
            if (r39 == 0) goto L22c
            m1.f r0 = wb.ap.f15079t
            goto L22e
        L22c:
            m1.f r0 = wb.ap.f15080u
        L22e:
            if (r39 == 0) goto L235
            java.lang.String r1 = "收起待发送消息"
        L232:
            r2 = r34
            goto L238
        L235:
            java.lang.String r1 = "展开待发送消息"
            goto L232
        L238:
            java.lang.Object r2 = r9.j(r2)
            bi.b r2 = (bi.b) r2
            long r2 = r2.h()
            f1.n r4 = new f1.n
            r5 = 5
            r4.<init>(r2, r5)
            r2 = 18
            float r2 = (float) r2
            r8 = r36
            y0.o r2 = p.h1.j(r8, r2)
            r5 = 384(0x180, float:5.38E-43)
            r3 = r4
            r4 = r9
            k.n.c(r0, r1, r2, r3, r4, r5)
            r12 = 1
            r9.p(r12)
            if (r39 == 0) goto L2df
            r0 = 288705228(0x11354acc, float:1.4301431E-28)
            r9.a0(r0)
            r10 = 1065353216(0x3f800000, float:1.0)
            y0.o r0 = p.h1.d(r8, r10)
            r1 = 150(0x96, float:2.1E-43)
            float r1 = (float) r1
            r2 = 0
            y0.o r6 = p.h1.g(r0, r2, r1, r12)
            r0 = r33
            r1 = r0 & 14
            r2 = 4
            if (r1 == r2) goto L288
            r1 = r0 & 8
            r2 = r38
            if (r1 == 0) goto L286
            boolean r1 = r9.h(r2)
            if (r1 == 0) goto L286
            goto L28a
        L286:
            r8 = 0
            goto L28b
        L288:
            r2 = r38
        L28a:
            r8 = r12
        L28b:
            r1 = r0 & 7168(0x1c00, float:1.0045E-41)
            r3 = 2048(0x800, float:2.87E-42)
            if (r1 != r3) goto L293
            r1 = r12
            goto L294
        L293:
            r1 = 0
        L294:
            r1 = r1 | r8
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r0
            r4 = 131072(0x20000, float:1.83671E-40)
            if (r3 != r4) goto L29e
            r8 = r12
            goto L29f
        L29e:
            r8 = 0
        L29f:
            r1 = r1 | r8
            r3 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r3
            r3 = 16384(0x4000, float:2.2959E-41)
            if (r0 != r3) goto L2aa
            r8 = r12
            goto L2ab
        L2aa:
            r8 = 0
        L2ab:
            r0 = r1 | r8
            java.lang.Object r1 = r9.P()
            if (r0 != 0) goto L2b7
            r14 = r35
            if (r1 != r14) goto L2c9
        L2b7:
            c9.k r0 = new c9.k
            r5 = 28
            r4 = r42
            r3 = r43
            r1 = r2
            r2 = r41
            r0.<init>(r1, r2, r3, r4, r5)
            r9.k0(r0)
            r1 = r0
        L2c9:
            r8 = r1
            fg.l r8 = (fg.l) r8
            r10 = 6
            r11 = 510(0x1fe, float:7.15E-43)
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r6 = 0
            r7 = 0
            a.a.b(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = 0
            r9.p(r0)
            goto L2e9
        L2df:
            r0 = 0
            r1 = 290573412(0x1151cc64, float:1.6550176E-28)
            r9.a0(r1)
            r9.p(r0)
        L2e9:
            r9.p(r12)
            goto L2f0
        L2ed:
            r9.V()
        L2f0:
            i0.r1 r10 = r9.t()
            if (r10 == 0) goto L30e
            wb.ds r0 = new wb.ds
            r9 = 1
            r1 = r37
            r2 = r38
            r3 = r39
            r4 = r40
            r5 = r41
            r6 = r42
            r7 = r43
            r8 = r45
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto Lb7
        L30e:
            return
    }

    public void j(java.lang.String r33, java.lang.String r34, int r35, int r36, y0.o r37, fg.l r38, i0.h0 r39, int r40) {
            r32 = this;
            r6 = r37
            r7 = r38
            r0 = r39
            r1 = 1883143718(0x703e7e26, float:2.3581862E29)
            r0.b0(r1)
            r3 = r34
            boolean r1 = r0.f(r3)
            if (r1 == 0) goto L17
            r1 = 32
            goto L19
        L17:
            r1 = 16
        L19:
            r1 = r40 | r1
            boolean r2 = r0.f(r6)
            if (r2 == 0) goto L24
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L26
        L24:
            r2 = 8192(0x2000, float:1.148E-41)
        L26:
            r1 = r1 | r2
            boolean r2 = r0.h(r7)
            if (r2 == 0) goto L30
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L32
        L30:
            r2 = 65536(0x10000, float:9.1835E-41)
        L32:
            r1 = r1 | r2
            r2 = 74899(0x12493, float:1.04956E-40)
            r2 = r2 & r1
            r5 = 74898(0x12492, float:1.04954E-40)
            r8 = 0
            r9 = 1
            if (r2 == r5) goto L40
            r2 = r9
            goto L41
        L40:
            r2 = r8
        L41:
            r5 = r1 & 1
            boolean r2 = r0.S(r5, r2)
            if (r2 == 0) goto L1b3
            p.e r2 = p.j.f9926c
            y0.e r5 = y0.b.f21804s
            p.t r2 = p.s.a(r2, r5, r0, r8)
            long r10 = r0.T
            int r5 = java.lang.Long.hashCode(r10)
            s0.h r10 = r0.l()
            y0.o r11 = y0.a.c(r0, r6)
            x1.f r12 = x1.g.f20914f
            r12.getClass()
            x1.y r12 = x1.f.f20883b
            r0.d0()
            boolean r13 = r0.S
            if (r13 == 0) goto L71
            r0.k(r12)
            goto L74
        L71:
            r0.n0()
        L74:
            x1.e r12 = x1.f.f20886e
            i0.r.A(r12, r0, r2)
            x1.e r2 = x1.f.f20885d
            i0.r.A(r2, r0, r10)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            x1.e r5 = x1.f.f20887f
            i0.r.A(r5, r0, r2)
            x1.d r2 = x1.f.f20888g
            i0.r.w(r2, r0)
            x1.e r2 = x1.f.f20884c
            i0.r.A(r2, r0, r11)
            i0.m2 r2 = bi.d.f892a
            java.lang.Object r5 = r0.j(r2)
            bi.b r5 = (bi.b) r5
            long r10 = r5.h()
            r5 = 12
            long r12 = x6.d.D(r5)
            y0.l r5 = y0.l.f21818a
            r14 = 1065353216(0x3f800000, float:1.0)
            y0.o r15 = p.h1.d(r5, r14)
            r8 = 6
            float r8 = (float) r8
            r20 = 7
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = r8
            y0.o r8 = p.d.p(r15, r16, r17, r18, r19, r20)
            t2.k r15 = new t2.k
            r4 = 3
            r15.<init>(r4)
            r29 = 0
            r30 = 261096(0x3fbe8, float:3.65873E-40)
            r16 = r14
            r14 = 0
            r18 = r15
            r15 = 0
            r19 = r16
            r16 = 0
            r22 = r19
            r19 = 0
            r23 = 0
            r21 = 0
            r24 = r22
            r22 = 0
            r25 = r23
            r23 = 0
            r26 = r24
            r24 = 0
            r27 = r25
            r25 = 0
            r28 = r26
            r26 = 0
            r31 = r28
            r28 = 24630(0x6036, float:3.4514E-41)
            r27 = r0
            r9 = r8
            r0 = r31
            r8 = r33
            sh.s.n(r8, r9, r10, r12, r14, r15, r16, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r8 = r27
            w.p0 r13 = new w.p0
            r9 = 123(0x7b, float:1.72E-43)
            r13.<init>(r4, r9)
            i2.n0 r12 = new i2.n0
            java.lang.Object r9 = r8.j(r2)
            bi.b r9 = (bi.b) r9
            long r15 = r9.g()
            r9 = 20
            long r17 = x6.d.D(r9)
            r23 = 0
            r25 = 16744444(0xff7ffc, float:2.3463964E-38)
            r19 = 0
            r20 = 0
            r22 = 3
            r14 = r12
            r14.<init>(r15, r17, r19, r20, r22, r23, r25)
            f1.t0 r9 = new f1.t0
            java.lang.Object r10 = r8.j(r2)
            bi.b r10 = (bi.b) r10
            long r10 = r10.j()
            r9.<init>(r10)
            y0.o r0 = p.h1.d(r5, r0)
            r5 = 48
            float r5 = (float) r5
            y0.o r0 = p.h1.e(r0, r5)
            r5 = 8
            float r5 = (float) r5
            v.d r10 = v.e.a(r5)
            y0.o r0 = c1.h.b(r0, r10)
            java.lang.Object r2 = r8.j(r2)
            bi.b r2 = (bi.b) r2
            long r10 = r2.k()
            f1.m0 r2 = f1.c0.f3038b
            y0.o r0 = k.n.g(r0, r10, r2)
            r2 = 10
            float r2 = (float) r2
            y0.o r10 = p.d.m(r0, r5, r2)
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r1
            r2 = 131072(0x20000, float:1.83671E-40)
            if (r0 != r2) goto L16a
            r31 = 1
            goto L16c
        L16a:
            r31 = 0
        L16c:
            java.lang.Object r0 = r8.P()
            if (r31 != 0) goto L17c
            i0.e r2 = i0.l.f5952a
            if (r0 != r2) goto L177
            goto L17c
        L177:
            r2 = r35
            r5 = r36
            goto L188
        L17c:
            i2.n r0 = new i2.n
            r2 = r35
            r5 = r36
            r0.<init>(r2, r5, r7)
            r8.k0(r0)
        L188:
            fg.l r0 = (fg.l) r0
            int r1 = r1 >> r4
            r1 = r1 & 14
            r4 = 102236160(0x6180000, float:2.8588023E-35)
            r23 = r1 | r4
            r24 = 0
            r25 = 48792(0xbe98, float:6.8372E-41)
            r11 = 0
            r14 = 0
            r15 = 1
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = r8
            r20 = r9
            r9 = r0
            r8 = r3
            w.i.a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r8 = r22
            r0 = 1
            r8.p(r0)
            goto L1bb
        L1b3:
            r2 = r35
            r5 = r36
            r8 = r0
            r8.V()
        L1bb:
            i0.r1 r9 = r8.t()
            if (r9 == 0) goto L1d1
            c9.j0 r0 = new c9.j0
            r1 = r32
            r3 = r34
            r8 = r40
            r4 = r2
            r2 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f6035d = r0
        L1d1:
            return
    }

    public void j0(int r29, fg.a r30, i0.h0 r31, java.lang.String r32, java.lang.String r33, y0.o r34, boolean r35) {
            r28 = this;
            r1 = r29
            r6 = r31
            r0 = r33
            r2 = r34
            r8 = r35
            r3 = -2062829465(0xffffffff850bb867, float:-6.569618E-36)
            r6.b0(r3)
            r3 = r1 & 6
            r4 = 2
            if (r3 != 0) goto L20
            boolean r3 = r31.f(r32)
            if (r3 == 0) goto L1d
            r3 = 4
            goto L1e
        L1d:
            r3 = r4
        L1e:
            r3 = r3 | r1
            goto L21
        L20:
            r3 = r1
        L21:
            r5 = r1 & 48
            if (r5 != 0) goto L31
            boolean r5 = r6.f(r0)
            if (r5 == 0) goto L2e
            r5 = 32
            goto L30
        L2e:
            r5 = 16
        L30:
            r3 = r3 | r5
        L31:
            r5 = r1 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L41
            boolean r5 = r6.g(r8)
            if (r5 == 0) goto L3e
            r5 = 256(0x100, float:3.59E-43)
            goto L40
        L3e:
            r5 = 128(0x80, float:1.8E-43)
        L40:
            r3 = r3 | r5
        L41:
            r5 = r1 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L51
            boolean r5 = r6.f(r2)
            if (r5 == 0) goto L4e
            r5 = 2048(0x800, float:2.87E-42)
            goto L50
        L4e:
            r5 = 1024(0x400, float:1.435E-42)
        L50:
            r3 = r3 | r5
        L51:
            r5 = r1 & 24576(0x6000, float:3.4438E-41)
            r11 = r30
            if (r5 != 0) goto L63
            boolean r5 = r6.h(r11)
            if (r5 == 0) goto L60
            r5 = 16384(0x4000, float:2.2959E-41)
            goto L62
        L60:
            r5 = 8192(0x2000, float:1.148E-41)
        L62:
            r3 = r3 | r5
        L63:
            r5 = r3 & 9363(0x2493, float:1.312E-41)
            r7 = 9362(0x2492, float:1.3119E-41)
            r13 = 1
            r14 = 0
            if (r5 == r7) goto L6d
            r5 = r13
            goto L6e
        L6d:
            r5 = r14
        L6e:
            r3 = r3 & r13
            boolean r3 = r6.S(r3, r5)
            if (r3 == 0) goto L1c4
            r3 = 28
            float r3 = (float) r3
            y0.o r3 = p.h1.e(r2, r3)
            r5 = 6
            float r5 = (float) r5
            v.d r5 = v.e.a(r5)
            y0.o r3 = c1.h.b(r3, r5)
            i0.m2 r5 = bi.d.f892a
            java.lang.Object r7 = r6.j(r5)
            bi.b r7 = (bi.b) r7
            long r9 = r7.k()
            f1.m0 r7 = f1.c0.f3038b
            y0.o r7 = k.n.g(r3, r9, r7)
            r10 = 0
            r12 = 14
            r9 = 0
            y0.o r3 = k.n.j(r7, r8, r9, r10, r11, r12)
            r7 = 8
            float r7 = (float) r7
            r8 = 0
            y0.o r3 = p.d.n(r3, r7, r8, r4)
            y0.f r4 = y0.b.f21802q
            p.c r7 = p.j.f9924a
            r8 = 48
            p.e1 r4 = p.d1.a(r7, r4, r6, r8)
            long r7 = r6.T
            int r7 = java.lang.Long.hashCode(r7)
            s0.h r8 = r6.l()
            y0.o r3 = y0.a.c(r6, r3)
            x1.f r9 = x1.g.f20914f
            r9.getClass()
            x1.y r9 = x1.f.f20883b
            r6.d0()
            boolean r10 = r6.S
            if (r10 == 0) goto Ld2
            r6.k(r9)
            goto Ld5
        Ld2:
            r6.n0()
        Ld5:
            x1.e r9 = x1.f.f20886e
            i0.r.A(r9, r6, r4)
            x1.e r4 = x1.f.f20885d
            i0.r.A(r4, r6, r8)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            x1.e r7 = x1.f.f20887f
            i0.r.A(r7, r6, r4)
            x1.d r4 = x1.f.f20888g
            i0.r.w(r4, r6)
            x1.e r4 = x1.f.f20884c
            i0.r.A(r4, r6, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = r32
            r3.append(r4)
            java.lang.String r7 = " · "
            r3.append(r7)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            if (r35 == 0) goto L11e
            r7 = -509503255(0xffffffffe1a198e9, float:-3.72618E20)
            r6.a0(r7)
            java.lang.Object r7 = r6.j(r5)
            bi.b r7 = (bi.b) r7
            long r7 = r7.h()
            r6.p(r14)
            goto L137
        L11e:
            r7 = -509419338(0xffffffffe1a2e0b6, float:-3.755706E20)
            r6.a0(r7)
            java.lang.Object r7 = r6.j(r5)
            bi.b r7 = (bi.b) r7
            long r7 = r7.h()
            r9 = 1056964608(0x3f000000, float:0.5)
            long r7 = f1.w.b(r7, r9)
            r6.p(r14)
        L137:
            r9 = 11
            long r9 = x6.d.D(r9)
            r11 = 1065353216(0x3f800000, float:1.0)
            double r14 = (double) r11
            r16 = 0
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 <= 0) goto L148
        L146:
            r2 = r3
            goto L14e
        L148:
            java.lang.String r12 = "invalid weight; must be greater than zero"
            q.a.a(r12)
            goto L146
        L14e:
            p.q0 r3 = new p.q0
            r3.<init>(r11, r13)
            r23 = 24960(0x6180, float:3.4976E-41)
            r24 = 241640(0x3afe8, float:3.3861E-40)
            r26 = r7
            r7 = r5
            r4 = r26
            r8 = 0
            r26 = r9
            r10 = r7
            r6 = r26
            r9 = 0
            r12 = r10
            r10 = 0
            r14 = r12
            r12 = 0
            r16 = r13
            r15 = r14
            r13 = 0
            r17 = r15
            r15 = 2
            r18 = r16
            r16 = 0
            r19 = r17
            r17 = 1
            r20 = r18
            r18 = 0
            r21 = r19
            r19 = 0
            r22 = r20
            r20 = 0
            r25 = r22
            r22 = 24576(0x6000, float:3.4438E-41)
            r0 = r21
            r1 = r25
            r21 = r31
            sh.s.n(r2, r3, r4, r6, r8, r9, r10, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r6 = r21
            m1.f r2 = wb.ap.f15080u
            java.lang.Object r0 = r6.j(r0)
            bi.b r0 = (bi.b) r0
            long r3 = r0.h()
            f1.n r5 = new f1.n
            r0 = 5
            r5.<init>(r3, r0)
            r0 = 3
            float r8 = (float) r0
            r11 = 0
            r12 = 14
            y0.l r7 = y0.l.f21818a
            r9 = 0
            r10 = 0
            y0.o r0 = p.d.p(r7, r8, r9, r10, r11, r12)
            r3 = 14
            float r3 = (float) r3
            y0.o r4 = p.h1.j(r0, r3)
            r3 = 0
            r7 = 438(0x1b6, float:6.14E-43)
            k.n.c(r2, r3, r4, r5, r6, r7)
            r6.p(r1)
            goto L1c7
        L1c4:
            r6.V()
        L1c7:
            i0.r1 r8 = r6.t()
            if (r8 == 0) goto L1e2
            l.h r0 = new l.h
            r5 = r28
            r1 = r29
            r2 = r30
            r3 = r32
            r4 = r33
            r6 = r34
            r7 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.f6035d = r0
        L1e2:
            return
    }

    public void k(java.lang.String r30, fg.a r31, y0.o r32, boolean r33, i0.h0 r34, int r35, int r36) {
            r29 = this;
            r4 = r32
            r0 = r34
            r1 = r35
            r2 = -1319556128(0xffffffffb1592be0, float:-3.1602596E-9)
            r0.b0(r2)
            r2 = r1 & 6
            r3 = 2
            if (r2 != 0) goto L20
            r2 = r30
            boolean r5 = r0.f(r2)
            if (r5 == 0) goto L1b
            r5 = 4
            goto L1c
        L1b:
            r5 = r3
        L1c:
            r5 = r5 | r1
        L1d:
            r10 = r31
            goto L24
        L20:
            r2 = r30
            r5 = r1
            goto L1d
        L24:
            boolean r6 = r0.h(r10)
            if (r6 == 0) goto L2d
            r6 = 32
            goto L2f
        L2d:
            r6 = 16
        L2f:
            r5 = r5 | r6
            r6 = r1 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L40
            boolean r6 = r0.f(r4)
            if (r6 == 0) goto L3d
            r6 = 256(0x100, float:3.59E-43)
            goto L3f
        L3d:
            r6 = 128(0x80, float:1.8E-43)
        L3f:
            r5 = r5 | r6
        L40:
            r6 = r36 & 8
            if (r6 == 0) goto L49
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L46:
            r7 = r33
            goto L5b
        L49:
            r7 = r1 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L46
            r7 = r33
            boolean r8 = r0.g(r7)
            if (r8 == 0) goto L58
            r8 = 2048(0x800, float:2.87E-42)
            goto L5a
        L58:
            r8 = 1024(0x400, float:1.435E-42)
        L5a:
            r5 = r5 | r8
        L5b:
            r8 = r5 & 1171(0x493, float:1.641E-42)
            r9 = 1170(0x492, float:1.64E-42)
            r12 = 1
            r13 = 0
            if (r8 == r9) goto L65
            r8 = r12
            goto L66
        L65:
            r8 = r13
        L66:
            r9 = r5 & 1
            boolean r8 = r0.S(r9, r8)
            if (r8 == 0) goto L175
            if (r6 == 0) goto L73
            r28 = r13
            goto L75
        L73:
            r28 = r7
        L75:
            r6 = 44
            float r6 = (float) r6
            r7 = 0
            y0.o r3 = p.h1.g(r4, r6, r7, r3)
            r6 = 10
            float r6 = (float) r6
            v.d r6 = v.e.a(r6)
            y0.o r3 = c1.h.b(r3, r6)
            if (r28 == 0) goto La0
            r6 = 939400660(0x37fe1dd4, float:3.029305E-5)
            r0.a0(r6)
            i0.m2 r6 = bi.d.f892a
            java.lang.Object r6 = r0.j(r6)
            bi.b r6 = (bi.b) r6
            long r6 = r6.j()
            r0.p(r13)
            goto Lb5
        La0:
            r6 = 939484267(0x37ff646b, float:3.044513E-5)
            r0.a0(r6)
            i0.m2 r6 = bi.d.f892a
            java.lang.Object r6 = r0.j(r6)
            bi.b r6 = (bi.b) r6
            long r6 = r6.k()
            r0.p(r13)
        Lb5:
            f1.m0 r8 = f1.c0.f3038b
            y0.o r6 = k.n.g(r3, r6, r8)
            r9 = 0
            r11 = 15
            r7 = 0
            r8 = 0
            y0.o r3 = k.n.j(r6, r7, r8, r9, r10, r11)
            r6 = 6
            float r6 = (float) r6
            r7 = 8
            float r7 = (float) r7
            y0.o r3 = p.d.m(r3, r6, r7)
            y0.g r6 = y0.b.f21796k
            v1.n0 r6 = p.o.d(r6, r13)
            long r7 = r0.T
            int r7 = java.lang.Long.hashCode(r7)
            s0.h r8 = r0.l()
            y0.o r3 = y0.a.c(r0, r3)
            x1.f r9 = x1.g.f20914f
            r9.getClass()
            x1.y r9 = x1.f.f20883b
            r0.d0()
            boolean r10 = r0.S
            if (r10 == 0) goto Lf3
            r0.k(r9)
            goto Lf6
        Lf3:
            r0.n0()
        Lf6:
            x1.e r9 = x1.f.f20886e
            i0.r.A(r9, r0, r6)
            x1.e r6 = x1.f.f20885d
            i0.r.A(r6, r0, r8)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            x1.e r7 = x1.f.f20887f
            i0.r.A(r7, r0, r6)
            x1.d r6 = x1.f.f20888g
            i0.r.w(r6, r0)
            x1.e r6 = x1.f.f20884c
            i0.r.A(r6, r0, r3)
            if (r28 == 0) goto L122
            r3 = -1124569825(0xffffffffbcf86d1f, float:-0.03032547)
            r0.a0(r3)
            r0.p(r13)
            long r6 = f1.w.f3127c
        L120:
            r7 = r6
            goto L138
        L122:
            r3 = -1124568733(0xffffffffbcf87163, float:-0.030327505)
            r0.a0(r3)
            i0.m2 r3 = bi.d.f892a
            java.lang.Object r3 = r0.j(r3)
            bi.b r3 = (bi.b) r3
            long r6 = r3.g()
            r0.p(r13)
            goto L120
        L138:
            r3 = 13
            long r9 = x6.d.D(r3)
            r3 = 18
            long r16 = x6.d.D(r3)
            m2.k r11 = m2.k.f8698j
            t2.k r15 = new t2.k
            r3 = 3
            r15.<init>(r3)
            r3 = r5 & 14
            r5 = 1597440(0x186000, float:2.23849E-39)
            r25 = r3 | r5
            r26 = 48
            r27 = 258986(0x3f3aa, float:3.62917E-40)
            r6 = 0
            r3 = r12
            r12 = 0
            r13 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = r0
            r5 = r2
            sh.s.n(r5, r6, r7, r9, r11, r12, r13, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r0.p(r3)
            r5 = r28
            goto L179
        L175:
            r0.V()
            r5 = r7
        L179:
            i0.r1 r9 = r0.t()
            if (r9 == 0) goto L190
            c9.f0 r0 = new c9.f0
            r8 = 4
            r2 = r30
            r3 = r31
            r7 = r36
            r6 = r1
            r1 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f6035d = r0
        L190:
            return
    }

    public void k0(boolean r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.util.List r25, fg.l r26, fg.l r27, fg.l r28, fg.p r29, fg.a r30, i0.h0 r31, int r32, int r33) {
            r20 = this;
            r0 = r31
            r1 = -816139539(0xffffffffcf5ab2ed, float:-3.6691592E9)
            r0.b0(r1)
            r3 = r21
            boolean r1 = r0.g(r3)
            if (r1 == 0) goto L12
            r1 = 4
            goto L13
        L12:
            r1 = 2
        L13:
            r1 = r32 | r1
            r5 = r22
            boolean r2 = r0.f(r5)
            if (r2 == 0) goto L20
            r2 = 32
            goto L22
        L20:
            r2 = 16
        L22:
            r1 = r1 | r2
            r6 = r23
            boolean r2 = r0.f(r6)
            if (r2 == 0) goto L2e
            r2 = 256(0x100, float:3.59E-43)
            goto L30
        L2e:
            r2 = 128(0x80, float:1.8E-43)
        L30:
            r1 = r1 | r2
            r7 = r24
            boolean r2 = r0.f(r7)
            if (r2 == 0) goto L3c
            r2 = 2048(0x800, float:2.87E-42)
            goto L3e
        L3c:
            r2 = 1024(0x400, float:1.435E-42)
        L3e:
            r1 = r1 | r2
            r8 = r25
            boolean r2 = r0.f(r8)
            if (r2 == 0) goto L4a
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L4c
        L4a:
            r2 = 8192(0x2000, float:1.148E-41)
        L4c:
            r1 = r1 | r2
            r4 = r26
            boolean r2 = r0.h(r4)
            if (r2 == 0) goto L58
            r2 = 131072(0x20000, float:1.83671E-40)
            goto L5a
        L58:
            r2 = 65536(0x10000, float:9.1835E-41)
        L5a:
            r1 = r1 | r2
            r10 = r27
            boolean r2 = r0.h(r10)
            if (r2 == 0) goto L66
            r2 = 1048576(0x100000, float:1.469368E-39)
            goto L68
        L66:
            r2 = 524288(0x80000, float:7.34684E-40)
        L68:
            r1 = r1 | r2
            r9 = r28
            boolean r2 = r0.h(r9)
            if (r2 == 0) goto L74
            r2 = 8388608(0x800000, float:1.1754944E-38)
            goto L76
        L74:
            r2 = 4194304(0x400000, float:5.877472E-39)
        L76:
            r1 = r1 | r2
            r11 = r29
            boolean r2 = r0.h(r11)
            if (r2 == 0) goto L82
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            goto L84
        L82:
            r2 = 33554432(0x2000000, float:9.403955E-38)
        L84:
            r1 = r1 | r2
            r2 = 306783379(0x12492493, float:6.34695E-28)
            r2 = r2 & r1
            r12 = 306783378(0x12492492, float:6.3469493E-28)
            r13 = 1
            if (r2 != r12) goto L96
            r2 = r33 & 1
            if (r2 == 0) goto L94
            goto L96
        L94:
            r2 = 0
            goto L97
        L96:
            r2 = r13
        L97:
            r1 = r1 & r13
            boolean r1 = r0.S(r1, r2)
            if (r1 == 0) goto Lcd
            r.b r2 = new r.b
            r19 = r7
            r7 = r6
            r6 = r10
            r10 = r8
            r8 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r1 = -1253710612(0xffffffffb545e4ec, float:-7.3721344E-7)
            s0.d r15 = s0.i.e(r1, r2, r0)
            r17 = 100663686(0x6000186, float:2.4075244E-35)
            r18 = 3072(0xc00, float:4.305E-42)
            r0 = 0
            java.lang.String r1 = "快捷选项"
            r2 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r9 = r30
            r16 = r31
            oh.h.d(r0, r1, r2, r4, r6, r8, r9, r10, r12, r14, r15, r16, r17, r18)
            goto Ld0
        Lcd:
            r31.V()
        Ld0:
            i0.r1 r0 = r31.t()
            if (r0 == 0) goto Lf7
            wb.ts r2 = new wb.ts
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r24
            r8 = r25
            r9 = r26
            r10 = r27
            r11 = r28
            r12 = r29
            r13 = r30
            r14 = r32
            r15 = r33
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0.f6035d = r2
        Lf7:
            return
    }

    public void l(java.lang.String r66, java.lang.String r67, java.lang.String r68, fg.l r69, i0.h0 r70, int r71) {
            r65 = this;
            r0 = r68
            r3 = r70
            r2 = -2057332027(0xffffffff855f9ac5, float:-1.0513836E-35)
            r3.b0(r2)
            boolean r2 = r3.f(r0)
            if (r2 == 0) goto L13
            r2 = 256(0x100, float:3.59E-43)
            goto L15
        L13:
            r2 = 128(0x80, float:1.8E-43)
        L15:
            r2 = r71 | r2
            r4 = r2 & 9363(0x2493, float:1.312E-41)
            r5 = 9362(0x2492, float:1.3119E-41)
            r6 = 0
            if (r4 == r5) goto L20
            r4 = 1
            goto L21
        L20:
            r4 = r6
        L21:
            r5 = r2 & 1
            boolean r4 = r3.S(r5, r4)
            if (r4 == 0) goto L4a9
            java.lang.Object r4 = r3.P()
            i0.e r5 = i0.l.f5952a
            if (r4 != r5) goto L3a
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            i0.j1 r4 = i0.r.u(r4)
            r3.k0(r4)
        L3a:
            i0.a1 r4 = (i0.a1) r4
            r8 = 6
            int r2 = r2 >> r8
            r25 = 14
            r26 = r2 & 14
            i0.a1 r2 = i0.r.y(r0, r3)
            sf.e r9 = H1(r0)
            java.lang.Object r10 = r9.f12419h
            java.lang.Object r9 = r9.f12418g
            java.lang.Object r11 = r3.P()
            if (r11 != r5) goto L64
            r11 = r10
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            int r11 = r11.length()
            if (r11 <= 0) goto L5f
            r11 = 1
            goto L60
        L5f:
            r11 = r6
        L60:
            i0.j1 r11 = p.a.h(r11, r3)
        L64:
            i0.a1 r11 = (i0.a1) r11
            java.lang.Object r12 = r11.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L83
            r12 = r10
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            int r13 = r12.length()
            if (r13 != 0) goto L7e
            r12 = r9
            java.lang.String r12 = (java.lang.String) r12
        L7e:
            java.lang.String r12 = (java.lang.String) r12
        L80:
            r27 = r12
            goto L87
        L83:
            r12 = r9
            java.lang.String r12 = (java.lang.String) r12
            goto L80
        L87:
            y0.l r12 = y0.l.f21818a
            r13 = 1065353216(0x3f800000, float:1.0)
            y0.o r14 = p.h1.d(r12, r13)
            r15 = 10
            float r15 = (float) r15
            r18 = 0
            r19 = 13
            r16 = r15
            r15 = 0
            r17 = 0
            y0.o r14 = p.d.p(r14, r15, r16, r17, r18, r19)
            p.e r15 = p.j.f9926c
            y0.e r8 = y0.b.f21804s
            p.t r7 = p.s.a(r15, r8, r3, r6)
            r20 = r7
            long r6 = r3.T
            int r6 = java.lang.Long.hashCode(r6)
            s0.h r7 = r3.l()
            y0.o r14 = y0.a.c(r3, r14)
            x1.f r21 = x1.g.f20914f
            r21.getClass()
            r21 = r9
            x1.y r9 = x1.f.f20883b
            r3.d0()
            boolean r13 = r3.S
            if (r13 == 0) goto Lcb
            r3.k(r9)
            goto Lce
        Lcb:
            r3.n0()
        Lce:
            x1.e r13 = x1.f.f20886e
            r0 = r20
            i0.r.A(r13, r3, r0)
            x1.e r0 = x1.f.f20885d
            i0.r.A(r0, r3, r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            x1.e r7 = x1.f.f20887f
            i0.r.A(r7, r3, r6)
            x1.d r6 = x1.f.f20888g
            i0.r.w(r6, r3)
            r20 = r10
            x1.e r10 = x1.f.f20884c
            i0.r.A(r10, r3, r14)
            r14 = 1065353216(0x3f800000, float:1.0)
            y0.o r28 = p.h1.d(r12, r14)
            java.lang.Object r14 = r3.P()
            if (r14 != r5) goto L108
            b0.j r14 = new b0.j
            r23 = r2
            r2 = 22
            r14.<init>(r4, r2)
            r3.k0(r14)
            goto L10a
        L108:
            r23 = r2
        L10a:
            r32 = r14
            fg.a r32 = (fg.a) r32
            r33 = 15
            r29 = 0
            r30 = 0
            r31 = 0
            y0.o r2 = k.n.j(r28, r29, r30, r31, r32, r33)
            y0.f r14 = y0.b.f21802q
            r24 = r4
            p.c r4 = p.j.f9924a
            r28 = r11
            r11 = 48
            p.e1 r4 = p.d1.a(r4, r14, r3, r11)
            r29 = r12
            long r11 = r3.T
            int r11 = java.lang.Long.hashCode(r11)
            s0.h r12 = r3.l()
            y0.o r2 = y0.a.c(r3, r2)
            r3.d0()
            r31 = r5
            boolean r5 = r3.S
            if (r5 == 0) goto L145
            r3.k(r9)
            goto L148
        L145:
            r3.n0()
        L148:
            i0.r.A(r13, r3, r4)
            i0.r.A(r0, r3, r12)
            j8.b.p(r11, r3, r7, r3, r6)
            i0.r.A(r10, r3, r2)
            p.f1 r2 = p.f1.f9898a
            r12 = r29
            r4 = 1
            y0.o r5 = r2.a(r12, r4)
            r11 = 0
            p.t r8 = p.s.a(r15, r8, r3, r11)
            long r11 = r3.T
            int r11 = java.lang.Long.hashCode(r11)
            s0.h r12 = r3.l()
            y0.o r5 = y0.a.c(r3, r5)
            r3.d0()
            boolean r15 = r3.S
            if (r15 == 0) goto L17b
            r3.k(r9)
            goto L17e
        L17b:
            r3.n0()
        L17e:
            i0.r.A(r13, r3, r8)
            i0.r.A(r0, r3, r12)
            j8.b.p(r11, r3, r7, r3, r6)
            i0.r.A(r10, r3, r5)
            r5 = 8
            float r5 = (float) r5
            p.h r8 = p.j.g(r5)
            r11 = 54
            p.e1 r8 = p.d1.a(r8, r14, r3, r11)
            r34 = r5
            long r4 = r3.T
            int r4 = java.lang.Long.hashCode(r4)
            s0.h r5 = r3.l()
            r12 = r29
            y0.o r15 = y0.a.c(r3, r12)
            r3.d0()
            boolean r11 = r3.S
            if (r11 == 0) goto L1b4
            r3.k(r9)
            goto L1b7
        L1b4:
            r3.n0()
        L1b7:
            i0.r.A(r13, r3, r8)
            i0.r.A(r0, r3, r5)
            j8.b.p(r4, r3, r7, r3, r6)
            i0.r.A(r10, r3, r15)
            i0.m2 r4 = bi.d.f892a
            java.lang.Object r5 = r3.j(r4)
            bi.b r5 = (bi.b) r5
            long r32 = r5.g()
            r5 = 13
            long r35 = x6.d.D(r5)
            m2.k r8 = m2.k.f8698j
            r5 = r23
            r23 = 0
            r11 = r24
            r24 = 262058(0x3ffaa, float:3.67221E-40)
            r3 = 0
            r15 = r9
            r9 = 0
            r38 = r10
            r37 = r11
            r10 = 0
            r39 = r12
            r12 = 0
            r40 = r13
            r41 = r14
            r13 = 0
            r42 = r15
            r15 = 0
            r43 = r16
            r16 = 0
            r44 = 6
            r17 = 0
            r45 = 1
            r18 = 0
            r46 = 0
            r19 = 0
            r47 = r20
            r20 = 0
            r48 = 1065353216(0x3f800000, float:1.0)
            r22 = 1597446(0x186006, float:2.238499E-39)
            r58 = r2
            r49 = r5
            r53 = r6
            r52 = r7
            r29 = r21
            r30 = r28
            r56 = r31
            r6 = r35
            r28 = r37
            r54 = r38
            r57 = r39
            r51 = r40
            r55 = r41
            r50 = r42
            r1 = r44
            r2 = r66
            r21 = r70
            r31 = r0
            r0 = r4
            r4 = r32
            sh.s.n(r2, r3, r4, r6, r8, r9, r10, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r3 = r21
            wb.y2 r2 = wb.y2.f20285j
            r2.b(r3, r1)
            r4 = 1
            r3.p(r4)
            java.lang.String r1 = "，支持 #RRGGBB / #AARRGGBB / #A,#B"
            r4 = r67
            java.lang.String r1 = r4.concat(r1)
            java.lang.Object r5 = r3.j(r0)
            bi.b r5 = (bi.b) r5
            long r5 = r5.h()
            r7 = 12
            r4 = r5
            r8 = r7
            long r6 = x6.d.D(r8)
            r24 = 262122(0x3ffea, float:3.67311E-40)
            r3 = 0
            r9 = r8
            r8 = 0
            r10 = r9
            r9 = 0
            r12 = r10
            r10 = 0
            r13 = r12
            r12 = 0
            r15 = r13
            r13 = 0
            r16 = r15
            r15 = 0
            r17 = r16
            r16 = 0
            r18 = r17
            r17 = 0
            r19 = r18
            r18 = 0
            r20 = r19
            r19 = 0
            r21 = r20
            r20 = 0
            r22 = 24576(0x6000, float:3.4438E-41)
            r21 = r2
            r2 = r1
            r1 = r21
            r21 = r70
            sh.s.n(r2, r3, r4, r6, r8, r9, r10, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r3 = r21
            r4 = 1
            r3.p(r4)
            r2 = r29
            java.lang.String r2 = (java.lang.String) r2
            r5 = 48
            r1.e(r2, r3, r5)
            r3.p(r4)
            i2.n0 r6 = new i2.n0
            java.lang.Object r5 = r3.j(r0)
            bi.b r5 = (bi.b) r5
            long r7 = r5.g()
            long r9 = x6.d.D(r25)
            r15 = 0
            r17 = 16777212(0xfffffc, float:2.3509881E-38)
            r11 = 0
            r12 = 0
            r14 = 0
            r6.<init>(r7, r9, r11, r12, r14, r15, r17)
            f1.t0 r12 = new f1.t0
            java.lang.Object r5 = r3.j(r0)
            bi.b r5 = (bi.b) r5
            long r7 = r5.j()
            r12.<init>(r7)
            r5 = r57
            r14 = 1065353216(0x3f800000, float:1.0)
            y0.o r32 = p.h1.d(r5, r14)
            r36 = 0
            r37 = 13
            r33 = 0
            r35 = 0
            y0.o r7 = p.d.p(r32, r33, r34, r35, r36, r37)
            v.d r8 = v.e.a(r43)
            y0.o r7 = c1.h.b(r7, r8)
            java.lang.Object r8 = r3.j(r0)
            bi.b r8 = (bi.b) r8
            long r8 = r8.k()
            f1.m0 r10 = f1.c0.f3038b
            y0.o r7 = k.n.g(r7, r8, r10)
            r8 = 12
            float r9 = (float) r8
            r10 = r43
            y0.o r7 = p.d.m(r7, r9, r10)
            java.lang.Object r11 = r3.P()
            r13 = r56
            if (r11 != r13) goto L316
            i.x0 r11 = new i.x0
            r15 = 3
            r4 = r69
            r11.<init>(r4, r15)
            r3.k0(r11)
            goto L318
        L316:
            r4 = r69
        L318:
            fg.l r11 = (fg.l) r11
            r15 = 100663296(0x6000000, float:2.4074124E-35)
            r15 = r26 | r15
            r16 = 0
            r17 = 48856(0xbed8, float:6.8462E-41)
            r3 = 0
            r29 = r5
            r5 = 0
            r4 = r6
            r6 = 0
            r19 = r2
            r2 = r7
            r7 = 1
            r38 = r8
            r8 = 0
            r20 = r9
            r9 = 0
            r43 = r10
            r10 = 0
            r21 = r1
            r1 = r11
            r11 = 0
            r56 = r13
            r13 = 0
            r14 = r70
            r60 = r0
            r22 = r21
            r62 = r29
            r59 = r31
            r61 = r56
            r0 = r68
            r21 = r19
            w.i.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r3 = r14
            r8 = 1
            r3.p(r8)
            java.lang.Object r0 = r28.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L49e
            r0 = -792756572(0xffffffffd0bf7ea4, float:-2.5701982E10)
            r3.a0(r0)
            r12 = r62
            r14 = 1065353216(0x3f800000, float:1.0)
            y0.o r15 = p.h1.d(r12, r14)
            r19 = 0
            r17 = r20
            r20 = 13
            r16 = 0
            r18 = 0
            y0.o r0 = p.d.p(r15, r16, r17, r18, r19, r20)
            p.h r1 = p.j.g(r34)
            r2 = r55
            r4 = 54
            p.e1 r1 = p.d1.a(r1, r2, r3, r4)
            long r4 = r3.T
            int r2 = java.lang.Long.hashCode(r4)
            s0.h r4 = r3.l()
            y0.o r0 = y0.a.c(r3, r0)
            r3.d0()
            boolean r5 = r3.S
            if (r5 == 0) goto L3a6
            r15 = r50
            r3.k(r15)
        L3a3:
            r5 = r51
            goto L3aa
        L3a6:
            r3.n0()
            goto L3a3
        L3aa:
            i0.r.A(r5, r3, r1)
            r1 = r59
            i0.r.A(r1, r3, r4)
            r1 = r52
            r4 = r53
            j8.b.p(r2, r3, r1, r3, r4)
            r1 = r54
            i0.r.A(r1, r3, r0)
            java.lang.Object r0 = r30.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r7 = r0 ^ 1
            java.lang.Object r0 = r3.P()
            r13 = r61
            if (r0 != r13) goto L3df
            b0.j r0 = new b0.j
            r1 = 23
            r11 = r30
            r0.<init>(r11, r1)
            r3.k0(r0)
            goto L3e1
        L3df:
            r11 = r30
        L3e1:
            r2 = r0
            fg.a r2 = (fg.a) r2
            r9 = r58
            y0.o r6 = r9.a(r12, r8)
            r1 = 199686(0x30c06, float:2.7982E-40)
            java.lang.String r4 = "起始色"
            r5 = r21
            r0 = r22
            r0.d(r1, r2, r3, r4, r5, r6, r7)
            r5 = r47
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r1 = r11.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r7 = r1.booleanValue()
            java.lang.Object r1 = r3.P()
            if (r1 != r13) goto L414
            b0.j r1 = new b0.j
            r2 = 21
            r1.<init>(r11, r2)
            r3.k0(r1)
        L414:
            r2 = r1
            fg.a r2 = (fg.a) r2
            y0.o r6 = r9.a(r12, r8)
            r1 = 199686(0x30c06, float:2.7982E-40)
            java.lang.String r4 = "结束色"
            r0.d(r1, r2, r3, r4, r5, r6, r7)
            r3.p(r8)
            r5 = r49
            boolean r0 = r3.f(r5)
            java.lang.Object r1 = r3.P()
            if (r0 != 0) goto L438
            if (r1 != r13) goto L435
            goto L438
        L435:
            r6 = r69
            goto L443
        L438:
            w.g r1 = new w.g
            r0 = 1
            r6 = r69
            r1.<init>(r6, r5, r11, r0)
            r3.k0(r1)
        L443:
            r2 = r1
            fg.l r2 = (fg.l) r2
            r16 = 0
            r17 = 13
            r13 = 0
            r15 = 0
            r14 = r43
            y0.o r0 = p.d.p(r12, r13, r14, r15, r16, r17)
            r5 = 3456(0xd80, float:4.843E-42)
            r4 = r3
            r1 = r27
            r3 = r0
            r0 = r65
            r0.M(r1, r2, r3, r4, r5)
            r3 = r4
            r0 = r60
            java.lang.Object r0 = r3.j(r0)
            bi.b r0 = (bi.b) r0
            long r0 = r0.h()
            long r4 = x6.d.D(r38)
            r14 = r34
            y0.o r2 = p.d.p(r12, r13, r14, r15, r16, r17)
            r21 = 0
            r22 = 262120(0x3ffe8, float:3.67308E-40)
            r63 = r0
            r1 = r2
            r2 = r63
            java.lang.String r0 = "先选起始色或结束色，再用色盘取色；清空输入框可恢复默认"
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 24630(0x6036, float:3.4514E-41)
            r19 = r70
            sh.s.n(r0, r1, r2, r4, r6, r7, r8, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r3 = r19
            r11 = 0
            r3.p(r11)
            goto L4ac
        L49e:
            r11 = 0
            r0 = -791225699(0xffffffffd0d6da9d, float:-2.883721E10)
            r3.a0(r0)
            r3.p(r11)
            goto L4ac
        L4a9:
            r3.V()
        L4ac:
            i0.r1 r8 = r3.t()
            if (r8 == 0) goto L4c6
            b0.z r0 = new b0.z
            r7 = 3
            r1 = r65
            r2 = r66
            r3 = r67
            r4 = r68
            r5 = r69
            r6 = r71
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.f6035d = r0
        L4c6:
            return
    }

    public void l0(int r27, fg.a r28, fg.l r29, i0.h0 r30, java.lang.String r31, java.util.List r32) {
            r26 = this;
            r6 = r27
            r4 = r29
            r0 = r30
            r2 = r32
            r1 = 1442312026(0x55f7ef5a, float:3.4075922E13)
            r0.b0(r1)
            r1 = r6 & 6
            if (r1 != 0) goto L26
            r1 = r6 & 8
            if (r1 != 0) goto L1b
            boolean r1 = r0.f(r2)
            goto L1f
        L1b:
            boolean r1 = r0.h(r2)
        L1f:
            if (r1 == 0) goto L23
            r1 = 4
            goto L24
        L23:
            r1 = 2
        L24:
            r1 = r1 | r6
            goto L27
        L26:
            r1 = r6
        L27:
            r3 = r6 & 48
            if (r3 != 0) goto L37
            boolean r3 = r30.f(r31)
            if (r3 == 0) goto L34
            r3 = 32
            goto L36
        L34:
            r3 = 16
        L36:
            r1 = r1 | r3
        L37:
            r3 = r6 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L47
            boolean r3 = r0.h(r4)
            if (r3 == 0) goto L44
            r3 = 256(0x100, float:3.59E-43)
            goto L46
        L44:
            r3 = 128(0x80, float:1.8E-43)
        L46:
            r1 = r1 | r3
        L47:
            r3 = r6 & 3072(0xc00, float:4.305E-42)
            r5 = r28
            if (r3 != 0) goto L59
            boolean r3 = r0.h(r5)
            if (r3 == 0) goto L56
            r3 = 2048(0x800, float:2.87E-42)
            goto L58
        L56:
            r3 = 1024(0x400, float:1.435E-42)
        L58:
            r1 = r1 | r3
        L59:
            r3 = r1 & 1171(0x493, float:1.641E-42)
            r7 = 1170(0x492, float:1.64E-42)
            if (r3 == r7) goto L61
            r3 = 1
            goto L62
        L61:
            r3 = 0
        L62:
            r7 = r1 & 1
            boolean r3 = r0.S(r7, r3)
            if (r3 == 0) goto L9b
            wb.ui r3 = new wb.ui
            r7 = r31
            r3.<init>(r2, r4, r7)
            r8 = 549491417(0x20c092d9, float:3.262324E-19)
            s0.d r22 = s0.i.e(r8, r3, r0)
            int r1 = r1 << 15
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r1 = r1 & r3
            r1 = r1 | 390(0x186, float:5.47E-43)
            r25 = 3072(0xc00, float:4.305E-42)
            r7 = 0
            java.lang.String r8 = "切换模型配置"
            r9 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r17 = 0
            r19 = 0
            r21 = 0
            r23 = r0
            r24 = r1
            r16 = r5
            oh.h.d(r7, r8, r9, r11, r13, r15, r16, r17, r19, r21, r22, r23, r24, r25)
            goto L9e
        L9b:
            r30.V()
        L9e:
            i0.r1 r7 = r30.t()
            if (r7 == 0) goto Lb1
            c9.c0 r0 = new c9.c0
            r1 = r26
            r5 = r28
            r3 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f6035d = r0
        Lb1:
            return
    }

    public void m(java.lang.String r33, fg.l r34, i0.h0 r35, int r36) {
            r32 = this;
            r0 = r33
            r14 = r35
            r1 = -622359828(0xffffffffdae78aec, float:-3.2586733E16)
            r14.b0(r1)
            boolean r1 = r14.f(r0)
            if (r1 == 0) goto L13
            r1 = 32
            goto L15
        L13:
            r1 = 16
        L15:
            r1 = r36 | r1
            r2 = r1 & 1171(0x493, float:1.641E-42)
            r3 = 1170(0x492, float:1.64E-42)
            r4 = 0
            r5 = 1
            if (r2 == r3) goto L21
            r2 = r5
            goto L22
        L21:
            r2 = r4
        L22:
            r3 = r1 & 1
            boolean r2 = r14.S(r3, r2)
            if (r2 == 0) goto L19b
            y0.l r6 = y0.l.f21818a
            r2 = 1065353216(0x3f800000, float:1.0)
            y0.o r7 = p.h1.d(r6, r2)
            r3 = 10
            float r9 = (float) r3
            r11 = 0
            r12 = 13
            r8 = 0
            r10 = 0
            y0.o r3 = p.d.p(r7, r8, r9, r10, r11, r12)
            r12 = r9
            p.e r7 = p.j.f9926c
            y0.e r8 = y0.b.f21804s
            p.t r4 = p.s.a(r7, r8, r14, r4)
            long r7 = r14.T
            int r7 = java.lang.Long.hashCode(r7)
            s0.h r8 = r14.l()
            y0.o r3 = y0.a.c(r14, r3)
            x1.f r9 = x1.g.f20914f
            r9.getClass()
            x1.y r9 = x1.f.f20883b
            r14.d0()
            boolean r10 = r14.S
            if (r10 == 0) goto L67
            r14.k(r9)
            goto L6a
        L67:
            r14.n0()
        L6a:
            x1.e r9 = x1.f.f20886e
            i0.r.A(r9, r14, r4)
            x1.e r4 = x1.f.f20885d
            i0.r.A(r4, r14, r8)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            x1.e r7 = x1.f.f20887f
            i0.r.A(r7, r14, r4)
            x1.d r4 = x1.f.f20888g
            i0.r.w(r4, r14)
            x1.e r4 = x1.f.f20884c
            i0.r.A(r4, r14, r3)
            i0.m2 r3 = bi.d.f892a
            java.lang.Object r4 = r14.j(r3)
            bi.b r4 = (bi.b) r4
            long r15 = r4.g()
            r4 = 13
            long r17 = x6.d.D(r4)
            r4 = 6
            float r10 = (float) r4
            r11 = 7
            r7 = 0
            r8 = 0
            r9 = 0
            y0.o r4 = p.d.p(r6, r7, r8, r9, r10, r11)
            r22 = 0
            r23 = 262120(0x3ffe8, float:3.67308E-40)
            r7 = r1
            java.lang.String r1 = "头衔名称"
            r8 = r7
            r7 = 0
            r9 = r8
            r8 = 0
            r11 = r9
            r9 = 0
            r13 = r11
            r11 = 0
            r20 = r12
            r19 = r13
            r12 = 0
            r14 = 0
            r21 = r2
            r2 = r4
            r30 = r15
            r16 = r3
            r3 = r30
            r15 = 0
            r24 = r16
            r16 = 0
            r25 = r6
            r30 = r17
            r18 = r5
            r5 = r30
            r17 = 0
            r26 = r18
            r18 = 0
            r27 = r19
            r19 = 0
            r28 = r21
            r21 = 24630(0x6036, float:3.4514E-41)
            r0 = r24
            r29 = r25
            r24 = r20
            r20 = r35
            sh.s.n(r1, r2, r3, r5, r7, r8, r9, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r14 = r20
            i2.n0 r1 = new i2.n0
            java.lang.Object r2 = r14.j(r0)
            bi.b r2 = (bi.b) r2
            long r2 = r2.g()
            r13 = 14
            long r4 = x6.d.D(r13)
            r10 = 0
            r12 = 16777212(0xfffffc, float:2.3509881E-38)
            r6 = 0
            r7 = 0
            r9 = 0
            r1.<init>(r2, r4, r6, r7, r9, r10, r12)
            f1.t0 r12 = new f1.t0
            java.lang.Object r2 = r14.j(r0)
            bi.b r2 = (bi.b) r2
            long r2 = r2.j()
            r12.<init>(r2)
            r6 = r29
            r2 = 1065353216(0x3f800000, float:1.0)
            y0.o r2 = p.h1.d(r6, r2)
            r3 = 8
            float r3 = (float) r3
            v.d r4 = v.e.a(r3)
            y0.o r2 = c1.h.b(r2, r4)
            java.lang.Object r4 = r14.j(r0)
            bi.b r4 = (bi.b) r4
            long r4 = r4.k()
            f1.m0 r6 = f1.c0.f3038b
            y0.o r2 = k.n.g(r2, r4, r6)
            r4 = 1
            float r5 = (float) r4
            java.lang.Object r0 = r14.j(r0)
            bi.b r0 = (bi.b) r0
            long r6 = r0.j()
            r0 = 1055286886(0x3ee66666, float:0.45)
            long r6 = f1.w.b(r6, r0)
            v.d r0 = v.e.a(r3)
            f1.t0 r3 = new f1.t0
            r3.<init>(r6)
            k.t r6 = new k.t
            r6.<init>(r5, r3, r0)
            y0.o r0 = r2.d(r6)
            r2 = 12
            float r2 = (float) r2
            r9 = r24
            y0.o r2 = p.d.m(r0, r2, r9)
            sh.d r0 = new sh.d
            r3 = 1
            r5 = r33
            r0.<init>(r5, r3)
            r3 = -1624507751(0xffffffff9f2bfa99, float:-3.6417948E-20)
            s0.d r0 = s0.i.e(r3, r0, r14)
            int r3 = r27 >> 3
            r3 = r3 & r13
            r6 = 100663344(0x6000030, float:2.4074262E-35)
            r15 = r3 | r6
            r16 = 196608(0x30000, float:2.75506E-40)
            r17 = 16088(0x3ed8, float:2.2544E-41)
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = r0
            r4 = r1
            r0 = r33
            r1 = r34
            w.i.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r4 = 1
            r14.p(r4)
            goto L19e
        L19b:
            r14.V()
        L19e:
            i0.r1 r6 = r14.t()
            if (r6 == 0) goto L1b5
            b0.k r0 = new b0.k
            r5 = 9
            r1 = r32
            r2 = r33
            r3 = r34
            r4 = r36
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f6035d = r0
        L1b5:
            return
    }

    public void m0(fb.a1 r33, int r34, y0.o r35, fg.a r36, i0.h0 r37, int r38, int r39) {
            r32 = this;
            r2 = r33
            r4 = r35
            r9 = r37
            r0 = r38
            r1 = 1996025435(0x76f8ee5b, float:2.524461E33)
            r9.b0(r1)
            r1 = r0 & 6
            r3 = 4
            if (r1 != 0) goto L27
            r1 = r0 & 8
            if (r1 != 0) goto L1c
            boolean r1 = r9.f(r2)
            goto L20
        L1c:
            boolean r1 = r9.h(r2)
        L20:
            if (r1 == 0) goto L24
            r1 = r3
            goto L25
        L24:
            r1 = 2
        L25:
            r1 = r1 | r0
            goto L28
        L27:
            r1 = r0
        L28:
            r5 = r0 & 48
            if (r5 != 0) goto L3b
            r5 = r34
            boolean r6 = r9.d(r5)
            if (r6 == 0) goto L37
            r6 = 32
            goto L39
        L37:
            r6 = 16
        L39:
            r1 = r1 | r6
            goto L3d
        L3b:
            r5 = r34
        L3d:
            r6 = r0 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L4d
            boolean r6 = r9.f(r4)
            if (r6 == 0) goto L4a
            r6 = 256(0x100, float:3.59E-43)
            goto L4c
        L4a:
            r6 = 128(0x80, float:1.8E-43)
        L4c:
            r1 = r1 | r6
        L4d:
            r6 = r39 & 8
            if (r6 == 0) goto L56
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L53:
            r7 = r36
            goto L68
        L56:
            r7 = r0 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L53
            r7 = r36
            boolean r8 = r9.h(r7)
            if (r8 == 0) goto L65
            r8 = 2048(0x800, float:2.87E-42)
            goto L67
        L65:
            r8 = 1024(0x400, float:1.435E-42)
        L67:
            r1 = r1 | r8
        L68:
            r8 = r1 & 1171(0x493, float:1.641E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r8 == r10) goto L70
            r8 = 1
            goto L71
        L70:
            r8 = 0
        L71:
            r10 = r1 & 1
            boolean r8 = r9.S(r10, r8)
            if (r8 == 0) goto L245
            if (r6 == 0) goto L7f
            r6 = 0
            r28 = r6
            goto L81
        L7f:
            r28 = r7
        L81:
            r6 = 1065353216(0x3f800000, float:1.0)
            y0.o r7 = p.h1.d(r4, r6)
            float r3 = (float) r3
            v.d r8 = v.e.a(r3)
            y0.o r7 = c1.h.b(r7, r8)
            i0.m2 r8 = bi.d.f892a
            java.lang.Object r10 = r9.j(r8)
            bi.b r10 = (bi.b) r10
            long r13 = r10.g()
            r10 = 1028443341(0x3d4ccccd, float:0.05)
            long r13 = f1.w.b(r13, r10)
            f1.m0 r10 = f1.c0.f3038b
            y0.o r7 = k.n.g(r7, r13, r10)
            r10 = 8
            float r10 = (float) r10
            r13 = 6
            float r13 = (float) r13
            if (r28 != 0) goto Lb2
            r14 = r10
            goto Lb3
        Lb2:
            r14 = r3
        Lb3:
            y0.o r7 = p.d.o(r7, r10, r13, r14, r13)
            y0.f r10 = y0.b.f21802q
            p.c r14 = p.j.f9924a
            r15 = 48
            p.e1 r10 = p.d1.a(r14, r10, r9, r15)
            long r14 = r9.T
            int r14 = java.lang.Long.hashCode(r14)
            s0.h r15 = r9.l()
            y0.o r7 = y0.a.c(r9, r7)
            x1.f r16 = x1.g.f20914f
            r16.getClass()
            x1.y r11 = x1.f.f20883b
            r9.d0()
            boolean r12 = r9.S
            if (r12 == 0) goto Le1
            r9.k(r11)
            goto Le4
        Le1:
            r9.n0()
        Le4:
            x1.e r12 = x1.f.f20886e
            i0.r.A(r12, r9, r10)
            x1.e r10 = x1.f.f20885d
            i0.r.A(r10, r9, r15)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            x1.e r15 = x1.f.f20887f
            i0.r.A(r15, r9, r14)
            x1.d r14 = x1.f.f20888g
            i0.r.w(r14, r9)
            x1.e r0 = x1.f.f20884c
            i0.r.A(r0, r9, r7)
            r36 = r3
            double r3 = (double) r6
            r18 = 0
            int r3 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r3 <= 0) goto L10c
            r3 = 1
            goto L10d
        L10c:
            r3 = 0
        L10d:
            if (r3 != 0) goto L114
            java.lang.String r3 = "invalid weight; must be greater than zero"
            q.a.a(r3)
        L114:
            p.q0 r3 = new p.q0
            r4 = 1
            r3.<init>(r6, r4)
            p.e r6 = p.j.f9926c
            y0.e r7 = y0.b.f21804s
            r4 = 0
            p.t r6 = p.s.a(r6, r7, r9, r4)
            long r4 = r9.T
            int r4 = java.lang.Long.hashCode(r4)
            s0.h r5 = r9.l()
            y0.o r3 = y0.a.c(r9, r3)
            r9.d0()
            boolean r7 = r9.S
            if (r7 == 0) goto L13c
            r9.k(r11)
            goto L13f
        L13c:
            r9.n0()
        L13f:
            i0.r.A(r12, r9, r6)
            i0.r.A(r10, r9, r5)
            j8.b.p(r4, r9, r15, r9, r14)
            i0.r.A(r0, r9, r3)
            java.lang.String r0 = r2.f3394a
            java.lang.String r3 = "assistant"
            boolean r0 = gg.l.a(r0, r3)
            if (r0 == 0) goto L159
            java.lang.String r0 = "引用 Agent"
        L157:
            r5 = r0
            goto L15c
        L159:
            java.lang.String r0 = "引用用户"
            goto L157
        L15c:
            java.lang.Object r0 = r9.j(r8)
            bi.b r0 = (bi.b) r0
            long r3 = r0.j()
            r0 = 11
            long r9 = x6.d.D(r0)
            m2.k r11 = m2.k.f8698j
            r26 = 0
            r27 = 262058(0x3ffaa, float:3.67221E-40)
            r6 = 0
            r12 = 0
            r15 = r13
            r13 = 0
            r7 = r15
            r15 = 0
            r18 = 0
            r19 = 1
            r16 = 0
            r20 = r18
            r18 = 0
            r21 = r19
            r19 = 0
            r22 = r20
            r20 = 0
            r23 = r21
            r21 = 0
            r24 = r22
            r22 = 0
            r25 = r23
            r23 = 0
            r29 = r25
            r25 = 1597440(0x186000, float:2.23849E-39)
            r24 = r29
            r29 = r0
            r0 = r24
            r24 = r37
            r30 = r3
            r4 = r7
            r3 = r8
            r7 = r30
            sh.s.n(r5, r6, r7, r9, r11, r12, r13, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r9 = r24
            java.lang.String r5 = r2.f3395b
            java.lang.Object r6 = r9.j(r3)
            bi.b r6 = (bi.b) r6
            long r7 = r6.h()
            long r10 = x6.d.D(r29)
            int r1 = r1 << 9
            r6 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r6
            r1 = r1 | 384(0x180, float:5.38E-43)
            r27 = 241642(0x3afea, float:3.38613E-40)
            r6 = 0
            r9 = r10
            r11 = 0
            r18 = 2
            r25 = 24576(0x6000, float:3.4438E-41)
            r20 = r34
            r26 = r1
            sh.s.n(r5, r6, r7, r9, r11, r12, r13, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r9 = r24
            r9.p(r0)
            if (r28 == 0) goto L233
            r1 = -501395867(0xffffffffe21d4e65, float:-7.2544694E20)
            r9.a0(r1)
            m1.f r5 = wb.ap.f15064e
            java.lang.Object r1 = r9.j(r3)
            bi.b r1 = (bi.b) r1
            long r6 = r1.h()
            f1.n r8 = new f1.n
            r1 = 5
            r8.<init>(r6, r1)
            r18 = 0
            r19 = 14
            y0.l r14 = y0.l.f21818a
            r16 = 0
            r17 = 0
            r15 = r4
            y0.o r3 = p.d.p(r14, r15, r16, r17, r18, r19)
            r4 = 24
            float r4 = (float) r4
            y0.o r3 = p.h1.j(r3, r4)
            v.d r4 = v.e.a(r36)
            y0.o r13 = c1.h.b(r3, r4)
            r16 = 0
            r18 = 15
            r14 = 0
            r15 = 0
            r17 = r28
            y0.o r3 = k.n.j(r13, r14, r15, r16, r17, r18)
            float r1 = (float) r1
            y0.o r7 = p.d.l(r3, r1)
            java.lang.String r6 = "取消引用"
            r10 = 54
            k.n.c(r5, r6, r7, r8, r9, r10)
            r4 = 0
            r9.p(r4)
            goto L23f
        L233:
            r17 = r28
            r4 = 0
            r1 = -500988093(0xffffffffe2238743, float:-7.541415E20)
            r9.a0(r1)
            r9.p(r4)
        L23f:
            r9.p(r0)
            r5 = r17
            goto L249
        L245:
            r9.V()
            r5 = r7
        L249:
            i0.r1 r8 = r9.t()
            if (r8 == 0) goto L260
            wb.im r0 = new wb.im
            r1 = r32
            r3 = r34
            r4 = r35
            r6 = r38
            r7 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.f6035d = r0
        L260:
            return
    }

    public void n(android.app.Activity r8, s0.d r9, i0.h0 r10, int r11) {
            r7 = this;
            r0 = 981419261(0x3a7f44fd, float:9.737758E-4)
            r10.b0(r0)
            boolean r0 = r10.h(r8)
            if (r0 == 0) goto Le
            r0 = 4
            goto Lf
        Le:
            r0 = 2
        Lf:
            r0 = r0 | r11
            r1 = r0 & 19
            r2 = 18
            r3 = 1
            if (r1 == r2) goto L19
            r1 = r3
            goto L1a
        L19:
            r1 = 0
        L1a:
            r0 = r0 & r3
            boolean r0 = r10.S(r0, r1)
            if (r0 == 0) goto L44
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r1 = 32
            if (r0 != r1) goto L36
            bi.b r0 = bi.d.a()
            goto L3a
        L36:
            bi.b r0 = bi.d.b()
        L3a:
            r2 = 0
            r5 = 3072(0xc00, float:4.305E-42)
            r1 = 0
            r3 = r9
            r4 = r10
            ig.a.b(r0, r1, r2, r3, r4, r5)
            goto L47
        L44:
            r10.V()
        L47:
            i0.r1 r0 = r10.t()
            if (r0 == 0) goto L59
            b0.k r1 = new b0.k
            r6 = 7
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r0.f6035d = r1
        L59:
            return
    }

    public void n0(fb.c r32, i0.h0 r33, int r34) {
            r31 = this;
            r0 = r31
            r1 = r32
            r5 = r33
            r8 = r34
            r2 = -1400878845(0xffffffffac804903, float:-3.6460847E-12)
            r5.b0(r2)
            boolean r2 = r5.f(r1)
            r9 = 2
            if (r2 == 0) goto L17
            r2 = 4
            goto L18
        L17:
            r2 = r9
        L18:
            r2 = r2 | r8
            r3 = r2 & 3
            r10 = 0
            r11 = 1
            if (r3 == r9) goto L21
            r3 = r11
            goto L22
        L21:
            r3 = r10
        L22:
            r2 = r2 & r11
            boolean r2 = r5.S(r2, r3)
            if (r2 == 0) goto L27f
            i0.m2 r2 = y1.i0.f21966b
            java.lang.Object r2 = r5.j(r2)
            r12 = r2
            android.content.Context r12 = (android.content.Context) r12
            java.lang.String r13 = r1.f3438h
            int r2 = r13.length()
            if (r2 != 0) goto L4c
            i0.r1 r2 = r5.t()
            if (r2 == 0) goto L49
            wb.hs r3 = new wb.hs
            r4 = 0
            r3.<init>(r0, r1, r8, r4)
            r2.f6035d = r3
            return
        L49:
            r3 = r0
            goto L299
        L4c:
            long r2 = r1.f3443m
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "reasoning"
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.Object r3 = r5.P()
            i0.e r14 = i0.l.f5952a
            if (r3 != r14) goto L69
            wb.pp r3 = new wb.pp
            r4 = 1
            r3.<init>(r4)
            r5.k0(r3)
        L69:
            fg.a r3 = (fg.a) r3
            r15 = 48
            java.lang.Object r2 = v0.k.c(r2, r3, r5, r15)
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r3 = r2.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = 0
            if (r3 == 0) goto L83
            r3 = 1119092736(0x42b40000, float:90.0)
            goto L84
        L83:
            r3 = r4
        L84:
            r6 = 220(0xdc, float:3.08E-43)
            r7 = 6
            r9 = 0
            i.l1 r6 = i.d.p(r6, r7, r9)
            r17 = r2
            r2 = r3
            r3 = r6
            r6 = 3120(0xc30, float:4.372E-42)
            r18 = r7
            r7 = 20
            r19 = r4
            java.lang.String r4 = "agentReasoningArrow"
            r9 = r18
            r18 = r12
            r12 = r9
            r9 = r17
            r15 = r19
            i0.l2 r2 = i.f.a(r2, r3, r4, r5, r6, r7)
            y0.l r3 = y0.l.f21818a
            r4 = 1065353216(0x3f800000, float:1.0)
            y0.o r21 = p.h1.d(r3, r4)
            r6 = 5
            float r7 = (float) r6
            r25 = 0
            r26 = 13
            r22 = 0
            r24 = 0
            r23 = r7
            y0.o r7 = p.d.p(r21, r22, r23, r24, r25, r26)
            y0.o r7 = h.d0.a(r7)
            p.e r6 = p.j.f9926c
            y0.e r11 = y0.b.f21804s
            p.t r6 = p.s.a(r6, r11, r5, r10)
            long r10 = r5.T
            int r10 = java.lang.Long.hashCode(r10)
            s0.h r11 = r5.l()
            y0.o r7 = y0.a.c(r5, r7)
            x1.f r21 = x1.g.f20914f
            r21.getClass()
            x1.y r15 = x1.f.f20883b
            r5.d0()
            boolean r12 = r5.S
            if (r12 == 0) goto Leb
            r5.k(r15)
            goto Lee
        Leb:
            r5.n0()
        Lee:
            x1.e r12 = x1.f.f20886e
            i0.r.A(r12, r5, r6)
            x1.e r6 = x1.f.f20885d
            i0.r.A(r6, r5, r11)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            x1.e r11 = x1.f.f20887f
            i0.r.A(r11, r5, r10)
            x1.d r10 = x1.f.f20888g
            i0.r.w(r10, r5)
            x1.e r8 = x1.f.f20884c
            i0.r.A(r8, r5, r7)
            y0.o r4 = p.h1.d(r3, r4)
            r28 = r13
            r7 = 6
            float r13 = (float) r7
            v.d r7 = v.e.a(r13)
            y0.o r4 = c1.h.b(r4, r7)
            boolean r7 = r5.f(r9)
            r23 = r7
            java.lang.Object r7 = r5.P()
            if (r23 != 0) goto L129
            if (r7 != r14) goto L133
        L129:
            wb.jp r7 = new wb.jp
            r0 = 10
            r7.<init>(r9, r0)
            r5.k0(r7)
        L133:
            fg.a r7 = (fg.a) r7
            y0.o r0 = wb.ho.O6(r4, r7)
            r4 = 0
            r7 = 1
            y0.o r0 = p.d.n(r0, r4, r13, r7)
            y0.f r4 = y0.b.f21802q
            p.c r13 = p.j.f9924a
            r7 = 48
            p.e1 r4 = p.d1.a(r13, r4, r5, r7)
            r7 = r14
            long r13 = r5.T
            int r13 = java.lang.Long.hashCode(r13)
            s0.h r14 = r5.l()
            y0.o r0 = y0.a.c(r5, r0)
            r5.d0()
            r17 = r7
            boolean r7 = r5.S
            if (r7 == 0) goto L165
            r5.k(r15)
            goto L168
        L165:
            r5.n0()
        L168:
            i0.r.A(r12, r5, r4)
            i0.r.A(r6, r5, r14)
            j8.b.p(r13, r5, r11, r5, r10)
            i0.r.A(r8, r5, r0)
            m1.f r0 = wb.ap.f15081v
            java.lang.Object r4 = r9.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L185
            java.lang.String r4 = "收起思考过程"
            goto L187
        L185:
            java.lang.String r4 = "展开思考过程"
        L187:
            i0.m2 r8 = bi.d.f892a
            java.lang.Object r6 = r5.j(r8)
            bi.b r6 = (bi.b) r6
            long r6 = r6.h()
            f1.n r10 = new f1.n
            r11 = 5
            r10.<init>(r6, r11)
            r6 = 18
            float r6 = (float) r6
            y0.o r6 = p.h1.j(r3, r6)
            boolean r7 = r5.f(r2)
            java.lang.Object r11 = r5.P()
            if (r7 != 0) goto L1ae
            r7 = r17
            if (r11 != r7) goto L1b8
        L1ae:
            sh.y0 r11 = new sh.y0
            r7 = 11
            r11.<init>(r2, r7)
            r5.k0(r11)
        L1b8:
            fg.l r11 = (fg.l) r11
            y0.o r2 = f1.c0.m(r6, r11)
            r7 = 6
            r21 = r3
            r3 = r4
            r6 = r5
            r5 = r10
            r12 = 6
            r27 = 1
            r4 = r2
            r2 = r0
            k.n.c(r2, r3, r4, r5, r6, r7)
            r5 = r6
            java.lang.String r0 = r1.f3444n
            java.lang.String r2 = "streaming"
            boolean r0 = gg.l.a(r0, r2)
            if (r0 == 0) goto L1db
            java.lang.String r0 = "思考中"
        L1d9:
            r2 = r0
            goto L1de
        L1db:
            java.lang.String r0 = "思考过程"
            goto L1d9
        L1de:
            java.lang.Object r0 = r5.j(r8)
            bi.b r0 = (bi.b) r0
            long r3 = r0.h()
            r0 = 13
            long r6 = x6.d.D(r0)
            m2.k r8 = m2.k.f8698j
            r0 = 7
            float r0 = (float) r0
            r25 = 0
            r26 = 14
            r23 = 0
            r24 = 0
            r22 = r0
            y0.o r0 = p.d.p(r21, r22, r23, r24, r25, r26)
            r23 = 0
            r24 = 262056(0x3ffa8, float:3.67219E-40)
            r17 = r9
            r9 = 0
            r10 = 0
            r22 = r12
            r12 = 0
            r13 = 0
            r15 = 0
            r19 = 2
            r16 = 0
            r21 = r17
            r17 = 0
            r25 = r18
            r18 = 0
            r26 = r19
            r19 = 0
            r29 = 0
            r20 = 0
            r30 = r22
            r22 = 1597488(0x186030, float:2.238557E-39)
            r26 = r25
            r1 = r29
            r25 = r21
            r21 = r5
            r4 = r3
            r3 = r0
            r0 = r27
            sh.s.n(r2, r3, r4, r6, r8, r9, r10, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r5 = r21
            r5.p(r0)
            java.lang.Object r2 = r25.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r3 = 160(0xa0, float:2.24E-43)
            r12 = 6
            i.l1 r3 = i.d.p(r3, r12, r1)
            r4 = 2
            h.r0 r3 = h.m0.a(r3, r4)
            r6 = 120(0x78, float:1.68E-43)
            i.l1 r1 = i.d.p(r6, r12, r1)
            h.s0 r1 = h.m0.b(r1, r4)
            db.f r4 = new db.f
            r6 = 19
            r7 = r26
            r8 = r28
            r4.<init>(r7, r6, r8)
            r6 = -1853557899(0xffffffff9184f375, float:-2.097597E-28)
            s0.d r7 = s0.i.e(r6, r4, r5)
            r9 = 1600518(0x186c06, float:2.242803E-39)
            r4 = r3
            r3 = 0
            r6 = 0
            r8 = r5
            r5 = r1
            h.a0.b(r2, r3, r4, r5, r6, r7, r8, r9)
            r5 = r8
            r5.p(r0)
            goto L282
        L27f:
            r5.V()
        L282:
            i0.r1 r0 = r5.t()
            if (r0 == 0) goto L297
            wb.hs r1 = new wb.hs
            r2 = 1
            r3 = r31
            r4 = r32
            r8 = r34
            r1.<init>(r3, r4, r8, r2)
            r0.f6035d = r1
            return
        L297:
            r3 = r31
        L299:
            return
    }

    public void o(android.content.Context r10, s0.d r11, i0.h0 r12, int r13) {
            r9 = this;
            int r0 = r9.f20292g
            switch(r0) {
                case 2: goto L62;
                default: goto L5;
            }
        L5:
            r0 = -598911839(0xffffffffdc4d54a1, float:-2.3118168E17)
            r12.b0(r0)
            boolean r0 = r12.h(r10)
            if (r0 == 0) goto L13
            r0 = 4
            goto L14
        L13:
            r0 = 2
        L14:
            r0 = r0 | r13
            r3 = r0 & 19
            r5 = 18
            r6 = 1
            if (r3 == r5) goto L1e
            r3 = r6
            goto L1f
        L1e:
            r3 = 0
        L1f:
            r0 = r0 & r6
            boolean r0 = r12.S(r0, r3)
            if (r0 == 0) goto L4b
            android.content.res.Resources r0 = r10.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r3 = 32
            if (r0 != r3) goto L3c
            bi.b r0 = bi.d.a()
        L3a:
            r3 = r0
            goto L41
        L3c:
            bi.b r0 = bi.d.b()
            goto L3a
        L41:
            r5 = 0
            r8 = 3072(0xc00, float:4.305E-42)
            r4 = 0
            r6 = r11
            r7 = r12
            ig.a.b(r3, r4, r5, r6, r7, r8)
            goto L4e
        L4b:
            r12.V()
        L4e:
            i0.r1 r6 = r12.t()
            if (r6 == 0) goto L61
            wb.rj r0 = new wb.rj
            r5 = 25
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f6035d = r0
        L61:
            return
        L62:
            r0 = -1412384717(0xffffffffabd0b833, float:-1.4830414E-12)
            r12.b0(r0)
            boolean r0 = r12.h(r10)
            if (r0 == 0) goto L70
            r0 = 4
            goto L71
        L70:
            r0 = 2
        L71:
            r0 = r0 | r13
            r1 = r0 & 19
            r2 = 18
            r3 = 1
            if (r1 == r2) goto L7b
            r1 = r3
            goto L7c
        L7b:
            r1 = 0
        L7c:
            r0 = r0 & r3
            boolean r0 = r12.S(r0, r1)
            if (r0 == 0) goto La6
            android.content.res.Resources r0 = r10.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r1 = 32
            if (r0 != r1) goto L98
            bi.b r0 = bi.d.a()
            goto L9c
        L98:
            bi.b r0 = bi.d.b()
        L9c:
            r2 = 0
            r5 = 3072(0xc00, float:4.305E-42)
            r1 = 0
            r3 = r11
            r4 = r12
            ig.a.b(r0, r1, r2, r3, r4, r5)
            goto La9
        La6:
            r12.V()
        La9:
            i0.r1 r7 = r12.t()
            if (r7 == 0) goto Lbc
            b0.k r0 = new b0.k
            r5 = 10
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            r7.f6035d = r0
        Lbc:
            return
    }

    public void o0(fb.q1 r21, fg.l r22, fg.a r23, i0.h0 r24, int r25) {
            r20 = this;
            r1 = r21
            r9 = r24
            java.lang.String r0 = r1.f3721a
            r2 = 1727850328(0x66fce758, float:5.9715195E23)
            r9.b0(r2)
            boolean r2 = r9.f(r1)
            if (r2 == 0) goto L14
            r2 = 4
            goto L15
        L14:
            r2 = 2
        L15:
            r2 = r25 | r2
            r3 = r22
            boolean r4 = r9.h(r3)
            if (r4 == 0) goto L22
            r4 = 32
            goto L24
        L22:
            r4 = 16
        L24:
            r2 = r2 | r4
            r4 = r23
            boolean r5 = r9.h(r4)
            if (r5 == 0) goto L30
            r5 = 256(0x100, float:3.59E-43)
            goto L32
        L30:
            r5 = 128(0x80, float:1.8E-43)
        L32:
            r10 = r2 | r5
            r2 = r10 & 147(0x93, float:2.06E-43)
            r5 = 146(0x92, float:2.05E-43)
            if (r2 == r5) goto L3c
            r2 = 1
            goto L3d
        L3c:
            r2 = 0
        L3d:
            r5 = r10 & 1
            boolean r2 = r9.S(r5, r2)
            if (r2 == 0) goto Lc2
            i0.m2 r2 = y1.i0.f21966b
            java.lang.Object r2 = r9.j(r2)
            r6 = r2
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r2 = r9.P()
            i0.e r5 = i0.l.f5952a
            if (r2 != r5) goto L5d
            qg.t r2 = i0.r.n(r9)
            r9.k0(r2)
        L5d:
            qg.t r2 = (qg.t) r2
            boolean r7 = r9.f(r0)
            java.lang.Object r8 = r9.P()
            if (r7 != 0) goto L6b
            if (r8 != r5) goto L73
        L6b:
            r7 = 0
            i0.j1 r8 = i0.r.u(r7)
            r9.k0(r8)
        L73:
            i0.a1 r8 = (i0.a1) r8
            boolean r0 = r9.f(r0)
            java.lang.Object r7 = r9.P()
            if (r0 != 0) goto L81
            if (r7 != r5) goto L8a
        L81:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            i0.j1 r7 = i0.r.u(r0)
            r9.k0(r7)
        L8a:
            i0.a1 r7 = (i0.a1) r7
            java.lang.String r11 = r1.f3723c
            wb.d5 r0 = new wb.d5
            r5 = r8
            r8 = 6
            r19 = r4
            r4 = r2
            r2 = r3
            r3 = r7
            r7 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 99173463(0x5e94457, float:2.1936319E-35)
            s0.d r15 = s0.i.e(r1, r0, r9)
            int r0 = r10 << 18
            r1 = 234881024(0xe000000, float:1.5777218E-30)
            r0 = r0 & r1
            r17 = r0 | 6
            r18 = 3072(0xc00, float:4.305E-42)
            r0 = 0
            r2 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r1 = r11
            r10 = 0
            r12 = 0
            r14 = 0
            r16 = r9
            r9 = r23
            oh.h.d(r0, r1, r2, r4, r6, r8, r9, r10, r12, r14, r15, r16, r17, r18)
            goto Lc5
        Lc2:
            r24.V()
        Lc5:
            i0.r1 r7 = r24.t()
            if (r7 == 0) goto Lde
            c9.q0 r0 = new c9.q0
            r6 = 26
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f6035d = r0
        Lde:
            return
    }

    public void p(int r43, int r44, fg.l r45, i0.h0 r46, java.lang.String r47, java.lang.String r48, boolean r49) {
            r42 = this;
            r14 = r46
            r0 = 1192776513(0x47185341, float:38995.254)
            r14.b0(r0)
            r0 = r44 & 6
            r1 = 4
            if (r0 != 0) goto L1b
            boolean r0 = r46.f(r47)
            if (r0 == 0) goto L15
            r0 = r1
            goto L16
        L15:
            r0 = 2
        L16:
            r0 = r44 | r0
        L18:
            r2 = r48
            goto L1e
        L1b:
            r0 = r44
            goto L18
        L1e:
            boolean r3 = r14.f(r2)
            if (r3 == 0) goto L27
            r3 = 32
            goto L29
        L27:
            r3 = 16
        L29:
            r0 = r0 | r3
            r3 = r45
            boolean r4 = r14.h(r3)
            if (r4 == 0) goto L35
            r4 = 16384(0x4000, float:2.2959E-41)
            goto L37
        L35:
            r4 = 8192(0x2000, float:1.148E-41)
        L37:
            r0 = r0 | r4
            r4 = r0 & 9363(0x2493, float:1.312E-41)
            r5 = 9362(0x2492, float:1.3119E-41)
            r6 = 0
            r7 = 1
            if (r4 == r5) goto L42
            r4 = r7
            goto L43
        L42:
            r4 = r6
        L43:
            r5 = r0 & 1
            boolean r4 = r14.S(r5, r4)
            if (r4 == 0) goto L19b
            y0.l r8 = y0.l.f21818a
            r4 = 1065353216(0x3f800000, float:1.0)
            y0.o r5 = p.h1.d(r8, r4)
            p.e r9 = p.j.f9926c
            y0.e r10 = y0.b.f21804s
            p.t r6 = p.s.a(r9, r10, r14, r6)
            long r9 = r14.T
            int r9 = java.lang.Long.hashCode(r9)
            s0.h r10 = r14.l()
            y0.o r5 = y0.a.c(r14, r5)
            x1.f r11 = x1.g.f20914f
            r11.getClass()
            x1.y r11 = x1.f.f20883b
            r14.d0()
            boolean r12 = r14.S
            if (r12 == 0) goto L7b
            r14.k(r11)
            goto L7e
        L7b:
            r14.n0()
        L7e:
            x1.e r11 = x1.f.f20886e
            i0.r.A(r11, r14, r6)
            x1.e r6 = x1.f.f20885d
            i0.r.A(r6, r14, r10)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            x1.e r9 = x1.f.f20887f
            i0.r.A(r9, r14, r6)
            x1.d r6 = x1.f.f20888g
            i0.r.w(r6, r14)
            x1.e r6 = x1.f.f20884c
            i0.r.A(r6, r14, r5)
            i0.m2 r5 = bi.d.f892a
            java.lang.Object r6 = r14.j(r5)
            bi.b r6 = (bi.b) r6
            long r15 = r6.g()
            r6 = 13
            long r17 = x6.d.D(r6)
            m2.k r6 = m2.k.f8698j
            float r9 = (float) r1
            r1 = 6
            float r12 = (float) r1
            r13 = 6
            r10 = 0
            r11 = 0
            y0.o r1 = p.d.p(r8, r9, r10, r11, r12, r13)
            r9 = r0 & 14
            r10 = 1597488(0x186030, float:2.238557E-39)
            r20 = r9 | r10
            r21 = 0
            r22 = 262056(0x3ffa8, float:3.67219E-40)
            r9 = r7
            r7 = 0
            r11 = r8
            r10 = r9
            r8 = 0
            r12 = r10
            r10 = 0
            r19 = r11
            r13 = r12
            r11 = 0
            r23 = r13
            r13 = 0
            r14 = 0
            r2 = r15
            r15 = 0
            r16 = 0
            r24 = r4
            r40 = r17
            r18 = r5
            r4 = r40
            r17 = 0
            r25 = r18
            r18 = 0
            r23 = r0
            r27 = r19
            r26 = r25
            r19 = r46
            r0 = r47
            sh.s.n(r0, r1, r2, r4, r6, r7, r8, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r14 = r19
            w.p0 r5 = new w.p0
            r0 = 123(0x7b, float:1.72E-43)
            r1 = r43
            r5.<init>(r1, r0)
            i2.n0 r28 = new i2.n0
            r0 = r26
            java.lang.Object r2 = r14.j(r0)
            bi.b r2 = (bi.b) r2
            long r29 = r2.g()
            r2 = 15
            long r31 = x6.d.D(r2)
            r37 = 0
            r39 = 16777212(0xfffffc, float:2.3509881E-38)
            r33 = 0
            r34 = 0
            r36 = 0
            r28.<init>(r29, r31, r33, r34, r36, r37, r39)
            f1.t0 r12 = new f1.t0
            java.lang.Object r2 = r14.j(r0)
            bi.b r2 = (bi.b) r2
            long r2 = r2.j()
            r12.<init>(r2)
            r8 = r27
            r2 = 1065353216(0x3f800000, float:1.0)
            y0.o r2 = p.h1.d(r8, r2)
            if (r49 == 0) goto L13f
            r3 = 44
        L13d:
            float r3 = (float) r3
            goto L142
        L13f:
            r3 = 92
            goto L13d
        L142:
            r4 = 170(0xaa, float:2.38E-43)
            float r4 = (float) r4
            y0.o r2 = p.h1.f(r2, r3, r4)
            r3 = 10
            float r3 = (float) r3
            v.d r4 = v.e.a(r3)
            y0.o r2 = c1.h.b(r2, r4)
            java.lang.Object r0 = r14.j(r0)
            bi.b r0 = (bi.b) r0
            long r6 = r0.g()
            r0 = 1031127695(0x3d75c28f, float:0.06)
            long r6 = f1.w.b(r6, r0)
            f1.m0 r0 = f1.c0.f3038b
            y0.o r0 = k.n.g(r2, r6, r0)
            r2 = 12
            float r2 = (float) r2
            y0.o r2 = p.d.m(r0, r2, r3)
            int r0 = r23 >> 3
            r0 = r0 & 14
            int r3 = r23 >> 9
            r3 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            r3 = 100663296(0x6000000, float:2.4074124E-35)
            r15 = r0 | r3
            r16 = 0
            r17 = 48792(0xbe98, float:6.8372E-41)
            r3 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r1 = r45
            r0 = r48
            r7 = r49
            r4 = r28
            w.i.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r9 = 1
            r14.p(r9)
            goto L19e
        L19b:
            r14.V()
        L19e:
            i0.r1 r0 = r14.t()
            if (r0 == 0) goto L1b9
            c9.f0 r2 = new c9.f0
            r3 = r42
            r7 = r43
            r9 = r44
            r8 = r45
            r4 = r47
            r5 = r48
            r6 = r49
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r0.f6035d = r2
        L1b9:
            return
    }

    public void p0(fb.q1 r49, fg.a r50, i0.h0 r51, int r52) {
            r48 = this;
            r2 = r49
            r3 = r50
            r8 = r51
            y0.f r0 = y0.b.f21802q
            r1 = -1116312597(0xffffffffbd766beb, float:-0.060161512)
            r8.b0(r1)
            boolean r1 = r8.f(r2)
            if (r1 == 0) goto L16
            r1 = 4
            goto L17
        L16:
            r1 = 2
        L17:
            r1 = r52 | r1
            boolean r4 = r8.h(r3)
            if (r4 == 0) goto L22
            r4 = 32
            goto L24
        L22:
            r4 = 16
        L24:
            r1 = r1 | r4
            r4 = r1 & 147(0x93, float:2.06E-43)
            r5 = 146(0x92, float:2.05E-43)
            r11 = 1
            if (r4 == r5) goto L2e
            r4 = r11
            goto L2f
        L2e:
            r4 = 0
        L2f:
            r1 = r1 & r11
            boolean r1 = r8.S(r1, r4)
            if (r1 == 0) goto L67f
            boolean r1 = M1(r2)
            java.lang.String r13 = r2.f3730j
            java.lang.String r14 = r2.f3725e
            java.lang.String r15 = r2.f3724d
            java.lang.String r4 = r2.f3726f
            java.lang.String r5 = r2.f3727g
            java.lang.String r6 = r2.f3722b
            int r7 = r6.hashCode()
            r9 = -985174221(0xffffffffc5476f33, float:-3190.95)
            if (r7 == r9) goto L6f
            r9 = -906336856(0xffffffffc9fa65a8, float:-2051253.0)
            if (r7 == r9) goto L63
            r9 = 1108864149(0x4217ec95, float:37.981037)
            if (r7 == r9) goto L5a
            goto L77
        L5a:
            java.lang.String r7 = "workspace"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L7a
            goto L77
        L63:
            java.lang.String r7 = "search"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L6c
            goto L77
        L6c:
            m1.f r6 = wb.ap.f15070k
            goto L7c
        L6f:
            java.lang.String r7 = "plugin"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L7a
        L77:
            m1.f r6 = wb.ap.f15063d
            goto L7c
        L7a:
            m1.f r6 = wb.ap.f15066g
        L7c:
            int r7 = r5.hashCode()
            java.lang.String r9 = "running"
            switch(r7) {
                case -1947652542: goto Laa;
                case -1867169789: goto L9e;
                case -948696717: goto L92;
                case 1550783935: goto L86;
                default: goto L85;
            }
        L85:
            goto Lb2
        L86:
            boolean r7 = r5.equals(r9)
            if (r7 != 0) goto L8d
            goto Lb2
        L8d:
            java.lang.String r7 = "进行中"
        L8f:
            r17 = r13
            goto Lb8
        L92:
            java.lang.String r7 = "queued"
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto L9b
            goto Lb2
        L9b:
            java.lang.String r7 = "排队"
            goto L8f
        L9e:
            java.lang.String r7 = "success"
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto La7
            goto Lb2
        La7:
            java.lang.String r7 = "完成"
            goto L8f
        Laa:
            java.lang.String r7 = "interrupted"
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto Lb5
        Lb2:
            java.lang.String r7 = "失败"
            goto L8f
        Lb5:
            java.lang.String r7 = "已中断"
            goto L8f
        Lb8:
            long r12 = r2.f3728h
            r18 = 0
            int r20 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            r21 = r11
            if (r20 <= 0) goto Lca
            long r10 = r2.f3729i
            int r22 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r22 < 0) goto Lca
            long r10 = r10 - r12
            goto Lcc
        Lca:
            r10 = r18
        Lcc:
            r12 = 1000(0x3e8, double:4.94E-321)
            int r22 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r22 < 0) goto Lfc
            r22 = r12
            long r12 = r10 / r22
            long r10 = r10 % r22
            r27 = r1
            r1 = 100
            r22 = r4
            r23 = r5
            long r4 = (long) r1
            long r10 = r10 / r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r12)
            java.lang.String r4 = "."
            r1.append(r4)
            r1.append(r10)
            java.lang.String r4 = "s"
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            goto L11a
        Lfc:
            r27 = r1
            r22 = r4
            r23 = r5
            int r1 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r1 <= 0) goto L118
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            java.lang.String r4 = "ms"
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            goto L11a
        L118:
            java.lang.String r1 = ""
        L11a:
            if (r27 == 0) goto L123
            boolean r4 = og.m.t0(r22)
            r4 = r4 ^ 1
            goto L13a
        L123:
            boolean r4 = og.m.t0(r15)
            if (r4 == 0) goto L138
            boolean r4 = og.m.t0(r22)
            if (r4 == 0) goto L138
            boolean r4 = og.m.t0(r14)
            if (r4 != 0) goto L136
            goto L138
        L136:
            r4 = 0
            goto L13a
        L138:
            r4 = r21
        L13a:
            y0.l r10 = y0.l.f21818a
            r11 = 1065353216(0x3f800000, float:1.0)
            y0.o r5 = p.h1.d(r10, r11)
            r12 = 6
            float r12 = (float) r12
            v.d r13 = v.e.a(r12)
            y0.o r5 = c1.h.b(r5, r13)
            if (r4 == 0) goto L153
            y0.o r4 = wb.ho.O6(r10, r3)
            goto L154
        L153:
            r4 = r10
        L154:
            y0.o r4 = r5.d(r4)
            r13 = 5
            float r5 = (float) r13
            r11 = 0
            r13 = r21
            y0.o r4 = p.d.n(r4, r11, r5, r13)
            p.e r5 = p.j.f9926c
            y0.e r11 = y0.b.f21804s
            r13 = 0
            p.t r5 = p.s.a(r5, r11, r8, r13)
            r11 = r14
            long r13 = r8.T
            int r13 = java.lang.Long.hashCode(r13)
            s0.h r14 = r8.l()
            y0.o r4 = y0.a.c(r8, r4)
            x1.f r24 = x1.g.f20914f
            r24.getClass()
            x1.y r3 = x1.f.f20883b
            r8.d0()
            r24 = r6
            boolean r6 = r8.S
            if (r6 == 0) goto L18d
            r8.k(r3)
            goto L190
        L18d:
            r8.n0()
        L190:
            x1.e r6 = x1.f.f20886e
            i0.r.A(r6, r8, r5)
            x1.e r5 = x1.f.f20885d
            i0.r.A(r5, r8, r14)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            x1.e r14 = x1.f.f20887f
            i0.r.A(r14, r8, r13)
            x1.d r13 = x1.f.f20888g
            i0.r.w(r13, r8)
            r25 = r7
            x1.e r7 = x1.f.f20884c
            i0.r.A(r7, r8, r4)
            r4 = 1073043765(0x3ff55935, float:1.9167849)
            r8.a0(r4)
            p.c r4 = p.j.f9924a
            r26 = r11
            r11 = 48
            p.e1 r4 = p.d1.a(r4, r0, r8, r11)
            r34 = r12
            long r11 = r8.T
            int r11 = java.lang.Long.hashCode(r11)
            s0.h r12 = r8.l()
            r28 = r9
            y0.o r9 = y0.a.c(r8, r10)
            r8.d0()
            r36 = r15
            boolean r15 = r8.S
            if (r15 == 0) goto L1de
            r8.k(r3)
            goto L1e1
        L1de:
            r8.n0()
        L1e1:
            i0.r.A(r6, r8, r4)
            i0.r.A(r5, r8, r12)
            j8.b.p(r11, r8, r14, r8, r13)
            i0.r.A(r7, r8, r9)
            i0.m2 r3 = bi.d.f892a
            java.lang.Object r4 = r8.j(r3)
            bi.b r4 = (bi.b) r4
            long r4 = r4.j()
            f1.n r7 = new f1.n
            r11 = 5
            r7.<init>(r4, r11)
            r4 = 18
            float r4 = (float) r4
            y0.o r6 = p.h1.j(r10, r4)
            r5 = 0
            r9 = 432(0x1b0, float:6.05E-43)
            r37 = r22
            r4 = r24
            r12 = r28
            k.n.c(r4, r5, r6, r7, r8, r9)
            java.lang.String r4 = r2.f3723c
            java.lang.Object r3 = r8.j(r3)
            bi.b r3 = (bi.b) r3
            long r6 = r3.j()
            r3 = 13
            long r13 = x6.d.D(r3)
            r28 = r10
            m2.k r10 = m2.k.f8698j
            r3 = 8
            float r3 = (float) r3
            r32 = 0
            r33 = 14
            r30 = 0
            r31 = 0
            r29 = r3
            y0.o r3 = p.d.p(r28, r29, r30, r31, r32, r33)
            r9 = r12
            r5 = 1065353216(0x3f800000, float:1.0)
            double r11 = (double) r5
            r30 = 0
            int r38 = (r11 > r30 ? 1 : (r11 == r30 ? 0 : -1))
            java.lang.String r39 = "invalid weight; must be greater than zero"
            if (r38 <= 0) goto L246
            goto L249
        L246:
            q.a.a(r39)
        L249:
            p.q0 r11 = new p.q0
            r12 = 1
            r11.<init>(r5, r12)
            y0.o r3 = r3.d(r11)
            r11 = r25
            r25 = 24960(0x6180, float:3.4976E-41)
            r15 = r26
            r26 = 241576(0x3afa8, float:3.3852E-40)
            r18 = r11
            r11 = 0
            r46 = r13
            r14 = r9
            r8 = r46
            r21 = r12
            r12 = 0
            r22 = r14
            r14 = 0
            r24 = r15
            r30 = 0
            r15 = 0
            r31 = r17
            r17 = 2
            r32 = r18
            r18 = 0
            r33 = 5
            r19 = 1
            r40 = 2
            r20 = 0
            r41 = r21
            r21 = 0
            r42 = r22
            r22 = 0
            r43 = r24
            r24 = 1597440(0x186000, float:2.23849E-39)
            r40 = r0
            r5 = r3
            r2 = r23
            r3 = r32
            r35 = r34
            r0 = r41
            r23 = r51
            r34 = r31
            sh.s.n(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.String[] r1 = new java.lang.String[]{r3, r1}
            java.util.List r1 = a.a.y0(r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L2b1:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L2c8
            java.lang.Object r4 = r1.next()
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = og.m.t0(r5)
            if (r5 != 0) goto L2b1
            r3.add(r4)
            goto L2b1
        L2c8:
            r7 = 0
            r8 = 62
            java.lang.String r4 = " "
            r5 = 0
            r6 = 0
            java.lang.String r4 = tf.m.A1(r3, r4, r5, r6, r7, r8)
            bi.b r1 = g4.a.r(r51)
            long r6 = r1.h()
            r1 = 11
            long r8 = x6.d.D(r1)
            r32 = 0
            r33 = 14
            r30 = 0
            r31 = 0
            y0.o r5 = p.d.p(r28, r29, r30, r31, r32, r33)
            r3 = r28
            r25 = 0
            r26 = 262120(0x3ffe8, float:3.67308E-40)
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 24624(0x6030, float:3.4506E-41)
            r23 = r51
            sh.s.n(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r8 = r23
            r8.p(r0)
            r4 = 26
            if (r27 == 0) goto L389
            r5 = 1073909687(0x40028fb7, float:2.0400217)
            r8.a0(r5)
            boolean r5 = og.m.t0(r34)
            if (r5 != 0) goto L376
            r5 = r42
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L376
            r2 = 1073998471(0x4003ea87, float:2.0611894)
            r8.a0(r2)
            bi.b r2 = g4.a.r(r8)
            long r6 = r2.h()
            long r8 = x6.d.D(r1)
            r5 = 1065353216(0x3f800000, float:1.0)
            y0.o r10 = p.h1.d(r3, r5)
            float r11 = (float) r4
            r12 = 2
            float r12 = (float) r12
            r14 = 0
            r15 = 12
            r13 = 0
            y0.o r5 = p.d.p(r10, r11, r12, r13, r14, r15)
            r25 = 24960(0x6180, float:3.4976E-41)
            r26 = 241640(0x3afe8, float:3.3861E-40)
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r17 = 2
            r18 = 0
            r19 = 1
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 24624(0x6030, float:3.4506E-41)
            r23 = r51
            r4 = r34
            sh.s.n(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r8 = r23
            r6 = 0
            r8.p(r6)
            goto L380
        L376:
            r6 = 0
            r1 = 1074356397(0x400960ad, float:2.1465256)
            r8.a0(r1)
            r8.p(r6)
        L380:
            r8.p(r6)
            r8.p(r6)
            r12 = r0
            goto L67b
        L389:
            r31 = r34
            r5 = r42
            r6 = 0
            r12 = 2
            r7 = 1074392109(0x4009ec2d, float:2.15504)
            r8.a0(r7)
            r8.p(r6)
            boolean r7 = og.m.t0(r36)
            if (r7 != 0) goto L418
            r7 = 1074459844(0x400af4c4, float:2.1711893)
            r8.a0(r7)
            java.lang.String r7 = O1(r36)
            bi.b r9 = g4.a.r(r8)
            long r9 = r9.h()
            r11 = 12
            long r13 = x6.d.D(r11)
            r11 = 1065353216(0x3f800000, float:1.0)
            y0.o r15 = p.h1.d(r3, r11)
            float r11 = (float) r4
            r27 = r1
            float r1 = (float) r12
            r19 = 0
            r20 = 12
            r18 = 0
            r17 = r1
            r16 = r11
            y0.o r1 = p.d.p(r15, r16, r17, r18, r19, r20)
            r25 = 24960(0x6180, float:3.4976E-41)
            r26 = 241640(0x3afe8, float:3.3861E-40)
            r16 = r6
            r46 = r9
            r9 = r4
            r4 = r7
            r6 = r46
            r10 = 0
            r11 = 0
            r46 = r13
            r14 = r9
            r8 = r46
            r45 = r12
            r12 = 0
            r15 = r14
            r14 = 0
            r17 = r15
            r30 = r16
            r15 = 0
            r18 = r17
            r17 = 2
            r19 = r18
            r18 = 0
            r20 = r19
            r19 = 1
            r21 = r20
            r20 = 0
            r22 = r21
            r21 = 0
            r23 = r22
            r22 = 0
            r24 = 24624(0x6030, float:3.4506E-41)
            r0 = r5
            r5 = r1
            r1 = r0
            r23 = r51
            r0 = r30
            sh.s.n(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r8 = r23
            r8.p(r0)
            goto L425
        L418:
            r27 = r1
            r1 = r5
            r0 = r6
            r4 = 1074816685(0x401066ad, float:2.2562668)
            r8.a0(r4)
            r8.p(r0)
        L425:
            boolean r4 = og.m.t0(r31)
            if (r4 != 0) goto L47d
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L47d
            r1 = 1074911235(0x4011d803, float:2.2788093)
            r8.a0(r1)
            bi.b r1 = g4.a.r(r8)
            long r6 = r1.h()
            long r8 = x6.d.D(r27)
            r5 = 1065353216(0x3f800000, float:1.0)
            y0.o r10 = p.h1.d(r3, r5)
            r14 = 26
            float r11 = (float) r14
            r12 = 2
            float r12 = (float) r12
            r14 = 0
            r15 = 12
            r13 = 0
            y0.o r5 = p.d.p(r10, r11, r12, r13, r14, r15)
            r25 = 24960(0x6180, float:3.4976E-41)
            r26 = 241640(0x3afe8, float:3.3861E-40)
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r17 = 2
            r18 = 0
            r19 = 1
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 24624(0x6030, float:3.4506E-41)
            r23 = r51
            r4 = r31
            sh.s.n(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r8 = r23
            r8.p(r0)
            goto L486
        L47d:
            r1 = 1075238285(0x4016d58d, float:2.356784)
            r8.a0(r1)
            r8.p(r0)
        L486:
            boolean r1 = og.m.t0(r37)
            r2 = 14
            r10 = 3
            if (r1 != 0) goto L56c
            r1 = 1075298363(0x4017c03b, float:2.3711078)
            r8.a0(r1)
            r5 = 1065353216(0x3f800000, float:1.0)
            y0.o r11 = p.h1.d(r3, r5)
            r14 = 26
            float r12 = (float) r14
            float r13 = (float) r10
            r15 = 0
            r16 = 12
            r14 = 0
            y0.o r1 = p.d.p(r11, r12, r13, r14, r15, r16)
            p.c r4 = p.j.f9924a
            r11 = r40
            r12 = 48
            p.e1 r4 = p.d1.a(r4, r11, r8, r12)
            long r5 = r8.T
            int r5 = java.lang.Long.hashCode(r5)
            s0.h r6 = r8.l()
            y0.o r1 = y0.a.c(r8, r1)
            x1.f r7 = x1.g.f20914f
            r7.getClass()
            x1.y r7 = x1.f.f20883b
            r8.d0()
            boolean r9 = r8.S
            if (r9 == 0) goto L4d1
            r8.k(r7)
            goto L4d4
        L4d1:
            r8.n0()
        L4d4:
            x1.e r7 = x1.f.f20886e
            i0.r.A(r7, r8, r4)
            x1.e r4 = x1.f.f20885d
            i0.r.A(r4, r8, r6)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            x1.e r5 = x1.f.f20887f
            i0.r.A(r5, r8, r4)
            x1.d r4 = x1.f.f20888g
            i0.r.w(r4, r8)
            x1.e r4 = x1.f.f20884c
            i0.r.A(r4, r8, r1)
            m1.f r4 = wb.ap.f15066g
            bi.b r1 = g4.a.r(r8)
            long r5 = r1.j()
            f1.n r7 = new f1.n
            r1 = 5
            r7.<init>(r5, r1)
            float r5 = (float) r2
            y0.o r6 = p.h1.j(r3, r5)
            r5 = 0
            r9 = 438(0x1b6, float:6.14E-43)
            k.n.c(r4, r5, r6, r7, r8, r9)
            bi.b r4 = g4.a.r(r51)
            long r6 = r4.j()
            long r8 = x6.d.D(r27)
            r32 = 0
            r33 = 14
            r30 = 0
            r31 = 0
            r28 = r3
            r29 = r35
            y0.o r5 = p.d.p(r28, r29, r30, r31, r32, r33)
            r25 = 0
            r26 = 262120(0x3ffe8, float:3.67308E-40)
            java.lang.String r4 = "查看 Diff"
            r13 = r10
            r10 = 0
            r40 = r11
            r11 = 0
            r44 = r12
            r14 = r13
            r12 = 0
            r15 = r14
            r14 = 0
            r17 = r15
            r15 = 0
            r18 = r17
            r17 = 0
            r19 = r18
            r18 = 0
            r20 = r19
            r19 = 0
            r21 = r20
            r20 = 0
            r22 = r21
            r21 = 0
            r23 = r22
            r22 = 0
            r24 = 24630(0x6036, float:3.4514E-41)
            r1 = r23
            r2 = r40
            r23 = r51
            sh.s.n(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r8 = r23
            r12 = 1
            r8.p(r12)
            r8.p(r0)
            goto L57a
        L56c:
            r1 = r10
            r29 = r35
            r2 = r40
            r4 = 1075992205(0x4022568d, float:2.5365326)
            r8.a0(r4)
            r8.p(r0)
        L57a:
            boolean r4 = og.m.t0(r43)
            if (r4 != 0) goto L66e
            r4 = 1076060343(0x402360b7, float:2.552778)
            r8.a0(r4)
            r5 = 1065353216(0x3f800000, float:1.0)
            y0.o r9 = p.h1.d(r3, r5)
            r14 = 26
            float r10 = (float) r14
            float r11 = (float) r1
            r13 = 0
            r14 = 12
            r12 = 0
            y0.o r1 = p.d.p(r9, r10, r11, r12, r13, r14)
            p.c r4 = p.j.f9924a
            r12 = 48
            p.e1 r2 = p.d1.a(r4, r2, r8, r12)
            long r4 = r8.T
            int r4 = java.lang.Long.hashCode(r4)
            s0.h r5 = r8.l()
            y0.o r1 = y0.a.c(r8, r1)
            x1.f r6 = x1.g.f20914f
            r6.getClass()
            x1.y r6 = x1.f.f20883b
            r8.d0()
            boolean r7 = r8.S
            if (r7 == 0) goto L5c0
            r8.k(r6)
            goto L5c3
        L5c0:
            r8.n0()
        L5c3:
            x1.e r6 = x1.f.f20886e
            i0.r.A(r6, r8, r2)
            x1.e r2 = x1.f.f20885d
            i0.r.A(r2, r8, r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            x1.e r4 = x1.f.f20887f
            i0.r.A(r4, r8, r2)
            x1.d r2 = x1.f.f20888g
            i0.r.w(r2, r8)
            x1.e r2 = x1.f.f20884c
            i0.r.A(r2, r8, r1)
            m1.f r4 = wb.ap.f15060a
            bi.b r1 = g4.a.r(r8)
            long r1 = r1.h()
            f1.n r7 = new f1.n
            r11 = 5
            r7.<init>(r1, r11)
            r1 = 14
            float r1 = (float) r1
            y0.o r1 = p.h1.j(r3, r1)
            java.lang.Object r2 = r8.P()
            i0.e r5 = i0.l.f5952a
            if (r2 != r5) goto L609
            wb.sr r2 = new wb.sr
            r5 = 8
            r2.<init>(r5)
            r8.k0(r2)
        L609:
            fg.l r2 = (fg.l) r2
            y0.o r6 = f1.c0.m(r1, r2)
            r5 = 0
            r9 = 438(0x1b6, float:6.14E-43)
            k.n.c(r4, r5, r6, r7, r8, r9)
            java.lang.String r4 = O1(r43)
            bi.b r1 = g4.a.r(r51)
            long r6 = r1.h()
            long r8 = x6.d.D(r27)
            r32 = 0
            r33 = 14
            r30 = 0
            r31 = 0
            r28 = r3
            y0.o r1 = p.d.p(r28, r29, r30, r31, r32, r33)
            if (r38 <= 0) goto L636
            goto L639
        L636:
            q.a.a(r39)
        L639:
            p.q0 r2 = new p.q0
            r5 = 1065353216(0x3f800000, float:1.0)
            r12 = 1
            r2.<init>(r5, r12)
            y0.o r5 = r1.d(r2)
            r25 = 24960(0x6180, float:3.4976E-41)
            r26 = 241640(0x3afe8, float:3.3861E-40)
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r17 = 2
            r18 = 0
            r19 = 1
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 24576(0x6000, float:3.4438E-41)
            r23 = r51
            sh.s.n(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r8 = r23
            r12 = 1
            r8.p(r12)
            r8.p(r0)
            goto L678
        L66e:
            r12 = 1
            r1 = 1076942541(0x4030d6cd, float:2.7631104)
            r8.a0(r1)
            r8.p(r0)
        L678:
            r8.p(r0)
        L67b:
            r8.p(r12)
            goto L682
        L67f:
            r8.V()
        L682:
            i0.r1 r6 = r8.t()
            if (r6 == 0) goto L699
            wb.rj r0 = new wb.rj
            r5 = 19
            r1 = r48
            r2 = r49
            r3 = r50
            r4 = r52
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f6035d = r0
        L699:
            return
    }

    public void q(f9.h r58, fg.p r59, fg.a r60, fg.a r61, i0.h0 r62, int r63) {
            r57 = this;
            r1 = r58
            r6 = r62
            r0 = 296249221(0x11a86785, float:2.6569525E-28)
            r6.b0(r0)
            boolean r0 = r6.f(r1)
            if (r0 == 0) goto L12
            r0 = 4
            goto L13
        L12:
            r0 = 2
        L13:
            r0 = r63 | r0
            r3 = r59
            boolean r4 = r6.h(r3)
            if (r4 == 0) goto L20
            r4 = 32
            goto L22
        L20:
            r4 = 16
        L22:
            r0 = r0 | r4
            r4 = r60
            boolean r7 = r6.h(r4)
            if (r7 == 0) goto L2e
            r7 = 256(0x100, float:3.59E-43)
            goto L30
        L2e:
            r7 = 128(0x80, float:1.8E-43)
        L30:
            r0 = r0 | r7
            r7 = r61
            boolean r8 = r6.h(r7)
            if (r8 == 0) goto L3c
            r8 = 2048(0x800, float:2.87E-42)
            goto L3e
        L3c:
            r8 = 1024(0x400, float:1.435E-42)
        L3e:
            r0 = r0 | r8
            r8 = r0 & 1171(0x493, float:1.641E-42)
            r9 = 1170(0x492, float:1.64E-42)
            if (r8 == r9) goto L47
            r8 = 1
            goto L48
        L47:
            r8 = 0
        L48:
            r9 = r0 & 1
            boolean r8 = r6.S(r9, r8)
            if (r8 == 0) goto L3fc
            long r8 = r1.f3376a
            boolean r12 = r1.f3378c
            boolean r13 = r6.e(r8)
            java.lang.Object r14 = r6.P()
            i0.e r15 = i0.l.f5952a
            if (r13 != 0) goto L62
            if (r14 != r15) goto L6b
        L62:
            java.lang.String r13 = r1.f3381f
            i0.j1 r14 = i0.r.u(r13)
            r6.k0(r14)
        L6b:
            i0.a1 r14 = (i0.a1) r14
            boolean r13 = r6.e(r8)
            java.lang.Object r2 = r6.P()
            if (r13 != 0) goto L79
            if (r2 != r15) goto L82
        L79:
            java.lang.String r2 = r1.f3382g
            i0.j1 r2 = i0.r.u(r2)
            r6.k0(r2)
        L82:
            i0.a1 r2 = (i0.a1) r2
            boolean r8 = r6.e(r8)
            java.lang.Object r9 = r6.P()
            if (r8 != 0) goto L90
            if (r9 != r15) goto L99
        L90:
            java.lang.String r8 = ""
            i0.j1 r9 = i0.r.u(r8)
            r6.k0(r9)
        L99:
            i0.a1 r9 = (i0.a1) r9
            y0.l r8 = y0.l.f21818a
            r13 = 1065353216(0x3f800000, float:1.0)
            y0.o r5 = p.h1.d(r8, r13)
            r10 = 10
            float r10 = (float) r10
            p.h r10 = p.j.g(r10)
            y0.e r11 = y0.b.f21804s
            r20 = r9
            r9 = 6
            p.t r10 = p.s.a(r10, r11, r6, r9)
            r11 = r14
            long r13 = r6.T
            int r13 = java.lang.Long.hashCode(r13)
            s0.h r14 = r6.l()
            y0.o r5 = y0.a.c(r6, r5)
            x1.f r22 = x1.g.f20914f
            r22.getClass()
            x1.y r9 = x1.f.f20883b
            r6.d0()
            r25 = r0
            boolean r0 = r6.S
            if (r0 == 0) goto Ld6
            r6.k(r9)
            goto Ld9
        Ld6:
            r6.n0()
        Ld9:
            x1.e r0 = x1.f.f20886e
            i0.r.A(r0, r6, r10)
            x1.e r10 = x1.f.f20885d
            i0.r.A(r10, r6, r14)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            x1.e r14 = x1.f.f20887f
            i0.r.A(r14, r6, r13)
            x1.d r13 = x1.f.f20888g
            i0.r.w(r13, r6)
            r23 = r9
            x1.e r9 = x1.f.f20884c
            i0.r.A(r9, r6, r5)
            java.lang.String r5 = r1.f3380e
            boolean r24 = og.m.t0(r5)
            if (r24 == 0) goto L102
            java.lang.String r5 = "当前内容为空"
        L102:
            r24 = r9
            i0.m2 r9 = bi.d.f892a
            java.lang.Object r26 = r6.j(r9)
            bi.b r26 = (bi.b) r26
            long r26 = r26.h()
            r28 = 13
            long r28 = x6.d.D(r28)
            r30 = r2
            r2 = 1065353216(0x3f800000, float:1.0)
            y0.o r3 = p.h1.d(r8, r2)
            r2 = 96
            float r2 = (float) r2
            r4 = 0
            r31 = r5
            r5 = 1
            y0.o r3 = p.h1.g(r3, r4, r2, r5)
            r2 = r23
            r23 = 0
            r4 = r24
            r24 = 262120(0x3ffe8, float:3.67308E-40)
            r19 = r8
            r8 = 0
            r32 = r9
            r9 = 0
            r34 = r10
            r33 = r11
            r10 = 0
            r35 = r12
            r12 = 0
            r37 = r13
            r36 = r14
            r13 = 0
            r38 = r15
            r15 = 0
            r39 = 4
            r16 = 0
            r40 = 32
            r17 = 0
            r41 = 0
            r18 = 0
            r42 = r19
            r19 = 0
            r43 = r20
            r20 = 0
            r44 = 6
            r22 = 24624(0x6030, float:3.4506E-41)
            r45 = r0
            r46 = r2
            r50 = r4
            r21 = r6
            r4 = r26
            r6 = r28
            r2 = r31
            r51 = r32
            r47 = r34
            r48 = r36
            r49 = r37
            r52 = r38
            r54 = r42
            r0 = r43
            sh.s.n(r2, r3, r4, r6, r8, r9, r10, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r6 = r21
            boolean r2 = r1.f3379d
            r3 = r2
            wb.y2 r2 = wb.y2.f20283h
            if (r3 == 0) goto L1cb
            r3 = 1183165650(0x4685acd2, float:17110.41)
            r6.a0(r3)
            java.lang.Object r3 = r33.getValue()
            r8 = r3
            java.lang.String r8 = (java.lang.String) r8
            r10 = r33
            boolean r3 = r6.f(r10)
            boolean r4 = r6.f(r0)
            r3 = r3 | r4
            java.lang.Object r4 = r6.P()
            r11 = r52
            if (r3 != 0) goto L1ac
            if (r4 != r11) goto L1b5
        L1ac:
            sh.m1 r4 = new sh.m1
            r3 = 3
            r4.<init>(r3, r10, r0)
            r6.k0(r4)
        L1b5:
            r5 = r4
            fg.l r5 = (fg.l) r5
            r4 = 200070(0x30d86, float:2.80358E-40)
            r3 = 9
            java.lang.String r7 = "金额"
            r9 = 1
            r2.p(r3, r4, r5, r6, r7, r8, r9)
            r2 = 0
            r6.p(r2)
            r12 = r30
            goto L256
        L1cb:
            r10 = r33
            r11 = r52
            r3 = 1183536348(0x468b54dc, float:17834.43)
            r6.a0(r3)
            if (r35 == 0) goto L1db
            java.lang.String r3 = "回复内容"
        L1d9:
            r7 = r3
            goto L1de
        L1db:
            java.lang.String r3 = "消息内容"
            goto L1d9
        L1de:
            java.lang.Object r3 = r10.getValue()
            r8 = r3
            java.lang.String r8 = (java.lang.String) r8
            boolean r3 = r6.f(r10)
            boolean r4 = r6.f(r0)
            r3 = r3 | r4
            java.lang.Object r4 = r6.P()
            if (r3 != 0) goto L1f6
            if (r4 != r11) goto L1ff
        L1f6:
            sh.m1 r4 = new sh.m1
            r3 = 4
            r4.<init>(r3, r10, r0)
            r6.k0(r4)
        L1ff:
            r5 = r4
            fg.l r5 = (fg.l) r5
            r4 = 200064(0x30d80, float:2.8035E-40)
            r3 = 1
            r9 = 0
            r2.p(r3, r4, r5, r6, r7, r8, r9)
            if (r35 == 0) goto L247
            r3 = 1183929924(0x46915644, float:18603.133)
            r6.a0(r3)
            java.lang.Object r3 = r30.getValue()
            r8 = r3
            java.lang.String r8 = (java.lang.String) r8
            r12 = r30
            boolean r3 = r6.f(r12)
            boolean r4 = r6.f(r0)
            r3 = r3 | r4
            java.lang.Object r4 = r6.P()
            if (r3 != 0) goto L22c
            if (r4 != r11) goto L235
        L22c:
            sh.m1 r4 = new sh.m1
            r3 = 5
            r4.<init>(r3, r12, r0)
            r6.k0(r4)
        L235:
            r5 = r4
            fg.l r5 = (fg.l) r5
            r4 = 200070(0x30d86, float:2.80358E-40)
            r3 = 1
            java.lang.String r7 = "引用内容"
            r9 = 0
            r2.p(r3, r4, r5, r6, r7, r8, r9)
            r2 = 0
            r6.p(r2)
            goto L253
        L247:
            r12 = r30
            r2 = 0
            r3 = 1184313363(0x46973013, float:19352.037)
            r6.a0(r3)
            r6.p(r2)
        L253:
            r6.p(r2)
        L256:
            java.lang.Object r2 = r0.getValue()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = og.m.t0(r2)
            if (r2 != 0) goto L2ca
            r2 = 1184389778(0x46985a92, float:19501.285)
            r6.a0(r2)
            java.lang.Object r2 = r0.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r3 = r51
            java.lang.Object r3 = r6.j(r3)
            bi.b r3 = (bi.b) r3
            long r4 = r3.j()
            r3 = 12
            long r7 = x6.d.D(r3)
            r9 = r54
            r3 = 1065353216(0x3f800000, float:1.0)
            y0.o r13 = p.h1.d(r9, r3)
            r30 = r12
            t2.k r12 = new t2.k
            r14 = 6
            r12.<init>(r14)
            r23 = 0
            r24 = 261096(0x3fbe8, float:3.65873E-40)
            r6 = r7
            r8 = 0
            r42 = r9
            r9 = 0
            r33 = r10
            r38 = r11
            r10 = 0
            r21 = r3
            r3 = r13
            r53 = r14
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 24624(0x6030, float:3.4506E-41)
            r43 = r0
            r0 = r21
            r55 = r30
            r56 = r38
            r1 = r42
            r21 = r62
            sh.s.n(r2, r3, r4, r6, r8, r9, r10, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r6 = r21
            r2 = 0
            r6.p(r2)
            goto L2e0
        L2ca:
            r43 = r0
            r33 = r10
            r56 = r11
            r55 = r12
            r1 = r54
            r0 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            r3 = 1184650643(0x469c5593, float:20010.787)
            r6.a0(r3)
            r6.p(r2)
        L2e0:
            y0.o r7 = p.h1.d(r1, r0)
            r0 = 4
            float r9 = (float) r0
            r11 = 0
            r12 = 13
            r8 = 0
            r10 = 0
            y0.o r2 = p.d.p(r7, r8, r9, r10, r11, r12)
            r3 = 8
            float r3 = (float) r3
            p.h r3 = p.j.g(r3)
            y0.f r4 = y0.b.f21801p
            r14 = 6
            p.e1 r3 = p.d1.a(r3, r4, r6, r14)
            long r4 = r6.T
            int r4 = java.lang.Long.hashCode(r4)
            s0.h r5 = r6.l()
            y0.o r2 = y0.a.c(r6, r2)
            r6.d0()
            boolean r7 = r6.S
            if (r7 == 0) goto L31a
            r7 = r46
            r6.k(r7)
        L317:
            r7 = r45
            goto L31e
        L31a:
            r6.n0()
            goto L317
        L31e:
            i0.r.A(r7, r6, r3)
            r3 = r47
            i0.r.A(r3, r6, r5)
            r3 = r48
            r5 = r49
            j8.b.p(r4, r6, r3, r6, r5)
            r4 = r50
            i0.r.A(r4, r6, r2)
            r15 = r58
            boolean r2 = r15.f3383h
            p.f1 r3 = p.f1.f9898a
            if (r2 == 0) goto L369
            r2 = 1998633221(0x7720b905, float:3.2598443E33)
            r6.a0(r2)
            r2 = 1
            y0.o r4 = r3.a(r1, r2)
            int r5 = r25 >> 3
            r5 = r5 & 112(0x70, float:1.57E-43)
            r12 = r5 | 6
            r13 = 2040(0x7f8, float:2.859E-42)
            r19 = r2
            java.lang.String r2 = "恢复"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = r62
            r0 = r3
            r22 = r14
            r14 = r19
            r3 = r60
            sh.s.o(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r6 = r11
            r2 = 0
            r6.p(r2)
            goto L377
        L369:
            r0 = r3
            r22 = r14
            r2 = 0
            r14 = 1
            r3 = 1998835031(0x7723cd57, float:3.3223015E33)
            r6.a0(r3)
            r6.p(r2)
        L377:
            y0.o r4 = r0.a(r1, r14)
            int r3 = r25 >> 6
            r3 = r3 & 112(0x70, float:1.57E-43)
            r12 = r3 | 6
            r13 = 2040(0x7f8, float:2.859E-42)
            r41 = r2
            java.lang.String r2 = "取消"
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r3 = r61
            r11 = r62
            sh.s.o(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r2 = r25 & 14
            r3 = 4
            if (r2 == r3) goto L39e
            r10 = r41
        L39b:
            r3 = r33
            goto L3a0
        L39e:
            r10 = r14
            goto L39b
        L3a0:
            boolean r2 = r11.f(r3)
            r2 = r2 | r10
            r4 = r43
            boolean r5 = r11.f(r4)
            r2 = r2 | r5
            r5 = r25 & 112(0x70, float:1.57E-43)
            r6 = 32
            if (r5 != r6) goto L3b4
            r10 = r14
            goto L3b6
        L3b4:
            r10 = r41
        L3b6:
            r2 = r2 | r10
            r12 = r55
            boolean r5 = r11.f(r12)
            r2 = r2 | r5
            java.lang.Object r5 = r11.P()
            if (r2 != 0) goto L3c8
            r2 = r56
            if (r5 != r2) goto L3ca
        L3c8:
            r2 = r0
            goto L3cd
        L3ca:
            r7 = r0
            r9 = r1
            goto L3dd
        L3cd:
            c9.r0 r0 = new c9.r0
            r6 = 5
            r9 = r1
            r7 = r2
            r5 = r12
            r1 = r15
            r2 = r59
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.k0(r0)
            r5 = r0
        L3dd:
            r1 = r5
            fg.a r1 = (fg.a) r1
            y0.o r2 = r7.a(r9, r14)
            r10 = 6
            r11 = 2040(0x7f8, float:2.859E-42)
            java.lang.String r0 = "保存"
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = r62
            sh.s.o(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r6 = r9
            r6.p(r14)
            r6.p(r14)
            goto L3ff
        L3fc:
            r6.V()
        L3ff:
            i0.r1 r8 = r6.t()
            if (r8 == 0) goto L419
            b0.z r0 = new b0.z
            r7 = 2
            r1 = r57
            r2 = r58
            r3 = r59
            r4 = r60
            r5 = r61
            r6 = r63
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.f6035d = r0
        L419:
            return
    }

    public void q0(fb.c r31, i0.h0 r32, int r33) {
            r30 = this;
            r0 = r30
            r1 = r31
            r6 = r32
            r8 = r33
            r2 = 1932138703(0x732a18cf, float:1.3476466E31)
            r6.b0(r2)
            boolean r2 = r6.f(r1)
            r9 = 2
            if (r2 == 0) goto L17
            r2 = 4
            goto L18
        L17:
            r2 = r9
        L18:
            r2 = r2 | r8
            r3 = r2 & 3
            r10 = 1
            r11 = 0
            if (r3 == r9) goto L21
            r3 = r10
            goto L22
        L21:
            r3 = r11
        L22:
            r2 = r2 & r10
            boolean r2 = r6.S(r2, r3)
            if (r2 == 0) goto L351
            i0.m2 r2 = y1.i0.f21966b
            java.lang.Object r2 = r6.j(r2)
            android.content.Context r2 = (android.content.Context) r2
            java.util.List r3 = r1.f3440j
            long r4 = r1.f3443m
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L4d
            i0.r1 r2 = r6.t()
            if (r2 == 0) goto L4a
            wb.hs r3 = new wb.hs
            r4 = 2
            r3.<init>(r0, r1, r8, r4)
            r2.f6035d = r3
            return
        L4a:
            r3 = r0
            goto L36a
        L4d:
            java.lang.String r3 = r1.f3444n
            java.lang.String r7 = "streaming"
            boolean r13 = gg.l.a(r3, r7)
            java.lang.Long r3 = java.lang.Long.valueOf(r4)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            boolean r7 = r6.g(r13)
            java.lang.Object r12 = r6.P()
            i0.e r14 = i0.l.f5952a
            if (r7 != 0) goto L6b
            if (r12 != r14) goto L74
        L6b:
            k9.q r12 = new k9.q
            r7 = 2
            r12.<init>(r7, r13)
            r6.k0(r12)
        L74:
            fg.a r12 = (fg.a) r12
            java.lang.Object r3 = v0.k.c(r3, r12, r6, r11)
            r15 = r3
            i0.a1 r15 = (i0.a1) r15
            java.lang.Long r3 = java.lang.Long.valueOf(r4)
            java.lang.String r7 = "work-override"
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r7}
            java.lang.Object r7 = r6.P()
            if (r7 != r14) goto L96
            wb.pp r7 = new wb.pp
            r12 = 3
            r7.<init>(r12)
            r6.k0(r7)
        L96:
            fg.a r7 = (fg.a) r7
            r12 = 48
            java.lang.Object r3 = v0.k.c(r3, r7, r6, r12)
            i0.a1 r3 = (i0.a1) r3
            boolean r4 = r6.e(r4)
            java.lang.Object r5 = r6.P()
            r16 = 0
            if (r4 != 0) goto Lae
            if (r5 != r14) goto Lb5
        Lae:
            i0.j1 r5 = i0.r.u(r16)
            r6.k0(r5)
        Lb5:
            r4 = r5
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r5 = r4.getValue()
            fb.q1 r5 = (fb.q1) r5
            if (r5 != 0) goto Lcd
            r2 = -807051590(0xffffffffcfe55eba, float:-7.696381E9)
            r6.a0(r2)
            r6.p(r11)
            r9 = r3
            r25 = r4
            goto L11d
        Lcd:
            r7 = -807051589(0xffffffffcfe55ebb, float:-7.6963814E9)
            r6.a0(r7)
            boolean r7 = r6.h(r2)
            boolean r17 = r6.h(r5)
            r7 = r7 | r17
            java.lang.Object r9 = r6.P()
            if (r7 != 0) goto Le5
            if (r9 != r14) goto Lef
        Le5:
            wb.l7 r9 = new wb.l7
            r7 = 16
            r9.<init>(r2, r7, r5)
            r6.k0(r9)
        Lef:
            fg.l r9 = (fg.l) r9
            boolean r2 = r6.f(r4)
            java.lang.Object r7 = r6.P()
            if (r2 != 0) goto Lfd
            if (r7 != r14) goto L107
        Lfd:
            wb.jp r7 = new wb.jp
            r2 = 13
            r7.<init>(r4, r2)
            r6.k0(r7)
        L107:
            fg.a r7 = (fg.a) r7
            r2 = r3
            r3 = r5
            r5 = r7
            r7 = 3072(0xc00, float:4.305E-42)
            r17 = r2
            wb.y2 r2 = wb.y2.f20289n
            r25 = r4
            r4 = r9
            r9 = r17
            r2.o0(r3, r4, r5, r6, r7)
            r6.p(r11)
        L11d:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r13)
            boolean r3 = r6.f(r9)
            boolean r4 = r6.f(r15)
            r3 = r3 | r4
            boolean r4 = r6.g(r13)
            r3 = r3 | r4
            java.lang.Object r4 = r6.P()
            if (r3 != 0) goto L137
            if (r4 != r14) goto L139
        L137:
            r3 = r12
            goto L140
        L139:
            r3 = r14
            r13 = r15
            r15 = r16
            r14 = r9
            r9 = r12
            goto L154
        L140:
            wb.yp r12 = new wb.yp
            r17 = 2
            r29 = r9
            r9 = r3
            r3 = r14
            r14 = r29
            r12.<init>(r13, r14, r15, r16, r17)
            r13 = r15
            r15 = r16
            r6.k0(r12)
            r4 = r12
        L154:
            fg.p r4 = (fg.p) r4
            i0.r.f(r4, r6, r2)
            java.lang.Object r2 = r13.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L168
            r2 = 1119092736(0x42b40000, float:90.0)
            goto L169
        L168:
            r2 = 0
        L169:
            r4 = 250(0xfa, float:3.5E-43)
            r5 = 6
            i.l1 r4 = i.d.p(r4, r5, r15)
            r6 = 3120(0xc30, float:4.372E-42)
            r7 = 20
            r16 = r3
            r3 = r4
            java.lang.String r4 = "agentWorkArrow"
            r9 = r5
            r15 = r16
            r5 = r32
            i0.l2 r2 = i.f.a(r2, r3, r4, r5, r6, r7)
            r6 = r5
            y0.l r3 = y0.l.f21818a
            r4 = 1065353216(0x3f800000, float:1.0)
            y0.o r19 = p.h1.d(r3, r4)
            r5 = 5
            float r7 = (float) r5
            r23 = 0
            r24 = 13
            r20 = 0
            r22 = 0
            r21 = r7
            y0.o r7 = p.d.p(r19, r20, r21, r22, r23, r24)
            y0.o r7 = h.d0.a(r7)
            p.e r5 = p.j.f9926c
            y0.e r10 = y0.b.f21804s
            p.t r5 = p.s.a(r5, r10, r6, r11)
            long r10 = r6.T
            int r10 = java.lang.Long.hashCode(r10)
            s0.h r11 = r6.l()
            y0.o r7 = y0.a.c(r6, r7)
            x1.f r20 = x1.g.f20914f
            r20.getClass()
            x1.y r12 = x1.f.f20883b
            r6.d0()
            boolean r9 = r6.S
            if (r9 == 0) goto L1c7
            r6.k(r12)
            goto L1ca
        L1c7:
            r6.n0()
        L1ca:
            x1.e r9 = x1.f.f20886e
            i0.r.A(r9, r6, r5)
            x1.e r5 = x1.f.f20885d
            i0.r.A(r5, r6, r11)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            x1.e r11 = x1.f.f20887f
            i0.r.A(r11, r6, r10)
            x1.d r10 = x1.f.f20888g
            i0.r.w(r10, r6)
            x1.e r8 = x1.f.f20884c
            i0.r.A(r8, r6, r7)
            y0.o r4 = p.h1.d(r3, r4)
            r7 = 6
            float r0 = (float) r7
            v.d r7 = v.e.a(r0)
            y0.o r4 = c1.h.b(r4, r7)
            boolean r7 = r6.f(r13)
            boolean r21 = r6.f(r14)
            r7 = r7 | r21
            r21 = r7
            java.lang.Object r7 = r6.P()
            if (r21 != 0) goto L209
            if (r7 != r15) goto L213
        L209:
            wb.pk r7 = new wb.pk
            r1 = 8
            r7.<init>(r1, r13, r14)
            r6.k0(r7)
        L213:
            fg.a r7 = (fg.a) r7
            y0.o r1 = wb.ho.O6(r4, r7)
            r4 = 0
            r14 = 1
            y0.o r0 = p.d.n(r1, r4, r0, r14)
            y0.f r1 = y0.b.f21802q
            p.c r4 = p.j.f9924a
            r7 = 48
            p.e1 r1 = p.d1.a(r4, r1, r6, r7)
            r16 = r15
            long r14 = r6.T
            int r4 = java.lang.Long.hashCode(r14)
            s0.h r7 = r6.l()
            y0.o r0 = y0.a.c(r6, r0)
            r6.d0()
            boolean r14 = r6.S
            if (r14 == 0) goto L244
            r6.k(r12)
            goto L247
        L244:
            r6.n0()
        L247:
            i0.r.A(r9, r6, r1)
            i0.r.A(r5, r6, r7)
            j8.b.p(r4, r6, r11, r6, r10)
            i0.r.A(r8, r6, r0)
            m1.f r0 = wb.ap.f15081v
            java.lang.Object r1 = r13.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L264
            java.lang.String r1 = "收起"
            goto L266
        L264:
            java.lang.String r1 = "展开"
        L266:
            i0.m2 r8 = bi.d.f892a
            java.lang.Object r4 = r6.j(r8)
            bi.b r4 = (bi.b) r4
            long r4 = r4.h()
            f1.n r7 = new f1.n
            r9 = 5
            r7.<init>(r4, r9)
            r4 = 18
            float r4 = (float) r4
            y0.o r4 = p.h1.j(r3, r4)
            boolean r5 = r6.f(r2)
            java.lang.Object r9 = r6.P()
            if (r5 != 0) goto L28d
            r15 = r16
            if (r9 != r15) goto L297
        L28d:
            sh.y0 r9 = new sh.y0
            r5 = 13
            r9.<init>(r2, r5)
            r6.k0(r9)
        L297:
            fg.l r9 = (fg.l) r9
            y0.o r4 = f1.c0.m(r4, r9)
            r5 = r7
            r7 = 6
            r2 = r0
            r19 = r3
            r27 = 6
            r3 = r1
            k.n.c(r2, r3, r4, r5, r6, r7)
            r1 = r31
            java.util.List r0 = r1.f3440j
            int r0 = r0.size()
            java.lang.String r2 = "工具调用（"
            java.lang.String r3 = "）"
            java.lang.String r2 = eh.a.m(r0, r2, r3)
            java.lang.Object r0 = r6.j(r8)
            bi.b r0 = (bi.b) r0
            long r4 = r0.h()
            r0 = 13
            long r7 = x6.d.D(r0)
            r6 = r7
            m2.k r8 = m2.k.f8698j
            r0 = 7
            float r0 = (float) r0
            r23 = 0
            r24 = 14
            r21 = 0
            r22 = 0
            r20 = r0
            y0.o r3 = p.d.p(r19, r20, r21, r22, r23, r24)
            r23 = 0
            r24 = 262056(0x3ffa8, float:3.67219E-40)
            r9 = 0
            r10 = 0
            r12 = 0
            r15 = r13
            r13 = 0
            r0 = r15
            r15 = 0
            r16 = 0
            r19 = 0
            r17 = 0
            r20 = 2
            r18 = 0
            r21 = r19
            r19 = 0
            r22 = r20
            r20 = 0
            r28 = r22
            r22 = 1597488(0x186030, float:2.238557E-39)
            r26 = r0
            r1 = r21
            r0 = 1
            r21 = r32
            sh.s.n(r2, r3, r4, r6, r8, r9, r10, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r6 = r21
            r6.p(r0)
            java.lang.Object r2 = r26.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r3 = 180(0xb4, float:2.52E-43)
            r7 = 6
            i.l1 r3 = i.d.p(r3, r7, r1)
            r4 = 2
            h.r0 r3 = h.m0.a(r3, r4)
            r5 = 140(0x8c, float:1.96E-43)
            i.l1 r1 = i.d.p(r5, r7, r1)
            h.s0 r5 = h.m0.b(r1, r4)
            db.f r1 = new db.f
            r4 = 20
            r10 = r31
            r7 = r25
            r1.<init>(r10, r4, r7)
            r4 = -1044566243(0xffffffffc1bd2f1d, float:-23.648005)
            s0.d r7 = s0.i.e(r4, r1, r6)
            r9 = 1600518(0x186c06, float:2.242803E-39)
            r4 = r3
            r3 = 0
            r6 = 0
            r8 = r32
            h.a0.b(r2, r3, r4, r5, r6, r7, r8, r9)
            r6 = r8
            r6.p(r0)
            goto L355
        L351:
            r10 = r1
            r6.V()
        L355:
            i0.r1 r0 = r6.t()
            if (r0 == 0) goto L368
            wb.hs r1 = new wb.hs
            r2 = 3
            r3 = r30
            r8 = r33
            r1.<init>(r3, r10, r8, r2)
            r0.f6035d = r1
            return
        L368:
            r3 = r30
        L36a:
            return
    }

    public void r(java.lang.String r41, int r42, boolean r43, java.lang.String r44, i0.h0 r45, int r46) {
            r40 = this;
            r1 = r41
            r9 = r43
            r10 = r45
            r11 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r2 = 486134702(0x1cf9d3ae, float:1.6532156E-21)
            r10.b0(r2)
            boolean r2 = r10.f(r1)
            r3 = 4
            if (r2 == 0) goto L1a
            r2 = r3
            goto L1b
        L1a:
            r2 = 2
        L1b:
            r2 = r46 | r2
            r12 = r42
            boolean r4 = r10.d(r12)
            r5 = 32
            if (r4 == 0) goto L29
            r4 = r5
            goto L2b
        L29:
            r4 = 16
        L2b:
            r2 = r2 | r4
            boolean r4 = r10.g(r9)
            if (r4 == 0) goto L35
            r4 = 256(0x100, float:3.59E-43)
            goto L37
        L35:
            r4 = 128(0x80, float:1.8E-43)
        L37:
            r2 = r2 | r4
            r14 = r44
            boolean r4 = r10.f(r14)
            if (r4 == 0) goto L43
            r4 = 2048(0x800, float:2.87E-42)
            goto L45
        L43:
            r4 = 1024(0x400, float:1.435E-42)
        L45:
            r2 = r2 | r4
            r4 = r2 & 1171(0x493, float:1.641E-42)
            r6 = 1170(0x492, float:1.64E-42)
            if (r4 == r6) goto L4e
            r4 = 1
            goto L4f
        L4e:
            r4 = r11
        L4f:
            r6 = r2 & 1
            boolean r4 = r10.S(r6, r4)
            if (r4 == 0) goto L63e
            r4 = r2 & 14
            if (r4 != r3) goto L5d
            r6 = 1
            goto L5e
        L5d:
            r6 = r11
        L5e:
            r2 = r2 & 112(0x70, float:1.57E-43)
            if (r2 != r5) goto L64
            r7 = 1
            goto L65
        L64:
            r7 = r11
        L65:
            r6 = r6 | r7
            java.lang.Object r7 = r10.P()
            i0.e r8 = i0.l.f5952a
            if (r6 != 0) goto L70
            if (r7 != r8) goto L78
        L70:
            r6 = 0
            i0.j1 r7 = i0.r.u(r6)
            r10.k0(r7)
        L78:
            i0.a1 r7 = (i0.a1) r7
            if (r4 != r3) goto L7e
            r6 = 1
            goto L7f
        L7e:
            r6 = r11
        L7f:
            if (r2 != r5) goto L84
            r16 = 1
            goto L86
        L84:
            r16 = r11
        L86:
            r6 = r6 | r16
            r23 = 16
            java.lang.Object r13 = r10.P()
            if (r6 != 0) goto L92
            if (r13 != r8) goto L9b
        L92:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            i0.j1 r13 = i0.r.u(r6)
            r10.k0(r13)
        L9b:
            i0.a1 r13 = (i0.a1) r13
            if (r4 != r3) goto La1
            r6 = 1
            goto La2
        La1:
            r6 = r11
        La2:
            if (r2 != r5) goto La7
            r16 = 1
            goto La9
        La7:
            r16 = r11
        La9:
            r6 = r6 | r16
            java.lang.Object r15 = r10.P()
            if (r6 != 0) goto Lb3
            if (r15 != r8) goto Lbc
        Lb3:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            i0.j1 r15 = i0.r.u(r6)
            r10.k0(r15)
        Lbc:
            i0.a1 r15 = (i0.a1) r15
            if (r4 != r3) goto Lc2
            r6 = 1
            goto Lc3
        Lc2:
            r6 = r11
        Lc3:
            if (r2 != r5) goto Lc8
            r16 = 1
            goto Lca
        Lc8:
            r16 = r11
        Lca:
            r6 = r6 | r16
            java.lang.Object r11 = r10.P()
            if (r6 != 0) goto Ld4
            if (r11 != r8) goto Ldb
        Ld4:
            i0.j1 r11 = i0.r.u(r0)
            r10.k0(r11)
        Ldb:
            i0.a1 r11 = (i0.a1) r11
            if (r4 != r3) goto Le1
            r6 = 1
            goto Le2
        Le1:
            r6 = 0
        Le2:
            if (r2 != r5) goto Le7
            r16 = 1
            goto Le9
        Le7:
            r16 = 0
        Le9:
            r6 = r6 | r16
            java.lang.Object r5 = r10.P()
            if (r6 != 0) goto Lf3
            if (r5 != r8) goto Lfa
        Lf3:
            i0.j1 r5 = i0.r.u(r0)
            r10.k0(r5)
        Lfa:
            i0.a1 r5 = (i0.a1) r5
            if (r4 != r3) goto L102
            r0 = 1
        Lff:
            r6 = 32
            goto L104
        L102:
            r0 = 0
            goto Lff
        L104:
            if (r2 != r6) goto L108
            r2 = 1
            goto L109
        L108:
            r2 = 0
        L109:
            r0 = r0 | r2
            java.lang.Object r2 = r10.P()
            java.lang.String r26 = ""
            if (r0 != 0) goto L114
            if (r2 != r8) goto L11b
        L114:
            i0.j1 r2 = i0.r.u(r26)
            r10.k0(r2)
        L11b:
            r6 = r2
            i0.a1 r6 = (i0.a1) r6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            if (r4 != r3) goto L126
            r2 = 1
            goto L127
        L126:
            r2 = 0
        L127:
            boolean r3 = r10.f(r11)
            r2 = r2 | r3
            boolean r3 = r10.f(r13)
            r2 = r2 | r3
            boolean r3 = r10.f(r15)
            r2 = r2 | r3
            boolean r3 = r10.f(r5)
            r2 = r2 | r3
            boolean r3 = r10.f(r6)
            r2 = r2 | r3
            boolean r3 = r10.f(r7)
            r2 = r2 | r3
            java.lang.Object r3 = r10.P()
            if (r2 != 0) goto L14d
            if (r3 != r8) goto L14f
        L14d:
            r2 = r0
            goto L159
        L14f:
            r2 = r6
            r6 = r1
            r1 = r2
            r2 = r11
            r4 = r15
            r11 = r0
            r0 = r3
            r3 = r13
            r13 = r8
            goto L170
        L159:
            eb.m r0 = new eb.m
            r3 = r8
            r8 = 11
            r4 = r11
            r11 = r2
            r2 = r4
            r4 = r13
            r13 = r3
            r3 = r4
            r4 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r37 = r6
            r6 = r1
            r1 = r37
            r10.k0(r0)
        L170:
            fg.l r0 = (fg.l) r0
            i0.r.d(r6, r11, r0, r10)
            java.lang.Object r0 = r7.getValue()
            android.media.MediaPlayer r0 = (android.media.MediaPlayer) r0
            java.lang.Object r8 = r4.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            r8.getClass()
            java.lang.Object r11 = r3.getValue()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            r11.getClass()
            boolean r15 = r10.f(r3)
            boolean r16 = r10.f(r4)
            r15 = r15 | r16
            boolean r16 = r10.f(r7)
            r15 = r15 | r16
            boolean r16 = r10.f(r5)
            r15 = r15 | r16
            boolean r16 = r10.f(r2)
            r15 = r15 | r16
            r21 = r2
            java.lang.Object r2 = r10.P()
            if (r15 != 0) goto L1b9
            if (r2 != r13) goto L1b4
            goto L1b9
        L1b4:
            r20 = r5
            r5 = r21
            goto L1cf
        L1b9:
            i.e r16 = new i.e
            r22 = 0
            r17 = r3
            r18 = r4
            r20 = r5
            r19 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r2 = r16
            r5 = r21
            r10.k0(r2)
        L1cf:
            fg.p r2 = (fg.p) r2
            i0.r.h(r0, r8, r11, r2, r10)
            if (r9 == 0) goto L1db
            java.lang.String r26 = "正在准备预览..."
        L1d8:
            r8 = r26
            goto L213
        L1db:
            boolean r0 = og.m.t0(r14)
            if (r0 != 0) goto L1e3
            r8 = r14
            goto L213
        L1e3:
            java.lang.Object r0 = r1.getValue()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = og.m.t0(r0)
            if (r0 != 0) goto L1f8
            java.lang.Object r0 = r1.getValue()
            r26 = r0
            java.lang.String r26 = (java.lang.String) r26
            goto L1d8
        L1f8:
            if (r6 == 0) goto L210
            boolean r0 = og.m.t0(r6)
            if (r0 == 0) goto L201
            goto L210
        L201:
            java.lang.Object r0 = r3.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L1d8
            java.lang.String r26 = "正在加载播放器..."
            goto L1d8
        L210:
            java.lang.String r26 = "点击预览后可播放、暂停和跳转"
            goto L1d8
        L213:
            y0.l r0 = y0.l.f21818a
            r2 = 1065353216(0x3f800000, float:1.0)
            y0.o r11 = p.h1.d(r0, r2)
            r15 = 12
            float r2 = (float) r15
            v.d r15 = v.e.a(r2)
            y0.o r11 = c1.h.b(r11, r15)
            i0.m2 r15 = bi.d.f892a
            java.lang.Object r17 = r10.j(r15)
            bi.b r17 = (bi.b) r17
            r33 = r8
            long r8 = r17.k()
            f1.m0 r6 = f1.c0.f3038b
            y0.o r8 = k.n.g(r11, r8, r6)
            r9 = 10
            float r9 = (float) r9
            y0.o r2 = p.d.m(r8, r2, r9)
            y0.g r8 = y0.b.f21792g
            r11 = 0
            v1.n0 r8 = p.o.d(r8, r11)
            long r11 = r10.T
            int r11 = java.lang.Long.hashCode(r11)
            s0.h r12 = r10.l()
            y0.o r2 = y0.a.c(r10, r2)
            x1.f r17 = x1.g.f20914f
            r17.getClass()
            r34 = r9
            x1.y r9 = x1.f.f20883b
            r10.d0()
            r17 = r11
            boolean r11 = r10.S
            if (r11 == 0) goto L26c
            r10.k(r9)
            goto L26f
        L26c:
            r10.n0()
        L26f:
            x1.e r11 = x1.f.f20886e
            i0.r.A(r11, r10, r8)
            x1.e r8 = x1.f.f20885d
            i0.r.A(r8, r10, r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r17)
            x1.e r14 = x1.f.f20887f
            i0.r.A(r14, r10, r12)
            x1.d r12 = x1.f.f20888g
            i0.r.w(r12, r10)
            r35 = r5
            x1.e r5 = x1.f.f20884c
            i0.r.A(r5, r10, r2)
            r36 = r3
            r2 = 1065353216(0x3f800000, float:1.0)
            y0.o r3 = p.h1.d(r0, r2)
            p.e r2 = p.j.f9926c
            r17 = r13
            y0.e r13 = y0.b.f21804s
            r18 = r1
            r1 = 0
            p.t r2 = p.s.a(r2, r13, r10, r1)
            r13 = r6
            r1 = r7
            long r6 = r10.T
            int r6 = java.lang.Long.hashCode(r6)
            s0.h r7 = r10.l()
            y0.o r3 = y0.a.c(r10, r3)
            r10.d0()
            r19 = r1
            boolean r1 = r10.S
            if (r1 == 0) goto L2c0
            r10.k(r9)
            goto L2c3
        L2c0:
            r10.n0()
        L2c3:
            i0.r.A(r11, r10, r2)
            i0.r.A(r8, r10, r7)
            j8.b.p(r6, r10, r14, r10, r12)
            i0.r.A(r5, r10, r3)
            r2 = 1065353216(0x3f800000, float:1.0)
            y0.o r1 = p.h1.d(r0, r2)
            y0.f r3 = y0.b.f21802q
            p.c r6 = p.j.f9924a
            r7 = 48
            p.e1 r3 = p.d1.a(r6, r3, r10, r7)
            long r6 = r10.T
            int r6 = java.lang.Long.hashCode(r6)
            s0.h r7 = r10.l()
            y0.o r1 = y0.a.c(r10, r1)
            r10.d0()
            boolean r2 = r10.S
            if (r2 == 0) goto L2f8
            r10.k(r9)
            goto L2fb
        L2f8:
            r10.n0()
        L2fb:
            i0.r.A(r11, r10, r3)
            i0.r.A(r8, r10, r7)
            j8.b.p(r6, r10, r14, r10, r12)
            i0.r.A(r5, r10, r1)
            r1 = 38
            float r1 = (float) r1
            y0.o r1 = p.h1.j(r0, r1)
            r2 = 19
            float r2 = (float) r2
            v.d r2 = v.e.a(r2)
            y0.o r1 = c1.h.b(r1, r2)
            java.lang.Object r2 = r36.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L33a
            r2 = -233430834(0xfffffffff21620ce, float:-2.9735942E30)
            r10.a0(r2)
            java.lang.Object r2 = r10.j(r15)
            bi.b r2 = (bi.b) r2
            long r2 = r2.j()
            r6 = 0
            r10.p(r6)
            goto L355
        L33a:
            r6 = 0
            r2 = -233323016(0xfffffffff217c5f8, float:-3.0061802E30)
            r10.a0(r2)
            java.lang.Object r2 = r10.j(r15)
            bi.b r2 = (bi.b) r2
            long r2 = r2.g()
            r7 = 1034147594(0x3da3d70a, float:0.08)
            long r2 = f1.w.b(r2, r7)
            r10.p(r6)
        L355:
            y0.o r26 = k.n.g(r1, r2, r13)
            java.lang.Object r1 = r36.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r27 = r1.booleanValue()
            r7 = r19
            boolean r1 = r10.f(r7)
            boolean r2 = r10.f(r4)
            r1 = r1 | r2
            r6 = r18
            boolean r2 = r10.f(r6)
            r1 = r1 | r2
            java.lang.Object r2 = r10.P()
            r13 = r17
            if (r1 != 0) goto L37f
            if (r2 != r13) goto L388
        L37f:
            c9.w0 r2 = new c9.w0
            r1 = 6
            r2.<init>(r7, r4, r6, r1)
            r10.k0(r2)
        L388:
            r30 = r2
            fg.a r30 = (fg.a) r30
            r31 = 14
            r28 = 0
            r29 = 0
            y0.o r1 = k.n.j(r26, r27, r28, r29, r30, r31)
            y0.g r2 = y0.b.f21796k
            r6 = 0
            v1.n0 r2 = p.o.d(r2, r6)
            r18 = r4
            long r3 = r10.T
            int r3 = java.lang.Long.hashCode(r3)
            s0.h r4 = r10.l()
            y0.o r1 = y0.a.c(r10, r1)
            r10.d0()
            boolean r6 = r10.S
            if (r6 == 0) goto L3b8
            r10.k(r9)
            goto L3bb
        L3b8:
            r10.n0()
        L3bb:
            i0.r.A(r11, r10, r2)
            i0.r.A(r8, r10, r4)
            j8.b.p(r3, r10, r14, r10, r12)
            i0.r.A(r5, r10, r1)
            java.lang.Object r1 = r18.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L3d6
            java.lang.String r1 = "Ⅱ"
            goto L3d8
        L3d6:
            java.lang.String r1 = "▶"
        L3d8:
            java.lang.Object r2 = r36.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L3f1
            r2 = -313335475(0xffffffffed52e14d, float:-4.079014E27)
            r10.a0(r2)
            r6 = 0
            r10.p(r6)
            long r2 = f1.w.f3127c
            goto L405
        L3f1:
            r6 = 0
            r2 = -313334369(0xffffffffed52e59f, float:-4.0793404E27)
            r10.a0(r2)
            java.lang.Object r2 = r10.j(r15)
            bi.b r2 = (bi.b) r2
            long r2 = r2.h()
            r10.p(r6)
        L405:
            long r4 = x6.d.D(r23)
            r8 = 12
            m2.k r16 = m2.k.f8700l
            t2.k r9 = new t2.k
            r11 = 3
            r9.<init>(r11)
            r31 = 0
            r32 = 261034(0x3fbaa, float:3.65787E-40)
            r11 = 0
            r17 = 0
            r18 = 0
            r21 = 0
            r23 = 0
            r12 = 1
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r30 = 1597440(0x186000, float:2.23849E-39)
            r29 = r9
            r9 = r8
            r8 = r15
            r14 = r4
            r5 = r20
            r20 = r29
            r29 = r10
            r10 = r1
            r1 = r13
            r37 = r2
            r2 = r12
            r12 = r37
            sh.s.n(r10, r11, r12, r14, r16, r17, r18, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r4 = r29
            r4.p(r2)
            java.lang.Object r3 = r5.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.String r3 = J1(r3)
            java.lang.Object r10 = r35.getValue()
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            java.lang.String r10 = J1(r10)
            java.lang.String r11 = " / "
            java.lang.String r10 = wb.en.h(r3, r11, r10)
            java.lang.Object r3 = r4.j(r8)
            bi.b r3 = (bi.b) r3
            long r12 = r3.g()
            r3 = 13
            long r20 = x6.d.D(r3)
            m2.k r3 = m2.k.f8698j
            r18 = 0
            r19 = 14
            r16 = 0
            r17 = 0
            r14 = r0
            r15 = r34
            y0.o r11 = p.d.p(r14, r15, r16, r17, r18, r19)
            r32 = 262056(0x3ffa8, float:3.67219E-40)
            r17 = 0
            r18 = 0
            r14 = r20
            r20 = 0
            r21 = 0
            r30 = 1597488(0x186030, float:2.238557E-39)
            r16 = r3
            sh.s.n(r10, r11, r12, r14, r16, r17, r18, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            java.lang.Object r0 = r36.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            boolean r3 = r4.f(r7)
            r13 = r36
            boolean r10 = r4.f(r13)
            r3 = r3 | r10
            r11 = r35
            boolean r10 = r4.f(r11)
            r3 = r3 | r10
            boolean r10 = r4.f(r5)
            r3 = r3 | r10
            java.lang.Object r10 = r4.P()
            if (r3 != 0) goto L4cd
            if (r10 != r1) goto L4cb
            goto L4cd
        L4cb:
            r12 = r5
            goto L4e3
        L4cd:
            wb.af r16 = new wb.af
            r21 = 1
            r20 = r5
            r17 = r7
            r19 = r11
            r18 = r13
            r16.<init>(r17, r18, r19, r20, r21)
            r10 = r16
            r12 = r20
            r4.k0(r10)
        L4e3:
            r3 = r10
            fg.a r3 = (fg.a) r3
            r5 = 3078(0xc06, float:4.313E-42)
            r24 = r2
            r2 = r0
            wb.y2 r0 = wb.y2.f20291p
            r17 = r1
            java.lang.String r1 = "-5"
            r14 = r17
            r15 = r24
            r10 = 1065353216(0x3f800000, float:1.0)
            r0.K(r1, r2, r3, r4, r5)
            java.lang.Object r1 = r13.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r2 = r1.booleanValue()
            boolean r1 = r4.f(r7)
            boolean r3 = r4.f(r13)
            r1 = r1 | r3
            boolean r3 = r4.f(r11)
            r1 = r1 | r3
            boolean r3 = r4.f(r12)
            r1 = r1 | r3
            java.lang.Object r3 = r4.P()
            if (r1 != 0) goto L525
            if (r3 != r14) goto L520
            goto L525
        L520:
            r20 = r12
            r36 = r13
            goto L53b
        L525:
            wb.af r16 = new wb.af
            r21 = 2
            r17 = r7
            r19 = r11
            r20 = r12
            r18 = r13
            r16.<init>(r17, r18, r19, r20, r21)
            r3 = r16
            r36 = r18
            r4.k0(r3)
        L53b:
            fg.a r3 = (fg.a) r3
            r5 = 3078(0xc06, float:4.313E-42)
            java.lang.String r1 = "+5"
            r0.K(r1, r2, r3, r4, r5)
            boolean r1 = og.m.t0(r33)
            if (r1 != 0) goto L5bc
            r1 = -231204290(0xfffffffff2381a3e, float:-3.646526E30)
            r4.a0(r1)
            java.lang.Object r1 = r4.j(r8)
            bi.b r1 = (bi.b) r1
            long r12 = r1.h()
            long r1 = x6.d.D(r9)
            double r8 = (double) r10
            r16 = 0
            int r3 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r3 <= 0) goto L566
            goto L56b
        L566:
            java.lang.String r3 = "invalid weight; must be greater than zero"
            q.a.a(r3)
        L56b:
            p.q0 r3 = new p.q0
            r3.<init>(r10, r15)
            r30 = 0
            r31 = 14
            r28 = 0
            r29 = 0
            r26 = r3
            r27 = r34
            y0.o r3 = p.d.p(r26, r27, r28, r29, r30, r31)
            t2.k r5 = new t2.k
            r8 = 6
            r5.<init>(r8)
            r31 = 0
            r32 = 261096(0x3fbe8, float:3.65873E-40)
            r16 = 0
            r17 = 0
            r18 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r30 = 24576(0x6000, float:3.4438E-41)
            r8 = r20
            r20 = r5
            r5 = r8
            r29 = r4
            r8 = r15
            r10 = r33
            r37 = r11
            r11 = r3
            r38 = r1
            r2 = r37
            r1 = r14
            r14 = r38
            sh.s.n(r10, r11, r12, r14, r16, r17, r18, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r4.p(r6)
            goto L5ca
        L5bc:
            r2 = r11
            r1 = r14
            r8 = r15
            r5 = r20
            r3 = -230853804(0xfffffffff23d7354, float:-3.7524538E30)
            r4.a0(r3)
            r4.p(r6)
        L5ca:
            r4.p(r8)
            java.lang.Object r3 = r2.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r3 <= 0) goto L5f1
            java.lang.Object r3 = r5.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            float r3 = (float) r3
            java.lang.Object r9 = r2.getValue()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            float r9 = (float) r9
            float r3 = r3 / r9
            goto L5f2
        L5f1:
            r3 = 0
        L5f2:
            java.lang.Object r9 = r36.getValue()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L60c
            java.lang.Object r9 = r2.getValue()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r9 <= 0) goto L60c
            r11 = r8
            goto L60d
        L60c:
            r11 = r6
        L60d:
            boolean r6 = r4.f(r7)
            boolean r9 = r4.f(r2)
            r6 = r6 | r9
            boolean r9 = r4.f(r5)
            r6 = r6 | r9
            java.lang.Object r9 = r4.P()
            if (r6 != 0) goto L623
            if (r9 != r1) goto L62d
        L623:
            wb.ad r9 = new wb.ad
            r1 = 10
            r9.<init>(r7, r2, r5, r1)
            r4.k0(r9)
        L62d:
            fg.l r9 = (fg.l) r9
            r5 = 3072(0xc00, float:4.305E-42)
            r1 = r3
            r3 = r9
            r2 = r11
            r0.L(r1, r2, r3, r4, r5)
            r4.p(r8)
            r4.p(r8)
            goto L642
        L63e:
            r4 = r10
            r4.V()
        L642:
            i0.r1 r7 = r4.t()
            if (r7 == 0) goto L65b
            bi.j r0 = new bi.j
            r1 = r40
            r2 = r41
            r3 = r42
            r4 = r43
            r5 = r44
            r6 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f6035d = r0
        L65b:
            return
    }

    public void r0(fb.q1 r11, java.lang.String r12, i0.h0 r13, int r14) {
            r10 = this;
            r0 = -3969818(0xffffffffffc36ce6, float:NaN)
            r13.b0(r0)
            boolean r0 = r13.f(r11)
            if (r0 == 0) goto Le
            r0 = 4
            goto Lf
        Le:
            r0 = 2
        Lf:
            r0 = r0 | r14
            boolean r1 = r13.f(r12)
            if (r1 == 0) goto L19
            r1 = 32
            goto L1b
        L19:
            r1 = 16
        L1b:
            r1 = r1 | r0
            r0 = r1 & 147(0x93, float:2.06E-43)
            r4 = 146(0x92, float:2.05E-43)
            r9 = 0
            r5 = 1
            if (r0 == r4) goto L26
            r0 = r5
            goto L27
        L26:
            r0 = r9
        L27:
            r4 = r1 & 1
            boolean r0 = r13.S(r4, r0)
            if (r0 == 0) goto L97
            java.lang.String r0 = r11.f3723c
            java.lang.String r4 = "查看代码差异"
            boolean r0 = gg.l.a(r0, r4)
            r4 = 0
            if (r0 != 0) goto L44
            java.lang.String r0 = r11.f3733m
            java.lang.String r6 = "show_diff"
            boolean r0 = og.m.h0(r0, r6, r5)
            if (r0 == 0) goto L6d
        L44:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5d
            r0.<init>(r12)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r5 = "diff"
            java.lang.String r6 = ""
            java.lang.String r0 = r0.optString(r5, r6)     // Catch: java.lang.Throwable -> L5d
            r0.getClass()     // Catch: java.lang.Throwable -> L5d
            boolean r5 = og.m.t0(r0)     // Catch: java.lang.Throwable -> L5d
            if (r5 != 0) goto L5b
            goto L64
        L5b:
            r0 = r4
            goto L64
        L5d:
            r0 = move-exception
            sf.f r5 = new sf.f
            r5.<init>(r0)
            r0 = r5
        L64:
            boolean r5 = r0 instanceof sf.f
            if (r5 == 0) goto L6a
            goto L6b
        L6a:
            r4 = r0
        L6b:
            java.lang.String r4 = (java.lang.String) r4
        L6d:
            if (r4 == 0) goto L7e
            r0 = 1994545384(0x76e258e8, float:2.2954342E33)
            r13.a0(r0)
            r0 = 48
            r10.T(r4, r13, r0)
            r13.p(r9)
            goto L9a
        L7e:
            r0 = 1994602641(0x76e33891, float:2.3042943E33)
            r13.a0(r0)
            int r0 = r1 >> 3
            r0 = r0 & 14
            r4 = r0 | 384(0x180, float:5.38E-43)
            r5 = 2
            wb.y2 r3 = wb.y2.f20284i
            r6 = 0
            r8 = r12
            r7 = r13
            r3.c(r4, r5, r6, r7, r8)
            r13.p(r9)
            goto L9a
        L97:
            r13.V()
        L9a:
            i0.r1 r6 = r13.t()
            if (r6 == 0) goto Lad
            wb.rj r0 = new wb.rj
            r5 = 20
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f6035d = r0
        Lad:
            return
    }

    public void s0(long r31, java.lang.String r33, i0.h0 r34, int r35) {
            r30 = this;
            r1 = r31
            r6 = r33
            r7 = r34
            r0 = -2053664419(0xffffffff8597915d, float:-1.425337E-35)
            r7.b0(r0)
            r0 = r35 & 6
            r3 = 4
            if (r0 != 0) goto L1d
            boolean r0 = r7.e(r1)
            if (r0 == 0) goto L19
            r0 = r3
            goto L1a
        L19:
            r0 = 2
        L1a:
            r0 = r35 | r0
            goto L1f
        L1d:
            r0 = r35
        L1f:
            r4 = r35 & 48
            if (r4 != 0) goto L2f
            boolean r4 = r7.f(r6)
            if (r4 == 0) goto L2c
            r4 = 32
            goto L2e
        L2c:
            r4 = 16
        L2e:
            r0 = r0 | r4
        L2f:
            r4 = r0 & 19
            r5 = 18
            r8 = 0
            r9 = 1
            if (r4 == r5) goto L39
            r4 = r9
            goto L3a
        L39:
            r4 = r8
        L3a:
            r5 = r0 & 1
            boolean r4 = r7.S(r5, r4)
            if (r4 == 0) goto L149
            r0 = r0 & 14
            if (r0 != r3) goto L48
            r4 = r9
            goto L49
        L48:
            r4 = r8
        L49:
            java.lang.Object r5 = r7.P()
            i0.e r10 = i0.l.f5952a
            if (r4 != 0) goto L53
            if (r5 != r10) goto L6d
        L53:
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r1
            r11 = 0
            int r13 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r13 >= 0) goto L5f
            r4 = r11
        L5f:
            r11 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r11
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            i0.j1 r5 = i0.r.u(r4)
            r7.k0(r5)
        L6d:
            i0.a1 r5 = (i0.a1) r5
            java.lang.Long r11 = java.lang.Long.valueOf(r1)
            boolean r4 = r7.f(r5)
            if (r0 != r3) goto L7a
            r8 = r9
        L7a:
            r0 = r4 | r8
            java.lang.Object r3 = r7.P()
            if (r0 != 0) goto L88
            if (r3 != r10) goto L85
            goto L88
        L85:
            r0 = r3
            r3 = r5
            goto L93
        L88:
            h0.k0 r0 = new h0.k0
            r3 = r5
            r5 = 2
            r4 = 0
            r0.<init>(r1, r3, r4, r5)
            r7.k0(r0)
        L93:
            fg.p r0 = (fg.p) r0
            i0.r.f(r0, r7, r11)
            java.lang.Object r0 = r3.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r4 = 60
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            java.lang.String r1 = "s"
            if (r0 >= 0) goto Lc4
            java.lang.Object r0 = r3.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto Lf1
        Lc4:
            java.lang.Object r0 = r3.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r8 = r0.longValue()
            long r8 = r8 / r4
            java.lang.Object r0 = r3.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            long r2 = r2 % r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            java.lang.String r4 = "m "
            r0.append(r4)
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        Lf1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Working ("
            r1.<init>(r2)
            r1.append(r0)
            r0 = 41
            r1.append(r0)
            boolean r0 = og.m.t0(r6)
            if (r0 != 0) goto L10e
            java.lang.String r0 = " · "
            r1.append(r0)
            r1.append(r6)
        L10e:
            java.lang.String r0 = r1.toString()
            i0.m2 r1 = bi.d.f892a
            java.lang.Object r1 = r7.j(r1)
            bi.b r1 = (bi.b) r1
            long r9 = r1.h()
            r1 = 13
            long r11 = x6.d.D(r1)
            m2.k r13 = m2.k.f8698j
            r28 = 0
            r29 = 262058(0x3ffaa, float:3.67221E-40)
            r8 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 1597440(0x186000, float:2.23849E-39)
            r26 = r7
            r7 = r0
            sh.s.n(r7, r8, r9, r11, r13, r14, r15, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            goto L14c
        L149:
            r34.V()
        L14c:
            i0.r1 r7 = r34.t()
            if (r7 == 0) goto L160
            wb.as r0 = new wb.as
            r1 = r30
            r2 = r31
            r5 = r35
            r4 = r6
            r0.<init>(r1, r2, r4, r5)
            r7.f6035d = r0
        L160:
            return
    }

    public void t(java.util.List r41, boolean r42, java.lang.String r43, java.lang.String r44, boolean r45, fg.a r46, fg.l r47, i0.h0 r48, int r49) {
            r40 = this;
            r3 = r42
            r4 = r43
            r5 = r44
            r6 = r45
            r8 = r47
            r0 = r48
            r41.getClass()
            r4.getClass()
            r46.getClass()
            r8.getClass()
            r1 = 364962466(0x15c0e2a2, float:7.7905746E-26)
            r0.b0(r1)
            r2 = r41
            boolean r1 = r0.f(r2)
            if (r1 == 0) goto L28
            r1 = 4
            goto L29
        L28:
            r1 = 2
        L29:
            r1 = r49 | r1
            boolean r7 = r0.g(r3)
            if (r7 == 0) goto L34
            r7 = 32
            goto L36
        L34:
            r7 = 16
        L36:
            r1 = r1 | r7
            boolean r7 = r0.f(r4)
            if (r7 == 0) goto L40
            r7 = 256(0x100, float:3.59E-43)
            goto L42
        L40:
            r7 = 128(0x80, float:1.8E-43)
        L42:
            r1 = r1 | r7
            boolean r7 = r0.f(r5)
            if (r7 == 0) goto L4c
            r7 = 2048(0x800, float:2.87E-42)
            goto L4e
        L4c:
            r7 = 1024(0x400, float:1.435E-42)
        L4e:
            r1 = r1 | r7
            boolean r7 = r0.g(r6)
            if (r7 == 0) goto L58
            r7 = 16384(0x4000, float:2.2959E-41)
            goto L5a
        L58:
            r7 = 8192(0x2000, float:1.148E-41)
        L5a:
            r1 = r1 | r7
            r7 = r46
            boolean r9 = r0.h(r7)
            if (r9 == 0) goto L66
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L68
        L66:
            r9 = 65536(0x10000, float:9.1835E-41)
        L68:
            r1 = r1 | r9
            boolean r9 = r0.h(r8)
            r10 = 1048576(0x100000, float:1.469368E-39)
            if (r9 == 0) goto L73
            r9 = r10
            goto L75
        L73:
            r9 = 524288(0x80000, float:7.34684E-40)
        L75:
            r1 = r1 | r9
            r9 = 599187(0x92493, float:8.3964E-40)
            r9 = r9 & r1
            r11 = 599186(0x92492, float:8.39638E-40)
            r12 = 1
            r13 = 0
            if (r9 == r11) goto L83
            r9 = r12
            goto L84
        L83:
            r9 = r13
        L84:
            r11 = r1 & 1
            boolean r9 = r0.S(r11, r9)
            if (r9 == 0) goto L40d
            i0.m2 r9 = bi.d.f892a
            java.lang.Object r9 = r0.j(r9)
            bi.b r9 = (bi.b) r9
            long r14 = r9.h()
            r32 = 12
            r9 = r12
            r11 = r14
            r15 = r13
            long r13 = x6.d.D(r32)
            r15 = 14
            float r9 = (float) r15
            r21 = 0
            r22 = 13
            y0.l r24 = y0.l.f21818a
            r18 = 0
            r20 = 0
            r19 = r9
            r17 = r24
            y0.o r9 = p.d.p(r17, r18, r19, r20, r21, r22)
            r33 = r17
            r30 = 0
            r31 = 262120(0x3ffe8, float:3.67308E-40)
            r17 = r10
            r10 = r9
            java.lang.String r9 = "历史版本"
            r18 = r15
            r15 = 0
            r19 = 0
            r16 = 0
            r21 = r17
            r20 = r18
            r17 = 0
            r22 = r19
            r19 = 0
            r24 = r20
            r25 = r21
            r20 = 0
            r26 = r22
            r22 = 0
            r27 = 1
            r23 = 0
            r28 = r24
            r24 = 0
            r29 = r25
            r25 = 0
            r34 = r26
            r26 = 0
            r35 = r27
            r27 = 0
            r36 = r29
            r29 = 24630(0x6036, float:3.4514E-41)
            r38 = r28
            r28 = r0
            r0 = r34
            r34 = r38
            sh.s.n(r9, r10, r11, r13, r15, r16, r17, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r9 = r28
            r10 = 6
            if (r3 == 0) goto L115
            r1 = -1458371942(0xffffffffa913029a, float:-3.2642813E-14)
            r9.a0(r1)
            java.lang.String r1 = "正在加载历史版本..."
            wb.ho.s0(r1, r9, r10)
            r9.p(r0)
            goto L411
        L115:
            boolean r11 = og.m.t0(r4)
            r12 = 1065353216(0x3f800000, float:1.0)
            if (r11 != 0) goto L153
            r10 = 2035176954(0x794e55fa, float:6.695981E34)
            r9.a0(r10)
            int r10 = r1 >> 6
            r10 = r10 & 14
            wb.ho.s0(r4, r9, r10)
            r11 = r33
            y0.o r11 = p.h1.d(r11, r12)
            sh.q1 r16 = sh.c.a(r9)
            int r1 = r1 >> 12
            r1 = r1 & 112(0x70, float:1.57E-43)
            r1 = r1 | 390(0x186, float:5.47E-43)
            r20 = 1912(0x778, float:2.679E-42)
            java.lang.String r9 = "重新加载"
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = r48
            r19 = r1
            r10 = r7
            sh.s.o(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r9 = r18
            r9.p(r0)
            goto L411
        L153:
            r11 = r33
            boolean r7 = r2.isEmpty()
            if (r7 == 0) goto L16b
            r1 = -1458359531(0xffffffffa9133315, float:-3.2684864E-14)
            r9.a0(r1)
            java.lang.String r1 = "暂无历史版本"
            wb.ho.s0(r1, r9, r10)
            r9.p(r0)
            goto L411
        L16b:
            r7 = 2035603390(0x7954d7be, float:6.907142E34)
            r9.a0(r7)
            java.util.Iterator r7 = r2.iterator()
            r13 = r0
        L176:
            boolean r14 = r7.hasNext()
            if (r14 == 0) goto L408
            java.lang.Object r14 = r7.next()
            int r33 = r13 + 1
            if (r13 < 0) goto L403
            gb.h r14 = (gb.h) r14
            if (r13 <= 0) goto L196
            r15 = -816491241(0xffffffffcf555517, float:-3.5791235E9)
            r9.a0(r15)
            float r15 = (float) r0
            wb.ho.D1(r15, r9, r10, r0)
        L192:
            r9.p(r0)
            goto L19d
        L196:
            r15 = 458600293(0x1b55af65, float:1.767562E-22)
            r9.a0(r15)
            goto L192
        L19d:
            y0.o r15 = p.h1.d(r11, r12)
            r10 = 8
            float r10 = (float) r10
            r0 = 0
            r12 = 1
            y0.o r0 = p.d.n(r15, r0, r10, r12)
            y0.f r10 = y0.b.f21802q
            p.c r12 = p.j.f9924a
            r15 = 48
            p.e1 r10 = p.d1.a(r12, r10, r9, r15)
            r36 = r1
            long r1 = r9.T
            int r1 = java.lang.Long.hashCode(r1)
            s0.h r2 = r9.l()
            y0.o r0 = y0.a.c(r9, r0)
            x1.f r12 = x1.g.f20914f
            r12.getClass()
            x1.y r12 = x1.f.f20883b
            r9.d0()
            boolean r15 = r9.S
            if (r15 == 0) goto L1d6
            r9.k(r12)
            goto L1d9
        L1d6:
            r9.n0()
        L1d9:
            x1.e r15 = x1.f.f20886e
            i0.r.A(r15, r9, r10)
            x1.e r10 = x1.f.f20885d
            i0.r.A(r10, r9, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            x1.e r2 = x1.f.f20887f
            i0.r.A(r2, r9, r1)
            x1.d r1 = x1.f.f20888g
            i0.r.w(r1, r9)
            x1.e r3 = x1.f.f20884c
            i0.r.A(r3, r9, r0)
            r37 = r7
            r0 = 1065353216(0x3f800000, float:1.0)
            double r6 = (double) r0
            r17 = 0
            int r6 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r6 <= 0) goto L202
            goto L207
        L202:
            java.lang.String r6 = "invalid weight; must be greater than zero"
            q.a.a(r6)
        L207:
            p.q0 r6 = new p.q0
            r7 = 1
            r6.<init>(r0, r7)
            p.e r7 = p.j.f9926c
            y0.e r0 = y0.b.f21804s
            r4 = 0
            p.t r0 = p.s.a(r7, r0, r9, r4)
            long r7 = r9.T
            int r4 = java.lang.Long.hashCode(r7)
            s0.h r7 = r9.l()
            y0.o r6 = y0.a.c(r9, r6)
            r9.d0()
            boolean r8 = r9.S
            if (r8 == 0) goto L22f
            r9.k(r12)
            goto L232
        L22f:
            r9.n0()
        L232:
            i0.r.A(r15, r9, r0)
            i0.r.A(r10, r9, r7)
            j8.b.p(r4, r9, r2, r9, r1)
            i0.r.A(r3, r9, r6)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r14.f4428b
            boolean r2 = og.m.t0(r1)
            if (r2 == 0) goto L24d
            java.lang.String r1 = "未命名版本"
        L24d:
            r0.append(r1)
            if (r13 != 0) goto L257
            java.lang.String r1 = "（最新）"
            r0.append(r1)
        L257:
            java.lang.String r0 = r0.toString()
            i0.m2 r1 = bi.d.f892a
            java.lang.Object r2 = r9.j(r1)
            bi.b r2 = (bi.b) r2
            long r2 = r2.g()
            r4 = 13
            long r6 = x6.d.D(r4)
            m2.k r15 = m2.k.f8698j
            r30 = 0
            r31 = 262058(0x3ffaa, float:3.67221E-40)
            r10 = 0
            r4 = 6
            r16 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r17 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 1597440(0x186000, float:2.23849E-39)
            r38 = r2
            r2 = r11
            r11 = r38
            r28 = r9
            r9 = r0
            r0 = r14
            r13 = r6
            sh.s.n(r9, r10, r11, r13, r15, r16, r17, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r9 = r28
            java.lang.String r3 = r0.f4431e
            java.lang.String r3 = wb.ho.A4(r3)
            long r6 = r0.f4430d
            r10 = 1048576(0x100000, double:5.180654E-318)
            int r10 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r10 < 0) goto L2c7
            java.util.Locale r10 = java.util.Locale.US
            double r6 = (double) r6
            r11 = 4697254411347427328(0x4130000000000000, double:1048576.0)
            double r6 = r6 / r11
            java.lang.Double r6 = java.lang.Double.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            r7 = 1
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r7)
            java.lang.String r7 = "%.1f MiB"
            java.lang.String r6 = java.lang.String.format(r10, r7, r6)
            goto L2f8
        L2c7:
            r10 = 1024(0x400, double:5.06E-321)
            int r10 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r10 < 0) goto L2e7
            java.util.Locale r10 = java.util.Locale.US
            double r6 = (double) r6
            r11 = 4652218415073722368(0x4090000000000000, double:1024.0)
            double r6 = r6 / r11
            java.lang.Double r6 = java.lang.Double.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            r7 = 1
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r7)
            java.lang.String r7 = "%.1f KiB"
            java.lang.String r6 = java.lang.String.format(r10, r7, r6)
            goto L2f8
        L2e7:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            java.lang.String r6 = " B"
            r10.append(r6)
            java.lang.String r6 = r10.toString()
        L2f8:
            java.lang.String r7 = " · "
            java.lang.String r3 = wb.en.h(r3, r7, r6)
            java.lang.Object r6 = r9.j(r1)
            bi.b r6 = (bi.b) r6
            long r11 = r6.h()
            r6 = 11
            long r13 = x6.d.D(r6)
            r30 = 24960(0x6180, float:3.4976E-41)
            r31 = 241642(0x3afea, float:3.38613E-40)
            r10 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r22 = 2
            r23 = 0
            r24 = 1
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 24576(0x6000, float:3.4438E-41)
            r28 = r9
            r9 = r3
            sh.s.n(r9, r10, r11, r13, r15, r16, r17, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r9 = r28
            java.lang.String r3 = r0.f4432f
            boolean r6 = og.m.t0(r3)
            if (r6 == 0) goto L33d
            java.lang.String r3 = "暂无更新说明"
        L33d:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "更新说明："
            r6.<init>(r7)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            java.lang.Object r1 = r9.j(r1)
            bi.b r1 = (bi.b) r1
            long r11 = r1.h()
            long r13 = x6.d.D(r32)
            r1 = 3
            float r1 = (float) r1
            r28 = 0
            r29 = 13
            r25 = 0
            r27 = 0
            r26 = r1
            r24 = r2
            y0.o r10 = p.d.p(r24, r25, r26, r27, r28, r29)
            r30 = 0
            r31 = 262120(0x3ffe8, float:3.67308E-40)
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 24624(0x6030, float:3.4506E-41)
            r28 = r9
            r9 = r3
            sh.s.n(r9, r10, r11, r13, r15, r16, r17, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r9 = r28
            r7 = 1
            r9.p(r7)
            java.lang.String r1 = r0.f4427a
            boolean r1 = gg.l.a(r5, r1)
            if (r1 == 0) goto L39e
            java.lang.String r1 = "读取中"
            goto L3a0
        L39e:
            java.lang.String r1 = "安装"
        L3a0:
            r3 = 3670016(0x380000, float:5.142788E-39)
            r3 = r36 & r3
            r6 = 1048576(0x100000, float:1.469368E-39)
            if (r3 != r6) goto L3aa
            r12 = 1
            goto L3ab
        L3aa:
            r12 = 0
        L3ab:
            boolean r3 = r9.h(r0)
            r3 = r3 | r12
            java.lang.Object r7 = r9.P()
            if (r3 != 0) goto L3be
            i0.e r3 = i0.l.f5952a
            if (r7 != r3) goto L3bb
            goto L3be
        L3bb:
            r10 = r47
            goto L3c9
        L3be:
            wb.xi r7 = new wb.xi
            r3 = 7
            r10 = r47
            r7.<init>(r10, r3, r0)
            r9.k0(r7)
        L3c9:
            fg.a r7 = (fg.a) r7
            if (r45 == 0) goto L3d1
            if (r5 != 0) goto L3d1
            r12 = 1
            goto L3d2
        L3d1:
            r12 = 0
        L3d2:
            sh.q1 r16 = sh.c.a(r9)
            r19 = 0
            r20 = 1908(0x774, float:2.674E-42)
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r10 = r7
            r18 = r9
            r9 = r1
            sh.s.o(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r9 = r18
            r7 = 1
            r9.p(r7)
            r3 = r42
            r6 = r45
            r11 = r2
            r10 = r4
            r12 = r8
            r13 = r33
            r1 = r36
            r7 = r37
            r0 = 0
            r2 = r41
            r4 = r43
            r8 = r47
            goto L176
        L403:
            a.a.Q0()
            r0 = 0
            throw r0
        L408:
            r15 = r0
            r9.p(r15)
            goto L411
        L40d:
            r9 = r0
            r9.V()
        L411:
            i0.r1 r10 = r9.t()
            if (r10 == 0) goto L42e
            wb.ai r0 = new wb.ai
            r1 = r40
            r2 = r41
            r3 = r42
            r4 = r43
            r6 = r45
            r7 = r46
            r8 = r47
            r9 = r49
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.f6035d = r0
        L42e:
            return
    }

    public void t0(y0.o r18, i0.h0 r19, int r20) {
            r17 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = 1311403979(0x4e2a6fcb, float:7.148633E8)
            r1.b0(r3)
            r3 = r2 & 3
            r4 = 2
            r5 = 0
            if (r3 == r4) goto L14
            r3 = 1
            goto L15
        L14:
            r3 = r5
        L15:
            r6 = r2 & 1
            boolean r3 = r1.S(r6, r3)
            if (r3 == 0) goto Le0
            java.lang.Object r3 = r1.P()
            i0.e r6 = i0.l.f5952a
            if (r3 != r6) goto L2d
            i.g0 r3 = new i.g0
            r3.<init>()
            r1.k0(r3)
        L2d:
            i.g0 r3 = (i.g0) r3
            r3.a(r1, r5)
            i0.m2 r7 = bi.d.f892a
            java.lang.Object r7 = r1.j(r7)
            bi.b r7 = (bi.b) r7
            long r7 = r7.j()
            r9 = 900(0x384, float:1.261E-42)
            g1.d r10 = i.x.f5829b
            i.l1 r4 = i.d.p(r9, r4, r10)
            long r9 = (long) r5
            i.c0 r15 = new i.c0
            i.p0 r11 = i.p0.f5746g
            r15.<init>(r4, r11, r9)
            r4 = 0
            java.lang.Float r12 = java.lang.Float.valueOf(r4)
            r4 = 1135869952(0x43b40000, float:360.0)
            java.lang.Float r14 = java.lang.Float.valueOf(r4)
            java.lang.Object r4 = r1.P()
            if (r4 != r6) goto L67
            i.d0 r4 = new i.d0
            r4.<init>(r3, r12, r14, r15)
            r1.k0(r4)
        L67:
            r13 = r4
            i.d0 r13 = (i.d0) r13
            boolean r4 = r1.h(r15)
            java.lang.Object r9 = r1.P()
            if (r4 != 0) goto L76
            if (r9 != r6) goto L81
        L76:
            c9.n0 r11 = new c9.n0
            r16 = 5
            r11.<init>(r12, r13, r14, r15, r16)
            r1.k0(r11)
            r9 = r11
        L81:
            fg.a r9 = (fg.a) r9
            i0.r.j(r9, r1)
            boolean r4 = r1.h(r3)
            java.lang.Object r9 = r1.P()
            if (r4 != 0) goto L92
            if (r9 != r6) goto L9c
        L92:
            c9.i r9 = new c9.i
            r4 = 14
            r9.<init>(r3, r4, r13)
            r1.k0(r9)
        L9c:
            fg.l r9 = (fg.l) r9
            i0.r.c(r13, r9, r1)
            r3 = 18
            float r3 = (float) r3
            y0.o r3 = p.h1.j(r0, r3)
            boolean r4 = r1.f(r13)
            java.lang.Object r9 = r1.P()
            if (r4 != 0) goto Lb4
            if (r9 != r6) goto Lbe
        Lb4:
            sh.y0 r9 = new sh.y0
            r4 = 10
            r9.<init>(r13, r4)
            r1.k0(r9)
        Lbe:
            fg.l r9 = (fg.l) r9
            y0.o r3 = f1.c0.m(r3, r9)
            boolean r4 = r1.e(r7)
            java.lang.Object r9 = r1.P()
            if (r4 != 0) goto Ld0
            if (r9 != r6) goto Lda
        Ld0:
            ca.c r9 = new ca.c
            r4 = 20
            r9.<init>(r7, r4)
            r1.k0(r9)
        Lda:
            fg.l r9 = (fg.l) r9
            k.n.a(r3, r9, r1, r5)
            goto Le3
        Le0:
            r1.V()
        Le3:
            i0.r1 r1 = r1.t()
            if (r1 == 0) goto Lf4
            wb.zi r3 = new wb.zi
            r4 = 7
            r5 = r17
            r3.<init>(r5, r0, r2, r4)
            r1.f6035d = r3
            return
        Lf4:
            r5 = r17
            return
    }

    public void u(java.util.List r31, java.lang.String r32, fg.l r33, i0.h0 r34, int r35) {
            r30 = this;
            r2 = r31
            r3 = r32
            r4 = r33
            r9 = r34
            r0 = -165250136(0xfffffffff6267ba8, float:-8.441693E32)
            r9.b0(r0)
            boolean r0 = r9.f(r2)
            r1 = 4
            if (r0 == 0) goto L17
            r0 = r1
            goto L18
        L17:
            r0 = 2
        L18:
            r0 = r35 | r0
            boolean r5 = r9.f(r3)
            r6 = 32
            if (r5 == 0) goto L24
            r5 = r6
            goto L26
        L24:
            r5 = 16
        L26:
            r0 = r0 | r5
            boolean r5 = r9.h(r4)
            r7 = 256(0x100, float:3.59E-43)
            if (r5 == 0) goto L31
            r5 = r7
            goto L33
        L31:
            r5 = 128(0x80, float:1.8E-43)
        L33:
            r0 = r0 | r5
            r5 = r0 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            r10 = 0
            r11 = 1
            if (r5 == r8) goto L3e
            r5 = r11
            goto L3f
        L3e:
            r5 = r10
        L3f:
            r8 = r0 & 1
            boolean r5 = r9.S(r8, r5)
            if (r5 == 0) goto L11e
            boolean r5 = r2.isEmpty()
            y0.l r12 = y0.l.f21818a
            r8 = 8
            if (r5 == 0) goto Lba
            r0 = -934151832(0xffffffffc851f968, float:-215013.62)
            r9.a0(r0)
            i0.m2 r0 = bi.d.f892a
            java.lang.Object r0 = r9.j(r0)
            bi.b r0 = (bi.b) r0
            long r0 = r0.h()
            r5 = 12
            long r5 = x6.d.D(r5)
            r7 = 6
            float r13 = (float) r7
            float r7 = (float) r8
            r17 = 6
            r14 = 0
            r15 = 0
            r16 = r7
            y0.o r7 = p.d.p(r12, r13, r14, r15, r16, r17)
            r26 = 0
            r27 = 262120(0x3ffe8, float:3.67308E-40)
            r28 = r5
            r6 = r10
            r9 = r28
            java.lang.String r5 = "没有好友标签"
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r25 = 24630(0x6036, float:3.4514E-41)
            r28 = r0
            r0 = r6
            r6 = r7
            r7 = r28
            r24 = r34
            sh.s.n(r5, r6, r7, r9, r11, r12, r13, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r9 = r24
            r9.p(r0)
            i0.r1 r7 = r9.t()
            if (r7 == 0) goto L139
            wb.dv r0 = new wb.dv
            r6 = 0
            r1 = r30
            r5 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6)
        Lb7:
            r7.f6035d = r0
            return
        Lba:
            r13 = r12
            r12 = r2
            r2 = r13
            r13 = r3
            r14 = r4
            r3 = r10
            r4 = -933888518(0xffffffffc855fdfa, float:-219127.9)
            r9.a0(r4)
            r9.p(r3)
            r4 = 1065353216(0x3f800000, float:1.0)
            y0.o r15 = p.h1.d(r2, r4)
            float r2 = (float) r8
            r20 = 7
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = r2
            y0.o r2 = p.d.p(r15, r16, r17, r18, r19, r20)
            p.h r4 = p.j.g(r19)
            r5 = r0 & 14
            if (r5 == r1) goto Le8
            r10 = r3
            goto Le9
        Le8:
            r10 = r11
        Le9:
            r1 = r0 & 112(0x70, float:1.57E-43)
            if (r1 != r6) goto Lef
            r1 = r11
            goto Lf0
        Lef:
            r1 = r3
        Lf0:
            r1 = r1 | r10
            r0 = r0 & 896(0x380, float:1.256E-42)
            if (r0 != r7) goto Lf7
            r10 = r11
            goto Lf8
        Lf7:
            r10 = r3
        Lf8:
            r0 = r1 | r10
            java.lang.Object r1 = r9.P()
            if (r0 != 0) goto L104
            i0.e r0 = i0.l.f5952a
            if (r1 != r0) goto L10d
        L104:
            c9.y0 r1 = new c9.y0
            r0 = 2
            r1.<init>(r12, r13, r14, r0)
            r9.k0(r1)
        L10d:
            r8 = r1
            fg.l r8 = (fg.l) r8
            r10 = 24582(0x6006, float:3.4447E-41)
            r1 = 0
            r0 = r2
            r2 = 0
            r3 = r4
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            a.a.c(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L124
        L11e:
            r12 = r2
            r13 = r3
            r14 = r4
            r34.V()
        L124:
            i0.r1 r7 = r34.t()
            if (r7 == 0) goto L139
            wb.dv r0 = new wb.dv
            r6 = 1
            r1 = r30
            r5 = r35
            r2 = r12
            r3 = r13
            r4 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            goto Lb7
        L139:
            return
    }

    public void u0(android.content.Context r238, wb.k6 r239, ia.n r240, i0.h0 r241, int r242) {
            r237 = this;
            r1 = r238
            r9 = r240
            r10 = r241
            r11 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r2 = 129672856(0x7baa698, float:2.8084085E-34)
            r10.b0(r2)
            boolean r2 = r10.h(r1)
            if (r2 == 0) goto L19
            r2 = 4
            goto L1a
        L19:
            r2 = 2
        L1a:
            r2 = r242 | r2
            r3 = r239
            boolean r4 = r10.h(r3)
            if (r4 == 0) goto L27
            r4 = 32
            goto L29
        L27:
            r4 = 16
        L29:
            r2 = r2 | r4
            boolean r4 = r10.h(r9)
            if (r4 == 0) goto L33
            r4 = 256(0x100, float:3.59E-43)
            goto L35
        L33:
            r4 = 128(0x80, float:1.8E-43)
        L35:
            r15 = r2 | r4
            r2 = r15 & 1171(0x493, float:1.641E-42)
            r4 = 1170(0x492, float:1.64E-42)
            if (r2 == r4) goto L3f
            r2 = 1
            goto L40
        L3f:
            r2 = r11
        L40:
            r4 = r15 & 1
            boolean r2 = r10.S(r4, r2)
            if (r2 == 0) goto L283b
            boolean r2 = r10.f(r1)
            java.lang.Object r4 = r10.P()
            i0.e r6 = i0.l.f5952a
            if (r2 != 0) goto L56
            if (r4 != r6) goto L66
        L56:
            wb.yt r2 = wb.vt.a(r1)
            if (r2 == 0) goto L5e
        L5c:
            r4 = r2
            goto L63
        L5e:
            wb.yt r2 = wb.vt.b()
            goto L5c
        L63:
            r10.k0(r4)
        L66:
            wb.yt r4 = (wb.yt) r4
            java.lang.Object r2 = r10.P()
            if (r2 != r6) goto L75
            i0.j1 r2 = i0.r.u(r4)
            r10.k0(r2)
        L75:
            r52 = r2
            i0.a1 r52 = (i0.a1) r52
            wb.yt r2 = W0(r52)
            java.lang.String r7 = r2.m()
            i0.j1 r4 = r2.J()
            i0.j1 r8 = r2.p()
            i0.j1 r12 = r2.i()
            i0.j1 r14 = r2.I()
            i0.j1 r13 = r2.K()
            i0.j1 r11 = r2.h()
            r42 = r14
            i0.j1 r14 = r2.q()
            r50 = r14
            i0.j1 r14 = r2.B()
            r41 = r12
            i0.j1 r12 = r2.e()
            r40 = r13
            i0.j1 r13 = r2.A()
            r20 = r13
            i0.j1 r13 = r2.n()
            r21 = r13
            i0.j1 r13 = r2.H()
            r22 = r13
            i0.j1 r13 = r2.C()
            r39 = r12
            i0.j1 r12 = r2.o()
            r38 = r14
            i0.j1 r14 = r2.s()
            r37 = r11
            i0.j1 r11 = r2.w()
            r34 = r13
            i0.j1 r13 = r2.u()
            r27 = r11
            i0.j1 r11 = r2.v()
            r23 = r11
            i0.j1 r11 = r2.r()
            boolean r24 = r10.f(r1)
            java.lang.Object r5 = r10.P()
            if (r24 != 0) goto Lf3
            if (r5 != r6) goto Lfa
        Lf3:
            fb.t0 r5 = fb.w.n(r1)
            r10.k0(r5)
        Lfa:
            fb.t0 r5 = (fb.t0) r5
            r24 = r0
            fb.v r0 = r5.b()
            java.lang.Object r3 = r10.P()
            if (r3 != r6) goto L113
            java.lang.String r3 = r5.c()
            i0.j1 r3 = i0.r.u(r3)
            r10.k0(r3)
        L113:
            r53 = r3
            i0.a1 r53 = (i0.a1) r53
            java.lang.Object r3 = r10.P()
            if (r3 != r6) goto L128
            java.lang.String r3 = r5.d()
            i0.j1 r3 = i0.r.u(r3)
            r10.k0(r3)
        L128:
            r54 = r3
            i0.a1 r54 = (i0.a1) r54
            java.lang.Object r3 = r10.P()
            if (r3 != r6) goto L13b
            java.lang.String r3 = r0.f3823a
            i0.j1 r3 = i0.r.u(r3)
            r10.k0(r3)
        L13b:
            r55 = r3
            i0.a1 r55 = (i0.a1) r55
            java.lang.Object r3 = r10.P()
            if (r3 != r6) goto L150
            java.lang.String r3 = r0.e()
            i0.j1 r3 = i0.r.u(r3)
            r10.k0(r3)
        L150:
            r56 = r3
            i0.a1 r56 = (i0.a1) r56
            java.lang.Object r3 = r10.P()
            if (r3 != r6) goto L165
            java.lang.String r3 = r0.b()
            i0.j1 r3 = i0.r.u(r3)
            r10.k0(r3)
        L165:
            r57 = r3
            i0.a1 r57 = (i0.a1) r57
            java.lang.Object r3 = r10.P()
            if (r3 != r6) goto L178
            java.lang.String r3 = r0.f3826d
            i0.j1 r3 = i0.r.u(r3)
            r10.k0(r3)
        L178:
            r58 = r3
            i0.a1 r58 = (i0.a1) r58
            java.lang.Object r3 = r10.P()
            if (r3 != r6) goto L18b
            java.util.List r3 = r0.f3827e
            i0.j1 r3 = i0.r.u(r3)
            r10.k0(r3)
        L18b:
            r26 = r3
            i0.a1 r26 = (i0.a1) r26
            java.lang.Object r3 = r10.P()
            if (r3 != r6) goto L1a4
            boolean r3 = r0.c()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            i0.j1 r3 = i0.r.u(r3)
            r10.k0(r3)
        L1a4:
            r60 = r3
            i0.a1 r60 = (i0.a1) r60
            java.lang.Object r3 = r10.P()
            if (r3 != r6) goto L1b4
            boolean r3 = r0.f3830h
            i0.j1 r3 = p.a.h(r3, r10)
        L1b4:
            r29 = r3
            i0.a1 r29 = (i0.a1) r29
            java.lang.Object r3 = r10.P()
            if (r3 != r6) goto L1c7
            java.lang.String r3 = r0.f3831i
            i0.j1 r3 = i0.r.u(r3)
            r10.k0(r3)
        L1c7:
            r30 = r3
            i0.a1 r30 = (i0.a1) r30
            java.lang.Object r3 = r10.P()
            if (r3 != r6) goto L1dc
            java.lang.String r3 = r0.f()
            i0.j1 r3 = i0.r.u(r3)
            r10.k0(r3)
        L1dc:
            r28 = r3
            i0.a1 r28 = (i0.a1) r28
            java.lang.Object r3 = r10.P()
            if (r3 != r6) goto L1f5
            int r0 = r0.d()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            i0.j1 r3 = i0.r.u(r0)
            r10.k0(r3)
        L1f5:
            r61 = r3
            i0.a1 r61 = (i0.a1) r61
            java.lang.Object r0 = r10.P()
            if (r0 != r6) goto L208
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            i0.j1 r0 = i0.r.u(r0)
            r10.k0(r0)
        L208:
            i0.a1 r0 = (i0.a1) r0
            java.lang.Object r3 = r10.P()
            if (r3 != r6) goto L219
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            i0.j1 r3 = i0.r.u(r3)
            r10.k0(r3)
        L219:
            r74 = r3
            i0.a1 r74 = (i0.a1) r74
            java.lang.Object r3 = r10.P()
            if (r3 != r6) goto L22c
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            i0.j1 r3 = i0.r.u(r3)
            r10.k0(r3)
        L22c:
            r31 = r3
            i0.a1 r31 = (i0.a1) r31
            java.lang.Object r3 = r10.P()
            if (r3 != r6) goto L23f
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            i0.j1 r3 = i0.r.u(r3)
            r10.k0(r3)
        L23f:
            r32 = r3
            i0.a1 r32 = (i0.a1) r32
            java.lang.Object r3 = r10.P()
            if (r3 != r6) goto L252
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            i0.j1 r3 = i0.r.u(r3)
            r10.k0(r3)
        L252:
            r33 = r3
            i0.a1 r33 = (i0.a1) r33
            i0.j1 r3 = r2.j()
            i0.j1 r43 = r2.l()
            i0.j1 r44 = r2.k()
            i0.j1 r64 = r2.f()
            i0.j1 r45 = r2.g()
            i0.j1 r65 = r2.d()
            i0.j1 r79 = r2.z()
            i0.j1 r81 = r2.t()
            i0.j1 r5 = r2.y()
            r35 = r11
            i0.j1 r11 = r2.x()
            r83 = r11
            i0.j1 r11 = r2.E()
            r78 = r11
            i0.j1 r11 = r2.F()
            r80 = r11
            i0.j1 r11 = r2.D()
            r82 = r11
            i0.j1 r11 = r2.G()
            r36 = r0
            java.lang.Object r0 = r10.P()
            if (r0 != r6) goto L2a9
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            i0.j1 r0 = i0.r.u(r0)
            r10.k0(r0)
        L2a9:
            r59 = r0
            i0.a1 r59 = (i0.a1) r59
            i0.j1 r0 = r2.c()
            r84 = r11
            i0.j1 r11 = r2.a()
            r46 = r11
            i0.j1 r11 = r2.b()
            r47 = r0
            java.lang.Object r0 = r10.P()
            if (r0 != r6) goto L2cc
            i0.j1 r0 = i0.r.u(r24)
            r10.k0(r0)
        L2cc:
            i0.a1 r0 = (i0.a1) r0
            r48 = r0
            java.lang.Object r0 = r10.P()
            if (r0 != r6) goto L2dd
            i0.j1 r0 = i0.r.u(r24)
            r10.k0(r0)
        L2dd:
            r62 = r0
            i0.a1 r62 = (i0.a1) r62
            int r0 = U0(r48)
            java.lang.Object r24 = r36.getValue()
            java.lang.Boolean r24 = (java.lang.Boolean) r24
            r63 = r3
            boolean r3 = r24.booleanValue()
            boolean r0 = r10.d(r0)
            boolean r3 = r10.g(r3)
            r0 = r0 | r3
            java.lang.Object r3 = r10.P()
            if (r0 != 0) goto L302
            if (r3 != r6) goto L31c
        L302:
            java.lang.Object r0 = r36.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L316
            fb.g1 r0 = fb.g1.f3523a
            java.util.List r0 = fb.g1.i(r1)
        L314:
            r3 = r0
            goto L319
        L316:
            tf.t r0 = tf.t.f13167g
            goto L314
        L319:
            r10.k0(r3)
        L31c:
            r85 = r3
            java.util.List r85 = (java.util.List) r85
            int r0 = V0(r62)
            boolean r0 = r10.d(r0)
            java.lang.Object r3 = r10.P()
            if (r0 != 0) goto L330
            if (r3 != r6) goto L33d
        L330:
            java.lang.String r0 = "Hchat_script_plugin_config"
            android.content.SharedPreferences r0 = ub.b.c(r1, r0)
            java.util.List r3 = fb.w.i(r0)
            r10.k0(r3)
        L33d:
            r66 = r3
            java.util.List r66 = (java.util.List) r66
            boolean r0 = r10.f(r2)
            java.lang.Object r3 = r10.P()
            if (r0 != 0) goto L34d
            if (r3 != r6) goto L355
        L34d:
            wb.wt r3 = new wb.wt
            r3.<init>(r1, r2)
            r10.k0(r3)
        L355:
            r49 = r3
            wb.wt r49 = (wb.wt) r49
            java.lang.Object r0 = r10.P()
            if (r0 != r6) goto L369
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r3 = 0
            r0.<init>(r3)
            r10.k0(r0)
            goto L36a
        L369:
            r3 = 0
        L36a:
            java.util.concurrent.atomic.AtomicBoolean r0 = (java.util.concurrent.atomic.AtomicBoolean) r0
            boolean r19 = r10.h(r0)
            boolean r24 = r10.f(r8)
            r19 = r19 | r24
            boolean r24 = r10.f(r7)
            r19 = r19 | r24
            boolean r24 = r10.h(r1)
            r19 = r19 | r24
            boolean r24 = r10.h(r2)
            r19 = r19 | r24
            r24 = r8
            r8 = r15 & 112(0x70, float:1.57E-43)
            r51 = r11
            r11 = 32
            if (r8 != r11) goto L395
            r18 = 1
            goto L397
        L395:
            r18 = r3
        L397:
            r18 = r19 | r18
            java.lang.Object r3 = r10.P()
            if (r18 != 0) goto L3a1
            if (r3 != r6) goto L3a4
        L3a1:
            r3 = r2
            r2 = r0
            goto L3c5
        L3a4:
            r11 = r3
            r3 = r0
            r0 = r11
            r77 = r5
            r11 = r6
            r93 = r8
            r6 = r24
            r87 = r36
            r88 = r43
            r89 = r44
            r90 = r45
            r91 = r47
            r92 = r49
            r25 = r64
            r19 = 0
            r5 = r2
            r36 = r4
            r2 = r7
            r7 = r48
            goto L3f6
        L3c5:
            wb.n7 r0 = new wb.n7
            r18 = r8
            r8 = 3
            r77 = r5
            r11 = r6
            r93 = r18
            r87 = r36
            r88 = r43
            r89 = r44
            r90 = r45
            r91 = r47
            r92 = r49
            r25 = r64
            r19 = 0
            r5 = r1
            r6 = r3
            r36 = r4
            r3 = r7
            r4 = r24
            r7 = r48
            r1 = r239
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = r3
            r3 = r2
            r2 = r1
            r1 = r5
            r5 = r6
            r6 = r4
            r10.k0(r0)
        L3f6:
            fg.a r0 = (fg.a) r0
            i0.a1 r8 = i0.r.y(r0, r10)
            boolean r0 = r10.h(r3)
            boolean r4 = r10.f(r6)
            r0 = r0 | r4
            boolean r4 = r10.f(r2)
            r0 = r0 | r4
            boolean r4 = r10.h(r1)
            r0 = r0 | r4
            boolean r4 = r10.h(r5)
            r0 = r0 | r4
            java.lang.Object r4 = r10.P()
            if (r0 != 0) goto L41c
            if (r4 != r11) goto L432
        L41c:
            c9.p0 r0 = new c9.p0
            r48 = r7
            r7 = 16
            r4 = r1
            r1 = r3
            r3 = r6
            r6 = r48
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r7 = r6
            r6 = r3
            r3 = r1
            r1 = r4
            r10.k0(r0)
            r4 = r0
        L432:
            fg.a r4 = (fg.a) r4
            i0.a1 r0 = i0.r.y(r4, r10)
            boolean r4 = r10.f(r8)
            r15 = r15 & 896(0x380, float:1.256E-42)
            r24 = r3
            r3 = 256(0x100, float:3.59E-43)
            if (r15 != r3) goto L446
            r3 = 1
            goto L448
        L446:
            r3 = r19
        L448:
            r3 = r3 | r4
            boolean r4 = r10.f(r0)
            r3 = r3 | r4
            java.lang.Object r4 = r10.P()
            r15 = 6
            if (r3 != 0) goto L457
            if (r4 != r11) goto L45f
        L457:
            wb.dj r4 = new wb.dj
            r4.<init>(r9, r8, r0, r15)
            r10.k0(r4)
        L45f:
            fg.l r4 = (fg.l) r4
            i0.r.c(r9, r4, r10)
            boolean r0 = h1(r63)
            java.lang.Boolean r94 = java.lang.Boolean.valueOf(r0)
            boolean r0 = M0(r65)
            java.lang.Boolean r95 = java.lang.Boolean.valueOf(r0)
            java.lang.Object r0 = r79.getValue()
            r96 = r0
            wb.tt r96 = (wb.tt) r96
            java.lang.Object r0 = r81.getValue()
            r97 = r0
            wb.qt r97 = (wb.qt) r97
            java.lang.Object r0 = r77.getValue()
            r98 = r0
            wb.st r98 = (wb.st) r98
            java.lang.Object r0 = r74.getValue()
            r99 = r0
            java.lang.Boolean r99 = (java.lang.Boolean) r99
            r99.getClass()
            java.lang.Object r0 = r31.getValue()
            r100 = r0
            java.lang.Boolean r100 = (java.lang.Boolean) r100
            r100.getClass()
            java.lang.Object r0 = r32.getValue()
            r101 = r0
            java.lang.Boolean r101 = (java.lang.Boolean) r101
            r101.getClass()
            java.lang.Object r0 = r33.getValue()
            r102 = r0
            java.lang.Boolean r102 = (java.lang.Boolean) r102
            r102.getClass()
            java.lang.Object r0 = r13.getValue()
            r103 = r0
            java.util.List r103 = (java.util.List) r103
            java.lang.Object[] r0 = new java.lang.Object[]{r94, r95, r96, r97, r98, r99, r100, r101, r102, r103}
            r3 = r63
            boolean r4 = r10.f(r3)
            r8 = r65
            boolean r17 = r10.f(r8)
            r4 = r4 | r17
            r15 = r79
            boolean r43 = r10.f(r15)
            r4 = r4 | r43
            r43 = r0
            r0 = r81
            boolean r44 = r10.f(r0)
            r4 = r4 | r44
            r0 = r77
            boolean r44 = r10.f(r0)
            r4 = r4 | r44
            boolean r44 = r10.f(r13)
            r4 = r4 | r44
            boolean r44 = r10.f(r12)
            r4 = r4 | r44
            boolean r44 = r10.f(r14)
            r4 = r4 | r44
            r0 = r27
            boolean r27 = r10.f(r0)
            r4 = r4 | r27
            r27 = r0
            r0 = r83
            boolean r44 = r10.f(r0)
            r4 = r4 | r44
            r0 = r84
            boolean r44 = r10.f(r0)
            r4 = r4 | r44
            r0 = r78
            boolean r44 = r10.f(r0)
            r4 = r4 | r44
            r0 = r80
            boolean r44 = r10.f(r0)
            r4 = r4 | r44
            r0 = r82
            boolean r44 = r10.f(r0)
            r4 = r4 | r44
            r0 = r25
            boolean r25 = r10.f(r0)
            r4 = r4 | r25
            boolean r25 = r10.h(r1)
            r4 = r4 | r25
            boolean r25 = r10.f(r6)
            r4 = r4 | r25
            r25 = r0
            r0 = r36
            boolean r36 = r10.f(r0)
            r4 = r4 | r36
            r36 = r0
            r0 = r34
            boolean r34 = r10.f(r0)
            r4 = r4 | r34
            boolean r34 = r10.f(r2)
            r4 = r4 | r34
            boolean r34 = r10.h(r5)
            r4 = r4 | r34
            r34 = r0
            r0 = r37
            boolean r37 = r10.f(r0)
            r4 = r4 | r37
            r37 = r0
            r0 = r38
            boolean r38 = r10.f(r0)
            r4 = r4 | r38
            r38 = r0
            r0 = r39
            boolean r39 = r10.f(r0)
            r4 = r4 | r39
            r39 = r0
            r0 = r40
            boolean r40 = r10.f(r0)
            r4 = r4 | r40
            r40 = r0
            r0 = r41
            boolean r41 = r10.f(r0)
            r4 = r4 | r41
            r41 = r0
            r0 = r42
            boolean r42 = r10.f(r0)
            r4 = r4 | r42
            r42 = r0
            r0 = r91
            boolean r44 = r10.f(r0)
            r4 = r4 | r44
            r47 = r0
            r0 = r46
            boolean r44 = r10.f(r0)
            r4 = r4 | r44
            r0 = r51
            boolean r44 = r10.f(r0)
            r4 = r4 | r44
            r0 = r88
            boolean r44 = r10.f(r0)
            r4 = r4 | r44
            r0 = r89
            boolean r44 = r10.f(r0)
            r4 = r4 | r44
            r0 = r90
            boolean r44 = r10.f(r0)
            r4 = r4 | r44
            r0 = r50
            boolean r44 = r10.f(r0)
            r4 = r4 | r44
            r0 = r92
            boolean r44 = r10.h(r0)
            r4 = r4 | r44
            java.lang.Object r0 = r10.P()
            if (r4 != 0) goto L63f
            if (r0 != r11) goto L5ee
            goto L63f
        L5ee:
            r1 = r28
            r28 = r2
            r2 = r3
            r3 = r55
            r55 = r23
            r23 = r1
            r48 = r7
            r65 = r8
            r1 = r10
            r113 = r11
            r79 = r15
            r105 = r20
            r106 = r21
            r107 = r22
            r109 = r24
            r64 = r25
            r19 = r26
            r10 = r27
            r22 = r29
            r11 = r30
            r25 = r31
            r30 = r32
            r9 = r33
            r108 = r35
            r26 = r38
            r15 = r39
            r110 = r43
            r45 = r51
            r4 = r56
            r18 = r58
            r20 = r60
            r21 = r61
            r8 = r84
            r43 = r89
            r35 = r5
            r27 = r6
            r29 = r12
            r6 = r13
            r12 = r37
            r13 = r50
            r5 = r57
            goto L6dd
        L63f:
            wb.zt r0 = new wb.zt
            r45 = r51
            r51 = 0
            r113 = r11
            r10 = r13
            r105 = r20
            r106 = r21
            r107 = r22
            r109 = r24
            r21 = r25
            r9 = r33
            r108 = r35
            r33 = r36
            r110 = r43
            r44 = r46
            r43 = r47
            r22 = r55
            r24 = r57
            r25 = r58
            r18 = r78
            r19 = r80
            r4 = r81
            r20 = r82
            r16 = r83
            r17 = r84
            r46 = r88
            r47 = r89
            r48 = r90
            r49 = r92
            r11 = r1
            r1 = r3
            r35 = r5
            r36 = r7
            r13 = r12
            r3 = r15
            r55 = r23
            r15 = r27
            r7 = r31
            r23 = r56
            r27 = r60
            r5 = r77
            r12 = r2
            r2 = r8
            r31 = r28
            r8 = r32
            r28 = r61
            r32 = r6
            r6 = r74
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)
            r11 = r47
            r47 = r43
            r43 = r11
            r65 = r2
            r79 = r3
            r6 = r10
            r10 = r15
            r64 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r18 = r25
            r19 = r26
            r20 = r27
            r21 = r28
            r22 = r29
            r11 = r30
            r23 = r31
            r27 = r32
            r26 = r38
            r15 = r39
            r2 = r1
            r25 = r7
            r30 = r8
            r28 = r12
            r29 = r13
            r8 = r17
            r48 = r36
            r12 = r37
            r46 = r44
            r13 = r50
            r1 = r241
            r36 = r33
            r1.k0(r0)
        L6dd:
            fg.p r0 = (fg.p) r0
            r7 = r110
            i0.r.i(r7, r0, r1)
            boolean r0 = R0(r8)
            if (r0 == 0) goto L823
            r0 = 64580169(0x3d96a49, float:1.2778516E-36)
            r1.a0(r0)
            java.lang.Object r0 = r83.getValue()
            wb.au r0 = (wb.au) r0
            if (r0 != 0) goto L742
            r0 = 2001985240(0x7753ded8, float:4.297244E33)
            r1.a0(r0)
            r1.s()
            r0 = r1
            r119 = r2
            r128 = r8
            r49 = r9
            r31 = r10
            r63 = r11
            r115 = r12
            r116 = r13
            r118 = r15
            r58 = r18
            r60 = r20
            r61 = r21
            r117 = r26
            r38 = r36
            r114 = r40
            r89 = r43
            r124 = r45
            r123 = r46
            r122 = r47
            r24 = r62
            r120 = r64
            r127 = r83
            r121 = r90
            r125 = r92
            r126 = r113
            r20 = r4
            r21 = r5
            r47 = r6
            r26 = r14
            r64 = r23
            r23 = r19
            r19 = r3
            goto L81f
        L742:
            fb.k2 r7 = r0.f15125a
            r17 = r0
            r0 = 2001985241(0x7753ded9, float:4.2972442E33)
            r1.a0(r0)
            java.lang.String r0 = r7.a()
            boolean r0 = r1.f(r0)
            r24 = r0
            java.lang.Object r0 = r1.P()
            r63 = r2
            r2 = r113
            if (r24 != 0) goto L762
            if (r0 != r2) goto L76b
        L762:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            i0.j1 r0 = i0.r.u(r0)
            r1.k0(r0)
        L76b:
            i0.a1 r0 = (i0.a1) r0
            java.lang.String r7 = r7.f3611b
            boolean r24 = r1.f(r8)
            r31 = r0
            java.lang.Object r0 = r1.P()
            if (r24 != 0) goto L782
            if (r0 != r2) goto L77e
            goto L782
        L77e:
            r113 = r2
            r2 = 7
            goto L78d
        L782:
            wb.i6 r0 = new wb.i6
            r113 = r2
            r2 = 7
            r0.<init>(r8, r2)
            r1.k0(r0)
        L78d:
            r24 = r0
            fg.a r24 = (fg.a) r24
            wb.w9 r0 = new wb.w9
            r1 = r238
            r49 = r9
            r115 = r12
            r116 = r13
            r118 = r15
            r16 = r17
            r9 = r20
            r12 = r23
            r117 = r26
            r2 = r31
            r38 = r36
            r114 = r40
            r89 = r43
            r124 = r45
            r123 = r46
            r122 = r47
            r13 = r62
            r119 = r63
            r120 = r64
            r15 = r83
            r121 = r90
            r125 = r92
            r126 = r113
            r47 = r6
            r17 = r7
            r31 = r10
            r26 = r14
            r7 = r18
            r10 = r21
            r6 = r5
            r14 = r8
            r8 = r19
            r5 = r4
            r4 = r3
            r3 = r11
            r11 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r63 = r3
            r19 = r4
            r20 = r5
            r21 = r6
            r58 = r7
            r23 = r8
            r60 = r9
            r61 = r10
            r64 = r12
            r6 = r14
            r5 = r15
            r9 = r24
            r24 = r13
            r1 = -1577780286(0xffffffffa1f4fbc2, float:-1.6600723E-18)
            r10 = r241
            s0.d r15 = s0.i.e(r1, r0, r10)
            r1 = r17
            r17 = 6
            r18 = 3072(0xc00, float:4.305E-42)
            r0 = 0
            r2 = 0
            r83 = r5
            r4 = 0
            r84 = r6
            r6 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r16 = r241
            r127 = r83
            r128 = r84
            oh.h.d(r0, r1, r2, r4, r6, r8, r9, r10, r12, r14, r15, r16, r17, r18)
            r0 = r16
            r0.s()
        L81f:
            r0.s()
            goto L86b
        L823:
            r0 = r1
            r119 = r2
            r128 = r8
            r49 = r9
            r31 = r10
            r63 = r11
            r115 = r12
            r116 = r13
            r118 = r15
            r58 = r18
            r60 = r20
            r61 = r21
            r117 = r26
            r38 = r36
            r114 = r40
            r89 = r43
            r124 = r45
            r123 = r46
            r122 = r47
            r24 = r62
            r120 = r64
            r127 = r83
            r121 = r90
            r125 = r92
            r126 = r113
            r20 = r4
            r21 = r5
            r47 = r6
            r26 = r14
            r64 = r23
            r23 = r19
            r19 = r3
            r1 = 2005636266(0x778b94aa, float:5.6620666E33)
            r0.a0(r1)
            r0.s()
        L86b:
            boolean r1 = N0(r78)
            r2 = 9
            java.lang.String r32 = "确认修改"
            java.lang.String r33 = "确认高风险修改"
            java.lang.String r36 = "创建插件"
            if (r1 == 0) goto L96d
            r1 = 64706492(0x3db57bc, float:1.2891806E-36)
            r0.a0(r1)
            java.lang.Object r1 = r77.getValue()
            wb.st r1 = (wb.st) r1
            if (r1 != 0) goto L898
            r1 = 2005901253(0x778f9fc5, float:5.8260856E33)
            r0.a0(r1)
            r0.s()
            r130 = r77
            r131 = r78
            r129 = r126
            goto L969
        L898:
            fb.i2 r3 = r1.f19138b
            r4 = 2005901254(0x778f9fc6, float:5.826086E33)
            r0.a0(r4)
            java.lang.String r4 = r3.c()
            boolean r4 = r0.f(r4)
            java.lang.Object r5 = r0.P()
            if (r4 != 0) goto L8b3
            r4 = r126
            if (r5 != r4) goto L8be
            goto L8b5
        L8b3:
            r4 = r126
        L8b5:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            i0.j1 r5 = i0.r.u(r5)
            r0.k0(r5)
        L8be:
            i0.a1 r5 = (i0.a1) r5
            boolean r3 = r3.a()
            if (r3 == 0) goto L8cd
            java.lang.String r3 = "删除插件"
        L8c8:
            r37 = r3
        L8ca:
            r8 = r78
            goto L8eb
        L8cd:
            boolean r3 = r1.c()
            if (r3 == 0) goto L8d6
            r37 = r36
            goto L8ca
        L8d6:
            boolean r3 = r1.a()
            if (r3 == 0) goto L8df
            java.lang.String r3 = "确认删除路径"
            goto L8c8
        L8df:
            boolean r3 = r1.b()
            if (r3 == 0) goto L8e8
            r37 = r33
            goto L8ca
        L8e8:
            r37 = r32
            goto L8ca
        L8eb:
            boolean r3 = r0.f(r8)
            java.lang.Object r6 = r0.P()
            if (r3 != 0) goto L8f7
            if (r6 != r4) goto L8ff
        L8f7:
            wb.i6 r6 = new wb.i6
            r6.<init>(r8, r2)
            r0.k0(r6)
        L8ff:
            r39 = r6
            fg.a r39 = (fg.a) r39
            wb.js r0 = new wb.js
            r6 = r238
            r2 = r1
            r129 = r4
            r1 = r5
            r3 = r8
            r15 = r19
            r16 = r20
            r17 = r21
            r19 = r23
            r7 = r27
            r8 = r28
            r5 = r34
            r9 = r35
            r11 = r41
            r12 = r42
            r13 = r48
            r18 = r58
            r20 = r60
            r21 = r61
            r14 = r63
            r23 = r64
            r10 = r65
            r4 = r77
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r78 = r3
            r20 = r16
            r21 = r17
            r23 = r19
            r19 = r15
            r1 = 1845556183(0x6e00f3d7, float:9.977216E27)
            r10 = r241
            s0.d r15 = s0.i.e(r1, r0, r10)
            r17 = 6
            r18 = 3072(0xc00, float:4.305E-42)
            r0 = 0
            r2 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r16 = r241
            r1 = r37
            r9 = r39
            r130 = r77
            r131 = r78
            oh.h.d(r0, r1, r2, r4, r6, r8, r9, r10, r12, r14, r15, r16, r17, r18)
            r0 = r16
            r0.s()
        L969:
            r0.s()
            goto L97c
        L96d:
            r130 = r77
            r131 = r78
            r129 = r126
            r1 = 2012240010(0x77f0588a, float:9.749586E33)
            r0.a0(r1)
            r0.s()
        L97c:
            boolean r1 = P0(r80)
            r2 = 10
            if (r1 == 0) goto La73
            r1 = 64916925(0x3de8dbd, float:1.3080529E-36)
            r0.a0(r1)
            java.lang.Object r1 = r79.getValue()
            wb.tt r1 = (wb.tt) r1
            if (r1 != 0) goto L9a3
            r1 = 2012424676(0x77f329e4, float:9.863889E33)
            r0.a0(r1)
            r0.s()
            r133 = r79
            r134 = r80
            r132 = r129
            goto La6f
        L9a3:
            r3 = 2012424677(0x77f329e5, float:9.8638895E33)
            r0.a0(r3)
            int r3 = r1.c()
            fb.y r4 = r1.b()
            java.lang.String r4 = r4.f3853b
            boolean r3 = r0.d(r3)
            boolean r4 = r0.f(r4)
            r3 = r3 | r4
            java.lang.Object r4 = r0.P()
            if (r3 != 0) goto L9c7
            r3 = r129
            if (r4 != r3) goto L9d2
            goto L9c9
        L9c7:
            r3 = r129
        L9c9:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            i0.j1 r4 = i0.r.u(r4)
            r0.k0(r4)
        L9d2:
            i0.a1 r4 = (i0.a1) r4
            boolean r5 = r1.e()
            if (r5 == 0) goto L9df
            r32 = r36
        L9dc:
            r10 = r80
            goto L9f1
        L9df:
            boolean r5 = r1.a()
            if (r5 == 0) goto L9e8
            java.lang.String r32 = "替换同名插件"
            goto L9dc
        L9e8:
            boolean r5 = r1.d()
            if (r5 == 0) goto L9dc
            r32 = r33
            goto L9dc
        L9f1:
            boolean r5 = r0.f(r10)
            java.lang.Object r6 = r0.P()
            if (r5 != 0) goto L9fd
            if (r6 != r3) goto La05
        L9fd:
            wb.i6 r6 = new wb.i6
            r6.<init>(r10, r2)
            r0.k0(r6)
        La05:
            r33 = r6
            fg.a r33 = (fg.a) r33
            wb.js r0 = new wb.js
            r8 = r238
            r2 = r1
            r132 = r3
            r1 = r4
            r3 = r10
            r15 = r19
            r16 = r20
            r17 = r21
            r19 = r23
            r6 = r27
            r7 = r28
            r5 = r34
            r9 = r35
            r11 = r41
            r12 = r42
            r13 = r48
            r18 = r58
            r20 = r60
            r21 = r61
            r14 = r63
            r23 = r64
            r10 = r65
            r4 = r79
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r80 = r3
            r20 = r16
            r21 = r17
            r23 = r19
            r19 = r15
            r1 = 959263740(0x392d33fc, float:1.6517931E-4)
            r10 = r241
            s0.d r15 = s0.i.e(r1, r0, r10)
            r17 = 6
            r18 = 3072(0xc00, float:4.305E-42)
            r0 = 0
            r2 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r16 = r241
            r1 = r32
            r9 = r33
            r133 = r79
            r134 = r80
            oh.h.d(r0, r1, r2, r4, r6, r8, r9, r10, r12, r14, r15, r16, r17, r18)
            r0 = r16
            r0.s()
        La6f:
            r0.s()
            goto La82
        La73:
            r133 = r79
            r134 = r80
            r132 = r129
            r1 = 2016704010(0x7834760a, float:1.4640743E34)
            r0.a0(r1)
            r0.s()
        La82:
            boolean r1 = Q0(r82)
            r2 = 11
            if (r1 == 0) goto Lb7d
            r1 = 65058957(0x3e0b88d, float:1.32079075E-36)
            r0.a0(r1)
            java.lang.Object r1 = r81.getValue()
            wb.qt r1 = (wb.qt) r1
            if (r1 != 0) goto Lab7
            r1 = 2016827668(0x78365914, float:1.4793824E34)
            r0.a0(r1)
            r0.s()
            r138 = r27
            r137 = r28
            r141 = r34
            r136 = r35
            r139 = r41
            r140 = r42
            r142 = r65
            r143 = r81
            r144 = r82
            r135 = r132
            goto Lb79
        Lab7:
            r3 = 2016827669(0x78365915, float:1.4793825E34)
            r0.a0(r3)
            int r3 = r1.a()
            java.lang.String r4 = r1.b()
            boolean r3 = r0.d(r3)
            boolean r4 = r0.f(r4)
            r3 = r3 | r4
            java.lang.Object r4 = r0.P()
            if (r3 != 0) goto Lad9
            r3 = r132
            if (r4 != r3) goto Lae4
            goto Ladb
        Lad9:
            r3 = r132
        Ladb:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            i0.j1 r4 = i0.r.u(r4)
            r0.k0(r4)
        Lae4:
            i0.a1 r4 = (i0.a1) r4
            r12 = r82
            boolean r5 = r0.f(r12)
            java.lang.Object r6 = r0.P()
            if (r5 != 0) goto Laf4
            if (r6 != r3) goto Lafc
        Laf4:
            wb.i6 r6 = new wb.i6
            r6.<init>(r12, r2)
            r0.k0(r6)
        Lafc:
            r32 = r6
            fg.a r32 = (fg.a) r32
            wb.js r0 = new wb.js
            r8 = r238
            r135 = r3
            r2 = r4
            r3 = r12
            r15 = r19
            r16 = r20
            r17 = r21
            r19 = r23
            r6 = r27
            r7 = r28
            r5 = r34
            r9 = r35
            r11 = r41
            r12 = r42
            r13 = r48
            r18 = r58
            r20 = r60
            r21 = r61
            r14 = r63
            r23 = r64
            r10 = r65
            r4 = r81
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r82 = r3
            r2 = r7
            r4 = r10
            r20 = r16
            r21 = r17
            r23 = r19
            r19 = r15
            r1 = -1080393673(0xffffffffbf9a8037, float:-1.2070378)
            r10 = r241
            s0.d r15 = s0.i.e(r1, r0, r10)
            r17 = 390(0x186, float:5.47E-43)
            r18 = 3072(0xc00, float:4.305E-42)
            r0 = 0
            java.lang.String r1 = "删除插件"
            r28 = r2
            r2 = 0
            r65 = r4
            r4 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r16 = r241
            r138 = r27
            r137 = r28
            r9 = r32
            r141 = r34
            r136 = r35
            r139 = r41
            r140 = r42
            r142 = r65
            r143 = r81
            r144 = r82
            oh.h.d(r0, r1, r2, r4, r6, r8, r9, r10, r12, r14, r15, r16, r17, r18)
            r0 = r16
            r0.s()
        Lb79:
            r0.s()
            goto Lb9a
        Lb7d:
            r138 = r27
            r137 = r28
            r141 = r34
            r136 = r35
            r139 = r41
            r140 = r42
            r142 = r65
            r143 = r81
            r144 = r82
            r135 = r132
            r1 = 2019154250(0x7859d94a, float:1.7673993E34)
            r0.a0(r1)
            r0.s()
        Lb9a:
            java.lang.Object r1 = r30.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Lc42
            r1 = 2019197030(0x785a8066, float:1.7726952E34)
            r0.a0(r1)
            java.lang.Object r1 = r53.getValue()
            r17 = r1
            java.lang.String r17 = (java.lang.String) r17
            r2 = r119
            boolean r1 = r0.f(r2)
            r3 = r238
            boolean r4 = r0.h(r3)
            r1 = r1 | r4
            java.lang.Object r4 = r0.P()
            if (r1 != 0) goto Lbde
            r1 = r135
            if (r4 != r1) goto Lbcc
            goto Lbe0
        Lbcc:
            r11 = r0
            r145 = r1
            r12 = r2
            r10 = r3
            r16 = r20
            r7 = r30
            r14 = r53
            r15 = r54
            r18 = r58
            r20 = r60
            goto Lc17
        Lbde:
            r1 = r135
        Lbe0:
            wb.vd r0 = new wb.vd
            r145 = r1
            r1 = r3
            r4 = r19
            r5 = r20
            r6 = r21
            r11 = r22
            r8 = r23
            r15 = r24
            r16 = r30
            r14 = r54
            r7 = r58
            r9 = r60
            r10 = r61
            r12 = r63
            r13 = r64
            r3 = r2
            r2 = r53
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r18 = r7
            r20 = r9
            r7 = r16
            r11 = r241
            r10 = r1
            r12 = r3
            r16 = r5
            r15 = r14
            r14 = r2
            r11.k0(r0)
            r4 = r0
        Lc17:
            r3 = r4
            fg.l r3 = (fg.l) r3
            java.lang.Object r0 = r11.P()
            r8 = r145
            if (r0 != r8) goto Lc2c
            wb.jp r0 = new wb.jp
            r1 = 14
            r0.<init>(r7, r1)
            r11.k0(r0)
        Lc2c:
            r2 = r0
            fg.a r2 = (fg.a) r2
            r1 = 27648(0x6c00, float:3.8743E-41)
            r0 = r237
            r4 = r11
            r5 = r17
            r6 = r66
            r0.l0(r1, r2, r3, r4, r5, r6)
            r0 = r4
            r39 = r6
            r0.s()
            goto Lc5f
        Lc42:
            r10 = r238
            r16 = r20
            r7 = r30
            r14 = r53
            r15 = r54
            r18 = r58
            r20 = r60
            r39 = r66
            r12 = r119
            r8 = r135
            r1 = 2019508394(0x785f40aa, float:1.8112402E34)
            r0.a0(r1)
            r0.s()
        Lc5f:
            java.lang.Object r1 = r49.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Ldc1
            r1 = 2019555390(0x785ff83e, float:1.817058E34)
            r0.a0(r1)
            java.lang.Object r1 = r22.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r17 = r1.booleanValue()
            java.lang.String r27 = f1(r63)
            java.lang.Object r1 = r64.getValue()
            r28 = r1
            java.lang.String r28 = (java.lang.String) r28
            java.lang.Object r1 = r16.getValue()
            r30 = r1
            java.lang.String r30 = (java.lang.String) r30
            java.lang.Object r1 = r23.getValue()
            r32 = r1
            java.util.List r32 = (java.util.List) r32
            boolean r1 = r0.h(r10)
            java.lang.Object r2 = r0.P()
            if (r1 != 0) goto Lcba
            if (r2 != r8) goto Lca4
            goto Lcba
        Lca4:
            r146 = r7
            r1 = r10
            r119 = r12
            r33 = r14
            r4 = r16
            r3 = r19
            r5 = r21
            r19 = r23
            r11 = r64
            r14 = r0
            r16 = r15
            r15 = r8
            goto Lceb
        Lcba:
            wb.ks r0 = new wb.ks
            r13 = 0
            r146 = r7
            r1 = r10
            r119 = r12
            r33 = r14
            r3 = r16
            r5 = r18
            r2 = r19
            r7 = r20
            r4 = r21
            r9 = r22
            r6 = r23
            r12 = r24
            r10 = r63
            r11 = r64
            r14 = r241
            r16 = r15
            r15 = r8
            r8 = r61
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r19 = r6
            r5 = r4
            r4 = r3
            r3 = r2
            r14.k0(r0)
            r2 = r0
        Lceb:
            r21 = r2
            fg.l r21 = (fg.l) r21
            boolean r0 = r14.h(r1)
            java.lang.Object r2 = r14.P()
            if (r0 != 0) goto Lcfb
            if (r2 != r15) goto Ld13
        Lcfb:
            wb.ks r0 = new wb.ks
            r13 = 1
            r6 = r18
            r7 = r19
            r8 = r20
            r10 = r22
            r12 = r24
            r9 = r61
            r2 = r63
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r14.k0(r0)
            r2 = r0
        Ld13:
            r23 = r2
            fg.l r23 = (fg.l) r23
            boolean r0 = r14.h(r1)
            java.lang.Object r2 = r14.P()
            if (r0 != 0) goto Ld23
            if (r2 != r15) goto Ld3d
        Ld23:
            wb.ks r0 = new wb.ks
            r13 = 2
            r2 = r11
            r6 = r18
            r7 = r19
            r8 = r20
            r10 = r22
            r12 = r24
            r9 = r61
            r11 = r63
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r11 = r2
            r14.k0(r0)
            r2 = r0
        Ld3d:
            r13 = r2
            fg.l r13 = (fg.l) r13
            boolean r0 = r14.h(r1)
            java.lang.Object r2 = r14.P()
            if (r0 != 0) goto Ld5e
            if (r2 != r15) goto Ld4d
            goto Ld5e
        Ld4d:
            r64 = r11
            r60 = r20
            r35 = r24
            r34 = r59
            r20 = r4
            r24 = r5
            r59 = r19
            r19 = r3
            goto Ld85
        Ld5e:
            c9.s0 r0 = new c9.s0
            r6 = r18
            r2 = r19
            r7 = r20
            r9 = r22
            r12 = r24
            r8 = r61
            r10 = r63
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r19 = r3
            r20 = r4
            r24 = r5
            r60 = r7
            r64 = r11
            r35 = r12
            r34 = r59
            r59 = r2
            r14.k0(r0)
            r2 = r0
        Ld85:
            r9 = r2
            fg.p r9 = (fg.p) r9
            java.lang.Object r0 = r14.P()
            if (r0 != r15) goto Ld9b
            wb.jp r0 = new wb.jp
            r1 = 15
            r2 = r49
            r0.<init>(r2, r1)
            r14.k0(r0)
            goto Ld9d
        Ld9b:
            r2 = r49
        Ld9d:
            r10 = r0
            fg.a r10 = (fg.a) r10
            r12 = 805306368(0x30000000, float:4.656613E-10)
            r8 = r13
            r13 = 6
            r0 = r237
            r147 = r2
            r11 = r14
            r1 = r17
            r6 = r21
            r7 = r23
            r2 = r27
            r3 = r28
            r4 = r30
            r5 = r32
            r14 = r238
            r0.k0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0 = r11
            r0.s()
            goto Lde2
        Ldc1:
            r146 = r7
            r119 = r12
            r33 = r14
            r60 = r20
            r35 = r24
            r147 = r49
            r34 = r59
            r14 = r10
            r20 = r16
            r24 = r21
            r59 = r23
            r16 = r15
            r15 = r8
            r1 = 2020181962(0x786987ca, float:1.8946239E34)
            r0.a0(r1)
            r0.s()
        Lde2:
            y0.l r1 = y0.l.f21818a
            y0.o r1 = p.h1.c(r1)
            y0.g r2 = y0.b.f21792g
            r3 = 0
            v1.n0 r2 = p.o.d(r2, r3)
            long r4 = i0.r.r(r0)
            int r4 = java.lang.Long.hashCode(r4)
            s0.h r5 = r0.z()
            y0.o r1 = y0.a.c(r0, r1)
            x1.f r6 = x1.g.f20914f
            r6.getClass()
            x1.y r6 = x1.f.b()
            r0.d0()
            boolean r7 = r0.D()
            if (r7 == 0) goto Le15
            r0.k(r6)
            goto Le18
        Le15:
            r0.n0()
        Le18:
            x1.e r6 = x1.f.d()
            i0.r.A(r6, r0, r2)
            x1.e r2 = x1.f.f()
            i0.r.A(r2, r0, r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            x1.e r4 = x1.f.c()
            i0.r.A(r4, r0, r2)
            x1.d r2 = x1.f.a()
            i0.r.w(r2, r0)
            x1.e r2 = x1.f.e()
            i0.r.A(r2, r0, r1)
            java.lang.Object r1 = r25.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 12
            wb.y2 r17 = wb.y2.f20289n
            if (r1 == 0) goto Leef
            r1 = -108657671(0xfffffffff98603f9, float:-8.698104E34)
            r0.a0(r1)
            r58 = r18
            r55 = r19
            r56 = r20
            r62 = r22
            r57 = r24
            fb.v r16 = B0(r55, r56, r57, r58, r59, r60, r61, r62, r63, r64)
            r3 = r55
            r4 = r56
            r5 = r57
            r19 = r59
            r20 = r60
            r11 = r64
            java.lang.Object r1 = r18.getValue()
            r21 = r1
            java.lang.String r21 = (java.lang.String) r21
            r1 = r119
            boolean r6 = r0.f(r1)
            boolean r7 = r0.h(r14)
            r6 = r6 | r7
            java.lang.Object r7 = r0.P()
            if (r6 != 0) goto Le92
            if (r7 != r15) goto Le8b
            goto Le92
        Le8b:
            r12 = r1
            r10 = r14
            r14 = r0
            r0 = r7
            r7 = r25
            goto Leb0
        Le92:
            wb.ik r0 = new wb.ik
            r2 = r1
            r12 = r11
            r1 = r14
            r6 = r18
            r7 = r19
            r8 = r20
            r10 = r22
            r13 = r25
            r9 = r61
            r11 = r63
            r14 = r241
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r10 = r1
            r12 = r2
            r7 = r13
            r14.k0(r0)
        Leb0:
            r3 = r0
            fg.l r3 = (fg.l) r3
            java.lang.Object r0 = r14.P()
            if (r0 != r15) goto Lec3
            wb.jp r0 = new wb.jp
            r1 = 16
            r0.<init>(r7, r1)
            r14.k0(r0)
        Lec3:
            r4 = r0
            fg.a r4 = (fg.a) r4
            r6 = 27656(0x6c08, float:3.8754E-41)
            r5 = r14
            r1 = r16
            r0 = r17
            r2 = r21
            r0.e0(r1, r2, r3, r4, r5, r6)
            r40 = r0
            r0 = r5
            r0.s()
            r14 = r52
            r52 = r48
            r48 = r14
            r14 = r0
            r148 = r7
            r234 = r12
            r235 = r15
            r232 = r38
            r49 = r40
            r231 = r137
            r233 = r141
            goto L24fa
        Leef:
            r10 = r14
            r40 = r17
            r6 = r18
            r2 = r19
            r4 = r20
            r5 = r24
            r7 = r25
            r8 = r59
            r9 = r60
            r1 = r61
            r11 = r64
            r12 = r119
            java.lang.Object r13 = r74.getValue()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            r14 = 8
            if (r13 == 0) goto L1350
            r3 = -108633938(0xfffffffff98660ae, float:-8.721608E34)
            r0.a0(r3)
            java.lang.Object r3 = r33.getValue()
            r41 = r3
            java.lang.String r41 = (java.lang.String) r41
            java.lang.Object r3 = r16.getValue()
            r42 = r3
            java.lang.String r42 = (java.lang.String) r42
            java.lang.Object r3 = r34.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r43 = r3.booleanValue()
            java.lang.String r44 = d1(r2)
            java.lang.Object r3 = r4.getValue()
            r45 = r3
            java.lang.String r45 = (java.lang.String) r45
            java.lang.String r46 = e1(r5)
            java.lang.Object r3 = r6.getValue()
            r47 = r3
            java.lang.String r47 = (java.lang.String) r47
            java.lang.Object r3 = r8.getValue()
            r49 = r3
            java.util.List r49 = (java.util.List) r49
            java.lang.Object r3 = r9.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r50 = r3.booleanValue()
            java.lang.String r51 = g1(r1)
            java.lang.Object r3 = r11.getValue()
            r53 = r3
            java.lang.String r53 = (java.lang.String) r53
            java.lang.Object r3 = r0.P()
            if (r3 != r15) goto Lf79
            wb.lp r3 = new wb.lp
            r13 = 6
            r3.<init>(r2, r13)
            r0.k0(r3)
        Lf79:
            r54 = r3
            fg.l r54 = (fg.l) r54
            java.lang.Object r3 = r0.P()
            if (r3 != r15) goto Lf8c
            wb.op r3 = new wb.op
            r13 = 1
            r3.<init>(r13, r4, r2)
            r0.k0(r3)
        Lf8c:
            r55 = r3
            fg.l r55 = (fg.l) r55
            java.lang.Object r3 = r0.P()
            if (r3 != r15) goto Lfa0
            wb.lp r3 = new wb.lp
            r13 = 7
            r3.<init>(r5, r13)
            r0.k0(r3)
            goto Lfa1
        Lfa0:
            r13 = 7
        Lfa1:
            r56 = r3
            fg.l r56 = (fg.l) r56
            java.lang.Object r3 = r0.P()
            if (r3 != r15) goto Lfb3
            wb.lp r3 = new wb.lp
            r3.<init>(r6, r14)
            r0.k0(r3)
        Lfb3:
            r57 = r3
            fg.l r57 = (fg.l) r57
            java.lang.Object r3 = r0.P()
            if (r3 != r15) goto Lfc7
            wb.lp r3 = new wb.lp
            r14 = 9
            r3.<init>(r8, r14)
            r0.k0(r3)
        Lfc7:
            r58 = r3
            fg.l r58 = (fg.l) r58
            java.lang.Object r3 = r0.P()
            if (r3 != r15) goto Lfdb
            wb.lp r3 = new wb.lp
            r14 = 10
            r3.<init>(r9, r14)
            r0.k0(r3)
        Lfdb:
            r59 = r3
            fg.l r59 = (fg.l) r59
            java.lang.Object r3 = r0.P()
            if (r3 != r15) goto Lfef
            wb.lp r3 = new wb.lp
            r14 = 11
            r3.<init>(r1, r14)
            r0.k0(r3)
        Lfef:
            r60 = r3
            fg.l r60 = (fg.l) r60
            java.lang.Object r3 = r0.P()
            if (r3 != r15) goto L1004
            wb.lp r3 = new wb.lp
            r14 = 12
            r3.<init>(r11, r14)
            r0.k0(r3)
            goto L1006
        L1004:
            r14 = 12
        L1006:
            r61 = r3
            fg.l r61 = (fg.l) r61
            boolean r3 = r0.f(r12)
            boolean r17 = r0.h(r10)
            r3 = r3 | r17
            java.lang.Object r13 = r0.P()
            if (r3 != 0) goto L1035
            if (r13 != r15) goto L101d
            goto L1035
        L101d:
            r21 = r1
            r3 = r2
            r18 = r6
            r148 = r7
            r19 = r8
            r20 = r9
            r1 = r10
            r2 = r12
            r149 = r15
            r12 = r33
            r24 = r35
            r15 = r0
            r0 = r13
            r13 = r16
            goto L1067
        L1035:
            wb.qk r0 = new wb.qk
            r3 = r10
            r10 = r1
            r1 = r3
            r148 = r7
            r13 = r11
            r3 = r12
            r149 = r15
            r14 = r16
            r11 = r22
            r15 = r35
            r12 = r63
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r2
            r2 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r10
            r11 = r13
            r13 = r14
            r24 = r15
            r15 = r241
            r12 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r15.k0(r0)
        L1067:
            r62 = r0
            fg.l r62 = (fg.l) r62
            boolean r0 = r15.h(r1)
            java.lang.Object r6 = r15.P()
            if (r0 != 0) goto L1083
            r0 = r149
            if (r6 != r0) goto L107c
            r113 = r0
            goto L1085
        L107c:
            r151 = r0
            r150 = r2
            r14 = r24
            goto L10a6
        L1083:
            r113 = r149
        L1085:
            wb.ls r0 = new wb.ls
            r150 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r14 = r24
            r10 = r63
            r151 = r113
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r5 = r4
            r4 = r3
            r3 = r2
            r15.k0(r0)
            r6 = r0
        L10a6:
            r64 = r6
            fg.l r64 = (fg.l) r64
            boolean r0 = r15.h(r1)
            java.lang.Object r2 = r15.P()
            if (r0 != 0) goto L10b9
            r0 = r151
            if (r2 != r0) goto L10c3
            goto L10bb
        L10b9:
            r0 = r151
        L10bb:
            wb.ld r2 = new wb.ld
            r2.<init>(r1, r12, r13, r14)
            r15.k0(r2)
        L10c3:
            r65 = r2
            fg.l r65 = (fg.l) r65
            boolean r2 = r15.h(r1)
            java.lang.Object r6 = r15.P()
            if (r2 != 0) goto L10d3
            if (r6 != r0) goto L10d6
        L10d3:
            r113 = r0
            goto L10e1
        L10d6:
            r152 = r0
            r66 = r13
            r67 = r14
            r10 = r63
            r63 = r12
            goto L1104
        L10e1:
            wb.xk r0 = new wb.xk
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r63
            r152 = r113
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r63 = r12
            r66 = r13
            r67 = r14
            r5 = r4
            r4 = r3
            r3 = r2
            r15.k0(r0)
            r6 = r0
        L1104:
            r68 = r6
            fg.a r68 = (fg.a) r68
            boolean r0 = r15.h(r1)
            java.lang.Object r2 = r15.P()
            r13 = r152
            if (r0 != 0) goto L1116
            if (r2 != r13) goto L112f
        L1116:
            nb.a0 r0 = new nb.a0
            r12 = r11
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r2 = r34
            r11 = r10
            r10 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r10 = r11
            r11 = r12
            r15.k0(r0)
            r2 = r0
        L112f:
            r69 = r2
            fg.a r69 = (fg.a) r69
            java.lang.Object r0 = r15.P()
            if (r0 != r13) goto L1146
            wb.jp r0 = new wb.jp
            r2 = 17
            r6 = r148
            r0.<init>(r6, r2)
            r15.k0(r0)
            goto L1148
        L1146:
            r6 = r148
        L1148:
            r70 = r0
            fg.a r70 = (fg.a) r70
            r2 = r150
            boolean r0 = r15.f(r2)
            r14 = r120
            boolean r7 = r15.f(r14)
            r0 = r0 | r7
            r8 = r142
            boolean r7 = r15.f(r8)
            r0 = r0 | r7
            r7 = r127
            boolean r9 = r15.f(r7)
            r0 = r0 | r9
            r12 = r128
            boolean r9 = r15.f(r12)
            r0 = r0 | r9
            r9 = r130
            boolean r16 = r15.f(r9)
            r0 = r0 | r16
            r16 = r0
            r0 = r131
            boolean r17 = r15.f(r0)
            r16 = r16 | r17
            r78 = r0
            r0 = r133
            boolean r17 = r15.f(r0)
            r16 = r16 | r17
            r79 = r0
            r0 = r134
            boolean r17 = r15.f(r0)
            r16 = r16 | r17
            r80 = r0
            r0 = r143
            boolean r17 = r15.f(r0)
            r16 = r16 | r17
            r81 = r0
            r0 = r144
            boolean r17 = r15.f(r0)
            r16 = r16 | r17
            r82 = r0
            r0 = r118
            boolean r17 = r15.f(r0)
            r16 = r16 | r17
            r0 = r138
            boolean r17 = r15.f(r0)
            r16 = r16 | r17
            boolean r17 = r15.h(r1)
            r16 = r16 | r17
            r24 = r0
            r0 = r115
            boolean r17 = r15.f(r0)
            r16 = r16 | r17
            r37 = r0
            r0 = r117
            boolean r17 = r15.f(r0)
            r16 = r16 | r17
            r26 = r0
            r0 = r139
            boolean r17 = r15.f(r0)
            r16 = r16 | r17
            r0 = r140
            boolean r17 = r15.f(r0)
            r16 = r16 | r17
            r0 = r121
            boolean r17 = r15.f(r0)
            r16 = r16 | r17
            r90 = r0
            r0 = r122
            boolean r17 = r15.f(r0)
            r16 = r16 | r17
            r91 = r0
            r0 = r123
            boolean r17 = r15.f(r0)
            r16 = r16 | r17
            r0 = r124
            boolean r17 = r15.f(r0)
            r16 = r16 | r17
            r0 = r116
            boolean r17 = r15.f(r0)
            r16 = r16 | r17
            r0 = r137
            boolean r17 = r15.f(r0)
            r16 = r16 | r17
            r28 = r0
            r0 = r136
            boolean r17 = r15.h(r0)
            r16 = r16 | r17
            r35 = r0
            java.lang.Object r0 = r15.P()
            if (r16 != 0) goto L1238
            if (r0 != r13) goto L122f
            goto L1238
        L122f:
            r12 = r2
            r153 = r6
            r154 = r13
            r2 = r15
            r6 = r24
            goto L1285
        L1238:
            wb.lc r0 = new wb.lc
            r25 = r37
            r37 = 1
            r15 = r3
            r16 = r4
            r17 = r5
            r153 = r6
            r5 = r7
            r4 = r8
            r7 = r9
            r23 = r10
            r6 = r12
            r154 = r13
            r3 = r14
            r14 = r24
            r34 = r28
            r36 = r48
            r8 = r78
            r9 = r79
            r10 = r80
            r12 = r82
            r29 = r90
            r30 = r91
            r33 = r116
            r13 = r118
            r31 = r123
            r32 = r124
            r27 = r139
            r28 = r140
            r24 = r11
            r11 = r81
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r12 = r2
            r6 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r10 = r23
            r11 = r24
            r28 = r34
            r2 = r241
            r2.k0(r0)
        L1285:
            r27 = r0
            fg.a r27 = (fg.a) r27
            boolean r0 = r2.h(r1)
            java.lang.Object r7 = r2.P()
            if (r0 != 0) goto L12a8
            r0 = r154
            if (r7 != r0) goto L129a
            r113 = r0
            goto L12aa
        L129a:
            r157 = r0
            r10 = r2
            r32 = r6
            r63 = r12
            r156 = r28
            r155 = r35
            r1 = r74
            goto L12d5
        L12a8:
            r113 = r154
        L12aa:
            wb.sd r0 = new wb.sd
            r16 = 1
            r2 = r63
            r63 = r12
            r12 = r2
            r32 = r6
            r6 = r18
            r7 = r19
            r8 = r20
            r2 = r21
            r9 = r22
            r156 = r28
            r155 = r35
            r13 = r66
            r14 = r67
            r15 = r74
            r157 = r113
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r10 = r241
            r1 = r15
            r10.k0(r0)
            r7 = r0
        L12d5:
            r28 = r7
            fg.a r28 = (fg.a) r28
            java.lang.Object r0 = r10.P()
            r2 = r157
            if (r0 != r2) goto L12eb
            wb.jp r0 = new wb.jp
            r3 = 18
            r0.<init>(r1, r3)
            r10.k0(r0)
        L12eb:
            r29 = r0
            fg.a r29 = (fg.a) r29
            r31 = 0
            r74 = r1
            r158 = r2
            r30 = r10
            r1 = r39
            r0 = r40
            r2 = r41
            r3 = r42
            r4 = r43
            r5 = r44
            r6 = r45
            r7 = r46
            r8 = r47
            r9 = r49
            r10 = r50
            r11 = r51
            r12 = r53
            r13 = r54
            r14 = r55
            r15 = r56
            r16 = r57
            r17 = r58
            r18 = r59
            r19 = r60
            r20 = r61
            r21 = r62
            r22 = r64
            r23 = r65
            r24 = r68
            r25 = r69
            r26 = r70
            r0.S(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r49 = r0
            r0 = r30
            r0.s()
            r14 = r52
            r52 = r48
            r48 = r14
            r14 = r0
            r138 = r32
            r232 = r38
            r234 = r63
            r233 = r141
            r148 = r153
            r136 = r155
            r231 = r156
            r235 = r158
            goto L24fa
        L1350:
            r61 = r1
            r19 = r2
            r20 = r4
            r24 = r5
            r18 = r6
            r153 = r7
            r23 = r8
            r60 = r9
            r64 = r11
            r158 = r15
            r49 = r40
            r30 = r63
            r1 = r115
            r50 = r116
            r4 = r117
            r15 = r118
            r6 = r120
            r90 = r121
            r159 = r122
            r160 = r123
            r161 = r124
            r14 = r127
            r7 = r128
            r13 = r130
            r5 = r131
            r9 = r133
            r10 = r134
            r155 = r136
            r156 = r137
            r32 = r138
            r11 = r139
            r42 = r140
            r8 = r142
            r3 = r143
            r2 = r144
            r86 = 1
            r63 = r12
            r12 = -108572844(0xfffffffff9874f54, float:-8.782113E34)
            r0.a0(r12)
            java.lang.String r51 = c1(r38)
            java.lang.Object r12 = r32.getValue()
            r53 = r12
            java.util.List r53 = (java.util.List) r53
            java.lang.String r54 = Y0(r29)
            java.util.List r56 = Z0(r26)
            fb.a1 r57 = a1(r31)
            java.lang.Object r12 = r47.getValue()
            r58 = r12
            java.util.List r58 = (java.util.List) r58
            boolean r59 = b1(r55)
            java.lang.Object r12 = r16.getValue()
            r91 = r12
            java.lang.String r91 = (java.lang.String) r91
            java.lang.Object r12 = r18.getValue()
            r92 = r12
            java.lang.String r92 = (java.lang.String) r92
            boolean r12 = h1(r63)
            if (r12 != 0) goto L13ef
            boolean r12 = J0(r6)
            if (r12 != 0) goto L13ef
            boolean r12 = M0(r8)
            if (r12 != 0) goto L13ef
            boolean r12 = I0(r14, r13, r9, r3)
            if (r12 != 0) goto L13ef
            r94 = r86
            goto L13f1
        L13ef:
            r94 = 0
        L13f1:
            boolean r12 = J0(r6)
            if (r12 != 0) goto L1406
            boolean r12 = M0(r8)
            if (r12 != 0) goto L1406
            boolean r12 = I0(r14, r13, r9, r3)
            if (r12 != 0) goto L1406
            r95 = r86
            goto L1408
        L1406:
            r95 = 0
        L1408:
            boolean r96 = h1(r63)
            boolean r97 = J0(r6)
            boolean r12 = J0(r6)
            if (r12 == 0) goto L141d
            long r27 = K0(r90)
        L141a:
            r98 = r27
            goto L1422
        L141d:
            long r27 = i1(r88)
            goto L141a
        L1422:
            boolean r12 = J0(r6)
            if (r12 == 0) goto L1433
            boolean r12 = h1(r63)
            if (r12 == 0) goto L1433
            java.lang.String r12 = "正在自动压缩上下文"
        L1430:
            r100 = r12
            goto L143f
        L1433:
            boolean r12 = J0(r6)
            if (r12 == 0) goto L143c
            java.lang.String r12 = "正在压缩上下文"
            goto L1430
        L143c:
            java.lang.String r12 = ""
            goto L1430
        L143f:
            boolean r12 = h1(r63)
            if (r12 == 0) goto L144e
            boolean r12 = j1(r89)
            if (r12 != 0) goto L144e
            r101 = r86
            goto L1450
        L144e:
            r101 = 0
        L1450:
            java.lang.Object r12 = r14.getValue()
            wb.au r12 = (wb.au) r12
            r16 = 0
            if (r12 == 0) goto L1479
            java.lang.Object r12 = r14.getValue()
            wb.au r12 = (wb.au) r12
            if (r12 == 0) goto L146b
            fb.k2 r12 = r12.f15125a
            if (r12 == 0) goto L146b
            java.lang.String r12 = r12.f3611b
        L1468:
            r41 = r11
            goto L146e
        L146b:
            r12 = r16
            goto L1468
        L146e:
            java.lang.String r11 = "待确认"
            java.lang.String r16 = bc.e.i(r12, r11)
        L1474:
            r102 = r16
            r11 = r29
            goto L149c
        L1479:
            r41 = r11
            java.lang.Object r11 = r13.getValue()
            wb.st r11 = (wb.st) r11
            if (r11 == 0) goto L1486
            java.lang.String r16 = "最终插件修改待确认"
            goto L1474
        L1486:
            java.lang.Object r11 = r9.getValue()
            wb.tt r11 = (wb.tt) r11
            if (r11 == 0) goto L1491
            java.lang.String r16 = "最终插件写入待确认"
            goto L1474
        L1491:
            java.lang.Object r11 = r3.getValue()
            wb.qt r11 = (wb.qt) r11
            if (r11 == 0) goto L1474
            java.lang.String r16 = "删除插件待确认"
            goto L1474
        L149c:
            boolean r12 = r0.f(r11)
            r16 = r12
            java.lang.Object r12 = r0.P()
            r39 = r15
            r15 = r158
            if (r16 != 0) goto L14b2
            if (r12 != r15) goto L14af
            goto L14b2
        L14af:
            r113 = r15
            goto L14bd
        L14b2:
            wb.h6 r12 = new wb.h6
            r113 = r15
            r15 = 5
            r12.<init>(r11, r15)
            r0.k0(r12)
        L14bd:
            r103 = r12
            fg.l r103 = (fg.l) r103
            boolean r12 = r0.f(r11)
            r15 = r26
            boolean r16 = r0.f(r15)
            r12 = r12 | r16
            r29 = r11
            r11 = r31
            boolean r16 = r0.f(r11)
            r12 = r12 | r16
            boolean r16 = r0.f(r14)
            r12 = r12 | r16
            boolean r16 = r0.f(r7)
            r12 = r12 | r16
            boolean r16 = r0.f(r13)
            r12 = r12 | r16
            boolean r16 = r0.f(r5)
            r12 = r12 | r16
            boolean r16 = r0.f(r9)
            r12 = r12 | r16
            boolean r16 = r0.f(r10)
            r12 = r12 | r16
            boolean r16 = r0.f(r3)
            r12 = r12 | r16
            boolean r16 = r0.f(r2)
            r12 = r12 | r16
            r82 = r2
            r2 = r63
            boolean r16 = r0.f(r2)
            r12 = r12 | r16
            boolean r16 = r0.f(r6)
            r12 = r12 | r16
            boolean r16 = r0.f(r8)
            r12 = r12 | r16
            r2 = r238
            boolean r16 = r0.h(r2)
            r12 = r12 | r16
            r2 = r32
            boolean r16 = r0.f(r2)
            r12 = r12 | r16
            r2 = r38
            boolean r16 = r0.f(r2)
            r12 = r12 | r16
            r36 = r2
            r2 = r141
            boolean r16 = r0.f(r2)
            r12 = r12 | r16
            r34 = r2
            r2 = r156
            boolean r16 = r0.f(r2)
            r12 = r12 | r16
            r28 = r2
            r2 = r155
            boolean r16 = r0.h(r2)
            r12 = r12 | r16
            boolean r16 = r0.f(r1)
            r12 = r12 | r16
            boolean r16 = r0.f(r4)
            r12 = r12 | r16
            r37 = r1
            r1 = r39
            boolean r16 = r0.f(r1)
            r12 = r12 | r16
            r1 = r114
            boolean r16 = r0.f(r1)
            r12 = r12 | r16
            r40 = r1
            r1 = r41
            boolean r16 = r0.f(r1)
            r12 = r12 | r16
            r1 = r42
            boolean r16 = r0.f(r1)
            r12 = r12 | r16
            r1 = r159
            boolean r16 = r0.f(r1)
            r12 = r12 | r16
            r43 = r1
            r1 = r160
            boolean r16 = r0.f(r1)
            r12 = r12 | r16
            r46 = r1
            r1 = r161
            boolean r16 = r0.f(r1)
            r12 = r12 | r16
            r45 = r1
            r1 = r88
            boolean r16 = r0.f(r1)
            r12 = r12 | r16
            r1 = r89
            boolean r16 = r0.f(r1)
            r12 = r12 | r16
            r1 = r90
            boolean r16 = r0.f(r1)
            r12 = r12 | r16
            r1 = r50
            boolean r16 = r0.f(r1)
            r12 = r12 | r16
            r1 = r125
            boolean r16 = r0.h(r1)
            r12 = r12 | r16
            java.lang.Object r0 = r241.P()
            if (r12 != 0) goto L1606
            r12 = r113
            if (r0 != r12) goto L15d4
            goto L1608
        L15d4:
            r125 = r1
            r35 = r2
            r81 = r3
            r26 = r4
            r78 = r5
            r25 = r6
            r6 = r7
            r79 = r9
            r80 = r10
            r4 = r11
            r162 = r12
            r77 = r13
            r5 = r14
            r3 = r15
            r21 = r24
            r2 = r29
            r14 = r32
            r11 = r34
            r15 = r39
            r13 = r50
            r12 = r63
            r1 = r238
            r10 = r241
            r29 = r22
            r22 = r23
            r63 = r30
            goto L16a0
        L1606:
            r12 = r113
        L1608:
            wb.ms r0 = new wb.ms
            r25 = r6
            r6 = r7
            r26 = r8
            r21 = r10
            r162 = r12
            r7 = r13
            r13 = r18
            r10 = r19
            r17 = r22
            r12 = r24
            r18 = r30
            r27 = r32
            r30 = r34
            r31 = r37
            r33 = r39
            r34 = r40
            r35 = r41
            r39 = r43
            r41 = r45
            r40 = r46
            r38 = r48
            r45 = r50
            r16 = r61
            r24 = r63
            r19 = r64
            r43 = r89
            r44 = r90
            r46 = r1
            r37 = r2
            r22 = r3
            r32 = r4
            r8 = r5
            r4 = r11
            r5 = r14
            r3 = r15
            r11 = r20
            r14 = r23
            r2 = r29
            r29 = r36
            r36 = r42
            r15 = r60
            r20 = r74
            r23 = r82
            r42 = r88
            r1 = r238
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            r77 = r7
            r78 = r8
            r79 = r9
            r63 = r18
            r80 = r21
            r81 = r22
            r8 = r26
            r26 = r32
            r15 = r33
            r125 = r46
            r19 = r10
            r20 = r11
            r21 = r12
            r18 = r13
            r22 = r14
            r12 = r24
            r14 = r27
            r11 = r30
            r42 = r36
            r43 = r39
            r46 = r40
            r13 = r45
            r10 = r241
            r36 = r29
            r40 = r34
            r45 = r41
            r29 = r17
            r41 = r35
            r35 = r37
            r37 = r31
            r10.k0(r0)
        L16a0:
            r50 = r0
            fg.a r50 = (fg.a) r50
            boolean r0 = r10.f(r12)
            boolean r7 = r10.f(r8)
            r0 = r0 | r7
            boolean r7 = r10.f(r2)
            r0 = r0 | r7
            boolean r7 = r10.f(r3)
            r0 = r0 | r7
            r7 = r47
            boolean r9 = r10.f(r7)
            r0 = r0 | r9
            r9 = r108
            boolean r16 = r10.f(r9)
            r0 = r0 | r16
            boolean r16 = r10.f(r4)
            r0 = r0 | r16
            r16 = r0
            r0 = r55
            boolean r17 = r10.f(r0)
            r16 = r16 | r17
            boolean r17 = r10.h(r1)
            r16 = r16 | r17
            r23 = r0
            java.lang.Object r0 = r10.P()
            r119 = r12
            r12 = r162
            if (r16 != 0) goto L1714
            if (r0 != r12) goto L16eb
            goto L1714
        L16eb:
            r27 = r4
            r4 = r8
            r113 = r12
            r116 = r13
            r24 = r14
            r39 = r15
            r13 = r43
            r14 = r45
            r172 = r46
            r168 = r77
            r169 = r78
            r166 = r79
            r170 = r80
            r167 = r81
            r171 = r82
            r164 = r89
            r165 = r90
            r173 = r125
            r12 = r5
            r15 = r6
            r6 = r7
            r5 = r119
            goto L1753
        L1714:
            c9.u0 r0 = new c9.u0
            r113 = r12
            r116 = r13
            r24 = r14
            r39 = r15
            r13 = r43
            r14 = r45
            r172 = r46
            r168 = r77
            r169 = r78
            r166 = r79
            r170 = r80
            r167 = r81
            r171 = r82
            r164 = r89
            r165 = r90
            r173 = r125
            r12 = r5
            r15 = r6
            r6 = r7
            r7 = r9
            r9 = r23
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r2
            r2 = r119
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r23 = r5
            r5 = r2
            r2 = r4
            r4 = r3
            r3 = r23
            r27 = r8
            r23 = r9
            r10.k0(r0)
        L1753:
            r47 = r0
            fg.a r47 = (fg.a) r47
            boolean r0 = r10.f(r14)
            boolean r7 = r10.f(r13)
            r0 = r0 | r7
            boolean r7 = r10.f(r12)
            r0 = r0 | r7
            boolean r7 = r10.f(r15)
            r0 = r0 | r7
            boolean r7 = r10.f(r11)
            r0 = r0 | r7
            r8 = r24
            boolean r7 = r10.f(r8)
            r0 = r0 | r7
            r9 = r172
            boolean r7 = r10.f(r9)
            r0 = r0 | r7
            r7 = r116
            boolean r16 = r10.f(r7)
            r0 = r0 | r16
            boolean r16 = r10.h(r1)
            r0 = r0 | r16
            r16 = r0
            r0 = r39
            boolean r17 = r10.f(r0)
            r16 = r16 | r17
            r0 = r173
            boolean r17 = r10.h(r0)
            r16 = r16 | r17
            boolean r17 = r10.f(r5)
            r16 = r16 | r17
            r125 = r0
            r0 = r25
            boolean r17 = r10.f(r0)
            r16 = r16 | r17
            r0 = r165
            boolean r17 = r10.f(r0)
            r16 = r16 | r17
            r90 = r0
            r0 = r88
            boolean r17 = r10.f(r0)
            r16 = r16 | r17
            r0 = r164
            boolean r17 = r10.f(r0)
            r16 = r16 | r17
            r89 = r0
            java.lang.Object r0 = r10.P()
            r1 = r113
            if (r16 != 0) goto L1810
            if (r0 != r1) goto L17d4
            goto L1810
        L17d4:
            r43 = r12
            r12 = r5
            r5 = r43
            r188 = r1
            r182 = r2
            r183 = r3
            r187 = r4
            r185 = r6
            r46 = r9
            r6 = r10
            r9 = r11
            r43 = r13
            r45 = r14
            r84 = r15
            r186 = r23
            r14 = r25
            r181 = r26
            r184 = r27
            r175 = r28
            r174 = r35
            r176 = r36
            r180 = r37
            r15 = r39
            r179 = r40
            r177 = r41
            r178 = r42
            r10 = r89
            r11 = r90
            r1 = r238
            r13 = r7
            r7 = r88
            goto L1862
        L1810:
            wb.vk r0 = new wb.vk
            r10 = r12
            r12 = r5
            r5 = r10
            r10 = r11
            r11 = r7
            r7 = r10
            r188 = r1
            r182 = r2
            r183 = r3
            r187 = r4
            r185 = r6
            r4 = r13
            r3 = r14
            r6 = r15
            r186 = r23
            r13 = r25
            r181 = r26
            r184 = r27
            r175 = r28
            r174 = r35
            r176 = r36
            r180 = r37
            r10 = r39
            r179 = r40
            r177 = r41
            r178 = r42
            r15 = r88
            r16 = r89
            r14 = r90
            r2 = r125
            r1 = r238
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r43 = r13
            r13 = r11
            r11 = r14
            r14 = r43
            r45 = r3
            r43 = r4
            r84 = r6
            r46 = r9
            r6 = r241
            r9 = r7
            r7 = r15
            r15 = r10
            r10 = r16
            r6.k0(r0)
        L1862:
            r55 = r0
            fg.a r55 = (fg.a) r55
            r4 = r187
            boolean r0 = r6.f(r4)
            boolean r2 = r6.h(r1)
            r0 = r0 | r2
            r2 = r175
            boolean r3 = r6.f(r2)
            r0 = r0 | r3
            r3 = r183
            boolean r16 = r6.f(r3)
            r0 = r0 | r16
            r16 = r0
            java.lang.Object r0 = r6.P()
            r83 = r5
            r5 = r188
            if (r16 != 0) goto L18a9
            if (r0 != r5) goto L188f
            goto L18a9
        L188f:
            r88 = r7
            r89 = r10
            r90 = r11
            r116 = r13
            r120 = r14
            r39 = r15
            r11 = r43
            r15 = r45
            r14 = r46
            r10 = r83
            r7 = r84
            r189 = r125
            r13 = r5
            goto L18d9
        L18a9:
            c9.n0 r0 = new c9.n0
            r113 = r5
            r5 = 24
            r39 = r4
            r4 = r3
            r3 = r39
            r88 = r7
            r89 = r10
            r90 = r11
            r116 = r13
            r120 = r14
            r39 = r15
            r11 = r43
            r15 = r45
            r14 = r46
            r10 = r83
            r7 = r84
            r13 = r113
            r189 = r125
            r0.<init>(r1, r2, r3, r4, r5)
            r236 = r4
            r4 = r3
            r3 = r236
            r6.k0(r0)
        L18d9:
            r104 = r0
            fg.a r104 = (fg.a) r104
            boolean r0 = r6.f(r3)
            boolean r5 = r6.h(r1)
            r0 = r0 | r5
            java.lang.Object r5 = r6.P()
            if (r0 != 0) goto L18f1
            if (r5 != r13) goto L18ef
            goto L18f1
        L18ef:
            r0 = 0
            goto L18fa
        L18f1:
            wb.ns r5 = new wb.ns
            r0 = 0
            r5.<init>(r1, r3, r0)
            r6.k0(r5)
        L18fa:
            r108 = r5
            fg.l r108 = (fg.l) r108
            r5 = r184
            boolean r16 = r6.f(r5)
            java.lang.Object r0 = r6.P()
            if (r16 != 0) goto L1910
            if (r0 != r13) goto L190d
            goto L1910
        L190d:
            r137 = r2
            goto L191c
        L1910:
            wb.i6 r0 = new wb.i6
            r137 = r2
            r2 = 8
            r0.<init>(r5, r2)
            r6.k0(r0)
        L191c:
            r110 = r0
            fg.a r110 = (fg.a) r110
            r0 = r186
            boolean r2 = r6.f(r0)
            r16 = r2
            java.lang.Object r2 = r6.P()
            if (r16 != 0) goto L1934
            if (r2 != r13) goto L1931
            goto L1934
        L1931:
            r65 = r4
            goto L193f
        L1934:
            wb.h6 r2 = new wb.h6
            r65 = r4
            r4 = 6
            r2.<init>(r0, r4)
            r6.k0(r2)
        L193f:
            r111 = r2
            fg.l r111 = (fg.l) r111
            r0 = r185
            boolean r2 = r6.f(r0)
            r4 = r182
            boolean r16 = r6.f(r4)
            r2 = r2 | r16
            boolean r16 = r6.f(r3)
            r2 = r2 | r16
            boolean r16 = r6.f(r5)
            r2 = r2 | r16
            java.lang.Object r0 = r6.P()
            if (r2 != 0) goto L196c
            if (r0 != r13) goto L1966
            goto L196c
        L1966:
            r2 = r4
            r27 = r5
            r4 = r185
            goto L1984
        L196c:
            c9.k r23 = new c9.k
            r28 = 29
            r26 = r3
            r25 = r4
            r27 = r5
            r24 = r185
            r23.<init>(r24, r25, r26, r27, r28)
            r0 = r23
            r4 = r24
            r2 = r25
            r6.k0(r0)
        L1984:
            r112 = r0
            fg.l r112 = (fg.l) r112
            boolean r0 = r6.f(r4)
            boolean r5 = r6.h(r1)
            r0 = r0 | r5
            java.lang.Object r5 = r6.P()
            if (r0 != 0) goto L1999
            if (r5 != r13) goto L19a1
        L1999:
            wb.ns r5 = new wb.ns
            r5.<init>(r4, r1)
            r6.k0(r5)
        L19a1:
            r113 = r5
            fg.l r113 = (fg.l) r113
            boolean r0 = r6.f(r4)
            boolean r5 = r6.f(r12)
            r0 = r0 | r5
            boolean r5 = r6.f(r15)
            r0 = r0 | r5
            boolean r5 = r6.f(r11)
            r0 = r0 | r5
            boolean r5 = r6.f(r10)
            r0 = r0 | r5
            boolean r5 = r6.f(r7)
            r0 = r0 | r5
            boolean r5 = r6.f(r9)
            r0 = r0 | r5
            boolean r5 = r6.f(r8)
            r0 = r0 | r5
            boolean r5 = r6.f(r14)
            r0 = r0 | r5
            r5 = r116
            boolean r16 = r6.f(r5)
            r0 = r0 | r16
            boolean r16 = r6.h(r1)
            r0 = r0 | r16
            r16 = r0
            r0 = r39
            boolean r17 = r6.f(r0)
            r16 = r16 | r17
            r0 = r189
            boolean r17 = r6.h(r0)
            r16 = r16 | r17
            r125 = r0
            r0 = r120
            boolean r17 = r6.f(r0)
            r16 = r16 | r17
            r25 = r0
            r0 = r90
            boolean r17 = r6.f(r0)
            r16 = r16 | r17
            r0 = r88
            boolean r17 = r6.f(r0)
            r16 = r16 | r17
            r0 = r89
            boolean r17 = r6.f(r0)
            r16 = r16 | r17
            java.lang.Object r0 = r6.P()
            if (r16 != 0) goto L1a3c
            if (r0 != r13) goto L1a1e
            goto L1a3c
        L1a1e:
            r191 = r2
            r192 = r3
            r2 = r6
            r6 = r8
            r34 = r9
            r4 = r11
            r195 = r13
            r9 = r14
            r14 = r15
            r3 = r25
            r193 = r27
            r15 = r39
            r194 = r65
            r11 = r90
            r190 = r137
            r163 = 0
            r13 = r5
            r5 = r10
            goto L1a78
        L1a3c:
            wb.d9 r0 = new wb.d9
            r6 = r8
            r8 = r7
            r7 = r10
            r10 = r6
            r191 = r2
            r192 = r3
            r6 = r11
            r2 = r12
            r195 = r13
            r11 = r14
            r14 = r25
            r193 = r27
            r12 = r39
            r194 = r65
            r16 = r88
            r17 = r89
            r190 = r137
            r163 = 0
            r3 = r1
            r1 = r4
            r13 = r5
            r5 = r15
            r15 = r90
            r4 = r125
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = r3
            r4 = r6
            r34 = r9
            r6 = r10
            r9 = r11
            r3 = r14
            r11 = r15
            r14 = r5
            r5 = r7
            r7 = r8
            r15 = r12
            r12 = r2
            r2 = r241
            r2.k0(r0)
        L1a78:
            r90 = r0
            fg.l r90 = (fg.l) r90
            java.lang.Object r0 = r2.P()
            r8 = r195
            if (r0 != r8) goto L1a93
            wb.jp r0 = new wb.jp
            r10 = 19
            r116 = r13
            r13 = r146
            r0.<init>(r13, r10)
            r2.k0(r0)
            goto L1a97
        L1a93:
            r116 = r13
            r13 = r146
        L1a97:
            r114 = r0
            fg.a r114 = (fg.a) r114
            java.lang.Object r0 = r2.P()
            if (r0 != r8) goto L1ab0
            wb.jp r0 = new wb.jp
            r10 = 20
            r30 = r13
            r13 = r153
            r0.<init>(r13, r10)
            r2.k0(r0)
            goto L1ab4
        L1ab0:
            r30 = r13
            r13 = r153
        L1ab4:
            r115 = r0
            fg.a r115 = (fg.a) r115
            java.lang.Object r0 = r2.P()
            if (r0 != r8) goto L1acd
            wb.jp r0 = new wb.jp
            r10 = 21
            r25 = r13
            r13 = r147
            r0.<init>(r13, r10)
            r2.k0(r0)
            goto L1ad1
        L1acd:
            r25 = r13
            r13 = r147
        L1ad1:
            r117 = r0
            fg.a r117 = (fg.a) r117
            boolean r0 = r2.f(r5)
            boolean r10 = r2.f(r7)
            r0 = r0 | r10
            r10 = r168
            boolean r16 = r2.f(r10)
            r0 = r0 | r16
            r16 = r0
            r0 = r169
            boolean r17 = r2.f(r0)
            r16 = r16 | r17
            r78 = r0
            r0 = r166
            boolean r17 = r2.f(r0)
            r16 = r16 | r17
            r79 = r0
            r0 = r170
            boolean r17 = r2.f(r0)
            r16 = r16 | r17
            r80 = r0
            r0 = r167
            boolean r17 = r2.f(r0)
            r16 = r16 | r17
            r81 = r0
            r0 = r171
            boolean r17 = r2.f(r0)
            r16 = r16 | r17
            r82 = r0
            java.lang.Object r0 = r2.P()
            if (r16 != 0) goto L1b3a
            if (r0 != r8) goto L1b23
            goto L1b3a
        L1b23:
            r43 = r4
            r4 = r7
            r126 = r8
            r46 = r9
            r147 = r13
            r45 = r14
            r8 = r78
            r7 = r79
            r14 = r80
            r9 = r82
            r13 = r5
            r5 = r81
            goto L1b64
        L1b3a:
            wb.b9 r75 = new wb.b9
            r76 = 3
            r83 = r5
            r84 = r7
            r77 = r10
            r75.<init>(r76, r77, r78, r79, r80, r81, r82, r83, r84)
            r43 = r4
            r126 = r8
            r46 = r9
            r147 = r13
            r45 = r14
            r0 = r75
            r8 = r78
            r7 = r79
            r14 = r80
            r5 = r81
            r9 = r82
            r13 = r83
            r4 = r84
            r2.k0(r0)
        L1b64:
            r75 = r0
            fg.a r75 = (fg.a) r75
            boolean r0 = r2.f(r12)
            boolean r16 = r2.f(r3)
            r0 = r0 | r16
            r16 = r0
            r0 = r194
            boolean r17 = r2.f(r0)
            r16 = r16 | r17
            boolean r17 = r2.f(r13)
            r16 = r16 | r17
            boolean r17 = r2.f(r4)
            r16 = r16 | r17
            boolean r17 = r2.f(r10)
            r16 = r16 | r17
            boolean r17 = r2.f(r8)
            r16 = r16 | r17
            boolean r17 = r2.f(r7)
            r16 = r16 | r17
            boolean r17 = r2.f(r14)
            r16 = r16 | r17
            boolean r17 = r2.f(r5)
            r16 = r16 | r17
            boolean r17 = r2.f(r9)
            r16 = r16 | r17
            boolean r17 = r2.f(r15)
            r16 = r16 | r17
            boolean r17 = r2.f(r6)
            r16 = r16 | r17
            boolean r17 = r2.h(r1)
            r16 = r16 | r17
            r65 = r0
            r0 = r180
            boolean r17 = r2.f(r0)
            r16 = r16 | r17
            r37 = r0
            r0 = r181
            boolean r17 = r2.f(r0)
            r16 = r16 | r17
            r38 = r0
            r0 = r177
            boolean r17 = r2.f(r0)
            r16 = r16 | r17
            r41 = r0
            r0 = r178
            boolean r17 = r2.f(r0)
            r16 = r16 | r17
            boolean r17 = r2.f(r11)
            r16 = r16 | r17
            r42 = r0
            r0 = r43
            boolean r17 = r2.f(r0)
            r16 = r16 | r17
            r0 = r46
            boolean r17 = r2.f(r0)
            r16 = r16 | r17
            r0 = r45
            boolean r17 = r2.f(r0)
            r16 = r16 | r17
            r0 = r116
            boolean r17 = r2.f(r0)
            r16 = r16 | r17
            r0 = r190
            boolean r17 = r2.f(r0)
            r16 = r16 | r17
            r28 = r0
            r0 = r174
            boolean r17 = r2.h(r0)
            r16 = r16 | r17
            r35 = r0
            java.lang.Object r0 = r2.P()
            r1 = r126
            if (r16 != 0) goto L1c5f
            if (r0 != r1) goto L1c2d
            goto L1c5f
        L1c2d:
            r200 = r1
            r44 = r11
            r39 = r15
            r23 = r20
            r26 = r22
            r148 = r25
            r146 = r30
            r196 = r34
            r201 = r43
            r203 = r45
            r202 = r46
            r30 = r63
            r24 = r64
            r197 = r88
            r198 = r89
            r199 = r125
            r11 = r4
            r15 = r13
            r13 = r14
            r25 = r18
            r22 = r19
            r4 = r3
            r14 = r8
            r3 = r12
            r8 = r65
            r12 = r9
            r9 = r5
            r5 = r35
            goto L1cdb
        L1c5f:
            wb.lc r0 = new wb.lc
            r180 = r37
            r37 = 2
            r2 = r11
            r11 = r5
            r5 = r13
            r13 = r15
            r15 = r19
            r19 = r22
            r22 = r29
            r29 = r2
            r200 = r1
            r2 = r12
            r16 = r20
            r17 = r21
            r148 = r25
            r146 = r30
            r196 = r34
            r26 = r38
            r27 = r41
            r30 = r43
            r32 = r45
            r31 = r46
            r36 = r48
            r20 = r60
            r21 = r61
            r23 = r63
            r24 = r64
            r197 = r88
            r198 = r89
            r33 = r116
            r199 = r125
            r25 = r180
            r1 = r238
            r12 = r9
            r34 = r28
            r28 = r42
            r9 = r7
            r7 = r10
            r10 = r14
            r14 = r6
            r6 = r4
            r4 = r65
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r39 = r13
            r37 = r25
            r44 = r29
            r201 = r30
            r202 = r31
            r203 = r32
            r28 = r34
            r13 = r10
            r21 = r17
            r25 = r18
            r26 = r19
            r29 = r22
            r30 = r23
            r10 = r7
            r7 = r9
            r9 = r11
            r22 = r15
            r23 = r16
            r15 = r5
            r11 = r6
            r6 = r14
            r5 = r35
            r14 = r8
            r8 = r4
            r4 = r3
            r3 = r2
            r2 = r241
            r2.k0(r0)
        L1cdb:
            r76 = r0
            fg.a r76 = (fg.a) r76
            java.lang.Object r0 = r2.P()
            r1 = r200
            if (r0 != r1) goto L1cf8
            wb.jp r0 = new wb.jp
            r35 = r5
            r5 = 22
            r32 = r6
            r6 = r87
            r0.<init>(r6, r5)
            r2.k0(r0)
            goto L1cfe
        L1cf8:
            r35 = r5
            r32 = r6
            r6 = r87
        L1cfe:
            r77 = r0
            fg.a r77 = (fg.a) r77
            boolean r0 = r2.f(r3)
            boolean r5 = r2.f(r4)
            r0 = r0 | r5
            boolean r5 = r2.f(r8)
            r0 = r0 | r5
            boolean r5 = r2.f(r15)
            r0 = r0 | r5
            boolean r5 = r2.f(r11)
            r0 = r0 | r5
            boolean r5 = r2.f(r10)
            r0 = r0 | r5
            boolean r5 = r2.f(r14)
            r0 = r0 | r5
            boolean r5 = r2.f(r7)
            r0 = r0 | r5
            boolean r5 = r2.f(r13)
            r0 = r0 | r5
            boolean r5 = r2.f(r9)
            r0 = r0 | r5
            boolean r5 = r2.f(r12)
            r0 = r0 | r5
            java.lang.Object r5 = r2.P()
            if (r0 != 0) goto L1d4e
            if (r5 != r1) goto L1d41
            goto L1d4e
        L1d41:
            r0 = r9
            r84 = r11
            r82 = r12
            r80 = r13
            r78 = r14
            r12 = r3
            r3 = r4
            r4 = r8
            goto L1d7e
        L1d4e:
            nb.a0 r62 = new nb.a0
            r63 = r3
            r64 = r4
            r70 = r7
            r65 = r8
            r72 = r9
            r68 = r10
            r67 = r11
            r73 = r12
            r71 = r13
            r69 = r14
            r66 = r15
            r62.<init>(r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74)
            r5 = r62
            r12 = r63
            r3 = r64
            r4 = r65
            r84 = r67
            r78 = r69
            r80 = r71
            r0 = r72
            r82 = r73
            r2.k0(r5)
        L1d7e:
            r62 = r5
            fg.a r62 = (fg.a) r62
            boolean r5 = r2.f(r12)
            boolean r8 = r2.f(r3)
            r5 = r5 | r8
            boolean r8 = r2.f(r4)
            r5 = r5 | r8
            boolean r8 = r2.f(r15)
            r5 = r5 | r8
            boolean r8 = r2.f(r10)
            r5 = r5 | r8
            boolean r8 = r2.f(r7)
            r5 = r5 | r8
            boolean r8 = r2.f(r0)
            r5 = r5 | r8
            r8 = r32
            boolean r9 = r2.f(r8)
            r5 = r5 | r9
            r9 = r196
            boolean r11 = r2.f(r9)
            r5 = r5 | r11
            r14 = r35
            boolean r11 = r2.h(r14)
            r5 = r5 | r11
            r11 = r238
            boolean r13 = r2.h(r11)
            r5 = r5 | r13
            r13 = r41
            boolean r16 = r2.f(r13)
            r5 = r5 | r16
            r81 = r0
            r0 = r37
            boolean r16 = r2.f(r0)
            r5 = r5 | r16
            r0 = r116
            boolean r16 = r2.f(r0)
            r5 = r5 | r16
            r0 = r38
            boolean r16 = r2.f(r0)
            r5 = r5 | r16
            r0 = r39
            boolean r16 = r2.f(r0)
            r5 = r5 | r16
            r0 = r191
            boolean r16 = r2.f(r0)
            r5 = r5 | r16
            r182 = r0
            r0 = r192
            boolean r16 = r2.f(r0)
            r5 = r5 | r16
            r183 = r0
            r0 = r193
            boolean r16 = r2.f(r0)
            r5 = r5 | r16
            r27 = r0
            java.lang.Object r0 = r2.P()
            if (r5 != 0) goto L1e38
            if (r0 != r1) goto L1e11
            goto L1e38
        L1e11:
            r211 = r1
            r87 = r6
            r6 = r8
            r1 = r11
            r41 = r13
            r5 = r14
            r204 = r28
            r205 = r42
            r206 = r44
            r207 = r78
            r208 = r80
            r209 = r82
            r210 = r84
            r8 = r3
            r13 = r4
            r11 = r7
            r14 = r10
            r7 = r12
            r12 = r15
            r10 = r27
            r15 = r81
            r4 = r182
            r3 = r183
            goto L1e83
        L1e38:
            wb.os r0 = new wb.os
            r211 = r1
            r2 = r3
            r3 = r4
            r87 = r6
            r6 = r7
            r5 = r10
            r10 = r11
            r1 = r12
            r11 = r13
            r20 = r14
            r4 = r15
            r18 = r27
            r204 = r28
            r12 = r37
            r14 = r38
            r15 = r39
            r205 = r42
            r206 = r44
            r19 = r48
            r207 = r78
            r208 = r80
            r7 = r81
            r209 = r82
            r210 = r84
            r13 = r116
            r16 = r182
            r17 = r183
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r41 = r11
            r13 = r3
            r12 = r4
            r14 = r5
            r11 = r6
            r15 = r7
            r6 = r8
            r4 = r16
            r3 = r17
            r5 = r20
            r7 = r1
            r8 = r2
            r1 = r10
            r10 = r18
            r2 = r241
            r2.k0(r0)
        L1e83:
            r63 = r0
            fg.l r63 = (fg.l) r63
            boolean r0 = r2.f(r6)
            boolean r16 = r2.h(r1)
            r0 = r0 | r16
            boolean r16 = r2.f(r10)
            r0 = r0 | r16
            r16 = r0
            java.lang.Object r0 = r2.P()
            r35 = r5
            r5 = r211
            if (r16 != 0) goto L1eaa
            if (r0 != r5) goto L1ea6
            goto L1eaa
        L1ea6:
            r126 = r5
            r5 = 7
            goto L1eb5
        L1eaa:
            wb.dj r0 = new wb.dj
            r126 = r5
            r5 = 7
            r0.<init>(r1, r6, r10, r5)
            r2.k0(r0)
        L1eb5:
            r64 = r0
            fg.l r64 = (fg.l) r64
            boolean r0 = r2.f(r7)
            boolean r16 = r2.f(r8)
            r0 = r0 | r16
            boolean r16 = r2.f(r13)
            r0 = r0 | r16
            boolean r16 = r2.f(r6)
            r0 = r0 | r16
            boolean r16 = r2.f(r9)
            r0 = r0 | r16
            boolean r16 = r2.h(r1)
            r0 = r0 | r16
            boolean r16 = r2.f(r4)
            r0 = r0 | r16
            boolean r16 = r2.f(r3)
            r0 = r0 | r16
            boolean r16 = r2.f(r10)
            r0 = r0 | r16
            boolean r16 = r2.f(r12)
            r0 = r0 | r16
            r5 = r210
            boolean r17 = r2.f(r5)
            r0 = r0 | r17
            boolean r17 = r2.f(r14)
            r0 = r0 | r17
            r17 = r0
            r0 = r207
            boolean r18 = r2.f(r0)
            r17 = r17 | r18
            boolean r18 = r2.f(r11)
            r17 = r17 | r18
            r78 = r0
            r0 = r208
            boolean r18 = r2.f(r0)
            r17 = r17 | r18
            boolean r18 = r2.f(r15)
            r17 = r17 | r18
            r80 = r0
            r0 = r209
            boolean r18 = r2.f(r0)
            r17 = r17 | r18
            r82 = r0
            r0 = r176
            boolean r18 = r2.f(r0)
            r17 = r17 | r18
            r36 = r0
            r0 = r204
            boolean r18 = r2.f(r0)
            r17 = r17 | r18
            r28 = r0
            r0 = r35
            boolean r18 = r2.h(r0)
            r17 = r17 | r18
            r0 = r37
            boolean r18 = r2.f(r0)
            r17 = r17 | r18
            r0 = r38
            boolean r18 = r2.f(r0)
            r17 = r17 | r18
            r0 = r39
            boolean r18 = r2.f(r0)
            r17 = r17 | r18
            r0 = r179
            boolean r18 = r2.f(r0)
            r17 = r17 | r18
            r40 = r0
            r0 = r41
            boolean r18 = r2.f(r0)
            r17 = r17 | r18
            r0 = r205
            boolean r18 = r2.f(r0)
            r17 = r17 | r18
            r42 = r0
            r0 = r201
            boolean r18 = r2.f(r0)
            r17 = r17 | r18
            r43 = r0
            r0 = r202
            boolean r18 = r2.f(r0)
            r17 = r17 | r18
            r46 = r0
            r0 = r203
            boolean r18 = r2.f(r0)
            r17 = r17 | r18
            r45 = r0
            r0 = r197
            boolean r18 = r2.f(r0)
            r17 = r17 | r18
            r88 = r0
            r0 = r198
            boolean r18 = r2.f(r0)
            r17 = r17 | r18
            r89 = r0
            r0 = r206
            boolean r18 = r2.f(r0)
            r17 = r17 | r18
            r121 = r0
            r0 = r116
            boolean r18 = r2.f(r0)
            r17 = r17 | r18
            r0 = r199
            boolean r18 = r2.h(r0)
            r17 = r17 | r18
            r125 = r0
            java.lang.Object r0 = r2.P()
            r1 = r126
            if (r17 != 0) goto L200f
            if (r0 != r1) goto L1fd6
            goto L200f
        L1fd6:
            r212 = r1
            r219 = r5
            r27 = r10
            r10 = r11
            r19 = r22
            r20 = r23
            r18 = r25
            r23 = r26
            r22 = r29
            r5 = r35
            r11 = r41
            r220 = r43
            r222 = r45
            r221 = r46
            r216 = r78
            r217 = r80
            r218 = r82
            r213 = r88
            r214 = r89
            r215 = r121
            r223 = r125
            r1 = r238
            r26 = r3
            r29 = r4
            r4 = r7
            r3 = r8
            r7 = r13
            r8 = r37
            r13 = r12
            r12 = r42
            goto L20a7
        L200f:
            wb.ps r0 = new wb.ps
            r212 = r1
            r2 = r7
            r17 = r15
            r19 = r22
            r20 = r23
            r22 = r25
            r23 = r26
            r7 = r28
            r26 = r29
            r27 = r30
            r31 = r35
            r30 = r36
            r33 = r37
            r34 = r38
            r35 = r39
            r36 = r40
            r37 = r41
            r38 = r42
            r39 = r43
            r41 = r45
            r40 = r46
            r32 = r48
            r25 = r61
            r29 = r74
            r16 = r80
            r18 = r82
            r42 = r88
            r43 = r89
            r46 = r116
            r44 = r121
            r45 = r125
            r1 = r238
            r15 = r11
            r11 = r12
            r28 = r24
            r24 = r60
            r12 = r5
            r5 = r6
            r6 = r9
            r9 = r3
            r3 = r8
            r8 = r4
            r4 = r13
            r13 = r14
            r14 = r78
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            r219 = r12
            r216 = r14
            r217 = r16
            r218 = r18
            r18 = r22
            r22 = r26
            r24 = r28
            r12 = r38
            r220 = r39
            r221 = r40
            r222 = r41
            r213 = r42
            r214 = r43
            r215 = r44
            r223 = r45
            r28 = r7
            r29 = r8
            r26 = r9
            r14 = r13
            r8 = r33
            r38 = r34
            r39 = r35
            r40 = r36
            r7 = r4
            r9 = r6
            r13 = r11
            r36 = r30
            r11 = r37
            r4 = r2
            r6 = r5
            r30 = r27
            r5 = r31
            r2 = r241
            r27 = r10
            r10 = r15
            r15 = r17
            r2.k0(r0)
        L20a7:
            r65 = r0
            fg.l r65 = (fg.l) r65
            boolean r0 = r2.f(r4)
            boolean r16 = r2.f(r3)
            r0 = r0 | r16
            boolean r16 = r2.f(r7)
            r0 = r0 | r16
            boolean r16 = r2.f(r13)
            r0 = r0 | r16
            boolean r16 = r2.f(r14)
            r0 = r0 | r16
            boolean r16 = r2.f(r10)
            r0 = r0 | r16
            boolean r16 = r2.f(r15)
            r0 = r0 | r16
            boolean r16 = r2.f(r6)
            r0 = r0 | r16
            boolean r16 = r2.h(r1)
            r0 = r0 | r16
            boolean r16 = r2.f(r9)
            r0 = r0 | r16
            boolean r16 = r2.h(r5)
            r0 = r0 | r16
            boolean r16 = r2.f(r11)
            r0 = r0 | r16
            boolean r16 = r2.f(r12)
            r0 = r0 | r16
            boolean r16 = r2.f(r8)
            r0 = r0 | r16
            r16 = r0
            r0 = r116
            boolean r17 = r2.f(r0)
            r16 = r16 | r17
            r0 = r38
            boolean r17 = r2.f(r0)
            r16 = r16 | r17
            r0 = r39
            boolean r17 = r2.f(r0)
            r16 = r16 | r17
            r0 = r29
            boolean r17 = r2.f(r0)
            r16 = r16 | r17
            r0 = r26
            boolean r17 = r2.f(r0)
            r16 = r16 | r17
            r0 = r27
            boolean r17 = r2.f(r0)
            r16 = r16 | r17
            r0 = r219
            boolean r17 = r2.f(r0)
            r16 = r16 | r17
            r84 = r0
            r0 = r216
            boolean r17 = r2.f(r0)
            r16 = r16 | r17
            r78 = r0
            r0 = r217
            boolean r17 = r2.f(r0)
            r16 = r16 | r17
            r80 = r0
            r0 = r218
            boolean r17 = r2.f(r0)
            r16 = r16 | r17
            r82 = r0
            r0 = r36
            boolean r17 = r2.f(r0)
            r16 = r16 | r17
            r0 = r28
            boolean r17 = r2.f(r0)
            r16 = r16 | r17
            r0 = r40
            boolean r17 = r2.f(r0)
            r16 = r16 | r17
            r0 = r220
            boolean r17 = r2.f(r0)
            r16 = r16 | r17
            r43 = r0
            r0 = r221
            boolean r17 = r2.f(r0)
            r16 = r16 | r17
            r46 = r0
            r0 = r222
            boolean r17 = r2.f(r0)
            r16 = r16 | r17
            r45 = r0
            r0 = r213
            boolean r17 = r2.f(r0)
            r16 = r16 | r17
            r88 = r0
            r0 = r214
            boolean r17 = r2.f(r0)
            r16 = r16 | r17
            r89 = r0
            r0 = r215
            boolean r17 = r2.f(r0)
            r16 = r16 | r17
            r121 = r0
            r0 = r223
            boolean r17 = r2.h(r0)
            r16 = r16 | r17
            r125 = r0
            java.lang.Object r0 = r2.P()
            r1 = r212
            if (r16 != 0) goto L21d5
            if (r0 != r1) goto L21c0
            goto L21d5
        L21c0:
            r42 = r4
            r4 = r3
            r3 = r42
            r224 = r1
            r42 = r12
            r1 = r238
            r12 = r8
            r8 = r7
            r7 = r10
            r10 = r15
            r15 = r14
            r14 = r13
            r13 = r116
            goto L2246
        L21d5:
            wb.ps r0 = new wb.ps
            r2 = r9
            r9 = r6
            r6 = r14
            r14 = r23
            r23 = r12
            r12 = r21
            r21 = r2
            r224 = r1
            r2 = r4
            r37 = r5
            r4 = r7
            r7 = r10
            r5 = r13
            r13 = r18
            r10 = r19
            r17 = r22
            r19 = r24
            r31 = r27
            r18 = r30
            r27 = r39
            r39 = r40
            r40 = r43
            r42 = r45
            r41 = r46
            r16 = r61
            r33 = r78
            r34 = r80
            r35 = r82
            r32 = r84
            r43 = r88
            r44 = r89
            r25 = r116
            r45 = r121
            r46 = r125
            r1 = r238
            r24 = r8
            r22 = r11
            r8 = r15
            r11 = r20
            r30 = r26
            r26 = r38
            r38 = r48
            r15 = r60
            r20 = r74
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            r14 = r5
            r15 = r6
            r10 = r8
            r6 = r9
            r9 = r21
            r11 = r22
            r42 = r23
            r12 = r24
            r13 = r25
            r39 = r27
            r5 = r37
            r8 = r4
            r38 = r26
            r4 = r3
            r3 = r2
            r2 = r241
            r2.k0(r0)
        L2246:
            r40 = r0
            fg.l r40 = (fg.l) r40
            boolean r0 = r2.f(r6)
            boolean r16 = r2.f(r3)
            r0 = r0 | r16
            boolean r16 = r2.f(r4)
            r0 = r0 | r16
            boolean r16 = r2.f(r8)
            r0 = r0 | r16
            boolean r16 = r2.f(r14)
            r0 = r0 | r16
            boolean r16 = r2.f(r15)
            r0 = r0 | r16
            boolean r16 = r2.f(r7)
            r0 = r0 | r16
            boolean r16 = r2.f(r10)
            r0 = r0 | r16
            boolean r16 = r2.f(r9)
            r0 = r0 | r16
            boolean r16 = r2.h(r5)
            r0 = r0 | r16
            boolean r16 = r2.h(r1)
            r0 = r0 | r16
            boolean r16 = r2.f(r11)
            r0 = r0 | r16
            boolean r16 = r2.f(r12)
            r0 = r0 | r16
            boolean r16 = r2.f(r13)
            r0 = r0 | r16
            r16 = r0
            r0 = r38
            boolean r17 = r2.f(r0)
            r16 = r16 | r17
            r0 = r39
            boolean r17 = r2.f(r0)
            r16 = r16 | r17
            java.lang.Object r0 = r2.P()
            r1 = r224
            if (r16 != 0) goto L22c4
            if (r0 != r1) goto L22b9
            goto L22c4
        L22b9:
            r228 = r1
            r225 = r28
            r226 = r36
            r227 = r42
            r1 = r238
            goto L22ef
        L22c4:
            wb.vd r0 = new wb.vd
            r228 = r1
            r2 = r3
            r3 = r4
            r16 = r5
            r1 = r6
            r4 = r8
            r8 = r10
            r5 = r14
            r6 = r15
            r225 = r28
            r226 = r36
            r14 = r38
            r15 = r39
            r227 = r42
            r10 = r238
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r14 = r5
            r15 = r6
            r5 = r16
            r6 = r1
            r1 = r10
            r10 = r8
            r8 = r4
            r4 = r3
            r3 = r2
            r2 = r241
            r2.k0(r0)
        L22ef:
            r41 = r0
            fg.l r41 = (fg.l) r41
            boolean r0 = r2.f(r3)
            boolean r16 = r2.f(r4)
            r0 = r0 | r16
            boolean r16 = r2.f(r8)
            r0 = r0 | r16
            boolean r16 = r2.f(r14)
            r0 = r0 | r16
            boolean r16 = r2.f(r15)
            r0 = r0 | r16
            boolean r16 = r2.f(r7)
            r0 = r0 | r16
            boolean r16 = r2.f(r10)
            r0 = r0 | r16
            boolean r16 = r2.f(r6)
            r0 = r0 | r16
            boolean r16 = r2.f(r11)
            r0 = r0 | r16
            boolean r16 = r2.f(r9)
            r0 = r0 | r16
            boolean r16 = r2.h(r5)
            r0 = r0 | r16
            boolean r16 = r2.h(r1)
            r0 = r0 | r16
            boolean r16 = r2.f(r12)
            r0 = r0 | r16
            boolean r16 = r2.f(r13)
            r0 = r0 | r16
            r16 = r0
            r0 = r38
            boolean r17 = r2.f(r0)
            r16 = r16 | r17
            r0 = r39
            boolean r17 = r2.f(r0)
            r16 = r16 | r17
            java.lang.Object r0 = r2.P()
            r1 = r228
            if (r16 != 0) goto L236c
            if (r0 != r1) goto L2362
            goto L236c
        L2362:
            r229 = r1
            r12 = r3
            r3 = r4
            r4 = r8
            r8 = r10
            r10 = r15
            r1 = r238
            goto L2399
        L236c:
            wb.d9 r0 = new wb.d9
            r229 = r1
            r1 = r3
            r2 = r4
            r17 = r5
            r3 = r8
            r4 = r14
            r5 = r15
            r14 = r38
            r15 = r39
            r16 = r48
            r8 = r6
            r6 = r7
            r7 = r10
            r10 = r9
            r9 = r11
            r11 = r238
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r9 = r7
            r7 = r6
            r6 = r8
            r8 = r9
            r12 = r1
            r14 = r4
            r9 = r10
            r1 = r11
            r4 = r3
            r10 = r5
            r5 = r17
            r3 = r2
            r2 = r241
            r2.k0(r0)
        L2399:
            r42 = r0
            fg.l r42 = (fg.l) r42
            boolean r0 = r2.f(r12)
            boolean r11 = r2.f(r3)
            r0 = r0 | r11
            boolean r11 = r2.f(r4)
            r0 = r0 | r11
            boolean r11 = r2.f(r14)
            r0 = r0 | r11
            boolean r11 = r2.f(r10)
            r0 = r0 | r11
            boolean r11 = r2.f(r7)
            r0 = r0 | r11
            boolean r11 = r2.f(r8)
            r0 = r0 | r11
            boolean r11 = r2.f(r6)
            r0 = r0 | r11
            r11 = r225
            boolean r13 = r2.f(r11)
            r0 = r0 | r13
            r13 = r226
            boolean r15 = r2.f(r13)
            r0 = r0 | r15
            r15 = r227
            boolean r16 = r2.f(r15)
            r0 = r0 | r16
            boolean r16 = r2.h(r1)
            r0 = r0 | r16
            boolean r16 = r2.f(r9)
            r0 = r0 | r16
            boolean r16 = r2.h(r5)
            r0 = r0 | r16
            r16 = r0
            java.lang.Object r0 = r2.P()
            r1 = r229
            if (r16 != 0) goto L2406
            if (r0 != r1) goto L23f9
            goto L2406
        L23f9:
            r230 = r1
            r10 = r2
            r2 = r11
            r36 = r13
            r7 = r48
            r48 = r52
            r1 = r238
            goto L2439
        L2406:
            wb.ua r0 = new wb.ua
            r2 = r14
            r14 = r5
            r5 = r2
            r2 = r9
            r9 = r6
            r6 = r10
            r10 = r13
            r13 = r2
            r230 = r1
            r1 = r11
            r2 = r12
            r11 = r15
            r15 = r48
            r16 = r52
            r17 = r74
            r21 = r87
            r19 = r146
            r20 = r147
            r18 = r148
            r12 = r238
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r5 = r2
            r2 = r1
            r1 = r12
            r12 = r5
            r6 = r9
            r36 = r10
            r9 = r13
            r5 = r14
            r7 = r15
            r48 = r16
            r10 = r241
            r10.k0(r0)
        L2439:
            r43 = r0
            fg.l r43 = (fg.l) r43
            r3 = r109
            boolean r0 = r10.h(r3)
            boolean r4 = r10.f(r6)
            r0 = r0 | r4
            boolean r4 = r10.f(r2)
            r0 = r0 | r4
            boolean r4 = r10.h(r1)
            r0 = r0 | r4
            boolean r4 = r10.h(r5)
            r0 = r0 | r4
            r4 = r93
            r11 = 32
            if (r4 != r11) goto L2460
            r11 = r86
            goto L2462
        L2460:
            r11 = r163
        L2462:
            r0 = r0 | r11
            java.lang.Object r4 = r10.P()
            r11 = r230
            if (r0 != 0) goto L2475
            if (r4 != r11) goto L246e
            goto L2475
        L246e:
            r28 = r2
            r35 = r5
            r52 = r7
            goto L248e
        L2475:
            wb.n7 r0 = new wb.n7
            r8 = 4
            r4 = r3
            r3 = r2
            r2 = r4
            r4 = r6
            r6 = r5
            r5 = r1
            r1 = r239
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r28 = r3
            r35 = r6
            r52 = r7
            r6 = r4
            r10.k0(r0)
            r4 = r0
        L248e:
            r44 = r4
            fg.a r44 = (fg.a) r44
            r46 = 0
            r138 = r6
            r233 = r9
            r45 = r10
            r235 = r11
            r234 = r12
            r231 = r28
            r136 = r35
            r232 = r36
            r21 = r47
            r0 = r49
            r20 = r50
            r1 = r51
            r2 = r53
            r3 = r54
            r22 = r55
            r4 = r56
            r5 = r57
            r6 = r58
            r7 = r59
            r36 = r62
            r37 = r63
            r38 = r64
            r39 = r65
            r33 = r75
            r34 = r76
            r35 = r77
            r29 = r90
            r8 = r91
            r9 = r92
            r10 = r94
            r11 = r95
            r12 = r96
            r13 = r97
            r14 = r98
            r16 = r100
            r17 = r101
            r18 = r102
            r19 = r103
            r23 = r104
            r24 = r108
            r25 = r110
            r26 = r111
            r27 = r112
            r28 = r113
            r30 = r114
            r31 = r115
            r32 = r117
            r0.O(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            r14 = r45
            r14.s()
        L24fa:
            java.lang.Object r0 = r87.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L282d
            r0 = 933134044(0x379e7edc, float:1.8894141E-5)
            r14.a0(r0)
            java.util.LinkedHashSet r15 = wb.vt.e()
            fb.g1 r0 = fb.g1.f3523a
            java.lang.Object r0 = r138.getValue()
            java.util.List r0 = (java.util.List) r0
            boolean r0 = fb.g1.h(r0)
            if (r0 == 0) goto L2579
            fb.d1 r0 = C0(r136)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r85.iterator()
        L252b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L254a
            java.lang.Object r3 = r2.next()
            r4 = r3
            fb.d1 r4 = (fb.d1) r4
            java.lang.String r4 = r4.b()
            r7 = r231
            boolean r4 = gg.l.a(r4, r7)
            if (r4 != 0) goto L2547
            r1.add(r3)
        L2547:
            r231 = r7
            goto L252b
        L254a:
            r7 = r231
            java.util.ArrayList r0 = tf.m.G1(r1, r0)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L255e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L259f
            java.lang.Object r3 = r0.next()
            r4 = r3
            fb.d1 r4 = (fb.d1) r4
            java.lang.String r4 = r4.b()
            boolean r4 = r1.add(r4)
            if (r4 == 0) goto L255e
            r2.add(r3)
            goto L255e
        L2579:
            r7 = r231
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r85.iterator()
        L2584:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L259f
            java.lang.Object r1 = r0.next()
            r3 = r1
            fb.d1 r3 = (fb.d1) r3
            java.lang.String r3 = r3.b()
            boolean r3 = gg.l.a(r3, r7)
            if (r3 != 0) goto L2584
            r2.add(r1)
            goto L2584
        L259f:
            java.util.ArrayList r0 = wb.vt.c()
            fb.g1 r1 = fb.g1.f3523a
            java.util.ArrayList r0 = tf.m.F1(r2, r0)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L25b7:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L25d2
            java.lang.Object r3 = r0.next()
            r4 = r3
            fb.d1 r4 = (fb.d1) r4
            java.lang.String r4 = r4.b()
            boolean r4 = r1.add(r4)
            if (r4 == 0) goto L25b7
            r2.add(r3)
            goto L25b7
        L25d2:
            fb.r r0 = new fb.r
            r13 = 7
            r0.<init>(r13)
            c9.a0 r1 = new c9.a0
            r3 = 12
            r1.<init>(r0, r3)
            c9.a0 r0 = new c9.a0
            r3 = 13
            r0.<init>(r1, r3)
            java.util.List r16 = tf.m.K1(r2, r0)
            r2 = r234
            boolean r0 = r14.f(r2)
            r9 = r233
            boolean r1 = r14.f(r9)
            r0 = r0 | r1
            r6 = r138
            boolean r1 = r14.f(r6)
            r0 = r0 | r1
            boolean r1 = r14.f(r7)
            r0 = r0 | r1
            r1 = r238
            boolean r3 = r14.h(r1)
            r0 = r0 | r3
            r5 = r136
            boolean r3 = r14.h(r5)
            r0 = r0 | r3
            java.lang.Object r3 = r14.P()
            if (r0 != 0) goto L262c
            r0 = r235
            if (r3 != r0) goto L261e
            r113 = r0
            goto L262e
        L261e:
            r12 = r2
            r2 = r7
            r17 = r15
            r8 = r48
            r48 = r52
            r13 = r87
            r11 = r146
            r15 = r0
            goto L2653
        L262c:
            r113 = r235
        L262e:
            wb.ae r0 = new wb.ae
            r4 = r1
            r1 = r2
            r3 = r7
            r2 = r9
            r17 = r15
            r8 = r48
            r7 = r52
            r9 = r74
            r13 = r87
            r15 = r113
            r11 = r146
            r12 = r147
            r10 = r148
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r48 = r7
            r12 = r1
            r9 = r2
            r2 = r3
            r1 = r4
            r14.k0(r0)
            r3 = r0
        L2653:
            r18 = r3
            fg.a r18 = (fg.a) r18
            boolean r0 = r14.f(r12)
            boolean r3 = r14.f(r9)
            r0 = r0 | r3
            boolean r3 = r14.f(r6)
            r0 = r0 | r3
            boolean r3 = r14.f(r2)
            r0 = r0 | r3
            boolean r3 = r14.h(r1)
            r0 = r0 | r3
            boolean r3 = r14.h(r5)
            r0 = r0 | r3
            java.lang.Object r3 = r14.P()
            if (r0 != 0) goto L2686
            if (r3 != r15) goto L267d
            goto L2686
        L267d:
            r10 = r6
            r146 = r11
            r7 = r48
            r48 = r8
            r11 = r9
            goto L26a4
        L2686:
            wb.qs r0 = new wb.qs
            r4 = r1
            r3 = r2
            r2 = r9
            r1 = r12
            r7 = r48
            r9 = r74
            r12 = r147
            r10 = r148
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r48 = r8
            r146 = r11
            r12 = r1
            r11 = r2
            r2 = r3
            r1 = r4
            r10 = r6
            r14.k0(r0)
            r3 = r0
        L26a4:
            r19 = r3
            fg.l r19 = (fg.l) r19
            boolean r0 = r14.f(r2)
            boolean r3 = r14.h(r5)
            r0 = r0 | r3
            boolean r3 = r14.h(r1)
            r0 = r0 | r3
            r4 = r232
            boolean r3 = r14.f(r4)
            r0 = r0 | r3
            r3 = r105
            boolean r6 = r14.f(r3)
            r0 = r0 | r6
            r6 = r106
            boolean r8 = r14.f(r6)
            r0 = r0 | r8
            r8 = r107
            boolean r9 = r14.f(r8)
            r0 = r0 | r9
            java.lang.Object r9 = r14.P()
            if (r0 != 0) goto L26e1
            if (r9 != r15) goto L26db
            goto L26e1
        L26db:
            r236 = r8
            r8 = r7
            r7 = r236
            goto L26fe
        L26e1:
            wb.rs r0 = new wb.rs
            r9 = 0
            r236 = r3
            r3 = r1
            r1 = r2
            r2 = r5
            r5 = r236
            r236 = r8
            r8 = r7
            r7 = r236
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r236 = r2
            r2 = r1
            r1 = r3
            r3 = r5
            r5 = r236
            r14.k0(r0)
            r9 = r0
        L26fe:
            r20 = r9
            fg.p r20 = (fg.p) r20
            boolean r0 = r14.f(r2)
            boolean r9 = r14.f(r7)
            r0 = r0 | r9
            boolean r9 = r14.h(r1)
            r0 = r0 | r9
            java.lang.Object r9 = r14.P()
            if (r0 != 0) goto L2718
            if (r9 != r15) goto L2720
        L2718:
            wb.ss r9 = new wb.ss
            r9.<init>(r2, r7, r1, r8)
            r14.k0(r9)
        L2720:
            r21 = r9
            fg.l r21 = (fg.l) r21
            boolean r0 = r14.f(r2)
            boolean r9 = r14.h(r5)
            r0 = r0 | r9
            boolean r9 = r14.h(r1)
            r0 = r0 | r9
            boolean r9 = r14.f(r4)
            r0 = r0 | r9
            boolean r9 = r14.f(r3)
            r0 = r0 | r9
            boolean r9 = r14.f(r6)
            r0 = r0 | r9
            boolean r9 = r14.f(r7)
            r0 = r0 | r9
            java.lang.Object r9 = r14.P()
            if (r0 != 0) goto L274e
            if (r9 != r15) goto L276b
        L274e:
            wb.rs r0 = new wb.rs
            r236 = r2
            r2 = r1
            r1 = r236
            r236 = r5
            r5 = r3
            r3 = r236
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r236 = r2
            r2 = r1
            r1 = r236
            r236 = r5
            r5 = r3
            r3 = r236
            r14.k0(r0)
            r9 = r0
        L276b:
            r22 = r9
            fg.p r22 = (fg.p) r22
            boolean r0 = r14.f(r2)
            boolean r9 = r14.h(r5)
            r0 = r0 | r9
            boolean r9 = r14.h(r1)
            r0 = r0 | r9
            boolean r9 = r14.f(r4)
            r0 = r0 | r9
            boolean r9 = r14.f(r3)
            r0 = r0 | r9
            boolean r9 = r14.f(r6)
            r0 = r0 | r9
            boolean r9 = r14.f(r7)
            r0 = r0 | r9
            java.lang.Object r9 = r14.P()
            if (r0 != 0) goto L279c
            if (r9 != r15) goto L279a
            goto L279c
        L279a:
            r7 = r8
            goto L27b1
        L279c:
            wb.rs r0 = new wb.rs
            r9 = 2
            r236 = r3
            r3 = r1
            r1 = r2
            r2 = r5
            r5 = r236
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r5 = r2
            r7 = r8
            r2 = r1
            r1 = r3
            r14.k0(r0)
            r9 = r0
        L27b1:
            r23 = r9
            fg.p r23 = (fg.p) r23
            boolean r0 = r14.h(r1)
            boolean r3 = r14.f(r11)
            r0 = r0 | r3
            boolean r3 = r14.f(r2)
            r0 = r0 | r3
            boolean r3 = r14.f(r12)
            r0 = r0 | r3
            boolean r3 = r14.f(r10)
            r0 = r0 | r3
            boolean r3 = r14.h(r5)
            r0 = r0 | r3
            java.lang.Object r3 = r14.P()
            if (r0 != 0) goto L27de
            if (r3 != r15) goto L27db
            goto L27de
        L27db:
            r28 = r2
            goto L27f8
        L27de:
            wb.qs r0 = new wb.qs
            r6 = r5
            r4 = r7
            r7 = r10
            r3 = r11
            r5 = r12
            r8 = r48
            r9 = r74
            r11 = r146
            r12 = r147
            r10 = r148
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r28 = r2
            r14.k0(r0)
            r3 = r0
        L27f8:
            r10 = r3
            fg.l r10 = (fg.l) r10
            java.lang.Object r0 = r14.P()
            if (r0 != r15) goto L280b
            wb.jp r0 = new wb.jp
            r1 = 24
            r0.<init>(r13, r1)
            r14.k0(r0)
        L280b:
            r11 = r0
            fg.a r11 = (fg.a) r11
            r13 = 3072(0xc00, float:4.305E-42)
            r12 = r14
            r1 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r2 = r28
            r0 = r49
            r0.X(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r0 = r12
            r0.s()
            goto L2837
        L282d:
            r0 = r14
            r1 = 934475600(0x37b2f750, float:2.1334417E-5)
            r0.a0(r1)
            r0.s()
        L2837:
            r0.r()
            goto L283f
        L283b:
            r0 = r10
            r0.V()
        L283f:
            i0.r1 r7 = r0.t()
            if (r7 == 0) goto L2859
            c9.q0 r0 = new c9.q0
            r6 = 27
            r1 = r237
            r2 = r238
            r3 = r239
            r4 = r240
            r5 = r242
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.e(r0)
        L2859:
            return
    }

    public void v(vb.a r38, android.content.SharedPreferences r39, java.util.Set r40, java.util.Set r41, fg.a r42, fg.l r43, i0.h0 r44, int r45) {
            r37 = this;
            r3 = r39
            r0 = r42
            r1 = r44
            r2 = -1701778134(0xffffffff9a90ed2a, float:-5.9940163E-23)
            r1.b0(r2)
            r2 = r38
            boolean r4 = r1.f(r2)
            if (r4 == 0) goto L16
            r4 = 4
            goto L17
        L16:
            r4 = 2
        L17:
            r4 = r45 | r4
            boolean r5 = r1.h(r3)
            if (r5 == 0) goto L22
            r5 = 32
            goto L24
        L22:
            r5 = 16
        L24:
            r4 = r4 | r5
            r5 = r40
            boolean r6 = r1.f(r5)
            if (r6 == 0) goto L30
            r6 = 256(0x100, float:3.59E-43)
            goto L32
        L30:
            r6 = 128(0x80, float:1.8E-43)
        L32:
            r4 = r4 | r6
            r6 = r41
            boolean r7 = r1.f(r6)
            if (r7 == 0) goto L3e
            r7 = 2048(0x800, float:2.87E-42)
            goto L40
        L3e:
            r7 = 1024(0x400, float:1.435E-42)
        L40:
            r4 = r4 | r7
            boolean r7 = r1.h(r0)
            if (r7 == 0) goto L4a
            r7 = 16384(0x4000, float:2.2959E-41)
            goto L4c
        L4a:
            r7 = 8192(0x2000, float:1.148E-41)
        L4c:
            r4 = r4 | r7
            r7 = 74899(0x12493, float:1.04956E-40)
            r7 = r7 & r4
            r8 = 74898(0x12492, float:1.04954E-40)
            r9 = 0
            r10 = 1
            if (r7 == r8) goto L5a
            r7 = r10
            goto L5b
        L5a:
            r7 = r9
        L5b:
            r4 = r4 & r10
            boolean r4 = r1.S(r4, r7)
            if (r4 == 0) goto L348
            java.lang.Object r4 = r1.P()
            i0.e r7 = i0.l.f5952a
            if (r4 != r7) goto L70
            java.lang.String r4 = "comment_enable"
            i0.j1 r4 = wb.en.e(r3, r4, r9, r1)
        L70:
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r8 = r1.P()
            java.lang.String r11 = ""
            if (r8 != r7) goto L8a
            java.lang.String r8 = "comment_content"
            java.lang.String r8 = r3.getString(r8, r11)
            if (r8 != 0) goto L83
            r8 = r11
        L83:
            i0.j1 r8 = i0.r.u(r8)
            r1.k0(r8)
        L8a:
            i0.a1 r8 = (i0.a1) r8
            java.lang.Object r12 = r1.P()
            if (r12 != r7) goto La4
            java.lang.String r12 = "comment_time_format"
            java.lang.String r13 = "yyyy-MM-dd HH:mm:ss"
            java.lang.String r12 = r3.getString(r12, r13)
            if (r12 != 0) goto L9d
            r12 = r11
        L9d:
            i0.j1 r12 = i0.r.u(r12)
            r1.k0(r12)
        La4:
            i0.a1 r12 = (i0.a1) r12
            java.lang.Object r13 = r1.P()
            if (r13 != r7) goto Lb2
            java.lang.String r13 = "comment_self"
            i0.j1 r13 = wb.en.e(r3, r13, r9, r1)
        Lb2:
            i0.a1 r13 = (i0.a1) r13
            java.lang.Object r14 = r1.P()
            if (r14 != r7) goto Lcb
            java.lang.String r14 = "comment_list_mode"
            int r14 = r3.getInt(r14, r9)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            i0.j1 r14 = i0.r.u(r14)
            r1.k0(r14)
        Lcb:
            i0.a1 r14 = (i0.a1) r14
            java.lang.Object r15 = r1.P()
            if (r15 != r7) goto Ld9
            java.lang.String r15 = "daily_comment_limit"
            i0.j1 r15 = wb.en.d(r3, r15, r9, r1)
        Ld9:
            i0.a1 r15 = (i0.a1) r15
            java.lang.Object r9 = r1.P()
            if (r9 != r7) goto Lf2
            java.lang.String r9 = "comment_delay_mode"
            int r9 = r3.getInt(r9, r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            i0.j1 r9 = i0.r.u(r9)
            r1.k0(r9)
        Lf2:
            i0.a1 r9 = (i0.a1) r9
            java.lang.Object r10 = r1.P()
            if (r10 != r7) goto L102
            java.lang.String r10 = "comment_fixed_delay_seconds"
            r2 = 300(0x12c, float:4.2E-43)
            i0.j1 r10 = wb.en.d(r3, r10, r2, r1)
        L102:
            i0.a1 r10 = (i0.a1) r10
            java.lang.Object r2 = r1.P()
            if (r2 != r7) goto L115
            java.lang.String r2 = "comment_random_min_seconds"
            r18 = r4
            r4 = 60
            i0.j1 r2 = wb.en.d(r3, r2, r4, r1)
            goto L117
        L115:
            r18 = r4
        L117:
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r4 = r1.P()
            if (r4 != r7) goto L12a
            java.lang.String r4 = "comment_random_max_seconds"
            r19 = r2
            r2 = 3600(0xe10, float:5.045E-42)
            i0.j1 r4 = wb.en.d(r3, r4, r2, r1)
            goto L12c
        L12a:
            r19 = r2
        L12c:
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r2 = r1.P()
            if (r2 != r7) goto L13e
            java.lang.String r2 = "comment_time_window_enable"
            r20 = r4
            r4 = 0
            i0.j1 r2 = wb.en.e(r3, r2, r4, r1)
            goto L140
        L13e:
            r20 = r4
        L140:
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r4 = r1.P()
            if (r4 != r7) goto L15d
            java.lang.String r4 = "comment_start_time"
            r21 = r2
            java.lang.String r2 = "08:00:00"
            java.lang.String r2 = r3.getString(r4, r2)
            if (r2 != 0) goto L155
            r2 = r11
        L155:
            i0.j1 r4 = i0.r.u(r2)
            r1.k0(r4)
            goto L15f
        L15d:
            r21 = r2
        L15f:
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r2 = r1.P()
            if (r2 != r7) goto L17c
            java.lang.String r2 = "comment_end_time"
            r22 = r4
            java.lang.String r4 = "23:30:00"
            java.lang.String r2 = r3.getString(r2, r4)
            if (r2 != 0) goto L174
            r2 = r11
        L174:
            i0.j1 r2 = i0.r.u(r2)
            r1.k0(r2)
            goto L17e
        L17c:
            r22 = r4
        L17e:
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r4 = r1.P()
            if (r4 != r7) goto L191
            java.lang.String r4 = "comment_max_age_hours"
            r23 = r2
            r2 = 24
            i0.j1 r4 = wb.en.d(r3, r4, r2, r1)
            goto L193
        L191:
            r23 = r2
        L193:
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r2 = r1.P()
            if (r2 != r7) goto L1a5
            java.lang.String r2 = "comment_allow_text"
            r24 = r4
            r4 = 1
            i0.j1 r2 = wb.en.e(r3, r2, r4, r1)
            goto L1a8
        L1a5:
            r24 = r4
            r4 = 1
        L1a8:
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r4 = r1.P()
            if (r4 != r7) goto L1ba
            java.lang.String r4 = "comment_allow_image"
            r25 = r2
            r2 = 1
            i0.j1 r4 = wb.en.e(r3, r4, r2, r1)
            goto L1bd
        L1ba:
            r25 = r2
            r2 = 1
        L1bd:
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r2 = r1.P()
            if (r2 != r7) goto L1cf
            java.lang.String r2 = "comment_allow_video"
            r26 = r4
            r4 = 1
            i0.j1 r2 = wb.en.e(r3, r2, r4, r1)
            goto L1d1
        L1cf:
            r26 = r4
        L1d1:
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r4 = r1.P()
            if (r4 != r7) goto L1e9
            java.lang.String r4 = "comment_exclude_keywords_text"
            java.lang.String r4 = r3.getString(r4, r11)
            if (r4 != 0) goto L1e2
            r4 = r11
        L1e2:
            i0.j1 r4 = i0.r.u(r4)
            r1.k0(r4)
        L1e9:
            i0.a1 r4 = (i0.a1) r4
            r27 = r2
            java.lang.Object r2 = r1.P()
            if (r2 != r7) goto L203
            java.lang.String r2 = "comment_exclude_keywords_image_text"
            java.lang.String r2 = r3.getString(r2, r11)
            if (r2 != 0) goto L1fc
            r2 = r11
        L1fc:
            i0.j1 r2 = i0.r.u(r2)
            r1.k0(r2)
        L203:
            i0.a1 r2 = (i0.a1) r2
            r28 = r2
            java.lang.Object r2 = r1.P()
            if (r2 != r7) goto L21d
            java.lang.String r2 = "comment_exclude_keywords_video_text"
            java.lang.String r2 = r3.getString(r2, r11)
            if (r2 != 0) goto L216
            r2 = r11
        L216:
            i0.j1 r2 = i0.r.u(r2)
            r1.k0(r2)
        L21d:
            i0.a1 r2 = (i0.a1) r2
            r29 = r2
            java.lang.Object r2 = r1.P()
            if (r2 != r7) goto L231
            java.lang.String r2 = "comment_keyword_text"
            r30 = r4
            r4 = 1
            i0.j1 r2 = wb.en.e(r3, r2, r4, r1)
            goto L234
        L231:
            r30 = r4
            r4 = 1
        L234:
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r4 = r1.P()
            if (r4 != r7) goto L246
            java.lang.String r4 = "comment_keyword_image"
            r31 = r2
            r2 = 1
            i0.j1 r4 = wb.en.e(r3, r4, r2, r1)
            goto L249
        L246:
            r31 = r2
            r2 = 1
        L249:
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r2 = r1.P()
            if (r2 != r7) goto L25b
            java.lang.String r2 = "comment_keyword_video"
            r32 = r4
            r4 = 1
            i0.j1 r2 = wb.en.e(r3, r2, r4, r1)
            goto L25d
        L25b:
            r32 = r4
        L25d:
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r4 = r1.P()
            if (r4 != r7) goto L26f
            java.lang.String r4 = "comment_log_enable"
            r33 = r2
            r2 = 0
            i0.j1 r4 = wb.en.e(r3, r4, r2, r1)
            goto L271
        L26f:
            r33 = r2
        L271:
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r2 = r1.P()
            if (r2 != r7) goto L28a
            java.lang.String r2 = "comment_logs"
            java.lang.String r2 = r3.getString(r2, r11)
            if (r2 != 0) goto L282
            goto L283
        L282:
            r11 = r2
        L283:
            i0.j1 r2 = i0.r.u(r11)
            r1.k0(r2)
        L28a:
            i0.a1 r2 = (i0.a1) r2
            java.lang.Object r7 = r14.getValue()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r11 = 1
            if (r7 != r11) goto L29b
            r7 = r6
            goto L29c
        L29b:
            r7 = r5
        L29c:
            java.lang.Object r16 = r14.getValue()
            java.lang.Number r16 = (java.lang.Number) r16
            r17 = r2
            int r2 = r16.intValue()
            if (r2 != r11) goto L2b3
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L2b3
            java.lang.String r2 = "未排除好友，将匹配全部好友"
            goto L2d4
        L2b3:
            java.lang.Object r2 = r14.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            if (r2 != 0) goto L2c8
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L2c8
            java.lang.String r2 = "未选择好友，自动评论不会执行"
            goto L2d4
        L2c8:
            int r2 = r7.size()
            java.lang.String r7 = "已选择 "
            java.lang.String r11 = " 位好友"
            java.lang.String r2 = eh.a.m(r2, r7, r11)
        L2d4:
            r.z r7 = r.b0.a(r1)
            sh.x r11 = sh.s.i(r1)
            java.lang.String r34 = r38.b()
            java.lang.String r35 = r38.b()
            r16 = r2
            wb.el r2 = new wb.el
            r3 = 22
            r2.<init>(r0, r3)
            r3 = 399726827(0x17d358eb, float:1.3658001E-24)
            s0.d r36 = s0.i.e(r3, r2, r1)
            wb.ko r0 = new wb.ko
            r1 = r29
            r29 = r4
            r4 = r16
            r16 = r21
            r21 = r26
            r26 = r28
            r28 = r1
            r3 = r39
            r5 = r43
            r2 = r7
            r7 = r8
            r1 = r11
            r8 = r12
            r11 = r15
            r6 = r18
            r15 = r20
            r18 = r23
            r20 = r25
            r23 = r31
            r25 = r32
            r12 = r9
            r9 = r13
            r13 = r10
            r10 = r14
            r14 = r19
            r19 = r24
            r24 = r30
            r30 = r17
            r17 = r22
            r22 = r27
            r27 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r2 = 1810539877(0x6beaa565, float:5.673394E26)
            r7 = r44
            s0.d r6 = s0.i.e(r2, r0, r7)
            r8 = 1769472(0x1b0000, float:2.479558E-39)
            r9 = 24
            r3 = 0
            r4 = 0
            r2 = r1
            r0 = r34
            r1 = r35
            r5 = r36
            wb.ho.B2(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L34b
        L348:
            r44.V()
        L34b:
            i0.r1 r10 = r44.t()
            if (r10 == 0) goto L369
            wb.d5 r0 = new wb.d5
            r9 = 4
            r1 = r37
            r2 = r38
            r3 = r39
            r4 = r40
            r5 = r41
            r6 = r42
            r7 = r43
            r8 = r45
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r10.f6035d = r0
        L369:
            return
    }

    public void y(java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, c9.r0 r24, fg.q r25, fg.a r26, i0.h0 r27, int r28) {
            r19 = this;
            r0 = r27
            r1 = 1643860998(0x61fb5406, float:5.795234E20)
            r0.b0(r1)
            r1 = r20
            boolean r2 = r0.f(r1)
            if (r2 == 0) goto L12
            r2 = 4
            goto L13
        L12:
            r2 = 2
        L13:
            r2 = r28 | r2
            r3 = r21
            boolean r4 = r0.f(r3)
            if (r4 == 0) goto L20
            r4 = 32
            goto L22
        L20:
            r4 = 16
        L22:
            r2 = r2 | r4
            r4 = r22
            boolean r5 = r0.f(r4)
            if (r5 == 0) goto L2e
            r5 = 256(0x100, float:3.59E-43)
            goto L30
        L2e:
            r5 = 128(0x80, float:1.8E-43)
        L30:
            r2 = r2 | r5
            r7 = r23
            boolean r5 = r0.f(r7)
            if (r5 == 0) goto L3c
            r5 = 2048(0x800, float:2.87E-42)
            goto L3e
        L3c:
            r5 = 1024(0x400, float:1.435E-42)
        L3e:
            r2 = r2 | r5
            r8 = r24
            boolean r5 = r0.h(r8)
            if (r5 == 0) goto L4a
            r5 = 16384(0x4000, float:2.2959E-41)
            goto L4c
        L4a:
            r5 = 8192(0x2000, float:1.148E-41)
        L4c:
            r2 = r2 | r5
            r9 = r25
            boolean r5 = r0.h(r9)
            if (r5 == 0) goto L58
            r5 = 131072(0x20000, float:1.83671E-40)
            goto L5a
        L58:
            r5 = 65536(0x10000, float:9.1835E-41)
        L5a:
            r2 = r2 | r5
            r10 = r26
            boolean r5 = r0.h(r10)
            if (r5 == 0) goto L66
            r5 = 1048576(0x100000, float:1.469368E-39)
            goto L68
        L66:
            r5 = 524288(0x80000, float:7.34684E-40)
        L68:
            r2 = r2 | r5
            r5 = 599187(0x92493, float:8.3964E-40)
            r5 = r5 & r2
            r6 = 599186(0x92492, float:8.39638E-40)
            if (r5 == r6) goto L74
            r5 = 1
            goto L75
        L74:
            r5 = 0
        L75:
            r6 = r2 & 1
            boolean r5 = r0.S(r6, r5)
            if (r5 == 0) goto L12a
            java.lang.Object r5 = r0.P()
            i0.e r6 = i0.l.f5952a
            if (r5 != r6) goto L8c
            i0.j1 r5 = i0.r.u(r1)
            r0.k0(r5)
        L8c:
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r11 = r0.P()
            if (r11 != r6) goto L9b
            i0.j1 r11 = i0.r.u(r3)
            r0.k0(r11)
        L9b:
            i0.a1 r11 = (i0.a1) r11
            java.lang.Object r12 = r0.P()
            if (r12 != r6) goto Laa
            i0.j1 r12 = i0.r.u(r4)
            r0.k0(r12)
        Laa:
            i0.a1 r12 = (i0.a1) r12
            i0.u r6 = y1.i0.f21965a
            java.lang.Object r6 = r0.j(r6)
            android.content.res.Configuration r6 = (android.content.res.Configuration) r6
            int r6 = r6.screenHeightDp
            float r6 = (float) r6
            r13 = 1061662228(0x3f47ae14, float:0.78)
            float r13 = r13 * r6
            u2.f r14 = new u2.f
            r14.<init>(r13)
            r13 = 560(0x230, float:7.85E-43)
            float r13 = (float) r13
            u2.f r15 = new u2.f
            r15.<init>(r13)
            java.lang.Comparable r13 = r9.e0.o(r14, r15)
            u2.f r13 = (u2.f) r13
            float r13 = r13.f13344g
            r14 = 1058306785(0x3f147ae1, float:0.58)
            float r6 = r6 * r14
            u2.f r14 = new u2.f
            r14.<init>(r6)
            r6 = 240(0xf0, float:3.36E-43)
            float r6 = (float) r6
            u2.f r15 = new u2.f
            r15.<init>(r6)
            r6 = 430(0x1ae, float:6.03E-43)
            float r6 = (float) r6
            u2.f r1 = new u2.f
            r1.<init>(r6)
            java.lang.Comparable r1 = r9.e0.u(r14, r15, r1)
            u2.f r1 = (u2.f) r1
            float r1 = r1.f13344g
            r9 = r5
            wb.b5 r5 = new wb.b5
            r6 = r12
            r12 = r10
            r10 = r11
            r11 = r6
            r14 = r8
            r6 = r13
            r13 = r25
            r8 = r7
            r7 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1 = -118410841(0xfffffffff8f131a7, float:-3.9135957E34)
            s0.d r15 = s0.i.e(r1, r5, r0)
            int r1 = r2 << 12
            r2 = 234881024(0xe000000, float:1.5777218E-30)
            r1 = r1 & r2
            r1 = r1 | 390(0x186, float:5.47E-43)
            r18 = 3072(0xc00, float:4.305E-42)
            r0 = 0
            r17 = r1
            java.lang.String r1 = "设置群员头衔"
            r2 = 0
            r4 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r9 = r24
            r16 = r27
            oh.h.d(r0, r1, r2, r4, r6, r8, r9, r10, r12, r14, r15, r16, r17, r18)
            goto L12d
        L12a:
            r27.V()
        L12d:
            i0.r1 r0 = r27.t()
            if (r0 == 0) goto L14c
            c9.d0 r2 = new c9.d0
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r28
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0.f6035d = r2
        L14c:
            return
    }

    public void y1(android.content.Context r71, fg.a r72, i0.h0 r73, int r74) {
            r70 = this;
            r2 = r71
            r15 = r72
            r9 = r73
            r10 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r15.getClass()
            r1 = 1377466125(0x521a770d, float:1.6585558E11)
            r9.b0(r1)
            boolean r1 = r9.h(r2)
            if (r1 == 0) goto L1c
            r1 = 4
            goto L1d
        L1c:
            r1 = 2
        L1d:
            r1 = r74 | r1
            boolean r3 = r9.h(r15)
            if (r3 == 0) goto L28
            r3 = 32
            goto L2a
        L28:
            r3 = 16
        L2a:
            r11 = r1 | r3
            r1 = r11 & 147(0x93, float:2.06E-43)
            r3 = 146(0x92, float:2.05E-43)
            r16 = 1
            if (r1 == r3) goto L37
            r1 = r16
            goto L38
        L37:
            r1 = r10
        L38:
            r3 = r11 & 1
            boolean r1 = r9.S(r3, r1)
            if (r1 == 0) goto L892
            java.lang.Object r1 = r9.P()
            i0.e r12 = i0.l.f5952a
            if (r1 != r12) goto L4f
            qg.t r1 = i0.r.n(r9)
            r9.k0(r1)
        L4f:
            r13 = r1
            qg.t r13 = (qg.t) r13
            r.z r19 = r.b0.a(r9)
            sh.x r18 = sh.s.i(r9)
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.Object r3 = r9.P()
            if (r3 != r12) goto L6c
            k.s1 r3 = new k.s1
            r4 = 28
            r3.<init>(r4)
            r9.k0(r3)
        L6c:
            fg.a r3 = (fg.a) r3
            r4 = 48
            java.lang.Object r1 = v0.k.c(r1, r3, r9, r4)
            i0.a1 r1 = (i0.a1) r1
            java.lang.Object[] r3 = new java.lang.Object[r10]
            java.lang.Object r5 = r9.P()
            if (r5 != r12) goto L88
            k.s1 r5 = new k.s1
            r6 = 29
            r5.<init>(r6)
            r9.k0(r5)
        L88:
            fg.a r5 = (fg.a) r5
            java.lang.Object r3 = v0.k.c(r3, r5, r9, r4)
            r5 = r3
            i0.a1 r5 = (i0.a1) r5
            java.lang.Object r3 = r9.P()
            if (r3 != r12) goto L9e
            i0.j1 r3 = i0.r.u(r0)
            r9.k0(r3)
        L9e:
            r23 = r3
            i0.a1 r23 = (i0.a1) r23
            java.lang.Object r3 = r9.P()
            if (r3 != r12) goto Lb1
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            i0.j1 r3 = i0.r.u(r3)
            r9.k0(r3)
        Lb1:
            r22 = r3
            i0.a1 r22 = (i0.a1) r22
            java.lang.Object r3 = r9.P()
            java.lang.String r29 = ""
            if (r3 != r12) goto Lc4
            i0.j1 r3 = i0.r.u(r29)
            r9.k0(r3)
        Lc4:
            r26 = r3
            i0.a1 r26 = (i0.a1) r26
            java.lang.Object r3 = r9.P()
            tf.t r4 = tf.t.f13167g
            if (r3 != r12) goto Ld7
            i0.j1 r3 = i0.r.u(r4)
            r9.k0(r3)
        Ld7:
            r6 = r3
            i0.a1 r6 = (i0.a1) r6
            java.lang.Object r3 = r9.P()
            if (r3 != r12) goto Le7
            i0.j1 r3 = i0.r.u(r0)
            r9.k0(r3)
        Le7:
            r7 = r3
            i0.a1 r7 = (i0.a1) r7
            java.lang.Object r3 = r9.P()
            r30 = 0
            if (r3 != r12) goto Lf9
            i0.j1 r3 = i0.r.u(r30)
            r9.k0(r3)
        Lf9:
            r27 = r3
            i0.a1 r27 = (i0.a1) r27
            java.lang.Object r3 = r9.P()
            if (r3 != r12) goto L10a
            i0.j1 r3 = i0.r.u(r30)
            r9.k0(r3)
        L10a:
            r38 = r3
            i0.a1 r38 = (i0.a1) r38
            java.lang.Object r3 = r9.P()
            if (r3 != r12) goto L11d
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            i0.j1 r3 = i0.r.u(r3)
            r9.k0(r3)
        L11d:
            r14 = r3
            i0.a1 r14 = (i0.a1) r14
            java.lang.Object r3 = r9.P()
            if (r3 != r12) goto L12d
            i0.j1 r3 = i0.r.u(r29)
            r9.k0(r3)
        L12d:
            r39 = r3
            i0.a1 r39 = (i0.a1) r39
            java.lang.Object r3 = r9.P()
            if (r3 != r12) goto L13e
            i0.j1 r3 = i0.r.u(r0)
            r9.k0(r3)
        L13e:
            i0.a1 r3 = (i0.a1) r3
            java.lang.Object r8 = r9.P()
            if (r8 != r12) goto L14d
            i0.j1 r8 = i0.r.u(r4)
            r9.k0(r8)
        L14d:
            r40 = r8
            i0.a1 r40 = (i0.a1) r40
            java.lang.Object r8 = r9.P()
            if (r8 != r12) goto L160
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            i0.j1 r8 = i0.r.u(r8)
            r9.k0(r8)
        L160:
            r17 = r8
            i0.a1 r17 = (i0.a1) r17
            java.lang.Object r8 = r9.P()
            if (r8 != r12) goto L171
            i0.j1 r8 = i0.r.u(r29)
            r9.k0(r8)
        L171:
            r41 = r8
            i0.a1 r41 = (i0.a1) r41
            java.lang.Object r8 = r9.P()
            if (r8 != r12) goto L182
            i0.j1 r8 = i0.r.u(r30)
            r9.k0(r8)
        L182:
            r31 = r8
            i0.a1 r31 = (i0.a1) r31
            java.lang.Object r8 = r9.P()
            if (r8 != r12) goto L193
            i0.j1 r8 = i0.r.u(r4)
            r9.k0(r8)
        L193:
            r42 = r8
            i0.a1 r42 = (i0.a1) r42
            java.lang.Object r4 = r9.P()
            if (r4 != r12) goto L1a6
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            i0.j1 r4 = i0.r.u(r4)
            r9.k0(r4)
        L1a6:
            r20 = r4
            i0.a1 r20 = (i0.a1) r20
            java.lang.Object r4 = r9.P()
            if (r4 != r12) goto L1b7
            i0.j1 r4 = i0.r.u(r29)
            r9.k0(r4)
        L1b7:
            r43 = r4
            i0.a1 r43 = (i0.a1) r43
            java.lang.Object r4 = r9.P()
            if (r4 != r12) goto L1c8
            i0.j1 r4 = i0.r.u(r0)
            r9.k0(r4)
        L1c8:
            i0.a1 r4 = (i0.a1) r4
            java.lang.Object r0 = r9.P()
            if (r0 != r12) goto L1d7
            i0.j1 r0 = i0.r.u(r30)
            r9.k0(r0)
        L1d7:
            r44 = r0
            i0.a1 r44 = (i0.a1) r44
            java.lang.Object r0 = r9.P()
            if (r0 != r12) goto L1e8
            i0.j1 r0 = i0.r.u(r29)
            r9.k0(r0)
        L1e8:
            r45 = r0
            i0.a1 r45 = (i0.a1) r45
            java.lang.Object r0 = r9.P()
            if (r0 != r12) goto L1fb
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            i0.j1 r0 = i0.r.u(r0)
            r9.k0(r0)
        L1fb:
            r21 = r0
            i0.a1 r21 = (i0.a1) r21
            java.lang.Object r0 = r9.P()
            if (r0 != r12) goto L20e
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            i0.j1 r0 = i0.r.u(r0)
            r9.k0(r0)
        L20e:
            r24 = r0
            i0.a1 r24 = (i0.a1) r24
            java.lang.Object r0 = r9.P()
            if (r0 != r12) goto L221
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            i0.j1 r0 = i0.r.u(r0)
            r9.k0(r0)
        L221:
            r25 = r0
            i0.a1 r25 = (i0.a1) r25
            java.lang.Object r0 = r9.P()
            if (r0 != r12) goto L234
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            i0.j1 r0 = i0.r.u(r0)
            r9.k0(r0)
        L234:
            r34 = r0
            i0.a1 r34 = (i0.a1) r34
            java.lang.Object r0 = r9.P()
            if (r0 != r12) goto L245
            i0.j1 r0 = i0.r.u(r29)
            r9.k0(r0)
        L245:
            r46 = r0
            i0.a1 r46 = (i0.a1) r46
            java.lang.Object r0 = r9.P()
            if (r0 != r12) goto L258
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            i0.j1 r0 = i0.r.u(r0)
            r9.k0(r0)
        L258:
            r35 = r0
            i0.a1 r35 = (i0.a1) r35
            java.lang.Object r0 = r9.P()
            if (r0 != r12) goto L269
            i0.j1 r0 = i0.r.u(r30)
            r9.k0(r0)
        L269:
            r36 = r0
            i0.a1 r36 = (i0.a1) r36
            java.lang.Object r0 = r9.P()
            if (r0 != r12) goto L27c
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            i0.j1 r0 = i0.r.u(r0)
            r9.k0(r0)
        L27c:
            r28 = r0
            i0.a1 r28 = (i0.a1) r28
            java.lang.Object r0 = r9.P()
            if (r0 != r12) goto L28d
            i0.j1 r0 = i0.r.u(r30)
            r9.k0(r0)
        L28d:
            r32 = r0
            i0.a1 r32 = (i0.a1) r32
            java.lang.Object r0 = r9.P()
            if (r0 != r12) goto L29e
            i0.j1 r0 = i0.r.u(r30)
            r9.k0(r0)
        L29e:
            r33 = r0
            i0.a1 r33 = (i0.a1) r33
            java.lang.Object r0 = r9.P()
            if (r0 != r12) goto L2af
            i0.j1 r0 = i0.r.u(r29)
            r9.k0(r0)
        L2af:
            r47 = r0
            i0.a1 r47 = (i0.a1) r47
            java.lang.Object r0 = r9.P()
            if (r0 != r12) goto L2c0
            i0.j1 r0 = i0.r.u(r30)
            r9.k0(r0)
        L2c0:
            r37 = r0
            i0.a1 r37 = (i0.a1) r37
            java.lang.Object r0 = r9.P()
            if (r0 != r12) goto L2d3
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            i0.j1 r0 = i0.r.u(r0)
            r9.k0(r0)
        L2d3:
            i0.a1 r0 = (i0.a1) r0
            java.lang.Object r8 = r1.getValue()
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r48 = r5.getValue()
            r10 = r48
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r48 = r23.getValue()
            java.lang.Number r48 = (java.lang.Number) r48
            int r48 = r48.intValue()
            r50 = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r48)
            boolean r48 = r9.h(r2)
            boolean r51 = r9.f(r1)
            r48 = r48 | r51
            boolean r51 = r9.f(r5)
            r48 = r48 | r51
            r51 = r0
            java.lang.Object r0 = r9.P()
            if (r48 != 0) goto L32c
            if (r0 != r12) goto L30e
            goto L32c
        L30e:
            r48 = r25
            r25 = r7
            r7 = r48
            r52 = r3
            r3 = r13
            r54 = r21
            r48 = r46
            r53 = r51
            r46 = r4
            r21 = r5
            r13 = r8
            r51 = r20
            r20 = r1
            r1 = r11
            r11 = r50
            r50 = r6
            goto L36a
        L32c:
            wb.on r0 = new wb.on
            r48 = r8
            r8 = 0
            r52 = r3
            r53 = r51
            r3 = r2
            r2 = r26
            r26 = r13
            r13 = r48
            r48 = r46
            r46 = r4
            r4 = r1
            r1 = r22
            r22 = r11
            r11 = r50
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r50 = r22
            r22 = r1
            r1 = r50
            r50 = r26
            r26 = r2
            r2 = r3
            r3 = r50
            r50 = r25
            r25 = r7
            r7 = r50
            r50 = r6
            r51 = r20
            r54 = r21
            r20 = r4
            r21 = r5
            r9.k0(r0)
        L36a:
            fg.p r0 = (fg.p) r0
            i0.r.h(r11, r10, r13, r0, r9)
            java.lang.Object r0 = r27.getValue()
            gb.o r0 = (gb.o) r0
            if (r0 == 0) goto L37a
            java.lang.String r0 = r0.f4449a
            goto L37c
        L37a:
            r0 = r30
        L37c:
            java.lang.Object r4 = r52.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r5 = r9.h(r2)
            java.lang.Object r6 = r9.P()
            if (r5 != 0) goto L396
            if (r6 != r12) goto L398
        L396:
            r5 = r0
            goto L3b5
        L398:
            r58 = r0
            r56 = r1
            r57 = r3
            r59 = r4
            r15 = r9
            r60 = r12
            r8 = r24
            r1 = r27
            r49 = r28
            r61 = r47
            r9 = r7
            r7 = r38
            r47 = r41
            r38 = r14
            r41 = r17
            goto L3ef
        L3b5:
            wb.vp r0 = new wb.vp
            r13 = 0
            r2 = r14
            r14 = 0
            r10 = r71
            r56 = r1
            r57 = r3
            r59 = r4
            r58 = r5
            r15 = r9
            r60 = r12
            r5 = r17
            r11 = r24
            r1 = r27
            r8 = r28
            r4 = r38
            r3 = r39
            r6 = r41
            r9 = r47
            r12 = r7
            r7 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r38 = r2
            r41 = r5
            r47 = r6
            r49 = r8
            r61 = r9
            r2 = r10
            r8 = r11
            r9 = r12
            r7 = r4
            r15.k0(r0)
            r6 = r0
        L3ef:
            fg.p r6 = (fg.p) r6
            r5 = r58
            r0 = r59
            i0.r.g(r5, r0, r6, r15)
            java.lang.Object r0 = r1.getValue()
            gb.o r0 = (gb.o) r0
            if (r0 == 0) goto L403
            java.lang.String r0 = r0.f4449a
            goto L405
        L403:
            r0 = r30
        L405:
            java.lang.Object r3 = r46.getValue()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r4 = r15.h(r2)
            java.lang.Object r5 = r15.P()
            if (r4 != 0) goto L430
            r4 = r60
            if (r5 != r4) goto L423
        L421:
            r5 = r0
            goto L433
        L423:
            r62 = r0
            r10 = r2
            r63 = r3
            r64 = r4
            r11 = r7
            r12 = r8
            r13 = r9
            r9 = r50
            goto L457
        L430:
            r4 = r60
            goto L421
        L433:
            wb.vp r0 = new wb.vp
            r13 = 0
            r14 = 1
            r10 = r2
            r63 = r3
            r64 = r4
            r62 = r5
            r11 = r7
            r5 = r42
            r3 = r43
            r6 = r44
            r4 = r45
            r12 = r50
            r2 = r51
            r7 = r54
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r13 = r9
            r9 = r12
            r12 = r8
            r15.k0(r0)
            r5 = r0
        L457:
            fg.p r5 = (fg.p) r5
            r0 = r62
            r2 = r63
            i0.r.g(r0, r2, r5, r15)
            db.f r0 = new db.f
            r2 = 18
            r14 = r72
            r3 = r53
            r0.<init>(r14, r2, r3)
            r2 = -78095218(0xfffffffffb585c8e, float:-1.12341335E36)
            s0.d r5 = s0.i.e(r2, r0, r15)
            wb.d1 r17 = new wb.d1
            r28 = 16
            r27 = r1
            r24 = r9
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r0 = r17
            r50 = r24
            r1 = -1191965048(0xffffffffb8f40e88, float:-1.1637533E-4)
            s0.d r6 = s0.i.e(r1, r0, r15)
            r8 = 1769526(0x1b0036, float:2.479634E-39)
            r9 = 24
            java.lang.String r0 = "在线插件"
            java.lang.String r1 = "在线插件"
            r3 = 0
            r4 = 0
            r7 = r15
            r2 = r18
            r15 = r53
            wb.ho.B2(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = r7
            java.lang.Object r1 = r27.getValue()
            gb.o r1 = (gb.o) r1
            if (r1 != 0) goto L4c7
            r1 = 1996037308(0x76f91cbc, float:2.5262983E33)
            r0.a0(r1)
            r2 = 0
            r0.p(r2)
            r12 = r0
            r13 = r2
            r7 = r11
            r68 = r15
            r11 = r23
            r1 = r27
            r4 = r32
            r54 = r37
            r9 = r50
            r3 = r57
            r5 = r61
            r15 = r64
            r57 = r49
            goto L7ee
        L4c7:
            r2 = 0
            java.lang.String r3 = r1.f4449a
            r4 = 1996037309(0x76f91cbd, float:2.5262984E33)
            r0.a0(r4)
            java.lang.Object r4 = r11.getValue()
            r18 = r4
            gb.o r18 = (gb.o) r18
            java.lang.Object r4 = r38.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r19 = r4.booleanValue()
            java.lang.Object r4 = r39.getValue()
            r20 = r4
            java.lang.String r20 = (java.lang.String) r20
            java.lang.Object r4 = r40.getValue()
            r21 = r4
            java.util.List r21 = (java.util.List) r21
            java.lang.Object r4 = r41.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r22 = r4.booleanValue()
            java.lang.Object r4 = r47.getValue()
            r17 = r4
            java.lang.String r17 = (java.lang.String) r17
            java.lang.Object r4 = r31.getValue()
            r24 = r4
            java.lang.String r24 = (java.lang.String) r24
            java.lang.Object r4 = r49.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r26 = r4.booleanValue()
            java.lang.Object r4 = r32.getValue()
            java.lang.String r4 = (java.lang.String) r4
            boolean r28 = gg.l.a(r4, r3)
            java.lang.Object r4 = r33.getValue()
            java.lang.String r4 = (java.lang.String) r4
            boolean r53 = gg.l.a(r4, r3)
            gb.m r3 = gb.q.e(r10, r3)
            if (r3 == 0) goto L53b
            r69 = r28
            r28 = r16
            r16 = r25
            r25 = r26
            r26 = r69
            goto L543
        L53b:
            r16 = r25
            r25 = r26
            r26 = r28
            r28 = r2
        L543:
            java.lang.Object r3 = r61.getValue()
            r55 = r3
            java.lang.String r55 = (java.lang.String) r55
            java.lang.Object r3 = r54.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r58 = r3.booleanValue()
            java.lang.Object r3 = r34.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r59 = r3.booleanValue()
            java.lang.Object r3 = r42.getValue()
            r60 = r3
            java.util.List r60 = (java.util.List) r60
            java.lang.Object r3 = r51.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r51 = r3.booleanValue()
            java.lang.Object r3 = r43.getValue()
            r62 = r3
            java.lang.String r62 = (java.lang.String) r62
            java.lang.Object r3 = r44.getValue()
            gb.s r3 = (gb.s) r3
            if (r3 == 0) goto L585
            java.lang.String r3 = r3.f4476a
            r30 = r3
        L585:
            if (r30 != 0) goto L588
            goto L58a
        L588:
            r29 = r30
        L58a:
            java.lang.Object r3 = r45.getValue()
            r30 = r3
            java.lang.String r30 = (java.lang.String) r30
            java.lang.Object r3 = r48.getValue()
            r63 = r3
            java.lang.String r63 = (java.lang.String) r63
            java.lang.Object r3 = r35.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r65 = r3.booleanValue()
            java.lang.Object r3 = r36.getValue()
            r66 = r3
            java.lang.String r66 = (java.lang.String) r66
            java.lang.Object r3 = r0.P()
            r4 = r64
            if (r3 != r4) goto L5bf
            wb.jp r3 = new wb.jp
            r5 = 2
            r6 = r52
            r3.<init>(r6, r5)
            r0.k0(r3)
        L5bf:
            r52 = r3
            fg.a r52 = (fg.a) r52
            java.lang.Object r3 = r0.P()
            if (r3 != r4) goto L5d5
            wb.jp r3 = new wb.jp
            r5 = 3
            r6 = r46
            r3.<init>(r6, r5)
            r0.k0(r3)
            goto L5d7
        L5d5:
            r6 = r46
        L5d7:
            r64 = r3
            fg.a r64 = (fg.a) r64
            r3 = r57
            boolean r5 = r0.h(r3)
            boolean r7 = r0.h(r10)
            r5 = r5 | r7
            java.lang.Object r7 = r0.P()
            if (r5 != 0) goto L607
            if (r7 != r4) goto L5ef
            goto L607
        L5ef:
            r2 = r11
            r11 = r0
            r0 = r7
            r7 = r2
            r46 = r6
            r2 = r10
            r8 = r37
            r6 = r49
            r9 = r50
            r5 = r61
            r10 = r1
            r1 = r27
            r27 = r13
            r13 = r4
            r4 = r32
            goto L632
        L607:
            wb.wp r0 = new wb.wp
            r46 = r6
            r7 = r11
            r8 = r27
            r2 = r32
            r5 = r37
            r6 = r49
            r9 = r50
            r11 = r73
            r27 = r13
            r13 = r4
            r4 = r10
            r10 = r1
            r1 = r3
            r3 = r61
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r69 = r3
            r3 = r1
            r1 = r8
            r8 = r5
            r5 = r69
            r69 = r4
            r4 = r2
            r2 = r69
            r11.k0(r0)
        L632:
            gg.j r0 = (gg.j) r0
            r49 = r0
            fg.l r49 = (fg.l) r49
            boolean r0 = r11.h(r3)
            boolean r32 = r11.h(r2)
            r0 = r0 | r32
            r32 = r0
            java.lang.Object r0 = r11.P()
            if (r32 != 0) goto L658
            if (r0 != r13) goto L64d
            goto L658
        L64d:
            r31 = r4
            r61 = r5
            r57 = r6
            r5 = r8
            r32 = r12
            r12 = r10
            goto L67d
        L658:
            wb.xp r0 = new wb.xp
            r32 = r2
            r2 = r1
            r1 = r32
            r32 = r7
            r7 = r6
            r6 = r8
            r8 = r32
            r32 = r12
            r12 = r10
            r10 = r3
            r3 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r3 = r2
            r2 = r1
            r1 = r3
            r31 = r4
            r61 = r5
            r5 = r6
            r57 = r7
            r7 = r8
            r3 = r10
            r11.k0(r0)
        L67d:
            gg.j r0 = (gg.j) r0
            r50 = r0
            fg.l r50 = (fg.l) r50
            boolean r0 = r11.h(r2)
            boolean r4 = r11.h(r3)
            r0 = r0 | r4
            boolean r4 = r11.h(r12)
            r0 = r0 | r4
            java.lang.Object r4 = r11.P()
            if (r0 != 0) goto L69f
            if (r4 != r13) goto L69a
            goto L69f
        L69a:
            r54 = r5
            r10 = r12
            r12 = r11
            goto L6be
        L69f:
            wb.np r0 = new wb.np
            r10 = r1
            r1 = r12
            r8 = r32
            r4 = r34
            r6 = r45
            r12 = r11
            r11 = r9
            r9 = r7
            r7 = r54
            r54 = r5
            r5 = r44
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r7 = r10
            r10 = r1
            r1 = r7
            r7 = r9
            r9 = r11
            r12.k0(r0)
            r4 = r0
        L6be:
            r67 = r4
            fg.a r67 = (fg.a) r67
            java.lang.Object r0 = r12.P()
            if (r0 != r13) goto L6d4
            wb.lp r0 = new wb.lp
            r4 = 1
            r5 = r48
            r0.<init>(r5, r4)
            r12.k0(r0)
            goto L6d6
        L6d4:
            r5 = r48
        L6d6:
            r48 = r0
            fg.l r48 = (fg.l) r48
            boolean r0 = r12.h(r2)
            boolean r4 = r12.h(r3)
            r0 = r0 | r4
            boolean r4 = r12.h(r10)
            r0 = r0 | r4
            java.lang.Object r4 = r12.P()
            if (r0 != 0) goto L6fa
            if (r4 != r13) goto L6f1
            goto L6fa
        L6f1:
            r14 = r12
            r68 = r15
            r11 = r46
            r46 = r5
            r15 = r13
            goto L71f
        L6fa:
            nb.a0 r0 = new nb.a0
            r4 = r13
            r13 = 3
            r11 = r1
            r1 = r10
            r14 = r12
            r68 = r15
            r8 = r42
            r6 = r44
            r15 = r4
            r10 = r7
            r12 = r9
            r9 = r27
            r4 = r35
            r7 = r45
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r7 = r10
            r9 = r12
            r10 = r1
            r1 = r11
            r11 = r46
            r46 = r5
            r14.k0(r0)
            r4 = r0
        L71f:
            r12 = r4
            fg.a r12 = (fg.a) r12
            boolean r0 = r14.h(r2)
            boolean r4 = r14.h(r3)
            r0 = r0 | r4
            boolean r4 = r14.h(r10)
            r0 = r0 | r4
            java.lang.Object r4 = r14.P()
            if (r0 != 0) goto L738
            if (r4 != r15) goto L753
        L738:
            wb.za r0 = new wb.za
            r4 = r9
            r9 = r1
            r1 = r10
            r10 = r4
            r8 = r7
            r7 = r27
            r4 = r36
            r6 = r42
            r5 = r45
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r7 = r10
            r10 = r1
            r1 = r9
            r9 = r7
            r7 = r8
            r14.k0(r0)
            r4 = r0
        L753:
            r13 = r4
            fg.l r13 = (fg.l) r13
            boolean r0 = r14.h(r3)
            boolean r4 = r14.h(r2)
            r0 = r0 | r4
            boolean r4 = r14.h(r10)
            r0 = r0 | r4
            java.lang.Object r4 = r14.P()
            if (r0 != 0) goto L773
            if (r4 != r15) goto L76d
            goto L773
        L76d:
            r0 = r4
            r11 = r23
            r4 = r31
            goto L78c
        L773:
            wb.np r0 = new wb.np
            r6 = r1
            r5 = r2
            r2 = r3
            r1 = r10
            r10 = r16
            r11 = r23
            r4 = r31
            r3 = r33
            r8 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r10 = r1
            r1 = r6
            r3 = r2
            r14.k0(r0)
        L78c:
            fg.a r0 = (fg.a) r0
            java.lang.Object r2 = r14.P()
            if (r2 != r15) goto L7ab
            wb.vk r31 = new wb.vk
            r37 = r1
            r32 = r4
            r38 = r7
            r41 = r47
            r47 = r61
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)
            r2 = r31
            r5 = r47
            r14.k0(r2)
            goto L7ad
        L7ab:
            r5 = r61
        L7ad:
            fg.a r2 = (fg.a) r2
            r33 = r51
            r51 = 72
            wb.y2 r16 = wb.y2.f20288m
            r46 = r12
            r47 = r13
            r23 = r17
            r35 = r29
            r36 = r30
            r45 = r48
            r42 = r49
            r43 = r50
            r40 = r52
            r27 = r53
            r29 = r55
            r30 = r58
            r31 = r59
            r32 = r60
            r34 = r62
            r37 = r63
            r41 = r64
            r38 = r65
            r39 = r66
            r44 = r67
            r48 = r0
            r49 = r2
            r17 = r10
            r50 = r14
            r16.C(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)
            r12 = r50
            r13 = 0
            r12.p(r13)
        L7ee:
            java.lang.Object r0 = r54.getValue()
            r2 = r0
            gb.o r2 = (gb.o) r2
            if (r2 != 0) goto L803
            r0 = 1998531072(0x771f2a00, float:3.2282307E33)
            r12.a0(r0)
            r12.p(r13)
            r2 = r71
            goto L854
        L803:
            r0 = 1998531073(0x771f2a01, float:3.228231E33)
            r12.a0(r0)
            java.lang.Object r0 = r12.P()
            if (r0 != r15) goto L81b
            wb.jp r0 = new wb.jp
            r6 = 1
            r8 = r54
            r0.<init>(r8, r6)
            r12.k0(r0)
            goto L81d
        L81b:
            r8 = r54
        L81d:
            r25 = r0
            fg.a r25 = (fg.a) r25
            c9.e0 r0 = new c9.e0
            r10 = r3
            r3 = r8
            r6 = r57
            r8 = r1
            r1 = r71
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r2 = r1
            r1 = -983502600(0xffffffffc560f0f8, float:-3599.0605)
            s0.d r31 = s0.i.e(r1, r0, r12)
            r33 = 100663686(0x6000186, float:2.4075244E-35)
            r34 = 3072(0xc00, float:4.305E-42)
            r16 = 0
            java.lang.String r17 = "覆盖本地插件"
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r26 = 0
            r28 = 0
            r30 = 0
            r32 = r12
            oh.h.d(r16, r17, r18, r20, r22, r24, r25, r26, r28, r30, r31, r32, r33, r34)
            r12.p(r13)
        L854:
            java.lang.Object r0 = r68.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L886
            r0 = 2000061047(0x77368277, float:3.701735E33)
            r12.a0(r0)
            java.lang.Object r0 = r12.P()
            if (r0 != r15) goto L877
            wb.op r0 = new wb.op
            r1 = 0
            r15 = r68
            r0.<init>(r1, r15, r11)
            r12.k0(r0)
        L877:
            fg.l r0 = (fg.l) r0
            r1 = r56 & 14
            r1 = r1 | 432(0x1b0, float:6.05E-43)
            r3 = r70
            r3.G(r2, r0, r12, r1)
            r12.p(r13)
            goto L898
        L886:
            r3 = r70
            r0 = 2000274389(0x7739c3d5, float:3.7677612E33)
            r12.a0(r0)
            r12.p(r13)
            goto L898
        L892:
            r3 = r70
            r12 = r9
            r12.V()
        L898:
            i0.r1 r6 = r12.t()
            if (r6 == 0) goto L8ac
            wb.rj r0 = new wb.rj
            r5 = 11
            r4 = r74
            r1 = r3
            r3 = r72
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f6035d = r0
        L8ac:
            return
    }

    public void z(java.lang.String r33, java.lang.String r34, fg.a r35, i0.h0 r36, int r37) {
            r32 = this;
            r0 = r36
            r1 = -850028671(0xffffffffcd559781, float:-2.2396725E8)
            r0.b0(r1)
            r4 = r33
            boolean r1 = r0.f(r4)
            if (r1 == 0) goto L12
            r1 = 4
            goto L13
        L12:
            r1 = 2
        L13:
            r1 = r37 | r1
            r3 = r34
            boolean r5 = r0.f(r3)
            if (r5 == 0) goto L20
            r5 = 32
            goto L22
        L20:
            r5 = 16
        L22:
            r1 = r1 | r5
            r6 = r35
            boolean r5 = r0.h(r6)
            if (r5 == 0) goto L2e
            r5 = 256(0x100, float:3.59E-43)
            goto L30
        L2e:
            r5 = 128(0x80, float:1.8E-43)
        L30:
            r1 = r1 | r5
            r5 = r1 & 147(0x93, float:2.06E-43)
            r7 = 146(0x92, float:2.05E-43)
            if (r5 == r7) goto L39
            r5 = 1
            goto L3a
        L39:
            r5 = 0
        L3a:
            r7 = r1 & 1
            boolean r5 = r0.S(r7, r5)
            if (r5 == 0) goto L1b9
            y0.l r13 = y0.l.f21818a
            r14 = 1065353216(0x3f800000, float:1.0)
            y0.o r5 = p.h1.d(r13, r14)
            r15 = 12
            float r7 = (float) r15
            v.d r8 = v.e.a(r7)
            y0.o r5 = c1.h.b(r5, r8)
            r8 = 0
            r10 = 15
            r6 = 0
            r9 = r7
            r7 = 0
            r2 = r9
            r9 = r35
            y0.o r5 = k.n.j(r5, r6, r7, r8, r9, r10)
            y0.o r2 = p.d.m(r5, r2, r2)
            y0.f r5 = y0.b.f21802q
            p.c r6 = p.j.f9924a
            r7 = 48
            p.e1 r5 = p.d1.a(r6, r5, r0, r7)
            long r6 = r0.T
            int r6 = java.lang.Long.hashCode(r6)
            s0.h r7 = r0.l()
            y0.o r2 = y0.a.c(r0, r2)
            x1.f r8 = x1.g.f20914f
            r8.getClass()
            x1.y r8 = x1.f.f20883b
            r0.d0()
            boolean r9 = r0.S
            if (r9 == 0) goto L90
            r0.k(r8)
            goto L93
        L90:
            r0.n0()
        L93:
            x1.e r9 = x1.f.f20886e
            i0.r.A(r9, r0, r5)
            x1.e r5 = x1.f.f20885d
            i0.r.A(r5, r0, r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            x1.e r7 = x1.f.f20887f
            i0.r.A(r7, r0, r6)
            x1.d r6 = x1.f.f20888g
            i0.r.w(r6, r0)
            x1.e r10 = x1.f.f20884c
            i0.r.A(r10, r0, r2)
            double r11 = (double) r14
            r18 = 0
            int r11 = (r11 > r18 ? 1 : (r11 == r18 ? 0 : -1))
            if (r11 <= 0) goto Lb8
            goto Lbd
        Lb8:
            java.lang.String r11 = "invalid weight; must be greater than zero"
            q.a.a(r11)
        Lbd:
            p.q0 r11 = new p.q0
            r12 = 1
            r11.<init>(r14, r12)
            p.e r14 = p.j.f9926c
            y0.e r2 = y0.b.f21804s
            r12 = 0
            p.t r2 = p.s.a(r14, r2, r0, r12)
            r14 = r13
            long r12 = r0.T
            int r12 = java.lang.Long.hashCode(r12)
            s0.h r13 = r0.l()
            y0.o r11 = y0.a.c(r0, r11)
            r0.d0()
            boolean r15 = r0.S
            if (r15 == 0) goto Le6
            r0.k(r8)
            goto Le9
        Le6:
            r0.n0()
        Le9:
            i0.r.A(r9, r0, r2)
            i0.r.A(r5, r0, r13)
            j8.b.p(r12, r0, r7, r0, r6)
            i0.r.A(r10, r0, r11)
            i0.m2 r2 = bi.d.f892a
            java.lang.Object r5 = r0.j(r2)
            bi.b r5 = (bi.b) r5
            long r5 = r5.g()
            r7 = 15
            long r7 = x6.d.D(r7)
            r30 = r5
            r5 = r2
            r2 = r30
            m2.k r6 = m2.k.f8698j
            r9 = r1 & 14
            r10 = 1597440(0x186000, float:2.23849E-39)
            r20 = r9 | r10
            r21 = 0
            r22 = 262058(0x3ffaa, float:3.67221E-40)
            r9 = r1
            r1 = 0
            r30 = r7
            r8 = r5
            r4 = r30
            r7 = 0
            r11 = r8
            r10 = r9
            r8 = 0
            r12 = r10
            r10 = 0
            r15 = r11
            r13 = r12
            r11 = 0
            r23 = r13
            r13 = 0
            r24 = r14
            r14 = 0
            r25 = r15
            r15 = 0
            r26 = 2
            r16 = 0
            r27 = 0
            r17 = 0
            r28 = 1
            r18 = 0
            r19 = r0
            r29 = r25
            r0 = r33
            r25 = r24
            r24 = 12
            sh.s.n(r0, r1, r2, r4, r6, r7, r8, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r0 = r19
            boolean r1 = og.m.t0(r34)
            if (r1 != 0) goto L1a7
            r1 = -1230524406(0xffffffffb6a7b00a, float:-4.9974815E-6)
            r0.a0(r1)
            r11 = r29
            java.lang.Object r1 = r0.j(r11)
            bi.b r1 = (bi.b) r1
            long r2 = r1.h()
            long r4 = x6.d.D(r24)
            r1 = 2
            float r15 = (float) r1
            r17 = 0
            r18 = 13
            r14 = 0
            r16 = 0
            r13 = r25
            y0.o r1 = p.d.p(r13, r14, r15, r16, r17, r18)
            int r6 = r23 >> 3
            r6 = r6 & 14
            r6 = r6 | 24624(0x6030, float:3.4506E-41)
            r21 = 0
            r22 = 262120(0x3ffe8, float:3.67308E-40)
            r20 = r6
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = r0
            r0 = r34
            sh.s.n(r0, r1, r2, r4, r6, r7, r8, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r0 = r19
            r12 = 0
            r0.p(r12)
        L1a5:
            r12 = 1
            goto L1b2
        L1a7:
            r12 = 0
            r1 = -1230263417(0xffffffffb6abab87, float:-5.1161655E-6)
            r0.a0(r1)
            r0.p(r12)
            goto L1a5
        L1b2:
            r0.p(r12)
            r0.p(r12)
            goto L1bc
        L1b9:
            r0.V()
        L1bc:
            i0.r1 r0 = r0.t()
            if (r0 == 0) goto L1d4
            wb.uu r2 = new wb.uu
            r8 = 0
            r3 = r32
            r4 = r33
            r5 = r34
            r6 = r35
            r7 = r37
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0.f6035d = r2
        L1d4:
            return
    }
}
