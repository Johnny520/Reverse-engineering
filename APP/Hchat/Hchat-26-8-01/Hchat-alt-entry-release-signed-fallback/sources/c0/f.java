package c0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f extends gg.j implements fg.l {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f943n;

    public /* synthetic */ f(int r1, java.lang.Object r2, java.lang.Class r3, java.lang.String r4, java.lang.String r5, int r6, int r7, int r8) {
            r0 = this;
            r0.f943n = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r22) {
            r21 = this;
            r0 = r21
            int r1 = r0.f943n
            java.lang.String r2 = "isAd"
            sf.n r4 = sf.n.f12433a
            r6 = 0
            r7 = 0
            java.lang.Object r8 = r0.f4549h
            switch(r1) {
                case 0: goto L344;
                case 1: goto L338;
                case 2: goto L326;
                case 3: goto L314;
                case 4: goto L302;
                case 5: goto L2f0;
                case 6: goto L2de;
                case 7: goto L2cc;
                case 8: goto L2ba;
                case 9: goto L2a8;
                case 10: goto L297;
                case 11: goto L285;
                case 12: goto L273;
                case 13: goto L261;
                case 14: goto L207;
                case 15: goto L1f2;
                case 16: goto L1dd;
                case 17: goto L1c8;
                case 18: goto L1b3;
                case 19: goto L1a1;
                case 20: goto L18c;
                case 21: goto L177;
                case 22: goto L14d;
                case 23: goto L123;
                case 24: goto L10e;
                case 25: goto Lf9;
                case 26: goto L65;
                case 27: goto L50;
                case 28: goto L3b;
                default: goto Lf;
            }
        Lf:
            r1 = r22
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            r1.getClass()
            p8.q r8 = (p8.q) r8
            r8.getClass()
            boolean r2 = p8.q.a(r1)
            if (r2 == 0) goto L35
            java.lang.Class[] r2 = r1.getParameterTypes()
            r2.getClass()
            int r2 = r2.length
            if (r2 != 0) goto L35
            java.lang.String r2 = "com.tencent.mm.plugin.sns.model."
            boolean r1 = eh.a.A(r1, r7, r2)
            if (r1 == 0) goto L35
            r5 = 1
            goto L36
        L35:
            r5 = r7
        L36:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            return r1
        L3b:
            r1 = r22
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            r1.getClass()
            p8.k r8 = (p8.k) r8
            r8.getClass()
            boolean r1 = p8.k.d(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
        L50:
            r1 = r22
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            r1.getClass()
            p8.k r8 = (p8.k) r8
            r8.getClass()
            boolean r1 = p8.k.c(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
        L65:
            r1 = r22
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            k.g r8 = (k.g) r8
            f.z r2 = r8.K
            if (r1 == 0) goto L78
            r8.v1()
            goto Lf8
        L78:
            n.k r1 = r8.f6954w
            if (r1 == 0) goto Lf0
            java.lang.Object[] r1 = r2.f2927c
            long[] r9 = r2.f2925a
            int r10 = r9.length
            int r10 = r10 + (-2)
            if (r10 < 0) goto Lde
            r11 = r7
        L86:
            r12 = r9[r11]
            long r14 = ~r12
            r16 = 7
            long r14 = r14 << r16
            long r14 = r14 & r12
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r16
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 == 0) goto Ld7
            int r14 = r11 - r10
            int r14 = ~r14
            int r14 = r14 >>> 31
            r15 = 8
            int r14 = 8 - r14
            r5 = r7
        La3:
            if (r5 >= r14) goto Ld4
            r17 = 255(0xff, double:1.26E-321)
            long r17 = r12 & r17
            r19 = 128(0x80, double:6.3E-322)
            int r17 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r17 >= 0) goto Lc9
            int r17 = r11 << 3
            int r17 = r17 + r5
            r17 = r1[r17]
            r22 = r15
            r15 = r17
            n.m r15 = (n.m) r15
            qg.t r3 = r8.Y0()
            k.e r0 = new k.e
            r0.<init>(r8, r15, r6, r7)
            r15 = 3
            qg.v.q(r3, r6, r0, r15)
            goto Lcb
        Lc9:
            r22 = r15
        Lcb:
            long r12 = r12 >> r22
            int r5 = r5 + 1
            r0 = r21
            r15 = r22
            goto La3
        Ld4:
            r0 = r15
            if (r14 != r0) goto Lde
        Ld7:
            if (r11 == r10) goto Lde
            int r11 = r11 + 1
            r0 = r21
            goto L86
        Lde:
            n.m r0 = r8.L
            if (r0 == 0) goto Lf0
            qg.t r1 = r8.Y0()
            k.e r3 = new k.e
            r5 = 1
            r3.<init>(r8, r0, r6, r5)
            r15 = 3
            qg.v.q(r1, r6, r3, r15)
        Lf0:
            r2.a()
            r8.L = r6
            r8.w1()
        Lf8:
            return r4
        Lf9:
            r0 = r22
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r0.getClass()
            j8.a r8 = (j8.a) r8
            r8.getClass()
            boolean r0 = j8.a.e(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L10e:
            r0 = r22
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r0.getClass()
            j8.a r8 = (j8.a) r8
            r8.getClass()
            boolean r0 = j8.a.c(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L123:
            r0 = r22
            p8.l r0 = (p8.l) r0
            r0.getClass()
            ia.u r8 = (ia.u) r8
            r8.getClass()
            java.lang.String r1 = r0.f10391a
            if (r1 != 0) goto L134
            goto L148
        L134:
            java.lang.Object r0 = r0.f10393c
            if (r0 == 0) goto L148
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invokeMethod(r0, r2, r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = gg.l.a(r0, r1)
            r16 = 1
            r7 = r0 ^ 1
        L148:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        L14d:
            r0 = r22
            p8.l r0 = (p8.l) r0
            r0.getClass()
            ia.u r8 = (ia.u) r8
            r8.getClass()
            java.lang.String r1 = r0.f10391a
            if (r1 != 0) goto L15e
            goto L172
        L15e:
            java.lang.Object r0 = r0.f10393c
            if (r0 == 0) goto L172
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invokeMethod(r0, r2, r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r0 = gg.l.a(r0, r1)
            r16 = 1
            r7 = r0 ^ 1
        L172:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            return r0
        L177:
            r0 = r22
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r0.getClass()
            ha.z r8 = (ha.z) r8
            r8.getClass()
            boolean r0 = ha.z.i(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L18c:
            r0 = r22
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r0.getClass()
            ha.z r8 = (ha.z) r8
            r8.getClass()
            boolean r0 = ha.z.h(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L1a1:
            r0 = r22
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r0.getClass()
            ha.z r8 = (ha.z) r8
            boolean r0 = r8.g(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L1b3:
            r0 = r22
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r0.getClass()
            ha.z r8 = (ha.z) r8
            r8.getClass()
            boolean r0 = ha.z.f(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L1c8:
            r0 = r22
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r0.getClass()
            ha.s r8 = (ha.s) r8
            r8.getClass()
            boolean r0 = ha.s.h(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L1dd:
            r0 = r22
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r0.getClass()
            ha.s r8 = (ha.s) r8
            r8.getClass()
            boolean r0 = ha.s.f(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L1f2:
            r0 = r22
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r0.getClass()
            ha.s r8 = (ha.s) r8
            r8.getClass()
            boolean r0 = ha.s.d(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L207:
            r0 = r22
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            fb.s2 r8 = (fb.s2) r8
            r8.getClass()
            java.io.File r1 = r8.D(r0, r7)
            boolean r2 = r1.exists()
            if (r2 != 0) goto L21e
            goto L260
        L21e:
            boolean r2 = r1.isFile()
            if (r2 == 0) goto L257
            long r2 = r1.length()
            r4 = 2097152(0x200000, double:1.036131E-317)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L24d
            byte[] r1 = dg.l.g0(r1)
            java.util.concurrent.ConcurrentHashMap r2 = fb.t2.f3808a
            boolean r2 = fb.t2.C(r1)
            if (r2 == 0) goto L243
            java.lang.String r6 = new java.lang.String
            java.nio.charset.Charset r0 = og.a.f9804a
            r6.<init>(r1, r0)
            goto L260
        L243:
            java.lang.String r1 = "文件不是可修改的文本文件: "
            java.lang.String r0 = r1.concat(r0)
            j8.o.q(r0)
            goto L260
        L24d:
            java.lang.String r1 = "文件超过 2 MB: "
            java.lang.String r0 = r1.concat(r0)
            j8.o.q(r0)
            goto L260
        L257:
            java.lang.String r1 = "统一补丁只能操作文本文件: "
            java.lang.String r0 = r1.concat(r0)
            j8.o.q(r0)
        L260:
            return r6
        L261:
            r0 = r22
            java.io.File r0 = (java.io.File) r0
            r0.getClass()
            h.Hchat.hooks.items.script.ScriptPluginRuntime r8 = (h.Hchat.hooks.items.script.ScriptPluginRuntime) r8
            boolean r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.access$isPluginDirectory(r8, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L273:
            r0 = r22
            java.io.File r0 = (java.io.File) r0
            r0.getClass()
            h.Hchat.hooks.items.script.ScriptPluginRuntime r8 = (h.Hchat.hooks.items.script.ScriptPluginRuntime) r8
            boolean r0 = h.Hchat.hooks.items.script.ScriptPluginRuntime.access$isPluginDirectory(r8, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L285:
            r0 = r22
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            java.util.Map r8 = (java.util.Map) r8
            boolean r0 = r8.containsKey(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L297:
            r0 = r22
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r0 = tf.m.w1(r0, r8)
            ca.a0 r0 = (ca.a0) r0
            return r0
        L2a8:
            r0 = r22
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r0.getClass()
            c9.d2 r8 = (c9.d2) r8
            boolean r0 = c9.d2.g(r8, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L2ba:
            r0 = r22
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r0.getClass()
            c9.d2 r8 = (c9.d2) r8
            boolean r0 = c9.d2.f(r8, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L2cc:
            r0 = r22
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r0.getClass()
            c9.d2 r8 = (c9.d2) r8
            boolean r0 = c9.d2.e(r8, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L2de:
            r0 = r22
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r0.getClass()
            c9.d2 r8 = (c9.d2) r8
            boolean r0 = c9.d2.d(r8, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L2f0:
            r0 = r22
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r0.getClass()
            c9.d2 r8 = (c9.d2) r8
            boolean r0 = c9.d2.c(r8, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L302:
            r0 = r22
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r0.getClass()
            c9.d2 r8 = (c9.d2) r8
            boolean r0 = c9.d2.b(r8, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L314:
            r0 = r22
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r0.getClass()
            c9.d2 r8 = (c9.d2) r8
            boolean r0 = c9.d2.a(r8, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L326:
            r0 = r22
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r0.getClass()
            c9.d2 r8 = (c9.d2) r8
            boolean r0 = c9.d2.a(r8, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L338:
            r0 = r22
            fg.l r0 = (fg.l) r0
            y.a r8 = (y.a) r8
            f.f0 r1 = r8.f21789b
            r1.a(r0)
            return r4
        L344:
            r0 = r22
            e1.b r0 = (e1.b) r0
            long r11 = r0.f2294a
            r10 = r8
            c0.j r10 = (c0.j) r10
            r10.getClass()
            i0.u r0 = d0.f.f1894a
            java.lang.Object r0 = x1.k.h(r10, r0)
            r13 = r0
            d0.e r13 = (d0.e) r13
            if (r13 != 0) goto L35c
            goto L36f
        L35c:
            c0.h r14 = new c0.h
            r14.<init>(r10, r11)
            qg.t r0 = r10.Y0()
            c0.i r9 = new c0.i
            r15 = 0
            r9.<init>(r10, r11, r13, r14, r15)
            r15 = 3
            qg.v.q(r0, r6, r9, r15)
        L36f:
            return r4
    }
}
