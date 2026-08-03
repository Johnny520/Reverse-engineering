package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۦۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public final class C1424 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f4523 = "ComplexColorCompat";

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.graphics.Shader f4524;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final android.content.res.ColorStateList f4525;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f4526;

    public C1424(android.graphics.Shader r1, android.content.res.ColorStateList r2, @Yue.InterfaceC1230 int r3) {
            r0 = this;
            r0.<init>()
            r0.f4524 = r1
            r0.f4525 = r2
            r0.f4526 = r3
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static Yue.C1424 m7055(@Yue.InterfaceC4410 android.content.res.Resources r4, @Yue.InterfaceC1241 int r5, @Yue.InterfaceC4544 android.content.res.Resources.Theme r6) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
            android.content.res.XmlResourceParser r5 = r4.getXml(r5)
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L8:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L13
            r3 = 1
            if (r1 == r3) goto L13
            goto L8
        L13:
            if (r1 != r2) goto L5c
            java.lang.String r1 = r5.getName()
            r1.hashCode()
            java.lang.String r2 = "gradient"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L53
            java.lang.String r2 = "selector"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L35
            android.content.res.ColorStateList r4 = Yue.C1247.m6632(r4, r5, r0, r6)
            Yue.ۥ۟ۦۤ r4 = m7057(r4)
            return r4
        L35:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r5 = r5.getPositionDescription()
            r6.append(r5)
            java.lang.String r5 = ": unsupported complex color tag "
            r6.append(r5)
            r6.append(r1)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        L53:
            android.graphics.Shader r4 = Yue.C2906.m12412(r4, r5, r0, r6)
            Yue.ۥ۟ۦۤ r4 = m7058(r4)
            return r4
        L5c:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static Yue.C1424 m7056(@Yue.InterfaceC1230 int r2) {
            Yue.ۥ۟ۦۤ r0 = new Yue.ۥ۟ۦۤ
            r1 = 0
            r0.<init>(r1, r1, r2)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Yue.C1424 m7057(@Yue.InterfaceC4410 android.content.res.ColorStateList r3) {
            Yue.ۥ۟ۦۤ r0 = new Yue.ۥ۟ۦۤ
            int r1 = r3.getDefaultColor()
            r2 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static Yue.C1424 m7058(@Yue.InterfaceC4410 android.graphics.Shader r3) {
            Yue.ۥ۟ۦۤ r0 = new Yue.ۥ۟ۦۤ
            r1 = 0
            r2 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static Yue.C1424 m7059(@Yue.InterfaceC4410 android.content.res.Resources r0, @Yue.InterfaceC1241 int r1, @Yue.InterfaceC4544 android.content.res.Resources.Theme r2) {
            Yue.ۥ۟ۦۤ r0 = m7055(r0, r1, r2)     // Catch: java.lang.Exception -> L5
            return r0
        L5:
            r0 = move-exception
            java.lang.String r1 = "ComplexColorCompat"
            java.lang.String r2 = "Failed to inflate ComplexColor."
            android.util.Log.e(r1, r2, r0)
            r0 = 0
            return r0
    }

    @Yue.InterfaceC1230
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int m7060() {
            r1 = this;
            int r0 = r1.f4526
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public android.graphics.Shader m7061() {
            r1 = this;
            android.graphics.Shader r0 = r1.f4524
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean m7062() {
            r1 = this;
            android.graphics.Shader r0 = r1.f4524
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean m7063() {
            r1 = this;
            android.graphics.Shader r0 = r1.f4524
            if (r0 != 0) goto L10
            android.content.res.ColorStateList r0 = r1.f4525
            if (r0 == 0) goto L10
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public boolean m7064(int[] r3) {
            r2 = this;
            boolean r0 = r2.m7063()
            if (r0 == 0) goto L18
            android.content.res.ColorStateList r0 = r2.f4525
            int r1 = r0.getDefaultColor()
            int r3 = r0.getColorForState(r3, r1)
            int r0 = r2.f4526
            if (r3 == r0) goto L18
            r2.f4526 = r3
            r3 = 1
            goto L19
        L18:
            r3 = 0
        L19:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m7065(@Yue.InterfaceC1230 int r1) {
            r0 = this;
            r0.f4526 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean m7066() {
            r1 = this;
            boolean r0 = r1.m7062()
            if (r0 != 0) goto Ld
            int r0 = r1.f4526
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            return r0
    }
}
