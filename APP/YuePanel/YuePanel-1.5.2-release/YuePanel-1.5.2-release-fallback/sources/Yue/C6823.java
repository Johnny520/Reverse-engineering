package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۤۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6823 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f23874 = "ViewConfigCompat";

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int f23875 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f23876 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f23877 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f23878 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static java.lang.reflect.Method f23879;

    /* JADX INFO: renamed from: Yue.ۥۢۤۥ۟$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(26)
    public static class C6824 {
        public C6824() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static float m26414(android.view.ViewConfiguration r0) {
                float r0 = r0.getScaledHorizontalScrollFactor()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static float m26415(android.view.ViewConfiguration r0) {
                float r0 = r0.getScaledVerticalScrollFactor()
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۥ۟$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(28)
    public static class C6825 {
        public C6825() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static int m26416(android.view.ViewConfiguration r0) {
                int r0 = r0.getScaledHoverSlop()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static boolean m26417(android.view.ViewConfiguration r0) {
                boolean r0 = r0.shouldShowMenuShortcutsWhenKeyboardPresent()
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۥ۟$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(34)
    public static class C6826 {
        public C6826() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static int m26418(@Yue.InterfaceC4410 android.view.ViewConfiguration r0, int r1, int r2, int r3) {
                int r0 = r0.getScaledMaximumFlingVelocity(r1, r2, r3)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static int m26419(@Yue.InterfaceC4410 android.view.ViewConfiguration r0, int r1, int r2, int r3) {
                int r0 = r0.getScaledMinimumFlingVelocity(r1, r2, r3)
                return r0
        }
    }

    static {
            return
    }

    public C6823() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static int m26400(android.content.res.Resources r1, int r2, Yue.InterfaceC6054<java.lang.Integer> r3, int r4) {
            r0 = -1
            if (r2 == r0) goto Le
            if (r2 == 0) goto Ld
            int r1 = r1.getDimensionPixelSize(r2)
            if (r1 >= 0) goto Lc
            goto Ld
        Lc:
            r4 = r1
        Ld:
            return r4
        Le:
            java.lang.Object r1 = r3.get()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static float m26401(android.view.ViewConfiguration r3, android.content.Context r4) {
            java.lang.reflect.Method r0 = Yue.C6823.f23879
            if (r0 == 0) goto L18
            r1 = 0
            java.lang.Object r3 = r0.invoke(r3, r1)     // Catch: java.lang.Exception -> L11
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Exception -> L11
            int r3 = r3.intValue()     // Catch: java.lang.Exception -> L11
            float r3 = (float) r3
            return r3
        L11:
            java.lang.String r3 = "ViewConfigCompat"
            java.lang.String r0 = "Could not find method getScaledScrollFactor() on ViewConfiguration"
            android.util.Log.i(r3, r0)
        L18:
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r0 = r4.getTheme()
            r1 = 16842829(0x101004d, float:2.3693774E-38)
            r2 = 1
            boolean r0 = r0.resolveAttribute(r1, r3, r2)
            if (r0 == 0) goto L38
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r3 = r3.getDimension(r4)
            return r3
        L38:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static int m26402(android.content.res.Resources r1, java.lang.String r2, java.lang.String r3) {
            java.lang.String r0 = "android"
            int r1 = r1.getIdentifier(r2, r3, r0)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static int m26403(android.content.res.Resources r1, int r2, int r3) {
            r0 = 4194304(0x400000, float:5.877472E-39)
            if (r2 != r0) goto L11
            r2 = 26
            if (r3 != r2) goto L11
            java.lang.String r2 = "config_viewMaxRotaryEncoderFlingVelocity"
            java.lang.String r3 = "dimen"
            int r1 = m26402(r1, r2, r3)
            return r1
        L11:
            r1 = -1
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static int m26404(android.content.res.Resources r1, int r2, int r3) {
            r0 = 4194304(0x400000, float:5.877472E-39)
            if (r2 != r0) goto L11
            r2 = 26
            if (r3 != r2) goto L11
            java.lang.String r2 = "config_viewMinRotaryEncoderFlingVelocity"
            java.lang.String r3 = "dimen"
            int r1 = m26402(r1, r2, r3)
            return r1
        L11:
            r1 = -1
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static float m26405(@Yue.InterfaceC4410 android.view.ViewConfiguration r0, @Yue.InterfaceC4410 android.content.Context r1) {
            float r0 = Yue.C6823.C6824.m26414(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static int m26406(@Yue.InterfaceC4410 android.view.ViewConfiguration r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            int r2 = Yue.C6823.C6825.m26416(r2)
            return r2
        Lb:
            int r2 = r2.getScaledTouchSlop()
            int r2 = r2 / 2
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static int m26407(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4410 android.view.ViewConfiguration r3, int r4, int r5, int r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            int r2 = Yue.C6823.C6826.m26418(r3, r4, r5, r6)
            return r2
        Lb:
            boolean r4 = m26412(r4, r5, r6)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != 0) goto L14
            return r0
        L14:
            android.content.res.Resources r2 = r2.getResources()
            int r4 = m26403(r2, r6, r5)
            java.util.Objects.requireNonNull(r3)
            Yue.ۥۢۤۤۨ r5 = new Yue.ۥۢۤۤۨ
            r5.<init>(r3)
            int r2 = m26400(r2, r4, r5, r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static int m26408(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4410 android.view.ViewConfiguration r3, int r4, int r5, int r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            int r2 = Yue.C6823.C6826.m26419(r3, r4, r5, r6)
            return r2
        Lb:
            boolean r4 = m26412(r4, r5, r6)
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != 0) goto L15
            return r0
        L15:
            android.content.res.Resources r2 = r2.getResources()
            int r4 = m26404(r2, r6, r5)
            java.util.Objects.requireNonNull(r3)
            Yue.ۥۢۤۥ r5 = new Yue.ۥۢۤۥ
            r5.<init>(r3)
            int r2 = m26400(r2, r4, r5, r0)
            return r2
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static int m26409(android.view.ViewConfiguration r0) {
            int r0 = r0.getScaledPagingTouchSlop()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static float m26410(@Yue.InterfaceC4410 android.view.ViewConfiguration r0, @Yue.InterfaceC4410 android.content.Context r1) {
            float r0 = Yue.C6823.C6824.m26415(r0)
            return r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static boolean m26411(android.view.ViewConfiguration r0) {
            boolean r0 = r0.hasPermanentMenuKey()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static boolean m26412(int r0, int r1, int r2) {
            android.view.InputDevice r0 = android.view.InputDevice.getDevice(r0)
            if (r0 == 0) goto Le
            android.view.InputDevice$MotionRange r0 = r0.getMotionRange(r1, r2)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static boolean m26413(@Yue.InterfaceC4410 android.view.ViewConfiguration r2, @Yue.InterfaceC4410 android.content.Context r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            boolean r2 = Yue.C6823.C6825.m26417(r2)
            return r2
        Lb:
            android.content.res.Resources r2 = r3.getResources()
            java.lang.String r3 = "config_showMenuShortcutsWhenKeyboardPresent"
            java.lang.String r0 = "bool"
            int r3 = m26402(r2, r3, r0)
            if (r3 == 0) goto L21
            boolean r2 = r2.getBoolean(r3)
            if (r2 == 0) goto L21
            r2 = 1
            goto L22
        L21:
            r2 = 0
        L22:
            return r2
    }
}
