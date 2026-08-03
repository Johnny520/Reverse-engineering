package p8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p extends gg.j implements fg.l {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f10406n;

    public /* synthetic */ p(int r1, java.lang.Object r2, java.lang.Class r3, java.lang.String r4, java.lang.String r5, int r6, int r7, int r8) {
            r0 = this;
            r0.f10406n = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r11) {
            r10 = this;
            int r0 = r10.f10406n
            switch(r0) {
                case 0: goto L34e;
                case 1: goto L31b;
                case 2: goto L2e0;
                case 3: goto L2ce;
                case 4: goto L270;
                case 5: goto L25e;
                case 6: goto L1e3;
                case 7: goto L1d1;
                case 8: goto L1bf;
                case 9: goto L17e;
                case 10: goto L16f;
                case 11: goto L160;
                case 12: goto L151;
                case 13: goto L145;
                case 14: goto L59;
                case 15: goto L44;
                case 16: goto L2f;
                case 17: goto L1a;
                default: goto L5;
            }
        L5:
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            r11.getClass()
            java.lang.Object r0 = r10.f4549h
            xa.n r0 = (xa.n) r0
            r0.getClass()
            boolean r11 = xa.n.b(r11)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            return r11
        L1a:
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            r11.getClass()
            java.lang.Object r0 = r10.f4549h
            xa.n r0 = (xa.n) r0
            r0.getClass()
            boolean r11 = xa.n.b(r11)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            return r11
        L2f:
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            r11.getClass()
            java.lang.Object r0 = r10.f4549h
            xa.n r0 = (xa.n) r0
            r0.getClass()
            boolean r11 = xa.n.b(r11)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            return r11
        L44:
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            r11.getClass()
            java.lang.Object r0 = r10.f4549h
            xa.n r0 = (xa.n) r0
            r0.getClass()
            boolean r11 = xa.n.c(r11)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            return r11
        L59:
            q1.b r11 = (q1.b) r11
            android.view.KeyEvent r11 = r11.f10597a
            java.lang.Object r0 = r10.f4549h
            w.b1 r0 = (w.b1) r0
            h0.j1 r1 = r0.f14410f
            boolean r2 = r0.f14408d
            int r3 = r11.getAction()
            r4 = 1
            r5 = 0
            if (r3 != 0) goto Lce
            int r3 = r11.getUnicodeChar()
            boolean r3 = java.lang.Character.isISOControl(r3)
            if (r3 != 0) goto Lce
            w.f0 r3 = r0.f14413i
            r3.getClass()
            int r6 = r11.getUnicodeChar()
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r7 & r6
            if (r7 == 0) goto L91
            r7 = 2147483647(0x7fffffff, float:NaN)
            r6 = r6 & r7
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3.f14451a = r6
            r3 = r5
            goto Lb5
        L91:
            java.lang.Integer r7 = r3.f14451a
            if (r7 == 0) goto Lb1
            r3.f14451a = r5
            int r3 = r7.intValue()
            int r3 = android.view.KeyCharacterMap.getDeadChar(r3, r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            if (r3 != 0) goto La6
            r7 = r5
        La6:
            if (r7 == 0) goto Lac
            int r6 = r7.intValue()
        Lac:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            goto Lb5
        Lb1:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
        Lb5:
            if (r3 == 0) goto Lce
            int r3 = r3.intValue()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r3 = r6.appendCodePoint(r3)
            java.lang.String r3 = r3.toString()
            n2.a r6 = new n2.a
            r6.<init>(r3, r4)
            goto Lcf
        Lce:
            r6 = r5
        Lcf:
            r3 = 0
            if (r6 == 0) goto Le0
            if (r2 == 0) goto Lde
            java.util.List r11 = a.a.x0(r6)
            r0.a(r11)
            r1.f4921a = r5
            goto L140
        Lde:
            r4 = r3
            goto L140
        Le0:
            int r5 = q1.d.c(r11)
            r6 = 2
            if (r5 != r6) goto Lde
            w.n0 r5 = r0.f14414j
            w.m0 r11 = r5.a(r11)
            if (r11 == 0) goto Lde
            boolean r5 = r11.f14568g
            if (r5 == 0) goto Lf6
            if (r2 != 0) goto Lf6
            goto Lde
        Lf6:
            gg.q r2 = new gg.q
            r2.<init>()
            r2.f4560g = r4
            b0.s r3 = new b0.s
            r5 = 24
            r3.<init>(r11, r0, r2, r5)
            h0.s0 r11 = new h0.s0
            n2.s r5 = r0.f14407c
            b5.k r6 = r0.f14411g
            w.q0 r7 = r0.f14405a
            w.m1 r7 = r7.d()
            r11.<init>(r5, r6, r7, r1)
            r3.invoke(r11)
            long r6 = r11.f4988f
            long r8 = r5.f8977b
            boolean r1 = i2.m0.b(r6, r8)
            if (r1 == 0) goto L12a
            i2.g r1 = r11.f4989g
            i2.g r3 = r5.f8976a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L138
        L12a:
            fg.l r1 = r0.f14415k
            long r6 = r11.f4988f
            r3 = 4
            i2.g r11 = r11.f4989g
            n2.s r11 = n2.s.a(r5, r11, r6, r3)
            r1.invoke(r11)
        L138:
            w.q1 r11 = r0.f14412h
            if (r11 == 0) goto L13e
            r11.f14630e = r4
        L13e:
            boolean r4 = r2.f4560g
        L140:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r4)
            return r11
        L145:
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            java.lang.Object r0 = r10.f4549h
            qg.u0 r0 = (qg.u0) r0
            r0.l(r11)
            sf.n r11 = sf.n.f12433a
            return r11
        L151:
            java.lang.String r11 = (java.lang.String) r11
            r11.getClass()
            java.lang.Object r0 = r10.f4549h
            p8.d0 r0 = (p8.d0) r0
            r0.l(r11)
            sf.n r11 = sf.n.f12433a
            return r11
        L160:
            java.lang.String r11 = (java.lang.String) r11
            r11.getClass()
            java.lang.Object r0 = r10.f4549h
            p8.d0 r0 = (p8.d0) r0
            r0.l(r11)
            sf.n r11 = sf.n.f12433a
            return r11
        L16f:
            java.lang.String r11 = (java.lang.String) r11
            r11.getClass()
            java.lang.Object r0 = r10.f4549h
            p8.d0 r0 = (p8.d0) r0
            r0.l(r11)
            sf.n r11 = sf.n.f12433a
            return r11
        L17e:
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            r11.getClass()
            java.lang.Object r0 = r10.f4549h
            p8.t r0 = (p8.t) r0
            r0.getClass()
            java.lang.Class[] r0 = r11.getParameterTypes()
            int r1 = r11.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            r2 = 0
            if (r1 == 0) goto L1ba
            java.lang.Class r1 = r11.getReturnType()
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L1ba
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model."
            boolean r11 = eh.a.A(r11, r2, r1)
            if (r11 == 0) goto L1ba
            int r11 = r0.length
            r1 = 1
            if (r11 != r1) goto L1ba
            r11 = r0[r2]
            boolean r11 = r11.isPrimitive()
            if (r11 != 0) goto L1ba
            r2 = r1
        L1ba:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r2)
            return r11
        L1bf:
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            r11.getClass()
            java.lang.Object r0 = r10.f4549h
            p8.t r0 = (p8.t) r0
            boolean r11 = p8.t.b(r0, r11)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            return r11
        L1d1:
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            r11.getClass()
            java.lang.Object r0 = r10.f4549h
            p8.t r0 = (p8.t) r0
            boolean r11 = p8.t.b(r0, r11)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            return r11
        L1e3:
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            r11.getClass()
            java.lang.Object r0 = r10.f4549h
            p8.t r0 = (p8.t) r0
            r0.getClass()
            java.lang.Class[] r0 = r11.getParameterTypes()
            int r1 = r11.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            r2 = 0
            if (r1 != 0) goto L259
            java.lang.Class r1 = r11.getReturnType()
            java.lang.Class r3 = java.lang.Boolean.TYPE
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L259
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model."
            boolean r11 = eh.a.A(r11, r2, r1)
            if (r11 == 0) goto L259
            int r11 = r0.length
            r1 = 7
            if (r11 != r1) goto L259
            r11 = r0[r2]
            boolean r11 = r11.isPrimitive()
            if (r11 != 0) goto L259
            r11 = 1
            r1 = r0[r11]
            java.lang.Class r4 = java.lang.Integer.TYPE
            boolean r1 = gg.l.a(r1, r4)
            if (r1 == 0) goto L259
            r1 = 2
            r1 = r0[r1]
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            boolean r1 = gg.l.a(r1, r5)
            if (r1 == 0) goto L259
            r1 = 3
            r1 = r0[r1]
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L259
            r1 = 4
            r1 = r0[r1]
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L259
            r1 = 5
            r1 = r0[r1]
            boolean r1 = gg.l.a(r1, r4)
            if (r1 == 0) goto L259
            r1 = 6
            r0 = r0[r1]
            boolean r0 = gg.l.a(r0, r5)
            if (r0 == 0) goto L259
            r2 = r11
        L259:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r2)
            return r11
        L25e:
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            r11.getClass()
            java.lang.Object r0 = r10.f4549h
            p8.t r0 = (p8.t) r0
            boolean r11 = p8.t.a(r0, r11)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            return r11
        L270:
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            r11.getClass()
            java.lang.Object r0 = r10.f4549h
            p8.t r0 = (p8.t) r0
            r0.getClass()
            java.lang.Class[] r0 = r11.getParameterTypes()
            int r1 = r11.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            r2 = 0
            if (r1 != 0) goto L2c9
            java.lang.Class r1 = r11.getReturnType()
            java.lang.Class r3 = java.lang.Boolean.TYPE
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L2c9
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model."
            boolean r11 = eh.a.A(r11, r2, r1)
            if (r11 == 0) goto L2c9
            int r11 = r0.length
            r1 = 4
            if (r11 != r1) goto L2c9
            r11 = r0[r2]
            boolean r11 = r11.isPrimitive()
            if (r11 != 0) goto L2c9
            r11 = 1
            r1 = r0[r11]
            java.lang.Class r3 = java.lang.Integer.TYPE
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L2c9
            r1 = 2
            r1 = r0[r1]
            boolean r1 = r1.isPrimitive()
            if (r1 != 0) goto L2c9
            r1 = 3
            r0 = r0[r1]
            boolean r0 = r0.isPrimitive()
            if (r0 != 0) goto L2c9
            r2 = r11
        L2c9:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r2)
            return r11
        L2ce:
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            r11.getClass()
            java.lang.Object r0 = r10.f4549h
            p8.t r0 = (p8.t) r0
            boolean r11 = p8.t.a(r0, r11)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            return r11
        L2e0:
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            r11.getClass()
            java.lang.Object r0 = r10.f4549h
            p8.q r0 = (p8.q) r0
            r0.getClass()
            java.lang.Class[] r0 = r11.getParameterTypes()
            boolean r1 = p8.q.a(r11)
            r2 = 0
            if (r1 == 0) goto L316
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model."
            boolean r11 = eh.a.A(r11, r2, r1)
            if (r11 == 0) goto L316
            int r11 = r0.length
            r1 = 1
            if (r11 != r1) goto L316
            r11 = r0[r2]
            boolean r11 = r11.isPrimitive()
            if (r11 != 0) goto L316
            r11 = r0[r2]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r11 = gg.l.a(r11, r0)
            if (r11 != 0) goto L316
            r2 = r1
        L316:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r2)
            return r11
        L31b:
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            r11.getClass()
            java.lang.Object r0 = r10.f4549h
            p8.q r0 = (p8.q) r0
            r0.getClass()
            java.lang.Class[] r0 = r11.getParameterTypes()
            boolean r11 = p8.q.a(r11)
            r1 = 0
            if (r11 == 0) goto L349
            int r11 = r0.length
            r2 = 1
            if (r11 != r2) goto L349
            r11 = r0[r1]
            boolean r11 = r11.isPrimitive()
            if (r11 != 0) goto L349
            r11 = r0[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r11 = gg.l.a(r11, r0)
            if (r11 != 0) goto L349
            r1 = r2
        L349:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r1)
            return r11
        L34e:
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            r11.getClass()
            java.lang.Object r0 = r10.f4549h
            p8.q r0 = (p8.q) r0
            r0.getClass()
            java.lang.Class[] r0 = r11.getParameterTypes()
            boolean r1 = p8.q.a(r11)
            r2 = 0
            if (r1 == 0) goto L385
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model."
            boolean r11 = eh.a.A(r11, r2, r1)
            if (r11 == 0) goto L385
            int r11 = r0.length
            r1 = 2
            if (r11 != r1) goto L385
            r11 = r0[r2]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            boolean r11 = gg.l.a(r11, r1)
            if (r11 == 0) goto L385
            r11 = 1
            r0 = r0[r11]
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L385
            r2 = r11
        L385:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r2)
            return r11
    }
}
