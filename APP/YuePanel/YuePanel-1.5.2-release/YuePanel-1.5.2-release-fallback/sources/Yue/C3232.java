package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3232 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static boolean f10588 = true;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static java.lang.reflect.Field f10589;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean f10590;

    /* JADX INFO: renamed from: Yue.ۥ۠ۥۡ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(29)
    public static class C3233 {
        public C3233() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m13655(android.widget.ImageView r0, android.graphics.Matrix r1) {
                r0.animateTransform(r1)
                return
        }
    }

    static {
            return
    }

    public C3232() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static void m13652(@Yue.InterfaceC4410 android.widget.ImageView r3, @Yue.InterfaceC4544 android.graphics.Matrix r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto La
            Yue.C3232.C3233.m13655(r3, r4)
            goto L39
        La:
            if (r4 != 0) goto L36
            android.graphics.drawable.Drawable r4 = r3.getDrawable()
            if (r4 == 0) goto L39
            int r0 = r3.getWidth()
            int r1 = r3.getPaddingLeft()
            int r0 = r0 - r1
            int r1 = r3.getPaddingRight()
            int r0 = r0 - r1
            int r1 = r3.getHeight()
            int r2 = r3.getPaddingTop()
            int r1 = r1 - r2
            int r2 = r3.getPaddingBottom()
            int r1 = r1 - r2
            r2 = 0
            r4.setBounds(r2, r2, r0, r1)
            r3.invalidate()
            goto L39
        L36:
            m13654(r3, r4)
        L39:
            return
    }

    @android.annotation.SuppressLint({"SoonBlockedPrivateApi"})
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static void m13653() {
            boolean r0 = Yue.C3232.f10590
            if (r0 != 0) goto L14
            r0 = 1
            java.lang.Class<android.widget.ImageView> r1 = android.widget.ImageView.class
            java.lang.String r2 = "mDrawMatrix"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.NoSuchFieldException -> L12
            Yue.C3232.f10589 = r1     // Catch: java.lang.NoSuchFieldException -> L12
            r1.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L12
        L12:
            Yue.C3232.f10590 = r0
        L14:
            return
    }

    @Yue.InterfaceC5336(21)
    @android.annotation.SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m13654(@Yue.InterfaceC4410 android.widget.ImageView r1, @Yue.InterfaceC4544 android.graphics.Matrix r2) {
            boolean r0 = Yue.C3232.f10588
            if (r0 == 0) goto Lb
            Yue.C3232.C3233.m13655(r1, r2)     // Catch: java.lang.NoSuchMethodError -> L8
            goto Lb
        L8:
            r1 = 0
            Yue.C3232.f10588 = r1
        Lb:
            return
    }
}
