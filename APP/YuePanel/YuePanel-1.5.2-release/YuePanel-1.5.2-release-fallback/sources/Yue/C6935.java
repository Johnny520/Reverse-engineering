package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۤۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6935 {

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.String f24181 = "ViewUtilsApi19";

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean f24182 = true;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static java.lang.reflect.Method f24183 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static boolean f24184 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static java.lang.reflect.Field f24185 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static boolean f24186 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f24187 = 12;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public float[] f24188;

    /* JADX INFO: renamed from: Yue.ۥۢۤۨۡ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(29)
    public static class C6936 {
        public C6936() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static float m26839(android.view.View r0) {
                float r0 = Yue.C6934.m26828(r0)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static void m26840(android.view.View r0, float r1) {
                Yue.C6933.m26827(r0, r1)
                return
        }
    }

    static {
            return
    }

    public C6935() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m26829(@Yue.InterfaceC4410 android.view.View r1) {
            r0 = this;
            return
    }

    @android.annotation.SuppressLint({"PrivateApi", "SoonBlockedPrivateApi"})
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final void m26830() {
            r4 = this;
            boolean r0 = Yue.C6935.f24184
            if (r0 != 0) goto L23
            r0 = 1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            java.lang.String r2 = "setFrame"
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L19
            java.lang.Class[] r3 = new java.lang.Class[]{r3, r3, r3, r3}     // Catch: java.lang.NoSuchMethodException -> L19
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.NoSuchMethodException -> L19
            Yue.C6935.f24183 = r1     // Catch: java.lang.NoSuchMethodException -> L19
            r1.setAccessible(r0)     // Catch: java.lang.NoSuchMethodException -> L19
            goto L21
        L19:
            r1 = move-exception
            java.lang.String r2 = "ViewUtilsApi19"
            java.lang.String r3 = "Failed to retrieve setFrame method"
            android.util.Log.i(r2, r3, r1)
        L21:
            Yue.C6935.f24184 = r0
        L23:
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public float mo26831(@Yue.InterfaceC4410 android.view.View r2) {
            r1 = this;
            boolean r0 = Yue.C6935.f24182
            if (r0 == 0) goto Lc
            float r2 = Yue.C6935.C6936.m26839(r2)     // Catch: java.lang.NoSuchMethodError -> L9
            return r2
        L9:
            r0 = 0
            Yue.C6935.f24182 = r0
        Lc:
            float r2 = r2.getAlpha()
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m26832(@Yue.InterfaceC4410 android.view.View r1) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void mo26833(@Yue.InterfaceC4410 android.view.View r10, @Yue.InterfaceC4544 android.graphics.Matrix r11) {
            r9 = this;
            r0 = 2
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            if (r11 == 0) goto L5f
            boolean r3 = r11.isIdentity()
            if (r3 == 0) goto Ld
            goto L5f
        Ld:
            float[] r3 = r9.f24188
            if (r3 != 0) goto L17
            r3 = 9
            float[] r3 = new float[r3]
            r9.f24188 = r3
        L17:
            r11.getValues(r3)
            r11 = 3
            r11 = r3[r11]
            float r4 = r11 * r11
            float r1 = r1 - r4
            double r4 = (double) r1
            double r4 = java.lang.Math.sqrt(r4)
            float r1 = (float) r4
            r4 = 0
            r5 = r3[r4]
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 >= 0) goto L2f
            r5 = -1
            goto L30
        L2f:
            r5 = 1
        L30:
            float r5 = (float) r5
            float r1 = r1 * r5
            double r5 = (double) r11
            double r7 = (double) r1
            double r5 = java.lang.Math.atan2(r5, r7)
            double r5 = java.lang.Math.toDegrees(r5)
            float r11 = (float) r5
            r4 = r3[r4]
            float r4 = r4 / r1
            r5 = 4
            r5 = r3[r5]
            float r5 = r5 / r1
            r0 = r3[r0]
            r1 = 5
            r1 = r3[r1]
            r10.setPivotX(r2)
            r10.setPivotY(r2)
            r10.setTranslationX(r0)
            r10.setTranslationY(r1)
            r10.setRotation(r11)
            r10.setScaleX(r4)
            r10.setScaleY(r5)
            goto L80
        L5f:
            int r11 = r10.getWidth()
            int r11 = r11 / r0
            float r11 = (float) r11
            r10.setPivotX(r11)
            int r11 = r10.getHeight()
            int r11 = r11 / r0
            float r11 = (float) r11
            r10.setPivotY(r11)
            r10.setTranslationX(r2)
            r10.setTranslationY(r2)
            r10.setScaleX(r1)
            r10.setScaleY(r1)
            r10.setRotation(r2)
        L80:
            return
    }

    @android.annotation.SuppressLint({"BanUncheckedReflection"})
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void mo26834(@Yue.InterfaceC4410 android.view.View r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            r1.m26830()
            java.lang.reflect.Method r0 = Yue.C6935.f24183
            if (r0 == 0) goto L2a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L2a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L2a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L2a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L2a
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r5, r6}     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L2a
            r0.invoke(r2, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.IllegalAccessException -> L2a
            goto L2a
        L1f:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException
            java.lang.Throwable r2 = r2.getCause()
            r3.<init>(r2)
            throw r3
        L2a:
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void mo26835(@Yue.InterfaceC4410 android.view.View r2, float r3) {
            r1 = this;
            boolean r0 = Yue.C6935.f24182
            if (r0 == 0) goto Lb
            Yue.C6935.C6936.m26840(r2, r3)     // Catch: java.lang.NoSuchMethodError -> L8
            return
        L8:
            r0 = 0
            Yue.C6935.f24182 = r0
        Lb:
            r2.setAlpha(r3)
            return
    }

    @android.annotation.SuppressLint({"SoonBlockedPrivateApi"})
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void mo26836(@Yue.InterfaceC4410 android.view.View r4, int r5) {
            r3 = this;
            boolean r0 = Yue.C6935.f24186
            if (r0 != 0) goto L1c
            r0 = 1
            java.lang.Class<android.view.View> r1 = android.view.View.class
            java.lang.String r2 = "mViewFlags"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L13
            Yue.C6935.f24185 = r1     // Catch: java.lang.NoSuchFieldException -> L13
            r1.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L13
            goto L1a
        L13:
            java.lang.String r1 = "ViewUtilsApi19"
            java.lang.String r2 = "fetchViewFlagsField: "
            android.util.Log.i(r1, r2)
        L1a:
            Yue.C6935.f24186 = r0
        L1c:
            java.lang.reflect.Field r0 = Yue.C6935.f24185
            if (r0 == 0) goto L2c
            int r0 = r0.getInt(r4)     // Catch: java.lang.IllegalAccessException -> L2c
            java.lang.reflect.Field r1 = Yue.C6935.f24185     // Catch: java.lang.IllegalAccessException -> L2c
            r0 = r0 & (-13)
            r5 = r5 | r0
            r1.setInt(r4, r5)     // Catch: java.lang.IllegalAccessException -> L2c
        L2c:
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void mo26837(@Yue.InterfaceC4410 android.view.View r3, @Yue.InterfaceC4410 android.graphics.Matrix r4) {
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L1c
            android.view.View r0 = (android.view.View) r0
            r2.mo26837(r0, r4)
            int r1 = r0.getScrollX()
            int r1 = -r1
            float r1 = (float) r1
            int r0 = r0.getScrollY()
            int r0 = -r0
            float r0 = (float) r0
            r4.preTranslate(r1, r0)
        L1c:
            int r0 = r3.getLeft()
            float r0 = (float) r0
            int r1 = r3.getTop()
            float r1 = (float) r1
            r4.preTranslate(r0, r1)
            android.graphics.Matrix r3 = r3.getMatrix()
            boolean r0 = r3.isIdentity()
            if (r0 != 0) goto L36
            r4.preConcat(r3)
        L36:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void mo26838(@Yue.InterfaceC4410 android.view.View r3, @Yue.InterfaceC4410 android.graphics.Matrix r4) {
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L1a
            android.view.View r0 = (android.view.View) r0
            r2.mo26838(r0, r4)
            int r1 = r0.getScrollX()
            float r1 = (float) r1
            int r0 = r0.getScrollY()
            float r0 = (float) r0
            r4.postTranslate(r1, r0)
        L1a:
            int r0 = r3.getLeft()
            int r0 = -r0
            float r0 = (float) r0
            int r1 = r3.getTop()
            int r1 = -r1
            float r1 = (float) r1
            r4.postTranslate(r0, r1)
            android.graphics.Matrix r3 = r3.getMatrix()
            boolean r0 = r3.isIdentity()
            if (r0 != 0) goto L41
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            boolean r3 = r3.invert(r0)
            if (r3 == 0) goto L41
            r4.postConcat(r0)
        L41:
            return
    }
}
