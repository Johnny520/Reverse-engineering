package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class c10 {

    /* JADX INFO: renamed from: α */
    public static final p000.c10 f1928 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.atomic.AtomicBoolean f1929 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.CopyOnWriteArrayList f1930 = null;

    static {
            c10 r0 = new c10
            r0.<init>()
            p000.c10.f1928 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.c10.f1929 = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            p000.c10.f1930 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final void m1095(java.util.LinkedHashMap r11, java.lang.reflect.Method r12) {
            if (r12 != 0) goto L3
            goto L9
        L3:
            boolean r0 = m1098(r12)
            if (r0 != 0) goto La
        L9:
            return
        La:
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
        L29:
            if (r6 >= r5) goto L33
            r7 = r3[r6]
            r8 = 1
            int r6 = p000.lz1.m3679(r7, r4, r6, r8)
            goto L29
        L33:
            int r3 = r12.getModifiers()
            java.lang.reflect.Modifier.isStatic(r3)
            r9 = 0
            r10 = 62
            java.lang.String r5 = ","
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r3 = p000.AbstractC0984xh.m6644(r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r4 = "#"
            java.lang.String r5 = "("
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4138(r0, r4, r1, r5, r3)
            java.lang.String r1 = "):"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r11.put(r0, r12)
            return
    }

    /* JADX INFO: renamed from: β */
    public static boolean m1096(java.lang.Class r8, java.lang.reflect.Method r9, java.util.HashSet r10) {
            boolean r0 = r10.add(r8)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = 1
            java.lang.reflect.Method[] r2 = r8.getDeclaredMethods()     // Catch: java.lang.Throwable -> L42
            r2.getClass()     // Catch: java.lang.Throwable -> L42
            int r3 = r2.length     // Catch: java.lang.Throwable -> L42
            r4 = r1
        L12:
            if (r4 >= r3) goto L47
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L42
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Throwable -> L42
            java.lang.String r7 = r9.getName()     // Catch: java.lang.Throwable -> L42
            boolean r6 = p000.ln0.m3626(r6, r7)     // Catch: java.lang.Throwable -> L42
            if (r6 == 0) goto L44
            java.lang.Class r6 = r5.getReturnType()     // Catch: java.lang.Throwable -> L42
            java.lang.Class r7 = r9.getReturnType()     // Catch: java.lang.Throwable -> L42
            boolean r6 = p000.ln0.m3626(r6, r7)     // Catch: java.lang.Throwable -> L42
            if (r6 == 0) goto L44
            java.lang.Class[] r5 = r5.getParameterTypes()     // Catch: java.lang.Throwable -> L42
            java.lang.Class[] r6 = r9.getParameterTypes()     // Catch: java.lang.Throwable -> L42
            boolean r5 = java.util.Arrays.equals(r5, r6)     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto L44
            r2 = r0
            goto L48
        L42:
            r2 = move-exception
            goto L4d
        L44:
            int r4 = r4 + 1
            goto L12
        L47:
            r2 = r1
        L48:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L42
            goto L53
        L4d:
            eo1 r3 = new eo1
            r3.<init>(r2)
            r2 = r3
        L53:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            boolean r4 = r2 instanceof p000.eo1
            if (r4 == 0) goto L5a
            r2 = r3
        L5a:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L63
            return r0
        L63:
            java.lang.Class[] r8 = r8.getInterfaces()
            r8.getClass()
            int r2 = r8.length
            r3 = r1
        L6c:
            if (r3 >= r2) goto L7e
            r4 = r8[r3]
            r4.getClass()
            boolean r4 = m1096(r4, r9, r10)
            if (r4 == 0) goto L7b
            r1 = r0
            goto L7e
        L7b:
            int r3 = r3 + 1
            goto L6c
        L7e:
            return r1
    }

    /* JADX INFO: renamed from: γ */
    public static boolean m1097(java.lang.Class r2) {
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
    public static boolean m1098(java.lang.reflect.Method r4) {
            java.lang.Class r0 = r4.getReturnType()
            java.lang.Class r1 = java.lang.Void.TYPE
            boolean r0 = p000.ln0.m3626(r0, r1)
            r1 = 0
            if (r0 != 0) goto Le
            goto L38
        Le:
            int r0 = r4.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r0 == 0) goto L19
            goto L38
        L19:
            java.lang.Class[] r0 = r4.getParameterTypes()
            int r2 = r0.length
            r3 = 1
            if (r2 != r3) goto L38
            r0 = r0[r1]
            java.lang.Class<android.view.MotionEvent> r2 = android.view.MotionEvent.class
            boolean r0 = p000.ln0.m3626(r0, r2)
            if (r0 != 0) goto L2c
            goto L38
        L2c:
            java.lang.Class r4 = r4.getDeclaringClass()
            r4.getClass()
            boolean r4 = m1097(r4)
            return r4
        L38:
            return r1
    }

    /* JADX INFO: renamed from: ε */
    public static boolean m1099(java.lang.reflect.Method r6) {
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> L38
            r0.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.Class r1 = r6.getDeclaringClass()     // Catch: java.lang.Throwable -> L38
        L9:
            r2 = 0
            if (r1 == 0) goto L33
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            boolean r3 = r1.equals(r3)     // Catch: java.lang.Throwable -> L38
            if (r3 != 0) goto L33
            java.lang.Class[] r3 = r1.getInterfaces()     // Catch: java.lang.Throwable -> L38
            r3.getClass()     // Catch: java.lang.Throwable -> L38
            int r4 = r3.length     // Catch: java.lang.Throwable -> L38
        L1c:
            if (r2 >= r4) goto L2e
            r5 = r3[r2]     // Catch: java.lang.Throwable -> L38
            r5.getClass()     // Catch: java.lang.Throwable -> L38
            boolean r5 = m1096(r5, r6, r0)     // Catch: java.lang.Throwable -> L38
            if (r5 == 0) goto L2b
            r2 = 1
            goto L33
        L2b:
            int r2 = r2 + 1
            goto L1c
        L2e:
            java.lang.Class r1 = r1.getSuperclass()     // Catch: java.lang.Throwable -> L38
            goto L9
        L33:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L38
            goto L3f
        L38:
            r6 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r6)
            r6 = r0
        L3f:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            boolean r1 = r6 instanceof p000.eo1
            if (r1 == 0) goto L46
            r6 = r0
        L46:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
    }

    /* JADX INFO: renamed from: η */
    public static java.util.List m1100(java.lang.ClassLoader r19) {
            r0 = r19
            r0.getClass()
            java.lang.Object r1 = p000.qe0.f8982
            java.lang.String r1 = "~7970EC7DC8C1E9D1DCDC9F0020E48B764591F776A2B2A0F654AAA42C9114B617EAD1105118283E42DD5D6812D60ABF5093CC791A36E233B09E"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.Class r1 = p000.qe0.m4877(r0, r1)
            jz r2 = p000.C0450jz.f5672
            if (r1 != 0) goto L16
            goto L2f
        L16:
            java.lang.String r3 = "~7940193404FAD3677C47B093370E147D326D0A3396452FC2BA98B28E8B177BFB57E578480950BD40139730D1F55377227BCD8D5E99"
            java.lang.String r3 = p000.jf0.m2957(r3)
            java.lang.Class r3 = p000.qe0.m4877(r0, r3)
            if (r3 != 0) goto L23
            goto L2f
        L23:
            java.lang.String r4 = "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"
            java.lang.String r4 = p000.jf0.m2957(r4)
            java.lang.Class r0 = p000.qe0.m4877(r0, r4)
            if (r0 != 0) goto L30
        L2f:
            return r2
        L30:
            java.lang.reflect.Method[] r1 = r1.getDeclaredMethods()
            r1.getClass()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r1.length
            r6 = 0
            r7 = r6
        L3f:
            r8 = 1
            if (r7 >= r5) goto L98
            r9 = r1[r7]
            r9.getClass()
            java.lang.Class r10 = r9.getReturnType()
            java.lang.Class r11 = java.lang.Void.TYPE
            boolean r10 = p000.ln0.m3626(r10, r11)
            if (r10 == 0) goto L79
            int r10 = r9.getModifiers()
            boolean r10 = java.lang.reflect.Modifier.isStatic(r10)
            if (r10 == 0) goto L5e
            goto L79
        L5e:
            java.lang.Class[] r10 = r9.getParameterTypes()
            int r11 = r10.length
            r12 = 3
            if (r11 != r12) goto L79
            r11 = r10[r6]
            java.lang.Class<android.view.MotionEvent> r12 = android.view.MotionEvent.class
            boolean r11 = p000.ln0.m3626(r11, r12)
            if (r11 != 0) goto L71
            goto L79
        L71:
            r8 = r10[r8]
            boolean r8 = r3.isAssignableFrom(r8)
            if (r8 != 0) goto L7b
        L79:
            r8 = r6
            goto L90
        L7b:
            r8 = 2
            r8 = r10[r8]
            boolean r8 = r0.isAssignableFrom(r8)
            if (r8 != 0) goto L85
            goto L79
        L85:
            java.lang.Class r8 = r9.getDeclaringClass()
            r8.getClass()
            boolean r8 = m1097(r8)
        L90:
            if (r8 == 0) goto L95
            r4.add(r9)
        L95:
            int r7 = r7 + 1
            goto L3f
        L98:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r3 = r4.iterator()
        La6:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L100
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            java.lang.String r7 = p000.lz1.m3694(r5)
            java.lang.String r9 = r5.getName()
            java.lang.String r10 = p000.lz1.m3690(r9, r5)
            java.lang.Class[] r11 = r5.getParameterTypes()
            r11.getClass()
            java.util.ArrayList r12 = new java.util.ArrayList
            int r13 = r11.length
            r12.<init>(r13)
            int r13 = r11.length
            r14 = r6
        Lce:
            if (r14 >= r13) goto Ld7
            r15 = r11[r14]
            int r14 = p000.lz1.m3679(r15, r12, r14, r8)
            goto Lce
        Ld7:
            int r5 = r5.getModifiers()
            java.lang.reflect.Modifier.isStatic(r5)
            r17 = 0
            r18 = 62
            java.lang.String r13 = ","
            r14 = 0
            r15 = 0
            r16 = 0
            java.lang.String r5 = p000.AbstractC0984xh.m6644(r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r11 = "#"
            java.lang.String r12 = "("
            java.lang.StringBuilder r5 = p000.AbstractC0602nx.m4138(r7, r11, r9, r12, r5)
            java.lang.String r7 = "):"
            boolean r5 = p000.lz1.m3673(r5, r7, r10, r0)
            if (r5 == 0) goto La6
            r1.add(r4)
            goto La6
        L100:
            int r0 = r1.size()
            if (r0 == r8) goto L118
            int r0 = r1.size()
            java.lang.String r1 = "双击点赞语义入口候选不唯一，拒绝使用 count="
            java.lang.String r0 = p000.a12.m17(r1, r0)
            r1 = 4
            java.lang.String r3 = "rc8611bc391e3e31b"
            r4 = 0
            p000.C0888ux.m5988(r3, r0, r4, r1, r4)
            return r2
        L118:
            java.lang.Object r0 = p000.AbstractC0984xh.m6655(r1)
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            r1.setAccessible(r8)
            java.util.List r0 = p000.AbstractC1021yh.m6896(r0)
            return r0
    }

    /* JADX INFO: renamed from: θ */
    public static int m1101(java.lang.reflect.Method r4) {
            boolean r0 = m1099(r4)
            r1 = 0
            if (r0 == 0) goto La
            r0 = 2000(0x7d0, float:2.803E-42)
            goto Lb
        La:
            r0 = r1
        Lb:
            java.lang.Class r2 = r4.getDeclaringClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "~7970EC7DC8C1E9D1DCDC9F0020E48B764591F776A2B2A0F654AAA42C9114B617EAD1105118283E42DD5D6812D60ABF5093CC791A36E233B09E"
            java.lang.String r3 = p000.jf0.m2957(r3)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L21
            int r0 = r0 + 1000
        L21:
            java.lang.Class[] r2 = r4.getParameterTypes()
            int r2 = r2.length
            r3 = 1
            if (r2 != r3) goto L39
            java.lang.Class[] r2 = r4.getParameterTypes()
            r1 = r2[r1]
            java.lang.Class<android.view.MotionEvent> r2 = android.view.MotionEvent.class
            boolean r1 = p000.ln0.m3626(r1, r2)
            if (r1 == 0) goto L39
            int r0 = r0 + 500
        L39:
            java.lang.Class r1 = r4.getReturnType()
            java.lang.Class r2 = java.lang.Void.TYPE
            boolean r1 = p000.ln0.m3626(r1, r2)
            if (r1 == 0) goto L47
            int r0 = r0 + 300
        L47:
            int r4 = r4.getModifiers()
            boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
            if (r4 != 0) goto L53
            int r0 = r0 + 100
        L53:
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public final java.util.List m1102(java.lang.ClassLoader r8, boolean r9) {
            r7 = this;
            r8.getClass()
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = p000.EnumC0491kx.f6194
            java.util.List r1 = p000.C0666ox.m4323(r0, r8)
            jz r2 = p000.C0450jz.f5672
            if (r1 != 0) goto L10
            r1 = r2
        L10:
            java.util.List r1 = r7.m1103(r1)
            boolean r3 = r1.isEmpty()
            r4 = 0
            if (r3 != 0) goto L1c
            goto L1d
        L1c:
            r1 = r4
        L1d:
            if (r1 == 0) goto L20
            return r1
        L20:
            java.lang.Object r1 = p000.qe0.f8982
            java.lang.String r1 = "~7970EC7DC8C1E9D1DCDC9F0020E48B764591F776A2B2A0F654AAA42C9114B617EAD1105118283E42DD5D6812D60ABF5093CC791A36E233B09E"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.Class r1 = p000.qe0.m4877(r8, r1)
            if (r1 != 0) goto L30
            r1 = r2
            goto L42
        L30:
            java.lang.reflect.Method[] r1 = r1.getDeclaredMethods()
            r1.getClass()
            java.util.List r1 = java.util.Arrays.asList(r1)
            r1.getClass()
            java.util.List r1 = r7.m1103(r1)
        L42:
            boolean r3 = r1.isEmpty()
            r5 = 4
            java.lang.String r6 = "rc8611bc391e3e31b"
            if (r3 != 0) goto L6e
            if (r9 == 0) goto L6d
            p000.C0666ox.m4327(r0, r1)     // Catch: java.lang.Throwable -> L53
            s62 r7 = p000.s62.f9751     // Catch: java.lang.Throwable -> L53
            goto L5a
        L53:
            r7 = move-exception
            eo1 r8 = new eo1
            r8.<init>(r7)
            r7 = r8
        L5a:
            java.lang.Throwable r7 = p000.fo1.m2190(r7)
            if (r7 == 0) goto L6d
            java.lang.String r7 = r7.getMessage()
            java.lang.String r8 = "保存反射兜底缓存失败: "
            java.lang.String r7 = p000.lz1.m3687(r8, r7)
            p000.C0888ux.m5988(r6, r7, r4, r5, r4)
        L6d:
            return r1
        L6e:
            if (r9 == 0) goto L9f
            java.util.concurrent.atomic.AtomicBoolean r9 = p000.C0666ox.f8305
            boolean r9 = r9.get()
            if (r9 != 0) goto L79
            goto L9f
        L79:
            android.os.Looper r9 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r9 = p000.ln0.m3626(r9, r1)
            if (r9 == 0) goto L8d
            java.lang.String r7 = "主线程不执行 DexKit 扫描"
            p000.C0888ux.m5988(r6, r7, r4, r5, r4)
            return r2
        L8d:
            bb r9 = new bb
            r1 = 23
            r9.<init>(r8, r1)
            java.lang.String r1 = "定位 Feed 原生双击点赞入口"
            java.util.List r8 = p000.C0666ox.m4316(r0, r8, r1, r9)
            java.util.List r7 = r7.m1103(r8)
            return r7
        L9f:
            return r2
    }

    /* JADX INFO: renamed from: ι */
    public final java.util.List m1103(java.util.Collection r18) {
            r17 = this;
            r0 = r18
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            boolean r3 = m1098(r3)
            if (r3 == 0) goto Ld
            r1.add(r2)
            goto Ld
        L24:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L32:
            boolean r3 = r1.hasNext()
            r4 = 1
            if (r3 == 0) goto L8b
            java.lang.Object r3 = r1.next()
            r5 = r3
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
        L5b:
            if (r12 >= r11) goto L64
            r13 = r9[r12]
            int r12 = p000.lz1.m3679(r13, r10, r12, r4)
            goto L5b
        L64:
            int r4 = r5.getModifiers()
            java.lang.reflect.Modifier.isStatic(r4)
            r15 = 0
            r16 = 62
            java.lang.String r11 = ","
            r12 = 0
            r13 = 0
            r14 = 0
            java.lang.String r4 = p000.AbstractC0984xh.m6644(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r5 = "#"
            java.lang.String r9 = "("
            java.lang.StringBuilder r4 = p000.AbstractC0602nx.m4138(r6, r5, r7, r9, r4)
            java.lang.String r5 = "):"
            boolean r4 = p000.lz1.m3673(r4, r5, r8, r0)
            if (r4 == 0) goto L32
            r2.add(r3)
            goto L32
        L8b:
            boolean r0 = r2.isEmpty()
            jz r1 = p000.C0450jz.f5672
            if (r0 == 0) goto L95
            goto L123
        L95:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r2.iterator()
        L9e:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto Lb5
            java.lang.Object r5 = r3.next()
            r6 = r5
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            boolean r6 = m1099(r6)
            if (r6 == 0) goto L9e
            r0.add(r5)
            goto L9e
        Lb5:
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto Lbc
            goto Lbd
        Lbc:
            r2 = r0
        Lbd:
            qt r3 = new qt
            r5 = 12
            r6 = r17
            r3.<init>(r5, r6)
            java.util.List r2 = p000.AbstractC0984xh.m6658(r2, r3)
            java.lang.Object r3 = p000.AbstractC0984xh.m6640(r2)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L123
            int r3 = m1101(r3)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r2 = r2.iterator()
        Ldf:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto Lf6
            java.lang.Object r6 = r2.next()
            r7 = r6
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            int r7 = m1101(r7)
            if (r7 != r3) goto Ldf
            r5.add(r6)
            goto Ldf
        Lf6:
            int r2 = r5.size()
            if (r2 == r4) goto L114
            int r2 = r5.size()
            int r0 = r0.size()
            java.lang.String r3 = "双击入口结构候选不唯一，拒绝使用 count="
            java.lang.String r4 = ", interfaceBacked="
            java.lang.String r0 = p000.AbstractC0602nx.m4125(r2, r0, r3, r4)
            r2 = 4
            java.lang.String r3 = "rc8611bc391e3e31b"
            r4 = 0
            p000.C0888ux.m5988(r3, r0, r4, r2, r4)
            return r1
        L114:
            java.lang.Object r0 = p000.AbstractC0984xh.m6655(r5)
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            r1.setAccessible(r4)
            java.util.List r0 = p000.AbstractC1021yh.m6896(r0)
            return r0
        L123:
            return r1
    }
}
