package p000;

/* JADX INFO: renamed from: kf */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0467kf {

    /* JADX INFO: renamed from: α */
    public static final p000.C0467kf f5879 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.atomic.AtomicBoolean f5880 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.Map f5881 = null;

    /* JADX INFO: renamed from: δ */
    public static volatile java.lang.ref.WeakReference f5882;

    /* JADX INFO: renamed from: ε */
    public static volatile java.lang.ref.WeakReference f5883;

    /* JADX INFO: renamed from: ζ */
    public static volatile long f5884;

    /* JADX INFO: renamed from: η */
    public static volatile long f5885;

    static {
            kf r0 = new kf
            r0.<init>()
            p000.C0467kf.f5879 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.C0467kf.f5880 = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r0.getClass()
            p000.C0467kf.f5881 = r0
            return
    }

    /* JADX INFO: renamed from: Γ */
    public static boolean m3210(android.view.View r6, float r7) {
            java.lang.String r0 = "getState"
            java.lang.Object r0 = m3215(r6, r0)
            r1 = 0
            if (r0 != 0) goto L12
            java.lang.String r0 = "get_state"
            java.lang.Object r0 = m3215(r6, r0)
            if (r0 != 0) goto L12
            goto L2c
        L12:
            we r2 = new we
            r3 = 8
            r2.<init>(r3)
            r3 = 6
            java.lang.Object r0 = m3218(r0, r3, r2)
            if (r0 != 0) goto L21
            goto L2c
        L21:
            boolean r2 = r6 instanceof android.widget.ProgressBar
            r3 = 0
            if (r2 == 0) goto L29
            android.widget.ProgressBar r6 = (android.widget.ProgressBar) r6
            goto L2a
        L29:
            r6 = r3
        L2a:
            if (r6 != 0) goto L2d
        L2c:
            return r1
        L2d:
            int r2 = r6.getMax()
            float r2 = (float) r2
            r4 = 0
            r5 = 1120403456(0x42c80000, float:100.0)
            float r7 = p000.j81.m2905(r7, r4, r5)
            float r7 = r7 / r5
            float r7 = r7 * r2
            int r7 = java.lang.Math.round(r7)
            int r2 = r6.getMax()
            int r7 = p000.j81.m2906(r7, r1, r2)
            r6.setProgress(r7)     // Catch: java.lang.Throwable -> L5e
            java.lang.Class r6 = r0.getClass()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r7 = "LJJLIIIJILLIZJL"
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r7, r3)     // Catch: java.lang.Throwable -> L5e
            r7 = 1
            r6.setAccessible(r7)     // Catch: java.lang.Throwable -> L5e
            r6.invoke(r0, r3)     // Catch: java.lang.Throwable -> L5e
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L5e
            goto L65
        L5e:
            r6 = move-exception
            eo1 r7 = new eo1
            r7.<init>(r6)
            r6 = r7
        L65:
            java.lang.Throwable r7 = p000.fo1.m2190(r6)
            if (r7 != 0) goto L6c
            goto L83
        L6c:
            java.lang.String r6 = r7.getMessage()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "component seek failed: "
            r7.<init>(r0)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            m3212(r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
        L83:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
    }

    /* JADX INFO: renamed from: Ε */
    public static boolean m3211(android.view.View r3, float r4) {
            java.lang.String r0 = "getState"
            java.lang.Object r0 = m3215(r3, r0)
            if (r0 != 0) goto L11
            java.lang.String r0 = "get_state"
            java.lang.Object r0 = m3215(r3, r0)
            if (r0 != 0) goto L11
            goto L2d
        L11:
            java.lang.String r3 = "context"
            java.lang.Object r3 = m3231(r0, r3)
            if (r3 != 0) goto L1a
            goto L2d
        L1a:
            java.lang.String r0 = "LJIIL"
            java.lang.Object r3 = m3231(r3, r0)
            if (r3 != 0) goto L23
            goto L2d
        L23:
            java.lang.Class r0 = r3.getClass()
            java.lang.reflect.Method r0 = m3221(r0)
            if (r0 != 0) goto L2f
        L2d:
            r3 = 0
            return r3
        L2f:
            r1 = 1
            r0.setAccessible(r1)
            r1 = 0
            r2 = 1120403456(0x42c80000, float:100.0)
            float r4 = p000.j81.m2905(r4, r1, r2)     // Catch: java.lang.Throwable -> L48
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch: java.lang.Throwable -> L48
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L48
            r0.invoke(r3, r4)     // Catch: java.lang.Throwable -> L48
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L48
            goto L4f
        L48:
            r3 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        L4f:
            java.lang.Throwable r4 = p000.fo1.m2190(r3)
            if (r4 != 0) goto L56
            goto L6d
        L56:
            java.lang.String r3 = r4.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "state player seek failed: "
            r4.<init>(r0)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            m3212(r3)
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
        L6d:
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            return r3
    }

    /* JADX INFO: renamed from: Ζ */
    public static void m3212(java.lang.String r6) {
            long r0 = android.os.SystemClock.uptimeMillis()
            long r2 = p000.C0467kf.f5885
            long r2 = r0 - r2
            r4 = 2500(0x9c4, double:1.235E-320)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto Lf
            return
        Lf:
            p000.C0467kf.f5885 = r0
            m3226(r6)
            return
    }

    /* JADX INFO: renamed from: α */
    public static final void m3213(android.view.View r3) {
            java.util.Map r0 = p000.C0467kf.f5881
            java.lang.Object r1 = r0.get(r3)
            if (r1 != 0) goto L10
            hf r1 = new hf
            r1.<init>()
            r0.put(r3, r1)
        L10:
            hf r1 = (p000.C0357hf) r1
            java.lang.ref.WeakReference r0 = r1.f4710
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r0.get()
            goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r0 == 0) goto L1f
            goto L52
        L1f:
            java.lang.ref.WeakReference r0 = p000.C0467kf.f5882
            if (r0 == 0) goto L52
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L2a
            goto L52
        L2a:
            m3214(r3, r0)
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            int r3 = r3.hashCode()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "bind latest aweme to "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = "@"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            m3226(r3)
        L52:
            return
    }

    /* JADX INFO: renamed from: β */
    public static void m3214(android.view.View r7, java.lang.Object r8) {
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r8)
            java.util.Map r1 = p000.C0467kf.f5881
            java.lang.Object r2 = r1.get(r7)
            if (r2 != 0) goto L15
            hf r2 = new hf
            r2.<init>()
            r1.put(r7, r2)
        L15:
            hf r2 = (p000.C0357hf) r2
            java.lang.ref.WeakReference r1 = r2.f4710
            r3 = 0
            if (r1 == 0) goto L21
            java.lang.Object r1 = r1.get()
            goto L22
        L21:
            r1 = r3
        L22:
            r4 = 0
            if (r1 == r8) goto L27
            r8 = 1
            goto L28
        L27:
            r8 = r4
        L28:
            r2.f4710 = r0
            r5 = 0
            if (r8 == 0) goto L44
            r8 = -1
            r2.f4711 = r8
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.f4712 = r8
            r2.f4713 = r5
            r2.f4714 = r4
            r2.f4715 = r5
            jz r8 = p000.C0450jz.f5672
            r2.f4716 = r8
            r4 = -1
            r2.f4717 = r4
            goto L50
        L44:
            java.util.List r8 = r2.f4716
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L50
            r2.f4714 = r4
            r2.f4715 = r5
        L50:
            p000.C0467kf.f5882 = r0
            java.lang.ref.WeakReference r8 = p000.C0467kf.f5883
            if (r8 == 0) goto L5d
            java.lang.Object r8 = r8.get()
            r3 = r8
            android.view.View r3 = (android.view.View) r3
        L5d:
            java.lang.Class r8 = r7.getClass()
            java.lang.String r8 = r8.getName()
            java.lang.String r0 = "~796896D9EC90C3E7F565E47CF96AEE6ECAB297EC32DB18E8427C26B3E9849D412BBF14C71EC8BF424B5C97D362D29CDB6552B9ACA740A59B0F7143BFEE2691"
            java.lang.String r1 = p000.jf0.m2957(r0)
            boolean r8 = r8.equals(r1)
            if (r8 != 0) goto L87
            if (r3 == 0) goto L87
            java.lang.Class r8 = r3.getClass()
            java.lang.String r8 = r8.getName()
            java.lang.String r0 = p000.jf0.m2957(r0)
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L86
            goto L87
        L86:
            return
        L87:
            java.lang.ref.WeakReference r8 = new java.lang.ref.WeakReference
            r8.<init>(r7)
            p000.C0467kf.f5883 = r8
            return
    }

    /* JADX INFO: renamed from: γ */
    public static java.lang.Object m3215(java.lang.Object r1, java.lang.String r2) {
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L8
            java.lang.Object r1 = p000.qe0.m4869(r1, r2, r0)     // Catch: java.lang.Throwable -> L8
            goto Lf
        L8:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        Lf:
            boolean r2 = r1 instanceof p000.eo1
            if (r2 == 0) goto L14
            r1 = 0
        L14:
            return r1
    }

    /* JADX INFO: renamed from: ε */
    public static java.lang.Class m3216(java.lang.ClassLoader r0, java.lang.String r1) {
            java.lang.Class r0 = p000.qe0.m4876(r0, r1)     // Catch: java.lang.Throwable -> L5
            goto Lc
        L5:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        Lc:
            boolean r1 = r0 instanceof p000.eo1
            if (r1 == 0) goto L11
            r0 = 0
        L11:
            java.lang.Class r0 = (java.lang.Class) r0
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public static java.lang.reflect.Method m3217(java.lang.Class r4, java.lang.String r5) {
            jf r0 = new jf
            r1 = 0
            r2 = 0
            r0.<init>(r4, r2, r1)
            ts1 r4 = p000.e81.m1879(r0)
        Lb:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto La8
            java.lang.Object r0 = r4.next()
            r1 = r0
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            int r3 = r1.getModifiers()
            boolean r3 = java.lang.reflect.Modifier.isStatic(r3)
            if (r3 != 0) goto Lb
            java.lang.String r3 = r1.getName()
            boolean r3 = p000.ln0.m3626(r3, r5)
            if (r3 == 0) goto Lb
            java.lang.Class[] r3 = r1.getParameterTypes()
            r3.getClass()
            int r3 = r3.length
            if (r3 != 0) goto Lb
            java.lang.Class r1 = r1.getReturnType()
            r1.getClass()
            java.lang.Class r3 = java.lang.Boolean.TYPE
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L48
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            goto L9f
        L48:
            java.lang.Class r3 = java.lang.Byte.TYPE
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L53
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
            goto L9f
        L53:
            java.lang.Class r3 = java.lang.Character.TYPE
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L5e
            java.lang.Class<java.lang.Character> r1 = java.lang.Character.class
            goto L9f
        L5e:
            java.lang.Class r3 = java.lang.Short.TYPE
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L69
            java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            goto L9f
        L69:
            java.lang.Class r3 = java.lang.Integer.TYPE
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L74
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            goto L9f
        L74:
            java.lang.Class r3 = java.lang.Long.TYPE
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L7f
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            goto L9f
        L7f:
            java.lang.Class r3 = java.lang.Float.TYPE
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L8a
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            goto L9f
        L8a:
            java.lang.Class r3 = java.lang.Double.TYPE
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L95
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            goto L9f
        L95:
            java.lang.Class r3 = java.lang.Void.TYPE
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L9f
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
        L9f:
            java.lang.Class<java.lang.Number> r3 = java.lang.Number.class
            boolean r1 = r3.isAssignableFrom(r1)
            if (r1 == 0) goto Lb
            r2 = r0
        La8:
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
            return r2
    }

    /* JADX INFO: renamed from: η */
    public static java.lang.Object m3218(java.lang.Object r2, int r3, p000.a80 r4) {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            java.util.Set r0 = java.util.Collections.newSetFromMap(r0)
            r1 = 0
            java.lang.Object r2 = m3219(r3, r0, r4, r2, r1)
            return r2
    }

    /* JADX INFO: renamed from: θ */
    public static final java.lang.Object m3219(int r6, java.util.Set r7, p000.a80 r8, java.lang.Object r9, int r10) {
            if (r10 <= r6) goto L4
            goto L6e
        L4:
            int r0 = java.lang.System.identityHashCode(r9)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r7.add(r0)
            if (r0 != 0) goto L13
            goto L6e
        L13:
            java.lang.Object r0 = r8.invoke(r9)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L20
            return r9
        L20:
            boolean r0 = r9 instanceof java.lang.String
            if (r0 != 0) goto L6e
            boolean r0 = r9 instanceof java.lang.Number
            if (r0 != 0) goto L6e
            boolean r0 = r9 instanceof java.lang.Boolean
            if (r0 != 0) goto L6e
            boolean r0 = r9 instanceof java.lang.Class
            if (r0 == 0) goto L31
            goto L6e
        L31:
            java.lang.Class r0 = r9.getClass()
        L35:
            if (r0 == 0) goto L6e
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L6e
            java.lang.reflect.Field[] r1 = r0.getDeclaredFields()
            r1.getClass()
            int r2 = r1.length
            r3 = 0
        L48:
            if (r3 >= r2) goto L69
            r4 = r1[r3]
            java.lang.Class r5 = r4.getType()
            boolean r5 = r5.isPrimitive()
            if (r5 != 0) goto L66
            java.lang.Object r4 = m3230(r9, r4)
            if (r4 != 0) goto L5d
            goto L66
        L5d:
            int r5 = r10 + 1
            java.lang.Object r4 = m3219(r6, r7, r8, r4, r5)
            if (r4 == 0) goto L66
            return r4
        L66:
            int r3 = r3 + 1
            goto L48
        L69:
            java.lang.Class r0 = r0.getSuperclass()
            goto L35
        L6e:
            r6 = 0
            return r6
    }

    /* JADX INFO: renamed from: ι */
    public static final java.lang.Object m3220(java.util.Set r7, java.lang.String r8, java.lang.Object r9, int r10) {
            r0 = 0
            if (r9 == 0) goto L6c
            r1 = 3
            if (r10 <= r1) goto L7
            goto L6c
        L7:
            int r1 = java.lang.System.identityHashCode(r9)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = r7.add(r1)
            if (r1 != 0) goto L16
            goto L6c
        L16:
            java.lang.Class r1 = r9.getClass()
            java.lang.String r1 = r1.getName()
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L25
            return r9
        L25:
            boolean r1 = r9 instanceof java.lang.String
            if (r1 != 0) goto L6c
            boolean r1 = r9 instanceof java.lang.Number
            if (r1 != 0) goto L6c
            boolean r1 = r9 instanceof java.lang.Boolean
            if (r1 != 0) goto L6c
            boolean r1 = r9 instanceof java.lang.Class
            if (r1 == 0) goto L36
            return r0
        L36:
            java.lang.Class r1 = r9.getClass()
        L3a:
            if (r1 == 0) goto L6c
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L6c
            java.lang.reflect.Field[] r2 = r1.getDeclaredFields()
            r2.getClass()
            int r3 = r2.length
            r4 = 0
        L4d:
            if (r4 >= r3) goto L67
            r5 = r2[r4]
            r5.getClass()
            java.lang.Object r5 = m3230(r9, r5)
            if (r5 != 0) goto L5b
            goto L64
        L5b:
            int r6 = r10 + 1
            java.lang.Object r5 = m3220(r7, r8, r5, r6)
            if (r5 == 0) goto L64
            return r5
        L64:
            int r4 = r4 + 1
            goto L4d
        L67:
            java.lang.Class r1 = r1.getSuperclass()
            goto L3a
        L6c:
            return r0
    }

    /* JADX INFO: renamed from: κ */
    public static java.lang.reflect.Method m3221(java.lang.Class r9) {
            java.lang.String r0 = "getDuration"
            java.lang.reflect.Method r0 = m3217(r9, r0)
            r1 = 0
            if (r0 == 0) goto L97
            java.lang.String r0 = "currentPosition"
            java.lang.reflect.Method r0 = m3217(r9, r0)
            if (r0 != 0) goto L13
            goto L97
        L13:
            jf r0 = new jf
            r2 = 0
            r0.<init>(r9, r1, r2)
            f7 r9 = new f7
            r9.<init>(r0)
            we r0 = new we
            r2 = 9
            r0.<init>(r2)
            y30 r2 = new y30
            r3 = 1
            r2.<init>(r9, r3, r0)
            x30 r9 = new x30
            r9.<init>(r2)
            boolean r0 = r9.hasNext()
            if (r0 != 0) goto L37
            goto L95
        L37:
            java.lang.Object r1 = r9.next()
            boolean r0 = r9.hasNext()
            if (r0 != 0) goto L42
            goto L95
        L42:
            r0 = r1
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            java.lang.String r2 = r0.getName()
            java.lang.String r3 = "seek"
            boolean r2 = p000.ln0.m3626(r2, r3)
            r4 = 500(0x1f4, float:7.0E-43)
            r5 = 0
            if (r2 == 0) goto L56
            r2 = r4
            goto L57
        L56:
            r2 = r5
        L57:
            java.lang.String r0 = r0.getName()
            r0.getClass()
            java.lang.String r6 = "$"
            boolean r0 = p000.q02.m4654(r0, r6, r5)
            if (r0 != 0) goto L68
            int r2 = r2 + 50
        L68:
            java.lang.Object r0 = r9.next()
            r7 = r0
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            java.lang.String r8 = r7.getName()
            boolean r8 = p000.ln0.m3626(r8, r3)
            if (r8 == 0) goto L7b
            r8 = r4
            goto L7c
        L7b:
            r8 = r5
        L7c:
            java.lang.String r7 = r7.getName()
            r7.getClass()
            boolean r7 = p000.q02.m4654(r7, r6, r5)
            if (r7 != 0) goto L8b
            int r8 = r8 + 50
        L8b:
            if (r2 >= r8) goto L8f
            r1 = r0
            r2 = r8
        L8f:
            boolean r0 = r9.hasNext()
            if (r0 != 0) goto L68
        L95:
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
        L97:
            return r1
    }

    /* JADX INFO: renamed from: λ */
    public static android.view.View m3222(java.lang.Object r4) {
            java.lang.String r0 = "mSeekbarView"
            java.lang.Object r0 = m3231(r4, r0)
            boolean r1 = r0 instanceof android.view.View
            r2 = 0
            if (r1 == 0) goto Le
            android.view.View r0 = (android.view.View) r0
            goto Lf
        Le:
            r0 = r2
        Lf:
            if (r0 != 0) goto L4a
            java.lang.String r0 = "~796896D9EC90C3E7F565E47CF96AEE6ECAB297EC32DB18E8427C26B3E9849D412BBF14C71EC8BF424B5C97D362D29CDB6552B9ACA740A59B0F7143BFEE2691"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            java.util.Set r1 = java.util.Collections.newSetFromMap(r1)
            r3 = 0
            java.lang.Object r0 = m3220(r1, r0, r4, r3)
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L2c
            android.view.View r0 = (android.view.View) r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            if (r0 != 0) goto L4a
            java.lang.String r0 = "~7974716F46EDCCC8AB71015994E08EBF7057E4892C51F22F56F7353FACB1B2D4E37F4031BB4E143F99F5369ADBB467DF3A6526DA150A61A2"
            java.lang.String r0 = p000.jf0.m2957(r0)
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            java.util.Set r1 = java.util.Collections.newSetFromMap(r1)
            java.lang.Object r4 = m3220(r1, r0, r4, r3)
            boolean r0 = r4 instanceof android.view.View
            if (r0 == 0) goto L49
            android.view.View r4 = (android.view.View) r4
            return r4
        L49:
            return r2
        L4a:
            return r0
    }

    /* JADX INFO: renamed from: μ */
    public static boolean m3223(java.lang.Class r5, java.lang.String r6) {
        L0:
            r0 = 0
            if (r5 == 0) goto L35
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L35
            java.lang.reflect.Method[] r1 = r5.getDeclaredMethods()
            r1.getClass()
            int r2 = r1.length
        L13:
            if (r0 >= r2) goto L30
            r3 = r1[r0]
            java.lang.String r4 = r3.getName()
            boolean r4 = p000.ln0.m3626(r4, r6)
            if (r4 == 0) goto L2d
            java.lang.Class[] r3 = r3.getParameterTypes()
            r3.getClass()
            int r3 = r3.length
            if (r3 != 0) goto L2d
            r5 = 1
            return r5
        L2d:
            int r0 = r0 + 1
            goto L13
        L30:
            java.lang.Class r5 = r5.getSuperclass()
            goto L0
        L35:
            return r0
    }

    /* JADX INFO: renamed from: ν */
    public static void m3224(java.lang.Class r4, java.lang.String r5, p000.m01 r6) {
            java.lang.String r0 = "#"
            java.lang.String r1 = "hook "
            xq0 r2 = p000.xq0.f12253     // Catch: java.lang.Throwable -> L32
            java.util.Set r6 = r2.m6774(r4, r5, r6)     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = r4.getName()     // Catch: java.lang.Throwable -> L32
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L32
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L32
            r3.append(r2)     // Catch: java.lang.Throwable -> L32
            r3.append(r0)     // Catch: java.lang.Throwable -> L32
            r3.append(r5)     // Catch: java.lang.Throwable -> L32
            java.lang.String r2 = " count="
            r3.append(r2)     // Catch: java.lang.Throwable -> L32
            r3.append(r6)     // Catch: java.lang.Throwable -> L32
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L32
            m3226(r6)     // Catch: java.lang.Throwable -> L32
            s62 r6 = p000.s62.f9751     // Catch: java.lang.Throwable -> L32
            goto L39
        L32:
            r6 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r6)
            r6 = r2
        L39:
            java.lang.Throwable r6 = p000.fo1.m2190(r6)
            if (r6 == 0) goto L57
            java.lang.String r4 = r4.getName()
            java.lang.String r6 = r6.getMessage()
            java.lang.String r2 = " failed: "
            java.lang.StringBuilder r4 = p000.lz1.m3695(r1, r4, r0, r5, r2)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            m3226(r4)
        L57:
            return
    }

    /* JADX INFO: renamed from: ξ */
    public static boolean m3225(java.lang.Object r2) {
            java.lang.Class r0 = r2.getClass()
            java.lang.String r1 = "getMoreChapterList"
            boolean r0 = m3223(r0, r1)
            if (r0 != 0) goto L23
            java.lang.String r0 = "chapterData"
            java.lang.Object r0 = m3231(r2, r0)
            if (r0 != 0) goto L23
            java.lang.Class r2 = r2.getClass()
            java.lang.String r0 = "getAid"
            boolean r2 = m3223(r2, r0)
            if (r2 == 0) goto L21
            goto L23
        L21:
            r2 = 0
            return r2
        L23:
            r2 = 1
            return r2
    }

    /* JADX INFO: renamed from: ο */
    public static void m3226(java.lang.String r3) {
            r0 = 0
            r1 = 4
            java.lang.String r2 = "DYHelper: ChapterSeekBarSegmentSkip"
            p000.C0888ux.m5988(r2, r3, r0, r1, r0)
            return
    }

    /* JADX INFO: renamed from: π */
    public static java.lang.Long m3227(java.lang.Long r5) {
            r0 = 0
            if (r5 == 0) goto L27
            long r1 = r5.longValue()
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto Le
            goto Lf
        Le:
            r5 = r0
        Lf:
            if (r5 == 0) goto L27
            long r0 = r5.longValue()
            r2 = 1
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 > 0) goto L26
            r2 = 1000(0x3e8, double:4.94E-321)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L26
            long r0 = r0 * r2
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
        L26:
            return r5
        L27:
            return r0
    }

    /* JADX INFO: renamed from: ρ */
    public static java.lang.Float m3228(java.lang.Float r4) {
            r0 = 0
            if (r4 == 0) goto L3b
            float r1 = r4.floatValue()
            float r2 = java.lang.Math.abs(r1)
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r3 = 0
            if (r2 > 0) goto L18
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto L18
            goto L19
        L18:
            r4 = r0
        L19:
            if (r4 == 0) goto L3b
            float r4 = r4.floatValue()
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 > 0) goto L26
            goto L32
        L26:
            r1 = 1120403456(0x42c80000, float:100.0)
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r2 > 0) goto L2e
        L2c:
            float r4 = r4 / r1
            goto L32
        L2e:
            r1 = 1176256512(0x461c4000, float:10000.0)
            goto L2c
        L32:
            float r4 = p000.j81.m2905(r4, r3, r0)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            return r4
        L3b:
            return r0
    }

    /* JADX INFO: renamed from: σ */
    public static java.util.List m3229(java.lang.Object r3) {
            jz r0 = p000.C0450jz.f5672
            if (r3 != 0) goto L5
            return r0
        L5:
            java.lang.String r1 = "getMoreChapterList"
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L16
            java.lang.Object r3 = p000.qe0.m4869(r3, r1, r2)     // Catch: java.lang.Throwable -> L16
            boolean r1 = r3 instanceof java.util.List     // Catch: java.lang.Throwable -> L16
            r2 = 0
            if (r1 == 0) goto L18
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L16
            goto L19
        L16:
            r3 = move-exception
            goto L23
        L18:
            r3 = r2
        L19:
            if (r3 == 0) goto L1f
            java.util.ArrayList r2 = p000.AbstractC0984xh.m6637(r3)     // Catch: java.lang.Throwable -> L16
        L1f:
            if (r2 != 0) goto L28
            r2 = r0
            goto L28
        L23:
            eo1 r2 = new eo1
            r2.<init>(r3)
        L28:
            boolean r3 = r2 instanceof p000.eo1
            if (r3 == 0) goto L2d
            goto L2e
        L2d:
            r0 = r2
        L2e:
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    /* JADX INFO: renamed from: τ */
    public static java.lang.Object m3230(java.lang.Object r2, java.lang.reflect.Field r3) {
            int r0 = r3.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            r1 = 0
            if (r0 == 0) goto Lc
            return r1
        Lc:
            r0 = 1
            r3.setAccessible(r0)     // Catch: java.lang.Throwable -> L15
            java.lang.Object r2 = r3.get(r2)     // Catch: java.lang.Throwable -> L15
            goto L1c
        L15:
            r2 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r2)
            r2 = r3
        L1c:
            boolean r3 = r2 instanceof p000.eo1
            if (r3 == 0) goto L21
            goto L22
        L21:
            r1 = r2
        L22:
            return r1
    }

    /* JADX INFO: renamed from: υ */
    public static java.lang.Object m3231(java.lang.Object r7, java.lang.String r8) {
            java.lang.Class r0 = r7.getClass()
        L4:
            r1 = 0
            if (r0 == 0) goto L37
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L37
            java.lang.reflect.Field[] r2 = r0.getDeclaredFields()
            r2.getClass()
            int r3 = r2.length
            r4 = 0
        L18:
            if (r4 >= r3) goto L2b
            r5 = r2[r4]
            java.lang.String r6 = r5.getName()
            boolean r6 = p000.ln0.m3626(r6, r8)
            if (r6 == 0) goto L28
            r1 = r5
            goto L2b
        L28:
            int r4 = r4 + 1
            goto L18
        L2b:
            if (r1 == 0) goto L32
            java.lang.Object r7 = m3230(r7, r1)
            return r7
        L32:
            java.lang.Class r0 = r0.getSuperclass()
            goto L4
        L37:
            return r1
    }

    /* JADX INFO: renamed from: φ */
    public static long m3232(java.lang.Object r7, java.lang.String[] r8) {
            int r0 = r8.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L31
            r2 = r8[r1]
            java.lang.Object r2 = m3231(r7, r2)
            boolean r3 = r2 instanceof java.lang.Number
            r4 = 0
            if (r3 == 0) goto L12
            java.lang.Number r2 = (java.lang.Number) r2
            goto L13
        L12:
            r2 = r4
        L13:
            if (r2 == 0) goto L1d
            long r2 = r2.longValue()
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
        L1d:
            if (r4 == 0) goto L2e
            long r2 = r4.longValue()
            r5 = 0
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 <= 0) goto L2e
            long r7 = r4.longValue()
            return r7
        L2e:
            int r1 = r1 + 1
            goto L2
        L31:
            r7 = -1
            return r7
    }

    /* JADX INFO: renamed from: χ */
    public static java.util.Set m3233(java.lang.Object r4, java.lang.String r5) {
            java.lang.Object r4 = m3231(r4, r5)
            boolean r5 = r4 instanceof int[]
            r0 = 0
            if (r5 == 0) goto L36
            int[] r4 = (int[]) r4
            int r5 = r4.length
            if (r5 == 0) goto L8e
            r1 = 1
            if (r5 == r1) goto L2b
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            int r1 = r4.length
            int r1 = p000.ex0.m1970(r1)
            r5.<init>(r1)
            int r1 = r4.length
        L1c:
            if (r0 >= r1) goto L2a
            r2 = r4[r0]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.add(r2)
            int r0 = r0 + 1
            goto L1c
        L2a:
            return r5
        L2b:
            r4 = r4[r0]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.util.Set r4 = p000.g81.m2288(r4)
            return r4
        L36:
            boolean r5 = r4 instanceof long[]
            if (r5 == 0) goto L57
            long[] r4 = (long[]) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            int r1 = r4.length
            r5.<init>(r1)
            int r1 = r4.length
        L43:
            if (r0 >= r1) goto L52
            r2 = r4[r0]
            int r2 = (int) r2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5.add(r2)
            int r0 = r0 + 1
            goto L43
        L52:
            java.util.Set r4 = p000.AbstractC0984xh.m6671(r5)
            return r4
        L57:
            boolean r5 = r4 instanceof java.util.Collection
            if (r5 == 0) goto L8e
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L66:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L89
            java.lang.Object r0 = r4.next()
            boolean r1 = r0 instanceof java.lang.Number
            r2 = 0
            if (r1 == 0) goto L78
            java.lang.Number r0 = (java.lang.Number) r0
            goto L79
        L78:
            r0 = r2
        L79:
            if (r0 == 0) goto L83
            int r0 = r0.intValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L83:
            if (r2 == 0) goto L66
            r5.add(r2)
            goto L66
        L89:
            java.util.Set r4 = p000.AbstractC0984xh.m6671(r5)
            return r4
        L8e:
            nz r4 = p000.C0604nz.f7825
            return r4
    }

    /* JADX INFO: renamed from: ψ */
    public static java.lang.Float m3234(android.view.View r2) {
            boolean r0 = r2 instanceof android.widget.ProgressBar
            r1 = 0
            if (r0 == 0) goto L8
            android.widget.ProgressBar r2 = (android.widget.ProgressBar) r2
            goto L9
        L8:
            r2 = r1
        L9:
            if (r2 != 0) goto Lc
            goto L12
        Lc:
            int r0 = r2.getMax()
            if (r0 > 0) goto L13
        L12:
            return r1
        L13:
            int r2 = r2.getProgress()
            float r2 = (float) r2
            float r0 = (float) r0
            float r2 = r2 / r0
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r2 = p000.j81.m2905(r2, r0, r1)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            return r2
    }

    /* JADX INFO: renamed from: ω */
    public static long m3235(java.lang.Object r10) {
            java.lang.String r0 = "timestamp"
            java.lang.Object r0 = m3231(r10, r0)
            boolean r1 = r0 instanceof java.lang.Number
            r2 = 0
            if (r1 == 0) goto Le
            java.lang.Number r0 = (java.lang.Number) r0
            goto Lf
        Le:
            r0 = r2
        Lf:
            r3 = -1
            if (r0 == 0) goto L18
            long r0 = r0.longValue()
            goto L19
        L18:
            r0 = r3
        L19:
            r5 = 0
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 < 0) goto L20
            return r0
        L20:
            java.lang.String r0 = "startTime"
            java.lang.String r1 = "startTimeMs"
            java.lang.String r7 = "timeStamp"
            java.lang.String[] r0 = new java.lang.String[]{r7, r0, r1}
            r1 = 0
        L2b:
            r7 = 3
            if (r1 >= r7) goto L5a
            r7 = r0[r1]
            java.lang.Object r7 = m3231(r10, r7)
            boolean r8 = r7 instanceof java.lang.Number
            if (r8 == 0) goto L3b
            java.lang.Number r7 = (java.lang.Number) r7
            goto L3c
        L3b:
            r7 = r2
        L3c:
            if (r7 == 0) goto L47
            long r7 = r7.longValue()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            goto L48
        L47:
            r7 = r2
        L48:
            if (r7 == 0) goto L57
            long r8 = r7.longValue()
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 < 0) goto L57
            long r0 = r7.longValue()
            return r0
        L57:
            int r1 = r1 + 1
            goto L2b
        L5a:
            return r3
    }

    /* JADX INFO: renamed from: Α */
    public final java.lang.Object m3236(android.view.View r4) {
            r3 = this;
            r0 = 0
            java.lang.String r1 = "getState"
            java.lang.Object r1 = m3215(r4, r1)     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L14
            java.lang.String r1 = "get_state"
            java.lang.Object r1 = m3215(r4, r1)     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L14
            return r0
        L12:
            r3 = move-exception
            goto L21
        L14:
            we r4 = new we     // Catch: java.lang.Throwable -> L12
            r2 = 10
            r4.<init>(r3, r2)     // Catch: java.lang.Throwable -> L12
            r3 = 4
            java.lang.Object r3 = m3218(r1, r3, r4)     // Catch: java.lang.Throwable -> L12
            goto L27
        L21:
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        L27:
            boolean r4 = r3 instanceof p000.eo1
            if (r4 == 0) goto L2c
            goto L2d
        L2c:
            r0 = r3
        L2d:
            return r0
    }

    /* JADX INFO: renamed from: Β */
    public final java.lang.Object m3237(android.view.View r4) {
            r3 = this;
            r0 = 0
            java.lang.String r1 = "getState"
            java.lang.Object r1 = m3215(r4, r1)     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L14
            java.lang.String r1 = "get_state"
            java.lang.Object r1 = m3215(r4, r1)     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L14
            return r0
        L12:
            r3 = move-exception
            goto L21
        L14:
            we r4 = new we     // Catch: java.lang.Throwable -> L12
            r2 = 11
            r4.<init>(r3, r2)     // Catch: java.lang.Throwable -> L12
            r3 = 4
            java.lang.Object r3 = m3218(r1, r3, r4)     // Catch: java.lang.Throwable -> L12
            goto L27
        L21:
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        L27:
            boolean r4 = r3 instanceof p000.eo1
            if (r4 == 0) goto L2c
            goto L2d
        L2c:
            r0 = r3
        L2d:
            return r0
    }

    /* JADX INFO: renamed from: Δ */
    public final boolean m3238(android.view.View r3, float r4) {
            r2 = this;
            java.lang.Object r2 = r2.m3236(r3)
            if (r2 != 0) goto L7
            goto L11
        L7:
            java.lang.Class r3 = r2.getClass()
            java.lang.reflect.Method r3 = m3221(r3)
            if (r3 != 0) goto L13
        L11:
            r2 = 0
            return r2
        L13:
            r0 = 1
            r3.setAccessible(r0)
            r0 = 0
            r1 = 1120403456(0x42c80000, float:100.0)
            float r4 = p000.j81.m2905(r4, r0, r1)     // Catch: java.lang.Throwable -> L2c
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch: java.lang.Throwable -> L2c
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Throwable -> L2c
            r3.invoke(r2, r4)     // Catch: java.lang.Throwable -> L2c
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L2c
            goto L33
        L2c:
            r2 = move-exception
            eo1 r3 = new eo1
            r3.<init>(r2)
            r2 = r3
        L33:
            java.lang.Throwable r3 = p000.fo1.m2190(r2)
            if (r3 != 0) goto L3a
            goto L51
        L3a:
            java.lang.String r2 = r3.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "pro seek failed: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            m3212(r2)
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
        L51:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            return r2
    }

    /* JADX INFO: renamed from: δ */
    public final void m3239(android.view.View r39, java.lang.Float r40) {
            r38 = this;
            r1 = r38
            r2 = r39
            boolean r0 = r2.isAttachedToWindow()
            if (r0 != 0) goto Lc
            goto L89d
        Lc:
            long r3 = android.os.SystemClock.uptimeMillis()
            java.util.Map r0 = p000.C0467kf.f5881
            java.lang.Object r5 = r0.get(r2)
            if (r5 != 0) goto L20
            hf r5 = new hf
            r5.<init>()
            r0.put(r2, r5)
        L20:
            hf r5 = (p000.C0357hf) r5
            long r6 = r5.f4713
            long r6 = r3 - r6
            r8 = 220(0xdc, double:1.087E-321)
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 >= 0) goto L2e
            goto L89d
        L2e:
            r5.f4713 = r3
            boolean r0 = p000.ui1.m5867()
            if (r0 == 0) goto L89d
            boolean r0 = p000.AbstractC0976x9.m6523()
            if (r0 == 0) goto L89d
            java.lang.String r0 = "chapter_ad_skip_enabled"
            r6 = 0
            boolean r0 = p000.ui1.m5887(r0, r6)
            if (r0 == 0) goto L89d
            java.util.List r0 = r5.f4716
            boolean r0 = r0.isEmpty()
            java.lang.String r7 = "~796896D9EC90C3E7F565E47CF96AEE6ECAB297EC32DB18E8427C26B3E9849D412BBF14C71EC8BF424B5C97D362D29CDB6552B9ACA740A59B0F7143BFEE2691"
            r8 = 0
            r10 = 1
            if (r0 == 0) goto L605
            jz r12 = p000.C0450jz.f5672
            java.util.List r0 = r5.f4716
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L64
            long r13 = r5.f4717
            int r0 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r0 <= 0) goto L64
            goto L605
        L64:
            int r0 = r5.f4714
            r13 = 4
            if (r0 < r13) goto L6b
            goto L89d
        L6b:
            long r13 = r5.f4715
            int r13 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r13 >= 0) goto L73
            goto L89d
        L73:
            int r0 = r0 + r10
            r5.f4714 = r0
            r13 = 650(0x28a, double:3.21E-321)
            long r13 = r13 + r3
            r5.f4715 = r13
            java.lang.Object r13 = r38.m3237(r39)
            java.lang.ref.WeakReference r0 = r5.f4710
            if (r0 == 0) goto L8c
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L8a
            goto L8c
        L8a:
            r14 = r0
            goto Lb8
        L8c:
            java.lang.ref.WeakReference r0 = p000.C0467kf.f5882
            if (r0 == 0) goto L95
            java.lang.Object r0 = r0.get()
            goto L96
        L95:
            r0 = 0
        L96:
            if (r0 != 0) goto L8a
            if (r13 != 0) goto L9c
        L9a:
            r0 = 0
            goto L8a
        L9c:
            java.lang.String r0 = "LIZLLL"
            java.lang.Object r0 = m3215(r13, r0)
            if (r0 != 0) goto La5
            goto L9a
        La5:
            boolean r14 = m3225(r0)
            if (r14 == 0) goto Lac
            goto L8a
        Lac:
            we r14 = new we
            r15 = 7
            r14.<init>(r15)
            r15 = 3
            java.lang.Object r0 = m3218(r0, r15, r14)
            goto L8a
        Lb8:
            if (r14 == 0) goto Lcd
            java.lang.ref.WeakReference r0 = r5.f4710
            if (r0 == 0) goto Lc3
            java.lang.Object r0 = r0.get()
            goto Lc4
        Lc3:
            r0 = 0
        Lc4:
            if (r0 != 0) goto Lcd
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r14)
            r5.f4710 = r0
        Lcd:
            java.lang.String r15 = "duration"
            if (r13 == 0) goto L107
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> Lf0
            java.lang.Object r0 = p000.qe0.m4869(r13, r15, r0)     // Catch: java.lang.Throwable -> Lf0
            r16 = r8
            boolean r8 = r0 instanceof java.lang.Number     // Catch: java.lang.Throwable -> Le0
            if (r8 == 0) goto Le2
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> Le0
            goto Le3
        Le0:
            r0 = move-exception
            goto Lf3
        Le2:
            r0 = 0
        Le3:
            if (r0 == 0) goto Lee
            long r8 = r0.longValue()     // Catch: java.lang.Throwable -> Le0
            java.lang.Long r0 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> Le0
            goto Lf9
        Lee:
            r0 = 0
            goto Lf9
        Lf0:
            r0 = move-exception
            r16 = r8
        Lf3:
            eo1 r8 = new eo1
            r8.<init>(r0)
            r0 = r8
        Lf9:
            boolean r8 = r0 instanceof p000.eo1
            if (r8 == 0) goto Lfe
            r0 = 0
        Lfe:
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L109
            java.lang.Long r0 = m3227(r0)
            goto L10a
        L107:
            r16 = r8
        L109:
            r0 = 0
        L10a:
            if (r0 == 0) goto L10e
            goto L289
        L10e:
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r18 = "~7974716F46EDCCC8AB71015994E08EBF7057E4892C51F22F56F7353FACB1B2D4E37F4031BB4E143F99F5369ADBB467DF3A6526DA150A61A2"
            java.lang.String r8 = p000.jf0.m2957(r18)
            boolean r0 = r0.equals(r8)
            java.lang.String r8 = "l"
            if (r0 == 0) goto L14c
            java.lang.Object r0 = m3231(r2, r8)
            boolean r9 = r0 instanceof java.lang.Number
            if (r9 == 0) goto L12f
            java.lang.Number r0 = (java.lang.Number) r0
            goto L130
        L12f:
            r0 = 0
        L130:
            if (r0 == 0) goto L13b
            long r21 = r0.longValue()
            java.lang.Long r0 = java.lang.Long.valueOf(r21)
            goto L13c
        L13b:
            r0 = 0
        L13c:
            if (r0 == 0) goto L14c
            long r21 = r0.longValue()
            int r9 = (r21 > r16 ? 1 : (r21 == r16 ? 0 : -1))
            if (r9 <= 0) goto L14c
            java.lang.Long r0 = m3227(r0)
            goto L22c
        L14c:
            java.lang.String r0 = "videoDuration"
            java.lang.String r9 = "durationMs"
            java.lang.String[] r0 = new java.lang.String[]{r15, r0, r9, r8}
            long r21 = m3232(r2, r0)
            int r0 = (r21 > r16 ? 1 : (r21 == r16 ? 0 : -1))
            if (r0 <= 0) goto L162
            java.lang.Long r0 = java.lang.Long.valueOf(r21)
            goto L22c
        L162:
            if (r14 == 0) goto L178
            java.lang.String r0 = "getVideo"
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L16d
            java.lang.Object r0 = p000.qe0.m4869(r14, r0, r8)     // Catch: java.lang.Throwable -> L16d
            goto L174
        L16d:
            r0 = move-exception
            eo1 r8 = new eo1
            r8.<init>(r0)
            r0 = r8
        L174:
            boolean r8 = r0 instanceof p000.eo1
            if (r8 == 0) goto L179
        L178:
            r0 = 0
        L179:
            if (r0 == 0) goto L21a
            java.lang.String[] r8 = new java.lang.String[]{r15, r9}
            long r8 = m3232(r0, r8)
            int r15 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r15 <= 0) goto L18d
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            goto L22c
        L18d:
            java.util.List r8 = m3229(r14)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
        L19a:
            boolean r15 = r8.hasNext()
            if (r15 == 0) goto L1b8
            java.lang.Object r15 = r8.next()
            long r21 = m3235(r15)
            java.lang.Long r15 = java.lang.Long.valueOf(r21)
            int r18 = (r21 > r16 ? 1 : (r21 == r16 ? 0 : -1))
            if (r18 < 0) goto L1b1
            goto L1b2
        L1b1:
            r15 = 0
        L1b2:
            if (r15 == 0) goto L19a
            r9.add(r15)
            goto L19a
        L1b8:
            java.lang.Comparable r8 = p000.AbstractC0984xh.m6647(r9)
            java.lang.Long r8 = (java.lang.Long) r8
            if (r8 == 0) goto L1c5
            long r8 = r8.longValue()
            goto L1c7
        L1c5:
            r8 = r16
        L1c7:
            java.lang.Class r15 = r0.getClass()
            java.lang.reflect.Field[] r15 = r15.getDeclaredFields()
            r15.getClass()
            ss1 r15 = p000.AbstractC0312g7.m2232(r15)
            we r11 = new we
            r6 = 12
            r11.<init>(r6)
            y30 r6 = new y30
            r6.<init>(r15, r10, r11)
            we r11 = new we
            r15 = 13
            r11.<init>(r15)
            y30 r15 = new y30
            r15.<init>(r6, r10, r11)
            ef r6 = new ef
            r11 = 0
            r6.<init>(r11, r0)
            y30 r0 = p000.us1.m5943(r15, r6)
            mc r6 = new mc
            r6.<init>(r10, r8)
            y30 r8 = new y30
            r8.<init>(r0, r10, r6)
            java.lang.Comparable r0 = p000.us1.m5944(r8)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L20f
            long r8 = r0.longValue()
            goto L211
        L20f:
            r8 = -1
        L211:
            int r0 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r0 <= 0) goto L21a
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            goto L22c
        L21a:
            or1 r0 = p000.pr1.m4580()
            if (r0 == 0) goto L22b
            long r8 = r0.f8181
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            int r6 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r6 <= 0) goto L22b
            goto L22c
        L22b:
            r0 = 0
        L22c:
            if (r0 == 0) goto L22f
            goto L289
        L22f:
            java.lang.Object r0 = r38.m3236(r39)
            if (r0 != 0) goto L237
        L235:
            r0 = 0
            goto L270
        L237:
            java.lang.Class r6 = r0.getClass()
            java.lang.String r8 = "getDuration"
            java.lang.reflect.Method r6 = m3217(r6, r8)
            if (r6 != 0) goto L244
            goto L235
        L244:
            r6.setAccessible(r10)
            r8 = 0
            java.lang.Object r0 = r6.invoke(r0, r8)     // Catch: java.lang.Throwable -> L253
            boolean r6 = r0 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L253
            if (r6 == 0) goto L255
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L253
            goto L256
        L253:
            r0 = move-exception
            goto L263
        L255:
            r0 = 0
        L256:
            if (r0 == 0) goto L261
            long r8 = r0.longValue()     // Catch: java.lang.Throwable -> L253
            java.lang.Long r0 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L253
            goto L269
        L261:
            r0 = 0
            goto L269
        L263:
            eo1 r6 = new eo1
            r6.<init>(r0)
            r0 = r6
        L269:
            boolean r6 = r0 instanceof p000.eo1
            if (r6 == 0) goto L26e
            r0 = 0
        L26e:
            java.lang.Long r0 = (java.lang.Long) r0
        L270:
            java.lang.Long r0 = m3227(r0)
            if (r0 == 0) goto L277
            goto L289
        L277:
            or1 r0 = p000.pr1.m4580()
            if (r0 == 0) goto L288
            long r8 = r0.f8181
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            int r6 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r6 <= 0) goto L288
            goto L289
        L288:
            r0 = 0
        L289:
            if (r0 == 0) goto L5f0
            long r26 = r0.longValue()
            java.util.List r6 = m3229(r14)
            nz r0 = p000.C0604nz.f7825
            if (r14 != 0) goto L299
        L297:
            r8 = r0
            goto L2b9
        L299:
            java.lang.String r8 = "chapterData"
            java.lang.Object r8 = m3231(r14, r8)
            if (r8 != 0) goto L2a2
            goto L297
        L2a2:
            java.lang.String r0 = "adChapterAutoSkipIndexList"
            java.util.Set r0 = m3233(r8, r0)
            r9 = r0
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L2b2
            goto L297
        L2b2:
            java.lang.String r0 = "adChapterIndexList"
            java.util.Set r0 = m3233(r8, r0)
            goto L297
        L2b9:
            int r0 = r6.size()
            r9 = 2
            if (r0 < r9) goto L3bd
            r0 = r8
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3bd
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r11 = r6.iterator()
            r13 = 0
        L2d3:
            boolean r14 = r11.hasNext()
            if (r14 == 0) goto L311
            java.lang.Object r14 = r11.next()
            int r15 = r13 + 1
            if (r13 < 0) goto L30b
            long r22 = m3235(r14)
            int r14 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r14 >= 0) goto L2ed
            r28 = r10
            r10 = 0
            goto L302
        L2ed:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r24 = 0
            long r19 = p000.j81.m2908(r22, r24, r26)
            java.lang.Long r14 = java.lang.Long.valueOf(r19)
            r28 = r10
            l91 r10 = new l91
            r10.<init>(r13, r14)
        L302:
            if (r10 == 0) goto L307
            r0.add(r10)
        L307:
            r13 = r15
            r10 = r28
            goto L2d3
        L30b:
            p000.AbstractC1021yh.m6917()
            r18 = 0
            throw r18
        L311:
            r28 = r10
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r0 = r0.iterator()
        L321:
            boolean r13 = r0.hasNext()
            if (r13 == 0) goto L344
            java.lang.Object r13 = r0.next()
            r14 = r13
            l91 r14 = (p000.l91) r14
            java.lang.Object r14 = r14.f6503
            java.lang.Number r14 = (java.lang.Number) r14
            long r14 = r14.longValue()
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            boolean r14 = r10.add(r14)
            if (r14 == 0) goto L321
            r11.add(r13)
            goto L321
        L344:
            d50 r0 = new d50
            r10 = 28
            r0.<init>(r10)
            java.util.List r0 = p000.AbstractC0984xh.m6658(r11, r0)
            int r10 = r0.size()
            if (r10 >= r9) goto L356
            goto L3b7
        L356:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r9 = r0.iterator()
            r10 = 0
        L360:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L3b7
            java.lang.Object r11 = r9.next()
            int r13 = r10 + 1
            if (r10 < 0) goto L3b1
            l91 r11 = (p000.l91) r11
            java.lang.Object r10 = r11.f6503
            java.lang.Number r10 = (java.lang.Number) r10
            long r31 = r10.longValue()
            java.lang.Object r10 = p000.AbstractC0984xh.m6641(r13, r0)
            l91 r10 = (p000.l91) r10
            if (r10 == 0) goto L38b
            java.lang.Object r10 = r10.f6503
            java.lang.Number r10 = (java.lang.Number) r10
            long r14 = r10.longValue()
            r33 = r14
            goto L38d
        L38b:
            r33 = r26
        L38d:
            int r10 = (r33 > r31 ? 1 : (r33 == r31 ? 0 : -1))
            if (r10 > 0) goto L393
            r10 = 0
            goto L3aa
        L393:
            java.lang.Object r10 = r11.f6502
            java.lang.Number r10 = (java.lang.Number) r10
            int r30 = r10.intValue()
            ff r29 = new ff
            java.lang.Integer r10 = java.lang.Integer.valueOf(r30)
            boolean r35 = r8.contains(r10)
            r29.<init>(r30, r31, r33, r35)
            r10 = r29
        L3aa:
            if (r10 == 0) goto L3af
            r12.add(r10)
        L3af:
            r10 = r13
            goto L360
        L3b1:
            p000.AbstractC1021yh.m6917()
            r18 = 0
            throw r18
        L3b7:
            r19 = r3
            r3 = r26
            goto L57f
        L3bd:
            r28 = r10
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r9 = p000.jf0.m2957(r7)
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L3d2
            goto L3b7
        L3d2:
            if (r13 != 0) goto L3db
            java.lang.Object r13 = r38.m3237(r39)
            if (r13 != 0) goto L3db
            goto L3b7
        L3db:
            java.lang.String r0 = "LJIIIIZZ"
            r11 = 0
            java.lang.Object[] r9 = new java.lang.Object[r11]     // Catch: java.lang.Throwable -> L3e5
            java.lang.Object r0 = p000.qe0.m4869(r13, r0, r9)     // Catch: java.lang.Throwable -> L3e5
            goto L3ec
        L3e5:
            r0 = move-exception
            eo1 r9 = new eo1
            r9.<init>(r0)
            r0 = r9
        L3ec:
            boolean r9 = r0 instanceof p000.eo1
            if (r9 == 0) goto L3f1
            r0 = 0
        L3f1:
            if (r0 != 0) goto L3f4
            goto L3b7
        L3f4:
            java.lang.String r9 = "LIZIZ"
            java.lang.Object r0 = m3231(r0, r9)
            boolean r10 = r0 instanceof java.util.List
            if (r10 == 0) goto L401
            java.util.List r0 = (java.util.List) r0
            goto L402
        L401:
            r0 = 0
        L402:
            if (r0 == 0) goto L409
            java.util.ArrayList r0 = p000.AbstractC0984xh.m6637(r0)
            goto L40a
        L409:
            r0 = 0
        L40a:
            if (r0 != 0) goto L40d
            r0 = r12
        L40d:
            boolean r10 = r0.isEmpty()
            if (r10 == 0) goto L414
            goto L3b7
        L414:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r0 = r0.iterator()
            r30 = 0
        L41f:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L4d3
            java.lang.Object r11 = r0.next()
            int r13 = r30 + 1
            if (r30 < 0) goto L4cd
            java.lang.Object r14 = m3231(r11, r9)
            boolean r15 = r14 instanceof java.lang.Number
            if (r15 == 0) goto L438
            java.lang.Number r14 = (java.lang.Number) r14
            goto L439
        L438:
            r14 = 0
        L439:
            if (r14 == 0) goto L4c3
            long r14 = r14.longValue()
            java.lang.Long r22 = java.lang.Long.valueOf(r14)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 < 0) goto L448
            goto L44a
        L448:
            r22 = 0
        L44a:
            if (r22 == 0) goto L4c3
            long r22 = r22.longValue()
            java.lang.String r14 = "LIZJ"
            java.lang.Object r14 = m3231(r11, r14)
            boolean r15 = r14 instanceof java.lang.Number
            if (r15 == 0) goto L45d
            java.lang.Number r14 = (java.lang.Number) r14
            goto L45e
        L45d:
            r14 = 0
        L45e:
            if (r14 == 0) goto L467
            long r14 = r14.longValue()
            r33 = r14
            goto L469
        L467:
            r33 = -1
        L469:
            java.lang.String r14 = "LIZ"
            java.lang.Object r11 = m3231(r11, r14)
            boolean r14 = r11 instanceof java.lang.String
            if (r14 == 0) goto L476
            java.lang.String r11 = (java.lang.String) r11
            goto L477
        L476:
            r11 = 0
        L477:
            gf r29 = new gf
            r24 = 0
            long r31 = p000.j81.m2908(r22, r24, r26)
            if (r11 == 0) goto L4b8
            java.lang.CharSequence r11 = p000.q02.m4660(r11)
            java.lang.String r11 = r11.toString()
            if (r11 == 0) goto L4b8
            int r14 = r11.length()
            if (r14 <= 0) goto L492
            goto L493
        L492:
            r11 = 0
        L493:
            if (r11 != 0) goto L496
            goto L4b8
        L496:
            java.lang.String r14 = "广告"
            r15 = 0
            boolean r14 = p000.q02.m4654(r11, r14, r15)
            if (r14 != 0) goto L4bb
            java.lang.String r14 = "推广"
            boolean r14 = p000.q02.m4654(r11, r14, r15)
            if (r14 != 0) goto L4bb
            java.lang.String r14 = "营销"
            boolean r14 = p000.q02.m4654(r11, r14, r15)
            if (r14 != 0) goto L4bb
            java.lang.String r14 = "赞助"
            boolean r11 = p000.q02.m4654(r11, r14, r15)
            if (r11 == 0) goto L4b8
            goto L4bb
        L4b8:
            r35 = 0
            goto L4bd
        L4bb:
            r35 = r28
        L4bd:
            r29.<init>(r30, r31, r33, r35)
            r11 = r29
            goto L4c4
        L4c3:
            r11 = 0
        L4c4:
            if (r11 == 0) goto L4c9
            r10.add(r11)
        L4c9:
            r30 = r13
            goto L41f
        L4cd:
            p000.AbstractC1021yh.m6917()
            r18 = 0
            throw r18
        L4d3:
            d50 r0 = new d50
            r9 = 29
            r0.<init>(r9)
            java.util.List r0 = p000.AbstractC0984xh.m6658(r10, r0)
            boolean r9 = r0.isEmpty()
            if (r9 == 0) goto L4e6
            goto L3b7
        L4e6:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r9 = r0.iterator()
            r11 = 0
        L4f0:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L3b7
            java.lang.Object r10 = r9.next()
            int r13 = r11 + 1
            if (r11 < 0) goto L579
            gf r10 = (p000.C0320gf) r10
            java.lang.Object r14 = p000.AbstractC0984xh.m6641(r13, r0)
            gf r14 = (p000.C0320gf) r14
            if (r14 == 0) goto L50d
            long r14 = r14.f4350
        L50a:
            r19 = r3
            goto L510
        L50d:
            r14 = r26
            goto L50a
        L510:
            long r3 = r10.f4351
            java.lang.Long r22 = java.lang.Long.valueOf(r3)
            r23 = r3
            long r3 = r10.f4350
            int r3 = (r23 > r3 ? 1 : (r23 == r3 ? 0 : -1))
            if (r3 <= 0) goto L51f
            goto L521
        L51f:
            r22 = 0
        L521:
            if (r22 == 0) goto L52f
            long r22 = r22.longValue()
            long r3 = r10.f4350
            r24 = r3
            long r14 = p000.j81.m2908(r22, r24, r26)
        L52f:
            r3 = r26
            r33 = r14
            long r14 = r10.f4350
            int r22 = (r33 > r14 ? 1 : (r33 == r14 ? 0 : -1))
            if (r22 > 0) goto L53d
            r22 = r0
            r0 = 0
            goto L56b
        L53d:
            ff r29 = new ff
            r22 = r0
            int r0 = r10.f4349
            boolean r10 = r10.f4352
            if (r10 != 0) goto L563
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            boolean r10 = r8.contains(r10)
            if (r10 != 0) goto L563
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            boolean r10 = r8.contains(r10)
            if (r10 == 0) goto L55c
            goto L563
        L55c:
            r35 = 0
        L55e:
            r30 = r0
            r31 = r14
            goto L566
        L563:
            r35 = r28
            goto L55e
        L566:
            r29.<init>(r30, r31, r33, r35)
            r0 = r29
        L56b:
            if (r0 == 0) goto L570
            r12.add(r0)
        L570:
            r26 = r3
            r11 = r13
            r3 = r19
            r0 = r22
            goto L4f0
        L579:
            p000.AbstractC1021yh.m6917()
            r18 = 0
            throw r18
        L57f:
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L5a1
            int r0 = r5.f4714
            int r1 = r6.size()
            java.lang.String r2 = ", chapters="
            java.lang.String r3 = ", adIndexes="
            java.lang.String r4 = "no segments, attempt="
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r4, r0, r2, r1, r3)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            m3212(r0)
            goto L89d
        L5a1:
            r5.f4716 = r12
            r5.f4717 = r3
            int r0 = r12.size()
            boolean r3 = r12.isEmpty()
            if (r3 == 0) goto L5b3
            r11 = 0
        L5b0:
            r18 = 0
            goto L5d6
        L5b3:
            java.util.Iterator r3 = r12.iterator()
            r11 = 0
        L5b8:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L5b0
            java.lang.Object r4 = r3.next()
            ff r4 = (p000.C0283ff) r4
            boolean r4 = r4.f3918
            if (r4 == 0) goto L5d3
            int r11 = r11 + 1
            if (r11 < 0) goto L5cd
            goto L5b8
        L5cd:
            p000.AbstractC1021yh.m6916()
            r18 = 0
            throw r18
        L5d3:
            r18 = 0
            goto L5b8
        L5d6:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "cached segments="
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = ", ads="
            r3.append(r0)
            r3.append(r11)
            java.lang.String r0 = r3.toString()
            m3226(r0)
            goto L60d
        L5f0:
            int r0 = r5.f4714
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "no duration, attempt="
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            m3212(r0)
            goto L89d
        L605:
            r19 = r3
            r16 = r8
            r28 = r10
            r18 = 0
        L60d:
            long r3 = r5.f4717
            java.lang.Long r8 = java.lang.Long.valueOf(r3)
            int r0 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r0 <= 0) goto L618
            goto L61a
        L618:
            r8 = r18
        L61a:
            if (r8 == 0) goto L89d
            long r13 = r8.longValue()
            java.util.List r0 = r5.f4716
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L62a
            goto L89d
        L62a:
            or1 r3 = p000.pr1.m4580()
            java.lang.Float r4 = m3228(r40)
            r6 = 0
            if (r4 == 0) goto L63a
            float r3 = r4.floatValue()
            goto L675
        L63a:
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L64d
            float r3 = r3.f8184
            java.lang.Float r8 = java.lang.Float.valueOf(r3)
            int r9 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r9 > 0) goto L64d
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 > 0) goto L64d
            goto L64f
        L64d:
            r8 = r18
        L64f:
            if (r8 == 0) goto L656
        L651:
            float r3 = r8.floatValue()
            goto L675
        L656:
            java.lang.Float r3 = m3234(r2)
            if (r3 == 0) goto L661
            float r3 = r3.floatValue()
            goto L675
        L661:
            float r3 = r5.f4712
            java.lang.Float r8 = java.lang.Float.valueOf(r3)
            int r9 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r9 > 0) goto L670
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 > 0) goto L670
            goto L672
        L670:
            r8 = r18
        L672:
            if (r8 == 0) goto L88a
            goto L651
        L675:
            r5.f4712 = r3
            double r8 = (double) r13
            double r3 = (double) r3
            double r3 = r3 * r8
            long r3 = (long) r3
            r11 = 0
            r36 = r8
            r9 = r3
            r3 = r36
            long r8 = p000.j81.m2908(r9, r11, r13)
            int r10 = r0.size()
            java.util.ListIterator r10 = r0.listIterator(r10)
        L68e:
            boolean r11 = r10.hasPrevious()
            if (r11 == 0) goto L6a8
            java.lang.Object r11 = r10.previous()
            r12 = r11
            ff r12 = (p000.C0283ff) r12
            r16 = r7
            long r6 = r12.f3916
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 < 0) goto L6a4
            goto L6ac
        L6a4:
            r7 = r16
            r6 = 0
            goto L68e
        L6a8:
            r16 = r7
            r11 = r18
        L6ac:
            r6 = r11
            ff r6 = (p000.C0283ff) r6
            if (r6 != 0) goto L6cf
            int r0 = r0.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "no current segment, current="
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r2 = " segments="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            m3212(r0)
            return
        L6cf:
            int r7 = r6.f3915
            r5.f4711 = r7
            boolean r5 = r6.f3918
            if (r5 != 0) goto L6d9
            goto L89d
        L6d9:
            long r10 = r6.f3917
            r22 = r3
            long r3 = r6.f3916
            int r5 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r5 > 0) goto L6e5
            goto L89d
        L6e5:
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 < 0) goto L89d
            int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r3 < 0) goto L6ef
            goto L89d
        L6ef:
            long r3 = p000.C0467kf.f5884
            long r3 = r19 - r3
            r10 = 1700(0x6a4, double:8.4E-321)
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 >= 0) goto L6fb
            goto L89d
        L6fb:
            java.util.Iterator r0 = r0.iterator()
        L6ff:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L717
            java.lang.Object r3 = r0.next()
            r4 = r3
            ff r4 = (p000.C0283ff) r4
            int r5 = r4.f3915
            int r7 = r6.f3915
            if (r5 <= r7) goto L6ff
            boolean r4 = r4.f3918
            if (r4 != 0) goto L6ff
            goto L719
        L717:
            r3 = r18
        L719:
            ff r3 = (p000.C0283ff) r3
            r4 = r8
            if (r3 != 0) goto L72b
            ff r9 = new ff
            int r0 = r6.f3915
            int r10 = r0 + 1
            long r11 = r6.f3917
            r15 = 0
            r9.<init>(r10, r11, r13, r15)
            r3 = r9
        L72b:
            long r7 = r3.f3916
            r9 = 450(0x1c2, double:2.223E-321)
            long r9 = r9 + r7
            r11 = 0
            long r7 = p000.j81.m2908(r9, r11, r13)
            r9 = 250(0xfa, double:1.235E-321)
            long r9 = r9 + r4
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 > 0) goto L73f
            goto L89d
        L73f:
            double r9 = (double) r7
            r11 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r9 = r9 * r11
            double r9 = r9 / r22
            float r0 = (float) r9
            r9 = 1120403456(0x42c80000, float:100.0)
            r10 = 0
            float r0 = p000.j81.m2905(r0, r10, r9)
            long r9 = p000.C0467kf.f5884
            p000.C0467kf.f5884 = r19
            java.lang.Class r11 = r2.getClass()
            java.lang.String r11 = r11.getName()
            java.lang.String r12 = p000.jf0.m2957(r16)
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L76d
            boolean r11 = m3211(r2, r0)
            if (r11 == 0) goto L76d
            java.lang.String r0 = "state-player"
            goto L7e3
        L76d:
            java.lang.Class r11 = r2.getClass()
            java.lang.String r11 = r11.getName()
            java.lang.String r12 = p000.jf0.m2957(r16)
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L788
            boolean r11 = m3210(r2, r0)
            if (r11 == 0) goto L788
            java.lang.String r0 = "component"
            goto L7e3
        L788:
            java.lang.Class r11 = r2.getClass()
            java.lang.String r11 = r11.getName()
            java.lang.String r12 = p000.jf0.m2957(r16)
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L7a3
            boolean r11 = r1.m3238(r2, r0)
            if (r11 == 0) goto L7a3
            java.lang.String r0 = "walk-player"
            goto L7e3
        L7a3:
            java.lang.ref.WeakReference r11 = p000.C0467kf.f5883
            if (r11 == 0) goto L7ae
            java.lang.Object r11 = r11.get()
            android.view.View r11 = (android.view.View) r11
            goto L7b0
        L7ae:
            r11 = r18
        L7b0:
            if (r11 == 0) goto L7e1
            if (r11 == r2) goto L7e1
            java.lang.Class r12 = r11.getClass()
            java.lang.String r12 = r12.getName()
            java.lang.String r13 = p000.jf0.m2957(r16)
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto L7e1
            boolean r12 = m3211(r11, r0)
            if (r12 == 0) goto L7cf
            java.lang.String r0 = "latest-state-player"
            goto L7e3
        L7cf:
            boolean r12 = m3210(r11, r0)
            if (r12 == 0) goto L7d8
            java.lang.String r0 = "latest-component"
            goto L7e3
        L7d8:
            boolean r0 = r1.m3238(r11, r0)
            if (r0 == 0) goto L7e1
            java.lang.String r0 = "latest-walk-player"
            goto L7e3
        L7e1:
            r0 = r18
        L7e3:
            if (r0 == 0) goto L882
            android.content.Context r1 = r2.getContext()
            boolean r2 = p000.ui1.m5867()
            if (r2 == 0) goto L84e
            java.lang.String r2 = "chapter_seekbar_segment_skip_notify"
            r11 = 0
            boolean r2 = p000.ui1.m5887(r2, r11)
            if (r2 == 0) goto L84e
            if (r1 == 0) goto L84e
        L7fa:
            if (r1 == 0) goto L81f
            int r2 = r11 + 1
            r9 = 8
            if (r11 >= r9) goto L81f
            boolean r9 = r1 instanceof android.app.Activity
            if (r9 == 0) goto L80b
            r11 = r1
            android.app.Activity r11 = (android.app.Activity) r11
            r15 = r11
            goto L821
        L80b:
            boolean r9 = r1 instanceof android.content.ContextWrapper
            if (r9 == 0) goto L812
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            goto L814
        L812:
            r1 = r18
        L814:
            if (r1 == 0) goto L81b
            android.content.Context r1 = r1.getBaseContext()
            goto L81d
        L81b:
            r1 = r18
        L81d:
            r11 = r2
            goto L7fa
        L81f:
            r15 = r18
        L821:
            if (r15 != 0) goto L824
            goto L84e
        L824:
            android.os.Handler r1 = com.example.dyhelper.p002ui.C0182.f2694
            int r1 = r6.f3915
            int r1 = r1 + 1
            int r2 = r3.f3915
            int r2 = r2 + 1
            java.lang.String r3 = "章节 "
            java.lang.String r9 = " -> "
            java.lang.String r12 = p000.AbstractC0602nx.m4125(r1, r2, r3, r9)
            java.lang.String r11 = "已跳过广告章节"
            java.lang.String r1 = com.example.dyhelper.p002ui.C0182.m1592(r11)
            java.lang.String r10 = com.example.dyhelper.p002ui.C0182.m1593(r1)
            f52 r14 = p000.f52.f3754
            d52 r9 = new d52
            r13 = 100
            r16 = 1400(0x578, double:6.917E-321)
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            com.example.dyhelper.p002ui.C0182.m1597(r9)
        L84e:
            int r1 = r6.f3915
            long r2 = r6.f3916
            long r9 = r6.f3917
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r11 = "skip chapter index="
            r6.<init>(r11)
            r6.append(r1)
            java.lang.String r1 = ", from="
            r6.append(r1)
            r6.append(r4)
            java.lang.String r1 = " to="
            java.lang.String r4 = " ad="
            p000.AbstractC0602nx.m4118(r6, r1, r7, r4)
            r6.append(r2)
            java.lang.String r1 = "-"
            java.lang.String r2 = ", route="
            p000.AbstractC0602nx.m4118(r6, r1, r9, r2)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            m3226(r0)
            goto L89d
        L882:
            p000.C0467kf.f5884 = r9
            java.lang.String r0 = "seek bridge not found"
            m3212(r0)
            goto L89d
        L88a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "no progress ratio, arg="
            r0.<init>(r1)
            r1 = r40
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            m3212(r0)
        L89d:
            return
    }
}
