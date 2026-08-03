package xa;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r8.g f21445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ia.t f21446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.content.SharedPreferences f21447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.os.Handler f21448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap.KeySetView f21449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.util.Map f21450f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.util.Map f21451g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile xa.i f21452h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final java.util.Map f21453i;

    public m(r8.g r2, ia.t r3) {
            r1 = this;
            r2.getClass()
            r1.<init>()
            r1.f21445a = r2
            r1.f21446b = r3
            android.content.Context r2 = r2.f11620a
            java.lang.String r3 = "Hchat_quick_contact_edit_config"
            android.content.SharedPreferences r2 = ub.b.c(r2, r3)
            r1.f21447c = r2
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r3.<init>(r0)
            r1.f21448d = r3
            java.util.concurrent.ConcurrentHashMap$KeySetView r3 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            r1.f21449e = r3
            java.util.Map r3 = p.a.p()
            r1.f21450f = r3
            java.util.Map r3 = p.a.p()
            r1.f21451g = r3
            java.util.Map r3 = p.a.p()
            r1.f21453i = r3
            b9.b r3 = new b9.b
            r0 = 11
            r3.<init>(r1, r0)
            r2.registerOnSharedPreferenceChangeListener(r3)
            return
    }

    public static boolean a(android.app.Activity r1) {
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto Le
            boolean r1 = r1.isDestroyed()
            if (r1 != 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public static android.app.Activity c(android.content.Context r1) {
        L0:
            boolean r0 = r1 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L17
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto Lb
            android.app.Activity r1 = (android.app.Activity) r1
            return r1
        Lb:
            r0 = r1
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            if (r0 != r1) goto L15
            goto L17
        L15:
            r1 = r0
            goto L0
        L17:
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L1e
            android.app.Activity r1 = (android.app.Activity) r1
            return r1
        L1e:
            r1 = 0
            return r1
    }

    public static java.lang.String d(int r7, java.lang.Object r8, java.util.Set r9) {
            r0 = 0
            if (r8 == 0) goto L117
            r1 = 3
            if (r7 > r1) goto L117
            boolean r2 = r9.add(r8)
            if (r2 != 0) goto Le
            goto L117
        Le:
            java.lang.Class r2 = r8.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "com.tencent.mm.plugin.sns.storage.SnsInfo"
            boolean r2 = r2.equals(r3)
            r3 = 0
            java.lang.String r4 = "getUserName"
            if (r2 == 0) goto L4b
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invokeMethod(r8, r4, r2)
            if (r2 == 0) goto L2a
            goto L30
        L2a:
            java.lang.String r2 = "field_userName"
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r8, r2)
        L30:
            if (r2 == 0) goto L49
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L49
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L49
            int r4 = r2.length()
            if (r4 <= 0) goto L49
            goto L91
        L49:
            r2 = r0
            goto L91
        L4b:
            java.lang.Class r2 = r8.getClass()
            java.lang.Class[] r5 = new java.lang.Class[r3]
            java.lang.reflect.Method r2 = h.Hchat.utils.KavaReflector.findMethodRecursive(r2, r4, r5)
            if (r2 == 0) goto L49
            java.lang.Class[] r4 = r2.getParameterTypes()
            r4.getClass()
            int r4 = r4.length
            if (r4 != 0) goto L6e
            java.lang.Class r4 = r2.getReturnType()
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            boolean r4 = gg.l.a(r4, r5)
            if (r4 == 0) goto L6e
            goto L6f
        L6e:
            r2 = r0
        L6f:
            if (r2 == 0) goto L49
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invoke(r2, r8, r4)
            boolean r4 = r2 instanceof java.lang.String
            if (r4 == 0) goto L7e
            java.lang.String r2 = (java.lang.String) r2
            goto L7f
        L7e:
            r2 = r0
        L7f:
            if (r2 == 0) goto L49
            java.lang.CharSequence r2 = og.m.R0(r2)
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L49
            int r4 = r2.length()
            if (r4 <= 0) goto L49
        L91:
            if (r2 == 0) goto L94
            return r2
        L94:
            if (r7 != r1) goto L98
            goto L117
        L98:
            java.lang.Class r1 = r8.getClass()
        L9c:
            if (r1 == 0) goto L117
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L117
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredFields(r1)
            java.util.Iterator r2 = r2.iterator()
        Lae:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L112
            java.lang.Object r4 = r2.next()
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            int r5 = r4.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)
            if (r5 != 0) goto Lae
            java.lang.Class r5 = r4.getType()
            boolean r5 = r5.isPrimitive()
            if (r5 == 0) goto Lcf
            goto Lae
        Lcf:
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.readField(r4, r8)
            if (r4 == 0) goto Lae
            java.lang.Class r5 = r4.getClass()
            java.lang.String r5 = r5.getName()
            boolean r6 = r4 instanceof java.lang.String
            if (r6 != 0) goto Lae
            java.lang.String r6 = "android."
            boolean r6 = og.t.d0(r5, r6, r3)
            if (r6 != 0) goto Lae
            java.lang.String r6 = "androidx."
            boolean r6 = og.t.d0(r5, r6, r3)
            if (r6 != 0) goto Lae
            java.lang.String r6 = "java."
            boolean r6 = og.t.d0(r5, r6, r3)
            if (r6 != 0) goto Lae
            java.lang.String r6 = "kotlin."
            boolean r6 = og.t.d0(r5, r6, r3)
            if (r6 != 0) goto Lae
            java.lang.String r6 = "kotlinx."
            boolean r5 = og.t.d0(r5, r6, r3)
            if (r5 != 0) goto Lae
            int r5 = r7 + 1
            java.lang.String r4 = d(r5, r4, r9)
            if (r4 == 0) goto Lae
            return r4
        L112:
            java.lang.Class r1 = r1.getSuperclass()
            goto L9c
        L117:
            return r0
    }

    public static boolean f(java.lang.String r5) {
            boolean r0 = og.m.t0(r5)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto La
            r0 = r2
            goto L33
        La:
            g8.i r0 = h.Hchat.hooks.api.core.WeChatApis.contacts()     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1a
            boolean r0 = r0.H(r5)     // Catch: java.lang.Throwable -> L18
            if (r0 != r1) goto L1a
            r0 = r1
            goto L1b
        L18:
            r0 = move-exception
            goto L20
        L1a:
            r0 = r2
        L1b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L18
            goto L26
        L20:
            sf.f r3 = new sf.f
            r3.<init>(r0)
            r0 = r3
        L26:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            boolean r4 = r0 instanceof sf.f
            if (r4 == 0) goto L2d
            r0 = r3
        L2d:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
        L33:
            if (r0 == 0) goto L36
            return r1
        L36:
            java.lang.String r0 = "@openim"
            boolean r0 = og.t.W(r5, r0, r1)
            if (r0 != 0) goto L3f
            goto L6c
        L3f:
            g8.k r0 = h.Hchat.hooks.api.core.WeChatApis.users()
            if (r0 == 0) goto L69
            g8.a r0 = r0.f4386a
            java.lang.String r0 = r0.c()
            if (r0 == 0) goto L4e
            goto L50
        L4e:
            java.lang.String r0 = ""
        L50:
            boolean r3 = android.text.TextUtils.isEmpty(r5)
            if (r3 != 0) goto L64
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L64
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L64
            r0 = r1
            goto L65
        L64:
            r0 = r2
        L65:
            if (r0 != r1) goto L69
            r0 = r1
            goto L6a
        L69:
            r0 = r2
        L6a:
            if (r0 == 0) goto L6d
        L6c:
            return r2
        L6d:
            g8.i r0 = h.Hchat.hooks.api.core.WeChatApis.contacts()     // Catch: java.lang.Throwable -> L8d
            if (r0 == 0) goto L88
            h.Hchat.hooks.api.model.WeChatContact r5 = r0.n(r5)     // Catch: java.lang.Throwable -> L8d
            if (r5 == 0) goto L88
            boolean r0 = r5.isGroup()     // Catch: java.lang.Throwable -> L8d
            if (r0 != 0) goto L86
            boolean r5 = r5.isOfficialAccount()     // Catch: java.lang.Throwable -> L8d
            if (r5 != 0) goto L86
            goto L87
        L86:
            r1 = r2
        L87:
            r2 = r1
        L88:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L8d
            goto L94
        L8d:
            r5 = move-exception
            sf.f r0 = new sf.f
            r0.<init>(r5)
            r5 = r0
        L94:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r1 = r5 instanceof sf.f
            if (r1 == 0) goto L9b
            r5 = r0
        L9b:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
    }

    public final boolean b() {
            r3 = this;
            java.lang.String r0 = "quick_contact_edit_enable"
            r1 = 0
            android.content.SharedPreferences r2 = r3.f21447c
            boolean r0 = r2.getBoolean(r0, r1)
            return r0
    }

    public final boolean e(java.lang.reflect.Method r4, de.robv.android.xposed.XC_MethodHook r5) {
            r3 = this;
            int r0 = r4.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            if (r0 != 0) goto L60
            java.lang.Class r0 = r4.getDeclaringClass()
            boolean r0 = r0.isInterface()
            if (r0 == 0) goto L15
            goto L60
        L15:
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = r3.f21449e
            boolean r1 = r0.add(r4)
            if (r1 != 0) goto L1f
            r4 = 1
            return r4
        L1f:
            r8.i r1 = r8.i.f11631b     // Catch: java.lang.Throwable -> L2f
            java.lang.reflect.Method r2 = h.Hchat.utils.KavaReflector.accessible(r4)     // Catch: java.lang.Throwable -> L2f
            if (r2 == 0) goto L28
            goto L29
        L28:
            r2 = r4
        L29:
            r1.b(r2, r5)     // Catch: java.lang.Throwable -> L2f
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L2f
            goto L36
        L2f:
            r5 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r5)
            r5 = r1
        L36:
            java.lang.Throwable r1 = sf.g.b(r5)
            if (r1 != 0) goto L3d
            goto L59
        L3d:
            r0.remove(r4)
            java.lang.String r4 = r4.toGenericString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "安装快捷设置 Hook 失败: "
            r5.<init>(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            ia.t r5 = r3.f21446b
            r5.invoke(r4, r1)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
        L59:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r4 = r5.booleanValue()
            return r4
        L60:
            r4 = 0
            return r4
    }

    public final void g(android.app.Activity r9, java.lang.String r10, fg.a r11) {
            r8 = this;
            boolean r0 = a(r9)
            if (r0 != 0) goto L7
            return
        L7:
            k.s1 r0 = new k.s1
            r1 = 7
            r0.<init>(r1)
            java.lang.String r1 = "设置备注和标签"
            wb.kv r5 = wb.y2.X1(r9, r0, r1, r10)
            java.lang.Thread r10 = new java.lang.Thread
            b9.c r2 = new b9.c
            r7 = 27
            r4 = r8
            r6 = r9
            r3 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            java.lang.String r9 = "Hchat-QuickContactUpdate"
            r10.<init>(r2, r9)
            r10.start()
            return
    }

    public final android.view.View.OnLongClickListener h(android.view.View r3) {
            r2 = this;
            java.util.Map r0 = r2.f21453i
            r0.getClass()
            monitor-enter(r0)
            java.util.Map r1 = r2.f21453i     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r1.remove(r3)     // Catch: java.lang.Throwable -> L20
            xa.h r1 = (xa.h) r1     // Catch: java.lang.Throwable -> L20
            monitor-exit(r0)
            if (r1 == 0) goto L1e
            android.view.View$OnLongClickListener r0 = r1.f21436c     // Catch: java.lang.Throwable -> L1b
            r3.setOnLongClickListener(r0)     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r1.f21437d     // Catch: java.lang.Throwable -> L1b
            r3.setLongClickable(r0)     // Catch: java.lang.Throwable -> L1b
        L1b:
            android.view.View$OnLongClickListener r3 = r1.f21436c
            return r3
        L1e:
            r3 = 0
            return r3
        L20:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    public final void i(xa.i r9) {
            r8 = this;
            android.app.Activity r1 = r9.f21438a
            java.lang.String r2 = r9.f21439b
            boolean r0 = a(r1)
            if (r0 != 0) goto Lc
            goto L8c
        Lc:
            g8.i r3 = h.Hchat.hooks.api.core.WeChatApis.contacts()
            if (r3 == 0) goto L8c
            h.Hchat.hooks.api.model.WeChatContact r0 = r3.n(r2)     // Catch: java.lang.Throwable -> L17
            goto L1e
        L17:
            r0 = move-exception
            sf.f r4 = new sf.f
            r4.<init>(r0)
            r0 = r4
        L1e:
            boolean r4 = r0 instanceof sf.f
            r5 = 0
            if (r4 == 0) goto L25
            r0 = r5
        L25:
            h.Hchat.hooks.api.model.WeChatContact r0 = (h.Hchat.hooks.api.model.WeChatContact) r0
            if (r0 == 0) goto L8c
            boolean r3 = r3.H(r2)
            if (r3 != 0) goto L3c
            boolean r3 = r9.f21440c
            if (r3 == 0) goto L3a
            boolean r2 = f(r2)
            if (r2 == 0) goto L3a
            goto L3c
        L3a:
            r2 = 0
            goto L3d
        L3c:
            r2 = 1
        L3d:
            if (r2 == 0) goto L40
            r5 = r0
        L40:
            if (r5 == 0) goto L8c
            java.lang.String r0 = r5.remarkName
            boolean r2 = og.m.t0(r0)
            if (r2 == 0) goto L4c
            java.lang.String r0 = "未设置"
        L4c:
            java.lang.String r3 = r5.displayName()
            java.lang.String r2 = "当前备注："
            java.lang.String r0 = r2.concat(r0)
            sf.e r2 = new sf.e
            java.lang.String r4 = "修改备注"
            r2.<init>(r4, r0)
            sf.e r0 = new sf.e
            java.lang.String r4 = "设置好友标签"
            java.lang.String r6 = "勾选、取消或清空已有标签"
            r0.<init>(r4, r6)
            sf.e r4 = new sf.e
            java.lang.String r6 = "新建并添加标签"
            java.lang.String r7 = "创建微信好友标签并添加给该好友"
            r4.<init>(r6, r7)
            sf.e[] r0 = new sf.e[]{r2, r0, r4}
            java.util.List r4 = a.a.y0(r0)
            r0 = r5
            wb.dj r5 = new wb.dj
            r2 = 11
            r5.<init>(r8, r9, r0, r2)
            k.s1 r6 = new k.s1
            r9 = 7
            r6.<init>(r9)
            wb.lv r7 = wb.lv.f17583j
            java.lang.String r2 = "设置备注和标签"
            wb.y2.Q1(r1, r2, r3, r4, r5, r6, r7)
        L8c:
            return
    }
}
