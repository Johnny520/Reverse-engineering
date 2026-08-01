package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class n10 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.atomic.AtomicBoolean f7350 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.atomic.AtomicBoolean f7351 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.HashSet f7352 = null;

    /* JADX INFO: renamed from: δ */
    public static final android.os.Handler f7353 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.util.concurrent.ConcurrentHashMap f7354 = null;

    /* JADX INFO: renamed from: ζ */
    public static final java.util.concurrent.ConcurrentHashMap f7355 = null;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.n10.f7350 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r1)
            p000.n10.f7351 = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            p000.n10.f7352 = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            p000.n10.f7353 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.n10.f7354 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.n10.f7355 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final int m3932(java.lang.reflect.Method r6) {
            java.lang.Class r0 = r6.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "X.C2695841Ugo"
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 == 0) goto L14
            r0 = 1000(0x3e8, float:1.401E-42)
            goto L15
        L14:
            r0 = r1
        L15:
            java.lang.Class r2 = r6.getDeclaringClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "X."
            boolean r2 = p000.x02.m6485(r2, r3, r1)
            if (r2 == 0) goto L27
            int r0 = r0 + 80
        L27:
            java.lang.Class[] r2 = r6.getParameterTypes()
            int r2 = r2.length
            r4 = 16
            if (r2 < r4) goto L32
            int r0 = r0 + 200
        L32:
            java.lang.Class[] r6 = r6.getParameterTypes()
            r6.getClass()
            int r2 = r6.length
            r4 = r1
        L3b:
            if (r4 >= r2) goto L4f
            r5 = r6[r4]
            java.lang.String r5 = r5.getName()
            boolean r5 = p000.x02.m6485(r5, r3, r1)
            if (r5 == 0) goto L4c
            int r0 = r0 + 60
            return r0
        L4c:
            int r4 = r4 + 1
            goto L3b
        L4f:
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static java.util.ArrayList m3933(java.util.ArrayList r17) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r17.iterator()
        L9:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L20
            java.lang.Object r2 = r1.next()
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            boolean r3 = m3935(r3)
            if (r3 == 0) goto L9
            r0.add(r2)
            goto L9
        L20:
            java.util.Iterator r1 = r0.iterator()
        L24:
            boolean r2 = r1.hasNext()
            r3 = 1
            if (r2 == 0) goto L35
            java.lang.Object r2 = r1.next()
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            r2.setAccessible(r3)
            goto L24
        L35:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L43:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L9b
            java.lang.Object r4 = r0.next()
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
        L6b:
            if (r12 >= r11) goto L74
            r13 = r9[r12]
            int r12 = p000.lz1.m3679(r13, r10, r12, r3)
            goto L6b
        L74:
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
            boolean r5 = p000.lz1.m3673(r5, r6, r8, r1)
            if (r5 == 0) goto L43
            r2.add(r4)
            goto L43
        L9b:
            return r2
    }

    /* JADX INFO: renamed from: γ */
    public static void m3934(java.lang.ClassLoader r17) {
            r17.getClass()
            boolean r0 = p000.ui1.m5903()
            if (r0 != 0) goto Lf
            java.lang.String r0 = "r9eb8b428fc66b159"
            p000.C0888ux.m5985(r0)
            return
        Lf:
            java.util.concurrent.atomic.AtomicBoolean r0 = p000.n10.f7351
            r1 = 0
            r2 = 1
            boolean r3 = r0.compareAndSet(r1, r2)
            if (r3 != 0) goto L1a
            return
        L1a:
            r3 = r17
            java.util.List r3 = m3937(r3, r1)
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L2f
            r0.set(r1)
            java.lang.String r0 = "r713391239fc9ec38"
            p000.C0888ux.m5985(r0)
            return
        L2f:
            java.util.Iterator r4 = r3.iterator()
        L33:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Ld7
            java.lang.Object r0 = r4.next()
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            java.lang.String r5 = "rc05ab773455a98cf"
            java.lang.String r6 = p000.lz1.m3694(r0)
            java.lang.String r7 = r0.getName()
            java.lang.String r8 = p000.lz1.m3690(r7, r0)
            java.lang.Class[] r9 = r0.getParameterTypes()
            r9.getClass()
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = r9.length
            r10.<init>(r11)
            int r11 = r9.length
            r12 = r1
        L5c:
            if (r12 >= r11) goto L65
            r13 = r9[r12]
            int r12 = p000.lz1.m3679(r13, r10, r12, r2)
            goto L5c
        L65:
            int r9 = r0.getModifiers()
            java.lang.reflect.Modifier.isStatic(r9)
            java.lang.String r11 = ","
            r15 = 0
            r16 = 62
            r12 = 0
            r13 = 0
            r14 = 0
            java.lang.String r9 = p000.AbstractC0984xh.m6644(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r10 = "#"
            java.lang.String r11 = "("
            java.lang.StringBuilder r6 = p000.AbstractC0602nx.m4138(r6, r10, r7, r11, r9)
            java.lang.String r7 = "):"
            java.lang.String r6 = p000.lz1.m3691(r6, r7, r8)
            java.util.HashSet r7 = p000.n10.f7352
            monitor-enter(r7)
            boolean r8 = r7.add(r6)     // Catch: java.lang.Throwable -> Ld4
            if (r8 != 0) goto L91
            monitor-exit(r7)
            goto L33
        L91:
            monitor-exit(r7)
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> Laa
            xq0 r7 = p000.xq0.f12253     // Catch: java.lang.Throwable -> Laa
            f10 r8 = new f10     // Catch: java.lang.Throwable -> Laa
            r9 = 1
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Laa
            r7.m6775(r0, r8)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r0 = r5.concat(r6)     // Catch: java.lang.Throwable -> Laa
            p000.C0888ux.m5985(r0)     // Catch: java.lang.Throwable -> Laa
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> Laa
            goto Lb1
        Laa:
            r0 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r0)
            r0 = r5
        Lb1:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L33
            java.util.HashSet r5 = p000.n10.f7352
            monitor-enter(r5)
            r5.remove(r6)     // Catch: java.lang.Throwable -> Ld1
            monitor-exit(r5)
            java.lang.String r5 = "raf1bb8974ad1e90"
            java.lang.String r7 = r0.getMessage()
            java.lang.String r8 = "hook failed "
            java.lang.String r9 = ": "
            java.lang.String r6 = p000.a12.m18(r8, r6, r9, r7)
            p000.C0888ux.m5977(r5, r6, r0)
            goto L33
        Ld1:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        Ld4:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        Ld7:
            int r0 = r3.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "r441813f05f4095a4"
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            p000.C0888ux.m5985(r0)
            return
    }

    /* JADX INFO: renamed from: δ */
    public static boolean m3935(java.lang.reflect.Method r5) {
            int r0 = r5.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            r1 = 0
            if (r0 == 0) goto Ld
            goto L7b
        Ld:
            java.lang.Class r0 = r5.getReturnType()
            java.lang.String r0 = r0.getName()
            java.lang.String r2 = "~7958639020ABF95155FECBEFEE807165BD4E6AA9062C97DCAC516C0DF08B46AFD681258733F65F56ED85D13872AD5795D57F46"
            java.lang.String r2 = p000.jf0.m2957(r2)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L22
            goto L7b
        L22:
            java.lang.Class[] r5 = r5.getParameterTypes()
            int r0 = r5.length
            r2 = 8
            if (r0 >= r2) goto L2c
            goto L7b
        L2c:
            r0 = r5[r1]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            boolean r0 = p000.ln0.m3626(r0, r2)
            if (r0 == 0) goto L7b
            r0 = 1
            r3 = r5[r0]
            boolean r3 = p000.ln0.m3626(r3, r2)
            if (r3 != 0) goto L40
            goto L7b
        L40:
            r3 = 2
            r3 = r5[r3]
            java.lang.Class r4 = java.lang.Integer.TYPE
            boolean r3 = p000.ln0.m3626(r3, r4)
            if (r3 == 0) goto L7b
            r3 = 3
            r3 = r5[r3]
            boolean r3 = p000.ln0.m3626(r3, r4)
            if (r3 == 0) goto L7b
            r3 = 4
            r3 = r5[r3]
            boolean r3 = p000.ln0.m3626(r3, r4)
            if (r3 != 0) goto L5e
            goto L7b
        L5e:
            r3 = 5
            r3 = r5[r3]
            boolean r3 = p000.ln0.m3626(r3, r2)
            if (r3 == 0) goto L7b
            r3 = 6
            r3 = r5[r3]
            boolean r3 = p000.ln0.m3626(r3, r4)
            if (r3 == 0) goto L7b
            r3 = 7
            r5 = r5[r3]
            boolean r5 = p000.ln0.m3626(r5, r2)
            if (r5 != 0) goto L7a
            goto L7b
        L7a:
            return r0
        L7b:
            return r1
    }

    /* JADX INFO: renamed from: ε */
    public static java.util.List m3936(java.lang.ClassLoader r5) {
            java.lang.String r0 = "X.C2695841Ugo"
            r1 = 0
            java.lang.Class r2 = java.lang.Class.forName(r0, r1, r5)     // Catch: java.lang.Throwable -> L8
            goto Lf
        L8:
            r2 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r2)
            r2 = r3
        Lf:
            boolean r3 = r2 instanceof p000.eo1
            r4 = 0
            if (r3 == 0) goto L15
            r2 = r4
        L15:
            java.lang.Class r2 = (java.lang.Class) r2
            if (r2 != 0) goto L2e
            java.lang.Class r5 = r5.loadClass(r0)     // Catch: java.lang.Throwable -> L1e
            goto L25
        L1e:
            r5 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r5)
            r5 = r0
        L25:
            boolean r0 = r5 instanceof p000.eo1
            if (r0 == 0) goto L2a
            goto L2b
        L2a:
            r4 = r5
        L2b:
            r2 = r4
            java.lang.Class r2 = (java.lang.Class) r2
        L2e:
            if (r2 != 0) goto L33
            jz r5 = p000.C0450jz.f5672
            return r5
        L33:
            java.lang.reflect.Method[] r5 = r2.getDeclaredMethods()
            r5.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r2 = r5.length
        L40:
            if (r1 >= r2) goto L53
            r3 = r5[r1]
            r3.getClass()
            boolean r4 = m3935(r3)
            if (r4 == 0) goto L50
            r0.add(r3)
        L50:
            int r1 = r1 + 1
            goto L40
        L53:
            java.util.Iterator r5 = r0.iterator()
        L57:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L68
            java.lang.Object r1 = r5.next()
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            r2 = 1
            r1.setAccessible(r2)
            goto L57
        L68:
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public static java.util.List m3937(java.lang.ClassLoader r5, boolean r6) {
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = p000.EnumC0491kx.f6262
            java.util.List r1 = p000.C0666ox.m4323(r0, r5)
            if (r1 == 0) goto L39
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L13:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r1.next()
            r4 = r3
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            boolean r4 = m3935(r4)
            if (r4 == 0) goto L13
            r2.add(r3)
            goto L13
        L2a:
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L31
            goto L32
        L31:
            r2 = 0
        L32:
            if (r2 == 0) goto L39
            java.util.ArrayList r5 = m3933(r2)
            return r5
        L39:
            java.util.List r1 = m3936(r5)
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L4b
            if (r6 == 0) goto L4a
            java.lang.Object r5 = p000.C0666ox.f8297
            p000.C0666ox.m4327(r0, r1)
        L4a:
            return r1
        L4b:
            if (r6 == 0) goto L86
            java.lang.Object r6 = p000.C0666ox.f8297
            java.util.concurrent.atomic.AtomicBoolean r6 = p000.C0666ox.f8305
            boolean r6 = r6.get()
            if (r6 != 0) goto L58
            goto L86
        L58:
            bb r6 = new bb
            r1 = 24
            r6.<init>(r5, r1)
            java.lang.String r1 = "定位 Feed 关注提交入口"
            java.util.List r5 = p000.C0666ox.m4316(r0, r5, r1, r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L6e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L85
            java.lang.Object r0 = r5.next()
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            boolean r1 = m3935(r1)
            if (r1 == 0) goto L6e
            r6.add(r0)
            goto L6e
        L85:
            return r6
        L86:
            jz r5 = p000.C0450jz.f5672
            return r5
    }
}
