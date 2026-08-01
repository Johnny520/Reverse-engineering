package defpackage;

/* JADX INFO: renamed from: ᛳᛱᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0411 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static defpackage.C2223 f2075;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.C1513 f2076 = null;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final java.lang.Object f2077 = null;

    static {
            ᛸᛶᛷᲀ r0 = new ᛸᛶᛷᲀ
            r0.<init>()
            defpackage.AbstractC0411.f2076 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.AbstractC0411.f2077 = r0
            r0 = 0
            defpackage.AbstractC0411.f2075 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static void m1168(android.content.Context r19, boolean r20) {
            if (r20 != 0) goto L8
            ᲈᛴᛵᲈ r0 = defpackage.AbstractC0411.f2075
            if (r0 == 0) goto L8
            goto L100
        L8:
            java.lang.Object r1 = defpackage.AbstractC0411.f2077
            monitor-enter(r1)
            if (r20 != 0) goto L16
            ᲈᛴᛵᲈ r0 = defpackage.AbstractC0411.f2075     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L16
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r0 = move-exception
            goto L101
        L16:
            r2 = 0
            r4 = 1
            r5 = 0
            android.content.res.AssetManager r0 = r19.getAssets()     // Catch: java.lang.Throwable -> L13 java.io.IOException -> L40
            java.lang.String r6 = "dexopt/baseline.prof"
            android.content.res.AssetFileDescriptor r6 = r0.openFd(r6)     // Catch: java.lang.Throwable -> L13 java.io.IOException -> L40
            long r7 = r6.getLength()     // Catch: java.lang.Throwable -> L33
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 <= 0) goto L2e
            r0 = r4
            goto L2f
        L2e:
            r0 = r5
        L2f:
            r6.close()     // Catch: java.lang.Throwable -> L13 java.io.IOException -> L40
            goto L41
        L33:
            r0 = move-exception
            r7 = r0
            if (r6 == 0) goto L3f
            r6.close()     // Catch: java.lang.Throwable -> L3b
            goto L3f
        L3b:
            r0 = move-exception
            r7.addSuppressed(r0)     // Catch: java.lang.Throwable -> L13 java.io.IOException -> L40
        L3f:
            throw r7     // Catch: java.lang.Throwable -> L13 java.io.IOException -> L40
        L40:
            r0 = r5
        L41:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L13
            r7 = 30
            if (r6 != r7) goto L4d
            m1170()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            goto L100
        L4d:
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L13
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> L13
            java.lang.String r8 = "/data/misc/profiles/ref/"
            java.lang.String r9 = r19.getPackageName()     // Catch: java.lang.Throwable -> L13
            r7.<init>(r8, r9)     // Catch: java.lang.Throwable -> L13
            java.lang.String r8 = "primary.prof"
            r6.<init>(r7, r8)     // Catch: java.lang.Throwable -> L13
            long r7 = r6.length()     // Catch: java.lang.Throwable -> L13
            boolean r6 = r6.exists()     // Catch: java.lang.Throwable -> L13
            if (r6 == 0) goto L6f
            int r6 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r6 <= 0) goto L6f
            r6 = r4
            goto L70
        L6f:
            r6 = r5
        L70:
            java.io.File r9 = new java.io.File     // Catch: java.lang.Throwable -> L13
            java.io.File r10 = new java.io.File     // Catch: java.lang.Throwable -> L13
            java.lang.String r11 = "/data/misc/profiles/cur/0/"
            java.lang.String r12 = r19.getPackageName()     // Catch: java.lang.Throwable -> L13
            r10.<init>(r11, r12)     // Catch: java.lang.Throwable -> L13
            java.lang.String r11 = "primary.prof"
            r9.<init>(r10, r11)     // Catch: java.lang.Throwable -> L13
            long r17 = r9.length()     // Catch: java.lang.Throwable -> L13
            boolean r9 = r9.exists()     // Catch: java.lang.Throwable -> L13
            if (r9 == 0) goto L92
            int r2 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1))
            if (r2 <= 0) goto L92
            r2 = r4
            goto L93
        L92:
            r2 = r5
        L93:
            long r15 = m1169(r19)     // Catch: java.lang.Throwable -> L13 android.content.pm.PackageManager.NameNotFoundException -> Lfc
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L13
            java.io.File r9 = r19.getFilesDir()     // Catch: java.lang.Throwable -> L13
            java.lang.String r10 = "profileInstalled"
            r3.<init>(r9, r10)     // Catch: java.lang.Throwable -> L13
            boolean r9 = r3.exists()     // Catch: java.lang.Throwable -> L13
            if (r9 == 0) goto Lb2
            ᛳᛲᛴᛳ r9 = defpackage.C0418.m1172(r3)     // Catch: java.lang.Throwable -> L13 java.io.IOException -> Lad
            goto Lb3
        Lad:
            m1170()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            goto L100
        Lb2:
            r9 = 0
        Lb3:
            r10 = 2
            if (r9 == 0) goto Lc3
            long r11 = r9.f2098     // Catch: java.lang.Throwable -> L13
            int r11 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r11 != 0) goto Lc3
            int r11 = r9.f2100     // Catch: java.lang.Throwable -> L13
            if (r11 != r10) goto Lc1
            goto Lc3
        Lc1:
            r5 = r11
            goto Lcf
        Lc3:
            if (r0 != 0) goto Lc8
            r5 = 327680(0x50000, float:4.59177E-40)
            goto Lcf
        Lc8:
            if (r6 == 0) goto Lcc
            r5 = r4
            goto Lcf
        Lcc:
            if (r2 == 0) goto Lcf
            r5 = r10
        Lcf:
            if (r20 == 0) goto Ld6
            if (r2 == 0) goto Ld6
            if (r5 == r4) goto Ld6
            r5 = r10
        Ld6:
            if (r9 == 0) goto Le5
            int r0 = r9.f2100     // Catch: java.lang.Throwable -> L13
            if (r0 != r10) goto Le5
            if (r5 != r4) goto Le5
            long r10 = r9.f2097     // Catch: java.lang.Throwable -> L13
            int r0 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r0 >= 0) goto Le5
            r5 = 3
        Le5:
            r14 = r5
            ᛳᛲᛴᛳ r12 = new ᛳᛲᛴᛳ     // Catch: java.lang.Throwable -> L13
            r13 = 1
            r12.<init>(r13, r14, r15, r17)     // Catch: java.lang.Throwable -> L13
            if (r9 == 0) goto Lf4
            boolean r0 = r9.equals(r12)     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto Lf7
        Lf4:
            r12.m1173(r3)     // Catch: java.lang.Throwable -> L13 java.io.IOException -> Lf7
        Lf7:
            m1170()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            goto L100
        Lfc:
            m1170()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
        L100:
            return
        L101:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static long m1169(android.content.Context r3) {
            android.content.Context r0 = r3.getApplicationContext()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L15
            android.content.pm.PackageInfo r3 = defpackage.AbstractC1284.m2411(r0, r3)
            long r0 = r3.lastUpdateTime
            return r0
        L15:
            java.lang.String r3 = r3.getPackageName()
            r1 = 0
            android.content.pm.PackageInfo r3 = r0.getPackageInfo(r3, r1)
            long r0 = r3.lastUpdateTime
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static defpackage.C2223 m1170() {
            ᲈᛴᛵᲈ r0 = new ᲈᛴᛵᲈ
            r1 = 5
            r0.<init>(r1)
            defpackage.AbstractC0411.f2075 = r0
            ᛸᛶᛷᲀ r1 = defpackage.AbstractC0411.f2076
            r1.getClass()
            ᛲᲈᲀᲈ r2 = defpackage.AbstractFutureC2017.f8712
            r3 = 0
            boolean r0 = r2.mo1155(r1, r3, r0)
            if (r0 == 0) goto L19
            defpackage.AbstractFutureC2017.m3407(r1)
        L19:
            ᲈᛴᛵᲈ r0 = defpackage.AbstractC0411.f2075
            return r0
    }
}
