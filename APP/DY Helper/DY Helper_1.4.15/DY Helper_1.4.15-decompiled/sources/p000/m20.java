package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class m20 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.atomic.AtomicBoolean f6907 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.CopyOnWriteArrayList f6908 = null;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.m20.f6907 = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            p000.m20.f6908 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.lang.Class m3713(org.luckypray.dexkit.result.ClassData r9, java.lang.ClassLoader r10) {
            r0 = 0
            if (r9 != 0) goto L4
            goto L3f
        L4:
            java.lang.Class<org.luckypray.dexkit.result.ClassData> r1 = org.luckypray.dexkit.result.ClassData.class
            java.lang.reflect.Method[] r1 = r1.getMethods()     // Catch: java.lang.Throwable -> L37
            r1.getClass()     // Catch: java.lang.Throwable -> L37
            int r2 = r1.length     // Catch: java.lang.Throwable -> L37
            r3 = 0
            r4 = r3
        L10:
            r5 = 1
            if (r4 >= r2) goto L3c
            r6 = r1[r4]     // Catch: java.lang.Throwable -> L37
            java.lang.String r7 = r6.getName()     // Catch: java.lang.Throwable -> L37
            java.lang.String r8 = "getInstance"
            boolean r7 = p000.ln0.m3626(r7, r8)     // Catch: java.lang.Throwable -> L37
            if (r7 == 0) goto L39
            java.lang.Class[] r7 = r6.getParameterTypes()     // Catch: java.lang.Throwable -> L37
            int r7 = r7.length     // Catch: java.lang.Throwable -> L37
            if (r7 != r5) goto L39
            java.lang.Class<java.lang.ClassLoader> r7 = java.lang.ClassLoader.class
            java.lang.Class[] r8 = r6.getParameterTypes()     // Catch: java.lang.Throwable -> L37
            r8 = r8[r3]     // Catch: java.lang.Throwable -> L37
            boolean r7 = r7.isAssignableFrom(r8)     // Catch: java.lang.Throwable -> L37
            if (r7 == 0) goto L39
            goto L3d
        L37:
            r9 = move-exception
            goto L54
        L39:
            int r4 = r4 + 1
            goto L10
        L3c:
            r6 = r0
        L3d:
            if (r6 != 0) goto L40
        L3f:
            return r0
        L40:
            r6.setAccessible(r5)     // Catch: java.lang.Throwable -> L37
            java.lang.Object[] r10 = new java.lang.Object[]{r10}     // Catch: java.lang.Throwable -> L37
            java.lang.Object r9 = r6.invoke(r9, r10)     // Catch: java.lang.Throwable -> L37
            boolean r10 = r9 instanceof java.lang.Class     // Catch: java.lang.Throwable -> L37
            if (r10 == 0) goto L52
            java.lang.Class r9 = (java.lang.Class) r9     // Catch: java.lang.Throwable -> L37
            goto L5a
        L52:
            r9 = r0
            goto L5a
        L54:
            eo1 r10 = new eo1
            r10.<init>(r9)
            r9 = r10
        L5a:
            boolean r10 = r9 instanceof p000.eo1
            if (r10 == 0) goto L5f
            goto L60
        L5f:
            r0 = r9
        L60:
            java.lang.Class r0 = (java.lang.Class) r0
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static boolean m3714(java.lang.Class r5, java.lang.String r6) {
        L0:
            r0 = 0
            if (r5 == 0) goto L32
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L32
            java.lang.Class[] r1 = r5.getInterfaces()
            r1.getClass()
            int r2 = r1.length
        L13:
            if (r0 >= r2) goto L2d
            r3 = r1[r0]
            java.lang.String r4 = r3.getName()
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L2b
            boolean r3 = m3714(r3, r6)
            if (r3 == 0) goto L28
            goto L2b
        L28:
            int r0 = r0 + 1
            goto L13
        L2b:
            r5 = 1
            return r5
        L2d:
            java.lang.Class r5 = r5.getSuperclass()
            goto L0
        L32:
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static java.util.List m3715(java.lang.ClassLoader r5) {
            r5.getClass()
            r0 = 0
            java.util.List r5 = m3716(r5, r0)
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L45
            java.util.concurrent.CopyOnWriteArrayList r0 = p000.m20.f6908
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L45
            java.lang.Object r1 = r0.next()
            a80 r1 = (p000.a80) r1
            r1.invoke(r5)     // Catch: java.lang.Throwable -> L26
            s62 r1 = p000.s62.f9751     // Catch: java.lang.Throwable -> L26
            goto L2d
        L26:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        L2d:
            java.lang.Throwable r1 = p000.fo1.m2190(r1)
            if (r1 == 0) goto L14
            java.lang.String r1 = r1.getMessage()
            java.lang.String r2 = "通知长按倍速解析结果失败: "
            java.lang.String r1 = p000.lz1.m3687(r2, r1)
            r2 = 4
            java.lang.String r3 = "rcc14672cf9c445fb"
            r4 = 0
            p000.C0888ux.m5988(r3, r1, r4, r2, r4)
            goto L14
        L45:
            return r5
    }

    /* JADX INFO: renamed from: δ */
    public static java.util.List m3716(java.lang.ClassLoader r7, boolean r8) {
            r7.getClass()
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = p000.EnumC0491kx.f6250
            java.util.List r1 = p000.C0666ox.m4323(r0, r7)
            jz r2 = p000.C0450jz.f5672
            if (r1 != 0) goto L10
            r1 = r2
        L10:
            java.util.List r1 = m3717(r1)
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
            java.lang.String r1 = "~78FFFE05059D677C5F115118CB977FD0DCE8657A2E98D251DB8D207889468BA5B05F445586ABDA6A9D6A56D1691A440130A7502B51A10555254C210B2269DADE81192591358EACBA2935B589ADB03BB9A54F29E8EF7FA60805C0"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.Class r1 = p000.qe0.m4877(r7, r1)
            if (r1 != 0) goto L30
            r1 = r2
            goto L42
        L30:
            java.lang.reflect.Method[] r1 = r1.getDeclaredMethods()
            r1.getClass()
            java.util.List r1 = java.util.Arrays.asList(r1)
            r1.getClass()
            java.util.List r1 = m3717(r1)
        L42:
            boolean r3 = r1.isEmpty()
            r5 = 4
            java.lang.String r6 = "rcc14672cf9c445fb"
            if (r3 != 0) goto L76
            if (r8 == 0) goto L75
            java.util.concurrent.atomic.AtomicBoolean r7 = p000.C0666ox.f8305
            boolean r7 = r7.get()
            if (r7 == 0) goto L75
            p000.C0666ox.m4327(r0, r1)     // Catch: java.lang.Throwable -> L5b
            s62 r7 = p000.s62.f9751     // Catch: java.lang.Throwable -> L5b
            goto L62
        L5b:
            r7 = move-exception
            eo1 r8 = new eo1
            r8.<init>(r7)
            r7 = r8
        L62:
            java.lang.Throwable r7 = p000.fo1.m2190(r7)
            if (r7 == 0) goto L75
            java.lang.String r7 = r7.getMessage()
            java.lang.String r8 = "保存长按倍速反射结果失败: "
            java.lang.String r7 = p000.lz1.m3687(r8, r7)
            p000.C0888ux.m5988(r6, r7, r4, r5, r4)
        L75:
            return r1
        L76:
            if (r8 == 0) goto La7
            java.util.concurrent.atomic.AtomicBoolean r8 = p000.C0666ox.f8305
            boolean r8 = r8.get()
            if (r8 != 0) goto L81
            goto La7
        L81:
            android.os.Looper r8 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r8 = p000.ln0.m3626(r8, r1)
            if (r8 == 0) goto L95
            java.lang.String r7 = "主线程不执行长按倍速 DexKit 扫描"
            p000.C0888ux.m5988(r6, r7, r4, r5, r4)
            return r2
        L95:
            bb r8 = new bb
            r1 = 26
            r8.<init>(r7, r1)
            java.lang.String r1 = "定位 Feed 左右侧长按倍速提供方法"
            java.util.List r7 = p000.C0666ox.m4316(r0, r7, r1, r8)
            java.util.List r7 = m3717(r7)
            return r7
        La7:
            return r2
    }

    /* JADX INFO: renamed from: ε */
    public static java.util.List m3717(java.util.List r18) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r18.iterator()
        L9:
            boolean r2 = r1.hasNext()
            java.lang.String r3 = "~78FFFE05059D677C5F115118CB977FD0DCE8657A2E98D251DB8D207889468BA5B05F445586ABDA6A9D6A56D1691A440130A7502B51A10555254C210B2269DADE81192591358EACBA2935B589ADB03BB9A54F29E8EF7FA60805C0"
            if (r2 == 0) goto L63
            java.lang.Object r2 = r1.next()
            r4 = r2
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            int r5 = r4.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)
            if (r5 == 0) goto L23
            goto L9
        L23:
            java.lang.Class r5 = r4.getReturnType()
            java.lang.Class r6 = java.lang.Float.TYPE
            boolean r5 = p000.ln0.m3626(r5, r6)
            if (r5 != 0) goto L30
            goto L9
        L30:
            java.lang.Class[] r5 = r4.getParameterTypes()
            r5.getClass()
            int r5 = r5.length
            if (r5 != 0) goto L9
            java.lang.Class r5 = r4.getDeclaringClass()
            java.lang.String r5 = r5.getName()
            java.lang.String r3 = p000.jf0.m2957(r3)
            boolean r3 = r5.equals(r3)
            if (r3 != 0) goto L5f
            java.lang.Class r3 = r4.getDeclaringClass()
            r3.getClass()
            java.lang.String r4 = "~78FB63178BB1426528BCCF417F937A19E92E7685A07B8088D9D0B16BB4E3886EB3F31D6F49EFEB13E5DF1E5F6DA3898C863804FA496A58500E3437CD1470F3E98FB4F971547E54EFDD891DD04B234E170783E0C1D38BAA741F2B60"
            java.lang.String r4 = p000.jf0.m2957(r4)
            boolean r3 = m3714(r3, r4)
            if (r3 == 0) goto L9
        L5f:
            r0.add(r2)
            goto L9
        L63:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L71:
            boolean r4 = r0.hasNext()
            r5 = 1
            if (r4 == 0) goto Lcb
            java.lang.Object r4 = r0.next()
            r6 = r4
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
            r13 = 0
        L9a:
            if (r13 >= r12) goto La3
            r14 = r10[r13]
            int r13 = p000.lz1.m3679(r14, r11, r13, r5)
            goto L9a
        La3:
            int r5 = r6.getModifiers()
            java.lang.reflect.Modifier.isStatic(r5)
            r16 = 0
            r17 = 62
            java.lang.String r12 = ","
            r13 = 0
            r14 = 0
            r15 = 0
            java.lang.String r5 = p000.AbstractC0984xh.m6644(r11, r12, r13, r14, r15, r16, r17)
            java.lang.String r6 = "#"
            java.lang.String r10 = "("
            java.lang.StringBuilder r5 = p000.AbstractC0602nx.m4138(r7, r6, r8, r10, r5)
            java.lang.String r6 = "):"
            boolean r5 = p000.lz1.m3673(r5, r6, r9, r1)
            if (r5 == 0) goto L71
            r2.add(r4)
            goto L71
        Lcb:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r2.iterator()
        Ld4:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Lf7
            java.lang.Object r4 = r1.next()
            r6 = r4
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            java.lang.Class r6 = r6.getDeclaringClass()
            java.lang.String r6 = r6.getName()
            java.lang.String r7 = p000.jf0.m2957(r3)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto Ld4
            r0.add(r4)
            goto Ld4
        Lf7:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lfe
            goto Lff
        Lfe:
            r2 = r0
        Lff:
            int r0 = r2.size()
            if (r0 == r5) goto L11f
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L11c
            int r0 = r2.size()
            java.lang.String r1 = "长按倍速提供方法候选不唯一，保留宿主行为 count="
            java.lang.String r0 = p000.a12.m17(r1, r0)
            r1 = 4
            java.lang.String r2 = "rcc14672cf9c445fb"
            r3 = 0
            p000.C0888ux.m5988(r2, r0, r3, r1, r3)
        L11c:
            jz r0 = p000.C0450jz.f5672
            return r0
        L11f:
            java.lang.Object r0 = p000.AbstractC0984xh.m6655(r2)
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            r1.setAccessible(r5)
            java.util.List r0 = p000.AbstractC1021yh.m6896(r0)
            return r0
    }
}
