package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends x1.j implements x1.m {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f7017w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final k.i f7018x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final k.g0 f7019y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public java.lang.Object f7020z;

    public n0(s1.l0 r2, k.i r3, k.g0 r4) {
            r1 = this;
            r0 = 1
            r1.f7017w = r0
            r1.<init>()
            r1.f7018x = r3
            r1.f7019y = r4
            r1.k1(r2)
            return
    }

    public n0(s1.l0 r2, k.i r3, k.g0 r4, p.x0 r5) {
            r1 = this;
            r0 = 0
            r1.f7017w = r0
            r1.<init>()
            r1.f7018x = r3
            r1.f7019y = r4
            r1.f7020z = r5
            r1.k1(r2)
            return
    }

    public static boolean n1(float r1, android.widget.EdgeEffect r2, android.graphics.Canvas r3) {
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto La
            boolean r1 = r2.draw(r3)
            return r1
        La:
            int r0 = r3.save()
            r3.rotate(r1)
            boolean r1 = r2.draw(r3)
            r3.restoreToCount(r0)
            return r1
    }

    public static boolean o1(float r3, long r4, android.widget.EdgeEffect r6, android.graphics.Canvas r7) {
            int r0 = r7.save()
            r7.rotate(r3)
            r3 = 32
            long r1 = r4 >> r3
            int r3 = (int) r1
            float r3 = java.lang.Float.intBitsToFloat(r3)
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r1
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r7.translate(r3, r4)
            boolean r3 = r6.draw(r7)
            r7.restoreToCount(r0)
            return r3
    }

    @Override // x1.m
    public final void B(x1.h0 r27) {
            r26 = this;
            r1 = r26
            r0 = r27
            int r2 = r1.f7017w
            switch(r2) {
                case 0: goto L39a;
                default: goto L9;
            }
        L9:
            h1.b r2 = r0.f20932g
            long r3 = r2.a()
            k.i r5 = r1.f7018x
            r5.l(r3)
            b5.c r3 = r2.f5038h
            f1.u r3 = r3.p()
            android.graphics.Canvas r3 = f1.c.a(r3)
            i0.j1 r4 = r5.f6989d
            r4.getValue()
            long r6 = r2.a()
            boolean r4 = e1.e.c(r6)
            if (r4 == 0) goto L32
            r0.e()
            goto L399
        L32:
            boolean r4 = r3.isHardwareAccelerated()
            k.g0 r6 = r1.f7019y
            if (r4 != 0) goto L77
            android.widget.EdgeEffect r2 = r6.f6961d
            if (r2 == 0) goto L41
            r2.finish()
        L41:
            android.widget.EdgeEffect r2 = r6.f6962e
            if (r2 == 0) goto L48
            r2.finish()
        L48:
            android.widget.EdgeEffect r2 = r6.f6963f
            if (r2 == 0) goto L4f
            r2.finish()
        L4f:
            android.widget.EdgeEffect r2 = r6.f6964g
            if (r2 == 0) goto L56
            r2.finish()
        L56:
            android.widget.EdgeEffect r2 = r6.f6965h
            if (r2 == 0) goto L5d
            r2.finish()
        L5d:
            android.widget.EdgeEffect r2 = r6.f6966i
            if (r2 == 0) goto L64
            r2.finish()
        L64:
            android.widget.EdgeEffect r2 = r6.f6967j
            if (r2 == 0) goto L6b
            r2.finish()
        L6b:
            android.widget.EdgeEffect r2 = r6.f6968k
            if (r2 == 0) goto L72
            r2.finish()
        L72:
            r0.e()
            goto L399
        L77:
            float r4 = k.y.f7111a
            float r4 = r0.x0(r4)
            android.widget.EdgeEffect r7 = r6.f6961d
            boolean r7 = k.g0.f(r7)
            if (r7 != 0) goto La0
            android.widget.EdgeEffect r7 = r6.f6965h
            boolean r7 = k.g0.g(r7)
            if (r7 != 0) goto La0
            android.widget.EdgeEffect r7 = r6.f6962e
            boolean r7 = k.g0.f(r7)
            if (r7 != 0) goto La0
            android.widget.EdgeEffect r7 = r6.f6966i
            boolean r7 = k.g0.g(r7)
            if (r7 == 0) goto L9e
            goto La0
        L9e:
            r7 = 0
            goto La1
        La0:
            r7 = 1
        La1:
            android.widget.EdgeEffect r10 = r6.f6963f
            boolean r10 = k.g0.f(r10)
            if (r10 != 0) goto Lc4
            android.widget.EdgeEffect r10 = r6.f6967j
            boolean r10 = k.g0.g(r10)
            if (r10 != 0) goto Lc4
            android.widget.EdgeEffect r10 = r6.f6964g
            boolean r10 = k.g0.f(r10)
            if (r10 != 0) goto Lc4
            android.widget.EdgeEffect r10 = r6.f6968k
            boolean r10 = k.g0.g(r10)
            if (r10 == 0) goto Lc2
            goto Lc4
        Lc2:
            r10 = 0
            goto Lc5
        Lc4:
            r10 = 1
        Lc5:
            if (r7 == 0) goto Ld9
            if (r10 == 0) goto Ld9
            android.graphics.RenderNode r11 = r1.p1()
            int r12 = r3.getWidth()
            int r13 = r3.getHeight()
            j2.b.n(r11, r12, r13)
            goto L10a
        Ld9:
            if (r7 == 0) goto Lf2
            android.graphics.RenderNode r11 = r1.p1()
            int r12 = r3.getWidth()
            int r13 = ig.a.X(r4)
            int r13 = r13 * 2
            int r13 = r13 + r12
            int r12 = r3.getHeight()
            j2.b.n(r11, r13, r12)
            goto L10a
        Lf2:
            if (r10 == 0) goto L396
            android.graphics.RenderNode r11 = r1.p1()
            int r12 = r3.getWidth()
            int r13 = r3.getHeight()
            int r14 = ig.a.X(r4)
            int r14 = r14 * 2
            int r14 = r14 + r13
            j2.b.n(r11, r12, r14)
        L10a:
            android.graphics.RenderNode r11 = r1.p1()
            android.graphics.RecordingCanvas r11 = j2.b.e(r11)
            android.widget.EdgeEffect r12 = r6.f6967j
            boolean r12 = k.g0.g(r12)
            r13 = 1119092736(0x42b40000, float:90.0)
            m.p1 r14 = m.p1.f8325h
            if (r12 == 0) goto L12e
            android.widget.EdgeEffect r12 = r6.f6967j
            if (r12 != 0) goto L128
            android.widget.EdgeEffect r12 = r6.a(r14)
            r6.f6967j = r12
        L128:
            n1(r13, r12, r11)
            r12.finish()
        L12e:
            android.widget.EdgeEffect r12 = r6.f6963f
            boolean r12 = k.g0.f(r12)
            r15 = 1132920832(0x43870000, float:270.0)
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r13 = 31
            if (r12 == 0) goto L185
            android.widget.EdgeEffect r12 = r6.c()
            boolean r19 = n1(r15, r12, r11)
            android.widget.EdgeEffect r15 = r6.f6963f
            boolean r15 = k.g0.g(r15)
            if (r15 == 0) goto L181
            long r20 = r5.f()
            r15 = r10
            long r9 = r20 & r16
            int r9 = (int) r9
            float r9 = java.lang.Float.intBitsToFloat(r9)
            android.widget.EdgeEffect r10 = r6.f6967j
            if (r10 != 0) goto L165
            android.widget.EdgeEffect r10 = r6.a(r14)
            r6.f6967j = r10
        L165:
            int r8 = android.os.Build.VERSION.SDK_INT
            if (r8 < r13) goto L171
            float r12 = k.l.b(r12)
        L16d:
            r22 = r4
            r13 = 1
            goto L173
        L171:
            r12 = 0
            goto L16d
        L173:
            float r4 = (float) r13
            float r4 = r4 - r9
            r9 = 31
            if (r8 < r9) goto L17d
            k.l.c(r10, r12, r4)
            goto L18a
        L17d:
            r10.onPull(r12, r4)
            goto L18a
        L181:
            r22 = r4
            r15 = r10
            goto L18a
        L185:
            r22 = r4
            r15 = r10
            r19 = 0
        L18a:
            android.widget.EdgeEffect r4 = r6.f6965h
            boolean r4 = k.g0.g(r4)
            r8 = 1127481344(0x43340000, float:180.0)
            m.p1 r9 = m.p1.f8324g
            if (r4 == 0) goto L1a6
            android.widget.EdgeEffect r4 = r6.f6965h
            if (r4 != 0) goto L1a0
            android.widget.EdgeEffect r4 = r6.a(r9)
            r6.f6965h = r4
        L1a0:
            n1(r8, r4, r11)
            r4.finish()
        L1a6:
            android.widget.EdgeEffect r4 = r6.f6961d
            boolean r4 = k.g0.f(r4)
            if (r4 == 0) goto L205
            android.widget.EdgeEffect r4 = r6.e()
            r12 = 0
            boolean r13 = n1(r12, r4, r11)
            if (r13 != 0) goto L1be
            if (r19 == 0) goto L1bc
            goto L1be
        L1bc:
            r13 = 0
            goto L1bf
        L1be:
            r13 = 1
        L1bf:
            android.widget.EdgeEffect r12 = r6.f6961d
            boolean r12 = k.g0.g(r12)
            if (r12 == 0) goto L1fd
            long r23 = r5.f()
            r12 = r11
            r25 = 32
            long r10 = r23 >> r25
            int r10 = (int) r10
            float r10 = java.lang.Float.intBitsToFloat(r10)
            android.widget.EdgeEffect r11 = r6.f6965h
            if (r11 != 0) goto L1df
            android.widget.EdgeEffect r11 = r6.a(r9)
            r6.f6965h = r11
        L1df:
            int r8 = android.os.Build.VERSION.SDK_INT
            r24 = r4
            r4 = 31
            if (r8 < r4) goto L1f0
            float r19 = k.l.b(r24)
            r24 = r5
            r5 = r19
            goto L1f3
        L1f0:
            r24 = r5
            r5 = 0
        L1f3:
            if (r8 < r4) goto L1f9
            k.l.c(r11, r5, r10)
            goto L202
        L1f9:
            r11.onPull(r5, r10)
            goto L202
        L1fd:
            r24 = r5
            r12 = r11
            r25 = 32
        L202:
            r19 = r13
            goto L20a
        L205:
            r24 = r5
            r12 = r11
            r25 = 32
        L20a:
            android.widget.EdgeEffect r4 = r6.f6968k
            boolean r4 = k.g0.g(r4)
            if (r4 == 0) goto L224
            android.widget.EdgeEffect r4 = r6.f6968k
            if (r4 != 0) goto L21c
            android.widget.EdgeEffect r4 = r6.a(r14)
            r6.f6968k = r4
        L21c:
            r5 = 1132920832(0x43870000, float:270.0)
            n1(r5, r4, r12)
            r4.finish()
        L224:
            android.widget.EdgeEffect r4 = r6.f6964g
            boolean r4 = k.g0.f(r4)
            if (r4 == 0) goto L272
            android.widget.EdgeEffect r4 = r6.d()
            r5 = 1119092736(0x42b40000, float:90.0)
            boolean r5 = n1(r5, r4, r12)
            if (r5 != 0) goto L23d
            if (r19 == 0) goto L23b
            goto L23d
        L23b:
            r13 = 0
            goto L23e
        L23d:
            r13 = 1
        L23e:
            android.widget.EdgeEffect r5 = r6.f6964g
            boolean r5 = k.g0.g(r5)
            if (r5 == 0) goto L270
            long r10 = r24.f()
            long r10 = r10 & r16
            int r5 = (int) r10
            float r5 = java.lang.Float.intBitsToFloat(r5)
            android.widget.EdgeEffect r8 = r6.f6968k
            if (r8 != 0) goto L25b
            android.widget.EdgeEffect r8 = r6.a(r14)
            r6.f6968k = r8
        L25b:
            int r10 = android.os.Build.VERSION.SDK_INT
            r11 = 31
            if (r10 < r11) goto L266
            float r4 = k.l.b(r4)
            goto L267
        L266:
            r4 = 0
        L267:
            if (r10 < r11) goto L26d
            k.l.c(r8, r4, r5)
            goto L270
        L26d:
            r8.onPull(r4, r5)
        L270:
            r19 = r13
        L272:
            android.widget.EdgeEffect r4 = r6.f6966i
            boolean r4 = k.g0.g(r4)
            if (r4 == 0) goto L28c
            android.widget.EdgeEffect r4 = r6.f6966i
            if (r4 != 0) goto L284
            android.widget.EdgeEffect r4 = r6.a(r9)
            r6.f6966i = r4
        L284:
            r5 = 0
            n1(r5, r4, r12)
            r4.finish()
            goto L28d
        L28c:
            r5 = 0
        L28d:
            android.widget.EdgeEffect r4 = r6.f6962e
            boolean r4 = k.g0.f(r4)
            if (r4 == 0) goto L2e1
            android.widget.EdgeEffect r4 = r6.b()
            r8 = 1127481344(0x43340000, float:180.0)
            boolean r8 = n1(r8, r4, r12)
            if (r8 != 0) goto L2a7
            if (r19 == 0) goto L2a4
            goto L2a7
        L2a4:
            r18 = 0
            goto L2a9
        L2a7:
            r18 = 1
        L2a9:
            android.widget.EdgeEffect r8 = r6.f6962e
            boolean r8 = k.g0.g(r8)
            if (r8 == 0) goto L2df
            long r10 = r24.f()
            long r10 = r10 >> r25
            int r8 = (int) r10
            float r8 = java.lang.Float.intBitsToFloat(r8)
            android.widget.EdgeEffect r10 = r6.f6966i
            if (r10 != 0) goto L2c6
            android.widget.EdgeEffect r10 = r6.a(r9)
            r6.f6966i = r10
        L2c6:
            int r6 = android.os.Build.VERSION.SDK_INT
            r9 = 31
            if (r6 < r9) goto L2d2
            float r4 = k.l.b(r4)
        L2d0:
            r13 = 1
            goto L2d4
        L2d2:
            r4 = r5
            goto L2d0
        L2d4:
            float r11 = (float) r13
            float r11 = r11 - r8
            if (r6 < r9) goto L2dc
            k.l.c(r10, r4, r11)
            goto L2df
        L2dc:
            r10.onPull(r4, r11)
        L2df:
            r19 = r18
        L2e1:
            if (r19 == 0) goto L2e6
            r24.g()
        L2e6:
            if (r15 == 0) goto L2ea
            r4 = r5
            goto L2ec
        L2ea:
            r4 = r22
        L2ec:
            if (r7 == 0) goto L2ef
            goto L2f1
        L2ef:
            r5 = r22
        L2f1:
            u2.m r6 = r0.getLayoutDirection()
            f1.b r7 = new f1.b
            r7.<init>()
            r7.f3025a = r12
            long r8 = r2.a()
            b5.c r10 = r2.f5038h
            u2.c r10 = r10.s()
            b5.c r11 = r2.f5038h
            u2.m r11 = r11.u()
            b5.c r12 = r2.f5038h
            f1.u r12 = r12.p()
            b5.c r13 = r2.f5038h
            long r13 = r13.v()
            b5.c r15 = r2.f5038h
            java.lang.Object r1 = r15.f470b
            i1.b r1 = (i1.b) r1
            r15.R(r0)
            r15.S(r6)
            r15.P(r7)
            r15.U(r8)
            r6 = 0
            r15.f470b = r6
            r7.e()
            b5.c r6 = r2.f5038h     // Catch: java.lang.Throwable -> L373
            java.lang.Object r6 = r6.f469a     // Catch: java.lang.Throwable -> L373
            androidx.lifecycle.x r6 = (androidx.lifecycle.x) r6     // Catch: java.lang.Throwable -> L373
            r6.c0(r4, r5)     // Catch: java.lang.Throwable -> L373
            r0.e()     // Catch: java.lang.Throwable -> L375
            b5.c r0 = r2.f5038h     // Catch: java.lang.Throwable -> L373
            java.lang.Object r0 = r0.f469a     // Catch: java.lang.Throwable -> L373
            androidx.lifecycle.x r0 = (androidx.lifecycle.x) r0     // Catch: java.lang.Throwable -> L373
            float r4 = -r4
            float r5 = -r5
            r0.c0(r4, r5)     // Catch: java.lang.Throwable -> L373
            r7.p()
            b5.c r0 = r2.f5038h
            r0.R(r10)
            r0.S(r11)
            r0.P(r12)
            r0.U(r13)
            r0.f470b = r1
            android.graphics.RenderNode r0 = r26.p1()
            j2.b.m(r0)
            int r0 = r3.save()
            r3.translate(r4, r5)
            android.graphics.RenderNode r1 = r26.p1()
            j2.b.k(r3, r1)
            r3.restoreToCount(r0)
            goto L399
        L373:
            r0 = move-exception
            goto L382
        L375:
            r0 = move-exception
            b5.c r3 = r2.f5038h     // Catch: java.lang.Throwable -> L373
            java.lang.Object r3 = r3.f469a     // Catch: java.lang.Throwable -> L373
            androidx.lifecycle.x r3 = (androidx.lifecycle.x) r3     // Catch: java.lang.Throwable -> L373
            float r4 = -r4
            float r5 = -r5
            r3.c0(r4, r5)     // Catch: java.lang.Throwable -> L373
            throw r0     // Catch: java.lang.Throwable -> L373
        L382:
            r7.p()
            b5.c r2 = r2.f5038h
            r2.R(r10)
            r2.S(r11)
            r2.P(r12)
            r2.U(r13)
            r2.f470b = r1
            throw r0
        L396:
            r0.e()
        L399:
            return
        L39a:
            java.lang.Object r2 = r1.f7020z
            p.x0 r2 = (p.x0) r2
            h1.b r3 = r0.f20932g
            long r4 = r3.a()
            k.i r6 = r1.f7018x
            r6.l(r4)
            long r4 = r3.a()
            boolean r4 = e1.e.c(r4)
            if (r4 == 0) goto L3b8
            r0.e()
            goto L4d9
        L3b8:
            r0.e()
            i0.j1 r4 = r6.f6989d
            r4.getValue()
            b5.c r4 = r3.f5038h
            f1.u r4 = r4.p()
            android.graphics.Canvas r4 = f1.c.a(r4)
            k.g0 r5 = r1.f7019y
            android.widget.EdgeEffect r7 = r5.f6963f
            boolean r7 = k.g0.f(r7)
            r8 = 32
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r11 = 0
            if (r7 == 0) goto L40b
            android.widget.EdgeEffect r7 = r5.c()
            long r12 = r3.a()
            long r12 = r12 & r9
            int r12 = (int) r12
            float r12 = java.lang.Float.intBitsToFloat(r12)
            float r12 = -r12
            u2.m r13 = r0.getLayoutDirection()
            float r13 = r2.d(r13)
            float r13 = r0.x0(r13)
            int r12 = java.lang.Float.floatToRawIntBits(r12)
            long r14 = (long) r12
            int r12 = java.lang.Float.floatToRawIntBits(r13)
            long r12 = (long) r12
            long r14 = r14 << r8
            long r12 = r12 & r9
            long r12 = r12 | r14
            r14 = 1132920832(0x43870000, float:270.0)
            boolean r7 = o1(r14, r12, r7, r4)
            goto L40c
        L40b:
            r7 = r11
        L40c:
            android.widget.EdgeEffect r12 = r5.f6961d
            boolean r12 = k.g0.f(r12)
            r13 = 0
            if (r12 == 0) goto L441
            android.widget.EdgeEffect r12 = r5.e()
            float r15 = r2.c()
            float r15 = r0.x0(r15)
            r16 = r8
            int r8 = java.lang.Float.floatToRawIntBits(r13)
            r17 = r9
            long r9 = (long) r8
            int r8 = java.lang.Float.floatToRawIntBits(r15)
            long r14 = (long) r8
            long r8 = r9 << r16
            long r14 = r14 & r17
            long r8 = r8 | r14
            boolean r8 = o1(r13, r8, r12, r4)
            if (r8 != 0) goto L43f
            if (r7 == 0) goto L43d
            goto L43f
        L43d:
            r7 = r11
            goto L445
        L43f:
            r7 = 1
            goto L445
        L441:
            r16 = r8
            r17 = r9
        L445:
            android.widget.EdgeEffect r8 = r5.f6964g
            boolean r8 = k.g0.f(r8)
            if (r8 == 0) goto L48c
            android.widget.EdgeEffect r8 = r5.d()
            long r9 = r3.a()
            long r9 = r9 >> r16
            int r9 = (int) r9
            float r9 = java.lang.Float.intBitsToFloat(r9)
            int r9 = ig.a.X(r9)
            u2.m r10 = r0.getLayoutDirection()
            float r10 = r2.b(r10)
            float r9 = (float) r9
            float r9 = -r9
            float r10 = r0.x0(r10)
            float r10 = r10 + r9
            int r9 = java.lang.Float.floatToRawIntBits(r13)
            long r12 = (long) r9
            int r9 = java.lang.Float.floatToRawIntBits(r10)
            long r9 = (long) r9
            long r12 = r12 << r16
            long r9 = r9 & r17
            long r9 = r9 | r12
            r12 = 1119092736(0x42b40000, float:90.0)
            boolean r8 = o1(r12, r9, r8, r4)
            if (r8 != 0) goto L48b
            if (r7 == 0) goto L489
            goto L48b
        L489:
            r7 = r11
            goto L48c
        L48b:
            r7 = 1
        L48c:
            android.widget.EdgeEffect r8 = r5.f6962e
            boolean r8 = k.g0.f(r8)
            if (r8 == 0) goto L4d4
            android.widget.EdgeEffect r5 = r5.b()
            float r2 = r2.a()
            float r0 = r0.x0(r2)
            long r8 = r3.a()
            long r8 = r8 >> r16
            int r2 = (int) r8
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r2 = -r2
            long r8 = r3.a()
            long r8 = r8 & r17
            int r3 = (int) r8
            float r3 = java.lang.Float.intBitsToFloat(r3)
            float r3 = -r3
            float r3 = r3 + r0
            int r0 = java.lang.Float.floatToRawIntBits(r2)
            long r8 = (long) r0
            int r0 = java.lang.Float.floatToRawIntBits(r3)
            long r2 = (long) r0
            long r8 = r8 << r16
            long r2 = r2 & r17
            long r2 = r2 | r8
            r0 = 1127481344(0x43340000, float:180.0)
            boolean r0 = o1(r0, r2, r5, r4)
            if (r0 != 0) goto L4d2
            if (r7 == 0) goto L4d3
        L4d2:
            r11 = 1
        L4d3:
            r7 = r11
        L4d4:
            if (r7 == 0) goto L4d9
            r6.g()
        L4d9:
            return
    }

    public android.graphics.RenderNode p1() {
            r1 = this;
            java.lang.Object r0 = r1.f7020z
            android.graphics.RenderNode r0 = (android.graphics.RenderNode) r0
            if (r0 != 0) goto Lc
            android.graphics.RenderNode r0 = j2.b.f()
            r1.f7020z = r0
        Lc:
            return r0
    }
}
