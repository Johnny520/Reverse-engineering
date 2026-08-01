package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class wi0 {

    /* JADX INFO: renamed from: α */
    public static final p000.wi0 f11726 = null;

    /* JADX INFO: renamed from: β */
    public static final java.lang.String[] f11727 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.atomic.AtomicBoolean f11728 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.concurrent.atomic.AtomicReference f11729 = null;

    /* JADX INFO: renamed from: ε */
    public static final java.util.concurrent.atomic.AtomicReference f11730 = null;

    /* JADX INFO: renamed from: ζ */
    public static final java.util.concurrent.atomic.AtomicReference f11731 = null;

    /* JADX INFO: renamed from: η */
    public static final java.util.concurrent.atomic.AtomicLong f11732 = null;

    /* JADX INFO: renamed from: θ */
    public static final java.util.concurrent.ConcurrentHashMap f11733 = null;

    static {
            wi0 r0 = new wi0
            r0.<init>()
            p000.wi0.f11726 = r0
            java.lang.String r0 = "X.C2828591ZpS"
            java.lang.String r1 = "X.1ZpS"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            p000.wi0.f11727 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.wi0.f11728 = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            p000.wi0.f11729 = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            p000.wi0.f11730 = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            jz r1 = p000.C0450jz.f5672
            r0.<init>(r1)
            p000.wi0.f11731 = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r1 = 0
            r0.<init>(r1)
            p000.wi0.f11732 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.wi0.f11733 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.util.ArrayList m6381(java.lang.Class r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.reflect.Method[] r1 = r4.getMethods()     // Catch: java.lang.Throwable -> Lf
            r1.getClass()     // Catch: java.lang.Throwable -> Lf
            p000.AbstractC0984xh.m6659(r0, r1)     // Catch: java.lang.Throwable -> Lf
        Lf:
            if (r4 == 0) goto L28
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L28
            java.lang.reflect.Method[] r1 = r4.getDeclaredMethods()     // Catch: java.lang.Throwable -> L23
            r1.getClass()     // Catch: java.lang.Throwable -> L23
            p000.AbstractC0984xh.m6659(r0, r1)     // Catch: java.lang.Throwable -> L23
        L23:
            java.lang.Class r4 = r4.getSuperclass()
            goto Lf
        L28:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L36:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L51
            java.lang.Object r2 = r0.next()
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.String r3 = m6388(r3)
            boolean r3 = r4.add(r3)
            if (r3 == 0) goto L36
            r1.add(r2)
            goto L36
        L51:
            return r1
    }

    /* JADX INFO: renamed from: β */
    public static boolean m6382(java.lang.Object r4, p000.vi0 r5, long r6, p000.p70 r8) {
            r0 = 120(0x78, double:5.93E-322)
            java.lang.Thread.sleep(r0)
        L5:
            java.lang.Object r2 = r8.invoke()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L27
            long r2 = java.lang.System.currentTimeMillis()
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 >= 0) goto L27
            java.lang.reflect.Method r2 = r5.f11303
            boolean r2 = m6389(r2, r4)
            if (r2 != 0) goto L23
            r4 = 1
            return r4
        L23:
            java.lang.Thread.sleep(r0)
            goto L5
        L27:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: γ */
    public static void m6383(java.lang.Object r5, java.lang.reflect.Method r6, java.util.ArrayList r7, java.util.Set r8) {
            r0 = 0
            java.lang.Object r5 = r6.invoke(r5, r0)     // Catch: java.lang.Throwable -> L6
            goto Ld
        L6:
            r5 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r5)
            r5 = r6
        Ld:
            boolean r6 = r5 instanceof p000.eo1
            if (r6 == 0) goto L12
            r5 = r0
        L12:
            boolean r6 = r5 instanceof java.lang.Iterable
            if (r6 == 0) goto L19
            r0 = r5
            java.lang.Iterable r0 = (java.lang.Iterable) r0
        L19:
            if (r0 != 0) goto L1d
            goto L8f
        L1d:
            java.util.ArrayList r5 = p000.AbstractC0984xh.m6637(r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L2a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r0 = r5.next()
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "~7934B87CF08E6E0B8EF20E7F7EAFB0B14A20D8F45CA801574E4ACC71C619528447ABA15E9CCFA094"
            java.lang.String r3 = p000.jf0.m2957(r2)
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L70
            java.lang.Class r1 = r0.getClass()
            java.util.concurrent.atomic.AtomicReference r3 = p000.wi0.f11729
            java.lang.Object r3 = r3.get()
            java.lang.ClassLoader r3 = (java.lang.ClassLoader) r3
            r4 = 0
            if (r3 != 0) goto L5f
            java.lang.ClassLoader r3 = r1.getClassLoader()
            if (r3 != 0) goto L5f
        L5d:
            r1 = r4
            goto L6e
        L5f:
            java.lang.String r2 = p000.jf0.m2957(r2)
            java.lang.Class r2 = p000.AbstractC0093bx.m1082(r3, r2)
            if (r2 != 0) goto L6a
            goto L5d
        L6a:
            boolean r1 = r2.isAssignableFrom(r1)
        L6e:
            if (r1 == 0) goto L71
        L70:
            r4 = 1
        L71:
            if (r4 == 0) goto L2a
            r6.add(r0)
            goto L2a
        L77:
            java.util.Iterator r5 = r6.iterator()
        L7b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L8f
            java.lang.Object r6 = r5.next()
            boolean r0 = r8.add(r6)
            if (r0 == 0) goto L7b
            r7.add(r6)
            goto L7b
        L8f:
            return
    }

    /* JADX INFO: renamed from: δ */
    public static java.lang.String m6384(java.lang.Object r2) {
            java.lang.String r0 = "getConversationId"
            java.lang.Object r2 = m6387(r2, r0)
            boolean r0 = r2 instanceof java.lang.String
            r1 = 0
            if (r0 == 0) goto Le
            java.lang.String r2 = (java.lang.String) r2
            goto Lf
        Le:
            r2 = r1
        Lf:
            if (r2 == 0) goto L22
            java.lang.CharSequence r2 = p000.q02.m4660(r2)
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L22
            boolean r0 = p000.q02.m4671(r2)
            if (r0 != 0) goto L22
            return r2
        L22:
            return r1
    }

    /* JADX INFO: renamed from: ε */
    public static java.util.ArrayList m6385(java.util.ArrayList r4) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r4 = r4.iterator()
        Le:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r4.next()
            java.lang.String r3 = m6384(r2)
            if (r3 != 0) goto L22
            r1.add(r2)
            goto Le
        L22:
            r0.putIfAbsent(r3, r2)
            goto Le
        L26:
            java.util.Collection r4 = r0.values()
            r4.getClass()
            java.util.ArrayList r4 = p000.AbstractC0984xh.m6651(r4, r1)
            return r4
    }

    /* JADX INFO: renamed from: ζ */
    public static java.lang.Object m6386(java.lang.Class r2) {
            java.lang.Class r0 = java.lang.Void.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            goto L75
        L9:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L14
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            return r2
        L14:
            java.lang.Class r0 = java.lang.Byte.TYPE
            boolean r0 = r2.equals(r0)
            r1 = 0
            if (r0 == 0) goto L22
            java.lang.Byte r2 = java.lang.Byte.valueOf(r1)
            return r2
        L22:
            java.lang.Class r0 = java.lang.Short.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L2f
            java.lang.Short r2 = java.lang.Short.valueOf(r1)
            return r2
        L2f:
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L3c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            return r2
        L3c:
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L4b
            r0 = 0
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            return r2
        L4b:
            java.lang.Class r0 = java.lang.Float.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L59
            r2 = 0
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            return r2
        L59:
            java.lang.Class r0 = java.lang.Double.TYPE
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L68
            r0 = 0
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
            return r2
        L68:
            java.lang.Class r0 = java.lang.Character.TYPE
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L75
            java.lang.Character r2 = java.lang.Character.valueOf(r1)
            return r2
        L75:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: θ */
    public static java.lang.Object m6387(java.lang.Object r5, java.lang.String r6) {
            r0 = 0
            if (r5 != 0) goto L4
            goto L37
        L4:
            java.lang.Class r1 = r5.getClass()
            java.util.ArrayList r1 = m6381(r1)
            java.util.Iterator r1 = r1.iterator()
        L10:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L32
            java.lang.Object r2 = r1.next()
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.String r4 = r3.getName()
            boolean r4 = p000.ln0.m3626(r4, r6)
            if (r4 == 0) goto L10
            java.lang.Class[] r3 = r3.getParameterTypes()
            r3.getClass()
            int r3 = r3.length
            if (r3 != 0) goto L10
            goto L33
        L32:
            r2 = r0
        L33:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            if (r2 != 0) goto L38
        L37:
            return r0
        L38:
            r6 = 1
            r2.setAccessible(r6)     // Catch: java.lang.Throwable -> L41
            java.lang.Object r5 = r2.invoke(r5, r0)     // Catch: java.lang.Throwable -> L41
            goto L48
        L41:
            r5 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r5)
            r5 = r6
        L48:
            boolean r6 = r5 instanceof p000.eo1
            if (r6 == 0) goto L4d
            goto L4e
        L4d:
            r0 = r5
        L4e:
            return r0
    }

    /* JADX INFO: renamed from: κ */
    public static java.lang.String m6388(java.lang.reflect.Method r6) {
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
            sh0 r2 = new sh0
            r3 = 21
            r2.<init>(r3)
            r3 = 30
            java.lang.String r4 = ","
            r5 = 0
            java.lang.String r1 = p000.AbstractC0312g7.m2256(r1, r4, r5, r2, r3)
            java.lang.String r2 = "):"
            java.lang.String r6 = p000.lz1.m3692(r0, r1, r2, r6)
            return r6
    }

    /* JADX INFO: renamed from: μ */
    public static boolean m6389(java.lang.reflect.Method r1, java.lang.Object r2) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            r0 = 0
            java.lang.Object r1 = r1.invoke(r2, r0)     // Catch: java.lang.Throwable -> L10
            boolean r2 = r1 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L12
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L10
            goto L1a
        L10:
            r1 = move-exception
            goto L14
        L12:
            r1 = r0
            goto L1a
        L14:
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        L1a:
            boolean r2 = r1 instanceof p000.eo1
            if (r2 == 0) goto L1f
            goto L20
        L1f:
            r0 = r1
        L20:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r1 = p000.ln0.m3626(r0, r1)
            return r1
    }

    /* JADX INFO: renamed from: ξ */
    public static java.lang.Class m6390(java.lang.ClassLoader r6) {
            java.lang.String r0 = "~78DF588B0EC79FAF9E614C08184F8649CB64E2954C8C7DAB5724BB89BE6385D9C2932ECA4237E4AFA25B040AEAA203EF26CB2F6D47FBE24A5AA0270B525149A01D60541126DF0CB30D0E8AD605CE57E8A99A"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.lang.Class r6 = p000.AbstractC0093bx.m1082(r6, r0)
            r0 = 0
            if (r6 != 0) goto Le
            return r0
        Le:
            java.util.ArrayList r1 = m6381(r6)
            java.util.Iterator r1 = r1.iterator()
        L16:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L44
            java.lang.Object r2 = r1.next()
            r3 = r2
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.String r4 = r3.getName()
            java.lang.String r5 = "getStrangerListModel"
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 == 0) goto L16
            java.lang.Class[] r4 = r3.getParameterTypes()
            r4.getClass()
            int r4 = r4.length
            if (r4 != 0) goto L16
            java.lang.Class r3 = r3.getReturnType()
            boolean r3 = r3.isInterface()
            if (r3 == 0) goto L16
            goto L45
        L44:
            r2 = r0
        L45:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            if (r2 == 0) goto L50
            java.lang.Class r1 = r2.getReturnType()
            if (r1 == 0) goto L50
            return r1
        L50:
            java.util.ArrayList r6 = m6381(r6)
            f7 r1 = new f7
            r2 = 1
            r1.<init>(r2, r6)
            sh0 r6 = new sh0
            r2 = 22
            r6.<init>(r2)
            y30 r2 = new y30
            r3 = 1
            r2.<init>(r1, r3, r6)
            sh0 r6 = new sh0
            r1 = 23
            r6.<init>(r1)
            t52 r1 = new t52
            r1.<init>(r2, r6)
            cu r6 = p000.us1.m5952(r1)
            java.util.Iterator r6 = r6.iterator()
        L7b:
            r1 = r6
            σ r1 = (p000.AbstractC1095) r1
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lea
            java.lang.Object r1 = r1.next()
            r2 = r1
            java.lang.Class r2 = (java.lang.Class) r2
            java.util.ArrayList r2 = m6381(r2)
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L96
            goto L7b
        L96:
            java.util.Iterator r3 = r2.iterator()
        L9a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L7b
            java.lang.Object r4 = r3.next()
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.Class[] r5 = r4.getParameterTypes()
            r5.getClass()
            int r5 = r5.length
            if (r5 != 0) goto L9a
            java.lang.Class<java.util.List> r5 = java.util.List.class
            java.lang.Class r4 = r4.getReturnType()
            boolean r4 = r5.isAssignableFrom(r4)
            if (r4 == 0) goto L9a
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto Lc3
            goto L7b
        Lc3:
            java.util.Iterator r2 = r2.iterator()
        Lc7:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L7b
            java.lang.Object r3 = r2.next()
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.Class[] r4 = r3.getParameterTypes()
            r4.getClass()
            int r4 = r4.length
            if (r4 != 0) goto Lc7
            java.lang.Class r3 = r3.getReturnType()
            java.lang.Class r4 = java.lang.Boolean.TYPE
            boolean r3 = p000.ln0.m3626(r3, r4)
            if (r3 == 0) goto Lc7
            r0 = r1
        Lea:
            java.lang.Class r0 = (java.lang.Class) r0
            return r0
    }

    /* JADX INFO: renamed from: ο */
    public static int m6391(java.lang.Class r4, java.lang.reflect.Method r5) {
            int r0 = r5.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            r1 = 0
            if (r0 != 0) goto Lc
            goto L65
        Lc:
            java.lang.Class r0 = r5.getReturnType()
            boolean r4 = r4.isAssignableFrom(r0)
            if (r4 != 0) goto L17
            goto L65
        L17:
            java.lang.Class[] r4 = r5.getParameterTypes()
            r4.getClass()
            int r5 = r4.length
            r0 = r1
        L20:
            java.lang.Class r2 = java.lang.Integer.TYPE
            if (r0 >= r5) goto L35
            r3 = r4[r0]
            boolean r2 = p000.ln0.m3626(r3, r2)
            if (r2 != 0) goto L32
            boolean r2 = r3.isEnum()
            if (r2 == 0) goto L65
        L32:
            int r0 = r0 + 1
            goto L20
        L35:
            int r5 = r4.length
            r0 = 2
            if (r5 > r0) goto L65
            int r5 = r4.length
            if (r5 != r0) goto L5c
            int r5 = r4.length
            r0 = r1
        L3e:
            if (r0 >= r5) goto L5c
            r3 = r4[r0]
            boolean r3 = p000.ln0.m3626(r3, r2)
            if (r3 == 0) goto L59
            int r5 = r4.length
        L49:
            if (r1 >= r5) goto L5c
            r0 = r4[r1]
            boolean r0 = r0.isEnum()
            if (r0 == 0) goto L56
            r4 = 9000(0x2328, float:1.2612E-41)
            return r4
        L56:
            int r1 = r1 + 1
            goto L49
        L59:
            int r0 = r0 + 1
            goto L3e
        L5c:
            int r4 = r4.length
            if (r4 != 0) goto L62
            r4 = 7000(0x1b58, float:9.809E-42)
            return r4
        L62:
            r4 = 6000(0x1770, float:8.408E-42)
            return r4
        L65:
            return r1
    }

    /* JADX INFO: renamed from: η */
    public final void m6392(java.lang.ClassLoader r3) {
            r2 = this;
            r3.getClass()
            java.util.concurrent.atomic.AtomicReference r0 = p000.wi0.f11729
            r0.set(r3)
            java.util.concurrent.atomic.AtomicReference r0 = p000.wi0.f11730
            java.lang.Object r0 = r0.getAndSet(r3)
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            java.util.concurrent.atomic.AtomicReference r1 = p000.wi0.f11731
            if (r0 == 0) goto L1b
            if (r0 == r3) goto L1b
            jz r0 = p000.C0450jz.f5672
            r1.set(r0)
        L1b:
            r0 = 0
            java.util.List r2 = r2.m6395(r3, r0)
            r1.set(r2)
            return
    }

    /* JADX INFO: renamed from: ι */
    public final p000.ui0 m6393(java.lang.ClassLoader r27, p000.p70 r28) {
            r26 = this;
            r0 = r27
            r1 = r28
            java.lang.String r2 = "r542b803b7817851a"
            r3 = 20
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.getClass()
            java.util.concurrent.atomic.AtomicReference r4 = p000.wi0.f11729
            r4.set(r0)
            java.lang.Class r4 = m6390(r0)
            java.lang.Class r5 = java.lang.Integer.TYPE
            r7 = 0
            if (r4 != 0) goto L20
        L1d:
            r7 = 0
            goto Lc6
        L20:
            r9 = r26
            java.util.List r0 = r9.m6395(r0, r7)
            java.util.Iterator r9 = r0.iterator()
        L2a:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r9.next()
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            java.lang.Class[] r10 = r0.getParameterTypes()
            r10.getClass()
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = r10.length
            r11.<init>(r12)
            int r12 = r10.length
            r13 = r7
        L45:
            if (r13 >= r12) goto L94
            r14 = r10[r13]
            boolean r15 = p000.ln0.m3626(r14, r5)
            if (r15 == 0) goto L53
            r11.add(r3)
            goto L8e
        L53:
            boolean r15 = r14.isEnum()
            if (r15 == 0) goto L92
            java.lang.Object[] r14 = r14.getEnumConstants()
            if (r14 == 0) goto L92
            int r15 = r14.length
            r8 = r7
        L61:
            if (r8 >= r15) goto L88
            r6 = r14[r8]
            boolean r7 = r6 instanceof java.lang.Enum
            if (r7 == 0) goto L6d
            r7 = r6
            java.lang.Enum r7 = (java.lang.Enum) r7
            goto L6e
        L6d:
            r7 = 0
        L6e:
            if (r7 == 0) goto L77
            java.lang.String r7 = r7.name()
        L74:
            r26 = r6
            goto L79
        L77:
            r7 = 0
            goto L74
        L79:
            java.lang.String r6 = "STRANGER"
            boolean r6 = p000.ln0.m3626(r7, r6)
            if (r6 == 0) goto L84
            r6 = r26
            goto L89
        L84:
            int r8 = r8 + 1
            r7 = 0
            goto L61
        L88:
            r6 = 0
        L89:
            if (r6 == 0) goto L92
            r11.add(r6)
        L8e:
            int r13 = r13 + 1
            r7 = 0
            goto L45
        L92:
            r6 = 0
            goto L9b
        L94:
            r6 = r7
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.Object[] r6 = r11.toArray(r7)
        L9b:
            if (r6 != 0) goto L9e
            goto Lc3
        L9e:
            r7 = 1
            r0.setAccessible(r7)     // Catch: java.lang.Throwable -> Lad
            int r7 = r6.length     // Catch: java.lang.Throwable -> Lad
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r7)     // Catch: java.lang.Throwable -> Lad
            r7 = 0
            java.lang.Object r0 = r0.invoke(r7, r6)     // Catch: java.lang.Throwable -> Lad
            goto Lb4
        Lad:
            r0 = move-exception
            eo1 r6 = new eo1
            r6.<init>(r0)
            r0 = r6
        Lb4:
            boolean r6 = r0 instanceof p000.eo1
            if (r6 == 0) goto Lb9
            r0 = 0
        Lb9:
            if (r0 == 0) goto Lc3
            boolean r6 = r4.isInstance(r0)
            if (r6 == 0) goto Lc3
            r7 = r0
            goto Lc6
        Lc3:
            r7 = 0
            goto L2a
        Lc6:
            jz r0 = p000.C0450jz.f5672
            if (r7 != 0) goto Ld3
            ui0 r1 = new ui0
            java.lang.String r2 = "未定位到陌生人会话模型"
            r6 = 0
            r1.<init>(r0, r6, r2)
            return r1
        Ld3:
            java.lang.Class r4 = r7.getClass()
            java.util.ArrayList r4 = m6381(r4)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r8 = r4.iterator()
        Le4:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L10b
            java.lang.Object r9 = r8.next()
            r10 = r9
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            java.lang.Class[] r11 = r10.getParameterTypes()
            r11.getClass()
            int r11 = r11.length
            if (r11 != 0) goto Le4
            java.lang.Class<java.util.List> r11 = java.util.List.class
            java.lang.Class r10 = r10.getReturnType()
            boolean r10 = r11.isAssignableFrom(r10)
            if (r10 == 0) goto Le4
            r6.add(r9)
            goto Le4
        L10b:
            java.util.Iterator r6 = r6.iterator()
            boolean r8 = r6.hasNext()
            if (r8 != 0) goto L117
            r8 = 0
            goto L154
        L117:
            java.lang.Object r8 = r6.next()
            boolean r10 = r6.hasNext()
            if (r10 != 0) goto L122
            goto L154
        L122:
            r10 = r8
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            java.lang.String r10 = r10.getName()
            java.lang.String r11 = "S3"
            boolean r10 = p000.ln0.m3626(r10, r11)
            if (r10 == 0) goto L134
            r10 = 10
            goto L135
        L134:
            r10 = 0
        L135:
            java.lang.Object r12 = r6.next()
            r13 = r12
            java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
            java.lang.String r13 = r13.getName()
            boolean r13 = p000.ln0.m3626(r13, r11)
            if (r13 == 0) goto L149
            r13 = 10
            goto L14a
        L149:
            r13 = 0
        L14a:
            if (r10 >= r13) goto L14e
            r8 = r12
            r10 = r13
        L14e:
            boolean r12 = r6.hasNext()
            if (r12 != 0) goto L591
        L154:
            r20 = r8
            java.lang.reflect.Method r20 = (java.lang.reflect.Method) r20
            if (r20 != 0) goto L15e
            r4 = 0
            r8 = 1
            goto L396
        L15e:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r6 = r4.iterator()
        L167:
            boolean r8 = r6.hasNext()
            java.lang.Class r13 = java.lang.Boolean.TYPE
            if (r8 == 0) goto L18e
            java.lang.Object r8 = r6.next()
            r10 = r8
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            java.lang.Class[] r11 = r10.getParameterTypes()
            r11.getClass()
            int r11 = r11.length
            if (r11 != 0) goto L167
            java.lang.Class r10 = r10.getReturnType()
            boolean r10 = p000.ln0.m3626(r10, r13)
            if (r10 == 0) goto L167
            r12.add(r8)
            goto L167
        L18e:
            java.util.Iterator r14 = r12.iterator()
            boolean r6 = r14.hasNext()
            java.lang.String r15 = "hasMore"
            if (r6 != 0) goto L19c
            r6 = 0
            goto L1d9
        L19c:
            java.lang.Object r6 = r14.next()
            boolean r8 = r14.hasNext()
            if (r8 != 0) goto L1a7
            goto L1d9
        L1a7:
            r8 = r6
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            java.lang.String r8 = r8.getName()
            boolean r8 = p000.ln0.m3626(r8, r15)
            r19 = 100
            if (r8 == 0) goto L1b9
            r8 = r19
            goto L1ba
        L1b9:
            r8 = 0
        L1ba:
            java.lang.Object r10 = r14.next()
            r11 = r10
            java.lang.reflect.Method r11 = (java.lang.reflect.Method) r11
            java.lang.String r11 = r11.getName()
            boolean r11 = p000.ln0.m3626(r11, r15)
            if (r11 == 0) goto L1ce
            r11 = r19
            goto L1cf
        L1ce:
            r11 = 0
        L1cf:
            if (r8 >= r11) goto L1d3
            r6 = r10
            r8 = r11
        L1d3:
            boolean r10 = r14.hasNext()
            if (r10 != 0) goto L589
        L1d9:
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r6 == 0) goto L1ef
            java.lang.String r8 = r6.getName()
            boolean r8 = p000.ln0.m3626(r8, r15)
            if (r8 != 0) goto L1f2
            int r8 = r12.size()
            r10 = 1
            if (r8 != r10) goto L1ef
            goto L1f2
        L1ef:
            r23 = 0
            goto L1f4
        L1f2:
            r23 = r6
        L1f4:
            java.util.Iterator r6 = r12.iterator()
        L1f8:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L212
            java.lang.Object r8 = r6.next()
            r10 = r8
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            java.lang.String r10 = r10.getName()
            java.lang.String r11 = "isLoading"
            boolean r10 = p000.ln0.m3626(r10, r11)
            if (r10 == 0) goto L1f8
            goto L213
        L212:
            r8 = 0
        L213:
            r24 = r8
            java.lang.reflect.Method r24 = (java.lang.reflect.Method) r24
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r8 = r4.iterator()
        L220:
            boolean r10 = r8.hasNext()
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            java.lang.Class r12 = java.lang.Void.TYPE
            if (r10 == 0) goto L257
            java.lang.Object r10 = r8.next()
            r14 = r10
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            java.lang.Class[] r15 = r14.getParameterTypes()
            java.lang.Class[] r11 = new java.lang.Class[]{r11}
            boolean r11 = java.util.Arrays.equals(r15, r11)
            if (r11 == 0) goto L220
            java.lang.Class r11 = r14.getReturnType()
            boolean r11 = p000.ln0.m3626(r11, r13)
            if (r11 != 0) goto L253
            java.lang.Class r11 = r14.getReturnType()
            boolean r11 = p000.ln0.m3626(r11, r12)
            if (r11 == 0) goto L220
        L253:
            r6.add(r10)
            goto L220
        L257:
            java.util.Iterator r10 = r6.iterator()
            boolean r6 = r10.hasNext()
            if (r6 != 0) goto L263
            r6 = 0
            goto L2a1
        L263:
            java.lang.Object r6 = r10.next()
            boolean r8 = r10.hasNext()
            if (r8 != 0) goto L26e
            goto L2a1
        L26e:
            r8 = r6
            java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
            java.lang.String r8 = r8.getName()
            java.lang.String r14 = "LJI"
            boolean r8 = p000.ln0.m3626(r8, r14)
            if (r8 == 0) goto L280
            r8 = 10
            goto L281
        L280:
            r8 = 0
        L281:
            java.lang.Object r15 = r10.next()
            r19 = r15
            java.lang.reflect.Method r19 = (java.lang.reflect.Method) r19
            java.lang.String r9 = r19.getName()
            boolean r9 = p000.ln0.m3626(r9, r14)
            if (r9 == 0) goto L296
            r9 = 10
            goto L297
        L296:
            r9 = 0
        L297:
            if (r8 >= r9) goto L29b
            r8 = r9
            r6 = r15
        L29b:
            boolean r9 = r10.hasNext()
            if (r9 != 0) goto L581
        L2a1:
            r21 = r6
            java.lang.reflect.Method r21 = (java.lang.reflect.Method) r21
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r8 = r4.iterator()
        L2ae:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L2e1
            java.lang.Object r9 = r8.next()
            r10 = r9
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            java.lang.Class[] r14 = r10.getParameterTypes()
            java.lang.Class[] r15 = new java.lang.Class[]{r5, r11}
            boolean r14 = java.util.Arrays.equals(r14, r15)
            if (r14 == 0) goto L2ae
            java.lang.Class r14 = r10.getReturnType()
            boolean r14 = p000.ln0.m3626(r14, r13)
            if (r14 != 0) goto L2dd
            java.lang.Class r10 = r10.getReturnType()
            boolean r10 = p000.ln0.m3626(r10, r12)
            if (r10 == 0) goto L2ae
        L2dd:
            r6.add(r9)
            goto L2ae
        L2e1:
            java.util.Iterator r9 = r6.iterator()
            boolean r5 = r9.hasNext()
            if (r5 != 0) goto L2ed
            r5 = 0
            goto L32a
        L2ed:
            java.lang.Object r5 = r9.next()
            boolean r6 = r9.hasNext()
            if (r6 != 0) goto L2f8
            goto L32a
        L2f8:
            r6 = r5
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            java.lang.String r6 = r6.getName()
            java.lang.String r15 = "LLLLLILLIL"
            boolean r6 = p000.ln0.m3626(r6, r15)
            if (r6 == 0) goto L30a
            r6 = 10
            goto L30b
        L30a:
            r6 = 0
        L30b:
            java.lang.Object r8 = r9.next()
            r10 = r8
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10
            java.lang.String r10 = r10.getName()
            boolean r10 = p000.ln0.m3626(r10, r15)
            if (r10 == 0) goto L31f
            r10 = 10
            goto L320
        L31f:
            r10 = 0
        L320:
            if (r6 >= r10) goto L324
            r5 = r8
            r6 = r10
        L324:
            boolean r8 = r9.hasNext()
            if (r8 != 0) goto L30b
        L32a:
            r14 = r5
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            java.util.Iterator r4 = r4.iterator()
        L331:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L35f
            java.lang.Object r5 = r4.next()
            r6 = r5
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            java.lang.String r8 = r6.getName()
            java.lang.String r9 = "unregister"
            boolean r8 = p000.ln0.m3626(r8, r9)
            if (r8 == 0) goto L331
            java.lang.Class[] r8 = r6.getParameterTypes()
            r8.getClass()
            int r8 = r8.length
            if (r8 != 0) goto L331
            java.lang.Class r6 = r6.getReturnType()
            boolean r6 = p000.ln0.m3626(r6, r12)
            if (r6 == 0) goto L331
            goto L360
        L35f:
            r5 = 0
        L360:
            r15 = r5
            java.lang.reflect.Method r15 = (java.lang.reflect.Method) r15
            r10 = r20
            r13 = r21
            r11 = r23
            r12 = r24
            java.lang.reflect.Method[] r4 = new java.lang.reflect.Method[]{r10, r11, r12, r13, r14, r15}
            java.util.ArrayList r4 = p000.AbstractC0312g7.m2248(r4)
            java.util.Iterator r4 = r4.iterator()
        L377:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L388
            java.lang.Object r5 = r4.next()
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            r8 = 1
            r5.setAccessible(r8)
            goto L377
        L388:
            r8 = 1
            vi0 r19 = new vi0
            r21 = r13
            r22 = r14
            r25 = r15
            r19.<init>(r20, r21, r22, r23, r24, r25)
            r4 = r19
        L396:
            if (r4 != 0) goto L3a1
            ui0 r1 = new ui0
            java.lang.String r2 = "陌生人会话模型接口不兼容"
            r6 = 0
            r1.<init>(r0, r6, r2)
            return r1
        L3a1:
            java.lang.reflect.Method r0 = r4.f11300
            java.lang.reflect.Method r5 = r4.f11303
            java.lang.reflect.Method r6 = r4.f11302
            java.lang.reflect.Method r9 = r4.f11299
            java.lang.reflect.Method r10 = r4.f11304
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.IdentityHashMap r12 = new java.util.IdentityHashMap
            r12.<init>()
            java.util.Set r12 = java.util.Collections.newSetFromMap(r12)
            long r13 = java.lang.System.currentTimeMillis()
            r19 = 20000(0x4e20, double:9.8813E-320)
            long r13 = r13 + r19
            r12.getClass()     // Catch: java.lang.Throwable -> L527
            m6383(r7, r9, r11, r12)     // Catch: java.lang.Throwable -> L527
            if (r6 == 0) goto L510
            if (r5 != 0) goto L3cd
            goto L510
        L3cd:
            boolean r15 = r11.isEmpty()     // Catch: java.lang.Throwable -> L3e8
            if (r15 == 0) goto L3ed
            if (r0 != 0) goto L3ed
            java.lang.String r0 = "陌生人列表缺少首屏刷新接口"
            ui0 r1 = new ui0     // Catch: java.lang.Throwable -> L3e8
            java.util.ArrayList r3 = m6385(r11)     // Catch: java.lang.Throwable -> L3e8
            r6 = 0
            r1.<init>(r3, r6, r0)     // Catch: java.lang.Throwable -> L3e8
            if (r10 == 0) goto L3e7
            r2 = 0
            r10.invoke(r7, r2)     // Catch: java.lang.Throwable -> L3e7
        L3e7:
            return r1
        L3e8:
            r0 = move-exception
            r18 = 0
            goto L52a
        L3ed:
            boolean r15 = r11.isEmpty()     // Catch: java.lang.Throwable -> L3e8
            if (r15 == 0) goto L429
            boolean r5 = m6389(r5, r7)     // Catch: java.lang.Throwable -> L3e8
            if (r5 != 0) goto L429
            java.lang.String r5 = "dyhelper_delete_initial"
            if (r0 != 0) goto L3fe
            goto L429
        L3fe:
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L407
            java.lang.Object r0 = r0.invoke(r7, r5)     // Catch: java.lang.Throwable -> L407
            goto L40e
        L407:
            r0 = move-exception
            eo1 r5 = new eo1     // Catch: java.lang.Throwable -> L3e8
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L3e8
            r0 = r5
        L40e:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)     // Catch: java.lang.Throwable -> L3e8
            if (r0 == 0) goto L429
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L3e8
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e8
            java.lang.String r15 = "触发陌生人首屏加载失败: "
            r5.<init>(r15)     // Catch: java.lang.Throwable -> L3e8
            r5.append(r0)     // Catch: java.lang.Throwable -> L3e8
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L3e8
            p000.C0888ux.m5975(r2, r0)     // Catch: java.lang.Throwable -> L3e8
        L429:
            boolean r0 = m6382(r7, r4, r13, r1)     // Catch: java.lang.Throwable -> L3e8
            java.lang.String r5 = "陌生人列表加载超时"
            java.lang.String r15 = "陌生人列表加载已停止"
            if (r0 != 0) goto L451
            java.lang.Object r0 = r1.invoke()     // Catch: java.lang.Throwable -> L3e8
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L3e8
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L3e8
            if (r0 == 0) goto L440
            r5 = r15
        L440:
            ui0 r0 = new ui0     // Catch: java.lang.Throwable -> L3e8
            java.util.ArrayList r1 = m6385(r11)     // Catch: java.lang.Throwable -> L3e8
            r6 = 0
            r0.<init>(r1, r6, r5)     // Catch: java.lang.Throwable -> L3e8
            if (r10 == 0) goto L450
            r2 = 0
            r10.invoke(r7, r2)     // Catch: java.lang.Throwable -> L450
        L450:
            return r0
        L451:
            m6383(r7, r9, r11, r12)     // Catch: java.lang.Throwable -> L3e8
            r8 = 0
        L455:
            boolean r0 = m6389(r6, r7)     // Catch: java.lang.Throwable -> L3e8
            r27 = r5
            r5 = 80
            if (r0 == 0) goto L4cb
            if (r8 >= r5) goto L4cb
            java.lang.Object r0 = r1.invoke()     // Catch: java.lang.Throwable -> L3e8
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L3e8
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L3e8
            if (r0 != 0) goto L4cb
            java.lang.reflect.Method r0 = r4.f11301     // Catch: java.lang.Throwable -> L3e8
            if (r0 != 0) goto L476
            java.lang.String r0 = "陌生人列表缺少加载下一页接口"
            r20 = r15
            goto L4cf
        L476:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e8
            r5.<init>()     // Catch: java.lang.Throwable -> L3e8
            r20 = r15
            java.lang.String r15 = "dyhelper_delete_more_"
            r5.append(r15)     // Catch: java.lang.Throwable -> L3e8
            r5.append(r8)     // Catch: java.lang.Throwable -> L3e8
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L3e8
            java.lang.Object[] r5 = new java.lang.Object[]{r3, r5}     // Catch: java.lang.Throwable -> L492
            java.lang.Object r0 = r0.invoke(r7, r5)     // Catch: java.lang.Throwable -> L492
            goto L499
        L492:
            r0 = move-exception
            eo1 r5 = new eo1     // Catch: java.lang.Throwable -> L3e8
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L3e8
            r0 = r5
        L499:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)     // Catch: java.lang.Throwable -> L3e8
            if (r0 == 0) goto L4a8
            java.lang.Throwable r1 = r0.getCause()     // Catch: java.lang.Throwable -> L3e8
            if (r1 != 0) goto L4a6
            goto L4a7
        L4a6:
            r0 = r1
        L4a7:
            throw r0     // Catch: java.lang.Throwable -> L3e8
        L4a8:
            boolean r0 = m6382(r7, r4, r13, r1)     // Catch: java.lang.Throwable -> L3e8
            if (r0 != 0) goto L4c1
            java.lang.Object r0 = r1.invoke()     // Catch: java.lang.Throwable -> L3e8
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L3e8
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L3e8
            if (r0 == 0) goto L4bd
            r5 = r20
            goto L4bf
        L4bd:
            r5 = r27
        L4bf:
            r0 = r5
            goto L4cf
        L4c1:
            m6383(r7, r9, r11, r12)     // Catch: java.lang.Throwable -> L3e8
            int r8 = r8 + 1
            r5 = r27
            r15 = r20
            goto L455
        L4cb:
            r20 = r15
            java.lang.String r0 = ""
        L4cf:
            java.lang.Object r3 = r1.invoke()     // Catch: java.lang.Throwable -> L3e8
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L3e8
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L3e8
            if (r3 != 0) goto L4e3
            boolean r3 = m6389(r6, r7)     // Catch: java.lang.Throwable -> L3e8
            if (r3 != 0) goto L4e3
            r6 = 1
            goto L4e4
        L4e3:
            r6 = 0
        L4e4:
            if (r6 != 0) goto L509
            boolean r3 = p000.q02.m4671(r0)     // Catch: java.lang.Throwable -> L502
            if (r3 == 0) goto L509
            java.lang.Object r0 = r1.invoke()     // Catch: java.lang.Throwable -> L502
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L502
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L502
            if (r0 == 0) goto L4fb
            r15 = r20
            goto L508
        L4fb:
            r1 = 80
            if (r8 < r1) goto L506
            java.lang.String r15 = "陌生人会话页数超过安全上限"
            goto L508
        L502:
            r0 = move-exception
            r18 = r6
            goto L52a
        L506:
            java.lang.String r15 = "陌生人列表未完整加载"
        L508:
            r0 = r15
        L509:
            if (r10 == 0) goto L56f
            r2 = 0
            r10.invoke(r7, r2)     // Catch: java.lang.Throwable -> L56f
            goto L56f
        L510:
            java.lang.String r0 = "陌生人分页状态接口不兼容"
            ui0 r1 = new ui0     // Catch: java.lang.Throwable -> L527
            java.util.ArrayList r3 = m6385(r11)     // Catch: java.lang.Throwable -> L527
            r8 = 0
            r1.<init>(r3, r8, r0)     // Catch: java.lang.Throwable -> L523
            if (r10 == 0) goto L522
            r2 = 0
            r10.invoke(r7, r2)     // Catch: java.lang.Throwable -> L522
        L522:
            return r1
        L523:
            r0 = move-exception
        L524:
            r18 = r8
            goto L52a
        L527:
            r0 = move-exception
            r8 = 0
            goto L524
        L52a:
            java.lang.String r1 = r0.getMessage()     // Catch: java.lang.Throwable -> L579
            if (r1 != 0) goto L538
            java.lang.Class r1 = r0.getClass()     // Catch: java.lang.Throwable -> L579
            java.lang.String r1 = r1.getSimpleName()     // Catch: java.lang.Throwable -> L579
        L538:
            r3 = 32
            r13 = 10
            java.lang.String r1 = r1.replace(r13, r3)     // Catch: java.lang.Throwable -> L579
            r1.getClass()     // Catch: java.lang.Throwable -> L579
            r4 = 13
            java.lang.String r1 = r1.replace(r4, r3)     // Catch: java.lang.Throwable -> L579
            r1.getClass()     // Catch: java.lang.Throwable -> L579
            r3 = 160(0xa0, float:2.24E-43)
            java.lang.String r1 = p000.q02.m4693(r1, r3)     // Catch: java.lang.Throwable -> L579
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L579
            r3.<init>()     // Catch: java.lang.Throwable -> L579
            java.lang.String r4 = "陌生人列表加载失败："
            r3.append(r4)     // Catch: java.lang.Throwable -> L579
            r3.append(r1)     // Catch: java.lang.Throwable -> L579
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L579
            p000.C0888ux.m5977(r2, r1, r0)     // Catch: java.lang.Throwable -> L579
            if (r10 == 0) goto L56c
            r2 = 0
            r10.invoke(r7, r2)     // Catch: java.lang.Throwable -> L56c
        L56c:
            r0 = r1
            r6 = r18
        L56f:
            ui0 r1 = new ui0
            java.util.ArrayList r2 = m6385(r11)
            r1.<init>(r2, r6, r0)
            return r1
        L579:
            r0 = move-exception
            if (r10 == 0) goto L580
            r11 = 0
            r10.invoke(r7, r11)     // Catch: java.lang.Throwable -> L580
        L580:
            throw r0
        L581:
            r17 = 1
            r18 = 0
            r22 = 0
            goto L281
        L589:
            r17 = 1
            r18 = 0
            r22 = 0
            goto L1ba
        L591:
            r17 = 1
            r18 = 0
            r22 = 0
            goto L135
    }

    /* JADX INFO: renamed from: λ */
    public final java.util.List m6394(java.util.List r12, java.lang.Class r13) {
            r11 = this;
            f7 r12 = p000.AbstractC0984xh.m6661(r12)
            t00 r0 = new t00
            r1 = 1
            r0.<init>(r13, r1)
            y30 r1 = new y30
            r2 = 1
            r1.<init>(r12, r2, r0)
            ng r3 = new ng
            r9 = 0
            r10 = 18
            r4 = 1
            java.lang.Class<wi0> r6 = p000.wi0.class
            java.lang.String r7 = "methodKey"
            java.lang.String r8 = "methodKey(Ljava/lang/reflect/Method;)Ljava/lang/String;"
            r5 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            cu r11 = new cu
            r12 = 0
            r11.<init>(r1, r12, r3)
            rt r12 = new rt
            r0 = 1
            r12.<init>(r13, r0)
            cu r13 = new cu
            r0 = 3
            r13.<init>(r11, r0, r12)
            sh0 r11 = new sh0
            r12 = 24
            r11.<init>(r12)
            t52 r11 = p000.us1.m5945(r13, r11)
            java.util.List r11 = p000.us1.m5948(r11)
            return r11
    }

    /* JADX INFO: renamed from: ν */
    public final java.util.List m6395(java.lang.ClassLoader r10, boolean r11) {
            r9 = this;
            java.util.concurrent.atomic.AtomicReference r0 = p000.wi0.f11729
            r0.set(r10)
            java.util.concurrent.atomic.AtomicReference r0 = p000.wi0.f11730
            java.lang.Object r0 = r0.getAndSet(r10)
            java.lang.ClassLoader r0 = (java.lang.ClassLoader) r0
            jz r1 = p000.C0450jz.f5672
            java.util.concurrent.atomic.AtomicReference r2 = p000.wi0.f11731
            if (r0 == 0) goto L18
            if (r0 == r10) goto L18
            r2.set(r1)
        L18:
            java.lang.Class r6 = m6390(r10)
            if (r6 != 0) goto L1f
            return r1
        L1f:
            java.lang.Object r0 = r2.get()
            r0.getClass()
            java.util.List r0 = (java.util.List) r0
            java.util.List r0 = r9.m6394(r0, r6)
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L33
            return r0
        L33:
            java.lang.Object r0 = p000.C0666ox.f8297
            kx r0 = p000.EnumC0491kx.f6191
            java.util.List r3 = p000.C0666ox.m4323(r0, r10)
            if (r3 != 0) goto L3e
            r3 = r1
        L3e:
            java.util.List r3 = r9.m6394(r3, r6)
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L4c
            r2.set(r3)
            return r3
        L4c:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = 0
        L52:
            r5 = 2
            if (r4 >= r5) goto L6b
            java.lang.String[] r5 = p000.wi0.f11727
            r5 = r5[r4]
            java.lang.Class r5 = p000.AbstractC0093bx.m1082(r10, r5)
            if (r5 != 0) goto L61
            r5 = r1
            goto L65
        L61:
            java.util.ArrayList r5 = m6381(r5)
        L65:
            p000.AbstractC0984xh.m6660(r3, r5)
            int r4 = r4 + 1
            goto L52
        L6b:
            java.util.List r7 = r9.m6394(r3, r6)
            if (r11 == 0) goto Lb0
            java.lang.Object r11 = p000.C0666ox.f8297
            java.util.concurrent.atomic.AtomicBoolean r11 = p000.C0666ox.f8305
            boolean r11 = r11.get()
            if (r11 != 0) goto L7c
            goto Lb0
        L7c:
            java.lang.String r11 = "定位 IM 陌生人会话模型工厂"
            ti0 r3 = new ti0     // Catch: java.lang.Throwable -> L8e
            r8 = 0
            r4 = r9
            r5 = r10
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L8b
            java.util.List r9 = p000.C0666ox.m4316(r0, r5, r11, r3)     // Catch: java.lang.Throwable -> L8b
            goto L97
        L8b:
            r0 = move-exception
        L8c:
            r9 = r0
            goto L91
        L8e:
            r0 = move-exception
            r4 = r9
            goto L8c
        L91:
            eo1 r10 = new eo1
            r10.<init>(r9)
            r9 = r10
        L97:
            java.lang.Throwable r10 = p000.fo1.m2190(r9)
            if (r10 != 0) goto L9f
            r7 = r9
            goto La6
        L9f:
            java.lang.String r9 = "r542b803b7817851a"
            java.lang.String r11 = "DexKit 定位陌生人模型工厂失败"
            p000.C0888ux.m5977(r9, r11, r10)
        La6:
            java.util.List r7 = (java.util.List) r7
            java.util.List r9 = r4.m6394(r7, r6)
            r2.set(r9)
            return r9
        Lb0:
            boolean r9 = r7.isEmpty()
            if (r9 == 0) goto Lb7
            goto Lbf
        Lb7:
            r2.set(r7)
            java.lang.Object r9 = p000.C0666ox.f8297     // Catch: java.lang.Throwable -> Lbf
            p000.C0666ox.m4327(r0, r7)     // Catch: java.lang.Throwable -> Lbf
        Lbf:
            return r7
    }
}
