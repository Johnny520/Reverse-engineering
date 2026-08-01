package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class gt {
    public static android.util.TypedValue A(android.content.Context r1, int r2, java.lang.String r3) {
            android.util.TypedValue r0 = y(r1, r2)
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r1 = r1.getResourceName(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r1}
            java.lang.String r2 = "%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant)."
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
    }

    public static void D(android.view.View r3, defpackage.eu r4) {
            du r0 = r4.a
            xh r0 = r0.b
            if (r0 == 0) goto L2f
            boolean r0 = r0.a
            if (r0 == 0) goto L2f
            android.view.ViewParent r3 = r3.getParent()
            r0 = 0
        Lf:
            boolean r1 = r3 instanceof android.view.View
            if (r1 == 0) goto L22
            r1 = r3
            android.view.View r1 = (android.view.View) r1
            java.util.WeakHashMap r2 = defpackage.ja0.a
            float r1 = defpackage.y90.i(r1)
            float r0 = r0 + r1
            android.view.ViewParent r3 = r3.getParent()
            goto Lf
        L22:
            du r3 = r4.a
            float r1 = r3.l
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 == 0) goto L2f
            r3.l = r0
            r4.m()
        L2f:
            return
    }

    public static final long E(java.lang.String r4, long r5, long r7, long r9) {
            int r0 = defpackage.r50.a
            java.lang.String r0 = java.lang.System.getProperty(r4)     // Catch: java.lang.SecurityException -> L7
            goto L8
        L7:
            r0 = 0
        L8:
            if (r0 != 0) goto Lb
            return r5
        Lb:
            java.lang.Long r5 = defpackage.b50.S(r0)
            r6 = 39
            java.lang.String r1 = "System property '"
            if (r5 == 0) goto L53
            long r2 = r5.longValue()
            int r5 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r5 > 0) goto L22
            int r5 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r5 > 0) goto L22
            return r2
        L22:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = "' should be in range "
            r0.append(r4)
            r0.append(r7)
            java.lang.String r4 = ".."
            r0.append(r4)
            r0.append(r9)
            java.lang.String r4 = ", but is '"
            r0.append(r4)
            r0.append(r2)
            r0.append(r6)
            java.lang.String r4 = r0.toString()
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        L53:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r1)
            r7.append(r4)
            java.lang.String r4 = "' has unrecognized value '"
            r7.append(r4)
            r7.append(r0)
            r7.append(r6)
            java.lang.String r4 = r7.toString()
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    public static int F(java.lang.String r7, int r8, int r9) {
            r9 = r9 & 8
            if (r9 == 0) goto L8
            r9 = 2147483647(0x7fffffff, float:NaN)
            goto Lb
        L8:
            r9 = 2097150(0x1ffffe, float:2.938733E-39)
        Lb:
            long r1 = (long) r8
            r8 = 1
            long r3 = (long) r8
            long r5 = (long) r9
            r0 = r7
            long r7 = E(r0, r1, r3, r5)
            int r7 = (int) r7
            return r7
    }

    public static final void G(defpackage.i00 r5, android.view.View r6) {
            java.lang.Object r0 = r5.b
            if (r0 == 0) goto L5
            goto L3a
        L5:
            java.lang.Class r0 = r6.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = defpackage.pb0.i0
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L18
            r5.b = r6
            return
        L18:
            boolean r0 = r6 instanceof android.view.ViewGroup
            if (r0 == 0) goto L3a
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            int r0 = r6.getChildCount()
            r1 = 0
        L23:
            if (r1 >= r0) goto L3a
            android.view.View r2 = r6.getChildAt(r1)
            java.lang.String r3 = "njrBEZzoeLm4K5182q89\n"
            java.lang.String r4 = "+V+1UvSBFN0=\n"
            java.lang.String r3 = "getChildAt(...)"
            defpackage.ip.n(r3, r2)
            G(r5, r2)
            int r1 = r1 + 1
            goto L23
        L3a:
            return
    }

    public static int a(android.content.Context r6, java.lang.String r7) {
            int r0 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            java.lang.String r2 = r6.getPackageName()
            int r0 = r6.checkPermission(r7, r0, r1)
            r3 = -1
            if (r0 != r3) goto L14
            goto L2f
        L14:
            java.lang.String r7 = defpackage.w5.d(r7)
            r0 = 0
            if (r7 != 0) goto L1c
            goto L77
        L1c:
            if (r2 != 0) goto L30
            android.content.pm.PackageManager r2 = r6.getPackageManager()
            java.lang.String[] r2 = r2.getPackagesForUid(r1)
            if (r2 == 0) goto L2f
            int r4 = r2.length
            if (r4 > 0) goto L2c
            goto L2f
        L2c:
            r2 = r2[r0]
            goto L30
        L2f:
            return r3
        L30:
            int r3 = android.os.Process.myUid()
            java.lang.String r4 = r6.getPackageName()
            java.lang.Class<android.app.AppOpsManager> r5 = android.app.AppOpsManager.class
            if (r3 != r1) goto L6b
            boolean r3 = defpackage.pw.a(r4, r2)
            if (r3 == 0) goto L6b
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r3 < r4) goto L60
            android.app.AppOpsManager r3 = defpackage.x5.c(r6)
            int r4 = android.os.Binder.getCallingUid()
            int r2 = defpackage.x5.a(r3, r7, r4, r2)
            if (r2 == 0) goto L57
            goto L75
        L57:
            java.lang.String r6 = defpackage.x5.b(r6)
            int r2 = defpackage.x5.a(r3, r7, r1, r6)
            goto L75
        L60:
            java.lang.Object r6 = defpackage.w5.a(r6, r5)
            android.app.AppOpsManager r6 = (android.app.AppOpsManager) r6
            int r2 = defpackage.w5.c(r6, r7, r2)
            goto L75
        L6b:
            java.lang.Object r6 = defpackage.w5.a(r6, r5)
            android.app.AppOpsManager r6 = (android.app.AppOpsManager) r6
            int r2 = defpackage.w5.c(r6, r7, r2)
        L75:
            if (r2 != 0) goto L78
        L77:
            return r0
        L78:
            r6 = -2
            return r6
    }

    public static void d(java.io.Closeable r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.io.IOException -> L5
        L5:
            return
    }

    public static int e(int r2, int r3) {
            if (r3 < 0) goto La
            if (r2 >= 0) goto L6
            r2 = 0
            return r2
        L6:
            if (r2 <= r3) goto L9
            return r3
        L9:
            return r2
        La:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot coerce value to an empty range: maximum "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = " is less than minimum 0."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    public static boolean f(java.io.File r0, android.content.res.Resources r1, int r2) {
            java.io.InputStream r1 = r1.openRawResource(r2)     // Catch: java.lang.Throwable -> Le
            boolean r0 = g(r0, r1)     // Catch: java.lang.Throwable -> Lc
            d(r1)
            return r0
        Lc:
            r0 = move-exception
            goto L10
        Le:
            r0 = move-exception
            r1 = 0
        L10:
            d(r1)
            throw r0
    }

    public static boolean g(java.io.File r5, java.io.InputStream r6) {
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.allowThreadDiskWrites()
            r1 = 0
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2a
            r3.<init>(r5, r1)     // Catch: java.lang.Throwable -> L28 java.io.IOException -> L2a
            r5 = 1024(0x400, float:1.435E-42)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1d
        Lf:
            int r2 = r6.read(r5)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1d
            r4 = -1
            if (r2 == r4) goto L20
            r3.write(r5, r1, r2)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1d
            goto Lf
        L1a:
            r5 = move-exception
            r2 = r3
            goto L4c
        L1d:
            r5 = move-exception
            r2 = r3
            goto L2b
        L20:
            d(r3)
            android.os.StrictMode.setThreadPolicy(r0)
            r5 = 1
            return r5
        L28:
            r5 = move-exception
            goto L4c
        L2a:
            r5 = move-exception
        L2b:
            java.lang.String r6 = "TypefaceCompatUtil"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L28
            r3.<init>()     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = "Error copying resource contents to temp file: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L28
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L28
            r3.append(r5)     // Catch: java.lang.Throwable -> L28
            java.lang.String r5 = r3.toString()     // Catch: java.lang.Throwable -> L28
            android.util.Log.e(r6, r5)     // Catch: java.lang.Throwable -> L28
            d(r2)
            android.os.StrictMode.setThreadPolicy(r0)
            return r1
        L4c:
            d(r2)
            android.os.StrictMode.setThreadPolicy(r0)
            throw r5
    }

    public static defpackage.ip h(int r1) {
            if (r1 == 0) goto L11
            r0 = 1
            if (r1 == r0) goto Lb
            h10 r1 = new h10
            r1.<init>()
            return r1
        Lb:
            ze r1 = new ze
            r1.<init>()
            return r1
        L11:
            h10 r1 = new h10
            r1.<init>()
            return r1
    }

    public static boolean i(java.lang.String r3) {
            java.lang.String r0 = "ggWA\n"
            java.lang.String r1 = "6WD5BmkcYhM=\n"
            java.lang.String r0 = "key"
            defpackage.ip.o(r0, r3)
            gn r0 = defpackage.gn.a     // Catch: java.lang.Throwable -> L15
            r0.getClass()     // Catch: java.lang.Throwable -> L15
            boolean r3 = defpackage.gn.e(r3)     // Catch: java.lang.Throwable -> L15
            return r3
        L15:
            r0 = 0
            gn r1 = defpackage.gn.a     // Catch: java.lang.Throwable -> L40
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L40
            r1.getClass()     // Catch: java.lang.Throwable -> L40
            java.lang.String r3 = defpackage.gn.d(r3, r2)     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = "true"
            boolean r1 = r3.equals(r1)     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L2e
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L40
            goto L3a
        L2e:
            java.lang.String r1 = "false"
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L40
            if (r3 == 0) goto L39
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L40
            goto L3a
        L39:
            r3 = 0
        L3a:
            if (r3 == 0) goto L40
            boolean r0 = r3.booleanValue()     // Catch: java.lang.Throwable -> L40
        L40:
            return r0
    }

    public static int j(java.lang.String r2, int r3) {
            java.lang.String r0 = "aYbW\n"
            java.lang.String r1 = "AuOvGSdAksw=\n"
            java.lang.String r0 = "key"
            defpackage.ip.o(r0, r2)
            gn r0 = defpackage.gn.a     // Catch: java.lang.Throwable -> L15
            r0.getClass()     // Catch: java.lang.Throwable -> L15
            int r2 = defpackage.gn.b(r2, r3)     // Catch: java.lang.Throwable -> L15
            return r2
        L15:
            gn r0 = defpackage.gn.a     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L2c
            r0.getClass()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = defpackage.gn.d(r2, r1)     // Catch: java.lang.Throwable -> L2c
            java.lang.Integer r2 = defpackage.b50.R(r2)     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L2c
            int r3 = r2.intValue()     // Catch: java.lang.Throwable -> L2c
        L2c:
            return r3
    }

    public static java.io.File k(android.content.Context r5) {
            java.io.File r5 = r5.getCacheDir()
            r0 = 0
            if (r5 != 0) goto L8
            return r0
        L8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ".font"
            r1.<init>(r2)
            int r2 = android.os.Process.myPid()
            r1.append(r2)
            java.lang.String r2 = "-"
            r1.append(r2)
            int r3 = android.os.Process.myTid()
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
        L2a:
            r3 = 100
            if (r2 >= r3) goto L4c
            java.io.File r3 = new java.io.File
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            r3.<init>(r5, r4)
            boolean r4 = r3.createNewFile()     // Catch: java.io.IOException -> L49
            if (r4 == 0) goto L49
            return r3
        L49:
            int r2 = r2 + 1
            goto L2a
        L4c:
            return r0
    }

    public static boolean n(android.view.View r1) {
            java.util.WeakHashMap r0 = defpackage.ja0.a
            int r1 = defpackage.t90.d(r1)
            r0 = 1
            if (r1 != r0) goto La
            return r0
        La:
            r1 = 0
            return r1
    }

    public static java.nio.MappedByteBuffer o(android.content.Context r8, android.net.Uri r9) {
            android.content.ContentResolver r8 = r8.getContentResolver()
            r1 = 0
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r8 = defpackage.f80.a(r8, r9, r0, r1)     // Catch: java.io.IOException -> L4c
            if (r8 != 0) goto L13
            if (r8 == 0) goto L4c
            r8.close()     // Catch: java.io.IOException -> L4c
            return r1
        L13:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L33
            java.io.FileDescriptor r0 = r8.getFileDescriptor()     // Catch: java.lang.Throwable -> L33
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L33
            java.nio.channels.FileChannel r2 = r9.getChannel()     // Catch: java.lang.Throwable -> L36
            long r6 = r2.size()     // Catch: java.lang.Throwable -> L36
            java.nio.channels.FileChannel$MapMode r3 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L36
            r4 = 0
            java.nio.MappedByteBuffer r0 = r2.map(r3, r4, r6)     // Catch: java.lang.Throwable -> L36
            r9.close()     // Catch: java.lang.Throwable -> L33
            r8.close()     // Catch: java.io.IOException -> L4c
            return r0
        L33:
            r0 = move-exception
            r9 = r0
            goto L42
        L36:
            r0 = move-exception
            r2 = r0
            r9.close()     // Catch: java.lang.Throwable -> L3c
            goto L41
        L3c:
            r0 = move-exception
            r9 = r0
            r2.addSuppressed(r9)     // Catch: java.lang.Throwable -> L33
        L41:
            throw r2     // Catch: java.lang.Throwable -> L33
        L42:
            r8.close()     // Catch: java.lang.Throwable -> L46
            goto L4b
        L46:
            r0 = move-exception
            r8 = r0
            r9.addSuppressed(r8)     // Catch: java.io.IOException -> L4c
        L4b:
            throw r9     // Catch: java.io.IOException -> L4c
        L4c:
            return r1
    }

    public static android.graphics.PorterDuff.Mode v(int r1, android.graphics.PorterDuff.Mode r2) {
            r0 = 3
            if (r1 == r0) goto L1d
            r0 = 5
            if (r1 == r0) goto L1a
            r0 = 9
            if (r1 == r0) goto L17
            switch(r1) {
                case 14: goto L14;
                case 15: goto L11;
                case 16: goto Le;
                default: goto Ld;
            }
        Ld:
            return r2
        Le:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.ADD
            return r1
        L11:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SCREEN
            return r1
        L14:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
            return r1
        L17:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_ATOP
            return r1
        L1a:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN
            return r1
        L1d:
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_OVER
            return r1
    }

    public static void w(android.app.Activity r17, java.lang.Object r18, java.lang.String r19) {
            r1 = r17
            r0 = r18
            java.lang.String r2 = "c8HJlSTQVfc=\n"
            java.lang.String r3 = "Fg==\n"
            java.lang.String r4 = "Q2m5jaPP2Zc=\n"
            java.lang.String r5 = "Nwje\n"
            java.lang.reflect.Field r6 = defpackage.in.g
            r7 = 0
            if (r6 == 0) goto L16
            java.lang.Object r6 = r6.get(r0)
            goto L17
        L16:
            r6 = r7
        L17:
            boolean r8 = r6 instanceof java.lang.String
            if (r8 == 0) goto L1e
            java.lang.String r6 = (java.lang.String) r6
            goto L1f
        L1e:
            r6 = r7
        L1f:
            java.lang.String r8 = ""
            if (r6 == 0) goto L2d
            java.lang.CharSequence r6 = defpackage.b50.T(r6)
            java.lang.String r6 = r6.toString()
            if (r6 != 0) goto L2e
        L2d:
            r6 = r8
        L2e:
            java.lang.reflect.Field r9 = defpackage.in.h
            if (r9 == 0) goto L37
            java.lang.Object r0 = r9.get(r0)
            goto L38
        L37:
            r0 = r7
        L38:
            boolean r9 = r0 instanceof java.lang.String
            if (r9 == 0) goto L3f
            java.lang.String r0 = (java.lang.String) r0
            goto L40
        L3f:
            r0 = r7
        L40:
            if (r0 != 0) goto L43
            r0 = r8
        L43:
            i00 r9 = defpackage.i9.k
            d4 r9 = defpackage.i00.a(r9, r0)
            if (r9 == 0) goto L5a
            java.util.List r0 = r9.t()
            r6 = 1
            ft r0 = (defpackage.ft) r0
            java.lang.Object r0 = r0.get(r6)
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            goto L83
        L5a:
            i00 r9 = defpackage.i9.l
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            java.lang.String r6 = " "
            r10.append(r6)
            r10.append(r0)
            java.lang.String r0 = r10.toString()
            d4 r0 = defpackage.i00.a(r9, r0)
            if (r0 == 0) goto L83
            java.lang.Object r0 = r0.b
            java.util.regex.Matcher r0 = (java.util.regex.Matcher) r0
            java.lang.String r8 = r0.group()
            java.lang.String r0 = "group(...)"
            defpackage.ip.n(r0, r8)
        L83:
            int r0 = r8.length()
            if (r0 != 0) goto L8a
            goto L92
        L8a:
            int r0 = r8.length()
            r6 = 32
            if (r0 == r6) goto La3
        L92:
            gn r0 = defpackage.gn.a
            java.lang.String r2 = "PLLKDS8X4gd59fRGlrJL++H17XtJHZBacKKKXwk=\n"
            java.lang.String r3 = "1BNi66ySBr8=\n"
            java.lang.String r2 = "\u8868\u60c5\u4e2d\u65ad: MD5\u63d0\u53d6\u5931\u8d25"
            r0.getClass()
            defpackage.gn.k(r1, r2)
            return
        La3:
            java.lang.String r0 = defpackage.pb0.G     // Catch: java.lang.Throwable -> Lf0
            java.lang.ClassLoader r6 = defpackage.d9.a     // Catch: java.lang.Throwable -> Lf0
            java.lang.Class r0 = de.robv.android.xposed.XposedHelpers.findClassIfExists(r0, r6)     // Catch: java.lang.Throwable -> Lf0
            java.util.List r6 = defpackage.pb0.I0     // Catch: java.lang.Throwable -> Lf0
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> Lf0
            r9 = r7
        Lb2:
            boolean r10 = r6.hasNext()     // Catch: java.lang.Throwable -> Lf0
            if (r10 == 0) goto Lf3
            java.lang.Object r10 = r6.next()     // Catch: java.lang.Throwable -> Lf0
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> Lf0
            java.lang.ClassLoader r11 = defpackage.d9.a     // Catch: java.lang.Throwable -> Lf0
            java.lang.Class r11 = de.robv.android.xposed.XposedHelpers.findClassIfExists(r10, r11)     // Catch: java.lang.Throwable -> Lf0
            if (r11 != 0) goto Lc7
            goto Lb2
        Lc7:
            java.lang.String r12 = defpackage.pb0.t     // Catch: java.lang.Throwable -> Ld4
            java.lang.Object[] r13 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> Ld4
            java.lang.Object r9 = de.robv.android.xposed.XposedHelpers.callStaticMethod(r11, r12, r13)     // Catch: java.lang.Throwable -> Ld4
            if (r9 == 0) goto Lb2
            goto Lf3
        Ld4:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf0
            r11.<init>()     // Catch: java.lang.Throwable -> Lf0
            java.lang.String r12 = "EmojiRepeat_Locate_Failed for class: "
            r11.append(r12)     // Catch: java.lang.Throwable -> Lf0
            r11.append(r10)     // Catch: java.lang.Throwable -> Lf0
            java.lang.String r10 = r11.toString()     // Catch: java.lang.Throwable -> Lf0
            java.lang.String r11 = defpackage.u40.a(r5, r4)     // Catch: java.lang.Throwable -> Lf0
            defpackage.ip.o(r11, r10)     // Catch: java.lang.Throwable -> Lf0
            defpackage.u40.a(r3, r2)     // Catch: java.lang.Throwable -> Lf0
            goto Lb2
        Lf0:
            r0 = move-exception
            goto L1dd
        Lf3:
            if (r9 != 0) goto L107
            gn r0 = defpackage.gn.a     // Catch: java.lang.Throwable -> Lf0
            java.lang.String r6 = "aIrkjr4ZCr0tzdrFB7wIkiDN//3VElngD72kyZV6bYBlo8qNsg3ORNBi\n"
            java.lang.String r7 = "gCtMaD2c7gU=\n"
            java.lang.String r6 = "\u8868\u60c5\u4e2d\u65ad: \u65e0\u6cd5\u83b7\u53d6\u8868\u60c5\u5206\u53d1 API"     // Catch: java.lang.Throwable -> Lf0
            r0.getClass()     // Catch: java.lang.Throwable -> Lf0
            defpackage.gn.k(r1, r6)     // Catch: java.lang.Throwable -> Lf0
            goto L200
        L107:
            java.lang.String r0 = defpackage.pb0.g     // Catch: java.lang.Throwable -> Lf0
            java.lang.ClassLoader r6 = defpackage.d9.a     // Catch: java.lang.Throwable -> Lf0
            java.lang.Class r0 = de.robv.android.xposed.XposedHelpers.findClassIfExists(r0, r6)     // Catch: java.lang.Throwable -> Lf0
            java.lang.String r6 = defpackage.pb0.M0     // Catch: java.lang.Throwable -> Lf0
            r10 = 0
            int r11 = r6.length()     // Catch: java.lang.Throwable -> L11f
            if (r11 <= 0) goto L13a
            java.lang.Object[] r11 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> L11f
            java.lang.Object r7 = de.robv.android.xposed.XposedHelpers.callStaticMethod(r0, r6, r11)     // Catch: java.lang.Throwable -> L11f
            goto L13a
        L11f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf0
            r0.<init>()     // Catch: java.lang.Throwable -> Lf0
            java.lang.String r11 = "EmojiRepeat_Inst_Failed for method: "
            r0.append(r11)     // Catch: java.lang.Throwable -> Lf0
            r0.append(r6)     // Catch: java.lang.Throwable -> Lf0
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lf0
            java.lang.String r6 = defpackage.u40.a(r5, r4)     // Catch: java.lang.Throwable -> Lf0
            defpackage.ip.o(r6, r0)     // Catch: java.lang.Throwable -> Lf0
            defpackage.u40.a(r3, r2)     // Catch: java.lang.Throwable -> Lf0
        L13a:
            if (r7 == 0) goto L1cc
            java.lang.String r0 = defpackage.pb0.E     // Catch: java.lang.Throwable -> Lf0
            java.lang.Object[] r6 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> Lf0
            java.lang.Object r0 = de.robv.android.xposed.XposedHelpers.callMethod(r7, r0, r6)     // Catch: java.lang.Throwable -> Lf0
            java.lang.String r6 = defpackage.pb0.F     // Catch: java.lang.Throwable -> Lf0
            java.lang.Object[] r7 = new java.lang.Object[]{r8}     // Catch: java.lang.Throwable -> Lf0
            java.lang.Object r12 = de.robv.android.xposed.XposedHelpers.callMethod(r0, r6, r7)     // Catch: java.lang.Throwable -> Lf0
            if (r12 == 0) goto L1bb
            java.lang.String r0 = defpackage.pb0.v0     // Catch: java.lang.Throwable -> Lf0
            java.lang.ClassLoader r6 = defpackage.d9.a     // Catch: java.lang.Throwable -> Lf0
            java.lang.Class r0 = de.robv.android.xposed.XposedHelpers.findClass(r0, r6)     // Catch: java.lang.Throwable -> Lf0
            r6 = 0
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> Lf0
            r11 = r19
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r11}     // Catch: java.lang.Throwable -> Lf0
            java.lang.Object r14 = de.robv.android.xposed.XposedHelpers.newInstance(r0, r6)     // Catch: java.lang.Throwable -> Lf0
            java.lang.String r0 = defpackage.pb0.k0     // Catch: java.lang.Throwable -> Lf0
            java.lang.Integer r16 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L179
            r13 = 0
            r15 = 0
            java.lang.Object[] r6 = new java.lang.Object[]{r11, r12, r13, r14, r15, r16}     // Catch: java.lang.Throwable -> L179
            de.robv.android.xposed.XposedHelpers.callMethod(r9, r0, r6)     // Catch: java.lang.Throwable -> L179
            goto L200
        L179:
            gn r6 = defpackage.gn.a     // Catch: java.lang.Throwable -> Lf0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf0
            r7.<init>()     // Catch: java.lang.Throwable -> Lf0
            java.lang.String r9 = "表情接口调用失败：参数未对齐或方法("
            r7.append(r9)     // Catch: java.lang.Throwable -> Lf0
            r7.append(r0)     // Catch: java.lang.Throwable -> Lf0
            java.lang.String r9 = ")失效"
            r7.append(r9)     // Catch: java.lang.Throwable -> Lf0
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Lf0
            r6.getClass()     // Catch: java.lang.Throwable -> Lf0
            defpackage.gn.k(r1, r7)     // Catch: java.lang.Throwable -> Lf0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf0
            r6.<init>()     // Catch: java.lang.Throwable -> Lf0
            java.lang.String r7 = "EmojiRepeat_Invoke_Failed for targetNh: "
            r6.append(r7)     // Catch: java.lang.Throwable -> Lf0
            r6.append(r0)     // Catch: java.lang.Throwable -> Lf0
            java.lang.String r0 = ", md5: "
            r6.append(r0)     // Catch: java.lang.Throwable -> Lf0
            r6.append(r8)     // Catch: java.lang.Throwable -> Lf0
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> Lf0
            java.lang.String r6 = defpackage.u40.a(r5, r4)     // Catch: java.lang.Throwable -> Lf0
            defpackage.ip.o(r6, r0)     // Catch: java.lang.Throwable -> Lf0
            defpackage.u40.a(r3, r2)     // Catch: java.lang.Throwable -> Lf0
            goto L200
        L1bb:
            gn r0 = defpackage.gn.a     // Catch: java.lang.Throwable -> Lf0
            java.lang.String r6 = "E9SjSRC5TS1cj4cNR6UWV1vO5QwH/ig0\n"
            java.lang.String r7 = "9moNra8Yq7E=\n"
            java.lang.String r6 = "\u5fae\u4fe1\u672a\u52a0\u8f7d\u6b64\u8868\u60c5"     // Catch: java.lang.Throwable -> Lf0
            r0.getClass()     // Catch: java.lang.Throwable -> Lf0
            defpackage.gn.k(r1, r6)     // Catch: java.lang.Throwable -> Lf0
            goto L200
        L1cc:
            gn r0 = defpackage.gn.a     // Catch: java.lang.Throwable -> Lf0
            java.lang.String r6 = "xTWd1Q+czdKAcqOetjnP/Y1yhqZkl56PogIVduF2QwN+4FpB7X5MSssIuNYGuA==\n"
            java.lang.String r7 = "LZQ1M4wZKWo=\n"
            java.lang.String r6 = "\u8868\u60c5\u4e2d\u65ad: \u65e0\u6cd5\u83b7\u53d6 EmojiStorage \u670d\u52a1"     // Catch: java.lang.Throwable -> Lf0
            r0.getClass()     // Catch: java.lang.Throwable -> Lf0
            defpackage.gn.k(r1, r6)     // Catch: java.lang.Throwable -> Lf0
            goto L200
        L1dd:
            gn r6 = defpackage.gn.a
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r9 = "表情分发全局异常: "
            r7.<init>(r9)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            r6.getClass()
            defpackage.gn.k(r1, r0)
            java.lang.String r0 = "EmojiRepeat_Global_Fatal for md5: "
            java.lang.String r0 = r0.concat(r8)
            defpackage.z30.o(r5, r4, r0, r3, r2)
        L200:
            return
    }

    public static defpackage.wv x(java.nio.MappedByteBuffer r13) {
            java.nio.ByteBuffer r13 = r13.duplicate()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r13.order(r0)
            int r0 = r13.position()
            int r0 = r0 + 4
            r13.position(r0)
            short r0 = r13.getShort()
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            r1 = 100
            java.lang.String r2 = "Cannot read metadata."
            if (r0 > r1) goto Ld5
            int r1 = r13.position()
            int r1 = r1 + 6
            r13.position(r1)
            r1 = 0
            r3 = r1
        L2b:
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r6 = -1
            if (r3 >= r0) goto L59
            int r8 = r13.getInt()
            int r9 = r13.position()
            int r9 = r9 + 4
            r13.position(r9)
            int r9 = r13.getInt()
            long r9 = (long) r9
            long r9 = r9 & r4
            int r11 = r13.position()
            int r11 = r11 + 4
            r13.position(r11)
            r11 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r11 != r8) goto L56
            goto L5a
        L56:
            int r3 = r3 + 1
            goto L2b
        L59:
            r9 = r6
        L5a:
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 == 0) goto Lcf
            int r0 = r13.position()
            long r6 = (long) r0
            long r6 = r9 - r6
            int r0 = (int) r6
            int r3 = r13.position()
            int r3 = r3 + r0
            r13.position(r3)
            int r0 = r13.position()
            int r0 = r0 + 12
            r13.position(r0)
            int r0 = r13.getInt()
            long r6 = (long) r0
            long r6 = r6 & r4
        L7d:
            long r11 = (long) r1
            int r0 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r0 >= 0) goto Lcf
            int r0 = r13.getInt()
            int r3 = r13.getInt()
            long r11 = (long) r3
            long r11 = r11 & r4
            r13.getInt()
            r3 = 1164798569(0x456d6a69, float:3798.6506)
            if (r3 == r0) goto L9d
            r3 = 1701669481(0x656d6a69, float:7.0072736E22)
            if (r3 != r0) goto L9a
            goto L9d
        L9a:
            int r1 = r1 + 1
            goto L7d
        L9d:
            long r11 = r11 + r9
            int r0 = (int) r11
            r13.position(r0)
            wv r0 = new wv
            r0.<init>()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN
            r13.order(r1)
            int r1 = r13.position()
            int r1 = r13.getInt(r1)
            int r2 = r13.position()
            int r2 = r2 + r1
            r0.d = r13
            r0.a = r2
            int r13 = r13.getInt(r2)
            int r2 = r2 - r13
            r0.b = r2
            java.lang.Object r13 = r0.d
            java.nio.ByteBuffer r13 = (java.nio.ByteBuffer) r13
            short r13 = r13.getShort(r2)
            r0.c = r13
            return r0
        Lcf:
            java.io.IOException r13 = new java.io.IOException
            r13.<init>(r2)
            throw r13
        Ld5:
            java.io.IOException r13 = new java.io.IOException
            r13.<init>(r2)
            throw r13
    }

    public static android.util.TypedValue y(android.content.Context r2, int r3) {
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r2 = r2.getTheme()
            r1 = 1
            boolean r2 = r2.resolveAttribute(r3, r0, r1)
            if (r2 == 0) goto L11
            return r0
        L11:
            r2 = 0
            return r2
    }

    public static boolean z(android.content.Context r1, int r2, boolean r3) {
            android.util.TypedValue r1 = y(r1, r2)
            if (r1 == 0) goto L14
            int r2 = r1.type
            r0 = 18
            if (r2 != r0) goto L14
            int r1 = r1.data
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
        L14:
            return r3
    }

    public abstract void B(boolean r1);

    public abstract void C(boolean r1);

    public abstract boolean H(android.view.View r1, int r2);

    public abstract int b(android.view.View r1, int r2);

    public abstract int c(android.view.View r1, int r2);

    public int l(android.view.View r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public int m() {
            r1 = this;
            r0 = 0
            return r0
    }

    public abstract void p(int r1);

    public abstract void q(android.graphics.Typeface r1, boolean r2);

    public void r(android.view.View r1, int r2) {
            r0 = this;
            return
    }

    public abstract void s(int r1);

    public abstract void t(android.view.View r1, int r2, int r3);

    public abstract void u(android.view.View r1, float r2, float r3);
}
