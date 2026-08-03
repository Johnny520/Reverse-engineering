package nb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class w {
    public static final og.k A = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f9311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final android.os.Handler f9312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.ArrayDeque f9313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap.KeySetView f9314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nb.e f9315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public android.speech.tts.TextToSpeech f9316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9318h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f9319i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ca.r f9320j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f9321k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.lang.String f9322l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public java.util.List f9323m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f9324n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public nb.l f9325o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public java.lang.String f9326p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f9327q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f9328r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f9329s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f9330t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public android.media.session.MediaSession f9331u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public nb.q f9332v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public nb.u f9333w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public java.lang.Integer f9334x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public java.lang.Runnable f9335y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile long f9336z;

    static {
            og.k r0 = new og.k
            java.lang.String r1 = "^([A-Za-z0-9_@.\\-]+?):\\n"
            r0.<init>(r1)
            nb.w.A = r0
            return
    }

    public w(android.content.Context r4) {
            r3 = this;
            r3.<init>()
            android.content.Context r0 = r4.getApplicationContext()
            if (r0 == 0) goto La
            r4 = r0
        La:
            r3.f9311a = r4
            java.lang.String r0 = "Hchat_text_speech_config"
            android.content.SharedPreferences r4 = ub.b.c(r4, r0)
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r3.f9312b = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r3.f9313c = r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            r3.f9314d = r0
            nb.e r0 = new nb.e
            r1 = 0
            r0.<init>(r3, r1)
            r3.f9315e = r0
            b9.b r0 = new b9.b
            r1 = 8
            r0.<init>(r3, r1)
            java.lang.String r1 = ""
            r3.f9322l = r1
            tf.t r2 = tf.t.f13167g
            r3.f9323m = r2
            r3.f9326p = r1
            r4.registerOnSharedPreferenceChangeListener(r0)
            return
    }

    public static java.util.List C(h.Hchat.hooks.api.model.WeChatMessage r7) {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.lang.String r1 = r7.imagePath
            boolean r2 = og.m.t0(r1)
            r3 = 0
            if (r2 != 0) goto Lf
            goto L10
        Lf:
            r1 = r3
        L10:
            if (r1 == 0) goto L15
            r0.add(r1)
        L15:
            java.lang.String r7 = r7.bodyContent()
            r1 = 2
            char[] r1 = new char[r1]
            r1 = {x00a8: FILL_ARRAY_DATA , data: [10, 13} // fill-array
            java.lang.String r1 = og.m.U0(r7, r1)
            r2 = 1
            char[] r4 = new char[r2]
            r5 = 58
            r6 = 0
            r4[r6] = r5
            r5 = 6
            java.util.List r1 = og.m.F0(r1, r4, r5)
            int r4 = r1.size()
            r5 = 3
            if (r4 < r5) goto L66
            r4 = 60
            boolean r4 = og.m.i0(r7, r4)
            if (r4 != 0) goto L66
            int r4 = r1.size()
            r5 = 4
            if (r4 != r5) goto L4d
            java.lang.Object r1 = r1.get(r2)
        L4a:
            java.lang.String r1 = (java.lang.String) r1
            goto L52
        L4d:
            java.lang.Object r1 = r1.get(r6)
            goto L4a
        L52:
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            boolean r2 = og.m.t0(r1)
            if (r2 != 0) goto L61
            r3 = r1
        L61:
            if (r3 == 0) goto L66
            r0.add(r3)
        L66:
            l8.d r1 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r1.getClass()
            java.lang.String r1 = "filename"
            java.lang.String r2 = l8.d.m(r7, r1)
            java.lang.String r3 = "voiceurl"
            java.lang.String r4 = l8.d.m(r7, r3)
            java.lang.String r1 = l8.d.o(r7, r1)
            java.lang.String r7 = l8.d.o(r7, r3)
            java.lang.String[] r7 = new java.lang.String[]{r2, r4, r1, r7}
            java.util.List r7 = a.a.y0(r7)
            java.util.Iterator r7 = r7.iterator()
        L8b:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto La2
            java.lang.Object r1 = r7.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = og.m.t0(r2)
            if (r2 != 0) goto L8b
            r0.add(r1)
            goto L8b
        La2:
            java.util.List r7 = tf.m.P1(r0)
            return r7
    }

    public static final void a(nb.w r1, java.lang.String r2) {
            int r0 = r2.length()
            if (r0 != 0) goto L7
            goto L28
        L7:
            java.lang.String r0 = r1.f9326p
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L28
            boolean r2 = r1.f9328r
            if (r2 == 0) goto L14
            goto L28
        L14:
            nb.l r2 = r1.f9325o
            boolean r2 = r2 instanceof nb.n
            if (r2 != 0) goto L1b
            goto L28
        L1b:
            java.lang.String r2 = ""
            r1.f9326p = r2
            r2 = 0
            r1.f9327q = r2
            r2 = 0
            r1.f9325o = r2
            r1.n()
        L28:
            return
    }

    public static final void b(nb.w r1, nb.o r2, java.lang.String r3) {
            nb.l r0 = r1.f9325o
            if (r0 == r2) goto L5
            return
        L5:
            r1.g()
            if (r3 == 0) goto L1a
            boolean r2 = og.m.t0(r3)
            if (r2 == 0) goto L11
            goto L1a
        L11:
            java.lang.String r2 = "[Hchat:TextSpeech] 原语音播放失败: "
            java.lang.String r2 = r2.concat(r3)
            fb.v0.m(r2)
        L1a:
            r2 = 0
            r1.f9325o = r2
            r2 = 0
            r1.f9328r = r2
            r1.n()
            return
    }

    public static void d(nb.k r5, java.lang.String r6, h.Hchat.hooks.api.model.WeChatMessage r7) {
            if (r7 != 0) goto L3
            goto L42
        L3:
            java.util.List r0 = C(r7)
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.LinkedHashMap r2 = r5.f9291g
            java.lang.Object r3 = r2.get(r1)
            if (r3 == 0) goto L2b
            java.lang.Object r3 = r2.get(r1)
            java.lang.String r4 = "initial"
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto Lb
        L2b:
            r2.put(r1, r6)
            goto Lb
        L2f:
            java.lang.String r6 = r7.bodyContent()
            boolean r7 = og.m.t0(r6)
            if (r7 != 0) goto L3a
            goto L3b
        L3a:
            r6 = 0
        L3b:
            if (r6 == 0) goto L42
            java.util.LinkedHashSet r5 = r5.f9292h
            r5.add(r6)
        L42:
            return
    }

    public static java.lang.String h(java.lang.String r2) {
            boolean r0 = og.m.t0(r2)
            if (r0 == 0) goto L9
            java.lang.String r2 = "empty"
            return r2
        L9:
            r0 = 10
            r1 = 32
            java.lang.String r2 = r2.replace(r0, r1)
            r2.getClass()
            r0 = 13
            java.lang.String r2 = r2.replace(r0, r1)
            r2.getClass()
            r0 = 160(0xa0, float:2.24E-43)
            java.lang.String r2 = og.m.P0(r0, r2)
            return r2
    }

    public static boolean k(nb.z r4) {
            java.lang.String r0 = "text_speech_quiet_enable"
            boolean r0 = r4.b(r0)
            if (r0 != 0) goto L9
            goto L49
        L9:
            java.lang.String r0 = "text_speech_quiet_start"
            java.lang.String r1 = "23:00"
            java.lang.String r0 = r4.d(r0, r1)
            int r0 = l(r0)
            java.lang.String r1 = "text_speech_quiet_end"
            java.lang.String r2 = "08:00"
            java.lang.String r4 = r4.d(r1, r2)
            int r4 = l(r4)
            if (r0 < 0) goto L49
            if (r4 >= 0) goto L26
            goto L49
        L26:
            if (r0 != r4) goto L29
            goto L47
        L29:
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            r2 = 11
            int r2 = r1.get(r2)
            int r2 = r2 * 60
            r3 = 12
            int r1 = r1.get(r3)
            int r1 = r1 + r2
            if (r0 >= r4) goto L43
            if (r0 > r1) goto L49
            if (r1 >= r4) goto L49
            goto L47
        L43:
            if (r1 >= r0) goto L47
            if (r1 >= r4) goto L49
        L47:
            r4 = 1
            return r4
        L49:
            r4 = 0
            return r4
    }

    public static int l(java.lang.String r3) {
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = ":"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            java.util.List r3 = og.m.G0(r3, r0)
            r0 = 0
            java.lang.Object r0 = tf.m.w1(r0, r3)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L49
            r1 = 10
            java.lang.Integer r0 = og.t.e0(r1, r0)
            if (r0 == 0) goto L49
            int r0 = r0.intValue()
            r2 = 1
            java.lang.Object r3 = tf.m.w1(r2, r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L49
            java.lang.Integer r3 = og.t.e0(r1, r3)
            if (r3 == 0) goto L49
            int r3 = r3.intValue()
            if (r0 < 0) goto L49
            r1 = 24
            if (r0 >= r1) goto L49
            if (r3 < 0) goto L49
            r1 = 60
            if (r3 >= r1) goto L49
            int r0 = r0 * r1
            int r0 = r0 + r3
            return r0
        L49:
            r3 = -1
            return r3
    }

    public static nb.j q(nb.k r17, j8.y r18) {
            r0 = r17
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.LinkedHashMap r2 = r0.f9291g
            int r3 = r2.size()
            r1.<init>(r3)
            java.util.Set r2 = r2.entrySet()
            r2.getClass()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            nb.v r3 = new nb.v
            r3.<init>()
            java.util.List r2 = tf.m.K1(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L23:
            boolean r3 = r2.hasNext()
            r6 = 0
            if (r3 == 0) goto Lfa
            java.lang.Object r3 = r2.next()
            r3.getClass()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            r4.getClass()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            r3.getClass()
            java.lang.String r3 = (java.lang.String) r3
            java.io.File r5 = new java.io.File
            r5.<init>(r4)
            boolean r7 = r5.isFile()
            java.lang.String r8 = ""
            r9 = 0
            if (r7 == 0) goto L66
            long r11 = r5.length()
            int r7 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r7 <= 0) goto L66
            nb.j r1 = new nb.j
            nb.m r0 = s(r5, r4, r0)
            r1.<init>(r0, r8)
            return r1
        L66:
            r7 = r18
            java.lang.String r11 = r7.q(r4)
            r11.getClass()
            boolean r12 = og.m.t0(r11)
            if (r12 != 0) goto L77
            r12 = r11
            goto L78
        L77:
            r12 = r6
        L78:
            if (r12 == 0) goto L7f
            java.io.File r6 = new java.io.File
            r6.<init>(r12)
        L7f:
            if (r6 == 0) goto L99
            boolean r12 = r6.isFile()
            if (r12 == 0) goto L99
            long r12 = r6.length()
            int r12 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r12 <= 0) goto L99
            nb.j r1 = new nb.j
            nb.m r0 = s(r6, r4, r0)
            r1.<init>(r0, r8)
            return r1
        L99:
            java.lang.String r4 = h(r4)
            boolean r8 = r5.isFile()
            java.lang.String r12 = "ready"
            java.lang.String r13 = "missing"
            java.lang.String r14 = "empty"
            if (r8 != 0) goto Lab
            r5 = r13
            goto Lb6
        Lab:
            long r15 = r5.length()
            int r5 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r5 <= 0) goto Lb5
            r5 = r12
            goto Lb6
        Lb5:
            r5 = r14
        Lb6:
            java.lang.String r8 = h(r11)
            if (r6 != 0) goto Lbd
            goto Lce
        Lbd:
            boolean r11 = r6.isFile()
            if (r11 != 0) goto Lc5
            r12 = r13
            goto Lcf
        Lc5:
            long r15 = r6.length()
            int r6 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r6 <= 0) goto Lce
            goto Lcf
        Lce:
            r12 = r14
        Lcf:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.String r3 = ":"
            r6.append(r3)
            r6.append(r4)
            java.lang.String r4 = "(direct="
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = ",resolved="
            j8.b.t(r6, r4, r8, r3, r12)
            java.lang.String r3 = ")"
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            r1.add(r3)
            goto L23
        Lfa:
            nb.j r7 = new nb.j
            r4 = 0
            r5 = 62
            r0 = r1
            java.lang.String r1 = ";"
            r2 = 0
            r3 = 0
            java.lang.String r0 = tf.m.A1(r0, r1, r2, r3, r4, r5)
            java.lang.String r1 = "candidates=["
            java.lang.String r2 = "]"
            java.lang.String r0 = eh.a.n(r1, r0, r2)
            r7.<init>(r6, r0)
            return r7
    }

    public static nb.m r(nb.k r17, int r18) {
            r0 = r17
            j8.p r1 = h.Hchat.hooks.api.core.WeChatApis.media()
            r2 = 0
            if (r1 == 0) goto L108
            j8.y r1 = r1.f6816b
            if (r1 == 0) goto L108
            nb.j r3 = q(r0, r1)
            nb.m r4 = r3.f9283a
            if (r4 == 0) goto L16
            return r4
        L16:
            int r4 = r18 + 1
            r5 = 120(0x78, float:1.68E-43)
            r7 = 1
            if (r4 < r5) goto L1f
            r4 = r7
            goto L20
        L1f:
            r4 = 0
        L20:
            if (r18 == 0) goto L2b
            int r5 = r18 % 4
            if (r5 == 0) goto L2b
            if (r4 == 0) goto L29
            goto L2b
        L29:
            r5 = 0
            goto L2c
        L2b:
            r5 = r7
        L2c:
            if (r5 == 0) goto Lf1
            k8.s r8 = h.Hchat.hooks.api.core.WeChatApis.messageStore()
            long r9 = r0.f9287c
            r11 = 0
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 <= 0) goto L41
            if (r8 == 0) goto L41
            h.Hchat.hooks.api.model.WeChatMessage r9 = r8.c(r9)
            goto L42
        L41:
            r9 = r2
        L42:
            if (r9 != 0) goto L53
            long r13 = r0.f9288d
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 <= 0) goto L53
            if (r8 == 0) goto L53
            java.lang.String r10 = r0.f9286b
            h.Hchat.hooks.api.model.WeChatMessage r10 = r8.e(r13, r10)
            goto L54
        L53:
            r10 = r2
        L54:
            if (r4 == 0) goto L62
            long r13 = r0.f9288d
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 <= 0) goto L62
            if (r8 == 0) goto L62
            h.Hchat.hooks.api.model.WeChatMessage r2 = r8.d(r13)
        L62:
            java.lang.String r13 = "msgId"
            d(r0, r13, r9)
            java.lang.String r13 = "talkerSvrId"
            d(r0, r13, r10)
            java.lang.String r13 = "globalSvrId"
            d(r0, r13, r2)
            if (r8 == 0) goto L7b
            boolean r8 = r8.h()
            if (r8 != r7) goto L7b
            r8 = r7
            goto L7c
        L7b:
            r8 = 0
        L7c:
            h.Hchat.hooks.api.model.WeChatMessage r13 = r0.f9289e
            if (r13 == 0) goto L82
            r13 = r7
            goto L83
        L82:
            r13 = 0
        L83:
            long r14 = r0.f9287c
            int r14 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            java.lang.String r15 = "skip"
            if (r14 <= 0) goto L95
            if (r9 == 0) goto L8f
            r14 = r7
            goto L90
        L8f:
            r14 = 0
        L90:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            goto L96
        L95:
            r14 = r15
        L96:
            if (r9 != 0) goto La8
            long r6 = r0.f9288d
            int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r6 <= 0) goto La8
            if (r10 == 0) goto La2
            r6 = 1
            goto La3
        La2:
            r6 = 0
        La3:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            goto La9
        La8:
            r6 = r15
        La9:
            if (r4 == 0) goto Lbc
            long r9 = r0.f9288d
            int r4 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r4 <= 0) goto Lbc
            if (r2 == 0) goto Lb6
            r16 = 1
            goto Lb8
        Lb6:
            r16 = 0
        Lb8:
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r16)
        Lbc:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "lookups=[store="
            r2.<init>(r4)
            r2.append(r8)
            java.lang.String r4 = ",initial="
            r2.append(r4)
            r2.append(r13)
            java.lang.String r4 = ",msgId="
            r2.append(r4)
            r2.append(r14)
            java.lang.String r4 = ",talkerSvrId="
            r2.append(r4)
            r2.append(r6)
            java.lang.String r4 = ",globalSvrId="
            r2.append(r4)
            r2.append(r15)
            java.lang.String r4 = "]"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r0.f9293i = r2
        Lf1:
            if (r5 == 0) goto Lf7
            nb.j r3 = q(r0, r1)
        Lf7:
            java.lang.String r1 = r0.f9293i
            java.lang.String r2 = r3.f9284b
            java.lang.String r4 = "voiceApi=true "
            java.lang.String r5 = " "
            java.lang.String r1 = bc.e.j(r4, r1, r5, r2)
            r0.f9294j = r1
            nb.m r0 = r3.f9283a
            return r0
        L108:
            java.lang.String r1 = "voiceApi=false"
            r0.f9294j = r1
            return r2
    }

    public static nb.m s(java.io.File r7, java.lang.String r8, nb.k r9) {
            java.util.concurrent.ConcurrentHashMap r0 = j8.e.f6779a
            long r3 = r9.f9287c
            java.util.LinkedHashSet r9 = r9.f9292h
            java.util.List r5 = tf.m.P1(r9)
            r6 = 60000(0xea60, float:8.4078E-41)
            r1 = 0
            r2 = r8
            int r8 = j8.e.d(r1, r2, r3, r5, r6)
            r9 = 1000(0x3e8, float:1.401E-42)
            if (r8 >= r9) goto L18
            r8 = r9
        L18:
            nb.m r9 = new nb.m
            java.lang.String r7 = r7.getAbsolutePath()
            r7.getClass()
            r9.<init>(r7, r8)
            return r9
    }

    public final boolean A() {
            r8 = this;
            android.speech.tts.TextToSpeech r0 = r8.f9316f
            r1 = 0
            if (r0 == 0) goto L88
            nb.l r2 = r8.f9325o
            boolean r3 = r2 instanceof nb.n
            if (r3 == 0) goto Le
            nb.n r2 = (nb.n) r2
            goto Lf
        Le:
            r2 = 0
        Lf:
            if (r2 == 0) goto L88
            java.lang.String r3 = r2.f9297a
            r8.c()
            int r2 = r2.f9298b
            int r4 = r3.length()
            int r2 = r9.e0.r(r2, r1, r4)
            java.lang.String r3 = r3.substring(r2)
            int r4 = r3.length()
            if (r4 != 0) goto L2b
            goto L88
        L2b:
            r8.f9327q = r2
            long r4 = r8.f9329s
            r6 = 1
            long r4 = r4 + r6
            r8.f9329s = r4
            java.lang.String r2 = "hchat_text_speech_"
            java.lang.String r2 = bc.e.g(r4, r2)
            r8.f9326p = r2
            android.os.Bundle r4 = new android.os.Bundle     // Catch: java.lang.Throwable -> L51
            r4.<init>()     // Catch: java.lang.Throwable -> L51
            java.lang.String r5 = "streamType"
            java.lang.String r6 = "3"
            r4.putString(r5, r6)     // Catch: java.lang.Throwable -> L51
            int r0 = r0.speak(r3, r1, r4, r2)     // Catch: java.lang.Throwable -> L51
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L51
            goto L58
        L51:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L58:
            java.lang.Throwable r2 = sf.g.b(r0)
            r3 = -1
            if (r2 != 0) goto L60
            goto L79
        L60:
            java.lang.String r0 = r2.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "[Hchat:TextSpeech] 播报失败: "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            fb.v0.n(r0, r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
        L79:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r3) goto L85
            java.lang.String r2 = ""
            r8.f9326p = r2
        L85:
            if (r0 == r3) goto L88
            r1 = 1
        L88:
            return r1
    }

    public final void B() {
            r6 = this;
            boolean r0 = r6.f9328r
            if (r0 == 0) goto L6
            r0 = 6
            goto L7
        L6:
            r0 = 3
        L7:
            android.media.session.MediaSession r1 = r6.f9331u     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L2b
            android.media.session.PlaybackState$Builder r2 = new android.media.session.PlaybackState$Builder     // Catch: java.lang.Throwable -> L2b
            r2.<init>()     // Catch: java.lang.Throwable -> L2b
            r3 = 550(0x226, double:2.717E-321)
            android.media.session.PlaybackState$Builder r2 = r2.setActions(r3)     // Catch: java.lang.Throwable -> L2b
            boolean r3 = r6.f9328r     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L1c
            r3 = 0
            goto L1e
        L1c:
            r3 = 1065353216(0x3f800000, float:1.0)
        L1e:
            r4 = -1
            android.media.session.PlaybackState$Builder r0 = r2.setState(r0, r4, r3)     // Catch: java.lang.Throwable -> L2b
            android.media.session.PlaybackState r0 = r0.build()     // Catch: java.lang.Throwable -> L2b
            r1.setPlaybackState(r0)     // Catch: java.lang.Throwable -> L2b
        L2b:
            return
    }

    public final void c() {
            r7 = this;
            nb.z r0 = r7.y()
            java.lang.String r1 = "text_speech_volume_control"
            boolean r0 = r0.b(r1)
            if (r0 != 0) goto L10
            r7.o()
            return
        L10:
            nb.u r0 = r7.f9333w
            android.content.Context r1 = r7.f9311a
            if (r0 == 0) goto L17
            goto L59
        L17:
            nb.u r0 = new nb.u
            r2 = 0
            r0.<init>(r7, r2)
            android.content.IntentFilter r2 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = "android.media.VOLUME_CHANGED_ACTION"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2f
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L2f
            r4 = 33
            if (r3 < r4) goto L31
            r3 = 2
            r1.registerReceiver(r0, r2, r3)     // Catch: java.lang.Throwable -> L2f
            goto L34
        L2f:
            r2 = move-exception
            goto L37
        L31:
            r1.registerReceiver(r0, r2)     // Catch: java.lang.Throwable -> L2f
        L34:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L2f
            goto L3d
        L37:
            sf.f r3 = new sf.f
            r3.<init>(r2)
            r2 = r3
        L3d:
            java.lang.Throwable r3 = sf.g.b(r2)
            if (r3 != 0) goto L44
            goto L4f
        L44:
            java.lang.String r2 = r3.getMessage()
            java.lang.String r4 = "[Hchat:TextSpeech] 后台音量变化监听初始化失败: "
            eh.a.x(r4, r2, r3)
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
        L4f:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L59
            r7.f9333w = r0
        L59:
            android.media.session.MediaSession r0 = r7.f9331u
            r2 = 1
            if (r0 != 0) goto Lbd
            java.lang.String r0 = "audio"
            java.lang.Object r0 = r1.getSystemService(r0)
            boolean r3 = r0 instanceof android.media.AudioManager
            r4 = 0
            if (r3 == 0) goto L6c
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            goto L6d
        L6c:
            r0 = r4
        L6d:
            if (r0 == 0) goto Lc7
            r3 = 3
            int r5 = r0.getStreamMaxVolume(r3)
            if (r5 >= r2) goto L77
            r5 = r2
        L77:
            int r0 = r0.getStreamVolume(r3)
            r6 = 0
            int r0 = r9.e0.r(r0, r6, r5)
            nb.q r6 = new nb.q
            r6.<init>(r5, r0, r7)
            r7.f9332v = r6
            android.media.session.MediaSession r0 = new android.media.session.MediaSession     // Catch: java.lang.Throwable -> L9f
            java.lang.String r5 = "HchatTextSpeech"
            r0.<init>(r1, r5)     // Catch: java.lang.Throwable -> L9f
            r0.setFlags(r3)     // Catch: java.lang.Throwable -> L9f
            nb.p r1 = new nb.p     // Catch: java.lang.Throwable -> L9f
            r1.<init>()     // Catch: java.lang.Throwable -> L9f
            android.os.Handler r3 = r7.f9312b     // Catch: java.lang.Throwable -> L9f
            r0.setCallback(r1, r3)     // Catch: java.lang.Throwable -> L9f
            r0.setPlaybackToRemote(r6)     // Catch: java.lang.Throwable -> L9f
            goto La6
        L9f:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        La6:
            java.lang.Throwable r1 = sf.g.b(r0)
            if (r1 != 0) goto Lae
            r4 = r0
            goto Lb9
        Lae:
            r7.f9332v = r4
            java.lang.String r0 = r1.getMessage()
            java.lang.String r3 = "[Hchat:TextSpeech] 后台音量控制初始化失败: "
            eh.a.x(r3, r0, r1)
        Lb9:
            android.media.session.MediaSession r4 = (android.media.session.MediaSession) r4
            r7.f9331u = r4
        Lbd:
            r7.B()
            android.media.session.MediaSession r0 = r7.f9331u
            if (r0 == 0) goto Lc7
            r0.setActive(r2)
        Lc7:
            return
    }

    public final boolean e() {
            r4 = this;
            java.lang.String r0 = r4.f9322l
            boolean r0 = og.m.t0(r0)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            int r0 = r4.f9324n
            r2 = 1
            int r0 = r0 + r2
            java.util.List r3 = r4.f9323m
            int r3 = r3.size()
            if (r0 < r3) goto L17
            return r1
        L17:
            int r0 = r4.f9324n
            int r0 = r0 + r2
            r4.f9324n = r0
            r4.f9321k = r1
            return r2
    }

    public final boolean f(nb.k r3, long r4) {
            r2 = this;
            long r0 = r2.f9336z
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r5 = 0
            if (r4 != 0) goto L42
            java.util.concurrent.ConcurrentHashMap$KeySetView r4 = r2.f9314d
            java.lang.String r0 = r3.f9285a
            boolean r4 = r4.contains(r0)
            if (r4 != 0) goto L12
            goto L42
        L12:
            nb.z r4 = r2.y()
            java.lang.String r0 = "text_speech_enable"
            boolean r0 = r4.b(r0)
            if (r0 == 0) goto L39
            java.lang.String r0 = "text_speech_play_voice_messages"
            boolean r0 = r4.b(r0)
            if (r0 == 0) goto L39
            java.util.Set r0 = r4.a()
            java.lang.String r1 = r3.f9286b
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L39
            boolean r4 = k(r4)
            if (r4 != 0) goto L39
            r5 = 1
        L39:
            if (r5 != 0) goto L42
            java.util.concurrent.ConcurrentHashMap$KeySetView r4 = r2.f9314d
            java.lang.String r3 = r3.f9285a
            r4.remove(r3)
        L42:
            return r5
    }

    public final void g() {
            r2 = this;
            java.lang.Runnable r0 = r2.f9335y
            if (r0 == 0) goto L9
            android.os.Handler r1 = r2.f9312b
            r1.removeCallbacks(r0)
        L9:
            r0 = 0
            r2.f9335y = r0
            return
    }

    public final void i() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayDeque r1 = r5.f9313c
            java.util.Iterator r2 = r1.iterator()
        Lb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L28
            java.lang.Object r3 = r2.next()
            r4 = r3
            nb.l r4 = (nb.l) r4
            boolean r4 = r4 instanceof nb.n
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto Lb
            r0.add(r3)
            goto Lb
        L28:
            r1.clear()
            r1.addAll(r0)
            nb.l r0 = r5.f9325o
            boolean r0 = r0 instanceof nb.n
            if (r0 == 0) goto L40
            r0 = 0
            r5.f9325o = r0
            r0 = 0
            r5.f9328r = r0
            java.lang.String r1 = ""
            r5.f9326p = r1
            r5.f9327q = r0
        L40:
            r5.o()
            r5.n()
            return
    }

    public final void j() {
            r10 = this;
            nb.z r0 = r10.y()
            java.lang.String r1 = "text_speech_enable"
            boolean r0 = r0.b(r1)
            if (r0 != 0) goto Lf
        Lc:
            r5 = r10
            goto L97
        Lf:
            boolean r0 = r10.f9317g
            if (r0 == 0) goto L17
            r10.n()
            return
        L17:
            boolean r0 = r10.f9318h
            if (r0 != 0) goto Lc
            android.speech.tts.TextToSpeech r0 = r10.f9316f
            if (r0 == 0) goto L20
            goto Lc
        L20:
            r0 = 1
            r10.f9318h = r0
            long r0 = r10.f9319i
            r2 = 1
            long r6 = r0 + r2
            r10.f9319i = r6
            nb.z r0 = r10.y()
            java.lang.String r8 = r0.c()
            java.lang.String r0 = r10.f9322l
            boolean r0 = gg.l.a(r0, r8)
            r1 = 0
            android.content.Context r2 = r10.f9311a
            if (r0 == 0) goto L46
            java.util.List r0 = r10.f9323m
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L50
        L46:
            r10.f9322l = r8
            java.util.List r0 = nb.c.a(r2, r8)
            r10.f9323m = r0
            r10.f9324n = r1
        L50:
            java.util.List r0 = r10.f9323m
            int r3 = r10.f9324n
            java.lang.Object r0 = tf.m.w1(r3, r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L5e
            r9 = r0
            goto L5f
        L5e:
            r9 = r8
        L5f:
            nb.i r4 = new nb.i     // Catch: java.lang.Throwable -> L90
            r5 = r10
            r4.<init>(r5, r6, r8, r9)     // Catch: java.lang.Throwable -> L71
            boolean r0 = og.m.t0(r9)     // Catch: java.lang.Throwable -> L71
            if (r0 == 0) goto L73
            android.speech.tts.TextToSpeech r0 = new android.speech.tts.TextToSpeech     // Catch: java.lang.Throwable -> L71
            r0.<init>(r2, r4)     // Catch: java.lang.Throwable -> L71
            goto L78
        L71:
            r0 = move-exception
            goto L92
        L73:
            android.speech.tts.TextToSpeech r0 = new android.speech.tts.TextToSpeech     // Catch: java.lang.Throwable -> L71
            r0.<init>(r2, r4, r9)     // Catch: java.lang.Throwable -> L71
        L78:
            r5.f9316f = r0     // Catch: java.lang.Throwable -> L71
            ca.r r0 = r5.f9320j     // Catch: java.lang.Throwable -> L71
            android.os.Handler r2 = r5.f9312b
            if (r0 == 0) goto L83
            r2.removeCallbacks(r0)     // Catch: java.lang.Throwable -> L71
        L83:
            ca.r r0 = new ca.r     // Catch: java.lang.Throwable -> L71
            r0.<init>(r6, r10, r9)     // Catch: java.lang.Throwable -> L71
            r5.f9320j = r0     // Catch: java.lang.Throwable -> L71
            r3 = 8000(0x1f40, double:3.9525E-320)
            r2.postDelayed(r0, r3)     // Catch: java.lang.Throwable -> L71
            return
        L90:
            r0 = move-exception
            r5 = r10
        L92:
            r5.f9318h = r1
            r10.v(r0)
        L97:
            return
    }

    public final void m() {
            r4 = this;
            boolean r0 = r4.f9328r
            if (r0 == 0) goto L5
            goto L42
        L5:
            nb.l r0 = r4.f9325o
            boolean r1 = r0 instanceof nb.n
            r2 = 1
            if (r1 == 0) goto L1d
            r4.f9328r = r2
            java.lang.String r0 = ""
            r4.f9326p = r0
            android.speech.tts.TextToSpeech r0 = r4.f9316f     // Catch: java.lang.Throwable -> L19
            if (r0 == 0) goto L19
            r0.stop()     // Catch: java.lang.Throwable -> L19
        L19:
            r4.B()
            return
        L1d:
            boolean r1 = r0 instanceof nb.o
            if (r1 == 0) goto L40
            j8.p r0 = h.Hchat.hooks.api.core.WeChatApis.media()
            if (r0 == 0) goto L42
            j8.y r0 = r0.f6816b
            if (r0 == 0) goto L42
            j8.u r1 = new j8.u
            r3 = 1
            r1.<init>(r0, r3)
            boolean r0 = r0.r(r1)
            if (r0 != r2) goto L42
            r4.f9328r = r2
            r4.g()
            r4.B()
            return
        L40:
            if (r0 != 0) goto L43
        L42:
            return
        L43:
            okio.a.k()
            return
    }

    public final void n() {
            r8 = this;
            boolean r0 = r8.f9328r
            if (r0 != 0) goto L98
            nb.l r0 = r8.f9325o
            if (r0 == 0) goto La
            goto L98
        La:
            java.util.ArrayDeque r0 = r8.f9313c
            java.lang.Object r1 = r0.peekFirst()
            nb.l r1 = (nb.l) r1
            if (r1 == 0) goto L95
            boolean r2 = r1 instanceof nb.n
            r3 = 0
            if (r2 == 0) goto L32
            boolean r2 = r8.f9317g
            if (r2 != 0) goto L21
            r8.j()
            return
        L21:
            r0.pollFirst()
            r8.f9325o = r1
            boolean r0 = r8.A()
            if (r0 != 0) goto L98
            r8.f9325o = r3
            r8.n()
            return
        L32:
            boolean r2 = r1 instanceof nb.o
            if (r2 == 0) goto L91
            r0.pollFirst()
            r8.f9325o = r1
            nb.o r1 = (nb.o) r1
            j8.p r0 = h.Hchat.hooks.api.core.WeChatApis.media()
            r2 = 0
            if (r0 == 0) goto L89
            j8.y r0 = r0.f6816b
            if (r0 == 0) goto L89
            r8.c()
            java.lang.String r4 = r1.f9299a
            b.e r5 = new b.e
            r6 = 28
            r5.<init>(r8, r6, r1)
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 != 0) goto L7b
            boolean r6 = eh.a.y(r4)
            if (r6 != 0) goto L61
            goto L7b
        L61:
            h.Hchat.dexkit.DexFinder r6 = r0.f6841a
            java.lang.reflect.Method r7 = r6.voicePlaybackStartMethod
            if (r7 == 0) goto L75
            java.lang.reflect.Method r6 = r6.voicePlaybackStopMethod
            if (r6 == 0) goto L75
            j8.s r2 = new j8.s
            r2.<init>(r0, r4, r5)
            boolean r2 = r0.r(r2)
            goto L84
        L75:
            java.lang.String r4 = "播放原语音失败: 原生播放器未就绪"
            r0.m(r4)
            goto L84
        L7b:
            java.lang.String r5 = "播放原语音失败: 文件不存在 "
            java.lang.String r4 = r5.concat(r4)
            r0.m(r4)
        L84:
            if (r2 == 0) goto L89
            r8.x(r1)
        L89:
            if (r2 != 0) goto L98
            r8.f9325o = r3
            r8.n()
            return
        L91:
            okio.a.k()
            return
        L95:
            r8.o()
        L98:
            return
    }

    public final void o() {
            r3 = this;
            android.media.session.MediaSession r0 = r3.f9331u
            r1 = 0
            r3.f9331u = r1
            r3.f9332v = r1
            if (r0 == 0) goto Ld
            r2 = 0
            r0.setActive(r2)     // Catch: java.lang.Throwable -> Ld
        Ld:
            if (r0 == 0) goto L12
            r0.release()     // Catch: java.lang.Throwable -> L12
        L12:
            nb.u r0 = r3.f9333w
            if (r0 == 0) goto L1f
            r3.f9333w = r1
            r3.f9334x = r1
            android.content.Context r1 = r3.f9311a     // Catch: java.lang.Throwable -> L1f
            r1.unregisterReceiver(r0)     // Catch: java.lang.Throwable -> L1f
        L1f:
            return
    }

    public final void p() {
            r1 = this;
            java.lang.String r0 = ""
            r1.f9322l = r0
            tf.t r0 = tf.t.f13167g
            r1.f9323m = r0
            r0 = 0
            r1.f9324n = r0
            r1.f9321k = r0
            return
    }

    public final void t() {
            r3 = this;
            nb.l r0 = r3.f9325o
            boolean r1 = r0 instanceof nb.o
            if (r1 == 0) goto L14
            android.speech.tts.TextToSpeech r0 = r3.f9316f     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Ld
            r0.stop()     // Catch: java.lang.Throwable -> Ld
        Ld:
            r3.w()
            r3.p()
            return
        L14:
            boolean r1 = r0 instanceof nb.n
            r2 = 0
            if (r1 == 0) goto L1c
            nb.n r0 = (nb.n) r0
            goto L1d
        L1c:
            r0 = r2
        L1d:
            r3.f9325o = r2
            java.lang.String r1 = ""
            r3.f9326p = r1
            r1 = 0
            r3.f9327q = r1
            r3.f9328r = r1
            r3.f9330t = r1
            android.speech.tts.TextToSpeech r1 = r3.f9316f     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L31
            r1.stop()     // Catch: java.lang.Throwable -> L31
        L31:
            r3.o()
            r3.w()
            r3.p()
            java.util.ArrayDeque r1 = r3.f9313c
            if (r0 == 0) goto L41
            r1.addFirst(r0)
        L41:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L56
            nb.z r0 = r3.y()
            java.lang.String r1 = "text_speech_enable"
            boolean r0 = r0.b(r1)
            if (r0 == 0) goto L56
            r3.n()
        L56:
            return
    }

    public final void u() {
            r5 = this;
            boolean r0 = r5.f9328r
            if (r0 == 0) goto L46
            nb.l r0 = r5.f9325o
            if (r0 != 0) goto L9
            goto L46
        L9:
            boolean r1 = r0 instanceof nb.n
            r2 = 0
            if (r1 == 0) goto L1d
            r5.f9328r = r2
            boolean r0 = r5.A()
            if (r0 != 0) goto L46
            r0 = 0
            r5.f9325o = r0
            r5.n()
            return
        L1d:
            boolean r1 = r0 instanceof nb.o
            if (r1 == 0) goto L43
            j8.p r1 = h.Hchat.hooks.api.core.WeChatApis.media()
            if (r1 == 0) goto L46
            j8.y r1 = r1.f6816b
            if (r1 == 0) goto L46
            j8.u r3 = new j8.u
            r4 = 0
            r3.<init>(r1, r4)
            boolean r1 = r1.r(r3)
            r3 = 1
            if (r1 != r3) goto L46
            r5.f9328r = r2
            nb.o r0 = (nb.o) r0
            r5.x(r0)
            r5.B()
            return
        L43:
            okio.a.k()
        L46:
            return
    }

    public final void v(java.lang.Throwable r6) {
            r5 = this;
            r5.w()
            nb.z r0 = r5.y()
            java.lang.String r1 = "text_speech_enable"
            boolean r0 = r0.b(r1)
            if (r0 != 0) goto L10
            return
        L10:
            int r0 = r5.f9321k
            r1 = 1
            int r0 = r0 + r1
            r5.f9321k = r0
            r2 = 800(0x320, double:3.953E-321)
            android.os.Handler r4 = r5.f9312b
            if (r0 > r1) goto L26
            nb.e r6 = new nb.e
            r0 = 1
            r6.<init>(r5, r0)
            r4.postDelayed(r6, r2)
            return
        L26:
            boolean r0 = r5.e()
            if (r0 == 0) goto L36
            nb.e r6 = new nb.e
            r0 = 2
            r6.<init>(r5, r0)
            r4.postDelayed(r6, r2)
            return
        L36:
            nb.z r0 = r5.y()
            java.lang.String r0 = r0.c()
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto L46
            java.lang.String r0 = "系统默认"
        L46:
            java.lang.String r1 = "[Hchat:TextSpeech] 文字转语音引擎初始化失败: "
            java.lang.String r0 = r1.concat(r0)
            fb.v0.n(r0, r6)
            r5.p()
            r5.i()
            return
    }

    public final void w() {
            r4 = this;
            long r0 = r4.f9319i
            r2 = 1
            long r0 = r0 + r2
            r4.f9319i = r0
            ca.r r0 = r4.f9320j
            if (r0 == 0) goto L10
            android.os.Handler r1 = r4.f9312b
            r1.removeCallbacks(r0)
        L10:
            r0 = 0
            r4.f9320j = r0
            android.speech.tts.TextToSpeech r1 = r4.f9316f     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L1a
            r1.shutdown()     // Catch: java.lang.Throwable -> L1a
        L1a:
            r4.f9316f = r0
            r0 = 0
            r4.f9317g = r0
            r4.f9318h = r0
            java.lang.String r1 = ""
            r4.f9326p = r1
            r4.f9327q = r0
            return
    }

    public final void x(nb.o r11) {
            r10 = this;
            r10.g()
            int r0 = r11.f9300b
            long r0 = (long) r0
            r2 = 15000(0x3a98, double:7.411E-320)
            long r4 = r0 + r2
            r6 = 20000(0x4e20, double:9.8813E-320)
            r8 = 300000(0x493e0, double:1.482197E-318)
            long r0 = r9.e0.s(r4, r6, r8)
            gg.u r2 = new gg.u
            r2.<init>()
            ac.l r3 = new ac.l
            r4 = 21
            r3.<init>(r10, r2, r11, r4)
            r2.f4564g = r3
            r10.f9335y = r3
            android.os.Handler r11 = r10.f9312b
            r11.postDelayed(r3, r0)
            return
    }

    public final nb.z y() {
            r2 = this;
            nb.z r0 = new nb.z
            android.content.Context r1 = r2.f9311a
            r0.<init>(r1)
            return r0
    }

    public final void z() {
            r3 = this;
            boolean r0 = r3.f9328r
            if (r0 != 0) goto L9
            nb.l r0 = r3.f9325o
            if (r0 != 0) goto L9
            return
        L9:
            nb.l r0 = r3.f9325o
            java.lang.String r1 = ""
            r3.f9326p = r1
            r1 = 0
            r3.f9327q = r1
            r3.f9328r = r1
            r1 = 0
            r3.f9325o = r1
            boolean r1 = r0 instanceof nb.n
            if (r1 == 0) goto L23
            android.speech.tts.TextToSpeech r0 = r3.f9316f     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L40
            r0.stop()     // Catch: java.lang.Throwable -> L40
            goto L40
        L23:
            boolean r1 = r0 instanceof nb.o
            if (r1 == 0) goto L3e
            r3.g()
            j8.p r0 = h.Hchat.hooks.api.core.WeChatApis.media()
            if (r0 == 0) goto L40
            j8.y r0 = r0.f6816b
            if (r0 == 0) goto L40
            j8.u r1 = new j8.u
            r2 = 2
            r1.<init>(r0, r2)
            r0.r(r1)
            goto L40
        L3e:
            if (r0 != 0) goto L44
        L40:
            r3.n()
            return
        L44:
            okio.a.k()
            return
    }
}
