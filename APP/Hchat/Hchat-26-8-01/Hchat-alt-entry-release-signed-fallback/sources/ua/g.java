package ua;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ua.g f13616a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f13617b;

    static {
            ua.g r0 = new ua.g
            r0.<init>()
            ua.g.f13616a = r0
            return
    }

    public static java.lang.String a(int r1, long r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.String b() {
            i8.a r0 = h.Hchat.hooks.api.core.WeChatApis.contact()
            r0.getClass()
            g8.a r0 = h.Hchat.hooks.api.core.WeChatApis.a()
            if (r0 == 0) goto L12
            java.lang.String r0 = r0.c()
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 != 0) goto L17
            java.lang.String r0 = ""
        L17:
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto L28
            java.lang.String r0 = "transfer_receive_accounts"
            return r0
        L28:
            java.lang.String r1 = "transfer_receive_accounts."
            java.lang.String r0 = r1.concat(r0)
            return r0
    }

    public static void c(java.lang.Object r3, java.util.ArrayList r4) {
            boolean r0 = r3 instanceof org.json.JSONObject
            if (r0 == 0) goto L25
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            java.util.List r0 = i(r3)
            tf.r.h1(r4, r0)
            java.util.Iterator r0 = r3.keys()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r3.opt(r1)
            c(r1, r4)
            goto L11
        L25:
            boolean r0 = r3 instanceof org.json.JSONArray
            if (r0 == 0) goto L3d
            org.json.JSONArray r3 = (org.json.JSONArray) r3
            int r0 = r3.length()
            r1 = 0
        L30:
            if (r1 < r0) goto L33
            goto L3d
        L33:
            java.lang.Object r2 = r3.opt(r1)
            c(r2, r4)
            int r1 = r1 + 1
            goto L30
        L3d:
            return
    }

    public static ua.f d(java.lang.String r6, java.util.List r7) {
            boolean r0 = og.m.t0(r6)
            r1 = 0
            if (r0 == 0) goto L8
            goto L10
        L8:
            java.lang.String r0 = "default"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L11
        L10:
            return r1
        L11:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L1a:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r7.next()
            r3 = r2
            ua.f r3 = (ua.f) r3
            boolean r3 = r3.f13615f
            if (r3 == 0) goto L1a
            r0.add(r2)
            goto L1a
        L2f:
            java.lang.String r7 = "preset:lqt"
            boolean r7 = r6.equals(r7)
            java.lang.String r2 = ""
            java.lang.String r3 = " "
            r4 = 0
            if (r7 == 0) goto L67
            java.util.Iterator r6 = r0.iterator()
        L40:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L64
            java.lang.Object r7 = r6.next()
            r0 = r7
            ua.f r0 = (ua.f) r0
            java.lang.String r0 = r0.f13611b
            java.lang.String r0 = og.t.a0(r0, r3, r2, r4)
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "零钱通"
            boolean r0 = og.m.h0(r0, r5, r4)
            if (r0 == 0) goto L40
            r1 = r7
        L64:
            ua.f r1 = (ua.f) r1
            return r1
        L67:
            java.lang.String r7 = "preset:business"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto La8
            java.util.Iterator r6 = r0.iterator()
        L73:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto La5
            java.lang.Object r7 = r6.next()
            r0 = r7
            ua.f r0 = (ua.f) r0
            java.lang.String r0 = r0.f13611b
            java.lang.String r0 = og.t.a0(r0, r3, r2, r4)
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "经营"
            boolean r5 = og.m.h0(r0, r5, r4)
            if (r5 != 0) goto La1
            java.lang.String r5 = "商户"
            boolean r0 = og.m.h0(r0, r5, r4)
            if (r0 == 0) goto L9f
            goto La1
        L9f:
            r0 = r4
            goto La2
        La1:
            r0 = 1
        La2:
            if (r0 == 0) goto L73
            r1 = r7
        La5:
            ua.f r1 = (ua.f) r1
            return r1
        La8:
            java.util.Iterator r7 = r0.iterator()
        Lac:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto Lc2
            java.lang.Object r0 = r7.next()
            r2 = r0
            ua.f r2 = (ua.f) r2
            java.lang.String r2 = r2.f13610a
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto Lac
            r1 = r0
        Lc2:
            ua.f r1 = (ua.f) r1
            return r1
    }

    public static boolean f(java.lang.reflect.Method r4) {
            r0 = 0
            if (r4 == 0) goto L2d
            int r1 = r4.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 != 0) goto Le
            goto L2d
        Le:
            java.lang.Class[] r1 = r4.getParameterTypes()
            int r2 = r1.length
            r3 = 1
            if (r2 != r3) goto L2d
            r1 = r1[r0]
            java.lang.Class<org.json.JSONObject> r2 = org.json.JSONObject.class
            boolean r1 = gg.l.a(r1, r2)
            if (r1 == 0) goto L2d
            java.lang.Class r4 = r4.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            boolean r4 = gg.l.a(r4, r1)
            if (r4 != 0) goto L2d
            return r3
        L2d:
            return r0
    }

    public static java.util.List g(android.content.Context r15) {
            tf.t r1 = tf.t.f13167g
            if (r15 != 0) goto L5
            goto L1f
        L5:
            java.lang.String r0 = "Hchat_transfer_config"
            android.content.SharedPreferences r15 = ub.b.c(r15, r0)
            java.lang.String r0 = b()
            java.lang.String r2 = ""
            java.lang.String r15 = r15.getString(r0, r2)
            if (r15 != 0) goto L18
            goto L19
        L18:
            r2 = r15
        L19:
            boolean r15 = og.m.t0(r2)
            if (r15 == 0) goto L20
        L1f:
            return r1
        L20:
            org.json.JSONArray r15 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L5f
            r15.<init>(r2)     // Catch: java.lang.Throwable -> L5f
            uf.c r0 = a.a.E()     // Catch: java.lang.Throwable -> L5f
            int r2 = r15.length()     // Catch: java.lang.Throwable -> L5f
            r3 = 0
            r4 = r3
        L2f:
            if (r4 < r2) goto L62
            uf.c r15 = a.a.t(r0)     // Catch: java.lang.Throwable -> L5f
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> L5f
            r0.<init>()     // Catch: java.lang.Throwable -> L5f
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L5f
            r2.<init>()     // Catch: java.lang.Throwable -> L5f
            java.util.ListIterator r15 = r15.listIterator(r3)     // Catch: java.lang.Throwable -> L5f
        L43:
            r3 = r15
            uf.a r3 = (uf.a) r3     // Catch: java.lang.Throwable -> L5f
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L5f
            if (r4 == 0) goto Lb2
            java.lang.Object r3 = r3.next()     // Catch: java.lang.Throwable -> L5f
            r4 = r3
            ua.f r4 = (ua.f) r4     // Catch: java.lang.Throwable -> L5f
            java.lang.String r4 = r4.f13610a     // Catch: java.lang.Throwable -> L5f
            boolean r4 = r0.add(r4)     // Catch: java.lang.Throwable -> L5f
            if (r4 == 0) goto L43
            r2.add(r3)     // Catch: java.lang.Throwable -> L5f
            goto L43
        L5f:
            r0 = move-exception
            r15 = r0
            goto Lad
        L62:
            org.json.JSONObject r5 = r15.optJSONObject(r4)     // Catch: java.lang.Throwable -> L5f
            if (r5 == 0) goto Laa
            java.lang.String r6 = "accountType"
            int r8 = r5.optInt(r6, r3)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r6 = "subChannelId"
            r9 = 0
            long r9 = r5.optLong(r6, r9)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r6 = "name"
            java.lang.String r6 = r5.optString(r6)     // Catch: java.lang.Throwable -> L5f
            r6.getClass()     // Catch: java.lang.Throwable -> L5f
            java.lang.CharSequence r6 = og.m.R0(r6)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r12 = r6.toString()     // Catch: java.lang.Throwable -> L5f
            boolean r6 = og.m.t0(r12)     // Catch: java.lang.Throwable -> L5f
            if (r6 == 0) goto L8e
            goto Laa
        L8e:
            ua.f r7 = new ua.f     // Catch: java.lang.Throwable -> L5f
            java.lang.String r11 = a(r8, r9)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r6 = "bindSerial"
            java.lang.String r13 = r5.optString(r6)     // Catch: java.lang.Throwable -> L5f
            r13.getClass()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r6 = "available"
            r14 = 1
            boolean r14 = r5.optBoolean(r6, r14)     // Catch: java.lang.Throwable -> L5f
            r7.<init>(r8, r9, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L5f
            r0.add(r7)     // Catch: java.lang.Throwable -> L5f
        Laa:
            int r4 = r4 + 1
            goto L2f
        Lad:
            sf.f r2 = new sf.f
            r2.<init>(r15)
        Lb2:
            boolean r15 = r2 instanceof sf.f
            if (r15 == 0) goto Lb7
            goto Lb8
        Lb7:
            r1 = r2
        Lb8:
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    public static java.lang.reflect.Method h(r8.g r7, ia.t r8) {
            r0 = 0
            org.luckypray.dexkit.DexKitBridge r1 = r7.f11623d     // Catch: java.lang.Throwable -> L51
            ch.e r2 = new ch.e     // Catch: java.lang.Throwable -> L51
            r2.<init>()     // Catch: java.lang.Throwable -> L51
            fh.k r3 = new fh.k     // Catch: java.lang.Throwable -> L51
            r3.<init>()     // Catch: java.lang.Throwable -> L51
            java.lang.String r4 = "recv_channel_type"
            java.lang.String r5 = "recv_channel_name"
            java.lang.String r6 = "sub_recv_channel_info"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5, r6}     // Catch: java.lang.Throwable -> L51
            r3.r0(r4)     // Catch: java.lang.Throwable -> L51
            r2.f1666h = r3     // Catch: java.lang.Throwable -> L51
            hh.p r1 = r1.findMethod(r2)     // Catch: java.lang.Throwable -> L51
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L51
            r2.<init>()     // Catch: java.lang.Throwable -> L51
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L51
        L29:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L51
            if (r3 == 0) goto L53
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L51
            hh.o r3 = (hh.o) r3     // Catch: java.lang.Throwable -> L51
            java.lang.ClassLoader r4 = r7.f11622c     // Catch: java.lang.Throwable -> L3c
            java.lang.reflect.Method r3 = r3.r(r4)     // Catch: java.lang.Throwable -> L3c
            goto L43
        L3c:
            r3 = move-exception
            sf.f r4 = new sf.f     // Catch: java.lang.Throwable -> L51
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L51
            r3 = r4
        L43:
            boolean r4 = r3 instanceof sf.f     // Catch: java.lang.Throwable -> L51
            if (r4 == 0) goto L49
            r3 = r0
        L49:
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.Throwable -> L51
            if (r3 == 0) goto L29
            r2.add(r3)     // Catch: java.lang.Throwable -> L51
            goto L29
        L51:
            r7 = move-exception
            goto L6f
        L53:
            java.util.Iterator r7 = r2.iterator()     // Catch: java.lang.Throwable -> L51
        L57:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Throwable -> L51
            if (r1 == 0) goto L6b
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Throwable -> L51
            r2 = r1
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> L51
            boolean r2 = f(r2)     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L57
            goto L6c
        L6b:
            r1 = r0
        L6c:
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch: java.lang.Throwable -> L51
            goto L74
        L6f:
            sf.f r1 = new sf.f
            r1.<init>(r7)
        L74:
            java.lang.Throwable r7 = sf.g.b(r1)
            if (r7 != 0) goto L7c
            r0 = r1
            goto L81
        L7c:
            java.lang.String r1 = "定位转账收款账户解析方法失败"
            r8.invoke(r1, r7)
        L81:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            return r0
    }

    public static java.util.List i(org.json.JSONObject r15) {
            java.lang.String r0 = "recv_channel_type"
            boolean r1 = r15.has(r0)
            if (r1 == 0) goto La3
            java.lang.String r1 = "recv_channel_name"
            boolean r2 = r15.has(r1)
            if (r2 != 0) goto L12
            goto La3
        L12:
            r2 = 0
            int r4 = r15.optInt(r0, r2)
            java.lang.String r8 = wb.en.j(r1, r15)
            boolean r0 = og.m.t0(r8)
            if (r0 == 0) goto L23
            goto La3
        L23:
            java.lang.String r0 = "recv_channel_avail_state"
            r1 = 1
            int r0 = r15.optInt(r0, r1)
            if (r0 != r1) goto L2e
            r10 = r1
            goto L2f
        L2e:
            r10 = r2
        L2f:
            java.lang.String r0 = "bind_serial"
            java.lang.String r9 = r15.optString(r0)
            java.lang.String r0 = "sub_recv_channel_info"
            org.json.JSONObject r15 = r15.optJSONObject(r0)
            r0 = 0
            if (r15 == 0) goto L46
            java.lang.String r3 = "default_sub_recv_channel_id"
            long r5 = r15.optLong(r3, r0)
            goto L47
        L46:
            r5 = r0
        L47:
            uf.c r11 = a.a.E()
            ua.f r3 = new ua.f
            java.lang.String r7 = a(r4, r5)
            r9.getClass()
            r3.<init>(r4, r5, r7, r8, r9, r10)
            r12 = r8
            r11.add(r3)
            if (r15 == 0) goto L64
            java.lang.String r3 = "sub_recv_channel_list"
            org.json.JSONArray r15 = r15.optJSONArray(r3)
            goto L65
        L64:
            r15 = 0
        L65:
            if (r15 == 0) goto L9e
            int r13 = r15.length()
        L6b:
            if (r2 < r13) goto L6e
            goto L9e
        L6e:
            org.json.JSONObject r3 = r15.optJSONObject(r2)
            if (r3 == 0) goto L9b
            java.lang.String r5 = "id"
            long r5 = r3.optLong(r5, r0)
            java.lang.String r7 = "name"
            java.lang.String r3 = wb.en.j(r7, r3)
            boolean r7 = og.m.t0(r3)
            if (r7 == 0) goto L87
            goto L9b
        L87:
            r7 = r3
            ua.f r3 = new ua.f
            r8 = r7
            java.lang.String r7 = a(r4, r5)
            java.lang.String r14 = " · "
            java.lang.String r8 = wb.en.h(r12, r14, r8)
            r3.<init>(r4, r5, r7, r8, r9, r10)
            r11.add(r3)
        L9b:
            int r2 = r2 + 1
            goto L6b
        L9e:
            uf.c r15 = a.a.t(r11)
            return r15
        La3:
            tf.t r15 = tf.t.f13167g
            return r15
    }

    public static void j(android.content.Context r6, java.util.ArrayList r7) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L9:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r7.next()
            r2 = r1
            ua.f r2 = (ua.f) r2
            java.lang.String r2 = r2.f13610a
            r0.put(r2, r1)
            goto L9
        L1c:
            org.json.JSONArray r7 = new org.json.JSONArray
            r7.<init>()
            java.util.Collection r0 = r0.values()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L2e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L66
            java.lang.Object r1 = r0.next()
            ua.f r1 = (ua.f) r1
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "name"
            java.lang.String r4 = r1.f13611b
            r2.put(r3, r4)
            java.lang.String r3 = "accountType"
            int r4 = r1.f13612c
            r2.put(r3, r4)
            java.lang.String r3 = "subChannelId"
            long r4 = r1.f13613d
            r2.put(r3, r4)
            java.lang.String r3 = "bindSerial"
            java.lang.String r4 = r1.f13614e
            r2.put(r3, r4)
            java.lang.String r3 = "available"
            boolean r1 = r1.f13615f
            r2.put(r3, r1)
            r7.put(r2)
            goto L2e
        L66:
            java.lang.String r0 = "Hchat_transfer_config"
            android.content.SharedPreferences r6 = ub.b.c(r6, r0)
            android.content.SharedPreferences$Editor r6 = r6.edit()
            java.lang.String r0 = b()
            java.lang.String r7 = r7.toString()
            android.content.SharedPreferences$Editor r6 = r6.putString(r0, r7)
            r6.apply()
            return
    }

    public final synchronized void e(r8.g r5, ia.t r6) {
            r4 = this;
            monitor-enter(r4)
            r5.getClass()     // Catch: java.lang.Throwable -> L2f
            boolean r0 = ua.g.f13617b     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto La
            monitor-exit(r4)
            return
        La:
            android.content.Context r0 = r5.f11620a     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = "Hchat_transfer_receive_account_method_cache"
            android.content.SharedPreferences r0 = ub.b.c(r0, r1)     // Catch: java.lang.Throwable -> L2f
            android.content.Context r1 = r5.f11620a     // Catch: java.lang.Throwable -> L2f
            java.lang.ClassLoader r2 = r5.f11622c     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = e8.b.g(r1, r2)     // Catch: java.lang.Throwable -> L2f
            java.lang.ClassLoader r2 = r5.f11622c     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = "receive_account_parser"
            java.lang.reflect.Method r2 = e8.b.c(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L31
            boolean r3 = f(r2)     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L2b
            goto L2c
        L2b:
            r2 = 0
        L2c:
            if (r2 == 0) goto L31
            goto L3c
        L2f:
            r5 = move-exception
            goto L4e
        L31:
            java.lang.reflect.Method r2 = h(r5, r6)     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L4c
            java.lang.String r6 = "receive_account_parser"
            e8.b.h(r0, r1, r6, r2)     // Catch: java.lang.Throwable -> L2f
        L3c:
            r8.i r6 = r8.i.f11631b     // Catch: java.lang.Throwable -> L2f
            c9.a2 r0 = new c9.a2     // Catch: java.lang.Throwable -> L2f
            r1 = 7
            r0.<init>(r5, r1)     // Catch: java.lang.Throwable -> L2f
            r6.b(r2, r0)     // Catch: java.lang.Throwable -> L2f
            r5 = 1
            ua.g.f13617b = r5     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r4)
            return
        L4c:
            monitor-exit(r4)
            return
        L4e:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2f
            throw r5
    }
}
