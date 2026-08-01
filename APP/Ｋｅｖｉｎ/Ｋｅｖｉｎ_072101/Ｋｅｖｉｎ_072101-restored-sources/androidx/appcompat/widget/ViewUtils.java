package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes2.dex */
public class ViewUtils {
    static final boolean SDK_LEVEL_SUPPORTS_AUTOSIZE = false;
    private static final java.lang.String TAG = "ViewUtils";
    private static java.lang.reflect.Method sComputeFitSystemWindowsMethod;

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 27
            r2 = 1
            if (r0 < r1) goto L9
            r0 = r2
            goto La
        L9:
            r0 = 0
        La:
            androidx.appcompat.widget.ViewUtils.SDK_LEVEL_SUPPORTS_AUTOSIZE = r0
            java.lang.Class<android.view.View> r0 = android.view.View.class
            java.lang.String r1 = "computeFitSystemWindows"
            java.lang.Class<android.graphics.Rect> r3 = android.graphics.Rect.class
            java.lang.Class<android.graphics.Rect> r4 = android.graphics.Rect.class
            java.lang.Class[] r3 = new java.lang.Class[]{r3, r4}     // Catch: java.lang.NoSuchMethodException -> L2d
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.NoSuchMethodException -> L2d
            androidx.appcompat.widget.ViewUtils.sComputeFitSystemWindowsMethod = r0     // Catch: java.lang.NoSuchMethodException -> L2d
            java.lang.reflect.Method r0 = androidx.appcompat.widget.ViewUtils.sComputeFitSystemWindowsMethod     // Catch: java.lang.NoSuchMethodException -> L2d
            boolean r0 = r0.isAccessible()     // Catch: java.lang.NoSuchMethodException -> L2d
            if (r0 != 0) goto L2c
            java.lang.reflect.Method r0 = androidx.appcompat.widget.ViewUtils.sComputeFitSystemWindowsMethod     // Catch: java.lang.NoSuchMethodException -> L2d
            r0.setAccessible(r2)     // Catch: java.lang.NoSuchMethodException -> L2d
        L2c:
            goto L35
        L2d:
            r0 = move-exception
            java.lang.String r1 = "ViewUtils"
            java.lang.String r2 = "Could not find method computeFitSystemWindows. Oh well."
            android.util.Log.d(r1, r2)
        L35:
            return
    }

    private ViewUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void computeFitSystemWindows(android.view.View r3, android.graphics.Rect r4, android.graphics.Rect r5) {
            java.lang.reflect.Method r0 = androidx.appcompat.widget.ViewUtils.sComputeFitSystemWindowsMethod
            if (r0 == 0) goto L16
            java.lang.reflect.Method r0 = androidx.appcompat.widget.ViewUtils.sComputeFitSystemWindowsMethod     // Catch: java.lang.Exception -> Le
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r5}     // Catch: java.lang.Exception -> Le
            r0.invoke(r3, r1)     // Catch: java.lang.Exception -> Le
            goto L16
        Le:
            r0 = move-exception
            java.lang.String r1 = "ViewUtils"
            java.lang.String r2 = "Could not invoke computeFitSystemWindows"
            android.util.Log.d(r1, r2, r0)
        L16:
            return
    }

    public static boolean isLayoutRtl(android.view.View r2) {
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r2)
            r1 = 1
            if (r0 != r1) goto L8
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    public static void makeOptionalFitsSystemWindows(android.view.View r6) {
            java.lang.String r0 = "Could not invoke makeOptionalFitsSystemWindows"
            java.lang.String r1 = "ViewUtils"
            java.lang.Class r2 = r6.getClass()     // Catch: java.lang.IllegalAccessException -> L22 java.lang.reflect.InvocationTargetException -> L27 java.lang.NoSuchMethodException -> L2c
            java.lang.String r3 = "makeOptionalFitsSystemWindows"
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.IllegalAccessException -> L22 java.lang.reflect.InvocationTargetException -> L27 java.lang.NoSuchMethodException -> L2c
            java.lang.reflect.Method r2 = r2.getMethod(r3, r5)     // Catch: java.lang.IllegalAccessException -> L22 java.lang.reflect.InvocationTargetException -> L27 java.lang.NoSuchMethodException -> L2c
            boolean r3 = r2.isAccessible()     // Catch: java.lang.IllegalAccessException -> L22 java.lang.reflect.InvocationTargetException -> L27 java.lang.NoSuchMethodException -> L2c
            if (r3 != 0) goto L1b
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.IllegalAccessException -> L22 java.lang.reflect.InvocationTargetException -> L27 java.lang.NoSuchMethodException -> L2c
        L1b:
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: java.lang.IllegalAccessException -> L22 java.lang.reflect.InvocationTargetException -> L27 java.lang.NoSuchMethodException -> L2c
            r2.invoke(r6, r3)     // Catch: java.lang.IllegalAccessException -> L22 java.lang.reflect.InvocationTargetException -> L27 java.lang.NoSuchMethodException -> L2c
            goto L33
        L22:
            r2 = move-exception
            android.util.Log.d(r1, r0, r2)
            goto L33
        L27:
            r2 = move-exception
            android.util.Log.d(r1, r0, r2)
            goto L32
        L2c:
            r0 = move-exception
            java.lang.String r2 = "Could not find method makeOptionalFitsSystemWindows. Oh well..."
            android.util.Log.d(r1, r2)
        L32:
        L33:
            return
    }
}
