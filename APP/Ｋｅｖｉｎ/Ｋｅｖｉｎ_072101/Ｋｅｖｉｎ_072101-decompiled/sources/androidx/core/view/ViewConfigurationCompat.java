package androidx.core.view;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewConfigurationCompat {
    private static final java.lang.String TAG = "ViewConfigCompat";
    private static java.lang.reflect.Method sGetScaledScrollFactorMethod;

    static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static float getScaledHorizontalScrollFactor(android.view.ViewConfiguration r1) {
                float r0 = r1.getScaledHorizontalScrollFactor()
                return r0
        }

        static float getScaledVerticalScrollFactor(android.view.ViewConfiguration r1) {
                float r0 = r1.getScaledVerticalScrollFactor()
                return r0
        }
    }

    static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getScaledHoverSlop(android.view.ViewConfiguration r1) {
                int r0 = r1.getScaledHoverSlop()
                return r0
        }

        static boolean shouldShowMenuShortcutsWhenKeyboardPresent(android.view.ViewConfiguration r1) {
                boolean r0 = r1.shouldShowMenuShortcutsWhenKeyboardPresent()
                return r0
        }
    }

    static class Api34Impl {
        private Api34Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static int getScaledMaximumFlingVelocity(android.view.ViewConfiguration r1, int r2, int r3, int r4) {
                int r0 = r1.getScaledMaximumFlingVelocity(r2, r3, r4)
                return r0
        }

        static int getScaledMinimumFlingVelocity(android.view.ViewConfiguration r1, int r2, int r3, int r4) {
                int r0 = r1.getScaledMinimumFlingVelocity(r2, r3, r4)
                return r0
        }
    }

    static {
            return
    }

    private ViewConfigurationCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static float getLegacyScrollFactor(android.view.ViewConfiguration r4, android.content.Context r5) {
            java.lang.reflect.Method r0 = androidx.core.view.ViewConfigurationCompat.sGetScaledScrollFactorMethod
            if (r0 == 0) goto L1d
            java.lang.reflect.Method r0 = androidx.core.view.ViewConfigurationCompat.sGetScaledScrollFactorMethod     // Catch: java.lang.Exception -> L15
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L15
            java.lang.Object r0 = r0.invoke(r4, r1)     // Catch: java.lang.Exception -> L15
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> L15
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L15
            float r0 = (float) r0
            return r0
        L15:
            r0 = move-exception
            java.lang.String r1 = "ViewConfigCompat"
            java.lang.String r2 = "Could not find method getScaledScrollFactor() on ViewConfiguration"
            android.util.Log.i(r1, r2)
        L1d:
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r1 = r5.getTheme()
            r2 = 16842829(0x101004d, float:2.3693774E-38)
            r3 = 1
            boolean r1 = r1.resolveAttribute(r2, r0, r3)
            if (r1 == 0) goto L3d
            android.content.res.Resources r1 = r5.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r0.getDimension(r1)
            return r1
        L3d:
            r1 = 0
            return r1
    }

    private static int getPlatformResId(android.content.res.Resources r1, java.lang.String r2, java.lang.String r3) {
            java.lang.String r0 = "android"
            int r0 = r1.getIdentifier(r2, r3, r0)
            return r0
    }

    private static int getPreApi34MaximumFlingVelocityResId(android.content.res.Resources r2, int r3, int r4) {
            r0 = 4194304(0x400000, float:5.877472E-39)
            if (r3 != r0) goto L11
            r0 = 26
            if (r4 != r0) goto L11
            java.lang.String r0 = "config_viewMaxRotaryEncoderFlingVelocity"
            java.lang.String r1 = "dimen"
            int r0 = getPlatformResId(r2, r0, r1)
            return r0
        L11:
            r0 = 0
            return r0
    }

    private static int getPreApi34MinimumFlingVelocityResId(android.content.res.Resources r2, int r3, int r4) {
            r0 = 4194304(0x400000, float:5.877472E-39)
            if (r3 != r0) goto L11
            r0 = 26
            if (r4 != r0) goto L11
            java.lang.String r0 = "config_viewMinRotaryEncoderFlingVelocity"
            java.lang.String r1 = "dimen"
            int r0 = getPlatformResId(r2, r0, r1)
            return r0
        L11:
            r0 = 0
            return r0
    }

    public static float getScaledHorizontalScrollFactor(android.view.ViewConfiguration r1, android.content.Context r2) {
            float r0 = androidx.core.view.ViewConfigurationCompat.Api26Impl.getScaledHorizontalScrollFactor(r1)
            return r0
    }

    public static int getScaledHoverSlop(android.view.ViewConfiguration r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            int r0 = androidx.core.view.ViewConfigurationCompat.Api28Impl.getScaledHoverSlop(r2)
            return r0
        Lb:
            int r0 = r2.getScaledTouchSlop()
            int r0 = r0 / 2
            return r0
    }

    public static int getScaledMaximumFlingVelocity(android.content.Context r4, android.view.ViewConfiguration r5, int r6, int r7, int r8) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            int r0 = androidx.core.view.ViewConfigurationCompat.Api34Impl.getScaledMaximumFlingVelocity(r5, r6, r7, r8)
            return r0
        Lb:
            boolean r0 = isInputDeviceInfoValid(r6, r7, r8)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L14
            return r1
        L14:
            android.content.res.Resources r0 = r4.getResources()
            int r2 = getPreApi34MaximumFlingVelocityResId(r0, r8, r7)
            if (r2 == 0) goto L27
            int r3 = r0.getDimensionPixelSize(r2)
            if (r3 >= 0) goto L25
            goto L26
        L25:
            r1 = r3
        L26:
            return r1
        L27:
            int r1 = r5.getScaledMaximumFlingVelocity()
            return r1
    }

    public static int getScaledMinimumFlingVelocity(android.content.Context r4, android.view.ViewConfiguration r5, int r6, int r7, int r8) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            int r0 = androidx.core.view.ViewConfigurationCompat.Api34Impl.getScaledMinimumFlingVelocity(r5, r6, r7, r8)
            return r0
        Lb:
            boolean r0 = isInputDeviceInfoValid(r6, r7, r8)
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != 0) goto L15
            return r1
        L15:
            android.content.res.Resources r0 = r4.getResources()
            int r2 = getPreApi34MinimumFlingVelocityResId(r0, r8, r7)
            if (r2 == 0) goto L28
            int r3 = r0.getDimensionPixelSize(r2)
            if (r3 >= 0) goto L26
            goto L27
        L26:
            r1 = r3
        L27:
            return r1
        L28:
            int r1 = r5.getScaledMinimumFlingVelocity()
            return r1
    }

    @java.lang.Deprecated
    public static int getScaledPagingTouchSlop(android.view.ViewConfiguration r1) {
            int r0 = r1.getScaledPagingTouchSlop()
            return r0
    }

    public static float getScaledVerticalScrollFactor(android.view.ViewConfiguration r1, android.content.Context r2) {
            float r0 = androidx.core.view.ViewConfigurationCompat.Api26Impl.getScaledVerticalScrollFactor(r1)
            return r0
    }

    @java.lang.Deprecated
    public static boolean hasPermanentMenuKey(android.view.ViewConfiguration r1) {
            boolean r0 = r1.hasPermanentMenuKey()
            return r0
    }

    private static boolean isInputDeviceInfoValid(int r2, int r3, int r4) {
            android.view.InputDevice r0 = android.view.InputDevice.getDevice(r2)
            if (r0 == 0) goto Le
            android.view.InputDevice$MotionRange r1 = r0.getMotionRange(r3, r4)
            if (r1 == 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    public static boolean shouldShowMenuShortcutsWhenKeyboardPresent(android.view.ViewConfiguration r3, android.content.Context r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            boolean r0 = androidx.core.view.ViewConfigurationCompat.Api28Impl.shouldShowMenuShortcutsWhenKeyboardPresent(r3)
            return r0
        Lb:
            android.content.res.Resources r0 = r4.getResources()
            java.lang.String r1 = "config_showMenuShortcutsWhenKeyboardPresent"
            java.lang.String r2 = "bool"
            int r1 = getPlatformResId(r0, r1, r2)
            if (r1 == 0) goto L22
            boolean r2 = r0.getBoolean(r1)
            if (r2 == 0) goto L22
            r2 = 1
            goto L23
        L22:
            r2 = 0
        L23:
            return r2
    }
}
