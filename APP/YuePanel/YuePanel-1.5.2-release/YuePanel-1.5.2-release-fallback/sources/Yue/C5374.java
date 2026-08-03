package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦۦۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5374 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f19973 = "ResourcesFlusher";

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static java.lang.reflect.Field f19974;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean f19975;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static java.lang.Class<?> f19976;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static boolean f19977;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static java.lang.reflect.Field f19978;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static boolean f19979;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static java.lang.reflect.Field f19980;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static boolean f19981;

    public C5374() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static void m20251(@Yue.InterfaceC4410 android.content.res.Resources r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L7
            return
        L7:
            m20254(r2)
            return
    }

    @Yue.InterfaceC5336(21)
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static void m20252(@Yue.InterfaceC4410 android.content.res.Resources r4) {
            boolean r0 = Yue.C5374.f19975
            java.lang.String r1 = "ResourcesFlusher"
            if (r0 != 0) goto L1d
            r0 = 1
            java.lang.Class<android.content.res.Resources> r2 = android.content.res.Resources.class
            java.lang.String r3 = "mDrawableCache"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.NoSuchFieldException -> L15
            Yue.C5374.f19974 = r2     // Catch: java.lang.NoSuchFieldException -> L15
            r2.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L15
            goto L1b
        L15:
            r2 = move-exception
            java.lang.String r3 = "Could not retrieve Resources#mDrawableCache field"
            android.util.Log.e(r1, r3, r2)
        L1b:
            Yue.C5374.f19975 = r0
        L1d:
            java.lang.reflect.Field r0 = Yue.C5374.f19974
            if (r0 == 0) goto L34
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.IllegalAccessException -> L28
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.IllegalAccessException -> L28
            goto L2f
        L28:
            r4 = move-exception
            java.lang.String r0 = "Could not retrieve value from Resources#mDrawableCache"
            android.util.Log.e(r1, r0, r4)
            r4 = 0
        L2f:
            if (r4 == 0) goto L34
            r4.clear()
        L34:
            return
    }

    @Yue.InterfaceC5336(23)
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m20253(@Yue.InterfaceC4410 android.content.res.Resources r4) {
            boolean r0 = Yue.C5374.f19975
            java.lang.String r1 = "ResourcesFlusher"
            if (r0 != 0) goto L1d
            r0 = 1
            java.lang.Class<android.content.res.Resources> r2 = android.content.res.Resources.class
            java.lang.String r3 = "mDrawableCache"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.NoSuchFieldException -> L15
            Yue.C5374.f19974 = r2     // Catch: java.lang.NoSuchFieldException -> L15
            r2.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L15
            goto L1b
        L15:
            r2 = move-exception
            java.lang.String r3 = "Could not retrieve Resources#mDrawableCache field"
            android.util.Log.e(r1, r3, r2)
        L1b:
            Yue.C5374.f19975 = r0
        L1d:
            java.lang.reflect.Field r0 = Yue.C5374.f19974
            if (r0 == 0) goto L2c
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.IllegalAccessException -> L26
            goto L2d
        L26:
            r4 = move-exception
            java.lang.String r0 = "Could not retrieve value from Resources#mDrawableCache"
            android.util.Log.e(r1, r0, r4)
        L2c:
            r4 = 0
        L2d:
            if (r4 != 0) goto L30
            return
        L30:
            m20255(r4)
            return
    }

    @Yue.InterfaceC5336(24)
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static void m20254(@Yue.InterfaceC4410 android.content.res.Resources r5) {
            boolean r0 = Yue.C5374.f19981
            java.lang.String r1 = "ResourcesFlusher"
            r2 = 1
            if (r0 != 0) goto L1d
            java.lang.Class<android.content.res.Resources> r0 = android.content.res.Resources.class
            java.lang.String r3 = "mResourcesImpl"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: java.lang.NoSuchFieldException -> L15
            Yue.C5374.f19980 = r0     // Catch: java.lang.NoSuchFieldException -> L15
            r0.setAccessible(r2)     // Catch: java.lang.NoSuchFieldException -> L15
            goto L1b
        L15:
            r0 = move-exception
            java.lang.String r3 = "Could not retrieve Resources#mResourcesImpl field"
            android.util.Log.e(r1, r3, r0)
        L1b:
            Yue.C5374.f19981 = r2
        L1d:
            java.lang.reflect.Field r0 = Yue.C5374.f19980
            if (r0 != 0) goto L22
            return
        L22:
            r3 = 0
            java.lang.Object r5 = r0.get(r5)     // Catch: java.lang.IllegalAccessException -> L28
            goto L2f
        L28:
            r5 = move-exception
            java.lang.String r0 = "Could not retrieve value from Resources#mResourcesImpl"
            android.util.Log.e(r1, r0, r5)
            r5 = r3
        L2f:
            if (r5 != 0) goto L32
            return
        L32:
            boolean r0 = Yue.C5374.f19975
            if (r0 != 0) goto L4e
            java.lang.Class r0 = r5.getClass()     // Catch: java.lang.NoSuchFieldException -> L46
            java.lang.String r4 = "mDrawableCache"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r4)     // Catch: java.lang.NoSuchFieldException -> L46
            Yue.C5374.f19974 = r0     // Catch: java.lang.NoSuchFieldException -> L46
            r0.setAccessible(r2)     // Catch: java.lang.NoSuchFieldException -> L46
            goto L4c
        L46:
            r0 = move-exception
            java.lang.String r4 = "Could not retrieve ResourcesImpl#mDrawableCache field"
            android.util.Log.e(r1, r4, r0)
        L4c:
            Yue.C5374.f19975 = r2
        L4e:
            java.lang.reflect.Field r0 = Yue.C5374.f19974
            if (r0 == 0) goto L5d
            java.lang.Object r3 = r0.get(r5)     // Catch: java.lang.IllegalAccessException -> L57
            goto L5d
        L57:
            r5 = move-exception
            java.lang.String r0 = "Could not retrieve value from ResourcesImpl#mDrawableCache"
            android.util.Log.e(r1, r0, r5)
        L5d:
            if (r3 == 0) goto L62
            m20255(r3)
        L62:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static void m20255(@Yue.InterfaceC4410 java.lang.Object r4) {
            boolean r0 = Yue.C5374.f19977
            r1 = 1
            java.lang.String r2 = "ResourcesFlusher"
            if (r0 != 0) goto L18
            java.lang.String r0 = "android.content.res.ThemedResourceCache"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L10
            Yue.C5374.f19976 = r0     // Catch: java.lang.ClassNotFoundException -> L10
            goto L16
        L10:
            r0 = move-exception
            java.lang.String r3 = "Could not find ThemedResourceCache class"
            android.util.Log.e(r2, r3, r0)
        L16:
            Yue.C5374.f19977 = r1
        L18:
            java.lang.Class<?> r0 = Yue.C5374.f19976
            if (r0 != 0) goto L1d
            return
        L1d:
            boolean r3 = Yue.C5374.f19979
            if (r3 != 0) goto L35
            java.lang.String r3 = "mUnthemedEntries"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: java.lang.NoSuchFieldException -> L2d
            Yue.C5374.f19978 = r0     // Catch: java.lang.NoSuchFieldException -> L2d
            r0.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L2d
            goto L33
        L2d:
            r0 = move-exception
            java.lang.String r3 = "Could not retrieve ThemedResourceCache#mUnthemedEntries field"
            android.util.Log.e(r2, r3, r0)
        L33:
            Yue.C5374.f19979 = r1
        L35:
            java.lang.reflect.Field r0 = Yue.C5374.f19978
            if (r0 != 0) goto L3a
            return
        L3a:
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.IllegalAccessException -> L41
            android.util.LongSparseArray r4 = (android.util.LongSparseArray) r4     // Catch: java.lang.IllegalAccessException -> L41
            goto L48
        L41:
            r4 = move-exception
            java.lang.String r0 = "Could not retrieve value from ThemedResourceCache#mUnthemedEntries"
            android.util.Log.e(r2, r0, r4)
            r4 = 0
        L48:
            if (r4 == 0) goto L4d
            r4.clear()
        L4d:
            return
    }
}
