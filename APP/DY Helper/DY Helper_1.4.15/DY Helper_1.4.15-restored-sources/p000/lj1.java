package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class lj1 {

    /* JADX INFO: renamed from: α */
    public static final p000.qn1 f6691 = null;

    /* JADX INFO: renamed from: β */
    public static final java.lang.Object f6692 = null;

    /* JADX INFO: renamed from: γ */
    public static p000.rk0 f6693;

    static {
            qn1 r0 = new qn1
            r0.<init>()
            p000.lj1.f6691 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            p000.lj1.f6692 = r0
            r0 = 0
            p000.lj1.f6693 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static long m3576(android.content.Context r3) {
            android.content.Context r0 = r3.getApplicationContext()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L15
            android.content.pm.PackageInfo r3 = p000.AbstractC1126.m7344(r0, r3)
            long r0 = r3.lastUpdateTime
            return r0
        L15:
            java.lang.String r3 = r3.getPackageName()
            r1 = 0
            android.content.pm.PackageInfo r3 = r0.getPackageInfo(r3, r1)
            long r0 = r3.lastUpdateTime
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static p000.rk0 m3577() {
            rk0 r0 = new rk0
            r1 = 16
            r0.<init>(r1)
            p000.lj1.f6693 = r0
            qn1 r1 = p000.lj1.f6691
            r1.getClass()
            h62 r2 = p000.AbstractC1110.f13437
            boolean r0 = r2.mo2453(r1, r0)
            if (r0 == 0) goto L54
        L16:
            з r0 = r1.f13441
            h62 r2 = p000.AbstractC1110.f13437
            boolean r2 = r2.mo2454(r1, r0)
            if (r2 == 0) goto L16
        L20:
            r2 = 0
            if (r0 == 0) goto L2f
            java.lang.Thread r3 = r0.f13434
            if (r3 == 0) goto L2c
            r0.f13434 = r2
            java.util.concurrent.locks.LockSupport.unpark(r3)
        L2c:
            з r0 = r0.f13435
            goto L20
        L2f:
            д r0 = r1.f13440
            h62 r3 = p000.AbstractC1110.f13437
            boolean r3 = r3.mo2452(r1, r0)
            if (r3 == 0) goto L2f
            r1 = r2
        L3a:
            if (r0 == 0) goto L43
            д r3 = r0.f13429
            r0.f13429 = r1
            r1 = r0
            r0 = r3
            goto L3a
        L43:
            if (r1 != 0) goto L46
            goto L54
        L46:
            д r1 = r1.f13429
            throw r2     // Catch: java.lang.RuntimeException -> L49
        L49:
            r0 = move-exception
            java.util.logging.Logger r3 = p000.AbstractC1110.f13436
            java.util.logging.Level r4 = java.util.logging.Level.SEVERE
            java.lang.String r5 = "RuntimeException while executing runnable null with executor null"
            r3.log(r4, r5, r0)
            goto L43
        L54:
            rk0 r0 = p000.lj1.f6693
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static void m3578(android.content.Context r19, boolean r20) {
            if (r20 != 0) goto L8
            rk0 r0 = p000.lj1.f6693
            if (r0 == 0) goto L8
            goto L100
        L8:
            java.lang.Object r1 = p000.lj1.f6692
            monitor-enter(r1)
            if (r20 != 0) goto L16
            rk0 r0 = p000.lj1.f6693     // Catch: java.lang.Throwable -> L13
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
            m3577()     // Catch: java.lang.Throwable -> L13
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
            long r15 = m3576(r19)     // Catch: java.lang.Throwable -> L13 android.content.pm.PackageManager.NameNotFoundException -> Lfc
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L13
            java.io.File r9 = r19.getFilesDir()     // Catch: java.lang.Throwable -> L13
            java.lang.String r10 = "profileInstalled"
            r3.<init>(r9, r10)     // Catch: java.lang.Throwable -> L13
            boolean r9 = r3.exists()     // Catch: java.lang.Throwable -> L13
            if (r9 == 0) goto Lb2
            kj1 r9 = p000.kj1.m3287(r3)     // Catch: java.lang.Throwable -> L13 java.io.IOException -> Lad
            goto Lb3
        Lad:
            m3577()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            goto L100
        Lb2:
            r9 = 0
        Lb3:
            r10 = 2
            if (r9 == 0) goto Lc3
            long r11 = r9.f5951     // Catch: java.lang.Throwable -> L13
            int r11 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r11 != 0) goto Lc3
            int r11 = r9.f5950     // Catch: java.lang.Throwable -> L13
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
            int r0 = r9.f5950     // Catch: java.lang.Throwable -> L13
            if (r0 != r10) goto Le5
            if (r5 != r4) goto Le5
            long r10 = r9.f5952     // Catch: java.lang.Throwable -> L13
            int r0 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r0 >= 0) goto Le5
            r5 = 3
        Le5:
            r14 = r5
            kj1 r12 = new kj1     // Catch: java.lang.Throwable -> L13
            r13 = 1
            r12.<init>(r13, r14, r15, r17)     // Catch: java.lang.Throwable -> L13
            if (r9 == 0) goto Lf4
            boolean r0 = r9.equals(r12)     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto Lf7
        Lf4:
            r12.m3288(r3)     // Catch: java.lang.Throwable -> L13 java.io.IOException -> Lf7
        Lf7:
            m3577()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            goto L100
        Lfc:
            m3577()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
        L100:
            return
        L101:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r0
    }
}
