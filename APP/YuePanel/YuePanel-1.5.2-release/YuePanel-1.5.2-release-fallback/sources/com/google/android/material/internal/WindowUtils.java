package com.google.android.material.internal;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
public class WindowUtils {
    private static final java.lang.String TAG = "WindowUtils";

    public static class Api14Impl {
        private Api14Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4410
        public static android.graphics.Rect getCurrentWindowBounds(@Yue.InterfaceC4410 android.view.WindowManager r3) {
                android.view.Display r3 = r3.getDefaultDisplay()
                android.graphics.Point r0 = getRealSizeForDisplay(r3)
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                int r2 = r0.x
                if (r2 == 0) goto L1b
                int r0 = r0.y
                if (r0 != 0) goto L16
                goto L1b
            L16:
                r1.right = r2
                r1.bottom = r0
                goto L1e
            L1b:
                r3.getRectSize(r1)
            L1e:
                return r1
        }

        private static android.graphics.Point getRealSizeForDisplay(android.view.Display r4) {
                android.graphics.Point r0 = new android.graphics.Point
                r0.<init>()
                java.lang.Class<android.view.Display> r1 = android.view.Display.class
                java.lang.String r2 = "getRealSize"
                java.lang.Class<android.graphics.Point> r3 = android.graphics.Point.class
                java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L21 java.lang.NoSuchMethodException -> L23
                java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L21 java.lang.NoSuchMethodException -> L23
                r2 = 1
                r1.setAccessible(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L21 java.lang.NoSuchMethodException -> L23
                java.lang.Object[] r2 = new java.lang.Object[]{r0}     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L21 java.lang.NoSuchMethodException -> L23
                r1.invoke(r4, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L21 java.lang.NoSuchMethodException -> L23
                goto L3c
            L1f:
                r4 = move-exception
                goto L25
            L21:
                r4 = move-exception
                goto L2d
            L23:
                r4 = move-exception
                goto L35
            L25:
                java.lang.String r1 = com.google.android.material.internal.WindowUtils.access$000()
                android.util.Log.w(r1, r4)
                goto L3c
            L2d:
                java.lang.String r1 = com.google.android.material.internal.WindowUtils.access$000()
                android.util.Log.w(r1, r4)
                goto L3c
            L35:
                java.lang.String r1 = com.google.android.material.internal.WindowUtils.access$000()
                android.util.Log.w(r1, r4)
            L3c:
                return r0
        }
    }

    @Yue.InterfaceC5336(api = 17)
    public static class Api17Impl {
        private Api17Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4410
        public static android.graphics.Rect getCurrentWindowBounds(@Yue.InterfaceC4410 android.view.WindowManager r2) {
                android.view.Display r2 = r2.getDefaultDisplay()
                android.graphics.Point r0 = new android.graphics.Point
                r0.<init>()
                r2.getRealSize(r0)
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                int r1 = r0.x
                r2.right = r1
                int r0 = r0.y
                r2.bottom = r0
                return r2
        }
    }

    @Yue.InterfaceC5336(api = 30)
    public static class Api30Impl {
        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC4410
        public static android.graphics.Rect getCurrentWindowBounds(@Yue.InterfaceC4410 android.view.WindowManager r0) {
                android.view.WindowMetrics r0 = Yue.C7126.m27445(r0)
                android.graphics.Rect r0 = Yue.C7127.m27446(r0)
                return r0
        }
    }

    static {
            return
    }

    private WindowUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.lang.String access$000() {
            java.lang.String r0 = com.google.android.material.internal.WindowUtils.TAG
            return r0
    }

    @Yue.InterfaceC4410
    public static android.graphics.Rect getCurrentWindowBounds(@Yue.InterfaceC4410 android.content.Context r2) {
            java.lang.String r0 = "window"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L13
            android.graphics.Rect r2 = com.google.android.material.internal.WindowUtils.Api30Impl.getCurrentWindowBounds(r2)
            return r2
        L13:
            android.graphics.Rect r2 = com.google.android.material.internal.WindowUtils.Api17Impl.getCurrentWindowBounds(r2)
            return r2
    }
}
