package x8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ExecutorService f21329a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ScheduledExecutorService f21330b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final okhttp3.OkHttpClient f21331c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f21332d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f21333e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f21334f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f21335g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f21336h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReference f21337i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f21338j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f21339k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final java.util.Set f21340l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final x8.f f21341m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final x8.f f21342n = null;

    static {
            c9.q r0 = new c9.q
            r1 = 27
            r0.<init>(r1)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor(r0)
            x8.q.f21329a = r0
            c9.q r0 = new c9.q
            r1 = 28
            r0.<init>(r1)
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(r0)
            x8.q.f21330b = r0
            okhttp3.OkHttpClient$Builder r0 = new okhttp3.OkHttpClient$Builder
            r0.<init>()
            r1 = 30
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            okhttp3.OkHttpClient$Builder r0 = r0.pingInterval(r1, r3)
            okhttp3.OkHttpClient r0 = r0.build()
            x8.q.f21331c = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            x8.q.f21332d = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            x8.q.f21333e = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            x8.q.f21334f = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            x8.q.f21335g = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            x8.q.f21336h = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            x8.q.f21337i = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            x8.q.f21338j = r0
            r0 = 256(0x100, float:3.59E-43)
            int[] r1 = new int[r0]
            r2 = 0
            r3 = r2
        L64:
            if (r3 >= r0) goto L83
            int r4 = r3 << 24
            r5 = r2
        L69:
            r6 = 8
            if (r5 >= r6) goto L7e
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r6 & r4
            if (r6 == 0) goto L79
            int r4 = r4 << 1
            r6 = 79764919(0x4c11db7, float:4.540137E-36)
            r4 = r4 ^ r6
            goto L7b
        L79:
            int r4 = r4 << 1
        L7b:
            int r5 = r5 + 1
            goto L69
        L7e:
            r1[r3] = r4
            int r3 = r3 + 1
            goto L64
        L83:
            x8.q.f21339k = r1
            java.lang.String r8 = "m4a"
            java.lang.String r9 = "silk"
            java.lang.String r4 = "mp3"
            java.lang.String r5 = "wav"
            java.lang.String r6 = "ogg"
            java.lang.String r7 = "aac"
            java.lang.String[] r0 = new java.lang.String[]{r4, r5, r6, r7, r8, r9}
            java.util.Set r0 = tf.d0.W(r0)
            x8.q.f21340l = r0
            x8.f r1 = new x8.f
            java.lang.String r11 = "auto_accept_remark_custom_enable"
            java.lang.String r12 = "auto_accept_remark_custom_text"
            java.lang.String r2 = "auto_accept_label_new_friend_enable"
            java.lang.String r3 = "auto_accept_label_date_enable"
            java.lang.String r4 = "auto_accept_label_date_format"
            java.lang.String r5 = "auto_accept_label_existing_enable"
            java.lang.String r6 = "auto_accept_label_selected_names"
            java.lang.String r7 = "auto_accept_remark_new_friend_enable"
            java.lang.String r8 = "auto_accept_remark_nickname_suffix_enable"
            java.lang.String r9 = "auto_accept_remark_date_enable"
            java.lang.String r10 = "auto_accept_remark_date_format"
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            x8.q.f21341m = r1
            x8.f r2 = new x8.f
            java.lang.String r12 = "greet_accepted_remark_custom_enable"
            java.lang.String r13 = "greet_accepted_remark_custom_text"
            java.lang.String r3 = "greet_accepted_label_new_friend_enable"
            java.lang.String r4 = "greet_accepted_label_date_enable"
            java.lang.String r5 = "greet_accepted_label_date_format"
            java.lang.String r6 = "greet_accepted_label_existing_enable"
            java.lang.String r7 = "greet_accepted_label_selected_names"
            java.lang.String r8 = "greet_accepted_remark_new_friend_enable"
            java.lang.String r9 = "greet_accepted_remark_nickname_suffix_enable"
            java.lang.String r10 = "greet_accepted_remark_date_enable"
            java.lang.String r11 = "greet_accepted_remark_date_format"
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            x8.q.f21342n = r2
            return
    }

    public static java.lang.String A(k8.o r2) {
            java.lang.String r0 = r2.f7448e
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto Lc
            java.lang.String r0 = r2.a()
        Lc:
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto L14
            java.lang.String r0 = r2.f7449f
        L14:
            java.lang.String r2 = "^[^\\s:]{3,80}:\\n"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            r2.getClass()
            r0.getClass()
            java.lang.String r1 = ""
            java.util.regex.Matcher r2 = r2.matcher(r0)
            java.lang.String r2 = r2.replaceAll(r1)
            r2.getClass()
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public static void B(org.json.JSONObject r1, x8.t r2) {
            java.lang.String r2 = r2.f21356h
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            boolean r0 = og.m.t0(r2)
            if (r0 != 0) goto L11
            goto L12
        L11:
            r2 = 0
        L12:
            if (r2 == 0) goto L1e
            java.lang.String r0 = "tts_voice"
            r1.put(r0, r2)
            java.lang.String r0 = "voice"
            r1.put(r0, r2)
        L1e:
            return
    }

    public static java.lang.String C(java.lang.String r7) {
            java.util.ArrayList r0 = O(r7)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = tf.n.e1(r0)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.io.File r3 = new java.io.File
            r3.<init>(r2)
            r1.add(r3)
            goto L11
        L26:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L2f:
            boolean r2 = r1.hasNext()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L61
            java.lang.Object r2 = r1.next()
            r5 = r2
            java.io.File r5 = (java.io.File) r5
            boolean r6 = r5.isFile()
            if (r6 == 0) goto L5a
            java.lang.String r5 = dg.l.c0(r5)
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.String r5 = r5.toLowerCase(r6)
            r5.getClass()
            java.util.Set r6 = x8.q.f21340l
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L5a
            goto L5b
        L5a:
            r3 = r4
        L5b:
            if (r3 == 0) goto L2f
            r0.add(r2)
            goto L2f
        L61:
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 != 0) goto L8b
            jg.a r7 = jg.d.f6902g
            boolean r7 = r0.isEmpty()
            if (r7 != 0) goto L85
            int r7 = r0.size()
            jg.a r1 = jg.d.f6902g
            int r7 = r1.g(r7)
            java.lang.Object r7 = r0.get(r7)
            java.io.File r7 = (java.io.File) r7
            java.lang.String r7 = r7.getAbsolutePath()
            return r7
        L85:
            java.lang.String r7 = "Collection is empty."
            j8.o.l(r7)
            return r2
        L8b:
            java.io.File r0 = new java.io.File
            r0.<init>(r7)
            boolean r7 = r0.isDirectory()
            if (r7 != 0) goto L97
            goto Lbb
        L97:
            fb.h1 r7 = new fb.h1
            r7.<init>(r3)
            java.io.File[] r7 = r0.listFiles(r7)
            if (r7 != 0) goto La4
            java.io.File[] r7 = new java.io.File[r4]
        La4:
            jg.a r0 = jg.d.f6902g
            int r0 = r7.length
            if (r0 != 0) goto Lab
            r7 = r2
            goto Lb4
        Lab:
            int r0 = r7.length
            jg.a r1 = jg.d.f6902g
            int r0 = r1.g(r0)
            r7 = r7[r0]
        Lb4:
            if (r7 == 0) goto Lbb
            java.lang.String r7 = r7.getAbsolutePath()
            return r7
        Lbb:
            return r2
    }

    public static x8.l D(android.content.Context r47, java.lang.String r48, java.lang.String r49, boolean r50) {
            r2 = r47
            r5 = r48
            r12 = r49
            x8.r r0 = new x8.r
            r0.<init>(r2)
            x8.t r1 = r0.o()
            java.lang.String r0 = r1.f21349a
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r13 = r0.toString()
            boolean r0 = og.m.t0(r13)
            r14 = 0
            if (r0 == 0) goto L2f
            java.lang.String r0 = "请先配置小智 WebSocket 地址"
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r0, r14)     // Catch: java.lang.Throwable -> L29
            r0.show()     // Catch: java.lang.Throwable -> L29
        L29:
            x8.l r0 = new x8.l
            r0.<init>()
            return r0
        L2f:
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = r1.f21349a
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = r1.f21354f
            java.lang.CharSequence r6 = og.m.R0(r6)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "|"
            java.lang.String r15 = bc.e.v(r0, r7, r6, r7, r5)
            java.util.concurrent.ConcurrentHashMap r0 = x8.q.f21335g
            java.lang.Object r6 = r0.get(r15)
            if (r6 != 0) goto Lea
            java.lang.String r6 = "SHA-256"
            java.security.MessageDigest r6 = java.security.MessageDigest.getInstance(r6)
            long r7 = java.lang.System.currentTimeMillis()
            jg.a r9 = jg.d.f6902g
            long r9 = r9.d()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r5)
            r17 = 1
            java.lang.String r11 = ":"
            r14.append(r11)
            r14.append(r7)
            r14.append(r11)
            r14.append(r9)
            java.lang.String r7 = r14.toString()
            java.nio.charset.Charset r8 = og.a.f9804a
            byte[] r7 = r7.getBytes(r8)
            r7.getClass()
            byte[] r6 = r6.digest(r7)
            r6.getClass()
            java.lang.String r7 = ""
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            int r9 = r6.length
            r10 = 0
            r11 = 0
        L9e:
            if (r10 >= r9) goto Lcb
            r14 = r6[r10]
            int r11 = r11 + 1
            r2 = r17
            if (r11 <= r2) goto Lab
            r8.append(r7)
        Lab:
            java.lang.Byte r14 = java.lang.Byte.valueOf(r14)
            r18 = r3
            java.lang.String r3 = "%02x"
            java.lang.Object[] r4 = new java.lang.Object[]{r14}
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r2)
            java.lang.String r2 = java.lang.String.format(r3, r4)
            r8.append(r2)
            int r10 = r10 + 1
            r2 = r47
            r3 = r18
            r17 = 1
            goto L9e
        Lcb:
            r18 = r3
            r8.append(r7)
            java.lang.String r2 = r8.toString()
            r3 = 16
            java.lang.String r2 = og.m.P0(r3, r2)
            java.lang.String r3 = "hchat_"
            java.lang.String r2 = r3.concat(r2)
            java.lang.Object r0 = r0.putIfAbsent(r15, r2)
            if (r0 != 0) goto Le8
            r6 = r2
            goto Lec
        Le8:
            r6 = r0
            goto Lec
        Lea:
            r18 = r3
        Lec:
            r2 = r6
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = l(r12)
            boolean r3 = og.m.t0(r0)
            if (r3 != 0) goto L14f
            boolean r3 = r1.f21357i
            boolean r4 = r1.f21360l
            if (r3 != 0) goto L102
            if (r4 != 0) goto L102
            goto L14f
        L102:
            uf.c r3 = a.a.E()
            boolean r6 = r1.f21357i
            if (r6 == 0) goto L10f
            java.lang.String r6 = "官方 Music MCP"
            r3.add(r6)
        L10f:
            if (r4 == 0) goto L126
            java.lang.String r4 = r1.f21361m
            java.lang.CharSequence r4 = og.m.R0(r4)
            java.lang.String r4 = r4.toString()
            boolean r4 = og.m.t0(r4)
            if (r4 != 0) goto L126
            java.lang.String r4 = "Hchat 点歌工具"
            r3.add(r4)
        L126:
            uf.c r6 = a.a.t(r3)
            java.lang.String r7 = " 或 "
            r10 = 0
            r11 = 62
            r8 = 0
            r9 = 0
            java.lang.String r3 = tf.m.A1(r6, r7, r8, r9, r10, r11)
            boolean r4 = og.m.t0(r3)
            if (r4 == 0) goto L13c
            goto L14f
        L13c:
            java.lang.String r4 = "用户想听歌，关键词是「"
            java.lang.String r6 = "」。请优先调用"
            java.lang.String r7 = "播放或发送音乐卡片；不要先说你不能播放、没有找到或需要用户自己打开播放器。原始请求："
            java.lang.StringBuilder r0 = bc.e.p(r4, r0, r6, r3, r7)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            r11 = r0
            goto L150
        L14f:
            r11 = r12
        L150:
            boolean r0 = r1.f21357i
            if (r0 == 0) goto L1bf
            java.lang.CharSequence r0 = og.m.R0(r12)
            java.lang.String r0 = r0.toString()
            boolean r3 = og.m.t0(r0)
            if (r3 == 0) goto L163
            goto L1bf
        L163:
            java.lang.String r3 = l(r0)
            boolean r3 = og.m.t0(r3)
            if (r3 != 0) goto L16e
            goto L1bc
        L16e:
            java.lang.String r20 = "笑话"
            java.lang.String r21 = "段子"
            java.lang.String r22 = "讲个笑话"
            java.lang.String r23 = "讲笑话"
            java.lang.String r24 = "新闻"
            java.lang.String r25 = "资讯"
            java.lang.String r26 = "热点"
            java.lang.String r27 = "头条"
            java.lang.String r28 = "天气"
            java.lang.String r29 = "气温"
            java.lang.String r30 = "下雨"
            java.lang.String r31 = "下雪"
            java.lang.String r32 = "空气质量"
            java.lang.String r33 = "知识库"
            java.lang.String r34 = "知识"
            java.lang.String r35 = "资料"
            java.lang.String r36 = "百科"
            java.lang.String r37 = "查询"
            java.lang.String r38 = "查一下"
            java.lang.String r39 = "搜索"
            java.lang.String[] r3 = new java.lang.String[]{r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39}
            java.util.List r3 = a.a.y0(r3)
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L1a5
            goto L1bf
        L1a5:
            java.util.Iterator r3 = r3.iterator()
        L1a9:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L1bf
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            r6 = 0
            boolean r4 = og.m.h0(r0, r4, r6)
            if (r4 == 0) goto L1a9
        L1bc:
            r31 = 1
            goto L1c1
        L1bf:
            r31 = 0
        L1c1:
            boolean r14 = r1.f21358j
            r3 = 0
            if (r14 == 0) goto L2d2
            java.util.concurrent.atomic.AtomicReference r0 = x8.q.f21337i
            java.lang.String r4 = r1.f21359k
            java.lang.CharSequence r4 = og.m.R0(r4)
            java.lang.String r4 = r4.toString()
            boolean r6 = r1.f21358j
            r20 = 1000(0x3e8, double:4.94E-321)
            if (r6 != 0) goto L1ee
            java.lang.Object r0 = r0.getAndSet(r3)
            x8.k r0 = (x8.k) r0
            if (r0 == 0) goto L1e5
            java.lang.String r4 = "disabled"
            r0.b(r4)
        L1e5:
            r32 = r3
            r4 = r5
            r23 = r11
            r40 = r18
            goto L29a
        L1ee:
            java.lang.Object r6 = r0.get()
            x8.k r6 = (x8.k) r6
            boolean r7 = r1.f21360l
            java.lang.String r8 = r1.f21361m
            java.lang.CharSequence r8 = og.m.R0(r8)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = r1.f21362n
            java.lang.CharSequence r9 = og.m.R0(r9)
            java.lang.String r9 = r9.toString()
            boolean r10 = og.m.t0(r9)
            if (r10 == 0) goto L212
            java.lang.String r9 = "queryKugouMusic"
        L212:
            int r10 = r1.f21364p
            r3 = 10
            r23 = r11
            r11 = 600(0x258, float:8.41E-43)
            int r3 = r9.e0.r(r10, r3, r11)
            long r10 = (long) r3
            long r10 = r10 * r20
            if (r6 == 0) goto L25e
            java.util.concurrent.atomic.AtomicBoolean r3 = r6.f21295i
            boolean r3 = r3.get()
            if (r3 != 0) goto L25e
            java.lang.String r3 = r6.f21287a
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto L25e
            boolean r3 = r6.f21288b
            if (r3 != r7) goto L25e
            java.lang.String r3 = r6.f21289c
            boolean r3 = gg.l.a(r3, r8)
            if (r3 == 0) goto L25e
            java.lang.String r3 = r6.f21290d
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto L25e
            r24 = r4
            long r3 = r6.f21291e
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 != 0) goto L260
            java.util.concurrent.atomic.AtomicReference r0 = r6.f21292f
            r0.set(r5)
            r6.f(r2, r5)
            r4 = r5
            r3 = r6
            r40 = r18
            r32 = 0
            goto L29a
        L25e:
            r24 = r4
        L260:
            if (r6 == 0) goto L267
            java.lang.String r3 = "endpoint changed"
            r6.b(r3)
        L267:
            x8.k r3 = new x8.k
            r40 = r10
            r11 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r40
            r40 = r18
            r4 = r24
            r32 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r4 = r5
            r3.f(r2, r4)
        L27e:
            boolean r5 = r0.compareAndSet(r11, r3)
            if (r5 == 0) goto L288
            r3.c()
            goto L29a
        L288:
            java.lang.Object r5 = r0.get()
            if (r5 == r11) goto L27e
            java.lang.String r5 = "replaced"
            r3.b(r5)
            java.lang.Object r0 = r0.get()
            r3 = r0
            x8.k r3 = (x8.k) r3
        L29a:
            if (r3 == 0) goto L2cf
            int r0 = r1.f21363o
            r5 = 30
            r6 = 1
            int r0 = r9.e0.r(r0, r6, r5)
            long r5 = (long) r0
            long r5 = r5 * r20
            java.lang.String r0 = r3.f21287a
            boolean r0 = og.m.t0(r0)
            if (r0 == 0) goto L2b1
            goto L2d9
        L2b1:
            java.util.concurrent.CountDownLatch r0 = r3.f21299m     // Catch: java.lang.Throwable -> L2be
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L2be
            boolean r0 = r0.await(r5, r7)     // Catch: java.lang.Throwable -> L2be
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L2be
            goto L2c5
        L2be:
            r0 = move-exception
            sf.f r5 = new sf.f
            r5.<init>(r0)
            r0 = r5
        L2c5:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r6 = r0 instanceof sf.f
            if (r6 == 0) goto L2cc
            r0 = r5
        L2cc:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            goto L2d9
        L2cf:
            r3 = r32
            goto L2d9
        L2d2:
            r32 = r3
            r4 = r5
            r23 = r11
            r40 = r18
        L2d9:
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            java.lang.String r5 = ""
            r0.<init>(r5)
            java.lang.StringBuilder r29 = new java.lang.StringBuilder
            r29.<init>()
            java.util.ArrayList r27 = new java.util.ArrayList
            r27.<init>()
            java.util.ArrayList r28 = new java.util.ArrayList
            r28.<init>()
            java.util.concurrent.CountDownLatch r5 = new java.util.concurrent.CountDownLatch
            r6 = 1
            r5.<init>(r6)
            java.util.concurrent.atomic.AtomicReference r22 = new java.util.concurrent.atomic.AtomicReference
            r22.<init>()
            java.util.concurrent.atomic.AtomicBoolean r7 = new java.util.concurrent.atomic.AtomicBoolean
            r6 = 0
            r7.<init>(r6)
            java.util.concurrent.atomic.AtomicBoolean r8 = new java.util.concurrent.atomic.AtomicBoolean
            r8.<init>(r6)
            java.util.concurrent.atomic.AtomicBoolean r9 = new java.util.concurrent.atomic.AtomicBoolean
            r9.<init>(r6)
            java.util.concurrent.atomic.AtomicReference r16 = new java.util.concurrent.atomic.AtomicReference
            r16.<init>()
            r10 = 1
            java.util.concurrent.atomic.AtomicReference r17 = new java.util.concurrent.atomic.AtomicReference
            r17.<init>()
            java.util.concurrent.atomic.AtomicReference r25 = new java.util.concurrent.atomic.AtomicReference
            r25.<init>()
            java.util.concurrent.atomic.AtomicBoolean r11 = new java.util.concurrent.atomic.AtomicBoolean
            r11.<init>(r6)
            r18 = r6
            r6 = r9
            gg.s r9 = new gg.s
            r9.<init>()
            r10 = 24000(0x5dc0, float:3.3631E-41)
            r9.f4562g = r10
            gg.s r10 = new gg.s
            r10.<init>()
            r20 = r1
            r1 = 1
            r10.f4562g = r1
            r19 = r11
            gg.s r11 = new gg.s
            r11.<init>()
            r1 = 60
            r11.f4562g = r1
            r4 = r23
            gg.u r23 = new gg.u
            r23.<init>()
            x8.m r33 = new x8.m
            wb.o7 r34 = new wb.o7
            r1 = r18
            r18 = r8
            r8 = r16
            r16 = r1
            r30 = r0
            r1 = r3
            r24 = r5
            r5 = r20
            r0 = r34
            r42 = 1
            r3 = r2
            r2 = r47
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r2 = r15
            r15 = r6
            r6 = r5
            r5 = r7
            wb.qp r35 = new wb.qp
            r7 = r14
            r14 = r1
            r1 = r7
            r26 = r3
            r21 = r5
            r7 = r13
            r43 = r16
            r20 = r19
            r13 = r35
            r19 = r50
            r16 = r8
            r8 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r19 = r20
            r15 = r23
            r4 = r27
            r13 = r28
            d9.h r0 = new d9.h
            r5 = 7
            r2 = r14
            r14 = r1
            r1 = r2
            r3 = r50
            r2 = r18
            r0.<init>(r1, r2, r3, r4, r5)
            r36 = r0
            r0 = r4
            c9.z0 r4 = new c9.z0
            r1 = r11
            r11 = 15
            r2 = r47
            r46 = r1
            r1 = r6
            r12 = r7
            r3 = r8
            r44 = r9
            r45 = r10
            r6 = r16
            r7 = r17
            r5 = r21
            r10 = r22
            r8 = r24
            r9 = r25
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r37 = r4
            x8.d r4 = new x8.d
            r11 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r38 = r4
            x8.d r4 = new x8.d
            r11 = 1
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r39 = r4
            r33.<init>(r34, r35, r36, r37, r38, r39)
            r4 = r33
            r15.f4564g = r4
            java.lang.Object r4 = r15.f4564g
            if (r4 == 0) goto L593
            x8.m r4 = (x8.m) r4
            r9.set(r4)
            x8.n r3 = Z(r2, r3, r12, r1, r14)     // Catch: java.lang.Throwable -> L569
            r10.set(r3)     // Catch: java.lang.Throwable -> L569
            java.lang.Object r4 = r15.f4564g     // Catch: java.lang.Throwable -> L569
            if (r4 == 0) goto L563
            x8.m r4 = (x8.m) r4     // Catch: java.lang.Throwable -> L569
            r3.d(r4)     // Catch: java.lang.Throwable -> L569
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L569
            r11 = 60
            boolean r4 = r8.await(r11, r4)     // Catch: java.lang.Throwable -> L569
            if (r4 != 0) goto L401
            r22 = r10
            r10 = 128(0x80, float:1.8E-43)
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r22
            F(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L569
        L401:
            boolean r4 = r19.get()     // Catch: java.lang.Throwable -> L569
            if (r4 != 0) goto L417
            java.lang.Object r4 = r15.f4564g     // Catch: java.lang.Throwable -> L569
            if (r4 == 0) goto L411
            x8.m r4 = (x8.m) r4     // Catch: java.lang.Throwable -> L569
            r3.b(r4)     // Catch: java.lang.Throwable -> L569
            goto L417
        L411:
            java.lang.String r0 = "socketRequest"
            gg.l.g(r0)     // Catch: java.lang.Throwable -> L569
            throw r32     // Catch: java.lang.Throwable -> L569
        L417:
            r3 = r50
            if (r50 == 0) goto L428
            G(r3, r0, r13)     // Catch: java.lang.Throwable -> L569
            monitor-enter(r13)     // Catch: java.lang.Throwable -> L569
            java.util.List r4 = tf.m.P1(r13)     // Catch: java.lang.Throwable -> L425
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L569
            goto L42a
        L425:
            r0 = move-exception
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L569
            throw r0     // Catch: java.lang.Throwable -> L569
        L428:
            tf.t r4 = tf.t.f13167g     // Catch: java.lang.Throwable -> L569
        L42a:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L569
            r5.<init>()     // Catch: java.lang.Throwable -> L569
            java.util.Iterator r6 = r4.iterator()     // Catch: java.lang.Throwable -> L569
            r14 = r43
        L435:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L569
            if (r7 == 0) goto L470
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L569
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L569
            r9 = r44
            int r8 = r9.f4562g     // Catch: java.lang.Throwable -> L569
            r10 = r45
            int r11 = r10.f4562g     // Catch: java.lang.Throwable -> L569
            r12 = r46
            int r15 = r12.f4562g     // Catch: java.lang.Throwable -> L569
            java.io.File r8 = V(r2, r7, r8, r11, r15)     // Catch: java.lang.Throwable -> L569
            if (r8 != 0) goto L458
            r11 = r32
            r14 = r42
            goto L464
        L458:
            x8.o r11 = new x8.o     // Catch: java.lang.Throwable -> L569
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L569
            int r15 = r12.f4562g     // Catch: java.lang.Throwable -> L569
            int r7 = r7 * r15
            r11.<init>(r8, r7)     // Catch: java.lang.Throwable -> L569
        L464:
            if (r11 == 0) goto L469
            r5.add(r11)     // Catch: java.lang.Throwable -> L569
        L469:
            r44 = r9
            r45 = r10
            r46 = r12
            goto L435
        L470:
            r9 = r44
            r10 = r45
            r12 = r46
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L569
            r6.<init>()     // Catch: java.lang.Throwable -> L569
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L569
        L47f:
            boolean r7 = r4.hasNext()     // Catch: java.lang.Throwable -> L569
            if (r7 == 0) goto L48f
            java.lang.Object r7 = r4.next()     // Catch: java.lang.Throwable -> L569
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch: java.lang.Throwable -> L569
            tf.r.h1(r6, r7)     // Catch: java.lang.Throwable -> L569
            goto L47f
        L48f:
            int r4 = r5.size()     // Catch: java.lang.Throwable -> L569
            r7 = 3
            if (r4 < r7) goto L499
            r4 = r42
            goto L49b
        L499:
            r4 = r43
        L49b:
            if (r31 != 0) goto L4a5
            if (r4 != 0) goto L4a5
            if (r14 == 0) goto L4a2
            goto L4a5
        L4a2:
            r22 = r43
            goto L4a7
        L4a5:
            r22 = r42
        L4a7:
            if (r3 == 0) goto L4dc
            if (r22 != 0) goto L4b3
            boolean r3 = r5.isEmpty()     // Catch: java.lang.Throwable -> L569
            if (r3 != 0) goto L4b3
            if (r14 == 0) goto L4dc
        L4b3:
            boolean r3 = r6.isEmpty()     // Catch: java.lang.Throwable -> L569
            if (r3 != 0) goto L4dc
            if (r14 == 0) goto L4d1
            java.util.Iterator r3 = r5.iterator()     // Catch: java.lang.Throwable -> L569
        L4bf:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L569
            if (r4 == 0) goto L4d1
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L569
            x8.o r4 = (x8.o) r4     // Catch: java.lang.Throwable -> L569
            java.io.File r4 = r4.f21325a     // Catch: java.lang.Throwable -> L4bf
            r4.delete()     // Catch: java.lang.Throwable -> L4bf
            goto L4bf
        L4d1:
            int r3 = r9.f4562g     // Catch: java.lang.Throwable -> L569
            int r4 = r10.f4562g     // Catch: java.lang.Throwable -> L569
            int r7 = r12.f4562g     // Catch: java.lang.Throwable -> L569
            java.io.File r3 = V(r2, r6, r3, r4, r7)     // Catch: java.lang.Throwable -> L569
            goto L4de
        L4dc:
            r3 = r32
        L4de:
            if (r22 == 0) goto L4f8
            if (r3 == 0) goto L4f8
            java.util.Iterator r2 = r5.iterator()     // Catch: java.lang.Throwable -> L569
        L4e6:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L569
            if (r4 == 0) goto L4f8
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L569
            x8.o r4 = (x8.o) r4     // Catch: java.lang.Throwable -> L569
            java.io.File r4 = r4.f21325a     // Catch: java.lang.Throwable -> L4e6
            r4.delete()     // Catch: java.lang.Throwable -> L4e6
            goto L4e6
        L4f8:
            int r2 = r6.size()     // Catch: java.lang.Throwable -> L569
            int r4 = r12.f4562g     // Catch: java.lang.Throwable -> L569
            int r20 = r2 * r4
            r4 = r48
            r12 = r49
            r6 = r40
            v(r1, r4, r12, r6)     // Catch: java.lang.Throwable -> L569
            java.lang.Object r1 = r30.get()     // Catch: java.lang.Throwable -> L569
            r1.getClass()     // Catch: java.lang.Throwable -> L569
            r16 = r1
            java.lang.String r16 = (java.lang.String) r16     // Catch: java.lang.Throwable -> L569
            if (r3 == 0) goto L532
            boolean r1 = r3.isFile()     // Catch: java.lang.Throwable -> L569
            if (r1 == 0) goto L528
            long r1 = r3.length()     // Catch: java.lang.Throwable -> L569
            r6 = 0
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 <= 0) goto L528
            r1 = r3
            goto L52a
        L528:
            r1 = r32
        L52a:
            if (r1 == 0) goto L532
            java.lang.String r1 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L569
            r32 = r1
        L532:
            if (r32 != 0) goto L536
            java.lang.String r32 = ""
        L536:
            r17 = r32
            if (r3 == 0) goto L541
            long r0 = r3.length()     // Catch: java.lang.Throwable -> L569
        L53e:
            r18 = r0
            goto L546
        L541:
            long r0 = E(r0, r13)     // Catch: java.lang.Throwable -> L569
            goto L53e
        L546:
            if (r14 != 0) goto L54e
            if (r22 == 0) goto L54b
            goto L54e
        L54b:
            r21 = r5
            goto L552
        L54e:
            tf.t r0 = tf.t.f13167g     // Catch: java.lang.Throwable -> L569
            r21 = r0
        L552:
            if (r22 == 0) goto L55b
            int r14 = r5.size()     // Catch: java.lang.Throwable -> L569
            r23 = r14
            goto L55d
        L55b:
            r23 = r43
        L55d:
            x8.l r15 = new x8.l     // Catch: java.lang.Throwable -> L569
            r15.<init>(r16, r17, r18, r20, r21, r22, r23)     // Catch: java.lang.Throwable -> L569
            goto L56f
        L563:
            java.lang.String r0 = "socketRequest"
            gg.l.g(r0)     // Catch: java.lang.Throwable -> L569
            throw r32     // Catch: java.lang.Throwable -> L569
        L569:
            r0 = move-exception
            sf.f r15 = new sf.f
            r15.<init>(r0)
        L56f:
            java.lang.Throwable r0 = sf.g.b(r15)
            if (r0 != 0) goto L576
            goto L590
        L576:
            java.lang.String r1 = r0.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[Hchat:AutoReply] 小智AI 请求失败: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            fb.v0.n(r1, r0)
            x8.l r15 = new x8.l
            r15.<init>()
        L590:
            x8.l r15 = (x8.l) r15
            return r15
        L593:
            java.lang.String r0 = "socketRequest"
            gg.l.g(r0)
            throw r32
    }

    public static final long E(java.util.ArrayList r7, java.util.ArrayList r8) {
            monitor-enter(r7)
            java.util.Iterator r0 = r7.iterator()     // Catch: java.lang.Throwable -> L18
            r1 = 0
            r3 = r1
        L8:
            boolean r5 = r0.hasNext()     // Catch: java.lang.Throwable -> L18
            if (r5 == 0) goto L1a
            java.lang.Object r5 = r0.next()     // Catch: java.lang.Throwable -> L18
            byte[] r5 = (byte[]) r5     // Catch: java.lang.Throwable -> L18
            int r5 = r5.length     // Catch: java.lang.Throwable -> L18
            long r5 = (long) r5
            long r3 = r3 + r5
            goto L8
        L18:
            r8 = move-exception
            goto L50
        L1a:
            monitor-exit(r7)
            monitor-enter(r8)
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L49
            r7.<init>()     // Catch: java.lang.Throwable -> L49
            java.util.Iterator r0 = r8.iterator()     // Catch: java.lang.Throwable -> L49
        L25:
            boolean r5 = r0.hasNext()     // Catch: java.lang.Throwable -> L49
            if (r5 == 0) goto L35
            java.lang.Object r5 = r0.next()     // Catch: java.lang.Throwable -> L49
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch: java.lang.Throwable -> L49
            tf.r.h1(r7, r5)     // Catch: java.lang.Throwable -> L49
            goto L25
        L35:
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L49
        L39:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> L49
            if (r0 == 0) goto L4b
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Throwable -> L49
            byte[] r0 = (byte[]) r0     // Catch: java.lang.Throwable -> L49
            int r0 = r0.length     // Catch: java.lang.Throwable -> L49
            long r5 = (long) r0
            long r1 = r1 + r5
            goto L39
        L49:
            r7 = move-exception
            goto L4e
        L4b:
            monitor-exit(r8)
            long r1 = r1 + r3
            return r1
        L4e:
            monitor-exit(r8)
            throw r7
        L50:
            monitor-exit(r7)
            throw r8
    }

    public static void F(java.util.concurrent.atomic.AtomicBoolean r3, java.util.concurrent.atomic.AtomicReference r4, java.util.concurrent.atomic.AtomicReference r5, java.util.concurrent.CountDownLatch r6, java.util.concurrent.atomic.AtomicReference r7, java.util.concurrent.atomic.AtomicReference r8, int r9) {
            r0 = r9 & 64
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            r9 = r9 & 128(0x80, float:1.8E-43)
            if (r9 == 0) goto Lf
            r9 = r1
            goto L10
        Lf:
            r9 = r2
        L10:
            boolean r3 = r3.compareAndSet(r2, r1)
            if (r3 == 0) goto L61
            r3 = 0
            java.lang.Object r4 = r4.getAndSet(r3)
            java.util.concurrent.ScheduledFuture r4 = (java.util.concurrent.ScheduledFuture) r4
            if (r4 == 0) goto L22
            r4.cancel(r2)
        L22:
            java.lang.Object r3 = r5.getAndSet(r3)
            java.util.concurrent.ScheduledFuture r3 = (java.util.concurrent.ScheduledFuture) r3
            if (r3 == 0) goto L2d
            r3.cancel(r2)
        L2d:
            r6.countDown()
            java.lang.Object r3 = r7.get()
            x8.m r3 = (x8.m) r3
            if (r0 == 0) goto L46
            java.lang.Object r3 = r8.get()
            x8.n r3 = (x8.n) r3
            if (r3 == 0) goto L61
            java.lang.String r4 = "reply failed"
            r3.a(r4)
            return
        L46:
            if (r9 == 0) goto L56
            if (r3 == 0) goto L56
            java.lang.Object r4 = r8.get()
            x8.n r4 = (x8.n) r4
            if (r4 == 0) goto L61
            r4.b(r3)
            return
        L56:
            java.lang.Object r3 = r8.get()
            x8.n r3 = (x8.n) r3
            if (r3 == 0) goto L61
            r3.e()
        L61:
            return
    }

    public static final void G(boolean r0, java.util.ArrayList r1, java.util.ArrayList r2) {
            if (r0 != 0) goto L3
            return
        L3:
            monitor-enter(r1)
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto Lc
            monitor-exit(r1)
            return
        Lc:
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L1a
            java.util.List r0 = tf.m.P1(r1)     // Catch: java.lang.Throwable -> L1c
            r2.add(r0)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            r1.clear()     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r1)
            return
        L1a:
            r0 = move-exception
            goto L1f
        L1c:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1a
            throw r0     // Catch: java.lang.Throwable -> L1a
        L1f:
            monitor-exit(r1)
            throw r0
    }

    public static boolean H(fg.l r3, java.lang.String r4) {
            java.util.ArrayList r4 = O(r4)
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        L9:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = eh.a.y(r1)
            if (r2 == 0) goto L28
            java.lang.Object r1 = r3.invoke(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L28
            r0 = 1
        L28:
            r1 = 300(0x12c, double:1.48E-321)
            M(r1)
            goto L9
        L2e:
            return r0
    }

    public static boolean I(java.lang.String r6, java.lang.String r7) {
            boolean r0 = og.m.t0(r6)
            if (r0 != 0) goto L55
            boolean r0 = og.m.t0(r7)
            if (r0 == 0) goto Ld
            goto L55
        Ld:
            k8.g r0 = p.a.q()
            if (r0 == 0) goto L55
            og.k r1 = new og.k
            java.lang.String r2 = "\\[AtWx=([^\\]]+)]"
            r1.<init>(r2)
            ng.c r2 = og.k.c(r1, r7)
            wb.sr r3 = new wb.sr
            r4 = 19
            r3.<init>(r4)
            ng.t r2 = ng.m.W(r2, r3)
            wb.sr r3 = new wb.sr
            r4 = 20
            r3.<init>(r4)
            ng.i r4 = new ng.i
            r5 = 1
            r4.<init>(r2, r5, r3)
            java.util.List r2 = ng.m.b0(r4)
            ca.s r3 = new ca.s
            r4 = 22
            r3.<init>(r6, r4)
            java.lang.String r7 = r1.e(r7, r3)
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L50
            boolean r6 = r0.x(r6, r7)
            return r6
        L50:
            boolean r6 = r0.y(r6, r7, r2)
            return r6
        L55:
            r6 = 0
            return r6
    }

    public static boolean J(android.content.Context r19, java.lang.String r20, x8.g r21, boolean r22) {
            r0 = r20
            java.lang.String r1 = a(r21)
            boolean r2 = og.m.t0(r1)
            r3 = 0
            if (r2 == 0) goto L11
            r16 = r3
            goto L117
        L11:
            r2 = r19
            x8.l r1 = D(r2, r0, r1, r3)
            java.lang.String r2 = r1.f21301b
            java.util.List r4 = r1.f21304e
            java.lang.String r5 = r1.f21300a
            boolean r6 = r1.f21305f
            r7 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r8 = ".silk"
            r9 = 1
            if (r6 != 0) goto Lbd
            boolean r6 = r4.isEmpty()
            if (r6 != 0) goto Lbd
            j8.p r6 = h.Hchat.hooks.api.core.WeChatApis.media()
            java.util.Iterator r10 = r4.iterator()     // Catch: java.lang.Throwable -> L5f
            r11 = r3
            r12 = r11
        L36:
            boolean r13 = r10.hasNext()     // Catch: java.lang.Throwable -> L5f
            if (r13 == 0) goto L8b
            java.lang.Object r13 = r10.next()     // Catch: java.lang.Throwable -> L5f
            int r14 = r11 + 1
            if (r11 < 0) goto L86
            x8.o r13 = (x8.o) r13     // Catch: java.lang.Throwable -> L5f
            java.io.File r15 = r13.f21325a     // Catch: java.lang.Throwable -> L5f
            java.lang.String r15 = r15.getAbsolutePath()     // Catch: java.lang.Throwable -> L5f
            r15.getClass()     // Catch: java.lang.Throwable -> L5f
            boolean r16 = s(r15)     // Catch: java.lang.Throwable -> L5f
            if (r16 != 0) goto L61
            boolean r16 = og.t.W(r15, r8, r9)     // Catch: java.lang.Throwable -> L5f
            if (r16 == 0) goto L5c
            goto L61
        L5c:
            r16 = r3
            goto L82
        L5f:
            r0 = move-exception
            goto La6
        L61:
            if (r6 == 0) goto L74
            int r13 = r13.f21326b     // Catch: java.lang.Throwable -> L5f
            if (r13 >= r7) goto L68
            r13 = r7
        L68:
            r16 = r3
            j8.y r3 = r6.f6816b     // Catch: java.lang.Throwable -> L5f
            boolean r3 = r3.s(r13, r0, r15)     // Catch: java.lang.Throwable -> L5f
            if (r3 != r9) goto L76
            r12 = r9
            goto L76
        L74:
            r16 = r3
        L76:
            int r3 = r4.size()     // Catch: java.lang.Throwable -> L5f
            int r3 = r3 - r9
            if (r11 >= r3) goto L82
            r17 = 300(0x12c, double:1.48E-321)
            M(r17)     // Catch: java.lang.Throwable -> L5f
        L82:
            r11 = r14
            r3 = r16
            goto L36
        L86:
            a.a.Q0()     // Catch: java.lang.Throwable -> L5f
            r0 = 0
            throw r0     // Catch: java.lang.Throwable -> L5f
        L8b:
            r16 = r3
            java.util.Iterator r3 = r4.iterator()
        L91:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto La3
            java.lang.Object r4 = r3.next()
            x8.o r4 = (x8.o) r4
            java.io.File r4 = r4.f21325a     // Catch: java.lang.Throwable -> L91
            r4.delete()     // Catch: java.lang.Throwable -> L91
            goto L91
        La3:
            if (r12 == 0) goto Lbf
            goto Lf3
        La6:
            java.util.Iterator r1 = r4.iterator()
        Laa:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lbc
            java.lang.Object r2 = r1.next()
            x8.o r2 = (x8.o) r2
            java.io.File r2 = r2.f21325a     // Catch: java.lang.Throwable -> Laa
            r2.delete()     // Catch: java.lang.Throwable -> Laa
            goto Laa
        Lbc:
            throw r0
        Lbd:
            r16 = r3
        Lbf:
            boolean r3 = og.m.t0(r2)
            if (r3 != 0) goto Lf4
            boolean r3 = s(r2)
            if (r3 != 0) goto Ld1
            boolean r3 = og.t.W(r2, r8, r9)
            if (r3 == 0) goto Lf4
        Ld1:
            j8.p r3 = h.Hchat.hooks.api.core.WeChatApis.media()
            if (r3 == 0) goto Le7
            int r1 = r1.f21303d
            if (r1 >= r7) goto Ldc
            goto Ldd
        Ldc:
            r7 = r1
        Ldd:
            j8.y r1 = r3.f6816b
            boolean r1 = r1.s(r7, r0, r2)
            if (r1 != r9) goto Le7
            r1 = r9
            goto Le9
        Le7:
            r1 = r16
        Le9:
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> Lf1
            r3.<init>(r2)     // Catch: java.lang.Throwable -> Lf1
            r3.delete()     // Catch: java.lang.Throwable -> Lf1
        Lf1:
            if (r1 == 0) goto Lf4
        Lf3:
            return r9
        Lf4:
            boolean r1 = og.m.t0(r5)
            if (r1 == 0) goto Lfb
            goto L117
        Lfb:
            k8.g r1 = p.a.q()
            if (r1 == 0) goto L117
            if (r22 == 0) goto L112
            r2 = r21
            long r2 = r2.f21276d
            r6 = 0
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 <= 0) goto L112
            boolean r0 = r1.u(r2, r0, r5)
            goto L116
        L112:
            boolean r0 = I(r0, r5)
        L116:
            return r0
        L117:
            return r16
    }

    public static boolean K(android.content.Context r19, java.lang.String r20, x8.g r21) {
            r1 = r20
            java.lang.String r0 = a(r21)
            boolean r2 = og.m.t0(r0)
            if (r2 == 0) goto L10
            r21 = 0
            goto L1d5
        L10:
            r2 = 1
            r4 = r19
            x8.l r0 = D(r4, r1, r0, r2)
            java.lang.String r5 = r0.f21301b
            java.util.List r6 = r0.f21304e
            boolean r7 = r6.isEmpty()
            r8 = 1000(0x3e8, float:1.401E-42)
            r9 = 0
            if (r7 == 0) goto L157
            boolean r6 = og.m.t0(r5)
            if (r6 != 0) goto L43
            x8.o r4 = new x8.o
            java.io.File r6 = new java.io.File
            r6.<init>(r5)
            int r0 = r0.f21303d
            if (r0 >= r8) goto L36
            r0 = r8
        L36:
            r4.<init>(r6, r0)
            java.util.List r0 = a.a.x0(r4)
            r11 = r2
            r21 = 0
        L40:
            r6 = r0
            goto L15a
        L43:
            java.lang.String r0 = r0.f21300a
            java.lang.String r5 = "[Hchat:AutoReply] 小智语音本地 TTS 失败: "
            java.lang.String r6 = "[Hchat:AutoReply] 小智语音本地 TTS 转 Silk 失败: "
            java.lang.String r0 = h(r0)
            boolean r7 = og.m.t0(r0)
            if (r7 == 0) goto L59
        L53:
            r11 = r2
            r2 = r9
            r21 = 0
            goto L141
        L59:
            java.io.File r7 = new java.io.File
            java.io.File r10 = r4.getCacheDir()
            java.lang.String r11 = "hchat_xiaozhi_reply"
            r7.<init>(r10, r11)
            r7.mkdirs()
            java.lang.String r10 = ".wav"
            java.lang.String r11 = "reply_"
            java.io.File r10 = java.io.File.createTempFile(r11, r10, r7)
            java.lang.String r12 = ".pcm"
            java.io.File r12 = java.io.File.createTempFile(r11, r12, r7)
            java.lang.String r13 = ".silk"
            java.io.File r7 = java.io.File.createTempFile(r11, r13, r7)
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> Lef
            r4.getClass()     // Catch: java.lang.Throwable -> Lef
            r10.getClass()     // Catch: java.lang.Throwable -> Lef
            boolean r0 = Q(r4, r0, r10)     // Catch: java.lang.Throwable -> Lef
            if (r0 != 0) goto L92
            r10.delete()     // Catch: java.lang.Throwable -> L8e
        L8e:
            r12.delete()     // Catch: java.lang.Throwable -> L53
            goto L53
        L92:
            byte[] r0 = S(r10)     // Catch: java.lang.Throwable -> Lef
            int r4 = r0.length     // Catch: java.lang.Throwable -> Lef
            if (r4 != 0) goto L9a
            r0 = r9
        L9a:
            if (r0 == 0) goto L11c
            r12.getClass()     // Catch: java.lang.Throwable -> Lef
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lef
            r4.<init>(r12)     // Catch: java.lang.Throwable -> Lef
            r4.write(r0)     // Catch: java.lang.Throwable -> L111
            r4.close()     // Catch: java.lang.Throwable -> Lef
            me.yun.silk.SilkCodec r13 = new me.yun.silk.SilkCodec     // Catch: java.lang.Throwable -> Lef
            r13.<init>()     // Catch: java.lang.Throwable -> Lef
            java.lang.String r14 = r12.getAbsolutePath()     // Catch: java.lang.Throwable -> Lef
            java.lang.String r15 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> Lef
            r17 = 16000(0x3e80, float:2.2421E-41)
            r18 = 1
            r16 = 24000(0x5dc0, float:3.3631E-41)
            int r4 = r13.pcmToSilk(r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> Lef
            if (r4 != 0) goto Lf4
            boolean r11 = r7.isFile()     // Catch: java.lang.Throwable -> Lef
            if (r11 == 0) goto Lf4
            long r13 = r7.length()     // Catch: java.lang.Throwable -> Lef
            r15 = 0
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 <= 0) goto Lf4
            int r0 = r0.length     // Catch: java.lang.Throwable -> Lef
            int r0 = r0 / 2
            long r13 = (long) r0
            r15 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 * r15
            r0 = 16000(0x3e80, float:2.2421E-41)
            r11 = r2
            r21 = 0
            long r2 = (long) r0
            long r13 = r13 / r2
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 >= 0) goto Le6
            r13 = r15
        Le6:
            int r0 = (int) r13     // Catch: java.lang.Throwable -> Led
            x8.o r2 = new x8.o     // Catch: java.lang.Throwable -> Led
            r2.<init>(r7, r0)     // Catch: java.lang.Throwable -> Led
            goto L10a
        Led:
            r0 = move-exception
            goto L127
        Lef:
            r0 = move-exception
            r11 = r2
            r21 = 0
            goto L127
        Lf4:
            r11 = r2
            r21 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Led
            r0.<init>(r6)     // Catch: java.lang.Throwable -> Led
            r0.append(r4)     // Catch: java.lang.Throwable -> Led
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Led
            fb.v0.m(r0)     // Catch: java.lang.Throwable -> Led
            r7.delete()     // Catch: java.lang.Throwable -> L109
        L109:
            r2 = r9
        L10a:
            r10.delete()     // Catch: java.lang.Throwable -> L10d
        L10d:
            r12.delete()     // Catch: java.lang.Throwable -> L141
            goto L141
        L111:
            r0 = move-exception
            r11 = r2
            r21 = 0
            r2 = r0
            throw r2     // Catch: java.lang.Throwable -> L117
        L117:
            r0 = move-exception
            ig.a.i(r4, r2)     // Catch: java.lang.Throwable -> Led
            throw r0     // Catch: java.lang.Throwable -> Led
        L11c:
            r11 = r2
            r21 = 0
            r10.delete()     // Catch: java.lang.Throwable -> L122
        L122:
            r12.delete()     // Catch: java.lang.Throwable -> L125
        L125:
            r2 = r9
            goto L141
        L127:
            java.lang.String r2 = r0.getMessage()     // Catch: java.lang.Throwable -> L14f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L14f
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L14f
            r3.append(r2)     // Catch: java.lang.Throwable -> L14f
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L14f
            fb.v0.n(r2, r0)     // Catch: java.lang.Throwable -> L14f
            r7.delete()     // Catch: java.lang.Throwable -> L13d
        L13d:
            r10.delete()     // Catch: java.lang.Throwable -> L122
            goto L122
        L141:
            if (r2 == 0) goto L148
            java.util.List r0 = a.a.x0(r2)
            goto L149
        L148:
            r0 = r9
        L149:
            if (r0 != 0) goto L40
            tf.t r0 = tf.t.f13167g
            goto L40
        L14f:
            r0 = move-exception
            r10.delete()     // Catch: java.lang.Throwable -> L153
        L153:
            r12.delete()     // Catch: java.lang.Throwable -> L156
        L156:
            throw r0
        L157:
            r11 = r2
            r21 = 0
        L15a:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L162
            goto L1d5
        L162:
            j8.p r0 = h.Hchat.hooks.api.core.WeChatApis.media()     // Catch: java.lang.Throwable -> L1a0
            if (r0 == 0) goto L1bf
            java.util.Iterator r2 = r6.iterator()     // Catch: java.lang.Throwable -> L1a0
            r3 = r21
            r4 = r3
        L16f:
            boolean r5 = r2.hasNext()     // Catch: java.lang.Throwable -> L1a0
            if (r5 == 0) goto L1a8
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Throwable -> L1a0
            int r7 = r3 + 1
            if (r3 < 0) goto L1a4
            x8.o r5 = (x8.o) r5     // Catch: java.lang.Throwable -> L1a0
            java.io.File r10 = r5.f21325a     // Catch: java.lang.Throwable -> L1a0
            java.lang.String r10 = r10.getAbsolutePath()     // Catch: java.lang.Throwable -> L1a0
            int r5 = r5.f21326b     // Catch: java.lang.Throwable -> L1a0
            if (r5 >= r8) goto L18a
            r5 = r8
        L18a:
            j8.y r12 = r0.f6816b     // Catch: java.lang.Throwable -> L1a0
            boolean r5 = r12.s(r5, r1, r10)     // Catch: java.lang.Throwable -> L1a0
            if (r5 == 0) goto L193
            r4 = r11
        L193:
            int r5 = r6.size()     // Catch: java.lang.Throwable -> L1a0
            int r5 = r5 - r11
            if (r3 >= r5) goto L1a2
            r12 = 300(0x12c, double:1.48E-321)
            M(r12)     // Catch: java.lang.Throwable -> L1a0
            goto L1a2
        L1a0:
            r0 = move-exception
            goto L1d6
        L1a2:
            r3 = r7
            goto L16f
        L1a4:
            a.a.Q0()     // Catch: java.lang.Throwable -> L1a0
            throw r9     // Catch: java.lang.Throwable -> L1a0
        L1a8:
            java.util.Iterator r0 = r6.iterator()
        L1ac:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1be
            java.lang.Object r1 = r0.next()
            x8.o r1 = (x8.o) r1
            java.io.File r1 = r1.f21325a     // Catch: java.lang.Throwable -> L1ac
            r1.delete()     // Catch: java.lang.Throwable -> L1ac
            goto L1ac
        L1be:
            return r4
        L1bf:
            java.util.Iterator r0 = r6.iterator()
        L1c3:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d5
            java.lang.Object r1 = r0.next()
            x8.o r1 = (x8.o) r1
            java.io.File r1 = r1.f21325a     // Catch: java.lang.Throwable -> L1c3
            r1.delete()     // Catch: java.lang.Throwable -> L1c3
            goto L1c3
        L1d5:
            return r21
        L1d6:
            java.util.Iterator r1 = r6.iterator()
        L1da:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1ec
            java.lang.Object r2 = r1.next()
            x8.o r2 = (x8.o) r2
            java.io.File r2 = r2.f21325a     // Catch: java.lang.Throwable -> L1da
            r2.delete()     // Catch: java.lang.Throwable -> L1da
            goto L1da
        L1ec:
            throw r0
    }

    public static boolean L(android.content.Context r11, java.lang.String r12, x8.g r13, boolean r14) {
            x8.r r0 = new x8.r
            r0.<init>(r11)
            x8.u r1 = r0.a()
            java.lang.String r2 = "ai_stream"
            boolean r10 = r0.e(r2)
            x8.u r0 = r1.b()
            x8.a r3 = new x8.a
            java.lang.String r4 = r0.f21366b
            java.lang.String r5 = r0.f21367c
            java.lang.String r6 = r0.f21368d
            java.lang.String r7 = r0.f21369e
            java.lang.String r8 = r0.f21370f
            int r9 = r0.f21371g
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            boolean r0 = og.m.t0(r4)
            r1 = 0
            if (r0 == 0) goto L35
            java.lang.String r12 = "请先配置自动回复 AI Key"
            android.widget.Toast r11 = android.widget.Toast.makeText(r11, r12, r1)     // Catch: java.lang.Throwable -> L143
            r11.show()     // Catch: java.lang.Throwable -> L143
            return r1
        L35:
            java.lang.String r11 = a(r13)
            boolean r0 = og.m.t0(r11)
            if (r0 == 0) goto L41
            goto L143
        L41:
            java.util.concurrent.ConcurrentHashMap r0 = x8.q.f21334f
            java.lang.Object r2 = r0.get(r12)
            if (r2 != 0) goto L66
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r4 = og.m.t0(r8)
            if (r4 != 0) goto L5e
            x8.e r4 = new x8.e
            java.lang.String r5 = "system"
            r4.<init>(r5, r8)
            r2.add(r4)
        L5e:
            java.lang.Object r0 = r0.putIfAbsent(r12, r2)
            if (r0 != 0) goto L65
            goto L66
        L65:
            r2 = r0
        L66:
            java.util.List r2 = (java.util.List) r2
            monitor-enter(r2)
            java.lang.Object r0 = tf.m.v1(r2)     // Catch: java.lang.Throwable -> L74
            x8.e r0 = (x8.e) r0     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L78
            java.lang.String r0 = r0.f21260a     // Catch: java.lang.Throwable -> L74
            goto L79
        L74:
            r0 = move-exception
            r11 = r0
            goto L144
        L78:
            r0 = 0
        L79:
            java.lang.String r4 = "system"
            boolean r0 = gg.l.a(r0, r4)     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto La4
            java.lang.Object r0 = tf.m.t1(r2)     // Catch: java.lang.Throwable -> L74
            x8.e r0 = (x8.e) r0     // Catch: java.lang.Throwable -> L74
            java.lang.String r0 = r0.f21261b     // Catch: java.lang.Throwable -> L74
            boolean r0 = gg.l.a(r0, r8)     // Catch: java.lang.Throwable -> L74
            if (r0 != 0) goto La4
            boolean r0 = og.m.t0(r8)     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto L99
            r2.remove(r1)     // Catch: java.lang.Throwable -> L74
            goto Lda
        L99:
            x8.e r0 = new x8.e     // Catch: java.lang.Throwable -> L74
            java.lang.String r4 = "system"
            r0.<init>(r4, r8)     // Catch: java.lang.Throwable -> L74
            r2.set(r1, r0)     // Catch: java.lang.Throwable -> L74
            goto Lda
        La4:
            boolean r0 = r2.isEmpty()     // Catch: java.lang.Throwable -> L74
            if (r0 == 0) goto Lab
            goto Lc6
        Lab:
            java.util.Iterator r0 = r2.iterator()     // Catch: java.lang.Throwable -> L74
        Laf:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Throwable -> L74
            if (r4 == 0) goto Lc6
            java.lang.Object r4 = r0.next()     // Catch: java.lang.Throwable -> L74
            x8.e r4 = (x8.e) r4     // Catch: java.lang.Throwable -> L74
            java.lang.String r4 = r4.f21260a     // Catch: java.lang.Throwable -> L74
            java.lang.String r5 = "system"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L74
            if (r4 == 0) goto Laf
            goto Lda
        Lc6:
            java.lang.String r0 = r3.f21225e     // Catch: java.lang.Throwable -> L74
            boolean r0 = og.m.t0(r0)     // Catch: java.lang.Throwable -> L74
            if (r0 != 0) goto Lda
            x8.e r0 = new x8.e     // Catch: java.lang.Throwable -> L74
            java.lang.String r4 = "system"
            java.lang.String r5 = r3.f21225e     // Catch: java.lang.Throwable -> L74
            r0.<init>(r4, r5)     // Catch: java.lang.Throwable -> L74
            r2.add(r1, r0)     // Catch: java.lang.Throwable -> L74
        Lda:
            x8.e r0 = new x8.e     // Catch: java.lang.Throwable -> L74
            java.lang.String r4 = "user"
            r0.<init>(r4, r11)     // Catch: java.lang.Throwable -> L74
            r2.add(r0)     // Catch: java.lang.Throwable -> L74
            int r11 = r3.f21226f     // Catch: java.lang.Throwable -> L74
            R(r11, r2)     // Catch: java.lang.Throwable -> L74
            boolean r11 = r3.f21227g     // Catch: java.lang.Throwable -> L74
            if (r11 == 0) goto Lf9
            java.lang.String r11 = g(r3, r2)     // Catch: java.lang.Throwable -> L74
            if (r11 == 0) goto Lf4
            goto L104
        Lf4:
            java.lang.String r11 = f(r3, r2)     // Catch: java.lang.Throwable -> L74
            goto L104
        Lf9:
            java.lang.String r11 = f(r3, r2)     // Catch: java.lang.Throwable -> L74
            if (r11 == 0) goto L100
            goto L104
        L100:
            java.lang.String r11 = g(r3, r2)     // Catch: java.lang.Throwable -> L74
        L104:
            if (r11 != 0) goto L108
            java.lang.String r11 = ""
        L108:
            java.lang.String r11 = h(r11)     // Catch: java.lang.Throwable -> L74
            boolean r0 = og.m.t0(r11)     // Catch: java.lang.Throwable -> L74
            if (r0 != 0) goto L121
            x8.e r0 = new x8.e     // Catch: java.lang.Throwable -> L74
            java.lang.String r4 = "assistant"
            r0.<init>(r4, r11)     // Catch: java.lang.Throwable -> L74
            r2.add(r0)     // Catch: java.lang.Throwable -> L74
            int r0 = r3.f21226f     // Catch: java.lang.Throwable -> L74
            R(r0, r2)     // Catch: java.lang.Throwable -> L74
        L121:
            monitor-exit(r2)
            boolean r0 = og.m.t0(r11)
            if (r0 == 0) goto L129
            goto L143
        L129:
            k8.g r0 = p.a.q()
            if (r0 == 0) goto L143
            if (r14 == 0) goto L13e
            long r13 = r13.f21276d
            r1 = 0
            int r1 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r1 <= 0) goto L13e
            boolean r11 = r0.u(r13, r12, r11)
            return r11
        L13e:
            boolean r11 = I(r12, r11)
            return r11
        L143:
            return r1
        L144:
            monitor-exit(r2)
            throw r11
    }

    public static void M(long r2) {
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L7
            return
        L7:
            java.lang.Thread.sleep(r2)     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    public static java.util.ArrayList N(java.lang.String r3) {
            r0 = 4
            char[] r0 = new char[r0]
            r0 = {x004e: FILL_ARRAY_DATA , data: [124, -244, 44, 10} // fill-array
            r1 = 6
            java.util.List r3 = og.m.F0(r3, r0, r1)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = tf.n.e1(r3)
            r0.<init>(r1)
            java.util.Iterator r3 = r3.iterator()
        L18:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            j8.b.r(r1, r0)
            goto L18
        L28:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L31:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4d
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.length()
            if (r2 <= 0) goto L46
            r2 = 1
            goto L47
        L46:
            r2 = 0
        L47:
            if (r2 == 0) goto L31
            r3.add(r1)
            goto L31
        L4d:
            return r3
    }

    public static java.util.ArrayList O(java.lang.String r7) {
            java.lang.String r0 = ";;;"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r7 = og.m.G0(r7, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L13:
            boolean r1 = r7.hasNext()
            r2 = 0
            r3 = 1
            r4 = 6
            if (r1 == 0) goto L30
            java.lang.Object r1 = r7.next()
            java.lang.String r1 = (java.lang.String) r1
            char[] r3 = new char[r3]
            r5 = 10
            r3[r2] = r5
            java.util.List r1 = og.m.F0(r1, r3, r4)
            tf.r.h1(r0, r1)
            goto L13
        L30:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r0 = r0.iterator()
        L39:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L53
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            char[] r5 = new char[r3]
            r6 = 124(0x7c, float:1.74E-43)
            r5[r2] = r6
            java.util.List r1 = og.m.F0(r1, r5, r4)
            tf.r.h1(r7, r1)
            goto L39
        L53:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = tf.n.e1(r7)
            r0.<init>(r1)
            java.util.Iterator r7 = r7.iterator()
        L60:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L70
            java.lang.Object r1 = r7.next()
            java.lang.String r1 = (java.lang.String) r1
            j8.b.r(r1, r0)
            goto L60
        L70:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r0 = r0.iterator()
        L79:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L95
            java.lang.Object r1 = r0.next()
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.length()
            if (r4 <= 0) goto L8e
            r4 = r3
            goto L8f
        L8e:
            r4 = r2
        L8f:
            if (r4 == 0) goto L79
            r7.add(r1)
            goto L79
        L95:
            return r7
    }

    public static java.util.ArrayList P(java.lang.String r6) {
            r0 = 1
            char[] r1 = new char[r0]
            r2 = 0
            r3 = 124(0x7c, float:1.74E-43)
            r1[r2] = r3
            r3 = 6
            java.util.List r1 = og.m.F0(r6, r1, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = tf.n.e1(r1)
            r3.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L1a:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L2a
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            j8.b.r(r4, r3)
            goto L1a
        L2a:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r3 = r3.iterator()
        L33:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L4f
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5
            int r5 = r5.length()
            if (r5 <= 0) goto L48
            r5 = r0
            goto L49
        L48:
            r5 = r2
        L49:
            if (r5 == 0) goto L33
            r1.add(r4)
            goto L33
        L4f:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L7a
            java.util.List r6 = a.a.x0(r6)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L62:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L79
            java.lang.Object r1 = r6.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = og.m.t0(r2)
            if (r2 != 0) goto L62
            r0.add(r1)
            goto L62
        L79:
            return r0
        L7a:
            return r1
    }

    public static boolean Q(android.content.Context r12, java.lang.String r13, java.io.File r14) {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch
            r2 = 1
            r1.<init>(r2)
            java.util.concurrent.CountDownLatch r3 = new java.util.concurrent.CountDownLatch
            r3.<init>(r2)
            java.util.concurrent.atomic.AtomicBoolean r4 = new java.util.concurrent.atomic.AtomicBoolean
            r5 = 0
            r4.<init>(r5)
            long r6 = java.lang.System.nanoTime()
            java.lang.String r8 = "hchat_xiaozhi_"
            java.lang.String r6 = bc.e.g(r6, r8)
            gg.s r7 = new gg.s
            r7.<init>()
            r8 = -1
            r7.f4562g = r8
            android.speech.tts.TextToSpeech r9 = new android.speech.tts.TextToSpeech
            ob.a r10 = new ob.a
            r11 = 1
            r10.<init>(r7, r1, r11)
            r9.<init>(r12, r10)
            r10 = 8
            boolean r12 = r1.await(r10, r0)     // Catch: java.lang.Throwable -> L84
            if (r12 != 0) goto L3c
            r9.shutdown()     // Catch: java.lang.Throwable -> L3b
        L3b:
            return r5
        L3c:
            int r12 = r7.f4562g     // Catch: java.lang.Throwable -> L84
            if (r12 == 0) goto L44
            r9.shutdown()     // Catch: java.lang.Throwable -> L43
        L43:
            return r5
        L44:
            java.util.Locale r12 = java.util.Locale.CHINA     // Catch: java.lang.Throwable -> L49
            r9.setLanguage(r12)     // Catch: java.lang.Throwable -> L49
        L49:
            x8.p r12 = new x8.p     // Catch: java.lang.Throwable -> L84
            r12.<init>(r4, r3)     // Catch: java.lang.Throwable -> L84
            r9.setOnUtteranceProgressListener(r12)     // Catch: java.lang.Throwable -> L84
            android.os.Bundle r12 = new android.os.Bundle     // Catch: java.lang.Throwable -> L84
            r12.<init>()     // Catch: java.lang.Throwable -> L84
            java.lang.String r1 = "utteranceId"
            r12.putString(r1, r6)     // Catch: java.lang.Throwable -> L84
            int r12 = r9.synthesizeToFile(r13, r12, r14, r6)     // Catch: java.lang.Throwable -> L84
            if (r12 != r8) goto L65
            r9.shutdown()     // Catch: java.lang.Throwable -> L64
        L64:
            return r5
        L65:
            r12 = 20
            boolean r12 = r3.await(r12, r0)     // Catch: java.lang.Throwable -> L84
            if (r12 == 0) goto L86
            boolean r12 = r4.get()     // Catch: java.lang.Throwable -> L84
            if (r12 == 0) goto L86
            boolean r12 = r14.isFile()     // Catch: java.lang.Throwable -> L84
            if (r12 == 0) goto L86
            long r12 = r14.length()     // Catch: java.lang.Throwable -> L84
            r0 = 44
            int r12 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r12 <= 0) goto L86
            goto L87
        L84:
            r12 = move-exception
            goto L8b
        L86:
            r2 = r5
        L87:
            r9.shutdown()     // Catch: java.lang.Throwable -> L8a
        L8a:
            return r2
        L8b:
            r9.shutdown()     // Catch: java.lang.Throwable -> L8e
        L8e:
            throw r12
    }

    public static void R(int r4, java.util.List r5) {
            if (r4 >= 0) goto L3
            r4 = 0
        L3:
            int r4 = r4 * 2
            java.lang.Object r0 = tf.m.v1(r5)
            x8.e r0 = (x8.e) r0
            r1 = 0
            if (r0 == 0) goto L11
            java.lang.String r0 = r0.f21260a
            goto L12
        L11:
            r0 = r1
        L12:
            java.lang.String r2 = "system"
            boolean r0 = gg.l.a(r0, r2)
            int r0 = r0 + r4
            if (r0 > 0) goto L1f
            r5.clear()
            return
        L1f:
            int r4 = r5.size()
            if (r4 <= r0) goto L44
            java.lang.Object r4 = tf.m.v1(r5)
            x8.e r4 = (x8.e) r4
            if (r4 == 0) goto L30
            java.lang.String r4 = r4.f21260a
            goto L31
        L30:
            r4 = r1
        L31:
            boolean r4 = gg.l.a(r4, r2)
            if (r4 < 0) goto L44
            int r3 = r5.size()
            if (r4 >= r3) goto L44
            java.lang.Object r4 = r5.remove(r4)
            x8.e r4 = (x8.e) r4
            goto L1f
        L44:
            return
    }

    public static byte[] S(java.io.File r18) {
            byte[] r0 = dg.l.g0(r18)
            int r1 = r0.length
            r2 = 44
            r3 = 0
            if (r1 <= r2) goto L125
            java.nio.charset.Charset r1 = og.a.f9805b
            java.lang.String r2 = new java.lang.String
            r4 = 4
            r2.<init>(r0, r3, r4, r1)
            java.lang.String r1 = "RIFF"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L1c
            goto L125
        L1c:
            r1 = 12
            r2 = 16
            r5 = 16000(0x3e80, float:2.2421E-41)
            r6 = 1
            r8 = r2
            r9 = r5
            r7 = r6
        L26:
            int r10 = r1 + 8
            int r11 = r0.length
            if (r10 > r11) goto L71
            java.nio.charset.Charset r11 = og.a.f9805b
            java.lang.String r12 = new java.lang.String
            r12.<init>(r0, r1, r4, r11)
            int r11 = r1 + 4
            int r11 = u(r0, r11)
            int r13 = r10 + r11
            int r14 = r0.length
            if (r13 <= r14) goto L3e
            goto L71
        L3e:
            java.lang.String r14 = "fmt "
            boolean r14 = r12.equals(r14)
            if (r14 == 0) goto L64
            if (r11 < r2) goto L6d
            int r7 = r1 + 10
            int r7 = t(r0, r7)
            if (r7 >= r6) goto L51
            r7 = r6
        L51:
            int r8 = r1 + 12
            int r8 = u(r0, r8)
            r9 = 8000(0x1f40, float:1.121E-41)
            if (r8 >= r9) goto L5c
            goto L5d
        L5c:
            r9 = r8
        L5d:
            int r1 = r1 + 22
            int r8 = t(r0, r1)
            goto L6d
        L64:
            java.lang.String r1 = "data"
            boolean r1 = r12.equals(r1)
            if (r1 == 0) goto L6d
            goto L73
        L6d:
            r1 = r11 & 1
            int r1 = r1 + r13
            goto L26
        L71:
            r10 = -1
            r11 = r3
        L73:
            if (r10 < 0) goto L122
            if (r11 <= 0) goto L122
            if (r8 == r2) goto L7b
            goto L122
        L7b:
            int r11 = r11 / 2
            int r11 = r11 / r7
            if (r11 > 0) goto L83
            byte[] r0 = new byte[r3]
            return r0
        L83:
            short[] r1 = new short[r11]
            r2 = r3
        L86:
            r4 = 32767(0x7fff, float:4.5916E-41)
            r8 = -32768(0xffffffffffff8000, float:NaN)
            if (r2 < r11) goto L103
            if (r9 != r5) goto L90
        L8e:
            r15 = r6
            goto Le2
        L90:
            if (r11 != 0) goto L94
        L92:
            r15 = r6
            goto Le0
        L94:
            if (r9 <= 0) goto L92
            if (r9 != r5) goto L99
            goto L8e
        L99:
            long r12 = (long) r11
            long r14 = (long) r5
            long r12 = r12 * r14
            long r14 = (long) r9
            long r12 = r12 / r14
            r14 = 1
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 >= 0) goto La5
            r12 = r14
        La5:
            int r0 = (int) r12
            short[] r2 = new short[r0]
            r7 = r3
        La9:
            if (r7 < r0) goto Lad
            r1 = r2
            goto L8e
        Lad:
            double r12 = (double) r7
            double r14 = (double) r9
            double r12 = r12 * r14
            double r14 = (double) r5
            double r12 = r12 / r14
            int r10 = (int) r12
            int r14 = r11 + (-1)
            int r10 = r9.e0.r(r10, r3, r14)
            int r15 = r10 + 1
            if (r15 <= r14) goto Lbf
        Lbd:
            r15 = r6
            goto Lc1
        Lbf:
            r14 = r15
            goto Lbd
        Lc1:
            double r5 = (double) r10
            double r12 = r12 - r5
            short r5 = r1[r10]
            double r5 = (double) r5
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r16 = r16 - r12
            double r16 = r16 * r5
            short r5 = r1[r14]
            double r5 = (double) r5
            double r5 = r5 * r12
            double r5 = r5 + r16
            int r5 = (int) r5
            int r5 = r9.e0.r(r5, r8, r4)
            short r5 = (short) r5
            r2[r7] = r5
            int r7 = r7 + 1
            r6 = r15
            r5 = 16000(0x3e80, float:2.2421E-41)
            goto La9
        Le0:
            short[] r1 = new short[r3]
        Le2:
            int r0 = r1.length
            int r0 = r0 * 2
            byte[] r0 = new byte[r0]
            int r2 = r1.length
            r4 = r3
        Le9:
            if (r3 >= r2) goto L102
            short r5 = r1[r3]
            int r6 = r4 + 1
            int r4 = r4 * 2
            r7 = r5 & 255(0xff, float:3.57E-43)
            byte r7 = (byte) r7
            r0[r4] = r7
            int r4 = r4 + r15
            int r5 = r5 >>> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r0[r4] = r5
            int r3 = r3 + 1
            r4 = r6
            goto Le9
        L102:
            return r0
        L103:
            r15 = r6
            r5 = r3
            r6 = r5
        L106:
            if (r5 >= r7) goto L113
            int r12 = t(r0, r10)
            short r12 = (short) r12
            int r6 = r6 + r12
            int r10 = r10 + 2
            int r5 = r5 + 1
            goto L106
        L113:
            int r6 = r6 / r7
            int r4 = r9.e0.r(r6, r8, r4)
            short r4 = (short) r4
            r1[r2] = r4
            int r2 = r2 + 1
            r6 = r15
            r5 = 16000(0x3e80, float:2.2421E-41)
            goto L86
        L122:
            byte[] r0 = new byte[r3]
            return r0
        L125:
            byte[] r0 = new byte[r3]
            return r0
    }

    public static void T(java.io.ByteArrayOutputStream r1, int r2) {
            r0 = r2 & 255(0xff, float:3.57E-43)
            r1.write(r0)
            int r0 = r2 >>> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1.write(r0)
            int r0 = r2 >>> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1.write(r0)
            int r2 = r2 >>> 24
            r2 = r2 & 255(0xff, float:3.57E-43)
            r1.write(r2)
            return
    }

    public static void U(java.io.ByteArrayOutputStream r8, int r9, long r10, int r12, int r13, java.util.List r14) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r14.iterator()
        L9:
            boolean r2 = r1.hasNext()
            r3 = 255(0xff, float:3.57E-43)
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.next()
            byte[] r2 = (byte[]) r2
            int r2 = r2.length
        L18:
            if (r2 < r3) goto L24
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r0.add(r4)
            int r2 = r2 + (-255)
            goto L18
        L24:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
            goto L9
        L2c:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            java.lang.String r2 = "OggS"
            java.nio.charset.Charset r4 = og.a.f9805b
            byte[] r2 = r2.getBytes(r4)
            r2.getClass()
            r1.write(r2)
            r2 = 0
            r1.write(r2)
            r1.write(r9)
            r9 = r2
        L47:
            r4 = 8
            if (r9 < r4) goto Lc6
            T(r1, r12)
            T(r1, r13)
            T(r1, r2)
            int r9 = r0.size()
            r1.write(r9)
            java.util.Iterator r9 = r0.iterator()
        L5f:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L73
            java.lang.Object r10 = r9.next()
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r1.write(r10)
            goto L5f
        L73:
            java.util.Iterator r9 = r14.iterator()
        L77:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L87
            java.lang.Object r10 = r9.next()
            byte[] r10 = (byte[]) r10
            r1.write(r10)
            goto L77
        L87:
            byte[] r9 = r1.toByteArray()
            r9.getClass()
            int r10 = r9.length
            r11 = r2
        L90:
            if (r2 >= r10) goto La3
            r12 = r9[r2]
            int r13 = r11 << 8
            int r11 = r11 >>> 24
            r12 = r12 & r3
            r11 = r11 ^ r12
            r11 = r11 & r3
            int[] r12 = x8.q.f21339k
            r11 = r12[r11]
            r11 = r11 ^ r13
            int r2 = r2 + 1
            goto L90
        La3:
            r10 = r11 & 255(0xff, float:3.57E-43)
            byte r10 = (byte) r10
            r12 = 22
            r9[r12] = r10
            int r10 = r11 >>> 8
            r10 = r10 & r3
            byte r10 = (byte) r10
            r12 = 23
            r9[r12] = r10
            int r10 = r11 >>> 16
            r10 = r10 & r3
            byte r10 = (byte) r10
            r12 = 24
            r9[r12] = r10
            int r10 = r11 >>> 24
            r10 = r10 & r3
            byte r10 = (byte) r10
            r11 = 25
            r9[r11] = r10
            r8.write(r9)
            return
        Lc6:
            int r4 = r9 * 8
            long r4 = r10 >>> r4
            r6 = 255(0xff, double:1.26E-321)
            long r4 = r4 & r6
            int r4 = (int) r4
            r1.write(r4)
            int r9 = r9 + 1
            goto L47
    }

    public static java.io.File V(android.content.Context r17, java.util.List r18, int r19, int r20, int r21) {
            java.lang.String r0 = "xiaozhi_"
            java.lang.String r1 = "[Hchat:AutoReply] 小智语音解码失败: code="
            java.lang.String r2 = "[Hchat:AutoReply] 小智语音转Silk失败: code="
            r3 = 0
            java.io.File r4 = new java.io.File     // Catch: java.lang.Throwable -> L87
            java.io.File r5 = r17.getCacheDir()     // Catch: java.lang.Throwable -> L87
            java.lang.String r6 = "hchat_xiaozhi_voice"
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L87
            r4.mkdirs()     // Catch: java.lang.Throwable -> L87
            java.lang.String r5 = ".ogg"
            java.io.File r5 = java.io.File.createTempFile(r0, r5, r4)     // Catch: java.lang.Throwable -> L87
            java.lang.String r6 = ".pcm"
            java.io.File r6 = java.io.File.createTempFile(r0, r6, r4)     // Catch: java.lang.Throwable -> L87
            java.lang.String r7 = ".silk"
            java.io.File r0 = java.io.File.createTempFile(r0, r7, r4)     // Catch: java.lang.Throwable -> L87
            byte[] r4 = e(r18, r19, r20, r21)     // Catch: java.lang.Throwable -> L87
            r5.getClass()     // Catch: java.lang.Throwable -> L87
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L87
            r7.<init>(r5)     // Catch: java.lang.Throwable -> L87
            r7.write(r4)     // Catch: java.lang.Throwable -> Lcb
            r7.close()     // Catch: java.lang.Throwable -> L87
            java.lang.String r4 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L87
            java.lang.String r7 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> L87
            int r4 = me.yun.silk.AacCodec.decodeAacFile(r4, r7, r3)     // Catch: java.lang.Throwable -> L87
            if (r4 != 0) goto La9
            boolean r7 = r6.isFile()     // Catch: java.lang.Throwable -> L87
            if (r7 == 0) goto La9
            long r7 = r6.length()     // Catch: java.lang.Throwable -> L87
            r9 = 0
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 > 0) goto L58
            goto La9
        L58:
            me.yun.silk.SilkCodec r11 = new me.yun.silk.SilkCodec     // Catch: java.lang.Throwable -> L87
            r11.<init>()     // Catch: java.lang.Throwable -> L87
            java.lang.String r12 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> L87
            java.lang.String r13 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L87
            r15 = 48000(0xbb80, float:6.7262E-41)
            r16 = 1
            r14 = 24000(0x5dc0, float:3.3631E-41)
            int r1 = r11.pcmToSilk(r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L87
            r5.delete()     // Catch: java.lang.Throwable -> L73
        L73:
            r6.delete()     // Catch: java.lang.Throwable -> L76
        L76:
            if (r1 != 0) goto L89
            boolean r4 = r0.isFile()     // Catch: java.lang.Throwable -> L87
            if (r4 == 0) goto L89
            long r4 = r0.length()     // Catch: java.lang.Throwable -> L87
            int r4 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r4 <= 0) goto L89
            goto Ld9
        L87:
            r0 = move-exception
            goto Ld3
        L89:
            long r4 = r0.length()     // Catch: java.lang.Throwable -> L87
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L87
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L87
            r6.append(r1)     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = " silkLen="
            r6.append(r1)     // Catch: java.lang.Throwable -> L87
            r6.append(r4)     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L87
            fb.v0.m(r1)     // Catch: java.lang.Throwable -> L87
            r0.delete()     // Catch: java.lang.Throwable -> La7
        La7:
            r0 = r3
            goto Ld9
        La9:
            long r7 = r5.length()     // Catch: java.lang.Throwable -> L87
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L87
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L87
            r2.append(r4)     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = " oggLen="
            r2.append(r1)     // Catch: java.lang.Throwable -> L87
            r2.append(r7)     // Catch: java.lang.Throwable -> L87
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L87
            fb.v0.m(r1)     // Catch: java.lang.Throwable -> L87
            r6.delete()     // Catch: java.lang.Throwable -> Lc7
        Lc7:
            r0.delete()     // Catch: java.lang.Throwable -> La7
            goto La7
        Lcb:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch: java.lang.Throwable -> Lce
        Lce:
            r0 = move-exception
            ig.a.i(r7, r1)     // Catch: java.lang.Throwable -> L87
            throw r0     // Catch: java.lang.Throwable -> L87
        Ld3:
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        Ld9:
            java.lang.Throwable r1 = sf.g.b(r0)
            if (r1 != 0) goto Le1
            r3 = r0
            goto Lea
        Le1:
            java.lang.String r0 = r1.getMessage()
            java.lang.String r2 = "[Hchat:AutoReply] 生成小智语音文件失败: "
            eh.a.x(r2, r0, r1)
        Lea:
            java.io.File r3 = (java.io.File) r3
            return r3
    }

    public static java.lang.String W(android.content.Context r10) {
            java.lang.String r10 = X(r10)     // Catch: java.lang.Throwable -> L5b
            java.util.UUID r10 = java.util.UUID.fromString(r10)     // Catch: java.lang.Throwable -> L5b
            r0 = 16
            byte[] r1 = new byte[r0]     // Catch: java.lang.Throwable -> L5b
            long r2 = r10.getMostSignificantBits()     // Catch: java.lang.Throwable -> L5b
            long r4 = r10.getLeastSignificantBits()     // Catch: java.lang.Throwable -> L5b
            r10 = 0
        L15:
            r6 = 255(0xff, double:1.26E-321)
            r8 = 8
            if (r10 < r8) goto L4e
            r10 = r8
        L1c:
            if (r10 < r0) goto L41
            java.lang.String r10 = "SHA-256"
            java.security.MessageDigest r10 = java.security.MessageDigest.getInstance(r10)     // Catch: java.lang.Throwable -> L5b
            byte[] r10 = r10.digest(r1)     // Catch: java.lang.Throwable -> L5b
            r10.getClass()     // Catch: java.lang.Throwable -> L5b
            java.util.List r0 = tf.l.I0(r10)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r1 = ":"
            wb.sr r4 = new wb.sr     // Catch: java.lang.Throwable -> L5b
            r10 = 21
            r4.<init>(r10)     // Catch: java.lang.Throwable -> L5b
            r5 = 30
            r2 = 0
            r3 = 0
            java.lang.String r10 = tf.m.A1(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L5b
            goto L63
        L41:
            int r2 = 15 - r10
            int r2 = r2 * r8
            long r2 = r4 >>> r2
            long r2 = r2 & r6
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L5b
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L5b
            r1[r10] = r2     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + 1
            goto L1c
        L4e:
            int r9 = 7 - r10
            int r9 = r9 * r8
            long r8 = r2 >>> r9
            long r6 = r6 & r8
            int r6 = (int) r6     // Catch: java.lang.Throwable -> L5b
            byte r6 = (byte) r6     // Catch: java.lang.Throwable -> L5b
            r1[r10] = r6     // Catch: java.lang.Throwable -> L5b
            int r10 = r10 + 1
            goto L15
        L5b:
            r0 = move-exception
            r10 = r0
            sf.f r0 = new sf.f
            r0.<init>(r10)
            r10 = r0
        L63:
            java.lang.Throwable r0 = sf.g.b(r10)
            if (r0 != 0) goto L6a
            goto L75
        L6a:
            java.lang.String r10 = r0.getMessage()
            java.lang.String r1 = "[Hchat:AutoReply] 生成小智设备 MAC 失败: "
            eh.a.x(r1, r10, r0)
            java.lang.String r10 = "00:00:00:00:00:00"
        L75:
            java.lang.String r10 = (java.lang.String) r10
            return r10
    }

    public static java.lang.String X(android.content.Context r1) {
            android.content.ContentResolver r1 = r1.getContentResolver()
            java.lang.String r0 = "android_id"
            java.lang.String r1 = android.provider.Settings.Secure.getString(r1, r0)
            if (r1 == 0) goto Ld
            goto Lf
        Ld:
            java.lang.String r1 = "default_android_id"
        Lf:
            java.nio.charset.Charset r0 = og.a.f9804a
            byte[] r1 = r1.getBytes(r0)
            r1.getClass()
            java.util.UUID r1 = java.util.UUID.nameUUIDFromBytes(r1)
            java.lang.String r1 = r1.toString()
            r1.getClass()
            return r1
    }

    public static org.json.JSONObject Y(java.lang.String r3, java.lang.String r4, x8.t r5) {
            java.lang.String r0 = "type"
            java.lang.String r1 = "listen"
            java.lang.String r2 = "session_id"
            org.json.JSONObject r3 = wb.en.l(r2, r3, r0, r1)
            java.lang.String r0 = "state"
            r3.put(r0, r4)
            java.lang.String r4 = "mode"
            java.lang.String r0 = "manual"
            r3.put(r4, r0)
            B(r3, r5)
            return r3
    }

    public static x8.n Z(android.content.Context r7, java.lang.String r8, java.lang.String r9, x8.t r10, boolean r11) {
            java.lang.String r0 = r10.f21349a
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r10.f21354f
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = r10.f21356h
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = java.lang.String.valueOf(r11)
            java.lang.String r4 = r10.f21359k
            java.lang.CharSequence r4 = og.m.R0(r4)
            java.lang.String r4 = r4.toString()
            boolean r4 = og.m.t0(r4)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4}
            java.util.List r1 = a.a.y0(r0)
            r5 = 0
            r6 = 62
            java.lang.String r2 = "|"
            r3 = 0
            r4 = 0
            java.lang.String r0 = tf.m.A1(r1, r2, r3, r4, r5, r6)
        L47:
            java.util.concurrent.ConcurrentHashMap r1 = x8.q.f21336h
            java.lang.Object r2 = r1.get(r8)
            x8.n r2 = (x8.n) r2
            if (r2 == 0) goto L77
            java.util.concurrent.atomic.AtomicBoolean r3 = r2.f21320g
            boolean r3 = r3.get()
            if (r3 != 0) goto L77
            java.util.concurrent.atomic.AtomicReference r3 = r2.f21318e
            java.lang.Object r3 = r3.get()
            if (r3 != 0) goto L62
            goto L77
        L62:
            java.util.concurrent.atomic.AtomicReference r3 = r2.f21319f
            java.lang.Object r3 = r3.get()
            if (r3 == 0) goto L6b
            goto L77
        L6b:
            java.lang.String r3 = r2.f21315b
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L77
            r2.e()
            return r2
        L77:
            okhttp3.Request$Builder r3 = new okhttp3.Request$Builder
            r3.<init>()
            okhttp3.Request$Builder r3 = r3.url(r9)
            java.lang.String r4 = "Authorization"
            java.lang.String r5 = "Bearer test-token"
            okhttp3.Request$Builder r3 = r3.addHeader(r4, r5)
            java.lang.String r4 = "Device-Id"
            java.lang.String r5 = W(r7)
            okhttp3.Request$Builder r3 = r3.addHeader(r4, r5)
            java.lang.String r4 = "Client-Id"
            java.lang.String r5 = X(r7)
            okhttp3.Request$Builder r3 = r3.addHeader(r4, r5)
            java.lang.String r4 = "Protocol-Version"
            java.lang.String r5 = "1"
            okhttp3.Request$Builder r3 = r3.addHeader(r4, r5)
            okhttp3.Request r3 = r3.build()
            x8.n r4 = new x8.n
            r4.<init>(r8, r0, r10, r11)
            if (r2 != 0) goto Lb9
            java.lang.Object r1 = r1.putIfAbsent(r8, r4)
            if (r1 != 0) goto Lb7
            r1 = 1
            goto Lbd
        Lb7:
            r1 = 0
            goto Lbd
        Lb9:
            boolean r1 = r1.replace(r8, r2, r4)
        Lbd:
            if (r1 == 0) goto L47
            if (r2 == 0) goto Lc6
            java.lang.String r7 = "replaced"
            r2.a(r7)
        Lc6:
            r3.getClass()
            okhttp3.OkHttpClient r7 = x8.q.f21331c
            x8.j r8 = r4.f21324k
            okhttp3.WebSocket r7 = r7.newWebSocket(r3, r8)
            java.util.concurrent.atomic.AtomicReference r8 = r4.f21318e
            r8.set(r7)
            r4.e()
            wb.cr r7 = new wb.cr
            r8 = 4
            r7.<init>(r4, r8)
            r8 = 90000(0x15f90, double:4.4466E-319)
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledExecutorService r11 = x8.q.f21330b
            r11.schedule(r7, r8, r10)
            return r4
    }

    public static java.lang.String a(x8.g r1) {
            java.lang.String r1 = r1.f21275c
            java.lang.String r0 = "@[^\\s]+\\s+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r0.getClass()
            r1.getClass()
            java.util.regex.Matcher r1 = r0.matcher(r1)
            java.lang.String r0 = ""
            java.lang.String r1 = r1.replaceAll(r0)
            r1.getClass()
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            return r1
    }

    public static org.json.JSONObject b(x8.a r4, java.util.List r5, boolean r6) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "model"
            java.lang.String r4 = r4.f21224d
            r0.put(r1, r4)
            java.lang.String r4 = "temperature"
            r1 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            r0.put(r4, r1)
            java.lang.String r4 = "stream"
            r0.put(r4, r6)
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>()
            java.util.Iterator r5 = r5.iterator()
        L24:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L47
            java.lang.Object r6 = r5.next()
            x8.e r6 = (x8.e) r6
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "role"
            java.lang.String r3 = r6.f21260a
            r1.put(r2, r3)
            java.lang.String r2 = "content"
            java.lang.String r6 = r6.f21261b
            r1.put(r2, r6)
            r4.put(r1)
            goto L24
        L47:
            java.lang.String r5 = "messages"
            r0.put(r5, r4)
            return r0
    }

    public static void c(x8.r r6, java.lang.String r7, x8.f r8) {
            boolean r0 = og.m.t0(r7)
            if (r0 == 0) goto L8
            goto Lf5
        L8:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.lang.String r1 = r8.f21262a
            boolean r1 = r6.e(r1)
            if (r1 == 0) goto L1a
            java.lang.String r1 = "新加好友"
            r0.add(r1)
        L1a:
            java.lang.String r1 = r8.f21263b
            boolean r1 = r6.e(r1)
            if (r1 == 0) goto L31
            java.lang.String r1 = r8.f21264c
            java.lang.String r2 = "yyyy-MM-dd"
            java.lang.String r1 = r6.h(r1, r2)
            java.lang.String r1 = n(r1, r2)
            r0.add(r1)
        L31:
            java.lang.String r1 = r8.f21265d
            boolean r1 = r6.e(r1)
            if (r1 == 0) goto L97
            java.lang.String r8 = r8.f21266e
            java.lang.String r1 = ""
            java.lang.String r6 = r6.h(r8, r1)
            java.lang.String r8 = "|"
            java.lang.String r1 = "\n"
            java.lang.String r2 = ";;;"
            java.lang.String[] r8 = new java.lang.String[]{r2, r8, r1}
            java.util.List r6 = og.m.G0(r6, r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            int r1 = tf.n.e1(r6)
            r8.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L5c:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L6c
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            j8.b.r(r1, r8)
            goto L5c
        L6c:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r8 = r8.iterator()
        L75:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L8c
            java.lang.Object r1 = r8.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.length()
            if (r2 <= 0) goto L75
            r6.add(r1)
            goto L75
        L8c:
            java.util.Set r6 = tf.m.T1(r6)
            java.util.List r6 = tf.m.P1(r6)
            tf.r.h1(r0, r6)
        L97:
            boolean r6 = r0.isEmpty()
            if (r6 == 0) goto L9e
            goto Lf5
        L9e:
            g8.i r6 = wb.en.c()
            if (r6 == 0) goto Lf5
            java.util.Iterator r8 = r0.iterator()
        La8:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto Ld2
            java.lang.Object r1 = r8.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = r6.a(r1)     // Catch: java.lang.Throwable -> Lb9
            goto Lc0
        Lb9:
            r2 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r2)
            r2 = r3
        Lc0:
            java.lang.Throwable r2 = sf.g.b(r2)
            if (r2 == 0) goto La8
            java.lang.String r3 = r2.getMessage()
            java.lang.String r4 = "[Hchat:AutoReply] 创建好友标签失败: "
            java.lang.String r5 = " "
            eh.a.w(r4, r1, r5, r3, r2)
            goto La8
        Ld2:
            java.util.List r8 = tf.m.P1(r0)     // Catch: java.lang.Throwable -> Ldf
            boolean r6 = r6.P(r7, r8)     // Catch: java.lang.Throwable -> Ldf
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> Ldf
            goto Le6
        Ldf:
            r6 = move-exception
            sf.f r7 = new sf.f
            r7.<init>(r6)
            r6 = r7
        Le6:
            java.lang.Throwable r6 = sf.g.b(r6)
            if (r6 == 0) goto Lf5
            java.lang.String r7 = r6.getMessage()
            java.lang.String r8 = "[Hchat:AutoReply] 修改好友标签失败: "
            eh.a.x(r8, r7, r6)
        Lf5:
            return
    }

    public static void d(x8.r r7, java.lang.String r8, x8.f r9) {
            boolean r0 = og.m.t0(r8)
            if (r0 == 0) goto L8
            goto Lb3
        L8:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r0 = r9.f21267f
            boolean r0 = r7.e(r0)
            if (r0 == 0) goto L1a
            java.lang.String r0 = "新加好友"
            r1.add(r0)
        L1a:
            java.lang.String r0 = r9.f21269h
            boolean r0 = r7.e(r0)
            if (r0 == 0) goto L31
            java.lang.String r0 = r9.f21270i
            java.lang.String r2 = "yyMMdd"
            java.lang.String r0 = r7.h(r0, r2)
            java.lang.String r0 = n(r0, r2)
            r1.add(r0)
        L31:
            java.lang.String r0 = r9.f21271j
            boolean r0 = r7.e(r0)
            if (r0 == 0) goto L56
            java.lang.String r0 = r9.f21272k
            java.lang.String r2 = ""
            java.lang.String r0 = r7.h(r0, r2)
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            boolean r2 = og.m.t0(r0)
            if (r2 != 0) goto L50
            goto L51
        L50:
            r0 = 0
        L51:
            if (r0 == 0) goto L56
            r1.add(r0)
        L56:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L5d
            goto Lb3
        L5d:
            g8.i r0 = wb.en.c()
            if (r0 == 0) goto Lb3
            r5 = 0
            r6 = 62
            java.lang.String r2 = ""
            r3 = 0
            r4 = 0
            java.lang.String r1 = tf.m.A1(r1, r2, r3, r4, r5, r6)
            h.Hchat.hooks.api.model.WeChatContact r2 = r0.n(r8)
            if (r2 == 0) goto L86
            java.lang.String r3 = r2.nickname
            boolean r4 = og.m.t0(r3)
            if (r4 == 0) goto L80
            java.lang.String r3 = r2.displayName()
        L80:
            boolean r2 = og.m.t0(r3)
            if (r2 == 0) goto L87
        L86:
            r3 = r8
        L87:
            java.lang.String r9 = r9.f21268g
            boolean r7 = r7.e(r9)
            if (r7 == 0) goto L93
            java.lang.String r1 = r3.concat(r1)
        L93:
            boolean r7 = r0.Q(r8, r1)     // Catch: java.lang.Throwable -> L9c
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L9c
            goto La4
        L9c:
            r0 = move-exception
            r7 = r0
            sf.f r8 = new sf.f
            r8.<init>(r7)
            r7 = r8
        La4:
            java.lang.Throwable r7 = sf.g.b(r7)
            if (r7 == 0) goto Lb3
            java.lang.String r8 = r7.getMessage()
            java.lang.String r9 = "[Hchat:AutoReply] 修改好友备注失败: "
            eh.a.x(r9, r8, r7)
        Lb3:
            return
    }

    public static byte[] e(java.util.List r16, int r17, int r18, int r19) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            jg.a r1 = jg.d.f6902g
            int r4 = r1.b()
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            java.nio.charset.Charset r7 = og.a.f9805b
            java.lang.String r2 = "OpusHead"
            byte[] r2 = r2.getBytes(r7)
            r2.getClass()
            r1.write(r2)
            r8 = 1
            r1.write(r8)
            r9 = 2
            r2 = r18
            int r2 = r9.e0.r(r2, r8, r9)
            r1.write(r2)
            r2 = 56
            r1.write(r2)
            r1.write(r8)
            r2 = 8000(0x1f40, float:1.121E-41)
            r3 = r17
            if (r3 >= r2) goto L3b
            goto L3c
        L3b:
            r2 = r3
        L3c:
            T(r1, r2)
            r10 = 0
            r1.write(r10)
            r1.write(r10)
            r1.write(r10)
            byte[] r1 = r1.toByteArray()
            r1.getClass()
            java.util.List r6 = a.a.x0(r1)
            r1 = 2
            r2 = 0
            r5 = 0
            U(r0, r1, r2, r4, r5, r6)
            java.lang.String r1 = "Hchat Xiaozhi"
            java.nio.charset.Charset r2 = og.a.f9804a
            byte[] r1 = r1.getBytes(r2)
            r1.getClass()
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            java.lang.String r3 = "OpusTags"
            byte[] r3 = r3.getBytes(r7)
            r3.getClass()
            r2.write(r3)
            int r3 = r1.length
            T(r2, r3)
            r2.write(r1)
            T(r2, r10)
            byte[] r1 = r2.toByteArray()
            r1.getClass()
            java.util.List r6 = a.a.x0(r1)
            r1 = 0
            r2 = 0
            r5 = 1
            U(r0, r1, r2, r4, r5, r6)
            r1 = 48000(0xbb80, double:2.3715E-319)
            r3 = r19
            long r5 = (long) r3
            long r5 = r5 * r1
            r1 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r1
            r1 = 960(0x3c0, double:4.743E-321)
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 >= 0) goto La5
            r11 = r1
            goto La6
        La5:
            r11 = r5
        La6:
            java.util.Iterator r7 = r16.iterator()
            r1 = 0
            r5 = r9
            r3 = r10
        Lae:
            boolean r6 = r7.hasNext()
            if (r6 == 0) goto Lde
            java.lang.Object r6 = r7.next()
            int r9 = r3 + 1
            if (r3 < 0) goto Ld9
            byte[] r6 = (byte[]) r6
            long r1 = r1 + r11
            int r13 = r16.size()
            int r13 = r13 - r8
            if (r3 != r13) goto Lc8
            r3 = 4
            goto Lc9
        Lc8:
            r3 = r10
        Lc9:
            int r13 = r5 + 1
            java.util.List r6 = a.a.x0(r6)
            r14 = r1
            r1 = r3
            r2 = r14
            U(r0, r1, r2, r4, r5, r6)
            r1 = r2
            r3 = r9
            r5 = r13
            goto Lae
        Ld9:
            a.a.Q0()
            r0 = 0
            throw r0
        Lde:
            byte[] r0 = r0.toByteArray()
            r0.getClass()
            return r0
    }

    public static java.lang.String f(x8.a r8, java.util.List r9) {
            java.lang.String r0 = "application/json"
            java.lang.String r1 = "Bearer "
            r2 = 0
            r3 = 0
            org.json.JSONObject r9 = b(r8, r9, r2)     // Catch: java.lang.Throwable -> La4
            okhttp3.OkHttpClient r4 = x8.q.f21331c     // Catch: java.lang.Throwable -> La4
            okhttp3.Request$Builder r5 = new okhttp3.Request$Builder     // Catch: java.lang.Throwable -> La4
            r5.<init>()     // Catch: java.lang.Throwable -> La4
            java.lang.String r6 = m(r8)     // Catch: java.lang.Throwable -> La4
            okhttp3.Request$Builder r5 = r5.url(r6)     // Catch: java.lang.Throwable -> La4
            java.lang.String r6 = "Content-Type"
            okhttp3.Request$Builder r5 = r5.addHeader(r6, r0)     // Catch: java.lang.Throwable -> La4
            java.lang.String r6 = "Authorization"
            java.lang.String r8 = r8.f21221a     // Catch: java.lang.Throwable -> La4
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La4
            r7.<init>(r1)     // Catch: java.lang.Throwable -> La4
            r7.append(r8)     // Catch: java.lang.Throwable -> La4
            java.lang.String r8 = r7.toString()     // Catch: java.lang.Throwable -> La4
            okhttp3.Request$Builder r8 = r5.addHeader(r6, r8)     // Catch: java.lang.Throwable -> La4
            okhttp3.RequestBody$Companion r1 = okhttp3.RequestBody.Companion     // Catch: java.lang.Throwable -> La4
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> La4
            r9.getClass()     // Catch: java.lang.Throwable -> La4
            okhttp3.MediaType$Companion r5 = okhttp3.MediaType.Companion     // Catch: java.lang.Throwable -> La4
            okhttp3.MediaType r0 = r5.get(r0)     // Catch: java.lang.Throwable -> La4
            okhttp3.RequestBody r9 = r1.create(r9, r0)     // Catch: java.lang.Throwable -> La4
            okhttp3.Request$Builder r8 = r8.post(r9)     // Catch: java.lang.Throwable -> La4
            okhttp3.Request r8 = r8.build()     // Catch: java.lang.Throwable -> La4
            okhttp3.Call r8 = r4.newCall(r8)     // Catch: java.lang.Throwable -> La4
            okhttp3.Response r8 = r8.execute()     // Catch: java.lang.Throwable -> La4
            okhttp3.ResponseBody r9 = r8.body()     // Catch: java.lang.Throwable -> L61
            if (r9 == 0) goto L63
            java.lang.String r9 = r9.string()     // Catch: java.lang.Throwable -> L61
            goto L64
        L61:
            r9 = move-exception
            goto Lab
        L63:
            r9 = r3
        L64:
            if (r9 != 0) goto L68
            java.lang.String r9 = ""
        L68:
            boolean r0 = r8.isSuccessful()     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto La6
            boolean r0 = og.m.t0(r9)     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L75
            goto La6
        L75:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L61
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L61
            java.lang.String r9 = "choices"
            org.json.JSONArray r9 = r0.optJSONArray(r9)     // Catch: java.lang.Throwable -> L61
            if (r9 == 0) goto L9f
            org.json.JSONObject r9 = r9.optJSONObject(r2)     // Catch: java.lang.Throwable -> L61
            if (r9 == 0) goto L9f
            java.lang.String r0 = "message"
            org.json.JSONObject r9 = r9.optJSONObject(r0)     // Catch: java.lang.Throwable -> L61
            if (r9 == 0) goto L9f
            java.lang.String r0 = "content"
            java.lang.String r9 = r9.optString(r0)     // Catch: java.lang.Throwable -> L61
            if (r9 == 0) goto L9f
            boolean r0 = og.m.t0(r9)     // Catch: java.lang.Throwable -> L61
            if (r0 != 0) goto L9f
            goto La0
        L9f:
            r9 = r3
        La0:
            r8.close()     // Catch: java.lang.Throwable -> La4
            goto Lb6
        La4:
            r8 = move-exception
            goto Lb1
        La6:
            r8.close()     // Catch: java.lang.Throwable -> La4
            r9 = r3
            goto Lb6
        Lab:
            throw r9     // Catch: java.lang.Throwable -> Lac
        Lac:
            r0 = move-exception
            ig.a.i(r8, r9)     // Catch: java.lang.Throwable -> La4
            throw r0     // Catch: java.lang.Throwable -> La4
        Lb1:
            sf.f r9 = new sf.f
            r9.<init>(r8)
        Lb6:
            boolean r8 = r9 instanceof sf.f
            if (r8 == 0) goto Lbb
            goto Lbc
        Lbb:
            r3 = r9
        Lbc:
            java.lang.String r3 = (java.lang.String) r3
            return r3
    }

    public static java.lang.String g(x8.a r7, java.util.List r8) {
            java.lang.String r0 = "application/json"
            java.lang.String r1 = "Bearer "
            r2 = 1
            r3 = 0
            org.json.JSONObject r8 = b(r7, r8, r2)     // Catch: java.lang.Throwable -> L62
            okhttp3.OkHttpClient r2 = x8.q.f21331c     // Catch: java.lang.Throwable -> L62
            okhttp3.Request$Builder r4 = new okhttp3.Request$Builder     // Catch: java.lang.Throwable -> L62
            r4.<init>()     // Catch: java.lang.Throwable -> L62
            java.lang.String r5 = m(r7)     // Catch: java.lang.Throwable -> L62
            okhttp3.Request$Builder r4 = r4.url(r5)     // Catch: java.lang.Throwable -> L62
            java.lang.String r5 = "Content-Type"
            okhttp3.Request$Builder r4 = r4.addHeader(r5, r0)     // Catch: java.lang.Throwable -> L62
            java.lang.String r5 = "Authorization"
            java.lang.String r7 = r7.f21221a     // Catch: java.lang.Throwable -> L62
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L62
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L62
            r6.append(r7)     // Catch: java.lang.Throwable -> L62
            java.lang.String r7 = r6.toString()     // Catch: java.lang.Throwable -> L62
            okhttp3.Request$Builder r7 = r4.addHeader(r5, r7)     // Catch: java.lang.Throwable -> L62
            okhttp3.RequestBody$Companion r1 = okhttp3.RequestBody.Companion     // Catch: java.lang.Throwable -> L62
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L62
            r8.getClass()     // Catch: java.lang.Throwable -> L62
            okhttp3.MediaType$Companion r4 = okhttp3.MediaType.Companion     // Catch: java.lang.Throwable -> L62
            okhttp3.MediaType r0 = r4.get(r0)     // Catch: java.lang.Throwable -> L62
            okhttp3.RequestBody r8 = r1.create(r8, r0)     // Catch: java.lang.Throwable -> L62
            okhttp3.Request$Builder r7 = r7.post(r8)     // Catch: java.lang.Throwable -> L62
            okhttp3.Request r7 = r7.build()     // Catch: java.lang.Throwable -> L62
            okhttp3.Call r7 = r2.newCall(r7)     // Catch: java.lang.Throwable -> L62
            okhttp3.Response r7 = r7.execute()     // Catch: java.lang.Throwable -> L62
            boolean r8 = r7.isSuccessful()     // Catch: java.lang.Throwable -> L134
            if (r8 != 0) goto L65
        L5c:
            r7.close()     // Catch: java.lang.Throwable -> L62
            r8 = r3
            goto L147
        L62:
            r7 = move-exception
            goto L142
        L65:
            okhttp3.ResponseBody r8 = r7.body()     // Catch: java.lang.Throwable -> L134
            if (r8 == 0) goto L5c
            java.io.InputStream r8 = r8.byteStream()     // Catch: java.lang.Throwable -> L134
            if (r8 == 0) goto L5c
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L134
            java.nio.charset.Charset r1 = og.a.f9804a     // Catch: java.lang.Throwable -> L134
            r0.<init>(r8, r1)     // Catch: java.lang.Throwable -> L134
            java.io.BufferedReader r8 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L134
            r1 = 8192(0x2000, float:1.148E-41)
            r8.<init>(r0, r1)     // Catch: java.lang.Throwable -> L134
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L134
            r0.<init>()     // Catch: java.lang.Throwable -> L134
            dg.n r1 = new dg.n     // Catch: java.lang.Throwable -> L107
            r2 = 0
            r1.<init>(r8, r2)     // Catch: java.lang.Throwable -> L107
            ng.a r2 = new ng.a     // Catch: java.lang.Throwable -> L107
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L107
            java.util.Iterator r1 = r2.iterator()     // Catch: java.lang.Throwable -> L107
        L93:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L107
            if (r2 == 0) goto L121
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L107
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L107
            java.lang.CharSequence r4 = og.m.R0(r2)     // Catch: java.lang.Throwable -> L107
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L107
            java.lang.String r5 = "data:"
            java.lang.String r4 = og.m.A0(r4, r5)     // Catch: java.lang.Throwable -> L107
            java.lang.CharSequence r4 = og.m.R0(r4)     // Catch: java.lang.Throwable -> L107
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L107
            boolean r5 = og.m.t0(r4)     // Catch: java.lang.Throwable -> L107
            if (r5 != 0) goto L93
            java.lang.CharSequence r2 = og.m.R0(r2)     // Catch: java.lang.Throwable -> L107
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L107
            boolean r2 = r4.equals(r2)     // Catch: java.lang.Throwable -> L107
            if (r2 != 0) goto L93
            java.lang.String r2 = "[DONE]"
            boolean r2 = r4.equals(r2)     // Catch: java.lang.Throwable -> L107
            if (r2 == 0) goto Ld2
            goto L93
        Ld2:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ld8
            r2.<init>(r4)     // Catch: java.lang.Throwable -> Ld8
            goto Ldf
        Ld8:
            r2 = move-exception
            sf.f r4 = new sf.f     // Catch: java.lang.Throwable -> L107
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L107
            r2 = r4
        Ldf:
            boolean r4 = r2 instanceof sf.f     // Catch: java.lang.Throwable -> L107
            if (r4 == 0) goto Le5
            r2 = r3
        Le5:
            org.json.JSONObject r2 = (org.json.JSONObject) r2     // Catch: java.lang.Throwable -> L107
            if (r2 == 0) goto L93
            java.lang.String r4 = "choices"
            org.json.JSONArray r2 = r2.optJSONArray(r4)     // Catch: java.lang.Throwable -> L107
            if (r2 == 0) goto L93
            r4 = 0
            org.json.JSONObject r2 = r2.optJSONObject(r4)     // Catch: java.lang.Throwable -> L107
            if (r2 == 0) goto L93
            java.lang.String r4 = "delta"
            org.json.JSONObject r2 = r2.optJSONObject(r4)     // Catch: java.lang.Throwable -> L107
            if (r2 == 0) goto L109
            java.lang.String r4 = "content"
            java.lang.String r2 = r2.optString(r4)     // Catch: java.lang.Throwable -> L107
            goto L10a
        L107:
            r0 = move-exception
            goto L136
        L109:
            r2 = r3
        L10a:
            if (r2 != 0) goto L10e
            java.lang.String r2 = ""
        L10e:
            boolean r4 = og.m.t0(r2)     // Catch: java.lang.Throwable -> L107
            if (r4 != 0) goto L93
            java.lang.String r4 = "null"
            boolean r4 = r2.equalsIgnoreCase(r4)     // Catch: java.lang.Throwable -> L107
            if (r4 != 0) goto L93
            r0.append(r2)     // Catch: java.lang.Throwable -> L107
            goto L93
        L121:
            r8.close()     // Catch: java.lang.Throwable -> L134
            java.lang.String r8 = r0.toString()     // Catch: java.lang.Throwable -> L134
            boolean r0 = og.m.t0(r8)     // Catch: java.lang.Throwable -> L134
            if (r0 != 0) goto L12f
            goto L130
        L12f:
            r8 = r3
        L130:
            r7.close()     // Catch: java.lang.Throwable -> L62
            goto L147
        L134:
            r8 = move-exception
            goto L13c
        L136:
            throw r0     // Catch: java.lang.Throwable -> L137
        L137:
            r1 = move-exception
            ig.a.i(r8, r0)     // Catch: java.lang.Throwable -> L134
            throw r1     // Catch: java.lang.Throwable -> L134
        L13c:
            throw r8     // Catch: java.lang.Throwable -> L13d
        L13d:
            r0 = move-exception
            ig.a.i(r7, r8)     // Catch: java.lang.Throwable -> L62
            throw r0     // Catch: java.lang.Throwable -> L62
        L142:
            sf.f r8 = new sf.f
            r8.<init>(r7)
        L147:
            boolean r7 = r8 instanceof sf.f
            if (r7 == 0) goto L14c
            goto L14d
        L14c:
            r3 = r8
        L14d:
            java.lang.String r3 = (java.lang.String) r3
            return r3
    }

    public static java.lang.String h(java.lang.String r3) {
            r0 = 0
            java.lang.String r1 = "\u0000"
            java.lang.String r2 = ""
            java.lang.String r3 = og.t.a0(r3, r1, r2, r0)
            java.lang.String r0 = "(?i)^null"
            java.lang.String r3 = j8.b.h(r0, r3, r2)
            java.lang.String r0 = "(?i)null$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r0.getClass()
            java.util.regex.Matcher r3 = r0.matcher(r3)
            java.lang.String r3 = r3.replaceAll(r2)
            r3.getClass()
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            return r3
    }

    public static void i() {
            java.util.concurrent.ConcurrentHashMap r0 = x8.q.f21334f
            r0.clear()
            java.util.concurrent.ConcurrentHashMap r0 = x8.q.f21335g
            r0.clear()
            java.util.concurrent.ConcurrentHashMap r0 = x8.q.f21336h
            java.util.Collection r1 = r0.values()
            r1.getClass()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L19:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r1.next()
            x8.n r2 = (x8.n) r2
            java.lang.String r3 = "context cleared"
            r2.a(r3)
            goto L19
        L2b:
            r0.clear()
            return
    }

    public static java.util.List j(byte[] r18) {
            r0 = r18
            int r1 = r0.length
            if (r1 != 0) goto L8
            tf.t r0 = tf.t.f13167g
            return r0
        L8:
            int r1 = r0.length
            int r1 = r1 + 1919
            r2 = 1920(0x780, float:2.69E-42)
            int r1 = r1 / r2
            int r1 = r1 * r2
            int r3 = r0.length
            if (r1 != r3) goto L13
            goto L17
        L13:
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
        L17:
            java.lang.String r1 = "audio/opus"
            r3 = 16000(0x3e80, float:2.2421E-41)
            r4 = 1
            android.media.MediaFormat r5 = android.media.MediaFormat.createAudioFormat(r1, r3, r4)
            java.lang.String r6 = "bitrate"
            r7 = 24000(0x5dc0, float:3.3631E-41)
            r5.setInteger(r6, r7)
            java.lang.String r6 = "max-input-size"
            r5.setInteger(r6, r2)
            android.media.MediaCodec r7 = android.media.MediaCodec.createEncoderByType(r1)
            r7.getClass()
            android.media.MediaCodec$BufferInfo r1 = new android.media.MediaCodec$BufferInfo
            r1.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r8 = 0
            r7.configure(r5, r8, r8, r4)
            r7.start()
            r8 = 0
            r14 = 0
            r15 = 0
        L47:
            if (r14 != 0) goto Le6
            r9 = 10000(0x2710, double:4.9407E-320)
            if (r15 != 0) goto L99
            int r11 = r7.dequeueInputBuffer(r9)     // Catch: java.lang.Throwable -> L5d
            if (r11 < 0) goto L99
            java.nio.ByteBuffer r12 = r7.getInputBuffer(r11)     // Catch: java.lang.Throwable -> L5d
            if (r12 == 0) goto L60
            r12.clear()     // Catch: java.lang.Throwable -> L5d
            goto L60
        L5d:
            r0 = move-exception
            goto Ldf
        L60:
            int r13 = r0.length     // Catch: java.lang.Throwable -> L5d
            int r13 = r13 - r8
            if (r13 <= r2) goto L65
            r13 = r2
        L65:
            r16 = 1000000(0xf4240, double:4.940656E-318)
            if (r13 <= 0) goto L84
            if (r12 == 0) goto L84
            r12.put(r0, r8, r13)     // Catch: java.lang.Throwable -> L5d
            int r12 = r8 / 2
            long r9 = (long) r12     // Catch: java.lang.Throwable -> L5d
            long r9 = r9 * r16
            long r4 = (long) r3     // Catch: java.lang.Throwable -> L5d
            long r9 = r9 / r4
            r5 = r8
            r8 = r11
            r11 = r9
            r9 = 0
            r10 = r13
            r13 = 0
            r7.queueInputBuffer(r8, r9, r10, r11, r13)     // Catch: java.lang.Throwable -> L5d
            int r8 = r5 + r10
        L81:
            r4 = 10000(0x2710, double:4.9407E-320)
            goto L9c
        L84:
            r5 = r8
            r8 = r11
            int r4 = r5 / 2
            long r9 = (long) r4     // Catch: java.lang.Throwable -> L5d
            long r9 = r9 * r16
            long r11 = (long) r3     // Catch: java.lang.Throwable -> L5d
            long r11 = r9 / r11
            r10 = 0
            r13 = 4
            r9 = 0
            r7.queueInputBuffer(r8, r9, r10, r11, r13)     // Catch: java.lang.Throwable -> L5d
            r8 = r5
            r4 = 10000(0x2710, double:4.9407E-320)
            r15 = 1
            goto L9c
        L99:
            r5 = r8
            r8 = r5
            goto L81
        L9c:
            int r4 = r7.dequeueOutputBuffer(r1, r4)     // Catch: java.lang.Throwable -> L5d
            r5 = -2
            if (r4 == r5) goto Ldb
            r5 = -1
            if (r4 == r5) goto Ldb
            if (r4 < 0) goto Ldb
            java.nio.ByteBuffer r5 = r7.getOutputBuffer(r4)     // Catch: java.lang.Throwable -> L5d
            if (r5 == 0) goto Lcf
            int r9 = r1.size     // Catch: java.lang.Throwable -> L5d
            if (r9 <= 0) goto Lcf
            int r9 = r1.flags     // Catch: java.lang.Throwable -> L5d
            r9 = r9 & 2
            if (r9 != 0) goto Lcf
            int r9 = r1.offset     // Catch: java.lang.Throwable -> L5d
            r5.position(r9)     // Catch: java.lang.Throwable -> L5d
            int r9 = r1.offset     // Catch: java.lang.Throwable -> L5d
            int r10 = r1.size     // Catch: java.lang.Throwable -> L5d
            int r9 = r9 + r10
            r5.limit(r9)     // Catch: java.lang.Throwable -> L5d
            int r9 = r1.size     // Catch: java.lang.Throwable -> L5d
            byte[] r9 = new byte[r9]     // Catch: java.lang.Throwable -> L5d
            r5.get(r9)     // Catch: java.lang.Throwable -> L5d
            r6.add(r9)     // Catch: java.lang.Throwable -> L5d
        Lcf:
            int r5 = r1.flags     // Catch: java.lang.Throwable -> L5d
            r5 = r5 & 4
            if (r5 == 0) goto Ld6
            r14 = 1
        Ld6:
            r5 = 0
            r7.releaseOutputBuffer(r4, r5)     // Catch: java.lang.Throwable -> L5d
            goto Ldc
        Ldb:
            r5 = 0
        Ldc:
            r4 = 1
            goto L47
        Ldf:
            r7.stop()     // Catch: java.lang.Throwable -> Le2
        Le2:
            r7.release()     // Catch: java.lang.Throwable -> Le5
        Le5:
            throw r0
        Le6:
            r7.stop()     // Catch: java.lang.Throwable -> Le9
        Le9:
            r7.release()     // Catch: java.lang.Throwable -> Lec
        Lec:
            return r6
    }

    public static boolean k(android.content.Context r28, java.lang.String r29, java.util.List r30, x8.g r31, long r32, boolean r34) {
            r1 = r28
            r2 = r29
            r3 = r31
            r4 = r34
            java.lang.String r5 = r3.f21274b
            java.lang.String r6 = r3.f21273a
            boolean r7 = r3.f21277e
            boolean r0 = r30.isEmpty()
            r8 = 0
            if (r0 == 0) goto L16
            return r8
        L16:
            r9 = 0
            int r0 = (r32 > r9 ? 1 : (r32 == r9 ? 0 : -1))
            if (r0 <= 0) goto L1f
            M(r32)
        L1f:
            java.util.Iterator r11 = r30.iterator()
            r12 = r8
            r13 = r12
        L25:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L2e0
            int r14 = r13 + 1
            java.lang.Object r0 = r11.next()
            r15 = r0
            x8.s r15 = (x8.s) r15
            long r8 = r15.f21347d
            boolean r0 = r15.f21348e
            if (r0 == 0) goto L4a
            r10 = r7
            r32 = r8
            r7 = 2001(0x7d1, double:9.886E-321)
            jg.a r0 = jg.d.f6902g
            r19 = r10
            r9 = 0
            long r17 = r0.e(r9, r7)
            goto L52
        L4a:
            r19 = r7
            r32 = r8
            r9 = 0
            r17 = r9
        L52:
            long r7 = r32 + r17
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 <= 0) goto L5b
            M(r7)
        L5b:
            java.lang.String r0 = r15.f21346c
            g8.i r7 = wb.en.c()
            long r8 = r3.f21276d
            java.lang.String r20 = ""
            if (r19 == 0) goto L75
            if (r7 == 0) goto L6e
            java.lang.String r21 = r7.t(r6, r5)
            goto L70
        L6e:
            r21 = 0
        L70:
            if (r21 != 0) goto L81
        L72:
            r21 = r20
            goto L81
        L75:
            if (r7 == 0) goto L7c
            java.lang.String r21 = r7.r(r5)
            goto L7e
        L7c:
            r21 = 0
        L7e:
            if (r21 != 0) goto L81
            goto L72
        L81:
            boolean r22 = og.m.t0(r21)
            if (r22 == 0) goto L8b
            r10 = r5
        L88:
            r32 = 0
            goto L8e
        L8b:
            r10 = r21
            goto L88
        L8e:
            if (r19 == 0) goto L9e
            if (r7 == 0) goto L97
            java.lang.String r7 = r7.r(r6)
            goto L99
        L97:
            r7 = r32
        L99:
            if (r7 != 0) goto L9c
            goto L9e
        L9c:
            r20 = r7
        L9e:
            r33 = r11
            r7 = r20
            java.lang.String r11 = "%friendName%"
            r20 = r12
            r12 = 0
            java.lang.String r0 = og.t.a0(r0, r11, r10, r12)
            java.lang.String r11 = "%senderName%"
            java.lang.String r0 = og.t.a0(r0, r11, r10, r12)
            java.lang.String r10 = "%senderWxid%"
            java.lang.String r0 = og.t.a0(r0, r10, r5, r12)
            java.lang.String r10 = "%talker%"
            java.lang.String r0 = og.t.a0(r0, r10, r6, r12)
            java.lang.String r10 = "%groupName%"
            java.lang.String r0 = og.t.a0(r0, r10, r7, r12)
            java.lang.String r7 = "%content%"
            java.lang.String r10 = r3.f21275c
            java.lang.String r0 = og.t.a0(r0, r7, r10, r12)
            java.lang.String r7 = "]"
            java.lang.String r10 = "[AtWx="
            java.lang.String r7 = eh.a.n(r10, r5, r7)
            java.lang.String r11 = "%atSender%"
            java.lang.String r0 = og.t.a0(r0, r11, r7, r12)
            if (r19 == 0) goto Lde
            java.lang.String r7 = "[AtWx=notify@all]"
            goto Le0
        Lde:
            java.lang.String r7 = "@所有人"
        Le0:
            java.lang.String r11 = "%atAll%"
            java.lang.String r0 = og.t.a0(r0, r11, r7, r12)
            k8.g r7 = p.a.q()
            j8.p r11 = h.Hchat.hooks.api.core.WeChatApis.media()
            r21 = 300(0x12c, double:1.48E-321)
            int r12 = r15.f21345b     // Catch: java.lang.Throwable -> L12c
            switch(r12) {
                case 0: goto L22a;
                case 1: goto L21f;
                case 2: goto L213;
                case 3: goto L1fd;
                case 4: goto L1f1;
                case 5: goto L1e5;
                case 6: goto L1c0;
                case 7: goto L1b4;
                case 8: goto L171;
                case 9: goto L13b;
                case 10: goto L135;
                case 11: goto L12f;
                case 12: goto L126;
                case 13: goto Lf7;
                default: goto Lf5;
            }     // Catch: java.lang.Throwable -> L12c
        Lf5:
            goto L210
        Lf7:
            java.util.ArrayList r0 = O(r0)     // Catch: java.lang.Throwable -> L12c
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L12c
            r12 = 0
        L100:
            boolean r7 = r0.hasNext()     // Catch: java.lang.Throwable -> L12c
            if (r7 == 0) goto L28d
            java.lang.Object r7 = r0.next()     // Catch: java.lang.Throwable -> L12c
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L12c
            r7.getClass()     // Catch: java.lang.Throwable -> L12c
            if (r11 == 0) goto L11e
            j8.h r8 = r11.f6820f     // Catch: java.lang.Throwable -> L12c
            if (r8 == 0) goto L11e
            boolean r7 = r8.A(r2, r7)     // Catch: java.lang.Throwable -> L12c
            r8 = 1
            if (r7 != r8) goto L11e
            r7 = 1
            goto L11f
        L11e:
            r7 = 0
        L11f:
            if (r7 == 0) goto L122
            r12 = 1
        L122:
            M(r21)     // Catch: java.lang.Throwable -> L12c
            goto L100
        L126:
            boolean r12 = K(r1, r2, r3)     // Catch: java.lang.Throwable -> L12c
            goto L28d
        L12c:
            r0 = move-exception
            goto L292
        L12f:
            boolean r12 = J(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L12c
            goto L28d
        L135:
            boolean r12 = L(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L12c
            goto L28d
        L13b:
            if (r7 == 0) goto L210
            java.lang.CharSequence r8 = og.m.R0(r0)     // Catch: java.lang.Throwable -> L12c
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L12c
            java.lang.String r9 = "<"
            r10 = 0
            boolean r8 = og.t.d0(r8, r9, r10)     // Catch: java.lang.Throwable -> L12c
            if (r8 == 0) goto L14f
            goto L167
        L14f:
            java.lang.String r8 = "]]>"
            java.lang.String r9 = "]]]]><![CDATA[>"
            java.lang.String r0 = og.t.a0(r0, r8, r9, r10)     // Catch: java.lang.Throwable -> L12c
            java.lang.String r8 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><msg><appmsg appid=\"\" sdkver=\"0\"><title><![CDATA["
            java.lang.String r9 = "]]></title><des><![CDATA["
            java.lang.String r10 = "]]></des><type>1</type><content><![CDATA["
            java.lang.StringBuilder r8 = bc.e.p(r8, r0, r9, r0, r10)     // Catch: java.lang.Throwable -> L12c
            java.lang.String r9 = "]]></content></appmsg></msg>"
            java.lang.String r0 = eh.a.r(r8, r0, r9)     // Catch: java.lang.Throwable -> L12c
        L167:
            boolean r0 = r7.z(r2, r0)     // Catch: java.lang.Throwable -> L12c
            r8 = 1
            if (r0 != r8) goto L210
        L16e:
            r12 = 1
            goto L28d
        L171:
            if (r19 == 0) goto L175
            r7 = r5
            goto L176
        L175:
            r7 = r2
        L176:
            java.util.ArrayList r0 = O(r0)     // Catch: java.lang.Throwable -> L12c
            boolean r8 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12c
            if (r8 == 0) goto L182
            goto L210
        L182:
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L12c
        L186:
            boolean r8 = r0.hasNext()     // Catch: java.lang.Throwable -> L12c
            if (r8 == 0) goto L210
            java.lang.Object r8 = r0.next()     // Catch: java.lang.Throwable -> L12c
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L12c
            i8.a r9 = h.Hchat.hooks.api.core.WeChatApis.contact()     // Catch: java.lang.Throwable -> L12c
            r9.getClass()     // Catch: java.lang.Throwable -> L12c
            g8.d r9 = h.Hchat.hooks.api.core.WeChatApis.c()     // Catch: java.lang.Throwable -> L12c
            if (r9 == 0) goto L186
            boolean r10 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L12c
            if (r10 == 0) goto L1a8
            r12 = 0
        L1a6:
            r8 = 1
            goto L1b1
        L1a8:
            java.util.List r10 = java.util.Collections.singletonList(r7)     // Catch: java.lang.Throwable -> L12c
            boolean r12 = r9.m(r8, r10)     // Catch: java.lang.Throwable -> L12c
            goto L1a6
        L1b1:
            if (r12 != r8) goto L186
            goto L16e
        L1b4:
            x8.c r7 = new x8.c     // Catch: java.lang.Throwable -> L12c
            r8 = 0
            r7.<init>(r11, r2, r8)     // Catch: java.lang.Throwable -> L12c
            boolean r12 = H(r7, r0)     // Catch: java.lang.Throwable -> L12c
            goto L28d
        L1c0:
            java.util.ArrayList r0 = O(r0)     // Catch: java.lang.Throwable -> L12c
            boolean r8 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12c
            if (r8 == 0) goto L1cb
            goto L210
        L1cb:
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L12c
        L1cf:
            boolean r8 = r0.hasNext()     // Catch: java.lang.Throwable -> L12c
            if (r8 == 0) goto L210
            java.lang.Object r8 = r0.next()     // Catch: java.lang.Throwable -> L12c
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L12c
            if (r7 == 0) goto L1cf
            boolean r8 = r7.w(r2, r8)     // Catch: java.lang.Throwable -> L12c
            r9 = 1
            if (r8 != r9) goto L1cf
            goto L16e
        L1e5:
            x8.c r7 = new x8.c     // Catch: java.lang.Throwable -> L12c
            r8 = 4
            r7.<init>(r11, r2, r8)     // Catch: java.lang.Throwable -> L12c
            boolean r12 = H(r7, r0)     // Catch: java.lang.Throwable -> L12c
            goto L28d
        L1f1:
            x8.c r7 = new x8.c     // Catch: java.lang.Throwable -> L12c
            r8 = 3
            r7.<init>(r11, r2, r8)     // Catch: java.lang.Throwable -> L12c
            boolean r12 = H(r7, r0)     // Catch: java.lang.Throwable -> L12c
            goto L28d
        L1fd:
            java.lang.String r0 = C(r0)     // Catch: java.lang.Throwable -> L12c
            if (r0 == 0) goto L210
            if (r11 == 0) goto L210
            j8.y r7 = r11.f6816b     // Catch: java.lang.Throwable -> L12c
            boolean r0 = r7.t(r2, r0)     // Catch: java.lang.Throwable -> L12c
            r8 = 1
            if (r0 != r8) goto L210
            goto L16e
        L210:
            r12 = 0
            goto L28d
        L213:
            x8.c r7 = new x8.c     // Catch: java.lang.Throwable -> L12c
            r8 = 2
            r7.<init>(r11, r2, r8)     // Catch: java.lang.Throwable -> L12c
            boolean r12 = H(r7, r0)     // Catch: java.lang.Throwable -> L12c
            goto L28d
        L21f:
            x8.c r7 = new x8.c     // Catch: java.lang.Throwable -> L12c
            r8 = 1
            r7.<init>(r11, r2, r8)     // Catch: java.lang.Throwable -> L12c
            boolean r12 = H(r7, r0)     // Catch: java.lang.Throwable -> L12c
            goto L28d
        L22a:
            java.util.ArrayList r0 = P(r0)     // Catch: java.lang.Throwable -> L12c
            java.util.Iterator r11 = r0.iterator()     // Catch: java.lang.Throwable -> L12c
            r12 = 0
            r24 = 0
        L235:
            boolean r25 = r11.hasNext()     // Catch: java.lang.Throwable -> L12c
            if (r25 == 0) goto L28b
            java.lang.Object r25 = r11.next()     // Catch: java.lang.Throwable -> L12c
            int r26 = r12 + 1
            if (r12 < 0) goto L287
            r27 = r0
            r0 = r25
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L12c
            if (r4 == 0) goto L265
            r17 = 0
            int r25 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r25 <= 0) goto L265
            r1 = 0
            boolean r16 = og.m.h0(r0, r10, r1)     // Catch: java.lang.Throwable -> L12c
            if (r16 != 0) goto L265
            if (r7 == 0) goto L263
            boolean r0 = r7.u(r8, r2, r0)     // Catch: java.lang.Throwable -> L12c
            r1 = 1
            if (r0 != r1) goto L263
            r0 = 1
            goto L269
        L263:
            r0 = 0
            goto L269
        L265:
            boolean r0 = I(r2, r0)     // Catch: java.lang.Throwable -> L12c
        L269:
            if (r0 != 0) goto L271
            if (r24 == 0) goto L26e
            goto L271
        L26e:
            r24 = 0
            goto L273
        L271:
            r24 = 1
        L273:
            int r0 = r27.size()     // Catch: java.lang.Throwable -> L12c
            r23 = 1
            int r0 = r0 + (-1)
            if (r12 >= r0) goto L280
            M(r21)     // Catch: java.lang.Throwable -> L12c
        L280:
            r1 = r28
            r12 = r26
            r0 = r27
            goto L235
        L287:
            a.a.Q0()     // Catch: java.lang.Throwable -> L12c
            throw r32     // Catch: java.lang.Throwable -> L12c
        L28b:
            r12 = r24
        L28d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)     // Catch: java.lang.Throwable -> L12c
            goto L298
        L292:
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L298:
            java.lang.Throwable r1 = sf.g.b(r0)
            if (r1 == 0) goto L2a7
            java.lang.String r7 = r1.getMessage()
            java.lang.String r8 = "[Hchat:AutoReply] 发送回复失败: "
            eh.a.x(r8, r7, r1)
        L2a7:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r7 = r0 instanceof sf.f
            if (r7 == 0) goto L2ae
            r0 = r1
        L2ae:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L2bb
            if (r20 == 0) goto L2b9
            goto L2bb
        L2b9:
            r12 = 0
            goto L2bc
        L2bb:
            r12 = 1
        L2bc:
            int r0 = r30.size()
            r23 = 1
            int r0 = r0 + (-1)
            if (r13 >= r0) goto L2d2
            long r0 = r15.f21347d
            r17 = 0
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 > 0) goto L2d4
            M(r21)
            goto L2d4
        L2d2:
            r17 = 0
        L2d4:
            r1 = r28
            r11 = r33
            r13 = r14
            r9 = r17
            r7 = r19
            r8 = 0
            goto L25
        L2e0:
            r20 = r12
            return r20
    }

    public static java.lang.String l(java.lang.String r14) {
            java.lang.CharSequence r14 = og.m.R0(r14)
            java.lang.String r14 = r14.toString()
            boolean r0 = og.m.t0(r14)
            java.lang.String r1 = ""
            if (r0 == 0) goto L12
            goto Lf6
        L12:
            java.lang.String r9 = "来一首"
            java.lang.String r10 = "音乐"
            java.lang.String r2 = "点歌"
            java.lang.String r3 = "放首"
            java.lang.String r4 = "放一首"
            java.lang.String r5 = "播放"
            java.lang.String r6 = "听歌"
            java.lang.String r7 = "听首"
            java.lang.String r8 = "来首"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10}
            java.util.List r0 = a.a.y0(r0)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L34
            goto Lf6
        L34:
            java.util.Iterator r0 = r0.iterator()
        L38:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lf6
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            r3 = 0
            boolean r2 = og.m.h0(r14, r2, r3)
            if (r2 == 0) goto L38
            java.lang.String r0 = "帮我"
            java.lang.String r14 = og.t.a0(r14, r0, r1, r3)
            java.lang.String r0 = "给我"
            java.lang.String r14 = og.t.a0(r14, r0, r1, r3)
            java.lang.String r0 = "一下"
            java.lang.String r14 = og.t.a0(r14, r0, r1, r3)
            java.lang.String r0 = "吧"
            java.lang.String r14 = og.t.a0(r14, r0, r1, r3)
            java.lang.String r0 = "可以"
            java.lang.String r14 = og.t.a0(r14, r0, r1, r3)
            java.lang.CharSequence r14 = og.m.R0(r14)
            java.lang.String r14 = r14.toString()
            java.lang.String r12 = "来一首"
            java.lang.String r13 = "来首"
            java.lang.String r4 = "点歌"
            java.lang.String r5 = "放一首"
            java.lang.String r6 = "放首"
            java.lang.String r7 = "播放一下"
            java.lang.String r8 = "播放"
            java.lang.String r9 = "听一首"
            java.lang.String r10 = "听首"
            java.lang.String r11 = "听歌"
            java.lang.String[] r0 = new java.lang.String[]{r4, r5, r6, r7, r8, r9, r10, r11, r12, r13}
            java.util.List r0 = a.a.y0(r0)
            java.util.Iterator r0 = r0.iterator()
        L91:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lb0
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = og.t.d0(r14, r1, r3)
            if (r2 == 0) goto L91
            java.lang.String r14 = og.m.A0(r14, r1)
            java.lang.CharSequence r14 = og.m.R0(r14)
            java.lang.String r14 = r14.toString()
            goto L91
        Lb0:
            java.lang.String r0 = "歌曲"
            java.lang.String r1 = "歌"
            java.lang.String r2 = "这首歌"
            java.lang.String r4 = "这首"
            java.lang.String r5 = "音乐"
            java.lang.String[] r0 = new java.lang.String[]{r2, r4, r5, r0, r1}
            java.util.List r0 = a.a.y0(r0)
            java.util.Iterator r0 = r0.iterator()
        Lc6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lef
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = og.t.W(r14, r1, r3)
            if (r2 == 0) goto Lc6
            int r2 = r14.length()
            int r4 = r1.length()
            if (r2 <= r4) goto Lc6
            java.lang.String r14 = og.m.B0(r14, r1)
            java.lang.CharSequence r14 = og.m.R0(r14)
            java.lang.String r14 = r14.toString()
            goto Lc6
        Lef:
            r0 = 80
            java.lang.String r14 = og.m.P0(r0, r14)
            return r14
        Lf6:
            return r1
    }

    public static java.lang.String m(x8.a r4) {
            java.lang.String r0 = r4.f21222b
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            r1 = 1
            char[] r1 = new char[r1]
            r2 = 0
            r3 = 47
            r1[r2] = r3
            java.lang.String r0 = og.m.U0(r0, r1)
            java.lang.String r4 = r4.f21223c
            java.lang.CharSequence r4 = og.m.R0(r4)
            java.lang.String r4 = r4.toString()
            boolean r1 = og.m.t0(r4)
            if (r1 == 0) goto L28
            java.lang.String r4 = "/chat/completions"
        L28:
            java.lang.String r1 = "/"
            boolean r2 = og.t.d0(r4, r1, r2)
            if (r2 == 0) goto L31
            goto L35
        L31:
            java.lang.String r4 = r1.concat(r4)
        L35:
            java.lang.String r4 = bc.e.i(r0, r4)
            return r4
    }

    public static java.lang.String n(java.lang.String r2, java.lang.String r3) {
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            boolean r0 = og.m.t0(r2)
            if (r0 == 0) goto Lf
            r2 = r3
        Lf:
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L22
            java.util.Locale r1 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L22
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L22
            java.util.Date r2 = new java.util.Date     // Catch: java.lang.Throwable -> L22
            r2.<init>()     // Catch: java.lang.Throwable -> L22
            java.lang.String r2 = r0.format(r2)     // Catch: java.lang.Throwable -> L22
            goto L29
        L22:
            r2 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r2)
            r2 = r0
        L29:
            java.lang.Throwable r0 = sf.g.b(r2)
            if (r0 != 0) goto L30
            goto L42
        L30:
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.util.Locale r0 = java.util.Locale.getDefault()
            r2.<init>(r3, r0)
            java.util.Date r3 = new java.util.Date
            r3.<init>()
            java.lang.String r2 = r2.format(r3)
        L42:
            r2.getClass()
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    public static void o(android.content.Context r27, x8.r r28, k8.o r29) {
            r0 = r29
            h.Hchat.hooks.api.model.WeChatMessage r1 = r0.f7454k
            java.lang.String r2 = r0.f7446c
            boolean r3 = og.m.t0(r2)
            if (r3 == 0) goto L10
            java.lang.String r2 = r0.d()
        L10:
            r4 = r2
            r4.getClass()
            boolean r2 = og.m.t0(r4)
            if (r2 == 0) goto L1c
            goto L3ec
        L1c:
            boolean r2 = r0.f7451h
            r13 = 1
            r14 = 0
            if (r2 != 0) goto L3b
            boolean r2 = r0.j()
            if (r2 != 0) goto L3b
            java.lang.String r2 = "@chatroom"
            boolean r2 = og.t.W(r4, r2, r14)
            if (r2 != 0) goto L3b
            java.lang.String r2 = "@im.chatroom"
            boolean r2 = og.t.W(r4, r2, r14)
            if (r2 == 0) goto L39
            goto L3b
        L39:
            r9 = r14
            goto L3c
        L3b:
            r9 = r13
        L3c:
            java.lang.String r2 = r0.f7447d
            boolean r3 = og.m.t0(r2)
            if (r3 == 0) goto L48
            java.lang.String r2 = r0.c()
        L48:
            r2.getClass()
            boolean r3 = og.m.t0(r2)
            r5 = 0
            if (r3 != 0) goto L53
            goto L8c
        L53:
            if (r9 != 0) goto L57
            r2 = r4
            goto L8c
        L57:
            java.lang.String r2 = "^([^\\s:]{3,80}):\\n"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            r2.getClass()
            java.lang.String r3 = r0.f7448e
            boolean r6 = og.m.t0(r3)
            if (r6 == 0) goto L6c
            java.lang.String r3 = r0.a()
        L6c:
            r3.getClass()
            java.util.regex.Matcher r2 = r2.matcher(r3)
            r2.getClass()
            og.i r2 = a7.a.b(r2, r14, r3)
            if (r2 == 0) goto L87
            java.util.List r2 = r2.a()
            java.lang.Object r2 = tf.m.w1(r13, r2)
            java.lang.String r2 = (java.lang.String) r2
            goto L88
        L87:
            r2 = r5
        L88:
            if (r2 != 0) goto L8c
            java.lang.String r2 = ""
        L8c:
            java.lang.String r6 = A(r0)
            boolean r15 = r0.o()
            java.lang.String r3 = "text"
            java.lang.String r7 = r0.f7445b
            boolean r16 = r3.equals(r7)
            boolean r3 = r0.s()
            if (r3 == 0) goto La6
            if (r15 != 0) goto La6
            goto L3ec
        La6:
            if (r16 == 0) goto Lb2
            boolean r3 = og.m.t0(r6)
            if (r3 == 0) goto Lb2
            if (r15 != 0) goto Lb2
            goto L3ec
        Lb2:
            x8.g r3 = new x8.g
            r17 = 0
            if (r1 == 0) goto Lbd
            long r7 = r1.getMsgId()
            goto Lbf
        Lbd:
            r7 = r17
        Lbf:
            boolean r10 = r0.g()
            boolean r11 = r0.n()
            if (r15 == 0) goto Led
            h.Hchat.hooks.api.model.WeChatPatMsg r0 = r0.b()
            if (r0 == 0) goto Ld2
            java.lang.String r0 = r0.pattedUser
            goto Ld3
        Ld2:
            r0 = r5
        Ld3:
            i8.a r12 = h.Hchat.hooks.api.core.WeChatApis.contact()
            r12.getClass()
            g8.a r12 = h.Hchat.hooks.api.core.WeChatApis.a()
            if (r12 == 0) goto Le4
            java.lang.String r5 = r12.c()
        Le4:
            boolean r0 = gg.l.a(r0, r5)
            if (r0 == 0) goto Led
            r12 = r13
        Leb:
            r5 = r2
            goto Lef
        Led:
            r12 = r14
            goto Leb
        Lef:
            r3.<init>(r4, r5, r6, r7, r9, r10, r11, r12)
            r10 = r5
            r11 = r6
            r2 = r9
            java.util.List r0 = r28.l()
            java.util.Iterator r12 = r0.iterator()
        Lfd:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L3ec
            java.lang.Object r0 = r12.next()
            r5 = r0
            x8.b r5 = (x8.b) r5
            boolean r0 = r5.f21233c
            java.lang.String r6 = r5.f21231a
            int r7 = r5.f21246p
            int r8 = r5.f21243m
            r20 = r15
            long r14 = r5.f21247q
            if (r0 == 0) goto L120
            java.util.List r0 = r5.f21249s
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L123
        L120:
            r22 = r1
            goto L178
        L123:
            java.lang.String r0 = r5.f21244n
            java.lang.String r9 = r5.f21245o
            boolean r21 = og.m.t0(r0)
            if (r21 != 0) goto L180
            boolean r21 = og.m.t0(r9)
            if (r21 == 0) goto L134
            goto L180
        L134:
            java.lang.Integer r0 = z(r0)
            if (r0 == 0) goto L180
            int r0 = r0.intValue()
            java.lang.Integer r9 = z(r9)
            if (r9 == 0) goto L180
            int r9 = r9.intValue()
            java.util.Calendar r13 = java.util.Calendar.getInstance()
            r22 = r1
            r1 = 11
            int r1 = r13.get(r1)
            int r1 = r1 * 3600
            r28 = r1
            r1 = 12
            int r1 = r13.get(r1)
            int r1 = r1 * 60
            int r1 = r1 + r28
            r28 = r1
            r1 = 13
            int r1 = r13.get(r1)
            int r1 = r1 + r28
            if (r9 >= r0) goto L173
            if (r1 >= r0) goto L182
            if (r1 >= r9) goto L178
            goto L182
        L173:
            if (r1 < r0) goto L178
            if (r1 >= r9) goto L178
            goto L182
        L178:
            r15 = r20
            r1 = r22
            r13 = 1
        L17d:
            r14 = 0
            goto Lfd
        L180:
            r22 = r1
        L182:
            java.util.Set r0 = r5.f21239i
            java.util.Set r1 = r5.f21241k
            boolean r9 = r0.contains(r4)
            if (r9 != 0) goto L1cf
            boolean r9 = r0.contains(r10)
            if (r9 != 0) goto L1cf
            java.lang.String r9 = "/"
            if (r2 == 0) goto L1af
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r4)
            r13.append(r9)
            r13.append(r10)
            java.lang.String r13 = r13.toString()
            boolean r0 = r0.contains(r13)
            if (r0 == 0) goto L1af
            goto L1cf
        L1af:
            if (r2 == 0) goto L1d2
            boolean r0 = r1.contains(r10)
            if (r0 != 0) goto L1cf
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            r0.append(r9)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L1d2
        L1cf:
            r9 = 0
            goto L254
        L1d2:
            java.util.Set r0 = r5.f21238h
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L1e4
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L1e4
            goto L1fb
        L1e4:
            java.util.Iterator r0 = r0.iterator()
        L1e8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1fb
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r(r1)
            if (r1 == 0) goto L1e8
            goto L223
        L1fb:
            java.util.Set r0 = r5.f21240j
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L20d
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L20d
            goto L228
        L20d:
            java.util.Iterator r0 = r0.iterator()
        L211:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L228
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r(r1)
            if (r1 == 0) goto L211
        L223:
            boolean r9 = q(r5, r3)
            goto L254
        L228:
            int r0 = r5.f21237g
            r1 = 1
            if (r0 == r1) goto L252
            r1 = 2
            if (r0 == r1) goto L250
            r1 = 3
            if (r0 == r1) goto L24b
            r1 = 4
            if (r0 == r1) goto L238
        L236:
            r9 = 1
            goto L254
        L238:
            if (r22 == 0) goto L241
            boolean r0 = r22.isOfficialAccount()
            if (r0 == 0) goto L241
            goto L24a
        L241:
            java.lang.String r0 = "gh_"
            r1 = 0
            boolean r0 = og.t.d0(r4, r0, r1)
            if (r0 == 0) goto L1cf
        L24a:
            goto L236
        L24b:
            boolean r9 = q(r5, r3)
            goto L254
        L250:
            r9 = r2
            goto L254
        L252:
            r9 = r2 ^ 1
        L254:
            if (r9 != 0) goto L258
            goto L178
        L258:
            int r0 = r5.f21242l
            if (r2 == 0) goto L270
            r1 = 1
            if (r0 != r1) goto L266
            boolean r1 = r3.f21278f
            if (r1 != 0) goto L266
        L263:
            r0 = 0
            r1 = 1
            goto L280
        L266:
            r1 = 2
            if (r0 != r1) goto L26e
            boolean r0 = r3.f21279g
            if (r0 != 0) goto L26e
            goto L263
        L26e:
            r1 = 1
            goto L273
        L270:
            if (r0 == 0) goto L26e
            goto L263
        L273:
            if (r8 != r1) goto L27b
            boolean r0 = r3.f21280h
            if (r0 != 0) goto L27b
        L279:
            r0 = 0
            goto L280
        L27b:
            if (r8 != r1) goto L27f
            if (r20 == 0) goto L279
        L27f:
            r0 = r1
        L280:
            if (r0 != 0) goto L289
            r13 = r1
            r15 = r20
            r1 = r22
            goto L17d
        L289:
            if (r20 == 0) goto L291
            if (r8 != r1) goto L291
        L28d:
            r0 = r1
        L28e:
            r13 = 0
            goto L34b
        L291:
            java.lang.String r0 = r5.f21234d
            int r8 = r5.f21236f
            if (r8 == r1) goto L326
            r9 = 2
            if (r8 == r9) goto L2fb
            r9 = 3
            if (r8 == r9) goto L2d0
            if (r16 == 0) goto L2ce
            java.util.ArrayList r0 = N(r0)
            boolean r8 = r0.isEmpty()
            if (r8 == 0) goto L2aa
            goto L2ce
        L2aa:
            java.util.Iterator r0 = r0.iterator()
        L2ae:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L2ce
            java.lang.Object r8 = r0.next()
            java.lang.String r8 = (java.lang.String) r8
            r9 = 0
            boolean r13 = og.m.h0(r11, r8, r9)
            if (r13 != 0) goto L2ca
            boolean r8 = og.m.t0(r8)
            if (r8 == 0) goto L2c8
            goto L2ca
        L2c8:
            r8 = 0
            goto L2cb
        L2ca:
            r8 = r1
        L2cb:
            if (r8 == 0) goto L2ae
            goto L28d
        L2ce:
            r0 = 0
            goto L28e
        L2d0:
            if (r16 == 0) goto L2f8
            java.lang.String r0 = r5.f21235e
            java.util.ArrayList r0 = N(r0)
            boolean r8 = r0.isEmpty()
            if (r8 == 0) goto L2df
            goto L2f8
        L2df:
            java.util.Iterator r0 = r0.iterator()
        L2e3:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L2f8
            java.lang.Object r8 = r0.next()
            java.lang.String r8 = (java.lang.String) r8
            r13 = 0
            boolean r8 = og.m.h0(r11, r8, r13)
            if (r8 == 0) goto L2e3
        L2f6:
            r0 = r13
            goto L34b
        L2f8:
            r13 = 0
        L2f9:
            r0 = r1
            goto L34b
        L2fb:
            r13 = 0
            if (r16 == 0) goto L2f6
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch: java.lang.Throwable -> L30f
            java.util.regex.Matcher r0 = r0.matcher(r11)     // Catch: java.lang.Throwable -> L30f
            boolean r0 = r0.find()     // Catch: java.lang.Throwable -> L30f
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L30f
            goto L316
        L30f:
            r0 = move-exception
            sf.f r8 = new sf.f
            r8.<init>(r0)
            r0 = r8
        L316:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            boolean r9 = r0 instanceof sf.f
            if (r9 == 0) goto L31d
            r0 = r8
        L31d:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L2f6
            goto L2f9
        L326:
            r13 = 0
            if (r16 == 0) goto L2f6
            java.util.ArrayList r0 = N(r0)
            boolean r8 = r0.isEmpty()
            if (r8 == 0) goto L334
            goto L2f6
        L334:
            java.util.Iterator r0 = r0.iterator()
        L338:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L2f6
            java.lang.Object r8 = r0.next()
            java.lang.String r8 = (java.lang.String) r8
            boolean r8 = r11.equals(r8)
            if (r8 == 0) goto L338
            goto L2f9
        L34b:
            if (r0 != 0) goto L355
            r14 = r13
            r15 = r20
            r13 = r1
            r1 = r22
            goto Lfd
        L355:
            int r0 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            java.lang.String r8 = "|"
            java.util.concurrent.ConcurrentHashMap r9 = x8.q.f21333e
            if (r0 > 0) goto L35f
            r1 = r13
            goto L394
        L35f:
            java.lang.String r1 = wb.en.h(r6, r8, r4)
            java.lang.Object r19 = r9.get(r1)
            r13 = r19
            java.lang.Long r13 = (java.lang.Long) r13
            if (r13 == 0) goto L393
            long r23 = r13.longValue()
            long r25 = android.os.SystemClock.elapsedRealtime()
            int r19 = (r25 > r23 ? 1 : (r25 == r23 ? 0 : -1))
            if (r19 < 0) goto L390
            long r25 = r25 - r23
            r23 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r19 = (r14 > r23 ? 1 : (r14 == r23 ? 0 : -1))
            if (r19 <= 0) goto L386
            r14 = r23
        L386:
            r23 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 * r23
            int r14 = (r25 > r14 ? 1 : (r25 == r14 ? 0 : -1))
            if (r14 >= 0) goto L390
            r1 = 1
            goto L394
        L390:
            r9.remove(r1, r13)
        L393:
            r1 = 0
        L394:
            if (r1 == 0) goto L398
            goto L178
        L398:
            if (r7 > 0) goto L39c
        L39a:
            r1 = 1
            goto L3be
        L39c:
            java.lang.String r1 = bc.e.v(r6, r8, r4, r8, r10)
            java.util.concurrent.ConcurrentHashMap r13 = x8.q.f21332d
            java.lang.Object r14 = r13.get(r1)
            java.lang.Integer r14 = (java.lang.Integer) r14
            if (r14 == 0) goto L3af
            int r14 = r14.intValue()
            goto L3b0
        L3af:
            r14 = 0
        L3b0:
            if (r14 < r7) goto L3b4
            r1 = 0
            goto L3be
        L3b4:
            int r14 = r14 + 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r14)
            r13.put(r1, r7)
            goto L39a
        L3be:
            if (r1 != 0) goto L3c2
            goto L178
        L3c2:
            java.util.List r1 = r5.f21249s
            r13 = r8
            r7 = 0
            boolean r5 = r5.f21248r
            r14 = r9
            r9 = r5
            r5 = r1
            r1 = r6
            r6 = r3
            r3 = r27
            boolean r5 = k(r3, r4, r5, r6, r7, r9)
            r3 = r6
            if (r5 == 0) goto L178
            if (r0 > 0) goto L3db
            goto L178
        L3db:
            java.lang.String r0 = wb.en.h(r1, r13, r4)
            long r5 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r14.put(r0, r1)
            goto L178
        L3ec:
            return
    }

    public static void p(android.content.Context r8, x8.r r9, k8.o r10) {
            java.lang.String r0 = "greet_accepted_enable"
            boolean r0 = r9.e(r0)
            if (r0 != 0) goto La
            goto L7a
        La:
            java.lang.String r0 = r10.f7446c
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto L16
            java.lang.String r0 = r10.d()
        L16:
            r2 = r0
            java.lang.String r0 = A(r10)
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            r2.getClass()
            boolean r1 = og.m.t0(r2)
            if (r1 != 0) goto L7a
            boolean r10 = r10.f7451h
            if (r10 != 0) goto L7a
            java.lang.String r10 = "@chatroom"
            r1 = 0
            boolean r10 = og.t.W(r2, r10, r1)
            if (r10 == 0) goto L3a
            goto L7a
        L3a:
            java.lang.String r10 = "我通过了你的朋友验证请求，现在我们可以开始聊天了"
            boolean r10 = gg.l.a(r0, r10)
            if (r10 != 0) goto L43
            goto L7a
        L43:
            java.lang.String r10 = "greet_accepted_tag_enable"
            boolean r10 = r9.e(r10)
            java.lang.String r1 = "greet_accepted_tag_name"
            java.lang.String r3 = ""
            java.lang.String r1 = r9.h(r1, r3)
            w(r2, r1, r10)
            x8.f r10 = x8.q.f21342n
            c(r9, r2, r10)
            d(r9, r2, r10)
            java.lang.String r10 = "greet_accepted_delay_ms"
            long r3 = r9.g(r10)
            r5 = 0
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r10 >= 0) goto L69
            goto L6a
        L69:
            r5 = r3
        L6a:
            java.util.List r3 = r9.i()
            x8.g r4 = new x8.g
            r9 = 248(0xf8, float:3.48E-43)
            r4.<init>(r9, r2, r2, r0)
            r7 = 0
            r1 = r8
            k(r1, r2, r3, r4, r5, r7)
        L7a:
            return
    }

    public static boolean q(x8.b r5, x8.g r6) {
            java.util.Set r0 = r5.f21238h
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r(r3)
            if (r3 == 0) goto Ld
            r1.add(r2)
            goto Ld
        L24:
            java.util.Set r0 = tf.m.U1(r1)
            java.util.Set r5 = r5.f21240j
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r5 = r5.iterator()
        L35:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L4c
            java.lang.Object r2 = r5.next()
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r(r3)
            if (r3 == 0) goto L35
            r1.add(r2)
            goto L35
        L4c:
            java.util.Set r5 = tf.m.U1(r1)
            java.lang.String r1 = r6.f21273a
            java.lang.String r2 = r6.f21274b
            boolean r6 = r6.f21277e
            boolean r3 = r0.contains(r1)
            if (r3 != 0) goto La5
            if (r6 != 0) goto L64
            boolean r3 = r0.contains(r2)
            if (r3 != 0) goto La5
        L64:
            java.lang.String r3 = "/"
            if (r6 == 0) goto L80
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r3)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            boolean r0 = r0.contains(r4)
            if (r0 != 0) goto La5
        L80:
            if (r6 == 0) goto L9a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            boolean r0 = r5.contains(r0)
            if (r0 != 0) goto La5
        L9a:
            if (r6 == 0) goto La3
            boolean r5 = r5.contains(r2)
            if (r5 == 0) goto La3
            goto La5
        La3:
            r5 = 0
            return r5
        La5:
            r5 = 1
            return r5
    }

    public static boolean r(java.lang.String r4) {
            r0 = 1
            char[] r1 = new char[r0]
            r2 = 47
            r3 = 0
            r1[r3] = r2
            r2 = 6
            java.util.List r4 = og.m.F0(r4, r1, r2)
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L14
            goto L40
        L14:
            java.util.Iterator r4 = r4.iterator()
        L18:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L40
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            int r2 = r1.length()
            if (r2 <= 0) goto L3c
            java.lang.String r2 = "@@"
            boolean r1 = og.m.h0(r1, r2, r3)
            if (r1 != 0) goto L3c
            r1 = r0
            goto L3d
        L3c:
            r1 = r3
        L3d:
            if (r1 != 0) goto L18
            return r3
        L40:
            return r0
    }

    public static boolean s(java.lang.String r7) {
            java.io.File r0 = new java.io.File
            r0.<init>(r7)
            boolean r1 = r0.isFile()
            r2 = 0
            if (r1 == 0) goto L44
            long r0 = r0.length()
            r3 = 512(0x200, double:2.53E-321)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L17
            goto L44
        L17:
            android.media.MediaMetadataRetriever r0 = new android.media.MediaMetadataRetriever
            r0.<init>()
            r0.setDataSource(r7)     // Catch: java.lang.Throwable -> L41
            r7 = 9
            java.lang.String r7 = r0.extractMetadata(r7)     // Catch: java.lang.Throwable -> L41
            if (r7 == 0) goto L41
            boolean r1 = og.m.t0(r7)     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L2e
            goto L41
        L2e:
            java.lang.Long r7 = og.t.g0(r7)     // Catch: java.lang.Throwable -> L41
            r3 = 0
            if (r7 == 0) goto L3b
            long r5 = r7.longValue()     // Catch: java.lang.Throwable -> L41
            goto L3c
        L3b:
            r5 = r3
        L3c:
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L41
            r2 = 1
        L41:
            r0.release()     // Catch: java.lang.Throwable -> L44
        L44:
            return r2
    }

    public static int t(byte[] r1, int r2) {
            r0 = r1[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r2 = r2 + 1
            r1 = r1[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r1 = r1 | r0
            return r1
    }

    public static int u(byte[] r2, int r3) {
            r0 = r2[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r3 + 1
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r1 = r3 + 2
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            int r3 = r3 + 3
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 24
            r2 = r2 | r0
            return r2
    }

    public static void v(x8.t r4, java.lang.String r5, java.lang.String r6, long r7) {
            boolean r0 = r4.f21360l
            java.lang.String r1 = r4.f21361m
            if (r0 == 0) goto L59
            java.lang.CharSequence r0 = og.m.R0(r1)
            java.lang.String r0 = r0.toString()
            boolean r0 = og.m.t0(r0)
            if (r0 == 0) goto L15
            goto L59
        L15:
            java.lang.String r4 = r4.f21362n
            java.lang.CharSequence r4 = og.m.R0(r4)
            java.lang.String r4 = r4.toString()
            boolean r0 = og.m.t0(r4)
            if (r0 == 0) goto L27
            java.lang.String r4 = "queryKugouMusic"
        L27:
            java.lang.String r6 = l(r6)
            boolean r0 = og.m.t0(r6)
            if (r0 == 0) goto L32
            goto L59
        L32:
            java.util.concurrent.ConcurrentHashMap r0 = x8.q.f21338j
            java.lang.Object r0 = r0.get(r5)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L41
            long r2 = r0.longValue()
            goto L43
        L41:
            r2 = 0
        L43:
            int r7 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r7 < 0) goto L48
            goto L59
        L48:
            h.Hchat.hooks.items.script.ScriptPluginRuntime r7 = h.Hchat.hooks.items.script.ScriptPluginRuntime.INSTANCE
            java.lang.CharSequence r8 = og.m.R0(r1)
            java.lang.String r8 = r8.toString()
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r6}
            r7.m13callPluginFunction0E7RQCE(r8, r4, r5)
        L59:
            return
    }

    public static void w(java.lang.String r0, java.lang.String r1, boolean r2) {
            if (r2 == 0) goto L1f
            boolean r2 = og.m.t0(r0)
            if (r2 != 0) goto L1f
            boolean r2 = og.m.t0(r1)
            if (r2 == 0) goto Lf
            goto L1f
        Lf:
            i8.a r2 = h.Hchat.hooks.api.core.WeChatApis.contact()     // Catch: java.lang.Throwable -> L1f
            r2.getClass()     // Catch: java.lang.Throwable -> L1f
            g8.i r2 = h.Hchat.hooks.api.core.WeChatApis.e()     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto L1f
            r2.O(r0, r1)     // Catch: java.lang.Throwable -> L1f
        L1f:
            return
    }

    public static java.util.List x(java.lang.String r2) {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2a
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L2a
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L2a
            r2.<init>()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = "data"
            org.json.JSONArray r1 = r0.optJSONArray(r1)     // Catch: java.lang.Throwable -> L2a
            y(r2, r1)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = "models"
            org.json.JSONArray r1 = r0.optJSONArray(r1)     // Catch: java.lang.Throwable -> L2a
            y(r2, r1)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r1 = "result"
            org.json.JSONArray r0 = r0.optJSONArray(r1)     // Catch: java.lang.Throwable -> L2a
            y(r2, r0)     // Catch: java.lang.Throwable -> L2a
            java.util.List r2 = tf.m.J1(r2)     // Catch: java.lang.Throwable -> L2a
            goto L31
        L2a:
            r2 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r2)
            r2 = r0
        L31:
            boolean r0 = r2 instanceof sf.f
            if (r0 == 0) goto L38
            tf.t r2 = tf.t.f13167g
        L38:
            java.util.List r2 = (java.util.List) r2
            return r2
    }

    public static final void y(java.util.LinkedHashSet r5, org.json.JSONArray r6) {
            if (r6 != 0) goto L3
            goto La
        L3:
            int r0 = r6.length()
            r1 = 0
        L8:
            if (r1 < r0) goto Lb
        La:
            return
        Lb:
            java.lang.Object r2 = r6.opt(r1)
            boolean r3 = r2 instanceof org.json.JSONObject
            if (r3 == 0) goto L28
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            java.lang.String r3 = "id"
            java.lang.String r3 = r2.optString(r3)
            boolean r4 = og.m.t0(r3)
            if (r4 == 0) goto L32
            java.lang.String r3 = "name"
            java.lang.String r3 = r2.optString(r3)
            goto L32
        L28:
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L30
            r3 = r2
            java.lang.String r3 = (java.lang.String) r3
            goto L32
        L30:
            java.lang.String r3 = ""
        L32:
            java.lang.String r2 = p.a.l(r3, r3)
            int r3 = r2.length()
            if (r3 <= 0) goto L3f
            r5.add(r2)
        L3f:
            int r1 = r1 + 1
            goto L8
    }

    public static java.lang.Integer z(java.lang.String r5) {
            r0 = 1
            char[] r1 = new char[r0]
            r2 = 58
            r3 = 0
            r1[r3] = r2
            r2 = 6
            java.util.List r5 = og.m.F0(r5, r1, r2)
            int r1 = r5.size()
            r2 = 2
            if (r2 > r1) goto L66
            r4 = 4
            if (r1 >= r4) goto L66
            java.lang.Object r1 = r5.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Integer r1 = og.t.f0(r1)
            if (r1 == 0) goto L66
            int r1 = r1.intValue()
            r4 = 23
            int r1 = r9.e0.r(r1, r3, r4)
            java.lang.Object r0 = r5.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Integer r0 = og.t.f0(r0)
            if (r0 == 0) goto L66
            int r0 = r0.intValue()
            r4 = 59
            int r0 = r9.e0.r(r0, r3, r4)
            java.lang.Object r5 = tf.m.w1(r2, r5)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L5b
            r2 = 10
            java.lang.Integer r5 = og.t.e0(r2, r5)
            if (r5 == 0) goto L5b
            int r5 = r5.intValue()
            int r3 = r9.e0.r(r5, r3, r4)
        L5b:
            int r1 = r1 * 3600
            int r0 = r0 * 60
            int r0 = r0 + r1
            int r0 = r0 + r3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            return r5
        L66:
            r5 = 0
            return r5
    }
}
