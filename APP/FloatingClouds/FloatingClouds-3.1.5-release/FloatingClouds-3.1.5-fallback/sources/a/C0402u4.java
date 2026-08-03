package a;

/* JADX INFO: renamed from: a.u4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0402u4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.C0402u4 f707a = null;
    public static volatile boolean b;
    public static final java.util.Set<java.lang.Object> c = null;
    public static volatile java.lang.Object d;
    public static final java.util.Set<java.lang.Object> e = null;
    public static volatile java.lang.reflect.Method f;

    static {
            a.u4 r0 = new a.u4
            r0.<init>()
            a.C0402u4.f707a = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.Collections.newSetFromMap(r0)
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            a.C0402u4.c = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            a.C0402u4.e = r0
            return
    }

    public static java.lang.String a(java.lang.Object r7) {
            r0 = 0
            java.lang.Class r1 = r7.getClass()     // Catch: java.lang.Throwable -> L39
            java.lang.reflect.Method[] r1 = r1.getMethods()     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = "getMethods(...)"
            a.C0193i9.d(r1, r2)     // Catch: java.lang.Throwable -> L39
            int r2 = r1.length     // Catch: java.lang.Throwable -> L39
            r3 = 0
        L10:
            if (r3 >= r2) goto L3e
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L39
            java.lang.String r5 = r4.getName()     // Catch: java.lang.Throwable -> L39
            java.lang.String r6 = "v"
            boolean r5 = a.C0193i9.a(r5, r6)     // Catch: java.lang.Throwable -> L39
            if (r5 == 0) goto L3b
            java.lang.Class[] r5 = r4.getParameterTypes()     // Catch: java.lang.Throwable -> L39
            java.lang.String r6 = "getParameterTypes(...)"
            a.C0193i9.d(r5, r6)     // Catch: java.lang.Throwable -> L39
            int r5 = r5.length     // Catch: java.lang.Throwable -> L39
            if (r5 != 0) goto L3b
            java.lang.Class r5 = r4.getReturnType()     // Catch: java.lang.Throwable -> L39
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            boolean r5 = a.C0193i9.a(r5, r6)     // Catch: java.lang.Throwable -> L39
            if (r5 == 0) goto L3b
            goto L3f
        L39:
            r7 = move-exception
            goto L5b
        L3b:
            int r3 = r3 + 1
            goto L10
        L3e:
            r4 = r0
        L3f:
            if (r4 == 0) goto L59
            r1 = 1
            r4.setAccessible(r1)     // Catch: java.lang.Throwable -> L39
            java.lang.Object r7 = r4.invoke(r7, r0)     // Catch: java.lang.Throwable -> L39
            boolean r1 = r7 instanceof java.lang.String     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L50
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L39
            goto L51
        L50:
            r7 = r0
        L51:
            if (r7 == 0) goto L59
            boolean r1 = a.Be.P(r7)     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L5f
        L59:
            r7 = r0
            goto L5f
        L5b:
            a.wd$a r7 = a.C0465xd.a(r7)
        L5f:
            boolean r1 = r7 instanceof a.C0447wd.a
            if (r1 == 0) goto L64
            goto L65
        L64:
            r0 = r7
        L65:
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    public static java.lang.String b(java.lang.Object r14) {
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1 = 0
            java.lang.Class r2 = r14.getClass()     // Catch: java.lang.Throwable -> L95
            r3 = 0
            r4 = r3
        L9:
            if (r2 == 0) goto Lef
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            boolean r5 = r2.equals(r5)     // Catch: java.lang.Throwable -> L95
            if (r5 != 0) goto Lef
            r5 = 3
            if (r4 >= r5) goto Lef
            java.lang.reflect.Field[] r5 = r2.getDeclaredFields()     // Catch: java.lang.Throwable -> L95
            a.G1 r5 = a.C0435w1.I(r5)     // Catch: java.lang.Throwable -> L95
        L1e:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L95
            if (r6 == 0) goto Le7
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L95
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6     // Catch: java.lang.Throwable -> L95
            int r7 = r6.getModifiers()     // Catch: java.lang.Throwable -> L95
            boolean r7 = java.lang.reflect.Modifier.isStatic(r7)     // Catch: java.lang.Throwable -> L95
            if (r7 != 0) goto L1e
            java.lang.Class r7 = r6.getType()     // Catch: java.lang.Throwable -> L95
            boolean r7 = r7.isPrimitive()     // Catch: java.lang.Throwable -> L95
            if (r7 != 0) goto L1e
            java.lang.Class r7 = r6.getType()     // Catch: java.lang.Throwable -> L95
            boolean r7 = a.C0193i9.a(r7, r0)     // Catch: java.lang.Throwable -> L95
            if (r7 == 0) goto L49
            goto L1e
        L49:
            r7 = 1
            r6.setAccessible(r7)     // Catch: java.lang.Throwable -> L95
            java.lang.Object r6 = r6.get(r14)     // Catch: java.lang.Throwable -> L52
            goto L57
        L52:
            r6 = move-exception
            a.wd$a r6 = a.C0465xd.a(r6)     // Catch: java.lang.Throwable -> L95
        L57:
            boolean r8 = r6 instanceof a.C0447wd.a     // Catch: java.lang.Throwable -> L95
            if (r8 == 0) goto L5c
            r6 = r1
        L5c:
            if (r6 != 0) goto L5f
            goto L1e
        L5f:
            java.lang.Class r8 = r6.getClass()     // Catch: java.lang.Throwable -> L95
            java.lang.reflect.Method[] r8 = r8.getMethods()     // Catch: java.lang.Throwable -> L95
            java.lang.String r9 = "getMethods(...)"
            a.C0193i9.d(r8, r9)     // Catch: java.lang.Throwable -> L95
            int r9 = r8.length     // Catch: java.lang.Throwable -> L95
            r10 = r3
        L6e:
            if (r10 >= r9) goto L9a
            r11 = r8[r10]     // Catch: java.lang.Throwable -> L95
            java.lang.String r12 = r11.getName()     // Catch: java.lang.Throwable -> L95
            java.lang.String r13 = "i1"
            boolean r12 = a.C0193i9.a(r12, r13)     // Catch: java.lang.Throwable -> L95
            if (r12 == 0) goto L97
            java.lang.Class[] r12 = r11.getParameterTypes()     // Catch: java.lang.Throwable -> L95
            java.lang.String r13 = "getParameterTypes(...)"
            a.C0193i9.d(r12, r13)     // Catch: java.lang.Throwable -> L95
            int r12 = r12.length     // Catch: java.lang.Throwable -> L95
            if (r12 != 0) goto L97
            java.lang.Class r12 = r11.getReturnType()     // Catch: java.lang.Throwable -> L95
            boolean r12 = a.C0193i9.a(r12, r0)     // Catch: java.lang.Throwable -> L95
            if (r12 == 0) goto L97
            goto L9b
        L95:
            r14 = move-exception
            goto Lf1
        L97:
            int r10 = r10 + 1
            goto L6e
        L9a:
            r11 = r1
        L9b:
            if (r11 == 0) goto Lb4
            r11.setAccessible(r7)     // Catch: java.lang.Throwable -> L95
            java.lang.Object r8 = r11.invoke(r6, r1)     // Catch: java.lang.Throwable -> L95
            boolean r9 = r8 instanceof java.lang.String     // Catch: java.lang.Throwable -> L95
            if (r9 == 0) goto Lab
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L95
            goto Lac
        Lab:
            r8 = r1
        Lac:
            if (r8 == 0) goto Lb4
            boolean r9 = a.Be.P(r8)     // Catch: java.lang.Throwable -> L95
            if (r9 == 0) goto Lf5
        Lb4:
            java.lang.Class r8 = r6.getClass()     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r9 = "field_username"
            java.lang.reflect.Field r8 = r8.getDeclaredField(r9)     // Catch: java.lang.Throwable -> Lbf
            goto Lc4
        Lbf:
            r8 = move-exception
            a.wd$a r8 = a.C0465xd.a(r8)     // Catch: java.lang.Throwable -> L95
        Lc4:
            boolean r9 = r8 instanceof a.C0447wd.a     // Catch: java.lang.Throwable -> L95
            if (r9 == 0) goto Lc9
            r8 = r1
        Lc9:
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8     // Catch: java.lang.Throwable -> L95
            if (r8 == 0) goto L1e
            r8.setAccessible(r7)     // Catch: java.lang.Throwable -> L95
            java.lang.Object r6 = r8.get(r6)     // Catch: java.lang.Throwable -> L95
            boolean r7 = r6 instanceof java.lang.String     // Catch: java.lang.Throwable -> L95
            if (r7 == 0) goto Ldc
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L95
            r8 = r6
            goto Ldd
        Ldc:
            r8 = r1
        Ldd:
            if (r8 == 0) goto L1e
            boolean r6 = a.Be.P(r8)     // Catch: java.lang.Throwable -> L95
            if (r6 == 0) goto Lf5
            goto L1e
        Le7:
            java.lang.Class r2 = r2.getSuperclass()     // Catch: java.lang.Throwable -> L95
            int r4 = r4 + 1
            goto L9
        Lef:
            r8 = r1
            goto Lf5
        Lf1:
            a.wd$a r8 = a.C0465xd.a(r14)
        Lf5:
            boolean r14 = r8 instanceof a.C0447wd.a
            if (r14 == 0) goto Lfa
            goto Lfb
        Lfa:
            r1 = r8
        Lfb:
            java.lang.String r1 = (java.lang.String) r1
            return r1
    }

    public static java.lang.Class c(java.lang.Class r7) {
            r0 = 0
            java.lang.reflect.Field[] r1 = r7.getDeclaredFields()     // Catch: java.lang.Throwable -> L4b
            a.G1 r1 = a.C0435w1.I(r1)     // Catch: java.lang.Throwable -> L4b
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L4b
            if (r2 == 0) goto L82
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L4b
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2     // Catch: java.lang.Throwable -> L4b
            java.lang.Class r3 = r2.getType()     // Catch: java.lang.Throwable -> L4b
            java.lang.Class<java.util.ArrayList> r4 = java.util.ArrayList.class
            boolean r3 = a.C0193i9.a(r3, r4)     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L9
            java.lang.reflect.Type r2 = r2.getGenericType()     // Catch: java.lang.Throwable -> L4b
            boolean r3 = r2 instanceof java.lang.reflect.ParameterizedType     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L9
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2     // Catch: java.lang.Throwable -> L4b
            java.lang.reflect.Type[] r2 = r2.getActualTypeArguments()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r3 = "getActualTypeArguments(...)"
            a.C0193i9.d(r2, r3)     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r2 = a.N1.d0(r2)     // Catch: java.lang.Throwable -> L4b
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2     // Catch: java.lang.Throwable -> L4b
            boolean r3 = r2 instanceof java.lang.Class     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L4e
            r3 = r2
            java.lang.Class r3 = (java.lang.Class) r3     // Catch: java.lang.Throwable -> L4b
            boolean r3 = r3.isInterface()     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L4e
            java.lang.Class r2 = (java.lang.Class) r2     // Catch: java.lang.Throwable -> L4b
            goto L14d
        L4b:
            r7 = move-exception
            goto L149
        L4e:
            boolean r3 = r2 instanceof java.lang.reflect.TypeVariable     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L9
            java.lang.reflect.TypeVariable r2 = (java.lang.reflect.TypeVariable) r2     // Catch: java.lang.Throwable -> L4b
            java.lang.reflect.Type[] r2 = r2.getBounds()     // Catch: java.lang.Throwable -> L4b
            a.G1 r2 = a.C0435w1.I(r2)     // Catch: java.lang.Throwable -> L4b
        L5c:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L9
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L4b
            java.lang.reflect.Type r3 = (java.lang.reflect.Type) r3     // Catch: java.lang.Throwable -> L4b
            boolean r4 = r3 instanceof java.lang.Class     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L5c
            r4 = r3
            java.lang.Class r4 = (java.lang.Class) r4     // Catch: java.lang.Throwable -> L4b
            boolean r4 = r4.isInterface()     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L5c
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            boolean r4 = a.C0193i9.a(r3, r4)     // Catch: java.lang.Throwable -> L4b
            if (r4 != 0) goto L5c
            r2 = r3
            java.lang.Class r2 = (java.lang.Class) r2     // Catch: java.lang.Throwable -> L4b
            goto L14d
        L82:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L4b
            r1.<init>()     // Catch: java.lang.Throwable -> L4b
            java.lang.reflect.Method[] r7 = r7.getDeclaredMethods()     // Catch: java.lang.Throwable -> L4b
            a.G1 r7 = a.C0435w1.I(r7)     // Catch: java.lang.Throwable -> L4b
        L8f:
            boolean r2 = r7.hasNext()     // Catch: java.lang.Throwable -> L4b
            if (r2 == 0) goto Lf8
            java.lang.Object r2 = r7.next()     // Catch: java.lang.Throwable -> L4b
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> L4b
            java.lang.Class r3 = r2.getReturnType()     // Catch: java.lang.Throwable -> L4b
            java.lang.Class r4 = java.lang.Void.TYPE     // Catch: java.lang.Throwable -> L4b
            boolean r3 = a.C0193i9.a(r3, r4)     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L8f
            java.lang.Class[] r3 = r2.getParameterTypes()     // Catch: java.lang.Throwable -> L4b
            int r3 = r3.length     // Catch: java.lang.Throwable -> L4b
            r4 = 2
            if (r3 != r4) goto L8f
            java.lang.Class[] r3 = r2.getParameterTypes()     // Catch: java.lang.Throwable -> L4b
            r4 = 1
            r3 = r3[r4]     // Catch: java.lang.Throwable -> L4b
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L4b
            boolean r3 = a.C0193i9.a(r3, r5)     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L8f
            java.lang.Class[] r2 = r2.getParameterTypes()     // Catch: java.lang.Throwable -> L4b
            r3 = 0
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L4b
            boolean r5 = r2.isInterface()     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto L8f
            java.lang.String r5 = r2.getName()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r6 = "java."
            boolean r5 = a.Ae.H(r5, r6, r3)     // Catch: java.lang.Throwable -> L4b
            if (r5 != 0) goto L8f
            java.lang.String r5 = r2.getName()     // Catch: java.lang.Throwable -> L4b
            java.lang.String r6 = "kotlin."
            boolean r5 = a.Ae.H(r5, r6, r3)     // Catch: java.lang.Throwable -> L4b
            if (r5 != 0) goto L8f
            java.lang.Object r5 = r1.get(r2)     // Catch: java.lang.Throwable -> L4b
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto Lef
            int r3 = r5.intValue()     // Catch: java.lang.Throwable -> L4b
        Lef:
            int r3 = r3 + r4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L4b
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L4b
            goto L8f
        Lf8:
            java.util.Set r7 = r1.entrySet()     // Catch: java.lang.Throwable -> L4b
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L4b
            boolean r1 = r7.hasNext()     // Catch: java.lang.Throwable -> L4b
            if (r1 != 0) goto L108
            r1 = r0
            goto L13b
        L108:
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Throwable -> L4b
            boolean r2 = r7.hasNext()     // Catch: java.lang.Throwable -> L4b
            if (r2 != 0) goto L113
            goto L13b
        L113:
            r2 = r1
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L4b
            java.lang.Number r2 = (java.lang.Number) r2     // Catch: java.lang.Throwable -> L4b
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L4b
        L120:
            java.lang.Object r3 = r7.next()     // Catch: java.lang.Throwable -> L4b
            r4 = r3
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L4b
            java.lang.Number r4 = (java.lang.Number) r4     // Catch: java.lang.Throwable -> L4b
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L4b
            if (r2 >= r4) goto L135
            r1 = r3
            r2 = r4
        L135:
            boolean r3 = r7.hasNext()     // Catch: java.lang.Throwable -> L4b
            if (r3 != 0) goto L120
        L13b:
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L4b
            if (r1 == 0) goto L147
            java.lang.Object r7 = r1.getKey()     // Catch: java.lang.Throwable -> L4b
            r2 = r7
            java.lang.Class r2 = (java.lang.Class) r2     // Catch: java.lang.Throwable -> L4b
            goto L14d
        L147:
            r2 = r0
            goto L14d
        L149:
            a.wd$a r2 = a.C0465xd.a(r7)
        L14d:
            boolean r7 = r2 instanceof a.C0447wd.a
            if (r7 == 0) goto L152
            goto L153
        L152:
            r0 = r2
        L153:
            java.lang.Class r0 = (java.lang.Class) r0
            return r0
    }

    public static void e(java.lang.Object r10, java.lang.Object r11, java.lang.String r12) {
            java.lang.String r0 = "[ConvMemGuard] "
            java.lang.String r1 = "] "
            java.lang.String r2 = "["
            java.lang.String r3 = "msg"
            java.lang.String r4 = "ConvMemGuard"
            java.lang.String r5 = "GUARD: submitRemove("
            java.lang.reflect.Method r6 = a.C0402u4.f
            if (r6 != 0) goto L12
            goto L132
        L12:
            java.lang.String r11 = a(r11)
            if (r11 != 0) goto L19
            r11 = r12
        L19:
            java.lang.Object[] r7 = new java.lang.Object[]{r11}     // Catch: java.lang.Throwable -> L42
            r6.invoke(r10, r7)     // Catch: java.lang.Throwable -> L42
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L42
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L42
            r6.append(r11)     // Catch: java.lang.Throwable -> L42
            java.lang.String r5 = ") — masked friend blocked from memory list"
            r6.append(r5)     // Catch: java.lang.Throwable -> L42
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L42
            a.C0193i9.e(r5, r3)     // Catch: java.lang.Throwable -> L42
            java.lang.String r5 = r0.concat(r5)     // Catch: java.lang.Throwable -> L42
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L42
            a.C0453x1.b(r5)     // Catch: java.lang.Throwable -> L42
            a.Wf r5 = a.Wf.f330a     // Catch: java.lang.Throwable -> L42
            goto L47
        L42:
            r5 = move-exception
            a.wd$a r5 = a.C0465xd.a(r5)
        L47:
            java.lang.Throwable r5 = a.C0447wd.a(r5)
            if (r5 == 0) goto L75
            java.lang.String r5 = r5.getMessage()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "GUARD: submitRemove failed for "
            r6.<init>(r7)
            r6.append(r11)
            java.lang.String r7 = ": "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            a.C0193i9.e(r5, r3)
            java.lang.String r5 = r0.concat(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            a.C0453x1.e(r5)
        L75:
            java.lang.String r5 = "f165013o"
            java.lang.Object r10 = a.A1.h(r10, r5)     // Catch: java.lang.Throwable -> L83
            boolean r5 = r10 instanceof java.util.List     // Catch: java.lang.Throwable -> L83
            r6 = 0
            if (r5 == 0) goto L86
            java.util.List r10 = (java.util.List) r10     // Catch: java.lang.Throwable -> L83
            goto L87
        L83:
            r10 = move-exception
            goto L108
        L86:
            r10 = r6
        L87:
            if (r10 != 0) goto L8b
            goto L105
        L8b:
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L83
            java.lang.String r5 = "iterator(...)"
            a.C0193i9.d(r10, r5)     // Catch: java.lang.Throwable -> L83
            r5 = 0
        L95:
            boolean r7 = r10.hasNext()     // Catch: java.lang.Throwable -> L83
            if (r7 == 0) goto Lc9
            java.lang.Object r7 = r10.next()     // Catch: java.lang.Throwable -> L83
            if (r7 != 0) goto La2
            goto L95
        La2:
            java.lang.String r8 = a(r7)     // Catch: java.lang.Throwable -> La7
            goto Lac
        La7:
            r8 = move-exception
            a.wd$a r8 = a.C0465xd.a(r8)     // Catch: java.lang.Throwable -> L83
        Lac:
            boolean r9 = r8 instanceof a.C0447wd.a     // Catch: java.lang.Throwable -> L83
            if (r9 == 0) goto Lb1
            r8 = r6
        Lb1:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L83
            java.lang.String r7 = b(r7)     // Catch: java.lang.Throwable -> L83
            boolean r8 = a.C0193i9.a(r8, r11)     // Catch: java.lang.Throwable -> L83
            if (r8 != 0) goto Lc3
            boolean r7 = a.C0193i9.a(r7, r12)     // Catch: java.lang.Throwable -> L83
            if (r7 == 0) goto L95
        Lc3:
            r10.remove()     // Catch: java.lang.Throwable -> L83
            int r5 = r5 + 1
            goto L95
        Lc9:
            if (r5 <= 0) goto L105
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83
            r10.<init>()     // Catch: java.lang.Throwable -> L83
            java.lang.String r11 = "GUARD: truth-list purge removed "
            r10.append(r11)     // Catch: java.lang.Throwable -> L83
            r10.append(r5)     // Catch: java.lang.Throwable -> L83
            java.lang.String r11 = " item(s) for "
            r10.append(r11)     // Catch: java.lang.Throwable -> L83
            r10.append(r12)     // Catch: java.lang.Throwable -> L83
            java.lang.String r11 = " (render window closed)"
            r10.append(r11)     // Catch: java.lang.Throwable -> L83
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L83
            a.C0193i9.e(r10, r3)     // Catch: java.lang.Throwable -> L83
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L83
            r11.<init>(r2)     // Catch: java.lang.Throwable -> L83
            r11.append(r4)     // Catch: java.lang.Throwable -> L83
            r11.append(r1)     // Catch: java.lang.Throwable -> L83
            r11.append(r10)     // Catch: java.lang.Throwable -> L83
            java.lang.String r10 = r11.toString()     // Catch: java.lang.Throwable -> L83
            java.lang.Object[] r10 = new java.lang.Object[]{r10}     // Catch: java.lang.Throwable -> L83
            a.C0453x1.b(r10)     // Catch: java.lang.Throwable -> L83
        L105:
            a.Wf r10 = a.Wf.f330a     // Catch: java.lang.Throwable -> L83
            goto L10c
        L108:
            a.wd$a r10 = a.C0465xd.a(r10)
        L10c:
            java.lang.Throwable r10 = a.C0447wd.a(r10)
            if (r10 == 0) goto L132
            java.lang.String r10 = r10.getMessage()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "GUARD: truth-list purge failed: "
            r11.<init>(r12)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            a.C0193i9.e(r10, r3)
            java.lang.String r10 = r0.concat(r10)
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            a.C0453x1.e(r10)
        L132:
            return
    }

    public static boolean f(java.lang.Object r11, java.lang.Class r12) {
            java.lang.Object r0 = a.C0402u4.d
            r1 = 1
            if (r11 != r0) goto L6
            goto Le
        L6:
            java.util.Set<java.lang.Object> r0 = a.C0402u4.e
            boolean r2 = r0.contains(r11)
            if (r2 == 0) goto Lf
        Le:
            return r1
        Lf:
            java.util.Set<java.lang.Object> r2 = a.C0402u4.c
            boolean r3 = r2.contains(r11)
            r4 = 0
            if (r3 == 0) goto L19
            return r4
        L19:
            int r0 = r0.size()
            r3 = 4
            if (r0 < r3) goto L24
            r2.add(r11)
            return r4
        L24:
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class r2 = r11.getClass()     // Catch: java.lang.Throwable -> L88
        L2a:
            if (r2 == 0) goto Ld3
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            boolean r3 = r2.equals(r3)     // Catch: java.lang.Throwable -> L88
            if (r3 != 0) goto Ld3
            java.lang.reflect.Field[] r3 = r2.getDeclaredFields()     // Catch: java.lang.Throwable -> L88
            a.G1 r3 = a.C0435w1.I(r3)     // Catch: java.lang.Throwable -> L88
        L3c:
            boolean r5 = r3.hasNext()     // Catch: java.lang.Throwable -> L88
            if (r5 == 0) goto Lcd
            java.lang.Object r5 = r3.next()     // Catch: java.lang.Throwable -> L88
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5     // Catch: java.lang.Throwable -> L88
            int r6 = r5.getModifiers()     // Catch: java.lang.Throwable -> L88
            boolean r6 = java.lang.reflect.Modifier.isStatic(r6)     // Catch: java.lang.Throwable -> L88
            if (r6 != 0) goto L3c
            java.lang.Class r6 = r5.getType()     // Catch: java.lang.Throwable -> L88
            boolean r6 = r6.isPrimitive()     // Catch: java.lang.Throwable -> L88
            if (r6 != 0) goto L3c
            java.lang.Class r6 = r5.getType()     // Catch: java.lang.Throwable -> L88
            boolean r6 = a.C0193i9.a(r6, r0)     // Catch: java.lang.Throwable -> L88
            if (r6 == 0) goto L67
            goto L3c
        L67:
            java.lang.Class r6 = r5.getType()     // Catch: java.lang.Throwable -> L88
            boolean r6 = r6.isInterface()     // Catch: java.lang.Throwable -> L88
            if (r6 == 0) goto L3c
            r5.setAccessible(r1)     // Catch: java.lang.Throwable -> L88
            java.lang.Object r5 = r5.get(r11)     // Catch: java.lang.Throwable -> L88
            if (r5 != 0) goto L7b
            goto L3c
        L7b:
            java.lang.Class r6 = r5.getClass()     // Catch: java.lang.Throwable -> L88
            if (r12 == 0) goto L8a
            boolean r5 = r12.isInstance(r5)     // Catch: java.lang.Throwable -> L88
            if (r5 == 0) goto L8a
            goto Ld4
        L88:
            r12 = move-exception
            goto Ld9
        L8a:
            if (r12 != 0) goto L3c
            java.lang.String r5 = r6.getName()     // Catch: java.lang.Throwable -> L88
            java.lang.String r7 = "fh5.w"
            boolean r5 = r5.equals(r7)     // Catch: java.lang.Throwable -> L88
            if (r5 == 0) goto L3c
            java.lang.reflect.Method[] r5 = r6.getDeclaredMethods()     // Catch: java.lang.Throwable -> L88
            java.lang.String r6 = "getDeclaredMethods(...)"
            a.C0193i9.d(r5, r6)     // Catch: java.lang.Throwable -> L88
            int r6 = r5.length     // Catch: java.lang.Throwable -> L88
            r7 = r4
        La3:
            if (r7 >= r6) goto L3c
            r8 = r5[r7]     // Catch: java.lang.Throwable -> L88
            java.lang.Class[] r9 = r8.getParameterTypes()     // Catch: java.lang.Throwable -> L88
            int r9 = r9.length     // Catch: java.lang.Throwable -> L88
            r10 = 2
            if (r9 != r10) goto Lca
            java.lang.Class[] r9 = r8.getParameterTypes()     // Catch: java.lang.Throwable -> L88
            r9 = r9[r4]     // Catch: java.lang.Throwable -> L88
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L88
            boolean r9 = a.C0193i9.a(r9, r10)     // Catch: java.lang.Throwable -> L88
            if (r9 == 0) goto Lca
            java.lang.Class[] r8 = r8.getParameterTypes()     // Catch: java.lang.Throwable -> L88
            r8 = r8[r1]     // Catch: java.lang.Throwable -> L88
            boolean r8 = a.C0193i9.a(r8, r0)     // Catch: java.lang.Throwable -> L88
            if (r8 == 0) goto Lca
            goto Ld4
        Lca:
            int r7 = r7 + 1
            goto La3
        Lcd:
            java.lang.Class r2 = r2.getSuperclass()     // Catch: java.lang.Throwable -> L88
            goto L2a
        Ld3:
            r1 = r4
        Ld4:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L88
            goto Ldd
        Ld9:
            a.wd$a r12 = a.C0465xd.a(r12)
        Ldd:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r1 = r12 instanceof a.C0447wd.a
            if (r1 == 0) goto Le4
            r12 = r0
        Le4:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L166
            java.lang.Object r0 = a.C0402u4.d
            java.lang.String r1 = "[ConvMemGuard] "
            java.lang.String r2 = "msg"
            java.lang.String r3 = "@"
            if (r0 != 0) goto L126
            a.C0402u4.d = r11
            java.lang.Class r0 = r11.getClass()
            java.lang.String r0 = r0.getName()
            int r4 = java.lang.System.identityHashCode(r11)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "isConvMvvmList: locked main conv list instance="
            r5.<init>(r6)
            r5.append(r0)
            r5.append(r3)
            r5.append(r4)
            java.lang.String r0 = r5.toString()
            a.C0193i9.e(r0, r2)
            java.lang.String r0 = r1.concat(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.b(r0)
        L126:
            java.util.Set<java.lang.Object> r0 = a.C0402u4.e
            r0.add(r11)
            int r0 = r0.size()
            java.lang.Class r4 = r11.getClass()
            java.lang.String r4 = r4.getName()
            int r11 = java.lang.System.identityHashCode(r11)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "isConvMvvmList: guard instance #"
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r0 = "="
            r5.append(r0)
            r5.append(r4)
            r5.append(r3)
            r5.append(r11)
            java.lang.String r11 = r5.toString()
            a.C0193i9.e(r11, r2)
            java.lang.String r11 = r1.concat(r11)
            java.lang.Object[] r11 = new java.lang.Object[]{r11}
            a.C0453x1.b(r11)
            goto L16b
        L166:
            java.util.Set<java.lang.Object> r0 = a.C0402u4.c
            r0.add(r11)
        L16b:
            return r12
    }

    public static boolean g() {
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            boolean r0 = a.K3.a.l()
            if (r0 != 0) goto Lc
            goto L22
        Lc:
            a.jc r0 = a.K3.a.i()
            boolean r0 = r0.n
            if (r0 != 0) goto L15
            goto L22
        L15:
            a.x8 r0 = a.C0460x8.f762a
            boolean r0 = a.C0460x8.a()
            if (r0 == 0) goto L1e
            goto L22
        L1e:
            boolean r0 = a.C0435w1.q
            if (r0 == 0) goto L24
        L22:
            r0 = 0
            return r0
        L24:
            r0 = 1
            return r0
    }

    public final void d(a.J8 r24, java.lang.Class<?> r25) {
            r23 = this;
            r1 = r23
            r0 = r24
            r2 = r25
            java.lang.String r3 = "msg"
            boolean r4 = a.C0402u4.b
            if (r4 == 0) goto Le
            goto L2d4
        Le:
            java.lang.ClassLoader r4 = r0.f136a     // Catch: java.lang.Throwable -> L3c
            java.lang.String r5 = "com.tencent.mm.plugin.mvvmlist.MvvmList"
            java.lang.Class r5 = a.A1.b(r4, r5)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r6 = "] "
            java.lang.String r7 = "["
            java.lang.String r8 = "ConvMemGuard"
            if (r5 != 0) goto L73
            java.lang.String r5 = "MvvmList"
            java.util.List r5 = a.C0435w1.p(r5)     // Catch: java.lang.Throwable -> L3c
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L3c
        L28:
            boolean r10 = r5.hasNext()     // Catch: java.lang.Throwable -> L3c
            if (r10 == 0) goto L3f
            java.lang.Object r10 = r5.next()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L3c
            java.lang.Class r10 = a.A1.b(r4, r10)     // Catch: java.lang.Throwable -> L3c
            if (r10 == 0) goto L28
            r5 = r10
            goto L40
        L3c:
            r0 = move-exception
            goto L2a8
        L3f:
            r5 = 0
        L40:
            if (r5 == 0) goto L73
            java.lang.String r4 = r5.getName()     // Catch: java.lang.Throwable -> L3c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r10.<init>()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r11 = "install: MvvmList located via DexKit: "
            r10.append(r11)     // Catch: java.lang.Throwable -> L3c
            r10.append(r4)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r4 = r10.toString()     // Catch: java.lang.Throwable -> L3c
            a.C0193i9.e(r4, r3)     // Catch: java.lang.Throwable -> L3c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r10.<init>(r7)     // Catch: java.lang.Throwable -> L3c
            r10.append(r8)     // Catch: java.lang.Throwable -> L3c
            r10.append(r6)     // Catch: java.lang.Throwable -> L3c
            r10.append(r4)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r4 = r10.toString()     // Catch: java.lang.Throwable -> L3c
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L3c
            a.C0453x1.b(r4)     // Catch: java.lang.Throwable -> L3c
        L73:
            if (r5 != 0) goto L91
            java.lang.String r0 = "install: MvvmList class not found, guard disabled"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L3c
            r2.append(r8)     // Catch: java.lang.Throwable -> L3c
            r2.append(r6)     // Catch: java.lang.Throwable -> L3c
            r2.append(r0)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L3c
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L3c
            a.C0453x1.e(r0)     // Catch: java.lang.Throwable -> L3c
            return
        L91:
            java.lang.Class r4 = c(r5)     // Catch: java.lang.Throwable -> L3c
            java.lang.Class<java.util.List> r11 = java.util.List.class
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            java.lang.Class r13 = java.lang.Boolean.TYPE
            java.lang.Class r15 = java.lang.Void.TYPE
            java.lang.String r9 = "getDeclaredMethods(...)"
            r16 = 0
            if (r4 == 0) goto Lff
            r17 = 1
            java.lang.reflect.Method[] r10 = r5.getDeclaredMethods()     // Catch: java.lang.Throwable -> L3c
            a.C0193i9.d(r10, r9)     // Catch: java.lang.Throwable -> L3c
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3c
            r14.<init>()     // Catch: java.lang.Throwable -> L3c
            r18 = r5
            int r5 = r10.length     // Catch: java.lang.Throwable -> L3c
            r19 = r10
            r10 = r16
        Lb8:
            if (r10 >= r5) goto Lf9
            r20 = r5
            r5 = r19[r10]     // Catch: java.lang.Throwable -> L3c
            r21 = r10
            java.lang.Class r10 = r5.getReturnType()     // Catch: java.lang.Throwable -> L3c
            boolean r10 = a.C0193i9.a(r10, r15)     // Catch: java.lang.Throwable -> L3c
            if (r10 == 0) goto Lf0
            java.lang.Class[] r10 = r5.getParameterTypes()     // Catch: java.lang.Throwable -> L3c
            int r10 = r10.length     // Catch: java.lang.Throwable -> L3c
            r22 = r6
            r6 = 2
            if (r10 != r6) goto Lf2
            java.lang.Class[] r6 = r5.getParameterTypes()     // Catch: java.lang.Throwable -> L3c
            r6 = r6[r16]     // Catch: java.lang.Throwable -> L3c
            boolean r6 = a.C0193i9.a(r6, r4)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto Lf2
            java.lang.Class[] r6 = r5.getParameterTypes()     // Catch: java.lang.Throwable -> L3c
            r6 = r6[r17]     // Catch: java.lang.Throwable -> L3c
            boolean r6 = a.C0193i9.a(r6, r13)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto Lf2
            r14.add(r5)     // Catch: java.lang.Throwable -> L3c
            goto Lf2
        Lf0:
            r22 = r6
        Lf2:
            int r10 = r21 + 1
            r5 = r20
            r6 = r22
            goto Lb8
        Lf9:
            r22 = r6
        Lfb:
            r19 = r4
            goto L17b
        Lff:
            r18 = r5
            r22 = r6
            r17 = 1
            java.lang.reflect.Method[] r5 = r18.getDeclaredMethods()     // Catch: java.lang.Throwable -> L3c
            a.C0193i9.d(r5, r9)     // Catch: java.lang.Throwable -> L3c
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3c
            r14.<init>()     // Catch: java.lang.Throwable -> L3c
            int r6 = r5.length     // Catch: java.lang.Throwable -> L3c
            r10 = r16
        L114:
            if (r10 >= r6) goto Lfb
            r19 = r4
            r4 = r5[r10]     // Catch: java.lang.Throwable -> L3c
            r20 = r5
            java.lang.Class r5 = r4.getReturnType()     // Catch: java.lang.Throwable -> L3c
            boolean r5 = a.C0193i9.a(r5, r15)     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L170
            java.lang.Class[] r5 = r4.getParameterTypes()     // Catch: java.lang.Throwable -> L3c
            int r5 = r5.length     // Catch: java.lang.Throwable -> L3c
            r21 = r6
            r6 = 2
            if (r5 != r6) goto L172
            java.lang.Class[] r5 = r4.getParameterTypes()     // Catch: java.lang.Throwable -> L3c
            r5 = r5[r16]     // Catch: java.lang.Throwable -> L3c
            boolean r5 = r5.isPrimitive()     // Catch: java.lang.Throwable -> L3c
            if (r5 != 0) goto L172
            java.lang.Class[] r5 = r4.getParameterTypes()     // Catch: java.lang.Throwable -> L3c
            r5 = r5[r16]     // Catch: java.lang.Throwable -> L3c
            boolean r5 = a.C0193i9.a(r5, r12)     // Catch: java.lang.Throwable -> L3c
            if (r5 != 0) goto L172
            java.lang.Class[] r5 = r4.getParameterTypes()     // Catch: java.lang.Throwable -> L3c
            r5 = r5[r16]     // Catch: java.lang.Throwable -> L3c
            boolean r5 = a.C0193i9.a(r5, r11)     // Catch: java.lang.Throwable -> L3c
            if (r5 != 0) goto L172
            java.lang.Class[] r5 = r4.getParameterTypes()     // Catch: java.lang.Throwable -> L3c
            r5 = r5[r16]     // Catch: java.lang.Throwable -> L3c
            boolean r5 = r5.isInterface()     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L172
            java.lang.Class[] r5 = r4.getParameterTypes()     // Catch: java.lang.Throwable -> L3c
            r5 = r5[r17]     // Catch: java.lang.Throwable -> L3c
            boolean r5 = a.C0193i9.a(r5, r13)     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L172
            r14.add(r4)     // Catch: java.lang.Throwable -> L3c
            goto L172
        L170:
            r21 = r6
        L172:
            int r10 = r10 + 1
            r4 = r19
            r5 = r20
            r6 = r21
            goto L114
        L17b:
            java.lang.reflect.Method[] r4 = r18.getDeclaredMethods()     // Catch: java.lang.Throwable -> L3c
            a.C0193i9.d(r4, r9)     // Catch: java.lang.Throwable -> L3c
            int r5 = r4.length     // Catch: java.lang.Throwable -> L3c
            r6 = r16
        L185:
            if (r6 >= r5) goto L1c2
            r10 = r4[r6]     // Catch: java.lang.Throwable -> L3c
            r20 = r4
            java.lang.Class r4 = r10.getReturnType()     // Catch: java.lang.Throwable -> L3c
            boolean r4 = a.C0193i9.a(r4, r15)     // Catch: java.lang.Throwable -> L3c
            if (r4 == 0) goto L1b8
            java.lang.Class[] r4 = r10.getParameterTypes()     // Catch: java.lang.Throwable -> L3c
            int r4 = r4.length     // Catch: java.lang.Throwable -> L3c
            r21 = r5
            r5 = 2
            if (r4 != r5) goto L1bb
            java.lang.Class[] r4 = r10.getParameterTypes()     // Catch: java.lang.Throwable -> L3c
            r4 = r4[r16]     // Catch: java.lang.Throwable -> L3c
            boolean r4 = a.C0193i9.a(r4, r11)     // Catch: java.lang.Throwable -> L3c
            if (r4 == 0) goto L1bb
            java.lang.Class[] r4 = r10.getParameterTypes()     // Catch: java.lang.Throwable -> L3c
            r4 = r4[r17]     // Catch: java.lang.Throwable -> L3c
            boolean r4 = a.C0193i9.a(r4, r13)     // Catch: java.lang.Throwable -> L3c
            if (r4 == 0) goto L1bb
            goto L1c3
        L1b8:
            r21 = r5
            r5 = 2
        L1bb:
            int r6 = r6 + 1
            r4 = r20
            r5 = r21
            goto L185
        L1c2:
            r10 = 0
        L1c3:
            java.lang.reflect.Method[] r4 = r18.getDeclaredMethods()     // Catch: java.lang.Throwable -> L3c
            a.C0193i9.d(r4, r9)     // Catch: java.lang.Throwable -> L3c
            int r5 = r4.length     // Catch: java.lang.Throwable -> L3c
            r6 = r16
        L1cd:
            if (r6 >= r5) goto L1f6
            r9 = r4[r6]     // Catch: java.lang.Throwable -> L3c
            java.lang.Class r11 = r9.getReturnType()     // Catch: java.lang.Throwable -> L3c
            boolean r11 = a.C0193i9.a(r11, r15)     // Catch: java.lang.Throwable -> L3c
            if (r11 == 0) goto L1f1
            java.lang.Class[] r11 = r9.getParameterTypes()     // Catch: java.lang.Throwable -> L3c
            int r11 = r11.length     // Catch: java.lang.Throwable -> L3c
            r13 = r17
            if (r11 != r13) goto L1f1
            java.lang.Class[] r11 = r9.getParameterTypes()     // Catch: java.lang.Throwable -> L3c
            r11 = r11[r16]     // Catch: java.lang.Throwable -> L3c
            boolean r11 = a.C0193i9.a(r11, r12)     // Catch: java.lang.Throwable -> L3c
            if (r11 == 0) goto L1f1
            goto L1f7
        L1f1:
            int r6 = r6 + 1
            r17 = 1
            goto L1cd
        L1f6:
            r9 = 0
        L1f7:
            if (r9 == 0) goto L200
            r13 = 1
            r9.setAccessible(r13)     // Catch: java.lang.Throwable -> L3c
            a.C0402u4.f = r9     // Catch: java.lang.Throwable -> L3c
            goto L201
        L200:
            r13 = 1
        L201:
            java.util.Iterator r4 = r14.iterator()     // Catch: java.lang.Throwable -> L3c
            r5 = r16
        L207:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r11 = "F035"
            if (r6 == 0) goto L224
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Throwable -> L3c
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6     // Catch: java.lang.Throwable -> L3c
            a.C0193i9.b(r6)     // Catch: java.lang.Throwable -> L3c
            a.t4 r12 = new a.t4     // Catch: java.lang.Throwable -> L3c
            r15 = 0
            r12.<init>(r1, r2, r15)     // Catch: java.lang.Throwable -> L3c
            a.J8.h(r0, r11, r6, r12)     // Catch: java.lang.Throwable -> L3c
            int r5 = r5 + 1
            goto L207
        L224:
            if (r10 == 0) goto L231
            a.t4 r4 = new a.t4     // Catch: java.lang.Throwable -> L3c
            r6 = 1
            r4.<init>(r1, r2, r6)     // Catch: java.lang.Throwable -> L3c
            a.J8.h(r0, r11, r10, r4)     // Catch: java.lang.Throwable -> L3c
            int r5 = r5 + 1
        L231:
            if (r5 <= 0) goto L235
            r0 = r13
            goto L237
        L235:
            r0 = r16
        L237:
            a.C0402u4.b = r0     // Catch: java.lang.Throwable -> L3c
            int r0 = r14.size()     // Catch: java.lang.Throwable -> L3c
            if (r10 == 0) goto L241
            r2 = r13
            goto L243
        L241:
            r2 = r16
        L243:
            if (r9 == 0) goto L247
            r10 = r13
            goto L249
        L247:
            r10 = r16
        L249:
            if (r19 == 0) goto L250
            java.lang.String r9 = r19.getName()     // Catch: java.lang.Throwable -> L3c
            goto L251
        L250:
            r9 = 0
        L251:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r4.<init>()     // Catch: java.lang.Throwable -> L3c
            java.lang.String r6 = "install: hooked "
            r4.append(r6)     // Catch: java.lang.Throwable -> L3c
            r4.append(r5)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r5 = " methods on MvvmList (single="
            r4.append(r5)     // Catch: java.lang.Throwable -> L3c
            r4.append(r0)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = ", batch="
            r4.append(r0)     // Catch: java.lang.Throwable -> L3c
            r4.append(r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = ", remove="
            r4.append(r0)     // Catch: java.lang.Throwable -> L3c
            r4.append(r10)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = ", itemIface="
            r4.append(r0)     // Catch: java.lang.Throwable -> L3c
            r4.append(r9)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = ")"
            r4.append(r0)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L3c
            a.C0193i9.e(r0, r3)     // Catch: java.lang.Throwable -> L3c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L3c
            r2.append(r8)     // Catch: java.lang.Throwable -> L3c
            r4 = r22
            r2.append(r4)     // Catch: java.lang.Throwable -> L3c
            r2.append(r0)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L3c
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L3c
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L3c
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L3c
            goto L2ac
        L2a8:
            a.wd$a r0 = a.C0465xd.a(r0)
        L2ac:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L2d4
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "install FAILED: "
            r2.<init>(r4)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            a.C0193i9.e(r0, r3)
            java.lang.String r2 = "[ConvMemGuard] "
            java.lang.String r0 = r2.concat(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            a.C0453x1.a(r0)
        L2d4:
            return
    }
}
