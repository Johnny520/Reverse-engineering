package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class qe0 {

    /* JADX INFO: renamed from: α */
    public static final java.lang.Object f8982 = null;

    /* JADX INFO: renamed from: β */
    public static final java.lang.Object f8983 = null;

    static {
            l91 r0 = new l91
            java.lang.String r1 = "boolean"
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r0.<init>(r1, r9)
            l91 r1 = new l91
            java.lang.String r2 = "byte"
            java.lang.Class r10 = java.lang.Byte.TYPE
            r1.<init>(r2, r10)
            l91 r2 = new l91
            java.lang.String r3 = "char"
            java.lang.Class r11 = java.lang.Character.TYPE
            r2.<init>(r3, r11)
            l91 r3 = new l91
            java.lang.String r4 = "short"
            java.lang.Class r12 = java.lang.Short.TYPE
            r3.<init>(r4, r12)
            l91 r4 = new l91
            java.lang.String r5 = "int"
            java.lang.Class r13 = java.lang.Integer.TYPE
            r4.<init>(r5, r13)
            l91 r5 = new l91
            java.lang.String r6 = "long"
            java.lang.Class r14 = java.lang.Long.TYPE
            r5.<init>(r6, r14)
            l91 r6 = new l91
            java.lang.String r7 = "float"
            java.lang.Class r15 = java.lang.Float.TYPE
            r6.<init>(r7, r15)
            l91 r7 = new l91
            java.lang.String r8 = "double"
            r16 = r15
            java.lang.Class r15 = java.lang.Double.TYPE
            r7.<init>(r8, r15)
            l91 r8 = new l91
            r17 = r0
            java.lang.String r0 = "void"
            r18 = r1
            java.lang.Class r1 = java.lang.Void.TYPE
            r8.<init>(r0, r1)
            r0 = r17
            r1 = r18
            l91[] r0 = new p000.l91[]{r0, r1, r2, r3, r4, r5, r6, r7, r8}
            java.util.Map r0 = p000.ex0.m1972(r0)
            p000.qe0.f8982 = r0
            l91 r1 = new l91
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            r1.<init>(r9, r0)
            l91 r2 = new l91
            java.lang.Class<java.lang.Byte> r0 = java.lang.Byte.class
            r2.<init>(r10, r0)
            l91 r3 = new l91
            java.lang.Class<java.lang.Character> r0 = java.lang.Character.class
            r3.<init>(r11, r0)
            l91 r4 = new l91
            java.lang.Class<java.lang.Short> r0 = java.lang.Short.class
            r4.<init>(r12, r0)
            l91 r5 = new l91
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            r5.<init>(r13, r0)
            l91 r6 = new l91
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            r6.<init>(r14, r0)
            l91 r7 = new l91
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            r8 = r16
            r7.<init>(r8, r0)
            l91 r8 = new l91
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            r8.<init>(r15, r0)
            l91[] r0 = new p000.l91[]{r1, r2, r3, r4, r5, r6, r7, r8}
            java.util.Map r0 = p000.ex0.m1972(r0)
            p000.qe0.f8983 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.lang.Object m4869(java.lang.Object r2, java.lang.String r3, java.lang.Object... r4) {
            r3.getClass()
            if (r2 == 0) goto L1e
            java.lang.Class r0 = r2.getClass()
            r1 = 0
            java.lang.reflect.Method r3 = m4875(r0, r3, r4, r1)
            int r0 = r4.length     // Catch: java.lang.reflect.InvocationTargetException -> L18
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L18
            java.lang.Object r2 = r3.invoke(r2, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L18
            return r2
        L18:
            r2 = move-exception
            java.lang.Throwable r2 = r2.getTargetException()
            throw r2
        L1e:
            java.lang.String r2 = "Instance receiver is null for "
            java.lang.String r2 = r2.concat(r3)
            p000.C1080.m7266(r2)
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: β */
    public static java.lang.Object m4870(java.lang.Class r1, java.lang.String r2, java.lang.Object... r3) {
            r0 = 1
            java.lang.reflect.Method r1 = m4875(r1, r2, r3, r0)
            int r2 = r3.length     // Catch: java.lang.reflect.InvocationTargetException -> L10
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r3, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L10
            r3 = 0
            java.lang.Object r1 = r1.invoke(r3, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L10
            return r1
        L10:
            r1 = move-exception
            java.lang.Throwable r1 = r1.getTargetException()
            throw r1
    }

    /* JADX INFO: renamed from: γ */
    public static java.lang.Integer m4871(java.lang.Class[] r6, java.lang.Object[] r7) {
            int r0 = r6.length
            r1 = 0
            r2 = r1
        L3:
            if (r1 >= r0) goto L3b
            r3 = r6[r1]
            r4 = r7[r1]
            if (r4 != 0) goto L15
            boolean r3 = r3.isPrimitive()
            if (r3 == 0) goto L12
            goto L39
        L12:
            int r2 = r2 + 1
            goto L36
        L15:
            java.lang.Object r5 = p000.qe0.f8983
            java.lang.Object r5 = r5.get(r3)
            java.lang.Class r5 = (java.lang.Class) r5
            if (r5 != 0) goto L20
            goto L21
        L20:
            r3 = r5
        L21:
            java.lang.Class r4 = r4.getClass()
            boolean r5 = p000.ln0.m3626(r3, r4)
            if (r5 == 0) goto L2e
            int r2 = r2 + 4
            goto L36
        L2e:
            boolean r3 = r3.isAssignableFrom(r4)
            if (r3 == 0) goto L39
            int r2 = r2 + 2
        L36:
            int r1 = r1 + 1
            goto L3
        L39:
            r6 = 0
            return r6
        L3b:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            return r6
    }

    /* JADX INFO: renamed from: δ */
    public static p000.l01 m4872(java.lang.Class r4, java.lang.Object... r5) {
            int r0 = r5.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L7
            r0 = r1
            goto Lb
        L7:
            int r0 = r5.length
            int r0 = r0 - r2
            r0 = r5[r0]
        Lb:
            boolean r3 = r0 instanceof p000.m01
            if (r3 == 0) goto L12
            r1 = r0
            m01 r1 = (p000.m01) r1
        L12:
            if (r1 == 0) goto L35
            java.lang.ClassLoader r0 = r4.getClassLoader()
            java.util.List r5 = p000.AbstractC0312g7.m2243(r5)
            java.lang.Class[] r5 = m4881(r0, r5)
            int r0 = r5.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r0)
            java.lang.Class[] r5 = (java.lang.Class[]) r5
            java.lang.reflect.Constructor r4 = r4.getDeclaredConstructor(r5)
            r4.setAccessible(r2)
            xq0 r5 = p000.xq0.f12253
            l01 r4 = r5.m6775(r4, r1)
            return r4
        L35:
            java.lang.String r4 = "Last argument must be MethodHookCallback"
            p000.C1080.m7275(r4)
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: ε */
    public static p000.l01 m4873(java.lang.Class r5, java.lang.String r6, java.lang.Object... r7) {
            int r0 = r7.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L7
            r0 = r1
            goto Lb
        L7:
            int r0 = r7.length
            int r0 = r0 - r2
            r0 = r7[r0]
        Lb:
            boolean r3 = r0 instanceof p000.m01
            if (r3 == 0) goto L12
            m01 r0 = (p000.m01) r0
            goto L13
        L12:
            r0 = r1
        L13:
            if (r0 == 0) goto L66
            java.lang.ClassLoader r3 = r5.getClassLoader()
            java.util.List r7 = p000.AbstractC0312g7.m2243(r7)
            java.lang.Class[] r7 = m4881(r3, r7)
            r3 = r5
        L22:
            if (r3 == 0) goto L3e
            int r4 = r7.length     // Catch: java.lang.NoSuchMethodException -> L39
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r7, r4)     // Catch: java.lang.NoSuchMethodException -> L39
            java.lang.Class[] r4 = (java.lang.Class[]) r4     // Catch: java.lang.NoSuchMethodException -> L39
            java.lang.reflect.Method r4 = r3.getDeclaredMethod(r6, r4)     // Catch: java.lang.NoSuchMethodException -> L39
            r4.setAccessible(r2)     // Catch: java.lang.NoSuchMethodException -> L39
            xq0 r5 = p000.xq0.f12253
            l01 r5 = r5.m6775(r4, r0)
            return r5
        L39:
            java.lang.Class r3 = r3.getSuperclass()
            goto L22
        L3e:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException
            java.lang.String r5 = r5.getName()
            zb0 r2 = new zb0
            r3 = 22
            r2.<init>(r3)
            r3 = 31
            java.lang.String r7 = p000.AbstractC0312g7.m2256(r7, r1, r1, r2, r3)
            java.lang.String r1 = "#"
            java.lang.String r2 = "("
            java.lang.StringBuilder r5 = p000.AbstractC0602nx.m4138(r5, r1, r6, r2, r7)
            java.lang.String r6 = ")"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
        L66:
            java.lang.String r5 = "Last argument must be MethodHookCallback"
            p000.C1080.m7275(r5)
            r5 = 0
            return r5
    }

    /* JADX INFO: renamed from: ζ */
    public static p000.l01 m4874(java.lang.String r0, java.lang.ClassLoader r1, java.lang.String r2, java.lang.Object... r3) {
            java.lang.Class r0 = m4876(r1, r0)
            int r1 = r3.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r3, r1)
            l01 r0 = m4873(r0, r2, r1)
            return r0
    }

    /* JADX INFO: renamed from: η */
    public static java.lang.reflect.Method m4875(java.lang.Class r8, java.lang.String r9, java.lang.Object[] r10, boolean r11) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r8
        L6:
            if (r1 == 0) goto L3e
            java.lang.reflect.Method[] r2 = r1.getDeclaredMethods()
            r2.getClass()
            int r3 = r2.length
            r4 = 0
        L11:
            if (r4 >= r3) goto L39
            r5 = r2[r4]
            java.lang.String r6 = r5.getName()
            boolean r6 = p000.ln0.m3626(r6, r9)
            if (r6 == 0) goto L36
            java.lang.Class[] r6 = r5.getParameterTypes()
            int r6 = r6.length
            int r7 = r10.length
            if (r6 != r7) goto L36
            if (r11 == 0) goto L33
            int r6 = r5.getModifiers()
            boolean r6 = java.lang.reflect.Modifier.isStatic(r6)
            if (r6 == 0) goto L36
        L33:
            r0.add(r5)
        L36:
            int r4 = r4 + 1
            goto L11
        L39:
            java.lang.Class r1 = r1.getSuperclass()
            goto L6
        L3e:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r0 = r0.iterator()
        L47:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L75
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.Class[] r3 = r1.getParameterTypes()
            r3.getClass()
            java.lang.Integer r3 = m4871(r3, r10)
            if (r3 == 0) goto L6f
            int r2 = r3.intValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            l91 r3 = new l91
            r3.<init>(r1, r2)
            r2 = r3
        L6f:
            if (r2 == 0) goto L47
            r11.add(r2)
            goto L47
        L75:
            java.util.Iterator r11 = r11.iterator()
            boolean r0 = r11.hasNext()
            if (r0 != 0) goto L81
            r0 = r2
            goto Lb0
        L81:
            java.lang.Object r0 = r11.next()
            boolean r1 = r11.hasNext()
            if (r1 != 0) goto L8c
            goto Lb0
        L8c:
            r1 = r0
            l91 r1 = (p000.l91) r1
            java.lang.Object r1 = r1.f6503
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        L97:
            java.lang.Object r3 = r11.next()
            r4 = r3
            l91 r4 = (p000.l91) r4
            java.lang.Object r4 = r4.f6503
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            if (r1 >= r4) goto Laa
            r0 = r3
            r1 = r4
        Laa:
            boolean r3 = r11.hasNext()
            if (r3 != 0) goto L97
        Lb0:
            l91 r0 = (p000.l91) r0
            if (r0 == 0) goto Lbf
            java.lang.Object r11 = r0.f6502
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            if (r11 == 0) goto Lbf
            r8 = 1
            r11.setAccessible(r8)
            return r11
        Lbf:
            java.lang.NoSuchMethodException r11 = new java.lang.NoSuchMethodException
            java.lang.String r8 = r8.getName()
            zb0 r0 = new zb0
            r1 = 23
            r0.<init>(r1)
            r1 = 31
            java.lang.String r10 = p000.AbstractC0312g7.m2256(r10, r2, r2, r0, r1)
            java.lang.String r0 = "#"
            java.lang.String r1 = "("
            java.lang.StringBuilder r8 = p000.AbstractC0602nx.m4138(r8, r0, r9, r1, r10)
            java.lang.String r9 = ")"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r11.<init>(r8)
            throw r11
    }

    /* JADX INFO: renamed from: θ */
    public static java.lang.Class m4876(java.lang.ClassLoader r1, java.lang.String r2) {
            r2.getClass()
            java.lang.Object r0 = p000.qe0.f8982
            java.lang.Object r0 = r0.get(r2)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 != 0) goto L16
            r0 = 0
            java.lang.Class r1 = java.lang.Class.forName(r2, r0, r1)
            r1.getClass()
            return r1
        L16:
            return r0
    }

    /* JADX INFO: renamed from: ι */
    public static java.lang.Class m4877(java.lang.ClassLoader r0, java.lang.String r1) {
            r1.getClass()
            java.lang.Class r0 = m4876(r0, r1)     // Catch: java.lang.Throwable -> L8
            goto Lf
        L8:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        Lf:
            boolean r1 = r0 instanceof p000.eo1
            if (r1 == 0) goto L14
            r0 = 0
        L14:
            java.lang.Class r0 = (java.lang.Class) r0
            return r0
    }

    /* JADX INFO: renamed from: κ */
    public static java.lang.reflect.Field m4878(java.lang.Class r3, java.lang.String r4) {
            r0 = r3
        L1:
            if (r0 == 0) goto L11
            java.lang.reflect.Field r1 = r0.getDeclaredField(r4)     // Catch: java.lang.NoSuchFieldException -> Lc
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.NoSuchFieldException -> Lc
            return r1
        Lc:
            java.lang.Class r0 = r0.getSuperclass()
            goto L1
        L11:
            java.lang.NoSuchFieldException r0 = new java.lang.NoSuchFieldException
            java.lang.String r3 = r3.getName()
            java.lang.String r1 = "#"
            java.lang.String r3 = p000.lz1.m3688(r3, r1, r4)
            r0.<init>(r3)
            throw r0
    }

    /* JADX INFO: renamed from: λ */
    public static java.lang.Object m4879(java.lang.Object r1, java.lang.String r2) {
            r2.getClass()
            if (r1 == 0) goto L12
            java.lang.Class r0 = r1.getClass()
            java.lang.reflect.Field r2 = m4878(r0, r2)
            java.lang.Object r1 = r2.get(r1)
            return r1
        L12:
            java.lang.String r1 = "Instance receiver is null for field "
            java.lang.String r1 = r1.concat(r2)
            p000.C1080.m7266(r1)
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: μ */
    public static java.lang.Object m4880(java.lang.Class r7, java.lang.Object... r8) {
            java.lang.reflect.Constructor[] r0 = r7.getDeclaredConstructors()
            r0.getClass()
            ss1 r0 = p000.AbstractC0312g7.m2232(r0)
            pe0 r1 = new pe0
            r2 = 0
            r1.<init>(r2, r8)
            y30 r2 = new y30
            r3 = 1
            r2.<init>(r0, r3, r1)
            pe0 r0 = new pe0
            r1 = 1
            r0.<init>(r1, r8)
            y30 r0 = p000.us1.m5943(r2, r0)
            x30 r1 = new x30
            r1.<init>(r0)
            boolean r0 = r1.hasNext()
            r2 = 0
            if (r0 != 0) goto L2f
            r0 = r2
            goto L5e
        L2f:
            java.lang.Object r0 = r1.next()
            boolean r4 = r1.hasNext()
            if (r4 != 0) goto L3a
            goto L5e
        L3a:
            r4 = r0
            l91 r4 = (p000.l91) r4
            java.lang.Object r4 = r4.f6503
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
        L45:
            java.lang.Object r5 = r1.next()
            r6 = r5
            l91 r6 = (p000.l91) r6
            java.lang.Object r6 = r6.f6503
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r4 >= r6) goto L58
            r0 = r5
            r4 = r6
        L58:
            boolean r5 = r1.hasNext()
            if (r5 != 0) goto L45
        L5e:
            l91 r0 = (p000.l91) r0
            if (r0 == 0) goto L7e
            java.lang.Object r0 = r0.f6502
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            if (r0 == 0) goto L7e
            r0.setAccessible(r3)
            int r7 = r8.length     // Catch: java.lang.reflect.InvocationTargetException -> L78
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r8, r7)     // Catch: java.lang.reflect.InvocationTargetException -> L78
            java.lang.Object r7 = r0.newInstance(r7)     // Catch: java.lang.reflect.InvocationTargetException -> L78
            r7.getClass()
            return r7
        L78:
            r7 = move-exception
            java.lang.Throwable r7 = r7.getTargetException()
            throw r7
        L7e:
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException
            java.lang.String r7 = r7.getName()
            zb0 r1 = new zb0
            r3 = 24
            r1.<init>(r3)
            r3 = 31
            java.lang.String r8 = p000.AbstractC0312g7.m2256(r8, r2, r2, r1, r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            java.lang.String r7 = "("
            r1.append(r7)
            r1.append(r8)
            java.lang.String r7 = ")"
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
    }

    /* JADX INFO: renamed from: ν */
    public static java.lang.Class[] m4881(java.lang.ClassLoader r3, java.util.List r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = p000.AbstractC1021yh.m6889(r4, r1)
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        Lf:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L35
            java.lang.Object r1 = r4.next()
            boolean r2 = r1 instanceof java.lang.Class
            if (r2 == 0) goto L20
            java.lang.Class r1 = (java.lang.Class) r1
            goto L2a
        L20:
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L2e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Class r1 = m4876(r3, r1)
        L2a:
            r0.add(r1)
            goto Lf
        L2e:
            java.lang.String r3 = "Parameter type must be Class or String: "
            p000.C1080.m7274(r1, r3)
            r3 = 0
            return r3
        L35:
            r3 = 0
            java.lang.Class[] r3 = new java.lang.Class[r3]
            java.lang.Object[] r3 = r0.toArray(r3)
            java.lang.Class[] r3 = (java.lang.Class[]) r3
            return r3
    }

    /* JADX INFO: renamed from: ξ */
    public static void m4882(java.lang.String r1, java.lang.Object r2, java.lang.Object r3) {
            if (r2 == 0) goto Le
            java.lang.Class r0 = r2.getClass()
            java.lang.reflect.Field r1 = m4878(r0, r1)
            r1.set(r2, r3)
            return
        Le:
            java.lang.String r2 = "Instance receiver is null for field "
            java.lang.String r1 = r2.concat(r1)
            p000.C1080.m7266(r1)
            return
    }
}
