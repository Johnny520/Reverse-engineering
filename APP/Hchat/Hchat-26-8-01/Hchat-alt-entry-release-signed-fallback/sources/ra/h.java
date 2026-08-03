package ra;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.ClassLoader f11861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l3.l f11862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final na.b f11863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final na.b f11864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final na.b f11865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final na.b f11866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.WeakHashMap f11867g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.WeakHashMap f11868h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f11869i;

    public h(java.lang.ClassLoader r2, l3.l r3, na.b r4, na.b r5, na.b r6, na.b r7) {
            r1 = this;
            r1.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r1.f11867g = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r1.f11868h = r0
            r1.f11861a = r2
            r1.f11862b = r3
            r1.f11863c = r4
            r1.f11864d = r5
            r1.f11865e = r6
            r1.f11866f = r7
            return
    }

    public static void a(ra.h r42, java.lang.Object r43, java.lang.String r44, boolean r45) {
            r1 = r42
            r0 = r43
            java.util.WeakHashMap r2 = r1.f11868h
            java.util.WeakHashMap r3 = r1.f11867g
            l3.l r4 = r1.f11862b
            boolean r5 = r0 instanceof android.app.Activity
            if (r5 != 0) goto L10
            goto L1fa
        L10:
            boolean r5 = r4.e()
            if (r5 == 0) goto L1fa
            java.lang.String r5 = "hb_grab_mode"
            r6 = 1
            android.content.SharedPreferences r7 = r4.b()     // Catch: java.lang.Throwable -> L22
            int r5 = r7.getInt(r5, r6)     // Catch: java.lang.Throwable -> L22
            goto L23
        L22:
            r5 = r6
        L23:
            if (r5 != r6) goto L27
            goto L1fa
        L27:
            r5 = r0
            android.app.Activity r5 = (android.app.Activity) r5
            r7 = 0
            android.content.Intent r8 = r5.getIntent()     // Catch: java.lang.Throwable -> L39
            if (r8 == 0) goto L39
            java.lang.String r9 = "key_native_url"
            java.lang.String r8 = r8.getStringExtra(r9)     // Catch: java.lang.Throwable -> L39
            r14 = r8
            goto L3a
        L39:
            r14 = r7
        L3a:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "领取页"
            r8.<init>(r9)
            r9 = r44
            r8.append(r9)
            java.lang.String r9 = ": nativeurl="
            r8.append(r9)
            r8.append(r14)
            java.lang.String r8 = r8.toString()
            r1.o(r8)
            na.b r8 = r1.f11863c
            r15 = 0
            if (r8 == 0) goto Ld6
            na.e r9 = r8.f9099h
            na.k r8 = r9.f9112f
            boolean r10 = android.text.TextUtils.isEmpty(r14)
            if (r10 != 0) goto L9b
            java.util.concurrent.ConcurrentHashMap r10 = r8.f9181f
            java.lang.Object r10 = r10.get(r14)
            java.lang.String r10 = (java.lang.String) r10
            java.util.concurrent.ConcurrentHashMap r11 = r8.f9182g
            java.lang.Object r11 = r11.get(r14)
            r12 = r11
            java.lang.String r12 = (java.lang.String) r12
            java.util.concurrent.ConcurrentHashMap r8 = r8.f9183h
            java.lang.Object r8 = r8.get(r14)
            r11 = r8
            java.lang.String r11 = (java.lang.String) r11
            boolean r8 = android.text.TextUtils.isEmpty(r12)
            if (r8 != 0) goto L8a
            java.lang.String r7 = "exclusive_recv_username"
            java.lang.String r7 = oa.b.e(r12, r7)
        L8a:
            r13 = r7
            java.lang.String r7 = r9.b(r10, r11, r12, r13, r14)
            if (r7 == 0) goto Ld6
            java.lang.String r0 = "实时检查忽略: "
            java.lang.String r0 = r0.concat(r7)
            r9.d(r0)
            return
        L9b:
            int r7 = r9.f9127u
            java.lang.String r9 = r9.f9128v
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 != 0) goto Ld6
            java.util.concurrent.ConcurrentLinkedDeque r10 = r8.f9185j
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto Lae
            goto Ld6
        Lae:
            java.util.concurrent.ConcurrentLinkedDeque r8 = r8.f9185j
            java.util.Iterator r8 = r8.iterator()
        Lb4:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto Lc8
            java.lang.Object r10 = r8.next()
            java.lang.String r10 = (java.lang.String) r10
            boolean r10 = oa.b.b(r10, r9)
            if (r10 == 0) goto Lb4
            r8 = r6
            goto Lc9
        Lc8:
            r8 = r15
        Lc9:
            if (r7 != r6) goto Lcf
            if (r8 != 0) goto Lcf
            goto L1fa
        Lcf:
            r9 = 2
            if (r7 != r9) goto Ld6
            if (r8 == 0) goto Ld6
            goto L1fa
        Ld6:
            if (r45 == 0) goto L1d3
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            java.lang.Object r8 = r3.get(r5)
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L1d3
            java.lang.Object r8 = r3.get(r5)
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto Lf0
            goto L1d3
        Lf0:
            java.lang.String r40 = "n"
            java.lang.String r41 = "o"
            java.lang.String r16 = "p"
            java.lang.String r17 = "q"
            java.lang.String r18 = "r"
            java.lang.String r19 = "s"
            java.lang.String r20 = "t"
            java.lang.String r21 = "u"
            java.lang.String r22 = "v"
            java.lang.String r23 = "w"
            java.lang.String r24 = "x"
            java.lang.String r25 = "y"
            java.lang.String r26 = "z"
            java.lang.String r27 = "a"
            java.lang.String r28 = "b"
            java.lang.String r29 = "c"
            java.lang.String r30 = "d"
            java.lang.String r31 = "e"
            java.lang.String r32 = "f"
            java.lang.String r33 = "g"
            java.lang.String r34 = "h"
            java.lang.String r35 = "i"
            java.lang.String r36 = "j"
            java.lang.String r37 = "k"
            java.lang.String r38 = "l"
            java.lang.String r39 = "m"
            java.lang.String[] r7 = new java.lang.String[]{r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41}
            r8 = r15
        L129:
            r9 = 26
            if (r8 >= r9) goto L168
            r9 = r7[r8]
            java.lang.Object r10 = h.Hchat.utils.KavaReflector.readField(r0, r9)     // Catch: java.lang.Throwable -> L165
            boolean r11 = r10 instanceof android.widget.Button     // Catch: java.lang.Throwable -> L165
            if (r11 == 0) goto L165
            r11 = r10
            android.view.View r11 = (android.view.View) r11     // Catch: java.lang.Throwable -> L165
            boolean r11 = r1.n(r11)     // Catch: java.lang.Throwable -> L165
            if (r11 != 0) goto L165
            r11 = r10
            android.widget.Button r11 = (android.widget.Button) r11     // Catch: java.lang.Throwable -> L165
            r1.e(r11)     // Catch: java.lang.Throwable -> L165
            android.view.View r10 = (android.view.View) r10     // Catch: java.lang.Throwable -> L165
            java.lang.Boolean r11 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L165
            r2.put(r10, r11)     // Catch: java.lang.Throwable -> L165
            r3.put(r5, r11)     // Catch: java.lang.Throwable -> L165
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L165
            r10.<init>()     // Catch: java.lang.Throwable -> L165
            java.lang.String r11 = "通过字段点击红包按钮: "
            r10.append(r11)     // Catch: java.lang.Throwable -> L165
            r10.append(r9)     // Catch: java.lang.Throwable -> L165
            java.lang.String r9 = r10.toString()     // Catch: java.lang.Throwable -> L165
            r1.o(r9)     // Catch: java.lang.Throwable -> L165
            goto L1d3
        L165:
            int r8 = r8 + 1
            goto L129
        L168:
            java.lang.Class r7 = r0.getClass()     // Catch: java.lang.Throwable -> L1c0
            java.util.List r7 = h.Hchat.utils.KavaReflector.declaredFields(r7)     // Catch: java.lang.Throwable -> L1c0
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L1c0
        L174:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> L1c0
            if (r8 == 0) goto L1c0
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L1c0
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8     // Catch: java.lang.Throwable -> L1c0
            java.lang.Object r9 = h.Hchat.utils.KavaReflector.readField(r8, r0)     // Catch: java.lang.Throwable -> L1c0
            boolean r10 = r9 instanceof android.widget.Button     // Catch: java.lang.Throwable -> L1c0
            if (r10 != 0) goto L189
            goto L174
        L189:
            android.widget.Button r9 = (android.widget.Button) r9     // Catch: java.lang.Throwable -> L1c0
            boolean r10 = r1.n(r9)     // Catch: java.lang.Throwable -> L1c0
            if (r10 == 0) goto L192
            goto L174
        L192:
            java.lang.String r10 = i(r9)     // Catch: java.lang.Throwable -> L1c0
            boolean r10 = m(r10, r6)     // Catch: java.lang.Throwable -> L1c0
            if (r10 == 0) goto L174
            r1.e(r9)     // Catch: java.lang.Throwable -> L1c0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L1c0
            r2.put(r9, r0)     // Catch: java.lang.Throwable -> L1c0
            r3.put(r5, r0)     // Catch: java.lang.Throwable -> L1c0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c0
            r0.<init>()     // Catch: java.lang.Throwable -> L1c0
            java.lang.String r2 = "遍历字段点击红包按钮: "
            r0.append(r2)     // Catch: java.lang.Throwable -> L1c0
            java.lang.String r2 = r8.getName()     // Catch: java.lang.Throwable -> L1c0
            r0.append(r2)     // Catch: java.lang.Throwable -> L1c0
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1c0
            r1.o(r0)     // Catch: java.lang.Throwable -> L1c0
            goto L1d3
        L1c0:
            android.view.Window r0 = r5.getWindow()
            android.view.View r0 = r0.getDecorView()
            boolean r0 = r1.g(r0)
            if (r0 == 0) goto L1d3
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r3.put(r5, r0)
        L1d3:
            android.os.Handler r6 = new android.os.Handler
            android.os.Looper r0 = r5.getMainLooper()
            r6.<init>(r0)
            java.lang.String r0 = "hb_check_times"
            r2 = 10
            android.content.SharedPreferences r3 = r4.b()     // Catch: java.lang.Throwable -> L1e8
            int r2 = r3.getInt(r0, r2)     // Catch: java.lang.Throwable -> L1e8
        L1e8:
            int[] r4 = new int[]{r15}
            ra.f r0 = new ra.f
            r3 = r5
            r5 = r2
            r2 = r3
            r3 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r1 = 300(0x12c, double:1.48E-321)
            r6.postDelayed(r0, r1)
        L1fa:
            return
    }

    public static void b(ra.h r10, android.app.Activity r11) {
            l3.l r0 = r10.f11862b
            boolean r1 = r0.e()
            if (r1 != 0) goto L9
            return
        L9:
            android.content.Intent r1 = r11.getIntent()     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L17
            java.lang.String r2 = "key_native_url"
            java.lang.String r1 = r1.getStringExtra(r2)     // Catch: java.lang.Throwable -> L17
        L15:
            r5 = r1
            goto L19
        L17:
            r1 = 0
            goto L15
        L19:
            r1 = 0
            android.content.Intent r2 = r11.getIntent()     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L2a
            java.lang.String r3 = "key_is_self_sent"
            boolean r2 = r2.getBooleanExtra(r3, r1)     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L2a
            r2 = 1
            goto L2b
        L2a:
            r2 = r1
        L2b:
            r6 = r2
            goto L2e
        L2d:
            r6 = r1
        L2e:
            android.os.Handler r9 = new android.os.Handler
            android.os.Looper r2 = r11.getMainLooper()
            r9.<init>(r2)
            java.lang.String r2 = "hb_check_times"
            r3 = 10
            android.content.SharedPreferences r0 = r0.b()     // Catch: java.lang.Throwable -> L43
            int r3 = r0.getInt(r2, r3)     // Catch: java.lang.Throwable -> L43
        L43:
            r0 = 3
            int r8 = java.lang.Math.max(r0, r3)
            int[] r7 = new int[]{r1}
            ra.g r2 = new ra.g
            r3 = r10
            r4 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r10 = 100
            r9.postDelayed(r2, r10)
            return
    }

    public static boolean c(android.view.View r3) {
            r0 = 0
            if (r3 != 0) goto L5
            goto L7d
        L5:
            boolean r1 = r3 instanceof android.widget.TextView
            if (r1 == 0) goto L61
            r1 = r3
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r1 = i(r1)
            java.lang.String r2 = "手慢了"
            boolean r2 = r1.contains(r2)
            if (r2 != 0) goto L78
            java.lang.String r2 = "红包派完了"
            boolean r2 = r1.contains(r2)
            if (r2 != 0) goto L78
            java.lang.String r2 = "已被领完"
            boolean r2 = r1.contains(r2)
            if (r2 != 0) goto L78
            java.lang.String r2 = "来晚了"
            boolean r2 = r1.contains(r2)
            if (r2 != 0) goto L78
            java.lang.String r2 = "已抢完"
            boolean r2 = r1.contains(r2)
            if (r2 != 0) goto L78
            java.lang.String r2 = "已领完"
            boolean r2 = r1.contains(r2)
            if (r2 != 0) goto L78
            java.lang.String r2 = "红包已被抢完"
            boolean r2 = r1.contains(r2)
            if (r2 != 0) goto L78
            java.lang.String r2 = "红包已领完"
            boolean r2 = r1.contains(r2)
            if (r2 != 0) goto L78
            java.lang.String r2 = "该红包已超过"
            boolean r2 = r1.contains(r2)
            if (r2 != 0) goto L78
            java.lang.String r2 = "已过期"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L61
            goto L78
        L61:
            boolean r1 = r3 instanceof android.view.ViewGroup
            if (r1 == 0) goto L7d
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r1 = r0
        L68:
            int r2 = r3.getChildCount()
            if (r1 >= r2) goto L7d
            android.view.View r2 = r3.getChildAt(r1)
            boolean r2 = c(r2)
            if (r2 == 0) goto L7a
        L78:
            r3 = 1
            return r3
        L7a:
            int r1 = r1 + 1
            goto L68
        L7d:
            return r0
    }

    public static boolean d(android.view.View r3) {
            r0 = 0
            if (r3 != 0) goto L4
            goto L3c
        L4:
            boolean r1 = r3 instanceof android.widget.TextView
            if (r1 == 0) goto L20
            r1 = r3
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r1 = i(r1)
            java.lang.String r2 = "已存入"
            boolean r2 = r1.contains(r2)
            if (r2 != 0) goto L37
            java.lang.String r2 = ".*\\d+\\.\\d+元.*"
            boolean r1 = r1.matches(r2)
            if (r1 == 0) goto L20
            goto L37
        L20:
            boolean r1 = r3 instanceof android.view.ViewGroup
            if (r1 == 0) goto L3c
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r1 = r0
        L27:
            int r2 = r3.getChildCount()
            if (r1 >= r2) goto L3c
            android.view.View r2 = r3.getChildAt(r1)
            boolean r2 = d(r2)
            if (r2 == 0) goto L39
        L37:
            r3 = 1
            return r3
        L39:
            int r1 = r1 + 1
            goto L27
        L3c:
            return r0
    }

    public static java.lang.String f(android.view.View r4) {
            if (r4 != 0) goto L3
            goto L69
        L3:
            boolean r0 = r4 instanceof android.widget.TextView
            r1 = 0
            if (r0 == 0) goto L4f
            r0 = r4
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r0 = i(r0)
            java.lang.String r2 = "(\\d+(?:\\.\\d+)?)\\s*元"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.util.regex.Matcher r2 = r2.matcher(r0)
            boolean r3 = r2.find()
            if (r3 == 0) goto L24
            java.lang.String r4 = r2.group(r1)
            return r4
        L24:
            java.lang.String r2 = "(\\d+(?:\\.\\d+)?)"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.util.regex.Matcher r0 = r2.matcher(r0)
            boolean r2 = r0.find()
            if (r2 == 0) goto L4f
            r2 = 1
            java.lang.String r0 = r0.group(r2)
            int r2 = r0.length()
            r3 = 6
            if (r2 > r3) goto L4f
            java.lang.String r2 = "."
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L4f
            java.lang.String r4 = "元"
            java.lang.String r4 = r0.concat(r4)
            return r4
        L4f:
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L69
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
        L55:
            int r0 = r4.getChildCount()
            if (r1 >= r0) goto L69
            android.view.View r0 = r4.getChildAt(r1)
            java.lang.String r0 = f(r0)
            if (r0 == 0) goto L66
            return r0
        L66:
            int r1 = r1 + 1
            goto L55
        L69:
            r4 = 0
            return r4
    }

    public static android.widget.TextView h(android.view.View r3) {
            if (r3 != 0) goto L3
            goto L32
        L3:
            boolean r0 = r3 instanceof android.widget.TextView
            if (r0 == 0) goto L17
            r0 = r3
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = i(r0)
            java.lang.String r2 = "已存入"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L17
            return r0
        L17:
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto L32
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r0 = 0
        L1e:
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L32
            android.view.View r1 = r3.getChildAt(r0)
            android.widget.TextView r1 = h(r1)
            if (r1 == 0) goto L2f
            return r1
        L2f:
            int r0 = r0 + 1
            goto L1e
        L32:
            r3 = 0
            return r3
    }

    public static java.lang.String i(android.widget.TextView r0) {
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto Lb
            java.lang.String r0 = r0.toString()
            return r0
        Lb:
            java.lang.String r0 = ""
            return r0
    }

    public static boolean m(java.lang.String r1, boolean r2) {
            java.lang.String r0 = "開"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L23
            java.lang.String r0 = "拆"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L23
            java.lang.String r0 = "领取"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L23
            if (r2 == 0) goto L21
            int r1 = r1.length()
            if (r1 != 0) goto L21
            goto L23
        L21:
            r1 = 0
            return r1
        L23:
            r1 = 1
            return r1
    }

    public final void e(android.view.View r3) {
            r2 = this;
            r0 = 1
            r3.setEnabled(r0)
            a1.d r0 = new a1.d
            r1 = 29
            r0.<init>(r2, r1, r3)
            r3.post(r0)
            return
    }

    public final boolean g(android.view.View r7) {
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L74
            boolean r1 = r6.n(r7)
            if (r1 == 0) goto La
            goto L74
        La:
            boolean r1 = r7 instanceof android.widget.Button
            java.util.WeakHashMap r2 = r6.f11868h
            r3 = 1
            if (r1 == 0) goto L39
            r1 = r7
            android.widget.Button r1 = (android.widget.Button) r1
            java.lang.CharSequence r4 = r7.getContentDescription()
            java.lang.String r5 = i(r1)
            boolean r5 = m(r5, r0)
            if (r5 != 0) goto L30
            if (r4 == 0) goto L39
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "開"
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L39
        L30:
            r6.e(r1)
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r2.put(r1, r7)
            return r3
        L39:
            boolean r1 = r7.isClickable()
            if (r1 == 0) goto L59
            boolean r1 = r7 instanceof android.widget.TextView
            if (r1 == 0) goto L59
            r1 = r7
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r1 = i(r1)
            boolean r1 = m(r1, r0)
            if (r1 == 0) goto L59
            r6.e(r7)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.put(r7, r0)
            return r3
        L59:
            boolean r1 = r7 instanceof android.view.ViewGroup
            if (r1 == 0) goto L74
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r1 = r0
        L60:
            int r2 = r7.getChildCount()
            if (r1 >= r2) goto L74
            android.view.View r2 = r7.getChildAt(r1)
            boolean r2 = r6.g(r2)
            if (r2 == 0) goto L71
            return r3
        L71:
            int r1 = r1 + 1
            goto L60
        L74:
            return r0
    }

    public final boolean j(java.lang.Class r3, java.lang.String r4, java.lang.Class[] r5, de.robv.android.xposed.XC_MethodHook r6) {
            r2 = this;
            r0 = 0
            if (r5 != 0) goto Lc
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> La
            java.lang.reflect.Method r5 = h.Hchat.utils.KavaReflector.findDeclaredMethod(r3, r4, r5)     // Catch: java.lang.Throwable -> La
            goto L10
        La:
            r5 = move-exception
            goto L1a
        Lc:
            java.lang.reflect.Method r5 = h.Hchat.utils.KavaReflector.findDeclaredMethod(r3, r4, r5)     // Catch: java.lang.Throwable -> La
        L10:
            if (r5 != 0) goto L13
            return r0
        L13:
            r8.i r1 = r8.i.f11631b     // Catch: java.lang.Throwable -> La
            r1.b(r5, r6)     // Catch: java.lang.Throwable -> La
            r3 = 1
            return r3
        L1a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "Hook红包页面方法失败: "
            r6.<init>(r1)
            java.lang.String r3 = r3.getName()
            r6.append(r3)
            java.lang.String r3 = "."
            r6.append(r3)
            r6.append(r4)
            java.lang.String r3 = " | "
            r6.append(r3)
            java.lang.String r3 = r5.getMessage()
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            r2.o(r3)
            return r0
    }

    public final void k(java.lang.Class r5, java.lang.String r6) {
            r4 = this;
            if (r5 != 0) goto L3
            goto L50
        L3:
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            ra.e r1 = new ra.e
            r2 = 5
            r1.<init>(r4, r2)
            java.lang.String r2 = "onCreate"
            boolean r0 = r4.j(r5, r2, r0, r1)
            java.lang.String r1 = "Hook详情页: "
            if (r0 == 0) goto L2d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r2 = ".onCreate"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r4.o(r0)
        L2d:
            ra.e r0 = new ra.e
            r2 = 6
            r0.<init>(r4, r2)
            java.lang.String r2 = "onResume"
            r3 = 0
            boolean r5 = r4.j(r5, r2, r3, r0)
            if (r5 == 0) goto L50
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            r5.append(r6)
            java.lang.String r6 = ".onResume"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.o(r5)
        L50:
            return
    }

    public final void l(java.lang.Class r7, java.lang.String r8) {
            r6 = this;
            if (r7 != 0) goto L4
            goto Lb4
        L4:
            ra.e r0 = new ra.e
            r1 = 0
            r0.<init>(r6, r1)
            java.lang.String r1 = "initView"
            r2 = 0
            boolean r0 = r6.j(r7, r1, r2, r0)
            java.lang.String r1 = "Hook领取页: "
            if (r0 == 0) goto L29
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r3 = ".initView"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r6.o(r0)
        L29:
            java.lang.Class<android.os.Bundle> r0 = android.os.Bundle.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            ra.e r3 = new ra.e
            r4 = 1
            r3.<init>(r6, r4)
            java.lang.String r4 = "onCreate"
            r6.j(r7, r4, r0, r3)
            ra.e r0 = new ra.e
            r3 = 2
            r0.<init>(r6, r3)
            java.lang.String r3 = "onResume"
            r6.j(r7, r3, r2, r0)
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredMethods(r7)     // Catch: java.lang.Throwable -> L92
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L92
        L4d:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L92
            if (r3 == 0) goto La9
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L92
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.Throwable -> L92
            java.lang.String r4 = "onSceneEnd"
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L92
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L92
            if (r4 != 0) goto L66
            goto L4d
        L66:
            java.lang.Class[] r4 = r3.getParameterTypes()     // Catch: java.lang.Throwable -> L92
            int r4 = r4.length     // Catch: java.lang.Throwable -> L92
            r5 = 4
            if (r4 == r5) goto L6f
            goto L4d
        L6f:
            r8.i r0 = r8.i.f11631b     // Catch: java.lang.Throwable -> L92
            ra.e r4 = new ra.e     // Catch: java.lang.Throwable -> L92
            r5 = 3
            r4.<init>(r6, r5)     // Catch: java.lang.Throwable -> L92
            r0.b(r3, r4)     // Catch: java.lang.Throwable -> L92
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L92
            r0.<init>()     // Catch: java.lang.Throwable -> L92
            r0.append(r1)     // Catch: java.lang.Throwable -> L92
            r0.append(r8)     // Catch: java.lang.Throwable -> L92
            java.lang.String r1 = ".onSceneEnd"
            r0.append(r1)     // Catch: java.lang.Throwable -> L92
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L92
            r6.o(r0)     // Catch: java.lang.Throwable -> L92
            goto La9
        L92:
            r0 = move-exception
            java.lang.String r1 = "Hook领取页onSceneEnd失败: "
            java.lang.String r3 = " | "
            java.lang.StringBuilder r8 = bc.e.o(r1, r8, r3)
            java.lang.String r0 = r0.getMessage()
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            r6.o(r8)
        La9:
            java.lang.String r8 = "onDestroy"
            ra.e r0 = new ra.e     // Catch: java.lang.Throwable -> Lb4
            r1 = 4
            r0.<init>(r6, r1)     // Catch: java.lang.Throwable -> Lb4
            r6.j(r7, r8, r2, r0)     // Catch: java.lang.Throwable -> Lb4
        Lb4:
            return
    }

    public final boolean n(android.view.View r3) {
            r2 = this;
            if (r3 == 0) goto L12
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.util.WeakHashMap r1 = r2.f11868h
            java.lang.Object r3 = r1.get(r3)
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L12
            r3 = 1
            return r3
        L12:
            r3 = 0
            return r3
    }

    public final void o(java.lang.String r2) {
            r1 = this;
            na.b r0 = r1.f11866f
            if (r0 == 0) goto L9
            na.e r0 = r0.f9099h
            r0.d(r2)
        L9:
            return
    }
}
