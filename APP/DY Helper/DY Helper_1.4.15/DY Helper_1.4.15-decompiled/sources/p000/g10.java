package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class g10 {

    /* JADX INFO: renamed from: α */
    public static final long f4191 = 0;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.CopyOnWriteArrayList f4192 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.atomic.AtomicBoolean f4193 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.concurrent.ConcurrentHashMap.KeySetView f4194 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.lang.Object f4195 = null;

    /* JADX INFO: renamed from: ζ */
    public static final java.lang.Object f4196 = null;

    /* JADX INFO: renamed from: η */
    public static final java.lang.Object f4197 = null;

    /* JADX INFO: renamed from: θ */
    public static final java.lang.Object f4198 = null;

    /* JADX INFO: renamed from: ι */
    public static final java.util.LinkedHashMap f4199 = null;

    /* JADX INFO: renamed from: κ */
    public static final java.util.WeakHashMap f4200 = null;

    /* JADX INFO: renamed from: λ */
    public static p000.d10 f4201;

    /* JADX INFO: renamed from: μ */
    public static long f4202;

    /* JADX INFO: renamed from: ν */
    public static final p000.q00 f4203 = null;

    /* JADX INFO: renamed from: ξ */
    public static final p000.C0797sg f4204 = null;

    static {
            int r0 = android.view.ViewConfiguration.getDoubleTapTimeout()
            long r0 = (long) r0
            p000.g10.f4191 = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            p000.g10.f4192 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.g10.f4193 = r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            p000.g10.f4194 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p000.g10.f4195 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p000.g10.f4196 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p000.g10.f4197 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p000.g10.f4198 = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            p000.g10.f4199 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            p000.g10.f4200 = r0
            q00 r0 = new q00
            r1 = 17
            r0.<init>(r1)
            p000.g10.f4203 = r0
            sg r0 = new sg
            r1 = 1
            r0.<init>(r1)
            p000.g10.f4204 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final boolean m2221(java.lang.Object r20, android.view.MotionEvent r21, java.lang.String r22, boolean r23) {
            r1 = r21
            if (r23 == 0) goto L9c
            if (r1 != 0) goto La
            r17 = 0
            goto L99
        La:
            long r4 = r1.getDownTime()
            long r6 = r1.getEventTime()
            float r0 = r1.getRawX()
            float r8 = r1.getRawY()
            long r9 = android.os.SystemClock.uptimeMillis()
            java.lang.Object r11 = p000.g10.f4197
            monitor-enter(r11)
            java.util.WeakHashMap r12 = p000.g10.f4200     // Catch: java.lang.Throwable -> L3d
            java.util.Collection r12 = r12.values()     // Catch: java.lang.Throwable -> L3d
            r12.getClass()     // Catch: java.lang.Throwable -> L3d
            java.lang.Iterable r12 = (java.lang.Iterable) r12     // Catch: java.lang.Throwable -> L3d
            boolean r13 = r12 instanceof java.util.Collection     // Catch: java.lang.Throwable -> L3d
            if (r13 == 0) goto L3f
            r13 = r12
            java.util.Collection r13 = (java.util.Collection) r13     // Catch: java.lang.Throwable -> L3d
            boolean r13 = r13.isEmpty()     // Catch: java.lang.Throwable -> L3d
            if (r13 == 0) goto L3f
            r3 = 0
            r17 = 0
            goto L96
        L3d:
            r0 = move-exception
            goto L9a
        L3f:
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> L3d
        L43:
            boolean r13 = r12.hasNext()     // Catch: java.lang.Throwable -> L3d
            if (r13 == 0) goto L92
            java.lang.Object r13 = r12.next()     // Catch: java.lang.Throwable -> L3d
            h10 r13 = (p000.h10) r13     // Catch: java.lang.Throwable -> L3d
            j10 r13 = r13.f4527     // Catch: java.lang.Throwable -> L3d
            if (r13 != 0) goto L56
        L53:
            r17 = 0
            goto L8c
        L56:
            long r14 = r13.f5290     // Catch: java.lang.Throwable -> L3d
            long r16 = r9 - r14
            r18 = 0
            int r18 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r18 > 0) goto L53
            r18 = 1200(0x4b0, double:5.93E-321)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 > 0) goto L53
            r17 = 0
            long r2 = r13.f5289     // Catch: java.lang.Throwable -> L3d
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L8c
            int r2 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r2 != 0) goto L8c
            float r2 = r13.f5291     // Catch: java.lang.Throwable -> L3d
            int r2 = java.lang.Float.floatToIntBits(r2)     // Catch: java.lang.Throwable -> L3d
            int r3 = java.lang.Float.floatToIntBits(r0)     // Catch: java.lang.Throwable -> L3d
            if (r2 != r3) goto L8c
            float r2 = r13.f5292     // Catch: java.lang.Throwable -> L3d
            int r2 = java.lang.Float.floatToIntBits(r2)     // Catch: java.lang.Throwable -> L3d
            int r3 = java.lang.Float.floatToIntBits(r8)     // Catch: java.lang.Throwable -> L3d
            if (r2 != r3) goto L8c
            r2 = 1
            goto L8e
        L8c:
            r2 = r17
        L8e:
            if (r2 == 0) goto L43
            r3 = 1
            goto L96
        L92:
            r17 = 0
            r3 = r17
        L96:
            monitor-exit(r11)
            if (r3 != 0) goto L9e
        L99:
            return r17
        L9a:
            monitor-exit(r11)
            throw r0
        L9c:
            r17 = 0
        L9e:
            if (r1 != 0) goto La1
            goto Le1
        La1:
            d10 r2 = new d10
            long r5 = r1.getDownTime()
            long r7 = r1.getEventTime()
            float r0 = r1.getRawX()
            int r3 = java.lang.Float.floatToIntBits(r0)
            float r0 = r1.getRawY()
            int r4 = java.lang.Float.floatToIntBits(r0)
            r2.<init>(r3, r4, r5, r7)
            long r3 = android.os.SystemClock.uptimeMillis()
            java.lang.Object r5 = p000.g10.f4198
            monitor-enter(r5)
            d10 r0 = p000.g10.f4201     // Catch: java.lang.Throwable -> Ld9
            boolean r0 = p000.ln0.m3626(r0, r2)     // Catch: java.lang.Throwable -> Ld9
            if (r0 == 0) goto Ldc
            long r6 = p000.g10.f4202     // Catch: java.lang.Throwable -> Ld9
            long r6 = r3 - r6
            r8 = 1500(0x5dc, double:7.41E-321)
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 > 0) goto Ldc
            monitor-exit(r5)
            return r17
        Ld9:
            r0 = move-exception
            goto L15c
        Ldc:
            p000.g10.f4201 = r2     // Catch: java.lang.Throwable -> Ld9
            p000.g10.f4202 = r3     // Catch: java.lang.Throwable -> Ld9
            monitor-exit(r5)
        Le1:
            java.util.concurrent.CopyOnWriteArrayList r0 = p000.g10.f4192
            qt r2 = new qt
            r3 = 13
            r2.<init>(r3)
            java.util.List r0 = p000.AbstractC0984xh.m6658(r0, r2)
            java.util.Iterator r2 = r0.iterator()
        Lf2:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L159
            java.lang.Object r0 = r2.next()
            r3 = r0
            e10 r3 = (p000.e10) r3
            r4 = r20
            boolean r0 = r3.mo1834(r4, r1)     // Catch: java.lang.Throwable -> L10a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Throwable -> L10a
            goto L111
        L10a:
            r0 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r0)
            r0 = r5
        L111:
            java.lang.Throwable r5 = p000.fo1.m2190(r0)
            if (r5 == 0) goto L146
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = r3.getName()
            java.util.concurrent.ConcurrentHashMap$KeySetView r6 = p000.g10.f4194
            boolean r6 = r6.add(r3)
            if (r6 == 0) goto L146
            java.lang.String r6 = "r898d705a05f158a0"
            java.lang.String r5 = r5.getMessage()
            java.lang.String r7 = "双击策略异常 source="
            java.lang.String r8 = " listener="
            java.lang.String r9 = ": "
            r10 = r22
            java.lang.StringBuilder r3 = p000.lz1.m3695(r7, r10, r8, r3, r9)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r5 = 4
            r7 = 0
            p000.C0888ux.m5988(r6, r3, r7, r5, r7)
            goto L148
        L146:
            r10 = r22
        L148:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            boolean r5 = r0 instanceof p000.eo1
            if (r5 == 0) goto L14f
            r0 = r3
        L14f:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lf2
            r2 = 1
            goto L15b
        L159:
            r2 = r17
        L15b:
            return r2
        L15c:
            monitor-exit(r5)
            throw r0
    }

    /* JADX INFO: renamed from: β */
    public static void m2222(java.lang.ClassLoader r6, p000.e10 r7) {
            r6.getClass()
            java.lang.Object r0 = p000.g10.f4195
            monitor-enter(r0)
            java.util.concurrent.CopyOnWriteArrayList r1 = p000.g10.f4192     // Catch: java.lang.Throwable -> L2f
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L2f
            r1.addIfAbsent(r7)     // Catch: java.lang.Throwable -> L2f
            java.util.concurrent.atomic.AtomicBoolean r7 = p000.g10.f4193     // Catch: java.lang.Throwable -> L2f
            r3 = 1
            r4 = 0
            boolean r7 = r7.compareAndSet(r4, r3)     // Catch: java.lang.Throwable -> L2f
            if (r7 != 0) goto L1a
            goto L26
        L1a:
            c10 r7 = p000.c10.f1928     // Catch: java.lang.Throwable -> L2f
            q00 r7 = p000.g10.f4203     // Catch: java.lang.Throwable -> L2f
            r7.getClass()     // Catch: java.lang.Throwable -> L2f
            java.util.concurrent.CopyOnWriteArrayList r5 = p000.c10.f1930     // Catch: java.lang.Throwable -> L2f
            r5.addIfAbsent(r7)     // Catch: java.lang.Throwable -> L2f
        L26:
            if (r2 == 0) goto L32
            boolean r7 = r1.isEmpty()     // Catch: java.lang.Throwable -> L2f
            if (r7 != 0) goto L32
            goto L33
        L2f:
            r6 = move-exception
            goto Lcc
        L32:
            r3 = r4
        L33:
            monitor-exit(r0)
            r7 = 4
            r0 = 0
            if (r3 == 0) goto L6c
            e30 r1 = p000.e30.f3390     // Catch: java.lang.Throwable -> L50
            r1.m1839(r6)     // Catch: java.lang.Throwable -> L50
            sg r1 = p000.g10.f4204     // Catch: java.lang.Throwable -> L50
            r1.getClass()     // Catch: java.lang.Throwable -> L50
            java.util.concurrent.CopyOnWriteArrayList r2 = p000.e30.f3392     // Catch: java.lang.Throwable -> L50
            boolean r3 = r2.contains(r1)     // Catch: java.lang.Throwable -> L50
            if (r3 != 0) goto L4d
            r2.add(r1)     // Catch: java.lang.Throwable -> L50
        L4d:
            s62 r1 = p000.s62.f9751     // Catch: java.lang.Throwable -> L50
            goto L57
        L50:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        L57:
            java.lang.Throwable r1 = p000.fo1.m2190(r1)
            if (r1 == 0) goto L6c
            java.lang.String r2 = "r898d705a05f158a0"
            java.lang.String r1 = r1.getMessage()
            java.lang.String r3 = "双击触摸证据观察器安装失败，仅保留宿主主入口: "
            java.lang.String r1 = p000.lz1.m3687(r3, r1)
            p000.C0888ux.m5988(r2, r1, r0, r7, r0)
        L6c:
            c10 r1 = p000.c10.f1928     // Catch: java.lang.Throwable -> L7c
            java.util.List r1 = r1.m1102(r6, r4)     // Catch: java.lang.Throwable -> L7c
            java.util.List r6 = p000.c10.m1100(r6)     // Catch: java.lang.Throwable -> L7c
            l91 r2 = new l91     // Catch: java.lang.Throwable -> L7c
            r2.<init>(r1, r6)     // Catch: java.lang.Throwable -> L7c
            goto L82
        L7c:
            r6 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r6)
        L82:
            boolean r6 = r2 instanceof p000.eo1
            if (r6 != 0) goto Lb6
            r6 = r2
            l91 r6 = (p000.l91) r6
            java.lang.Object r1 = r6.f6502
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r6 = r6.f6503
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r3 = p000.g10.f4195
            monitor-enter(r3)
            java.util.concurrent.CopyOnWriteArrayList r4 = p000.g10.f4192     // Catch: java.lang.Throwable -> Laa
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> Laa
            if (r4 != 0) goto Lb2
            boolean r4 = r1.isEmpty()     // Catch: java.lang.Throwable -> Laa
            if (r4 == 0) goto Lac
            java.lang.String r1 = "r898d705a05f158a0"
            java.lang.String r4 = "暂未解析到宿主双击主入口，等待 DexKit 预热结果"
            p000.C0888ux.m5988(r1, r4, r0, r7, r0)     // Catch: java.lang.Throwable -> Laa
            goto Laf
        Laa:
            r6 = move-exception
            goto Lb4
        Lac:
            m2224(r1)     // Catch: java.lang.Throwable -> Laa
        Laf:
            m2225(r6)     // Catch: java.lang.Throwable -> Laa
        Lb2:
            monitor-exit(r3)
            goto Lb6
        Lb4:
            monitor-exit(r3)
            throw r6
        Lb6:
            java.lang.Throwable r6 = p000.fo1.m2190(r2)
            if (r6 == 0) goto Lcb
            java.lang.String r1 = "r898d705a05f158a0"
            java.lang.String r6 = r6.getMessage()
            java.lang.String r2 = "解析宿主双击入口失败: "
            java.lang.String r6 = p000.lz1.m3687(r2, r6)
            p000.C0888ux.m5988(r1, r6, r0, r7, r0)
        Lcb:
            return
        Lcc:
            monitor-exit(r0)
            throw r6
    }

    /* JADX INFO: renamed from: γ */
    public static boolean m2223(java.lang.Class r2) {
        L0:
            if (r2 == 0) goto L21
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L21
            java.lang.String r0 = r2.getName()
            java.lang.String r1 = "~7970EC7DC8C1E9D1DCDC9F0020E48B764591F776A2B2A0F654AAA42C9114B617EAD1105118283E42DD5D6812D60ABF5093CC791A36E233B09E"
            java.lang.String r1 = p000.jf0.m2957(r1)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1c
            r2 = 1
            return r2
        L1c:
            java.lang.Class r2 = r2.getSuperclass()
            goto L0
        L21:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: δ */
    public static void m2224(java.util.List r18) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r18.iterator()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4d
            java.lang.Object r2 = r1.next()
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.Class r4 = r3.getReturnType()
            java.lang.Class r5 = java.lang.Void.TYPE
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 == 0) goto L9
            int r4 = r3.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
            if (r4 != 0) goto L9
            java.lang.Class[] r4 = r3.getParameterTypes()
            java.lang.Class<android.view.MotionEvent> r5 = android.view.MotionEvent.class
            java.lang.Class[] r5 = new java.lang.Class[]{r5}
            boolean r4 = java.util.Arrays.equals(r4, r5)
            if (r4 == 0) goto L9
            java.lang.Class r3 = r3.getDeclaringClass()
            r3.getClass()
            boolean r3 = m2223(r3)
            if (r3 == 0) goto L9
            r0.add(r2)
            goto L9
        L4d:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L5b:
            boolean r3 = r0.hasNext()
            r4 = 0
            r5 = 1
            if (r3 == 0) goto Lb5
            java.lang.Object r3 = r0.next()
            r6 = r3
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            java.lang.String r7 = p000.lz1.m3694(r6)
            java.lang.String r8 = r6.getName()
            java.lang.String r9 = p000.lz1.m3690(r8, r6)
            java.lang.Class[] r10 = r6.getParameterTypes()
            r10.getClass()
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = r10.length
            r11.<init>(r12)
            int r12 = r10.length
        L84:
            if (r4 >= r12) goto L8d
            r13 = r10[r4]
            int r4 = p000.lz1.m3679(r13, r11, r4, r5)
            goto L84
        L8d:
            int r4 = r6.getModifiers()
            java.lang.reflect.Modifier.isStatic(r4)
            java.lang.String r12 = ","
            r16 = 0
            r17 = 62
            r13 = 0
            r14 = 0
            r15 = 0
            java.lang.String r4 = p000.AbstractC0984xh.m6644(r11, r12, r13, r14, r15, r16, r17)
            java.lang.String r5 = "#"
            java.lang.String r6 = "("
            java.lang.StringBuilder r4 = p000.AbstractC0602nx.m4138(r7, r5, r8, r6, r4)
            java.lang.String r5 = "):"
            boolean r4 = p000.lz1.m3673(r4, r5, r9, r1)
            if (r4 == 0) goto L5b
            r2.add(r3)
            goto L5b
        Lb5:
            int r0 = r2.size()
            r1 = 4
            r3 = 0
            if (r0 == r5) goto Lcd
            java.lang.String r0 = "r898d705a05f158a0"
            int r2 = r2.size()
            java.lang.String r4 = "双击主入口候选不唯一，拒绝安装 Hook count="
            java.lang.String r2 = p000.a12.m17(r4, r2)
            p000.C0888ux.m5988(r0, r2, r3, r1, r3)
            return
        Lcd:
            java.lang.Object r0 = p000.AbstractC0984xh.m6655(r2)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            java.lang.String r2 = p000.lz1.m3694(r0)
            java.lang.String r6 = r0.getName()
            java.lang.String r7 = p000.lz1.m3690(r6, r0)
            java.lang.Class[] r8 = r0.getParameterTypes()
            r8.getClass()
            java.util.ArrayList r9 = new java.util.ArrayList
            int r10 = r8.length
            r9.<init>(r10)
            int r10 = r8.length
            r11 = r4
        Lee:
            if (r11 >= r10) goto Lf7
            r12 = r8[r11]
            int r11 = p000.lz1.m3679(r12, r9, r11, r5)
            goto Lee
        Lf7:
            int r8 = r0.getModifiers()
            java.lang.reflect.Modifier.isStatic(r8)
            java.lang.String r10 = ","
            r14 = 0
            r15 = 62
            r11 = 0
            r12 = 0
            r13 = 0
            java.lang.String r8 = p000.AbstractC0984xh.m6644(r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r9 = "#"
            java.lang.String r10 = "("
            java.lang.StringBuilder r2 = p000.AbstractC0602nx.m4138(r2, r9, r6, r10, r8)
            java.lang.String r6 = "):"
            java.lang.String r2 = p000.lz1.m3691(r2, r6, r7)
            java.lang.String r6 = "primary:"
            java.lang.String r6 = r6.concat(r2)
            java.lang.Object r7 = p000.g10.f4196
            monitor-enter(r7)
            java.util.LinkedHashMap r8 = p000.g10.f4199     // Catch: java.lang.Throwable -> L171
            boolean r9 = r8.containsKey(r6)     // Catch: java.lang.Throwable -> L171
            if (r9 == 0) goto L12a
            goto L180
        L12a:
            r0.setAccessible(r5)     // Catch: java.lang.Throwable -> L141
            xq0 r4 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L141
            xl r5 = new xl     // Catch: java.lang.Throwable -> L141
            r9 = 2147483647(0x7fffffff, float:NaN)
            r5.<init>(r9)     // Catch: java.lang.Throwable -> L141
            l01 r0 = r4.m6775(r0, r5)     // Catch: java.lang.Throwable -> L141
            r8.put(r6, r0)     // Catch: java.lang.Throwable -> L141
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L141
            goto L148
        L141:
            r0 = move-exception
            eo1 r4 = new eo1     // Catch: java.lang.Throwable -> L171
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L171
            r0 = r4
        L148:
            java.lang.Throwable r4 = p000.fo1.m2190(r0)     // Catch: java.lang.Throwable -> L171
            if (r4 == 0) goto L173
            java.lang.String r5 = "r898d705a05f158a0"
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L171
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L171
            r6.<init>()     // Catch: java.lang.Throwable -> L171
            java.lang.String r8 = "安装双击主入口 Hook 失败: "
            r6.append(r8)     // Catch: java.lang.Throwable -> L171
            r6.append(r2)     // Catch: java.lang.Throwable -> L171
            java.lang.String r8 = ", "
            r6.append(r8)     // Catch: java.lang.Throwable -> L171
            r6.append(r4)     // Catch: java.lang.Throwable -> L171
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> L171
            p000.C0888ux.m5988(r5, r4, r3, r1, r3)     // Catch: java.lang.Throwable -> L171
            goto L173
        L171:
            r0 = move-exception
            goto L18f
        L173:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L171
            boolean r5 = r0 instanceof p000.eo1     // Catch: java.lang.Throwable -> L171
            if (r5 == 0) goto L17a
            r0 = r4
        L17a:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L171
            boolean r4 = r0.booleanValue()     // Catch: java.lang.Throwable -> L171
        L180:
            monitor-exit(r7)
            if (r4 == 0) goto L18e
            java.lang.String r0 = "r898d705a05f158a0"
            java.lang.String r4 = "宿主双击主入口统一 Hook 已安装: "
            java.lang.String r2 = r4.concat(r2)
            p000.C0888ux.m5988(r0, r2, r3, r1, r3)
        L18e:
            return
        L18f:
            monitor-exit(r7)
            throw r0
    }

    /* JADX INFO: renamed from: ε */
    public static void m2225(java.util.List r18) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r18.iterator()
        L9:
            boolean r2 = r1.hasNext()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L76
            java.lang.Object r2 = r1.next()
            r5 = r2
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            java.lang.Class[] r6 = r5.getParameterTypes()
            java.lang.Class r7 = r5.getReturnType()
            java.lang.Class r8 = java.lang.Void.TYPE
            boolean r7 = p000.ln0.m3626(r7, r8)
            if (r7 == 0) goto L9
            int r7 = r5.getModifiers()
            boolean r7 = java.lang.reflect.Modifier.isStatic(r7)
            if (r7 != 0) goto L9
            int r7 = r6.length
            r8 = 3
            if (r7 != r8) goto L9
            r3 = r6[r3]
            java.lang.Class<android.view.MotionEvent> r7 = android.view.MotionEvent.class
            boolean r3 = p000.ln0.m3626(r3, r7)
            if (r3 == 0) goto L9
            r3 = r6[r4]
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = "~7940193404FAD3677C47B093370E147D326D0A3396452FC2BA98B28E8B177BFB57E578480950BD40139730D1F55377227BCD8D5E99"
            java.lang.String r4 = p000.jf0.m2957(r4)
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L9
            r3 = 2
            r3 = r6[r3]
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"
            java.lang.String r4 = p000.jf0.m2957(r4)
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L9
            java.lang.Class r3 = r5.getDeclaringClass()
            r3.getClass()
            boolean r3 = m2223(r3)
            if (r3 == 0) goto L9
            r0.add(r2)
            goto L9
        L76:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L84:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto Ldd
            java.lang.Object r5 = r0.next()
            r6 = r5
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            java.lang.String r7 = p000.lz1.m3694(r6)
            java.lang.String r8 = r6.getName()
            java.lang.String r9 = p000.lz1.m3690(r8, r6)
            java.lang.Class[] r10 = r6.getParameterTypes()
            r10.getClass()
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = r10.length
            r11.<init>(r12)
            int r12 = r10.length
            r13 = r3
        Lac:
            if (r13 >= r12) goto Lb5
            r14 = r10[r13]
            int r13 = p000.lz1.m3679(r14, r11, r13, r4)
            goto Lac
        Lb5:
            int r6 = r6.getModifiers()
            java.lang.reflect.Modifier.isStatic(r6)
            java.lang.String r12 = ","
            r16 = 0
            r17 = 62
            r13 = 0
            r14 = 0
            r15 = 0
            java.lang.String r6 = p000.AbstractC0984xh.m6644(r11, r12, r13, r14, r15, r16, r17)
            java.lang.String r10 = "#"
            java.lang.String r11 = "("
            java.lang.StringBuilder r6 = p000.AbstractC0602nx.m4138(r7, r10, r8, r11, r6)
            java.lang.String r7 = "):"
            boolean r6 = p000.lz1.m3673(r6, r7, r9, r1)
            if (r6 == 0) goto L84
            r2.add(r5)
            goto L84
        Ldd:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Le5
            goto L1bf
        Le5:
            int r0 = r2.size()
            r1 = 4
            r5 = 0
            if (r0 == r4) goto Lfd
            java.lang.String r0 = "r898d705a05f158a0"
            int r2 = r2.size()
            java.lang.String r3 = "双击语义兜底候选不唯一，拒绝安装 Hook count="
            java.lang.String r2 = p000.a12.m17(r3, r2)
            p000.C0888ux.m5988(r0, r2, r5, r1, r5)
            return
        Lfd:
            java.lang.Object r0 = p000.AbstractC0984xh.m6655(r2)
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            java.lang.String r2 = p000.lz1.m3694(r0)
            java.lang.String r6 = r0.getName()
            java.lang.String r7 = p000.lz1.m3690(r6, r0)
            java.lang.Class[] r8 = r0.getParameterTypes()
            r8.getClass()
            java.util.ArrayList r9 = new java.util.ArrayList
            int r10 = r8.length
            r9.<init>(r10)
            int r10 = r8.length
            r11 = r3
        L11e:
            if (r11 >= r10) goto L127
            r12 = r8[r11]
            int r11 = p000.lz1.m3679(r12, r9, r11, r4)
            goto L11e
        L127:
            int r8 = r0.getModifiers()
            java.lang.reflect.Modifier.isStatic(r8)
            java.lang.String r10 = ","
            r14 = 0
            r15 = 62
            r11 = 0
            r12 = 0
            r13 = 0
            java.lang.String r8 = p000.AbstractC0984xh.m6644(r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r9 = "#"
            java.lang.String r10 = "("
            java.lang.StringBuilder r2 = p000.AbstractC0602nx.m4138(r2, r9, r6, r10, r8)
            java.lang.String r6 = "):"
            java.lang.String r2 = p000.lz1.m3691(r2, r6, r7)
            java.lang.String r6 = "semantic:"
            java.lang.String r6 = r6.concat(r2)
            java.lang.Object r7 = p000.g10.f4196
            monitor-enter(r7)
            java.util.LinkedHashMap r8 = p000.g10.f4199     // Catch: java.lang.Throwable -> L1a2
            boolean r9 = r8.containsKey(r6)     // Catch: java.lang.Throwable -> L1a2
            if (r9 == 0) goto L15a
            goto L1b1
        L15a:
            r0.setAccessible(r4)     // Catch: java.lang.Throwable -> L172
            xq0 r3 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L172
            f10 r4 = new f10     // Catch: java.lang.Throwable -> L172
            r9 = 2147483647(0x7fffffff, float:NaN)
            r10 = 0
            r4.<init>(r9, r10)     // Catch: java.lang.Throwable -> L172
            l01 r0 = r3.m6775(r0, r4)     // Catch: java.lang.Throwable -> L172
            r8.put(r6, r0)     // Catch: java.lang.Throwable -> L172
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L172
            goto L179
        L172:
            r0 = move-exception
            eo1 r3 = new eo1     // Catch: java.lang.Throwable -> L1a2
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L1a2
            r0 = r3
        L179:
            java.lang.Throwable r3 = p000.fo1.m2190(r0)     // Catch: java.lang.Throwable -> L1a2
            if (r3 == 0) goto L1a4
            java.lang.String r4 = "r898d705a05f158a0"
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> L1a2
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a2
            r6.<init>()     // Catch: java.lang.Throwable -> L1a2
            java.lang.String r8 = "安装双击语义兜底 Hook 失败: "
            r6.append(r8)     // Catch: java.lang.Throwable -> L1a2
            r6.append(r2)     // Catch: java.lang.Throwable -> L1a2
            java.lang.String r8 = ", "
            r6.append(r8)     // Catch: java.lang.Throwable -> L1a2
            r6.append(r3)     // Catch: java.lang.Throwable -> L1a2
            java.lang.String r3 = r6.toString()     // Catch: java.lang.Throwable -> L1a2
            p000.C0888ux.m5988(r4, r3, r5, r1, r5)     // Catch: java.lang.Throwable -> L1a2
            goto L1a4
        L1a2:
            r0 = move-exception
            goto L1c0
        L1a4:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L1a2
            boolean r4 = r0 instanceof p000.eo1     // Catch: java.lang.Throwable -> L1a2
            if (r4 == 0) goto L1ab
            r0 = r3
        L1ab:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L1a2
            boolean r3 = r0.booleanValue()     // Catch: java.lang.Throwable -> L1a2
        L1b1:
            monitor-exit(r7)
            if (r3 == 0) goto L1bf
            java.lang.String r0 = "r898d705a05f158a0"
            java.lang.String r3 = "宿主双击语义兜底 Hook 已安装: "
            java.lang.String r2 = r3.concat(r2)
            p000.C0888ux.m5988(r0, r2, r5, r1, r5)
        L1bf:
            return
        L1c0:
            monitor-exit(r7)
            throw r0
    }

    /* JADX INFO: renamed from: ζ */
    public static void m2226(p000.e10 r7) {
            java.lang.Object r0 = p000.g10.f4195
            monitor-enter(r0)
            java.util.concurrent.CopyOnWriteArrayList r1 = p000.g10.f4192     // Catch: java.lang.Throwable -> La6
            r1.remove(r7)     // Catch: java.lang.Throwable -> La6
            boolean r7 = r1.isEmpty()     // Catch: java.lang.Throwable -> La6
            monitor-exit(r0)
            if (r7 == 0) goto La5
            java.lang.Object r7 = p000.g10.f4196
            monitor-enter(r7)
            java.util.LinkedHashMap r0 = p000.g10.f4199     // Catch: java.lang.Throwable -> La2
            java.util.Collection r1 = r0.values()     // Catch: java.lang.Throwable -> La2
            r1.getClass()     // Catch: java.lang.Throwable -> La2
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> La2
            java.util.List r1 = p000.AbstractC0984xh.m6666(r1)     // Catch: java.lang.Throwable -> La2
            r0.clear()     // Catch: java.lang.Throwable -> La2
            monitor-exit(r7)
            java.util.Iterator r7 = r1.iterator()
            r0 = 0
        L2a:
            boolean r2 = r7.hasNext()
            r3 = 0
            r4 = 4
            if (r2 == 0) goto L64
            java.lang.Object r2 = r7.next()
            l01 r2 = (p000.l01) r2
            r2.m3432()     // Catch: java.lang.Throwable -> L3e
            s62 r2 = p000.s62.f9751     // Catch: java.lang.Throwable -> L3e
            goto L45
        L3e:
            r2 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r2)
            r2 = r5
        L45:
            boolean r5 = r2 instanceof p000.eo1
            if (r5 != 0) goto L4e
            r5 = r2
            s62 r5 = (p000.s62) r5
            int r0 = r0 + 1
        L4e:
            java.lang.Throwable r2 = p000.fo1.m2190(r2)
            if (r2 == 0) goto L2a
            java.lang.String r5 = "r898d705a05f158a0"
            java.lang.String r2 = r2.getMessage()
            java.lang.String r6 = "卸载双击入口 Hook 失败: "
            java.lang.String r2 = p000.lz1.m3687(r6, r2)
            p000.C0888ux.m5988(r5, r2, r3, r4, r3)
            goto L2a
        L64:
            java.util.concurrent.ConcurrentHashMap$KeySetView r7 = p000.g10.f4194
            r7.clear()
            boolean r7 = r1.isEmpty()
            if (r7 != 0) goto L7c
            java.lang.String r7 = "r898d705a05f158a0"
            java.lang.String r1 = "宿主双击入口统一 Hook 已卸载 count="
            java.lang.String r2 = " reason=无活跃双击策略"
            java.lang.String r0 = p000.AbstractC0602nx.m4127(r1, r0, r2)
            p000.C0888ux.m5988(r7, r0, r3, r4, r3)
        L7c:
            e30 r7 = p000.e30.f3390
            sg r7 = p000.g10.f4204
            r7.getClass()
            java.util.concurrent.CopyOnWriteArrayList r0 = p000.e30.f3392
            r0.remove(r7)
            java.lang.Object r7 = p000.g10.f4197
            monitor-enter(r7)
            java.util.WeakHashMap r0 = p000.g10.f4200     // Catch: java.lang.Throwable -> L9f
            r0.clear()     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r7)
            java.lang.Object r7 = p000.g10.f4198
            monitor-enter(r7)
            p000.g10.f4201 = r3     // Catch: java.lang.Throwable -> L9c
            r0 = 0
            p000.g10.f4202 = r0     // Catch: java.lang.Throwable -> L9c
            monitor-exit(r7)
            return
        L9c:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L9f:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        La2:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        La5:
            return
        La6:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
    }
}
