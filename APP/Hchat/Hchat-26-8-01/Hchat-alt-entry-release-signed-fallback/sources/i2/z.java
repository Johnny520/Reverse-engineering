package i2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f6406g;

    public /* synthetic */ z(int r1) {
            r0 = this;
            r0.f6406g = r1
            r0.<init>()
            return
    }

    public /* synthetic */ z(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f6406g = r2
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r34) {
            r33 = this;
            r1 = r33
            r0 = r34
            int r2 = r1.f6406g
            r3 = 8
            r4 = 7
            sf.n r5 = sf.n.f12433a
            r6 = 4
            r7 = 3
            r8 = 6
            r9 = 2
            r11 = 0
            r12 = 1
            switch(r2) {
                case 0: goto L530;
                case 1: goto L384;
                case 2: goto L346;
                case 3: goto L337;
                case 4: goto L328;
                case 5: goto L2ea;
                case 6: goto L2db;
                case 7: goto L2d3;
                case 8: goto L2c5;
                case 9: goto L234;
                case 10: goto L203;
                case 11: goto L1f4;
                case 12: goto L1e7;
                case 13: goto L1e1;
                case 14: goto L1de;
                case 15: goto L1d8;
                case 16: goto L1a8;
                case 17: goto L19c;
                case 18: goto L18f;
                case 19: goto L172;
                case 20: goto Lfe;
                case 21: goto L87;
                case 22: goto L63;
                case 23: goto L5e;
                case 24: goto L4d;
                case 25: goto L40;
                case 26: goto L2d;
                case 27: goto L26;
                case 28: goto L1c;
                default: goto L14;
            }
        L14:
            if (r0 != 0) goto L17
            r11 = r12
        L17:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            return r0
        L1c:
            ng.j r0 = (ng.j) r0
            r0.getClass()
            java.util.Iterator r0 = r0.iterator()
            return r0
        L26:
            android.speech.tts.Voice r0 = (android.speech.tts.Voice) r0
            java.lang.String r0 = r0.getName()
            return r0
        L2d:
            android.speech.tts.Voice r0 = (android.speech.tts.Voice) r0
            java.lang.String r0 = r0.getName()
            r0.getClass()
            boolean r0 = og.m.t0(r0)
            r0 = r0 ^ r12
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L40:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r0.getClass()
            java.lang.String r0 = r0.toGenericString()
            r0.getClass()
            return r0
        L4d:
            s1.d0 r0 = (s1.d0) r0
            if (r0 != 0) goto L52
            goto L57
        L52:
            int r0 = r0.f12224a
            if (r0 != r9) goto L57
            r11 = r12
        L57:
            r0 = r11 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L5e:
            s1.d0 r0 = (s1.d0) r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L63:
            s0.h r0 = (s0.h) r0
            i0.m2 r2 = y1.i0.f21966b
            r0.getClass()
            java.lang.Object r0 = i0.r.v(r0, r2)
            android.content.Context r0 = (android.content.Context) r0
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.String r2 = "android.software.leanback"
            boolean r0 = r0.hasSystemFeature(r2)
            if (r0 != 0) goto L84
            m.e r0 = m.f.f8139a
            r0.getClass()
            m.d r0 = m.e.f8123c
            goto L86
        L84:
            m.g r0 = m.h.f8177b
        L86:
            return r0
        L87:
            h.Hchat.hooks.api.model.WeChatMessage r0 = (h.Hchat.hooks.api.model.WeChatMessage) r0
            r0.getClass()
            java.lang.String r2 = r0.imagePath
            boolean r3 = og.m.t0(r2)
            if (r3 != 0) goto L96
            r10 = r2
            goto L97
        L96:
            r10 = 0
        L97:
            if (r10 == 0) goto L9a
            goto Lfd
        L9a:
            java.lang.String r0 = r0.bodyContent()
            char[] r2 = new char[r9]
            r2 = {x0692: FILL_ARRAY_DATA , data: [10, 13} // fill-array
            java.lang.String r2 = og.m.U0(r0, r2)
            char[] r3 = new char[r12]
            r4 = 58
            r3[r11] = r4
            java.util.List r2 = og.m.F0(r2, r3, r8)
            int r3 = r2.size()
            if (r3 < r7) goto Ldb
            r3 = 60
            int r3 = og.m.q0(r0, r3, r11, r8)
            if (r3 >= 0) goto Ldb
            int r0 = r2.size()
            if (r0 != r6) goto Lcc
            java.lang.Object r0 = r2.get(r12)
            java.lang.String r0 = (java.lang.String) r0
            goto Ld2
        Lcc:
            java.lang.Object r0 = r2.get(r11)
            java.lang.String r0 = (java.lang.String) r0
        Ld2:
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r10 = r0.toString()
            goto Lfd
        Ldb:
            l8.d r2 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r2.getClass()
            java.lang.String r2 = "filename"
            java.lang.String r3 = l8.d.m(r0, r2)
            boolean r4 = og.m.t0(r3)
            if (r4 == 0) goto Lf2
            java.lang.String r3 = "voiceurl"
            java.lang.String r3 = l8.d.m(r0, r3)
        Lf2:
            r10 = r3
            boolean r3 = og.m.t0(r10)
            if (r3 == 0) goto Lfd
            java.lang.String r10 = l8.d.o(r0, r2)
        Lfd:
            return r10
        Lfe:
            og.f r0 = (og.f) r0
            r0.getClass()
            r2 = r0
            og.i r2 = (og.i) r2
            java.util.List r0 = r2.a()
            og.g r0 = (og.g) r0
            java.lang.Object r0 = r0.get(r12)
            java.lang.String r0 = (java.lang.String) r0
            l8.d r3 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            java.lang.String r3 = "x"
            boolean r3 = og.t.d0(r0, r3, r12)     // Catch: java.lang.Throwable -> L12a
            if (r3 == 0) goto L12c
            java.lang.String r0 = r0.substring(r12)     // Catch: java.lang.Throwable -> L12a
            r3 = 16
            a.a.w(r3)     // Catch: java.lang.Throwable -> L12a
            int r0 = java.lang.Integer.parseInt(r0, r3)     // Catch: java.lang.Throwable -> L12a
            goto L130
        L12a:
            r0 = move-exception
            goto L135
        L12c:
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L12a
        L130:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L12a
            goto L13b
        L135:
            sf.f r3 = new sf.f
            r3.<init>(r0)
            r0 = r3
        L13b:
            boolean r3 = r0 instanceof sf.f
            if (r3 == 0) goto L142
            r10 = 0
            goto L143
        L142:
            r10 = r0
        L143:
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 != 0) goto L14c
            java.lang.String r0 = r2.c()
            goto L171
        L14c:
            l8.d r0 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            int r0 = r10.intValue()     // Catch: java.lang.Throwable -> L15f
            char[] r0 = java.lang.Character.toChars(r0)     // Catch: java.lang.Throwable -> L15f
            r0.getClass()     // Catch: java.lang.Throwable -> L15f
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L15f
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L15f
            goto L165
        L15f:
            r0 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r0)
        L165:
            java.lang.String r0 = r2.c()
            boolean r2 = r3 instanceof sf.f
            if (r2 == 0) goto L16e
            r3 = r0
        L16e:
            r0 = r3
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
        L171:
            return r0
        L172:
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            r0.getClass()
            java.lang.Class r2 = r0.getType()
            java.lang.Class r3 = java.lang.Integer.TYPE
            boolean r2 = gg.l.a(r2, r3)
            if (r2 == 0) goto L18a
            boolean r0 = h.Hchat.utils.KavaReflector.isStatic(r0)
            if (r0 != 0) goto L18a
            r11 = r12
        L18a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            return r0
        L18f:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r0.getClass()
            java.lang.String r0 = r0.toGenericString()
            r0.getClass()
            return r0
        L19c:
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            k.w1 r2 = new k.w1
            r2.<init>(r0)
            return r2
        L1a8:
            s0.h r0 = (s0.h) r0
            int r2 = k.k.f7007a
            i0.m2 r2 = y1.i0.f21966b
            r0.getClass()
            java.lang.Object r2 = i0.r.v(r0, r2)
            r4 = r2
            android.content.Context r4 = (android.content.Context) r4
            i0.m2 r2 = y1.h1.f21946h
            java.lang.Object r2 = i0.r.v(r0, r2)
            r5 = r2
            u2.c r5 = (u2.c) r5
            i0.u r2 = k.j1.f7006a
            java.lang.Object r0 = i0.r.v(r0, r2)
            k.i1 r0 = (k.i1) r0
            if (r0 != 0) goto L1cd
            r10 = 0
            goto L1d7
        L1cd:
            k.j r3 = new k.j
            long r6 = r0.f6999a
            p.z0 r8 = r0.f7000b
            r3.<init>(r4, r5, r6, r8)
            r10 = r3
        L1d7:
            return r10
        L1d8:
            java.lang.Long r0 = (java.lang.Long) r0
            r0.getClass()
            return r5
        L1de:
            v1.a1 r0 = (v1.a1) r0
            return r5
        L1e1:
            x1.h0 r0 = (x1.h0) r0
            r0.e()
            return r5
        L1e7:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r0.getClass()
            java.lang.String r0 = r0.toGenericString()
            r0.getClass()
            return r0
        L1f4:
            java.lang.String r0 = (java.lang.String) r0
            r0.getClass()
            boolean r0 = og.m.t0(r0)
            r0 = r0 ^ r12
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L203:
            og.f r0 = (og.f) r0
            r0.getClass()
            og.i r0 = (og.i) r0
            java.util.List r0 = r0.a()
            og.g r0 = (og.g) r0
            java.lang.Object r0 = r0.get(r9)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L231
            boolean r2 = og.m.t0(r0)
            if (r2 == 0) goto L21f
            goto L231
        L21f:
            java.lang.String r0 = j8.h.h(r0)
            boolean r2 = og.m.t0(r0)
            if (r2 == 0) goto L22a
            goto L231
        L22a:
            r2 = 160(0xa0, float:2.24E-43)
            java.lang.String r0 = og.m.P0(r2, r0)
            goto L233
        L231:
            java.lang.String r0 = ""
        L233:
            return r0
        L234:
            r0.getClass()
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            java.lang.String r3 = "getContent"
            java.lang.String r4 = "getMsgContent"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}
            r4 = r11
        L245:
            if (r4 < r9) goto L27d
            java.lang.String r3 = "content"
            java.lang.String r4 = "msgContent"
            java.lang.String r5 = "field_content"
            java.lang.String[] r5 = new java.lang.String[]{r5, r3, r4}
        L251:
            if (r11 < r7) goto L25d
            java.util.List r0 = tf.m.P1(r2)
            dg.n r2 = new dg.n
            r2.<init>(r0, r8)
            return r2
        L25d:
            r3 = r5[r11]
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.readField(r0, r3)
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L26a
            java.lang.String r3 = (java.lang.String) r3
            goto L26b
        L26a:
            r3 = 0
        L26b:
            if (r3 == 0) goto L27a
            boolean r4 = og.m.t0(r3)
            if (r4 != 0) goto L274
            goto L275
        L274:
            r3 = 0
        L275:
            if (r3 == 0) goto L27a
            r2.add(r3)
        L27a:
            int r11 = r11 + 1
            goto L251
        L27d:
            r5 = r3[r4]
            java.lang.Class r6 = r0.getClass()
            java.lang.Class[] r12 = new java.lang.Class[r11]
            java.lang.reflect.Method r5 = h.Hchat.utils.KavaReflector.findMethod(r6, r5, r12)
            if (r5 == 0) goto L2c2
            java.lang.Class[] r6 = r5.getParameterTypes()
            r6.getClass()
            int r6 = r6.length
            if (r6 != 0) goto L2a2
            java.lang.Class r6 = r5.getReturnType()
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            boolean r6 = gg.l.a(r6, r12)
            if (r6 == 0) goto L2a2
            goto L2a3
        L2a2:
            r5 = 0
        L2a3:
            if (r5 == 0) goto L2c2
            java.lang.Object[] r6 = new java.lang.Object[r11]
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.invoke(r5, r0, r6)
            boolean r6 = r5 instanceof java.lang.String
            if (r6 == 0) goto L2b2
            java.lang.String r5 = (java.lang.String) r5
            goto L2b3
        L2b2:
            r5 = 0
        L2b3:
            if (r5 == 0) goto L2c2
            boolean r6 = og.m.t0(r5)
            if (r6 != 0) goto L2bc
            goto L2bd
        L2bc:
            r5 = 0
        L2bd:
            if (r5 == 0) goto L2c2
            r2.add(r5)
        L2c2:
            int r4 = r4 + 1
            goto L245
        L2c5:
            hh.o r0 = (hh.o) r0
            r0.getClass()
            hh.p r0 = r0.q()
            dg.n r0 = tf.m.m1(r0)
            return r0
        L2d3:
            wb.jv r0 = (wb.jv) r0
            r0.getClass()
            java.lang.String r0 = r0.f17140a
            return r0
        L2db:
            r0.getClass()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            t2.r r2 = new t2.r
            r2.<init>(r0)
            return r2
        L2ea:
            r0.getClass()
            java.util.List r0 = (java.util.List) r0
            t2.s r2 = new t2.s
            java.lang.Object r3 = r0.get(r11)
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            boolean r4 = gg.l.a(r3, r4)
            p4.t r5 = i2.e0.f6296e
            if (r4 == 0) goto L301
        L2ff:
            r3 = 0
            goto L30d
        L301:
            if (r3 == 0) goto L2ff
            java.lang.Object r4 = r5.f10225i
            fg.l r4 = (fg.l) r4
            java.lang.Object r3 = r4.invoke(r3)
            t2.r r3 = (t2.r) r3
        L30d:
            r3.getClass()
            int r3 = r3.f13027a
            java.lang.Object r0 = r0.get(r12)
            if (r0 == 0) goto L31c
            r10 = r0
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            goto L31d
        L31c:
            r10 = 0
        L31d:
            r10.getClass()
            boolean r0 = r10.booleanValue()
            r2.<init>(r3, r0)
            return r2
        L328:
            r0.getClass()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            t2.e r2 = new t2.e
            r2.<init>(r0)
            return r2
        L337:
            r0.getClass()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            i2.j r2 = new i2.j
            r2.<init>(r0)
            return r2
        L346:
            r0.getClass()
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r2 = r0.get(r11)
            if (r2 == 0) goto L354
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            goto L355
        L354:
            r2 = 0
        L355:
            r2.getClass()
            boolean r2 = r2.booleanValue()
            java.lang.Object r0 = r0.get(r12)
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            boolean r3 = gg.l.a(r0, r3)
            p4.t r4 = i2.e0.f6293b
            if (r3 == 0) goto L36c
        L36a:
            r10 = 0
            goto L379
        L36c:
            if (r0 == 0) goto L36a
            java.lang.Object r3 = r4.f10225i
            fg.l r3 = (fg.l) r3
            java.lang.Object r0 = r3.invoke(r0)
            r10 = r0
            i2.j r10 = (i2.j) r10
        L379:
            r10.getClass()
            int r0 = r10.f6333a
            i2.w r3 = new i2.w
            r3.<init>(r0, r2)
            return r3
        L384:
            r0.getClass()
            java.util.List r0 = (java.util.List) r0
            i2.f0 r13 = new i2.f0
            java.lang.Object r2 = r0.get(r11)
            int r5 = f1.w.f3132h
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            gg.l.a(r2, r5)
            if (r2 == 0) goto L3b6
            boolean r11 = r2.equals(r5)
            if (r11 == 0) goto L3a6
            long r14 = f1.w.f3131g
            f1.w r2 = new f1.w
            r2.<init>(r14)
            goto L3b7
        L3a6:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            long r14 = f1.c0.c(r2)
            f1.w r2 = new f1.w
            r2.<init>(r14)
            goto L3b7
        L3b6:
            r2 = 0
        L3b7:
            r2.getClass()
            long r14 = r2.f3133a
            java.lang.Object r2 = r0.get(r12)
            u2.p[] r11 = u2.o.f13358b
            i2.c0 r11 = i2.d0.f6283v
            fg.l r11 = r11.f6258h
            gg.l.a(r2, r5)
            if (r2 == 0) goto L3d2
            java.lang.Object r2 = r11.invoke(r2)
            u2.o r2 = (u2.o) r2
            goto L3d3
        L3d2:
            r2 = 0
        L3d3:
            r2.getClass()
            r12 = r11
            long r10 = r2.f13360a
            java.lang.Object r2 = r0.get(r9)
            m2.k r9 = m2.k.f8696h
            p4.t r9 = i2.d0.f6274m
            boolean r17 = gg.l.a(r2, r5)
            if (r17 == 0) goto L3ea
        L3e7:
            r18 = 0
            goto L3f8
        L3ea:
            if (r2 == 0) goto L3e7
            java.lang.Object r9 = r9.f10225i
            fg.l r9 = (fg.l) r9
            java.lang.Object r2 = r9.invoke(r2)
            m2.k r2 = (m2.k) r2
            r18 = r2
        L3f8:
            java.lang.Object r2 = r0.get(r7)
            p4.t r7 = i2.d0.f6281t
            boolean r9 = gg.l.a(r2, r5)
            if (r9 == 0) goto L407
        L404:
            r19 = 0
            goto L415
        L407:
            if (r2 == 0) goto L404
            java.lang.Object r7 = r7.f10225i
            fg.l r7 = (fg.l) r7
            java.lang.Object r2 = r7.invoke(r2)
            m2.i r2 = (m2.i) r2
            r19 = r2
        L415:
            java.lang.Object r2 = r0.get(r6)
            p4.t r6 = i2.d0.f6282u
            boolean r7 = gg.l.a(r2, r5)
            if (r7 == 0) goto L424
        L421:
            r20 = 0
            goto L432
        L424:
            if (r2 == 0) goto L421
            java.lang.Object r6 = r6.f10225i
            fg.l r6 = (fg.l) r6
            java.lang.Object r2 = r6.invoke(r2)
            m2.j r2 = (m2.j) r2
            r20 = r2
        L432:
            java.lang.Object r2 = r0.get(r8)
            if (r2 == 0) goto L43d
            java.lang.String r2 = (java.lang.String) r2
            r22 = r2
            goto L43f
        L43d:
            r22 = 0
        L43f:
            java.lang.Object r2 = r0.get(r4)
            gg.l.a(r2, r5)
            if (r2 == 0) goto L44f
            java.lang.Object r2 = r12.invoke(r2)
            u2.o r2 = (u2.o) r2
            goto L450
        L44f:
            r2 = 0
        L450:
            r2.getClass()
            long r6 = r2.f13360a
            java.lang.Object r2 = r0.get(r3)
            p4.t r3 = i2.d0.f6275n
            boolean r4 = gg.l.a(r2, r5)
            if (r4 == 0) goto L464
        L461:
            r25 = 0
            goto L472
        L464:
            if (r2 == 0) goto L461
            java.lang.Object r3 = r3.f10225i
            fg.l r3 = (fg.l) r3
            java.lang.Object r2 = r3.invoke(r2)
            t2.a r2 = (t2.a) r2
            r25 = r2
        L472:
            r2 = 9
            java.lang.Object r2 = r0.get(r2)
            p4.t r3 = i2.d0.f6272k
            boolean r4 = gg.l.a(r2, r5)
            if (r4 == 0) goto L483
        L480:
            r26 = 0
            goto L491
        L483:
            if (r2 == 0) goto L480
            java.lang.Object r3 = r3.f10225i
            fg.l r3 = (fg.l) r3
            java.lang.Object r2 = r3.invoke(r2)
            t2.p r2 = (t2.p) r2
            r26 = r2
        L491:
            r2 = 10
            java.lang.Object r2 = r0.get(r2)
            p2.b r3 = p2.b.f10086i
            p4.t r3 = i2.d0.f6286y
            boolean r4 = gg.l.a(r2, r5)
            if (r4 == 0) goto L4a4
        L4a1:
            r27 = 0
            goto L4b2
        L4a4:
            if (r2 == 0) goto L4a1
            java.lang.Object r3 = r3.f10225i
            fg.l r3 = (fg.l) r3
            java.lang.Object r2 = r3.invoke(r2)
            p2.b r2 = (p2.b) r2
            r27 = r2
        L4b2:
            r2 = 11
            java.lang.Object r2 = r0.get(r2)
            gg.l.a(r2, r5)
            if (r2 == 0) goto L4db
            boolean r3 = r2.equals(r5)
            if (r3 == 0) goto L4cb
            long r2 = f1.w.f3131g
            f1.w r4 = new f1.w
            r4.<init>(r2)
            goto L4dc
        L4cb:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            long r2 = f1.c0.c(r2)
            f1.w r4 = new f1.w
            r4.<init>(r2)
            goto L4dc
        L4db:
            r4 = 0
        L4dc:
            r4.getClass()
            long r2 = r4.f3133a
            r4 = 12
            java.lang.Object r4 = r0.get(r4)
            p4.t r8 = i2.d0.f6271j
            boolean r9 = gg.l.a(r4, r5)
            if (r9 == 0) goto L4f2
        L4ef:
            r30 = 0
            goto L500
        L4f2:
            if (r4 == 0) goto L4ef
            java.lang.Object r8 = r8.f10225i
            fg.l r8 = (fg.l) r8
            java.lang.Object r4 = r8.invoke(r4)
            t2.l r4 = (t2.l) r4
            r30 = r4
        L500:
            r4 = 13
            java.lang.Object r0 = r0.get(r4)
            f1.q0 r4 = f1.q0.f3108d
            p4.t r4 = i2.d0.f6276o
            boolean r5 = gg.l.a(r0, r5)
            if (r5 == 0) goto L513
        L510:
            r31 = 0
            goto L521
        L513:
            if (r0 == 0) goto L510
            java.lang.Object r4 = r4.f10225i
            fg.l r4 = (fg.l) r4
            java.lang.Object r0 = r4.invoke(r0)
            f1.q0 r0 = (f1.q0) r0
            r31 = r0
        L521:
            r32 = 49184(0xc020, float:6.8921E-41)
            r21 = 0
            r28 = r2
            r23 = r6
            r16 = r10
            r13.<init>(r14, r16, r18, r19, r20, r21, r22, r23, r25, r26, r27, r28, r30, r31, r32)
            return r13
        L530:
            r0.getClass()
            java.util.List r0 = (java.util.List) r0
            i2.u r17 = new i2.u
            java.lang.Object r2 = r0.get(r11)
            i2.c0 r5 = i2.d0.f6278q
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            gg.l.a(r2, r10)
            if (r2 == 0) goto L54d
            fg.l r5 = r5.f6258h
            java.lang.Object r2 = r5.invoke(r2)
            t2.k r2 = (t2.k) r2
            goto L54e
        L54d:
            r2 = 0
        L54e:
            r2.getClass()
            int r2 = r2.f13014a
            java.lang.Object r5 = r0.get(r12)
            i2.c0 r11 = i2.d0.f6279r
            gg.l.a(r5, r10)
            if (r5 == 0) goto L567
            fg.l r11 = r11.f6258h
            java.lang.Object r5 = r11.invoke(r5)
            t2.m r5 = (t2.m) r5
            goto L568
        L567:
            r5 = 0
        L568:
            r5.getClass()
            int r5 = r5.f13019a
            java.lang.Object r9 = r0.get(r9)
            u2.p[] r11 = u2.o.f13358b
            i2.c0 r11 = i2.d0.f6283v
            gg.l.a(r9, r10)
            if (r9 == 0) goto L583
            fg.l r11 = r11.f6258h
            java.lang.Object r9 = r11.invoke(r9)
            u2.o r9 = (u2.o) r9
            goto L584
        L583:
            r9 = 0
        L584:
            r9.getClass()
            long r11 = r9.f13360a
            java.lang.Object r7 = r0.get(r7)
            t2.q r9 = t2.q.f13024c
            p4.t r9 = i2.d0.f6273l
            boolean r13 = gg.l.a(r7, r10)
            if (r13 == 0) goto L59a
        L597:
            r22 = 0
            goto L5a8
        L59a:
            if (r7 == 0) goto L597
            java.lang.Object r9 = r9.f10225i
            fg.l r9 = (fg.l) r9
            java.lang.Object r7 = r9.invoke(r7)
            t2.q r7 = (t2.q) r7
            r22 = r7
        L5a8:
            java.lang.Object r6 = r0.get(r6)
            boolean r7 = gg.l.a(r6, r10)
            p4.t r9 = i2.e0.f6292a
            if (r7 == 0) goto L5b7
        L5b4:
            r23 = 0
            goto L5c5
        L5b7:
            if (r6 == 0) goto L5b4
            java.lang.Object r7 = r9.f10225i
            fg.l r7 = (fg.l) r7
            java.lang.Object r6 = r7.invoke(r6)
            i2.w r6 = (i2.w) r6
            r23 = r6
        L5c5:
            r6 = 5
            java.lang.Object r6 = r0.get(r6)
            t2.i r7 = t2.i.f13007d
            p4.t r7 = i2.d0.A
            boolean r9 = gg.l.a(r6, r10)
            if (r9 == 0) goto L5d7
        L5d4:
            r24 = 0
            goto L5e5
        L5d7:
            if (r6 == 0) goto L5d4
            java.lang.Object r7 = r7.f10225i
            fg.l r7 = (fg.l) r7
            java.lang.Object r6 = r7.invoke(r6)
            t2.i r6 = (t2.i) r6
            r24 = r6
        L5e5:
            java.lang.Object r6 = r0.get(r8)
            boolean r7 = gg.l.a(r6, r10)
            p4.t r8 = i2.e0.f6294c
            if (r7 == 0) goto L5f3
        L5f1:
            r6 = 0
            goto L5ff
        L5f3:
            if (r6 == 0) goto L5f1
            java.lang.Object r7 = r8.f10225i
            fg.l r7 = (fg.l) r7
            java.lang.Object r6 = r7.invoke(r6)
            t2.e r6 = (t2.e) r6
        L5ff:
            r6.getClass()
            int r6 = r6.f13000a
            java.lang.Object r4 = r0.get(r4)
            i2.c0 r7 = i2.d0.f6280s
            gg.l.a(r4, r10)
            if (r4 == 0) goto L618
            fg.l r7 = r7.f6258h
            java.lang.Object r4 = r7.invoke(r4)
            t2.d r4 = (t2.d) r4
            goto L619
        L618:
            r4 = 0
        L619:
            r4.getClass()
            int r4 = r4.f12998a
            java.lang.Object r0 = r0.get(r3)
            boolean r3 = gg.l.a(r0, r10)
            p4.t r7 = i2.e0.f6295d
            if (r3 == 0) goto L637
        L62a:
            r18 = r2
            r26 = r4
            r19 = r5
            r25 = r6
            r20 = r11
            r27 = 0
            goto L650
        L637:
            if (r0 == 0) goto L62a
            java.lang.Object r3 = r7.f10225i
            fg.l r3 = (fg.l) r3
            java.lang.Object r0 = r3.invoke(r0)
            r10 = r0
            t2.s r10 = (t2.s) r10
            r18 = r2
            r26 = r4
            r19 = r5
            r25 = r6
            r27 = r10
            r20 = r11
        L650:
            r17.<init>(r18, r19, r20, r22, r23, r24, r25, r26, r27)
            return r17
    }
}
