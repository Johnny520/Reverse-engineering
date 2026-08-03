package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
@Yue.InterfaceC5336(21)
public class C6484 extends Yue.C6489 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f22792 = "TypefaceCompatApi21Impl";

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f22793 = "android.graphics.FontFamily";

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final java.lang.String f22794 = "addFontWeightStyle";

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final java.lang.String f22795 = "createFromFamiliesWithDefault";

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static java.lang.Class<?> f22796;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static java.lang.reflect.Constructor<?> f22797;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static java.lang.reflect.Method f22798;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static java.lang.reflect.Method f22799;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static boolean f22800;

    static {
            return
    }

    public C6484() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static boolean m23928(java.lang.Object r1, java.lang.String r2, int r3, boolean r4) {
            m23930()
            java.lang.reflect.Method r0 = Yue.C6484.f22798     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4}     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            java.lang.Object r1 = r0.invoke(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            boolean r1 = r1.booleanValue()     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            return r1
        L1c:
            r1 = move-exception
            goto L1f
        L1e:
            r1 = move-exception
        L1f:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    private static android.graphics.Typeface m23929(java.lang.Object r2) {
            m23930()
            java.lang.Class<?> r0 = Yue.C6484.f22796     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            r1 = 1
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            r1 = 0
            java.lang.reflect.Array.set(r0, r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            java.lang.reflect.Method r2 = Yue.C6484.f22799     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            r1 = 0
            java.lang.Object r2 = r2.invoke(r1, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2     // Catch: java.lang.reflect.InvocationTargetException -> L1c java.lang.IllegalAccessException -> L1e
            return r2
        L1c:
            r2 = move-exception
            goto L1f
        L1e:
            r2 = move-exception
        L1f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r2)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static void m23930() {
            boolean r0 = Yue.C6484.f22800
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            Yue.C6484.f22800 = r0
            r1 = 0
            java.lang.String r2 = "android.graphics.FontFamily"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.NoSuchMethodException -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.reflect.Constructor r3 = r2.getConstructor(r1)     // Catch: java.lang.NoSuchMethodException -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.String r4 = "addFontWeightStyle"
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.Class[] r5 = new java.lang.Class[]{r5, r6, r7}     // Catch: java.lang.NoSuchMethodException -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.reflect.Method r4 = r2.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r2, r0)     // Catch: java.lang.NoSuchMethodException -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.Class<android.graphics.Typeface> r5 = android.graphics.Typeface.class
            java.lang.String r6 = "createFromFamiliesWithDefault"
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.NoSuchMethodException -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch: java.lang.NoSuchMethodException -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.reflect.Method r1 = r5.getMethod(r6, r0)     // Catch: java.lang.NoSuchMethodException -> L3a java.lang.ClassNotFoundException -> L3c
            r0 = r1
            r1 = r3
            goto L4d
        L3a:
            r0 = move-exception
            goto L3d
        L3c:
            r0 = move-exception
        L3d:
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "TypefaceCompatApi21Impl"
            android.util.Log.e(r3, r2, r0)
            r0 = r1
            r2 = r0
            r4 = r2
        L4d:
            Yue.C6484.f22797 = r1
            Yue.C6484.f22796 = r2
            Yue.C6484.f22798 = r4
            Yue.C6484.f22799 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    private static java.lang.Object m23931() {
            m23930()
            java.lang.reflect.Constructor<?> r0 = Yue.C6484.f22797     // Catch: java.lang.reflect.InvocationTargetException -> Lb java.lang.InstantiationException -> Ld java.lang.IllegalAccessException -> Lf
            r1 = 0
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.reflect.InvocationTargetException -> Lb java.lang.InstantiationException -> Ld java.lang.IllegalAccessException -> Lf
            return r0
        Lb:
            r0 = move-exception
            goto L10
        Ld:
            r0 = move-exception
            goto L10
        Lf:
            r0 = move-exception
        L10:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    @Override // Yue.C6489
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public android.graphics.Typeface mo23932(android.content.Context r8, Yue.C2729.C2733 r9, android.content.res.Resources r10, int r11) {
            r7 = this;
            java.lang.Object r11 = m23931()
            Yue.ۥ۠ۢۦۡ$ۥ۟۟۟۟[] r9 = r9.m11988()
            int r0 = r9.length
            r1 = 0
        La:
            if (r1 >= r0) goto L49
            r2 = r9[r1]
            java.io.File r3 = Yue.C6494.m23979(r8)
            r4 = 0
            if (r3 != 0) goto L16
            return r4
        L16:
            int r5 = r2.m11990()     // Catch: java.lang.Throwable -> L40 java.lang.RuntimeException -> L45
            boolean r5 = Yue.C6494.m23977(r3, r10, r5)     // Catch: java.lang.Throwable -> L40 java.lang.RuntimeException -> L45
            if (r5 != 0) goto L24
            r3.delete()
            return r4
        L24:
            java.lang.String r5 = r3.getPath()     // Catch: java.lang.Throwable -> L40 java.lang.RuntimeException -> L45
            int r6 = r2.m11993()     // Catch: java.lang.Throwable -> L40 java.lang.RuntimeException -> L45
            boolean r2 = r2.m11994()     // Catch: java.lang.Throwable -> L40 java.lang.RuntimeException -> L45
            boolean r2 = m23928(r11, r5, r6, r2)     // Catch: java.lang.Throwable -> L40 java.lang.RuntimeException -> L45
            if (r2 != 0) goto L3a
            r3.delete()
            return r4
        L3a:
            r3.delete()
            int r1 = r1 + 1
            goto La
        L40:
            r8 = move-exception
            r3.delete()
            throw r8
        L45:
            r3.delete()
            return r4
        L49:
            android.graphics.Typeface r8 = m23929(r11)
            return r8
    }

    @Override // Yue.C6489
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public android.graphics.Typeface mo23933(android.content.Context r4, android.os.CancellationSignal r5, @Yue.InterfaceC4410 Yue.C2736.C2739[] r6, int r7) {
            r3 = this;
            int r0 = r6.length
            r1 = 1
            r2 = 0
            if (r0 >= r1) goto L6
            return r2
        L6:
            Yue.ۥ۠ۢۦۢ$ۥ۟۟ r6 = r3.mo23957(r6, r7)
            android.content.ContentResolver r7 = r4.getContentResolver()
            android.net.Uri r6 = r6.m12014()     // Catch: java.io.IOException -> L5e
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r5 = r7.openFileDescriptor(r6, r0, r5)     // Catch: java.io.IOException -> L5e
            if (r5 != 0) goto L20
            if (r5 == 0) goto L1f
            r5.close()     // Catch: java.io.IOException -> L5e
        L1f:
            return r2
        L20:
            java.io.File r6 = r3.m23935(r5)     // Catch: java.lang.Throwable -> L35
            if (r6 == 0) goto L37
            boolean r7 = r6.canRead()     // Catch: java.lang.Throwable -> L35
            if (r7 != 0) goto L2d
            goto L37
        L2d:
            android.graphics.Typeface r4 = android.graphics.Typeface.createFromFile(r6)     // Catch: java.lang.Throwable -> L35
            r5.close()     // Catch: java.io.IOException -> L5e
            return r4
        L35:
            r4 = move-exception
            goto L55
        L37:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L35
            java.io.FileDescriptor r7 = r5.getFileDescriptor()     // Catch: java.lang.Throwable -> L35
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L35
            android.graphics.Typeface r4 = super.mo23956(r4, r6)     // Catch: java.lang.Throwable -> L4b
            r6.close()     // Catch: java.lang.Throwable -> L35
            r5.close()     // Catch: java.io.IOException -> L5e
            return r4
        L4b:
            r4 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> L50
            goto L54
        L50:
            r6 = move-exception
            r4.addSuppressed(r6)     // Catch: java.lang.Throwable -> L35
        L54:
            throw r4     // Catch: java.lang.Throwable -> L35
        L55:
            r5.close()     // Catch: java.lang.Throwable -> L59
            goto L5d
        L59:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch: java.io.IOException -> L5e
        L5d:
            throw r4     // Catch: java.io.IOException -> L5e
        L5e:
            return r2
    }

    @Override // Yue.C6489
    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
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

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final java.io.File m23935(@Yue.InterfaceC4410 android.os.ParcelFileDescriptor r4) {
            r3 = this;
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: android.system.ErrnoException -> L2c
            r1.<init>()     // Catch: android.system.ErrnoException -> L2c
            java.lang.String r2 = "/proc/self/fd/"
            r1.append(r2)     // Catch: android.system.ErrnoException -> L2c
            int r4 = r4.getFd()     // Catch: android.system.ErrnoException -> L2c
            r1.append(r4)     // Catch: android.system.ErrnoException -> L2c
            java.lang.String r4 = r1.toString()     // Catch: android.system.ErrnoException -> L2c
            java.lang.String r4 = android.system.Os.readlink(r4)     // Catch: android.system.ErrnoException -> L2c
            android.system.StructStat r1 = android.system.Os.stat(r4)     // Catch: android.system.ErrnoException -> L2c
            int r1 = r1.st_mode     // Catch: android.system.ErrnoException -> L2c
            boolean r1 = android.system.OsConstants.S_ISREG(r1)     // Catch: android.system.ErrnoException -> L2c
            if (r1 == 0) goto L2c
            java.io.File r1 = new java.io.File     // Catch: android.system.ErrnoException -> L2c
            r1.<init>(r4)     // Catch: android.system.ErrnoException -> L2c
            return r1
        L2c:
            return r0
    }
}
