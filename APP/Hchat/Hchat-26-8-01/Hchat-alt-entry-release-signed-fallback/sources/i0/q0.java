package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6016g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f6017h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f6018i;

    public /* synthetic */ q0(java.lang.Object r1, int r2, java.lang.Object r3) {
            r0 = this;
            r0.f6016g = r2
            r0.f6017h = r1
            r0.f6018i = r3
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r7) {
            r6 = this;
            int r0 = r6.f6016g
            switch(r0) {
                case 0: goto L355;
                case 1: goto L321;
                case 2: goto L2f4;
                case 3: goto L25d;
                case 4: goto L23c;
                case 5: goto L225;
                case 6: goto Lf8;
                default: goto L5;
            }
        L5:
            java.lang.Class r7 = (java.lang.Class) r7
            java.lang.Object r0 = r6.f6017h
            r1 = r0
            q6.b r1 = (q6.b) r1
            java.lang.Object r0 = r6.f6018i
            r2 = r0
            r6.c r2 = (r6.c) r2
            java.lang.Class<java.lang.reflect.Field> r3 = java.lang.reflect.Field.class
            r2.getClass()
            java.lang.reflect.Field[] r7 = r7.getDeclaredFields()     // Catch: java.lang.Throwable -> L1f
            java.util.List r7 = tf.l.L0(r7)     // Catch: java.lang.Throwable -> L1f
            goto L27
        L1f:
            r0 = move-exception
            r7 = r0
            sf.f r0 = new sf.f
            r0.<init>(r7)
            r7 = r0
        L27:
            java.lang.Throwable r0 = sf.g.b(r7)
            if (r0 == 0) goto L32
            y6.a r0 = y6.b.f22306a
            r0.ordinal()
        L32:
            boolean r0 = r7 instanceof sf.f
            r4 = 0
            if (r0 == 0) goto L38
            r7 = r4
        L38:
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L3e
            tf.t r7 = tf.t.f13167g
        L3e:
            dg.n r0 = new dg.n
            r5 = 6
            r0.<init>(r7, r5)
            ng.i r7 = x6.g.b(r0, r1, r2)
            x6.f r0 = x6.f.f21205i
            ng.t r7 = ng.m.W(r7, r0)
            java.lang.String r0 = "isEnumConstant"
            wb.m0 r1 = new wb.m0
            r5 = 12
            r1.<init>(r5)
            ng.i r7 = x6.g.h(r7, r2, r0, r4, r1)
            java.lang.String r0 = "isEnumConstantNot"
            wb.m0 r1 = new wb.m0
            r5 = 13
            r1.<init>(r5)
            ng.i r7 = x6.g.h(r7, r2, r0, r4, r1)
            java.lang.String r0 = "type"
            x6.a r1 = new x6.a
            r5 = 0
            r1.<init>(r2, r5)
            ng.i r7 = x6.g.h(r7, r2, r0, r4, r1)
            java.lang.String r0 = "typeCondition"
            wb.m0 r1 = new wb.m0
            r5 = 14
            r1.<init>(r5)
            ng.i r7 = x6.g.h(r7, r2, r0, r4, r1)
            java.lang.String r0 = "genericType"
            wb.m0 r1 = new wb.m0
            r5 = 15
            r1.<init>(r5)
            ng.i r7 = x6.g.h(r7, r2, r0, r4, r1)
            java.lang.String r0 = "genericTypeCondition"
            wb.m0 r1 = new wb.m0
            r5 = 16
            r1.<init>(r5)
            ng.i r7 = x6.g.h(r7, r2, r0, r4, r1)
            wb.sr r0 = new wb.sr
            r1 = 17
            r0.<init>(r1)
            ng.t r7 = ng.m.W(r7, r0)
            gg.f r0 = gg.v.a(r3)
            java.lang.Class<java.lang.reflect.Method> r1 = java.lang.reflect.Method.class
            gg.f r1 = gg.v.a(r1)
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto Lc1
            x6.e r0 = new x6.e
            r1 = 3
            r0.<init>(r2, r1)
            ng.t r7 = ng.m.W(r7, r0)
            goto Lec
        Lc1:
            java.lang.Class<java.lang.reflect.Constructor> r1 = java.lang.reflect.Constructor.class
            gg.f r1 = gg.v.a(r1)
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto Ld8
            x6.e r0 = new x6.e
            r1 = 4
            r0.<init>(r2, r1)
            ng.t r7 = ng.m.W(r7, r0)
            goto Lec
        Ld8:
            gg.f r1 = gg.v.a(r3)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lf1
            x6.e r0 = new x6.e
            r1 = 5
            r0.<init>(r2, r1)
            ng.t r7 = ng.m.W(r7, r0)
        Lec:
            java.util.List r7 = ng.m.b0(r7)
            goto Lf7
        Lf1:
            java.lang.String r0 = "Unsupported member type: "
            okio.a.p(r7, r0)
            r7 = 0
        Lf7:
            return r7
        Lf8:
            java.lang.Class r7 = (java.lang.Class) r7
            java.lang.Object r0 = r6.f6017h
            r6.d r0 = (r6.d) r0
            r1 = r0
            q6.c r1 = (q6.c) r1
            java.lang.Object r0 = r6.f6018i
            r2 = r0
            r6.c r2 = (r6.c) r2
            java.lang.Class<java.lang.reflect.Method> r3 = java.lang.reflect.Method.class
            r2.getClass()
            java.lang.reflect.Method[] r7 = r7.getDeclaredMethods()     // Catch: java.lang.Throwable -> L114
            java.util.List r7 = tf.l.L0(r7)     // Catch: java.lang.Throwable -> L114
            goto L11c
        L114:
            r0 = move-exception
            r7 = r0
            sf.f r0 = new sf.f
            r0.<init>(r7)
            r7 = r0
        L11c:
            java.lang.Throwable r0 = sf.g.b(r7)
            if (r0 == 0) goto L127
            y6.a r0 = y6.b.f22306a
            r0.ordinal()
        L127:
            boolean r0 = r7 instanceof sf.f
            r4 = 0
            if (r0 == 0) goto L12d
            r7 = r4
        L12d:
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L133
            tf.t r7 = tf.t.f13167g
        L133:
            dg.n r0 = new dg.n
            r5 = 6
            r0.<init>(r7, r5)
            ng.i r7 = x6.g.b(r0, r1, r2)
            ng.i r7 = x6.g.g(r7, r1, r2)
            x6.f r0 = x6.f.f21206j
            ng.t r7 = ng.m.W(r7, r0)
            java.lang.String r0 = "returnType"
            x6.a r1 = new x6.a
            r5 = 2
            r1.<init>(r2, r5)
            ng.i r7 = x6.g.h(r7, r2, r0, r4, r1)
            java.lang.String r0 = "returnTypeCondition"
            wb.m0 r1 = new wb.m0
            r5 = 22
            r1.<init>(r5)
            ng.i r7 = x6.g.h(r7, r2, r0, r4, r1)
            java.lang.String r0 = "genericReturnType"
            wb.m0 r1 = new wb.m0
            r5 = 28
            r1.<init>(r5)
            ng.i r7 = x6.g.h(r7, r2, r0, r4, r1)
            java.lang.String r0 = "genericReturnTypeCondition"
            x6.c r1 = new x6.c
            r5 = 5
            r1.<init>(r5)
            ng.i r7 = x6.g.h(r7, r2, r0, r4, r1)
            java.lang.String r0 = "isBridge"
            x6.c r1 = new x6.c
            r5 = 9
            r1.<init>(r5)
            ng.i r7 = x6.g.h(r7, r2, r0, r4, r1)
            java.lang.String r0 = "isBridgeNot"
            x6.c r1 = new x6.c
            r5 = 10
            r1.<init>(r5)
            ng.i r7 = x6.g.h(r7, r2, r0, r4, r1)
            java.lang.String r0 = "isDefault"
            x6.c r1 = new x6.c
            r5 = 11
            r1.<init>(r5)
            ng.i r7 = x6.g.h(r7, r2, r0, r4, r1)
            java.lang.String r0 = "isDefaultNot"
            x6.c r1 = new x6.c
            r5 = 12
            r1.<init>(r5)
            ng.i r7 = x6.g.h(r7, r2, r0, r4, r1)
            java.lang.String r0 = "defaultValue"
            x6.c r1 = new x6.c
            r5 = 13
            r1.<init>(r5)
            ng.i r7 = x6.g.h(r7, r2, r0, r4, r1)
            java.lang.String r0 = "defaultValueCondition"
            wb.m0 r1 = new wb.m0
            r5 = 11
            r1.<init>(r5)
            ng.i r7 = x6.g.h(r7, r2, r0, r4, r1)
            wb.sr r0 = new wb.sr
            r1 = 17
            r0.<init>(r1)
            ng.t r7 = ng.m.W(r7, r0)
            gg.f r0 = gg.v.a(r3)
            gg.f r1 = gg.v.a(r3)
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L1eb
            x6.e r0 = new x6.e
            r1 = 6
            r0.<init>(r2, r1)
            ng.t r7 = ng.m.W(r7, r0)
            goto L219
        L1eb:
            java.lang.Class<java.lang.reflect.Constructor> r1 = java.lang.reflect.Constructor.class
            gg.f r1 = gg.v.a(r1)
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L202
            x6.e r0 = new x6.e
            r1 = 7
            r0.<init>(r2, r1)
            ng.t r7 = ng.m.W(r7, r0)
            goto L219
        L202:
            java.lang.Class<java.lang.reflect.Field> r1 = java.lang.reflect.Field.class
            gg.f r1 = gg.v.a(r1)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L21e
            x6.e r0 = new x6.e
            r1 = 8
            r0.<init>(r2, r1)
            ng.t r7 = ng.m.W(r7, r0)
        L219:
            java.util.List r7 = ng.m.b0(r7)
            goto L224
        L21e:
            java.lang.String r0 = "Unsupported member type: "
            okio.a.p(r7, r0)
            r7 = 0
        L224:
            return r7
        L225:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            java.lang.Object r0 = r6.f6017h
            wb.sr r0 = (wb.sr) r0
            java.lang.Object r1 = r6.f6018i
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r7 = r1.get(r7)
            java.lang.Object r7 = r0.invoke(r7)
            return r7
        L23c:
            r3 = r7
            w0.j r3 = (w0.j) r3
            java.lang.Object r7 = w0.m.f14786c
            monitor-enter(r7)
            long r1 = w0.m.f14788e     // Catch: java.lang.Throwable -> L25a
            r0 = 1
            long r4 = (long) r0     // Catch: java.lang.Throwable -> L25a
            long r4 = r4 + r1
            w0.m.f14788e = r4     // Catch: java.lang.Throwable -> L25a
            monitor-exit(r7)
            java.lang.Object r7 = r6.f6017h
            r4 = r7
            fg.l r4 = (fg.l) r4
            java.lang.Object r7 = r6.f6018i
            r5 = r7
            fg.l r5 = (fg.l) r5
            w0.b r0 = new w0.b
            r0.<init>(r1, r3, r4, r5)
            return r0
        L25a:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L25d:
            q1.b r7 = (q1.b) r7
            android.view.KeyEvent r7 = r7.f10597a
            java.lang.Object r0 = r6.f6017h
            d1.l r0 = (d1.l) r0
            android.view.InputDevice r1 = r7.getDevice()
            r2 = 0
            if (r1 != 0) goto L26e
            goto L2ef
        L26e:
            r3 = 513(0x201, float:7.19E-43)
            boolean r3 = r1.supportsSource(r3)
            if (r3 != 0) goto L278
            goto L2ef
        L278:
            boolean r1 = r1.isVirtual()
            if (r1 == 0) goto L288
            int r1 = r7.getSource()
            r3 = 33554433(0x2000001, float:9.403956E-38)
            if (r1 == r3) goto L288
            goto L2ef
        L288:
            int r1 = q1.d.c(r7)
            r3 = 2
            if (r1 != r3) goto L2ef
            int r1 = r7.getSource()
            r3 = 257(0x101, float:3.6E-43)
            if (r1 != r3) goto L298
            goto L2ef
        L298:
            r1 = 19
            boolean r1 = w.s.l(r1, r7)
            r3 = 1
            if (r1 == 0) goto L2a9
            r7 = 5
            d1.p r0 = (d1.p) r0
            boolean r2 = r0.g(r7, r3)
            goto L2ef
        L2a9:
            r1 = 20
            boolean r1 = w.s.l(r1, r7)
            if (r1 == 0) goto L2b9
            r7 = 6
            d1.p r0 = (d1.p) r0
            boolean r2 = r0.g(r7, r3)
            goto L2ef
        L2b9:
            r1 = 21
            boolean r1 = w.s.l(r1, r7)
            if (r1 == 0) goto L2c9
            r7 = 3
            d1.p r0 = (d1.p) r0
            boolean r2 = r0.g(r7, r3)
            goto L2ef
        L2c9:
            r1 = 22
            boolean r1 = w.s.l(r1, r7)
            if (r1 == 0) goto L2d9
            r7 = 4
            d1.p r0 = (d1.p) r0
            boolean r2 = r0.g(r7, r3)
            goto L2ef
        L2d9:
            r0 = 23
            boolean r7 = w.s.l(r0, r7)
            if (r7 == 0) goto L2ef
            java.lang.Object r7 = r6.f6018i
            w.q0 r7 = (w.q0) r7
            y1.g2 r7 = r7.f14602c
            if (r7 == 0) goto L2ee
            y1.i1 r7 = (y1.i1) r7
            r7.b()
        L2ee:
            r2 = r3
        L2ef:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            return r7
        L2f4:
            q1.b r7 = (q1.b) r7
            android.view.KeyEvent r7 = r7.f10597a
            java.lang.Object r0 = r6.f6017h
            w.q0 r0 = (w.q0) r0
            w.h0 r0 = r0.a()
            w.h0 r1 = w.h0.f14485h
            if (r0 != r1) goto L31b
            int r0 = r7.getKeyCode()
            r1 = 4
            if (r0 != r1) goto L31b
            int r7 = q1.d.c(r7)
            r0 = 1
            if (r7 != r0) goto L31b
            java.lang.Object r7 = r6.f6018i
            h0.d1 r7 = (h0.d1) r7
            r1 = 0
            r7.g(r1)
            goto L31c
        L31b:
            r0 = 0
        L31c:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r0)
            return r7
        L321:
            h1.d r7 = (h1.d) r7
            r7.getClass()
            b5.c r0 = r7.z0()
            u2.c r1 = r0.s()
            b5.c r0 = r7.z0()
            java.lang.Object r2 = r6.f6017h
            u2.c r2 = (u2.c) r2
            r0.R(r2)
            java.lang.Object r0 = r6.f6018i     // Catch: java.lang.Throwable -> L34c
            th.i r0 = (th.i) r0     // Catch: java.lang.Throwable -> L34c
            th.e r2 = r0.E     // Catch: java.lang.Throwable -> L34c
            r0.p1(r7, r2)     // Catch: java.lang.Throwable -> L34c
            b5.c r7 = r7.z0()
            r7.R(r1)
            sf.n r7 = sf.n.f12433a
            return r7
        L34c:
            r0 = move-exception
            b5.c r7 = r7.z0()
            r7.R(r1)
            throw r0
        L355:
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            java.lang.Object r7 = r6.f6017h
            j8.f r7 = (j8.f) r7
            java.lang.Object r1 = r7.f6781b
            java.lang.Object r0 = r6.f6018i
            qg.g r0 = (qg.g) r0
            monitor-enter(r1)
            java.lang.Object r7 = r7.f6782c     // Catch: java.lang.Throwable -> L36d
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch: java.lang.Throwable -> L36d
            r7.remove(r0)     // Catch: java.lang.Throwable -> L36d
            monitor-exit(r1)
            sf.n r7 = sf.n.f12433a
            return r7
        L36d:
            r0 = move-exception
            r7 = r0
            monitor-exit(r1)
            throw r7
    }
}
