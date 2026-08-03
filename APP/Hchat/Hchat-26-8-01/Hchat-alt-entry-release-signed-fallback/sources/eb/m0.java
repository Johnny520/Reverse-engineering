package eb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final eb.m0 f2587a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f2588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final java.util.LinkedHashMap f2589c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final java.util.LinkedHashMap f2590d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f2591e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f2592f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList f2593g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList f2594h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final android.os.Handler f2595i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile java.lang.ref.WeakReference f2596j;

    static {
            eb.m0 r0 = new eb.m0
            r0.<init>()
            eb.m0.f2587a = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            eb.m0.f2589c = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            eb.m0.f2590d = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            eb.m0.f2591e = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            eb.m0.f2592f = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            eb.m0.f2593g = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            eb.m0.f2594h = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            eb.m0.f2595i = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r1 = 0
            r0.<init>(r1)
            eb.m0.f2596j = r0
            return
    }

    public static final eb.h0 a(eb.m0 r9, java.lang.Object r10, java.lang.String r11) {
            java.util.concurrent.CopyOnWriteArrayList r9 = eb.m0.f2594h
            java.util.Iterator r9 = r9.iterator()
            r9.getClass()
            java.lang.String r0 = ""
            r6 = r11
            r1 = r0
            r2 = r1
        Le:
            boolean r0 = r9.hasNext()
            r3 = 0
            if (r0 == 0) goto L50
            java.lang.Object r0 = r9.next()
            r4 = r0
            eb.k0 r4 = (eb.k0) r4
            q9.a r0 = r4.f2572a     // Catch: java.lang.Throwable -> L23
            eb.l0 r3 = r0.d(r6)     // Catch: java.lang.Throwable -> L23
            goto L30
        L23:
            r0 = move-exception
            r4.getClass()
            java.lang.String r4 = r0.getMessage()
            java.lang.String r5 = "[Hchat:Script] 发送文字装饰回调失败: message_affix "
            eh.a.x(r5, r4, r0)
        L30:
            if (r3 == 0) goto Le
            java.lang.String r0 = r3.f2578b
            java.lang.String r3 = r3.f2577a
            int r4 = r3.length()
            if (r4 != 0) goto L43
            int r4 = r0.length()
            if (r4 != 0) goto L43
            goto Le
        L43:
            java.lang.String r1 = bc.e.i(r3, r1)
            java.lang.String r2 = bc.e.i(r2, r0)
            java.lang.String r6 = wb.en.h(r3, r6, r0)
            goto Le
        L50:
            int r9 = r1.length()
            if (r9 != 0) goto L5e
            int r9 = r2.length()
            if (r9 != 0) goto L5e
            goto Lc9
        L5e:
            java.lang.Object r9 = d(r10)
            boolean r0 = r9 instanceof android.widget.TextView
            if (r0 == 0) goto L74
            r0 = r9
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.CharSequence r0 = r0.getText()
            boolean r4 = r0 instanceof android.text.Editable
            if (r4 == 0) goto L76
            android.text.Editable r0 = (android.text.Editable) r0
            goto L82
        L74:
            if (r9 != 0) goto L78
        L76:
            r0 = r3
            goto L82
        L78:
            java.lang.Object r0 = h(r9)
            boolean r4 = r0 instanceof android.text.Editable
            if (r4 == 0) goto L76
            android.text.Editable r0 = (android.text.Editable) r0
        L82:
            if (r0 == 0) goto Laf
            int r3 = r2.length()
            if (r3 <= 0) goto L91
            int r3 = r0.length()
            r0.insert(r3, r2)
        L91:
            int r3 = r1.length()
            if (r3 <= 0) goto L9b
            r3 = 0
            r0.insert(r3, r1)
        L9b:
            eb.h0 r3 = new eb.h0
            if (r9 == 0) goto La1
            r4 = r9
            goto La2
        La1:
            r4 = r10
        La2:
            int r7 = r1.length()
            int r8 = r2.length()
            r5 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            goto Lc9
        Laf:
            r5 = r11
            if (r9 == 0) goto Lb4
            r4 = r9
            goto Lb5
        Lb4:
            r4 = r10
        Lb5:
            boolean r9 = l(r4, r6)
            if (r9 != 0) goto Lbc
            goto Lc9
        Lbc:
            eb.h0 r3 = new eb.h0
            int r7 = r1.length()
            int r8 = r2.length()
            r3.<init>(r4, r5, r6, r7, r8)
        Lc9:
            return r3
    }

    public static final void b(eb.m0 r5, eb.h0 r6) {
            java.lang.Object r5 = r6.f2551a
            int r0 = r6.f2555e
            boolean r1 = r5 instanceof android.widget.TextView
            r2 = 0
            if (r1 == 0) goto L11
            r1 = r5
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.CharSequence r1 = r1.getText()
            goto L1d
        L11:
            java.lang.Object r1 = h(r5)
            boolean r3 = r1 instanceof java.lang.CharSequence
            if (r3 == 0) goto L1c
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            goto L1d
        L1c:
            r1 = r2
        L1d:
            if (r1 == 0) goto L51
            java.lang.String r3 = r1.toString()
            java.lang.String r4 = r6.f2553c
            boolean r3 = gg.l.a(r3, r4)
            if (r3 != 0) goto L2c
            goto L51
        L2c:
            boolean r3 = r1 instanceof android.text.Editable
            if (r3 == 0) goto L33
            r2 = r1
            android.text.Editable r2 = (android.text.Editable) r2
        L33:
            if (r2 == 0) goto L4c
            if (r0 <= 0) goto L43
            int r5 = r2.length()
            int r5 = r5 - r0
            int r0 = r2.length()
            r2.delete(r5, r0)
        L43:
            int r5 = r6.f2554d
            if (r5 <= 0) goto L51
            r6 = 0
            r2.delete(r6, r5)
            return
        L4c:
            java.lang.String r6 = r6.f2552b
            l(r5, r6)
        L51:
            return
    }

    public static android.app.Activity c(android.content.Context r3) {
            r0 = 0
        L1:
            r1 = 0
            if (r3 == 0) goto L22
            r2 = 8
            if (r0 >= r2) goto L22
            boolean r2 = r3 instanceof android.app.Activity
            if (r2 == 0) goto Lf
            android.app.Activity r3 = (android.app.Activity) r3
            return r3
        Lf:
            boolean r2 = r3 instanceof android.content.ContextWrapper
            if (r2 == 0) goto L16
            android.content.ContextWrapper r3 = (android.content.ContextWrapper) r3
            goto L17
        L16:
            r3 = r1
        L17:
            if (r3 == 0) goto L1e
            android.content.Context r3 = r3.getBaseContext()
            goto L1f
        L1e:
            r3 = r1
        L1f:
            int r0 = r0 + 1
            goto L1
        L22:
            return r1
    }

    public static java.lang.Object d(java.lang.Object r10) {
            java.lang.Class r0 = r10.getClass()
            java.util.LinkedHashMap r1 = eb.m0.f2590d
            monitor-enter(r1)
            boolean r2 = r1.containsKey(r0)     // Catch: java.lang.Throwable -> L15
            r3 = 0
            if (r2 == 0) goto L18
            java.lang.Object r2 = r1.get(r0)     // Catch: java.lang.Throwable -> L15
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2     // Catch: java.lang.Throwable -> L15
            goto L19
        L15:
            r10 = move-exception
            goto Lcd
        L18:
            r2 = r3
        L19:
            monitor-exit(r1)
            if (r2 == 0) goto L21
            java.lang.Object r10 = h.Hchat.utils.KavaReflector.readField(r2, r10)
            return r10
        L21:
            monitor-enter(r1)
            boolean r2 = r1.containsKey(r0)     // Catch: java.lang.Throwable -> Lca
            monitor-exit(r1)
            if (r2 == 0) goto L2b
            goto Lc6
        L2b:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = r0
        L31:
            if (r2 == 0) goto L47
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L47
            java.util.List r4 = h.Hchat.utils.KavaReflector.declaredFields(r2)
            tf.r.h1(r1, r4)
            java.lang.Class r2 = r2.getSuperclass()
            goto L31
        L47:
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r4 = r2
            r5 = r3
        L4e:
            boolean r6 = r1.hasNext()
            r7 = 3
            if (r6 == 0) goto Lb4
            java.lang.Object r6 = r1.next()
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            int r8 = r6.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isStatic(r8)
            if (r8 != 0) goto L4e
            java.lang.Class r8 = r6.getType()
            boolean r8 = r8.isPrimitive()
            if (r8 == 0) goto L70
            goto L4e
        L70:
            h.Hchat.utils.KavaReflector.accessible(r6)
            java.lang.Object r8 = h.Hchat.utils.KavaReflector.readField(r6, r10)
            if (r8 == 0) goto L4e
            java.lang.Class r8 = r8.getClass()
            java.lang.String r9 = "getText"
            java.lang.reflect.Method r9 = e(r8, r9)
            if (r9 == 0) goto L86
            goto L87
        L86:
            r7 = r2
        L87:
            java.lang.String r9 = "clearComposingText"
            java.lang.reflect.Method r9 = e(r8, r9)
            if (r9 == 0) goto L91
            int r7 = r7 + 2
        L91:
            java.lang.String r9 = "getSimilarPasteSeqStr"
            java.lang.reflect.Method r9 = e(r8, r9)
            if (r9 == 0) goto L9b
            int r7 = r7 + 2
        L9b:
            java.lang.String r9 = "getPasterContent"
            java.lang.reflect.Method r9 = e(r8, r9)
            if (r9 == 0) goto La5
            int r7 = r7 + 1
        La5:
            java.lang.Class<android.view.View> r9 = android.view.View.class
            boolean r8 = r9.isAssignableFrom(r8)
            if (r8 == 0) goto Laf
            int r7 = r7 + 1
        Laf:
            if (r7 <= r4) goto L4e
            r5 = r6
            r4 = r7
            goto L4e
        Lb4:
            if (r4 < r7) goto Lb7
            goto Lb8
        Lb7:
            r5 = r3
        Lb8:
            java.util.LinkedHashMap r1 = eb.m0.f2590d
            monitor-enter(r1)
            r1.put(r0, r5)     // Catch: java.lang.Throwable -> Lc7
            monitor-exit(r1)
            if (r5 == 0) goto Lc6
            java.lang.Object r10 = h.Hchat.utils.KavaReflector.readField(r5, r10)
            return r10
        Lc6:
            return r3
        Lc7:
            r10 = move-exception
            monitor-exit(r1)
            throw r10
        Lca:
            r10 = move-exception
            monitor-exit(r1)
            throw r10
        Lcd:
            monitor-exit(r1)
            throw r10
    }

    public static java.lang.reflect.Method e(java.lang.Class r5, java.lang.String r6) {
            if (r5 != 0) goto L3
            goto L59
        L3:
            java.lang.String r0 = r5.getName()
            java.lang.String r1 = "#"
            java.lang.String r0 = wb.en.h(r0, r1, r6)
            java.util.concurrent.ConcurrentHashMap r1 = eb.m0.f2591e
            java.lang.Object r2 = r1.get(r0)
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            if (r2 == 0) goto L18
            return r2
        L18:
            if (r5 == 0) goto L59
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L59
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredMethods(r5)
            java.util.Iterator r2 = r2.iterator()
        L2a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L54
            java.lang.Object r3 = r2.next()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.String r4 = r3.getName()
            boolean r4 = gg.l.a(r4, r6)
            if (r4 == 0) goto L2a
            java.lang.Class[] r4 = r3.getParameterTypes()
            r4.getClass()
            int r4 = r4.length
            if (r4 != 0) goto L2a
            java.lang.reflect.Method r5 = h.Hchat.utils.KavaReflector.accessible(r3)
            if (r5 == 0) goto L59
            r1.put(r0, r5)
            return r5
        L54:
            java.lang.Class r5 = r5.getSuperclass()
            goto L18
        L59:
            r5 = 0
            return r5
    }

    public static java.lang.reflect.Method f(java.lang.Class r6, java.lang.Class r7) {
            java.lang.String r0 = r6.getName()
            java.lang.String r1 = r7.getName()
            java.lang.String r2 = "#setText#"
            java.lang.String r0 = wb.en.h(r0, r2, r1)
            java.util.concurrent.ConcurrentHashMap r1 = eb.m0.f2592f
            java.lang.Object r2 = r1.get(r0)
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            if (r2 == 0) goto L19
            return r2
        L19:
            if (r6 == 0) goto L73
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L73
            java.util.List r2 = h.Hchat.utils.KavaReflector.declaredMethods(r6)
            java.util.Iterator r2 = r2.iterator()
        L2b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L6e
            java.lang.Object r3 = r2.next()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = "setText"
            boolean r4 = gg.l.a(r4, r5)
            if (r4 == 0) goto L2b
            java.lang.Class[] r4 = r3.getParameterTypes()
            int r4 = r4.length
            r5 = 1
            if (r4 == r5) goto L4c
            goto L2b
        L4c:
            java.lang.Class[] r4 = r3.getParameterTypes()
            r5 = 0
            r4 = r4[r5]
            r4.getClass()
            java.lang.Class r4 = m(r4)
            java.lang.Class r5 = m(r7)
            boolean r4 = r4.isAssignableFrom(r5)
            if (r4 == 0) goto L2b
            java.lang.reflect.Method r6 = h.Hchat.utils.KavaReflector.accessible(r3)
            if (r6 == 0) goto L73
            r1.put(r0, r6)
            return r6
        L6e:
            java.lang.Class r6 = r6.getSuperclass()
            goto L19
        L73:
            r6 = 0
            return r6
    }

    public static java.lang.Object h(java.lang.Object r2) {
            java.lang.String r0 = "getText"
            java.lang.Class r1 = r2.getClass()
            java.lang.reflect.Method r0 = e(r1, r0)
            if (r0 == 0) goto L14
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Object r2 = h.Hchat.utils.KavaReflector.invoke(r0, r2, r1)
            return r2
        L14:
            r2 = 0
            return r2
    }

    public static java.lang.String i(java.lang.Object r1) {
            java.lang.Object r0 = d(r1)
            if (r0 == 0) goto L11
            java.lang.Object r0 = h(r0)
            if (r0 == 0) goto L11
            java.lang.String r1 = r0.toString()
            return r1
        L11:
            java.lang.Object r1 = h(r1)
            if (r1 == 0) goto L1c
            java.lang.String r1 = r1.toString()
            return r1
        L1c:
            java.lang.String r1 = ""
            return r1
    }

    public static a2.a j(java.lang.String r2, eb.i0 r3) {
            ca.s r0 = new ca.s
            r1 = 2
            r0.<init>(r2, r1)
            java.util.concurrent.CopyOnWriteArrayList r1 = eb.m0.f2593g
            tf.r.i1(r0, r1)
            eb.j0 r0 = new eb.j0
            r0.<init>(r2, r3)
            r1.add(r0)
            a2.a r2 = new a2.a
            r3 = 10
            r2.<init>(r3)
            return r2
    }

    public static void k(java.lang.String r1, java.lang.String r2) {
            r1.getClass()
            r2.getClass()
            boolean r0 = og.m.t0(r1)
            if (r0 != 0) goto L1d
            int r0 = r2.length()
            if (r0 != 0) goto L13
            goto L1d
        L13:
            eb.g0 r0 = new eb.g0
            r0.<init>(r1, r2)
            android.os.Handler r1 = eb.m0.f2595i
            r1.post(r0)
        L1d:
            return
    }

    public static boolean l(java.lang.Object r3, java.lang.String r4) {
            boolean r0 = r3 instanceof android.widget.TextView
            r1 = 1
            if (r0 == 0) goto Lb
            android.widget.TextView r3 = (android.widget.TextView) r3
            r3.setText(r4)
            return r1
        Lb:
            java.lang.Class r0 = r3.getClass()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.reflect.Method r0 = f(r0, r2)
            if (r0 == 0) goto L1f
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            h.Hchat.utils.KavaReflector.invoke(r0, r3, r4)
            return r1
        L1f:
            r3 = 0
            return r3
    }

    public static java.lang.Class m(java.lang.Class r1) {
            boolean r0 = r1.isPrimitive()
            if (r0 != 0) goto L7
            goto L69
        L7:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L12
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            return r1
        L12:
            java.lang.Class r0 = java.lang.Byte.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1d
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
            return r1
        L1d:
            java.lang.Class r0 = java.lang.Character.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L28
            java.lang.Class<java.lang.Character> r1 = java.lang.Character.class
            return r1
        L28:
            java.lang.Class r0 = java.lang.Short.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L33
            java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            return r1
        L33:
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L3e
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            return r1
        L3e:
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L49
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            return r1
        L49:
            java.lang.Class r0 = java.lang.Float.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L54
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            return r1
        L54:
            java.lang.Class r0 = java.lang.Double.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            return r1
        L5f:
            java.lang.Class r0 = java.lang.Void.TYPE
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L69
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
        L69:
            return r1
    }

    public final synchronized boolean g(r8.g r7) {
            r6 = this;
            java.lang.String r0 = "[Hchat:Script] 发送按钮Hook异常: "
            monitor-enter(r6)
            r7.getClass()     // Catch: java.lang.Throwable -> L52
            boolean r1 = eb.m0.f2588b     // Catch: java.lang.Throwable -> L52
            r2 = 1
            if (r1 == 0) goto Ld
            monitor-exit(r6)
            return r2
        Ld:
            r1 = 0
            h.Hchat.dexkit.DexFinder r7 = r7.f11624e     // Catch: java.lang.Throwable -> L1e
            r7.resolveScriptSendHookApi()     // Catch: java.lang.Throwable -> L1e
            java.lang.reflect.Method r7 = r7.chatFooterSendClickMethod     // Catch: java.lang.Throwable -> L1e
            if (r7 != 0) goto L20
            java.lang.String r7 = "[Hchat:Script] 发送按钮Hook失败: 未定位到ChatFooter发送入口"
            fb.v0.m(r7)     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r6)
            return r1
        L1e:
            r7 = move-exception
            goto L31
        L20:
            r8.i r3 = r8.i.f11631b     // Catch: java.lang.Throwable -> L1e
            b9.e r4 = new b9.e     // Catch: java.lang.Throwable -> L1e
            r5 = 9
            r4.<init>(r6, r5)     // Catch: java.lang.Throwable -> L1e
            r3.b(r7, r4)     // Catch: java.lang.Throwable -> L1e
            eb.m0.f2588b = r2     // Catch: java.lang.Throwable -> L1e
            sf.n r7 = sf.n.f12433a     // Catch: java.lang.Throwable -> L1e
            goto L37
        L31:
            sf.f r2 = new sf.f     // Catch: java.lang.Throwable -> L52
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L52
            r7 = r2
        L37:
            java.lang.Throwable r7 = sf.g.b(r7)     // Catch: java.lang.Throwable -> L52
            if (r7 == 0) goto L54
            java.lang.String r2 = r7.getMessage()     // Catch: java.lang.Throwable -> L52
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L52
            r3.append(r2)     // Catch: java.lang.Throwable -> L52
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L52
            fb.v0.n(r0, r7)     // Catch: java.lang.Throwable -> L52
            monitor-exit(r6)
            return r1
        L52:
            r7 = move-exception
            goto L58
        L54:
            boolean r7 = eb.m0.f2588b     // Catch: java.lang.Throwable -> L52
            monitor-exit(r6)
            return r7
        L58:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L52
            throw r7
    }
}
