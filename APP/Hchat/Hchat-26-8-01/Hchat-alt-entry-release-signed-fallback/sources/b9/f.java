package b9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r8.g f537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.Map f538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.content.SharedPreferences f539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.Object f541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public java.io.Serializable f542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public java.lang.Object f543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.lang.Object f544h;

    public f(r8.g r3) {
            r2 = this;
            r3.getClass()
            r2.<init>()
            r2.f537a = r3
            android.content.Context r3 = r3.f11620a
            java.lang.String r0 = "Hchat_chat_time_style_config"
            android.content.SharedPreferences r0 = ub.b.c(r3, r0)
            r2.f539c = r0
            java.lang.String r1 = "Hchat_chat_time_style_method_cache"
            android.content.SharedPreferences r3 = ub.b.c(r3, r1)
            r2.f541e = r3
            java.util.concurrent.ConcurrentHashMap r3 = new java.util.concurrent.ConcurrentHashMap
            r3.<init>()
            r2.f542f = r3
            java.util.concurrent.ConcurrentHashMap r3 = new java.util.concurrent.ConcurrentHashMap
            r3.<init>()
            r2.f543g = r3
            java.util.concurrent.ConcurrentHashMap$KeySetView r3 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            r2.f544h = r3
            java.util.Map r3 = p.a.p()
            r2.f538b = r3
            b9.b r3 = new b9.b
            r1 = 0
            r3.<init>(r2, r1)
            r0.registerOnSharedPreferenceChangeListener(r3)
            return
    }

    public f(r8.g r2, ab.b r3) {
            r1 = this;
            r2.getClass()
            r1.<init>()
            r1.f537a = r2
            r1.f541e = r3
            java.util.Map r3 = p.a.p()
            r1.f538b = r3
            ub.a r2 = r2.f11626g
            r2.getClass()
            android.content.Context r2 = r2.f13668a
            java.lang.String r3 = "Hchat_feature_"
            java.lang.String r0 = "real_name_tail_runtime"
            java.lang.String r3 = r3.concat(r0)
            android.content.SharedPreferences r2 = ub.b.c(r2, r3)
            r1.f539c = r2
            return
    }

    public static java.lang.String b() {
            o8.k r0 = h.Hchat.hooks.api.core.WeChatApis.version()
            if (r0 == 0) goto Ld
            l8.i r0 = r0.b()
            java.lang.String r0 = r0.f7929d
            goto Lf
        Ld:
            java.lang.String r0 = "unknown"
        Lf:
            java.lang.String r1 = "feature_"
            java.lang.String r2 = "_beforetransfer_class"
            java.lang.String r0 = eh.a.n(r1, r0, r2)
            return r0
    }

    public static long j(java.lang.Object r7) {
            java.lang.Class r0 = r7.getClass()
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]
            java.lang.String r3 = "getCreateTime"
            java.lang.reflect.Method r0 = h.Hchat.utils.KavaReflector.findMethod(r0, r3, r2)
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invoke(r0, r7, r2)
            java.lang.Long r0 = k(r0)
            r2 = 0
            if (r0 == 0) goto L24
            long r4 = r0.longValue()
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L24
            return r4
        L24:
            java.lang.String r0 = "field_createTime"
            java.lang.String r4 = "createTime"
            java.lang.String[] r0 = new java.lang.String[]{r0, r4}
        L2c:
            r4 = 2
            if (r1 < r4) goto L30
            return r2
        L30:
            r4 = r0[r1]
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.readField(r7, r4)
            java.lang.Long r4 = k(r4)
            if (r4 == 0) goto L45
            long r4 = r4.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L45
            return r4
        L45:
            int r1 = r1 + 1
            goto L2c
    }

    public static java.lang.Long k(java.lang.Object r2) {
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

    public static java.lang.Object l(int r9, java.lang.Object r10, java.util.Set r11) {
            r0 = 0
            if (r10 == 0) goto L139
            r1 = 4
            if (r9 > r1) goto L139
            boolean r1 = r11.add(r10)
            if (r1 != 0) goto Le
            goto L139
        Le:
            java.lang.String r1 = "com.tencent.mm.storage."
            r2 = 0
            boolean r1 = eh.a.z(r1, r10, r2)
            if (r1 != 0) goto L18
            goto L7e
        L18:
            long r3 = j(r10)
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L7e
            java.lang.String r1 = "getMsgId"
            java.lang.String r3 = "getMsgID"
            java.lang.String[] r1 = new java.lang.String[]{r1, r3}
            r3 = r2
        L2b:
            r4 = 2
            if (r3 < r4) goto L56
            java.lang.String r1 = "msgId"
            java.lang.String r3 = "msgID"
            java.lang.String r4 = "field_msgId"
            java.lang.String[] r4 = new java.lang.String[]{r4, r1, r3}
            r1 = r2
        L39:
            r3 = 3
            if (r1 < r3) goto L3e
            r7 = r5
            goto L76
        L3e:
            r3 = r4[r1]
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.readField(r10, r3)
            java.lang.Long r3 = k(r3)
            if (r3 == 0) goto L53
            long r7 = r3.longValue()
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r3 <= 0) goto L53
            goto L76
        L53:
            int r1 = r1 + 1
            goto L39
        L56:
            r4 = r1[r3]
            java.lang.Class r7 = r10.getClass()
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.reflect.Method r4 = h.Hchat.utils.KavaReflector.findMethod(r7, r4, r8)
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.invoke(r4, r10, r7)
            java.lang.Long r4 = k(r4)
            if (r4 == 0) goto L7b
            long r7 = r4.longValue()
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 <= 0) goto L7b
        L76:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 <= 0) goto L7e
            return r10
        L7b:
            int r3 = r3 + 1
            goto L2b
        L7e:
            boolean r1 = r10 instanceof java.lang.Object[]
            if (r1 == 0) goto L95
            java.lang.Object[] r10 = (java.lang.Object[]) r10
            int r1 = r10.length
        L85:
            if (r2 >= r1) goto L139
            r3 = r10[r2]
            int r4 = r9 + 1
            java.lang.Object r3 = l(r4, r3, r11)
            if (r3 == 0) goto L92
            return r3
        L92:
            int r2 = r2 + 1
            goto L85
        L95:
            boolean r1 = r10 instanceof java.util.Collection
            if (r1 == 0) goto Lb2
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L9f:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L139
            java.lang.Object r1 = r10.next()
            int r2 = r9 + 1
            java.lang.Object r1 = l(r2, r1, r11)
            if (r1 == 0) goto L9f
            return r1
        Lb2:
            java.lang.Class r1 = r10.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r3 = "java."
            boolean r3 = og.t.d0(r1, r3, r2)
            if (r3 != 0) goto L139
            java.lang.String r3 = "android."
            boolean r1 = og.t.d0(r1, r3, r2)
            if (r1 != 0) goto L139
            boolean r1 = r10 instanceof android.view.View
            if (r1 == 0) goto Lcf
            return r0
        Lcf:
            java.lang.Class r1 = r10.getClass()
        Ld3:
            if (r1 == 0) goto L139
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L139
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredFields(r1)
            java.util.Iterator r2 = r2.iterator()
        Le5:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L134
            java.lang.Object r3 = r2.next()
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            boolean r4 = h.Hchat.utils.KavaReflector.isStatic(r3)
            if (r4 != 0) goto Le5
            java.lang.Class r4 = r3.getType()
            boolean r4 = r4.isPrimitive()
            if (r4 != 0) goto Le5
            java.lang.Class r4 = r3.getType()
            boolean r4 = r4.isArray()
            if (r4 == 0) goto L10c
            goto Le5
        L10c:
            java.lang.Class r4 = r3.getType()
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            boolean r4 = gg.l.a(r4, r5)
            if (r4 != 0) goto Le5
            java.lang.Class<java.lang.Number> r4 = java.lang.Number.class
            java.lang.Class r5 = r3.getType()
            boolean r4 = r4.isAssignableFrom(r5)
            if (r4 == 0) goto L125
            goto Le5
        L125:
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.readField(r3, r10)
            if (r3 == 0) goto Le5
            int r4 = r9 + 1
            java.lang.Object r3 = l(r4, r3, r11)
            if (r3 == 0) goto Le5
            return r3
        L134:
            java.lang.Class r1 = r1.getSuperclass()
            goto Ld3
        L139:
            return r0
    }

    public void a(android.widget.TextView r5, b9.d r6, java.lang.String r7) {
            r4 = this;
            java.lang.String r0 = "hidden"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto Le
            r6 = 8
            r5.setVisibility(r6)
            return
        Le:
            java.lang.String r0 = "custom"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L7b
            int r7 = r6.f534c
            r5.setVisibility(r7)
            int r7 = r6.f534c
            if (r7 != 0) goto L75
            long r0 = r6.f532a
            r2 = 0
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 <= 0) goto L75
            android.content.SharedPreferences r6 = r4.f539c
            java.lang.String r7 = "chat_time_format"
            java.lang.String r2 = "yyyy-MM-dd HH:mm:ss"
            java.lang.String r6 = r6.getString(r7, r2)
            if (r6 != 0) goto L35
            java.lang.String r6 = ""
        L35:
            boolean r7 = og.m.t0(r6)
            if (r7 == 0) goto L3c
            r6 = r2
        L3c:
            java.text.SimpleDateFormat r7 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L4f
            java.util.Locale r3 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L4f
            r7.<init>(r6, r3)     // Catch: java.lang.Throwable -> L4f
            java.util.Date r6 = new java.util.Date     // Catch: java.lang.Throwable -> L4f
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r6 = r7.format(r6)     // Catch: java.lang.Throwable -> L4f
            goto L56
        L4f:
            r6 = move-exception
            sf.f r7 = new sf.f
            r7.<init>(r6)
            r6 = r7
        L56:
            java.lang.Throwable r7 = sf.g.b(r6)
            if (r7 != 0) goto L5d
            goto L6f
        L5d:
            java.text.SimpleDateFormat r6 = new java.text.SimpleDateFormat
            java.util.Locale r7 = java.util.Locale.getDefault()
            r6.<init>(r2, r7)
            java.util.Date r7 = new java.util.Date
            r7.<init>(r0)
            java.lang.String r6 = r6.format(r7)
        L6f:
            r6.getClass()
            java.lang.String r6 = (java.lang.String) r6
            goto L77
        L75:
            java.lang.String r6 = r6.f533b
        L77:
            r5.setText(r6)
            return
        L7b:
            java.lang.String r7 = r6.f533b
            r5.setText(r7)
            int r6 = r6.f534c
            r5.setVisibility(r6)
            return
    }

    public boolean c() {
            r5 = this;
            boolean r0 = r5.f540d
            r1 = 1
            if (r0 == 0) goto L12
            java.lang.Object r0 = r5.f543g
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            if (r0 == 0) goto L12
            java.lang.Object r0 = r5.f544h
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 == 0) goto L12
            return r1
        L12:
            r5.i()     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r0 = r5.f544h     // Catch: java.lang.Throwable -> L3d
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L26
            r8.i r2 = r8.i.f11631b     // Catch: java.lang.Throwable -> L3d
            b9.e r3 = new b9.e     // Catch: java.lang.Throwable -> L3d
            r4 = 2
            r3.<init>(r5, r4)     // Catch: java.lang.Throwable -> L3d
            r2.b(r0, r3)     // Catch: java.lang.Throwable -> L3d
        L26:
            java.lang.Object r0 = r5.f543g     // Catch: java.lang.Throwable -> L3d
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L33
            java.lang.Object r0 = r5.f544h     // Catch: java.lang.Throwable -> L3d
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L33
            goto L34
        L33:
            r1 = 0
        L34:
            r5.f540d = r1     // Catch: java.lang.Throwable -> L3d
            boolean r0 = r5.f540d     // Catch: java.lang.Throwable -> L3d
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L3d
            goto L44
        L3d:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L44:
            java.lang.Throwable r1 = sf.g.b(r0)
            if (r1 != 0) goto L4b
            goto L56
        L4b:
            java.lang.Object r0 = r5.f541e
            ab.b r0 = (ab.b) r0
            java.lang.String r2 = "实名查询初始化失败"
            r0.invoke(r2, r1)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        L56:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public java.lang.reflect.Field d(java.lang.Class r9) {
            r8 = this;
            java.io.Serializable r0 = r8.f542f
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r1 = r0.get(r9)
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            if (r1 == 0) goto Ld
            return r1
        Ld:
            r1 = r9
        Le:
            r2 = 0
            if (r1 == 0) goto L62
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L62
            java.util.List r3 = h.Hchat.utils.KavaReflector.declaredFields(r1)
            java.util.Iterator r3 = r3.iterator()
        L21:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L55
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            java.lang.String r6 = r5.getName()
            java.lang.String r7 = "itemView"
            boolean r6 = gg.l.a(r6, r7)
            if (r6 != 0) goto L49
            java.lang.Class r5 = r5.getType()
            java.lang.Class<android.view.View> r6 = android.view.View.class
            boolean r5 = gg.l.a(r5, r6)
            if (r5 == 0) goto L47
            goto L49
        L47:
            r5 = 0
            goto L4a
        L49:
            r5 = 1
        L4a:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L21
            r2 = r4
        L55:
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            if (r2 == 0) goto L5d
            r0.put(r9, r2)
            return r2
        L5d:
            java.lang.Class r1 = r1.getSuperclass()
            goto Le
        L62:
            return r2
    }

    public android.view.View e(java.lang.Object r4) {
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
            java.lang.reflect.Field r0 = r3.d(r0)
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.readField(r0, r4)
            boolean r0 = r4 instanceof android.view.View
            if (r0 == 0) goto L25
            android.view.View r4 = (android.view.View) r4
            return r4
        L25:
            return r2
    }

    public android.widget.TextView f(java.lang.Object r10) {
            r9 = this;
            java.lang.Object r0 = r9.f544h
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = (java.util.concurrent.ConcurrentHashMap.KeySetView) r0
            java.lang.Object r1 = r9.f543g
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.Class r2 = r10.getClass()
            java.lang.Object r2 = r1.get(r2)
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            r3 = 0
            if (r2 == 0) goto L20
            java.lang.Object r10 = h.Hchat.utils.KavaReflector.readField(r2, r10)
            boolean r0 = r10 instanceof android.widget.TextView
            if (r0 == 0) goto L83
            android.widget.TextView r10 = (android.widget.TextView) r10
            return r10
        L20:
            java.lang.Class r2 = r10.getClass()
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L2b
            goto L83
        L2b:
            java.lang.Class r2 = r10.getClass()
        L2f:
            if (r2 == 0) goto L89
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L89
            java.util.List r4 = h.Hchat.utils.KavaReflector.declaredFields(r2)
            java.util.Iterator r4 = r4.iterator()
        L41:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L6c
            java.lang.Object r5 = r4.next()
            r6 = r5
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            java.lang.String r7 = r6.getName()
            java.lang.String r8 = "timeTV"
            boolean r7 = gg.l.a(r7, r8)
            if (r7 == 0) goto L68
            java.lang.Class<android.widget.TextView> r7 = android.widget.TextView.class
            java.lang.Class r6 = r6.getType()
            boolean r6 = r7.isAssignableFrom(r6)
            if (r6 == 0) goto L68
            r6 = 1
            goto L69
        L68:
            r6 = 0
        L69:
            if (r6 == 0) goto L41
            goto L6d
        L6c:
            r5 = r3
        L6d:
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            if (r5 == 0) goto L84
            java.lang.Class r0 = r10.getClass()
            r1.put(r0, r5)
            java.lang.Object r10 = h.Hchat.utils.KavaReflector.readField(r5, r10)
            boolean r0 = r10 instanceof android.widget.TextView
            if (r0 == 0) goto L83
            android.widget.TextView r10 = (android.widget.TextView) r10
            return r10
        L83:
            return r3
        L84:
            java.lang.Class r2 = r2.getSuperclass()
            goto L2f
        L89:
            java.lang.Class r10 = r10.getClass()
            r0.add(r10)
            return r3
    }

    public boolean g(java.lang.reflect.Method r9) {
            r8 = this;
            java.lang.Class[] r0 = r9.getParameterTypes()
            java.lang.Class r9 = r9.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            boolean r9 = gg.l.a(r9, r1)
            r1 = 0
            if (r9 == 0) goto L93
            int r9 = r0.length
            r2 = 3
            if (r9 < r2) goto L93
            int r9 = r0.length
            r2 = r1
        L17:
            if (r2 >= r9) goto L93
            r3 = r0[r2]
            java.lang.Class r4 = java.lang.Integer.TYPE
            boolean r4 = gg.l.a(r3, r4)
            r5 = 1
            if (r4 != 0) goto L2f
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto L2d
            goto L2f
        L2d:
            r3 = r1
            goto L30
        L2f:
            r3 = r5
        L30:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L90
            int r9 = r0.length
            r2 = r1
        L3c:
            if (r2 >= r9) goto L93
            r3 = r0[r2]
            java.lang.reflect.Field r4 = r8.d(r3)
            if (r4 == 0) goto L48
        L46:
            r3 = r5
            goto L82
        L48:
            if (r3 == 0) goto L81
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L81
            java.util.List r4 = h.Hchat.utils.KavaReflector.declaredFields(r3)
            if (r4 == 0) goto L5f
            boolean r6 = r4.isEmpty()
            if (r6 == 0) goto L5f
            goto L7c
        L5f:
            java.util.Iterator r4 = r4.iterator()
        L63:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L7c
            java.lang.Object r6 = r4.next()
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            java.lang.Class<android.view.View> r7 = android.view.View.class
            java.lang.Class r6 = r6.getType()
            boolean r6 = r7.isAssignableFrom(r6)
            if (r6 == 0) goto L63
            goto L46
        L7c:
            java.lang.Class r3 = r3.getSuperclass()
            goto L48
        L81:
            r3 = r1
        L82:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L8d
            return r5
        L8d:
            int r2 = r2 + 1
            goto L3c
        L90:
            int r2 = r2 + 1
            goto L17
        L93:
            return r1
    }

    public java.lang.reflect.Method h() {
            r11 = this;
            java.lang.Object r0 = r11.f541e
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            r8.g r1 = r11.f537a
            android.content.Context r2 = r1.f11620a
            java.lang.ClassLoader r3 = r1.f11622c
            r3.getClass()
            l8.i r2 = o8.k.a(r2, r3)
            java.lang.String r2 = r2.f7933h
            boolean r4 = og.m.t0(r2)
            r5 = 0
            if (r4 != 0) goto L1b
            goto L1c
        L1b:
            r2 = r5
        L1c:
            if (r2 == 0) goto L25
            java.lang.String r4 = "|chat_time_style_v1"
            java.lang.String r2 = r2.concat(r4)
            goto L26
        L25:
            r2 = r5
        L26:
            java.lang.String r4 = ""
            if (r2 != 0) goto L2b
            r2 = r4
        L2b:
            java.lang.String r6 = "chat_time_bind"
            java.lang.reflect.Method r7 = e8.b.c(r0, r2, r3, r6)
            if (r7 == 0) goto L3e
            boolean r8 = r11.g(r7)
            if (r8 == 0) goto L3a
            goto L3b
        L3a:
            r7 = r5
        L3b:
            if (r7 == 0) goto L3e
            return r7
        L3e:
            org.luckypray.dexkit.DexKitBridge r1 = r1.f11623d     // Catch: java.lang.Throwable -> L8e
            ch.e r7 = new ch.e     // Catch: java.lang.Throwable -> L8e
            r7.<init>()     // Catch: java.lang.Throwable -> L8e
            fh.k r8 = new fh.k     // Catch: java.lang.Throwable -> L8e
            r8.<init>()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r9 = "MicroMsg.MvvmChattingItem"
            java.lang.String r10 = "[onBindView]"
            java.lang.String[] r9 = new java.lang.String[]{r9, r10}     // Catch: java.lang.Throwable -> L8e
            java.util.List r9 = a.a.y0(r9)     // Catch: java.lang.Throwable -> L8e
            fh.k.u0(r8, r9)     // Catch: java.lang.Throwable -> L8e
            r7.f1666h = r8     // Catch: java.lang.Throwable -> L8e
            hh.p r1 = r1.findMethod(r7)     // Catch: java.lang.Throwable -> L8e
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8e
            r7.<init>()     // Catch: java.lang.Throwable -> L8e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L8e
        L68:
            boolean r8 = r1.hasNext()     // Catch: java.lang.Throwable -> L8e
            if (r8 == 0) goto L94
            java.lang.Object r8 = r1.next()     // Catch: java.lang.Throwable -> L8e
            hh.o r8 = (hh.o) r8     // Catch: java.lang.Throwable -> L8e
            java.lang.reflect.Method r8 = r8.r(r3)     // Catch: java.lang.Throwable -> L79
            goto L80
        L79:
            r8 = move-exception
            sf.f r9 = new sf.f     // Catch: java.lang.Throwable -> L8e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L8e
            r8 = r9
        L80:
            boolean r9 = r8 instanceof sf.f     // Catch: java.lang.Throwable -> L8e
            if (r9 == 0) goto L86
            r8 = r5
        L86:
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8     // Catch: java.lang.Throwable -> L8e
            if (r8 == 0) goto L68
            r7.add(r8)     // Catch: java.lang.Throwable -> L8e
            goto L68
        L8e:
            r1 = move-exception
            sf.f r7 = new sf.f
            r7.<init>(r1)
        L94:
            java.lang.Throwable r1 = sf.g.b(r7)
            if (r1 != 0) goto L9b
            goto La6
        L9b:
            java.lang.String r3 = r1.getMessage()
            java.lang.String r7 = "[Hchat:ChatTimeStyle] 定位聊天时间绑定方法异常: "
            eh.a.x(r7, r3, r1)
            tf.t r7 = tf.t.f13167g
        La6:
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r1 = r7.iterator()
        Lac:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lc0
            java.lang.Object r3 = r1.next()
            r7 = r3
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            boolean r7 = r11.g(r7)
            if (r7 == 0) goto Lac
            r5 = r3
        Lc0:
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            if (r5 == 0) goto Lc8
            e8.b.h(r0, r2, r6, r5)
            goto Le6
        Lc8:
            java.lang.String r1 = "cache.key"
            android.content.SharedPreferences$Editor r3 = r0.edit()     // Catch: java.lang.Throwable -> Le6
            java.lang.String r0 = r0.getString(r1, r4)     // Catch: java.lang.Throwable -> Le6
            boolean r0 = gg.l.a(r0, r2)     // Catch: java.lang.Throwable -> Le6
            if (r0 != 0) goto Ldf
            android.content.SharedPreferences$Editor r0 = r3.clear()     // Catch: java.lang.Throwable -> Le6
            r0.putString(r1, r2)     // Catch: java.lang.Throwable -> Le6
        Ldf:
            android.content.SharedPreferences$Editor r0 = r3.remove(r6)     // Catch: java.lang.Throwable -> Le6
            r0.apply()     // Catch: java.lang.Throwable -> Le6
        Le6:
            return r5
    }

    public void i() {
            r6 = this;
            r0 = 0
            r6.f542f = r0
            r6.f543g = r0
            r6.f544h = r0
            java.lang.String r0 = b()
            android.content.SharedPreferences r1 = r6.f539c
            java.lang.String r2 = ""
            java.lang.String r0 = r1.getString(r0, r2)
            if (r0 == 0) goto L16
            r2 = r0
        L16:
            r8.g r0 = r6.f537a
            java.lang.ClassLoader r3 = r0.f11622c
            java.lang.ClassLoader r4 = r0.f11622c
            java.lang.Class r2 = h.Hchat.utils.KavaReflector.loadClass(r2, r3)
            if (r2 == 0) goto L25
            r6.m(r2)
        L25:
            java.io.Serializable r2 = r6.f542f
            java.lang.Class r2 = (java.lang.Class) r2
            if (r2 != 0) goto L77
            org.luckypray.dexkit.DexKitBridge r0 = r0.f11623d     // Catch: java.lang.Throwable -> L47
            ch.c r2 = new ch.c     // Catch: java.lang.Throwable -> L47
            r2.<init>()     // Catch: java.lang.Throwable -> L47
            fh.a r3 = new fh.a     // Catch: java.lang.Throwable -> L47
            r3.<init>()     // Catch: java.lang.Throwable -> L47
            java.lang.String r5 = "/cgi-bin/mmpay-bin/beforetransfer"
            java.util.List r5 = a.a.x0(r5)     // Catch: java.lang.Throwable -> L47
            fh.a.r0(r3, r5)     // Catch: java.lang.Throwable -> L47
            r2.f1664h = r3     // Catch: java.lang.Throwable -> L47
            hh.j r0 = r0.findClass(r2)     // Catch: java.lang.Throwable -> L47
            goto L4e
        L47:
            r0 = move-exception
            sf.f r2 = new sf.f
            r2.<init>(r0)
            r0 = r2
        L4e:
            boolean r2 = r0 instanceof sf.f
            if (r2 == 0) goto L55
            tf.t r0 = tf.t.f13167g
        L55:
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
        L5b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L77
            java.lang.Object r2 = r0.next()
            hh.i r2 = (hh.i) r2
            lh.a r2 = r2.p()
            java.lang.String r2 = r2.f8057g
            java.lang.Class r2 = h.Hchat.utils.KavaReflector.loadClass(r2, r4)
            boolean r2 = r6.m(r2)
            if (r2 == 0) goto L5b
        L77:
            java.io.Serializable r0 = r6.f542f
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 != 0) goto L86
            java.lang.String r0 = "com.tencent.mm.plugin.remittance.model.i"
            java.lang.Class r0 = h.Hchat.utils.KavaReflector.loadClass(r0, r4)
            r6.m(r0)
        L86:
            java.io.Serializable r0 = r6.f542f
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto Le9
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r2 = b()
            java.lang.String r3 = r0.getName()
            android.content.SharedPreferences$Editor r1 = r1.putString(r2, r3)
            r1.apply()
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredMethods(r0)
            java.util.Iterator r0 = r0.iterator()
        La7:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Le9
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.Class[] r2 = r1.getParameterTypes()
            int r3 = r2.length
            r4 = 4
            if (r3 < r4) goto La7
            r3 = 0
            r3 = r2[r3]
            java.lang.Class r4 = java.lang.Integer.TYPE
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto La7
            r3 = 1
            r3 = r2[r3]
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto La7
            r3 = 2
            r3 = r2[r3]
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto La7
            r3 = 3
            r2 = r2[r3]
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            boolean r2 = gg.l.a(r2, r3)
            if (r2 == 0) goto La7
            java.lang.reflect.Method r0 = h.Hchat.utils.KavaReflector.accessible(r1)
            r6.f544h = r0
        Le9:
            return
    }

    public boolean m(java.lang.Class r7) {
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredConstructors(r7)
            java.util.Iterator r1 = r1.iterator()
        Lc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Constructor r2 = (java.lang.reflect.Constructor) r2
            java.lang.Class[] r3 = r2.getParameterTypes()
            int r4 = r3.length
            r5 = 2
            if (r4 != r5) goto Lc
            r4 = r3[r0]
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            boolean r4 = gg.l.a(r4, r5)
            if (r4 == 0) goto Lc
            r4 = 1
            r3 = r3[r4]
            boolean r3 = gg.l.a(r3, r5)
            if (r3 == 0) goto Lc
            r6.f542f = r7
            java.lang.reflect.Constructor r7 = h.Hchat.utils.KavaReflector.accessible(r2)
            r6.f543g = r7
            return r4
        L3c:
            return r0
    }
}
