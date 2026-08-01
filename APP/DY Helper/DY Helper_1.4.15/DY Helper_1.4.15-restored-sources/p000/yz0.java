package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class yz0 {

    /* JADX INFO: renamed from: α */
    public static final p000.yz0 f12886 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.atomic.AtomicBoolean f12887 = null;

    /* JADX INFO: renamed from: γ */
    public static final android.os.Handler f12888 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.Map f12889 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.lang.Object f12890 = null;

    /* JADX INFO: renamed from: ζ */
    public static final java.util.HashSet f12891 = null;

    /* JADX INFO: renamed from: η */
    public static final java.util.concurrent.atomic.AtomicBoolean f12892 = null;

    static {
            yz0 r0 = new yz0
            r0.<init>()
            p000.yz0.f12886 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.yz0.f12887 = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r0.<init>(r2)
            p000.yz0.f12888 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            p000.yz0.f12889 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p000.yz0.f12890 = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            p000.yz0.f12891 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.yz0.f12892 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final void m7051(java.lang.Class r8, java.lang.reflect.Method r9) {
            java.lang.Class r0 = r9.getDeclaringClass()
            boolean r0 = r0.isAssignableFrom(r8)
            if (r0 == 0) goto Lcc
            r0 = r8
        Lb:
            if (r0 == 0) goto Lbe
            java.lang.Class r1 = r9.getDeclaringClass()
            boolean r1 = r1.isAssignableFrom(r0)
            if (r1 == 0) goto Lbe
            java.lang.reflect.Method[] r1 = r0.getDeclaredMethods()
            r1.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r1.length
            r4 = 0
        L25:
            if (r4 >= r3) goto L77
            r5 = r1[r4]
            int r6 = r5.getModifiers()
            boolean r6 = java.lang.reflect.Modifier.isStatic(r6)
            if (r6 != 0) goto L74
            int r6 = r5.getModifiers()
            boolean r6 = java.lang.reflect.Modifier.isAbstract(r6)
            if (r6 != 0) goto L74
            boolean r6 = r5.isSynthetic()
            if (r6 != 0) goto L74
            boolean r6 = r5.isBridge()
            if (r6 != 0) goto L74
            java.lang.String r6 = r5.getName()
            java.lang.String r7 = r9.getName()
            boolean r6 = p000.ln0.m3626(r6, r7)
            if (r6 == 0) goto L74
            java.lang.Class[] r6 = r5.getParameterTypes()
            java.lang.Class[] r7 = r9.getParameterTypes()
            boolean r6 = java.util.Arrays.equals(r6, r7)
            if (r6 == 0) goto L74
            java.lang.Class<java.util.List> r6 = java.util.List.class
            java.lang.Class r7 = r5.getReturnType()
            boolean r6 = r6.isAssignableFrom(r7)
            if (r6 == 0) goto L74
            r2.add(r5)
        L74:
            int r4 = r4 + 1
            goto L25
        L77:
            int r1 = r2.size()
            r3 = 1
            if (r1 > r3) goto Lb0
            java.lang.Object r1 = p000.AbstractC0984xh.m6656(r2)
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            if (r1 == 0) goto Laa
            r1.setAccessible(r3)
            java.lang.Object r8 = p000.yz0.f12890
            monitor-enter(r8)
            java.util.HashSet r9 = p000.yz0.f12891     // Catch: java.lang.Throwable -> La7
            boolean r0 = r9.contains(r1)     // Catch: java.lang.Throwable -> La7
            if (r0 == 0) goto L96
            monitor-exit(r8)
            return
        L96:
            xq0 r0 = p000.xq0.f12253     // Catch: java.lang.Throwable -> La7
            oj0 r2 = new oj0     // Catch: java.lang.Throwable -> La7
            r3 = 17
            r2.<init>(r3)     // Catch: java.lang.Throwable -> La7
            r0.m6775(r1, r2)     // Catch: java.lang.Throwable -> La7
            r9.add(r1)     // Catch: java.lang.Throwable -> La7
            monitor-exit(r8)
            return
        La7:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        Laa:
            java.lang.Class r0 = r0.getSuperclass()
            goto Lb
        Lb0:
            java.lang.String r8 = r0.getName()
            java.lang.String r9 = "会话列表构建实现不唯一: "
            java.lang.String r8 = r9.concat(r8)
            p000.ql1.m4936(r8)
            return
        Lbe:
            java.lang.String r8 = r8.getName()
            java.lang.String r9 = "未找到会话列表构建实现: "
            java.lang.String r8 = r9.concat(r8)
            p000.ql1.m4936(r8)
            return
        Lcc:
            java.lang.String r8 = "运行时会话 Adapter 不属于构建契约声明类"
            p000.ql1.m4936(r8)
            return
    }
}
