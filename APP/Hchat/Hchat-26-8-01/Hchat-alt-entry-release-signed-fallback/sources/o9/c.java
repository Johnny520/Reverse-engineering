package o9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o9.c f9620a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f9621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile boolean f9622c;

    static {
            o9.c r0 = new o9.c
            r0.<init>()
            o9.c.f9620a = r0
            return
    }

    public static o9.b a(java.lang.String r2, int r3, char r4, char r5) {
            int r3 = r3 + (-1)
        L2:
            if (r3 <= 0) goto L19
            char r0 = r2.charAt(r3)
            boolean r1 = a.a.v0(r0)
            if (r1 != 0) goto L16
            r1 = 160(0xa0, float:2.24E-43)
            if (r0 == r1) goto L16
            r1 = 12288(0x3000, float:1.7219E-41)
            if (r0 != r1) goto L19
        L16:
            int r3 = r3 + (-1)
            goto L2
        L19:
            if (r3 <= 0) goto L47
            char r0 = r2.charAt(r3)
            if (r0 == r5) goto L22
            goto L47
        L22:
            r5 = 4
            int r4 = og.m.w0(r2, r4, r3, r5)
            if (r4 < 0) goto L47
            int r4 = r4 + 1
            if (r4 < r3) goto L2e
            goto L47
        L2e:
            java.lang.String r2 = r2.substring(r4, r3)
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            int r5 = r2.length()
            if (r5 != 0) goto L41
            goto L47
        L41:
            o9.b r5 = new o9.b
            r5.<init>(r2, r4, r3)
            return r5
        L47:
            r2 = 0
            return r2
    }

    public static boolean d(java.lang.reflect.Method r5) {
            java.lang.Class[] r5 = r5.getParameterTypes()
            r0 = 0
            if (r5 == 0) goto L1e
            int r1 = r5.length
            r2 = 2
            if (r1 < r2) goto L1e
            int r1 = r5.length
            r2 = r0
        Ld:
            if (r2 >= r1) goto L1e
            r3 = r5[r2]
            java.lang.Class<android.view.View> r4 = android.view.View.class
            boolean r3 = r4.isAssignableFrom(r3)
            if (r3 == 0) goto L1b
            r5 = 1
            return r5
        L1b:
            int r2 = r2 + 1
            goto Ld
        L1e:
            return r0
    }

    public static o9.b e(java.lang.String r3) {
            java.lang.String r0 = "退出了群聊"
            r1 = 6
            int r0 = og.m.v0(r1, r3, r0)
            if (r0 > 0) goto La
            goto L55
        La:
            int r0 = r0 + (-1)
        Lc:
            if (r0 <= 0) goto L23
            char r1 = r3.charAt(r0)
            boolean r2 = a.a.v0(r1)
            if (r2 != 0) goto L20
            r2 = 160(0xa0, float:2.24E-43)
            if (r1 == r2) goto L20
            r2 = 12288(0x3000, float:1.7219E-41)
            if (r1 != r2) goto L23
        L20:
            int r0 = r0 + (-1)
            goto Lc
        L23:
            if (r0 <= 0) goto L55
            char r1 = r3.charAt(r0)
            r2 = 93
            if (r1 == r2) goto L2e
            goto L55
        L2e:
            r1 = 91
            r2 = 4
            int r1 = og.m.w0(r3, r1, r0, r2)
            if (r1 < 0) goto L55
            int r1 = r1 + 1
            if (r1 < r0) goto L3c
            goto L55
        L3c:
            java.lang.String r3 = r3.substring(r1, r0)
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            int r2 = r3.length()
            if (r2 != 0) goto L4f
            goto L55
        L4f:
            o9.b r2 = new o9.b
            r2.<init>(r3, r1, r0)
            return r2
        L55:
            r3 = 0
            return r3
    }

    public static java.util.List f(r8.g r11, boolean r12, fg.p r13) {
            android.content.Context r0 = r11.f11620a
            java.lang.String r1 = "Hchat_group_leave_monitor_method_cache"
            android.content.SharedPreferences r0 = ub.b.c(r0, r1)
            android.content.Context r1 = r11.f11620a
            java.lang.ClassLoader r2 = r11.f11622c
            java.lang.String r1 = e8.b.g(r1, r2)
            boolean r3 = og.m.t0(r1)
            r4 = 0
            if (r3 != 0) goto L18
            goto L19
        L18:
            r1 = r4
        L19:
            if (r1 == 0) goto L22
            java.lang.String r3 = "|group_leave_monitor_uri_click_v1"
            java.lang.String r1 = r1.concat(r3)
            goto L23
        L22:
            r1 = r4
        L23:
            java.lang.String r3 = ""
            if (r1 != 0) goto L28
            r1 = r3
        L28:
            boolean r5 = og.m.t0(r1)
            tf.t r6 = tf.t.f13167g
            if (r5 == 0) goto L31
            goto L63
        L31:
            java.lang.String r5 = "uri_span_click_methods"
            java.util.List r7 = e8.b.f(r0, r1, r2, r5)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L40:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L57
            java.lang.Object r9 = r7.next()
            r10 = r9
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            boolean r10 = d(r10)
            if (r10 == 0) goto L40
            r8.add(r9)
            goto L40
        L57:
            boolean r7 = r8.isEmpty()
            if (r7 != 0) goto L5e
            r4 = r8
        L5e:
            if (r4 == 0) goto L61
            return r4
        L61:
            if (r12 != 0) goto L64
        L63:
            return r6
        L64:
            org.luckypray.dexkit.DexKitBridge r11 = r11.f11623d     // Catch: java.lang.Throwable -> La5
            ch.e r12 = new ch.e     // Catch: java.lang.Throwable -> La5
            r12.<init>()     // Catch: java.lang.Throwable -> La5
            fh.k r4 = new fh.k     // Catch: java.lang.Throwable -> La5
            r4.<init>()     // Catch: java.lang.Throwable -> La5
            java.lang.String r7 = "MicroMsg.URISpanHandlerSet"
            java.lang.String r8 = "LuckyMoneyUriSpanHandler handleSpanClick() clickCallback == null"
            java.lang.String[] r7 = new java.lang.String[]{r7, r8}     // Catch: java.lang.Throwable -> La5
            r4.r0(r7)     // Catch: java.lang.Throwable -> La5
            r12.f1666h = r4     // Catch: java.lang.Throwable -> La5
            hh.p r11 = r11.findMethod(r12)     // Catch: java.lang.Throwable -> La5
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La5
            r12.<init>()     // Catch: java.lang.Throwable -> La5
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> La5
        L8a:
            boolean r4 = r11.hasNext()     // Catch: java.lang.Throwable -> La5
            if (r4 == 0) goto Lab
            java.lang.Object r4 = r11.next()     // Catch: java.lang.Throwable -> La5
            hh.o r4 = (hh.o) r4     // Catch: java.lang.Throwable -> La5
            r4.getClass()     // Catch: java.lang.Throwable -> La5
            lh.d r4 = r4.p()     // Catch: java.lang.Throwable -> La5
            java.lang.reflect.Method r4 = r4.b(r2)     // Catch: java.lang.Throwable -> La5
            r12.add(r4)     // Catch: java.lang.Throwable -> La5
            goto L8a
        La5:
            r11 = move-exception
            sf.f r12 = new sf.f
            r12.<init>(r11)
        Lab:
            java.lang.Throwable r11 = sf.g.b(r12)
            if (r11 != 0) goto Lb3
            r6 = r12
            goto Lb8
        Lb3:
            java.lang.String r12 = "退群监控链接点击方法定位失败"
            r13.invoke(r12, r11)
        Lb8:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r12 = r6.iterator()
        Lc3:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto Lda
            java.lang.Object r13 = r12.next()
            r2 = r13
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            boolean r2 = d(r2)
            if (r2 == 0) goto Lc3
            r11.add(r13)
            goto Lc3
        Lda:
            java.util.HashSet r12 = new java.util.HashSet
            r12.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r11 = r11.iterator()
        Le8:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L103
            java.lang.Object r2 = r11.next()
            r4 = r2
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.String r4 = r4.toGenericString()
            boolean r4 = r12.add(r4)
            if (r4 == 0) goto Le8
            r13.add(r2)
            goto Le8
        L103:
            boolean r11 = r13.isEmpty()
            if (r11 != 0) goto L10f
            e8.b r11 = e8.b.f2358a
            r11.j(r0, r1, r5, r13)
            goto L12d
        L10f:
            java.lang.String r11 = "cache.key"
            android.content.SharedPreferences$Editor r12 = r0.edit()     // Catch: java.lang.Throwable -> L12d
            java.lang.String r0 = r0.getString(r11, r3)     // Catch: java.lang.Throwable -> L12d
            boolean r0 = gg.l.a(r0, r1)     // Catch: java.lang.Throwable -> L12d
            if (r0 != 0) goto L126
            android.content.SharedPreferences$Editor r0 = r12.clear()     // Catch: java.lang.Throwable -> L12d
            r0.putString(r11, r1)     // Catch: java.lang.Throwable -> L12d
        L126:
            android.content.SharedPreferences$Editor r11 = r12.remove(r5)     // Catch: java.lang.Throwable -> L12d
            r11.apply()     // Catch: java.lang.Throwable -> L12d
        L12d:
            return r13
    }

    public static java.lang.Integer g(java.lang.String r7) {
            r0 = 0
            if (r7 == 0) goto L12
            r1 = 44
            java.lang.String r7 = og.m.M0(r7, r1)
            java.lang.CharSequence r7 = og.m.R0(r7)
            java.lang.String r7 = r7.toString()
            goto L13
        L12:
            r7 = r0
        L13:
            if (r7 != 0) goto L17
            java.lang.String r7 = ""
        L17:
            int r1 = r7.length()
            if (r1 != 0) goto L1e
            goto L68
        L1e:
            java.lang.String r1 = "#"
            r2 = 0
            boolean r3 = og.t.d0(r7, r1, r2)
            if (r3 == 0) goto L28
            goto L2c
        L28:
            java.lang.String r7 = r1.concat(r7)
        L2c:
            r3 = 1
            java.lang.String r7 = r7.substring(r3)
            int r4 = r7.length()
            r5 = 6
            if (r4 == r5) goto L40
            int r4 = r7.length()
            r5 = 8
            if (r4 != r5) goto L68
        L40:
            r4 = r2
        L41:
            int r5 = r7.length()
            if (r4 >= r5) goto L6c
            char r5 = r7.charAt(r4)
            boolean r6 = java.lang.Character.isDigit(r5)
            if (r6 != 0) goto L65
            r6 = 97
            if (r6 > r5) goto L5a
            r6 = 103(0x67, float:1.44E-43)
            if (r5 >= r6) goto L5a
            goto L65
        L5a:
            r6 = 65
            if (r6 > r5) goto L63
            r6 = 71
            if (r5 >= r6) goto L63
            goto L65
        L63:
            r5 = r3
            goto L66
        L65:
            r5 = r2
        L66:
            if (r5 == 0) goto L69
        L68:
            return r0
        L69:
            int r4 = r4 + 1
            goto L41
        L6c:
            java.util.Locale r2 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L8d
            java.lang.String r7 = r7.toUpperCase(r2)     // Catch: java.lang.Throwable -> L8d
            r7.getClass()     // Catch: java.lang.Throwable -> L8d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d
            r2.<init>()     // Catch: java.lang.Throwable -> L8d
            r2.append(r1)     // Catch: java.lang.Throwable -> L8d
            r2.append(r7)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r7 = r2.toString()     // Catch: java.lang.Throwable -> L8d
            int r7 = android.graphics.Color.parseColor(r7)     // Catch: java.lang.Throwable -> L8d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L8d
            goto L94
        L8d:
            r7 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r7)
            r7 = r1
        L94:
            boolean r1 = r7 instanceof sf.f
            if (r1 == 0) goto L9a
            goto L9b
        L9a:
            r0 = r7
        L9b:
            java.lang.Integer r0 = (java.lang.Integer) r0
            return r0
    }

    public static java.lang.String h(java.lang.String r4, java.lang.String r5) {
            java.lang.String r0 = "<"
            java.lang.String r1 = ">(.*?)</"
            java.lang.String r2 = ">"
            java.lang.String r5 = bc.e.k(r0, r5, r1, r5, r2)
            r1 = 32
            int r1 = l3.w.f(r1)
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5, r1)
            r5.getClass()
            java.util.regex.Matcher r5 = r5.matcher(r4)
            r5.getClass()
            r1 = 0
            og.i r4 = a7.a.b(r5, r1, r4)
            java.lang.String r5 = ""
            if (r4 == 0) goto L63
            java.util.List r4 = r4.a()
            r3 = 1
            java.lang.Object r4 = tf.m.w1(r3, r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L35
            goto L36
        L35:
            r5 = r4
        L36:
            java.lang.CharSequence r4 = og.m.R0(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "&lt;"
            java.lang.String r4 = og.t.a0(r4, r5, r0, r1)
            java.lang.String r5 = "&gt;"
            java.lang.String r4 = og.t.a0(r4, r5, r2, r1)
            java.lang.String r5 = "&quot;"
            java.lang.String r0 = "\""
            java.lang.String r4 = og.t.a0(r4, r5, r0, r1)
            java.lang.String r5 = "&apos;"
            java.lang.String r0 = "'"
            java.lang.String r4 = og.t.a0(r4, r5, r0, r1)
            java.lang.String r5 = "&amp;"
            java.lang.String r0 = "&"
            java.lang.String r4 = og.t.a0(r4, r5, r0, r1)
            return r4
        L63:
            return r5
    }

    public final void b(r8.g r4, fg.p r5) {
            r3 = this;
            r4.getClass()
            r0 = 0
            boolean r0 = r3.c(r4, r0, r5)
            if (r0 != 0) goto L1c
            android.os.Handler r0 = r8.e.f11615a
            aa.c r0 = new aa.c
            r0.<init>(r4, r5)
            r4 = 8
            java.lang.String r5 = "group_leave_monitor_uri_click"
            java.lang.String r1 = "退群监控链接点击"
            r8.c r2 = r8.c.f11603i
            r8.e.f(r4, r0, r5, r1, r2)
        L1c:
            return
    }

    public final synchronized boolean c(r8.g r9, boolean r10, fg.p r11) {
            r8 = this;
            monitor-enter(r8)
            boolean r0 = o9.c.f9622c     // Catch: java.lang.Throwable -> L4d
            r1 = 1
            if (r0 == 0) goto L8
            monitor-exit(r8)
            return r1
        L8:
            java.util.List r10 = f(r9, r10, r11)     // Catch: java.lang.Throwable -> L4d
            boolean r0 = r10.isEmpty()     // Catch: java.lang.Throwable -> L4d
            r2 = 0
            if (r0 == 0) goto L15
            monitor-exit(r8)
            return r2
        L15:
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L4d
            r0 = 0
            r3 = r2
        L1b:
            boolean r4 = r10.hasNext()     // Catch: java.lang.Throwable -> L4d
            if (r4 == 0) goto L4f
            java.lang.Object r4 = r10.next()     // Catch: java.lang.Throwable -> L4d
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch: java.lang.Throwable -> L4d
            r8.i r5 = r8.i.f11631b     // Catch: java.lang.Throwable -> L3a
            c9.b2 r6 = new c9.b2     // Catch: java.lang.Throwable -> L3a
            r6.<init>(r8, r9, r4)     // Catch: java.lang.Throwable -> L3a
            r5.b(r4, r6)     // Catch: java.lang.Throwable -> L3a
            int r4 = r3 + 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L38
            goto L44
        L38:
            r3 = move-exception
            goto L3e
        L3a:
            r4 = move-exception
            r7 = r4
            r4 = r3
            r3 = r7
        L3e:
            sf.f r5 = new sf.f     // Catch: java.lang.Throwable -> L4d
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L4d
            r3 = r5
        L44:
            java.lang.Throwable r3 = sf.g.b(r3)     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L4b
            r0 = r3
        L4b:
            r3 = r4
            goto L1b
        L4d:
            r9 = move-exception
            goto L62
        L4f:
            if (r3 <= 0) goto L52
            goto L53
        L52:
            r1 = r2
        L53:
            o9.c.f9622c = r1     // Catch: java.lang.Throwable -> L4d
            boolean r9 = o9.c.f9622c     // Catch: java.lang.Throwable -> L4d
            if (r9 != 0) goto L5e
            java.lang.String r9 = "退群监控链接点击 Hook 安装失败"
            r11.invoke(r9, r0)     // Catch: java.lang.Throwable -> L4d
        L5e:
            boolean r9 = o9.c.f9622c     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r8)
            return r9
        L62:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L4d
            throw r9
    }
}
