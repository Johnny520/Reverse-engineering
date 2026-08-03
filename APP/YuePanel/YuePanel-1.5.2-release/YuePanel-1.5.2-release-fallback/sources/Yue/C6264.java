package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۡۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public class C6264 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.content.Context f22321;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final android.content.res.TypedArray f22322;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public android.util.TypedValue f22323;

    /* JADX INFO: renamed from: Yue.ۥۢۡۥۦ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(21)
    public static class C6265 {
        public C6265() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static int m23372(android.content.res.TypedArray r0) {
                int r0 = r0.getChangingConfigurations()
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static int m23373(android.content.res.TypedArray r0, int r1) {
                int r0 = r0.getType(r1)
                return r0
        }
    }

    public C6264(android.content.Context r1, android.content.res.TypedArray r2) {
            r0 = this;
            r0.<init>()
            r0.f22321 = r1
            r0.f22322 = r2
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static Yue.C6264 m23337(android.content.Context r1, int r2, int[] r3) {
            Yue.ۥۢۡۥۦ r0 = new Yue.ۥۢۡۥۦ
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r2, r3)
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static Yue.C6264 m23338(android.content.Context r1, android.util.AttributeSet r2, int[] r3) {
            Yue.ۥۢۡۥۦ r0 = new Yue.ۥۢۡۥۦ
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r2, r3)
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static Yue.C6264 m23339(android.content.Context r1, android.util.AttributeSet r2, int[] r3, int r4, int r5) {
            Yue.ۥۢۡۥۦ r0 = new Yue.ۥۢۡۥۦ
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r2, r3, r4, r5)
            r0.<init>(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public boolean m23340(int r2, boolean r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f22322
            boolean r2 = r0.getBoolean(r2, r3)
            return r2
    }

    @Yue.InterfaceC5336(21)
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int m23341() {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f22322
            int r0 = Yue.C6264.C6265.m23372(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int m23342(int r2, int r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f22322
            int r2 = r0.getColor(r2, r3)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public android.content.res.ColorStateList m23343(int r3) {
            r2 = this;
            android.content.res.TypedArray r0 = r2.f22322
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L1a
            android.content.res.TypedArray r0 = r2.f22322
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L1a
            android.content.Context r1 = r2.f22321
            android.content.res.ColorStateList r0 = Yue.C0479.m1736(r1, r0)
            if (r0 == 0) goto L1a
            return r0
        L1a:
            android.content.res.TypedArray r0 = r2.f22322
            android.content.res.ColorStateList r3 = r0.getColorStateList(r3)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public float m23344(int r2, float r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f22322
            float r2 = r0.getDimension(r2, r3)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m23345(int r2, int r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f22322
            int r2 = r0.getDimensionPixelOffset(r2, r3)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int m23346(int r2, int r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f22322
            int r2 = r0.getDimensionPixelSize(r2, r3)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public android.graphics.drawable.Drawable m23347(int r3) {
            r2 = this;
            android.content.res.TypedArray r0 = r2.f22322
            boolean r0 = r0.hasValue(r3)
            if (r0 == 0) goto L18
            android.content.res.TypedArray r0 = r2.f22322
            r1 = 0
            int r0 = r0.getResourceId(r3, r1)
            if (r0 == 0) goto L18
            android.content.Context r3 = r2.f22321
            android.graphics.drawable.Drawable r3 = Yue.C0479.m1737(r3, r0)
            return r3
        L18:
            android.content.res.TypedArray r0 = r2.f22322
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r3)
            return r3
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public android.graphics.drawable.Drawable m23348(int r4) {
            r3 = this;
            android.content.res.TypedArray r0 = r3.f22322
            boolean r0 = r0.hasValue(r4)
            if (r0 == 0) goto L1d
            android.content.res.TypedArray r0 = r3.f22322
            r1 = 0
            int r4 = r0.getResourceId(r4, r1)
            if (r4 == 0) goto L1d
            Yue.ۥۣ۟ۡۡ r0 = Yue.C0456.m1666()
            android.content.Context r1 = r3.f22321
            r2 = 1
            android.graphics.drawable.Drawable r4 = r0.m1671(r1, r4, r2)
            return r4
        L1d:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public float m23349(int r2, float r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f22322
            float r2 = r0.getFloat(r2, r3)
            return r2
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public android.graphics.Typeface m23350(@Yue.InterfaceC6031 int r3, int r4, @Yue.InterfaceC4544 Yue.C5362.AbstractC5368 r5) {
            r2 = this;
            android.content.res.TypedArray r0 = r2.f22322
            r1 = 0
            int r3 = r0.getResourceId(r3, r1)
            if (r3 != 0) goto Lb
            r3 = 0
            return r3
        Lb:
            android.util.TypedValue r0 = r2.f22323
            if (r0 != 0) goto L16
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r2.f22323 = r0
        L16:
            android.content.Context r0 = r2.f22321
            android.util.TypedValue r1 = r2.f22323
            android.graphics.Typeface r3 = Yue.C5362.m20232(r0, r3, r1, r4, r5)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public float m23351(int r2, int r3, int r4, float r5) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f22322
            float r2 = r0.getFraction(r2, r3, r4, r5)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public int m23352(int r2) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f22322
            int r2 = r0.getIndex(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public int m23353() {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f22322
            int r0 = r0.getIndexCount()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public int m23354(int r2, int r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f22322
            int r2 = r0.getInt(r2, r3)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public int m23355(int r2, int r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f22322
            int r2 = r0.getInteger(r2, r3)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public int m23356(int r2, int r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f22322
            int r2 = r0.getLayoutDimension(r2, r3)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public int m23357(int r2, java.lang.String r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f22322
            int r2 = r0.getLayoutDimension(r2, r3)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public java.lang.String m23358(int r2) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f22322
            java.lang.String r2 = r0.getNonResourceString(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public java.lang.String m23359() {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f22322
            java.lang.String r0 = r0.getPositionDescription()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int m23360(int r2, int r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f22322
            int r2 = r0.getResourceId(r2, r3)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public android.content.res.Resources m23361() {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f22322
            android.content.res.Resources r0 = r0.getResources()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public java.lang.String m23362(int r2) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f22322
            java.lang.String r2 = r0.getString(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public java.lang.CharSequence m23363(int r2) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f22322
            java.lang.CharSequence r2 = r0.getText(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public java.lang.CharSequence[] m23364(int r2) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f22322
            java.lang.CharSequence[] r2 = r0.getTextArray(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public int m23365(int r2) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f22322
            int r2 = Yue.C6264.C6265.m23373(r0, r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean m23366(int r2, android.util.TypedValue r3) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f22322
            boolean r2 = r0.getValue(r2, r3)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public android.content.res.TypedArray m23367() {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f22322
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public boolean m23368(int r2) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f22322
            boolean r2 = r0.hasValue(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public int m23369() {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f22322
            int r0 = r0.length()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public android.util.TypedValue m23370(int r2) {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f22322
            android.util.TypedValue r2 = r0.peekValue(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public void m23371() {
            r1 = this;
            android.content.res.TypedArray r0 = r1.f22322
            r0.recycle()
            return
    }
}
