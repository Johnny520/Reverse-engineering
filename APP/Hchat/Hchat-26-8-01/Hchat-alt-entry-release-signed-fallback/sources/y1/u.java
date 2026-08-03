package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends androidx.lifecycle.x {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ y1.z f22125i;

    public u(y1.z r1) {
            r0 = this;
            r0.f22125i = r1
            r1 = 17
            r0.<init>(r1)
            return
    }

    @Override // androidx.lifecycle.x
    public final boolean H(int r25, int r26, android.os.Bundle r27) {
            r24 = this;
            r0 = r25
            r1 = r26
            r2 = r24
            r3 = r27
            y1.z r4 = r2.f22125i
            android.view.accessibility.AccessibilityManager r5 = r4.f22169m
            r6 = 0
            java.lang.Float r7 = java.lang.Float.valueOf(r6)
            y1.t r8 = r4.f22166j
            f.k r9 = r4.l()
            java.lang.Object r9 = r9.b(r0)
            f2.r r9 = (f2.r) r9
            if (r9 == 0) goto L23
            f2.q r12 = r9.f3216a
            if (r12 != 0) goto L27
        L23:
            r18 = 0
            goto L8c2
        L27:
            x1.f0 r9 = r12.f3212c
            int r11 = r12.f3215f
            f2.m r13 = r12.f3213d
            f.k0 r14 = r13.f3204g
            f2.x r15 = f2.u.f3236n
            java.lang.Object r15 = r14.g(r15)
            r16 = r6
            if (r15 != 0) goto L3a
            r15 = 0
        L3a:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r15 = gg.l.a(r15, r6)
            if (r15 == 0) goto L51
            int r15 = android.os.Build.VERSION.SDK_INT
            r10 = 34
            if (r15 < r10) goto L4d
            boolean r10 = h3.b.e(r5)
            goto L4e
        L4d:
            r10 = 1
        L4e:
            if (r10 != 0) goto L51
            goto L23
        L51:
            r10 = 64
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r10) goto L88c
            r5 = 128(0x80, float:1.8E-43)
            if (r1 == r5) goto L871
            r10 = 512(0x200, float:7.17E-43)
            r5 = 256(0x100, float:3.59E-43)
            r15 = -1
            if (r1 == r5) goto L706
            if (r1 == r10) goto L706
            r5 = 16384(0x4000, float:2.2959E-41)
            if (r1 == r5) goto L6e6
            r5 = 131072(0x20000, float:1.83671E-40)
            if (r1 == r5) goto L6c2
            boolean r5 = y1.g0.b(r12)
            if (r5 != 0) goto L73
            goto L23
        L73:
            r5 = 1
            if (r1 == r5) goto L699
            r5 = 2
            if (r1 == r5) goto L67c
            u2.m r5 = u2.m.f13355h
            switch(r1) {
                case 16: goto L64f;
                case 32: goto L62f;
                case 4096: goto L13d;
                case 8192: goto L13d;
                case 32768: goto L40e;
                case 65536: goto L3ee;
                case 262144: goto L3ce;
                case 524288: goto L3ae;
                case 1048576: goto L38e;
                case 2097152: goto L35b;
                case 16908342: goto L19a;
                case 16908349: goto L166;
                case 16908372: goto L146;
                default: goto L7e;
            }
        L7e:
            switch(r1) {
                case 16908344: goto L13d;
                case 16908345: goto L13d;
                case 16908346: goto L13d;
                case 16908347: goto L13d;
                default: goto L81;
            }
        L81:
            switch(r1) {
                case 16908358: goto L11d;
                case 16908359: goto Lfd;
                case 16908360: goto Ldd;
                case 16908361: goto Lbd;
                default: goto L84;
            }
        L84:
            f.t0 r3 = r4.f22180x
            java.lang.Object r0 = r3.b(r0)
            f.t0 r0 = (f.t0) r0
            if (r0 == 0) goto L23
            java.lang.Object r0 = r0.b(r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 != 0) goto L97
            goto L23
        L97:
            f2.x r0 = f2.l.f3201x
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto La1
            r6 = 0
            goto La2
        La1:
            r6 = r0
        La2:
            java.util.List r6 = (java.util.List) r6
            if (r6 != 0) goto La8
            goto L23
        La8:
            int r0 = r6.size()
            if (r0 > 0) goto Lb0
            goto L23
        Lb0:
            r0 = 0
            java.lang.Object r0 = r6.get(r0)
            r0.getClass()
            ah.a.d()
            r0 = 0
            return r0
        Lbd:
            f2.x r0 = f2.l.B
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto Lc7
            r6 = 0
            goto Lc8
        Lc7:
            r6 = r0
        Lc8:
            f2.a r6 = (f2.a) r6
            if (r6 == 0) goto L23
            sf.b r0 = r6.f3138b
            fg.a r0 = (fg.a) r0
            if (r0 == 0) goto L23
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        Ldd:
            f2.x r0 = f2.l.f3203z
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto Le7
            r6 = 0
            goto Le8
        Le7:
            r6 = r0
        Le8:
            f2.a r6 = (f2.a) r6
            if (r6 == 0) goto L23
            sf.b r0 = r6.f3138b
            fg.a r0 = (fg.a) r0
            if (r0 == 0) goto L23
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        Lfd:
            f2.x r0 = f2.l.A
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L107
            r6 = 0
            goto L108
        L107:
            r6 = r0
        L108:
            f2.a r6 = (f2.a) r6
            if (r6 == 0) goto L23
            sf.b r0 = r6.f3138b
            fg.a r0 = (fg.a) r0
            if (r0 == 0) goto L23
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L11d:
            f2.x r0 = f2.l.f3202y
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L127
            r6 = 0
            goto L128
        L127:
            r6 = r0
        L128:
            f2.a r6 = (f2.a) r6
            if (r6 == 0) goto L23
            sf.b r0 = r6.f3138b
            fg.a r0 = (fg.a) r0
            if (r0 == 0) goto L23
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L13d:
            r20 = 32
            r22 = 4294967295(0xffffffff, double:2.1219957905E-314)
            goto L42e
        L146:
            f2.x r0 = f2.l.f3193p
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L150
            r6 = 0
            goto L151
        L150:
            r6 = r0
        L151:
            f2.a r6 = (f2.a) r6
            if (r6 == 0) goto L23
            sf.b r0 = r6.f3138b
            fg.a r0 = (fg.a) r0
            if (r0 == 0) goto L23
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L166:
            if (r3 == 0) goto L23
            java.lang.String r0 = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"
            boolean r1 = r3.containsKey(r0)
            if (r1 != 0) goto L172
            goto L23
        L172:
            f2.x r1 = f2.l.f3186i
            java.lang.Object r1 = r14.g(r1)
            if (r1 != 0) goto L17c
            r6 = 0
            goto L17d
        L17c:
            r6 = r1
        L17d:
            f2.a r6 = (f2.a) r6
            if (r6 == 0) goto L23
            sf.b r1 = r6.f3138b
            fg.l r1 = (fg.l) r1
            if (r1 == 0) goto L23
            float r0 = r3.getFloat(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r1.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L19a:
            f2.q r0 = r12.l()
            if (r0 == 0) goto L1b0
            f2.m r1 = r0.f3213d
            f2.x r3 = f2.l.f3181d
            f.k0 r1 = r1.f3204g
            java.lang.Object r1 = r1.g(r3)
            if (r1 != 0) goto L1ad
            r1 = 0
        L1ad:
            f2.a r1 = (f2.a) r1
            goto L1b1
        L1b0:
            r1 = 0
        L1b1:
            if (r1 != 0) goto L1cb
            if (r0 == 0) goto L1cb
            f2.q r0 = r0.l()
            if (r0 == 0) goto L1b0
            f2.m r1 = r0.f3213d
            f2.x r3 = f2.l.f3181d
            f.k0 r1 = r1.f3204g
            java.lang.Object r1 = r1.g(r3)
            if (r1 != 0) goto L1c8
            r1 = 0
        L1c8:
            f2.a r1 = (f2.a) r1
            goto L1b1
        L1cb:
            if (r0 != 0) goto L205
            e1.c r0 = r12.g()
            android.graphics.Rect r1 = new android.graphics.Rect
            float r3 = r0.f2296a
            double r3 = (double) r3
            double r3 = java.lang.Math.floor(r3)
            float r3 = (float) r3
            int r3 = (int) r3
            float r4 = r0.f2297b
            double r4 = (double) r4
            double r4 = java.lang.Math.floor(r4)
            float r4 = (float) r4
            int r4 = (int) r4
            float r5 = r0.f2298c
            double r5 = (double) r5
            double r5 = java.lang.Math.ceil(r5)
            float r5 = (float) r5
            int r5 = ig.a.X(r5)
            float r0 = r0.f2299d
            double r6 = (double) r0
            double r6 = java.lang.Math.ceil(r6)
            float r0 = (float) r6
            int r0 = ig.a.X(r0)
            r1.<init>(r3, r4, r5, r0)
            boolean r0 = r8.requestRectangleOnScreen(r1)
            return r0
        L205:
            r3 = 0
            r7 = r3
            r1 = 0
        L209:
            if (r0 == 0) goto L35a
            x1.f0 r13 = r0.f3212c
            f2.m r14 = r0.f3213d
            f.k0 r14 = r14.f3204g
            f2.x r15 = f2.l.f3181d
            java.lang.Object r15 = r14.g(r15)
            if (r15 != 0) goto L21a
            r15 = 0
        L21a:
            f2.a r15 = (f2.a) r15
            r20 = 32
            if (r15 == 0) goto L34d
            x1.b1 r6 = r13.L
            x1.r r6 = r6.f20841c
            e1.c r6 = v1.w.e(r6)
            x1.b1 r13 = r13.L
            x1.r r13 = r13.f20841c
            v1.t r13 = r13.b0()
            if (r13 == 0) goto L240
            x1.i1 r13 = (x1.i1) r13
            long r21 = r13.m0(r3)
            r10 = r21
        L23a:
            r22 = 4294967295(0xffffffff, double:2.1219957905E-314)
            goto L242
        L240:
            r10 = r3
            goto L23a
        L242:
            e1.c r6 = r6.i(r10)
            x1.i1 r10 = r12.d()
            if (r10 == 0) goto L25d
            y0.n r11 = r10.r1()
            boolean r11 = r11.f21832t
            if (r11 == 0) goto L255
            goto L256
        L255:
            r10 = 0
        L256:
            if (r10 == 0) goto L25d
            long r10 = r10.m0(r3)
            goto L25e
        L25d:
            r10 = r3
        L25e:
            long r10 = e1.b.e(r10, r7)
            x1.i1 r13 = r12.d()
            if (r13 == 0) goto L26b
            long r3 = r13.f13902i
            goto L26d
        L26b:
            r3 = 0
        L26d:
            long r3 = r9.e0.q0(r3)
            e1.c r3 = ac.p.a(r10, r3)
            float r4 = r3.f2296a
            float r10 = r6.f2296a
            float r4 = r4 - r10
            float r10 = r3.f2298c
            float r11 = r6.f2298c
            float r10 = r10 - r11
            float r11 = java.lang.Math.signum(r4)
            float r13 = java.lang.Math.signum(r10)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 != 0) goto L29a
            float r11 = java.lang.Math.abs(r4)
            float r13 = java.lang.Math.abs(r10)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L298
            goto L29c
        L298:
            r4 = r10
            goto L29c
        L29a:
            r4 = r16
        L29c:
            float r10 = r3.f2297b
            float r11 = r6.f2297b
            float r10 = r10 - r11
            float r3 = r3.f2299d
            float r6 = r6.f2299d
            float r3 = r3 - r6
            float r6 = java.lang.Math.signum(r10)
            float r11 = java.lang.Math.signum(r3)
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 != 0) goto L2c1
            float r6 = java.lang.Math.abs(r10)
            float r11 = java.lang.Math.abs(r3)
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 >= 0) goto L2bf
            goto L2c3
        L2bf:
            r10 = r3
            goto L2c3
        L2c1:
            r10 = r16
        L2c3:
            int r3 = java.lang.Float.floatToRawIntBits(r4)
            long r3 = (long) r3
            int r6 = java.lang.Float.floatToRawIntBits(r10)
            long r10 = (long) r6
            long r3 = r3 << r20
            long r10 = r10 & r22
            long r3 = r3 | r10
            r10 = 0
            boolean r6 = e1.b.b(r3, r10)
            if (r6 == 0) goto L2dc
            r10 = r3
            goto L319
        L2dc:
            long r10 = r3 >> r20
            int r6 = (int) r10
            float r6 = java.lang.Float.intBitsToFloat(r6)
            long r10 = r3 & r22
            int r10 = (int) r10
            float r10 = java.lang.Float.intBitsToFloat(r10)
            f2.x r11 = f2.u.f3243u
            java.lang.Object r11 = r14.g(r11)
            if (r11 != 0) goto L2f3
            r11 = 0
        L2f3:
            f2.j r11 = (f2.j) r11
            u2.m r11 = r9.F
            if (r11 != r5) goto L2fb
            r11 = 1
            goto L2fc
        L2fb:
            r11 = 0
        L2fc:
            if (r11 == 0) goto L2ff
            float r6 = -r6
        L2ff:
            f2.x r11 = f2.u.f3244v
            java.lang.Object r11 = r14.g(r11)
            if (r11 != 0) goto L308
            r11 = 0
        L308:
            f2.j r11 = (f2.j) r11
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r13 = (long) r6
            int r6 = java.lang.Float.floatToRawIntBits(r10)
            long r10 = (long) r6
            long r13 = r13 << r20
            long r10 = r10 & r22
            long r10 = r10 | r13
        L319:
            sf.b r6 = r15.f3138b
            fg.p r6 = (fg.p) r6
            if (r6 == 0) goto L343
            long r13 = r10 >> r20
            int r13 = (int) r13
            float r13 = java.lang.Float.intBitsToFloat(r13)
            java.lang.Float r13 = java.lang.Float.valueOf(r13)
            long r10 = r10 & r22
            int r10 = (int) r10
            float r10 = java.lang.Float.intBitsToFloat(r10)
            java.lang.Float r10 = java.lang.Float.valueOf(r10)
            java.lang.Object r6 = r6.invoke(r13, r10)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r10 = 1
            if (r6 != r10) goto L343
            goto L345
        L343:
            if (r1 == 0) goto L347
        L345:
            r1 = 1
            goto L348
        L347:
            r1 = 0
        L348:
            long r7 = e1.b.d(r7, r3)
            goto L352
        L34d:
            r22 = 4294967295(0xffffffff, double:2.1219957905E-314)
        L352:
            f2.q r0 = r0.l()
            r3 = 0
            goto L209
        L35a:
            return r1
        L35b:
            if (r3 == 0) goto L364
            java.lang.String r0 = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"
            java.lang.String r0 = r3.getString(r0)
            goto L365
        L364:
            r0 = 0
        L365:
            f2.x r1 = f2.l.f3188k
            java.lang.Object r1 = r14.g(r1)
            if (r1 != 0) goto L36f
            r6 = 0
            goto L370
        L36f:
            r6 = r1
        L370:
            f2.a r6 = (f2.a) r6
            if (r6 == 0) goto L23
            sf.b r1 = r6.f3138b
            fg.l r1 = (fg.l) r1
            if (r1 == 0) goto L23
            i2.g r3 = new i2.g
            if (r0 != 0) goto L380
            java.lang.String r0 = ""
        L380:
            r3.<init>(r0)
            java.lang.Object r0 = r1.invoke(r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L38e:
            f2.x r0 = f2.l.f3199v
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L398
            r6 = 0
            goto L399
        L398:
            r6 = r0
        L399:
            f2.a r6 = (f2.a) r6
            if (r6 == 0) goto L23
            sf.b r0 = r6.f3138b
            fg.a r0 = (fg.a) r0
            if (r0 == 0) goto L23
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L3ae:
            f2.x r0 = f2.l.f3198u
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L3b8
            r6 = 0
            goto L3b9
        L3b8:
            r6 = r0
        L3b9:
            f2.a r6 = (f2.a) r6
            if (r6 == 0) goto L23
            sf.b r0 = r6.f3138b
            fg.a r0 = (fg.a) r0
            if (r0 == 0) goto L23
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L3ce:
            f2.x r0 = f2.l.f3197t
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L3d8
            r6 = 0
            goto L3d9
        L3d8:
            r6 = r0
        L3d9:
            f2.a r6 = (f2.a) r6
            if (r6 == 0) goto L23
            sf.b r0 = r6.f3138b
            fg.a r0 = (fg.a) r0
            if (r0 == 0) goto L23
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L3ee:
            f2.x r0 = f2.l.f3195r
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L3f8
            r6 = 0
            goto L3f9
        L3f8:
            r6 = r0
        L3f9:
            f2.a r6 = (f2.a) r6
            if (r6 == 0) goto L23
            sf.b r0 = r6.f3138b
            fg.a r0 = (fg.a) r0
            if (r0 == 0) goto L23
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L40e:
            f2.x r0 = f2.l.f3196s
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L418
            r6 = 0
            goto L419
        L418:
            r6 = r0
        L419:
            f2.a r6 = (f2.a) r6
            if (r6 == 0) goto L23
            sf.b r0 = r6.f3138b
            fg.a r0 = (fg.a) r0
            if (r0 == 0) goto L23
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L42e:
            r0 = 4096(0x1000, float:5.74E-42)
            if (r1 != r0) goto L434
            r0 = 1
            goto L435
        L434:
            r0 = 0
        L435:
            r3 = 8192(0x2000, float:1.148E-41)
            if (r1 != r3) goto L43b
            r3 = 1
            goto L43c
        L43b:
            r3 = 0
        L43c:
            r4 = 16908345(0x1020039, float:2.387739E-38)
            if (r1 != r4) goto L443
            r4 = 1
            goto L444
        L443:
            r4 = 0
        L444:
            r6 = 16908347(0x102003b, float:2.3877394E-38)
            if (r1 != r6) goto L44b
            r6 = 1
            goto L44c
        L44b:
            r6 = 0
        L44c:
            r8 = 16908344(0x1020038, float:2.3877386E-38)
            if (r1 != r8) goto L453
            r8 = 1
            goto L454
        L453:
            r8 = 0
        L454:
            r10 = 16908346(0x102003a, float:2.3877392E-38)
            if (r1 != r10) goto L45b
            r1 = 1
            goto L45c
        L45b:
            r1 = 0
        L45c:
            if (r4 != 0) goto L467
            if (r6 != 0) goto L467
            if (r0 != 0) goto L467
            if (r3 == 0) goto L465
            goto L467
        L465:
            r10 = 0
            goto L468
        L467:
            r10 = 1
        L468:
            if (r8 != 0) goto L473
            if (r1 != 0) goto L473
            if (r0 != 0) goto L473
            if (r3 == 0) goto L471
            goto L473
        L471:
            r1 = 0
            goto L474
        L473:
            r1 = 1
        L474:
            if (r0 != 0) goto L478
            if (r3 == 0) goto L4d1
        L478:
            f2.x r0 = f2.u.f3225c
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L481
            r0 = 0
        L481:
            f2.h r0 = (f2.h) r0
            f2.x r11 = f2.l.f3186i
            java.lang.Object r11 = r14.g(r11)
            if (r11 != 0) goto L48c
            r11 = 0
        L48c:
            f2.a r11 = (f2.a) r11
            if (r0 == 0) goto L4d1
            lg.a r12 = r0.f3153b
            if (r11 == 0) goto L4d1
            float r1 = r12.f8041b
            float r4 = r12.f8040a
            int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r5 >= 0) goto L49e
            r5 = r4
            goto L49f
        L49e:
            r5 = r1
        L49f:
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 <= 0) goto L4a4
            goto L4a5
        L4a4:
            r1 = r4
        L4a5:
            int r4 = r0.f3154c
            if (r4 <= 0) goto L4b1
            float r5 = r5 - r1
            r19 = 1
            int r4 = r4 + 1
            float r1 = (float) r4
        L4af:
            float r5 = r5 / r1
            goto L4b6
        L4b1:
            float r5 = r5 - r1
            r1 = 20
            float r1 = (float) r1
            goto L4af
        L4b6:
            if (r3 == 0) goto L4b9
            float r5 = -r5
        L4b9:
            sf.b r1 = r11.f3138b
            fg.l r1 = (fg.l) r1
            if (r1 == 0) goto L23
            float r0 = r0.f3152a
            float r0 = r0 + r5
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r1.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L4d1:
            x1.b1 r0 = r9.L
            x1.r r0 = r0.f20841c
            e1.c r0 = v1.w.e(r0)
            long r11 = r0.c()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            f2.x r13 = f2.l.C
            java.lang.Object r13 = r14.g(r13)
            if (r13 != 0) goto L4eb
            r13 = 0
        L4eb:
            f2.a r13 = (f2.a) r13
            if (r13 == 0) goto L509
            sf.b r13 = r13.f3138b
            fg.l r13 = (fg.l) r13
            if (r13 == 0) goto L509
            java.lang.Object r13 = r13.invoke(r0)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L509
            r13 = 0
            java.lang.Object r0 = r0.get(r13)
            java.lang.Float r0 = (java.lang.Float) r0
            goto L50a
        L509:
            r0 = 0
        L50a:
            f2.x r13 = f2.l.f3181d
            java.lang.Object r13 = r14.g(r13)
            if (r13 != 0) goto L513
            r13 = 0
        L513:
            f2.a r13 = (f2.a) r13
            if (r13 != 0) goto L519
            goto L23
        L519:
            sf.b r13 = r13.f3138b
            f2.x r15 = f2.u.f3243u
            java.lang.Object r15 = r14.g(r15)
            if (r15 != 0) goto L524
            r15 = 0
        L524:
            f2.j r15 = (f2.j) r15
            if (r15 == 0) goto L5af
            if (r10 == 0) goto L5af
            if (r0 == 0) goto L535
            float r10 = r0.floatValue()
            r26 = r0
            r25 = r1
            goto L540
        L535:
            r26 = r0
            r25 = r1
            long r0 = r11 >> r20
            int r0 = (int) r0
            float r10 = java.lang.Float.intBitsToFloat(r0)
        L540:
            if (r4 != 0) goto L544
            if (r3 == 0) goto L545
        L544:
            float r10 = -r10
        L545:
            u2.m r0 = r9.F
            if (r0 != r5) goto L54c
            r19 = 1
            goto L54e
        L54c:
            r19 = 0
        L54e:
            if (r19 == 0) goto L555
            if (r4 != 0) goto L554
            if (r6 == 0) goto L555
        L554:
            float r10 = -r10
        L555:
            boolean r0 = y1.z.q(r15, r10)
            if (r0 == 0) goto L5b3
            f2.x r0 = f2.l.f3203z
            boolean r1 = r14.c(r0)
            if (r1 != 0) goto L57f
            f2.x r1 = f2.l.B
            boolean r1 = r14.c(r1)
            if (r1 == 0) goto L56c
            goto L57f
        L56c:
            fg.p r13 = (fg.p) r13
            if (r13 == 0) goto L23
            java.lang.Float r0 = java.lang.Float.valueOf(r10)
            java.lang.Object r0 = r13.invoke(r0, r7)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L57f:
            int r1 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r1 <= 0) goto L591
            f2.x r0 = f2.l.B
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L58d
            r6 = 0
            goto L58e
        L58d:
            r6 = r0
        L58e:
            f2.a r6 = (f2.a) r6
            goto L59c
        L591:
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L599
            r6 = 0
            goto L59a
        L599:
            r6 = r0
        L59a:
            f2.a r6 = (f2.a) r6
        L59c:
            if (r6 == 0) goto L23
            sf.b r0 = r6.f3138b
            fg.a r0 = (fg.a) r0
            if (r0 == 0) goto L23
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L5af:
            r26 = r0
            r25 = r1
        L5b3:
            f2.x r0 = f2.u.f3244v
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L5bc
            r0 = 0
        L5bc:
            f2.j r0 = (f2.j) r0
            if (r0 == 0) goto L23
            if (r25 == 0) goto L23
            if (r26 == 0) goto L5c9
            float r1 = r26.floatValue()
            goto L5d0
        L5c9:
            long r4 = r11 & r22
            int r1 = (int) r4
            float r1 = java.lang.Float.intBitsToFloat(r1)
        L5d0:
            if (r8 != 0) goto L5d4
            if (r3 == 0) goto L5d5
        L5d4:
            float r1 = -r1
        L5d5:
            boolean r0 = y1.z.q(r0, r1)
            if (r0 == 0) goto L23
            f2.x r0 = f2.l.f3202y
            boolean r3 = r14.c(r0)
            if (r3 != 0) goto L5ff
            f2.x r3 = f2.l.A
            boolean r3 = r14.c(r3)
            if (r3 == 0) goto L5ec
            goto L5ff
        L5ec:
            fg.p r13 = (fg.p) r13
            if (r13 == 0) goto L23
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            java.lang.Object r0 = r13.invoke(r7, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L5ff:
            int r1 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r1 <= 0) goto L611
            f2.x r0 = f2.l.A
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L60d
            r6 = 0
            goto L60e
        L60d:
            r6 = r0
        L60e:
            f2.a r6 = (f2.a) r6
            goto L61c
        L611:
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L619
            r6 = 0
            goto L61a
        L619:
            r6 = r0
        L61a:
            f2.a r6 = (f2.a) r6
        L61c:
            if (r6 == 0) goto L23
            sf.b r0 = r6.f3138b
            fg.a r0 = (fg.a) r0
            if (r0 == 0) goto L23
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L62f:
            f2.x r0 = f2.l.f3180c
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L639
            r6 = 0
            goto L63a
        L639:
            r6 = r0
        L63a:
            f2.a r6 = (f2.a) r6
            if (r6 == 0) goto L23
            sf.b r0 = r6.f3138b
            fg.a r0 = (fg.a) r0
            if (r0 == 0) goto L23
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L64f:
            f2.x r1 = f2.l.f3179b
            java.lang.Object r1 = r14.g(r1)
            if (r1 != 0) goto L658
            r1 = 0
        L658:
            f2.a r1 = (f2.a) r1
            if (r1 == 0) goto L66f
            sf.b r1 = r1.f3138b
            fg.a r1 = (fg.a) r1
            if (r1 == 0) goto L66f
            java.lang.Object r1 = r1.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r17 = r1
        L66a:
            r1 = 12
            r3 = 0
            r5 = 1
            goto L672
        L66f:
            r17 = 0
            goto L66a
        L672:
            y1.z.x(r4, r0, r5, r3, r1)
            if (r17 == 0) goto L23
            boolean r0 = r17.booleanValue()
            return r0
        L67c:
            f2.x r0 = f2.u.f3234l
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L685
            r0 = 0
        L685:
            boolean r0 = gg.l.a(r0, r6)
            if (r0 == 0) goto L23
            d1.l r0 = r8.getFocusOwner()
            d1.p r0 = (d1.p) r0
            r1 = 8
            r5 = 1
            r13 = 0
            r0.b(r1, r13, r5)
            return r5
        L699:
            boolean r0 = r8.isInTouchMode()
            if (r0 == 0) goto L6a2
            r8.requestFocusFromTouch()
        L6a2:
            f2.x r0 = f2.l.f3200w
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L6ac
            r6 = 0
            goto L6ad
        L6ac:
            r6 = r0
        L6ad:
            f2.a r6 = (f2.a) r6
            if (r6 == 0) goto L23
            sf.b r0 = r6.f3138b
            fg.a r0 = (fg.a) r0
            if (r0 == 0) goto L23
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L6c2:
            if (r3 == 0) goto L6cb
            java.lang.String r0 = "ACTION_ARGUMENT_SELECTION_START_INT"
            int r0 = r3.getInt(r0, r15)
            goto L6cc
        L6cb:
            r0 = r15
        L6cc:
            if (r3 == 0) goto L6d4
            java.lang.String r1 = "ACTION_ARGUMENT_SELECTION_END_INT"
            int r15 = r3.getInt(r1, r15)
        L6d4:
            r13 = 0
            boolean r0 = r4.D(r12, r0, r15, r13)
            if (r0 == 0) goto L6e5
            int r1 = r4.t(r11)
            r3 = 12
            r5 = 0
            y1.z.x(r4, r1, r13, r5, r3)
        L6e5:
            return r0
        L6e6:
            f2.x r0 = f2.l.f3194q
            java.lang.Object r0 = r14.g(r0)
            if (r0 != 0) goto L6f0
            r6 = 0
            goto L6f1
        L6f0:
            r6 = r0
        L6f1:
            f2.a r6 = (f2.a) r6
            if (r6 == 0) goto L23
            sf.b r0 = r6.f3138b
            fg.a r0 = (fg.a) r0
            if (r0 == 0) goto L23
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L706:
            if (r3 == 0) goto L23
            java.lang.String r0 = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"
            int r0 = r3.getInt(r0)
            java.lang.String r6 = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"
            boolean r3 = r3.getBoolean(r6)
            if (r1 != r5) goto L718
            r1 = 1
            goto L719
        L718:
            r1 = 0
        L719:
            java.lang.Integer r6 = r4.A
            if (r6 != 0) goto L71e
            goto L724
        L71e:
            int r6 = r6.intValue()
            if (r11 == r6) goto L72c
        L724:
            r4.f22182z = r15
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            r4.A = r6
        L72c:
            java.lang.String r6 = y1.z.m(r12)
            if (r6 == 0) goto L23
            int r7 = r6.length()
            if (r7 != 0) goto L73a
            goto L23
        L73a:
            java.lang.String r7 = y1.z.m(r12)
            if (r7 == 0) goto L758
            int r9 = r7.length()
            if (r9 != 0) goto L747
            goto L758
        L747:
            r9 = 1
            if (r0 == r9) goto L7dc
            r9 = 2
            if (r0 == r9) goto L7b3
            r8 = 4
            if (r0 == r8) goto L76f
            r9 = 8
            if (r0 == r9) goto L75b
            r9 = 16
            if (r0 == r9) goto L76f
        L758:
            r8 = 0
            goto L804
        L75b:
            y1.e r8 = y1.e.f21878c
            if (r8 != 0) goto L766
            y1.e r8 = new y1.e
            r8.<init>()
            y1.e.f21878c = r8
        L766:
            y1.e r8 = y1.e.f21878c
            r8.getClass()
            r8.f21849a = r7
            goto L804
        L76f:
            f2.x r9 = f2.l.f3178a
            boolean r9 = r14.c(r9)
            if (r9 != 0) goto L778
            goto L758
        L778:
            i2.k0 r9 = y1.g0.o(r13)
            if (r9 != 0) goto L77f
            goto L758
        L77f:
            if (r0 != r8) goto L797
            y1.c r8 = y1.c.f21857g
            if (r8 != 0) goto L78d
            y1.c r8 = new y1.c
            r11 = 2
            r8.<init>(r11)
            y1.c.f21857g = r8
        L78d:
            y1.c r8 = y1.c.f21857g
            r8.getClass()
            r8.f21849a = r7
            r8.f21861d = r9
            goto L804
        L797:
            y1.d r8 = y1.d.f21867e
            if (r8 != 0) goto L7a7
            y1.d r8 = new y1.d
            r8.<init>()
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            y1.d.f21867e = r8
        L7a7:
            y1.d r8 = y1.d.f21867e
            r8.getClass()
            r8.f21849a = r7
            r8.f21870c = r9
            r8.f21871d = r12
            goto L804
        L7b3:
            android.content.Context r8 = r8.getContext()
            android.content.res.Resources r8 = r8.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            y1.c r9 = y1.c.f21856f
            if (r9 != 0) goto L7d3
            y1.c r9 = new y1.c
            r11 = 1
            r9.<init>(r11)
            java.text.BreakIterator r8 = java.text.BreakIterator.getWordInstance(r8)
            r9.f21861d = r8
            y1.c.f21856f = r9
        L7d3:
            y1.c r8 = y1.c.f21856f
            r8.getClass()
            r8.f(r7)
            goto L804
        L7dc:
            android.content.Context r8 = r8.getContext()
            android.content.res.Resources r8 = r8.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            y1.c r9 = y1.c.f21855e
            if (r9 != 0) goto L7fc
            y1.c r9 = new y1.c
            r11 = 0
            r9.<init>(r11)
            java.text.BreakIterator r8 = java.text.BreakIterator.getCharacterInstance(r8)
            r9.f21861d = r8
            y1.c.f21855e = r9
        L7fc:
            y1.c r8 = y1.c.f21855e
            r8.getClass()
            r8.f(r7)
        L804:
            if (r8 != 0) goto L808
            goto L23
        L808:
            int r7 = r4.j(r12)
            if (r7 != r15) goto L817
            if (r1 == 0) goto L812
            r6 = 0
            goto L816
        L812:
            int r6 = r6.length()
        L816:
            r7 = r6
        L817:
            if (r1 == 0) goto L81e
            int[] r6 = r8.a(r7)
            goto L822
        L81e:
            int[] r6 = r8.d(r7)
        L822:
            if (r6 != 0) goto L826
            goto L23
        L826:
            r18 = 0
            r7 = r6[r18]
            r19 = 1
            r16 = r6[r19]
            if (r3 == 0) goto L853
            f2.x r3 = f2.u.f3223a
            boolean r3 = r14.c(r3)
            if (r3 != 0) goto L853
            f2.x r3 = f2.u.F
            boolean r3 = r14.c(r3)
            if (r3 == 0) goto L853
            int r3 = r4.k(r12)
            if (r3 != r15) goto L84c
            if (r1 == 0) goto L84a
            r3 = r7
            goto L84c
        L84a:
            r3 = r16
        L84c:
            if (r1 == 0) goto L851
            r6 = r16
            goto L85a
        L851:
            r6 = r7
            goto L85a
        L853:
            if (r1 == 0) goto L858
            r3 = r16
            goto L859
        L858:
            r3 = r7
        L859:
            r6 = r3
        L85a:
            if (r1 == 0) goto L85e
            r13 = r5
            goto L85f
        L85e:
            r13 = r10
        L85f:
            y1.v r11 = new y1.v
            long r17 = android.os.SystemClock.uptimeMillis()
            r14 = r0
            r15 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r4.E = r11
            r5 = 1
            r4.D(r12, r3, r6, r5)
            return r5
        L871:
            int r1 = r4.f22173q
            if (r1 != r0) goto L877
            r1 = 1
            goto L878
        L877:
            r1 = 0
        L878:
            if (r1 == 0) goto L23
            r4.f22173q = r15
            r3 = 0
            r4.f22175s = r3
            r8.invalidate()
            r1 = 65536(0x10000, float:9.1835E-41)
            r5 = 12
            y1.z.x(r4, r0, r1, r3, r5)
        L889:
            r19 = 1
            return r19
        L88c:
            boolean r1 = r5.isEnabled()
            if (r1 == 0) goto L89a
            boolean r1 = r5.isTouchExplorationEnabled()
            if (r1 == 0) goto L89a
            r5 = 1
            goto L89b
        L89a:
            r5 = 0
        L89b:
            if (r5 != 0) goto L89f
            goto L23
        L89f:
            int r1 = r4.f22173q
            if (r1 != r0) goto L8a5
            r5 = 1
            goto L8a6
        L8a5:
            r5 = 0
        L8a6:
            if (r5 != 0) goto L23
            if (r1 == r15) goto L8b3
            r3 = 65536(0x10000, float:9.1835E-41)
            r5 = 12
            r6 = 0
            y1.z.x(r4, r1, r3, r6, r5)
            goto L8b6
        L8b3:
            r5 = 12
            r6 = 0
        L8b6:
            r4.f22173q = r0
            r8.invalidate()
            r1 = 32768(0x8000, float:4.5918E-41)
            y1.z.x(r4, r0, r1, r6, r5)
            goto L889
        L8c2:
            return r18
    }

    @Override // androidx.lifecycle.x
    public final void f(int r2, h3.g r3, java.lang.String r4, android.os.Bundle r5) {
            r1 = this;
            y1.z r0 = r1.f22125i
            r0.c(r2, r3, r4, r5)
            return
    }

    @Override // androidx.lifecycle.x
    public final h3.g l(int r47) {
            r46 = this;
            r0 = r46
            r1 = r47
            y1.z r2 = r0.f22125i
            android.view.accessibility.AccessibilityManager r3 = r2.f22169m
            y1.t r4 = r2.f22166j
            y1.f1 r5 = r4.getComposeViewContext()
            androidx.lifecycle.q r5 = r5.f21890c
            androidx.lifecycle.s r5 = r5.f()
            androidx.lifecycle.l r5 = r5.f300c
            androidx.lifecycle.l r6 = androidx.lifecycle.l.f289g
            if (r5 != r6) goto L2f
            boolean r3 = r3.isEnabled()
            if (r3 != 0) goto L2a
            android.view.accessibility.AccessibilityNodeInfo r3 = android.view.accessibility.AccessibilityNodeInfo.obtain()
            h3.g r7 = new h3.g
            r7.<init>(r3)
            goto L2b
        L2a:
            r7 = 0
        L2b:
            r5 = r1
            r12 = r2
            goto Lcdf
        L2f:
            f.k r5 = r2.l()
            java.lang.Object r5 = r5.b(r1)
            f2.r r5 = (f2.r) r5
            if (r5 != 0) goto L4b
            boolean r3 = r3.isEnabled()
            if (r3 != 0) goto L2a
            android.view.accessibility.AccessibilityNodeInfo r3 = android.view.accessibility.AccessibilityNodeInfo.obtain()
            h3.g r7 = new h3.g
            r7.<init>(r3)
            goto L2b
        L4b:
            f2.q r6 = r5.f3216a
            f2.m r8 = r6.k()
            x1.f0 r9 = r6.f3212c
            f2.x r10 = f2.u.f3236n
            f.k0 r8 = r8.f3204g
            java.lang.Object r8 = r8.g(r10)
            if (r8 != 0) goto L5e
            r8 = 0
        L5e:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            boolean r8 = gg.l.a(r8, r10)
            r10 = 34
            if (r8 == 0) goto L79
            int r12 = android.os.Build.VERSION.SDK_INT
            if (r12 < r10) goto L71
            boolean r12 = h3.b.e(r3)
            goto L72
        L71:
            r12 = 1
        L72:
            if (r12 != 0) goto L79
            r5 = r1
            r12 = r2
            r7 = 0
            goto Lcdf
        L79:
            android.view.accessibility.AccessibilityNodeInfo r12 = android.view.accessibility.AccessibilityNodeInfo.obtain()
            h3.g r13 = new h3.g
            r13.<init>(r12)
            int r14 = android.os.Build.VERSION.SDK_INT
            if (r14 < r10) goto L8a
            h3.b.g(r12, r8)
            goto L8f
        L8a:
            r15 = 64
            r13.f(r15, r8)
        L8f:
            r8 = -1
            if (r1 != r8) goto La8
            android.view.ViewParent r15 = r4.getParentForAccessibility()
            r16 = 0
            boolean r7 = r15 instanceof android.view.View
            if (r7 == 0) goto La0
            r7 = r15
            android.view.View r7 = (android.view.View) r7
            goto La2
        La0:
            r7 = r16
        La2:
            r13.f5067b = r8
            r12.setParent(r7)
            goto Ld1
        La8:
            r16 = 0
            f2.q r7 = r6.l()
            if (r7 == 0) goto Lb7
            int r7 = r7.f3215f
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto Lb9
        Lb7:
            r7 = r16
        Lb9:
            if (r7 == 0) goto Lcf6
            int r7 = r7.intValue()
            f2.s r15 = r4.getSemanticsOwner()
            f2.q r15 = r15.a()
            int r15 = r15.f3215f
            if (r7 != r15) goto Lcc
            r7 = r8
        Lcc:
            r13.f5067b = r7
            r12.setParent(r4, r7)
        Ld1:
            r13.f5068c = r1
            r12.setSource(r4, r1)
            android.graphics.Rect r5 = r2.d(r5)
            r12.setBoundsInScreen(r5)
            f.u r5 = r2.P
            f.t0 r7 = r2.f22181y
            android.content.Context r15 = r4.getContext()
            android.content.res.Resources r15 = r15.getResources()
            java.lang.String r11 = "android.view.View"
            r13.g(r11)
            f2.m r11 = r6.f3213d
            f.k0 r8 = r11.f3204g
            f2.x r10 = f2.u.F
            boolean r10 = r8.c(r10)
            if (r10 == 0) goto Lff
            java.lang.String r10 = "android.widget.EditText"
            r13.g(r10)
        Lff:
            f2.x r10 = f2.u.B
            boolean r10 = r8.c(r10)
            if (r10 == 0) goto L10c
            java.lang.String r10 = "android.widget.TextView"
            r13.g(r10)
        L10c:
            f2.x r10 = f2.u.f3247y
            java.lang.Object r10 = r8.g(r10)
            if (r10 != 0) goto L116
            r10 = r16
        L116:
            f2.i r10 = (f2.i) r10
            if (r10 == 0) goto L171
            int r0 = r10.f3155a
            boolean r19 = r6.o()
            if (r19 != 0) goto L132
            r19 = r3
            r3 = 4
            java.util.List r18 = f2.q.j(r3, r6)
            boolean r18 = r18.isEmpty()
            r20 = r7
            if (r18 == 0) goto L175
            goto L137
        L132:
            r19 = r3
            r3 = 4
            r20 = r7
        L137:
            java.lang.String r7 = "AccessibilityNodeInfo.roleDescription"
            if (r0 != r3) goto L14a
            r0 = 2131296285(0x7f09001d, float:1.8210482E38)
            java.lang.String r0 = r15.getString(r0)
            android.os.Bundle r3 = r12.getExtras()
            r3.putCharSequence(r7, r0)
            goto L175
        L14a:
            r3 = 2
            if (r0 != r3) goto L15c
            r0 = 2131296284(0x7f09001c, float:1.821048E38)
            java.lang.String r0 = r15.getString(r0)
            android.os.Bundle r3 = r12.getExtras()
            r3.putCharSequence(r7, r0)
            goto L175
        L15c:
            java.lang.String r3 = y1.g0.v(r0)
            r7 = 5
            if (r0 != r7) goto L16d
            boolean r0 = r6.q()
            if (r0 != 0) goto L16d
            boolean r0 = r11.f3206i
            if (r0 == 0) goto L175
        L16d:
            r13.g(r3)
            goto L175
        L171:
            r19 = r3
            r20 = r7
        L175:
            android.content.Context r0 = r4.getContext()
            java.lang.String r0 = r0.getPackageName()
            r12.setPackageName(r0)
            boolean r0 = f2.t.h(r6)
            r12.setImportantForAccessibility(r0)
            r0 = 34
            if (r14 < r0) goto L191
            boolean r0 = h3.b.e(r19)
        L18f:
            r3 = 4
            goto L193
        L191:
            r0 = 1
            goto L18f
        L193:
            java.util.List r7 = f2.q.j(r3, r6)
            int r3 = r7.size()
            r19 = r0
            r0 = 0
            r14 = 0
        L19f:
            if (r14 >= r3) goto L210
            java.lang.Object r21 = r7.get(r14)
            r22 = r3
            r3 = r21
            f2.q r3 = (f2.q) r3
            r21 = r7
            f.k r7 = r2.l()
            r23 = r14
            int r14 = r3.f3215f
            boolean r7 = r7.a(r14)
            if (r7 == 0) goto L209
            y1.r0 r7 = r4.getAndroidViewsHandler$ui()
            java.util.HashMap r7 = r7.getLayoutNodeToHolder()
            x1.f0 r3 = r3.f3212c
            java.lang.Object r3 = r7.get(r3)
            x2.h r3 = (x2.h) r3
            r7 = -1
            if (r14 != r7) goto L1cf
            goto L209
        L1cf:
            if (r3 == 0) goto L1d5
            r12.addChild(r3)
            goto L204
        L1d5:
            f.k r3 = r2.l()
            java.lang.Object r3 = r3.b(r14)
            f2.r r3 = (f2.r) r3
            if (r3 == 0) goto L1fc
            f2.q r3 = r3.f3216a
            if (r3 == 0) goto L1fc
            f2.m r3 = r3.k()
            f2.x r7 = f2.u.f3236n
            f.k0 r3 = r3.f3204g
            java.lang.Object r3 = r3.g(r7)
            if (r3 != 0) goto L1f5
            r3 = r16
        L1f5:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            boolean r3 = gg.l.a(r3, r7)
            goto L1fd
        L1fc:
            r3 = 0
        L1fd:
            if (r19 != 0) goto L201
            if (r3 != 0) goto L204
        L201:
            r12.addChild(r4, r14)
        L204:
            r5.f(r14, r0)
            int r0 = r0 + 1
        L209:
            int r14 = r23 + 1
            r7 = r21
            r3 = r22
            goto L19f
        L210:
            int r0 = r2.f22173q
            android.view.accessibility.AccessibilityNodeInfo r3 = r13.f5066a
            if (r1 != r0) goto L220
            r0 = 1
            r3.setAccessibilityFocused(r0)
            h3.e r0 = h3.e.f5056d
            r13.a(r0)
            goto L229
        L220:
            r0 = 0
            r3.setAccessibilityFocused(r0)
            h3.e r0 = h3.e.f5055c
            r13.a(r0)
        L229:
            i2.g r0 = y1.g0.m(r6)
            if (r0 == 0) goto L494
            r4.getFontFamilyResolver()
            u2.c r24 = r4.getDensity()
            b5.c r7 = r2.L
            android.text.SpannableString r14 = new android.text.SpannableString
            r19 = r4
            java.lang.String r4 = r0.f6314h
            r27 = r9
            java.util.List r9 = r0.f6313g
            r14.<init>(r4)
            r28 = r4
            java.util.ArrayList r4 = r0.f6315i
            r29 = r2
            if (r4 == 0) goto L34d
            int r2 = r4.size()
            r30 = r5
            r5 = 0
        L254:
            if (r5 >= r2) goto L33d
            java.lang.Object r21 = r4.get(r5)
            r31 = r2
            r2 = r21
            i2.e r2 = (i2.e) r2
            r32 = r4
            java.lang.Object r4 = r2.f6288a
            i2.f0 r4 = (i2.f0) r4
            r33 = r5
            int r5 = r2.f6289b
            int r2 = r2.f6290c
            t2.o r1 = r4.f6298a
            r35 = r10
            r34 = r11
            long r10 = r1.b()
            r1 = r12
            r36 = r13
            long r12 = r4.f6299b
            r37 = r1
            m2.k r1 = r4.f6300c
            r38 = r1
            m2.i r1 = r4.f6301d
            r22 = r12
            t2.p r12 = r4.f6307j
            p2.b r13 = r4.f6308k
            r39 = r6
            r40 = r7
            long r6 = r4.f6309l
            r41 = r6
            t2.l r6 = r4.f6310m
            t2.o r4 = r4.f6298a
            r43 = r8
            long r7 = r4.b()
            boolean r7 = f1.w.c(r10, r7)
            r44 = 16
            if (r7 == 0) goto L2a4
            goto L2b0
        L2a4:
            int r4 = (r10 > r44 ? 1 : (r10 == r44 ? 0 : -1))
            if (r4 == 0) goto L2ae
            t2.c r4 = new t2.c
            r4.<init>(r10)
            goto L2b0
        L2ae:
            t2.n r4 = t2.n.f13020a
        L2b0:
            long r7 = r4.b()
            f8.i.C0(r14, r7, r5, r2)
            r26 = r2
            r25 = r5
            r21 = r14
            f8.i.D0(r21, r22, r24, r25, r26)
            r2 = r21
            r4 = r25
            r5 = r26
            if (r38 != 0) goto L2ce
            if (r1 == 0) goto L2cb
            goto L2ce
        L2cb:
            r1 = 33
            goto L2e9
        L2ce:
            if (r38 != 0) goto L2d3
            m2.k r7 = m2.k.f8697i
            goto L2d5
        L2d3:
            r7 = r38
        L2d5:
            if (r1 == 0) goto L2da
            int r1 = r1.f8694a
            goto L2db
        L2da:
            r1 = 0
        L2db:
            android.text.style.StyleSpan r8 = new android.text.style.StyleSpan
            int r1 = g4.a.q(r7, r1)
            r8.<init>(r1)
            r1 = 33
            r2.setSpan(r8, r4, r5, r1)
        L2e9:
            if (r6 == 0) goto L305
            int r6 = r6.f13018a
            r7 = r6 | 1
            if (r7 != r6) goto L2f9
            android.text.style.UnderlineSpan r7 = new android.text.style.UnderlineSpan
            r7.<init>()
            r2.setSpan(r7, r4, r5, r1)
        L2f9:
            r7 = r6 | 2
            if (r7 != r6) goto L305
            android.text.style.StrikethroughSpan r6 = new android.text.style.StrikethroughSpan
            r6.<init>()
            r2.setSpan(r6, r4, r5, r1)
        L305:
            if (r12 == 0) goto L311
            android.text.style.ScaleXSpan r6 = new android.text.style.ScaleXSpan
            float r7 = r12.f13022a
            r6.<init>(r7)
            r2.setSpan(r6, r4, r5, r1)
        L311:
            f8.i.E0(r2, r13, r4, r5)
            int r6 = (r41 > r44 ? 1 : (r41 == r44 ? 0 : -1))
            if (r6 == 0) goto L324
            android.text.style.BackgroundColorSpan r6 = new android.text.style.BackgroundColorSpan
            int r7 = f1.c0.w(r41)
            r6.<init>(r7)
            r2.setSpan(r6, r4, r5, r1)
        L324:
            int r5 = r33 + 1
            r1 = r47
            r14 = r2
            r2 = r31
            r4 = r32
            r11 = r34
            r10 = r35
            r13 = r36
            r12 = r37
            r6 = r39
            r7 = r40
            r8 = r43
            goto L254
        L33d:
            r39 = r6
            r40 = r7
            r43 = r8
            r35 = r10
            r34 = r11
            r37 = r12
            r36 = r13
            r2 = r14
            goto L350
        L34d:
            r30 = r5
            goto L33d
        L350:
            int r1 = r28.length()
            tf.t r4 = tf.t.f13167g
            if (r9 == 0) goto L386
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = r9.size()
            r5.<init>(r6)
            int r6 = r9.size()
            r7 = 0
        L366:
            if (r7 >= r6) goto L387
            java.lang.Object r8 = r9.get(r7)
            r10 = r8
            i2.e r10 = (i2.e) r10
            java.lang.Object r11 = r10.f6288a
            boolean r11 = r11 instanceof i2.p0
            if (r11 == 0) goto L383
            int r11 = r10.f6289b
            int r10 = r10.f6290c
            r12 = 0
            boolean r10 = i2.h.b(r12, r1, r11, r10)
            if (r10 == 0) goto L383
            r5.add(r8)
        L383:
            int r7 = r7 + 1
            goto L366
        L386:
            r5 = r4
        L387:
            int r1 = r5.size()
            r6 = 0
        L38c:
            if (r6 >= r1) goto L3b7
            java.lang.Object r7 = r5.get(r6)
            i2.e r7 = (i2.e) r7
            java.lang.Object r8 = r7.f6288a
            i2.p0 r8 = (i2.p0) r8
            int r10 = r7.f6289b
            int r7 = r7.f6290c
            boolean r11 = r8 instanceof i2.p0
            if (r11 == 0) goto L3b3
            android.text.style.TtsSpan$VerbatimBuilder r11 = new android.text.style.TtsSpan$VerbatimBuilder
            java.lang.String r8 = r8.f6379a
            r11.<init>(r8)
            android.text.style.TtsSpan r8 = r11.build()
            r11 = 33
            r2.setSpan(r8, r10, r7, r11)
            int r6 = r6 + 1
            goto L38c
        L3b3:
            okio.a.k()
            return r16
        L3b7:
            int r1 = r28.length()
            if (r9 == 0) goto L3eb
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = r9.size()
            r4.<init>(r5)
            int r5 = r9.size()
            r6 = 0
        L3cb:
            if (r6 >= r5) goto L3eb
            java.lang.Object r7 = r9.get(r6)
            r8 = r7
            i2.e r8 = (i2.e) r8
            java.lang.Object r10 = r8.f6288a
            boolean r10 = r10 instanceof i2.o0
            if (r10 == 0) goto L3e8
            int r10 = r8.f6289b
            int r8 = r8.f6290c
            r12 = 0
            boolean r8 = i2.h.b(r12, r1, r10, r8)
            if (r8 == 0) goto L3e8
            r4.add(r7)
        L3e8:
            int r6 = r6 + 1
            goto L3cb
        L3eb:
            int r1 = r4.size()
            r5 = 0
        L3f0:
            if (r5 >= r1) goto L422
            java.lang.Object r6 = r4.get(r5)
            i2.e r6 = (i2.e) r6
            java.lang.Object r7 = r6.f6288a
            i2.o0 r7 = (i2.o0) r7
            int r8 = r6.f6289b
            int r6 = r6.f6290c
            r9 = r40
            java.lang.Object r10 = r9.f469a
            java.util.WeakHashMap r10 = (java.util.WeakHashMap) r10
            java.lang.Object r11 = r10.get(r7)
            if (r11 != 0) goto L416
            android.text.style.URLSpan r11 = new android.text.style.URLSpan
            java.lang.String r12 = r7.f6376a
            r11.<init>(r12)
            r10.put(r7, r11)
        L416:
            android.text.style.URLSpan r11 = (android.text.style.URLSpan) r11
            r7 = 33
            r2.setSpan(r11, r8, r6, r7)
            int r5 = r5 + 1
            r40 = r9
            goto L3f0
        L422:
            r9 = r40
            int r1 = r28.length()
            java.util.List r0 = r0.a(r1)
            int r1 = r0.size()
            r4 = 0
        L431:
            if (r4 >= r1) goto L48d
            java.lang.Object r5 = r0.get(r4)
            i2.e r5 = (i2.e) r5
            int r6 = r5.f6289b
            java.lang.Object r7 = r5.f6288a
            int r8 = r5.f6290c
            if (r6 == r8) goto L488
            r10 = r7
            i2.m r10 = (i2.m) r10
            boolean r11 = r10 instanceof i2.l
            if (r11 == 0) goto L46e
            i2.e r5 = new i2.e
            r7.getClass()
            i2.l r7 = (i2.l) r7
            r5.<init>(r6, r8, r7)
            java.lang.Object r10 = r9.f470b
            java.util.WeakHashMap r10 = (java.util.WeakHashMap) r10
            java.lang.Object r11 = r10.get(r5)
            if (r11 != 0) goto L466
            android.text.style.URLSpan r11 = new android.text.style.URLSpan
            java.lang.String r7 = r7.f6352a
            r11.<init>(r7)
            r10.put(r5, r11)
        L466:
            android.text.style.URLSpan r11 = (android.text.style.URLSpan) r11
            r7 = 33
            r2.setSpan(r11, r6, r8, r7)
            goto L48a
        L46e:
            java.lang.Object r7 = r9.f471c
            java.util.WeakHashMap r7 = (java.util.WeakHashMap) r7
            java.lang.Object r11 = r7.get(r5)
            if (r11 != 0) goto L480
            a9.b r11 = new a9.b
            r11.<init>(r10)
            r7.put(r5, r11)
        L480:
            android.text.style.ClickableSpan r11 = (android.text.style.ClickableSpan) r11
            r7 = 33
            r2.setSpan(r11, r6, r8, r7)
            goto L48a
        L488:
            r7 = 33
        L48a:
            int r4 = r4 + 1
            goto L431
        L48d:
            java.lang.CharSequence r0 = y1.z.I(r2)
            android.text.SpannableString r0 = (android.text.SpannableString) r0
            goto L4aa
        L494:
            r29 = r2
            r19 = r4
            r30 = r5
            r39 = r6
            r43 = r8
            r27 = r9
            r35 = r10
            r34 = r11
            r37 = r12
            r36 = r13
            r0 = r16
        L4aa:
            r3.setText(r0)
            f2.x r0 = f2.u.L
            r1 = r43
            boolean r2 = r1.c(r0)
            if (r2 == 0) goto L4cd
            r2 = r37
            r4 = 1
            r2.setContentInvalid(r4)
            java.lang.Object r0 = r1.g(r0)
            if (r0 != 0) goto L4c5
            r0 = r16
        L4c5:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.setError(r0)
        L4ca:
            r0 = r39
            goto L4d0
        L4cd:
            r2 = r37
            goto L4ca
        L4d0:
            java.lang.String r4 = y1.g0.l(r0, r15)
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 30
            if (r5 < r6) goto L4de
            b2.b.g(r3, r4)
            goto L4e7
        L4de:
            android.os.Bundle r5 = r3.getExtras()
            java.lang.String r6 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"
            r5.putCharSequence(r6, r4)
        L4e7:
            boolean r4 = y1.g0.k(r0)
            r2.setCheckable(r4)
            f2.x r4 = f2.u.J
            java.lang.Object r4 = r1.g(r4)
            if (r4 != 0) goto L4f8
            r4 = r16
        L4f8:
            h2.a r4 = (h2.a) r4
            if (r4 == 0) goto L50d
            h2.a r5 = h2.a.f5048g
            if (r4 != r5) goto L505
            r5 = 1
            r3.setChecked(r5)
            goto L50d
        L505:
            h2.a r5 = h2.a.f5049h
            if (r4 != r5) goto L50d
            r12 = 0
            r3.setChecked(r12)
        L50d:
            f2.x r4 = f2.u.I
            java.lang.Object r4 = r1.g(r4)
            if (r4 != 0) goto L517
            r4 = r16
        L517:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            if (r4 == 0) goto L536
            boolean r4 = r4.booleanValue()
            if (r35 != 0) goto L525
            r10 = r35
            r6 = 4
            goto L530
        L525:
            r10 = r35
            int r5 = r10.f3155a
            r6 = 4
            if (r5 != r6) goto L530
            r2.setSelected(r4)
            goto L533
        L530:
            r3.setChecked(r4)
        L533:
            r4 = r34
            goto L53a
        L536:
            r10 = r35
            r6 = 4
            goto L533
        L53a:
            boolean r5 = r4.f3206i
            if (r5 == 0) goto L548
            java.util.List r5 = f2.q.j(r6, r0)
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L562
        L548:
            f2.x r5 = f2.u.f3223a
            java.lang.Object r5 = r1.g(r5)
            if (r5 != 0) goto L552
            r5 = r16
        L552:
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L55d
            java.lang.Object r5 = tf.m.v1(r5)
            java.lang.String r5 = (java.lang.String) r5
            goto L55f
        L55d:
            r5 = r16
        L55f:
            r2.setContentDescription(r5)
        L562:
            f2.x r5 = f2.u.f3248z
            java.lang.Object r5 = r1.g(r5)
            if (r5 != 0) goto L56c
            r5 = r16
        L56c:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L595
            r6 = r0
        L571:
            if (r6 == 0) goto L58f
            f2.m r7 = r6.f3213d
            f2.x r8 = f2.v.f3249a
            f.k0 r9 = r7.f3204g
            boolean r9 = r9.c(r8)
            if (r9 == 0) goto L58a
            java.lang.Object r6 = r7.d(r8)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            goto L590
        L58a:
            f2.q r6 = r6.l()
            goto L571
        L58f:
            r6 = 0
        L590:
            if (r6 == 0) goto L595
            r2.setViewIdResourceName(r5)
        L595:
            f2.x r5 = f2.u.f3230h
            java.lang.Object r5 = r1.g(r5)
            if (r5 != 0) goto L59f
            r5 = r16
        L59f:
            sf.n r5 = (sf.n) r5
            r6 = 28
            if (r5 == 0) goto L5b6
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r6) goto L5ae
            r5 = 1
            h3.c.k(r3, r5)
            goto L5b6
        L5ae:
            r7 = r36
            r5 = 1
            r8 = 2
            r7.f(r8, r5)
            goto L5b8
        L5b6:
            r7 = r36
        L5b8:
            f2.x r5 = f2.u.f3231i
            java.lang.Object r5 = r1.g(r5)
            if (r5 != 0) goto L5c2
            r5 = r16
        L5c2:
            sf.n r5 = (sf.n) r5
            r8 = 29
            if (r5 == 0) goto L5d6
            int r5 = android.os.Build.VERSION.SDK_INT
            if (r5 < r8) goto L5d0
            f1.a.p(r2)
            goto L5d6
        L5d0:
            r5 = 8
            r9 = 1
            r7.f(r5, r9)
        L5d6:
            r5 = r47
            r9 = -1
            if (r5 == r9) goto L5f0
            int r11 = r0.f3215f
            r12 = r30
            int r11 = r12.d(r11)
            if (r11 == r9) goto L5e9
            r2.setDrawingOrder(r11)
            goto L5f0
        L5e9:
            java.lang.String r9 = "AccessibilityDelegate"
            java.lang.String r11 = "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?"
            android.util.Log.w(r9, r11)
        L5f0:
            f2.x r9 = f2.u.K
            boolean r9 = r1.c(r9)
            r2.setPassword(r9)
            f2.x r9 = f2.u.N
            java.lang.Object r9 = r1.g(r9)
            if (r9 != 0) goto L603
            r9 = r16
        L603:
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            boolean r9 = gg.l.a(r9, r11)
            r2.setEditable(r9)
            f2.x r9 = f2.u.O
            java.lang.Object r9 = r1.g(r9)
            if (r9 != 0) goto L616
            r9 = r16
        L616:
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 == 0) goto L61f
            int r9 = r9.intValue()
            goto L620
        L61f:
            r9 = -1
        L620:
            r2.setMaxTextLength(r9)
            boolean r9 = y1.g0.b(r0)
            r2.setEnabled(r9)
            f2.x r9 = f2.u.f3234l
            boolean r12 = r1.c(r9)
            r2.setFocusable(r12)
            boolean r12 = r2.isFocusable()
            if (r12 == 0) goto L65d
            java.lang.Object r12 = r4.d(r9)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            r2.setFocused(r12)
            boolean r12 = r2.isFocused()
            if (r12 == 0) goto L656
            r12 = 2
            r3.addAction(r12)
            r12 = r29
            r12.f22174r = r5
        L654:
            r13 = 1
            goto L660
        L656:
            r12 = r29
            r13 = 1
            r3.addAction(r13)
            goto L660
        L65d:
            r12 = r29
            goto L654
        L660:
            boolean r14 = f2.t.g(r0)
            r14 = r14 ^ r13
            r3.setVisibleToUser(r14)
            boolean r13 = r0.o()
            if (r13 == 0) goto L676
            f2.q r13 = r0.l()
            r13.getClass()
            goto L677
        L676:
            r13 = r0
        L677:
            e1.c r13 = r13.m()
            boolean r13 = r13.f()
            if (r13 == 0) goto L686
            r13 = 0
            r3.setVisibleToUser(r13)
            goto L687
        L686:
            r13 = 0
        L687:
            f2.x r14 = f2.u.f3233k
            java.lang.Object r14 = r1.g(r14)
            if (r14 != 0) goto L691
            r14 = r16
        L691:
            if (r14 != 0) goto Lcf0
            r3.setClickable(r13)
            f2.x r13 = f2.l.f3179b
            java.lang.Object r13 = r1.g(r13)
            if (r13 != 0) goto L6a0
            r13 = r16
        L6a0:
            f2.a r13 = (f2.a) r13
            if (r13 == 0) goto L6f3
            f2.x r8 = f2.u.I
            java.lang.Object r8 = r1.g(r8)
            if (r8 != 0) goto L6ae
            r8 = r16
        L6ae:
            boolean r8 = gg.l.a(r8, r11)
            if (r10 != 0) goto L6b6
        L6b4:
            r6 = 0
            goto L6bc
        L6b6:
            int r14 = r10.f3155a
            r6 = 4
            if (r14 != r6) goto L6b4
            r6 = 1
        L6bc:
            if (r6 != 0) goto L6cd
            if (r10 != 0) goto L6c2
        L6c0:
            r6 = 0
            goto L6c8
        L6c2:
            int r6 = r10.f3155a
            r10 = 3
            if (r6 != r10) goto L6c0
            r6 = 1
        L6c8:
            if (r6 == 0) goto L6cb
            goto L6cd
        L6cb:
            r6 = 0
            goto L6ce
        L6cd:
            r6 = 1
        L6ce:
            if (r6 == 0) goto L6d7
            if (r6 == 0) goto L6d5
            if (r8 != 0) goto L6d5
            goto L6d7
        L6d5:
            r6 = 0
            goto L6d8
        L6d7:
            r6 = 1
        L6d8:
            r3.setClickable(r6)
            boolean r6 = y1.g0.b(r0)
            if (r6 == 0) goto L6f3
            boolean r6 = r2.isClickable()
            if (r6 == 0) goto L6f3
            h3.e r6 = new h3.e
            java.lang.String r8 = r13.f3137a
            r10 = 16
            r6.<init>(r10, r8)
            r7.a(r6)
        L6f3:
            r13 = 0
            r3.setLongClickable(r13)
            f2.x r6 = f2.l.f3180c
            java.lang.Object r6 = f2.t.f(r4, r6)
            f2.a r6 = (f2.a) r6
            if (r6 == 0) goto L717
            r13 = 1
            r3.setLongClickable(r13)
            boolean r8 = y1.g0.b(r0)
            if (r8 == 0) goto L717
            h3.e r8 = new h3.e
            r10 = 32
            java.lang.String r6 = r6.f3137a
            r8.<init>(r10, r6)
            r7.a(r8)
        L717:
            f2.x r6 = f2.l.f3194q
            java.lang.Object r6 = f2.t.f(r4, r6)
            f2.a r6 = (f2.a) r6
            if (r6 == 0) goto L72d
            h3.e r8 = new h3.e
            r10 = 16384(0x4000, float:2.2959E-41)
            java.lang.String r6 = r6.f3137a
            r8.<init>(r10, r6)
            r7.a(r8)
        L72d:
            boolean r6 = y1.g0.b(r0)
            if (r6 == 0) goto L7ab
            f2.x r6 = f2.l.f3188k
            java.lang.Object r6 = f2.t.f(r4, r6)
            f2.a r6 = (f2.a) r6
            if (r6 == 0) goto L749
            h3.e r8 = new h3.e
            r10 = 2097152(0x200000, float:2.938736E-39)
            java.lang.String r6 = r6.f3137a
            r8.<init>(r10, r6)
            r7.a(r8)
        L749:
            f2.x r6 = f2.l.f3193p
            java.lang.Object r6 = f2.t.f(r4, r6)
            f2.a r6 = (f2.a) r6
            if (r6 == 0) goto L760
            h3.e r8 = new h3.e
            r10 = 16908372(0x1020054, float:2.3877464E-38)
            java.lang.String r6 = r6.f3137a
            r8.<init>(r10, r6)
            r7.a(r8)
        L760:
            f2.x r6 = f2.l.f3195r
            java.lang.Object r6 = f2.t.f(r4, r6)
            f2.a r6 = (f2.a) r6
            if (r6 == 0) goto L776
            h3.e r8 = new h3.e
            r10 = 65536(0x10000, float:9.1835E-41)
            java.lang.String r6 = r6.f3137a
            r8.<init>(r10, r6)
            r7.a(r8)
        L776:
            f2.x r6 = f2.l.f3196s
            java.lang.Object r6 = f2.t.f(r4, r6)
            f2.a r6 = (f2.a) r6
            if (r6 == 0) goto L7ab
            boolean r8 = r2.isFocused()
            if (r8 == 0) goto L7ab
            y1.i r8 = r19.getClipboardManager()
            android.content.ClipboardManager r8 = r8.a()
            android.content.ClipDescription r8 = r8.getPrimaryClipDescription()
            if (r8 == 0) goto L79b
            java.lang.String r10 = "text/*"
            boolean r8 = r8.hasMimeType(r10)
            goto L79c
        L79b:
            r8 = 0
        L79c:
            if (r8 == 0) goto L7ab
            h3.e r8 = new h3.e
            r10 = 32768(0x8000, float:4.5918E-41)
            java.lang.String r6 = r6.f3137a
            r8.<init>(r10, r6)
            r7.a(r8)
        L7ab:
            java.lang.String r6 = y1.z.m(r0)
            if (r6 == 0) goto L7ba
            int r6 = r6.length()
            if (r6 != 0) goto L7b8
            goto L7ba
        L7b8:
            r6 = 0
            goto L7bb
        L7ba:
            r6 = 1
        L7bb:
            if (r6 != 0) goto L875
            int r6 = r12.k(r0)
            int r8 = r12.j(r0)
            r2.setTextSelection(r6, r8)
            f2.x r6 = f2.l.f3187j
            java.lang.Object r6 = f2.t.f(r4, r6)
            f2.a r6 = (f2.a) r6
            h3.e r8 = new h3.e
            if (r6 == 0) goto L7d7
            java.lang.String r6 = r6.f3137a
            goto L7d9
        L7d7:
            r6 = r16
        L7d9:
            r10 = 131072(0x20000, float:1.83671E-40)
            r8.<init>(r10, r6)
            r7.a(r8)
            r6 = 256(0x100, float:3.59E-43)
            r3.addAction(r6)
            r6 = 512(0x200, float:7.17E-43)
            r3.addAction(r6)
            r6 = 11
            r3.setMovementGranularities(r6)
            f2.x r6 = f2.u.f3223a
            java.lang.Object r6 = f2.t.f(r4, r6)
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L803
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L801
            goto L803
        L801:
            r6 = 0
            goto L804
        L803:
            r6 = 1
        L804:
            if (r6 == 0) goto L875
            f2.x r6 = f2.l.f3178a
            boolean r6 = r1.c(r6)
            if (r6 == 0) goto L875
            f2.x r6 = f2.u.F
            boolean r6 = r1.c(r6)
            if (r6 == 0) goto L821
            java.lang.Object r6 = f2.t.f(r4, r9)
            boolean r6 = gg.l.a(r6, r11)
            if (r6 != 0) goto L821
            goto L867
        L821:
            x1.f0 r6 = r27.u()
        L825:
            if (r6 == 0) goto L847
            f2.m r8 = r6.w()
            if (r8 == 0) goto L83e
            boolean r9 = r8.f3206i
            r13 = 1
            if (r9 != r13) goto L83e
            f2.x r9 = f2.u.F
            f.k0 r8 = r8.f3204g
            boolean r8 = r8.c(r9)
            if (r8 == 0) goto L83e
            r8 = 1
            goto L83f
        L83e:
            r8 = 0
        L83f:
            if (r8 == 0) goto L842
            goto L849
        L842:
            x1.f0 r6 = r6.u()
            goto L825
        L847:
            r6 = r16
        L849:
            if (r6 == 0) goto L869
            f2.m r6 = r6.w()
            if (r6 == 0) goto L864
            f2.x r8 = f2.u.f3234l
            f.k0 r6 = r6.f3204g
            java.lang.Object r6 = r6.g(r8)
            if (r6 != 0) goto L85d
            r6 = r16
        L85d:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            boolean r6 = gg.l.a(r6, r8)
            goto L865
        L864:
            r6 = 0
        L865:
            if (r6 != 0) goto L869
        L867:
            r6 = 1
            goto L86a
        L869:
            r6 = 0
        L86a:
            if (r6 != 0) goto L875
            int r6 = r2.getMovementGranularities()
            r6 = r6 | 20
            r3.setMovementGranularities(r6)
        L875:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.String r8 = "androidx.compose.ui.semantics.id"
            r6.add(r8)
            java.lang.CharSequence r8 = r7.e()
            if (r8 == 0) goto L88e
            int r8 = r8.length()
            if (r8 != 0) goto L88c
            goto L88e
        L88c:
            r8 = 0
            goto L88f
        L88e:
            r8 = 1
        L88f:
            if (r8 != 0) goto L89e
            f2.x r8 = f2.l.f3178a
            boolean r8 = r1.c(r8)
            if (r8 == 0) goto L89e
            java.lang.String r8 = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY"
            r6.add(r8)
        L89e:
            f2.x r8 = f2.u.f3248z
            boolean r8 = r1.c(r8)
            if (r8 == 0) goto L8ab
            java.lang.String r8 = "androidx.compose.ui.semantics.testTag"
            r6.add(r8)
        L8ab:
            f2.x r8 = f2.u.P
            boolean r8 = r1.c(r8)
            if (r8 == 0) goto L8c7
            java.lang.String r8 = "androidx.compose.ui.semantics.shapeType"
            r6.add(r8)
            java.lang.String r8 = "androidx.compose.ui.semantics.shapeRect"
            r6.add(r8)
            java.lang.String r8 = "androidx.compose.ui.semantics.shapeCorners"
            r6.add(r8)
            java.lang.String r8 = "androidx.compose.ui.semantics.shapeRegion"
            r6.add(r8)
        L8c7:
            r2.setAvailableExtraData(r6)
            f2.x r2 = f2.u.f3225c
            java.lang.Object r2 = f2.t.f(r4, r2)
            f2.h r2 = (f2.h) r2
            if (r2 == 0) goto L954
            float r4 = r2.f3152a
            lg.a r6 = r2.f3153b
            f2.x r8 = f2.l.f3186i
            boolean r9 = r1.c(r8)
            if (r9 == 0) goto L8e6
            java.lang.String r9 = "android.widget.SeekBar"
            r7.g(r9)
            goto L8eb
        L8e6:
            java.lang.String r9 = "android.widget.ProgressBar"
            r7.g(r9)
        L8eb:
            f2.h r9 = f2.h.f3151d
            if (r2 == r9) goto L904
            float r2 = r6.f8040a
            float r9 = r6.f8041b
            h3.f r10 = new h3.f
            r13 = 1
            android.view.accessibility.AccessibilityNodeInfo$RangeInfo r2 = android.view.accessibility.AccessibilityNodeInfo.RangeInfo.obtain(r13, r2, r9, r4)
            r10.<init>(r2)
            java.lang.Object r2 = r10.f5065a
            android.view.accessibility.AccessibilityNodeInfo$RangeInfo r2 = (android.view.accessibility.AccessibilityNodeInfo.RangeInfo) r2
            r3.setRangeInfo(r2)
        L904:
            boolean r1 = r1.c(r8)
            if (r1 == 0) goto L954
            boolean r1 = y1.g0.b(r0)
            if (r1 == 0) goto L954
            java.lang.Comparable r1 = r6.a()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Comparable r2 = r6.b()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r8 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r8 >= 0) goto L929
            r1 = r2
        L929:
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 >= 0) goto L932
            h3.e r1 = h3.e.f5057e
            r7.a(r1)
        L932:
            java.lang.Comparable r1 = r6.b()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Comparable r2 = r6.a()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r6 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r6 <= 0) goto L94b
            r1 = r2
        L94b:
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 <= 0) goto L954
            h3.e r1 = h3.e.f5058f
            r7.a(r1)
        L954:
            boolean r1 = y1.g0.b(r0)
            if (r1 == 0) goto L97b
            f2.m r1 = r0.f3213d
            f2.x r2 = f2.l.f3186i
            f.k0 r1 = r1.f3204g
            java.lang.Object r1 = r1.g(r2)
            if (r1 != 0) goto L968
            r1 = r16
        L968:
            f2.a r1 = (f2.a) r1
            if (r1 == 0) goto L97b
            h3.e r2 = new h3.e
            r4 = 16908349(0x102003d, float:2.38774E-38)
            java.lang.String r1 = r1.f3137a
            r6 = r16
            r2.<init>(r6, r4, r1, r6)
            r7.a(r2)
        L97b:
            f2.m r1 = r0.k()
            f2.x r2 = f2.u.f3228f
            f.k0 r1 = r1.f3204g
            java.lang.Object r1 = r1.g(r2)
            if (r1 != 0) goto L98a
            r1 = 0
        L98a:
            f2.d r1 = (f2.d) r1
            if (r1 == 0) goto L99b
            int r2 = r1.f3142a
            int r1 = r1.f3143b
            r13 = 0
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r1 = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(r2, r1, r13, r13)
            r3.setCollectionInfo(r1)
            goto L9fa
        L99b:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            f2.m r2 = r0.k()
            f2.x r4 = f2.u.f3227e
            f.k0 r2 = r2.f3204g
            java.lang.Object r2 = r2.g(r4)
            if (r2 != 0) goto L9af
            r2 = 0
        L9af:
            if (r2 == 0) goto L9d7
            r6 = 4
            java.util.List r2 = f2.q.j(r6, r0)
            int r4 = r2.size()
            r6 = 0
        L9bb:
            if (r6 >= r4) goto L9d7
            java.lang.Object r8 = r2.get(r6)
            f2.q r8 = (f2.q) r8
            f2.m r9 = r8.k()
            f2.x r10 = f2.u.I
            f.k0 r9 = r9.f3204g
            boolean r9 = r9.c(r10)
            if (r9 == 0) goto L9d4
            r1.add(r8)
        L9d4:
            int r6 = r6 + 1
            goto L9bb
        L9d7:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L9fa
            boolean r2 = oh.h.n(r1)
            if (r2 == 0) goto L9e5
            r4 = 1
            goto L9e9
        L9e5:
            int r4 = r1.size()
        L9e9:
            if (r2 == 0) goto L9f1
            int r1 = r1.size()
        L9ef:
            r13 = 0
            goto L9f3
        L9f1:
            r1 = 1
            goto L9ef
        L9f3:
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r1 = android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(r4, r1, r13, r13)
            r3.setCollectionInfo(r1)
        L9fa:
            oh.h.T(r0, r7)
            f2.m r1 = r0.n()
            f2.x r2 = f2.u.f3243u
            java.lang.Object r1 = f2.t.f(r1, r2)
            f2.j r1 = (f2.j) r1
            f2.m r2 = r0.n()
            f2.x r4 = f2.l.f3181d
            java.lang.Object r2 = f2.t.f(r2, r4)
            f2.a r2 = (f2.a) r2
            r4 = 0
            if (r1 == 0) goto Laa0
            if (r2 == 0) goto Laa0
            f2.m r6 = r0.k()
            f2.x r8 = f2.u.f3228f
            f.k0 r6 = r6.f3204g
            java.lang.Object r6 = r6.g(r8)
            if (r6 != 0) goto La29
            r6 = 0
        La29:
            if (r6 != 0) goto La3f
            f2.m r6 = r0.k()
            f2.x r8 = f2.u.f3227e
            f.k0 r6 = r6.f3204g
            java.lang.Object r6 = r6.g(r8)
            if (r6 != 0) goto La3a
            r6 = 0
        La3a:
            if (r6 == 0) goto La3d
            goto La3f
        La3d:
            r6 = 0
            goto La40
        La3f:
            r6 = 1
        La40:
            if (r6 != 0) goto La47
            java.lang.String r6 = "android.widget.HorizontalScrollView"
            r7.g(r6)
        La47:
            fg.a r6 = r1.f3157b
            java.lang.Object r6 = r6.invoke()
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 <= 0) goto La5b
            r13 = 1
            r3.setScrollable(r13)
        La5b:
            boolean r6 = y1.g0.b(r0)
            if (r6 == 0) goto Laa0
            boolean r6 = y1.z.s(r1)
            u2.m r8 = u2.m.f13355h
            if (r6 == 0) goto La82
            h3.e r6 = h3.e.f5057e
            r7.a(r6)
            r6 = r27
            u2.m r9 = r6.F
            if (r9 != r8) goto La76
            r9 = 1
            goto La77
        La76:
            r9 = 0
        La77:
            if (r9 != 0) goto La7c
            h3.e r9 = h3.e.f5062j
            goto La7e
        La7c:
            h3.e r9 = h3.e.f5060h
        La7e:
            r7.a(r9)
            goto La84
        La82:
            r6 = r27
        La84:
            boolean r1 = y1.z.r(r1)
            if (r1 == 0) goto Laa0
            h3.e r1 = h3.e.f5058f
            r7.a(r1)
            u2.m r1 = r6.F
            if (r1 != r8) goto La95
            r1 = 1
            goto La96
        La95:
            r1 = 0
        La96:
            if (r1 != 0) goto La9b
            h3.e r1 = h3.e.f5060h
            goto La9d
        La9b:
            h3.e r1 = h3.e.f5062j
        La9d:
            r7.a(r1)
        Laa0:
            f2.m r1 = r0.n()
            f2.x r6 = f2.u.f3244v
            java.lang.Object r1 = f2.t.f(r1, r6)
            f2.j r1 = (f2.j) r1
            if (r1 == 0) goto Lb17
            if (r2 == 0) goto Lb17
            f2.m r2 = r0.k()
            f2.x r6 = f2.u.f3228f
            f.k0 r2 = r2.f3204g
            java.lang.Object r2 = r2.g(r6)
            if (r2 != 0) goto Labf
            r2 = 0
        Labf:
            if (r2 != 0) goto Lad5
            f2.m r2 = r0.k()
            f2.x r6 = f2.u.f3227e
            f.k0 r2 = r2.f3204g
            java.lang.Object r2 = r2.g(r6)
            if (r2 != 0) goto Lad0
            r2 = 0
        Lad0:
            if (r2 == 0) goto Lad3
            goto Lad5
        Lad3:
            r2 = 0
            goto Lad6
        Lad5:
            r2 = 1
        Lad6:
            if (r2 != 0) goto Ladd
            java.lang.String r2 = "android.widget.ScrollView"
            r7.g(r2)
        Ladd:
            fg.a r2 = r1.f3157b
            java.lang.Object r2 = r2.invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto Laf1
            r13 = 1
            r3.setScrollable(r13)
        Laf1:
            boolean r2 = y1.g0.b(r0)
            if (r2 == 0) goto Lb17
            boolean r2 = y1.z.s(r1)
            if (r2 == 0) goto Lb07
            h3.e r2 = h3.e.f5057e
            r7.a(r2)
            h3.e r2 = h3.e.f5061i
            r7.a(r2)
        Lb07:
            boolean r1 = y1.z.r(r1)
            if (r1 == 0) goto Lb17
            h3.e r1 = h3.e.f5058f
            r7.a(r1)
            h3.e r1 = h3.e.f5059g
            r7.a(r1)
        Lb17:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto Lb20
            y1.g0.d(r0, r7)
        Lb20:
            f2.m r2 = r0.n()
            f2.x r4 = f2.u.f3226d
            java.lang.Object r2 = f2.t.f(r2, r4)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r4 = 28
            if (r1 < r4) goto Lb34
            h3.c.j(r3, r2)
            goto Lb3d
        Lb34:
            android.os.Bundle r1 = r3.getExtras()
            java.lang.String r4 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY"
            r1.putCharSequence(r4, r2)
        Lb3d:
            boolean r1 = y1.g0.b(r0)
            if (r1 == 0) goto Lc79
            f2.m r1 = r0.n()
            f2.x r2 = f2.l.f3197t
            java.lang.Object r1 = f2.t.f(r1, r2)
            f2.a r1 = (f2.a) r1
            if (r1 == 0) goto Lb5d
            h3.e r2 = new h3.e
            r4 = 262144(0x40000, float:3.67342E-40)
            java.lang.String r1 = r1.f3137a
            r2.<init>(r4, r1)
            r7.a(r2)
        Lb5d:
            f2.m r1 = r0.n()
            f2.x r2 = f2.l.f3198u
            java.lang.Object r1 = f2.t.f(r1, r2)
            f2.a r1 = (f2.a) r1
            if (r1 == 0) goto Lb77
            h3.e r2 = new h3.e
            r4 = 524288(0x80000, float:7.34684E-40)
            java.lang.String r1 = r1.f3137a
            r2.<init>(r4, r1)
            r7.a(r2)
        Lb77:
            f2.m r1 = r0.n()
            f2.x r2 = f2.l.f3199v
            java.lang.Object r1 = f2.t.f(r1, r2)
            f2.a r1 = (f2.a) r1
            if (r1 == 0) goto Lb91
            h3.e r2 = new h3.e
            r4 = 1048576(0x100000, float:1.469368E-39)
            java.lang.String r1 = r1.f3137a
            r2.<init>(r4, r1)
            r7.a(r2)
        Lb91:
            f2.m r1 = r0.n()
            f2.x r2 = f2.l.f3201x
            f.k0 r1 = r1.f3204g
            boolean r1 = r1.c(r2)
            if (r1 == 0) goto Lc79
            f2.m r1 = r0.n()
            java.lang.Object r1 = r1.d(r2)
            java.util.List r1 = (java.util.List) r1
            int r2 = r1.size()
            f.v r4 = y1.z.T
            int r6 = r4.f2916b
            if (r2 >= r6) goto Lc64
            f.t0 r2 = new f.t0
            r2.<init>()
            f.b0 r6 = f.o0.a()
            r8 = r20
            int[] r9 = r8.f2904g
            int r10 = r8.f2906i
            int r9 = g.a.a(r9, r10, r5)
            if (r9 < 0) goto Lbca
            r9 = 1
            goto Lbcb
        Lbca:
            r9 = 0
        Lbcb:
            if (r9 == 0) goto Lc47
            java.lang.Object r9 = r8.b(r5)
            f.b0 r9 = (f.b0) r9
            r10 = 16
            int[] r10 = new int[r10]
            int[] r11 = r4.f2915a
            int r4 = r4.f2916b
            r14 = r10
            r10 = 0
            r13 = 0
        Lbde:
            if (r10 >= r4) goto Lc0c
            r18 = r11[r10]
            r20 = r4
            int r4 = r13 + 1
            r22 = r9
            int r9 = r14.length
            if (r9 >= r4) goto Lbfe
            int r9 = r14.length
            r24 = 3
            int r9 = r9 * 3
            r17 = 2
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r4, r9)
            int[] r9 = java.util.Arrays.copyOf(r14, r9)
            r14 = r9
            goto Lc02
        Lbfe:
            r17 = 2
            r24 = 3
        Lc02:
            r14[r13] = r18
            int r10 = r10 + 1
            r13 = r4
            r4 = r20
            r9 = r22
            goto Lbde
        Lc0c:
            r22 = r9
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r9 = r1.size()
            if (r9 > 0) goto Lc39
            int r1 = r4.size()
            if (r1 > 0) goto Lc22
            r16 = 0
            goto Lc50
        Lc22:
            r9 = 0
            java.lang.Object r0 = r4.get(r9)
            wb.en.n(r0)
            if (r13 > 0) goto Lc34
            java.lang.String r0 = "Index must be between 0 and size"
            okio.a.i(r0)
            r16 = 0
            return r16
        Lc34:
            r16 = 0
            r0 = r14[r9]
            throw r16
        Lc39:
            r9 = 0
            r16 = 0
            java.lang.Object r0 = r1.get(r9)
            wb.en.n(r0)
            r22.getClass()
            throw r16
        Lc47:
            r9 = 0
            r16 = 0
            int r10 = r1.size()
            if (r10 > 0) goto Lc59
        Lc50:
            f.t0 r1 = r12.f22180x
            r1.c(r5, r2)
            r8.c(r5, r6)
            goto Lc79
        Lc59:
            java.lang.Object r0 = r1.get(r9)
            wb.en.n(r0)
            r4.c(r9)
            throw r16
        Lc64:
            r16 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Can't have more than "
            r0.<init>(r1)
            int r1 = r4.f2916b
            java.lang.String r2 = " custom actions for one widget"
            java.lang.String r0 = j8.b.j(r0, r1, r2)
            j8.o.A(r0)
            return r16
        Lc79:
            boolean r1 = y1.g0.c(r0, r15)
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r2 < r4) goto Lc87
            b0.b0.u(r3, r1)
            goto Lc8b
        Lc87:
            r13 = 1
            r7.f(r13, r1)
        Lc8b:
            f.u r1 = r12.H
            int r1 = r1.d(r5)
            r9 = -1
            if (r1 == r9) goto Lcb0
            y1.r0 r2 = r19.getAndroidViewsHandler$ui()
            x2.h r2 = y1.g0.t(r2, r1)
            if (r2 == 0) goto Lca4
            r3.setTraversalBefore(r2)
            r2 = r19
            goto Lca9
        Lca4:
            r2 = r19
            r3.setTraversalBefore(r2, r1)
        Lca9:
            java.lang.String r1 = r12.J
            r6 = 0
            r12.c(r5, r7, r1, r6)
            goto Lcb3
        Lcb0:
            r2 = r19
            r6 = 0
        Lcb3:
            f.u r1 = r12.I
            int r1 = r1.d(r5)
            r9 = -1
            if (r1 == r9) goto Lcce
            y1.r0 r2 = r2.getAndroidViewsHandler$ui()
            x2.h r1 = y1.g0.t(r2, r1)
            if (r1 == 0) goto Lcce
            r3.setTraversalAfter(r1)
            java.lang.String r1 = r12.K
            r12.c(r5, r7, r1, r6)
        Lcce:
            f2.m r0 = r0.n()
            f2.x r1 = f2.v.f3250b
            java.lang.Object r0 = f2.t.f(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Lcdf
            r7.g(r0)
        Lcdf:
            boolean r0 = r12.f22177u
            if (r0 == 0) goto Lcef
            int r0 = r12.f22173q
            if (r5 != r0) goto Lce9
            r12.f22175s = r7
        Lce9:
            int r0 = r12.f22174r
            if (r5 != r0) goto Lcef
            r12.f22176t = r7
        Lcef:
            return r7
        Lcf0:
            ah.a.d()
            r16 = 0
            return r16
        Lcf6:
            r5 = r1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "semanticsNode "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r1 = " has null parent"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            u1.a.c(r0)
            okio.a.c()
            return r16
    }

    @Override // androidx.lifecycle.x
    public final h3.g r(int r3) {
            r2 = this;
            r0 = 1
            y1.z r1 = r2.f22125i
            if (r3 == r0) goto L1a
            r0 = 2
            if (r3 != r0) goto Lf
            int r3 = r1.f22173q
            h3.g r3 = r2.l(r3)
            return r3
        Lf:
            java.lang.String r0 = "Unknown focus type: "
            java.lang.String r3 = eh.a.l(r3, r0)
            j8.o.t(r3)
            r3 = 0
            return r3
        L1a:
            int r3 = r1.f22174r
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r0) goto L22
            r3 = 0
            return r3
        L22:
            h3.g r3 = r2.l(r3)
            return r3
    }
}
