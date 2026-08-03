package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢۢۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public class C6478 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f22786 = "http://schemas.android.com/apk/res/android";

    public C6478() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static int m23888(@Yue.InterfaceC4410 android.content.Context r2, int r3, int r4) {
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r2 = r2.getTheme()
            r1 = 1
            r2.resolveAttribute(r3, r0, r1)
            int r2 = r0.resourceId
            if (r2 == 0) goto L12
            return r3
        L12:
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static boolean m23889(@Yue.InterfaceC4410 android.content.res.TypedArray r0, @Yue.InterfaceC6031 int r1, @Yue.InterfaceC6031 int r2, boolean r3) {
            boolean r2 = r0.getBoolean(r2, r3)
            boolean r0 = r0.getBoolean(r1, r2)
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static android.graphics.drawable.Drawable m23890(@Yue.InterfaceC4410 android.content.res.TypedArray r0, @Yue.InterfaceC6031 int r1, @Yue.InterfaceC6031 int r2) {
            android.graphics.drawable.Drawable r1 = r0.getDrawable(r1)
            if (r1 != 0) goto La
            android.graphics.drawable.Drawable r1 = r0.getDrawable(r2)
        La:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static int m23891(@Yue.InterfaceC4410 android.content.res.TypedArray r0, @Yue.InterfaceC6031 int r1, @Yue.InterfaceC6031 int r2, int r3) {
            int r2 = r0.getInt(r2, r3)
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static boolean m23892(@Yue.InterfaceC4410 android.content.res.TypedArray r0, @Yue.InterfaceC4410 org.xmlpull.v1.XmlPullParser r1, @Yue.InterfaceC4410 java.lang.String r2, @Yue.InterfaceC6031 int r3, boolean r4) {
            boolean r1 = m23905(r1, r2)
            if (r1 != 0) goto L7
            return r4
        L7:
            boolean r0 = r0.getBoolean(r3, r4)
            return r0
    }

    @Yue.InterfaceC1230
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static int m23893(@Yue.InterfaceC4410 android.content.res.TypedArray r0, @Yue.InterfaceC4410 org.xmlpull.v1.XmlPullParser r1, @Yue.InterfaceC4410 java.lang.String r2, @Yue.InterfaceC6031 int r3, @Yue.InterfaceC1230 int r4) {
            boolean r1 = m23905(r1, r2)
            if (r1 != 0) goto L7
            return r4
        L7:
            int r0 = r0.getColor(r3, r4)
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static android.content.res.ColorStateList m23894(@Yue.InterfaceC4410 android.content.res.TypedArray r1, @Yue.InterfaceC4410 org.xmlpull.v1.XmlPullParser r2, @Yue.InterfaceC4544 android.content.res.Resources.Theme r3, @Yue.InterfaceC4410 java.lang.String r4, @Yue.InterfaceC6031 int r5) {
            boolean r2 = m23905(r2, r4)
            if (r2 == 0) goto L4d
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r1.getValue(r5, r2)
            int r4 = r2.type
            r0 = 2
            if (r4 == r0) goto L2e
            r0 = 28
            if (r4 < r0) goto L20
            r0 = 31
            if (r4 > r0) goto L20
            android.content.res.ColorStateList r1 = m23895(r2)
            return r1
        L20:
            android.content.res.Resources r2 = r1.getResources()
            r4 = 0
            int r1 = r1.getResourceId(r5, r4)
            android.content.res.ColorStateList r1 = Yue.C1247.m6634(r2, r1, r3)
            return r1
        L2e:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Failed to resolve attribute at index "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r4 = ": "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L4d:
            r1 = 0
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static android.content.res.ColorStateList m23895(@Yue.InterfaceC4410 android.util.TypedValue r0) {
            int r0 = r0.data
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static Yue.C1424 m23896(@Yue.InterfaceC4410 android.content.res.TypedArray r1, @Yue.InterfaceC4410 org.xmlpull.v1.XmlPullParser r2, @Yue.InterfaceC4544 android.content.res.Resources.Theme r3, @Yue.InterfaceC4410 java.lang.String r4, @Yue.InterfaceC6031 int r5, @Yue.InterfaceC1230 int r6) {
            boolean r2 = m23905(r2, r4)
            if (r2 == 0) goto L2f
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r1.getValue(r5, r2)
            int r4 = r2.type
            r0 = 28
            if (r4 < r0) goto L1f
            r0 = 31
            if (r4 > r0) goto L1f
            int r1 = r2.data
            Yue.ۥ۟ۦۤ r1 = Yue.C1424.m7056(r1)
            return r1
        L1f:
            android.content.res.Resources r2 = r1.getResources()
            r4 = 0
            int r1 = r1.getResourceId(r5, r4)
            Yue.ۥ۟ۦۤ r1 = Yue.C1424.m7059(r2, r1, r3)
            if (r1 == 0) goto L2f
            return r1
        L2f:
            Yue.ۥ۟ۦۤ r1 = Yue.C1424.m7056(r6)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static float m23897(@Yue.InterfaceC4410 android.content.res.TypedArray r0, @Yue.InterfaceC4410 org.xmlpull.v1.XmlPullParser r1, @Yue.InterfaceC4410 java.lang.String r2, @Yue.InterfaceC6031 int r3, float r4) {
            boolean r1 = m23905(r1, r2)
            if (r1 != 0) goto L7
            return r4
        L7:
            float r0 = r0.getFloat(r3, r4)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static int m23898(@Yue.InterfaceC4410 android.content.res.TypedArray r0, @Yue.InterfaceC4410 org.xmlpull.v1.XmlPullParser r1, @Yue.InterfaceC4410 java.lang.String r2, @Yue.InterfaceC6031 int r3, int r4) {
            boolean r1 = m23905(r1, r2)
            if (r1 != 0) goto L7
            return r4
        L7:
            int r0 = r0.getInt(r3, r4)
            return r0
    }

    @Yue.InterfaceC0411
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static int m23899(@Yue.InterfaceC4410 android.content.res.TypedArray r0, @Yue.InterfaceC4410 org.xmlpull.v1.XmlPullParser r1, @Yue.InterfaceC4410 java.lang.String r2, @Yue.InterfaceC6031 int r3, @Yue.InterfaceC0411 int r4) {
            boolean r1 = m23905(r1, r2)
            if (r1 != 0) goto L7
            return r4
        L7:
            int r0 = r0.getResourceId(r3, r4)
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static java.lang.String m23900(@Yue.InterfaceC4410 android.content.res.TypedArray r0, @Yue.InterfaceC4410 org.xmlpull.v1.XmlPullParser r1, @Yue.InterfaceC4410 java.lang.String r2, @Yue.InterfaceC6031 int r3) {
            boolean r1 = m23905(r1, r2)
            if (r1 != 0) goto L8
            r0 = 0
            return r0
        L8:
            java.lang.String r0 = r0.getString(r3)
            return r0
    }

    @Yue.InterfaceC0411
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static int m23901(@Yue.InterfaceC4410 android.content.res.TypedArray r0, @Yue.InterfaceC6031 int r1, @Yue.InterfaceC6031 int r2, @Yue.InterfaceC0411 int r3) {
            int r2 = r0.getResourceId(r2, r3)
            int r0 = r0.getResourceId(r1, r2)
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static java.lang.String m23902(@Yue.InterfaceC4410 android.content.res.TypedArray r0, @Yue.InterfaceC6031 int r1, @Yue.InterfaceC6031 int r2) {
            java.lang.String r1 = r0.getString(r1)
            if (r1 != 0) goto La
            java.lang.String r1 = r0.getString(r2)
        La:
            return r1
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static java.lang.CharSequence m23903(@Yue.InterfaceC4410 android.content.res.TypedArray r0, @Yue.InterfaceC6031 int r1, @Yue.InterfaceC6031 int r2) {
            java.lang.CharSequence r1 = r0.getText(r1)
            if (r1 != 0) goto La
            java.lang.CharSequence r1 = r0.getText(r2)
        La:
            return r1
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static java.lang.CharSequence[] m23904(@Yue.InterfaceC4410 android.content.res.TypedArray r0, @Yue.InterfaceC6031 int r1, @Yue.InterfaceC6031 int r2) {
            java.lang.CharSequence[] r1 = r0.getTextArray(r1)
            if (r1 != 0) goto La
            java.lang.CharSequence[] r1 = r0.getTextArray(r2)
        La:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static boolean m23905(@Yue.InterfaceC4410 org.xmlpull.v1.XmlPullParser r1, @Yue.InterfaceC4410 java.lang.String r2) {
            java.lang.String r0 = "http://schemas.android.com/apk/res/android"
            java.lang.String r1 = r1.getAttributeValue(r0, r2)
            if (r1 == 0) goto La
            r1 = 1
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static android.content.res.TypedArray m23906(@Yue.InterfaceC4410 android.content.res.Resources r0, @Yue.InterfaceC4544 android.content.res.Resources.Theme r1, @Yue.InterfaceC4410 android.util.AttributeSet r2, @Yue.InterfaceC4410 int[] r3) {
            if (r1 != 0) goto L7
            android.content.res.TypedArray r0 = r0.obtainAttributes(r2, r3)
            return r0
        L7:
            r0 = 0
            android.content.res.TypedArray r0 = r1.obtainStyledAttributes(r2, r3, r0, r0)
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static android.util.TypedValue m23907(@Yue.InterfaceC4410 android.content.res.TypedArray r0, @Yue.InterfaceC4410 org.xmlpull.v1.XmlPullParser r1, @Yue.InterfaceC4410 java.lang.String r2, int r3) {
            boolean r1 = m23905(r1, r2)
            if (r1 != 0) goto L8
            r0 = 0
            return r0
        L8:
            android.util.TypedValue r0 = r0.peekValue(r3)
            return r0
    }
}
