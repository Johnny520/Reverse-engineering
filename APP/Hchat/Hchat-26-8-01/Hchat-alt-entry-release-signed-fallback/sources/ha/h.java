package ha;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final java.lang.Object f5212m = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ab.b f5213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.content.SharedPreferences f5214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p8.o f5215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ScheduledThreadPoolExecutor f5216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Object f5217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.Object f5218f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.Object f5219g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.LinkedHashSet f5220h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f5221i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f5222j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile long f5223k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b9.b f5224l;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            ha.h.f5212m = r0
            return
    }

    public h(r8.g r3, ab.b r4) {
            r2 = this;
            r3.getClass()
            r2.<init>()
            r2.f5213a = r4
            android.content.Context r0 = r3.f11620a
            java.lang.String r1 = "Hchat_moments_auto_forward_config"
            android.content.SharedPreferences r0 = ub.b.c(r0, r1)
            r2.f5214b = r0
            p8.o r1 = new p8.o
            r1.<init>(r3, r4)
            r2.f5215c = r1
            java.util.concurrent.ScheduledThreadPoolExecutor r3 = new java.util.concurrent.ScheduledThreadPoolExecutor
            c9.q r4 = new c9.q
            r1 = 11
            r4.<init>(r1)
            r1 = 1
            r3.<init>(r1, r4)
            r3.setRemoveOnCancelPolicy(r1)
            r2.f5216d = r3
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r2.f5217e = r3
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r2.f5218f = r3
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r2.f5219g = r3
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            r2.f5220h = r3
            java.util.concurrent.ConcurrentHashMap r3 = new java.util.concurrent.ConcurrentHashMap
            r3.<init>()
            r2.f5221i = r3
            java.lang.String r3 = "enable"
            r4 = 0
            boolean r3 = r0.getBoolean(r3, r4)
            r2.f5222j = r3
            b9.b r3 = new b9.b
            r4 = 3
            r3.<init>(r2, r4)
            r2.f5224l = r3
            return
    }

    public static boolean m(ha.t r3, java.lang.String r4, p8.c r5) {
            p8.d0 r0 = h.Hchat.hooks.api.core.WeChatApis.snsApi()
            if (r0 == 0) goto L6e
            int r3 = r3.ordinal()
            java.lang.String r1 = ""
            if (r3 == 0) goto L69
            r2 = 1
            if (r3 == r2) goto L60
            r2 = 2
            if (r3 == r2) goto L59
            r1 = 3
            if (r3 == r1) goto L20
            r4 = 4
            if (r3 != r4) goto L1b
            goto L6e
        L1b:
            okio.a.k()
            r3 = 0
            return r3
        L20:
            java.util.List r3 = r5.f10317b
            java.lang.Object r3 = tf.m.I1(r3)
            p8.d r3 = (p8.d) r3
            if (r3 == 0) goto L6e
            boolean r5 = r3.a()
            if (r5 != 0) goto L31
            goto L6e
        L31:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.String r1 = "content"
            org.json.JSONObject r4 = r5.put(r1, r4)
            java.lang.String r5 = "imagePath"
            java.lang.String r1 = r3.f10322a
            org.json.JSONObject r4 = r4.put(r5, r1)
            java.lang.String r5 = "videoPath"
            java.lang.String r3 = r3.f10323b
            org.json.JSONObject r3 = r4.put(r5, r3)
            java.lang.String r4 = "coverTimeMs"
            r1 = 0
            org.json.JSONObject r3 = r3.put(r4, r1)
            boolean r3 = r0.w(r3)
            return r3
        L59:
            java.lang.String r3 = r5.f10318c
            boolean r3 = r0.y(r4, r3, r1, r1)
            return r3
        L60:
            java.util.ArrayList r3 = r5.b()
            boolean r3 = r0.x(r4, r3, r1, r1)
            return r3
        L69:
            boolean r3 = r0.u(r4, r1, r1)
            return r3
        L6e:
            r3 = 0
            return r3
    }

    public final void a() {
            r6 = this;
            java.lang.Object r0 = r6.f5218f
            monitor-enter(r0)
            java.util.LinkedHashSet r1 = r6.f5220h     // Catch: java.lang.Throwable -> L33
            r1.clear()     // Catch: java.lang.Throwable -> L33
            monitor-exit(r0)
            android.content.SharedPreferences r0 = r6.f5214b
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "enabled_at_seconds"
            long r2 = java.lang.System.currentTimeMillis()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 / r4
            android.content.SharedPreferences$Editor r0 = r0.putLong(r1, r2)
            java.lang.String r1 = "handled_ids"
            java.lang.String r2 = "[]"
            android.content.SharedPreferences$Editor r0 = r0.putString(r1, r2)
            boolean r0 = r0.commit()
            if (r0 != 0) goto L32
            ab.b r0 = r6.f5213a
            java.lang.String r1 = "初始化朋友圈自动转发启用状态失败"
            r2 = 0
            r0.invoke(r1, r2)
        L32:
            return
        L33:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public final java.lang.String b(java.lang.String r5) {
            r4 = this;
            i8.a r0 = h.Hchat.hooks.api.core.WeChatApis.contact()     // Catch: java.lang.Throwable -> L23
            r0.getClass()     // Catch: java.lang.Throwable -> L23
            g8.i r0 = h.Hchat.hooks.api.core.WeChatApis.e()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L25
            h.Hchat.hooks.api.model.WeChatContact r0 = r0.n(r5)     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L25
            java.lang.String r0 = r0.displayName()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L25
            boolean r1 = og.m.t0(r0)     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L20
            r0 = r5
        L20:
            if (r0 == 0) goto L25
            goto L2d
        L23:
            r0 = move-exception
            goto L27
        L25:
            r0 = r5
            goto L2d
        L27:
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L2d:
            java.lang.Throwable r1 = sf.g.b(r0)
            if (r1 == 0) goto L46
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "读取朋友圈发布者名称失败: "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            ab.b r3 = r4.f5213a
            r3.invoke(r2, r1)
        L46:
            boolean r1 = r0 instanceof sf.f
            if (r1 == 0) goto L4b
            goto L4c
        L4b:
            r5 = r0
        L4c:
            java.lang.String r5 = (java.lang.String) r5
            return r5
    }

    public final void c(ha.g r14) {
            r13 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r14.f5203e
            long r1 = r14.f5202d
            ha.c0 r3 = r14.f5199a
            java.util.concurrent.ConcurrentHashMap r4 = r13.f5221i
            java.lang.String r5 = "已提交到微信发布队列 "
            r6 = 0
            boolean r7 = r13.h(r14)     // Catch: java.lang.Throwable -> L34 java.lang.InterruptedException -> L36
            p8.v r8 = r14.f5200b
            ha.t r9 = r14.f5201c
            java.lang.String r10 = r3.f5168a
            if (r7 != 0) goto L1b
            r4.remove(r10, r14)
            return
        L1b:
            java.lang.String r7 = r13.o(r3, r8, r9)     // Catch: java.lang.Throwable -> L34 java.lang.InterruptedException -> L36
            r11 = 0
            if (r7 == 0) goto L3f
            java.lang.String r5 = "暂时无法确认当前账号"
            boolean r5 = r7.equals(r5)     // Catch: java.lang.Throwable -> L34 java.lang.InterruptedException -> L36
            if (r5 == 0) goto L38
            boolean r0 = r13.f(r14, r7, r11)     // Catch: java.lang.Throwable -> L34 java.lang.InterruptedException -> L36
            if (r0 != 0) goto Lb0
            r4.remove(r10, r14)
            return
        L34:
            r0 = move-exception
            goto L8b
        L36:
            r5 = move-exception
            goto L9b
        L38:
            r13.d(r3, r1, r7)     // Catch: java.lang.Throwable -> L34 java.lang.InterruptedException -> L36
            r4.remove(r10, r14)
            return
        L3f:
            java.lang.String r7 = r13.e(r3, r8, r9)     // Catch: java.lang.Throwable -> L34 java.lang.InterruptedException -> L36
            p8.o r12 = r13.f5215c     // Catch: java.lang.Throwable -> L34 java.lang.InterruptedException -> L36
            p8.c r8 = r12.q(r8, r0)     // Catch: java.lang.Throwable -> L34 java.lang.InterruptedException -> L36
            boolean r12 = r13.h(r14)     // Catch: java.lang.Throwable -> L34 java.lang.InterruptedException -> L36
            if (r12 != 0) goto L53
            r4.remove(r10, r14)
            return
        L53:
            boolean r7 = m(r9, r7, r8)     // Catch: java.lang.Throwable -> L34 java.lang.InterruptedException -> L36
            if (r7 == 0) goto L7f
            r13.n()     // Catch: java.lang.Throwable -> L34 java.lang.InterruptedException -> L36
            r13.j(r1, r10)     // Catch: java.lang.Throwable -> L34 java.lang.InterruptedException -> L36
            java.lang.String r7 = r3.f5170c     // Catch: java.lang.Throwable -> L34 java.lang.InterruptedException -> L36
            java.lang.String r7 = r13.b(r7)     // Catch: java.lang.Throwable -> L34 java.lang.InterruptedException -> L36
            java.lang.String r8 = r9.f5285g     // Catch: java.lang.Throwable -> L34 java.lang.InterruptedException -> L36
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L34 java.lang.InterruptedException -> L36
            r9.<init>(r5)     // Catch: java.lang.Throwable -> L34 java.lang.InterruptedException -> L36
            r9.append(r7)     // Catch: java.lang.Throwable -> L34 java.lang.InterruptedException -> L36
            java.lang.String r5 = " · "
            r9.append(r5)     // Catch: java.lang.Throwable -> L34 java.lang.InterruptedException -> L36
            r9.append(r8)     // Catch: java.lang.Throwable -> L34 java.lang.InterruptedException -> L36
            java.lang.String r5 = r9.toString()     // Catch: java.lang.Throwable -> L34 java.lang.InterruptedException -> L36
            r13.i(r5)     // Catch: java.lang.Throwable -> L34 java.lang.InterruptedException -> L36
            goto L85
        L7f:
            java.lang.String r5 = "静默发布失败"
            boolean r6 = r13.f(r14, r5, r11)     // Catch: java.lang.Throwable -> L34 java.lang.InterruptedException -> L36
        L85:
            if (r6 != 0) goto Lb0
            r4.remove(r10, r14)
            return
        L8b:
            java.lang.String r1 = "准备或发布朋友圈失败"
            boolean r0 = r13.f(r14, r1, r0)     // Catch: java.lang.Throwable -> L99
            if (r0 != 0) goto Lb0
        L93:
            java.lang.String r0 = r3.f5168a
            r4.remove(r0, r14)
            goto Lb0
        L99:
            r0 = move-exception
            goto Lb1
        L9b:
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L99
            if (r0 != 0) goto Lad
            boolean r0 = r13.g(r1)     // Catch: java.lang.Throwable -> L99
            if (r0 == 0) goto Lad
            java.lang.String r0 = "媒体准备被中断"
            boolean r6 = r13.f(r14, r0, r5)     // Catch: java.lang.Throwable -> L99
        Lad:
            if (r6 != 0) goto Lb0
            goto L93
        Lb0:
            return
        Lb1:
            java.lang.String r1 = r3.f5168a
            r4.remove(r1, r14)
            throw r0
    }

    public final void d(ha.c0 r2, long r3, java.lang.String r5) {
            r1 = this;
            java.lang.String r0 = r2.f5168a
            boolean r3 = r1.j(r3, r0)
            if (r3 == 0) goto L27
            java.lang.String r2 = r2.f5170c
            java.lang.String r2 = r1.b(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "跳过 "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = "："
            r3.append(r2)
            r3.append(r5)
            java.lang.String r2 = r3.toString()
            r1.i(r2)
        L27:
            return
    }

    public final java.lang.String e(ha.c0 r7, p8.v r8, ha.t r9) {
            r6 = this;
            java.lang.String r0 = r7.f5170c
            android.content.SharedPreferences r1 = r6.f5214b
            java.lang.String r2 = "content_template"
            java.lang.String r3 = "%content%"
            java.lang.String r1 = r1.getString(r2, r3)
            if (r1 != 0) goto L10
            java.lang.String r1 = ""
        L10:
            java.lang.String r2 = "%sender%"
            java.lang.String r4 = r6.b(r0)
            r5 = 0
            java.lang.String r1 = og.t.a0(r1, r2, r4, r5)
            java.lang.String r2 = "%wxid%"
            java.lang.String r0 = og.t.a0(r1, r2, r0, r5)
            java.lang.String r1 = "%type%"
            java.lang.String r9 = r9.f5285g
            java.lang.String r9 = og.t.a0(r0, r1, r9, r5)
            java.lang.String r8 = r8.f10427b
            java.lang.String r8 = og.t.a0(r9, r3, r8, r5)
            java.lang.String r9 = "%snsid%"
            java.lang.String r7 = r7.f5168a
            java.lang.String r7 = og.t.a0(r8, r9, r7, r5)
            java.lang.CharSequence r7 = og.m.R0(r7)
            java.lang.String r7 = r7.toString()
            return r7
    }

    public final boolean f(ha.g r7, java.lang.String r8, java.lang.Throwable r9) {
            r6 = this;
            ab.b r0 = r6.f5213a
            ha.c0 r1 = r7.f5199a
            java.lang.String r1 = r1.f5168a
            int r2 = r7.f5204f
            r3 = 1
            int r2 = r2 + r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r8)
            java.lang.String r8 = ": snsId="
            r4.append(r8)
            r4.append(r1)
            java.lang.String r8 = " attempt="
            r4.append(r8)
            r4.append(r2)
            java.lang.String r8 = r4.toString()
            r0.invoke(r8, r9)
            int r8 = r7.f5204f
            r9 = 0
            java.lang.String r0 = "转发失败 "
            if (r8 != 0) goto La6
            boolean r8 = r6.h(r7)
            if (r8 == 0) goto La6
            r7.f5204f = r3
            java.util.concurrent.ScheduledThreadPoolExecutor r8 = r6.f5216d     // Catch: java.lang.Throwable -> L49
            ha.f r1 = new ha.f     // Catch: java.lang.Throwable -> L49
            r2 = 0
            r1.<init>(r6, r7, r2)     // Catch: java.lang.Throwable -> L49
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L49
            r4 = 300(0x12c, double:1.48E-321)
            java.util.concurrent.ScheduledFuture r8 = r8.schedule(r1, r4, r2)     // Catch: java.lang.Throwable -> L49
            goto L50
        L49:
            r8 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r8)
            r8 = r1
        L50:
            java.lang.Throwable r1 = sf.g.b(r8)
            if (r1 == 0) goto L65
            ab.b r2 = r6.f5213a
            ha.c0 r4 = r7.f5199a
            java.lang.String r4 = r4.f5168a
            java.lang.String r5 = "调度朋友圈自动转发重试失败: snsId="
            java.lang.String r4 = r5.concat(r4)
            r2.invoke(r4, r1)
        L65:
            boolean r1 = r8 instanceof sf.f
            if (r1 == 0) goto L6a
            r8 = 0
        L6a:
            java.util.concurrent.ScheduledFuture r8 = (java.util.concurrent.ScheduledFuture) r8
            if (r8 == 0) goto La6
            r7.f5205g = r8
            java.util.concurrent.atomic.AtomicBoolean r1 = r7.f5203e
            boolean r1 = r1.get()
            if (r1 != 0) goto La2
            java.util.concurrent.ConcurrentHashMap r1 = r6.f5221i
            ha.c0 r2 = r7.f5199a
            java.lang.String r2 = r2.f5168a
            java.lang.Object r1 = r1.get(r2)
            if (r1 == r7) goto L85
            goto La2
        L85:
            ha.c0 r7 = r7.f5199a
            java.lang.String r7 = r7.f5170c
            java.lang.String r7 = r6.b(r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r0)
            r8.append(r7)
            java.lang.String r7 = "，300秒后重试一次"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r6.i(r7)
            return r3
        La2:
            r8.cancel(r3)
            return r9
        La6:
            ha.c0 r8 = r7.f5199a
            java.lang.String r8 = r8.f5168a
            long r1 = r7.f5202d
            r6.j(r1, r8)
            ha.c0 r7 = r7.f5199a
            java.lang.String r7 = r7.f5170c
            java.lang.String r7 = r6.b(r7)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r0)
            r8.append(r7)
            java.lang.String r7 = "，已停止重试"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r6.i(r7)
            return r9
    }

    public final boolean g(long r5) {
            r4 = this;
            boolean r0 = r4.f5222j
            r1 = 0
            if (r0 == 0) goto L17
            long r2 = r4.f5223k
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 != 0) goto L17
            android.content.SharedPreferences r5 = r4.f5214b
            java.lang.String r6 = "enable"
            boolean r5 = r5.getBoolean(r6, r1)
            if (r5 == 0) goto L17
            r5 = 1
            return r5
        L17:
            return r1
    }

    public final boolean h(ha.g r3) {
            r2 = this;
            ha.c0 r0 = r3.f5199a
            java.lang.String r0 = r0.f5168a
            java.util.concurrent.ConcurrentHashMap r1 = r2.f5221i
            java.lang.Object r0 = r1.get(r0)
            if (r0 != r3) goto L1e
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f5203e
            boolean r0 = r0.get()
            if (r0 != 0) goto L1e
            long r0 = r3.f5202d
            boolean r3 = r2.g(r0)
            if (r3 == 0) goto L1e
            r3 = 1
            return r3
        L1e:
            r3 = 0
            return r3
    }

    public final void i(java.lang.String r9) {
            r8 = this;
            android.content.SharedPreferences r0 = r8.f5214b
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
            java.lang.Object r1 = ha.h.f5212m
            monitor-enter(r1)
            java.util.List r9 = a.a.x0(r9)     // Catch: java.lang.Throwable -> L3a
            android.content.SharedPreferences r0 = r8.f5214b     // Catch: java.lang.Throwable -> L3a
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
            r3 = 5
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
            android.content.SharedPreferences r0 = r8.f5214b     // Catch: java.lang.Throwable -> L3a
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

    public final boolean j(long r2, java.lang.String r4) {
            r1 = this;
            java.lang.Object r0 = r1.f5217e
            monitor-enter(r0)
            boolean r2 = r1.g(r2)     // Catch: java.lang.Throwable -> L11
            if (r2 != 0) goto Lb
            r2 = 0
            goto Lf
        Lb:
            boolean r2 = r1.k(r4)     // Catch: java.lang.Throwable -> L11
        Lf:
            monitor-exit(r0)
            return r2
        L11:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    public final boolean k(java.lang.String r3) {
            r2 = this;
            java.lang.Object r0 = r2.f5218f
            monitor-enter(r0)
            java.util.LinkedHashSet r1 = r2.f5220h     // Catch: java.lang.Throwable -> L4c
            boolean r3 = r1.add(r3)     // Catch: java.lang.Throwable -> L4c
            if (r3 != 0) goto Le
            monitor-exit(r0)
            r3 = 0
            return r3
        Le:
            java.util.LinkedHashSet r3 = r2.f5220h     // Catch: java.lang.Throwable -> L4c
            java.util.List r3 = tf.m.P1(r3)     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r0)
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L1e:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r3.next()
            r0.put(r1)
            goto L1e
        L2c:
            android.content.SharedPreferences r3 = r2.f5214b
            android.content.SharedPreferences$Editor r3 = r3.edit()
            java.lang.String r1 = "handled_ids"
            java.lang.String r0 = r0.toString()
            android.content.SharedPreferences$Editor r3 = r3.putString(r1, r0)
            boolean r3 = r3.commit()
            if (r3 != 0) goto L4a
            ab.b r3 = r2.f5213a
            java.lang.String r0 = "保存朋友圈自动转发去重记录失败"
            r1 = 0
            r3.invoke(r0, r1)
        L4a:
            r3 = 1
            return r3
        L4c:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    public final long l() {
            r7 = this;
            android.content.SharedPreferences r0 = r7.f5214b
            java.lang.String r1 = "delay_mode"
            r2 = 0
            int r1 = r0.getInt(r1, r2)
            if (r1 != 0) goto L17
            java.lang.String r1 = "fixed_delay_seconds"
            int r0 = r0.getInt(r1, r2)
            if (r0 >= 0) goto L14
            goto L15
        L14:
            r2 = r0
        L15:
            long r0 = (long) r2
            return r0
        L17:
            java.lang.String r1 = "random_min_seconds"
            r3 = 60
            int r1 = r0.getInt(r1, r3)
            if (r1 >= 0) goto L22
            goto L23
        L22:
            r2 = r1
        L23:
            long r1 = (long) r2
            java.lang.String r3 = "random_max_seconds"
            r4 = 300(0x12c, float:4.2E-43)
            int r0 = r0.getInt(r3, r4)
            long r3 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L32
            r3 = r1
        L32:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L37
            return r1
        L37:
            r5 = 1
            long r3 = r3 + r5
            jg.a r0 = jg.d.f6902g
            long r0 = r0.e(r1, r3)
            return r0
    }

    public final void n() {
            r5 = this;
            java.lang.Object r0 = r5.f5219g
            monitor-enter(r0)
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = "yyyy-MM-dd"
            java.util.Locale r3 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L36
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L36
            java.util.Date r2 = new java.util.Date     // Catch: java.lang.Throwable -> L36
            r2.<init>()     // Catch: java.lang.Throwable -> L36
            java.lang.String r1 = r1.format(r2)     // Catch: java.lang.Throwable -> L36
            r1.getClass()     // Catch: java.lang.Throwable -> L36
            android.content.SharedPreferences r2 = r5.f5214b     // Catch: java.lang.Throwable -> L36
            java.lang.String r3 = "daily_date"
            java.lang.String r4 = ""
            java.lang.String r2 = r2.getString(r3, r4)     // Catch: java.lang.Throwable -> L36
            boolean r2 = gg.l.a(r2, r1)     // Catch: java.lang.Throwable -> L36
            r3 = 0
            if (r2 == 0) goto L38
            android.content.SharedPreferences r2 = r5.f5214b     // Catch: java.lang.Throwable -> L36
            java.lang.String r4 = "daily_count"
            int r2 = r2.getInt(r4, r3)     // Catch: java.lang.Throwable -> L36
            if (r2 >= 0) goto L34
            goto L38
        L34:
            r3 = r2
            goto L38
        L36:
            r1 = move-exception
            goto L5c
        L38:
            android.content.SharedPreferences r2 = r5.f5214b     // Catch: java.lang.Throwable -> L36
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch: java.lang.Throwable -> L36
            java.lang.String r4 = "daily_date"
            android.content.SharedPreferences$Editor r1 = r2.putString(r4, r1)     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = "daily_count"
            int r3 = r3 + 1
            android.content.SharedPreferences$Editor r1 = r1.putInt(r2, r3)     // Catch: java.lang.Throwable -> L36
            boolean r1 = r1.commit()     // Catch: java.lang.Throwable -> L36
            if (r1 != 0) goto L5a
            ab.b r1 = r5.f5213a     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = "保存朋友圈自动转发每日计数失败"
            r3 = 0
            r1.invoke(r2, r3)     // Catch: java.lang.Throwable -> L36
        L5a:
            monitor-exit(r0)
            return
        L5c:
            monitor-exit(r0)
            throw r1
    }

    public final java.lang.String o(ha.c0 r9, p8.v r10, ha.t r11) {
            r8 = this;
            android.content.SharedPreferences r0 = r8.f5214b
            java.lang.String r1 = "enable"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 != 0) goto Le
            java.lang.String r9 = "功能已关闭"
            return r9
        Le:
            java.lang.Object r0 = r9.f5174g
            java.lang.String r1 = "isAd"
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L23
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invokeMethod(r0, r1, r3)     // Catch: java.lang.Throwable -> L23
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L23
            boolean r0 = gg.l.a(r0, r1)     // Catch: java.lang.Throwable -> L23
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L23
            goto L2a
        L23:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L2a:
            java.lang.Throwable r1 = sf.g.b(r0)
            if (r1 == 0) goto L37
            ab.b r3 = r8.f5213a
            java.lang.String r4 = "判断朋友圈广告状态失败"
            r3.invoke(r4, r1)
        L37:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r3 = r0 instanceof sf.f
            if (r3 == 0) goto L3e
            r0 = r1
        L3e:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L49
            java.lang.String r9 = "广告内容"
            return r9
        L49:
            java.lang.String r0 = r8.q(r9)
            if (r0 == 0) goto L50
            return r0
        L50:
            android.content.SharedPreferences r0 = r8.f5214b
            java.lang.String r1 = "enabled_at_seconds"
            r3 = 0
            long r0 = r0.getLong(r1, r3)
            long r5 = r9.f5171d
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 > 0) goto L63
            java.lang.String r9 = "无法确认发布时间"
            return r9
        L63:
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 <= 0) goto L243
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 >= 0) goto L6d
            goto L243
        L6d:
            ha.t r0 = ha.t.f5283l
            if (r11 != r0) goto L74
            java.lang.String r9 = "未知或卡片类型"
            return r9
        L74:
            int r0 = r11.ordinal()
            r1 = 1
            if (r0 == 0) goto Le3
            if (r0 == r1) goto Lcb
            r9 = 2
            if (r0 == r9) goto Lb3
            r9 = 3
            if (r0 == r9) goto L8e
            r9 = 4
            if (r0 != r9) goto L89
            java.lang.String r9 = "未知或卡片类型"
            return r9
        L89:
            okio.a.k()
            r9 = 0
            return r9
        L8e:
            java.util.ArrayList r9 = r10.f10429d
            int r9 = r9.size()
            if (r9 != r1) goto Lb0
            java.util.ArrayList r9 = r10.f10429d
            java.lang.Object r9 = tf.m.H1(r9)
            p8.s r9 = (p8.s) r9
            p8.s r9 = r9.f10417f
            if (r9 != 0) goto La3
            goto Lb0
        La3:
            android.content.SharedPreferences r9 = r8.f5214b
            java.lang.String r11 = "allow_live_photo"
            boolean r9 = r9.getBoolean(r11, r1)
            if (r9 != 0) goto L108
            java.lang.String r9 = "已过滤实况类型"
            return r9
        Lb0:
            java.lang.String r9 = "多张或混合实况不支持自动转发"
            return r9
        Lb3:
            java.util.ArrayList r9 = r10.f10429d
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto Lbe
            java.lang.String r9 = "未找到朋友圈视频"
            return r9
        Lbe:
            android.content.SharedPreferences r9 = r8.f5214b
            java.lang.String r11 = "allow_video"
            boolean r9 = r9.getBoolean(r11, r1)
            if (r9 != 0) goto L108
            java.lang.String r9 = "已过滤视频类型"
            return r9
        Lcb:
            java.util.ArrayList r9 = r10.f10429d
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto Ld6
            java.lang.String r9 = "未找到朋友圈图片"
            return r9
        Ld6:
            android.content.SharedPreferences r9 = r8.f5214b
            java.lang.String r11 = "allow_image"
            boolean r9 = r9.getBoolean(r11, r1)
            if (r9 != 0) goto L108
            java.lang.String r9 = "已过滤图片类型"
            return r9
        Le3:
            java.util.ArrayList r0 = r10.f10429d
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lee
            java.lang.String r9 = "文字类型包含未知媒体"
            return r9
        Lee:
            android.content.SharedPreferences r0 = r8.f5214b
            java.lang.String r3 = "allow_text"
            boolean r0 = r0.getBoolean(r3, r1)
            if (r0 != 0) goto Lfb
            java.lang.String r9 = "已过滤文字类型"
            return r9
        Lfb:
            java.lang.String r9 = r8.e(r9, r10, r11)
            boolean r9 = og.m.t0(r9)
            if (r9 == 0) goto L108
            java.lang.String r9 = "转发文字为空"
            return r9
        L108:
            android.content.SharedPreferences r9 = r8.f5214b
            java.lang.String r11 = "daily_limit"
            r0 = 20
            int r9 = r9.getInt(r11, r0)
            if (r9 >= 0) goto L115
            r9 = r2
        L115:
            java.lang.String r10 = r10.f10427b
            java.util.Locale r11 = java.util.Locale.ROOT
            java.lang.String r10 = j8.b.l(r11, r10, r11)
            android.content.SharedPreferences r11 = r8.f5214b
            r11.getClass()
            java.lang.String r0 = "include_keywords_enable"
            java.lang.String r3 = "include_keywords"
            java.lang.String r4 = ""
            boolean r5 = r11.contains(r0)
            if (r5 == 0) goto L133
            boolean r11 = r11.getBoolean(r0, r2)
            goto L140
        L133:
            java.lang.String r11 = r11.getString(r3, r4)
            if (r11 != 0) goto L13a
            goto L13b
        L13a:
            r4 = r11
        L13b:
            boolean r11 = og.m.t0(r4)
            r11 = r11 ^ r1
        L140:
            if (r11 == 0) goto L183
            android.content.SharedPreferences r11 = r8.f5214b
            java.lang.String r0 = "include_keywords"
            java.lang.String r3 = ""
            java.lang.String r11 = r11.getString(r0, r3)
            java.util.Set r11 = r9.e0.T(r11)
            r0 = r11
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L183
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            boolean r0 = r11 instanceof java.util.Collection
            if (r0 == 0) goto L169
            r0 = r11
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L169
            goto L180
        L169:
            java.util.Iterator r11 = r11.iterator()
        L16d:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L180
            java.lang.Object r0 = r11.next()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = og.m.h0(r10, r0, r2)
            if (r0 == 0) goto L16d
            goto L183
        L180:
            java.lang.String r9 = "未命中包含关键词"
            return r9
        L183:
            android.content.SharedPreferences r11 = r8.f5214b
            r11.getClass()
            java.lang.String r0 = "exclude_keywords_enable"
            java.lang.String r3 = "exclude_keywords"
            java.lang.String r4 = ""
            boolean r5 = r11.contains(r0)
            if (r5 == 0) goto L199
            boolean r11 = r11.getBoolean(r0, r2)
            goto L1a6
        L199:
            java.lang.String r11 = r11.getString(r3, r4)
            if (r11 != 0) goto L1a0
            goto L1a1
        L1a0:
            r4 = r11
        L1a1:
            boolean r11 = og.m.t0(r4)
            r11 = r11 ^ r1
        L1a6:
            r0 = 0
            if (r11 == 0) goto L1e5
            boolean r11 = og.m.t0(r10)
            if (r11 != 0) goto L1e5
            android.content.SharedPreferences r11 = r8.f5214b
            java.lang.String r1 = "exclude_keywords"
            java.lang.String r3 = ""
            java.lang.String r11 = r11.getString(r1, r3)
            java.util.Set r11 = r9.e0.T(r11)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
        L1c3:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L1d7
            java.lang.Object r1 = r11.next()
            r3 = r1
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = og.m.h0(r10, r3, r2)
            if (r3 == 0) goto L1c3
            goto L1d8
        L1d7:
            r1 = r0
        L1d8:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L1e5
            java.lang.String r9 = "命中排除关键词“"
            java.lang.String r10 = "”"
            java.lang.String r9 = eh.a.n(r9, r1, r10)
            return r9
        L1e5:
            if (r9 <= 0) goto L242
            java.lang.Object r10 = r8.f5219g
            monitor-enter(r10)
            java.text.SimpleDateFormat r11 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L23f
            java.lang.String r1 = "yyyy-MM-dd"
            java.util.Locale r3 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L23f
            r11.<init>(r1, r3)     // Catch: java.lang.Throwable -> L23f
            java.util.Date r1 = new java.util.Date     // Catch: java.lang.Throwable -> L23f
            r1.<init>()     // Catch: java.lang.Throwable -> L23f
            java.lang.String r11 = r11.format(r1)     // Catch: java.lang.Throwable -> L23f
            r11.getClass()     // Catch: java.lang.Throwable -> L23f
            android.content.SharedPreferences r1 = r8.f5214b     // Catch: java.lang.Throwable -> L23f
            java.lang.String r3 = "daily_date"
            java.lang.String r4 = ""
            java.lang.String r1 = r1.getString(r3, r4)     // Catch: java.lang.Throwable -> L23f
            boolean r1 = gg.l.a(r1, r11)     // Catch: java.lang.Throwable -> L23f
            android.content.SharedPreferences r3 = r8.f5214b
            if (r1 != 0) goto L22f
            android.content.SharedPreferences$Editor r1 = r3.edit()     // Catch: java.lang.Throwable -> L23f
            java.lang.String r3 = "daily_date"
            android.content.SharedPreferences$Editor r11 = r1.putString(r3, r11)     // Catch: java.lang.Throwable -> L23f
            java.lang.String r1 = "daily_count"
            android.content.SharedPreferences$Editor r11 = r11.putInt(r1, r2)     // Catch: java.lang.Throwable -> L23f
            boolean r11 = r11.commit()     // Catch: java.lang.Throwable -> L23f
            if (r11 != 0) goto L239
            ab.b r11 = r8.f5213a     // Catch: java.lang.Throwable -> L23f
            java.lang.String r1 = "重置朋友圈自动转发每日计数失败"
            r11.invoke(r1, r0)     // Catch: java.lang.Throwable -> L23f
            goto L239
        L22f:
            java.lang.String r11 = "daily_count"
            int r11 = r3.getInt(r11, r2)     // Catch: java.lang.Throwable -> L23f
            if (r11 >= 0) goto L238
            goto L239
        L238:
            r2 = r11
        L239:
            monitor-exit(r10)
            if (r2 < r9) goto L242
            java.lang.String r9 = "已达到今日转发上限"
            return r9
        L23f:
            r9 = move-exception
            monitor-exit(r10)
            throw r9
        L242:
            return r0
        L243:
            java.lang.String r9 = "早于本次开启时间"
            return r9
    }

    public final void p(ha.c0 r9, p8.v r10, ha.t r11, long r12, long r14) {
            r8 = this;
            java.lang.String r1 = "调度朋友圈自动转发失败: snsId="
            ha.g r2 = new ha.g
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r2.<init>(r3, r4, r5, r6)
            java.lang.Object r9 = r8.f5217e
            monitor-enter(r9)
            boolean r10 = r8.g(r6)     // Catch: java.lang.Throwable -> L60
            if (r10 == 0) goto Lad
            java.lang.String r10 = r3.f5168a     // Catch: java.lang.Throwable -> L60
            java.lang.Object r11 = r8.f5218f     // Catch: java.lang.Throwable -> L60
            monitor-enter(r11)     // Catch: java.lang.Throwable -> L60
            java.util.LinkedHashSet r12 = r8.f5220h     // Catch: java.lang.Throwable -> La9
            boolean r10 = r12.contains(r10)     // Catch: java.lang.Throwable -> La9
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L60
            if (r10 == 0) goto L24
            goto Lad
        L24:
            java.util.concurrent.ConcurrentHashMap r10 = r8.f5221i     // Catch: java.lang.Throwable -> L60
            java.lang.String r11 = r3.f5168a     // Catch: java.lang.Throwable -> L60
            java.lang.Object r10 = r10.putIfAbsent(r11, r2)     // Catch: java.lang.Throwable -> L60
            if (r10 == 0) goto L30
            monitor-exit(r9)
            return
        L30:
            java.util.concurrent.ScheduledThreadPoolExecutor r10 = r8.f5216d     // Catch: java.lang.Throwable -> L3f
            ha.f r11 = new ha.f     // Catch: java.lang.Throwable -> L3f
            r12 = 1
            r11.<init>(r8, r2, r12)     // Catch: java.lang.Throwable -> L3f
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L3f
            java.util.concurrent.ScheduledFuture r10 = r10.schedule(r11, r14, r12)     // Catch: java.lang.Throwable -> L3f
            goto L47
        L3f:
            r0 = move-exception
            r10 = r0
            sf.f r11 = new sf.f     // Catch: java.lang.Throwable -> L60
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L60
            r10 = r11
        L47:
            java.lang.Throwable r11 = sf.g.b(r10)     // Catch: java.lang.Throwable -> L60
            if (r11 == 0) goto L63
            java.util.concurrent.ConcurrentHashMap r12 = r8.f5221i     // Catch: java.lang.Throwable -> L60
            java.lang.String r13 = r3.f5168a     // Catch: java.lang.Throwable -> L60
            r12.remove(r13, r2)     // Catch: java.lang.Throwable -> L60
            ab.b r12 = r8.f5213a     // Catch: java.lang.Throwable -> L60
            java.lang.String r13 = r3.f5168a     // Catch: java.lang.Throwable -> L60
            java.lang.String r13 = r1.concat(r13)     // Catch: java.lang.Throwable -> L60
            r12.invoke(r13, r11)     // Catch: java.lang.Throwable -> L60
            goto L63
        L60:
            r0 = move-exception
            r10 = r0
            goto Laf
        L63:
            boolean r11 = r10 instanceof sf.f     // Catch: java.lang.Throwable -> L60
            if (r11 == 0) goto L68
            r10 = 0
        L68:
            java.util.concurrent.ScheduledFuture r10 = (java.util.concurrent.ScheduledFuture) r10     // Catch: java.lang.Throwable -> L60
            if (r10 == 0) goto La7
            r2.f5205g = r10     // Catch: java.lang.Throwable -> L60
            java.util.concurrent.atomic.AtomicBoolean r11 = r2.f5203e     // Catch: java.lang.Throwable -> L60
            boolean r11 = r11.get()     // Catch: java.lang.Throwable -> L60
            if (r11 != 0) goto L80
            java.util.concurrent.ConcurrentHashMap r11 = r8.f5221i     // Catch: java.lang.Throwable -> L60
            java.lang.String r12 = r3.f5168a     // Catch: java.lang.Throwable -> L60
            java.lang.Object r11 = r11.get(r12)     // Catch: java.lang.Throwable -> L60
            if (r11 == r2) goto L84
        L80:
            r11 = 1
            r10.cancel(r11)     // Catch: java.lang.Throwable -> L60
        L84:
            monitor-exit(r9)
            java.lang.String r9 = r3.f5170c
            java.lang.String r9 = r8.b(r9)
            java.lang.String r10 = r5.f5285g
            java.lang.String r11 = "已捕捉 "
            java.lang.String r12 = " 的"
            java.lang.String r13 = "朋友圈，"
            java.lang.StringBuilder r9 = bc.e.p(r11, r9, r12, r10, r13)
            r9.append(r14)
            java.lang.String r10 = "秒后转发"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.i(r9)
            return
        La7:
            monitor-exit(r9)
            return
        La9:
            r0 = move-exception
            r10 = r0
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L60
            throw r10     // Catch: java.lang.Throwable -> L60
        Lad:
            monitor-exit(r9)
            return
        Laf:
            monitor-exit(r9)
            throw r10
    }

    public final java.lang.String q(ha.c0 r7) {
            r6 = this;
            java.lang.String r7 = r7.f5170c
            android.content.SharedPreferences r0 = r6.f5214b
            java.lang.String r1 = "targets"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)
            java.util.Set r0 = r9.e0.S(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L19
            java.lang.String r7 = "未指定好友"
            return r7
        L19:
            boolean r0 = r0.contains(r7)
            if (r0 != 0) goto L22
            java.lang.String r7 = "不在指定好友中"
            return r7
        L22:
            r0 = 0
            g8.a r1 = h.Hchat.hooks.api.core.WeChatApis.account()     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L30
            java.lang.String r1 = r1.c()     // Catch: java.lang.Throwable -> L2e
            goto L31
        L2e:
            r1 = move-exception
            goto L3d
        L30:
            r1 = r0
        L31:
            if (r1 != 0) goto L34
            r1 = r2
        L34:
            java.lang.CharSequence r1 = og.m.R0(r1)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L2e
            goto L43
        L3d:
            sf.f r3 = new sf.f
            r3.<init>(r1)
            r1 = r3
        L43:
            java.lang.Throwable r3 = sf.g.b(r1)
            if (r3 == 0) goto L50
            ab.b r4 = r6.f5213a
            java.lang.String r5 = "读取当前微信账号失败"
            r4.invoke(r5, r3)
        L50:
            boolean r3 = r1 instanceof sf.f
            if (r3 == 0) goto L55
            goto L56
        L55:
            r2 = r1
        L56:
            java.lang.String r2 = (java.lang.String) r2
            boolean r1 = og.m.t0(r2)
            if (r1 == 0) goto L61
            java.lang.String r7 = "暂时无法确认当前账号"
            return r7
        L61:
            boolean r7 = gg.l.a(r7, r2)
            if (r7 == 0) goto L6a
            java.lang.String r7 = "自己的朋友圈"
            return r7
        L6a:
            return r0
    }
}
