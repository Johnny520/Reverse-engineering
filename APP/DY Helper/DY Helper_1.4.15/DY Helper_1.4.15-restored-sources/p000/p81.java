package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class p81 {

    /* JADX INFO: renamed from: α */
    public static final p000.p81 f8454 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.atomic.AtomicBoolean f8455 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.ConcurrentHashMap f8456 = null;

    static {
            p81 r0 = new p81
            r0.<init>()
            p000.p81.f8454 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.p81.f8455 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.p81.f8456 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.util.ArrayList m4387(java.lang.Class r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            if (r2 == 0) goto L14
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L14
            java.lang.Class r2 = p000.lz1.m3684(r2, r0)
            goto L5
        L14:
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static java.util.ArrayList m4388(java.lang.Class r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            if (r2 == 0) goto L1e
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L1e
            java.lang.reflect.Method[] r1 = r2.getDeclaredMethods()
            r1.getClass()
            p000.AbstractC0984xh.m6659(r0, r1)
            java.lang.Class r2 = r2.getSuperclass()
            goto L5
        L1e:
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static java.lang.Class m4389(java.util.List r4, p000.a80 r5) {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r4 = r4.iterator()
        Le:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r4.next()
            r3 = r2
            java.lang.Class r3 = (java.lang.Class) r3
            java.lang.String r3 = r3.getName()
            boolean r3 = r0.add(r3)
            if (r3 == 0) goto Le
            r1.add(r2)
            goto Le
        L29:
            java.util.ArrayList r4 = new java.util.ArrayList
            r0 = 10
            int r0 = p000.AbstractC1021yh.m6889(r1, r0)
            r4.<init>(r0)
            java.util.Iterator r0 = r1.iterator()
        L38:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L51
            java.lang.Object r1 = r0.next()
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.Object r2 = r5.invoke(r1)
            l91 r3 = new l91
            r3.<init>(r1, r2)
            r4.add(r3)
            goto L38
        L51:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L5a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L75
            java.lang.Object r0 = r4.next()
            r1 = r0
            l91 r1 = (p000.l91) r1
            java.lang.Object r1 = r1.f6503
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 <= 0) goto L5a
            r5.add(r0)
            goto L5a
        L75:
            java.util.Iterator r4 = r5.iterator()
            boolean r5 = r4.hasNext()
            r0 = 0
            if (r5 != 0) goto L82
            r5 = r0
            goto Lb1
        L82:
            java.lang.Object r5 = r4.next()
            boolean r1 = r4.hasNext()
            if (r1 != 0) goto L8d
            goto Lb1
        L8d:
            r1 = r5
            l91 r1 = (p000.l91) r1
            java.lang.Object r1 = r1.f6503
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        L98:
            java.lang.Object r2 = r4.next()
            r3 = r2
            l91 r3 = (p000.l91) r3
            java.lang.Object r3 = r3.f6503
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            if (r1 >= r3) goto Lab
            r5 = r2
            r1 = r3
        Lab:
            boolean r2 = r4.hasNext()
            if (r2 != 0) goto L98
        Lb1:
            l91 r5 = (p000.l91) r5
            if (r5 == 0) goto Lba
            java.lang.Object r4 = r5.f6502
            java.lang.Class r4 = (java.lang.Class) r4
            return r4
        Lba:
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public static java.util.List m4390(org.luckypray.dexkit.DexKitBridge r3, java.lang.ClassLoader r4, java.util.List r5) {
            m81 r0 = new m81     // Catch: java.lang.Throwable -> L3c
            r1 = 0
            r0.<init>(r1, r5)     // Catch: java.lang.Throwable -> L3c
            org.luckypray.dexkit.result.MethodDataList r3 = r3.findMethod(r0)     // Catch: java.lang.Throwable -> L3c
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3c
            r0.<init>()     // Catch: java.lang.Throwable -> L3c
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L3c
        L13:
            boolean r1 = r3.hasNext()     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L42
            java.lang.Object r1 = r3.next()     // Catch: java.lang.Throwable -> L3c
            org.luckypray.dexkit.result.MethodData r1 = (org.luckypray.dexkit.result.MethodData) r1     // Catch: java.lang.Throwable -> L3c
            java.lang.reflect.Method r1 = r1.getMethodInstance(r4)     // Catch: java.lang.Throwable -> L28
            java.lang.Class r1 = r1.getDeclaringClass()     // Catch: java.lang.Throwable -> L28
            goto L2f
        L28:
            r1 = move-exception
            eo1 r2 = new eo1     // Catch: java.lang.Throwable -> L3c
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L3c
            r1 = r2
        L2f:
            boolean r2 = r1 instanceof p000.eo1     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L34
            r1 = 0
        L34:
            java.lang.Class r1 = (java.lang.Class) r1     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L13
            r0.add(r1)     // Catch: java.lang.Throwable -> L3c
            goto L13
        L3c:
            r3 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r3)
        L42:
            java.lang.Throwable r3 = p000.fo1.m2190(r0)
            if (r3 != 0) goto L49
            goto L5e
        L49:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "DexKit findMethod 失败 strings="
            r4.<init>(r0)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "r49014e72aebeb11"
            p000.C0888ux.m5977(r5, r4, r3)
            jz r0 = p000.C0450jz.f5672
        L5e:
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public static java.lang.reflect.Constructor m4391(java.lang.Class r7) {
            java.lang.reflect.Constructor[] r7 = r7.getDeclaredConstructors()
            r7.getClass()
            int r0 = r7.length
            r1 = 0
            r2 = r1
        La:
            if (r2 >= r0) goto L67
            r3 = r7[r2]
            java.lang.Class[] r4 = r3.getParameterTypes()
            int r5 = r4.length
            r6 = 6
            if (r5 != r6) goto L64
            r5 = r4[r1]
            java.lang.Class r6 = java.lang.Integer.TYPE
            boolean r5 = p000.ln0.m3626(r5, r6)
            if (r5 == 0) goto L64
            r5 = 1
            r5 = r4[r5]
            java.lang.String r5 = r5.getName()
            java.lang.String r6 = "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"
            java.lang.String r6 = p000.jf0.m2957(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L64
            r5 = 2
            r5 = r4[r5]
            java.lang.String r5 = r5.getName()
            java.lang.String r6 = "~79285FCA4BF93B20DAE3F7561F6F9778B9C5EA825069EB9A10DE90A4B36D7D429A65E398626709F07A2B641B8F22F3"
            java.lang.String r6 = p000.jf0.m2957(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L64
            r5 = 3
            r5 = r4[r5]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            boolean r5 = p000.ln0.m3626(r5, r6)
            if (r5 == 0) goto L64
            r5 = 4
            r5 = r4[r5]
            boolean r5 = p000.ln0.m3626(r5, r6)
            if (r5 == 0) goto L64
            r5 = 5
            r4 = r4[r5]
            boolean r4 = p000.ln0.m3626(r4, r6)
            if (r4 == 0) goto L64
            return r3
        L64:
            int r2 = r2 + 1
            goto La
        L67:
            r7 = 0
            return r7
    }

    /* JADX INFO: renamed from: ζ */
    public static java.lang.reflect.Method m4392(java.lang.Class r5) {
            java.util.ArrayList r5 = m4388(r5)
            java.util.Iterator r5 = r5.iterator()
        L8:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L48
            java.lang.Object r0 = r5.next()
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            java.lang.Class[] r2 = r1.getParameterTypes()
            int r3 = r2.length
            r4 = 2
            if (r3 != r4) goto L8
            r3 = 0
            r3 = r2[r3]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            boolean r3 = r4.isAssignableFrom(r3)
            if (r3 == 0) goto L8
            r3 = 1
            r2 = r2[r3]
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "~79285FCA4BF93B20DAE3F7561F6F9778B9C5EA825069EB9A10DE90A4B36D7D429A65E398626709F07A2B641B8F22F3"
            java.lang.String r3 = p000.jf0.m2957(r3)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L8
            java.lang.Class r1 = r1.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            boolean r1 = p000.ln0.m3626(r1, r2)
            if (r1 == 0) goto L8
            goto L49
        L48:
            r0 = 0
        L49:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            return r0
    }

    /* JADX INFO: renamed from: η */
    public static java.lang.reflect.Constructor m4393(java.lang.Class r7) {
            java.lang.reflect.Constructor[] r7 = r7.getDeclaredConstructors()
            r7.getClass()
            int r0 = r7.length
            r1 = 0
            r2 = r1
        La:
            if (r2 >= r0) goto L4e
            r3 = r7[r2]
            java.lang.Class[] r4 = r3.getParameterTypes()
            int r5 = r4.length
            r6 = 3
            if (r5 != r6) goto L4b
            r5 = r4[r1]
            java.lang.String r5 = r5.getName()
            java.lang.String r6 = "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"
            java.lang.String r6 = p000.jf0.m2957(r6)
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L4b
            r5 = 1
            r5 = r4[r5]
            java.lang.String r5 = r5.getName()
            java.lang.String r6 = "androidx.fragment.app.FragmentActivity"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L4b
            r5 = 2
            r4 = r4[r5]
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = "~79285FCA4BF93B20DAE3F7561F6F9778B9C5EA825069EB9A10DE90A4B36D7D429A65E398626709F07A2B641B8F22F3"
            java.lang.String r5 = p000.jf0.m2957(r5)
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L4b
            return r3
        L4b:
            int r2 = r2 + 1
            goto La
        L4e:
            r7 = 0
            return r7
    }

    /* JADX INFO: renamed from: θ */
    public static java.lang.Object m4394(java.lang.Class r10, java.lang.Object r11, android.os.Bundle r12) {
            java.lang.reflect.Constructor[] r10 = r10.getDeclaredConstructors()
            r10.getClass()
            uh0 r0 = new uh0
            r1 = 25
            r0.<init>(r1)
            java.util.List r10 = p000.AbstractC0312g7.m2259(r10, r0)
            java.util.Iterator r10 = r10.iterator()
        L16:
            boolean r0 = r10.hasNext()
            r1 = 0
            if (r0 == 0) goto Lf4
            java.lang.Object r0 = r10.next()
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            java.lang.Class[] r2 = r0.getParameterTypes()
            r2.getClass()
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r2.length
            r3.<init>(r4)
            int r4 = r2.length
            r5 = 0
            r6 = r5
        L33:
            if (r6 >= r4) goto Ld1
            r7 = r2[r6]
            r7.getClass()
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L46
            java.lang.String r7 = ""
            goto Lca
        L46:
            java.lang.Class r8 = java.lang.Integer.TYPE
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto Lc6
            java.lang.Class<java.lang.Integer> r8 = java.lang.Integer.class
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L58
            goto Lc6
        L58:
            java.lang.Class r8 = java.lang.Boolean.TYPE
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto Lc3
            java.lang.Class<java.lang.Boolean> r8 = java.lang.Boolean.class
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L69
            goto Lc3
        L69:
            java.lang.Class r8 = java.lang.Long.TYPE
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto Lbc
            java.lang.Class<java.lang.Long> r8 = java.lang.Long.class
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L7a
            goto Lbc
        L7a:
            java.lang.Class<android.os.Bundle> r8 = android.os.Bundle.class
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L84
            r7 = r12
            goto Lca
        L84:
            java.lang.Class r8 = r11.getClass()
            boolean r8 = r7.isAssignableFrom(r8)
            if (r8 == 0) goto L90
            r7 = r11
            goto Lca
        L90:
            java.lang.Class<java.util.Map> r8 = java.util.Map.class
            boolean r9 = r8.isAssignableFrom(r7)
            if (r9 != 0) goto Lb6
            boolean r8 = r8.isAssignableFrom(r7)
            if (r8 == 0) goto L9f
            goto Lb6
        L9f:
            java.lang.Class<java.util.List> r8 = java.util.List.class
            boolean r9 = r8.isAssignableFrom(r7)
            if (r9 != 0) goto Lb0
            boolean r7 = r8.isAssignableFrom(r7)
            if (r7 == 0) goto Lae
            goto Lb0
        Lae:
            r7 = r1
            goto Lca
        Lb0:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            goto Lca
        Lb6:
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            goto Lca
        Lbc:
            r7 = 0
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            goto Lca
        Lc3:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto Lca
        Lc6:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
        Lca:
            r3.add(r7)
            int r6 = r6 + 1
            goto L33
        Ld1:
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.Object[] r2 = r3.toArray(r2)
            r3 = 1
            r0.setAccessible(r3)     // Catch: java.lang.Throwable -> Le5
            int r3 = r2.length     // Catch: java.lang.Throwable -> Le5
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)     // Catch: java.lang.Throwable -> Le5
            java.lang.Object r0 = r0.newInstance(r2)     // Catch: java.lang.Throwable -> Le5
            goto Lec
        Le5:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        Lec:
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto Lf1
            goto Lf2
        Lf1:
            r1 = r0
        Lf2:
            if (r1 == 0) goto L16
        Lf4:
            return r1
    }

    /* JADX INFO: renamed from: ι */
    public static boolean m4395(java.lang.Object r2, android.content.Context r3, java.lang.Object r4) {
            java.lang.Class r0 = r2.getClass()
            java.lang.reflect.Method r0 = m4392(r0)
            if (r0 != 0) goto L1d
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "未找到 execute(Context, SharePackage): "
            java.lang.String r2 = r3.concat(r2)
            m4397(r2)
            r2 = 0
            return r2
        L1d:
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4}     // Catch: java.lang.Throwable -> L2b
            r0.invoke(r2, r3)     // Catch: java.lang.Throwable -> L2b
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L2b
            goto L32
        L2b:
            r2 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r2)
            r2 = r3
        L32:
            java.lang.Throwable r3 = p000.fo1.m2190(r2)
            if (r3 != 0) goto L39
            goto L42
        L39:
            java.lang.String r2 = "执行原 Action.execute 失败"
            java.lang.String r4 = "r49014e72aebeb11"
            p000.C0888ux.m5977(r4, r2, r3)
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
        L42:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            return r2
    }

    /* JADX INFO: renamed from: κ */
    public static java.lang.Class m4396(java.lang.ClassLoader r1, java.lang.String r2) {
            r0 = 0
            java.lang.Class r1 = java.lang.Class.forName(r2, r0, r1)     // Catch: java.lang.Throwable -> L6
            goto Ld
        L6:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        Ld:
            boolean r2 = r1 instanceof p000.eo1
            if (r2 == 0) goto L12
            r1 = 0
        L12:
            java.lang.Class r1 = (java.lang.Class) r1
            return r1
    }

    /* JADX INFO: renamed from: λ */
    public static void m4397(java.lang.String r2) {
            r0 = 0
            java.lang.String r1 = "r49014e72aebeb11"
            p000.C0888ux.m5977(r1, r2, r0)
            return
    }

    /* JADX INFO: renamed from: μ */
    public static final boolean m4398(android.content.Context r23, java.lang.Object r24, java.lang.String r25, p000.n81 r26) {
            r23.getClass()
            r24.getClass()
            r26.getClass()
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r0 = p000.ln0.m3626(r0, r1)
            r6 = 1
            if (r0 != 0) goto L33
            android.os.Handler r7 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r7.<init>(r0)
            vg0 r0 = new vg0
            r5 = 2
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r0.<init>(r1, r2, r3, r4, r5)
            r7.post(r0)
            return r6
        L33:
            r1 = r24
            r3 = r25
            java.lang.Class r0 = r1.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            if (r0 != 0) goto L48
            java.lang.ClassLoader r0 = r23.getClassLoader()
            r0.getClass()
        L48:
            r2 = r0
            java.lang.String r0 = "~79285FCA4BF93B20DAE3F7561F6F9778B9C5EA825069EB9A10DE90A4B36D7D429A65E398626709F07A2B641B8F22F3"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.Class r4 = m4396(r2, r0)
            r8 = 0
            java.lang.String r5 = "type_common"
            java.lang.String r10 = ""
            java.lang.String r11 = "button_type"
            java.lang.String r12 = "share_panel_type"
            java.lang.String r13 = "from_page"
            java.lang.String r14 = "enter_from"
            if (r4 != 0) goto L67
            r22 = r2
        L64:
            r9 = 0
            goto L2b3
        L67:
            android.os.Bundle r15 = new android.os.Bundle
            r15.<init>()
            r15.putString(r14, r3)
            r15.putString(r13, r3)
            r15.putString(r12, r5)
            r15.putInt(r11, r8)
            java.lang.Class[] r0 = r4.getDeclaredClasses()
            r0.getClass()
            int r9 = r0.length
            r6 = r8
        L81:
            if (r6 >= r9) goto Lac
            r17 = r0[r6]
            java.lang.String r8 = r17.getSimpleName()
            r19 = r0
            java.lang.String r0 = "Builder"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto La9
            java.lang.String r0 = r17.getName()
            java.lang.String r8 = "$Builder"
            r20 = r6
            r6 = 0
            boolean r0 = p000.x02.m6479(r0, r8, r6)
            if (r0 == 0) goto La3
            goto La9
        La3:
            int r6 = r20 + 1
            r0 = r19
            r8 = 0
            goto L81
        La9:
            r0 = r17
            goto Lad
        Lac:
            r0 = 0
        Lad:
            if (r0 != 0) goto Lb4
        Laf:
            r22 = r2
        Lb1:
            r0 = 0
            goto L266
        Lb4:
            java.lang.Object r6 = m4394(r0, r1, r15)
            if (r6 != 0) goto Lbb
            goto Laf
        Lbb:
            m4403(r6, r15)
            java.lang.Class r8 = r1.getClass()
            java.util.ArrayList r8 = m4387(r8)
            java.util.Iterator r8 = r8.iterator()
        Lca:
            boolean r9 = r8.hasNext()
            r17 = r0
            java.lang.String r0 = "aid"
            if (r9 == 0) goto Lee
            java.lang.Object r9 = r8.next()
            r19 = r9
            java.lang.reflect.Field r19 = (java.lang.reflect.Field) r19
            r20 = r8
            java.lang.String r8 = r19.getName()
            boolean r8 = p000.ln0.m3626(r8, r0)
            if (r8 == 0) goto Le9
            goto Lef
        Le9:
            r0 = r17
            r8 = r20
            goto Lca
        Lee:
            r9 = 0
        Lef:
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            if (r9 == 0) goto L10a
            r7 = 1
            r9.setAccessible(r7)     // Catch: java.lang.Throwable -> L10a
            java.lang.Object r7 = r9.get(r1)     // Catch: java.lang.Throwable -> L10a
            if (r7 == 0) goto L104
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L10a
            goto L105
        L104:
            r7 = 0
        L105:
            if (r7 != 0) goto L174
        L107:
            r7 = r10
            goto L174
        L10a:
            java.lang.Class r7 = r1.getClass()
            java.util.ArrayList r7 = m4388(r7)
            java.util.Iterator r7 = r7.iterator()
        L116:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L158
            java.lang.Object r9 = r7.next()
            r19 = r9
            java.lang.reflect.Method r19 = (java.lang.reflect.Method) r19
            r20 = r7
            java.lang.Class[] r7 = r19.getParameterTypes()
            r7.getClass()
            int r7 = r7.length
            if (r7 != 0) goto L155
            java.lang.Class r7 = r19.getReturnType()
            boolean r7 = p000.ln0.m3626(r7, r8)
            if (r7 == 0) goto L155
            java.lang.String r7 = r19.getName()
            r21 = r9
            java.lang.String r9 = "getAid"
            boolean r7 = p000.ln0.m3626(r7, r9)
            if (r7 != 0) goto L15a
            java.lang.String r7 = r19.getName()
            java.lang.String r9 = "getAidP"
            boolean r7 = p000.ln0.m3626(r7, r9)
            if (r7 == 0) goto L155
            goto L15a
        L155:
            r7 = r20
            goto L116
        L158:
            r21 = 0
        L15a:
            r7 = r21
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            if (r7 == 0) goto L107
            r9 = 1
            r7.setAccessible(r9)     // Catch: java.lang.Throwable -> L107
            r9 = 0
            java.lang.Object r7 = r7.invoke(r1, r9)     // Catch: java.lang.Throwable -> L107
            if (r7 == 0) goto L170
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L107
            goto L171
        L170:
            r7 = 0
        L171:
            if (r7 != 0) goto L174
            goto L107
        L174:
            java.lang.Class r9 = r6.getClass()
            java.util.ArrayList r9 = m4387(r9)
            java.util.Iterator r9 = r9.iterator()
        L180:
            boolean r19 = r9.hasNext()
            if (r19 == 0) goto L224
            java.lang.Object r19 = r9.next()
            r20 = r7
            r7 = r19
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            r19 = r9
            java.lang.Class r9 = r7.getType()
            boolean r9 = p000.ln0.m3626(r9, r8)
            if (r9 == 0) goto L21e
            java.lang.String r9 = r7.getName()
            r9.getClass()
            r21 = r8
            java.util.Locale r8 = java.util.Locale.ROOT
            java.lang.String r8 = r9.toLowerCase(r8)
            r8.getClass()
            java.lang.String r9 = "itemtype"
            r22 = r2
            r2 = 0
            boolean r9 = p000.q02.m4654(r8, r9, r2)
            if (r9 != 0) goto L202
            java.lang.String r9 = "type"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L1c2
            goto L202
        L1c2:
            java.lang.String r9 = "identifier"
            boolean r9 = p000.q02.m4654(r8, r9, r2)
            if (r9 != 0) goto L1ff
            java.lang.String r9 = "id"
            boolean r9 = r9.equals(r8)
            if (r9 != 0) goto L1ff
            boolean r9 = p000.q02.m4654(r8, r0, r2)
            if (r9 == 0) goto L1d9
            goto L1ff
        L1d9:
            java.lang.String r9 = "title"
            boolean r9 = p000.q02.m4654(r8, r9, r2)
            if (r9 == 0) goto L1e3
        L1e1:
            r2 = r10
            goto L204
        L1e3:
            java.lang.String r9 = "desc"
            boolean r9 = p000.q02.m4654(r8, r9, r2)
            if (r9 != 0) goto L1e1
            java.lang.String r9 = "description"
            boolean r9 = p000.q02.m4654(r8, r9, r2)
            if (r9 == 0) goto L1f4
            goto L1e1
        L1f4:
            java.lang.String r9 = "url"
            boolean r8 = p000.q02.m4654(r8, r9, r2)
            if (r8 == 0) goto L1fd
            goto L1e1
        L1fd:
            r2 = 0
            goto L204
        L1ff:
            r2 = r20
            goto L204
        L202:
            java.lang.String r2 = "aweme"
        L204:
            if (r2 != 0) goto L210
        L206:
            r9 = r19
            r7 = r20
            r8 = r21
            r2 = r22
            goto L180
        L210:
            r9 = 1
            r7.setAccessible(r9)     // Catch: java.lang.Throwable -> L206
            java.lang.Object r8 = r7.get(r6)     // Catch: java.lang.Throwable -> L206
            if (r8 != 0) goto L206
            r7.set(r6, r2)     // Catch: java.lang.Throwable -> L206
            goto L206
        L21e:
            r9 = r19
            r7 = r20
            goto L180
        L224:
            r22 = r2
            java.lang.reflect.Method[] r0 = r17.getDeclaredMethods()
            r0.getClass()
            int r2 = r0.length
            r7 = 0
        L22f:
            if (r7 >= r2) goto L24b
            r8 = r0[r7]
            java.lang.Class[] r9 = r8.getParameterTypes()
            r9.getClass()
            int r9 = r9.length
            if (r9 != 0) goto L248
            java.lang.Class r9 = r8.getReturnType()
            boolean r9 = r4.isAssignableFrom(r9)
            if (r9 == 0) goto L248
            goto L24c
        L248:
            int r7 = r7 + 1
            goto L22f
        L24b:
            r8 = 0
        L24c:
            if (r8 != 0) goto L250
        L24e:
            goto Lb1
        L250:
            r9 = 1
            r8.setAccessible(r9)     // Catch: java.lang.Throwable -> L25a
            r9 = 0
            java.lang.Object r0 = r8.invoke(r6, r9)     // Catch: java.lang.Throwable -> L25a
            goto L261
        L25a:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L261:
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto L266
            goto L24e
        L266:
            if (r0 == 0) goto L26d
            m4403(r0, r15)
        L26b:
            r9 = r0
            goto L2b3
        L26d:
            java.lang.Object r0 = m4394(r4, r1, r15)
            if (r0 == 0) goto L277
            m4403(r0, r15)
            goto L26b
        L277:
            java.lang.String r0 = "sun.misc.Unsafe"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L2a2
            java.lang.String r2 = "theUnsafe"
            java.lang.reflect.Field r2 = r0.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L2a2
            r9 = 1
            r2.setAccessible(r9)     // Catch: java.lang.Throwable -> L2a2
            r9 = 0
            java.lang.Object r2 = r2.get(r9)     // Catch: java.lang.Throwable -> L2a2
            java.lang.String r6 = "allocateInstance"
            java.lang.Class<java.lang.Class> r7 = java.lang.Class.class
            java.lang.Class[] r7 = new java.lang.Class[]{r7}     // Catch: java.lang.Throwable -> L2a2
            java.lang.reflect.Method r0 = r0.getMethod(r6, r7)     // Catch: java.lang.Throwable -> L2a2
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L2a2
            java.lang.Object r0 = r0.invoke(r2, r4)     // Catch: java.lang.Throwable -> L2a2
            r9 = r0
            goto L2a9
        L2a2:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r9 = r2
        L2a9:
            boolean r0 = r9 instanceof p000.eo1
            if (r0 == 0) goto L2ae
            r9 = 0
        L2ae:
            if (r9 == 0) goto L64
            m4403(r9, r15)
        L2b3:
            java.lang.String r4 = "click_share_button"
            java.lang.String r2 = ""
            if (r9 != 0) goto L2be
            r6 = 0
            r8 = 0
            r9 = 0
            goto L3e5
        L2be:
            java.lang.Class r0 = r9.getClass()
            java.util.ArrayList r0 = m4388(r0)
            java.util.Iterator r0 = r0.iterator()
        L2ca:
            boolean r6 = r0.hasNext()
            java.lang.Class<android.os.Bundle> r7 = android.os.Bundle.class
            if (r6 == 0) goto L2ff
            java.lang.Object r6 = r0.next()
            r8 = r6
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            java.lang.String r15 = r8.getName()
            r17 = r0
            java.lang.String r0 = "getExtras"
            boolean r0 = p000.ln0.m3626(r15, r0)
            if (r0 == 0) goto L2fc
            java.lang.Class[] r0 = r8.getParameterTypes()
            r0.getClass()
            int r0 = r0.length
            if (r0 != 0) goto L2fc
            java.lang.Class r0 = r8.getReturnType()
            boolean r0 = r7.isAssignableFrom(r0)
            if (r0 == 0) goto L2fc
            goto L300
        L2fc:
            r0 = r17
            goto L2ca
        L2ff:
            r6 = 0
        L300:
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r6 == 0) goto L328
            r8 = 1
            r6.setAccessible(r8)     // Catch: java.lang.Throwable -> L318
            r8 = 0
            java.lang.Object r0 = r6.invoke(r9, r8)     // Catch: java.lang.Throwable -> L314
            boolean r6 = r0 instanceof android.os.Bundle     // Catch: java.lang.Throwable -> L314
            if (r6 == 0) goto L316
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch: java.lang.Throwable -> L314
            goto L320
        L314:
            r0 = move-exception
            goto L31a
        L316:
            r0 = r8
            goto L320
        L318:
            r0 = move-exception
            r8 = 0
        L31a:
            eo1 r6 = new eo1
            r6.<init>(r0)
            r0 = r6
        L320:
            boolean r6 = r0 instanceof p000.eo1
            if (r6 == 0) goto L325
            r0 = r8
        L325:
            android.os.Bundle r0 = (android.os.Bundle) r0
            goto L32a
        L328:
            r8 = 0
            r0 = r8
        L32a:
            if (r0 == 0) goto L32d
            goto L378
        L32d:
            java.lang.Class r0 = r9.getClass()
            java.util.ArrayList r0 = m4387(r0)
            java.util.Iterator r0 = r0.iterator()
        L339:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L351
            java.lang.Object r6 = r0.next()
            r15 = r6
            java.lang.reflect.Field r15 = (java.lang.reflect.Field) r15
            java.lang.Class r15 = r15.getType()
            boolean r15 = r7.isAssignableFrom(r15)
            if (r15 == 0) goto L339
            goto L352
        L351:
            r6 = r8
        L352:
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            if (r6 == 0) goto L377
            r7 = 1
            r6.setAccessible(r7)     // Catch: java.lang.Throwable -> L365
            java.lang.Object r0 = r6.get(r9)     // Catch: java.lang.Throwable -> L365
            boolean r6 = r0 instanceof android.os.Bundle     // Catch: java.lang.Throwable -> L365
            if (r6 == 0) goto L367
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch: java.lang.Throwable -> L365
            goto L36f
        L365:
            r0 = move-exception
            goto L369
        L367:
            r0 = r8
            goto L36f
        L369:
            eo1 r6 = new eo1
            r6.<init>(r0)
            r0 = r6
        L36f:
            boolean r6 = r0 instanceof p000.eo1
            if (r6 == 0) goto L374
            r0 = r8
        L374:
            android.os.Bundle r0 = (android.os.Bundle) r0
            goto L378
        L377:
            r0 = r8
        L378:
            if (r0 != 0) goto L382
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            m4403(r9, r0)
        L382:
            m4399(r0, r14, r3)
            m4399(r0, r13, r3)
            java.lang.String r6 = "previous_page"
            m4399(r0, r6, r3)
            java.lang.String r6 = "enter_method"
            m4399(r0, r6, r4)
            m4399(r0, r12, r5)
            java.lang.String r5 = "scene"
            m4399(r0, r5, r10)
            java.lang.String r5 = "action_page"
            m4399(r0, r5, r10)
            java.lang.String r5 = "search_id"
            m4399(r0, r5, r10)
            java.lang.String r5 = "search_result_id"
            m4399(r0, r5, r10)
            java.lang.String r5 = "search_keyword"
            m4399(r0, r5, r10)
            java.lang.String r5 = "btm_id"
            m4399(r0, r5, r10)
            java.lang.String r5 = "video_source"
            m4399(r0, r5, r2)
            java.lang.String r5 = "is_meteormode"
            boolean r6 = r0.containsKey(r5)
            if (r6 != 0) goto L3c5
            r6 = 0
            r0.putInt(r5, r6)
            goto L3c6
        L3c5:
            r6 = 0
        L3c6:
            boolean r5 = r0.containsKey(r11)
            if (r5 != 0) goto L3cf
            r0.putInt(r11, r6)
        L3cf:
            java.lang.String r5 = "recommend_rank"
            boolean r7 = r0.containsKey(r5)
            if (r7 != 0) goto L3da
            r0.putInt(r5, r6)
        L3da:
            java.lang.String r5 = "is_first_level_not_interesting_action"
            boolean r7 = r0.containsKey(r5)
            if (r7 != 0) goto L3e5
            r0.putBoolean(r5, r6)
        L3e5:
            if (r9 != 0) goto L3ed
            java.lang.String r0 = "SharePackage 构造失败"
            m4397(r0)
            return r6
        L3ed:
            int[] r0 = p000.o81.f7984
            int r5 = r26.ordinal()
            r0 = r0[r5]
            n81 r5 = p000.n81.f7458
            r7 = 1
            if (r0 != r7) goto L407
            java.lang.String r0 = "recommend_page"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L404
            r0 = r5
            goto L409
        L404:
            n81 r0 = p000.n81.f7457
            goto L409
        L407:
            r0 = r26
        L409:
            java.lang.String r6 = "r49014e72aebeb11"
            p81 r7 = p000.p81.f8454
            if (r0 != r5) goto L4ab
            r0 = r23
        L411:
            if (r0 == 0) goto L427
            boolean r10 = r0 instanceof android.app.Activity
            if (r10 == 0) goto L41a
            android.app.Activity r0 = (android.app.Activity) r0
            goto L428
        L41a:
            boolean r10 = r0 instanceof android.content.ContextWrapper
            if (r10 == 0) goto L425
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L411
        L425:
            r0 = r8
            goto L411
        L427:
            r0 = r8
        L428:
            if (r0 != 0) goto L436
            java.lang.String r0 = "notRelated 需要 Activity Context"
            m4397(r0)
            r0 = 0
            r11 = r23
            r10 = r22
            goto L49e
        L436:
            java.lang.String r8 = "androidx.fragment.app.FragmentActivity"
            r10 = r22
            java.lang.Class r8 = m4396(r10, r8)
            if (r8 != 0) goto L442
            r8 = 0
            goto L446
        L442:
            boolean r8 = r8.isInstance(r0)
        L446:
            if (r8 != 0) goto L451
            java.lang.String r0 = "notRelated 需要 FragmentActivity"
            m4397(r0)
        L44d:
            r0 = 0
            r11 = r23
            goto L49e
        L451:
            r8 = 0
            java.lang.Class r11 = r7.m4405(r10, r8)
            if (r11 != 0) goto L45e
            java.lang.String r0 = "未找到 notRelated Action"
            m4397(r0)
            goto L44d
        L45e:
            java.lang.reflect.Constructor r8 = m4393(r11)
            if (r8 != 0) goto L472
            java.lang.String r0 = r11.getName()
            java.lang.String r8 = "未找到 notRelated 构造方法: "
            java.lang.String r0 = r8.concat(r0)
            m4397(r0)
            goto L44d
        L472:
            r11 = 1
            r8.setAccessible(r11)     // Catch: java.lang.Throwable -> L47f
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0, r9}     // Catch: java.lang.Throwable -> L47f
            java.lang.Object r0 = r8.newInstance(r0)     // Catch: java.lang.Throwable -> L47f
            goto L486
        L47f:
            r0 = move-exception
            eo1 r8 = new eo1
            r8.<init>(r0)
            r0 = r8
        L486:
            java.lang.Throwable r8 = p000.fo1.m2190(r0)
            if (r8 != 0) goto L496
            r0.getClass()
            r11 = r23
            boolean r0 = m4395(r0, r11, r9)
            goto L49e
        L496:
            r11 = r23
            java.lang.String r0 = "构造 notRelated Action 失败"
            p000.C0888ux.m5977(r6, r0, r8)
            r0 = 0
        L49e:
            if (r0 == 0) goto L4a3
            r16 = 1
            return r16
        L4a3:
            r8 = r26
            if (r8 != r5) goto L4a9
            r8 = 0
            return r8
        L4a9:
            r8 = 0
            goto L4b0
        L4ab:
            r11 = r23
            r10 = r22
            goto L4a9
        L4b0:
            java.lang.Class r0 = r7.m4404(r10, r8)
            if (r0 != 0) goto L4bd
            java.lang.String r0 = "未找到 DislikeAction"
            m4397(r0)
        L4bb:
            r8 = 0
            goto L50a
        L4bd:
            java.lang.reflect.Constructor r7 = m4391(r0)
            if (r7 != 0) goto L4d1
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "未找到 DislikeAction 构造方法: "
            java.lang.String r0 = r1.concat(r0)
            m4397(r0)
            goto L4bb
        L4d1:
            r8 = 1
            r7.setAccessible(r8)     // Catch: java.lang.Throwable -> L4eb
            r18 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)     // Catch: java.lang.Throwable -> L4e8
            r5 = r2
            r2 = r9
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2, r3, r4, r5}     // Catch: java.lang.Throwable -> L4e6
            java.lang.Object r0 = r7.newInstance(r0)     // Catch: java.lang.Throwable -> L4e6
            goto L4f5
        L4e6:
            r0 = move-exception
            goto L4ef
        L4e8:
            r0 = move-exception
            r2 = r9
            goto L4ef
        L4eb:
            r0 = move-exception
            r2 = r9
            r18 = 0
        L4ef:
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L4f5:
            java.lang.Throwable r1 = p000.fo1.m2190(r0)
            if (r1 != 0) goto L503
            r0.getClass()
            boolean r8 = m4395(r0, r11, r2)
            goto L50a
        L503:
            java.lang.String r0 = "构造 DislikeAction 失败"
            p000.C0888ux.m5977(r6, r0, r1)
            r8 = r18
        L50a:
            return r8
    }

    /* JADX INFO: renamed from: ν */
    public static void m4399(android.os.Bundle r1, java.lang.String r2, java.lang.String r3) {
            boolean r0 = r1.containsKey(r2)
            if (r0 == 0) goto Le
            java.lang.Object r0 = r1.get(r2)
            if (r0 != 0) goto Ld
            goto Le
        Ld:
            return
        Le:
            r1.putString(r2, r3)
            return
    }

    /* JADX INFO: renamed from: ξ */
    public static java.lang.Class m4400(p000.EnumC0491kx r1, java.lang.ClassLoader r2, p000.a80 r3) {
            java.lang.Object r0 = p000.C0666ox.f8297     // Catch: java.lang.Throwable -> L7
            java.util.List r1 = p000.C0666ox.m4321(r1, r2)     // Catch: java.lang.Throwable -> L7
            goto Le
        L7:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        Le:
            boolean r2 = r1 instanceof p000.eo1
            if (r2 == 0) goto L13
            r1 = 0
        L13:
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L19
            jz r1 = p000.C0450jz.f5672
        L19:
            java.lang.Class r1 = m4389(r1, r3)
            return r1
    }

    /* JADX INFO: renamed from: ρ */
    public static int m4401(java.lang.Class r4) {
            java.lang.String r0 = r4.getName()
            java.lang.String r1 = "~789325E9C4B2AA228E18888457F2F91C62869634665744D0739FD84B98DBD2867A6B9B84318D72C0AB2C5BBC54D41867D271D27F1B4C8D3B6EAE18A46E40BCBD51"
            java.lang.String r1 = p000.jf0.m2957(r1)
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L14
            r0 = 5000(0x1388, float:7.006E-42)
            goto L15
        L14:
            r0 = r1
        L15:
            java.lang.String r2 = r4.getName()
            java.lang.String r3 = "DislikeAction"
            boolean r1 = p000.q02.m4654(r2, r3, r1)
            if (r1 == 0) goto L23
            int r0 = r0 + 1000
        L23:
            java.lang.reflect.Constructor r1 = m4391(r4)
            if (r1 == 0) goto L2b
            int r0 = r0 + 3000
        L2b:
            java.lang.reflect.Method r4 = m4392(r4)
            if (r4 == 0) goto L33
            int r0 = r0 + 1000
        L33:
            return r0
    }

    /* JADX INFO: renamed from: σ */
    public static int m4402(java.lang.Class r2) {
            java.lang.String r0 = r2.getName()
            java.lang.String r1 = "X.C845060Wxx"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lf
            r0 = 2000(0x7d0, float:2.803E-42)
            goto L10
        Lf:
            r0 = 0
        L10:
            java.lang.reflect.Constructor r1 = m4393(r2)
            if (r1 == 0) goto L18
            int r0 = r0 + 4000
        L18:
            java.lang.reflect.Method r2 = m4392(r2)
            if (r2 == 0) goto L20
            int r0 = r0 + 1000
        L20:
            return r0
    }

    /* JADX INFO: renamed from: τ */
    public static void m4403(java.lang.Object r4, android.os.Bundle r5) {
            java.lang.Class r0 = r4.getClass()
            java.util.ArrayList r0 = m4387(r0)
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Field r1 = (java.lang.reflect.Field) r1
            java.lang.Class<android.os.Bundle> r2 = android.os.Bundle.class
            java.lang.Class r3 = r1.getType()
            boolean r2 = r2.isAssignableFrom(r3)
            if (r2 == 0) goto Lc
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> Lc
            r1.set(r4, r5)     // Catch: java.lang.Throwable -> Lc
            goto Lc
        L2c:
            return
    }

    /* JADX INFO: renamed from: ο */
    public final java.lang.Class m4404(java.lang.ClassLoader r21, boolean r22) {
            r20 = this;
            r1 = r21
            java.util.concurrent.ConcurrentHashMap r2 = p000.p81.f8456
            java.lang.String r3 = "dislike"
            java.lang.Object r0 = r2.get(r3)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto Lf
            return r0
        Lf:
            ny0 r4 = new ny0
            r10 = 0
            r11 = 7
            r5 = 1
            java.lang.Class<p81> r7 = p000.p81.class
            java.lang.String r8 = "scoreDislikeActionClass"
            java.lang.String r9 = "scoreDislikeActionClass(Ljava/lang/Class;)I"
            r6 = r20
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            kx r0 = p000.EnumC0491kx.f6240
            java.lang.Class r4 = m4400(r0, r1, r4)
            if (r4 == 0) goto L2b
            r2.put(r3, r4)
            return r4
        L2b:
            if (r22 == 0) goto L74
            java.lang.Object r4 = p000.C0666ox.f8297
            java.util.concurrent.atomic.AtomicBoolean r4 = p000.C0666ox.f8305
            boolean r4 = r4.get()
            if (r4 == 0) goto L74
            java.lang.String r4 = "定位原始不感兴趣 DislikeAction"
            t20 r5 = new t20     // Catch: java.lang.Throwable -> L49
            r6 = 22
            r14 = r20
            r5.<init>(r1, r14, r6)     // Catch: java.lang.Throwable -> L47
            java.util.List r0 = p000.C0666ox.m4314(r0, r1, r4, r5)     // Catch: java.lang.Throwable -> L47
            goto L52
        L47:
            r0 = move-exception
            goto L4c
        L49:
            r0 = move-exception
            r14 = r20
        L4c:
            eo1 r4 = new eo1
            r4.<init>(r0)
            r0 = r4
        L52:
            boolean r4 = r0 instanceof p000.eo1
            if (r4 == 0) goto L58
            jz r0 = p000.C0450jz.f5672
        L58:
            java.util.List r0 = (java.util.List) r0
            ny0 r12 = new ny0
            r18 = 0
            r19 = 8
            r13 = 1
            java.lang.Class<p81> r15 = p000.p81.class
            java.lang.String r16 = "scoreDislikeActionClass"
            java.lang.String r17 = "scoreDislikeActionClass(Ljava/lang/Class;)I"
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Class r0 = m4389(r0, r12)
            if (r0 == 0) goto L74
            r2.put(r3, r0)
            return r0
        L74:
            java.lang.String r0 = "~789325E9C4B2AA228E18888457F2F91C62869634665744D0739FD84B98DBD2867A6B9B84318D72C0AB2C5BBC54D41867D271D27F1B4C8D3B6EAE18A46E40BCBD51"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.Class r0 = m4396(r1, r0)
            r1 = 0
            if (r0 == 0) goto L8f
            int r4 = m4401(r0)
            if (r4 <= 0) goto L88
            goto L89
        L88:
            r0 = r1
        L89:
            if (r0 == 0) goto L8f
            r2.put(r3, r0)
            return r0
        L8f:
            return r1
    }

    /* JADX INFO: renamed from: π */
    public final java.lang.Class m4405(java.lang.ClassLoader r21, boolean r22) {
            r20 = this;
            r1 = r21
            java.util.concurrent.ConcurrentHashMap r2 = p000.p81.f8456
            java.lang.String r3 = "not_related"
            java.lang.Object r0 = r2.get(r3)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto Lf
            return r0
        Lf:
            ny0 r4 = new ny0
            r10 = 0
            r11 = 9
            r5 = 1
            java.lang.Class<p81> r7 = p000.p81.class
            java.lang.String r8 = "scoreNotRelatedActionClass"
            java.lang.String r9 = "scoreNotRelatedActionClass(Ljava/lang/Class;)I"
            r6 = r20
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            kx r0 = p000.EnumC0491kx.f6241
            java.lang.Class r4 = m4400(r0, r1, r4)
            if (r4 == 0) goto L2c
            r2.put(r3, r4)
            return r4
        L2c:
            if (r22 == 0) goto L75
            java.lang.Object r4 = p000.C0666ox.f8297
            java.util.concurrent.atomic.AtomicBoolean r4 = p000.C0666ox.f8305
            boolean r4 = r4.get()
            if (r4 == 0) goto L75
            java.lang.String r4 = "定位推荐页 notRelated 不感兴趣 Action"
            t20 r5 = new t20     // Catch: java.lang.Throwable -> L4a
            r6 = 21
            r14 = r20
            r5.<init>(r1, r14, r6)     // Catch: java.lang.Throwable -> L48
            java.util.List r0 = p000.C0666ox.m4314(r0, r1, r4, r5)     // Catch: java.lang.Throwable -> L48
            goto L53
        L48:
            r0 = move-exception
            goto L4d
        L4a:
            r0 = move-exception
            r14 = r20
        L4d:
            eo1 r4 = new eo1
            r4.<init>(r0)
            r0 = r4
        L53:
            boolean r4 = r0 instanceof p000.eo1
            if (r4 == 0) goto L59
            jz r0 = p000.C0450jz.f5672
        L59:
            java.util.List r0 = (java.util.List) r0
            ny0 r12 = new ny0
            r18 = 0
            r19 = 10
            r13 = 1
            java.lang.Class<p81> r15 = p000.p81.class
            java.lang.String r16 = "scoreNotRelatedActionClass"
            java.lang.String r17 = "scoreNotRelatedActionClass(Ljava/lang/Class;)I"
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            java.lang.Class r0 = m4389(r0, r12)
            if (r0 == 0) goto L75
            r2.put(r3, r0)
            return r0
        L75:
            java.lang.String r0 = "X.C845060Wxx"
            java.lang.Class r0 = m4396(r1, r0)
            r1 = 0
            if (r0 == 0) goto L8c
            int r4 = m4402(r0)
            if (r4 <= 0) goto L85
            goto L86
        L85:
            r0 = r1
        L86:
            if (r0 == 0) goto L8c
            r2.put(r3, r0)
            return r0
        L8c:
            return r1
    }
}
