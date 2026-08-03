package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۥۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
@Yue.InterfaceC5336(26)
@android.annotation.SuppressLint({"SoonBlockedPrivateApi"})
public final class C7006 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f24500 = "WeightTypeface";

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.String f24501 = "native_instance";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.String f24502 = "nativeCreateFromTypefaceWithExactStyle";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.lang.reflect.Field f24503 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.lang.reflect.Method f24504 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final java.lang.reflect.Constructor<android.graphics.Typeface> f24505 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC2947("sWeightCacheLock")
    public static final Yue.C3827<android.util.SparseArray<android.graphics.Typeface>> f24506 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final java.lang.Object f24507 = null;

    static {
            java.lang.Class<android.graphics.Typeface> r0 = android.graphics.Typeface.class
            java.lang.String r1 = "native_instance"
            java.lang.reflect.Field r1 = r0.getDeclaredField(r1)     // Catch: java.lang.NoSuchMethodException -> L28 java.lang.NoSuchFieldException -> L2a
            java.lang.String r2 = "nativeCreateFromTypefaceWithExactStyle"
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch: java.lang.NoSuchMethodException -> L28 java.lang.NoSuchFieldException -> L2a
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L28 java.lang.NoSuchFieldException -> L2a
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L28 java.lang.NoSuchFieldException -> L2a
            java.lang.Class[] r4 = new java.lang.Class[]{r3, r4, r5}     // Catch: java.lang.NoSuchMethodException -> L28 java.lang.NoSuchFieldException -> L2a
            java.lang.reflect.Method r2 = r0.getDeclaredMethod(r2, r4)     // Catch: java.lang.NoSuchMethodException -> L28 java.lang.NoSuchFieldException -> L2a
            r4 = 1
            r2.setAccessible(r4)     // Catch: java.lang.NoSuchMethodException -> L28 java.lang.NoSuchFieldException -> L2a
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.NoSuchMethodException -> L28 java.lang.NoSuchFieldException -> L2a
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r3)     // Catch: java.lang.NoSuchMethodException -> L28 java.lang.NoSuchFieldException -> L2a
            r0.setAccessible(r4)     // Catch: java.lang.NoSuchMethodException -> L28 java.lang.NoSuchFieldException -> L2a
            goto L3b
        L28:
            r0 = move-exception
            goto L2b
        L2a:
            r0 = move-exception
        L2b:
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "WeightTypeface"
            android.util.Log.e(r2, r1, r0)
            r1 = 0
            r0 = r1
            r2 = r0
        L3b:
            Yue.C7006.f24503 = r1
            Yue.C7006.f24504 = r2
            Yue.C7006.f24505 = r0
            Yue.ۥۣ۠ۨۢ r0 = new Yue.ۥۣ۠ۨۢ
            r1 = 3
            r0.<init>(r1)
            Yue.C7006.f24506 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            Yue.C7006.f24507 = r0
            return
    }

    public C7006() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static android.graphics.Typeface m27131(long r2) {
            r0 = 0
            java.lang.reflect.Constructor<android.graphics.Typeface> r1 = Yue.C7006.f24505     // Catch: java.lang.Throwable -> L12
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L12
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L12
            java.lang.Object r2 = r1.newInstance(r2)     // Catch: java.lang.Throwable -> L12
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2     // Catch: java.lang.Throwable -> L12
            return r2
        L12:
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static android.graphics.Typeface m27132(@Yue.InterfaceC4410 android.graphics.Typeface r6, int r7, boolean r8) {
            boolean r0 = m27134()
            if (r0 != 0) goto L8
            r6 = 0
            return r6
        L8:
            int r0 = r7 << 1
            r0 = r0 | r8
            java.lang.Object r1 = Yue.C7006.f24507
            monitor-enter(r1)
            long r2 = m27133(r6)     // Catch: java.lang.Throwable -> L26
            Yue.ۥۣ۠ۨۢ<android.util.SparseArray<android.graphics.Typeface>> r6 = Yue.C7006.f24506     // Catch: java.lang.Throwable -> L26
            java.lang.Object r4 = r6.m15316(r2)     // Catch: java.lang.Throwable -> L26
            android.util.SparseArray r4 = (android.util.SparseArray) r4     // Catch: java.lang.Throwable -> L26
            if (r4 != 0) goto L28
            android.util.SparseArray r4 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L26
            r5 = 4
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L26
            r6.m15322(r2, r4)     // Catch: java.lang.Throwable -> L26
            goto L32
        L26:
            r6 = move-exception
            goto L3f
        L28:
            java.lang.Object r6 = r4.get(r0)     // Catch: java.lang.Throwable -> L26
            android.graphics.Typeface r6 = (android.graphics.Typeface) r6     // Catch: java.lang.Throwable -> L26
            if (r6 == 0) goto L32
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L26
            return r6
        L32:
            long r6 = m27135(r2, r7, r8)     // Catch: java.lang.Throwable -> L26
            android.graphics.Typeface r6 = m27131(r6)     // Catch: java.lang.Throwable -> L26
            r4.put(r0, r6)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L26
            return r6
        L3f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L26
            throw r6
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static long m27133(@Yue.InterfaceC4410 android.graphics.Typeface r2) {
            java.lang.reflect.Field r0 = Yue.C7006.f24503     // Catch: java.lang.IllegalAccessException -> L7
            long r0 = r0.getLong(r2)     // Catch: java.lang.IllegalAccessException -> L7
            return r0
        L7:
            r2 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r2)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static boolean m27134() {
            java.lang.reflect.Field r0 = Yue.C7006.f24503
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @android.annotation.SuppressLint({"BanUncheckedReflection"})
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static long m27135(long r1, int r3, boolean r4) {
            java.lang.reflect.Method r0 = Yue.C7006.f24504     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3}     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20
            r2 = 0
            java.lang.Object r1 = r0.invoke(r2, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20
            long r1 = r1.longValue()     // Catch: java.lang.reflect.InvocationTargetException -> L1e java.lang.IllegalAccessException -> L20
            return r1
        L1e:
            r1 = move-exception
            goto L22
        L20:
            r1 = move-exception
            goto L28
        L22:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
        L28:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
    }
}
