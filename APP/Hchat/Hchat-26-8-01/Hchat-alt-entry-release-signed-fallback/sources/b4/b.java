package b4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements fg.l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f460g;

    public /* synthetic */ b(int r1) {
            r0 = this;
            r0.f460g = r1
            r0.<init>()
            return
    }

    public /* synthetic */ b(e8.b r1) {
            r0 = this;
            r1 = 29
            r0.f460g = r1
            r0.<init>()
            return
    }

    @Override // fg.l
    public final java.lang.Object invoke(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f460g
            switch(r0) {
                case 0: goto L2cd;
                case 1: goto L2b2;
                case 2: goto L299;
                case 3: goto L288;
                case 4: goto L265;
                case 5: goto L253;
                case 6: goto L24b;
                case 7: goto L231;
                case 8: goto L204;
                case 9: goto L1fd;
                case 10: goto L1cf;
                case 11: goto L1b5;
                case 12: goto L1a5;
                case 13: goto L176;
                case 14: goto L16a;
                case 15: goto L162;
                case 16: goto L154;
                case 17: goto L11d;
                case 18: goto L10b;
                case 19: goto Lf2;
                case 20: goto Lde;
                case 21: goto Ld7;
                case 22: goto Lc4;
                case 23: goto L69;
                case 24: goto L55;
                case 25: goto L44;
                case 26: goto L34;
                case 27: goto L1b;
                case 28: goto Lf;
                default: goto L5;
            }
        L5:
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            r5.getClass()
            java.lang.String r5 = e8.b.l(r5)
            return r5
        Lf:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            db.a r0 = new db.a
            r1 = 1
            r0.<init>(r1, r5)
            return r0
        L1b:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            boolean r0 = og.m.t0(r5)
            if (r0 != 0) goto L2e
            boolean r5 = eh.a.y(r5)
            if (r5 == 0) goto L2e
            r5 = 1
            goto L2f
        L2e:
            r5 = 0
        L2f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L34:
            db.a r5 = (db.a) r5
            r5.getClass()
            java.lang.String r5 = r5.f2167b
            java.lang.CharSequence r5 = og.m.R0(r5)
            java.lang.String r5 = r5.toString()
            return r5
        L44:
            db.a r5 = (db.a) r5
            r5.getClass()
            int r5 = r5.f2166a
            r0 = 1
            if (r5 != r0) goto L4f
            goto L50
        L4f:
            r0 = 0
        L50:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L55:
            java.lang.Long r5 = (java.lang.Long) r5
            long r0 = r5.longValue()
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L63
            r5 = 1
            goto L64
        L63:
            r5 = 0
        L64:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L69:
            og.f r5 = (og.f) r5
            r5.getClass()
            og.i r5 = (og.i) r5
            java.util.List r0 = r5.a()
            og.g r0 = (og.g) r0
            r1 = 1
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "x"
            boolean r2 = og.t.d0(r0, r2, r1)     // Catch: java.lang.Throwable -> L93
            if (r2 == 0) goto L95
            java.lang.String r0 = r0.substring(r1)     // Catch: java.lang.Throwable -> L93
            r1 = 16
            a.a.w(r1)     // Catch: java.lang.Throwable -> L93
            int r0 = java.lang.Integer.parseInt(r0, r1)     // Catch: java.lang.Throwable -> L93
            goto L99
        L93:
            r0 = move-exception
            goto L9e
        L95:
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L93
        L99:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L93
            goto La4
        L9e:
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        La4:
            boolean r1 = r0 instanceof sf.f
            if (r1 == 0) goto Laa
            r0 = 0
        Laa:
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto Lbf
            int r5 = r0.intValue()
            char[] r5 = java.lang.Character.toChars(r5)
            r5.getClass()
            java.lang.String r0 = new java.lang.String
            r0.<init>(r5)
            goto Lc3
        Lbf:
            java.lang.String r0 = r5.c()
        Lc3:
            return r0
        Lc4:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            int r5 = r5.length()
            if (r5 <= 0) goto Ld1
            r5 = 1
            goto Ld2
        Ld1:
            r5 = 0
        Ld2:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        Ld7:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = p.a.l(r5, r5)
            return r5
        Lde:
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            r5.getClass()
            java.lang.Class r5 = r5.getType()
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r5 = gg.l.a(r5, r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        Lf2:
            r5.getClass()
            java.lang.Class r5 = r5.getClass()
            java.lang.Class r0 = java.lang.Integer.TYPE
            r0.getClass()
            java.lang.Class<android.view.MenuItem> r1 = android.view.MenuItem.class
            java.lang.Class[] r0 = new java.lang.Class[]{r1, r0}
            java.lang.String r1 = "onMMMenuItemSelected"
            java.lang.reflect.Method r5 = h.Hchat.utils.KavaReflector.findMethod(r5, r1, r0)
            return r5
        L10b:
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            r5.getClass()
            int r5 = r5.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L11d:
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            java.lang.Class[] r0 = r5.getParameterTypes()
            java.lang.String r5 = r5.getName()
            java.lang.String r1 = "notify"
            boolean r5 = gg.l.a(r5, r1)
            if (r5 == 0) goto L14e
            r0.getClass()
            int r5 = r0.length
            if (r5 != 0) goto L136
            goto L14e
        L136:
            int r5 = r0.length
            if (r5 == 0) goto L147
            int r5 = r0.length
            r1 = 1
            int r5 = r5 - r1
            r5 = r0[r5]
            java.lang.Class<android.app.Notification> r0 = android.app.Notification.class
            boolean r5 = gg.l.a(r5, r0)
            if (r5 == 0) goto L14e
            goto L14f
        L147:
            java.lang.String r5 = "Array is empty."
            j8.o.l(r5)
            r5 = 0
            goto L153
        L14e:
            r1 = 0
        L14f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
        L153:
            return r5
        L154:
            ca.a0 r5 = (ca.a0) r5
            r5.getClass()
            java.util.List r5 = r5.f1461c
            dg.n r0 = new dg.n
            r1 = 6
            r0.<init>(r5, r1)
            return r0
        L162:
            wb.jv r5 = (wb.jv) r5
            r5.getClass()
            java.lang.String r5 = r5.f17140a
            return r5
        L16a:
            wb.jv r5 = (wb.jv) r5
            r5.getClass()
            boolean r5 = r5.f17142c
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L176:
            hb.t r5 = (hb.t) r5
            r5.getClass()
            int r5 = r5.f5465b
            if (r5 > 0) goto L180
            goto L19a
        L180:
            r0 = r5 & 255(0xff, float:3.57E-43)
            r1 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r5
            int r2 = r5 >>> 16
            if (r2 != 0) goto L18b
            goto L19a
        L18b:
            r2 = 10000(0x2710, float:1.4013E-41)
            if (r1 == r2) goto L199
            r2 = 10002(0x2712, float:1.4016E-41)
            if (r1 == r2) goto L199
            if (r0 == 0) goto L19a
            if (r1 != r0) goto L19a
            r5 = r0
            goto L19a
        L199:
            r5 = r1
        L19a:
            r0 = 3
            if (r5 != r0) goto L19f
            r5 = 1
            goto L1a0
        L19f:
            r5 = 0
        L1a0:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L1a5:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            boolean r5 = og.m.t0(r5)
            r5 = r5 ^ 1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L1b5:
            hb.t r5 = (hb.t) r5
            r5.getClass()
            k8.t r0 = r5.f5470g
            if (r0 == 0) goto L1c1
            java.lang.String r0 = r0.f7474c
            goto L1c2
        L1c1:
            r0 = 0
        L1c2:
            if (r0 != 0) goto L1c6
            java.lang.String r0 = ""
        L1c6:
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto L1ce
            java.lang.String r0 = r5.f5467d
        L1ce:
            return r0
        L1cf:
            hb.t r5 = (hb.t) r5
            r5.getClass()
            int r5 = r5.f5465b
            if (r5 > 0) goto L1d9
            goto L1f3
        L1d9:
            r0 = r5 & 255(0xff, float:3.57E-43)
            r1 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r5
            int r2 = r5 >>> 16
            if (r2 != 0) goto L1e4
            goto L1f3
        L1e4:
            r2 = 10000(0x2710, float:1.4013E-41)
            if (r1 == r2) goto L1f2
            r2 = 10002(0x2712, float:1.4016E-41)
            if (r1 == r2) goto L1f2
            if (r0 == 0) goto L1f3
            if (r1 != r0) goto L1f3
            r5 = r0
            goto L1f3
        L1f2:
            r5 = r1
        L1f3:
            r0 = 1
            if (r5 != r0) goto L1f7
            goto L1f8
        L1f7:
            r0 = 0
        L1f8:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L1fd:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r5 = p.a.l(r5, r5)
            return r5
        L204:
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            r5.getClass()
            int r0 = r5.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L22b
            java.lang.Class[] r0 = r5.getParameterTypes()
            r0.getClass()
            int r0 = r0.length
            if (r0 != 0) goto L22b
            java.lang.Class r5 = r5.getReturnType()
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r5 = gg.l.a(r5, r0)
            if (r5 == 0) goto L22b
            r5 = 1
            goto L22c
        L22b:
            r5 = 0
        L22c:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L231:
            java.lang.String r5 = (java.lang.String) r5
            r5.getClass()
            int r0 = r5.length()
            r1 = 0
            if (r0 <= 0) goto L246
            java.lang.String r0 = "wxid_hchat_group_"
            boolean r5 = og.t.d0(r5, r0, r1)
            if (r5 != 0) goto L246
            r1 = 1
        L246:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            return r5
        L24b:
            c9.a r5 = (c9.a) r5
            r5.getClass()
            java.lang.String r5 = r5.f1081a
            return r5
        L253:
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            r5.getClass()
            int r5 = r5.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L265:
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            r5.getClass()
            java.lang.Class r0 = r5.getType()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L282
            int r5 = r5.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)
            if (r5 != 0) goto L282
            r5 = 1
            goto L283
        L282:
            r5 = 0
        L283:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L288:
            java.lang.reflect.Constructor r5 = (java.lang.reflect.Constructor) r5
            r5.getClass()
            java.lang.Class[] r5 = r5.getParameterTypes()
            r5.getClass()
            ng.j r5 = tf.l.k0(r5)
            return r5
        L299:
            r5.getClass()
            java.lang.Class r5 = r5.getClass()
            java.lang.Class r0 = java.lang.Integer.TYPE
            r0.getClass()
            java.lang.Class<android.view.MenuItem> r1 = android.view.MenuItem.class
            java.lang.Class[] r0 = new java.lang.Class[]{r1, r0}
            java.lang.String r1 = "onMMMenuItemSelected"
            java.lang.reflect.Method r5 = h.Hchat.utils.KavaReflector.findMethod(r5, r1, r0)
            return r5
        L2b2:
            java.util.List r5 = (java.util.List) r5
            r5.getClass()
            java.lang.Object r5 = tf.m.I1(r5)
            wb.jv r5 = (wb.jv) r5
            if (r5 == 0) goto L2ca
            h8.a r0 = h.Hchat.hooks.api.core.WeChatApis.conversations()
            if (r0 == 0) goto L2ca
            java.lang.String r5 = r5.f17140a
            r0.h(r5)
        L2ca:
            sf.n r5 = sf.n.f12433a
            return r5
        L2cd:
            b4.d r5 = (b4.d) r5
            r5.getClass()
            return r5
    }
}
