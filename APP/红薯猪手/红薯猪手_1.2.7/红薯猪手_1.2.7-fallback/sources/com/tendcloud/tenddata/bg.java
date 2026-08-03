package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public final class bg {
    private static volatile com.tendcloud.tenddata.bg a = null;
    private static java.util.Map<java.lang.String, java.lang.Object> b = null;
    private static final int c = 10800000;

    static {
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            com.tendcloud.tenddata.bg.b = r0
            return
    }

    private bg() {
            r1 = this;
            r1.<init>()
            boolean r0 = r1.c()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L12
            r1.b()     // Catch: java.lang.Throwable -> L12
            r1.d()     // Catch: java.lang.Throwable -> L12
            r1.e()     // Catch: java.lang.Throwable -> L12
        L12:
            return
    }

    public static com.tendcloud.tenddata.bg a() {
            com.tendcloud.tenddata.bg r0 = com.tendcloud.tenddata.bg.a
            if (r0 != 0) goto L17
            java.lang.Class<com.tendcloud.tenddata.bg> r0 = com.tendcloud.tenddata.bg.class
            monitor-enter(r0)
            com.tendcloud.tenddata.bg r1 = com.tendcloud.tenddata.bg.a     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L12
            com.tendcloud.tenddata.bg r1 = new com.tendcloud.tenddata.bg     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            com.tendcloud.tenddata.bg.a = r1     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
        L17:
            com.tendcloud.tenddata.bg r0 = com.tendcloud.tenddata.bg.a
            return r0
    }

    private java.util.List<java.lang.String> a(android.content.Context r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = r4.c()
            if (r1 == 0) goto Lc
            return r0
        Lc:
            r1 = 30
            boolean r2 = com.tendcloud.tenddata.y.a(r1)     // Catch: java.lang.Throwable -> L6e
            if (r2 == 0) goto L23
            boolean r1 = com.tendcloud.tenddata.y.a(r5, r1)     // Catch: java.lang.Throwable -> L6e
            if (r1 == 0) goto L23
            java.lang.String r1 = "android.permission.QUERY_ALL_PACKAGES"
            boolean r1 = com.tendcloud.tenddata.y.c(r5, r1)     // Catch: java.lang.Throwable -> L6e
            if (r1 != 0) goto L23
            return r0
        L23:
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L6e
            java.util.List r5 = com.tendcloud.tenddata.k.d(r5)     // Catch: java.lang.Throwable -> L6e
            if (r5 == 0) goto L6e
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L6e
        L31:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Throwable -> L6e
            if (r2 == 0) goto L6e
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Throwable -> L6e
            android.content.pm.PackageInfo r2 = (android.content.pm.PackageInfo) r2     // Catch: java.lang.Throwable -> L6e
            java.lang.String r3 = r2.packageName     // Catch: java.lang.Throwable -> L6e
            r0.add(r3)     // Catch: java.lang.Throwable -> L6e
            android.content.pm.ApplicationInfo r3 = r2.applicationInfo     // Catch: java.lang.Throwable -> L58
            java.lang.CharSequence r3 = r1.getApplicationLabel(r3)     // Catch: java.lang.Throwable -> L58
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L58
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Throwable -> L58
            java.lang.String r3 = com.tendcloud.tenddata.y.b(r3)     // Catch: java.lang.Throwable -> L58
            r0.add(r3)     // Catch: java.lang.Throwable -> L58
            goto L5d
        L58:
            java.lang.String r3 = ""
            r0.add(r3)     // Catch: java.lang.Throwable -> L6e
        L5d:
            android.content.pm.ApplicationInfo r2 = r2.applicationInfo     // Catch: java.lang.Throwable -> L6e
            int r2 = r2.flags     // Catch: java.lang.Throwable -> L6e
            r2 = r2 & 1
            if (r2 <= 0) goto L6b
            java.lang.String r2 = "1"
        L67:
            r0.add(r2)     // Catch: java.lang.Throwable -> L6e
            goto L31
        L6b:
            java.lang.String r2 = "0"
            goto L67
        L6e:
            return r0
    }

    private void b() {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lc7
            r0.<init>()     // Catch: java.lang.Throwable -> Lc7
            r1 = 21
            boolean r2 = com.tendcloud.tenddata.y.a(r1)     // Catch: java.lang.Throwable -> Lc7
            if (r2 == 0) goto L44
            r2 = 24
            boolean r2 = com.tendcloud.tenddata.y.b(r2)     // Catch: java.lang.Throwable -> Lc7
            if (r2 == 0) goto L44
            java.util.List r1 = com.tendcloud.tenddata.t.a()     // Catch: java.lang.Throwable -> Lc7
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lc7
        L1d:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Lc7
            if (r2 == 0) goto Lb5
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Lc7
            com.tendcloud.tenddata.f r2 = (com.tendcloud.tenddata.f) r2     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r3 = r2.c     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r4 = "android."
            boolean r3 = r3.startsWith(r4)     // Catch: java.lang.Throwable -> Lc7
            if (r3 != 0) goto L1d
            java.lang.String r3 = r2.c     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r4 = "system"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> Lc7
            if (r3 == 0) goto L3e
            goto L1d
        L3e:
            java.lang.String r2 = r2.c     // Catch: java.lang.Throwable -> Lc7
            r0.add(r2)     // Catch: java.lang.Throwable -> Lc7
            goto L1d
        L44:
            boolean r1 = com.tendcloud.tenddata.y.b(r1)     // Catch: java.lang.Throwable -> Lc7
            if (r1 == 0) goto L7e
            android.content.Context r1 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r2 = "activity"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch: java.lang.Throwable -> Lc7
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch: java.lang.Throwable -> Lc7
            if (r1 == 0) goto Lb5
            android.content.Context r2 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> Lc7
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Throwable -> Lc7
            java.util.List r1 = r1.getRunningAppProcesses()     // Catch: java.lang.Throwable -> Lc7
            if (r1 == 0) goto Lb5
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lc7
        L66:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> Lc7
            if (r3 == 0) goto Lb5
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> Lc7
            android.app.ActivityManager$RunningAppProcessInfo r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r3 = r3.processName     // Catch: java.lang.Throwable -> Lc7
            android.content.Intent r4 = r2.getLaunchIntentForPackage(r3)     // Catch: java.lang.Throwable -> L66
            if (r4 == 0) goto L66
            r0.add(r3)     // Catch: java.lang.Throwable -> L66
            goto L66
        L7e:
            r1 = 30
            boolean r1 = com.tendcloud.tenddata.y.b(r1)     // Catch: java.lang.Throwable -> Lc7
            if (r1 == 0) goto Lb5
            android.content.Context r1 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> Lc7
            java.util.List r1 = com.tendcloud.tenddata.k.d(r1)     // Catch: java.lang.Throwable -> Lc7
            if (r1 == 0) goto Lb5
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lc7
        L92:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Lc7
            if (r2 == 0) goto Lb5
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Lc7
            android.content.pm.PackageInfo r2 = (android.content.pm.PackageInfo) r2     // Catch: java.lang.Throwable -> Lc7
            android.content.pm.ApplicationInfo r3 = r2.applicationInfo     // Catch: java.lang.Throwable -> Lc7
            int r3 = r3.flags     // Catch: java.lang.Throwable -> Lc7
            r4 = r3 & 1
            if (r4 != 0) goto L92
            r4 = r3 & 128(0x80, float:1.8E-43)
            if (r4 != 0) goto L92
            r4 = 2097152(0x200000, float:2.938736E-39)
            r3 = r3 & r4
            if (r3 != 0) goto L92
            java.lang.String r2 = r2.packageName     // Catch: java.lang.Throwable -> Lc7
            r0.add(r2)     // Catch: java.lang.Throwable -> Lc7
            goto L92
        Lb5:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lc7
            java.util.Map<java.lang.String, java.lang.Object> r1 = com.tendcloud.tenddata.bg.b     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r2 = "ras"
            r1.put(r2, r0)     // Catch: java.lang.Throwable -> Lc7
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lc7
            com.tendcloud.tenddata.i.setCollectRunningTime(r0)     // Catch: java.lang.Throwable -> Lc7
        Lc7:
            return
    }

    private boolean c() {
            r5 = this;
            r0 = 0
            com.tendcloud.tenddata.TalkingDataSDKConfig r1 = com.tendcloud.tenddata.ab.T     // Catch: java.lang.Throwable -> L20
            boolean r1 = r1.isAppListEnabled()     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto La
            return r0
        La:
            boolean r1 = com.tendcloud.tenddata.ab.S     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto Lf
            return r0
        Lf:
            long r1 = com.tendcloud.tenddata.i.g()     // Catch: java.lang.Throwable -> L20
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L20
            long r3 = r3 - r1
            r1 = 10800000(0xa4cb80, double:5.335909E-317)
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 <= 0) goto L20
            r0 = 1
        L20:
            return r0
    }

    private void d() {
            r3 = this;
            android.content.Context r0 = com.tendcloud.tenddata.ab.g     // Catch: java.lang.Throwable -> L11
            java.util.List r0 = r3.a(r0)     // Catch: java.lang.Throwable -> L11
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L11
            java.util.Map<java.lang.String, java.lang.Object> r1 = com.tendcloud.tenddata.bg.b     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = "aas"
            r1.put(r2, r0)     // Catch: java.lang.Throwable -> L11
        L11:
            return
    }

    private void e() {
            r2 = this;
            com.tendcloud.tenddata.bv r0 = new com.tendcloud.tenddata.bv
            r0.<init>()
            java.lang.String r1 = "env"
            r0.b = r1
            java.lang.String r1 = "apps"
            r0.c = r1
            java.util.Map<java.lang.String, java.lang.Object> r1 = com.tendcloud.tenddata.bg.b
            r0.d = r1
            com.tendcloud.tenddata.a r1 = com.tendcloud.tenddata.a.ENV
            r0.a = r1
            com.tendcloud.tenddata.z r1 = com.tendcloud.tenddata.z.a()
            r1.post(r0)
            return
    }
}
