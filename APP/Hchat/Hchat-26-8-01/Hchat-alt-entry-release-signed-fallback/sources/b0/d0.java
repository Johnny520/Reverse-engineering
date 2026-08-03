package b0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d0 implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f355h;

    public /* synthetic */ d0(java.lang.ClassLoader r2) {
            r1 = this;
            r0 = 22
            r1.f354g = r0
            java.util.concurrent.ConcurrentHashMap r0 = j8.d.f6777a
            r1.<init>()
            r1.f355h = r2
            return
    }

    public /* synthetic */ d0(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f354g = r2
            r0.f355h = r1
            r0.<init>()
            return
    }

    public /* synthetic */ d0(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f354g = r2
            r0.f355h = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r46) {
            r45 = this;
            r1 = r45
            r0 = r46
            int r2 = r1.f354g
            r5 = 32
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r8 = 0
            r9 = 2
            r11 = 0
            switch(r2) {
                case 0: goto L9fe;
                case 1: goto L9ea;
                case 2: goto L9de;
                case 3: goto L9c2;
                case 4: goto L9a2;
                case 5: goto L725;
                case 6: goto L707;
                case 7: goto L6df;
                case 8: goto L6b1;
                case 9: goto L6a4;
                case 10: goto L699;
                case 11: goto L68e;
                case 12: goto L682;
                case 13: goto L65e;
                case 14: goto L64f;
                case 15: goto L60d;
                case 16: goto L5f1;
                case 17: goto L5e5;
                case 18: goto L5db;
                case 19: goto L594;
                case 20: goto L552;
                case 21: goto L53b;
                case 22: goto L51b;
                case 23: goto L155;
                case 24: goto L10f;
                case 25: goto L103;
                case 26: goto Leb;
                case 27: goto Ld5;
                case 28: goto Lba;
                default: goto L13;
            }
        L13:
            java.lang.Object r2 = r1.f355h
            n2.g r2 = (n2.g) r2
            n2.g r0 = (n2.g) r0
            if (r2 != r0) goto L1e
            java.lang.String r2 = " > "
            goto L20
        L1e:
            java.lang.String r2 = "   "
        L20:
            java.lang.String r3 = ", newCursorPosition="
            boolean r4 = r0 instanceof n2.a
            r5 = 41
            if (r4 == 0) goto L47
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "CommitTextCommand(text.length="
            r4.<init>(r6)
            n2.a r0 = (n2.a) r0
            i2.g r6 = r0.f8919a
            java.lang.String r6 = r6.f6314h
            int r6 = r6.length()
            r4.append(r6)
            r4.append(r3)
            int r0 = r0.f8920b
        L41:
            java.lang.String r0 = p.a.n(r4, r0, r5)
            goto Lb5
        L47:
            boolean r4 = r0 instanceof n2.q
            if (r4 == 0) goto L65
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "SetComposingTextCommand(text.length="
            r4.<init>(r6)
            n2.q r0 = (n2.q) r0
            i2.g r6 = r0.f8972a
            java.lang.String r6 = r6.f6314h
            int r6 = r6.length()
            r4.append(r6)
            r4.append(r3)
            int r0 = r0.f8973b
            goto L41
        L65:
            boolean r3 = r0 instanceof n2.p
            if (r3 == 0) goto L70
            n2.p r0 = (n2.p) r0
            java.lang.String r0 = r0.toString()
            goto Lb5
        L70:
            boolean r3 = r0 instanceof n2.e
            if (r3 == 0) goto L7b
            n2.e r0 = (n2.e) r0
            java.lang.String r0 = r0.toString()
            goto Lb5
        L7b:
            boolean r3 = r0 instanceof n2.f
            if (r3 == 0) goto L86
            n2.f r0 = (n2.f) r0
            java.lang.String r0 = r0.toString()
            goto Lb5
        L86:
            boolean r3 = r0 instanceof n2.r
            if (r3 == 0) goto L91
            n2.r r0 = (n2.r) r0
            java.lang.String r0 = r0.toString()
            goto Lb5
        L91:
            boolean r3 = r0 instanceof n2.h
            if (r3 == 0) goto L98
            java.lang.String r0 = "FinishComposingTextCommand()"
            goto Lb5
        L98:
            boolean r3 = r0 instanceof n2.d
            if (r3 == 0) goto L9f
            java.lang.String r0 = "DeleteAllCommand()"
            goto Lb5
        L9f:
            java.lang.Class r0 = r0.getClass()
            gg.f r0 = gg.v.a(r0)
            java.lang.String r0 = r0.c()
            if (r0 != 0) goto Laf
            java.lang.String r0 = "{anonymous EditCommand}"
        Laf:
            java.lang.String r3 = "Unknown EditCommand: "
            java.lang.String r0 = r3.concat(r0)
        Lb5:
            java.lang.String r0 = r2.concat(r0)
            return r0
        Lba:
            java.lang.Object r2 = r1.f355h
            m2.e r2 = (m2.e) r2
            m2.q r0 = (m2.q) r0
            m2.k r5 = r0.f8707b
            int r6 = r0.f8708c
            int r7 = r0.f8709d
            java.lang.Object r8 = r0.f8710e
            m2.q r3 = new m2.q
            r4 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            m2.r r0 = r2.a(r3)
            java.lang.Object r0 = r0.f8711g
            return r0
        Ld5:
            java.lang.Object r2 = r1.f355h
            m.o2 r2 = (m.o2) r2
            e1.b r0 = (e1.b) r0
            m.u1 r3 = r2.f8315k
            long r4 = r0.f2294a
            int r0 = r2.f8314j
            long r2 = r2.c(r3, r4, r0)
            e1.b r0 = new e1.b
            r0.<init>(r2)
            return r0
        Leb:
            java.lang.Object r2 = r1.f355h
            c9.q0 r2 = (c9.q0) r2
            s1.t r0 = (s1.t) r0
            long r3 = s1.s.h(r0, r11)
            e1.b r5 = new e1.b
            r5.<init>(r3)
            r2.invoke(r0, r5)
            r0.a()
            sf.n r0 = sf.n.f12433a
            return r0
        L103:
            java.lang.Object r2 = r1.f355h
            w.t0 r2 = (w.t0) r2
            s1.t r0 = (s1.t) r0
            r2.invoke()
            sf.n r0 = sf.n.f12433a
            return r0
        L10f:
            java.lang.Object r2 = r1.f355h
            k.w1 r2 = (k.w1) r2
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            i0.g1 r3 = r2.f7093a
            int r4 = r3.g()
            float r4 = (float) r4
            float r4 = r4 + r0
            float r5 = r2.f7098f
            float r4 = r4 + r5
            i0.g1 r5 = r2.f7097e
            int r5 = r5.g()
            float r5 = (float) r5
            float r5 = r9.e0.q(r4, r8, r5)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L135
            r10 = 1
            goto L136
        L135:
            r10 = r11
        L136:
            int r4 = r3.g()
            float r4 = (float) r4
            float r5 = r5 - r4
            int r4 = java.lang.Math.round(r5)
            int r6 = r3.g()
            int r6 = r6 + r4
            r3.h(r6)
            float r3 = (float) r4
            float r3 = r5 - r3
            r2.f7098f = r3
            if (r10 != 0) goto L150
            r0 = r5
        L150:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L155:
            java.lang.Object r2 = r1.f355h
            k.s r2 = (k.s) r2
            c1.d r0 = (c1.d) r0
            float r13 = r2.f7059x
            float r14 = r0.d()
            float r14 = r14 * r13
            int r13 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r13 < 0) goto L50f
            c1.a r13 = r0.f979g
            long r13 = r13.a()
            float r13 = e1.e.b(r13)
            int r13 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r13 <= 0) goto L50f
            float r13 = r2.f7059x
            boolean r8 = u2.f.b(r13, r8)
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L180
            r8 = r13
            goto L18d
        L180:
            float r8 = r2.f7059x
            float r14 = r0.d()
            float r14 = r14 * r8
            double r14 = (double) r14
            double r14 = java.lang.Math.ceil(r14)
            float r8 = (float) r14
        L18d:
            c1.a r14 = r0.f979g
            long r14 = r14.a()
            float r14 = e1.e.b(r14)
            float r9 = (float) r9
            float r14 = r14 / r9
            double r14 = (double) r14
            double r14 = java.lang.Math.ceil(r14)
            float r14 = (float) r14
            float r16 = java.lang.Math.min(r8, r14)
            float r8 = r16 / r9
            int r14 = java.lang.Float.floatToRawIntBits(r8)
            long r14 = (long) r14
            r17 = 0
            int r3 = java.lang.Float.floatToRawIntBits(r8)
            long r3 = (long) r3
            long r14 = r14 << r5
            long r3 = r3 & r6
            long r22 = r14 | r3
            c1.a r3 = r0.f979g
            long r3 = r3.a()
            long r3 = r3 >> r5
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            float r3 = r3 - r16
            c1.a r4 = r0.f979g
            long r14 = r4.a()
            long r14 = r14 & r6
            int r4 = (int) r14
            float r4 = java.lang.Float.intBitsToFloat(r4)
            float r4 = r4 - r16
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            long r14 = (long) r3
            int r3 = java.lang.Float.floatToRawIntBits(r4)
            long r3 = (long) r3
            long r14 = r14 << r5
            long r3 = r3 & r6
            long r24 = r14 | r3
            float r27 = r16 * r9
            c1.a r3 = r0.f979g
            long r3 = r3.a()
            float r3 = e1.e.b(r3)
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 <= 0) goto L1f1
            r3 = 1
            goto L1f2
        L1f1:
            r3 = r11
        L1f2:
            v.d r4 = r2.f7061z
            c1.a r9 = r0.f979g
            long r14 = r9.a()
            c1.a r9 = r0.f979g
            u2.m r9 = r9.getLayoutDirection()
            f1.c0 r4 = r4.a(r14, r9, r0)
            boolean r9 = r4 instanceof f1.j0
            if (r9 == 0) goto L429
            f1.t0 r8 = r2.f7060y
            f1.j0 r4 = (f1.j0) r4
            f1.j r9 = r4.f3071f
            if (r3 == 0) goto L21d
            c9.i r2 = new c9.i
            r3 = 26
            r2.<init>(r4, r3, r8)
            androidx.lifecycle.x r12 = r0.e(r2)
            goto L51a
        L21d:
            if (r8 == 0) goto L22f
            long r14 = r8.f3121a
            long r13 = f1.w.b(r14, r13)
            f1.n r3 = new f1.n
            r15 = 5
            r3.<init>(r13, r15)
            r21 = r3
            r3 = 1
            goto L232
        L22f:
            r3 = r11
            r21 = 0
        L232:
            e1.c r13 = r9.e()
            float r14 = r13.f2297b
            float r15 = r13.f2296a
            r19 = r5
            k.p r5 = r2.f7058w
            if (r5 != 0) goto L247
            k.p r5 = new k.p
            r5.<init>()
            r2.f7058w = r5
        L247:
            k.p r5 = r2.f7058w
            r5.getClass()
            r34 = r6
            f1.j r6 = r5.f7033d
            if (r6 != 0) goto L258
            f1.j r6 = f1.l.a()
            r5.f7033d = r6
        L258:
            r6.h()
            f1.j.b(r6, r13)
            r6.g(r6, r9, r11)
            gg.u r5 = new gg.u
            r5.<init>()
            float r7 = r13.f2298c
            float r7 = r7 - r15
            double r11 = (double) r7
            double r11 = java.lang.Math.ceil(r11)
            float r7 = (float) r11
            int r7 = (int) r7
            float r9 = r13.f2299d
            float r9 = r9 - r14
            double r11 = (double) r9
            double r11 = java.lang.Math.ceil(r11)
            float r9 = (float) r11
            int r9 = (int) r9
            long r11 = (long) r7
            long r11 = r11 << r19
            r16 = r11
            long r10 = (long) r9
            long r9 = r10 & r34
            long r9 = r16 | r9
            k.p r2 = r2.f7058w
            r2.getClass()
            f1.g r11 = r2.f7030a
            f1.b r12 = r2.f7031b
            if (r11 == 0) goto L29b
            int r7 = r11.a()
            r16 = r6
            f1.f0 r6 = new f1.f0
            r6.<init>(r7)
            goto L29e
        L29b:
            r16 = r6
            r6 = 0
        L29e:
            if (r6 != 0) goto L2a1
            goto L2a6
        L2a1:
            int r6 = r6.f3054a
            if (r6 != 0) goto L2a6
            goto L2bd
        L2a6:
            if (r11 == 0) goto L2b2
            int r6 = r11.a()
            f1.f0 r7 = new f1.f0
            r7.<init>(r6)
            goto L2b3
        L2b2:
            r7 = 0
        L2b3:
            if (r7 != 0) goto L2b6
            goto L2ba
        L2b6:
            int r6 = r7.f3054a
            if (r3 == r6) goto L2bd
        L2ba:
            r28 = 0
            goto L2bf
        L2bd:
            r28 = 1
        L2bf:
            if (r11 == 0) goto L2f7
            if (r12 == 0) goto L2f7
            c1.a r6 = r0.f979g
            long r6 = r6.a()
            long r6 = r6 >> r19
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            android.graphics.Bitmap r7 = r11.f3055a
            r17 = r6
            int r6 = r7.getWidth()
            float r6 = (float) r6
            int r6 = (r17 > r6 ? 1 : (r17 == r6 ? 0 : -1))
            if (r6 > 0) goto L2f7
            c1.a r6 = r0.f979g
            long r17 = r6.a()
            r20 = r7
            long r6 = r17 & r34
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            int r7 = r20.getHeight()
            float r7 = (float) r7
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 > 0) goto L2f7
            if (r28 != 0) goto L309
        L2f7:
            long r6 = r9 >> r19
            int r6 = (int) r6
            long r11 = r9 & r34
            int r7 = (int) r11
            f1.g r11 = f1.c0.e(r6, r7, r3)
            r2.f7030a = r11
            f1.b r12 = f1.c0.a(r11)
            r2.f7031b = r12
        L309:
            h1.b r3 = r2.f7032c
            if (r3 != 0) goto L314
            h1.b r3 = new h1.b
            r3.<init>()
            r2.f7032c = r3
        L314:
            b5.c r2 = r3.f5038h
            h1.a r6 = r3.f5037g
            r17 = r8
            long r7 = r9.e0.q0(r9)
            r36 = r3
            c1.a r3 = r0.f979g
            u2.m r3 = r3.getLayoutDirection()
            r22 = r9
            u2.c r9 = r6.f5033a
            u2.m r10 = r6.f5034b
            r18 = r13
            f1.u r13 = r6.f5035c
            r24 = r10
            r20 = r11
            long r10 = r6.f5036d
            r6.f5033a = r0
            r6.f5034b = r3
            r6.f5035c = r12
            r6.f5036d = r7
            r12.e()
            long r37 = f1.w.f3126b
            r42 = 0
            r43 = 58
            r41 = 0
            r39 = r7
            h1.d.Z(r36, r37, r39, r41, r42, r43)
            float r3 = -r15
            float r7 = -r14
            java.lang.Object r8 = r2.f469a
            androidx.lifecycle.x r8 = (androidx.lifecycle.x) r8
            r8.c0(r3, r7)
            f1.j r4 = r4.f3071f     // Catch: java.lang.Throwable -> L411
            h1.g r32 = new h1.g     // Catch: java.lang.Throwable -> L411
            r30 = 0
            r31 = 30
            r28 = 0
            r29 = 0
            r26 = r32
            r26.<init>(r27, r28, r29, r30, r31)     // Catch: java.lang.Throwable -> L411
            r33 = 52
            r31 = 0
            r29 = r4
            r30 = r17
            r28 = r36
            h1.d.s0(r28, r29, r30, r31, r32, r33)     // Catch: java.lang.Throwable -> L411
            long r14 = r36.a()     // Catch: java.lang.Throwable -> L411
            long r14 = r14 >> r19
            int r4 = (int) r14     // Catch: java.lang.Throwable -> L411
            float r4 = java.lang.Float.intBitsToFloat(r4)     // Catch: java.lang.Throwable -> L411
            r8 = 1
            float r8 = (float) r8     // Catch: java.lang.Throwable -> L411
            float r4 = r4 + r8
            long r14 = r36.a()     // Catch: java.lang.Throwable -> L411
            long r14 = r14 >> r19
            int r14 = (int) r14     // Catch: java.lang.Throwable -> L411
            float r14 = java.lang.Float.intBitsToFloat(r14)     // Catch: java.lang.Throwable -> L411
            float r4 = r4 / r14
            long r14 = r36.a()     // Catch: java.lang.Throwable -> L411
            long r14 = r14 & r34
            int r14 = (int) r14     // Catch: java.lang.Throwable -> L411
            float r14 = java.lang.Float.intBitsToFloat(r14)     // Catch: java.lang.Throwable -> L411
            float r14 = r14 + r8
            long r25 = r36.a()     // Catch: java.lang.Throwable -> L411
            r46 = r14
            long r14 = r25 & r34
            int r8 = (int) r14     // Catch: java.lang.Throwable -> L411
            float r8 = java.lang.Float.intBitsToFloat(r8)     // Catch: java.lang.Throwable -> L411
            float r14 = r46 / r8
            r46 = r0
            long r0 = r36.I0()     // Catch: java.lang.Throwable -> L411
            r25 = r10
            long r10 = r2.v()     // Catch: java.lang.Throwable -> L411
            f1.u r8 = r2.p()     // Catch: java.lang.Throwable -> L411
            r8.e()     // Catch: java.lang.Throwable -> L411
            java.lang.Object r8 = r2.f469a     // Catch: java.lang.Throwable -> L413
            androidx.lifecycle.x r8 = (androidx.lifecycle.x) r8     // Catch: java.lang.Throwable -> L413
            r8.S(r4, r14, r0)     // Catch: java.lang.Throwable -> L413
            r32 = 0
            r33 = 28
            r31 = 0
            r29 = r16
            r28 = r36
            h1.d.s0(r28, r29, r30, r31, r32, r33)     // Catch: java.lang.Throwable -> L413
            f1.u r0 = r2.p()     // Catch: java.lang.Throwable -> L411
            r0.p()     // Catch: java.lang.Throwable -> L411
            r2.U(r10)     // Catch: java.lang.Throwable -> L411
            java.lang.Object r0 = r2.f469a
            androidx.lifecycle.x r0 = (androidx.lifecycle.x) r0
            float r1 = -r3
            float r2 = -r7
            r0.c0(r1, r2)
            r12.p()
            r6.f5033a = r9
            r0 = r24
            r6.f5034b = r0
            r6.f5035c = r13
            r0 = r25
            r6.f5036d = r0
            r11 = r20
            android.graphics.Bitmap r0 = r11.f3055a
            r0.prepareToDraw()
            r5.f4564g = r11
            hb.c0 r16 = new hb.c0
            r17 = r18
            r19 = r22
            r18 = r5
            r16.<init>(r17, r18, r19, r21)
            r0 = r46
            r1 = r16
            androidx.lifecycle.x r12 = r0.e(r1)
            goto L51a
        L411:
            r0 = move-exception
            goto L41f
        L413:
            r0 = move-exception
            f1.u r1 = r2.p()     // Catch: java.lang.Throwable -> L411
            r1.p()     // Catch: java.lang.Throwable -> L411
            r2.U(r10)     // Catch: java.lang.Throwable -> L411
            throw r0     // Catch: java.lang.Throwable -> L411
        L41f:
            java.lang.Object r1 = r2.f469a
            androidx.lifecycle.x r1 = (androidx.lifecycle.x) r1
            float r2 = -r3
            float r3 = -r7
            r1.c0(r2, r3)
            throw r0
        L429:
            boolean r1 = r4 instanceof f1.l0
            if (r1 == 0) goto L4cf
            f1.t0 r1 = r2.f7060y
            f1.l0 r4 = (f1.l0) r4
            e1.d r4 = r4.f3074f
            boolean r5 = be.h.D(r4)
            if (r5 == 0) goto L460
            long r4 = r4.f2304e
            h1.g r15 = new h1.g
            r19 = 0
            r20 = 30
            r17 = 0
            r18 = 0
            r15.<init>(r16, r17, r18, r19, r20)
            k.r r2 = new k.r
            r17 = r1
            r18 = r4
            r20 = r8
            r26 = r15
            r21 = r16
            r15 = r2
            r16 = r3
            r15.<init>(r16, r17, r18, r20, r21, r22, r24, r26)
            androidx.lifecycle.x r12 = r0.e(r15)
            goto L51a
        L460:
            r44 = r3
            r3 = r1
            r1 = r16
            r16 = r44
            k.p r5 = r2.f7058w
            if (r5 != 0) goto L472
            k.p r5 = new k.p
            r5.<init>()
            r2.f7058w = r5
        L472:
            k.p r2 = r2.f7058w
            r2.getClass()
            f1.j r5 = r2.f7033d
            if (r5 != 0) goto L481
            f1.j r5 = f1.l.a()
            r2.f7033d = r5
        L481:
            r5.h()
            f1.j.c(r5, r4)
            if (r16 != 0) goto L4c3
            f1.j r2 = f1.l.a()
            float r6 = r4.f2302c
            float r7 = r4.f2300a
            float r6 = r6 - r7
            float r18 = r6 - r1
            float r6 = r4.f2303d
            float r7 = r4.f2301b
            float r6 = r6 - r7
            float r19 = r6 - r1
            long r6 = r4.f2304e
            long r20 = k.n.t(r6, r1)
            long r6 = r4.f2305f
            long r22 = k.n.t(r6, r1)
            long r6 = r4.f2307h
            long r26 = k.n.t(r6, r1)
            long r6 = r4.f2306g
            long r24 = k.n.t(r6, r1)
            e1.d r15 = new e1.d
            r17 = r1
            r16 = r1
            r15.<init>(r16, r17, r18, r19, r20, r22, r24, r26)
            f1.j.c(r2, r15)
            r1 = 0
            r5.g(r5, r2, r1)
        L4c3:
            c9.i r1 = new c9.i
            r2 = 25
            r1.<init>(r5, r2, r3)
            androidx.lifecycle.x r12 = r0.e(r1)
            goto L51a
        L4cf:
            r1 = r16
            r16 = r3
            boolean r3 = r4 instanceof f1.k0
            if (r3 == 0) goto L50a
            f1.t0 r5 = r2.f7060y
            if (r16 == 0) goto L4de
            r6 = r17
            goto L4e0
        L4de:
            r6 = r22
        L4e0:
            if (r16 == 0) goto L4e8
            c1.a r2 = r0.f979g
            long r24 = r2.a()
        L4e8:
            r8 = r24
            if (r16 == 0) goto L4f0
            h1.f r1 = h1.f.f5043b
            r10 = r1
            goto L500
        L4f0:
            h1.g r15 = new h1.g
            r19 = 0
            r20 = 30
            r17 = 0
            r18 = 0
            r16 = r1
            r15.<init>(r16, r17, r18, r19, r20)
            r10 = r15
        L500:
            k.q r4 = new k.q
            r4.<init>(r5, r6, r8, r10)
            androidx.lifecycle.x r12 = r0.e(r4)
            goto L51a
        L50a:
            okio.a.k()
            r12 = 0
            goto L51a
        L50f:
            i2.z r1 = new i2.z
            r2 = 13
            r1.<init>(r2)
            androidx.lifecycle.x r12 = r0.e(r1)
        L51a:
            return r12
        L51b:
            java.lang.Object r2 = r1.f355h
            java.lang.ClassLoader r2 = (java.lang.ClassLoader) r2
            hh.o r0 = (hh.o) r0
            r0.getClass()
            java.lang.reflect.Method r0 = r0.r(r2)     // Catch: java.lang.Throwable -> L529
            goto L530
        L529:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L530:
            boolean r2 = r0 instanceof sf.f
            if (r2 == 0) goto L537
            r12 = 0
            goto L538
        L537:
            r12 = r0
        L538:
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            return r12
        L53b:
            java.lang.Object r2 = r1.f355h
            ia.a0 r2 = (ia.a0) r2
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L54f
            ab.b r0 = r2.f6541d
            java.lang.String r2 = "朋友圈伪互动待清理缓存恢复失败"
            r3 = 0
            r0.invoke(r2, r3)
        L54f:
            sf.n r0 = sf.n.f12433a
            return r0
        L552:
            java.lang.Object r2 = r1.f355h
            i0.f2 r2 = (i0.f2) r2
            sg.p r3 = r2.f5886l
            r3.getClass()
            sg.p r4 = r2.f5886l
            boolean r3 = gg.l.a(r4, r3)
            if (r3 != 0) goto L568
            java.lang.String r3 = "Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions"
            i0.n1.b(r3)
        L568:
            f.l0 r3 = r2.f5885k
            java.lang.Object r4 = r2.f5883i
            if (r3 != 0) goto L586
            if (r4 != 0) goto L573
            r2.f5883i = r0
            goto L591
        L573:
            f.l0 r3 = f.s0.f2899a
            f.l0 r3 = new f.l0
            r3.<init>()
            r3.a(r4)
            r3.a(r0)
            r2.f5885k = r3
            r3 = 0
            r2.f5883i = r3
            goto L591
        L586:
            if (r4 != 0) goto L589
            goto L58e
        L589:
            java.lang.String r2 = "workingSoleWatchedObject must be null when workingWatchSet is non-null"
            i0.n1.b(r2)
        L58e:
            r3.a(r0)
        L591:
            sf.n r0 = sf.n.f12433a
            return r0
        L594:
            java.lang.Object r2 = r1.f355h
            i0.y1 r2 = (i0.y1) r2
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.String r3 = "Recomposer effect job completed"
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            r4.<init>(r3)
            r4.initCause(r0)
            java.lang.Object r3 = r2.f6098c
            monitor-enter(r3)
            qg.r0 r5 = r2.f6099d     // Catch: java.lang.Throwable -> L5c6
            if (r5 == 0) goto L5c8
            tg.b0 r6 = r2.f6116u     // Catch: java.lang.Throwable -> L5c6
            i0.u1 r7 = i0.u1.f6051h     // Catch: java.lang.Throwable -> L5c6
            r6.getClass()     // Catch: java.lang.Throwable -> L5c6
            r8 = 0
            r6.h(r8, r7)     // Catch: java.lang.Throwable -> L5c6
            r5.a(r4)     // Catch: java.lang.Throwable -> L5c6
            r2.f6113r = r8     // Catch: java.lang.Throwable -> L5c6
            c9.i r4 = new c9.i     // Catch: java.lang.Throwable -> L5c6
            r6 = 22
            r4.<init>(r2, r6, r0)     // Catch: java.lang.Throwable -> L5c6
            r5.o(r4)     // Catch: java.lang.Throwable -> L5c6
            goto L5d5
        L5c6:
            r0 = move-exception
            goto L5d9
        L5c8:
            r2.f6100e = r4     // Catch: java.lang.Throwable -> L5c6
            tg.b0 r0 = r2.f6116u     // Catch: java.lang.Throwable -> L5c6
            i0.u1 r2 = i0.u1.f6050g     // Catch: java.lang.Throwable -> L5c6
            r0.getClass()     // Catch: java.lang.Throwable -> L5c6
            r8 = 0
            r0.h(r8, r2)     // Catch: java.lang.Throwable -> L5c6
        L5d5:
            monitor-exit(r3)
            sf.n r0 = sf.n.f12433a
            return r0
        L5d9:
            monitor-exit(r3)
            throw r0
        L5db:
            java.lang.Object r2 = r1.f355h
            i0.q r2 = (i0.q) r2
            r2.y(r0)
            sf.n r0 = sf.n.f12433a
            return r0
        L5e5:
            java.lang.Object r2 = r1.f355h
            i.k1 r2 = (i.k1) r2
            i0.a0 r0 = (i0.a0) r0
            b0.m r0 = new b0.m
            r0.<init>(r2, r9)
            return r0
        L5f1:
            java.lang.Object r2 = r1.f355h
            fg.p r2 = (fg.p) r2
            i.m1 r3 = i.d.f5628j
            i.j r0 = (i.j) r0
            i0.j1 r4 = r0.f5698e
            java.lang.Object r4 = r4.getValue()
            fg.l r3 = r3.f5731b
            i.q r0 = r0.f5699f
            java.lang.Object r0 = r3.invoke(r0)
            r2.invoke(r4, r0)
            sf.n r0 = sf.n.f12433a
            return r0
        L60d:
            java.lang.Object r2 = r1.f355h
            r8 = r2
            h0.q0 r8 = (h0.q0) r8
            s1.t r0 = (s1.t) r0
            long r10 = r0.f12293c
            java.lang.Object r2 = r8.f4972d
            h0.d1 r2 = (h0.d1) r2
            boolean r3 = r2.k()
            if (r3 == 0) goto L646
            n2.s r3 = r2.n()
            i2.g r3 = r3.f8976a
            java.lang.String r3 = r3.f6314h
            int r3 = r3.length()
            if (r3 != 0) goto L62f
            goto L646
        L62f:
            w.q0 r3 = r2.f4850d
            if (r3 == 0) goto L646
            w.m1 r3 = r3.d()
            if (r3 != 0) goto L63a
            goto L646
        L63a:
            n2.s r9 = r2.n()
            r12 = 0
            g1.d r13 = h0.w.f5009d
            r8.f(r9, r10, r12, r13)
            r10 = 1
            goto L647
        L646:
            r10 = 0
        L647:
            if (r10 == 0) goto L64c
            r0.a()
        L64c:
            sf.n r0 = sf.n.f12433a
            return r0
        L64f:
            java.lang.Object r2 = r1.f355h
            t7.b r2 = (t7.b) r2
            fb.l0 r0 = (fb.l0) r0
            r0.getClass()
            fb.k0 r3 = new fb.k0
            r3.<init>(r2, r0)
            return r3
        L65e:
            java.lang.Object r2 = r1.f355h
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            java.lang.String r3 = ""
            java.lang.String r0 = r2.optString(r0, r3)
            r0.getClass()
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            boolean r2 = og.m.t0(r0)
            if (r2 != 0) goto L680
            r12 = r0
            goto L681
        L680:
            r12 = 0
        L681:
            return r12
        L682:
            java.lang.Object r2 = r1.f355h
            f0.v r2 = (f0.v) r2
            n2.g r0 = (n2.g) r0
            r2.a(r0)
            sf.n r0 = sf.n.f12433a
            return r0
        L68e:
            java.lang.Object r2 = r1.f355h
            h.Hchat.hooks.items.script.ScriptWaBridge r2 = (h.Hchat.hooks.items.script.ScriptWaBridge) r2
            og.f r0 = (og.f) r0
            java.lang.CharSequence r0 = h.Hchat.hooks.items.script.ScriptWaBridge.D(r2, r0)
            return r0
        L699:
            java.lang.Object r2 = r1.f355h
            h.Hchat.hooks.items.script.ScriptPluginBridge r2 = (h.Hchat.hooks.items.script.ScriptPluginBridge) r2
            java.lang.String r0 = (java.lang.String) r0
            sf.n r0 = h.Hchat.hooks.items.script.ScriptAudioBridge.e(r2, r0)
            return r0
        L6a4:
            java.lang.Object r2 = r1.f355h
            d0.c r2 = (d0.c) r2
            i0.a0 r0 = (i0.a0) r0
            b0.m r0 = new b0.m
            r7 = 1
            r0.<init>(r2, r7)
            return r0
        L6b1:
            java.lang.Object r2 = r1.f355h
            android.view.ViewParent r2 = (android.view.ViewParent) r2
            i0.a0 r0 = (i0.a0) r0
            r0.getClass()
            boolean r0 = r2 instanceof y2.t
            if (r0 == 0) goto L6c2
            r0 = r2
            y2.t r0 = (y2.t) r0
            goto L6c3
        L6c2:
            r0 = 0
        L6c3:
            if (r0 == 0) goto L6c8
            android.view.Window r12 = r0.f22252p
            goto L6c9
        L6c8:
            r12 = 0
        L6c9:
            if (r12 == 0) goto L6cf
            r2 = 0
            r12.setWindowAnimations(r2)
        L6cf:
            if (r12 == 0) goto L6d4
            r12.setDimAmount(r8)
        L6d4:
            if (r12 == 0) goto L6d9
            r12.clearFlags(r9)
        L6d9:
            ci.r0 r0 = new ci.r0
            r0.<init>()
            return r0
        L6df:
            java.lang.Object r2 = r1.f355h
            ci.n0 r2 = (ci.n0) r2
            f1.d0 r0 = (f1.d0) r0
            r0.getClass()
            i.c r2 = r2.f1762w
            java.lang.Object r3 = r2.d()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            r0.q(r3)
            java.lang.Object r2 = r2.d()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r0.i(r2)
            sf.n r0 = sf.n.f12433a
            return r0
        L707:
            java.lang.Object r2 = r1.f355h
            ci.e0 r2 = (ci.e0) r2
            f1.d0 r0 = (f1.d0) r0
            r0.getClass()
            boolean r3 = r2.f1695w
            float r2 = r2.C
            if (r3 == 0) goto L71b
            r0.g(r2)
        L719:
            r7 = 1
            goto L71f
        L71b:
            r0.s(r2)
            goto L719
        L71f:
            r0.r(r7)
            sf.n r0 = sf.n.f12433a
            return r0
        L725:
            r17 = 0
            java.lang.Object r2 = r1.f355h
            ca.e0 r2 = (ca.e0) r2
            r3 = r0
            hb.t r3 = (hb.t) r3
            java.lang.String r4 = ""
            r3.getClass()
            k8.t r0 = r3.f5470g
            if (r0 == 0) goto L73a
            java.lang.String r0 = r0.f7477f
            goto L73b
        L73a:
            r0 = 0
        L73b:
            if (r0 != 0) goto L740
            r30 = r4
            goto L742
        L740:
            r30 = r0
        L742:
            b5.c r2 = r2.f1496p
            java.lang.Object r0 = r2.f470b
            r5 = r0
            ab.b r5 = (ab.b) r5
            long r10 = r3.f5464a
            int r0 = r3.f5465b
            r6 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r6
            r6 = 3
            if (r0 == r6) goto L75a
        L754:
            r19 = r4
            r3 = 0
            r9 = 0
            goto L969
        L75a:
            java.lang.Object r0 = r2.f471c
            java.lang.Object r0 = r0.getValue()
            r8 = r0
            ca.b r8 = (ca.b) r8
            if (r8 == 0) goto L965
            java.lang.reflect.Method r12 = r8.f1463b
            java.lang.reflect.Method r13 = r8.f1464c
            java.lang.Class[] r0 = r12.getParameterTypes()
            r0.getClass()
            r14 = 0
            java.lang.Object r0 = tf.l.C0(r14, r0)
            java.lang.Class<java.lang.String> r14 = java.lang.String.class
            boolean r0 = gg.l.a(r0, r14)
            if (r0 != 0) goto L79c
            java.lang.String r0 = r12.toGenericString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "聊天实况图片查询方法参数不兼容: msgId="
            r2.<init>(r3)
            r2.append(r10)
            java.lang.String r3 = " method="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r3 = 0
            r5.invoke(r0, r3)
            goto L754
        L79c:
            java.lang.Class[] r0 = r13.getParameterTypes()
            r28 = 0
            r14 = r0[r28]
            java.lang.Object r0 = r3.f5474k
            if (r0 == 0) goto L7b6
            r14.getClass()
            boolean r15 = r14.isInstance(r0)
            if (r15 == 0) goto L7b2
            goto L7b3
        L7b2:
            r0 = 0
        L7b3:
            if (r0 == 0) goto L7b6
            goto L7e0
        L7b6:
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r0 = h.Hchat.hooks.api.core.WeChatApis.database()     // Catch: java.lang.Throwable -> L7c1
            if (r0 == 0) goto L7c3
            java.lang.Object r0 = r0.nativeMessageById(r10)     // Catch: java.lang.Throwable -> L7c1
            goto L7c4
        L7c1:
            r0 = move-exception
            goto L7c6
        L7c3:
            r0 = 0
        L7c4:
            r15 = r0
            goto L7cb
        L7c6:
            sf.f r15 = new sf.f
            r15.<init>(r0)
        L7cb:
            boolean r0 = r15 instanceof sf.f
            if (r0 == 0) goto L7d0
            r15 = 0
        L7d0:
            if (r15 == 0) goto L7dc
            r14.getClass()
            boolean r0 = r14.isInstance(r15)
            if (r0 == 0) goto L7dc
            goto L7dd
        L7dc:
            r15 = 0
        L7dd:
            if (r15 == 0) goto L965
            r0 = r15
        L7e0:
            java.lang.String r14 = "getMsgId"
            java.lang.String r15 = "getMsgID"
            java.lang.String r7 = "getId"
            java.lang.String[] r7 = new java.lang.String[]{r14, r15, r7}
            r14 = 0
        L7eb:
            if (r14 < r6) goto L828
            java.lang.String r6 = "field_msgId"
            java.lang.String r7 = "msgId"
            java.lang.String r14 = "msgID"
            java.lang.String r15 = "id"
            java.lang.String[] r15 = new java.lang.String[]{r6, r7, r14, r15}
            r6 = 0
        L7fa:
            r7 = 4
            if (r6 < r7) goto L800
            r6 = r17
            goto L84f
        L800:
            r7 = r15[r6]
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.readField(r0, r7)
            boolean r14 = r7 instanceof java.lang.Number
            if (r14 == 0) goto L80d
            java.lang.Number r7 = (java.lang.Number) r7
            goto L80e
        L80d:
            r7 = 0
        L80e:
            if (r7 == 0) goto L825
            long r21 = r7.longValue()
            java.lang.Long r7 = java.lang.Long.valueOf(r21)
            int r14 = (r21 > r17 ? 1 : (r21 == r17 ? 0 : -1))
            if (r14 <= 0) goto L81d
            goto L81e
        L81d:
            r7 = 0
        L81e:
            if (r7 == 0) goto L825
            long r6 = r7.longValue()
            goto L84f
        L825:
            int r6 = r6 + 1
            goto L7fa
        L828:
            r15 = r7[r14]
            r6 = 0
            java.lang.Object[] r9 = new java.lang.Object[r6]
            java.lang.Object r6 = h.Hchat.utils.KavaReflector.invokeMethod(r0, r15, r9)
            boolean r9 = r6 instanceof java.lang.Number
            if (r9 == 0) goto L838
            java.lang.Number r6 = (java.lang.Number) r6
            goto L839
        L838:
            r6 = 0
        L839:
            if (r6 == 0) goto L958
            long r21 = r6.longValue()
            java.lang.Long r6 = java.lang.Long.valueOf(r21)
            int r9 = (r21 > r17 ? 1 : (r21 == r17 ? 0 : -1))
            if (r9 <= 0) goto L848
            goto L849
        L848:
            r6 = 0
        L849:
            if (r6 == 0) goto L958
            long r6 = r6.longValue()
        L84f:
            java.lang.Long r9 = java.lang.Long.valueOf(r6)
            int r6 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r6 <= 0) goto L858
            goto L859
        L858:
            r9 = 0
        L859:
            if (r9 == 0) goto L860
            long r6 = r9.longValue()
            goto L861
        L860:
            r6 = r10
        L861:
            java.lang.String r9 = "getTalker"
            java.lang.String r15 = "talker"
            java.lang.String[] r9 = new java.lang.String[]{r9, r15}
            r19 = r4
            r14 = 0
        L86c:
            r4 = 2
            if (r14 < r4) goto L8a3
            java.lang.String r9 = "field_talker"
            java.lang.String[] r21 = new java.lang.String[]{r9, r15}
            r9 = 0
        L876:
            if (r9 < r4) goto L87b
            r14 = r19
            goto L8cf
        L87b:
            r14 = r21[r9]
            java.lang.Object r14 = h.Hchat.utils.KavaReflector.readField(r0, r14)
            boolean r15 = r14 instanceof java.lang.String
            if (r15 == 0) goto L888
            java.lang.String r14 = (java.lang.String) r14
            goto L889
        L888:
            r14 = 0
        L889:
            if (r14 == 0) goto L8a0
            java.lang.CharSequence r14 = og.m.R0(r14)
            java.lang.String r14 = r14.toString()
            if (r14 == 0) goto L8a0
            boolean r15 = og.m.t0(r14)
            if (r15 != 0) goto L89c
            goto L89d
        L89c:
            r14 = 0
        L89d:
            if (r14 == 0) goto L8a0
            goto L8cf
        L8a0:
            int r9 = r9 + 1
            goto L876
        L8a3:
            r4 = r9[r14]
            r21 = r9
            r23 = r14
            r9 = 0
            java.lang.Object[] r14 = new java.lang.Object[r9]
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.invokeMethod(r0, r4, r14)
            boolean r9 = r4 instanceof java.lang.String
            if (r9 == 0) goto L8b7
            java.lang.String r4 = (java.lang.String) r4
            goto L8b8
        L8b7:
            r4 = 0
        L8b8:
            if (r4 == 0) goto L94f
            java.lang.CharSequence r4 = og.m.R0(r4)
            java.lang.String r4 = r4.toString()
            if (r4 == 0) goto L94f
            boolean r9 = og.m.t0(r4)
            if (r9 != 0) goto L8cb
            goto L8cc
        L8cb:
            r4 = 0
        L8cc:
            if (r4 == 0) goto L94f
            r14 = r4
        L8cf:
            boolean r4 = og.m.t0(r14)
            if (r4 == 0) goto L8d7
            java.lang.String r14 = r3.f5466c
        L8d7:
            java.lang.reflect.Method r3 = r8.f1462a     // Catch: java.lang.Throwable -> L928
            r9 = 0
            java.lang.Object[] r4 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> L928
            r9 = 0
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.invokeOrThrow(r3, r9, r4)     // Catch: java.lang.Throwable -> L926
            if (r3 == 0) goto L8ff
            java.lang.Long r4 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L926
            java.lang.Object[] r4 = new java.lang.Object[]{r14, r4}     // Catch: java.lang.Throwable -> L926
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.invokeOrThrow(r12, r3, r4)     // Catch: java.lang.Throwable -> L926
            if (r3 == 0) goto L8ff
            java.lang.Class[] r4 = r13.getParameterTypes()     // Catch: java.lang.Throwable -> L926
            r16 = 1
            r4 = r4[r16]     // Catch: java.lang.Throwable -> L926
            boolean r4 = r4.isInstance(r3)     // Catch: java.lang.Throwable -> L926
            if (r4 != 0) goto L901
        L8ff:
            r3 = r9
            goto L930
        L901:
            int r4 = r13.getModifiers()     // Catch: java.lang.Throwable -> L926
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)     // Catch: java.lang.Throwable -> L926
            if (r4 == 0) goto L90d
            r4 = r9
            goto L917
        L90d:
            java.lang.Class r4 = r13.getDeclaringClass()     // Catch: java.lang.Throwable -> L926
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.staticInstance(r4)     // Catch: java.lang.Throwable -> L926
            if (r4 == 0) goto L8ff
        L917:
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r3}     // Catch: java.lang.Throwable -> L926
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invokeOrThrow(r13, r4, r0)     // Catch: java.lang.Throwable -> L926
            if (r0 == 0) goto L8ff
            ca.a r3 = r2.L(r0, r6)     // Catch: java.lang.Throwable -> L926
            goto L930
        L926:
            r0 = move-exception
            goto L92a
        L928:
            r0 = move-exception
            r9 = 0
        L92a:
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r3 = r2
        L930:
            java.lang.Throwable r0 = sf.g.b(r3)
            if (r0 == 0) goto L947
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "解析聊天实况图片失败: msgId="
            r2.<init>(r4)
            r2.append(r10)
            java.lang.String r2 = r2.toString()
            r5.invoke(r2, r0)
        L947:
            boolean r0 = r3 instanceof sf.f
            if (r0 == 0) goto L94c
            r3 = r9
        L94c:
            ca.a r3 = (ca.a) r3
            goto L969
        L94f:
            r9 = 0
            r16 = 1
            int r14 = r23 + 1
            r9 = r21
            goto L86c
        L958:
            r19 = r4
            r9 = 0
            r16 = 1
            int r14 = r14 + 1
            r4 = r19
            r6 = 3
            r9 = 2
            goto L7eb
        L965:
            r19 = r4
            r9 = 0
            r3 = r9
        L969:
            p8.d r29 = new p8.d
            if (r3 == 0) goto L970
            java.lang.String r12 = r3.f1454a
            goto L971
        L970:
            r12 = r9
        L971:
            if (r12 != 0) goto L976
            r31 = r19
            goto L978
        L976:
            r31 = r12
        L978:
            if (r3 == 0) goto L97f
            int r0 = r3.f1455b
            r32 = r0
            goto L981
        L97f:
            r32 = 0
        L981:
            if (r3 == 0) goto L988
            int r0 = r3.f1456c
            r33 = r0
            goto L98a
        L988:
            r33 = 0
        L98a:
            if (r3 == 0) goto L991
            int r11 = r3.f1457d
            r34 = r11
            goto L993
        L991:
            r34 = 0
        L993:
            if (r3 == 0) goto L99a
            long r3 = r3.f1458e
            r35 = r3
            goto L99c
        L99a:
            r35 = r17
        L99c:
            r37 = 64
            r29.<init>(r30, r31, r32, r33, r34, r35, r37)
            return r29
        L9a2:
            r16 = 1
            java.lang.Object r2 = r1.f355h
            java.util.List r2 = (java.util.List) r2
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            int r3 = r0.length()
            if (r3 <= 0) goto L9bc
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L9bc
            r10 = r16
            goto L9bd
        L9bc:
            r10 = 0
        L9bd:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r10)
            return r0
        L9c2:
            r9 = 0
            java.lang.Object r2 = r1.f355h
            b0.d0 r2 = (b0.d0) r2
            x1.e2 r0 = (x1.e2) r0
            boolean r3 = r0 instanceof c0.a
            if (r3 == 0) goto L9d7
            c0.a r0 = (c0.a) r0
            b0.d0 r0 = r0.f938u
            r2.invoke(r0)
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            goto L9dd
        L9d7:
            java.lang.String r0 = "TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode."
            j8.o.A(r0)
            r12 = r9
        L9dd:
            return r12
        L9de:
            java.lang.Object r2 = r1.f355h
            y.a r2 = (y.a) r2
            fg.l r0 = (fg.l) r0
            r0.invoke(r2)
            sf.n r0 = sf.n.f12433a
            return r0
        L9ea:
            java.lang.Object r2 = r1.f355h
            c0.c r2 = (c0.c) r2
            y.a r0 = (y.a) r0
            b0.q r3 = r2.f940w
            i0.m2 r4 = y1.i0.f21966b
            java.lang.Object r2 = x1.k.h(r2, r4)
            r3.invoke(r0, r2)
            sf.n r0 = sf.n.f12433a
            return r0
        L9fe:
            r19 = r5
            r34 = r6
            java.lang.Object r2 = r1.f355h
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            h1.d r0 = (h1.d) r0
            b5.c r3 = r0.z0()
            f1.u r3 = r3.p()
            long r4 = r0.a()
            long r4 = r4 >> r19
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            int r4 = (int) r4
            long r5 = r0.a()
            long r5 = r5 & r34
            int r0 = (int) r5
            float r0 = java.lang.Float.intBitsToFloat(r0)
            int r0 = (int) r0
            r9 = 0
            r2.setBounds(r9, r9, r4, r0)
            android.graphics.Canvas r0 = f1.c.a(r3)
            r2.draw(r0)
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
