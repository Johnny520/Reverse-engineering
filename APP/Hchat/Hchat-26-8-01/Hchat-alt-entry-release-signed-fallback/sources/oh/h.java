package oh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static oh.g f9855a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f9856b = false;

    public static final int A(int r1, int r2, int r3) {
            if (r3 <= 0) goto L18
            if (r1 < r2) goto L5
            goto L1c
        L5:
            int r0 = r2 % r3
            if (r0 < 0) goto La
            goto Lb
        La:
            int r0 = r0 + r3
        Lb:
            int r1 = r1 % r3
            if (r1 < 0) goto Lf
            goto L10
        Lf:
            int r1 = r1 + r3
        L10:
            int r0 = r0 - r1
            int r0 = r0 % r3
            if (r0 < 0) goto L15
            goto L16
        L15:
            int r0 = r0 + r3
        L16:
            int r2 = r2 - r0
            return r2
        L18:
            if (r3 >= 0) goto L31
            if (r1 > r2) goto L1d
        L1c:
            return r2
        L1d:
            int r3 = -r3
            int r1 = r1 % r3
            if (r1 < 0) goto L22
            goto L23
        L22:
            int r1 = r1 + r3
        L23:
            int r0 = r2 % r3
            if (r0 < 0) goto L28
            goto L29
        L28:
            int r0 = r0 + r3
        L29:
            int r1 = r1 - r0
            int r1 = r1 % r3
            if (r1 < 0) goto L2e
            goto L2f
        L2e:
            int r1 = r1 + r3
        L2f:
            int r1 = r1 + r2
            return r1
        L31:
            java.lang.String r1 = "Step is zero."
            j8.o.t(r1)
            r1 = 0
            return r1
    }

    public static void B(java.lang.reflect.Method r5, java.lang.ClassLoader r6) {
            java.lang.Class r0 = r5.getDeclaringClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            if (r0 == 0) goto Lb
            r6 = r0
        Lb:
            java.lang.String r6 = M(r6)
            java.lang.Class<mb.a> r0 = mb.a.class
            monitor-enter(r0)
            java.util.HashSet r1 = mb.a.f8812f     // Catch: java.lang.Throwable -> L2d
            boolean r2 = r1.contains(r6)     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L1c
            monitor-exit(r0)
            return
        L1c:
            r8.i r2 = r8.i.f11631b     // Catch: java.lang.Throwable -> L2d
            ba.f r3 = new ba.f     // Catch: java.lang.Throwable -> L2d
            r4 = 18
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L2d
            r2.b(r5, r3)     // Catch: java.lang.Throwable -> L2d
            r1.add(r6)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r0)
            return
        L2d:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
    }

    public static void C(java.lang.reflect.Method r5, java.lang.ClassLoader r6) {
            java.lang.Class r0 = r5.getDeclaringClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            if (r0 == 0) goto Lb
            r6 = r0
        Lb:
            java.lang.String r6 = M(r6)
            java.lang.Class<mb.a> r0 = mb.a.class
            monitor-enter(r0)
            java.util.HashSet r1 = mb.a.f8811e     // Catch: java.lang.Throwable -> L2d
            boolean r2 = r1.contains(r6)     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L1c
            monitor-exit(r0)
            return
        L1c:
            r8.i r2 = r8.i.f11631b     // Catch: java.lang.Throwable -> L2d
            ba.f r3 = new ba.f     // Catch: java.lang.Throwable -> L2d
            r4 = 19
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L2d
            r2.b(r5, r3)     // Catch: java.lang.Throwable -> L2d
            r1.add(r6)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r0)
            return
        L2d:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
    }

    public static void D(org.luckypray.dexkit.DexKitBridge r8, java.lang.ClassLoader r9, android.content.Context r10) {
            if (r10 == 0) goto L5e
            if (r9 == 0) goto L5e
            if (r8 != 0) goto L7
            goto L5e
        L7:
            boolean r0 = F(r10)
            if (r0 != 0) goto Le
            goto L5e
        Le:
            java.lang.String r0 = "Hchat_wechat_tablet_cache"
            android.content.SharedPreferences r2 = ub.b.c(r10, r0)
            java.lang.String r3 = m(r10, r9)
            boolean r0 = H(r9)
            if (r0 == 0) goto L24
            r1 = 0
            r4 = r8
            r5 = r9
            r8 = r1
            r1 = r10
            goto L33
        L24:
            java.lang.String r1 = "Lenovo TB-9707F"
            java.lang.String[] r7 = new java.lang.String[]{r1}
            java.lang.String r6 = "pad_method"
            r4 = r8
            r5 = r9
            r1 = r10
            java.lang.reflect.Method r8 = x(r1, r2, r3, r4, r5, r6, r7)
        L33:
            if (r0 != 0) goto L3d
            if (r8 != 0) goto L3d
            java.lang.String r8 = "[Hchat:Tablet] 安装失败: 未定位平板检测方法"
            fb.v0.m(r8)
            return
        L3d:
            if (r8 == 0) goto L42
            C(r8, r5)
        L42:
            boolean r8 = G(r5)
            if (r8 != 0) goto L5e
            java.lang.String r8 = "loginAsOtherDeviceBtn"
            java.lang.String[] r7 = new java.lang.String[]{r8}
            java.lang.String r6 = "login_button_method"
            java.lang.reflect.Method r8 = x(r1, r2, r3, r4, r5, r6, r7)
            if (r8 == 0) goto L5e
            B(r8, r5)
            java.lang.String r9 = "login_button_method"
            R(r2, r3, r9, r8)
        L5e:
            return
    }

    public static boolean E(java.util.LinkedHashMap r2, java.util.LinkedHashMap r3) {
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
            r0 = 0
        L9:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r2.next()
            ud.a r1 = (ud.a) r1
            if (r0 == 0) goto L1e
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L1e
            goto L27
        L1e:
            java.lang.Object r0 = r3.get(r1)
            ud.a r0 = (ud.a) r0
            goto L9
        L25:
            if (r0 == 0) goto L29
        L27:
            r2 = 1
            return r2
        L29:
            r2 = 0
            return r2
    }

    public static boolean F(android.content.Context r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "Hchat_wechat_tablet_config"
            android.content.SharedPreferences r2 = ub.b.c(r2, r1)
            java.lang.String r1 = "tablet_enable"
            boolean r2 = r2.getBoolean(r1, r0)
            return r2
    }

    public static boolean G(java.lang.ClassLoader r2) {
            java.lang.Class<mb.a> r0 = mb.a.class
            monitor-enter(r0)
            java.util.HashSet r1 = mb.a.f8812f     // Catch: java.lang.Throwable -> Lf
            java.lang.String r2 = M(r2)     // Catch: java.lang.Throwable -> Lf
            boolean r2 = r1.contains(r2)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r2
        Lf:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    public static boolean H(java.lang.ClassLoader r2) {
            java.lang.Class<mb.a> r0 = mb.a.class
            monitor-enter(r0)
            java.util.HashSet r1 = mb.a.f8811e     // Catch: java.lang.Throwable -> Lf
            java.lang.String r2 = M(r2)     // Catch: java.lang.Throwable -> Lf
            boolean r2 = r1.contains(r2)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r2
        Lf:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    public static boolean I(java.util.ArrayList r4) {
            int r0 = r4.size()
            r1 = 4
            r2 = 0
            if (r0 >= r1) goto L9
            goto L52
        L9:
            java.lang.Object r0 = r4.get(r2)
            nc.a r0 = (nc.a) r0
            java.lang.Object r0 = r0.f9342h
            qc.d r0 = (qc.d) r0
            int r1 = r0.b()
            r3 = 5
            if (r1 == r3) goto L1b
            goto L52
        L1b:
            jf.h r0 = r0.a()
            java.lang.String r1 = r0.f6895b
            java.lang.String r3 = "makeConcatWithConstants"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L2a
            goto L52
        L2a:
            java.lang.String r0 = r0.f6896c
            java.lang.String r1 = "Ljava/lang/invoke/StringConcatFactory;"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L35
            goto L52
        L35:
            r0 = 1
            java.lang.Object r1 = r4.get(r0)
            nc.a r1 = (nc.a) r1
            java.lang.Object r1 = r1.f9342h
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 != 0) goto L45
            goto L52
        L45:
            r1 = 3
            java.lang.Object r4 = r4.get(r1)
            nc.a r4 = (nc.a) r4
            int r4 = r4.f9341g
            r1 = 10
            if (r4 == r1) goto L53
        L52:
            return r2
        L53:
            return r0
    }

    public static java.lang.String J(java.lang.String r3) {
            r0 = 0
            if (r3 == 0) goto L5b
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            if (r3 == 0) goto L5b
            r1 = 2
            char[] r1 = new char[r1]
            r1 = {x005c: FILL_ARRAY_DATA , data: [39, 34} // fill-array
            java.lang.String r3 = og.m.S0(r3, r1)
            if (r3 == 0) goto L5b
            int r1 = r3.length()
            if (r1 <= 0) goto L21
            r1 = 1
            goto L22
        L21:
            r1 = 0
        L22:
            if (r1 == 0) goto L25
            goto L26
        L25:
            r3 = r0
        L26:
            if (r3 == 0) goto L5b
            java.lang.Long r1 = og.t.g0(r3)
            if (r1 == 0) goto L39
            long r1 = r1.longValue()
            java.lang.String r1 = java.lang.Long.toUnsignedString(r1)
            if (r1 == 0) goto L39
            return r1
        L39:
            long r1 = java.lang.Long.parseUnsignedLong(r3)     // Catch: java.lang.Throwable -> L42
            java.lang.Long r3 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L42
            goto L49
        L42:
            r3 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r3)
            r3 = r1
        L49:
            boolean r1 = r3 instanceof sf.f
            if (r1 == 0) goto L4f
            r3 = r0
        L4f:
            java.lang.Long r3 = (java.lang.Long) r3
            if (r3 == 0) goto L5b
            long r0 = r3.longValue()
            java.lang.String r0 = java.lang.Long.toUnsignedString(r0)
        L5b:
            return r0
    }

    public static java.lang.reflect.Method K(android.content.SharedPreferences r3, java.lang.String r4, java.lang.ClassLoader r5, java.lang.String r6) {
            int r0 = r4.length()
            r1 = 0
            if (r0 != 0) goto L8
            goto L46
        L8:
            java.lang.String r0 = "cache_key"
            java.lang.String r2 = ""
            java.lang.String r0 = r3.getString(r0, r2)
            boolean r4 = gg.l.a(r0, r4)
            if (r4 != 0) goto L17
            goto L46
        L17:
            java.lang.String r3 = r3.getString(r6, r2)
            if (r3 == 0) goto L46
            int r4 = r3.length()
            if (r4 <= 0) goto L25
            r4 = 1
            goto L26
        L25:
            r4 = 0
        L26:
            if (r4 == 0) goto L29
            goto L2a
        L29:
            r3 = r1
        L2a:
            if (r3 == 0) goto L46
            lh.d r4 = new lh.d     // Catch: java.lang.Throwable -> L36
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L36
            java.lang.reflect.Method r3 = r4.b(r5)     // Catch: java.lang.Throwable -> L36
            goto L3d
        L36:
            r3 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r3)
            r3 = r4
        L3d:
            boolean r4 = r3 instanceof sf.f
            if (r4 == 0) goto L43
            goto L44
        L43:
            r1 = r3
        L44:
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
        L46:
            return r1
    }

    public static java.util.List L(android.content.Context r21) {
            r0 = r21
            java.lang.String r1 = "plugin_agent"
            java.lang.String r2 = "activity"
            r0.getClass()
            java.lang.String r3 = "floating_shortcut_menu"
            android.content.SharedPreferences r3 = ub.b.c(r0, r3)
            java.lang.String r4 = "enable"
            java.lang.String r5 = "legacy_agent_settings_migrated_v1"
            r6 = 0
            boolean r7 = r3.getBoolean(r5, r6)
            r8 = 1
            if (r7 == 0) goto L1d
            goto Ld1
        L1d:
            java.lang.String r7 = "agent_floating_window"
            android.content.SharedPreferences r7 = ub.b.c(r0, r7)
            android.content.SharedPreferences$Editor r9 = r3.edit()
            boolean r0 = r7.getBoolean(r4, r6)     // Catch: java.lang.Throwable -> L30
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L30
            goto L37
        L30:
            r0 = move-exception
            sf.f r10 = new sf.f
            r10.<init>(r0)
            r0 = r10
        L37:
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            boolean r11 = r0 instanceof sf.f
            if (r11 == 0) goto L3e
            r0 = r10
        L3e:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L5c
            boolean r0 = r3.contains(r4)
            if (r0 != 0) goto L5c
            r9.putBoolean(r4, r8)
            java.lang.String r0 = "scope"
            boolean r4 = r3.contains(r0)
            if (r4 != 0) goto L5c
            java.lang.String r4 = "all"
            r9.putString(r0, r4)
        L5c:
            java.lang.String r4 = "position_x"
            boolean r0 = r7.contains(r4)
            r10 = 0
            r11 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L93
            boolean r0 = r3.contains(r4)
            if (r0 != 0) goto L93
            float r0 = r7.getFloat(r4, r11)     // Catch: java.lang.Throwable -> L76
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch: java.lang.Throwable -> L76
            goto L7d
        L76:
            r0 = move-exception
            sf.f r12 = new sf.f
            r12.<init>(r0)
            r0 = r12
        L7d:
            java.lang.Float r12 = java.lang.Float.valueOf(r11)
            boolean r13 = r0 instanceof sf.f
            if (r13 == 0) goto L86
            r0 = r12
        L86:
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r0 = r9.e0.q(r0, r10, r11)
            r9.putFloat(r4, r0)
        L93:
            java.lang.String r4 = "position_y"
            boolean r0 = r7.contains(r4)
            if (r0 == 0) goto Lca
            boolean r0 = r3.contains(r4)
            if (r0 != 0) goto Lca
            r12 = 1055622431(0x3eeb851f, float:0.46)
            float r0 = r7.getFloat(r4, r12)     // Catch: java.lang.Throwable -> Lad
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch: java.lang.Throwable -> Lad
            goto Lb4
        Lad:
            r0 = move-exception
            sf.f r7 = new sf.f
            r7.<init>(r0)
            r0 = r7
        Lb4:
            java.lang.Float r7 = java.lang.Float.valueOf(r12)
            boolean r12 = r0 instanceof sf.f
            if (r12 == 0) goto Lbd
            r0 = r7
        Lbd:
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r0 = r9.e0.q(r0, r10, r11)
            r9.putFloat(r4, r0)
        Lca:
            android.content.SharedPreferences$Editor r0 = r9.putBoolean(r5, r8)
            r0.apply()
        Ld1:
            r0 = 0
            java.lang.String r4 = "items"
            java.lang.String r0 = r3.getString(r4, r0)
            java.lang.String r5 = "agent_item_migrated_v1"
            if (r0 == 0) goto L227
            boolean r7 = og.m.t0(r0)
            if (r7 == 0) goto Le4
            goto L227
        Le4:
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Lfa
            r7.<init>(r0)     // Catch: java.lang.Throwable -> Lfa
            uf.c r0 = a.a.E()     // Catch: java.lang.Throwable -> Lfa
            int r9 = r7.length()     // Catch: java.lang.Throwable -> Lfa
            r10 = r6
        Lf2:
            if (r10 < r9) goto Lfd
            uf.c r0 = a.a.t(r0)     // Catch: java.lang.Throwable -> Lfa
            goto L1c0
        Lfa:
            r0 = move-exception
            goto L1ba
        Lfd:
            org.json.JSONObject r11 = r7.optJSONObject(r10)     // Catch: java.lang.Throwable -> Lfa
            if (r11 == 0) goto L1b5
            java.lang.String r12 = "id"
            java.lang.String r12 = r11.optString(r12)     // Catch: java.lang.Throwable -> Lfa
            r12.getClass()     // Catch: java.lang.Throwable -> Lfa
            java.lang.CharSequence r12 = og.m.R0(r12)     // Catch: java.lang.Throwable -> Lfa
            java.lang.String r14 = r12.toString()     // Catch: java.lang.Throwable -> Lfa
            java.lang.String r12 = "title"
            java.lang.String r12 = r11.optString(r12)     // Catch: java.lang.Throwable -> Lfa
            r12.getClass()     // Catch: java.lang.Throwable -> Lfa
            java.lang.CharSequence r12 = og.m.R0(r12)     // Catch: java.lang.Throwable -> Lfa
            java.lang.String r15 = r12.toString()     // Catch: java.lang.Throwable -> Lfa
            java.lang.String r12 = "actionType"
            java.lang.String r12 = r11.optString(r12, r2)     // Catch: java.lang.Throwable -> Lfa
            r12.getClass()     // Catch: java.lang.Throwable -> Lfa
            java.lang.CharSequence r12 = og.m.R0(r12)     // Catch: java.lang.Throwable -> Lfa
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> Lfa
            boolean r13 = gg.l.a(r12, r2)     // Catch: java.lang.Throwable -> Lfa
            if (r13 == 0) goto L150
            java.lang.String r13 = "target"
            java.lang.String r13 = r11.optString(r13)     // Catch: java.lang.Throwable -> Lfa
            r13.getClass()     // Catch: java.lang.Throwable -> Lfa
            java.lang.CharSequence r13 = og.m.R0(r13)     // Catch: java.lang.Throwable -> Lfa
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> Lfa
        L14d:
            r17 = r13
            goto L153
        L150:
            java.lang.String r13 = ""
            goto L14d
        L153:
            int r13 = r14.length()     // Catch: java.lang.Throwable -> Lfa
            if (r13 != 0) goto L15a
            goto L1b5
        L15a:
            int r13 = r15.length()     // Catch: java.lang.Throwable -> Lfa
            if (r13 != 0) goto L161
            goto L1b5
        L161:
            boolean r13 = gg.l.a(r12, r2)     // Catch: java.lang.Throwable -> Lfa
            if (r13 != 0) goto L176
            java.lang.String r13 = "module_settings"
            boolean r13 = gg.l.a(r12, r13)     // Catch: java.lang.Throwable -> Lfa
            if (r13 != 0) goto L176
            boolean r13 = gg.l.a(r12, r1)     // Catch: java.lang.Throwable -> Lfa
            if (r13 != 0) goto L176
            goto L1b5
        L176:
            boolean r13 = gg.l.a(r12, r2)     // Catch: java.lang.Throwable -> Lfa
            if (r13 == 0) goto L183
            int r13 = r17.length()     // Catch: java.lang.Throwable -> Lfa
            if (r13 != 0) goto L183
            goto L1b5
        L183:
            k9.j r13 = new k9.j     // Catch: java.lang.Throwable -> Lfa
            java.lang.String r6 = "iconPath"
            java.lang.String r6 = r11.optString(r6)     // Catch: java.lang.Throwable -> Lfa
            r6.getClass()     // Catch: java.lang.Throwable -> Lfa
            java.lang.CharSequence r6 = og.m.R0(r6)     // Catch: java.lang.Throwable -> Lfa
            java.lang.String r18 = r6.toString()     // Catch: java.lang.Throwable -> Lfa
            java.lang.String r6 = "darkIconPath"
            java.lang.String r6 = r11.optString(r6)     // Catch: java.lang.Throwable -> Lfa
            r6.getClass()     // Catch: java.lang.Throwable -> Lfa
            java.lang.CharSequence r6 = og.m.R0(r6)     // Catch: java.lang.Throwable -> Lfa
            java.lang.String r19 = r6.toString()     // Catch: java.lang.Throwable -> Lfa
            java.lang.String r6 = "enabled"
            boolean r20 = r11.optBoolean(r6, r8)     // Catch: java.lang.Throwable -> Lfa
            r16 = r12
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> Lfa
            r0.add(r13)     // Catch: java.lang.Throwable -> Lfa
        L1b5:
            int r10 = r10 + 1
            r6 = 0
            goto Lf2
        L1ba:
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L1c0:
            java.util.List r2 = s()
            boolean r6 = r0 instanceof sf.f
            if (r6 == 0) goto L1c9
            r0 = r2
        L1c9:
            java.util.List r0 = (java.util.List) r0
            r2 = 0
            boolean r2 = r3.getBoolean(r5, r2)
            if (r2 == 0) goto L1d3
            return r0
        L1d3:
            if (r0 == 0) goto L1dc
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L1dc
            goto L1f5
        L1dc:
            java.util.Iterator r2 = r0.iterator()
        L1e0:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L1f5
            java.lang.Object r6 = r2.next()
            k9.j r6 = (k9.j) r6
            java.lang.String r6 = r6.f7505c
            boolean r6 = gg.l.a(r6, r1)
            if (r6 == 0) goto L1e0
            goto L20f
        L1f5:
            k9.j r9 = new k9.j
            java.lang.String r14 = ""
            r16 = 1
            java.lang.String r10 = "plugin_agent"
            java.lang.String r11 = "插件 Agent"
            java.lang.String r12 = "plugin_agent"
            java.lang.String r13 = ""
            r15 = r14
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            java.util.List r1 = a.a.x0(r9)
            java.util.ArrayList r0 = tf.m.F1(r1, r0)
        L20f:
            android.content.SharedPreferences$Editor r1 = r3.edit()
            org.json.JSONArray r2 = w(r0)
            java.lang.String r2 = r2.toString()
            android.content.SharedPreferences$Editor r1 = r1.putString(r4, r2)
            android.content.SharedPreferences$Editor r1 = r1.putBoolean(r5, r8)
            r1.apply()
            return r0
        L227:
            android.content.SharedPreferences$Editor r0 = r3.edit()
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r5, r8)
            r0.apply()
            java.util.List r0 = s()
            return r0
    }

    public static java.lang.String M(java.lang.ClassLoader r2) {
            int r0 = java.lang.System.identityHashCode(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ":"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            return r2
    }

    public static a.a N(k5.u r1, int r2, int r3) {
            switch(r2) {
                case 0: goto L38;
                case 1: goto L32;
                case 2: goto L2c;
                case 3: goto L26;
                case 4: goto L20;
                case 5: goto L1a;
                case 6: goto L14;
                default: goto L3;
            }
        L3:
            d6.f r1 = new d6.f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r3 = 0
            java.lang.String r0 = "Invalid reference type: %d"
            r1.<init>(r3, r0, r2)
            throw r1
        L14:
            n5.c r2 = new n5.c
            r2.<init>(r1, r3)
            return r2
        L1a:
            n5.a r2 = new n5.a
            r2.<init>(r1, r3)
            return r2
        L20:
            n5.d r2 = new n5.d
            r2.<init>(r1, r3)
            return r2
        L26:
            n5.e r2 = new n5.e
            r2.<init>(r1, r3)
            return r2
        L2c:
            n5.b r2 = new n5.b
            r2.<init>(r1, r3)
            return r2
        L32:
            n5.g r2 = new n5.g
            r2.<init>(r1, r3)
            return r2
        L38:
            n5.f r2 = new n5.f
            r2.<init>(r1, r3)
            return r2
    }

    public static java.util.Set O(java.lang.String r3) {
            if (r3 != 0) goto L4
            java.lang.String r3 = ""
        L4:
            r0 = 6
            char[] r1 = new char[r0]
            r1 = {x0056: FILL_ARRAY_DATA , data: [44, 124, 59, 10, -244, -229} // fill-array
            java.util.List r3 = og.m.F0(r3, r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = tf.n.e1(r3)
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L1b:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            j8.b.r(r1, r0)
            goto L1b
        L2b:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L34:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L50
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.length()
            if (r2 <= 0) goto L49
            r2 = 1
            goto L4a
        L49:
            r2 = 0
        L4a:
            if (r2 == 0) goto L34
            r3.add(r1)
            goto L34
        L50:
            java.util.Set r3 = tf.m.U1(r3)
            return r3
    }

    public static void P(java.lang.String r10, ud.p r11, java.util.ArrayList r12, gf.a r13) {
            int r0 = r10.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r2 = 0
            r3 = 4
            r4 = r2
            r5 = r4
        Ld:
            if (r4 >= r0) goto La6
            int r6 = r10.codePointAt(r4)
            int r7 = java.lang.Character.charCount(r6)
            int r4 = r4 + r7
            r7 = 1
            if (r6 != r7) goto L1d
            r8 = r7
            goto L1e
        L1d:
            r8 = r2
        L1e:
            r9 = 2
            if (r6 != r9) goto L22
            goto L23
        L22:
            r7 = r2
        L23:
            if (r8 != 0) goto L2c
            if (r7 == 0) goto L28
            goto L2c
        L28:
            r1.appendCodePoint(r6)
            goto Ld
        L2c:
            int r6 = r1.length()
            if (r6 == 0) goto L45
            pd.d r6 = new pd.d
            java.lang.String r7 = r1.toString()
            r6.<init>(r7)
            qd.m r6 = qd.l.Z(r6)
            r11.I(r6)
            r1.setLength(r2)
        L45:
            if (r8 == 0) goto L54
            int r6 = r5 + 1
            qd.h r7 = qd.j.f10887u
            qd.r r5 = qd.l.U(r13, r5, r7)
            r11.I(r5)
            r5 = r6
            goto Ld
        L54:
            int r6 = r3 + 1
            java.lang.Object r3 = r12.get(r3)
            nc.a r3 = (nc.a) r3
            java.lang.Object r7 = a7.a.n(r3)
            if (r7 != 0) goto L6b
            r7 = 0
            qd.h r3 = qd.j.f10887u
            qd.n r3 = qd.l.S(r7, r3)
            goto L92
        L6b:
            boolean r8 = r7 instanceof qd.n
            if (r8 == 0) goto L73
            r3 = r7
            qd.n r3 = (qd.n) r3
            goto L92
        L73:
            boolean r8 = r7 instanceof qd.j
            if (r8 == 0) goto L83
            pd.c r3 = new pd.c
            qd.j r7 = (qd.j) r7
            r3.<init>(r7)
            qd.m r3 = qd.l.Z(r3)
            goto L92
        L83:
            boolean r8 = r7 instanceof java.lang.String
            if (r8 == 0) goto L98
            pd.d r3 = new pd.d
            java.lang.String r7 = (java.lang.String) r7
            r3.<init>(r7)
            qd.m r3 = qd.l.Z(r3)
        L92:
            r11.I(r3)
            r3 = r6
            goto Ld
        L98:
            java.lang.String r10 = java.lang.String.valueOf(r3)
            java.lang.String r11 = "Can't build insn arg from encoded value: "
            java.lang.String r10 = r11.concat(r10)
            ah.a.k(r10)
            return
        La6:
            int r10 = r1.length()
            if (r10 == 0) goto Lbc
            pd.d r10 = new pd.d
            java.lang.String r12 = r1.toString()
            r10.<init>(r12)
            qd.m r10 = qd.l.Z(r10)
            r11.I(r10)
        Lbc:
            return
    }

    public static final u2.k Q(e1.c r4) {
            u2.k r0 = new u2.k
            float r1 = r4.f2296a
            int r1 = java.lang.Math.round(r1)
            float r2 = r4.f2297b
            int r2 = java.lang.Math.round(r2)
            float r3 = r4.f2298c
            int r3 = java.lang.Math.round(r3)
            float r4 = r4.f2299d
            int r4 = java.lang.Math.round(r4)
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public static void R(android.content.SharedPreferences r6, java.lang.String r7, java.lang.String r8, java.lang.reflect.Method r9) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "L"
            r0.<init>(r1)
            java.lang.Class r1 = r9.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            r2 = 46
            r3 = 47
            java.lang.String r1 = r1.replace(r2, r3)
            r1.getClass()
            r0.append(r1)
            java.lang.String r1 = ";->"
            r0.append(r1)
            java.lang.String r1 = r9.getName()
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            java.lang.Class[] r1 = r9.getParameterTypes()
            r1.getClass()
            int r2 = r1.length
            r3 = 0
        L37:
            if (r3 >= r2) goto L4a
            r4 = r1[r3]
            java.util.HashSet r5 = mb.a.f8811e
            r4.getClass()
            java.lang.String r4 = W(r4)
            r0.append(r4)
            int r3 = r3 + 1
            goto L37
        L4a:
            r1 = 41
            r0.append(r1)
            java.util.HashSet r1 = mb.a.f8811e
            java.lang.Class r9 = r9.getReturnType()
            r9.getClass()
            java.lang.String r9 = W(r9)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            S(r6, r7, r8, r9)
            return
    }

    public static void S(android.content.SharedPreferences r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            java.lang.String r0 = "cache_key"
            int r1 = r4.length()
            if (r1 != 0) goto L9
            goto L30
        L9:
            if (r6 == 0) goto L30
            int r1 = r6.length()
            if (r1 != 0) goto L12
            goto L30
        L12:
            android.content.SharedPreferences$Editor r1 = r3.edit()     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = ""
            java.lang.String r3 = r3.getString(r0, r2)     // Catch: java.lang.Throwable -> L30
            boolean r3 = gg.l.a(r3, r4)     // Catch: java.lang.Throwable -> L30
            if (r3 != 0) goto L25
            r1.clear()     // Catch: java.lang.Throwable -> L30
        L25:
            android.content.SharedPreferences$Editor r3 = r1.putString(r0, r4)     // Catch: java.lang.Throwable -> L30
            android.content.SharedPreferences$Editor r3 = r3.putString(r5, r6)     // Catch: java.lang.Throwable -> L30
            r3.apply()     // Catch: java.lang.Throwable -> L30
        L30:
            return
    }

    public static final void T(f2.q r12, h3.g r13) {
            f2.m r0 = r12.k()
            f2.x r1 = f2.u.f3229g
            f.k0 r0 = r0.f3204g
            java.lang.Object r0 = r0.g(r1)
            r1 = 0
            if (r0 != 0) goto L10
            r0 = r1
        L10:
            if (r0 != 0) goto Lcd
            f2.q r0 = r12.l()
            if (r0 != 0) goto L1a
            goto Lcc
        L1a:
            f2.m r2 = r0.k()
            f2.x r3 = f2.u.f3227e
            f.k0 r2 = r2.f3204g
            java.lang.Object r2 = r2.g(r3)
            if (r2 != 0) goto L29
            r2 = r1
        L29:
            if (r2 == 0) goto Lcc
            f2.m r2 = r0.k()
            f2.x r3 = f2.u.f3228f
            f.k0 r2 = r2.f3204g
            java.lang.Object r2 = r2.g(r3)
            if (r2 != 0) goto L3a
            goto L3b
        L3a:
            r1 = r2
        L3b:
            f2.d r1 = (f2.d) r1
            if (r1 == 0) goto L49
            int r2 = r1.f3142a
            if (r2 < 0) goto Lcc
            int r1 = r1.f3143b
            if (r1 >= 0) goto L49
            goto Lcc
        L49:
            f2.m r1 = r12.k()
            f2.x r2 = f2.u.I
            f.k0 r1 = r1.f3204g
            boolean r1 = r1.c(r2)
            if (r1 != 0) goto L59
            goto Lcc
        L59:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 4
            java.util.List r0 = f2.q.j(r2, r0)
            int r2 = r0.size()
            r3 = 0
            r4 = r3
            r5 = r4
        L6a:
            if (r4 >= r2) goto L96
            java.lang.Object r6 = r0.get(r4)
            f2.q r6 = (f2.q) r6
            f2.m r7 = r6.k()
            f2.x r8 = f2.u.I
            f.k0 r7 = r7.f3204g
            boolean r7 = r7.c(r8)
            if (r7 == 0) goto L93
            r1.add(r6)
            x1.f0 r6 = r6.f3212c
            int r6 = r6.v()
            x1.f0 r7 = r12.f3212c
            int r7 = r7.v()
            if (r6 >= r7) goto L93
            int r5 = r5 + 1
        L93:
            int r4 = r4 + 1
            goto L6a
        L96:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Lcc
            boolean r0 = n(r1)
            if (r0 == 0) goto La4
            r6 = r3
            goto La5
        La4:
            r6 = r5
        La5:
            if (r0 == 0) goto La9
            r8 = r5
            goto Laa
        La9:
            r8 = r3
        Laa:
            f2.m r12 = r12.k()
            f2.x r0 = f2.u.I
            f.k0 r12 = r12.f3204g
            java.lang.Object r12 = r12.g(r0)
            if (r12 != 0) goto Lba
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
        Lba:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r11 = r12.booleanValue()
            r9 = 1
            r10 = 0
            r7 = 1
            android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo r12 = android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(r6, r7, r8, r9, r10, r11)
            android.view.accessibility.AccessibilityNodeInfo r13 = r13.f5066a
            r13.setCollectionItemInfo(r12)
        Lcc:
            return
        Lcd:
            ah.a.d()
            return
    }

    public static void U(org.json.JSONObject r10) {
            java.lang.String r0 = "2"
            org.json.JSONObject r0 = r10.optJSONObject(r0)
            if (r0 != 0) goto L9
            return
        L9:
            java.lang.String r1 = "4"
            java.lang.String r2 = r0.optString(r1)
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.String r4 = "com.tencent.mmkv.MMKV"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r5 = "mmkvWithID"
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L7a
            java.lang.Class[] r6 = new java.lang.Class[]{r3, r6}     // Catch: java.lang.Throwable -> L7a
            java.lang.reflect.Method r5 = r4.getDeclaredMethod(r5, r6)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r6 = "db_max_id_record"
            r7 = 2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L7a
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r7}     // Catch: java.lang.Throwable -> L7a
            r7 = 0
            java.lang.Object r5 = r5.invoke(r7, r6)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r6 = "decodeLong"
            java.lang.Class r7 = java.lang.Long.TYPE     // Catch: java.lang.Throwable -> L7a
            java.lang.Class[] r3 = new java.lang.Class[]{r3, r7}     // Catch: java.lang.Throwable -> L7a
            java.lang.reflect.Method r3 = r4.getDeclaredMethod(r6, r3)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r4 = "msg.message"
            r6 = 0
            java.lang.Long r8 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L7a
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r8}     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r3 = r3.invoke(r5, r4)     // Catch: java.lang.Throwable -> L7a
            boolean r4 = r3 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L7a
            if (r4 == 0) goto L5a
            java.lang.Number r3 = (java.lang.Number) r3     // Catch: java.lang.Throwable -> L7a
            long r3 = r3.longValue()     // Catch: java.lang.Throwable -> L7a
            goto L5b
        L5a:
            r3 = r6
        L5b:
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            r6 = 1
            if (r5 != 0) goto L62
            goto L7e
        L62:
            r8 = 1000000(0xf4240, double:4.940656E-318)
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 != 0) goto L6d
            r6 = 10000000(0x989680, double:4.9406565E-317)
            goto L7e
        L6d:
            r8 = 90000000(0x55d4a80, double:4.4465908E-316)
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 != 0) goto L78
            r6 = 500000001(0x1dcd6501, double:2.470328234E-315)
            goto L7e
        L78:
            long r6 = r6 + r3
            goto L7e
        L7a:
            long r6 = java.lang.System.currentTimeMillis()
        L7e:
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            r5.append(r6)
            java.lang.String r2 = "T"
            r5.append(r2)
            r5.append(r3)
            java.lang.String r2 = r5.toString()
            java.lang.String r5 = "8"
            r0.put(r5, r2)
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r5
            int r3 = (int) r3
            java.lang.String r4 = "7"
            r0.put(r4, r3)
            r10.put(r4, r2)
            r10.put(r1, r3)
            return
    }

    public static final dg.c V(java.io.File r6) {
            r6.getClass()
            java.lang.String r6 = r6.getPath()
            r6.getClass()
            char r0 = java.io.File.separatorChar
            r1 = 0
            r2 = 4
            int r3 = og.m.q0(r6, r0, r1, r2)
            r4 = 1
            if (r3 != 0) goto L38
            int r3 = r6.length()
            if (r3 <= r4) goto L36
            char r3 = r6.charAt(r4)
            if (r3 != r0) goto L36
            r3 = 2
            int r3 = og.m.q0(r6, r0, r3, r2)
            if (r3 < 0) goto L36
            int r3 = r3 + r4
            int r2 = og.m.q0(r6, r0, r3, r2)
            if (r2 < 0) goto L31
            int r2 = r2 + r4
            goto L56
        L31:
            int r2 = r6.length()
            goto L56
        L36:
            r2 = r4
            goto L56
        L38:
            r2 = 58
            if (r3 <= 0) goto L47
            int r5 = r3 + (-1)
            char r5 = r6.charAt(r5)
            if (r5 != r2) goto L47
            int r2 = r3 + 1
            goto L56
        L47:
            r5 = -1
            if (r3 != r5) goto L55
            boolean r2 = og.m.l0(r6, r2)
            if (r2 == 0) goto L55
            int r2 = r6.length()
            goto L56
        L55:
            r2 = r1
        L56:
            java.lang.String r3 = r6.substring(r1, r2)
            java.lang.String r6 = r6.substring(r2)
            int r2 = r6.length()
            if (r2 != 0) goto L67
            tf.t r6 = tf.t.f13167g
            goto L93
        L67:
            char[] r2 = new char[r4]
            r2[r1] = r0
            r0 = 6
            java.util.List r6 = og.m.F0(r6, r2, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = tf.n.e1(r6)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L7d:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L92
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            r0.add(r2)
            goto L7d
        L92:
            r6 = r0
        L93:
            dg.c r0 = new dg.c
            java.io.File r1 = new java.io.File
            r1.<init>(r3)
            r0.<init>(r1, r6)
            return r0
    }

    public static java.lang.String W(java.lang.Class r3) {
            boolean r0 = r3.isPrimitive()
            if (r0 == 0) goto L6a
            java.lang.Class r0 = java.lang.Void.TYPE
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto Lf
            goto L67
        Lf:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L1a
            java.lang.String r3 = "Z"
            return r3
        L1a:
            java.lang.Class r0 = java.lang.Byte.TYPE
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L25
            java.lang.String r3 = "B"
            return r3
        L25:
            java.lang.Class r0 = java.lang.Character.TYPE
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L30
            java.lang.String r3 = "C"
            return r3
        L30:
            java.lang.Class r0 = java.lang.Short.TYPE
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L3b
            java.lang.String r3 = "S"
            return r3
        L3b:
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L46
            java.lang.String r3 = "I"
            return r3
        L46:
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L51
            java.lang.String r3 = "J"
            return r3
        L51:
            java.lang.Class r0 = java.lang.Float.TYPE
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L5c
            java.lang.String r3 = "F"
            return r3
        L5c:
            java.lang.Class r0 = java.lang.Double.TYPE
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L67
            java.lang.String r3 = "D"
            return r3
        L67:
            java.lang.String r3 = "V"
            return r3
        L6a:
            boolean r0 = r3.isArray()
            r1 = 47
            r2 = 46
            if (r0 == 0) goto L80
            java.lang.String r3 = r3.getName()
            java.lang.String r3 = r3.replace(r2, r1)
            r3.getClass()
            return r3
        L80:
            java.lang.String r3 = r3.getName()
            java.lang.String r3 = r3.replace(r2, r1)
            r3.getClass()
            java.lang.String r0 = "L"
            java.lang.String r1 = ";"
            java.lang.String r3 = eh.a.n(r0, r3, r1)
            return r3
    }

    public static final long X(long r8, pg.c r10) {
            java.util.concurrent.TimeUnit r0 = r10.f10562g
            r1 = 4611686018426999999(0x3ffffffffffa14bf, double:1.9999999999138678)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r1 = r0.convert(r1, r3)
            long r4 = -r1
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 > 0) goto L21
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 > 0) goto L21
            long r8 = r3.convert(r8, r0)
            l3.w r10 = pg.a.f10555g
            r10 = 1
            long r8 = r8 << r10
            int r10 = pg.b.f10558a
            return r8
        L21:
            pg.c r1 = pg.c.f10560i
            int r1 = r10.compareTo(r1)
            if (r1 < 0) goto La8
            int r0 = java.lang.Long.signum(r8)
            long r0 = (long) r0
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 >= 0) goto L38
            r8 = r2
        L38:
            long r8 = java.lang.Math.abs(r8)
            int r2 = r10.ordinal()
            r3 = 2
            r4 = 0
            r6 = 1
            if (r2 == r3) goto L68
            r3 = 3
            if (r2 == r3) goto L65
            r3 = 4
            if (r2 == r3) goto L61
            r3 = 5
            if (r2 == r3) goto L5d
            r3 = 6
            if (r2 != r3) goto L57
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L69
        L57:
            java.lang.String r8 = "Wrong unit for millisMultiplier: "
            okio.a.p(r10, r8)
            return r4
        L5d:
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            goto L69
        L61:
            r2 = 60000(0xea60, double:2.9644E-319)
            goto L69
        L65:
            r2 = 1000(0x3e8, double:4.94E-321)
            goto L69
        L68:
            r2 = r6
        L69:
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 != 0) goto L6f
        L6d:
            r8 = r4
            goto La2
        L6f:
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            r4 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            if (r10 != 0) goto L7f
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 <= 0) goto L7d
            goto La1
        L7d:
            r8 = r2
            goto La2
        L7f:
            int r10 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r10 != 0) goto L88
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 <= 0) goto La2
            goto La1
        L88:
            int r10 = java.lang.Long.numberOfLeadingZeros(r8)
            int r10 = 128 - r10
            int r6 = java.lang.Long.numberOfLeadingZeros(r2)
            int r10 = r10 - r6
            r6 = 63
            if (r10 >= r6) goto L99
            long r8 = r8 * r2
            goto La2
        L99:
            if (r10 <= r6) goto L9c
            goto La1
        L9c:
            long r8 = r8 * r2
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 <= 0) goto La2
        La1:
            goto L6d
        La2:
            long r0 = r0 * r8
            long r8 = v(r0)
            return r8
        La8:
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r10.convert(r8, r0)
            r3 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            r5 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            long r8 = r9.e0.s(r1, r3, r5)
            long r8 = v(r8)
            return r8
    }

    public static r4.k Y(m4.b r25, k4.b r26, o4.a r27, n4.a r28, r4.p r29) {
            r1 = r26
            r2 = r28
            r0 = r25
            r3 = r29
            o4.b r0 = r0.f8717a
            r27.getClass()
            boolean r4 = r0.f9503a
            r5 = 1
            if (r4 == 0) goto L13
            goto L15
        L13:
            r0.f9503a = r5
        L15:
            r1.d()
            v4.d0 r7 = r1.f7152f
            r1.d()
            int r0 = r1.f7151e
            r8 = r0 & (-33)
            r1.c()
            h4.u r0 = r1.f7157k
            java.lang.String r4 = "SourceFile"
            h4.s r0 = r0.o(r4)
            boolean r4 = r0 instanceof h4.q
            if (r4 == 0) goto L36
            h4.q r0 = (h4.q) r0
            v4.c0 r0 = r0.f5089b
            r11 = r0
            goto L37
        L36:
            r11 = 0
        L37:
            r4.k r6 = new r4.k
            r1.d()
            v4.d0 r9 = r1.f7153g
            r1.d()
            w4.e r10 = r1.f7154h
            r6.<init>(r7, r8, r9, r10, r11)
            r1.d()
            v4.d0 r0 = r1.f7152f
            r1.c()
            h4.u r4 = r1.f7157k
            t4.b r7 = ig.a.s(r4)
            java.lang.String r8 = "EnclosingMethod"
            h4.s r8 = r4.o(r8)
            h4.f r8 = (h4.f) r8
            r9 = 3
            r10 = 0
            if (r8 != 0) goto L62
            r8 = 0
            goto L94
        L62:
            v4.d0 r11 = r8.f5081b
            v4.z r8 = r8.f5082c
            if (r8 != 0) goto L7c
            t4.a r8 = new t4.a
            v4.d0 r13 = r4.d.f11383b
            r8.<init>(r13, r9)
            t4.d r13 = new t4.d
            v4.c0 r14 = r4.d.f11392k
            r13.<init>(r14, r11)
            r8.n(r13)
            r8.f22555g = r10
            goto L94
        L7c:
            v4.y r13 = new v4.y
            r13.<init>(r11, r8)
            t4.a r8 = new t4.a
            v4.d0 r11 = r4.d.f11384c
            r8.<init>(r11, r9)
            t4.d r11 = new t4.d
            v4.c0 r14 = r4.d.f11392k
            r11.<init>(r14, r13)
            r8.n(r11)
            r8.f22555g = r10
        L94:
            if (r8 != 0) goto L98
            r11 = r5
            goto L99
        L98:
            r11 = r10
        L99:
            t4.b r0 = ig.a.a0(r0, r4, r11)     // Catch: z4.l -> Lb1
            if (r0 == 0) goto Lca
            t4.b r4 = new t4.b     // Catch: z4.l -> Lb1
            r4.<init>()     // Catch: z4.l -> Lb1
            r4.m(r7)     // Catch: z4.l -> Lb1
            r4.m(r0)     // Catch: z4.l -> Lb1
            r4.f22555g = r10     // Catch: z4.l -> Lb1
            r7 = r4
            goto Lca
        Lae:
            r4 = r27
            goto Lb3
        Lb1:
            r0 = move-exception
            goto Lae
        Lb3:
            java.io.PrintStream r4 = r4.f9502a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r13 = "warning: "
            r11.<init>(r13)
            java.lang.String r0 = r0.getMessage()
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            r4.println(r0)
        Lca:
            if (r8 == 0) goto Ld0
            t4.b r7 = t4.b.n(r7, r8)
        Ld0:
            r1.d()
            int r0 = r1.f7151e
            r0 = r0 & 8192(0x2000, float:1.148E-41)
            if (r0 == 0) goto L13c
            r1.d()
            v4.d0 r0 = r1.f7152f
            r1.c()
            h4.u r4 = r1.f7156j
            java.lang.Object[] r8 = r4.f22543h
            int r8 = r8.length
            t4.a r11 = new t4.a
            r13 = 4
            r11.<init>(r0, r13)
            r0 = r10
            r13 = r0
        Lee:
            if (r0 >= r8) goto L118
            java.lang.Object r14 = r4.l(r0)
            l4.b r14 = (l4.b) r14
            h4.u r15 = r14.getAttributes()
            java.lang.String r12 = "AnnotationDefault"
            h4.s r12 = r15.o(r12)
            h4.a r12 = (h4.a) r12
            if (r12 == 0) goto L115
            t4.d r13 = new t4.d
            v4.z r14 = r14.d()
            v4.c0 r14 = r14.f14131g
            v4.a r12 = r12.f5070b
            r13.<init>(r14, r12)
            r11.l(r13)
            r13 = r5
        L115:
            int r0 = r0 + 1
            goto Lee
        L118:
            if (r13 != 0) goto L11c
            r0 = 0
            goto L136
        L11c:
            r11.f22555g = r10
            t4.a r0 = new t4.a
            v4.d0 r4 = r4.d.f11382a
            r0.<init>(r4, r9)
            t4.d r4 = new t4.d
            v4.c0 r8 = r4.d.f11392k
            v4.b r12 = new v4.b
            r12.<init>(r11)
            r4.<init>(r8, r12)
            r0.n(r4)
            r0.f22555g = r10
        L136:
            if (r0 == 0) goto L13c
            t4.b r7 = t4.b.n(r7, r0)
        L13c:
            java.util.TreeMap r0 = r7.f13074h
            int r0 = r0.size()
            if (r0 == 0) goto L159
            r4.e r0 = r6.f11431o
            r4.b r4 = r0.f11394k
            if (r4 != 0) goto L152
            r4.b r4 = new r4.b
            r4.<init>(r7, r3)
            r0.f11394k = r4
            goto L159
        L152:
            java.lang.String r0 = "class annotations already set"
            j8.o.w(r0)
        L157:
            r0 = 0
            return r0
        L159:
            r4.w r0 = r3.f11484i
            r4.j0 r4 = r3.f11485j
            r4.h0 r7 = r3.f11489n
            r4.g r8 = r3.f11488m
            r1.d()
            v4.d0 r11 = r1.f7152f
            r1.c()
            h4.u r12 = r1.f7155i
            java.lang.Object[] r13 = r12.f22543h
            int r13 = r13.length
            r14 = r10
        L16f:
            if (r14 >= r13) goto L22d
            java.lang.Object r15 = r12.l(r14)
            l4.d r15 = (l4.d) r15
            r16 = r9
            h4.u r9 = r15.f7841d
            v4.z r5 = r15.f7840c
            v4.m r10 = new v4.m     // Catch: java.lang.RuntimeException -> L1b2
            r10.<init>(r11, r5)     // Catch: java.lang.RuntimeException -> L1b2
            int r15 = r15.f7839b     // Catch: java.lang.RuntimeException -> L1b2
            r18 = r15 & 8
            if (r18 == 0) goto L18b
            r18 = 1
            goto L18d
        L18b:
            r18 = 0
        L18d:
            if (r18 == 0) goto L1b8
            r18 = r11
            java.lang.String r11 = "ConstantValue"
            h4.s r11 = r9.o(r11)     // Catch: java.lang.RuntimeException -> L1b2
            h4.d r11 = (h4.d) r11     // Catch: java.lang.RuntimeException -> L1b2
            if (r11 != 0) goto L19f
            r11 = 0
        L19c:
            r27 = r9
            goto L1a2
        L19f:
            v4.f0 r11 = r11.f5079b     // Catch: java.lang.RuntimeException -> L1b2
            goto L19c
        L1a2:
            r4.r r9 = new r4.r     // Catch: java.lang.RuntimeException -> L1b2
            r9.<init>(r10, r15)     // Catch: java.lang.RuntimeException -> L1b2
            if (r11 == 0) goto L1b4
            w4.c r15 = r5.k()     // Catch: java.lang.RuntimeException -> L1b2
            v4.f0 r11 = q(r11, r15)     // Catch: java.lang.RuntimeException -> L1b2
            goto L1b4
        L1b2:
            r0 = move-exception
            goto L206
        L1b4:
            r6.i(r9, r11)     // Catch: java.lang.RuntimeException -> L1b2
            goto L1c8
        L1b8:
            r27 = r9
            r18 = r11
            r4.r r9 = new r4.r     // Catch: java.lang.RuntimeException -> L1b2
            r9.<init>(r10, r15)     // Catch: java.lang.RuntimeException -> L1b2
            r4.j r11 = r6.f11429m     // Catch: java.lang.RuntimeException -> L1b2
            java.util.ArrayList r11 = r11.f11418n     // Catch: java.lang.RuntimeException -> L1b2
            r11.add(r9)     // Catch: java.lang.RuntimeException -> L1b2
        L1c8:
            t4.b r9 = ig.a.s(r27)     // Catch: java.lang.RuntimeException -> L1b2
            java.util.TreeMap r11 = r9.f13074h     // Catch: java.lang.RuntimeException -> L1b2
            int r11 = r11.size()     // Catch: java.lang.RuntimeException -> L1b2
            if (r11 == 0) goto L1f3
            r4.e r11 = r6.f11431o     // Catch: java.lang.RuntimeException -> L1b2
            java.util.ArrayList r15 = r11.f11395l     // Catch: java.lang.RuntimeException -> L1b2
            if (r15 != 0) goto L1e1
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch: java.lang.RuntimeException -> L1b2
            r15.<init>()     // Catch: java.lang.RuntimeException -> L1b2
            r11.f11395l = r15     // Catch: java.lang.RuntimeException -> L1b2
        L1e1:
            java.util.ArrayList r11 = r11.f11395l     // Catch: java.lang.RuntimeException -> L1b2
            r4.u r15 = new r4.u     // Catch: java.lang.RuntimeException -> L1b2
            r27 = r12
            r4.b r12 = new r4.b     // Catch: java.lang.RuntimeException -> L1b2
            r12.<init>(r9, r3)     // Catch: java.lang.RuntimeException -> L1b2
            r15.<init>(r10, r12)     // Catch: java.lang.RuntimeException -> L1b2
            r11.add(r15)     // Catch: java.lang.RuntimeException -> L1b2
            goto L1f5
        L1f3:
            r27 = r12
        L1f5:
            r4.w r9 = r3.f11484i     // Catch: java.lang.RuntimeException -> L1b2
            r9.m(r10)     // Catch: java.lang.RuntimeException -> L1b2
            int r14 = r14 + 1
            r12 = r27
            r9 = r16
            r11 = r18
            r5 = 1
            r10 = 0
            goto L16f
        L206:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "...while processing "
            r1.<init>(r2)
            v4.c0 r2 = r5.f14131g
            java.lang.String r2 = r2.a()
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            v4.c0 r2 = r5.f14132h
            java.lang.String r2 = r2.a()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            f4.a r0 = f4.a.b(r1, r0)
            throw r0
        L22d:
            r16 = r9
            r1.d()
            v4.d0 r5 = r1.f7152f
            r1.c()
            h4.u r9 = r1.f7156j
            java.lang.Object[] r10 = r9.f22543h
            int r10 = r10.length
            r11 = 0
        L23d:
            if (r11 >= r10) goto L3af
            java.lang.Object r13 = r9.l(r11)
            l4.b r13 = (l4.b) r13
            v4.y r14 = new v4.y     // Catch: java.lang.RuntimeException -> L2d7
            v4.z r15 = r13.d()     // Catch: java.lang.RuntimeException -> L2d7
            r14.<init>(r5, r15)     // Catch: java.lang.RuntimeException -> L2d7
            int r12 = r13.c()     // Catch: java.lang.RuntimeException -> L2d7
            r18 = r12 & 8
            if (r18 == 0) goto L259
            r18 = 1
            goto L25b
        L259:
            r18 = 0
        L25b:
            r19 = r12 & 2
            if (r19 == 0) goto L262
            r19 = 1
            goto L264
        L262:
            r19 = 0
        L264:
            r20 = r10
            r10 = r12 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L26c
            r10 = 1
            goto L26d
        L26c:
            r10 = 0
        L26d:
            r21 = r10
            r10 = r12 & 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto L276
            r22 = 1
            goto L278
        L276:
            r22 = 0
        L278:
            v4.c0 r10 = r15.f14131g     // Catch: java.lang.RuntimeException -> L2d7
            java.lang.String r10 = r10.f14067g     // Catch: java.lang.RuntimeException -> L2d7
            r23 = r11
            java.lang.String r11 = "<init>"
            boolean r10 = r10.equals(r11)     // Catch: java.lang.RuntimeException -> L2d7
            if (r10 != 0) goto L295
            v4.c0 r10 = r15.f14131g     // Catch: java.lang.RuntimeException -> L2d7
            java.lang.String r10 = r10.f14067g     // Catch: java.lang.RuntimeException -> L2d7
            java.lang.String r11 = "<clinit>"
            boolean r10 = r10.equals(r11)     // Catch: java.lang.RuntimeException -> L2d7
            if (r10 == 0) goto L293
            goto L295
        L293:
            r10 = 0
            goto L296
        L295:
            r10 = 1
        L296:
            if (r21 != 0) goto L29a
            if (r22 == 0) goto L29f
        L29a:
            r22 = r9
            r24 = r10
            goto L2da
        L29f:
            i4.m r11 = new i4.m     // Catch: java.lang.RuntimeException -> L2d7
            r11.<init>(r13, r1)     // Catch: java.lang.RuntimeException -> L2d7
            f1.h r11 = i4.z.b(r11, r9, r2)     // Catch: java.lang.RuntimeException -> L2d7
            r22 = r9
            w4.a r9 = r14.f14090i     // Catch: java.lang.RuntimeException -> L2d7
            if (r18 == 0) goto L2b1
            r24 = r10
            goto L2c1
        L2b1:
            r24 = r10
            w4.a r10 = r14.f14091j     // Catch: java.lang.RuntimeException -> L2d7
            if (r10 != 0) goto L2bf
            w4.c r10 = r5.f14088g     // Catch: java.lang.RuntimeException -> L2d7
            w4.a r9 = r9.e(r10)     // Catch: java.lang.RuntimeException -> L2d7
            r14.f14091j = r9     // Catch: java.lang.RuntimeException -> L2d7
        L2bf:
            w4.a r9 = r14.f14091j     // Catch: java.lang.RuntimeException -> L2d7
        L2c1:
            w4.b r9 = r9.f14845i     // Catch: java.lang.RuntimeException -> L2d7
            int r9 = r9.o()     // Catch: java.lang.RuntimeException -> L2d7
            w4.c r10 = r5.f14088g     // Catch: java.lang.RuntimeException -> L2d7
            java.lang.String r10 = r10.f14878g     // Catch: java.lang.RuntimeException -> L2d7
            v4.c0 r10 = r13.getName()     // Catch: java.lang.RuntimeException -> L2d7
            java.lang.String r10 = r10.f14067g     // Catch: java.lang.RuntimeException -> L2d7
            r10 = 2
            i4.a r9 = p4.y.b(r11, r10, r9, r2)     // Catch: java.lang.RuntimeException -> L2d7
            goto L2db
        L2d7:
            r0 = move-exception
            goto L384
        L2da:
            r9 = 0
        L2db:
            r10 = r12 & 32
            if (r10 == 0) goto L2e6
            r10 = 131072(0x20000, float:1.83671E-40)
            r12 = r12 | r10
            if (r21 != 0) goto L2e6
            r12 = r12 & (-33)
        L2e6:
            if (r24 == 0) goto L2eb
            r10 = 65536(0x10000, float:9.1835E-41)
            r12 = r12 | r10
        L2eb:
            h4.u r10 = r13.getAttributes()     // Catch: java.lang.RuntimeException -> L2d7
            java.lang.String r11 = "Exceptions"
            h4.s r10 = r10.o(r11)     // Catch: java.lang.RuntimeException -> L2d7
            h4.g r10 = (h4.g) r10     // Catch: java.lang.RuntimeException -> L2d7
            if (r10 != 0) goto L2fc
            w4.b r10 = w4.b.f14847i     // Catch: java.lang.RuntimeException -> L2d7
            goto L2fe
        L2fc:
            w4.e r10 = r10.f5083b     // Catch: java.lang.RuntimeException -> L2d7
        L2fe:
            r4.t r11 = new r4.t     // Catch: java.lang.RuntimeException -> L2d7
            r11.<init>(r14, r12, r9, r10)     // Catch: java.lang.RuntimeException -> L2d7
            v4.c0 r9 = r15.f14131g     // Catch: java.lang.RuntimeException -> L2d7
            java.lang.String r9 = r9.f14067g     // Catch: java.lang.RuntimeException -> L2d7
            java.lang.String r10 = "<init>"
            boolean r9 = r9.equals(r10)     // Catch: java.lang.RuntimeException -> L2d7
            if (r9 != 0) goto L328
            v4.c0 r9 = r15.f14131g     // Catch: java.lang.RuntimeException -> L2d7
            java.lang.String r9 = r9.f14067g     // Catch: java.lang.RuntimeException -> L2d7
            java.lang.String r10 = "<clinit>"
            boolean r9 = r9.equals(r10)     // Catch: java.lang.RuntimeException -> L2d7
            if (r9 != 0) goto L328
            if (r18 != 0) goto L328
            if (r19 == 0) goto L320
            goto L328
        L320:
            r4.j r9 = r6.f11429m     // Catch: java.lang.RuntimeException -> L2d7
            java.util.ArrayList r9 = r9.f11420p     // Catch: java.lang.RuntimeException -> L2d7
            r9.add(r11)     // Catch: java.lang.RuntimeException -> L2d7
            goto L32f
        L328:
            r4.j r9 = r6.f11429m     // Catch: java.lang.RuntimeException -> L2d7
            java.util.ArrayList r9 = r9.f11419o     // Catch: java.lang.RuntimeException -> L2d7
            r9.add(r11)     // Catch: java.lang.RuntimeException -> L2d7
        L32f:
            t4.b r9 = ig.a.w(r13)     // Catch: java.lang.RuntimeException -> L2d7
            java.util.TreeMap r10 = r9.f13074h     // Catch: java.lang.RuntimeException -> L2d7
            int r10 = r10.size()     // Catch: java.lang.RuntimeException -> L2d7
            if (r10 == 0) goto L357
            r4.e r10 = r6.f11431o     // Catch: java.lang.RuntimeException -> L2d7
            java.util.ArrayList r11 = r10.f11396m     // Catch: java.lang.RuntimeException -> L2d7
            if (r11 != 0) goto L348
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.RuntimeException -> L2d7
            r11.<init>()     // Catch: java.lang.RuntimeException -> L2d7
            r10.f11396m = r11     // Catch: java.lang.RuntimeException -> L2d7
        L348:
            java.util.ArrayList r10 = r10.f11396m     // Catch: java.lang.RuntimeException -> L2d7
            r4.f0 r11 = new r4.f0     // Catch: java.lang.RuntimeException -> L2d7
            r4.b r12 = new r4.b     // Catch: java.lang.RuntimeException -> L2d7
            r12.<init>(r9, r3)     // Catch: java.lang.RuntimeException -> L2d7
            r11.<init>(r14, r12)     // Catch: java.lang.RuntimeException -> L2d7
            r10.add(r11)     // Catch: java.lang.RuntimeException -> L2d7
        L357:
            t4.c r9 = ig.a.y(r13)     // Catch: java.lang.RuntimeException -> L2d7
            java.lang.Object[] r10 = r9.f22543h     // Catch: java.lang.RuntimeException -> L2d7
            int r10 = r10.length     // Catch: java.lang.RuntimeException -> L2d7
            if (r10 == 0) goto L377
            r4.e r10 = r6.f11431o     // Catch: java.lang.RuntimeException -> L2d7
            java.util.ArrayList r11 = r10.f11397n     // Catch: java.lang.RuntimeException -> L2d7
            if (r11 != 0) goto L36d
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.RuntimeException -> L2d7
            r11.<init>()     // Catch: java.lang.RuntimeException -> L2d7
            r10.f11397n = r11     // Catch: java.lang.RuntimeException -> L2d7
        L36d:
            java.util.ArrayList r10 = r10.f11397n     // Catch: java.lang.RuntimeException -> L2d7
            r4.m0 r11 = new r4.m0     // Catch: java.lang.RuntimeException -> L2d7
            r11.<init>(r14, r9, r3)     // Catch: java.lang.RuntimeException -> L2d7
            r10.add(r11)     // Catch: java.lang.RuntimeException -> L2d7
        L377:
            r4.j0 r9 = r3.f11485j     // Catch: java.lang.RuntimeException -> L2d7
            r9.m(r14)     // Catch: java.lang.RuntimeException -> L2d7
            int r11 = r23 + 1
            r10 = r20
            r9 = r22
            goto L23d
        L384:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "...while processing "
            r1.<init>(r2)
            v4.c0 r2 = r13.getName()
            java.lang.String r2 = r2.a()
            r1.append(r2)
            java.lang.String r2 = " "
            r1.append(r2)
            v4.c0 r2 = r13.e()
            java.lang.String r2 = r2.a()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            f4.a r0 = f4.a.b(r1, r0)
            throw r0
        L3af:
            r1.d()
            v4.e0 r2 = r1.f7150d
            v4.a[] r3 = r2.f14092h
            int r3 = r3.length
            r5 = 0
        L3b8:
            if (r5 >= r3) goto L4f1
            v4.a[] r9 = r2.f14092h     // Catch: java.lang.IndexOutOfBoundsException -> L4e0
            r9 = r9[r5]     // Catch: java.lang.IndexOutOfBoundsException -> L4e0
            boolean r10 = r9 instanceof v4.y
            if (r10 == 0) goto L3cb
            v4.e r9 = (v4.e) r9
            r4.m(r9)
        L3c7:
            r11 = 0
            r14 = 1
            goto L4dc
        L3cb:
            boolean r10 = r9 instanceof v4.p
            if (r10 == 0) goto L3d9
            v4.p r9 = (v4.p) r9
            v4.y r9 = r9.l()
            r4.m(r9)
            goto L3c7
        L3d9:
            boolean r10 = r9 instanceof v4.m
            if (r10 == 0) goto L3e3
            v4.m r9 = (v4.m) r9
            r0.m(r9)
            goto L3c7
        L3e3:
            boolean r10 = r9 instanceof v4.l
            if (r10 == 0) goto L3f1
            v4.l r9 = (v4.l) r9
            v4.m r9 = r9.k()
            r0.m(r9)
            goto L3c7
        L3f1:
            boolean r10 = r9 instanceof v4.x
            if (r10 == 0) goto L3fb
            v4.x r9 = (v4.x) r9
            r7.q(r9)
            goto L3c7
        L3fb:
            boolean r10 = r9 instanceof v4.q
            if (r10 == 0) goto L3c7
            v4.q r9 = (v4.q) r9
            int r10 = r9.f14114g
            r1.c()
            h4.u r11 = r1.f7157k
            java.lang.String r12 = "BootstrapMethods"
            h4.s r11 = r11.o(r12)
            h4.b r11 = (h4.b) r11
            if (r11 == 0) goto L415
            i4.c r11 = r11.f5072b
            goto L417
        L415:
            i4.c r11 = i4.c.f6442i
        L417:
            java.lang.Object r10 = r11.l(r10)
            i4.b r10 = (i4.b) r10
            v4.x r11 = r10.f6441b
            v4.z r12 = r9.f14115h
            h4.u r10 = r10.f6440a
            if (r11 == 0) goto L4d5
            if (r12 == 0) goto L4ce
            v4.c r13 = new v4.c
            java.lang.Object[] r14 = r10.f22543h
            int r14 = r14.length
            int r14 = r14 + 3
            r13.<init>(r14)
            r14 = 0
            r13.m(r14, r11)
            v4.c0 r11 = r12.f14131g
            r14 = 1
            r13.m(r14, r11)
            v4.a0 r11 = new v4.a0
            v4.c0 r12 = r12.f14132h
            java.lang.String r12 = r12.f14067g
            w4.a r12 = w4.a.b(r12)
            r11.<init>(r12)
            r12 = 2
            r13.m(r12, r11)
            r11 = 0
        L44d:
            java.lang.Object[] r15 = r10.f22543h
            int r15 = r15.length
            if (r11 >= r15) goto L463
            int r15 = r11 + 3
            java.lang.Object r17 = r10.l(r11)
            r12 = r17
            v4.a r12 = (v4.a) r12
            r13.m(r15, r12)
            int r11 = r11 + 1
            r12 = 2
            goto L44d
        L463:
            r11 = 0
            r13.f22555g = r11
            v4.h r10 = new v4.h
            r10.<init>(r13)
            r1.d()
            v4.d0 r12 = r1.f7152f
            v4.d0 r13 = r9.f14117j
            if (r13 != 0) goto L4c7
            if (r12 == 0) goto L4c0
            r9.f14117j = r12
            v4.h r12 = r9.f14118k
            if (r12 != 0) goto L4b9
            r9.f14118k = r10
            java.util.ArrayList r9 = r9.f14119l
            java.util.Iterator r9 = r9.iterator()
        L484:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L4dc
            java.lang.Object r10 = r9.next()
            v4.i r10 = (v4.i) r10
            monitor-enter(r8)
            if (r10 == 0) goto L4af
            r8.g()     // Catch: java.lang.Throwable -> L4ab
            java.util.TreeMap r12 = r8.f11403g     // Catch: java.lang.Throwable -> L4ab
            java.lang.Object r12 = r12.get(r10)     // Catch: java.lang.Throwable -> L4ab
            r4.f r12 = (r4.f) r12     // Catch: java.lang.Throwable -> L4ab
            if (r12 != 0) goto L4ad
            r4.f r12 = new r4.f     // Catch: java.lang.Throwable -> L4ab
            r12.<init>(r10)     // Catch: java.lang.Throwable -> L4ab
            java.util.TreeMap r13 = r8.f11403g     // Catch: java.lang.Throwable -> L4ab
            r13.put(r10, r12)     // Catch: java.lang.Throwable -> L4ab
            goto L4ad
        L4ab:
            r0 = move-exception
            goto L4b7
        L4ad:
            monitor-exit(r8)
            goto L484
        L4af:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L4ab
            java.lang.String r1 = "cstRef"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4ab
            throw r0     // Catch: java.lang.Throwable -> L4ab
        L4b7:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L4ab
            throw r0
        L4b9:
            java.lang.String r0 = "already added call site"
            j8.o.t(r0)
            goto L157
        L4c0:
            java.lang.String r0 = "declaringClass == null"
            bsh.j.c(r0)
            goto L157
        L4c7:
            java.lang.String r0 = "already added declaring class"
            j8.o.t(r0)
            goto L157
        L4ce:
            java.lang.String r0 = "nat == null"
            bsh.j.c(r0)
            goto L157
        L4d5:
            java.lang.String r0 = "bootstrapMethodHandle == null"
            bsh.j.c(r0)
            goto L157
        L4dc:
            int r5 = r5 + 1
            goto L3b8
        L4e0:
            f4.a r0 = new f4.a
            java.lang.String r1 = a.a.X0(r5)
            java.lang.String r2 = "invalid constant pool index "
            java.lang.String r1 = r2.concat(r1)
            r2 = 0
            r0.<init>(r1, r2)
            throw r0
        L4f1:
            return r6
    }

    public static final void a(h0.l r12, y0.c r13, s0.d r14, i0.h0 r15, int r16) {
            r0 = r16
            r3 = -1090171650(0xffffffffbf054cfe, float:-0.52070606)
            r15.b0(r3)
            r3 = r0 & 6
            r4 = 4
            if (r3 != 0) goto L21
            r3 = r0 & 8
            if (r3 != 0) goto L16
            boolean r3 = r15.f(r12)
            goto L1a
        L16:
            boolean r3 = r15.h(r12)
        L1a:
            if (r3 == 0) goto L1e
            r3 = r4
            goto L1f
        L1e:
            r3 = 2
        L1f:
            r3 = r3 | r0
            goto L22
        L21:
            r3 = r0
        L22:
            r5 = r0 & 48
            r6 = 32
            if (r5 != 0) goto L33
            boolean r5 = r15.f(r13)
            if (r5 == 0) goto L30
            r5 = r6
            goto L32
        L30:
            r5 = 16
        L32:
            r3 = r3 | r5
        L33:
            r5 = r0 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L43
            boolean r8 = r15.h(r14)
            if (r8 == 0) goto L40
            r8 = 256(0x100, float:3.59E-43)
            goto L42
        L40:
            r8 = 128(0x80, float:1.8E-43)
        L42:
            r3 = r3 | r8
        L43:
            r8 = r3 & 147(0x93, float:2.06E-43)
            r9 = 146(0x92, float:2.05E-43)
            r10 = 0
            r11 = 1
            if (r8 == r9) goto L4d
            r8 = r11
            goto L4e
        L4d:
            r8 = r10
        L4e:
            r9 = r3 & 1
            boolean r8 = r15.S(r9, r8)
            if (r8 == 0) goto L99
            r8 = r3 & 112(0x70, float:1.57E-43)
            if (r8 != r6) goto L5c
            r6 = r11
            goto L5d
        L5c:
            r6 = r10
        L5d:
            r8 = r3 & 14
            if (r8 == r4) goto L6d
            r4 = r3 & 8
            if (r4 == 0) goto L6c
            boolean r4 = r15.f(r12)
            if (r4 == 0) goto L6c
            goto L6d
        L6c:
            r11 = r10
        L6d:
            r4 = r6 | r11
            java.lang.Object r6 = r15.P()
            if (r4 != 0) goto L79
            i0.e r4 = i0.l.f5952a
            if (r6 != r4) goto L81
        L79:
            h0.k r6 = new h0.k
            r6.<init>(r13, r12)
            r15.k0(r6)
        L81:
            h0.k r6 = (h0.k) r6
            y2.c0 r5 = new y2.c0
            y2.d0 r4 = y2.d0.f22212g
            r5.<init>(r10, r4, r10)
            int r3 = r3 << 3
            r3 = r3 & 7168(0x1c00, float:1.0045E-41)
            r8 = r3 | 384(0x180, float:5.38E-43)
            r9 = 2
            r4 = 0
            r7 = r15
            r3 = r6
            r6 = r14
            y2.m.a(r3, r4, r5, r6, r7, r8, r9)
            goto L9c
        L99:
            r15.V()
        L9c:
            i0.r1 r6 = r15.t()
            if (r6 == 0) goto Laf
            b0.r r0 = new b0.r
            r5 = 3
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f6035d = r0
        Laf:
            return
    }

    public static final void b(h0.l r19, boolean r20, t2.j r21, boolean r22, long r23, float r25, y0.o r26, i0.h0 r27, int r28) {
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r26
            r11 = r27
            r12 = r28
            r0 = -466280168(0xffffffffe4352118, float:-1.3364981E22)
            r11.b0(r0)
            r0 = r12 & 6
            r1 = 4
            if (r0 != 0) goto L2d
            r0 = r12 & 8
            if (r0 != 0) goto L22
            boolean r0 = r11.f(r6)
            goto L26
        L22:
            boolean r0 = r11.h(r6)
        L26:
            if (r0 == 0) goto L2a
            r0 = r1
            goto L2b
        L2a:
            r0 = 2
        L2b:
            r0 = r0 | r12
            goto L2e
        L2d:
            r0 = r12
        L2e:
            r2 = r12 & 48
            r3 = 32
            if (r2 != 0) goto L3f
            boolean r2 = r11.g(r7)
            if (r2 == 0) goto L3c
            r2 = r3
            goto L3e
        L3c:
            r2 = 16
        L3e:
            r0 = r0 | r2
        L3f:
            r2 = r12 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L53
            int r2 = r8.ordinal()
            boolean r2 = r11.d(r2)
            if (r2 == 0) goto L50
            r2 = 256(0x100, float:3.59E-43)
            goto L52
        L50:
            r2 = 128(0x80, float:1.8E-43)
        L52:
            r0 = r0 | r2
        L53:
            r2 = r12 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L63
            boolean r2 = r11.g(r9)
            if (r2 == 0) goto L60
            r2 = 2048(0x800, float:2.87E-42)
            goto L62
        L60:
            r2 = 1024(0x400, float:1.435E-42)
        L62:
            r0 = r0 | r2
        L63:
            r2 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r2 != 0) goto L69
            r0 = r0 | 8192(0x2000, float:1.148E-41)
        L69:
            r2 = 1572864(0x180000, float:2.204052E-39)
            r2 = r2 & r12
            if (r2 != 0) goto L7a
            boolean r2 = r11.f(r10)
            if (r2 == 0) goto L77
            r2 = 1048576(0x100000, float:1.469368E-39)
            goto L79
        L77:
            r2 = 524288(0x80000, float:7.34684E-40)
        L79:
            r0 = r0 | r2
        L7a:
            r2 = 533651(0x82493, float:7.47804E-40)
            r2 = r2 & r0
            r4 = 533650(0x82492, float:7.47803E-40)
            r5 = 0
            if (r2 == r4) goto L86
            r2 = 1
            goto L87
        L86:
            r2 = r5
        L87:
            r4 = r0 & 1
            boolean r2 = r11.S(r4, r2)
            if (r2 == 0) goto L134
            r11.X()
            r2 = r12 & 1
            r4 = -57345(0xffffffffffff1fff, float:NaN)
            if (r2 == 0) goto La7
            boolean r2 = r11.B()
            if (r2 == 0) goto La0
            goto La7
        La0:
            r11.V()
            r0 = r0 & r4
            r14 = r23
            goto Lad
        La7:
            r0 = r0 & r4
            r14 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
        Lad:
            r11.q()
            t2.j r2 = t2.j.f13012h
            t2.j r4 = t2.j.f13011g
            if (r7 == 0) goto Lc5
            float r16 = h0.h0.f4902a
            if (r8 != r4) goto Lbc
            if (r9 == 0) goto Lc0
        Lbc:
            if (r8 != r2) goto Lc2
            if (r9 == 0) goto Lc2
        Lc0:
            r2 = 1
            goto Lc3
        Lc2:
            r2 = r5
        Lc3:
            r4 = r2
            goto Ld7
        Lc5:
            float r16 = h0.h0.f4902a
            if (r8 != r4) goto Lcb
            if (r9 == 0) goto Lcf
        Lcb:
            if (r8 != r2) goto Ld1
            if (r9 == 0) goto Ld1
        Lcf:
            r2 = 1
            goto Ld2
        Ld1:
            r2 = r5
        Ld2:
            if (r2 != 0) goto Ld6
            r4 = 1
            goto Ld7
        Ld6:
            r4 = r5
        Ld7:
            if (r4 == 0) goto Ldc
            y0.d r2 = y0.a.f21791b
            goto Lde
        Ldc:
            y0.d r2 = y0.a.f21790a
        Lde:
            r13 = r0 & 14
            if (r13 == r1) goto Lef
            r1 = r0 & 8
            if (r1 == 0) goto Led
            boolean r1 = r11.h(r6)
            if (r1 == 0) goto Led
            goto Lef
        Led:
            r1 = r5
            goto Lf0
        Lef:
            r1 = 1
        Lf0:
            r0 = r0 & 112(0x70, float:1.57E-43)
            if (r0 != r3) goto Lf5
            r5 = 1
        Lf5:
            r0 = r1 | r5
            boolean r1 = r11.g(r4)
            r0 = r0 | r1
            java.lang.Object r1 = r11.P()
            if (r0 != 0) goto L106
            i0.e r0 = i0.l.f5952a
            if (r1 != r0) goto L10e
        L106:
            fb.h0 r1 = new fb.h0
            r1.<init>(r6, r7, r4)
            r11.k0(r1)
        L10e:
            fg.l r1 = (fg.l) r1
            y0.o r5 = f2.o.a(r10, r1)
            i0.m2 r0 = y1.h1.f21958t
            java.lang.Object r0 = r11.j(r0)
            r1 = r0
            y1.l2 r1 = (y1.l2) r1
            h0.a r0 = new h0.a
            r17 = r14
            r14 = r2
            r2 = r17
            r0.<init>(r1, r2, r4, r5, r6)
            r1 = 1365123137(0x515e2041, float:5.962649E10)
            s0.d r0 = s0.i.e(r1, r0, r11)
            r1 = r13 | 384(0x180, float:5.38E-43)
            a(r6, r14, r0, r11, r1)
            goto L139
        L134:
            r11.V()
            r2 = r23
        L139:
            i0.r1 r11 = r11.t()
            if (r11 == 0) goto L14f
            h0.b r0 = new h0.b
            r1 = r6
            r4 = r9
            r9 = r12
            r5 = r2
            r2 = r7
            r3 = r8
            r8 = r10
            r7 = r25
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9)
            r11.f6035d = r0
        L14f:
            return
    }

    public static final void c(y0.o r4, fg.a r5, boolean r6, i0.h0 r7, int r8) {
            r0 = 2111672474(0x7ddd909a, float:3.6813775E37)
            r7.b0(r0)
            r0 = r8 & 6
            if (r0 != 0) goto L15
            boolean r0 = r7.f(r4)
            if (r0 == 0) goto L12
            r0 = 4
            goto L13
        L12:
            r0 = 2
        L13:
            r0 = r0 | r8
            goto L16
        L15:
            r0 = r8
        L16:
            boolean r1 = r7.h(r5)
            if (r1 == 0) goto L1f
            r1 = 32
            goto L21
        L1f:
            r1 = 16
        L21:
            r0 = r0 | r1
            boolean r1 = r7.g(r6)
            if (r1 == 0) goto L2b
            r1 = 256(0x100, float:3.59E-43)
            goto L2d
        L2b:
            r1 = 128(0x80, float:1.8E-43)
        L2d:
            r0 = r0 | r1
            r1 = r0 & 147(0x93, float:2.06E-43)
            r2 = 146(0x92, float:2.05E-43)
            r3 = 1
            if (r1 == r2) goto L37
            r1 = r3
            goto L38
        L37:
            r1 = 0
        L38:
            r0 = r0 & r3
            boolean r0 = r7.S(r0, r1)
            if (r0 == 0) goto L55
            float r0 = h0.h0.f4902a
            float r1 = h0.h0.f4903b
            y0.o r0 = p.h1.k(r4, r0, r1)
            h0.f r1 = new h0.f
            r2 = 0
            r1.<init>(r5, r6, r2)
            y0.o r0 = y0.a.a(r0, r1)
            p.d.c(r7, r0)
            goto L58
        L55:
            r7.V()
        L58:
            i0.r1 r7 = r7.t()
            if (r7 == 0) goto L65
            h0.e r0 = new h0.e
            r0.<init>(r4, r5, r6, r8)
            r7.f6035d = r0
        L65:
            return
    }

    public static final void d(y0.o r29, java.lang.String r30, long r31, long r33, long r35, boolean r37, fg.a r38, long r39, long r41, boolean r43, s0.d r44, i0.h0 r45, int r46, int r47) {
            r14 = r38
            r0 = r44
            r1 = r45
            r2 = r46
            r3 = r47
            r4 = 160138296(0x98b8438, float:3.358737E-33)
            r1.b0(r4)
            r4 = r2 & 6
            r5 = 1
            if (r4 != 0) goto L20
            boolean r4 = r1.g(r5)
            if (r4 == 0) goto L1d
            r4 = 4
            goto L1e
        L1d:
            r4 = 2
        L1e:
            r4 = r4 | r2
            goto L21
        L20:
            r4 = r2
        L21:
            r4 = r4 | 48
            r6 = r2 & 384(0x180, float:5.38E-43)
            r12 = r30
            if (r6 != 0) goto L35
            boolean r6 = r1.f(r12)
            if (r6 == 0) goto L32
            r6 = 256(0x100, float:3.59E-43)
            goto L34
        L32:
            r6 = 128(0x80, float:1.8E-43)
        L34:
            r4 = r4 | r6
        L35:
            r6 = r2 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L3b
            r4 = r4 | 1024(0x400, float:1.435E-42)
        L3b:
            r6 = r4 | 24576(0x6000, float:3.4438E-41)
            r7 = 196608(0x30000, float:2.75506E-40)
            r8 = r2 & r7
            if (r8 != 0) goto L47
            r6 = 90112(0x16000, float:1.26274E-40)
            r6 = r6 | r4
        L47:
            r4 = 1572864(0x180000, float:2.204052E-39)
            r8 = r2 & r4
            if (r8 != 0) goto L50
            r8 = 524288(0x80000, float:7.34684E-40)
            r6 = r6 | r8
        L50:
            r8 = 12582912(0xc00000, float:1.7632415E-38)
            r6 = r6 | r8
            r8 = 100663296(0x6000000, float:2.4074124E-35)
            r8 = r8 & r2
            if (r8 != 0) goto L64
            boolean r8 = r1.h(r14)
            if (r8 == 0) goto L61
            r8 = 67108864(0x4000000, float:1.5046328E-36)
            goto L63
        L61:
            r8 = 33554432(0x2000000, float:9.403955E-38)
        L63:
            r6 = r6 | r8
        L64:
            r8 = 805306368(0x30000000, float:4.656613E-10)
            r6 = r6 | r8
            r8 = r3 | 438(0x1b6, float:6.14E-43)
            r9 = r3 & 3072(0xc00, float:4.305E-42)
            if (r9 != 0) goto L79
            boolean r9 = r1.h(r0)
            if (r9 == 0) goto L76
            r9 = 2048(0x800, float:2.87E-42)
            goto L78
        L76:
            r9 = 1024(0x400, float:1.435E-42)
        L78:
            r8 = r8 | r9
        L79:
            r9 = 306783379(0x12492493, float:6.34695E-28)
            r9 = r9 & r6
            r10 = 306783378(0x12492492, float:6.3469493E-28)
            if (r9 != r10) goto L8b
            r9 = r8 & 1171(0x493, float:1.641E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r9 == r10) goto L89
            goto L8b
        L89:
            r9 = 0
            goto L8c
        L8b:
            r9 = r5
        L8c:
            r10 = r6 & 1
            boolean r9 = r1.S(r10, r9)
            if (r9 == 0) goto L1f3
            r1.X()
            r9 = r2 & 1
            r10 = -4135937(0xffffffffffc0e3ff, float:NaN)
            if (r9 == 0) goto Lbf
            boolean r9 = r1.B()
            if (r9 == 0) goto La5
            goto Lbf
        La5:
            r1.V()
            r6 = r6 & r10
            r13 = r29
            r15 = r31
            r2 = r33
            r19 = r35
            r9 = r39
            r21 = r41
            r17 = r7
            r18 = r8
            r7 = r43
            r8 = r6
            r6 = r37
            goto Lf6
        Lbf:
            int r9 = xh.i.f21695c
            i0.m2 r9 = bi.d.f892a
            java.lang.Object r13 = r1.j(r9)
            bi.b r13 = (bi.b) r13
            long r15 = r13.d()
            java.lang.Object r13 = r1.j(r9)
            bi.b r13 = (bi.b) r13
            i0.j1 r13 = r13.K
            java.lang.Object r13 = r13.getValue()
            f1.w r13 = (f1.w) r13
            r17 = r7
            r18 = r8
            long r7 = r13.f3133a
            java.lang.Object r9 = r1.j(r9)
            bi.b r9 = (bi.b) r9
            long r19 = r9.a()
            r6 = r6 & r10
            long r9 = xh.i.f21693a
            long r21 = xh.i.f21694b
            y0.l r13 = y0.l.f21818a
            r2 = r7
            r7 = r5
            r8 = r6
            r6 = r7
        Lf6:
            r1.q()
            java.util.WeakHashMap r23 = p.s1.f9986v
            r23 = r4
            p.s1 r4 = p.c.e(r1)
            p.b r4 = r4.f9992f
            p.j0 r4 = p.d.d(r4, r1)
            float r4 = r4.c()
            p.s1 r5 = p.c.e(r1)
            p.b r5 = r5.f9987a
            p.j0 r5 = p.d.d(r5, r1)
            float r5 = r5.c()
            p.s1 r11 = p.c.e(r1)
            p.b r11 = r11.f9988b
            p.j0 r11 = p.d.d(r11, r1)
            float r11 = r11.c()
            boolean r24 = r1.c(r4)
            boolean r25 = r1.c(r5)
            r24 = r24 | r25
            boolean r25 = r1.c(r11)
            r24 = r24 | r25
            r31 = r2
            java.lang.Object r2 = r1.P()
            if (r24 != 0) goto L143
            i0.e r3 = i0.l.f5952a
            if (r2 != r3) goto L16d
        L143:
            u2.f r2 = new u2.f
            r2.<init>(r4)
            u2.f r3 = new u2.f
            r3.<init>(r5)
            u2.f r4 = new u2.f
            r4.<init>(r11)
            int r5 = r3.compareTo(r4)
            if (r5 < 0) goto L159
            goto L15a
        L159:
            r3 = r4
        L15a:
            int r4 = r2.compareTo(r3)
            if (r4 < 0) goto L161
            goto L162
        L161:
            r2 = r3
        L162:
            u2.f r3 = new u2.f
            float r2 = r2.f13344g
            r3.<init>(r2)
            r1.k0(r3)
            r2 = r3
        L16d:
            u2.f r2 = (u2.f) r2
            float r2 = r2.f13344g
            i0.a1 r3 = i0.r.y(r14, r1)
            xh.q r4 = new xh.q
            r5 = 0
            r4.<init>(r3, r5)
            r5 = 548720147(0x20b4ce13, float:3.0629555E-19)
            s0.d r4 = s0.i.e(r5, r4, r1)
            u2.f r5 = new u2.f
            r5.<init>(r2)
            xh.l r2 = new xh.l
            r11 = 1
            r2.<init>(r3, r0, r11)
            r3 = -179734068(0xfffffffff54979cc, float:-2.5540088E32)
            s0.d r2 = s0.i.e(r3, r2, r1)
            r3 = r8 & 14
            r3 = r3 | r23
            int r11 = r18 << 12
            r23 = 57344(0xe000, float:8.0356E-41)
            r23 = r11 & r23
            r3 = r3 | r23
            r23 = 458752(0x70000, float:6.42848E-40)
            r11 = r11 & r23
            r3 = r3 | r11
            int r11 = r8 << 18
            r23 = 29360128(0x1c00000, float:7.052966E-38)
            r23 = r11 & r23
            r3 = r3 | r23
            r23 = 234881024(0xe000000, float:1.5777218E-30)
            r11 = r11 & r23
            r3 = r3 | r11
            int r11 = r8 << 15
            r23 = 1879048192(0x70000000, float:1.5845633E29)
            r11 = r11 & r23
            r3 = r3 | r11
            int r8 = r8 >> 21
            r11 = r8 & 14
            r11 = r11 | r17
            r17 = r8 & 112(0x70, float:1.57E-43)
            r11 = r11 | r17
            r8 = r8 & 896(0x380, float:1.256E-42)
            r8 = r8 | r11
            int r11 = r18 << 3
            r11 = r11 & 7168(0x1c00, float:1.0045E-41)
            r8 = r8 | r11
            r18 = r1
            r17 = r2
            r11 = r13
            r0 = r15
            r16 = r5
            r13 = r6
            r15 = r7
            r6 = r9
            r10 = r4
            r4 = r19
            r19 = r3
            r20 = r8
            r8 = r21
            r2 = r31
            g4.a.c(r0, r2, r4, r6, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r27 = r8
            r9 = r13
            r13 = r27
            r27 = r0
            r1 = r11
            r11 = r6
            r7 = r4
            r5 = r2
            r3 = r27
            goto L206
        L1f3:
            r45.V()
            r1 = r29
            r3 = r31
            r5 = r33
            r7 = r35
            r9 = r37
            r11 = r39
            r13 = r41
            r15 = r43
        L206:
            i0.r1 r0 = r45.t()
            if (r0 == 0) goto L222
            r2 = r0
            xh.r r0 = new xh.r
            r10 = r38
            r16 = r44
            r17 = r46
            r18 = r47
            r26 = r2
            r2 = r30
            r0.<init>(r1, r2, r3, r5, r7, r9, r10, r11, r13, r15, r16, r17, r18)
            r2 = r26
            r2.f6035d = r0
        L222:
            return
    }

    public static final long e(long r7, long r9) {
            r0 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r3 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            if (r2 == 0) goto L2e
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 != 0) goto L13
            goto L2e
        L13:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 == 0) goto L2d
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 != 0) goto L1c
            goto L2d
        L1c:
            long r1 = r7 + r9
            r3 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            r5 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            long r7 = r9.e0.s(r1, r3, r5)
            return r7
        L2d:
            return r9
        L2e:
            int r2 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r2 >= 0) goto L37
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 >= 0) goto L37
            goto L3e
        L37:
            long r9 = r9 ^ r7
            r0 = 0
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 < 0) goto L3f
        L3e:
            return r7
        L3f:
            r7 = 9223372036854759646(0x7fffffffffffc0de, double:NaN)
            return r7
    }

    public static java.lang.String f(java.lang.String r2, java.lang.String r3) {
            r3.getClass()
            int r0 = r3.length()
            if (r0 != 0) goto La
            goto L26
        La:
            int r0 = r2.length()
            if (r0 != 0) goto L11
            goto L1f
        L11:
            boolean r0 = r3.equals(r2)
            if (r0 == 0) goto L18
            goto L26
        L18:
            r0 = 0
            boolean r1 = og.t.d0(r3, r2, r0)
            if (r1 == 0) goto L20
        L1f:
            return r3
        L20:
            boolean r0 = og.t.d0(r2, r3, r0)
            if (r0 == 0) goto L27
        L26:
            return r2
        L27:
            java.lang.String r2 = r2.concat(r3)
            return r2
    }

    public static void g(org.json.JSONObject r12) {
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r2 = r0 / r2
            int r2 = (int) r2
            java.lang.String r3 = "4"
            r12.put(r3, r2)
            java.lang.String r2 = ""
            g8.a r3 = h.Hchat.hooks.api.core.WeChatApis.account()     // Catch: java.lang.Throwable -> L1f
            if (r3 == 0) goto L1f
            g8.a r3 = h.Hchat.hooks.api.core.WeChatApis.account()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r3 = r3.c()     // Catch: java.lang.Throwable -> L1f
            goto L20
        L1f:
            r3 = r2
        L20:
            java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat
            java.lang.String r5 = "ssHHmmMMddyy"
            java.util.Locale r6 = java.util.Locale.US
            r4.<init>(r5, r6)
            java.util.Date r5 = new java.util.Date
            r5.<init>(r0)
            java.lang.String r4 = r4.format(r5)
            if (r3 == 0) goto L8f
            int r5 = r3.length()
            r6 = 1
            if (r5 > r6) goto L3c
            goto L8f
        L3c:
            byte[] r3 = r3.getBytes()
            r5 = 0
            java.lang.String r6 = "MD5"
            java.security.MessageDigest r6 = java.security.MessageDigest.getInstance(r6)     // Catch: java.lang.Throwable -> L72
            byte[] r3 = r6.digest(r3)     // Catch: java.lang.Throwable -> L72
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L72
            r6.<init>()     // Catch: java.lang.Throwable -> L72
            int r7 = r3.length     // Catch: java.lang.Throwable -> L72
            r8 = r5
        L52:
            if (r8 >= r7) goto L6e
            r9 = r3[r8]     // Catch: java.lang.Throwable -> L72
            r9 = r9 & 255(0xff, float:3.57E-43)
            java.lang.String r9 = java.lang.Integer.toHexString(r9)     // Catch: java.lang.Throwable -> L72
            int r10 = r9.length()     // Catch: java.lang.Throwable -> L72
            r11 = 2
            if (r10 >= r11) goto L68
            r10 = 48
            r6.append(r10)     // Catch: java.lang.Throwable -> L72
        L68:
            r6.append(r9)     // Catch: java.lang.Throwable -> L72
            int r8 = r8 + 1
            goto L52
        L6e:
            java.lang.String r2 = r6.toString()     // Catch: java.lang.Throwable -> L72
        L72:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            r4 = 7
            int r6 = r2.length()
            int r4 = java.lang.Math.min(r4, r6)
            java.lang.String r2 = r2.substring(r5, r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            goto L95
        L8f:
            java.lang.String r2 = "fffffff"
            java.lang.String r2 = bc.e.i(r4, r2)
        L95:
            java.util.Locale r3 = java.util.Locale.US
            r4 = 65535(0xffff, double:3.23786E-319)
            long r4 = r0 % r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r5 = "%04x"
            java.lang.String r3 = java.lang.String.format(r3, r5, r4)
            r4 = 7
            long r0 = r0 % r4
            r4 = 100
            long r0 = r0 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r3)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            int r0 = r0.hashCode()
            java.lang.String r1 = "5"
            r12.put(r1, r0)
            return
    }

    public static java.lang.String h(int r0, int r1, java.lang.String r2) {
            if (r0 >= 0) goto L11
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}
            java.lang.String r1 = "%s (%s) must not be negative"
            java.lang.String r0 = r9.e0.I(r1, r0)
            return r0
        L11:
            if (r1 < 0) goto L26
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0, r1}
            java.lang.String r1 = "%s (%s) must not be greater than size (%s)"
            java.lang.String r0 = r9.e0.I(r1, r0)
            return r0
        L26:
            java.lang.String r0 = "negative size: "
            java.lang.String r0 = eh.a.l(r1, r0)
            j8.o.t(r0)
            r0 = 0
            return r0
    }

    public static boolean i(android.content.Context r2, java.lang.String r3) {
            r2.getClass()
            r3.getClass()
            java.lang.String r0 = "Hchat_block_at_all_notification_config"
            android.content.SharedPreferences r2 = ub.b.c(r2, r0)
            java.lang.String r0 = "block_at_all_notification_enable"
            r1 = 0
            boolean r0 = r2.getBoolean(r0, r1)
            if (r0 != 0) goto L16
            return r1
        L16:
            java.lang.String r0 = "block_at_all_notification_groups"
            boolean r1 = r2.contains(r0)
            if (r1 != 0) goto L20
            r2 = 1
            return r2
        L20:
            java.lang.String r1 = ""
            java.lang.String r2 = r2.getString(r0, r1)
            java.util.Set r2 = O(r2)
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            boolean r2 = r2.contains(r3)
            return r2
    }

    public static final java.lang.String j(java.lang.Number r2, java.lang.Number r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Random range is empty: ["
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = ", "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = ")."
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static final java.lang.Object k(x1.i r10, fg.a r11, yf.c r12) {
            r0 = r10
            y0.n r0 = (y0.n) r0
            y0.n r1 = r0.f21819g
            boolean r1 = r1.f21832t
            if (r1 != 0) goto Lb
            goto L9f
        Lb:
            if (r1 != 0) goto L12
            java.lang.String r1 = "visitAncestors called on an unattached node"
            u1.a.b(r1)
        L12:
            y0.n r0 = r0.f21819g
            y0.n r0 = r0.f21823k
            x1.f0 r1 = x1.k.w(r10)
        L1a:
            r2 = 0
            if (r1 == 0) goto L87
            x1.b1 r3 = r1.L
            y0.n r3 = r3.f20844f
            int r3 = r3.f21822j
            r4 = 524288(0x80000, float:7.34684E-40)
            r3 = r3 & r4
            if (r3 == 0) goto L78
        L28:
            if (r0 == 0) goto L78
            int r3 = r0.f21821i
            r3 = r3 & r4
            if (r3 == 0) goto L75
            r3 = r0
            r5 = r2
        L31:
            if (r3 == 0) goto L75
            boolean r6 = r3 instanceof c2.a
            if (r6 == 0) goto L39
            r2 = r3
            goto L87
        L39:
            int r6 = r3.f21821i
            r6 = r6 & r4
            if (r6 == 0) goto L70
            boolean r6 = r3 instanceof x1.j
            if (r6 == 0) goto L70
            r6 = r3
            x1.j r6 = (x1.j) r6
            y0.n r6 = r6.f20950v
            r7 = 0
        L48:
            r8 = 1
            if (r6 == 0) goto L6d
            int r9 = r6.f21821i
            r9 = r9 & r4
            if (r9 == 0) goto L6a
            int r7 = r7 + 1
            if (r7 != r8) goto L56
            r3 = r6
            goto L6a
        L56:
            if (r5 != 0) goto L61
            j0.b r5 = new j0.b
            r8 = 16
            y0.n[] r8 = new y0.n[r8]
            r5.<init>(r8)
        L61:
            if (r3 == 0) goto L67
            r5.b(r3)
            r3 = r2
        L67:
            r5.b(r6)
        L6a:
            y0.n r6 = r6.f21824l
            goto L48
        L6d:
            if (r7 != r8) goto L70
            goto L31
        L70:
            y0.n r3 = x1.k.e(r5)
            goto L31
        L75:
            y0.n r0 = r0.f21823k
            goto L28
        L78:
            x1.f0 r1 = r1.u()
            if (r1 == 0) goto L85
            x1.b1 r0 = r1.L
            if (r0 == 0) goto L85
            x1.b2 r0 = r0.f20843e
            goto L1a
        L85:
            r0 = r2
            goto L1a
        L87:
            c2.a r2 = (c2.a) r2
            if (r2 != 0) goto L8c
            goto L9f
        L8c:
            x1.i1 r10 = x1.k.v(r10)
            c1.b r0 = new c1.b
            r1 = 1
            r0.<init>(r11, r1, r10)
            java.lang.Object r10 = r2.A0(r10, r0, r12)
            xf.a r11 = xf.a.f21579g
            if (r10 != r11) goto L9f
            return r10
        L9f:
            sf.n r10 = sf.n.f12433a
            return r10
    }

    public static ud.p l(gf.a r4, java.util.ArrayList r5) {
            int r0 = r5.size()     // Catch: java.lang.Exception -> L1e
            r1 = 3
            int r0 = r0 - r1
            int r2 = r4.f4500j     // Catch: java.lang.Exception -> L1e
            int r0 = r0 + r2
            ud.p r2 = new ud.p     // Catch: java.lang.Exception -> L1e
            pd.k r3 = pd.k.V     // Catch: java.lang.Exception -> L1e
            r2.<init>(r3, r0)     // Catch: java.lang.Exception -> L1e
            java.lang.Object r0 = r5.get(r1)     // Catch: java.lang.Exception -> L1e
            nc.a r0 = (nc.a) r0     // Catch: java.lang.Exception -> L1e
            java.lang.Object r0 = r0.f9342h     // Catch: java.lang.Exception -> L1e
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L1e
            P(r0, r2, r5, r4)     // Catch: java.lang.Exception -> L1e
            return r2
        L1e:
            r4 = move-exception
            ud.p r5 = new ud.p
            pd.k r0 = pd.k.Q
            r1 = 0
            r5.<init>(r0, r1)
            md.a r0 = md.a.f8831m
            r5.w(r0)
            nd.p r0 = new nd.p
            java.lang.String r1 = r4.getMessage()
            java.lang.String r2 = "Failed to process dynamic string concat: "
            java.lang.String r1 = wb.en.g(r2, r1)
            r0.<init>(r1, r4)
            md.b r4 = md.b.f8848c
            r5.x(r4, r0)
            return r5
    }

    public static java.lang.String m(android.content.Context r7, java.lang.ClassLoader r8) {
            l8.i r7 = o8.k.a(r7, r8)
            java.lang.String r0 = r7.f7928c
            java.lang.String r1 = r7.f7929d
            long r2 = r7.f7926a
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r3 = r7.f7930e
            java.lang.String r4 = r7.f7931f
            java.lang.String r5 = r7.f7932g
            long r7 = r7.f7927b
            java.lang.String r6 = java.lang.String.valueOf(r7)
            java.lang.String[] r7 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6}
            java.util.List r0 = a.a.y0(r7)
            r4 = 0
            r5 = 62
            java.lang.String r1 = "|"
            r2 = 0
            r3 = 0
            java.lang.String r7 = tf.m.A1(r0, r1, r2, r3, r4, r5)
            return r7
    }

    public static final boolean n(java.util.ArrayList r14) {
            int r0 = r14.size()
            r1 = 2
            r2 = 1
            if (r0 >= r1) goto La
            goto Le7
        La:
            int r0 = r14.size()
            r1 = 0
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r5 = 32
            if (r0 > r2) goto L1c
            tf.t r14 = tf.t.f13167g
            goto L92
        L1c:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r6 = r14.get(r1)
            int r7 = r14.size()
            int r7 = r7 - r2
            r8 = r1
        L2b:
            if (r8 >= r7) goto L91
            int r8 = r8 + 1
            java.lang.Object r9 = r14.get(r8)
            r10 = r9
            f2.q r10 = (f2.q) r10
            f2.q r6 = (f2.q) r6
            e1.c r11 = r6.g()
            long r11 = r11.b()
            long r11 = r11 >> r5
            int r11 = (int) r11
            float r11 = java.lang.Float.intBitsToFloat(r11)
            e1.c r12 = r10.g()
            long r12 = r12.b()
            long r12 = r12 >> r5
            int r12 = (int) r12
            float r12 = java.lang.Float.intBitsToFloat(r12)
            float r11 = r11 - r12
            float r11 = java.lang.Math.abs(r11)
            e1.c r6 = r6.g()
            long r12 = r6.b()
            long r12 = r12 & r3
            int r6 = (int) r12
            float r6 = java.lang.Float.intBitsToFloat(r6)
            e1.c r10 = r10.g()
            long r12 = r10.b()
            long r12 = r12 & r3
            int r10 = (int) r12
            float r10 = java.lang.Float.intBitsToFloat(r10)
            float r6 = r6 - r10
            float r6 = java.lang.Math.abs(r6)
            int r10 = java.lang.Float.floatToRawIntBits(r11)
            long r10 = (long) r10
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r12 = (long) r6
            long r10 = r10 << r5
            long r12 = r12 & r3
            long r10 = r10 | r12
            e1.b r6 = new e1.b
            r6.<init>(r10)
            r0.add(r6)
            r6 = r9
            goto L2b
        L91:
            r14 = r0
        L92:
            int r0 = r14.size()
            if (r0 != r2) goto La1
            java.lang.Object r14 = tf.m.t1(r14)
            e1.b r14 = (e1.b) r14
            long r6 = r14.f2294a
            goto Ld6
        La1:
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto Lac
            java.lang.String r0 = "Empty collection can't be reduced."
            w2.a.c(r0)
        Lac:
            java.lang.Object r0 = tf.m.t1(r14)
            int r6 = r14.size()
            int r6 = r6 - r2
            if (r2 > r6) goto Ld2
            r7 = r2
        Lb8:
            java.lang.Object r8 = r14.get(r7)
            e1.b r8 = (e1.b) r8
            long r8 = r8.f2294a
            e1.b r0 = (e1.b) r0
            long r10 = r0.f2294a
            long r8 = e1.b.e(r10, r8)
            e1.b r0 = new e1.b
            r0.<init>(r8)
            if (r7 == r6) goto Ld2
            int r7 = r7 + 1
            goto Lb8
        Ld2:
            e1.b r0 = (e1.b) r0
            long r6 = r0.f2294a
        Ld6:
            long r8 = r6 >> r5
            int r14 = (int) r8
            float r14 = java.lang.Float.intBitsToFloat(r14)
            long r3 = r3 & r6
            int r0 = (int) r3
            float r0 = java.lang.Float.intBitsToFloat(r0)
            int r14 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r14 >= 0) goto Le8
        Le7:
            return r2
        Le8:
            return r1
    }

    public static void o(int r2, int r3) {
            if (r2 < 0) goto L6
            if (r2 < r3) goto L5
            goto L6
        L5:
            return
        L6:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = "index"
            if (r2 < 0) goto L2b
            if (r3 >= 0) goto L18
            java.lang.String r2 = "negative size: "
            java.lang.String r2 = eh.a.l(r3, r2)
            j8.o.t(r2)
            return
        L18:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2, r3}
            java.lang.String r3 = "%s (%s) must be less than size (%s)"
            java.lang.String r2 = r9.e0.I(r3, r2)
            goto L39
        L2b:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r1, r2}
            java.lang.String r3 = "%s (%s) must not be negative"
            java.lang.String r2 = r9.e0.I(r3, r2)
        L39:
            r0.<init>(r2)
            throw r0
    }

    public static void p(int r1, int r2, int r3) {
            if (r1 < 0) goto L8
            if (r2 < r1) goto L8
            if (r2 <= r3) goto L7
            goto L8
        L7:
            return
        L8:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            if (r1 < 0) goto L2d
            if (r1 > r3) goto L2d
            if (r2 < 0) goto L26
            if (r2 <= r3) goto L13
            goto L26
        L13:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1}
            java.lang.String r2 = "end index (%s) must not be less than start index (%s)"
            java.lang.String r1 = r9.e0.I(r2, r1)
            goto L33
        L26:
            java.lang.String r1 = "end index"
            java.lang.String r1 = h(r2, r3, r1)
            goto L33
        L2d:
            java.lang.String r2 = "start index"
            java.lang.String r1 = h(r1, r3, r2)
        L33:
            r0.<init>(r1)
            throw r0
    }

    public static v4.f0 q(v4.f0 r3, w4.c r4) {
            w4.c r0 = r3.getType()
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto Lb
            return r3
        Lb:
            int r0 = r4.f14879h
            r1 = 1
            if (r0 == r1) goto L7e
            r1 = 2
            if (r0 == r1) goto L66
            r1 = 3
            if (r0 == r1) goto L4e
            r1 = 8
            if (r0 != r1) goto L32
            v4.o r3 = (v4.o) r3
            int r3 = r3.f14121g
            short r4 = (short) r3
            if (r4 != r3) goto L27
            v4.b0 r3 = new v4.b0
            r3.<init>(r4)
            return r3
        L27:
            java.lang.String r4 = "bogus short value: "
            java.lang.String r3 = eh.a.l(r3, r4)
            j8.o.t(r3)
            r3 = 0
            return r3
        L32:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "can't coerce "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = " to "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L4e:
            v4.o r3 = (v4.o) r3
            int r3 = r3.f14121g
            char r4 = (char) r3
            if (r4 != r3) goto L5b
            v4.j r3 = new v4.j
            r3.<init>(r4)
            return r3
        L5b:
            java.lang.String r4 = "bogus char value: "
            java.lang.String r3 = eh.a.l(r3, r4)
            j8.o.t(r3)
            r3 = 0
            return r3
        L66:
            v4.o r3 = (v4.o) r3
            int r3 = r3.f14121g
            byte r4 = (byte) r3
            if (r4 != r3) goto L73
            v4.g r3 = new v4.g
            r3.<init>(r4)
            return r3
        L73:
            java.lang.String r4 = "bogus byte value: "
            java.lang.String r3 = eh.a.l(r3, r4)
            j8.o.t(r3)
            r3 = 0
            return r3
        L7e:
            v4.o r3 = (v4.o) r3
            int r3 = r3.f14121g
            v4.f r3 = v4.f.n(r3)
            return r3
    }

    public static final f1.g r(c1.d r25, float r26) {
            r0 = r25
            r3 = r26
            double r1 = (double) r3
            double r1 = java.lang.Math.ceil(r1)
            float r1 = (float) r1
            int r1 = (int) r1
            int r1 = r1 * 2
            f1.g r2 = r9.e0.f11684g
            f1.b r4 = r9.e0.f11685h
            h1.b r5 = r9.e0.f11686i
            if (r2 == 0) goto L29
            if (r4 == 0) goto L29
            android.graphics.Bitmap r6 = r2.f3055a
            int r7 = r6.getWidth()
            if (r1 > r7) goto L29
            int r6 = r6.getHeight()
            if (r1 <= r6) goto L26
            goto L29
        L26:
            r7 = r2
            r8 = r4
            goto L37
        L29:
            r2 = 1
            f1.g r2 = f1.c0.e(r1, r1, r2)
            r9.e0.f11684g = r2
            f1.b r4 = f1.c0.a(r2)
            r9.e0.f11685h = r4
            goto L26
        L37:
            if (r5 != 0) goto L40
            h1.b r5 = new h1.b
            r5.<init>()
            r9.e0.f11686i = r5
        L40:
            r9 = r5
            h1.a r1 = r9.f5037g
            c1.a r2 = r0.f979g
            u2.m r2 = r2.getLayoutDirection()
            android.graphics.Bitmap r4 = r7.f3055a
            int r5 = r4.getWidth()
            float r5 = (float) r5
            int r4 = r4.getHeight()
            float r4 = (float) r4
            int r5 = java.lang.Float.floatToRawIntBits(r5)
            long r5 = (long) r5
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r10 = (long) r4
            r4 = 32
            long r5 = r5 << r4
            r17 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r10 & r17
            long r5 = r5 | r10
            u2.c r10 = r1.f5033a
            u2.m r11 = r1.f5034b
            f1.u r12 = r1.f5035c
            long r13 = r1.f5036d
            r1.f5033a = r0
            r1.f5034b = r2
            r1.f5035c = r8
            r1.f5036d = r5
            r8.e()
            r0 = r10
            r2 = r11
            long r10 = f1.w.f3126b
            r5 = r12
            r14 = r13
            long r12 = r9.a()
            r19 = r14
            r15 = 0
            r16 = 58
            r14 = 0
            r21 = r19
            h1.d.Z(r9, r10, r12, r14, r15, r16)
            r19 = 4278190080(0xff000000, double:2.113706745E-314)
            long r10 = f1.c0.d(r19)
            int r6 = java.lang.Float.floatToRawIntBits(r3)
            long r12 = (long) r6
            int r6 = java.lang.Float.floatToRawIntBits(r3)
            long r14 = (long) r6
            long r12 = r12 << r4
            long r14 = r14 & r17
            long r12 = r12 | r14
            r15 = 0
            r16 = 120(0x78, float:1.68E-43)
            r14 = 0
            h1.d.Z(r9, r10, r12, r14, r15, r16)
            long r10 = f1.c0.d(r19)
            int r6 = java.lang.Float.floatToRawIntBits(r3)
            long r12 = (long) r6
            int r6 = java.lang.Float.floatToRawIntBits(r3)
            long r14 = (long) r6
            long r12 = r12 << r4
            long r14 = r14 & r17
            long r12 = r12 | r14
            r6 = 120(0x78, float:1.68E-43)
            r23 = r12
            r12 = r5
            r4 = r23
            r23 = r10
            r10 = r0
            r11 = r2
            r0 = r9
            r9 = r1
            r1 = r23
            h1.d.O(r0, r1, r3, r4, r6)
            r8.p()
            r9.f5033a = r10
            r9.f5034b = r11
            r9.f5035c = r12
            r14 = r21
            r9.f5036d = r14
            return r7
    }

    public static java.util.List s() {
            k9.j r0 = new k9.j
            java.lang.String r5 = ""
            r7 = 1
            java.lang.String r1 = "plugin_agent"
            java.lang.String r2 = "插件 Agent"
            java.lang.String r3 = "plugin_agent"
            java.lang.String r4 = ""
            r6 = r5
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            k9.j r1 = new k9.j
            java.lang.String r6 = ""
            r8 = 1
            java.lang.String r2 = "module_settings"
            java.lang.String r3 = "设置"
            java.lang.String r4 = "module_settings"
            java.lang.String r5 = ""
            r7 = r6
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            k9.j r2 = new k9.j
            java.lang.String r7 = ""
            r9 = 1
            java.lang.String r3 = "scan"
            java.lang.String r4 = "扫一扫"
            java.lang.String r5 = "activity"
            java.lang.String r6 = "com.tencent.mm.plugin.scanner.ui.BaseScanUI"
            r8 = r7
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            k9.j r3 = new k9.j
            java.lang.String r8 = ""
            r10 = 1
            java.lang.String r4 = "moments"
            java.lang.String r5 = "朋友圈"
            java.lang.String r6 = "activity"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI"
            r9 = r8
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            k9.j r4 = new k9.j
            java.lang.String r9 = ""
            r11 = 1
            java.lang.String r5 = "finder"
            java.lang.String r6 = "视频号"
            java.lang.String r7 = "activity"
            java.lang.String r8 = "com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI"
            r10 = r9
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            k9.j r5 = new k9.j
            java.lang.String r10 = ""
            r12 = 1
            java.lang.String r6 = "favorite"
            java.lang.String r7 = "收藏"
            java.lang.String r8 = "activity"
            java.lang.String r9 = "com.tencent.mm.plugin.fav.ui.FavoriteIndexUI"
            r11 = r10
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            k9.j r6 = new k9.j
            java.lang.String r11 = ""
            r13 = 1
            java.lang.String r7 = "wallet"
            java.lang.String r8 = "钱包"
            java.lang.String r9 = "activity"
            java.lang.String r10 = "com.tencent.mm.plugin.mall.ui.MallIndexUIv2"
            r12 = r11
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            k9.j[] r0 = new k9.j[]{r0, r1, r2, r3, r4, r5, r6}
            java.util.List r0 = a.a.y0(r0)
            return r0
    }

    public static ua.c t(p4.t r2, java.util.List r3, ua.c r4) {
            r3.getClass()
            java.lang.String r0 = "transfer_rule_default_template_id"
            java.lang.String r1 = ""
            java.lang.String r2 = r2.y(r0, r1)
            java.util.Iterator r3 = r3.iterator()
        Lf:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r3.next()
            r1 = r0
            ua.i r1 = (ua.i) r1
            java.lang.String r1 = r1.f13623a
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lf
            goto L26
        L25:
            r0 = 0
        L26:
            ua.i r0 = (ua.i) r0
            if (r0 == 0) goto L31
            java.lang.String r2 = r0.f13624b
            ua.c r2 = ig.a.d(r0, r2, r4)
            return r2
        L31:
            return r4
    }

    public static final void u(h1.d r18, i1.b r19) {
            r0 = r19
            b5.c r1 = r18.z0()
            f1.u r1 = r1.p()
            b5.c r2 = r18.z0()
            java.lang.Object r2 = r2.f470b
            i1.b r2 = (i1.b) r2
            i1.d r3 = r0.f6133a
            boolean r4 = r0.f6151s
            if (r4 == 0) goto L1a
            goto L1e4
        L1a:
            r0.a()
            boolean r4 = r3.A()
            if (r4 != 0) goto L2e
            i1.d r4 = r0.f6133a     // Catch: java.lang.Throwable -> L2e
            u2.c r5 = r0.f6134b     // Catch: java.lang.Throwable -> L2e
            u2.m r6 = r0.f6135c     // Catch: java.lang.Throwable -> L2e
            b1.f r7 = r0.f6137e     // Catch: java.lang.Throwable -> L2e
            r4.m(r5, r6, r0, r7)     // Catch: java.lang.Throwable -> L2e
        L2e:
            float r4 = r3.M()
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            r5 = 1
            if (r4 <= 0) goto L3a
            r4 = r5
            goto L3b
        L3a:
            r4 = 0
        L3b:
            if (r4 == 0) goto L40
            r1.r()
        L40:
            android.graphics.Canvas r7 = f1.c.a(r1)
            boolean r13 = r7.isHardwareAccelerated()
            if (r13 != 0) goto Lb5
            long r8 = r0.f6152t
            r10 = 32
            long r11 = r8 >> r10
            int r11 = (int) r11
            float r11 = (float) r11
            r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r8 & r14
            int r8 = (int) r8
            float r9 = (float) r8
            r8 = r7
            long r6 = r0.f6153u
            r16 = r14
            long r14 = r6 >> r10
            int r10 = (int) r14
            float r10 = (float) r10
            float r10 = r10 + r11
            long r6 = r6 & r16
            int r6 = (int) r6
            float r6 = (float) r6
            float r6 = r6 + r9
            float r7 = r3.a()
            f1.n r12 = r3.x()
            int r14 = r3.O()
            r15 = 1065353216(0x3f800000, float:1.0)
            int r15 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r15 < 0) goto L8d
            r15 = 3
            if (r14 != r15) goto L8d
            if (r12 != 0) goto L8d
            int r15 = r3.w()
            if (r15 != r5) goto L87
            goto L8d
        L87:
            r8.save()
            r7 = r8
            r8 = r11
            goto Lab
        L8d:
            f1.h r15 = r0.f6148p
            if (r15 != 0) goto L97
            f1.h r15 = f1.c0.f()
            r0.f6148p = r15
        L97:
            r15.u(r7)
            r15.v(r14)
            r15.x(r12)
            java.lang.Object r7 = r15.f3058i
            r12 = r7
            android.graphics.Paint r12 = (android.graphics.Paint) r12
            r7 = r8
            r8 = r11
            r11 = r6
            r7.saveLayer(r8, r9, r10, r11, r12)
        Lab:
            r7.translate(r8, r9)
            android.graphics.Matrix r6 = r3.K()
            r7.concat(r6)
        Lb5:
            if (r13 != 0) goto Lbd
            boolean r6 = r0.f6155w
            if (r6 == 0) goto Lbd
            r6 = r5
            goto Lbe
        Lbd:
            r6 = 0
        Lbe:
            if (r6 == 0) goto L102
            r1.e()
            f1.c0 r8 = r0.d()
            boolean r9 = r8 instanceof f1.k0
            if (r9 == 0) goto Ld3
            f1.k0 r8 = (f1.k0) r8
            e1.c r8 = r8.f3073f
            f1.u.k(r1, r8)
            goto L102
        Ld3:
            boolean r9 = r8 instanceof f1.l0
            if (r9 == 0) goto Lf2
            f1.j r9 = r0.f6145m
            if (r9 == 0) goto Le1
            android.graphics.Path r10 = r9.f3067a
            r10.rewind()
            goto Le7
        Le1:
            f1.j r9 = f1.l.a()
            r0.f6145m = r9
        Le7:
            f1.l0 r8 = (f1.l0) r8
            e1.d r8 = r8.f3074f
            f1.j.c(r9, r8)
            r1.d(r9)
            goto L102
        Lf2:
            boolean r9 = r8 instanceof f1.j0
            if (r9 == 0) goto Lfe
            f1.j0 r8 = (f1.j0) r8
            f1.j r8 = r8.f3071f
            r1.d(r8)
            goto L102
        Lfe:
            okio.a.k()
            return
        L102:
            if (r2 == 0) goto L159
            b.f r2 = r2.f6150r
            boolean r8 = r2.f334a
            if (r8 != 0) goto L10f
            java.lang.String r8 = "Only add dependencies during a tracking"
            f1.g0.a(r8)
        L10f:
            java.lang.Object r8 = r2.f337d
            f.l0 r8 = (f.l0) r8
            r9 = 0
            if (r8 == 0) goto L11a
            r8.a(r0)
            goto L13b
        L11a:
            java.lang.Object r8 = r2.f335b
            i1.b r8 = (i1.b) r8
            if (r8 == 0) goto L139
            f.l0 r8 = f.s0.f2899a
            f.l0 r8 = new f.l0
            r8.<init>()
            java.lang.Object r10 = r2.f335b
            i1.b r10 = (i1.b) r10
            r10.getClass()
            r8.a(r10)
            r8.a(r0)
            r2.f337d = r8
            r2.f335b = r9
            goto L13b
        L139:
            r2.f335b = r0
        L13b:
            java.lang.Object r8 = r2.f338e
            f.l0 r8 = (f.l0) r8
            if (r8 == 0) goto L147
            boolean r2 = r8.l(r0)
            r2 = r2 ^ r5
            goto L152
        L147:
            java.lang.Object r8 = r2.f336c
            i1.b r8 = (i1.b) r8
            if (r8 == r0) goto L14f
            r2 = r5
            goto L152
        L14f:
            r2.f336c = r9
            r2 = 0
        L152:
            if (r2 == 0) goto L159
            int r2 = r0.f6149q
            int r2 = r2 + r5
            r0.f6149q = r2
        L159:
            r2 = r1
            f1.b r2 = (f1.b) r2
            android.graphics.Canvas r2 = r2.f3025a
            boolean r2 = r2.isHardwareAccelerated()
            if (r2 != 0) goto L1cd
            h1.b r2 = r0.f6147o
            if (r2 != 0) goto L16f
            h1.b r2 = new h1.b
            r2.<init>()
            r0.f6147o = r2
        L16f:
            b5.c r3 = r2.f5038h
            u2.c r5 = r0.f6134b
            u2.m r8 = r0.f6135c
            long r9 = r0.f6153u
            long r9 = r9.e0.q0(r9)
            u2.c r11 = r3.s()
            u2.m r12 = r3.u()
            f1.u r14 = r3.p()
            r18 = r6
            r15 = r7
            long r6 = r3.v()
            r16 = r4
            java.lang.Object r4 = r3.f470b
            i1.b r4 = (i1.b) r4
            r3.R(r5)
            r3.S(r8)
            r3.P(r1)
            r3.U(r9)
            r3.f470b = r0
            r1.e()
            r0.c(r2)     // Catch: java.lang.Throwable -> L1ba
            r1.p()
            r3.R(r11)
            r3.S(r12)
            r3.P(r14)
            r3.U(r6)
            r3.f470b = r4
            goto L1d5
        L1ba:
            r0 = move-exception
            r1.p()
            r3.R(r11)
            r3.S(r12)
            r3.P(r14)
            r3.U(r6)
            r3.f470b = r4
            throw r0
        L1cd:
            r16 = r4
            r18 = r6
            r15 = r7
            r3.N(r1)
        L1d5:
            if (r18 == 0) goto L1da
            r1.p()
        L1da:
            if (r16 == 0) goto L1df
            r1.g()
        L1df:
            if (r13 != 0) goto L1e4
            r15.restore()
        L1e4:
            return
    }

    public static final long v(long r3) {
            l3.w r0 = pg.a.f10555g
            r1 = 1
            long r3 = r3 << r1
            r1 = 1
            long r3 = r3 + r1
            r0.getClass()
            int r0 = pg.b.f10558a
            return r3
    }

    public static org.json.JSONArray w(java.util.List r6) {
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r6 = r6.iterator()
        L13:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L2c
            java.lang.Object r3 = r6.next()
            r4 = r3
            k9.j r4 = (k9.j) r4
            java.lang.String r4 = r4.f7503a
            boolean r4 = r1.add(r4)
            if (r4 == 0) goto L13
            r2.add(r3)
            goto L13
        L2c:
            java.util.Iterator r6 = r2.iterator()
        L30:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto La1
            java.lang.Object r1 = r6.next()
            k9.j r1 = (k9.j) r1
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = r1.f7503a
            java.lang.String r4 = r1.f7505c
            java.lang.String r5 = "id"
            r2.put(r5, r3)
            java.lang.String r3 = r1.f7504b
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "title"
            r2.put(r5, r3)
            java.lang.String r3 = "actionType"
            r2.put(r3, r4)
            java.lang.String r3 = "activity"
            boolean r3 = gg.l.a(r4, r3)
            if (r3 == 0) goto L71
            java.lang.String r3 = r1.f7506d
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            goto L73
        L71:
            java.lang.String r3 = ""
        L73:
            java.lang.String r4 = "target"
            r2.put(r4, r3)
            java.lang.String r3 = r1.f7507e
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "iconPath"
            r2.put(r4, r3)
            java.lang.String r3 = r1.f7508f
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "darkIconPath"
            r2.put(r4, r3)
            java.lang.String r3 = "enabled"
            boolean r1 = r1.f7509g
            r2.put(r3, r1)
            r0.put(r2)
            goto L30
        La1:
            return r0
    }

    public static java.lang.reflect.Method x(android.content.Context r5, android.content.SharedPreferences r6, java.lang.String r7, org.luckypray.dexkit.DexKitBridge r8, java.lang.ClassLoader r9, java.lang.String r10, java.lang.String... r11) {
            java.lang.reflect.Method r0 = K(r6, r7, r9, r10)
            if (r0 == 0) goto L7
            return r0
        L7:
            r0 = 0
            ch.e r1 = new ch.e     // Catch: java.lang.Throwable -> L31
            r1.<init>()     // Catch: java.lang.Throwable -> L31
            fh.k r2 = new fh.k     // Catch: java.lang.Throwable -> L31
            r2.<init>()     // Catch: java.lang.Throwable -> L31
            java.util.List r3 = tf.l.L0(r11)     // Catch: java.lang.Throwable -> L31
            fh.k.u0(r2, r3)     // Catch: java.lang.Throwable -> L31
            r1.f1666h = r2     // Catch: java.lang.Throwable -> L31
            hh.p r8 = r8.findMethod(r1)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r8 = r8.a()     // Catch: java.lang.Throwable -> L31
            hh.o r8 = (hh.o) r8     // Catch: java.lang.Throwable -> L31
            if (r8 == 0) goto L33
            java.lang.String r1 = r8.f5568j     // Catch: java.lang.Throwable -> L31
            S(r6, r7, r10, r1)     // Catch: java.lang.Throwable -> L31
            java.lang.reflect.Method r8 = r8.r(r9)     // Catch: java.lang.Throwable -> L31
            goto L3b
        L31:
            r8 = move-exception
            goto L35
        L33:
            r8 = r0
            goto L3b
        L35:
            sf.f r9 = new sf.f
            r9.<init>(r8)
            r8 = r9
        L3b:
            java.lang.Throwable r9 = sf.g.b(r8)
            r1 = 63
            if (r9 != 0) goto L44
            goto L54
        L44:
            java.lang.String r8 = tf.l.F0(r11, r0, r1)
            java.lang.String r2 = r9.getMessage()
            java.lang.String r3 = "[Hchat:Tablet] 定位失败: "
            java.lang.String r4 = " "
            eh.a.w(r3, r8, r4, r2, r9)
            r8 = r0
        L54:
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            if (r8 != 0) goto L8a
            android.content.SharedPreferences$Editor r6 = r6.edit()     // Catch: java.lang.Throwable -> L69
            java.lang.String r9 = "cache_key"
            android.content.SharedPreferences$Editor r6 = r6.putString(r9, r7)     // Catch: java.lang.Throwable -> L69
            android.content.SharedPreferences$Editor r6 = r6.remove(r10)     // Catch: java.lang.Throwable -> L69
            r6.apply()     // Catch: java.lang.Throwable -> L69
        L69:
            java.lang.String r6 = tf.l.F0(r11, r0, r1)
            java.lang.String r5 = r5.getPackageName()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r9 = "[Hchat:Tablet] 未命中方法: "
            r7.<init>(r9)
            r7.append(r6)
            java.lang.String r6 = " pkg="
            r7.append(r6)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            fb.v0.m(r5)
        L8a:
            return r8
    }

    public static java.lang.Long y(android.content.ContentValues r5, java.lang.String... r6) {
            int r0 = r6.length
            r1 = 0
        L2:
            r2 = 0
            if (r1 < r0) goto L6
            return r2
        L6:
            r3 = r6[r1]
            java.lang.Object r3 = r5.get(r3)
            if (r3 == 0) goto L41
            boolean r4 = r3 instanceof java.lang.Number
            if (r4 == 0) goto L1d
            java.lang.Number r3 = (java.lang.Number) r3
            long r5 = r3.longValue()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            return r5
        L1d:
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = J(r3)
            if (r3 == 0) goto L41
            long r5 = java.lang.Long.parseUnsignedLong(r3)     // Catch: java.lang.Throwable -> L30
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L30
            goto L37
        L30:
            r5 = move-exception
            sf.f r6 = new sf.f
            r6.<init>(r5)
            r5 = r6
        L37:
            boolean r6 = r5 instanceof sf.f
            if (r6 == 0) goto L3d
            goto L3e
        L3d:
            r2 = r5
        L3e:
            java.lang.Long r2 = (java.lang.Long) r2
            return r2
        L41:
            int r1 = r1 + 1
            goto L2
    }

    public static ha.c0 z(java.lang.Object r14, p8.d0 r15) {
            r14.getClass()
            java.lang.Class r0 = r14.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.SnsInfo"
            boolean r0 = r0.equals(r1)
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r2
            goto L5a
        L17:
            java.lang.String r0 = "convertTo"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L26
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invokeMethod(r14, r0, r3)     // Catch: java.lang.Throwable -> L26
            boolean r3 = r0 instanceof android.content.ContentValues     // Catch: java.lang.Throwable -> L26
            if (r3 == 0) goto L28
            android.content.ContentValues r0 = (android.content.ContentValues) r0     // Catch: java.lang.Throwable -> L26
            goto L29
        L26:
            r0 = move-exception
            goto L33
        L28:
            r0 = r2
        L29:
            if (r0 == 0) goto L31
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L26
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L26
            goto L38
        L31:
            r3 = r2
            goto L38
        L33:
            sf.f r3 = new sf.f
            r3.<init>(r0)
        L38:
            java.lang.Throwable r0 = sf.g.b(r3)
            if (r0 == 0) goto L53
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "朋友圈记录导出失败: "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r15.l(r0)
        L53:
            boolean r15 = r3 instanceof sf.f
            if (r15 == 0) goto L58
            r3 = r2
        L58:
            android.content.ContentValues r3 = (android.content.ContentValues) r3
        L5a:
            if (r3 == 0) goto L10f
            java.lang.String r15 = "field_snsId"
            java.lang.String r0 = "svrId"
            java.lang.String r4 = "snsId"
            java.lang.String[] r15 = new java.lang.String[]{r4, r15, r0}
            java.lang.Long r15 = y(r3, r15)
            if (r15 == 0) goto L10f
            long r6 = r15.longValue()
            r4 = 0
            int r15 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r15 != 0) goto L78
            goto L10f
        L78:
            java.lang.String r15 = "userName"
            java.lang.String r0 = "field_userName"
            java.lang.String[] r15 = new java.lang.String[]{r15, r0}
        L80:
            r0 = 2
            if (r1 < r0) goto L86
            java.lang.String r15 = ""
            goto L99
        L86:
            r8 = r15[r1]
            java.lang.String r8 = r3.getAsString(r8)
            if (r8 == 0) goto L109
            boolean r9 = og.m.t0(r8)
            if (r9 != 0) goto L95
            goto L96
        L95:
            r8 = r2
        L96:
            if (r8 == 0) goto L109
            r15 = r8
        L99:
            java.lang.CharSequence r15 = og.m.R0(r15)
            java.lang.String r8 = r15.toString()
            boolean r15 = og.m.t0(r8)
            if (r15 == 0) goto La9
            goto L10f
        La9:
            java.lang.String r15 = "timestamp"
            java.lang.String r1 = "field_timestamp"
            java.lang.String r2 = "createTime"
            java.lang.String r9 = "field_createTime"
            java.lang.String r10 = "create_time"
            java.lang.String[] r15 = new java.lang.String[]{r2, r9, r10, r15, r1}
            java.lang.Long r15 = y(r3, r15)
            if (r15 == 0) goto Lc1
            long r4 = r15.longValue()
        Lc1:
            r9 = r4
            java.lang.String r15 = "type"
            java.lang.String r1 = "field_type"
            java.lang.String[] r15 = new java.lang.String[]{r15, r1}
            java.lang.Long r15 = y(r3, r15)
            if (r15 == 0) goto Ld6
            long r1 = r15.longValue()
            int r15 = (int) r1
            goto Ld7
        Ld6:
            r15 = -1
        Ld7:
            java.lang.String r12 = r9.e0.L(r14)
            ha.c0 r4 = new ha.c0
            java.lang.String r5 = java.lang.Long.toUnsignedString(r6)
            r5.getClass()
            a2.a r1 = ha.d0.f5186h
            r1.getClass()
            r1 = 1
            if (r15 == r1) goto L101
            if (r15 == r0) goto Lfe
            r0 = 15
            if (r15 == r0) goto Lfb
            r0 = 54
            if (r15 == r0) goto L101
            ha.d0 r15 = ha.d0.f5190l
        Lf8:
            r13 = r14
            r11 = r15
            goto L104
        Lfb:
            ha.d0 r15 = ha.d0.f5189k
            goto Lf8
        Lfe:
            ha.d0 r15 = ha.d0.f5187i
            goto Lf8
        L101:
            ha.d0 r15 = ha.d0.f5188j
            goto Lf8
        L104:
            r4.<init>(r5, r6, r8, r9, r11, r12, r13)
            r2 = r4
            goto L10f
        L109:
            r13 = r14
            int r1 = r1 + 1
            r14 = r13
            goto L80
        L10f:
            return r2
    }
}
