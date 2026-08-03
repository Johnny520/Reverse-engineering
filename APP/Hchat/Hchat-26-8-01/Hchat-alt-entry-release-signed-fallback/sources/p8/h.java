package p8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final java.util.List f10356k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final java.util.List f10357l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final java.util.List f10358m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final java.util.List f10359n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final java.util.List f10360o = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f10361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.ClassLoader f10362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final org.luckypray.dexkit.DexKitBridge f10363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p8.p f10364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final android.content.SharedPreferences f10365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile java.lang.reflect.Method f10366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile java.lang.reflect.Method f10367g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile java.lang.reflect.Method f10368h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile java.lang.reflect.Method f10369i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile java.lang.reflect.Method f10370j;

    static {
            java.lang.String r0 = "getSnsInfoStorage"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.SnsCore"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = a.a.y0(r0)
            p8.h.f10356k = r0
            java.lang.String r0 = "select *,rowid from SnsInfo  where SnsInfo.snsId="
            java.lang.String r1 = " limit 1"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = a.a.y0(r0)
            p8.h.f10357l = r0
            java.lang.String r0 = "getCursorByUserName"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.SnsInfoStorage"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = a.a.y0(r0)
            p8.h.f10358m = r0
            java.lang.String r0 = " from AdSnsInfo where createTime >"
            java.lang.String r2 = " limit "
            java.lang.String r3 = "getAdCursorForTimeLine"
            java.lang.String[] r0 = new java.lang.String[]{r3, r1, r0, r2}
            java.util.List r0 = a.a.y0(r0)
            p8.h.f10359n = r0
            java.lang.String r0 = "snsId=?"
            java.lang.String r2 = "rowid"
            java.lang.String r3 = "update"
            java.lang.String[] r0 = new java.lang.String[]{r3, r1, r0, r2}
            java.util.List r0 = a.a.y0(r0)
            p8.h.f10360o = r0
            return
    }

    public h(android.content.Context r1, java.lang.ClassLoader r2, org.luckypray.dexkit.DexKitBridge r3, p8.p r4) {
            r0 = this;
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.f10361a = r1
            r0.f10362b = r2
            r0.f10363c = r3
            r0.f10364d = r4
            java.lang.String r2 = "Hchat_sns_cached_post_storage_cache"
            android.content.SharedPreferences r1 = ub.b.c(r1, r2)
            r0.f10365e = r1
            return
    }

    public static boolean a(java.lang.Class r3, java.lang.reflect.Method r4) {
            java.lang.Class[] r0 = r4.getParameterTypes()
            int r1 = r4.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            r2 = 0
            if (r1 != 0) goto L42
            int r1 = r4.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isAbstract(r1)
            if (r1 != 0) goto L42
            java.lang.Class r1 = r4.getDeclaringClass()
            boolean r3 = r1.isAssignableFrom(r3)
            if (r3 == 0) goto L42
            java.lang.Class r3 = r4.getReturnType()
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = "com.tencent.mm.plugin.sns.storage.SnsInfo"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L42
            int r3 = r0.length
            r4 = 1
            if (r3 != r4) goto L42
            r3 = r0[r2]
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r3 = gg.l.a(r3, r0)
            if (r3 == 0) goto L42
            return r4
        L42:
            return r2
    }

    public static boolean b(java.lang.Class r8, java.lang.reflect.Method r9) {
            java.lang.Class[] r0 = r9.getParameterTypes()
            int r1 = r9.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 != 0) goto L45
            int r1 = r9.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isAbstract(r1)
            if (r1 != 0) goto L45
            java.lang.Class r1 = r9.getDeclaringClass()
            boolean r8 = r1.isAssignableFrom(r8)
            if (r8 == 0) goto L45
            java.lang.Class<android.database.Cursor> r8 = android.database.Cursor.class
            java.lang.Class r9 = r9.getReturnType()
            boolean r8 = r8.isAssignableFrom(r9)
            if (r8 == 0) goto L45
            java.lang.Class r3 = java.lang.Integer.TYPE
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r4 = r1
            r6 = r3
            r7 = r3
            java.lang.Class[] r8 = new java.lang.Class[]{r1, r2, r3, r4, r5, r6, r7}
            boolean r8 = java.util.Arrays.equals(r0, r8)
            if (r8 == 0) goto L45
            r8 = 1
            return r8
        L45:
            r8 = 0
            return r8
    }

    public static boolean c(java.lang.Class r2, java.lang.reflect.Method r3) {
            java.lang.Class[] r0 = r3.getParameterTypes()
            int r1 = r3.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 != 0) goto L3e
            int r1 = r3.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isAbstract(r1)
            if (r1 != 0) goto L3e
            java.lang.Class r1 = r3.getDeclaringClass()
            boolean r2 = r1.isAssignableFrom(r2)
            if (r2 == 0) goto L3e
            java.lang.Class<android.database.Cursor> r2 = android.database.Cursor.class
            java.lang.Class r3 = r3.getReturnType()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L3e
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.Class r3 = java.lang.Integer.TYPE
            java.lang.Class[] r2 = new java.lang.Class[]{r2, r3, r3}
            boolean r2 = java.util.Arrays.equals(r0, r2)
            if (r2 == 0) goto L3e
            r2 = 1
            return r2
        L3e:
            r2 = 0
            return r2
    }

    public static boolean d(java.lang.reflect.Method r2) {
            int r0 = r2.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            r1 = 0
            if (r0 == 0) goto L3b
            int r0 = r2.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            if (r0 != 0) goto L3b
            java.lang.Class[] r0 = r2.getParameterTypes()
            r0.getClass()
            int r0 = r0.length
            if (r0 != 0) goto L3b
            java.lang.Class r0 = r2.getReturnType()
            boolean r0 = r0.isPrimitive()
            if (r0 != 0) goto L3b
            java.lang.Class r2 = r2.getReturnType()
            java.lang.String r2 = r2.getName()
            java.lang.String r0 = "com.tencent.mm.plugin.sns.storage."
            boolean r2 = og.t.d0(r2, r0, r1)
            if (r2 == 0) goto L3b
            r2 = 1
            return r2
        L3b:
            return r1
    }

    public static boolean e(java.lang.Class r3, java.lang.reflect.Method r4) {
            java.lang.Class[] r0 = r4.getParameterTypes()
            int r1 = r4.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            r2 = 0
            if (r1 != 0) goto L59
            int r1 = r4.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isAbstract(r1)
            if (r1 != 0) goto L59
            java.lang.Class r1 = r4.getDeclaringClass()
            boolean r3 = r1.isAssignableFrom(r3)
            if (r3 == 0) goto L59
            java.lang.Class r3 = r4.getReturnType()
            java.lang.Class r1 = java.lang.Boolean.TYPE
            boolean r3 = gg.l.a(r3, r1)
            if (r3 != 0) goto L3b
            java.lang.Class r3 = r4.getReturnType()
            java.lang.Class<java.lang.Boolean> r4 = java.lang.Boolean.class
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto L59
        L3b:
            int r3 = r0.length
            r4 = 2
            if (r3 != r4) goto L59
            r3 = r0[r2]
            java.lang.Class r4 = java.lang.Long.TYPE
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto L59
            r3 = 1
            r4 = r0[r3]
            java.lang.String r4 = r4.getName()
            java.lang.String r0 = "com.tencent.mm.plugin.sns.storage.SnsInfo"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L59
            return r3
        L59:
            return r2
    }

    public static p8.g j(java.lang.Object r6, java.lang.Long r7) {
            java.lang.Class r0 = r6.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.SnsInfo"
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 != 0) goto L13
            goto L74
        L13:
            java.lang.String r0 = "convertTo"
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invokeMethod(r6, r0, r3)
            boolean r3 = r0 instanceof android.content.ContentValues
            if (r3 == 0) goto L23
            android.content.ContentValues r0 = (android.content.ContentValues) r0
            goto L24
        L23:
            r0 = r1
        L24:
            if (r0 == 0) goto L74
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>(r0)
            if (r7 == 0) goto L2e
            goto L67
        L2e:
            java.lang.String r7 = "getLocalid"
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.invokeMethod(r6, r7, r0)
            boolean r0 = r7 instanceof java.lang.Number
            if (r0 == 0) goto L3d
            java.lang.Number r7 = (java.lang.Number) r7
            goto L3e
        L3d:
            r7 = r1
        L3e:
            if (r7 == 0) goto L49
            long r4 = r7.longValue()
            java.lang.Long r7 = java.lang.Long.valueOf(r4)
            goto L4a
        L49:
            r7 = r1
        L4a:
            if (r7 == 0) goto L4d
            goto L67
        L4d:
            java.lang.String r7 = "localid"
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.readField(r6, r7)
            boolean r0 = r7 instanceof java.lang.Number
            if (r0 == 0) goto L5a
            java.lang.Number r7 = (java.lang.Number) r7
            goto L5b
        L5a:
            r7 = r1
        L5b:
            if (r7 == 0) goto L66
            long r0 = r7.longValue()
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            goto L67
        L66:
            r7 = r1
        L67:
            if (r7 == 0) goto L6e
            java.lang.String r0 = "hchatLocalId"
            r3.put(r0, r7)
        L6e:
            p8.g r7 = new p8.g
            r7.<init>(r6, r3)
            return r7
        L74:
            return r1
    }

    public final java.lang.reflect.Method f(java.util.List r7, fg.l r8, java.lang.String r9) {
            r6 = this;
            android.content.Context r0 = r6.f10361a
            java.lang.ClassLoader r1 = r6.f10362b
            java.lang.String r0 = e8.b.g(r0, r1)
            android.content.SharedPreferences r2 = r6.f10365e
            java.lang.reflect.Method r1 = e8.b.c(r2, r0, r1, r9)
            r3 = 0
            if (r1 == 0) goto L22
            java.lang.Object r4 = r8.invoke(r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L1e
            goto L1f
        L1e:
            r1 = r3
        L1f:
            if (r1 == 0) goto L22
            return r1
        L22:
            gg.u r1 = new gg.u
            r1.<init>()
            ac.l r4 = new ac.l
            r5 = 24
            r4.<init>(r1, r6, r7, r5)
            r8.e.c(r4)
            java.lang.Object r7 = r1.f4564g
            if (r7 == 0) goto Lab
            java.util.List r7 = (java.util.List) r7
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r7 = r7.iterator()
        L40:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L5a
            java.lang.Object r4 = r7.next()
            java.lang.Object r5 = r8.invoke(r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L40
            r1.add(r4)
            goto L40
        L5a:
            int r7 = r1.size()
            r8 = 1
            if (r7 == r8) goto La1
            java.lang.String r7 = "cache.key"
            android.content.SharedPreferences$Editor r8 = r2.edit()     // Catch: java.lang.Throwable -> L81
            java.lang.String r4 = ""
            java.lang.String r2 = r2.getString(r7, r4)     // Catch: java.lang.Throwable -> L81
            boolean r2 = gg.l.a(r2, r0)     // Catch: java.lang.Throwable -> L81
            if (r2 != 0) goto L7a
            android.content.SharedPreferences$Editor r2 = r8.clear()     // Catch: java.lang.Throwable -> L81
            r2.putString(r7, r0)     // Catch: java.lang.Throwable -> L81
        L7a:
            android.content.SharedPreferences$Editor r7 = r8.remove(r9)     // Catch: java.lang.Throwable -> L81
            r7.apply()     // Catch: java.lang.Throwable -> L81
        L81:
            int r7 = r1.size()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "朋友圈缓存查询入口数量异常: cache="
            r8.<init>(r0)
            r8.append(r9)
            java.lang.String r9 = " count="
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            p8.p r8 = r6.f10364d
            r8.invoke(r7)
            return r3
        La1:
            java.lang.Object r7 = tf.m.H1(r1)
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            e8.b.h(r2, r0, r9, r7)
            return r7
        Lab:
            java.lang.String r7 = "methods"
            gg.l.g(r7)
            throw r3
    }

    public final p8.f g(java.lang.String r7) {
            r6 = this;
            java.lang.String r7 = p.a.l(r7, r7)
            r0 = 2
            char[] r0 = new char[r0]
            r0 = {x00c4: FILL_ARRAY_DATA , data: [39, 34} // fill-array
            java.lang.String r7 = og.m.S0(r7, r0)
            int r0 = r7.length()
            r1 = 0
            if (r0 <= 0) goto L16
            goto L17
        L16:
            r7 = r1
        L17:
            if (r7 == 0) goto L41
            java.lang.Long r0 = og.t.g0(r7)
            if (r0 == 0) goto L28
            long r2 = r0.longValue()
            java.lang.Long r7 = java.lang.Long.valueOf(r2)
            goto L42
        L28:
            long r2 = java.lang.Long.parseUnsignedLong(r7)     // Catch: java.lang.Throwable -> L31
            java.lang.Long r7 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L31
            goto L38
        L31:
            r7 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r7)
            r7 = r0
        L38:
            boolean r0 = r7 instanceof sf.f
            if (r0 == 0) goto L3e
            r7 = r1
        L3e:
            java.lang.Long r7 = (java.lang.Long) r7
            goto L42
        L41:
            r7 = r1
        L42:
            r0 = 0
            if (r7 == 0) goto Lbe
            java.lang.Object r2 = r6.k()
            if (r2 == 0) goto Lb8
            java.lang.reflect.Method r3 = r6.f10367g
            if (r3 == 0) goto L5e
            java.lang.Class r4 = r2.getClass()
            boolean r4 = a(r4, r3)
            if (r4 == 0) goto L5a
            goto L5b
        L5a:
            r3 = r1
        L5b:
            if (r3 == 0) goto L5e
            goto L71
        L5e:
            java.util.List r3 = p8.h.f10357l
            c9.k1 r4 = new c9.k1
            r5 = 17
            r4.<init>(r6, r2, r5)
            java.lang.String r5 = "sns_info_get_by_id_v1"
            java.lang.reflect.Method r3 = r6.f(r3, r4, r5)
            if (r3 == 0) goto Lb2
            r6.f10367g = r3
        L71:
            java.lang.Object[] r7 = new java.lang.Object[]{r7}     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.invokeOrThrow(r3, r2, r7)     // Catch: java.lang.Throwable -> L7a
            goto L81
        L7a:
            r7 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r7)
            r7 = r2
        L81:
            java.lang.Throwable r2 = sf.g.b(r7)
            if (r2 == 0) goto L9e
            p8.p r3 = r6.f10364d
            java.lang.String r2 = r2.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "按 ID 读取朋友圈缓存失败: "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.invoke(r2)
        L9e:
            java.lang.Throwable r2 = sf.g.b(r7)
            if (r2 != 0) goto Lab
            p8.f r0 = new p8.f
            r1 = 1
            r0.<init>(r7, r1)
            goto Lb1
        Lab:
            p8.f r7 = new p8.f
            r7.<init>(r1, r0)
            r0 = r7
        Lb1:
            return r0
        Lb2:
            p8.f r7 = new p8.f
            r7.<init>(r1, r0)
            return r7
        Lb8:
            p8.f r7 = new p8.f
            r7.<init>(r1, r0)
            return r7
        Lbe:
            p8.f r7 = new p8.f
            r7.<init>(r1, r0)
            return r7
    }

    public final java.util.List h(java.lang.String r12, int r13, boolean r14) {
            r11 = this;
            java.lang.String r0 = ""
            r1 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            tf.t r1 = tf.t.f13167g
            if (r13 > 0) goto Ld
            goto L133
        Ld:
            java.lang.Object r9 = r11.k()
            if (r9 == 0) goto L133
            r2 = 200(0xc8, float:2.8E-43)
            r10 = 0
            if (r12 == 0) goto L1e
            boolean r3 = og.m.t0(r12)
            if (r3 == 0) goto L21
        L1e:
            r3 = r2
            goto Lb4
        L21:
            java.lang.reflect.Method r0 = r11.f10368h
            if (r0 == 0) goto L35
            java.lang.Class r3 = r9.getClass()
            boolean r3 = b(r3, r0)
            if (r3 == 0) goto L30
            goto L31
        L30:
            r0 = r10
        L31:
            if (r0 == 0) goto L35
        L33:
            r3 = r2
            goto L49
        L35:
            java.util.List r0 = p8.h.f10358m
            c9.k1 r3 = new c9.k1
            r4 = 14
            r3.<init>(r11, r9, r4)
            java.lang.String r4 = "sns_info_get_by_user_v1"
            java.lang.reflect.Method r0 = r11.f(r0, r3, r4)
            if (r0 == 0) goto L133
            r11.f10368h = r0
            goto L33
        L49:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L71
            java.lang.CharSequence r12 = og.m.R0(r12)     // Catch: java.lang.Throwable -> L71
            java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L71
            if (r13 <= r3) goto L56
            r13 = r3
        L56:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)     // Catch: java.lang.Throwable -> L71
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r14)     // Catch: java.lang.Throwable -> L71
            java.lang.String r6 = ""
            r8 = r7
            r3 = r12
            java.lang.Object[] r12 = new java.lang.Object[]{r2, r3, r4, r5, r6, r7, r8}     // Catch: java.lang.Throwable -> L71
            java.lang.Object r12 = h.Hchat.utils.KavaReflector.invokeOrThrow(r0, r9, r12)     // Catch: java.lang.Throwable -> L71
            boolean r13 = r12 instanceof android.database.Cursor     // Catch: java.lang.Throwable -> L71
            if (r13 == 0) goto L74
            android.database.Cursor r12 = (android.database.Cursor) r12     // Catch: java.lang.Throwable -> L71
            goto L7c
        L71:
            r0 = move-exception
            r12 = r0
            goto L76
        L74:
            r12 = r10
            goto L7c
        L76:
            sf.f r13 = new sf.f
            r13.<init>(r12)
            r12 = r13
        L7c:
            java.lang.Throwable r13 = sf.g.b(r12)
            if (r13 == 0) goto L99
            p8.p r14 = r11.f10364d
            java.lang.String r13 = r13.getMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "读取朋友圈缓存列表失败: "
            r0.<init>(r2)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r14.invoke(r13)
        L99:
            boolean r13 = r12 instanceof sf.f
            if (r13 == 0) goto L9e
            goto L9f
        L9e:
            r10 = r12
        L9f:
            android.database.Cursor r10 = (android.database.Cursor) r10
            if (r10 == 0) goto L133
            java.util.List r12 = r11.i(r10)     // Catch: java.lang.Throwable -> Lab
            r10.close()
            return r12
        Lab:
            r0 = move-exception
            r12 = r0
            throw r12     // Catch: java.lang.Throwable -> Lae
        Lae:
            r0 = move-exception
            r13 = r0
            ig.a.i(r10, r12)
            throw r13
        Lb4:
            java.lang.reflect.Method r12 = r11.f10369i
            if (r12 == 0) goto Lc7
            java.lang.Class r14 = r9.getClass()
            boolean r14 = c(r14, r12)
            if (r14 == 0) goto Lc3
            goto Lc4
        Lc3:
            r12 = r10
        Lc4:
            if (r12 == 0) goto Lc7
            goto Lda
        Lc7:
            java.util.List r12 = p8.h.f10359n
            c9.k1 r14 = new c9.k1
            r2 = 18
            r14.<init>(r11, r9, r2)
            java.lang.String r2 = "sns_info_get_timeline_v1"
            java.lang.reflect.Method r12 = r11.f(r12, r14, r2)
            if (r12 == 0) goto L133
            r11.f10369i = r12
        Lda:
            if (r13 <= r3) goto Ldd
            r13 = r3
        Ldd:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch: java.lang.Throwable -> Lf0
            java.lang.Object[] r13 = new java.lang.Object[]{r0, r7, r13}     // Catch: java.lang.Throwable -> Lf0
            java.lang.Object r12 = h.Hchat.utils.KavaReflector.invokeOrThrow(r12, r9, r13)     // Catch: java.lang.Throwable -> Lf0
            boolean r13 = r12 instanceof android.database.Cursor     // Catch: java.lang.Throwable -> Lf0
            if (r13 == 0) goto Lf3
            android.database.Cursor r12 = (android.database.Cursor) r12     // Catch: java.lang.Throwable -> Lf0
            goto Lfb
        Lf0:
            r0 = move-exception
            r12 = r0
            goto Lf5
        Lf3:
            r12 = r10
            goto Lfb
        Lf5:
            sf.f r13 = new sf.f
            r13.<init>(r12)
            r12 = r13
        Lfb:
            java.lang.Throwable r13 = sf.g.b(r12)
            if (r13 == 0) goto L118
            p8.p r14 = r11.f10364d
            java.lang.String r13 = r13.getMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "读取朋友圈时间线缓存失败: "
            r0.<init>(r2)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r14.invoke(r13)
        L118:
            boolean r13 = r12 instanceof sf.f
            if (r13 == 0) goto L11d
            goto L11e
        L11d:
            r10 = r12
        L11e:
            android.database.Cursor r10 = (android.database.Cursor) r10
            if (r10 == 0) goto L133
            java.util.List r1 = r11.i(r10)     // Catch: java.lang.Throwable -> L12a
            r10.close()
            goto L133
        L12a:
            r0 = move-exception
            r12 = r0
            throw r12     // Catch: java.lang.Throwable -> L12d
        L12d:
            r0 = move-exception
            r13 = r0
            ig.a.i(r10, r12)
            throw r13
        L133:
            return r1
    }

    public final java.util.List i(android.database.Cursor r10) {
            r9 = this;
            java.lang.String r0 = "com.tencent.mm.plugin.sns.storage.SnsInfo"
            java.lang.ClassLoader r1 = r9.f10362b
            java.lang.Class r0 = h.Hchat.utils.KavaReflector.loadClass(r0, r1)
            if (r0 == 0) goto L83
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]
            java.lang.reflect.Constructor r2 = h.Hchat.utils.KavaReflector.findConstructor(r0, r2)
            if (r2 == 0) goto L83
            java.lang.Class<android.database.Cursor> r3 = android.database.Cursor.class
            java.lang.Class[] r3 = new java.lang.Class[]{r3}
            java.lang.String r4 = "convertFrom"
            java.lang.reflect.Method r0 = h.Hchat.utils.KavaReflector.findMethodRecursive(r0, r4, r3)
            if (r0 == 0) goto L83
            java.lang.String r3 = "rowid"
            int r3 = r10.getColumnIndex(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = r10.getCount()
            if (r5 >= 0) goto L30
            r5 = r1
        L30:
            r4.<init>(r5)
        L33:
            boolean r5 = r10.moveToNext()
            if (r5 == 0) goto L82
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.newInstance(r2, r5)
            if (r5 == 0) goto L33
            r6 = 0
            java.lang.Object[] r7 = new java.lang.Object[]{r10}     // Catch: java.lang.Throwable -> L65
            h.Hchat.utils.KavaReflector.invokeOrThrow(r0, r5, r7)     // Catch: java.lang.Throwable -> L65
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L65
            if (r3 < 0) goto L51
            r8 = 1
            goto L52
        L51:
            r8 = r1
        L52:
            if (r8 == 0) goto L55
            goto L56
        L55:
            r7 = r6
        L56:
            if (r7 == 0) goto L67
            int r7 = r7.intValue()     // Catch: java.lang.Throwable -> L65
            long r7 = r10.getLong(r7)     // Catch: java.lang.Throwable -> L65
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> L65
            goto L68
        L65:
            r5 = move-exception
            goto L6d
        L67:
            r7 = r6
        L68:
            p8.g r5 = j(r5, r7)     // Catch: java.lang.Throwable -> L65
            goto L73
        L6d:
            sf.f r7 = new sf.f
            r7.<init>(r5)
            r5 = r7
        L73:
            boolean r7 = r5 instanceof sf.f
            if (r7 == 0) goto L79
            goto L7a
        L79:
            r6 = r5
        L7a:
            p8.g r6 = (p8.g) r6
            if (r6 == 0) goto L33
            r4.add(r6)
            goto L33
        L82:
            return r4
        L83:
            tf.t r10 = tf.t.f13167g
            return r10
    }

    public final java.lang.Object k() {
            r8 = this;
            java.lang.reflect.Method r0 = r8.f10366f
            r1 = 0
            if (r0 == 0) goto L11
            boolean r2 = d(r0)
            if (r2 == 0) goto Lc
            goto Ld
        Lc:
            r0 = r1
        Ld:
            if (r0 == 0) goto L11
            goto Lb6
        L11:
            android.content.Context r0 = r8.f10361a
            java.lang.ClassLoader r2 = r8.f10362b
            java.lang.String r0 = e8.b.g(r0, r2)
            android.content.SharedPreferences r3 = r8.f10365e
            java.lang.String r4 = "sns_info_storage_getter_v1"
            java.lang.reflect.Method r2 = e8.b.c(r3, r0, r2, r4)
            if (r2 == 0) goto L30
            boolean r5 = d(r2)
            if (r5 == 0) goto L2a
            goto L2b
        L2a:
            r2 = r1
        L2b:
            if (r2 == 0) goto L30
        L2d:
            r0 = r2
            goto Lb2
        L30:
            java.util.List r2 = p8.h.f10356k
            gg.u r5 = new gg.u
            r5.<init>()
            ac.l r6 = new ac.l
            r7 = 24
            r6.<init>(r5, r8, r2, r7)
            r8.e.c(r6)
            java.lang.Object r2 = r5.f4564g
            if (r2 == 0) goto Le9
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r2 = r2.iterator()
        L50:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L67
            java.lang.Object r6 = r2.next()
            r7 = r6
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            boolean r7 = d(r7)
            if (r7 == 0) goto L50
            r5.add(r6)
            goto L50
        L67:
            int r2 = r5.size()
            r6 = 1
            if (r2 == r6) goto La7
            java.lang.String r2 = "cache.key"
            android.content.SharedPreferences$Editor r6 = r3.edit()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r7 = ""
            java.lang.String r3 = r3.getString(r2, r7)     // Catch: java.lang.Throwable -> L8e
            boolean r3 = gg.l.a(r3, r0)     // Catch: java.lang.Throwable -> L8e
            if (r3 != 0) goto L87
            android.content.SharedPreferences$Editor r3 = r6.clear()     // Catch: java.lang.Throwable -> L8e
            r3.putString(r2, r0)     // Catch: java.lang.Throwable -> L8e
        L87:
            android.content.SharedPreferences$Editor r0 = r6.remove(r4)     // Catch: java.lang.Throwable -> L8e
            r0.apply()     // Catch: java.lang.Throwable -> L8e
        L8e:
            p8.p r0 = r8.f10364d
            int r2 = r5.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "朋友圈缓存存储入口数量异常: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.invoke(r2)
            r0 = r1
            goto Lb2
        La7:
            java.lang.Object r2 = tf.m.H1(r5)
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            e8.b.h(r3, r0, r4, r2)
            goto L2d
        Lb2:
            if (r0 == 0) goto Le8
            r8.f10366f = r0
        Lb6:
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lbe
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invokeOrThrow(r0, r1, r2)     // Catch: java.lang.Throwable -> Lbe
            goto Lc5
        Lbe:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        Lc5:
            java.lang.Throwable r2 = sf.g.b(r0)
            if (r2 == 0) goto Le2
            p8.p r3 = r8.f10364d
            java.lang.String r2 = r2.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "获取朋友圈缓存存储失败: "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.invoke(r2)
        Le2:
            boolean r2 = r0 instanceof sf.f
            if (r2 == 0) goto Le7
            goto Le8
        Le7:
            r1 = r0
        Le8:
            return r1
        Le9:
            java.lang.String r0 = "methods"
            gg.l.g(r0)
            throw r1
    }
}
