package a;

/* JADX INFO: loaded from: classes.dex */
public final class D8 implements top.mmjz.floatingclouds.plugin.IPlugin {
    public static java.lang.String a(java.lang.Object r7) {
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1 = 0
            java.lang.Class r2 = r7.getClass()     // Catch: java.lang.Throwable -> L18
            java.lang.reflect.Method r2 = c(r2)     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L26
            java.lang.Object r2 = r2.invoke(r7, r1)     // Catch: java.lang.Throwable -> L18
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.lang.Throwable -> L18
            if (r3 == 0) goto L1b
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L18
            goto L1c
        L18:
            r2 = move-exception
            goto L8f
        L1b:
            r2 = r1
        L1c:
            if (r2 == 0) goto L26
            boolean r3 = a.Be.P(r2)     // Catch: java.lang.Throwable -> L18
            if (r3 == 0) goto L25
            goto L26
        L25:
            return r2
        L26:
            java.lang.Class r2 = r7.getClass()     // Catch: java.lang.Throwable -> L18
            java.lang.reflect.Method[] r2 = r2.getMethods()     // Catch: java.lang.Throwable -> L18
            a.G1 r2 = a.C0435w1.I(r2)     // Catch: java.lang.Throwable -> L18
        L32:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L18
            if (r3 == 0) goto L8c
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L18
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3     // Catch: java.lang.Throwable -> L18
            java.lang.Class[] r4 = r3.getParameterTypes()     // Catch: java.lang.Throwable -> L18
            java.lang.String r5 = "getParameterTypes(...)"
            a.C0193i9.d(r4, r5)     // Catch: java.lang.Throwable -> L18
            int r4 = r4.length     // Catch: java.lang.Throwable -> L18
            if (r4 != 0) goto L32
            java.lang.Class r4 = r3.getReturnType()     // Catch: java.lang.Throwable -> L18
            boolean r4 = a.C0193i9.a(r4, r0)     // Catch: java.lang.Throwable -> L18
            if (r4 == 0) goto L32
            java.lang.String r4 = r3.getName()     // Catch: java.lang.Throwable -> L18
            java.lang.String r5 = "toString"
            boolean r4 = a.C0193i9.a(r4, r5)     // Catch: java.lang.Throwable -> L18
            if (r4 != 0) goto L32
            java.lang.String r4 = r3.getName()     // Catch: java.lang.Throwable -> L18
            java.lang.String r5 = "getClass"
            boolean r4 = a.C0193i9.a(r4, r5)     // Catch: java.lang.Throwable -> L18
            if (r4 == 0) goto L6d
            goto L32
        L6d:
            java.lang.Object r3 = r3.invoke(r7, r1)     // Catch: java.lang.Throwable -> L78
            boolean r4 = r3 instanceof java.lang.String     // Catch: java.lang.Throwable -> L78
            if (r4 == 0) goto L7a
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L78
            goto L7b
        L78:
            r3 = move-exception
            goto L88
        L7a:
            r3 = r1
        L7b:
            if (r3 != 0) goto L7e
            goto L85
        L7e:
            boolean r4 = a.yh.a(r3)     // Catch: java.lang.Throwable -> L78
            if (r4 == 0) goto L85
            return r3
        L85:
            a.Wf r3 = a.Wf.f330a     // Catch: java.lang.Throwable -> L78
            goto L32
        L88:
            a.C0465xd.a(r3)     // Catch: java.lang.Throwable -> L18
            goto L32
        L8c:
            a.Wf r2 = a.Wf.f330a     // Catch: java.lang.Throwable -> L18
            goto L92
        L8f:
            a.C0465xd.a(r2)
        L92:
            r2 = 1
            java.lang.Class r3 = r7.getClass()     // Catch: java.lang.Throwable -> Lec
            java.lang.reflect.Field[] r3 = r3.getDeclaredFields()     // Catch: java.lang.Throwable -> Lec
            a.G1 r3 = a.C0435w1.I(r3)     // Catch: java.lang.Throwable -> Lec
        L9f:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> Lec
            if (r4 == 0) goto Lf9
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> Lec
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4     // Catch: java.lang.Throwable -> Lec
            int r5 = r4.getModifiers()     // Catch: java.lang.Throwable -> Lec
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)     // Catch: java.lang.Throwable -> Lec
            if (r5 != 0) goto L9f
            java.lang.Class r5 = r4.getType()     // Catch: java.lang.Throwable -> Lec
            boolean r5 = r5.isPrimitive()     // Catch: java.lang.Throwable -> Lec
            if (r5 != 0) goto L9f
            java.lang.Class r5 = r4.getType()     // Catch: java.lang.Throwable -> Lec
            boolean r5 = a.C0193i9.a(r5, r0)     // Catch: java.lang.Throwable -> Lec
            if (r5 == 0) goto Lca
            goto L9f
        Lca:
            r4.setAccessible(r2)     // Catch: java.lang.Throwable -> Lec
            java.lang.Object r4 = r4.get(r7)     // Catch: java.lang.Throwable -> Lec
            if (r4 != 0) goto Ld4
            goto L9f
        Ld4:
            java.lang.Class r5 = r4.getClass()     // Catch: java.lang.Throwable -> Lec
            java.lang.reflect.Field r5 = e(r5)     // Catch: java.lang.Throwable -> Lec
            if (r5 == 0) goto L9f
            r5.setAccessible(r2)     // Catch: java.lang.Throwable -> Lec
            java.lang.Object r4 = r5.get(r4)     // Catch: java.lang.Throwable -> Lec
            boolean r5 = r4 instanceof java.lang.String     // Catch: java.lang.Throwable -> Lec
            if (r5 == 0) goto Lee
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> Lec
            goto Lef
        Lec:
            r3 = move-exception
            goto Lfc
        Lee:
            r4 = r1
        Lef:
            if (r4 == 0) goto L9f
            boolean r5 = a.Be.P(r4)     // Catch: java.lang.Throwable -> Lec
            if (r5 == 0) goto Lf8
            goto L9f
        Lf8:
            return r4
        Lf9:
            a.Wf r3 = a.Wf.f330a     // Catch: java.lang.Throwable -> Lec
            goto Lff
        Lfc:
            a.C0465xd.a(r3)
        Lff:
            java.lang.Class r3 = r7.getClass()     // Catch: java.lang.Throwable -> L143
        L103:
            if (r3 == 0) goto L155
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            boolean r4 = r3.equals(r4)     // Catch: java.lang.Throwable -> L143
            if (r4 != 0) goto L155
            java.lang.reflect.Field[] r4 = r3.getDeclaredFields()     // Catch: java.lang.Throwable -> L143
            a.G1 r4 = a.C0435w1.I(r4)     // Catch: java.lang.Throwable -> L143
        L115:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L143
            if (r5 == 0) goto L150
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L143
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5     // Catch: java.lang.Throwable -> L143
            int r6 = r5.getModifiers()     // Catch: java.lang.Throwable -> L143
            boolean r6 = java.lang.reflect.Modifier.isStatic(r6)     // Catch: java.lang.Throwable -> L143
            if (r6 != 0) goto L115
            java.lang.Class r6 = r5.getType()     // Catch: java.lang.Throwable -> L143
            boolean r6 = a.C0193i9.a(r6, r0)     // Catch: java.lang.Throwable -> L143
            if (r6 == 0) goto L115
            r5.setAccessible(r2)     // Catch: java.lang.Throwable -> L143
            java.lang.Object r5 = r5.get(r7)     // Catch: java.lang.Throwable -> L143
            boolean r6 = r5 instanceof java.lang.String     // Catch: java.lang.Throwable -> L143
            if (r6 == 0) goto L145
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L143
            goto L146
        L143:
            r7 = move-exception
            goto L157
        L145:
            r5 = r1
        L146:
            if (r5 != 0) goto L149
            goto L115
        L149:
            boolean r6 = a.yh.a(r5)     // Catch: java.lang.Throwable -> L143
            if (r6 == 0) goto L115
            goto L162
        L150:
            java.lang.Class r3 = r3.getSuperclass()     // Catch: java.lang.Throwable -> L143
            goto L103
        L155:
            r7 = r1
            goto L15b
        L157:
            a.wd$a r7 = a.C0465xd.a(r7)
        L15b:
            if (r7 == 0) goto L15e
            goto L15f
        L15e:
            r1 = r7
        L15f:
            r5 = r1
            java.lang.String r5 = (java.lang.String) r5
        L162:
            return r5
    }

    public static int b(java.util.ArrayList r8, java.util.HashSet r9) {
            java.util.Iterator r8 = r8.iterator()
            java.lang.String r0 = "iterator(...)"
            a.C0193i9.d(r8, r0)
            r0 = 0
        La:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto La8
            java.lang.Object r1 = r8.next()
            if (r1 != 0) goto L17
            goto La
        L17:
            r2 = 0
            java.lang.Class r3 = r1.getClass()     // Catch: java.lang.Throwable -> L5f
        L1c:
            if (r3 == 0) goto L8c
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            boolean r4 = r3.equals(r4)     // Catch: java.lang.Throwable -> L5f
            if (r4 != 0) goto L8c
            java.lang.reflect.Field[] r4 = r3.getDeclaredFields()     // Catch: java.lang.Throwable -> L5f
            a.G1 r4 = a.C0435w1.I(r4)     // Catch: java.lang.Throwable -> L5f
        L2e:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L5f
            if (r5 == 0) goto L87
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L5f
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5     // Catch: java.lang.Throwable -> L5f
            int r6 = r5.getModifiers()     // Catch: java.lang.Throwable -> L5f
            boolean r6 = java.lang.reflect.Modifier.isStatic(r6)     // Catch: java.lang.Throwable -> L5f
            if (r6 != 0) goto L2e
            java.lang.Class<java.util.Collection> r6 = java.util.Collection.class
            java.lang.Class r7 = r5.getType()     // Catch: java.lang.Throwable -> L5f
            boolean r6 = r6.isAssignableFrom(r7)     // Catch: java.lang.Throwable -> L5f
            if (r6 == 0) goto L2e
            r6 = 1
            r5.setAccessible(r6)     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r5 = r5.get(r1)     // Catch: java.lang.Throwable -> L5f
            boolean r6 = r5 instanceof java.util.Collection     // Catch: java.lang.Throwable -> L5f
            if (r6 == 0) goto L61
            java.util.Collection r5 = (java.util.Collection) r5     // Catch: java.lang.Throwable -> L5f
            goto L62
        L5f:
            r1 = move-exception
            goto L8e
        L61:
            r5 = r2
        L62:
            if (r5 != 0) goto L65
            goto L2e
        L65:
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L5f
        L69:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L5f
            if (r6 == 0) goto L76
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L5f
            if (r6 == 0) goto L69
            goto L77
        L76:
            r6 = r2
        L77:
            if (r6 != 0) goto L7a
            goto L2e
        L7a:
            java.lang.String r5 = a(r6)     // Catch: java.lang.Throwable -> L5f
            if (r5 == 0) goto L2e
            boolean r6 = a.Be.P(r5)     // Catch: java.lang.Throwable -> L5f
            if (r6 == 0) goto L99
            goto L2e
        L87:
            java.lang.Class r3 = r3.getSuperclass()     // Catch: java.lang.Throwable -> L5f
            goto L1c
        L8c:
            r1 = r2
            goto L92
        L8e:
            a.wd$a r1 = a.C0465xd.a(r1)
        L92:
            if (r1 == 0) goto L95
            goto L96
        L95:
            r2 = r1
        L96:
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
        L99:
            if (r5 == 0) goto La
            boolean r1 = r9.contains(r5)
            if (r1 == 0) goto La
            r8.remove()
            int r0 = r0 + 1
            goto La
        La8:
            return r0
    }

    public static java.lang.reflect.Method c(java.lang.Class r7) {
            java.lang.String r0 = "o"
            r1 = 0
            java.lang.reflect.Method[] r7 = r7.getMethods()     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "getMethods(...)"
            a.C0193i9.d(r7, r2)     // Catch: java.lang.Throwable -> L35
            int r2 = r7.length     // Catch: java.lang.Throwable -> L35
            r3 = 0
        Le:
            if (r3 >= r2) goto L3a
            r4 = r7[r3]     // Catch: java.lang.Throwable -> L35
            java.lang.String r5 = r4.getName()     // Catch: java.lang.Throwable -> L35
            boolean r5 = a.C0193i9.a(r5, r0)     // Catch: java.lang.Throwable -> L35
            if (r5 == 0) goto L37
            java.lang.Class r5 = r4.getReturnType()     // Catch: java.lang.Throwable -> L35
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            boolean r5 = a.C0193i9.a(r5, r6)     // Catch: java.lang.Throwable -> L35
            if (r5 == 0) goto L37
            java.lang.Class[] r5 = r4.getParameterTypes()     // Catch: java.lang.Throwable -> L35
            java.lang.String r6 = "getParameterTypes(...)"
            a.C0193i9.d(r5, r6)     // Catch: java.lang.Throwable -> L35
            int r5 = r5.length     // Catch: java.lang.Throwable -> L35
            if (r5 != 0) goto L37
            goto L40
        L35:
            r7 = move-exception
            goto L3c
        L37:
            int r3 = r3 + 1
            goto Le
        L3a:
            r4 = r1
            goto L40
        L3c:
            a.wd$a r4 = a.C0465xd.a(r7)
        L40:
            boolean r7 = r4 instanceof a.C0447wd.a
            if (r7 == 0) goto L45
            goto L46
        L45:
            r1 = r4
        L46:
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            return r1
    }

    public static java.lang.reflect.Method d(java.lang.Class r12) {
            r0 = r12
        L1:
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            r2 = 2
            java.lang.String r3 = "getDeclaredMethods(...)"
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            r5 = 0
            r6 = 0
            if (r0 == 0) goto L5a
            boolean r7 = r0.equals(r4)
            if (r7 != 0) goto L5a
            java.lang.reflect.Method[] r4 = r0.getDeclaredMethods()
            a.C0193i9.d(r4, r3)
            int r3 = r4.length
            r7 = r6
        L1b:
            if (r7 >= r3) goto L52
            r8 = r4[r7]
            java.lang.Class r9 = r8.getReturnType()
            java.lang.Class<java.util.ArrayList> r10 = java.util.ArrayList.class
            boolean r9 = r10.isAssignableFrom(r9)
            if (r9 == 0) goto L4f
            java.lang.Class[] r9 = r8.getParameterTypes()
            int r9 = r9.length
            if (r9 != r2) goto L4f
            java.lang.Class[] r9 = r8.getParameterTypes()
            r9 = r9[r6]
            boolean r9 = r1.isAssignableFrom(r9)
            if (r9 == 0) goto L4f
            java.lang.Class[] r9 = r8.getParameterTypes()
            r10 = 1
            r9 = r9[r10]
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            boolean r9 = a.C0193i9.a(r9, r10)
            if (r9 == 0) goto L4f
            r5 = r8
            goto L52
        L4f:
            int r7 = r7 + 1
            goto L1b
        L52:
            if (r5 == 0) goto L55
            return r5
        L55:
            java.lang.Class r0 = r0.getSuperclass()
            goto L1
        L5a:
            if (r12 == 0) goto L9b
            boolean r0 = r12.equals(r4)
            if (r0 != 0) goto L9b
            java.lang.reflect.Method[] r0 = r12.getDeclaredMethods()
            a.C0193i9.d(r0, r3)
            int r7 = r0.length
            r8 = r6
        L6b:
            if (r8 >= r7) goto L92
            r9 = r0[r8]
            java.lang.Class r10 = r9.getReturnType()
            java.lang.Class<java.util.List> r11 = java.util.List.class
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto L8f
            java.lang.Class[] r10 = r9.getParameterTypes()
            int r10 = r10.length
            if (r10 != r2) goto L8f
            java.lang.Class[] r10 = r9.getParameterTypes()
            r10 = r10[r6]
            boolean r10 = r1.isAssignableFrom(r10)
            if (r10 == 0) goto L8f
            goto L93
        L8f:
            int r8 = r8 + 1
            goto L6b
        L92:
            r9 = r5
        L93:
            if (r9 == 0) goto L96
            return r9
        L96:
            java.lang.Class r12 = r12.getSuperclass()
            goto L5a
        L9b:
            return r5
    }

    public static java.lang.reflect.Field e(java.lang.Class r5) {
        L0:
            if (r5 == 0) goto L5d
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L5d
            java.lang.reflect.Field[] r0 = r5.getDeclaredFields()
            a.G1 r0 = a.C0435w1.I(r0)
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L58
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            java.lang.Class r2 = r1.getType()
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            boolean r2 = a.C0193i9.a(r2, r3)
            if (r2 == 0) goto L12
            java.lang.String r2 = r1.getName()
            java.lang.String r3 = "getName(...)"
            a.C0193i9.d(r2, r3)
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r3)
            java.lang.String r3 = "toLowerCase(...)"
            a.C0193i9.d(r2, r3)
            java.lang.String r3 = "username"
            r4 = 0
            boolean r3 = a.Be.I(r2, r3, r4)
            if (r3 != 0) goto L57
            java.lang.String r3 = "user_name"
            boolean r3 = a.Be.I(r2, r3, r4)
            if (r3 != 0) goto L57
            java.lang.String r3 = "field_username"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L12
        L57:
            return r1
        L58:
            java.lang.Class r5 = r5.getSuperclass()
            goto L0
        L5d:
            r5 = 0
            return r5
    }

    public static java.util.HashSet f() {
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            java.util.ArrayList r0 = a.K3.a.f()
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = a.C0312p3.g0(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r0.next()
            top.mmjz.floatingclouds.bean.MaskItemBean r2 = (top.mmjz.floatingclouds.bean.MaskItemBean) r2
            java.lang.String r2 = r2.getMaskId()
            r1.add(r2)
            goto L18
        L2c:
            java.util.HashSet r0 = a.C0383t3.u0(r1)
            return r0
    }

    public static boolean i() {
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            boolean r0 = a.K3.a.l()
            if (r0 == 0) goto L15
            a.jc r0 = a.K3.a.i()
            boolean r0 = r0.E
            if (r0 == 0) goto L15
            r0 = 1
            return r0
        L15:
            r0 = 0
            return r0
    }

    public final void g(a.J8 r6, java.lang.reflect.Method r7, java.lang.String r8) {
            r5 = this;
            r0 = 1
            r7.setAccessible(r0)
            a.l4 r1 = new a.l4
            r2 = 4
            r1.<init>(r5, r2, r8)
            java.lang.String r2 = "F024"
            a.J8.h(r6, r2, r7, r1)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, a.F8> r6 = a.E8.f71a
            java.lang.String r6 = "R6_"
            java.lang.String r6 = r6.concat(r8)
            java.lang.Class r1 = r7.getDeclaringClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r3 = r7.getName()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = "."
            r4.append(r1)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            a.E8.b(r2, r6, r3)
            java.lang.Class r6 = r7.getDeclaringClass()
            java.lang.String r6 = r6.getName()
            java.lang.String r7 = r7.getName()
            java.lang.String r2 = "HideTextStatus: hooked "
            java.lang.String r3 = " R6 = "
            java.lang.StringBuilder r6 = a.C0487z.i(r2, r8, r3, r6, r1)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
            a.C0453x1.b(r6)
            return
    }

    public final void h(a.J8 r6, java.lang.String r7, java.lang.String r8) {
            r5 = this;
            java.lang.String r0 = "F024"
            java.lang.String r1 = "HideTextStatus: R6 method not found in "
            java.lang.String r2 = "HideTextStatus: "
            r3 = 1
            java.lang.ClassLoader r4 = r6.f136a     // Catch: java.lang.Throwable -> L34
            java.lang.Class r4 = a.A1.b(r4, r7)     // Catch: java.lang.Throwable -> L34
            if (r4 != 0) goto L36
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L34
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L34
            r6.append(r7)     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = " not found, skip "
            r6.append(r1)     // Catch: java.lang.Throwable -> L34
            r6.append(r8)     // Catch: java.lang.Throwable -> L34
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L34
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L34
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r3)     // Catch: java.lang.Throwable -> L34
            a.C0453x1.e(r6)     // Catch: java.lang.Throwable -> L34
            java.lang.String r6 = "class not found"
            a.E8.a(r0, r8, r7, r6)     // Catch: java.lang.Throwable -> L34
            return
        L34:
            r6 = move-exception
            goto L64
        L36:
            java.lang.reflect.Method r2 = d(r4)     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto L5e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L34
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L34
            r6.append(r7)     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = " (searched hierarchy)"
            r6.append(r1)     // Catch: java.lang.Throwable -> L34
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L34
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L34
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r3)     // Catch: java.lang.Throwable -> L34
            a.C0453x1.e(r6)     // Catch: java.lang.Throwable -> L34
            java.lang.String r6 = "R6 method not found"
            a.E8.a(r0, r8, r7, r6)     // Catch: java.lang.Throwable -> L34
            return
        L5e:
            r5.g(r6, r2, r8)     // Catch: java.lang.Throwable -> L34
            a.Wf r6 = a.Wf.f330a     // Catch: java.lang.Throwable -> L34
            goto L68
        L64:
            a.wd$a r6 = a.C0465xd.a(r6)
        L68:
            java.lang.Throwable r6 = a.C0447wd.a(r6)
            if (r6 == 0) goto La0
            java.lang.String r1 = r6.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "HideTextStatus: hookStatusFeedR6("
            r2.<init>(r4)
            r2.append(r8)
            java.lang.String r4 = ") fail: "
            r2.append(r4)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            a.C0453x1.a(r1)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, a.F8> r1 = a.E8.f71a
            java.lang.String r6 = r6.getMessage()
            if (r6 != 0) goto L9d
            java.lang.String r6 = "unknown"
        L9d:
            a.E8.a(r0, r8, r7, r6)
        La0:
            return
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(a.J8 r15) {
            r14 = this;
            r0 = 0
            r1 = 1
            java.lang.String r2 = "session"
            a.C0193i9.e(r15, r2)
            java.lang.ClassLoader r2 = r15.f136a
            a.fd r3 = new a.fd
            int r4 = a.B1.f21a
            java.lang.String r5 = "com.tencent.mm"
            r6 = -1
            if (r4 != r6) goto L31
            android.content.Context r4 = a.C0435w1.p     // Catch: java.lang.Exception -> L22
            a.C0193i9.b(r4)     // Catch: java.lang.Exception -> L22
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: java.lang.Exception -> L22
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r5, r0)     // Catch: java.lang.Exception -> L22
            int r4 = r4.versionCode     // Catch: java.lang.Exception -> L22
            goto L2f
        L22:
            r4 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            a.C0453x1.a(r4)
            r4 = r6
        L2f:
            a.B1.f21a = r4
        L31:
            int r4 = a.B1.f21a
            r3.<init>(r4, r2)
            a.hd r2 = a.C0179hd.f499a
            r2.getClass()
            java.lang.String r2 = "F024_status_store"
            a.gd r2 = a.C0179hd.a(r2, r3)
            boolean r3 = r2.f485a
            java.lang.String r4 = ": "
            java.lang.String r7 = ")"
            r8 = 0
            if (r3 == 0) goto L7a
            java.lang.Class<?> r3 = r2.b
            if (r3 == 0) goto L7a
            a.cd r9 = r2.d
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "HideTextStatus: statusStore resolved via "
            r10.<init>(r11)
            r10.append(r9)
            r10.append(r4)
            r10.append(r3)
            java.lang.String r3 = r10.toString()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)
            a.C0453x1.b(r3)
            java.lang.Class<?> r2 = r2.b
            java.lang.String r2 = r2.getName()
            goto L94
        L7a:
            a.j6 r2 = r2.c
            if (r2 == 0) goto L81
            java.lang.String r2 = r2.c
            goto L82
        L81:
            r2 = r8
        L82:
            java.lang.String r3 = "HideTextStatus: statusStore resolve FAILED (reason="
            java.lang.String r2 = a.C0487z.g(r3, r2, r7)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r1)
            a.C0453x1.e(r2)
            r2 = r8
        L94:
            java.lang.ClassLoader r3 = r15.f136a
            a.fd r9 = new a.fd
            int r10 = a.B1.f21a
            if (r10 != r6) goto Lba
            android.content.Context r10 = a.C0435w1.p     // Catch: java.lang.Exception -> Lac
            a.C0193i9.b(r10)     // Catch: java.lang.Exception -> Lac
            android.content.pm.PackageManager r10 = r10.getPackageManager()     // Catch: java.lang.Exception -> Lac
            android.content.pm.PackageInfo r5 = r10.getPackageInfo(r5, r0)     // Catch: java.lang.Exception -> Lac
            int r6 = r5.versionCode     // Catch: java.lang.Exception -> Lac
            goto Lb8
        Lac:
            r5 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r1)
            a.C0453x1.a(r5)
        Lb8:
            a.B1.f21a = r6
        Lba:
            int r5 = a.B1.f21a
            r9.<init>(r5, r3)
            a.hd r3 = a.C0179hd.f499a
            r3.getClass()
            java.lang.String r3 = "F024_mvvm_submit_param"
            a.gd r3 = a.C0179hd.a(r3, r9)
            boolean r5 = r3.f485a
            if (r5 == 0) goto Lfe
            java.lang.Class<?> r5 = r3.b
            if (r5 == 0) goto Lfe
            a.cd r6 = r3.d
            java.lang.String r5 = r5.getName()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "HideTextStatus: mvvmSubmitParam resolved via "
            r9.<init>(r10)
            r9.append(r6)
            r9.append(r4)
            r9.append(r5)
            java.lang.String r4 = r9.toString()
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r1)
            a.C0453x1.b(r4)
            java.lang.Class<?> r3 = r3.b
            java.lang.String r3 = r3.getName()
            goto L118
        Lfe:
            a.j6 r3 = r3.c
            if (r3 == 0) goto L105
            java.lang.String r3 = r3.c
            goto L106
        L105:
            r3 = r8
        L106:
            java.lang.String r4 = "HideTextStatus: mvvmSubmitParam resolve FAILED (reason="
            java.lang.String r3 = a.C0487z.g(r4, r3, r7)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r1)
            a.C0453x1.e(r3)
            r3 = r8
        L118:
            java.lang.String r4 = "F024"
            java.lang.String r5 = "getDeclaredMethods(...)"
            if (r2 == 0) goto L203
            java.lang.String r6 = "HideTextStatus: "
            java.lang.ClassLoader r9 = r15.f136a     // Catch: java.lang.Throwable -> L146
            java.lang.Class r9 = a.A1.b(r9, r2)     // Catch: java.lang.Throwable -> L146
            if (r9 != 0) goto L149
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L146
            r9.<init>(r6)     // Catch: java.lang.Throwable -> L146
            r9.append(r2)     // Catch: java.lang.Throwable -> L146
            java.lang.String r6 = " not found"
            r9.append(r6)     // Catch: java.lang.Throwable -> L146
            java.lang.String r6 = r9.toString()     // Catch: java.lang.Throwable -> L146
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L146
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r1)     // Catch: java.lang.Throwable -> L146
            a.C0453x1.e(r6)     // Catch: java.lang.Throwable -> L146
            goto L203
        L146:
            r6 = move-exception
            goto L1e4
        L149:
            java.lang.reflect.Method[] r6 = r9.getDeclaredMethods()     // Catch: java.lang.Throwable -> L146
            a.C0193i9.d(r6, r5)     // Catch: java.lang.Throwable -> L146
            int r9 = r6.length     // Catch: java.lang.Throwable -> L146
            r10 = r0
        L152:
            if (r10 >= r9) goto L17d
            r11 = r6[r10]     // Catch: java.lang.Throwable -> L146
            java.lang.String r12 = r11.getName()     // Catch: java.lang.Throwable -> L146
            java.lang.String r13 = "K"
            boolean r12 = a.C0193i9.a(r12, r13)     // Catch: java.lang.Throwable -> L146
            if (r12 == 0) goto L17b
            java.lang.Class[] r12 = r11.getParameterTypes()     // Catch: java.lang.Throwable -> L146
            java.lang.String r13 = "getParameterTypes(...)"
            a.C0193i9.d(r12, r13)     // Catch: java.lang.Throwable -> L146
            int r12 = r12.length     // Catch: java.lang.Throwable -> L146
            if (r12 != 0) goto L17b
            java.lang.Class<java.util.List> r12 = java.util.List.class
            java.lang.Class r13 = r11.getReturnType()     // Catch: java.lang.Throwable -> L146
            boolean r12 = r12.isAssignableFrom(r13)     // Catch: java.lang.Throwable -> L146
            if (r12 == 0) goto L17b
            goto L17e
        L17b:
            int r10 = r10 + r1
            goto L152
        L17d:
            r11 = r8
        L17e:
            if (r11 != 0) goto L19d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L146
            r6.<init>()     // Catch: java.lang.Throwable -> L146
            java.lang.String r9 = "HideTextStatus: K() method not found in "
            r6.append(r9)     // Catch: java.lang.Throwable -> L146
            r6.append(r2)     // Catch: java.lang.Throwable -> L146
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L146
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L146
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r1)     // Catch: java.lang.Throwable -> L146
            a.C0453x1.e(r6)     // Catch: java.lang.Throwable -> L146
            goto L203
        L19d:
            r11.setAccessible(r1)     // Catch: java.lang.Throwable -> L146
            a.B8 r6 = new a.B8     // Catch: java.lang.Throwable -> L146
            r6.<init>(r14, r1)     // Catch: java.lang.Throwable -> L146
            a.J8.h(r15, r4, r11, r6)     // Catch: java.lang.Throwable -> L146
            java.util.concurrent.ConcurrentHashMap<java.lang.String, a.F8> r6 = a.E8.f71a     // Catch: java.lang.Throwable -> L146
            java.lang.String r6 = "store_K"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L146
            r9.<init>()     // Catch: java.lang.Throwable -> L146
            r9.append(r2)     // Catch: java.lang.Throwable -> L146
            java.lang.String r10 = ".K()"
            r9.append(r10)     // Catch: java.lang.Throwable -> L146
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L146
            a.E8.b(r4, r6, r9)     // Catch: java.lang.Throwable -> L146
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L146
            r6.<init>()     // Catch: java.lang.Throwable -> L146
            java.lang.String r9 = "HideTextStatus: hooked "
            r6.append(r9)     // Catch: java.lang.Throwable -> L146
            r6.append(r2)     // Catch: java.lang.Throwable -> L146
            java.lang.String r9 = ".K() (universal status data source)"
            r6.append(r9)     // Catch: java.lang.Throwable -> L146
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L146
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L146
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r1)     // Catch: java.lang.Throwable -> L146
            a.C0453x1.b(r6)     // Catch: java.lang.Throwable -> L146
            a.Wf r6 = a.Wf.f330a     // Catch: java.lang.Throwable -> L146
            goto L1e8
        L1e4:
            a.wd$a r6 = a.C0465xd.a(r6)
        L1e8:
            java.lang.Throwable r6 = a.C0447wd.a(r6)
            if (r6 == 0) goto L203
            java.lang.String r6 = r6.getMessage()
            java.lang.String r9 = "HideTextStatus: hookStatusStoreK fail: "
            java.lang.String r6 = a.C0487z.k(r9, r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r1)
            a.C0453x1.a(r6)
        L203:
            if (r3 == 0) goto L2ba
            java.lang.String r6 = "com.tencent.mm.plugin.mvvmlist.MvvmList"
            java.lang.ClassLoader r9 = r15.f136a     // Catch: java.lang.Throwable -> L21e
            java.lang.Class r6 = a.A1.b(r9, r6)     // Catch: java.lang.Throwable -> L21e
            if (r6 != 0) goto L221
            java.lang.String r0 = "HideTextStatus: MvvmList class not found"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L21e
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch: java.lang.Throwable -> L21e
            a.C0453x1.e(r0)     // Catch: java.lang.Throwable -> L21e
            goto L2ba
        L21e:
            r0 = move-exception
            goto L29b
        L221:
            java.lang.reflect.Method[] r6 = r6.getDeclaredMethods()     // Catch: java.lang.Throwable -> L21e
            a.C0193i9.d(r6, r5)     // Catch: java.lang.Throwable -> L21e
            int r5 = r6.length     // Catch: java.lang.Throwable -> L21e
            r9 = r0
        L22a:
            if (r9 >= r5) goto L255
            r10 = r6[r9]     // Catch: java.lang.Throwable -> L21e
            java.lang.String r11 = r10.getName()     // Catch: java.lang.Throwable -> L21e
            java.lang.String r12 = "x"
            boolean r11 = a.C0193i9.a(r11, r12)     // Catch: java.lang.Throwable -> L21e
            if (r11 == 0) goto L253
            java.lang.Class[] r11 = r10.getParameterTypes()     // Catch: java.lang.Throwable -> L21e
            int r11 = r11.length     // Catch: java.lang.Throwable -> L21e
            if (r11 != r1) goto L253
            java.lang.Class[] r11 = r10.getParameterTypes()     // Catch: java.lang.Throwable -> L21e
            r11 = r11[r0]     // Catch: java.lang.Throwable -> L21e
            java.lang.String r11 = r11.getName()     // Catch: java.lang.Throwable -> L21e
            boolean r11 = r11.equals(r3)     // Catch: java.lang.Throwable -> L21e
            if (r11 == 0) goto L253
            r8 = r10
            goto L255
        L253:
            int r9 = r9 + r1
            goto L22a
        L255:
            if (r8 != 0) goto L279
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L21e
            r0.<init>()     // Catch: java.lang.Throwable -> L21e
            java.lang.String r4 = "HideTextStatus: MvvmList.x("
            r0.append(r4)     // Catch: java.lang.Throwable -> L21e
            r0.append(r3)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r4 = ") not found"
            r0.append(r4)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L21e
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L21e
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch: java.lang.Throwable -> L21e
            a.C0453x1.e(r0)     // Catch: java.lang.Throwable -> L21e
            goto L2ba
        L279:
            r8.setAccessible(r1)     // Catch: java.lang.Throwable -> L21e
            a.B8 r5 = new a.B8     // Catch: java.lang.Throwable -> L21e
            r5.<init>(r14, r0)     // Catch: java.lang.Throwable -> L21e
            a.J8.h(r15, r4, r8, r5)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r0 = "mvvmlist_x"
            java.lang.String r5 = "MvvmList.x(o0)"
            a.E8.b(r4, r0, r5)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r0 = "HideTextStatus: hooked MvvmList.x() (UI data submit)"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L21e
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch: java.lang.Throwable -> L21e
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L21e
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L21e
            goto L29f
        L29b:
            a.wd$a r0 = a.C0465xd.a(r0)
        L29f:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L2ba
            java.lang.String r0 = r0.getMessage()
            java.lang.String r4 = "HideTextStatus: hookMvvmListSubmitUI fail: "
            java.lang.String r0 = a.C0487z.k(r4, r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            a.C0453x1.a(r0)
        L2ba:
            java.lang.String r0 = "com.tencent.mm.plugin.textstatus.ui.TextStatusCardFeedsActivity"
            java.lang.String r4 = "mainFeed"
            r14.h(r15, r0, r4)
            java.lang.String r0 = "com.tencent.mm.plugin.textstatus.ui.TextStatusProfileCardFeedActivity"
            java.lang.String r4 = "profileFeed"
            r14.h(r15, r0, r4)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r0 = "HideTextStatus: handleHook DONE (statusStore="
            r15.<init>(r0)
            r15.append(r2)
            java.lang.String r0 = ", submitParam="
            r15.append(r0)
            r15.append(r3)
            r15.append(r7)
            java.lang.String r15 = r15.toString()
            java.lang.Object[] r15 = new java.lang.Object[]{r15}
            java.lang.Object[] r15 = java.util.Arrays.copyOf(r15, r1)
            a.C0453x1.b(r15)
            return
    }
}
