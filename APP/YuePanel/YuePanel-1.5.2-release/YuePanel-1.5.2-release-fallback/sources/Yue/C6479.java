package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۢۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6479 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final float f22787 = 0.013888889f;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final float f22788 = 0.03937008f;

    /* JADX INFO: renamed from: Yue.ۥۣۢۢۧ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(34)
    public static class C6480 {
        public C6480() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static float m23914(int r0, float r1, android.util.DisplayMetrics r2) {
                float r0 = android.util.TypedValue.deriveDimension(r0, r1, r2)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۢۧ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InterfaceC6481 {
    }

    public C6479() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static float m23908(int r2, float r3, @Yue.InterfaceC4410 android.util.DisplayMetrics r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            float r2 = Yue.C6479.C6480.m23914(r2, r3, r4)
            return r2
        Lb:
            if (r2 == 0) goto L67
            r0 = 1
            r1 = 0
            if (r2 == r0) goto L5f
            r0 = 2
            if (r2 == r0) goto L56
            r0 = 3
            if (r2 == r0) goto L4a
            r0 = 4
            if (r2 == r0) goto L41
            r0 = 5
            if (r2 != r0) goto L2a
            float r2 = r4.xdpi
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 != 0) goto L24
            return r1
        L24:
            float r3 = r3 / r2
            r2 = 1025589893(0x3d214285, float:0.03937008)
        L28:
            float r3 = r3 / r2
            return r3
        L2a:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Invalid unitToConvertTo "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
        L41:
            float r2 = r4.xdpi
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 != 0) goto L48
            return r1
        L48:
            float r3 = r3 / r2
            return r3
        L4a:
            float r2 = r4.xdpi
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 != 0) goto L51
            return r1
        L51:
            float r3 = r3 / r2
            r2 = 1013157433(0x3c638e39, float:0.013888889)
            goto L28
        L56:
            float r2 = r4.scaledDensity
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 != 0) goto L5d
            return r1
        L5d:
            float r3 = r3 / r2
            return r3
        L5f:
            float r2 = r4.density
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 != 0) goto L66
            return r1
        L66:
            float r3 = r3 / r2
        L67:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static float m23909(float r1, @Yue.InterfaceC4410 android.util.DisplayMetrics r2) {
            r0 = 1
            float r1 = android.util.TypedValue.applyDimension(r0, r1, r2)
            return r1
    }

    @android.annotation.SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static int m23910(int r0) {
            r0 = r0 & 15
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static float m23911(float r1, @Yue.InterfaceC4410 android.util.DisplayMetrics r2) {
            r0 = 1
            float r1 = m23908(r0, r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static float m23912(float r1, @Yue.InterfaceC4410 android.util.DisplayMetrics r2) {
            r0 = 2
            float r1 = m23908(r0, r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static float m23913(float r1, @Yue.InterfaceC4410 android.util.DisplayMetrics r2) {
            r0 = 2
            float r1 = android.util.TypedValue.applyDimension(r0, r1, r2)
            return r1
    }
}
