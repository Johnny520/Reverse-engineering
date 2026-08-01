package defpackage;

/* JADX INFO: renamed from: ᲈᛷᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2279 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.C0454 f9634 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C2223 f9635 = null;

    static {
            ᛳᛴᛵᛱ r0 = new ᛳᛴᛵᛱ
            java.lang.String r1 = "CLOSED"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.AbstractC2279.f9634 = r0
            ᲈᛴᛵᲈ r0 = new ᲈᛴᛵᲈ
            r1 = 4
            r0.<init>(r1)
            defpackage.AbstractC2279.f9635 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static void m3693(android.content.pm.PackageInfo r2, java.io.File r3) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r0.<init>(r3, r1)
            java.io.DataOutputStream r3 = new java.io.DataOutputStream     // Catch: java.io.IOException -> L24
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L24
            r1.<init>(r0)     // Catch: java.io.IOException -> L24
            r3.<init>(r1)     // Catch: java.io.IOException -> L24
            long r0 = r2.lastUpdateTime     // Catch: java.lang.Throwable -> L1a
            r3.writeLong(r0)     // Catch: java.lang.Throwable -> L1a
            r3.close()     // Catch: java.io.IOException -> L24
            return
        L1a:
            r2 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L1f
            goto L23
        L1f:
            r3 = move-exception
            r2.addSuppressed(r3)     // Catch: java.io.IOException -> L24
        L23:
            throw r2     // Catch: java.io.IOException -> L24
        L24:
            return
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static defpackage.C1180 m3694(java.lang.Class r4) {
            ᛶᲈᛱᲈ r0 = new ᛶᲈᛱᲈ
            ᛷᲇᛱᲈ r1 = new ᛷᲇᛱᲈ
            r2 = 1
            r3 = 0
            r1.<init>(r2, r4, r3)
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public static defpackage.C1180 m3695(java.lang.Object r4) {
            boolean r0 = r4 instanceof defpackage.C0355
            r1 = 1
            if (r0 == 0) goto L19
            ᛶᲈᛱᲈ r0 = new ᛶᲈᛱᲈ
            r2 = r4
            ᛲᲀᲈᛳ r2 = (defpackage.C0355) r2
            ᲇᲇᛲᲈ r2 = (defpackage.InterfaceC2139) r2
            java.lang.Class r2 = r2.mo1084()
            ᛷᲇᛱᲈ r3 = new ᛷᲇᛱᲈ
            r3.<init>(r1, r2, r4)
            r0.<init>(r3)
            return r0
        L19:
            boolean r0 = r4 instanceof java.lang.Class
            if (r0 == 0) goto L2b
            ᛶᲈᛱᲈ r0 = new ᛶᲈᛱᲈ
            r2 = r4
            java.lang.Class r2 = (java.lang.Class) r2
            ᛷᲇᛱᲈ r3 = new ᛷᲇᛱᲈ
            r3.<init>(r1, r2, r4)
            r0.<init>(r3)
            return r0
        L2b:
            ᛶᲈᛱᲈ r0 = new ᛶᲈᛱᲈ
            java.lang.Class r2 = r4.getClass()
            ᛷᲇᛱᲈ r3 = new ᛷᲇᛱᲈ
            r3.<init>(r1, r2, r4)
            r0.<init>(r3)
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static java.math.BigDecimal m3696(java.lang.String r5) {
            m3700(r5)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r5)
            int r1 = r0.scale()
            long r1 = (long) r1
            long r1 = java.lang.Math.abs(r1)
            r3 = 10000(0x2710, double:4.9407E-320)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 >= 0) goto L18
            return r0
        L18:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "Number has unsupported scale: "
            java.lang.String r5 = r1.concat(r5)
            r0.<init>(r5)
            throw r0
    }

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public static final void m3697(java.lang.String r1) {
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static android.content.res.ColorStateList m3698(android.content.Context r8, int r9) {
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            ᛵᛵᛶᛴ r1 = new ᛵᛵᛶᛴ
            r1.<init>(r0, r8)
            java.lang.Object r2 = defpackage.AbstractC2064.f8871
            monitor-enter(r2)
            java.util.WeakHashMap r3 = defpackage.AbstractC2064.f8873     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r3 == 0) goto L50
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto L50
            java.lang.Object r5 = r3.get(r9)     // Catch: java.lang.Throwable -> L3c
            ᛷᲇᲈᛴ r5 = (defpackage.C1396) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L50
            android.content.res.Configuration r6 = r5.f6059     // Catch: java.lang.Throwable -> L3c
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L4d
            if (r8 != 0) goto L3f
            int r6 = r5.f6057     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L49
            goto L3f
        L3c:
            r8 = move-exception
            goto Lb8
        L3f:
            if (r8 == 0) goto L4d
            int r6 = r5.f6057     // Catch: java.lang.Throwable -> L3c
            int r7 = r8.hashCode()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r7) goto L4d
        L49:
            android.content.res.ColorStateList r3 = r5.f6058     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L52
        L4d:
            r3.remove(r9)     // Catch: java.lang.Throwable -> L3c
        L50:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            r3 = r4
        L52:
            if (r3 == 0) goto L55
            return r3
        L55:
            java.lang.ThreadLocal r2 = defpackage.AbstractC2064.f8872
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L67
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L67:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L76
            r3 = 31
            if (r2 > r3) goto L76
            goto L87
        L76:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = defpackage.AbstractC2238.m3629(r0, r2, r8)     // Catch: java.lang.Exception -> L7f
            goto L87
        L7f:
            r2 = move-exception
            java.lang.String r3 = "ResourcesCompat"
            java.lang.String r5 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r3, r5, r2)
        L87:
            if (r4 == 0) goto Lb3
            java.lang.Object r2 = defpackage.AbstractC2064.f8871
            monitor-enter(r2)
            java.util.WeakHashMap r0 = defpackage.AbstractC2064.f8873     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L9f
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L9f
            if (r3 != 0) goto La1
            android.util.SparseArray r3 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L9f
            r3.<init>()     // Catch: java.lang.Throwable -> L9f
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L9f
            goto La1
        L9f:
            r8 = move-exception
            goto Lb1
        La1:
            ᛷᲇᲈᛴ r0 = new ᛷᲇᲈᛴ     // Catch: java.lang.Throwable -> L9f
            android.content.res.Resources r1 = r1.f4009     // Catch: java.lang.Throwable -> L9f
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.Throwable -> L9f
            r0.<init>(r4, r1, r8)     // Catch: java.lang.Throwable -> L9f
            r3.append(r9, r0)     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            goto Lb7
        Lb1:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            throw r8
        Lb3:
            android.content.res.ColorStateList r4 = r0.getColorStateList(r9, r8)
        Lb7:
            return r4
        Lb8:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r8
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static final java.lang.Object m3699(defpackage.C2053 r6, long r7, defpackage.InterfaceC2087 r9) {
        L0:
            r1 = r6
        L1:
            long r2 = r1.f2995
            int r6 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r6 < 0) goto Lf
            boolean r6 = r1.mo1062()
            if (r6 == 0) goto Le
            goto Lf
        Le:
            return r1
        Lf:
            sun.misc.Unsafe r6 = defpackage.AbstractC0051.f569
            long r2 = defpackage.AbstractC0351.f1815
            java.lang.Object r6 = r6.getObjectVolatile(r1, r2)
            ᛳᛴᛵᛱ r0 = defpackage.AbstractC2279.f9634
            if (r6 != r0) goto L1c
            return r0
        L1c:
            ᛲᲀᛵᲈ r6 = (defpackage.AbstractC0351) r6
            ᛴᛱᛴᛳ r6 = (defpackage.AbstractC0606) r6
            if (r6 == 0) goto L23
            goto L0
        L23:
            long r2 = r1.f2995
            r4 = 1
            long r2 = r2 + r4
            java.lang.Long r6 = java.lang.Long.valueOf(r2)
            java.lang.Object r6 = r9.mo388(r6, r1)
            r5 = r6
            ᛴᛱᛴᛳ r5 = (defpackage.AbstractC0606) r5
        L33:
            sun.misc.Unsafe r0 = defpackage.AbstractC0051.f569
            long r2 = defpackage.AbstractC0351.f1815
            r4 = 0
            boolean r6 = r0.compareAndSwapObject(r1, r2, r4, r5)
            if (r6 == 0) goto L49
            boolean r6 = r1.mo1062()
            if (r6 == 0) goto L47
            r1.m1061()
        L47:
            r1 = r5
            goto L1
        L49:
            java.lang.Object r6 = r0.getObjectVolatile(r1, r2)
            if (r6 == 0) goto L33
            goto L1
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static void m3700(java.lang.String r3) {
            int r0 = r3.length()
            r1 = 10000(0x2710, float:1.4013E-41)
            if (r0 > r1) goto L9
            return
        L9:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 0
            r2 = 30
            java.lang.String r3 = r3.substring(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Number string too large: "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = "..."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static android.graphics.PorterDuff.Mode m3701(int r2) {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r1 = 3
            if (r2 == r1) goto L1d
            r1 = 5
            if (r2 == r1) goto L1c
            r1 = 9
            if (r2 == r1) goto L19
            switch(r2) {
                case 14: goto L16;
                case 15: goto L13;
                case 16: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L1c
        L10:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.ADD
            return r2
        L13:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SCREEN
            return r2
        L16:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY
            return r2
        L19:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_ATOP
            return r2
        L1c:
            return r0
        L1d:
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_OVER
            return r2
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final long m3702() {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            long r0 = r0.getId()
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final void m3703(defpackage.InterfaceC0493 r3, java.lang.Throwable r4) {
            ᛷᲈᲀ r0 = defpackage.C1403.f6104     // Catch: java.lang.Throwable -> Lf
            ᛶᲁᛳᲈ r0 = r3.mo970(r0)     // Catch: java.lang.Throwable -> Lf
            ᛲᛲᲀᛸ r0 = (defpackage.C0258) r0     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto Lb
            return
        Lb:
            defpackage.AbstractC1533.m2781(r3, r4)
            return
        Lf:
            r0 = move-exception
            if (r4 != r0) goto L13
            goto L1e
        L13:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Exception while trying to handle coroutine exception"
            r1.<init>(r2, r0)
            defpackage.AbstractC2193.m3595(r1, r4)
            r4 = r1
        L1e:
            defpackage.AbstractC1533.m2781(r3, r4)
            return
    }

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public static void m3704(android.content.Context r18, java.util.concurrent.Executor r19, defpackage.InterfaceC1429 r20, boolean r21) {
            r1 = r18
            r5 = r20
            android.content.Context r0 = r1.getApplicationContext()
            java.lang.String r2 = r0.getPackageName()
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo()
            android.content.res.AssetManager r4 = r0.getAssets()
            java.io.File r0 = new java.io.File
            java.lang.String r3 = r3.sourceDir
            r0.<init>(r3)
            java.lang.String r6 = r0.getName()
            android.content.pm.PackageManager r0 = r1.getPackageManager()
            r8 = 7
            r9 = 0
            android.content.pm.PackageInfo r10 = r0.getPackageInfo(r2, r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L2d2
            java.io.File r11 = r1.getFilesDir()
            java.lang.String r3 = "ProfileInstaller"
            r12 = 0
            if (r21 != 0) goto L8c
            java.io.File r0 = new java.io.File
            java.lang.String r7 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r0.<init>(r11, r7)
            boolean r7 = r0.exists()
            if (r7 != 0) goto L41
        L3f:
            r0 = r9
            goto L6f
        L41:
            java.io.DataInputStream r7 = new java.io.DataInputStream     // Catch: java.io.IOException -> L3f
            java.io.FileInputStream r14 = new java.io.FileInputStream     // Catch: java.io.IOException -> L3f
            r14.<init>(r0)     // Catch: java.io.IOException -> L3f
            r7.<init>(r14)     // Catch: java.io.IOException -> L3f
            long r14 = r7.readLong()     // Catch: java.lang.Throwable -> L64
            r7.close()     // Catch: java.io.IOException -> L3f
            r16 = r14
            long r13 = r10.lastUpdateTime
            int r0 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r0 != 0) goto L5c
            r0 = 1
            goto L5d
        L5c:
            r0 = r9
        L5d:
            if (r0 == 0) goto L6f
            r7 = 2
            r5.mo2293(r7, r12)
            goto L6f
        L64:
            r0 = move-exception
            r13 = r0
            r7.close()     // Catch: java.lang.Throwable -> L6a
            goto L6e
        L6a:
            r0 = move-exception
            r13.addSuppressed(r0)     // Catch: java.io.IOException -> L3f
        L6e:
            throw r13     // Catch: java.io.IOException -> L3f
        L6f:
            if (r0 != 0) goto L72
            goto L8c
        L72:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Skipping profile installation for "
            r0.<init>(r2)
            java.lang.String r2 = r1.getPackageName()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r3, r0)
            defpackage.AbstractC0411.m1168(r1, r9)
            goto L2d1
        L8c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r7 = "Installing profile for "
            r0.<init>(r7)
            java.lang.String r7 = r1.getPackageName()
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r3, r0)
            byte[] r13 = defpackage.AbstractC1628.f7224
            java.io.File r7 = new java.io.File
            java.io.File r0 = new java.io.File
            java.lang.String r3 = "/data/misc/profiles/cur/0"
            r0.<init>(r3, r2)
            java.lang.String r2 = "primary.prof"
            r7.<init>(r0, r2)
            ᛸᛸᲀᛳ r2 = new ᛸᛸᲀᛳ
            java.lang.String r0 = "dexopt/baseline.prof"
            r3 = r4
            r4 = r19
            r2.<init>(r3, r4, r5, r6, r7)
            byte[] r4 = r2.f6868
            if (r4 != 0) goto Lcc
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3 = 3
            r2.m2825(r3, r0)
        Lc9:
            r7 = 1
            goto L2c6
        Lcc:
            boolean r6 = r7.exists()
            r14 = 4
            if (r6 == 0) goto Ldf
            boolean r6 = r7.canWrite()
            if (r6 != 0) goto Ldd
            r2.m2825(r14, r12)
            goto Lc9
        Ldd:
            r6 = 1
            goto Lec
        Ldf:
            boolean r6 = r7.createNewFile()     // Catch: java.io.IOException -> Le9
            if (r6 != 0) goto Ldd
            r2.m2825(r14, r12)     // Catch: java.io.IOException -> Le9
            goto Lc9
        Le9:
            r7 = 1
            goto L2c3
        Lec:
            r2.f6871 = r6
            r6 = 6
            java.io.FileInputStream r0 = r2.m2824(r3, r0)     // Catch: java.io.IOException -> Lf5 java.io.FileNotFoundException -> Lfa
            r7 = r0
            goto Lff
        Lf5:
            r0 = move-exception
            r5.mo2293(r8, r0)
            goto Lfe
        Lfa:
            r0 = move-exception
            r5.mo2293(r6, r0)
        Lfe:
            r7 = r12
        Lff:
            java.lang.String r15 = "Invalid magic"
            r6 = 8
            if (r7 == 0) goto L14c
            byte[] r0 = defpackage.AbstractC1628.m2949(r7, r14)     // Catch: java.lang.Throwable -> L122 java.lang.IllegalStateException -> L125 java.io.IOException -> L127
            boolean r0 = java.util.Arrays.equals(r13, r0)     // Catch: java.lang.Throwable -> L122 java.lang.IllegalStateException -> L125 java.io.IOException -> L127
            if (r0 == 0) goto L129
            byte[] r0 = defpackage.AbstractC1628.m2949(r7, r14)     // Catch: java.lang.Throwable -> L122 java.lang.IllegalStateException -> L125 java.io.IOException -> L127
            java.lang.String r9 = r2.f6866     // Catch: java.lang.Throwable -> L122 java.lang.IllegalStateException -> L125 java.io.IOException -> L127
            ᛶᛵᛲᛶ[] r9 = defpackage.AbstractC1628.m2978(r7, r0, r9)     // Catch: java.lang.Throwable -> L122 java.lang.IllegalStateException -> L125 java.io.IOException -> L127
            r7.close()     // Catch: java.io.IOException -> L11d
            goto L140
        L11d:
            r0 = move-exception
            r5.mo2293(r8, r0)
            goto L140
        L122:
            r0 = move-exception
            r1 = r0
            goto L143
        L125:
            r0 = move-exception
            goto L12f
        L127:
            r0 = move-exception
            goto L13b
        L129:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L122 java.lang.IllegalStateException -> L125 java.io.IOException -> L127
            r0.<init>(r15)     // Catch: java.lang.Throwable -> L122 java.lang.IllegalStateException -> L125 java.io.IOException -> L127
            throw r0     // Catch: java.lang.Throwable -> L122 java.lang.IllegalStateException -> L125 java.io.IOException -> L127
        L12f:
            r5.mo2293(r6, r0)     // Catch: java.lang.Throwable -> L122
        L132:
            r7.close()     // Catch: java.io.IOException -> L136
            goto L13f
        L136:
            r0 = move-exception
            r5.mo2293(r8, r0)
            goto L13f
        L13b:
            r5.mo2293(r8, r0)     // Catch: java.lang.Throwable -> L122
            goto L132
        L13f:
            r9 = r12
        L140:
            r2.f6872 = r9
            goto L14c
        L143:
            r7.close()     // Catch: java.io.IOException -> L147
            goto L14b
        L147:
            r0 = move-exception
            r5.mo2293(r8, r0)
        L14b:
            throw r1
        L14c:
            ᛶᛵᛲᛶ[] r0 = r2.f6872
            if (r0 == 0) goto L1aa
            int r7 = android.os.Build.VERSION.SDK_INT
            r9 = 31
            if (r7 < r9) goto L1aa
            java.lang.String r7 = "dexopt/baseline.profm"
            java.io.FileInputStream r3 = r2.m2824(r3, r7)     // Catch: java.lang.IllegalStateException -> L179 java.io.IOException -> L17b java.io.FileNotFoundException -> L17d
            if (r3 == 0) goto L191
            byte[] r7 = defpackage.AbstractC1628.f7223     // Catch: java.lang.Throwable -> L17f
            byte[] r9 = defpackage.AbstractC1628.m2949(r3, r14)     // Catch: java.lang.Throwable -> L17f
            boolean r7 = java.util.Arrays.equals(r7, r9)     // Catch: java.lang.Throwable -> L17f
            if (r7 == 0) goto L182
            byte[] r7 = defpackage.AbstractC1628.m2949(r3, r14)     // Catch: java.lang.Throwable -> L17f
            ᛶᛵᛲᛶ[] r0 = defpackage.AbstractC1628.m2960(r3, r7, r4, r0)     // Catch: java.lang.Throwable -> L17f
            r2.f6872 = r0     // Catch: java.lang.Throwable -> L17f
            r3.close()     // Catch: java.lang.IllegalStateException -> L179 java.io.IOException -> L17b java.io.FileNotFoundException -> L17d
            r0 = r2
            goto L1a7
        L179:
            r0 = move-exception
            goto L197
        L17b:
            r0 = move-exception
            goto L19d
        L17d:
            r0 = move-exception
            goto L1a1
        L17f:
            r0 = move-exception
            r4 = r0
            goto L188
        L182:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L17f
            r0.<init>(r15)     // Catch: java.lang.Throwable -> L17f
            throw r0     // Catch: java.lang.Throwable -> L17f
        L188:
            r3.close()     // Catch: java.lang.Throwable -> L18c
            goto L190
        L18c:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: java.lang.IllegalStateException -> L179 java.io.IOException -> L17b java.io.FileNotFoundException -> L17d
        L190:
            throw r4     // Catch: java.lang.IllegalStateException -> L179 java.io.IOException -> L17b java.io.FileNotFoundException -> L17d
        L191:
            if (r3 == 0) goto L1a6
            r3.close()     // Catch: java.lang.IllegalStateException -> L179 java.io.IOException -> L17b java.io.FileNotFoundException -> L17d
            goto L1a6
        L197:
            r2.f6872 = r12
            r5.mo2293(r6, r0)
            goto L1a6
        L19d:
            r5.mo2293(r8, r0)
            goto L1a6
        L1a1:
            r3 = 9
            r5.mo2293(r3, r0)
        L1a6:
            r0 = r12
        L1a7:
            if (r0 == 0) goto L1aa
            r2 = r0
        L1aa:
            ᛸᛲᛱᲈ r3 = r2.f6870
            ᛶᛵᛲᛶ[] r0 = r2.f6872
            byte[] r4 = r2.f6868
            java.lang.String r5 = "This device doesn't support aot. Did you call deviceSupportsAotProfile()?"
            if (r0 == 0) goto L1fe
            if (r4 != 0) goto L1b7
            goto L1fe
        L1b7:
            boolean r7 = r2.f6871
            if (r7 == 0) goto L1fa
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch: java.lang.IllegalStateException -> L1d6 java.io.IOException -> L1d8
            r7.<init>()     // Catch: java.lang.IllegalStateException -> L1d6 java.io.IOException -> L1d8
            r7.write(r13)     // Catch: java.lang.Throwable -> L1da
            r7.write(r4)     // Catch: java.lang.Throwable -> L1da
            boolean r0 = defpackage.AbstractC1628.m2979(r7, r4, r0)     // Catch: java.lang.Throwable -> L1da
            if (r0 != 0) goto L1dd
            r0 = 5
            r3.mo2293(r0, r12)     // Catch: java.lang.Throwable -> L1da
            r2.f6872 = r12     // Catch: java.lang.Throwable -> L1da
            r7.close()     // Catch: java.lang.IllegalStateException -> L1d6 java.io.IOException -> L1d8
            goto L1fe
        L1d6:
            r0 = move-exception
            goto L1f0
        L1d8:
            r0 = move-exception
            goto L1f4
        L1da:
            r0 = move-exception
            r4 = r0
            goto L1e7
        L1dd:
            byte[] r0 = r7.toByteArray()     // Catch: java.lang.Throwable -> L1da
            r2.f6865 = r0     // Catch: java.lang.Throwable -> L1da
            r7.close()     // Catch: java.lang.IllegalStateException -> L1d6 java.io.IOException -> L1d8
            goto L1f7
        L1e7:
            r7.close()     // Catch: java.lang.Throwable -> L1eb
            goto L1ef
        L1eb:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: java.lang.IllegalStateException -> L1d6 java.io.IOException -> L1d8
        L1ef:
            throw r4     // Catch: java.lang.IllegalStateException -> L1d6 java.io.IOException -> L1d8
        L1f0:
            r3.mo2293(r6, r0)
            goto L1f7
        L1f4:
            r3.mo2293(r8, r0)
        L1f7:
            r2.f6872 = r12
            goto L1fe
        L1fa:
            defpackage.C2264.m3676(r5)
            return
        L1fe:
            byte[] r0 = r2.f6865
            if (r0 != 0) goto L206
            r6 = 0
            r7 = 1
            goto L2b3
        L206:
            boolean r3 = r2.f6871
            if (r3 == 0) goto L2bf
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L24c java.io.IOException -> L2a0 java.io.FileNotFoundException -> L2a3
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L24c java.io.IOException -> L2a0 java.io.FileNotFoundException -> L2a3
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L294
            java.io.File r0 = r2.f6867     // Catch: java.lang.Throwable -> L294
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L294
            java.nio.channels.FileChannel r5 = r4.getChannel()     // Catch: java.lang.Throwable -> L288
            java.nio.channels.FileLock r6 = r5.tryLock()     // Catch: java.lang.Throwable -> L27a
            if (r6 == 0) goto L262
            boolean r0 = r6.isValid()     // Catch: java.lang.Throwable -> L264
            if (r0 == 0) goto L262
            r0 = 512(0x200, float:7.17E-43)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L264
        L22a:
            int r7 = r3.read(r0)     // Catch: java.lang.Throwable -> L264
            if (r7 <= 0) goto L235
            r9 = 0
            r4.write(r0, r9, r7)     // Catch: java.lang.Throwable -> L264
            goto L22a
        L235:
            r7 = 1
            r2.m2825(r7, r12)     // Catch: java.lang.Throwable -> L25f
            r6.close()     // Catch: java.lang.Throwable -> L25c
            r5.close()     // Catch: java.lang.Throwable -> L259
            r4.close()     // Catch: java.lang.Throwable -> L256
            r3.close()     // Catch: java.lang.Throwable -> L24c java.io.IOException -> L24f java.io.FileNotFoundException -> L252
            r2.f6865 = r12
            r2.f6872 = r12
            r6 = r7
            goto L2b3
        L24c:
            r0 = move-exception
            goto L2ba
        L24f:
            r0 = move-exception
            goto L2a6
        L252:
            r0 = move-exception
        L253:
            r3 = 6
            goto L2ae
        L256:
            r0 = move-exception
        L257:
            r4 = r0
            goto L297
        L259:
            r0 = move-exception
        L25a:
            r5 = r0
            goto L28b
        L25c:
            r0 = move-exception
        L25d:
            r6 = r0
            goto L27d
        L25f:
            r0 = move-exception
        L260:
            r9 = r0
            goto L26f
        L262:
            r7 = 1
            goto L267
        L264:
            r0 = move-exception
            r7 = 1
            goto L260
        L267:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L25f
            java.lang.String r9 = "Unable to acquire a lock on the underlying file channel."
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L25f
            throw r0     // Catch: java.lang.Throwable -> L25f
        L26f:
            if (r6 == 0) goto L279
            r6.close()     // Catch: java.lang.Throwable -> L275
            goto L279
        L275:
            r0 = move-exception
            r9.addSuppressed(r0)     // Catch: java.lang.Throwable -> L25c
        L279:
            throw r9     // Catch: java.lang.Throwable -> L25c
        L27a:
            r0 = move-exception
            r7 = 1
            goto L25d
        L27d:
            if (r5 == 0) goto L287
            r5.close()     // Catch: java.lang.Throwable -> L283
            goto L287
        L283:
            r0 = move-exception
            r6.addSuppressed(r0)     // Catch: java.lang.Throwable -> L259
        L287:
            throw r6     // Catch: java.lang.Throwable -> L259
        L288:
            r0 = move-exception
            r7 = 1
            goto L25a
        L28b:
            r4.close()     // Catch: java.lang.Throwable -> L28f
            goto L293
        L28f:
            r0 = move-exception
            r5.addSuppressed(r0)     // Catch: java.lang.Throwable -> L256
        L293:
            throw r5     // Catch: java.lang.Throwable -> L256
        L294:
            r0 = move-exception
            r7 = 1
            goto L257
        L297:
            r3.close()     // Catch: java.lang.Throwable -> L29b
            goto L29f
        L29b:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: java.lang.Throwable -> L24c java.io.IOException -> L24f java.io.FileNotFoundException -> L252
        L29f:
            throw r4     // Catch: java.lang.Throwable -> L24c java.io.IOException -> L24f java.io.FileNotFoundException -> L252
        L2a0:
            r0 = move-exception
            r7 = 1
            goto L2a6
        L2a3:
            r0 = move-exception
            r7 = 1
            goto L253
        L2a6:
            r2.m2825(r8, r0)     // Catch: java.lang.Throwable -> L24c
        L2a9:
            r2.f6865 = r12
            r2.f6872 = r12
            goto L2b2
        L2ae:
            r2.m2825(r3, r0)     // Catch: java.lang.Throwable -> L24c
            goto L2a9
        L2b2:
            r6 = 0
        L2b3:
            if (r6 == 0) goto L2b8
            m3693(r10, r11)
        L2b8:
            r9 = r6
            goto L2c7
        L2ba:
            r2.f6865 = r12
            r2.f6872 = r12
            throw r0
        L2bf:
            defpackage.C2264.m3676(r5)
            return
        L2c3:
            r2.m2825(r14, r12)
        L2c6:
            r9 = 0
        L2c7:
            if (r9 == 0) goto L2cd
            if (r21 == 0) goto L2cd
            r9 = r7
            goto L2ce
        L2cd:
            r9 = 0
        L2ce:
            defpackage.AbstractC0411.m1168(r1, r9)
        L2d1:
            return
        L2d2:
            r0 = move-exception
            r5.mo2293(r8, r0)
            r9 = 0
            defpackage.AbstractC0411.m1168(r1, r9)
            return
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public static boolean m3705(java.lang.String r1) {
            java.lang.String r0 = "Connection"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L42
            java.lang.String r0 = "Keep-Alive"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L42
            java.lang.String r0 = "Proxy-Authenticate"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L42
            java.lang.String r0 = "Proxy-Authorization"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L42
            java.lang.String r0 = "TE"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L42
            java.lang.String r0 = "Trailers"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L42
            java.lang.String r0 = "Transfer-Encoding"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L42
            java.lang.String r0 = "Upgrade"
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 != 0) goto L42
            r1 = 1
            return r1
        L42:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public abstract android.text.InputFilter[] mo392(android.text.InputFilter[] r1);

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ */
    public abstract void mo393(boolean r1);

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ */
    public abstract void mo394(boolean r1);
}
