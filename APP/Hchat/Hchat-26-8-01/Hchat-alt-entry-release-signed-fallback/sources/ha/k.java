package ha;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final java.lang.Object f5245k = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ab.b f5246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.content.SharedPreferences f5247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ScheduledThreadPoolExecutor f5248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Object f5249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Object f5250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.LinkedHashMap f5251f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.LinkedHashSet f5252g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f5253h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5254i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b9.b f5255j;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            ha.k.f5245k = r0
            return
    }

    public k(r8.g r3, ab.b r4) {
            r2 = this;
            r3.getClass()
            r2.<init>()
            r2.f5246a = r4
            android.content.Context r3 = r3.f11620a
            java.lang.String r4 = "Hchat_moments_auto_like_config"
            android.content.SharedPreferences r3 = ub.b.c(r3, r4)
            r2.f5247b = r3
            java.util.concurrent.ScheduledThreadPoolExecutor r4 = new java.util.concurrent.ScheduledThreadPoolExecutor
            c9.q r0 = new c9.q
            r1 = 12
            r0.<init>(r1)
            r1 = 1
            r4.<init>(r1, r0)
            r4.setRemoveOnCancelPolicy(r1)
            r2.f5248c = r4
            java.lang.Object r4 = new java.lang.Object
            r4.<init>()
            r2.f5249d = r4
            java.lang.Object r4 = new java.lang.Object
            r4.<init>()
            r2.f5250e = r4
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            r2.f5251f = r4
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            r2.f5252g = r4
            java.util.concurrent.ConcurrentHashMap r4 = new java.util.concurrent.ConcurrentHashMap
            r4.<init>()
            r2.f5253h = r4
            java.lang.String r4 = "enable"
            r0 = 0
            boolean r3 = r3.getBoolean(r4, r0)
            r2.f5254i = r3
            b9.b r3 = new b9.b
            r4 = 4
            r3.<init>(r2, r4)
            r2.f5255j = r3
            return
    }

    public static java.lang.String a(java.lang.String r2) {
            g8.i r0 = wb.en.c()
            if (r0 == 0) goto L1c
            h.Hchat.hooks.api.model.WeChatContact r0 = r0.n(r2)
            if (r0 == 0) goto L1c
            java.lang.String r0 = r0.displayName()
            if (r0 == 0) goto L1c
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto L19
            r0 = r2
        L19:
            if (r0 == 0) goto L1c
            return r0
        L1c:
            return r2
    }

    public final void b(java.lang.String r9) {
            r8 = this;
            android.content.SharedPreferences r0 = r8.f5247b
            java.lang.String r1 = "log_enable"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 != 0) goto Lc
            return
        Lc:
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "MM-dd HH:mm:ss"
            java.util.Locale r2 = java.util.Locale.CHINA
            r0.<init>(r1, r2)
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.lang.String r0 = r0.format(r1)
            java.lang.String r1 = "  "
            java.lang.String r9 = wb.en.h(r0, r1, r9)
            java.lang.Object r1 = ha.k.f5245k
            monitor-enter(r1)
            java.util.List r9 = a.a.x0(r9)     // Catch: java.lang.Throwable -> L3a
            android.content.SharedPreferences r0 = r8.f5247b     // Catch: java.lang.Throwable -> L3a
            java.lang.String r2 = "logs"
            java.lang.String r3 = ""
            java.lang.String r0 = r0.getString(r2, r3)     // Catch: java.lang.Throwable -> L3a
            if (r0 != 0) goto L3d
            java.lang.String r0 = ""
            goto L3d
        L3a:
            r0 = move-exception
            r9 = r0
            goto L79
        L3d:
            dg.n r2 = new dg.n     // Catch: java.lang.Throwable -> L3a
            r3 = 4
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L3a
            g0.o r0 = new g0.o     // Catch: java.lang.Throwable -> L3a
            r3 = 6
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L3a
            ng.i r3 = new ng.i     // Catch: java.lang.Throwable -> L3a
            r4 = 1
            r3.<init>(r2, r4, r0)     // Catch: java.lang.Throwable -> L3a
            java.util.List r0 = ng.m.b0(r3)     // Catch: java.lang.Throwable -> L3a
            java.util.ArrayList r9 = tf.m.F1(r9, r0)     // Catch: java.lang.Throwable -> L3a
            r0 = 200(0xc8, float:2.8E-43)
            java.util.List r2 = tf.m.L1(r0, r9)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r3 = "\n"
            r6 = 0
            r7 = 62
            r4 = 0
            r5 = 0
            java.lang.String r9 = tf.m.A1(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L3a
            android.content.SharedPreferences r0 = r8.f5247b     // Catch: java.lang.Throwable -> L3a
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r2 = "logs"
            android.content.SharedPreferences$Editor r9 = r0.putString(r2, r9)     // Catch: java.lang.Throwable -> L3a
            r9.apply()     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r1)
            return
        L79:
            monitor-exit(r1)
            throw r9
    }

    public final void c() {
            r6 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.util.LinkedHashMap r2 = r6.f5251f
            java.util.Set r3 = r2.entrySet()
            r3.getClass()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L13:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L38
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r4.getClass()
            java.lang.Object r4 = r4.getValue()
            ha.j r4 = (ha.j) r4
            long r4 = r4.f5228a
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r5 = 1
            if (r4 > 0) goto L31
            r4 = r5
            goto L32
        L31:
            r4 = 0
        L32:
            if (r4 != r5) goto L13
            r3.remove()
            goto L13
        L38:
            int r0 = r2.size()
            r1 = 4096(0x1000, float:5.74E-42)
            if (r0 <= r1) goto L57
            java.util.Set r0 = r2.entrySet()
            r0.getClass()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r0 = tf.m.s1(r0)
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getKey()
            r2.remove(r0)
            goto L38
        L57:
            return
    }

    public final void d(java.lang.String r7) {
            r6 = this;
            java.lang.Object r0 = r6.f5250e
            monitor-enter(r0)
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L54
            java.lang.String r2 = "yyyy-MM-dd"
            java.util.Locale r3 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L54
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L54
            java.util.Date r2 = new java.util.Date     // Catch: java.lang.Throwable -> L54
            r2.<init>()     // Catch: java.lang.Throwable -> L54
            java.lang.String r1 = r1.format(r2)     // Catch: java.lang.Throwable -> L54
            r1.getClass()     // Catch: java.lang.Throwable -> L54
            android.content.SharedPreferences r2 = r6.f5247b     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = "daily_like_date"
            java.lang.String r4 = ""
            java.lang.String r2 = r2.getString(r3, r4)     // Catch: java.lang.Throwable -> L54
            boolean r2 = gg.l.a(r2, r1)     // Catch: java.lang.Throwable -> L54
            if (r2 == 0) goto L56
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L39
            android.content.SharedPreferences r3 = r6.f5247b     // Catch: java.lang.Throwable -> L39
            java.lang.String r4 = "daily_like_counts"
            java.lang.String r5 = "{}"
            java.lang.String r3 = r3.getString(r4, r5)     // Catch: java.lang.Throwable -> L39
            if (r3 != 0) goto L3b
            java.lang.String r3 = ""
            goto L3b
        L39:
            r2 = move-exception
            goto L3f
        L3b:
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L39
            goto L45
        L3f:
            sf.f r3 = new sf.f     // Catch: java.lang.Throwable -> L54
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L54
            r2 = r3
        L45:
            java.lang.Throwable r3 = sf.g.b(r2)     // Catch: java.lang.Throwable -> L54
            if (r3 != 0) goto L4c
            goto L51
        L4c:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L54
            r2.<init>()     // Catch: java.lang.Throwable -> L54
        L51:
            org.json.JSONObject r2 = (org.json.JSONObject) r2     // Catch: java.lang.Throwable -> L54
            goto L5b
        L54:
            r7 = move-exception
            goto L84
        L56:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L54
            r2.<init>()     // Catch: java.lang.Throwable -> L54
        L5b:
            r3 = 0
            int r4 = r2.optInt(r7, r3)     // Catch: java.lang.Throwable -> L54
            if (r4 >= 0) goto L63
            goto L64
        L63:
            r3 = r4
        L64:
            int r3 = r3 + 1
            r2.put(r7, r3)     // Catch: java.lang.Throwable -> L54
            android.content.SharedPreferences r7 = r6.f5247b     // Catch: java.lang.Throwable -> L54
            android.content.SharedPreferences$Editor r7 = r7.edit()     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = "daily_like_date"
            android.content.SharedPreferences$Editor r7 = r7.putString(r3, r1)     // Catch: java.lang.Throwable -> L54
            java.lang.String r1 = "daily_like_counts"
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L54
            android.content.SharedPreferences$Editor r7 = r7.putString(r1, r2)     // Catch: java.lang.Throwable -> L54
            r7.commit()     // Catch: java.lang.Throwable -> L54
            monitor-exit(r0)
            return
        L84:
            monitor-exit(r0)
            throw r7
    }

    public final java.lang.String e(ha.c0 r12) {
            r11 = this;
            android.content.SharedPreferences r0 = r11.f5247b
            java.lang.String r1 = "enable"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 != 0) goto Le
            java.lang.String r12 = "功能已关闭"
            return r12
        Le:
            g8.a r0 = h.Hchat.hooks.api.core.WeChatApis.account()
            r1 = 0
            if (r0 == 0) goto L1a
            java.lang.String r0 = r0.c()
            goto L1b
        L1a:
            r0 = r1
        L1b:
            if (r0 != 0) goto L1f
            java.lang.String r0 = ""
        L1f:
            boolean r3 = og.m.t0(r0)
            r4 = 1
            if (r3 != 0) goto L30
            java.lang.String r3 = r12.f5170c
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L30
            r0 = r4
            goto L31
        L30:
            r0 = r2
        L31:
            if (r0 == 0) goto L40
            android.content.SharedPreferences r3 = r11.f5247b
            java.lang.String r5 = "like_self"
            boolean r3 = r3.getBoolean(r5, r2)
            if (r3 != 0) goto L40
            java.lang.String r12 = "未开启点赞自己的朋友圈"
            return r12
        L40:
            android.content.SharedPreferences r3 = r11.f5247b
            java.lang.String r5 = "list_mode"
            int r3 = r3.getInt(r5, r2)
            android.content.SharedPreferences r5 = r11.f5247b
            if (r3 != r4) goto L59
            java.lang.String r6 = "blacklist"
            java.lang.String r7 = ""
            java.lang.String r5 = r5.getString(r6, r7)
            java.util.Set r5 = r9.e0.S(r5)
            goto L65
        L59:
            java.lang.String r6 = "whitelist"
            java.lang.String r7 = ""
            java.lang.String r5 = r5.getString(r6, r7)
            java.util.Set r5 = r9.e0.S(r5)
        L65:
            if (r0 != 0) goto L74
            if (r3 != 0) goto L74
            java.lang.String r6 = r12.f5170c
            boolean r6 = r5.contains(r6)
            if (r6 != 0) goto L74
            java.lang.String r12 = "不在白名单"
            return r12
        L74:
            if (r0 != 0) goto L83
            if (r3 != r4) goto L83
            java.lang.String r0 = r12.f5170c
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L83
            java.lang.String r12 = "命中黑名单"
            return r12
        L83:
            android.content.SharedPreferences r0 = r11.f5247b
            java.lang.String r3 = "daily_like_limit"
            int r0 = r0.getInt(r3, r2)
            if (r0 >= 0) goto L8e
            r0 = r2
        L8e:
            if (r0 <= 0) goto L10e
            java.lang.String r3 = r12.f5170c
            java.lang.Object r5 = r11.f5250e
            monitor-enter(r5)
            java.text.SimpleDateFormat r6 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L10b
            java.lang.String r7 = "yyyy-MM-dd"
            java.util.Locale r8 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L10b
            r6.<init>(r7, r8)     // Catch: java.lang.Throwable -> L10b
            java.util.Date r7 = new java.util.Date     // Catch: java.lang.Throwable -> L10b
            r7.<init>()     // Catch: java.lang.Throwable -> L10b
            java.lang.String r6 = r6.format(r7)     // Catch: java.lang.Throwable -> L10b
            r6.getClass()     // Catch: java.lang.Throwable -> L10b
            android.content.SharedPreferences r7 = r11.f5247b     // Catch: java.lang.Throwable -> L10b
            java.lang.String r8 = "daily_like_date"
            java.lang.String r9 = ""
            java.lang.String r7 = r7.getString(r8, r9)     // Catch: java.lang.Throwable -> L10b
            boolean r7 = gg.l.a(r7, r6)     // Catch: java.lang.Throwable -> L10b
            if (r7 != 0) goto Ld3
            android.content.SharedPreferences r3 = r11.f5247b     // Catch: java.lang.Throwable -> L10b
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch: java.lang.Throwable -> L10b
            java.lang.String r7 = "daily_like_date"
            android.content.SharedPreferences$Editor r3 = r3.putString(r7, r6)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r6 = "daily_like_counts"
            java.lang.String r7 = "{}"
            android.content.SharedPreferences$Editor r3 = r3.putString(r6, r7)     // Catch: java.lang.Throwable -> L10b
            r3.commit()     // Catch: java.lang.Throwable -> L10b
        Ld1:
            r3 = r2
            goto L105
        Ld3:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Le4
            android.content.SharedPreferences r7 = r11.f5247b     // Catch: java.lang.Throwable -> Le4
            java.lang.String r8 = "daily_like_counts"
            java.lang.String r9 = "{}"
            java.lang.String r7 = r7.getString(r8, r9)     // Catch: java.lang.Throwable -> Le4
            if (r7 != 0) goto Le6
            java.lang.String r7 = ""
            goto Le6
        Le4:
            r6 = move-exception
            goto Lea
        Le6:
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Le4
            goto Lf0
        Lea:
            sf.f r7 = new sf.f     // Catch: java.lang.Throwable -> L10b
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L10b
            r6 = r7
        Lf0:
            java.lang.Throwable r7 = sf.g.b(r6)     // Catch: java.lang.Throwable -> L10b
            if (r7 != 0) goto Lf7
            goto Lfc
        Lf7:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L10b
            r6.<init>()     // Catch: java.lang.Throwable -> L10b
        Lfc:
            org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch: java.lang.Throwable -> L10b
            int r3 = r6.optInt(r3, r2)     // Catch: java.lang.Throwable -> L10b
            if (r3 >= 0) goto L105
            goto Ld1
        L105:
            monitor-exit(r5)
            if (r3 < r0) goto L10e
            java.lang.String r12 = "已达到同一人当天点赞上限"
            return r12
        L10b:
            r12 = move-exception
            monitor-exit(r5)
            throw r12
        L10e:
            android.content.SharedPreferences r0 = r11.f5247b
            java.lang.String r3 = "time_window_enable"
            boolean r0 = r0.getBoolean(r3, r2)
            if (r0 == 0) goto L13d
            android.content.SharedPreferences r0 = r11.f5247b
            java.lang.String r3 = "start_time"
            java.lang.String r5 = "08:00:00"
            java.lang.String r0 = r0.getString(r3, r5)
            if (r0 != 0) goto L126
            java.lang.String r0 = ""
        L126:
            android.content.SharedPreferences r3 = r11.f5247b
            java.lang.String r5 = "end_time"
            java.lang.String r6 = "23:30:00"
            java.lang.String r3 = r3.getString(r5, r6)
            if (r3 != 0) goto L134
            java.lang.String r3 = ""
        L134:
            boolean r0 = r9.e0.H(r0, r3)
            if (r0 != 0) goto L13d
            java.lang.String r12 = "当前不在运行时段"
            return r12
        L13d:
            android.content.SharedPreferences r0 = r11.f5247b
            java.lang.String r3 = "max_age_hours"
            r5 = 24
            int r0 = r0.getInt(r3, r5)
            if (r0 >= r4) goto L14a
            r0 = r4
        L14a:
            long r5 = r12.f5171d
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 > 0) goto L155
            java.lang.String r12 = "无法确认发布时间"
            return r12
        L155:
            android.content.SharedPreferences r3 = r11.f5247b
            java.lang.String r5 = "enabled_at_seconds"
            long r5 = r3.getLong(r5, r7)
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 <= 0) goto L26a
            long r9 = r12.f5171d
            int r3 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r3 >= 0) goto L169
            goto L26a
        L169:
            long r5 = java.lang.System.currentTimeMillis()
            r9 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r9
            long r9 = r12.f5171d
            long r5 = r5 - r9
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r3 > 0) goto L261
            long r7 = (long) r0
            r9 = 3600(0xe10, double:1.7786E-320)
            long r7 = r7 * r9
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 > 0) goto L261
            ha.d0 r0 = r12.f5172e
            int r0 = r0.ordinal()
            r3 = 3
            r5 = 2
            if (r0 == 0) goto L1a8
            if (r0 == r4) goto L19f
            if (r0 == r5) goto L196
            if (r0 != r3) goto L191
            r0 = r2
            goto L1b0
        L191:
            okio.a.k()
            r12 = 0
            return r12
        L196:
            android.content.SharedPreferences r0 = r11.f5247b
            java.lang.String r6 = "allow_video"
            boolean r0 = r0.getBoolean(r6, r4)
            goto L1b0
        L19f:
            android.content.SharedPreferences r0 = r11.f5247b
            java.lang.String r6 = "allow_image"
            boolean r0 = r0.getBoolean(r6, r4)
            goto L1b0
        L1a8:
            android.content.SharedPreferences r0 = r11.f5247b
            java.lang.String r6 = "allow_text"
            boolean r0 = r0.getBoolean(r6, r4)
        L1b0:
            ha.d0 r6 = r12.f5172e
            if (r0 != 0) goto L1bf
            java.lang.String r12 = r6.f5192g
            java.lang.String r0 = "已过滤"
            java.lang.String r1 = "类型"
            java.lang.String r12 = eh.a.n(r0, r12, r1)
            return r12
        L1bf:
            int r0 = r6.ordinal()
            if (r0 == 0) goto L1e4
            if (r0 == r4) goto L1db
            if (r0 == r5) goto L1d2
            if (r0 != r3) goto L1cd
            r0 = r2
            goto L1ec
        L1cd:
            okio.a.k()
            r12 = 0
            return r12
        L1d2:
            android.content.SharedPreferences r0 = r11.f5247b
            java.lang.String r6 = "keyword_video"
            boolean r0 = r0.getBoolean(r6, r4)
            goto L1ec
        L1db:
            android.content.SharedPreferences r0 = r11.f5247b
            java.lang.String r6 = "keyword_image"
            boolean r0 = r0.getBoolean(r6, r4)
            goto L1ec
        L1e4:
            android.content.SharedPreferences r0 = r11.f5247b
            java.lang.String r6 = "keyword_text"
            boolean r0 = r0.getBoolean(r6, r4)
        L1ec:
            ha.d0 r6 = r12.f5172e
            int r6 = r6.ordinal()
            if (r6 == 0) goto L218
            if (r6 == r4) goto L20d
            if (r6 == r5) goto L202
            if (r6 != r3) goto L1fd
            java.lang.String r3 = ""
            goto L222
        L1fd:
            okio.a.k()
            r12 = 0
            return r12
        L202:
            android.content.SharedPreferences r3 = r11.f5247b
            java.lang.String r4 = "exclude_keywords_video_text"
            java.lang.String r5 = ""
            java.lang.String r3 = r3.getString(r4, r5)
            goto L222
        L20d:
            android.content.SharedPreferences r3 = r11.f5247b
            java.lang.String r4 = "exclude_keywords_image_text"
            java.lang.String r5 = ""
            java.lang.String r3 = r3.getString(r4, r5)
            goto L222
        L218:
            android.content.SharedPreferences r3 = r11.f5247b
            java.lang.String r4 = "exclude_keywords_text"
            java.lang.String r5 = ""
            java.lang.String r3 = r3.getString(r4, r5)
        L222:
            if (r0 == 0) goto L260
            java.lang.String r0 = r12.f5173f
            boolean r0 = og.m.t0(r0)
            if (r0 != 0) goto L260
            java.lang.String r12 = r12.f5173f
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r12 = j8.b.l(r0, r12, r0)
            java.util.Set r0 = r9.e0.T(r3)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L23e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L252
            java.lang.Object r3 = r0.next()
            r4 = r3
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = og.m.h0(r12, r4, r2)
            if (r4 == 0) goto L23e
            goto L253
        L252:
            r3 = r1
        L253:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L260
            java.lang.String r12 = "命中排除关键词“"
            java.lang.String r0 = "”"
            java.lang.String r12 = eh.a.n(r12, r3, r0)
            return r12
        L260:
            return r1
        L261:
            java.lang.String r12 = "超过"
            java.lang.String r1 = "小时"
            java.lang.String r12 = eh.a.m(r0, r12, r1)
            return r12
        L26a:
            java.lang.String r12 = "早于本次开启时间"
            return r12
    }

    public final void f(long r4, java.lang.String r6) {
            r3 = this;
            java.lang.Object r0 = r3.f5249d
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = r3.f5251f     // Catch: java.lang.Throwable -> L17
            r1.remove(r6)     // Catch: java.lang.Throwable -> L17
            java.util.LinkedHashMap r1 = r3.f5251f     // Catch: java.lang.Throwable -> L17
            ha.j r2 = new ha.j     // Catch: java.lang.Throwable -> L17
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L17
            r1.put(r6, r2)     // Catch: java.lang.Throwable -> L17
            r3.c()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            return
        L17:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    public final void g() {
            r4 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.lang.Object r1 = r4.f5249d
            monitor-enter(r1)
            java.util.LinkedHashSet r2 = r4.f5252g     // Catch: java.lang.Throwable -> L1e
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L1e
        Le:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L1e
            if (r3 == 0) goto L20
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L1e
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L1e
            r0.put(r3)     // Catch: java.lang.Throwable -> L1e
            goto Le
        L1e:
            r0 = move-exception
            goto L35
        L20:
            monitor-exit(r1)
            android.content.SharedPreferences r1 = r4.f5247b
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r2 = "success_records"
            java.lang.String r0 = r0.toString()
            android.content.SharedPreferences$Editor r0 = r1.putString(r2, r0)
            r0.commit()
            return
        L35:
            monitor-exit(r1)
            throw r0
    }
}
