package hb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r8.g f5418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ab.b f5419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.os.Handler f5420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.content.SharedPreferences f5421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.ArrayDeque f5422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile hb.g f5423f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public hb.i f5424g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f5425h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b9.c f5426i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f5427j;

    public k(r8.g r2, ab.b r3) {
            r1 = this;
            r2.getClass()
            r1.<init>()
            r1.f5418a = r2
            r1.f5419b = r3
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r3.<init>(r0)
            r1.f5420c = r3
            android.content.Context r2 = r2.f11620a
            java.lang.String r3 = "Hchat_selected_message_method_cache"
            android.content.SharedPreferences r2 = ub.b.c(r2, r3)
            r1.f5421d = r2
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            r1.f5422e = r2
            return
    }

    public static hb.t b(db.a r26, int r27) {
            r0 = r26
            r1 = r27
            int r2 = r0.f2166a
            r3 = 3
            r4 = 47
            r5 = 34
            r6 = 49
            r7 = 43
            r8 = 0
            r9 = 1
            if (r2 == 0) goto L2c
            if (r2 == r9) goto L2a
            r10 = 2
            if (r2 == r10) goto L28
            r10 = 4
            if (r2 == r10) goto L26
            r10 = 5
            if (r2 == r10) goto L24
            r10 = 6
            if (r2 == r10) goto L22
            goto L3d
        L22:
            r14 = r6
            goto L2d
        L24:
            r14 = r5
            goto L2d
        L26:
            r14 = r4
            goto L2d
        L28:
            r14 = r7
            goto L2d
        L2a:
            r14 = r3
            goto L2d
        L2c:
            r14 = r9
        L2d:
            java.lang.String r0 = r0.f2167b
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            boolean r2 = og.m.t0(r0)
            if (r2 == 0) goto L3e
        L3d:
            return r8
        L3e:
            long r20 = java.lang.System.currentTimeMillis()
            if (r14 == r3) goto L4d
            if (r14 == r7) goto L4d
            if (r14 != r4) goto L49
            goto L4d
        L49:
            r16 = r0
            r12 = r14
            goto L72
        L4d:
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            k8.t r11 = new k8.t
            long r3 = (long) r1
            long r17 = r20 + r3
            long r2 = r2.length()
            r12 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r4 <= 0) goto L63
            r2 = r12
        L63:
            int r2 = (int) r2
            r13 = 2
            r12 = r14
            java.lang.String r14 = ""
            java.lang.String r15 = ""
            r16 = r0
            r19 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r19)
            r8 = r11
        L72:
            hb.t r11 = new hb.t
            long r0 = (long) r1
            long r0 = r20 + r0
            java.lang.String r2 = ""
            if (r12 == r9) goto L82
            if (r12 == r6) goto L82
            r3 = r16
            r16 = r2
            goto L84
        L82:
            r3 = r16
        L84:
            if (r12 != r7) goto L89
            r17 = r3
            goto L8b
        L89:
            r17 = r2
        L8b:
            if (r12 != r5) goto L8e
            r2 = r3
        L8e:
            r24 = 0
            r25 = 1536(0x600, float:2.152E-42)
            java.lang.String r15 = ""
            r22 = 0
            r23 = 0
            r14 = r12
            r18 = r20
            r12 = r0
            r21 = r2
            r20 = r8
            r11.<init>(r12, r14, r15, r16, r17, r18, r20, r21, r22, r23, r24, r25)
            return r11
    }

    public static java.util.ArrayList c(java.util.ArrayList r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r5.size()
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
            r1 = 0
        Le:
            boolean r2 = r5.hasNext()
            r3 = 0
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r5.next()
            int r4 = r1 + 1
            if (r1 < 0) goto L2a
            db.a r2 = (db.a) r2
            hb.t r1 = b(r2, r1)
            if (r1 == 0) goto L35
            r0.add(r1)
            r1 = r4
            goto Le
        L2a:
            a.a.Q0()
            throw r3
        L2e:
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L35
            return r0
        L35:
            return r3
    }

    public static java.lang.String e(hb.t r4) {
            k8.t r0 = r4.f5470g
            r1 = 0
            if (r0 == 0) goto L8
            java.lang.String r0 = r0.f7477f
            goto L9
        L8:
            r0 = r1
        L9:
            java.lang.String r2 = ""
            if (r0 != 0) goto Le
            r0 = r2
        Le:
            java.lang.CharSequence r0 = og.m.R0(r0)
            java.lang.String r0 = r0.toString()
            boolean r3 = eh.a.y(r0)
            if (r3 != 0) goto L5b
            java.lang.String r3 = "[0-9a-fA-F]{32}"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
            r3.getClass()
            r0.getClass()
            java.util.regex.Matcher r3 = r3.matcher(r0)
            boolean r3 = r3.matches()
            if (r3 == 0) goto L33
            goto L5b
        L33:
            k8.t r0 = r4.f5470g
            if (r0 == 0) goto L39
            java.lang.String r1 = r0.f7474c
        L39:
            if (r1 != 0) goto L3c
            goto L3d
        L3c:
            r2 = r1
        L3d:
            boolean r0 = og.m.t0(r2)
            if (r0 == 0) goto L45
            java.lang.String r2 = r4.f5467d
        L45:
            l8.d r4 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r4.getClass()
            java.lang.String r4 = "md5"
            java.lang.String r0 = l8.d.m(r2, r4)
            boolean r1 = og.m.t0(r0)
            if (r1 == 0) goto L5b
            java.lang.String r4 = l8.d.o(r2, r4)
            return r4
        L5b:
            return r0
    }

    public static boolean h(hb.t r11, hb.g r12) {
            r11.getClass()
            java.lang.String r0 = r11.f5467d
            int r1 = r11.f5465b
            r2 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r2
            r2 = 62
            r3 = 49
            r4 = 47
            r5 = 43
            r6 = 34
            r7 = 3
            r8 = 0
            r9 = 1
            if (r1 == r9) goto L2d
            if (r1 == r7) goto L2d
            if (r1 == r6) goto L2d
            if (r1 == r5) goto L2d
            if (r1 == r4) goto L2d
            if (r1 == r3) goto L28
            if (r1 == r2) goto L2d
            r10 = r8
            goto L2e
        L28:
            boolean r10 = r11.b()
            goto L2e
        L2d:
            r10 = r9
        L2e:
            if (r10 != 0) goto L32
            goto La2
        L32:
            if (r1 == r9) goto La3
            if (r1 == r7) goto L82
            if (r1 == r6) goto L5f
            if (r1 == r5) goto L56
            if (r1 == r4) goto L47
            if (r1 == r3) goto L41
            if (r1 == r2) goto L56
            goto La2
        L41:
            boolean r11 = og.m.t0(r0)
        L45:
            r11 = r11 ^ r9
            return r11
        L47:
            hb.f r12 = r12.f5385i
            if (r12 == 0) goto La2
            java.lang.String r11 = e(r11)
            boolean r11 = og.m.t0(r11)
            if (r11 != 0) goto La2
            goto La1
        L56:
            java.lang.String r11 = p(r11)
            boolean r11 = og.m.t0(r11)
            goto L45
        L5f:
            java.io.File r12 = new java.io.File
            java.lang.String r11 = r11.f5471h
            r12.<init>(r11)
            boolean r11 = r12.isFile()
            if (r11 == 0) goto La2
            j8.p r11 = h.Hchat.hooks.api.core.WeChatApis.media()
            if (r11 == 0) goto L7e
            j8.y r11 = r11.f6816b
            if (r11 == 0) goto L7e
            boolean r11 = r11.a()
            if (r11 != r9) goto L7e
            r11 = r9
            goto L7f
        L7e:
            r11 = r8
        L7f:
            if (r11 == 0) goto La2
            goto La1
        L82:
            java.io.File r0 = new java.io.File
            k8.t r11 = r11.f5470g
            if (r11 == 0) goto L8b
            java.lang.String r11 = r11.f7477f
            goto L8c
        L8b:
            r11 = 0
        L8c:
            if (r11 != 0) goto L90
            java.lang.String r11 = ""
        L90:
            r0.<init>(r11)
            boolean r11 = r0.isFile()
            if (r11 == 0) goto La2
            java.lang.reflect.Method r11 = r12.f5381e
            if (r11 == 0) goto La2
            java.lang.Object r11 = r12.f5380d
            if (r11 == 0) goto La2
        La1:
            return r9
        La2:
            return r8
        La3:
            boolean r11 = og.m.t0(r0)
            goto L45
    }

    public static java.lang.String j(java.util.List r3) {
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L7
            goto L2f
        L7:
            java.util.Iterator r3 = r3.iterator()
        Lb:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r3.next()
            hb.t r0 = (hb.t) r0
            int r1 = r0.f5465b
            r2 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r2
            r2 = 47
            if (r1 != r2) goto L29
            c8.a r0 = k(r0)
            if (r0 != 0) goto L29
            r0 = 1
            goto L2a
        L29:
            r0 = 0
        L2a:
            if (r0 == 0) goto Lb
            java.lang.String r3 = "无法读取原生群发表情"
            return r3
        L2f:
            r3 = 0
            return r3
    }

    public static c8.a k(hb.t r10) {
            java.lang.String r10 = e(r10)
            boolean r0 = og.m.t0(r10)
            r1 = 0
            if (r0 == 0) goto Ld
            goto L118
        Ld:
            j8.p r0 = h.Hchat.hooks.api.core.WeChatApis.media()
            if (r0 == 0) goto L118
            j8.f r0 = r0.f6818d
            if (r0 == 0) goto L118
            boolean r2 = android.text.TextUtils.isEmpty(r10)
            if (r2 != 0) goto L118
            boolean r2 = r0.a()
            if (r2 != 0) goto L25
            goto L118
        L25:
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L4f
            r2.<init>(r10)     // Catch: java.lang.Throwable -> L4f
            boolean r3 = r2.isFile()     // Catch: java.lang.Throwable -> L4f
            if (r3 == 0) goto L52
            boolean r10 = r0.a()     // Catch: java.lang.Throwable -> L4f
            if (r10 != 0) goto L38
            goto L118
        L38:
            java.lang.String r10 = r0.e(r2)     // Catch: java.lang.Throwable -> L4f
            boolean r3 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> L4f
            if (r3 == 0) goto L44
            goto L118
        L44:
            java.lang.Object r3 = r0.g(r10)     // Catch: java.lang.Throwable -> L4f
            if (r3 != 0) goto L62
            java.lang.Object r3 = r0.n(r2, r10)     // Catch: java.lang.Throwable -> L4f
            goto L62
        L4f:
            r10 = move-exception
            goto L103
        L52:
            java.lang.String r10 = j8.f.k(r10)     // Catch: java.lang.Throwable -> L4f
            boolean r3 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> L4f
            if (r3 == 0) goto L5e
            goto L118
        L5e:
            java.lang.Object r3 = r0.g(r10)     // Catch: java.lang.Throwable -> L4f
        L62:
            if (r3 != 0) goto L66
            goto L118
        L66:
            java.lang.String r4 = "getMd5"
            java.lang.String r5 = "field_md5"
            java.lang.String r4 = j8.f.s(r3, r4, r5)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r5 = "getSize"
            java.lang.String r6 = "field_size"
            r7 = 0
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.invokeMethod(r3, r5, r8)     // Catch: java.lang.Throwable -> L4f
            boolean r8 = r5 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L4f
            if (r8 != 0) goto L81
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.readField(r3, r6)     // Catch: java.lang.Throwable -> L4f
        L81:
            boolean r6 = r5 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L4f
            if (r6 == 0) goto L8c
            java.lang.Number r5 = (java.lang.Number) r5     // Catch: java.lang.Throwable -> L4f
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> L4f
            goto L8d
        L8c:
            r5 = r7
        L8d:
            java.lang.String r6 = "getType"
            java.lang.String r8 = "field_type"
            java.lang.Object[] r9 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r6 = h.Hchat.utils.KavaReflector.invokeMethod(r3, r6, r9)     // Catch: java.lang.Throwable -> L4f
            boolean r9 = r6 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L4f
            if (r9 != 0) goto L9f
            java.lang.Object r6 = h.Hchat.utils.KavaReflector.readField(r3, r8)     // Catch: java.lang.Throwable -> L4f
        L9f:
            boolean r8 = r6 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L4f
            if (r8 == 0) goto Laa
            java.lang.Number r6 = (java.lang.Number) r6     // Catch: java.lang.Throwable -> L4f
            int r6 = r6.intValue()     // Catch: java.lang.Throwable -> L4f
            goto Lab
        Laa:
            r6 = r7
        Lab:
            java.lang.String r8 = "getContent"
            java.lang.String r9 = "field_content"
            java.lang.String r3 = j8.f.s(r3, r8, r9)     // Catch: java.lang.Throwable -> L4f
            boolean r8 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L4f
            if (r8 == 0) goto Lba
            goto Lbb
        Lba:
            r10 = r4
        Lbb:
            if (r5 > 0) goto Ldb
            boolean r4 = r2.isFile()     // Catch: java.lang.Throwable -> L4f
            if (r4 == 0) goto Ldb
            long r4 = r2.length()     // Catch: java.lang.Throwable -> L4f
            r8 = 0
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 > 0) goto Lce
            goto Lda
        Lce:
            r7 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r7 <= 0) goto Ld9
            r7 = 2147483647(0x7fffffff, float:NaN)
            goto Lda
        Ld9:
            int r7 = (int) r4     // Catch: java.lang.Throwable -> L4f
        Lda:
            r5 = r7
        Ldb:
            if (r6 > 0) goto Lf2
            boolean r4 = r2.isFile()     // Catch: java.lang.Throwable -> L4f
            if (r4 == 0) goto Lf2
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L4f
            boolean r2 = r0.h(r2)     // Catch: java.lang.Throwable -> L4f
            if (r2 == 0) goto Lf0
            r2 = 2
        Lee:
            r6 = r2
            goto Lf2
        Lf0:
            r2 = 1
            goto Lee
        Lf2:
            boolean r2 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Throwable -> L4f
            if (r2 != 0) goto L118
            if (r5 <= 0) goto L118
            if (r6 > 0) goto Lfd
            goto L118
        Lfd:
            c8.a r2 = new c8.a     // Catch: java.lang.Throwable -> L4f
            r2.<init>(r5, r10, r3, r6)     // Catch: java.lang.Throwable -> L4f
            return r2
        L103:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "准备群发表情异常: "
            r2.<init>(r3)
            java.lang.String r10 = r10.getMessage()
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            r0.j(r10)
        L118:
            return r1
    }

    public static java.lang.String p(hb.t r6) {
            k8.t r0 = r6.f5470g
            r1 = 0
            if (r0 == 0) goto L8
            java.lang.String r0 = r0.f7477f
            goto L9
        L8:
            r0 = r1
        L9:
            java.lang.String r2 = ""
            if (r0 != 0) goto Le
            r0 = r2
        Le:
            java.lang.String r6 = r6.f5468e
            java.lang.String[] r6 = new java.lang.String[]{r0, r6}
            java.util.List r6 = a.a.y0(r6)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r3 = tf.n.e1(r6)
            r0.<init>(r3)
            java.util.Iterator r6 = r6.iterator()
        L25:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L35
            java.lang.Object r3 = r6.next()
            java.lang.String r3 = (java.lang.String) r3
            j8.b.r(r3, r0)
            goto L25
        L35:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r0 = r0.iterator()
        L3e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L55
            java.lang.Object r3 = r0.next()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = og.m.t0(r4)
            if (r4 != 0) goto L3e
            r6.add(r3)
            goto L3e
        L55:
            java.util.Set r6 = tf.m.T1(r6)
            java.util.List r6 = tf.m.P1(r6)
            java.util.Iterator r0 = r6.iterator()
        L61:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L75
            java.lang.Object r3 = r0.next()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = eh.a.y(r4)
            if (r4 == 0) goto L61
            goto L76
        L75:
            r3 = r1
        L76:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto L87
            java.io.File r6 = new java.io.File
            r6.<init>(r3)
            java.lang.String r6 = r6.getAbsolutePath()
            r6.getClass()
            return r6
        L87:
            j8.p r0 = h.Hchat.hooks.api.core.WeChatApis.media()
            if (r0 == 0) goto L90
            bb.b r0 = r0.f6817c
            goto L91
        L90:
            r0 = r1
        L91:
            java.util.Iterator r3 = r6.iterator()
        L95:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Lb4
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            if (r0 == 0) goto Lb0
            java.lang.String r4 = r0.o(r4)
            if (r4 == 0) goto Lb0
            boolean r5 = og.m.t0(r4)
            if (r5 != 0) goto Lb0
            goto Lb1
        Lb0:
            r4 = r1
        Lb1:
            if (r4 == 0) goto L95
            r1 = r4
        Lb4:
            if (r1 == 0) goto Lb7
            return r1
        Lb7:
            java.lang.Object r6 = tf.m.v1(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto Lc0
            return r2
        Lc0:
            return r6
    }

    public static void q(java.lang.Object r1, java.lang.String r2, java.io.Serializable r3) {
            java.lang.Class r0 = r1.getClass()
            java.lang.reflect.Field r2 = h.Hchat.utils.KavaReflector.findFieldRecursive(r0, r2)
            if (r2 == 0) goto Ld
            h.Hchat.utils.KavaReflector.writeField(r2, r1, r3)
        Ld:
            return
    }

    public final void a(hb.i r5, boolean r6) {
            r4 = this;
            b9.c r0 = r4.f5426i
            android.os.Handler r1 = r4.f5420c
            if (r0 == 0) goto L9
            r1.removeCallbacks(r0)
        L9:
            r0 = 0
            r4.f5426i = r0
            java.util.ArrayList r0 = r5.f5395b
            int r2 = r5.f5398e
            java.lang.Object r0 = tf.m.w1(r2, r0)
            hb.j r0 = (hb.j) r0
            if (r6 == 0) goto L25
            if (r0 == 0) goto L25
            int r6 = r5.f5399f
            java.util.List r0 = r0.f5410b
            int r0 = r0.size()
            int r0 = r0 + r6
            r5.f5399f = r0
        L25:
            int r6 = r5.f5398e
            int r6 = r6 + 1
            r5.f5398e = r6
            hb.e r6 = new hb.e
            r0 = 1
            r6.<init>(r4, r5, r0)
            r2 = 500(0x1f4, double:2.47E-321)
            r1.postDelayed(r6, r2)
            return
    }

    public final hb.f d(hh.o r22) {
            r21 = this;
            r0 = r22
            sf.i r0 = r0.f5577s
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r0.next()
            hh.q r2 = (hh.q) r2
            hh.l r2 = r2.f5578a
            r1.add(r2)
            goto L13
        L25:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L2e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L55
            java.lang.Object r2 = r1.next()
            r3 = r2
            hh.l r3 = (hh.l) r3
            lh.b r3 = r3.p()
            java.lang.String r3 = r3.f8058g
            java.lang.Object r4 = r0.get(r3)
            if (r4 != 0) goto L4f
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.put(r3, r4)
        L4f:
            java.util.List r4 = (java.util.List) r4
            r4.add(r2)
            goto L2e
        L55:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L62:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L25d
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            r4 = r21
            r8.g r5 = r4.f5418a
            java.lang.ClassLoader r5 = r5.f11622c
            java.lang.Class r3 = h.Hchat.utils.KavaReflector.loadClass(r3, r5)
            if (r3 == 0) goto L255
            java.lang.String r6 = "toByteArray"
            r7 = 0
            java.lang.Class[] r8 = new java.lang.Class[r7]
            java.lang.reflect.Method r6 = h.Hchat.utils.KavaReflector.findMethodRecursive(r3, r6, r8)
            if (r6 == 0) goto L255
            java.lang.Class[] r8 = r6.getParameterTypes()
            r8.getClass()
            int r8 = r8.length
            r9 = 1
            if (r8 != 0) goto Laa
            java.lang.Class r8 = r6.getReturnType()
            java.lang.Class<byte[]> r10 = byte[].class
            boolean r8 = gg.l.a(r8, r10)
            if (r8 == 0) goto Laa
            r8 = r9
            goto Lab
        Laa:
            r8 = r7
        Lab:
            if (r8 == 0) goto Laf
            r12 = r6
            goto Lb0
        Laf:
            r12 = 0
        Lb0:
            if (r12 == 0) goto L255
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r2 = r2.iterator()
        Lc0:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto Ldd
            java.lang.Object r10 = r2.next()
            r11 = r10
            hh.l r11 = (hh.l) r11
            lh.b r11 = r11.p()
            java.lang.String r11 = r11.f8059h
            boolean r11 = r6.add(r11)
            if (r11 == 0) goto Lc0
            r8.add(r10)
            goto Lc0
        Ldd:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r6 = r8.iterator()
        Le6:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L102
            java.lang.Object r8 = r6.next()
            hh.l r8 = (hh.l) r8
            lh.b r8 = r8.p()
            java.lang.String r8 = r8.f8059h
            java.lang.reflect.Field r8 = h.Hchat.utils.KavaReflector.findFieldRecursive(r3, r8)
            if (r8 == 0) goto Le6
            r2.add(r8)
            goto Le6
        L102:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r8 = r2.iterator()
        L10b:
            boolean r10 = r8.hasNext()
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            if (r10 == 0) goto L128
            java.lang.Object r10 = r8.next()
            r13 = r10
            java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
            java.lang.Class r13 = r13.getType()
            boolean r11 = gg.l.a(r13, r11)
            if (r11 == 0) goto L10b
            r6.add(r10)
            goto L10b
        L128:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r10 = r2.iterator()
        L131:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L14e
            java.lang.Object r13 = r10.next()
            r14 = r13
            java.lang.reflect.Field r14 = (java.lang.reflect.Field) r14
            java.lang.Class r14 = r14.getType()
            java.lang.Class r15 = java.lang.Integer.TYPE
            boolean r14 = gg.l.a(r14, r15)
            if (r14 == 0) goto L131
            r8.add(r13)
            goto L131
        L14e:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r2 = r2.iterator()
        L157:
            boolean r13 = r2.hasNext()
            if (r13 == 0) goto L18b
            java.lang.Object r13 = r2.next()
            r14 = r13
            java.lang.reflect.Field r14 = (java.lang.reflect.Field) r14
            java.lang.Class r15 = r14.getType()
            boolean r15 = r15.isPrimitive()
            if (r15 != 0) goto L184
            java.lang.Class r15 = r14.getType()
            boolean r15 = gg.l.a(r15, r11)
            if (r15 != 0) goto L184
            java.lang.Class r14 = r14.getType()
            boolean r14 = r14.isArray()
            if (r14 != 0) goto L184
            r14 = r9
            goto L185
        L184:
            r14 = r7
        L185:
            if (r14 == 0) goto L157
            r10.add(r13)
            goto L157
        L18b:
            int r2 = r6.size()
            r11 = 2
            if (r2 != r11) goto L255
            int r2 = r8.size()
            r13 = 4
            if (r2 != r13) goto L255
            int r2 = r10.size()
            if (r2 == r9) goto L1a1
            goto L255
        L1a1:
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredConstructors(r3)
            java.util.Iterator r2 = r2.iterator()
            r3 = r7
            r13 = 0
        L1ab:
            boolean r14 = r2.hasNext()
            if (r14 == 0) goto L1ce
            java.lang.Object r14 = r2.next()
            r15 = r14
            java.lang.reflect.Constructor r15 = (java.lang.reflect.Constructor) r15
            java.lang.Class[] r15 = r15.getParameterTypes()
            r15.getClass()
            int r15 = r15.length
            if (r15 != 0) goto L1c4
            r15 = r9
            goto L1c5
        L1c4:
            r15 = r7
        L1c5:
            if (r15 == 0) goto L1ab
            if (r3 == 0) goto L1cb
        L1c9:
            r13 = 0
            goto L1d1
        L1cb:
            r3 = r9
            r13 = r14
            goto L1ab
        L1ce:
            if (r3 != 0) goto L1d1
            goto L1c9
        L1d1:
            java.lang.reflect.Constructor r13 = (java.lang.reflect.Constructor) r13
            if (r13 == 0) goto L255
            java.lang.Object r2 = r10.get(r7)
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            java.lang.Class r2 = r2.getType()
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredConstructors(r2)
            java.util.Iterator r2 = r2.iterator()
            r3 = r7
            r14 = 0
        L1e9:
            boolean r15 = r2.hasNext()
            if (r15 == 0) goto L20d
            java.lang.Object r15 = r2.next()
            r16 = r15
            java.lang.reflect.Constructor r16 = (java.lang.reflect.Constructor) r16
            java.lang.Class[] r5 = r16.getParameterTypes()
            r5.getClass()
            int r5 = r5.length
            if (r5 != 0) goto L203
            r5 = r9
            goto L204
        L203:
            r5 = r7
        L204:
            if (r5 == 0) goto L1e9
            if (r3 == 0) goto L20a
        L208:
            r14 = 0
            goto L210
        L20a:
            r3 = r9
            r14 = r15
            goto L1e9
        L20d:
            if (r3 != 0) goto L210
            goto L208
        L210:
            r17 = r14
            java.lang.reflect.Constructor r17 = (java.lang.reflect.Constructor) r17
            if (r17 == 0) goto L255
            hb.f r2 = new hb.f
            java.lang.Object r3 = r6.get(r7)
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.lang.Object r5 = r8.get(r7)
            r14 = r5
            java.lang.reflect.Field r14 = (java.lang.reflect.Field) r14
            java.lang.Object r5 = r8.get(r9)
            r15 = r5
            java.lang.reflect.Field r15 = (java.lang.reflect.Field) r15
            java.lang.Object r5 = r10.get(r7)
            r16 = r5
            java.lang.reflect.Field r16 = (java.lang.reflect.Field) r16
            java.lang.Object r5 = r8.get(r11)
            r18 = r5
            java.lang.reflect.Field r18 = (java.lang.reflect.Field) r18
            java.lang.Object r5 = r6.get(r9)
            r19 = r5
            java.lang.reflect.Field r19 = (java.lang.reflect.Field) r19
            r5 = 3
            java.lang.Object r5 = r8.get(r5)
            r20 = r5
            java.lang.reflect.Field r20 = (java.lang.reflect.Field) r20
            r10 = r2
            r11 = r13
            r13 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r5 = r10
            goto L256
        L255:
            r5 = 0
        L256:
            if (r5 == 0) goto L62
            r1.add(r5)
            goto L62
        L25d:
            r4 = r21
            java.lang.Object r0 = tf.m.I1(r1)
            hb.f r0 = (hb.f) r0
            return r0
    }

    public final hb.s f(java.util.List r22, java.util.List r23, fg.q r24) {
            r21 = this;
            r1 = r21
            hb.g r0 = r1.f5423f
            if (r0 == 0) goto L8
        L6:
            r3 = r0
            goto L15
        L8:
            hb.g r0 = r1.i()
            if (r0 == 0) goto L11
            r1.f5423f = r0
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L66
            goto L6
        L15:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r4 = tf.n.e1(r23)
            r0.<init>(r4)
            java.util.Iterator r4 = r23.iterator()
        L22:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L32
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            j8.b.r(r5, r0)
            goto L22
        L32:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L3b:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L52
            java.lang.Object r5 = r0.next()
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            boolean r6 = og.m.t0(r6)
            if (r6 != 0) goto L3b
            r4.add(r5)
            goto L3b
        L52:
            java.util.Set r0 = tf.m.T1(r4)
            java.util.List r4 = tf.m.P1(r0)
            boolean r0 = r22.isEmpty()
            if (r0 != 0) goto L66
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L6a
        L66:
            r17 = 0
            goto L2d1
        L6a:
            boolean r0 = r22.isEmpty()
            if (r0 == 0) goto L71
            goto L88
        L71:
            java.util.Iterator r0 = r22.iterator()
        L75:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L88
            java.lang.Object r5 = r0.next()
            hb.t r5 = (hb.t) r5
            boolean r5 = h(r5, r3)
            if (r5 != 0) goto L75
            goto L66
        L88:
            java.util.ArrayList r5 = new java.util.ArrayList
            int r0 = tf.n.e1(r22)
            r5.<init>(r0)
            java.util.Iterator r6 = r22.iterator()
        L95:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L20f
            java.lang.Object r0 = r6.next()
            r7 = r0
            hb.t r7 = (hb.t) r7
            int r0 = r7.f5465b
            r8 = 65535(0xffff, float:9.1834E-41)
            r8 = r8 & r0
            r9 = 47
            if (r8 != r9) goto Lb2
            c8.a r0 = k(r7)
            r10 = r0
            goto Lb3
        Lb2:
            r10 = 0
        Lb3:
            r11 = 34
            if (r8 != r11) goto L1f1
            java.io.File r0 = new java.io.File
            java.lang.String r12 = r7.f5471h
            int r13 = r7.f5472i
            r0.<init>(r12)
            boolean r0 = r0.isFile()
            if (r0 != 0) goto Lcb
        Lc6:
            r18 = r6
        Lc8:
            r14 = 0
            goto L1ee
        Lcb:
            j8.p r0 = h.Hchat.hooks.api.core.WeChatApis.media()
            if (r0 == 0) goto Lc6
            j8.y r12 = r0.f6816b
            if (r12 == 0) goto Lc6
            java.lang.String r0 = r7.f5473j
            boolean r14 = android.text.TextUtils.isEmpty(r0)
            if (r14 != 0) goto Lff
            h.Hchat.dexkit.DexFinder r14 = r12.f6841a
            java.lang.reflect.Method r14 = r14.voiceFullPathMethod
            if (r14 != 0) goto Le4
            goto Lff
        Le4:
            java.lang.String r14 = r12.q(r0)
            boolean r15 = android.text.TextUtils.isEmpty(r14)
            if (r15 != 0) goto Lff
            boolean r14 = eh.a.y(r14)
            if (r14 != 0) goto Lf5
            goto Lff
        Lf5:
            j8.x r14 = new j8.x
            int r15 = r12.i(r13)
            r14.<init>(r0, r15)
            goto L100
        Lff:
            r14 = 0
        L100:
            if (r14 == 0) goto L106
            r18 = r6
            goto L1ee
        L106:
            java.lang.String r0 = r7.f5471h
            java.lang.String r14 = "准备群发语音异常: "
            java.lang.String r15 = "准备群发语音失败: 复制语音文件失败 "
            boolean r16 = android.text.TextUtils.isEmpty(r0)
            if (r16 != 0) goto Lc6
            boolean r16 = r12.a()
            if (r16 != 0) goto L119
        L118:
            goto Lc6
        L119:
            java.io.File r11 = new java.io.File
            r11.<init>(r0)
            boolean r16 = r11.isFile()
            if (r16 != 0) goto L125
            goto L118
        L125:
            ac.k r11 = r12.p(r11)
            if (r11 == 0) goto L135
            java.lang.Object r9 = r11.f178i
            java.io.File r9 = (java.io.File) r9
            boolean r17 = r9.isFile()
            if (r17 != 0) goto L139
        L135:
            r18 = r6
            goto L1db
        L139:
            java.lang.String r2 = "masssendapp"
            r18 = r6
            java.lang.String r6 = r9.getAbsolutePath()     // Catch: java.lang.Throwable -> L168
            r19 = r13
            int r13 = r11.f177h     // Catch: java.lang.Throwable -> L168
            java.lang.String r6 = j8.y.x(r13, r6)     // Catch: java.lang.Throwable -> L168
            h.Hchat.dexkit.DexFinder r13 = r12.f6841a     // Catch: java.lang.Throwable -> L168
            java.lang.reflect.Method r13 = r13.voiceStartRecordMethod     // Catch: java.lang.Throwable -> L168
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r6}     // Catch: java.lang.Throwable -> L168
            r6 = 0
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invoke(r13, r6, r2)     // Catch: java.lang.Throwable -> L168
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L168
            boolean r6 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L168
            if (r6 == 0) goto L16a
            java.lang.String r0 = "准备群发语音失败: 创建voiceinfo失败"
            r12.m(r0)     // Catch: java.lang.Throwable -> L168
        L163:
            r11.i()
            goto Lc8
        L168:
            r0 = move-exception
            goto L1c2
        L16a:
            r6 = 1
            java.lang.String r13 = r12.k(r2, r6)     // Catch: java.lang.Throwable -> L168
            boolean r20 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Throwable -> L168
            if (r20 == 0) goto L17b
            java.lang.String r0 = "准备群发语音失败: 获取语音目标路径失败"
            r12.m(r0)     // Catch: java.lang.Throwable -> L168
            goto L163
        L17b:
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L168
            r6.<init>(r13)     // Catch: java.lang.Throwable -> L168
            boolean r6 = r12.e(r9, r6)     // Catch: java.lang.Throwable -> L168
            if (r6 != 0) goto L196
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L168
            r0.<init>(r15)     // Catch: java.lang.Throwable -> L168
            r0.append(r13)     // Catch: java.lang.Throwable -> L168
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L168
            r12.m(r0)     // Catch: java.lang.Throwable -> L168
            goto L163
        L196:
            if (r19 <= 0) goto L19c
            r13 = r19
        L19a:
            r0 = 1
            goto L1a1
        L19c:
            int r13 = j8.y.h(r0)     // Catch: java.lang.Throwable -> L168
            goto L19a
        L1a1:
            int r0 = java.lang.Math.max(r0, r13)     // Catch: java.lang.Throwable -> L168
            int r0 = r12.i(r0)     // Catch: java.lang.Throwable -> L168
            boolean r6 = r12.j(r0, r2)     // Catch: java.lang.Throwable -> L168
            if (r6 != 0) goto L1b5
            java.lang.String r0 = "准备群发语音失败: 完成voiceinfo失败"
            r12.m(r0)     // Catch: java.lang.Throwable -> L168
            goto L163
        L1b5:
            j8.x r6 = new j8.x     // Catch: java.lang.Throwable -> L168
            r6.<init>(r2, r0)     // Catch: java.lang.Throwable -> L168
            r11.i()
            r14 = r6
            goto L1ee
        L1bf:
            r0 = move-exception
            r18 = r6
        L1c2:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d6
            r2.<init>(r14)     // Catch: java.lang.Throwable -> L1d6
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L1d6
            r2.append(r0)     // Catch: java.lang.Throwable -> L1d6
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L1d6
            r12.m(r0)     // Catch: java.lang.Throwable -> L1d6
            goto L163
        L1d6:
            r0 = move-exception
            r11.i()
            throw r0
        L1db:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "准备群发语音失败: 音频转换失败 "
            r2.<init>(r6)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r12.m(r0)
            goto Lc8
        L1ee:
            r2 = 47
            goto L1f5
        L1f1:
            r18 = r6
            r2 = r9
            r14 = 0
        L1f5:
            if (r8 != r2) goto L1fb
            if (r10 != 0) goto L1fb
            goto L66
        L1fb:
            r2 = 34
            if (r8 != r2) goto L203
            if (r14 != 0) goto L203
            goto L66
        L203:
            hb.h r0 = new hb.h
            r0.<init>(r7, r10, r14)
            r5.add(r0)
            r6 = r18
            goto L95
        L20f:
            java.lang.reflect.Method r0 = r3.f5383g
            r2 = 0
            if (r0 == 0) goto L21c
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r7 = 0
            java.lang.Object r6 = h.Hchat.utils.KavaReflector.invoke(r0, r7, r6)
            goto L21d
        L21c:
            r6 = 0
        L21d:
            if (r6 == 0) goto L23d
            java.lang.reflect.Method r0 = r3.f5384h
            if (r0 == 0) goto L23d
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invoke(r0, r6, r2)
            boolean r2 = r0 instanceof java.lang.Number
            if (r2 == 0) goto L231
            r6 = r0
            java.lang.Number r6 = (java.lang.Number) r6
            goto L232
        L231:
            r6 = 0
        L232:
            if (r6 == 0) goto L23d
            int r0 = r6.intValue()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            goto L23e
        L23d:
            r6 = 0
        L23e:
            if (r6 == 0) goto L24f
            int r0 = r6.intValue()
            if (r0 <= 0) goto L247
            goto L248
        L247:
            r6 = 0
        L248:
            if (r6 == 0) goto L24f
            int r0 = r6.intValue()
            goto L251
        L24f:
            r0 = 500(0x1f4, float:7.0E-43)
        L251:
            java.util.ArrayList r0 = tf.m.n1(r0, r4)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L25e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L296
            java.lang.Object r3 = r0.next()
            java.util.List r3 = (java.util.List) r3
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = tf.n.e1(r5)
            r6.<init>(r7)
            java.util.Iterator r7 = r5.iterator()
        L277:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L292
            java.lang.Object r8 = r7.next()
            hb.h r8 = (hb.h) r8
            hb.j r9 = new hb.j
            hb.t r10 = r8.f5389a
            c8.a r11 = r8.f5390b
            j8.x r8 = r8.f5391c
            r9.<init>(r10, r3, r11, r8)
            r6.add(r9)
            goto L277
        L292:
            tf.r.h1(r2, r6)
            goto L25e
        L296:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L29e
            goto L66
        L29e:
            hb.i r0 = new hb.i
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r3 = r3.toString()
            r3.getClass()
            int r5 = r22.size()
            int r4 = r4.size()
            int r4 = r4 * r5
            r5 = r24
            r0.<init>(r3, r2, r4, r5)
            android.os.Handler r2 = r1.f5420c
            hb.e r3 = new hb.e
            r4 = 0
            r3.<init>(r1, r0, r4)
            r2.post(r3)
            hb.s r2 = new hb.s
            aa.c r3 = new aa.c
            r4 = 13
            r3.<init>(r1, r4, r0)
            r2.<init>(r3)
            return r2
        L2d1:
            return r17
    }

    public final boolean g() {
            r1 = this;
            hb.g r0 = r1.f5423f
            if (r0 == 0) goto La
            boolean r0 = r1.f5427j
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public final hb.g i() {
            r34 = this;
            r1 = r34
            r8.g r0 = r1.f5418a
            android.content.Context r2 = r0.f11620a
            org.luckypray.dexkit.DexKitBridge r3 = r0.f11623d
            java.lang.ClassLoader r4 = r0.f11622c
            java.lang.String r2 = e8.b.g(r2, r4)
            android.content.SharedPreferences r5 = r1.f5421d
            java.lang.String r6 = "official_mass_send_anchor_v1"
            java.lang.reflect.Method r0 = e8.b.c(r5, r2, r4, r6)
            r7 = 1
            java.lang.String r8 = ""
            java.lang.String r9 = "cache.key"
            tf.t r10 = tf.t.f13167g
            ab.b r11 = r1.f5419b
            if (r0 == 0) goto L2a
            hb.g r0 = r1.l(r0)
            if (r0 == 0) goto L2a
        L27:
            r6 = r0
            goto L146
        L2a:
            ch.e r0 = new ch.e     // Catch: java.lang.Throwable -> L72
            r0.<init>()     // Catch: java.lang.Throwable -> L72
            fh.k r13 = new fh.k     // Catch: java.lang.Throwable -> L72
            r13.<init>()     // Catch: java.lang.Throwable -> L72
            java.lang.String r14 = "MicroMsg.NetSceneMasSend"
            java.util.List r14 = a.a.x0(r14)     // Catch: java.lang.Throwable -> L72
            fh.k.u0(r13, r14)     // Catch: java.lang.Throwable -> L72
            r0.f1666h = r13     // Catch: java.lang.Throwable -> L72
            hh.p r0 = r3.findMethod(r0)     // Catch: java.lang.Throwable -> L72
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L72
            r13.<init>()     // Catch: java.lang.Throwable -> L72
            java.util.Iterator r14 = r0.iterator()     // Catch: java.lang.Throwable -> L72
        L4c:
            boolean r0 = r14.hasNext()     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L78
            java.lang.Object r0 = r14.next()     // Catch: java.lang.Throwable -> L72
            hh.o r0 = (hh.o) r0     // Catch: java.lang.Throwable -> L72
            java.lang.reflect.Method r0 = r0.r(r4)     // Catch: java.lang.Throwable -> L5d
            goto L64
        L5d:
            r0 = move-exception
            sf.f r15 = new sf.f     // Catch: java.lang.Throwable -> L72
            r15.<init>(r0)     // Catch: java.lang.Throwable -> L72
            r0 = r15
        L64:
            boolean r15 = r0 instanceof sf.f     // Catch: java.lang.Throwable -> L72
            if (r15 == 0) goto L6a
            r0 = 0
        L6a:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L72
            if (r0 == 0) goto L4c
            r13.add(r0)     // Catch: java.lang.Throwable -> L72
            goto L4c
        L72:
            r0 = move-exception
            sf.f r13 = new sf.f
            r13.<init>(r0)
        L78:
            java.lang.Throwable r0 = sf.g.b(r13)
            if (r0 == 0) goto L83
            java.lang.String r14 = "定位微信原生群发助手网络类失败"
            r11.invoke(r14, r0)
        L83:
            boolean r0 = r13 instanceof sf.f
            if (r0 == 0) goto L88
            r13 = r10
        L88:
            java.util.List r13 = (java.util.List) r13
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r13 = r13.iterator()
        L93:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto Lbc
            java.lang.Object r14 = r13.next()
            r15 = r14
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            java.lang.Class r15 = r15.getDeclaringClass()
            java.lang.Object r16 = r0.get(r15)
            if (r16 != 0) goto Lb4
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r0.put(r15, r12)
            r16 = r12
        Lb4:
            r12 = r16
            java.util.List r12 = (java.util.List) r12
            r12.add(r14)
            goto L93
        Lbc:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        Lc9:
            boolean r13 = r0.hasNext()
            if (r13 == 0) goto L106
            java.lang.Object r13 = r0.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r13 = r13.getValue()
            java.util.List r13 = (java.util.List) r13
            java.util.Iterator r14 = r13.iterator()
        Ldf:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto Lf2
            java.lang.Object r15 = r14.next()
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            hb.g r15 = r1.l(r15)
            if (r15 == 0) goto Ldf
            goto Lf3
        Lf2:
            r15 = 0
        Lf3:
            if (r15 == 0) goto Lff
            java.lang.Object r13 = tf.m.t1(r13)
            sf.e r14 = new sf.e
            r14.<init>(r13, r15)
            goto L100
        Lff:
            r14 = 0
        L100:
            if (r14 == 0) goto Lc9
            r12.add(r14)
            goto Lc9
        L106:
            java.lang.Object r0 = tf.m.I1(r12)
            sf.e r0 = (sf.e) r0
            if (r0 != 0) goto L139
            android.content.SharedPreferences$Editor r0 = r5.edit()     // Catch: java.lang.Throwable -> L12a
            java.lang.String r3 = r5.getString(r9, r8)     // Catch: java.lang.Throwable -> L12a
            boolean r3 = gg.l.a(r3, r2)     // Catch: java.lang.Throwable -> L12a
            if (r3 != 0) goto L123
            android.content.SharedPreferences$Editor r3 = r0.clear()     // Catch: java.lang.Throwable -> L12a
            r3.putString(r9, r2)     // Catch: java.lang.Throwable -> L12a
        L123:
            android.content.SharedPreferences$Editor r0 = r0.remove(r6)     // Catch: java.lang.Throwable -> L12a
            r0.apply()     // Catch: java.lang.Throwable -> L12a
        L12a:
            int r0 = r12.size()
            if (r0 <= r7) goto L137
            java.lang.String r0 = "微信原生群发助手网络类候选不唯一"
            r2 = 0
            r11.invoke(r0, r2)
            goto L138
        L137:
            r2 = 0
        L138:
            return r2
        L139:
            java.lang.Object r12 = r0.f12418g
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            e8.b.h(r5, r2, r6, r12)
            java.lang.Object r0 = r0.f12419h
            hb.g r0 = (hb.g) r0
            goto L27
        L146:
            java.lang.String r12 = "official_mass_send_emoji_callback_v1"
            java.lang.reflect.Method r0 = e8.b.c(r5, r2, r4, r12)
            java.lang.String r13 = "official_mass_send_emoji_spec_v1"
            if (r0 == 0) goto L301
            java.lang.String r0 = r5.getString(r13, r8)
            if (r0 != 0) goto L157
            r0 = r8
        L157:
            char[] r14 = new char[r7]
            r16 = 10
            r15 = 0
            r14[r15] = r16
            r7 = 6
            java.util.List r0 = og.m.F0(r0, r14, r7)
            int r14 = r0.size()
            r7 = 8
            if (r14 == r7) goto L171
        L16b:
            r19 = r10
        L16d:
            r23 = 0
            goto L2fb
        L171:
            java.lang.Object r7 = r0.get(r15)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Class r7 = h.Hchat.utils.KavaReflector.loadClass(r7, r4)
            if (r7 == 0) goto L16b
            java.util.List r14 = h.Hchat.utils.KavaReflector.declaredConstructors(r7)
            java.util.Iterator r14 = r14.iterator()
            r20 = r15
            r19 = 0
        L189:
            boolean r21 = r14.hasNext()
            if (r21 == 0) goto L1ae
            java.lang.Object r21 = r14.next()
            r22 = r21
            java.lang.reflect.Constructor r22 = (java.lang.reflect.Constructor) r22
            java.lang.Class[] r15 = r22.getParameterTypes()
            r15.getClass()
            int r15 = r15.length
            if (r15 != 0) goto L1ac
            if (r20 == 0) goto L1a6
        L1a3:
            r19 = 0
            goto L1b1
        L1a6:
            r19 = r21
            r15 = 0
            r20 = 1
            goto L189
        L1ac:
            r15 = 0
            goto L189
        L1ae:
            if (r20 != 0) goto L1b1
            goto L1a3
        L1b1:
            r24 = r19
            java.lang.reflect.Constructor r24 = (java.lang.reflect.Constructor) r24
            if (r24 == 0) goto L16b
            java.lang.String r14 = "toByteArray"
            r19 = r10
            r15 = 0
            java.lang.Class[] r10 = new java.lang.Class[r15]
            java.lang.reflect.Method r10 = h.Hchat.utils.KavaReflector.findMethodRecursive(r7, r14, r10)
            if (r10 == 0) goto L16d
            java.lang.Class[] r14 = r10.getParameterTypes()
            r14.getClass()
            int r14 = r14.length
            if (r14 != 0) goto L1dd
            java.lang.Class r14 = r10.getReturnType()
            java.lang.Class<byte[]> r15 = byte[].class
            boolean r14 = gg.l.a(r14, r15)
            if (r14 == 0) goto L1dd
            r25 = r10
            goto L1df
        L1dd:
            r25 = 0
        L1df:
            if (r25 == 0) goto L16d
            r10 = 1
            java.util.List r0 = tf.m.q1(r10, r0)
            java.util.ArrayList r10 = new java.util.ArrayList
            int r14 = tf.n.e1(r0)
            r10.<init>(r14)
            java.util.Iterator r0 = r0.iterator()
        L1f3:
            boolean r14 = r0.hasNext()
            if (r14 == 0) goto L209
            java.lang.Object r14 = r0.next()
            java.lang.String r14 = (java.lang.String) r14
            java.lang.reflect.Field r14 = h.Hchat.utils.KavaReflector.findFieldRecursive(r7, r14)
            if (r14 == 0) goto L16d
            r10.add(r14)
            goto L1f3
        L209:
            r15 = 0
            java.lang.Object r0 = r10.get(r15)
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            java.lang.Class r0 = r0.getType()
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            boolean r0 = gg.l.a(r0, r7)
            if (r0 == 0) goto L16d
            r14 = 1
            java.lang.Object r0 = r10.get(r14)
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            java.lang.Class r0 = r0.getType()
            java.lang.Class r14 = java.lang.Integer.TYPE
            boolean r0 = gg.l.a(r0, r14)
            if (r0 == 0) goto L16d
            r0 = 2
            java.lang.Object r15 = r10.get(r0)
            java.lang.reflect.Field r15 = (java.lang.reflect.Field) r15
            java.lang.Class r15 = r15.getType()
            boolean r15 = gg.l.a(r15, r14)
            if (r15 == 0) goto L16d
            r15 = 4
            java.lang.Object r20 = r10.get(r15)
            java.lang.reflect.Field r20 = (java.lang.reflect.Field) r20
            java.lang.Class r15 = r20.getType()
            boolean r15 = gg.l.a(r15, r14)
            if (r15 == 0) goto L16d
            r15 = 5
            java.lang.Object r20 = r10.get(r15)
            java.lang.reflect.Field r20 = (java.lang.reflect.Field) r20
            java.lang.Class r15 = r20.getType()
            boolean r7 = gg.l.a(r15, r7)
            if (r7 == 0) goto L16d
            r7 = 6
            java.lang.Object r15 = r10.get(r7)
            java.lang.reflect.Field r15 = (java.lang.reflect.Field) r15
            java.lang.Class r7 = r15.getType()
            boolean r7 = gg.l.a(r7, r14)
            if (r7 != 0) goto L275
            goto L16d
        L275:
            r7 = 3
            java.lang.Object r14 = r10.get(r7)
            java.lang.reflect.Field r14 = (java.lang.reflect.Field) r14
            java.lang.Class r14 = r14.getType()
            java.util.List r14 = h.Hchat.utils.KavaReflector.declaredConstructors(r14)
            java.util.Iterator r14 = r14.iterator()
            r15 = 0
            r20 = 0
        L28b:
            boolean r23 = r14.hasNext()
            if (r23 == 0) goto L2af
            java.lang.Object r23 = r14.next()
            r26 = r23
            java.lang.reflect.Constructor r26 = (java.lang.reflect.Constructor) r26
            java.lang.Class[] r7 = r26.getParameterTypes()
            r7.getClass()
            int r7 = r7.length
            if (r7 != 0) goto L2ad
            if (r20 == 0) goto L2a7
        L2a5:
            r15 = 0
            goto L2b2
        L2a7:
            r15 = r23
            r7 = 3
            r20 = 1
            goto L28b
        L2ad:
            r7 = 3
            goto L28b
        L2af:
            if (r20 != 0) goto L2b2
            goto L2a5
        L2b2:
            r30 = r15
            java.lang.reflect.Constructor r30 = (java.lang.reflect.Constructor) r30
            if (r30 == 0) goto L16d
            hb.f r23 = new hb.f
            r15 = 0
            java.lang.Object r7 = r10.get(r15)
            r26 = r7
            java.lang.reflect.Field r26 = (java.lang.reflect.Field) r26
            r14 = 1
            java.lang.Object r7 = r10.get(r14)
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            java.lang.Object r0 = r10.get(r0)
            r28 = r0
            java.lang.reflect.Field r28 = (java.lang.reflect.Field) r28
            r0 = 3
            java.lang.Object r0 = r10.get(r0)
            r29 = r0
            java.lang.reflect.Field r29 = (java.lang.reflect.Field) r29
            r0 = 4
            java.lang.Object r0 = r10.get(r0)
            r31 = r0
            java.lang.reflect.Field r31 = (java.lang.reflect.Field) r31
            r0 = 5
            java.lang.Object r0 = r10.get(r0)
            r32 = r0
            java.lang.reflect.Field r32 = (java.lang.reflect.Field) r32
            r0 = 6
            java.lang.Object r0 = r10.get(r0)
            r33 = r0
            java.lang.reflect.Field r33 = (java.lang.reflect.Field) r33
            r27 = r7
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
        L2fb:
            if (r23 == 0) goto L303
            r22 = r23
            goto L41c
        L301:
            r19 = r10
        L303:
            ch.e r0 = new ch.e     // Catch: java.lang.Throwable -> L356
            r0.<init>()     // Catch: java.lang.Throwable -> L356
            fh.k r7 = new fh.k     // Catch: java.lang.Throwable -> L356
            r7.<init>()     // Catch: java.lang.Throwable -> L356
            java.lang.String r10 = "MicroMsg.MassSendFooterEventImpl"
            java.util.List r10 = a.a.x0(r10)     // Catch: java.lang.Throwable -> L356
            fh.k.u0(r7, r10)     // Catch: java.lang.Throwable -> L356
            r0.f1666h = r7     // Catch: java.lang.Throwable -> L356
            hh.p r0 = r3.findMethod(r0)     // Catch: java.lang.Throwable -> L356
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L356
            r3.<init>()     // Catch: java.lang.Throwable -> L356
            java.util.Iterator r7 = r0.iterator()     // Catch: java.lang.Throwable -> L356
        L325:
            boolean r0 = r7.hasNext()     // Catch: java.lang.Throwable -> L356
            if (r0 == 0) goto L363
            java.lang.Object r0 = r7.next()     // Catch: java.lang.Throwable -> L356
            r10 = r0
            hh.o r10 = (hh.o) r10     // Catch: java.lang.Throwable -> L356
            java.lang.reflect.Method r0 = r10.r(r4)     // Catch: java.lang.Throwable -> L337
            goto L33e
        L337:
            r0 = move-exception
            sf.f r14 = new sf.f     // Catch: java.lang.Throwable -> L356
            r14.<init>(r0)     // Catch: java.lang.Throwable -> L356
            r0 = r14
        L33e:
            boolean r14 = r0 instanceof sf.f     // Catch: java.lang.Throwable -> L356
            if (r14 == 0) goto L344
            r0 = 0
        L344:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L356
            if (r0 == 0) goto L354
            hb.f r10 = r1.d(r10)     // Catch: java.lang.Throwable -> L356
            if (r10 == 0) goto L354
            sf.e r14 = new sf.e     // Catch: java.lang.Throwable -> L356
            r14.<init>(r0, r10)     // Catch: java.lang.Throwable -> L356
            goto L358
        L354:
            r14 = 0
            goto L358
        L356:
            r0 = move-exception
            goto L35e
        L358:
            if (r14 == 0) goto L325
            r3.add(r14)     // Catch: java.lang.Throwable -> L356
            goto L325
        L35e:
            sf.f r3 = new sf.f
            r3.<init>(r0)
        L363:
            java.lang.Throwable r0 = sf.g.b(r3)
            if (r0 == 0) goto L36e
            java.lang.String r4 = "定位微信原生群发表情协议失败"
            r11.invoke(r4, r0)
        L36e:
            boolean r0 = r3 instanceof sf.f
            if (r0 == 0) goto L375
            r10 = r19
            goto L376
        L375:
            r10 = r3
        L376:
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r0 = tf.m.I1(r10)
            sf.e r0 = (sf.e) r0
            if (r0 != 0) goto L3b9
            android.content.SharedPreferences$Editor r0 = r5.edit()     // Catch: java.lang.Throwable -> L39c
            java.lang.String r3 = r5.getString(r9, r8)     // Catch: java.lang.Throwable -> L39c
            boolean r3 = gg.l.a(r3, r2)     // Catch: java.lang.Throwable -> L39c
            if (r3 != 0) goto L395
            android.content.SharedPreferences$Editor r3 = r0.clear()     // Catch: java.lang.Throwable -> L39c
            r3.putString(r9, r2)     // Catch: java.lang.Throwable -> L39c
        L395:
            android.content.SharedPreferences$Editor r0 = r0.remove(r12)     // Catch: java.lang.Throwable -> L39c
            r0.apply()     // Catch: java.lang.Throwable -> L39c
        L39c:
            android.content.SharedPreferences$Editor r0 = r5.edit()
            android.content.SharedPreferences$Editor r0 = r0.remove(r13)
            r0.apply()
            int r0 = r10.size()
            r14 = 1
            if (r0 <= r14) goto L3b5
            java.lang.String r0 = "微信原生群发表情协议候选不唯一"
            r2 = 0
            r11.invoke(r0, r2)
            goto L3b6
        L3b5:
            r2 = 0
        L3b6:
            r22 = r2
            goto L41c
        L3b9:
            java.lang.Object r3 = r0.f12419h
            java.lang.Object r0 = r0.f12418g
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            e8.b.h(r5, r2, r12, r0)
            android.content.SharedPreferences$Editor r0 = r5.edit()
            r12 = r3
            hb.f r12 = (hb.f) r12
            java.lang.reflect.Constructor r2 = r12.f5362a
            java.lang.Class r2 = r2.getDeclaringClass()
            java.lang.String r14 = r2.getName()
            java.lang.reflect.Field r2 = r12.f5364c
            java.lang.String r15 = r2.getName()
            java.lang.reflect.Field r2 = r12.f5365d
            java.lang.String r16 = r2.getName()
            java.lang.reflect.Field r2 = r12.f5366e
            java.lang.String r17 = r2.getName()
            java.lang.reflect.Field r2 = r12.f5367f
            java.lang.String r18 = r2.getName()
            java.lang.reflect.Field r2 = r12.f5369h
            java.lang.String r19 = r2.getName()
            java.lang.reflect.Field r2 = r12.f5370i
            java.lang.String r20 = r2.getName()
            java.lang.reflect.Field r2 = r12.f5371j
            java.lang.String r21 = r2.getName()
            java.lang.String[] r2 = new java.lang.String[]{r14, r15, r16, r17, r18, r19, r20, r21}
            java.util.List r14 = a.a.y0(r2)
            r18 = 0
            r19 = 62
            java.lang.String r15 = "\n"
            r16 = 0
            r17 = 0
            java.lang.String r2 = tf.m.A1(r14, r15, r16, r17, r18, r19)
            android.content.SharedPreferences$Editor r0 = r0.putString(r13, r2)
            r0.apply()
            r22 = r12
        L41c:
            java.lang.reflect.Constructor r14 = r6.f5377a
            java.lang.reflect.Constructor r15 = r6.f5378b
            java.lang.reflect.Method r0 = r6.f5379c
            java.lang.Object r2 = r6.f5380d
            java.lang.reflect.Method r3 = r6.f5381e
            java.lang.String r4 = r6.f5382f
            java.lang.reflect.Method r5 = r6.f5383g
            java.lang.reflect.Method r6 = r6.f5384h
            hb.g r13 = new hb.g
            r16 = r0
            r17 = r2
            r18 = r3
            r19 = r4
            r20 = r5
            r21 = r6
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r13
    }

    public final hb.g l(java.lang.reflect.Method r22) {
            r21 = this;
            java.lang.Class r0 = r22.getDeclaringClass()
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredConstructors(r0)
            java.util.Iterator r1 = r1.iterator()
        Lc:
            boolean r2 = r1.hasNext()
            r3 = 2
            r4 = 3
            r5 = 46
            java.lang.String r6 = ""
            java.lang.Class r7 = java.lang.Integer.TYPE
            r8 = 1
            r9 = 0
            r10 = 0
            if (r2 == 0) goto L67
            java.lang.Object r2 = r1.next()
            r11 = r2
            java.lang.reflect.Constructor r11 = (java.lang.reflect.Constructor) r11
            java.lang.Class[] r12 = r11.getParameterTypes()
            int r13 = r12.length
            if (r13 != r4) goto L5b
            r13 = r12[r8]
            java.lang.Class r14 = java.lang.Boolean.TYPE
            boolean r13 = gg.l.a(r13, r14)
            if (r13 == 0) goto L5b
            r13 = r12[r3]
            boolean r13 = gg.l.a(r13, r7)
            if (r13 == 0) goto L5b
            r12 = r12[r9]
            java.lang.String r12 = r12.getName()
            java.lang.String r12 = og.m.O0(r12, r5, r6)
            java.lang.Class r11 = r11.getDeclaringClass()
            java.lang.String r11 = r11.getName()
            java.lang.String r11 = og.m.O0(r11, r5, r6)
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L5b
            r11 = r8
            goto L5c
        L5b:
            r11 = r9
        L5c:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto Lc
            goto L68
        L67:
            r2 = r10
        L68:
            r12 = r2
            java.lang.reflect.Constructor r12 = (java.lang.reflect.Constructor) r12
            if (r12 == 0) goto L316
            java.lang.Class[] r1 = r12.getParameterTypes()
            r1 = r1[r9]
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredConstructors(r1)
            java.util.Iterator r2 = r2.iterator()
        L7b:
            boolean r11 = r2.hasNext()
            if (r11 == 0) goto La0
            java.lang.Object r11 = r2.next()
            r13 = r11
            java.lang.reflect.Constructor r13 = (java.lang.reflect.Constructor) r13
            java.lang.Class[] r13 = r13.getParameterTypes()
            r13.getClass()
            int r13 = r13.length
            if (r13 != 0) goto L94
            r13 = r8
            goto L95
        L94:
            r13 = r9
        L95:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L7b
            goto La1
        La0:
            r11 = r10
        La1:
            r13 = r11
            java.lang.reflect.Constructor r13 = (java.lang.reflect.Constructor) r13
            if (r13 == 0) goto L316
            java.lang.String r2 = r0.getName()
            java.lang.String r2 = og.m.O0(r2, r5, r6)
            boolean r5 = og.m.t0(r2)
            if (r5 == 0) goto Lb5
            return r10
        Lb5:
            java.lang.String r5 = ".z"
            java.lang.String r5 = r2.concat(r5)
            r6 = r21
            r8.g r11 = r6.f5418a
            java.lang.ClassLoader r14 = r11.f11622c
            java.lang.Class r5 = h.Hchat.utils.KavaReflector.loadClass(r5, r14)
            java.lang.String r14 = ".k0"
            java.lang.String r14 = r2.concat(r14)
            java.lang.ClassLoader r15 = r11.f11622c
            java.lang.Class r14 = h.Hchat.utils.KavaReflector.loadClass(r14, r15)
            java.lang.String r15 = ".a0"
            java.lang.String r2 = r2.concat(r15)
            java.lang.ClassLoader r11 = r11.f11622c
            java.lang.Class r2 = h.Hchat.utils.KavaReflector.loadClass(r2, r11)
            if (r5 == 0) goto L139
            if (r14 == 0) goto L139
            java.util.List r11 = h.Hchat.utils.KavaReflector.declaredMethods(r14)
            java.util.Iterator r11 = r11.iterator()
        Le9:
            boolean r15 = r11.hasNext()
            if (r15 == 0) goto L128
            java.lang.Object r15 = r11.next()
            r16 = r15
            java.lang.reflect.Method r16 = (java.lang.reflect.Method) r16
            int r17 = r16.getModifiers()
            boolean r17 = java.lang.reflect.Modifier.isStatic(r17)
            r22 = r3
            if (r17 == 0) goto L119
            java.lang.Class[] r3 = r16.getParameterTypes()
            r3.getClass()
            int r3 = r3.length
            if (r3 != 0) goto L119
            java.lang.Class r3 = r16.getReturnType()
            boolean r3 = gg.l.a(r3, r5)
            if (r3 == 0) goto L119
            r3 = r8
            goto L11a
        L119:
            r3 = r9
        L11a:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L125
            goto L12b
        L125:
            r3 = r22
            goto Le9
        L128:
            r22 = r3
            r15 = r10
        L12b:
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            if (r15 == 0) goto L136
            java.lang.Object[] r3 = new java.lang.Object[r9]
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.invoke(r15, r10, r3)
            goto L137
        L136:
            r3 = r10
        L137:
            r15 = r3
            goto L13c
        L139:
            r22 = r3
            r15 = r10
        L13c:
            if (r2 == 0) goto L199
            if (r14 == 0) goto L199
            java.util.List r3 = h.Hchat.utils.KavaReflector.declaredMethods(r14)
            java.util.Iterator r3 = r3.iterator()
            r11 = r9
            r14 = r10
        L14a:
            boolean r16 = r3.hasNext()
            if (r16 == 0) goto L191
            java.lang.Object r16 = r3.next()
            r17 = r16
            java.lang.reflect.Method r17 = (java.lang.reflect.Method) r17
            int r18 = r17.getModifiers()
            boolean r18 = java.lang.reflect.Modifier.isStatic(r18)
            if (r18 == 0) goto L17a
            r18 = r4
            java.lang.Class[] r4 = r17.getParameterTypes()
            r4.getClass()
            int r4 = r4.length
            if (r4 != 0) goto L17c
            java.lang.Class r4 = r17.getReturnType()
            boolean r4 = gg.l.a(r4, r2)
            if (r4 == 0) goto L17c
            r4 = r8
            goto L17d
        L17a:
            r18 = r4
        L17c:
            r4 = r9
        L17d:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L18e
            if (r11 == 0) goto L18b
        L189:
            r14 = r10
            goto L196
        L18b:
            r11 = r8
            r14 = r16
        L18e:
            r4 = r18
            goto L14a
        L191:
            r18 = r4
            if (r11 != 0) goto L196
            goto L189
        L196:
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            goto L19c
        L199:
            r18 = r4
            r14 = r10
        L19c:
            if (r2 == 0) goto L1fc
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredMethods(r2)
            java.util.Iterator r2 = r2.iterator()
            r3 = r9
            r4 = r10
        L1a8:
            boolean r11 = r2.hasNext()
            if (r11 == 0) goto L1f2
            java.lang.Object r11 = r2.next()
            r16 = r11
            java.lang.reflect.Method r16 = (java.lang.reflect.Method) r16
            int r17 = r16.getModifiers()
            boolean r17 = java.lang.reflect.Modifier.isStatic(r17)
            if (r17 != 0) goto L1d9
            r17 = r8
            java.lang.Class[] r8 = r16.getParameterTypes()
            r8.getClass()
            int r8 = r8.length
            if (r8 != 0) goto L1db
            java.lang.Class r8 = r16.getReturnType()
            boolean r8 = gg.l.a(r8, r7)
            if (r8 == 0) goto L1db
            r8 = r17
            goto L1dc
        L1d9:
            r17 = r8
        L1db:
            r8 = r9
        L1dc:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L1ef
            if (r3 == 0) goto L1ea
        L1e8:
            r4 = r10
            goto L1f7
        L1ea:
            r4 = r11
            r3 = r17
            r8 = r3
            goto L1a8
        L1ef:
            r8 = r17
            goto L1a8
        L1f2:
            r17 = r8
            if (r3 != 0) goto L1f7
            goto L1e8
        L1f7:
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            r19 = r4
            goto L200
        L1fc:
            r17 = r8
            r19 = r10
        L200:
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r5 == 0) goto L27c
            java.util.List r3 = h.Hchat.utils.KavaReflector.declaredMethods(r5)
            java.util.Iterator r3 = r3.iterator()
            r4 = r9
            r5 = r10
        L20e:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L272
            java.lang.Object r8 = r3.next()
            r11 = r8
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            r16 = r9
            java.lang.Class[] r9 = r11.getParameterTypes()
            java.lang.Class r11 = r11.getReturnType()
            boolean r11 = gg.l.a(r11, r1)
            if (r11 == 0) goto L254
            int r11 = r9.length
            r20 = r10
            r10 = 4
            if (r11 != r10) goto L256
            r10 = r9[r16]
            boolean r10 = gg.l.a(r10, r2)
            if (r10 == 0) goto L256
            r10 = r9[r17]
            boolean r10 = gg.l.a(r10, r2)
            if (r10 == 0) goto L256
            r10 = r9[r22]
            boolean r10 = gg.l.a(r10, r7)
            if (r10 == 0) goto L256
            r9 = r9[r18]
            boolean r9 = gg.l.a(r9, r7)
            if (r9 == 0) goto L256
            r9 = r17
            goto L258
        L254:
            r20 = r10
        L256:
            r9 = r16
        L258:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L26f
            if (r4 == 0) goto L267
        L264:
            r5 = r20
            goto L279
        L267:
            r5 = r8
            r9 = r16
            r4 = r17
        L26c:
            r10 = r20
            goto L20e
        L26f:
            r9 = r16
            goto L26c
        L272:
            r16 = r9
            r20 = r10
            if (r4 != 0) goto L279
            goto L264
        L279:
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            goto L282
        L27c:
            r16 = r9
            r20 = r10
            r5 = r20
        L282:
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredMethods(r0)
            java.util.Iterator r0 = r0.iterator()
            r3 = r16
            r4 = r20
        L28e:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L2d3
            java.lang.Object r7 = r0.next()
            r8 = r7
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            java.lang.String r9 = r8.getName()
            java.lang.String r10 = "onGYNetEnd"
            boolean r9 = gg.l.a(r9, r10)
            if (r9 == 0) goto L2be
            java.lang.Class r9 = r8.getReturnType()
            java.lang.Class r10 = java.lang.Void.TYPE
            boolean r9 = gg.l.a(r9, r10)
            if (r9 == 0) goto L2be
            java.lang.Class[] r8 = r8.getParameterTypes()
            int r8 = r8.length
            r9 = 6
            if (r8 != r9) goto L2be
            r8 = r17
            goto L2c0
        L2be:
            r8 = r16
        L2c0:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L28e
            if (r3 == 0) goto L2cf
        L2cc:
            r4 = r20
            goto L2d6
        L2cf:
            r4 = r7
            r3 = r17
            goto L28e
        L2d3:
            if (r3 != 0) goto L2d6
            goto L2cc
        L2d6:
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            if (r4 == 0) goto L315
            java.lang.String r0 = "j"
            java.lang.reflect.Field r3 = h.Hchat.utils.KavaReflector.findFieldRecursive(r1, r0)
            if (r3 == 0) goto L2e7
            java.lang.Class r3 = r3.getType()
            goto L2e9
        L2e7:
            r3 = r20
        L2e9:
            boolean r3 = gg.l.a(r3, r2)
            if (r3 == 0) goto L2f2
        L2ef:
            r17 = r0
            goto L308
        L2f2:
            java.lang.String r0 = "m"
            java.lang.reflect.Field r1 = h.Hchat.utils.KavaReflector.findFieldRecursive(r1, r0)
            if (r1 == 0) goto L2ff
            java.lang.Class r1 = r1.getType()
            goto L301
        L2ff:
            r1 = r20
        L301:
            boolean r1 = gg.l.a(r1, r2)
            if (r1 == 0) goto L315
            goto L2ef
        L308:
            hb.g r11 = new hb.g
            r20 = 0
            r16 = r5
            r18 = r14
            r14 = r4
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r11
        L315:
            return r20
        L316:
            r6 = r21
            r20 = r10
            return r20
    }

    public final void m(hb.i r23) {
            r22 = this;
            r1 = r22
            r4 = r23
            hb.i r0 = r1.f5424g
            if (r0 == r4) goto L9
            return
        L9:
            int r0 = r4.f5398e
            java.util.ArrayList r2 = r4.f5395b
            int r2 = r2.size()
            r3 = 0
            if (r0 < r2) goto L31
            int r0 = r4.f5399f
            int r2 = r4.f5396c
            fg.q r4 = r4.f5397d
            r1.f5424g = r3
            r1.f5425h = r3
            if (r4 == 0) goto L2d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r4.b(r0, r2, r3)
        L2d:
            r1.n()
            return
        L31:
            hb.g r0 = r1.f5423f
            r2 = 0
            if (r0 != 0) goto L3a
            r1.a(r4, r2)
            return
        L3a:
            java.util.ArrayList r5 = r4.f5395b
            int r6 = r4.f5398e
            java.lang.Object r5 = r5.get(r6)
            hb.j r5 = (hb.j) r5
            java.util.List r6 = r5.f5410b
            r10 = 0
            r11 = 62
            java.lang.String r7 = ";"
            r8 = 0
            r9 = 0
            java.lang.String r6 = tf.m.A1(r6, r7, r8, r9, r10, r11)
            hb.t r7 = r5.f5409a
            java.util.List r8 = r5.f5410b
            int r8 = r8.size()
            c8.a r9 = r5.f5411c
            j8.x r10 = r5.f5412d
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            int r12 = r7.f5465b
            k8.t r13 = r7.f5470g
            r14 = 65535(0xffff, float:9.1834E-41)
            r12 = r12 & r14
            r16 = r14
            r3 = 3
            r18 = 1
            java.lang.String r14 = ""
            if (r12 != r3) goto L9f
            java.lang.Object r7 = r0.f5380d
            if (r7 == 0) goto L98
            if (r13 == 0) goto L7b
            java.lang.String r9 = r13.f7477f
            goto L7c
        L7b:
            r9 = 0
        L7c:
            if (r9 != 0) goto L7f
            goto L80
        L7f:
            r14 = r9
        L80:
            java.lang.reflect.Method r9 = r0.f5381e
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r18)
            java.lang.Object[] r6 = new java.lang.Object[]{r14, r6, r8, r10}
            java.lang.Object r6 = h.Hchat.utils.KavaReflector.invoke(r9, r7, r6)
            r21 = r5
            r4 = 62
            goto L21c
        L98:
            r21 = r5
        L9a:
            r4 = 62
            r6 = 0
            goto L21c
        L9f:
            java.lang.reflect.Constructor r3 = r0.f5378b
            java.lang.Object[] r15 = new java.lang.Object[r2]
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.newInstance(r3, r15)
            if (r3 == 0) goto L98
            r15 = 47
            if (r12 != r15) goto L118
            hb.f r15 = r0.f5385i
            if (r15 == 0) goto L98
            if (r9 == 0) goto L98
            r20 = r8
            java.lang.reflect.Constructor r8 = r15.f5362a
            r21 = r5
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.newInstance(r8, r5)
            if (r5 == 0) goto L112
            java.lang.reflect.Constructor r8 = r15.f5368g
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.newInstance(r8, r1)
            if (r1 == 0) goto L112
            java.lang.reflect.Field r8 = r15.f5364c
            java.lang.Object r2 = r9.f1055d
            java.lang.String r2 = (java.lang.String) r2
            h.Hchat.utils.KavaReflector.writeField(r8, r5, r2)
            java.lang.reflect.Field r2 = r15.f5365d
            h.Hchat.utils.KavaReflector.writeField(r2, r5, r11)
            java.lang.reflect.Field r2 = r15.f5366e
            int r8 = r9.f1053b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            h.Hchat.utils.KavaReflector.writeField(r2, r5, r8)
            java.lang.reflect.Field r2 = r15.f5367f
            h.Hchat.utils.KavaReflector.writeField(r2, r5, r1)
            java.lang.reflect.Field r1 = r15.f5369h
            int r2 = r9.f1054c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            h.Hchat.utils.KavaReflector.writeField(r1, r5, r2)
            java.lang.reflect.Field r1 = r15.f5370i
            java.lang.Object r2 = r9.f1056e
            java.lang.String r2 = (java.lang.String) r2
            h.Hchat.utils.KavaReflector.writeField(r1, r5, r2)
            java.lang.reflect.Field r1 = r15.f5371j
            h.Hchat.utils.KavaReflector.writeField(r1, r5, r11)
            java.lang.reflect.Method r1 = r15.f5363b
            r2 = 0
            java.lang.Object[] r8 = new java.lang.Object[r2]
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invoke(r1, r5, r8)
            boolean r2 = r1 instanceof byte[]
            if (r2 == 0) goto L112
            byte[] r1 = (byte[]) r1
            goto L113
        L112:
            r1 = 0
        L113:
            if (r1 == 0) goto L9a
        L115:
            r2 = 34
            goto L11e
        L118:
            r21 = r5
            r20 = r8
            r1 = 0
            goto L115
        L11e:
            if (r12 == r2) goto L14f
            r2 = 43
            if (r12 == r2) goto L14a
            r2 = 47
            if (r12 == r2) goto L13e
            r2 = 62
            if (r12 == r2) goto L14a
            if (r13 == 0) goto L131
            java.lang.String r2 = r13.f7474c
            goto L132
        L131:
            r2 = 0
        L132:
            if (r2 != 0) goto L135
            r2 = r14
        L135:
            boolean r5 = og.m.t0(r2)
            if (r5 == 0) goto L158
            java.lang.String r2 = r7.f5467d
            goto L158
        L13e:
            if (r9 == 0) goto L145
            java.lang.Object r2 = r9.f1055d
            java.lang.String r2 = (java.lang.String) r2
            goto L146
        L145:
            r2 = 0
        L146:
            if (r2 != 0) goto L158
        L148:
            r2 = r14
            goto L158
        L14a:
            java.lang.String r2 = p(r7)
            goto L158
        L14f:
            if (r10 == 0) goto L154
            java.lang.String r2 = r10.f6839b
            goto L155
        L154:
            r2 = 0
        L155:
            if (r2 != 0) goto L158
            goto L148
        L158:
            long r8 = java.lang.System.currentTimeMillis()
            long r4 = r7.f5464a
            java.lang.String r7 = "Hchat_"
            java.lang.String r13 = "_"
            java.lang.StringBuilder r7 = p.a.o(r8, r7, r13)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            java.lang.String r5 = "d"
            q(r3, r5, r4)
            r4 = 104(0x68, float:1.46E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "e"
            q(r3, r5, r4)
            java.lang.String r4 = "f"
            java.lang.Long r5 = java.lang.Long.valueOf(r8)
            q(r3, r4, r5)
            r4 = 0
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "g"
            q(r3, r5, r4)
            java.lang.String r4 = "h"
            q(r3, r4, r2)
            java.lang.String r4 = "i"
            q(r3, r4, r14)
            java.lang.String r4 = r0.f5382f
            q(r3, r4, r6)
            java.lang.String r4 = "n"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r20)
            q(r3, r4, r5)
            r4 = 62
            if (r12 != r4) goto L1b0
            r5 = 43
            goto L1b1
        L1b0:
            r5 = r12
        L1b1:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "o"
            q(r3, r6, r5)
            r5 = 34
            if (r12 != r5) goto L1c3
            if (r10 == 0) goto L1c3
            int r5 = r10.f6838a
            goto L1c4
        L1c3:
            r5 = 0
        L1c4:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r6 = "p"
            q(r3, r6, r5)
            java.lang.String r5 = "q"
            q(r3, r5, r11)
            if (r1 == 0) goto L1d6
            int r2 = r1.length
            goto L1e3
        L1d6:
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8
            r5.getClass()
            byte[] r2 = r2.getBytes(r5)
            r2.getClass()
            int r2 = r2.length
        L1e3:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r5 = "r"
            q(r3, r5, r2)
            java.lang.String r2 = "s"
            q(r3, r2, r11)
            java.lang.String r2 = "t"
            q(r3, r2, r11)
            java.lang.String r2 = "u"
            q(r3, r2, r11)
            java.lang.String r2 = "v"
            q(r3, r2, r11)
            java.lang.String r2 = "w"
            q(r3, r2, r14)
            java.lang.String r2 = "x"
            q(r3, r2, r14)
            if (r1 == 0) goto L211
            java.lang.String r2 = "y"
            q(r3, r2, r1)
        L211:
            r1 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "z"
            q(r3, r2, r1)
            r6 = r3
        L21c:
            if (r6 != 0) goto L227
            r2 = 0
            r1 = r22
            r4 = r23
            r1.a(r4, r2)
            return
        L227:
            r1 = r22
            r17 = r4
            r3 = r21
            r4 = r23
            hb.t r2 = r3.f5409a
            int r2 = r2.f5465b
            r2 = r2 & r16
            r5 = 3
            if (r2 != r5) goto L23b
            r2 = r18
            goto L23c
        L23b:
            r2 = 0
        L23c:
            java.lang.reflect.Constructor r0 = r0.f5377a
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r6, r7, r2}
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.newInstance(r0, r2)
            if (r2 != 0) goto L253
            r6 = 0
            r1.a(r4, r6)
            return
        L253:
            r1.f5425h = r2
            m8.a r0 = h.Hchat.hooks.api.core.WeChatApis.network()     // Catch: java.lang.Throwable -> L26d
            if (r0 == 0) goto L267
            m8.c r0 = r0.f8777a     // Catch: java.lang.Throwable -> L26d
            boolean r0 = r0.j(r2)     // Catch: java.lang.Throwable -> L26d
            r6 = r18
            if (r0 != r6) goto L267
            r14 = r6
            goto L268
        L267:
            r14 = 0
        L268:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r14)     // Catch: java.lang.Throwable -> L26d
            goto L274
        L26d:
            r0 = move-exception
            sf.f r6 = new sf.f
            r6.<init>(r0)
            r0 = r6
        L274:
            java.lang.Throwable r6 = sf.g.b(r0)
            if (r6 == 0) goto L281
            ab.b r7 = r1.f5419b
            java.lang.String r8 = "微信原生群发助手派发失败"
            r7.invoke(r8, r6)
        L281:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            boolean r7 = r0 instanceof sf.f
            if (r7 == 0) goto L288
            r0 = r6
        L288:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L298
            r6 = 0
            r1.f5425h = r6
            r2 = 0
            r1.a(r4, r2)
            return
        L298:
            b9.c r0 = new b9.c
            r19 = r5
            r5 = 5
            r6 = r17
            r7 = r19
            r0.<init>(r1, r2, r3, r4, r5)
            android.os.Handler r2 = r1.f5420c
            hb.t r3 = r3.f5409a
            int r3 = r3.f5465b
            r3 = r3 & r16
            if (r3 == r7) goto L2c3
            r5 = 34
            if (r3 == r5) goto L2bf
            r4 = 43
            if (r3 == r4) goto L2bb
            if (r3 == r6) goto L2bb
            r3 = 30000(0x7530, double:1.4822E-319)
            goto L2c6
        L2bb:
            r3 = 300000(0x493e0, double:1.482197E-318)
            goto L2c6
        L2bf:
            r3 = 90000(0x15f90, double:4.4466E-319)
            goto L2c6
        L2c3:
            r3 = 120000(0x1d4c0, double:5.9288E-319)
        L2c6:
            r2.postDelayed(r0, r3)
            r1.f5426i = r0
            return
    }

    public final void n() {
            r1 = this;
            hb.i r0 = r1.f5424g
            if (r0 == 0) goto L5
            return
        L5:
            java.util.ArrayDeque r0 = r1.f5422e
            java.lang.Object r0 = r0.pollFirst()
            hb.i r0 = (hb.i) r0
            r1.f5424g = r0
            if (r0 == 0) goto L14
            r1.m(r0)
        L14:
            return
    }

    public final java.util.List o(java.util.List r5) {
            r4 = this;
            hb.g r0 = r4.f5423f
            if (r0 == 0) goto L4e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r5 = r5.iterator()
        Ld:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r5.next()
            r3 = r2
            hb.t r3 = (hb.t) r3
            boolean r3 = h(r3, r0)
            if (r3 != 0) goto Ld
            r1.add(r2)
            goto Ld
        L24:
            java.util.ArrayList r5 = new java.util.ArrayList
            int r0 = tf.n.e1(r1)
            r5.<init>(r0)
            java.util.Iterator r0 = r1.iterator()
        L31:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L45
            java.lang.Object r1 = r0.next()
            hb.t r1 = (hb.t) r1
            java.lang.String r1 = r1.c()
            r5.add(r1)
            goto L31
        L45:
            java.util.Set r5 = tf.m.T1(r5)
            java.util.List r5 = tf.m.P1(r5)
            return r5
        L4e:
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = tf.n.e1(r5)
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L5b:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L6f
            java.lang.Object r1 = r5.next()
            hb.t r1 = (hb.t) r1
            java.lang.String r1 = r1.c()
            r0.add(r1)
            goto L5b
        L6f:
            java.util.Set r5 = tf.m.T1(r0)
            java.util.List r5 = tf.m.P1(r5)
            return r5
    }
}
