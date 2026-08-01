package xhss;

/* JADX INFO: renamed from: xhss.ᲁᲈᛸᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0999 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static final java.lang.Object f3263 = null;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static xhss.C0564 f3264;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final xhss.C0641 f3265 = null;

    static {
            xhss.ᛷᛳᛸᛵ r0 = new xhss.ᛷᛳᛸᛵ
            r0.<init>()
            xhss.AbstractC0999.f3265 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            xhss.AbstractC0999.f3263 = r0
            r0 = 0
            xhss.AbstractC0999.f3264 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public static xhss.C0564 m1637() {
            xhss.ᛶᛵᲇᛸ r0 = new xhss.ᛶᛵᲇᛸ
            r1 = 16
            r0.<init>(r1)
            xhss.AbstractC0999.f3264 = r0
            xhss.ᛷᛳᛸᛵ r1 = xhss.AbstractC0999.f3265
            r1.getClass()
            xhss.ᛵᛵᛲᲈ r2 = xhss.AbstractFutureC1123.f3625
            r3 = 0
            boolean r0 = r2.mo604(r1, r3, r0)
            if (r0 == 0) goto L1a
            xhss.AbstractFutureC1123.m1809(r1)
        L1a:
            xhss.ᛶᛵᲇᛸ r0 = xhss.AbstractC0999.f3264
            return r0
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static void m1638(android.content.Context r18, boolean r19) {
            if (r19 != 0) goto L8
            xhss.ᛶᛵᲇᛸ r0 = xhss.AbstractC0999.f3264
            if (r0 == 0) goto L8
            goto Ld3
        L8:
            java.lang.Object r1 = xhss.AbstractC0999.f3263
            monitor-enter(r1)
            if (r19 != 0) goto L16
            xhss.ᛶᛵᲇᛸ r0 = xhss.AbstractC0999.f3264     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L16
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r0 = move-exception
            goto Ld4
        L16:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L13
            r2 = 30
            if (r0 != r2) goto L21
            m1637()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            return
        L21:
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
            r6 = 1
            r7 = 0
            if (r0 == 0) goto L47
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L47
            r0 = r6
            goto L48
        L47:
            r0 = r7
        L48:
            java.io.File r8 = new java.io.File     // Catch: java.lang.Throwable -> L13
            java.io.File r9 = new java.io.File     // Catch: java.lang.Throwable -> L13
            java.lang.String r10 = "/data/misc/profiles/cur/0/"
            java.lang.String r11 = r18.getPackageName()     // Catch: java.lang.Throwable -> L13
            r9.<init>(r10, r11)     // Catch: java.lang.Throwable -> L13
            java.lang.String r10 = "primary.prof"
            r8.<init>(r9, r10)     // Catch: java.lang.Throwable -> L13
            long r16 = r8.length()     // Catch: java.lang.Throwable -> L13
            boolean r8 = r8.exists()     // Catch: java.lang.Throwable -> L13
            if (r8 == 0) goto L6a
            int r4 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r4 <= 0) goto L6a
            r4 = r6
            goto L6b
        L6a:
            r4 = r7
        L6b:
            long r14 = m1639(r18)     // Catch: java.lang.Throwable -> L13 android.content.pm.PackageManager.NameNotFoundException -> Lcf
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L13
            java.io.File r8 = r18.getFilesDir()     // Catch: java.lang.Throwable -> L13
            java.lang.String r9 = "profileInstalled"
            r5.<init>(r8, r9)     // Catch: java.lang.Throwable -> L13
            boolean r8 = r5.exists()     // Catch: java.lang.Throwable -> L13
            if (r8 == 0) goto L8a
            xhss.ᛶᛵᲇᛲ r8 = xhss.C0563.m1025(r5)     // Catch: java.lang.Throwable -> L13 java.io.IOException -> L85
            goto L8b
        L85:
            m1637()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            goto Ld3
        L8a:
            r8 = 0
        L8b:
            r9 = 2
            if (r8 == 0) goto L9b
            long r10 = r8.f1990     // Catch: java.lang.Throwable -> L13
            int r10 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r10 != 0) goto L9b
            int r10 = r8.f1989     // Catch: java.lang.Throwable -> L13
            if (r10 != r9) goto L99
            goto L9b
        L99:
            r7 = r10
            goto La2
        L9b:
            if (r0 == 0) goto L9f
            r7 = r6
            goto La2
        L9f:
            if (r4 == 0) goto La2
            r7 = r9
        La2:
            if (r19 == 0) goto La9
            if (r4 == 0) goto La9
            if (r7 == r6) goto La9
            r7 = r9
        La9:
            if (r8 == 0) goto Lb8
            int r0 = r8.f1989     // Catch: java.lang.Throwable -> L13
            if (r0 != r9) goto Lb8
            if (r7 != r6) goto Lb8
            long r9 = r8.f1992     // Catch: java.lang.Throwable -> L13
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 >= 0) goto Lb8
            r7 = 3
        Lb8:
            r13 = r7
            xhss.ᛶᛵᲇᛲ r11 = new xhss.ᛶᛵᲇᛲ     // Catch: java.lang.Throwable -> L13
            r12 = 1
            r11.<init>(r12, r13, r14, r16)     // Catch: java.lang.Throwable -> L13
            if (r8 == 0) goto Lc7
            boolean r0 = r8.equals(r11)     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto Lca
        Lc7:
            r11.m1026(r5)     // Catch: java.lang.Throwable -> L13 java.io.IOException -> Lca
        Lca:
            m1637()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            goto Ld3
        Lcf:
            m1637()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
        Ld3:
            return
        Ld4:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r0
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static long m1639(android.content.Context r3) {
            android.content.Context r0 = r3.getApplicationContext()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L15
            android.content.pm.PackageInfo r3 = xhss.AbstractC0783.m1325(r0, r3)
            long r0 = r3.lastUpdateTime
            return r0
        L15:
            java.lang.String r3 = r3.getPackageName()
            r1 = 0
            android.content.pm.PackageInfo r3 = r0.getPackageInfo(r3, r1)
            long r0 = r3.lastUpdateTime
            return r0
    }
}
