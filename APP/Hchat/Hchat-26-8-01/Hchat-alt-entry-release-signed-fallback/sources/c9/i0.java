package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i0 implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f1212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1213h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1214i;

    public /* synthetic */ i0(int r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.f1212g = r1
            r0.f1213h = r2
            r0.f1214i = r3
            r0.<init>()
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r32, java.lang.Object r33, java.lang.Object r34) {
            r31 = this;
            r0 = r31
            int r1 = r0.f1212g
            switch(r1) {
                case 0: goto L2cd;
                case 1: goto L286;
                case 2: goto L17c;
                case 3: goto L6f;
                default: goto L7;
            }
        L7:
            r11 = r32
            fg.a r11 = (fg.a) r11
            r1 = r33
            i0.h0 r1 = (i0.h0) r1
            r2 = r34
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r11.getClass()
            r3 = r2 & 6
            if (r3 != 0) goto L28
            boolean r3 = r1.h(r11)
            if (r3 == 0) goto L26
            r3 = 4
            goto L27
        L26:
            r3 = 2
        L27:
            r2 = r2 | r3
        L28:
            r3 = r2 & 19
            r4 = 18
            if (r3 == r4) goto L30
            r3 = 1
            goto L31
        L30:
            r3 = 0
        L31:
            r4 = r2 & 1
            boolean r3 = r1.S(r4, r3)
            if (r3 == 0) goto L67
            wb.rf r3 = new wb.rf
            r4 = 2
            java.lang.String r5 = r0.f1214i
            r3.<init>(r5, r11, r4)
            r4 = -1725369821(0xffffffff9928f223, float:-8.7342956E-24)
            s0.d r17 = s0.i.e(r4, r3, r1)
            int r2 = r2 << 24
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r3
            r19 = r2 | 6
            r20 = 3072(0xc00, float:4.305E-42)
            r2 = 0
            java.lang.String r3 = r0.f1213h
            r4 = 0
            r6 = 0
            r8 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            r18 = r1
            oh.h.d(r2, r3, r4, r6, r8, r10, r11, r12, r14, r16, r17, r18, r19, r20)
            goto L6c
        L67:
            r18 = r1
            r18.V()
        L6c:
            sf.n r1 = sf.n.f12433a
            return r1
        L6f:
            r1 = r32
            fg.p r1 = (fg.p) r1
            r2 = r33
            i0.h0 r2 = (i0.h0) r2
            r3 = r34
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.getClass()
            r4 = r3 & 6
            if (r4 != 0) goto L90
            boolean r4 = r2.h(r1)
            if (r4 == 0) goto L8e
            r4 = 4
            goto L8f
        L8e:
            r4 = 2
        L8f:
            r3 = r3 | r4
        L90:
            r25 = r3
            r3 = r25 & 19
            r4 = 18
            r5 = 1
            r6 = 0
            if (r3 == r4) goto L9c
            r3 = r5
            goto L9d
        L9c:
            r3 = r6
        L9d:
            r4 = r25 & 1
            boolean r3 = r2.S(r4, r3)
            if (r3 == 0) goto L176
            y0.g r3 = y0.b.f21792g
            v1.n0 r3 = p.o.d(r3, r6)
            long r7 = r2.T
            int r4 = java.lang.Long.hashCode(r7)
            s0.h r7 = r2.l()
            y0.l r8 = y0.l.f21818a
            y0.o r8 = y0.a.c(r2, r8)
            x1.f r9 = x1.g.f20914f
            r9.getClass()
            x1.y r9 = x1.f.f20883b
            r2.d0()
            boolean r10 = r2.S
            if (r10 == 0) goto Lcd
            r2.k(r9)
            goto Ld0
        Lcd:
            r2.n0()
        Ld0:
            x1.e r9 = x1.f.f20886e
            i0.r.A(r9, r2, r3)
            x1.e r3 = x1.f.f20885d
            i0.r.A(r3, r2, r7)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            x1.e r4 = x1.f.f20887f
            i0.r.A(r4, r2, r3)
            x1.d r3 = x1.f.f20888g
            i0.r.w(r3, r2)
            x1.e r3 = x1.f.f20884c
            i0.r.A(r3, r2, r8)
            java.lang.String r3 = r0.f1213h
            boolean r3 = og.m.t0(r3)
            r26 = 14
            if (r3 == 0) goto L15e
            r3 = 1139870914(0x43f10cc2, float:482.09967)
            r2.a0(r3)
            java.lang.String r3 = r0.f1214i
            boolean r3 = og.m.t0(r3)
            if (r3 == 0) goto L108
            java.lang.String r3 = "当前微信账号资料尚未就绪"
            goto L10a
        L108:
            java.lang.String r3 = "填写评论内容"
        L10a:
            i0.m2 r4 = bi.d.f892a
            java.lang.Object r4 = r2.j(r4)
            bi.b r4 = (bi.b) r4
            long r7 = r4.h()
            r29 = r7
            r8 = r5
            r4 = r29
            r9 = r6
            long r6 = x6.d.D(r26)
            r23 = 0
            r24 = 262122(0x3ffea, float:3.67311E-40)
            r21 = r2
            r2 = r3
            r3 = 0
            r10 = r8
            r8 = 0
            r11 = r9
            r9 = 0
            r12 = r10
            r13 = r11
            r10 = 0
            r14 = r12
            r12 = 0
            r16 = r13
            r15 = r14
            r13 = 0
            r17 = r15
            r15 = 0
            r18 = r16
            r16 = 0
            r19 = r17
            r17 = 0
            r20 = r18
            r18 = 0
            r22 = r19
            r19 = 0
            r27 = r20
            r20 = 0
            r28 = r22
            r22 = 24576(0x6000, float:3.4438E-41)
            r0 = r27
            sh.s.n(r2, r3, r4, r6, r8, r9, r10, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r2 = r21
            r2.p(r0)
            goto L168
        L15e:
            r0 = r6
            r3 = 1140139994(0x43f527da, float:490.31134)
            r2.a0(r3)
            r2.p(r0)
        L168:
            r0 = r25 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.invoke(r2, r0)
            r12 = 1
            r2.p(r12)
            goto L179
        L176:
            r2.V()
        L179:
            sf.n r0 = sf.n.f12433a
            return r0
        L17c:
            r0 = r32
            fg.p r0 = (fg.p) r0
            r1 = r33
            i0.h0 r1 = (i0.h0) r1
            r2 = r34
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.getClass()
            r3 = r2 & 6
            if (r3 != 0) goto L19d
            boolean r3 = r1.h(r0)
            if (r3 == 0) goto L19b
            r3 = 4
            goto L19c
        L19b:
            r3 = 2
        L19c:
            r2 = r2 | r3
        L19d:
            r24 = r2
            r2 = r24 & 19
            r3 = 18
            r4 = 1
            r5 = 0
            if (r2 == r3) goto L1a9
            r2 = r4
            goto L1aa
        L1a9:
            r2 = r5
        L1aa:
            r3 = r24 & 1
            boolean r2 = r1.S(r3, r2)
            if (r2 == 0) goto L280
            y0.g r2 = y0.b.f21795j
            v1.n0 r2 = p.o.d(r2, r5)
            long r6 = r1.T
            int r3 = java.lang.Long.hashCode(r6)
            s0.h r6 = r1.l()
            y0.l r7 = y0.l.f21818a
            y0.o r7 = y0.a.c(r1, r7)
            x1.f r8 = x1.g.f20914f
            r8.getClass()
            x1.y r8 = x1.f.f20883b
            r1.d0()
            boolean r9 = r1.S
            if (r9 == 0) goto L1da
            r1.k(r8)
            goto L1dd
        L1da:
            r1.n0()
        L1dd:
            x1.e r8 = x1.f.f20886e
            i0.r.A(r8, r1, r2)
            x1.e r2 = x1.f.f20885d
            i0.r.A(r2, r1, r6)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            x1.e r3 = x1.f.f20887f
            i0.r.A(r3, r1, r2)
            x1.d r2 = x1.f.f20888g
            i0.r.w(r2, r1)
            x1.e r2 = x1.f.f20884c
            i0.r.A(r2, r1, r7)
            r2 = r31
            java.lang.String r3 = r2.f1213h
            int r3 = r3.length()
            if (r3 != 0) goto L264
            r3 = -585908205(0xffffffffdd13c013, float:-6.6540815E17)
            r1.a0(r3)
            i0.m2 r3 = bi.d.f892a
            java.lang.Object r3 = r1.j(r3)
            bi.b r3 = (bi.b) r3
            long r6 = r3.h()
            r3 = 16
            long r8 = x6.d.D(r3)
            r22 = 0
            r23 = 262122(0x3ffea, float:3.67311E-40)
            r20 = r1
            java.lang.String r1 = r2.f1214i
            r2 = 0
            r29 = r6
            r6 = r4
            r3 = r29
            r7 = 0
            r10 = r5
            r29 = r8
            r9 = r6
            r5 = r29
            r8 = 0
            r11 = r9
            r12 = r10
            r9 = 0
            r13 = r11
            r11 = 0
            r15 = r12
            r14 = r13
            r12 = 0
            r16 = r14
            r14 = 0
            r17 = r15
            r15 = 0
            r18 = r16
            r16 = 0
            r19 = r17
            r17 = 0
            r21 = r18
            r18 = 0
            r25 = r19
            r19 = 0
            r26 = r21
            r21 = 24576(0x6000, float:3.4438E-41)
            r32 = r0
            r0 = r25
            sh.s.n(r1, r2, r3, r5, r7, r8, r9, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r1 = r20
            r1.p(r0)
            goto L270
        L264:
            r32 = r0
            r0 = r5
            r2 = -585639125(0xffffffffdd17db2b, float:-6.838992E17)
            r1.a0(r2)
            r1.p(r0)
        L270:
            r0 = r24 & 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = r32
            r2.invoke(r1, r0)
            r13 = 1
            r1.p(r13)
            goto L283
        L280:
            r1.V()
        L283:
            sf.n r0 = sf.n.f12433a
            return r0
        L286:
            r0 = r32
            r.d r0 = (r.d) r0
            r1 = r33
            i0.h0 r1 = (i0.h0) r1
            r2 = r34
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.getClass()
            r0 = r2 & 17
            r3 = 16
            r4 = 1
            if (r0 == r3) goto L2a2
            r0 = r4
            goto L2a3
        L2a2:
            r0 = 0
        L2a3:
            r2 = r2 & r4
            boolean r0 = r1.S(r2, r0)
            if (r0 == 0) goto L2c5
            wb.vh r0 = new wb.vh
            r2 = 0
            r3 = 0
            r5 = r31
            java.lang.String r6 = r5.f1213h
            java.lang.String r7 = r5.f1214i
            r0.<init>(r6, r7, r2, r3)
            r2 = 1829654377(0x6d0e4f69, float:2.7526795E27)
            s0.d r0 = s0.i.e(r2, r0, r1)
            r2 = 48
            r3 = 0
            wb.ho.C3(r3, r0, r1, r2, r4)
            goto L2ca
        L2c5:
            r5 = r31
            r1.V()
        L2ca:
            sf.n r0 = sf.n.f12433a
            return r0
        L2cd:
            r5 = r0
            r0 = r32
            fg.p r0 = (fg.p) r0
            r1 = r33
            i0.h0 r1 = (i0.h0) r1
            r2 = r34
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.getClass()
            r3 = r2 & 6
            if (r3 != 0) goto L2ef
            boolean r3 = r1.h(r0)
            if (r3 == 0) goto L2ed
            r3 = 4
            goto L2ee
        L2ed:
            r3 = 2
        L2ee:
            r2 = r2 | r3
        L2ef:
            r3 = r2 & 19
            r4 = 18
            r6 = 1
            r7 = 0
            if (r3 == r4) goto L2f9
            r3 = r6
            goto L2fa
        L2f9:
            r3 = r7
        L2fa:
            r4 = r2 & 1
            boolean r3 = r1.S(r4, r3)
            if (r3 == 0) goto L3ab
            y0.g r3 = y0.b.f21792g
            v1.n0 r3 = p.o.d(r3, r7)
            long r8 = r1.T
            int r4 = java.lang.Long.hashCode(r8)
            s0.h r8 = r1.l()
            y0.l r9 = y0.l.f21818a
            y0.o r9 = y0.a.c(r1, r9)
            x1.f r10 = x1.g.f20914f
            r10.getClass()
            x1.y r10 = x1.f.f20883b
            r1.d0()
            boolean r11 = r1.S
            if (r11 == 0) goto L32a
            r1.k(r10)
            goto L32d
        L32a:
            r1.n0()
        L32d:
            x1.e r10 = x1.f.f20886e
            i0.r.A(r10, r1, r3)
            x1.e r3 = x1.f.f20885d
            i0.r.A(r3, r1, r8)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            x1.e r4 = x1.f.f20887f
            i0.r.A(r4, r1, r3)
            x1.d r3 = x1.f.f20888g
            i0.r.w(r3, r1)
            x1.e r3 = x1.f.f20884c
            i0.r.A(r3, r1, r9)
            java.lang.String r3 = r5.f1213h
            int r3 = r3.length()
            if (r3 != 0) goto L393
            r3 = -897639683(0xffffffffca7f1afd, float:-4179647.2)
            r1.a0(r3)
            i0.m2 r3 = bi.d.f892a
            java.lang.Object r3 = r1.j(r3)
            bi.b r3 = (bi.b) r3
            long r8 = r3.h()
            r3 = 15
            long r10 = x6.d.D(r3)
            r27 = 0
            r28 = 262122(0x3ffea, float:3.67311E-40)
            r3 = r6
            java.lang.String r6 = r5.f1214i
            r4 = r7
            r7 = 0
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
            r26 = 24576(0x6000, float:3.4438E-41)
            r25 = r1
            sh.s.n(r6, r7, r8, r10, r12, r13, r14, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r1.p(r4)
            goto L39e
        L393:
            r3 = r6
            r4 = r7
            r6 = -897393667(0xffffffffca82dbfd, float:-4287998.5)
            r1.a0(r6)
            r1.p(r4)
        L39e:
            r2 = r2 & 14
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.invoke(r1, r2)
            r1.p(r3)
            goto L3ae
        L3ab:
            r1.V()
        L3ae:
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
