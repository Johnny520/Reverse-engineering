package a;

/* JADX INFO: renamed from: a.ah, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0055ah {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.lang.Class<? extends java.lang.Object>[] f406a = null;
    public static final java.lang.String[] b = null;
    public static java.lang.Class<?> c;
    public static java.util.ArrayList d;
    public static java.lang.reflect.Method e;
    public static java.lang.reflect.Method f;
    public static java.lang.reflect.Method g;

    static {
            java.lang.Class r0 = java.lang.Long.TYPE
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Class r2 = java.lang.Boolean.TYPE
            java.lang.Class[] r0 = new java.lang.Class[]{r1, r2, r2, r0}
            a.C0055ah.f406a = r0
            java.lang.String r0 = "i"
            java.lang.String r1 = "f309528i"
            java.lang.String r2 = "f"
            java.lang.String r3 = "f309528f"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3}
            a.C0055ah.b = r0
            return
    }

    public static final java.lang.String a(java.lang.Object r6) {
            java.lang.String[] r0 = a.C0055ah.b
            r1 = 0
        L3:
            r2 = 4
            r3 = 1
            r4 = 0
            if (r1 >= r2) goto L3d
            r2 = r0[r1]
            java.lang.Class r5 = r6.getClass()     // Catch: java.lang.Throwable -> L20
            java.lang.reflect.Field r2 = r5.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L20
            r2.setAccessible(r3)     // Catch: java.lang.Throwable -> L20
            java.lang.Object r2 = r2.get(r6)     // Catch: java.lang.Throwable -> L20
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L20
            if (r3 == 0) goto L22
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L20
            goto L28
        L20:
            r2 = move-exception
            goto L24
        L22:
            r2 = r4
            goto L28
        L24:
            a.wd$a r2 = a.C0465xd.a(r2)
        L28:
            boolean r3 = r2 instanceof a.C0447wd.a
            if (r3 == 0) goto L2d
            goto L2e
        L2d:
            r4 = r2
        L2e:
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L3a
            boolean r2 = a.Be.P(r4)
            if (r2 == 0) goto L39
            goto L3a
        L39:
            return r4
        L3a:
            int r1 = r1 + 1
            goto L3
        L3d:
            java.lang.Class r0 = r6.getClass()
            java.util.ArrayList r0 = b(r0)
            java.util.Iterator r0 = r0.iterator()
        L49:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L8b
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            java.lang.Class r2 = r1.getType()     // Catch: java.lang.Throwable -> L6f
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            boolean r2 = a.C0193i9.a(r2, r5)     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto L7b
            r1.setAccessible(r3)     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L6f
            boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto L71
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L6f
            goto L72
        L6f:
            r1 = move-exception
            goto L7d
        L71:
            r1 = r4
        L72:
            if (r1 == 0) goto L7b
            boolean r2 = a.yh.a(r1)     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto L7b
            goto L81
        L7b:
            r1 = r4
            goto L81
        L7d:
            a.wd$a r1 = a.C0465xd.a(r1)
        L81:
            boolean r2 = r1 instanceof a.C0447wd.a
            if (r2 == 0) goto L86
            r1 = r4
        L86:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L49
            r4 = r1
        L8b:
            return r4
    }

    public static java.util.ArrayList b(java.lang.Class r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            if (r3 == 0) goto L29
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L29
            java.lang.reflect.Field[] r1 = r3.getDeclaredFields()
            java.lang.String r2 = "getDeclaredFields(...)"
            a.C0193i9.d(r1, r2)
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.lang.String r2 = "asList(...)"
            a.C0193i9.d(r1, r2)
            r0.addAll(r1)
            java.lang.Class r3 = r3.getSuperclass()
            goto L5
        L29:
            return r0
    }

    public static boolean c(java.lang.Class r7) {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            boolean r0 = r7.equals(r0)
            r1 = 0
            if (r0 == 0) goto Lb
            goto L9e
        Lb:
            java.util.ArrayList r7 = b(r7)
            boolean r0 = r7.isEmpty()
            r2 = 1
            if (r0 == 0) goto L18
        L16:
            r0 = r1
            goto L35
        L18:
            java.util.Iterator r0 = r7.iterator()
        L1c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L16
            java.lang.Object r3 = r0.next()
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.lang.Class r3 = r3.getType()
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            boolean r3 = a.C0193i9.a(r3, r4)
            if (r3 == 0) goto L1c
            r0 = r2
        L35:
            boolean r3 = r7.isEmpty()
            if (r3 == 0) goto L3d
        L3b:
            r3 = r1
            goto L66
        L3d:
            java.util.Iterator r3 = r7.iterator()
        L41:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L3b
            java.lang.Object r4 = r3.next()
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            java.lang.Class r5 = r4.getType()
            java.lang.Class r6 = java.lang.Integer.TYPE
            boolean r5 = a.C0193i9.a(r5, r6)
            if (r5 != 0) goto L65
            java.lang.Class r4 = r4.getType()
            java.lang.Class<java.lang.Integer> r5 = java.lang.Integer.class
            boolean r4 = a.C0193i9.a(r4, r5)
            if (r4 == 0) goto L41
        L65:
            r3 = r2
        L66:
            boolean r4 = r7.isEmpty()
            if (r4 == 0) goto L6e
        L6c:
            r7 = r1
            goto L97
        L6e:
            java.util.Iterator r7 = r7.iterator()
        L72:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L6c
            java.lang.Object r4 = r7.next()
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            java.lang.Class r5 = r4.getType()
            java.lang.Class r6 = java.lang.Long.TYPE
            boolean r5 = a.C0193i9.a(r5, r6)
            if (r5 != 0) goto L96
            java.lang.Class r4 = r4.getType()
            java.lang.Class<java.lang.Long> r5 = java.lang.Long.class
            boolean r4 = a.C0193i9.a(r4, r5)
            if (r4 == 0) goto L72
        L96:
            r7 = r2
        L97:
            if (r0 == 0) goto L9e
            if (r3 == 0) goto L9e
            if (r7 == 0) goto L9e
            return r2
        L9e:
            return r1
    }

    public static void d(java.lang.String r1) {
            java.lang.String r0 = "[VoipClassResolver] "
            java.lang.String r1 = a.C0487z.k(r0, r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r0 = 1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            a.C0453x1.b(r1)
            return
    }

    public static final java.util.List<java.lang.reflect.Method> e(java.lang.ClassLoader r7) {
            java.lang.String r0 = "classLoader"
            a.C0193i9.e(r7, r0)
            java.util.ArrayList r0 = a.C0055ah.d
            if (r0 == 0) goto La
            return r0
        La:
            java.lang.Class r7 = i(r7)
            if (r7 != 0) goto L18
            java.lang.String r7 = "resolveVoipMgrClass returned null"
            d(r7)
            a.Y5 r7 = a.Y5.f351a
            return r7
        L18:
            java.lang.reflect.Method[] r0 = r7.getDeclaredMethods()
            java.lang.String r1 = "getDeclaredMethods(...)"
            a.C0193i9.d(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.length
            r3 = 0
        L28:
            if (r3 >= r2) goto L4a
            r4 = r0[r3]
            java.lang.Class r5 = r4.getReturnType()
            java.lang.Class r6 = java.lang.Void.TYPE
            boolean r5 = a.C0193i9.a(r5, r6)
            if (r5 == 0) goto L47
            java.lang.Class[] r5 = r4.getParameterTypes()
            java.lang.Class<? extends java.lang.Object>[] r6 = a.C0055ah.f406a
            boolean r5 = java.util.Arrays.equals(r5, r6)
            if (r5 == 0) goto L47
            r1.add(r4)
        L47:
            int r3 = r3 + 1
            goto L28
        L4a:
            java.util.Iterator r0 = r1.iterator()
        L4e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L5f
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            r3 = 1
            r2.setAccessible(r3)
            goto L4e
        L5f:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L87
            a.C0055ah.d = r1
            a.kd r7 = new a.kd
            r0 = 28
            r7.<init>(r0)
            r0 = 31
            r2 = 0
            java.lang.String r7 = a.C0383t3.p0(r1, r2, r7, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "resolved bind methods: "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            d(r7)
            return r1
        L87:
            java.lang.String r7 = r7.getName()
            java.lang.String r0 = "cannot find bindVoipForegroundIfNeed method in "
            java.lang.String r7 = r0.concat(r7)
            d(r7)
            return r1
    }

    public static final java.lang.reflect.Method f(java.lang.ClassLoader r12) {
            java.lang.String r0 = "classLoader"
            a.C0193i9.e(r12, r0)
            java.lang.reflect.Method r0 = a.C0055ah.f
            if (r0 == 0) goto La
            return r0
        La:
            java.lang.Class r12 = i(r12)
            if (r12 != 0) goto L12
            r12 = 0
            return r12
        L12:
            java.lang.reflect.Method[] r0 = r12.getDeclaredMethods()
            java.lang.String r1 = "getDeclaredMethods(...)"
            a.C0193i9.d(r0, r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r0.length
            r4 = 0
            r5 = r4
        L23:
            r6 = 1
            java.lang.String r7 = "get(...)"
            java.lang.Class r8 = java.lang.Void.TYPE
            if (r5 >= r3) goto L6a
            r9 = r0[r5]
            java.lang.String r10 = r9.getName()
            java.lang.String r11 = "h"
            boolean r10 = a.C0193i9.a(r10, r11)
            if (r10 != 0) goto L44
            java.lang.String r10 = r9.getName()
            java.lang.String r11 = "H"
            boolean r10 = a.C0193i9.a(r10, r11)
            if (r10 == 0) goto L67
        L44:
            java.lang.Class r10 = r9.getReturnType()
            boolean r8 = a.C0193i9.a(r10, r8)
            if (r8 == 0) goto L67
            java.lang.Class[] r8 = r9.getParameterTypes()
            int r8 = r8.length
            if (r8 != r6) goto L67
            java.lang.Class[] r6 = r9.getParameterTypes()
            r6 = r6[r4]
            a.C0193i9.d(r6, r7)
            boolean r6 = c(r6)
            if (r6 == 0) goto L67
            r2.add(r9)
        L67:
            int r5 = r5 + 1
            goto L23
        L6a:
            java.lang.Object r0 = a.C0383t3.n0(r2)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            java.lang.String r2 = "#"
            if (r0 == 0) goto La2
            r0.setAccessible(r6)
            a.C0055ah.f = r0
            java.lang.Class r12 = r0.getDeclaringClass()
            java.lang.String r12 = r12.getName()
            java.lang.String r1 = r0.getName()
            java.lang.Class[] r3 = r0.getParameterTypes()
            r3 = r3[r4]
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = "resolved incoming call handler method: "
            java.lang.String r5 = " param="
            java.lang.StringBuilder r12 = a.C0487z.i(r4, r12, r2, r1, r5)
            r12.append(r3)
            java.lang.String r12 = r12.toString()
            d(r12)
            return r0
        La2:
            java.lang.String r3 = r12.getName()
            java.lang.String r5 = "cannot find incoming call handler method in "
            java.lang.String r3 = r5.concat(r3)
            d(r3)
            java.lang.reflect.Method[] r12 = r12.getDeclaredMethods()
            a.C0193i9.d(r12, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r3 = r12.length
            r5 = r4
        Lbd:
            if (r5 >= r3) goto Le7
            r9 = r12[r5]
            java.lang.Class r10 = r9.getReturnType()
            boolean r10 = a.C0193i9.a(r10, r8)
            if (r10 == 0) goto Le4
            java.lang.Class[] r10 = r9.getParameterTypes()
            int r10 = r10.length
            if (r10 != r6) goto Le4
            java.lang.Class[] r10 = r9.getParameterTypes()
            r10 = r10[r4]
            a.C0193i9.d(r10, r7)
            boolean r10 = c(r10)
            if (r10 == 0) goto Le4
            r1.add(r9)
        Le4:
            int r5 = r5 + 1
            goto Lbd
        Le7:
            java.lang.Object r12 = a.C0383t3.n0(r1)
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            if (r12 == 0) goto L118
            r12.setAccessible(r6)
            a.C0055ah.f = r12
            java.lang.Class r0 = r12.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = r12.getName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "fallback resolved incoming call handler method: "
            r3.<init>(r4)
            r3.append(r0)
            r3.append(r2)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            d(r0)
            return r12
        L118:
            return r0
    }

    public static final java.lang.reflect.Method g(java.lang.ClassLoader r11) {
            java.lang.String r0 = "classLoader"
            a.C0193i9.e(r11, r0)
            java.lang.reflect.Method r0 = a.C0055ah.e
            if (r0 == 0) goto La
            return r0
        La:
            java.lang.String r0 = "resolveIncomingCallManagerMethod start"
            d(r0)
            r0 = 0
            a.Rb r1 = a.Rb.f246a     // Catch: java.lang.Throwable -> L2f
            r1.getClass()     // Catch: java.lang.Throwable -> L2f
            java.lang.Class r11 = a.Rb.h(r11)     // Catch: java.lang.Throwable -> L2f
            if (r11 == 0) goto L29
            java.lang.String r1 = r11.getName()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = "use incoming call mgr (DexKit/Fallback): "
            java.lang.String r1 = r2.concat(r1)     // Catch: java.lang.Throwable -> L2f
            d(r1)     // Catch: java.lang.Throwable -> L2f
            goto L56
        L29:
            java.lang.String r1 = "incoming call mgr not found (DexKit + fallback 均失败)"
            d(r1)     // Catch: java.lang.Throwable -> L2f
            goto L56
        L2f:
            r11 = move-exception
            java.lang.Class r1 = r11.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r11 = r11.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "resolveIncomingCallMgrClass threw: "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = ": "
            r2.append(r1)
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            d(r11)
            r11 = r0
        L56:
            if (r11 != 0) goto L5e
            java.lang.String r11 = "resolveIncomingCallManagerMethod: mgrClass is null"
            d(r11)
            return r0
        L5e:
            java.lang.String r1 = r11.getName()
            java.lang.reflect.Method[] r2 = r11.getDeclaredMethods()
            int r2 = r2.length
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "resolveIncomingCallManagerMethod: scanning "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = ", methods="
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            d(r1)
            java.lang.reflect.Method[] r1 = r11.getDeclaredMethods()
            java.lang.String r2 = "getDeclaredMethods(...)"
            a.C0193i9.d(r1, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r1.length
            r4 = 0
            r5 = r4
        L91:
            r6 = 1
            if (r5 >= r3) goto Lbb
            r7 = r1[r5]
            java.lang.String r8 = r7.getName()
            java.lang.String r9 = "a"
            boolean r8 = a.C0193i9.a(r8, r9)
            if (r8 == 0) goto Lb8
            java.lang.Class r8 = r7.getReturnType()
            java.lang.Class r9 = java.lang.Boolean.TYPE
            boolean r8 = a.C0193i9.a(r8, r9)
            if (r8 == 0) goto Lb8
            java.lang.Class[] r8 = r7.getParameterTypes()
            int r8 = r8.length
            if (r8 != r6) goto Lb8
            r2.add(r7)
        Lb8:
            int r5 = r5 + 1
            goto L91
        Lbb:
            java.util.Iterator r1 = r2.iterator()
        Lbf:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L102
            java.lang.Object r3 = r1.next()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.String r5 = r3.getName()
            java.lang.Class[] r7 = r3.getParameterTypes()
            java.lang.String r8 = "getParameterTypes(...)"
            a.C0193i9.d(r7, r8)
            a.kd r8 = new a.kd
            r9 = 27
            r8.<init>(r9)
            r9 = 31
            java.lang.String r7 = a.N1.e0(r7, r0, r8, r9)
            java.lang.Class r3 = r3.getReturnType()
            java.lang.String r3 = r3.getName()
            java.lang.String r8 = "  candidate: "
            java.lang.String r9 = "("
            java.lang.String r10 = ") return="
            java.lang.StringBuilder r5 = a.C0487z.i(r8, r5, r9, r7, r10)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            d(r3)
            goto Lbf
        L102:
            java.lang.Object r0 = a.C0383t3.n0(r2)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            if (r0 == 0) goto L13a
            r0.setAccessible(r6)
            a.C0055ah.e = r0
            java.lang.Class r11 = r0.getDeclaringClass()
            java.lang.String r11 = r11.getName()
            java.lang.String r1 = r0.getName()
            java.lang.Class[] r2 = r0.getParameterTypes()
            r2 = r2[r4]
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "resolved incoming call method: "
            java.lang.String r4 = "#"
            java.lang.String r5 = " param="
            java.lang.StringBuilder r11 = a.C0487z.i(r3, r11, r4, r1, r5)
            r11.append(r2)
            java.lang.String r11 = r11.toString()
            d(r11)
            goto L147
        L13a:
            java.lang.String r11 = r11.getName()
            java.lang.String r1 = "cannot find incoming call method in "
            java.lang.String r11 = r1.concat(r11)
            d(r11)
        L147:
            return r0
    }

    public static final java.lang.reflect.Method h(java.lang.ClassLoader r20) {
            java.lang.String r0 = "classLoader"
            r1 = r20
            a.C0193i9.e(r1, r0)
            java.lang.reflect.Method r0 = a.C0055ah.g
            if (r0 == 0) goto Lc
            return r0
        Lc:
            java.lang.Class r0 = i(r1)
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            java.lang.reflect.Method[] r2 = r0.getDeclaredMethods()
            java.lang.String r3 = "getDeclaredMethods(...)"
            a.C0193i9.d(r2, r3)
            int r4 = r2.length
            r6 = 0
        L1f:
            r7 = 1
            r9 = 4
            java.lang.Class r10 = java.lang.Boolean.TYPE
            r11 = 3
            java.lang.Class r12 = java.lang.Long.TYPE
            java.lang.Class<java.lang.String> r13 = java.lang.String.class
            java.lang.Class<android.content.Context> r14 = android.content.Context.class
            r15 = 6
            java.lang.Class r1 = java.lang.Void.TYPE
            r16 = 2
            if (r6 >= r4) goto La4
            r17 = r2[r6]
            r18 = 0
            java.lang.String r5 = r17.getName()
            r19 = 5
            java.lang.String r8 = "M"
            boolean r5 = a.C0193i9.a(r5, r8)
            if (r5 == 0) goto L9f
            java.lang.Class r5 = r17.getReturnType()
            boolean r5 = a.C0193i9.a(r5, r1)
            if (r5 == 0) goto L9f
            java.lang.Class[] r5 = r17.getParameterTypes()
            int r5 = r5.length
            if (r5 != r15) goto L9f
            java.lang.Class[] r5 = r17.getParameterTypes()
            r5 = r5[r18]
            boolean r5 = a.C0193i9.a(r5, r14)
            if (r5 == 0) goto L9f
            java.lang.Class[] r5 = r17.getParameterTypes()
            r5 = r5[r7]
            boolean r5 = a.C0193i9.a(r5, r13)
            if (r5 == 0) goto L9f
            java.lang.Class[] r5 = r17.getParameterTypes()
            r5 = r5[r16]
            boolean r5 = a.C0193i9.a(r5, r12)
            if (r5 == 0) goto L9f
            java.lang.Class[] r5 = r17.getParameterTypes()
            r5 = r5[r11]
            boolean r5 = a.C0193i9.a(r5, r10)
            if (r5 == 0) goto L9f
            java.lang.Class[] r5 = r17.getParameterTypes()
            r5 = r5[r9]
            boolean r5 = a.C0193i9.a(r5, r10)
            if (r5 == 0) goto L9f
            java.lang.Class[] r5 = r17.getParameterTypes()
            r5 = r5[r19]
            boolean r5 = a.C0193i9.a(r5, r10)
            if (r5 == 0) goto L9f
            r2 = r17
            goto La9
        L9f:
            int r6 = r6 + 1
            r1 = 0
            goto L1f
        La4:
            r18 = 0
            r19 = 5
            r2 = 0
        La9:
            java.lang.String r4 = "#"
            if (r2 == 0) goto Ld6
            r2.setAccessible(r7)
            a.C0055ah.g = r2
            java.lang.Class r0 = r2.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = r2.getName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "resolved incoming call UI method: "
            r3.<init>(r5)
            r3.append(r0)
            r3.append(r4)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            d(r0)
            return r2
        Ld6:
            java.lang.String r5 = r0.getName()
            java.lang.String r6 = "cannot find incoming call UI method in "
            java.lang.String r5 = r6.concat(r5)
            d(r5)
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
            a.C0193i9.d(r0, r3)
            int r3 = r0.length
            r5 = r18
        Led:
            if (r5 >= r3) goto L165
            r6 = r0[r5]
            java.lang.Class r8 = r6.getReturnType()
            boolean r8 = a.C0193i9.a(r8, r1)
            if (r8 == 0) goto L15e
            java.lang.Class[] r8 = r6.getParameterTypes()
            int r8 = r8.length
            if (r8 != r15) goto L15e
            java.lang.Class[] r8 = r6.getParameterTypes()
            r8 = r8[r18]
            boolean r8 = a.C0193i9.a(r8, r14)
            if (r8 == 0) goto L15e
            java.lang.Class[] r8 = r6.getParameterTypes()
            r8 = r8[r7]
            boolean r8 = a.C0193i9.a(r8, r13)
            if (r8 == 0) goto L15e
            java.lang.Class[] r8 = r6.getParameterTypes()
            r8 = r8[r16]
            boolean r8 = a.C0193i9.a(r8, r12)
            if (r8 != 0) goto L137
            java.lang.Class[] r8 = r6.getParameterTypes()
            r8 = r8[r16]
            r17 = r9
            java.lang.Class<java.lang.Long> r9 = java.lang.Long.class
            boolean r8 = a.C0193i9.a(r8, r9)
            if (r8 == 0) goto L160
            goto L139
        L137:
            r17 = r9
        L139:
            java.lang.Class[] r8 = r6.getParameterTypes()
            r8 = r8[r11]
            boolean r8 = a.C0193i9.a(r8, r10)
            if (r8 == 0) goto L160
            java.lang.Class[] r8 = r6.getParameterTypes()
            r8 = r8[r17]
            boolean r8 = a.C0193i9.a(r8, r10)
            if (r8 == 0) goto L160
            java.lang.Class[] r8 = r6.getParameterTypes()
            r8 = r8[r19]
            boolean r8 = a.C0193i9.a(r8, r10)
            if (r8 == 0) goto L160
            goto L166
        L15e:
            r17 = r9
        L160:
            int r5 = r5 + 1
            r9 = r17
            goto Led
        L165:
            r6 = 0
        L166:
            if (r6 == 0) goto L16d
            r6.setAccessible(r7)
            r1 = r6
            goto L16e
        L16d:
            r1 = 0
        L16e:
            if (r1 == 0) goto L196
            a.C0055ah.g = r1
            java.lang.Class r0 = r1.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r2 = r1.getName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "fallback resolved incoming call UI method: "
            r3.<init>(r5)
            r3.append(r0)
            r3.append(r4)
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            d(r0)
            return r1
        L196:
            return r2
    }

    public static java.lang.Class i(java.lang.ClassLoader r2) {
            java.lang.Class<?> r0 = a.C0055ah.c
            if (r0 == 0) goto L5
            return r0
        L5:
            a.Rb r0 = a.Rb.f246a
            r0.getClass()
            java.lang.Class r2 = a.Rb.k(r2)
            if (r2 != 0) goto L12
            r2 = 0
            return r2
        L12:
            a.C0055ah.c = r2
            java.lang.String r0 = r2.getName()
            java.lang.String r1 = "use VoIP mgr (DexKit/Fallback): "
            java.lang.String r0 = r1.concat(r0)
            d(r0)
            return r2
    }
}
