package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۥۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
@Yue.InterfaceC5336(21)
@android.annotation.SuppressLint({"SoonBlockedPrivateApi"})
public final class C7005 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f24490 = "WeightTypeface";

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.String f24491 = "native_instance";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.String f24492 = "nativeCreateFromTypeface";

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f24493 = "nativeCreateWeightAlias";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.lang.reflect.Field f24494 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final java.lang.reflect.Method f24495 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final java.lang.reflect.Method f24496 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final java.lang.reflect.Constructor<android.graphics.Typeface> f24497 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC2947("sWeightCacheLock")
    public static final Yue.C3827<android.util.SparseArray<android.graphics.Typeface>> f24498 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final java.lang.Object f24499 = null;

    static {
            java.lang.Class<android.graphics.Typeface> r0 = android.graphics.Typeface.class
            java.lang.String r1 = "native_instance"
            java.lang.reflect.Field r1 = r0.getDeclaredField(r1)     // Catch: java.lang.NoSuchMethodException -> L33 java.lang.NoSuchFieldException -> L35
            java.lang.String r2 = "nativeCreateFromTypeface"
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch: java.lang.NoSuchMethodException -> L33 java.lang.NoSuchFieldException -> L35
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L33 java.lang.NoSuchFieldException -> L35
            java.lang.Class[] r5 = new java.lang.Class[]{r3, r4}     // Catch: java.lang.NoSuchMethodException -> L33 java.lang.NoSuchFieldException -> L35
            java.lang.reflect.Method r2 = r0.getDeclaredMethod(r2, r5)     // Catch: java.lang.NoSuchMethodException -> L33 java.lang.NoSuchFieldException -> L35
            r5 = 1
            r2.setAccessible(r5)     // Catch: java.lang.NoSuchMethodException -> L33 java.lang.NoSuchFieldException -> L35
            java.lang.String r6 = "nativeCreateWeightAlias"
            java.lang.Class[] r4 = new java.lang.Class[]{r3, r4}     // Catch: java.lang.NoSuchMethodException -> L33 java.lang.NoSuchFieldException -> L35
            java.lang.reflect.Method r4 = r0.getDeclaredMethod(r6, r4)     // Catch: java.lang.NoSuchMethodException -> L33 java.lang.NoSuchFieldException -> L35
            r4.setAccessible(r5)     // Catch: java.lang.NoSuchMethodException -> L33 java.lang.NoSuchFieldException -> L35
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.NoSuchMethodException -> L33 java.lang.NoSuchFieldException -> L35
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r3)     // Catch: java.lang.NoSuchMethodException -> L33 java.lang.NoSuchFieldException -> L35
            r0.setAccessible(r5)     // Catch: java.lang.NoSuchMethodException -> L33 java.lang.NoSuchFieldException -> L35
            goto L47
        L33:
            r0 = move-exception
            goto L36
        L35:
            r0 = move-exception
        L36:
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "WeightTypeface"
            android.util.Log.e(r2, r1, r0)
            r1 = 0
            r0 = r1
            r2 = r0
            r4 = r2
        L47:
            Yue.C7005.f24494 = r1
            Yue.C7005.f24495 = r2
            Yue.C7005.f24496 = r4
            Yue.C7005.f24497 = r0
            Yue.ۥۣ۠ۨۢ r0 = new Yue.ۥۣ۠ۨۢ
            r1 = 3
            r0.<init>(r1)
            Yue.C7005.f24498 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            Yue.C7005.f24499 = r0
            return
    }

    public C7005() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static android.graphics.Typeface m27125(long r2) {
            r0 = 0
            java.lang.reflect.Constructor<android.graphics.Typeface> r1 = Yue.C7005.f24497     // Catch: java.lang.Throwable -> L12
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
    public static android.graphics.Typeface m27126(@Yue.InterfaceC4410 android.graphics.Typeface r7, int r8, boolean r9) {
            boolean r0 = m27128()
            if (r0 != 0) goto L8
            r7 = 0
            return r7
        L8:
            int r0 = r8 << 1
            r0 = r0 | r9
            java.lang.Object r1 = Yue.C7005.f24499
            monitor-enter(r1)
            long r2 = m27127(r7)     // Catch: java.lang.Throwable -> L26
            Yue.ۥۣ۠ۨۢ<android.util.SparseArray<android.graphics.Typeface>> r4 = Yue.C7005.f24498     // Catch: java.lang.Throwable -> L26
            java.lang.Object r5 = r4.m15316(r2)     // Catch: java.lang.Throwable -> L26
            android.util.SparseArray r5 = (android.util.SparseArray) r5     // Catch: java.lang.Throwable -> L26
            if (r5 != 0) goto L28
            android.util.SparseArray r5 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L26
            r6 = 4
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L26
            r4.m15322(r2, r5)     // Catch: java.lang.Throwable -> L26
            goto L32
        L26:
            r7 = move-exception
            goto L4e
        L28:
            java.lang.Object r4 = r5.get(r0)     // Catch: java.lang.Throwable -> L26
            android.graphics.Typeface r4 = (android.graphics.Typeface) r4     // Catch: java.lang.Throwable -> L26
            if (r4 == 0) goto L32
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L26
            return r4
        L32:
            boolean r7 = r7.isItalic()     // Catch: java.lang.Throwable -> L26
            if (r9 != r7) goto L41
            long r7 = m27130(r2, r8)     // Catch: java.lang.Throwable -> L26
            android.graphics.Typeface r7 = m27125(r7)     // Catch: java.lang.Throwable -> L26
            goto L49
        L41:
            long r7 = m27129(r2, r8, r9)     // Catch: java.lang.Throwable -> L26
            android.graphics.Typeface r7 = m27125(r7)     // Catch: java.lang.Throwable -> L26
        L49:
            r5.put(r0, r7)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L26
            return r7
        L4e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L26
            throw r7
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static long m27127(@Yue.InterfaceC4410 android.graphics.Typeface r2) {
            java.lang.reflect.Field r0 = Yue.C7005.f24494     // Catch: java.lang.IllegalAccessException -> L7
            long r0 = r0.getLong(r2)     // Catch: java.lang.IllegalAccessException -> L7
            return r0
        L7:
            r2 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r2)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static boolean m27128() {
            java.lang.reflect.Field r0 = Yue.C7005.f24494
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
    public static long m27129(long r1, int r3, boolean r4) {
            if (r4 == 0) goto L4
            r4 = 2
            goto L5
        L4:
            r4 = 0
        L5:
            java.lang.reflect.Method r0 = Yue.C7005.f24495     // Catch: java.lang.reflect.InvocationTargetException -> L32 java.lang.IllegalAccessException -> L34
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L32 java.lang.IllegalAccessException -> L34
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L32 java.lang.IllegalAccessException -> L34
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}     // Catch: java.lang.reflect.InvocationTargetException -> L32 java.lang.IllegalAccessException -> L34
            r2 = 0
            java.lang.Object r1 = r0.invoke(r2, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L32 java.lang.IllegalAccessException -> L34
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.reflect.InvocationTargetException -> L32 java.lang.IllegalAccessException -> L34
            r1.longValue()     // Catch: java.lang.reflect.InvocationTargetException -> L32 java.lang.IllegalAccessException -> L34
            java.lang.reflect.Method r4 = Yue.C7005.f24496     // Catch: java.lang.reflect.InvocationTargetException -> L32 java.lang.IllegalAccessException -> L34
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L32 java.lang.IllegalAccessException -> L34
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r3}     // Catch: java.lang.reflect.InvocationTargetException -> L32 java.lang.IllegalAccessException -> L34
            java.lang.Object r1 = r4.invoke(r2, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L32 java.lang.IllegalAccessException -> L34
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.reflect.InvocationTargetException -> L32 java.lang.IllegalAccessException -> L34
            long r1 = r1.longValue()     // Catch: java.lang.reflect.InvocationTargetException -> L32 java.lang.IllegalAccessException -> L34
            return r1
        L32:
            r1 = move-exception
            goto L36
        L34:
            r1 = move-exception
            goto L3c
        L36:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
        L3c:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
    }

    @android.annotation.SuppressLint({"BanUncheckedReflection"})
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static long m27130(long r1, int r3) {
            java.lang.reflect.Method r0 = Yue.C7005.f24496     // Catch: java.lang.reflect.InvocationTargetException -> L1a java.lang.IllegalAccessException -> L1c
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L1a java.lang.IllegalAccessException -> L1c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L1a java.lang.IllegalAccessException -> L1c
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2}     // Catch: java.lang.reflect.InvocationTargetException -> L1a java.lang.IllegalAccessException -> L1c
            r2 = 0
            java.lang.Object r1 = r0.invoke(r2, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L1a java.lang.IllegalAccessException -> L1c
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.reflect.InvocationTargetException -> L1a java.lang.IllegalAccessException -> L1c
            long r1 = r1.longValue()     // Catch: java.lang.reflect.InvocationTargetException -> L1a java.lang.IllegalAccessException -> L1c
            return r1
        L1a:
            r1 = move-exception
            goto L1e
        L1c:
            r1 = move-exception
            goto L24
        L1e:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
        L24:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
    }
}
