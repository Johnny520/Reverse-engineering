package t3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z2.h f13064a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final java.lang.Object f13065b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static l3.w f13066c;

    static {
            z2.h r0 = new z2.h
            r0.<init>()
            t3.i.f13064a = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            t3.i.f13065b = r0
            r0 = 0
            t3.i.f13066c = r0
            return
    }

    public static long a(android.content.Context r3) {
            android.content.Context r0 = r3.getApplicationContext()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L15
            android.content.pm.PackageInfo r3 = t3.g.a(r0, r3)
            long r0 = r3.lastUpdateTime
            return r0
        L15:
            java.lang.String r3 = r3.getPackageName()
            r1 = 0
            android.content.pm.PackageInfo r3 = r0.getPackageInfo(r3, r1)
            long r0 = r3.lastUpdateTime
            return r0
    }

    public static l3.w b() {
            l3.w r0 = new l3.w
            r1 = 27
            r0.<init>(r1)
            t3.i.f13066c = r0
            z2.h r1 = t3.i.f13064a
            r1.getClass()
            r9.e0 r2 = z2.g.f22515l
            r3 = 0
            boolean r0 = r2.l(r1, r3, r0)
            if (r0 == 0) goto L1a
            z2.g.b(r1)
        L1a:
            l3.w r0 = t3.i.f13066c
            return r0
    }

    public static void c(android.content.Context r19, boolean r20) {
            if (r20 != 0) goto L8
            l3.w r0 = t3.i.f13066c
            if (r0 == 0) goto L8
            goto L105
        L8:
            java.lang.Object r1 = t3.i.f13065b
            monitor-enter(r1)
            if (r20 != 0) goto L16
            l3.w r0 = t3.i.f13066c     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L16
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r0 = move-exception
            goto L106
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
            r7 = 28
            if (r6 < r7) goto L101
            r7 = 30
            if (r6 != r7) goto L4d
            goto L101
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
            long r15 = a(r19)     // Catch: java.lang.Throwable -> L13 android.content.pm.PackageManager.NameNotFoundException -> Lfc
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L13
            java.io.File r9 = r19.getFilesDir()     // Catch: java.lang.Throwable -> L13
            java.lang.String r10 = "profileInstalled"
            r3.<init>(r9, r10)     // Catch: java.lang.Throwable -> L13
            boolean r9 = r3.exists()     // Catch: java.lang.Throwable -> L13
            if (r9 == 0) goto Lb2
            t3.h r9 = t3.h.a(r3)     // Catch: java.lang.Throwable -> L13 java.io.IOException -> Lad
            goto Lb3
        Lad:
            b()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            goto L105
        Lb2:
            r9 = 0
        Lb3:
            r10 = 2
            if (r9 == 0) goto Lc3
            long r11 = r9.f13062c     // Catch: java.lang.Throwable -> L13
            int r11 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r11 != 0) goto Lc3
            int r11 = r9.f13061b     // Catch: java.lang.Throwable -> L13
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
            int r0 = r9.f13061b     // Catch: java.lang.Throwable -> L13
            if (r0 != r10) goto Le5
            if (r5 != r4) goto Le5
            long r10 = r9.f13063d     // Catch: java.lang.Throwable -> L13
            int r0 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r0 >= 0) goto Le5
            r5 = 3
        Le5:
            r14 = r5
            t3.h r12 = new t3.h     // Catch: java.lang.Throwable -> L13
            r13 = 1
            r12.<init>(r13, r14, r15, r17)     // Catch: java.lang.Throwable -> L13
            if (r9 == 0) goto Lf4
            boolean r0 = r9.equals(r12)     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto Lf7
        Lf4:
            r12.b(r3)     // Catch: java.lang.Throwable -> L13 java.io.IOException -> Lf7
        Lf7:
            b()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            goto L105
        Lfc:
            b()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            goto L105
        L101:
            b()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
        L105:
            return
        L106:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r0
    }
}
