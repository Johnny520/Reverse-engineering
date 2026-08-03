package x9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicInteger f21409a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final android.os.Handler f21410b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ExecutorService f21411c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f21412d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile java.lang.String f21413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile long f21414f;

    static {
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = 0
            r0.<init>(r1)
            x9.d.f21409a = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            x9.d.f21410b = r0
            c9.q r0 = new c9.q
            r1 = 29
            r0.<init>(r1)
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor(r0)
            x9.d.f21411c = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            x9.d.f21412d = r0
            return
    }

    public static java.lang.String a(java.lang.String r3) {
            boolean r0 = og.m.t0(r3)
            if (r0 == 0) goto L9
            java.lang.String r3 = ""
            return r3
        L9:
            java.lang.String r0 = "(?is)<appmsg\\b[^>]*>(.*?)</appmsg>"
            r1 = 1
            java.lang.String r0 = l(r1, r3, r0)
            java.lang.String r1 = "type"
            java.lang.String r0 = n(r0, r1)
            java.lang.String r0 = m(r0)
            boolean r2 = og.m.t0(r0)
            if (r2 == 0) goto L29
            java.lang.String r3 = n(r3, r1)
            java.lang.String r3 = m(r3)
            return r3
        L29:
            return r0
    }

    public static java.lang.String b(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            java.lang.String r0 = "%keyword%"
            r1 = 0
            java.lang.String r2 = og.t.a0(r2, r0, r3, r1)
            java.lang.String r3 = "%sender%"
            java.lang.String r2 = og.t.a0(r2, r3, r4, r1)
            java.lang.String r3 = "%wxid%"
            java.lang.String r2 = og.t.a0(r2, r3, r5, r1)
            java.lang.String r3 = "%content%"
            java.lang.String r2 = og.t.a0(r2, r3, r6, r1)
            java.lang.String r3 = "%type%"
            java.lang.String r2 = og.t.a0(r2, r3, r7, r1)
            return r2
    }

    public static void c(android.content.Context r7, k8.o r8) {
            x9.e r2 = new x9.e
            r2.<init>(r7)
            java.lang.String r0 = "keyword_notify_enable"
            r1 = 0
            boolean r0 = r2.a(r0, r1)
            if (r0 != 0) goto L10
            goto L94
        L10:
            boolean r0 = r8.q()
            if (r0 == 0) goto L18
            goto L94
        L18:
            java.lang.String r0 = r8.f7446c
            boolean r3 = og.m.t0(r0)
            if (r3 == 0) goto L24
            java.lang.String r0 = r8.d()
        L24:
            r4 = r0
            r4.getClass()
            boolean r0 = og.m.t0(r4)
            if (r0 != 0) goto L94
            boolean r0 = r2.e(r4)
            if (r0 != 0) goto L35
            goto L94
        L35:
            java.lang.String r0 = "keyword_notify_quiet"
            boolean r0 = r2.a(r0, r1)
            if (r0 != 0) goto L3e
            goto L86
        L3e:
            java.lang.String r0 = "keyword_notify_quiet_start"
            java.lang.String r1 = "22:00:00"
            java.lang.String r0 = r2.b(r0, r1)
            int r0 = k(r0)
            java.lang.String r1 = "keyword_notify_quiet_end"
            java.lang.String r3 = "08:00:00"
            java.lang.String r1 = r2.b(r1, r3)
            int r1 = k(r1)
            if (r0 < 0) goto L86
            if (r1 >= 0) goto L5b
            goto L86
        L5b:
            if (r0 != r1) goto L5e
            goto L94
        L5e:
            java.util.Calendar r3 = java.util.Calendar.getInstance()
            r5 = 11
            int r5 = r3.get(r5)
            int r5 = r5 * 3600
            r6 = 12
            int r6 = r3.get(r6)
            int r6 = r6 * 60
            int r6 = r6 + r5
            r5 = 13
            int r3 = r3.get(r5)
            int r3 = r3 + r6
            if (r0 >= r1) goto L81
            if (r0 > r3) goto L86
            if (r3 >= r1) goto L86
            goto L94
        L81:
            if (r3 >= r0) goto L94
            if (r3 >= r1) goto L86
            goto L94
        L86:
            b9.c r0 = new b9.c
            r5 = 25
            r1 = r7
            r3 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.ExecutorService r7 = x9.d.f21411c
            r7.execute(r0)
        L94:
            return
    }

    public static void d(android.content.Context r20, x9.e r21, k8.o r22, java.lang.String r23) {
            r2 = r21
            r0 = r22
            r4 = r23
            boolean r1 = r0.f7451h
            java.lang.String r3 = r0.f7448e
            java.lang.String r5 = "@im.chatroom"
            java.lang.String r6 = "@chatroom"
            r7 = 0
            r9 = 1
            if (r1 != 0) goto L27
            boolean r1 = r0.j()
            if (r1 != 0) goto L27
            boolean r1 = og.t.W(r4, r6, r7)
            if (r1 != 0) goto L27
            boolean r1 = og.t.W(r4, r5, r7)
            if (r1 == 0) goto L25
            goto L27
        L25:
            r8 = r7
            goto L28
        L27:
            r8 = r9
        L28:
            boolean r1 = og.m.t0(r3)
            if (r1 == 0) goto L33
            java.lang.String r1 = r0.a()
            goto L34
        L33:
            r1 = r3
        L34:
            r1.getClass()
            java.lang.String r14 = j(r0, r1)
            boolean r10 = og.m.t0(r14)
            if (r10 == 0) goto L43
            goto L274
        L43:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.String r1 = g(r2, r0, r8, r1, r14)
            if (r1 == 0) goto L51
            r10.add(r1)
        L51:
            java.lang.String r1 = "@所有人"
            java.lang.String r11 = "keyword_notify_at_all"
            if (r8 == 0) goto L66
            boolean r12 = r2.a(r11, r9)
            if (r12 == 0) goto L66
            boolean r12 = r0.n()
            if (r12 == 0) goto L66
            r10.add(r1)
        L66:
            java.lang.String r12 = "群公告"
            if (r8 == 0) goto L79
            boolean r11 = r2.a(r11, r9)
            if (r11 == 0) goto L79
            boolean r11 = r0.e()
            if (r11 == 0) goto L79
            r10.add(r12)
        L79:
            java.lang.String r11 = "@我"
            if (r8 == 0) goto L8e
            java.lang.String r13 = "keyword_notify_at_me"
            boolean r13 = r2.a(r13, r9)
            if (r13 == 0) goto L8e
            boolean r13 = r0.g()
            if (r13 == 0) goto L8e
            r10.add(r11)
        L8e:
            boolean r13 = r10.isEmpty()
            if (r13 == 0) goto L96
            goto L274
        L96:
            java.lang.String r13 = r0.f7447d
            boolean r15 = og.m.t0(r13)
            if (r15 == 0) goto La2
            java.lang.String r13 = r0.c()
        La2:
            java.lang.String r0 = ""
            r15 = 0
            if (r8 != 0) goto Laf
            boolean r3 = og.m.t0(r13)
            if (r3 == 0) goto Lfe
        Lad:
            r13 = r4
            goto Lfe
        Laf:
            r13.getClass()
            boolean r16 = og.m.t0(r13)
            if (r16 != 0) goto Lc5
            boolean r6 = og.t.W(r13, r6, r7)
            if (r6 != 0) goto Lc5
            boolean r5 = og.t.W(r13, r5, r7)
            if (r5 != 0) goto Lc5
            goto Lfe
        Lc5:
            java.lang.String r5 = "^([A-Za-z0-9_\\-]+?):\\n"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            r5.getClass()
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            r3.getClass()
            java.util.regex.Matcher r5 = r5.matcher(r3)
            r5.getClass()
            og.i r3 = a7.a.b(r5, r7, r3)
            if (r3 == 0) goto Lf1
            java.util.List r3 = r3.a()
            java.lang.Object r3 = tf.m.w1(r9, r3)
            java.lang.String r3 = (java.lang.String) r3
            goto Lf2
        Lf1:
            r3 = r15
        Lf2:
            if (r3 != 0) goto Lf6
            r13 = r0
            goto Lf7
        Lf6:
            r13 = r3
        Lf7:
            boolean r3 = og.m.t0(r13)
            if (r3 == 0) goto Lfe
            goto Lad
        Lfe:
            g8.i r3 = wb.en.c()
            if (r8 == 0) goto L148
            java.lang.String r5 = g4.a.k(r4)
            boolean r6 = og.m.t0(r5)
            if (r6 == 0) goto L10f
            r5 = r4
        L10f:
            boolean r6 = og.m.t0(r13)
            if (r6 != 0) goto L13f
            boolean r6 = r13.equals(r4)
            if (r6 != 0) goto L13f
            if (r3 == 0) goto L122
            java.lang.String r6 = r3.t(r4, r13)
            goto L123
        L122:
            r6 = r15
        L123:
            if (r6 != 0) goto L126
            r6 = r0
        L126:
            boolean r7 = og.m.t0(r6)
            if (r7 == 0) goto L137
            if (r3 == 0) goto L132
            java.lang.String r15 = r3.r(r13)
        L132:
            if (r15 != 0) goto L136
            r6 = r0
            goto L137
        L136:
            r6 = r15
        L137:
            boolean r3 = og.m.t0(r6)
            if (r3 == 0) goto L141
            r6 = r13
            goto L141
        L13f:
            java.lang.String r6 = "未知成员"
        L141:
            java.lang.String r3 = " | "
            java.lang.String r3 = wb.en.h(r5, r3, r6)
            goto L16e
        L148:
            java.lang.String r3 = g4.a.k(r4)
            boolean r5 = og.m.t0(r3)
            if (r5 == 0) goto L156
            java.lang.String r3 = g4.a.k(r13)
        L156:
            boolean r5 = og.m.t0(r3)
            if (r5 == 0) goto L16e
            boolean r3 = og.m.t0(r13)
            if (r3 == 0) goto L16d
            boolean r3 = og.m.t0(r4)
            if (r3 == 0) goto L16b
            java.lang.String r3 = "未知来源"
            goto L16e
        L16b:
            r3 = r4
            goto L16e
        L16d:
            r3 = r13
        L16e:
            if (r8 == 0) goto L17e
            boolean r5 = og.m.t0(r13)
            if (r5 != 0) goto L17e
            java.lang.String r5 = "|"
            java.lang.String r5 = wb.en.h(r4, r5, r13)
            r13 = r5
            goto L185
        L17e:
            boolean r5 = og.m.t0(r13)
            if (r5 == 0) goto L185
            r13 = r4
        L185:
            java.util.Set r5 = tf.m.T1(r10)
            java.util.List r5 = tf.m.P1(r5)
            java.util.Iterator r16 = r5.iterator()
        L191:
            boolean r5 = r16.hasNext()
            if (r5 == 0) goto L274
            java.lang.Object r5 = r16.next()
            r7 = r5
            java.lang.String r7 = (java.lang.String) r7
            if (r8 == 0) goto L1a4
            java.lang.String r5 = "群消息"
        L1a2:
            r15 = r5
            goto L1a7
        L1a4:
            java.lang.String r5 = "好友"
            goto L1a2
        L1a7:
            int r5 = r7.hashCode()
            r6 = 27089(0x69d1, float:3.796E-41)
            if (r5 == r6) goto L1cb
            r6 = 26915537(0x19ab2d1, float:5.6827255E-38)
            if (r5 == r6) goto L1c1
            r6 = 32069378(0x1e95702, float:8.571553E-38)
            if (r5 == r6) goto L1ba
            goto L1d1
        L1ba:
            boolean r5 = r7.equals(r12)
            if (r5 != 0) goto L1c8
            goto L1d1
        L1c1:
            boolean r5 = r7.equals(r1)
            if (r5 != 0) goto L1c8
            goto L1d1
        L1c8:
            x9.c r5 = x9.c.f21399q
            goto L1d6
        L1cb:
            boolean r5 = r7.equals(r11)
            if (r5 != 0) goto L1d4
        L1d1:
            x9.c r5 = x9.c.f21397o
            goto L1d6
        L1d4:
            x9.c r5 = x9.c.f21398p
        L1d6:
            java.lang.String r6 = r5.f21401g
            java.lang.String r6 = r2.b(r6, r0)
            boolean r10 = og.m.t0(r6)
            if (r10 == 0) goto L1e4
            java.lang.String r6 = r5.f21407m
        L1e4:
            r10 = r6
            r17 = r11
            r18 = r12
            r12 = r3
            r11 = r7
            java.lang.String r3 = b(r10, r11, r12, r13, r14, r15)
            java.lang.String r6 = r5.f21402h
            java.lang.String r6 = r2.b(r6, r0)
            boolean r7 = og.m.t0(r6)
            if (r7 == 0) goto L1fd
            java.lang.String r6 = "%content%"
        L1fd:
            r10 = r6
            java.lang.String r6 = b(r10, r11, r12, r13, r14, r15)
            java.lang.String r7 = r5.f21403i
            java.lang.String r7 = r2.b(r7, r0)
            boolean r10 = og.m.t0(r7)
            if (r10 == 0) goto L210
            java.lang.String r7 = r5.f21408n
        L210:
            r10 = r7
            java.lang.String r10 = b(r10, r11, r12, r13, r14, r15)
            java.lang.String r7 = "keyword_notify_system"
            boolean r7 = r2.a(r7, r9)
            android.os.Handler r15 = x9.d.f21410b
            if (r7 == 0) goto L234
            r7 = r0
            x9.a r0 = new x9.a
            r19 = r5
            r5 = r3
            r3 = r19
            r19 = r7
            r7 = r11
            r11 = r1
            r1 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r15.post(r0)
            goto L23a
        L234:
            r19 = r0
            r7 = r11
            r11 = r1
            r1 = r20
        L23a:
            java.lang.String r0 = "keyword_notify_toast"
            boolean r0 = r2.a(r0, r9)
            if (r0 == 0) goto L24b
            eb.w r0 = new eb.w
            r3 = 7
            r0.<init>(r1, r10, r3)
            r15.post(r0)
        L24b:
            java.lang.String r0 = "Hchat_keyword_notification_config"
            android.content.SharedPreferences r0 = ub.b.c(r1, r0)     // Catch: java.lang.Throwable -> L268
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L268
            java.lang.String r3 = "keyword_notify_last_time"
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L268
            android.content.SharedPreferences$Editor r0 = r0.putLong(r3, r4)     // Catch: java.lang.Throwable -> L268
            java.lang.String r3 = "keyword_notify_last_keyword"
            android.content.SharedPreferences$Editor r0 = r0.putString(r3, r7)     // Catch: java.lang.Throwable -> L268
            r0.apply()     // Catch: java.lang.Throwable -> L268
        L268:
            r4 = r23
            r1 = r11
            r3 = r12
            r11 = r17
            r12 = r18
            r0 = r19
            goto L191
        L274:
            return
    }

    public static java.lang.CharSequence e(java.lang.String r6, java.lang.String r7) {
            boolean r0 = og.m.t0(r6)
            if (r0 != 0) goto L45
            boolean r0 = og.m.t0(r7)
            if (r0 == 0) goto Ld
            goto L45
        Ld:
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder     // Catch: java.lang.Throwable -> L37
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L37
            r1 = 0
            r2 = r1
        L14:
            r3 = 4
            int r2 = og.m.r0(r6, r7, r2, r1, r3)     // Catch: java.lang.Throwable -> L37
            if (r2 >= 0) goto L1c
            goto L3d
        L1c:
            android.text.style.ForegroundColorSpan r3 = new android.text.style.ForegroundColorSpan     // Catch: java.lang.Throwable -> L37
            java.lang.String r4 = "#FF9800"
            int r4 = android.graphics.Color.parseColor(r4)     // Catch: java.lang.Throwable -> L37
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L37
            int r4 = r7.length()     // Catch: java.lang.Throwable -> L37
            int r4 = r4 + r2
            r5 = 33
            r0.setSpan(r3, r2, r4, r5)     // Catch: java.lang.Throwable -> L37
            int r3 = r7.length()     // Catch: java.lang.Throwable -> L37
            int r2 = r2 + r3
            goto L14
        L37:
            r7 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r7)
        L3d:
            boolean r7 = r0 instanceof sf.f
            if (r7 == 0) goto L42
            goto L43
        L42:
            r6 = r0
        L43:
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
        L45:
            return r6
    }

    public static boolean f(java.lang.String r9) {
            boolean r0 = og.m.t0(r9)
            r1 = 0
            if (r0 == 0) goto L8
            goto L62
        L8:
            java.lang.CharSequence r9 = og.m.R0(r9)
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = "<?xml"
            boolean r0 = og.t.d0(r9, r0, r1)
            if (r0 != 0) goto L62
            java.lang.String r0 = "<"
            boolean r0 = og.t.d0(r9, r0, r1)
            if (r0 != 0) goto L62
            java.lang.String r0 = "<msg"
            boolean r0 = og.m.h0(r9, r0, r1)
            if (r0 != 0) goto L62
            java.lang.String r0 = "<appmsg"
            boolean r0 = og.m.h0(r9, r0, r1)
            if (r0 == 0) goto L31
            goto L62
        L31:
            java.lang.String r7 = "[文件]"
            java.lang.String r8 = "[链接]"
            java.lang.String r2 = "[动画表情]"
            java.lang.String r3 = "[表情]"
            java.lang.String r4 = "[图片]"
            java.lang.String r5 = "[语音]"
            java.lang.String r6 = "[视频]"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8}
            java.util.Set r0 = tf.d0.W(r0)
            boolean r0 = r0.contains(r9)
            if (r0 == 0) goto L4e
            goto L62
        L4e:
            java.lang.String r0 = "^(\\[[^\\[\\]\\s]{1,20}\\])+$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r0.getClass()
            java.util.regex.Matcher r9 = r0.matcher(r9)
            boolean r9 = r9.matches()
            r9 = r9 ^ 1
            return r9
        L62:
            return r1
    }

    public static java.lang.String g(x9.e r3, k8.o r4, boolean r5, java.lang.String r6, java.lang.String r7) {
            h.Hchat.hooks.api.model.WeChatMessage r0 = r4.f7454k
            r1 = 0
            if (r5 == 0) goto Lc
            java.lang.String r5 = "keyword_notify_any_group"
            boolean r5 = r3.a(r5, r1)
            goto L12
        Lc:
            java.lang.String r5 = "keyword_notify_any_private"
            boolean r5 = r3.a(r5, r1)
        L12:
            if (r5 == 0) goto Lc1
            boolean r5 = r4.h()
            if (r5 == 0) goto L1d
        L1a:
            r2 = r1
            goto Lbc
        L1d:
            boolean r5 = r4.k()
            r2 = 1
            if (r5 != 0) goto L7a
            boolean r5 = r4.u()
            if (r5 != 0) goto L7a
            boolean r5 = r4.t()
            if (r5 != 0) goto L7a
            boolean r5 = r4.f()
            if (r5 != 0) goto L7a
            boolean r5 = r4.i()
            if (r5 != 0) goto L7a
            boolean r5 = r4.l()
            if (r5 != 0) goto L7a
            boolean r5 = r4.m()
            if (r5 != 0) goto L7a
            boolean r5 = r4.r()
            if (r5 != 0) goto L7a
            boolean r5 = r4.o()
            if (r5 != 0) goto L7a
            boolean r5 = r4.s()
            if (r5 != 0) goto L7a
            boolean r5 = r4.v()
            if (r5 != 0) goto L7a
            if (r0 == 0) goto L6a
            boolean r5 = r0.isVoipVoice()
            if (r5 == 0) goto L6a
            r5 = r2
            goto L6b
        L6a:
            r5 = r1
        L6b:
            if (r5 != 0) goto L7a
            if (r0 == 0) goto L77
            boolean r5 = r0.isVoipVideo()
            if (r5 == 0) goto L77
            r5 = r2
            goto L78
        L77:
            r5 = r1
        L78:
            if (r5 == 0) goto L81
        L7a:
            boolean r5 = r4.p()
            if (r5 != 0) goto L81
            goto L1a
        L81:
            boolean r5 = r4.p()
            if (r5 == 0) goto L88
            goto Lbc
        L88:
            java.lang.CharSequence r5 = og.m.R0(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "text"
            java.lang.String r4 = r4.f7445b
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto La1
            boolean r4 = f(r5)
            if (r4 == 0) goto La1
            goto Lbc
        La1:
            if (r0 == 0) goto La8
            int r4 = r0.getType()
            goto La9
        La8:
            r4 = r1
        La9:
            if (r4 != r2) goto Lb2
            boolean r4 = f(r5)
            if (r4 == 0) goto Lb2
            goto Lbc
        Lb2:
            java.lang.String r4 = a(r5)
            java.lang.String r5 = "57"
            boolean r2 = gg.l.a(r4, r5)
        Lbc:
            if (r2 == 0) goto Lc1
            java.lang.String r3 = "任意关键词"
            return r3
        Lc1:
            java.util.List r3 = r3.c()
            java.lang.String r4 = "\\b"
            java.util.Iterator r3 = r3.iterator()
        Lcb:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L12e
            java.lang.Object r5 = r3.next()
            x9.f r5 = (x9.f) r5
            java.lang.String r6 = r5.f21416a
            boolean r0 = og.m.t0(r6)
            if (r0 == 0) goto Le0
            goto Lcb
        Le0:
            boolean r5 = r5.f21417b
            if (r5 == 0) goto L127
            java.lang.String r5 = java.util.regex.Pattern.quote(r6)     // Catch: java.lang.Throwable -> L10c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10c
            r0.<init>()     // Catch: java.lang.Throwable -> L10c
            r0.append(r4)     // Catch: java.lang.Throwable -> L10c
            r0.append(r5)     // Catch: java.lang.Throwable -> L10c
            r0.append(r4)     // Catch: java.lang.Throwable -> L10c
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Throwable -> L10c
            r0 = 2
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5, r0)     // Catch: java.lang.Throwable -> L10c
            java.util.regex.Matcher r5 = r5.matcher(r7)     // Catch: java.lang.Throwable -> L10c
            boolean r5 = r5.find()     // Catch: java.lang.Throwable -> L10c
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L10c
            goto L113
        L10c:
            r5 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r5)
            r5 = r0
        L113:
            boolean r0 = og.m.h0(r7, r6, r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r2 = r5 instanceof sf.f
            if (r2 == 0) goto L120
            r5 = r0
        L120:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            goto L12b
        L127:
            boolean r5 = og.m.h0(r7, r6, r1)
        L12b:
            if (r5 == 0) goto Lcb
            goto L12f
        L12e:
            r6 = 0
        L12f:
            return r6
    }

    public static java.lang.String h(h.Hchat.hooks.api.model.WeChatMessage r1) {
            boolean r0 = r1.isQuote()
            if (r0 == 0) goto L9
            java.lang.String r1 = "quote"
            return r1
        L9:
            boolean r0 = r1.isImage()
            if (r0 == 0) goto L12
            java.lang.String r1 = "image"
            return r1
        L12:
            boolean r0 = r1.isVoice()
            if (r0 == 0) goto L1b
            java.lang.String r1 = "voice"
            return r1
        L1b:
            boolean r0 = r1.isVideo()
            if (r0 == 0) goto L24
            java.lang.String r1 = "video"
            return r1
        L24:
            boolean r0 = r1.isEmoji()
            if (r0 == 0) goto L2d
            java.lang.String r1 = "emoji"
            return r1
        L2d:
            boolean r0 = r1.isFile()
            if (r0 == 0) goto L36
            java.lang.String r1 = "file"
            return r1
        L36:
            boolean r0 = r1.isLink()
            if (r0 == 0) goto L3f
            java.lang.String r1 = "link"
            return r1
        L3f:
            boolean r0 = r1.isPat()
            if (r0 == 0) goto L48
            java.lang.String r1 = "pat"
            return r1
        L48:
            boolean r0 = r1.isSystem()
            if (r0 == 0) goto L51
            java.lang.String r1 = "system"
            return r1
        L51:
            boolean r0 = r1.isVoip()
            if (r0 == 0) goto L5a
            java.lang.String r1 = "voip"
            return r1
        L5a:
            int r1 = r1.type
            r0 = 1
            if (r1 != r0) goto L62
            java.lang.String r1 = "text"
            return r1
        L62:
            r0 = 49
            if (r1 != r0) goto L69
            java.lang.String r1 = "app"
            return r1
        L69:
            java.lang.String r1 = "unknown"
            return r1
    }

    public static java.lang.String i(java.lang.String r10, boolean r11) {
            java.lang.String r0 = x9.d.f21413e
            r1 = 0
            if (r0 == 0) goto L7
            goto L75
        L7:
            h.Hchat.hooks.api.runtime.WeChatDatabaseApi r0 = h.Hchat.hooks.api.core.WeChatApis.database()
            if (r0 == 0) goto L70
            java.lang.String r2 = "PRAGMA database_list"
            java.util.List r0 = r0.query(r2, r1)     // Catch: java.lang.Throwable -> L14
            goto L1b
        L14:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L1b:
            tf.t r2 = tf.t.f13167g
            boolean r3 = r0 instanceof sf.f
            if (r3 == 0) goto L22
            r0 = r2
        L22:
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
        L28:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L70
            java.lang.Object r2 = r0.next()
            java.util.Map r2 = (java.util.Map) r2
            java.lang.String r3 = "file"
            java.lang.Object r2 = r2.get(r3)
            if (r2 == 0) goto L41
            java.lang.String r2 = r2.toString()
            goto L42
        L41:
            r2 = r1
        L42:
            if (r2 != 0) goto L46
            java.lang.String r2 = ""
        L46:
            boolean r3 = og.m.t0(r2)
            if (r3 == 0) goto L4d
            goto L28
        L4d:
            java.io.File r3 = new java.io.File
            r3.<init>(r2)
            java.io.File r2 = r3.getParentFile()
            if (r2 == 0) goto L28
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "avatar"
            r3.<init>(r2, r4)
            boolean r4 = r3.isDirectory()
            if (r4 != 0) goto L6b
            boolean r2 = r2.isDirectory()
            if (r2 == 0) goto L28
        L6b:
            java.lang.String r0 = r3.getAbsolutePath()
            goto L71
        L70:
            r0 = r1
        L71:
            x9.d.f21413e = r0
            if (r0 == 0) goto L119
        L75:
            r2 = 0
            r3 = 2
            java.lang.String r4 = "MD5"
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r4)     // Catch: java.lang.Throwable -> L9a
            java.nio.charset.Charset r5 = og.a.f9804a     // Catch: java.lang.Throwable -> L9a
            byte[] r10 = r10.getBytes(r5)     // Catch: java.lang.Throwable -> L9a
            r10.getClass()     // Catch: java.lang.Throwable -> L9a
            byte[] r10 = r4.digest(r10)     // Catch: java.lang.Throwable -> L9a
            int r4 = r10.length     // Catch: java.lang.Throwable -> L9a
            int r4 = r4 * r3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9a
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L9a
            int r4 = r10.length     // Catch: java.lang.Throwable -> L9a
            r6 = r2
        L93:
            if (r6 < r4) goto L9c
            java.lang.String r10 = r5.toString()     // Catch: java.lang.Throwable -> L9a
            goto Lc9
        L9a:
            r10 = move-exception
            goto Lc3
        L9c:
            r7 = r10[r6]     // Catch: java.lang.Throwable -> L9a
            int r8 = r7 >>> 4
            r8 = r8 & 15
            r9 = 16
            a.a.w(r9)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r8 = java.lang.Integer.toString(r8, r9)     // Catch: java.lang.Throwable -> L9a
            r8.getClass()     // Catch: java.lang.Throwable -> L9a
            r5.append(r8)     // Catch: java.lang.Throwable -> L9a
            r7 = r7 & 15
            a.a.w(r9)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r7 = java.lang.Integer.toString(r7, r9)     // Catch: java.lang.Throwable -> L9a
            r7.getClass()     // Catch: java.lang.Throwable -> L9a
            r5.append(r7)     // Catch: java.lang.Throwable -> L9a
            int r6 = r6 + 1
            goto L93
        Lc3:
            sf.f r4 = new sf.f
            r4.<init>(r10)
            r10 = r4
        Lc9:
            boolean r4 = r10 instanceof sf.f
            if (r4 == 0) goto Lcf
            r10 = r1
        Lcf:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L119
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 1
            char[] r5 = new char[r5]
            r6 = 47
            r5[r2] = r6
            java.lang.String r0 = og.m.U0(r0, r5)
            r4.append(r0)
            r4.append(r6)
            java.lang.String r0 = r10.substring(r2, r3)
            r4.append(r0)
            r4.append(r6)
            r0 = 4
            java.lang.String r0 = r10.substring(r3, r0)
            r4.append(r0)
            java.lang.String r0 = "/user_"
            r4.append(r0)
            if (r11 == 0) goto L107
            java.lang.String r11 = "hd_"
            r4.append(r11)
        L107:
            java.lang.String r11 = ".png"
            java.lang.String r10 = eh.a.r(r4, r10, r11)
            java.io.File r11 = new java.io.File
            r11.<init>(r10)
            boolean r11 = r11.exists()
            if (r11 == 0) goto L119
            r1 = r10
        L119:
            return r1
    }

    public static java.lang.String j(k8.o r5, java.lang.String r6) {
            h.Hchat.hooks.api.model.WeChatMessage r0 = r5.f7454k
            boolean r5 = r5.k()
            if (r5 == 0) goto Lb
            java.lang.String r5 = "[图片]"
            return r5
        Lb:
            r5 = 0
            if (r0 == 0) goto L13
            h.Hchat.hooks.api.model.WeChatQuoteMsg r1 = r0.getQuoteMsg()
            goto L14
        L13:
            r1 = r5
        L14:
            java.lang.String r2 = " | 引用: "
            java.lang.String r3 = ""
            if (r1 == 0) goto L45
            java.lang.String r5 = r1.title
            java.lang.String r5 = m(r5)
            java.lang.String r6 = r1.content
            java.lang.String r6 = m(r6)
            boolean r0 = og.m.t0(r5)
            if (r0 != 0) goto L37
            boolean r0 = og.m.t0(r6)
            if (r0 != 0) goto L37
            java.lang.String r5 = wb.en.h(r5, r2, r6)
            return r5
        L37:
            boolean r0 = og.m.t0(r5)
            if (r0 != 0) goto L3e
            return r5
        L3e:
            boolean r5 = og.m.t0(r6)
            if (r5 != 0) goto Le2
            return r6
        L45:
            if (r0 == 0) goto L4b
            java.lang.String r5 = r0.bodyContent()
        L4b:
            if (r5 != 0) goto L4e
            r5 = r3
        L4e:
            boolean r0 = og.m.t0(r5)
            if (r0 == 0) goto L55
            goto L56
        L55:
            r6 = r5
        L56:
            java.lang.CharSequence r5 = og.m.R0(r6)
            java.lang.String r5 = r5.toString()
            boolean r6 = og.m.t0(r5)
            if (r6 == 0) goto L66
            goto Le2
        L66:
            java.lang.String r6 = "<?xml"
            r0 = 0
            boolean r6 = og.t.d0(r5, r6, r0)
            r0 = 1
            if (r6 != 0) goto L9d
            java.lang.String r6 = "<msg"
            boolean r6 = og.m.h0(r5, r6, r0)
            if (r6 != 0) goto L9d
            java.lang.String r6 = "<appmsg"
            boolean r6 = og.m.h0(r5, r6, r0)
            if (r6 != 0) goto L9d
            java.lang.String r6 = "^[A-Za-z0-9_\\-]+:\\n"
            java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r6)
            r6.getClass()
            java.util.regex.Matcher r5 = r6.matcher(r5)
            java.lang.String r5 = r5.replaceAll(r3)
            r5.getClass()
            java.lang.CharSequence r5 = og.m.R0(r5)
            java.lang.String r5 = r5.toString()
            return r5
        L9d:
            java.lang.String r6 = a(r5)
            java.lang.String r1 = "57"
            boolean r6 = gg.l.a(r6, r1)
            java.lang.String r1 = "content"
            java.lang.String r4 = "title"
            if (r6 == 0) goto Le3
            java.lang.String r6 = n(r5, r4)
            java.lang.String r6 = m(r6)
            java.lang.String r4 = "(?is)<refermsg>(.*?)</refermsg>"
            java.lang.String r5 = l(r0, r5, r4)
            java.lang.String r5 = n(r5, r1)
            java.lang.String r5 = m(r5)
            boolean r0 = og.m.t0(r6)
            if (r0 != 0) goto Ld4
            boolean r0 = og.m.t0(r5)
            if (r0 != 0) goto Ld4
            java.lang.String r5 = wb.en.h(r6, r2, r5)
            return r5
        Ld4:
            boolean r0 = og.m.t0(r6)
            if (r0 != 0) goto Ldb
            return r6
        Ldb:
            boolean r6 = og.m.t0(r5)
            if (r6 != 0) goto Le2
            return r5
        Le2:
            return r3
        Le3:
            java.lang.String r6 = n(r5, r4)
            java.lang.String r6 = m(r6)
            boolean r0 = og.m.t0(r6)
            if (r0 == 0) goto Lfa
            java.lang.String r5 = n(r5, r1)
            java.lang.String r5 = m(r5)
            return r5
        Lfa:
            return r6
    }

    public static int k(java.lang.String r5) {
            java.lang.CharSequence r5 = og.m.R0(r5)
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = ":"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r5 = og.m.G0(r5, r0)
            int r0 = r5.size()
            r1 = 2
            if (r1 > r0) goto L6f
            r2 = 4
            if (r0 >= r2) goto L6f
            r0 = 0
            java.lang.Object r2 = tf.m.w1(r0, r5)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L6f
            r3 = 10
            java.lang.Integer r2 = og.t.e0(r3, r2)
            if (r2 == 0) goto L6f
            int r2 = r2.intValue()
            r4 = 1
            java.lang.Object r4 = tf.m.w1(r4, r5)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L45
            java.lang.Integer r4 = og.t.e0(r3, r4)
            if (r4 == 0) goto L45
            int r4 = r4.intValue()
            goto L46
        L45:
            r4 = r0
        L46:
            java.lang.Object r5 = tf.m.w1(r1, r5)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L58
            java.lang.Integer r5 = og.t.e0(r3, r5)
            if (r5 == 0) goto L58
            int r0 = r5.intValue()
        L58:
            if (r2 < 0) goto L6f
            r5 = 24
            if (r2 >= r5) goto L6f
            if (r4 < 0) goto L6f
            r5 = 60
            if (r4 >= r5) goto L6f
            if (r0 < 0) goto L6f
            if (r0 >= r5) goto L6f
            int r2 = r2 * 3600
            int r5 = p.a.g(r4, r5, r2, r0)
            return r5
        L6f:
            r5 = -1
            return r5
    }

    public static java.lang.String l(int r2, java.lang.String r3, java.lang.String r4) {
            boolean r0 = og.m.t0(r3)
            java.lang.String r1 = ""
            if (r0 != 0) goto L3d
            boolean r0 = og.m.t0(r4)
            if (r0 == 0) goto Lf
            goto L3d
        Lf:
            r0 = 34
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4, r0)     // Catch: java.lang.Throwable -> L2d
            java.util.regex.Matcher r3 = r4.matcher(r3)     // Catch: java.lang.Throwable -> L2d
            boolean r4 = r3.find()     // Catch: java.lang.Throwable -> L2d
            if (r4 == 0) goto L2b
            int r4 = r3.groupCount()     // Catch: java.lang.Throwable -> L2d
            if (r4 < r2) goto L2b
            java.lang.String r2 = r3.group(r2)     // Catch: java.lang.Throwable -> L2d
            if (r2 != 0) goto L34
        L2b:
            r2 = r1
            goto L34
        L2d:
            r2 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r2)
            r2 = r3
        L34:
            boolean r3 = r2 instanceof sf.f
            if (r3 == 0) goto L3a
            goto L3b
        L3a:
            r1 = r2
        L3b:
            java.lang.String r1 = (java.lang.String) r1
        L3d:
            return r1
    }

    public static java.lang.String m(java.lang.String r3) {
            boolean r0 = og.m.t0(r3)
            if (r0 == 0) goto L9
            java.lang.String r3 = ""
            return r3
        L9:
            java.lang.String r0 = "&lt;"
            java.lang.String r1 = "<"
            r2 = 0
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "&gt;"
            java.lang.String r1 = ">"
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "&amp;"
            java.lang.String r1 = "&"
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "&quot;"
            java.lang.String r1 = "\""
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "&apos;"
            java.lang.String r1 = "'"
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "&#10;"
            java.lang.String r1 = "\n"
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "&#13;"
            java.lang.String r1 = "\r"
            java.lang.String r3 = og.t.a0(r3, r0, r1, r2)
            java.lang.String r0 = "(?is)<[^>]+>"
            java.lang.String r1 = " "
            java.lang.String r3 = j8.b.h(r0, r3, r1)
            java.lang.String r0 = "\\s+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            r0.getClass()
            java.util.regex.Matcher r3 = r0.matcher(r3)
            java.lang.String r3 = r3.replaceAll(r1)
            r3.getClass()
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            return r3
    }

    public static java.lang.String n(java.lang.String r4, java.lang.String r5) {
            boolean r0 = og.m.t0(r4)
            if (r0 != 0) goto L31
            boolean r0 = og.m.t0(r5)
            if (r0 == 0) goto Ld
            goto L31
        Ld:
            java.lang.String r0 = java.util.regex.Pattern.quote(r5)
            java.lang.String r5 = java.util.regex.Pattern.quote(r5)
            java.lang.String r1 = ">(?:<!\\[CDATA\\[(.*?)\\]\\]>|(.*?))</"
            java.lang.String r2 = ">"
            java.lang.String r3 = "(?is)<"
            java.lang.String r5 = bc.e.k(r3, r0, r1, r5, r2)
            r0 = 1
            java.lang.String r0 = l(r0, r4, r5)
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto L30
            r0 = 2
            java.lang.String r4 = l(r0, r4, r5)
            return r4
        L30:
            return r0
        L31:
            java.lang.String r4 = ""
            return r4
    }
}
