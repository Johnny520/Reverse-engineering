package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۤۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public class C6928 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f24173 = "ViewUtils";

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static boolean f24174;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static java.lang.reflect.Method f24175;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    @Yue.InterfaceC1123(api = 27)
    public static final boolean f24176 = false;

    /* JADX INFO: renamed from: Yue.ۥۢۤۧۨ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(29)
    public static class C6929 {
        public C6929() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m26813(@Yue.InterfaceC4410 android.view.View r2, @Yue.InterfaceC4410 android.graphics.Rect r3, @Yue.InterfaceC4410 android.graphics.Rect r4) {
                android.view.WindowInsets$Builder r0 = new android.view.WindowInsets$Builder
                r0.<init>()
                android.graphics.Insets r1 = android.graphics.Insets.of(r3)
                android.view.WindowInsets$Builder r0 = r0.setSystemWindowInsets(r1)
                android.view.WindowInsets r0 = r0.build()
                android.view.WindowInsets r2 = r2.computeSystemWindowInsets(r0, r4)
                android.graphics.Insets r2 = r2.getSystemWindowInsets()
                int r4 = r2.left
                int r0 = r2.top
                int r1 = r2.right
                int r2 = r2.bottom
                r3.set(r4, r0, r1, r2)
                return
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            Yue.C6928.f24176 = r0
            return
    }

    public C6928() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static void m26810(@Yue.InterfaceC4410 android.view.View r5, @Yue.InterfaceC4410 android.graphics.Rect r6, @Yue.InterfaceC4410 android.graphics.Rect r7) {
            java.lang.Class<android.graphics.Rect> r0 = android.graphics.Rect.class
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto Lc
            Yue.C6928.C6929.m26813(r5, r6, r7)
            goto L46
        Lc:
            boolean r1 = Yue.C6928.f24174
            java.lang.String r2 = "ViewUtils"
            if (r1 != 0) goto L34
            r1 = 1
            Yue.C6928.f24174 = r1
            java.lang.Class<android.view.View> r3 = android.view.View.class
            java.lang.String r4 = "computeFitSystemWindows"
            java.lang.Class[] r0 = new java.lang.Class[]{r0, r0}     // Catch: java.lang.NoSuchMethodException -> L2f
            java.lang.reflect.Method r0 = r3.getDeclaredMethod(r4, r0)     // Catch: java.lang.NoSuchMethodException -> L2f
            Yue.C6928.f24175 = r0     // Catch: java.lang.NoSuchMethodException -> L2f
            boolean r0 = r0.isAccessible()     // Catch: java.lang.NoSuchMethodException -> L2f
            if (r0 != 0) goto L34
            java.lang.reflect.Method r0 = Yue.C6928.f24175     // Catch: java.lang.NoSuchMethodException -> L2f
            r0.setAccessible(r1)     // Catch: java.lang.NoSuchMethodException -> L2f
            goto L34
        L2f:
            java.lang.String r0 = "Could not find method computeFitSystemWindows. Oh well."
            android.util.Log.d(r2, r0)
        L34:
            java.lang.reflect.Method r0 = Yue.C6928.f24175
            if (r0 == 0) goto L46
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r7}     // Catch: java.lang.Exception -> L40
            r0.invoke(r5, r6)     // Catch: java.lang.Exception -> L40
            goto L46
        L40:
            r5 = move-exception
            java.lang.String r6 = "Could not invoke computeFitSystemWindows"
            android.util.Log.d(r2, r6, r5)
        L46:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static boolean m26811(android.view.View r1) {
            int r1 = r1.getLayoutDirection()
            r0 = 1
            if (r1 != r0) goto L8
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @android.annotation.SuppressLint({"BanUncheckedReflection"})
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m26812(android.view.View r5) {
            java.lang.String r0 = "Could not invoke makeOptionalFitsSystemWindows"
            java.lang.String r1 = "ViewUtils"
            java.lang.Class r2 = r5.getClass()     // Catch: java.lang.IllegalAccessException -> L1a java.lang.reflect.InvocationTargetException -> L1c java.lang.NoSuchMethodException -> L2a
            java.lang.String r3 = "makeOptionalFitsSystemWindows"
            r4 = 0
            java.lang.reflect.Method r2 = r2.getMethod(r3, r4)     // Catch: java.lang.IllegalAccessException -> L1a java.lang.reflect.InvocationTargetException -> L1c java.lang.NoSuchMethodException -> L2a
            boolean r3 = r2.isAccessible()     // Catch: java.lang.IllegalAccessException -> L1a java.lang.reflect.InvocationTargetException -> L1c java.lang.NoSuchMethodException -> L2a
            if (r3 != 0) goto L1e
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.IllegalAccessException -> L1a java.lang.reflect.InvocationTargetException -> L1c java.lang.NoSuchMethodException -> L2a
            goto L1e
        L1a:
            r5 = move-exception
            goto L22
        L1c:
            r5 = move-exception
            goto L26
        L1e:
            r2.invoke(r5, r4)     // Catch: java.lang.IllegalAccessException -> L1a java.lang.reflect.InvocationTargetException -> L1c java.lang.NoSuchMethodException -> L2a
            goto L2f
        L22:
            android.util.Log.d(r1, r0, r5)
            goto L2f
        L26:
            android.util.Log.d(r1, r0, r5)
            goto L2f
        L2a:
            java.lang.String r5 = "Could not find method makeOptionalFitsSystemWindows. Oh well..."
            android.util.Log.d(r1, r5)
        L2f:
            return
    }
}
