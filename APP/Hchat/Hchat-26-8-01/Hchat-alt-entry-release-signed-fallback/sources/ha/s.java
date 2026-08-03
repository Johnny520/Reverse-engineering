package ha;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final og.k f5270i = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r8.g f5271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ab.b f5272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.content.SharedPreferences f5273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.content.SharedPreferences f5274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f5275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f5276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f5277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.ThreadLocal f5278h;

    static {
            og.k r0 = new og.k
            java.lang.String r1 = "\\$\\{(?:originalText|time|type|snsId|userName)\\}"
            r0.<init>(r1)
            ha.s.f5270i = r0
            return
    }

    public s(r8.g r1, ab.b r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f5271a = r1
            r0.f5272b = r2
            android.content.Context r1 = r1.f11620a
            java.lang.String r2 = "Hchat_moments_bottom_detail_config"
            android.content.SharedPreferences r2 = ub.b.c(r1, r2)
            r0.f5273c = r2
            java.lang.String r2 = "Hchat_moments_bottom_detail_method_cache"
            android.content.SharedPreferences r1 = ub.b.c(r1, r2)
            r0.f5274d = r1
            ha.p r1 = new ha.p
            r2 = 0
            r1.<init>(r2)
            java.lang.ThreadLocal r1 = java.lang.ThreadLocal.withInitial(r1)
            r0.f5278h = r1
            return
    }

    public static final java.lang.String a(ha.s r11, java.lang.Object r12, java.lang.String r13) {
            android.content.SharedPreferences r11 = r11.f5273c
            if (r12 != 0) goto L6
            goto L10a
        L6:
            java.lang.String r0 = "field_snsId"
            java.lang.Long r0 = o(r12, r0)
            if (r0 == 0) goto L10a
            long r0 = r0.longValue()
            java.lang.String r2 = "field_userName"
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r12, r2)
            if (r2 == 0) goto L1f
            java.lang.String r2 = r2.toString()
            goto L20
        L1f:
            r2 = 0
        L20:
            java.lang.String r3 = ""
            if (r2 != 0) goto L25
            r2 = r3
        L25:
            java.lang.String r4 = "field_createTime"
            java.lang.Long r4 = o(r12, r4)
            r5 = 0
            if (r4 == 0) goto L34
            long r7 = r4.longValue()
            goto L35
        L34:
            r7 = r5
        L35:
            java.lang.String r4 = "field_type"
            java.lang.Long r12 = o(r12, r4)
            if (r12 == 0) goto L43
            long r9 = r12.longValue()
            int r12 = (int) r9
            goto L44
        L43:
            r12 = 0
        L44:
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 > 0) goto L4a
            r4 = r13
            goto L91
        L4a:
            java.lang.String r4 = "moments_bottom_detail_time_format"
            java.lang.String r5 = "yyyy-MM-dd HH:mm:ss"
            java.lang.String r4 = r11.getString(r4, r5)
            if (r4 != 0) goto L55
            r4 = r3
        L55:
            java.lang.CharSequence r4 = og.m.R0(r4)
            java.lang.String r4 = r4.toString()
            boolean r6 = og.m.t0(r4)
            if (r6 == 0) goto L64
            goto L65
        L64:
            r5 = r4
        L65:
            java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L80
            java.util.Locale r6 = java.util.Locale.CHINA     // Catch: java.lang.Throwable -> L80
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L80
            java.util.TimeZone r5 = java.util.TimeZone.getDefault()     // Catch: java.lang.Throwable -> L80
            r4.setTimeZone(r5)     // Catch: java.lang.Throwable -> L80
            java.util.Date r5 = new java.util.Date     // Catch: java.lang.Throwable -> L80
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r9
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L80
            java.lang.String r4 = r4.format(r5)     // Catch: java.lang.Throwable -> L80
            goto L87
        L80:
            r4 = move-exception
            sf.f r5 = new sf.f
            r5.<init>(r4)
            r4 = r5
        L87:
            java.lang.Throwable r5 = sf.g.b(r4)
            if (r5 != 0) goto L8e
            goto L8f
        L8e:
            r4 = r13
        L8f:
            java.lang.String r4 = (java.lang.String) r4
        L91:
            sf.e r5 = new sf.e
            java.lang.String r6 = "${originalText}"
            r5.<init>(r6, r13)
            sf.e r13 = new sf.e
            java.lang.String r6 = "${time}"
            r13.<init>(r6, r4)
            a2.a r4 = ha.d0.f5186h
            r4.getClass()
            r4 = 1
            if (r12 == r4) goto Lbb
            r4 = 2
            if (r12 == r4) goto Lb8
            r4 = 15
            if (r12 == r4) goto Lb5
            r4 = 54
            if (r12 == r4) goto Lbb
            ha.d0 r12 = ha.d0.f5190l
            goto Lbd
        Lb5:
            ha.d0 r12 = ha.d0.f5189k
            goto Lbd
        Lb8:
            ha.d0 r12 = ha.d0.f5187i
            goto Lbd
        Lbb:
            ha.d0 r12 = ha.d0.f5188j
        Lbd:
            java.lang.String r12 = r12.f5192g
            sf.e r4 = new sf.e
            java.lang.String r6 = "${type}"
            r4.<init>(r6, r12)
            java.lang.String r12 = java.lang.Long.toUnsignedString(r0)
            sf.e r0 = new sf.e
            java.lang.String r1 = "${snsId}"
            r0.<init>(r1, r12)
            sf.e r12 = new sf.e
            java.lang.String r1 = "${userName}"
            r12.<init>(r1, r2)
            sf.e[] r12 = new sf.e[]{r5, r13, r4, r0, r12}
            java.util.Map r12 = tf.y.b0(r12)
            java.lang.String r13 = "moments_bottom_detail_text_format"
            java.lang.String r0 = "${originalText} | ${time}"
            java.lang.String r11 = r11.getString(r13, r0)
            if (r11 != 0) goto Leb
            goto Lec
        Leb:
            r3 = r11
        Lec:
            java.lang.CharSequence r11 = og.m.R0(r3)
            java.lang.String r11 = r11.toString()
            boolean r13 = og.m.t0(r11)
            if (r13 == 0) goto Lfb
            goto Lfc
        Lfb:
            r0 = r11
        Lfc:
            c9.k1 r11 = new c9.k1
            r13 = 8
            r11.<init>(r12, r13)
            og.k r12 = ha.s.f5270i
            java.lang.String r11 = r12.e(r0, r11)
            return r11
        L10a:
            return r13
    }

    public static boolean c(java.lang.Class r1) {
            java.lang.String r0 = "field_snsId"
            java.lang.reflect.Field r0 = h.Hchat.utils.KavaReflector.findFieldRecursive(r1, r0)
            if (r0 == 0) goto L22
            java.lang.String r0 = "field_userName"
            java.lang.reflect.Field r0 = h.Hchat.utils.KavaReflector.findFieldRecursive(r1, r0)
            if (r0 == 0) goto L22
            java.lang.String r0 = "field_createTime"
            java.lang.reflect.Field r0 = h.Hchat.utils.KavaReflector.findFieldRecursive(r1, r0)
            if (r0 == 0) goto L22
            java.lang.String r0 = "field_type"
            java.lang.reflect.Field r1 = h.Hchat.utils.KavaReflector.findFieldRecursive(r1, r0)
            if (r1 == 0) goto L22
            r1 = 1
            return r1
        L22:
            r1 = 0
            return r1
    }

    public static boolean d(java.lang.reflect.Method r1) {
            boolean r0 = h.Hchat.utils.KavaReflector.isAbstract(r1)
            if (r0 != 0) goto L28
            java.lang.Class r0 = r1.getDeclaringClass()
            boolean r0 = r0.isInterface()
            if (r0 != 0) goto L28
            java.lang.Class[] r0 = r1.getParameterTypes()
            r0.getClass()
            int r0 = r0.length
            if (r0 != 0) goto L28
            java.lang.Class r1 = r1.getReturnType()
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r1 = gg.l.a(r1, r0)
            if (r1 == 0) goto L28
            r1 = 1
            return r1
        L28:
            r1 = 0
            return r1
    }

    public static boolean e(java.lang.Class r2, java.lang.reflect.Method r3) {
            boolean r0 = h.Hchat.utils.KavaReflector.isStatic(r3)
            if (r0 != 0) goto L40
            boolean r0 = h.Hchat.utils.KavaReflector.isAbstract(r3)
            if (r0 != 0) goto L40
            java.lang.Class r0 = r3.getDeclaringClass()
            boolean r0 = r0.isInterface()
            if (r0 != 0) goto L40
            int r0 = r3.getParameterCount()
            if (r0 != 0) goto L40
            java.lang.Class r0 = r3.getReturnType()
            java.lang.Class r1 = java.lang.Boolean.TYPE
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L34
            java.lang.Class r0 = r3.getReturnType()
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L40
        L34:
            java.lang.Class r3 = r3.getDeclaringClass()
            boolean r2 = r3.isAssignableFrom(r2)
            if (r2 == 0) goto L40
            r2 = 1
            return r2
        L40:
            r2 = 0
            return r2
    }

    public static boolean f(java.lang.reflect.Method r4) {
            java.lang.Class[] r0 = r4.getParameterTypes()
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r4)
            r2 = 0
            if (r1 != 0) goto L4a
            boolean r1 = h.Hchat.utils.KavaReflector.isAbstract(r4)
            if (r1 != 0) goto L4a
            java.lang.Class r1 = r4.getDeclaringClass()
            boolean r1 = r1.isInterface()
            if (r1 != 0) goto L4a
            java.lang.Class r4 = r4.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            boolean r4 = gg.l.a(r4, r1)
            if (r4 == 0) goto L4a
            int r4 = r0.length
            r1 = 3
            if (r4 != r1) goto L4a
            r4 = r0[r2]
            java.lang.Class<android.widget.TextView> r1 = android.widget.TextView.class
            boolean r4 = r1.isAssignableFrom(r4)
            if (r4 == 0) goto L4a
            r4 = 1
            r3 = r0[r4]
            boolean r1 = r1.isAssignableFrom(r3)
            if (r1 == 0) goto L4a
            r1 = 2
            r0 = r0[r1]
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L4a
            return r4
        L4a:
            return r2
    }

    public static boolean g(java.lang.Class r4, java.lang.reflect.Method r5) {
            java.lang.Class[] r0 = r5.getParameterTypes()
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r5)
            r2 = 0
            if (r1 != 0) goto L4a
            boolean r1 = h.Hchat.utils.KavaReflector.isAbstract(r5)
            if (r1 != 0) goto L4a
            java.lang.Class r1 = r5.getDeclaringClass()
            boolean r1 = r1.isInterface()
            if (r1 != 0) goto L4a
            int r1 = r0.length
            r3 = 1
            if (r1 != r3) goto L4a
            r0 = r0[r2]
            java.lang.Class r1 = java.lang.Integer.TYPE
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L4a
            java.lang.Class r0 = r5.getReturnType()
            boolean r0 = r0.isPrimitive()
            if (r0 != 0) goto L4a
            java.lang.Class r0 = r5.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L4a
            java.lang.Class r5 = r5.getDeclaringClass()
            boolean r4 = r4.isAssignableFrom(r5)
            if (r4 == 0) goto L4a
            return r3
        L4a:
            return r2
    }

    public static boolean h(java.lang.reflect.Method r2) {
            boolean r0 = h.Hchat.utils.KavaReflector.isStatic(r2)
            if (r0 != 0) goto L37
            boolean r0 = h.Hchat.utils.KavaReflector.isAbstract(r2)
            if (r0 != 0) goto L37
            java.lang.Class r0 = r2.getDeclaringClass()
            boolean r0 = r0.isInterface()
            if (r0 != 0) goto L37
            int r0 = r2.getParameterCount()
            if (r0 != 0) goto L37
            java.lang.Class r0 = r2.getReturnType()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            boolean r0 = gg.l.a(r0, r1)
            if (r0 == 0) goto L37
            java.lang.Class r2 = r2.getDeclaringClass()
            r2.getClass()
            boolean r2 = c(r2)
            if (r2 == 0) goto L37
            r2 = 1
            return r2
        L37:
            r2 = 0
            return r2
    }

    public static java.lang.Long o(java.lang.Object r1, java.lang.String r2) {
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.readField(r1, r2)
            r2 = 0
            if (r1 == 0) goto L22
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 == 0) goto Le
            r2 = r1
            java.lang.Number r2 = (java.lang.Number) r2
        Le:
            if (r2 == 0) goto L19
            long r1 = r2.longValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            return r1
        L19:
            java.lang.String r1 = r1.toString()
            java.lang.Long r1 = og.t.g0(r1)
            return r1
        L22:
            return r2
    }

    public final java.lang.reflect.Method b(fh.k r6, fg.l r7) {
            r5 = this;
            r8.g r0 = r5.f5271a
            r1 = 0
            org.luckypray.dexkit.DexKitBridge r2 = r0.f11623d     // Catch: java.lang.Throwable -> L41
            ch.e r3 = new ch.e     // Catch: java.lang.Throwable -> L41
            r3.<init>()     // Catch: java.lang.Throwable -> L41
            r3.f1666h = r6     // Catch: java.lang.Throwable -> L41
            hh.p r6 = r2.findMethod(r3)     // Catch: java.lang.Throwable -> L41
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L41
            r2.<init>()     // Catch: java.lang.Throwable -> L41
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L41
        L19:
            boolean r3 = r6.hasNext()     // Catch: java.lang.Throwable -> L41
            if (r3 == 0) goto L43
            java.lang.Object r3 = r6.next()     // Catch: java.lang.Throwable -> L41
            hh.o r3 = (hh.o) r3     // Catch: java.lang.Throwable -> L41
            java.lang.ClassLoader r4 = r0.f11622c     // Catch: java.lang.Throwable -> L2c
            java.lang.reflect.Method r3 = r3.r(r4)     // Catch: java.lang.Throwable -> L2c
            goto L33
        L2c:
            r3 = move-exception
            sf.f r4 = new sf.f     // Catch: java.lang.Throwable -> L41
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L41
            r3 = r4
        L33:
            boolean r4 = r3 instanceof sf.f     // Catch: java.lang.Throwable -> L41
            if (r4 == 0) goto L39
            r3 = r1
        L39:
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.Throwable -> L41
            if (r3 == 0) goto L19
            r2.add(r3)     // Catch: java.lang.Throwable -> L41
            goto L19
        L41:
            r6 = move-exception
            goto L62
        L43:
            java.util.Iterator r6 = r2.iterator()     // Catch: java.lang.Throwable -> L41
        L47:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r6.next()     // Catch: java.lang.Throwable -> L41
            java.lang.Object r2 = r7.invoke(r0)     // Catch: java.lang.Throwable -> L41
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L41
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L47
            goto L5f
        L5e:
            r0 = r1
        L5f:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L41
            goto L67
        L62:
            sf.f r0 = new sf.f
            r0.<init>(r6)
        L67:
            java.lang.Throwable r6 = sf.g.b(r0)
            if (r6 == 0) goto L74
            ab.b r7 = r5.f5272b
            java.lang.String r2 = "朋友圈底部详情 DexKit 定位失败"
            r7.invoke(r2, r6)
        L74:
            boolean r6 = r0 instanceof sf.f
            if (r6 == 0) goto L79
            goto L7a
        L79:
            r1 = r0
        L7a:
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            return r1
    }

    public final java.lang.reflect.Method i() {
            r14 = this;
            java.lang.String r0 = r14.n()
            r8.g r1 = r14.f5271a
            java.lang.ClassLoader r1 = r1.f11622c
            android.content.SharedPreferences r2 = r14.f5274d
            java.lang.String r3 = "flutter_profile_switch"
            java.lang.reflect.Method r1 = e8.b.c(r2, r0, r1, r3)
            if (r1 == 0) goto L1d
            boolean r4 = d(r1)
            if (r4 == 0) goto L19
            goto L1a
        L19:
            r1 = 0
        L1a:
            if (r1 == 0) goto L1d
            return r1
        L1d:
            fh.k r1 = new fh.k
            r1.<init>()
            java.lang.String r4 = "enableFlutterSNSPage"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.router.SnsRouter"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}
            r1.r0(r4)
            c0.f r5 = new c0.f
            java.lang.Class<ha.s> r4 = ha.s.class
            java.lang.Class r8 = eh.a.i(r4)
            r12 = 0
            r13 = 15
            r6 = 1
            java.lang.String r9 = "isFlutterProfileSwitchMethod"
            java.lang.String r10 = "isFlutterProfileSwitchMethod(Ljava/lang/reflect/Method;)Z"
            r11 = 0
            r7 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.reflect.Method r1 = r14.b(r1, r5)
            if (r1 == 0) goto L4c
            e8.b.h(r2, r0, r3, r1)
            return r1
        L4c:
            e8.b.a(r2, r0, r3)
            return r1
    }

    public final java.lang.reflect.Method j(java.lang.Class r8) {
            r7 = this;
            java.lang.String r0 = r7.n()
            r8.g r1 = r7.f5271a
            java.lang.ClassLoader r1 = r1.f11622c
            android.content.SharedPreferences r2 = r7.f5274d
            java.lang.String r3 = "group_method"
            java.lang.reflect.Method r1 = e8.b.c(r2, r0, r1, r3)
            r4 = 0
            if (r1 == 0) goto L1e
            boolean r5 = e(r8, r1)
            if (r5 == 0) goto L1a
            goto L1b
        L1a:
            r1 = r4
        L1b:
            if (r1 == 0) goto L1e
            return r1
        L1e:
            fh.k r1 = new fh.k
            r1.<init>()
            r5 = 0
            r1.m0(r5)
            java.lang.String r5 = "getShowGroupEnable"
            java.lang.String[] r5 = new java.lang.String[]{r5}
            r1.r0(r5)
            ha.q r5 = new ha.q
            r6 = 0
            r5.<init>(r7, r8, r6)
            java.lang.reflect.Method r8 = r7.b(r1, r5)
            if (r8 == 0) goto L40
            e8.b.h(r2, r0, r3, r8)
            return r8
        L40:
            e8.b.a(r2, r0, r3)
            ab.b r0 = r7.f5272b
            java.lang.String r1 = "朋友圈底部详情未找到可见范围方法"
            r0.invoke(r1, r4)
            return r8
    }

    public final java.lang.reflect.Method k() {
            r15 = this;
            java.lang.String r0 = r15.n()
            r8.g r1 = r15.f5271a
            java.lang.ClassLoader r1 = r1.f11622c
            android.content.SharedPreferences r2 = r15.f5274d
            java.lang.String r3 = "profile_formatter_method"
            java.lang.reflect.Method r1 = e8.b.c(r2, r0, r1, r3)
            r4 = 0
            if (r1 == 0) goto L1e
            boolean r5 = f(r1)
            if (r5 == 0) goto L1a
            goto L1b
        L1a:
            r1 = r4
        L1b:
            if (r1 == 0) goto L1e
            return r1
        L1e:
            fh.k r1 = new fh.k
            r1.<init>()
            java.lang.String r5 = "cerateTimeView"
            java.lang.String r6 = "formatTimeInGrid"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6}
            r1.r0(r5)
            c0.f r6 = new c0.f
            java.lang.Class<ha.s> r5 = ha.s.class
            java.lang.Class r9 = eh.a.i(r5)
            r13 = 0
            r14 = 16
            r7 = 1
            java.lang.String r10 = "isProfileFormatterMethod"
            java.lang.String r11 = "isProfileFormatterMethod(Ljava/lang/reflect/Method;)Z"
            r12 = 0
            r8 = r15
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.reflect.Method r1 = r15.b(r1, r6)
            if (r1 == 0) goto L4d
            e8.b.h(r2, r0, r3, r1)
            return r1
        L4d:
            e8.b.a(r2, r0, r3)
            ab.b r0 = r8.f5272b
            java.lang.String r2 = "朋友圈底部详情未找到个人主页时间方法"
            r0.invoke(r2, r4)
            return r1
    }

    public final java.lang.reflect.Method l(java.lang.Class r8) {
            r7 = this;
            java.lang.String r0 = r7.n()
            r8.g r1 = r7.f5271a
            java.lang.ClassLoader r1 = r1.f11622c
            android.content.SharedPreferences r2 = r7.f5274d
            java.lang.String r3 = "profile_item_method"
            java.lang.reflect.Method r1 = e8.b.c(r2, r0, r1, r3)
            r4 = 0
            if (r1 == 0) goto L1e
            boolean r5 = g(r8, r1)
            if (r5 == 0) goto L1a
            goto L1b
        L1a:
            r1 = r4
        L1b:
            if (r1 == 0) goto L1e
            return r1
        L1e:
            fh.k r1 = new fh.k
            r1.<init>()
            java.lang.String r5 = "getItem"
            java.lang.String r6 = "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6}
            r1.r0(r5)
            ha.q r5 = new ha.q
            r6 = 1
            r5.<init>(r7, r8, r6)
            java.lang.reflect.Method r8 = r7.b(r1, r5)
            if (r8 == 0) goto L3e
            e8.b.h(r2, r0, r3, r8)
            return r8
        L3e:
            e8.b.a(r2, r0, r3)
            ab.b r0 = r7.f5272b
            java.lang.String r1 = "朋友圈底部详情未找到个人主页条目方法"
            r0.invoke(r1, r4)
            return r8
    }

    public final java.lang.reflect.Method m() {
            r15 = this;
            java.lang.String r0 = r15.n()
            r8.g r1 = r15.f5271a
            java.lang.ClassLoader r1 = r1.f11622c
            android.content.SharedPreferences r2 = r15.f5274d
            java.lang.String r3 = "time_method"
            java.lang.reflect.Method r1 = e8.b.c(r2, r0, r1, r3)
            r4 = 0
            if (r1 == 0) goto L1e
            boolean r5 = h(r1)
            if (r5 == 0) goto L1a
            goto L1b
        L1a:
            r1 = r4
        L1b:
            if (r1 == 0) goto L1e
            return r1
        L1e:
            fh.k r1 = new fh.k
            r1.<init>()
            java.lang.String r5 = "java.lang.String"
            fh.k.q0(r1, r5)
            r5 = 0
            r1.m0(r5)
            java.lang.String r5 = "getTimeString"
            java.lang.String[] r5 = new java.lang.String[]{r5}
            r1.r0(r5)
            c0.f r6 = new c0.f
            java.lang.Class<ha.s> r5 = ha.s.class
            java.lang.Class r9 = eh.a.i(r5)
            r13 = 0
            r14 = 17
            r7 = 1
            java.lang.String r10 = "isTimeMethod"
            java.lang.String r11 = "isTimeMethod(Ljava/lang/reflect/Method;)Z"
            r12 = 0
            r8 = r15
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.reflect.Method r1 = r15.b(r1, r6)
            if (r1 == 0) goto L54
            e8.b.h(r2, r0, r3, r1)
            return r1
        L54:
            e8.b.a(r2, r0, r3)
            ab.b r0 = r8.f5272b
            java.lang.String r2 = "朋友圈底部详情未找到时间方法"
            r0.invoke(r2, r4)
            return r1
    }

    public final java.lang.String n() {
            r2 = this;
            r8.g r0 = r2.f5271a
            android.content.Context r1 = r0.f11620a
            java.lang.ClassLoader r0 = r0.f11622c
            r0.getClass()
            l8.i r0 = o8.k.a(r1, r0)
            java.lang.String r0 = r0.f7933h
            return r0
    }
}
