package rb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r8.g f11873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rb.k f11874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ia.t f11875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final android.content.SharedPreferences f11876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile java.lang.reflect.Constructor f11877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile java.lang.reflect.Method f11878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile java.lang.Object f11879g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f11880h;

    public c(r8.g r1, rb.k r2, ia.t r3) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f11873a = r1
            r0.f11874b = r2
            r0.f11875c = r3
            android.content.Context r1 = r1.f11620a
            java.lang.String r2 = "Hchat_zombie_check_method_cache"
            android.content.SharedPreferences r1 = ub.b.c(r1, r2)
            r0.f11876d = r1
            return
    }

    public static boolean c(java.lang.Class r3, java.lang.reflect.Method r4) {
            java.lang.Class[] r0 = r4.getParameterTypes()
            java.lang.Class r1 = r4.getDeclaringClass()
            boolean r3 = gg.l.a(r1, r3)
            r1 = 0
            if (r3 == 0) goto L4c
            java.lang.String r3 = r4.getName()
            java.lang.String r2 = "onGYNetEnd"
            boolean r3 = gg.l.a(r3, r2)
            if (r3 == 0) goto L4c
            java.lang.Class r3 = r4.getReturnType()
            java.lang.Class r4 = java.lang.Void.TYPE
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto L4c
            int r3 = r0.length
            r4 = 3
            if (r3 != r4) goto L4c
            r3 = r0[r1]
            java.lang.Class r4 = java.lang.Integer.TYPE
            boolean r3 = gg.l.a(r3, r4)
            if (r3 == 0) goto L4c
            r3 = 1
            r4 = r0[r3]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            boolean r4 = gg.l.a(r4, r2)
            if (r4 == 0) goto L4c
            r4 = 2
            r4 = r0[r4]
            java.lang.Class<org.json.JSONObject> r0 = org.json.JSONObject.class
            boolean r4 = gg.l.a(r4, r0)
            if (r4 == 0) goto L4c
            return r3
        L4c:
            return r1
    }

    public static boolean d(java.lang.reflect.Method r6) {
            boolean r0 = h.Hchat.utils.KavaReflector.isStatic(r6)
            r1 = 0
            if (r0 != 0) goto L6f
            java.lang.Class r0 = r6.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            boolean r0 = gg.l.a(r0, r2)
            if (r0 != 0) goto L14
            goto L6f
        L14:
            java.lang.Class[] r0 = r6.getParameterTypes()
            int r2 = r0.length
            r3 = 2
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = 1
            if (r2 != r3) goto L32
            r2 = r0[r1]
            boolean r2 = gg.l.a(r2, r4)
            if (r2 == 0) goto L32
            r2 = r0[r5]
            java.lang.Class r3 = java.lang.Boolean.TYPE
            boolean r2 = gg.l.a(r2, r3)
            if (r2 == 0) goto L32
            goto L6e
        L32:
            int r2 = r0.length
            if (r2 != r5) goto L6f
            r0 = r0[r1]
            boolean r0 = gg.l.a(r0, r4)
            if (r0 != 0) goto L3e
            goto L6f
        L3e:
            java.lang.Class r6 = r6.getDeclaringClass()
            java.util.List r6 = h.Hchat.utils.KavaReflector.declaredConstructors(r6)
            if (r6 == 0) goto L4f
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L4f
            goto L6f
        L4f:
            java.util.Iterator r6 = r6.iterator()
        L53:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L6f
            java.lang.Object r0 = r6.next()
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            java.lang.Class[] r0 = r0.getParameterTypes()
            r0.getClass()
            int r0 = r0.length
            if (r0 != 0) goto L6b
            r0 = r5
            goto L6c
        L6b:
            r0 = r1
        L6c:
            if (r0 == 0) goto L53
        L6e:
            return r5
        L6f:
            return r1
    }

    public static boolean e(java.lang.reflect.Constructor r9) {
            java.lang.Class[] r0 = r9.getParameterTypes()
            int r1 = r0.length
            r2 = 30
            r3 = 0
            r4 = 29
            if (r1 == r4) goto L10
            int r1 = r0.length
            if (r1 == r2) goto L10
            goto L6c
        L10:
            r1 = r0[r3]
            java.lang.Class r5 = java.lang.Double.TYPE
            boolean r1 = gg.l.a(r1, r5)
            if (r1 != 0) goto L1b
            goto L6c
        L1b:
            r1 = 21
            int[] r5 = new int[r1]
            r5 = {x007c: FILL_ARRAY_DATA , data: [1, 2, 3, 6, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 20, 21, 22, 23, 25, 27, 28} // fill-array
            r6 = r3
        L23:
            if (r6 >= r1) goto L35
            r7 = r5[r6]
            r7 = r0[r7]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            boolean r7 = gg.l.a(r7, r8)
            if (r7 != 0) goto L32
            goto L6c
        L32:
            int r6 = r6 + 1
            goto L23
        L35:
            r1 = 6
            int[] r5 = new int[r1]
            r5 = {x00aa: FILL_ARRAY_DATA , data: [4, 5, 7, 13, 24, 26} // fill-array
            r6 = r3
        L3c:
            if (r6 >= r1) goto L4e
            r7 = r5[r6]
            r7 = r0[r7]
            java.lang.Class r8 = java.lang.Integer.TYPE
            boolean r7 = gg.l.a(r7, r8)
            if (r7 != 0) goto L4b
            goto L6c
        L4b:
            int r6 = r6 + 1
            goto L3c
        L4e:
            r1 = 19
            r1 = r0[r1]
            java.lang.String r1 = r1.getName()
            java.lang.String r5 = "com.tencent.mm.autogen.events.F2fDynamicStartPayEvent"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L5f
            goto L6c
        L5f:
            int r1 = r0.length
            if (r1 != r2) goto L6d
            r0 = r0[r4]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L6d
        L6c:
            return r3
        L6d:
            java.lang.Class r9 = r9.getDeclaringClass()
            java.lang.String r9 = r9.getName()
            java.lang.String r0 = "com.tencent.mm.plugin.remittance.model."
            boolean r9 = og.t.d0(r9, r0, r3)
            return r9
    }

    public final java.lang.Object a(java.lang.String r11) {
            r10 = this;
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r11.getClass()
            java.lang.reflect.Constructor r2 = r10.f11877e
            r3 = 0
            if (r2 == 0) goto L11b
            boolean r4 = e(r2)
            if (r4 != 0) goto L15
            goto L11b
        L15:
            java.lang.Class[] r4 = r2.getParameterTypes()
            int r5 = r4.length
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r7 = r0
        L1d:
            if (r7 >= r5) goto Ld3
            r8 = r4[r7]
            r8.getClass()
            java.lang.Class r9 = java.lang.Boolean.TYPE
            boolean r9 = r8.equals(r9)
            if (r9 != 0) goto Lcb
            java.lang.Class<java.lang.Boolean> r9 = java.lang.Boolean.class
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L36
            goto Lcb
        L36:
            java.lang.Class r9 = java.lang.Byte.TYPE
            boolean r9 = r8.equals(r9)
            if (r9 != 0) goto Lc6
            java.lang.Class<java.lang.Byte> r9 = java.lang.Byte.class
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L48
            goto Lc6
        L48:
            java.lang.Class r9 = java.lang.Short.TYPE
            boolean r9 = r8.equals(r9)
            if (r9 != 0) goto Lc1
            java.lang.Class<java.lang.Short> r9 = java.lang.Short.class
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L5a
            goto Lc1
        L5a:
            java.lang.Class r9 = java.lang.Integer.TYPE
            boolean r9 = r8.equals(r9)
            if (r9 != 0) goto Lbf
            java.lang.Class<java.lang.Integer> r9 = java.lang.Integer.class
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L6b
            goto Lbf
        L6b:
            java.lang.Class r9 = java.lang.Long.TYPE
            boolean r9 = r8.equals(r9)
            if (r9 != 0) goto Lb8
            java.lang.Class<java.lang.Long> r9 = java.lang.Long.class
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L7c
            goto Lb8
        L7c:
            java.lang.Class r9 = java.lang.Float.TYPE
            boolean r9 = r8.equals(r9)
            if (r9 != 0) goto Lb2
            java.lang.Class<java.lang.Float> r9 = java.lang.Float.class
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L8d
            goto Lb2
        L8d:
            java.lang.Class r9 = java.lang.Double.TYPE
            boolean r9 = r8.equals(r9)
            if (r9 != 0) goto Lab
            java.lang.Class<java.lang.Double> r9 = java.lang.Double.class
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L9e
            goto Lab
        L9e:
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto La9
            java.lang.String r8 = ""
            goto Lcd
        La9:
            r8 = r3
            goto Lcd
        Lab:
            r8 = 0
            java.lang.Double r8 = java.lang.Double.valueOf(r8)
            goto Lcd
        Lb2:
            r8 = 0
            java.lang.Float r8 = java.lang.Float.valueOf(r8)
            goto Lcd
        Lb8:
            r8 = 0
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            goto Lcd
        Lbf:
            r8 = r1
            goto Lcd
        Lc1:
            java.lang.Short r8 = java.lang.Short.valueOf(r0)
            goto Lcd
        Lc6:
            java.lang.Byte r8 = java.lang.Byte.valueOf(r0)
            goto Lcd
        Lcb:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
        Lcd:
            r6[r7] = r8
            int r7 = r7 + 1
            goto L1d
        Ld3:
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double r4 = java.lang.Double.valueOf(r7)
            r6[r0] = r4
            java.lang.String r0 = "1"
            r4 = 1
            r6[r4] = r0
            r0 = 2
            r6[r0] = r11
            r11 = 31
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r4 = 4
            r6[r4] = r11
            r11 = 5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r11] = r0
            r11 = 11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r0 = 13
            r6[r0] = r11
            r11 = 24
            r6[r11] = r1
            r11 = 26
            r6[r11] = r1
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r6, r5)
            java.lang.Object r11 = h.Hchat.utils.KavaReflector.newInstance(r2, r11)
            if (r11 == 0) goto L11b
            java.lang.String r0 = "RemittanceProcess"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "setProcessName"
            h.Hchat.utils.KavaReflector.invokeMethod(r11, r1, r0)
            return r11
        L11b:
            return r3
    }

    public final boolean b(java.lang.String r6, boolean r7) {
            r5 = this;
            java.lang.String r0 = "删除好友服务实例获取失败: "
            r6.getClass()
            java.lang.reflect.Method r1 = r5.f11878f
            r2 = 0
            if (r1 == 0) goto Lb
            goto L11
        Lb:
            java.lang.reflect.Method r1 = r5.g()
            if (r1 == 0) goto La3
        L11:
            java.lang.Object r3 = r5.i(r1)     // Catch: java.lang.Throwable -> L5a
            if (r3 == 0) goto L6b
            java.lang.Class[] r0 = r1.getParameterTypes()     // Catch: java.lang.Throwable -> L5a
            int r0 = r0.length     // Catch: java.lang.Throwable -> L5a
            r4 = 2
            if (r0 != r4) goto L5c
            r0 = 1
            if (r7 == 0) goto L24
            r2 = r0
            goto L51
        L24:
            k8.s r7 = h.Hchat.hooks.api.core.WeChatApis.messageStore()     // Catch: java.lang.Throwable -> L5a
            if (r7 == 0) goto L51
            boolean r4 = r7.h()     // Catch: java.lang.Throwable -> L5a
            if (r4 != 0) goto L31
            goto L51
        L31:
            h.Hchat.hooks.api.model.WeChatMessage r7 = r7.b(r6)     // Catch: java.lang.Throwable -> L3d
            if (r7 != 0) goto L38
            r2 = r0
        L38:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L3d
            goto L44
        L3d:
            r7 = move-exception
            sf.f r0 = new sf.f     // Catch: java.lang.Throwable -> L5a
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L5a
            r7 = r0
        L44:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L5a
            boolean r2 = r7 instanceof sf.f     // Catch: java.lang.Throwable -> L5a
            if (r2 == 0) goto L4b
            r7 = r0
        L4b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L5a
            boolean r2 = r7.booleanValue()     // Catch: java.lang.Throwable -> L5a
        L51:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object[] r7 = new java.lang.Object[]{r6, r7}     // Catch: java.lang.Throwable -> L5a
            goto L60
        L5a:
            r7 = move-exception
            goto L82
        L5c:
            java.lang.Object[] r7 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L5a
        L60:
            int r0 = r7.length     // Catch: java.lang.Throwable -> L5a
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r0)     // Catch: java.lang.Throwable -> L5a
            h.Hchat.utils.KavaReflector.invokeOrThrow(r1, r3, r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L5a
            goto L88
        L6b:
            ia.t r7 = r5.f11875c     // Catch: java.lang.Throwable -> L5a
            java.lang.String r1 = r1.toGenericString()     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L5a
            r3.append(r1)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L5a
            r1 = 0
            r7.invoke(r0, r1)     // Catch: java.lang.Throwable -> L5a
            return r2
        L82:
            sf.f r0 = new sf.f
            r0.<init>(r7)
            r7 = r0
        L88:
            java.lang.Throwable r0 = sf.g.b(r7)
            if (r0 != 0) goto L8f
            goto L9c
        L8f:
            ia.t r7 = r5.f11875c
            java.lang.String r1 = "删除异常好友失败: "
            java.lang.String r6 = r1.concat(r6)
            r7.invoke(r6, r0)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
        L9c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r6 = r7.booleanValue()
            return r6
        La3:
            return r2
    }

    public final java.lang.reflect.Method f(java.lang.reflect.Constructor r11) {
            r10 = this;
            java.lang.String r0 = r10.j()
            r8.g r1 = r10.f11873a
            java.lang.ClassLoader r1 = r1.f11622c
            android.content.SharedPreferences r2 = r10.f11876d
            java.lang.String r3 = "probe_callback_v1"
            java.lang.reflect.Method r1 = e8.b.c(r2, r0, r1, r3)
            r4 = 0
            if (r1 == 0) goto L25
            java.lang.Class r5 = r11.getDeclaringClass()
            r5.getClass()
            boolean r5 = c(r5, r1)
            if (r5 == 0) goto L21
            goto L22
        L21:
            r1 = r4
        L22:
            if (r1 == 0) goto L25
            return r1
        L25:
            java.lang.Class r1 = r11.getDeclaringClass()
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredMethods(r1)
            java.util.Iterator r1 = r1.iterator()
            r5 = 0
            r6 = r4
        L33:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L53
            java.lang.Object r7 = r1.next()
            r8 = r7
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            java.lang.Class r9 = r11.getDeclaringClass()
            r9.getClass()
            boolean r8 = c(r9, r8)
            if (r8 == 0) goto L33
            if (r5 == 0) goto L50
            goto L57
        L50:
            r5 = 1
            r6 = r7
            goto L33
        L53:
            if (r5 != 0) goto L56
            goto L57
        L56:
            r4 = r6
        L57:
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            if (r4 == 0) goto L5f
            e8.b.h(r2, r0, r3, r4)
            return r4
        L5f:
            java.lang.String r11 = "cache.key"
            android.content.SharedPreferences$Editor r1 = r2.edit()     // Catch: java.lang.Throwable -> L7f
            java.lang.String r5 = ""
            java.lang.String r2 = r2.getString(r11, r5)     // Catch: java.lang.Throwable -> L7f
            boolean r2 = gg.l.a(r2, r0)     // Catch: java.lang.Throwable -> L7f
            if (r2 != 0) goto L78
            android.content.SharedPreferences$Editor r2 = r1.clear()     // Catch: java.lang.Throwable -> L7f
            r2.putString(r11, r0)     // Catch: java.lang.Throwable -> L7f
        L78:
            android.content.SharedPreferences$Editor r11 = r1.remove(r3)     // Catch: java.lang.Throwable -> L7f
            r11.apply()     // Catch: java.lang.Throwable -> L7f
        L7f:
            return r4
    }

    public final java.lang.reflect.Method g() {
            r9 = this;
            java.lang.String r0 = "MicroMsg.DeleteContactService"
            java.lang.String r1 = r9.j()
            android.content.SharedPreferences r2 = r9.f11876d
            r8.g r3 = r9.f11873a
            java.lang.ClassLoader r3 = r3.f11622c
            java.lang.String r4 = "delete_contact_method_v2"
            java.lang.reflect.Method r2 = e8.b.c(r2, r1, r3, r4)
            r3 = 0
            if (r2 == 0) goto L22
            boolean r5 = d(r2)
            if (r5 == 0) goto L1c
            goto L1d
        L1c:
            r2 = r3
        L1d:
            if (r2 == 0) goto L22
            r9.f11878f = r2
            return r2
        L22:
            r8.g r2 = r9.f11873a     // Catch: java.lang.Throwable -> L72
            org.luckypray.dexkit.DexKitBridge r2 = r2.f11623d     // Catch: java.lang.Throwable -> L72
            ch.e r5 = new ch.e     // Catch: java.lang.Throwable -> L72
            r5.<init>()     // Catch: java.lang.Throwable -> L72
            fh.k r6 = new fh.k     // Catch: java.lang.Throwable -> L72
            r6.<init>()     // Catch: java.lang.Throwable -> L72
            java.lang.String r7 = "delete contact %s isClearRecord:%s"
            java.lang.String[] r7 = new java.lang.String[]{r0, r7}     // Catch: java.lang.Throwable -> L72
            r6.r0(r7)     // Catch: java.lang.Throwable -> L72
            r5.f1666h = r6     // Catch: java.lang.Throwable -> L72
            hh.p r2 = r2.findMethod(r5)     // Catch: java.lang.Throwable -> L72
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L72
            r5.<init>()     // Catch: java.lang.Throwable -> L72
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L72
        L48:
            boolean r6 = r2.hasNext()     // Catch: java.lang.Throwable -> L72
            if (r6 == 0) goto L75
            java.lang.Object r6 = r2.next()     // Catch: java.lang.Throwable -> L72
            hh.o r6 = (hh.o) r6     // Catch: java.lang.Throwable -> L72
            r8.g r7 = r9.f11873a     // Catch: java.lang.Throwable -> L5d
            java.lang.ClassLoader r7 = r7.f11622c     // Catch: java.lang.Throwable -> L5d
            java.lang.reflect.Method r6 = r6.r(r7)     // Catch: java.lang.Throwable -> L5d
            goto L64
        L5d:
            r6 = move-exception
            sf.f r7 = new sf.f     // Catch: java.lang.Throwable -> L72
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L72
            r6 = r7
        L64:
            boolean r7 = r6 instanceof sf.f     // Catch: java.lang.Throwable -> L72
            if (r7 == 0) goto L6a
            r6 = r3
        L6a:
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6     // Catch: java.lang.Throwable -> L72
            if (r6 == 0) goto L48
            r5.add(r6)     // Catch: java.lang.Throwable -> L72
            goto L48
        L72:
            r0 = move-exception
            goto L15f
        L75:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L72
            r2.<init>()     // Catch: java.lang.Throwable -> L72
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L72
        L7e:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L72
            if (r6 == 0) goto L95
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L72
            r7 = r6
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7     // Catch: java.lang.Throwable -> L72
            boolean r7 = d(r7)     // Catch: java.lang.Throwable -> L72
            if (r7 == 0) goto L7e
            r2.add(r6)     // Catch: java.lang.Throwable -> L72
            goto L7e
        L95:
            java.util.HashSet r5 = new java.util.HashSet     // Catch: java.lang.Throwable -> L72
            r5.<init>()     // Catch: java.lang.Throwable -> L72
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L72
            r6.<init>()     // Catch: java.lang.Throwable -> L72
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L72
        La3:
            boolean r7 = r2.hasNext()     // Catch: java.lang.Throwable -> L72
            if (r7 == 0) goto Lbe
            java.lang.Object r7 = r2.next()     // Catch: java.lang.Throwable -> L72
            r8 = r7
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8     // Catch: java.lang.Throwable -> L72
            java.lang.String r8 = r8.toGenericString()     // Catch: java.lang.Throwable -> L72
            boolean r8 = r5.add(r8)     // Catch: java.lang.Throwable -> L72
            if (r8 == 0) goto La3
            r6.add(r7)     // Catch: java.lang.Throwable -> L72
            goto La3
        Lbe:
            boolean r2 = r6.isEmpty()     // Catch: java.lang.Throwable -> L72
            if (r2 != 0) goto Lc6
            goto L164
        Lc6:
            r8.g r2 = r9.f11873a     // Catch: java.lang.Throwable -> L72
            org.luckypray.dexkit.DexKitBridge r2 = r2.f11623d     // Catch: java.lang.Throwable -> L72
            ch.e r5 = new ch.e     // Catch: java.lang.Throwable -> L72
            r5.<init>()     // Catch: java.lang.Throwable -> L72
            fh.k r6 = new fh.k     // Catch: java.lang.Throwable -> L72
            r6.<init>()     // Catch: java.lang.Throwable -> L72
            java.lang.String r7 = "delete contact %s"
            java.lang.String[] r0 = new java.lang.String[]{r0, r7}     // Catch: java.lang.Throwable -> L72
            r6.r0(r0)     // Catch: java.lang.Throwable -> L72
            r5.f1666h = r6     // Catch: java.lang.Throwable -> L72
            hh.p r0 = r2.findMethod(r5)     // Catch: java.lang.Throwable -> L72
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L72
            r2.<init>()     // Catch: java.lang.Throwable -> L72
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L72
        Lec:
            boolean r5 = r0.hasNext()     // Catch: java.lang.Throwable -> L72
            if (r5 == 0) goto L116
            java.lang.Object r5 = r0.next()     // Catch: java.lang.Throwable -> L72
            hh.o r5 = (hh.o) r5     // Catch: java.lang.Throwable -> L72
            r8.g r6 = r9.f11873a     // Catch: java.lang.Throwable -> L101
            java.lang.ClassLoader r6 = r6.f11622c     // Catch: java.lang.Throwable -> L101
            java.lang.reflect.Method r5 = r5.r(r6)     // Catch: java.lang.Throwable -> L101
            goto L108
        L101:
            r5 = move-exception
            sf.f r6 = new sf.f     // Catch: java.lang.Throwable -> L72
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L72
            r5 = r6
        L108:
            boolean r6 = r5 instanceof sf.f     // Catch: java.lang.Throwable -> L72
            if (r6 == 0) goto L10e
            r5 = r3
        L10e:
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch: java.lang.Throwable -> L72
            if (r5 == 0) goto Lec
            r2.add(r5)     // Catch: java.lang.Throwable -> L72
            goto Lec
        L116:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L72
            r0.<init>()     // Catch: java.lang.Throwable -> L72
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L72
        L11f:
            boolean r5 = r2.hasNext()     // Catch: java.lang.Throwable -> L72
            if (r5 == 0) goto L136
            java.lang.Object r5 = r2.next()     // Catch: java.lang.Throwable -> L72
            r6 = r5
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6     // Catch: java.lang.Throwable -> L72
            boolean r6 = d(r6)     // Catch: java.lang.Throwable -> L72
            if (r6 == 0) goto L11f
            r0.add(r5)     // Catch: java.lang.Throwable -> L72
            goto L11f
        L136:
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L72
            r2.<init>()     // Catch: java.lang.Throwable -> L72
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L72
            r6.<init>()     // Catch: java.lang.Throwable -> L72
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L72
        L144:
            boolean r5 = r0.hasNext()     // Catch: java.lang.Throwable -> L72
            if (r5 == 0) goto L164
            java.lang.Object r5 = r0.next()     // Catch: java.lang.Throwable -> L72
            r7 = r5
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7     // Catch: java.lang.Throwable -> L72
            java.lang.String r7 = r7.toGenericString()     // Catch: java.lang.Throwable -> L72
            boolean r7 = r2.add(r7)     // Catch: java.lang.Throwable -> L72
            if (r7 == 0) goto L144
            r6.add(r5)     // Catch: java.lang.Throwable -> L72
            goto L144
        L15f:
            sf.f r6 = new sf.f
            r6.<init>(r0)
        L164:
            java.lang.Throwable r0 = sf.g.b(r6)
            if (r0 != 0) goto L16b
            goto L174
        L16b:
            ia.t r2 = r9.f11875c
            java.lang.String r5 = "定位删除好友方法失败"
            r2.invoke(r5, r0)
            tf.t r6 = tf.t.f13167g
        L174:
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r0 = tf.m.I1(r6)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            android.content.SharedPreferences r2 = r9.f11876d
            if (r0 == 0) goto L186
            e8.b.h(r2, r1, r4, r0)
            r9.f11878f = r0
            goto L1b7
        L186:
            java.lang.String r5 = "cache.key"
            r2.getClass()
            android.content.SharedPreferences$Editor r7 = r2.edit()     // Catch: java.lang.Throwable -> L1a9
            java.lang.String r8 = ""
            java.lang.String r2 = r2.getString(r5, r8)     // Catch: java.lang.Throwable -> L1a9
            boolean r2 = gg.l.a(r2, r1)     // Catch: java.lang.Throwable -> L1a9
            if (r2 != 0) goto L1a2
            android.content.SharedPreferences$Editor r2 = r7.clear()     // Catch: java.lang.Throwable -> L1a9
            r2.putString(r5, r1)     // Catch: java.lang.Throwable -> L1a9
        L1a2:
            android.content.SharedPreferences$Editor r1 = r7.remove(r4)     // Catch: java.lang.Throwable -> L1a9
            r1.apply()     // Catch: java.lang.Throwable -> L1a9
        L1a9:
            int r1 = r6.size()
            r2 = 1
            if (r1 <= r2) goto L1b7
            ia.t r1 = r9.f11875c
            java.lang.String r2 = "删除好友方法候选不唯一"
            r1.invoke(r2, r3)
        L1b7:
            return r0
    }

    public final java.lang.reflect.Constructor h() {
            r11 = this;
            java.lang.String r0 = r11.j()
            r8.g r1 = r11.f11873a
            java.lang.ClassLoader r2 = r1.f11622c
            android.content.SharedPreferences r3 = r11.f11876d
            java.lang.String r4 = "probe_constructor_v1"
            java.lang.reflect.Constructor r2 = e8.b.d(r3, r0, r2, r4)
            r5 = 0
            if (r2 == 0) goto L1e
            boolean r6 = e(r2)
            if (r6 == 0) goto L1a
            goto L1b
        L1a:
            r2 = r5
        L1b:
            if (r2 == 0) goto L1e
            return r2
        L1e:
            org.luckypray.dexkit.DexKitBridge r2 = r1.f11623d     // Catch: java.lang.Throwable -> L7d
            ch.e r6 = new ch.e     // Catch: java.lang.Throwable -> L7d
            r6.<init>()     // Catch: java.lang.Throwable -> L7d
            fh.k r7 = new fh.k     // Catch: java.lang.Throwable -> L7d
            r7.<init>()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r8 = "Micromsg.NetSceneTenpayRemittanceGen"
            java.lang.String r9 = "receiver_openid"
            java.lang.String r10 = "placeorder_attach"
            java.lang.String[] r8 = new java.lang.String[]{r8, r9, r10}     // Catch: java.lang.Throwable -> L7d
            r7.r0(r8)     // Catch: java.lang.Throwable -> L7d
            r6.f1666h = r7     // Catch: java.lang.Throwable -> L7d
            hh.p r2 = r2.findMethod(r6)     // Catch: java.lang.Throwable -> L7d
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7d
            r6.<init>()     // Catch: java.lang.Throwable -> L7d
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L7d
        L46:
            boolean r7 = r2.hasNext()     // Catch: java.lang.Throwable -> L7d
            if (r7 == 0) goto L7f
            java.lang.Object r7 = r2.next()     // Catch: java.lang.Throwable -> L7d
            hh.o r7 = (hh.o) r7     // Catch: java.lang.Throwable -> L7d
            boolean r8 = r7.t()     // Catch: java.lang.Throwable -> L7d
            if (r8 != 0) goto L5a
            r7 = r5
            goto L77
        L5a:
            java.lang.ClassLoader r8 = r1.f11622c     // Catch: java.lang.Throwable -> L68
            r8.getClass()     // Catch: java.lang.Throwable -> L68
            lh.d r7 = r7.p()     // Catch: java.lang.Throwable -> L68
            java.lang.reflect.Constructor r7 = r7.a(r8)     // Catch: java.lang.Throwable -> L68
            goto L6f
        L68:
            r7 = move-exception
            sf.f r8 = new sf.f     // Catch: java.lang.Throwable -> L7d
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L7d
            r7 = r8
        L6f:
            boolean r8 = r7 instanceof sf.f     // Catch: java.lang.Throwable -> L7d
            if (r8 == 0) goto L75
            r7 = r5
        L75:
            java.lang.reflect.Constructor r7 = (java.lang.reflect.Constructor) r7     // Catch: java.lang.Throwable -> L7d
        L77:
            if (r7 == 0) goto L46
            r6.add(r7)     // Catch: java.lang.Throwable -> L7d
            goto L46
        L7d:
            r1 = move-exception
            goto Lc8
        L7f:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7d
            r1.<init>()     // Catch: java.lang.Throwable -> L7d
            java.util.Iterator r2 = r6.iterator()     // Catch: java.lang.Throwable -> L7d
        L88:
            boolean r6 = r2.hasNext()     // Catch: java.lang.Throwable -> L7d
            if (r6 == 0) goto L9f
            java.lang.Object r6 = r2.next()     // Catch: java.lang.Throwable -> L7d
            r7 = r6
            java.lang.reflect.Constructor r7 = (java.lang.reflect.Constructor) r7     // Catch: java.lang.Throwable -> L7d
            boolean r7 = e(r7)     // Catch: java.lang.Throwable -> L7d
            if (r7 == 0) goto L88
            r1.add(r6)     // Catch: java.lang.Throwable -> L7d
            goto L88
        L9f:
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L7d
            r2.<init>()     // Catch: java.lang.Throwable -> L7d
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L7d
            r6.<init>()     // Catch: java.lang.Throwable -> L7d
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L7d
        Lad:
            boolean r7 = r1.hasNext()     // Catch: java.lang.Throwable -> L7d
            if (r7 == 0) goto Lcd
            java.lang.Object r7 = r1.next()     // Catch: java.lang.Throwable -> L7d
            r8 = r7
            java.lang.reflect.Constructor r8 = (java.lang.reflect.Constructor) r8     // Catch: java.lang.Throwable -> L7d
            java.lang.String r8 = r8.toGenericString()     // Catch: java.lang.Throwable -> L7d
            boolean r8 = r2.add(r8)     // Catch: java.lang.Throwable -> L7d
            if (r8 == 0) goto Lad
            r6.add(r7)     // Catch: java.lang.Throwable -> L7d
            goto Lad
        Lc8:
            sf.f r6 = new sf.f
            r6.<init>(r1)
        Lcd:
            java.lang.Throwable r1 = sf.g.b(r6)
            ia.t r2 = r11.f11875c
            if (r1 != 0) goto Ld6
            goto Ldd
        Ld6:
            java.lang.String r6 = "定位转账核验构造器失败"
            r2.invoke(r6, r1)
            tf.t r6 = tf.t.f13167g
        Ldd:
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r1 = tf.m.I1(r6)
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
            if (r1 == 0) goto Leb
            e8.b.i(r3, r0, r4, r1)
            goto L117
        Leb:
            java.lang.String r7 = "cache.key"
            android.content.SharedPreferences$Editor r8 = r3.edit()     // Catch: java.lang.Throwable -> L10b
            java.lang.String r9 = ""
            java.lang.String r3 = r3.getString(r7, r9)     // Catch: java.lang.Throwable -> L10b
            boolean r3 = gg.l.a(r3, r0)     // Catch: java.lang.Throwable -> L10b
            if (r3 != 0) goto L104
            android.content.SharedPreferences$Editor r3 = r8.clear()     // Catch: java.lang.Throwable -> L10b
            r3.putString(r7, r0)     // Catch: java.lang.Throwable -> L10b
        L104:
            android.content.SharedPreferences$Editor r0 = r8.remove(r4)     // Catch: java.lang.Throwable -> L10b
            r0.apply()     // Catch: java.lang.Throwable -> L10b
        L10b:
            int r0 = r6.size()
            r3 = 1
            if (r0 <= r3) goto L117
            java.lang.String r0 = "转账核验构造器候选不唯一"
            r2.invoke(r0, r5)
        L117:
            return r1
    }

    public final java.lang.Object i(java.lang.reflect.Method r5) {
            r4 = this;
            java.lang.Class r5 = r5.getDeclaringClass()
            java.lang.Object r0 = r4.f11879g
            r1 = 0
            if (r0 == 0) goto L17
            r5.getClass()
            boolean r2 = r5.isInstance(r0)
            if (r2 == 0) goto L13
            goto L14
        L13:
            r0 = r1
        L14:
            if (r0 == 0) goto L17
            return r0
        L17:
            r8.g r0 = r4.f11873a
            h.Hchat.dexkit.DexFinder r0 = r0.f11624e
            java.lang.reflect.Method r2 = r0.serviceGetterMethod
            if (r2 != 0) goto L22
            r0.resolveServiceManagerApi()
        L22:
            java.lang.Object r0 = ig.a.A(r0, r5)
            if (r0 == 0) goto L2b
            r4.f11879g = r0
            return r0
        L2b:
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.staticInstance(r5)
            if (r0 == 0) goto L41
            r5.getClass()
            boolean r2 = r5.isInstance(r0)
            if (r2 == 0) goto L3b
            goto L3c
        L3b:
            r0 = r1
        L3c:
            if (r0 == 0) goto L41
            r4.f11879g = r0
            return r0
        L41:
            java.util.List r5 = h.Hchat.utils.KavaReflector.declaredConstructors(r5)
            java.util.Iterator r5 = r5.iterator()
        L49:
            boolean r0 = r5.hasNext()
            r2 = 0
            if (r0 == 0) goto L67
            java.lang.Object r0 = r5.next()
            r3 = r0
            java.lang.reflect.Constructor r3 = (java.lang.reflect.Constructor) r3
            java.lang.Class[] r3 = r3.getParameterTypes()
            r3.getClass()
            int r3 = r3.length
            if (r3 != 0) goto L63
            r3 = 1
            goto L64
        L63:
            r3 = r2
        L64:
            if (r3 == 0) goto L49
            goto L68
        L67:
            r0 = r1
        L68:
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            if (r0 == 0) goto L72
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.newInstance(r0, r5)
        L72:
            if (r1 == 0) goto L76
            r4.f11879g = r1
        L76:
            return r1
    }

    public final java.lang.String j() {
            r2 = this;
            r8.g r0 = r2.f11873a
            android.content.Context r1 = r0.f11620a
            java.lang.ClassLoader r0 = r0.f11622c
            r0.getClass()
            l8.i r0 = o8.k.a(r1, r0)
            java.lang.String r0 = r0.f7933h
            return r0
    }
}
