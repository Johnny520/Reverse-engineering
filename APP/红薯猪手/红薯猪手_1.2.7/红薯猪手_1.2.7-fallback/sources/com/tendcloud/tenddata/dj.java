package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
class dj {

    public static class a {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        public static java.lang.String encode(byte[] r4) {
                r0 = 16
                char[] r0 = new char[r0]
                r0 = {x0030: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                int r2 = r4.length
                int r2 = r2 * 2
                r1.<init>(r2)
                r2 = 0
            L10:
                int r3 = r4.length
                if (r2 >= r3) goto L2a
                r3 = r4[r2]
                r3 = r3 & 240(0xf0, float:3.36E-43)
                int r3 = r3 >> 4
                char r3 = r0[r3]
                r1.append(r3)
                r3 = r4[r2]
                r3 = r3 & 15
                char r3 = r0[r3]
                r1.append(r3)
                int r2 = r2 + 1
                goto L10
            L2a:
                java.lang.String r4 = r1.toString()
                return r4
        }
    }

    public dj() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r2) {
            java.lang.String r0 = r2.getPackageName()
            java.lang.String r2 = a(r2, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            return r2
    }

    public static java.lang.String a(android.content.Context r3, java.lang.String r4) {
            r0 = 0
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: java.lang.Throwable -> L29
            r1 = 64
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r4, r1)     // Catch: java.lang.Throwable -> L29
            android.content.pm.Signature[] r3 = r3.signatures     // Catch: java.lang.Throwable -> L29
            java.lang.String r4 = "X.509"
            java.security.cert.CertificateFactory r4 = java.security.cert.CertificateFactory.getInstance(r4)     // Catch: java.lang.Throwable -> L29
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L29
            r3 = r3[r0]     // Catch: java.lang.Throwable -> L29
            byte[] r3 = r3.toByteArray()     // Catch: java.lang.Throwable -> L29
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L29
            java.security.cert.Certificate r3 = r4.generateCertificate(r1)     // Catch: java.lang.Throwable -> L29
            java.security.cert.X509Certificate r3 = (java.security.cert.X509Certificate) r3     // Catch: java.lang.Throwable -> L29
            java.lang.String r3 = a(r3)     // Catch: java.lang.Throwable -> L29
            goto L2b
        L29:
            java.lang.String r3 = ""
        L2b:
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
        L30:
            int r1 = r3.length()
            if (r0 >= r1) goto L53
            char r1 = r3.charAt(r0)
            r4.append(r1)
            if (r0 <= 0) goto L50
            int r1 = r0 % 2
            r2 = 1
            if (r1 != r2) goto L50
            int r1 = r3.length()
            int r1 = r1 - r2
            if (r0 >= r1) goto L50
            java.lang.String r1 = ":"
            r4.append(r1)
        L50:
            int r0 = r0 + 1
            goto L30
        L53:
            java.lang.String r3 = r4.toString()
            return r3
    }

    public static java.lang.String a(java.security.cert.X509Certificate r0) {
            byte[] r0 = r0.getEncoded()     // Catch: java.security.cert.CertificateEncodingException -> Ld
            byte[] r0 = a(r0)     // Catch: java.security.cert.CertificateEncodingException -> Ld
            java.lang.String r0 = com.tendcloud.tenddata.dj.a.encode(r0)     // Catch: java.security.cert.CertificateEncodingException -> Ld
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public static byte[] a(byte[] r2) {
            r0 = 0
            byte[] r0 = new byte[r0]
            java.lang.String r1 = "SHA1"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.security.NoSuchAlgorithmException -> Ld
            byte[] r0 = r1.digest(r2)     // Catch: java.security.NoSuchAlgorithmException -> Ld
        Ld:
            return r0
    }
}
