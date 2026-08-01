package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class l41 {

    /* JADX INFO: renamed from: α */
    public static final p000.l41 f6416 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.Set f6417 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.Set f6418 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.Set f6419 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.util.Set f6420 = null;

    /* JADX INFO: renamed from: ζ */
    public static final java.util.Set f6421 = null;

    static {
            l41 r0 = new l41
            r0.<init>()
            p000.l41.f6416 = r0
            java.lang.String r0 = "LJI"
            java.lang.String r1 = "getCacheCount"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.Set r0 = p000.AbstractC0312g7.m2263(r0)
            p000.l41.f6417 = r0
            java.lang.String r0 = "LJJI"
            java.lang.String r1 = "setCacheCount"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.Set r0 = p000.AbstractC0312g7.m2263(r0)
            p000.l41.f6418 = r0
            java.lang.String r0 = "LJJIIJZLJL"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.Set r0 = p000.AbstractC0312g7.m2263(r0)
            p000.l41.f6419 = r0
            java.lang.String r0 = "kr0"
            java.lang.String r2 = "adjustCacheCount"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2}
            java.util.Set r0 = p000.AbstractC0312g7.m2263(r0)
            p000.l41.f6420 = r0
            java.lang.String r0 = "renderCacheCount"
            java.lang.String r1 = "updateCacheCountSelection"
            java.lang.String r2 = "wr0"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            java.util.Set r0 = p000.AbstractC0312g7.m2263(r0)
            p000.l41.f6421 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.lang.Class m3483(java.lang.ClassLoader r1, java.lang.String r2) {
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

    /* JADX INFO: renamed from: β */
    public static java.util.ArrayList m3484(java.util.List r4) {
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
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.String r3 = r3.toGenericString()
            boolean r3 = r0.add(r3)
            if (r3 == 0) goto Le
            r1.add(r2)
            goto Le
        L29:
            return r1
    }

    /* JADX INFO: renamed from: γ */
    public static java.util.List m3485(org.luckypray.dexkit.DexKitBridge r2, java.lang.ClassLoader r3, java.lang.String[] r4) {
            zi r0 = new zi     // Catch: java.lang.Throwable -> L29
            r1 = 2
            r0.<init>(r4, r1)     // Catch: java.lang.Throwable -> L29
            org.luckypray.dexkit.result.MethodDataList r2 = r2.findMethod(r0)     // Catch: java.lang.Throwable -> L29
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L29
            r4.<init>()     // Catch: java.lang.Throwable -> L29
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L29
        L13:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> L29
            org.luckypray.dexkit.result.MethodData r0 = (org.luckypray.dexkit.result.MethodData) r0     // Catch: java.lang.Throwable -> L29
            java.lang.reflect.Method r0 = m3493(r0, r3)     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L13
            r4.add(r0)     // Catch: java.lang.Throwable -> L29
            goto L13
        L29:
            r2 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r2)
        L2f:
            boolean r2 = r4 instanceof p000.eo1
            if (r2 == 0) goto L35
            jz r4 = p000.C0450jz.f5672
        L35:
            java.util.List r4 = (java.util.List) r4
            return r4
    }

    /* JADX INFO: renamed from: δ */
    public static java.util.List m3486(org.luckypray.dexkit.DexKitBridge r2, java.lang.ClassLoader r3, java.lang.String r4) {
            yh0 r0 = new yh0     // Catch: java.lang.Throwable -> L29
            r1 = 5
            r0.<init>(r4, r1)     // Catch: java.lang.Throwable -> L29
            org.luckypray.dexkit.result.MethodDataList r2 = r2.findMethod(r0)     // Catch: java.lang.Throwable -> L29
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L29
            r4.<init>()     // Catch: java.lang.Throwable -> L29
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L29
        L13:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> L29
            org.luckypray.dexkit.result.MethodData r0 = (org.luckypray.dexkit.result.MethodData) r0     // Catch: java.lang.Throwable -> L29
            java.lang.reflect.Method r0 = m3493(r0, r3)     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L13
            r4.add(r0)     // Catch: java.lang.Throwable -> L29
            goto L13
        L29:
            r2 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r2)
        L2f:
            boolean r2 = r4 instanceof p000.eo1
            if (r2 == 0) goto L35
            jz r4 = p000.C0450jz.f5672
        L35:
            java.util.List r4 = (java.util.List) r4
            return r4
    }

    /* JADX INFO: renamed from: ε */
    public static boolean m3487(java.lang.reflect.Method r6) {
            int r0 = r6.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            r1 = 0
            if (r0 != 0) goto L4f
            java.lang.String r0 = r6.getName()
            java.lang.String r2 = "onViewCreated"
            boolean r0 = p000.ln0.m3626(r0, r2)
            if (r0 == 0) goto L4f
            java.lang.Class r0 = r6.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            boolean r0 = p000.ln0.m3626(r0, r2)
            if (r0 == 0) goto L4f
            java.lang.Class[] r6 = r6.getParameterTypes()
            r6.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = r6.length
            r0.<init>(r2)
            int r2 = r6.length
            r3 = r1
        L32:
            r4 = 1
            if (r3 >= r2) goto L3c
            r5 = r6[r3]
            int r3 = p000.lz1.m3679(r5, r0, r3, r4)
            goto L32
        L3c:
            java.lang.String r6 = "android.view.View"
            java.lang.String r2 = "android.os.Bundle"
            java.lang.String[] r6 = new java.lang.String[]{r6, r2}
            java.util.List r6 = p000.AbstractC1021yh.m6897(r6)
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto L4f
            return r4
        L4f:
            return r1
    }

    /* JADX INFO: renamed from: ζ */
    public static boolean m3488(java.lang.reflect.Method r2) {
            int r0 = r2.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 != 0) goto L28
            java.lang.Class r0 = r2.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L28
            java.lang.Class[] r2 = r2.getParameterTypes()
            java.lang.Class r0 = java.lang.Integer.TYPE
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            boolean r2 = java.util.Arrays.equals(r2, r0)
            if (r2 == 0) goto L28
            r2 = 1
            return r2
        L28:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: η */
    public static boolean m3489(java.lang.reflect.Method r2) {
            int r0 = r2.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 == 0) goto L22
            java.lang.Class r0 = r2.getReturnType()
            java.lang.Class r1 = java.lang.Integer.TYPE
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L22
            java.lang.Class[] r2 = r2.getParameterTypes()
            r2.getClass()
            int r2 = r2.length
            if (r2 != 0) goto L22
            r2 = 1
            return r2
        L22:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: θ */
    public static boolean m3490(java.lang.reflect.Method r2) {
            int r0 = r2.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 == 0) goto L28
            java.lang.Class r0 = r2.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L28
            java.lang.Class[] r2 = r2.getParameterTypes()
            java.lang.Class r0 = java.lang.Integer.TYPE
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            boolean r2 = java.util.Arrays.equals(r2, r0)
            if (r2 == 0) goto L28
            r2 = 1
            return r2
        L28:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ι */
    public static p000.C0740qx m3491(p000.EnumC0491kx r2, java.lang.ClassLoader r3, p000.p70 r4) {
            qx r0 = new qx
            java.lang.Object r1 = p000.C0666ox.f8297
            java.lang.String r3 = p000.C0666ox.m4320(r2, r3)
            java.lang.String r2 = r2.f6297
            r0.<init>(r3, r2, r4)
            return r0
    }

    /* JADX INFO: renamed from: κ */
    public static java.util.List m3492(p000.EnumC0491kx r6, java.lang.ClassLoader r7, boolean r8, p000.a80 r9, p000.p70 r10, p000.a80 r11) {
            java.lang.Object r0 = p000.C0666ox.f8297
            java.util.List r0 = p000.C0666ox.m4323(r6, r7)
            java.lang.String r1 = r6.f6296
            r2 = 0
            if (r0 == 0) goto L43
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L12
            goto L13
        L12:
            r0 = r2
        L13:
            if (r0 == 0) goto L43
            java.util.ArrayList r0 = m3484(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r0 = r0.iterator()
        L22:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L3c
            java.lang.Object r4 = r0.next()
            java.lang.Object r5 = r9.invoke(r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L22
            r3.add(r4)
            goto L22
        L3c:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L43
            r2 = r3
        L43:
            java.lang.String r0 = "DYH-OfflineDex"
            java.lang.String r3 = "[resolve] key="
            if (r2 == 0) goto L65
            int r6 = r2.size()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r3)
            r7.append(r1)
            java.lang.String r8 = " source=cache count="
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            p000.C0888ux.m5975(r0, r6)
            return r2
        L65:
            java.lang.Object r10 = r10.invoke()
            java.util.List r10 = (java.util.List) r10
            java.util.ArrayList r10 = m3484(r10)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r10 = r10.iterator()
        L78:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L92
            java.lang.Object r4 = r10.next()
            java.lang.Object r5 = r9.invoke(r4)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L78
            r2.add(r4)
            goto L78
        L92:
            boolean r10 = r2.isEmpty()
            if (r10 != 0) goto Lbb
            if (r8 == 0) goto L9f
            java.lang.Object r7 = p000.C0666ox.f8297
            p000.C0666ox.m4327(r6, r2)
        L9f:
            int r6 = r2.size()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r3)
            r7.append(r1)
            java.lang.String r8 = " source=reflection count="
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            p000.C0888ux.m5975(r0, r6)
            return r2
        Lbb:
            if (r8 == 0) goto L117
            java.lang.Object r8 = p000.C0666ox.f8297
            java.util.concurrent.atomic.AtomicBoolean r8 = p000.C0666ox.f8305
            boolean r8 = r8.get()
            if (r8 != 0) goto Lc8
            goto L117
        Lc8:
            java.lang.String r8 = r6.f6297
            xj0 r10 = new xj0
            r2 = 1
            r10.<init>(r11, r2)
            java.util.List r6 = p000.C0666ox.m4316(r6, r7, r8, r10)
            java.util.ArrayList r6 = m3484(r6)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        Le1:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto Lfb
            java.lang.Object r8 = r6.next()
            java.lang.Object r10 = r9.invoke(r8)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Le1
            r7.add(r8)
            goto Le1
        Lfb:
            int r6 = r7.size()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r3)
            r8.append(r1)
            java.lang.String r9 = " source=dexkit count="
            r8.append(r9)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            p000.C0888ux.m5975(r0, r6)
            return r7
        L117:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r3)
            r6.append(r1)
            java.lang.String r7 = " source=deferred count=0"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            p000.C0888ux.m5975(r0, r6)
            jz r6 = p000.C0450jz.f5672
            return r6
    }

    /* JADX INFO: renamed from: ν */
    public static java.lang.reflect.Method m3493(org.luckypray.dexkit.result.MethodData r8, java.lang.ClassLoader r9) {
            r0 = 0
            java.lang.Class r1 = r8.getClass()     // Catch: java.lang.Throwable -> L27
            java.lang.reflect.Method[] r1 = r1.getMethods()     // Catch: java.lang.Throwable -> L27
            r1.getClass()     // Catch: java.lang.Throwable -> L27
            int r2 = r1.length     // Catch: java.lang.Throwable -> L27
            r3 = 0
        Le:
            r4 = 1
            if (r3 >= r2) goto L2c
            r5 = r1[r3]     // Catch: java.lang.Throwable -> L27
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Throwable -> L27
            java.lang.String r7 = "getMethodInstance"
            boolean r6 = p000.ln0.m3626(r6, r7)     // Catch: java.lang.Throwable -> L27
            if (r6 == 0) goto L29
            java.lang.Class[] r6 = r5.getParameterTypes()     // Catch: java.lang.Throwable -> L27
            int r6 = r6.length     // Catch: java.lang.Throwable -> L27
            if (r6 != r4) goto L29
            goto L2d
        L27:
            r8 = move-exception
            goto L47
        L29:
            int r3 = r3 + 1
            goto Le
        L2c:
            r5 = r0
        L2d:
            if (r5 != 0) goto L31
        L2f:
            r8 = r0
            goto L4d
        L31:
            java.lang.Object[] r9 = new java.lang.Object[]{r9}     // Catch: java.lang.Throwable -> L27
            java.lang.Object r8 = r5.invoke(r8, r9)     // Catch: java.lang.Throwable -> L27
            boolean r9 = r8 instanceof java.lang.reflect.Method     // Catch: java.lang.Throwable -> L27
            if (r9 == 0) goto L40
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8     // Catch: java.lang.Throwable -> L27
            goto L41
        L40:
            r8 = r0
        L41:
            if (r8 == 0) goto L2f
            r8.setAccessible(r4)     // Catch: java.lang.Throwable -> L27
            goto L4d
        L47:
            eo1 r9 = new eo1
            r9.<init>(r8)
            r8 = r9
        L4d:
            boolean r9 = r8 instanceof p000.eo1
            if (r9 == 0) goto L52
            goto L53
        L52:
            r0 = r8
        L53:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            return r0
    }

    /* JADX INFO: renamed from: λ */
    public final java.util.List m3494(java.lang.ClassLoader r9, boolean r10) {
            r8 = this;
            r9.getClass()
            ny0 r0 = new ny0
            r6 = 0
            r7 = 5
            r1 = 1
            java.lang.Class<l41> r3 = p000.l41.class
            java.lang.String r4 = "isExactTargetGetter"
            java.lang.String r5 = "isExactTargetGetter(Ljava/lang/reflect/Method;)Z"
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r20 r4 = new r20
            r8 = 27
            r4.<init>(r9, r8)
            t20 r5 = new t20
            r8 = 18
            r5.<init>(r9, r8)
            r3 = r0
            kx r0 = p000.EnumC0491kx.f6256
            r1 = r9
            r2 = r10
            java.util.List r8 = m3492(r0, r1, r2, r3, r4, r5)
            return r8
    }

    /* JADX INFO: renamed from: μ */
    public final java.util.List m3495(java.lang.ClassLoader r9, boolean r10) {
            r8 = this;
            r9.getClass()
            ny0 r0 = new ny0
            r6 = 0
            r7 = 6
            r1 = 1
            java.lang.Class<l41> r3 = p000.l41.class
            java.lang.String r4 = "isExactTargetSetter"
            java.lang.String r5 = "isExactTargetSetter(Ljava/lang/reflect/Method;)Z"
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            k41 r4 = new k41
            r8 = 7
            r4.<init>(r9, r8)
            t20 r5 = new t20
            r8 = 19
            r5.<init>(r9, r8)
            r3 = r0
            kx r0 = p000.EnumC0491kx.f6257
            r1 = r9
            r2 = r10
            java.util.List r8 = m3492(r0, r1, r2, r3, r4, r5)
            return r8
    }
}
