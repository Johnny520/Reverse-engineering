package j8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f6810d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile java.lang.Object f6811e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f6812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h.Hchat.dexkit.DexFinder f6813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i8.f f6814c;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            j8.n.f6810d = r0
            return
    }

    public n(android.content.Context r1, h.Hchat.dexkit.DexFinder r2, i8.f r3) {
            r0 = this;
            r0.<init>()
            r0.f6812a = r1
            r0.f6813b = r2
            r0.f6814c = r3
            java.lang.Class<?> r1 = r2.marsCdnManagerClass
            j(r1, r3)
            return
    }

    public static void b(java.lang.Object r2, java.lang.String r3, java.lang.Object r4) {
            java.lang.Class r0 = r2.getClass()
            java.lang.Object[] r1 = new java.lang.Object[]{r4}
            java.lang.reflect.Method r3 = h.Hchat.utils.KavaReflector.findCompatibleMethod(r0, r3, r1)
            if (r3 == 0) goto L15
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            h.Hchat.utils.KavaReflector.invoke(r3, r2, r4)
        L15:
            return
    }

    public static java.lang.reflect.Field g(java.lang.Class r3) {
            java.util.List r3 = h.Hchat.utils.KavaReflector.declaredFields(r3)
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r3.next()
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            boolean r1 = h.Hchat.utils.KavaReflector.isStatic(r0)
            if (r1 != 0) goto L8
            java.lang.Class r1 = r0.getType()
            java.lang.Class r2 = java.lang.Integer.TYPE
            if (r1 == r2) goto L2a
            java.lang.Class r1 = r0.getType()
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            if (r1 != r2) goto L8
        L2a:
            java.lang.reflect.Field r3 = h.Hchat.utils.KavaReflector.accessible(r0)
            return r3
        L2f:
            r3 = 0
            return r3
    }

    public static java.lang.String h(java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L19
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "fk_dl_0_"
            r3.<init>(r0)
            long r0 = java.lang.System.currentTimeMillis()
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            return r3
        L19:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "fk_dl_"
            r0.<init>(r1)
            int r3 = r3.hashCode()
            int r3 = java.lang.Math.abs(r3)
            r0.append(r3)
            java.lang.String r3 = "_"
            r0.append(r3)
            long r1 = java.lang.System.currentTimeMillis()
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static void j(java.lang.Class r4, j8.m r5) {
            if (r4 != 0) goto L3
            goto L39
        L3:
            java.util.concurrent.atomic.AtomicBoolean r0 = j8.n.f6810d
            r1 = 1
            r2 = 0
            boolean r0 = r0.compareAndSet(r2, r1)
            if (r0 != 0) goto Le
            goto L39
        Le:
            ba.f r0 = new ba.f     // Catch: java.lang.Throwable -> L2f
            r1 = 14
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2f
            java.util.Set r0 = de.robv.android.xposed.XposedBridge.hookAllConstructors(r4, r0)     // Catch: java.lang.Throwable -> L2f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2f
        L1d:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L2f
            if (r1 == 0) goto L31
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L2f
            de.robv.android.xposed.XC_MethodHook$Unhook r1 = (de.robv.android.xposed.XC_MethodHook.Unhook) r1     // Catch: java.lang.Throwable -> L2f
            r8.i r3 = r8.i.f11631b     // Catch: java.lang.Throwable -> L2f
            r3.a(r1)     // Catch: java.lang.Throwable -> L2f
            goto L1d
        L2f:
            r4 = move-exception
            goto L3a
        L31:
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.staticInstance(r4)     // Catch: java.lang.Throwable -> L2f
            if (r4 == 0) goto L39
            j8.n.f6811e = r4     // Catch: java.lang.Throwable -> L2f
        L39:
            return
        L3a:
            java.util.concurrent.atomic.AtomicBoolean r0 = j8.n.f6810d
            r0.set(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Mars CDN实例捕获Hook安装失败: "
            r0.<init>(r1)
            java.lang.String r4 = r4.getMessage()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "[WeChatImageApi] "
            java.lang.String r4 = r0.concat(r4)
            r5.a(r4)
            return
    }

    public static java.io.InputStream o(java.lang.ClassLoader r10, java.lang.String r11) {
            r0 = 0
            if (r10 == 0) goto L92
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            if (r1 == 0) goto Lb
            goto L92
        Lb:
            java.lang.String r1 = "com.tencent.mm.vfs.w6"
            java.lang.String r2 = "com.tencent.mm.vfs.p6"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            r2 = 0
            r3 = r2
        L15:
            r4 = 2
            if (r3 >= r4) goto L92
            r5 = r1[r3]
            java.lang.Class r5 = h.Hchat.utils.KavaReflector.loadClass(r5, r10)
            if (r5 != 0) goto L22
            goto L8f
        L22:
            java.lang.String r6 = "E"
            java.lang.String r7 = "F"
            java.lang.String[] r6 = new java.lang.String[]{r6, r7}
            r7 = r2
        L2b:
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            if (r7 >= r4) goto L4b
            r9 = r6[r7]
            java.lang.Class[] r8 = new java.lang.Class[]{r8}
            java.lang.reflect.Method r8 = h.Hchat.utils.KavaReflector.findMethod(r5, r9, r8)
            java.lang.Object[] r9 = new java.lang.Object[]{r11}
            java.lang.Object r8 = h.Hchat.utils.KavaReflector.invoke(r8, r0, r9)
            boolean r9 = r8 instanceof java.io.InputStream
            if (r9 == 0) goto L48
            java.io.InputStream r8 = (java.io.InputStream) r8
            return r8
        L48:
            int r7 = r7 + 1
            goto L2b
        L4b:
            java.util.List r4 = h.Hchat.utils.KavaReflector.declaredMethods(r5)
            java.util.Iterator r4 = r4.iterator()
        L53:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L8f
            java.lang.Object r5 = r4.next()
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            int r6 = r5.getModifiers()
            boolean r6 = java.lang.reflect.Modifier.isStatic(r6)
            if (r6 != 0) goto L6a
            goto L53
        L6a:
            java.lang.Class r6 = r5.getReturnType()
            java.lang.Class<java.io.InputStream> r7 = java.io.InputStream.class
            if (r6 == r7) goto L73
            goto L53
        L73:
            java.lang.Class[] r6 = r5.getParameterTypes()
            int r7 = r6.length
            r9 = 1
            if (r7 != r9) goto L53
            r6 = r6[r2]
            if (r6 == r8) goto L80
            goto L53
        L80:
            java.lang.Object[] r6 = new java.lang.Object[]{r11}
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.invoke(r5, r0, r6)
            boolean r6 = r5 instanceof java.io.InputStream
            if (r6 == 0) goto L53
            java.io.InputStream r5 = (java.io.InputStream) r5
            return r5
        L8f:
            int r3 = r3 + 1
            goto L15
        L92:
            return r0
    }

    public static boolean t(java.lang.Object r8, java.lang.String r9) {
            r0 = 5
            java.lang.reflect.Field[] r1 = new java.lang.reflect.Field[r0]
            java.lang.Class r2 = r8.getClass()
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredFields(r2)
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
            r4 = r3
        L11:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L38
            java.lang.Object r5 = r2.next()
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            boolean r6 = h.Hchat.utils.KavaReflector.isStatic(r5)
            if (r6 == 0) goto L24
            goto L11
        L24:
            java.lang.Class r6 = r5.getType()
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            if (r6 == r7) goto L2d
            goto L11
        L2d:
            if (r4 >= r0) goto L35
            java.lang.reflect.Field r5 = h.Hchat.utils.KavaReflector.accessible(r5)
            r1[r4] = r5
        L35:
            int r4 = r4 + 1
            goto L11
        L38:
            if (r4 >= r0) goto L3b
            goto L6a
        L3b:
            r0 = r1[r3]
            boolean r9 = h.Hchat.utils.KavaReflector.writeField(r0, r8, r9)
            if (r9 == 0) goto L6a
            r9 = 1
            r0 = r1[r9]
            java.lang.String r2 = ""
            boolean r0 = h.Hchat.utils.KavaReflector.writeField(r0, r8, r2)
            if (r0 == 0) goto L6a
            r0 = 2
            r0 = r1[r0]
            boolean r0 = h.Hchat.utils.KavaReflector.writeField(r0, r8, r2)
            if (r0 == 0) goto L6a
            r0 = 3
            r0 = r1[r0]
            boolean r0 = h.Hchat.utils.KavaReflector.writeField(r0, r8, r2)
            if (r0 == 0) goto L6a
            r0 = 4
            r0 = r1[r0]
            boolean r8 = h.Hchat.utils.KavaReflector.writeField(r0, r8, r2)
            if (r8 == 0) goto L6a
            return r9
        L6a:
            return r3
    }

    public static boolean u(java.lang.Object r12, java.lang.String r13) {
            java.lang.String r0 = ""
            java.lang.Class r1 = r12.getClass()
            java.lang.reflect.Field r2 = g(r1)
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.readField(r2, r12)
            boolean r3 = r2 instanceof java.lang.Integer
            r4 = 0
            if (r3 != 0) goto L15
            goto L9c
        L15:
            r3 = 0
        L16:
            r5 = 1
            if (r1 == 0) goto L64
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            if (r1 == r6) goto L64
            java.util.List r7 = h.Hchat.utils.KavaReflector.declaredMethods(r1)
            java.util.Iterator r7 = r7.iterator()
        L25:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L5f
            java.lang.Object r8 = r7.next()
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            java.lang.Class[] r9 = r8.getParameterTypes()
            int r10 = r9.length
            r11 = 2
            if (r10 != r11) goto L25
            r10 = r9[r4]
            java.lang.Class r11 = java.lang.Integer.TYPE
            if (r10 == r11) goto L43
            java.lang.Class<java.lang.Integer> r11 = java.lang.Integer.class
            if (r10 != r11) goto L25
        L43:
            r9 = r9[r5]
            if (r9 != r6) goto L25
            java.lang.String r9 = "set"
            java.lang.String r10 = r8.getName()
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L58
            java.lang.reflect.Method r3 = h.Hchat.utils.KavaReflector.accessible(r8)
            goto L64
        L58:
            if (r3 != 0) goto L25
            java.lang.reflect.Method r3 = h.Hchat.utils.KavaReflector.accessible(r8)
            goto L25
        L5f:
            java.lang.Class r1 = r1.getSuperclass()
            goto L16
        L64:
            if (r3 != 0) goto L67
            goto L9c
        L67:
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r1 = r2.intValue()
            java.lang.Object[] r13 = new java.lang.Object[]{r2, r13}     // Catch: java.lang.Throwable -> L9c
            h.Hchat.utils.KavaReflector.invokeOrThrow(r3, r12, r13)     // Catch: java.lang.Throwable -> L9c
            int r13 = r1 + 4
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch: java.lang.Throwable -> L9c
            java.lang.Object[] r13 = new java.lang.Object[]{r13, r0}     // Catch: java.lang.Throwable -> L9c
            h.Hchat.utils.KavaReflector.invokeOrThrow(r3, r12, r13)     // Catch: java.lang.Throwable -> L9c
            int r13 = r1 + 5
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch: java.lang.Throwable -> L9c
            java.lang.Object[] r13 = new java.lang.Object[]{r13, r0}     // Catch: java.lang.Throwable -> L9c
            h.Hchat.utils.KavaReflector.invokeOrThrow(r3, r12, r13)     // Catch: java.lang.Throwable -> L9c
            int r1 = r1 + 6
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L9c
            java.lang.Object[] r13 = new java.lang.Object[]{r13, r0}     // Catch: java.lang.Throwable -> L9c
            h.Hchat.utils.KavaReflector.invokeOrThrow(r3, r12, r13)     // Catch: java.lang.Throwable -> L9c
            return r5
        L9c:
            return r4
    }

    public final java.lang.Object[] a(java.lang.reflect.Method r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, boolean r14) {
            r9 = this;
            java.lang.Class[] r10 = r10.getParameterTypes()
            int r0 = r10.length
            java.lang.Object[] r0 = new java.lang.Object[r0]
            boolean r1 = android.text.TextUtils.isEmpty(r13)
            r2 = 0
            java.lang.String r3 = ""
            if (r1 == 0) goto L12
            r13 = r3
            goto L63
        L12:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "<msg><appinfo><appid>"
            r1.<init>(r4)
            int r4 = r13.length()
            if (r4 != 0) goto L21
            r13 = r3
            goto L5d
        L21:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r5 = r13.length()
            r4.<init>(r5)
            r5 = r2
        L2b:
            int r6 = r13.length()
            if (r5 >= r6) goto L59
            char r6 = r13.charAt(r5)
            r7 = 38
            if (r6 != r7) goto L3f
            java.lang.String r6 = "&amp;"
            r4.append(r6)
            goto L56
        L3f:
            r7 = 60
            if (r6 != r7) goto L49
            java.lang.String r6 = "&lt;"
            r4.append(r6)
            goto L56
        L49:
            r7 = 62
            if (r6 != r7) goto L53
            java.lang.String r6 = "&gt;"
            r4.append(r6)
            goto L56
        L53:
            r4.append(r6)
        L56:
            int r5 = r5 + 1
            goto L2b
        L59:
            java.lang.String r13 = r4.toString()
        L5d:
            java.lang.String r4 = "</appid></appinfo></msg>"
            java.lang.String r13 = eh.a.r(r1, r13, r4)
        L63:
            int r1 = r10.length
            r4 = 8
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            if (r1 != r4) goto L70
            r1 = 5
            r4 = r10[r1]
            if (r4 != r5) goto L70
            goto L71
        L70:
            r1 = -1
        L71:
            r4 = r2
        L72:
            int r6 = r10.length
            if (r4 >= r6) goto Lcb
            r6 = r10[r4]
            if (r4 != 0) goto L86
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            boolean r7 = r7.isAssignableFrom(r6)
            if (r7 == 0) goto L86
            android.content.Context r6 = r9.f6812a
            r0[r4] = r6
            goto Lc8
        L86:
            r7 = 1
            if (r4 != r7) goto L8e
            if (r6 != r5) goto L8e
            r0[r4] = r11
            goto Lc8
        L8e:
            r8 = 2
            if (r4 != r8) goto L96
            if (r6 != r5) goto L96
            r0[r4] = r12
            goto Lc8
        L96:
            if (r4 != r1) goto L9b
            r0[r4] = r13
            goto Lc8
        L9b:
            java.lang.Class r8 = java.lang.Integer.TYPE
            if (r6 == r8) goto Lbb
            java.lang.Class<java.lang.Integer> r8 = java.lang.Integer.class
            if (r6 != r8) goto La4
            goto Lbb
        La4:
            java.lang.Class r7 = java.lang.Boolean.TYPE
            if (r6 == r7) goto Lb6
            java.lang.Class<java.lang.Boolean> r7 = java.lang.Boolean.class
            if (r6 != r7) goto Lad
            goto Lb6
        Lad:
            if (r6 != r5) goto Lb2
            r0[r4] = r3
            goto Lc8
        Lb2:
            r6 = 0
            r0[r4] = r6
            goto Lc8
        Lb6:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r0[r4] = r6
            goto Lc8
        Lbb:
            if (r14 == 0) goto Lc1
            r6 = 3
            if (r4 != r6) goto Lc1
            goto Lc2
        Lc1:
            r7 = r2
        Lc2:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r0[r4] = r6
        Lc8:
            int r4 = r4 + 1
            goto L72
        Lcb:
            return r0
    }

    public final java.lang.String c() {
            r4 = this;
            h.Hchat.dexkit.DexFinder r0 = r4.f6813b
            java.lang.Class<?> r0 = r0.marsCdnManagerClass
            i8.f r1 = r4.f6814c
            j(r0, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "marsReady="
            r0.<init>(r1)
            h.Hchat.dexkit.DexFinder r1 = r4.f6813b
            boolean r1 = r1.isMarsCdnReady()
            r0.append(r1)
            java.lang.String r1 = " managerClass="
            r0.append(r1)
            h.Hchat.dexkit.DexFinder r1 = r4.f6813b
            java.lang.Class<?> r1 = r1.marsCdnManagerClass
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L28
            r1 = r3
            goto L29
        L28:
            r1 = r2
        L29:
            r0.append(r1)
            java.lang.String r1 = " requestClass="
            r0.append(r1)
            h.Hchat.dexkit.DexFinder r1 = r4.f6813b
            java.lang.Class<?> r1 = r1.marsCdnDownloadRequestClass
            if (r1 == 0) goto L39
            r1 = r3
            goto L3a
        L39:
            r1 = r2
        L3a:
            r0.append(r1)
            java.lang.String r1 = " callbackClass="
            r0.append(r1)
            h.Hchat.dexkit.DexFinder r1 = r4.f6813b
            java.lang.Class<?> r1 = r1.marsCdnDownloadCallbackClass
            if (r1 == 0) goto L4a
            r1 = r3
            goto L4b
        L4a:
            r1 = r2
        L4b:
            r0.append(r1)
            java.lang.String r1 = " startMethod="
            r0.append(r1)
            h.Hchat.dexkit.DexFinder r1 = r4.f6813b
            java.lang.reflect.Method r1 = r1.marsCdnStartDownloadMethod
            if (r1 == 0) goto L5b
            r1 = r3
            goto L5c
        L5b:
            r1 = r2
        L5c:
            r0.append(r1)
            java.lang.String r1 = " managerInstance="
            r0.append(r1)
            java.lang.Object r1 = j8.n.f6811e
            if (r1 == 0) goto L69
            r2 = r3
        L69:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final boolean d(java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11, b5.c r12) {
            r7 = this;
            r0 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r2 = j8.n.f6811e
            if (r2 != 0) goto L16
            h.Hchat.dexkit.DexFinder r3 = r7.f6813b
            java.lang.Class<?> r3 = r3.marsCdnManagerClass
            java.lang.Object r3 = h.Hchat.utils.KavaReflector.staticInstance(r3)
            if (r3 == 0) goto L16
            j8.n.f6811e = r3
            r2 = r3
        L16:
            r3 = 0
            if (r2 != 0) goto L1f
            java.lang.String r8 = "Mars CDN未提交: 尚未捕获CdnManager实例"
            r7.k(r8)
            return r3
        L1f:
            h.Hchat.dexkit.DexFinder r4 = r7.f6813b     // Catch: java.lang.Throwable -> L37
            java.lang.Class<?> r4 = r4.marsCdnDownloadRequestClass     // Catch: java.lang.Throwable -> L37
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L37
            java.lang.reflect.Constructor r4 = h.Hchat.utils.KavaReflector.findConstructor(r4, r5)     // Catch: java.lang.Throwable -> L37
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L37
            java.lang.Object r4 = h.Hchat.utils.KavaReflector.newInstance(r4, r5)     // Catch: java.lang.Throwable -> L37
            if (r4 != 0) goto L3a
            java.lang.String r8 = "Mars CDN未提交: 无法创建C2CDownloadRequest"
            r7.k(r8)     // Catch: java.lang.Throwable -> L37
            return r3
        L37:
            r8 = move-exception
            goto Lbb
        L3a:
            java.lang.String r5 = h(r8)     // Catch: java.lang.Throwable -> L37
            java.lang.String r6 = "setFileKey"
            b(r4, r6, r5)     // Catch: java.lang.Throwable -> L37
            java.lang.String r6 = "setFileid"
            b(r4, r6, r8)     // Catch: java.lang.Throwable -> L37
            java.lang.String r8 = "setAeskey"
            b(r4, r8, r9)     // Catch: java.lang.Throwable -> L37
            java.lang.String r8 = "setFileType"
            if (r11 <= 0) goto L52
            goto L53
        L52:
            r11 = 2
        L53:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L37
            b(r4, r8, r9)     // Catch: java.lang.Throwable -> L37
            java.lang.String r8 = "setSavePath2"
            b(r4, r8, r10)     // Catch: java.lang.Throwable -> L37
            java.lang.String r8 = "setBizid"
            b(r4, r8, r1)     // Catch: java.lang.Throwable -> L37
            java.lang.String r8 = "setApptype"
            b(r4, r8, r1)     // Catch: java.lang.Throwable -> L37
            java.lang.Class r8 = r4.getClass()     // Catch: java.lang.Throwable -> L37
            java.lang.String r9 = "build"
            java.lang.Class[] r10 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L37
            java.lang.reflect.Method r8 = h.Hchat.utils.KavaReflector.findMethod(r8, r9, r10)     // Catch: java.lang.Throwable -> L37
            if (r8 == 0) goto L7c
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L37
            h.Hchat.utils.KavaReflector.invoke(r8, r4, r9)     // Catch: java.lang.Throwable -> L37
        L7c:
            h.Hchat.dexkit.DexFinder r8 = r7.f6813b     // Catch: java.lang.Throwable -> L37
            java.lang.Class<?> r8 = r8.marsCdnDownloadCallbackClass     // Catch: java.lang.Throwable -> L37
            java.lang.ClassLoader r8 = r8.getClassLoader()     // Catch: java.lang.Throwable -> L37
            h.Hchat.dexkit.DexFinder r9 = r7.f6813b     // Catch: java.lang.Throwable -> L37
            java.lang.Class<?> r9 = r9.marsCdnDownloadCallbackClass     // Catch: java.lang.Throwable -> L37
            java.lang.Class[] r9 = new java.lang.Class[]{r9}     // Catch: java.lang.Throwable -> L37
            j8.k r10 = new j8.k     // Catch: java.lang.Throwable -> L37
            r10.<init>(r5, r12)     // Catch: java.lang.Throwable -> L37
            java.lang.Object r8 = java.lang.reflect.Proxy.newProxyInstance(r8, r9, r10)     // Catch: java.lang.Throwable -> L37
            h.Hchat.dexkit.DexFinder r9 = r7.f6813b     // Catch: java.lang.Throwable -> L37
            java.lang.reflect.Method r9 = r9.marsCdnStartDownloadMethod     // Catch: java.lang.Throwable -> L37
            java.lang.Object[] r8 = new java.lang.Object[]{r4, r8}     // Catch: java.lang.Throwable -> L37
            java.lang.Object r8 = h.Hchat.utils.KavaReflector.invoke(r9, r2, r8)     // Catch: java.lang.Throwable -> L37
            boolean r9 = r8 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L37
            if (r9 == 0) goto Lac
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L37
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L37
            return r8
        Lac:
            boolean r9 = r8 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L37
            if (r9 == 0) goto Lba
            java.lang.Number r8 = (java.lang.Number) r8     // Catch: java.lang.Throwable -> L37
            int r8 = r8.intValue()     // Catch: java.lang.Throwable -> L37
            if (r8 < 0) goto Lb9
            goto Lba
        Lb9:
            return r3
        Lba:
            return r0
        Lbb:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Mars CDN提交异常: "
            r9.<init>(r10)
            java.lang.Class r10 = r8.getClass()
            java.lang.String r10 = r10.getSimpleName()
            r9.append(r10)
            java.lang.String r10 = ": "
            r9.append(r10)
            java.lang.String r11 = r8.getMessage()
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            r7.k(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.Class r11 = r8.getClass()
            java.lang.String r11 = r11.getSimpleName()
            r9.append(r11)
            r9.append(r10)
            java.lang.String r8 = r8.getMessage()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r12.m(r8)
            return r3
    }

    public final boolean e(java.lang.String r9, java.lang.String r10, java.lang.String r11, int r12, j8.l r13) {
            r8 = this;
            b5.c r6 = new b5.c
            r6.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r6.f471c = r0
            r6.f469a = r13
            r6.f470b = r11
            boolean r13 = android.text.TextUtils.isEmpty(r9)
            r7 = 0
            if (r13 != 0) goto L24
            boolean r13 = android.text.TextUtils.isEmpty(r10)
            if (r13 != 0) goto L24
            boolean r13 = android.text.TextUtils.isEmpty(r11)
            if (r13 == 0) goto L27
        L24:
            r1 = r8
            goto Ld0
        L27:
            h.Hchat.dexkit.DexFinder r13 = r8.f6813b
            java.lang.Class<?> r0 = r13.marsCdnManagerClass
            i8.f r1 = r8.f6814c
            j(r0, r1)
            boolean r0 = r13.isMarsCdnReady()
            if (r0 == 0) goto Lc4
            java.lang.Class<?> r0 = r13.marsCdnManagerClass     // Catch: java.lang.Throwable -> L7a
            j(r0, r1)     // Catch: java.lang.Throwable -> L7a
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L7a
            r0.<init>(r11)     // Catch: java.lang.Throwable -> L7a
            java.io.File r0 = r0.getParentFile()     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L54
            boolean r1 = r0.isDirectory()     // Catch: java.lang.Throwable -> L50
            if (r1 != 0) goto L54
            r0.mkdirs()     // Catch: java.lang.Throwable -> L50
            goto L54
        L50:
            r0 = move-exception
            r9 = r0
            r1 = r8
            goto L7d
        L54:
            boolean r13 = r13.isMarsCdnReady()     // Catch: java.lang.Throwable -> L7a
            if (r13 != 0) goto L65
            java.lang.String r9 = "下载图片失败: Mars CDN API未就绪"
            r8.k(r9)     // Catch: java.lang.Throwable -> L50
            java.lang.String r9 = "Mars CDN API未就绪"
            r6.m(r9)     // Catch: java.lang.Throwable -> L50
            return r7
        L65:
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            boolean r9 = r1.d(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L76
            if (r9 != 0) goto L79
            java.lang.String r10 = "CDN任务提交失败"
            r6.m(r10)     // Catch: java.lang.Throwable -> L76
            return r9
        L76:
            r0 = move-exception
        L77:
            r9 = r0
            goto L7d
        L79:
            return r9
        L7a:
            r0 = move-exception
            r1 = r8
            goto L77
        L7d:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "下载图片异常: "
            r10.<init>(r11)
            java.lang.Class r11 = r9.getClass()
            java.lang.String r11 = r11.getSimpleName()
            r10.append(r11)
            java.lang.String r11 = ": "
            r10.append(r11)
            java.lang.String r12 = r9.getMessage()
            r10.append(r12)
            java.lang.String r10 = r10.toString()
            r8.k(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.Class r12 = r9.getClass()
            java.lang.String r12 = r12.getSimpleName()
            r10.append(r12)
            r10.append(r11)
            java.lang.String r9 = r9.getMessage()
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r6.m(r9)
            return r7
        Lc4:
            r1 = r8
            java.lang.String r9 = "下载图片失败: CDN API未就绪"
            r8.k(r9)
            java.lang.String r9 = "CDN API未就绪"
            r6.m(r9)
            return r7
        Ld0:
            java.lang.String r9 = "下载图片失败: cdnUrl/aesKey/savePath为空"
            r8.k(r9)
            java.lang.String r9 = "cdnUrl/aesKey/savePath为空"
            r6.m(r9)
            return r7
    }

    public final java.lang.reflect.Constructor f() {
            r7 = this;
            h.Hchat.dexkit.DexFinder r0 = r7.f6813b
            java.lang.Class<?> r1 = r0.sendImageAsyncParamsClass
            java.lang.Class<?> r0 = r0.sendImageCrossParamsClass
            java.util.List r1 = h.Hchat.utils.KavaReflector.declaredConstructors(r1)
            java.util.Iterator r1 = r1.iterator()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L48
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Constructor r2 = (java.lang.reflect.Constructor) r2
            java.lang.Class[] r3 = r2.getParameterTypes()
            int r4 = r3.length
            r5 = 5
            if (r4 != r5) goto Le
            r4 = 0
            r4 = r3[r4]
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            if (r4 != r5) goto Le
            r4 = 1
            r4 = r3[r4]
            java.lang.Class r6 = java.lang.Integer.TYPE
            if (r4 == r6) goto L34
            java.lang.Class<java.lang.Integer> r6 = java.lang.Integer.class
            if (r4 != r6) goto Le
        L34:
            r4 = 2
            r4 = r3[r4]
            if (r4 != r5) goto Le
            r4 = 3
            r4 = r3[r4]
            if (r4 != r5) goto Le
            r4 = 4
            r3 = r3[r4]
            if (r3 != r0) goto Le
            java.lang.reflect.Constructor r0 = h.Hchat.utils.KavaReflector.accessible(r2)
            return r0
        L48:
            r0 = 0
            return r0
    }

    public final java.lang.Object i(java.lang.Class r5) {
            r4 = this;
            h.Hchat.dexkit.DexFinder r0 = r4.f6813b
            java.lang.reflect.Method r1 = r0.imageStorageGetterMethod
            if (r1 == 0) goto L28
            boolean r2 = h.Hchat.utils.KavaReflector.isStatic(r1)
            if (r2 == 0) goto L28
            java.lang.Class[] r2 = r1.getParameterTypes()
            int r2 = r2.length
            if (r2 != 0) goto L28
            java.lang.Class r2 = r1.getReturnType()
            if (r2 != r5) goto L28
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.invoke(r1, r3, r2)
            boolean r2 = r5.isInstance(r1)
            if (r2 == 0) goto L28
            return r1
        L28:
            java.lang.Object r5 = ig.a.A(r0, r5)
            return r5
    }

    public final void k(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "[WeChatImageApi] "
            java.lang.String r2 = r0.concat(r2)
            i8.i.f(r2)
            return
    }

    public final synchronized java.lang.String l(java.lang.ClassLoader r7, java.lang.String r8) {
            r6 = this;
            java.lang.String r0 = "image_"
            monitor-enter(r6)
            boolean r1 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> Ld
            if (r1 == 0) goto L10
            java.lang.String r7 = ""
            monitor-exit(r6)
            return r7
        Ld:
            r7 = move-exception
            goto Lea
        L10:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> Ld
            r1.<init>(r8)     // Catch: java.lang.Throwable -> Ld
            boolean r2 = r1.isFile()     // Catch: java.lang.Throwable -> Ld
            if (r2 == 0) goto L21
            java.lang.String r7 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r6)
            return r7
        L21:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> Ld
            android.content.Context r2 = r6.f6812a     // Catch: java.lang.Throwable -> Ld
            java.io.File r2 = r2.getCacheDir()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r3 = "Hchat_message_image"
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Ld
            boolean r2 = r1.isDirectory()     // Catch: java.lang.Throwable -> Ld
            if (r2 != 0) goto L3e
            boolean r2 = r1.mkdirs()     // Catch: java.lang.Throwable -> Ld
            if (r2 != 0) goto L3e
            java.lang.String r7 = ""
            monitor-exit(r6)
            return r7
        L3e:
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> Ld
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld
            r3.<init>(r0)     // Catch: java.lang.Throwable -> Ld
            int r0 = r8.hashCode()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = java.lang.Integer.toHexString(r0)     // Catch: java.lang.Throwable -> Ld
            r3.append(r0)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = ".jpg"
            r3.append(r0)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> Ld
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> Ld
            boolean r0 = r2.isFile()     // Catch: java.lang.Throwable -> Ld
            r3 = 0
            if (r0 == 0) goto L72
            long r0 = r2.length()     // Catch: java.lang.Throwable -> Ld
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L72
            java.lang.String r7 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r6)
            return r7
        L72:
            java.io.InputStream r7 = o(r7, r8)     // Catch: java.lang.Throwable -> Ld
            if (r7 != 0) goto L7c
            java.lang.String r7 = ""
            monitor-exit(r6)
            return r7
        L7c:
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lb1
            r0 = 0
            r8.<init>(r2, r0)     // Catch: java.lang.Throwable -> Lb1
            r1 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L90
        L86:
            int r5 = r7.read(r1)     // Catch: java.lang.Throwable -> L90
            if (r5 <= 0) goto L92
            r8.write(r1, r0, r5)     // Catch: java.lang.Throwable -> L90
            goto L86
        L90:
            r0 = move-exception
            goto Lb3
        L92:
            r8.close()     // Catch: java.lang.Throwable -> Lb1
            r7.close()     // Catch: java.lang.Throwable -> Laf
            boolean r7 = r2.isFile()     // Catch: java.lang.Throwable -> Ld
            if (r7 == 0) goto Lab
            long r7 = r2.length()     // Catch: java.lang.Throwable -> Ld
            int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r7 <= 0) goto Lab
            java.lang.String r7 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> Ld
            goto Lad
        Lab:
            java.lang.String r7 = ""
        Lad:
            monitor-exit(r6)
            return r7
        Laf:
            r7 = move-exception
            goto Lc5
        Lb1:
            r8 = move-exception
            goto Lbc
        Lb3:
            r8.close()     // Catch: java.lang.Throwable -> Lb7
            goto Lbb
        Lb7:
            r8 = move-exception
            r0.addSuppressed(r8)     // Catch: java.lang.Throwable -> Lb1
        Lbb:
            throw r0     // Catch: java.lang.Throwable -> Lb1
        Lbc:
            r7.close()     // Catch: java.lang.Throwable -> Lc0
            goto Lc4
        Lc0:
            r7 = move-exception
            r8.addSuppressed(r7)     // Catch: java.lang.Throwable -> Laf
        Lc4:
            throw r8     // Catch: java.lang.Throwable -> Laf
        Lc5:
            boolean r8 = r2.exists()     // Catch: java.lang.Throwable -> Ld
            if (r8 == 0) goto Lce
            r2.delete()     // Catch: java.lang.Throwable -> Ld
        Lce:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld
            r8.<init>()     // Catch: java.lang.Throwable -> Ld
            java.lang.String r0 = "读取图片VFS路径异常: "
            r8.append(r0)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Throwable -> Ld
            r8.append(r7)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r7 = r8.toString()     // Catch: java.lang.Throwable -> Ld
            r6.k(r7)     // Catch: java.lang.Throwable -> Ld
            java.lang.String r7 = ""
            monitor-exit(r6)
            return r7
        Lea:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Ld
            throw r7
    }

    public final java.lang.Object m(java.lang.String r5) {
            r4 = this;
            r0 = 0
            h.Hchat.dexkit.DexFinder r1 = r4.f6813b     // Catch: java.lang.Throwable -> L24
            java.lang.Class<?> r1 = r1.sendImageAppInfoClass     // Catch: java.lang.Throwable -> L24
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L24
            java.lang.reflect.Constructor r1 = h.Hchat.utils.KavaReflector.findConstructor(r1, r3)     // Catch: java.lang.Throwable -> L24
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L24
            java.lang.Object r1 = h.Hchat.utils.KavaReflector.newInstance(r1, r2)     // Catch: java.lang.Throwable -> L24
            if (r1 != 0) goto L15
            goto L23
        L15:
            boolean r2 = u(r1, r5)     // Catch: java.lang.Throwable -> L24
            if (r2 == 0) goto L1c
            goto L22
        L1c:
            boolean r5 = t(r1, r5)     // Catch: java.lang.Throwable -> L24
            if (r5 == 0) goto L23
        L22:
            return r1
        L23:
            return r0
        L24:
            r5 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "创建图片appinfo异常: "
            r1.<init>(r2)
            java.lang.String r5 = r5.getMessage()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r4.k(r5)
            return r0
    }

    public final java.lang.Object n(java.lang.Class r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L12
            java.lang.reflect.Constructor r2 = h.Hchat.utils.KavaReflector.findConstructor(r5, r2)     // Catch: java.lang.Throwable -> L12
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L12
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.newInstance(r2, r1)     // Catch: java.lang.Throwable -> L12
            return r5
        L12:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "创建图片发送器失败: "
            r2.<init>(r3)
            java.lang.String r5 = r5.getName()
            r2.append(r5)
            java.lang.String r5 = " "
            r2.append(r5)
            java.lang.String r5 = r1.getMessage()
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r4.k(r5)
            return r0
    }

    public final java.lang.String p(java.lang.Object r6) {
            r5 = this;
            h.Hchat.dexkit.DexFinder r0 = r5.f6813b
            java.lang.reflect.Method r0 = r0.imageBestPathMethod
            java.lang.String r1 = ""
            if (r6 == 0) goto L5c
            if (r0 != 0) goto Lb
            goto L5c
        Lb:
            java.lang.Class[] r2 = r0.getParameterTypes()
            int r3 = r2.length
            r4 = 1
            if (r3 != r4) goto L5c
            r3 = 0
            r2 = r2[r3]
            boolean r2 = r2.isInstance(r6)
            if (r2 != 0) goto L1d
            goto L5c
        L1d:
            java.lang.Class r2 = r0.getDeclaringClass()     // Catch: java.lang.Throwable -> L46
            java.lang.Object r2 = r5.i(r2)     // Catch: java.lang.Throwable -> L46
            if (r2 != 0) goto L28
            goto L5c
        L28:
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L46
            java.lang.Object r6 = h.Hchat.utils.KavaReflector.invoke(r0, r2, r6)     // Catch: java.lang.Throwable -> L46
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L46
            boolean r2 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L39
            goto L5c
        L39:
            java.lang.Class r0 = r0.getDeclaringClass()     // Catch: java.lang.Throwable -> L46
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Throwable -> L46
            java.lang.String r6 = r5.l(r0, r6)     // Catch: java.lang.Throwable -> L46
            return r6
        L46:
            r6 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "解析图片原图路径异常: "
            r0.<init>(r2)
            java.lang.String r6 = r6.getMessage()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.k(r6)
        L5c:
            return r1
    }

    public final boolean q(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
            r7 = this;
            h.Hchat.dexkit.DexFinder r0 = r7.f6813b
            r1 = 0
            java.lang.Class<?> r2 = r0.sendImageCrossParamsClass     // Catch: java.lang.Throwable -> L11
            java.lang.Object r2 = r7.n(r2)     // Catch: java.lang.Throwable -> L11
            if (r2 != 0) goto L14
            java.lang.String r8 = "新版图片appid链路失败: crossParams创建失败"
            r7.k(r8)     // Catch: java.lang.Throwable -> L11
            return r1
        L11:
            r8 = move-exception
            goto L13e
        L14:
            java.lang.String r3 = "a"
            java.lang.Class r4 = r2.getClass()     // Catch: java.lang.Throwable -> L11
            java.lang.reflect.Field r3 = h.Hchat.utils.KavaReflector.findField(r4, r3)     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L30
            java.lang.Class r4 = r3.getType()     // Catch: java.lang.Throwable -> L11
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L11
            if (r4 == r5) goto L38
            java.lang.Class r4 = r3.getType()     // Catch: java.lang.Throwable -> L11
            java.lang.Class<java.lang.Integer> r5 = java.lang.Integer.class
            if (r4 == r5) goto L38
        L30:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Throwable -> L11
            java.lang.reflect.Field r3 = g(r3)     // Catch: java.lang.Throwable -> L11
        L38:
            r4 = 6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L11
            boolean r3 = h.Hchat.utils.KavaReflector.writeField(r3, r2, r4)     // Catch: java.lang.Throwable -> L11
            if (r3 != 0) goto L49
            java.lang.String r8 = "新版图片appid链路失败: crossParams类型字段写入失败"
            r7.k(r8)     // Catch: java.lang.Throwable -> L11
            return r1
        L49:
            java.lang.Object r10 = r7.m(r10)     // Catch: java.lang.Throwable -> L11
            if (r10 != 0) goto L55
            java.lang.String r8 = "新版图片appid链路失败: appinfo创建失败"
            r7.k(r8)     // Catch: java.lang.Throwable -> L11
            return r1
        L55:
            java.lang.Class<?> r3 = r0.sendImageAppInfoClass     // Catch: java.lang.Throwable -> L11
            if (r3 != 0) goto L5b
        L59:
            r10 = r1
            goto L7d
        L5b:
            java.lang.Class r4 = r2.getClass()     // Catch: java.lang.Throwable -> L11
            java.util.List r4 = h.Hchat.utils.KavaReflector.declaredFields(r4)     // Catch: java.lang.Throwable -> L11
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L11
        L67:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L11
            if (r5 == 0) goto L59
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L11
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5     // Catch: java.lang.Throwable -> L11
            java.lang.Class r6 = r5.getType()     // Catch: java.lang.Throwable -> L11
            if (r6 != r3) goto L67
            boolean r10 = h.Hchat.utils.KavaReflector.writeField(r5, r2, r10)     // Catch: java.lang.Throwable -> L11
        L7d:
            if (r10 != 0) goto L85
            java.lang.String r8 = "新版图片appid链路失败: appinfo字段写入失败"
            r7.k(r8)     // Catch: java.lang.Throwable -> L11
            return r1
        L85:
            java.lang.reflect.Constructor r10 = r7.f()     // Catch: java.lang.Throwable -> L11
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L11
            java.lang.String r4 = ""
            g8.a r5 = h.Hchat.hooks.api.core.WeChatApis.account()     // Catch: java.lang.Throwable -> La0
            if (r5 == 0) goto La0
            g8.a r5 = h.Hchat.hooks.api.core.WeChatApis.account()     // Catch: java.lang.Throwable -> La0
            java.lang.String r5 = r5.c()     // Catch: java.lang.Throwable -> La0
            if (r5 == 0) goto La0
            r4 = r5
        La0:
            java.lang.Object[] r8 = new java.lang.Object[]{r9, r3, r4, r8, r2}     // Catch: java.lang.Throwable -> L11
            java.lang.Object r8 = h.Hchat.utils.KavaReflector.newInstance(r10, r8)     // Catch: java.lang.Throwable -> L11
            if (r8 != 0) goto Lb1
            java.lang.String r8 = "新版图片appid链路失败: params创建失败"
            r7.k(r8)     // Catch: java.lang.Throwable -> L11
            goto L12d
        Lb1:
            java.lang.String r9 = "msg_raw_img_send"
            java.lang.String r10 = "send_wx_media_message_helper"
            java.lang.Class r2 = r8.getClass()     // Catch: java.lang.Throwable -> L11
        Lb9:
            if (r2 == 0) goto Lf6
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            if (r2 == r3) goto Lf6
            java.util.List r3 = h.Hchat.utils.KavaReflector.declaredFields(r2)     // Catch: java.lang.Throwable -> L11
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L11
        Lc7:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L11
            if (r4 == 0) goto Lf1
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L11
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4     // Catch: java.lang.Throwable -> L11
            boolean r5 = h.Hchat.utils.KavaReflector.isStatic(r4)     // Catch: java.lang.Throwable -> L11
            if (r5 != 0) goto Lc7
            java.lang.Class r5 = r4.getType()     // Catch: java.lang.Throwable -> L11
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            if (r5 == r6) goto Le2
            goto Lc7
        Le2:
            java.lang.Object r5 = h.Hchat.utils.KavaReflector.readField(r4, r8)     // Catch: java.lang.Throwable -> L11
            boolean r5 = r9.equals(r5)     // Catch: java.lang.Throwable -> L11
            if (r5 == 0) goto Lc7
            boolean r9 = h.Hchat.utils.KavaReflector.writeField(r4, r8, r10)     // Catch: java.lang.Throwable -> L11
            goto Lf7
        Lf1:
            java.lang.Class r2 = r2.getSuperclass()     // Catch: java.lang.Throwable -> L11
            goto Lb9
        Lf6:
            r9 = r1
        Lf7:
            if (r9 != 0) goto Lff
            java.lang.String r8 = "新版图片appid链路失败: 外部来源字段写入失败"
            r7.k(r8)     // Catch: java.lang.Throwable -> L11
            goto L12d
        Lff:
            java.lang.reflect.Method r9 = r0.sendImageAsyncSubmitMethod     // Catch: java.lang.Throwable -> L11
            java.lang.Class r10 = r9.getDeclaringClass()     // Catch: java.lang.Throwable -> L11
            java.lang.Object r10 = ig.a.A(r0, r10)     // Catch: java.lang.Throwable -> L11
            boolean r0 = h.Hchat.utils.KavaReflector.isStatic(r9)     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto L12e
            if (r10 != 0) goto L12e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11
            r8.<init>()     // Catch: java.lang.Throwable -> L11
            java.lang.String r10 = "新版图片appid链路失败: 服务不可用 "
            r8.append(r10)     // Catch: java.lang.Throwable -> L11
            java.lang.Class r9 = r9.getDeclaringClass()     // Catch: java.lang.Throwable -> L11
            java.lang.String r9 = r9.getName()     // Catch: java.lang.Throwable -> L11
            r8.append(r9)     // Catch: java.lang.Throwable -> L11
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L11
            r7.k(r8)     // Catch: java.lang.Throwable -> L11
        L12d:
            return r1
        L12e:
            boolean r0 = h.Hchat.utils.KavaReflector.isStatic(r9)     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L135
            r10 = 0
        L135:
            java.lang.Object[] r8 = new java.lang.Object[]{r8}     // Catch: java.lang.Throwable -> L11
            h.Hchat.utils.KavaReflector.invokeOrThrow(r9, r10, r8)     // Catch: java.lang.Throwable -> L11
            r8 = 1
            return r8
        L13e:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "新版图片appid链路异常: "
            r9.<init>(r10)
            java.lang.String r8 = r8.getMessage()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.k(r8)
            return r1
    }

    public final boolean r(java.lang.String r12, java.lang.String r13, java.lang.String r14, boolean r15) {
            r11 = this;
            java.lang.String r0 = "发送图片失败: 无法创建 "
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            r2 = 0
            if (r1 != 0) goto Lf
            boolean r1 = android.text.TextUtils.isEmpty(r13)
            if (r1 == 0) goto L12
        Lf:
            r5 = r11
            goto Le0
        L12:
            boolean r1 = eh.a.y(r13)
            if (r1 != 0) goto L2a
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r14 = "发送图片失败: 文件不存在 "
            r12.<init>(r14)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.k(r12)
            return r2
        L2a:
            h.Hchat.dexkit.DexFinder r1 = r11.f6813b
            java.lang.reflect.Method r3 = r1.sendImageMethod
            if (r3 != 0) goto L47
            java.lang.Class<?> r3 = r1.sendImageAsyncParamsClass
            if (r3 == 0) goto L41
            java.lang.Class<?> r3 = r1.sendImageCrossParamsClass
            if (r3 == 0) goto L41
            java.lang.Class<?> r3 = r1.sendImageAppInfoClass
            if (r3 == 0) goto L41
            java.lang.reflect.Method r3 = r1.sendImageAsyncSubmitMethod
            if (r3 == 0) goto L41
            goto L47
        L41:
            java.lang.String r12 = "发送图片失败: API未就绪"
            r11.k(r12)
            return r2
        L47:
            boolean r3 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Throwable -> Lc7
            r4 = 1
            if (r3 != 0) goto L7a
            boolean r3 = r11.s()     // Catch: java.lang.Throwable -> L76
            if (r3 == 0) goto L7a
            java.lang.Class<?> r3 = r1.sendImageAsyncParamsClass     // Catch: java.lang.Throwable -> L76
            if (r3 == 0) goto L66
            java.lang.Class<?> r3 = r1.sendImageCrossParamsClass     // Catch: java.lang.Throwable -> L76
            if (r3 == 0) goto L66
            java.lang.Class<?> r3 = r1.sendImageAppInfoClass     // Catch: java.lang.Throwable -> L76
            if (r3 == 0) goto L66
            java.lang.reflect.Method r3 = r1.sendImageAsyncSubmitMethod     // Catch: java.lang.Throwable -> L76
            if (r3 == 0) goto L66
            r3 = r4
            goto L67
        L66:
            r3 = r2
        L67:
            if (r3 == 0) goto L7a
            boolean r3 = r11.q(r12, r13, r14)     // Catch: java.lang.Throwable -> L76
            if (r3 == 0) goto L70
            return r4
        L70:
            java.lang.String r3 = "新版图片appid链路失败，回退短签名"
            r11.k(r3)     // Catch: java.lang.Throwable -> L76
            goto L7a
        L76:
            r0 = move-exception
            r12 = r0
            r5 = r11
            goto Lca
        L7a:
            java.lang.reflect.Method r6 = r1.sendImageMethod     // Catch: java.lang.Throwable -> Lc7
            if (r6 != 0) goto L84
            java.lang.String r12 = "发送图片失败: 短签名API未就绪"
            r11.k(r12)     // Catch: java.lang.Throwable -> L76
            return r2
        L84:
            boolean r3 = h.Hchat.utils.KavaReflector.isStatic(r6)     // Catch: java.lang.Throwable -> Lc7
            if (r3 == 0) goto L8c
            r1 = 0
            goto L9f
        L8c:
            java.lang.Class r3 = r6.getDeclaringClass()     // Catch: java.lang.Throwable -> Lc7
            java.lang.Object r1 = ig.a.A(r1, r3)     // Catch: java.lang.Throwable -> Lc7
            if (r1 == 0) goto L97
            goto L9f
        L97:
            java.lang.Class r1 = r6.getDeclaringClass()     // Catch: java.lang.Throwable -> Lc7
            java.lang.Object r1 = r11.n(r1)     // Catch: java.lang.Throwable -> Lc7
        L9f:
            boolean r3 = h.Hchat.utils.KavaReflector.isStatic(r6)     // Catch: java.lang.Throwable -> Lc7
            if (r3 != 0) goto Lb7
            if (r1 != 0) goto Lb7
            java.lang.Class r12 = r6.getDeclaringClass()     // Catch: java.lang.Throwable -> L76
            java.lang.String r12 = r12.getName()     // Catch: java.lang.Throwable -> L76
            java.lang.String r12 = r0.concat(r12)     // Catch: java.lang.Throwable -> L76
            r11.k(r12)     // Catch: java.lang.Throwable -> L76
            return r2
        Lb7:
            r5 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            r10 = r15
            java.lang.Object[] r12 = r5.a(r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> Lc4
            h.Hchat.utils.KavaReflector.invoke(r6, r1, r12)     // Catch: java.lang.Throwable -> Lc4
            return r4
        Lc4:
            r0 = move-exception
        Lc5:
            r12 = r0
            goto Lca
        Lc7:
            r0 = move-exception
            r5 = r11
            goto Lc5
        Lca:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "发送图片异常: "
            r13.<init>(r14)
            java.lang.String r12 = r12.getMessage()
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            r11.k(r12)
            return r2
        Le0:
            java.lang.String r12 = "发送图片失败: talker/imagePath为空"
            r11.k(r12)
            return r2
    }

    public final boolean s() {
            r9 = this;
            java.lang.String r0 = ""
            android.content.Context r1 = r9.f6812a
            r2 = 0
            o8.k r3 = h.Hchat.hooks.api.core.WeChatApis.version()     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L1d
            o8.k r3 = h.Hchat.hooks.api.core.WeChatApis.version()     // Catch: java.lang.Throwable -> L1d
            l8.i r3 = r3.b()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = r3.f7929d     // Catch: java.lang.Throwable -> L1d
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L1d
            if (r4 != 0) goto L1d
        L1b:
            r0 = r3
            goto L30
        L1d:
            android.content.pm.PackageManager r3 = r1.getPackageManager()     // Catch: java.lang.Throwable -> L30
            java.lang.String r4 = r1.getPackageName()     // Catch: java.lang.Throwable -> L30
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r4, r2)     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L30
            java.lang.String r3 = r3.versionName     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L30
            goto L1b
        L30:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            r4 = 1
            if (r3 == 0) goto L38
            goto L7e
        L38:
            java.lang.String r3 = "\\."
            java.lang.String[] r0 = r0.split(r3)
            r3 = 8
            r5 = 66
            int[] r3 = new int[]{r3, r2, r5}
            r5 = r2
        L47:
            r6 = 3
            if (r5 >= r6) goto Lba
            int r6 = r0.length
            if (r5 >= r6) goto L76
            r6 = r0[r5]
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 == 0) goto L56
            goto L76
        L56:
            r7 = r2
        L57:
            int r8 = r6.length()
            if (r7 >= r8) goto L6a
            char r8 = r6.charAt(r7)
            boolean r8 = java.lang.Character.isDigit(r8)
            if (r8 == 0) goto L6a
            int r7 = r7 + 1
            goto L57
        L6a:
            if (r7 != 0) goto L6d
            goto L76
        L6d:
            java.lang.String r6 = r6.substring(r2, r7)     // Catch: java.lang.Throwable -> L76
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Throwable -> L76
            goto L77
        L76:
            r6 = r2
        L77:
            r7 = r3[r5]
            if (r6 <= r7) goto L7c
            goto Lba
        L7c:
            if (r6 >= r7) goto Lb7
        L7e:
            o8.k r0 = h.Hchat.hooks.api.core.WeChatApis.version()     // Catch: java.lang.Throwable -> L8f
            if (r0 == 0) goto L8f
            o8.k r0 = h.Hchat.hooks.api.core.WeChatApis.version()     // Catch: java.lang.Throwable -> L8f
            l8.i r0 = r0.b()     // Catch: java.lang.Throwable -> L8f
            long r0 = r0.f7926a     // Catch: java.lang.Throwable -> L8f
            goto Laf
        L8f:
            r5 = 0
            android.content.pm.PackageManager r0 = r1.getPackageManager()     // Catch: java.lang.Throwable -> L9f
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Throwable -> L9f
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)     // Catch: java.lang.Throwable -> L9f
            if (r0 != 0) goto La1
        L9f:
            r0 = r5
            goto Laf
        La1:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L9f
            r3 = 28
            if (r1 < r3) goto Lac
            long r0 = b0.b0.b(r0)     // Catch: java.lang.Throwable -> L9f
            goto Laf
        Lac:
            int r0 = r0.versionCode     // Catch: java.lang.Throwable -> L9f
            long r0 = (long) r0
        Laf:
            r5 = 2980(0xba4, double:1.4723E-320)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 < 0) goto Lb6
            r2 = r4
        Lb6:
            return r2
        Lb7:
            int r5 = r5 + 1
            goto L47
        Lba:
            return r4
    }
}
