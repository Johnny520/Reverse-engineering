package l9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final java.util.List f7939h = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r8.g f7940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ia.t f7941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.content.SharedPreferences f7942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.content.SharedPreferences f7943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap.KeySetView f7944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f7945f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f7946g;

    static {
            java.lang.String r0 = "com.tencent.mm.ui.mvvm.MvvmSelectContactUI"
            java.lang.String r1 = "com.tencent.mm.ui.mvvm.MvvmContactListUI"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = a.a.y0(r0)
            l9.d.f7939h = r0
            return
    }

    public d(r8.g r1, ia.t r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f7940a = r1
            r0.f7941b = r2
            android.content.Context r1 = r1.f11620a
            java.lang.String r2 = "Hchat_remove_forward_limit_config"
            android.content.SharedPreferences r2 = ub.b.c(r1, r2)
            r0.f7942c = r2
            java.lang.String r2 = "Hchat_remove_forward_limit_method_cache"
            android.content.SharedPreferences r1 = ub.b.c(r1, r2)
            r0.f7943d = r1
            java.util.concurrent.ConcurrentHashMap$KeySetView r1 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            r0.f7944e = r1
            return
    }

    public static boolean c(java.lang.reflect.Method r5) {
            java.lang.Class[] r0 = r5.getParameterTypes()
            java.lang.Class r1 = r5.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.tencent.mm.ui.transmit.SelectConversationUI"
            boolean r1 = r1.equals(r2)
            r2 = 0
            if (r1 == 0) goto L42
            java.lang.Class r1 = r5.getReturnType()
            java.lang.Class r3 = java.lang.Boolean.TYPE
            boolean r1 = gg.l.a(r1, r3)
            if (r1 == 0) goto L42
            int r1 = r0.length
            r4 = 1
            if (r1 != r4) goto L42
            r0 = r0[r2]
            boolean r0 = gg.l.a(r0, r3)
            if (r0 == 0) goto L42
            int r0 = r5.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L42
            int r5 = r5.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isAbstract(r5)
            if (r5 != 0) goto L42
            return r4
        L42:
            return r2
    }

    public static boolean d(java.lang.reflect.Method r2) {
            java.lang.Class[] r0 = r2.getParameterTypes()
            r0.getClass()
            int r0 = r0.length
            if (r0 != 0) goto L36
            java.lang.Class r0 = r2.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L36
            java.lang.Class r0 = r2.getReturnType()
            boolean r0 = r0.isPrimitive()
            if (r0 != 0) goto L36
            int r0 = r2.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L36
            int r2 = r2.getModifiers()
            boolean r2 = java.lang.reflect.Modifier.isAbstract(r2)
            if (r2 != 0) goto L36
            r2 = 1
            return r2
        L36:
            r2 = 0
            return r2
    }

    public static void h(android.content.Intent r3) {
            java.lang.String r0 = "list_type"
            r1 = -1
            int r0 = r3.getIntExtra(r0, r1)
            r2 = 14
            if (r0 == r2) goto L24
            java.lang.String r0 = "ForwardParams_ForwardByUIC"
            r2 = 0
            boolean r0 = r3.getBooleanExtra(r0, r2)
            if (r0 != 0) goto L24
            java.lang.String r0 = "Retr_Msg_Id"
            boolean r0 = r3.hasExtra(r0)
            if (r0 != 0) goto L24
            java.lang.String r0 = "Retr_Msg_view_model"
            boolean r0 = r3.hasExtra(r0)
            if (r0 == 0) goto L2e
        L24:
            java.lang.String r0 = "max_limit_num"
            int r1 = r3.getIntExtra(r0, r1)
            r2 = 9
            if (r1 == r2) goto L2f
        L2e:
            return
        L2f:
            r1 = 2147483647(0x7fffffff, float:NaN)
            r3.putExtra(r0, r1)
            java.lang.String r0 = "too_many_member_tip_string"
            r3.removeExtra(r0)
            return
    }

    public final boolean a(java.lang.reflect.Method r5, java.lang.String r6, fg.l r7) {
            r4 = this;
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = r4.f7944e
            boolean r1 = r0.add(r5)
            if (r1 != 0) goto La
            r5 = 1
            return r5
        La:
            r8.i r1 = r8.i.f11631b     // Catch: java.lang.Throwable -> L18
            l9.c r2 = new l9.c     // Catch: java.lang.Throwable -> L18
            r3 = 0
            r2.<init>(r7, r3)     // Catch: java.lang.Throwable -> L18
            r1.b(r5, r2)     // Catch: java.lang.Throwable -> L18
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L18
            goto L1f
        L18:
            r7 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r7)
            r7 = r1
        L1f:
            java.lang.Throwable r1 = sf.g.b(r7)
            if (r1 != 0) goto L26
            goto L48
        L26:
            r0.remove(r5)
            java.lang.String r5 = r5.toGenericString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            java.lang.String r6 = " Hook 安装失败: "
            r7.append(r6)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            ia.t r6 = r4.f7941b
            r6.invoke(r5, r1)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
        L48:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r5 = r7.booleanValue()
            return r5
    }

    public final boolean b(java.lang.reflect.Method r7) {
            r6 = this;
            l9.b r0 = new l9.b
            r1 = 2
            r0.<init>(r6, r1)
            java.lang.String r1 = "转发会话数量限制"
            boolean r7 = r6.a(r7, r1, r0)
            r0 = 0
            if (r7 != 0) goto L11
            goto Lec
        L11:
            java.util.List r7 = l9.d.f7939h
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r7 = r7.iterator()
        L1c:
            boolean r2 = r7.hasNext()
            r3 = 0
            if (r2 == 0) goto L68
            java.lang.Object r2 = r7.next()
            java.lang.String r2 = (java.lang.String) r2
            r8.g r4 = r6.f7940a
            java.lang.ClassLoader r4 = r4.f11622c
            java.lang.Class r2 = h.Hchat.utils.KavaReflector.loadClass(r2, r4)
            if (r2 == 0) goto L62
            java.lang.Class<android.os.Bundle> r4 = android.os.Bundle.class
            java.lang.Class[] r4 = new java.lang.Class[]{r4}
            java.lang.String r5 = "onCreate"
            java.lang.reflect.Method r2 = h.Hchat.utils.KavaReflector.findDeclaredMethod(r2, r5, r4)
            if (r2 == 0) goto L62
            java.lang.Class r4 = r2.getReturnType()
            java.lang.Class r5 = java.lang.Void.TYPE
            boolean r4 = gg.l.a(r4, r5)
            if (r4 == 0) goto L62
            int r4 = r2.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
            if (r4 != 0) goto L62
            int r4 = r2.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isAbstract(r4)
            if (r4 != 0) goto L62
            r3 = r2
        L62:
            if (r3 == 0) goto L1c
            r1.add(r3)
            goto L1c
        L68:
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L76:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L91
            java.lang.Object r4 = r1.next()
            r5 = r4
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            java.lang.String r5 = r5.toGenericString()
            boolean r5 = r7.add(r5)
            if (r5 == 0) goto L76
            r2.add(r4)
            goto L76
        L91:
            boolean r7 = r2.isEmpty()
            if (r7 == 0) goto L9f
            ia.t r7 = r6.f7941b
            java.lang.String r1 = "未找到转发完整联系人选择页"
            r7.invoke(r1, r3)
            return r0
        L9f:
            java.util.ArrayList r7 = new java.util.ArrayList
            int r1 = tf.n.e1(r2)
            r7.<init>(r1)
            java.util.Iterator r1 = r2.iterator()
        Lac:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lcc
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            l9.b r3 = new l9.b
            r4 = 0
            r3.<init>(r6, r4)
            java.lang.String r4 = "转发完整联系人选择页"
            boolean r2 = r6.a(r2, r4, r3)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r7.add(r2)
            goto Lac
        Lcc:
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto Ld3
            goto Led
        Ld3:
            java.util.Iterator r7 = r7.iterator()
        Ld7:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto Led
            java.lang.Object r1 = r7.next()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r1.getClass()
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto Ld7
        Lec:
            return r0
        Led:
            r7 = 1
            r6.f7945f = r7
            return r7
    }

    public final java.lang.reflect.Method e() {
            r5 = this;
            r8.g r0 = r5.f7940a
            java.lang.ClassLoader r0 = r0.f11622c
            java.lang.String r1 = "com.tencent.mm.ui.transmit.SelectConversationUI"
            java.lang.Class r0 = h.Hchat.utils.KavaReflector.loadClass(r1, r0)
            if (r0 == 0) goto L60
            java.util.List r0 = h.Hchat.utils.KavaReflector.declaredMethods(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            boolean r3 = c(r3)
            if (r3 == 0) goto L19
            r1.add(r2)
            goto L19
        L30:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L3e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L59
            java.lang.Object r3 = r1.next()
            r4 = r3
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.String r4 = r4.toGenericString()
            boolean r4 = r0.add(r4)
            if (r4 == 0) goto L3e
            r2.add(r3)
            goto L3e
        L59:
            java.lang.Object r0 = tf.m.I1(r2)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            return r0
        L60:
            r0 = 0
            return r0
    }

    public final java.lang.reflect.Method f() {
            r11 = this;
            r8.g r0 = r11.f7940a
            android.content.Context r1 = r0.f11620a
            java.lang.ClassLoader r2 = r0.f11622c
            java.lang.String r1 = e8.b.g(r1, r2)
            boolean r3 = og.m.t0(r1)
            r4 = 0
            if (r3 != 0) goto L12
            goto L13
        L12:
            r1 = r4
        L13:
            if (r1 == 0) goto L1c
            java.lang.String r3 = "|remove_forward_limit_v3"
            java.lang.String r1 = r1.concat(r3)
            goto L1d
        L1c:
            r1 = r4
        L1d:
            java.lang.String r3 = ""
            if (r1 != 0) goto L22
            r1 = r3
        L22:
            android.content.SharedPreferences r5 = r11.f7943d
            java.lang.String r6 = "select_conversation_limit"
            java.lang.reflect.Method r7 = e8.b.c(r5, r1, r2, r6)
            if (r7 == 0) goto L36
            boolean r8 = c(r7)
            if (r8 == 0) goto L33
            return r7
        L33:
            e8.b.a(r5, r1, r6)
        L36:
            org.luckypray.dexkit.DexKitBridge r0 = r0.f11623d     // Catch: java.lang.Throwable -> L86
            ch.e r7 = new ch.e     // Catch: java.lang.Throwable -> L86
            r7.<init>()     // Catch: java.lang.Throwable -> L86
            fh.k r8 = new fh.k     // Catch: java.lang.Throwable -> L86
            r8.<init>()     // Catch: java.lang.Throwable -> L86
            java.lang.String r9 = "com.tencent.mm.ui.transmit.SelectConversationUI"
            r10 = 5
            r8.l0(r10, r9)     // Catch: java.lang.Throwable -> L86
            java.lang.String r9 = "max_limit_num"
            java.lang.String[] r9 = new java.lang.String[]{r9}     // Catch: java.lang.Throwable -> L86
            r8.r0(r9)     // Catch: java.lang.Throwable -> L86
            r7.f1666h = r8     // Catch: java.lang.Throwable -> L86
            hh.p r0 = r0.findMethod(r7)     // Catch: java.lang.Throwable -> L86
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L86
            r7.<init>()     // Catch: java.lang.Throwable -> L86
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L86
        L60:
            boolean r8 = r0.hasNext()     // Catch: java.lang.Throwable -> L86
            if (r8 == 0) goto L88
            java.lang.Object r8 = r0.next()     // Catch: java.lang.Throwable -> L86
            hh.o r8 = (hh.o) r8     // Catch: java.lang.Throwable -> L86
            java.lang.reflect.Method r8 = r8.r(r2)     // Catch: java.lang.Throwable -> L71
            goto L78
        L71:
            r8 = move-exception
            sf.f r9 = new sf.f     // Catch: java.lang.Throwable -> L86
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L86
            r8 = r9
        L78:
            boolean r9 = r8 instanceof sf.f     // Catch: java.lang.Throwable -> L86
            if (r9 == 0) goto L7e
            r8 = r4
        L7e:
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8     // Catch: java.lang.Throwable -> L86
            if (r8 == 0) goto L60
            r7.add(r8)     // Catch: java.lang.Throwable -> L86
            goto L60
        L86:
            r0 = move-exception
            goto Ld1
        L88:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L86
            r0.<init>()     // Catch: java.lang.Throwable -> L86
            java.util.Iterator r2 = r7.iterator()     // Catch: java.lang.Throwable -> L86
        L91:
            boolean r7 = r2.hasNext()     // Catch: java.lang.Throwable -> L86
            if (r7 == 0) goto La8
            java.lang.Object r7 = r2.next()     // Catch: java.lang.Throwable -> L86
            r8 = r7
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8     // Catch: java.lang.Throwable -> L86
            boolean r8 = c(r8)     // Catch: java.lang.Throwable -> L86
            if (r8 == 0) goto L91
            r0.add(r7)     // Catch: java.lang.Throwable -> L86
            goto L91
        La8:
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L86
            r2.<init>()     // Catch: java.lang.Throwable -> L86
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L86
            r7.<init>()     // Catch: java.lang.Throwable -> L86
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L86
        Lb6:
            boolean r8 = r0.hasNext()     // Catch: java.lang.Throwable -> L86
            if (r8 == 0) goto Ld6
            java.lang.Object r8 = r0.next()     // Catch: java.lang.Throwable -> L86
            r9 = r8
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9     // Catch: java.lang.Throwable -> L86
            java.lang.String r9 = r9.toGenericString()     // Catch: java.lang.Throwable -> L86
            boolean r9 = r2.add(r9)     // Catch: java.lang.Throwable -> L86
            if (r9 == 0) goto Lb6
            r7.add(r8)     // Catch: java.lang.Throwable -> L86
            goto Lb6
        Ld1:
            sf.f r7 = new sf.f
            r7.<init>(r0)
        Ld6:
            java.lang.Throwable r0 = sf.g.b(r7)
            ia.t r2 = r11.f7941b
            if (r0 != 0) goto Ldf
            goto Le6
        Ldf:
            java.lang.String r7 = "定位转发会话数量限制方法失败"
            r2.invoke(r7, r0)
            tf.t r7 = tf.t.f13167g
        Le6:
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r0 = tf.m.I1(r7)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 == 0) goto Lf4
            e8.b.h(r5, r1, r6, r0)
            goto L127
        Lf4:
            java.lang.String r8 = "cache.key"
            android.content.SharedPreferences$Editor r9 = r5.edit()     // Catch: java.lang.Throwable -> L112
            java.lang.String r3 = r5.getString(r8, r3)     // Catch: java.lang.Throwable -> L112
            boolean r3 = gg.l.a(r3, r1)     // Catch: java.lang.Throwable -> L112
            if (r3 != 0) goto L10b
            android.content.SharedPreferences$Editor r3 = r9.clear()     // Catch: java.lang.Throwable -> L112
            r3.putString(r8, r1)     // Catch: java.lang.Throwable -> L112
        L10b:
            android.content.SharedPreferences$Editor r1 = r9.remove(r6)     // Catch: java.lang.Throwable -> L112
            r1.apply()     // Catch: java.lang.Throwable -> L112
        L112:
            int r1 = r7.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "转发会话数量限制方法定位结果异常: count="
            r3.<init>(r5)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.invoke(r1, r4)
        L127:
            return r0
    }

    public final java.lang.reflect.Method g() {
            r12 = this;
            r8.g r0 = r12.f7940a
            android.content.Context r1 = r0.f11620a
            java.lang.ClassLoader r2 = r0.f11622c
            java.lang.String r1 = e8.b.g(r1, r2)
            boolean r3 = og.m.t0(r1)
            r4 = 0
            if (r3 != 0) goto L12
            goto L13
        L12:
            r1 = r4
        L13:
            if (r1 == 0) goto L1c
            java.lang.String r3 = "|remove_forward_limit_v3"
            java.lang.String r1 = r1.concat(r3)
            goto L1d
        L1c:
            r1 = r4
        L1d:
            java.lang.String r3 = ""
            if (r1 != 0) goto L22
            r1 = r3
        L22:
            android.content.SharedPreferences r5 = r12.f7943d
            java.lang.String r6 = "uic_contact_config"
            java.lang.reflect.Method r7 = e8.b.c(r5, r1, r2, r6)
            if (r7 == 0) goto L36
            boolean r8 = d(r7)
            if (r8 == 0) goto L33
            return r7
        L33:
            e8.b.a(r5, r1, r6)
        L36:
            org.luckypray.dexkit.DexKitBridge r0 = r0.f11623d     // Catch: java.lang.Throwable -> L84
            ch.e r7 = new ch.e     // Catch: java.lang.Throwable -> L84
            r7.<init>()     // Catch: java.lang.Throwable -> L84
            fh.k r8 = new fh.k     // Catch: java.lang.Throwable -> L84
            r8.<init>()     // Catch: java.lang.Throwable -> L84
            java.lang.String r9 = "min_limit_num"
            java.lang.String r10 = "max_limit_num"
            java.lang.String r11 = "ForwardParams_ForwardByUIC"
            java.lang.String[] r9 = new java.lang.String[]{r9, r10, r11}     // Catch: java.lang.Throwable -> L84
            r8.r0(r9)     // Catch: java.lang.Throwable -> L84
            r7.f1666h = r8     // Catch: java.lang.Throwable -> L84
            hh.p r0 = r0.findMethod(r7)     // Catch: java.lang.Throwable -> L84
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L84
            r7.<init>()     // Catch: java.lang.Throwable -> L84
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L84
        L5e:
            boolean r8 = r0.hasNext()     // Catch: java.lang.Throwable -> L84
            if (r8 == 0) goto L86
            java.lang.Object r8 = r0.next()     // Catch: java.lang.Throwable -> L84
            hh.o r8 = (hh.o) r8     // Catch: java.lang.Throwable -> L84
            java.lang.reflect.Method r8 = r8.r(r2)     // Catch: java.lang.Throwable -> L6f
            goto L76
        L6f:
            r8 = move-exception
            sf.f r9 = new sf.f     // Catch: java.lang.Throwable -> L84
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L84
            r8 = r9
        L76:
            boolean r9 = r8 instanceof sf.f     // Catch: java.lang.Throwable -> L84
            if (r9 == 0) goto L7c
            r8 = r4
        L7c:
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8     // Catch: java.lang.Throwable -> L84
            if (r8 == 0) goto L5e
            r7.add(r8)     // Catch: java.lang.Throwable -> L84
            goto L5e
        L84:
            r0 = move-exception
            goto Lcf
        L86:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L84
            r0.<init>()     // Catch: java.lang.Throwable -> L84
            java.util.Iterator r2 = r7.iterator()     // Catch: java.lang.Throwable -> L84
        L8f:
            boolean r7 = r2.hasNext()     // Catch: java.lang.Throwable -> L84
            if (r7 == 0) goto La6
            java.lang.Object r7 = r2.next()     // Catch: java.lang.Throwable -> L84
            r8 = r7
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8     // Catch: java.lang.Throwable -> L84
            boolean r8 = d(r8)     // Catch: java.lang.Throwable -> L84
            if (r8 == 0) goto L8f
            r0.add(r7)     // Catch: java.lang.Throwable -> L84
            goto L8f
        La6:
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L84
            r2.<init>()     // Catch: java.lang.Throwable -> L84
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L84
            r7.<init>()     // Catch: java.lang.Throwable -> L84
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L84
        Lb4:
            boolean r8 = r0.hasNext()     // Catch: java.lang.Throwable -> L84
            if (r8 == 0) goto Ld4
            java.lang.Object r8 = r0.next()     // Catch: java.lang.Throwable -> L84
            r9 = r8
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9     // Catch: java.lang.Throwable -> L84
            java.lang.String r9 = r9.toGenericString()     // Catch: java.lang.Throwable -> L84
            boolean r9 = r2.add(r9)     // Catch: java.lang.Throwable -> L84
            if (r9 == 0) goto Lb4
            r7.add(r8)     // Catch: java.lang.Throwable -> L84
            goto Lb4
        Lcf:
            sf.f r7 = new sf.f
            r7.<init>(r0)
        Ld4:
            java.lang.Throwable r0 = sf.g.b(r7)
            ia.t r2 = r12.f7941b
            if (r0 != 0) goto L11e
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r0 = tf.m.I1(r7)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 == 0) goto Lea
            e8.b.h(r5, r1, r6, r0)
            goto L11d
        Lea:
            java.lang.String r8 = "cache.key"
            android.content.SharedPreferences$Editor r9 = r5.edit()     // Catch: java.lang.Throwable -> L108
            java.lang.String r3 = r5.getString(r8, r3)     // Catch: java.lang.Throwable -> L108
            boolean r3 = gg.l.a(r3, r1)     // Catch: java.lang.Throwable -> L108
            if (r3 != 0) goto L101
            android.content.SharedPreferences$Editor r3 = r9.clear()     // Catch: java.lang.Throwable -> L108
            r3.putString(r8, r1)     // Catch: java.lang.Throwable -> L108
        L101:
            android.content.SharedPreferences$Editor r1 = r9.remove(r6)     // Catch: java.lang.Throwable -> L108
            r1.apply()     // Catch: java.lang.Throwable -> L108
        L108:
            int r1 = r7.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "新版转发联系人配置定位结果异常: count="
            r3.<init>(r5)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.invoke(r1, r4)
        L11d:
            return r0
        L11e:
            java.lang.String r1 = "定位新版转发联系人配置失败"
            r2.invoke(r1, r0)
            return r4
    }
}
