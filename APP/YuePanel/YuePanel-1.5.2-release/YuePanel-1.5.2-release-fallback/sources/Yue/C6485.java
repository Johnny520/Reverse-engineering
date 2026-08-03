package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
@Yue.InterfaceC5336(24)
public class C6485 extends Yue.C6489 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f22801 = "TypefaceCompatApi24Impl";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f22802 = "android.graphics.FontFamily";

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final java.lang.String f22803 = "addFontWeightStyle";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final java.lang.String f22804 = "createFromFamiliesWithDefault";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final java.lang.Class<?> f22805 = null;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final java.lang.reflect.Constructor<?> f22806 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final java.lang.reflect.Method f22807 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final java.lang.reflect.Method f22808 = null;

    static {
            r0 = 0
            java.lang.String r1 = "android.graphics.FontFamily"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.reflect.Constructor r2 = r1.getConstructor(r0)     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.String r3 = "addFontWeightStyle"
            java.lang.Class<java.nio.ByteBuffer> r4 = java.nio.ByteBuffer.class
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.Class<java.util.List> r6 = java.util.List.class
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.Class[] r4 = new java.lang.Class[]{r4, r5, r6, r5, r7}     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.reflect.Method r3 = r1.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            r4 = 1
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r1, r4)     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.Class<android.graphics.Typeface> r5 = android.graphics.Typeface.class
            java.lang.String r6 = "createFromFamiliesWithDefault"
            java.lang.Class r4 = r4.getClass()     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.reflect.Method r0 = r5.getMethod(r6, r4)     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            r8 = r2
            r2 = r0
            r0 = r8
            goto L49
        L36:
            r1 = move-exception
            goto L39
        L38:
            r1 = move-exception
        L39:
            java.lang.Class r2 = r1.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "TypefaceCompatApi24Impl"
            android.util.Log.e(r3, r2, r1)
            r1 = r0
            r2 = r1
            r3 = r2
        L49:
            Yue.C6485.f22806 = r0
            Yue.C6485.f22805 = r1
            Yue.C6485.f22807 = r3
            Yue.C6485.f22808 = r2
            return
    }

    public C6485() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static boolean m23936(java.lang.Object r2, java.nio.ByteBuffer r3, int r4, int r5, boolean r6) {
            java.lang.reflect.Method r0 = Yue.C6485.f22807     // Catch: java.lang.Throwable -> L1e
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L1e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L1e
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L1e
            r1 = 0
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r1, r5, r6}     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r2 = r0.invoke(r2, r3)     // Catch: java.lang.Throwable -> L1e
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L1e
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L1e
            return r2
        L1e:
            r2 = 0
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    private static android.graphics.Typeface m23937(java.lang.Object r3) {
            r0 = 0
            java.lang.Class<?> r1 = Yue.C6485.f22805     // Catch: java.lang.Throwable -> L19
            r2 = 1
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)     // Catch: java.lang.Throwable -> L19
            r2 = 0
            java.lang.reflect.Array.set(r1, r2, r3)     // Catch: java.lang.Throwable -> L19
            java.lang.reflect.Method r3 = Yue.C6485.f22808     // Catch: java.lang.Throwable -> L19
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L19
            java.lang.Object r3 = r3.invoke(r0, r1)     // Catch: java.lang.Throwable -> L19
            android.graphics.Typeface r3 = (android.graphics.Typeface) r3     // Catch: java.lang.Throwable -> L19
            return r3
        L19:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static boolean m23938() {
            java.lang.reflect.Method r0 = Yue.C6485.f22807
            if (r0 != 0) goto Lb
            java.lang.String r1 = "TypefaceCompatApi24Impl"
            java.lang.String r2 = "Unable to collect necessary private methods.Fallback to legacy implementation."
            android.util.Log.w(r1, r2)
        Lb:
            if (r0 == 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    private static java.lang.Object m23939() {
            r0 = 0
            java.lang.reflect.Constructor<?> r1 = Yue.C6485.f22806     // Catch: java.lang.Throwable -> L7
            java.lang.Object r0 = r1.newInstance(r0)     // Catch: java.lang.Throwable -> L7
        L7:
            return r0
    }

    @Override // Yue.C6489
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟ */
    public android.graphics.Typeface mo23932(android.content.Context r8, Yue.C2729.C2733 r9, android.content.res.Resources r10, int r11) {
            r7 = this;
            java.lang.Object r11 = m23939()
            r0 = 0
            if (r11 != 0) goto L8
            return r0
        L8:
            Yue.ۥ۠ۢۦۡ$ۥ۟۟۟۟[] r9 = r9.m11988()
            int r1 = r9.length
            r2 = 0
        Le:
            if (r2 >= r1) goto L33
            r3 = r9[r2]
            int r4 = r3.m11990()
            java.nio.ByteBuffer r4 = Yue.C6494.m23976(r8, r10, r4)
            if (r4 != 0) goto L1d
            return r0
        L1d:
            int r5 = r3.m11991()
            int r6 = r3.m11993()
            boolean r3 = r3.m11994()
            boolean r3 = m23936(r11, r4, r5, r6, r3)
            if (r3 != 0) goto L30
            return r0
        L30:
            int r2 = r2 + 1
            goto Le
        L33:
            android.graphics.Typeface r8 = m23937(r11)
            return r8
    }

    @Override // Yue.C6489
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public android.graphics.Typeface mo23933(android.content.Context r10, @Yue.InterfaceC4544 android.os.CancellationSignal r11, @Yue.InterfaceC4410 Yue.C2736.C2739[] r12, int r13) {
            r9 = this;
            java.lang.Object r0 = m23939()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            Yue.ۥۢ۟ۡ r2 = new Yue.ۥۢ۟ۡ
            r2.<init>()
            int r3 = r12.length
            r4 = 0
        Lf:
            if (r4 >= r3) goto L3f
            r5 = r12[r4]
            android.net.Uri r6 = r5.m12014()
            java.lang.Object r7 = r2.get(r6)
            java.nio.ByteBuffer r7 = (java.nio.ByteBuffer) r7
            if (r7 != 0) goto L26
            java.nio.ByteBuffer r7 = Yue.C6494.m23980(r10, r11, r6)
            r2.put(r6, r7)
        L26:
            if (r7 != 0) goto L29
            return r1
        L29:
            int r6 = r5.m12013()
            int r8 = r5.m12015()
            boolean r5 = r5.m12016()
            boolean r5 = m23936(r0, r7, r6, r8, r5)
            if (r5 != 0) goto L3c
            return r1
        L3c:
            int r4 = r4 + 1
            goto Lf
        L3f:
            android.graphics.Typeface r10 = m23937(r0)
            if (r10 != 0) goto L46
            return r1
        L46:
            android.graphics.Typeface r10 = android.graphics.Typeface.create(r10, r13)
            return r10
    }

    @Override // Yue.C6489
    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public android.graphics.Typeface mo23934(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4410 android.graphics.Typeface r3, int r4, boolean r5) {
            r1 = this;
            android.graphics.Typeface r0 = Yue.C7005.m27126(r3, r4, r5)     // Catch: java.lang.RuntimeException -> L5
            goto L6
        L5:
            r0 = 0
        L6:
            if (r0 != 0) goto Lc
            android.graphics.Typeface r0 = super.mo23934(r2, r3, r4, r5)
        Lc:
            return r0
    }
}
