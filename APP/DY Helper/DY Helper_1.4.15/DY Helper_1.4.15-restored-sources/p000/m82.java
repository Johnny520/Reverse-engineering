package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class m82 {

    /* JADX INFO: renamed from: α */
    public static final p000.m82 f7014 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.List f7015 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.atomic.AtomicBoolean f7016 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.Set f7017 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.util.concurrent.atomic.AtomicBoolean f7018 = null;

    /* JADX INFO: renamed from: ζ */
    public static final java.util.concurrent.atomic.AtomicBoolean f7019 = null;

    /* JADX INFO: renamed from: η */
    public static final java.util.concurrent.atomic.AtomicBoolean f7020 = null;

    static {
            m82 r0 = new m82
            r0.<init>()
            p000.m82.f7014 = r0
            r0 = 1056964608(0x3f000000, float:0.5)
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            r0 = 1061158912(0x3f400000, float:0.75)
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r3 = java.lang.Float.valueOf(r0)
            r0 = 1067450368(0x3fa00000, float:1.25)
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            r0 = 1069547520(0x3fc00000, float:1.5)
            java.lang.Float r5 = java.lang.Float.valueOf(r0)
            r0 = 1073741824(0x40000000, float:2.0)
            java.lang.Float r6 = java.lang.Float.valueOf(r0)
            r0 = 1077936128(0x40400000, float:3.0)
            java.lang.Float r7 = java.lang.Float.valueOf(r0)
            r0 = 1082130432(0x40800000, float:4.0)
            java.lang.Float r8 = java.lang.Float.valueOf(r0)
            r0 = 1084227584(0x40a00000, float:5.0)
            java.lang.Float r9 = java.lang.Float.valueOf(r0)
            java.lang.Float[] r0 = new java.lang.Float[]{r1, r2, r3, r4, r5, r6, r7, r8, r9}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            p000.m82.f7015 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.m82.f7016 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r0.getClass()
            p000.m82.f7017 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.m82.f7018 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.m82.f7019 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.m82.f7020 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final void m3792(java.util.LinkedHashMap r11, java.lang.ClassLoader r12, org.luckypray.dexkit.result.MethodData r13) {
            java.lang.reflect.Method r12 = r13.getMethodInstance(r12)     // Catch: java.lang.Throwable -> L5
            goto Ld
        L5:
            r0 = move-exception
            r12 = r0
            eo1 r13 = new eo1
            r13.<init>(r12)
            r12 = r13
        Ld:
            boolean r13 = r12 instanceof p000.eo1
            if (r13 == 0) goto L12
            r12 = 0
        L12:
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            if (r12 != 0) goto L17
            goto L1d
        L17:
            boolean r13 = m3795(r12)
            if (r13 != 0) goto L1e
        L1d:
            return
        L1e:
            r13 = 1
            r12.setAccessible(r13)
            java.lang.Class r0 = r12.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = r12.getName()
            java.lang.String r2 = p000.lz1.m3690(r1, r12)
            java.lang.Class[] r3 = r12.getParameterTypes()
            r3.getClass()
            java.util.ArrayList r4 = new java.util.ArrayList
            int r5 = r3.length
            r4.<init>(r5)
            int r5 = r3.length
            r6 = 0
        L41:
            if (r6 >= r5) goto L4a
            r7 = r3[r6]
            int r6 = p000.lz1.m3679(r7, r4, r6, r13)
            goto L41
        L4a:
            int r13 = r12.getModifiers()
            java.lang.reflect.Modifier.isStatic(r13)
            r9 = 0
            r10 = 62
            java.lang.String r5 = ","
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r13 = p000.AbstractC0984xh.m6644(r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r3 = "#"
            java.lang.String r4 = "("
            java.lang.StringBuilder r13 = p000.AbstractC0602nx.m4138(r0, r3, r1, r4, r13)
            java.lang.String r0 = "):"
            r13.append(r0)
            r13.append(r2)
            java.lang.String r13 = r13.toString()
            r11.put(r13, r12)
            return
    }

    /* JADX INFO: renamed from: β */
    public static java.util.ArrayList m3793(java.util.List r17) {
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

    /* JADX INFO: renamed from: δ */
    public static boolean m3794() {
            java.lang.String r0 = "video_speed_hook_enabled"
            r1 = 0
            boolean r0 = p000.ui1.m5887(r0, r1)     // Catch: java.lang.Throwable -> Lc
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> Lc
            goto L13
        Lc:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L13:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r2 = r0 instanceof p000.eo1
            if (r2 == 0) goto L1a
            r0 = r1
        L1a:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    /* JADX INFO: renamed from: ε */
    public static boolean m3795(java.lang.reflect.Method r1) {
            r1.getClass()
            java.lang.Class[] r0 = r1.getParameterTypes()
            r0.getClass()
            int r0 = r0.length
            if (r0 != 0) goto L1b
            java.lang.Class<java.util.List> r0 = java.util.List.class
            java.lang.Class r1 = r1.getReturnType()
            boolean r1 = r0.isAssignableFrom(r1)
            if (r1 == 0) goto L1b
            r1 = 1
            return r1
        L1b:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ζ */
    public static void m3796(java.lang.String r1) {
            java.lang.String r0 = "re7d26828893a19ba"
            p000.C0888ux.m5975(r0, r1)
            return
    }

    /* JADX INFO: renamed from: γ */
    public final void m3797(java.lang.ClassLoader r18) {
            r17 = this;
            r1 = r17
            r2 = r18
            r2.getClass()
            boolean r0 = m3794()
            if (r0 != 0) goto L13
            java.lang.String r0 = "disabled by prefs"
            m3796(r0)
            return
        L13:
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.m82.f7020
            r3 = 0
            r4 = 1
            boolean r0 = r0.compareAndSet(r3, r4)
            java.lang.String r5 = ": "
            if (r0 != 0) goto L20
            goto L64
        L20:
            java.lang.String r0 = "video_speed_patch"
            java.lang.System.loadLibrary(r0)     // Catch: java.lang.Throwable -> L28
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L28
            goto L2f
        L28:
            r0 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r0)
            r0 = r6
        L2f:
            boolean r6 = r0 instanceof p000.eo1
            if (r6 != 0) goto L3b
            r6 = r0
            s62 r6 = (p000.s62) r6
            java.lang.String r6 = "native speed patch library loaded"
            m3796(r6)
        L3b:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L64
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = r6.getName()
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "native speed patch library load failed: "
            r7.<init>(r8)
            r7.append(r6)
            r7.append(r5)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            m3796(r0)
        L64:
            l82 r0 = p000.l82.f6483
            r0.m3539(r2)
            java.util.List r0 = r1.m3798(r2, r3)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L79
            java.lang.String r0 = "no option method resolved, allowDexKitScan=false"
            m3796(r0)
            return
        L79:
            java.util.Iterator r2 = r0.iterator()
        L7d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L145
            java.lang.Object r0 = r2.next()
            r6 = r0
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            java.lang.String r0 = p000.lz1.m3694(r6)
            java.lang.String r7 = r6.getName()
            java.lang.String r8 = p000.lz1.m3690(r7, r6)
            java.lang.Class[] r9 = r6.getParameterTypes()
            r9.getClass()
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = r9.length
            r10.<init>(r11)
            int r11 = r9.length
            r12 = r3
        La5:
            if (r12 >= r11) goto Lae
            r13 = r9[r12]
            int r12 = p000.lz1.m3679(r13, r10, r12, r4)
            goto La5
        Lae:
            int r9 = r6.getModifiers()
            java.lang.reflect.Modifier.isStatic(r9)
            r15 = 0
            r16 = 62
            java.lang.String r11 = ","
            r12 = 0
            r13 = 0
            r14 = 0
            java.lang.String r9 = p000.AbstractC0984xh.m6644(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r10 = "("
            java.lang.String r11 = "#"
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4138(r0, r11, r7, r10, r9)
            java.lang.String r7 = "):"
            java.lang.String r7 = p000.lz1.m3691(r0, r7, r8)
            java.util.Set r8 = p000.m82.f7017
            boolean r0 = r8.add(r7)
            if (r0 != 0) goto Ld8
            goto L7d
        Ld8:
            r6.setAccessible(r4)     // Catch: java.lang.Throwable -> Le9
            xq0 r0 = p000.xq0.f12253     // Catch: java.lang.Throwable -> Le9
            xe r9 = new xe     // Catch: java.lang.Throwable -> Le9
            r10 = 14
            r9.<init>(r10, r1, r6)     // Catch: java.lang.Throwable -> Le9
            l01 r0 = r0.m6775(r6, r9)     // Catch: java.lang.Throwable -> Le9
            goto Lf0
        Le9:
            r0 = move-exception
            eo1 r9 = new eo1
            r9.<init>(r0)
            r0 = r9
        Lf0:
            boolean r9 = r0 instanceof p000.eo1
            if (r9 != 0) goto L11a
            r9 = r0
            l01 r9 = (p000.l01) r9
            java.lang.Class r9 = r6.getDeclaringClass()
            java.lang.String r9 = r9.getName()
            java.lang.String r10 = r6.getName()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "hooked "
            r12.<init>(r13)
            r12.append(r9)
            r12.append(r11)
            r12.append(r10)
            java.lang.String r9 = r12.toString()
            m3796(r9)
        L11a:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L7d
            r8.remove(r7)
            java.lang.Class r7 = r6.getDeclaringClass()
            java.lang.String r7 = r7.getName()
            java.lang.String r6 = r6.getName()
            java.lang.String r0 = r0.getMessage()
            java.lang.String r8 = "hook failed "
            java.lang.StringBuilder r6 = p000.lz1.m3695(r8, r7, r11, r6, r5)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            m3796(r0)
            goto L7d
        L145:
            return
    }

    /* JADX INFO: renamed from: η */
    public final java.util.List m3798(java.lang.ClassLoader r8, boolean r9) {
            r7 = this;
            r0 = 0
            java.lang.String r1 = "~79483057E7CA3B343415F96C2AB217F7DD3E100350CFB712CEDAB515DCE2816D426A735BD613EB803E27DD20F86DC9230C10D9F6CC144E"
            java.lang.String r1 = p000.jf0.m2957(r1)     // Catch: java.lang.Throwable -> Lc
            java.lang.Class r1 = java.lang.Class.forName(r1, r0, r8)     // Catch: java.lang.Throwable -> Lc
            goto L13
        Lc:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        L13:
            boolean r2 = r1 instanceof p000.eo1
            if (r2 == 0) goto L18
            r1 = 0
        L18:
            java.lang.Class r1 = (java.lang.Class) r1
            jz r2 = p000.C0450jz.f5672
            if (r1 != 0) goto L20
            r0 = r2
            goto L6a
        L20:
            java.lang.reflect.Method[] r1 = r1.getDeclaredMethods()     // Catch: java.lang.Throwable -> L3b
            r1.getClass()     // Catch: java.lang.Throwable -> L3b
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3b
            r3.<init>()     // Catch: java.lang.Throwable -> L3b
            int r4 = r1.length     // Catch: java.lang.Throwable -> L3b
        L2d:
            if (r0 >= r4) goto L40
            r5 = r1[r0]     // Catch: java.lang.Throwable -> L3b
            boolean r6 = m3795(r5)     // Catch: java.lang.Throwable -> L3b
            if (r6 == 0) goto L3d
            r3.add(r5)     // Catch: java.lang.Throwable -> L3b
            goto L3d
        L3b:
            r0 = move-exception
            goto L45
        L3d:
            int r0 = r0 + 1
            goto L2d
        L40:
            java.util.ArrayList r0 = m3793(r3)     // Catch: java.lang.Throwable -> L3b
            goto L4b
        L45:
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L4b:
            java.lang.Throwable r1 = p000.fo1.m2190(r0)
            if (r1 != 0) goto L52
            goto L68
        L52:
            java.lang.String r0 = r1.getMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "service reflection fallback failed: "
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            m3796(r0)
            r0 = r2
        L68:
            java.util.List r0 = (java.util.List) r0
        L6a:
            java.lang.Object r1 = p000.C0666ox.f8297
            kx r1 = p000.EnumC0491kx.f6249
            java.util.List r3 = p000.C0666ox.m4323(r1, r8)
            if (r3 != 0) goto L75
            r3 = r2
        L75:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L7e:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L95
            java.lang.Object r5 = r3.next()
            r6 = r5
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            boolean r6 = m3795(r6)
            if (r6 == 0) goto L7e
            r4.add(r5)
            goto L7e
        L95:
            boolean r3 = r4.isEmpty()
            if (r3 != 0) goto La4
            java.util.ArrayList r7 = p000.AbstractC0984xh.m6651(r4, r0)
            java.util.ArrayList r7 = m3793(r7)
            return r7
        La4:
            if (r9 == 0) goto L110
            java.lang.Object r9 = p000.C0666ox.f8297
            java.util.concurrent.atomic.AtomicBoolean r9 = p000.C0666ox.f8305
            boolean r9 = r9.get()
            if (r9 != 0) goto Lb1
            goto L110
        Lb1:
            java.lang.String r9 = "定位 39.3 及以上视频倍速选项提供方法"
            zx1 r3 = new zx1     // Catch: java.lang.Throwable -> Lbd
            r3.<init>(r7, r8)     // Catch: java.lang.Throwable -> Lbd
            java.util.List r7 = p000.C0666ox.m4316(r1, r8, r9, r3)     // Catch: java.lang.Throwable -> Lbd
            goto Lc4
        Lbd:
            r7 = move-exception
            eo1 r8 = new eo1
            r8.<init>(r7)
            r7 = r8
        Lc4:
            java.lang.Throwable r8 = p000.fo1.m2190(r7)
            if (r8 == 0) goto Ldf
            java.lang.String r8 = r8.getMessage()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r1 = "DexKit resolve failed: "
            r9.<init>(r1)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            m3796(r8)
        Ldf:
            boolean r8 = r7 instanceof p000.eo1
            if (r8 == 0) goto Le4
            goto Le5
        Le4:
            r2 = r7
        Le5:
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r2.iterator()
        Lf0:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L107
            java.lang.Object r9 = r8.next()
            r1 = r9
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            boolean r1 = m3795(r1)
            if (r1 == 0) goto Lf0
            r7.add(r9)
            goto Lf0
        L107:
            java.util.ArrayList r7 = p000.AbstractC0984xh.m6651(r0, r7)
            java.util.ArrayList r7 = m3793(r7)
            return r7
        L110:
            return r0
    }
}
