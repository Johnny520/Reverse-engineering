package p000;

/* JADX INFO: renamed from: af */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0016af {

    /* JADX INFO: renamed from: α */
    public static final p000.C0016af f205 = null;

    /* JADX INFO: renamed from: β */
    public static final java.lang.String[] f206 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.atomic.AtomicBoolean f207 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.Set f208 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.util.concurrent.atomic.AtomicBoolean f209 = null;

    /* JADX INFO: renamed from: ζ */
    public static final java.util.concurrent.atomic.AtomicBoolean f210 = null;

    /* JADX INFO: renamed from: η */
    public static final p000.C0210df f211 = null;

    static {
            af r0 = new af
            r0.<init>()
            p000.C0016af.f205 = r0
            java.lang.String r0 = "X.0yo4"
            java.lang.String r1 = "X.C1872010yo4"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            p000.C0016af.f206 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.C0016af.f207 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r0.getClass()
            p000.C0016af.f208 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.C0016af.f209 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.C0016af.f210 = r0
            df r0 = new df
            r0.<init>()
            p000.C0016af.f211 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final int m96(p000.C0016af r2, java.lang.reflect.Method r3) {
            java.lang.Class r2 = r3.getDeclaringClass()
            java.lang.String r2 = r2.getName()
            java.lang.String[] r0 = p000.C0016af.f206
            boolean r2 = p000.AbstractC0312g7.m2234(r0, r2)
            if (r2 == 0) goto L13
            r2 = 1000(0x3e8, float:1.401E-42)
            goto L14
        L13:
            r2 = 0
        L14:
            int r0 = r3.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 == 0) goto L20
            int r2 = r2 + 300
        L20:
            java.lang.Class[] r0 = r3.getParameterTypes()
            int r0 = r0.length
            r1 = 7
            if (r0 != r1) goto L2a
            int r2 = r2 + 500
        L2a:
            java.lang.Class[] r0 = r3.getParameterTypes()
            r1 = 6
            r0 = r0[r1]
            r0.getClass()
            boolean r0 = m98(r0)
            if (r0 == 0) goto L3c
            int r2 = r2 + 300
        L3c:
            java.lang.Class r3 = r3.getReturnType()
            r3.getClass()
            boolean r3 = m99(r3)
            if (r3 == 0) goto L4b
            int r2 = r2 + 300
        L4b:
            return r2
    }

    /* JADX INFO: renamed from: β */
    public static java.util.ArrayList m97(java.util.List r17) {
            java.util.Iterator r0 = r17.iterator()
        L4:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L15
            java.lang.Object r1 = r0.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L4
            goto L4
        L15:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r3 = r17.iterator()
        L23:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L7b
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            java.lang.String r6 = p000.lz1.m3694(r5)
            java.lang.String r7 = r5.getName()
            java.lang.String r8 = p000.lz1.m3690(r7, r5)
            java.lang.Class[] r9 = r5.getParameterTypes()
            r9.getClass()
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = r9.length
            r10.<init>(r11)
            int r11 = r9.length
            r12 = 0
        L4b:
            if (r12 >= r11) goto L54
            r13 = r9[r12]
            int r12 = p000.lz1.m3679(r13, r10, r12, r2)
            goto L4b
        L54:
            int r5 = r5.getModifiers()
            java.lang.reflect.Modifier.isStatic(r5)
            r15 = 0
            r16 = 62
            java.lang.String r11 = ","
            r12 = 0
            r13 = 0
            r14 = 0
            java.lang.String r5 = p000.AbstractC0984xh.m6644(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r9 = "#"
            java.lang.String r10 = "("
            java.lang.StringBuilder r5 = p000.AbstractC0602nx.m4138(r6, r9, r7, r10, r5)
            java.lang.String r6 = "):"
            boolean r5 = p000.lz1.m3673(r5, r6, r8, r0)
            if (r5 == 0) goto L23
            r1.add(r4)
            goto L23
        L7b:
            return r1
    }

    /* JADX INFO: renamed from: γ */
    public static boolean m98(java.lang.Class r9) {
            boolean r0 = r9.isInterface()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.reflect.Method[] r9 = r9.getMethods()     // Catch: java.lang.Throwable -> Lac
            r9.getClass()     // Catch: java.lang.Throwable -> Lac
            int r0 = r9.length     // Catch: java.lang.Throwable -> Lac
            r2 = r1
        L11:
            r3 = 1
            if (r2 >= r0) goto L37
            r4 = r9[r2]     // Catch: java.lang.Throwable -> Lac
            java.lang.Class r5 = r4.getReturnType()     // Catch: java.lang.Throwable -> Lac
            java.lang.Class r6 = java.lang.Void.TYPE     // Catch: java.lang.Throwable -> Lac
            boolean r5 = p000.ln0.m3626(r5, r6)     // Catch: java.lang.Throwable -> Lac
            if (r5 == 0) goto L34
            java.lang.Class[] r4 = r4.getParameterTypes()     // Catch: java.lang.Throwable -> Lac
            java.lang.Class r5 = java.lang.Float.TYPE     // Catch: java.lang.Throwable -> Lac
            java.lang.Class[] r5 = new java.lang.Class[]{r5}     // Catch: java.lang.Throwable -> Lac
            boolean r4 = java.util.Arrays.equals(r4, r5)     // Catch: java.lang.Throwable -> Lac
            if (r4 == 0) goto L34
            r0 = r3
            goto L38
        L34:
            int r2 = r2 + 1
            goto L11
        L37:
            r0 = r1
        L38:
            int r2 = r9.length     // Catch: java.lang.Throwable -> Lac
            r4 = r1
        L3a:
            if (r4 >= r2) goto L59
            r5 = r9[r4]     // Catch: java.lang.Throwable -> Lac
            java.lang.Class[] r6 = r5.getParameterTypes()     // Catch: java.lang.Throwable -> Lac
            r6.getClass()     // Catch: java.lang.Throwable -> Lac
            int r6 = r6.length     // Catch: java.lang.Throwable -> Lac
            if (r6 != 0) goto L56
            java.lang.Class<android.app.Activity> r6 = android.app.Activity.class
            java.lang.Class r5 = r5.getReturnType()     // Catch: java.lang.Throwable -> Lac
            boolean r5 = r6.isAssignableFrom(r5)     // Catch: java.lang.Throwable -> Lac
            if (r5 == 0) goto L56
            r2 = r3
            goto L5a
        L56:
            int r4 = r4 + 1
            goto L3a
        L59:
            r2 = r1
        L5a:
            int r4 = r9.length     // Catch: java.lang.Throwable -> Lac
            r5 = r1
        L5c:
            if (r5 >= r4) goto L7b
            r6 = r9[r5]     // Catch: java.lang.Throwable -> Lac
            java.lang.Class[] r7 = r6.getParameterTypes()     // Catch: java.lang.Throwable -> Lac
            r7.getClass()     // Catch: java.lang.Throwable -> Lac
            int r7 = r7.length     // Catch: java.lang.Throwable -> Lac
            if (r7 != 0) goto L78
            java.lang.Class r6 = r6.getReturnType()     // Catch: java.lang.Throwable -> Lac
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            boolean r6 = p000.ln0.m3626(r6, r7)     // Catch: java.lang.Throwable -> Lac
            if (r6 == 0) goto L78
            r4 = r3
            goto L7c
        L78:
            int r5 = r5 + 1
            goto L5c
        L7b:
            r4 = r1
        L7c:
            int r5 = r9.length     // Catch: java.lang.Throwable -> Lac
            r6 = r1
        L7e:
            if (r6 >= r5) goto L9d
            r7 = r9[r6]     // Catch: java.lang.Throwable -> Lac
            java.lang.Class[] r8 = r7.getParameterTypes()     // Catch: java.lang.Throwable -> Lac
            r8.getClass()     // Catch: java.lang.Throwable -> Lac
            int r8 = r8.length     // Catch: java.lang.Throwable -> Lac
            if (r8 != 0) goto L9a
            java.lang.Class r7 = r7.getReturnType()     // Catch: java.lang.Throwable -> Lac
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> Lac
            boolean r7 = p000.ln0.m3626(r7, r8)     // Catch: java.lang.Throwable -> Lac
            if (r7 == 0) goto L9a
            r9 = r3
            goto L9e
        L9a:
            int r6 = r6 + 1
            goto L7e
        L9d:
            r9 = r1
        L9e:
            if (r0 == 0) goto La7
            if (r2 == 0) goto La7
            if (r4 == 0) goto La7
            if (r9 == 0) goto La7
            r1 = r3
        La7:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> Lac
            goto Lb3
        Lac:
            r9 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r9)
            r9 = r0
        Lb3:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r1 = r9 instanceof p000.eo1
            if (r1 == 0) goto Lba
            r9 = r0
        Lba:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            return r9
    }

    /* JADX INFO: renamed from: δ */
    public static boolean m99(java.lang.Class r6) {
            java.lang.Class r0 = java.lang.Void.TYPE
            boolean r0 = r6.equals(r0)
            r1 = 0
            if (r0 != 0) goto Lb1
            boolean r0 = r6.isPrimitive()
            if (r0 == 0) goto L11
            goto Lb1
        L11:
            java.lang.reflect.Field[] r6 = r6.getDeclaredFields()     // Catch: java.lang.Throwable -> L9c
            r6.getClass()     // Catch: java.lang.Throwable -> L9c
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L9c
            r0.<init>()     // Catch: java.lang.Throwable -> L9c
            int r2 = r6.length     // Catch: java.lang.Throwable -> L9c
            r3 = r1
        L1f:
            if (r3 >= r2) goto L33
            r4 = r6[r3]     // Catch: java.lang.Throwable -> L9c
            int r5 = r4.getModifiers()     // Catch: java.lang.Throwable -> L9c
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)     // Catch: java.lang.Throwable -> L9c
            if (r5 != 0) goto L30
            r0.add(r4)     // Catch: java.lang.Throwable -> L9c
        L30:
            int r3 = r3 + 1
            goto L1f
        L33:
            boolean r6 = r0.isEmpty()     // Catch: java.lang.Throwable -> L9c
            r2 = 0
            if (r6 == 0) goto L3c
            r3 = r1
            goto L62
        L3c:
            java.util.Iterator r6 = r0.iterator()     // Catch: java.lang.Throwable -> L9c
            r3 = r1
        L41:
            boolean r4 = r6.hasNext()     // Catch: java.lang.Throwable -> L9c
            if (r4 == 0) goto L62
            java.lang.Object r4 = r6.next()     // Catch: java.lang.Throwable -> L9c
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4     // Catch: java.lang.Throwable -> L9c
            java.lang.Class r4 = r4.getType()     // Catch: java.lang.Throwable -> L9c
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L9c
            boolean r4 = p000.ln0.m3626(r4, r5)     // Catch: java.lang.Throwable -> L9c
            if (r4 == 0) goto L41
            int r3 = r3 + 1
            if (r3 < 0) goto L5e
            goto L41
        L5e:
            p000.AbstractC1021yh.m6916()     // Catch: java.lang.Throwable -> L9c
            throw r2     // Catch: java.lang.Throwable -> L9c
        L62:
            r6 = 2
            if (r3 < r6) goto L97
            boolean r6 = r0.isEmpty()     // Catch: java.lang.Throwable -> L9c
            if (r6 == 0) goto L6d
            r0 = r1
            goto L93
        L6d:
            java.util.Iterator r6 = r0.iterator()     // Catch: java.lang.Throwable -> L9c
            r0 = r1
        L72:
            boolean r3 = r6.hasNext()     // Catch: java.lang.Throwable -> L9c
            if (r3 == 0) goto L93
            java.lang.Object r3 = r6.next()     // Catch: java.lang.Throwable -> L9c
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3     // Catch: java.lang.Throwable -> L9c
            java.lang.Class r3 = r3.getType()     // Catch: java.lang.Throwable -> L9c
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L9c
            boolean r3 = p000.ln0.m3626(r3, r4)     // Catch: java.lang.Throwable -> L9c
            if (r3 == 0) goto L72
            int r0 = r0 + 1
            if (r0 < 0) goto L8f
            goto L72
        L8f:
            p000.AbstractC1021yh.m6916()     // Catch: java.lang.Throwable -> L9c
            throw r2     // Catch: java.lang.Throwable -> L9c
        L93:
            r6 = 1
            if (r0 < r6) goto L97
            r1 = r6
        L97:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L9c
            goto La3
        L9c:
            r6 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r6)
            r6 = r0
        La3:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r1 = r6 instanceof p000.eo1
            if (r1 == 0) goto Laa
            r6 = r0
        Laa:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        Lb1:
            return r1
    }

    /* JADX INFO: renamed from: ζ */
    public static boolean m100(java.lang.reflect.Method r5) {
            r5.getClass()
            int r0 = r5.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            r1 = 0
            if (r0 != 0) goto L10
            goto L7e
        L10:
            java.lang.Class[] r0 = r5.getParameterTypes()
            int r2 = r0.length
            r3 = 7
            if (r2 == r3) goto L19
            goto L7e
        L19:
            r2 = r0[r1]
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"
            java.lang.String r3 = p000.jf0.m2957(r3)
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2c
            goto L7e
        L2c:
            r2 = 1
            r3 = r0[r2]
            java.lang.Class r4 = java.lang.Long.TYPE
            boolean r3 = p000.ln0.m3626(r3, r4)
            if (r3 != 0) goto L38
            goto L7e
        L38:
            r3 = 2
            r3 = r0[r3]
            java.lang.Class r4 = java.lang.Boolean.TYPE
            boolean r3 = p000.ln0.m3626(r3, r4)
            if (r3 != 0) goto L44
            goto L7e
        L44:
            r3 = 3
            r3 = r0[r3]
            boolean r3 = p000.ln0.m3626(r3, r4)
            if (r3 != 0) goto L4e
            goto L7e
        L4e:
            r3 = 4
            r3 = r0[r3]
            boolean r3 = p000.ln0.m3626(r3, r4)
            if (r3 != 0) goto L58
            goto L7e
        L58:
            r3 = 5
            r3 = r0[r3]
            java.lang.Class r4 = java.lang.Integer.TYPE
            boolean r3 = p000.ln0.m3626(r3, r4)
            if (r3 != 0) goto L64
            goto L7e
        L64:
            r3 = 6
            r0 = r0[r3]
            r0.getClass()
            boolean r0 = m98(r0)
            if (r0 == 0) goto L7e
            java.lang.Class r5 = r5.getReturnType()
            r5.getClass()
            boolean r5 = m99(r5)
            if (r5 == 0) goto L7e
            return r2
        L7e:
            return r1
    }

    /* JADX INFO: renamed from: η */
    public static void m101(java.lang.String r1) {
            java.lang.String r0 = "rdb45e3f68fd84fd5"
            p000.C0888ux.m5975(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ε */
    public final void m102(java.lang.ClassLoader r15) {
            r14 = this;
            r15.getClass()
            r1 = 0
            java.util.List r15 = r14.m103(r15, r1)
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L14
            java.lang.String r14 = "no skip method resolved, allowDexKitScan=false"
            m101(r14)
            return
        L14:
            java.util.Iterator r15 = r15.iterator()
        L18:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto Le2
            java.lang.Object r0 = r15.next()
            r2 = r0
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            java.lang.String r0 = p000.lz1.m3694(r2)
            java.lang.String r3 = r2.getName()
            java.lang.String r4 = p000.lz1.m3690(r3, r2)
            java.lang.Class[] r5 = r2.getParameterTypes()
            r5.getClass()
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = r5.length
            r6.<init>(r7)
            int r7 = r5.length
            r8 = r1
        L40:
            r13 = 1
            if (r8 >= r7) goto L4a
            r9 = r5[r8]
            int r8 = p000.lz1.m3679(r9, r6, r8, r13)
            goto L40
        L4a:
            int r5 = r2.getModifiers()
            java.lang.reflect.Modifier.isStatic(r5)
            r11 = 0
            r12 = 62
            java.lang.String r7 = ","
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.String r5 = p000.AbstractC0984xh.m6644(r6, r7, r8, r9, r10, r11, r12)
            java.lang.String r6 = "("
            java.lang.String r7 = "#"
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4138(r0, r7, r3, r6, r5)
            java.lang.String r3 = "):"
            java.lang.String r3 = p000.lz1.m3691(r0, r3, r4)
            java.util.Set r4 = p000.C0016af.f208
            boolean r0 = r4.add(r3)
            if (r0 != 0) goto L74
            goto L18
        L74:
            r2.setAccessible(r13)     // Catch: java.lang.Throwable -> L84
            xq0 r0 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L84
            xe r5 = new xe     // Catch: java.lang.Throwable -> L84
            r6 = 1
            r5.<init>(r6, r14, r2)     // Catch: java.lang.Throwable -> L84
            l01 r0 = r0.m6775(r2, r5)     // Catch: java.lang.Throwable -> L84
            goto L8b
        L84:
            r0 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r0)
            r0 = r5
        L8b:
            boolean r5 = r0 instanceof p000.eo1
            if (r5 != 0) goto Lb5
            r5 = r0
            l01 r5 = (p000.l01) r5
            java.lang.Class r5 = r2.getDeclaringClass()
            java.lang.String r5 = r5.getName()
            java.lang.String r6 = r2.getName()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "hooked "
            r8.<init>(r9)
            r8.append(r5)
            r8.append(r7)
            r8.append(r6)
            java.lang.String r5 = r8.toString()
            m101(r5)
        Lb5:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L18
            r4.remove(r3)
            java.lang.Class r3 = r2.getDeclaringClass()
            java.lang.String r3 = r3.getName()
            java.lang.String r2 = r2.getName()
            java.lang.String r0 = r0.getMessage()
            java.lang.String r4 = "hook failed "
            java.lang.String r5 = ": "
            java.lang.StringBuilder r2 = p000.lz1.m3695(r4, r3, r7, r2, r5)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            m101(r0)
            goto L18
        Le2:
            return
    }

    /* JADX INFO: renamed from: θ */
    public final java.util.List m103(java.lang.ClassLoader r12, boolean r13) {
            r11 = this;
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = p000.EnumC0491kx.f6248
            java.util.List r1 = p000.C0666ox.m4323(r0, r12)
            jz r2 = p000.C0450jz.f5672
            if (r1 != 0) goto Ld
            r1 = r2
        Ld:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L16:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L2d
            java.lang.Object r4 = r1.next()
            r5 = r4
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            boolean r5 = m100(r5)
            if (r5 == 0) goto L16
            r3.add(r4)
            goto L16
        L2d:
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L38
            java.util.ArrayList r11 = m97(r3)
            return r11
        L38:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3 = 0
            r4 = r3
        L3f:
            r5 = 2
            if (r4 >= r5) goto L7d
            java.lang.String[] r5 = p000.C0016af.f206
            r5 = r5[r4]
            java.lang.Class r5 = java.lang.Class.forName(r5, r3, r12)     // Catch: java.lang.Throwable -> L66
            java.lang.reflect.Method[] r5 = r5.getDeclaredMethods()     // Catch: java.lang.Throwable -> L66
            r5.getClass()     // Catch: java.lang.Throwable -> L66
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L66
            r6.<init>()     // Catch: java.lang.Throwable -> L66
            int r7 = r5.length     // Catch: java.lang.Throwable -> L66
            r8 = r3
        L58:
            if (r8 >= r7) goto L70
            r9 = r5[r8]     // Catch: java.lang.Throwable -> L66
            boolean r10 = m100(r9)     // Catch: java.lang.Throwable -> L66
            if (r10 == 0) goto L68
            r6.add(r9)     // Catch: java.lang.Throwable -> L66
            goto L68
        L66:
            r5 = move-exception
            goto L6b
        L68:
            int r8 = r8 + 1
            goto L58
        L6b:
            eo1 r6 = new eo1
            r6.<init>(r5)
        L70:
            boolean r5 = r6 instanceof p000.eo1
            if (r5 == 0) goto L75
            r6 = r2
        L75:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            p000.AbstractC0984xh.m6660(r1, r6)
            int r4 = r4 + 1
            goto L3f
        L7d:
            ze r3 = new ze
            r4 = 1
            r3.<init>(r11, r4)
            java.util.List r1 = p000.AbstractC0984xh.m6658(r1, r3)
            java.util.ArrayList r1 = m97(r1)
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto Lbe
            if (r13 == 0) goto Lbd
            java.lang.Object r11 = p000.C0666ox.f8297     // Catch: java.lang.Throwable -> L9b
            p000.C0666ox.m4327(r0, r1)     // Catch: java.lang.Throwable -> L9b
            s62 r11 = p000.s62.f9751     // Catch: java.lang.Throwable -> L9b
            goto La2
        L9b:
            r11 = move-exception
            eo1 r12 = new eo1
            r12.<init>(r11)
            r11 = r12
        La2:
            java.lang.Throwable r11 = p000.fo1.m2190(r11)
            if (r11 == 0) goto Lbd
            java.lang.String r11 = r11.getMessage()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "save reflection fallback failed: "
            r12.<init>(r13)
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            m101(r11)
        Lbd:
            return r1
        Lbe:
            if (r13 == 0) goto L126
            java.lang.Object r13 = p000.C0666ox.f8297
            java.util.concurrent.atomic.AtomicBoolean r13 = p000.C0666ox.f8305
            boolean r13 = r13.get()
            if (r13 != 0) goto Lcb
            goto L126
        Lcb:
            java.lang.String r13 = "定位 39.3 及以上视频章节广告自动跳过逻辑"
            wa r1 = new wa     // Catch: java.lang.Throwable -> Ld7
            r1.<init>(r11, r5, r12)     // Catch: java.lang.Throwable -> Ld7
            java.util.List r11 = p000.C0666ox.m4316(r0, r12, r13, r1)     // Catch: java.lang.Throwable -> Ld7
            goto Lde
        Ld7:
            r11 = move-exception
            eo1 r12 = new eo1
            r12.<init>(r11)
            r11 = r12
        Lde:
            java.lang.Throwable r12 = p000.fo1.m2190(r11)
            if (r12 == 0) goto Lf9
            java.lang.String r12 = r12.getMessage()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "DexKit resolve failed: "
            r13.<init>(r0)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            m101(r12)
        Lf9:
            boolean r12 = r11 instanceof p000.eo1
            if (r12 == 0) goto Lfe
            goto Lff
        Lfe:
            r2 = r11
        Lff:
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r12 = r2.iterator()
        L10a:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L121
            java.lang.Object r13 = r12.next()
            r0 = r13
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            boolean r0 = m100(r0)
            if (r0 == 0) goto L10a
            r11.add(r13)
            goto L10a
        L121:
            java.util.ArrayList r11 = m97(r11)
            return r11
        L126:
            return r2
    }
}
