package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class t {
    private t() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r2, int r3) {
            java.lang.String r0 = "activity"
            java.lang.Object r2 = r2.getSystemService(r0)     // Catch: java.lang.Throwable -> L23
            android.app.ActivityManager r2 = (android.app.ActivityManager) r2     // Catch: java.lang.Throwable -> L23
            java.util.List r2 = r2.getRunningAppProcesses()     // Catch: java.lang.Throwable -> L23
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L23
        L10:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L23
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> L23
            android.app.ActivityManager$RunningAppProcessInfo r0 = (android.app.ActivityManager.RunningAppProcessInfo) r0     // Catch: java.lang.Throwable -> L23
            int r1 = r0.pid     // Catch: java.lang.Throwable -> L23
            if (r1 != r3) goto L10
            java.lang.String r2 = r0.processName     // Catch: java.lang.Throwable -> L23
            return r2
        L23:
            r2 = 0
            return r2
    }

    /* JADX DEBUG: Throwable added to exception handler: 'NumberFormatException', keep only Throwable */
    public static java.util.List<com.tendcloud.tenddata.f> a() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = "/proc"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L58
            java.io.File[] r1 = r1.listFiles()     // Catch: java.lang.Throwable -> L58
            int r2 = r1.length     // Catch: java.lang.Throwable -> L58
            r3 = 0
        L12:
            if (r3 >= r2) goto L58
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L58
            if (r4 == 0) goto L55
            boolean r5 = r4.isDirectory()     // Catch: java.lang.Throwable -> L58
            if (r5 == 0) goto L55
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L55 java.lang.Throwable -> L58
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Throwable -> L55 java.lang.Throwable -> L58
            com.tendcloud.tenddata.f r5 = new com.tendcloud.tenddata.f
            r6 = -1
            r5.<init>(r6)
            int r6 = r5.b
            r7 = 1000(0x3e8, float:1.401E-42)
            if (r6 < r7) goto L37
            r7 = 9999(0x270f, float:1.4012E-41)
            if (r6 > r7) goto L37
            goto L55
        L37:
            java.lang.String r6 = r5.c
            java.lang.String r7 = ":"
            boolean r6 = r6.contains(r7)
            if (r6 == 0) goto L42
            goto L55
        L42:
            java.lang.String r5 = r5.c
            java.lang.String r6 = "/"
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L4d
            goto L55
        L4d:
            com.tendcloud.tenddata.f r5 = new com.tendcloud.tenddata.f
            r5.<init>(r4)
            r0.add(r5)
        L55:
            int r3 = r3 + 1
            goto L12
        L58:
            return r0
    }

    /* JADX DEBUG: Throwable added to exception handler: 'NumberFormatException', keep only Throwable */
    public static java.util.List<com.tendcloud.tenddata.f> a(android.content.Context r6) {
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L59
            java.lang.String r1 = "/proc"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L59
            java.io.File[] r0 = r0.listFiles()     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L59
            int r1 = r0.length     // Catch: java.lang.Throwable -> L59
            r2 = 0
        L14:
            if (r2 >= r1) goto L59
            r3 = r0[r2]     // Catch: java.lang.Throwable -> L59
            if (r3 == 0) goto L56
            boolean r4 = r3.isDirectory()     // Catch: java.lang.Throwable -> L59
            if (r4 == 0) goto L56
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> L56 java.lang.Throwable -> L59
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Throwable -> L56 java.lang.Throwable -> L59
            com.tendcloud.tenddata.f r4 = new com.tendcloud.tenddata.f
            r4.<init>(r3)
            boolean r3 = r4.a
            if (r3 != 0) goto L32
            goto L56
        L32:
            int r3 = r4.b
            r5 = 1000(0x3e8, float:1.401E-42)
            if (r3 < r5) goto L3d
            r5 = 9999(0x270f, float:1.4012E-41)
            if (r3 > r5) goto L3d
            goto L56
        L3d:
            java.lang.String r3 = r4.c
            java.lang.String r5 = ":"
            boolean r3 = r3.contains(r5)
            if (r3 == 0) goto L48
            goto L56
        L48:
            java.lang.String r3 = r4.c
            java.lang.String r5 = "/"
            boolean r3 = r3.contains(r5)
            if (r3 == 0) goto L53
            goto L56
        L53:
            r6.add(r4)
        L56:
            int r2 = r2 + 1
            goto L14
        L59:
            return r6
    }

    public static java.util.List<android.app.ActivityManager.RunningAppProcessInfo> b(android.content.Context r6) {
            r6 = 0
            java.util.List r0 = a()     // Catch: java.lang.Throwable -> L2c
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2c
            r1.<init>()     // Catch: java.lang.Throwable -> L2c
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2c
        Le:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L2c
            com.tendcloud.tenddata.f r2 = (com.tendcloud.tenddata.f) r2     // Catch: java.lang.Throwable -> L2c
            android.app.ActivityManager$RunningAppProcessInfo r3 = new android.app.ActivityManager$RunningAppProcessInfo     // Catch: java.lang.Throwable -> L2c
            java.lang.String r4 = r2.c     // Catch: java.lang.Throwable -> L2c
            int r5 = r2.d     // Catch: java.lang.Throwable -> L2c
            r3.<init>(r4, r5, r6)     // Catch: java.lang.Throwable -> L2c
            int r2 = r2.b     // Catch: java.lang.Throwable -> L2c
            r3.uid = r2     // Catch: java.lang.Throwable -> L2c
            r1.add(r3)     // Catch: java.lang.Throwable -> L2c
            goto Le
        L2b:
            return r1
        L2c:
            return r6
    }

    public static boolean b() {
            java.util.List r0 = a()     // Catch: java.lang.Throwable -> L22
            int r1 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L22
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L22
        Lc:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L22
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L22
            com.tendcloud.tenddata.f r2 = (com.tendcloud.tenddata.f) r2     // Catch: java.lang.Throwable -> L22
            int r3 = r2.d     // Catch: java.lang.Throwable -> L22
            if (r3 != r1) goto Lc
            boolean r2 = r2.a     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto Lc
            r0 = 1
            return r0
        L22:
            r0 = 0
            return r0
    }
}
