package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c9.d2 f1137a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f1138b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f1139c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f1140d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap.KeySetView f1141e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final java.util.Map f1142f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final java.util.Map f1143g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final java.util.Map f1144h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final java.util.Map f1145i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final java.lang.ThreadLocal f1146j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final java.lang.ThreadLocal f1147k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final java.lang.ThreadLocal f1148l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final java.util.concurrent.ExecutorService f1149m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final android.os.Handler f1150n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static volatile java.lang.reflect.Method f1151o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static volatile java.lang.reflect.Method f1152p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static volatile java.lang.Object f1153q;

    static {
            c9.d2 r0 = new c9.d2
            r0.<init>()
            c9.d2.f1137a = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            c9.d2.f1138b = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            c9.d2.f1139c = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            c9.d2.f1140d = r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            c9.d2.f1141e = r0
            java.util.Map r0 = p.a.p()
            c9.d2.f1142f = r0
            java.util.Map r0 = p.a.p()
            c9.d2.f1143g = r0
            java.util.Map r0 = p.a.p()
            c9.d2.f1144h = r0
            java.util.Map r0 = p.a.p()
            c9.d2.f1145i = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            c9.d2.f1146j = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            c9.d2.f1147k = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            c9.d2.f1148l = r0
            c9.q r0 = new c9.q
            r1 = 1
            r0.<init>(r1)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor(r0)
            c9.d2.f1149m = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            c9.d2.f1150n = r0
            return
    }

    public static void A(java.lang.Object r3, android.content.Context r4) {
            if (r3 == 0) goto L3c
            java.lang.String r0 = v(r3)
            if (r0 == 0) goto L3c
            java.util.List r4 = c9.o2.i(r4)
            java.util.Iterator r4 = r4.iterator()
        L10:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r4.next()
            r2 = r1
            c9.a r2 = (c9.a) r2
            java.lang.String r2 = r2.f1081a
            java.lang.String r2 = F(r2)
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L10
            goto L2b
        L2a:
            r1 = 0
        L2b:
            c9.a r1 = (c9.a) r1
            if (r1 == 0) goto L3c
            java.lang.String r4 = r1.f1082b
            if (r4 == 0) goto L3c
            java.lang.String r1 = "adapter"
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.readField(r3, r1)
            x(r0, r3, r4, r1)
        L3c:
            return
    }

    public static void B(java.lang.Object r6) {
            if (r6 == 0) goto L66
            java.lang.String r0 = v(r6)
            if (r0 == 0) goto L66
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r1 = h.Hchat.hooks.api.core.WeChatApis.database()
            if (r1 == 0) goto L66
            java.lang.String[] r2 = new java.lang.String[]{r0}
            java.lang.String r3 = "unReadCount"
            java.lang.String r4 = "SELECT IFNULL(unReadCount,0) AS unReadCount FROM rconversation WHERE username=? LIMIT 1"
            java.lang.String r1 = r1.queryFirstString(r4, r2, r3)
            if (r1 == 0) goto L66
            r2 = 10
            java.lang.Integer r1 = og.t.e0(r2, r1)
            if (r1 == 0) goto L66
            int r1 = r1.intValue()
            if (r1 >= 0) goto L2b
            r1 = 0
        L2b:
            java.lang.Class r2 = r6.getClass()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4}
            java.lang.String r5 = "setUnread"
            java.lang.reflect.Method r2 = h.Hchat.utils.KavaReflector.findCompatibleMethod(r2, r5, r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4}
            boolean r6 = h.Hchat.utils.KavaReflector.invokeSuccessfully(r2, r6, r3)
            if (r6 != 0) goto L66
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:ConversationGroup] 同步微信原生分组页未读数失败: talker="
            r6.<init>(r2)
            r6.append(r0)
            java.lang.String r0 = " unread="
            r6.append(r0)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            fb.v0.m(r6)
        L66:
            return
    }

    public static boolean C(h.Hchat.hooks.api.runtime.WeChatDatabaseApi r8, java.util.List r9, java.lang.String r10) {
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L8
            r8 = 1
            return r8
        L8:
            java.lang.reflect.Method r0 = c9.d2.f1151o
            r1 = 0
            if (r0 == 0) goto L119
            java.lang.Object r2 = c9.d2.f1153q
            r3 = 0
            if (r2 == 0) goto L25
            java.lang.Class r4 = r0.getDeclaringClass()
            r4.getClass()
            boolean r4 = r4.isInstance(r2)
            if (r4 == 0) goto L20
            goto L21
        L20:
            r2 = r3
        L21:
            if (r2 == 0) goto L25
        L23:
            r3 = r2
            goto L2e
        L25:
            java.lang.Object r2 = r8.storageObjectForMethod(r0)
            if (r2 == 0) goto L2e
            c9.d2.f1153q = r2
            goto L23
        L2e:
            if (r3 != 0) goto L32
            goto L119
        L32:
            java.lang.String[] r2 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L4a
            java.lang.Object[] r2 = r9.toArray(r2)     // Catch: java.lang.Throwable -> L4a
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch: java.lang.Throwable -> L4a
            java.lang.Class[] r4 = r0.getParameterTypes()     // Catch: java.lang.Throwable -> L4a
            int r4 = r4.length     // Catch: java.lang.Throwable -> L4a
            r5 = 2
            if (r4 != r5) goto L4e
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r10}     // Catch: java.lang.Throwable -> L4a
            h.Hchat.utils.KavaReflector.invokeOrThrow(r0, r3, r2)     // Catch: java.lang.Throwable -> L4a
            goto L57
        L4a:
            r0 = move-exception
            r8 = r0
            goto Lde
        L4e:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L4a
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r10, r4, r4}     // Catch: java.lang.Throwable -> L4a
            h.Hchat.utils.KavaReflector.invokeOrThrow(r0, r3, r2)     // Catch: java.lang.Throwable -> L4a
        L57:
            int r0 = r9.size()     // Catch: java.lang.Throwable -> L4a
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4a
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L4a
            r3 = r1
        L61:
            if (r3 >= r0) goto L6b
            java.lang.String r4 = "?"
            r2.add(r4)     // Catch: java.lang.Throwable -> L4a
            int r3 = r3 + 1
            goto L61
        L6b:
            java.lang.String r3 = ","
            r6 = 0
            r7 = 62
            r4 = 0
            r5 = 0
            java.lang.String r0 = tf.m.A1(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L4a
            java.util.ArrayList r10 = tf.m.G1(r9, r10)     // Catch: java.lang.Throwable -> L4a
            java.lang.String[] r2 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> L4a
            java.lang.Object[] r10 = r10.toArray(r2)     // Catch: java.lang.Throwable -> L4a
            java.lang.String[] r10 = (java.lang.String[]) r10     // Catch: java.lang.Throwable -> L4a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a
            r2.<init>()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r3 = "SELECT COUNT(*) AS matched FROM rconversation WHERE username IN ("
            r2.append(r3)     // Catch: java.lang.Throwable -> L4a
            r2.append(r0)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r0 = ") AND IFNULL(parentRef,'')=?"
            r2.append(r0)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r2 = "matched"
            java.lang.String r8 = r8.queryFirstString(r0, r10, r2)     // Catch: java.lang.Throwable -> L4a
            r8.getClass()     // Catch: java.lang.Throwable -> L4a
            r10 = 10
            java.lang.Integer r8 = og.t.e0(r10, r8)     // Catch: java.lang.Throwable -> L4a
            if (r8 == 0) goto Lad
            int r1 = r8.intValue()     // Catch: java.lang.Throwable -> L4a
        Lad:
            int r8 = r9.size()     // Catch: java.lang.Throwable -> L4a
            if (r1 != r8) goto Lb6
            java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L4a
            goto Le4
        Lb6:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4a
            int r10 = r9.size()     // Catch: java.lang.Throwable -> L4a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a
            r0.<init>()     // Catch: java.lang.Throwable -> L4a
            java.lang.String r2 = "数据库仅更新 "
            r0.append(r2)     // Catch: java.lang.Throwable -> L4a
            r0.append(r1)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r1 = "/"
            r0.append(r1)     // Catch: java.lang.Throwable -> L4a
            r0.append(r10)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r10 = " 条会话"
            r0.append(r10)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r10 = r0.toString()     // Catch: java.lang.Throwable -> L4a
            r8.<init>(r10)     // Catch: java.lang.Throwable -> L4a
            throw r8     // Catch: java.lang.Throwable -> L4a
        Lde:
            sf.f r10 = new sf.f
            r10.<init>(r8)
            r8 = r10
        Le4:
            java.lang.Throwable r10 = sf.g.b(r8)
            if (r10 == 0) goto L10b
            int r9 = r9.size()
            java.lang.String r0 = r10.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:ConversationGroup] 调用微信原生会话归拢失败: count="
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r9 = " "
            r1.append(r9)
            r1.append(r0)
            java.lang.String r9 = r1.toString()
            fb.v0.n(r9, r10)
        L10b:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            boolean r10 = r8 instanceof sf.f
            if (r10 == 0) goto L112
            r8 = r9
        L112:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            return r8
        L119:
            return r1
    }

    public static boolean D(h.Hchat.hooks.api.runtime.WeChatDatabaseApi r8, java.lang.String r9, java.lang.String r10, android.content.ContentValues r11) {
            java.lang.String r0 = "SELECT username FROM "
            java.lang.String r1 = " WHERE username=? LIMIT 1"
            java.lang.String r0 = eh.a.n(r0, r9, r1)
            java.lang.String[] r1 = new java.lang.String[]{r10}
            java.lang.String r2 = "username"
            java.lang.String r0 = r8.queryFirstString(r0, r1, r2)
            boolean r0 = gg.l.a(r0, r10)
            r1 = 0
            r3 = 1
            if (r0 == 0) goto L27
            java.lang.String r0 = "username=?"
            java.lang.String[] r2 = new java.lang.String[]{r10}
            int r8 = r8.update(r9, r11, r0, r2)
            if (r8 <= 0) goto L32
            goto L31
        L27:
            long r4 = r8.insert(r9, r2, r11)
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L32
        L31:
            r1 = r3
        L32:
            if (r1 != 0) goto L4d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r11 = "[Hchat:ConversationGroup] 写入虚拟分组入口失败: table="
            r8.<init>(r11)
            r8.append(r9)
            java.lang.String r9 = " talker="
            r8.append(r9)
            r8.append(r10)
            java.lang.String r8 = r8.toString()
            fb.v0.m(r8)
        L4d:
            return r1
    }

    public static java.lang.String E(java.lang.String r0, java.util.Map r1) {
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto Lb
            java.lang.String r0 = r0.toString()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 != 0) goto L10
            java.lang.String r0 = ""
        L10:
            return r0
    }

    public static final java.lang.String F(java.lang.String r6) {
            r6.getClass()
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)
            java.nio.charset.Charset r1 = og.a.f9804a
            byte[] r6 = r6.getBytes(r1)
            r6.getClass()
            byte[] r6 = r0.digest(r6)
            r0 = 32
            char[] r0 = new char[r0]
            r1 = 0
        L1b:
            r2 = 16
            if (r1 >= r2) goto L3c
            r2 = r6[r1]
            r3 = r2 & 255(0xff, float:3.57E-43)
            int r4 = r1 * 2
            int r3 = r3 >>> 4
            java.lang.String r5 = "0123456789abcdef"
            char r3 = r5.charAt(r3)
            r0[r4] = r3
            int r4 = r4 + 1
            r2 = r2 & 15
            char r2 = r5.charAt(r2)
            r0[r4] = r2
            int r1 = r1 + 1
            goto L1b
        L3c:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0)
            java.lang.String r0 = "wxid_hchat_group_"
            java.lang.String r6 = r0.concat(r6)
            return r6
    }

    public static final boolean a(c9.d2 r4, java.lang.reflect.Method r5) {
            r4.getClass()
            java.lang.Class[] r4 = r5.getParameterTypes()
            int r0 = r5.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            r1 = 0
            if (r0 != 0) goto L58
            int r0 = r5.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            if (r0 != 0) goto L58
            int r0 = r4.length
            r2 = 4
            if (r0 != r2) goto L58
            java.lang.Class<android.widget.AdapterView> r0 = android.widget.AdapterView.class
            r2 = r4[r1]
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto L58
            java.lang.Class<android.view.View> r0 = android.view.View.class
            r2 = 1
            r3 = r4[r2]
            boolean r0 = r0.isAssignableFrom(r3)
            if (r0 == 0) goto L58
            r0 = 2
            r0 = r4[r0]
            java.lang.Class r3 = java.lang.Integer.TYPE
            boolean r0 = gg.l.a(r0, r3)
            if (r0 == 0) goto L58
            r0 = 3
            r4 = r4[r0]
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r4 = gg.l.a(r4, r0)
            if (r4 == 0) goto L58
            java.lang.Class r4 = r5.getReturnType()
            java.lang.Class r5 = java.lang.Void.TYPE
            boolean r4 = gg.l.a(r4, r5)
            if (r4 == 0) goto L58
            return r2
        L58:
            return r1
    }

    public static final boolean b(c9.d2 r2, java.lang.reflect.Method r3) {
            r2.getClass()
            java.lang.Class[] r2 = r3.getParameterTypes()
            int r0 = r3.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            r1 = 0
            if (r0 != 0) goto L37
            int r0 = r3.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            if (r0 != 0) goto L37
            java.lang.Class r3 = r3.getReturnType()
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r3 = gg.l.a(r3, r0)
            if (r3 == 0) goto L37
            int r3 = r2.length
            r0 = 1
            if (r3 != r0) goto L37
            r2 = r2[r1]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            boolean r2 = gg.l.a(r2, r3)
            if (r2 == 0) goto L37
            return r0
        L37:
            return r1
    }

    public static final boolean c(c9.d2 r4, java.lang.reflect.Method r5) {
            r4.getClass()
            java.lang.Class[] r4 = r5.getParameterTypes()
            int r0 = r5.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            r1 = 0
            if (r0 != 0) goto L56
            int r0 = r5.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            if (r0 != 0) goto L56
            java.lang.Class<android.database.Cursor> r0 = android.database.Cursor.class
            java.lang.Class r5 = r5.getReturnType()
            boolean r5 = r0.isAssignableFrom(r5)
            if (r5 == 0) goto L56
            int r5 = r4.length
            r0 = 4
            if (r5 != r0) goto L56
            r5 = r4[r1]
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r5 = gg.l.a(r5, r0)
            if (r5 == 0) goto L56
            java.lang.Class<java.util.List> r5 = java.util.List.class
            r2 = 1
            r3 = r4[r2]
            boolean r5 = r5.isAssignableFrom(r3)
            if (r5 == 0) goto L56
            r5 = 2
            r5 = r4[r5]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            boolean r5 = gg.l.a(r5, r3)
            if (r5 == 0) goto L56
            r5 = 3
            r4 = r4[r5]
            boolean r4 = gg.l.a(r4, r0)
            if (r4 == 0) goto L56
            return r2
        L56:
            return r1
    }

    public static final boolean d(c9.d2 r4, java.lang.reflect.Method r5) {
            r4.getClass()
            java.lang.Class[] r4 = r5.getParameterTypes()
            int r0 = r5.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            r1 = 0
            if (r0 != 0) goto L72
            int r0 = r5.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            if (r0 != 0) goto L72
            java.lang.Class r0 = r5.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            boolean r0 = gg.l.a(r0, r2)
            if (r0 == 0) goto L72
            r4.getClass()
            int r4 = r4.length
            if (r4 != 0) goto L72
            java.lang.Class r4 = r5.getDeclaringClass()
            java.util.List r4 = h.Hchat.utils.KavaReflector.declaredConstructors(r4)
            if (r4 == 0) goto L3f
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L3f
            goto L72
        L3f:
            java.util.Iterator r4 = r4.iterator()
        L43:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L72
            java.lang.Object r5 = r4.next()
            java.lang.reflect.Constructor r5 = (java.lang.reflect.Constructor) r5
            java.lang.Class[] r5 = r5.getParameterTypes()
            int r0 = r5.length
            r2 = 3
            r3 = 1
            if (r0 != r2) goto L6e
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            r2 = r5[r1]
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto L6e
            r5 = r5[r3]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r5 = gg.l.a(r5, r0)
            if (r5 == 0) goto L6e
            r5 = r3
            goto L6f
        L6e:
            r5 = r1
        L6f:
            if (r5 == 0) goto L43
            return r3
        L72:
            return r1
    }

    public static final boolean e(c9.d2 r2, java.lang.reflect.Method r3) {
            r2.getClass()
            java.lang.Class[] r2 = r3.getParameterTypes()
            int r0 = r3.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            r1 = 0
            if (r0 == 0) goto L42
            int r0 = r3.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            if (r0 != 0) goto L42
            java.lang.Class r3 = r3.getReturnType()
            java.lang.Class r0 = java.lang.Void.TYPE
            boolean r3 = gg.l.a(r3, r0)
            if (r3 == 0) goto L42
            int r3 = r2.length
            r0 = 2
            if (r3 != r0) goto L42
            r3 = r2[r1]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r3 = gg.l.a(r3, r0)
            if (r3 == 0) goto L42
            r3 = 1
            r2 = r2[r3]
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r2 = gg.l.a(r2, r0)
            if (r2 == 0) goto L42
            return r3
        L42:
            return r1
    }

    public static final boolean f(c9.d2 r4, java.lang.reflect.Method r5) {
            r4.getClass()
            java.lang.Class[] r4 = r5.getParameterTypes()
            int r0 = r5.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            r1 = 0
            if (r0 != 0) goto L7b
            int r0 = r5.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            if (r0 != 0) goto L7b
            java.lang.Class r5 = r5.getReturnType()
            java.lang.Class r0 = java.lang.Void.TYPE
            boolean r5 = gg.l.a(r5, r0)
            if (r5 == 0) goto L7b
            r5 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r2 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer[] r0 = new java.lang.Integer[]{r0, r2}
            java.util.Set r0 = tf.d0.W(r0)
            int r2 = r4.length
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L7b
            r0 = r4[r1]
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L7b
            r0 = r4[r1]
            java.lang.Class r0 = r0.getComponentType()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            boolean r0 = gg.l.a(r0, r2)
            if (r0 == 0) goto L7b
            r0 = 1
            r3 = r4[r0]
            boolean r2 = gg.l.a(r3, r2)
            if (r2 == 0) goto L7b
            int r2 = r4.length
            if (r2 == r5) goto L7a
            r5 = r4[r5]
            java.lang.Class r2 = java.lang.Boolean.TYPE
            boolean r5 = gg.l.a(r5, r2)
            if (r5 == 0) goto L7b
            r5 = 3
            r4 = r4[r5]
            boolean r4 = gg.l.a(r4, r2)
            if (r4 == 0) goto L7b
        L7a:
            return r0
        L7b:
            return r1
    }

    public static final boolean g(c9.d2 r4, java.lang.reflect.Method r5) {
            r4.getClass()
            java.lang.Class[] r4 = r5.getParameterTypes()
            int r0 = r5.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            r1 = 0
            if (r0 != 0) goto L57
            java.lang.Class<android.database.Cursor> r0 = android.database.Cursor.class
            java.lang.Class r5 = r5.getReturnType()
            boolean r5 = r0.isAssignableFrom(r5)
            if (r5 == 0) goto L57
            int r5 = r4.length
            r0 = 5
            if (r5 != r0) goto L57
            r5 = r4[r1]
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r5 = gg.l.a(r5, r0)
            if (r5 == 0) goto L57
            java.lang.Class<java.util.List> r5 = java.util.List.class
            r0 = 1
            r2 = r4[r0]
            boolean r5 = r5.isAssignableFrom(r2)
            if (r5 == 0) goto L57
            r5 = 2
            r5 = r4[r5]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            boolean r5 = gg.l.a(r5, r2)
            if (r5 == 0) goto L57
            r5 = 3
            r5 = r4[r5]
            java.lang.Class r3 = java.lang.Boolean.TYPE
            boolean r5 = gg.l.a(r5, r3)
            if (r5 == 0) goto L57
            r5 = 4
            r4 = r4[r5]
            boolean r4 = gg.l.a(r4, r2)
            if (r4 == 0) goto L57
            return r0
        L57:
            return r1
    }

    public static final void h(android.app.Activity r3, java.lang.String r4) {
            java.util.List r0 = c9.o2.i(r3)
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            r2 = r1
            c9.a r2 = (c9.a) r2
            java.lang.String r2 = r2.f1081a
            boolean r2 = gg.l.a(r2, r4)
            if (r2 == 0) goto L8
            goto L1f
        L1e:
            r1 = 0
        L1f:
            c9.a r1 = (c9.a) r1
            if (r1 == 0) goto L57
            java.lang.String r4 = r1.f1081a
            java.lang.String r0 = F(r4)
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L3f
            r1.<init>()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = "com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI"
            android.content.Intent r1 = r1.setClassName(r3, r2)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = "Contact_User"
            r1.putExtra(r2, r0)     // Catch: java.lang.Throwable -> L3f
            r3.startActivity(r1)     // Catch: java.lang.Throwable -> L3f
            sf.n r3 = sf.n.f12433a     // Catch: java.lang.Throwable -> L3f
            goto L46
        L3f:
            r3 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r3)
            r3 = r0
        L46:
            java.lang.Throwable r3 = sf.g.b(r3)
            if (r3 == 0) goto L57
            java.lang.String r0 = r3.getMessage()
            java.lang.String r1 = "[Hchat:ConversationGroup] 打开微信原生分组页面失败: group="
            java.lang.String r2 = " "
            eh.a.w(r1, r4, r2, r0, r3)
        L57:
            return
    }

    public static java.lang.String i(java.lang.Object r3) {
            java.lang.String r0 = "username"
            java.lang.String r1 = "userName"
            java.lang.String r2 = "field_username"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            ng.j r0 = tf.l.k0(r0)
            c9.k1 r1 = new c9.k1
            r2 = 1
            r1.<init>(r3, r2)
            ng.i r3 = ng.m.X(r0, r1)
            ng.h r0 = new ng.h
            r0.<init>(r3)
        L1d:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L31
            java.lang.Object r3 = r0.next()
            r1 = r3
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = og.m.t0(r1)
            if (r1 != 0) goto L1d
            goto L32
        L31:
            r3 = 0
        L32:
            java.lang.String r3 = (java.lang.String) r3
            return r3
    }

    public static java.util.LinkedHashSet j(java.lang.String r5, java.util.List r6) {
            r5.getClass()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r1 = r6.iterator()
        Lc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r1.next()
            r3 = r2
            c9.a r3 = (c9.a) r3
            java.lang.String r3 = r3.f1083c
            java.lang.Object r4 = r0.get(r3)
            if (r4 != 0) goto L29
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.put(r3, r4)
        L29:
            java.util.List r4 = (java.util.List) r4
            r4.add(r2)
            goto Lc
        L2f:
            int r1 = tf.n.e1(r6)
            int r1 = tf.y.a0(r1)
            r2 = 16
            if (r1 >= r2) goto L3c
            r1 = r2
        L3c:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L45:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L58
            java.lang.Object r1 = r6.next()
            r3 = r1
            c9.a r3 = (c9.a) r3
            java.lang.String r3 = r3.f1081a
            r2.put(r3, r1)
            goto L45
        L58:
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet
            r6.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            k(r1, r2, r0, r6, r5)
            return r6
    }

    public static final void k(java.util.HashSet r3, java.util.LinkedHashMap r4, java.util.LinkedHashMap r5, java.util.LinkedHashSet r6, java.lang.String r7) {
            boolean r0 = r3.add(r7)
            if (r0 != 0) goto L7
            goto L4d
        L7:
            java.lang.Object r0 = r4.get(r7)
            c9.a r0 = (c9.a) r0
            if (r0 == 0) goto L2d
            java.util.List r0 = r0.f1085e
            if (r0 == 0) goto L2d
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = og.m.t0(r1)
            if (r2 != 0) goto L17
            r6.add(r1)
            goto L17
        L2d:
            java.lang.Object r7 = r5.get(r7)
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L37
            tf.t r7 = tf.t.f13167g
        L37:
            java.util.Iterator r7 = r7.iterator()
        L3b:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L4d
            java.lang.Object r0 = r7.next()
            c9.a r0 = (c9.a) r0
            java.lang.String r0 = r0.f1081a
            k(r3, r4, r5, r6, r0)
            goto L3b
        L4d:
            return
    }

    public static android.app.Activity l(android.content.Context r2) {
            r0 = 0
        L1:
            r1 = 8
            if (r0 >= r1) goto L19
            boolean r1 = r2 instanceof android.app.Activity
            if (r1 == 0) goto Lc
            android.app.Activity r2 = (android.app.Activity) r2
            return r2
        Lc:
            boolean r1 = r2 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L19
            android.content.ContextWrapper r2 = (android.content.ContextWrapper) r2
            android.content.Context r2 = r2.getBaseContext()
            int r0 = r0 + 1
            goto L1
        L19:
            r2 = 0
            return r2
    }

    public static boolean m(java.lang.reflect.Method r3, de.robv.android.xposed.XC_MethodHook r4) {
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = c9.d2.f1141e
            boolean r1 = r0.add(r3)
            if (r1 != 0) goto La
            r3 = 1
            return r3
        La:
            r8.i r1 = r8.i.f11631b     // Catch: java.lang.Throwable -> L12
            r1.b(r3, r4)     // Catch: java.lang.Throwable -> L12
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L12
            goto L19
        L12:
            r4 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r4)
            r4 = r1
        L19:
            java.lang.Throwable r1 = sf.g.b(r4)
            if (r1 != 0) goto L20
            goto L34
        L20:
            r0.remove(r3)
            java.lang.String r3 = r3.toGenericString()
            java.lang.String r4 = r1.getMessage()
            java.lang.String r0 = "[Hchat:ConversationGroup] Hook 安装失败: "
            java.lang.String r2 = " "
            eh.a.w(r0, r3, r2, r4, r1)
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
        L34:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r3 = r4.booleanValue()
            return r3
    }

    public static int n(java.lang.String r2, java.util.Map r3) {
            java.lang.Object r0 = r3.get(r2)
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto Lb
            java.lang.Number r0 = (java.lang.Number) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L13
            int r2 = r0.intValue()
            return r2
        L13:
            java.lang.String r2 = E(r2, r3)
            r3 = 10
            java.lang.Integer r2 = og.t.e0(r3, r2)
            if (r2 == 0) goto L24
            int r2 = r2.intValue()
            return r2
        L24:
            r2 = 0
            return r2
    }

    public static boolean o(java.lang.reflect.Method r3) {
            java.lang.Class[] r0 = r3.getParameterTypes()
            int r1 = r3.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            r2 = 0
            if (r1 != 0) goto L3f
            int r1 = r3.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isAbstract(r1)
            if (r1 != 0) goto L3f
            java.lang.Class r3 = r3.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            boolean r3 = gg.l.a(r3, r1)
            if (r3 == 0) goto L3f
            int r3 = r0.length
            r1 = 2
            if (r3 != r1) goto L3f
            java.lang.Class<android.view.MenuItem> r3 = android.view.MenuItem.class
            r1 = r0[r2]
            boolean r3 = r3.isAssignableFrom(r1)
            if (r3 == 0) goto L3f
            r3 = 1
            r0 = r0[r3]
            java.lang.Class r1 = java.lang.Integer.TYPE
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L3f
            return r3
        L3f:
            return r2
    }

    public static boolean p(java.lang.reflect.Method r5) {
            java.lang.Class[] r0 = r5.getParameterTypes()
            int r1 = r5.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            r2 = 0
            if (r1 != 0) goto L54
            int r1 = r5.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isAbstract(r1)
            if (r1 != 0) goto L54
            java.lang.Class r1 = r5.getReturnType()
            java.lang.Class r3 = java.lang.Void.TYPE
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L54
            int r1 = r0.length
            r3 = 3
            if (r1 != r3) goto L54
            java.lang.Class<android.view.ContextMenu> r1 = android.view.ContextMenu.class
            r3 = r0[r2]
            boolean r1 = r1.isAssignableFrom(r3)
            if (r1 == 0) goto L54
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r3 = 1
            r4 = r0[r3]
            boolean r1 = r1.isAssignableFrom(r4)
            if (r1 == 0) goto L54
            r1 = 2
            r0 = r0[r1]
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "android.view.ContextMenu$ContextMenuInfo"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L54
            java.lang.Class r5 = t(r5)
            if (r5 == 0) goto L54
            return r3
        L54:
            return r2
    }

    public static final boolean q(java.lang.String r2) {
            r0 = 0
            if (r2 == 0) goto Ld
            java.lang.String r1 = "wxid_hchat_group_"
            boolean r2 = og.t.d0(r2, r1, r0)
            r1 = 1
            if (r2 != r1) goto Ld
            return r1
        Ld:
            return r0
    }

    public static long s(java.lang.String r2, java.util.Map r3) {
            java.lang.Object r0 = r3.get(r2)
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto Lb
            java.lang.Number r0 = (java.lang.Number) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L13
            long r2 = r0.longValue()
            return r2
        L13:
            java.lang.String r2 = E(r2, r3)
            java.lang.Long r2 = og.t.g0(r2)
            if (r2 == 0) goto L22
            long r2 = r2.longValue()
            return r2
        L22:
            r2 = 0
            return r2
    }

    public static java.lang.Class t(java.lang.reflect.Method r7) {
            java.lang.Class r7 = r7.getDeclaringClass()
            java.util.List r7 = h.Hchat.utils.KavaReflector.declaredConstructors(r7)
            dg.n r7 = tf.m.m1(r7)
            b4.b r0 = new b4.b
            r1 = 3
            r0.<init>(r1)
            dg.j r1 = new dg.j
            ng.q r2 = ng.q.f9453n
            r1.<init>(r7, r0, r2)
            ng.c r7 = ng.m.S(r1)
            java.util.Iterator r7 = r7.iterator()
        L21:
            r0 = r7
            tf.b r0 = (tf.b) r0
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L99
            java.lang.Object r0 = r0.next()
            r1 = r0
            java.lang.Class r1 = (java.lang.Class) r1
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredFields(r1)
            r3 = 0
            if (r2 == 0) goto L3f
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L3f
            goto L96
        L3f:
            java.util.Iterator r2 = r2.iterator()
        L43:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L96
            java.lang.Object r4 = r2.next()
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            java.lang.Class r4 = r4.getType()
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = "com.tencent.mm.ui.conversation.ConvBoxServiceConversationUI$ConvBoxServiceConversationFmUI"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L43
            java.lang.Class r2 = java.lang.Integer.TYPE
            r2.getClass()
            java.lang.Class r4 = java.lang.Long.TYPE
            r4.getClass()
            java.lang.Class<android.widget.AdapterView> r5 = android.widget.AdapterView.class
            java.lang.Class<android.view.View> r6 = android.view.View.class
            java.lang.Class[] r2 = new java.lang.Class[]{r5, r6, r2, r4}
            java.lang.String r4 = "onItemLongClick"
            java.lang.reflect.Method r1 = h.Hchat.utils.KavaReflector.findMethod(r1, r4, r2)
            if (r1 == 0) goto L96
            java.lang.Class r2 = r1.getReturnType()
            java.lang.Class r4 = java.lang.Boolean.TYPE
            boolean r2 = gg.l.a(r2, r4)
            r4 = 1
            if (r2 == 0) goto L92
            int r1 = r1.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isAbstract(r1)
            if (r1 != 0) goto L92
            r1 = r4
            goto L93
        L92:
            r1 = r3
        L93:
            if (r1 != r4) goto L96
            r3 = r4
        L96:
            if (r3 == 0) goto L21
            goto L9a
        L99:
            r0 = 0
        L9a:
            java.lang.Class r0 = (java.lang.Class) r0
            return r0
    }

    public static java.lang.Class u(java.lang.reflect.Method r2, java.lang.reflect.Method r3) {
            boolean r0 = p(r2)
            if (r0 == 0) goto L46
            boolean r0 = o(r3)
            if (r0 != 0) goto Ld
            goto L46
        Ld:
            java.lang.Class r2 = t(r2)
            if (r2 == 0) goto L46
            java.lang.Class r3 = r3.getDeclaringClass()
            java.util.List r3 = h.Hchat.utils.KavaReflector.declaredConstructors(r3)
            r0 = 0
            if (r3 == 0) goto L25
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto L25
            goto L43
        L25:
            java.util.Iterator r3 = r3.iterator()
        L29:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L43
            java.lang.Object r1 = r3.next()
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
            java.lang.Class[] r1 = r1.getParameterTypes()
            r1.getClass()
            boolean r1 = tf.l.m0(r1, r2)
            if (r1 == 0) goto L29
            r0 = 1
        L43:
            if (r0 == 0) goto L46
            return r2
        L46:
            r2 = 0
            return r2
    }

    public static java.lang.String v(java.lang.Object r3) {
            r0 = 0
            if (r3 != 0) goto L4
            goto L33
        L4:
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "getUserName"
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invokeMethod(r3, r2, r1)
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L14
            java.lang.String r1 = (java.lang.String) r1
            goto L15
        L14:
            r1 = r0
        L15:
            boolean r2 = q(r1)
            if (r2 == 0) goto L1c
            return r1
        L1c:
            java.lang.String r1 = "superUsername"
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.readField(r3, r1)
            boolean r1 = r3 instanceof java.lang.String
            if (r1 == 0) goto L29
            java.lang.String r3 = (java.lang.String) r3
            goto L2a
        L29:
            r3 = r0
        L2a:
            if (r3 == 0) goto L33
            boolean r1 = q(r3)
            if (r1 == 0) goto L33
            return r3
        L33:
            return r0
    }

    public static void w(java.lang.Object r3, android.content.Context r4) {
            java.lang.String r0 = "adapter"
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.readField(r3, r0)
            if (r0 == 0) goto L3a
            java.lang.String r1 = v(r3)
            if (r1 == 0) goto L18
            java.util.Map r2 = c9.d2.f1144h
            r2.getClass()
            java.util.Map r2 = (java.util.Map) r2
            r2.put(r0, r1)
        L18:
            java.lang.reflect.Method r1 = c9.d2.f1152p
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            boolean r1 = h.Hchat.utils.KavaReflector.invokeSuccessfully(r1, r0, r2)
            if (r1 != 0) goto L34
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "[Hchat:ConversationGroup] 刷新微信原生分组列表失败: adapter="
            java.lang.String r0 = r1.concat(r0)
            fb.v0.m(r0)
        L34:
            A(r3, r4)
            B(r3)
        L3a:
            return
    }

    public static void x(java.lang.String r2, java.lang.Object r3, java.lang.String r4, java.lang.Object r5) {
            boolean r0 = r5 instanceof android.widget.Adapter
            r1 = 0
            if (r0 == 0) goto L8
            android.widget.Adapter r5 = (android.widget.Adapter) r5
            goto L9
        L8:
            r5 = r1
        L9:
            if (r5 == 0) goto L13
            int r5 = r5.getCount()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
        L13:
            if (r1 == 0) goto L32
            int r5 = r1.intValue()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = " ("
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = ")"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
        L32:
            java.lang.Class r5 = r3.getClass()
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            java.lang.String r1 = "setMMTitle"
            java.lang.reflect.Method r5 = h.Hchat.utils.KavaReflector.findMethodRecursive(r5, r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r4}
            boolean r3 = h.Hchat.utils.KavaReflector.invokeSuccessfully(r5, r3, r0)
            if (r3 != 0) goto L65
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "[Hchat:ConversationGroup] 设置微信原生分组页标题失败: talker="
            r3.<init>(r5)
            r3.append(r2)
            java.lang.String r2 = " title="
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = r3.toString()
            fb.v0.m(r2)
        L65:
            return
    }

    public static final void y(android.content.Context r3) {
            r3.getClass()
            java.util.concurrent.atomic.AtomicBoolean r0 = c9.d2.f1140d
            r1 = 1
            r0.set(r1)
            java.util.concurrent.atomic.AtomicBoolean r0 = c9.d2.f1139c
            r2 = 0
            boolean r0 = r0.compareAndSet(r2, r1)
            if (r0 != 0) goto L13
            return
        L13:
            c9.p1 r0 = new c9.p1
            r1 = 0
            r0.<init>(r3, r1)
            java.util.concurrent.ExecutorService r3 = c9.d2.f1149m
            r3.execute(r0)
            return
    }

    public static void z(android.content.Context r45) {
            r1 = r45
            java.lang.String r2 = "original_parent_refs"
            java.lang.String r3 = "{}"
            tf.u r4 = tf.u.f13168g
            java.lang.String r5 = c9.o2.a()
            boolean r0 = og.m.t0(r5)
            if (r0 == 0) goto L14
            goto Lc01
        L14:
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r6 = h.Hchat.hooks.api.core.WeChatApis.database()
            if (r6 == 0) goto Lc01
            java.util.List r7 = c9.o2.i(r1)
            java.lang.String r8 = "Hchat_conversation_groups"
            android.content.SharedPreferences r0 = ub.b.c(r1, r8)
            java.lang.String r9 = "enabled"
            r10 = 0
            boolean r9 = r0.getBoolean(r9, r10)
            java.lang.String r11 = "digestUser"
            java.lang.String r12 = "digest"
            java.lang.String r13 = "flag"
            java.lang.String r14 = "msgType"
            java.lang.String r15 = "content"
            java.lang.String r10 = "conversationTime"
            r17 = r4
            java.lang.String r4 = "isSend"
            r18 = r9
            java.lang.String r9 = "status"
            r19 = r5
            java.lang.String r5 = "unReadCount"
            r20 = r2
            java.lang.String r2 = "username"
            if (r18 == 0) goto L167
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r21 = r7.iterator()
        L52:
            boolean r22 = r21.hasNext()
            if (r22 == 0) goto L6a
            java.lang.Object r22 = r21.next()
            r23 = r3
            r3 = r22
            c9.a r3 = (c9.a) r3
            java.util.List r3 = r3.f1085e
            tf.r.h1(r0, r3)
            r3 = r23
            goto L52
        L6a:
            r23 = r3
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L74
            goto L169
        L74:
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r3 = h.Hchat.hooks.api.core.WeChatApis.database()
            if (r3 == 0) goto L169
            r21 = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r21 = r21.iterator()
        L8a:
            boolean r22 = r21.hasNext()
            if (r22 == 0) goto La6
            r22 = r8
            java.lang.Object r8 = r21.next()
            r24 = r8
            java.lang.String r24 = (java.lang.String) r24
            boolean r24 = og.m.t0(r24)
            if (r24 != 0) goto La3
            r1.add(r8)
        La3:
            r8 = r22
            goto L8a
        La6:
            r22 = r8
            java.util.Set r1 = tf.m.T1(r1)
            java.util.List r1 = tf.m.P1(r1)
            r8 = 400(0x190, float:5.6E-43)
            java.util.ArrayList r1 = tf.m.n1(r8, r1)
            java.util.Iterator r1 = r1.iterator()
        Lba:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L162
            java.lang.Object r8 = r1.next()
            java.util.List r8 = (java.util.List) r8
            r21 = r1
            int r1 = r8.size()
            r30 = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r1)
            r31 = r7
            r7 = 0
        Ld6:
            if (r7 >= r1) goto Le4
            r24 = r1
            java.lang.String r1 = "?"
            r6.add(r1)
            int r7 = r7 + 1
            r1 = r24
            goto Ld6
        Le4:
            r28 = 0
            r29 = 62
            java.lang.String r25 = ","
            r26 = 0
            r27 = 0
            r24 = r6
            java.lang.String r1 = tf.m.A1(r24, r25, r26, r27, r28, r29)
            java.lang.String r6 = "SELECT username,unReadCount,status,isSend,conversationTime,content,msgType,flag,digest,digestUser FROM rconversation WHERE username IN ("
            java.lang.String r7 = ")"
            java.lang.String r1 = eh.a.n(r6, r1, r7)
            r6 = 0
            java.lang.String[] r7 = new java.lang.String[r6]
            java.lang.Object[] r6 = r8.toArray(r7)
            java.lang.String[] r6 = (java.lang.String[]) r6
            java.util.List r1 = r3.query(r1, r6)
            r1.getClass()
            java.util.Iterator r1 = r1.iterator()
        L110:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L15a
            java.lang.Object r6 = r1.next()
            java.util.Map r6 = (java.util.Map) r6
            c9.s1 r32 = new c9.s1
            r6.getClass()
            java.lang.String r33 = E(r2, r6)
            int r34 = n(r5, r6)
            int r35 = n(r9, r6)
            int r36 = n(r4, r6)
            long r37 = s(r10, r6)
            java.lang.String r39 = E(r15, r6)
            int r40 = n(r14, r6)
            long r41 = s(r13, r6)
            java.lang.String r43 = E(r12, r6)
            java.lang.String r44 = E(r11, r6)
            r32.<init>(r33, r34, r35, r36, r37, r39, r40, r41, r43, r44)
            r6 = r32
            r7 = r33
            boolean r8 = og.m.t0(r7)
            if (r8 != 0) goto L110
            r0.put(r7, r6)
            goto L110
        L15a:
            r1 = r21
            r6 = r30
            r7 = r31
            goto Lba
        L162:
            r30 = r6
            r31 = r7
            goto L171
        L167:
            r23 = r3
        L169:
            r30 = r6
            r31 = r7
            r22 = r8
            r0 = r17
        L171:
            if (r18 == 0) goto L263
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r7 = r31.iterator()
        L17c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L25c
            java.lang.Object r8 = r7.next()
            c9.a r8 = (c9.a) r8
            java.lang.String r1 = r8.f1081a
            r6 = r31
            java.util.LinkedHashSet r1 = j(r1, r6)
            r25 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r25 = r25.iterator()
        L19b:
            boolean r26 = r25.hasNext()
            if (r26 == 0) goto L1b9
            java.lang.Object r26 = r25.next()
            r31 = r6
            r6 = r26
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.get(r6)
            c9.s1 r6 = (c9.s1) r6
            if (r6 == 0) goto L1b6
            r1.add(r6)
        L1b6:
            r6 = r31
            goto L19b
        L1b9:
            r31 = r6
            int r6 = r1.size()
            java.util.Iterator r25 = r1.iterator()
            r26 = r0
            r0 = 0
        L1c6:
            boolean r27 = r25.hasNext()
            if (r27 == 0) goto L1df
            java.lang.Object r27 = r25.next()
            r28 = r1
            r1 = r27
            c9.s1 r1 = (c9.s1) r1
            int r1 = r1.f1354b
            if (r1 >= 0) goto L1db
            r1 = 0
        L1db:
            int r0 = r0 + r1
            r1 = r28
            goto L1c6
        L1df:
            r28 = r1
            java.util.Iterator r1 = r28.iterator()
            boolean r25 = r1.hasNext()
            if (r25 != 0) goto L1f2
            r28 = r11
            r29 = r12
            r25 = 0
            goto L22f
        L1f2:
            java.lang.Object r25 = r1.next()
            boolean r27 = r1.hasNext()
            if (r27 != 0) goto L201
            r28 = r11
            r29 = r12
            goto L22f
        L201:
            r27 = r1
            r1 = r25
            c9.s1 r1 = (c9.s1) r1
            r28 = r11
            r29 = r12
            long r11 = r1.f1357e
            java.lang.Long r1 = java.lang.Long.valueOf(r11)
        L211:
            java.lang.Object r11 = r27.next()
            r12 = r11
            c9.s1 r12 = (c9.s1) r12
            r32 = r11
            long r11 = r12.f1357e
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            int r12 = r1.compareTo(r11)
            if (r12 >= 0) goto L229
            r1 = r11
            r25 = r32
        L229:
            boolean r11 = r27.hasNext()
            if (r11 != 0) goto L211
        L22f:
            r1 = r25
            c9.s1 r1 = (c9.s1) r1
            c9.t1 r11 = new c9.t1
            r11.<init>(r6, r0, r1)
            if (r6 > 0) goto L241
            boolean r0 = r8.f1092l
            if (r0 == 0) goto L23f
            goto L241
        L23f:
            r0 = 0
            goto L242
        L241:
            r0 = 1
        L242:
            if (r0 == 0) goto L245
            goto L246
        L245:
            r8 = 0
        L246:
            if (r8 == 0) goto L24e
            sf.e r0 = new sf.e
            r0.<init>(r8, r11)
            goto L24f
        L24e:
            r0 = 0
        L24f:
            if (r0 == 0) goto L254
            r3.add(r0)
        L254:
            r0 = r26
            r11 = r28
            r12 = r29
            goto L17c
        L25c:
            r28 = r11
            r29 = r12
        L260:
            r16 = 0
            goto L26a
        L263:
            r28 = r11
            r29 = r12
            tf.t r3 = tf.t.f13167g
            goto L260
        L26a:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet
            r6.<init>()
            java.util.Iterator r7 = r3.iterator()
        L277:
            boolean r0 = r7.hasNext()
            java.lang.String r8 = "rconversation"
            java.lang.String r11 = "username=?"
            java.lang.String r12 = "rcontact"
            r25 = r3
            java.lang.String r3 = "img_flag"
            r26 = r7
            java.lang.String r7 = "parentRef"
            r27 = r6
            java.lang.String r6 = ""
            if (r0 == 0) goto L56d
            java.lang.Object r0 = r26.next()
            sf.e r0 = (sf.e) r0
            r32 = r8
            java.lang.Object r8 = r0.f12418g
            c9.a r8 = (c9.a) r8
            java.lang.Object r0 = r0.f12419h
            r33 = r13
            r13 = r0
            c9.t1 r13 = (c9.t1) r13
            java.lang.String r0 = r8.f1081a
            r34 = r14
            boolean r14 = r8.f1090j
            r35 = r14
            java.lang.String r14 = F(r0)
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            r0.put(r2, r14)
            r36 = r15
            java.lang.String r15 = "nickname"
            r37 = r10
            java.lang.String r10 = r8.f1082b
            r0.put(r15, r10)
            java.lang.String r10 = "encryptUsername"
            r0.put(r10, r6)
            java.lang.String r10 = "type"
            r0.put(r10, r1)
            java.lang.String r10 = "verifyFlag"
            r0.put(r10, r1)
            r10 = r30
            boolean r0 = D(r10, r12, r14, r0)
            if (r0 != 0) goto L2e8
            r13 = r4
            r15 = r5
            r8 = r27
            r12 = r28
            r4 = r29
            r5 = r33
            r11 = r34
            r7 = r36
            goto L559
        L2e8:
            c9.s1 r12 = r13.f1376c
            if (r12 == 0) goto L31a
            if (r35 == 0) goto L2f0
            r0 = r12
            goto L2f1
        L2f0:
            r0 = 0
        L2f1:
            if (r0 == 0) goto L31a
            i8.a r15 = h.Hchat.hooks.api.core.WeChatApis.contact()     // Catch: java.lang.Throwable -> L307
            r15.getClass()     // Catch: java.lang.Throwable -> L307
            g8.i r15 = h.Hchat.hooks.api.core.WeChatApis.e()     // Catch: java.lang.Throwable -> L307
            if (r15 == 0) goto L309
            java.lang.String r0 = r0.f1353a     // Catch: java.lang.Throwable -> L307
            h.Hchat.hooks.api.model.WeChatContact r0 = r15.n(r0)     // Catch: java.lang.Throwable -> L307
            goto L311
        L307:
            r0 = move-exception
            goto L30b
        L309:
            r0 = 0
            goto L311
        L30b:
            sf.f r15 = new sf.f
            r15.<init>(r0)
            r0 = r15
        L311:
            boolean r15 = r0 instanceof sf.f
            if (r15 == 0) goto L317
            r0 = 0
        L317:
            h.Hchat.hooks.api.model.WeChatContact r0 = (h.Hchat.hooks.api.model.WeChatContact) r0
            goto L31b
        L31a:
            r0 = 0
        L31b:
            if (r0 == 0) goto L32e
            java.lang.String r15 = r0.avatarUrl
            boolean r15 = og.m.t0(r15)
            if (r15 == 0) goto L331
            java.lang.String r15 = r0.avatarBackupUrl
            boolean r15 = og.m.t0(r15)
            if (r15 != 0) goto L32e
            goto L331
        L32e:
            r30 = r6
            goto L34d
        L331:
            android.content.ContentValues r11 = new android.content.ContentValues
            r11.<init>()
            r11.put(r2, r14)
            java.lang.String r15 = "reserved1"
            r30 = r6
            java.lang.String r6 = r0.avatarUrl
            r11.put(r15, r6)
            java.lang.String r6 = "reserved2"
            java.lang.String r0 = r0.avatarBackupUrl
            r11.put(r6, r0)
            D(r10, r3, r14, r11)
            goto L354
        L34d:
            java.lang.String[] r0 = new java.lang.String[]{r14}
            r10.delete(r3, r11, r0)
        L354:
            boolean r0 = r8.f1089i
            if (r0 == 0) goto L35c
            int r0 = r13.f1375b
            r3 = r0
            goto L35d
        L35c:
            r3 = 0
        L35d:
            int r0 = r13.f1374a
            if (r3 <= 0) goto L37c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            java.lang.String r0 = " 个会话 · "
            r6.append(r0)
            r6.append(r3)
            java.lang.String r0 = " 条未读"
            r6.append(r0)
            java.lang.String r0 = r6.toString()
        L37a:
            r6 = r0
            goto L383
        L37c:
            java.lang.String r6 = " 个会话"
            java.lang.String r0 = p.a.i(r0, r6)
            goto L37a
        L383:
            if (r35 == 0) goto L399
            if (r12 == 0) goto L399
            java.lang.String r0 = r12.f1358f
            boolean r0 = og.m.t0(r0)
            if (r0 == 0) goto L397
            java.lang.String r0 = r12.f1361i
            boolean r0 = og.m.t0(r0)
            if (r0 != 0) goto L399
        L397:
            r11 = 1
            goto L39a
        L399:
            r11 = 0
        L39a:
            if (r12 == 0) goto L47a
            if (r11 == 0) goto L3a0
            r0 = r12
            goto L3a1
        L3a0:
            r0 = 0
        L3a1:
            if (r0 == 0) goto L47a
            java.lang.String r13 = r0.f1361i
            java.lang.String r15 = r0.f1362j
            boolean r38 = og.m.t0(r13)
            java.lang.String r39 = "[消息]"
            if (r38 == 0) goto L3e7
            int r13 = r0.f1359g
            r38 = r3
            r3 = 1
            if (r13 == r3) goto L3e4
            r3 = 3
            if (r13 == r3) goto L3e1
            r3 = 34
            if (r13 == r3) goto L3de
            r3 = 43
            if (r13 == r3) goto L3db
            r3 = 62
            if (r13 == r3) goto L3db
            r3 = 10000(0x2710, float:1.4013E-41)
            if (r13 == r3) goto L3e4
            r0 = 47
            if (r13 == r0) goto L3d8
            r0 = 48
            if (r13 == r0) goto L3d4
            r13 = r39
            goto L3e9
        L3d4:
            java.lang.String r0 = "[位置]"
        L3d6:
            r13 = r0
            goto L3e9
        L3d8:
            java.lang.String r0 = "[动画表情]"
            goto L3d6
        L3db:
            java.lang.String r0 = "[视频]"
            goto L3d6
        L3de:
            java.lang.String r0 = "[语音]"
            goto L3d6
        L3e1:
            java.lang.String r0 = "[图片]"
            goto L3d6
        L3e4:
            java.lang.String r0 = r0.f1358f
            goto L3d6
        L3e7:
            r38 = r3
        L3e9:
            boolean r0 = og.m.t0(r15)
            if (r0 != 0) goto L45a
            r0 = 37
            boolean r0 = og.m.i0(r13, r0)
            if (r0 != 0) goto L3f8
            goto L45a
        L3f8:
            i8.a r0 = h.Hchat.hooks.api.core.WeChatApis.contact()     // Catch: java.lang.Throwable -> L410
            r0.getClass()     // Catch: java.lang.Throwable -> L410
            g8.i r0 = h.Hchat.hooks.api.core.WeChatApis.e()     // Catch: java.lang.Throwable -> L410
            if (r0 == 0) goto L412
            h.Hchat.hooks.api.model.WeChatContact r0 = r0.n(r15)     // Catch: java.lang.Throwable -> L410
            if (r0 == 0) goto L412
            java.lang.String r0 = r0.displayName()     // Catch: java.lang.Throwable -> L410
            goto L41a
        L410:
            r0 = move-exception
            goto L414
        L412:
            r0 = 0
            goto L41a
        L414:
            sf.f r3 = new sf.f
            r3.<init>(r0)
            r0 = r3
        L41a:
            boolean r3 = r0 instanceof sf.f
            if (r3 == 0) goto L420
            r0 = 0
        L420:
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L426
            r0 = r30
        L426:
            boolean r3 = og.m.t0(r0)
            if (r3 == 0) goto L42d
            goto L42e
        L42d:
            r15 = r0
        L42e:
            java.lang.Object[] r0 = new java.lang.Object[]{r15}     // Catch: java.lang.Throwable -> L43c
            r3 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)     // Catch: java.lang.Throwable -> L43c
            java.lang.String r0 = java.lang.String.format(r13, r0)     // Catch: java.lang.Throwable -> L43c
            goto L443
        L43c:
            r0 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r0)
            r0 = r3
        L443:
            java.lang.Throwable r3 = sf.g.b(r0)
            if (r3 != 0) goto L44a
            goto L457
        L44a:
            java.lang.String r0 = "%1$s"
            r3 = 0
            java.lang.String r0 = og.t.a0(r13, r0, r15, r3)
            java.lang.String r13 = "%s"
            java.lang.String r0 = og.t.a0(r0, r13, r15, r3)
        L457:
            r13 = r0
            java.lang.String r13 = (java.lang.String) r13
        L45a:
            java.lang.CharSequence r0 = og.m.R0(r13)
            java.lang.String r0 = r0.toString()
            boolean r3 = og.m.t0(r0)
            if (r3 == 0) goto L46a
            r0 = r39
        L46a:
            java.lang.String r3 = "%"
            java.lang.String r13 = "%%"
            r15 = 0
            java.lang.String r0 = og.t.a0(r0, r3, r13, r15)
            java.lang.String r3 = "%s: "
            java.lang.String r0 = r3.concat(r0)
            goto L47d
        L47a:
            r38 = r3
            r0 = 0
        L47d:
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            r3.put(r2, r14)
            java.lang.String r13 = r8.f1083c
            if (r13 == 0) goto L48e
            java.lang.String r13 = F(r13)
            goto L48f
        L48e:
            r13 = 0
        L48f:
            if (r13 != 0) goto L493
            r13 = r30
        L493:
            r3.put(r7, r13)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r38)
            r3.put(r5, r7)
            if (r12 == 0) goto L4a2
            int r7 = r12.f1355c
            goto L4a3
        L4a2:
            r7 = 0
        L4a3:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r3.put(r9, r7)
            if (r12 == 0) goto L4af
            int r7 = r12.f1356d
            goto L4b0
        L4af:
            r7 = 0
        L4b0:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r3.put(r4, r7)
            r38 = 0
            r13 = r4
            r15 = r5
            if (r12 == 0) goto L4c0
            long r4 = r12.f1357e
            goto L4c2
        L4c0:
            r4 = r38
        L4c2:
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = r37
            r3.put(r5, r4)
            if (r35 == 0) goto L4e4
            if (r12 == 0) goto L4d2
            java.lang.String r4 = r12.f1358f
            goto L4d3
        L4d2:
            r4 = 0
        L4d3:
            if (r4 != 0) goto L4d7
            r4 = r30
        L4d7:
            boolean r7 = og.m.t0(r4)
            if (r7 == 0) goto L4e1
            if (r11 == 0) goto L4e4
            r4 = r30
        L4e1:
            r7 = r36
            goto L4e6
        L4e4:
            r4 = r6
            goto L4e1
        L4e6:
            r3.put(r7, r4)
            if (r35 == 0) goto L4f2
            if (r12 == 0) goto L4f0
            int r4 = r12.f1359g
            goto L4f3
        L4f0:
            r4 = 0
            goto L4f3
        L4f2:
            r4 = 1
        L4f3:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r11 = r34
            r3.put(r11, r4)
            boolean r4 = r8.f1087g
            if (r4 == 0) goto L510
            int r4 = r8.f1084d
            if (r4 >= 0) goto L505
            r4 = 0
        L505:
            r37 = r5
            long r4 = (long) r4
            r38 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r38 = r38 - r4
            goto L518
        L510:
            r37 = r5
            if (r12 == 0) goto L518
            long r4 = r12.f1357e
            r38 = r4
        L518:
            java.lang.Long r4 = java.lang.Long.valueOf(r38)
            r5 = r33
            r3.put(r5, r4)
            if (r35 == 0) goto L526
            if (r0 == 0) goto L526
            r6 = r0
        L526:
            r4 = r29
            r3.put(r4, r6)
            if (r35 == 0) goto L53c
            if (r0 == 0) goto L53c
            if (r12 == 0) goto L534
            java.lang.String r0 = r12.f1353a
            goto L535
        L534:
            r0 = 0
        L535:
            if (r0 != 0) goto L538
            goto L53c
        L538:
            r6 = r0
        L539:
            r12 = r28
            goto L53f
        L53c:
            r6 = r30
            goto L539
        L53f:
            r3.put(r12, r6)
            java.lang.String r0 = "hasTrunc"
            r3.put(r0, r1)
            r6 = r32
            boolean r0 = D(r10, r6, r14, r3)
            if (r0 == 0) goto L557
            java.lang.String r0 = r8.f1081a
            r8 = r27
            r8.add(r0)
            goto L559
        L557:
            r8 = r27
        L559:
            r29 = r4
            r6 = r8
            r30 = r10
            r14 = r11
            r28 = r12
            r4 = r13
            r3 = r25
            r10 = r37
            r13 = r5
            r5 = r15
            r15 = r7
            r7 = r26
            goto L277
        L56d:
            r10 = r30
            r30 = r6
            r6 = r8
            r8 = r27
            int r0 = tf.n.e1(r31)
            int r0 = tf.y.a0(r0)
            r1 = 16
            if (r0 >= r1) goto L581
            r0 = r1
        L581:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
            java.util.Iterator r0 = r31.iterator()
        L58a:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L59d
            java.lang.Object r4 = r0.next()
            r5 = r4
            c9.a r5 = (c9.a) r5
            java.lang.String r5 = r5.f1081a
            r1.put(r5, r4)
            goto L58a
        L59d:
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            java.util.Iterator r0 = r8.iterator()
        L5a6:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L5e3
            java.lang.Object r5 = r0.next()
            r9 = r5
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r9 = r1.get(r9)
            c9.a r9 = (c9.a) r9
            java.util.HashSet r13 = new java.util.HashSet
            r13.<init>()
        L5be:
            if (r9 == 0) goto L5dc
            java.lang.String r14 = r9.f1083c
            if (r14 == 0) goto L5dc
            java.lang.String r9 = r9.f1081a
            boolean r9 = r13.add(r9)
            if (r9 != 0) goto L5ce
        L5cc:
            r9 = 0
            goto L5dd
        L5ce:
            boolean r9 = r8.contains(r14)
            if (r9 != 0) goto L5d5
            goto L5cc
        L5d5:
            java.lang.Object r9 = r1.get(r14)
            c9.a r9 = (c9.a) r9
            goto L5be
        L5dc:
            r9 = 1
        L5dd:
            if (r9 == 0) goto L5a6
            r4.add(r5)
            goto L5a6
        L5e3:
            if (r18 == 0) goto L644
            uf.g r0 = new uf.g
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r5 = r31.iterator()
        L5f3:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L60c
            java.lang.Object r8 = r5.next()
            r9 = r8
            c9.a r9 = (c9.a) r9
            java.lang.String r9 = r9.f1081a
            boolean r9 = r4.contains(r9)
            if (r9 == 0) goto L5f3
            r1.add(r8)
            goto L5f3
        L60c:
            java.util.Iterator r1 = r1.iterator()
        L610:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L63a
            java.lang.Object r5 = r1.next()
            c9.a r5 = (c9.a) r5
            java.util.List r8 = r5.f1085e
            java.util.Iterator r8 = r8.iterator()
        L622:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L610
            java.lang.Object r9 = r8.next()
            java.lang.String r9 = (java.lang.String) r9
            boolean r13 = og.m.t0(r9)
            if (r13 != 0) goto L622
            java.lang.String r13 = r5.f1081a
            r0.put(r9, r13)
            goto L622
        L63a:
            uf.g r0 = r0.c()
            r1 = r0
        L63f:
            r5 = r45
            r8 = r22
            goto L647
        L644:
            r1 = r17
            goto L63f
        L647:
            android.content.SharedPreferences r5 = ub.b.c(r5, r8)
            r8 = r20
            r9 = r23
            java.lang.String r0 = r5.getString(r8, r9)     // Catch: java.lang.Throwable -> L664
            if (r0 != 0) goto L657
            r0 = r30
        L657:
            boolean r13 = og.m.t0(r0)     // Catch: java.lang.Throwable -> L664
            if (r13 == 0) goto L65e
            r0 = r9
        L65e:
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L664
            r13.<init>(r0)     // Catch: java.lang.Throwable -> L664
            goto L66a
        L664:
            r0 = move-exception
            sf.f r13 = new sf.f
            r13.<init>(r0)
        L66a:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            boolean r14 = r13 instanceof sf.f
            if (r14 == 0) goto L674
            r13 = r0
        L674:
            org.json.JSONObject r13 = (org.json.JSONObject) r13
            r14 = r19
            org.json.JSONObject r0 = r13.optJSONObject(r14)
            if (r0 == 0) goto L6b8
            uf.g r13 = new uf.g
            r13.<init>()
            java.util.Iterator r15 = r0.keys()
        L687:
            boolean r17 = r15.hasNext()
            if (r17 == 0) goto L6b1
            java.lang.Object r17 = r15.next()
            r45 = r15
            r15 = r17
            java.lang.String r15 = (java.lang.String) r15
            r15.getClass()
            boolean r17 = og.m.t0(r15)
            r18 = r11
            if (r17 != 0) goto L6ac
            java.lang.String r11 = r0.optString(r15)
            r11.getClass()
            r13.put(r15, r11)
        L6ac:
            r15 = r45
            r11 = r18
            goto L687
        L6b1:
            r18 = r11
            uf.g r0 = r13.c()
            goto L6bc
        L6b8:
            r18 = r11
            r0 = r17
        L6bc:
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>(r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.HashSet r13 = new java.util.HashSet
            r13.<init>()
            java.lang.String r15 = "hchat_conv_group:%"
            r17 = r3
            java.lang.String r3 = "wxid_hchat_group_%"
            java.lang.String[] r15 = new java.lang.String[]{r15, r3}
            r45 = r3
            java.lang.String r3 = "SELECT username,parentRef FROM rconversation WHERE parentRef LIKE ? OR parentRef LIKE ?"
            java.util.List r3 = r10.query(r3, r15)
            r3.getClass()
            java.util.Iterator r3 = r3.iterator()
        L6e4:
            boolean r15 = r3.hasNext()
            if (r15 == 0) goto L741
            java.lang.Object r15 = r3.next()
            java.util.Map r15 = (java.util.Map) r15
            r15.getClass()
            java.lang.String r15 = E(r2, r15)
            boolean r19 = og.m.t0(r15)
            if (r19 != 0) goto L709
            boolean r19 = q(r15)
            if (r19 != 0) goto L709
            boolean r19 = r1.containsKey(r15)
            if (r19 == 0) goto L70e
        L709:
            r20 = r1
            r22 = r3
            goto L73c
        L70e:
            java.lang.Object r19 = r11.get(r15)
            java.lang.String r19 = (java.lang.String) r19
            r20 = r1
            if (r19 != 0) goto L71b
            r1 = r30
            goto L71d
        L71b:
            r1 = r19
        L71d:
            java.lang.Object r19 = r0.get(r1)
            if (r19 != 0) goto L730
            r22 = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.put(r1, r3)
            r19 = r3
            goto L732
        L730:
            r22 = r3
        L732:
            r1 = r19
            java.util.List r1 = (java.util.List) r1
            r1.add(r15)
            r13.add(r15)
        L73c:
            r1 = r20
            r3 = r22
            goto L6e4
        L741:
            r20 = r1
            java.util.Set r1 = r20.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L74b:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L7b5
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r15 = r3.getKey()
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r3 = F(r3)
            r19 = r1
            java.lang.String r1 = "SELECT IFNULL(parentRef,'') AS parentRef FROM rconversation WHERE username=? LIMIT 1"
            r20 = r2
            java.lang.String[] r2 = new java.lang.String[]{r15}
            java.lang.String r1 = r10.queryFirstString(r1, r2, r7)
            boolean r2 = gg.l.a(r1, r3)
            if (r2 == 0) goto L77e
            r22 = r7
            goto L7ae
        L77e:
            r1.getClass()
            java.lang.String r2 = "hchat_conv_group:"
            r22 = r7
            r7 = 0
            boolean r2 = og.t.d0(r1, r2, r7)
            if (r2 != 0) goto L79b
            boolean r2 = q(r1)
            if (r2 != 0) goto L79b
            boolean r2 = r11.containsKey(r15)
            if (r2 != 0) goto L79b
            r11.put(r15, r1)
        L79b:
            java.lang.Object r1 = r0.get(r3)
            if (r1 != 0) goto L7a9
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.put(r3, r1)
        L7a9:
            java.util.List r1 = (java.util.List) r1
            r1.add(r15)
        L7ae:
            r1 = r19
            r2 = r20
            r7 = r22
            goto L74b
        L7b5:
            r20 = r2
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L7bf:
            boolean r1 = r0.hasNext()
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 == 0) goto L839
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.List r1 = tf.m.p1(r1)
            java.util.ArrayList r1 = tf.m.n1(r2, r1)
            java.util.Iterator r1 = r1.iterator()
        L7e5:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L7bf
            java.lang.Object r2 = r1.next()
            java.util.List r2 = (java.util.List) r2
            boolean r7 = C(r10, r2, r3)
            if (r7 == 0) goto L834
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r2 = r2.iterator()
        L800:
            boolean r15 = r2.hasNext()
            if (r15 == 0) goto L81b
            java.lang.Object r15 = r2.next()
            r19 = r0
            r0 = r15
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r13.contains(r0)
            if (r0 == 0) goto L818
            r7.add(r15)
        L818:
            r0 = r19
            goto L800
        L81b:
            r19 = r0
            java.util.Iterator r0 = r7.iterator()
        L821:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L836
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            r11.remove(r2)
            r13.remove(r2)
            goto L821
        L834:
            r19 = r0
        L836:
            r0 = r19
            goto L7e5
        L839:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r25.iterator()
        L842:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L85f
            java.lang.Object r3 = r1.next()
            r7 = r3
            sf.e r7 = (sf.e) r7
            java.lang.Object r7 = r7.f12418g
            c9.a r7 = (c9.a) r7
            java.lang.String r7 = r7.f1081a
            boolean r7 = r4.contains(r7)
            if (r7 == 0) goto L842
            r0.add(r3)
            goto L842
        L85f:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L868:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L89b
            java.lang.Object r3 = r0.next()
            r7 = r3
            sf.e r7 = (sf.e) r7
            java.lang.Object r7 = r7.f12418g
            c9.a r7 = (c9.a) r7
            java.lang.String r7 = r7.f1083c
            if (r7 == 0) goto L882
            java.lang.String r7 = F(r7)
            goto L883
        L882:
            r7 = 0
        L883:
            if (r7 != 0) goto L887
            r7 = r30
        L887:
            java.lang.Object r13 = r1.get(r7)
            if (r13 != 0) goto L895
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r1.put(r7, r13)
        L895:
            java.util.List r13 = (java.util.List) r13
            r13.add(r3)
            goto L868
        L89b:
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L8a3:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8fa
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r7 = new java.util.ArrayList
            int r13 = tf.n.e1(r1)
            r7.<init>(r13)
            java.util.Iterator r1 = r1.iterator()
        L8c8:
            boolean r13 = r1.hasNext()
            if (r13 == 0) goto L8e2
            java.lang.Object r13 = r1.next()
            sf.e r13 = (sf.e) r13
            java.lang.Object r13 = r13.f12418g
            c9.a r13 = (c9.a) r13
            java.lang.String r13 = r13.f1081a
            java.lang.String r13 = F(r13)
            r7.add(r13)
            goto L8c8
        L8e2:
            java.util.ArrayList r1 = tf.m.n1(r2, r7)
            java.util.Iterator r1 = r1.iterator()
        L8ea:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L8a3
            java.lang.Object r7 = r1.next()
            java.util.List r7 = (java.util.List) r7
            C(r10, r7, r3)
            goto L8ea
        L8fa:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r25.iterator()
        L903:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L920
            java.lang.Object r3 = r1.next()
            r7 = r3
            sf.e r7 = (sf.e) r7
            java.lang.Object r7 = r7.f12418g
            c9.a r7 = (c9.a) r7
            java.lang.String r7 = r7.f1081a
            boolean r7 = r4.contains(r7)
            if (r7 == 0) goto L903
            r0.add(r3)
            goto L903
        L920:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L92a
        L926:
            r23 = r11
            goto La6a
        L92a:
            java.lang.reflect.Method r1 = c9.d2.f1151o
            if (r1 == 0) goto L926
            java.lang.Object r3 = c9.d2.f1153q
            if (r3 == 0) goto L944
            java.lang.Class r7 = r1.getDeclaringClass()
            r7.getClass()
            boolean r7 = r7.isInstance(r3)
            if (r7 == 0) goto L940
            goto L941
        L940:
            r3 = 0
        L941:
            if (r3 == 0) goto L944
            goto L94c
        L944:
            java.lang.Object r3 = r10.storageObjectForMethod(r1)
            if (r3 == 0) goto L926
            c9.d2.f1153q = r3
        L94c:
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>()
            java.util.Iterator r0 = r0.iterator()
        L955:
            boolean r13 = r0.hasNext()
            if (r13 == 0) goto L98e
            java.lang.Object r13 = r0.next()
            r15 = r13
            sf.e r15 = (sf.e) r15
            java.lang.Object r15 = r15.f12418g
            c9.a r15 = (c9.a) r15
            java.lang.String r15 = r15.f1083c
            if (r15 == 0) goto L96f
            java.lang.String r15 = F(r15)
            goto L970
        L96f:
            r15 = 0
        L970:
            if (r15 != 0) goto L974
            r15 = r30
        L974:
            java.lang.Object r19 = r7.get(r15)
            if (r19 != 0) goto L984
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r7.put(r15, r2)
            r19 = r2
        L984:
            r2 = r19
            java.util.List r2 = (java.util.List) r2
            r2.add(r13)
            r2 = 200(0xc8, float:2.8E-43)
            goto L955
        L98e:
            java.util.Set r0 = r7.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L996:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L926
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r7 = r0.getKey()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r13 = new java.util.ArrayList
            int r15 = tf.n.e1(r0)
            r13.<init>(r15)
            java.util.Iterator r0 = r0.iterator()
        L9bb:
            boolean r15 = r0.hasNext()
            if (r15 == 0) goto L9d5
            java.lang.Object r15 = r0.next()
            sf.e r15 = (sf.e) r15
            java.lang.Object r15 = r15.f12418g
            c9.a r15 = (c9.a) r15
            java.lang.String r15 = r15.f1081a
            java.lang.String r15 = F(r15)
            r13.add(r15)
            goto L9bb
        L9d5:
            r15 = 200(0xc8, float:2.8E-43)
            java.util.ArrayList r0 = tf.m.n1(r15, r13)
            java.util.Iterator r13 = r0.iterator()
        L9df:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L996
            java.lang.Object r0 = r13.next()
            r15 = r0
            java.util.List r15 = (java.util.List) r15
            r19 = r2
            r2 = 0
            java.lang.String[] r0 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> La23
            java.lang.Object[] r0 = r15.toArray(r0)     // Catch: java.lang.Throwable -> La23
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch: java.lang.Throwable -> La23
            java.lang.Class[] r2 = r1.getParameterTypes()     // Catch: java.lang.Throwable -> La23
            int r2 = r2.length     // Catch: java.lang.Throwable -> La23
            r23 = r11
            r11 = 2
            if (r2 != r11) goto La0c
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r7}     // Catch: java.lang.Throwable -> La0a
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invokeOrThrow(r1, r3, r0)     // Catch: java.lang.Throwable -> La0a
            goto La2c
        La0a:
            r0 = move-exception
            goto La26
        La0c:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> La0a
            boolean r11 = og.m.t0(r7)     // Catch: java.lang.Throwable -> La0a
            r24 = 1
            r11 = r11 ^ 1
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch: java.lang.Throwable -> La0a
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r7, r2, r11}     // Catch: java.lang.Throwable -> La0a
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invokeOrThrow(r1, r3, r0)     // Catch: java.lang.Throwable -> La0a
            goto La2c
        La23:
            r0 = move-exception
            r23 = r11
        La26:
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        La2c:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto La5e
            int r2 = r15.size()
            java.lang.String r11 = r0.getMessage()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r26 = r1
            java.lang.String r1 = "[Hchat:ConversationGroup] 通知虚拟分组会话刷新失败: count="
            r15.<init>(r1)
            r15.append(r2)
            java.lang.String r1 = " parent="
            r15.append(r1)
            r15.append(r7)
            java.lang.String r1 = " "
            r15.append(r1)
            r15.append(r11)
            java.lang.String r1 = r15.toString()
            fb.v0.n(r1, r0)
            goto La60
        La5e:
            r26 = r1
        La60:
            r2 = r19
            r11 = r23
            r1 = r26
            r15 = 200(0xc8, float:2.8E-43)
            goto L9df
        La6a:
            java.lang.String r0 = r5.getString(r8, r9)     // Catch: java.lang.Throwable -> La7f
            if (r0 != 0) goto La72
            r0 = r30
        La72:
            boolean r1 = og.m.t0(r0)     // Catch: java.lang.Throwable -> La7f
            if (r1 == 0) goto La79
            r0 = r9
        La79:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La7f
            r1.<init>(r0)     // Catch: java.lang.Throwable -> La7f
            goto La85
        La7f:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
        La85:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            boolean r2 = r1 instanceof sf.f
            if (r2 == 0) goto La8f
            r1 = r0
        La8f:
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            boolean r0 = r23.isEmpty()
            if (r0 == 0) goto La9b
            r1.remove(r14)
            goto Lac7
        La9b:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.Set r2 = r23.entrySet()
            java.util.Iterator r2 = r2.iterator()
        Laa8:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lac4
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r7 = r3.getKey()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
            r0.put(r7, r3)
            goto Laa8
        Lac4:
            r1.put(r14, r0)
        Lac7:
            java.lang.String r0 = r1.toString()
            r0.getClass()
            java.lang.String r1 = r5.getString(r8, r9)
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto Lad9
            goto Laf0
        Lad9:
            android.content.SharedPreferences$Editor r1 = r5.edit()
            android.content.SharedPreferences$Editor r0 = r1.putString(r8, r0)
            boolean r0 = r0.commit()
            if (r0 != 0) goto Laf0
            java.lang.String r0 = "[Hchat:ConversationGroup] 保存原始 parentRef 失败: account="
            java.lang.String r0 = r0.concat(r14)
            fb.v0.m(r0)
        Laf0:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r25.iterator()
        Laf9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lb16
            java.lang.Object r2 = r1.next()
            r3 = r2
            sf.e r3 = (sf.e) r3
            java.lang.Object r3 = r3.f12418g
            c9.a r3 = (c9.a) r3
            java.lang.String r3 = r3.f1081a
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto Laf9
            r0.add(r2)
            goto Laf9
        Lb16:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = tf.n.e1(r0)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        Lb23:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lb3d
            java.lang.Object r2 = r0.next()
            sf.e r2 = (sf.e) r2
            java.lang.Object r2 = r2.f12418g
            c9.a r2 = (c9.a) r2
            java.lang.String r2 = r2.f1081a
            java.lang.String r2 = F(r2)
            r1.add(r2)
            goto Lb23
        Lb3d:
            java.util.Set r0 = tf.m.U1(r1)
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r2 = r17
            java.lang.String[] r3 = new java.lang.String[]{r6, r12, r2}
            java.util.List r3 = a.a.y0(r3)
            java.util.Iterator r3 = r3.iterator()
        Lb54:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lb9c
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = "SELECT username FROM "
            java.lang.String r7 = " WHERE username LIKE ?"
            java.lang.String r4 = eh.a.n(r5, r4, r7)
            java.lang.String[] r5 = new java.lang.String[]{r45}
            java.util.List r4 = r10.query(r4, r5)
            r4.getClass()
            java.util.Iterator r4 = r4.iterator()
        Lb77:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lb54
            java.lang.Object r5 = r4.next()
            java.util.Map r5 = (java.util.Map) r5
            r5.getClass()
            r7 = r20
            java.lang.String r5 = E(r7, r5)
            boolean r8 = og.m.t0(r5)
            if (r8 != 0) goto Lb93
            goto Lb94
        Lb93:
            r5 = 0
        Lb94:
            if (r5 == 0) goto Lb99
            r1.add(r5)
        Lb99:
            r20 = r7
            goto Lb77
        Lb9c:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Set r0 = tf.d0.T(r1, r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r1 = r0.iterator()
        Lba8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lc01
            java.lang.Object r0 = r1.next()
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            h8.a r0 = h.Hchat.hooks.api.core.WeChatApis.conversations()     // Catch: java.lang.Throwable -> Lbc4
            if (r0 == 0) goto Lbc7
            boolean r0 = r0.a(r3)     // Catch: java.lang.Throwable -> Lbc4
            r4 = 1
            if (r0 != r4) goto Lbc8
            r0 = r4
            goto Lbc9
        Lbc4:
            r0 = move-exception
            r4 = 1
            goto Lbcf
        Lbc7:
            r4 = 1
        Lbc8:
            r0 = 0
        Lbc9:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> Lbce
            goto Lbd5
        Lbce:
            r0 = move-exception
        Lbcf:
            sf.f r5 = new sf.f
            r5.<init>(r0)
            r0 = r5
        Lbd5:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r7 = r0 instanceof sf.f
            if (r7 == 0) goto Lbdc
            r0 = r5
        Lbdc:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lbee
            java.lang.String[] r0 = new java.lang.String[]{r3}
            r5 = r18
            r10.delete(r6, r5, r0)
            goto Lbf0
        Lbee:
            r5 = r18
        Lbf0:
            java.lang.String[] r0 = new java.lang.String[]{r3}
            r10.delete(r12, r5, r0)
            java.lang.String[] r0 = new java.lang.String[]{r3}
            r10.delete(r2, r5, r0)
            r18 = r5
            goto Lba8
        Lc01:
            return
    }

    public final java.lang.reflect.Method r(r8.g r6, java.lang.String r7, ch.e r8, fg.l r9) {
            r5 = this;
            android.content.Context r0 = r6.f11620a
            java.lang.String r1 = "Hchat_conversation_group_method_cache"
            android.content.SharedPreferences r0 = ub.b.c(r0, r1)
            android.content.Context r1 = r6.f11620a
            java.lang.ClassLoader r2 = r6.f11622c
            r2.getClass()
            l8.i r1 = o8.k.a(r1, r2)
            java.lang.String r1 = r1.f7933h
            r2 = 0
            org.luckypray.dexkit.DexKitBridge r3 = r6.f11623d     // Catch: java.lang.Throwable -> L46
            hh.p r8 = r3.findMethod(r8)     // Catch: java.lang.Throwable -> L46
            dg.n r8 = tf.m.m1(r8)     // Catch: java.lang.Throwable -> L46
            c9.o1 r3 = new c9.o1     // Catch: java.lang.Throwable -> L46
            r4 = 0
            r3.<init>(r5, r6, r4)     // Catch: java.lang.Throwable -> L46
            ng.i r6 = ng.m.X(r8, r3)     // Catch: java.lang.Throwable -> L46
            ng.h r8 = new ng.h     // Catch: java.lang.Throwable -> L46
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L46
        L2f:
            boolean r6 = r8.hasNext()     // Catch: java.lang.Throwable -> L46
            if (r6 == 0) goto L48
            java.lang.Object r6 = r8.next()     // Catch: java.lang.Throwable -> L46
            java.lang.Object r3 = r9.invoke(r6)     // Catch: java.lang.Throwable -> L46
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L46
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L2f
            goto L49
        L46:
            r6 = move-exception
            goto L4c
        L48:
            r6 = r2
        L49:
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6     // Catch: java.lang.Throwable -> L46
            goto L52
        L4c:
            sf.f r8 = new sf.f
            r8.<init>(r6)
            r6 = r8
        L52:
            java.lang.Throwable r8 = sf.g.b(r6)
            if (r8 == 0) goto L63
            java.lang.String r9 = r8.getMessage()
            java.lang.String r3 = "[Hchat:ConversationGroup] 定位微信会话入口失败 key="
            java.lang.String r4 = ": "
            eh.a.w(r3, r7, r4, r9, r8)
        L63:
            boolean r8 = r6 instanceof sf.f
            if (r8 == 0) goto L68
            goto L69
        L68:
            r2 = r6
        L69:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            if (r2 == 0) goto L71
            e8.b.h(r0, r1, r7, r2)
            goto L91
        L71:
            java.lang.String r6 = "cache.key"
            android.content.SharedPreferences$Editor r8 = r0.edit()     // Catch: java.lang.Throwable -> L91
            java.lang.String r9 = ""
            java.lang.String r9 = r0.getString(r6, r9)     // Catch: java.lang.Throwable -> L91
            boolean r9 = gg.l.a(r9, r1)     // Catch: java.lang.Throwable -> L91
            if (r9 != 0) goto L8a
            android.content.SharedPreferences$Editor r9 = r8.clear()     // Catch: java.lang.Throwable -> L91
            r9.putString(r6, r1)     // Catch: java.lang.Throwable -> L91
        L8a:
            android.content.SharedPreferences$Editor r6 = r8.remove(r7)     // Catch: java.lang.Throwable -> L91
            r6.apply()     // Catch: java.lang.Throwable -> L91
        L91:
            return r2
    }
}
