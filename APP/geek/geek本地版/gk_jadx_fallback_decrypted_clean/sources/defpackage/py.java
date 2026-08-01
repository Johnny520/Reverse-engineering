package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class py {
    public static final defpackage.u00 a = null;
    public static final java.lang.Object b = null;
    public static defpackage.iy c;

    static {
            u00 r0 = new u00
            r0.<init>()
            defpackage.py.a = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.py.b = r0
            r0 = 0
            defpackage.py.c = r0
            return
    }

    public static long a(android.content.Context r3) {
            android.content.Context r0 = r3.getApplicationContext()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L15
            android.content.pm.PackageInfo r3 = defpackage.ny.a(r0, r3)
            long r0 = r3.lastUpdateTime
            return r0
        L15:
            java.lang.String r3 = r3.getPackageName()
            r1 = 0
            android.content.pm.PackageInfo r3 = r0.getPackageInfo(r3, r1)
            long r0 = r3.lastUpdateTime
            return r0
    }

    public static defpackage.iy b() {
            iy r0 = new iy
            r1 = 3
            r0.<init>(r1)
            defpackage.py.c = r0
            u00 r1 = defpackage.py.a
            r1.getClass()
            ff r2 = defpackage.t.f
            r3 = 0
            boolean r0 = r2.f(r1, r3, r0)
            if (r0 == 0) goto L19
            defpackage.t.b(r1)
        L19:
            iy r0 = defpackage.py.c
            return r0
    }

    public static void c(android.content.Context r18, boolean r19) {
            if (r19 != 0) goto L8
            iy r0 = defpackage.py.c
            if (r0 == 0) goto L8
            goto Ld4
        L8:
            java.lang.Object r1 = defpackage.py.b
            monitor-enter(r1)
            if (r19 != 0) goto L16
            iy r0 = defpackage.py.c     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L16
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r0 = move-exception
            goto Lda
        L16:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L13
            r2 = 28
            if (r0 < r2) goto Ld5
            r2 = 30
            if (r0 != r2) goto L22
            goto Ld5
        L22:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L13
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L13
            java.lang.String r3 = "/data/misc/profiles/ref/"
            java.lang.String r4 = r18.getPackageName()     // Catch: java.lang.Throwable -> L13
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L13
            java.lang.String r3 = "primary.prof"
            r0.<init>(r2, r3)     // Catch: java.lang.Throwable -> L13
            long r2 = r0.length()     // Catch: java.lang.Throwable -> L13
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> L13
            r4 = 0
            r6 = 0
            r7 = 1
            if (r0 == 0) goto L48
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L48
            r0 = r7
            goto L49
        L48:
            r0 = r6
        L49:
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> L13
            java.io.File r9 = new java.io.File     // Catch: java.lang.Throwable -> L13
            java.lang.String r10 = "/data/misc/profiles/cur/0/"
            java.lang.String r11 = r18.getPackageName()     // Catch: java.lang.Throwable -> L13
            r9.<init>(r10, r11)     // Catch: java.lang.Throwable -> L13
            java.lang.String r10 = "primary.prof"
            r8.<init>(r9, r10)     // Catch: java.lang.Throwable -> L13
            long r16 = r8.length()     // Catch: java.lang.Throwable -> L13
            boolean r8 = r8.exists()     // Catch: java.lang.Throwable -> L13
            if (r8 == 0) goto L6b
            int r4 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r4 <= 0) goto L6b
            r4 = r7
            goto L6c
        L6b:
            r4 = r6
        L6c:
            long r14 = a(r18)     // Catch: java.lang.Throwable -> L13 android.content.pm.PackageManager.NameNotFoundException -> Ld0
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L13
            java.io.File r8 = r18.getFilesDir()     // Catch: java.lang.Throwable -> L13
            java.lang.String r9 = "profileInstalled"
            r5.<init>(r8, r9)     // Catch: java.lang.Throwable -> L13
            boolean r8 = r5.exists()     // Catch: java.lang.Throwable -> L13
            if (r8 == 0) goto L8b
            oy r8 = defpackage.oy.a(r5)     // Catch: java.lang.Throwable -> L13 java.io.IOException -> L86
            goto L8c
        L86:
            b()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            goto Ld4
        L8b:
            r8 = 0
        L8c:
            r9 = 2
            if (r8 == 0) goto L9c
            long r10 = r8.c     // Catch: java.lang.Throwable -> L13
            int r10 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r10 != 0) goto L9c
            int r10 = r8.b     // Catch: java.lang.Throwable -> L13
            if (r10 != r9) goto L9a
            goto L9c
        L9a:
            r6 = r10
            goto La3
        L9c:
            if (r0 == 0) goto La0
            r6 = r7
            goto La3
        La0:
            if (r4 == 0) goto La3
            r6 = r9
        La3:
            if (r19 == 0) goto Laa
            if (r4 == 0) goto Laa
            if (r6 == r7) goto Laa
            r6 = r9
        Laa:
            if (r8 == 0) goto Lb9
            int r0 = r8.b     // Catch: java.lang.Throwable -> L13
            if (r0 != r9) goto Lb9
            if (r6 != r7) goto Lb9
            long r9 = r8.d     // Catch: java.lang.Throwable -> L13
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 >= 0) goto Lb9
            r6 = 3
        Lb9:
            r13 = r6
            oy r11 = new oy     // Catch: java.lang.Throwable -> L13
            r12 = 1
            r11.<init>(r12, r13, r14, r16)     // Catch: java.lang.Throwable -> L13
            if (r8 == 0) goto Lc8
            boolean r0 = r8.equals(r11)     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto Lcb
        Lc8:
            r11.b(r5)     // Catch: java.lang.Throwable -> L13 java.io.IOException -> Lcb
        Lcb:
            b()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            goto Ld4
        Ld0:
            b()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
        Ld4:
            return
        Ld5:
            b()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            return
        Lda:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r0
    }
}
