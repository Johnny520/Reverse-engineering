package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class g {
    private static volatile com.tendcloud.tenddata.g a;
    private android.content.pm.PackageInfo b;

    private g() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.b = r0
            return
    }

    public static com.tendcloud.tenddata.g a() {
            com.tendcloud.tenddata.g r0 = com.tendcloud.tenddata.g.a
            if (r0 != 0) goto L17
            java.lang.Class<com.tendcloud.tenddata.g> r0 = com.tendcloud.tenddata.g.class
            monitor-enter(r0)
            com.tendcloud.tenddata.g r1 = com.tendcloud.tenddata.g.a     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L12
            com.tendcloud.tenddata.g r1 = new com.tendcloud.tenddata.g     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            com.tendcloud.tenddata.g.a = r1     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
        L17:
            com.tendcloud.tenddata.g r0 = com.tendcloud.tenddata.g.a
            return r0
    }

    private synchronized boolean i(android.content.Context r3) {
            r2 = this;
            monitor-enter(r2)
            android.content.pm.PackageInfo r0 = r2.b     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L15
            android.content.pm.PackageManager r0 = r3.getPackageManager()     // Catch: java.lang.Throwable -> L18
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Throwable -> L18
            r1 = 64
            android.content.pm.PackageInfo r3 = r0.getPackageInfo(r3, r1)     // Catch: java.lang.Throwable -> L18
            r2.b = r3     // Catch: java.lang.Throwable -> L18
        L15:
            r3 = 1
        L16:
            monitor-exit(r2)
            return r3
        L18:
            r3 = 0
            goto L16
    }

    public java.lang.String a(android.content.Context r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Throwable -> L9
            return r1
        L9:
            java.lang.String r1 = ""
            return r1
    }

    public int b(android.content.Context r2) {
            r1 = this;
            r0 = -1
            if (r2 != 0) goto L4
            return r0
        L4:
            boolean r2 = r1.i(r2)     // Catch: java.lang.Throwable -> L10
            if (r2 != 0) goto Lb
            return r0
        Lb:
            android.content.pm.PackageInfo r2 = r1.b     // Catch: java.lang.Throwable -> L10
            int r2 = r2.versionCode     // Catch: java.lang.Throwable -> L10
            return r2
        L10:
            return r0
    }

    public java.lang.String c(android.content.Context r2) {
            r1 = this;
            java.lang.String r0 = "unknown"
            if (r2 != 0) goto L5
            return r0
        L5:
            boolean r2 = r1.i(r2)     // Catch: java.lang.Throwable -> L11
            if (r2 != 0) goto Lc
            return r0
        Lc:
            android.content.pm.PackageInfo r2 = r1.b     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = r2.versionName     // Catch: java.lang.Throwable -> L11
            return r2
        L11:
            return r0
    }

    public long d(android.content.Context r3) {
            r2 = this;
            r0 = -1
            if (r3 != 0) goto L5
            return r0
        L5:
            boolean r3 = r2.i(r3)     // Catch: java.lang.Throwable -> L18
            if (r3 != 0) goto Lc
            return r0
        Lc:
            r3 = 9
            boolean r3 = com.tendcloud.tenddata.y.a(r3)     // Catch: java.lang.Throwable -> L18
            if (r3 == 0) goto L18
            android.content.pm.PackageInfo r3 = r2.b     // Catch: java.lang.Throwable -> L18
            long r0 = r3.firstInstallTime     // Catch: java.lang.Throwable -> L18
        L18:
            return r0
    }

    public long e(android.content.Context r3) {
            r2 = this;
            r0 = -1
            if (r3 != 0) goto L5
            return r0
        L5:
            boolean r3 = r2.i(r3)     // Catch: java.lang.Throwable -> L18
            if (r3 != 0) goto Lc
            return r0
        Lc:
            r3 = 9
            boolean r3 = com.tendcloud.tenddata.y.a(r3)     // Catch: java.lang.Throwable -> L18
            if (r3 == 0) goto L18
            android.content.pm.PackageInfo r3 = r2.b     // Catch: java.lang.Throwable -> L18
            long r0 = r3.lastUpdateTime     // Catch: java.lang.Throwable -> L18
        L18:
            return r0
    }

    public long f(android.content.Context r4) {
            r3 = this;
            r0 = -1
            if (r4 != 0) goto L5
            return r0
        L5:
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()     // Catch: java.lang.Throwable -> L14
            java.lang.String r4 = r4.sourceDir     // Catch: java.lang.Throwable -> L14
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L14
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L14
            long r0 = r2.length()     // Catch: java.lang.Throwable -> L14
        L14:
            return r0
    }

    public java.lang.String g(android.content.Context r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            boolean r4 = r3.i(r4)     // Catch: java.lang.Throwable -> L28
            if (r4 != 0) goto Lb
            return r0
        Lb:
            android.content.pm.PackageInfo r4 = r3.b     // Catch: java.lang.Throwable -> L28
            android.content.pm.Signature[] r4 = r4.signatures     // Catch: java.lang.Throwable -> L28
            int r1 = r4.length     // Catch: java.lang.Throwable -> L28
            r2 = 1
            if (r1 >= r2) goto L14
            return r0
        L14:
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L28
            r1.<init>()     // Catch: java.lang.Throwable -> L28
            r2 = 0
            r4 = r4[r2]     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = r4.toCharsString()     // Catch: java.lang.Throwable -> L28
            r1.append(r4)     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L28
            return r4
        L28:
            return r0
    }

    public java.lang.String h(android.content.Context r3) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            android.content.pm.ApplicationInfo r1 = r3.getApplicationInfo()     // Catch: java.lang.Throwable -> L15
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: java.lang.Throwable -> L15
            java.lang.CharSequence r3 = r1.loadLabel(r3)     // Catch: java.lang.Throwable -> L15
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L15
            return r3
        L15:
            return r0
    }
}
