package ra;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f11834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.Object f11836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Object f11837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Object f11838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.Object f11839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.Object f11840g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.Object f11841h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.lang.Object f11842i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public java.lang.Object f11843j;

    public c(android.content.Context r2, l3.l r3, b5.c r4, na.b r5) {
            r1 = this;
            r1.<init>()
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r3.<init>(r0)
            r1.f11839f = r3
            java.util.ArrayDeque r3 = new java.util.ArrayDeque
            r3.<init>()
            r1.f11840g = r3
            java.util.Set r3 = j8.b.o()
            r1.f11841h = r3
            java.util.Set r3 = j8.b.o()
            r1.f11842i = r3
            r1.f11836c = r2
            r1.f11837d = r4
            r1.f11838e = r5
            return
    }

    public c(h.Hchat.dexkit.DexFinder r2, l3.l r3, na.k r4, m8.c r5, ke.h r6, na.b r7, na.b r8, na.b r9) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f11834a = r0
            r1.f11835b = r0
            r1.f11836c = r2
            r1.f11837d = r3
            r1.f11838e = r4
            r1.f11839f = r5
            r1.f11840g = r6
            r1.f11841h = r7
            r1.f11842i = r8
            r1.f11843j = r9
            return
    }

    public static void c(java.lang.String r1) {
            i8.e r0 = h.Hchat.hooks.api.core.WeChatApis.runtime()     // Catch: java.lang.Throwable -> L10
            r0.getClass()     // Catch: java.lang.Throwable -> L10
            o8.j r0 = h.Hchat.hooks.api.core.WeChatApis.p()     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L10
            r0.a(r1)     // Catch: java.lang.Throwable -> L10
        L10:
            return
    }

    public static java.lang.String g(java.lang.String r8, java.lang.String... r9) {
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            java.lang.String r1 = ""
            if (r0 != 0) goto L69
            int r0 = r9.length
            r2 = 0
            r3 = r2
        Lb:
            if (r3 >= r0) goto L69
            r4 = r9[r3]
            boolean r5 = android.text.TextUtils.isEmpty(r8)
            if (r5 != 0) goto L5e
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L1c
            goto L5e
        L1c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e
            r5.<init>()     // Catch: java.lang.Throwable -> L5e
            r5.append(r4)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = "="
            r5.append(r4)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L5e
            r5 = 63
            int r5 = r8.indexOf(r5)     // Catch: java.lang.Throwable -> L5e
            if (r5 < 0) goto L38
            int r5 = r5 + 1
            goto L39
        L38:
            r5 = r2
        L39:
            int r6 = r8.length()     // Catch: java.lang.Throwable -> L5e
            if (r5 >= r6) goto L5e
            r6 = 38
            int r6 = r8.indexOf(r6, r5)     // Catch: java.lang.Throwable -> L5e
            if (r6 >= 0) goto L4b
            int r6 = r8.length()     // Catch: java.lang.Throwable -> L5e
        L4b:
            boolean r7 = r8.startsWith(r4, r5)     // Catch: java.lang.Throwable -> L5e
            if (r7 == 0) goto L5b
            int r4 = r4.length()     // Catch: java.lang.Throwable -> L5e
            int r5 = r5 + r4
            java.lang.String r4 = r8.substring(r5, r6)     // Catch: java.lang.Throwable -> L5e
            goto L5f
        L5b:
            int r5 = r6 + 1
            goto L39
        L5e:
            r4 = r1
        L5f:
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L66
            return r4
        L66:
            int r3 = r3 + 1
            goto Lb
        L69:
            return r1
    }

    public static void t(java.lang.String r1, long r2, java.lang.Runnable r4) {
            i8.e r0 = h.Hchat.hooks.api.core.WeChatApis.runtime()     // Catch: java.lang.Throwable -> L11
            r0.getClass()     // Catch: java.lang.Throwable -> L11
            o8.j r0 = h.Hchat.hooks.api.core.WeChatApis.p()     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L11
            r0.f(r1, r2, r4)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r1.<init>(r0)
            r1.postDelayed(r4, r2)
            return
    }

    public void a(java.lang.String r2, java.lang.String r3, java.lang.String r4, na.a r5) {
            r1 = this;
            boolean r0 = r5.I
            if (r0 != 0) goto L6
            goto L98
        L6:
            java.lang.String r5 = r5.J
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L10
            java.lang.String r5 = "抢到红包 {amount} 元"
        L10:
            java.lang.Object r0 = r1.f11837d
            b5.c r0 = (b5.c) r0
            java.lang.String r2 = r0.n(r5, r2, r3, r4)
            java.lang.String r2 = r2.trim()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L24
            goto L98
        L24:
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 == 0) goto L2d
            java.lang.String r3 = ""
            goto L7a
        L2d:
            java.lang.String r3 = "sendid"
            java.lang.String r5 = "sendId"
            java.lang.String[] r3 = new java.lang.String[]{r3, r5}
            java.lang.String r3 = g(r4, r3)
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 != 0) goto L46
            java.lang.String r4 = "sendid:"
            java.lang.String r3 = r4.concat(r3)
            goto L7a
        L46:
            java.lang.String r3 = "msgid"
            java.lang.String r5 = "msgId"
            java.lang.String[] r3 = new java.lang.String[]{r3, r5}
            java.lang.String r3 = g(r4, r3)
            java.lang.String r5 = "channelid"
            java.lang.String r0 = "channelId"
            java.lang.String[] r5 = new java.lang.String[]{r5, r0}
            java.lang.String r5 = g(r4, r5)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L72
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L6b
            goto L72
        L6b:
            java.lang.String r3 = "url:"
            java.lang.String r3 = wb.en.g(r3, r4)
            goto L7a
        L72:
            java.lang.String r4 = "msg:"
            java.lang.String r0 = "|channel:"
            java.lang.String r3 = bc.e.j(r4, r3, r0, r5)
        L7a:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L82
            r4 = 1
            goto L96
        L82:
            java.lang.Object r4 = r1.f11842i
            java.util.Set r4 = (java.util.Set) r4
            boolean r4 = r4.contains(r3)
            if (r4 == 0) goto L8e
            r4 = 0
            goto L96
        L8e:
            java.lang.Object r4 = r1.f11841h
            java.util.Set r4 = (java.util.Set) r4
            boolean r4 = r4.add(r3)
        L96:
            if (r4 != 0) goto L99
        L98:
            return
        L99:
            java.lang.Object r4 = r1.f11839f
            android.os.Handler r4 = (android.os.Handler) r4
            r8.b r5 = new r8.b
            r0 = 3
            r5.<init>(r1, r3, r2, r0)
            r4.post(r5)
            return
    }

    public java.util.ArrayList b(java.lang.String r7, java.lang.String r8) {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 != 0) goto Le
            r0.add(r7)
        Le:
            java.lang.Object r1 = r6.f11837d
            l3.l r1 = (l3.l) r1
            java.lang.String r2 = "hb_fake_packet_receive_enable"
            r3 = 0
            android.content.SharedPreferences r1 = r1.b()     // Catch: java.lang.Throwable -> L1e
            boolean r1 = r1.getBoolean(r2, r3)     // Catch: java.lang.Throwable -> L1e
            goto L1f
        L1e:
            r1 = r3
        L1f:
            if (r1 == 0) goto Lb7
            java.util.concurrent.ConcurrentHashMap r1 = pa.a.f10449a
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            java.lang.String r2 = "@"
            java.lang.String r4 = "%40"
            if (r1 != 0) goto L3a
            java.lang.String r1 = r7.replace(r4, r2)
            java.lang.String r5 = "^[0-9]+@chatroom$"
            boolean r1 = r1.matches(r5)
            if (r1 == 0) goto L3a
            r3 = 1
        L3a:
            if (r3 != 0) goto L3e
            goto Lb7
        L3e:
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 == 0) goto L46
            r1 = r7
            goto L52
        L46:
            java.lang.String r1 = "%40%40"
            java.lang.String r1 = r7.replace(r4, r1)
            java.lang.String r3 = "@@"
            java.lang.String r1 = r1.replace(r2, r3)
        L52:
            pa.a.b(r7, r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L64
            boolean r2 = r0.contains(r1)
            if (r2 != 0) goto L64
            r0.add(r1)
        L64:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r2 = "@chatroom"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            pa.a.b(r7, r1)
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L87
            boolean r3 = r0.contains(r1)
            if (r3 != 0) goto L87
            r0.add(r1)
        L87:
            java.lang.String r1 = "sendusername"
            java.lang.String r8 = oa.b.d(r8, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 != 0) goto Lb7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            r1.append(r8)
            r1.append(r2)
            java.lang.String r8 = r1.toString()
            pa.a.b(r7, r8)
            boolean r7 = android.text.TextUtils.isEmpty(r8)
            if (r7 != 0) goto Lb7
            boolean r7 = r0.contains(r8)
            if (r7 != 0) goto Lb7
            r0.add(r8)
        Lb7:
            return r0
    }

    public void d(java.lang.String r5) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "redpacket_receive_timeout:"
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            c(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "redpacket_open_timeout:"
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            c(r0)
            java.lang.Object r0 = r4.f11838e
            na.k r0 = (na.k) r0
            java.util.concurrent.ConcurrentHashMap r1 = r0.f9186k
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 == 0) goto L2f
            goto L88
        L2f:
            if (r5 == 0) goto L88
            java.lang.Object r2 = r1.get(r5)
            java.util.Map r2 = (java.util.Map) r2
            if (r2 == 0) goto L71
            java.lang.String r3 = "nativeurl"
            java.lang.Object r2 = r2.get(r3)
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L46
            java.lang.String r2 = (java.lang.String) r2
            goto L47
        L46:
            r2 = 0
        L47:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L71
            java.util.concurrent.ConcurrentHashMap r3 = r0.f9181f
            java.util.Map r3 = gg.x.b(r3)
            r3.remove(r2)
            java.util.concurrent.ConcurrentHashMap r3 = r0.f9182g
            java.util.Map r3 = gg.x.b(r3)
            r3.remove(r2)
            java.util.concurrent.ConcurrentHashMap r3 = r0.f9183h
            java.util.Map r3 = gg.x.b(r3)
            r3.remove(r2)
            java.util.concurrent.ConcurrentHashMap r3 = r0.f9184i
            java.util.Map r3 = gg.x.b(r3)
            r3.remove(r2)
        L71:
            java.util.Set r2 = r0.f9190o
            r2.remove(r5)
            java.util.Set r2 = r0.f9191p
            r2.remove(r5)
            java.util.concurrent.ConcurrentHashMap r2 = r0.f9188m
            r2.remove(r5)
            java.util.concurrent.ConcurrentHashMap r0 = r0.f9189n
            r0.remove(r5)
            r1.remove(r5)
        L88:
            return
    }

    public void e() {
            r2 = this;
        L0:
            boolean r0 = r2.f11834a
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r2.f11843j
            android.speech.tts.TextToSpeech r0 = (android.speech.tts.TextToSpeech) r0
            if (r0 == 0) goto L1f
            java.lang.Object r0 = r2.f11840g
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            java.lang.Object r0 = r0.poll()
            sa.b r0 = (sa.b) r0
            if (r0 == 0) goto L1f
            boolean r1 = r2.v(r0)
            if (r1 != 0) goto L0
            r2.s(r0)
        L1f:
            return
    }

    public void f() {
            r4 = this;
            java.lang.Object r0 = r4.f11836c
            android.content.Context r0 = (android.content.Context) r0
            boolean r1 = r4.f11834a
            if (r1 == 0) goto L12
            java.lang.Object r1 = r4.f11843j
            android.speech.tts.TextToSpeech r1 = (android.speech.tts.TextToSpeech) r1
            if (r1 == 0) goto L12
            r4.e()
            return
        L12:
            boolean r1 = r4.f11835b
            if (r1 == 0) goto L17
            return
        L17:
            r1 = 1
            r4.f11835b = r1
            android.content.Context r1 = r0.getApplicationContext()     // Catch: java.lang.Throwable -> L30
            if (r1 != 0) goto L21
            goto L22
        L21:
            r0 = r1
        L22:
            android.speech.tts.TextToSpeech r1 = new android.speech.tts.TextToSpeech     // Catch: java.lang.Throwable -> L30
            sa.a r2 = new sa.a     // Catch: java.lang.Throwable -> L30
            r3 = 0
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L30
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L30
            r4.f11843j = r1     // Catch: java.lang.Throwable -> L30
            return
        L30:
            r0 = move-exception
            r1 = 0
            r4.f11835b = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "红包播报初始化失败: "
            r1.<init>(r2)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r4.k(r1, r0)
            java.lang.String r0 = "初始化异常"
            r4.q(r0)
            return
    }

    public boolean h(java.lang.Class r6, java.lang.String r7) {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L4
            goto L32
        L4:
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredMethods(r6)     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2d
        Lc:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2d
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = "onGYNetEnd"
            java.lang.String r4 = r2.getName()     // Catch: java.lang.Throwable -> L2d
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto Lc
            java.lang.Class[] r3 = r2.getParameterTypes()     // Catch: java.lang.Throwable -> L2d
            int r3 = r3.length     // Catch: java.lang.Throwable -> L2d
            r4 = 3
            if (r3 != r4) goto Lc
            goto L30
        L2d:
            r6 = move-exception
            goto L60
        L2f:
            r2 = 0
        L30:
            if (r2 != 0) goto L33
        L32:
            return r0
        L33:
            r8.i r1 = r8.i.f11631b     // Catch: java.lang.Throwable -> L2d
            ra.b r3 = new ra.b     // Catch: java.lang.Throwable -> L2d
            r4 = 1
            r3.<init>(r5, r4)     // Catch: java.lang.Throwable -> L2d
            r1.b(r2, r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
            r1.<init>()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = "Hook拆红包回调成功: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L2d
            r1.append(r7)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = " -> "
            r1.append(r2)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L2d
            r1.append(r6)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r6 = r1.toString()     // Catch: java.lang.Throwable -> L2d
            r5.j(r6)     // Catch: java.lang.Throwable -> L2d
            r6 = 1
            return r6
        L60:
            java.lang.String r1 = "Hook拆红包回调失败("
            java.lang.String r2 = "): "
            java.lang.StringBuilder r7 = bc.e.o(r1, r7, r2)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.j(r6)
            return r0
    }

    public boolean i(java.lang.Class r6, java.lang.String r7) {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L4
            goto L32
        L4:
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredMethods(r6)     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2d
        Lc:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2d
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = "onGYNetEnd"
            java.lang.String r4 = r2.getName()     // Catch: java.lang.Throwable -> L2d
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto Lc
            java.lang.Class[] r3 = r2.getParameterTypes()     // Catch: java.lang.Throwable -> L2d
            int r3 = r3.length     // Catch: java.lang.Throwable -> L2d
            r4 = 3
            if (r3 != r4) goto Lc
            goto L30
        L2d:
            r6 = move-exception
            goto L60
        L2f:
            r2 = 0
        L30:
            if (r2 != 0) goto L33
        L32:
            return r0
        L33:
            r8.i r1 = r8.i.f11631b     // Catch: java.lang.Throwable -> L2d
            ra.b r3 = new ra.b     // Catch: java.lang.Throwable -> L2d
            r4 = 0
            r3.<init>(r5, r4)     // Catch: java.lang.Throwable -> L2d
            r1.b(r2, r3)     // Catch: java.lang.Throwable -> L2d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
            r1.<init>()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = "Hook收红包回调成功: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L2d
            r1.append(r7)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = " -> "
            r1.append(r2)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L2d
            r1.append(r6)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r6 = r1.toString()     // Catch: java.lang.Throwable -> L2d
            r5.j(r6)     // Catch: java.lang.Throwable -> L2d
            r6 = 1
            return r6
        L60:
            java.lang.String r1 = "Hook收红包回调失败("
            java.lang.String r2 = "): "
            java.lang.StringBuilder r7 = bc.e.o(r1, r7, r2)
            java.lang.String r6 = r6.getMessage()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.j(r6)
            return r0
    }

    public void j(java.lang.String r2) {
            r1 = this;
            java.lang.Object r0 = r1.f11843j
            na.b r0 = (na.b) r0
            na.e r0 = r0.f9099h
            r0.d(r2)
            return
    }

    public void k(java.lang.String r3, java.lang.Throwable r4) {
            r2 = this;
            java.lang.String r0 = "ERROR "
            java.lang.String r0 = r0.concat(r3)
            java.lang.Object r1 = r2.f11838e
            na.b r1 = (na.b) r1
            if (r1 == 0) goto Lf
            r1.a(r0)
        Lf:
            java.lang.String r0 = "[Hchat:RedPacketAnnouncer] "
            java.lang.String r3 = r0.concat(r3)
            fb.v0.n(r3, r4)
            return
    }

    public java.lang.Object l(java.lang.Class r4, java.lang.reflect.Constructor r5, java.lang.Object[] r6) {
            r3 = this;
            r0 = 0
            if (r5 == 0) goto L1e
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.newInstance(r5, r6)     // Catch: java.lang.Throwable -> L8
            goto L1f
        L8:
            r5 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "  ctor.newInstance 失败: "
            r1.<init>(r2)
            java.lang.String r5 = r5.getMessage()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r3.j(r5)
        L1e:
            r5 = r0
        L1f:
            if (r5 != 0) goto L29
            if (r4 != 0) goto L24
            goto L28
        L24:
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.newInstanceByArgs(r4, r6)     // Catch: java.lang.Throwable -> L28
        L28:
            r5 = r0
        L29:
            if (r5 == 0) goto L3c
            java.lang.Class r4 = r5.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r6 = "  请求对象已创建: "
            java.lang.String r4 = r6.concat(r4)
            r3.j(r4)
        L3c:
            return r5
    }

    public java.lang.String m(java.lang.String r11, java.lang.String r12) {
            r10 = this;
            java.lang.Object r0 = r10.f11837d
            l3.l r0 = (l3.l) r0
            java.lang.String r1 = "hb_fake_packet_receive_enable"
            r2 = 0
            android.content.SharedPreferences r0 = r0.b()     // Catch: java.lang.Throwable -> L10
            boolean r0 = r0.getBoolean(r1, r2)     // Catch: java.lang.Throwable -> L10
            goto L11
        L10:
            r0 = r2
        L11:
            if (r0 != 0) goto L15
            goto Laa
        L15:
            java.util.concurrent.ConcurrentHashMap r0 = pa.a.f10449a
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto Laa
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            r1 = 1
            java.lang.String r3 = "%40"
            java.lang.String r4 = "@"
            if (r0 != 0) goto L36
            java.lang.String r0 = r12.replace(r3, r4)
            java.lang.String r5 = "^[0-9]+@chatroom$"
            boolean r0 = r0.matches(r5)
            if (r0 == 0) goto L36
            r0 = r1
            goto L37
        L36:
            r0 = r2
        L37:
            if (r0 != 0) goto L3b
            goto Laa
        L3b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laa
            r0.<init>(r11)     // Catch: java.lang.Throwable -> Laa
            r5 = 63
            int r5 = r11.indexOf(r5)     // Catch: java.lang.Throwable -> Laa
            if (r5 < 0) goto L4a
            int r5 = r5 + r1
            goto L4b
        L4a:
            r5 = r2
        L4b:
            int r6 = r0.length()     // Catch: java.lang.Throwable -> Laa
            if (r5 >= r6) goto La4
            java.lang.String r6 = "&"
            int r6 = r0.indexOf(r6, r5)     // Catch: java.lang.Throwable -> Laa
            if (r6 >= 0) goto L5d
            int r6 = r0.length()     // Catch: java.lang.Throwable -> Laa
        L5d:
            java.lang.String r7 = "="
            int r7 = r0.indexOf(r7, r5)     // Catch: java.lang.Throwable -> Laa
            if (r7 <= r5) goto La1
            if (r7 >= r6) goto La1
            int r7 = r7 + 1
            java.lang.String r5 = r0.substring(r7, r6)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r8 = r5.replace(r3, r4)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r8 = r8.toLowerCase()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r9 = "chatroom"
            boolean r8 = r8.contains(r9)     // Catch: java.lang.Throwable -> Laa
            if (r8 == 0) goto La1
            java.lang.String r8 = r5.replace(r3, r4)     // Catch: java.lang.Throwable -> Laa
            boolean r8 = r12.equals(r8)     // Catch: java.lang.Throwable -> Laa
            if (r8 != 0) goto La1
            boolean r2 = r5.contains(r3)     // Catch: java.lang.Throwable -> Laa
            if (r2 == 0) goto L92
            java.lang.String r2 = r12.replace(r4, r3)     // Catch: java.lang.Throwable -> Laa
            goto L93
        L92:
            r2 = r12
        L93:
            r0.replace(r7, r6, r2)     // Catch: java.lang.Throwable -> Laa
            int r2 = r2.length()     // Catch: java.lang.Throwable -> Laa
            int r5 = r5.length()     // Catch: java.lang.Throwable -> Laa
            int r2 = r2 - r5
            int r6 = r6 + r2
            r2 = r1
        La1:
            int r5 = r6 + 1
            goto L4b
        La4:
            if (r2 == 0) goto Laa
            java.lang.String r11 = r0.toString()     // Catch: java.lang.Throwable -> Laa
        Laa:
            return r11
    }

    public void n(java.lang.String r4, java.util.Map r5) {
            r3 = this;
            java.lang.Object r0 = r3.f11842i
            na.b r0 = (na.b) r0
            java.lang.String r1 = ""
            if (r5 == 0) goto L11
            java.lang.String r2 = "talker"
            java.lang.Object r2 = r5.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            goto L12
        L11:
            r2 = r1
        L12:
            if (r5 == 0) goto L1d
            java.lang.String r1 = "nativeurl"
            java.lang.Object r5 = r5.get(r1)
            r1 = r5
            java.lang.String r1 = (java.lang.String) r1
        L1d:
            na.e r5 = r0.f9099h
            be.k r0 = r5.f9114h
            na.a r5 = r5.g(r1)
            r0.m(r2, r1, r4, r5)
            return
    }

    public void o(sa.b r2) {
            r1 = this;
            java.lang.String r2 = r2.f12404a
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L9
            return
        L9:
            java.lang.Object r0 = r1.f11841h
            java.util.Set r0 = (java.util.Set) r0
            r0.remove(r2)
            return
    }

    public boolean p(java.util.Map r12, java.lang.String r13, java.lang.String r14) {
            r11 = this;
            java.lang.Object r0 = r11.f11838e
            na.k r0 = (na.k) r0
            java.util.concurrent.ConcurrentHashMap r0 = r0.f9189n
            r1 = 0
            if (r12 == 0) goto L78
            boolean r2 = android.text.TextUtils.isEmpty(r13)
            if (r2 == 0) goto L10
            goto L78
        L10:
            java.lang.Object r2 = r0.get(r13)
            if (r2 == 0) goto L21
            java.lang.Object r2 = r0.get(r13)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            goto L22
        L21:
            r2 = r1
        L22:
            r3 = 1
            if (r2 < r3) goto L26
            goto L78
        L26:
            java.lang.String r4 = "openReq"
            java.lang.Object r8 = r12.get(r4)
            if (r8 != 0) goto L2f
            goto L78
        L2f:
            int r2 = r2 + r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.put(r13, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "静默拆包重试: sendid="
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r1 = " attempt="
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = " reason="
            r0.append(r1)
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            r11.j(r14)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "redpacket_open_retry:"
            r14.<init>(r0)
            r14.append(r13)
            java.lang.String r14 = r14.toString()
            r0 = 1200(0x4b0, double:5.93E-321)
            long r4 = (long) r2
            long r0 = r0 * r4
            b9.c r5 = new b9.c
            r10 = 17
            r6 = r11
            r9 = r12
            r7 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            t(r14, r0, r5)
            return r3
        L78:
            return r1
    }

    public void q(java.lang.String r8) {
            r7 = this;
            java.lang.Object r0 = r7.f11840g
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lb
            goto L55
        Lb:
            int r1 = r0.size()
            r2 = 0
        L10:
            if (r2 >= r1) goto L3f
            java.lang.Object r3 = r0.poll()
            sa.b r3 = (sa.b) r3
            if (r3 != 0) goto L1b
            goto L3c
        L1b:
            int r4 = r3.f12406c
            r5 = 1
            if (r4 < r5) goto L2e
            r7.o(r3)
            java.lang.String r3 = "红包播报放弃: "
            java.lang.String r3 = r3.concat(r8)
            r4 = 0
            r7.k(r3, r4)
            goto L3c
        L2e:
            sa.b r5 = new sa.b
            java.lang.String r6 = r3.f12404a
            java.lang.String r3 = r3.f12405b
            int r4 = r4 + 1
            r5.<init>(r4, r6, r3)
            r0.offer(r5)
        L3c:
            int r2 = r2 + 1
            goto L10
        L3f:
            boolean r8 = r0.isEmpty()
            if (r8 != 0) goto L55
            java.lang.Object r8 = r7.f11839f
            android.os.Handler r8 = (android.os.Handler) r8
            a1.a r0 = new a1.a
            r1 = 27
            r0.<init>(r7, r1)
            r1 = 800(0x320, double:3.953E-321)
            r8.postDelayed(r0, r1)
        L55:
            return
    }

    public boolean r(java.lang.String r12, java.lang.String r13) {
            r11 = this;
            java.lang.Object r0 = r11.f11838e
            na.k r0 = (na.k) r0
            java.util.concurrent.ConcurrentHashMap r1 = r0.f9188m
            java.util.concurrent.ConcurrentHashMap r2 = r0.f9186k
            java.lang.Object r2 = r2.get(r12)
            java.util.Map r2 = (java.util.Map) r2
            r3 = 0
            if (r2 != 0) goto L12
            goto L4a
        L12:
            java.lang.Object r4 = r1.get(r12)
            if (r4 == 0) goto L23
            java.lang.Object r1 = r1.get(r12)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L24
        L23:
            r1 = r3
        L24:
            r4 = 2
            if (r1 < r4) goto L28
            goto L4a
        L28:
            java.lang.String r4 = "content"
            java.lang.Object r4 = r2.get(r4)
            java.lang.String r7 = java.lang.String.valueOf(r4)
            java.lang.String r4 = "talker"
            java.lang.Object r4 = r2.get(r4)
            r8 = r4
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r4 = "nativeurl"
            java.lang.Object r2 = r2.get(r4)
            r9 = r2
            java.lang.String r9 = (java.lang.String) r9
            boolean r2 = android.text.TextUtils.isEmpty(r9)
            if (r2 == 0) goto L4b
        L4a:
            return r3
        L4b:
            java.util.Set r2 = r0.f9190o
            r2.remove(r12)
            java.util.Set r0 = r0.f9191p
            r0.remove(r12)
            r0 = 1
            int r10 = r1 + 1
            java.lang.String r1 = " attempt="
            java.lang.String r2 = " reason="
            java.lang.String r3 = "静默收包重试: sendid="
            java.lang.StringBuilder r1 = eh.a.u(r10, r3, r12, r1, r2)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r11.j(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r1 = "redpacket_receive_retry:"
            r13.<init>(r1)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            r1 = 900(0x384, double:4.447E-321)
            long r3 = (long) r10
            long r3 = r3 * r1
            lb.a r5 = new lb.a
            r6 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            t(r12, r3, r5)
            return r0
    }

    public void s(sa.b r6) {
            r5 = this;
            java.lang.Object r0 = r5.f11843j     // Catch: java.lang.Throwable -> L9
            android.speech.tts.TextToSpeech r0 = (android.speech.tts.TextToSpeech) r0     // Catch: java.lang.Throwable -> L9
            if (r0 == 0) goto L9
            r0.shutdown()     // Catch: java.lang.Throwable -> L9
        L9:
            r0 = 0
            r5.f11843j = r0
            r1 = 0
            r5.f11834a = r1
            int r1 = r6.f12406c
            r2 = 1
            if (r1 < r2) goto L1d
            r5.o(r6)
            java.lang.String r6 = "红包播报放弃: speak 返回错误"
            r5.k(r6, r0)
            return
        L1d:
            java.lang.Object r0 = r5.f11840g
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            sa.b r3 = new sa.b
            java.lang.String r4 = r6.f12404a
            java.lang.String r6 = r6.f12405b
            int r1 = r1 + r2
            r3.<init>(r1, r4, r6)
            r0.offer(r3)
            java.lang.Object r6 = r5.f11839f
            android.os.Handler r6 = (android.os.Handler) r6
            a1.a r0 = new a1.a
            r1 = 27
            r0.<init>(r5, r1)
            r1 = 800(0x320, double:3.953E-321)
            r6.postDelayed(r0, r1)
            return
    }

    public boolean u(java.lang.Object r2, java.util.HashMap r3, java.lang.String r4) {
            r1 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r3)
            java.lang.String r3 = "requestTalker"
            r0.put(r3, r4)
            java.lang.Object r3 = r1.f11838e
            na.k r3 = (na.k) r3
            java.util.Map r3 = r3.f9187l
            r3.put(r2, r0)
            java.lang.Object r4 = r1.f11839f
            m8.c r4 = (m8.c) r4
            boolean r4 = r4.j(r2)
            if (r4 == 0) goto L1f
            r2 = 1
            return r2
        L1f:
            java.lang.String r4 = "  sendNetworkRequest 失败!"
            r1.j(r4)
            r3.remove(r2)
            r2 = 0
            return r2
    }

    public boolean v(sa.b r10) {
            r9 = this;
            java.lang.String r0 = "hchat_redpacket_"
            java.lang.String r1 = r10.f12405b
            java.lang.Object r2 = r9.f11843j
            android.speech.tts.TextToSpeech r2 = (android.speech.tts.TextToSpeech) r2
            r3 = 1
            if (r2 == 0) goto L74
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L12
            goto L74
        L12:
            r2 = 0
            android.os.Bundle r4 = new android.os.Bundle     // Catch: java.lang.Throwable -> L44
            r4.<init>()     // Catch: java.lang.Throwable -> L44
            java.lang.String r5 = "streamType"
            r6 = 3
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L44
            r4.putString(r5, r6)     // Catch: java.lang.Throwable -> L44
            java.lang.Object r5 = r9.f11843j     // Catch: java.lang.Throwable -> L44
            android.speech.tts.TextToSpeech r5 = (android.speech.tts.TextToSpeech) r5     // Catch: java.lang.Throwable -> L44
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L44
            long r7 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L44
            r6.append(r7)     // Catch: java.lang.Throwable -> L44
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L44
            int r0 = r5.speak(r1, r3, r4, r0)     // Catch: java.lang.Throwable -> L44
            r1 = -1
            if (r0 != r1) goto L46
            java.lang.String r10 = "红包播报失败"
            r0 = 0
            r9.k(r10, r0)     // Catch: java.lang.Throwable -> L44
            return r2
        L44:
            r10 = move-exception
            goto L5e
        L46:
            java.lang.String r10 = r10.f12404a     // Catch: java.lang.Throwable -> L44
            boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L4f
            return r3
        L4f:
            java.lang.Object r0 = r9.f11842i     // Catch: java.lang.Throwable -> L44
            java.util.Set r0 = (java.util.Set) r0     // Catch: java.lang.Throwable -> L44
            r0.add(r10)     // Catch: java.lang.Throwable -> L44
            java.lang.Object r0 = r9.f11841h     // Catch: java.lang.Throwable -> L44
            java.util.Set r0 = (java.util.Set) r0     // Catch: java.lang.Throwable -> L44
            r0.remove(r10)     // Catch: java.lang.Throwable -> L44
            return r3
        L5e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "红包播报失败: "
            r0.<init>(r1)
            java.lang.String r1 = r10.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.k(r0, r10)
            return r2
        L74:
            r9.o(r10)
            return r3
    }

    public void w(int r25, java.lang.String r26, java.lang.String r27, java.lang.String r28) {
            r24 = this;
            r1 = r24
            r0 = r26
            r2 = r27
            r3 = r28
            java.lang.String r4 = "channelid"
            java.lang.String r5 = "msgtype"
            java.lang.String r6 = "sendid"
            java.lang.Object r7 = r1.f11839f
            m8.c r7 = (m8.c) r7
            java.lang.Object r8 = r1.f11838e
            na.k r8 = (na.k) r8
            java.util.Set r9 = r8.f9190o
            java.lang.String r10 = "  构造请求: mt="
            java.lang.String r11 = "  sendid="
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "trySilentReceive 开始, mode="
            r12.<init>(r13)
            java.lang.Object r13 = r1.f11837d
            l3.l r13 = (l3.l) r13
            java.lang.String r14 = "hb_grab_mode"
            r15 = 1
            java.lang.Integer r20 = java.lang.Integer.valueOf(r15)
            r16 = r13
            android.content.SharedPreferences r13 = r16.b()     // Catch: java.lang.Throwable -> L39
            int r13 = r13.getInt(r14, r15)     // Catch: java.lang.Throwable -> L39
            goto L3a
        L39:
            r13 = r15
        L3a:
            r12.append(r13)
            java.lang.String r13 = " recvClass="
            r12.append(r13)
            java.lang.Object r13 = r1.f11836c
            h.Hchat.dexkit.DexFinder r13 = (h.Hchat.dexkit.DexFinder) r13
            java.lang.Class<?> r14 = r13.receiveLuckyMoneyClass
            r22 = 0
            if (r14 == 0) goto L4e
            r14 = r15
            goto L50
        L4e:
            r14 = r22
        L50:
            r12.append(r14)
            java.lang.String r14 = " openClass="
            r12.append(r14)
            java.lang.Class<?> r14 = r13.openLuckyMoneyClass
            if (r14 == 0) goto L5e
            r14 = r15
            goto L60
        L5e:
            r14 = r22
        L60:
            r12.append(r14)
            java.lang.String r14 = " dispatcher="
            r12.append(r14)
            java.lang.Object r14 = r7.f8780c
            if (r14 == 0) goto L6e
            r14 = r15
            goto L70
        L6e:
            r14 = r22
        L70:
            r12.append(r14)
            java.lang.String r14 = " method="
            r12.append(r14)
            java.lang.Object r7 = r7.f8781d
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            if (r7 == 0) goto L80
            r7 = r15
            goto L82
        L80:
            r7 = r22
        L82:
            r12.append(r7)
            java.lang.String r7 = r12.toString()
            r1.j(r7)
            boolean r7 = r16.f()
            if (r7 != 0) goto L98
            java.lang.String r0 = "  放弃: silentGrabEnabled=false"
            r1.j(r0)
            return
        L98:
            java.lang.Class<?> r7 = r13.receiveLuckyMoneyClass
            if (r7 != 0) goto La6
            java.lang.Class<?> r7 = r13.receiveLuckyMoneyUnionClass
            if (r7 != 0) goto La6
            java.lang.String r0 = "  放弃: receiveLuckyMoneyClass=null union=null"
            r1.j(r0)
            return
        La6:
            boolean r7 = android.text.TextUtils.isEmpty(r3)
            if (r7 == 0) goto Lb2
            java.lang.String r0 = "  放弃: nu=empty"
            r1.j(r0)
            return
        Lb2:
            java.lang.String r7 = oa.b.d(r3, r6)     // Catch: java.lang.Throwable -> Lf1
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf1
            r12.<init>(r11)     // Catch: java.lang.Throwable -> Lf1
            r12.append(r7)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r11 = r12.toString()     // Catch: java.lang.Throwable -> Lf1
            r1.j(r11)     // Catch: java.lang.Throwable -> Lf1
            boolean r11 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> Lf1
            if (r11 == 0) goto Lcd
            goto L24b
        Lcd:
            java.util.Set r11 = r8.f9192q     // Catch: java.lang.Throwable -> Lf1
            boolean r11 = r11.contains(r7)     // Catch: java.lang.Throwable -> Lf1
            if (r11 != 0) goto L28b
            boolean r11 = r9.contains(r7)     // Catch: java.lang.Throwable -> Lf1
            if (r11 != 0) goto L28b
            java.util.Set r11 = r8.f9191p     // Catch: java.lang.Throwable -> Lf1
            boolean r11 = r11.contains(r7)     // Catch: java.lang.Throwable -> Lf1
            if (r11 == 0) goto Le5
            goto L28b
        Le5:
            boolean r9 = r9.add(r7)     // Catch: java.lang.Throwable -> Lf1
            if (r9 != 0) goto Lf4
            java.lang.String r0 = "  放弃: sendid add竞争失败"
            r1.j(r0)     // Catch: java.lang.Throwable -> Lf1
            return
        Lf1:
            r0 = move-exception
            goto L291
        Lf4:
            java.util.concurrent.ConcurrentHashMap r9 = r8.f9188m     // Catch: java.lang.Throwable -> Lf1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r25)     // Catch: java.lang.Throwable -> Lf1
            r9.put(r7, r11)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r9 = oa.b.d(r3, r5)     // Catch: java.lang.Throwable -> Lf1
            boolean r11 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> Lf1
            if (r11 == 0) goto L109
        L107:
            r9 = r15
            goto L10d
        L109:
            int r9 = java.lang.Integer.parseInt(r9)     // Catch: java.lang.Throwable -> L107
        L10d:
            java.lang.String r11 = oa.b.d(r3, r4)     // Catch: java.lang.Throwable -> Lf1
            boolean r12 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> Lf1
            if (r12 == 0) goto L119
        L117:
            r11 = r15
            goto L11d
        L119:
            int r11 = java.lang.Integer.parseInt(r11)     // Catch: java.lang.Throwable -> L117
        L11d:
            java.lang.String r12 = "headimgurl"
            java.lang.String r12 = oa.b.e(r0, r12)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r14 = "sendertitle"
            java.lang.String r14 = oa.b.e(r0, r14)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r15 = r1.m(r3, r2)     // Catch: java.lang.Throwable -> Lf1
            int r0 = oa.b.c(r26, r27, r28)     // Catch: java.lang.Throwable -> Lf1
            r25 = r12
            r12 = 1005(0x3ed, float:1.408E-42)
            if (r0 != r12) goto L13d
            java.lang.Class<?> r0 = r13.receiveLuckyMoneyUnionClass     // Catch: java.lang.Throwable -> Lf1
            if (r0 == 0) goto L13d
            r0 = 1
            goto L13f
        L13d:
            r0 = r22
        L13f:
            java.util.HashMap r12 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lf1
            r12.<init>()     // Catch: java.lang.Throwable -> Lf1
            r12.put(r6, r7)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r6 = "content"
            java.lang.String r23 = ""
            r16 = r14
            if (r26 == 0) goto L152
            r14 = r26
            goto L154
        L152:
            r14 = r23
        L154:
            r12.put(r6, r14)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r6 = "nativeurl"
            r12.put(r6, r3)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r6 = "requestNativeUrl"
            r12.put(r6, r15)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r6 = "talker"
            r12.put(r6, r2)     // Catch: java.lang.Throwable -> Lf1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> Lf1
            r12.put(r5, r6)     // Catch: java.lang.Throwable -> Lf1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> Lf1
            r12.put(r4, r5)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r4 = "headimg"
            if (r25 == 0) goto L17b
            r5 = r25
            goto L17d
        L17b:
            r5 = r23
        L17d:
            r12.put(r4, r5)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r4 = "nickname"
            if (r16 == 0) goto L187
            r14 = r16
            goto L189
        L187:
            r14 = r23
        L189:
            r12.put(r4, r14)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r4 = "isUnion"
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> Lf1
            r12.put(r4, r5)     // Catch: java.lang.Throwable -> Lf1
            java.util.concurrent.ConcurrentHashMap r4 = r8.f9186k     // Catch: java.lang.Throwable -> Lf1
            r4.put(r7, r12)     // Catch: java.lang.Throwable -> Lf1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf1
            r4.<init>(r10)     // Catch: java.lang.Throwable -> Lf1
            r4.append(r9)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r5 = " ci="
            r4.append(r5)     // Catch: java.lang.Throwable -> Lf1
            r4.append(r11)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r5 = " union="
            r4.append(r5)     // Catch: java.lang.Throwable -> Lf1
            r4.append(r0)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r5 = " ctor="
            r4.append(r5)     // Catch: java.lang.Throwable -> Lf1
            java.lang.reflect.Constructor<?> r5 = r13.receiveCtor     // Catch: java.lang.Throwable -> Lf1
            if (r5 == 0) goto L1bd
            r5 = 1
            goto L1bf
        L1bd:
            r5 = r22
        L1bf:
            r4.append(r5)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lf1
            r1.j(r4)     // Catch: java.lang.Throwable -> Lf1
            if (r0 == 0) goto L1f4
            java.lang.Integer r16 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> Lf1
            java.lang.Integer r17 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r21 = "v1.0"
            r18 = r7
            r19 = r15
            java.lang.Object[] r3 = new java.lang.Object[]{r16, r17, r18, r19, r20, r21}     // Catch: java.lang.Throwable -> Lf1
            java.lang.Class<?> r4 = r13.receiveLuckyMoneyUnionClass     // Catch: java.lang.Throwable -> Lf1
            java.lang.reflect.Constructor<?> r5 = r13.unionReceiveCtor     // Catch: java.lang.Throwable -> Lf1
            java.lang.Object r3 = r1.l(r4, r5, r3)     // Catch: java.lang.Throwable -> Lf1
            if (r3 == 0) goto L1ef
            boolean r2 = r1.u(r3, r12, r2)     // Catch: java.lang.Throwable -> Lf1
            if (r2 == 0) goto L1ef
            r15 = 1
            goto L1f1
        L1ef:
            r15 = r22
        L1f1:
            r5 = r18
            goto L239
        L1f4:
            r18 = r7
            r19 = r15
            java.util.ArrayList r2 = r1.b(r2, r3)     // Catch: java.lang.Throwable -> Lf1
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Lf1
            r3 = r22
        L202:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> Lf1
            if (r4 == 0) goto L237
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> Lf1
            r22 = r4
            java.lang.String r22 = (java.lang.String) r22     // Catch: java.lang.Throwable -> Lf1
            java.lang.Integer r16 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> Lf1
            java.lang.Integer r17 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r21 = "v1.0"
            java.lang.Object[] r4 = new java.lang.Object[]{r16, r17, r18, r19, r20, r21, r22}     // Catch: java.lang.Throwable -> Lf1
            r5 = r18
            r6 = r22
            java.lang.Class<?> r7 = r13.receiveLuckyMoneyClass     // Catch: java.lang.Throwable -> Lf1
            java.lang.reflect.Constructor<?> r8 = r13.receiveCtor     // Catch: java.lang.Throwable -> Lf1
            java.lang.Object r4 = r1.l(r7, r8, r4)     // Catch: java.lang.Throwable -> Lf1
            if (r4 == 0) goto L234
            boolean r4 = r1.u(r4, r12, r6)     // Catch: java.lang.Throwable -> Lf1
            if (r4 == 0) goto L234
            int r3 = r3 + 1
        L234:
            r18 = r5
            goto L202
        L237:
            r15 = r3
            goto L1f1
        L239:
            if (r15 > 0) goto L24c
            java.lang.String r0 = "无法创建或发送请求对象"
            boolean r0 = r1.r(r5, r0)     // Catch: java.lang.Throwable -> Lf1
            if (r0 != 0) goto L24b
            r1.d(r5)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r0 = "  放弃: 无法创建或发送请求对象"
            r1.j(r0)     // Catch: java.lang.Throwable -> Lf1
        L24b:
            return
        L24c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf1
            r2.<init>()     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r3 = "静默收包: "
            r2.append(r3)     // Catch: java.lang.Throwable -> Lf1
            r2.append(r5)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r3 = " count="
            r2.append(r3)     // Catch: java.lang.Throwable -> Lf1
            r2.append(r15)     // Catch: java.lang.Throwable -> Lf1
            if (r0 == 0) goto L265
            java.lang.String r23 = " [Union]"
        L265:
            r0 = r23
            r2.append(r0)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> Lf1
            r1.j(r0)     // Catch: java.lang.Throwable -> Lf1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r2 = "redpacket_receive_timeout:"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf1
            r0.append(r5)     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lf1
            ra.a r2 = new ra.a     // Catch: java.lang.Throwable -> Lf1
            r3 = 1
            r2.<init>(r1, r5, r3)     // Catch: java.lang.Throwable -> Lf1
            r3 = 4500(0x1194, double:2.2233E-320)
            t(r0, r3, r2)     // Catch: java.lang.Throwable -> Lf1
            return
        L28b:
            java.lang.String r0 = "  放弃: sendid 已处理中"
            r1.j(r0)     // Catch: java.lang.Throwable -> Lf1
            return
        L291:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "ERROR trySilentReceive: "
            r2.<init>(r3)
            java.lang.String r3 = r0.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.j(r2)
            r0.printStackTrace()
            return
    }
}
