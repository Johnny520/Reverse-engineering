package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public final class ah {
    public static volatile java.util.HashMap<java.lang.Long, java.lang.String> a = null;
    private static final java.util.regex.Pattern b = null;
    private static final int c = 2;
    private static final int d = 7;


    public static class a implements javax.net.ssl.X509TrustManager {
        public java.security.cert.X509Certificate cert;

        public a(java.security.cert.X509Certificate r1) {
                r0 = this;
                r0.<init>()
                r0.cert = r1
                return
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(java.security.cert.X509Certificate[] r1, java.lang.String r2) {
                r0 = this;
                return
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(java.security.cert.X509Certificate[] r5, java.lang.String r6) {
                r4 = this;
                int r6 = r5.length
                r6 = 0
                r0 = r5[r6]
                java.security.Principal r0 = r0.getIssuerDN()
                java.security.cert.X509Certificate r1 = r4.cert
                java.security.Principal r1 = r1.getSubjectDN()
                r0.equals(r1)
                r0 = r5[r6]     // Catch: java.lang.Throwable -> Lab
                java.security.Principal r0 = r0.getSubjectDN()     // Catch: java.lang.Throwable -> Lab
                java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> Lab
                java.lang.String r1 = "CN="
                int r1 = r0.indexOf(r1)     // Catch: java.lang.Throwable -> Lab
                if (r1 < 0) goto L35
                int r1 = r1 + 3
                java.lang.String r0 = r0.substring(r1)     // Catch: java.lang.Throwable -> Lab
                java.lang.String r1 = ","
                int r1 = r0.indexOf(r1)     // Catch: java.lang.Throwable -> Lab
                if (r1 < 0) goto L35
                java.lang.String r0 = r0.substring(r6, r1)     // Catch: java.lang.Throwable -> Lab
            L35:
                java.lang.String r1 = "\\."
                java.lang.String[] r1 = r0.split(r1)     // Catch: java.lang.Throwable -> Lab
                int r2 = r1.length     // Catch: java.lang.Throwable -> Lab
                r3 = 2
                if (r2 < r3) goto L5c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lab
                r0.<init>()     // Catch: java.lang.Throwable -> Lab
                int r2 = r1.length     // Catch: java.lang.Throwable -> Lab
                int r2 = r2 - r3
                r2 = r1[r2]     // Catch: java.lang.Throwable -> Lab
                r0.append(r2)     // Catch: java.lang.Throwable -> Lab
                java.lang.String r2 = "."
                r0.append(r2)     // Catch: java.lang.Throwable -> Lab
                int r2 = r1.length     // Catch: java.lang.Throwable -> Lab
                int r2 = r2 + (-1)
                r1 = r1[r2]     // Catch: java.lang.Throwable -> Lab
                r0.append(r1)     // Catch: java.lang.Throwable -> Lab
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lab
            L5c:
                java.util.HashMap<java.lang.Long, java.lang.String> r1 = com.tendcloud.tenddata.ah.a     // Catch: java.lang.Throwable -> Lab
                java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> Lab
                long r2 = r2.getId()     // Catch: java.lang.Throwable -> Lab
                java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> Lab
                boolean r1 = r1.containsKey(r2)     // Catch: java.lang.Throwable -> Lab
                if (r1 == 0) goto La3
                java.util.HashMap<java.lang.Long, java.lang.String> r1 = com.tendcloud.tenddata.ah.a     // Catch: java.lang.Throwable -> Lab
                java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> Lab
                long r2 = r2.getId()     // Catch: java.lang.Throwable -> Lab
                java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> Lab
                java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> Lab
                java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Lab
                boolean r0 = r1.endsWith(r0)     // Catch: java.lang.Throwable -> Lab
                if (r0 == 0) goto L9b
                r0 = r5[r6]     // Catch: java.lang.Throwable -> Lab
                java.security.cert.X509Certificate r1 = r4.cert     // Catch: java.lang.Throwable -> Lab
                java.security.PublicKey r1 = r1.getPublicKey()     // Catch: java.lang.Throwable -> Lab
                r0.verify(r1)     // Catch: java.lang.Throwable -> Lab
                r5 = r5[r6]     // Catch: java.lang.Throwable -> Lab
                r5.checkValidity()     // Catch: java.lang.Throwable -> Lab
                goto Lae
            L9b:
                java.security.cert.CertificateException r5 = new java.security.cert.CertificateException     // Catch: java.lang.Throwable -> Lab
                java.lang.String r6 = "Server certificate has incorrect host name!"
                r5.<init>(r6)     // Catch: java.lang.Throwable -> Lab
                throw r5     // Catch: java.lang.Throwable -> Lab
            La3:
                java.security.cert.CertificateException r5 = new java.security.cert.CertificateException     // Catch: java.lang.Throwable -> Lab
                java.lang.String r6 = "No valid host provided!"
                r5.<init>(r6)     // Catch: java.lang.Throwable -> Lab
                throw r5     // Catch: java.lang.Throwable -> Lab
            Lab:
                r5 = move-exception
                boolean r5 = r5 instanceof java.security.cert.CertificateException
            Lae:
                return
        }

        @Override // javax.net.ssl.X509TrustManager
        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.tendcloud.tenddata.ah.a = r0
            java.lang.String r0 = "([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.tendcloud.tenddata.ah.b = r0
            return
    }

    public ah() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.security.cert.X509Certificate a(java.lang.String r2) {
            boolean r0 = com.tendcloud.tenddata.y.b(r2)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            byte[] r2 = r2.getBytes()
            r0.<init>(r2)
            java.lang.String r2 = "X.509"
            java.security.cert.CertificateFactory r2 = java.security.cert.CertificateFactory.getInstance(r2)     // Catch: java.lang.Throwable -> L22
            java.security.cert.Certificate r2 = r2.generateCertificate(r0)     // Catch: java.lang.Throwable -> L22
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2     // Catch: java.lang.Throwable -> L22
            r0.close()     // Catch: java.lang.Throwable -> L20
        L20:
            r1 = r2
            goto L25
        L22:
            r0.close()     // Catch: java.lang.Throwable -> L25
        L25:
            return r1
    }

    private static java.util.List<java.lang.String> a(java.security.cert.X509Certificate r4, int r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r4 = r4.getSubjectAlternativeNames()     // Catch: java.lang.Throwable -> L48
            if (r4 != 0) goto L10
            java.util.List r4 = java.util.Collections.emptyList()     // Catch: java.lang.Throwable -> L48
            return r4
        L10:
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L48
        L14:
            boolean r1 = r4.hasNext()     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L47
            java.lang.Object r1 = r4.next()     // Catch: java.lang.Throwable -> L48
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L14
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L48
            r3 = 2
            if (r2 >= r3) goto L2a
            goto L14
        L2a:
            r2 = 0
            java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Throwable -> L48
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L48
            if (r2 != 0) goto L34
            goto L14
        L34:
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L48
            if (r2 != r5) goto L14
            r2 = 1
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L48
            if (r1 == 0) goto L14
            r0.add(r1)     // Catch: java.lang.Throwable -> L48
            goto L14
        L47:
            return r0
        L48:
            java.util.List r4 = java.util.Collections.emptyList()
            return r4
    }

    public static javax.net.ssl.SSLSocketFactory a(java.security.cert.X509Certificate r4) {
            r0 = 0
            java.lang.String r1 = "TLS"
            javax.net.ssl.SSLContext r1 = javax.net.ssl.SSLContext.getInstance(r1)     // Catch: java.lang.Throwable -> L20
            if (r4 == 0) goto L18
            com.tendcloud.tenddata.ah$a r2 = new com.tendcloud.tenddata.ah$a     // Catch: java.lang.Throwable -> L20
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L20
            r4 = 1
            javax.net.ssl.TrustManager[] r4 = new javax.net.ssl.TrustManager[r4]     // Catch: java.lang.Throwable -> L20
            r3 = 0
            r4[r3] = r2     // Catch: java.lang.Throwable -> L20
            r1.init(r0, r4, r0)     // Catch: java.lang.Throwable -> L20
            goto L1b
        L18:
            r1.init(r0, r0, r0)     // Catch: java.lang.Throwable -> L20
        L1b:
            javax.net.ssl.SSLSocketFactory r4 = r1.getSocketFactory()     // Catch: java.lang.Throwable -> L20
            return r4
        L20:
            return r0
    }

    public static void a(java.net.URLConnection r3, java.lang.String r4) {
            javax.net.ssl.HttpsURLConnection r3 = (javax.net.ssl.HttpsURLConnection) r3     // Catch: java.lang.Throwable -> L34
            r0 = 16
            boolean r0 = com.tendcloud.tenddata.y.a(r0)     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L11
            java.lang.String r0 = "TLSv1.2"
        Lc:
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0)     // Catch: java.lang.Throwable -> L34
            goto L14
        L11:
            java.lang.String r0 = "TLSv1"
            goto Lc
        L14:
            com.tendcloud.tenddata.ah$a r1 = new com.tendcloud.tenddata.ah$a     // Catch: java.lang.Throwable -> L34
            java.security.cert.X509Certificate r4 = a(r4)     // Catch: java.lang.Throwable -> L34
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L34
            r4 = 1
            javax.net.ssl.TrustManager[] r4 = new javax.net.ssl.TrustManager[r4]     // Catch: java.lang.Throwable -> L34
            r2 = 0
            r4[r2] = r1     // Catch: java.lang.Throwable -> L34
            r1 = 0
            r0.init(r1, r4, r1)     // Catch: java.lang.Throwable -> L34
            r3.getHostnameVerifier()     // Catch: java.lang.Throwable -> L34
            javax.net.ssl.SSLSocketFactory r4 = r0.getSocketFactory()     // Catch: java.lang.Throwable -> L34
            r3.setSSLSocketFactory(r4)     // Catch: java.lang.Throwable -> L34
            a(r3)     // Catch: java.lang.Throwable -> L34
        L34:
            return
    }

    private static void a(javax.net.ssl.HttpsURLConnection r0) {
            return
    }

    private static boolean a(java.lang.String r7, java.lang.String r8) {
            r0 = 0
            if (r7 == 0) goto Lb4
            int r1 = r7.length()
            if (r1 == 0) goto Lb4
            java.lang.String r1 = "."
            boolean r2 = r7.startsWith(r1)
            if (r2 != 0) goto Lb4
            java.lang.String r2 = ".."
            boolean r3 = r7.endsWith(r2)
            if (r3 == 0) goto L1b
            goto Lb4
        L1b:
            if (r8 == 0) goto Lb4
            int r3 = r8.length()
            if (r3 == 0) goto Lb4
            boolean r3 = r8.startsWith(r1)
            if (r3 != 0) goto Lb4
            boolean r2 = r8.endsWith(r2)
            if (r2 == 0) goto L31
            goto Lb4
        L31:
            boolean r2 = r7.endsWith(r1)
            r3 = 46
            if (r2 != 0) goto L48
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r7)
            r2.append(r3)
            java.lang.String r7 = r2.toString()
        L48:
            boolean r1 = r8.endsWith(r1)
            if (r1 != 0) goto L5d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            r1.append(r3)
            java.lang.String r8 = r1.toString()
        L5d:
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r8 = r8.toLowerCase(r1)
            java.lang.String r1 = "*"
            boolean r1 = r8.contains(r1)
            if (r1 != 0) goto L70
            boolean r7 = r7.equals(r8)
            return r7
        L70:
            java.lang.String r1 = "*."
            boolean r2 = r8.startsWith(r1)
            if (r2 == 0) goto Lb4
            r2 = 42
            r4 = 1
            int r2 = r8.indexOf(r2, r4)
            r5 = -1
            if (r2 == r5) goto L83
            goto Lb4
        L83:
            int r2 = r7.length()
            int r6 = r8.length()
            if (r2 >= r6) goto L8e
            return r0
        L8e:
            boolean r1 = r1.equals(r8)
            if (r1 == 0) goto L95
            return r0
        L95:
            java.lang.String r8 = r8.substring(r4)
            boolean r1 = r7.endsWith(r8)
            if (r1 != 0) goto La0
            return r0
        La0:
            int r1 = r7.length()
            int r8 = r8.length()
            int r1 = r1 - r8
            if (r1 <= 0) goto Lb3
            int r1 = r1 - r4
            int r7 = r7.lastIndexOf(r3, r1)
            if (r7 == r5) goto Lb3
            return r0
        Lb3:
            return r4
        Lb4:
            return r0
    }

    private static boolean a(java.lang.String r1, java.security.cert.X509Certificate r2) {
            boolean r0 = b(r1)
            if (r0 == 0) goto Lb
            boolean r1 = b(r1, r2)
            goto Lf
        Lb:
            boolean r1 = c(r1, r2)
        Lf:
            return r1
    }

    public static /* synthetic */ boolean a(java.lang.String r0, javax.net.ssl.SSLSession r1) {
            boolean r0 = b(r0, r1)
            return r0
    }

    private static boolean b(java.lang.String r1) {
            java.util.regex.Pattern r0 = com.tendcloud.tenddata.ah.b
            java.util.regex.Matcher r1 = r0.matcher(r1)
            boolean r1 = r1.matches()
            return r1
    }

    private static boolean b(java.lang.String r4, java.security.cert.X509Certificate r5) {
            r0 = 7
            java.util.List r5 = a(r5, r0)
            int r0 = r5.size()
            r1 = 0
            r2 = r1
        Lb:
            if (r2 >= r0) goto L1e
            java.lang.Object r3 = r5.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r4.equalsIgnoreCase(r3)
            if (r3 == 0) goto L1b
            r4 = 1
            return r4
        L1b:
            int r2 = r2 + 1
            goto Lb
        L1e:
            return r1
    }

    private static boolean b(java.lang.String r1, javax.net.ssl.SSLSession r2) {
            r0 = 0
            java.security.cert.Certificate[] r2 = r2.getPeerCertificates()     // Catch: java.lang.Throwable -> Le
            r2 = r2[r0]     // Catch: java.lang.Throwable -> Le
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2     // Catch: java.lang.Throwable -> Le
            boolean r1 = a(r1, r2)     // Catch: java.lang.Throwable -> Le
            return r1
        Le:
            return r0
    }

    private static boolean c(java.lang.String r4, java.security.cert.X509Certificate r5) {
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r0)
            r0 = 2
            java.util.List r5 = a(r5, r0)
            int r0 = r5.size()
            r1 = 0
            r2 = r1
        L11:
            if (r2 >= r0) goto L24
            java.lang.Object r3 = r5.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = a(r4, r3)
            if (r3 == 0) goto L21
            r4 = 1
            return r4
        L21:
            int r2 = r2 + 1
            goto L11
        L24:
            return r1
    }

    public static void setHostNameVerifyAllowAll(java.net.URLConnection r1) {
            javax.net.ssl.HttpsURLConnection r1 = (javax.net.ssl.HttpsURLConnection) r1
            com.tendcloud.tenddata.ah$1 r0 = new com.tendcloud.tenddata.ah$1
            r0.<init>(r1)
            r1.setHostnameVerifier(r0)
            return
    }
}
