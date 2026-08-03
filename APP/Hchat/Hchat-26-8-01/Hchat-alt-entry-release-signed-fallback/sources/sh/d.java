package sh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f12542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f12543h;

    public /* synthetic */ d(java.lang.String r1, int r2) {
            r0 = this;
            r0.f12542g = r2
            r0.f12543h = r1
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r32, java.lang.Object r33, java.lang.Object r34) {
            r31 = this;
            r0 = r31
            int r1 = r0.f12542g
            switch(r1) {
                case 0: goto L47f;
                case 1: goto L3cb;
                case 2: goto L388;
                case 3: goto L353;
                case 4: goto L310;
                case 5: goto L20a;
                case 6: goto Lec;
                case 7: goto Lb4;
                default: goto L7;
            }
        L7:
            r1 = r32
            fg.p r1 = (fg.p) r1
            r2 = r33
            i0.h0 r2 = (i0.h0) r2
            r3 = r34
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.getClass()
            r4 = r3 & 6
            if (r4 != 0) goto L28
            boolean r4 = r2.h(r1)
            if (r4 == 0) goto L26
            r4 = 4
            goto L27
        L26:
            r4 = 2
        L27:
            r3 = r3 | r4
        L28:
            r25 = r3
            r3 = r25 & 19
            r4 = 18
            r5 = 0
            if (r3 == r4) goto L33
            r3 = 1
            goto L34
        L33:
            r3 = r5
        L34:
            r4 = r25 & 1
            boolean r3 = r2.S(r4, r3)
            if (r3 == 0) goto Lae
            java.lang.String r3 = r0.f12543h
            int r3 = r3.length()
            r26 = 14
            if (r3 != 0) goto L9a
            r3 = -1954984075(0xffffffff8b794f75, float:-4.8015432E-32)
            r2.a0(r3)
            i0.m2 r3 = bi.d.f892a
            java.lang.Object r3 = r2.j(r3)
            bi.b r3 = (bi.b) r3
            long r3 = r3.h()
            long r6 = x6.d.D(r26)
            r23 = 0
            r24 = 262122(0x3ffea, float:3.67311E-40)
            r21 = r2
            java.lang.String r2 = "搜索昵称 / 群聊备注 / wxid"
            r8 = r5
            r4 = r3
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
            r22 = r20
            r20 = 0
            r27 = r22
            r22 = 24582(0x6006, float:3.4447E-41)
            r0 = r27
            sh.s.n(r2, r3, r4, r6, r8, r9, r10, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r2 = r21
            r2.p(r0)
            goto La4
        L9a:
            r0 = r5
            r3 = -1954752474(0xffffffff8b7cd826, float:-4.8696047E-32)
            r2.a0(r3)
            r2.p(r0)
        La4:
            r0 = r25 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.invoke(r2, r0)
            goto Lb1
        Lae:
            r2.V()
        Lb1:
            sf.n r0 = sf.n.f12433a
            return r0
        Lb4:
            r0 = r32
            h.b0 r0 = (h.b0) r0
            r1 = r33
            i0.h0 r1 = (i0.h0) r1
            r2 = r34
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.getClass()
            r0 = r2 & 17
            r3 = 16
            r4 = 1
            if (r0 == r3) goto Ld0
            r0 = r4
            goto Ld1
        Ld0:
            r0 = 0
        Ld1:
            r2 = r2 & r4
            boolean r0 = r1.S(r2, r0)
            if (r0 == 0) goto Le4
            wb.y2 r0 = wb.y2.f20289n
            r2 = 48
            r3 = r31
            java.lang.String r4 = r3.f12543h
            r0.T(r4, r1, r2)
            goto Le9
        Le4:
            r3 = r31
            r1.V()
        Le9:
            sf.n r0 = sf.n.f12433a
            return r0
        Lec:
            r3 = r0
            r0 = r32
            fg.p r0 = (fg.p) r0
            r1 = r33
            i0.h0 r1 = (i0.h0) r1
            r2 = r34
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.getClass()
            r4 = r2 & 6
            r5 = 2
            if (r4 != 0) goto L10f
            boolean r4 = r1.h(r0)
            if (r4 == 0) goto L10d
            r4 = 4
            goto L10e
        L10d:
            r4 = r5
        L10e:
            r2 = r2 | r4
        L10f:
            r4 = r2 & 19
            r6 = 18
            r7 = 0
            r8 = 1
            if (r4 == r6) goto L119
            r4 = r8
            goto L11a
        L119:
            r4 = r7
        L11a:
            r6 = r2 & 1
            boolean r4 = r1.S(r6, r4)
            if (r4 == 0) goto L203
            y0.l r4 = y0.l.f21818a
            r6 = 1065353216(0x3f800000, float:1.0)
            y0.o r4 = p.h1.d(r4, r6)
            r6 = 34
            float r6 = (float) r6
            r9 = 0
            y0.o r4 = p.h1.g(r4, r6, r9, r5)
            y0.g r5 = y0.b.f21795j
            v1.n0 r5 = p.o.d(r5, r7)
            long r9 = r1.T
            int r6 = java.lang.Long.hashCode(r9)
            s0.h r9 = r1.l()
            y0.o r4 = y0.a.c(r1, r4)
            x1.f r10 = x1.g.f20914f
            r10.getClass()
            x1.y r10 = x1.f.f20883b
            r1.d0()
            boolean r11 = r1.S
            if (r11 == 0) goto L158
            r1.k(r10)
            goto L15b
        L158:
            r1.n0()
        L15b:
            x1.e r10 = x1.f.f20886e
            i0.r.A(r10, r1, r5)
            x1.e r5 = x1.f.f20885d
            i0.r.A(r5, r1, r9)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            x1.e r6 = x1.f.f20887f
            i0.r.A(r6, r1, r5)
            x1.d r5 = x1.f.f20888g
            i0.r.w(r5, r1)
            x1.e r5 = x1.f.f20884c
            i0.r.A(r5, r1, r4)
            java.lang.String r4 = r3.f12543h
            boolean r4 = og.m.t0(r4)
            r27 = 14
            if (r4 == 0) goto L1e8
            r4 = -1157652548(0xffffffffbaff9fbc, float:-0.0019502561)
            r1.a0(r4)
            i0.m2 r4 = bi.d.f892a
            java.lang.Object r4 = r1.j(r4)
            bi.b r4 = (bi.b) r4
            long r4 = r4.h()
            r6 = r8
            long r8 = x6.d.D(r27)
            r25 = 0
            r26 = 262122(0x3ffea, float:3.67311E-40)
            r10 = r6
            r29 = r4
            r5 = r7
            r6 = r29
            java.lang.String r4 = "输入消息"
            r11 = r5
            r5 = 0
            r12 = r10
            r10 = 0
            r13 = r11
            r11 = 0
            r15 = r12
            r14 = r13
            r12 = 0
            r16 = r14
            r14 = 0
            r18 = r15
            r17 = r16
            r15 = 0
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
            r24 = r22
            r22 = 0
            r28 = r24
            r24 = 24582(0x6006, float:3.4447E-41)
            r32 = r23
            r23 = r1
            r1 = r32
            r32 = r2
            r2 = r28
            sh.s.n(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r4 = r23
            r4.p(r1)
            goto L1f6
        L1e8:
            r4 = r1
            r32 = r2
            r1 = r7
            r2 = r8
            r5 = -1157388273(0xffffffffbb03a80f, float:-0.0020089184)
            r4.a0(r5)
            r4.p(r1)
        L1f6:
            r1 = r32 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.invoke(r4, r1)
            r4.p(r2)
            goto L207
        L203:
            r4 = r1
            r4.V()
        L207:
            sf.n r0 = sf.n.f12433a
            return r0
        L20a:
            r3 = r0
            r0 = r32
            fg.p r0 = (fg.p) r0
            r1 = r33
            i0.h0 r1 = (i0.h0) r1
            r2 = r34
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.getClass()
            r4 = r2 & 6
            if (r4 != 0) goto L22c
            boolean r4 = r1.h(r0)
            if (r4 == 0) goto L22a
            r4 = 4
            goto L22b
        L22a:
            r4 = 2
        L22b:
            r2 = r2 | r4
        L22c:
            r4 = r2 & 19
            r5 = 18
            r6 = 1
            r7 = 0
            if (r4 == r5) goto L236
            r4 = r6
            goto L237
        L236:
            r4 = r7
        L237:
            r5 = r2 & 1
            boolean r4 = r1.S(r5, r4)
            if (r4 == 0) goto L309
            y0.g r4 = y0.b.f21792g
            v1.n0 r4 = p.o.d(r4, r7)
            long r8 = r1.T
            int r5 = java.lang.Long.hashCode(r8)
            s0.h r8 = r1.l()
            y0.l r9 = y0.l.f21818a
            y0.o r9 = y0.a.c(r1, r9)
            x1.f r10 = x1.g.f20914f
            r10.getClass()
            x1.y r10 = x1.f.f20883b
            r1.d0()
            boolean r11 = r1.S
            if (r11 == 0) goto L267
            r1.k(r10)
            goto L26a
        L267:
            r1.n0()
        L26a:
            x1.e r10 = x1.f.f20886e
            i0.r.A(r10, r1, r4)
            x1.e r4 = x1.f.f20885d
            i0.r.A(r4, r1, r8)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            x1.e r5 = x1.f.f20887f
            i0.r.A(r5, r1, r4)
            x1.d r4 = x1.f.f20888g
            i0.r.w(r4, r1)
            x1.e r4 = x1.f.f20884c
            i0.r.A(r4, r1, r9)
            java.lang.String r4 = r3.f12543h
            boolean r4 = og.m.t0(r4)
            r27 = 14
            if (r4 == 0) goto L2f0
            r4 = -1294328437(0xffffffffb2da1d8b, float:-2.5391975E-8)
            r1.a0(r4)
            i0.m2 r4 = bi.d.f892a
            java.lang.Object r4 = r1.j(r4)
            bi.b r4 = (bi.b) r4
            long r4 = r4.h()
            long r8 = x6.d.D(r27)
            r25 = 0
            r26 = 262122(0x3ffea, float:3.67311E-40)
            r10 = r7
            r29 = r4
            r5 = r6
            r6 = r29
            java.lang.String r4 = "填写本次版本的更新内容"
            r11 = r5
            r5 = 0
            r12 = r10
            r10 = 0
            r13 = r11
            r11 = 0
            r15 = r12
            r14 = r13
            r12 = 0
            r16 = r14
            r14 = 0
            r18 = r15
            r17 = r16
            r15 = 0
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
            r24 = r22
            r22 = 0
            r28 = r24
            r24 = 24582(0x6006, float:3.4447E-41)
            r23 = r1
            r1 = r28
            sh.s.n(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r4 = r23
            r4.p(r1)
            goto L2fb
        L2f0:
            r4 = r1
            r1 = r7
            r5 = -1294057435(0xffffffffb2de4025, float:-2.5873371E-8)
            r4.a0(r5)
            r4.p(r1)
        L2fb:
            r1 = r2 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.invoke(r4, r1)
            r13 = 1
            r4.p(r13)
            goto L30d
        L309:
            r4 = r1
            r4.V()
        L30d:
            sf.n r0 = sf.n.f12433a
            return r0
        L310:
            r3 = r0
            r0 = r32
            r.d r0 = (r.d) r0
            r1 = r33
            i0.h0 r1 = (i0.h0) r1
            r2 = r34
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.getClass()
            r0 = r2 & 17
            r4 = 16
            r5 = 1
            if (r0 == r4) goto L32d
            r0 = r5
            goto L32e
        L32d:
            r0 = 0
        L32e:
            r2 = r2 & r5
            boolean r0 = r1.S(r2, r0)
            if (r0 == 0) goto L34d
            r0 = 10
            float r6 = (float) r0
            r8 = 0
            r9 = 13
            y0.l r4 = y0.l.f21818a
            r5 = 0
            r7 = 0
            y0.o r0 = p.d.p(r4, r5, r6, r7, r8, r9)
            r2 = 48
            r4 = 12
            java.lang.String r5 = r3.f12543h
            sh.s.j(r5, r0, r1, r2, r4)
            goto L350
        L34d:
            r1.V()
        L350:
            sf.n r0 = sf.n.f12433a
            return r0
        L353:
            r3 = r0
            r0 = r32
            r.d r0 = (r.d) r0
            r1 = r33
            i0.h0 r1 = (i0.h0) r1
            r2 = r34
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.getClass()
            r0 = r2 & 17
            r4 = 16
            r5 = 0
            r6 = 1
            if (r0 == r4) goto L371
            r0 = r6
            goto L372
        L371:
            r0 = r5
        L372:
            r2 = r2 & r6
            boolean r0 = r1.S(r2, r0)
            if (r0 == 0) goto L382
            r0 = 0
            r2 = 14
            java.lang.String r4 = r3.f12543h
            sh.s.j(r4, r0, r1, r5, r2)
            goto L385
        L382:
            r1.V()
        L385:
            sf.n r0 = sf.n.f12433a
            return r0
        L388:
            r3 = r0
            r0 = r32
            r.d r0 = (r.d) r0
            r1 = r33
            i0.h0 r1 = (i0.h0) r1
            r2 = r34
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.getClass()
            r0 = r2 & 17
            r4 = 16
            r5 = 1
            if (r0 == r4) goto L3a5
            r0 = r5
            goto L3a6
        L3a5:
            r0 = 0
        L3a6:
            r2 = r2 & r5
            boolean r0 = r1.S(r2, r0)
            if (r0 == 0) goto L3c5
            r0 = 10
            float r6 = (float) r0
            r8 = 0
            r9 = 13
            y0.l r4 = y0.l.f21818a
            r5 = 0
            r7 = 0
            y0.o r0 = p.d.p(r4, r5, r6, r7, r8, r9)
            r2 = 48
            r4 = 12
            java.lang.String r5 = r3.f12543h
            sh.s.j(r5, r0, r1, r2, r4)
            goto L3c8
        L3c5:
            r1.V()
        L3c8:
            sf.n r0 = sf.n.f12433a
            return r0
        L3cb:
            r3 = r0
            r0 = r32
            fg.p r0 = (fg.p) r0
            r1 = r33
            i0.h0 r1 = (i0.h0) r1
            r2 = r34
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.getClass()
            r4 = r2 & 6
            if (r4 != 0) goto L3ed
            boolean r4 = r1.h(r0)
            if (r4 == 0) goto L3eb
            r4 = 4
            goto L3ec
        L3eb:
            r4 = 2
        L3ec:
            r2 = r2 | r4
        L3ed:
            r4 = r2 & 19
            r5 = 18
            r6 = 0
            if (r4 == r5) goto L3f6
            r4 = 1
            goto L3f7
        L3f6:
            r4 = r6
        L3f7:
            r5 = r2 & 1
            boolean r4 = r1.S(r5, r4)
            if (r4 == 0) goto L478
            java.lang.String r4 = r3.f12543h
            int r4 = r4.length()
            r27 = 14
            if (r4 != 0) goto L463
            r4 = -18850263(0xfffffffffee05e29, float:-1.4911799E38)
            r1.a0(r4)
            i0.m2 r4 = bi.d.f892a
            java.lang.Object r4 = r1.j(r4)
            bi.b r4 = (bi.b) r4
            long r4 = r4.h()
            long r8 = x6.d.D(r27)
            r25 = 0
            r26 = 262122(0x3ffea, float:3.67311E-40)
            r29 = r4
            r5 = r6
            r6 = r29
            java.lang.String r4 = "留空使用群主/管理员/群员"
            r10 = r5
            r5 = 0
            r11 = r10
            r10 = 0
            r12 = r11
            r11 = 0
            r14 = r12
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
            r24 = 24576(0x6000, float:3.4438E-41)
            r29 = r23
            r23 = r1
            r1 = r29
            sh.s.n(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r4 = r23
            r4.p(r1)
            goto L46e
        L463:
            r4 = r1
            r1 = r6
            r5 = -18604247(0xfffffffffee41f29, float:-1.5161289E38)
            r4.a0(r5)
            r4.p(r1)
        L46e:
            r1 = r2 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.invoke(r4, r1)
            goto L47c
        L478:
            r4 = r1
            r4.V()
        L47c:
            sf.n r0 = sf.n.f12433a
            return r0
        L47f:
            r3 = r0
            r0 = r32
            p.f1 r0 = (p.f1) r0
            r1 = r33
            i0.h0 r1 = (i0.h0) r1
            r2 = r34
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.getClass()
            r0 = r2 & 17
            r4 = 16
            r5 = 1
            if (r0 == r4) goto L49c
            r0 = r5
            goto L49d
        L49c:
            r0 = 0
        L49d:
            r2 = r2 & r5
            boolean r0 = r1.S(r2, r0)
            if (r0 == 0) goto L4db
            i0.m2 r0 = bi.m.f920a
            java.lang.Object r0 = r1.j(r0)
            bi.l r0 = (bi.l) r0
            i0.j1 r0 = r0.f910e
            java.lang.Object r0 = r0.getValue()
            r22 = r0
            i2.n0 r22 = (i2.n0) r22
            r25 = 0
            r26 = 131070(0x1fffe, float:1.83668E-40)
            java.lang.String r4 = r3.f12543h
            r5 = 0
            r6 = 0
            r8 = 0
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
            r24 = 0
            r23 = r1
            sh.s.n(r4, r5, r6, r8, r10, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L4e0
        L4db:
            r23 = r1
            r23.V()
        L4e0:
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
