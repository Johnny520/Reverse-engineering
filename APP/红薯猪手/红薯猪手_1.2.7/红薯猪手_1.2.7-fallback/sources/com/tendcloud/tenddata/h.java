package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class h {
    public static boolean a = true;

    public h() {
            r0 = this;
            r0.<init>()
            return
    }

    private static synchronized java.lang.String a() {
            java.lang.Class<com.tendcloud.tenddata.h> r0 = com.tendcloud.tenddata.h.class
            monitor-enter(r0)
            java.lang.Exception r1 = new java.lang.Exception     // Catch: java.lang.Throwable -> L1c
            r1.<init>()     // Catch: java.lang.Throwable -> L1c
            java.lang.StackTraceElement[] r1 = r1.getStackTrace()     // Catch: java.lang.Throwable -> L1c
            r2 = 4
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = r1.getClassName()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = "."
            r1.lastIndexOf(r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = "TDLog"
            monitor-exit(r0)
            return r1
        L1c:
            java.lang.String r1 = "TDLog"
            monitor-exit(r0)
            return r1
        L20:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    private static void a(java.lang.String r6, int r7) {
            if (r6 != 0) goto L3
            return
        L3:
            int r0 = r6.length()     // Catch: java.lang.Throwable -> L27
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            r3 = r2
        Lb:
            r4 = 100
            if (r2 >= r4) goto L27
            if (r0 <= r1) goto L20
            java.lang.String r3 = r6.substring(r3, r1)     // Catch: java.lang.Throwable -> L27
            b(r3, r7)     // Catch: java.lang.Throwable -> L27
            int r3 = r1 + 2000
            int r2 = r2 + 1
            r5 = r3
            r3 = r1
            r1 = r5
            goto Lb
        L20:
            java.lang.String r6 = r6.substring(r3, r0)     // Catch: java.lang.Throwable -> L27
            b(r6, r7)     // Catch: java.lang.Throwable -> L27
        L27:
            return
    }

    public static void a(java.lang.String r0, java.lang.Throwable r1) {
            boolean r1 = com.tendcloud.tenddata.h.a
            if (r1 == 0) goto L8
            r1 = 4
            a(r0, r1)
        L8:
            return
    }

    private static void b(java.lang.String r0, int r1) {
            a()
            return
    }

    public static void dForDeveloper(java.lang.String r1) {
            boolean r0 = com.tendcloud.tenddata.h.a
            if (r0 == 0) goto L8
            r0 = 3
            a(r1, r0)
        L8:
            return
    }

    public static void dForInternal(java.lang.String... r0) {
            return
    }

    public static void eForDeveloper(java.lang.String r1) {
            boolean r0 = com.tendcloud.tenddata.h.a
            if (r0 == 0) goto L8
            r0 = 6
            a(r1, r0)
        L8:
            return
    }

    public static void eForInternal(java.lang.Throwable r0) {
            return
    }

    public static void eForInternal(java.lang.String... r0) {
            return
    }

    public static void iForDeveloper(java.lang.String r1) {
            boolean r0 = com.tendcloud.tenddata.h.a
            if (r0 == 0) goto L8
            r0 = 4
            a(r1, r0)
        L8:
            return
    }

    public static void iForInternal(java.lang.String... r0) {
            return
    }

    public static void json(java.lang.String r0) {
            return
    }
}
