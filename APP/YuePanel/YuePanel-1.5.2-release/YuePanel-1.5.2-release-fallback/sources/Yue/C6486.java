package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
@Yue.InterfaceC5336(26)
public class C6486 extends Yue.C6484 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final java.lang.String f22809 = "TypefaceCompatApi26Impl";

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final java.lang.String f22810 = "android.graphics.FontFamily";

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final java.lang.String f22811 = "addFontFromAssetManager";

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final java.lang.String f22812 = "addFontFromBuffer";

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final java.lang.String f22813 = "createFromFamiliesWithDefault";

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final java.lang.String f22814 = "freeze";

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final java.lang.String f22815 = "abortCreation";

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final int f22816 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final java.lang.Class<?> f22817;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final java.lang.reflect.Constructor<?> f22818;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final java.lang.reflect.Method f22819;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final java.lang.reflect.Method f22820;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final java.lang.reflect.Method f22821;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final java.lang.reflect.Method f22822;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final java.lang.reflect.Method f22823;

    public C6486() {
            r7 = this;
            r7.<init>()
            java.lang.Class r0 = r7.m23952()     // Catch: java.lang.NoSuchMethodException -> L20 java.lang.ClassNotFoundException -> L22
            java.lang.reflect.Constructor r1 = r7.m23953(r0)     // Catch: java.lang.NoSuchMethodException -> L20 java.lang.ClassNotFoundException -> L22
            java.lang.reflect.Method r2 = r7.m23949(r0)     // Catch: java.lang.NoSuchMethodException -> L20 java.lang.ClassNotFoundException -> L22
            java.lang.reflect.Method r3 = r7.m23950(r0)     // Catch: java.lang.NoSuchMethodException -> L20 java.lang.ClassNotFoundException -> L22
            java.lang.reflect.Method r4 = r7.m23954(r0)     // Catch: java.lang.NoSuchMethodException -> L20 java.lang.ClassNotFoundException -> L22
            java.lang.reflect.Method r5 = r7.m23948(r0)     // Catch: java.lang.NoSuchMethodException -> L20 java.lang.ClassNotFoundException -> L22
            java.lang.reflect.Method r6 = r7.mo23951(r0)     // Catch: java.lang.NoSuchMethodException -> L20 java.lang.ClassNotFoundException -> L22
            goto L48
        L20:
            r0 = move-exception
            goto L23
        L22:
            r0 = move-exception
        L23:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unable to collect necessary methods for class "
            r1.append(r2)
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "TypefaceCompatApi26Impl"
            android.util.Log.e(r2, r1, r0)
            r0 = 0
            r1 = r0
            r2 = r1
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
        L48:
            r7.f22817 = r0
            r7.f22818 = r1
            r7.f22819 = r2
            r7.f22820 = r3
            r7.f22821 = r4
            r7.f22822 = r5
            r7.f22823 = r6
            return
    }

    @Override // Yue.C6484, Yue.C6489
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟ */
    public android.graphics.Typeface mo23932(android.content.Context r11, Yue.C2729.C2733 r12, android.content.res.Resources r13, int r14) {
            r10 = this;
            boolean r0 = r10.m23947()
            if (r0 != 0) goto Lb
            android.graphics.Typeface r11 = super.mo23932(r11, r12, r13, r14)
            return r11
        Lb:
            java.lang.Object r13 = r10.m23942()
            r14 = 0
            if (r13 != 0) goto L13
            return r14
        L13:
            Yue.ۥ۠ۢۦۡ$ۥ۟۟۟۟[] r12 = r12.m11988()
            int r8 = r12.length
            r0 = 0
            r9 = r0
        L1a:
            if (r9 >= r8) goto L46
            r0 = r12[r9]
            java.lang.String r3 = r0.m11989()
            int r4 = r0.m11991()
            int r5 = r0.m11993()
            boolean r6 = r0.m11994()
            java.lang.String r0 = r0.m11992()
            android.graphics.fonts.FontVariationAxis[] r7 = android.graphics.fonts.FontVariationAxis.fromFontVariationSettings(r0)
            r0 = r10
            r1 = r11
            r2 = r13
            boolean r0 = r0.m23944(r1, r2, r3, r4, r5, r6, r7)
            if (r0 != 0) goto L43
            r10.m23943(r13)
            return r14
        L43:
            int r9 = r9 + 1
            goto L1a
        L46:
            boolean r11 = r10.m23946(r13)
            if (r11 != 0) goto L4d
            return r14
        L4d:
            android.graphics.Typeface r11 = r10.mo23941(r13)
            return r11
    }

    @Override // Yue.C6484, Yue.C6489
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public android.graphics.Typeface mo23933(android.content.Context r11, @Yue.InterfaceC4544 android.os.CancellationSignal r12, @Yue.InterfaceC4410 Yue.C2736.C2739[] r13, int r14) {
            r10 = this;
            int r0 = r13.length
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L6
            return r1
        L6:
            boolean r0 = r10.m23947()
            if (r0 != 0) goto L52
            Yue.ۥ۠ۢۦۢ$ۥ۟۟ r13 = r10.mo23957(r13, r14)
            android.content.ContentResolver r11 = r11.getContentResolver()
            android.net.Uri r14 = r13.m12014()     // Catch: java.io.IOException -> L51
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r11 = r11.openFileDescriptor(r14, r0, r12)     // Catch: java.io.IOException -> L51
            if (r11 != 0) goto L26
            if (r11 == 0) goto L25
            r11.close()     // Catch: java.io.IOException -> L51
        L25:
            return r1
        L26:
            android.graphics.Typeface$Builder r12 = new android.graphics.Typeface$Builder     // Catch: java.lang.Throwable -> L47
            java.io.FileDescriptor r14 = r11.getFileDescriptor()     // Catch: java.lang.Throwable -> L47
            r12.<init>(r14)     // Catch: java.lang.Throwable -> L47
            int r14 = r13.m12015()     // Catch: java.lang.Throwable -> L47
            android.graphics.Typeface$Builder r12 = r12.setWeight(r14)     // Catch: java.lang.Throwable -> L47
            boolean r13 = r13.m12016()     // Catch: java.lang.Throwable -> L47
            android.graphics.Typeface$Builder r12 = r12.setItalic(r13)     // Catch: java.lang.Throwable -> L47
            android.graphics.Typeface r12 = r12.build()     // Catch: java.lang.Throwable -> L47
            r11.close()     // Catch: java.io.IOException -> L51
            return r12
        L47:
            r12 = move-exception
            r11.close()     // Catch: java.lang.Throwable -> L4c
            goto L50
        L4c:
            r11 = move-exception
            r12.addSuppressed(r11)     // Catch: java.io.IOException -> L51
        L50:
            throw r12     // Catch: java.io.IOException -> L51
        L51:
            return r1
        L52:
            java.util.Map r11 = Yue.C6494.m23982(r11, r13, r12)
            java.lang.Object r12 = r10.m23942()
            if (r12 != 0) goto L5d
            return r1
        L5d:
            int r0 = r13.length
            r3 = 0
            r9 = r3
        L60:
            if (r9 >= r0) goto L8d
            r4 = r13[r9]
            android.net.Uri r5 = r4.m12014()
            java.lang.Object r5 = r11.get(r5)
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            if (r5 != 0) goto L71
            goto L8a
        L71:
            int r6 = r4.m12013()
            int r7 = r4.m12015()
            boolean r8 = r4.m12016()
            r3 = r10
            r4 = r12
            boolean r3 = r3.m23945(r4, r5, r6, r7, r8)
            if (r3 != 0) goto L89
            r10.m23943(r12)
            return r1
        L89:
            r3 = r2
        L8a:
            int r9 = r9 + 1
            goto L60
        L8d:
            if (r3 != 0) goto L93
            r10.m23943(r12)
            return r1
        L93:
            boolean r11 = r10.m23946(r12)
            if (r11 != 0) goto L9a
            return r1
        L9a:
            android.graphics.Typeface r11 = r10.mo23941(r12)
            if (r11 != 0) goto La1
            return r1
        La1:
            android.graphics.Typeface r11 = android.graphics.Typeface.create(r11, r14)
            return r11
    }

    @Override // Yue.C6489
    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public android.graphics.Typeface mo23940(android.content.Context r9, android.content.res.Resources r10, int r11, java.lang.String r12, int r13) {
            r8 = this;
            boolean r0 = r8.m23947()
            if (r0 != 0) goto Lb
            android.graphics.Typeface r9 = super.mo23940(r9, r10, r11, r12, r13)
            return r9
        Lb:
            java.lang.Object r10 = r8.m23942()
            r11 = 0
            if (r10 != 0) goto L13
            return r11
        L13:
            r6 = -1
            r7 = 0
            r4 = 0
            r5 = -1
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r12
            boolean r9 = r0.m23944(r1, r2, r3, r4, r5, r6, r7)
            if (r9 != 0) goto L25
            r8.m23943(r10)
            return r11
        L25:
            boolean r9 = r8.m23946(r10)
            if (r9 != 0) goto L2c
            return r11
        L2c:
            android.graphics.Typeface r9 = r8.mo23941(r10)
            return r9
    }

    @Override // Yue.C6484, Yue.C6489
    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public android.graphics.Typeface mo23934(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4410 android.graphics.Typeface r3, int r4, boolean r5) {
            r1 = this;
            android.graphics.Typeface r0 = Yue.C7006.m27132(r3, r4, r5)     // Catch: java.lang.RuntimeException -> L5
            goto L6
        L5:
            r0 = 0
        L6:
            if (r0 != 0) goto Lc
            android.graphics.Typeface r0 = super.mo23934(r2, r3, r4, r5)
        Lc:
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public android.graphics.Typeface mo23941(java.lang.Object r5) {
            r4 = this;
            r0 = 0
            java.lang.Class<?> r1 = r4.f22817     // Catch: java.lang.Throwable -> L22
            r2 = 1
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)     // Catch: java.lang.Throwable -> L22
            r2 = 0
            java.lang.reflect.Array.set(r1, r2, r5)     // Catch: java.lang.Throwable -> L22
            java.lang.reflect.Method r5 = r4.f22823     // Catch: java.lang.Throwable -> L22
            r2 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L22
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L22
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r3, r2}     // Catch: java.lang.Throwable -> L22
            java.lang.Object r5 = r5.invoke(r0, r1)     // Catch: java.lang.Throwable -> L22
            android.graphics.Typeface r5 = (android.graphics.Typeface) r5     // Catch: java.lang.Throwable -> L22
            return r5
        L22:
            return r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final java.lang.Object m23942() {
            r2 = this;
            r0 = 0
            java.lang.reflect.Constructor<?> r1 = r2.f22818     // Catch: java.lang.Throwable -> L7
            java.lang.Object r0 = r1.newInstance(r0)     // Catch: java.lang.Throwable -> L7
        L7:
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final void m23943(java.lang.Object r3) {
            r2 = this;
            java.lang.reflect.Method r0 = r2.f22822     // Catch: java.lang.Throwable -> L6
            r1 = 0
            r0.invoke(r3, r1)     // Catch: java.lang.Throwable -> L6
        L6:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final boolean m23944(android.content.Context r12, java.lang.Object r13, java.lang.String r14, int r15, int r16, int r17, @Yue.InterfaceC4544 android.graphics.fonts.FontVariationAxis[] r18) {
            r11 = this;
            r0 = 0
            r1 = r11
            java.lang.reflect.Method r2 = r1.f22819     // Catch: java.lang.Throwable -> L2c
            android.content.res.AssetManager r3 = r12.getAssets()     // Catch: java.lang.Throwable -> L2c
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L2c
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)     // Catch: java.lang.Throwable -> L2c
            java.lang.Integer r8 = java.lang.Integer.valueOf(r16)     // Catch: java.lang.Throwable -> L2c
            java.lang.Integer r9 = java.lang.Integer.valueOf(r17)     // Catch: java.lang.Throwable -> L2c
            r4 = r14
            r10 = r18
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r5, r6, r7, r8, r9, r10}     // Catch: java.lang.Throwable -> L2c
            r4 = r13
            java.lang.Object r2 = r2.invoke(r13, r3)     // Catch: java.lang.Throwable -> L2c
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L2c
            boolean r0 = r2.booleanValue()     // Catch: java.lang.Throwable -> L2c
        L2c:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final boolean m23945(java.lang.Object r3, java.nio.ByteBuffer r4, int r5, int r6, int r7) {
            r2 = this;
            java.lang.reflect.Method r0 = r2.f22820     // Catch: java.lang.Throwable -> L1e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L1e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L1e
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L1e
            r1 = 0
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5, r1, r6, r7}     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r3 = r0.invoke(r3, r4)     // Catch: java.lang.Throwable -> L1e
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L1e
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> L1e
            return r3
        L1e:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final boolean m23946(java.lang.Object r3) {
            r2 = this;
            java.lang.reflect.Method r0 = r2.f22821     // Catch: java.lang.Throwable -> Le
            r1 = 0
            java.lang.Object r3 = r0.invoke(r3, r1)     // Catch: java.lang.Throwable -> Le
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> Le
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> Le
            return r3
        Le:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final boolean m23947() {
            r2 = this;
            java.lang.reflect.Method r0 = r2.f22819
            if (r0 != 0) goto Lb
            java.lang.String r0 = "TypefaceCompatApi26Impl"
            java.lang.String r1 = "Unable to collect necessary private methods. Fallback to legacy implementation."
            android.util.Log.w(r0, r1)
        Lb:
            java.lang.reflect.Method r0 = r2.f22819
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public java.lang.reflect.Method m23948(java.lang.Class<?> r3) throws java.lang.NoSuchMethodException {
            r2 = this;
            java.lang.String r0 = "abortCreation"
            r1 = 0
            java.lang.reflect.Method r3 = r3.getMethod(r0, r1)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public java.lang.reflect.Method m23949(java.lang.Class<?> r9) throws java.lang.NoSuchMethodException {
            r8 = this;
            java.lang.Class r6 = java.lang.Integer.TYPE
            java.lang.Class r3 = java.lang.Boolean.TYPE
            java.lang.Class<android.graphics.fonts.FontVariationAxis[]> r7 = android.graphics.fonts.FontVariationAxis[].class
            java.lang.Class<android.content.res.AssetManager> r0 = android.content.res.AssetManager.class
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r2 = r6
            r4 = r6
            r5 = r6
            java.lang.Class[] r0 = new java.lang.Class[]{r0, r1, r2, r3, r4, r5, r6, r7}
            java.lang.String r1 = "addFontFromAssetManager"
            java.lang.reflect.Method r9 = r9.getMethod(r1, r0)
            return r9
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public java.lang.reflect.Method m23950(java.lang.Class<?> r4) throws java.lang.NoSuchMethodException {
            r3 = this;
            java.lang.Class r0 = java.lang.Integer.TYPE
            java.lang.Class<android.graphics.fonts.FontVariationAxis[]> r1 = android.graphics.fonts.FontVariationAxis[].class
            java.lang.Class<java.nio.ByteBuffer> r2 = java.nio.ByteBuffer.class
            java.lang.Class[] r0 = new java.lang.Class[]{r2, r0, r1, r0, r0}
            java.lang.String r1 = "addFontFromBuffer"
            java.lang.reflect.Method r4 = r4.getMethod(r1, r0)
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public java.lang.reflect.Method mo23951(java.lang.Class<?> r4) throws java.lang.NoSuchMethodException {
            r3 = this;
            r0 = 1
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r0)
            java.lang.Class r4 = r4.getClass()
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.Class[] r4 = new java.lang.Class[]{r4, r1, r1}
            java.lang.Class<android.graphics.Typeface> r1 = android.graphics.Typeface.class
            java.lang.String r2 = "createFromFamiliesWithDefault"
            java.lang.reflect.Method r4 = r1.getDeclaredMethod(r2, r4)
            r4.setAccessible(r0)
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public java.lang.Class<?> m23952() throws java.lang.ClassNotFoundException {
            r1 = this;
            java.lang.String r0 = "android.graphics.FontFamily"
            java.lang.Class r0 = java.lang.Class.forName(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public java.lang.reflect.Constructor<?> m23953(java.lang.Class<?> r2) throws java.lang.NoSuchMethodException {
            r1 = this;
            r0 = 0
            java.lang.reflect.Constructor r2 = r2.getConstructor(r0)
            return r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public java.lang.reflect.Method m23954(java.lang.Class<?> r3) throws java.lang.NoSuchMethodException {
            r2 = this;
            java.lang.String r0 = "freeze"
            r1 = 0
            java.lang.reflect.Method r3 = r3.getMethod(r0, r1)
            return r3
    }
}
