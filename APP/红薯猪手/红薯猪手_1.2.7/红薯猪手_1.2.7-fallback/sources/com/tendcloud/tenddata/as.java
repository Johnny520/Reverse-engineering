package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public final class as {
    private static byte[] a;
    private static volatile int b;
    private static volatile javax.crypto.spec.IvParameterSpec c;
    private static volatile byte[] d;
    private static volatile javax.crypto.SecretKey e;

    static {
            r0 = 0
            byte[] r0 = new byte[r0]
            com.tendcloud.tenddata.as.a = r0
            java.lang.Class<android.util.EventLogTags> r0 = android.util.EventLogTags.class
            monitor-enter(r0)
            int r1 = com.tendcloud.tenddata.as.b     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto L12
            int r1 = com.tendcloud.tenddata.aw.a()     // Catch: java.lang.Throwable -> L3c
            com.tendcloud.tenddata.as.b = r1     // Catch: java.lang.Throwable -> L3c
        L12:
            javax.crypto.spec.IvParameterSpec r1 = com.tendcloud.tenddata.as.c     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto L1c
            javax.crypto.spec.IvParameterSpec r1 = com.tendcloud.tenddata.au.a()     // Catch: java.lang.Throwable -> L3c
            com.tendcloud.tenddata.as.c = r1     // Catch: java.lang.Throwable -> L3c
        L1c:
            byte[] r1 = com.tendcloud.tenddata.as.d     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto L26
            byte[] r1 = com.tendcloud.tenddata.au.b()     // Catch: java.lang.Throwable -> L3c
            com.tendcloud.tenddata.as.d = r1     // Catch: java.lang.Throwable -> L3c
        L26:
            javax.crypto.SecretKey r1 = com.tendcloud.tenddata.as.e     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto L3c
            int r1 = com.tendcloud.tenddata.as.b     // Catch: java.lang.Throwable -> L3c
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> L3c
            char[] r1 = r1.toCharArray()     // Catch: java.lang.Throwable -> L3c
            byte[] r2 = com.tendcloud.tenddata.as.d     // Catch: java.lang.Throwable -> L3c
            javax.crypto.SecretKey r1 = com.tendcloud.tenddata.au.a(r1, r2)     // Catch: java.lang.Throwable -> L3c
            com.tendcloud.tenddata.as.e = r1     // Catch: java.lang.Throwable -> L3c
        L3c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return
        L3e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r1
    }

    private as() {
            r0 = this;
            r0.<init>()
            return
    }

    public static byte[] a(byte[] r2) {
            javax.crypto.SecretKey r0 = com.tendcloud.tenddata.as.e     // Catch: java.lang.Throwable -> L9
            javax.crypto.spec.IvParameterSpec r1 = com.tendcloud.tenddata.as.c     // Catch: java.lang.Throwable -> L9
            byte[] r2 = com.tendcloud.tenddata.au.a(r2, r0, r1)     // Catch: java.lang.Throwable -> L9
            return r2
        L9:
            byte[] r2 = com.tendcloud.tenddata.as.a
            return r2
    }

    public static byte[] b(byte[] r2) {
            javax.crypto.SecretKey r0 = com.tendcloud.tenddata.as.e     // Catch: java.lang.Throwable -> L9
            javax.crypto.spec.IvParameterSpec r1 = com.tendcloud.tenddata.as.c     // Catch: java.lang.Throwable -> L9
            byte[] r2 = com.tendcloud.tenddata.au.b(r2, r0, r1)     // Catch: java.lang.Throwable -> L9
            return r2
        L9:
            byte[] r2 = com.tendcloud.tenddata.as.a
            return r2
    }
}
