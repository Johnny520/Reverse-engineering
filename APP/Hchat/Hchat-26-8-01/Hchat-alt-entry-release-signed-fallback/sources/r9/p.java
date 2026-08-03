package r9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f11783g;

    public /* synthetic */ p(int r1) {
            r0 = this;
            r0.f11783g = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r25) {
            r24 = this;
            r1 = r24
            r0 = r25
            int r2 = r1.f11783g
            r3 = 1036831949(0x3dcccccd, float:0.1)
            r4 = 2
            r5 = -1
            r6 = 300(0x12c, float:4.2E-43)
            r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r9 = 0
            r10 = 1
            r11 = 0
            switch(r2) {
                case 0: goto L29f;
                case 1: goto L294;
                case 2: goto L289;
                case 3: goto L27a;
                case 4: goto L254;
                case 5: goto L245;
                case 6: goto L23a;
                case 7: goto L211;
                case 8: goto L206;
                case 9: goto L1f9;
                case 10: goto L1f1;
                case 11: goto L1f0;
                case 12: goto L1e2;
                case 13: goto L1d3;
                case 14: goto L1c4;
                case 15: goto L1b5;
                case 16: goto L1a6;
                case 17: goto L19f;
                case 18: goto L19a;
                case 19: goto L195;
                case 20: goto L158;
                case 21: goto L13b;
                case 22: goto L122;
                case 23: goto L109;
                case 24: goto Lf0;
                case 25: goto Ld7;
                case 26: goto Lae;
                case 27: goto L41;
                case 28: goto L37;
                default: goto L18;
            }
        L18:
            java.lang.Object r2 = w0.m.f14786c
            monitor-enter(r2)
            java.lang.Object r3 = w0.m.f14792i     // Catch: java.lang.Throwable -> L2f
            int r4 = r3.size()     // Catch: java.lang.Throwable -> L2f
        L21:
            if (r11 >= r4) goto L31
            java.lang.Object r5 = r3.get(r11)     // Catch: java.lang.Throwable -> L2f
            fg.l r5 = (fg.l) r5     // Catch: java.lang.Throwable -> L2f
            r5.invoke(r0)     // Catch: java.lang.Throwable -> L2f
            int r11 = r11 + 1
            goto L21
        L2f:
            r0 = move-exception
            goto L35
        L31:
            monitor-exit(r2)
            sf.n r0 = sf.n.f12433a
            return r0
        L35:
            monitor-exit(r2)
            throw r0
        L37:
            f2.y r0 = (f2.y) r0
            f2.x r2 = f2.u.A
            sf.n r3 = sf.n.f12433a
            r0.a(r2, r3)
            return r3
        L41:
            i2.e r0 = (i2.e) r0
            java.lang.Object r2 = r0.f6288a
            boolean r3 = r2 instanceof i2.m
            if (r3 == 0) goto La5
            i2.m r2 = (i2.m) r2
            i2.l0 r2 = r2.a()
            if (r2 == 0) goto La5
            i2.f0 r3 = r2.f6354a
            if (r3 != 0) goto L62
            i2.f0 r3 = r2.f6355b
            if (r3 != 0) goto L62
            i2.f0 r3 = r2.f6356c
            if (r3 != 0) goto L62
            i2.f0 r2 = r2.f6357d
            if (r2 != 0) goto L62
            goto La5
        L62:
            i2.e r2 = new i2.e
            java.lang.Object r3 = r0.f6288a
            r3.getClass()
            i2.m r3 = (i2.m) r3
            i2.l0 r3 = r3.a()
            if (r3 == 0) goto L75
            i2.f0 r3 = r3.f6354a
            if (r3 != 0) goto L95
        L75:
            i2.f0 r4 = new i2.f0
            r22 = 0
            r23 = 65535(0xffff, float:9.1834E-41)
            r5 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r4.<init>(r5, r7, r9, r10, r11, r12, r13, r14, r16, r17, r18, r19, r21, r22, r23)
            r3 = r4
        L95:
            int r4 = r0.f6289b
            int r5 = r0.f6290c
            r2.<init>(r4, r5, r3)
            i2.e[] r0 = new i2.e[]{r0, r2}
            java.util.ArrayList r0 = a.a.k(r0)
            goto Lad
        La5:
            i2.e[] r0 = new i2.e[]{r0}
            java.util.ArrayList r0 = a.a.k(r0)
        Lad:
            return r0
        Lae:
            java.util.List r0 = (java.util.List) r0
            w.j1 r2 = new w.j1
            java.lang.Object r3 = r0.get(r10)
            r3.getClass()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto Lc4
            m.p1 r3 = m.p1.f8324g
            goto Lc6
        Lc4:
            m.p1 r3 = m.p1.f8325h
        Lc6:
            java.lang.Object r0 = r0.get(r11)
            r0.getClass()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r2.<init>(r3, r0)
            return r2
        Ld7:
            h0.s0 r0 = (h0.s0) r0
            java.lang.Integer r2 = r0.b()
            if (r2 == 0) goto Lef
            int r2 = r2.intValue()
            n2.e r9 = new n2.e
            long r3 = r0.f4988f
            int r0 = i2.m0.f6359c
            long r3 = r3 & r7
            int r0 = (int) r3
            int r2 = r2 - r0
            r9.<init>(r11, r2)
        Lef:
            return r9
        Lf0:
            h0.s0 r0 = (h0.s0) r0
            java.lang.Integer r2 = r0.c()
            if (r2 == 0) goto L108
            int r2 = r2.intValue()
            n2.e r9 = new n2.e
            long r3 = r0.f4988f
            int r0 = i2.m0.f6359c
            long r3 = r3 & r7
            int r0 = (int) r3
            int r0 = r0 - r2
            r9.<init>(r0, r11)
        L108:
            return r9
        L109:
            h0.s0 r0 = (h0.s0) r0
            java.lang.Integer r2 = r0.d()
            if (r2 == 0) goto L121
            int r2 = r2.intValue()
            n2.e r9 = new n2.e
            long r3 = r0.f4988f
            int r0 = i2.m0.f6359c
            long r3 = r3 & r7
            int r0 = (int) r3
            int r2 = r2 - r0
            r9.<init>(r11, r2)
        L121:
            return r9
        L122:
            h0.s0 r0 = (h0.s0) r0
            java.lang.Integer r2 = r0.e()
            if (r2 == 0) goto L13a
            int r2 = r2.intValue()
            n2.e r9 = new n2.e
            long r3 = r0.f4988f
            int r0 = i2.m0.f6359c
            long r3 = r3 & r7
            int r0 = (int) r3
            int r0 = r0 - r2
            r9.<init>(r0, r11)
        L13a:
            return r9
        L13b:
            h0.s0 r0 = (h0.s0) r0
            i2.g r2 = r0.f4989g
            java.lang.String r2 = r2.f6314h
            long r3 = r0.f4988f
            int r6 = i2.m0.f6359c
            long r3 = r3 & r7
            int r3 = (int) r3
            int r2 = w.s.q(r3, r2)
            if (r2 == r5) goto L157
            n2.e r9 = new n2.e
            long r3 = r0.f4988f
            long r3 = r3 & r7
            int r0 = (int) r3
            int r2 = r2 - r0
            r9.<init>(r11, r2)
        L157:
            return r9
        L158:
            h0.s0 r0 = (h0.s0) r0
            i2.g r2 = r0.f4989g
            java.lang.String r2 = r2.f6314h
            long r3 = r0.f4988f
            int r6 = i2.m0.f6359c
            long r3 = r3 & r7
            int r3 = (int) r3
            if (r3 > 0) goto L168
        L166:
            r2 = r5
            goto L187
        L168:
            l3.i r4 = w.s.u()
            if (r4 != 0) goto L176
            if (r3 > 0) goto L171
            goto L166
        L171:
            int r2 = java.lang.Character.offsetByCodePoints(r2, r3, r5)
            goto L187
        L176:
            int r6 = r3 + (-1)
            int r4 = r4.b(r2, r6)
            if (r4 >= 0) goto L186
            if (r3 > 0) goto L181
            goto L166
        L181:
            int r2 = java.lang.Character.offsetByCodePoints(r2, r3, r5)
            goto L187
        L186:
            r2 = r4
        L187:
            if (r2 != r5) goto L18a
            goto L194
        L18a:
            n2.e r9 = new n2.e
            long r3 = r0.f4988f
            long r3 = r3 & r7
            int r0 = (int) r3
            int r0 = r0 - r2
            r9.<init>(r0, r11)
        L194:
            return r9
        L195:
            n2.s r0 = (n2.s) r0
            sf.n r0 = sf.n.f12433a
            return r0
        L19a:
            i2.k0 r0 = (i2.k0) r0
            sf.n r0 = sf.n.f12433a
            return r0
        L19f:
            i2.k0 r0 = (i2.k0) r0
            int r0 = w.i.f14490a
            sf.n r0 = sf.n.f12433a
            return r0
        L1a6:
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            boolean r0 = og.m.t0(r0)
            r0 = r0 ^ r10
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L1b5:
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            boolean r0 = og.m.t0(r0)
            r0 = r0 ^ r10
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L1c4:
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L1ca
            java.lang.String r0 = ""
        L1ca:
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            return r0
        L1d3:
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            boolean r0 = og.m.t0(r0)
            r0 = r0 ^ r10
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L1e2:
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L1e8
            java.lang.String r0 = ""
        L1e8:
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
        L1f0:
            return r0
        L1f1:
            java.util.Map r0 = (java.util.Map) r0
            v0.d r2 = new v0.d
            r2.<init>(r0)
            return r2
        L1f9:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r0.getClass()
            java.lang.String r0 = r0.toGenericString()
            r0.getClass()
            return r0
        L206:
            x1.h0 r0 = (x1.h0) r0
            r0.getClass()
            r0.e()
            sf.n r0 = sf.n.f12433a
            return r0
        L211:
            java.util.List r0 = (java.util.List) r0
            r0.getClass()
            sh.e2 r2 = new sh.e2
            java.lang.Object r3 = r0.get(r11)
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            java.lang.Object r5 = r0.get(r10)
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            java.lang.Object r0 = r0.get(r4)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            r2.<init>(r3, r5, r0)
            return r2
        L23a:
            f2.y r0 = (f2.y) r0
            r0.getClass()
            f2.w.f(r0)
            sf.n r0 = sf.n.f12433a
            return r0
        L245:
            i.i0 r0 = (i.i0) r0
            r0.getClass()
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            r0.a(r2, r6)
            sf.n r0 = sf.n.f12433a
            return r0
        L254:
            i.i0 r0 = (i.i0) r0
            r0.getClass()
            r2 = 1062836634(0x3f59999a, float:0.85)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r3 = 200(0xc8, float:2.8E-43)
            i.h0 r2 = r0.a(r2, r3)
            i.s r3 = i.x.f5828a
            r2.f5683b = r3
            r2 = 1062048104(0x3f4d9168, float:0.803)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            i.h0 r0 = r0.a(r2, r6)
            r0.f5683b = r3
            sf.n r0 = sf.n.f12433a
            return r0
        L27a:
            i.i0 r0 = (i.i0) r0
            r0.getClass()
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            r0.a(r2, r6)
            sf.n r0 = sf.n.f12433a
            return r0
        L289:
            f2.y r0 = (f2.y) r0
            r0.getClass()
            f2.w.f(r0)
            sf.n r0 = sf.n.f12433a
            return r0
        L294:
            f2.y r0 = (f2.y) r0
            r0.getClass()
            f2.w.c(r0, r11)
            sf.n r0 = sf.n.f12433a
            return r0
        L29f:
            og.f r0 = (og.f) r0
            r0.getClass()
            og.i r0 = (og.i) r0
            og.h r0 = r0.f9830c
            og.e r2 = r0.a(r10)
            if (r2 == 0) goto L2b1
            java.lang.String r0 = r2.f9822a
            goto L2bf
        L2b1:
            og.e r0 = r0.a(r4)
            if (r0 == 0) goto L2b9
            java.lang.String r9 = r0.f9822a
        L2b9:
            if (r9 != 0) goto L2be
            java.lang.String r0 = ""
            goto L2bf
        L2be:
            r0 = r9
        L2bf:
            return r0
    }
}
