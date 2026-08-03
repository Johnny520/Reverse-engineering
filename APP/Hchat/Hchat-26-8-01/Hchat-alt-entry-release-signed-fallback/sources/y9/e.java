package y9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r8.g f22332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ib.b f22333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y9.b f22334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.Map f22335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.Map f22336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f22337f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f22338g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.ThreadLocal f22339h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final android.content.SharedPreferences f22340i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f22341j;

    public e(r8.g r1, ib.b r2, y9.b r3) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f22332a = r1
            r0.f22333b = r2
            r0.f22334c = r3
            java.util.Map r2 = p.a.p()
            r0.f22335d = r2
            java.util.Map r2 = p.a.p()
            r0.f22336e = r2
            java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap
            r2.<init>()
            r0.f22337f = r2
            java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap
            r2.<init>()
            r0.f22338g = r2
            java.lang.ThreadLocal r2 = new java.lang.ThreadLocal
            r2.<init>()
            r0.f22339h = r2
            android.content.Context r1 = r1.f11620a
            java.lang.String r2 = "Hchat_member_title_method_cache"
            android.content.SharedPreferences r1 = ub.b.c(r1, r2)
            r0.f22340i = r1
            return
    }

    public static java.lang.String b(java.lang.Object r8) {
            r0 = 0
            if (r8 != 0) goto L4
            goto L17
        L4:
            java.lang.String r1 = "field_xml"
            java.lang.String r2 = "xml"
            java.lang.String r3 = "field_content"
            java.lang.String r4 = "content"
            java.lang.String r5 = "msgContent"
            java.lang.String[] r1 = new java.lang.String[]{r3, r4, r5, r1, r2}
            r2 = 0
            r3 = r2
        L14:
            r4 = 5
            if (r3 < r4) goto L18
        L17:
            return r0
        L18:
            r4 = r1[r3]
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.readField(r8, r4)
            boolean r5 = r4 instanceof java.lang.String
            if (r5 == 0) goto L25
            java.lang.String r4 = (java.lang.String) r4
            goto L26
        L25:
            r4 = r0
        L26:
            if (r4 == 0) goto L64
            java.lang.String r5 = ":\n"
            r6 = 6
            int r7 = og.m.r0(r4, r5, r2, r2, r6)
            if (r7 <= 0) goto L36
            int r5 = og.m.r0(r4, r5, r2, r2, r6)
            goto L44
        L36:
            java.lang.String r5 = ":\r\n"
            int r7 = og.m.r0(r4, r5, r2, r2, r6)
            if (r7 <= 0) goto L43
            int r5 = og.m.r0(r4, r5, r2, r2, r6)
            goto L44
        L43:
            r5 = -1
        L44:
            java.lang.String r6 = ""
            if (r5 <= 0) goto L5d
            r7 = 80
            if (r5 <= r7) goto L4d
            goto L5d
        L4d:
            java.lang.String r4 = r4.substring(r2, r5)
            boolean r5 = zb.c.b(r4)
            if (r5 == 0) goto L58
            goto L59
        L58:
            r4 = r0
        L59:
            if (r4 != 0) goto L5c
            goto L5d
        L5c:
            r6 = r4
        L5d:
            boolean r4 = zb.c.b(r6)
            if (r4 == 0) goto L64
            return r6
        L64:
            int r3 = r3 + 1
            goto L14
    }

    public static void e(android.text.SpannableStringBuilder r7) {
            r0 = 0
            r1 = r0
            r2 = r1
        L3:
            int r3 = r7.length()
            r4 = 32
            r5 = 1
            if (r1 >= r3) goto L39
            char r3 = r7.charAt(r1)
            r6 = 10
            if (r3 == r6) goto L27
            r6 = 13
            if (r3 == r6) goto L27
            r6 = 9
            if (r3 == r6) goto L27
            if (r3 == r4) goto L27
            r4 = 12288(0x3000, float:1.7219E-41)
            if (r3 != r4) goto L23
            goto L27
        L23:
            int r1 = r1 + 1
            r2 = r0
            goto L3
        L27:
            if (r2 == 0) goto L2f
            int r3 = r1 + 1
            r7.delete(r1, r3)
            goto L3
        L2f:
            int r2 = r1 + 1
            java.lang.String r3 = " "
            r7.replace(r1, r2, r3)
            r1 = r2
            r2 = r5
            goto L3
        L39:
            int r1 = r7.length()
            if (r1 <= 0) goto L49
            char r1 = r7.charAt(r0)
            if (r1 != r4) goto L49
            r7.delete(r0, r5)
            goto L39
        L49:
            int r0 = r7.length()
            if (r0 <= 0) goto L67
            int r0 = r7.length()
            int r0 = r0 - r5
            char r0 = r7.charAt(r0)
            if (r0 != r4) goto L67
            int r0 = r7.length()
            int r0 = r0 - r5
            int r1 = r7.length()
            r7.delete(r0, r1)
            goto L49
        L67:
            return
    }

    public static boolean g(java.lang.String r2) {
            java.lang.String r0 = "@chatroom"
            r1 = 0
            boolean r0 = og.t.W(r2, r0, r1)
            if (r0 != 0) goto L13
            java.lang.String r0 = "@im.chatroom"
            boolean r2 = og.t.W(r2, r0, r1)
            if (r2 == 0) goto L12
            goto L13
        L12:
            return r1
        L13:
            r2 = 1
            return r2
    }

    public static boolean h(java.lang.String r2) {
            g8.a r0 = h.Hchat.hooks.api.core.WeChatApis.account()
            if (r0 == 0) goto Lb
            java.lang.String r0 = r0.c()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 != 0) goto L10
            java.lang.String r0 = ""
        L10:
            int r1 = r0.length()
            if (r1 <= 0) goto L1e
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L1e
            r2 = 1
            return r2
        L1e:
            r2 = 0
            return r2
    }

    public static java.lang.String j(java.lang.String r1, java.lang.String r2) {
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            int r0 = r1.length()
            if (r0 <= 0) goto Lf
            return r1
        Lf:
            g8.i r1 = wb.en.c()
            if (r1 == 0) goto L49
            java.lang.String r1 = r1.r(r2)
            if (r1 == 0) goto L49
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L49
            java.lang.String r2 = "\\s+"
            java.lang.String r0 = " "
            java.lang.String r1 = j8.b.h(r2, r1, r0)
            boolean r2 = og.m.t0(r1)
            if (r2 != 0) goto L45
            java.lang.String r2 = "微信用户("
            r0 = 0
            boolean r2 = og.t.d0(r1, r2, r0)
            if (r2 != 0) goto L45
            java.lang.String r2 = "微信用户（"
            boolean r2 = og.t.d0(r1, r2, r0)
            if (r2 != 0) goto L45
            goto L46
        L45:
            r1 = 0
        L46:
            if (r1 == 0) goto L49
            return r1
        L49:
            java.lang.String r1 = " "
            return r1
    }

    public static void k(android.text.SpannableStringBuilder r4) {
        L0:
            java.lang.String r0 = "￼"
            boolean r0 = og.m.H0(r4, r0)
            if (r0 == 0) goto L30
            java.lang.String r0 = " "
            r1 = 6
            r2 = 0
            int r0 = og.m.r0(r4, r0, r2, r2, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r3 = 1
            if (r0 < 0) goto L19
            r0 = r3
            goto L1a
        L19:
            r0 = r2
        L1a:
            if (r0 == 0) goto L1d
            goto L1e
        L1d:
            r1 = 0
        L1e:
            if (r1 == 0) goto L30
            int r0 = r1.intValue()
            int r0 = r0 + r3
            int r1 = r4.length()
            if (r0 <= r1) goto L2c
            r0 = r1
        L2c:
            r4.delete(r2, r0)
            goto L0
        L30:
            return
    }

    public final boolean a(android.widget.TextView r22, java.lang.String r23, java.lang.String r24) {
            r21 = this;
            r1 = r21
            r0 = r22
            r2 = r23
            r3 = r24
            ib.b r4 = r1.f22333b
            android.content.SharedPreferences r4 = r4.f6650a
            boolean r5 = zb.c.b(r3)
            r6 = 0
            if (r5 == 0) goto L209
            boolean r5 = g(r2)
            if (r5 != 0) goto L1b
            goto L209
        L1b:
            y9.d r5 = new y9.d
            r5.<init>(r2, r3)
            java.util.Map r7 = r1.f22336e
            r7.getClass()
            java.util.Map r7 = (java.util.Map) r7
            r7.put(r0, r5)
            i8.a r7 = h.Hchat.hooks.api.core.WeChatApis.contact()
            r7.getClass()
            g8.d r7 = h.Hchat.hooks.api.core.WeChatApis.c()
            if (r7 == 0) goto L3c
            int r7 = r7.j(r2, r3)
            goto L3d
        L3c:
            r7 = r6
        L3d:
            java.lang.String r8 = ib.b.a(r23, r24)
            java.lang.String r9 = "custom_title_"
            java.lang.String r8 = r9.concat(r8)
            java.lang.String r9 = ""
            java.lang.String r8 = r4.getString(r8, r9)
            if (r8 == 0) goto L50
            goto L51
        L50:
            r8 = r9
        L51:
            java.lang.String r8 = a7.a.k(r8)
            int r10 = r8.length()
            r11 = 2
            r12 = 1
            if (r10 != 0) goto L8b
            if (r7 == r12) goto L67
            if (r7 == r11) goto L64
            java.lang.String r10 = "member_title"
            goto L69
        L64:
            java.lang.String r10 = "owner_title"
            goto L69
        L67:
            java.lang.String r10 = "admin_title"
        L69:
            if (r7 == r12) goto L73
            if (r7 == r11) goto L70
            java.lang.String r13 = "群员"
            goto L75
        L70:
            java.lang.String r13 = "群主"
            goto L75
        L73:
            java.lang.String r13 = "管理员"
        L75:
            java.lang.String r10 = r4.getString(r10, r13)
            if (r10 == 0) goto L7c
            goto L7d
        L7c:
            r10 = r13
        L7d:
            java.lang.String r10 = a7.a.k(r10)
            int r14 = r10.length()
            if (r14 != 0) goto L88
            goto L89
        L88:
            r13 = r10
        L89:
            r15 = r13
            goto L8c
        L8b:
            r15 = r8
        L8c:
            int r10 = r15.length()
            if (r10 != 0) goto L93
            goto La3
        L93:
            if (r7 != 0) goto La7
            int r10 = r8.length()
            if (r10 != 0) goto La7
            java.lang.String r10 = "show_member"
            boolean r10 = r4.getBoolean(r10, r12)
            if (r10 != 0) goto La7
        La3:
            r21.l(r22)
            return r6
        La7:
            java.lang.String r10 = ib.b.a(r23, r24)
            java.lang.String r13 = "custom_color_"
            java.lang.String r10 = r13.concat(r10)
            java.lang.String r10 = r4.getString(r10, r9)
            if (r10 == 0) goto Lb8
            goto Lb9
        Lb8:
            r10 = r9
        Lb9:
            y9.f r10 = a7.a.G(r10)
            if (r10 == 0) goto Lc0
            goto L111
        Lc0:
            int r10 = r8.length()
            if (r10 <= 0) goto Le0
            java.lang.String r10 = "custom_color"
            java.lang.String r13 = "#2563EB"
            java.lang.String r10 = r4.getString(r10, r13)
            y9.f r10 = a7.a.G(r10)
            if (r10 == 0) goto Ld5
            goto L111
        Ld5:
            int r10 = android.graphics.Color.parseColor(r13)
            y9.f r13 = new y9.f
            r13.<init>(r10, r10)
        Lde:
            r10 = r13
            goto L111
        Le0:
            if (r7 == r12) goto Lea
            if (r7 == r11) goto Le7
            java.lang.String r10 = "member_color"
            goto Lec
        Le7:
            java.lang.String r10 = "owner_color"
            goto Lec
        Lea:
            java.lang.String r10 = "admin_color"
        Lec:
            if (r7 == r12) goto Lf6
            if (r7 == r11) goto Lf3
            java.lang.String r13 = "#64748B"
            goto Lf8
        Lf3:
            java.lang.String r13 = "#F59E0B"
            goto Lf8
        Lf6:
            java.lang.String r13 = "#22C55E"
        Lf8:
            java.lang.String r10 = r4.getString(r10, r13)
            if (r10 == 0) goto Lff
            goto L100
        Lff:
            r10 = r13
        L100:
            y9.f r10 = a7.a.G(r10)
            if (r10 == 0) goto L107
            goto L111
        L107:
            int r10 = android.graphics.Color.parseColor(r13)
            y9.f r13 = new y9.f
            r13.<init>(r10, r10)
            goto Lde
        L111:
            java.lang.String r2 = ib.b.a(r23, r24)
            java.lang.String r13 = "custom_text_color_"
            java.lang.String r2 = r13.concat(r2)
            java.lang.String r2 = r4.getString(r2, r9)
            if (r2 == 0) goto L122
            goto L123
        L122:
            r2 = r9
        L123:
            y9.f r2 = a7.a.G(r2)
            if (r2 == 0) goto L12a
            goto L165
        L12a:
            int r2 = r8.length()
            r8 = -1
            java.lang.String r13 = "#FFFFFF"
            if (r2 <= 0) goto L146
            java.lang.String r2 = "custom_text_color"
            java.lang.String r2 = r4.getString(r2, r13)
            y9.f r2 = a7.a.G(r2)
            if (r2 == 0) goto L140
            goto L165
        L140:
            y9.f r2 = new y9.f
            r2.<init>(r8, r8)
            goto L165
        L146:
            if (r7 == r12) goto L150
            if (r7 == r11) goto L14d
            java.lang.String r2 = "member_text_color"
            goto L152
        L14d:
            java.lang.String r2 = "owner_text_color"
            goto L152
        L150:
            java.lang.String r2 = "admin_text_color"
        L152:
            java.lang.String r2 = r4.getString(r2, r13)
            if (r2 == 0) goto L159
            r13 = r2
        L159:
            y9.f r2 = a7.a.G(r13)
            if (r2 == 0) goto L160
            goto L165
        L160:
            y9.f r2 = new y9.f
            r2.<init>(r8, r8)
        L165:
            int r4 = r0.getVisibility()
            if (r4 == 0) goto L16d
            r4 = r12
            goto L16e
        L16d:
            r4 = r6
        L16e:
            if (r4 == 0) goto L173
            r0.setVisibility(r6)
        L173:
            java.lang.ThreadLocal r7 = r1.f22339h
            java.lang.Object r8 = r7.get()
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            boolean r8 = gg.l.a(r8, r11)
            if (r8 == 0) goto L183
            goto L209
        L183:
            r7.set(r11)     // Catch: java.lang.Throwable -> L1b9
            a9.c r8 = a9.i.d(r0)     // Catch: java.lang.Throwable -> L1b9
            java.lang.CharSequence r11 = a9.i.c(r0)     // Catch: java.lang.Throwable -> L1b9
            android.text.SpannableStringBuilder r13 = new android.text.SpannableStringBuilder     // Catch: java.lang.Throwable -> L1b9
            if (r4 == 0) goto L193
            goto L194
        L193:
            r9 = r11
        L194:
            r13.<init>(r9)     // Catch: java.lang.Throwable -> L1b9
            k(r13)     // Catch: java.lang.Throwable -> L1b9
            e(r13)     // Catch: java.lang.Throwable -> L1b9
            java.lang.String r4 = r13.toString()     // Catch: java.lang.Throwable -> L1b9
            r4.getClass()     // Catch: java.lang.Throwable -> L1b9
            java.lang.String r3 = j(r4, r3)     // Catch: java.lang.Throwable -> L1b9
            java.lang.String r4 = r13.toString()     // Catch: java.lang.Throwable -> L1b9
            boolean r4 = gg.l.a(r4, r3)     // Catch: java.lang.Throwable -> L1b9
            if (r4 != 0) goto L1bb
            r13.clear()     // Catch: java.lang.Throwable -> L1b9
            r13.append(r3)     // Catch: java.lang.Throwable -> L1b9
            goto L1bb
        L1b9:
            r0 = move-exception
            goto L203
        L1bb:
            a9.d r3 = a9.i.e(r8)     // Catch: java.lang.Throwable -> L1b9
            r3.f84a = r13     // Catch: java.lang.Throwable -> L1b9
            a9.i.a(r8)     // Catch: java.lang.Throwable -> L1b9
            r0.setHorizontallyScrolling(r6)     // Catch: java.lang.Throwable -> L1d4
            r3 = 0
            r0.setEllipsize(r3)     // Catch: java.lang.Throwable -> L1d4
            r0.setSingleLine(r6)     // Catch: java.lang.Throwable -> L1d4
            r3 = 2147483647(0x7fffffff, float:NaN)
            r0.setMaxLines(r3)     // Catch: java.lang.Throwable -> L1d4
        L1d4:
            java.util.Map r0 = a9.i.f102a     // Catch: java.lang.Throwable -> L1b9
            int r0 = r10.f22342a     // Catch: java.lang.Throwable -> L1b9
            int r3 = r10.f22343b     // Catch: java.lang.Throwable -> L1b9
            int r4 = r2.f22342a     // Catch: java.lang.Throwable -> L1b9
            int r2 = r2.f22343b     // Catch: java.lang.Throwable -> L1b9
            wb.zh r6 = new wb.zh     // Catch: java.lang.Throwable -> L1b9
            r9 = 16
            r6.<init>(r1, r8, r5, r9)     // Catch: java.lang.Throwable -> L1b9
            a9.d r5 = a9.i.f(r8)     // Catch: java.lang.Throwable -> L1b9
            a9.g r14 = new a9.g     // Catch: java.lang.Throwable -> L1b9
            r16 = r0
            r19 = r2
            r17 = r3
            r18 = r4
            r20 = r6
            r14.<init>(r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> L1b9
            r5.f86c = r14     // Catch: java.lang.Throwable -> L1b9
            a9.i.a(r8)     // Catch: java.lang.Throwable -> L1b9
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r7.set(r0)
            return r12
        L203:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r7.set(r2)
            throw r0
        L209:
            return r6
    }

    public final java.util.List c(java.lang.String... r5) {
            r4 = this;
            r8.g r0 = r4.f22332a
            org.luckypray.dexkit.DexKitBridge r1 = r0.f11623d     // Catch: java.lang.Throwable -> L4c
            ch.e r2 = new ch.e     // Catch: java.lang.Throwable -> L4c
            r2.<init>()     // Catch: java.lang.Throwable -> L4c
            fh.k r3 = new fh.k     // Catch: java.lang.Throwable -> L4c
            r3.<init>()     // Catch: java.lang.Throwable -> L4c
            java.util.List r5 = tf.l.L0(r5)     // Catch: java.lang.Throwable -> L4c
            fh.k.u0(r3, r5)     // Catch: java.lang.Throwable -> L4c
            r2.f1666h = r3     // Catch: java.lang.Throwable -> L4c
            hh.p r5 = r1.findMethod(r2)     // Catch: java.lang.Throwable -> L4c
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L4c
            r1.<init>()     // Catch: java.lang.Throwable -> L4c
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L4c
        L24:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Throwable -> L4c
            if (r2 == 0) goto L52
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Throwable -> L4c
            hh.o r2 = (hh.o) r2     // Catch: java.lang.Throwable -> L4c
            java.lang.ClassLoader r3 = r0.f11622c     // Catch: java.lang.Throwable -> L37
            java.lang.reflect.Method r2 = r2.r(r3)     // Catch: java.lang.Throwable -> L37
            goto L3e
        L37:
            r2 = move-exception
            sf.f r3 = new sf.f     // Catch: java.lang.Throwable -> L4c
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L4c
            r2 = r3
        L3e:
            boolean r3 = r2 instanceof sf.f     // Catch: java.lang.Throwable -> L4c
            if (r3 == 0) goto L44
            r2 = 0
        L44:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> L4c
            if (r2 == 0) goto L24
            r1.add(r2)     // Catch: java.lang.Throwable -> L4c
            goto L24
        L4c:
            r5 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r5)
        L52:
            java.lang.Throwable r5 = sf.g.b(r1)
            if (r5 != 0) goto L59
            goto L62
        L59:
            y9.b r0 = r4.f22334c
            java.lang.String r1 = "群员头衔定位方法失败"
            r0.invoke(r1, r5)
            tf.t r1 = tf.t.f13167g
        L62:
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    public final java.lang.reflect.Field d(java.lang.Class r10) {
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L5
            goto L78
        L5:
            java.util.concurrent.ConcurrentHashMap r1 = r9.f22337f
            java.lang.Object r2 = r1.get(r10)
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            if (r2 == 0) goto L10
            return r2
        L10:
            r2 = r10
        L11:
            if (r2 == 0) goto L78
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L78
            java.util.List r3 = h.Hchat.utils.KavaReflector.declaredFields(r2)
            java.util.Iterator r3 = r3.iterator()
        L23:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L6a
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            java.lang.Class r6 = r5.getType()
            java.lang.Class<android.widget.TextView> r7 = android.widget.TextView.class
            boolean r6 = gg.l.a(r6, r7)
            r7 = 0
            if (r6 == 0) goto L67
            java.lang.String r6 = r5.getName()
            java.lang.String r8 = "userTV"
            boolean r6 = gg.l.a(r6, r8)
            if (r6 != 0) goto L66
            java.lang.String r6 = r5.getName()
            java.lang.String r8 = "brc"
            boolean r6 = gg.l.a(r6, r8)
            if (r6 != 0) goto L66
            java.lang.String r5 = r5.getName()
            r5.getClass()
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.String r8 = "user"
            boolean r5 = bc.e.t(r5, r6, r8, r7)
            if (r5 == 0) goto L67
        L66:
            r7 = 1
        L67:
            if (r7 == 0) goto L23
            goto L6b
        L6a:
            r4 = r0
        L6b:
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            if (r4 == 0) goto L73
            r1.put(r10, r4)
            return r4
        L73:
            java.lang.Class r2 = r2.getSuperclass()
            goto L11
        L78:
            return r0
    }

    public final boolean f(java.lang.Class r14) {
            r13 = this;
            r0 = 0
            if (r14 != 0) goto L4
            return r0
        L4:
            java.util.concurrent.ConcurrentHashMap r1 = r13.f22338g
            java.lang.Object r2 = r1.get(r14)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            if (r2 == 0) goto L13
            boolean r14 = r2.booleanValue()
            return r14
        L13:
            java.lang.String r2 = r14.getName()
            java.lang.String r3 = "com.tencent.mm.storage."
            boolean r2 = og.t.d0(r2, r3, r0)
            r3 = 1
            if (r2 != 0) goto L74
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredMethods(r14)
            if (r2 == 0) goto L2d
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L2d
            goto L75
        L2d:
            java.util.Iterator r2 = r2.iterator()
        L31:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L75
            java.lang.Object r4 = r2.next()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.Class r5 = r4.getReturnType()
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            boolean r5 = gg.l.a(r5, r6)
            if (r5 == 0) goto L71
            java.lang.Class[] r5 = r4.getParameterTypes()
            r5.getClass()
            int r5 = r5.length
            if (r5 != 0) goto L71
            java.lang.String r11 = "getSender"
            java.lang.String r12 = "getSendTalker"
            java.lang.String r6 = "R1"
            java.lang.String r7 = "P1"
            java.lang.String r8 = "o0"
            java.lang.String r9 = "x0"
            java.lang.String r10 = "j0"
            java.lang.String[] r5 = new java.lang.String[]{r6, r7, r8, r9, r10, r11, r12}
            java.lang.String r4 = r4.getName()
            boolean r4 = tf.l.m0(r5, r4)
            if (r4 == 0) goto L71
            r4 = r3
            goto L72
        L71:
            r4 = r0
        L72:
            if (r4 == 0) goto L31
        L74:
            r0 = r3
        L75:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r1.put(r14, r2)
            return r0
    }

    public final boolean i(java.lang.reflect.Method r6) {
            r5 = this;
            java.lang.Class[] r6 = r6.getParameterTypes()
            int r0 = r6.length
            r1 = 3
            r2 = 0
            if (r0 < r1) goto L43
            int r0 = r6.length
            r1 = r2
        Lb:
            if (r1 >= r0) goto L43
            r3 = r6[r1]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            boolean r3 = gg.l.a(r3, r4)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L40
            int r0 = r6.length
            r1 = r2
        L21:
            if (r1 >= r0) goto L43
            r3 = r6[r1]
            boolean r3 = r5.f(r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L3d
            r6 = r6[r2]
            java.lang.reflect.Field r6 = r5.d(r6)
            if (r6 == 0) goto L43
            r6 = 1
            return r6
        L3d:
            int r1 = r1 + 1
            goto L21
        L40:
            int r1 = r1 + 1
            goto Lb
        L43:
            return r2
    }

    public final void l(android.widget.TextView r5) {
            r4 = this;
            a9.c r0 = a9.i.b(r5)
            if (r0 == 0) goto L14
            a9.d r1 = a9.i.f(r0)
            a9.g r2 = new a9.g
            r2.<init>()
            r1.f86c = r2
            a9.i.a(r0)
        L14:
            java.lang.CharSequence r0 = r5.getText()
            if (r0 == 0) goto L47
            java.lang.ThreadLocal r1 = r4.f22339h
            java.lang.Object r2 = r1.get()
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r2 = gg.l.a(r2, r3)
            if (r2 == 0) goto L29
            goto L47
        L29:
            r1.set(r3)     // Catch: java.lang.Throwable -> L40
            android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder     // Catch: java.lang.Throwable -> L40
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L40
            k(r2)     // Catch: java.lang.Throwable -> L40
            e(r2)     // Catch: java.lang.Throwable -> L40
            r5.setText(r2)     // Catch: java.lang.Throwable -> L40
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r1.set(r5)
            return
        L40:
            r5 = move-exception
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.set(r0)
            throw r5
        L47:
            return
    }
}
