package y4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final java.util.Map f22292f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final java.util.HashMap f22293g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final java.util.HashMap f22294h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final java.util.HashMap f22295i = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Class f22296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public java.lang.ClassLoader f22297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public java.io.File f22298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.lang.Object[] f22299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f22300e;

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            y4.c.f22292f = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            y4.c.f22293g = r0
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            r0.put(r1, r2)
            java.lang.Class r3 = java.lang.Integer.TYPE
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            r0.put(r3, r4)
            java.lang.Class r5 = java.lang.Byte.TYPE
            java.lang.Class<java.lang.Byte> r6 = java.lang.Byte.class
            r0.put(r5, r6)
            java.lang.Class r7 = java.lang.Long.TYPE
            java.lang.Class<java.lang.Long> r8 = java.lang.Long.class
            r0.put(r7, r8)
            java.lang.Class r9 = java.lang.Short.TYPE
            java.lang.Class<java.lang.Short> r10 = java.lang.Short.class
            r0.put(r9, r10)
            java.lang.Class r11 = java.lang.Float.TYPE
            java.lang.Class<java.lang.Float> r12 = java.lang.Float.class
            r0.put(r11, r12)
            java.lang.Class r13 = java.lang.Double.TYPE
            java.lang.Class<java.lang.Double> r14 = java.lang.Double.class
            r0.put(r13, r14)
            java.lang.Class r15 = java.lang.Character.TYPE
            r16 = r2
            java.lang.Class<java.lang.Character> r2 = java.lang.Character.class
            r0.put(r15, r2)
            java.util.HashMap r17 = new java.util.HashMap
            r17.<init>()
            y4.c.f22294h = r17
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L5b:
            boolean r17 = r0.hasNext()
            if (r17 == 0) goto L9b
            java.lang.Object r17 = r0.next()
            java.util.Map$Entry r17 = (java.util.Map.Entry) r17
            java.lang.Object r18 = r17.getKey()
            java.lang.Class r18 = (java.lang.Class) r18
            r19 = r0
            g4.j r0 = g4.j.a(r18)
            java.lang.Object r17 = r17.getValue()
            java.lang.Class r17 = (java.lang.Class) r17
            r18 = r2
            g4.j r2 = g4.j.a(r17)
            r17 = r4
            java.lang.String r4 = "valueOf"
            r20 = r6
            g4.j[] r6 = new g4.j[]{r0}
            g4.i r2 = r2.b(r2, r4, r6)
            java.util.HashMap r4 = y4.c.f22294h
            r4.put(r0, r2)
            r4 = r17
            r2 = r18
            r0 = r19
            r6 = r20
            goto L5b
        L9b:
            r18 = r2
            r17 = r4
            r20 = r6
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            g4.j r2 = g4.j.a(r16)
            g4.j r4 = g4.j.f4299d
            java.lang.String r6 = "booleanValue"
            r16 = r8
            r8 = 0
            r19 = r10
            g4.j[] r10 = new g4.j[r8]
            g4.i r2 = r2.b(r4, r6, r10)
            r0.put(r1, r2)
            g4.j r1 = g4.j.a(r17)
            g4.j r2 = g4.j.f4304i
            java.lang.String r4 = "intValue"
            g4.j[] r6 = new g4.j[r8]
            g4.i r1 = r1.b(r2, r4, r6)
            r0.put(r3, r1)
            g4.j r1 = g4.j.a(r20)
            g4.j r2 = g4.j.f4300e
            java.lang.String r3 = "byteValue"
            g4.j[] r4 = new g4.j[r8]
            g4.i r1 = r1.b(r2, r3, r4)
            r0.put(r5, r1)
            g4.j r1 = g4.j.a(r16)
            g4.j r2 = g4.j.f4305j
            java.lang.String r3 = "longValue"
            g4.j[] r4 = new g4.j[r8]
            g4.i r1 = r1.b(r2, r3, r4)
            r0.put(r7, r1)
            g4.j r1 = g4.j.a(r19)
            g4.j r2 = g4.j.f4306k
            java.lang.String r3 = "shortValue"
            g4.j[] r4 = new g4.j[r8]
            g4.i r1 = r1.b(r2, r3, r4)
            r0.put(r9, r1)
            g4.j r1 = g4.j.a(r12)
            g4.j r2 = g4.j.f4303h
            java.lang.String r3 = "floatValue"
            g4.j[] r4 = new g4.j[r8]
            g4.i r1 = r1.b(r2, r3, r4)
            r0.put(r11, r1)
            g4.j r1 = g4.j.a(r14)
            g4.j r2 = g4.j.f4302g
            java.lang.String r3 = "doubleValue"
            g4.j[] r4 = new g4.j[r8]
            g4.i r1 = r1.b(r2, r3, r4)
            r0.put(r13, r1)
            g4.j r1 = g4.j.a(r18)
            g4.j r2 = g4.j.f4301f
            java.lang.String r3 = "charValue"
            g4.j[] r4 = new g4.j[r8]
            g4.i r1 = r1.b(r2, r3, r4)
            r0.put(r15, r1)
            y4.c.f22295i = r0
            return
    }

    public c(java.lang.Class r2) {
            r1 = this;
            r1.<init>()
            java.lang.Class<y4.c> r0 = y4.c.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r1.f22297b = r0
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1.f22299d = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f22300e = r0
            r1.f22296a = r2
            return
    }

    public static java.lang.Object b(java.lang.Object r2, java.lang.reflect.Method r3, java.lang.Object... r4) {
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.reflect.InvocationTargetException -> L15
            java.lang.String r1 = e(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L15
            java.lang.Class[] r3 = r3.getParameterTypes()     // Catch: java.lang.reflect.InvocationTargetException -> L15
            java.lang.reflect.Method r3 = r0.getMethod(r1, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L15
            java.lang.Object r2 = r3.invoke(r2, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L15
            return r2
        L15:
            r2 = move-exception
            java.lang.Throwable r2 = r2.getCause()
            throw r2
    }

    public static void c(java.util.HashSet r7, java.util.HashSet r8, java.lang.Class r9) {
            java.lang.reflect.Method[] r0 = r9.getDeclaredMethods()
            int r1 = r0.length
            r2 = 0
            r3 = r2
        L7:
            if (r3 >= r1) goto L63
            r4 = r0[r3]
            int r5 = r4.getModifiers()
            r5 = r5 & 16
            if (r5 == 0) goto L1f
            y4.a r5 = new y4.a
            r5.<init>(r4)
            r8.add(r5)
            r7.remove(r5)
            goto L60
        L1f:
            int r5 = r4.getModifiers()
            r5 = r5 & 8
            if (r5 == 0) goto L28
            goto L60
        L28:
            int r5 = r4.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isPublic(r5)
            if (r5 != 0) goto L3d
            int r5 = r4.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isProtected(r5)
            if (r5 != 0) goto L3d
            goto L60
        L3d:
            java.lang.String r5 = r4.getName()
            java.lang.String r6 = "finalize"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L51
            java.lang.Class[] r5 = r4.getParameterTypes()
            int r5 = r5.length
            if (r5 != 0) goto L51
            goto L60
        L51:
            y4.a r5 = new y4.a
            r5.<init>(r4)
            boolean r4 = r8.contains(r5)
            if (r4 == 0) goto L5d
            goto L60
        L5d:
            r7.add(r5)
        L60:
            int r3 = r3 + 1
            goto L7
        L63:
            boolean r0 = r9.isInterface()
            if (r0 == 0) goto L78
            java.lang.Class[] r9 = r9.getInterfaces()
            int r0 = r9.length
        L6e:
            if (r2 >= r0) goto L78
            r1 = r9[r2]
            c(r7, r8, r1)
            int r2 = r2 + 1
            goto L6e
        L78:
            return
    }

    public static void d(java.lang.Object r2, q8.b r3) {
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.IllegalAccessException -> L12 java.lang.NoSuchFieldException -> L17
            java.lang.String r1 = "$__handler"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.IllegalAccessException -> L12 java.lang.NoSuchFieldException -> L17
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.IllegalAccessException -> L12 java.lang.NoSuchFieldException -> L17
            r0.set(r2, r3)     // Catch: java.lang.IllegalAccessException -> L12 java.lang.NoSuchFieldException -> L17
            return
        L12:
            r2 = move-exception
            j8.o.f(r2)
            return
        L17:
            r2 = move-exception
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Not a valid proxy instance"
            r3.<init>(r0, r2)
            throw r3
    }

    public static java.lang.String e(java.lang.reflect.Method r3) {
            java.lang.Class r0 = r3.getReturnType()
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "super$"
            r1.<init>(r2)
            java.lang.String r3 = r3.getName()
            r1.append(r3)
            java.lang.String r3 = "$"
            r1.append(r3)
            r3 = 46
            r2 = 95
            java.lang.String r3 = r0.replace(r3, r2)
            r0 = 91
            java.lang.String r3 = r3.replace(r0, r2)
            r0 = 59
            java.lang.String r3 = r3.replace(r0, r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
    }

    public static void f(g4.b r12, java.lang.reflect.Method r13, g4.h r14, g4.h r15) {
            java.lang.Class<java.lang.AbstractMethodError> r1 = java.lang.AbstractMethodError.class
            g4.j r1 = g4.j.a(r1)
            g4.j r2 = g4.j.f4309n
            g4.j[] r2 = new g4.j[]{r2}
            r1.getClass()
            g4.i r3 = new g4.i
            g4.j r5 = g4.j.f4307l
            g4.k r6 = new g4.k
            r6.<init>(r2)
            java.lang.String r2 = "<init>"
            r3.<init>(r1, r5, r2, r6)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "'"
            r2.<init>(r5)
            r2.append(r13)
            java.lang.String r5 = "' cannot be called"
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r12.i(r14, r2)
            g4.h[] r5 = new g4.h[]{r14}
            if (r15 == 0) goto L84
            u4.v r6 = new u4.v
            u4.r r7 = u4.s.Y1
            u4.t r8 = r12.f4263h
            u4.p r9 = u4.p.f13403i
            w4.b r10 = r12.f4265j
            v4.d0 r11 = r1.f4313c
            r6.<init>(r7, r8, r9, r10, r11)
            r7 = 0
            r12.a(r6, r7)
            r1 = 1
            r12.j(r15, r1)
            java.lang.String r1 = r3.a(r1)
            w4.a r1 = w4.a.d(r1)
            r2 = r1
            u4.r r1 = new u4.r
            w4.b r2 = r2.c()
            w4.b r6 = w4.b.f14854p
            r8 = 52
            r1.<init>(r8, r2, r6)
            r2 = r3
            r3 = 0
            r0 = r12
            r4 = r15
            r0.g(r1, r2, r3, r4, r5)
            u4.u r1 = new u4.u
            u4.r r2 = u4.s.D1
            u4.t r3 = r12.f4263h
            u4.o r4 = r15.a()
            u4.p r4 = u4.p.p(r4)
            w4.b r5 = r12.f4265j
            r1.<init>(r2, r3, r4, r5)
            r12.a(r1, r7)
            return
        L84:
            j8.o.o()
            return
    }

    public final java.lang.Class a() {
            r75 = this;
            r1 = r75
            java.lang.ClassLoader r0 = r1.f22297b
            y4.b r2 = new y4.b
            java.lang.Class r3 = r1.f22296a
            java.util.ArrayList r4 = r1.f22300e
            r2.<init>(r3, r4, r0)
            java.util.Map r0 = y4.c.f22292f
            java.lang.Object r5 = r0.get(r2)
            java.lang.Class r5 = (java.lang.Class) r5
            if (r5 == 0) goto L18
            return r5
        L18:
            b.e r5 = new b.e
            r6 = 7
            r5.<init>(r6)
            int r6 = r4.hashCode()
            java.lang.String r6 = java.lang.Integer.toHexString(r6)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r3.getName()
            java.lang.String r9 = "."
            java.lang.String r10 = "/"
            java.lang.String r8 = r8.replace(r9, r10)
            r7.append(r8)
            java.lang.String r8 = "_"
            r7.append(r8)
            java.lang.String r8 = "_Proxy"
            java.lang.String r6 = eh.a.r(r7, r6, r8)
            java.lang.String r7 = "L"
            java.lang.String r8 = ";"
            java.lang.String r7 = eh.a.n(r7, r6, r8)
            g4.j r8 = new g4.j
            w4.c r9 = w4.c.o(r7)
            r8.<init>(r7, r9)
            g4.j r7 = g4.j.a(r3)
            java.lang.Class<java.lang.reflect.InvocationHandler> r9 = java.lang.reflect.InvocationHandler.class
            g4.j r10 = g4.j.a(r9)
            java.lang.Class<java.lang.reflect.Method[]> r11 = java.lang.reflect.Method[].class
            g4.j r12 = g4.j.a(r11)
            g4.f r13 = new g4.f
            java.lang.String r14 = "$__handler"
            r13.<init>(r8, r10, r14)
            r10 = 2
            r5.p(r13, r10)
            g4.f r13 = new g4.f
            java.lang.String r15 = "$__methodArray"
            r13.<init>(r8, r12, r15)
            r12 = 10
            r5.p(r13, r12)
            java.lang.reflect.Constructor[] r12 = r3.getDeclaredConstructors()
            int r13 = r12.length
            r10 = 0
        L83:
            java.lang.String r18 = "static methods cannot access 'this'"
            r19 = r4
            r20 = 0
            if (r10 >= r13) goto L137
            r21 = r12[r10]
            int r4 = r21.getModifiers()
            r22 = r9
            r9 = 16
            if (r4 != r9) goto La1
            r21 = r10
            r23 = r11
            r24 = r12
            r25 = r13
            goto L125
        La1:
            java.lang.Class[] r4 = r21.getParameterTypes()
            int r9 = r4.length
            r21 = r10
            g4.j[] r10 = new g4.j[r9]
            r23 = r11
            r24 = r12
            r11 = 0
        Laf:
            int r12 = r4.length
            if (r11 >= r12) goto Lbd
            r12 = r4[r11]
            g4.j r12 = g4.j.a(r12)
            r10[r11] = r12
            int r11 = r11 + 1
            goto Laf
        Lbd:
            g4.i r4 = new g4.i
            g4.j r11 = g4.j.f4307l
            g4.k r12 = new g4.k
            r12.<init>(r10)
            r25 = r13
            java.lang.String r13 = "<init>"
            r4.<init>(r8, r11, r13, r12)
            g4.b r4 = r5.o(r4)
            g4.h r11 = r4.f4260e
            if (r11 == 0) goto L133
            g4.b.d(r11, r8)
            g4.h[] r12 = new g4.h[r9]
            r30 = r11
            r11 = 0
        Ldd:
            if (r11 >= r9) goto Lee
            r26 = r9
            r9 = r10[r11]
            g4.h r9 = r4.e(r11, r9)
            r12[r11] = r9
            int r11 = r11 + 1
            r9 = r26
            goto Ldd
        Lee:
            r7.getClass()
            g4.i r9 = new g4.i
            g4.j r11 = g4.j.f4307l
            r26 = r4
            g4.k r4 = new g4.k
            r4.<init>(r10)
            r9.<init>(r7, r11, r13, r4)
            r4 = 1
            java.lang.String r4 = r9.a(r4)
            w4.a r4 = w4.a.d(r4)
            u4.r r10 = u4.s.f13413a
            u4.r r10 = new u4.r
            w4.b r4 = r4.c()
            w4.b r11 = w4.b.f14854p
            r13 = 52
            r10.<init>(r13, r4, r11)
            r29 = 0
            r28 = r9
            r27 = r10
            r31 = r12
            r26.g(r27, r28, r29, r30, r31)
            r26.m()
        L125:
            int r10 = r21 + 1
            r4 = r19
            r9 = r22
            r11 = r23
            r12 = r24
            r13 = r25
            goto L83
        L133:
            j8.o.A(r18)
            return r20
        L137:
            r22 = r9
            r23 = r11
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            r10 = r3
        L146:
            if (r10 == 0) goto L150
            c(r4, r9, r10)
            java.lang.Class r10 = r10.getSuperclass()
            goto L146
        L150:
            r10 = r3
        L151:
            if (r10 == 0) goto L16e
            java.lang.Class[] r11 = r10.getInterfaces()
            int r12 = r11.length
            r13 = 0
        L159:
            if (r13 >= r12) goto L167
            r21 = r10
            r10 = r11[r13]
            c(r4, r9, r10)
            int r13 = r13 + 1
            r10 = r21
            goto L159
        L167:
            r21 = r10
            java.lang.Class r10 = r21.getSuperclass()
            goto L151
        L16e:
            java.util.Iterator r10 = r19.iterator()
        L172:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L182
            java.lang.Object r11 = r10.next()
            java.lang.Class r11 = (java.lang.Class) r11
            c(r4, r9, r11)
            goto L172
        L182:
            int r9 = r4.size()
            java.lang.reflect.Method[] r10 = new java.lang.reflect.Method[r9]
            java.util.Iterator r4 = r4.iterator()
            r11 = 0
        L18d:
            boolean r12 = r4.hasNext()
            if (r12 == 0) goto L1a1
            java.lang.Object r12 = r4.next()
            y4.a r12 = (y4.a) r12
            int r13 = r11 + 1
            java.lang.reflect.Method r12 = r12.f22288d
            r10[r11] = r12
            r11 = r13
            goto L18d
        L1a1:
            r4.m r4 = new r4.m
            r11 = 4
            r4.<init>(r11)
            java.util.Arrays.sort(r10, r4)
            g4.j r4 = g4.j.a(r22)
            g4.j r12 = g4.j.a(r23)
            r4.getClass()
            v4.z r13 = new v4.z
            v4.c0 r11 = new v4.c0
            r11.<init>(r14)
            v4.c0 r14 = new v4.c0
            r22 = r3
            java.lang.String r3 = r4.f4311a
            r14.<init>(r3)
            r13.<init>(r11, r14)
            v4.m r3 = new v4.m
            v4.d0 r11 = r8.f4313c
            r3.<init>(r11, r13)
            r12.getClass()
            v4.z r13 = new v4.z
            v4.c0 r14 = new v4.c0
            r14.<init>(r15)
            r28 = r3
            v4.c0 r3 = new v4.c0
            r29 = r0
            java.lang.String r0 = r12.f4311a
            r3.<init>(r0)
            r13.<init>(r14, r3)
            v4.m r0 = new v4.m
            r0.<init>(r11, r13)
            java.lang.Class<java.lang.reflect.Method> r3 = java.lang.reflect.Method.class
            g4.j r3 = g4.j.a(r3)
            java.lang.Class<java.lang.Object[]> r11 = java.lang.Object[].class
            g4.j r11 = g4.j.a(r11)
            g4.j r13 = g4.j.f4308m
            java.lang.String r14 = "invoke"
            r35 = r0
            g4.j[] r0 = new g4.j[]{r13, r3, r11}
            g4.i r0 = r4.b(r13, r14, r0)
            r13 = 0
        L207:
            if (r13 >= r9) goto L5d8
            r14 = r10[r13]
            r42 = r9
            java.lang.String r9 = r14.getName()
            r43 = r13
            java.lang.Class[] r13 = r14.getParameterTypes()
            r44 = r2
            int r2 = r13.length
            r45 = r10
            g4.j[] r10 = new g4.j[r2]
            r46 = r15
            r15 = 0
        L221:
            if (r15 >= r2) goto L22e
            r23 = r13[r15]
            g4.j r23 = g4.j.a(r23)
            r10[r15] = r23
            int r15 = r15 + 1
            goto L221
        L22e:
            java.lang.Class r15 = r14.getReturnType()
            g4.j r1 = g4.j.a(r15)
            r47 = r6
            g4.i r6 = r8.b(r1, r9, r10)
            java.lang.Class<java.lang.AbstractMethodError> r23 = java.lang.AbstractMethodError.class
            r48 = r14
            g4.j r14 = g4.j.a(r23)
            g4.b r6 = r5.o(r6)
            r49 = r5
            g4.h r5 = r6.f4260e
            if (r5 == 0) goto L5d2
            g4.b.d(r5, r8)
            r50 = r8
            w4.b r8 = r6.f4265j
            r51 = r0
            u4.t r0 = r6.f4263h
            r52 = r5
            g4.h r5 = r6.k(r4)
            r53 = r2
            g4.j r2 = r5.f4291b
            r54 = r5
            g4.j r5 = g4.j.f4308m
            g4.h r55 = r6.k(r5)
            r36 = r2
            g4.j r2 = g4.j.f4304i
            r56 = r0
            g4.h r0 = r6.k(r2)
            r57 = r0
            g4.h r0 = r6.k(r11)
            r58 = r11
            g4.j r11 = r0.f4291b
            r59 = r0
            g4.h r0 = r6.k(r2)
            g4.h r39 = r6.k(r5)
            g4.h r5 = r6.k(r1)
            r60 = r5
            g4.h r5 = r6.k(r12)
            r61 = r12
            g4.h r12 = r6.k(r3)
            g4.h r2 = r6.k(r2)
            r62 = r3
            java.util.HashMap r3 = y4.c.f22293g
            java.lang.Object r3 = r3.get(r15)
            java.lang.Class r3 = (java.lang.Class) r3
            if (r3 == 0) goto L2b4
            g4.j r3 = g4.j.a(r3)
            g4.h r3 = r6.k(r3)
            r63 = r3
            goto L2b6
        L2b4:
            r63 = r20
        L2b6:
            g4.h r3 = r6.k(r4)
            r64 = r4
            int r4 = r48.getModifiers()
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 != 0) goto L2df
            int r4 = r13.length
            g4.h[] r4 = new g4.h[r4]
            g4.h r23 = r6.k(r1)
            g4.i r9 = r7.b(r1, r9, r10)
            r65 = r7
            r67 = r13
            r66 = r14
            r13 = r23
            r7 = r4
            r14 = r9
            r4 = r20
            r9 = r4
        L2dc:
            r68 = r1
            goto L2f4
        L2df:
            g4.j r4 = g4.j.f4309n
            g4.h r4 = r6.k(r4)
            g4.h r9 = r6.k(r14)
            r65 = r7
            r67 = r13
            r66 = r14
            r7 = r20
            r13 = r7
            r14 = r13
            goto L2dc
        L2f4:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r43)
            r6.i(r2, r1)
            u4.v r30 = new u4.v
            g4.j r1 = r5.f4291b
            w4.c r1 = r1.f4312b
            u4.r r31 = u4.s.f(r1)
            u4.t r1 = r6.f4263h
            u4.p r33 = u4.p.f13403i
            r32 = r1
            w4.b r1 = r6.f4265j
            r34 = r1
            r30.<init>(r31, r32, r33, r34, r35)
            r1 = r20
            r20 = r2
            r2 = r1
            r1 = r30
            r6.a(r1, r2)
            r1 = 1
            r6.j(r5, r1)
            u4.u r1 = new u4.u
            g4.j r2 = r12.f4291b
            w4.c r2 = r2.f4312b
            u4.r r2 = u4.s.a(r2)
            u4.o r5 = r5.a()
            r30 = r10
            u4.o r10 = r20.a()
            u4.p r5 = u4.p.q(r5, r10)
            r10 = r56
            r1.<init>(r2, r10, r5, r8)
            r2 = 0
            r6.a(r1, r2)
            r1 = 1
            r6.j(r12, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r53)
            r6.i(r0, r1)
            u4.v r69 = new u4.v
            w4.c r1 = r11.f4312b
            u4.r r70 = u4.s.k(r1)
            u4.t r1 = r6.f4263h
            u4.o r0 = r0.a()
            u4.p r72 = u4.p.p(r0)
            w4.b r0 = r6.f4265j
            v4.d0 r2 = r11.f4313c
            r73 = r0
            r71 = r1
            r74 = r2
            r69.<init>(r70, r71, r72, r73, r74)
            r0 = r69
            r2 = 0
            r6.a(r0, r2)
            r0 = r59
            r1 = 1
            r6.j(r0, r1)
            u4.v r23 = new u4.v
            r5 = r36
            w4.c r11 = r5.f4312b
            u4.r r24 = u4.s.e(r11)
            u4.t r11 = r6.f4263h
            u4.o r20 = r52.a()
            u4.p r26 = u4.p.p(r20)
            w4.b r1 = r6.f4265j
            r27 = r1
            r25 = r11
            r23.<init>(r24, r25, r26, r27, r28)
            r1 = r23
            r6.a(r1, r2)
            r1 = r54
            r11 = 1
            r6.j(r1, r11)
            r6.i(r3, r2)
            g4.g r2 = new g4.g
            r2.<init>()
            r6.b(r2)
            g4.j r11 = r3.f4291b
            w4.c r11 = r11.f4312b
            w4.c r5 = r5.f4312b
            w4.b r5 = w4.b.q(r11, r5)
            u4.r r11 = u4.s.f13488t
            u4.r r1 = u4.s.f13512z
            r23 = r3
            u4.r r3 = u4.s.B
            r24 = r4
            u4.r r4 = u4.s.H
            u4.r r1 = u4.s.n(r5, r11, r1, r3, r4)
            u4.m r3 = new u4.m
            u4.o r4 = r23.a()
            u4.o r5 = r54.a()
            u4.p r4 = u4.p.q(r4, r5)
            r5 = 0
            r3.<init>(r1, r10, r5, r4)
            r6.a(r3, r2)
            r1 = 0
        L3da:
            r3 = r53
            if (r1 >= r3) goto L469
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r5 = r57
            r6.i(r5, r4)
            r4 = r30[r1]
            g4.h r4 = r6.e(r1, r4)
            java.util.HashMap r11 = y4.c.f22294h
            r23 = r1
            g4.j r1 = r4.f4291b
            java.lang.Object r1 = r11.get(r1)
            g4.i r1 = (g4.i) r1
            if (r1 != 0) goto L3ff
            r53 = r3
            r1 = r6
            goto L42a
        L3ff:
            g4.h[] r41 = new g4.h[]{r4}
            r4 = 1
            java.lang.String r11 = r1.a(r4)
            w4.a r4 = w4.a.d(r11)
            u4.r r11 = new u4.r
            w4.b r4 = r4.c()
            r38 = r1
            w4.b r1 = w4.b.f14854p
            r53 = r3
            r3 = 49
            r11.<init>(r3, r4, r1)
            r40 = 0
            r36 = r6
            r37 = r11
            r36.g(r37, r38, r39, r40, r41)
            r1 = r36
            r4 = r39
        L42a:
            u4.u r3 = new u4.u
            g4.j r6 = r4.f4291b
            w4.c r6 = r6.f4312b
            u4.r r6 = u4.s.b(r6)
            u4.o r4 = r4.a()
            u4.o r11 = r0.a()
            r57 = r5
            u4.o r5 = r57.a()
            r25 = r9
            u4.p r9 = new u4.p
            r26 = r13
            r13 = 3
            r9.<init>(r13)
            r13 = 0
            r9.m(r13, r4)
            r4 = 1
            r9.m(r4, r11)
            r11 = 2
            r9.m(r11, r5)
            r3.<init>(r6, r10, r9, r8)
            r5 = 0
            r1.a(r3, r5)
            int r3 = r23 + 1
            r6 = r1
            r1 = r3
            r9 = r25
            r13 = r26
            goto L3da
        L469:
            r1 = r6
            r25 = r9
            r26 = r13
            r3 = r52
            r4 = 1
            r11 = 2
            g4.h[] r41 = new g4.h[]{r3, r12, r0}
            r0 = r51
            java.lang.String r5 = r0.a(r4)
            w4.a r4 = w4.a.d(r5)
            u4.r r5 = new u4.r
            w4.b r4 = r4.c()
            w4.b r6 = w4.b.f14854p
            r8 = 53
            r5.<init>(r8, r4, r6)
            r38 = r0
            r36 = r1
            r37 = r5
            r40 = r54
            r39 = r55
            r36.g(r37, r38, r39, r40, r41)
            r4 = r39
            java.util.HashMap r5 = y4.c.f22295i
            boolean r8 = r5.containsKey(r15)
            java.lang.Class r9 = java.lang.Void.TYPE
            if (r8 == 0) goto L4dd
            r8 = r63
            r1.c(r8, r4)
            java.lang.Object r4 = r5.get(r15)
            g4.i r4 = (g4.i) r4
            r13 = 0
            g4.h[] r5 = new g4.h[r13]
            r12 = 1
            java.lang.String r13 = r4.a(r12)
            w4.a r12 = w4.a.d(r13)
            u4.r r13 = new u4.r
            r11 = 50
            w4.b r12 = r12.c()
            r13.<init>(r11, r12, r6)
            r36 = r1
            r38 = r4
            r41 = r5
            r40 = r8
            r37 = r13
            r39 = r60
            r36.g(r37, r38, r39, r40, r41)
            r5 = r39
            r1.l(r5)
            goto L4ef
        L4dd:
            r5 = r60
            boolean r6 = r9.equals(r15)
            if (r6 == 0) goto L4e9
            r1.m()
            goto L4ef
        L4e9:
            r1.c(r5, r4)
            r1.l(r5)
        L4ef:
            r1.b(r2)
            boolean r4 = r2.f4285c
            if (r4 != 0) goto L5cb
            r4 = 1
            r2.f4285c = r4
            g4.g r4 = r1.f4258c
            if (r4 == 0) goto L50d
            r1.b(r2)
            u4.m r4 = new u4.m
            u4.r r5 = u4.s.f13484s
            u4.p r6 = u4.p.f13403i
            r8 = 0
            r4.<init>(r5, r10, r8, r6)
            r1.a(r4, r2)
        L50d:
            r1.f4258c = r2
            int r2 = r48.getModifiers()
            r2 = r2 & 1024(0x400, float:1.435E-42)
            if (r2 != 0) goto L53f
            r2 = 0
        L518:
            int r4 = r7.length
            if (r2 >= r4) goto L526
            r4 = r30[r2]
            g4.h r4 = r1.e(r2, r4)
            r7[r2] = r4
            int r2 = r2 + 1
            goto L518
        L526:
            boolean r2 = r9.equals(r15)
            if (r2 == 0) goto L536
            r2 = 0
            r1.h(r14, r2, r3, r7)
            r1.m()
        L533:
            r2 = r48
            goto L548
        L536:
            r2 = r26
            r1.h(r14, r2, r3, r7)
            r1.l(r2)
            goto L533
        L53f:
            r4 = r24
            r3 = r25
            r2 = r48
            f(r1, r2, r4, r3)
        L548:
            java.lang.String r1 = e(r2)
            r4 = r30
            r3 = r50
            r5 = r68
            g4.i r1 = r3.b(r5, r1, r4)
            r6 = r49
            g4.b r1 = r6.o(r1)
            int r7 = r2.getModifiers()
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 != 0) goto L59d
            g4.h r2 = r1.f4260e
            if (r2 == 0) goto L598
            g4.b.d(r2, r3)
            r7 = r67
            int r7 = r7.length
            g4.h[] r8 = new g4.h[r7]
            r10 = 0
        L571:
            if (r10 >= r7) goto L57e
            r11 = r4[r10]
            g4.h r11 = r1.e(r10, r11)
            r8[r10] = r11
            int r10 = r10 + 1
            goto L571
        L57e:
            boolean r4 = r9.equals(r15)
            if (r4 == 0) goto L58c
            r4 = 0
            r1.h(r14, r4, r2, r8)
            r1.m()
            goto L5ad
        L58c:
            r4 = 0
            g4.h r5 = r1.k(r5)
            r1.h(r14, r5, r2, r8)
            r1.l(r5)
            goto L5ad
        L598:
            r4 = 0
            j8.o.A(r18)
            return r4
        L59d:
            r4 = 0
            g4.j r5 = g4.j.f4309n
            g4.h r5 = r1.k(r5)
            r7 = r66
            g4.h r7 = r1.k(r7)
            f(r1, r2, r5, r7)
        L5ad:
            int r13 = r43 + 1
            r1 = r75
            r8 = r3
            r20 = r4
            r5 = r6
            r9 = r42
            r2 = r44
            r10 = r45
            r15 = r46
            r6 = r47
            r11 = r58
            r12 = r61
            r3 = r62
            r4 = r64
            r7 = r65
            goto L207
        L5cb:
            r4 = 0
            java.lang.String r0 = "already marked"
            j8.o.A(r0)
            return r4
        L5d2:
            r4 = r20
            j8.o.A(r18)
            return r4
        L5d8:
            r44 = r2
            r47 = r6
            r65 = r7
            r3 = r8
            r45 = r10
            r46 = r15
            r6 = r5
            java.lang.String r0 = ".generated"
            r1 = r47
            java.lang.String r0 = r1.concat(r0)
            int r2 = r19.size()
            g4.j[] r2 = new g4.j[r2]
            java.util.Iterator r4 = r19.iterator()
            r5 = 0
        L5f7:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L60d
            java.lang.Object r7 = r4.next()
            java.lang.Class r7 = (java.lang.Class) r7
            int r8 = r5 + 1
            g4.j r7 = g4.j.a(r7)
            r2[r5] = r7
            r5 = r8
            goto L5f7
        L60d:
            g4.e r4 = r6.u(r3)
            boolean r5 = r4.f4272b
            if (r5 != 0) goto La1f
            r11 = 1
            r4.f4272b = r11
            r4.f4273c = r11
            r3 = r65
            r4.f4274d = r3
            r4.f4275e = r0
            g4.k r0 = new g4.k
            r0.<init>(r2)
            r4.f4276f = r0
            r2 = r75
            java.lang.ClassLoader r0 = r2.f22297b
            java.io.File r3 = r2.f22298c
            java.lang.Object r4 = r6.f332h
            java.util.LinkedHashMap r4 = (java.util.LinkedHashMap) r4
            if (r3 != 0) goto L66d
            java.lang.String r3 = "dexmaker.dexcache"
            java.lang.String r3 = java.lang.System.getProperty(r3)
            if (r3 == 0) goto L642
            java.io.File r5 = new java.io.File
            r5.<init>(r3)
            r3 = r5
            goto L66d
        L642:
            java.lang.Class<g4.a> r3 = g4.a.class
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Throwable -> L661
            java.lang.String r5 = "dalvik.system.PathClassLoader"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Throwable -> L661
            r5.cast(r3)     // Catch: java.lang.Throwable -> L661
            java.lang.String r3 = g4.a.u(r3, r5)     // Catch: java.lang.Throwable -> L661
            java.io.File[] r3 = g4.a.v(r3)     // Catch: java.lang.Throwable -> L661
            int r5 = r3.length     // Catch: java.lang.Throwable -> L661
            if (r5 <= 0) goto L661
            r17 = 0
            r3 = r3[r17]     // Catch: java.lang.Throwable -> L661
            goto L662
        L661:
            r3 = 0
        L662:
            if (r3 == 0) goto L665
            goto L66d
        L665:
            java.lang.String r0 = "dexcache == null (and no default could be found; consider setting the 'dexmaker.dexcache' system property)"
            j8.o.t(r0)
            r20 = 0
            return r20
        L66d:
            java.io.File r5 = new java.io.File
            java.util.Set r7 = r4.keySet()
            java.util.Iterator r8 = r7.iterator()
            int r7 = r7.size()
            int[] r9 = new int[r7]
            r10 = 0
        L67e:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L6b6
            java.lang.Object r11 = r8.next()
            g4.j r11 = (g4.j) r11
            g4.e r11 = r6.u(r11)
            java.util.LinkedHashMap r12 = r11.f4279i
            java.util.Set r12 = r12.keySet()
            g4.j r13 = r11.f4274d
            if (r13 == 0) goto L67e
            java.lang.String r13 = r13.f4311a
            int r13 = r13.hashCode()
            int r13 = r13 * 31
            g4.k r11 = r11.f4276f
            g4.j[] r11 = r11.f4314a
            int r11 = java.util.Arrays.hashCode(r11)
            int r11 = r11 + r13
            int r13 = r10 + 1
            int r11 = r11 * 31
            int r12 = r12.hashCode()
            int r12 = r12 + r11
            r9[r10] = r12
            r10 = r13
            goto L67e
        L6b6:
            java.util.Arrays.sort(r9)
            r8 = 0
            r10 = 1
        L6bb:
            if (r8 >= r7) goto L6c5
            r11 = r9[r8]
            int r10 = r10 * 31
            int r10 = r10 + r11
            int r8 = r8 + 1
            goto L6bb
        L6c5:
            java.lang.String r7 = "Generated_"
            java.lang.String r8 = ".jar"
            java.lang.String r7 = eh.a.m(r10, r7, r8)
            r5.<init>(r3, r7)
            boolean r7 = r5.exists()
            if (r7 == 0) goto L6e5
            boolean r7 = r5.canWrite()
            if (r7 != 0) goto L6e2
            java.lang.ClassLoader r0 = r6.t(r5, r3, r0)
            goto L9cb
        L6e2:
            r5.delete()
        L6e5:
            java.lang.Object r7 = r6.f333i
            r4.p r7 = (r4.p) r7
            if (r7 != 0) goto L6f7
            n4.a r7 = new n4.a
            r7.<init>()
            r4.p r8 = new r4.p
            r8.<init>(r7)
            r6.f333i = r8
        L6f7:
            java.util.Collection r4 = r4.values()
            java.util.Iterator r4 = r4.iterator()
        L6ff:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L983
            java.lang.Object r7 = r4.next()
            g4.e r7 = (g4.e) r7
            java.lang.Object r8 = r6.f333i
            r4.p r8 = (r4.p) r8
            java.util.LinkedHashMap r9 = r7.f4279i
            java.util.LinkedHashMap r10 = r7.f4278h
            g4.j r11 = r7.f4271a
            boolean r12 = r7.f4272b
            if (r12 == 0) goto L955
            n4.a r12 = new n4.a
            r12.<init>()
            v4.d0 r11 = r11.f4313c
            r4.k r13 = r7.f4277g
            if (r13 != 0) goto L93c
            r4.k r23 = new r4.k
            int r13 = r7.f4273c
            g4.j r14 = r7.f4274d
            v4.d0 r14 = r14.f4313c
            g4.k r15 = r7.f4276f
            w4.b r15 = r15.f4315b
            v4.c0 r2 = new v4.c0
            r16 = r4
            java.lang.String r4 = r7.f4275e
            r2.<init>(r4)
            r28 = r2
            r24 = r11
            r25 = r13
            r26 = r14
            r27 = r15
            r23.<init>(r24, r25, r26, r27, r28)
            r2 = r23
            r7.f4277g = r2
            java.util.Collection r2 = r9.values()
            java.util.Iterator r2 = r2.iterator()
        L752:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L901
            java.lang.Object r4 = r2.next()
            g4.d r4 = (g4.d) r4
            g4.i r9 = r4.f4268a
            v4.y r9 = r9.f4298e
            int r11 = r4.f4269b
            g4.b r4 = r4.f4270c
            r13 = r11 & 1024(0x400, float:1.435E-42)
            if (r13 != 0) goto L76e
            r13 = r11 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L77a
        L76e:
            r25 = r0
            r47 = r1
            r18 = r2
            r24 = r3
            r23 = r10
            goto L8d6
        L77a:
            f1.h r13 = new f1.h
            java.util.ArrayList r14 = r4.f4257b
            boolean r15 = r4.f4259d
            if (r15 != 0) goto L785
            r4.f()
        L785:
            java.util.Iterator r15 = r14.iterator()
            r18 = r2
            r2 = 0
        L78c:
            boolean r19 = r15.hasNext()
            if (r19 == 0) goto L819
            java.lang.Object r19 = r15.next()
            r23 = r10
            r10 = r19
            g4.g r10 = (g4.g) r10
            r19 = r15
            java.util.ArrayList r15 = r10.f4283a
            boolean r15 = r15.isEmpty()
            if (r15 == 0) goto L7ae
            r19.remove()
            r25 = r0
            r47 = r1
            goto L80f
        L7ae:
            r47 = r1
            r15 = 0
        L7b1:
            java.util.List r1 = r10.f4286d
            int r1 = r1.size()
            if (r15 >= r1) goto L7e2
        L7b9:
            java.util.List r1 = r10.f4286d
            java.lang.Object r1 = r1.get(r15)
            g4.g r1 = (g4.g) r1
            java.util.ArrayList r1 = r1.f4283a
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L7dd
            java.util.List r1 = r10.f4286d
            java.lang.Object r24 = r1.get(r15)
            r25 = r0
            r0 = r24
            g4.g r0 = (g4.g) r0
            g4.g r0 = r0.f4287e
            r1.set(r15, r0)
            r0 = r25
            goto L7b9
        L7dd:
            r25 = r0
            int r15 = r15 + 1
            goto L7b1
        L7e2:
            r25 = r0
        L7e4:
            g4.g r0 = r10.f4287e
            if (r0 == 0) goto L7f7
            java.util.ArrayList r0 = r0.f4283a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L7f7
            g4.g r0 = r10.f4287e
            g4.g r0 = r0.f4287e
            r10.f4287e = r0
            goto L7e4
        L7f7:
            g4.g r0 = r10.f4288f
            if (r0 == 0) goto L80a
            java.util.ArrayList r0 = r0.f4283a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L80a
            g4.g r0 = r10.f4288f
            g4.g r0 = r0.f4287e
            r10.f4288f = r0
            goto L7f7
        L80a:
            int r0 = r2 + 1
            r10.f4289g = r2
            r2 = r0
        L80f:
            r15 = r19
            r10 = r23
            r0 = r25
            r1 = r47
            goto L78c
        L819:
            r25 = r0
            r47 = r1
            r23 = r10
            u4.c r0 = new u4.c
            int r1 = r14.size()
            r0.<init>(r1)
            r1 = 0
        L829:
            int r2 = r14.size()
            if (r1 >= r2) goto L8a6
            java.lang.Object r2 = r14.get(r1)
            g4.g r2 = (g4.g) r2
            h4.u r10 = new h4.u
            java.util.ArrayList r15 = r2.f4283a
            r19 = r14
            int r14 = r15.size()
            r10.<init>(r14)
            r24 = r3
            r14 = 0
        L845:
            int r3 = r15.size()
            if (r14 >= r3) goto L857
            java.lang.Object r3 = r15.get(r14)
            u4.i r3 = (u4.i) r3
            r10.m(r14, r3)
            int r14 = r14 + 1
            goto L845
        L857:
            r3 = 0
            r10.f22555g = r3
            z4.g r3 = new z4.g
            r14 = 4
            r3.<init>(r14)
            java.util.List r15 = r2.f4286d
            java.util.Iterator r15 = r15.iterator()
        L866:
            boolean r21 = r15.hasNext()
            if (r21 == 0) goto L87b
            java.lang.Object r21 = r15.next()
            r14 = r21
            g4.g r14 = (g4.g) r14
            int r14 = r14.f4289g
            r3.l(r14)
            r14 = 4
            goto L866
        L87b:
            g4.g r14 = r2.f4287e
            if (r14 == 0) goto L885
            int r14 = r14.f4289g
            r3.l(r14)
            goto L886
        L885:
            r14 = -1
        L886:
            g4.g r15 = r2.f4288f
            if (r15 == 0) goto L88f
            int r15 = r15.f4289g
            r3.l(r15)
        L88f:
            r15 = 0
            r3.f22555g = r15
            u4.b r15 = new u4.b
            int r2 = r2.f4289g
            r15.<init>(r2, r10, r3, r14)
            r0.q(r1, r15)
            r2 = -1
            r0.f13369j = r2
            int r1 = r1 + 1
            r14 = r19
            r3 = r24
            goto L829
        L8a6:
            r24 = r3
            r15 = 0
            r13.<init>(r0, r15)
            java.util.ArrayList r0 = r4.f4261f
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L8b3:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L8c9
            java.lang.Object r2 = r0.next()
            g4.h r2 = (g4.h) r2
            g4.j r2 = r2.f4291b
            w4.c r2 = r2.f4312b
            int r2 = r2.i()
            int r1 = r1 + r2
            goto L8b3
        L8c9:
            r4 = 1
            i4.a r0 = p4.y.b(r13, r4, r1, r12)
            r4.t r1 = new r4.t
            w4.b r2 = w4.b.f14847i
            r1.<init>(r9, r11, r0, r2)
            goto L8de
        L8d6:
            r4.t r1 = new r4.t
            w4.b r0 = w4.b.f14847i
            r2 = 0
            r1.<init>(r9, r11, r2, r0)
        L8de:
            r0 = 65546(0x1000a, float:9.185E-41)
            r0 = r0 & r11
            r4.k r2 = r7.f4277g
            if (r0 == 0) goto L8ee
            r4.j r0 = r2.f11429m
            java.util.ArrayList r0 = r0.f11419o
            r0.add(r1)
            goto L8f5
        L8ee:
            r4.j r0 = r2.f11429m
            java.util.ArrayList r0 = r0.f11420p
            r0.add(r1)
        L8f5:
            r2 = r18
            r10 = r23
            r3 = r24
            r0 = r25
            r1 = r47
            goto L752
        L901:
            r25 = r0
            r47 = r1
            r24 = r3
            r23 = r10
            java.util.Collection r0 = r23.values()
            java.util.Iterator r0 = r0.iterator()
        L911:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L944
            java.lang.Object r1 = r0.next()
            g4.c r1 = (g4.c) r1
            r4.r r2 = new r4.r
            g4.f r3 = r1.f4266a
            int r1 = r1.f4267b
            v4.m r3 = r3.f4282c
            r2.<init>(r3, r1)
            r1 = r1 & 8
            r4.k r3 = r7.f4277g
            if (r1 == 0) goto L934
            v4.r r1 = v4.r.f14120g
            r3.i(r2, r1)
            goto L911
        L934:
            r4.j r1 = r3.f11429m
            java.util.ArrayList r1 = r1.f11418n
            r1.add(r2)
            goto L911
        L93c:
            r25 = r0
            r47 = r1
            r24 = r3
            r16 = r4
        L944:
            r4.k r0 = r7.f4277g
            r8.a(r0)
            r2 = r75
            r4 = r16
            r3 = r24
            r0 = r25
            r1 = r47
            goto L6ff
        L955:
            r23 = r10
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Undeclared type "
            r1.<init>(r2)
            r1.append(r11)
            java.lang.String r2 = " declares members: "
            r1.append(r2)
            java.util.Set r2 = r23.keySet()
            r1.append(r2)
            java.util.Set r2 = r9.keySet()
            java.lang.String r3 = " "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L983:
            r25 = r0
            r47 = r1
            r24 = r3
            java.lang.Object r0 = r6.f333i     // Catch: java.io.IOException -> La18
            r4.p r0 = (r4.p) r0     // Catch: java.io.IOException -> La18
            r0.getClass()     // Catch: java.io.IOException -> La18
            r15 = 0
            z4.d r0 = r0.c(r15, r15)     // Catch: java.io.IOException -> La18
            byte[] r0 = r0.f22537b     // Catch: java.io.IOException -> La18
            java.util.jar.JarOutputStream r1 = new java.util.jar.JarOutputStream
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream
            java.io.FileOutputStream r3 = new java.io.FileOutputStream
            r3.<init>(r5)
            r2.<init>(r3)
            r1.<init>(r2)
            r5.setReadOnly()
            java.util.jar.JarEntry r2 = new java.util.jar.JarEntry     // Catch: java.lang.Throwable -> La0d
            java.lang.String r3 = "classes.dex"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> La0d
            int r3 = r0.length     // Catch: java.lang.Throwable -> La0d
            long r3 = (long) r3     // Catch: java.lang.Throwable -> La0d
            r2.setSize(r3)     // Catch: java.lang.Throwable -> La0d
            r1.putNextEntry(r2)     // Catch: java.lang.Throwable -> La0d
            r1.write(r0)     // Catch: java.lang.Throwable -> La0f
            r1.closeEntry()     // Catch: java.lang.Throwable -> La0d
            r1.close()
            r3 = r24
            r0 = r25
            java.lang.ClassLoader r0 = r6.t(r5, r3, r0)
            r1 = r47
        L9cb:
            java.lang.Class r0 = r0.loadClass(r1)     // Catch: java.lang.ClassNotFoundException -> L9f7 java.lang.IllegalAccessError -> L9fe
            r1 = r46
            java.lang.reflect.Field r1 = r0.getDeclaredField(r1)     // Catch: java.lang.IllegalAccessException -> L9e7 java.lang.NoSuchFieldException -> L9e9
            r4 = 1
            r1.setAccessible(r4)     // Catch: java.lang.IllegalAccessException -> L9e7 java.lang.NoSuchFieldException -> L9e9
            r2 = r45
            r5 = 0
            r1.set(r5, r2)     // Catch: java.lang.IllegalAccessException -> L9e7 java.lang.NoSuchFieldException -> L9e9
            r2 = r29
            r1 = r44
            r2.put(r1, r0)
            return r0
        L9e7:
            r0 = move-exception
            goto L9ed
        L9e9:
            r0 = move-exception
            r20 = 0
            goto L9f3
        L9ed:
            j8.o.f(r0)
            r20 = 0
            return r20
        L9f3:
            j8.o.f(r0)
            return r20
        L9f7:
            r0 = move-exception
            r20 = 0
            j8.o.f(r0)
            return r20
        L9fe:
            r0 = move-exception
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "cannot proxy inaccessible class "
            r3 = r22
            java.lang.String r2 = p.a.k(r3, r2)
            r1.<init>(r2, r0)
            throw r1
        La0d:
            r0 = move-exception
            goto La14
        La0f:
            r0 = move-exception
            r1.closeEntry()     // Catch: java.lang.Throwable -> La0d
            throw r0     // Catch: java.lang.Throwable -> La0d
        La14:
            r1.close()
            throw r0
        La18:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        La1f:
            java.lang.String r0 = "already declared: "
            g1.d.g(r3, r0)
            r20 = 0
            return r20
    }
}
