package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۥۢۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
public final class C7004 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f24485 = "WeightTypeface";

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.String f24486 = "native_instance";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.lang.reflect.Field f24487 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC2947("sWeightCacheLock")
    public static final Yue.C3827<android.util.SparseArray<android.graphics.Typeface>> f24488 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.lang.Object f24489 = null;

    static {
            java.lang.Class<android.graphics.Typeface> r0 = android.graphics.Typeface.class
            java.lang.String r1 = "native_instance"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.Exception -> Ld
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> Ld
            goto L1c
        Ld:
            r0 = move-exception
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "WeightTypeface"
            android.util.Log.e(r2, r1, r0)
            r0 = 0
        L1c:
            Yue.C7004.f24487 = r0
            Yue.ۥۣ۠ۨۢ r0 = new Yue.ۥۣ۠ۨۢ
            r1 = 3
            r0.<init>(r1)
            Yue.C7004.f24488 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            Yue.C7004.f24489 = r0
            return
    }

    public C7004() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static android.graphics.Typeface m27120(@Yue.InterfaceC4410 Yue.C6489 r7, @Yue.InterfaceC4410 android.content.Context r8, @Yue.InterfaceC4410 android.graphics.Typeface r9, int r10, boolean r11) {
            boolean r0 = m27123()
            if (r0 != 0) goto L8
            r7 = 0
            return r7
        L8:
            int r0 = r10 << 1
            r0 = r0 | r11
            java.lang.Object r1 = Yue.C7004.f24489
            monitor-enter(r1)
            long r2 = m27122(r9)     // Catch: java.lang.Throwable -> L26
            Yue.ۥۣ۠ۨۢ<android.util.SparseArray<android.graphics.Typeface>> r4 = Yue.C7004.f24488     // Catch: java.lang.Throwable -> L26
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
            goto L41
        L28:
            java.lang.Object r2 = r5.get(r0)     // Catch: java.lang.Throwable -> L26
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L32
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L26
            return r2
        L32:
            android.graphics.Typeface r7 = m27121(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L26
            if (r7 != 0) goto L3c
            android.graphics.Typeface r7 = m27124(r9, r10, r11)     // Catch: java.lang.Throwable -> L26
        L3c:
            r5.put(r0, r7)     // Catch: java.lang.Throwable -> L26
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L26
            return r7
        L41:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L26
            throw r7
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static android.graphics.Typeface m27121(@Yue.InterfaceC4410 Yue.C6489 r6, @Yue.InterfaceC4410 android.content.Context r7, @Yue.InterfaceC4410 android.graphics.Typeface r8, int r9, boolean r10) {
            Yue.ۥ۠ۢۦۡ$ۥ۟۟۟ r2 = r6.m23966(r8)
            if (r2 != 0) goto L8
            r6 = 0
            return r6
        L8:
            android.content.res.Resources r3 = r7.getResources()
            r0 = r6
            r1 = r7
            r4 = r9
            r5 = r10
            android.graphics.Typeface r6 = r0.m23963(r1, r2, r3, r4, r5)
            return r6
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static long m27122(@Yue.InterfaceC4410 android.graphics.Typeface r2) {
            java.lang.reflect.Field r0 = Yue.C7004.f24487     // Catch: java.lang.IllegalAccessException -> Ld
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.IllegalAccessException -> Ld
            java.lang.Number r2 = (java.lang.Number) r2     // Catch: java.lang.IllegalAccessException -> Ld
            long r0 = r2.longValue()     // Catch: java.lang.IllegalAccessException -> Ld
            return r0
        Ld:
            r2 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r2)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static boolean m27123() {
            java.lang.reflect.Field r0 = Yue.C7004.f24487
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static android.graphics.Typeface m27124(android.graphics.Typeface r3, int r4, boolean r5) {
            r0 = 600(0x258, float:8.41E-43)
            r1 = 0
            r2 = 1
            if (r4 < r0) goto L8
            r4 = r2
            goto L9
        L8:
            r4 = r1
        L9:
            if (r4 != 0) goto Le
            if (r5 != 0) goto Le
            goto L17
        Le:
            if (r4 != 0) goto L12
            r1 = 2
            goto L17
        L12:
            if (r5 != 0) goto L16
            r1 = r2
            goto L17
        L16:
            r1 = 3
        L17:
            android.graphics.Typeface r3 = android.graphics.Typeface.create(r3, r1)
            return r3
    }
}
