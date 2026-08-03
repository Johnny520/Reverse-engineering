package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡۡۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
public class C6173 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f22137 = "ThemeUtils";

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final java.lang.ThreadLocal<android.util.TypedValue> f22138 = null;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int[] f22139 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int[] f22140 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int[] f22141 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int[] f22142 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int[] f22143 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int[] f22144 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int[] f22145 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int[] f22146 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int[] f22147 = null;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            Yue.C6173.f22138 = r0
            r0 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            int[] r0 = new int[]{r0}
            Yue.C6173.f22139 = r0
            r0 = 16842908(0x101009c, float:2.3693995E-38)
            int[] r0 = new int[]{r0}
            Yue.C6173.f22140 = r0
            r0 = 16843518(0x10102fe, float:2.3695705E-38)
            int[] r0 = new int[]{r0}
            Yue.C6173.f22141 = r0
            r0 = 16842919(0x10100a7, float:2.3694026E-38)
            int[] r0 = new int[]{r0}
            Yue.C6173.f22142 = r0
            r0 = 16842912(0x10100a0, float:2.3694006E-38)
            int[] r0 = new int[]{r0}
            Yue.C6173.f22143 = r0
            r0 = 16842913(0x10100a1, float:2.369401E-38)
            int[] r0 = new int[]{r0}
            Yue.C6173.f22144 = r0
            r0 = -16842919(0xfffffffffefeff59, float:-1.6947488E38)
            r1 = -16842908(0xfffffffffefeff64, float:-1.6947499E38)
            int[] r0 = new int[]{r0, r1}
            Yue.C6173.f22145 = r0
            r0 = 0
            int[] r0 = new int[r0]
            Yue.C6173.f22146 = r0
            r0 = 1
            int[] r0 = new int[r0]
            Yue.C6173.f22147 = r0
            return
    }

    public C6173() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static void m23109(@Yue.InterfaceC4410 android.view.View r3, @Yue.InterfaceC4410 android.content.Context r4) {
            int[] r0 = Yue.C5058.C5071.f17685
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r0)
            int r0 = Yue.C5058.C5071.f17803     // Catch: java.lang.Throwable -> L2e
            boolean r0 = r4.hasValue(r0)     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto L30
            java.lang.String r0 = "ThemeUtils"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r1.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "View "
            r1.append(r2)     // Catch: java.lang.Throwable -> L2e
            java.lang.Class r3 = r3.getClass()     // Catch: java.lang.Throwable -> L2e
            r1.append(r3)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant)."
            r1.append(r3)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = r1.toString()     // Catch: java.lang.Throwable -> L2e
            android.util.Log.e(r0, r3)     // Catch: java.lang.Throwable -> L2e
            goto L30
        L2e:
            r3 = move-exception
            goto L34
        L30:
            r4.recycle()
            return
        L34:
            r4.recycle()
            throw r3
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static android.content.res.ColorStateList m23110(int r4, int r5) {
            r0 = 2
            int[][] r1 = new int[r0][]
            int[] r0 = new int[r0]
            int[] r2 = Yue.C6173.f22139
            r3 = 0
            r1[r3] = r2
            r0[r3] = r5
            int[] r5 = Yue.C6173.f22146
            r2 = 1
            r1[r2] = r5
            r0[r2] = r4
            android.content.res.ColorStateList r4 = new android.content.res.ColorStateList
            r4.<init>(r1, r0)
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static int m23111(@Yue.InterfaceC4410 android.content.Context r4, int r5) {
            android.content.res.ColorStateList r0 = m23114(r4, r5)
            if (r0 == 0) goto L17
            boolean r1 = r0.isStateful()
            if (r1 == 0) goto L17
            int[] r4 = Yue.C6173.f22139
            int r5 = r0.getDefaultColor()
            int r4 = r0.getColorForState(r4, r5)
            return r4
        L17:
            android.util.TypedValue r0 = m23115()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r2 = 16842803(0x1010033, float:2.36937E-38)
            r3 = 1
            r1.resolveAttribute(r2, r0, r3)
            float r0 = r0.getFloat()
            int r4 = m23113(r4, r5, r0)
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static int m23112(@Yue.InterfaceC4410 android.content.Context r2, int r3) {
            int[] r0 = Yue.C6173.f22147
            r1 = 0
            r0[r1] = r3
            r3 = 0
            Yue.ۥۢۡۥۦ r2 = Yue.C6264.m23338(r2, r3, r0)
            int r3 = r2.m23342(r1, r1)     // Catch: java.lang.Throwable -> L12
            r2.m23371()
            return r3
        L12:
            r3 = move-exception
            r2.m23371()
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static int m23113(@Yue.InterfaceC4410 android.content.Context r0, int r1, float r2) {
            int r0 = m23112(r0, r1)
            int r1 = android.graphics.Color.alpha(r0)
            float r1 = (float) r1
            float r1 = r1 * r2
            int r1 = java.lang.Math.round(r1)
            int r0 = Yue.C1248.m6668(r0, r1)
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static android.content.res.ColorStateList m23114(@Yue.InterfaceC4410 android.content.Context r2, int r3) {
            int[] r0 = Yue.C6173.f22147
            r1 = 0
            r0[r1] = r3
            r3 = 0
            Yue.ۥۢۡۥۦ r2 = Yue.C6264.m23338(r2, r3, r0)
            android.content.res.ColorStateList r3 = r2.m23343(r1)     // Catch: java.lang.Throwable -> L12
            r2.m23371()
            return r3
        L12:
            r3 = move-exception
            r2.m23371()
            throw r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static android.util.TypedValue m23115() {
            java.lang.ThreadLocal<android.util.TypedValue> r0 = Yue.C6173.f22138
            java.lang.Object r1 = r0.get()
            android.util.TypedValue r1 = (android.util.TypedValue) r1
            if (r1 != 0) goto L12
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            r0.set(r1)
        L12:
            return r1
    }
}
