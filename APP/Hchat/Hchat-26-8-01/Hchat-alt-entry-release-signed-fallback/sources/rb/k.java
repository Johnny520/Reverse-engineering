package rb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ia.t f11904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.content.Context f11905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rb.l f11906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Object f11907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ScheduledThreadPoolExecutor f11908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ScheduledThreadPoolExecutor f11909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.ArrayDeque f11910g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f11911h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.ArrayDeque f11912i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f11913j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile rb.c f11914k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile boolean f11915l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f11916m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public java.lang.String f11917n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public java.lang.String f11918o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f11919p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public rb.h f11920q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f11921r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f11922s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f11923t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f11924u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f11925v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f11926w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public android.os.PowerManager.WakeLock f11927x;

    public k(android.content.Context r10, ia.t r11) {
            r9 = this;
            r9.<init>()
            r9.f11904a = r11
            android.content.Context r11 = r10.getApplicationContext()
            r9.f11905b = r11
            rb.l r11 = new rb.l
            r11.<init>(r10)
            r9.f11906c = r11
            java.lang.Object r10 = new java.lang.Object
            r10.<init>()
            r9.f11907d = r10
            java.util.concurrent.ScheduledThreadPoolExecutor r10 = new java.util.concurrent.ScheduledThreadPoolExecutor
            c9.q r0 = new c9.q
            r1 = 24
            r0.<init>(r1)
            r1 = 1
            r10.<init>(r1, r0)
            r10.setRemoveOnCancelPolicy(r1)
            r9.f11908e = r10
            java.util.concurrent.ScheduledThreadPoolExecutor r10 = new java.util.concurrent.ScheduledThreadPoolExecutor
            c9.q r0 = new c9.q
            r2 = 25
            r0.<init>(r2)
            r10.<init>(r1, r0)
            r10.setRemoveOnCancelPolicy(r1)
            r9.f11909f = r10
            java.util.ArrayDeque r10 = new java.util.ArrayDeque
            r10.<init>()
            r9.f11910g = r10
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r9.f11911h = r10
            java.util.ArrayDeque r10 = new java.util.ArrayDeque
            r10.<init>()
            r9.f11912i = r10
            java.util.concurrent.ConcurrentHashMap r10 = new java.util.concurrent.ConcurrentHashMap
            r10.<init>()
            r9.f11913j = r10
            java.lang.String r10 = "等待检测"
            r9.f11917n = r10
            java.lang.String r10 = ""
            r9.f11918o = r10
            android.content.SharedPreferences r0 = r11.f11928a
            java.lang.String r1 = "zombie_check_total_count"
            r2 = 0
            int r0 = r0.getInt(r1, r2)
            if (r0 >= 0) goto L6c
            r0 = r2
        L6c:
            r9.f11919p = r0
            java.lang.String r0 = "zombie_check_pending_ids"
            java.util.List r11 = r11.b(r0)
            java.util.Iterator r11 = r11.iterator()
        L78:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L8f
            java.lang.Object r0 = r11.next()
            java.lang.String r0 = (java.lang.String) r0
            java.util.ArrayDeque r1 = r9.f11910g
            rb.j r3 = new rb.j
            r3.<init>(r0, r2)
            r1.addLast(r3)
            goto L78
        L8f:
            java.util.ArrayList r11 = r9.f11911h
            rb.l r0 = r9.f11906c
            android.content.SharedPreferences r0 = r0.f11928a
            java.lang.String r1 = "zombie_check_results"
            java.lang.String r10 = r0.getString(r1, r10)
            tf.t r0 = tf.t.f13167g
            if (r10 == 0) goto L129
            boolean r1 = og.m.t0(r10)
            if (r1 == 0) goto La7
            goto L129
        La7:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Lbb
            r1.<init>(r10)     // Catch: java.lang.Throwable -> Lbb
            uf.c r10 = a.a.E()     // Catch: java.lang.Throwable -> Lbb
            int r3 = r1.length()     // Catch: java.lang.Throwable -> Lbb
        Lb4:
            if (r2 < r3) goto Lbd
            uf.c r10 = a.a.t(r10)     // Catch: java.lang.Throwable -> Lbb
            goto L120
        Lbb:
            r10 = move-exception
            goto L11a
        Lbd:
            org.json.JSONObject r4 = r1.optJSONObject(r2)     // Catch: java.lang.Throwable -> Lbb
            if (r4 == 0) goto L117
            java.lang.String r5 = "wxid"
            java.lang.String r5 = r4.optString(r5)     // Catch: java.lang.Throwable -> Lbb
            r5.getClass()     // Catch: java.lang.Throwable -> Lbb
            java.lang.CharSequence r5 = og.m.R0(r5)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Lbb
            int r6 = r5.length()     // Catch: java.lang.Throwable -> Lbb
            if (r6 != 0) goto Ldb
            goto L117
        Ldb:
            java.lang.String r6 = "type"
            java.lang.String r6 = r4.optString(r6)     // Catch: java.lang.Throwable -> Le9
            r6.getClass()     // Catch: java.lang.Throwable -> Le9
            rb.e r6 = rb.e.valueOf(r6)     // Catch: java.lang.Throwable -> Le9
            goto Lf0
        Le9:
            r6 = move-exception
            sf.f r7 = new sf.f     // Catch: java.lang.Throwable -> Lbb
            r7.<init>(r6)     // Catch: java.lang.Throwable -> Lbb
            r6 = r7
        Lf0:
            rb.e r7 = rb.e.f11887i     // Catch: java.lang.Throwable -> Lbb
            boolean r8 = r6 instanceof sf.f     // Catch: java.lang.Throwable -> Lbb
            if (r8 == 0) goto Lf7
            r6 = r7
        Lf7:
            rb.e r6 = (rb.e) r6     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r7 = "name"
            java.lang.String r7 = r4.optString(r7)     // Catch: java.lang.Throwable -> Lbb
            boolean r8 = og.m.t0(r7)     // Catch: java.lang.Throwable -> Lbb
            if (r8 == 0) goto L106
            r7 = r5
        L106:
            java.lang.String r8 = "message"
            java.lang.String r4 = r4.optString(r8)     // Catch: java.lang.Throwable -> Lbb
            r4.getClass()     // Catch: java.lang.Throwable -> Lbb
            rb.d r8 = new rb.d     // Catch: java.lang.Throwable -> Lbb
            r8.<init>(r5, r7, r6, r4)     // Catch: java.lang.Throwable -> Lbb
            r10.add(r8)     // Catch: java.lang.Throwable -> Lbb
        L117:
            int r2 = r2 + 1
            goto Lb4
        L11a:
            sf.f r1 = new sf.f
            r1.<init>(r10)
            r10 = r1
        L120:
            boolean r1 = r10 instanceof sf.f
            if (r1 == 0) goto L126
            goto L127
        L126:
            r0 = r10
        L127:
            java.util.List r0 = (java.util.List) r0
        L129:
            tf.r.h1(r11, r0)
            int r10 = r9.f11919p
            if (r10 > 0) goto L13f
            java.util.ArrayDeque r10 = r9.f11910g
            int r10 = r10.size()
            java.util.ArrayList r11 = r9.f11911h
            int r11 = r11.size()
            int r11 = r11 + r10
            r9.f11919p = r11
        L13f:
            java.util.ArrayDeque r10 = r9.f11910g
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L14b
            java.lang.String r10 = "检测已暂停，可继续"
            r9.f11917n = r10
        L14b:
            return
    }

    public static boolean g(java.lang.String r2) {
            boolean r0 = og.m.t0(r2)
            r1 = 0
            if (r0 != 0) goto L3c
            java.lang.String r0 = "@chatroom"
            boolean r0 = og.t.W(r2, r0, r1)
            if (r0 != 0) goto L3c
            java.lang.String r0 = "gh_"
            boolean r0 = og.t.d0(r2, r0, r1)
            if (r0 == 0) goto L18
            goto L3c
        L18:
            java.lang.String r0 = "filehelper"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L3c
            java.lang.String r0 = "weixin"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L29
            goto L3c
        L29:
            g8.a r0 = h.Hchat.hooks.api.core.WeChatApis.account()
            if (r0 == 0) goto L34
            java.lang.String r0 = r0.c()
            goto L35
        L34:
            r0 = 0
        L35:
            boolean r2 = r2.equals(r0)
            r2 = r2 ^ 1
            return r2
        L3c:
            return r1
    }

    public final boolean a(long r4) {
            r3 = this;
            java.lang.Object r0 = r3.f11907d
            monitor-enter(r0)
            long r1 = r3.f11921r     // Catch: java.lang.Throwable -> L16
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto Lb
            r4 = 1
            goto Lc
        Lb:
            r4 = 0
        Lc:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            boolean r4 = r4.booleanValue()
            return r4
        L16:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    public final void b(java.lang.String r3) {
            r2 = this;
            java.util.ArrayDeque r0 = r2.f11912i
            r0.addLast(r3)
        L5:
            int r3 = r0.size()
            r1 = 80
            if (r3 <= r1) goto L11
            r0.removeFirst()
            goto L5
        L11:
            return
    }

    public final boolean c(long r2) {
            r1 = this;
            java.lang.Object r0 = r1.f11907d
            monitor-enter(r0)
            boolean r2 = r1.d(r2)     // Catch: java.lang.Throwable -> L11
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            boolean r2 = r2.booleanValue()
            return r2
        L11:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    public final boolean d(long r3) {
            r2 = this;
            boolean r0 = r2.f11922s
            if (r0 == 0) goto Lc
            long r0 = r2.f11921r
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto Lc
            r3 = 1
            return r3
        Lc:
            r3 = 0
            return r3
    }

    public final void e() {
            r6 = this;
            java.lang.Object r0 = r6.f11907d
            monitor-enter(r0)
            boolean r1 = r6.f11916m     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L77
            java.util.ArrayDeque r1 = r6.f11910g     // Catch: java.lang.Throwable -> L2a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L77
            rb.h r1 = r6.f11920q     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L14
            goto L77
        L14:
            r1 = 0
            r6.f11916m = r1     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = ""
            r6.f11918o = r2     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = "检测完成"
            r6.f11917n = r2     // Catch: java.lang.Throwable -> L2a
            java.util.ArrayList r2 = r6.f11911h     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L2c
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L2a
            if (r3 == 0) goto L2c
            goto L53
        L2a:
            r1 = move-exception
            goto L79
        L2c:
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L2a
            r3 = r1
        L31:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r4 == 0) goto L52
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L2a
            rb.d r4 = (rb.d) r4     // Catch: java.lang.Throwable -> L2a
            rb.e r4 = r4.f11883c     // Catch: java.lang.Throwable -> L2a
            rb.e r5 = rb.e.f11886h     // Catch: java.lang.Throwable -> L2a
            if (r4 != r5) goto L45
            r4 = 1
            goto L46
        L45:
            r4 = r1
        L46:
            if (r4 == 0) goto L31
            int r3 = r3 + 1
            if (r3 < 0) goto L4d
            goto L31
        L4d:
            a.a.P0()     // Catch: java.lang.Throwable -> L2a
            r1 = 0
            throw r1     // Catch: java.lang.Throwable -> L2a
        L52:
            r1 = r3
        L53:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a
            r2.<init>()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = "检测完成，共发现 "
            r2.append(r3)     // Catch: java.lang.Throwable -> L2a
            r2.append(r1)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = " 位异常好友"
            r2.append(r1)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L2a
            r6.b(r1)     // Catch: java.lang.Throwable -> L2a
            r6.h()     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r0)
            r6.j()
            r6.m()
            return
        L77:
            monitor-exit(r0)
            return
        L79:
            monitor-exit(r0)
            throw r1
    }

    public final void f(rb.h r7, java.lang.String r8) {
            r6 = this;
            java.lang.String r0 = "，准备重试"
            rb.j r1 = r7.f11897a
            int r1 = r1.f11903b
            rb.l r2 = r6.f11906c
            android.content.SharedPreferences r2 = r2.f11928a
            java.lang.String r3 = "zombie_check_max_retries"
            r4 = 2
            int r2 = r2.getInt(r3, r4)
            r3 = 0
            r4 = 5
            int r2 = r9.e0.r(r2, r3, r4)
            if (r1 >= r2) goto L84
            java.lang.Object r1 = r6.f11907d
            monitor-enter(r1)
            boolean r2 = r6.f11916m     // Catch: java.lang.Throwable -> L28
            java.util.ArrayDeque r3 = r6.f11910g
            rb.j r4 = r7.f11897a
            if (r2 != 0) goto L2a
            r3.addFirst(r4)     // Catch: java.lang.Throwable -> L28
            goto L6d
        L28:
            r7 = move-exception
            goto L82
        L2a:
            int r2 = r4.f11903b     // Catch: java.lang.Throwable -> L28
            int r2 = r2 + 1
            java.lang.String r4 = r4.f11902a     // Catch: java.lang.Throwable -> L28
            r4.getClass()     // Catch: java.lang.Throwable -> L28
            rb.j r5 = new rb.j     // Catch: java.lang.Throwable -> L28
            r5.<init>(r4, r2)     // Catch: java.lang.Throwable -> L28
            r3.addFirst(r5)     // Catch: java.lang.Throwable -> L28
            java.lang.String r0 = r8.concat(r0)     // Catch: java.lang.Throwable -> L28
            r6.f11917n = r0     // Catch: java.lang.Throwable -> L28
            rb.j r7 = r7.f11897a     // Catch: java.lang.Throwable -> L28
            java.lang.String r0 = r7.f11902a     // Catch: java.lang.Throwable -> L28
            int r7 = r7.f11903b     // Catch: java.lang.Throwable -> L28
            int r7 = r7 + 1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r2.<init>()     // Catch: java.lang.Throwable -> L28
            r2.append(r0)     // Catch: java.lang.Throwable -> L28
            java.lang.String r0 = ": "
            r2.append(r0)     // Catch: java.lang.Throwable -> L28
            r2.append(r8)     // Catch: java.lang.Throwable -> L28
            java.lang.String r8 = "，第 "
            r2.append(r8)     // Catch: java.lang.Throwable -> L28
            r2.append(r7)     // Catch: java.lang.Throwable -> L28
            java.lang.String r7 = " 次重试"
            r2.append(r7)     // Catch: java.lang.Throwable -> L28
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Throwable -> L28
            r6.b(r7)     // Catch: java.lang.Throwable -> L28
        L6d:
            r6.h()     // Catch: java.lang.Throwable -> L28
            monitor-exit(r1)
            r6.m()
            rb.m r7 = r6.l()
            boolean r7 = r7.f11930b
            if (r7 == 0) goto L81
            r7 = 500(0x1f4, double:2.47E-321)
            r6.k(r7)
        L81:
            return
        L82:
            monitor-exit(r1)
            throw r7
        L84:
            java.util.concurrent.ConcurrentHashMap r0 = r6.f11913j
            rb.j r1 = r7.f11897a
            java.lang.String r1 = r1.f11902a
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L94
            java.lang.String r0 = ""
        L94:
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto L9e
            rb.j r0 = r7.f11897a
            java.lang.String r0 = r0.f11902a
        L9e:
            rb.d r1 = new rb.d
            rb.j r7 = r7.f11897a
            java.lang.String r7 = r7.f11902a
            rb.e r2 = rb.e.f11887i
            r1.<init>(r7, r0, r2, r8)
            r6.i(r1)
            return
    }

    public final void h() {
            r7 = this;
            uf.c r0 = a.a.E()
            rb.h r1 = r7.f11920q
            if (r1 == 0) goto Lf
            rb.j r1 = r1.f11897a
            java.lang.String r1 = r1.f11902a
            r0.add(r1)
        Lf:
            java.util.ArrayDeque r1 = r7.f11910g
            java.util.Iterator r1 = r1.iterator()
        L15:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()
            rb.j r2 = (rb.j) r2
            java.lang.String r2 = r2.f11902a
            r0.add(r2)
            goto L15
        L27:
            uf.c r0 = a.a.t(r0)
            int r1 = r7.f11919p
            rb.l r2 = r7.f11906c
            r2.getClass()
            r0.getClass()
            java.util.ArrayList r3 = r7.f11911h
            r3.getClass()
            android.content.SharedPreferences r2 = r2.f11928a
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r4 = "zombie_check_pending_ids"
            java.lang.String r0 = rb.l.a(r0)
            android.content.SharedPreferences$Editor r0 = r2.putString(r4, r0)
            if (r1 >= 0) goto L4d
            r1 = 0
        L4d:
            java.lang.String r2 = "zombie_check_total_count"
            android.content.SharedPreferences$Editor r0 = r0.putInt(r2, r1)
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.util.Iterator r2 = r3.iterator()
        L5c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L91
            java.lang.Object r3 = r2.next()
            rb.d r3 = (rb.d) r3
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.String r5 = "wxid"
            java.lang.String r6 = r3.f11881a
            r4.put(r5, r6)
            java.lang.String r5 = "name"
            java.lang.String r6 = r3.f11882b
            r4.put(r5, r6)
            rb.e r5 = r3.f11883c
            java.lang.String r5 = r5.name()
            java.lang.String r6 = "type"
            r4.put(r6, r5)
            java.lang.String r5 = "message"
            java.lang.String r3 = r3.f11884d
            r4.put(r5, r3)
            r1.put(r4)
            goto L5c
        L91:
            java.lang.String r1 = r1.toString()
            r1.getClass()
            java.lang.String r2 = "zombie_check_results"
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r1)
            r0.apply()
            return
    }

    public final void i(rb.d r13) {
            r12 = this;
            rb.e r0 = r13.f11883c
            rb.e r1 = rb.e.f11886h
            r2 = 0
            r3 = 1
            if (r0 != r1) goto La
            r0 = r3
            goto Lb
        La:
            r0 = r2
        Lb:
            java.lang.Object r1 = r12.f11907d
            monitor-enter(r1)
            java.util.ArrayList r4 = r12.f11911h     // Catch: java.lang.Throwable -> Lf3
            nb.a r5 = new nb.a     // Catch: java.lang.Throwable -> Lf3
            r6 = 5
            r5.<init>(r13, r6)     // Catch: java.lang.Throwable -> Lf3
            tf.r.i1(r5, r4)     // Catch: java.lang.Throwable -> Lf3
            java.util.ArrayList r4 = r12.f11911h     // Catch: java.lang.Throwable -> Lf3
            r4.add(r13)     // Catch: java.lang.Throwable -> Lf3
            rb.e r4 = r13.f11883c     // Catch: java.lang.Throwable -> Lf3
            int r4 = r4.ordinal()     // Catch: java.lang.Throwable -> Lf3
            r5 = 2
            if (r4 == 0) goto L5e
            if (r4 == r3) goto L4a
            if (r4 != r5) goto L44
            java.lang.String r4 = r13.f11882b     // Catch: java.lang.Throwable -> L3f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r6.<init>()     // Catch: java.lang.Throwable -> L3f
            r6.append(r4)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = "：检测异常"
            r6.append(r4)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L3f
            goto L71
        L3f:
            r0 = move-exception
            r13 = r0
            r7 = r12
            goto Lf6
        L44:
            af.d r13 = new af.d     // Catch: java.lang.Throwable -> L3f
            r13.<init>()     // Catch: java.lang.Throwable -> L3f
            throw r13     // Catch: java.lang.Throwable -> L3f
        L4a:
            java.lang.String r4 = r13.f11882b     // Catch: java.lang.Throwable -> L3f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r6.<init>()     // Catch: java.lang.Throwable -> L3f
            r6.append(r4)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = "：好友关系异常"
            r6.append(r4)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L3f
            goto L71
        L5e:
            java.lang.String r4 = r13.f11882b     // Catch: java.lang.Throwable -> Lf3
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf3
            r6.<init>()     // Catch: java.lang.Throwable -> Lf3
            r6.append(r4)     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r4 = "：正常"
            r6.append(r4)     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> Lf3
        L71:
            r12.f11917n = r4     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r4 = r13.f11882b     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r6 = r13.f11884d     // Catch: java.lang.Throwable -> Lf3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf3
            r7.<init>()     // Catch: java.lang.Throwable -> Lf3
            r7.append(r4)     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r4 = ": "
            r7.append(r4)     // Catch: java.lang.Throwable -> Lf3
            r7.append(r6)     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r4 = r7.toString()     // Catch: java.lang.Throwable -> Lf3
            r12.b(r4)     // Catch: java.lang.Throwable -> Lf3
            r12.h()     // Catch: java.lang.Throwable -> Lf3
            monitor-exit(r1)
            r12.m()
            if (r0 == 0) goto Lb0
            java.lang.Object r1 = r12.f11907d
            monitor-enter(r1)
            long r9 = r12.f11921r     // Catch: java.lang.Throwable -> Lab
            monitor-exit(r1)
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = r12.f11909f
            ca.r r6 = new ca.r
            r11 = 5
            r7 = r12
            r8 = r13
            r6.<init>(r7, r8, r9, r11)
            r0.execute(r6)
            goto Lb1
        Lab:
            r0 = move-exception
            r7 = r12
            r13 = r0
            monitor-exit(r1)
            throw r13
        Lb0:
            r7 = r12
        Lb1:
            rb.l r13 = r7.f11906c
            android.content.SharedPreferences r0 = r13.f11928a
            java.lang.String r1 = "zombie_check_min_delay_seconds"
            int r0 = r0.getInt(r1, r5)
            r1 = 60
            int r0 = r9.e0.r(r0, r2, r1)
            android.content.SharedPreferences r4 = r13.f11928a
            java.lang.String r6 = "zombie_check_max_delay_seconds"
            r8 = 4
            int r4 = r4.getInt(r6, r8)
            android.content.SharedPreferences r13 = r13.f11928a
            java.lang.String r6 = "zombie_check_min_delay_seconds"
            int r13 = r13.getInt(r6, r5)
            int r13 = r9.e0.r(r13, r2, r1)
            r1 = 120(0x78, float:1.68E-43)
            int r13 = r9.e0.r(r4, r13, r1)
            int r13 = r13 + r3
            jg.a r1 = jg.d.f6902g
            int r13 = r1.c(r0, r13)
            long r0 = (long) r13
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            rb.m r13 = r12.l()
            boolean r13 = r13.f11930b
            if (r13 == 0) goto Lf2
            r12.k(r0)
        Lf2:
            return
        Lf3:
            r0 = move-exception
            r7 = r12
            r13 = r0
        Lf6:
            monitor-exit(r1)
            throw r13
    }

    public final void j() {
            r3 = this;
            r0 = 0
            android.os.PowerManager$WakeLock r1 = r3.f11927x     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L12
            boolean r2 = r1.isHeld()     // Catch: java.lang.Throwable -> L12
            if (r2 == 0) goto Lc
            goto Ld
        Lc:
            r1 = r0
        Ld:
            if (r1 == 0) goto L12
            r1.release()     // Catch: java.lang.Throwable -> L12
        L12:
            r3.f11927x = r0
            return
    }

    public final void k(long r6) {
            r5 = this;
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = r5.f11908e
            boolean r1 = r0.isShutdown()
            if (r1 == 0) goto L9
            return
        L9:
            a1.a r1 = new a1.a
            r2 = 26
            r1.<init>(r5, r2)
            r2 = 0
            int r4 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r4 >= 0) goto L17
            r6 = r2
        L17:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r1, r6, r2)
            return
    }

    public final rb.m l() {
            r17 = this;
            r1 = r17
            java.lang.Object r2 = r1.f11907d
            monitor-enter(r2)
            rb.m r3 = new rb.m     // Catch: java.lang.Throwable -> L3c
            boolean r4 = r1.f11915l     // Catch: java.lang.Throwable -> L3c
            boolean r5 = r1.f11916m     // Catch: java.lang.Throwable -> L3c
            java.lang.String r6 = r1.f11917n     // Catch: java.lang.Throwable -> L3c
            java.lang.String r7 = r1.f11918o     // Catch: java.lang.Throwable -> L3c
            int r8 = r1.f11919p     // Catch: java.lang.Throwable -> L3c
            java.util.ArrayDeque r0 = r1.f11910g     // Catch: java.lang.Throwable -> L3c
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L3c
            rb.h r9 = r1.f11920q     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L1d
            r9 = 1
            goto L1e
        L1d:
            r9 = 0
        L1e:
            int r9 = r9 + r0
            java.util.ArrayList r0 = r1.f11911h     // Catch: java.lang.Throwable -> L3c
            java.util.List r10 = tf.m.P1(r0)     // Catch: java.lang.Throwable -> L3c
            java.util.ArrayDeque r0 = r1.f11912i     // Catch: java.lang.Throwable -> L3c
            java.util.List r11 = tf.m.P1(r0)     // Catch: java.lang.Throwable -> L3c
            boolean r12 = r1.f11922s     // Catch: java.lang.Throwable -> L3c
            int r13 = r1.f11923t     // Catch: java.lang.Throwable -> L3c
            int r14 = r1.f11924u     // Catch: java.lang.Throwable -> L3c
            int r15 = r1.f11925v     // Catch: java.lang.Throwable -> L3c
            int r0 = r1.f11926w     // Catch: java.lang.Throwable -> L3c
            r16 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)
            return r3
        L3c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public final void m() {
            r13 = this;
            java.lang.String r0 = "僵尸粉检测"
            java.lang.String r1 = "hchat_zombie_check"
            android.content.Context r2 = r13.f11905b
            java.lang.String r3 = "已检测 "
            java.lang.String r4 = "notification"
            java.lang.Object r4 = r2.getSystemService(r4)     // Catch: java.lang.Throwable -> L16
            boolean r5 = r4 instanceof android.app.NotificationManager     // Catch: java.lang.Throwable -> L16
            r6 = 0
            if (r5 == 0) goto L19
            android.app.NotificationManager r4 = (android.app.NotificationManager) r4     // Catch: java.lang.Throwable -> L16
            goto L1a
        L16:
            r0 = move-exception
            goto Lb3
        L19:
            r4 = r6
        L1a:
            if (r4 == 0) goto Lc6
            android.app.NotificationChannel r5 = new android.app.NotificationChannel     // Catch: java.lang.Throwable -> L16
            r7 = 2
            r5.<init>(r1, r0, r7)     // Catch: java.lang.Throwable -> L16
            java.lang.String r7 = "显示好友关系检测进度"
            r5.setDescription(r7)     // Catch: java.lang.Throwable -> L16
            r7 = 0
            r5.setShowBadge(r7)     // Catch: java.lang.Throwable -> L16
            r4.createNotificationChannel(r5)     // Catch: java.lang.Throwable -> L16
            rb.m r5 = r13.l()     // Catch: java.lang.Throwable -> L16
            java.util.List r8 = r5.f11935g     // Catch: java.lang.Throwable -> L16
            int r9 = r5.f11933e     // Catch: java.lang.Throwable -> L16
            r10 = 1212373571(0x48435a43, float:200041.05)
            if (r9 > 0) goto L3f
            r4.cancel(r10)     // Catch: java.lang.Throwable -> L16
            return
        L3f:
            android.app.Notification$Builder r11 = new android.app.Notification$Builder     // Catch: java.lang.Throwable -> L16
            r11.<init>(r2, r1)     // Catch: java.lang.Throwable -> L16
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo()     // Catch: java.lang.Throwable -> L16
            int r1 = r1.icon     // Catch: java.lang.Throwable -> L16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L51
            r6 = r2
        L51:
            if (r6 == 0) goto L58
            int r1 = r6.intValue()     // Catch: java.lang.Throwable -> L16
            goto L5b
        L58:
            r1 = 17301628(0x108007c, float:2.4979602E-38)
        L5b:
            android.app.Notification$Builder r1 = r11.setSmallIcon(r1)     // Catch: java.lang.Throwable -> L16
            android.app.Notification$Builder r0 = r1.setContentTitle(r0)     // Catch: java.lang.Throwable -> L16
            int r1 = r8.size()     // Catch: java.lang.Throwable -> L16
            int r2 = r5.a()     // Catch: java.lang.Throwable -> L16
            int r6 = r5.b()     // Catch: java.lang.Throwable -> L16
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L16
            r12.<init>(r3)     // Catch: java.lang.Throwable -> L16
            r12.append(r1)     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = "/"
            r12.append(r1)     // Catch: java.lang.Throwable -> L16
            r12.append(r9)     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = "，异常 "
            r12.append(r1)     // Catch: java.lang.Throwable -> L16
            r12.append(r2)     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = "，失败 "
            r12.append(r1)     // Catch: java.lang.Throwable -> L16
            r12.append(r6)     // Catch: java.lang.Throwable -> L16
            java.lang.String r1 = r12.toString()     // Catch: java.lang.Throwable -> L16
            android.app.Notification$Builder r0 = r0.setContentText(r1)     // Catch: java.lang.Throwable -> L16
            int r1 = r8.size()     // Catch: java.lang.Throwable -> L16
            android.app.Notification$Builder r0 = r0.setProgress(r9, r1, r7)     // Catch: java.lang.Throwable -> L16
            boolean r1 = r5.f11930b     // Catch: java.lang.Throwable -> L16
            android.app.Notification$Builder r0 = r0.setOngoing(r1)     // Catch: java.lang.Throwable -> L16
            r1 = 1
            r0.setOnlyAlertOnce(r1)     // Catch: java.lang.Throwable -> L16
            android.app.Notification r0 = r11.build()     // Catch: java.lang.Throwable -> L16
            r4.notify(r10, r0)     // Catch: java.lang.Throwable -> L16
            sf.n r0 = sf.n.f12433a     // Catch: java.lang.Throwable -> L16
            goto Lb9
        Lb3:
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        Lb9:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto Lc6
            ia.t r1 = r13.f11904a
            java.lang.String r2 = "更新僵尸粉检测通知失败"
            r1.invoke(r2, r0)
        Lc6:
            return
    }
}
