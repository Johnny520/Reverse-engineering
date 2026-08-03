package ha;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final java.lang.Object f5175k = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ab.b f5176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.content.SharedPreferences f5177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ScheduledThreadPoolExecutor f5178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Object f5179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Object f5180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.LinkedHashMap f5181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.LinkedHashSet f5182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f5183h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5184i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b9.b f5185j;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            ha.d.f5175k = r0
            return
    }

    public d(r8.g r3, ab.b r4) {
            r2 = this;
            r3.getClass()
            r2.<init>()
            r2.f5176a = r4
            android.content.Context r3 = r3.f11620a
            java.lang.String r4 = "Hchat_moments_auto_comment_config"
            android.content.SharedPreferences r3 = ub.b.c(r3, r4)
            r2.f5177b = r3
            java.util.concurrent.ScheduledThreadPoolExecutor r4 = new java.util.concurrent.ScheduledThreadPoolExecutor
            c9.q r0 = new c9.q
            r1 = 10
            r0.<init>(r1)
            r1 = 1
            r4.<init>(r1, r0)
            r4.setRemoveOnCancelPolicy(r1)
            r2.f5178c = r4
            java.lang.Object r4 = new java.lang.Object
            r4.<init>()
            r2.f5179d = r4
            java.lang.Object r4 = new java.lang.Object
            r4.<init>()
            r2.f5180e = r4
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            r2.f5181f = r4
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            r2.f5182g = r4
            java.util.concurrent.ConcurrentHashMap r4 = new java.util.concurrent.ConcurrentHashMap
            r4.<init>()
            r2.f5183h = r4
            java.lang.String r4 = "comment_enable"
            r0 = 0
            boolean r3 = r3.getBoolean(r4, r0)
            r2.f5184i = r3
            b9.b r3 = new b9.b
            r4 = 2
            r3.<init>(r2, r4)
            r2.f5185j = r3
            return
    }

    public static java.lang.String b(java.lang.String r2) {
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

    public final java.lang.String a() {
            r3 = this;
            android.content.SharedPreferences r0 = r3.f5177b
            java.lang.String r1 = "comment_content"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            if (r0 != 0) goto Ld
            goto Le
        Ld:
            r2 = r0
        Le:
            java.lang.CharSequence r0 = og.m.R0(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final void c(java.lang.String r9) {
            r8 = this;
            android.content.SharedPreferences r0 = r8.f5177b
            java.lang.String r1 = "comment_log_enable"
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
            java.lang.Object r1 = ha.d.f5175k
            monitor-enter(r1)
            java.util.List r9 = a.a.x0(r9)     // Catch: java.lang.Throwable -> L3a
            android.content.SharedPreferences r0 = r8.f5177b     // Catch: java.lang.Throwable -> L3a
            java.lang.String r2 = "comment_logs"
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
            r3 = 4
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
            android.content.SharedPreferences r0 = r8.f5177b     // Catch: java.lang.Throwable -> L3a
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r2 = "comment_logs"
            android.content.SharedPreferences$Editor r9 = r0.putString(r2, r9)     // Catch: java.lang.Throwable -> L3a
            r9.apply()     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r1)
            return
        L79:
            monitor-exit(r1)
            throw r9
    }

    public final void d() {
            r6 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.util.LinkedHashMap r2 = r6.f5181f
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
            ha.b r4 = (ha.b) r4
            long r4 = r4.f5155a
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

    public final void e(java.lang.String r7) {
            r6 = this;
            java.lang.Object r0 = r6.f5180e
            monitor-enter(r0)
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L54
            java.lang.String r2 = "yyyy-MM-dd"
            java.util.Locale r3 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L54
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L54
            java.util.Date r2 = new java.util.Date     // Catch: java.lang.Throwable -> L54
            r2.<init>()     // Catch: java.lang.Throwable -> L54
            java.lang.String r1 = r1.format(r2)     // Catch: java.lang.Throwable -> L54
            r1.getClass()     // Catch: java.lang.Throwable -> L54
            android.content.SharedPreferences r2 = r6.f5177b     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = "daily_comment_date"
            java.lang.String r4 = ""
            java.lang.String r2 = r2.getString(r3, r4)     // Catch: java.lang.Throwable -> L54
            boolean r2 = gg.l.a(r2, r1)     // Catch: java.lang.Throwable -> L54
            if (r2 == 0) goto L56
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L39
            android.content.SharedPreferences r3 = r6.f5177b     // Catch: java.lang.Throwable -> L39
            java.lang.String r4 = "daily_comment_counts"
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
            android.content.SharedPreferences r7 = r6.f5177b     // Catch: java.lang.Throwable -> L54
            android.content.SharedPreferences$Editor r7 = r7.edit()     // Catch: java.lang.Throwable -> L54
            java.lang.String r3 = "daily_comment_date"
            android.content.SharedPreferences$Editor r7 = r7.putString(r3, r1)     // Catch: java.lang.Throwable -> L54
            java.lang.String r1 = "daily_comment_counts"
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L54
            android.content.SharedPreferences$Editor r7 = r7.putString(r1, r2)     // Catch: java.lang.Throwable -> L54
            r7.commit()     // Catch: java.lang.Throwable -> L54
            monitor-exit(r0)
            return
        L84:
            monitor-exit(r0)
            throw r7
    }

    public final java.lang.String f(ha.c0 r12) {
            r11 = this;
            android.content.SharedPreferences r0 = r11.f5177b
            java.lang.String r1 = "comment_enable"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 != 0) goto Le
            java.lang.String r12 = "功能已关闭"
            return r12
        Le:
            java.lang.String r0 = r11.a()
            int r0 = r0.length()
            if (r0 != 0) goto L1b
            java.lang.String r12 = "评论内容为空"
            return r12
        L1b:
            g8.a r0 = h.Hchat.hooks.api.core.WeChatApis.account()
            r1 = 0
            if (r0 == 0) goto L27
            java.lang.String r0 = r0.c()
            goto L28
        L27:
            r0 = r1
        L28:
            if (r0 != 0) goto L2c
            java.lang.String r0 = ""
        L2c:
            boolean r3 = og.m.t0(r0)
            r4 = 1
            if (r3 != 0) goto L3d
            java.lang.String r3 = r12.f5170c
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L3d
            r0 = r4
            goto L3e
        L3d:
            r0 = r2
        L3e:
            if (r0 == 0) goto L4d
            android.content.SharedPreferences r3 = r11.f5177b
            java.lang.String r5 = "comment_self"
            boolean r3 = r3.getBoolean(r5, r2)
            if (r3 != 0) goto L4d
            java.lang.String r12 = "未开启评论自己的朋友圈"
            return r12
        L4d:
            android.content.SharedPreferences r3 = r11.f5177b
            java.lang.String r5 = "comment_list_mode"
            int r3 = r3.getInt(r5, r2)
            android.content.SharedPreferences r5 = r11.f5177b
            if (r3 != r4) goto L66
            java.lang.String r6 = "comment_blacklist"
            java.lang.String r7 = ""
            java.lang.String r5 = r5.getString(r6, r7)
            java.util.Set r5 = r9.e0.S(r5)
            goto L72
        L66:
            java.lang.String r6 = "comment_whitelist"
            java.lang.String r7 = ""
            java.lang.String r5 = r5.getString(r6, r7)
            java.util.Set r5 = r9.e0.S(r5)
        L72:
            if (r0 != 0) goto L81
            if (r3 != 0) goto L81
            java.lang.String r6 = r12.f5170c
            boolean r6 = r5.contains(r6)
            if (r6 != 0) goto L81
            java.lang.String r12 = "不在白名单"
            return r12
        L81:
            if (r0 != 0) goto L90
            if (r3 != r4) goto L90
            java.lang.String r0 = r12.f5170c
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L90
            java.lang.String r12 = "命中黑名单"
            return r12
        L90:
            android.content.SharedPreferences r0 = r11.f5177b
            java.lang.String r3 = "daily_comment_limit"
            int r0 = r0.getInt(r3, r2)
            if (r0 >= 0) goto L9b
            r0 = r2
        L9b:
            if (r0 <= 0) goto L11b
            java.lang.String r3 = r12.f5170c
            java.lang.Object r5 = r11.f5180e
            monitor-enter(r5)
            java.text.SimpleDateFormat r6 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L118
            java.lang.String r7 = "yyyy-MM-dd"
            java.util.Locale r8 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L118
            r6.<init>(r7, r8)     // Catch: java.lang.Throwable -> L118
            java.util.Date r7 = new java.util.Date     // Catch: java.lang.Throwable -> L118
            r7.<init>()     // Catch: java.lang.Throwable -> L118
            java.lang.String r6 = r6.format(r7)     // Catch: java.lang.Throwable -> L118
            r6.getClass()     // Catch: java.lang.Throwable -> L118
            android.content.SharedPreferences r7 = r11.f5177b     // Catch: java.lang.Throwable -> L118
            java.lang.String r8 = "daily_comment_date"
            java.lang.String r9 = ""
            java.lang.String r7 = r7.getString(r8, r9)     // Catch: java.lang.Throwable -> L118
            boolean r7 = gg.l.a(r7, r6)     // Catch: java.lang.Throwable -> L118
            if (r7 != 0) goto Le0
            android.content.SharedPreferences r3 = r11.f5177b     // Catch: java.lang.Throwable -> L118
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch: java.lang.Throwable -> L118
            java.lang.String r7 = "daily_comment_date"
            android.content.SharedPreferences$Editor r3 = r3.putString(r7, r6)     // Catch: java.lang.Throwable -> L118
            java.lang.String r6 = "daily_comment_counts"
            java.lang.String r7 = "{}"
            android.content.SharedPreferences$Editor r3 = r3.putString(r6, r7)     // Catch: java.lang.Throwable -> L118
            r3.commit()     // Catch: java.lang.Throwable -> L118
        Lde:
            r3 = r2
            goto L112
        Le0:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lf1
            android.content.SharedPreferences r7 = r11.f5177b     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r8 = "daily_comment_counts"
            java.lang.String r9 = "{}"
            java.lang.String r7 = r7.getString(r8, r9)     // Catch: java.lang.Throwable -> Lf1
            if (r7 != 0) goto Lf3
            java.lang.String r7 = ""
            goto Lf3
        Lf1:
            r6 = move-exception
            goto Lf7
        Lf3:
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lf1
            goto Lfd
        Lf7:
            sf.f r7 = new sf.f     // Catch: java.lang.Throwable -> L118
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L118
            r6 = r7
        Lfd:
            java.lang.Throwable r7 = sf.g.b(r6)     // Catch: java.lang.Throwable -> L118
            if (r7 != 0) goto L104
            goto L109
        L104:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L118
            r6.<init>()     // Catch: java.lang.Throwable -> L118
        L109:
            org.json.JSONObject r6 = (org.json.JSONObject) r6     // Catch: java.lang.Throwable -> L118
            int r3 = r6.optInt(r3, r2)     // Catch: java.lang.Throwable -> L118
            if (r3 >= 0) goto L112
            goto Lde
        L112:
            monitor-exit(r5)
            if (r3 < r0) goto L11b
            java.lang.String r12 = "已达到同一人当天评论上限"
            return r12
        L118:
            r12 = move-exception
            monitor-exit(r5)
            throw r12
        L11b:
            android.content.SharedPreferences r0 = r11.f5177b
            java.lang.String r3 = "comment_time_window_enable"
            boolean r0 = r0.getBoolean(r3, r2)
            if (r0 == 0) goto L14a
            android.content.SharedPreferences r0 = r11.f5177b
            java.lang.String r3 = "comment_start_time"
            java.lang.String r5 = "08:00:00"
            java.lang.String r0 = r0.getString(r3, r5)
            if (r0 != 0) goto L133
            java.lang.String r0 = ""
        L133:
            android.content.SharedPreferences r3 = r11.f5177b
            java.lang.String r5 = "comment_end_time"
            java.lang.String r6 = "23:30:00"
            java.lang.String r3 = r3.getString(r5, r6)
            if (r3 != 0) goto L141
            java.lang.String r3 = ""
        L141:
            boolean r0 = r9.e0.H(r0, r3)
            if (r0 != 0) goto L14a
            java.lang.String r12 = "当前不在运行时段"
            return r12
        L14a:
            android.content.SharedPreferences r0 = r11.f5177b
            java.lang.String r3 = "comment_max_age_hours"
            r5 = 24
            int r0 = r0.getInt(r3, r5)
            if (r0 >= r4) goto L157
            r0 = r4
        L157:
            long r5 = r12.f5171d
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 > 0) goto L162
            java.lang.String r12 = "无法确认发布时间"
            return r12
        L162:
            android.content.SharedPreferences r3 = r11.f5177b
            java.lang.String r5 = "comment_enabled_at_seconds"
            long r5 = r3.getLong(r5, r7)
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 <= 0) goto L277
            long r9 = r12.f5171d
            int r3 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r3 >= 0) goto L176
            goto L277
        L176:
            long r5 = java.lang.System.currentTimeMillis()
            r9 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r9
            long r9 = r12.f5171d
            long r5 = r5 - r9
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r3 > 0) goto L26e
            long r7 = (long) r0
            r9 = 3600(0xe10, double:1.7786E-320)
            long r7 = r7 * r9
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 > 0) goto L26e
            ha.d0 r0 = r12.f5172e
            int r0 = r0.ordinal()
            r3 = 3
            r5 = 2
            if (r0 == 0) goto L1b5
            if (r0 == r4) goto L1ac
            if (r0 == r5) goto L1a3
            if (r0 != r3) goto L19e
            r0 = r2
            goto L1bd
        L19e:
            okio.a.k()
            r12 = 0
            return r12
        L1a3:
            android.content.SharedPreferences r0 = r11.f5177b
            java.lang.String r6 = "comment_allow_video"
            boolean r0 = r0.getBoolean(r6, r4)
            goto L1bd
        L1ac:
            android.content.SharedPreferences r0 = r11.f5177b
            java.lang.String r6 = "comment_allow_image"
            boolean r0 = r0.getBoolean(r6, r4)
            goto L1bd
        L1b5:
            android.content.SharedPreferences r0 = r11.f5177b
            java.lang.String r6 = "comment_allow_text"
            boolean r0 = r0.getBoolean(r6, r4)
        L1bd:
            ha.d0 r6 = r12.f5172e
            if (r0 != 0) goto L1cc
            java.lang.String r12 = r6.f5192g
            java.lang.String r0 = "已过滤"
            java.lang.String r1 = "类型"
            java.lang.String r12 = eh.a.n(r0, r12, r1)
            return r12
        L1cc:
            int r0 = r6.ordinal()
            if (r0 == 0) goto L1f1
            if (r0 == r4) goto L1e8
            if (r0 == r5) goto L1df
            if (r0 != r3) goto L1da
            r0 = r2
            goto L1f9
        L1da:
            okio.a.k()
            r12 = 0
            return r12
        L1df:
            android.content.SharedPreferences r0 = r11.f5177b
            java.lang.String r6 = "comment_keyword_video"
            boolean r0 = r0.getBoolean(r6, r4)
            goto L1f9
        L1e8:
            android.content.SharedPreferences r0 = r11.f5177b
            java.lang.String r6 = "comment_keyword_image"
            boolean r0 = r0.getBoolean(r6, r4)
            goto L1f9
        L1f1:
            android.content.SharedPreferences r0 = r11.f5177b
            java.lang.String r6 = "comment_keyword_text"
            boolean r0 = r0.getBoolean(r6, r4)
        L1f9:
            ha.d0 r6 = r12.f5172e
            int r6 = r6.ordinal()
            if (r6 == 0) goto L225
            if (r6 == r4) goto L21a
            if (r6 == r5) goto L20f
            if (r6 != r3) goto L20a
            java.lang.String r3 = ""
            goto L22f
        L20a:
            okio.a.k()
            r12 = 0
            return r12
        L20f:
            android.content.SharedPreferences r3 = r11.f5177b
            java.lang.String r4 = "comment_exclude_keywords_video_text"
            java.lang.String r5 = ""
            java.lang.String r3 = r3.getString(r4, r5)
            goto L22f
        L21a:
            android.content.SharedPreferences r3 = r11.f5177b
            java.lang.String r4 = "comment_exclude_keywords_image_text"
            java.lang.String r5 = ""
            java.lang.String r3 = r3.getString(r4, r5)
            goto L22f
        L225:
            android.content.SharedPreferences r3 = r11.f5177b
            java.lang.String r4 = "comment_exclude_keywords_text"
            java.lang.String r5 = ""
            java.lang.String r3 = r3.getString(r4, r5)
        L22f:
            if (r0 == 0) goto L26d
            java.lang.String r0 = r12.f5173f
            boolean r0 = og.m.t0(r0)
            if (r0 != 0) goto L26d
            java.lang.String r12 = r12.f5173f
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r12 = j8.b.l(r0, r12, r0)
            java.util.Set r0 = r9.e0.T(r3)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L24b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L25f
            java.lang.Object r3 = r0.next()
            r4 = r3
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r4 = og.m.h0(r12, r4, r2)
            if (r4 == 0) goto L24b
            goto L260
        L25f:
            r3 = r1
        L260:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L26d
            java.lang.String r12 = "命中排除关键词“"
            java.lang.String r0 = "”"
            java.lang.String r12 = eh.a.n(r12, r3, r0)
            return r12
        L26d:
            return r1
        L26e:
            java.lang.String r12 = "超过"
            java.lang.String r1 = "小时"
            java.lang.String r12 = eh.a.m(r0, r12, r1)
            return r12
        L277:
            java.lang.String r12 = "早于本次开启时间"
            return r12
    }

    public final void g(long r4, java.lang.String r6) {
            r3 = this;
            java.lang.Object r0 = r3.f5179d
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = r3.f5181f     // Catch: java.lang.Throwable -> L17
            r1.remove(r6)     // Catch: java.lang.Throwable -> L17
            java.util.LinkedHashMap r1 = r3.f5181f     // Catch: java.lang.Throwable -> L17
            ha.b r2 = new ha.b     // Catch: java.lang.Throwable -> L17
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L17
            r1.put(r6, r2)     // Catch: java.lang.Throwable -> L17
            r3.d()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            return
        L17:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    public final java.lang.String h() {
            r9 = this;
            java.lang.String r0 = r9.a()
            android.content.SharedPreferences r1 = r9.f5177b
            java.lang.String r2 = "comment_time_format"
            java.lang.String r3 = "yyyy-MM-dd HH:mm:ss"
            java.lang.String r1 = r1.getString(r2, r3)
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = ""
            if (r0 != 0) goto L17
            r0 = r2
        L17:
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "${time}"
            r7 = 0
            boolean r8 = og.m.h0(r0, r6, r7)
            if (r8 != 0) goto L29
            return r0
        L29:
            java.util.Date r8 = new java.util.Date
            r8.<init>(r4)
            java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L4e
            if (r1 != 0) goto L33
            r1 = r2
        L33:
            java.lang.CharSequence r1 = og.m.R0(r1)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L4e
            boolean r2 = og.m.t0(r1)     // Catch: java.lang.Throwable -> L4e
            if (r2 == 0) goto L42
            r1 = r3
        L42:
            java.util.Locale r2 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r1, r2)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r1 = r4.format(r8)     // Catch: java.lang.Throwable -> L4e
            goto L55
        L4e:
            r1 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r1)
            r1 = r2
        L55:
            java.lang.Throwable r2 = sf.g.b(r1)
            if (r2 != 0) goto L5c
            goto L69
        L5c:
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.util.Locale r2 = java.util.Locale.getDefault()
            r1.<init>(r3, r2)
            java.lang.String r1 = r1.format(r8)
        L69:
            java.lang.String r1 = (java.lang.String) r1
            r1.getClass()
            java.lang.String r0 = og.t.a0(r0, r6, r1, r7)
            return r0
    }

    public final void i() {
            r4 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.lang.Object r1 = r4.f5179d
            monitor-enter(r1)
            java.util.LinkedHashSet r2 = r4.f5182g     // Catch: java.lang.Throwable -> L1e
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
            android.content.SharedPreferences r1 = r4.f5177b
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r2 = "comment_success_records"
            java.lang.String r0 = r0.toString()
            android.content.SharedPreferences$Editor r0 = r1.putString(r2, r0)
            r0.commit()
            return
        L35:
            monitor-exit(r1)
            throw r0
    }
}
