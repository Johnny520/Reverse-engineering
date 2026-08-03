package f0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements fg.q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2958g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f2959h;

    public /* synthetic */ h(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f2958g = r2
            r0.f2959h = r1
            r0.<init>()
            return
    }

    public /* synthetic */ h(yg.b r1, yg.a r2) {
            r0 = this;
            r2 = 14
            r0.f2958g = r2
            r0.<init>()
            r0.f2959h = r1
            return
    }

    @Override // fg.q
    public final java.lang.Object b(java.lang.Object r26, java.lang.Object r27, java.lang.Object r28) {
            r25 = this;
            r0 = r25
            int r1 = r0.f2958g
            r2 = 14
            r3 = 12
            r4 = 10
            i0.e r5 = i0.l.f5952a
            r6 = 48
            r7 = 0
            r8 = 16
            r9 = 1
            r10 = 0
            sf.n r11 = sf.n.f12433a
            java.lang.Object r12 = r0.f2959h
            switch(r1) {
                case 0: goto L3c3;
                case 1: goto L351;
                case 2: goto L339;
                case 3: goto L32b;
                case 4: goto L2af;
                case 5: goto L280;
                case 6: goto L23f;
                case 7: goto L207;
                case 8: goto L1ba;
                case 9: goto L17b;
                case 10: goto Lfe;
                case 11: goto Lcf;
                case 12: goto L8f;
                case 13: goto L43;
                case 14: goto L2c;
                default: goto L1a;
            }
        L1a:
            yg.f r12 = (yg.f) r12
            r1 = r26
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r1 = r27
            sf.n r1 = (sf.n) r1
            r1 = r28
            wf.g r1 = (wf.g) r1
            r12.b()
            return r11
        L2c:
            yg.b r12 = (yg.b) r12
            r1 = r26
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r1 = r27
            sf.n r1 = (sf.n) r1
            r1 = r28
            wf.g r1 = (wf.g) r1
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = yg.b.f22442g
            r1.set(r12, r7)
            r12.f(r7)
            return r11
        L43:
            android.widget.FrameLayout r12 = (android.widget.FrameLayout) r12
            r1 = r26
            p.r r1 = (p.r) r1
            r2 = r27
            i0.h0 r2 = (i0.h0) r2
            r3 = r28
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.getClass()
            r1 = r3 & 17
            if (r1 == r8) goto L5d
            r10 = r9
        L5d:
            r1 = r3 & 1
            boolean r1 = r2.S(r1, r10)
            if (r1 == 0) goto L89
            boolean r1 = r2.h(r12)
            java.lang.Object r3 = r2.P()
            if (r1 != 0) goto L71
            if (r3 != r5) goto L79
        L71:
            wb.ar r3 = new wb.ar
            r3.<init>(r12, r9)
            r2.k0(r3)
        L79:
            r13 = r3
            fg.l r13 = (fg.l) r13
            p.a0 r14 = p.h1.f9915c
            r17 = 48
            r18 = 4
            r15 = 0
            r16 = r2
            x2.i.b(r13, r14, r15, r16, r17, r18)
            goto L8e
        L89:
            r16 = r2
            r16.V()
        L8e:
            return r11
        L8f:
            ba.a r12 = (ba.a) r12
            r1 = r26
            r.d r1 = (r.d) r1
            r2 = r27
            i0.h0 r2 = (i0.h0) r2
            r5 = r28
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r1.getClass()
            r1 = r5 & 17
            if (r1 == r8) goto La9
            r10 = r9
        La9:
            r1 = r5 & 1
            boolean r1 = r2.S(r1, r10)
            if (r1 == 0) goto Lcb
            float r15 = (float) r4
            r17 = 0
            r18 = 13
            y0.l r13 = y0.l.f21818a
            r14 = 0
            r16 = 0
            y0.o r1 = p.d.p(r13, r14, r15, r16, r17, r18)
            java.lang.String r4 = r12.f550g
            java.lang.String r5 = "气泡"
            java.lang.String r4 = r4.concat(r5)
            sh.s.j(r4, r1, r2, r6, r3)
            goto Lce
        Lcb:
            r2.V()
        Lce:
            return r11
        Lcf:
            fg.p r12 = (fg.p) r12
            r1 = r26
            p.u r1 = (p.u) r1
            r2 = r27
            i0.h0 r2 = (i0.h0) r2
            r3 = r28
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.getClass()
            r1 = r3 & 17
            if (r1 == r8) goto Lea
            r1 = r9
            goto Leb
        Lea:
            r1 = r10
        Leb:
            r3 = r3 & r9
            boolean r1 = r2.S(r3, r1)
            if (r1 == 0) goto Lfa
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r12.invoke(r2, r1)
            goto Lfd
        Lfa:
            r2.V()
        Lfd:
            return r11
        Lfe:
            sh.x r12 = (sh.x) r12
            r1 = r26
            p.x0 r1 = (p.x0) r1
            r2 = r27
            i0.h0 r2 = (i0.h0) r2
            r3 = r28
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.getClass()
            r4 = r3 & 6
            if (r4 != 0) goto L121
            boolean r4 = r2.f(r1)
            if (r4 == 0) goto L11f
            r4 = 4
            goto L120
        L11f:
            r4 = 2
        L120:
            r3 = r3 | r4
        L121:
            r4 = r3 & 19
            r6 = 18
            if (r4 == r6) goto L128
            r10 = r9
        L128:
            r3 = r3 & r9
            boolean r3 = r2.S(r3, r10)
            if (r3 == 0) goto L175
            p.a0 r3 = p.h1.f9915c
            m.a r4 = r12.f12897e
            y0.o r13 = r1.f.a(r3, r4, r7)
            float r3 = r1.c()
            r4 = 8
            float r4 = (float) r4
            float r3 = r3 + r4
            float r1 = r1.a()
            r4 = 84
            float r4 = (float) r4
            float r1 = r1 + r4
            r4 = 5
            p.z0 r15 = p.d.b(r3, r1, r4)
            java.lang.Object r1 = r2.P()
            if (r1 != r5) goto L15c
            w0.l r1 = new w0.l
            r3 = 25
            r1.<init>(r3)
            r2.k0(r1)
        L15c:
            r21 = r1
            fg.l r21 = (fg.l) r21
            r23 = 805306368(0x30000000, float:4.656613E-10)
            r24 = 506(0x1fa, float:7.09E-43)
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = r2
            a.a.b(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            goto L17a
        L175:
            r22 = r2
            r22.V()
        L17a:
            return r11
        L17b:
            wb.s0 r12 = (wb.s0) r12
            r1 = r26
            r.d r1 = (r.d) r1
            r2 = r27
            i0.h0 r2 = (i0.h0) r2
            r5 = r28
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r1.getClass()
            r1 = r5 & 17
            if (r1 == r8) goto L195
            r10 = r9
        L195:
            r1 = r5 & 1
            boolean r1 = r2.S(r1, r10)
            if (r1 == 0) goto L1b6
            float r15 = (float) r4
            r17 = 0
            r18 = 13
            y0.l r13 = y0.l.f21818a
            r14 = 0
            r16 = 0
            y0.o r1 = p.d.p(r13, r14, r15, r16, r17, r18)
            if (r12 != 0) goto L1b0
            java.lang.String r4 = "群聊"
            goto L1b2
        L1b0:
            java.lang.String r4 = "群成员"
        L1b2:
            sh.s.j(r4, r1, r2, r6, r3)
            goto L1b9
        L1b6:
            r2.V()
        L1b9:
            return r11
        L1ba:
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            r1 = r26
            r.d r1 = (r.d) r1
            r2 = r27
            i0.h0 r2 = (i0.h0) r2
            r5 = r28
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r1.getClass()
            r1 = r5 & 17
            if (r1 == r8) goto L1d4
            r10 = r9
        L1d4:
            r1 = r5 & 1
            boolean r1 = r2.S(r1, r10)
            if (r1 == 0) goto L203
            float r15 = (float) r4
            r17 = 0
            r18 = 13
            y0.l r13 = y0.l.f21818a
            r14 = 0
            r16 = 0
            y0.o r1 = p.d.p(r13, r14, r15, r16, r17, r18)
            boolean r4 = r12.isEmpty()
            if (r4 == 0) goto L1f3
            java.lang.String r4 = "关键词"
            goto L1ff
        L1f3:
            int r4 = r12.size()
            java.lang.String r5 = "关键词 · "
            java.lang.String r7 = " 个"
            java.lang.String r4 = eh.a.m(r4, r5, r7)
        L1ff:
            sh.s.j(r4, r1, r2, r6, r3)
            goto L206
        L203:
            r2.V()
        L206:
            return r11
        L207:
            wb.h5 r12 = (wb.h5) r12
            r1 = r26
            r.d r1 = (r.d) r1
            r2 = r27
            i0.h0 r2 = (i0.h0) r2
            r3 = r28
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.getClass()
            r1 = r3 & 17
            if (r1 == r8) goto L221
            r10 = r9
        L221:
            r1 = r3 & 1
            boolean r1 = r2.S(r1, r10)
            if (r1 == 0) goto L23b
            b0.t r1 = new b0.t
            r3 = 28
            r1.<init>(r12, r3)
            r3 = 371513879(0x1624da17, float:1.3316632E-25)
            s0.d r1 = s0.i.e(r3, r1, r2)
            wb.ho.C3(r7, r1, r2, r6, r9)
            goto L23e
        L23b:
            r2.V()
        L23e:
            return r11
        L23f:
            db.c r12 = (db.c) r12
            r1 = r26
            r.d r1 = (r.d) r1
            r2 = r27
            i0.h0 r2 = (i0.h0) r2
            r5 = r28
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r1.getClass()
            r1 = r5 & 17
            if (r1 == r8) goto L259
            r10 = r9
        L259:
            r1 = r5 & 1
            boolean r1 = r2.S(r1, r10)
            if (r1 == 0) goto L27c
            float r15 = (float) r4
            r17 = 0
            r18 = 13
            y0.l r13 = y0.l.f21818a
            r14 = 0
            r16 = 0
            y0.o r1 = p.d.p(r13, r14, r15, r16, r17, r18)
            int r4 = r12.f2185r
            if (r4 != r9) goto L276
            java.lang.String r4 = "朋友圈内容"
            goto L278
        L276:
            java.lang.String r4 = "发送内容"
        L278:
            sh.s.j(r4, r1, r2, r6, r3)
            goto L27f
        L27c:
            r2.V()
        L27f:
            return r11
        L280:
            vb.a r12 = (vb.a) r12
            r1 = r26
            r.d r1 = (r.d) r1
            r3 = r27
            i0.h0 r3 = (i0.h0) r3
            r4 = r28
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r1.getClass()
            r1 = r4 & 17
            if (r1 == r8) goto L29b
            r1 = r9
            goto L29c
        L29b:
            r1 = r10
        L29c:
            r4 = r4 & r9
            boolean r1 = r3.S(r4, r1)
            if (r1 == 0) goto L2ab
            java.lang.String r1 = r12.b()
            sh.s.j(r1, r7, r3, r10, r2)
            goto L2ae
        L2ab:
            r3.V()
        L2ae:
            return r11
        L2af:
            c9.u r12 = (c9.u) r12
            r1 = r26
            y0.o r1 = (y0.o) r1
            r1 = r27
            i0.h0 r1 = (i0.h0) r1
            r3 = r28
            java.lang.Integer r3 = (java.lang.Integer) r3
            r3.getClass()
            r3 = -102778667(0xfffffffff9dfb8d5, float:-1.4520388E35)
            r1.a0(r3)
            java.lang.Object r3 = r1.P()
            if (r3 != r5) goto L2d3
            qg.t r3 = i0.r.n(r1)
            r1.k0(r3)
        L2d3:
            qg.t r3 = (qg.t) r3
            java.lang.Object r4 = r1.P()
            if (r4 != r5) goto L2e2
            i0.j1 r4 = i0.r.u(r7)
            r1.k0(r4)
        L2e2:
            i0.a1 r4 = (i0.a1) r4
            i0.a1 r6 = i0.r.y(r12, r1)
            boolean r8 = r1.f(r7)
            java.lang.Object r9 = r1.P()
            if (r8 != 0) goto L2f4
            if (r9 != r5) goto L2fc
        L2f4:
            b0.l r9 = new b0.l
            r9.<init>(r4, r2)
            r1.k0(r9)
        L2fc:
            fg.l r9 = (fg.l) r9
            i0.r.c(r7, r9, r1)
            boolean r2 = r1.h(r3)
            boolean r8 = r1.f(r7)
            r2 = r2 | r8
            boolean r8 = r1.f(r6)
            r2 = r2 | r8
            java.lang.Object r8 = r1.P()
            if (r2 != 0) goto L317
            if (r8 != r5) goto L31f
        L317:
            w.f1 r8 = new w.f1
            r8.<init>(r3, r4, r6, r10)
            r1.k0(r8)
        L31f:
            androidx.compose.ui.input.pointer.PointerInputEventHandler r8 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) r8
            y0.l r2 = y0.l.f21818a
            y0.o r2 = s1.h0.a(r2, r7, r8)
            r1.p(r10)
            return r2
        L32b:
            nb.a r12 = (nb.a) r12
            r1 = r26
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r2 = r28
            wf.g r2 = (wf.g) r2
            r12.invoke(r1)
            return r11
        L339:
            h0.y r12 = (h0.y) r12
            r1 = r26
            s1.t r1 = (s1.t) r1
            r1 = r27
            s1.t r1 = (s1.t) r1
            r2 = r28
            e1.b r2 = (e1.b) r2
            long r1 = r1.f12293c
            w.y0 r3 = r12.f5026h
            g1.d r4 = h0.w.f5009d
            r3.a(r1, r4)
            return r11
        L351:
            h0.d1 r12 = (h0.d1) r12
            r1 = r26
            y0.o r1 = (y0.o) r1
            r2 = r27
            i0.h0 r2 = (i0.h0) r2
            r3 = r28
            java.lang.Integer r3 = (java.lang.Integer) r3
            r3.getClass()
            r3 = 1980580247(0x760d4197, float:7.162541E32)
            r2.a0(r3)
            i0.m2 r3 = y1.h1.f21946h
            java.lang.Object r3 = r2.j(r3)
            u2.c r3 = (u2.c) r3
            java.lang.Object r4 = r2.P()
            if (r4 != r5) goto L384
            u2.l r4 = new u2.l
            r6 = 0
            r4.<init>(r6)
            i0.j1 r4 = i0.r.u(r4)
            r2.k0(r4)
        L384:
            i0.a1 r4 = (i0.a1) r4
            boolean r6 = r2.h(r12)
            java.lang.Object r7 = r2.P()
            if (r6 != 0) goto L392
            if (r7 != r5) goto L39c
        L392:
            aa.c r7 = new aa.c
            r6 = 11
            r7.<init>(r12, r6, r4)
            r2.k0(r7)
        L39c:
            fg.a r7 = (fg.a) r7
            boolean r6 = r2.f(r3)
            java.lang.Object r8 = r2.P()
            if (r6 != 0) goto L3aa
            if (r8 != r5) goto L3b2
        L3aa:
            h0.h1 r8 = new h0.h1
            r8.<init>(r3, r4, r9)
            r2.k0(r8)
        L3b2:
            fg.l r8 = (fg.l) r8
            i.n r3 = h0.m0.f4942a
            h0.j0 r3 = new h0.j0
            r3.<init>(r7, r8)
            y0.o r1 = y0.a.a(r1, r3)
            r2.p(r10)
            return r1
        L3c3:
            f0.i r12 = (f0.i) r12
            r1 = r26
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2 = r27
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = r28
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L3e0
            goto L3e5
        L3e0:
            b5.k r4 = r12.A
            r4.n(r1)
        L3e5:
            if (r3 == 0) goto L3e8
            goto L3ed
        L3e8:
            b5.k r4 = r12.A
            r4.n(r2)
        L3ed:
            boolean r4 = r12.f2963z
            if (r4 != 0) goto L3f2
            goto L408
        L3f2:
            n2.s r4 = r12.f2961x
            long r4 = r4.f8977b
            int r6 = i2.m0.f6359c
            r6 = 32
            long r13 = r4 >> r6
            int r6 = (int) r13
            if (r1 != r6) goto L40a
            r13 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r13
            int r4 = (int) r4
            if (r2 != r4) goto L40a
        L408:
            r9 = r10
            goto L453
        L40a:
            int r4 = java.lang.Math.min(r1, r2)
            w.h0 r5 = w.h0.f14484g
            if (r4 < 0) goto L44a
            int r4 = java.lang.Math.max(r1, r2)
            n2.s r6 = r12.f2961x
            i2.g r6 = r6.f8976a
            java.lang.String r6 = r6.f6314h
            int r6 = r6.length()
            if (r4 > r6) goto L44a
            if (r3 != 0) goto L42d
            if (r1 != r2) goto L427
            goto L42d
        L427:
            h0.d1 r3 = r12.B
            r3.h(r9)
            goto L435
        L42d:
            h0.d1 r3 = r12.B
            r3.t(r10)
            r3.q(r5)
        L435:
            w.q0 r3 = r12.f2962y
            w.w r3 = r3.f14621v
            n2.s r4 = new n2.s
            n2.s r5 = r12.f2961x
            i2.g r5 = r5.f8976a
            long r1 = i2.e0.b(r1, r2)
            r4.<init>(r5, r1, r7)
            r3.invoke(r4)
            goto L453
        L44a:
            h0.d1 r1 = r12.B
            r1.t(r10)
            r1.q(r5)
            goto L408
        L453:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)
            return r1
    }
}
