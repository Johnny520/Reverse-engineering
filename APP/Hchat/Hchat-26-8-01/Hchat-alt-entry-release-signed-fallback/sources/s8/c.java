package s8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends r8.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final java.util.Set f12383n = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.Set f12384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f12385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.Set f12386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f12387h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public android.content.SharedPreferences f12388i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f12389j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile boolean f12390k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile boolean f12391l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile boolean f12392m;

    static {
            java.lang.String r0 = "rowid"
            java.util.Set r0 = ac.p.N(r0)
            s8.c.f12383n = r0
            return
    }

    public c() {
            r1 = this;
            r1.<init>()
            java.util.Set r0 = j8.b.o()
            r1.f12384e = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.f12385f = r0
            java.util.Set r0 = j8.b.o()
            r1.f12386g = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.f12387h = r0
            return
    }

    public static boolean A(java.lang.Class r3) {
            r0 = 0
            java.lang.Class[] r1 = new java.lang.Class[r0]
            java.lang.String r2 = "getMsgId"
            java.lang.reflect.Method r1 = h.Hchat.utils.KavaReflector.findMethod(r3, r2, r1)
            if (r1 == 0) goto L28
            java.lang.String r1 = "getType"
            java.lang.Class[] r2 = new java.lang.Class[r0]
            java.lang.reflect.Method r1 = h.Hchat.utils.KavaReflector.findMethod(r3, r1, r2)
            if (r1 == 0) goto L28
            java.lang.Class r1 = java.lang.Integer.TYPE
            r1.getClass()
            java.lang.Class[] r1 = new java.lang.Class[]{r1}
            java.lang.String r2 = "setType"
            java.lang.reflect.Method r3 = h.Hchat.utils.KavaReflector.findMethod(r3, r2, r1)
            if (r3 == 0) goto L28
            r3 = 1
            return r3
        L28:
            return r0
    }

    public static boolean B(int r1) {
            r0 = 268445456(0x10002710, float:2.5273642E-29)
            if (r1 == r0) goto L12
            r0 = 268445458(0x10002712, float:2.5273648E-29)
            if (r1 == r0) goto L12
            r0 = 285222674(0x11002712, float:1.0109459E-28)
            if (r1 != r0) goto L10
            goto L12
        L10:
            r1 = 0
            return r1
        L12:
            r1 = 1
            return r1
    }

    public static boolean C(r8.g r2) {
            android.content.Context r2 = r2.f11620a
            java.lang.String r0 = "Hchat_anti_recall_config"
            android.content.SharedPreferences r2 = ub.b.c(r2, r0)
            java.lang.String r0 = "anti_recall_keep_self"
            r1 = 0
            boolean r2 = r2.getBoolean(r0, r1)
            return r2
    }

    public static boolean G(java.lang.Object r5) {
            java.lang.String r0 = "isSend"
            java.lang.String r1 = "field_isSend"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            r1 = 0
            r2 = r1
        La:
            r3 = 2
            if (r2 < r3) goto Le
            return r1
        Le:
            r3 = r0[r2]
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.readField(r5, r3)
            boolean r4 = r3 instanceof java.lang.Number
            if (r4 == 0) goto L1b
            java.lang.Number r3 = (java.lang.Number) r3
            goto L1c
        L1b:
            r3 = 0
        L1c:
            if (r3 == 0) goto L26
            int r3 = r3.intValue()
            r4 = 1
            if (r3 != r4) goto L26
            return r4
        L26:
            int r2 = r2 + 1
            goto La
    }

    public static long H(java.lang.Object r4) {
            r0 = 0
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = "getMsgId"
            java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L1e
            java.lang.reflect.Method r1 = h.Hchat.utils.KavaReflector.findMethod(r1, r2, r3)     // Catch: java.lang.Throwable -> L1e
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invoke(r1, r4, r2)     // Catch: java.lang.Throwable -> L1e
            boolean r2 = r1 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L1e
            java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.lang.Throwable -> L1e
            long r0 = r1.longValue()     // Catch: java.lang.Throwable -> L1e
            return r0
        L1e:
            java.lang.String r1 = "msgId"
            java.lang.String r2 = "field_msgId"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
        L26:
            r2 = 2
            if (r0 < r2) goto L2c
            r0 = 0
            return r0
        L2c:
            r2 = r1[r0]
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r4, r2)
            boolean r3 = r2 instanceof java.lang.Number
            if (r3 == 0) goto L3d
            java.lang.Number r2 = (java.lang.Number) r2
            long r0 = r2.longValue()
            return r0
        L3d:
            int r0 = r0 + 1
            goto L26
    }

    public static int I(java.lang.Object r5) {
            r0 = 0
            r1 = 0
            java.lang.Class r2 = r5.getClass()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r3 = "getType"
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L1b
            java.lang.reflect.Method r2 = h.Hchat.utils.KavaReflector.findMethod(r2, r3, r4)     // Catch: java.lang.Throwable -> L1b
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.invoke(r2, r5, r3)     // Catch: java.lang.Throwable -> L1b
            boolean r2 = r5 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1d
            java.lang.Number r5 = (java.lang.Number) r5     // Catch: java.lang.Throwable -> L1b
            goto L25
        L1b:
            r5 = move-exception
            goto L1f
        L1d:
            r5 = r0
            goto L25
        L1f:
            sf.f r2 = new sf.f
            r2.<init>(r5)
            r5 = r2
        L25:
            boolean r2 = r5 instanceof sf.f
            if (r2 == 0) goto L2b
            goto L2c
        L2b:
            r0 = r5
        L2c:
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L34
            int r1 = r0.intValue()
        L34:
            return r1
    }

    public static java.lang.String J(r8.g r1) {
            android.content.Context r0 = r1.f11620a
            java.lang.ClassLoader r1 = r1.f11622c
            r1.getClass()
            l8.i r1 = o8.k.a(r0, r1)
            java.lang.String r1 = r1.f7933h
            return r1
    }

    public static long K(long r2) {
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L12
            r0 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L12
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
        L12:
            return r2
    }

    public static java.util.Map L(long r6, java.lang.String r8) {
            java.lang.String r0 = "`"
            java.lang.String r1 = "SELECT * FROM "
            boolean r2 = og.m.t0(r8)
            r3 = 0
            if (r2 == 0) goto Lc
            goto L5f
        Lc:
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r2 = h.Hchat.hooks.api.core.WeChatApis.database()
            if (r2 == 0) goto L5f
            java.lang.String r4 = "``"
            r5 = 0
            java.lang.String r8 = og.t.a0(r8, r0, r4, r5)     // Catch: java.lang.Throwable -> L4f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L4f
            r4.append(r8)     // Catch: java.lang.Throwable -> L4f
            r4.append(r0)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r8 = r4.toString()     // Catch: java.lang.Throwable -> L4f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4f
            r0.append(r8)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r8 = " WHERE msgId=? LIMIT 1"
            r0.append(r8)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r8 = r0.toString()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L4f
            java.lang.String[] r6 = new java.lang.String[]{r6}     // Catch: java.lang.Throwable -> L4f
            java.util.List r6 = r2.query(r8, r6)     // Catch: java.lang.Throwable -> L4f
            r6.getClass()     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r6 = tf.m.v1(r6)     // Catch: java.lang.Throwable -> L4f
            java.util.Map r6 = (java.util.Map) r6     // Catch: java.lang.Throwable -> L4f
            goto L56
        L4f:
            r6 = move-exception
            sf.f r7 = new sf.f
            r7.<init>(r6)
            r6 = r7
        L56:
            boolean r7 = r6 instanceof sf.f
            if (r7 == 0) goto L5c
            goto L5d
        L5c:
            r3 = r6
        L5d:
            java.util.Map r3 = (java.util.Map) r3
        L5f:
            return r3
    }

    public static java.util.ArrayList M(long r4, l8.f r6) {
            r0 = 0
            if (r6 == 0) goto L7
            long r2 = r6.f7916a
            goto L8
        L7:
            r2 = r0
        L8:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            if (r6 == 0) goto L15
            long r5 = r6.f7917b
            goto L16
        L15:
            r5 = r0
        L16:
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            java.lang.Long[] r4 = new java.lang.Long[]{r2, r4, r5}
            java.util.LinkedHashSet r4 = tf.d0.R(r4)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L2b:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L49
            java.lang.Object r6 = r4.next()
            r2 = r6
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 <= 0) goto L42
            r2 = 1
            goto L43
        L42:
            r2 = 0
        L43:
            if (r2 == 0) goto L2b
            r5.add(r6)
            goto L2b
        L49:
            return r5
    }

    public static java.lang.Long P(java.lang.String r4, java.lang.String r5) {
            boolean r0 = og.m.t0(r4)
            r1 = 0
            if (r0 == 0) goto L8
            goto L58
        L8:
            java.lang.String r0 = "\\b[^>]*>\\s*(.*?)\\s*</"
            java.lang.String r2 = ">"
            java.lang.String r3 = "<"
            java.lang.String r5 = bc.e.k(r3, r5, r0, r5, r2)
            r0 = 2
            int r0 = l3.w.f(r0)
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5, r0)
            r5.getClass()
            java.util.regex.Matcher r5 = r5.matcher(r4)
            r5.getClass()
            r0 = 0
            og.i r4 = a7.a.b(r5, r0, r4)
            if (r4 == 0) goto L50
            java.util.List r4 = r4.a()
            r5 = 1
            java.lang.Object r4 = tf.m.w1(r5, r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L50
            java.lang.String r5 = "<![CDATA["
            java.lang.String r2 = ""
            java.lang.String r4 = og.t.a0(r4, r5, r2, r0)
            java.lang.String r5 = "]]>"
            java.lang.String r4 = og.t.a0(r4, r5, r2, r0)
            java.lang.CharSequence r4 = og.m.R0(r4)
            java.lang.String r4 = r4.toString()
            goto L51
        L50:
            r4 = r1
        L51:
            if (r4 == 0) goto L58
            java.lang.Long r4 = og.t.g0(r4)
            return r4
        L58:
            return r1
    }

    public static final boolean k(s8.c r1, r8.g r2) {
            android.content.Context r1 = r2.f11620a
            java.lang.String r2 = "Hchat_anti_recall_config"
            android.content.SharedPreferences r1 = ub.b.c(r1, r2)
            java.lang.String r2 = "anti_recall_enable"
            r0 = 0
            boolean r1 = r1.getBoolean(r2, r0)
            return r1
    }

    public static java.lang.String l(java.lang.Object r4, java.lang.String r5) {
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.readField(r4, r5)
            if (r4 == 0) goto L39
            boolean r5 = r4 instanceof java.lang.String
            if (r5 == 0) goto Ld
            java.lang.String r4 = (java.lang.String) r4
            return r4
        Ld:
            java.lang.String r5 = "g"
            java.lang.String r0 = "a"
            java.lang.String r1 = "d"
            java.lang.String r2 = "e"
            java.lang.String r3 = "f"
            java.lang.String[] r5 = new java.lang.String[]{r1, r2, r3, r5, r0}
            r0 = 0
        L1c:
            r1 = 5
            if (r0 < r1) goto L20
            goto L39
        L20:
            r1 = r5[r0]
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.readField(r4, r1)
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L36
            r2 = r1
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = og.m.t0(r2)
            if (r2 != 0) goto L36
            java.lang.String r1 = (java.lang.String) r1
            return r1
        L36:
            int r0 = r0 + 1
            goto L1c
        L39:
            java.lang.String r4 = ""
            return r4
    }

    public static java.lang.String m(long r2, java.lang.String r4) {
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L9
            java.lang.String r2 = ""
            return r2
        L9:
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L1c
            java.util.Locale r1 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L1c
            r0.<init>(r4, r1)     // Catch: java.lang.Throwable -> L1c
            java.util.Date r4 = new java.util.Date     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = r0.format(r4)     // Catch: java.lang.Throwable -> L1c
            goto L23
        L1c:
            r4 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r4)
            r4 = r0
        L23:
            java.lang.Throwable r0 = sf.g.b(r4)
            if (r0 != 0) goto L2a
            goto L3e
        L2a:
            java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat
            java.lang.String r0 = "yyyy-MM-dd HH:mm:ss"
            java.util.Locale r1 = java.util.Locale.getDefault()
            r4.<init>(r0, r1)
            java.util.Date r0 = new java.util.Date
            r0.<init>(r2)
            java.lang.String r4 = r4.format(r0)
        L3e:
            r4.getClass()
            java.lang.String r4 = (java.lang.String) r4
            return r4
    }

    public static void o(r8.g r34, java.lang.String r35, long r36, l8.f r38, long r39, boolean r41) {
            r0 = r34
            r1 = r35
            r6 = r36
            r2 = r38
            boolean r3 = og.m.t0(r1)
            java.lang.String r8 = " newmsgid="
            if (r3 != 0) goto L16
            r9 = 0
            int r3 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r3 > 0) goto L19
        L16:
            r2 = r8
            goto L38a
        L19:
            k8.e r3 = h.Hchat.hooks.api.core.WeChatApis.localMessages()
            if (r3 != 0) goto L25
            java.lang.String r0 = "[Hchat:AntiRecall] 插入提示失败: LocalMessage API为空"
            fb.v0.m(r0)
            return
        L25:
            r3.c()
            java.util.ArrayList r4 = M(r36, r38)
            java.util.Iterator r4 = r4.iterator()
        L30:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L59
            java.lang.Object r5 = r4.next()
            java.lang.Number r5 = (java.lang.Number) r5
            long r11 = r5.longValue()
            k8.s r5 = h.Hchat.hooks.api.core.WeChatApis.messageStore()
            if (r5 == 0) goto L4f
            h.Hchat.hooks.api.model.WeChatMessage r5 = r5.c(r11)
            if (r5 == 0) goto L4f
            long r11 = r5.createTime
            goto L50
        L4f:
            r11 = r9
        L50:
            long r11 = K(r11)
            int r5 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r5 <= 0) goto L30
            goto L95
        L59:
            k8.s r4 = h.Hchat.hooks.api.core.WeChatApis.messageStore()
            if (r4 == 0) goto L6a
            if (r2 == 0) goto L64
            long r11 = r2.f7917b
            goto L65
        L64:
            r11 = r9
        L65:
            long r4 = r4.a(r11)
            goto L6b
        L6a:
            r4 = r9
        L6b:
            long r11 = K(r4)
            int r4 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r4 <= 0) goto L74
            goto L95
        L74:
            if (r2 == 0) goto L7b
            long r4 = r2.a()
            goto L7c
        L7b:
            r4 = r9
        L7c:
            long r11 = K(r4)
            int r4 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r4 <= 0) goto L85
            goto L95
        L85:
            k8.s r4 = h.Hchat.hooks.api.core.WeChatApis.messageStore()
            if (r4 == 0) goto L90
            long r4 = r4.a(r6)
            goto L91
        L90:
            r4 = r9
        L91:
            long r11 = K(r4)
        L95:
            if (r41 == 0) goto La1
            java.lang.String r0 = "你撤回了上一条消息"
            r19 = r3
            r33 = r8
            r16 = r9
            goto L330
        La1:
            android.content.Context r4 = r0.f11620a
            java.lang.String r5 = "Hchat_anti_recall_config"
            android.content.SharedPreferences r4 = ub.b.c(r4, r5)
            java.lang.String r13 = "anti_recall_notice_text"
            java.lang.String r14 = "{name}撤回了上一条消息 {content}"
            java.lang.String r4 = r4.getString(r13, r14)
            if (r4 == 0) goto Lbe
            boolean r15 = og.m.t0(r4)
            if (r15 != 0) goto Lba
            goto Lbb
        Lba:
            r4 = 0
        Lbb:
            if (r4 == 0) goto Lbe
            goto Lbf
        Lbe:
            r4 = r14
        Lbf:
            java.lang.String r15 = "已阻止一条撤回消息"
            boolean r15 = r4.equals(r15)
            if (r15 == 0) goto Lc8
            goto Lc9
        Lc8:
            r14 = r4
        Lc9:
            android.content.Context r0 = r0.f11620a
            android.content.SharedPreferences r0 = ub.b.c(r0, r5)
            java.lang.String r4 = "anti_recall_notice_time_format"
            java.lang.String r5 = "yyyy-MM-dd HH:mm:ss"
            java.lang.String r0 = r0.getString(r4, r5)
            if (r0 == 0) goto Lee
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto Lee
            int r4 = r0.length()
            if (r4 <= 0) goto Lea
            goto Leb
        Lea:
            r0 = 0
        Leb:
            if (r0 == 0) goto Lee
            r5 = r0
        Lee:
            java.lang.String r0 = ""
            if (r2 == 0) goto L114
            java.lang.String r4 = r2.f7919d
            boolean r15 = r4.isEmpty()
            if (r15 != 0) goto Lfb
            goto L105
        Lfb:
            h.Hchat.hooks.api.model.WeChatMessage r4 = r2.f7925j
            if (r4 == 0) goto L104
            java.lang.String r4 = r4.sendTalker()
            goto L105
        L104:
            r4 = r0
        L105:
            if (r4 == 0) goto L114
            boolean r15 = og.m.t0(r4)
            if (r15 != 0) goto L114
            boolean r15 = z(r1, r4)
            if (r15 == 0) goto L114
            goto L115
        L114:
            r4 = 0
        L115:
            java.lang.String r15 = ":"
            r16 = r9
            java.lang.String r10 = "@im.chatroom"
            java.lang.String r13 = "@chatroom"
            if (r4 == 0) goto L128
            r18 = r0
            r19 = r3
            r33 = r8
        L125:
            r6 = 0
            goto L20e
        L128:
            if (r2 == 0) goto L12d
            h.Hchat.hooks.api.model.WeChatMessage r4 = r2.f7925j
            goto L12e
        L12d:
            r4 = 0
        L12e:
            if (r4 == 0) goto L143
            java.lang.String r9 = r4.sendTalker()
            if (r9 == 0) goto L143
            boolean r18 = og.m.t0(r9)
            if (r18 != 0) goto L143
            boolean r18 = z(r1, r9)
            if (r18 == 0) goto L143
            goto L144
        L143:
            r9 = 0
        L144:
            if (r9 == 0) goto L14e
            r18 = r0
            r19 = r3
            r33 = r8
            r4 = r9
            goto L125
        L14e:
            if (r4 == 0) goto L1cf
            java.lang.String r9 = r4.getMsgSource()
            r18 = r0
            java.lang.String r0 = r4.bodyContent()
            java.lang.String r4 = r4.reserved
            l8.d r19 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r19.getClass()
            r19 = r3
            java.lang.String r3 = "fromusername"
            java.lang.String r20 = l8.d.o(r0, r3)
            r33 = r8
            java.lang.String r8 = "fromusr"
            java.lang.String r21 = l8.d.o(r0, r8)
            java.lang.String r6 = "sender"
            java.lang.String r22 = l8.d.o(r0, r6)
            java.lang.String r23 = l8.d.o(r9, r3)
            java.lang.String r24 = l8.d.o(r9, r8)
            java.lang.String r25 = l8.d.o(r4, r3)
            java.lang.String r26 = l8.d.o(r4, r8)
            java.lang.String r0 = ".msgsource.fromusername"
            java.lang.String r27 = l8.d.i(r9, r0)
            java.lang.String r28 = l8.d.i(r9, r3)
            java.lang.String r0 = ".msgsource.fromusr"
            java.lang.String r29 = l8.d.i(r9, r0)
            java.lang.String r30 = l8.d.i(r9, r8)
            java.lang.String r0 = ".msgsource.sender"
            java.lang.String r31 = l8.d.i(r9, r0)
            java.lang.String r32 = l8.d.i(r9, r6)
            java.lang.String[] r0 = new java.lang.String[]{r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32}
            r3 = 0
        L1aa:
            r4 = 13
            if (r3 < r4) goto L1b1
            r4 = r18
            goto L1d6
        L1b1:
            r4 = r0[r3]
            java.lang.String r4 = og.m.N0(r4, r15)
            java.lang.CharSequence r4 = og.m.R0(r4)
            java.lang.String r4 = r4.toString()
            boolean r6 = og.m.t0(r4)
            if (r6 != 0) goto L1cc
            boolean r6 = z(r1, r4)
            if (r6 == 0) goto L1cc
            goto L1d6
        L1cc:
            int r3 = r3 + 1
            goto L1aa
        L1cf:
            r18 = r0
            r19 = r3
            r33 = r8
            r4 = 0
        L1d6:
            if (r4 == 0) goto L1de
            boolean r0 = og.m.t0(r4)
            if (r0 == 0) goto L125
        L1de:
            if (r2 == 0) goto L1ec
            h.Hchat.hooks.api.model.WeChatMessage r0 = r2.f7925j
            if (r0 == 0) goto L1e9
            java.lang.String r0 = r0.bodyContent()
            goto L1ed
        L1e9:
            java.lang.String r0 = r2.f7922g
            goto L1ed
        L1ec:
            r0 = 0
        L1ed:
            if (r0 != 0) goto L1f1
            r0 = r18
        L1f1:
            java.lang.String r3 = ":\n"
            r4 = 6
            r6 = 0
            int r3 = og.m.r0(r0, r3, r6, r6, r4)
            boolean r4 = og.t.W(r1, r13, r6)
            if (r4 != 0) goto L205
            boolean r4 = og.t.W(r1, r10, r6)
            if (r4 == 0) goto L20c
        L205:
            if (r3 <= 0) goto L20c
            java.lang.String r4 = r0.substring(r6, r3)
            goto L20e
        L20c:
            r4 = r18
        L20e:
            java.lang.String r0 = og.m.N0(r4, r15)
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            boolean r3 = og.m.t0(r0)
            if (r3 == 0) goto L224
            r0 = r18
            goto L2a0
        L224:
            g8.k r3 = h.Hchat.hooks.api.core.WeChatApis.users()
            boolean r4 = og.t.W(r1, r13, r6)
            if (r4 != 0) goto L274
            boolean r4 = og.t.W(r1, r10, r6)
            if (r4 == 0) goto L235
            goto L274
        L235:
            g8.i r3 = h.Hchat.hooks.api.core.WeChatApis.contacts()
            if (r3 == 0) goto L240
            h.Hchat.hooks.api.model.WeChatContact r3 = r3.n(r0)
            goto L241
        L240:
            r3 = 0
        L241:
            if (r3 == 0) goto L246
            java.lang.String r4 = r3.remarkName
            goto L247
        L246:
            r4 = 0
        L247:
            if (r3 == 0) goto L24c
            java.lang.String r3 = r3.nickname
            goto L24d
        L24c:
            r3 = 0
        L24d:
            g8.k r6 = h.Hchat.hooks.api.core.WeChatApis.users()
            if (r6 == 0) goto L258
            java.lang.String r6 = r6.a(r0)
            goto L259
        L258:
            r6 = 0
        L259:
            java.lang.String[] r3 = new java.lang.String[]{r4, r3, r6}
            r6 = 0
        L25e:
            r4 = 3
            if (r6 >= r4) goto L26e
            r4 = r3[r6]
            if (r4 == 0) goto L26b
            boolean r7 = og.m.t0(r4)
            if (r7 == 0) goto L26f
        L26b:
            int r6 = r6 + 1
            goto L25e
        L26e:
            r4 = 0
        L26f:
            if (r4 != 0) goto L293
            r4 = r18
            goto L293
        L274:
            if (r3 == 0) goto L292
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 == 0) goto L27d
            goto L28c
        L27d:
            g8.i r3 = r3.f4387b
            java.lang.String r3 = r3.t(r1, r0)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L28f
            if (r3 == 0) goto L28c
            goto L290
        L28c:
            r3 = r18
            goto L290
        L28f:
            r3 = r0
        L290:
            r4 = r3
            goto L293
        L292:
            r4 = 0
        L293:
            if (r4 == 0) goto L2a0
            boolean r3 = og.m.t0(r4)
            if (r3 != 0) goto L29c
            goto L29d
        L29c:
            r4 = 0
        L29d:
            if (r4 == 0) goto L2a0
            r0 = r4
        L2a0:
            if (r2 == 0) goto L30b
            h.Hchat.hooks.api.model.WeChatMessage r3 = r2.f7925j
            if (r3 == 0) goto L30b
            boolean r4 = r3.isText()
            if (r4 == 0) goto L2b1
            java.lang.String r3 = r3.bodyContent()
            goto L2ea
        L2b1:
            java.lang.String r4 = r3.bodyContent()
            boolean r6 = r3.isQuote()
            if (r6 != 0) goto L2db
            l8.d r6 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r6.getClass()
            java.lang.String r6 = "type"
            java.lang.String r6 = l8.d.o(r4, r6)
            java.lang.String r7 = "57"
            boolean r6 = gg.l.a(r6, r7)
            if (r6 != 0) goto L2db
            java.lang.String r6 = "<refermsg>"
            r7 = 1
            boolean r4 = og.m.h0(r4, r6, r7)
            if (r4 == 0) goto L2d8
            goto L2db
        L2d8:
            r3 = r18
            goto L2ea
        L2db:
            l8.d r4 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            java.lang.String r3 = r3.bodyContent()
            r4.getClass()
            java.lang.String r4 = "title"
            java.lang.String r3 = l8.d.o(r3, r4)
        L2ea:
            boolean r4 = og.m.t0(r3)
            if (r4 != 0) goto L2f1
            goto L2f2
        L2f1:
            r3 = 0
        L2f2:
            if (r3 == 0) goto L308
            r4 = 10
            r6 = 32
            java.lang.String r3 = r3.replace(r4, r6)
            r3.getClass()
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r13 = r3.toString()
            goto L309
        L308:
            r13 = 0
        L309:
            if (r13 != 0) goto L30d
        L30b:
            r13 = r18
        L30d:
            java.lang.String r3 = "{name}"
            r6 = 0
            java.lang.String r0 = og.t.a0(r14, r3, r0, r6)
            java.lang.String r3 = "{content}"
            java.lang.String r0 = og.t.a0(r0, r3, r13, r6)
            java.lang.String r3 = "{sendTime}"
            java.lang.String r4 = m(r11, r5)
            java.lang.String r0 = og.t.a0(r0, r3, r4, r6)
            java.lang.String r3 = "{recallTime}"
            r7 = r39
            java.lang.String r4 = m(r7, r5)
            java.lang.String r0 = og.t.a0(r0, r3, r4, r6)
        L330:
            int r3 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r3 > 0) goto L35e
            if (r2 == 0) goto L339
            long r3 = r2.f7916a
            goto L33b
        L339:
            r3 = r16
        L33b:
            if (r2 == 0) goto L340
            long r9 = r2.f7917b
            goto L342
        L340:
            r9 = r16
        L342:
            java.lang.String r0 = "[Hchat:AntiRecall] 插入提示失败: 未定位原消息时间 talker="
            java.lang.String r2 = " id="
            r6 = r36
            java.lang.StringBuilder r0 = eh.a.v(r0, r1, r2, r6)
            java.lang.String r1 = " origin="
            java.lang.String r2 = " new="
            j8.b.s(r0, r1, r3, r2)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            fb.v0.m(r0)
            return
        L35e:
            r6 = r36
            r2 = 1
            long r3 = r11 + r2
            r5 = 0
            r2 = r0
            r0 = r19
            long r2 = r0.e(r1, r2, r3, r5)
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 > 0) goto L389
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "[Hchat:AntiRecall] 插入提示失败: talker="
            r0.<init>(r2)
            r0.append(r1)
            r2 = r33
            r0.append(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            fb.v0.m(r0)
        L389:
            return
        L38a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "[Hchat:AntiRecall] 插入提示失败: talker/newmsgid为空 talker="
            r0.<init>(r3)
            r0.append(r1)
            r0.append(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            fb.v0.m(r0)
            return
    }

    public static boolean s(java.lang.reflect.Method r3) {
            java.lang.Class[] r0 = r3.getParameterTypes()
            java.lang.Class r3 = r3.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            boolean r3 = gg.l.a(r3, r1)
            r1 = 0
            if (r3 == 0) goto L2c
            int r3 = r0.length
            r2 = 2
            if (r3 != r2) goto L2c
            r3 = r0[r1]
            r3.getClass()
            boolean r3 = A(r3)
            if (r3 == 0) goto L2c
            r3 = 1
            r0 = r0[r3]
            java.lang.Class r2 = java.lang.Boolean.TYPE
            boolean r0 = gg.l.a(r0, r2)
            if (r0 == 0) goto L2c
            return r3
        L2c:
            return r1
    }

    public static boolean t(java.lang.reflect.Method r7) {
            java.lang.Class[] r0 = r7.getParameterTypes()
            int r1 = r0.length
            r2 = 3
            r3 = 0
            r4 = 2
            if (r1 == r4) goto Le
            int r1 = r0.length
            if (r1 == r2) goto Le
            goto L61
        Le:
            r1 = r0[r3]
            java.lang.Class r5 = java.lang.Long.TYPE
            boolean r1 = gg.l.a(r1, r5)
            if (r1 != 0) goto L19
            goto L61
        L19:
            r1 = 1
            r5 = r0[r1]
            r5.getClass()
            boolean r5 = A(r5)
            if (r5 != 0) goto L26
            goto L61
        L26:
            int r5 = r0.length
            java.lang.Class r6 = java.lang.Boolean.TYPE
            if (r5 != r2) goto L3e
            r2 = r0[r4]
            boolean r2 = gg.l.a(r2, r6)
            if (r2 != 0) goto L3e
            r0 = r0[r4]
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            boolean r0 = gg.l.a(r0, r2)
            if (r0 != 0) goto L3e
            goto L61
        L3e:
            java.lang.Class r0 = r7.getReturnType()
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r0 = gg.l.a(r0, r2)
            if (r0 != 0) goto L62
            java.lang.Class r0 = r7.getReturnType()
            boolean r0 = gg.l.a(r0, r6)
            if (r0 != 0) goto L62
            java.lang.Class r7 = r7.getReturnType()
            java.lang.Class r0 = java.lang.Void.TYPE
            boolean r7 = gg.l.a(r7, r0)
            if (r7 == 0) goto L61
            goto L62
        L61:
            return r3
        L62:
            return r1
    }

    public static boolean u(java.lang.String r3) {
            r0 = 4
            char[] r0 = new char[r0]
            r0 = {x0024: FILL_ARRAY_DATA , data: [96, 34, 91, 93} // fill-array
            java.lang.String r3 = og.m.S0(r3, r0)
            java.lang.String r0 = "message"
            boolean r1 = og.t.X(r3, r0)
            r2 = 1
            if (r1 != 0) goto L22
            boolean r1 = og.t.d0(r3, r0, r2)
            if (r1 != 0) goto L22
            boolean r3 = og.m.h0(r3, r0, r2)
            if (r3 == 0) goto L20
            goto L22
        L20:
            r3 = 0
            return r3
        L22:
            return r2
    }

    public static boolean v(java.lang.reflect.Method r3) {
            java.lang.Class[] r0 = r3.getParameterTypes()
            java.lang.Class r3 = r3.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            boolean r3 = gg.l.a(r3, r1)
            r1 = 0
            if (r3 == 0) goto L2b
            int r3 = r0.length
            r2 = 2
            if (r3 != r2) goto L2b
            r3 = r0[r1]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            boolean r3 = gg.l.a(r3, r2)
            if (r3 == 0) goto L2b
            r3 = 1
            r0 = r0[r3]
            java.lang.Class r2 = java.lang.Long.TYPE
            boolean r0 = gg.l.a(r0, r2)
            if (r0 == 0) goto L2b
            return r3
        L2b:
            return r1
    }

    public static boolean w(java.lang.reflect.Method r3) {
            java.lang.Class[] r0 = r3.getParameterTypes()
            java.lang.Class r3 = r3.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            boolean r3 = gg.l.a(r3, r1)
            r1 = 0
            if (r3 == 0) goto L21
            int r3 = r0.length
            r2 = 1
            if (r3 != r2) goto L21
            r3 = r0[r1]
            r3.getClass()
            boolean r3 = A(r3)
            if (r3 == 0) goto L21
            return r2
        L21:
            return r1
    }

    public static boolean x(java.lang.reflect.Method r5) {
            java.lang.Class[] r0 = r5.getParameterTypes()
            java.lang.Class r5 = r5.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            boolean r5 = gg.l.a(r5, r1)
            r1 = 0
            if (r5 == 0) goto L46
            int r5 = r0.length
            r2 = 6
            if (r5 != r2) goto L46
            r5 = r0[r1]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            boolean r5 = gg.l.a(r5, r2)
            if (r5 == 0) goto L46
            r5 = 1
            r3 = r0[r5]
            java.lang.Class r4 = java.lang.Long.TYPE
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto L46
            r3 = 3
            r3 = r0[r3]
            boolean r3 = gg.l.a(r3, r2)
            if (r3 == 0) goto L46
            r3 = 4
            r3 = r0[r3]
            boolean r3 = gg.l.a(r3, r2)
            if (r3 == 0) goto L46
            r3 = 5
            r0 = r0[r3]
            boolean r0 = gg.l.a(r0, r2)
            if (r0 == 0) goto L46
            return r5
        L46:
            return r1
    }

    public static boolean y(l8.f r5) {
            r0 = 0
            if (r5 == 0) goto L6
            h.Hchat.hooks.api.model.WeChatMessage r1 = r5.f7925j
            goto L7
        L6:
            r1 = r0
        L7:
            r2 = 1
            if (r1 == 0) goto L11
            boolean r1 = r1.isSend()
            if (r1 != r2) goto L11
            goto L6a
        L11:
            g8.a r1 = h.Hchat.hooks.api.core.WeChatApis.account()
            if (r1 == 0) goto L1c
            java.lang.String r1 = r1.c()
            goto L1d
        L1c:
            r1 = r0
        L1d:
            java.lang.String r3 = ""
            if (r1 != 0) goto L22
            r1 = r3
        L22:
            if (r5 == 0) goto L38
            java.lang.String r0 = r5.f7919d
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L2d
            goto L38
        L2d:
            h.Hchat.hooks.api.model.WeChatMessage r5 = r5.f7925j
            if (r5 == 0) goto L37
            java.lang.String r5 = r5.sendTalker()
            r0 = r5
            goto L38
        L37:
            r0 = r3
        L38:
            if (r0 != 0) goto L3b
            goto L3c
        L3b:
            r3 = r0
        L3c:
            java.lang.String r5 = ":"
            java.lang.String r5 = og.m.N0(r3, r5)
            java.lang.CharSequence r5 = og.m.R0(r5)
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "你"
            boolean r0 = gg.l.a(r5, r0)
            if (r0 != 0) goto L6a
            java.lang.String r0 = "你撤回"
            r3 = 0
            boolean r0 = og.t.d0(r5, r0, r3)
            if (r0 == 0) goto L5c
            goto L6a
        L5c:
            boolean r0 = og.m.t0(r1)
            if (r0 != 0) goto L69
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L69
            goto L6a
        L69:
            return r3
        L6a:
            return r2
    }

    public static boolean z(java.lang.String r4, java.lang.String r5) {
            boolean r0 = og.m.t0(r5)
            r1 = 0
            if (r0 == 0) goto L8
            goto L2d
        L8:
            java.lang.String r0 = "@chatroom"
            boolean r2 = og.t.W(r4, r0, r1)
            java.lang.String r3 = "@im.chatroom"
            if (r2 != 0) goto L18
            boolean r2 = og.t.W(r4, r3, r1)
            if (r2 == 0) goto L1f
        L18:
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L1f
            goto L2d
        L1f:
            boolean r4 = og.t.W(r5, r0, r1)
            if (r4 != 0) goto L2d
            boolean r4 = og.t.W(r5, r3, r1)
            if (r4 != 0) goto L2d
            r4 = 1
            return r4
        L2d:
            return r1
    }

    public final java.util.List D(java.lang.String r3, r8.g r4) {
            r2 = this;
            android.content.SharedPreferences r0 = r2.f12388i
            if (r0 == 0) goto Lf
            java.lang.String r1 = J(r4)
            java.lang.ClassLoader r4 = r4.f11622c
            java.util.List r3 = e8.b.f(r0, r1, r4, r3)
            return r3
        Lf:
            tf.t r3 = tf.t.f13167g
            return r3
    }

    public final java.util.List E(r8.g r11) {
            r10 = this;
            java.lang.String r0 = "revoke_entries"
            java.util.List r1 = r10.D(r0, r11)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L26
            java.lang.Object r3 = r1.next()
            r4 = r3
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            boolean r4 = x(r4)
            if (r4 == 0) goto Lf
            r2.add(r3)
            goto Lf
        L26:
            boolean r1 = r2.isEmpty()
            r3 = 0
            if (r1 != 0) goto L2e
            goto L2f
        L2e:
            r2 = r3
        L2f:
            if (r2 == 0) goto L54
            java.util.ArrayList r11 = new java.util.ArrayList
            int r0 = tf.n.e1(r2)
            r11.<init>(r0)
            java.util.Iterator r0 = r2.iterator()
        L3e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L53
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            s8.a r2 = new s8.a
            r2.<init>(r1, r3)
            r11.add(r2)
            goto L3e
        L53:
            return r11
        L54:
            java.lang.String r1 = "doRevokeMsg xmlSrvMsgId"
            java.lang.String r2 = "summerbadcr get a revoke"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            java.lang.String r2 = "MM_DATA_SYSCMD_NEWXML_SUBTYPE_REVOKE"
            java.lang.String r4 = ".sysmsg.revokemsg.newmsgid"
            java.lang.String[] r2 = new java.lang.String[]{r2, r4}
            java.lang.String r4 = "ashutest::[oneliang][xml parse]"
            java.lang.String r5 = ".sysmsg.revokemsg.replacemsg"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}
            java.lang.String[][] r1 = new java.lang.String[][]{r1, r2, r4}
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r4 = 0
        L76:
            r5 = 3
            if (r4 < r5) goto L7b
            goto L114
        L7b:
            r5 = r1[r4]
            int r6 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r6)
            java.lang.String[] r5 = (java.lang.String[]) r5
            org.luckypray.dexkit.DexKitBridge r6 = r11.f11623d     // Catch: java.lang.Throwable -> Ld6
            ch.e r7 = new ch.e     // Catch: java.lang.Throwable -> Ld6
            r7.<init>()     // Catch: java.lang.Throwable -> Ld6
            fh.k r8 = new fh.k     // Catch: java.lang.Throwable -> Ld6
            r8.<init>()     // Catch: java.lang.Throwable -> Ld6
            java.util.List r5 = tf.l.L0(r5)     // Catch: java.lang.Throwable -> Ld6
            fh.k.u0(r8, r5)     // Catch: java.lang.Throwable -> Ld6
            r7.f1666h = r8     // Catch: java.lang.Throwable -> Ld6
            hh.p r5 = r6.findMethod(r7)     // Catch: java.lang.Throwable -> Ld6
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld6
            r6.<init>()     // Catch: java.lang.Throwable -> Ld6
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> Ld6
        La6:
            boolean r7 = r5.hasNext()     // Catch: java.lang.Throwable -> Ld6
            if (r7 == 0) goto Le4
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> Ld6
            hh.o r7 = (hh.o) r7     // Catch: java.lang.Throwable -> Ld6
            java.lang.ClassLoader r8 = r11.f11622c     // Catch: java.lang.Throwable -> Lb9
            java.lang.reflect.Method r8 = r7.r(r8)     // Catch: java.lang.Throwable -> Lb9
            goto Lc0
        Lb9:
            r8 = move-exception
            sf.f r9 = new sf.f     // Catch: java.lang.Throwable -> Ld6
            r9.<init>(r8)     // Catch: java.lang.Throwable -> Ld6
            r8 = r9
        Lc0:
            boolean r9 = r8 instanceof sf.f     // Catch: java.lang.Throwable -> Ld6
            if (r9 == 0) goto Lc6
            r8 = r3
        Lc6:
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8     // Catch: java.lang.Throwable -> Ld6
            if (r8 == 0) goto Ld8
            boolean r9 = x(r8)     // Catch: java.lang.Throwable -> Ld6
            if (r9 == 0) goto Ld8
            s8.a r9 = new s8.a     // Catch: java.lang.Throwable -> Ld6
            r9.<init>(r8, r7)     // Catch: java.lang.Throwable -> Ld6
            goto Ld9
        Ld6:
            r5 = move-exception
            goto Ldf
        Ld8:
            r9 = r3
        Ld9:
            if (r9 == 0) goto La6
            r6.add(r9)     // Catch: java.lang.Throwable -> Ld6
            goto La6
        Ldf:
            sf.f r6 = new sf.f
            r6.<init>(r5)
        Le4:
            java.lang.Throwable r5 = sf.g.b(r6)
            if (r5 != 0) goto Leb
            goto Lf2
        Leb:
            java.lang.String r6 = "防撤回入口定位失败"
            r10.e(r6, r5)
            tf.t r6 = tf.t.f13167g
        Lf2:
            java.util.List r6 = (java.util.List) r6
            java.util.Iterator r5 = r6.iterator()
        Lf8:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L10e
            java.lang.Object r6 = r5.next()
            s8.a r6 = (s8.a) r6
            java.lang.reflect.Method r7 = r6.f12378a
            java.lang.String r7 = r7.toGenericString()
            r2.put(r7, r6)
            goto Lf8
        L10e:
            boolean r5 = r2.isEmpty()
            if (r5 != 0) goto L14d
        L114:
            java.util.Collection r1 = r2.values()
            r1.getClass()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = tf.n.e1(r1)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L12a:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L13c
            java.lang.Object r4 = r1.next()
            s8.a r4 = (s8.a) r4
            java.lang.reflect.Method r4 = r4.f12378a
            r3.add(r4)
            goto L12a
        L13c:
            r10.O(r11, r0, r3)
            java.util.Collection r11 = r2.values()
            r11.getClass()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.List r11 = tf.m.P1(r11)
            return r11
        L14d:
            int r4 = r4 + 1
            goto L76
    }

    public final void F(long r3) {
            r2 = this;
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L7
            goto L3b
        L7:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.util.Set r4 = r2.f12386g
            r4.add(r3)
            int r3 = r4.size()
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r3 <= r0) goto L3b
            r4.getClass()
            r3 = r4
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            int r1 = r4.size()
            int r1 = r1 - r0
            java.util.List r3 = tf.m.L1(r1, r3)
            java.util.Iterator r3 = r3.iterator()
        L2b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r3.next()
            java.lang.Long r0 = (java.lang.Long) r0
            r4.remove(r0)
            goto L2b
        L3b:
            return
    }

    public final void N(h.Hchat.hooks.api.model.WeChatMessage r5) {
            r4 = this;
            if (r5 == 0) goto L64
            java.lang.String r0 = r5.talker
            boolean r0 = og.m.t0(r0)
            if (r0 != 0) goto L64
            long r0 = r5.msgSvrId
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L64
            boolean r0 = r5.isRecalled()
            if (r0 == 0) goto L19
            goto L64
        L19:
            java.lang.String r0 = r5.talker
            long r1 = r5.msgSvrId
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = ":"
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            java.util.concurrent.ConcurrentHashMap r1 = r4.f12385f
            r1.put(r0, r5)
            int r5 = r1.size()
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r5 <= r0) goto L64
            java.util.Set r5 = r1.keySet()
            r5.getClass()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            int r2 = r1.size()
            int r2 = r2 - r0
            java.util.List r5 = tf.m.L1(r2, r5)
            java.util.Iterator r5 = r5.iterator()
        L54:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L64
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            r1.remove(r0)
            goto L54
        L64:
            return
    }

    public final void O(r8.g r4, java.lang.String r5, java.util.List r6) {
            r3 = this;
            android.content.SharedPreferences r0 = r3.f12388i
            if (r0 == 0) goto L38
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L2f
            java.lang.String r4 = J(r4)
            java.lang.String r6 = "cache.key"
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch: java.lang.Throwable -> L38
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r6, r2)     // Catch: java.lang.Throwable -> L38
            boolean r0 = gg.l.a(r0, r4)     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L27
            android.content.SharedPreferences$Editor r0 = r1.clear()     // Catch: java.lang.Throwable -> L38
            r0.putString(r6, r4)     // Catch: java.lang.Throwable -> L38
        L27:
            android.content.SharedPreferences$Editor r4 = r1.remove(r5)     // Catch: java.lang.Throwable -> L38
            r4.apply()     // Catch: java.lang.Throwable -> L38
            return
        L2f:
            e8.b r1 = e8.b.f2358a
            java.lang.String r4 = J(r4)
            r1.j(r0, r4, r5, r6)
        L38:
            return
    }

    @Override // r8.f
    public final java.lang.String a() {
            r1 = this;
            java.lang.String r0 = "anti_recall"
            return r0
    }

    @Override // r8.a
    public final void f(r8.g r5) {
            r4 = this;
            r5.getClass()
            s8.d r5 = new s8.d
            java.lang.String r0 = "保留被撤回的消息"
            java.lang.String r1 = "practical"
            java.lang.String r2 = "anti_recall"
            java.lang.String r3 = "防撤回"
            r5.<init>(r2, r3, r0, r1)
            r4.h(r5)
            return
    }

    @Override // r8.a
    public final void g(r8.g r6) {
            r5 = this;
            r6.getClass()
            android.content.Context r0 = r6.f11620a
            java.lang.String r1 = "Hchat_anti_recall_method_cache"
            android.content.SharedPreferences r0 = ub.b.c(r0, r1)
            r5.f12388i = r0
            k8.k r0 = h.Hchat.hooks.api.core.WeChatApis.messageEvents()
            r1 = 0
            if (r0 == 0) goto L25
            q9.a r2 = new q9.a
            r3 = 5
            r2.<init>(r5, r3)
            f8.c r0 = r0.f7435d
            if (r0 == 0) goto L25
            java.lang.Class<f8.g> r3 = f8.g.class
            f8.b r0 = r0.c(r3, r2)
            goto L26
        L25:
            r0 = r1
        L26:
            r5.j(r0)
            k8.i r0 = h.Hchat.hooks.api.core.WeChatApis.messageChanges()
            if (r0 == 0) goto L3a
            k8.m r2 = new k8.m
            r3 = 2
            r2.<init>(r5, r3)
            a2.a r0 = r0.e(r2)
            goto L3b
        L3a:
            r0 = r1
        L3b:
            r5.j(r0)
            java.lang.String r0 = "com.tencent.wcdb.database.SQLiteDatabase"
            r5.n(r0, r6)
            java.lang.String r0 = "android.database.sqlite.SQLiteDatabase"
            r5.n(r0, r6)
            aa.c r0 = new aa.c
            r2 = 29
            r0.<init>(r5, r2, r6)
            r2 = 12
            java.lang.String r3 = "anti_recall"
            java.lang.String r4 = "防撤回"
            r8.e.f(r2, r0, r3, r4, r1)
            e9.a r0 = new e9.a
            r1 = 7
            r0.<init>(r5, r1, r6)
            java.lang.Class<f8.e> r6 = f8.e.class
            r5.i(r6, r0)
            return
    }

    public final void n(java.lang.String r7, r8.g r8) {
            r6 = this;
            java.lang.ClassLoader r0 = r8.f11622c
            java.lang.Class r7 = h.Hchat.utils.KavaReflector.loadClass(r7, r0)
            if (r7 == 0) goto L66
            java.util.List r7 = h.Hchat.utils.KavaReflector.declaredMethods(r7)
            java.util.Iterator r7 = r7.iterator()
        L10:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L66
            java.lang.Object r0 = r7.next()
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            java.lang.Class r1 = r0.getReturnType()
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r1 = gg.l.a(r1, r2)
            if (r1 != 0) goto L29
            goto L10
        L29:
            java.lang.String r1 = r0.getName()
            java.lang.String r2 = "update"
            boolean r1 = gg.l.a(r1, r2)
            if (r1 != 0) goto L42
            java.lang.String r1 = r0.getName()
            java.lang.String r2 = "updateWithOnConflict"
            boolean r1 = gg.l.a(r1, r2)
            if (r1 != 0) goto L42
            goto L10
        L42:
            java.lang.Class[] r1 = r0.getParameterTypes()
            r1.getClass()
            int r2 = r1.length
            r3 = 0
        L4b:
            if (r3 >= r2) goto L10
            r4 = r1[r3]
            java.lang.Class<android.content.ContentValues> r5 = android.content.ContentValues.class
            boolean r4 = r5.isAssignableFrom(r4)
            if (r4 == 0) goto L63
            r8.i r1 = r8.i.f11631b
            s8.b r2 = new s8.b
            r3 = 0
            r2.<init>(r6, r8, r3)
            r1.b(r0, r2)
            goto L10
        L63:
            int r3 = r3 + 1
            goto L4b
        L66:
            return
    }

    @Override // r8.f
    public final java.lang.String name() {
            r1 = this;
            java.lang.String r0 = "防撤回"
            return r0
    }

    public final void p(r8.g r9) {
            r8 = this;
            boolean r0 = r8.f12392m
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.String r0 = "legacy_self_recall_media_cleanup"
            java.util.List r1 = r8.D(r0, r9)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L14:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L2b
            java.lang.Object r3 = r1.next()
            r4 = r3
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            boolean r4 = s(r4)
            if (r4 == 0) goto L14
            r2.add(r3)
            goto L14
        L2b:
            boolean r1 = r2.isEmpty()
            r3 = 0
            if (r1 != 0) goto L33
            goto L34
        L33:
            r2 = r3
        L34:
            if (r2 == 0) goto L38
            goto L10e
        L38:
            org.luckypray.dexkit.DexKitBridge r1 = r9.f11623d     // Catch: java.lang.Throwable -> La5
            ch.e r2 = new ch.e     // Catch: java.lang.Throwable -> La5
            r2.<init>()     // Catch: java.lang.Throwable -> La5
            fh.k r4 = new fh.k     // Catch: java.lang.Throwable -> La5
            r4.<init>()     // Catch: java.lang.Throwable -> La5
            java.lang.String r5 = "MicroMsg.NetSceneRevokeMsg"
            java.lang.String r6 = "[oneliang][doSceneEnd.revokeMsg]"
            java.lang.String r7 = "cannot find the msg:%d after revoke."
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7}     // Catch: java.lang.Throwable -> La5
            java.util.List r5 = a.a.y0(r5)     // Catch: java.lang.Throwable -> La5
            fh.k.u0(r4, r5)     // Catch: java.lang.Throwable -> La5
            r2.f1666h = r4     // Catch: java.lang.Throwable -> La5
            hh.p r1 = r1.findMethod(r2)     // Catch: java.lang.Throwable -> La5
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La5
            r2.<init>()     // Catch: java.lang.Throwable -> La5
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> La5
        L64:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> La5
            if (r4 == 0) goto Lab
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> La5
            hh.o r4 = (hh.o) r4     // Catch: java.lang.Throwable -> La5
            hh.p r4 = r4.q()     // Catch: java.lang.Throwable -> La5
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La5
            r5.<init>()     // Catch: java.lang.Throwable -> La5
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> La5
        L7d:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Throwable -> La5
            if (r6 == 0) goto La7
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Throwable -> La5
            hh.o r6 = (hh.o) r6     // Catch: java.lang.Throwable -> La5
            java.lang.ClassLoader r7 = r9.f11622c     // Catch: java.lang.Throwable -> L90
            java.lang.reflect.Method r6 = r6.r(r7)     // Catch: java.lang.Throwable -> L90
            goto L97
        L90:
            r6 = move-exception
            sf.f r7 = new sf.f     // Catch: java.lang.Throwable -> La5
            r7.<init>(r6)     // Catch: java.lang.Throwable -> La5
            r6 = r7
        L97:
            boolean r7 = r6 instanceof sf.f     // Catch: java.lang.Throwable -> La5
            if (r7 == 0) goto L9d
            r6 = r3
        L9d:
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6     // Catch: java.lang.Throwable -> La5
            if (r6 == 0) goto L7d
            r5.add(r6)     // Catch: java.lang.Throwable -> La5
            goto L7d
        La5:
            r0 = move-exception
            goto Lf8
        La7:
            tf.r.h1(r2, r5)     // Catch: java.lang.Throwable -> La5
            goto L64
        Lab:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La5
            r1.<init>()     // Catch: java.lang.Throwable -> La5
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> La5
        Lb4:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> La5
            if (r3 == 0) goto Lcb
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> La5
            r4 = r3
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch: java.lang.Throwable -> La5
            boolean r4 = s(r4)     // Catch: java.lang.Throwable -> La5
            if (r4 == 0) goto Lb4
            r1.add(r3)     // Catch: java.lang.Throwable -> La5
            goto Lb4
        Lcb:
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> La5
            r2.<init>()     // Catch: java.lang.Throwable -> La5
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La5
            r3.<init>()     // Catch: java.lang.Throwable -> La5
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> La5
        Ld9:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Throwable -> La5
            if (r4 == 0) goto Lf4
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Throwable -> La5
            r5 = r4
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch: java.lang.Throwable -> La5
            java.lang.String r5 = r5.toGenericString()     // Catch: java.lang.Throwable -> La5
            boolean r5 = r2.add(r5)     // Catch: java.lang.Throwable -> La5
            if (r5 == 0) goto Ld9
            r3.add(r4)     // Catch: java.lang.Throwable -> La5
            goto Ld9
        Lf4:
            r8.O(r9, r0, r3)     // Catch: java.lang.Throwable -> La5
            goto Lfd
        Lf8:
            sf.f r3 = new sf.f
            r3.<init>(r0)
        Lfd:
            java.lang.Throwable r0 = sf.g.b(r3)
            if (r0 != 0) goto L104
            goto L10b
        L104:
            java.lang.String r1 = "定位旧版自己撤回媒体清理方法失败"
            r8.e(r1, r0)
            tf.t r3 = tf.t.f13167g
        L10b:
            r2 = r3
            java.util.List r2 = (java.util.List) r2
        L10e:
            java.util.Iterator r0 = r2.iterator()
            r1 = 0
        L113:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L133
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            r8.i r3 = r8.i.f11631b     // Catch: java.lang.Throwable -> L12c
            s8.b r4 = new s8.b     // Catch: java.lang.Throwable -> L12c
            r5 = 2
            r4.<init>(r8, r9, r5)     // Catch: java.lang.Throwable -> L12c
            r3.b(r2, r4)     // Catch: java.lang.Throwable -> L12c
            r1 = 1
            goto L113
        L12c:
            r2 = move-exception
            java.lang.String r3 = "旧版自己撤回媒体清理Hook安装失败"
            r8.e(r3, r2)
            goto L113
        L133:
            r8.f12392m = r1
            return
    }

    public final void q(r8.g r11, java.util.List r12) {
            r10 = this;
            boolean r0 = r10.f12390k
            if (r0 == 0) goto L6
            goto L184
        L6:
            tf.t r0 = tf.t.f13167g
            java.lang.String r1 = "message_storage_update"
            java.util.List r2 = r10.D(r1, r11)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L17:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L2e
            java.lang.Object r4 = r2.next()
            r5 = r4
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            boolean r5 = t(r5)
            if (r5 == 0) goto L17
            r3.add(r4)
            goto L17
        L2e:
            boolean r2 = r3.isEmpty()
            r4 = 0
            if (r2 != 0) goto L36
            goto L37
        L36:
            r3 = r4
        L37:
            r2 = 0
            r5 = 1
            if (r3 == 0) goto L3d
            goto L154
        L3d:
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            java.util.Iterator r6 = r12.iterator()
        L46:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L9c
            java.lang.Object r7 = r6.next()
            s8.a r7 = (s8.a) r7
            hh.o r7 = r7.f12379b
            if (r7 == 0) goto L46
            hh.p r7 = r7.q()     // Catch: java.lang.Throwable -> L5b
            goto L62
        L5b:
            r7 = move-exception
            sf.f r8 = new sf.f
            r8.<init>(r7)
            r7 = r8
        L62:
            boolean r8 = r7 instanceof sf.f
            if (r8 == 0) goto L68
            r7 = r0
        L68:
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r7 = r7.iterator()
        L6e:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L46
            java.lang.Object r8 = r7.next()
            hh.o r8 = (hh.o) r8
            java.lang.ClassLoader r9 = r11.f11622c     // Catch: java.lang.Throwable -> L81
            java.lang.reflect.Method r8 = r8.r(r9)     // Catch: java.lang.Throwable -> L81
            goto L88
        L81:
            r8 = move-exception
            sf.f r9 = new sf.f
            r9.<init>(r8)
            r8 = r9
        L88:
            boolean r9 = r8 instanceof sf.f
            if (r9 == 0) goto L8e
            r8 = r4
        L8e:
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            if (r8 == 0) goto L6e
            boolean r9 = t(r8)
            if (r9 == 0) goto L6e
            r3.add(r8)
            goto L6e
        L9c:
            boolean r6 = r3.isEmpty()
            if (r6 != 0) goto La9
            java.util.List r12 = tf.m.P1(r3)
            r3 = r12
            goto L151
        La9:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r6 = tf.n.e1(r12)
            r3.<init>(r6)
            java.util.Iterator r12 = r12.iterator()
        Lb6:
            boolean r6 = r12.hasNext()
            if (r6 == 0) goto Lc8
            java.lang.Object r6 = r12.next()
            s8.a r6 = (s8.a) r6
            java.lang.reflect.Method r6 = r6.f12378a
            r3.add(r6)
            goto Lb6
        Lc8:
            java.lang.Object r12 = tf.m.v1(r3)
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            if (r12 == 0) goto Ldd
            java.lang.Class r12 = r12.getDeclaringClass()
            if (r12 == 0) goto Ldd
            java.lang.ClassLoader r12 = r12.getClassLoader()
            if (r12 == 0) goto Ldd
            goto Ldf
        Ldd:
            java.lang.ClassLoader r12 = r11.f11622c
        Ldf:
            java.lang.String r3 = "com.tencent.mm.storage.m9"
            java.lang.Class r3 = r12.loadClass(r3)     // Catch: java.lang.Throwable -> Le6
            goto Led
        Le6:
            r3 = move-exception
            sf.f r6 = new sf.f
            r6.<init>(r3)
            r3 = r6
        Led:
            boolean r6 = r3 instanceof sf.f
            if (r6 == 0) goto Lf3
            r3 = r4
        Lf3:
            java.lang.Class r3 = (java.lang.Class) r3
            if (r3 == 0) goto L150
            java.lang.String r6 = "com.tencent.mm.storage.k9"
            java.lang.Class r12 = r12.loadClass(r6)     // Catch: java.lang.Throwable -> Lfe
            goto L105
        Lfe:
            r12 = move-exception
            sf.f r6 = new sf.f
            r6.<init>(r12)
            r12 = r6
        L105:
            boolean r6 = r12 instanceof sf.f
            if (r6 == 0) goto L10b
            r12 = r4
        L10b:
            java.lang.Class r12 = (java.lang.Class) r12
            if (r12 == 0) goto L150
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredMethods(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L11c:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L14f
            java.lang.Object r6 = r0.next()
            r7 = r6
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.Class[] r8 = r7.getParameterTypes()
            int r8 = r8.length
            r9 = 2
            if (r8 != r9) goto L11c
            java.lang.Class[] r8 = r7.getParameterTypes()
            r8 = r8[r2]
            java.lang.Class r9 = java.lang.Long.TYPE
            boolean r8 = gg.l.a(r8, r9)
            if (r8 == 0) goto L11c
            java.lang.Class[] r7 = r7.getParameterTypes()
            r7 = r7[r5]
            boolean r7 = gg.l.a(r7, r12)
            if (r7 == 0) goto L11c
            r3.add(r6)
            goto L11c
        L14f:
            r0 = r3
        L150:
            r3 = r0
        L151:
            r10.O(r11, r1, r3)
        L154:
            java.util.Iterator r12 = r3.iterator()
        L158:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L177
            java.lang.Object r0 = r12.next()
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            r8.i r1 = r8.i.f11631b     // Catch: java.lang.Throwable -> L170
            aa.d r6 = new aa.d     // Catch: java.lang.Throwable -> L170
            r6.<init>(r10, r11, r0)     // Catch: java.lang.Throwable -> L170
            r1.b(r0, r6)     // Catch: java.lang.Throwable -> L170
            r2 = r5
            goto L158
        L170:
            r0 = move-exception
            java.lang.String r1 = "自己撤回消息存储Hook安装失败"
            r10.e(r1, r0)
            goto L158
        L177:
            r10.f12390k = r2
            boolean r11 = r3.isEmpty()
            if (r11 == 0) goto L184
            java.lang.String r11 = "自己撤回消息存储Hook未找到"
            r10.e(r11, r4)
        L184:
            return
    }

    public final void r(r8.g r9) {
            r8 = this;
            boolean r0 = r8.f12391l
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.String r0 = "msg_processing_clear"
            java.util.List r1 = r8.D(r0, r9)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L14:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L31
            java.lang.Object r3 = r1.next()
            r4 = r3
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            boolean r5 = w(r4)
            if (r5 != 0) goto L2d
            boolean r4 = v(r4)
            if (r4 == 0) goto L14
        L2d:
            r2.add(r3)
            goto L14
        L31:
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L38
            goto L39
        L38:
            r2 = 0
        L39:
            if (r2 == 0) goto L3d
            goto Lf1
        L3d:
            org.luckypray.dexkit.DexKitBridge r1 = r9.f11623d     // Catch: java.lang.Throwable -> La4
            ch.e r2 = new ch.e     // Catch: java.lang.Throwable -> La4
            r2.<init>()     // Catch: java.lang.Throwable -> La4
            fh.k r3 = new fh.k     // Catch: java.lang.Throwable -> La4
            r3.<init>()     // Catch: java.lang.Throwable -> La4
            java.lang.String r4 = "MicroMsg.MsgProcessingManager"
            java.lang.String r5 = "chris: can not parse from mmkv data!"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}     // Catch: java.lang.Throwable -> La4
            java.util.List r4 = a.a.y0(r4)     // Catch: java.lang.Throwable -> La4
            fh.k.u0(r3, r4)     // Catch: java.lang.Throwable -> La4
            r2.f1666h = r3     // Catch: java.lang.Throwable -> La4
            hh.p r1 = r1.findMethod(r2)     // Catch: java.lang.Throwable -> La4
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La4
            r2.<init>()     // Catch: java.lang.Throwable -> La4
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> La4
        L67:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> La4
            if (r3 == 0) goto Lae
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> La4
            hh.o r3 = (hh.o) r3     // Catch: java.lang.Throwable -> La4
            java.lang.ClassLoader r4 = r9.f11622c     // Catch: java.lang.Throwable -> La4
            java.lang.reflect.Method r3 = r3.r(r4)     // Catch: java.lang.Throwable -> La4
            java.lang.Class r3 = r3.getDeclaringClass()     // Catch: java.lang.Throwable -> La4
            java.util.List r3 = h.Hchat.utils.KavaReflector.declaredMethods(r3)     // Catch: java.lang.Throwable -> La4
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La4
            r4.<init>()     // Catch: java.lang.Throwable -> La4
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> La4
        L8a:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> La4
            if (r5 == 0) goto Laa
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> La4
            r6 = r5
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6     // Catch: java.lang.Throwable -> La4
            boolean r7 = w(r6)     // Catch: java.lang.Throwable -> La4
            if (r7 != 0) goto La6
            boolean r6 = v(r6)     // Catch: java.lang.Throwable -> La4
            if (r6 == 0) goto L8a
            goto La6
        La4:
            r0 = move-exception
            goto Ldb
        La6:
            r4.add(r5)     // Catch: java.lang.Throwable -> La4
            goto L8a
        Laa:
            tf.r.h1(r2, r4)     // Catch: java.lang.Throwable -> La4
            goto L67
        Lae:
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Throwable -> La4
            r1.<init>()     // Catch: java.lang.Throwable -> La4
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La4
            r3.<init>()     // Catch: java.lang.Throwable -> La4
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> La4
        Lbc:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> La4
            if (r4 == 0) goto Ld7
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> La4
            r5 = r4
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch: java.lang.Throwable -> La4
            java.lang.String r5 = r5.toGenericString()     // Catch: java.lang.Throwable -> La4
            boolean r5 = r1.add(r5)     // Catch: java.lang.Throwable -> La4
            if (r5 == 0) goto Lbc
            r3.add(r4)     // Catch: java.lang.Throwable -> La4
            goto Lbc
        Ld7:
            r8.O(r9, r0, r3)     // Catch: java.lang.Throwable -> La4
            goto Le0
        Ldb:
            sf.f r3 = new sf.f
            r3.<init>(r0)
        Le0:
            java.lang.Throwable r0 = sf.g.b(r3)
            if (r0 != 0) goto Le7
            goto Lee
        Le7:
            java.lang.String r1 = "定位媒体处理信息清理方法失败"
            r8.e(r1, r0)
            tf.t r3 = tf.t.f13167g
        Lee:
            r2 = r3
            java.util.List r2 = (java.util.List) r2
        Lf1:
            java.util.Iterator r0 = r2.iterator()
            r1 = 0
        Lf6:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L116
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            r8.i r3 = r8.i.f11631b     // Catch: java.lang.Throwable -> L10f
            s8.b r4 = new s8.b     // Catch: java.lang.Throwable -> L10f
            r5 = 3
            r4.<init>(r8, r9, r5)     // Catch: java.lang.Throwable -> L10f
            r3.b(r2, r4)     // Catch: java.lang.Throwable -> L10f
            r1 = 1
            goto Lf6
        L10f:
            r2 = move-exception
            java.lang.String r3 = "媒体处理信息清理Hook安装失败"
            r8.e(r3, r2)
            goto Lf6
        L116:
            r8.f12391l = r1
            return
    }
}
