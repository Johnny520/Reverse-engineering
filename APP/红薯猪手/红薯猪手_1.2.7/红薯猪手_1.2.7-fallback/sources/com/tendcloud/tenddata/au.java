package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
final class au {
    private static final int a = 128;
    private static final int b = 10000;
    private static final java.lang.String c = "iv";
    private static final java.lang.String d = "salt";
    private static final int e = 16;
    private static final int f = 32;
    private static final java.lang.String g = "AES/CBC/PKCS5Padding";
    private static final java.lang.String h = "PBKDF2WithHmacSHA1";
    private static final java.lang.String i = "AES";

    public au() {
            r0 = this;
            r0.<init>()
            return
    }

    public static javax.crypto.SecretKey a(char[] r4, byte[] r5) {
            java.lang.String r0 = "PBKDF2WithHmacSHA1"
            javax.crypto.SecretKeyFactory r0 = javax.crypto.SecretKeyFactory.getInstance(r0)
            javax.crypto.spec.PBEKeySpec r1 = new javax.crypto.spec.PBEKeySpec
            r2 = 10000(0x2710, float:1.4013E-41)
            r3 = 128(0x80, float:1.8E-43)
            r1.<init>(r4, r5, r2, r3)
            javax.crypto.SecretKey r4 = r0.generateSecret(r1)
            return r4
    }

    public static javax.crypto.spec.IvParameterSpec a() {
            java.lang.String r0 = "iv"
            com.tendcloud.tenddata.n$b r1 = com.tendcloud.tenddata.n.b.AES_IV_LOCK     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = r1.toString()     // Catch: java.lang.Throwable -> L27
            com.tendcloud.tenddata.n.getFileLock(r2)     // Catch: java.lang.Throwable -> L27
            r2 = 16
            byte[] r3 = com.tendcloud.tenddata.av.a(r0, r2)     // Catch: java.lang.Throwable -> L27
            if (r3 != 0) goto L1a
            byte[] r3 = a(r2)     // Catch: java.lang.Throwable -> L27
            com.tendcloud.tenddata.av.a(r0, r3)     // Catch: java.lang.Throwable -> L27
        L1a:
            javax.crypto.spec.IvParameterSpec r0 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Throwable -> L27
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L27
            java.lang.String r1 = r1.toString()
            com.tendcloud.tenddata.n.releaseFileLock(r1)
            goto L31
        L27:
            com.tendcloud.tenddata.n$b r0 = com.tendcloud.tenddata.n.b.AES_IV_LOCK
            java.lang.String r0 = r0.toString()
            com.tendcloud.tenddata.n.releaseFileLock(r0)
            r0 = 0
        L31:
            return r0
    }

    private static byte[] a(int r1) {
            byte[] r1 = new byte[r1]
            java.security.SecureRandom r0 = com.tendcloud.tenddata.y.b()
            r0.nextBytes(r1)
            return r1
    }

    public static byte[] a(byte[] r2, javax.crypto.SecretKey r3, javax.crypto.spec.IvParameterSpec r4) {
            r0 = 19
            boolean r0 = com.tendcloud.tenddata.y.b(r0)
            if (r0 == 0) goto Lb
            java.lang.String r0 = "AES"
            goto Ld
        Lb:
            java.lang.String r0 = "AES/CBC/PKCS5Padding"
        Ld:
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)
            r1 = 1
            r0.init(r1, r3, r4)
            byte[] r2 = r0.doFinal(r2)
            return r2
    }

    public static byte[] b() {
            java.lang.String r0 = "salt"
            r1 = 0
            com.tendcloud.tenddata.n$b r2 = com.tendcloud.tenddata.n.b.AES_SALT_LOCK     // Catch: java.lang.Throwable -> L23
            java.lang.String r3 = r2.toString()     // Catch: java.lang.Throwable -> L23
            com.tendcloud.tenddata.n.getFileLock(r3)     // Catch: java.lang.Throwable -> L23
            r3 = 32
            byte[] r1 = com.tendcloud.tenddata.av.a(r0, r3)     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L17
            int r4 = r1.length     // Catch: java.lang.Throwable -> L23
            if (r4 != 0) goto L1e
        L17:
            byte[] r1 = a(r3)     // Catch: java.lang.Throwable -> L23
            com.tendcloud.tenddata.av.a(r0, r1)     // Catch: java.lang.Throwable -> L23
        L1e:
            java.lang.String r0 = r2.toString()
            goto L29
        L23:
            com.tendcloud.tenddata.n$b r0 = com.tendcloud.tenddata.n.b.AES_SALT_LOCK
            java.lang.String r0 = r0.toString()
        L29:
            com.tendcloud.tenddata.n.releaseFileLock(r0)
            return r1
    }

    public static byte[] b(byte[] r2, javax.crypto.SecretKey r3, javax.crypto.spec.IvParameterSpec r4) {
            r0 = 19
            boolean r0 = com.tendcloud.tenddata.y.b(r0)
            if (r0 == 0) goto Lb
            java.lang.String r0 = "AES"
            goto Ld
        Lb:
            java.lang.String r0 = "AES/CBC/PKCS5Padding"
        Ld:
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)
            r1 = 2
            r0.init(r1, r3, r4)
            byte[] r2 = r0.doFinal(r2)
            return r2
    }
}
