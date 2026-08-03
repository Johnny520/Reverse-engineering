package r9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {
    public static final og.k G = null;
    public static final og.k H = null;
    public static final java.time.format.DateTimeFormatter I = null;
    public static final lg.f J = null;
    public static final lg.f K = null;
    public static final java.util.Set L = null;
    public static final java.util.LinkedHashSet M = null;
    public static final java.util.LinkedHashSet N = null;
    public final java.lang.ThreadLocal A;
    public volatile r9.z B;
    public volatile boolean C;
    public volatile boolean D;
    public java.lang.Class E;
    public volatile boolean F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r8.g f11653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ia.t f11654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.content.SharedPreferences f11655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.content.SharedPreferences f11656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final android.content.SharedPreferences f11657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.Set f11658f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.Set f11659g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f11660h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f11661i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f11662j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f11663k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f11664l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f11665m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f11666n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap.KeySetView f11667o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f11668p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f11669q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f11670r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f11671s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap.KeySetView f11672t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final java.util.Set f11673u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final java.util.WeakHashMap f11674v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final java.util.WeakHashMap f11675w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final java.util.WeakHashMap f11676x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final java.util.WeakHashMap f11677y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final java.util.WeakHashMap f11678z;

    static {
            og.k r0 = new og.k
            java.lang.String r1 = "\\$\\{([A-Za-z][A-Za-z0-9]*)\\}|\\$([A-Za-z][A-Za-z0-9]*)"
            r0.<init>(r1)
            r9.d0.G = r0
            og.k r0 = new og.k
            og.l r1 = og.l.f9834h
            og.l r2 = og.l.f9835i
            og.l[] r1 = new og.l[]{r1, r2}
            java.util.Set r1 = tf.d0.W(r1)
            java.lang.String r2 = "<atuserlist><!\\[CDATA\\[(.*?)]]></atuserlist>|<atuserlist>(.*?)</atuserlist>"
            r0.<init>(r2, r1)
            r9.d0.H = r0
            java.lang.String r0 = "HH:mm:ss"
            java.time.format.DateTimeFormatter r0 = java.time.format.DateTimeFormatter.ofPattern(r0)
            r9.d0.I = r0
            lg.f r0 = new lg.f
            r1 = 1262304000(0x4b3d3b00, double:6.23661041E-315)
            r3 = 4102444800(0xf4865700, double:2.0268770396E-314)
            r0.<init>(r1, r3)
            r9.d0.J = r0
            lg.f r0 = new lg.f
            r1 = 1262304000000(0x125e72e7800, double:6.23661041008E-312)
            r3 = 4102444800000(0x3bb2cc3d800, double:2.02687703964E-311)
            r0.<init>(r1, r3)
            r9.d0.K = r0
            java.lang.String r0 = "message_details_dark_bg"
            java.lang.String r1 = "message_details_dark_text"
            java.lang.String r2 = "message_details_light_bg"
            java.lang.String r3 = "message_details_light_text"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            java.util.Set r0 = tf.d0.W(r0)
            r9.d0.L = r0
            java.lang.String r1 = "message_details_left_margin"
            java.lang.String r2 = "message_details_right_margin"
            java.lang.String r3 = "message_details_position"
            java.lang.String r4 = "message_details_text_size"
            java.lang.String r5 = "message_details_avatar_gap"
            java.lang.String[] r1 = new java.lang.String[]{r3, r4, r5, r1, r2}
            java.util.Set r1 = tf.d0.W(r1)
            java.lang.String r2 = "message_details_time_format"
            java.lang.String r3 = "message_details_click_show"
            java.lang.String r4 = "message_details_format"
            java.lang.String[] r2 = new java.lang.String[]{r4, r2, r3}
            java.util.Set r2 = tf.d0.W(r2)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.LinkedHashSet r1 = tf.d0.U(r1, r2)
            r9.d0.M = r1
            java.util.LinkedHashSet r0 = tf.d0.U(r0, r1)
            java.lang.String r1 = "message_details_enable"
            java.util.Set r1 = ac.p.N(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.LinkedHashSet r0 = tf.d0.U(r0, r1)
            r9.d0.N = r0
            return
    }

    public d0(r8.g r6, ia.t r7) {
            r5 = this;
            r6.getClass()
            r5.<init>()
            r5.f11653a = r6
            r5.f11654b = r7
            android.content.Context r7 = r6.f11620a
            java.lang.String r0 = "Hchat_extra_config"
            android.content.SharedPreferences r7 = ub.b.c(r7, r0)
            r5.f11655c = r7
            android.content.Context r0 = r6.f11620a
            java.lang.String r1 = "Hchat_hide_chat_avatar_config"
            android.content.SharedPreferences r0 = ub.b.c(r0, r1)
            r5.f11656d = r0
            android.content.Context r6 = r6.f11620a
            java.lang.String r1 = "Hchat_extra_method_cache"
            android.content.SharedPreferences r6 = ub.b.c(r6, r1)
            r5.f11657e = r6
            java.util.Set r6 = j8.b.o()
            r5.f11658f = r6
            java.util.Set r6 = j8.b.o()
            r5.f11659g = r6
            java.util.concurrent.ConcurrentHashMap r6 = new java.util.concurrent.ConcurrentHashMap
            r6.<init>()
            r5.f11660h = r6
            java.util.concurrent.ConcurrentHashMap r6 = new java.util.concurrent.ConcurrentHashMap
            r6.<init>()
            r5.f11661i = r6
            java.util.concurrent.ConcurrentHashMap r6 = new java.util.concurrent.ConcurrentHashMap
            r6.<init>()
            r5.f11662j = r6
            java.util.concurrent.ConcurrentHashMap r6 = new java.util.concurrent.ConcurrentHashMap
            r6.<init>()
            r5.f11663k = r6
            java.util.concurrent.ConcurrentHashMap r6 = new java.util.concurrent.ConcurrentHashMap
            r6.<init>()
            r5.f11664l = r6
            java.util.concurrent.ConcurrentHashMap r6 = new java.util.concurrent.ConcurrentHashMap
            r6.<init>()
            r5.f11665m = r6
            java.util.concurrent.ConcurrentHashMap r6 = new java.util.concurrent.ConcurrentHashMap
            r6.<init>()
            r5.f11666n = r6
            java.util.concurrent.ConcurrentHashMap$KeySetView r6 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            r5.f11667o = r6
            java.util.concurrent.ConcurrentHashMap r6 = new java.util.concurrent.ConcurrentHashMap
            r6.<init>()
            r5.f11668p = r6
            java.util.concurrent.ConcurrentHashMap r6 = new java.util.concurrent.ConcurrentHashMap
            r6.<init>()
            r5.f11669q = r6
            java.util.concurrent.ConcurrentHashMap r6 = new java.util.concurrent.ConcurrentHashMap
            r6.<init>()
            r5.f11670r = r6
            java.util.concurrent.ConcurrentHashMap r6 = new java.util.concurrent.ConcurrentHashMap
            r6.<init>()
            r5.f11671s = r6
            java.util.concurrent.ConcurrentHashMap$KeySetView r6 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            r5.f11672t = r6
            java.util.WeakHashMap r6 = new java.util.WeakHashMap
            r6.<init>()
            java.util.Set r6 = java.util.Collections.newSetFromMap(r6)
            r5.f11673u = r6
            java.util.WeakHashMap r6 = new java.util.WeakHashMap
            r6.<init>()
            r5.f11674v = r6
            java.util.WeakHashMap r6 = new java.util.WeakHashMap
            r6.<init>()
            r5.f11675w = r6
            java.util.WeakHashMap r6 = new java.util.WeakHashMap
            r6.<init>()
            r5.f11676x = r6
            java.util.WeakHashMap r6 = new java.util.WeakHashMap
            r6.<init>()
            r5.f11677y = r6
            java.util.WeakHashMap r6 = new java.util.WeakHashMap
            r6.<init>()
            r5.f11678z = r6
            java.lang.ThreadLocal r6 = new java.lang.ThreadLocal
            r6.<init>()
            r5.A = r6
            r9.z r6 = r5.m0()
            r5.B = r6
            java.lang.String r6 = "hide_chat_avatar_self"
            r1 = 0
            boolean r6 = r0.getBoolean(r6, r1)
            r5.C = r6
            java.lang.String r6 = "hide_chat_avatar_other"
            boolean r6 = r0.getBoolean(r6, r1)
            r5.D = r6
            r9.b r6 = new r9.b
            r6.<init>(r5, r1)
            r9.b r1 = new r9.b
            r2 = 1
            r1.<init>(r5, r2)
            java.lang.String r2 = "message_details_format"
            boolean r3 = r7.contains(r2)
            if (r3 != 0) goto Led
            goto L107
        Led:
            r3 = 0
            java.lang.String r3 = r7.getString(r2, r3)
            java.lang.String r4 = "${time} | ${type}"
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto L107
            android.content.SharedPreferences$Editor r3 = r7.edit()
            java.lang.String r4 = "${time}"
            android.content.SharedPreferences$Editor r2 = r3.putString(r2, r4)
            r2.apply()
        L107:
            r9.z r2 = r5.m0()
            r5.B = r2
            r7.registerOnSharedPreferenceChangeListener(r6)
            r0.registerOnSharedPreferenceChangeListener(r1)
            return
    }

    public static boolean A0(android.view.View r6, android.view.View r7, java.util.WeakHashMap r8, fg.a r9) {
            h(r6, r8)
            android.view.ViewTreeObserver r1 = r7.getViewTreeObserver()
            boolean r7 = r1.isAlive()
            if (r7 != 0) goto Lf
            r6 = 0
            return r6
        Lf:
            gg.u r2 = new gg.u
            r2.<init>()
            r9.o r0 = new r9.o
            r5 = r6
            r3 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r2.f4564g = r0
            monitor-enter(r3)
            r9.a0 r6 = new r9.a0     // Catch: java.lang.Throwable -> L40
            java.lang.Object r7 = r2.f4564g     // Catch: java.lang.Throwable -> L40
            r8 = 0
            if (r7 == 0) goto L43
            android.view.ViewTreeObserver$OnPreDrawListener r7 = (android.view.ViewTreeObserver.OnPreDrawListener) r7     // Catch: java.lang.Throwable -> L40
            r6.<init>(r1, r7)     // Catch: java.lang.Throwable -> L40
            r3.put(r5, r6)     // Catch: java.lang.Throwable -> L40
            monitor-exit(r3)
            java.lang.Object r6 = r2.f4564g
            if (r6 == 0) goto L3a
            android.view.ViewTreeObserver$OnPreDrawListener r6 = (android.view.ViewTreeObserver.OnPreDrawListener) r6
            r1.addOnPreDrawListener(r6)
            r6 = 1
            return r6
        L3a:
            java.lang.String r6 = "listener"
            gg.l.g(r6)
            throw r8
        L40:
            r0 = move-exception
            r6 = r0
            goto L49
        L43:
            java.lang.String r6 = "listener"
            gg.l.g(r6)     // Catch: java.lang.Throwable -> L40
            throw r8     // Catch: java.lang.Throwable -> L40
        L49:
            monitor-exit(r3)
            throw r6
    }

    public static void C0(java.lang.Object r6) {
            java.lang.String r0 = "setKey"
            java.lang.String r1 = "hchat_group_member_history"
            java.lang.Object[] r2 = new java.lang.Object[]{r1}
            h.Hchat.utils.KavaReflector.invokeMethod(r6, r0, r2)
            java.lang.String r0 = "r"
            h.Hchat.utils.KavaReflector.writeField(r6, r0, r1)
            java.lang.String r0 = "q"
            h.Hchat.utils.KavaReflector.writeField(r6, r0, r1)
            java.lang.Class r0 = r6.getClass()
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredFields(r0)
            java.util.Iterator r0 = r0.iterator()
        L21:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4a
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.lang.Class r4 = r3.getType()
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            boolean r4 = gg.l.a(r4, r5)
            if (r4 == 0) goto L46
            int r3 = r3.getModifiers()
            boolean r3 = java.lang.reflect.Modifier.isFinal(r3)
            if (r3 != 0) goto L46
            r3 = 1
            goto L47
        L46:
            r3 = 0
        L47:
            if (r3 == 0) goto L21
            goto L4b
        L4a:
            r2 = 0
        L4b:
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            if (r2 == 0) goto L52
            h.Hchat.utils.KavaReflector.writeField(r2, r6, r1)
        L52:
            return
    }

    public static void D0(java.lang.String r8, java.lang.Object r9, boolean r10) {
            if (r10 == 0) goto Ld
            java.lang.String r0 = "i"
            h.Hchat.utils.KavaReflector.writeField(r9, r0, r8)
            java.lang.String r0 = "h"
            h.Hchat.utils.KavaReflector.writeField(r9, r0, r8)
            goto L17
        Ld:
            java.lang.String r0 = "n"
            h.Hchat.utils.KavaReflector.writeField(r9, r0, r8)
            java.lang.String r0 = "m"
            h.Hchat.utils.KavaReflector.writeField(r9, r0, r8)
        L17:
            java.lang.Class r0 = r9.getClass()
            java.util.ArrayList r0 = b0(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L28:
            boolean r2 = r0.hasNext()
            r3 = 1
            if (r2 == 0) goto L6e
            java.lang.Object r2 = r0.next()
            r4 = r2
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.Class[] r5 = r4.getParameterTypes()
            int r5 = r5.length
            r6 = 0
            if (r5 != r3) goto L67
            java.lang.Class[] r5 = r4.getParameterTypes()
            r5 = r5[r6]
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            boolean r5 = r5.isAssignableFrom(r7)
            if (r5 != 0) goto L5a
            java.lang.Class[] r5 = r4.getParameterTypes()
            r5 = r5[r6]
            java.lang.Class<java.lang.CharSequence> r7 = java.lang.CharSequence.class
            boolean r5 = r5.isAssignableFrom(r7)
            if (r5 == 0) goto L67
        L5a:
            java.lang.Class r4 = r4.getReturnType()
            java.lang.Class r5 = java.lang.Void.TYPE
            boolean r4 = gg.l.a(r4, r5)
            if (r4 == 0) goto L67
            goto L68
        L67:
            r3 = r6
        L68:
            if (r3 == 0) goto L28
            r1.add(r2)
            goto L28
        L6e:
            if (r10 == 0) goto L79
            java.lang.Object r10 = tf.m.w1(r3, r1)
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            if (r10 == 0) goto L79
            goto L7f
        L79:
            java.lang.Object r10 = tf.m.v1(r1)
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
        L7f:
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            h.Hchat.utils.KavaReflector.invoke(r10, r9, r8)
            return
    }

    public static final android.widget.TextView F0(android.content.Context r2, r9.d0 r3, java.lang.String r4) {
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r2)
            r3.setText(r4)
            r4 = 1093664768(0x41300000, float:11.0)
            r3.setTextSize(r4)
            r4 = 17
            r3.setGravity(r4)
            r4 = 150(0x96, float:2.1E-43)
            r0 = 243(0xf3, float:3.4E-43)
            r1 = 33
            int r4 = android.graphics.Color.rgb(r1, r4, r0)
            r3.setTextColor(r4)
            r4 = 1090519040(0x41000000, float:8.0)
            int r4 = l(r2, r4)
            r0 = 1082130432(0x40800000, float:4.0)
            int r2 = l(r2, r0)
            r3.setPadding(r4, r2, r4, r2)
            return r3
    }

    public static final java.lang.String G0(android.widget.EditText r0, java.lang.String r1, java.lang.String r2, r9.d0 r3) {
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto Lb
            java.lang.String r0 = r0.toString()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 != 0) goto L10
            java.lang.String r0 = ""
        L10:
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L17
            return r2
        L17:
            java.lang.String r1 = ">\\s+<"
            java.lang.String r2 = "><"
            java.lang.String r0 = j8.b.h(r1, r0, r2)
            return r0
    }

    public static final void H0(gg.q r5, android.widget.ScrollView r6, r9.d0 r7, android.widget.TextView r8, android.widget.LinearLayout r9, android.widget.EditText r10, int r11, android.widget.TextView r12, gg.u r13) {
            boolean r0 = r5.f4560g
            if (r0 == 0) goto L6
            goto Lb8
        L6:
            r0 = 1
            r5.f4560g = r0
            int r1 = r6.getScrollY()
            r7.getClass()
            java.lang.CharSequence r7 = r8.getText()
            r2 = 0
            if (r7 == 0) goto L1c
            int r7 = r7.length()
            goto L1d
        L1c:
            r7 = r2
        L1d:
            android.text.Layout r8 = r8.getLayout()
            if (r8 == 0) goto L29
            int r3 = r8.getLineCount()
            if (r3 > 0) goto L2b
        L29:
            r7 = r2
            goto L45
        L2b:
            if (r1 >= 0) goto L2f
            r3 = r2
            goto L30
        L2f:
            r3 = r1
        L30:
            int r3 = r8.getLineForVertical(r3)
            int r4 = r8.getLineCount()
            int r4 = r4 - r0
            int r0 = r9.e0.r(r3, r2, r4)
            int r8 = r8.getLineStart(r0)
            int r7 = r9.e0.r(r8, r2, r7)
        L45:
            r9.removeView(r6)
            android.widget.LinearLayout$LayoutParams r6 = new android.widget.LinearLayout$LayoutParams
            r8 = -1
            r6.<init>(r8, r11)
            r9.addView(r10, r6)
            r10.requestFocus()
            android.text.Editable r6 = r10.getText()
            if (r6 == 0) goto L5f
            int r6 = r6.length()
            goto L60
        L5f:
            r6 = r2
        L60:
            int r6 = r9.e0.r(r7, r2, r6)
            r10.setSelection(r6)
            f0.d r6 = new f0.d
            r7 = 2
            r6.<init>(r1, r7, r10)
            r10.post(r6)
            java.lang.String r6 = "编辑"
            r12.setText(r6)
            java.lang.Object r7 = r13.f4564g
            r9 = 0
            java.lang.String r10 = "dialog"
            if (r7 == 0) goto Lc1
            android.app.AlertDialog r7 = (android.app.AlertDialog) r7
            r11 = -3
            android.widget.Button r7 = r7.getButton(r11)
            if (r7 == 0) goto L8e
            boolean r11 = r5.f4560g
            if (r11 == 0) goto L8b
            java.lang.String r6 = "搜索"
        L8b:
            r7.setText(r6)
        L8e:
            java.lang.Object r6 = r13.f4564g
            if (r6 == 0) goto Lbd
            android.app.AlertDialog r6 = (android.app.AlertDialog) r6
            android.widget.Button r6 = r6.getButton(r8)
            if (r6 == 0) goto La6
            boolean r5 = r5.f4560g
            if (r5 == 0) goto La1
            java.lang.String r5 = "发送"
            goto La3
        La1:
            java.lang.String r5 = "关闭"
        La3:
            r6.setText(r5)
        La6:
            java.lang.Object r5 = r13.f4564g
            if (r5 == 0) goto Lb9
            android.app.AlertDialog r5 = (android.app.AlertDialog) r5
            r6 = -2
            android.widget.Button r5 = r5.getButton(r6)
            if (r5 == 0) goto Lb8
            java.lang.String r6 = "复制"
            r5.setText(r6)
        Lb8:
            return
        Lb9:
            gg.l.g(r10)
            throw r9
        Lbd:
            gg.l.g(r10)
            throw r9
        Lc1:
            gg.l.g(r10)
            throw r9
    }

    public static final java.util.List I0(android.widget.EditText r4, android.widget.EditText r5) {
            android.text.Editable r4 = r4.getText()
            r0 = 0
            if (r4 == 0) goto Lc
            java.lang.String r4 = r4.toString()
            goto Ld
        Lc:
            r4 = r0
        Ld:
            java.lang.String r1 = ""
            if (r4 != 0) goto L12
            r4 = r1
        L12:
            int r2 = r4.length()
            if (r2 != 0) goto L1b
            tf.t r4 = tf.t.f13167g
            return r4
        L1b:
            android.text.Editable r5 = r5.getText()
            if (r5 == 0) goto L25
            java.lang.String r0 = r5.toString()
        L25:
            if (r0 != 0) goto L28
            goto L29
        L28:
            r1 = r0
        L29:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r0 = 0
            r2 = r0
        L30:
            int r3 = r1.length()
            if (r2 > r3) goto L4b
            r3 = 4
            int r2 = og.m.r0(r1, r4, r2, r0, r3)
            if (r2 >= 0) goto L3e
            goto L4b
        L3e:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r5.add(r3)
            int r3 = r4.length()
            int r2 = r2 + r3
            goto L30
        L4b:
            return r5
    }

    public static final void J0(android.widget.EditText r4, android.widget.TextView r5, gg.s r6, android.widget.EditText r7, boolean r8) {
            android.text.Editable r0 = r4.getText()
            if (r0 == 0) goto Lb
            java.lang.String r0 = r0.toString()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 != 0) goto L10
            java.lang.String r0 = ""
        L10:
            int r1 = r0.length()
            if (r1 != 0) goto L1c
            java.lang.String r4 = "请输入搜索内容"
            r5.setText(r4)
            return
        L1c:
            java.util.List r4 = I0(r4, r7)
            int r1 = r4.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "搜索结果: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r5.setText(r1)
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L48
            r4 = -1
            r6.f4562g = r4
            java.lang.String r4 = "未找到: "
            java.lang.String r4 = r4.concat(r0)
            r5.setText(r4)
            return
        L48:
            int r1 = r6.f4562g
            if (r1 >= 0) goto L57
            if (r8 == 0) goto L50
            r8 = 0
            goto L6e
        L50:
            int r8 = r4.size()
            int r8 = r8 + (-1)
            goto L6e
        L57:
            if (r8 == 0) goto L62
            int r1 = r1 + 1
            int r8 = r4.size()
            int r8 = r1 % r8
            goto L6e
        L62:
            int r1 = r1 + (-1)
            int r8 = r4.size()
            int r8 = r8 + r1
            int r1 = r4.size()
            int r8 = r8 % r1
        L6e:
            r6.f4562g = r8
            java.lang.Object r8 = r4.get(r8)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            int r0 = r0.length()
            int r0 = r0 + r8
            r7.setSelection(r8, r0)
            int r6 = r6.f4562g
            int r6 = r6 + 1
            int r4 = r4.size()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            java.lang.String r6 = "/"
            r7.append(r6)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r5.setText(r4)
            return
    }

    public static final void K0(gg.q r12, android.widget.LinearLayout r13, android.widget.TextView r14, int r15, android.widget.EditText r16, gg.u r17, android.widget.EditText r18, gg.s r19, android.widget.TextView r20, android.widget.ScrollView r21, r9.d0 r22, android.widget.TextView r23, android.widget.LinearLayout r24, gg.u r25, android.content.Context r26, boolean r27) {
            r9 = r17
            r10 = r18
            r11 = r26
            if (r27 == 0) goto L20
            boolean r0 = r12.f4560g
            if (r0 != 0) goto L20
            r0 = r12
            r6 = r15
            r5 = r16
            r7 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r8 = r25
            H0(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            goto L24
        L20:
            r5 = r16
            r7 = r20
        L24:
            r1 = 8
            r2 = 0
            if (r27 == 0) goto L2b
            r3 = r2
            goto L2c
        L2b:
            r3 = r1
        L2c:
            r13.setVisibility(r3)
            if (r27 == 0) goto L32
            r1 = r2
        L32:
            r14.setVisibility(r1)
            if (r15 <= 0) goto L5e
            boolean r12 = r12.f4560g
            if (r12 == 0) goto L5e
            android.view.ViewGroup$LayoutParams r12 = r5.getLayoutParams()
            r12.getClass()
            android.widget.LinearLayout$LayoutParams r12 = (android.widget.LinearLayout.LayoutParams) r12
            if (r27 == 0) goto L59
            r22.getClass()
            r13 = 1119879168(0x42c00000, float:96.0)
            int r13 = l(r11, r13)
            int r15 = r15 - r13
            r13 = 1137836032(0x43d20000, float:420.0)
            int r13 = l(r11, r13)
            if (r15 >= r13) goto L59
            r15 = r13
        L59:
            r12.height = r15
            r5.setLayoutParams(r12)
        L5e:
            if (r27 == 0) goto L100
            android.text.Editable r12 = r5.getText()
            r13 = 0
            if (r12 == 0) goto L6c
            java.lang.String r12 = r12.toString()
            goto L6d
        L6c:
            r12 = r13
        L6d:
            java.lang.String r14 = ""
            if (r12 != 0) goto L72
            r12 = r14
        L72:
            int r15 = r5.getSelectionStart()
            int r0 = r5.getSelectionEnd()
            int r15 = java.lang.Math.min(r15, r0)
            if (r15 >= 0) goto L81
            r15 = r2
        L81:
            int r0 = r5.getSelectionStart()
            int r1 = r5.getSelectionEnd()
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r12.length()
            if (r0 <= r1) goto L94
            r0 = r1
        L94:
            if (r0 <= r15) goto L9c
            java.lang.String r12 = r12.substring(r15, r0)
            r9.f4564g = r12
        L9c:
            android.text.Editable r12 = r5.getText()
            if (r12 == 0) goto La7
            java.lang.String r12 = r12.toString()
            goto La8
        La7:
            r12 = r13
        La8:
            if (r12 != 0) goto Lab
            r12 = r14
        Lab:
            java.lang.Object r15 = r9.f4564g
            r0 = r15
            java.lang.String r0 = (java.lang.String) r0
            int r1 = r0.length()
            if (r1 <= 0) goto Lbe
            boolean r12 = og.m.h0(r12, r0, r2)
            if (r12 == 0) goto Lbe
            r12 = 1
            goto Lbf
        Lbe:
            r12 = r2
        Lbf:
            if (r12 == 0) goto Lc2
            r13 = r15
        Lc2:
            java.lang.String r13 = (java.lang.String) r13
            if (r13 != 0) goto Lc7
            goto Lc8
        Lc7:
            r14 = r13
        Lc8:
            int r12 = r14.length()
            if (r12 <= 0) goto Le3
            r10.setText(r14)
            android.text.Editable r12 = r10.getText()
            if (r12 == 0) goto Ldb
            int r2 = r12.length()
        Ldb:
            r10.setSelection(r2)
            r12 = -1
            r13 = r19
            r13.f4562g = r12
        Le3:
            r10.requestFocus()
            java.util.List r12 = I0(r10, r5)
            int r12 = r12.size()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "搜索结果: "
            r13.<init>(r14)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            r7.setText(r12)
            return
        L100:
            java.lang.String r12 = "搜索"
            r7.setText(r12)
            return
    }

    public static boolean L(java.lang.Object r2, java.lang.String r3) {
            java.lang.String r0 = "contact_info_sns"
            boolean r0 = gg.l.a(r3, r0)
            if (r0 != 0) goto L40
            java.lang.String r0 = "contact_info_more"
            boolean r0 = gg.l.a(r3, r0)
            if (r0 != 0) goto L40
            java.lang.String r0 = "permission"
            r1 = 0
            boolean r3 = og.m.h0(r3, r0, r1)
            if (r3 == 0) goto L1a
            goto L40
        L1a:
            java.lang.String r2 = k0(r2)
            java.lang.String r3 = "设置备注"
            boolean r3 = og.m.h0(r2, r3, r1)
            if (r3 != 0) goto L40
            java.lang.String r3 = "标签"
            boolean r3 = og.m.h0(r2, r3, r1)
            if (r3 != 0) goto L40
            java.lang.String r3 = "朋友圈"
            boolean r3 = og.m.h0(r2, r3, r1)
            if (r3 != 0) goto L40
            java.lang.String r3 = "添加到通讯录"
            boolean r2 = og.m.h0(r2, r3, r1)
            if (r2 == 0) goto L3f
            goto L40
        L3f:
            return r1
        L40:
            r2 = 1
            return r2
    }

    public static java.lang.String L0(java.lang.String r4) {
            java.lang.String r0 = ":\n"
            r1 = 6
            r2 = 0
            int r0 = og.m.r0(r4, r0, r2, r2, r1)
            if (r0 <= 0) goto Lf
            java.lang.String r1 = r4.substring(r2, r0)
            goto L11
        Lf:
            java.lang.String r1 = ""
        L11:
            boolean r3 = og.m.t0(r1)
            if (r3 != 0) goto L2d
            java.lang.String r3 = "<"
            boolean r3 = og.m.h0(r1, r3, r2)
            if (r3 != 0) goto L2d
            java.lang.String r3 = "\n"
            boolean r1 = og.m.h0(r1, r3, r2)
            if (r1 != 0) goto L2d
            int r0 = r0 + 2
            java.lang.String r4 = r4.substring(r0)
        L2d:
            return r4
    }

    public static boolean M(java.lang.Object r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = j0(r3)
            java.lang.String r2 = "hchat_profile_id"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L12
            r3 = 1
            return r3
        L12:
            java.lang.String r3 = k0(r3)
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r1 = "ID:"
            boolean r3 = og.t.d0(r3, r1, r0)
            return r3
    }

    public static java.lang.Long M0(java.lang.Number r6) {
            long r0 = r6.longValue()
            lg.f r6 = r9.d0.J
            long r2 = r6.f8054g
            long r4 = r6.f8055h
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 > 0) goto L1a
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 > 0) goto L1a
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            return r6
        L1a:
            lg.f r6 = r9.d0.K
            long r2 = r6.f8054g
            long r4 = r6.f8055h
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 > 0) goto L2d
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 > 0) goto L2d
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            return r6
        L2d:
            r6 = 0
            return r6
    }

    public static boolean N(java.lang.reflect.Method r3) {
            java.lang.Class[] r0 = r3.getParameterTypes()
            java.lang.Class r3 = r3.getReturnType()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            boolean r3 = gg.l.a(r3, r1)
            r1 = 0
            if (r3 == 0) goto L2b
            int r3 = r0.length
            r2 = 2
            if (r3 != r2) goto L2b
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r2 = r0[r1]
            boolean r3 = r3.isAssignableFrom(r2)
            if (r3 == 0) goto L2b
            r3 = 1
            r0 = r0[r3]
            java.lang.Class r2 = java.lang.Long.TYPE
            boolean r0 = gg.l.a(r0, r2)
            if (r0 == 0) goto L2b
            return r3
        L2b:
            return r1
    }

    public static java.lang.Long N0(java.lang.String r9) {
            java.lang.CharSequence r9 = og.m.R0(r9)
            java.lang.String r9 = r9.toString()
            int r0 = r9.length()
            r1 = 10
            r2 = 0
            r3 = 0
            if (r0 != r1) goto L4f
            r0 = r3
        L13:
            int r1 = r9.length()
            if (r0 >= r1) goto L27
            char r1 = r9.charAt(r0)
            boolean r1 = java.lang.Character.isDigit(r1)
            if (r1 != 0) goto L24
            goto L4f
        L24:
            int r0 = r0 + 1
            goto L13
        L27:
            java.lang.Long r9 = og.t.g0(r9)
            if (r9 == 0) goto L88
            long r0 = r9.longValue()
            lg.f r3 = r9.d0.J
            long r4 = r3.f8054g
            long r6 = r3.f8055h
            int r3 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r3 > 0) goto L40
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L40
            goto L41
        L40:
            r9 = r2
        L41:
            if (r9 == 0) goto L88
            long r0 = r9.longValue()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            java.lang.Long r9 = java.lang.Long.valueOf(r0)
            return r9
        L4f:
            int r0 = r9.length()
            r1 = 13
            if (r0 != r1) goto L88
            r0 = r3
        L58:
            int r1 = r9.length()
            if (r0 >= r1) goto L6c
            char r1 = r9.charAt(r0)
            boolean r1 = java.lang.Character.isDigit(r1)
            if (r1 != 0) goto L69
            goto L88
        L69:
            int r0 = r0 + 1
            goto L58
        L6c:
            java.lang.Long r9 = og.t.g0(r9)
            if (r9 == 0) goto L88
            long r0 = r9.longValue()
            lg.f r4 = r9.d0.K
            long r5 = r4.f8054g
            long r7 = r4.f8055h
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 > 0) goto L85
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 > 0) goto L85
            r3 = 1
        L85:
            if (r3 == 0) goto L88
            return r9
        L88:
            return r2
    }

    public static boolean O(android.view.ViewGroup r2) {
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r0 = "RecyclerView"
            r1 = 0
            boolean r0 = og.m.h0(r2, r0, r1)
            if (r0 != 0) goto L23
            java.lang.String r0 = "ListView"
            boolean r0 = og.m.h0(r2, r0, r1)
            if (r0 != 0) goto L23
            java.lang.String r0 = "ScrollView"
            boolean r2 = og.m.h0(r2, r0, r1)
            if (r2 == 0) goto L22
            goto L23
        L22:
            return r1
        L23:
            r2 = 1
            return r2
    }

    public static boolean P(android.view.View r1, android.view.View r2) {
        L0:
            if (r1 == 0) goto L13
            if (r1 != r2) goto L6
            r1 = 1
            return r1
        L6:
            android.view.ViewParent r1 = r1.getParent()
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L11
            android.view.View r1 = (android.view.View) r1
            goto L0
        L11:
            r1 = 0
            goto L0
        L13:
            r1 = 0
            return r1
    }

    public static int P0(android.view.View r8) {
            android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
            int r1 = r8.getWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r3 = 0
            r4 = 1
            if (r1 <= 0) goto L12
            r1 = r4
            goto L13
        L12:
            r1 = r3
        L13:
            r5 = 0
            if (r1 == 0) goto L17
            goto L18
        L17:
            r2 = r5
        L18:
            if (r2 == 0) goto L1f
        L1a:
            int r1 = r2.intValue()
            goto L48
        L1f:
            int r1 = r8.getMeasuredWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            if (r1 <= 0) goto L2b
            r1 = r4
            goto L2c
        L2b:
            r1 = r3
        L2c:
            if (r1 == 0) goto L2f
            goto L30
        L2f:
            r2 = r5
        L30:
            if (r2 == 0) goto L33
            goto L1a
        L33:
            if (r0 == 0) goto L43
            int r1 = r0.width
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            if (r1 <= 0) goto L3f
            r1 = r4
            goto L40
        L3f:
            r1 = r3
        L40:
            if (r1 == 0) goto L43
            goto L44
        L43:
            r2 = r5
        L44:
            if (r2 == 0) goto L47
            goto L1a
        L47:
            r1 = r3
        L48:
            int r2 = r8.getHeight()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            if (r2 <= 0) goto L54
            r2 = r4
            goto L55
        L54:
            r2 = r3
        L55:
            if (r2 == 0) goto L58
            goto L59
        L58:
            r6 = r5
        L59:
            if (r6 == 0) goto L60
        L5b:
            int r3 = r6.intValue()
            goto L88
        L60:
            int r2 = r8.getMeasuredHeight()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            if (r2 <= 0) goto L6c
            r2 = r4
            goto L6d
        L6c:
            r2 = r3
        L6d:
            if (r2 == 0) goto L70
            goto L71
        L70:
            r6 = r5
        L71:
            if (r6 == 0) goto L74
            goto L5b
        L74:
            if (r0 == 0) goto L84
            int r2 = r0.height
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            if (r2 <= 0) goto L80
            r2 = r4
            goto L81
        L80:
            r2 = r3
        L81:
            if (r2 == 0) goto L84
            goto L85
        L84:
            r6 = r5
        L85:
            if (r6 == 0) goto L88
            goto L5b
        L88:
            android.content.Context r2 = r8.getContext()
            r2.getClass()
            r6 = 1137836032(0x43d20000, float:420.0)
            int r2 = l(r2, r6)
            if (r1 <= r2) goto L98
            goto L99
        L98:
            r2 = r1
        L99:
            android.content.Context r7 = r8.getContext()
            r7.getClass()
            int r6 = l(r7, r6)
            if (r3 <= r6) goto La7
            goto La8
        La7:
            r6 = r3
        La8:
            int r2 = r2 + r6
            boolean r6 = r8 instanceof android.widget.TextView
            if (r6 == 0) goto Laf
            int r2 = r2 + 80
        Laf:
            boolean r6 = r8 instanceof android.view.ViewGroup
            if (r6 == 0) goto Lc2
            r6 = r8
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            int r6 = r6.getChildCount()
            r7 = 8
            if (r6 <= r7) goto Lbf
            r6 = r7
        Lbf:
            int r6 = r6 * 20
            int r2 = r2 + r6
        Lc2:
            if (r0 == 0) goto Lca
            int r6 = r0.width
            r7 = -2
            if (r6 != r7) goto Lca
            goto Ld1
        Lca:
            if (r0 == 0) goto Ld3
            int r0 = r0.width
            r6 = -1
            if (r0 != r6) goto Ld3
        Ld1:
            int r2 = r2 + 40
        Ld3:
            java.lang.CharSequence r0 = r8.getContentDescription()
            if (r0 == 0) goto Ldd
            java.lang.String r5 = r0.toString()
        Ldd:
            if (r5 != 0) goto Le1
            java.lang.String r5 = ""
        Le1:
            java.lang.String r0 = "avatar"
            boolean r0 = og.m.h0(r5, r0, r4)
            if (r0 == 0) goto Leb
            int r2 = r2 + (-600)
        Leb:
            if (r4 > r1) goto L10d
            android.content.Context r0 = r8.getContext()
            r0.getClass()
            r5 = 1116733440(0x42900000, float:72.0)
            int r0 = l(r0, r5)
            if (r1 > r0) goto L10d
            if (r4 > r3) goto L10d
            android.content.Context r8 = r8.getContext()
            r8.getClass()
            int r8 = l(r8, r5)
            if (r3 > r8) goto L10d
            int r2 = r2 + (-500)
        L10d:
            return r2
    }

    public static boolean Q(android.view.View r1) {
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L20
            int r0 = r1.getWidth()
            if (r0 > 0) goto L12
            int r0 = r1.getMeasuredWidth()
            if (r0 <= 0) goto L20
        L12:
            int r0 = r1.getHeight()
            if (r0 > 0) goto L1e
            int r1 = r1.getMeasuredHeight()
            if (r1 <= 0) goto L20
        L1e:
            r1 = 1
            return r1
        L20:
            r1 = 0
            return r1
    }

    public static java.lang.Object R(int r4, java.lang.Object r5) {
            if (r5 == 0) goto L52
            if (r4 >= 0) goto L5
            goto L52
        L5:
            boolean r0 = r5 instanceof java.util.List
            if (r0 == 0) goto L17
            r0 = r5
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            if (r4 >= r1) goto L17
            java.lang.Object r4 = r0.get(r4)
            return r4
        L17:
            java.lang.Class r0 = r5.getClass()
            java.lang.Class r1 = java.lang.Integer.TYPE
            r1.getClass()
            java.lang.Class[] r2 = new java.lang.Class[]{r1}
            java.lang.String r3 = "get"
            java.lang.reflect.Method r0 = h.Hchat.utils.KavaReflector.findMethod(r0, r3, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invoke(r0, r5, r2)
            if (r0 == 0) goto L39
            return r0
        L39:
            java.lang.Class r0 = r5.getClass()
            java.lang.Class[] r1 = new java.lang.Class[]{r1}
            java.lang.reflect.Method r0 = h.Hchat.utils.KavaReflector.findMethod(r0, r3, r1)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.invoke(r0, r5, r4)
            return r4
        L52:
            r4 = 0
            return r4
    }

    public static java.lang.reflect.Method S(r9.d0 r6, java.lang.String r7, java.util.List r8) {
            java.lang.String r0 = r6.a0()
            android.content.SharedPreferences r1 = r6.f11657e
            r8.g r2 = r6.f11653a
            java.lang.ClassLoader r3 = r2.f11622c
            java.lang.reflect.Method r3 = e8.b.c(r1, r0, r3, r7)
            if (r3 == 0) goto L11
            return r3
        L11:
            r3 = 0
            org.luckypray.dexkit.DexKitBridge r2 = r2.f11623d     // Catch: java.lang.Throwable -> L3e
            ch.e r4 = new ch.e     // Catch: java.lang.Throwable -> L3e
            r4.<init>()     // Catch: java.lang.Throwable -> L3e
            fh.k r5 = new fh.k     // Catch: java.lang.Throwable -> L3e
            r5.<init>()     // Catch: java.lang.Throwable -> L3e
            fh.k.u0(r5, r8)     // Catch: java.lang.Throwable -> L3e
            r4.f1666h = r5     // Catch: java.lang.Throwable -> L3e
            hh.p r8 = r2.findMethod(r4)     // Catch: java.lang.Throwable -> L3e
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L3e
        L2b:
            boolean r2 = r8.hasNext()     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L40
            java.lang.Object r2 = r8.next()     // Catch: java.lang.Throwable -> L3e
            hh.o r2 = (hh.o) r2     // Catch: java.lang.Throwable -> L3e
            java.lang.reflect.Method r2 = r6.O0(r2)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L2b
            goto L47
        L3e:
            r8 = move-exception
            goto L42
        L40:
            r2 = r3
            goto L47
        L42:
            sf.f r2 = new sf.f
            r2.<init>(r8)
        L47:
            java.lang.Throwable r8 = sf.g.b(r2)
            if (r8 != 0) goto L4f
            r3 = r2
            goto L5a
        L4f:
            ia.t r6 = r6.f11654b
            java.lang.String r2 = "DexKit定位失败: "
            java.lang.String r2 = r2.concat(r7)
            r6.invoke(r2, r8)
        L5a:
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L62
            e8.b.h(r1, r0, r7, r3)
            goto L82
        L62:
            java.lang.String r6 = "cache.key"
            android.content.SharedPreferences$Editor r8 = r1.edit()     // Catch: java.lang.Throwable -> L82
            java.lang.String r2 = ""
            java.lang.String r1 = r1.getString(r6, r2)     // Catch: java.lang.Throwable -> L82
            boolean r1 = gg.l.a(r1, r0)     // Catch: java.lang.Throwable -> L82
            if (r1 != 0) goto L7b
            android.content.SharedPreferences$Editor r1 = r8.clear()     // Catch: java.lang.Throwable -> L82
            r1.putString(r6, r0)     // Catch: java.lang.Throwable -> L82
        L7b:
            android.content.SharedPreferences$Editor r6 = r8.remove(r7)     // Catch: java.lang.Throwable -> L82
            r6.apply()     // Catch: java.lang.Throwable -> L82
        L82:
            return r3
    }

    public static boolean U(java.lang.String r3) {
            java.lang.CharSequence r3 = og.m.R0(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "<"
            r1 = 0
            boolean r0 = og.t.d0(r3, r0, r1)
            if (r0 == 0) goto L24
            java.lang.String r0 = ">"
            boolean r0 = og.t.W(r3, r0, r1)
            if (r0 == 0) goto L24
            r0 = 62
            r2 = 6
            int r3 = og.m.q0(r3, r0, r1, r2)
            r0 = 1
            if (r3 <= r0) goto L24
            return r0
        L24:
            return r1
    }

    public static int a(java.lang.Object r6) {
            java.lang.Class r0 = r6.getClass()
            java.util.ArrayList r0 = b0(r0)
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.String r4 = r1.getName()
            java.lang.String r5 = "getCount"
            boolean r4 = gg.l.a(r4, r5)
            if (r4 == 0) goto L48
            java.lang.Class[] r4 = r1.getParameterTypes()
            r4.getClass()
            int r4 = r4.length
            if (r4 != 0) goto L48
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invoke(r1, r6, r4)
            boolean r4 = r1 instanceof java.lang.Number
            if (r4 == 0) goto L3d
            java.lang.Number r1 = (java.lang.Number) r1
            goto L3e
        L3d:
            r1 = r3
        L3e:
            if (r1 == 0) goto L48
            int r1 = r1.intValue()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
        L48:
            if (r3 == 0) goto Lc
        L4a:
            if (r3 == 0) goto L51
            int r6 = r3.intValue()
            return r6
        L51:
            return r2
    }

    public static int b(java.lang.Object r7, java.lang.Object r8) {
            int r0 = a(r7)
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            if (r2 < r0) goto Le
            int r0 = r0 - r3
            if (r0 >= 0) goto Ld
            return r1
        Ld:
            return r0
        Le:
            java.lang.Object r4 = c(r2, r7)
            if (r4 != r8) goto L17
            int r3 = r3 + 1
            goto L2d
        L17:
            int r5 = r2 - r3
            boolean r6 = M(r4)
            if (r6 == 0) goto L22
            int r5 = r5 + 1
            return r5
        L22:
            java.lang.String r6 = j0(r4)
            boolean r4 = L(r4, r6)
            if (r4 == 0) goto L2d
            return r5
        L2d:
            int r2 = r2 + 1
            goto L7
    }

    public static java.util.ArrayList b0(java.lang.Class r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            if (r2 == 0) goto L1b
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L1b
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredMethods(r2)
            tf.r.h1(r0, r1)
            java.lang.Class r2 = r2.getSuperclass()
            goto L5
        L1b:
            return r0
    }

    public static java.lang.Object c(int r6, java.lang.Object r7) {
            java.lang.Class r0 = r7.getClass()
            java.util.ArrayList r0 = b0(r0)
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L58
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.String r3 = r1.getName()
            java.lang.String r4 = "getItem"
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto L56
            java.lang.Class[] r3 = r1.getParameterTypes()
            int r3 = r3.length
            r4 = 1
            if (r3 != r4) goto L56
            java.lang.Class[] r3 = r1.getParameterTypes()
            r4 = 0
            r3 = r3[r4]
            java.lang.Class r5 = java.lang.Integer.TYPE
            boolean r3 = gg.l.a(r3, r5)
            if (r3 != 0) goto L4a
            java.lang.Class[] r3 = r1.getParameterTypes()
            r3 = r3[r4]
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto L56
        L4a:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invoke(r1, r7, r2)
        L56:
            if (r2 == 0) goto Lc
        L58:
            return r2
    }

    public static java.lang.String c0(java.lang.CharSequence r2) {
            if (r2 == 0) goto L1b
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L1b
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L1b
            java.lang.String r0 = "\\s+"
            java.lang.String r1 = " "
            java.lang.String r2 = j8.b.h(r0, r2, r1)
            goto L1c
        L1b:
            r2 = 0
        L1c:
            if (r2 != 0) goto L20
            java.lang.String r2 = ""
        L20:
            return r2
    }

    public static boolean d(java.lang.Object r6, int r7, java.lang.Object r8) {
            java.lang.Class r0 = r6.getClass()
            java.util.ArrayList r0 = b0(r0)
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto L10
            goto L58
        L10:
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L58
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.Class[] r3 = r1.getParameterTypes()
            int r3 = r3.length
            r4 = 2
            r5 = 1
            if (r3 != r4) goto L54
            java.lang.Class[] r3 = r1.getParameterTypes()
            r3 = r3[r5]
            java.lang.Class r4 = java.lang.Integer.TYPE
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto L54
            java.lang.Class[] r3 = r1.getParameterTypes()
            r3 = r3[r2]
            java.lang.Class r4 = r8.getClass()
            boolean r3 = r3.isAssignableFrom(r4)
            if (r3 == 0) goto L54
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r3 = new java.lang.Object[]{r8, r3}
            boolean r1 = h.Hchat.utils.KavaReflector.invokeSuccessfully(r1, r6, r3)
            goto L55
        L54:
            r1 = r2
        L55:
            if (r1 == 0) goto L14
            return r5
        L58:
            return r2
    }

    public static void d0(java.lang.Object r6) {
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "notifyDataSetChanged"
            h.Hchat.utils.KavaReflector.invokeMethod(r6, r2, r1)
            java.lang.Class r1 = r6.getClass()
            java.util.ArrayList r1 = b0(r1)
            java.util.Iterator r1 = r1.iterator()
        L14:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L3b
            java.lang.Object r3 = r1.next()
            r4 = r3
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.String r5 = r4.getName()
            boolean r5 = gg.l.a(r5, r2)
            if (r5 == 0) goto L37
            java.lang.Class[] r4 = r4.getParameterTypes()
            r4.getClass()
            int r4 = r4.length
            if (r4 != 0) goto L37
            r4 = 1
            goto L38
        L37:
            r4 = r0
        L38:
            if (r4 == 0) goto L14
            goto L3c
        L3b:
            r3 = 0
        L3c:
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L45
            java.lang.Object[] r0 = new java.lang.Object[r0]
            h.Hchat.utils.KavaReflector.invoke(r3, r6, r0)
        L45:
            return
    }

    public static l8.c f(r9.f0 r3) {
            l8.d r0 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            java.lang.String r1 = r3.f11710h
            java.lang.String r3 = r3.f11709g
            g8.a r2 = h.Hchat.hooks.api.core.WeChatApis.account()
            if (r2 == 0) goto L11
            java.lang.String r2 = r2.c()
            goto L12
        L11:
            r2 = 0
        L12:
            if (r2 != 0) goto L16
            java.lang.String r2 = ""
        L16:
            r0.getClass()
            l8.c r3 = l8.d.c(r1, r3, r2)
            return r3
    }

    public static java.util.List f0(java.lang.String r3) {
            r0 = 4
            char[] r0 = new char[r0]
            r0 = {x0052: FILL_ARRAY_DATA , data: [44, 59, 124, 32} // fill-array
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
            if (r1 == 0) goto L48
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = og.m.t0(r2)
            if (r2 != 0) goto L31
            r3.add(r1)
            goto L31
        L48:
            java.util.Set r3 = tf.m.T1(r3)
            java.util.List r3 = tf.m.P1(r3)
            return r3
    }

    public static java.lang.Integer g0(java.lang.String r1) {
            java.lang.CharSequence r1 = og.m.R0(r1)     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L11
            int r1 = android.graphics.Color.parseColor(r1)     // Catch: java.lang.Throwable -> L11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L11
            goto L18
        L11:
            r1 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r1)
            r1 = r0
        L18:
            boolean r0 = r1 instanceof sf.f
            if (r0 == 0) goto L1e
            r1 = 0
        L1e:
            java.lang.Integer r1 = (java.lang.Integer) r1
            return r1
    }

    public static void h(android.view.View r0, java.util.WeakHashMap r1) {
            monitor-enter(r1)
            java.lang.Object r0 = r1.remove(r0)     // Catch: java.lang.Throwable -> L1a
            r9.a0 r0 = (r9.a0) r0     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r1)
            if (r0 == 0) goto L19
            android.view.ViewTreeObserver r1 = r0.f11634a
            boolean r1 = r1.isAlive()
            if (r1 == 0) goto L19
            android.view.ViewTreeObserver r1 = r0.f11634a
            android.view.ViewTreeObserver$OnPreDrawListener r0 = r0.f11635b
            r1.removeOnPreDrawListener(r0)
        L19:
            return
        L1a:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public static java.lang.Integer h0(java.lang.Object r1) {
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 == 0) goto Lf
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        Lf:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L22
            java.lang.String r1 = (java.lang.String) r1
            java.lang.CharSequence r1 = og.m.R0(r1)
            java.lang.String r1 = r1.toString()
            java.lang.Integer r1 = og.t.f0(r1)
            return r1
        L22:
            r1 = 0
            return r1
    }

    public static void i(android.content.Context r1, java.lang.String r2) {
            java.lang.String r0 = "clipboard"
            java.lang.Object r1 = r1.getSystemService(r0)
            boolean r0 = r1 instanceof android.content.ClipboardManager
            if (r0 == 0) goto Ld
            android.content.ClipboardManager r1 = (android.content.ClipboardManager) r1
            goto Le
        Ld:
            r1 = 0
        Le:
            if (r1 == 0) goto L19
            java.lang.String r0 = "消息详情"
            android.content.ClipData r2 = android.content.ClipData.newPlainText(r0, r2)
            r1.setPrimaryClip(r2)
        L19:
            return
    }

    public static java.lang.Long i0(java.lang.Object r2) {
            boolean r0 = r2 instanceof java.lang.Number
            if (r0 == 0) goto Lf
            java.lang.Number r2 = (java.lang.Number) r2
            long r0 = r2.longValue()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
        Lf:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L22
            java.lang.String r2 = (java.lang.String) r2
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            java.lang.Long r2 = og.t.g0(r2)
            return r2
        L22:
            r2 = 0
            return r2
    }

    public static java.lang.String j(android.app.Activity r6) {
            android.content.Intent r6 = r6.getIntent()
            r0 = 0
            if (r6 == 0) goto L3a
            java.lang.String r1 = "Contact_ChatRoomId"
            java.lang.String r2 = "Chat_User"
            java.lang.String r3 = "Contact_User"
            java.lang.String r4 = "RoomInfo_Id"
            java.lang.String r5 = "room_name"
            java.lang.String[] r1 = new java.lang.String[]{r3, r4, r5, r1, r2}
            java.util.List r1 = a.a.y0(r1)
            java.util.Iterator r1 = r1.iterator()
        L1d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r6.getStringExtra(r2)
            if (r2 == 0) goto L36
            boolean r3 = og.m.t0(r2)
            if (r3 != 0) goto L36
            goto L37
        L36:
            r2 = r0
        L37:
            if (r2 == 0) goto L1d
            return r2
        L3a:
            return r0
    }

    public static java.lang.String j0(java.lang.Object r6) {
            if (r6 != 0) goto L3
            goto L65
        L3:
            java.lang.String r0 = "r"
            java.lang.String r1 = "q"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            r1 = 0
            r2 = r1
        Ld:
            r3 = 0
            r4 = 2
            if (r2 < r4) goto L68
            java.lang.Class r0 = r6.getClass()
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredFields(r0)
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L53
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            java.lang.Class r4 = r2.getType()
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            boolean r4 = gg.l.a(r4, r5)
            if (r4 == 0) goto L1d
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r2, r6)
            boolean r4 = r2 instanceof java.lang.String
            if (r4 == 0) goto L40
            java.lang.String r2 = (java.lang.String) r2
            goto L41
        L40:
            r2 = r3
        L41:
            if (r2 == 0) goto L1d
            boolean r4 = og.m.t0(r2)
            if (r4 == 0) goto L4a
            goto L1d
        L4a:
            java.lang.String r4 = "hchat_group_member_history"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L1d
            return r2
        L53:
            java.lang.String r0 = "getKey"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object r6 = h.Hchat.utils.KavaReflector.invokeMethod(r6, r0, r1)
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L62
            r3 = r6
            java.lang.String r3 = (java.lang.String) r3
        L62:
            if (r3 == 0) goto L65
            return r3
        L65:
            java.lang.String r6 = ""
            return r6
        L68:
            r4 = r0[r2]
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.readField(r6, r4)
            boolean r5 = r4 instanceof java.lang.String
            if (r5 == 0) goto L75
            java.lang.String r4 = (java.lang.String) r4
            goto L76
        L75:
            r4 = r3
        L76:
            if (r4 == 0) goto L82
            boolean r5 = og.m.t0(r4)
            if (r5 != 0) goto L7f
            r3 = r4
        L7f:
            if (r3 == 0) goto L82
            return r3
        L82:
            int r2 = r2 + 1
            goto Ld
    }

    public static android.view.View k(android.view.View r3, android.view.ViewGroup r4) {
            android.view.ViewParent r0 = r3.getParent()
            if (r0 != r4) goto L7
            return r3
        L7:
            r0 = 0
        L8:
            r1 = 8
            r2 = 0
            if (r0 >= r1) goto L25
            android.view.ViewParent r3 = r3.getParent()
            boolean r1 = r3 instanceof android.view.View
            if (r1 == 0) goto L18
            android.view.View r3 = (android.view.View) r3
            goto L19
        L18:
            r3 = r2
        L19:
            if (r3 == 0) goto L25
            android.view.ViewParent r1 = r3.getParent()
            if (r1 != r4) goto L22
            return r3
        L22:
            int r0 = r0 + 1
            goto L8
        L25:
            return r2
    }

    public static java.lang.String k0(java.lang.Object r6) {
            if (r6 != 0) goto L3
            goto L62
        L3:
            java.lang.String r0 = "i"
            java.lang.String r1 = "h"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            r1 = 0
            r2 = r1
        Ld:
            r3 = 0
            r4 = 2
            if (r2 < r4) goto L66
            java.lang.Class r0 = r6.getClass()
            java.util.ArrayList r0 = b0(r0)
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L60
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.Class[] r4 = r2.getParameterTypes()
            r4.getClass()
            int r4 = r4.length
            if (r4 != 0) goto L5c
            java.lang.Class<java.lang.CharSequence> r4 = java.lang.CharSequence.class
            java.lang.Class r5 = r2.getReturnType()
            boolean r4 = r4.isAssignableFrom(r5)
            if (r4 == 0) goto L5c
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invoke(r2, r6, r4)
            boolean r4 = r2 instanceof java.lang.CharSequence
            if (r4 == 0) goto L4c
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            goto L4d
        L4c:
            r2 = r3
        L4d:
            if (r2 == 0) goto L5c
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L5c
            boolean r4 = og.m.t0(r2)
            if (r4 != 0) goto L5c
            goto L5d
        L5c:
            r2 = r3
        L5d:
            if (r2 == 0) goto L1d
            r3 = r2
        L60:
            if (r3 != 0) goto L65
        L62:
            java.lang.String r6 = ""
            return r6
        L65:
            return r3
        L66:
            r4 = r0[r2]
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.readField(r6, r4)
            boolean r5 = r4 instanceof java.lang.CharSequence
            if (r5 == 0) goto L73
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            goto L74
        L73:
            r4 = r3
        L74:
            if (r4 == 0) goto L86
            java.lang.String r4 = r4.toString()
            if (r4 == 0) goto L86
            boolean r5 = og.m.t0(r4)
            if (r5 != 0) goto L83
            r3 = r4
        L83:
            if (r3 == 0) goto L86
            return r3
        L86:
            int r2 = r2 + 1
            goto Ld
    }

    public static int l(android.content.Context r1, float r2) {
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            r0 = 1
            float r1 = android.util.TypedValue.applyDimension(r0, r2, r1)
            int r1 = (int) r1
            return r1
    }

    public static java.lang.Integer l0(java.nio.ByteBuffer r2) {
            int r0 = r2.remaining()
            r1 = 2
            if (r0 >= r1) goto L8
            goto L1e
        L8:
            short r2 = r2.getShort()
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1 = 3072(0xc00, float:4.305E-42)
            if (r2 > r1) goto L1a
            r2 = 1
            goto L1b
        L1a:
            r2 = 0
        L1b:
            if (r2 == 0) goto L1e
            return r0
        L1e:
            r2 = 0
            return r2
    }

    public static java.util.ArrayList m(java.lang.Class r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            if (r2 == 0) goto L1b
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L1b
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredFields(r2)
            tf.r.h1(r0, r1)
            java.lang.Class r2 = r2.getSuperclass()
            goto L5
        L1b:
            return r0
    }

    public static android.view.View n(android.view.View r3, boolean r4) {
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L19
            if (r4 == 0) goto L18
            boolean r0 = Q(r3)
            if (r0 == 0) goto L19
        L18:
            return r3
        L19:
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 != 0) goto L1e
            goto L27
        L1e:
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r0 = r3.getChildCount()
            r1 = 0
        L25:
            if (r1 < r0) goto L29
        L27:
            r3 = 0
            return r3
        L29:
            android.view.View r2 = r3.getChildAt(r1)
            r2.getClass()
            android.view.View r2 = n(r2, r4)
            if (r2 == 0) goto L37
            return r2
        L37:
            int r1 = r1 + 1
            goto L25
    }

    public static android.widget.TextView p(java.lang.Object r6, java.util.concurrent.ConcurrentHashMap r7) {
            java.lang.Class r0 = r6.getClass()
            java.lang.Object r0 = r7.get(r0)
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            r1 = 0
            if (r0 == 0) goto L18
            java.lang.Object r6 = h.Hchat.utils.KavaReflector.readField(r0, r6)
            boolean r7 = r6 instanceof android.widget.TextView
            if (r7 == 0) goto L66
            android.widget.TextView r6 = (android.widget.TextView) r6
            return r6
        L18:
            java.lang.Class r0 = r6.getClass()
            java.util.ArrayList r0 = m(r0)
            java.util.Iterator r0 = r0.iterator()
        L24:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4f
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = "timeTV"
            boolean r4 = gg.l.a(r4, r5)
            if (r4 == 0) goto L4b
            java.lang.Class<android.widget.TextView> r4 = android.widget.TextView.class
            java.lang.Class r3 = r3.getType()
            boolean r3 = r4.isAssignableFrom(r3)
            if (r3 == 0) goto L4b
            r3 = 1
            goto L4c
        L4b:
            r3 = 0
        L4c:
            if (r3 == 0) goto L24
            goto L50
        L4f:
            r2 = r1
        L50:
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            if (r2 == 0) goto L66
            java.lang.Class r0 = r6.getClass()
            r7.put(r0, r2)
            java.lang.Object r6 = h.Hchat.utils.KavaReflector.readField(r2, r6)
            boolean r7 = r6 instanceof android.widget.TextView
            if (r7 == 0) goto L66
            android.widget.TextView r6 = (android.widget.TextView) r6
            return r6
        L66:
            return r1
    }

    public static android.view.View q(java.lang.Object r6, java.util.concurrent.ConcurrentHashMap r7) {
            java.lang.Class r0 = r6.getClass()
            java.lang.Object r0 = r7.get(r0)
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            r1 = 0
            if (r0 == 0) goto L18
            java.lang.Object r6 = h.Hchat.utils.KavaReflector.readField(r0, r6)
            boolean r7 = r6 instanceof android.view.View
            if (r7 == 0) goto L66
            android.view.View r6 = (android.view.View) r6
            return r6
        L18:
            java.lang.Class r0 = r6.getClass()
            java.util.ArrayList r0 = m(r0)
            java.util.Iterator r0 = r0.iterator()
        L24:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4f
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = "clickArea"
            boolean r4 = gg.l.a(r4, r5)
            if (r4 == 0) goto L4b
            java.lang.Class<android.view.View> r4 = android.view.View.class
            java.lang.Class r3 = r3.getType()
            boolean r3 = r4.isAssignableFrom(r3)
            if (r3 == 0) goto L4b
            r3 = 1
            goto L4c
        L4b:
            r3 = 0
        L4c:
            if (r3 == 0) goto L24
            goto L50
        L4f:
            r2 = r1
        L50:
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            if (r2 == 0) goto L66
            java.lang.Class r0 = r6.getClass()
            r7.put(r0, r2)
            java.lang.Object r6 = h.Hchat.utils.KavaReflector.readField(r2, r6)
            boolean r7 = r6 instanceof android.view.View
            if (r7 == 0) goto L66
            android.view.View r6 = (android.view.View) r6
            return r6
        L66:
            return r1
    }

    public static android.widget.ListView r(android.view.ViewGroup r4) {
            if (r4 != 0) goto L3
            goto La
        L3:
            int r0 = r4.getChildCount()
            r1 = 0
        L8:
            if (r1 < r0) goto Lc
        La:
            r4 = 0
            return r4
        Lc:
            android.view.View r2 = r4.getChildAt(r1)
            boolean r3 = r2 instanceof android.widget.ListView
            if (r3 == 0) goto L17
            android.widget.ListView r2 = (android.widget.ListView) r2
            return r2
        L17:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L24
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.widget.ListView r2 = r(r2)
            if (r2 == 0) goto L24
            return r2
        L24:
            int r1 = r1 + 1
            goto L8
    }

    public static android.widget.TextView v(android.view.View r3, m.b r4) {
            boolean r0 = r3 instanceof android.widget.TextView
            if (r0 == 0) goto L1a
            r0 = r3
            android.widget.TextView r0 = (android.widget.TextView) r0
            int r1 = r0.getVisibility()
            if (r1 != 0) goto L1a
            java.lang.Object r1 = r4.invoke(r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L1a
            return r0
        L1a:
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 != 0) goto L1f
            goto L28
        L1f:
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r0 = r3.getChildCount()
            r1 = 0
        L26:
            if (r1 < r0) goto L2a
        L28:
            r3 = 0
            return r3
        L2a:
            android.view.View r2 = r3.getChildAt(r1)
            r2.getClass()
            android.widget.TextView r2 = v(r2, r4)
            if (r2 == 0) goto L38
            return r2
        L38:
            int r1 = r1 + 1
            goto L26
    }

    public static int v0(int r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
            java.lang.Integer r0 = g0(r5)
            java.lang.Integer r1 = g0(r7)
            java.lang.Integer r5 = g0(r5)
            java.lang.Integer r6 = g0(r6)
            r2 = 0
            r3 = 1
            if (r5 == 0) goto L1e
            if (r6 == 0) goto L1e
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L1e
            r5 = r3
            goto L1f
        L1e:
            r5 = r2
        L1f:
            java.lang.Integer r6 = g0(r7)
            java.lang.Integer r7 = g0(r8)
            if (r6 == 0) goto L32
            if (r7 == 0) goto L32
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L32
            r2 = r3
        L32:
            if (r0 == 0) goto L3b
            if (r5 != 0) goto L3b
            int r4 = r0.intValue()
            return r4
        L3b:
            if (r1 == 0) goto L44
            if (r2 != 0) goto L44
            int r4 = r1.intValue()
            return r4
        L44:
            if (r0 == 0) goto L4b
            int r4 = r0.intValue()
            return r4
        L4b:
            if (r1 == 0) goto L51
            int r4 = r1.intValue()
        L51:
            return r4
    }

    public static java.lang.Long w(int r4, java.lang.Object r5, java.util.Set r6) {
            if (r5 == 0) goto Lae
            r0 = 4
            if (r4 > r0) goto Lae
            boolean r0 = r6.add(r5)
            if (r0 != 0) goto Ld
            goto Lae
        Ld:
            boolean r0 = r5 instanceof java.lang.String
            if (r0 == 0) goto L18
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Long r4 = N0(r5)
            return r4
        L18:
            boolean r0 = r5 instanceof java.lang.Number
            if (r0 == 0) goto L23
            java.lang.Number r5 = (java.lang.Number) r5
            java.lang.Long r4 = M0(r5)
            return r4
        L23:
            java.lang.Class r0 = r5.getClass()
            boolean r1 = r0.isPrimitive()
            if (r1 != 0) goto Lae
            boolean r1 = r0.isArray()
            if (r1 != 0) goto Lae
            java.lang.String r1 = r0.getName()
            java.lang.String r2 = "android."
            r3 = 0
            boolean r1 = og.t.d0(r1, r2, r3)
            if (r1 != 0) goto Lae
            java.lang.String r1 = r0.getName()
            java.lang.String r2 = "java."
            boolean r1 = og.t.d0(r1, r2, r3)
            if (r1 != 0) goto Lae
            java.lang.String r1 = r0.getName()
            java.lang.String r2 = "kotlin."
            boolean r1 = og.t.d0(r1, r2, r3)
            if (r1 == 0) goto L59
            goto Lae
        L59:
            java.util.ArrayList r0 = m(r0)
            java.util.Iterator r0 = r0.iterator()
        L61:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lae
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.readField(r1, r5)
            if (r1 == 0) goto L61
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L88
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Long r1 = N0(r1)
            if (r1 == 0) goto L61
            long r4 = r1.longValue()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            return r4
        L88:
            boolean r2 = r1 instanceof java.lang.Number
            if (r2 == 0) goto L9d
            java.lang.Number r1 = (java.lang.Number) r1
            java.lang.Long r1 = M0(r1)
            if (r1 == 0) goto L61
            long r4 = r1.longValue()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            return r4
        L9d:
            int r2 = r4 + 1
            java.lang.Long r1 = w(r2, r1, r6)
            if (r1 == 0) goto L61
            long r4 = r1.longValue()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            return r4
        Lae:
            r4 = 0
            return r4
    }

    public static java.lang.String x(long r1) {
            java.time.Instant r1 = java.time.Instant.ofEpochMilli(r1)
            java.time.ZoneId r2 = java.time.ZoneId.systemDefault()
            java.time.LocalDateTime r1 = java.time.LocalDateTime.ofInstant(r1, r2)
            java.time.LocalDate r2 = java.time.LocalDate.now()
            java.time.LocalDate r0 = r1.toLocalDate()
            boolean r0 = gg.l.a(r0, r2)
            if (r0 == 0) goto L1d
            java.lang.String r2 = "HH:mm:ss"
            goto L2c
        L1d:
            int r0 = r1.getYear()
            int r2 = r2.getYear()
            if (r0 != r2) goto L2a
            java.lang.String r2 = "M月d日 HH:mm:ss"
            goto L2c
        L2a:
            java.lang.String r2 = "yyyy年M月d日 HH:mm:ss"
        L2c:
            java.time.format.DateTimeFormatter r2 = java.time.format.DateTimeFormatter.ofPattern(r2)
            java.lang.String r1 = r1.format(r2)
            r1.getClass()
            return r1
    }

    public static boolean z(java.lang.Class r5) {
            java.util.ArrayList r5 = b0(r5)
            boolean r0 = r5.isEmpty()
            r1 = 0
            if (r0 == 0) goto Lc
            goto L52
        Lc:
            java.util.Iterator r5 = r5.iterator()
        L10:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L52
            java.lang.Object r0 = r5.next()
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            java.lang.String r2 = r0.getName()
            java.lang.String r3 = "getItem"
            boolean r2 = gg.l.a(r2, r3)
            r3 = 1
            if (r2 == 0) goto L4e
            java.lang.Class[] r2 = r0.getParameterTypes()
            int r2 = r2.length
            if (r2 != r3) goto L4e
            java.lang.Class[] r2 = r0.getParameterTypes()
            r2 = r2[r1]
            java.lang.Class r4 = java.lang.Integer.TYPE
            boolean r2 = gg.l.a(r2, r4)
            if (r2 != 0) goto L4c
            java.lang.Class[] r0 = r0.getParameterTypes()
            r0 = r0[r1]
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            boolean r0 = gg.l.a(r0, r2)
            if (r0 == 0) goto L4e
        L4c:
            r0 = r3
            goto L4f
        L4e:
            r0 = r1
        L4f:
            if (r0 == 0) goto L10
            return r3
        L52:
            return r1
    }

    public final android.view.View A(java.lang.Object r11, android.view.ViewGroup r12) {
            r10 = this;
            java.lang.Class r0 = r11.getClass()
            java.util.concurrent.ConcurrentHashMap r1 = r10.f11666n
            java.lang.Object r2 = r1.get(r0)
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L11
            goto L66
        L11:
            java.util.concurrent.ConcurrentHashMap$KeySetView r2 = r10.f11667o
            boolean r5 = r2.contains(r0)
            if (r5 == 0) goto L1b
            goto Lea
        L1b:
            java.util.ArrayList r5 = b0(r0)
            java.util.Iterator r5 = r5.iterator()
        L23:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L58
            java.lang.Object r6 = r5.next()
            r7 = r6
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.String r8 = r7.getName()
            java.lang.String r9 = "getMainContainerView"
            boolean r8 = gg.l.a(r8, r9)
            if (r8 == 0) goto L54
            java.lang.Class[] r8 = r7.getParameterTypes()
            r8.getClass()
            int r8 = r8.length
            if (r8 != 0) goto L54
            java.lang.Class<android.view.View> r8 = android.view.View.class
            java.lang.Class r7 = r7.getReturnType()
            boolean r7 = r8.isAssignableFrom(r7)
            if (r7 == 0) goto L54
            r7 = 1
            goto L55
        L54:
            r7 = r3
        L55:
            if (r7 == 0) goto L23
            goto L59
        L58:
            r6 = r4
        L59:
            r5 = r6
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            if (r5 != 0) goto L62
            r2.add(r0)
            return r4
        L62:
            r1.put(r0, r5)
            r2 = r5
        L66:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invoke(r2, r11, r0)
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L73
            android.view.View r0 = (android.view.View) r0
            goto L74
        L73:
            r0 = r4
        L74:
            if (r0 == 0) goto Lea
            int r1 = r0.getVisibility()
            r2 = 8
            if (r1 == r2) goto Lea
            boolean r1 = P(r0, r12)
            if (r1 != 0) goto L85
            goto Lea
        L85:
            java.util.concurrent.ConcurrentHashMap r1 = r10.f11665m
            android.view.View r11 = q(r11, r1)
            if (r0 != r11) goto Le9
            int r11 = r0.getWidth()
            if (r11 <= 0) goto Lea
            int r11 = r12.getWidth()
            if (r11 <= 0) goto Lea
            boolean r11 = P(r0, r12)
            if (r11 != 0) goto La0
            goto Lea
        La0:
            android.graphics.Rect r11 = new android.graphics.Rect
            int r1 = r0.getWidth()
            int r2 = r0.getHeight()
            r11.<init>(r3, r3, r1, r2)
            r12.offsetDescendantRectToMyCoords(r0, r11)
            android.content.Context r1 = r0.getContext()
            r1.getClass()
            r2 = 1090519040(0x41000000, float:8.0)
            int r1 = l(r1, r2)
            int r2 = r11.width()
            int r3 = r12.getWidth()
            int r5 = r12.getPaddingLeft()
            int r3 = r3 - r5
            int r5 = r12.getPaddingRight()
            int r3 = r3 - r5
            int r3 = r3 - r1
            if (r2 < r3) goto Le9
            int r2 = r11.left
            int r3 = r12.getPaddingLeft()
            int r3 = r3 + r1
            if (r2 > r3) goto Le9
            int r11 = r11.right
            int r2 = r12.getWidth()
            int r12 = r12.getPaddingRight()
            int r2 = r2 - r12
            int r2 = r2 - r1
            if (r11 >= r2) goto Lea
        Le9:
            return r0
        Lea:
            return r4
    }

    public final boolean B(java.lang.reflect.Method r5, fg.l r6) {
            r4 = this;
            java.util.Set r0 = r4.f11658f
            boolean r1 = r0.add(r5)
            if (r1 != 0) goto La
            r5 = 1
            return r5
        La:
            r8.i r1 = r8.i.f11631b     // Catch: java.lang.Throwable -> L18
            r9.b0 r2 = new r9.b0     // Catch: java.lang.Throwable -> L18
            r3 = 0
            r2.<init>(r6, r4, r5, r3)     // Catch: java.lang.Throwable -> L18
            r1.b(r5, r2)     // Catch: java.lang.Throwable -> L18
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L18
            goto L1f
        L18:
            r6 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r6)
            r6 = r1
        L1f:
            java.lang.Throwable r1 = sf.g.b(r6)
            if (r1 != 0) goto L26
            goto L42
        L26:
            r0.remove(r5)
            java.lang.String r5 = r5.getName()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Hchat扩展Hook安装失败: "
            r6.<init>(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            ia.t r6 = r4.f11654b
            r6.invoke(r5, r1)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
        L42:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            return r5
    }

    public final void B0(java.lang.Object r8, android.app.Activity r9) {
            r7 = this;
            java.lang.Class r0 = r8.getClass()
            java.util.ArrayList r0 = b0(r0)
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L40
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.Class[] r3 = r2.getParameterTypes()
            int r3 = r3.length
            r4 = 0
            r5 = 1
            if (r3 != r5) goto L3d
            java.lang.Class[] r3 = r2.getParameterTypes()
            r3 = r3[r4]
            java.lang.Class<android.view.View$OnClickListener> r6 = android.view.View.OnClickListener.class
            boolean r3 = r6.isAssignableFrom(r3)
            if (r3 == 0) goto L3d
            java.lang.Class r2 = r2.getReturnType()
            java.lang.Class r3 = java.lang.Void.TYPE
            boolean r2 = gg.l.a(r2, r3)
            if (r2 == 0) goto L3d
            r4 = r5
        L3d:
            if (r4 == 0) goto Lc
            goto L41
        L40:
            r1 = 0
        L41:
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            if (r1 == 0) goto L51
            k9.o r0 = new k9.o
            r0.<init>(r7, r9)
            java.lang.Object[] r9 = new java.lang.Object[]{r0}
            h.Hchat.utils.KavaReflector.invoke(r1, r8, r9)
        L51:
            return
    }

    public final boolean C(java.lang.reflect.Method r5, fg.l r6) {
            r4 = this;
            java.util.Set r0 = r4.f11658f
            boolean r1 = r0.add(r5)
            if (r1 != 0) goto La
            r5 = 1
            return r5
        La:
            r8.i r1 = r8.i.f11631b     // Catch: java.lang.Throwable -> L18
            r9.b0 r2 = new r9.b0     // Catch: java.lang.Throwable -> L18
            r3 = 1
            r2.<init>(r6, r4, r5, r3)     // Catch: java.lang.Throwable -> L18
            r1.b(r5, r2)     // Catch: java.lang.Throwable -> L18
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L18
            goto L1f
        L18:
            r6 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r6)
            r6 = r1
        L1f:
            java.lang.Throwable r1 = sf.g.b(r6)
            if (r1 != 0) goto L26
            goto L42
        L26:
            r0.remove(r5)
            java.lang.String r5 = r5.getName()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Hchat扩展Hook安装失败: "
            r6.<init>(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            ia.t r6 = r4.f11654b
            r6.invoke(r5, r1)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
        L42:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            return r5
    }

    public final boolean D(android.app.Activity r14, android.widget.ListAdapter r15) {
            r13 = this;
            q8.m r0 = h.Hchat.hooks.api.core.WeChatApis.chatPage()
            r1 = 0
            if (r0 == 0) goto Lc
            java.lang.String r0 = r0.a()
            goto Ld
        Lc:
            r0 = r1
        Ld:
            java.lang.String r2 = ""
            if (r0 != 0) goto L12
            r0 = r2
        L12:
            java.lang.String r3 = "@chatroom"
            r4 = 0
            boolean r5 = og.t.W(r0, r3, r4)
            if (r5 != 0) goto L25
            java.lang.String r5 = "@im.chatroom"
            boolean r5 = og.t.W(r0, r5, r4)
            if (r5 != 0) goto L25
            goto L36a
        L25:
            android.content.Intent r5 = r14.getIntent()
            if (r5 == 0) goto L36a
            java.lang.String r6 = "Contact_ChatRoomId"
            java.lang.String r7 = r5.getStringExtra(r6)
            boolean r7 = gg.l.a(r7, r0)
            r8 = 1
            if (r7 == 0) goto L39
            goto L6d
        L39:
            java.lang.String r7 = "Chat_User"
            java.lang.String r9 = r5.getStringExtra(r7)
            boolean r9 = gg.l.a(r9, r0)
            if (r9 == 0) goto L46
            goto L6d
        L46:
            java.lang.String r9 = "Contact_User"
            java.lang.String r9 = r5.getStringExtra(r9)
            boolean r9 = gg.l.a(r9, r0)
            if (r9 == 0) goto L54
            goto L36a
        L54:
            java.lang.String r6 = r5.getStringExtra(r6)
            if (r6 == 0) goto L61
            boolean r6 = og.t.W(r6, r3, r4)
            if (r6 != r8) goto L61
            goto L6d
        L61:
            java.lang.String r5 = r5.getStringExtra(r7)
            if (r5 == 0) goto L36a
            boolean r5 = og.t.W(r5, r3, r4)
            if (r5 != r8) goto L36a
        L6d:
            java.lang.String r5 = j(r14)
            if (r5 == 0) goto L36a
            boolean r3 = og.t.W(r5, r3, r4)
            if (r3 != 0) goto L36a
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L81
            goto L36a
        L81:
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.String r3 = "com.tencent.mm.ui.base.preference.Preference"
            java.lang.String r5 = "历史发言记录"
            java.lang.String r6 = "hchat_group_member_history"
            if (r15 == 0) goto L2a1
            int r7 = a(r15)
            r9 = r4
        L90:
            if (r9 < r7) goto L94
            r10 = r1
            goto Lb6
        L94:
            java.lang.Object r10 = c(r9, r15)
            if (r10 == 0) goto L29d
            java.lang.String r11 = j0(r10)
            boolean r11 = r11.equals(r6)
            if (r11 != 0) goto Lb6
            boolean r11 = og.m.t0(r5)
            if (r11 == 0) goto Lac
            goto L29d
        Lac:
            java.lang.String r11 = k0(r10)
            boolean r11 = r11.equals(r5)
            if (r11 == 0) goto L29d
        Lb6:
            if (r10 == 0) goto L17d
            C0(r10)
            D0(r5, r10, r8)
            D0(r2, r10, r4)
            r13.B0(r10, r14)
            int r7 = b(r15, r10)
            int r9 = a(r15)
            r14 = r4
        Lcd:
            if (r14 < r9) goto Ld1
            r14 = r1
            goto Ldb
        Ld1:
            java.lang.Object r0 = c(r14, r15)
            if (r0 != r10) goto L179
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
        Ldb:
            if (r14 == 0) goto L178
            int r14 = r14.intValue()
            int r0 = a(r15)
            int r0 = r0 - r8
            if (r0 >= 0) goto Le9
            r0 = r4
        Le9:
            int r0 = r9.e0.r(r7, r4, r0)
            if (r14 != r0) goto Lf1
            goto L178
        Lf1:
            java.lang.Class r14 = r15.getClass()
            java.util.ArrayList r14 = b0(r14)
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L101
            goto L178
        L101:
            java.util.Iterator r14 = r14.iterator()
        L105:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L178
            java.lang.Object r0 = r14.next()
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            java.lang.Class[] r2 = r0.getParameterTypes()
            int r2 = r2.length
            if (r2 != r8) goto L105
            java.lang.Class[] r2 = r0.getParameterTypes()
            r2 = r2[r4]
            java.lang.Class r3 = r10.getClass()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto L105
            java.lang.Class r2 = r0.getReturnType()
            java.lang.Class r3 = java.lang.Boolean.TYPE
            boolean r2 = gg.l.a(r2, r3)
            if (r2 != 0) goto L141
            java.lang.Class r2 = r0.getReturnType()
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            boolean r2 = gg.l.a(r2, r3)
            if (r2 != 0) goto L141
            goto L105
        L141:
            java.lang.Object[] r2 = new java.lang.Object[]{r10}
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invoke(r0, r15, r2)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r0 = gg.l.a(r0, r2)
            if (r0 == 0) goto L105
            int r0 = a(r15)
            r2 = r4
        L156:
            if (r2 < r0) goto L15a
            r0 = r1
            goto L164
        L15a:
            java.lang.Object r3 = c(r2, r15)
            if (r3 != r10) goto L175
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
        L164:
            if (r0 != 0) goto L105
            int r14 = a(r15)
            if (r14 >= 0) goto L16d
            r14 = r4
        L16d:
            int r14 = r9.e0.r(r7, r4, r14)
            d(r15, r14, r10)
            return r8
        L175:
            int r2 = r2 + 1
            goto L156
        L178:
            return r8
        L179:
            int r14 = r14 + 1
            goto Lcd
        L17d:
            boolean r7 = r13.F
            if (r7 == 0) goto L183
            goto L2a1
        L183:
            r13.F = r8
            r8.g r7 = r13.f11653a     // Catch: java.lang.Throwable -> L243
            java.lang.ClassLoader r7 = r7.f11622c     // Catch: java.lang.Throwable -> L243
            java.lang.Class r7 = h.Hchat.utils.KavaReflector.loadClass(r3, r7)     // Catch: java.lang.Throwable -> L243
            if (r7 == 0) goto L297
            java.lang.Class[] r9 = new java.lang.Class[]{r0}     // Catch: java.lang.Throwable -> L243
            java.lang.reflect.Constructor r7 = h.Hchat.utils.KavaReflector.findConstructor(r7, r9)     // Catch: java.lang.Throwable -> L243
            java.lang.Object[] r9 = new java.lang.Object[]{r14}     // Catch: java.lang.Throwable -> L243
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.newInstance(r7, r9)     // Catch: java.lang.Throwable -> L243
            if (r7 == 0) goto L297
            C0(r7)     // Catch: java.lang.Throwable -> L243
            D0(r5, r7, r8)     // Catch: java.lang.Throwable -> L243
            D0(r2, r7, r4)     // Catch: java.lang.Throwable -> L243
            r13.B0(r7, r14)     // Catch: java.lang.Throwable -> L243
            int r2 = a(r15)     // Catch: java.lang.Throwable -> L243
            r9 = r4
        L1b2:
            if (r9 < r2) goto L1b6
            r10 = r1
            goto L1bc
        L1b6:
            java.lang.Object r10 = c(r9, r15)     // Catch: java.lang.Throwable -> L243
            if (r10 == 0) goto L293
        L1bc:
            if (r10 != 0) goto L1bf
            goto L1e9
        L1bf:
            java.lang.String r2 = "getLayoutResource"
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L243
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invokeMethod(r10, r2, r9)     // Catch: java.lang.Throwable -> L243
            boolean r9 = r2 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L243
            if (r9 == 0) goto L1ce
            java.lang.Number r2 = (java.lang.Number) r2     // Catch: java.lang.Throwable -> L243
            goto L1cf
        L1ce:
            r2 = r1
        L1cf:
            if (r2 == 0) goto L1e9
            int r9 = r2.intValue()     // Catch: java.lang.Throwable -> L243
            if (r9 != 0) goto L1d8
            goto L1e9
        L1d8:
            java.lang.String r9 = "setLayoutResource"
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L243
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L243
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L243
            h.Hchat.utils.KavaReflector.invokeMethod(r7, r9, r2)     // Catch: java.lang.Throwable -> L243
        L1e9:
            int r2 = b(r15, r1)     // Catch: java.lang.Throwable -> L243
            java.lang.Class r9 = r15.getClass()     // Catch: java.lang.Throwable -> L243
            java.util.ArrayList r9 = b0(r9)     // Catch: java.lang.Throwable -> L243
            boolean r10 = r9.isEmpty()     // Catch: java.lang.Throwable -> L243
            if (r10 == 0) goto L1fd
        L1fb:
            r2 = r4
            goto L245
        L1fd:
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L243
        L201:
            boolean r10 = r9.hasNext()     // Catch: java.lang.Throwable -> L243
            if (r10 == 0) goto L1fb
            java.lang.Object r10 = r9.next()     // Catch: java.lang.Throwable -> L243
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10     // Catch: java.lang.Throwable -> L243
            java.lang.Class[] r11 = r10.getParameterTypes()     // Catch: java.lang.Throwable -> L243
            int r11 = r11.length     // Catch: java.lang.Throwable -> L243
            r12 = 2
            if (r11 != r12) goto L201
            java.lang.Class[] r11 = r10.getParameterTypes()     // Catch: java.lang.Throwable -> L243
            r11 = r11[r8]     // Catch: java.lang.Throwable -> L243
            java.lang.Class r12 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L243
            boolean r11 = gg.l.a(r11, r12)     // Catch: java.lang.Throwable -> L243
            if (r11 == 0) goto L201
            java.lang.Class[] r11 = r10.getParameterTypes()     // Catch: java.lang.Throwable -> L243
            r11 = r11[r4]     // Catch: java.lang.Throwable -> L243
            java.lang.Class r12 = r7.getClass()     // Catch: java.lang.Throwable -> L243
            boolean r11 = r11.isAssignableFrom(r12)     // Catch: java.lang.Throwable -> L243
            if (r11 == 0) goto L201
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L243
            java.lang.Object[] r11 = new java.lang.Object[]{r7, r11}     // Catch: java.lang.Throwable -> L243
            boolean r10 = h.Hchat.utils.KavaReflector.invokeSuccessfully(r10, r15, r11)     // Catch: java.lang.Throwable -> L243
            if (r10 == 0) goto L201
            r2 = r8
            goto L245
        L243:
            r14 = move-exception
            goto L29a
        L245:
            r13.F = r4
            if (r2 != 0) goto L24a
            goto L2a1
        L24a:
            java.lang.String r14 = "notifyDataSetChanged"
            r13.F = r8
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L282
            h.Hchat.utils.KavaReflector.invokeMethod(r15, r14, r0)     // Catch: java.lang.Throwable -> L282
            java.lang.Class r0 = r15.getClass()     // Catch: java.lang.Throwable -> L282
            java.util.ArrayList r0 = b0(r0)     // Catch: java.lang.Throwable -> L282
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L282
        L25f:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L282
            if (r2 == 0) goto L284
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L282
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.Throwable -> L282
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L282
            boolean r5 = gg.l.a(r5, r14)     // Catch: java.lang.Throwable -> L282
            if (r5 == 0) goto L25f
            java.lang.Class[] r3 = r3.getParameterTypes()     // Catch: java.lang.Throwable -> L282
            r3.getClass()     // Catch: java.lang.Throwable -> L282
            int r3 = r3.length     // Catch: java.lang.Throwable -> L282
            if (r3 != 0) goto L25f
            r1 = r2
            goto L284
        L282:
            r14 = move-exception
            goto L290
        L284:
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch: java.lang.Throwable -> L282
            if (r1 == 0) goto L28d
            java.lang.Object[] r14 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L282
            h.Hchat.utils.KavaReflector.invoke(r1, r15, r14)     // Catch: java.lang.Throwable -> L282
        L28d:
            r13.F = r4
            return r8
        L290:
            r13.F = r4
            throw r14
        L293:
            int r9 = r9 + 1
            goto L1b2
        L297:
            r13.F = r4
            goto L2a1
        L29a:
            r13.F = r4
            throw r14
        L29d:
            int r9 = r9 + 1
            goto L90
        L2a1:
            java.lang.String r15 = "getPreferenceScreen"
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.Object r15 = h.Hchat.utils.KavaReflector.invokeMethod(r14, r15, r2)
            if (r15 == 0) goto L36a
            java.lang.Class r2 = r15.getClass()
            java.util.ArrayList r2 = b0(r2)
            java.util.Iterator r2 = r2.iterator()
        L2b7:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L301
            java.lang.Object r7 = r2.next()
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.Class[] r9 = r7.getParameterTypes()
            int r9 = r9.length
            if (r9 != r8) goto L2fd
            java.lang.Class[] r9 = r7.getParameterTypes()
            r9 = r9[r4]
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            boolean r9 = gg.l.a(r9, r10)
            if (r9 == 0) goto L2fd
            java.lang.Class r9 = r7.getReturnType()
            java.lang.String r9 = r9.getName()
            java.lang.String r10 = "Preference"
            boolean r9 = og.m.h0(r9, r10, r4)
            if (r9 == 0) goto L2fd
            java.lang.Object[] r9 = new java.lang.Object[]{r6}
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.invoke(r7, r15, r9)
            if (r7 == 0) goto L2fd
            java.lang.String r9 = j0(r7)
            boolean r9 = r9.equals(r6)
            if (r9 == 0) goto L2fd
            goto L2fe
        L2fd:
            r7 = r1
        L2fe:
            if (r7 == 0) goto L2b7
            r1 = r7
        L301:
            if (r1 == 0) goto L30a
            r13.B0(r1, r14)
            d0(r15)
            return r8
        L30a:
            r8.g r1 = r13.f11653a
            java.lang.ClassLoader r1 = r1.f11622c
            java.lang.Class r1 = h.Hchat.utils.KavaReflector.loadClass(r3, r1)
            if (r1 == 0) goto L36a
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            java.lang.reflect.Constructor r0 = h.Hchat.utils.KavaReflector.findConstructor(r1, r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r14}
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.newInstance(r0, r1)
            if (r0 == 0) goto L36a
            C0(r0)
            D0(r5, r0, r8)
            r13.B0(r0, r14)
            int r14 = a(r15)
            r1 = r4
        L334:
            if (r1 < r14) goto L351
            r1 = r4
        L337:
            if (r1 < r14) goto L33e
            if (r14 >= 0) goto L33c
            goto L35d
        L33c:
            r4 = r14
            goto L35d
        L33e:
            java.lang.Object r2 = c(r1, r15)
            java.lang.String r3 = j0(r2)
            boolean r2 = L(r2, r3)
            if (r2 == 0) goto L34e
            r4 = r1
            goto L35d
        L34e:
            int r1 = r1 + 1
            goto L337
        L351:
            java.lang.Object r2 = c(r1, r15)
            boolean r2 = M(r2)
            if (r2 == 0) goto L367
            int r4 = r1 + 1
        L35d:
            boolean r14 = d(r15, r4, r0)
            if (r14 == 0) goto L366
            d0(r15)
        L366:
            return r14
        L367:
            int r1 = r1 + 1
            goto L334
        L36a:
            return r4
    }

    public final boolean E(android.view.View r29, android.widget.TextView r30, android.widget.TextView r31, java.lang.Object r32, java.lang.Object r33, r9.f0 r34) {
            r28 = this;
            r1 = r28
            r8 = r29
            r11 = r30
            r12 = r32
            r13 = r33
            r5 = r34
            r9.z r9 = r1.B
            java.lang.String r10 = r9.f11816b
            boolean r0 = r5.f11714l
            if (r0 == 0) goto L18
            boolean r0 = r1.C
        L16:
            r14 = r0
            goto L1b
        L18:
            boolean r0 = r1.D
            goto L16
        L1b:
            r15 = 1
            r0 = 0
            if (r14 == 0) goto L29
            java.lang.String r2 = "avatar_below"
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L29
            r2 = r15
            goto L2a
        L29:
            r2 = r0
        L2a:
            r3 = 0
            if (r2 == 0) goto L30
            r15 = r3
            goto Le7
        L30:
            android.view.View r4 = r1.o(r12)
            if (r4 == 0) goto L3d
            boolean r6 = P(r4, r8)
            if (r6 == 0) goto L3d
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L5f
            java.lang.Class r6 = r4.getClass()
            java.lang.String r6 = r6.getName()
            java.lang.String r7 = "com.tencent.mm.ui.chatting.view.ChattingAvatarImageView"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L5a
            if (r14 != 0) goto L58
            boolean r6 = Q(r4)
            if (r6 == 0) goto L5a
        L58:
            r6 = r4
            goto L5b
        L5a:
            r6 = r3
        L5b:
            if (r6 == 0) goto L5f
        L5d:
            r4 = r6
            goto L6f
        L5f:
            android.view.View r6 = n(r8, r15)
            if (r6 == 0) goto L66
            goto L6a
        L66:
            android.view.View r6 = n(r8, r0)
        L6a:
            if (r6 == 0) goto L6d
            goto L5d
        L6d:
            if (r4 == 0) goto Ld8
        L6f:
            android.view.ViewParent r6 = r4.getParent()
            boolean r7 = r6 instanceof android.view.View
            if (r7 == 0) goto L7a
            android.view.View r6 = (android.view.View) r6
            goto L7b
        L7a:
            r6 = r3
        L7b:
            r16 = r3
            r17 = r16
            r7 = r4
        L80:
            if (r7 == r8) goto Ld8
            android.view.ViewParent r7 = r7.getParent()
            boolean r0 = r7 instanceof android.view.ViewGroup
            if (r0 == 0) goto L8d
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto L8e
        L8d:
            r7 = r3
        L8e:
            if (r7 == 0) goto Ld8
            java.lang.Class r0 = r7.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r15 = "com.tencent.mm.ui.base.MaskLayout"
            boolean r0 = r0.equals(r15)
            if (r0 == 0) goto La2
            r17 = r7
        La2:
            boolean r0 = r7 instanceof android.widget.RelativeLayout
            if (r0 == 0) goto Laa
            r16 = r7
            android.widget.RelativeLayout r16 = (android.widget.RelativeLayout) r16
        Laa:
            r0 = r16
            if (r7 != r8) goto Lda
            if (r0 == 0) goto Ld8
            if (r14 != 0) goto Lc7
            int r7 = r4.getVisibility()
            if (r7 != 0) goto Lc7
            if (r17 == 0) goto Lc5
            android.view.ViewGroup$LayoutParams r7 = r17.getLayoutParams()
            if (r7 == 0) goto Lc5
            int r7 = r7.width
            if (r7 != 0) goto Lc5
            goto Lc7
        Lc5:
            r7 = 0
            goto Lc8
        Lc7:
            r7 = 1
        Lc8:
            if (r7 == 0) goto Ld2
            if (r17 == 0) goto Lcf
            r4 = r17
            goto Ld2
        Lcf:
            if (r6 == 0) goto Ld2
            r4 = r6
        Ld2:
            r9.q r6 = new r9.q
            r6.<init>(r0, r4, r7)
            goto Le6
        Ld8:
            r6 = r3
            goto Le6
        Lda:
            boolean r15 = O(r7)
            if (r15 == 0) goto Le1
            goto Ld8
        Le1:
            r16 = r0
            r0 = 0
            r15 = 1
            goto L80
        Le6:
            r15 = r6
        Le7:
            java.lang.String r0 = "message_bottom"
            boolean r0 = r10.equals(r0)
            if (r0 != 0) goto Lf4
            if (r2 == 0) goto Lf2
            goto Lf4
        Lf2:
            r0 = r15
            goto Lf5
        Lf4:
            r0 = r3
        Lf5:
            if (r0 != 0) goto Lfa
            r1.y0(r8, r3)
        Lfa:
            if (r0 != 0) goto L13f
            if (r11 == 0) goto L13b
            android.view.ViewParent r2 = r11.getParent()
            boolean r4 = r2 instanceof android.view.ViewGroup
            if (r4 == 0) goto L109
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            goto L10a
        L109:
            r2 = r3
        L10a:
            if (r2 == 0) goto L114
            boolean r4 = r2 instanceof android.widget.RelativeLayout
            if (r4 != 0) goto L116
            boolean r4 = r2 instanceof android.widget.LinearLayout
            if (r4 != 0) goto L116
        L114:
            r7 = r3
            goto L139
        L116:
            android.view.View r4 = r1.A(r12, r2)
            if (r4 == 0) goto L128
            android.view.View r6 = k(r4, r2)
            if (r6 == 0) goto L128
            r9.u r7 = new r9.u
            r7.<init>(r2, r6, r4)
            goto L139
        L128:
            android.view.View r4 = r1.W(r12, r2, r11)
            if (r4 == 0) goto L114
            android.view.View r6 = k(r4, r2)
            if (r6 == 0) goto L114
            r9.u r7 = new r9.u
            r7.<init>(r2, r6, r4)
        L139:
            r2 = r7
            goto L140
        L13b:
            r18 = 0
            goto L8a2
        L13f:
            r2 = r3
        L140:
            if (r0 == 0) goto L15b
            boolean r4 = r0.f11786c
            if (r4 == 0) goto L148
            r4 = r0
            goto L149
        L148:
            r4 = r3
        L149:
            if (r4 == 0) goto L15b
            android.widget.RelativeLayout r4 = r4.f11784a
            android.view.View r6 = r1.A(r12, r4)
            if (r6 == 0) goto L154
            goto L158
        L154:
            android.view.View r6 = r1.W(r12, r4, r3)
        L158:
            r16 = r6
            goto L15d
        L15b:
            r16 = r3
        L15d:
            if (r0 == 0) goto L162
            android.widget.RelativeLayout r4 = r0.f11784a
            goto L166
        L162:
            if (r2 == 0) goto L13b
            android.view.ViewGroup r4 = r2.f11799a
        L166:
            boolean r6 = r4 instanceof android.widget.RelativeLayout
            if (r6 != 0) goto L16f
            boolean r7 = r4 instanceof android.widget.LinearLayout
            if (r7 != 0) goto L16f
            goto L13b
        L16f:
            if (r31 == 0) goto L189
            java.lang.Object r7 = r31.getTag()
            java.lang.String r3 = "hchat_message_details_view"
            boolean r3 = gg.l.a(r7, r3)
            if (r3 == 0) goto L180
            r3 = r31
            goto L181
        L180:
            r3 = 0
        L181:
            if (r3 == 0) goto L189
            r20 = r0
            r21 = r2
        L187:
            r0 = r3
            goto L1cf
        L189:
            int r3 = r4.getChildCount()
            r7 = 0
        L18e:
            if (r7 < r3) goto L196
            r20 = r0
            r21 = r2
            r3 = 0
            goto L1b4
        L196:
            r20 = r0
            android.view.View r0 = r4.getChildAt(r7)
            r21 = r2
            boolean r2 = r0 instanceof android.widget.TextView
            if (r2 == 0) goto L87d
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.Object r2 = r0.getTag()
            r31 = r0
            java.lang.String r0 = "hchat_message_details_view"
            boolean r0 = gg.l.a(r2, r0)
            if (r0 == 0) goto L87d
            r3 = r31
        L1b4:
            if (r3 == 0) goto L1b7
            goto L187
        L1b7:
            android.widget.TextView r3 = new android.widget.TextView
            if (r11 == 0) goto L1c2
            android.content.Context r0 = r11.getContext()
            if (r0 == 0) goto L1c2
            goto L1c6
        L1c2:
            android.content.Context r0 = r8.getContext()
        L1c6:
            r3.<init>(r0)
            java.lang.String r0 = "hchat_message_details_view"
            r3.setTag(r0)
            goto L187
        L1cf:
            android.view.ViewParent r2 = r0.getParent()
            if (r2 == r4) goto L1e9
            r1.u0(r8, r0)
            android.view.ViewParent r2 = r0.getParent()
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1e3
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            goto L1e4
        L1e3:
            r2 = 0
        L1e4:
            if (r2 == 0) goto L1e9
            r2.removeView(r0)
        L1e9:
            java.util.Set r2 = r1.f11673u
            r2.getClass()
            monitor-enter(r2)
            java.util.Set r3 = r1.f11673u     // Catch: java.lang.Throwable -> L87a
            r3.add(r0)     // Catch: java.lang.Throwable -> L87a
            monitor-exit(r2)
            r9.z r7 = r1.B
            long r2 = r5.f11713k
            java.lang.Long r22 = java.lang.Long.valueOf(r2)
            r23 = 0
            int r2 = (r2 > r23 ? 1 : (r2 == r23 ? 0 : -1))
            if (r2 <= 0) goto L204
            goto L206
        L204:
            r22 = 0
        L206:
            if (r22 == 0) goto L20f
            long r2 = r22.longValue()
        L20c:
            r22 = r6
            goto L214
        L20f:
            long r2 = java.lang.System.currentTimeMillis()
            goto L20c
        L214:
            gg.u r6 = new gg.u
            r6.<init>()
            r23 = r4
            gg.u r4 = new gg.u
            r4.<init>()
            r31 = r0
            java.lang.String r0 = r7.f11817c
            java.lang.String r1 = "${time}"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L255
            java.lang.Object r0 = r6.f4564g
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L233
            goto L24a
        L233:
            java.time.Instant r0 = java.time.Instant.ofEpochMilli(r2)
            java.time.ZoneId r1 = java.time.ZoneId.systemDefault()
            java.time.LocalDateTime r0 = java.time.LocalDateTime.ofInstant(r0, r1)
            java.time.format.DateTimeFormatter r1 = r7.f11819e
            java.lang.String r0 = r0.format(r1)
            r6.f4564g = r0
            r0.getClass()
        L24a:
            r1 = r28
            r2 = r0
            r0 = r5
            r25 = r20
            r26 = r21
            r27 = r23
            goto L274
        L255:
            java.lang.String r0 = r7.f11817c
            r1 = r0
            r9.k r0 = new r9.k
            r11 = r1
            r25 = r20
            r26 = r21
            r27 = r23
            r1 = r28
            r0.<init>(r1, r2, r4, r5, r6, r7)
            r2 = r0
            r0 = r5
            og.k r3 = r9.d0.G
            nb.a r4 = new nb.a
            r5 = 4
            r4.<init>(r2, r5)
            java.lang.String r2 = r3.e(r11, r4)
        L274:
            java.lang.CharSequence r3 = r31.getText()
            boolean r3 = android.text.TextUtils.equals(r3, r2)
            if (r3 != 0) goto L284
            r3 = r31
            r3.setText(r2)
            goto L286
        L284:
            r3 = r31
        L286:
            r1.e(r3)
            float r2 = r3.getAlpha()
            r4 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L294
            goto L297
        L294:
            r3.setAlpha(r4)
        L297:
            boolean r2 = r3.getIncludeFontPadding()
            if (r2 != 0) goto L2a1
            r2 = 1
            r3.setIncludeFontPadding(r2)
        L2a1:
            android.content.Context r2 = r3.getContext()
            r2.getClass()
            r4 = 1082130432(0x40800000, float:4.0)
            int r2 = l(r2, r4)
            android.content.Context r4 = r3.getContext()
            r4.getClass()
            r5 = 1073741824(0x40000000, float:2.0)
            int r4 = l(r4, r5)
            int r6 = r3.getPaddingLeft()
            if (r6 != r2) goto L2d3
            int r6 = r3.getPaddingTop()
            if (r6 != r4) goto L2d3
            int r6 = r3.getPaddingRight()
            if (r6 != r2) goto L2d3
            int r6 = r3.getPaddingBottom()
            if (r6 == r4) goto L2d6
        L2d3:
            r3.setPadding(r2, r4, r2, r4)
        L2d6:
            r9.z r2 = r1.B
            float r2 = r2.f11820f
            float r4 = r3.getTextSize()
            android.content.res.Resources r6 = r3.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.scaledDensity
            float r4 = r4 / r6
            float r4 = r4 - r2
            float r4 = java.lang.Math.abs(r4)
            r6 = 1008981770(0x3c23d70a, float:0.01)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r6 = 2
            if (r4 <= 0) goto L2f9
            r3.setTextSize(r6, r2)
        L2f9:
            java.util.WeakHashMap r2 = r1.f11674v
            monitor-enter(r2)
            java.util.WeakHashMap r4 = r1.f11674v     // Catch: java.lang.Throwable -> L877
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L877
            r9.y r4 = (r9.y) r4     // Catch: java.lang.Throwable -> L877
            monitor-exit(r2)
            boolean r2 = r9.f11824j
            if (r2 == 0) goto L327
            boolean r2 = r3.isClickable()
            if (r2 == 0) goto L319
            if (r4 == 0) goto L314
            java.lang.Object r2 = r4.f11813d
            goto L315
        L314:
            r2 = 0
        L315:
            if (r2 != r13) goto L319
        L317:
            r2 = 1
            goto L323
        L319:
            k9.l r2 = new k9.l
            r4 = 1
            r2.<init>(r13, r0, r1, r4)
            r3.setOnClickListener(r2)
            goto L317
        L323:
            r3.setClickable(r2)
            goto L335
        L327:
            boolean r2 = r3.isClickable()
            if (r2 == 0) goto L335
            r2 = 0
            r3.setOnClickListener(r2)
            r2 = 0
            r3.setClickable(r2)
        L335:
            r2 = 2147483647(0x7fffffff, float:NaN)
            r9 = -2
            r11 = r25
            if (r11 == 0) goto L53c
            boolean r5 = r0.f11714l
            android.widget.RelativeLayout r14 = r11.f11784a
            android.view.ViewParent r6 = r3.getParent()
            boolean r15 = r6 instanceof android.view.ViewGroup
            if (r15 == 0) goto L34c
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            goto L34d
        L34c:
            r6 = 0
        L34d:
            if (r6 != r14) goto L351
            r15 = 1
            goto L352
        L351:
            r15 = 0
        L352:
            if (r6 == 0) goto L359
            if (r15 != 0) goto L359
            r6.removeView(r3)
        L359:
            android.content.Context r6 = r3.getContext()
            r6.getClass()
            r9.z r7 = r1.B
            int r7 = r7.f11821g
            float r7 = (float) r7
            int r7 = l(r6, r7)
            if (r15 == 0) goto L379
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            r20 = 0
            boolean r4 = r6 instanceof android.widget.RelativeLayout.LayoutParams
            if (r4 == 0) goto L37b
            r4 = r6
            android.widget.RelativeLayout$LayoutParams r4 = (android.widget.RelativeLayout.LayoutParams) r4
            goto L37c
        L379:
            r20 = 0
        L37b:
            r4 = 0
        L37c:
            if (r4 == 0) goto L37f
            goto L384
        L37f:
            android.widget.RelativeLayout$LayoutParams r4 = new android.widget.RelativeLayout$LayoutParams
            r4.<init>(r9, r9)
        L384:
            int r6 = r3.getMaxLines()
            r9 = 1
            if (r6 == r9) goto L396
            r3.setSingleLine(r9)
            r3.setMaxLines(r9)
            r6 = 0
            r3.setHorizontallyScrolling(r6)
            goto L397
        L396:
            r6 = 0
        L397:
            android.text.TextUtils$TruncateAt r9 = r3.getEllipsize()
            if (r9 == 0) goto L3a1
            r9 = 0
            r3.setEllipsize(r9)
        L3a1:
            int r9 = r3.getMinWidth()
            if (r9 == 0) goto L3aa
            r3.setMinWidth(r6)
        L3aa:
            int r6 = r3.getMaxWidth()
            if (r6 == r2) goto L3b3
            r3.setMaxWidth(r2)
        L3b3:
            float r2 = r3.getTranslationX()
            int r2 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r2 != 0) goto L3be
            r2 = r20
            goto L3c3
        L3be:
            r2 = r20
            r3.setTranslationX(r2)
        L3c3:
            float r6 = r3.getTranslationY()
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 != 0) goto L3cc
            goto L3cf
        L3cc:
            r3.setTranslationY(r2)
        L3cf:
            int r2 = r3.getGravity()
            r6 = 17
            if (r2 == r6) goto L3da
            r3.setGravity(r6)
        L3da:
            int r2 = r3.getTextAlignment()
            r6 = 4
            if (r2 == r6) goto L3e4
            r3.setTextAlignment(r6)
        L3e4:
            if (r15 == 0) goto L3ed
            boolean r2 = r11.f11786c
            if (r2 == 0) goto L3eb
            goto L3ed
        L3eb:
            r2 = 0
            goto L3f1
        L3ed:
            r3.setVisibility(r6)
            goto L3eb
        L3f1:
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)
            r3.measure(r6, r9)
            java.lang.String r2 = "avatar_above"
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L40a
            int r2 = r3.getMeasuredHeight()
            int r2 = r2 + r7
            goto L40b
        L40a:
            r2 = 0
        L40b:
            r1.y0(r8, r14)
            java.util.WeakHashMap r6 = r1.f11675w
            monitor-enter(r6)
            java.util.WeakHashMap r9 = r1.f11675w     // Catch: java.lang.Throwable -> L539
            java.lang.Object r9 = r9.get(r14)     // Catch: java.lang.Throwable -> L539
            r9.s r9 = (r9.s) r9     // Catch: java.lang.Throwable -> L539
            monitor-exit(r6)
            if (r9 == 0) goto L421
            int r6 = r9.f11789a
        L41e:
            r21 = r6
            goto L426
        L421:
            int r6 = r14.getPaddingTop()
            goto L41e
        L426:
            if (r9 == 0) goto L42d
            int r6 = r9.f11790b
        L42a:
            r22 = r6
            goto L432
        L42d:
            int r6 = r14.getPaddingBottom()
            goto L42a
        L432:
            if (r2 >= 0) goto L435
            r2 = 0
        L435:
            java.lang.String r6 = "avatar_above"
            boolean r6 = r10.equals(r6)
            if (r6 == 0) goto L43f
            r6 = r2
            goto L440
        L43f:
            r6 = 0
        L440:
            int r6 = r21 + r6
            java.lang.String r0 = "avatar_below"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L44c
            r0 = r2
            goto L44d
        L44c:
            r0 = 0
        L44d:
            int r0 = r22 + r0
            if (r9 == 0) goto L456
            boolean r2 = r9.f11793e
        L453:
            r25 = r2
            goto L45b
        L456:
            boolean r2 = r14.getClipToPadding()
            goto L453
        L45b:
            if (r9 == 0) goto L466
            java.util.List r2 = r9.f11794f
        L45f:
            r27 = r5
            r31 = r7
            r26 = r2
            goto L4ab
        L466:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r9 = r14
        L46c:
            if (r9 == 0) goto L45f
            if (r9 == r8) goto L45f
            r27 = r5
            boolean r5 = r9 instanceof android.view.ViewGroup
            if (r5 == 0) goto L493
            r9.r r5 = new r9.r
            r31 = r7
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference
            r7.<init>(r9)
            r8 = r9
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r20 = r9
            boolean r9 = r8.getClipChildren()
            r5.<init>(r7, r9)
            r2.add(r5)
            r5 = 0
            r8.setClipChildren(r5)
            goto L497
        L493:
            r31 = r7
            r20 = r9
        L497:
            android.view.ViewParent r5 = r20.getParent()
            boolean r7 = r5 instanceof android.view.View
            if (r7 == 0) goto L4a3
            android.view.View r5 = (android.view.View) r5
            r9 = r5
            goto L4a4
        L4a3:
            r9 = 0
        L4a4:
            r8 = r29
            r7 = r31
            r5 = r27
            goto L46c
        L4ab:
            java.util.Iterator r2 = r26.iterator()
        L4af:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L4ca
            java.lang.Object r5 = r2.next()
            r9.r r5 = (r9.r) r5
            java.lang.ref.WeakReference r5 = r5.f11787a
            java.lang.Object r5 = r5.get()
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            if (r5 == 0) goto L4af
            r7 = 0
            r5.setClipChildren(r7)
            goto L4af
        L4ca:
            int r2 = r14.getPaddingTop()
            if (r2 != r6) goto L4d9
            int r2 = r14.getPaddingBottom()
            if (r2 == r0) goto L4d7
            goto L4d9
        L4d7:
            r2 = 0
            goto L4e5
        L4d9:
            int r2 = r14.getPaddingLeft()
            int r5 = r14.getPaddingRight()
            r14.setPadding(r2, r6, r5, r0)
            goto L4d7
        L4e5:
            r14.setClipToPadding(r2)
            java.util.WeakHashMap r2 = r1.f11675w
            monitor-enter(r2)
            java.util.WeakHashMap r5 = r1.f11675w     // Catch: java.lang.Throwable -> L536
            r9.s r20 = new r9.s     // Catch: java.lang.Throwable -> L536
            r24 = r0
            r23 = r6
            r20.<init>(r21, r22, r23, r24, r25, r26)     // Catch: java.lang.Throwable -> L536
            r0 = r20
            r5.put(r14, r0)     // Catch: java.lang.Throwable -> L536
            monitor-exit(r2)
            if (r15 != 0) goto L501
            r14.addView(r3, r4)
        L501:
            r6 = r10
            android.widget.RelativeLayout r10 = r11.f11784a
            java.util.WeakHashMap r0 = r1.f11677y
            r2 = r0
            r9.m r0 = new r9.m
            r9 = 0
            r7 = r31
            r12 = r2
            r2 = r3
            r4 = r11
            r5 = r16
            r8 = r27
            r3 = r29
            r11 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r8 = r3
            r3 = r2
            boolean r0 = A0(r3, r10, r12, r0)
            if (r0 != 0) goto L52c
            r14.removeView(r3)
            r9 = 0
            r1.y0(r8, r9)
        L529:
            r15 = 0
            goto L86a
        L52c:
            r19 = 1
            r0 = r15 ^ 1
            r1.r0(r3, r0)
        L533:
            r15 = 1
            goto L86a
        L536:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L539:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L53c:
            r11 = r0
            r0 = r26
            if (r0 == 0) goto L13b
            android.view.View r4 = r0.f11800b
            android.view.View r0 = r0.f11801c
            if (r14 != 0) goto L551
            if (r15 == 0) goto L54f
            boolean r7 = r15.f11786c
            r10 = 1
            if (r7 != r10) goto L54f
            goto L551
        L54f:
            r7 = 0
            goto L552
        L551:
            r7 = 1
        L552:
            int r10 = r3.getMaxLines()
            if (r10 == r2) goto L562
            r10 = 0
            r3.setSingleLine(r10)
            r3.setMaxLines(r2)
            r3.setHorizontallyScrolling(r10)
        L562:
            android.text.TextUtils$TruncateAt r10 = r3.getEllipsize()
            if (r10 == 0) goto L56d
            r10 = 0
            r3.setEllipsize(r10)
            goto L56e
        L56d:
            r10 = 0
        L56e:
            int r12 = r3.getMaxWidth()
            if (r12 == r2) goto L577
            r3.setMaxWidth(r2)
        L577:
            android.view.ViewParent r2 = r3.getParent()
            boolean r12 = r2 instanceof android.view.ViewGroup
            if (r12 == 0) goto L584
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
        L581:
            r12 = r27
            goto L586
        L584:
            r2 = r10
            goto L581
        L586:
            if (r2 != r12) goto L58a
            r14 = 1
            goto L58b
        L58a:
            r14 = 0
        L58b:
            if (r2 == 0) goto L592
            if (r14 != 0) goto L592
            r2.removeView(r3)
        L592:
            r9.z r2 = r1.B
            android.content.Context r15 = r3.getContext()
            r15.getClass()
            int r10 = r2.f11822h
            float r10 = (float) r10
            int r10 = l(r15, r10)
            android.content.Context r15 = r3.getContext()
            r15.getClass()
            int r2 = r2.f11823i
            float r2 = (float) r2
            int r2 = l(r15, r2)
            float r15 = r3.getTranslationX()
            r6 = 0
            int r15 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r15 != 0) goto L5ba
            goto L5bd
        L5ba:
            r3.setTranslationX(r6)
        L5bd:
            float r15 = r3.getTranslationY()
            int r15 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r15 != 0) goto L5c6
            goto L5c9
        L5c6:
            r3.setTranslationY(r6)
        L5c9:
            r6 = 3
            if (r22 == 0) goto L6ff
            int r15 = r4.getId()
            r5 = -1
            if (r15 != r5) goto L5da
            int r5 = android.view.View.generateViewId()
            r4.setId(r5)
        L5da:
            android.widget.RelativeLayout$LayoutParams r5 = new android.widget.RelativeLayout$LayoutParams
            r5.<init>(r9, r9)
            int r4 = r4.getId()
            r5.addRule(r6, r4)
            android.content.Context r4 = r3.getContext()
            r4.getClass()
            r9 = 1073741824(0x40000000, float:2.0)
            int r4 = l(r4, r9)
            r5.topMargin = r4
            boolean r4 = r11.f11714l
            if (r4 == 0) goto L638
            r4 = 21
            if (r7 == 0) goto L61a
            r5.addRule(r4)
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            boolean r4 = r2 instanceof android.widget.RelativeLayout.LayoutParams
            if (r4 == 0) goto L60b
            android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2
            goto L60c
        L60b:
            r2 = 0
        L60c:
            if (r2 == 0) goto L622
            int r4 = r2.getMarginEnd()
            r5.setMarginEnd(r4)
            int r2 = r2.rightMargin
            r5.rightMargin = r2
            goto L622
        L61a:
            r5.addRule(r4)
            r5.setMarginEnd(r2)
            r5.rightMargin = r2
        L622:
            int r2 = r3.getGravity()
            r4 = 8388613(0x800005, float:1.175495E-38)
            if (r2 == r4) goto L62e
            r3.setGravity(r4)
        L62e:
            int r2 = r3.getTextAlignment()
            if (r2 == r6) goto L677
            r3.setTextAlignment(r6)
            goto L677
        L638:
            r2 = 20
            if (r7 == 0) goto L659
            r5.addRule(r2)
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            boolean r4 = r2 instanceof android.widget.RelativeLayout.LayoutParams
            if (r4 == 0) goto L64a
            android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2
            goto L64b
        L64a:
            r2 = 0
        L64b:
            if (r2 == 0) goto L661
            int r4 = r2.getMarginStart()
            r5.setMarginStart(r4)
            int r2 = r2.leftMargin
            r5.leftMargin = r2
            goto L661
        L659:
            r5.addRule(r2)
            r5.setMarginStart(r10)
            r5.leftMargin = r10
        L661:
            int r2 = r3.getGravity()
            r4 = 8388611(0x800003, float:1.1754948E-38)
            if (r2 == r4) goto L66d
            r3.setGravity(r4)
        L66d:
            int r2 = r3.getTextAlignment()
            r4 = 2
            if (r2 == r4) goto L677
            r3.setTextAlignment(r4)
        L677:
            if (r7 == 0) goto L67b
            r2 = 4
            goto L67c
        L67b:
            r2 = 0
        L67c:
            int r4 = r3.getVisibility()
            if (r4 == r2) goto L685
            r3.setVisibility(r2)
        L685:
            if (r14 != 0) goto L68b
            r12.addView(r3, r5)
            goto L6e3
        L68b:
            android.view.ViewGroup$LayoutParams r2 = r3.getLayoutParams()
            boolean r4 = r2 instanceof android.widget.RelativeLayout.LayoutParams
            if (r4 == 0) goto L696
            android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2
            goto L697
        L696:
            r2 = 0
        L697:
            if (r2 == 0) goto L6e0
            int r4 = r2.width
            int r6 = r5.width
            if (r4 != r6) goto L6e0
            int r4 = r2.height
            int r6 = r5.height
            if (r4 != r6) goto L6e0
            int r4 = r2.leftMargin
            int r6 = r5.leftMargin
            if (r4 != r6) goto L6e0
            int r4 = r2.topMargin
            int r6 = r5.topMargin
            if (r4 != r6) goto L6e0
            int r4 = r2.rightMargin
            int r6 = r5.rightMargin
            if (r4 != r6) goto L6e0
            int r4 = r2.bottomMargin
            int r6 = r5.bottomMargin
            if (r4 != r6) goto L6e0
            int r4 = r2.getMarginStart()
            int r6 = r5.getMarginStart()
            if (r4 != r6) goto L6e0
            int r4 = r2.getMarginEnd()
            int r6 = r5.getMarginEnd()
            if (r4 != r6) goto L6e0
            int[] r2 = r2.getRules()
            int[] r4 = r5.getRules()
            boolean r2 = java.util.Arrays.equals(r2, r4)
            if (r2 == 0) goto L6e0
            goto L6e3
        L6e0:
            r3.setLayoutParams(r5)
        L6e3:
            if (r7 == 0) goto L6f2
            boolean r5 = r11.f11714l
            r6 = 0
            r4 = r0
            r2 = r3
            r3 = r12
            r1.z0(r2, r3, r4, r5, r6)
            r3 = r2
        L6ef:
            r19 = 1
            goto L6f8
        L6f2:
            java.util.WeakHashMap r0 = r1.f11677y
            h(r3, r0)
            goto L6ef
        L6f8:
            r0 = r14 ^ 1
            r1.r0(r3, r0)
            goto L533
        L6ff:
            android.view.ViewGroup$MarginLayoutParams r5 = new android.view.ViewGroup$MarginLayoutParams
            r5.<init>(r9, r9)
            android.content.Context r9 = r3.getContext()
            r9.getClass()
            r15 = 1073741824(0x40000000, float:2.0)
            int r9 = l(r9, r15)
            r5.topMargin = r9
            boolean r9 = r11.f11714l
            if (r9 == 0) goto L735
            if (r7 != 0) goto L71c
            r5.setMarginEnd(r2)
        L71c:
            int r2 = r3.getGravity()
            r9 = 8388613(0x800005, float:1.175495E-38)
            if (r2 == r9) goto L728
            r3.setGravity(r9)
        L728:
            int r2 = r3.getTextAlignment()
            if (r2 == r6) goto L731
            r3.setTextAlignment(r6)
        L731:
            r6 = 8388611(0x800003, float:1.1754948E-38)
            goto L753
        L735:
            r9 = 8388613(0x800005, float:1.175495E-38)
            if (r7 != 0) goto L73d
            r5.setMarginStart(r10)
        L73d:
            int r2 = r3.getGravity()
            r6 = 8388611(0x800003, float:1.1754948E-38)
            if (r2 == r6) goto L749
            r3.setGravity(r6)
        L749:
            int r2 = r3.getTextAlignment()
            r10 = 2
            if (r2 == r10) goto L753
            r3.setTextAlignment(r10)
        L753:
            boolean r2 = r12 instanceof android.widget.LinearLayout
            if (r2 == 0) goto L529
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r2.<init>(r5)
            if (r7 == 0) goto L799
            boolean r5 = r11.f11714l
            if (r5 == 0) goto L763
            r6 = r9
        L763:
            r2.gravity = r6
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            boolean r6 = r5 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r6 == 0) goto L770
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            goto L771
        L770:
            r5 = 0
        L771:
            if (r5 == 0) goto L78e
            boolean r6 = r11.f11714l
            if (r6 == 0) goto L783
            int r6 = r5.getMarginEnd()
            r2.setMarginEnd(r6)
            int r5 = r5.rightMargin
            r2.rightMargin = r5
            goto L78e
        L783:
            int r6 = r5.getMarginStart()
            r2.setMarginStart(r6)
            int r5 = r5.leftMargin
            r2.leftMargin = r5
        L78e:
            int r5 = r3.getVisibility()
            r6 = 4
            if (r5 == r6) goto L7a3
            r3.setVisibility(r6)
            goto L7a3
        L799:
            int r5 = r3.getVisibility()
            if (r5 == 0) goto L7a3
            r10 = 0
            r3.setVisibility(r10)
        L7a3:
            int r5 = r12.indexOfChild(r4)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            if (r5 < 0) goto L7ae
            goto L7af
        L7ae:
            r6 = 0
        L7af:
            if (r6 == 0) goto L7ba
            int r5 = r6.intValue()
            r19 = 1
            int r5 = r5 + 1
            goto L7c1
        L7ba:
            r5 = r12
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            int r5 = r5.getChildCount()
        L7c1:
            if (r14 != 0) goto L7c8
            r12.addView(r3, r5, r2)
            goto L84e
        L7c8:
            int r6 = r12.indexOfChild(r3)
            if (r6 == r5) goto L7f6
            r12.removeView(r3)
            int r4 = r12.indexOfChild(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            if (r4 < 0) goto L7de
            r17 = r5
            goto L7e0
        L7de:
            r17 = 0
        L7e0:
            if (r17 == 0) goto L7eb
            int r4 = r17.intValue()
            r19 = 1
            int r4 = r4 + 1
            goto L7f2
        L7eb:
            r4 = r12
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            int r4 = r4.getChildCount()
        L7f2:
            r12.addView(r3, r4, r2)
            goto L84e
        L7f6:
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            boolean r5 = r4 instanceof android.widget.LinearLayout.LayoutParams
            if (r5 == 0) goto L801
            android.widget.LinearLayout$LayoutParams r4 = (android.widget.LinearLayout.LayoutParams) r4
            goto L802
        L801:
            r4 = 0
        L802:
            if (r4 == 0) goto L84b
            int r5 = r4.width
            int r6 = r2.width
            if (r5 != r6) goto L84b
            int r5 = r4.height
            int r6 = r2.height
            if (r5 != r6) goto L84b
            int r5 = r4.leftMargin
            int r6 = r2.leftMargin
            if (r5 != r6) goto L84b
            int r5 = r4.topMargin
            int r6 = r2.topMargin
            if (r5 != r6) goto L84b
            int r5 = r4.rightMargin
            int r6 = r2.rightMargin
            if (r5 != r6) goto L84b
            int r5 = r4.bottomMargin
            int r6 = r2.bottomMargin
            if (r5 != r6) goto L84b
            int r5 = r4.getMarginStart()
            int r6 = r2.getMarginStart()
            if (r5 != r6) goto L84b
            int r5 = r4.getMarginEnd()
            int r6 = r2.getMarginEnd()
            if (r5 != r6) goto L84b
            int r5 = r4.gravity
            int r6 = r2.gravity
            if (r5 != r6) goto L84b
            float r4 = r4.weight
            float r5 = r2.weight
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L84b
            goto L84e
        L84b:
            r3.setLayoutParams(r2)
        L84e:
            if (r7 == 0) goto L85d
            boolean r5 = r11.f11714l
            r6 = 0
            r4 = r0
            r2 = r3
            r3 = r12
            r1.z0(r2, r3, r4, r5, r6)
            r3 = r2
        L85a:
            r19 = 1
            goto L863
        L85d:
            java.util.WeakHashMap r0 = r1.f11677y
            h(r3, r0)
            goto L85a
        L863:
            r0 = r14 ^ 1
            r1.r0(r3, r0)
            r15 = r19
        L86a:
            if (r15 == 0) goto L876
            r4 = r30
            r5 = r32
            r2 = r8
            r7 = r11
            r6 = r13
            r1.s0(r2, r3, r4, r5, r6, r7)
        L876:
            return r15
        L877:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L87a:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L87d:
            r12 = r4
            r22 = r6
            r6 = r10
            r5 = r16
            r25 = r20
            r0 = r21
            r19 = 1
            int r7 = r7 + 1
            r1 = r28
            r8 = r29
            r11 = r30
            r13 = r33
            r2 = r0
            r16 = r5
            r10 = r6
            r4 = r12
            r6 = r22
            r0 = r25
            r12 = r32
            r5 = r34
            goto L18e
        L8a2:
            return r18
    }

    public final boolean E0(java.lang.Object r9, java.lang.String r10) {
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L5
            goto L70
        L5:
            java.lang.Integer r1 = r8.p0()
            if (r1 == 0) goto L70
            java.lang.Class r2 = r9.getClass()
            java.util.ArrayList r2 = b0(r2)
            java.util.Iterator r2 = r2.iterator()
            r3 = r0
        L18:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L6f
            java.lang.Object r4 = r2.next()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.Class[] r5 = r4.getParameterTypes()
            int r5 = r5.length
            r6 = 2
            if (r5 != r6) goto L18
            java.lang.Class[] r5 = r4.getParameterTypes()
            r5 = r5[r0]
            java.lang.Class r6 = java.lang.Integer.TYPE
            boolean r5 = gg.l.a(r5, r6)
            if (r5 == 0) goto L18
            java.lang.Class[] r5 = r4.getParameterTypes()
            r6 = 1
            r5 = r5[r6]
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            boolean r5 = r5.isAssignableFrom(r7)
            if (r5 != 0) goto L4a
            goto L18
        L4a:
            r4.setAccessible(r6)     // Catch: java.lang.Throwable -> L57
            java.lang.Object[] r5 = new java.lang.Object[]{r1, r10}     // Catch: java.lang.Throwable -> L57
            r4.invoke(r9, r5)     // Catch: java.lang.Throwable -> L57
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L57
            goto L5e
        L57:
            r4 = move-exception
            sf.f r5 = new sf.f
            r5.<init>(r4)
            r4 = r5
        L5e:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            boolean r7 = r4 instanceof sf.f
            if (r7 == 0) goto L65
            r4 = r5
        L65:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L18
            r3 = r6
            goto L18
        L6f:
            return r3
        L70:
            return r0
    }

    public final boolean F() {
            r9 = this;
            r8.g r0 = r9.f11653a
            java.lang.ClassLoader r0 = r0.f11622c
            java.lang.String r1 = "com.tencent.mm.plugin.profile.ui.ContactInfoUI"
            java.lang.Class r0 = h.Hchat.utils.KavaReflector.loadClass(r1, r0)
            r1 = 0
            if (r0 == 0) goto L68
            java.util.Set r2 = r9.f11659g
            boolean r3 = r2.add(r0)
            java.lang.String r4 = "initView"
            java.lang.Class[] r5 = new java.lang.Class[r1]
            java.lang.reflect.Method r4 = h.Hchat.utils.KavaReflector.findMethodRecursive(r0, r4, r5)
            if (r4 == 0) goto L28
            r9.c r5 = new r9.c
            r6 = 0
            r5.<init>(r9, r6)
            boolean r4 = r9.B(r4, r5)
            goto L29
        L28:
            r4 = r1
        L29:
            java.util.ArrayList r5 = b0(r0)
            java.util.Iterator r5 = r5.iterator()
        L31:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L4b
            java.lang.Object r6 = r5.next()
            r7 = r6
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.String r7 = r7.getName()
            java.lang.String r8 = "onPreferenceTreeClick"
            boolean r7 = gg.l.a(r7, r8)
            if (r7 == 0) goto L31
            goto L4c
        L4b:
            r6 = 0
        L4c:
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r6 == 0) goto L60
            r9.c r5 = new r9.c
            r7 = 1
            r5.<init>(r9, r7)
            boolean r5 = r9.C(r6, r5)
            if (r5 != 0) goto L5e
            if (r4 == 0) goto L5f
        L5e:
            r1 = 1
        L5f:
            r4 = r1
        L60:
            if (r4 != 0) goto L67
            if (r3 == 0) goto L67
            r2.remove(r0)
        L67:
            return r4
        L68:
            return r1
    }

    public final boolean G() {
            r10 = this;
            java.lang.String r0 = r10.a0()
            r8.g r1 = r10.f11653a
            java.lang.ClassLoader r2 = r1.f11622c
            android.content.SharedPreferences r3 = r10.f11657e
            java.lang.String r4 = "chat_message_view_bind"
            java.lang.reflect.Method r2 = e8.b.c(r3, r0, r2, r4)
            ia.t r5 = r10.f11654b
            r6 = 0
            if (r2 == 0) goto L21
            boolean r7 = r10.K(r2)
            if (r7 == 0) goto L1c
            goto L1d
        L1c:
            r2 = r6
        L1d:
            if (r2 == 0) goto L21
            goto Lb8
        L21:
            org.luckypray.dexkit.DexKitBridge r1 = r1.f11623d     // Catch: java.lang.Throwable -> L61
            ch.e r2 = new ch.e     // Catch: java.lang.Throwable -> L61
            r2.<init>()     // Catch: java.lang.Throwable -> L61
            fh.k r7 = new fh.k     // Catch: java.lang.Throwable -> L61
            r7.<init>()     // Catch: java.lang.Throwable -> L61
            java.lang.String r8 = "MicroMsg.MvvmChattingItem"
            java.lang.String r9 = "[onBindView]"
            java.lang.String[] r8 = new java.lang.String[]{r8, r9}     // Catch: java.lang.Throwable -> L61
            java.util.List r8 = a.a.y0(r8)     // Catch: java.lang.Throwable -> L61
            fh.k.u0(r7, r8)     // Catch: java.lang.Throwable -> L61
            r2.f1666h = r7     // Catch: java.lang.Throwable -> L61
            hh.p r1 = r1.findMethod(r2)     // Catch: java.lang.Throwable -> L61
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L61
            r2.<init>()     // Catch: java.lang.Throwable -> L61
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L61
        L4b:
            boolean r7 = r1.hasNext()     // Catch: java.lang.Throwable -> L61
            if (r7 == 0) goto L67
            java.lang.Object r7 = r1.next()     // Catch: java.lang.Throwable -> L61
            hh.o r7 = (hh.o) r7     // Catch: java.lang.Throwable -> L61
            java.lang.reflect.Method r7 = r10.O0(r7)     // Catch: java.lang.Throwable -> L61
            if (r7 == 0) goto L4b
            r2.add(r7)     // Catch: java.lang.Throwable -> L61
            goto L4b
        L61:
            r1 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r1)
        L67:
            java.lang.Throwable r1 = sf.g.b(r2)
            if (r1 != 0) goto L6e
            goto L75
        L6e:
            java.lang.String r2 = "消息显示时间定位失败"
            r5.invoke(r2, r1)
            tf.t r2 = tf.t.f13167g
        L75:
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r1 = r2.iterator()
        L7b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L8f
            java.lang.Object r2 = r1.next()
            r7 = r2
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            boolean r7 = r10.K(r7)
            if (r7 == 0) goto L7b
            r6 = r2
        L8f:
            r2 = r6
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            if (r2 == 0) goto L98
            e8.b.h(r3, r0, r4, r2)
            goto Lb8
        L98:
            java.lang.String r1 = "cache.key"
            android.content.SharedPreferences$Editor r6 = r3.edit()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r7 = ""
            java.lang.String r3 = r3.getString(r1, r7)     // Catch: java.lang.Throwable -> Lb8
            boolean r3 = gg.l.a(r3, r0)     // Catch: java.lang.Throwable -> Lb8
            if (r3 != 0) goto Lb1
            android.content.SharedPreferences$Editor r3 = r6.clear()     // Catch: java.lang.Throwable -> Lb8
            r3.putString(r1, r0)     // Catch: java.lang.Throwable -> Lb8
        Lb1:
            android.content.SharedPreferences$Editor r0 = r6.remove(r4)     // Catch: java.lang.Throwable -> Lb8
            r0.apply()     // Catch: java.lang.Throwable -> Lb8
        Lb8:
            if (r2 == 0) goto L102
            java.util.Set r0 = r10.f11658f
            boolean r1 = r0.add(r2)
            if (r1 != 0) goto Lc4
            r0 = 1
            return r0
        Lc4:
            r8.i r1 = r8.i.f11631b     // Catch: java.lang.Throwable -> Ld3
            b9.e r3 = new b9.e     // Catch: java.lang.Throwable -> Ld3
            r4 = 24
            r3.<init>(r10, r4)     // Catch: java.lang.Throwable -> Ld3
            r1.b(r2, r3)     // Catch: java.lang.Throwable -> Ld3
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Ld3
            goto Lda
        Ld3:
            r1 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r1)
            r1 = r3
        Lda:
            java.lang.Throwable r3 = sf.g.b(r1)
            if (r3 != 0) goto Le1
            goto Lfb
        Le1:
            r0.remove(r2)
            java.lang.String r0 = r2.getName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "消息显示时间Hook安装失败: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.invoke(r0, r3)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
        Lfb:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            return r0
        L102:
            r0 = 0
            return r0
    }

    public final boolean H() {
            r19 = this;
            r1 = r19
            java.lang.String r2 = r1.a0()
            r8.g r3 = r1.f11653a
            java.lang.ClassLoader r0 = r3.f11622c
            org.luckypray.dexkit.DexKitBridge r4 = r3.f11623d
            android.content.SharedPreferences r5 = r1.f11657e
            java.lang.String r6 = "lucky_money_time_formatter"
            java.lang.reflect.Method r0 = e8.b.c(r5, r2, r0, r6)
            ia.t r7 = r1.f11654b
            r8 = 0
            if (r0 == 0) goto L25
            boolean r9 = N(r0)
            if (r9 == 0) goto L20
            goto L21
        L20:
            r0 = r8
        L21:
            if (r0 == 0) goto L25
            goto Lc2
        L25:
            ch.e r0 = new ch.e     // Catch: java.lang.Throwable -> L69
            r0.<init>()     // Catch: java.lang.Throwable -> L69
            java.lang.String r9 = "com.tencent.mm.plugin.luckymoney.model"
            java.lang.String[] r9 = new java.lang.String[]{r9}     // Catch: java.lang.Throwable -> L69
            java.util.List r9 = tf.l.L0(r9)     // Catch: java.lang.Throwable -> L69
            r0.f1665g = r9     // Catch: java.lang.Throwable -> L69
            fh.k r9 = new fh.k     // Catch: java.lang.Throwable -> L69
            r9.<init>()     // Catch: java.lang.Throwable -> L69
            java.lang.String r10 = "HH:mm"
            java.util.List r10 = a.a.x0(r10)     // Catch: java.lang.Throwable -> L69
            fh.k.u0(r9, r10)     // Catch: java.lang.Throwable -> L69
            r0.f1666h = r9     // Catch: java.lang.Throwable -> L69
            hh.p r0 = r4.findMethod(r0)     // Catch: java.lang.Throwable -> L69
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L69
            r9.<init>()     // Catch: java.lang.Throwable -> L69
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L69
        L53:
            boolean r10 = r0.hasNext()     // Catch: java.lang.Throwable -> L69
            if (r10 == 0) goto L6b
            java.lang.Object r10 = r0.next()     // Catch: java.lang.Throwable -> L69
            hh.o r10 = (hh.o) r10     // Catch: java.lang.Throwable -> L69
            java.lang.reflect.Method r10 = r1.O0(r10)     // Catch: java.lang.Throwable -> L69
            if (r10 == 0) goto L53
            r9.add(r10)     // Catch: java.lang.Throwable -> L69
            goto L53
        L69:
            r0 = move-exception
            goto L87
        L6b:
            java.util.Iterator r0 = r9.iterator()     // Catch: java.lang.Throwable -> L69
        L6f:
            boolean r9 = r0.hasNext()     // Catch: java.lang.Throwable -> L69
            if (r9 == 0) goto L83
            java.lang.Object r9 = r0.next()     // Catch: java.lang.Throwable -> L69
            r10 = r9
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10     // Catch: java.lang.Throwable -> L69
            boolean r10 = N(r10)     // Catch: java.lang.Throwable -> L69
            if (r10 == 0) goto L6f
            goto L84
        L83:
            r9 = r8
        L84:
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9     // Catch: java.lang.Throwable -> L69
            goto L8c
        L87:
            sf.f r9 = new sf.f
            r9.<init>(r0)
        L8c:
            java.lang.Throwable r0 = sf.g.b(r9)
            if (r0 != 0) goto L93
            goto L99
        L93:
            java.lang.String r9 = "红包详情时间格式化定位失败"
            r7.invoke(r9, r0)
            r9 = r8
        L99:
            r0 = r9
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 == 0) goto La2
            e8.b.h(r5, r2, r6, r0)
            goto Lc2
        La2:
            java.lang.String r9 = "cache.key"
            android.content.SharedPreferences$Editor r10 = r5.edit()     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r11 = ""
            java.lang.String r5 = r5.getString(r9, r11)     // Catch: java.lang.Throwable -> Lc2
            boolean r5 = gg.l.a(r5, r2)     // Catch: java.lang.Throwable -> Lc2
            if (r5 != 0) goto Lbb
            android.content.SharedPreferences$Editor r5 = r10.clear()     // Catch: java.lang.Throwable -> Lc2
            r5.putString(r9, r2)     // Catch: java.lang.Throwable -> Lc2
        Lbb:
            android.content.SharedPreferences$Editor r2 = r10.remove(r6)     // Catch: java.lang.Throwable -> Lc2
            r2.apply()     // Catch: java.lang.Throwable -> Lc2
        Lc2:
            r2 = 0
            if (r0 == 0) goto Ld0
            r9.c r5 = new r9.c
            r6 = 4
            r5.<init>(r1, r6)
            boolean r0 = r1.B(r0, r5)
            goto Ld1
        Ld0:
            r0 = r2
        Ld1:
            java.lang.String r5 = "MicroMsg.LuckyMoneyDetailUI"
            java.lang.String r6 = "try get user contact: %s"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6}
            java.util.List r5 = a.a.y0(r5)
            java.lang.String r6 = "lucky_money_detail_bind_direct"
            java.lang.reflect.Method r5 = S(r1, r6, r5)
            r6 = 1
            if (r5 == 0) goto Lf8
            r9.c r9 = new r9.c
            r10 = 5
            r9.<init>(r1, r10)
            boolean r5 = r1.B(r5, r9)
            if (r5 != 0) goto Lf7
            if (r0 == 0) goto Lf5
            goto Lf7
        Lf5:
            r0 = r2
            goto Lf8
        Lf7:
            r0 = r6
        Lf8:
            r5 = r0
            java.lang.String r0 = "MicroMsg.NetSceneOpenLuckyMoney"
            java.lang.String r9 = "/cgi-bin/mmpay-bin/openwxhb"
            java.lang.String[] r0 = new java.lang.String[]{r0, r9}
            java.util.List r0 = a.a.y0(r0)
            java.lang.String r9 = "MicroMsg.NetSceneLuckyMoneyDetail"
            java.lang.String r10 = "/cgi-bin/mmpay-bin/qrydetailwxhb"
            java.lang.String[] r9 = new java.lang.String[]{r9, r10}
            java.util.List r9 = a.a.y0(r9)
            r10 = 2
            java.util.List[] r11 = new java.util.List[r10]
            r11[r2] = r0
            r11[r6] = r9
            java.util.List r0 = a.a.y0(r11)
            java.lang.String r9 = r1.a0()
            android.content.Context r11 = r3.f11620a
            java.lang.ClassLoader r3 = r3.f11622c
            java.lang.String r12 = "Hchat_extra_class_cache"
            android.content.SharedPreferences r11 = ub.b.c(r11, r12)
            java.util.LinkedHashSet r12 = new java.util.LinkedHashSet
            r12.<init>()
            java.util.Iterator r13 = r0.iterator()
            r0 = r2
        L134:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L201
            java.lang.Object r14 = r13.next()
            int r15 = r0 + 1
            if (r0 < 0) goto L1fd
            java.util.List r14 = (java.util.List) r14
            r16 = r2
            java.lang.String r2 = "lucky_money_scene_classes_"
            java.lang.String r2 = eh.a.l(r0, r2)
            r17 = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r9)
            r18 = r10
            java.lang.String r10 = "_"
            r6.append(r10)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r11.getString(r6, r8)
            if (r6 == 0) goto L173
            java.lang.Class r6 = h.Hchat.utils.KavaReflector.loadClass(r6, r3)
            if (r6 == 0) goto L173
            r12.add(r6)
        L173:
            int r6 = r12.size()
            if (r6 <= r0) goto L17b
            goto L1f4
        L17b:
            ch.c r0 = new ch.c     // Catch: java.lang.Throwable -> L1a1
            r0.<init>()     // Catch: java.lang.Throwable -> L1a1
            fh.a r6 = new fh.a     // Catch: java.lang.Throwable -> L1a1
            r6.<init>()     // Catch: java.lang.Throwable -> L1a1
            fh.a.r0(r6, r14)     // Catch: java.lang.Throwable -> L1a1
            r0.f1664h = r6     // Catch: java.lang.Throwable -> L1a1
            hh.j r0 = r4.findClass(r0)     // Catch: java.lang.Throwable -> L1a1
            java.lang.Object r0 = r0.a()     // Catch: java.lang.Throwable -> L1a1
            hh.i r0 = (hh.i) r0     // Catch: java.lang.Throwable -> L1a1
            if (r0 == 0) goto L1a3
            lh.a r0 = r0.p()     // Catch: java.lang.Throwable -> L1a1
            java.lang.String r0 = r0.f8057g     // Catch: java.lang.Throwable -> L1a1
            java.lang.Class r0 = h.Hchat.utils.KavaReflector.loadClass(r0, r3)     // Catch: java.lang.Throwable -> L1a1
            goto L1ab
        L1a1:
            r0 = move-exception
            goto L1a5
        L1a3:
            r0 = r8
            goto L1ab
        L1a5:
            sf.f r6 = new sf.f
            r6.<init>(r0)
            r0 = r6
        L1ab:
            java.lang.Throwable r6 = sf.g.b(r0)
            if (r6 != 0) goto L1b2
            goto L1bc
        L1b2:
            java.lang.String r0 = "DexKit定位类失败: "
            java.lang.String r0 = r0.concat(r2)
            r7.invoke(r0, r6)
            r0 = r8
        L1bc:
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto L1d7
            r12.add(r0)
            android.content.SharedPreferences$Editor r6 = r11.edit()
            java.lang.String r2 = wb.en.h(r9, r10, r2)
            java.lang.String r0 = r0.getName()
            android.content.SharedPreferences$Editor r0 = r6.putString(r2, r0)
            r0.apply()
            goto L1f4
        L1d7:
            android.content.SharedPreferences$Editor r0 = r11.edit()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r9)
            r6.append(r10)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            android.content.SharedPreferences$Editor r0 = r0.remove(r2)
            r0.apply()
        L1f4:
            r0 = r15
            r2 = r16
            r6 = r17
            r10 = r18
            goto L134
        L1fd:
            a.a.Q0()
            throw r8
        L201:
            r16 = r2
            r17 = r6
            r18 = r10
            java.util.List r0 = tf.m.P1(r12)
            java.util.Iterator r0 = r0.iterator()
        L20f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L292
            java.lang.Object r2 = r0.next()
            java.lang.Class r2 = (java.lang.Class) r2
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredMethods(r2)
            java.util.Iterator r2 = r2.iterator()
        L223:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L276
            java.lang.Object r3 = r2.next()
            r4 = r3
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.String r6 = r4.getName()
            java.lang.String r7 = "onGYNetEnd"
            boolean r6 = gg.l.a(r6, r7)
            if (r6 == 0) goto L271
            java.lang.Class[] r6 = r4.getParameterTypes()
            int r6 = r6.length
            r7 = 3
            if (r6 != r7) goto L271
            java.lang.Class[] r6 = r4.getParameterTypes()
            r6 = r6[r16]
            java.lang.Class r7 = java.lang.Integer.TYPE
            boolean r6 = gg.l.a(r6, r7)
            if (r6 == 0) goto L271
            java.lang.Class[] r6 = r4.getParameterTypes()
            r6 = r6[r17]
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            boolean r6 = gg.l.a(r6, r7)
            if (r6 == 0) goto L271
            java.lang.Class[] r4 = r4.getParameterTypes()
            r4 = r4[r18]
            java.lang.Class<org.json.JSONObject> r6 = org.json.JSONObject.class
            boolean r4 = r6.isAssignableFrom(r4)
            if (r4 == 0) goto L271
            r4 = r17
            goto L273
        L271:
            r4 = r16
        L273:
            if (r4 == 0) goto L223
            goto L277
        L276:
            r3 = r8
        L277:
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L20f
            r9.c r2 = new r9.c
            r4 = 6
            r2.<init>(r1, r4)
            boolean r2 = r1.C(r3, r2)
            if (r2 != 0) goto L28d
            if (r5 == 0) goto L28a
            goto L28d
        L28a:
            r2 = r16
            goto L28f
        L28d:
            r2 = r17
        L28f:
            r5 = r2
            goto L20f
        L292:
            return r5
    }

    public final boolean I() {
            r12 = this;
            java.lang.String r0 = "MicroMsg.WebViewHighRiskAdH5Interceptor"
            java.lang.String r1 = "isInterceptEnabled, expt="
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = a.a.y0(r0)
            java.lang.String r1 = "web_risk_intercept_enabled"
            java.lang.reflect.Method r0 = S(r12, r1, r0)
            r1 = 0
            if (r0 == 0) goto L13a
            r9.c r2 = new r9.c
            r3 = 2
            r2.<init>(r12, r3)
            boolean r2 = r12.C(r0, r2)
            java.lang.Class r0 = r0.getDeclaringClass()
            r0.getClass()
            java.lang.String r3 = "http"
            java.lang.String r4 = "https"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}
            java.util.List r3 = a.a.y0(r3)
            java.lang.String r4 = r12.a0()
            r8.g r5 = r12.f11653a
            java.lang.ClassLoader r6 = r5.f11622c
            android.content.SharedPreferences r7 = r12.f11657e
            java.lang.String r8 = "web_risk_url_safe"
            java.util.List r6 = e8.b.f(r7, r4, r6, r8)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r6 = r6.iterator()
        L4b:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L66
            java.lang.Object r10 = r6.next()
            r11 = r10
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            java.lang.Class r11 = r11.getDeclaringClass()
            boolean r11 = gg.l.a(r11, r0)
            if (r11 == 0) goto L4b
            r9.add(r10)
            goto L4b
        L66:
            boolean r6 = r9.isEmpty()
            if (r6 != 0) goto L6e
            goto Lf3
        L6e:
            org.luckypray.dexkit.DexKitBridge r5 = r5.f11623d     // Catch: java.lang.Throwable -> Laa
            ch.e r6 = new ch.e     // Catch: java.lang.Throwable -> Laa
            r6.<init>()     // Catch: java.lang.Throwable -> Laa
            fh.k r9 = new fh.k     // Catch: java.lang.Throwable -> Laa
            r9.<init>()     // Catch: java.lang.Throwable -> Laa
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> Laa
            r10 = 5
            r9.l0(r10, r0)     // Catch: java.lang.Throwable -> Laa
            fh.k.u0(r9, r3)     // Catch: java.lang.Throwable -> Laa
            r6.f1666h = r9     // Catch: java.lang.Throwable -> Laa
            hh.p r0 = r5.findMethod(r6)     // Catch: java.lang.Throwable -> Laa
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Laa
            r3.<init>()     // Catch: java.lang.Throwable -> Laa
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Laa
        L94:
            boolean r5 = r0.hasNext()     // Catch: java.lang.Throwable -> Laa
            if (r5 == 0) goto Lb0
            java.lang.Object r5 = r0.next()     // Catch: java.lang.Throwable -> Laa
            hh.o r5 = (hh.o) r5     // Catch: java.lang.Throwable -> Laa
            java.lang.reflect.Method r5 = r12.O0(r5)     // Catch: java.lang.Throwable -> Laa
            if (r5 == 0) goto L94
            r3.add(r5)     // Catch: java.lang.Throwable -> Laa
            goto L94
        Laa:
            r0 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r0)
        Lb0:
            java.lang.Throwable r0 = sf.g.b(r3)
            if (r0 != 0) goto Lb7
            goto Lc4
        Lb7:
            java.lang.String r3 = "DexKit定位失败: "
            java.lang.String r3 = r3.concat(r8)
            ia.t r5 = r12.f11654b
            r5.invoke(r3, r0)
            tf.t r3 = tf.t.f13167g
        Lc4:
            r9 = r3
            java.util.List r9 = (java.util.List) r9
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto Ld3
            e8.b r0 = e8.b.f2358a
            r0.j(r7, r4, r8, r9)
            goto Lf3
        Ld3:
            java.lang.String r0 = "cache.key"
            android.content.SharedPreferences$Editor r3 = r7.edit()     // Catch: java.lang.Throwable -> Lf3
            java.lang.String r5 = ""
            java.lang.String r5 = r7.getString(r0, r5)     // Catch: java.lang.Throwable -> Lf3
            boolean r5 = gg.l.a(r5, r4)     // Catch: java.lang.Throwable -> Lf3
            if (r5 != 0) goto Lec
            android.content.SharedPreferences$Editor r5 = r3.clear()     // Catch: java.lang.Throwable -> Lf3
            r5.putString(r0, r4)     // Catch: java.lang.Throwable -> Lf3
        Lec:
            android.content.SharedPreferences$Editor r0 = r3.remove(r8)     // Catch: java.lang.Throwable -> Lf3
            r0.apply()     // Catch: java.lang.Throwable -> Lf3
        Lf3:
            java.util.Iterator r0 = r9.iterator()
        Lf7:
            boolean r3 = r0.hasNext()
            r4 = 1
            if (r3 == 0) goto L124
            java.lang.Object r3 = r0.next()
            r5 = r3
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            java.lang.Class r6 = r5.getReturnType()
            java.lang.Class r7 = java.lang.Boolean.TYPE
            boolean r6 = gg.l.a(r6, r7)
            if (r6 != 0) goto L120
            java.lang.Class r5 = r5.getReturnType()
            java.lang.Class<java.lang.Boolean> r6 = java.lang.Boolean.class
            boolean r5 = gg.l.a(r5, r6)
            if (r5 == 0) goto L11e
            goto L120
        L11e:
            r5 = r1
            goto L121
        L120:
            r5 = r4
        L121:
            if (r5 == 0) goto Lf7
            goto L125
        L124:
            r3 = 0
        L125:
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L139
            r9.c r0 = new r9.c
            r5 = 3
            r0.<init>(r12, r5)
            boolean r0 = r12.C(r3, r0)
            if (r0 != 0) goto L137
            if (r2 == 0) goto L138
        L137:
            r1 = r4
        L138:
            return r1
        L139:
            return r2
        L13a:
            return r1
    }

    public final boolean J(java.lang.Object r4) {
            r3 = this;
            java.lang.Class r4 = r4.getClass()
            java.util.concurrent.ConcurrentHashMap r0 = r3.f11670r
            java.lang.Object r1 = r0.get(r4)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L13
            boolean r4 = r1.booleanValue()
            return r4
        L13:
            java.lang.String r1 = "field_msgId"
            java.lang.reflect.Field r1 = h.Hchat.utils.KavaReflector.findFieldRecursive(r4, r1)
            if (r1 == 0) goto L35
            java.lang.String r1 = "field_msgSvrId"
            java.lang.reflect.Field r1 = h.Hchat.utils.KavaReflector.findFieldRecursive(r4, r1)
            if (r1 == 0) goto L35
            java.lang.String r1 = "field_type"
            java.lang.reflect.Field r1 = h.Hchat.utils.KavaReflector.findFieldRecursive(r4, r1)
            if (r1 == 0) goto L35
            java.lang.String r1 = "field_content"
            java.lang.reflect.Field r1 = h.Hchat.utils.KavaReflector.findFieldRecursive(r4, r1)
            if (r1 == 0) goto L35
            r1 = 1
            goto L36
        L35:
            r1 = 0
        L36:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            r0.putIfAbsent(r4, r2)
            return r1
    }

    public final boolean K(java.lang.reflect.Method r9) {
            r8 = this;
            java.lang.Class[] r9 = r9.getParameterTypes()
            int r0 = r9.length
            r1 = 3
            r2 = 0
            if (r0 < r1) goto L8a
            int r0 = r9.length
            r1 = r2
        Lb:
            if (r1 >= r0) goto L8a
            r3 = r9[r1]
            java.lang.Class r4 = java.lang.Integer.TYPE
            boolean r4 = gg.l.a(r3, r4)
            r5 = 1
            if (r4 != 0) goto L23
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto L21
            goto L23
        L21:
            r3 = r2
            goto L24
        L23:
            r3 = r5
        L24:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L87
            int r0 = r9.length
            r1 = r2
        L30:
            if (r1 >= r0) goto L8a
            r3 = r9[r1]
            if (r3 != 0) goto L38
        L36:
            r3 = r2
            goto L79
        L38:
            java.lang.reflect.Field r4 = r8.t(r3)
            if (r4 == 0) goto L40
        L3e:
            r3 = r5
            goto L79
        L40:
            if (r3 == 0) goto L36
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L36
            java.util.List r4 = h.Hchat.utils.KavaReflector.declaredFields(r3)
            if (r4 == 0) goto L57
            boolean r6 = r4.isEmpty()
            if (r6 == 0) goto L57
            goto L74
        L57:
            java.util.Iterator r4 = r4.iterator()
        L5b:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L74
            java.lang.Object r6 = r4.next()
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            java.lang.Class r6 = r6.getType()
            java.lang.Class<android.view.View> r7 = android.view.View.class
            boolean r6 = gg.l.a(r6, r7)
            if (r6 == 0) goto L5b
            goto L3e
        L74:
            java.lang.Class r3 = r3.getSuperclass()
            goto L40
        L79:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L84
            return r5
        L84:
            int r1 = r1 + 1
            goto L30
        L87:
            int r1 = r1 + 1
            goto Lb
        L8a:
            return r2
    }

    public final java.lang.reflect.Method O0(hh.o r2) {
            r1 = this;
            r8.g r0 = r1.f11653a     // Catch: java.lang.Throwable -> L9
            java.lang.ClassLoader r0 = r0.f11622c     // Catch: java.lang.Throwable -> L9
            java.lang.reflect.Method r2 = r2.r(r0)     // Catch: java.lang.Throwable -> L9
            goto L10
        L9:
            r2 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r2)
            r2 = r0
        L10:
            boolean r0 = r2 instanceof sf.f
            if (r0 == 0) goto L16
            r2 = 0
        L16:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            return r2
    }

    public final void T(java.lang.String r9, java.lang.Object r10, android.view.View r11) {
            r8 = this;
            r9.z r0 = r8.B
            java.lang.String r0 = r0.f11816b
            java.lang.Class r1 = r10.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "|"
            java.lang.String r1 = bc.e.v(r9, r2, r1, r2, r0)
            java.util.concurrent.ConcurrentHashMap$KeySetView r2 = r8.f11672t
            boolean r1 = r2.add(r1)
            if (r1 != 0) goto L1b
            return
        L1b:
            java.util.concurrent.ConcurrentHashMap r1 = r8.f11663k
            android.widget.TextView r1 = p(r10, r1)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L27
            r1 = r3
            goto L28
        L27:
            r1 = r2
        L28:
            android.view.View r4 = r8.o(r10)
            if (r4 != 0) goto L3e
            android.view.View r4 = n(r11, r3)
            if (r4 == 0) goto L35
            goto L39
        L35:
            android.view.View r4 = n(r11, r2)
        L39:
            if (r4 == 0) goto L3c
            goto L3e
        L3c:
            r4 = r2
            goto L3f
        L3e:
            r4 = r3
        L3f:
            java.util.concurrent.ConcurrentHashMap r5 = r8.f11665m
            android.view.View r5 = q(r10, r5)
            if (r5 == 0) goto L48
            r2 = r3
        L48:
            ia.t r3 = r8.f11654b
            java.lang.Class r10 = r10.getClass()
            java.lang.String r10 = r10.getName()
            java.lang.Class r11 = r11.getClass()
            java.lang.String r11 = r11.getName()
            java.lang.String r5 = " holder="
            java.lang.String r6 = " root="
            java.lang.String r7 = "消息详情绑定失败 reason="
            java.lang.StringBuilder r9 = bc.e.p(r7, r9, r5, r10, r6)
            java.lang.String r10 = " position="
            java.lang.String r5 = " time="
            j8.b.t(r9, r11, r10, r0, r5)
            java.lang.String r10 = " avatar="
            java.lang.String r11 = " clickArea="
            p.a.x(r9, r1, r10, r4, r11)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            r10 = 0
            r3.invoke(r9, r10)
            return
    }

    public final java.lang.Object V(java.lang.Object[] r8) {
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L42
            r1 = 0
            java.lang.Object r2 = tf.l.C0(r1, r8)
            r3 = 1
            if (r2 == 0) goto L23
            android.view.View r4 = r7.u(r2)
            if (r4 == 0) goto L13
            r4 = r3
            goto L14
        L13:
            r4 = r1
        L14:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L1f
            goto L20
        L1f:
            r2 = r0
        L20:
            if (r2 == 0) goto L23
            return r2
        L23:
            int r2 = r8.length
            r4 = r1
        L25:
            if (r4 >= r2) goto L42
            r5 = r8[r4]
            if (r5 == 0) goto L33
            android.view.View r6 = r7.u(r5)
            if (r6 == 0) goto L33
            r6 = r3
            goto L34
        L33:
            r6 = r1
        L34:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L3f
            return r5
        L3f:
            int r4 = r4 + 1
            goto L25
        L42:
            return r0
    }

    public final android.view.View W(java.lang.Object r12, android.view.ViewGroup r13, android.widget.TextView r14) {
            r11 = this;
            android.view.View r2 = r11.u(r12)
            java.util.concurrent.ConcurrentHashMap r0 = r11.f11665m
            android.view.View r3 = q(r12, r0)
            java.lang.Class r0 = r12.getClass()
            java.util.concurrent.ConcurrentHashMap r1 = r11.f11668p
            java.lang.Object r4 = r1.get(r0)
            r6 = 1
            r7 = 0
            if (r4 != 0) goto Ldf
            java.lang.Class r4 = r12.getClass()
            java.util.ArrayList r4 = m(r4)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L29:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L46
            java.lang.Object r8 = r4.next()
            r9 = r8
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            java.lang.Class<android.view.View> r10 = android.view.View.class
            java.lang.Class r9 = r9.getType()
            boolean r9 = r10.isAssignableFrom(r9)
            if (r9 == 0) goto L29
            r5.add(r8)
            goto L29
        L46:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r5.iterator()
        L4f:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto Ld7
            java.lang.Object r8 = r5.next()
            r9 = r8
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            java.lang.String r9 = r9.getName()
            r9.getClass()
            java.util.Locale r10 = java.util.Locale.ROOT
            java.lang.String r9 = r9.toLowerCase(r10)
            r9.getClass()
            java.lang.String r10 = "timetv"
            boolean r10 = r9.equals(r10)
            if (r10 != 0) goto Lcf
            java.lang.String r10 = "avatariv"
            boolean r10 = r9.equals(r10)
            if (r10 != 0) goto Lcf
            java.lang.String r10 = "usertv"
            boolean r10 = r9.equals(r10)
            if (r10 != 0) goto Lcf
            java.lang.String r10 = "clickarea"
            boolean r10 = r9.equals(r10)
            if (r10 != 0) goto Lcf
            java.lang.String r10 = "time"
            boolean r10 = og.m.h0(r9, r10, r7)
            if (r10 != 0) goto Lcf
            java.lang.String r10 = "avatar"
            boolean r10 = og.m.h0(r9, r10, r7)
            if (r10 != 0) goto Lcf
            java.lang.String r10 = "click"
            boolean r10 = og.m.h0(r9, r10, r7)
            if (r10 != 0) goto Lcf
            java.lang.String r10 = "history"
            boolean r10 = og.m.h0(r9, r10, r7)
            if (r10 != 0) goto Lcf
            java.lang.String r10 = "nomore"
            boolean r10 = og.m.h0(r9, r10, r7)
            if (r10 != 0) goto Lcf
            java.lang.String r10 = "mask"
            boolean r10 = og.m.h0(r9, r10, r7)
            if (r10 != 0) goto Lcf
            java.lang.String r10 = "checkbox"
            boolean r10 = og.m.h0(r9, r10, r7)
            if (r10 != 0) goto Lcf
            java.lang.String r10 = "check"
            boolean r9 = og.m.h0(r9, r10, r7)
            if (r9 == 0) goto Lcd
            goto Lcf
        Lcd:
            r9 = r7
            goto Ld0
        Lcf:
            r9 = r6
        Ld0:
            if (r9 != 0) goto L4f
            r4.add(r8)
            goto L4f
        Ld7:
            java.lang.Object r0 = r1.putIfAbsent(r0, r4)
            if (r0 != 0) goto Lde
            goto Ldf
        Lde:
            r4 = r0
        Ldf:
            java.util.List r4 = (java.util.List) r4
            dg.n r0 = new dg.n
            r1 = 6
            r0.<init>(r4, r1)
            c9.k1 r1 = new c9.k1
            r4 = 23
            r1.<init>(r12, r4)
            ng.i r12 = ng.m.X(r0, r1)
            ng.c r12 = ng.m.S(r12)
            c9.k r0 = new c9.k
            r4 = r11
            r5 = r13
            r1 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            ng.i r13 = new ng.i
            r13.<init>(r12, r6, r0)
            ng.h r12 = new ng.h
            r12.<init>(r13)
            boolean r13 = r12.hasNext()
            r14 = 0
            if (r13 != 0) goto L111
            r13 = r14
            goto L144
        L111:
            java.lang.Object r13 = r12.next()
            boolean r0 = r12.hasNext()
            if (r0 != 0) goto L11c
            goto L144
        L11c:
            r0 = r13
            android.view.View r0 = (android.view.View) r0
            int r0 = P0(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L127:
            java.lang.Object r1 = r12.next()
            r2 = r1
            android.view.View r2 = (android.view.View) r2
            int r2 = P0(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r0.compareTo(r2)
            if (r3 >= 0) goto L13e
            r13 = r1
            r0 = r2
        L13e:
            boolean r1 = r12.hasNext()
            if (r1 != 0) goto L127
        L144:
            android.view.View r13 = (android.view.View) r13
            if (r13 == 0) goto L153
            int r12 = P0(r13)
            if (r12 <= 0) goto L14f
            goto L150
        L14f:
            r6 = r7
        L150:
            if (r6 == 0) goto L153
            return r13
        L153:
            return r14
    }

    public final r9.f0 X(java.lang.Object r26, java.lang.Integer r27, boolean r28) {
            r25 = this;
            r1 = r25
            r2 = r26
            r9.z r0 = r1.B
            java.util.Set r3 = r0.f11818d
            r4 = 1
            r5 = 0
            if (r28 != 0) goto L4e
            r0 = r3
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r6 = r0 instanceof java.util.Collection
            if (r6 == 0) goto L1d
            r6 = r0
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L1d
            goto L4c
        L1d:
            java.util.Iterator r0 = r0.iterator()
        L21:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L4c
            java.lang.Object r6 = r0.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = "atUserList"
            boolean r7 = gg.l.a(r6, r7)
            if (r7 != 0) goto L48
            java.lang.String r7 = "rawAtUserList"
            boolean r7 = gg.l.a(r6, r7)
            if (r7 != 0) goto L48
            java.lang.String r7 = "mentionedUsers"
            boolean r6 = gg.l.a(r6, r7)
            if (r6 == 0) goto L46
            goto L48
        L46:
            r6 = r5
            goto L49
        L48:
            r6 = r4
        L49:
            if (r6 == 0) goto L21
            goto L4e
        L4c:
            r6 = r5
            goto L4f
        L4e:
            r6 = r4
        L4f:
            if (r28 != 0) goto L56
            if (r6 == 0) goto L54
            goto L56
        L54:
            r7 = r5
            goto L57
        L56:
            r7 = r4
        L57:
            java.lang.String r8 = ""
            if (r7 == 0) goto L67
            java.lang.String r0 = "field_content"
            java.lang.String r9 = "content"
            java.lang.String r10 = "getContent"
            java.lang.String r0 = r1.n0(r2, r10, r0, r9)
            r9 = r0
            goto L68
        L67:
            r9 = r8
        L68:
            if (r28 == 0) goto L76
            java.lang.String r0 = "field_talker"
            java.lang.String r10 = "talker"
            java.lang.String r11 = "getTalker"
            java.lang.String r0 = r1.n0(r2, r11, r0, r10)
            r15 = r0
            goto L77
        L76:
            r15 = r8
        L77:
            if (r6 == 0) goto L128
            java.lang.String r0 = "field_msgSource"
            java.lang.String r11 = "msgSource"
            java.lang.String r12 = "getMsgSource"
            java.lang.String r0 = r1.n0(r2, r12, r0, r11)
            boolean r11 = og.m.t0(r0)
            if (r11 == 0) goto L125
            java.lang.String r0 = "field_lvbuffer"
            java.lang.String r11 = "lvbuffer"
            java.lang.String r12 = "getLvBuffer"
            java.lang.Object r0 = r1.o0(r2, r12, r0, r11)
            boolean r11 = r0 instanceof byte[]
            if (r11 == 0) goto L9a
            byte[] r0 = (byte[]) r0
            goto L9b
        L9a:
            r0 = 0
        L9b:
            if (r0 == 0) goto L124
            int r11 = r0.length
            r12 = 9
            if (r11 < r12) goto L124
            int r11 = r0.length
            java.lang.String r12 = "Array is empty."
            if (r11 == 0) goto L120
            r11 = r0[r5]
            r13 = 123(0x7b, float:1.72E-43)
            if (r11 != r13) goto L124
            int r11 = r0.length
            if (r11 == 0) goto L11b
            int r11 = r0.length
            int r11 = r11 - r4
            r11 = r0[r11]
            r12 = 125(0x7d, float:1.75E-43)
            if (r11 == r12) goto Lba
            goto L124
        Lba:
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)     // Catch: java.lang.Throwable -> L10b
            r0.position(r4)     // Catch: java.lang.Throwable -> L10b
            java.lang.Integer r11 = l0(r0)     // Catch: java.lang.Throwable -> L10b
            if (r11 == 0) goto Ld1
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L10b
            int r12 = r0.remaining()     // Catch: java.lang.Throwable -> L10b
            if (r12 >= r11) goto Ld3
        Ld1:
            r0 = r8
            goto L112
        Ld3:
            int r12 = r0.position()     // Catch: java.lang.Throwable -> L10b
            int r12 = r12 + r11
            r0.position(r12)     // Catch: java.lang.Throwable -> L10b
            int r11 = r0.remaining()     // Catch: java.lang.Throwable -> L10b
            r12 = 4
            if (r11 >= r12) goto Le3
            goto Ld1
        Le3:
            int r11 = r0.position()     // Catch: java.lang.Throwable -> L10b
            int r11 = r11 + r12
            r0.position(r11)     // Catch: java.lang.Throwable -> L10b
            java.lang.Integer r11 = l0(r0)     // Catch: java.lang.Throwable -> L10b
            if (r11 == 0) goto Ld1
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L10b
            if (r11 == 0) goto Ld1
            int r12 = r0.remaining()     // Catch: java.lang.Throwable -> L10b
            if (r12 >= r11) goto Lfe
            goto Ld1
        Lfe:
            byte[] r11 = new byte[r11]     // Catch: java.lang.Throwable -> L10b
            r0.get(r11)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L10b
            java.nio.charset.Charset r12 = og.a.f9804a     // Catch: java.lang.Throwable -> L10b
            r0.<init>(r11, r12)     // Catch: java.lang.Throwable -> L10b
            goto L112
        L10b:
            r0 = move-exception
            sf.f r11 = new sf.f
            r11.<init>(r0)
            r0 = r11
        L112:
            boolean r11 = r0 instanceof sf.f
            if (r11 == 0) goto L118
            r0 = r8
        L118:
            java.lang.String r0 = (java.lang.String) r0
            goto L125
        L11b:
            j8.o.l(r12)
        L11e:
            r0 = 0
            return r0
        L120:
            j8.o.l(r12)
            goto L11e
        L124:
            r0 = r8
        L125:
            r19 = r0
            goto L12a
        L128:
            r19 = r8
        L12a:
            if (r7 == 0) goto L133
            java.lang.String r0 = L0(r9)
            r18 = r0
            goto L135
        L133:
            r18 = r8
        L135:
            java.lang.String r0 = "msgSvrId"
            r11 = 0
            if (r28 != 0) goto L144
            boolean r7 = r3.contains(r0)
            if (r7 == 0) goto L142
            goto L144
        L142:
            r13 = r11
            goto L156
        L144:
            java.lang.String r7 = "getMsgSvrId"
            java.lang.String r13 = "field_msgSvrId"
            java.lang.Object r0 = r1.o0(r2, r7, r13, r0)
            java.lang.Long r0 = i0(r0)
            if (r0 == 0) goto L142
            long r13 = r0.longValue()
        L156:
            java.lang.String r0 = "msgId"
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L163
            long r16 = r25.Y(r26)
            goto L165
        L163:
            r16 = r11
        L165:
            java.lang.String r0 = "time"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L179
            java.lang.String r0 = "relativeTime"
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L176
            goto L179
        L176:
            r22 = r11
            goto L18e
        L179:
            java.lang.String r0 = "field_createTime"
            java.lang.String r3 = "createTime"
            java.lang.String r7 = "getCreateTime"
            java.lang.Object r0 = r1.o0(r2, r7, r0, r3)
            java.lang.Long r0 = i0(r0)
            if (r0 == 0) goto L176
            long r11 = r0.longValue()
            goto L176
        L18e:
            r9.f0 r0 = new r9.f0
            r3 = 2
            if (r27 == 0) goto L199
            int r7 = r27.intValue()
        L197:
            r10 = r7
            goto L1cb
        L199:
            java.lang.String r7 = "getType"
            java.lang.String r11 = "field_type"
            java.lang.String r12 = "type"
            java.lang.Object r7 = r1.o0(r2, r7, r11, r12)
            java.lang.Integer r7 = h0(r7)
            if (r7 == 0) goto L1ae
            int r7 = r7.intValue()
            goto L197
        L1ae:
            java.lang.String[] r7 = new java.lang.String[]{r11, r12}
            r11 = r5
        L1b3:
            if (r11 >= r3) goto L1c9
            r12 = r7[r11]
            java.lang.Object r12 = h.Hchat.utils.KavaReflector.readField(r2, r12)
            boolean r10 = r12 instanceof java.lang.Number
            if (r10 == 0) goto L1c6
            java.lang.Number r12 = (java.lang.Number) r12
            int r7 = r12.intValue()
            goto L197
        L1c6:
            int r11 = r11 + 1
            goto L1b3
        L1c9:
            r7 = r5
            goto L197
        L1cb:
            java.lang.String r7 = "@chatroom"
            boolean r7 = og.t.W(r15, r7, r5)
            if (r7 == 0) goto L1e1
            java.lang.String r7 = ":\n"
            r11 = 6
            int r7 = og.m.r0(r9, r7, r5, r5, r11)
            if (r7 <= 0) goto L1e1
            java.lang.String r7 = r9.substring(r5, r7)
            goto L1e2
        L1e1:
            r7 = r15
        L1e2:
            if (r6 == 0) goto L26b
            boolean r6 = og.m.t0(r19)
            if (r6 == 0) goto L1ec
            r6 = r9
            goto L1ee
        L1ec:
            r6 = r19
        L1ee:
            og.k r11 = r9.d0.H
            og.i r11 = og.k.b(r11, r6)
            if (r11 == 0) goto L221
            java.util.List r12 = r11.a()
            java.lang.Object r12 = tf.m.w1(r4, r12)
            java.lang.String r12 = (java.lang.String) r12
            if (r12 != 0) goto L203
            r12 = r8
        L203:
            boolean r21 = og.m.t0(r12)
            if (r21 == 0) goto L218
            java.util.List r11 = r11.a()
            java.lang.Object r11 = tf.m.w1(r3, r11)
            java.lang.String r11 = (java.lang.String) r11
            if (r11 != 0) goto L217
            r12 = r8
            goto L218
        L217:
            r12 = r11
        L218:
            java.lang.CharSequence r11 = og.m.R0(r12)
            java.lang.String r11 = r11.toString()
            goto L222
        L221:
            r11 = 0
        L222:
            if (r11 != 0) goto L225
            r11 = r8
        L225:
            boolean r12 = og.m.t0(r11)
            if (r12 != 0) goto L22d
        L22b:
            r8 = r11
            goto L26b
        L22d:
            l8.d r11 = h.Hchat.hooks.api.model.WeChatMessage.Companion
            r11.getClass()
            java.lang.String r11 = ".msgsource.atuserlist"
            java.lang.String r11 = l8.d.i(r6, r11)
            boolean r12 = og.m.t0(r11)
            if (r12 != 0) goto L23f
            goto L240
        L23f:
            r11 = 0
        L240:
            if (r11 == 0) goto L243
            goto L22b
        L243:
            java.lang.String r11 = "atuserlist"
            java.lang.String r11 = l8.d.i(r6, r11)
            boolean r12 = og.m.t0(r11)
            if (r12 != 0) goto L252
            r20 = r11
            goto L254
        L252:
            r20 = 0
        L254:
            if (r20 == 0) goto L259
            r8 = r20
            goto L26b
        L259:
            java.lang.String r11 = "announcement@all"
            boolean r12 = og.m.h0(r6, r11, r5)
            if (r12 == 0) goto L262
            goto L22b
        L262:
            java.lang.String r11 = "notify@all"
            boolean r6 = og.m.h0(r6, r11, r5)
            if (r6 == 0) goto L26b
            goto L22b
        L26b:
            r20 = r8
            java.lang.Class r6 = r2.getClass()
            java.lang.String r21 = r6.getSimpleName()
            java.lang.String r6 = "isSend"
            java.lang.String r8 = "field_isSend"
            java.lang.Object r11 = r1.o0(r2, r6, r8, r6)
            java.lang.Integer r11 = h0(r11)
            if (r11 == 0) goto L288
        L283:
            int r2 = r11.intValue()
            goto L2b1
        L288:
            java.lang.String r11 = "getIsSend"
            java.lang.Object r11 = r1.o0(r2, r11, r8, r6)
            java.lang.Integer r11 = h0(r11)
            if (r11 == 0) goto L295
            goto L283
        L295:
            java.lang.String[] r6 = new java.lang.String[]{r8, r6}
            r8 = r5
        L29a:
            if (r8 >= r3) goto L2b0
            r11 = r6[r8]
            java.lang.Object r11 = h.Hchat.utils.KavaReflector.readField(r2, r11)
            boolean r12 = r11 instanceof java.lang.Number
            if (r12 == 0) goto L2ad
            java.lang.Number r11 = (java.lang.Number) r11
            int r2 = r11.intValue()
            goto L2b1
        L2ad:
            int r8 = r8 + 1
            goto L29a
        L2b0:
            r2 = r5
        L2b1:
            if (r2 != r4) goto L2bd
            r24 = r4
        L2b5:
            r11 = r16
            r16 = r7
            r17 = r9
            r9 = r0
            goto L2c0
        L2bd:
            r24 = r5
            goto L2b5
        L2c0:
            r9.<init>(r10, r11, r13, r15, r16, r17, r18, r19, r20, r21, r22, r24)
            return r9
    }

    public final long Y(java.lang.Object r13) {
            r12 = this;
            java.lang.String r0 = "getMsgId"
            java.lang.String r1 = "field_msgId"
            java.lang.String r2 = "msgId"
            java.lang.Object r0 = r12.o0(r13, r0, r1, r2)
            java.lang.Long r0 = i0(r0)
            r3 = 0
            r4 = 0
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L2b
            long r8 = r0.longValue()
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r8 <= 0) goto L1f
            r8 = r5
            goto L20
        L1f:
            r8 = r4
        L20:
            if (r8 == 0) goto L23
            goto L24
        L23:
            r0 = r3
        L24:
            if (r0 == 0) goto L2b
            long r0 = r0.longValue()
            return r0
        L2b:
            java.lang.String r0 = "getMsgID"
            java.lang.String r8 = "msgID"
            java.lang.String r9 = "id"
            java.lang.Object r0 = r12.o0(r13, r0, r8, r9)
            java.lang.Long r0 = i0(r0)
            if (r0 == 0) goto L51
            long r10 = r0.longValue()
            int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r10 <= 0) goto L45
            r10 = r5
            goto L46
        L45:
            r10 = r4
        L46:
            if (r10 == 0) goto L49
            goto L4a
        L49:
            r0 = r3
        L4a:
            if (r0 == 0) goto L51
            long r0 = r0.longValue()
            return r0
        L51:
            java.lang.String r0 = "getId"
            java.lang.Object r0 = r12.o0(r13, r0, r9, r1)
            java.lang.Long r0 = i0(r0)
            if (r0 == 0) goto L73
            long r10 = r0.longValue()
            int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r10 <= 0) goto L67
            r10 = r5
            goto L68
        L67:
            r10 = r4
        L68:
            if (r10 == 0) goto L6b
            goto L6c
        L6b:
            r0 = r3
        L6c:
            if (r0 == 0) goto L73
            long r0 = r0.longValue()
            return r0
        L73:
            java.lang.String r0 = ""
            java.lang.Object r1 = r12.o0(r13, r0, r1, r2)
            java.lang.Long r1 = i0(r1)
            if (r1 == 0) goto L95
            long r10 = r1.longValue()
            int r2 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r2 <= 0) goto L89
            r2 = r5
            goto L8a
        L89:
            r2 = r4
        L8a:
            if (r2 == 0) goto L8d
            goto L8e
        L8d:
            r1 = r3
        L8e:
            if (r1 == 0) goto L95
            long r0 = r1.longValue()
            return r0
        L95:
            java.lang.Object r13 = r12.o0(r13, r0, r8, r9)
            java.lang.Long r13 = i0(r13)
            if (r13 == 0) goto Lb2
            long r0 = r13.longValue()
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 <= 0) goto La8
            r4 = r5
        La8:
            if (r4 == 0) goto Lab
            r3 = r13
        Lab:
            if (r3 == 0) goto Lb2
            long r0 = r3.longValue()
            return r0
        Lb2:
            return r6
    }

    public final java.util.List Z(java.lang.Class r7) {
            r6 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r6.f11671s
            java.lang.Object r1 = r0.get(r7)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto Lb
            return r1
        Lb:
            java.util.ArrayList r1 = m(r7)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L18:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L4e
            java.lang.Object r3 = r1.next()
            r4 = r3
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            java.lang.Class r4 = r4.getType()
            boolean r5 = r4.isPrimitive()
            if (r5 != 0) goto L47
            boolean r5 = r4.isArray()
            if (r5 != 0) goto L47
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L47
            java.lang.Class<java.lang.Number> r5 = java.lang.Number.class
            boolean r4 = r5.isAssignableFrom(r4)
            if (r4 != 0) goto L47
            r4 = 1
            goto L48
        L47:
            r4 = 0
        L48:
            if (r4 == 0) goto L18
            r2.add(r3)
            goto L18
        L4e:
            r0.putIfAbsent(r7, r2)
            return r2
    }

    public final java.lang.String a0() {
            r2 = this;
            r8.g r0 = r2.f11653a
            android.content.Context r1 = r0.f11620a
            java.lang.ClassLoader r0 = r0.f11622c
            r0.getClass()
            l8.i r0 = o8.k.a(r1, r0)
            java.lang.String r0 = r0.f7933h
            return r0
    }

    public final void e(android.widget.TextView r5) {
            r4 = this;
            android.content.Context r0 = r5.getContext()
            r0.getClass()
            r9.z r1 = r4.B
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            r2 = 32
            if (r0 != r2) goto L1c
            int r0 = r1.f11826l
            goto L1e
        L1c:
            int r0 = r1.f11825k
        L1e:
            int r1 = r5.getCurrentTextColor()
            if (r1 == r0) goto L27
            r5.setTextColor(r0)
        L27:
            android.content.Context r0 = r5.getContext()
            r0.getClass()
            r9.z r1 = r4.B
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r0 = r0 & 48
            if (r0 != r2) goto L41
            int r0 = r1.f11828n
            goto L43
        L41:
            int r0 = r1.f11827m
        L43:
            android.graphics.drawable.Drawable r1 = r5.getBackground()
            boolean r2 = r1 instanceof android.graphics.drawable.ColorDrawable
            r3 = 0
            if (r2 == 0) goto L4f
            android.graphics.drawable.ColorDrawable r1 = (android.graphics.drawable.ColorDrawable) r1
            goto L50
        L4f:
            r1 = r3
        L50:
            if (r1 == 0) goto L5a
            int r1 = r1.getColor()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
        L5a:
            if (r3 != 0) goto L5d
            goto L63
        L5d:
            int r1 = r3.intValue()
            if (r1 == r0) goto L6a
        L63:
            if (r3 != 0) goto L67
            if (r0 == 0) goto L6a
        L67:
            r5.setBackgroundColor(r0)
        L6a:
            return
    }

    public final void e0(android.app.Activity r5) {
            r4 = this;
            q8.m r0 = h.Hchat.hooks.api.core.WeChatApis.chatPage()
            if (r0 == 0) goto Lb
            java.lang.String r0 = r0.a()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 != 0) goto L10
            java.lang.String r0 = ""
        L10:
            java.lang.String r1 = "@chatroom"
            r2 = 0
            boolean r3 = og.t.W(r0, r1, r2)
            if (r3 != 0) goto L22
            java.lang.String r3 = "@im.chatroom"
            boolean r3 = og.t.W(r0, r3, r2)
            if (r3 != 0) goto L22
            goto L5a
        L22:
            java.lang.String r3 = j(r5)
            if (r3 == 0) goto L5a
            boolean r1 = og.t.W(r3, r1, r2)
            if (r1 != 0) goto L5a
            boolean r1 = r3.equals(r0)
            if (r1 == 0) goto L35
            goto L5a
        L35:
            r8.g r1 = r4.f11653a
            java.lang.ClassLoader r1 = r1.f11622c
            java.lang.String r2 = "com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI"
            java.lang.Class r1 = h.Hchat.utils.KavaReflector.loadClass(r2, r1)
            if (r1 == 0) goto L5a
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r5, r1)
            java.lang.String r1 = "RoomInfo_Id"
            r2.putExtra(r1, r0)
            java.lang.String r0 = "room_member"
            r2.putExtra(r0, r3)
            java.lang.String r0 = "title"
            java.lang.String r1 = "查看群成员消息历史"
            r2.putExtra(r0, r1)
            r5.startActivity(r2)
        L5a:
            return
    }

    public final boolean g(int r20, java.lang.Object r21, java.lang.Object r22, java.lang.Object[] r23) {
            r19 = this;
            r1 = r19
            r8 = r20
            r2 = r21
            r3 = r23
            java.lang.Object r4 = r1.V(r3)
            if (r4 == 0) goto L308
            android.view.View r6 = r1.u(r4)
            if (r6 == 0) goto L308
            java.util.WeakHashMap r10 = r1.f11676x
            h(r6, r10)
            r11 = 1
            r12 = 0
            if (r3 == 0) goto L22
            java.lang.Object r0 = tf.l.C0(r11, r3)
            goto L23
        L22:
            r0 = r12
        L23:
            java.lang.Object r0 = r1.x0(r0)
            r13 = 2
            if (r0 == 0) goto L2c
            goto L2f8
        L2c:
            if (r3 == 0) goto L55
            java.lang.Object r0 = tf.l.C0(r13, r3)
            boolean r5 = r0 instanceof java.lang.Integer
            if (r5 == 0) goto L39
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L3a
        L39:
            r0 = r12
        L3a:
            if (r0 == 0) goto L3e
        L3c:
            r5 = r0
            goto L56
        L3e:
            int r0 = r3.length
            r5 = 0
        L40:
            if (r5 >= r0) goto L4c
            r7 = r3[r5]
            boolean r14 = r7 instanceof java.lang.Integer
            if (r14 == 0) goto L49
            goto L4d
        L49:
            int r5 = r5 + 1
            goto L40
        L4c:
            r7 = r12
        L4d:
            boolean r0 = r7 instanceof java.lang.Integer
            if (r0 == 0) goto L55
            r0 = r7
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L3c
        L55:
            r5 = r12
        L56:
            if (r2 == 0) goto L2f7
            if (r5 != 0) goto L5c
            goto L2f7
        L5c:
            java.lang.Class r0 = r2.getClass()
            java.util.concurrent.ConcurrentHashMap r7 = r1.f11662j
            java.lang.Object r0 = r7.get(r0)
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            java.lang.Class<java.lang.Object> r14 = java.lang.Object.class
            if (r0 == 0) goto L78
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.readField(r0, r2)
            if (r0 == 0) goto L78
            r18 = r5
            r16 = 0
            goto L1ac
        L78:
            java.lang.Class r0 = r1.E
            if (r0 == 0) goto L82
            r18 = r5
            r16 = 0
            goto L11f
        L82:
            java.lang.String r0 = r1.a0()
            r8.g r15 = r1.f11653a
            android.content.Context r13 = r15.f11620a
            r16 = 0
            java.lang.ClassLoader r9 = r15.f11622c
            java.lang.String r11 = "Hchat_extra_class_cache"
            android.content.SharedPreferences r11 = ub.b.c(r13, r11)
            java.lang.String r13 = "_chatting_data_adapter"
            java.lang.String r13 = r0.concat(r13)
            java.lang.String r0 = r11.getString(r13, r12)
            if (r0 == 0) goto Lac
            java.lang.Class r0 = h.Hchat.utils.KavaReflector.loadClass(r0, r9)
            if (r0 == 0) goto Lac
            r1.E = r0
            r18 = r5
            goto L11f
        Lac:
            org.luckypray.dexkit.DexKitBridge r0 = r15.f11623d     // Catch: java.lang.Throwable -> Le6
            ch.c r15 = new ch.c     // Catch: java.lang.Throwable -> Le6
            r15.<init>()     // Catch: java.lang.Throwable -> Le6
            fh.a r12 = new fh.a     // Catch: java.lang.Throwable -> Le6
            r12.<init>()     // Catch: java.lang.Throwable -> Le6
            java.lang.String r3 = "MicroMsg.ChattingDataAdapterV3"
            r18 = r5
            java.lang.String r5 = "[handleMsgChange] isLockNotify:"
            java.lang.String[] r3 = new java.lang.String[]{r3, r5}     // Catch: java.lang.Throwable -> Le2
            java.util.List r3 = a.a.y0(r3)     // Catch: java.lang.Throwable -> Le2
            fh.a.r0(r12, r3)     // Catch: java.lang.Throwable -> Le2
            r15.f1664h = r12     // Catch: java.lang.Throwable -> Le2
            hh.j r0 = r0.findClass(r15)     // Catch: java.lang.Throwable -> Le2
            java.lang.Object r0 = r0.a()     // Catch: java.lang.Throwable -> Le2
            hh.i r0 = (hh.i) r0     // Catch: java.lang.Throwable -> Le2
            if (r0 == 0) goto Le4
            lh.a r0 = r0.p()     // Catch: java.lang.Throwable -> Le2
            java.lang.String r0 = r0.f8057g     // Catch: java.lang.Throwable -> Le2
            java.lang.Class r0 = h.Hchat.utils.KavaReflector.loadClass(r0, r9)     // Catch: java.lang.Throwable -> Le2
            goto Lef
        Le2:
            r0 = move-exception
            goto Le9
        Le4:
            r0 = 0
            goto Lef
        Le6:
            r0 = move-exception
            r18 = r5
        Le9:
            sf.f r3 = new sf.f
            r3.<init>(r0)
            r0 = r3
        Lef:
            java.lang.Throwable r3 = sf.g.b(r0)
            if (r3 != 0) goto Lf6
            goto Lfe
        Lf6:
            ia.t r0 = r1.f11654b
            java.lang.String r5 = "Hchat聊天消息Adapter定位失败"
            r0.invoke(r5, r3)
            r0 = 0
        Lfe:
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto L114
            r1.E = r0
            android.content.SharedPreferences$Editor r3 = r11.edit()
            java.lang.String r5 = r0.getName()
            android.content.SharedPreferences$Editor r3 = r3.putString(r13, r5)
            r3.apply()
            goto L11f
        L114:
            android.content.SharedPreferences$Editor r3 = r11.edit()
            android.content.SharedPreferences$Editor r3 = r3.remove(r13)
            r3.apply()
        L11f:
            java.lang.Class r3 = r2.getClass()
        L123:
            if (r3 == 0) goto L16a
            boolean r5 = r3.equals(r14)
            if (r5 != 0) goto L16a
            java.util.List r5 = h.Hchat.utils.KavaReflector.declaredFields(r3)
            java.util.Iterator r5 = r5.iterator()
        L133:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L165
            java.lang.Object r9 = r5.next()
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            if (r0 == 0) goto L14c
            java.lang.Class r11 = r9.getType()
            boolean r11 = r0.isAssignableFrom(r11)
            if (r11 != 0) goto L14c
            goto L133
        L14c:
            java.lang.Object r11 = h.Hchat.utils.KavaReflector.readField(r9, r2)
            if (r11 == 0) goto L133
            java.lang.Class r12 = r11.getClass()
            boolean r12 = z(r12)
            if (r12 == 0) goto L133
            java.lang.Class r0 = r2.getClass()
            r7.put(r0, r9)
            r0 = r11
            goto L1ac
        L165:
            java.lang.Class r3 = r3.getSuperclass()
            goto L123
        L16a:
            if (r0 == 0) goto L16e
        L16c:
            r0 = 0
            goto L1ac
        L16e:
            java.lang.Class r0 = r2.getClass()
        L172:
            if (r0 == 0) goto L16c
            boolean r3 = r0.equals(r14)
            if (r3 != 0) goto L16c
            java.util.List r3 = h.Hchat.utils.KavaReflector.declaredFields(r0)
            java.util.Iterator r3 = r3.iterator()
        L182:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L1a7
            java.lang.Object r5 = r3.next()
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            java.lang.Object r9 = h.Hchat.utils.KavaReflector.readField(r5, r2)
            if (r9 == 0) goto L182
            java.lang.Class r11 = r9.getClass()
            boolean r11 = z(r11)
            if (r11 == 0) goto L182
            java.lang.Class r0 = r2.getClass()
            r7.put(r0, r5)
            r0 = r9
            goto L1ac
        L1a7:
            java.lang.Class r0 = r0.getSuperclass()
            goto L172
        L1ac:
            if (r0 == 0) goto L2f7
            int r3 = r18.intValue()
            if (r3 >= 0) goto L1b7
            r0 = 0
            goto L2f2
        L1b7:
            java.lang.Class r5 = r0.getClass()
            java.util.concurrent.ConcurrentHashMap r9 = r1.f11661i
            java.lang.Object r5 = r9.get(r5)
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            if (r5 == 0) goto L1cf
            java.lang.Object[] r3 = new java.lang.Object[]{r18}
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invoke(r5, r0, r3)
            goto L2f2
        L1cf:
            java.lang.Class r5 = r0.getClass()
        L1d3:
            if (r5 == 0) goto L25b
            boolean r11 = r5.equals(r14)
            if (r11 != 0) goto L25b
            java.util.List r11 = h.Hchat.utils.KavaReflector.declaredMethods(r5)
            java.util.Iterator r11 = r11.iterator()
        L1e3:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L23a
            java.lang.Object r12 = r11.next()
            r13 = r12
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            java.lang.Class[] r15 = r13.getParameterTypes()
            int r15 = r15.length
            r2 = 1
            if (r15 != r2) goto L237
            java.lang.Class[] r2 = r13.getParameterTypes()
            r2 = r2[r16]
            java.lang.Class r15 = java.lang.Integer.TYPE
            boolean r2 = gg.l.a(r2, r15)
            if (r2 != 0) goto L212
            java.lang.Class[] r2 = r13.getParameterTypes()
            r2 = r2[r16]
            boolean r2 = gg.l.a(r2, r15)
            if (r2 == 0) goto L237
        L212:
            java.lang.String r2 = r13.getName()
            java.lang.String r15 = "J0"
            boolean r2 = gg.l.a(r2, r15)
            if (r2 != 0) goto L23b
            java.lang.String r2 = r13.getName()
            java.lang.String r15 = "getItem"
            boolean r2 = gg.l.a(r2, r15)
            if (r2 != 0) goto L23b
            java.lang.String r2 = r13.getName()
            java.lang.String r13 = "get"
            boolean r2 = gg.l.a(r2, r13)
            if (r2 == 0) goto L237
            goto L23b
        L237:
            r2 = r21
            goto L1e3
        L23a:
            r12 = 0
        L23b:
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            if (r12 == 0) goto L253
            java.lang.Class r2 = r0.getClass()
            r9.put(r2, r12)
            java.lang.Object[] r2 = new java.lang.Object[]{r18}
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invoke(r12, r0, r2)
            if (r2 == 0) goto L253
        L250:
            r0 = r2
            goto L2f2
        L253:
            java.lang.Class r5 = r5.getSuperclass()
            r2 = r21
            goto L1d3
        L25b:
            java.lang.Class r2 = r0.getClass()
            java.lang.Object r2 = r7.get(r2)
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            if (r2 == 0) goto L272
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r2, r0)
            java.lang.Object r2 = R(r3, r2)
            if (r2 == 0) goto L272
            goto L250
        L272:
            java.lang.Class r2 = r0.getClass()
        L276:
            if (r2 == 0) goto L2de
            boolean r5 = r2.equals(r14)
            if (r5 != 0) goto L2de
            java.util.List r5 = h.Hchat.utils.KavaReflector.declaredFields(r2)
            java.util.Iterator r5 = r5.iterator()
        L286:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L2c4
            java.lang.Object r9 = r5.next()
            r11 = r9
            java.lang.reflect.Field r11 = (java.lang.reflect.Field) r11
            java.lang.String r12 = r11.getName()
            java.lang.String r13 = "K"
            boolean r12 = gg.l.a(r12, r13)
            if (r12 != 0) goto L2c5
            java.lang.String r12 = r11.getName()
            java.lang.String r13 = "items"
            boolean r12 = gg.l.a(r12, r13)
            if (r12 != 0) goto L2c5
            java.lang.String r12 = r11.getName()
            java.lang.String r13 = "data"
            boolean r12 = gg.l.a(r12, r13)
            if (r12 != 0) goto L2c5
            java.lang.String r11 = r11.getName()
            java.lang.String r12 = "list"
            boolean r11 = gg.l.a(r11, r12)
            if (r11 == 0) goto L286
            goto L2c5
        L2c4:
            r9 = 0
        L2c5:
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            if (r9 == 0) goto L2d9
            java.lang.Class r2 = r0.getClass()
            r7.put(r2, r9)
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.readField(r9, r0)
            java.lang.Object r0 = R(r3, r0)
            goto L2f2
        L2d9:
            java.lang.Class r2 = r2.getSuperclass()
            goto L276
        L2de:
            java.util.WeakHashMap r2 = new java.util.WeakHashMap
            r2.<init>()
            java.util.Set r2 = java.util.Collections.newSetFromMap(r2)
            r2.getClass()
            java.util.Set r2 = (java.util.Set) r2
            r5 = r16
            java.lang.Object r0 = r1.s(r0, r3, r2, r5)
        L2f2:
            java.lang.Object r0 = r1.x0(r0)
            goto L2f8
        L2f7:
            r0 = 0
        L2f8:
            if (r0 != 0) goto L31e
            r2 = 2
            if (r8 < r2) goto L306
            r3 = 0
            r1.u0(r6, r3)
            java.lang.String r0 = "message"
            r1.T(r0, r4, r6)
        L306:
            if (r8 < r2) goto L30b
        L308:
            r3 = 0
            goto L3f7
        L30b:
            r17 = 1
            int r4 = r8 + 1
            r9.d r0 = new r9.d
            r2 = r21
            r5 = r22
            r3 = r23
            r0.<init>(r1, r2, r3, r4, r5)
            A0(r6, r6, r10, r0)
            goto L308
        L31e:
            r5 = r22
            java.lang.String r2 = "getType"
            java.lang.String r3 = "field_type"
            java.lang.String r7 = "type"
            java.lang.Object r2 = r1.o0(r0, r2, r3, r7)
            java.lang.Integer r2 = h0(r2)
            if (r2 == 0) goto L335
            int r2 = r2.intValue()
            goto L352
        L335:
            java.lang.String[] r2 = new java.lang.String[]{r3, r7}
            r3 = 0
        L33a:
            r7 = 2
            if (r3 >= r7) goto L351
            r7 = r2[r3]
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.readField(r0, r7)
            boolean r9 = r7 instanceof java.lang.Number
            if (r9 == 0) goto L34e
            java.lang.Number r7 = (java.lang.Number) r7
            int r2 = r7.intValue()
            goto L352
        L34e:
            int r3 = r3 + 1
            goto L33a
        L351:
            r2 = 0
        L352:
            r3 = 10002(0x2712, float:1.4016E-41)
            r7 = 10000(0x2710, float:1.4013E-41)
            if (r2 > 0) goto L359
            goto L36d
        L359:
            r9 = r2 & 255(0xff, float:3.57E-43)
            r11 = 65535(0xffff, float:9.1834E-41)
            r11 = r11 & r2
            int r12 = r2 >>> 16
            if (r12 != 0) goto L364
            goto L36d
        L364:
            if (r11 == r7) goto L36f
            if (r11 == r3) goto L36f
            if (r9 == 0) goto L36d
            if (r11 != r9) goto L36d
            goto L370
        L36d:
            r9 = r2
            goto L370
        L36f:
            r9 = r11
        L370:
            if (r9 == r7) goto L374
            if (r9 != r3) goto L378
        L374:
            r7 = r6
            r3 = 0
            goto L3ee
        L378:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r9.f0 r7 = r1.X(r0, r2, r3)
            java.util.concurrent.ConcurrentHashMap r2 = r1.f11663k
            if (r5 == 0) goto L398
            android.widget.TextView r3 = p(r5, r2)
            if (r3 == 0) goto L390
            boolean r3 = P(r3, r6)
            goto L391
        L390:
            r3 = 0
        L391:
            if (r3 == 0) goto L394
            goto L395
        L394:
            r5 = 0
        L395:
            if (r5 == 0) goto L398
            goto L3b3
        L398:
            java.lang.Object r3 = r6.getTag()
            if (r3 == 0) goto L3ad
            android.widget.TextView r5 = p(r3, r2)
            if (r5 == 0) goto L3a9
            boolean r5 = P(r5, r6)
            goto L3aa
        L3a9:
            r5 = 0
        L3aa:
            if (r5 == 0) goto L3ad
            goto L3ae
        L3ad:
            r3 = 0
        L3ae:
            if (r3 == 0) goto L3b2
            r5 = r3
            goto L3b3
        L3b2:
            r5 = r4
        L3b3:
            android.widget.TextView r3 = p(r5, r2)
            r4 = 0
            r2 = r6
            r6 = r0
            boolean r6 = r1.E(r2, r3, r4, r5, r6, r7)
            r7 = r2
            r9 = r3
            if (r6 != 0) goto L3e1
            r2 = 2
            if (r8 < r2) goto L3ce
            r3 = 0
            r1.u0(r7, r3)
            java.lang.String r0 = "layout"
            r1.T(r0, r5, r7)
        L3ce:
            if (r8 < r2) goto L3d1
            goto L3e1
        L3d1:
            r17 = 1
            int r4 = r8 + 1
            r9.d r0 = new r9.d
            r2 = r21
            r3 = r23
            r0.<init>(r1, r2, r3, r4, r5)
            A0(r7, r7, r10, r0)
        L3e1:
            if (r9 == 0) goto L3e7
            r3 = 0
            r9.setOnClickListener(r3)
        L3e7:
            if (r9 == 0) goto L3ed
            r3 = 0
            r9.setClickable(r3)
        L3ed:
            return r6
        L3ee:
            r1.u0(r7, r3)
            r1.y0(r7, r3)
            r17 = 1
            return r17
        L3f7:
            return r3
    }

    public final r9.z m0() {
            r20 = this;
            r1 = r20
            android.content.SharedPreferences r2 = r1.f11655c
            java.lang.String r0 = "message_details_position"
            java.lang.String r3 = "message_bottom"
            java.lang.String r0 = r2.getString(r0, r3)
            if (r0 == 0) goto L30
            int r4 = r0.hashCode()
            r5 = -586538697(0xffffffffdd0a2137, float:-6.220811E17)
            if (r4 == r5) goto L28
            r5 = -585528885(0xffffffffdd1989cb, float:-6.914748E17)
            if (r4 == r5) goto L1d
            goto L30
        L1d:
            java.lang.String r4 = "avatar_below"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L26
            goto L30
        L26:
            r7 = r4
            goto L31
        L28:
            java.lang.String r4 = "avatar_above"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L26
        L30:
            r7 = r3
        L31:
            java.lang.String r0 = "message_details_format"
            java.lang.String r3 = "${time}"
            java.lang.String r0 = r2.getString(r0, r3)
            java.lang.String r4 = ""
            if (r0 != 0) goto L3e
            r0 = r4
        L3e:
            boolean r5 = og.m.t0(r0)
            if (r5 == 0) goto L46
            r8 = r3
            goto L47
        L46:
            r8 = r0
        L47:
            java.lang.String r0 = "message_details_time_format"
            java.lang.String r3 = "HH:mm:ss"
            java.lang.String r0 = r2.getString(r0, r3)
            if (r0 != 0) goto L52
            r0 = r4
        L52:
            boolean r5 = og.m.t0(r0)
            if (r5 == 0) goto L59
            goto L5a
        L59:
            r3 = r0
        L5a:
            java.time.format.DateTimeFormatter r0 = java.time.format.DateTimeFormatter.ofPattern(r3)     // Catch: java.lang.Throwable -> L5f
            goto L66
        L5f:
            r0 = move-exception
            sf.f r3 = new sf.f
            r3.<init>(r0)
            r0 = r3
        L66:
            boolean r3 = r0 instanceof sf.f
            if (r3 == 0) goto L6d
            java.time.format.DateTimeFormatter r0 = r9.d0.I
        L6d:
            r10 = r0
            java.time.format.DateTimeFormatter r10 = (java.time.format.DateTimeFormatter) r10
            java.lang.String r0 = "message_details_light_text"
            java.lang.String r3 = "#FFFF0000"
            java.lang.String r0 = r2.getString(r0, r3)
            if (r0 != 0) goto L7b
            r0 = r4
        L7b:
            java.lang.String r5 = "message_details_dark_text"
            java.lang.String r5 = r2.getString(r5, r3)
            if (r5 != 0) goto L84
            r5 = r4
        L84:
            java.lang.String r6 = "message_details_light_bg"
            java.lang.String r9 = "#00000000"
            java.lang.String r6 = r2.getString(r6, r9)
            if (r6 != 0) goto L8f
            r6 = r4
        L8f:
            java.lang.String r11 = "message_details_dark_bg"
            java.lang.String r11 = r2.getString(r11, r9)
            if (r11 != 0) goto L98
            goto L99
        L98:
            r4 = r11
        L99:
            r9.z r11 = new r9.z
            java.lang.String r12 = "message_details_enable"
            r13 = 0
            boolean r12 = r2.getBoolean(r12, r13)
            og.k r14 = r9.d0.G
            ng.c r14 = og.k.c(r14, r8)
            r9.p r15 = new r9.p
            r15.<init>(r13)
            ng.t r13 = ng.m.W(r14, r15)
            java.util.Set r13 = ng.m.c0(r13)
            r10.getClass()
            java.lang.String r14 = "message_details_text_size"
            r15 = 10
            int r14 = r2.getInt(r14, r15)
            float r14 = (float) r14
            java.lang.String r15 = "message_details_avatar_gap"
            r1 = 2
            int r1 = r2.getInt(r15, r1)
            r15 = 64
            r17 = r7
            r7 = 0
            int r1 = r9.e0.r(r1, r7, r15)
            java.lang.String r7 = "message_details_left_margin"
            int r7 = r2.getInt(r7, r15)
            r18 = r1
            java.lang.String r1 = "message_details_right_margin"
            int r1 = r2.getInt(r1, r15)
            java.lang.String r15 = "message_details_click_show"
            r19 = r1
            r1 = 1
            boolean r15 = r2.getBoolean(r15, r1)
            r1 = -65536(0xffffffffffff0000, float:NaN)
            r2 = 0
            int r16 = v0(r1, r0, r3, r5, r3)
            int r0 = v0(r1, r5, r3, r0, r3)
            r1 = r12
            r12 = r18
            int r18 = v0(r2, r6, r9, r4, r9)
            int r2 = v0(r2, r4, r9, r6, r9)
            r6 = r1
            r5 = r11
            r9 = r13
            r11 = r14
            r14 = r19
            r19 = r2
            r13 = r7
            r7 = r17
            r17 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r5
    }

    public final java.lang.String n0(java.lang.Object r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            java.lang.Object r1 = r0.o0(r1, r2, r3, r4)
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto Lb
            java.lang.String r1 = (java.lang.String) r1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            if (r1 == 0) goto Lf
            return r1
        Lf:
            java.lang.String r1 = ""
            return r1
    }

    public final android.view.View o(java.lang.Object r8) {
            r7 = this;
            java.lang.Class r0 = r8.getClass()
            java.util.concurrent.ConcurrentHashMap r1 = r7.f11664l
            java.lang.Object r0 = r1.get(r0)
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            r2 = 0
            if (r0 == 0) goto L1a
            java.lang.Object r8 = h.Hchat.utils.KavaReflector.readField(r0, r8)
            boolean r0 = r8 instanceof android.view.View
            if (r0 == 0) goto La6
            android.view.View r8 = (android.view.View) r8
            return r8
        L1a:
            java.lang.Class r0 = r8.getClass()
            java.util.ArrayList r0 = m(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L2b:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L48
            java.lang.Object r4 = r0.next()
            r5 = r4
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            java.lang.Class<android.view.View> r6 = android.view.View.class
            java.lang.Class r5 = r5.getType()
            boolean r5 = r6.isAssignableFrom(r5)
            if (r5 == 0) goto L2b
            r3.add(r4)
            goto L2b
        L48:
            java.util.Iterator r0 = r3.iterator()
        L4c:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L66
            java.lang.Object r4 = r0.next()
            r5 = r4
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            java.lang.String r5 = r5.getName()
            java.lang.String r6 = "avatarIV"
            boolean r5 = og.t.X(r5, r6)
            if (r5 == 0) goto L4c
            goto L67
        L66:
            r4 = r2
        L67:
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            if (r4 == 0) goto L6c
            goto L94
        L6c:
            java.util.Iterator r0 = r3.iterator()
        L70:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L8e
            java.lang.Object r3 = r0.next()
            r4 = r3
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            java.lang.String r4 = r4.getName()
            r4.getClass()
            java.lang.String r5 = "avatar"
            r6 = 1
            boolean r4 = og.m.h0(r4, r5, r6)
            if (r4 == 0) goto L70
            goto L8f
        L8e:
            r3 = r2
        L8f:
            r4 = r3
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            if (r4 == 0) goto La6
        L94:
            java.lang.Class r0 = r8.getClass()
            r1.put(r0, r4)
            java.lang.Object r8 = h.Hchat.utils.KavaReflector.readField(r4, r8)
            boolean r0 = r8 instanceof android.view.View
            if (r0 == 0) goto La6
            android.view.View r8 = (android.view.View) r8
            return r8
        La6:
            return r2
    }

    public final java.lang.Object o0(java.lang.Object r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            r6 = this;
            r9.w r0 = new r9.w
            java.lang.Class r1 = r7.getClass()
            r0.<init>(r1, r8, r9, r10)
            java.util.concurrent.ConcurrentHashMap r1 = r6.f11669q
            java.lang.Object r2 = r1.get(r0)
            r9.v r2 = (r9.v) r2
            r3 = 0
            if (r2 == 0) goto L15
            goto L37
        L15:
            r9.v r2 = new r9.v
            java.lang.Class r4 = r7.getClass()
            java.lang.Class[] r5 = new java.lang.Class[r3]
            java.lang.reflect.Method r8 = h.Hchat.utils.KavaReflector.findMethod(r4, r8, r5)
            java.lang.Class r4 = r7.getClass()
            java.lang.reflect.Field r9 = h.Hchat.utils.KavaReflector.findFieldRecursive(r4, r9)
            java.lang.Class r4 = r7.getClass()
            java.lang.reflect.Field r10 = h.Hchat.utils.KavaReflector.findFieldRecursive(r4, r10)
            r2.<init>(r8, r9, r10)
            r1.putIfAbsent(r0, r2)
        L37:
            java.lang.reflect.Method r8 = r2.f11802a
            java.lang.Object[] r9 = new java.lang.Object[r3]
            java.lang.Object r8 = h.Hchat.utils.KavaReflector.invoke(r8, r7, r9)
            if (r8 == 0) goto L42
            return r8
        L42:
            java.lang.reflect.Field r8 = r2.f11803b
            java.lang.Object r8 = h.Hchat.utils.KavaReflector.readField(r8, r7)
            if (r8 == 0) goto L4b
            return r8
        L4b:
            java.lang.reflect.Field r8 = r2.f11804c
            java.lang.Object r7 = h.Hchat.utils.KavaReflector.readField(r8, r7)
            return r7
    }

    public final java.lang.Integer p0() {
            r5 = this;
            r8.g r0 = r5.f11653a
            r1 = 0
            android.content.Context r2 = r0.f11620a     // Catch: java.lang.Throwable -> L25
            android.content.res.Resources r2 = r2.getResources()     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "j6q"
            java.lang.String r4 = "id"
            android.content.Context r0 = r0.f11620a     // Catch: java.lang.Throwable -> L25
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Throwable -> L25
            int r0 = r2.getIdentifier(r3, r4, r0)     // Catch: java.lang.Throwable -> L25
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            if (r0 == 0) goto L23
            goto L2b
        L23:
            r2 = r1
            goto L2b
        L25:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
        L2b:
            boolean r0 = r2 instanceof sf.f
            if (r0 == 0) goto L30
            goto L31
        L30:
            r1 = r2
        L31:
            java.lang.Integer r1 = (java.lang.Integer) r1
            return r1
    }

    public final void q0() {
            r6 = this;
            java.util.WeakHashMap r0 = r6.f11674v
            monitor-enter(r0)
            java.util.WeakHashMap r1 = r6.f11674v     // Catch: java.lang.Throwable -> L38
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L38
            r1.getClass()     // Catch: java.lang.Throwable -> L38
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L38
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L38
            int r3 = tf.n.e1(r1)     // Catch: java.lang.Throwable -> L38
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L38
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L38
        L1b:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L3a
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L38
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L38
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L38
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L38
            sf.e r5 = new sf.e     // Catch: java.lang.Throwable -> L38
            r5.<init>(r4, r3)     // Catch: java.lang.Throwable -> L38
            r2.add(r5)     // Catch: java.lang.Throwable -> L38
            goto L1b
        L38:
            r1 = move-exception
            goto L5e
        L3a:
            monitor-exit(r0)
            java.util.Iterator r0 = r2.iterator()
        L3f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L5d
            java.lang.Object r1 = r0.next()
            sf.e r1 = (sf.e) r1
            java.lang.Object r2 = r1.f12418g
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.Object r1 = r1.f12419h
            r9.y r1 = (r9.y) r1
            r8.b r3 = new r8.b
            r4 = 2
            r3.<init>(r6, r1, r2, r4)
            r2.post(r3)
            goto L3f
        L5d:
            return
        L5e:
            monitor-exit(r0)
            throw r1
    }

    public final void r0(android.widget.TextView r2, boolean r3) {
            r1 = this;
            if (r3 != 0) goto L3
            return
        L3:
            r1.e(r2)
            aa.c r3 = new aa.c
            r0 = 27
            r3.<init>(r2, r0, r1)
            java.util.WeakHashMap r0 = r1.f11678z
            A0(r2, r2, r0, r3)
            r9.l r3 = new r9.l
            r0 = 0
            r3.<init>(r2, r1, r0)
            r2.post(r3)
            return
    }

    public final java.lang.Object s(java.lang.Object r6, int r7, java.util.Set r8, int r9) {
            r5 = this;
            r0 = 0
            if (r7 < 0) goto L6e
            r1 = 3
            if (r9 > r1) goto L6e
            boolean r1 = r8.add(r6)
            if (r1 != 0) goto Ld
            goto L6e
        Ld:
            java.lang.Object r1 = R(r7, r6)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L25
            java.lang.Object r4 = r5.x0(r1)
            if (r4 == 0) goto L1d
            r4 = r2
            goto L1e
        L1d:
            r4 = r3
        L1e:
            if (r4 == 0) goto L21
            goto L22
        L21:
            r1 = r0
        L22:
            if (r1 == 0) goto L25
            return r1
        L25:
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r4 = "java."
            boolean r4 = og.t.d0(r1, r4, r3)
            if (r4 != 0) goto L6e
            java.lang.String r4 = "android."
            boolean r1 = og.t.d0(r1, r4, r3)
            if (r1 == 0) goto L3e
            goto L6e
        L3e:
            boolean r1 = r6 instanceof android.view.View
            if (r1 != 0) goto L6e
            boolean r1 = r6 instanceof android.view.ViewGroup
            if (r1 == 0) goto L47
            goto L6e
        L47:
            java.lang.Class r1 = r6.getClass()
            java.util.List r1 = r5.Z(r1)
            java.util.Iterator r1 = r1.iterator()
        L53:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L6e
            java.lang.Object r3 = r1.next()
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.readField(r3, r6)
            if (r3 == 0) goto L53
            int r4 = r9 + 1
            java.lang.Object r3 = r5.s(r3, r7, r8, r4)
            if (r3 == 0) goto L53
            return r3
        L6e:
            return r0
    }

    public final void s0(android.view.View r9, android.widget.TextView r10, android.widget.TextView r11, java.lang.Object r12, java.lang.Object r13, r9.f0 r14) {
            r8 = this;
            java.util.WeakHashMap r1 = r8.f11674v
            monitor-enter(r1)
            java.util.WeakHashMap r0 = r8.f11674v     // Catch: java.lang.Throwable -> L14
            r9.y r2 = new r9.y     // Catch: java.lang.Throwable -> L14
            r3 = r9
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L14
            r0.put(r10, r2)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)
            return
        L14:
            r0 = move-exception
            r9 = r0
            monitor-exit(r1)
            throw r9
    }

    public final java.lang.reflect.Field t(java.lang.Class r9) {
            r8 = this;
            java.util.concurrent.ConcurrentHashMap r0 = r8.f11660h
            java.lang.Object r1 = r0.get(r9)
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            if (r1 == 0) goto Lb
            return r1
        Lb:
            r1 = r9
        Lc:
            r2 = 0
            if (r1 == 0) goto L58
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L58
            java.util.List r3 = h.Hchat.utils.KavaReflector.declaredFields(r1)
            java.util.Iterator r3 = r3.iterator()
        L1f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L4b
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            java.lang.String r6 = r5.getName()
            java.lang.String r7 = "itemView"
            boolean r6 = gg.l.a(r6, r7)
            if (r6 != 0) goto L47
            java.lang.Class r5 = r5.getType()
            java.lang.Class<android.view.View> r6 = android.view.View.class
            boolean r5 = gg.l.a(r5, r6)
            if (r5 == 0) goto L45
            goto L47
        L45:
            r5 = 0
            goto L48
        L47:
            r5 = 1
        L48:
            if (r5 == 0) goto L1f
            r2 = r4
        L4b:
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            if (r2 == 0) goto L53
            r0.put(r9, r2)
            return r2
        L53:
            java.lang.Class r1 = r1.getSuperclass()
            goto Lc
        L58:
            return r2
    }

    public final void t0(android.view.View r5, android.view.View r6) {
            r4 = this;
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 != 0) goto L5
            goto L5d
        L5:
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r0 = r5.getChildCount()
            int r0 = r0 + (-1)
        Ld:
            if (r0 < 0) goto L5d
            android.view.View r1 = r5.getChildAt(r0)
            if (r1 == r6) goto L54
            boolean r2 = r1 instanceof android.widget.TextView
            if (r2 == 0) goto L54
            r2 = r1
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.Object r2 = r2.getTag()
            java.lang.String r3 = "hchat_message_details_view"
            boolean r2 = gg.l.a(r2, r3)
            if (r2 == 0) goto L54
            java.util.WeakHashMap r2 = r4.f11677y
            h(r1, r2)
            java.util.WeakHashMap r2 = r4.f11678z
            h(r1, r2)
            java.util.WeakHashMap r2 = r4.f11674v
            monitor-enter(r2)
            java.util.WeakHashMap r3 = r4.f11674v     // Catch: java.lang.Throwable -> L51
            java.lang.Object r3 = r3.remove(r1)     // Catch: java.lang.Throwable -> L51
            r9.y r3 = (r9.y) r3     // Catch: java.lang.Throwable -> L51
            monitor-exit(r2)
            java.util.Set r2 = r4.f11673u
            r2.getClass()
            monitor-enter(r2)
            java.util.Set r3 = r4.f11673u     // Catch: java.lang.Throwable -> L4e
            r3.remove(r1)     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r2)
            r5.removeViewAt(r0)
            goto L5a
        L4e:
            r5 = move-exception
            monitor-exit(r2)
            throw r5
        L51:
            r5 = move-exception
            monitor-exit(r2)
            throw r5
        L54:
            r1.getClass()
            r4.t0(r1, r6)
        L5a:
            int r0 = r0 + (-1)
            goto Ld
        L5d:
            return
    }

    public final android.view.View u(java.lang.Object r4) {
            r3 = this;
            java.lang.String r0 = "itemView"
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.readField(r4, r0)
            boolean r1 = r0 instanceof android.view.View
            r2 = 0
            if (r1 == 0) goto Le
            android.view.View r0 = (android.view.View) r0
            goto Lf
        Le:
            r0 = r2
        Lf:
            if (r0 == 0) goto L12
            return r0
        L12:
            java.lang.Class r0 = r4.getClass()
            java.lang.reflect.Field r0 = r3.t(r0)
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.readField(r0, r4)
            boolean r0 = r4 instanceof android.view.View
            if (r0 == 0) goto L25
            android.view.View r4 = (android.view.View) r4
            return r4
        L25:
            return r2
    }

    public final void u0(android.view.View r4, android.widget.TextView r5) {
            r3 = this;
            r3.t0(r4, r5)
            android.view.ViewParent r4 = r4.getParent()
            boolean r0 = r4 instanceof android.view.ViewGroup
            r1 = 0
            if (r0 == 0) goto Lf
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            goto L10
        Lf:
            r4 = r1
        L10:
            r0 = 0
        L11:
            if (r4 == 0) goto L2e
            r2 = 3
            if (r0 >= r2) goto L2e
            boolean r2 = O(r4)
            if (r2 != 0) goto L2e
            r3.t0(r4, r5)
            android.view.ViewParent r4 = r4.getParent()
            boolean r2 = r4 instanceof android.view.ViewGroup
            if (r2 == 0) goto L2a
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            goto L2b
        L2a:
            r4 = r1
        L2b:
            int r0 = r0 + 1
            goto L11
        L2e:
            return
    }

    public final java.lang.Object w0(int r7, java.lang.Object r8, java.util.Set r9) {
            r6 = this;
            r0 = 0
            if (r8 == 0) goto L86
            r1 = 4
            if (r7 > r1) goto L86
            boolean r1 = r9.add(r8)
            if (r1 != 0) goto Le
            goto L86
        Le:
            java.lang.Class r1 = r8.getClass()
            java.lang.String r1 = r1.getName()
            boolean r2 = r6.J(r8)
            if (r2 == 0) goto L27
            long r2 = r6.Y(r8)
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L27
            return r8
        L27:
            java.lang.String r2 = "java."
            r3 = 0
            boolean r2 = og.t.d0(r1, r2, r3)
            if (r2 != 0) goto L86
            java.lang.String r2 = "android."
            boolean r1 = og.t.d0(r1, r2, r3)
            if (r1 == 0) goto L39
            goto L86
        L39:
            boolean r1 = r8 instanceof android.view.View
            if (r1 != 0) goto L86
            boolean r1 = r8 instanceof android.view.ViewGroup
            if (r1 == 0) goto L42
            return r0
        L42:
            boolean r1 = r8 instanceof java.util.Collection
            if (r1 == 0) goto L5f
            java.util.Collection r8 = (java.util.Collection) r8
            java.util.Iterator r8 = r8.iterator()
        L4c:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L86
            java.lang.Object r1 = r8.next()
            int r2 = r7 + 1
            java.lang.Object r1 = r6.w0(r2, r1, r9)
            if (r1 == 0) goto L4c
            return r1
        L5f:
            java.lang.Class r1 = r8.getClass()
            java.util.List r1 = r6.Z(r1)
            java.util.Iterator r1 = r1.iterator()
        L6b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L86
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r2, r8)
            if (r2 == 0) goto L6b
            int r3 = r7 + 1
            java.lang.Object r2 = r6.w0(r3, r2, r9)
            if (r2 == 0) goto L6b
            return r2
        L86:
            return r0
    }

    public final java.lang.Object x0(java.lang.Object r5) {
            r4 = this;
            if (r5 != 0) goto L4
            r5 = 0
            return r5
        L4:
            boolean r0 = r4.J(r5)
            if (r0 == 0) goto L15
            long r0 = r4.Y(r5)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L15
            return r5
        L15:
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r0.getClass()
            java.util.Set r0 = (java.util.Set) r0
            r1 = 0
            java.lang.Object r5 = r4.w0(r1, r5, r0)
            return r5
    }

    public final android.widget.TextView y(java.lang.Object r9, long r10) {
            r8 = this;
            r0 = 0
            r1 = 1
            r2 = 0
            if (r9 != 0) goto L8
        L5:
            r5 = r2
            goto L70
        L8:
            java.lang.Integer r3 = r8.p0()
            if (r3 == 0) goto L5
            java.lang.Class r4 = r9.getClass()
            java.util.ArrayList r4 = b0(r4)
            java.util.Iterator r4 = r4.iterator()
        L1a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L5
            java.lang.Object r5 = r4.next()
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            java.lang.Class[] r6 = r5.getParameterTypes()
            int r6 = r6.length
            if (r6 != r1) goto L6d
            java.lang.Class[] r6 = r5.getParameterTypes()
            r6 = r6[r0]
            java.lang.Class r7 = java.lang.Integer.TYPE
            boolean r6 = gg.l.a(r6, r7)
            if (r6 == 0) goto L6d
            java.lang.Class<android.view.View> r6 = android.view.View.class
            java.lang.Class r7 = r5.getReturnType()
            boolean r6 = r6.isAssignableFrom(r7)
            if (r6 != 0) goto L48
            goto L6d
        L48:
            r5.setAccessible(r1)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object[] r6 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r5 = r5.invoke(r9, r6)     // Catch: java.lang.Throwable -> L5a
            boolean r6 = r5 instanceof android.widget.TextView     // Catch: java.lang.Throwable -> L5a
            if (r6 == 0) goto L5c
            android.widget.TextView r5 = (android.widget.TextView) r5     // Catch: java.lang.Throwable -> L5a
            goto L64
        L5a:
            r5 = move-exception
            goto L5e
        L5c:
            r5 = r2
            goto L64
        L5e:
            sf.f r6 = new sf.f
            r6.<init>(r5)
            r5 = r6
        L64:
            boolean r6 = r5 instanceof sf.f
            if (r6 == 0) goto L6a
            r5 = r2
        L6a:
            android.widget.TextView r5 = (android.widget.TextView) r5
            goto L6e
        L6d:
            r5 = r2
        L6e:
            if (r5 == 0) goto L1a
        L70:
            if (r5 == 0) goto L73
            return r5
        L73:
            if (r9 == 0) goto L7a
            android.view.View r9 = r8.u(r9)
            goto L7b
        L7a:
            r9 = r2
        L7b:
            boolean r3 = r9 instanceof android.view.ViewGroup
            if (r3 == 0) goto L82
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            goto L83
        L82:
            r9 = r2
        L83:
            if (r9 == 0) goto L1ac
            android.content.res.Resources r3 = r9.getResources()     // Catch: java.lang.Throwable -> La4
            java.lang.String r4 = "j6q"
            java.lang.String r5 = "id"
            android.content.Context r6 = r9.getContext()     // Catch: java.lang.Throwable -> La4
            java.lang.String r6 = r6.getPackageName()     // Catch: java.lang.Throwable -> La4
            int r3 = r3.getIdentifier(r4, r5, r6)     // Catch: java.lang.Throwable -> La4
            if (r3 != 0) goto L9d
            r3 = r2
            goto Lab
        L9d:
            android.view.View r3 = r9.findViewById(r3)     // Catch: java.lang.Throwable -> La4
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch: java.lang.Throwable -> La4
            goto Lab
        La4:
            r3 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r3)
            r3 = r4
        Lab:
            boolean r4 = r3 instanceof sf.f
            if (r4 == 0) goto Lb1
            r3 = r2
        Lb1:
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto Lb6
            return r3
        Lb6:
            java.time.Instant r3 = java.time.Instant.ofEpochMilli(r10)
            java.time.ZoneId r4 = java.time.ZoneId.systemDefault()
            java.time.LocalDateTime r3 = java.time.LocalDateTime.ofInstant(r3, r4)
            java.time.LocalDate r4 = java.time.LocalDate.now()
            java.lang.String r5 = "HH:mm"
            java.lang.String[] r6 = new java.lang.String[]{r5}
            java.util.LinkedHashSet r6 = tf.d0.R(r6)
            java.time.LocalDate r7 = r3.toLocalDate()
            boolean r7 = gg.l.a(r7, r4)
            if (r7 != 0) goto Lee
            java.lang.String r7 = "M月d日 HH:mm"
            r6.add(r7)
            int r7 = r3.getYear()
            int r4 = r4.getYear()
            if (r7 == r4) goto Lee
            java.lang.String r4 = "yyyy年M月d日 HH:mm"
            r6.add(r4)
        Lee:
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            java.util.Iterator r6 = r6.iterator()
        Lf7:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L10f
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            java.time.format.DateTimeFormatter r7 = java.time.format.DateTimeFormatter.ofPattern(r7)
            java.lang.String r7 = r3.format(r7)
            r4.add(r7)
            goto Lf7
        L10f:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r6 = tf.n.e1(r4)
            r3.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L11c:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L130
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r6 = c0(r6)
            r3.add(r6)
            goto L11c
        L130:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L139:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L150
            java.lang.Object r6 = r3.next()
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            int r7 = r7.length()
            if (r7 <= 0) goto L139
            r4.add(r6)
            goto L139
        L150:
            java.util.Set r3 = tf.m.U1(r4)
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L15c
            r10 = r2
            goto L17b
        L15c:
            java.time.Instant r10 = java.time.Instant.ofEpochMilli(r10)
            java.time.ZoneId r11 = java.time.ZoneId.systemDefault()
            java.time.LocalDateTime r10 = java.time.LocalDateTime.ofInstant(r10, r11)
            java.time.format.DateTimeFormatter r11 = java.time.format.DateTimeFormatter.ofPattern(r5)
            java.lang.String r10 = r10.format(r11)
            m.b r11 = new m.b
            r4 = 10
            r11.<init>(r8, r3, r10, r4)
            android.widget.TextView r10 = v(r9, r11)
        L17b:
            if (r10 == 0) goto L17e
            return r10
        L17e:
            int[] r10 = new int[]{r0, r1, r1, r1, r1}
        L182:
            r11 = 5
            if (r0 >= r11) goto L1a5
            r11 = r10[r0]
            boolean r1 = r9 instanceof android.view.ViewGroup
            if (r1 == 0) goto L18e
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            goto L18f
        L18e:
            r9 = r2
        L18f:
            if (r9 == 0) goto L1a4
            if (r11 < 0) goto L1a4
            int r1 = r9.getChildCount()
            if (r11 < r1) goto L19a
            goto L1a4
        L19a:
            android.view.View r9 = r9.getChildAt(r11)
            r9.getClass()
            int r0 = r0 + 1
            goto L182
        L1a4:
            r9 = r2
        L1a5:
            boolean r10 = r9 instanceof android.widget.TextView
            if (r10 == 0) goto L1ac
            r2 = r9
            android.widget.TextView r2 = (android.widget.TextView) r2
        L1ac:
            return r2
    }

    public final void y0(android.view.View r6, android.widget.RelativeLayout r7) {
            r5 = this;
            java.util.WeakHashMap r0 = r5.f11675w
            monitor-enter(r0)
            java.util.WeakHashMap r1 = r5.f11675w     // Catch: java.lang.Throwable -> L3a
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L3a
            r1.getClass()     // Catch: java.lang.Throwable -> L3a
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L3a
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3a
            r2.<init>()     // Catch: java.lang.Throwable -> L3a
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L3a
        L17:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L3a
            if (r3 == 0) goto L44
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L3a
            r4 = r3
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> L3a
            r4.getClass()     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r4 = r4.getKey()     // Catch: java.lang.Throwable -> L3a
            android.widget.RelativeLayout r4 = (android.widget.RelativeLayout) r4     // Catch: java.lang.Throwable -> L3a
            if (r4 == r7) goto L3d
            r4.getClass()     // Catch: java.lang.Throwable -> L3a
            boolean r4 = P(r4, r6)     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L3d
            r4 = 1
            goto L3e
        L3a:
            r6 = move-exception
            goto L10a
        L3d:
            r4 = 0
        L3e:
            if (r4 == 0) goto L17
            r2.add(r3)     // Catch: java.lang.Throwable -> L3a
            goto L17
        L44:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3a
            int r7 = tf.n.e1(r2)     // Catch: java.lang.Throwable -> L3a
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L3a
            java.util.Iterator r7 = r2.iterator()     // Catch: java.lang.Throwable -> L3a
        L51:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto L6e
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Throwable -> L3a
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L3a
            sf.e r3 = new sf.e     // Catch: java.lang.Throwable -> L3a
            r3.<init>(r2, r1)     // Catch: java.lang.Throwable -> L3a
            r6.add(r3)     // Catch: java.lang.Throwable -> L3a
            goto L51
        L6e:
            java.util.Iterator r7 = r6.iterator()     // Catch: java.lang.Throwable -> L3a
        L72:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto L88
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Throwable -> L3a
            sf.e r1 = (sf.e) r1     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r1 = r1.f12418g     // Catch: java.lang.Throwable -> L3a
            android.widget.RelativeLayout r1 = (android.widget.RelativeLayout) r1     // Catch: java.lang.Throwable -> L3a
            java.util.WeakHashMap r2 = r5.f11675w     // Catch: java.lang.Throwable -> L3a
            r2.remove(r1)     // Catch: java.lang.Throwable -> L3a
            goto L72
        L88:
            monitor-exit(r0)
            java.util.Iterator r6 = r6.iterator()
        L8d:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L109
            java.lang.Object r7 = r6.next()
            sf.e r7 = (sf.e) r7
            java.lang.Object r0 = r7.f12418g
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            java.lang.Object r7 = r7.f12419h
            r9.s r7 = (r9.s) r7
            r0.getClass()
            r7.getClass()
            int r1 = r0.getPaddingTop()
            int r2 = r7.f11791c
            if (r1 != r2) goto Lb2
            int r1 = r7.f11789a
            goto Lb6
        Lb2:
            int r1 = r0.getPaddingTop()
        Lb6:
            int r2 = r0.getPaddingBottom()
            int r3 = r7.f11792d
            if (r2 != r3) goto Lc1
            int r2 = r7.f11790b
            goto Lc5
        Lc1:
            int r2 = r0.getPaddingBottom()
        Lc5:
            int r3 = r0.getPaddingTop()
            if (r1 != r3) goto Ld1
            int r3 = r0.getPaddingBottom()
            if (r2 == r3) goto Ldc
        Ld1:
            int r3 = r0.getPaddingLeft()
            int r4 = r0.getPaddingRight()
            r0.setPadding(r3, r1, r4, r2)
        Ldc:
            boolean r1 = r7.f11793e
            r0.setClipToPadding(r1)
            java.util.List r7 = r7.f11794f
            java.util.Iterator r7 = r7.iterator()
        Le7:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L8d
            java.lang.Object r0 = r7.next()
            r9.r r0 = (r9.r) r0
            java.lang.ref.WeakReference r1 = r0.f11787a
            java.lang.Object r1 = r1.get()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto Le7
            boolean r2 = r1.getClipChildren()
            if (r2 != 0) goto Le7
            boolean r0 = r0.f11788b
            r1.setClipChildren(r0)
            goto Le7
        L109:
            return
        L10a:
            monitor-exit(r0)
            throw r6
    }

    public final void z0(android.widget.TextView r8, android.view.ViewGroup r9, android.view.View r10, boolean r11, int r12) {
            r7 = this;
            r9.n r0 = new r9.n
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.util.WeakHashMap r8 = r1.f11677y
            boolean r8 = A0(r2, r3, r8, r0)
            if (r8 != 0) goto L17
            r8 = 0
            r2.setVisibility(r8)
        L17:
            return
    }
}
