package p000;

/* JADX INFO: renamed from: xb */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0978xb {

    /* JADX INFO: renamed from: ε */
    public static final p000.InterfaceC0631op[] f12098 = null;

    /* JADX INFO: renamed from: ζ */
    public static final java.lang.Object f12099 = null;

    /* JADX INFO: renamed from: η */
    public static final p000.C0884ut f12100 = null;

    /* JADX INFO: renamed from: θ */
    public static final p000.C0889uy f12101 = null;

    /* JADX INFO: renamed from: ι */
    public static final p000.C0889uy f12102 = null;

    /* JADX INFO: renamed from: κ */
    public static final p000.C0889uy f12103 = null;

    /* JADX INFO: renamed from: λ */
    public static final p000.C0889uy f12104 = null;

    /* JADX INFO: renamed from: μ */
    public static final p000.C0889uy f12105 = null;

    /* JADX INFO: renamed from: ν */
    public static final p000.C0266ez f12106 = null;

    /* JADX INFO: renamed from: ξ */
    public static final p000.C0266ez f12107 = null;

    /* JADX INFO: renamed from: ο */
    public static final p000.C0889uy f12108 = null;

    /* JADX INFO: renamed from: π */
    public static final p000.rk0 f12109 = null;

    /* JADX INFO: renamed from: ρ */
    public static final p000.u30 f12110 = null;

    /* JADX INFO: renamed from: σ */
    public static final p000.u30 f12111 = null;

    /* JADX INFO: renamed from: τ */
    public static final p000.u30 f12112 = null;

    /* JADX INFO: renamed from: υ */
    public static final p000.zz1 f12113 = null;

    static {
            r0 = 0
            op[] r0 = new p000.InterfaceC0631op[r0]
            p000.AbstractC0978xb.f12098 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p000.AbstractC0978xb.f12099 = r0
            ut r0 = new ut
            r0.<init>()
            p000.AbstractC0978xb.f12100 = r0
            uy r0 = new uy
            java.lang.String r1 = "COMPLETING_ALREADY"
            r2 = 1
            r0.<init>(r1, r2)
            p000.AbstractC0978xb.f12101 = r0
            uy r0 = new uy
            java.lang.String r1 = "COMPLETING_WAITING_CHILDREN"
            r0.<init>(r1, r2)
            p000.AbstractC0978xb.f12102 = r0
            uy r0 = new uy
            java.lang.String r1 = "COMPLETING_RETRY"
            r0.<init>(r1, r2)
            p000.AbstractC0978xb.f12103 = r0
            uy r0 = new uy
            java.lang.String r1 = "TOO_LATE_TO_CANCEL"
            r0.<init>(r1, r2)
            p000.AbstractC0978xb.f12104 = r0
            uy r0 = new uy
            java.lang.String r1 = "SEALED"
            r0.<init>(r1, r2)
            p000.AbstractC0978xb.f12105 = r0
            ez r0 = new ez
            r1 = 0
            r0.<init>(r1)
            p000.AbstractC0978xb.f12106 = r0
            ez r0 = new ez
            r1 = 1
            r0.<init>(r1)
            p000.AbstractC0978xb.f12107 = r0
            uy r0 = new uy
            java.lang.String r1 = "NULL"
            r0.<init>(r1, r2)
            p000.AbstractC0978xb.f12108 = r0
            rk0 r0 = new rk0
            r1 = 13
            r0.<init>(r1)
            p000.AbstractC0978xb.f12109 = r0
            u30 r0 = new u30
            ft r1 = p000.EnumC0297ft.f4123
            r0.<init>(r1)
            p000.AbstractC0978xb.f12110 = r0
            u30 r0 = new u30
            ft r1 = p000.EnumC0297ft.f4122
            r0.<init>(r1)
            p000.AbstractC0978xb.f12111 = r0
            u30 r0 = new u30
            ft r1 = p000.EnumC0297ft.f4124
            r0.<init>(r1)
            p000.AbstractC0978xb.f12112 = r0
            zz1 r0 = new zz1
            r1 = 13
            r2 = 0
            r0.<init>(r1, r2)
            p000.AbstractC0978xb.f12113 = r0
            return
    }

    /* JADX INFO: renamed from: Α */
    public static java.lang.reflect.Method m6556(java.lang.Class r14) {
            java.lang.reflect.Method[] r0 = r14.getDeclaredMethods()
            r0.getClass()
            int r1 = r0.length
            r2 = 0
            r3 = 0
            r6 = r2
            r4 = r3
            r5 = r4
        Ld:
            r7 = 1
            if (r4 >= r1) goto L7c
            r8 = r0[r4]
            int r9 = r8.getModifiers()
            boolean r9 = java.lang.reflect.Modifier.isStatic(r9)
            if (r9 != 0) goto L79
            boolean r9 = r8.isSynthetic()
            if (r9 != 0) goto L79
            boolean r9 = r8.isBridge()
            if (r9 != 0) goto L79
            java.lang.Class r9 = r8.getReturnType()
            java.lang.Class r10 = java.lang.Void.TYPE
            boolean r9 = p000.ln0.m3626(r9, r10)
            if (r9 == 0) goto L79
            java.lang.Class[] r9 = r8.getParameterTypes()
            int r9 = r9.length
            if (r9 != r7) goto L79
            java.lang.Class[] r9 = r8.getParameterTypes()
            r9 = r9[r3]
            java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
            boolean r9 = p000.ln0.m3626(r9, r10)
            if (r9 != 0) goto L79
            java.lang.Class[] r9 = r8.getParameterTypes()
            r9 = r9[r3]
            java.lang.reflect.Field[] r9 = r9.getDeclaredFields()
            r9.getClass()
            int r10 = r9.length
            r11 = r3
        L58:
            if (r11 >= r10) goto L79
            r12 = r9[r11]
            java.lang.Class r12 = r12.getType()
            java.lang.String r12 = r12.getName()
            java.lang.String r13 = "~79380C0D8C98F945BB08C5D5DB5DF1EAD9B59028068ACB54724044B8894FBBCB0991F2748ACD993981847A"
            java.lang.String r13 = p000.jf0.m2957(r13)
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L76
            if (r5 == 0) goto L73
            goto L80
        L73:
            r5 = r7
            r6 = r8
            goto L79
        L76:
            int r11 = r11 + 1
            goto L58
        L79:
            int r4 = r4 + 1
            goto Ld
        L7c:
            if (r5 != 0) goto L7f
            goto L80
        L7f:
            r2 = r6
        L80:
            if (r2 == 0) goto L86
            r2.setAccessible(r7)
            return r2
        L86:
            java.lang.String r14 = r14.getName()
            java.lang.String r0 = " 未找到 User 绑定方法"
            java.lang.String r14 = r14.concat(r0)
            p000.ql1.m4936(r14)
            r14 = 0
            return r14
    }

    /* JADX INFO: renamed from: Β */
    public static java.util.ArrayList m6557(java.lang.Class r8) {
            java.lang.reflect.Method[] r8 = r8.getDeclaredMethods()
            r8.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r8.length
            r2 = 0
            r3 = r2
        Lf:
            r4 = 1
            if (r3 >= r1) goto L59
            r5 = r8[r3]
            int r6 = r5.getModifiers()
            boolean r6 = java.lang.reflect.Modifier.isStatic(r6)
            if (r6 != 0) goto L56
            boolean r6 = r5.isSynthetic()
            if (r6 != 0) goto L56
            java.lang.Class r6 = r5.getReturnType()
            java.lang.Class r7 = java.lang.Void.TYPE
            boolean r6 = p000.ln0.m3626(r6, r7)
            if (r6 == 0) goto L56
            java.lang.Class[] r6 = r5.getParameterTypes()
            int r6 = r6.length
            if (r6 != r4) goto L56
            java.lang.Class[] r4 = r5.getParameterTypes()
            r4 = r4[r2]
            java.lang.Class<java.util.List> r6 = java.util.List.class
            boolean r4 = r6.isAssignableFrom(r4)
            if (r4 == 0) goto L56
            java.lang.Class[] r4 = r5.getParameterTypes()
            r4 = r4[r2]
            java.lang.Class<java.util.ArrayList> r6 = java.util.ArrayList.class
            boolean r4 = r4.isAssignableFrom(r6)
            if (r4 == 0) goto L56
            r0.add(r5)
        L56:
            int r3 = r3 + 1
            goto Lf
        L59:
            java.util.Iterator r8 = r0.iterator()
        L5d:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L6d
            java.lang.Object r1 = r8.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            r1.setAccessible(r4)
            goto L5d
        L6d:
            return r0
    }

    /* JADX INFO: renamed from: Γ */
    public static final float m6558(long r1) {
            r0 = 32
            long r1 = r1 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            return r1
    }

    /* JADX INFO: renamed from: Δ */
    public static final p000.C0015ae m6559(p000.InterfaceC0631op r6) {
            boolean r0 = r6 instanceof p000.C0334gt
            if (r0 != 0) goto Lb
            ae r0 = new ae
            r1 = 1
            r0.<init>(r1, r6)
            return r0
        Lb:
            r0 = r6
            gt r0 = (p000.C0334gt) r0
            uy r1 = p000.jx0.f5622
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = p000.C0334gt.f4444
        L12:
            java.lang.Object r3 = r2.get(r0)
            r4 = 0
            if (r3 != 0) goto L1e
            r2.set(r0, r1)
            r3 = r4
            goto L2a
        L1e:
            boolean r5 = r3 instanceof p000.C0015ae
            if (r5 == 0) goto L60
        L22:
            boolean r5 = r2.compareAndSet(r0, r3, r1)
            if (r5 == 0) goto L59
            ae r3 = (p000.C0015ae) r3
        L2a:
            if (r3 == 0) goto L52
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = p000.C0015ae.f194
            java.lang.Object r1 = r0.get(r3)
            boolean r2 = r1 instanceof p000.C0554mm
            if (r2 == 0) goto L40
            mm r1 = (p000.C0554mm) r1
            java.lang.Object r1 = r1.f7207
            if (r1 == 0) goto L40
            r3.m84()
            goto L4e
        L40:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = p000.C0015ae.f193
            r2 = 536870911(0x1fffffff, float:1.0842021E-19)
            r1.set(r3, r2)
            ｙ r1 = p000.C1155.f13523
            r0.set(r3, r1)
            r4 = r3
        L4e:
            if (r4 != 0) goto L51
            goto L52
        L51:
            return r4
        L52:
            ae r0 = new ae
            r1 = 2
            r0.<init>(r1, r6)
            return r0
        L59:
            java.lang.Object r5 = r2.get(r0)
            if (r5 == r3) goto L22
            goto L12
        L60:
            if (r3 == r1) goto L12
            boolean r4 = r3 instanceof java.lang.Throwable
            if (r4 == 0) goto L67
            goto L12
        L67:
            java.lang.String r6 = "Inconsistent state "
            p000.C1080.m7278(r3, r6)
            r6 = 0
            return r6
    }

    /* JADX INFO: renamed from: Ε */
    public static final void m6560(p000.InterfaceC0880up r4, java.lang.Throwable r5) {
            java.util.List r0 = p000.AbstractC0992xp.f12251
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r1 = r0.next()
            wp r1 = (p000.InterfaceC0955wp) r1
            r1.mo1786(r4, r5)     // Catch: java.lang.Throwable -> L16
            goto L6
        L16:
            r1 = move-exception
            if (r5 != r1) goto L1b
            r2 = r5
            goto L25
        L1b:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "Exception while trying to handle coroutine exception"
            r2.<init>(r3, r1)
            p000.ln0.m3624(r2, r5)
        L25:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r3 = r1.getUncaughtExceptionHandler()
            r3.uncaughtException(r1, r2)
            goto L6
        L31:
            rs r0 = new rs     // Catch: java.lang.Throwable -> L39
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L39
            p000.ln0.m3624(r5, r0)     // Catch: java.lang.Throwable -> L39
        L39:
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r0 = r4.getUncaughtExceptionHandler()
            r0.uncaughtException(r4, r5)
            return
    }

    /* JADX INFO: renamed from: Ζ */
    public static boolean m6561(java.lang.reflect.Method r5) {
            java.lang.Class[] r5 = r5.getParameterTypes()
            r5.getClass()
            int r0 = r5.length
            r1 = 0
            r2 = r1
        La:
            if (r2 >= r0) goto L23
            r3 = r5[r2]
            java.lang.Class<java.util.List> r4 = java.util.List.class
            boolean r4 = r4.isAssignableFrom(r3)
            if (r4 == 0) goto L20
            java.lang.Class<java.util.ArrayList> r4 = java.util.ArrayList.class
            boolean r3 = r3.isAssignableFrom(r4)
            if (r3 == 0) goto L20
            r5 = 1
            return r5
        L20:
            int r2 = r2 + 1
            goto La
        L23:
            return r1
    }

    /* JADX INFO: renamed from: Η */
    public static final p000.r01 m6562(p000.r01 r6, float r7) {
            kw1 r0 = new kw1
            r3 = 0
            r5 = 5
            r1 = 0
            r4 = r7
            r2 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r01 r6 = r6.mo4345(r0)
            return r6
    }

    /* JADX INFO: renamed from: Θ */
    public static p000.InterfaceC0631op m6563(p000.InterfaceC0631op r2) {
            r2.getClass()
            boolean r0 = r2 instanceof p000.AbstractC0695pp
            if (r0 == 0) goto Lb
            r0 = r2
            pp r0 = (p000.AbstractC0695pp) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            if (r0 == 0) goto L2a
            op r2 = r0.f8640
            if (r2 != 0) goto L2a
            up r2 = r0.mo72()
            x r1 = p000.C0966x.f11916
            sp r2 = r2.mo1785(r1)
            kotlinx.coroutines.α r2 = (kotlinx.coroutines.AbstractC0479) r2
            if (r2 == 0) goto L26
            gt r1 = new gt
            r1.<init>(r2, r0)
            goto L27
        L26:
            r1 = r0
        L27:
            r0.f8640 = r1
            return r1
        L2a:
            return r2
    }

    /* JADX INFO: renamed from: Ι */
    public static boolean m6564(byte[] r4) {
            int r0 = r4.length
            r1 = 0
            r2 = 12
            if (r0 < r2) goto L4d
            java.lang.String r0 = m6583(r4, r1)
            java.lang.String r3 = "RIFF"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L4d
            r0 = 8
            java.lang.String r0 = m6583(r4, r0)
            java.lang.String r3 = "WEBP"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L21
            goto L4d
        L21:
            int r0 = r4.length
            r3 = 21
            if (r0 < r3) goto L3b
            java.lang.String r0 = m6583(r4, r2)
            java.lang.String r2 = "VP8X"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L3b
            r0 = 20
            r0 = r4[r0]
            r0 = r0 & 2
            if (r0 == 0) goto L3b
            goto L4b
        L3b:
            java.lang.String r0 = "ANIM"
            boolean r0 = m6588(r0, r4)
            if (r0 != 0) goto L4b
            java.lang.String r0 = "ANMF"
            boolean r4 = m6588(r0, r4)
            if (r4 == 0) goto L4d
        L4b:
            r4 = 1
            return r4
        L4d:
            return r1
    }

    /* JADX INFO: renamed from: Κ */
    public static boolean m6565(android.view.MotionEvent r0, int r1) {
            int r0 = r0.getSource()
            r0 = r0 & r1
            if (r0 != r1) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: Λ */
    public static final boolean m6566(long r2) {
            r0 = 2
            long r2 = r2 & r0
            r0 = 0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto Lb
            r2 = 1
            return r2
        Lb:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: Μ */
    public static final boolean m6567(long r2) {
            r0 = 1
            long r2 = r2 & r0
            r0 = 0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto Lb
            r2 = 1
            return r2
        Lb:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: Ν */
    public static java.lang.Class m6568(java.lang.ClassLoader r1, java.lang.String r2) {
            r0 = 0
            java.lang.Class r1 = java.lang.Class.forName(r2, r0, r1)     // Catch: java.lang.Throwable -> L9
            r1.getClass()     // Catch: java.lang.Throwable -> L9
            goto L10
        L9:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        L10:
            boolean r2 = r1 instanceof p000.eo1
            if (r2 == 0) goto L15
            r1 = 0
        L15:
            java.lang.Class r1 = (java.lang.Class) r1
            return r1
    }

    /* JADX INFO: renamed from: Ξ */
    public static java.lang.Long m6569(java.lang.Object r0, java.lang.String r1) {
            java.lang.Object r0 = p000.qe0.m4879(r0, r1)     // Catch: java.lang.Throwable -> L2a
            boolean r1 = r0 instanceof java.lang.Long     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto Lb
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L2a
            return r0
        Lb:
            boolean r1 = r0 instanceof java.lang.Integer     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L1b
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L2a
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L2a
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L2a
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L2a
            return r0
        L1b:
            boolean r1 = r0 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L2a
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L2a
            long r0 = r0.longValue()     // Catch: java.lang.Throwable -> L2a
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L2a
            return r0
        L2a:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: Ο */
    public static java.lang.String m6570(java.lang.reflect.Method r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r6.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            r1 = 35
            r0.append(r1)
            java.lang.String r1 = r6.getName()
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            java.lang.Class[] r1 = r6.getParameterTypes()
            r1.getClass()
            zb0 r2 = new zb0
            r3 = 18
            r2.<init>(r3)
            r3 = 30
            java.lang.String r4 = ","
            r5 = 0
            java.lang.String r1 = p000.AbstractC0312g7.m2256(r1, r4, r5, r2, r3)
            java.lang.String r2 = "):"
            java.lang.String r6 = p000.lz1.m3692(r0, r1, r2, r6)
            return r6
    }

    /* JADX INFO: renamed from: Π */
    public static void m6571(android.content.pm.PackageInfo r2, java.io.File r3) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r0.<init>(r3, r1)
            java.io.DataOutputStream r3 = new java.io.DataOutputStream     // Catch: java.io.IOException -> L24
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L24
            r1.<init>(r0)     // Catch: java.io.IOException -> L24
            r3.<init>(r1)     // Catch: java.io.IOException -> L24
            long r0 = r2.lastUpdateTime     // Catch: java.lang.Throwable -> L1a
            r3.writeLong(r0)     // Catch: java.lang.Throwable -> L1a
            r3.close()     // Catch: java.io.IOException -> L24
            return
        L1a:
            r2 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L1f
            goto L23
        L1f:
            r3 = move-exception
            r2.addSuppressed(r3)     // Catch: java.io.IOException -> L24
        L23:
            throw r2     // Catch: java.io.IOException -> L24
        L24:
            return
    }

    /* JADX INFO: renamed from: Τ */
    public static java.lang.Object m6572(java.lang.Object r12, java.lang.String r13, java.util.Set r14) {
            java.lang.Class r0 = r12.getClass()
        L4:
            r1 = 0
            if (r0 == 0) goto Lc0
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto Lc0
            java.lang.reflect.Field[] r2 = r0.getDeclaredFields()     // Catch: java.lang.Throwable -> L1b
            r2.getClass()     // Catch: java.lang.Throwable -> L1b
            java.util.List r2 = p000.AbstractC0312g7.m2262(r2)     // Catch: java.lang.Throwable -> L1b
            goto L22
        L1b:
            r2 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r2)
            r2 = r3
        L22:
            boolean r3 = r2 instanceof p000.eo1
            if (r3 == 0) goto L28
            jz r2 = p000.C0450jz.f5672
        L28:
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r2 = r2.iterator()
        L2e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L9e
            java.lang.Object r3 = r2.next()
            r4 = r3
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            int r5 = r4.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isStatic(r5)
            if (r5 != 0) goto L2e
            java.lang.annotation.Annotation[] r5 = r4.getDeclaredAnnotations()
            r5.getClass()
            int r6 = r5.length
            r7 = 0
        L4e:
            if (r7 >= r6) goto L8c
            r8 = r5[r7]
            wf r9 = p000.ln0.m3599(r8)
            java.lang.Class r9 = p000.ln0.m3604(r9)
            java.lang.String r10 = r9.getName()
            java.lang.String r11 = "com.google.gson.annotations.SerializedName"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L89
            java.lang.String r5 = "value"
            java.lang.reflect.Method r5 = r9.getDeclaredMethod(r5, r1)     // Catch: java.lang.Throwable -> L77
            java.lang.Object r5 = r5.invoke(r8, r1)     // Catch: java.lang.Throwable -> L77
            boolean r6 = r5 instanceof java.lang.String     // Catch: java.lang.Throwable -> L77
            if (r6 == 0) goto L79
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L77
            goto L81
        L77:
            r5 = move-exception
            goto L7b
        L79:
            r5 = r1
            goto L81
        L7b:
            eo1 r6 = new eo1
            r6.<init>(r5)
            r5 = r6
        L81:
            boolean r6 = r5 instanceof p000.eo1
            if (r6 == 0) goto L86
            r5 = r1
        L86:
            java.lang.String r5 = (java.lang.String) r5
            goto L8d
        L89:
            int r7 = r7 + 1
            goto L4e
        L8c:
            r5 = r1
        L8d:
            boolean r5 = p000.ln0.m3626(r5, r13)
            if (r5 != 0) goto L9f
            java.lang.String r4 = r4.getName()
            boolean r4 = r14.contains(r4)
            if (r4 == 0) goto L2e
            goto L9f
        L9e:
            r3 = r1
        L9f:
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            if (r3 == 0) goto Lba
            r13 = 1
            r3.setAccessible(r13)     // Catch: java.lang.Throwable -> Lac
            java.lang.Object r12 = r3.get(r12)     // Catch: java.lang.Throwable -> Lac
            goto Lb3
        Lac:
            r12 = move-exception
            eo1 r13 = new eo1
            r13.<init>(r12)
            r12 = r13
        Lb3:
            boolean r13 = r12 instanceof p000.eo1
            if (r13 == 0) goto Lb8
            goto Lb9
        Lb8:
            r1 = r12
        Lb9:
            return r1
        Lba:
            java.lang.Class r0 = r0.getSuperclass()
            goto L4
        Lc0:
            return r1
    }

    /* JADX INFO: renamed from: Υ */
    public static void m6573(android.app.Activity r26, p000.fk0 r27) {
            r0 = r27
            r1 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 80
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            xx r3 = p000.jx0.m3049(r26)
            java.lang.String r4 = r3.f12366
            android.widget.EditText r5 = r0.f3989
            android.widget.TextView r6 = r0.f3982
            android.widget.Button r7 = r0.f3995
            android.widget.TextView r8 = r0.f3985
            android.widget.TextView r9 = r0.f3990
            android.view.View r10 = r0.f3975
            android.text.Editable r5 = r5.getText()
            if (r5 == 0) goto L2a
            java.lang.String r5 = r5.toString()
            goto L2b
        L2a:
            r5 = 0
        L2b:
            java.lang.String r12 = ""
            if (r5 != 0) goto L30
            r5 = r12
        L30:
            android.widget.EditText r0 = r0.f3984
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L3d
            java.lang.String r0 = r0.toString()
            goto L3e
        L3d:
            r0 = 0
        L3e:
            if (r0 != 0) goto L41
            r0 = r12
        L41:
            ym1 r13 = p000.hk0.f4753
            java.util.Locale r13 = java.util.Locale.getDefault()
            r13.getClass()
            boolean r13 = p000.hk0.m2513(r5, r13)
            boolean r14 = p000.hk0.m2514(r0)
            int r15 = r0.length()
            r16 = 0
            r11 = 0
            int r15 = r0.codePointCount(r11, r15)
            int r17 = r0.length()
            if (r17 != 0) goto L69
            r18 = r0
            r17 = r4
            r0 = r11
            goto Laa
        L69:
            java.lang.String r11 = "\r\n"
            r17 = r4
            java.lang.String r4 = "\n"
            java.lang.String r4 = p000.x02.m6483(r0, r11, r4)
            r11 = 13
            r18 = r0
            r0 = 10
            java.lang.String r4 = r4.replace(r11, r0)
            r4.getClass()
            r11 = 8232(0x2028, float:1.1535E-41)
            java.lang.String r4 = r4.replace(r11, r0)
            r4.getClass()
            r11 = 8233(0x2029, float:1.1537E-41)
            java.lang.String r0 = r4.replace(r11, r0)
            r0.getClass()
            es0 r4 = new es0
            r4.<init>(r0)
            r0 = 0
        L98:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto Laa
            r4.next()
            int r0 = r0 + 1
            if (r0 < 0) goto La6
            goto L98
        La6:
            p000.AbstractC1021yh.m6916()
            throw r16
        Laa:
            android.content.res.Resources r4 = r10.getResources()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r15)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r11, r2, r0, r1}
            r11 = 2131689579(0x7f0f006b, float:1.9008177E38)
            java.lang.String r0 = r4.getString(r11, r0)
            r8.setText(r0)
            if (r14 == 0) goto Lc9
            java.lang.String r0 = r3.f12357
            goto Lcb
        Lc9:
            r0 = r17
        Lcb:
            int r0 = android.graphics.Color.parseColor(r0)
            r8.setTextColor(r0)
            android.content.res.Resources r0 = r10.getResources()
            if (r13 == 0) goto Ldc
            r4 = 2131689571(0x7f0f0063, float:1.9008161E38)
            goto Ldf
        Ldc:
            r4 = 2131689567(0x7f0f005f, float:1.9008153E38)
        Ldf:
            java.lang.String r0 = r0.getString(r4)
            r9.setText(r0)
            if (r13 == 0) goto Leb
            java.lang.String r0 = r3.f12358
            goto Led
        Leb:
            r0 = r17
        Led:
            int r0 = android.graphics.Color.parseColor(r0)
            r9.setTextColor(r0)
            if (r13 == 0) goto Lf9
            java.lang.String r0 = r3.f12359
            goto Lfb
        Lf9:
            java.lang.String r0 = r3.f12367
        Lfb:
            r4 = 99
            r8 = r26
            android.graphics.drawable.GradientDrawable r0 = p000.jx0.m3062(r4, r8, r0)
            r9.setBackground(r0)
            if (r13 == 0) goto L10c
            if (r14 == 0) goto L10c
            r0 = 1
            goto L10d
        L10c:
            r0 = 0
        L10d:
            r7.setEnabled(r0)
            if (r0 == 0) goto L115
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L118
        L115:
            r4 = 1056293519(0x3ef5c28f, float:0.48)
        L118:
            r7.setAlpha(r4)
            if (r0 == 0) goto L148
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            dk0 r19 = new dk0
            ym1 r2 = p000.hk0.f4753
            java.lang.String r22 = p000.hk0.m2516(r5)
            java.lang.String r23 = p000.hk0.m2517(r18)
            java.lang.String r24 = "#000000"
            java.lang.String r25 = "#FFFFFF"
            r20 = 1
            r21 = 0
            r19.<init>(r20, r21, r22, r23, r24, r25)
            r2 = r19
            r4 = 0
            java.lang.String r1 = p000.C0966x.m6426(r1, r4, r2)
            if (r1 != 0) goto L146
            goto L16a
        L146:
            r12 = r1
            goto L16a
        L148:
            if (r14 != 0) goto L15b
            android.content.res.Resources r4 = r10.getResources()
            r5 = 2131689577(0x7f0f0069, float:1.9008173E38)
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1}
            java.lang.String r1 = r4.getString(r5, r1)
        L159:
            r12 = r1
            goto L167
        L15b:
            android.content.res.Resources r1 = r10.getResources()
            r2 = 2131689563(0x7f0f005b, float:1.9008145E38)
            java.lang.String r1 = r1.getString(r2)
            goto L159
        L167:
            r12.getClass()
        L16a:
            r6.setText(r12)
            if (r0 == 0) goto L172
            java.lang.String r4 = r3.f12356
            goto L174
        L172:
            r4 = r17
        L174:
            int r0 = android.graphics.Color.parseColor(r4)
            r6.setTextColor(r0)
            return
    }

    /* JADX INFO: renamed from: Φ */
    public static final p000.tt0 m6574(float r5, float r6, int r7, int r8) {
            if (r7 <= 0) goto L7e
            if (r8 <= 0) goto L7e
            float r0 = java.lang.Math.abs(r5)
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L7e
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 > 0) goto L16
            goto L7e
        L16:
            float r0 = java.lang.Math.abs(r6)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L27
            r0 = 1056964608(0x3f000000, float:0.5)
            r1 = 1069547520(0x3fc00000, float:1.5)
            float r6 = p000.j81.m2905(r6, r0, r1)
            goto L29
        L27:
            r6 = 1065353216(0x3f800000, float:1.0)
        L29:
            r0 = 1090519040(0x41000000, float:8.0)
            float r0 = r0 * r5
            int r0 = p000.jx0.m3061(r0)
            r1 = 0
            if (r0 >= 0) goto L34
            r0 = r1
        L34:
            int r0 = r0 * 2
            int r0 = r7 - r0
            if (r0 > 0) goto L3b
            goto L7e
        L3b:
            float r0 = (float) r0
            float r0 = r0 * r6
            int r0 = p000.jx0.m3061(r0)
            r2 = 1
            int r0 = p000.j81.m2906(r0, r2, r7)
            int r7 = r7 - r0
            int r7 = r7 / 2
            if (r7 >= 0) goto L4c
            r7 = r1
        L4c:
            r3 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 * r6
            float r3 = r3 * r5
            int r3 = p000.jx0.m3061(r3)
            if (r3 >= 0) goto L57
            goto L58
        L57:
            r1 = r3
        L58:
            int r3 = r1 * 2
            int r3 = r8 - r3
            if (r3 > 0) goto L5f
            goto L7e
        L5f:
            r4 = 1115684864(0x42800000, float:64.0)
            float r6 = r6 * r4
            float r6 = r6 * r5
            int r5 = p000.jx0.m3061(r6)
            if (r5 >= r2) goto L6a
            goto L6b
        L6a:
            r2 = r5
        L6b:
            int r5 = java.lang.Math.min(r3, r2)
            int r6 = r8 - r1
            if (r6 <= r8) goto L74
            goto L75
        L74:
            r8 = r6
        L75:
            tt0 r6 = new tt0
            int r5 = r8 - r5
            int r0 = r0 + r7
            r6.<init>(r7, r5, r0, r8)
            return r6
        L7e:
            r5 = 0
            return r5
    }

    /* JADX INFO: renamed from: Χ */
    public static p000.ge0 m6575(java.lang.ClassLoader r28) {
            r0 = r28
            r0.getClass()
            java.lang.String r1 = "~78AF64D165955DDE117C70B1E9A06054CFEF62BE1AC901EDEBA85D2EE989A07FCB79ACE511A6B3311FF8BA6D1015A199C132300BE834860CD704282784CAB9B8DD137F65E4389D346AD579649BD2"
            java.lang.String r1 = p000.jf0.m2957(r1)
            r2 = 0
            java.lang.Class r1 = java.lang.Class.forName(r1, r2, r0)
            r1.getClass()
            java.lang.reflect.Method[] r1 = r1.getDeclaredMethods()
            r1.getClass()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r1.length
            r5 = r2
        L21:
            java.lang.Class<java.util.ArrayList> r6 = java.util.ArrayList.class
            java.lang.Class<java.util.List> r7 = java.util.List.class
            r8 = 1
            if (r5 >= r4) goto L73
            r9 = r1[r5]
            int r10 = r9.getModifiers()
            boolean r10 = java.lang.reflect.Modifier.isStatic(r10)
            if (r10 != 0) goto L70
            boolean r10 = r9.isSynthetic()
            if (r10 != 0) goto L70
            java.lang.Class[] r10 = r9.getParameterTypes()
            int r10 = r10.length
            if (r10 != r8) goto L70
            java.lang.Class[] r8 = r9.getParameterTypes()
            r8 = r8[r2]
            boolean r8 = r7.isAssignableFrom(r8)
            if (r8 == 0) goto L70
            java.lang.Class[] r8 = r9.getParameterTypes()
            r8 = r8[r2]
            boolean r8 = r8.isAssignableFrom(r6)
            if (r8 == 0) goto L70
            java.lang.Class r8 = r9.getReturnType()
            boolean r7 = r7.isAssignableFrom(r8)
            if (r7 == 0) goto L70
            java.lang.Class r7 = r9.getReturnType()
            boolean r6 = r7.isAssignableFrom(r6)
            if (r6 == 0) goto L70
            r3.add(r9)
        L70:
            int r5 = r5 + 1
            goto L21
        L73:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r3 = r3.iterator()
        L81:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L9c
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            java.lang.String r5 = m6570(r5)
            boolean r5 = r1.add(r5)
            if (r5 == 0) goto L81
            r10.add(r4)
            goto L81
        L9c:
            java.lang.String r1 = "~78A3D0A0088990942E83A71740186617157A6B7152A0CBE49DB7CBA683D94B23CF5CEED901A0D7A159A11F5C018BC420347A6C47BD474EBEC5EED980BDCB3CCB1F80E42902431D87FA04E53C6F"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.Class r11 = java.lang.Class.forName(r1, r2, r0)
            r11.getClass()
            java.lang.reflect.Method[] r1 = r11.getDeclaredMethods()
            r1.getClass()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r1.length
            r5 = r2
        Lb7:
            if (r5 >= r4) goto Ld7
            r9 = r1[r5]
            int r12 = r9.getModifiers()
            boolean r12 = java.lang.reflect.Modifier.isStatic(r12)
            if (r12 != 0) goto Ld4
            boolean r12 = r9.isSynthetic()
            if (r12 != 0) goto Ld4
            boolean r12 = m6561(r9)
            if (r12 == 0) goto Ld4
            r3.add(r9)
        Ld4:
            int r5 = r5 + 1
            goto Lb7
        Ld7:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r3 = r3.iterator()
        Le5:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L100
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            java.lang.String r5 = m6570(r5)
            boolean r5 = r1.add(r5)
            if (r5 == 0) goto Le5
            r12.add(r4)
            goto Le5
        L100:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.Class r3 = r11.getSuperclass()
        L109:
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            if (r3 == 0) goto L149
            boolean r5 = r3.equals(r4)
            if (r5 != 0) goto L149
            java.lang.reflect.Method[] r4 = r3.getDeclaredMethods()
            r4.getClass()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r9 = r4.length
            r13 = r2
        L121:
            if (r13 >= r9) goto L141
            r14 = r4[r13]
            int r15 = r14.getModifiers()
            boolean r15 = java.lang.reflect.Modifier.isStatic(r15)
            if (r15 != 0) goto L13e
            boolean r15 = r14.isSynthetic()
            if (r15 != 0) goto L13e
            boolean r15 = m6561(r14)
            if (r15 == 0) goto L13e
            r5.add(r14)
        L13e:
            int r13 = r13 + 1
            goto L121
        L141:
            p000.AbstractC0984xh.m6660(r1, r5)
            java.lang.Class r3 = r3.getSuperclass()
            goto L109
        L149:
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r1 = r1.iterator()
        L157:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L172
            java.lang.Object r5 = r1.next()
            r9 = r5
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            java.lang.String r9 = m6570(r9)
            boolean r9 = r3.add(r9)
            if (r9 == 0) goto L157
            r13.add(r5)
            goto L157
        L172:
            java.lang.String r1 = "~78B71E7541C477E838C50BCD302E054C40CC02248AA0B9F3FD7794A79052902A0400E7382B432A21F9BF58F688C4861E7C9AA68079D23C2D6A67025C326110EDFD582A79445BBF4A"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.Class r1 = java.lang.Class.forName(r1, r2, r0)
            r1.getClass()
            java.lang.reflect.Method[] r3 = r1.getDeclaredMethods()
            r3.getClass()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r9 = r3.length
            r14 = r2
        L18d:
            if (r14 >= r9) goto L1ad
            r15 = r3[r14]
            int r16 = r15.getModifiers()
            boolean r16 = java.lang.reflect.Modifier.isStatic(r16)
            if (r16 != 0) goto L1aa
            boolean r16 = r15.isSynthetic()
            if (r16 != 0) goto L1aa
            boolean r16 = m6561(r15)
            if (r16 == 0) goto L1aa
            r5.add(r15)
        L1aa:
            int r14 = r14 + 1
            goto L18d
        L1ad:
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r5 = r5.iterator()
        L1bb:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L1d6
            java.lang.Object r9 = r5.next()
            r15 = r9
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            java.lang.String r15 = m6570(r15)
            boolean r15 = r3.add(r15)
            if (r15 == 0) goto L1bb
            r14.add(r9)
            goto L1bb
        L1d6:
            java.lang.String r3 = "~78ABF9C3EBB978C766D1EEE85DA4659DFA297141942A5334E9F5CC3DD42CA3B4C9D5F8CCC9E39E4E7511F9A815B5680D7FAE2EFCF3BFFC0DFE7A0EEC8DDE9289F080AB9186D87770A968FC28657F83"
            java.lang.String r3 = p000.jf0.m2957(r3)
            java.lang.Class r3 = java.lang.Class.forName(r3, r2, r0)
            r3.getClass()
            java.lang.reflect.Method[] r3 = r3.getDeclaredMethods()
            r3.getClass()
            int r5 = r3.length
            r15 = r2
            r16 = r15
            r18 = r16
            r17 = 0
        L1f2:
            java.lang.Class r2 = java.lang.Boolean.TYPE
            java.lang.Class r9 = java.lang.Void.TYPE
            if (r15 >= r5) goto L2f8
            r19 = r3[r15]
            int r20 = r19.getModifiers()
            boolean r20 = java.lang.reflect.Modifier.isStatic(r20)
            if (r20 != 0) goto L2e9
            boolean r20 = r19.isSynthetic()
            if (r20 != 0) goto L2e9
            java.lang.Class r8 = r19.getReturnType()
            boolean r8 = p000.ln0.m3626(r8, r9)
            if (r8 == 0) goto L2e9
            java.lang.Class[] r8 = r19.getParameterTypes()
            int r8 = r8.length
            r21 = r1
            r1 = 1
            if (r8 != r1) goto L239
            java.lang.Class[] r1 = r19.getParameterTypes()
            r1 = r1[r18]
            r1.getClass()
            boolean r8 = r1.isPrimitive()
            if (r8 != 0) goto L239
            boolean r8 = r1.isArray()
            if (r8 != 0) goto L239
            boolean r8 = r1.equals(r4)
            if (r8 == 0) goto L23f
        L239:
            r23 = r3
            r24 = r4
            goto L2ed
        L23f:
            java.lang.reflect.Field[] r8 = r1.getDeclaredFields()
            r8.getClass()
            r22 = r1
            int r1 = r8.length
            r23 = r3
            r24 = r4
            r3 = r18
            r4 = r3
        L250:
            if (r3 >= r1) goto L274
            r25 = r8[r3]
            int r26 = r25.getModifiers()
            boolean r26 = java.lang.reflect.Modifier.isStatic(r26)
            if (r26 != 0) goto L26d
            r26 = r1
            java.lang.Class r1 = r25.getType()
            boolean r1 = r7.isAssignableFrom(r1)
            if (r1 == 0) goto L26f
            int r4 = r4 + 1
            goto L26f
        L26d:
            r26 = r1
        L26f:
            int r3 = r3 + 1
            r1 = r26
            goto L250
        L274:
            r1 = 2
            if (r4 >= r1) goto L279
            goto L2ed
        L279:
            java.lang.reflect.Constructor[] r1 = r22.getDeclaredConstructors()
            r1.getClass()
            int r3 = r1.length
            r4 = r18
        L283:
            if (r4 >= r3) goto L2ed
            r8 = r1[r4]
            java.lang.Class[] r8 = r8.getParameterTypes()
            r8.getClass()
            r22 = r1
            int r1 = r8.length
            r25 = r3
            r26 = r4
            r3 = r18
            r4 = r3
        L298:
            if (r3 >= r1) goto L2ab
            r27 = r1
            r1 = r8[r3]
            boolean r1 = p000.ln0.m3626(r1, r2)
            if (r1 == 0) goto L2a6
            int r4 = r4 + 1
        L2a6:
            int r3 = r3 + 1
            r1 = r27
            goto L298
        L2ab:
            r1 = 3
            if (r4 < r1) goto L2e2
            int r1 = r8.length
            r3 = r18
            r4 = r3
        L2b2:
            if (r3 >= r1) goto L2c5
            r27 = r1
            r1 = r8[r3]
            boolean r1 = r7.isAssignableFrom(r1)
            if (r1 == 0) goto L2c0
            int r4 = r4 + 1
        L2c0:
            int r3 = r3 + 1
            r1 = r27
            goto L2b2
        L2c5:
            r1 = 2
            if (r4 < r1) goto L2e2
            int r1 = r8.length
            r3 = r18
        L2cb:
            if (r3 >= r1) goto L2e2
            r4 = r8[r3]
            boolean r4 = r4.isEnum()
            if (r4 == 0) goto L2df
            if (r16 == 0) goto L2da
        L2d7:
            r17 = 0
            goto L2fd
        L2da:
            r17 = r19
            r16 = 1
            goto L2ed
        L2df:
            int r3 = r3 + 1
            goto L2cb
        L2e2:
            int r4 = r26 + 1
            r1 = r22
            r3 = r25
            goto L283
        L2e9:
            r21 = r1
            goto L239
        L2ed:
            int r15 = r15 + 1
            r1 = r21
            r3 = r23
            r4 = r24
            r8 = 1
            goto L1f2
        L2f8:
            r21 = r1
            if (r16 != 0) goto L2fd
            goto L2d7
        L2fd:
            if (r17 == 0) goto L6a0
            java.lang.Class[] r1 = r17.getParameterTypes()
            r15 = r1[r18]
            java.util.List r1 = p000.AbstractC1021yh.m6896(r17)
            java.lang.reflect.Method[] r3 = r21.getDeclaredMethods()
            r3.getClass()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r3.length
            r8 = r18
        L318:
            if (r8 >= r5) goto L35c
            r16 = r3
            r3 = r16[r8]
            int r17 = r3.getModifiers()
            boolean r17 = java.lang.reflect.Modifier.isStatic(r17)
            if (r17 != 0) goto L351
            boolean r17 = r3.isSynthetic()
            if (r17 != 0) goto L351
            r17 = r5
            java.lang.Class[] r5 = r3.getParameterTypes()
            r5.getClass()
            r19 = r8
            int r8 = r5.length
            r21 = r5
            r5 = r18
        L33e:
            if (r5 >= r8) goto L355
            r22 = r5
            r5 = r21[r22]
            boolean r5 = p000.ln0.m3626(r5, r15)
            if (r5 == 0) goto L34e
            r4.add(r3)
            goto L355
        L34e:
            int r5 = r22 + 1
            goto L33e
        L351:
            r17 = r5
            r19 = r8
        L355:
            int r8 = r19 + 1
            r3 = r16
            r5 = r17
            goto L318
        L35c:
            java.util.ArrayList r1 = p000.AbstractC0984xh.m6651(r1, r4)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
        L36e:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L389
            java.lang.Object r5 = r1.next()
            r8 = r5
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            java.lang.String r8 = m6570(r8)
            boolean r8 = r3.add(r8)
            if (r8 == 0) goto L36e
            r4.add(r5)
            goto L36e
        L389:
            java.lang.String r1 = "~7897B8FB4A9E8F3BF9B516DDE3F6FCD5574085CBE8B4160971D84C17A47F94016DC6C8B8B5DB54E7D4881324504ED7ED68C581E6218FC13E49FC0F424B599997"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.Class r1 = m6568(r0, r1)
            if (r1 != 0) goto L397
        L395:
            r5 = 0
            goto L3bd
        L397:
            java.lang.String r3 = "~788B5F4DE0E38014A7A1F3F88E7C9C04EDA5F6AEF63EFCCE655A148DE001A79FB304D8450D73EB964A7CB66C820D2CE87C9B229DBEE63017D4C504E7C8FB0DF57DEEA727AC8AC7"
            java.lang.String r3 = p000.jf0.m2957(r3)
            java.lang.Class r3 = m6568(r0, r3)
            if (r3 != 0) goto L3a4
            goto L395
        L3a4:
            boolean r5 = r1.isAssignableFrom(r3)
            if (r5 != 0) goto L3ab
            goto L395
        L3ab:
            java.util.ArrayList r1 = m6557(r1)
            java.lang.Object r1 = p000.AbstractC0984xh.m6656(r1)
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            if (r1 != 0) goto L3b8
            goto L395
        L3b8:
            fe0 r5 = new fe0
            r5.<init>(r3, r1)
        L3bd:
            java.util.List r1 = p000.AbstractC1021yh.m6898(r5)
            java.lang.String r3 = "~78BBAA042CD8BAA2073ADC6B9996030F9A590BEBC2C973FA8B68022FFA027B760125A8172C4452B7ADBAF5868B56EAFEB6D8F2C834E6C894549AFDF13D7AB88523E89C3C880D10F0312567"
            java.lang.String r3 = p000.jf0.m2957(r3)
            java.lang.Class r3 = m6568(r0, r3)
            if (r3 != 0) goto L3d3
            jz r2 = p000.C0450jz.f5672
            r17 = r11
            goto L506
        L3d3:
            java.lang.reflect.Method[] r8 = r3.getDeclaredMethods()
            r8.getClass()
            int r5 = r8.length
            r19 = r8
            r8 = r18
            r17 = r8
            r21 = 0
        L3e3:
            if (r8 >= r5) goto L44d
            r22 = r19[r8]
            int r23 = r22.getModifiers()
            boolean r23 = java.lang.reflect.Modifier.isStatic(r23)
            if (r23 != 0) goto L445
            boolean r23 = r22.isSynthetic()
            if (r23 != 0) goto L445
            boolean r23 = r22.isBridge()
            if (r23 != 0) goto L445
            r23 = r5
            java.lang.Class r5 = r22.getReturnType()
            boolean r5 = p000.ln0.m3626(r5, r9)
            if (r5 == 0) goto L442
            java.lang.Class[] r5 = r22.getParameterTypes()
            int r5 = r5.length
            r24 = r8
            r8 = 2
            if (r5 != r8) goto L448
            java.lang.Class[] r5 = r22.getParameterTypes()
            r5 = r5[r18]
            boolean r5 = r7.isAssignableFrom(r5)
            if (r5 == 0) goto L448
            java.lang.Class[] r5 = r22.getParameterTypes()
            r5 = r5[r18]
            boolean r5 = r5.isAssignableFrom(r6)
            if (r5 == 0) goto L448
            java.lang.Class[] r5 = r22.getParameterTypes()
            r20 = 1
            r5 = r5[r20]
            boolean r5 = p000.ln0.m3626(r5, r2)
            if (r5 == 0) goto L448
            if (r17 == 0) goto L43d
        L43b:
            r2 = 0
            goto L452
        L43d:
            r21 = r22
            r17 = 1
            goto L448
        L442:
            r24 = r8
            goto L448
        L445:
            r23 = r5
            goto L442
        L448:
            int r8 = r24 + 1
            r5 = r23
            goto L3e3
        L44d:
            if (r17 != 0) goto L450
            goto L43b
        L450:
            r2 = r21
        L452:
            java.lang.reflect.Method[] r5 = r3.getDeclaredMethods()
            r5.getClass()
            int r8 = r5.length
            r19 = r5
            r5 = r18
            r17 = r5
            r21 = 0
        L462:
            if (r5 >= r8) goto L4ce
            r22 = r19[r5]
            int r23 = r22.getModifiers()
            boolean r23 = java.lang.reflect.Modifier.isStatic(r23)
            if (r23 != 0) goto L4c6
            boolean r23 = r22.isSynthetic()
            if (r23 != 0) goto L4c6
            boolean r23 = r22.isBridge()
            if (r23 != 0) goto L4c6
            r23 = r5
            java.lang.Class r5 = r22.getReturnType()
            boolean r5 = p000.ln0.m3626(r5, r9)
            if (r5 == 0) goto L4c3
            java.lang.Class[] r5 = r22.getParameterTypes()
            int r5 = r5.length
            r24 = r8
            r8 = 2
            if (r5 != r8) goto L4c9
            java.lang.Class[] r5 = r22.getParameterTypes()
            r5 = r5[r18]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            boolean r5 = p000.ln0.m3626(r5, r8)
            if (r5 == 0) goto L4c9
            java.lang.Class[] r5 = r22.getParameterTypes()
            r20 = 1
            r5 = r5[r20]
            boolean r5 = r7.isAssignableFrom(r5)
            if (r5 == 0) goto L4c9
            java.lang.Class[] r5 = r22.getParameterTypes()
            r5 = r5[r20]
            boolean r5 = r5.isAssignableFrom(r6)
            if (r5 == 0) goto L4c9
            if (r17 == 0) goto L4be
        L4bc:
            r5 = 0
            goto L4d3
        L4be:
            r21 = r22
            r17 = 1
            goto L4c9
        L4c3:
            r24 = r8
            goto L4c9
        L4c6:
            r23 = r5
            goto L4c3
        L4c9:
            int r5 = r23 + 1
            r8 = r24
            goto L462
        L4ce:
            if (r17 != 0) goto L4d1
            goto L4bc
        L4d1:
            r5 = r21
        L4d3:
            java.lang.reflect.Method[] r2 = new java.lang.reflect.Method[]{r2, r5}
            java.util.ArrayList r2 = p000.AbstractC0312g7.m2248(r2)
            java.util.ArrayList r5 = new java.util.ArrayList
            r17 = r11
            r8 = 10
            int r11 = p000.AbstractC1021yh.m6889(r2, r8)
            r5.<init>(r11)
            java.util.Iterator r2 = r2.iterator()
        L4ec:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L505
            java.lang.Object r8 = r2.next()
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            r11 = 1
            r8.setAccessible(r11)
            fe0 r11 = new fe0
            r11.<init>(r3, r8)
            r5.add(r11)
            goto L4ec
        L505:
            r2 = r5
        L506:
            java.util.ArrayList r1 = p000.AbstractC0984xh.m6651(r1, r2)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r1 = r1.iterator()
        L518:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L553
            java.lang.Object r5 = r1.next()
            r8 = r5
            fe0 r8 = (p000.fe0) r8
            java.lang.reflect.Method r11 = r8.f3910
            java.lang.String r11 = m6570(r11)
            java.lang.Class r8 = r8.f3911
            java.lang.String r8 = r8.getName()
            r19 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r11)
            java.lang.String r11 = "@"
            r1.append(r11)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            boolean r1 = r2.add(r1)
            if (r1 == 0) goto L550
            r3.add(r5)
        L550:
            r1 = r19
            goto L518
        L553:
            java.lang.String r1 = "~789F9198A9AE6768B1E75F22FE4AFF5FB8139FFB2E3E8ED9059A4B8CF08774D36F4F93B73A890A56F525E3D6445175DD3230C44F274678827C4CCE0E6F5922D3B13B"
            java.lang.String r1 = p000.jf0.m2957(r1)
            java.lang.Class r0 = m6568(r0, r1)
            if (r0 != 0) goto L562
        L55f:
            r9 = 0
            goto L5eb
        L562:
            java.lang.reflect.Method[] r1 = r0.getDeclaredMethods()
            r1.getClass()
            int r2 = r1.length
            r5 = r18
            r8 = r5
            r11 = 0
        L56e:
            if (r8 >= r2) goto L5db
            r19 = r1[r8]
            int r21 = r19.getModifiers()
            boolean r21 = java.lang.reflect.Modifier.isStatic(r21)
            if (r21 != 0) goto L5d1
            boolean r21 = r19.isSynthetic()
            if (r21 != 0) goto L5d1
            boolean r21 = r19.isBridge()
            if (r21 != 0) goto L5d1
            r28 = r1
            java.lang.Class r1 = r19.getReturnType()
            boolean r1 = p000.ln0.m3626(r1, r9)
            if (r1 == 0) goto L5ce
            java.lang.Class[] r1 = r19.getParameterTypes()
            int r1 = r1.length
            r21 = r2
            r2 = 2
            if (r1 != r2) goto L5d4
            java.lang.Class[] r1 = r19.getParameterTypes()
            r1 = r1[r18]
            boolean r1 = r7.isAssignableFrom(r1)
            if (r1 == 0) goto L5d4
            java.lang.Class[] r1 = r19.getParameterTypes()
            r1 = r1[r18]
            boolean r1 = r1.isAssignableFrom(r6)
            if (r1 == 0) goto L5d4
            java.lang.Class[] r1 = r19.getParameterTypes()
            r20 = 1
            r1 = r1[r20]
            java.lang.Class<java.util.Map> r2 = java.util.Map.class
            boolean r1 = r2.isAssignableFrom(r1)
            if (r1 == 0) goto L5d4
            if (r5 == 0) goto L5ca
        L5c8:
            r11 = 0
            goto L5de
        L5ca:
            r11 = r19
            r5 = 1
            goto L5d4
        L5ce:
            r21 = r2
            goto L5d4
        L5d1:
            r28 = r1
            goto L5ce
        L5d4:
            int r8 = r8 + 1
            r1 = r28
            r2 = r21
            goto L56e
        L5db:
            if (r5 != 0) goto L5de
            goto L5c8
        L5de:
            if (r11 != 0) goto L5e2
            goto L55f
        L5e2:
            r1 = 1
            r11.setAccessible(r1)
            fe0 r9 = new fe0
            r9.<init>(r0, r11)
        L5eb:
            java.util.List r0 = p000.AbstractC1021yh.m6898(r9)
            boolean r1 = r10.isEmpty()
            if (r1 != 0) goto L69a
            boolean r1 = r12.isEmpty()
            if (r1 != 0) goto L694
            boolean r1 = r14.isEmpty()
            if (r1 != 0) goto L68e
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L687
            java.util.ArrayList r1 = p000.AbstractC0984xh.m6651(r10, r12)
            java.util.ArrayList r1 = p000.AbstractC0984xh.m6651(r1, r13)
            java.util.ArrayList r1 = p000.AbstractC0984xh.m6651(r1, r14)
            java.util.ArrayList r1 = p000.AbstractC0984xh.m6651(r1, r4)
            java.util.ArrayList r2 = new java.util.ArrayList
            r8 = 10
            int r5 = p000.AbstractC1021yh.m6889(r3, r8)
            r2.<init>(r5)
            java.util.Iterator r5 = r3.iterator()
        L626:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L638
            java.lang.Object r6 = r5.next()
            fe0 r6 = (p000.fe0) r6
            java.lang.reflect.Method r6 = r6.f3910
            r2.add(r6)
            goto L626
        L638:
            java.util.ArrayList r1 = p000.AbstractC0984xh.m6651(r1, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r8 = 10
            int r5 = p000.AbstractC1021yh.m6889(r0, r8)
            r2.<init>(r5)
            java.util.Iterator r5 = r0.iterator()
        L64b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L65d
            java.lang.Object r6 = r5.next()
            fe0 r6 = (p000.fe0) r6
            java.lang.reflect.Method r6 = r6.f3910
            r2.add(r6)
            goto L64b
        L65d:
            java.util.ArrayList r1 = p000.AbstractC0984xh.m6651(r1, r2)
            java.util.Iterator r1 = r1.iterator()
        L665:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L676
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            r11 = 1
            r2.setAccessible(r11)
            goto L665
        L676:
            ge0 r9 = new ge0
            r15.getClass()
            r18 = r0
            r16 = r4
            r11 = r17
            r17 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r9
        L687:
            java.lang.String r0 = "未找到二级分享联系人状态入口"
            p000.C1080.m7275(r0)
        L68c:
            r0 = 0
            return r0
        L68e:
            java.lang.String r0 = "未找到二级分享面板列表入口"
            p000.C1080.m7275(r0)
            goto L68c
        L694:
            java.lang.String r0 = "未找到完整联系人选择器列表方法"
            p000.C1080.m7275(r0)
            goto L68c
        L69a:
            java.lang.String r0 = "未找到分享搜索过滤方法"
            p000.C1080.m7275(r0)
            goto L68c
        L6a0:
            java.lang.String r0 = "未找到二级分享联系人状态绑定方法"
            p000.ql1.m4936(r0)
            goto L68c
    }

    /* JADX INFO: renamed from: Ψ */
    public static p000.ce0 m6576(java.lang.Class r29) {
            r29.getClass()
            java.lang.reflect.Method[] r0 = r29.getDeclaredMethods()
            r0.getClass()
            int r1 = r0.length
            r4 = 0
            r5 = 0
            r6 = 0
        Le:
            java.lang.Class<java.util.List> r7 = java.util.List.class
            if (r4 >= r1) goto L41
            r9 = r0[r4]
            int r10 = r9.getModifiers()
            boolean r10 = java.lang.reflect.Modifier.isStatic(r10)
            if (r10 != 0) goto L3e
            boolean r10 = r9.isSynthetic()
            if (r10 != 0) goto L3e
            java.lang.Class[] r10 = r9.getParameterTypes()
            r10.getClass()
            int r10 = r10.length
            if (r10 != 0) goto L3e
            java.lang.Class r10 = r9.getReturnType()
            boolean r10 = r7.isAssignableFrom(r10)
            if (r10 == 0) goto L3e
            if (r5 == 0) goto L3c
        L3a:
            r14 = 0
            goto L45
        L3c:
            r6 = r9
            r5 = 1
        L3e:
            int r4 = r4 + 1
            goto Le
        L41:
            if (r5 != 0) goto L44
            goto L3a
        L44:
            r14 = r6
        L45:
            if (r14 != 0) goto L4b
        L47:
            r20 = 0
            goto L314
        L4b:
            java.lang.reflect.Method[] r0 = r29.getMethods()
            r0.getClass()
            int r1 = r0.length
            r4 = 0
            r5 = 0
            r6 = 0
        L56:
            java.lang.Class r9 = java.lang.Void.TYPE
            if (r4 >= r1) goto L8f
            r10 = r0[r4]
            java.lang.String r11 = r10.getName()
            java.lang.String r12 = "notifyDataSetChanged"
            boolean r11 = p000.ln0.m3626(r11, r12)
            if (r11 == 0) goto L8c
            int r11 = r10.getModifiers()
            boolean r11 = java.lang.reflect.Modifier.isStatic(r11)
            if (r11 != 0) goto L8c
            java.lang.Class r11 = r10.getReturnType()
            boolean r11 = p000.ln0.m3626(r11, r9)
            if (r11 == 0) goto L8c
            java.lang.Class[] r11 = r10.getParameterTypes()
            r11.getClass()
            int r11 = r11.length
            if (r11 != 0) goto L8c
            if (r5 == 0) goto L8a
        L88:
            r15 = 0
            goto L93
        L8a:
            r6 = r10
            r5 = 1
        L8c:
            int r4 = r4 + 1
            goto L56
        L8f:
            if (r5 != 0) goto L92
            goto L88
        L92:
            r15 = r6
        L93:
            if (r15 != 0) goto L96
            goto L47
        L96:
            java.lang.reflect.Method[] r0 = r29.getDeclaredMethods()
            r0.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r4 = r0.length
            r5 = 0
        La4:
            if (r5 >= r4) goto L2e5
            r11 = r0[r5]
            r11.getClass()
            int r6 = r11.getModifiers()
            boolean r6 = java.lang.reflect.Modifier.isStatic(r6)
            if (r6 == 0) goto Lce
            boolean r6 = r11.isSynthetic()
            if (r6 == 0) goto Lbc
            goto Lce
        Lbc:
            java.lang.Class r6 = r11.getReturnType()
            boolean r6 = p000.ln0.m3626(r6, r9)
            if (r6 == 0) goto Lce
            java.lang.Class[] r6 = r11.getParameterTypes()
            int r6 = r6.length
            r10 = 2
            if (r6 == r10) goto Ld8
        Lce:
            r21 = r0
            r22 = r4
            r26 = r5
            r0 = r9
            r20 = 0
            goto L101
        Ld8:
            java.lang.Class[] r6 = r11.getParameterTypes()
            r6.getClass()
            int r10 = r6.length
            r12 = 0
        Le1:
            if (r12 >= r10) goto Lf3
            r13 = r6[r12]
            r20 = 0
            r2 = r29
            boolean r13 = p000.ln0.m3626(r13, r2)
            if (r13 == 0) goto Lf0
            goto Lf8
        Lf0:
            int r12 = r12 + 1
            goto Le1
        Lf3:
            r20 = 0
            r2 = r29
            r12 = -1
        Lf8:
            if (r12 >= 0) goto L105
            r21 = r0
        Lfc:
            r22 = r4
        Lfe:
            r26 = r5
        L100:
            r0 = r9
        L101:
            r9 = r20
            goto L2d7
        L105:
            int r13 = 1 - r12
            java.lang.Class[] r6 = r11.getParameterTypes()
            r6 = r6[r13]
            java.lang.reflect.Field[] r10 = r6.getDeclaredFields()
            r10.getClass()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r8 = r10.length
            r21 = r0
            r0 = 0
        L11d:
            if (r0 >= r8) goto L133
            r16 = r0
            r0 = r10[r16]
            int r17 = r0.getModifiers()
            boolean r17 = java.lang.reflect.Modifier.isStatic(r17)
            if (r17 != 0) goto L130
            r3.add(r0)
        L130:
            int r0 = r16 + 1
            goto L11d
        L133:
            int r0 = r3.size()
            r8 = 3
            if (r0 == r8) goto L13b
        L13a:
            goto Lfc
        L13b:
            java.util.Iterator r0 = r3.iterator()
            r16 = r20
            r10 = 0
        L142:
            boolean r17 = r0.hasNext()
            if (r17 == 0) goto L166
            java.lang.Object r17 = r0.next()
            r18 = r17
            java.lang.reflect.Field r18 = (java.lang.reflect.Field) r18
            java.lang.Class r8 = r18.getType()
            boolean r8 = r7.isAssignableFrom(r8)
            if (r8 == 0) goto L164
            if (r10 == 0) goto L15f
        L15c:
            r16 = r20
            goto L169
        L15f:
            r16 = r17
            r8 = 3
            r10 = 1
            goto L142
        L164:
            r8 = 3
            goto L142
        L166:
            if (r10 != 0) goto L169
            goto L15c
        L169:
            r0 = r16
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            if (r0 != 0) goto L170
            goto L13a
        L170:
            java.util.Iterator r8 = r3.iterator()
            r16 = r20
            r10 = 0
        L177:
            boolean r17 = r8.hasNext()
            java.lang.Class r2 = java.lang.Boolean.TYPE
            if (r17 == 0) goto L1a3
            java.lang.Object r17 = r8.next()
            r18 = r17
            java.lang.reflect.Field r18 = (java.lang.reflect.Field) r18
            r22 = r3
            java.lang.Class r3 = r18.getType()
            boolean r3 = p000.ln0.m3626(r3, r2)
            if (r3 == 0) goto L1a0
            if (r10 == 0) goto L198
        L195:
            r16 = r20
            goto L1a8
        L198:
            r10 = 1
            r2 = r29
            r16 = r17
        L19d:
            r3 = r22
            goto L177
        L1a0:
            r2 = r29
            goto L19d
        L1a3:
            r22 = r3
            if (r10 != 0) goto L1a8
            goto L195
        L1a8:
            r3 = r16
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            if (r3 != 0) goto L1af
            goto L13a
        L1af:
            java.util.Iterator r8 = r22.iterator()
            r16 = r20
            r10 = 0
        L1b6:
            boolean r17 = r8.hasNext()
            if (r17 == 0) goto L1e2
            java.lang.Object r17 = r8.next()
            r22 = r4
            r4 = r17
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            if (r4 == r0) goto L1df
            if (r4 == r3) goto L1df
            java.lang.Class r4 = r4.getType()
            boolean r4 = r4.isPrimitive()
            if (r4 != 0) goto L1df
            if (r10 == 0) goto L1d9
        L1d6:
            r16 = r20
            goto L1e7
        L1d9:
            r16 = r17
            r4 = r22
            r10 = 1
            goto L1b6
        L1df:
            r4 = r22
            goto L1b6
        L1e2:
            r22 = r4
            if (r10 != 0) goto L1e7
            goto L1d6
        L1e7:
            r18 = r16
            java.lang.reflect.Field r18 = (java.lang.reflect.Field) r18
            if (r18 != 0) goto L1ef
            goto Lfe
        L1ef:
            java.lang.reflect.Constructor[] r4 = r6.getDeclaredConstructors()
            r4.getClass()
            int r6 = r4.length
            r16 = r20
            r8 = 0
            r10 = 0
        L1fb:
            if (r8 >= r6) goto L2bc
            r17 = r4[r8]
            r23 = r0
            java.lang.Class[] r0 = r17.getParameterTypes()
            r24 = r3
            int r3 = r0.length
            r25 = r4
            r4 = 3
            if (r3 != r4) goto L2aa
            int r3 = r0.length
            r26 = r5
            r4 = 0
            r5 = 0
        L212:
            if (r4 >= r3) goto L225
            r27 = r3
            r3 = r0[r4]
            boolean r3 = r7.isAssignableFrom(r3)
            if (r3 == 0) goto L220
            int r5 = r5 + 1
        L220:
            int r4 = r4 + 1
            r3 = r27
            goto L212
        L225:
            r3 = 1
            if (r5 != r3) goto L262
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r0.length
            r5 = 0
        L22f:
            if (r5 >= r4) goto L243
            r27 = r4
            r4 = r0[r5]
            boolean r28 = r7.isAssignableFrom(r4)
            if (r28 == 0) goto L23e
            r3.add(r4)
        L23e:
            int r5 = r5 + 1
            r4 = r27
            goto L22f
        L243:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L24a
            goto L265
        L24a:
            java.util.Iterator r3 = r3.iterator()
        L24e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L265
            java.lang.Object r4 = r3.next()
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.Class<java.util.ArrayList> r5 = java.util.ArrayList.class
            boolean r4 = r4.isAssignableFrom(r5)
            if (r4 != 0) goto L24e
        L262:
            r28 = r2
            goto L2ae
        L265:
            int r3 = r0.length
            r4 = 0
            r5 = 0
        L268:
            if (r4 >= r3) goto L27b
            r27 = r3
            r3 = r0[r4]
            boolean r3 = p000.ln0.m3626(r3, r2)
            if (r3 == 0) goto L276
            int r5 = r5 + 1
        L276:
            int r4 = r4 + 1
            r3 = r27
            goto L268
        L27b:
            r3 = 1
            if (r5 != r3) goto L262
            int r3 = r0.length
            r4 = 0
            r5 = 0
        L281:
            if (r4 >= r3) goto L29c
            r27 = r0
            r0 = r27[r4]
            r28 = r2
            java.lang.Class r2 = r18.getType()
            boolean r0 = p000.ln0.m3626(r0, r2)
            if (r0 == 0) goto L295
            int r5 = r5 + 1
        L295:
            int r4 = r4 + 1
            r0 = r27
            r2 = r28
            goto L281
        L29c:
            r28 = r2
            r0 = 1
            if (r5 != r0) goto L2ae
            if (r10 == 0) goto L2a6
        L2a3:
            r19 = r20
            goto L2c7
        L2a6:
            r16 = r17
            r10 = 1
            goto L2ae
        L2aa:
            r28 = r2
            r26 = r5
        L2ae:
            int r8 = r8 + 1
            r0 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            r2 = r28
            goto L1fb
        L2bc:
            r23 = r0
            r24 = r3
            r26 = r5
            if (r10 != 0) goto L2c5
            goto L2a3
        L2c5:
            r19 = r16
        L2c7:
            if (r19 != 0) goto L2cb
            goto L100
        L2cb:
            r0 = r9
            ce0 r9 = new ce0
            r10 = r29
            r16 = r23
            r17 = r24
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L2d7:
            if (r9 == 0) goto L2dc
            r1.add(r9)
        L2dc:
            int r5 = r26 + 1
            r9 = r0
            r0 = r21
            r4 = r22
            goto La4
        L2e5:
            r20 = 0
            java.lang.Object r0 = p000.AbstractC0984xh.m6656(r1)
            ce0 r0 = (p000.ce0) r0
            if (r0 == 0) goto L314
            java.lang.reflect.Method r1 = r0.f2079
            r3 = 1
            r1.setAccessible(r3)
            java.lang.reflect.Method r1 = r0.f2082
            r1.setAccessible(r3)
            java.lang.reflect.Method r1 = r0.f2083
            r1.setAccessible(r3)
            java.lang.reflect.Field r1 = r0.f2084
            r1.setAccessible(r3)
            java.lang.reflect.Field r1 = r0.f2085
            r1.setAccessible(r3)
            java.lang.reflect.Field r1 = r0.f2086
            r1.setAccessible(r3)
            java.lang.reflect.Constructor r1 = r0.f2087
            r1.setAccessible(r3)
            return r0
        L314:
            return r20
    }

    /* JADX INFO: renamed from: Ω */
    public static final void m6577(android.text.TextPaint r2, float r3) {
            boolean r0 = java.lang.Float.isNaN(r3)
            if (r0 != 0) goto L1e
            r0 = 0
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto Lc
            r3 = r0
        Lc:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L13
            r3 = r0
        L13:
            r0 = 255(0xff, float:3.57E-43)
            float r0 = (float) r0
            float r3 = r3 * r0
            int r3 = java.lang.Math.round(r3)
            r2.setAlpha(r3)
        L1e:
            return
    }

    /* JADX INFO: renamed from: ε */
    public static final void m6578(p000.C0711q4 r11, p000.C0024an r12, p000.v80 r13, int r14) {
            r0 = -149765515(0xfffffffff712c275, float:-2.9766383E33)
            r13.m6083(r0)
            cn0 r0 = r13.f11180
            androidx.compose.runtime.internal.α r1 = r13.m6096()
            r2 = 201(0xc9, float:2.82E-43)
            i51 r3 = p000.AbstractC0804sn.f9969
            r13.m6080(r2, r3)
            java.lang.Object r2 = r13.m6073()
            i2 r3 = p000.C0730qn.f9051
            boolean r3 = p000.ln0.m3626(r2, r3)
            r4 = 0
            if (r3 == 0) goto L22
            r2 = r4
            goto L27
        L22:
            r2.getClass()
            i72 r2 = (p000.i72) r2
        L27:
            java.lang.Object r3 = r11.f8855
            ak1 r3 = (p000.ak1) r3
            i72 r5 = r3.m172(r11, r2)
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L38
            r13.m6115(r5)
        L38:
            boolean r6 = r13.f11154
            r7 = 1
            r8 = 0
            if (r6 == 0) goto L50
            boolean r2 = r11.f8854
            if (r2 != 0) goto L48
            boolean r2 = r1.containsKey(r3)
            if (r2 != 0) goto L4c
        L48:
            androidx.compose.runtime.internal.α r1 = r1.m354(r3, r5)
        L4c:
            r13.f11145 = r7
        L4e:
            r2 = r8
            goto L8b
        L50:
            nw1 r6 = r13.f11142
            int r9 = r6.f7803
            int[] r10 = r6.f7798
            java.lang.Object r6 = r6.m4097(r9, r10)
            r6.getClass()
            androidx.compose.runtime.internal.α r6 = (androidx.compose.runtime.internal.C0042) r6
            boolean r9 = r13.m6109()
            if (r9 == 0) goto L67
            if (r2 != 0) goto L72
        L67:
            boolean r9 = r11.f8854
            if (r9 != 0) goto L80
            boolean r9 = r1.containsKey(r3)
            if (r9 != 0) goto L72
            goto L80
        L72:
            if (r2 == 0) goto L79
            boolean r2 = r13.f11179
            if (r2 != 0) goto L79
            goto L7e
        L79:
            boolean r2 = r13.f11179
            if (r2 == 0) goto L7e
            goto L84
        L7e:
            r1 = r6
            goto L84
        L80:
            androidx.compose.runtime.internal.α r1 = r1.m354(r3, r5)
        L84:
            boolean r2 = r13.f11134
            if (r2 != 0) goto L8a
            if (r6 == r1) goto L4e
        L8a:
            r2 = r7
        L8b:
            if (r2 == 0) goto L94
            boolean r3 = r13.f11154
            if (r3 != 0) goto L94
            r13.m6071(r1)
        L94:
            boolean r3 = r13.f11179
            r0.m1269(r3)
            r13.f11179 = r2
            r13.f11146 = r1
            r2 = 202(0xca, float:2.83E-43)
            i51 r3 = p000.AbstractC0804sn.f9970
            r13.m6079(r2, r3, r8, r1)
            r1 = 6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r12.invoke(r13, r1)
            r13.m6100(r8)
            r13.m6100(r8)
            int r0 = r0.m1268()
            if (r0 == 0) goto Lb9
            goto Lba
        Lb9:
            r7 = r8
        Lba:
            r13.f11179 = r7
            r13.f11146 = r4
            bl1 r13 = r13.m6101()
            if (r13 == 0) goto Lcb
            ic r0 = new ic
            r0.<init>(r11, r12, r14)
            r13.f1780 = r0
        Lcb:
            return
    }

    /* JADX INFO: renamed from: ζ */
    public static final void m6579(p000.C0711q4[] r8, p000.e80 r9, p000.v80 r10, int r11) {
            r0 = 415205898(0x18bf8a0a, float:4.9511727E-24)
            r10.m6083(r0)
            cn0 r0 = r10.f11180
            androidx.compose.runtime.internal.α r1 = r10.m6096()
            r2 = 201(0xc9, float:2.82E-43)
            i51 r3 = p000.AbstractC0804sn.f9969
            r10.m6080(r2, r3)
            boolean r2 = r10.f11154
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L27
            androidx.compose.runtime.internal.α r2 = androidx.compose.runtime.internal.C0042.f857
            androidx.compose.runtime.internal.α r2 = p000.AbstractC0073bd.m897(r8, r1, r2)
            androidx.compose.runtime.internal.α r1 = r10.m6114(r1, r2)
            r10.f11145 = r3
        L25:
            r2 = r4
            goto L72
        L27:
            nw1 r2 = r10.f11142
            int r5 = r2.f7803
            java.lang.Object r2 = r2.m4103(r5, r4)
            r2.getClass()
            androidx.compose.runtime.internal.α r2 = (androidx.compose.runtime.internal.C0042) r2
            nw1 r5 = r10.f11142
            int r6 = r5.f7803
            java.lang.Object r5 = r5.m4103(r6, r3)
            r5.getClass()
            androidx.compose.runtime.internal.α r5 = (androidx.compose.runtime.internal.C0042) r5
            androidx.compose.runtime.internal.α r6 = p000.AbstractC0073bd.m897(r8, r1, r5)
            boolean r7 = r10.m6109()
            if (r7 == 0) goto L63
            boolean r7 = r10.f11134
            if (r7 != 0) goto L63
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L56
            goto L63
        L56:
            int r1 = r10.f11168
            nw1 r5 = r10.f11142
            int r5 = r5.m4114()
            int r5 = r5 + r1
            r10.f11168 = r5
            r1 = r2
            goto L25
        L63:
            androidx.compose.runtime.internal.α r1 = r10.m6114(r1, r6)
            boolean r5 = r10.f11134
            if (r5 != 0) goto L71
            boolean r2 = p000.ln0.m3626(r1, r2)
            if (r2 != 0) goto L25
        L71:
            r2 = r3
        L72:
            if (r2 == 0) goto L7b
            boolean r5 = r10.f11154
            if (r5 != 0) goto L7b
            r10.m6071(r1)
        L7b:
            boolean r5 = r10.f11179
            r0.m1269(r5)
            r10.f11179 = r2
            r10.f11146 = r1
            r2 = 202(0xca, float:2.83E-43)
            i51 r5 = p000.AbstractC0804sn.f9970
            r10.m6079(r2, r5, r4, r1)
            int r1 = r11 >> 3
            r1 = r1 & 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r9.invoke(r10, r1)
            r10.m6100(r4)
            r10.m6100(r4)
            int r0 = r0.m1268()
            if (r0 == 0) goto La3
            goto La4
        La3:
            r3 = r4
        La4:
            r10.f11179 = r3
            r0 = 0
            r10.f11146 = r0
            bl1 r10 = r10.m6101()
            if (r10 == 0) goto Lb7
            ym r0 = new ym
            r1 = 1
            r0.<init>(r11, r1, r8, r9)
            r10.f1780 = r0
        Lb7:
            return
    }

    /* JADX INFO: renamed from: η */
    public static final void m6580(p000.e80 r2, p000.v80 r3, java.lang.Object r4) {
            up r0 = r3.f11153
            boolean r4 = r3.m6090(r4)
            java.lang.Object r1 = r3.m6073()
            if (r4 != 0) goto L10
            i2 r4 = p000.C0730qn.f9051
            if (r1 != r4) goto L18
        L10:
            dp0 r1 = new dp0
            r1.<init>(r0, r2)
            r3.m6115(r1)
        L18:
            dp0 r1 = (p000.dp0) r1
            return
    }

    /* JADX INFO: renamed from: θ */
    public static final int m6581(p000.dw0 r4, p000.re0 r5) {
            dw0 r0 = r4.mo1816()
            if (r0 == 0) goto L7
            goto L1d
        L7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Child of "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r2 = " cannot be null when calculating alignment line"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            p000.am0.m178(r1)
        L1d:
            qx0 r1 = r4.mo1805()
            java.util.Map r1 = r1.mo1624()
            boolean r1 = r1.containsKey(r5)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L42
            qx0 r4 = r4.mo1805()
            java.util.Map r4 = r4.mo1624()
            java.lang.Object r4 = r4.get(r5)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L48
            int r4 = r4.intValue()
            return r4
        L42:
            int r1 = r0.m1815(r5)
            if (r1 != r2) goto L49
        L48:
            return r2
        L49:
            r2 = 1
            r0.f3308 = r2
            r4.f3309 = r2
            r4.mo1810()
            r2 = 0
            r0.f3308 = r2
            r4.f3309 = r2
            boolean r4 = r5 instanceof p000.re0
            if (r4 == 0) goto L67
            long r4 = r0.mo1807()
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r2
        L64:
            int r4 = (int) r4
            int r1 = r1 + r4
            return r1
        L67:
            long r4 = r0.mo1807()
            r0 = 32
            long r4 = r4 >> r0
            goto L64
    }

    /* JADX INFO: renamed from: ι */
    public static final boolean m6582(p000.C0563mv r10, long r11) {
            q01 r0 = r10.f8771
            boolean r0 = r0.f8784
            if (r0 != 0) goto L7
            goto L5b
        L7:
            yp0 r0 = p000.h62.m2445(r10)
            k31 r0 = r0.f12733
            gm0 r0 = r0.f5726
            q22 r1 = r0.f4419
            boolean r1 = r1.f8784
            if (r1 != 0) goto L16
            goto L5b
        L16:
            r1 = 0
            long r0 = r0.m4745(r1)
            r2 = 32
            long r3 = r0 >> r2
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            long r6 = r10.f7284
            long r8 = r6 >> r2
            int r10 = (int) r8
            float r10 = (float) r10
            float r10 = r10 + r3
            long r6 = r6 & r4
            int r1 = (int) r6
            float r1 = (float) r1
            float r1 = r1 + r0
            long r6 = r11 >> r2
            int r2 = (int) r6
            float r2 = java.lang.Float.intBitsToFloat(r2)
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 > 0) goto L5b
            int r10 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r10 > 0) goto L5b
            long r10 = r11 & r4
            int r10 = (int) r10
            float r10 = java.lang.Float.intBitsToFloat(r10)
            int r11 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r11 > 0) goto L5b
            int r10 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r10 > 0) goto L5b
            r10 = 1
            return r10
        L5b:
            r10 = 0
            return r10
    }

    /* JADX INFO: renamed from: κ */
    public static java.lang.String m6583(byte[] r3, int r4) {
            if (r4 < 0) goto L11
            int r0 = r3.length
            int r1 = r4 + 4
            if (r0 >= r1) goto L8
            goto L11
        L8:
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = p000.AbstractC0547mf.f7107
            r2 = 4
            r0.<init>(r3, r4, r2, r1)
            return r0
        L11:
            java.lang.String r3 = ""
            return r3
    }

    /* JADX INFO: renamed from: λ */
    public static final void m6584(java.io.Closeable r0, java.lang.Throwable r1) {
            if (r0 == 0) goto L10
            if (r1 != 0) goto L8
            r0.close()
            return
        L8:
            r0.close()     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r0 = move-exception
            p000.ln0.m3624(r1, r0)
        L10:
            return
    }

    /* JADX INFO: renamed from: μ */
    public static java.util.List m6585(java.lang.Object r3) {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            m6586(r0, r3)
            if (r3 == 0) goto L47
            boolean r1 = r3 instanceof java.lang.String
            if (r1 != 0) goto L47
            boolean r1 = r3 instanceof java.lang.Iterable
            if (r1 != 0) goto L47
            boolean r1 = r3 instanceof java.lang.Object[]
            if (r1 != 0) goto L47
            java.lang.String r1 = "urlList"
            java.util.Set r1 = p000.g81.m2288(r1)
            java.lang.String r2 = "url_list"
            java.lang.Object r1 = m6572(r3, r2, r1)
            m6586(r0, r1)
            java.lang.String r1 = "downUrlList"
            java.lang.String r2 = "downloadUrlList"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            java.util.Set r1 = p000.AbstractC0312g7.m2263(r1)
            java.lang.String r2 = "download_url_list"
            java.lang.Object r1 = m6572(r3, r2, r1)
            m6586(r0, r1)
            java.lang.String r1 = "url"
            java.util.Set r2 = p000.g81.m2288(r1)
            java.lang.Object r3 = m6572(r3, r1, r2)
            m6586(r0, r3)
        L47:
            java.util.List r3 = p000.AbstractC0984xh.m6666(r0)
            return r3
    }

    /* JADX INFO: renamed from: ν */
    public static final void m6586(java.util.LinkedHashSet r3, java.lang.Object r4) {
            boolean r0 = r4 instanceof java.lang.String
            r1 = 0
            if (r0 == 0) goto L3c
            java.lang.String r4 = (java.lang.String) r4
            java.lang.CharSequence r4 = p000.q02.m4660(r4)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "//"
            boolean r0 = p000.x02.m6485(r4, r0, r1)
            if (r0 == 0) goto L1d
            java.lang.String r0 = "https:"
            java.lang.String r4 = r0.concat(r4)
        L1d:
            java.lang.String r0 = "&amp;"
            java.lang.String r1 = "&"
            java.lang.String r4 = p000.x02.m6483(r4, r0, r1)
            java.lang.String r0 = "\\u0026"
            java.lang.String r4 = p000.x02.m6483(r4, r0, r1)
            java.lang.String r0 = "http"
            r1 = 1
            boolean r0 = p000.x02.m6485(r4, r0, r1)
            if (r0 == 0) goto L35
            goto L36
        L35:
            r4 = 0
        L36:
            if (r4 == 0) goto L65
            r3.add(r4)
            return
        L3c:
            boolean r0 = r4 instanceof java.lang.Iterable
            if (r0 == 0) goto L54
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L46:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L65
            java.lang.Object r0 = r4.next()
            m6586(r3, r0)
            goto L46
        L54:
            boolean r0 = r4 instanceof java.lang.Object[]
            if (r0 == 0) goto L65
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            int r0 = r4.length
        L5b:
            if (r1 >= r0) goto L65
            r2 = r4[r1]
            m6586(r3, r2)
            int r1 = r1 + 1
            goto L5b
        L65:
            return
    }

    /* JADX INFO: renamed from: ξ */
    public static final int m6587(long r5, long r7) {
            boolean r0 = m6567(r5)
            boolean r1 = m6567(r7)
            r2 = 1
            r3 = -1
            if (r0 == r1) goto L10
            if (r0 == 0) goto Lf
            return r3
        Lf:
            return r2
        L10:
            float r0 = m6558(r5)
            float r1 = m6558(r7)
            float r0 = r0 - r1
            float r0 = java.lang.Math.signum(r0)
            int r0 = (int) r0
            float r1 = m6558(r5)
            float r4 = m6558(r7)
            float r1 = java.lang.Math.min(r1, r4)
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L30
            goto L42
        L30:
            boolean r1 = m6566(r5)
            boolean r7 = m6566(r7)
            if (r1 == r7) goto L42
            boolean r5 = m6566(r5)
            if (r5 == 0) goto L41
            return r3
        L41:
            return r2
        L42:
            return r0
    }

    /* JADX INFO: renamed from: ο */
    public static boolean m6588(java.lang.String r7, byte[] r8) {
            int r0 = r7.length()
            r1 = 0
            if (r0 != 0) goto L8
            goto L35
        L8:
            int r0 = r8.length
            int r2 = r7.length()
            if (r0 >= r2) goto L10
            goto L35
        L10:
            java.nio.charset.Charset r0 = p000.AbstractC0547mf.f7107
            byte[] r7 = r7.getBytes(r0)
            r7.getClass()
            int r0 = r8.length
            int r2 = r7.length
            int r0 = r0 - r2
            if (r0 < 0) goto L35
            r2 = r1
        L1f:
            int r3 = r7.length
            r4 = r1
        L21:
            if (r4 >= r3) goto L33
            int r5 = r2 + r4
            r5 = r8[r5]
            r6 = r7[r4]
            if (r5 == r6) goto L30
            if (r2 == r0) goto L35
            int r2 = r2 + 1
            goto L1f
        L30:
            int r4 = r4 + 1
            goto L21
        L33:
            r7 = 1
            return r7
        L35:
            return r1
    }

    /* JADX INFO: renamed from: π */
    public static void m6589(android.app.Activity r35, java.lang.String r36, java.lang.String r37, p000.C0372hu r38) {
            r0 = r35
            x01 r1 = p000.x01.f11964
            android.view.LayoutInflater r1 = r1.m6477(r0)
            r2 = 2131492908(0x7f0c002c, float:1.8609281E38)
            r3 = 0
            r4 = 0
            android.view.View r6 = r1.inflate(r2, r3, r4)
            r6.getClass()
            fk0 r5 = new fk0
            r1 = 2131296758(0x7f0901f6, float:1.8211442E38)
            android.view.View r1 = r6.requireViewById(r1)
            r1.getClass()
            r7 = r1
            android.widget.TextView r7 = (android.widget.TextView) r7
            r1 = 2131296749(0x7f0901ed, float:1.8211423E38)
            android.view.View r1 = r6.requireViewById(r1)
            r1.getClass()
            r8 = r1
            android.widget.TextView r8 = (android.widget.TextView) r8
            r1 = 2131296747(0x7f0901eb, float:1.821142E38)
            android.view.View r9 = r6.requireViewById(r1)
            r9.getClass()
            r1 = 2131296748(0x7f0901ec, float:1.8211421E38)
            android.view.View r1 = r6.requireViewById(r1)
            r1.getClass()
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            r1 = 2131296742(0x7f0901e6, float:1.821141E38)
            android.view.View r1 = r6.requireViewById(r1)
            r1.getClass()
            r2 = 2131296743(0x7f0901e7, float:1.8211411E38)
            android.view.View r2 = r6.requireViewById(r2)
            r2.getClass()
            r3 = 2131296741(0x7f0901e5, float:1.8211407E38)
            android.view.View r3 = r6.requireViewById(r3)
            r3.getClass()
            android.view.View[] r1 = new android.view.View[]{r1, r2, r3}
            java.util.List r11 = p000.AbstractC1021yh.m6897(r1)
            r1 = 3
            android.widget.TextView[] r2 = new android.widget.TextView[r1]
            r3 = 2131296754(0x7f0901f2, float:1.8211434E38)
            android.view.View r3 = r6.requireViewById(r3)
            r3.getClass()
            r2[r4] = r3
            r3 = 2131296757(0x7f0901f5, float:1.821144E38)
            android.view.View r3 = r6.requireViewById(r3)
            r3.getClass()
            r12 = 1
            r2[r12] = r3
            r3 = 2131296752(0x7f0901f0, float:1.821143E38)
            android.view.View r3 = r6.requireViewById(r3)
            r3.getClass()
            r13 = 2
            r2[r13] = r3
            java.util.List r2 = p000.AbstractC1021yh.m6897(r2)
            r3 = 2131296753(0x7f0901f1, float:1.8211432E38)
            android.view.View r3 = r6.requireViewById(r3)
            r3.getClass()
            android.widget.TextView r3 = (android.widget.TextView) r3
            r14 = 2131296755(0x7f0901f3, float:1.8211436E38)
            android.view.View r14 = r6.requireViewById(r14)
            r14.getClass()
            android.widget.TextView r14 = (android.widget.TextView) r14
            r15 = 2131296745(0x7f0901e9, float:1.8211415E38)
            android.view.View r15 = r6.requireViewById(r15)
            r15.getClass()
            android.widget.EditText r15 = (android.widget.EditText) r15
            r12 = 2131296756(0x7f0901f4, float:1.8211438E38)
            android.view.View r12 = r6.requireViewById(r12)
            r12.getClass()
            android.widget.TextView r12 = (android.widget.TextView) r12
            r13 = 2131296735(0x7f0901df, float:1.8211395E38)
            android.view.View r13 = r6.requireViewById(r13)
            r13.getClass()
            android.widget.Button r13 = (android.widget.Button) r13
            r1 = 2131296734(0x7f0901de, float:1.8211393E38)
            android.view.View r1 = r6.requireViewById(r1)
            r1.getClass()
            r18 = r1
            android.widget.Button r18 = (android.widget.Button) r18
            r1 = 2131296739(0x7f0901e3, float:1.8211403E38)
            android.view.View r1 = r6.requireViewById(r1)
            r1.getClass()
            r19 = r1
            android.widget.Button r19 = (android.widget.Button) r19
            r1 = 2131296744(0x7f0901e8, float:1.8211413E38)
            android.view.View r1 = r6.requireViewById(r1)
            r1.getClass()
            r20 = r1
            android.widget.EditText r20 = (android.widget.EditText) r20
            r1 = 2131296750(0x7f0901ee, float:1.8211425E38)
            android.view.View r1 = r6.requireViewById(r1)
            r1.getClass()
            r21 = r1
            android.widget.TextView r21 = (android.widget.TextView) r21
            r1 = 2131296751(0x7f0901ef, float:1.8211428E38)
            android.view.View r1 = r6.requireViewById(r1)
            r1.getClass()
            r22 = r1
            android.widget.TextView r22 = (android.widget.TextView) r22
            r1 = 2131296736(0x7f0901e0, float:1.8211397E38)
            android.view.View r1 = r6.requireViewById(r1)
            r1.getClass()
            r23 = r1
            android.widget.Button r23 = (android.widget.Button) r23
            r1 = 2131296737(0x7f0901e1, float:1.82114E38)
            android.view.View r1 = r6.requireViewById(r1)
            r1.getClass()
            r24 = r1
            android.widget.Button r24 = (android.widget.Button) r24
            r1 = 2131296738(0x7f0901e2, float:1.8211401E38)
            android.view.View r1 = r6.requireViewById(r1)
            r1.getClass()
            r25 = r1
            android.widget.Button r25 = (android.widget.Button) r25
            r1 = 2131296740(0x7f0901e4, float:1.8211405E38)
            android.view.View r1 = r6.requireViewById(r1)
            r1.getClass()
            r26 = r1
            android.widget.Button r26 = (android.widget.Button) r26
            r1 = 2131296733(0x7f0901dd, float:1.821139E38)
            android.view.View r1 = r6.requireViewById(r1)
            r1.getClass()
            r27 = r1
            android.widget.Button r27 = (android.widget.Button) r27
            r16 = r12
            r17 = r13
            r1 = 1
            r12 = r2
            r13 = r3
            r2 = 2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r3 = r20
            r12 = r26
            r13 = r27
            xx r14 = p000.jx0.m3049(r0)
            java.lang.String r4 = r14.f12358
            java.lang.String r2 = r14.f12359
            java.lang.String r1 = r14.f12356
            r19 = r1
            java.lang.String r1 = r14.f12348
            r20 = r11
            java.lang.String r11 = r14.f12371
            java.lang.String r13 = r14.f12357
            r21 = r13
            java.lang.String r13 = r14.f12351
            r22 = r4
            r4 = 16
            android.graphics.drawable.GradientDrawable r13 = p000.jx0.m3062(r4, r0, r13)
            r6.setBackground(r13)
            java.lang.String r13 = r14.f12355
            int r4 = android.graphics.Color.parseColor(r13)
            r7.setTextColor(r4)
            java.lang.String r4 = r14.f12353
            int r4 = android.graphics.Color.parseColor(r4)
            r9.setBackgroundColor(r4)
            java.util.Iterator r4 = r20.iterator()
        L1ac:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L1c8
            java.lang.Object r7 = r4.next()
            android.view.View r7 = (android.view.View) r7
            java.lang.String r9 = r14.f12352
            r20 = r4
            r4 = 12
            android.graphics.drawable.GradientDrawable r4 = p000.jx0.m3062(r4, r0, r9)
            r7.setBackground(r4)
            r4 = r20
            goto L1ac
        L1c8:
            java.util.List r4 = r5.f3981
            java.util.Iterator r4 = r4.iterator()
        L1ce:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L1e2
            java.lang.Object r7 = r4.next()
            android.widget.TextView r7 = (android.widget.TextView) r7
            int r9 = android.graphics.Color.parseColor(r13)
            r7.setTextColor(r9)
            goto L1ce
        L1e2:
            android.widget.TextView r4 = r5.f3983
            int r7 = android.graphics.Color.parseColor(r19)
            r4.setTextColor(r7)
            int r4 = android.graphics.Color.parseColor(r13)
            r15.setTextColor(r4)
            int r4 = android.graphics.Color.parseColor(r21)
            r15.setHintTextColor(r4)
            int r4 = android.graphics.Color.parseColor(r2)
            r15.setHighlightColor(r4)
            r4 = 8
            android.graphics.drawable.GradientDrawable r7 = p000.jx0.m3062(r4, r0, r11)
            r15.setBackground(r7)
            int r7 = android.graphics.Color.parseColor(r13)
            r3.setTextColor(r7)
            int r7 = android.graphics.Color.parseColor(r21)
            r3.setHintTextColor(r7)
            int r7 = android.graphics.Color.parseColor(r2)
            r3.setHighlightColor(r7)
            android.graphics.drawable.GradientDrawable r7 = p000.jx0.m3062(r4, r0, r11)
            r3.setBackground(r7)
            android.widget.TextView r7 = r5.f3982
            int r9 = android.graphics.Color.parseColor(r19)
            r7.setTextColor(r9)
            android.widget.TextView r7 = r5.f3985
            int r9 = android.graphics.Color.parseColor(r21)
            r7.setTextColor(r9)
            android.widget.TextView r7 = r5.f3991
            int r9 = android.graphics.Color.parseColor(r21)
            r7.setTextColor(r9)
            int r7 = android.graphics.Color.parseColor(r19)
            r8.setTextColor(r7)
            android.graphics.drawable.RippleDrawable r7 = p000.jx0.m3034(r1)
            r8.setBackground(r7)
            int r7 = android.graphics.Color.parseColor(r22)
            r10.setTextColor(r7)
            r7 = 99
            android.graphics.drawable.GradientDrawable r2 = p000.jx0.m3062(r7, r0, r2)
            r10.setBackground(r2)
            android.widget.Button r2 = r5.f3986
            android.widget.Button r7 = r5.f3987
            android.widget.Button r8 = r5.f3988
            android.widget.Button r9 = r5.f3992
            android.widget.Button r10 = r5.f3993
            android.widget.Button r14 = r5.f3994
            r28 = r2
            r29 = r7
            r30 = r8
            r31 = r9
            r32 = r10
            r33 = r14
            android.widget.Button[] r2 = new android.widget.Button[]{r28, r29, r30, r31, r32, r33}
            r34 = r28
            r14 = r29
            r10 = r30
            r8 = r32
            r7 = r33
            java.util.List r2 = p000.AbstractC1021yh.m6897(r2)
            java.util.Iterator r2 = r2.iterator()
        L28c:
            boolean r19 = r2.hasNext()
            if (r19 == 0) goto L2b5
            java.lang.Object r19 = r2.next()
            r4 = r19
            android.widget.Button r4 = (android.widget.Button) r4
            r19 = r2
            int r2 = android.graphics.Color.parseColor(r13)
            r4.setTextColor(r2)
            r21 = r13
            r2 = 8
            android.graphics.drawable.RippleDrawable r13 = p000.jx0.m3059(r2, r0, r1, r11)
            r4.setBackground(r13)
            r2 = r19
            r13 = r21
            r4 = 8
            goto L28c
        L2b5:
            r21 = r13
            r2 = -1
            r12.setTextColor(r2)
            r2 = 10
            r4 = r22
            android.graphics.drawable.RippleDrawable r4 = p000.jx0.m3059(r2, r0, r1, r4)
            r12.setBackground(r4)
            int r4 = android.graphics.Color.parseColor(r21)
            r13 = r27
            r13.setTextColor(r4)
            android.graphics.drawable.RippleDrawable r1 = p000.jx0.m3059(r2, r0, r1, r11)
            r13.setBackground(r1)
            ym1 r1 = p000.hk0.f4753
            java.lang.String r1 = p000.hk0.m2516(r36)
            r3.setText(r1)
            java.lang.String r1 = p000.hk0.m2517(r37)
            r15.setText(r1)
            android.text.Editable r1 = r3.getText()
            if (r1 == 0) goto L2f1
            int r1 = r1.length()
            goto L2f2
        L2f1:
            r1 = 0
        L2f2:
            r3.setSelection(r1)
            android.text.Editable r1 = r15.getText()
            if (r1 == 0) goto L300
            int r1 = r1.length()
            goto L301
        L300:
            r1 = 0
        L301:
            r15.setSelection(r1)
            android.app.AlertDialog$Builder r1 = new android.app.AlertDialog$Builder
            r1.<init>(r0)
            android.app.AlertDialog$Builder r1 = r1.setView(r6)
            r2 = 1
            android.app.AlertDialog$Builder r1 = r1.setCancelable(r2)
            android.app.AlertDialog r1 = r1.create()
            p3 r2 = new p3
            r4 = 27
            r2.<init>(r0, r4, r5)
            md0 r4 = new md0
            r6 = 2
            r4.<init>(r6, r2)
            r3.addTextChangedListener(r4)
            md0 r4 = new md0
            r4.<init>(r6, r2)
            r15.addTextChangedListener(r4)
            su r2 = new su
            r4 = 1
            r2.<init>(r15, r0, r4)
            r15.setOnClickListener(r2)
            su r2 = new su
            r2.<init>(r3, r0, r4)
            r3.setOnClickListener(r2)
            sa r2 = new sa
            r3 = 8
            r2.<init>(r1, r3)
            android.widget.TextView r3 = r5.f3977
            r3.setOnClickListener(r2)
            sa r2 = new sa
            r3 = 9
            r2.<init>(r1, r3)
            android.widget.Button r3 = r5.f3996
            r3.setOnClickListener(r2)
            ek0 r2 = new ek0
            r3 = 0
            r2.<init>(r5, r3)
            r3 = r34
            r3.setOnClickListener(r2)
            ek0 r2 = new ek0
            r4 = 1
            r2.<init>(r5, r4)
            r14.setOnClickListener(r2)
            ek0 r2 = new ek0
            r6 = 2
            r2.<init>(r5, r6)
            r10.setOnClickListener(r2)
            ek0 r2 = new ek0
            r3 = 3
            r2.<init>(r5, r3)
            r9.setOnClickListener(r2)
            ek0 r2 = new ek0
            r3 = 4
            r2.<init>(r5, r3)
            r8.setOnClickListener(r2)
            ek0 r2 = new ek0
            r3 = 5
            r2.<init>(r5, r3)
            r7.setOnClickListener(r2)
            vj r2 = new vj
            r3 = r38
            r2.<init>(r5, r0, r3, r1)
            android.widget.Button r3 = r5.f3995
            r3.setOnClickListener(r2)
            m6573(r0, r5)
            r1.show()
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            android.view.Window r1 = r1.getWindow()
            if (r1 == 0) goto L3df
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r3 = 0
            r2.<init>(r3)
            r1.setBackgroundDrawable(r2)
            r2 = 1056964608(0x3f000000, float:0.5)
            r1.setDimAmount(r2)
            r6 = 2
            r1.addFlags(r6)
            r2 = 131080(0x20008, float:1.83682E-40)
            r1.clearFlags(r2)
            r2 = 16
            r1.setSoftInputMode(r2)
            int r2 = r0.widthPixels
            float r2 = (float) r2
            r3 = 1064346583(0x3f70a3d7, float:0.94)
            float r2 = r2 * r3
            int r2 = (int) r2
            int r0 = r0.heightPixels
            float r0 = (float) r0
            r3 = 1063339950(0x3f6147ae, float:0.88)
            float r0 = r0 * r3
            int r0 = (int) r0
            r1.setLayout(r2, r0)
        L3df:
            return
    }

    /* JADX INFO: renamed from: ρ */
    public static p000.InterfaceC0631op m6590(p000.InterfaceC0631op r2, p000.InterfaceC0631op r3, p000.e80 r4) {
            r4.getClass()
            boolean r0 = r4 instanceof p000.AbstractC0715q8
            if (r0 == 0) goto Le
            q8 r4 = (p000.AbstractC0715q8) r4
            op r2 = r4.mo1119(r3, r2)
            return r2
        Le:
            up r0 = r3.mo72()
            hz r1 = p000.C0377hz.f4846
            if (r0 != r1) goto L1c
            mn0 r0 = new mn0
            r0.<init>(r3, r2, r4)
            return r0
        L1c:
            nn0 r1 = new nn0
            r1.<init>(r3, r0, r4, r2)
            return r1
    }

    /* JADX INFO: renamed from: σ */
    public static p000.r01 m6591(p000.r01 r1, float r2) {
            x62 r0 = new x62
            r0.<init>(r2)
            r01 r1 = r1.mo4345(r0)
            return r1
    }

    /* JADX INFO: renamed from: τ */
    public static java.util.ArrayList m6592(java.lang.Object r12) {
            java.lang.String r10 = "LJII"
            java.lang.String r11 = "LJFF"
            java.lang.String r0 = "playUrl"
            java.lang.String r1 = "_playUrl"
            java.lang.String r2 = "play_url"
            java.lang.String r3 = "url"
            java.lang.String r4 = "_url"
            java.lang.String r5 = "mp3Url"
            java.lang.String r6 = "audioUrl"
            java.lang.String r7 = "LJL"
            java.lang.String r8 = "LIZ"
            java.lang.String r9 = "LJI"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.Iterator r0 = r0.iterator()
        L24:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L46
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = p000.qe0.m4879(r12, r1)     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto L38
            goto L3c
        L38:
            java.util.ArrayList r2 = m6596(r1)     // Catch: java.lang.Throwable -> L3c
        L3c:
            if (r2 == 0) goto L24
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L45
            goto L24
        L45:
            return r2
        L46:
            java.lang.Class r0 = r12.getClass()     // Catch: java.lang.Throwable -> Lb2
        L4a:
            if (r0 == 0) goto Lca
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r0.equals(r1)     // Catch: java.lang.Throwable -> Lb2
            if (r1 != 0) goto Lca
            java.lang.reflect.Field[] r1 = r0.getDeclaredFields()     // Catch: java.lang.Throwable -> Lb2
            τ r1 = p000.h62.m2434(r1)     // Catch: java.lang.Throwable -> Lb2
        L5c:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> Lb2
            if (r3 == 0) goto Lb5
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> Lb2
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3     // Catch: java.lang.Throwable -> Lb2
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r4 = r3.get(r12)     // Catch: java.lang.Throwable -> Lb2
            if (r4 != 0) goto L73
            goto L5c
        L73:
            java.util.ArrayList r4 = m6596(r4)     // Catch: java.lang.Throwable -> Lb2
            if (r4 == 0) goto L5c
            boolean r5 = r4.isEmpty()     // Catch: java.lang.Throwable -> Lb2
            if (r5 == 0) goto L80
            goto L5c
        L80:
            java.lang.String r12 = r3.getName()     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = r0.getSimpleName()     // Catch: java.lang.Throwable -> Lb2
            int r1 = r4.size()     // Catch: java.lang.Throwable -> Lb2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb2
            r3.<init>()     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r5 = "DYHelper: [Audio] fallback 命中字段: "
            r3.append(r5)     // Catch: java.lang.Throwable -> Lb2
            r3.append(r12)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r12 = " ("
            r3.append(r12)     // Catch: java.lang.Throwable -> Lb2
            r3.append(r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r12 = "), urls="
            r3.append(r12)     // Catch: java.lang.Throwable -> Lb2
            r3.append(r1)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r12 = r3.toString()     // Catch: java.lang.Throwable -> Lb2
            p000.C0888ux.m5985(r12)     // Catch: java.lang.Throwable -> Lb2
            r2 = r4
            goto Lca
        Lb2:
            r0 = move-exception
            r12 = r0
            goto Lba
        Lb5:
            java.lang.Class r0 = r0.getSuperclass()     // Catch: java.lang.Throwable -> Lb2
            goto L4a
        Lba:
            java.lang.String r12 = r12.getMessage()
            java.lang.String r0 = "[Audio] fallbackExtractUrls 失败: "
            java.lang.String r12 = p000.lz1.m3687(r0, r12)
            r0 = 4
            java.lang.String r1 = "DYHelper"
            p000.C0888ux.m5988(r1, r12, r2, r0, r2)
        Lca:
            return r2
    }

    /* JADX INFO: renamed from: υ */
    public static java.lang.String m6593(java.lang.Object r7) {
            java.lang.String r4 = "_coverMedium"
            java.lang.String r5 = "_coverLarge"
            java.lang.String r0 = "coverMedium"
            java.lang.String r1 = "coverLarge"
            java.lang.String r2 = "coverThumb"
            java.lang.String r3 = "cover"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L53
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = p000.qe0.m4879(r7, r1)     // Catch: java.lang.Throwable -> L51
            if (r1 != 0) goto L2c
            goto L51
        L2c:
            java.util.ArrayList r1 = m6596(r1)     // Catch: java.lang.Throwable -> L51
            if (r1 == 0) goto L51
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L51
        L36:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L51
            if (r3 == 0) goto L4d
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L51
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L51
            java.lang.String r5 = "http"
            r6 = 0
            boolean r4 = p000.x02.m6485(r4, r5, r6)     // Catch: java.lang.Throwable -> L51
            if (r4 == 0) goto L36
            goto L4e
        L4d:
            r3 = r2
        L4e:
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L51
            r2 = r3
        L51:
            if (r2 == 0) goto L18
        L53:
            return r2
    }

    /* JADX INFO: renamed from: φ */
    public static p000.C0459k7 m6594(java.lang.Object r3) {
            r3.getClass()
            java.lang.String r0 = "music"
            java.lang.Object r3 = p000.qe0.m4879(r3, r0)     // Catch: java.lang.Throwable -> L16
            if (r3 != 0) goto L11
            k7 r3 = new k7     // Catch: java.lang.Throwable -> L16
            r3.<init>()     // Catch: java.lang.Throwable -> L16
            return r3
        L11:
            k7 r3 = m6595(r3)     // Catch: java.lang.Throwable -> L16
            return r3
        L16:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()
            java.lang.String r0 = "AudioDataHook.extractFromAweme 失败: "
            java.lang.String r3 = p000.lz1.m3687(r0, r3)
            r0 = 4
            java.lang.String r1 = "DYHelper"
            r2 = 0
            p000.C0888ux.m5988(r1, r3, r2, r0, r2)
            k7 r3 = new k7
            r3.<init>()
            return r3
    }

    /* JADX INFO: renamed from: χ */
    public static p000.C0459k7 m6595(java.lang.Object r10) {
            r1 = 0
            java.lang.String r0 = "title"
            java.lang.String r4 = m6599(r10, r0)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r0 = "author"
            java.lang.String r0 = m6599(r10, r0)     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L1d
            java.lang.String r0 = "authorName"
            java.lang.String r0 = m6599(r10, r0)     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L1d
            java.lang.String r0 = "ownerName"
            java.lang.String r0 = m6599(r10, r0)     // Catch: java.lang.Throwable -> L1f
        L1d:
            r5 = r0
            goto L22
        L1f:
            r0 = move-exception
            r10 = r0
            goto L69
        L22:
            java.lang.String r0 = "mid"
            java.lang.String r0 = m6599(r10, r0)     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L43
            java.lang.String r0 = "id"
            java.lang.String r0 = m6599(r10, r0)     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L43
            java.lang.String r0 = "getMid"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L42
            java.lang.Object r0 = p000.qe0.m4869(r10, r0, r2)     // Catch: java.lang.Throwable -> L42
            boolean r2 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L42
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L42
            goto L43
        L42:
            r0 = r1
        L43:
            r6 = r0
            java.lang.String r0 = "duration"
            java.lang.Long r0 = m6569(r10, r0)     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L52
            java.lang.String r0 = "durationMs"
            java.lang.Long r0 = m6569(r10, r0)     // Catch: java.lang.Throwable -> L1f
        L52:
            java.util.ArrayList r3 = m6592(r10)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r7 = m6593(r10)     // Catch: java.lang.Throwable -> L1f
            k7 r2 = new k7     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L63
            long r8 = r0.longValue()     // Catch: java.lang.Throwable -> L1f
            goto L65
        L63:
            r8 = 0
        L65:
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L1f
            goto L7e
        L69:
            java.lang.String r10 = r10.getMessage()
            java.lang.String r0 = "AudioDataHook.extractFromMusic 失败: "
            java.lang.String r10 = p000.lz1.m3687(r0, r10)
            r0 = 4
            java.lang.String r2 = "DYHelper"
            p000.C0888ux.m5988(r2, r10, r1, r0, r1)
            k7 r2 = new k7
            r2.<init>()
        L7e:
            return r2
    }

    /* JADX INFO: renamed from: ψ */
    public static java.util.ArrayList m6596(java.lang.Object r9) {
            java.lang.String r0 = "_urlList"
            java.lang.String r1 = "LJL"
            java.lang.String r2 = "urlList"
            java.lang.String r3 = "urls"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            java.util.List r0 = p000.AbstractC1021yh.m6897(r0)
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r1 = r0.hasNext()
            r2 = 0
            java.lang.String r3 = "http"
            r4 = 0
            if (r1 == 0) goto L79
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = p000.qe0.m4879(r9, r1)     // Catch: java.lang.Throwable -> L14
            boolean r5 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> L14
            if (r5 == 0) goto L2f
            r4 = r1
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L14
        L2f:
            if (r4 == 0) goto L14
            boolean r1 = r4.isEmpty()     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L14
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L14
        L40:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L14
            if (r5 == 0) goto L52
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L14
            boolean r6 = r5 instanceof java.lang.String     // Catch: java.lang.Throwable -> L14
            if (r6 == 0) goto L40
            r1.add(r5)     // Catch: java.lang.Throwable -> L14
            goto L40
        L52:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L14
            r4.<init>()     // Catch: java.lang.Throwable -> L14
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L14
        L5b:
            boolean r5 = r1.hasNext()     // Catch: java.lang.Throwable -> L14
            if (r5 == 0) goto L72
            java.lang.Object r5 = r1.next()     // Catch: java.lang.Throwable -> L14
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L14
            boolean r6 = p000.x02.m6485(r6, r3, r2)     // Catch: java.lang.Throwable -> L14
            if (r6 == 0) goto L5b
            r4.add(r5)     // Catch: java.lang.Throwable -> L14
            goto L5b
        L72:
            boolean r1 = r4.isEmpty()     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L14
            return r4
        L79:
            java.lang.Class r0 = r9.getClass()     // Catch: java.lang.Throwable -> L102
        L7d:
            if (r0 == 0) goto L102
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r0.equals(r1)     // Catch: java.lang.Throwable -> L102
            if (r1 != 0) goto L102
            java.lang.reflect.Field[] r1 = r0.getDeclaredFields()     // Catch: java.lang.Throwable -> L102
            τ r1 = p000.h62.m2434(r1)     // Catch: java.lang.Throwable -> L102
        L8f:
            boolean r5 = r1.hasNext()     // Catch: java.lang.Throwable -> L102
            if (r5 == 0) goto Lfc
            java.lang.Object r5 = r1.next()     // Catch: java.lang.Throwable -> L102
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5     // Catch: java.lang.Throwable -> L102
            java.lang.Class<java.util.List> r6 = java.util.List.class
            java.lang.Class r7 = r5.getType()     // Catch: java.lang.Throwable -> L102
            boolean r6 = r6.isAssignableFrom(r7)     // Catch: java.lang.Throwable -> L102
            if (r6 == 0) goto L8f
            r6 = 1
            r5.setAccessible(r6)     // Catch: java.lang.Throwable -> L102
            java.lang.Object r5 = r5.get(r9)     // Catch: java.lang.Throwable -> L102
            boolean r6 = r5 instanceof java.util.List     // Catch: java.lang.Throwable -> L102
            if (r6 == 0) goto Lb6
            java.util.List r5 = (java.util.List) r5     // Catch: java.lang.Throwable -> L102
            goto Lb7
        Lb6:
            r5 = r4
        Lb7:
            if (r5 != 0) goto Lba
            goto L8f
        Lba:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L102
            r6.<init>()     // Catch: java.lang.Throwable -> L102
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L102
        Lc3:
            boolean r7 = r5.hasNext()     // Catch: java.lang.Throwable -> L102
            if (r7 == 0) goto Ld5
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L102
            boolean r8 = r7 instanceof java.lang.String     // Catch: java.lang.Throwable -> L102
            if (r8 == 0) goto Lc3
            r6.add(r7)     // Catch: java.lang.Throwable -> L102
            goto Lc3
        Ld5:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L102
            r5.<init>()     // Catch: java.lang.Throwable -> L102
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L102
        Lde:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L102
            if (r7 == 0) goto Lf5
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L102
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L102
            boolean r8 = p000.x02.m6485(r8, r3, r2)     // Catch: java.lang.Throwable -> L102
            if (r8 == 0) goto Lde
            r5.add(r7)     // Catch: java.lang.Throwable -> L102
            goto Lde
        Lf5:
            boolean r6 = r5.isEmpty()     // Catch: java.lang.Throwable -> L102
            if (r6 != 0) goto L8f
            return r5
        Lfc:
            java.lang.Class r0 = r0.getSuperclass()     // Catch: java.lang.Throwable -> L102
            goto L7d
        L102:
            return r4
    }

    /* JADX INFO: renamed from: ω */
    public static final float m6597(float r4) {
            int r0 = java.lang.Float.floatToRawIntBits(r4)
            long r0 = (long) r0
            r2 = 8589934591(0x1ffffffff, double:4.2439915814E-314)
            long r0 = r0 & r2
            r2 = 3
            long r2 = (long) r2
            long r0 = r0 / r2
            int r0 = (int) r0
            r1 = 709952852(0x2a510554, float:1.8564778E-13)
            int r0 = r0 + r1
            float r0 = java.lang.Float.intBitsToFloat(r0)
            float r1 = r0 * r0
            float r1 = r4 / r1
            float r1 = r0 - r1
            r2 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r1 = r1 * r2
            float r0 = r0 - r1
            float r1 = r0 * r0
            float r4 = r4 / r1
            float r4 = r0 - r4
            float r4 = r4 * r2
            float r0 = r0 - r4
            return r0
    }

    /* JADX INFO: renamed from: а */
    public static final p000.r01 m6598(p000.r01 r1, float r2) {
            kw1 r0 = new kw1
            r0.<init>(r2, r2, r2, r2)
            r01 r1 = r1.mo4345(r0)
            return r1
    }

    /* JADX INFO: renamed from: б */
    public static java.lang.String m6599(java.lang.Object r0, java.lang.String r1) {
            java.lang.Object r0 = p000.qe0.m4879(r0, r1)     // Catch: java.lang.Throwable -> Lb
            boolean r1 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto Lb
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> Lb
            return r0
        Lb:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: в */
    public static final android.graphics.BlendMode m6600(int r1) {
            if (r1 != 0) goto L5
            android.graphics.BlendMode r1 = android.graphics.BlendMode.CLEAR
            return r1
        L5:
            r0 = 1
            if (r1 != r0) goto Lb
            android.graphics.BlendMode r1 = android.graphics.BlendMode.SRC
            return r1
        Lb:
            r0 = 2
            if (r1 != r0) goto L11
            android.graphics.BlendMode r1 = android.graphics.BlendMode.DST
            return r1
        L11:
            r0 = 3
            if (r1 != r0) goto L17
            android.graphics.BlendMode r1 = android.graphics.BlendMode.SRC_OVER
            return r1
        L17:
            r0 = 4
            if (r1 != r0) goto L1d
            android.graphics.BlendMode r1 = android.graphics.BlendMode.DST_OVER
            return r1
        L1d:
            r0 = 5
            if (r1 != r0) goto L23
            android.graphics.BlendMode r1 = android.graphics.BlendMode.SRC_IN
            return r1
        L23:
            r0 = 6
            if (r1 != r0) goto L29
            android.graphics.BlendMode r1 = android.graphics.BlendMode.DST_IN
            return r1
        L29:
            r0 = 7
            if (r1 != r0) goto L2f
            android.graphics.BlendMode r1 = android.graphics.BlendMode.SRC_OUT
            return r1
        L2f:
            r0 = 8
            if (r1 != r0) goto L36
            android.graphics.BlendMode r1 = android.graphics.BlendMode.DST_OUT
            return r1
        L36:
            r0 = 9
            if (r1 != r0) goto L3d
            android.graphics.BlendMode r1 = android.graphics.BlendMode.SRC_ATOP
            return r1
        L3d:
            r0 = 10
            if (r1 != r0) goto L44
            android.graphics.BlendMode r1 = android.graphics.BlendMode.DST_ATOP
            return r1
        L44:
            r0 = 11
            if (r1 != r0) goto L4b
            android.graphics.BlendMode r1 = android.graphics.BlendMode.XOR
            return r1
        L4b:
            r0 = 12
            if (r1 != r0) goto L52
            android.graphics.BlendMode r1 = android.graphics.BlendMode.PLUS
            return r1
        L52:
            r0 = 13
            if (r1 != r0) goto L59
            android.graphics.BlendMode r1 = android.graphics.BlendMode.MODULATE
            return r1
        L59:
            r0 = 14
            if (r1 != r0) goto L60
            android.graphics.BlendMode r1 = android.graphics.BlendMode.SCREEN
            return r1
        L60:
            r0 = 15
            if (r1 != r0) goto L67
            android.graphics.BlendMode r1 = android.graphics.BlendMode.OVERLAY
            return r1
        L67:
            r0 = 16
            if (r1 != r0) goto L6e
            android.graphics.BlendMode r1 = android.graphics.BlendMode.DARKEN
            return r1
        L6e:
            r0 = 17
            if (r1 != r0) goto L75
            android.graphics.BlendMode r1 = android.graphics.BlendMode.LIGHTEN
            return r1
        L75:
            r0 = 18
            if (r1 != r0) goto L7c
            android.graphics.BlendMode r1 = android.graphics.BlendMode.COLOR_DODGE
            return r1
        L7c:
            r0 = 19
            if (r1 != r0) goto L83
            android.graphics.BlendMode r1 = android.graphics.BlendMode.COLOR_BURN
            return r1
        L83:
            r0 = 20
            if (r1 != r0) goto L8a
            android.graphics.BlendMode r1 = android.graphics.BlendMode.HARD_LIGHT
            return r1
        L8a:
            r0 = 21
            if (r1 != r0) goto L91
            android.graphics.BlendMode r1 = android.graphics.BlendMode.SOFT_LIGHT
            return r1
        L91:
            r0 = 22
            if (r1 != r0) goto L98
            android.graphics.BlendMode r1 = android.graphics.BlendMode.DIFFERENCE
            return r1
        L98:
            r0 = 23
            if (r1 != r0) goto L9f
            android.graphics.BlendMode r1 = android.graphics.BlendMode.EXCLUSION
            return r1
        L9f:
            r0 = 24
            if (r1 != r0) goto La6
            android.graphics.BlendMode r1 = android.graphics.BlendMode.MULTIPLY
            return r1
        La6:
            r0 = 25
            if (r1 != r0) goto Lad
            android.graphics.BlendMode r1 = android.graphics.BlendMode.HUE
            return r1
        Lad:
            r0 = 26
            if (r1 != r0) goto Lb4
            android.graphics.BlendMode r1 = android.graphics.BlendMode.SATURATION
            return r1
        Lb4:
            r0 = 27
            if (r1 != r0) goto Lbb
            android.graphics.BlendMode r1 = android.graphics.BlendMode.COLOR
            return r1
        Lbb:
            r0 = 28
            if (r1 != r0) goto Lc2
            android.graphics.BlendMode r1 = android.graphics.BlendMode.LUMINOSITY
            return r1
        Lc2:
            android.graphics.BlendMode r1 = android.graphics.BlendMode.SRC_OVER
            return r1
    }

    /* JADX INFO: renamed from: г */
    public static java.lang.String m6601(int r1) {
            if (r1 != 0) goto L5
            java.lang.String r1 = "Clear"
            return r1
        L5:
            r0 = 1
            if (r1 != r0) goto Lb
            java.lang.String r1 = "Src"
            return r1
        Lb:
            r0 = 2
            if (r1 != r0) goto L11
            java.lang.String r1 = "Dst"
            return r1
        L11:
            r0 = 3
            if (r1 != r0) goto L17
            java.lang.String r1 = "SrcOver"
            return r1
        L17:
            r0 = 4
            if (r1 != r0) goto L1d
            java.lang.String r1 = "DstOver"
            return r1
        L1d:
            r0 = 5
            if (r1 != r0) goto L23
            java.lang.String r1 = "SrcIn"
            return r1
        L23:
            r0 = 6
            if (r1 != r0) goto L29
            java.lang.String r1 = "DstIn"
            return r1
        L29:
            r0 = 7
            if (r1 != r0) goto L2f
            java.lang.String r1 = "SrcOut"
            return r1
        L2f:
            r0 = 8
            if (r1 != r0) goto L36
            java.lang.String r1 = "DstOut"
            return r1
        L36:
            r0 = 9
            if (r1 != r0) goto L3d
            java.lang.String r1 = "SrcAtop"
            return r1
        L3d:
            r0 = 10
            if (r1 != r0) goto L44
            java.lang.String r1 = "DstAtop"
            return r1
        L44:
            r0 = 11
            if (r1 != r0) goto L4b
            java.lang.String r1 = "Xor"
            return r1
        L4b:
            r0 = 12
            if (r1 != r0) goto L52
            java.lang.String r1 = "Plus"
            return r1
        L52:
            r0 = 13
            if (r1 != r0) goto L59
            java.lang.String r1 = "Modulate"
            return r1
        L59:
            r0 = 14
            if (r1 != r0) goto L60
            java.lang.String r1 = "Screen"
            return r1
        L60:
            r0 = 15
            if (r1 != r0) goto L67
            java.lang.String r1 = "Overlay"
            return r1
        L67:
            r0 = 16
            if (r1 != r0) goto L6e
            java.lang.String r1 = "Darken"
            return r1
        L6e:
            r0 = 17
            if (r1 != r0) goto L75
            java.lang.String r1 = "Lighten"
            return r1
        L75:
            r0 = 18
            if (r1 != r0) goto L7c
            java.lang.String r1 = "ColorDodge"
            return r1
        L7c:
            r0 = 19
            if (r1 != r0) goto L83
            java.lang.String r1 = "ColorBurn"
            return r1
        L83:
            r0 = 20
            if (r1 != r0) goto L8a
            java.lang.String r1 = "HardLight"
            return r1
        L8a:
            r0 = 21
            if (r1 != r0) goto L91
            java.lang.String r1 = "Softlight"
            return r1
        L91:
            r0 = 22
            if (r1 != r0) goto L98
            java.lang.String r1 = "Difference"
            return r1
        L98:
            r0 = 23
            if (r1 != r0) goto L9f
            java.lang.String r1 = "Exclusion"
            return r1
        L9f:
            r0 = 24
            if (r1 != r0) goto La6
            java.lang.String r1 = "Multiply"
            return r1
        La6:
            r0 = 25
            if (r1 != r0) goto Lad
            java.lang.String r1 = "Hue"
            return r1
        Lad:
            r0 = 26
            if (r1 != r0) goto Lb4
            java.lang.String r1 = "Saturation"
            return r1
        Lb4:
            r0 = 27
            if (r1 != r0) goto Lbb
            java.lang.String r1 = "Color"
            return r1
        Lbb:
            r0 = 28
            if (r1 != r0) goto Lc2
            java.lang.String r1 = "Luminosity"
            return r1
        Lc2:
            java.lang.String r1 = "Unknown"
            return r1
    }

    /* JADX INFO: renamed from: д */
    public static final java.lang.Object m6602(java.lang.Object r1) {
            boolean r0 = r1 instanceof p000.nl0
            if (r0 == 0) goto L8
            r0 = r1
            nl0 r0 = (p000.nl0) r0
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto L11
            ml0 r0 = r0.f7666
            if (r0 != 0) goto L10
            goto L11
        L10:
            return r0
        L11:
            return r1
    }

    /* JADX INFO: renamed from: е */
    public static final p000.r01 m6603(p000.r01 r6, float r7) {
            kw1 r0 = new kw1
            r4 = 0
            r5 = 10
            r2 = 0
            r3 = r7
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r01 r6 = r6.mo4345(r0)
            return r6
    }

    /* JADX INFO: renamed from: ж */
    public static java.lang.Object m6604(p000.e80 r2, java.lang.Object r3, p000.InterfaceC0631op r4) {
            r2.getClass()
            up r0 = r4.mo72()
            hz r1 = p000.C0377hz.f4846
            if (r0 != r1) goto L11
            on0 r0 = new on0
            r0.<init>(r4)
            goto L17
        L11:
            pn0 r1 = new pn0
            r1.<init>(r4, r0)
            r0 = r1
        L17:
            r4 = 2
            p000.h62.m2394(r4, r2)
            java.lang.Object r2 = r2.invoke(r3, r0)
            return r2
    }

    /* JADX INFO: renamed from: з */
    public static void m6605(android.content.Context r18, java.util.concurrent.Executor r19, p000.hj1 r20, boolean r21) {
            r1 = r18
            r5 = r20
            android.content.Context r0 = r1.getApplicationContext()
            java.lang.String r2 = r0.getPackageName()
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo()
            android.content.res.AssetManager r4 = r0.getAssets()
            java.io.File r0 = new java.io.File
            java.lang.String r3 = r3.sourceDir
            r0.<init>(r3)
            java.lang.String r6 = r0.getName()
            android.content.pm.PackageManager r0 = r1.getPackageManager()
            r8 = 7
            r9 = 0
            android.content.pm.PackageInfo r10 = r0.getPackageInfo(r2, r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d2
            java.io.File r11 = r1.getFilesDir()
            java.lang.String r3 = "ProfileInstaller"
            r12 = 0
            if (r21 != 0) goto L8c
            java.io.File r0 = new java.io.File
            java.lang.String r7 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r0.<init>(r11, r7)
            boolean r7 = r0.exists()
            if (r7 != 0) goto L41
        L3f:
            r0 = r9
            goto L6f
        L41:
            java.io.DataInputStream r7 = new java.io.DataInputStream     // Catch: java.io.IOException -> L3f
            java.io.FileInputStream r14 = new java.io.FileInputStream     // Catch: java.io.IOException -> L3f
            r14.<init>(r0)     // Catch: java.io.IOException -> L3f
            r7.<init>(r14)     // Catch: java.io.IOException -> L3f
            long r14 = r7.readLong()     // Catch: java.lang.Throwable -> L64
            r7.close()     // Catch: java.io.IOException -> L3f
            r16 = r14
            long r13 = r10.lastUpdateTime
            int r0 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r0 != 0) goto L5c
            r0 = 1
            goto L5d
        L5c:
            r0 = r9
        L5d:
            if (r0 == 0) goto L6f
            r7 = 2
            r5.mo2512(r7, r12)
            goto L6f
        L64:
            r0 = move-exception
            r13 = r0
            r7.close()     // Catch: java.lang.Throwable -> L6a
            goto L6e
        L6a:
            r0 = move-exception
            r13.addSuppressed(r0)     // Catch: java.io.IOException -> L3f
        L6e:
            throw r13     // Catch: java.io.IOException -> L3f
        L6f:
            if (r0 != 0) goto L72
            goto L8c
        L72:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Skipping profile installation for "
            r0.<init>(r2)
            java.lang.String r2 = r1.getPackageName()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r3, r0)
            p000.lj1.m3578(r1, r9)
            goto L2d1
        L8c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r7 = "Installing profile for "
            r0.<init>(r7)
            java.lang.String r7 = r1.getPackageName()
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r3, r0)
            byte[] r13 = p000.AbstractC0073bd.f1651
            java.io.File r7 = new java.io.File
            java.io.File r0 = new java.io.File
            java.lang.String r3 = "/data/misc/profiles/cur/0"
            r0.<init>(r3, r2)
            java.lang.String r2 = "primary.prof"
            r7.<init>(r0, r2)
            hs r2 = new hs
            java.lang.String r0 = "dexopt/baseline.prof"
            r3 = r4
            r4 = r19
            r2.<init>(r3, r4, r5, r6, r7)
            byte[] r4 = r2.f4792
            if (r4 != 0) goto Lcc
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = 3
            r2.m2527(r3, r0)
        Lc9:
            r7 = 1
            goto L2c6
        Lcc:
            boolean r6 = r7.exists()
            r14 = 4
            if (r6 == 0) goto Ldf
            boolean r6 = r7.canWrite()
            if (r6 != 0) goto Ldd
            r2.m2527(r14, r12)
            goto Lc9
        Ldd:
            r6 = 1
            goto Lec
        Ldf:
            boolean r6 = r7.createNewFile()     // Catch: java.io.IOException -> Le9
            if (r6 != 0) goto Ldd
            r2.m2527(r14, r12)     // Catch: java.io.IOException -> Le9
            goto Lc9
        Le9:
            r7 = 1
            goto L2c3
        Lec:
            r2.f4795 = r6
            r6 = 6
            java.io.FileInputStream r0 = r2.m2526(r3, r0)     // Catch: java.io.IOException -> Lf5 java.io.FileNotFoundException -> Lfa
            r7 = r0
            goto Lff
        Lf5:
            r0 = move-exception
            r5.mo2512(r8, r0)
            goto Lfe
        Lfa:
            r0 = move-exception
            r5.mo2512(r6, r0)
        Lfe:
            r7 = r12
        Lff:
            java.lang.String r15 = "Invalid magic"
            r6 = 8
            if (r7 == 0) goto L14c
            byte[] r0 = p000.AbstractC1021yh.m6906(r7, r14)     // Catch: java.lang.Throwable -> L122 java.lang.IllegalStateException -> L125 java.io.IOException -> L127
            boolean r0 = java.util.Arrays.equals(r13, r0)     // Catch: java.lang.Throwable -> L122 java.lang.IllegalStateException -> L125 java.io.IOException -> L127
            if (r0 == 0) goto L129
            byte[] r0 = p000.AbstractC1021yh.m6906(r7, r14)     // Catch: java.lang.Throwable -> L122 java.lang.IllegalStateException -> L125 java.io.IOException -> L127
            java.lang.String r9 = r2.f4794     // Catch: java.lang.Throwable -> L122 java.lang.IllegalStateException -> L125 java.io.IOException -> L127
            ps[] r9 = p000.AbstractC0073bd.m865(r7, r0, r9)     // Catch: java.lang.Throwable -> L122 java.lang.IllegalStateException -> L125 java.io.IOException -> L127
            r7.close()     // Catch: java.io.IOException -> L11d
            goto L140
        L11d:
            r0 = move-exception
            r5.mo2512(r8, r0)
            goto L140
        L122:
            r0 = move-exception
            r1 = r0
            goto L143
        L125:
            r0 = move-exception
            goto L12f
        L127:
            r0 = move-exception
            goto L13b
        L129:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L122 java.lang.IllegalStateException -> L125 java.io.IOException -> L127
            r0.<init>(r15)     // Catch: java.lang.Throwable -> L122 java.lang.IllegalStateException -> L125 java.io.IOException -> L127
            throw r0     // Catch: java.lang.Throwable -> L122 java.lang.IllegalStateException -> L125 java.io.IOException -> L127
        L12f:
            r5.mo2512(r6, r0)     // Catch: java.lang.Throwable -> L122
        L132:
            r7.close()     // Catch: java.io.IOException -> L136
            goto L13f
        L136:
            r0 = move-exception
            r5.mo2512(r8, r0)
            goto L13f
        L13b:
            r5.mo2512(r8, r0)     // Catch: java.lang.Throwable -> L122
            goto L132
        L13f:
            r9 = r12
        L140:
            r2.f4796 = r9
            goto L14c
        L143:
            r7.close()     // Catch: java.io.IOException -> L147
            goto L14b
        L147:
            r0 = move-exception
            r5.mo2512(r8, r0)
        L14b:
            throw r1
        L14c:
            ps[] r0 = r2.f4796
            if (r0 == 0) goto L1aa
            int r7 = android.os.Build.VERSION.SDK_INT
            r9 = 31
            if (r7 < r9) goto L1aa
            java.lang.String r7 = "dexopt/baseline.profm"
            java.io.FileInputStream r3 = r2.m2526(r3, r7)     // Catch: java.lang.IllegalStateException -> L179 java.io.IOException -> L17b java.io.FileNotFoundException -> L17d
            if (r3 == 0) goto L191
            byte[] r7 = p000.AbstractC0073bd.f1652     // Catch: java.lang.Throwable -> L17f
            byte[] r9 = p000.AbstractC1021yh.m6906(r3, r14)     // Catch: java.lang.Throwable -> L17f
            boolean r7 = java.util.Arrays.equals(r7, r9)     // Catch: java.lang.Throwable -> L17f
            if (r7 == 0) goto L182
            byte[] r7 = p000.AbstractC1021yh.m6906(r3, r14)     // Catch: java.lang.Throwable -> L17f
            ps[] r0 = p000.AbstractC0073bd.m862(r3, r7, r4, r0)     // Catch: java.lang.Throwable -> L17f
            r2.f4796 = r0     // Catch: java.lang.Throwable -> L17f
            r3.close()     // Catch: java.lang.IllegalStateException -> L179 java.io.IOException -> L17b java.io.FileNotFoundException -> L17d
            r0 = r2
            goto L1a7
        L179:
            r0 = move-exception
            goto L197
        L17b:
            r0 = move-exception
            goto L19d
        L17d:
            r0 = move-exception
            goto L1a1
        L17f:
            r0 = move-exception
            r4 = r0
            goto L188
        L182:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L17f
            r0.<init>(r15)     // Catch: java.lang.Throwable -> L17f
            throw r0     // Catch: java.lang.Throwable -> L17f
        L188:
            r3.close()     // Catch: java.lang.Throwable -> L18c
            goto L190
        L18c:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: java.lang.IllegalStateException -> L179 java.io.IOException -> L17b java.io.FileNotFoundException -> L17d
        L190:
            throw r4     // Catch: java.lang.IllegalStateException -> L179 java.io.IOException -> L17b java.io.FileNotFoundException -> L17d
        L191:
            if (r3 == 0) goto L1a6
            r3.close()     // Catch: java.lang.IllegalStateException -> L179 java.io.IOException -> L17b java.io.FileNotFoundException -> L17d
            goto L1a6
        L197:
            r2.f4796 = r12
            r5.mo2512(r6, r0)
            goto L1a6
        L19d:
            r5.mo2512(r8, r0)
            goto L1a6
        L1a1:
            r3 = 9
            r5.mo2512(r3, r0)
        L1a6:
            r0 = r12
        L1a7:
            if (r0 == 0) goto L1aa
            r2 = r0
        L1aa:
            hj1 r3 = r2.f4791
            ps[] r0 = r2.f4796
            byte[] r4 = r2.f4792
            java.lang.String r5 = "This device doesn't support aot. Did you call deviceSupportsAotProfile()?"
            if (r0 == 0) goto L1fe
            if (r4 != 0) goto L1b7
            goto L1fe
        L1b7:
            boolean r7 = r2.f4795
            if (r7 == 0) goto L1fa
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch: java.lang.IllegalStateException -> L1d6 java.io.IOException -> L1d8
            r7.<init>()     // Catch: java.lang.IllegalStateException -> L1d6 java.io.IOException -> L1d8
            r7.write(r13)     // Catch: java.lang.Throwable -> L1da
            r7.write(r4)     // Catch: java.lang.Throwable -> L1da
            boolean r0 = p000.AbstractC0073bd.m896(r7, r4, r0)     // Catch: java.lang.Throwable -> L1da
            if (r0 != 0) goto L1dd
            r0 = 5
            r3.mo2512(r0, r12)     // Catch: java.lang.Throwable -> L1da
            r2.f4796 = r12     // Catch: java.lang.Throwable -> L1da
            r7.close()     // Catch: java.lang.IllegalStateException -> L1d6 java.io.IOException -> L1d8
            goto L1fe
        L1d6:
            r0 = move-exception
            goto L1f0
        L1d8:
            r0 = move-exception
            goto L1f4
        L1da:
            r0 = move-exception
            r4 = r0
            goto L1e7
        L1dd:
            byte[] r0 = r7.toByteArray()     // Catch: java.lang.Throwable -> L1da
            r2.f4797 = r0     // Catch: java.lang.Throwable -> L1da
            r7.close()     // Catch: java.lang.IllegalStateException -> L1d6 java.io.IOException -> L1d8
            goto L1f7
        L1e7:
            r7.close()     // Catch: java.lang.Throwable -> L1eb
            goto L1ef
        L1eb:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: java.lang.IllegalStateException -> L1d6 java.io.IOException -> L1d8
        L1ef:
            throw r4     // Catch: java.lang.IllegalStateException -> L1d6 java.io.IOException -> L1d8
        L1f0:
            r3.mo2512(r6, r0)
            goto L1f7
        L1f4:
            r3.mo2512(r8, r0)
        L1f7:
            r2.f4796 = r12
            goto L1fe
        L1fa:
            p000.C1080.m7279(r5)
            return
        L1fe:
            byte[] r0 = r2.f4797
            if (r0 != 0) goto L206
            r6 = 0
            r7 = 1
            goto L2b3
        L206:
            boolean r3 = r2.f4795
            if (r3 == 0) goto L2bf
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L24c java.io.IOException -> L2a0 java.io.FileNotFoundException -> L2a3
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L24c java.io.IOException -> L2a0 java.io.FileNotFoundException -> L2a3
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L294
            java.io.File r0 = r2.f4793     // Catch: java.lang.Throwable -> L294
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L294
            java.nio.channels.FileChannel r5 = r4.getChannel()     // Catch: java.lang.Throwable -> L288
            java.nio.channels.FileLock r6 = r5.tryLock()     // Catch: java.lang.Throwable -> L27a
            if (r6 == 0) goto L262
            boolean r0 = r6.isValid()     // Catch: java.lang.Throwable -> L264
            if (r0 == 0) goto L262
            r0 = 512(0x200, float:7.17E-43)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L264
        L22a:
            int r7 = r3.read(r0)     // Catch: java.lang.Throwable -> L264
            if (r7 <= 0) goto L235
            r9 = 0
            r4.write(r0, r9, r7)     // Catch: java.lang.Throwable -> L264
            goto L22a
        L235:
            r7 = 1
            r2.m2527(r7, r12)     // Catch: java.lang.Throwable -> L25f
            r6.close()     // Catch: java.lang.Throwable -> L25c
            r5.close()     // Catch: java.lang.Throwable -> L259
            r4.close()     // Catch: java.lang.Throwable -> L256
            r3.close()     // Catch: java.lang.Throwable -> L24c java.io.IOException -> L24f java.io.FileNotFoundException -> L252
            r2.f4797 = r12
            r2.f4796 = r12
            r6 = r7
            goto L2b3
        L24c:
            r0 = move-exception
            goto L2ba
        L24f:
            r0 = move-exception
            goto L2a6
        L252:
            r0 = move-exception
        L253:
            r3 = 6
            goto L2ae
        L256:
            r0 = move-exception
        L257:
            r4 = r0
            goto L297
        L259:
            r0 = move-exception
        L25a:
            r5 = r0
            goto L28b
        L25c:
            r0 = move-exception
        L25d:
            r6 = r0
            goto L27d
        L25f:
            r0 = move-exception
        L260:
            r9 = r0
            goto L26f
        L262:
            r7 = 1
            goto L267
        L264:
            r0 = move-exception
            r7 = 1
            goto L260
        L267:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L25f
            java.lang.String r9 = "Unable to acquire a lock on the underlying file channel."
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L25f
            throw r0     // Catch: java.lang.Throwable -> L25f
        L26f:
            if (r6 == 0) goto L279
            r6.close()     // Catch: java.lang.Throwable -> L275
            goto L279
        L275:
            r0 = move-exception
            r9.addSuppressed(r0)     // Catch: java.lang.Throwable -> L25c
        L279:
            throw r9     // Catch: java.lang.Throwable -> L25c
        L27a:
            r0 = move-exception
            r7 = 1
            goto L25d
        L27d:
            if (r5 == 0) goto L287
            r5.close()     // Catch: java.lang.Throwable -> L283
            goto L287
        L283:
            r0 = move-exception
            r6.addSuppressed(r0)     // Catch: java.lang.Throwable -> L259
        L287:
            throw r6     // Catch: java.lang.Throwable -> L259
        L288:
            r0 = move-exception
            r7 = 1
            goto L25a
        L28b:
            r4.close()     // Catch: java.lang.Throwable -> L28f
            goto L293
        L28f:
            r0 = move-exception
            r5.addSuppressed(r0)     // Catch: java.lang.Throwable -> L256
        L293:
            throw r5     // Catch: java.lang.Throwable -> L256
        L294:
            r0 = move-exception
            r7 = 1
            goto L257
        L297:
            r3.close()     // Catch: java.lang.Throwable -> L29b
            goto L29f
        L29b:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: java.lang.Throwable -> L24c java.io.IOException -> L24f java.io.FileNotFoundException -> L252
        L29f:
            throw r4     // Catch: java.lang.Throwable -> L24c java.io.IOException -> L24f java.io.FileNotFoundException -> L252
        L2a0:
            r0 = move-exception
            r7 = 1
            goto L2a6
        L2a3:
            r0 = move-exception
            r7 = 1
            goto L253
        L2a6:
            r2.m2527(r8, r0)     // Catch: java.lang.Throwable -> L24c
        L2a9:
            r2.f4797 = r12
            r2.f4796 = r12
            goto L2b2
        L2ae:
            r2.m2527(r3, r0)     // Catch: java.lang.Throwable -> L24c
            goto L2a9
        L2b2:
            r6 = 0
        L2b3:
            if (r6 == 0) goto L2b8
            m6571(r10, r11)
        L2b8:
            r9 = r6
            goto L2c7
        L2ba:
            r2.f4797 = r12
            r2.f4796 = r12
            throw r0
        L2bf:
            p000.C1080.m7279(r5)
            return
        L2c3:
            r2.m2527(r14, r12)
        L2c6:
            r9 = 0
        L2c7:
            if (r9 == 0) goto L2cd
            if (r21 == 0) goto L2cd
            r9 = r7
            goto L2ce
        L2cd:
            r9 = 0
        L2ce:
            p000.lj1.m3578(r1, r9)
        L2d1:
            return
        L2d2:
            r0 = move-exception
            r5.mo2512(r8, r0)
            r9 = 0
            p000.lj1.m3578(r1, r9)
            return
    }

    /* JADX INFO: renamed from: Ρ */
    public abstract android.view.View mo3521(int r1);

    /* JADX INFO: renamed from: Σ */
    public abstract boolean mo3522();
}
