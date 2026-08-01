package p000;

/* JADX INFO: renamed from: vb */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0903vb {

    /* JADX INFO: renamed from: α */
    public static final java.util.List f11215 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.List f11216 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.atomic.AtomicBoolean f11217 = null;

    static {
            java.lang.String r0 = "~7897B8FB4A9E8F3BF9B516DDE3F6FCD5574085CBE8B4160971D94E54B26B9E48699AD8B5E9CC59F4D0D23E391369E2FF6FC589F426BDCC275EDE0E734942849C"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.String r1 = "~7887EB3C8DFF4D5E985E245E27C49A473730FF61BE5736C7134480469C45468AA16A886E0C6B950D0879311D9E9F6D4C91BA17E2FAE3E3B1DA2FC369F0F1818D9E513770"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            p000.C0903vb.f11215 = r0
            java.lang.String r0 = "~789325E9C4B2AA228E18888457F2F91C62869634665744D07384DF478FCE9D836A36818F2688688DA867779015D81E47DA7CF8302B44AD3872B71E805D46BAAA46"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.util.List r0 = p000.AbstractC1021yh.m6896(r0)
            p000.C0903vb.f11216 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.C0903vb.f11217 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m6143(java.util.LinkedHashSet r1, java.lang.Class r2) {
            java.lang.Class r0 = java.lang.Void.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            goto L37
        L9:
            boolean r0 = r2.isPrimitive()
            if (r0 == 0) goto L10
            goto L37
        L10:
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L19
            goto L37
        L19:
            java.lang.Class<java.lang.Number> r0 = java.lang.Number.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto L22
            goto L37
        L22:
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L2b
            goto L37
        L2b:
            boolean r0 = r2.isInterface()
            if (r0 != 0) goto L38
            boolean r0 = m6150(r2)
            if (r0 != 0) goto L38
        L37:
            return
        L38:
            java.lang.String r2 = r2.getName()
            r1.add(r2)
            return
    }

    /* JADX INFO: renamed from: β */
    public static void m6144(java.util.LinkedHashMap r1, java.lang.reflect.Method r2) {
            r0 = 1
            r2.setAccessible(r0)
            java.lang.String r0 = m6154(r2)
            r1.put(r0, r2)
            return
    }

    /* JADX INFO: renamed from: γ */
    public static java.util.ArrayList m6145(java.lang.Class r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            m6146(r1, r0, r2)
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public static final void m6146(java.util.LinkedHashSet r6, java.util.ArrayList r7, java.lang.Class r8) {
            if (r8 == 0) goto L47
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto Lb
            goto L47
        Lb:
            java.lang.String r0 = r8.getName()
            boolean r0 = r6.add(r0)
            if (r0 != 0) goto L16
            goto L47
        L16:
            r0 = 0
            java.lang.reflect.Method[] r1 = r8.getDeclaredMethods()     // Catch: java.lang.Throwable -> L2e
            r1.getClass()     // Catch: java.lang.Throwable -> L2e
            int r2 = r1.length     // Catch: java.lang.Throwable -> L2e
            r3 = r0
        L20:
            if (r3 >= r2) goto L2e
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L2e
            r5 = 1
            r4.setAccessible(r5)     // Catch: java.lang.Throwable -> L2e
            r7.add(r4)     // Catch: java.lang.Throwable -> L2e
            int r3 = r3 + 1
            goto L20
        L2e:
            java.lang.Class[] r1 = r8.getInterfaces()
            r1.getClass()
            int r2 = r1.length
        L36:
            if (r0 >= r2) goto L40
            r3 = r1[r0]
            m6146(r6, r7, r3)
            int r0 = r0 + 1
            goto L36
        L40:
            java.lang.Class r8 = r8.getSuperclass()
            m6146(r6, r7, r8)
        L47:
            return
    }

    /* JADX INFO: renamed from: ε */
    public static java.util.List m6147(org.luckypray.dexkit.DexKitBridge r4, java.lang.ClassLoader r5, java.lang.String r6, java.lang.String r7) {
            ub r0 = new ub     // Catch: java.lang.Throwable -> L38
            r1 = 1
            r0.<init>(r1, r6, r7)     // Catch: java.lang.Throwable -> L38
            org.luckypray.dexkit.result.MethodDataList r4 = r4.findMethod(r0)     // Catch: java.lang.Throwable -> L38
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L38
            r0.<init>()     // Catch: java.lang.Throwable -> L38
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L38
        L13:
            boolean r1 = r4.hasNext()     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r4.next()     // Catch: java.lang.Throwable -> L38
            org.luckypray.dexkit.result.MethodData r1 = (org.luckypray.dexkit.result.MethodData) r1     // Catch: java.lang.Throwable -> L38
            java.lang.reflect.Method r1 = r1.getMethodInstance(r5)     // Catch: java.lang.Throwable -> L24
            goto L2b
        L24:
            r1 = move-exception
            eo1 r2 = new eo1     // Catch: java.lang.Throwable -> L38
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L38
            r1 = r2
        L2b:
            boolean r2 = r1 instanceof p000.eo1     // Catch: java.lang.Throwable -> L38
            if (r2 == 0) goto L30
            r1 = 0
        L30:
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1     // Catch: java.lang.Throwable -> L38
            if (r1 == 0) goto L13
            r0.add(r1)     // Catch: java.lang.Throwable -> L38
            goto L13
        L38:
            r4 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r4)
        L3e:
            java.lang.Throwable r4 = p000.fo1.m2190(r0)
            jz r5 = p000.C0450jz.f5672
            if (r4 == 0) goto L6a
            java.lang.String r1 = " returnType="
            java.lang.String r2 = " params="
            java.lang.String r3 = "dex find methods failed declaredClass="
            java.lang.StringBuilder r6 = p000.lz1.m3695(r3, r6, r1, r7, r2)
            r6.append(r5)
            java.lang.String r7 = " strings="
            r6.append(r7)
            r6.append(r5)
            java.lang.String r7 = " err="
            r6.append(r7)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            m6153(r4)
        L6a:
            boolean r4 = r0 instanceof p000.eo1
            if (r4 == 0) goto L6f
            r0 = r5
        L6f:
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public static java.util.List m6148(java.util.List r3) {
            f7 r0 = new f7
            r1 = 1
            r0.<init>(r1, r3)
            n7 r3 = new n7
            r1 = 20
            r3.<init>(r1)
            t52 r1 = new t52
            r1.<init>(r0, r3)
            n7 r3 = new n7
            r0 = 21
            r3.<init>(r0)
            y30 r0 = new y30
            r2 = 1
            r0.<init>(r1, r2, r3)
            d50 r3 = new d50
            r1 = 23
            r3.<init>(r1)
            cu r1 = new cu
            r2 = 3
            r1.<init>(r0, r2, r3)
            n7 r3 = new n7
            r0 = 22
            r3.<init>(r0)
            t52 r0 = new t52
            r0.<init>(r1, r3)
            n7 r3 = new n7
            r1 = 23
            r3.<init>(r1)
            cu r1 = new cu
            r2 = 0
            r1.<init>(r0, r2, r3)
            n7 r3 = new n7
            r0 = 24
            r3.<init>(r0)
            t52 r3 = p000.us1.m5945(r1, r3)
            java.util.List r3 = p000.us1.m5948(r3)
            return r3
    }

    /* JADX INFO: renamed from: η */
    public static final boolean m6149(java.util.LinkedHashSet r6, java.lang.String r7, java.lang.Class r8) {
            java.lang.String r0 = r8.getName()
            boolean r0 = r6.add(r0)
            r1 = 0
            if (r0 != 0) goto Lc
            goto L44
        Lc:
            java.lang.Class[] r0 = r8.getInterfaces()
            r0.getClass()
            int r2 = r0.length
            r3 = r1
        L15:
            if (r3 >= r2) goto L2e
            r4 = r0[r3]
            java.lang.String r5 = r4.getName()
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L24
            goto L42
        L24:
            boolean r4 = m6149(r6, r7, r4)
            if (r4 == 0) goto L2b
            goto L42
        L2b:
            int r3 = r3 + 1
            goto L15
        L2e:
            java.lang.Class r8 = r8.getSuperclass()
            if (r8 == 0) goto L44
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L44
            boolean r6 = m6149(r6, r7, r8)
            if (r6 == 0) goto L44
        L42:
            r6 = 1
            return r6
        L44:
            return r1
    }

    /* JADX INFO: renamed from: θ */
    public static boolean m6150(java.lang.Class r2) {
            java.util.ArrayList r2 = m6145(r2)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lb
            goto L3f
        Lb:
            java.util.Iterator r2 = r2.iterator()
        Lf:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L3f
            java.lang.Object r0 = r2.next()
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            boolean r1 = r0.isBridge()
            if (r1 != 0) goto Lf
            boolean r1 = r0.isSynthetic()
            if (r1 != 0) goto Lf
            java.lang.Class[] r1 = r0.getParameterTypes()
            r1.getClass()
            int r1 = r1.length
            if (r1 != 0) goto Lf
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class r0 = r0.getReturnType()
            boolean r0 = r1.isAssignableFrom(r0)
            if (r0 == 0) goto Lf
            r2 = 1
            return r2
        L3f:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ι */
    public static boolean m6151(java.lang.reflect.Method r1) {
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            if (r0 == 0) goto Lb
            goto L38
        Lb:
            int r0 = r1.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 == 0) goto L16
            goto L38
        L16:
            boolean r0 = r1.isBridge()
            if (r0 != 0) goto L38
            boolean r0 = r1.isSynthetic()
            if (r0 == 0) goto L23
            goto L38
        L23:
            java.lang.Class[] r0 = r1.getParameterTypes()
            r0.getClass()
            int r0 = r0.length
            if (r0 != 0) goto L38
            java.lang.Class<java.util.List> r0 = java.util.List.class
            java.lang.Class r1 = r1.getReturnType()
            boolean r1 = r0.isAssignableFrom(r1)
            return r1
        L38:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: κ */
    public static boolean m6152(java.lang.String r2) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r2.toLowerCase(r0)
            r0.getClass()
            java.util.List r1 = p000.C0903vb.f11215
            boolean r2 = r1.contains(r2)
            if (r2 != 0) goto L2c
            java.lang.String r2 = "hometabdatasource"
            r1 = 0
            boolean r2 = p000.q02.m4654(r0, r2, r1)
            if (r2 != 0) goto L2c
            java.lang.String r2 = "homepage.tab.data"
            boolean r2 = p000.q02.m4654(r0, r2, r1)
            if (r2 != 0) goto L2c
            java.lang.String r2 = "home.tab.data"
            boolean r2 = p000.q02.m4654(r0, r2, r1)
            if (r2 == 0) goto L2b
            goto L2c
        L2b:
            return r1
        L2c:
            r2 = 1
            return r2
    }

    /* JADX INFO: renamed from: λ */
    public static void m6153(java.lang.String r3) {
            java.lang.String r0 = "r59106a5976aa19e"
            r1 = 4
            r2 = 0
            p000.C0888ux.m5988(r0, r3, r2, r1, r2)     // Catch: java.lang.Throwable -> L7
        L7:
            return
    }

    /* JADX INFO: renamed from: μ */
    public static java.lang.String m6154(java.lang.reflect.Method r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r6.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "#"
            r0.append(r1)
            java.lang.String r1 = r6.getName()
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            java.lang.Class[] r1 = r6.getParameterTypes()
            r1.getClass()
            n7 r2 = new n7
            r3 = 26
            r2.<init>(r3)
            r3 = 30
            java.lang.String r4 = ","
            r5 = 0
            java.lang.String r1 = p000.AbstractC0312g7.m2256(r1, r4, r5, r2, r3)
            java.lang.String r2 = "):"
            java.lang.String r6 = p000.lz1.m3692(r0, r1, r2, r6)
            return r6
    }

    /* JADX INFO: renamed from: ν */
    public static java.util.List m6155(java.lang.ClassLoader r6, boolean r7) {
            r6.getClass()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.Object r1 = p000.C0666ox.f8297
            kx r1 = p000.EnumC0491kx.f6271
            java.util.List r2 = p000.C0666ox.m4321(r1, r6)
            jz r3 = p000.C0450jz.f5672
            if (r2 != 0) goto L15
            r2 = r3
        L15:
            java.util.Iterator r2 = r2.iterator()
        L19:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L2d
            java.lang.Object r4 = r2.next()
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.String r5 = r4.getName()
            r0.put(r5, r4)
            goto L19
        L2d:
            java.util.List r2 = p000.C0903vb.f11215
            java.util.Iterator r2 = r2.iterator()
        L33:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L4d
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Class r4 = p000.AbstractC0093bx.m1082(r6, r4)
            if (r4 == 0) goto L33
            java.lang.String r5 = r4.getName()
            r0.put(r5, r4)
            goto L33
        L4d:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto La4
            java.util.Collection r6 = r0.values()
            r6.getClass()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.List r6 = p000.AbstractC0984xh.m6666(r6)
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L67
            goto L96
        L67:
            java.lang.Object r7 = p000.C0666ox.f8297
            java.util.concurrent.atomic.AtomicBoolean r7 = p000.C0666ox.f8305
            boolean r7 = r7.get()
            if (r7 != 0) goto L72
            goto L96
        L72:
            p000.C0666ox.m4325(r1, r6)     // Catch: java.lang.Throwable -> L78
            s62 r6 = p000.s62.f9751     // Catch: java.lang.Throwable -> L78
            goto L7f
        L78:
            r6 = move-exception
            eo1 r7 = new eo1
            r7.<init>(r6)
            r6 = r7
        L7f:
            java.lang.Throwable r6 = p000.fo1.m2190(r6)
            if (r6 == 0) goto L96
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "save classes failed, key=home_tab_data_source_classes, err="
            r7.<init>(r1)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            m6153(r6)
        L96:
            java.util.Collection r6 = r0.values()
            r6.getClass()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.List r6 = p000.AbstractC0984xh.m6666(r6)
            return r6
        La4:
            if (r7 == 0) goto Le3
            java.lang.Object r7 = p000.C0666ox.f8297
            java.util.concurrent.atomic.AtomicBoolean r7 = p000.C0666ox.f8305
            boolean r7 = r7.get()
            if (r7 != 0) goto Lb1
            goto Le3
        Lb1:
            bb r7 = new bb
            r2 = 3
            r7.<init>(r6, r2)
            java.lang.String r2 = "识别底栏真实数据源类"
            java.util.List r6 = p000.C0666ox.m4314(r1, r6, r2, r7)
            java.util.Iterator r6 = r6.iterator()
        Lc1:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Ld5
            java.lang.Object r7 = r6.next()
            java.lang.Class r7 = (java.lang.Class) r7
            java.lang.String r1 = r7.getName()
            r0.put(r1, r7)
            goto Lc1
        Ld5:
            java.util.Collection r6 = r0.values()
            r6.getClass()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.List r6 = p000.AbstractC0984xh.m6666(r6)
            return r6
        Le3:
            return r3
    }

    /* JADX INFO: renamed from: ξ */
    public static java.util.LinkedHashSet m6156(java.lang.ClassLoader r4) {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.List r1 = p000.C0903vb.f11216
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Class r3 = p000.AbstractC0093bx.m1082(r4, r2)
            if (r3 == 0) goto Lb
            r0.add(r2)
            goto Lb
        L21:
            java.lang.Object r1 = p000.C0666ox.f8297
            kx r1 = p000.EnumC0491kx.f6270
            java.util.List r1 = p000.C0666ox.m4323(r1, r4)
            if (r1 != 0) goto L2d
            jz r1 = p000.C0450jz.f5672
        L2d:
            java.util.Iterator r1 = r1.iterator()
        L31:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L48
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.Class r2 = r2.getReturnType()
            r2.getClass()
            m6143(r0, r2)
            goto L31
        L48:
            java.util.List r4 = m6161(r4)
            java.util.Iterator r4 = r4.iterator()
        L50:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L67
            java.lang.Object r1 = r4.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.Class r1 = r1.getReturnType()
            r1.getClass()
            m6143(r0, r1)
            goto L50
        L67:
            return r0
    }

    /* JADX INFO: renamed from: ο */
    public static java.util.List m6157(java.lang.ClassLoader r8, boolean r9) {
            r8.getClass()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.Object r1 = p000.C0666ox.f8297
            kx r1 = p000.EnumC0491kx.f6272
            java.util.List r2 = p000.C0666ox.m4323(r1, r8)
            jz r3 = p000.C0450jz.f5672
            if (r2 != 0) goto L15
            r2 = r3
        L15:
            java.util.Iterator r2 = r2.iterator()
        L19:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L29
            java.lang.Object r4 = r2.next()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            m6144(r0, r4)
            goto L19
        L29:
            r2 = 0
            java.util.List r2 = m6155(r8, r2)
            java.util.Iterator r2 = r2.iterator()
        L32:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L5e
            java.lang.Object r4 = r2.next()
            java.lang.Class r4 = (java.lang.Class) r4
            java.util.ArrayList r4 = m6145(r4)
            java.util.Iterator r4 = r4.iterator()
        L46:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L32
            java.lang.Object r5 = r4.next()
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            int r6 = m6164(r5)
            r7 = 2200(0x898, float:3.083E-42)
            if (r6 < r7) goto L46
            m6144(r0, r5)
            goto L46
        L5e:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L82
            java.util.Collection r8 = r0.values()
            r8.getClass()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.List r8 = p000.AbstractC0984xh.m6666(r8)
            m6162(r1, r8)
            java.util.Collection r8 = r0.values()
            r8.getClass()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.List r8 = p000.AbstractC0984xh.m6666(r8)
            return r8
        L82:
            if (r9 == 0) goto Lbd
            java.lang.Object r9 = p000.C0666ox.f8297
            java.util.concurrent.atomic.AtomicBoolean r9 = p000.C0666ox.f8305
            boolean r9 = r9.get()
            if (r9 != 0) goto L8f
            goto Lbd
        L8f:
            bb r9 = new bb
            r2 = 5
            r9.<init>(r8, r2)
            java.lang.String r2 = "识别底栏真实数据源列表方法"
            java.util.List r8 = p000.C0666ox.m4316(r1, r8, r2, r9)
            java.util.Iterator r8 = r8.iterator()
        L9f:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto Laf
            java.lang.Object r9 = r8.next()
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            m6144(r0, r9)
            goto L9f
        Laf:
            java.util.Collection r8 = r0.values()
            r8.getClass()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.List r8 = p000.AbstractC0984xh.m6666(r8)
            return r8
        Lbd:
            return r3
    }

    /* JADX INFO: renamed from: π */
    public static java.util.List m6158(java.lang.ClassLoader r5, boolean r6) {
            r5.getClass()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.Object r1 = p000.C0666ox.f8297
            kx r1 = p000.EnumC0491kx.f6270
            java.util.List r2 = p000.C0666ox.m4323(r1, r5)
            jz r3 = p000.C0450jz.f5672
            if (r2 != 0) goto L15
            r2 = r3
        L15:
            java.util.Iterator r2 = r2.iterator()
        L19:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L29
            java.lang.Object r4 = r2.next()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            m6144(r0, r4)
            goto L19
        L29:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L3d
            java.util.Collection r5 = r0.values()
            r5.getClass()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.List r5 = p000.AbstractC0984xh.m6666(r5)
            return r5
        L3d:
            java.util.List r2 = m6161(r5)
            java.util.Iterator r2 = r2.iterator()
        L45:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L55
            java.lang.Object r4 = r2.next()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            m6144(r0, r4)
            goto L45
        L55:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L79
            java.util.Collection r5 = r0.values()
            r5.getClass()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.List r5 = p000.AbstractC0984xh.m6666(r5)
            m6162(r1, r5)
            java.util.Collection r5 = r0.values()
            r5.getClass()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.List r5 = p000.AbstractC0984xh.m6666(r5)
            return r5
        L79:
            if (r6 == 0) goto Lb4
            java.lang.Object r6 = p000.C0666ox.f8297
            java.util.concurrent.atomic.AtomicBoolean r6 = p000.C0666ox.f8305
            boolean r6 = r6.get()
            if (r6 != 0) goto L86
            goto Lb4
        L86:
            bb r6 = new bb
            r2 = 4
            r6.<init>(r5, r2)
            java.lang.String r2 = "识别底栏数据源入口方法"
            java.util.List r5 = p000.C0666ox.m4316(r1, r5, r2, r6)
            java.util.Iterator r5 = r5.iterator()
        L96:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto La6
            java.lang.Object r6 = r5.next()
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            m6144(r0, r6)
            goto L96
        La6:
            java.util.Collection r5 = r0.values()
            r5.getClass()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.List r5 = p000.AbstractC0984xh.m6666(r5)
            return r5
        Lb4:
            return r3
    }

    /* JADX INFO: renamed from: ρ */
    public static java.util.List m6159(java.lang.ClassLoader r10, boolean r11) {
            r10.getClass()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.Object r1 = p000.C0666ox.f8297
            kx r1 = p000.EnumC0491kx.f6214
            java.util.List r2 = p000.C0666ox.m4323(r1, r10)
            jz r3 = p000.C0450jz.f5672
            if (r2 != 0) goto L15
            r2 = r3
        L15:
            java.util.Iterator r2 = r2.iterator()
        L19:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L29
            java.lang.Object r4 = r2.next()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            m6144(r0, r4)
            goto L19
        L29:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.LinkedHashSet r4 = m6156(r10)
            java.util.List r5 = p000.C0903vb.f11215
            java.util.Iterator r5 = r5.iterator()
        L38:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L6b
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Class r6 = p000.AbstractC0093bx.m1082(r10, r6)
            if (r6 != 0) goto L4b
            goto L38
        L4b:
            java.util.ArrayList r6 = m6145(r6)
            java.util.Iterator r6 = r6.iterator()
        L53:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L38
            java.lang.Object r7 = r6.next()
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            int r8 = m6165(r7, r4)
            r9 = 2500(0x9c4, float:3.503E-42)
            if (r8 < r9) goto L53
            m6144(r2, r7)
            goto L53
        L6b:
            java.util.Collection r2 = r2.values()
            r2.getClass()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.List r2 = p000.AbstractC0984xh.m6666(r2)
            java.util.Iterator r2 = r2.iterator()
        L7c:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L8c
            java.lang.Object r4 = r2.next()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            m6144(r0, r4)
            goto L7c
        L8c:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto Lb0
            java.util.Collection r10 = r0.values()
            r10.getClass()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.List r10 = p000.AbstractC0984xh.m6666(r10)
            m6162(r1, r10)
            java.util.Collection r10 = r0.values()
            r10.getClass()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.List r10 = p000.AbstractC0984xh.m6666(r10)
            return r10
        Lb0:
            if (r11 == 0) goto Leb
            java.lang.Object r11 = p000.C0666ox.f8297
            java.util.concurrent.atomic.AtomicBoolean r11 = p000.C0666ox.f8305
            boolean r11 = r11.get()
            if (r11 != 0) goto Lbd
            goto Leb
        Lbd:
            bb r11 = new bb
            r2 = 6
            r11.<init>(r10, r2)
            java.lang.String r2 = "扫描底栏 Tab ID 方法"
            java.util.List r10 = p000.C0666ox.m4316(r1, r10, r2, r11)
            java.util.Iterator r10 = r10.iterator()
        Lcd:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto Ldd
            java.lang.Object r11 = r10.next()
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            m6144(r0, r11)
            goto Lcd
        Ldd:
            java.util.Collection r10 = r0.values()
            r10.getClass()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.List r10 = p000.AbstractC0984xh.m6666(r10)
            return r10
        Leb:
            return r3
    }

    /* JADX INFO: renamed from: σ */
    public static java.util.List m6160(java.lang.Class r6, java.lang.ClassLoader r7) {
            r7.getClass()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.LinkedHashSet r7 = m6156(r7)
            java.lang.String r1 = r6.getName()
            boolean r1 = m6152(r1)
            r2 = 1
            if (r1 == 0) goto L18
            goto L46
        L18:
            boolean r1 = r7.isEmpty()
            r3 = 0
            if (r1 == 0) goto L21
        L1f:
            r2 = r3
            goto L46
        L21:
            java.util.Iterator r1 = r7.iterator()
        L25:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L1f
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r5 = r6.getName()
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L46
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            boolean r4 = m6149(r5, r4, r6)
            if (r4 == 0) goto L25
        L46:
            java.util.ArrayList r6 = m6145(r6)
            java.util.Iterator r6 = r6.iterator()
        L4e:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L6e
            java.lang.Object r1 = r6.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            int r3 = m6165(r1, r7)
            if (r2 == 0) goto L66
            boolean r4 = m6151(r1)
            if (r4 != 0) goto L6a
        L66:
            r4 = 2500(0x9c4, float:3.503E-42)
            if (r3 < r4) goto L4e
        L6a:
            m6144(r0, r1)
            goto L4e
        L6e:
            java.util.Collection r6 = r0.values()
            r6.getClass()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.List r6 = p000.AbstractC0984xh.m6666(r6)
            return r6
    }

    /* JADX INFO: renamed from: τ */
    public static java.util.List m6161(java.lang.ClassLoader r4) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.List r1 = p000.C0903vb.f11215
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L44
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Class r2 = p000.AbstractC0093bx.m1082(r4, r2)
            if (r2 != 0) goto L1e
            goto Lb
        L1e:
            java.lang.reflect.Method[] r2 = r2.getDeclaredMethods()
            r2.getClass()
            java.util.List r2 = java.util.Arrays.asList(r2)
            r2.getClass()
            java.util.List r2 = m6148(r2)
            java.util.Iterator r2 = r2.iterator()
        L34:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lb
            java.lang.Object r3 = r2.next()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            m6144(r0, r3)
            goto L34
        L44:
            java.util.Collection r4 = r0.values()
            r4.getClass()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.List r4 = p000.AbstractC0984xh.m6666(r4)
            return r4
    }

    /* JADX INFO: renamed from: υ */
    public static void m6162(p000.EnumC0491kx r2, java.util.List r3) {
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L7
            goto L40
        L7:
            java.lang.Object r0 = p000.C0666ox.f8297
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.C0666ox.f8305
            boolean r0 = r0.get()
            if (r0 != 0) goto L12
            goto L40
        L12:
            p000.C0666ox.m4327(r2, r3)     // Catch: java.lang.Throwable -> L18
            s62 r3 = p000.s62.f9751     // Catch: java.lang.Throwable -> L18
            goto L1f
        L18:
            r3 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r3)
            r3 = r0
        L1f:
            java.lang.Throwable r3 = p000.fo1.m2190(r3)
            if (r3 == 0) goto L40
            java.lang.String r2 = r2.f6296
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "save methods failed, key="
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = ", err="
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            m6153(r2)
        L40:
            return
    }

    /* JADX INFO: renamed from: φ */
    public static int m6163(java.lang.Class r9) {
            java.lang.String r0 = r9.getName()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r1 = r0.toLowerCase(r1)
            r1.getClass()
            boolean r0 = m6152(r0)
            r2 = 0
            if (r0 == 0) goto L17
            r0 = 1600(0x640, float:2.242E-42)
            goto L18
        L17:
            r0 = r2
        L18:
            java.lang.String r3 = "~789325E9C4B2AA228E18888457F2F91C62869634665744D07384DF478FCE9D836A36818F2688688DA867779015D81E47DA7CF8302B44AD3872B71E805D46BAAA46"
            java.lang.String r3 = p000.jf0.m2957(r3)
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            boolean r3 = m6149(r4, r3, r9)
            if (r3 == 0) goto L2b
            int r0 = r0 + 1200
        L2b:
            java.util.ArrayList r3 = m6145(r9)
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L37
            r4 = r2
            goto L58
        L37:
            java.util.Iterator r3 = r3.iterator()
            r4 = r2
        L3c:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L58
            java.lang.Object r5 = r3.next()
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            boolean r5 = m6151(r5)
            if (r5 == 0) goto L3c
            int r4 = r4 + 1
            if (r4 < 0) goto L53
            goto L3c
        L53:
            p000.AbstractC1021yh.m6916()
            r9 = 0
            throw r9
        L58:
            r3 = 2
            if (r4 < r3) goto L5d
            int r0 = r0 + 800
        L5d:
            r5 = 4
            if (r4 < r5) goto L62
            int r0 = r0 + 600
        L62:
            java.lang.String r4 = "hometabdatasource"
            boolean r4 = p000.q02.m4654(r1, r4, r2)
            if (r4 == 0) goto L6c
            int r0 = r0 + 700
        L6c:
            java.lang.String r4 = "homepage"
            boolean r4 = p000.q02.m4654(r1, r4, r2)
            if (r4 == 0) goto L76
            int r0 = r0 + 200
        L76:
            java.lang.String r4 = "tab"
            boolean r1 = p000.q02.m4654(r1, r4, r2)
            if (r1 == 0) goto L80
            int r0 = r0 + 200
        L80:
            java.lang.reflect.Field[] r9 = r9.getDeclaredFields()     // Catch: java.lang.Throwable -> Lb1
            r9.getClass()     // Catch: java.lang.Throwable -> Lb1
            int r1 = r9.length     // Catch: java.lang.Throwable -> Lb1
            r4 = r2
            r5 = r4
        L8a:
            if (r4 >= r1) goto Lb8
            r6 = r9[r4]     // Catch: java.lang.Throwable -> Lb1
            int r7 = r6.getModifiers()     // Catch: java.lang.Throwable -> Lb1
            boolean r7 = java.lang.reflect.Modifier.isStatic(r7)     // Catch: java.lang.Throwable -> Lb1
            if (r7 == 0) goto Lb5
            java.lang.Class<java.util.List> r7 = java.util.List.class
            java.lang.Class r8 = r6.getType()     // Catch: java.lang.Throwable -> Lb1
            boolean r7 = r7.isAssignableFrom(r8)     // Catch: java.lang.Throwable -> Lb1
            if (r7 != 0) goto Lb3
            java.lang.Class<java.util.Map> r7 = java.util.Map.class
            java.lang.Class r6 = r6.getType()     // Catch: java.lang.Throwable -> Lb1
            boolean r6 = r7.isAssignableFrom(r6)     // Catch: java.lang.Throwable -> Lb1
            if (r6 == 0) goto Lb5
            goto Lb3
        Lb1:
            r9 = move-exception
            goto Lbd
        Lb3:
            int r5 = r5 + 1
        Lb5:
            int r4 = r4 + 1
            goto L8a
        Lb8:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> Lb1
            goto Lc3
        Lbd:
            eo1 r1 = new eo1
            r1.<init>(r9)
            r9 = r1
        Lc3:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            boolean r2 = r9 instanceof p000.eo1
            if (r2 == 0) goto Lcc
            r9 = r1
        Lcc:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r9 < r3) goto Ld6
            int r0 = r0 + 600
        Ld6:
            r1 = 5
            if (r9 < r1) goto Ldb
            int r0 = r0 + 600
        Ldb:
            return r0
    }

    /* JADX INFO: renamed from: χ */
    public static int m6164(java.lang.reflect.Method r3) {
            boolean r0 = m6151(r3)
            if (r0 != 0) goto L8
            r3 = 0
            return r3
        L8:
            java.lang.Class r0 = r3.getDeclaringClass()
            r0.getClass()
            int r0 = m6163(r0)
            int r1 = r0 + 800
            java.lang.Class r3 = r3.getReturnType()
            java.lang.Class<java.util.List> r2 = java.util.List.class
            boolean r3 = p000.ln0.m3626(r3, r2)
            if (r3 == 0) goto L24
            int r0 = r0 + 1000
            return r0
        L24:
            return r1
    }

    /* JADX INFO: renamed from: ψ */
    public static int m6165(java.lang.reflect.Method r3, java.util.LinkedHashSet r4) {
            boolean r0 = m6151(r3)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.Class r3 = r3.getDeclaringClass()
            java.lang.String r0 = r3.getName()
            java.util.List r2 = p000.C0903vb.f11215
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L1a
            r1 = 1000(0x3e8, float:1.401E-42)
        L1a:
            boolean r0 = m6152(r0)
            if (r0 == 0) goto L22
            int r1 = r1 + 1800
        L22:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L29
            goto L46
        L29:
            java.util.Iterator r4 = r4.iterator()
        L2d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L46
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            boolean r0 = m6149(r2, r0, r3)
            if (r0 == 0) goto L2d
            int r1 = r1 + 3000
        L46:
            return r1
    }
}
