package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class bo {
    private static java.util.List<java.lang.String> a;
    private static android.os.Handler b;
    private static android.os.HandlerThread c;


    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.tendcloud.tenddata.bo.a = r0
            android.os.HandlerThread r0 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> L22
            java.lang.String r1 = "excHandlerThread"
            r2 = 10
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L22
            com.tendcloud.tenddata.bo.c = r0     // Catch: java.lang.Throwable -> L22
            r0.start()     // Catch: java.lang.Throwable -> L22
            android.os.Handler r0 = new android.os.Handler     // Catch: java.lang.Throwable -> L22
            android.os.HandlerThread r1 = com.tendcloud.tenddata.bo.c     // Catch: java.lang.Throwable -> L22
            android.os.Looper r1 = r1.getLooper()     // Catch: java.lang.Throwable -> L22
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L22
            com.tendcloud.tenddata.bo.b = r0     // Catch: java.lang.Throwable -> L22
        L22:
            return
    }

    public bo() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final java.lang.String a(java.lang.Throwable r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r6.toString()
            r0.append(r1)
            java.lang.String r1 = "\r\n"
            r0.append(r1)
            java.lang.StackTraceElement[] r2 = r6.getStackTrace()     // Catch: java.lang.Throwable -> L39
            int r3 = r2.length     // Catch: java.lang.Throwable -> L39
            r4 = 50
            if (r3 <= r4) goto L1b
            goto L1c
        L1b:
            int r4 = r2.length     // Catch: java.lang.Throwable -> L39
        L1c:
            r3 = 0
        L1d:
            if (r3 >= r4) goto L2f
            java.lang.String r5 = "\t"
            r0.append(r5)     // Catch: java.lang.Throwable -> L39
            r5 = r2[r3]     // Catch: java.lang.Throwable -> L39
            r0.append(r5)     // Catch: java.lang.Throwable -> L39
            r0.append(r1)     // Catch: java.lang.Throwable -> L39
            int r3 = r3 + 1
            goto L1d
        L2f:
            java.lang.Throwable r6 = r6.getCause()     // Catch: java.lang.Throwable -> L39
            if (r6 == 0) goto L39
            r1 = 1
            a(r0, r2, r6, r1)     // Catch: java.lang.Throwable -> L39
        L39:
            java.lang.String r6 = r0.toString()
            return r6
    }

    public static void a(java.lang.String r2, boolean r3, java.util.Map<java.lang.String, java.lang.Object> r4) {
            android.os.Handler r0 = com.tendcloud.tenddata.bo.b     // Catch: java.lang.Throwable -> La
            com.tendcloud.tenddata.bo$1 r1 = new com.tendcloud.tenddata.bo$1     // Catch: java.lang.Throwable -> La
            r1.<init>(r4, r3, r2)     // Catch: java.lang.Throwable -> La
            r0.post(r1)     // Catch: java.lang.Throwable -> La
        La:
            return
    }

    private static final void a(java.lang.StringBuilder r6, java.lang.StackTraceElement[] r7, java.lang.Throwable r8, int r9) {
            java.lang.String r0 = "\r\n"
            java.lang.StackTraceElement[] r1 = r8.getStackTrace()     // Catch: java.lang.Throwable -> L51
            int r2 = r1.length     // Catch: java.lang.Throwable -> L51
            int r2 = r2 + (-1)
            int r3 = r7.length     // Catch: java.lang.Throwable -> L51
            int r3 = r3 + (-1)
        Lc:
            if (r2 < 0) goto L1f
            if (r3 < 0) goto L1f
            r4 = r1[r2]     // Catch: java.lang.Throwable -> L51
            r5 = r7[r3]     // Catch: java.lang.Throwable -> L51
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L51
            if (r4 == 0) goto L1f
            int r2 = r2 + (-1)
            int r3 = r3 + (-1)
            goto Lc
        L1f:
            r7 = 50
            if (r2 <= r7) goto L24
            r2 = r7
        L24:
            java.lang.String r7 = "Caused by : "
            r6.append(r7)     // Catch: java.lang.Throwable -> L51
            r6.append(r8)     // Catch: java.lang.Throwable -> L51
            r6.append(r0)     // Catch: java.lang.Throwable -> L51
            r7 = 0
        L30:
            if (r7 > r2) goto L42
            java.lang.String r3 = "\t"
            r6.append(r3)     // Catch: java.lang.Throwable -> L51
            r3 = r1[r7]     // Catch: java.lang.Throwable -> L51
            r6.append(r3)     // Catch: java.lang.Throwable -> L51
            r6.append(r0)     // Catch: java.lang.Throwable -> L51
            int r7 = r7 + 1
            goto L30
        L42:
            r7 = 5
            if (r9 < r7) goto L46
            return
        L46:
            java.lang.Throwable r7 = r8.getCause()     // Catch: java.lang.Throwable -> L51
            if (r7 == 0) goto L51
            int r9 = r9 + 1
            a(r6, r1, r8, r9)     // Catch: java.lang.Throwable -> L51
        L51:
            return
    }

    public static /* synthetic */ boolean a(boolean r0, java.lang.String r1, java.lang.String r2) {
            boolean r0 = b(r0, r1, r2)
            return r0
    }

    private static boolean b(boolean r2, java.lang.String r3, java.lang.String r4) {
            r0 = 0
            if (r2 == 0) goto L12
            boolean r1 = com.tendcloud.tenddata.y.b(r4)
            if (r1 != 0) goto L12
            java.lang.String r1 = "me.cpatrk.net"
            boolean r4 = r4.contains(r1)
            if (r4 == 0) goto L12
            return r0
        L12:
            if (r2 != 0) goto L1d
            java.lang.String r2 = "api/q/a"
            boolean r2 = r3.contains(r2)
            if (r2 == 0) goto L1d
            return r0
        L1d:
            r2 = 1
            return r2
    }
}
